package com.huaweicloud.sdk.hss.v5;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.hss.v5.model.AddAppWhitelistPolicyHostRequest;
import com.huaweicloud.sdk.hss.v5.model.AddAppWhitelistPolicyHostRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.AddAppWhitelistPolicyHostResponse;
import com.huaweicloud.sdk.hss.v5.model.AddAppWhitelistPolicyProcessRequest;
import com.huaweicloud.sdk.hss.v5.model.AddAppWhitelistPolicyProcessRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.AddAppWhitelistPolicyProcessResponse;
import com.huaweicloud.sdk.hss.v5.model.AddBaselineWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.AddBaselineWhiteListRequestBody;
import com.huaweicloud.sdk.hss.v5.model.AddBaselineWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.AddCceIntegrationProtectionRequest;
import com.huaweicloud.sdk.hss.v5.model.AddCceIntegrationProtectionResponse;
import com.huaweicloud.sdk.hss.v5.model.AddHostsGroupRequest;
import com.huaweicloud.sdk.hss.v5.model.AddHostsGroupRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.AddHostsGroupResponse;
import com.huaweicloud.sdk.hss.v5.model.AddLoginWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.AddLoginWhiteListRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.AddLoginWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.AddPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.AddPolicyRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.AddPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.AddProtectionPolicyInfoRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.AddProtectionPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.AddProtectionPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.AddSystemUserWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.AddSystemUserWhiteListRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.AddSystemUserWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.AssociatePolicyGroupRequest;
import com.huaweicloud.sdk.hss.v5.model.AssociatePolicyGroupRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.AssociatePolicyGroupResponse;
import com.huaweicloud.sdk.hss.v5.model.BatchAddAccountsRequest;
import com.huaweicloud.sdk.hss.v5.model.BatchAddAccountsRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.BatchAddAccountsResponse;
import com.huaweicloud.sdk.hss.v5.model.BatchCreateTagsRequest;
import com.huaweicloud.sdk.hss.v5.model.BatchCreateTagsRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.BatchCreateTagsResponse;
import com.huaweicloud.sdk.hss.v5.model.BatchDeleteAgentDaemonsetRequest;
import com.huaweicloud.sdk.hss.v5.model.BatchDeleteAgentDaemonsetResponse;
import com.huaweicloud.sdk.hss.v5.model.BatchDeleteDaemonsetRequestBody;
import com.huaweicloud.sdk.hss.v5.model.BatchScanPrivateImageRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.BatchScanSwrImageRequest;
import com.huaweicloud.sdk.hss.v5.model.BatchScanSwrImageResponse;
import com.huaweicloud.sdk.hss.v5.model.BatchStartProtectionRequest;
import com.huaweicloud.sdk.hss.v5.model.BatchStartProtectionRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.BatchStartProtectionResponse;
import com.huaweicloud.sdk.hss.v5.model.BatchStartWebTamperProtectionRequest;
import com.huaweicloud.sdk.hss.v5.model.BatchStartWebTamperProtectionRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.BatchStartWebTamperProtectionResponse;
import com.huaweicloud.sdk.hss.v5.model.BatchUpdateDaemonsetRequestBody;
import com.huaweicloud.sdk.hss.v5.model.BatchUpgradeAgentDaemonsetRequest;
import com.huaweicloud.sdk.hss.v5.model.BatchUpgradeAgentDaemonsetResponse;
import com.huaweicloud.sdk.hss.v5.model.CCEClusterIdListRequestBody;
import com.huaweicloud.sdk.hss.v5.model.CCEClusterInfoListRequestBody;
import com.huaweicloud.sdk.hss.v5.model.CceIntegrationProtectionRequestBody;
import com.huaweicloud.sdk.hss.v5.model.ChangeAntivirusPayPerScanStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeAntivirusPayPerScanStatusRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.ChangeAntivirusPayPerScanStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeAntivirusPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeAntivirusPolicyRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.ChangeAntivirusPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeAppWhitelistPolicyProcessStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeAppWhitelistPolicyProcessStatusRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.ChangeAppWhitelistPolicyProcessStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeAppWhitelistPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeAppWhitelistPolicyRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.ChangeAppWhitelistPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeBaselineWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeBaselineWhiteListRequestBody;
import com.huaweicloud.sdk.hss.v5.model.ChangeBaselineWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeBlockedIpRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeBlockedIpRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.ChangeBlockedIpResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeCheckRuleActionRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeCheckRuleActionResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeClusterEventsRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeClusterEventsResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeClusterProtectionPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeClusterProtectionPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeEventRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeEventRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.ChangeEventResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeHostsGroupRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeHostsGroupRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.ChangeHostsGroupResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeIsolatedFileRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeIsolatedFileRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.ChangeIsolatedFileResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangePasswordComplexityStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangePasswordComplexityStatusRequestBody;
import com.huaweicloud.sdk.hss.v5.model.ChangePasswordComplexityStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeVulScanPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeVulScanPolicyRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.ChangeVulScanPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeVulStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeVulStatusRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.ChangeVulStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.CheckRuleIdListRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.CloseProtectionInfoRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.CopyBaselinePolicyGroupRequest;
import com.huaweicloud.sdk.hss.v5.model.CopyBaselinePolicyGroupRequestBody;
import com.huaweicloud.sdk.hss.v5.model.CopyBaselinePolicyGroupResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateAgentDaemonsetRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateAgentDaemonsetResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateAntiVirusPaidTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateAntiVirusPaidTaskRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.CreateAntiVirusPaidTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateAntiVirusPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateAntiVirusPolicyRequestBody;
import com.huaweicloud.sdk.hss.v5.model.CreateAntiVirusPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateAntiVirusTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateAntiVirusTaskRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.CreateAntiVirusTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateAppWhitelistPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateAppWhitelistPolicyRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.CreateAppWhitelistPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateClusterProtectionPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateClusterProtectionPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateClustersInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateClustersInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateContainerNetworkPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateContainerNetworkPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateDaemonsetRequestBody;
import com.huaweicloud.sdk.hss.v5.model.CreateDecoyPortPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateDecoyPortPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateGlobalAssetScanTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateGlobalAssetScanTaskRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.CreateGlobalAssetScanTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateMultiCloudClustersRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateMultiCloudClustersResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateNetworkPolicyRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.CreateQuotasOrderRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateQuotasOrderRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.CreateQuotasOrderResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateSecurityGroupPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateSecurityGroupPolicyRequestBody;
import com.huaweicloud.sdk.hss.v5.model.CreateSecurityGroupPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateTaskRequestBody;
import com.huaweicloud.sdk.hss.v5.model.CreateTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateVulnerabilityScanTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateVulnerabilityScanTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteAccountRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteAccountRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.DeleteAccountResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteAgentDaemonsetRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteAgentDaemonsetResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteAntivirusPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteAntivirusPolicyRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.DeleteAntivirusPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteAppWhitelistPolicyHostRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteAppWhitelistPolicyHostRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.DeleteAppWhitelistPolicyHostResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteAppWhitelistPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteAppWhitelistPolicyRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.DeleteAppWhitelistPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteBaselineWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteBaselineWhiteListRequestBody;
import com.huaweicloud.sdk.hss.v5.model.DeleteBaselineWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteCicdConfigurationsRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteCicdConfigurationsRequestBody;
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
import com.huaweicloud.sdk.hss.v5.model.DeleteIsolatedFileRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteIsolatedFileRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.DeleteIsolatedFileResponse;
import com.huaweicloud.sdk.hss.v5.model.DeletePolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.DeletePolicyRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.DeletePolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteProtectionPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteProtectionPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteResourceInstanceTagRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteResourceInstanceTagResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteSecurityGroupPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteSecurityGroupPolicyRequestBody;
import com.huaweicloud.sdk.hss.v5.model.DeleteSecurityGroupPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.ExportAntiVirusResultRequest;
import com.huaweicloud.sdk.hss.v5.model.ExportAntiVirusResultRequestBody;
import com.huaweicloud.sdk.hss.v5.model.ExportAntiVirusResultResponse;
import com.huaweicloud.sdk.hss.v5.model.ExportContainerListRequest;
import com.huaweicloud.sdk.hss.v5.model.ExportContainerListRequestBody;
import com.huaweicloud.sdk.hss.v5.model.ExportContainerListResponse;
import com.huaweicloud.sdk.hss.v5.model.ExportHandledVulnerabilitiesRequest;
import com.huaweicloud.sdk.hss.v5.model.ExportHandledVulnerabilitiesRequestBody;
import com.huaweicloud.sdk.hss.v5.model.ExportHandledVulnerabilitiesResponse;
import com.huaweicloud.sdk.hss.v5.model.ExportImageSecurityReportTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.ExportImageSecurityReportTaskRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.ExportImageSecurityReportTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.ExportVulHandleHistoryRequest;
import com.huaweicloud.sdk.hss.v5.model.ExportVulHandleHistoryRequestBody;
import com.huaweicloud.sdk.hss.v5.model.ExportVulHandleHistoryResponse;
import com.huaweicloud.sdk.hss.v5.model.ExportVulRequestBody;
import com.huaweicloud.sdk.hss.v5.model.ExportVulsRequest;
import com.huaweicloud.sdk.hss.v5.model.ExportVulsResponse;
import com.huaweicloud.sdk.hss.v5.model.ExportWebTamperHostRequest;
import com.huaweicloud.sdk.hss.v5.model.ExportWebTamperHostRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.ExportWebTamperHostResponse;
import com.huaweicloud.sdk.hss.v5.model.HandleAntiVirusResultRequest;
import com.huaweicloud.sdk.hss.v5.model.HandleAntiVirusResultResponse;
import com.huaweicloud.sdk.hss.v5.model.HoneypotPortPolicyContent;
import com.huaweicloud.sdk.hss.v5.model.IdArray;
import com.huaweicloud.sdk.hss.v5.model.ListAccountsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAccountsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAgentInstallScriptRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAgentInstallScriptResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ListAutoLaunchChangeHistoriesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAutoLaunchChangeHistoriesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAutoLaunchStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAutoLaunchStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAutoLaunchsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAutoLaunchsResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ListCheckFeatureRuleRequest;
import com.huaweicloud.sdk.hss.v5.model.ListCheckFeatureRuleResponse;
import com.huaweicloud.sdk.hss.v5.model.ListCicdConfigurationsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListCicdConfigurationsResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ListDownloadExportedFileRequest;
import com.huaweicloud.sdk.hss.v5.model.ListDownloadExportedFileResponse;
import com.huaweicloud.sdk.hss.v5.model.ListEventHandleHistoryRequest;
import com.huaweicloud.sdk.hss.v5.model.ListEventHandleHistoryResponse;
import com.huaweicloud.sdk.hss.v5.model.ListFileEventsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListFileEventsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListFileHostEventDetailsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListFileHostEventDetailsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListFileHostsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListFileHostsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListGlobalAssetScanTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.ListGlobalAssetScanTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.ListHandleAffectBaselineRequest;
import com.huaweicloud.sdk.hss.v5.model.ListHandleAffectBaselineRequestBody;
import com.huaweicloud.sdk.hss.v5.model.ListHandleAffectBaselineResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ListIacFileRiskPathsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListIacFileRiskPathsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListIacFileRisksRequest;
import com.huaweicloud.sdk.hss.v5.model.ListIacFileRisksResponse;
import com.huaweicloud.sdk.hss.v5.model.ListIacFilesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListIacFilesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListImageLocalRequest;
import com.huaweicloud.sdk.hss.v5.model.ListImageLocalResponse;
import com.huaweicloud.sdk.hss.v5.model.ListImageRiskConfigRulesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListImageRiskConfigRulesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListImageRiskConfigsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListImageRiskConfigsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListImageVulnerabilitiesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListImageVulnerabilitiesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListIsolatedFileRequest;
import com.huaweicloud.sdk.hss.v5.model.ListIsolatedFileResponse;
import com.huaweicloud.sdk.hss.v5.model.ListJarPackageHostInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ListJarPackageHostInfoResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ListKernelModuleStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListKernelModuleStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListKubernetesClusterDetailsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListKubernetesClusterDetailsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListKubernetesEndpointDetailsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListKubernetesEndpointDetailsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListKubernetesServiceDetailsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListKubernetesServiceDetailsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListLoginCommonIpRequest;
import com.huaweicloud.sdk.hss.v5.model.ListLoginCommonIpResponse;
import com.huaweicloud.sdk.hss.v5.model.ListLoginCommonLocationRequest;
import com.huaweicloud.sdk.hss.v5.model.ListLoginCommonLocationResponse;
import com.huaweicloud.sdk.hss.v5.model.ListLoginWhiteIpRequest;
import com.huaweicloud.sdk.hss.v5.model.ListLoginWhiteIpResponse;
import com.huaweicloud.sdk.hss.v5.model.ListLoginWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.ListLoginWhiteListResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ListProjectConfigsRequestBody;
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
import com.huaweicloud.sdk.hss.v5.model.ListRiskConfigCheckRulesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListRiskConfigCheckRulesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListRiskConfigHostsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListRiskConfigHostsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListRiskConfigsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListRiskConfigsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListSecurityEventsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListSecurityEventsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListSecurityGroupPoliciesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListSecurityGroupPoliciesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListSecurityGroupsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListSecurityGroupsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListSwrImageRepositoryRequest;
import com.huaweicloud.sdk.hss.v5.model.ListSwrImageRepositoryResponse;
import com.huaweicloud.sdk.hss.v5.model.ListSystemUserWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.ListSystemUserWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.ListTaskResourcesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListTaskResourcesRequestBody;
import com.huaweicloud.sdk.hss.v5.model.ListTaskResourcesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListTasksRequest;
import com.huaweicloud.sdk.hss.v5.model.ListTasksRequestBody;
import com.huaweicloud.sdk.hss.v5.model.ListTasksResponse;
import com.huaweicloud.sdk.hss.v5.model.ListTwoFactorLoginHostRequest;
import com.huaweicloud.sdk.hss.v5.model.ListTwoFactorLoginHostResponse;
import com.huaweicloud.sdk.hss.v5.model.ListUserChangeHistoriesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListUserChangeHistoriesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListUserStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListUserStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListUsersRequest;
import com.huaweicloud.sdk.hss.v5.model.ListUsersResponse;
import com.huaweicloud.sdk.hss.v5.model.ListVulContainerAppsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListVulContainerAppsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListVulContainersRequest;
import com.huaweicloud.sdk.hss.v5.model.ListVulContainersResponse;
import com.huaweicloud.sdk.hss.v5.model.ListVulHandleHistoryRequest;
import com.huaweicloud.sdk.hss.v5.model.ListVulHandleHistoryResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ListWebFrameworkStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListWebFrameworkStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListWebSiteHostInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ListWebSiteHostInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ListWebSiteStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListWebSiteStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListWebTamperHostRequest;
import com.huaweicloud.sdk.hss.v5.model.ListWebTamperHostResponse;
import com.huaweicloud.sdk.hss.v5.model.ListWorkLoadsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListWorkLoadsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListWtpProtectHostRequest;
import com.huaweicloud.sdk.hss.v5.model.ListWtpProtectHostResponse;
import com.huaweicloud.sdk.hss.v5.model.ManualVulScanRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.ModClusterProtectionEventRequest;
import com.huaweicloud.sdk.hss.v5.model.ModPolicyRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.ModifyCicdConfigurationRequest;
import com.huaweicloud.sdk.hss.v5.model.ModifyCicdConfigurationRequestBody;
import com.huaweicloud.sdk.hss.v5.model.ModifyCicdConfigurationResponse;
import com.huaweicloud.sdk.hss.v5.model.ModifyDecoyPortPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ModifyDecoyPortPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.ModifyProjectConfigRequestBody;
import com.huaweicloud.sdk.hss.v5.model.ModifyProjectConfigsRequest;
import com.huaweicloud.sdk.hss.v5.model.ModifyProjectConfigsResponse;
import com.huaweicloud.sdk.hss.v5.model.MultiCloudClusterConfigRequestBody;
import com.huaweicloud.sdk.hss.v5.model.MultiCloudClusterCreateRequestBody;
import com.huaweicloud.sdk.hss.v5.model.MultiCloudClusterSyncStatusRequestBody;
import com.huaweicloud.sdk.hss.v5.model.OperateAntiVirusResultRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.ParseMultiCloudClusterConfigRequest;
import com.huaweicloud.sdk.hss.v5.model.ParseMultiCloudClusterConfigResponse;
import com.huaweicloud.sdk.hss.v5.model.ProtectionInfoRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.RecordUserViewVulTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.RecordUserViewVulTaskRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.RecordUserViewVulTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.RemoveAlarmWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.RemoveAlarmWhiteListRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.RemoveAlarmWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.RemoveLoginWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.RemoveLoginWhiteListRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.RemoveLoginWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.RemoveMultiCloudClustersRequest;
import com.huaweicloud.sdk.hss.v5.model.RemoveMultiCloudClustersResponse;
import com.huaweicloud.sdk.hss.v5.model.RemoveSystemUserWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.RemoveSystemUserWhiteListRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.RemoveSystemUserWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.ResourceProductDataObjectInfo;
import com.huaweicloud.sdk.hss.v5.model.RunHostAssetManualCollectRequest;
import com.huaweicloud.sdk.hss.v5.model.RunHostAssetManualCollectResponse;
import com.huaweicloud.sdk.hss.v5.model.RunImageSynchronizeRequest;
import com.huaweicloud.sdk.hss.v5.model.RunImageSynchronizeRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.RunImageSynchronizeResponse;
import com.huaweicloud.sdk.hss.v5.model.SaveBrowsingHistoryRequest;
import com.huaweicloud.sdk.hss.v5.model.SaveBrowsingHistoryRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.SaveBrowsingHistoryResponse;
import com.huaweicloud.sdk.hss.v5.model.SecurityGroup;
import com.huaweicloud.sdk.hss.v5.model.SetRaspSwitchRequest;
import com.huaweicloud.sdk.hss.v5.model.SetRaspSwitchRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.SetRaspSwitchResponse;
import com.huaweicloud.sdk.hss.v5.model.SetTwoFactorLoginConfigRequest;
import com.huaweicloud.sdk.hss.v5.model.SetTwoFactorLoginConfigRequestBody;
import com.huaweicloud.sdk.hss.v5.model.SetTwoFactorLoginConfigResponse;
import com.huaweicloud.sdk.hss.v5.model.SetWtpProtectionStatusInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.SetWtpProtectionStatusInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.SetWtpProtectionStatusRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.ShowAgentDaemonsetDeployTemplateRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowAgentDaemonsetDeployTemplateResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowAgentDaemonsetDetailInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowAgentDaemonsetDetailInfoResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ShowDecoyPortPolicyDetailsRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowDecoyPortPolicyDetailsResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowFileStatisticRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowFileStatisticResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowHostAssetManualCollectStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowHostAssetManualCollectStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowHostProtectionStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowHostProtectionStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowImageAssetStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowImageAssetStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowImageCheckRuleDetailRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowImageCheckRuleDetailResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowK8sContainerDetailRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowK8sContainerDetailResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowK8sPodDetailRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowK8sPodDetailResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowKubernetesEndpointInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowKubernetesEndpointInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowKubernetesServiceInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowKubernetesServiceInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowLatestExportTaskByTypeRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowLatestExportTaskByTypeResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ShowProductdataOfferingInfosRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowProductdataOfferingInfosResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowQuotaStatisticsInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowQuotaStatisticsInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowRaspPolicyDetailRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowRaspPolicyDetailResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowRaspProtectStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowRaspProtectStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowRaspServerDetailRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowRaspServerDetailResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowResourceQuotasRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowResourceQuotasResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowRiskConfigDetailRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowRiskConfigDetailResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowSingleBackupPolicyInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowSingleBackupPolicyInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowTaskStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowTaskStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowVulScanPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowVulScanPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowVulStaticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowVulStaticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowVulTaskStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowVulTaskStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowWebTamperHostPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowWebTamperHostPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowWebTamperRaspPathRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowWebTamperRaspPathResponse;
import com.huaweicloud.sdk.hss.v5.model.StartProtectionRequest;
import com.huaweicloud.sdk.hss.v5.model.StartProtectionResponse;
import com.huaweicloud.sdk.hss.v5.model.StopProtectionRequest;
import com.huaweicloud.sdk.hss.v5.model.StopProtectionResponse;
import com.huaweicloud.sdk.hss.v5.model.SwitchAntivirusTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.SwitchAntivirusTaskRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.SwitchAntivirusTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.SwitchAppWhitelistPolicyHostRequest;
import com.huaweicloud.sdk.hss.v5.model.SwitchAppWhitelistPolicyHostRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.SwitchAppWhitelistPolicyHostResponse;
import com.huaweicloud.sdk.hss.v5.model.SwitchAppWhitelistPolicyLearnStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.SwitchAppWhitelistPolicyLearnStatusRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.SwitchAppWhitelistPolicyLearnStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.SwitchClusterProtectionModeRequest;
import com.huaweicloud.sdk.hss.v5.model.SwitchClusterProtectionModeRequestBody;
import com.huaweicloud.sdk.hss.v5.model.SwitchClusterProtectionModeResponse;
import com.huaweicloud.sdk.hss.v5.model.SwitchContainerHostsProtectStatusRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.SwitchContainerProtectStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.SwitchContainerProtectStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.SwitchDecoyPortHostPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.SwitchDecoyPortHostPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.SwitchHostsProtectStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.SwitchHostsProtectStatusRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.SwitchHostsProtectStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.SwitchRaspRequest;
import com.huaweicloud.sdk.hss.v5.model.SwitchRaspRequestInfo;
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
import com.huaweicloud.sdk.hss.v5.model.UpdateBackupPolicyInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateBackupPolicyInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.UpdateBackupPolicyRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.UpdateContainerNetworkPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateContainerNetworkPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.UpdateDaemonsetRequestBody;
import com.huaweicloud.sdk.hss.v5.model.UpdateMultiCloudClusterRequestBody;
import com.huaweicloud.sdk.hss.v5.model.UpdateMultiCloudClustersRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateMultiCloudClustersResponse;
import com.huaweicloud.sdk.hss.v5.model.UpdateNetworkPolicy;
import com.huaweicloud.sdk.hss.v5.model.UpdatePolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdatePolicyRequestBody;
import com.huaweicloud.sdk.hss.v5.model.UpdatePolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.UpdateProtectionPolicyInfoRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.UpdateProtectionPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateProtectionPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.UpdateSecurityGroupPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateSecurityGroupPolicyRequestBody;
import com.huaweicloud.sdk.hss.v5.model.UpdateSecurityGroupPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.UpdateSystemUserWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateSystemUserWhiteListRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.UpdateSystemUserWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.UpdateWebTamperHostPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateWebTamperHostPolicyRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.UpdateWebTamperHostPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.UpdateWebTamperRaspPathRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateWebTamperRaspPathRequestInfo;
import com.huaweicloud.sdk.hss.v5.model.UpdateWebTamperRaspPathResponse;
import com.huaweicloud.sdk.hss.v5.model.Workload;

import java.util.List;

@SuppressWarnings("unchecked")
public class HssMeta {

    public static final HttpRequestDef<AddBaselineWhiteListRequest, AddBaselineWhiteListResponse> addBaselineWhiteList =
        genForAddBaselineWhiteList();

    private static HttpRequestDef<AddBaselineWhiteListRequest, AddBaselineWhiteListResponse> genForAddBaselineWhiteList() {
        // basic
        HttpRequestDef.Builder<AddBaselineWhiteListRequest, AddBaselineWhiteListResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AddBaselineWhiteListRequest.class, AddBaselineWhiteListResponse.class)
            .withName("AddBaselineWhiteList")
            .withUri("/v5/{project_id}/baseline/whitelist")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddBaselineWhiteListRequest::getEnterpriseProjectId,
                AddBaselineWhiteListRequest::setEnterpriseProjectId));
        builder.<AddBaselineWhiteListRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddBaselineWhiteListRequestBody.class),
            f -> f.withMarshaller(AddBaselineWhiteListRequest::getBody, AddBaselineWhiteListRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddCceIntegrationProtectionRequest, AddCceIntegrationProtectionResponse> addCceIntegrationProtection =
        genForAddCceIntegrationProtection();

    private static HttpRequestDef<AddCceIntegrationProtectionRequest, AddCceIntegrationProtectionResponse> genForAddCceIntegrationProtection() {
        // basic
        HttpRequestDef.Builder<AddCceIntegrationProtectionRequest, AddCceIntegrationProtectionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AddCceIntegrationProtectionRequest.class,
                    AddCceIntegrationProtectionResponse.class)
                .withName("AddCceIntegrationProtection")
                .withUri("/v5/{project_id}/container/kubernetes/clusters/protection-enable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddCceIntegrationProtectionRequest::getEnterpriseProjectId,
                AddCceIntegrationProtectionRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddCceIntegrationProtectionRequest::getRegion,
                AddCceIntegrationProtectionRequest::setRegion));
        builder.<CceIntegrationProtectionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CceIntegrationProtectionRequestBody.class),
            f -> f.withMarshaller(AddCceIntegrationProtectionRequest::getBody,
                AddCceIntegrationProtectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddHostsGroupRequest, AddHostsGroupResponse> addHostsGroup =
        genForAddHostsGroup();

    private static HttpRequestDef<AddHostsGroupRequest, AddHostsGroupResponse> genForAddHostsGroup() {
        // basic
        HttpRequestDef.Builder<AddHostsGroupRequest, AddHostsGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddHostsGroupRequest.class, AddHostsGroupResponse.class)
                .withName("AddHostsGroup")
                .withUri("/v5/{project_id}/host-management/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddHostsGroupRequest::getEnterpriseProjectId,
                AddHostsGroupRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddHostsGroupRequest::getRegion, AddHostsGroupRequest::setRegion));
        builder.<AddHostsGroupRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddHostsGroupRequestInfo.class),
            f -> f.withMarshaller(AddHostsGroupRequest::getBody, AddHostsGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddLoginWhiteListRequest, AddLoginWhiteListResponse> addLoginWhiteList =
        genForAddLoginWhiteList();

    private static HttpRequestDef<AddLoginWhiteListRequest, AddLoginWhiteListResponse> genForAddLoginWhiteList() {
        // basic
        HttpRequestDef.Builder<AddLoginWhiteListRequest, AddLoginWhiteListResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddLoginWhiteListRequest.class, AddLoginWhiteListResponse.class)
                .withName("AddLoginWhiteList")
                .withUri("/v5/{project_id}/event/white-list/login")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddLoginWhiteListRequest::getEnterpriseProjectId,
                AddLoginWhiteListRequest::setEnterpriseProjectId));
        builder.<AddLoginWhiteListRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddLoginWhiteListRequestInfo.class),
            f -> f.withMarshaller(AddLoginWhiteListRequest::getBody, AddLoginWhiteListRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddPolicyRequest, AddPolicyResponse> addPolicy = genForAddPolicy();

    private static HttpRequestDef<AddPolicyRequest, AddPolicyResponse> genForAddPolicy() {
        // basic
        HttpRequestDef.Builder<AddPolicyRequest, AddPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddPolicyRequest.class, AddPolicyResponse.class)
                .withName("AddPolicy")
                .withUri("/v5/{project_id}/rasp/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddPolicyRequest::getEnterpriseProjectId, AddPolicyRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddPolicyRequest::getOsType, AddPolicyRequest::setOsType));
        builder.<String>withRequestField("policy_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddPolicyRequest::getPolicyName, AddPolicyRequest::setPolicyName));
        builder.<AddPolicyRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddPolicyRequestInfo.class),
            f -> f.withMarshaller(AddPolicyRequest::getBody, AddPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddProtectionPolicyRequest, AddProtectionPolicyResponse> addProtectionPolicy =
        genForAddProtectionPolicy();

    private static HttpRequestDef<AddProtectionPolicyRequest, AddProtectionPolicyResponse> genForAddProtectionPolicy() {
        // basic
        HttpRequestDef.Builder<AddProtectionPolicyRequest, AddProtectionPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddProtectionPolicyRequest.class, AddProtectionPolicyResponse.class)
                .withName("AddProtectionPolicy")
                .withUri("/v5/{project_id}/ransomware/protection/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddProtectionPolicyRequest::getEnterpriseProjectId,
                AddProtectionPolicyRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddProtectionPolicyRequest::getRegion, AddProtectionPolicyRequest::setRegion));
        builder.<AddProtectionPolicyInfoRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddProtectionPolicyInfoRequestInfo.class),
            f -> f.withMarshaller(AddProtectionPolicyRequest::getBody, AddProtectionPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddSystemUserWhiteListRequest, AddSystemUserWhiteListResponse> addSystemUserWhiteList =
        genForAddSystemUserWhiteList();

    private static HttpRequestDef<AddSystemUserWhiteListRequest, AddSystemUserWhiteListResponse> genForAddSystemUserWhiteList() {
        // basic
        HttpRequestDef.Builder<AddSystemUserWhiteListRequest, AddSystemUserWhiteListResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AddSystemUserWhiteListRequest.class, AddSystemUserWhiteListResponse.class)
            .withName("AddSystemUserWhiteList")
            .withUri("/v5/{project_id}/event/white-list/userlist")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddSystemUserWhiteListRequest::getEnterpriseProjectId,
                AddSystemUserWhiteListRequest::setEnterpriseProjectId));
        builder.<AddSystemUserWhiteListRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddSystemUserWhiteListRequestInfo.class),
            f -> f.withMarshaller(AddSystemUserWhiteListRequest::getBody, AddSystemUserWhiteListRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociatePolicyGroupRequest, AssociatePolicyGroupResponse> associatePolicyGroup =
        genForAssociatePolicyGroup();

    private static HttpRequestDef<AssociatePolicyGroupRequest, AssociatePolicyGroupResponse> genForAssociatePolicyGroup() {
        // basic
        HttpRequestDef.Builder<AssociatePolicyGroupRequest, AssociatePolicyGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AssociatePolicyGroupRequest.class, AssociatePolicyGroupResponse.class)
            .withName("AssociatePolicyGroup")
            .withUri("/v5/{project_id}/policy/deploy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociatePolicyGroupRequest::getEnterpriseProjectId,
                AssociatePolicyGroupRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociatePolicyGroupRequest::getRegion, AssociatePolicyGroupRequest::setRegion));
        builder.<AssociatePolicyGroupRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociatePolicyGroupRequestInfo.class),
            f -> f.withMarshaller(AssociatePolicyGroupRequest::getBody, AssociatePolicyGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAddAccountsRequest, BatchAddAccountsResponse> batchAddAccounts =
        genForBatchAddAccounts();

    private static HttpRequestDef<BatchAddAccountsRequest, BatchAddAccountsResponse> genForBatchAddAccounts() {
        // basic
        HttpRequestDef.Builder<BatchAddAccountsRequest, BatchAddAccountsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchAddAccountsRequest.class, BatchAddAccountsResponse.class)
                .withName("BatchAddAccounts")
                .withUri("/v5/setting/account/accounts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAddAccountsRequest::getEnterpriseProjectId,
                BatchAddAccountsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAddAccountsRequest::getXSecurityToken,
                BatchAddAccountsRequest::setXSecurityToken));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAddAccountsRequest::getRegion, BatchAddAccountsRequest::setRegion));
        builder.<BatchAddAccountsRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAddAccountsRequestInfo.class),
            f -> f.withMarshaller(BatchAddAccountsRequest::getBody, BatchAddAccountsRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchAddAccountsResponse::getXRequestId, BatchAddAccountsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateTagsRequest, BatchCreateTagsResponse> batchCreateTags =
        genForBatchCreateTags();

    private static HttpRequestDef<BatchCreateTagsRequest, BatchCreateTagsResponse> genForBatchCreateTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateTagsRequest, BatchCreateTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateTagsRequest.class, BatchCreateTagsResponse.class)
                .withName("BatchCreateTags")
                .withUri("/v5/{project_id}/{resource_type}/{resource_id}/tags/create")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateTagsRequest::getResourceType, BatchCreateTagsRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateTagsRequest::getResourceId, BatchCreateTagsRequest::setResourceId));
        builder.<BatchCreateTagsRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateTagsRequestInfo.class),
            f -> f.withMarshaller(BatchCreateTagsRequest::getBody, BatchCreateTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchScanSwrImageRequest, BatchScanSwrImageResponse> batchScanSwrImage =
        genForBatchScanSwrImage();

    private static HttpRequestDef<BatchScanSwrImageRequest, BatchScanSwrImageResponse> genForBatchScanSwrImage() {
        // basic
        HttpRequestDef.Builder<BatchScanSwrImageRequest, BatchScanSwrImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchScanSwrImageRequest.class, BatchScanSwrImageResponse.class)
                .withName("BatchScanSwrImage")
                .withUri("/v5/{project_id}/image/batch-scan")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchScanSwrImageRequest::getEnterpriseProjectId,
                BatchScanSwrImageRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchScanSwrImageRequest::getRegion, BatchScanSwrImageRequest::setRegion));
        builder.<BatchScanPrivateImageRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchScanPrivateImageRequestInfo.class),
            f -> f.withMarshaller(BatchScanSwrImageRequest::getBody, BatchScanSwrImageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchStartProtectionRequest, BatchStartProtectionResponse> batchStartProtection =
        genForBatchStartProtection();

    private static HttpRequestDef<BatchStartProtectionRequest, BatchStartProtectionResponse> genForBatchStartProtection() {
        // basic
        HttpRequestDef.Builder<BatchStartProtectionRequest, BatchStartProtectionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchStartProtectionRequest.class, BatchStartProtectionResponse.class)
            .withName("BatchStartProtection")
            .withUri("/v5/{project_id}/ransomware/protection/batch-open")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchStartProtectionRequest::getEnterpriseProjectId,
                BatchStartProtectionRequest::setEnterpriseProjectId));
        builder.<BatchStartProtectionRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchStartProtectionRequestInfo.class),
            f -> f.withMarshaller(BatchStartProtectionRequest::getBody, BatchStartProtectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeBaselineWhiteListRequest, ChangeBaselineWhiteListResponse> changeBaselineWhiteList =
        genForChangeBaselineWhiteList();

    private static HttpRequestDef<ChangeBaselineWhiteListRequest, ChangeBaselineWhiteListResponse> genForChangeBaselineWhiteList() {
        // basic
        HttpRequestDef.Builder<ChangeBaselineWhiteListRequest, ChangeBaselineWhiteListResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, ChangeBaselineWhiteListRequest.class, ChangeBaselineWhiteListResponse.class)
            .withName("ChangeBaselineWhiteList")
            .withUri("/v5/{project_id}/baseline/whitelist")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeBaselineWhiteListRequest::getEnterpriseProjectId,
                ChangeBaselineWhiteListRequest::setEnterpriseProjectId));
        builder.<ChangeBaselineWhiteListRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeBaselineWhiteListRequestBody.class),
            f -> f.withMarshaller(ChangeBaselineWhiteListRequest::getBody, ChangeBaselineWhiteListRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeBlockedIpRequest, ChangeBlockedIpResponse> changeBlockedIp =
        genForChangeBlockedIp();

    private static HttpRequestDef<ChangeBlockedIpRequest, ChangeBlockedIpResponse> genForChangeBlockedIp() {
        // basic
        HttpRequestDef.Builder<ChangeBlockedIpRequest, ChangeBlockedIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeBlockedIpRequest.class, ChangeBlockedIpResponse.class)
                .withName("ChangeBlockedIp")
                .withUri("/v5/{project_id}/event/blocked-ip")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeBlockedIpRequest::getEnterpriseProjectId,
                ChangeBlockedIpRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeBlockedIpRequest::getRegion, ChangeBlockedIpRequest::setRegion));
        builder.<ChangeBlockedIpRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeBlockedIpRequestInfo.class),
            f -> f.withMarshaller(ChangeBlockedIpRequest::getBody, ChangeBlockedIpRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeCheckRuleActionRequest, ChangeCheckRuleActionResponse> changeCheckRuleAction =
        genForChangeCheckRuleAction();

    private static HttpRequestDef<ChangeCheckRuleActionRequest, ChangeCheckRuleActionResponse> genForChangeCheckRuleAction() {
        // basic
        HttpRequestDef.Builder<ChangeCheckRuleActionRequest, ChangeCheckRuleActionResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, ChangeCheckRuleActionRequest.class, ChangeCheckRuleActionResponse.class)
            .withName("ChangeCheckRuleAction")
            .withUri("/v5/{project_id}/baseline/check-rule/action")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeCheckRuleActionRequest::getEnterpriseProjectId,
                ChangeCheckRuleActionRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeCheckRuleActionRequest::getHostId, ChangeCheckRuleActionRequest::setHostId));
        builder.<Boolean>withRequestField("check_cce",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ChangeCheckRuleActionRequest::getCheckCce,
                ChangeCheckRuleActionRequest::setCheckCce));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeCheckRuleActionRequest::getAction, ChangeCheckRuleActionRequest::setAction));
        builder.<CheckRuleIdListRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckRuleIdListRequestInfo.class),
            f -> f.withMarshaller(ChangeCheckRuleActionRequest::getBody, ChangeCheckRuleActionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeClusterEventsRequest, ChangeClusterEventsResponse> changeClusterEvents =
        genForChangeClusterEvents();

    private static HttpRequestDef<ChangeClusterEventsRequest, ChangeClusterEventsResponse> genForChangeClusterEvents() {
        // basic
        HttpRequestDef.Builder<ChangeClusterEventsRequest, ChangeClusterEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeClusterEventsRequest.class, ChangeClusterEventsResponse.class)
                .withName("ChangeClusterEvents")
                .withUri("/v5/{project_id}/cluster-protect/events")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeClusterEventsRequest::getEnterpriseProjectId,
                ChangeClusterEventsRequest::setEnterpriseProjectId));
        builder.<ModClusterProtectionEventRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModClusterProtectionEventRequest.class),
            f -> f.withMarshaller(ChangeClusterEventsRequest::getBody, ChangeClusterEventsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeClusterProtectionPolicyRequest, ChangeClusterProtectionPolicyResponse> changeClusterProtectionPolicy =
        genForChangeClusterProtectionPolicy();

    private static HttpRequestDef<ChangeClusterProtectionPolicyRequest, ChangeClusterProtectionPolicyResponse> genForChangeClusterProtectionPolicy() {
        // basic
        HttpRequestDef.Builder<ChangeClusterProtectionPolicyRequest, ChangeClusterProtectionPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    ChangeClusterProtectionPolicyRequest.class,
                    ChangeClusterProtectionPolicyResponse.class)
                .withName("ChangeClusterProtectionPolicy")
                .withUri("/v5/{project_id}/cluster-protect/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeClusterProtectionPolicyRequest::getEnterpriseProjectId,
                ChangeClusterProtectionPolicyRequest::setEnterpriseProjectId));
        builder.<ModPolicyRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModPolicyRequestInfo.class),
            f -> f.withMarshaller(ChangeClusterProtectionPolicyRequest::getBody,
                ChangeClusterProtectionPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeEventRequest, ChangeEventResponse> changeEvent = genForChangeEvent();

    private static HttpRequestDef<ChangeEventRequest, ChangeEventResponse> genForChangeEvent() {
        // basic
        HttpRequestDef.Builder<ChangeEventRequest, ChangeEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ChangeEventRequest.class, ChangeEventResponse.class)
                .withName("ChangeEvent")
                .withUri("/v5/{project_id}/event/operate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeEventRequest::getEnterpriseProjectId,
                ChangeEventRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("container_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeEventRequest::getContainerName, ChangeEventRequest::setContainerName));
        builder.<String>withRequestField("container_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeEventRequest::getContainerId, ChangeEventRequest::setContainerId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeEventRequest::getRegion, ChangeEventRequest::setRegion));
        builder.<ChangeEventRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeEventRequestInfo.class),
            f -> f.withMarshaller(ChangeEventRequest::getBody, ChangeEventRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeHostsGroupRequest, ChangeHostsGroupResponse> changeHostsGroup =
        genForChangeHostsGroup();

    private static HttpRequestDef<ChangeHostsGroupRequest, ChangeHostsGroupResponse> genForChangeHostsGroup() {
        // basic
        HttpRequestDef.Builder<ChangeHostsGroupRequest, ChangeHostsGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeHostsGroupRequest.class, ChangeHostsGroupResponse.class)
                .withName("ChangeHostsGroup")
                .withUri("/v5/{project_id}/host-management/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeHostsGroupRequest::getEnterpriseProjectId,
                ChangeHostsGroupRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeHostsGroupRequest::getRegion, ChangeHostsGroupRequest::setRegion));
        builder.<ChangeHostsGroupRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeHostsGroupRequestInfo.class),
            f -> f.withMarshaller(ChangeHostsGroupRequest::getBody, ChangeHostsGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeIsolatedFileRequest, ChangeIsolatedFileResponse> changeIsolatedFile =
        genForChangeIsolatedFile();

    private static HttpRequestDef<ChangeIsolatedFileRequest, ChangeIsolatedFileResponse> genForChangeIsolatedFile() {
        // basic
        HttpRequestDef.Builder<ChangeIsolatedFileRequest, ChangeIsolatedFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeIsolatedFileRequest.class, ChangeIsolatedFileResponse.class)
                .withName("ChangeIsolatedFile")
                .withUri("/v5/{project_id}/event/isolated-file")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeIsolatedFileRequest::getEnterpriseProjectId,
                ChangeIsolatedFileRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeIsolatedFileRequest::getRegion, ChangeIsolatedFileRequest::setRegion));
        builder.<ChangeIsolatedFileRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeIsolatedFileRequestInfo.class),
            f -> f.withMarshaller(ChangeIsolatedFileRequest::getBody, ChangeIsolatedFileRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangePasswordComplexityStatusRequest, ChangePasswordComplexityStatusResponse> changePasswordComplexityStatus =
        genForChangePasswordComplexityStatus();

    private static HttpRequestDef<ChangePasswordComplexityStatusRequest, ChangePasswordComplexityStatusResponse> genForChangePasswordComplexityStatus() {
        // basic
        HttpRequestDef.Builder<ChangePasswordComplexityStatusRequest, ChangePasswordComplexityStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ChangePasswordComplexityStatusRequest.class,
                    ChangePasswordComplexityStatusResponse.class)
                .withName("ChangePasswordComplexityStatus")
                .withUri("/v5/{project_id}/baseline/password-complexity/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangePasswordComplexityStatusRequest::getEnterpriseProjectId,
                ChangePasswordComplexityStatusRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangePasswordComplexityStatusRequest::getAction,
                ChangePasswordComplexityStatusRequest::setAction));
        builder.<ChangePasswordComplexityStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangePasswordComplexityStatusRequestBody.class),
            f -> f.withMarshaller(ChangePasswordComplexityStatusRequest::getBody,
                ChangePasswordComplexityStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeVulStatusRequest, ChangeVulStatusResponse> changeVulStatus =
        genForChangeVulStatus();

    private static HttpRequestDef<ChangeVulStatusRequest, ChangeVulStatusResponse> genForChangeVulStatus() {
        // basic
        HttpRequestDef.Builder<ChangeVulStatusRequest, ChangeVulStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeVulStatusRequest.class, ChangeVulStatusResponse.class)
                .withName("ChangeVulStatus")
                .withUri("/v5/{project_id}/vulnerability/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeVulStatusRequest::getEnterpriseProjectId,
                ChangeVulStatusRequest::setEnterpriseProjectId));
        builder.<ChangeVulStatusRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeVulStatusRequestInfo.class),
            f -> f.withMarshaller(ChangeVulStatusRequest::getBody, ChangeVulStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateClusterProtectionPolicyRequest, CreateClusterProtectionPolicyResponse> createClusterProtectionPolicy =
        genForCreateClusterProtectionPolicy();

    private static HttpRequestDef<CreateClusterProtectionPolicyRequest, CreateClusterProtectionPolicyResponse> genForCreateClusterProtectionPolicy() {
        // basic
        HttpRequestDef.Builder<CreateClusterProtectionPolicyRequest, CreateClusterProtectionPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateClusterProtectionPolicyRequest.class,
                    CreateClusterProtectionPolicyResponse.class)
                .withName("CreateClusterProtectionPolicy")
                .withUri("/v5/{project_id}/cluster-protect/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateClusterProtectionPolicyRequest::getEnterpriseProjectId,
                CreateClusterProtectionPolicyRequest::setEnterpriseProjectId));
        builder.<ModPolicyRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModPolicyRequestInfo.class),
            f -> f.withMarshaller(CreateClusterProtectionPolicyRequest::getBody,
                CreateClusterProtectionPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateClustersInfoRequest, CreateClustersInfoResponse> createClustersInfo =
        genForCreateClustersInfo();

    private static HttpRequestDef<CreateClustersInfoRequest, CreateClustersInfoResponse> genForCreateClustersInfo() {
        // basic
        HttpRequestDef.Builder<CreateClustersInfoRequest, CreateClustersInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateClustersInfoRequest.class, CreateClustersInfoResponse.class)
                .withName("CreateClustersInfo")
                .withUri("/v5/{project_id}/kubernetes/save-clusters")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateClustersInfoRequest::getEnterpriseProjectId,
                CreateClustersInfoRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateContainerNetworkPolicyRequest, CreateContainerNetworkPolicyResponse> createContainerNetworkPolicy =
        genForCreateContainerNetworkPolicy();

    private static HttpRequestDef<CreateContainerNetworkPolicyRequest, CreateContainerNetworkPolicyResponse> genForCreateContainerNetworkPolicy() {
        // basic
        HttpRequestDef.Builder<CreateContainerNetworkPolicyRequest, CreateContainerNetworkPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateContainerNetworkPolicyRequest.class,
                    CreateContainerNetworkPolicyResponse.class)
                .withName("CreateContainerNetworkPolicy")
                .withUri("/v5/{project_id}/container-network/{cluster_id}/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateContainerNetworkPolicyRequest::getClusterId,
                CreateContainerNetworkPolicyRequest::setClusterId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateContainerNetworkPolicyRequest::getEnterpriseProjectId,
                CreateContainerNetworkPolicyRequest::setEnterpriseProjectId));
        builder.<CreateNetworkPolicyRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateNetworkPolicyRequestInfo.class),
            f -> f.withMarshaller(CreateContainerNetworkPolicyRequest::getBody,
                CreateContainerNetworkPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDecoyPortPolicyRequest, CreateDecoyPortPolicyResponse> createDecoyPortPolicy =
        genForCreateDecoyPortPolicy();

    private static HttpRequestDef<CreateDecoyPortPolicyRequest, CreateDecoyPortPolicyResponse> genForCreateDecoyPortPolicy() {
        // basic
        HttpRequestDef.Builder<CreateDecoyPortPolicyRequest, CreateDecoyPortPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateDecoyPortPolicyRequest.class, CreateDecoyPortPolicyResponse.class)
            .withName("CreateDecoyPortPolicy")
            .withUri("/v5/{project_id}/honeypot-port/policy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDecoyPortPolicyRequest::getEnterpriseProjectId,
                CreateDecoyPortPolicyRequest::setEnterpriseProjectId));
        builder.<HoneypotPortPolicyContent>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(HoneypotPortPolicyContent.class),
            f -> f.withMarshaller(CreateDecoyPortPolicyRequest::getBody, CreateDecoyPortPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGlobalAssetScanTaskRequest, CreateGlobalAssetScanTaskResponse> createGlobalAssetScanTask =
        genForCreateGlobalAssetScanTask();

    private static HttpRequestDef<CreateGlobalAssetScanTaskRequest, CreateGlobalAssetScanTaskResponse> genForCreateGlobalAssetScanTask() {
        // basic
        HttpRequestDef.Builder<CreateGlobalAssetScanTaskRequest, CreateGlobalAssetScanTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateGlobalAssetScanTaskRequest.class,
                    CreateGlobalAssetScanTaskResponse.class)
                .withName("CreateGlobalAssetScanTask")
                .withUri("/v5/{project_id}/asset/assign-task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGlobalAssetScanTaskRequest::getEnterpriseProjectId,
                CreateGlobalAssetScanTaskRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGlobalAssetScanTaskRequest::getCategory,
                CreateGlobalAssetScanTaskRequest::setCategory));
        builder.<CreateGlobalAssetScanTaskRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateGlobalAssetScanTaskRequestInfo.class),
            f -> f.withMarshaller(CreateGlobalAssetScanTaskRequest::getBody,
                CreateGlobalAssetScanTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateQuotasOrderRequest, CreateQuotasOrderResponse> createQuotasOrder =
        genForCreateQuotasOrder();

    private static HttpRequestDef<CreateQuotasOrderRequest, CreateQuotasOrderResponse> genForCreateQuotasOrder() {
        // basic
        HttpRequestDef.Builder<CreateQuotasOrderRequest, CreateQuotasOrderResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateQuotasOrderRequest.class, CreateQuotasOrderResponse.class)
                .withName("CreateQuotasOrder")
                .withUri("/v5/{project_id}/quotas/orders")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateQuotasOrderRequest::getEnterpriseProjectId,
                CreateQuotasOrderRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateQuotasOrderRequest::getRegion, CreateQuotasOrderRequest::setRegion));
        builder.<CreateQuotasOrderRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateQuotasOrderRequestInfo.class),
            f -> f.withMarshaller(CreateQuotasOrderRequest::getBody, CreateQuotasOrderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSecurityGroupPolicyRequest, CreateSecurityGroupPolicyResponse> createSecurityGroupPolicy =
        genForCreateSecurityGroupPolicy();

    private static HttpRequestDef<CreateSecurityGroupPolicyRequest, CreateSecurityGroupPolicyResponse> genForCreateSecurityGroupPolicy() {
        // basic
        HttpRequestDef.Builder<CreateSecurityGroupPolicyRequest, CreateSecurityGroupPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateSecurityGroupPolicyRequest.class,
                    CreateSecurityGroupPolicyResponse.class)
                .withName("CreateSecurityGroupPolicy")
                .withUri("/v5/{project_id}/container-network/{cluster_id}/{namespace}/security-group-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSecurityGroupPolicyRequest::getClusterId,
                CreateSecurityGroupPolicyRequest::setClusterId));
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSecurityGroupPolicyRequest::getNamespace,
                CreateSecurityGroupPolicyRequest::setNamespace));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSecurityGroupPolicyRequest::getEnterpriseProjectId,
                CreateSecurityGroupPolicyRequest::setEnterpriseProjectId));
        builder.<CreateSecurityGroupPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSecurityGroupPolicyRequestBody.class),
            f -> f.withMarshaller(CreateSecurityGroupPolicyRequest::getBody,
                CreateSecurityGroupPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAccountRequest, DeleteAccountResponse> deleteAccount =
        genForDeleteAccount();

    private static HttpRequestDef<DeleteAccountRequest, DeleteAccountResponse> genForDeleteAccount() {
        // basic
        HttpRequestDef.Builder<DeleteAccountRequest, DeleteAccountResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAccountRequest.class, DeleteAccountResponse.class)
                .withName("DeleteAccount")
                .withUri("/v5/setting/account/accounts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAccountRequest::getEnterpriseProjectId,
                DeleteAccountRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAccountRequest::getXSecurityToken, DeleteAccountRequest::setXSecurityToken));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAccountRequest::getRegion, DeleteAccountRequest::setRegion));
        builder.<DeleteAccountRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteAccountRequestInfo.class),
            f -> f.withMarshaller(DeleteAccountRequest::getBody, DeleteAccountRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBaselineWhiteListRequest, DeleteBaselineWhiteListResponse> deleteBaselineWhiteList =
        genForDeleteBaselineWhiteList();

    private static HttpRequestDef<DeleteBaselineWhiteListRequest, DeleteBaselineWhiteListResponse> genForDeleteBaselineWhiteList() {
        // basic
        HttpRequestDef.Builder<DeleteBaselineWhiteListRequest, DeleteBaselineWhiteListResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteBaselineWhiteListRequest.class, DeleteBaselineWhiteListResponse.class)
            .withName("DeleteBaselineWhiteList")
            .withUri("/v5/{project_id}/baseline/whitelist")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBaselineWhiteListRequest::getEnterpriseProjectId,
                DeleteBaselineWhiteListRequest::setEnterpriseProjectId));
        builder.<DeleteBaselineWhiteListRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteBaselineWhiteListRequestBody.class),
            f -> f.withMarshaller(DeleteBaselineWhiteListRequest::getBody, DeleteBaselineWhiteListRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteClusterProtectionPolicyRequest, DeleteClusterProtectionPolicyResponse> deleteClusterProtectionPolicy =
        genForDeleteClusterProtectionPolicy();

    private static HttpRequestDef<DeleteClusterProtectionPolicyRequest, DeleteClusterProtectionPolicyResponse> genForDeleteClusterProtectionPolicy() {
        // basic
        HttpRequestDef.Builder<DeleteClusterProtectionPolicyRequest, DeleteClusterProtectionPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteClusterProtectionPolicyRequest.class,
                    DeleteClusterProtectionPolicyResponse.class)
                .withName("DeleteClusterProtectionPolicy")
                .withUri("/v5/{project_id}/cluster-protect/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClusterProtectionPolicyRequest::getEnterpriseProjectId,
                DeleteClusterProtectionPolicyRequest::setEnterpriseProjectId));
        builder.<DeletePolicyRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeletePolicyRequestInfo.class),
            f -> f.withMarshaller(DeleteClusterProtectionPolicyRequest::getBody,
                DeleteClusterProtectionPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteContainerNetworkPolicyRequest, DeleteContainerNetworkPolicyResponse> deleteContainerNetworkPolicy =
        genForDeleteContainerNetworkPolicy();

    private static HttpRequestDef<DeleteContainerNetworkPolicyRequest, DeleteContainerNetworkPolicyResponse> genForDeleteContainerNetworkPolicy() {
        // basic
        HttpRequestDef.Builder<DeleteContainerNetworkPolicyRequest, DeleteContainerNetworkPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteContainerNetworkPolicyRequest.class,
                    DeleteContainerNetworkPolicyResponse.class)
                .withName("DeleteContainerNetworkPolicy")
                .withUri("/v5/{project_id}/container-network/{cluster_id}/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteContainerNetworkPolicyRequest::getClusterId,
                DeleteContainerNetworkPolicyRequest::setClusterId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteContainerNetworkPolicyRequest::getEnterpriseProjectId,
                DeleteContainerNetworkPolicyRequest::setEnterpriseProjectId));
        builder.<IdArray>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IdArray.class),
            f -> f.withMarshaller(DeleteContainerNetworkPolicyRequest::getBody,
                DeleteContainerNetworkPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDecoyPortHostPolicyRequest, DeleteDecoyPortHostPolicyResponse> deleteDecoyPortHostPolicy =
        genForDeleteDecoyPortHostPolicy();

    private static HttpRequestDef<DeleteDecoyPortHostPolicyRequest, DeleteDecoyPortHostPolicyResponse> genForDeleteDecoyPortHostPolicy() {
        // basic
        HttpRequestDef.Builder<DeleteDecoyPortHostPolicyRequest, DeleteDecoyPortHostPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteDecoyPortHostPolicyRequest.class,
                    DeleteDecoyPortHostPolicyResponse.class)
                .withName("DeleteDecoyPortHostPolicy")
                .withUri("/v5/{project_id}/honeypot-port/host-policy/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDecoyPortHostPolicyRequest::getPolicyId,
                DeleteDecoyPortHostPolicyRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDecoyPortHostPolicyRequest::getEnterpriseProjectId,
                DeleteDecoyPortHostPolicyRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDecoyPortHostPolicyRequest::getHostId,
                DeleteDecoyPortHostPolicyRequest::setHostId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDecoyPortPolicyRequest, DeleteDecoyPortPolicyResponse> deleteDecoyPortPolicy =
        genForDeleteDecoyPortPolicy();

    private static HttpRequestDef<DeleteDecoyPortPolicyRequest, DeleteDecoyPortPolicyResponse> genForDeleteDecoyPortPolicy() {
        // basic
        HttpRequestDef.Builder<DeleteDecoyPortPolicyRequest, DeleteDecoyPortPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteDecoyPortPolicyRequest.class, DeleteDecoyPortPolicyResponse.class)
            .withName("DeleteDecoyPortPolicy")
            .withUri("/v5/{project_id}/honeypot-port/policy/{policy_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDecoyPortPolicyRequest::getPolicyId,
                DeleteDecoyPortPolicyRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDecoyPortPolicyRequest::getEnterpriseProjectId,
                DeleteDecoyPortPolicyRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHostsGroupRequest, DeleteHostsGroupResponse> deleteHostsGroup =
        genForDeleteHostsGroup();

    private static HttpRequestDef<DeleteHostsGroupRequest, DeleteHostsGroupResponse> genForDeleteHostsGroup() {
        // basic
        HttpRequestDef.Builder<DeleteHostsGroupRequest, DeleteHostsGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteHostsGroupRequest.class, DeleteHostsGroupResponse.class)
                .withName("DeleteHostsGroup")
                .withUri("/v5/{project_id}/host-management/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHostsGroupRequest::getEnterpriseProjectId,
                DeleteHostsGroupRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHostsGroupRequest::getGroupId, DeleteHostsGroupRequest::setGroupId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHostsGroupRequest::getRegion, DeleteHostsGroupRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteIsolatedFileRequest, DeleteIsolatedFileResponse> deleteIsolatedFile =
        genForDeleteIsolatedFile();

    private static HttpRequestDef<DeleteIsolatedFileRequest, DeleteIsolatedFileResponse> genForDeleteIsolatedFile() {
        // basic
        HttpRequestDef.Builder<DeleteIsolatedFileRequest, DeleteIsolatedFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteIsolatedFileRequest.class, DeleteIsolatedFileResponse.class)
                .withName("DeleteIsolatedFile")
                .withUri("/v5/{project_id}/event/isolated-file")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIsolatedFileRequest::getEnterpriseProjectId,
                DeleteIsolatedFileRequest::setEnterpriseProjectId));
        builder.<DeleteIsolatedFileRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteIsolatedFileRequestInfo.class),
            f -> f.withMarshaller(DeleteIsolatedFileRequest::getBody, DeleteIsolatedFileRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePolicyRequest, DeletePolicyResponse> deletePolicy = genForDeletePolicy();

    private static HttpRequestDef<DeletePolicyRequest, DeletePolicyResponse> genForDeletePolicy() {
        // basic
        HttpRequestDef.Builder<DeletePolicyRequest, DeletePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePolicyRequest.class, DeletePolicyResponse.class)
                .withName("DeletePolicy")
                .withUri("/v5/{project_id}/rasp/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePolicyRequest::getEnterpriseProjectId,
                DeletePolicyRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("policy_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePolicyRequest::getPolicyId, DeletePolicyRequest::setPolicyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteProtectionPolicyRequest, DeleteProtectionPolicyResponse> deleteProtectionPolicy =
        genForDeleteProtectionPolicy();

    private static HttpRequestDef<DeleteProtectionPolicyRequest, DeleteProtectionPolicyResponse> genForDeleteProtectionPolicy() {
        // basic
        HttpRequestDef.Builder<DeleteProtectionPolicyRequest, DeleteProtectionPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteProtectionPolicyRequest.class, DeleteProtectionPolicyResponse.class)
            .withName("DeleteProtectionPolicy")
            .withUri("/v5/{project_id}/ransomware/protection/policy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProtectionPolicyRequest::getEnterpriseProjectId,
                DeleteProtectionPolicyRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("policy_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProtectionPolicyRequest::getPolicyId,
                DeleteProtectionPolicyRequest::setPolicyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResourceInstanceTagRequest, DeleteResourceInstanceTagResponse> deleteResourceInstanceTag =
        genForDeleteResourceInstanceTag();

    private static HttpRequestDef<DeleteResourceInstanceTagRequest, DeleteResourceInstanceTagResponse> genForDeleteResourceInstanceTag() {
        // basic
        HttpRequestDef.Builder<DeleteResourceInstanceTagRequest, DeleteResourceInstanceTagResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteResourceInstanceTagRequest.class,
                    DeleteResourceInstanceTagResponse.class)
                .withName("DeleteResourceInstanceTag")
                .withUri("/v5/{project_id}/{resource_type}/{resource_id}/tags/{key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceInstanceTagRequest::getResourceType,
                DeleteResourceInstanceTagRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceInstanceTagRequest::getResourceId,
                DeleteResourceInstanceTagRequest::setResourceId));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceInstanceTagRequest::getKey, DeleteResourceInstanceTagRequest::setKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSecurityGroupPolicyRequest, DeleteSecurityGroupPolicyResponse> deleteSecurityGroupPolicy =
        genForDeleteSecurityGroupPolicy();

    private static HttpRequestDef<DeleteSecurityGroupPolicyRequest, DeleteSecurityGroupPolicyResponse> genForDeleteSecurityGroupPolicy() {
        // basic
        HttpRequestDef.Builder<DeleteSecurityGroupPolicyRequest, DeleteSecurityGroupPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteSecurityGroupPolicyRequest.class,
                    DeleteSecurityGroupPolicyResponse.class)
                .withName("DeleteSecurityGroupPolicy")
                .withUri("/v5/{project_id}/container-network/{cluster_id}/security-group-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecurityGroupPolicyRequest::getClusterId,
                DeleteSecurityGroupPolicyRequest::setClusterId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecurityGroupPolicyRequest::getEnterpriseProjectId,
                DeleteSecurityGroupPolicyRequest::setEnterpriseProjectId));
        builder.<DeleteSecurityGroupPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteSecurityGroupPolicyRequestBody.class),
            f -> f.withMarshaller(DeleteSecurityGroupPolicyRequest::getBody,
                DeleteSecurityGroupPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportContainerListRequest, ExportContainerListResponse> exportContainerList =
        genForExportContainerList();

    private static HttpRequestDef<ExportContainerListRequest, ExportContainerListResponse> genForExportContainerList() {
        // basic
        HttpRequestDef.Builder<ExportContainerListRequest, ExportContainerListResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportContainerListRequest.class, ExportContainerListResponse.class)
                .withName("ExportContainerList")
                .withUri("/v5/{project_id}/container/export-task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportContainerListRequest::getEnterpriseProjectId,
                ExportContainerListRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("export_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportContainerListRequest::getExportSize,
                ExportContainerListRequest::setExportSize));
        builder.<ExportContainerListRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportContainerListRequestBody.class),
            f -> f.withMarshaller(ExportContainerListRequest::getBody, ExportContainerListRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccountsRequest, ListAccountsResponse> listAccounts = genForListAccounts();

    private static HttpRequestDef<ListAccountsRequest, ListAccountsResponse> genForListAccounts() {
        // basic
        HttpRequestDef.Builder<ListAccountsRequest, ListAccountsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAccountsRequest.class, ListAccountsResponse.class)
                .withName("ListAccounts")
                .withUri("/v5/setting/account/accounts")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccountsRequest::getLimit, ListAccountsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccountsRequest::getOffset, ListAccountsRequest::setOffset));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountsRequest::getEnterpriseProjectId,
                ListAccountsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountsRequest::getXSecurityToken, ListAccountsRequest::setXSecurityToken));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountsRequest::getRegion, ListAccountsRequest::setRegion));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAccountsResponse::getXRequestId, ListAccountsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListAgentInstallScriptRequest, ListAgentInstallScriptResponse> listAgentInstallScript =
        genForListAgentInstallScript();

    private static HttpRequestDef<ListAgentInstallScriptRequest, ListAgentInstallScriptResponse> genForListAgentInstallScript() {
        // basic
        HttpRequestDef.Builder<ListAgentInstallScriptRequest, ListAgentInstallScriptResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAgentInstallScriptRequest.class, ListAgentInstallScriptResponse.class)
            .withName("ListAgentInstallScript")
            .withUri("/v5/{project_id}/setting/agent-install-script")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgentInstallScriptRequest::getEnterpriseProjectId,
                ListAgentInstallScriptRequest::setEnterpriseProjectId));
        builder.<ListAgentInstallScriptRequest.OsTypeEnum>withRequestField("os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAgentInstallScriptRequest.OsTypeEnum.class),
            f -> f.withMarshaller(ListAgentInstallScriptRequest::getOsType, ListAgentInstallScriptRequest::setOsType));
        builder.<ListAgentInstallScriptRequest.OsArchEnum>withRequestField("os_arch",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListAgentInstallScriptRequest.OsArchEnum.class),
            f -> f.withMarshaller(ListAgentInstallScriptRequest::getOsArch, ListAgentInstallScriptRequest::setOsArch));
        builder.<Boolean>withRequestField("outside_host",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAgentInstallScriptRequest::getOutsideHost,
                ListAgentInstallScriptRequest::setOutsideHost));
        builder.<String>withRequestField("outside_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgentInstallScriptRequest::getOutsideGroupId,
                ListAgentInstallScriptRequest::setOutsideGroupId));
        builder.<Boolean>withRequestField("batch_install",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAgentInstallScriptRequest::getBatchInstall,
                ListAgentInstallScriptRequest::setBatchInstall));
        builder.<ListAgentInstallScriptRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAgentInstallScriptRequest.TypeEnum.class),
            f -> f.withMarshaller(ListAgentInstallScriptRequest::getType, ListAgentInstallScriptRequest::setType));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgentInstallScriptRequest::getRegion, ListAgentInstallScriptRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmWhiteListRequest, ListAlarmWhiteListResponse> listAlarmWhiteList =
        genForListAlarmWhiteList();

    private static HttpRequestDef<ListAlarmWhiteListRequest, ListAlarmWhiteListResponse> genForListAlarmWhiteList() {
        // basic
        HttpRequestDef.Builder<ListAlarmWhiteListRequest, ListAlarmWhiteListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlarmWhiteListRequest.class, ListAlarmWhiteListResponse.class)
                .withName("ListAlarmWhiteList")
                .withUri("/v5/{project_id}/event/white-list/alarm")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmWhiteListRequest::getEnterpriseProjectId,
                ListAlarmWhiteListRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("hash",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmWhiteListRequest::getHash, ListAlarmWhiteListRequest::setHash));
        builder.<Integer>withRequestField("event_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmWhiteListRequest::getEventType, ListAlarmWhiteListRequest::setEventType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmWhiteListRequest::getOffset, ListAlarmWhiteListRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmWhiteListRequest::getLimit, ListAlarmWhiteListRequest::setLimit));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmWhiteListRequest::getRegion, ListAlarmWhiteListRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAntivirusHandleHistoryRequest, ListAntivirusHandleHistoryResponse> listAntivirusHandleHistory =
        genForListAntivirusHandleHistory();

    private static HttpRequestDef<ListAntivirusHandleHistoryRequest, ListAntivirusHandleHistoryResponse> genForListAntivirusHandleHistory() {
        // basic
        HttpRequestDef.Builder<ListAntivirusHandleHistoryRequest, ListAntivirusHandleHistoryResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAntivirusHandleHistoryRequest.class,
                    ListAntivirusHandleHistoryResponse.class)
                .withName("ListAntivirusHandleHistory")
                .withUri("/v5/{project_id}/antivirus/handle-history")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntivirusHandleHistoryRequest::getEnterpriseProjectId,
                ListAntivirusHandleHistoryRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAntivirusHandleHistoryRequest::getOffset,
                ListAntivirusHandleHistoryRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAntivirusHandleHistoryRequest::getLimit,
                ListAntivirusHandleHistoryRequest::setLimit));
        builder.<String>withRequestField("malware_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntivirusHandleHistoryRequest::getMalwareName,
                ListAntivirusHandleHistoryRequest::setMalwareName));
        builder.<String>withRequestField("file_path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntivirusHandleHistoryRequest::getFilePath,
                ListAntivirusHandleHistoryRequest::setFilePath));
        builder.<List<String>>withRequestField("severity_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAntivirusHandleHistoryRequest::getSeverityList,
                ListAntivirusHandleHistoryRequest::setSeverityList));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntivirusHandleHistoryRequest::getHostName,
                ListAntivirusHandleHistoryRequest::setHostName));
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntivirusHandleHistoryRequest::getPrivateIp,
                ListAntivirusHandleHistoryRequest::setPrivateIp));
        builder.<String>withRequestField("public_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntivirusHandleHistoryRequest::getPublicIp,
                ListAntivirusHandleHistoryRequest::setPublicIp));
        builder.<String>withRequestField("asset_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntivirusHandleHistoryRequest::getAssetValue,
                ListAntivirusHandleHistoryRequest::setAssetValue));
        builder.<String>withRequestField("handle_method",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntivirusHandleHistoryRequest::getHandleMethod,
                ListAntivirusHandleHistoryRequest::setHandleMethod));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntivirusHandleHistoryRequest::getUserName,
                ListAntivirusHandleHistoryRequest::setUserName));
        builder.<Integer>withRequestField("event_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAntivirusHandleHistoryRequest::getEventType,
                ListAntivirusHandleHistoryRequest::setEventType));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntivirusHandleHistoryRequest::getSortDir,
                ListAntivirusHandleHistoryRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntivirusHandleHistoryRequest::getSortKey,
                ListAntivirusHandleHistoryRequest::setSortKey));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntivirusHandleHistoryRequest::getRegion,
                ListAntivirusHandleHistoryRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppChangeHistoriesRequest, ListAppChangeHistoriesResponse> listAppChangeHistories =
        genForListAppChangeHistories();

    private static HttpRequestDef<ListAppChangeHistoriesRequest, ListAppChangeHistoriesResponse> genForListAppChangeHistories() {
        // basic
        HttpRequestDef.Builder<ListAppChangeHistoriesRequest, ListAppChangeHistoriesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAppChangeHistoriesRequest.class, ListAppChangeHistoriesResponse.class)
            .withName("ListAppChangeHistories")
            .withUri("/v5/{project_id}/asset/app/change-history")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppChangeHistoriesRequest::getEnterpriseProjectId,
                ListAppChangeHistoriesRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppChangeHistoriesRequest::getHostId, ListAppChangeHistoriesRequest::setHostId));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppChangeHistoriesRequest::getHostIp, ListAppChangeHistoriesRequest::setHostIp));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppChangeHistoriesRequest::getHostName,
                ListAppChangeHistoriesRequest::setHostName));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppChangeHistoriesRequest::getAppName,
                ListAppChangeHistoriesRequest::setAppName));
        builder.<String>withRequestField("variation_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppChangeHistoriesRequest::getVariationType,
                ListAppChangeHistoriesRequest::setVariationType));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppChangeHistoriesRequest::getSortKey,
                ListAppChangeHistoriesRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppChangeHistoriesRequest::getSortDir,
                ListAppChangeHistoriesRequest::setSortDir));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppChangeHistoriesRequest::getLimit, ListAppChangeHistoriesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppChangeHistoriesRequest::getOffset, ListAppChangeHistoriesRequest::setOffset));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAppChangeHistoriesRequest::getStartTime,
                ListAppChangeHistoriesRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAppChangeHistoriesRequest::getEndTime,
                ListAppChangeHistoriesRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppStatisticsRequest, ListAppStatisticsResponse> listAppStatistics =
        genForListAppStatistics();

    private static HttpRequestDef<ListAppStatisticsRequest, ListAppStatisticsResponse> genForListAppStatistics() {
        // basic
        HttpRequestDef.Builder<ListAppStatisticsRequest, ListAppStatisticsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppStatisticsRequest.class, ListAppStatisticsResponse.class)
                .withName("ListAppStatistics")
                .withUri("/v5/{project_id}/asset/app/statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppStatisticsRequest::getAppName, ListAppStatisticsRequest::setAppName));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppStatisticsRequest::getEnterpriseProjectId,
                ListAppStatisticsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppStatisticsRequest::getLimit, ListAppStatisticsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppStatisticsRequest::getOffset, ListAppStatisticsRequest::setOffset));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppStatisticsRequest::getCategory, ListAppStatisticsRequest::setCategory));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppsRequest, ListAppsResponse> listApps = genForListApps();

    private static HttpRequestDef<ListAppsRequest, ListAppsResponse> genForListApps() {
        // basic
        HttpRequestDef.Builder<ListAppsRequest, ListAppsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppsRequest.class, ListAppsResponse.class)
                .withName("ListApps")
                .withUri("/v5/{project_id}/asset/apps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getHostId, ListAppsRequest::setHostId));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getHostName, ListAppsRequest::setHostName));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getAppName, ListAppsRequest::setAppName));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getHostIp, ListAppsRequest::setHostIp));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getVersion, ListAppsRequest::setVersion));
        builder.<String>withRequestField("install_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getInstallDir, ListAppsRequest::setInstallDir));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getEnterpriseProjectId, ListAppsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppsRequest::getLimit, ListAppsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppsRequest::getOffset, ListAppsRequest::setOffset));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getCategory, ListAppsRequest::setCategory));
        builder.<Boolean>withRequestField("part_match",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAppsRequest::getPartMatch, ListAppsRequest::setPartMatch));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAutoLaunchChangeHistoriesRequest, ListAutoLaunchChangeHistoriesResponse> listAutoLaunchChangeHistories =
        genForListAutoLaunchChangeHistories();

    private static HttpRequestDef<ListAutoLaunchChangeHistoriesRequest, ListAutoLaunchChangeHistoriesResponse> genForListAutoLaunchChangeHistories() {
        // basic
        HttpRequestDef.Builder<ListAutoLaunchChangeHistoriesRequest, ListAutoLaunchChangeHistoriesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAutoLaunchChangeHistoriesRequest.class,
                    ListAutoLaunchChangeHistoriesResponse.class)
                .withName("ListAutoLaunchChangeHistories")
                .withUri("/v5/{project_id}/asset/auto-launch/change-history")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getEnterpriseProjectId,
                ListAutoLaunchChangeHistoriesRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getHostId,
                ListAutoLaunchChangeHistoriesRequest::setHostId));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getHostIp,
                ListAutoLaunchChangeHistoriesRequest::setHostIp));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getHostName,
                ListAutoLaunchChangeHistoriesRequest::setHostName));
        builder.<String>withRequestField("auto_launch_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getAutoLaunchName,
                ListAutoLaunchChangeHistoriesRequest::setAutoLaunchName));
        builder.<Integer>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getType,
                ListAutoLaunchChangeHistoriesRequest::setType));
        builder.<String>withRequestField("variation_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getVariationType,
                ListAutoLaunchChangeHistoriesRequest::setVariationType));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getSortKey,
                ListAutoLaunchChangeHistoriesRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getSortDir,
                ListAutoLaunchChangeHistoriesRequest::setSortDir));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getLimit,
                ListAutoLaunchChangeHistoriesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getOffset,
                ListAutoLaunchChangeHistoriesRequest::setOffset));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getStartTime,
                ListAutoLaunchChangeHistoriesRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAutoLaunchChangeHistoriesRequest::getEndTime,
                ListAutoLaunchChangeHistoriesRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAutoLaunchStatisticsRequest, ListAutoLaunchStatisticsResponse> listAutoLaunchStatistics =
        genForListAutoLaunchStatistics();

    private static HttpRequestDef<ListAutoLaunchStatisticsRequest, ListAutoLaunchStatisticsResponse> genForListAutoLaunchStatistics() {
        // basic
        HttpRequestDef.Builder<ListAutoLaunchStatisticsRequest, ListAutoLaunchStatisticsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListAutoLaunchStatisticsRequest.class, ListAutoLaunchStatisticsResponse.class)
                .withName("ListAutoLaunchStatistics")
                .withUri("/v5/{project_id}/asset/auto-launch/statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchStatisticsRequest::getName, ListAutoLaunchStatisticsRequest::setName));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchStatisticsRequest::getType, ListAutoLaunchStatisticsRequest::setType));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchStatisticsRequest::getEnterpriseProjectId,
                ListAutoLaunchStatisticsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAutoLaunchStatisticsRequest::getLimit,
                ListAutoLaunchStatisticsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAutoLaunchStatisticsRequest::getOffset,
                ListAutoLaunchStatisticsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAutoLaunchsRequest, ListAutoLaunchsResponse> listAutoLaunchs =
        genForListAutoLaunchs();

    private static HttpRequestDef<ListAutoLaunchsRequest, ListAutoLaunchsResponse> genForListAutoLaunchs() {
        // basic
        HttpRequestDef.Builder<ListAutoLaunchsRequest, ListAutoLaunchsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAutoLaunchsRequest.class, ListAutoLaunchsResponse.class)
                .withName("ListAutoLaunchs")
                .withUri("/v5/{project_id}/asset/auto-launchs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchsRequest::getHostId, ListAutoLaunchsRequest::setHostId));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchsRequest::getHostName, ListAutoLaunchsRequest::setHostName));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchsRequest::getName, ListAutoLaunchsRequest::setName));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchsRequest::getHostIp, ListAutoLaunchsRequest::setHostIp));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchsRequest::getType, ListAutoLaunchsRequest::setType));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoLaunchsRequest::getEnterpriseProjectId,
                ListAutoLaunchsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAutoLaunchsRequest::getLimit, ListAutoLaunchsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAutoLaunchsRequest::getOffset, ListAutoLaunchsRequest::setOffset));
        builder.<Boolean>withRequestField("part_match",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAutoLaunchsRequest::getPartMatch, ListAutoLaunchsRequest::setPartMatch));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBackupVaultsRequest, ListBackupVaultsResponse> listBackupVaults =
        genForListBackupVaults();

    private static HttpRequestDef<ListBackupVaultsRequest, ListBackupVaultsResponse> genForListBackupVaults() {
        // basic
        HttpRequestDef.Builder<ListBackupVaultsRequest, ListBackupVaultsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBackupVaultsRequest.class, ListBackupVaultsResponse.class)
                .withName("ListBackupVaults")
                .withUri("/v5/{project_id}/ransomware/optional/vaults")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackupVaultsRequest::getOffset, ListBackupVaultsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackupVaultsRequest::getLimit, ListBackupVaultsRequest::setLimit));
        builder.<String>withRequestField("vault_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupVaultsRequest::getVaultName, ListBackupVaultsRequest::setVaultName));
        builder.<String>withRequestField("vault_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupVaultsRequest::getVaultId, ListBackupVaultsRequest::setVaultId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBaselineWhiteListsRequest, ListBaselineWhiteListsResponse> listBaselineWhiteLists =
        genForListBaselineWhiteLists();

    private static HttpRequestDef<ListBaselineWhiteListsRequest, ListBaselineWhiteListsResponse> genForListBaselineWhiteLists() {
        // basic
        HttpRequestDef.Builder<ListBaselineWhiteListsRequest, ListBaselineWhiteListsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListBaselineWhiteListsRequest.class, ListBaselineWhiteListsResponse.class)
            .withName("ListBaselineWhiteLists")
            .withUri("/v5/{project_id}/baseline/whitelists")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBaselineWhiteListsRequest::getEnterpriseProjectId,
                ListBaselineWhiteListsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBaselineWhiteListsRequest::getOffset, ListBaselineWhiteListsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBaselineWhiteListsRequest::getLimit, ListBaselineWhiteListsRequest::setLimit));
        builder.<String>withRequestField("check_rule_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBaselineWhiteListsRequest::getCheckRuleName,
                ListBaselineWhiteListsRequest::setCheckRuleName));
        builder.<String>withRequestField("os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBaselineWhiteListsRequest::getOsType, ListBaselineWhiteListsRequest::setOsType));
        builder.<String>withRequestField("rule_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBaselineWhiteListsRequest::getRuleType,
                ListBaselineWhiteListsRequest::setRuleType));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBaselineWhiteListsRequest::getTag, ListBaselineWhiteListsRequest::setTag));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBaselineWhiteListsRequest::getDescription,
                ListBaselineWhiteListsRequest::setDescription));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBlockedIpRequest, ListBlockedIpResponse> listBlockedIp =
        genForListBlockedIp();

    private static HttpRequestDef<ListBlockedIpRequest, ListBlockedIpResponse> genForListBlockedIp() {
        // basic
        HttpRequestDef.Builder<ListBlockedIpRequest, ListBlockedIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBlockedIpRequest.class, ListBlockedIpResponse.class)
                .withName("ListBlockedIp")
                .withUri("/v5/{project_id}/event/blocked-ip")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBlockedIpRequest::getEnterpriseProjectId,
                ListBlockedIpRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("last_days",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBlockedIpRequest::getLastDays, ListBlockedIpRequest::setLastDays));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBlockedIpRequest::getHostName, ListBlockedIpRequest::setHostName));
        builder.<String>withRequestField("src_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBlockedIpRequest::getSrcIp, ListBlockedIpRequest::setSrcIp));
        builder.<String>withRequestField("intercept_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBlockedIpRequest::getInterceptStatus, ListBlockedIpRequest::setInterceptStatus));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBlockedIpRequest::getOffset, ListBlockedIpRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBlockedIpRequest::getLimit, ListBlockedIpRequest::setLimit));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBlockedIpRequest::getRegion, ListBlockedIpRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCceClusterConfigRequest, ListCceClusterConfigResponse> listCceClusterConfig =
        genForListCceClusterConfig();

    private static HttpRequestDef<ListCceClusterConfigRequest, ListCceClusterConfigResponse> genForListCceClusterConfig() {
        // basic
        HttpRequestDef.Builder<ListCceClusterConfigRequest, ListCceClusterConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListCceClusterConfigRequest.class, ListCceClusterConfigResponse.class)
            .withName("ListCceClusterConfig")
            .withUri("/v5/{project_id}/container/kubernetes/clusters/configs/batch-query")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCceClusterConfigRequest::getEnterpriseProjectId,
                ListCceClusterConfigRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCceClusterConfigRequest::getRegion, ListCceClusterConfigRequest::setRegion));
        builder.<CCEClusterInfoListRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CCEClusterInfoListRequestBody.class),
            f -> f.withMarshaller(ListCceClusterConfigRequest::getBody, ListCceClusterConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCceClusterDetectRiskRequest, ListCceClusterDetectRiskResponse> listCceClusterDetectRisk =
        genForListCceClusterDetectRisk();

    private static HttpRequestDef<ListCceClusterDetectRiskRequest, ListCceClusterDetectRiskResponse> genForListCceClusterDetectRisk() {
        // basic
        HttpRequestDef.Builder<ListCceClusterDetectRiskRequest, ListCceClusterDetectRiskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ListCceClusterDetectRiskRequest.class, ListCceClusterDetectRiskResponse.class)
                .withName("ListCceClusterDetectRisk")
                .withUri("/v5/{project_id}/container/kubernetes/clusters/risks/query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCceClusterDetectRiskRequest::getEnterpriseProjectId,
                ListCceClusterDetectRiskRequest::setEnterpriseProjectId));
        builder.<CCEClusterIdListRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CCEClusterIdListRequestBody.class),
            f -> f.withMarshaller(ListCceClusterDetectRiskRequest::getBody, ListCceClusterDetectRiskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCheckFeatureRuleRequest, ListCheckFeatureRuleResponse> listCheckFeatureRule =
        genForListCheckFeatureRule();

    private static HttpRequestDef<ListCheckFeatureRuleRequest, ListCheckFeatureRuleResponse> genForListCheckFeatureRule() {
        // basic
        HttpRequestDef.Builder<ListCheckFeatureRuleRequest, ListCheckFeatureRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListCheckFeatureRuleRequest.class, ListCheckFeatureRuleResponse.class)
            .withName("ListCheckFeatureRule")
            .withUri("/v5/{project_id}/rasp/rule")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCheckFeatureRuleRequest::getEnterpriseProjectId,
                ListCheckFeatureRuleRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCheckFeatureRuleRequest::getOsType, ListCheckFeatureRuleRequest::setOsType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterAuditLogsRequest, ListClusterAuditLogsResponse> listClusterAuditLogs =
        genForListClusterAuditLogs();

    private static HttpRequestDef<ListClusterAuditLogsRequest, ListClusterAuditLogsResponse> genForListClusterAuditLogs() {
        // basic
        HttpRequestDef.Builder<ListClusterAuditLogsRequest, ListClusterAuditLogsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListClusterAuditLogsRequest.class, ListClusterAuditLogsResponse.class)
            .withName("ListClusterAuditLogs")
            .withUri("/v5/{project_id}/container/kubernetes/cluster/audit-logs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterAuditLogsRequest::getEnterpriseProjectId,
                ListClusterAuditLogsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterAuditLogsRequest::getClusterId,
                ListClusterAuditLogsRequest::setClusterId));
        builder.<String>withRequestField("cluster_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterAuditLogsRequest::getClusterName,
                ListClusterAuditLogsRequest::setClusterName));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterAuditLogsRequest::getHostName, ListClusterAuditLogsRequest::setHostName));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterAuditLogsRequest::getHostId, ListClusterAuditLogsRequest::setHostId));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterAuditLogsRequest::getHostIp, ListClusterAuditLogsRequest::setHostIp));
        builder.<String>withRequestField("verb",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterAuditLogsRequest::getVerb, ListClusterAuditLogsRequest::setVerb));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListClusterAuditLogsRequest::getStartTime,
                ListClusterAuditLogsRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListClusterAuditLogsRequest::getEndTime, ListClusterAuditLogsRequest::setEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClusterAuditLogsRequest::getLimit, ListClusterAuditLogsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClusterAuditLogsRequest::getOffset, ListClusterAuditLogsRequest::setOffset));
        builder.<String>withRequestField("line_num",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterAuditLogsRequest::getLineNum, ListClusterAuditLogsRequest::setLineNum));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterEventLogsRequest, ListClusterEventLogsResponse> listClusterEventLogs =
        genForListClusterEventLogs();

    private static HttpRequestDef<ListClusterEventLogsRequest, ListClusterEventLogsResponse> genForListClusterEventLogs() {
        // basic
        HttpRequestDef.Builder<ListClusterEventLogsRequest, ListClusterEventLogsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListClusterEventLogsRequest.class, ListClusterEventLogsResponse.class)
            .withName("ListClusterEventLogs")
            .withUri("/v5/{project_id}/container/kubernetes/cluster/events")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterEventLogsRequest::getEnterpriseProjectId,
                ListClusterEventLogsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterEventLogsRequest::getClusterId,
                ListClusterEventLogsRequest::setClusterId));
        builder.<String>withRequestField("cluster_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterEventLogsRequest::getClusterName,
                ListClusterEventLogsRequest::setClusterName));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterEventLogsRequest::getNamespace,
                ListClusterEventLogsRequest::setNamespace));
        builder.<String>withRequestField("event_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterEventLogsRequest::getEventName,
                ListClusterEventLogsRequest::setEventName));
        builder.<String>withRequestField("event_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterEventLogsRequest::getEventType,
                ListClusterEventLogsRequest::setEventType));
        builder.<String>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterEventLogsRequest::getResourceType,
                ListClusterEventLogsRequest::setResourceType));
        builder.<String>withRequestField("resource_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterEventLogsRequest::getResourceName,
                ListClusterEventLogsRequest::setResourceName));
        builder.<String>withRequestField("reason",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterEventLogsRequest::getReason, ListClusterEventLogsRequest::setReason));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListClusterEventLogsRequest::getStartTime,
                ListClusterEventLogsRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListClusterEventLogsRequest::getEndTime, ListClusterEventLogsRequest::setEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClusterEventLogsRequest::getLimit, ListClusterEventLogsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClusterEventLogsRequest::getOffset, ListClusterEventLogsRequest::setOffset));
        builder.<String>withRequestField("line_num",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterEventLogsRequest::getLineNum, ListClusterEventLogsRequest::setLineNum));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterEventsRequest, ListClusterEventsResponse> listClusterEvents =
        genForListClusterEvents();

    private static HttpRequestDef<ListClusterEventsRequest, ListClusterEventsResponse> genForListClusterEvents() {
        // basic
        HttpRequestDef.Builder<ListClusterEventsRequest, ListClusterEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListClusterEventsRequest.class, ListClusterEventsResponse.class)
                .withName("ListClusterEvents")
                .withUri("/v5/{project_id}/cluster-protect/events")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterEventsRequest::getEnterpriseProjectId,
                ListClusterEventsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClusterEventsRequest::getOffset, ListClusterEventsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClusterEventsRequest::getLimit, ListClusterEventsRequest::setLimit));
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterEventsRequest::getClusterId, ListClusterEventsRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterProtectOverviewRequest, ListClusterProtectOverviewResponse> listClusterProtectOverview =
        genForListClusterProtectOverview();

    private static HttpRequestDef<ListClusterProtectOverviewRequest, ListClusterProtectOverviewResponse> genForListClusterProtectOverview() {
        // basic
        HttpRequestDef.Builder<ListClusterProtectOverviewRequest, ListClusterProtectOverviewResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListClusterProtectOverviewRequest.class,
                    ListClusterProtectOverviewResponse.class)
                .withName("ListClusterProtectOverview")
                .withUri("/v5/{project_id}/cluster-protect/overview")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterProtectOverviewRequest::getEnterpriseProjectId,
                ListClusterProtectOverviewRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterProtectPolicyTemplatesRequest, ListClusterProtectPolicyTemplatesResponse> listClusterProtectPolicyTemplates =
        genForListClusterProtectPolicyTemplates();

    private static HttpRequestDef<ListClusterProtectPolicyTemplatesRequest, ListClusterProtectPolicyTemplatesResponse> genForListClusterProtectPolicyTemplates() {
        // basic
        HttpRequestDef.Builder<ListClusterProtectPolicyTemplatesRequest, ListClusterProtectPolicyTemplatesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListClusterProtectPolicyTemplatesRequest.class,
                    ListClusterProtectPolicyTemplatesResponse.class)
                .withName("ListClusterProtectPolicyTemplates")
                .withUri("/v5/{project_id}/container/clusters/protection-policy-templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterProtectPolicyTemplatesRequest::getEnterpriseProjectId,
                ListClusterProtectPolicyTemplatesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClusterProtectPolicyTemplatesRequest::getLimit,
                ListClusterProtectPolicyTemplatesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClusterProtectPolicyTemplatesRequest::getOffset,
                ListClusterProtectPolicyTemplatesRequest::setOffset));
        builder.<String>withRequestField("template_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterProtectPolicyTemplatesRequest::getTemplateName,
                ListClusterProtectPolicyTemplatesRequest::setTemplateName));
        builder.<String>withRequestField("template_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterProtectPolicyTemplatesRequest::getTemplateType,
                ListClusterProtectPolicyTemplatesRequest::setTemplateType));
        builder.<String>withRequestField("target_kind",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterProtectPolicyTemplatesRequest::getTargetKind,
                ListClusterProtectPolicyTemplatesRequest::setTargetKind));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterProtectPolicyTemplatesRequest::getTag,
                ListClusterProtectPolicyTemplatesRequest::setTag));
        builder.<String>withRequestField("level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterProtectPolicyTemplatesRequest::getLevel,
                ListClusterProtectPolicyTemplatesRequest::setLevel));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterProtectionDefaultPolicyRequest, ListClusterProtectionDefaultPolicyResponse> listClusterProtectionDefaultPolicy =
        genForListClusterProtectionDefaultPolicy();

    private static HttpRequestDef<ListClusterProtectionDefaultPolicyRequest, ListClusterProtectionDefaultPolicyResponse> genForListClusterProtectionDefaultPolicy() {
        // basic
        HttpRequestDef.Builder<ListClusterProtectionDefaultPolicyRequest, ListClusterProtectionDefaultPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListClusterProtectionDefaultPolicyRequest.class,
                    ListClusterProtectionDefaultPolicyResponse.class)
                .withName("ListClusterProtectionDefaultPolicy")
                .withUri("/v5/{project_id}/cluster-protect/default-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterProtectionDefaultPolicyRequest::getEnterpriseProjectId,
                ListClusterProtectionDefaultPolicyRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClusterProtectionDefaultPolicyRequest::getOffset,
                ListClusterProtectionDefaultPolicyRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClusterProtectionDefaultPolicyRequest::getLimit,
                ListClusterProtectionDefaultPolicyRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterProtectionInfoRequest, ListClusterProtectionInfoResponse> listClusterProtectionInfo =
        genForListClusterProtectionInfo();

    private static HttpRequestDef<ListClusterProtectionInfoRequest, ListClusterProtectionInfoResponse> genForListClusterProtectionInfo() {
        // basic
        HttpRequestDef.Builder<ListClusterProtectionInfoRequest, ListClusterProtectionInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListClusterProtectionInfoRequest.class,
                    ListClusterProtectionInfoResponse.class)
                .withName("ListClusterProtectionInfo")
                .withUri("/v5/{project_id}/cluster-protect/clusters")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterProtectionInfoRequest::getEnterpriseProjectId,
                ListClusterProtectionInfoRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClusterProtectionInfoRequest::getOffset,
                ListClusterProtectionInfoRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClusterProtectionInfoRequest::getLimit,
                ListClusterProtectionInfoRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterProtectionItemRequest, ListClusterProtectionItemResponse> listClusterProtectionItem =
        genForListClusterProtectionItem();

    private static HttpRequestDef<ListClusterProtectionItemRequest, ListClusterProtectionItemResponse> genForListClusterProtectionItem() {
        // basic
        HttpRequestDef.Builder<ListClusterProtectionItemRequest, ListClusterProtectionItemResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListClusterProtectionItemRequest.class,
                    ListClusterProtectionItemResponse.class)
                .withName("ListClusterProtectionItem")
                .withUri("/v5/{project_id}/cluster-protect/protection-item")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterProtectionItemRequest::getEnterpriseProjectId,
                ListClusterProtectionItemRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterProtectionPolicyRequest, ListClusterProtectionPolicyResponse> listClusterProtectionPolicy =
        genForListClusterProtectionPolicy();

    private static HttpRequestDef<ListClusterProtectionPolicyRequest, ListClusterProtectionPolicyResponse> genForListClusterProtectionPolicy() {
        // basic
        HttpRequestDef.Builder<ListClusterProtectionPolicyRequest, ListClusterProtectionPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListClusterProtectionPolicyRequest.class,
                    ListClusterProtectionPolicyResponse.class)
                .withName("ListClusterProtectionPolicy")
                .withUri("/v5/{project_id}/cluster-protect/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterProtectionPolicyRequest::getEnterpriseProjectId,
                ListClusterProtectionPolicyRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClusterProtectionPolicyRequest::getOffset,
                ListClusterProtectionPolicyRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClusterProtectionPolicyRequest::getLimit,
                ListClusterProtectionPolicyRequest::setLimit));
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterProtectionPolicyRequest::getClusterId,
                ListClusterProtectionPolicyRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterProtectionPolicyDetailRequest, ListClusterProtectionPolicyDetailResponse> listClusterProtectionPolicyDetail =
        genForListClusterProtectionPolicyDetail();

    private static HttpRequestDef<ListClusterProtectionPolicyDetailRequest, ListClusterProtectionPolicyDetailResponse> genForListClusterProtectionPolicyDetail() {
        // basic
        HttpRequestDef.Builder<ListClusterProtectionPolicyDetailRequest, ListClusterProtectionPolicyDetailResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListClusterProtectionPolicyDetailRequest.class,
                    ListClusterProtectionPolicyDetailResponse.class)
                .withName("ListClusterProtectionPolicyDetail")
                .withUri("/v5/{project_id}/cluster-protect/policy/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterProtectionPolicyDetailRequest::getPolicyId,
                ListClusterProtectionPolicyDetailRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterProtectionPolicyDetailRequest::getEnterpriseProjectId,
                ListClusterProtectionPolicyDetailRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCommonTipsRequest, ListCommonTipsResponse> listCommonTips =
        genForListCommonTips();

    private static HttpRequestDef<ListCommonTipsRequest, ListCommonTipsResponse> genForListCommonTips() {
        // basic
        HttpRequestDef.Builder<ListCommonTipsRequest, ListCommonTipsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCommonTipsRequest.class, ListCommonTipsResponse.class)
                .withName("ListCommonTips")
                .withUri("/v5/{project_id}/common/tips")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommonTipsRequest::getEnterpriseProjectId,
                ListCommonTipsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCommonTipsRequest::getLimit, ListCommonTipsRequest::setLimit));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommonTipsRequest::getType, ListCommonTipsRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListContainerCmdLogsRequest, ListContainerCmdLogsResponse> listContainerCmdLogs =
        genForListContainerCmdLogs();

    private static HttpRequestDef<ListContainerCmdLogsRequest, ListContainerCmdLogsResponse> genForListContainerCmdLogs() {
        // basic
        HttpRequestDef.Builder<ListContainerCmdLogsRequest, ListContainerCmdLogsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListContainerCmdLogsRequest.class, ListContainerCmdLogsResponse.class)
            .withName("ListContainerCmdLogs")
            .withUri("/v5/{project_id}/container/cmd-histories")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerCmdLogsRequest::getEnterpriseProjectId,
                ListContainerCmdLogsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerCmdLogsRequest::getClusterId,
                ListContainerCmdLogsRequest::setClusterId));
        builder.<String>withRequestField("cluster_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerCmdLogsRequest::getClusterName,
                ListContainerCmdLogsRequest::setClusterName));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerCmdLogsRequest::getHostName, ListContainerCmdLogsRequest::setHostName));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerCmdLogsRequest::getHostId, ListContainerCmdLogsRequest::setHostId));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerCmdLogsRequest::getHostIp, ListContainerCmdLogsRequest::setHostIp));
        builder.<String>withRequestField("container_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerCmdLogsRequest::getContainerId,
                ListContainerCmdLogsRequest::setContainerId));
        builder.<String>withRequestField("container_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerCmdLogsRequest::getContainerName,
                ListContainerCmdLogsRequest::setContainerName));
        builder.<String>withRequestField("cmd",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerCmdLogsRequest::getCmd, ListContainerCmdLogsRequest::setCmd));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerCmdLogsRequest::getPath, ListContainerCmdLogsRequest::setPath));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListContainerCmdLogsRequest::getStartTime,
                ListContainerCmdLogsRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListContainerCmdLogsRequest::getEndTime, ListContainerCmdLogsRequest::setEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListContainerCmdLogsRequest::getLimit, ListContainerCmdLogsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListContainerCmdLogsRequest::getOffset, ListContainerCmdLogsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListContainerImageLogsRequest, ListContainerImageLogsResponse> listContainerImageLogs =
        genForListContainerImageLogs();

    private static HttpRequestDef<ListContainerImageLogsRequest, ListContainerImageLogsResponse> genForListContainerImageLogs() {
        // basic
        HttpRequestDef.Builder<ListContainerImageLogsRequest, ListContainerImageLogsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListContainerImageLogsRequest.class, ListContainerImageLogsResponse.class)
            .withName("ListContainerImageLogs")
            .withUri("/v5/{project_id}/container/image/events")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerImageLogsRequest::getResourceName,
                ListContainerImageLogsRequest::setResourceName));
        builder.<String>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerImageLogsRequest::getResourceType,
                ListContainerImageLogsRequest::setResourceType));
        builder.<String>withRequestField("event_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerImageLogsRequest::getEventType,
                ListContainerImageLogsRequest::setEventType));
        builder.<String>withRequestField("event_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerImageLogsRequest::getEventName,
                ListContainerImageLogsRequest::setEventName));
        builder.<String>withRequestField("source_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerImageLogsRequest::getSourceIp,
                ListContainerImageLogsRequest::setSourceIp));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerImageLogsRequest::getUserName,
                ListContainerImageLogsRequest::setUserName));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListContainerImageLogsRequest::getStartTime,
                ListContainerImageLogsRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListContainerImageLogsRequest::getEndTime,
                ListContainerImageLogsRequest::setEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListContainerImageLogsRequest::getLimit, ListContainerImageLogsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListContainerImageLogsRequest::getOffset, ListContainerImageLogsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListContainerImagesRequest, ListContainerImagesResponse> listContainerImages =
        genForListContainerImages();

    private static HttpRequestDef<ListContainerImagesRequest, ListContainerImagesResponse> genForListContainerImages() {
        // basic
        HttpRequestDef.Builder<ListContainerImagesRequest, ListContainerImagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListContainerImagesRequest.class, ListContainerImagesResponse.class)
                .withName("ListContainerImages")
                .withUri("/v5/{project_id}/container/images")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerImagesRequest::getEnterpriseProjectId,
                ListContainerImagesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListContainerImagesRequest::getLimit, ListContainerImagesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListContainerImagesRequest::getOffset, ListContainerImagesRequest::setOffset));
        builder.<String>withRequestField("keyword",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerImagesRequest::getKeyword, ListContainerImagesRequest::setKeyword));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListContainerLogsRequest, ListContainerLogsResponse> listContainerLogs =
        genForListContainerLogs();

    private static HttpRequestDef<ListContainerLogsRequest, ListContainerLogsResponse> genForListContainerLogs() {
        // basic
        HttpRequestDef.Builder<ListContainerLogsRequest, ListContainerLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListContainerLogsRequest.class, ListContainerLogsResponse.class)
                .withName("ListContainerLogs")
                .withUri("/v5/{project_id}/container/logs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerLogsRequest::getEnterpriseProjectId,
                ListContainerLogsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerLogsRequest::getClusterId, ListContainerLogsRequest::setClusterId));
        builder.<String>withRequestField("cluster_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerLogsRequest::getClusterName, ListContainerLogsRequest::setClusterName));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerLogsRequest::getNamespace, ListContainerLogsRequest::setNamespace));
        builder.<String>withRequestField("pod_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerLogsRequest::getPodName, ListContainerLogsRequest::setPodName));
        builder.<String>withRequestField("pod_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerLogsRequest::getPodId, ListContainerLogsRequest::setPodId));
        builder.<String>withRequestField("pod_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerLogsRequest::getPodIp, ListContainerLogsRequest::setPodIp));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerLogsRequest::getHostIp, ListContainerLogsRequest::setHostIp));
        builder.<String>withRequestField("container_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerLogsRequest::getContainerId, ListContainerLogsRequest::setContainerId));
        builder.<String>withRequestField("container_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerLogsRequest::getContainerName,
                ListContainerLogsRequest::setContainerName));
        builder.<String>withRequestField("content",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerLogsRequest::getContent, ListContainerLogsRequest::setContent));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListContainerLogsRequest::getStartTime, ListContainerLogsRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListContainerLogsRequest::getEndTime, ListContainerLogsRequest::setEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListContainerLogsRequest::getLimit, ListContainerLogsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListContainerLogsRequest::getOffset, ListContainerLogsRequest::setOffset));
        builder.<String>withRequestField("line_num",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerLogsRequest::getLineNum, ListContainerLogsRequest::setLineNum));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListContainerNetworkClustersRequest, ListContainerNetworkClustersResponse> listContainerNetworkClusters =
        genForListContainerNetworkClusters();

    private static HttpRequestDef<ListContainerNetworkClustersRequest, ListContainerNetworkClustersResponse> genForListContainerNetworkClusters() {
        // basic
        HttpRequestDef.Builder<ListContainerNetworkClustersRequest, ListContainerNetworkClustersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListContainerNetworkClustersRequest.class,
                    ListContainerNetworkClustersResponse.class)
                .withName("ListContainerNetworkClusters")
                .withUri("/v5/{project_id}/container-network/cluster")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerNetworkClustersRequest::getEnterpriseProjectId,
                ListContainerNetworkClustersRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListContainerNetworkClustersRequest::getLimit,
                ListContainerNetworkClustersRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListContainerNetworkClustersRequest::getOffset,
                ListContainerNetworkClustersRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListContainerNetworkNodeListRequest, ListContainerNetworkNodeListResponse> listContainerNetworkNodeList =
        genForListContainerNetworkNodeList();

    private static HttpRequestDef<ListContainerNetworkNodeListRequest, ListContainerNetworkNodeListResponse> genForListContainerNetworkNodeList() {
        // basic
        HttpRequestDef.Builder<ListContainerNetworkNodeListRequest, ListContainerNetworkNodeListResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListContainerNetworkNodeListRequest.class,
                    ListContainerNetworkNodeListResponse.class)
                .withName("ListContainerNetworkNodeList")
                .withUri("/v5/{project_id}/container-network/{cluster_id}/node")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerNetworkNodeListRequest::getClusterId,
                ListContainerNetworkNodeListRequest::setClusterId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerNetworkNodeListRequest::getEnterpriseProjectId,
                ListContainerNetworkNodeListRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListContainerNetworkNodeListRequest::getLimit,
                ListContainerNetworkNodeListRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListContainerNetworkNodeListRequest::getOffset,
                ListContainerNetworkNodeListRequest::setOffset));
        builder.<String>withRequestField("query_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerNetworkNodeListRequest::getQueryField,
                ListContainerNetworkNodeListRequest::setQueryField));
        builder.<String>withRequestField("query_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerNetworkNodeListRequest::getQueryValue,
                ListContainerNetworkNodeListRequest::setQueryValue));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListContainerNetworkPolicyRequest, ListContainerNetworkPolicyResponse> listContainerNetworkPolicy =
        genForListContainerNetworkPolicy();

    private static HttpRequestDef<ListContainerNetworkPolicyRequest, ListContainerNetworkPolicyResponse> genForListContainerNetworkPolicy() {
        // basic
        HttpRequestDef.Builder<ListContainerNetworkPolicyRequest, ListContainerNetworkPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListContainerNetworkPolicyRequest.class,
                    ListContainerNetworkPolicyResponse.class)
                .withName("ListContainerNetworkPolicy")
                .withUri("/v5/{project_id}/container-network/{cluster_id}/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerNetworkPolicyRequest::getClusterId,
                ListContainerNetworkPolicyRequest::setClusterId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerNetworkPolicyRequest::getEnterpriseProjectId,
                ListContainerNetworkPolicyRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListContainerNetworkPolicyRequest::getLimit,
                ListContainerNetworkPolicyRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListContainerNetworkPolicyRequest::getOffset,
                ListContainerNetworkPolicyRequest::setOffset));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerNetworkPolicyRequest::getNamespace,
                ListContainerNetworkPolicyRequest::setNamespace));
        builder.<String>withRequestField("keyword",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerNetworkPolicyRequest::getKeyword,
                ListContainerNetworkPolicyRequest::setKeyword));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListContainerNodesRequest, ListContainerNodesResponse> listContainerNodes =
        genForListContainerNodes();

    private static HttpRequestDef<ListContainerNodesRequest, ListContainerNodesResponse> genForListContainerNodes() {
        // basic
        HttpRequestDef.Builder<ListContainerNodesRequest, ListContainerNodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListContainerNodesRequest.class, ListContainerNodesResponse.class)
                .withName("ListContainerNodes")
                .withUri("/v5/{project_id}/container/nodes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerNodesRequest::getEnterpriseProjectId,
                ListContainerNodesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListContainerNodesRequest::getOffset, ListContainerNodesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListContainerNodesRequest::getLimit, ListContainerNodesRequest::setLimit));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerNodesRequest::getHostName, ListContainerNodesRequest::setHostName));
        builder.<String>withRequestField("agent_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerNodesRequest::getAgentStatus,
                ListContainerNodesRequest::setAgentStatus));
        builder.<String>withRequestField("protect_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerNodesRequest::getProtectStatus,
                ListContainerNodesRequest::setProtectStatus));
        builder.<String>withRequestField("container_tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerNodesRequest::getContainerTags,
                ListContainerNodesRequest::setContainerTags));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainerNodesRequest::getRegion, ListContainerNodesRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListContainersRequest, ListContainersResponse> listContainers =
        genForListContainers();

    private static HttpRequestDef<ListContainersRequest, ListContainersResponse> genForListContainers() {
        // basic
        HttpRequestDef.Builder<ListContainersRequest, ListContainersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListContainersRequest.class, ListContainersResponse.class)
                .withName("ListContainers")
                .withUri("/v5/{project_id}/container/kubernetes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainersRequest::getEnterpriseProjectId,
                ListContainersRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("container_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainersRequest::getContainerName, ListContainersRequest::setContainerName));
        builder.<String>withRequestField("pod_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainersRequest::getPodName, ListContainersRequest::setPodName));
        builder.<String>withRequestField("image_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListContainersRequest::getImageName, ListContainersRequest::setImageName));
        builder.<Boolean>withRequestField("cluster_container",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListContainersRequest::getClusterContainer,
                ListContainersRequest::setClusterContainer));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListContainersRequest::getLimit, ListContainersRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListContainersRequest::getOffset, ListContainersRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDecoyPortPolicyRequest, ListDecoyPortPolicyResponse> listDecoyPortPolicy =
        genForListDecoyPortPolicy();

    private static HttpRequestDef<ListDecoyPortPolicyRequest, ListDecoyPortPolicyResponse> genForListDecoyPortPolicy() {
        // basic
        HttpRequestDef.Builder<ListDecoyPortPolicyRequest, ListDecoyPortPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDecoyPortPolicyRequest.class, ListDecoyPortPolicyResponse.class)
                .withName("ListDecoyPortPolicy")
                .withUri("/v5/{project_id}/honeypot-port/policy-list")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDecoyPortPolicyRequest::getEnterpriseProjectId,
                ListDecoyPortPolicyRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDecoyPortPolicyRequest::getOffset, ListDecoyPortPolicyRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDecoyPortPolicyRequest::getLimit, ListDecoyPortPolicyRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDownloadExportedFileRequest, ListDownloadExportedFileResponse> listDownloadExportedFile =
        genForListDownloadExportedFile();

    private static HttpRequestDef<ListDownloadExportedFileRequest, ListDownloadExportedFileResponse> genForListDownloadExportedFile() {
        // basic
        HttpRequestDef.Builder<ListDownloadExportedFileRequest, ListDownloadExportedFileResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListDownloadExportedFileRequest.class, ListDownloadExportedFileResponse.class)
                .withName("ListDownloadExportedFile")
                .withUri("/v5/{project_id}/download/{file_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("file_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDownloadExportedFileRequest::getFileId,
                ListDownloadExportedFileRequest::setFileId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDownloadExportedFileRequest::getEnterpriseProjectId,
                ListDownloadExportedFileRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDownloadExportedFileRequest::getRegion,
                ListDownloadExportedFileRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEventHandleHistoryRequest, ListEventHandleHistoryResponse> listEventHandleHistory =
        genForListEventHandleHistory();

    private static HttpRequestDef<ListEventHandleHistoryRequest, ListEventHandleHistoryResponse> genForListEventHandleHistory() {
        // basic
        HttpRequestDef.Builder<ListEventHandleHistoryRequest, ListEventHandleHistoryResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListEventHandleHistoryRequest.class, ListEventHandleHistoryResponse.class)
            .withName("ListEventHandleHistory")
            .withUri("/v5/{project_id}/event/handle-history")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventHandleHistoryRequest::getEnterpriseProjectId,
                ListEventHandleHistoryRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("severity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventHandleHistoryRequest::getSeverity,
                ListEventHandleHistoryRequest::setSeverity));
        builder.<String>withRequestField("attack_tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventHandleHistoryRequest::getAttackTag,
                ListEventHandleHistoryRequest::setAttackTag));
        builder.<String>withRequestField("asset_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventHandleHistoryRequest::getAssetValue,
                ListEventHandleHistoryRequest::setAssetValue));
        builder.<List<String>>withRequestField("event_class_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEventHandleHistoryRequest::getEventClassIds,
                ListEventHandleHistoryRequest::setEventClassIds));
        builder.<String>withRequestField("event_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventHandleHistoryRequest::getEventName,
                ListEventHandleHistoryRequest::setEventName));
        builder.<Integer>withRequestField("event_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEventHandleHistoryRequest::getEventType,
                ListEventHandleHistoryRequest::setEventType));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventHandleHistoryRequest::getHostName,
                ListEventHandleHistoryRequest::setHostName));
        builder.<String>withRequestField("handle_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventHandleHistoryRequest::getHandleStatus,
                ListEventHandleHistoryRequest::setHandleStatus));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventHandleHistoryRequest::getHostIp, ListEventHandleHistoryRequest::setHostIp));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEventHandleHistoryRequest::getLimit, ListEventHandleHistoryRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEventHandleHistoryRequest::getOffset, ListEventHandleHistoryRequest::setOffset));
        builder.<String>withRequestField("public_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventHandleHistoryRequest::getPublicIp,
                ListEventHandleHistoryRequest::setPublicIp));
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventHandleHistoryRequest::getPrivateIp,
                ListEventHandleHistoryRequest::setPrivateIp));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventHandleHistoryRequest::getSortDir,
                ListEventHandleHistoryRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventHandleHistoryRequest::getSortKey,
                ListEventHandleHistoryRequest::setSortKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGlobalAssetScanTaskRequest, ListGlobalAssetScanTaskResponse> listGlobalAssetScanTask =
        genForListGlobalAssetScanTask();

    private static HttpRequestDef<ListGlobalAssetScanTaskRequest, ListGlobalAssetScanTaskResponse> genForListGlobalAssetScanTask() {
        // basic
        HttpRequestDef.Builder<ListGlobalAssetScanTaskRequest, ListGlobalAssetScanTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListGlobalAssetScanTaskRequest.class, ListGlobalAssetScanTaskResponse.class)
            .withName("ListGlobalAssetScanTask")
            .withUri("/v5/{project_id}/asset/assign-task")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGlobalAssetScanTaskRequest::getEnterpriseProjectId,
                ListGlobalAssetScanTaskRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGlobalAssetScanTaskRequest::getCategory,
                ListGlobalAssetScanTaskRequest::setCategory));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostGroupsRequest, ListHostGroupsResponse> listHostGroups =
        genForListHostGroups();

    private static HttpRequestDef<ListHostGroupsRequest, ListHostGroupsResponse> genForListHostGroups() {
        // basic
        HttpRequestDef.Builder<ListHostGroupsRequest, ListHostGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHostGroupsRequest.class, ListHostGroupsResponse.class)
                .withName("ListHostGroups")
                .withUri("/v5/{project_id}/host-management/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostGroupsRequest::getEnterpriseProjectId,
                ListHostGroupsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostGroupsRequest::getOffset, ListHostGroupsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostGroupsRequest::getLimit, ListHostGroupsRequest::setLimit));
        builder.<String>withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostGroupsRequest::getGroupName, ListHostGroupsRequest::setGroupName));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostGroupsRequest::getRegion, ListHostGroupsRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostStatusRequest, ListHostStatusResponse> listHostStatus =
        genForListHostStatus();

    private static HttpRequestDef<ListHostStatusRequest, ListHostStatusResponse> genForListHostStatus() {
        // basic
        HttpRequestDef.Builder<ListHostStatusRequest, ListHostStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHostStatusRequest.class, ListHostStatusResponse.class)
                .withName("ListHostStatus")
                .withUri("/v5/{project_id}/host-management/hosts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getEnterpriseProjectId,
                ListHostStatusRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getVersion, ListHostStatusRequest::setVersion));
        builder.<String>withRequestField("agent_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getAgentStatus, ListHostStatusRequest::setAgentStatus));
        builder.<String>withRequestField("detect_result",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getDetectResult, ListHostStatusRequest::setDetectResult));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getHostName, ListHostStatusRequest::setHostName));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getHostId, ListHostStatusRequest::setHostId));
        builder.<String>withRequestField("host_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getHostStatus, ListHostStatusRequest::setHostStatus));
        builder.<String>withRequestField("os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getOsType, ListHostStatusRequest::setOsType));
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getPrivateIp, ListHostStatusRequest::setPrivateIp));
        builder.<String>withRequestField("public_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getPublicIp, ListHostStatusRequest::setPublicIp));
        builder.<String>withRequestField("ip_addr",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getIpAddr, ListHostStatusRequest::setIpAddr));
        builder.<String>withRequestField("protect_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getProtectStatus, ListHostStatusRequest::setProtectStatus));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getGroupId, ListHostStatusRequest::setGroupId));
        builder.<String>withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getGroupName, ListHostStatusRequest::setGroupName));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getVpcId, ListHostStatusRequest::setVpcId));
        builder.<Boolean>withRequestField("has_intrusion",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListHostStatusRequest::getHasIntrusion, ListHostStatusRequest::setHasIntrusion));
        builder.<Boolean>withRequestField("has_vul",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListHostStatusRequest::getHasVul, ListHostStatusRequest::setHasVul));
        builder.<Boolean>withRequestField("has_baseline",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListHostStatusRequest::getHasBaseline, ListHostStatusRequest::setHasBaseline));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getSortKey, ListHostStatusRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getSortDir, ListHostStatusRequest::setSortDir));
        builder.<String>withRequestField("policy_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getPolicyGroupId, ListHostStatusRequest::setPolicyGroupId));
        builder.<String>withRequestField("policy_group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getPolicyGroupName,
                ListHostStatusRequest::setPolicyGroupName));
        builder.<String>withRequestField("charging_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getChargingMode, ListHostStatusRequest::setChargingMode));
        builder.<Boolean>withRequestField("refresh",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListHostStatusRequest::getRefresh, ListHostStatusRequest::setRefresh));
        builder.<Boolean>withRequestField("get_common_login_locations",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListHostStatusRequest::getGetCommonLoginLocations,
                ListHostStatusRequest::setGetCommonLoginLocations));
        builder.<Boolean>withRequestField("above_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListHostStatusRequest::getAboveVersion, ListHostStatusRequest::setAboveVersion));
        builder.<Boolean>withRequestField("outside_host",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListHostStatusRequest::getOutsideHost, ListHostStatusRequest::setOutsideHost));
        builder.<String>withRequestField("asset_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getAssetValue, ListHostStatusRequest::setAssetValue));
        builder.<String>withRequestField("label",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getLabel, ListHostStatusRequest::setLabel));
        builder.<String>withRequestField("server_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getServerGroup, ListHostStatusRequest::setServerGroup));
        builder.<Boolean>withRequestField("agent_upgradable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListHostStatusRequest::getAgentUpgradable,
                ListHostStatusRequest::setAgentUpgradable));
        builder.<Boolean>withRequestField("install_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListHostStatusRequest::getInstallMode, ListHostStatusRequest::setInstallMode));
        builder.<Boolean>withRequestField("binding_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListHostStatusRequest::getBindingKey, ListHostStatusRequest::setBindingKey));
        builder.<Boolean>withRequestField("protect_interrupt",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListHostStatusRequest::getProtectInterrupt,
                ListHostStatusRequest::setProtectInterrupt));
        builder.<Boolean>withRequestField("incluster",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListHostStatusRequest::getIncluster, ListHostStatusRequest::setIncluster));
        builder.<Boolean>withRequestField("protect_degradation",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListHostStatusRequest::getProtectDegradation,
                ListHostStatusRequest::setProtectDegradation));
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getClusterId, ListHostStatusRequest::setClusterId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostStatusRequest::getOffset, ListHostStatusRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostStatusRequest::getLimit, ListHostStatusRequest::setLimit));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostStatusRequest::getRegion, ListHostStatusRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImageLocalRequest, ListImageLocalResponse> listImageLocal =
        genForListImageLocal();

    private static HttpRequestDef<ListImageLocalRequest, ListImageLocalResponse> genForListImageLocal() {
        // basic
        HttpRequestDef.Builder<ListImageLocalRequest, ListImageLocalResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListImageLocalRequest.class, ListImageLocalResponse.class)
                .withName("ListImageLocal")
                .withUri("/v5/{project_id}/image/local-repositories")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageLocalRequest::getEnterpriseProjectId,
                ListImageLocalRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("image_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageLocalRequest::getImageName, ListImageLocalRequest::setImageName));
        builder.<String>withRequestField("image_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageLocalRequest::getImageVersion, ListImageLocalRequest::setImageVersion));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImageLocalRequest::getOffset, ListImageLocalRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImageLocalRequest::getLimit, ListImageLocalRequest::setLimit));
        builder.<String>withRequestField("scan_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageLocalRequest::getScanStatus, ListImageLocalRequest::setScanStatus));
        builder.<String>withRequestField("local_image_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageLocalRequest::getLocalImageType, ListImageLocalRequest::setLocalImageType));
        builder.<Long>withRequestField("image_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListImageLocalRequest::getImageSize, ListImageLocalRequest::setImageSize));
        builder.<Long>withRequestField("start_latest_update_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListImageLocalRequest::getStartLatestUpdateTime,
                ListImageLocalRequest::setStartLatestUpdateTime));
        builder.<Long>withRequestField("end_latest_update_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListImageLocalRequest::getEndLatestUpdateTime,
                ListImageLocalRequest::setEndLatestUpdateTime));
        builder.<Long>withRequestField("start_latest_scan_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListImageLocalRequest::getStartLatestScanTime,
                ListImageLocalRequest::setStartLatestScanTime));
        builder.<Long>withRequestField("end_latest_scan_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListImageLocalRequest::getEndLatestScanTime,
                ListImageLocalRequest::setEndLatestScanTime));
        builder.<Boolean>withRequestField("has_vul",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListImageLocalRequest::getHasVul, ListImageLocalRequest::setHasVul));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageLocalRequest::getHostName, ListImageLocalRequest::setHostName));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageLocalRequest::getHostId, ListImageLocalRequest::setHostId));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageLocalRequest::getHostIp, ListImageLocalRequest::setHostIp));
        builder.<String>withRequestField("container_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageLocalRequest::getContainerId, ListImageLocalRequest::setContainerId));
        builder.<String>withRequestField("container_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageLocalRequest::getContainerName, ListImageLocalRequest::setContainerName));
        builder.<String>withRequestField("pod_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageLocalRequest::getPodId, ListImageLocalRequest::setPodId));
        builder.<String>withRequestField("pod_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageLocalRequest::getPodName, ListImageLocalRequest::setPodName));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageLocalRequest::getAppName, ListImageLocalRequest::setAppName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImageRiskConfigRulesRequest, ListImageRiskConfigRulesResponse> listImageRiskConfigRules =
        genForListImageRiskConfigRules();

    private static HttpRequestDef<ListImageRiskConfigRulesRequest, ListImageRiskConfigRulesResponse> genForListImageRiskConfigRules() {
        // basic
        HttpRequestDef.Builder<ListImageRiskConfigRulesRequest, ListImageRiskConfigRulesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListImageRiskConfigRulesRequest.class, ListImageRiskConfigRulesResponse.class)
                .withName("ListImageRiskConfigRules")
                .withUri("/v5/{project_id}/image/baseline/risk-configs/{check_name}/rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("check_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getCheckName,
                ListImageRiskConfigRulesRequest::setCheckName));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getEnterpriseProjectId,
                ListImageRiskConfigRulesRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("image_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getImageType,
                ListImageRiskConfigRulesRequest::setImageType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getOffset,
                ListImageRiskConfigRulesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getLimit,
                ListImageRiskConfigRulesRequest::setLimit));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getNamespace,
                ListImageRiskConfigRulesRequest::setNamespace));
        builder.<String>withRequestField("image_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getImageName,
                ListImageRiskConfigRulesRequest::setImageName));
        builder.<String>withRequestField("image_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getImageVersion,
                ListImageRiskConfigRulesRequest::setImageVersion));
        builder.<String>withRequestField("image_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getImageId,
                ListImageRiskConfigRulesRequest::setImageId));
        builder.<String>withRequestField("standard",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getStandard,
                ListImageRiskConfigRulesRequest::setStandard));
        builder.<String>withRequestField("result_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getResultType,
                ListImageRiskConfigRulesRequest::setResultType));
        builder.<String>withRequestField("check_rule_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getCheckRuleName,
                ListImageRiskConfigRulesRequest::setCheckRuleName));
        builder.<String>withRequestField("severity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getSeverity,
                ListImageRiskConfigRulesRequest::setSeverity));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getInstanceId,
                ListImageRiskConfigRulesRequest::setInstanceId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigRulesRequest::getRegion,
                ListImageRiskConfigRulesRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImageRiskConfigsRequest, ListImageRiskConfigsResponse> listImageRiskConfigs =
        genForListImageRiskConfigs();

    private static HttpRequestDef<ListImageRiskConfigsRequest, ListImageRiskConfigsResponse> genForListImageRiskConfigs() {
        // basic
        HttpRequestDef.Builder<ListImageRiskConfigsRequest, ListImageRiskConfigsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListImageRiskConfigsRequest.class, ListImageRiskConfigsResponse.class)
            .withName("ListImageRiskConfigs")
            .withUri("/v5/{project_id}/image/baseline/risk-configs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigsRequest::getEnterpriseProjectId,
                ListImageRiskConfigsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("image_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigsRequest::getImageType,
                ListImageRiskConfigsRequest::setImageType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImageRiskConfigsRequest::getOffset, ListImageRiskConfigsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImageRiskConfigsRequest::getLimit, ListImageRiskConfigsRequest::setLimit));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigsRequest::getNamespace,
                ListImageRiskConfigsRequest::setNamespace));
        builder.<String>withRequestField("image_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigsRequest::getImageName,
                ListImageRiskConfigsRequest::setImageName));
        builder.<String>withRequestField("image_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigsRequest::getImageVersion,
                ListImageRiskConfigsRequest::setImageVersion));
        builder.<String>withRequestField("image_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigsRequest::getImageId, ListImageRiskConfigsRequest::setImageId));
        builder.<String>withRequestField("check_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigsRequest::getCheckName,
                ListImageRiskConfigsRequest::setCheckName));
        builder.<String>withRequestField("severity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigsRequest::getSeverity, ListImageRiskConfigsRequest::setSeverity));
        builder.<String>withRequestField("standard",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigsRequest::getStandard, ListImageRiskConfigsRequest::setStandard));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigsRequest::getInstanceId,
                ListImageRiskConfigsRequest::setInstanceId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageRiskConfigsRequest::getRegion, ListImageRiskConfigsRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImageVulnerabilitiesRequest, ListImageVulnerabilitiesResponse> listImageVulnerabilities =
        genForListImageVulnerabilities();

    private static HttpRequestDef<ListImageVulnerabilitiesRequest, ListImageVulnerabilitiesResponse> genForListImageVulnerabilities() {
        // basic
        HttpRequestDef.Builder<ListImageVulnerabilitiesRequest, ListImageVulnerabilitiesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListImageVulnerabilitiesRequest.class, ListImageVulnerabilitiesResponse.class)
                .withName("ListImageVulnerabilities")
                .withUri("/v5/{project_id}/image/{image_id}/vulnerabilities")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getImageId,
                ListImageVulnerabilitiesRequest::setImageId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getEnterpriseProjectId,
                ListImageVulnerabilitiesRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("image_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getImageType,
                ListImageVulnerabilitiesRequest::setImageType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getOffset,
                ListImageVulnerabilitiesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getLimit,
                ListImageVulnerabilitiesRequest::setLimit));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getInstanceId,
                ListImageVulnerabilitiesRequest::setInstanceId));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getNamespace,
                ListImageVulnerabilitiesRequest::setNamespace));
        builder.<String>withRequestField("image_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getImageName,
                ListImageVulnerabilitiesRequest::setImageName));
        builder.<String>withRequestField("tag_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getTagName,
                ListImageVulnerabilitiesRequest::setTagName));
        builder.<String>withRequestField("repair_necessity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getRepairNecessity,
                ListImageVulnerabilitiesRequest::setRepairNecessity));
        builder.<String>withRequestField("vul_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getVulId,
                ListImageVulnerabilitiesRequest::setVulId));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getAppName,
                ListImageVulnerabilitiesRequest::setAppName));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getType, ListImageVulnerabilitiesRequest::setType));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageVulnerabilitiesRequest::getRegion,
                ListImageVulnerabilitiesRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIsolatedFileRequest, ListIsolatedFileResponse> listIsolatedFile =
        genForListIsolatedFile();

    private static HttpRequestDef<ListIsolatedFileRequest, ListIsolatedFileResponse> genForListIsolatedFile() {
        // basic
        HttpRequestDef.Builder<ListIsolatedFileRequest, ListIsolatedFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListIsolatedFileRequest.class, ListIsolatedFileResponse.class)
                .withName("ListIsolatedFile")
                .withUri("/v5/{project_id}/event/isolated-file")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIsolatedFileRequest::getEnterpriseProjectId,
                ListIsolatedFileRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("file_path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIsolatedFileRequest::getFilePath, ListIsolatedFileRequest::setFilePath));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIsolatedFileRequest::getHostName, ListIsolatedFileRequest::setHostName));
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIsolatedFileRequest::getPrivateIp, ListIsolatedFileRequest::setPrivateIp));
        builder.<String>withRequestField("public_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIsolatedFileRequest::getPublicIp, ListIsolatedFileRequest::setPublicIp));
        builder.<String>withRequestField("file_hash",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIsolatedFileRequest::getFileHash, ListIsolatedFileRequest::setFileHash));
        builder.<String>withRequestField("asset_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIsolatedFileRequest::getAssetValue, ListIsolatedFileRequest::setAssetValue));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIsolatedFileRequest::getOffset, ListIsolatedFileRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIsolatedFileRequest::getLimit, ListIsolatedFileRequest::setLimit));
        builder.<String>withRequestField("isolation_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIsolatedFileRequest::getIsolationStatus,
                ListIsolatedFileRequest::setIsolationStatus));
        builder.<Integer>withRequestField("last_days",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIsolatedFileRequest::getLastDays, ListIsolatedFileRequest::setLastDays));
        builder.<Long>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListIsolatedFileRequest::getBeginTime, ListIsolatedFileRequest::setBeginTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListIsolatedFileRequest::getEndTime, ListIsolatedFileRequest::setEndTime));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIsolatedFileRequest::getRegion, ListIsolatedFileRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJarPackageHostInfoRequest, ListJarPackageHostInfoResponse> listJarPackageHostInfo =
        genForListJarPackageHostInfo();

    private static HttpRequestDef<ListJarPackageHostInfoRequest, ListJarPackageHostInfoResponse> genForListJarPackageHostInfo() {
        // basic
        HttpRequestDef.Builder<ListJarPackageHostInfoRequest, ListJarPackageHostInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListJarPackageHostInfoRequest.class, ListJarPackageHostInfoResponse.class)
            .withName("ListJarPackageHostInfo")
            .withUri("/v5/{project_id}/asset/midwares/detail")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJarPackageHostInfoRequest::getEnterpriseProjectId,
                ListJarPackageHostInfoRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("file_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJarPackageHostInfoRequest::getFileName,
                ListJarPackageHostInfoRequest::setFileName));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJarPackageHostInfoRequest::getCategory,
                ListJarPackageHostInfoRequest::setCategory));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJarPackageHostInfoRequest::getHostName,
                ListJarPackageHostInfoRequest::setHostName));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJarPackageHostInfoRequest::getHostIp, ListJarPackageHostInfoRequest::setHostIp));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJarPackageHostInfoRequest::getLimit, ListJarPackageHostInfoRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJarPackageHostInfoRequest::getOffset, ListJarPackageHostInfoRequest::setOffset));
        builder.<Boolean>withRequestField("part_match",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListJarPackageHostInfoRequest::getPartMatch,
                ListJarPackageHostInfoRequest::setPartMatch));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJarPackageStatisticsRequest, ListJarPackageStatisticsResponse> listJarPackageStatistics =
        genForListJarPackageStatistics();

    private static HttpRequestDef<ListJarPackageStatisticsRequest, ListJarPackageStatisticsResponse> genForListJarPackageStatistics() {
        // basic
        HttpRequestDef.Builder<ListJarPackageStatisticsRequest, ListJarPackageStatisticsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListJarPackageStatisticsRequest.class, ListJarPackageStatisticsResponse.class)
                .withName("ListJarPackageStatistics")
                .withUri("/v5/{project_id}/asset/midwares")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJarPackageStatisticsRequest::getEnterpriseProjectId,
                ListJarPackageStatisticsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("file_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJarPackageStatisticsRequest::getFileName,
                ListJarPackageStatisticsRequest::setFileName));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJarPackageStatisticsRequest::getCategory,
                ListJarPackageStatisticsRequest::setCategory));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJarPackageStatisticsRequest::getLimit,
                ListJarPackageStatisticsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJarPackageStatisticsRequest::getOffset,
                ListJarPackageStatisticsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListK8sCronJobsRequest, ListK8sCronJobsResponse> listK8sCronJobs =
        genForListK8sCronJobs();

    private static HttpRequestDef<ListK8sCronJobsRequest, ListK8sCronJobsResponse> genForListK8sCronJobs() {
        // basic
        HttpRequestDef.Builder<ListK8sCronJobsRequest, ListK8sCronJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListK8sCronJobsRequest.class, ListK8sCronJobsResponse.class)
                .withName("ListK8sCronJobs")
                .withUri("/v5/{project_id}/kubernetes/cronjobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListK8sCronJobsRequest::getEnterpriseProjectId,
                ListK8sCronJobsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListK8sCronJobsRequest::getOffset, ListK8sCronJobsRequest::setOffset));
        builder.<String>withRequestField("cronjob_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListK8sCronJobsRequest::getCronjobName, ListK8sCronJobsRequest::setCronjobName));
        builder.<String>withRequestField("namespace_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListK8sCronJobsRequest::getNamespaceName, ListK8sCronJobsRequest::setNamespaceName));
        builder.<String>withRequestField("cluster_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListK8sCronJobsRequest::getClusterName, ListK8sCronJobsRequest::setClusterName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListK8sCronJobsRequest::getLimit, ListK8sCronJobsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListK8sDaemonSetsRequest, ListK8sDaemonSetsResponse> listK8sDaemonSets =
        genForListK8sDaemonSets();

    private static HttpRequestDef<ListK8sDaemonSetsRequest, ListK8sDaemonSetsResponse> genForListK8sDaemonSets() {
        // basic
        HttpRequestDef.Builder<ListK8sDaemonSetsRequest, ListK8sDaemonSetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListK8sDaemonSetsRequest.class, ListK8sDaemonSetsResponse.class)
                .withName("ListK8sDaemonSets")
                .withUri("/v5/{project_id}/kubernetes/daemonsets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListK8sDaemonSetsRequest::getEnterpriseProjectId,
                ListK8sDaemonSetsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListK8sDaemonSetsRequest::getOffset, ListK8sDaemonSetsRequest::setOffset));
        builder.<String>withRequestField("daemonset_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListK8sDaemonSetsRequest::getDaemonsetName,
                ListK8sDaemonSetsRequest::setDaemonsetName));
        builder.<String>withRequestField("namespace_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListK8sDaemonSetsRequest::getNamespaceName,
                ListK8sDaemonSetsRequest::setNamespaceName));
        builder.<String>withRequestField("cluster_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListK8sDaemonSetsRequest::getClusterName, ListK8sDaemonSetsRequest::setClusterName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListK8sDaemonSetsRequest::getLimit, ListK8sDaemonSetsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListK8sDeploymentsRequest, ListK8sDeploymentsResponse> listK8sDeployments =
        genForListK8sDeployments();

    private static HttpRequestDef<ListK8sDeploymentsRequest, ListK8sDeploymentsResponse> genForListK8sDeployments() {
        // basic
        HttpRequestDef.Builder<ListK8sDeploymentsRequest, ListK8sDeploymentsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListK8sDeploymentsRequest.class, ListK8sDeploymentsResponse.class)
                .withName("ListK8sDeployments")
                .withUri("/v5/{project_id}/kubernetes/deployments")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListK8sDeploymentsRequest::getEnterpriseProjectId,
                ListK8sDeploymentsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListK8sDeploymentsRequest::getOffset, ListK8sDeploymentsRequest::setOffset));
        builder.<String>withRequestField("deployment_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListK8sDeploymentsRequest::getDeploymentName,
                ListK8sDeploymentsRequest::setDeploymentName));
        builder.<String>withRequestField("namespace_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListK8sDeploymentsRequest::getNamespaceName,
                ListK8sDeploymentsRequest::setNamespaceName));
        builder.<String>withRequestField("cluster_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListK8sDeploymentsRequest::getClusterName,
                ListK8sDeploymentsRequest::setClusterName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListK8sDeploymentsRequest::getLimit, ListK8sDeploymentsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListK8sJobsRequest, ListK8sJobsResponse> listK8sJobs = genForListK8sJobs();

    private static HttpRequestDef<ListK8sJobsRequest, ListK8sJobsResponse> genForListK8sJobs() {
        // basic
        HttpRequestDef.Builder<ListK8sJobsRequest, ListK8sJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListK8sJobsRequest.class, ListK8sJobsResponse.class)
                .withName("ListK8sJobs")
                .withUri("/v5/{project_id}/kubernetes/jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListK8sJobsRequest::getEnterpriseProjectId,
                ListK8sJobsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListK8sJobsRequest::getOffset, ListK8sJobsRequest::setOffset));
        builder.<String>withRequestField("job_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListK8sJobsRequest::getJobName, ListK8sJobsRequest::setJobName));
        builder.<String>withRequestField("namespace_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListK8sJobsRequest::getNamespaceName, ListK8sJobsRequest::setNamespaceName));
        builder.<String>withRequestField("cluster_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListK8sJobsRequest::getClusterName, ListK8sJobsRequest::setClusterName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListK8sJobsRequest::getLimit, ListK8sJobsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListK8sPodsRequest, ListK8sPodsResponse> listK8sPods = genForListK8sPods();

    private static HttpRequestDef<ListK8sPodsRequest, ListK8sPodsResponse> genForListK8sPods() {
        // basic
        HttpRequestDef.Builder<ListK8sPodsRequest, ListK8sPodsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListK8sPodsRequest.class, ListK8sPodsResponse.class)
                .withName("ListK8sPods")
                .withUri("/v5/{project_id}/kubernetes/pods")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListK8sPodsRequest::getEnterpriseProjectId,
                ListK8sPodsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListK8sPodsRequest::getOffset, ListK8sPodsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListK8sPodsRequest::getLimit, ListK8sPodsRequest::setLimit));
        builder.<String>withRequestField("pod_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListK8sPodsRequest::getPodName, ListK8sPodsRequest::setPodName));
        builder.<String>withRequestField("namespace_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListK8sPodsRequest::getNamespaceName, ListK8sPodsRequest::setNamespaceName));
        builder.<String>withRequestField("cluster_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListK8sPodsRequest::getClusterName, ListK8sPodsRequest::setClusterName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListK8sStatefulSetsRequest, ListK8sStatefulSetsResponse> listK8sStatefulSets =
        genForListK8sStatefulSets();

    private static HttpRequestDef<ListK8sStatefulSetsRequest, ListK8sStatefulSetsResponse> genForListK8sStatefulSets() {
        // basic
        HttpRequestDef.Builder<ListK8sStatefulSetsRequest, ListK8sStatefulSetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListK8sStatefulSetsRequest.class, ListK8sStatefulSetsResponse.class)
                .withName("ListK8sStatefulSets")
                .withUri("/v5/{project_id}/kubernetes/statefulsets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListK8sStatefulSetsRequest::getEnterpriseProjectId,
                ListK8sStatefulSetsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListK8sStatefulSetsRequest::getOffset, ListK8sStatefulSetsRequest::setOffset));
        builder.<String>withRequestField("statefulset_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListK8sStatefulSetsRequest::getStatefulsetName,
                ListK8sStatefulSetsRequest::setStatefulsetName));
        builder.<String>withRequestField("namespace_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListK8sStatefulSetsRequest::getNamespaceName,
                ListK8sStatefulSetsRequest::setNamespaceName));
        builder.<String>withRequestField("cluster_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListK8sStatefulSetsRequest::getClusterName,
                ListK8sStatefulSetsRequest::setClusterName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListK8sStatefulSetsRequest::getLimit, ListK8sStatefulSetsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListKernelModuleHostInfoRequest, ListKernelModuleHostInfoResponse> listKernelModuleHostInfo =
        genForListKernelModuleHostInfo();

    private static HttpRequestDef<ListKernelModuleHostInfoRequest, ListKernelModuleHostInfoResponse> genForListKernelModuleHostInfo() {
        // basic
        HttpRequestDef.Builder<ListKernelModuleHostInfoRequest, ListKernelModuleHostInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListKernelModuleHostInfoRequest.class, ListKernelModuleHostInfoResponse.class)
                .withName("ListKernelModuleHostInfo")
                .withUri("/v5/{project_id}/asset/host/kernel-module")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKernelModuleHostInfoRequest::getEnterpriseProjectId,
                ListKernelModuleHostInfoRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListKernelModuleHostInfoRequest::getOffset,
                ListKernelModuleHostInfoRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListKernelModuleHostInfoRequest::getLimit,
                ListKernelModuleHostInfoRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKernelModuleHostInfoRequest::getName, ListKernelModuleHostInfoRequest::setName));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKernelModuleHostInfoRequest::getHostName,
                ListKernelModuleHostInfoRequest::setHostName));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKernelModuleHostInfoRequest::getHostIp,
                ListKernelModuleHostInfoRequest::setHostIp));
        builder.<Boolean>withRequestField("part_match",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListKernelModuleHostInfoRequest::getPartMatch,
                ListKernelModuleHostInfoRequest::setPartMatch));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListKernelModuleStatisticsRequest, ListKernelModuleStatisticsResponse> listKernelModuleStatistics =
        genForListKernelModuleStatistics();

    private static HttpRequestDef<ListKernelModuleStatisticsRequest, ListKernelModuleStatisticsResponse> genForListKernelModuleStatistics() {
        // basic
        HttpRequestDef.Builder<ListKernelModuleStatisticsRequest, ListKernelModuleStatisticsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListKernelModuleStatisticsRequest.class,
                    ListKernelModuleStatisticsResponse.class)
                .withName("ListKernelModuleStatistics")
                .withUri("/v5/{project_id}/asset/statistics/kernel-module")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKernelModuleStatisticsRequest::getEnterpriseProjectId,
                ListKernelModuleStatisticsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListKernelModuleStatisticsRequest::getOffset,
                ListKernelModuleStatisticsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListKernelModuleStatisticsRequest::getLimit,
                ListKernelModuleStatisticsRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKernelModuleStatisticsRequest::getName,
                ListKernelModuleStatisticsRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListKubernetesClusterDetailsRequest, ListKubernetesClusterDetailsResponse> listKubernetesClusterDetails =
        genForListKubernetesClusterDetails();

    private static HttpRequestDef<ListKubernetesClusterDetailsRequest, ListKubernetesClusterDetailsResponse> genForListKubernetesClusterDetails() {
        // basic
        HttpRequestDef.Builder<ListKubernetesClusterDetailsRequest, ListKubernetesClusterDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListKubernetesClusterDetailsRequest.class,
                    ListKubernetesClusterDetailsResponse.class)
                .withName("ListKubernetesClusterDetails")
                .withUri("/v5/{project_id}/kubernetes/clusters")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKubernetesClusterDetailsRequest::getEnterpriseProjectId,
                ListKubernetesClusterDetailsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListKubernetesClusterDetailsRequest::getOffset,
                ListKubernetesClusterDetailsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListKubernetesClusterDetailsRequest::getLimit,
                ListKubernetesClusterDetailsRequest::setLimit));
        builder.<String>withRequestField("cluster_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKubernetesClusterDetailsRequest::getClusterName,
                ListKubernetesClusterDetailsRequest::setClusterName));
        builder.<Boolean>withRequestField("load_agent_info",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListKubernetesClusterDetailsRequest::getLoadAgentInfo,
                ListKubernetesClusterDetailsRequest::setLoadAgentInfo));
        builder.<String>withRequestField("scene",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKubernetesClusterDetailsRequest::getScene,
                ListKubernetesClusterDetailsRequest::setScene));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListKubernetesEndpointDetailsRequest, ListKubernetesEndpointDetailsResponse> listKubernetesEndpointDetails =
        genForListKubernetesEndpointDetails();

    private static HttpRequestDef<ListKubernetesEndpointDetailsRequest, ListKubernetesEndpointDetailsResponse> genForListKubernetesEndpointDetails() {
        // basic
        HttpRequestDef.Builder<ListKubernetesEndpointDetailsRequest, ListKubernetesEndpointDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListKubernetesEndpointDetailsRequest.class,
                    ListKubernetesEndpointDetailsResponse.class)
                .withName("ListKubernetesEndpointDetails")
                .withUri("/v5/{project_id}/kubernetes/endpoints")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKubernetesEndpointDetailsRequest::getEnterpriseProjectId,
                ListKubernetesEndpointDetailsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListKubernetesEndpointDetailsRequest::getOffset,
                ListKubernetesEndpointDetailsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListKubernetesEndpointDetailsRequest::getLimit,
                ListKubernetesEndpointDetailsRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKubernetesEndpointDetailsRequest::getName,
                ListKubernetesEndpointDetailsRequest::setName));
        builder.<String>withRequestField("cluster_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKubernetesEndpointDetailsRequest::getClusterName,
                ListKubernetesEndpointDetailsRequest::setClusterName));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKubernetesEndpointDetailsRequest::getNamespace,
                ListKubernetesEndpointDetailsRequest::setNamespace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListKubernetesServiceDetailsRequest, ListKubernetesServiceDetailsResponse> listKubernetesServiceDetails =
        genForListKubernetesServiceDetails();

    private static HttpRequestDef<ListKubernetesServiceDetailsRequest, ListKubernetesServiceDetailsResponse> genForListKubernetesServiceDetails() {
        // basic
        HttpRequestDef.Builder<ListKubernetesServiceDetailsRequest, ListKubernetesServiceDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListKubernetesServiceDetailsRequest.class,
                    ListKubernetesServiceDetailsResponse.class)
                .withName("ListKubernetesServiceDetails")
                .withUri("/v5/{project_id}/kubernetes/services")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKubernetesServiceDetailsRequest::getEnterpriseProjectId,
                ListKubernetesServiceDetailsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListKubernetesServiceDetailsRequest::getOffset,
                ListKubernetesServiceDetailsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListKubernetesServiceDetailsRequest::getLimit,
                ListKubernetesServiceDetailsRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKubernetesServiceDetailsRequest::getName,
                ListKubernetesServiceDetailsRequest::setName));
        builder.<String>withRequestField("cluster_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKubernetesServiceDetailsRequest::getClusterName,
                ListKubernetesServiceDetailsRequest::setClusterName));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKubernetesServiceDetailsRequest::getNamespace,
                ListKubernetesServiceDetailsRequest::setNamespace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLoginCommonIpRequest, ListLoginCommonIpResponse> listLoginCommonIp =
        genForListLoginCommonIp();

    private static HttpRequestDef<ListLoginCommonIpRequest, ListLoginCommonIpResponse> genForListLoginCommonIp() {
        // basic
        HttpRequestDef.Builder<ListLoginCommonIpRequest, ListLoginCommonIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLoginCommonIpRequest.class, ListLoginCommonIpResponse.class)
                .withName("ListLoginCommonIp")
                .withUri("/v5/{project_id}/setting/login-common-ip")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoginCommonIpRequest::getEnterpriseProjectId,
                ListLoginCommonIpRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("ip_addr",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoginCommonIpRequest::getIpAddr, ListLoginCommonIpRequest::setIpAddr));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLoginCommonLocationRequest, ListLoginCommonLocationResponse> listLoginCommonLocation =
        genForListLoginCommonLocation();

    private static HttpRequestDef<ListLoginCommonLocationRequest, ListLoginCommonLocationResponse> genForListLoginCommonLocation() {
        // basic
        HttpRequestDef.Builder<ListLoginCommonLocationRequest, ListLoginCommonLocationResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListLoginCommonLocationRequest.class, ListLoginCommonLocationResponse.class)
            .withName("ListLoginCommonLocation")
            .withUri("/v5/{project_id}/setting/login-common-location")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoginCommonLocationRequest::getEnterpriseProjectId,
                ListLoginCommonLocationRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("area_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLoginCommonLocationRequest::getAreaCode,
                ListLoginCommonLocationRequest::setAreaCode));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLoginWhiteIpRequest, ListLoginWhiteIpResponse> listLoginWhiteIp =
        genForListLoginWhiteIp();

    private static HttpRequestDef<ListLoginWhiteIpRequest, ListLoginWhiteIpResponse> genForListLoginWhiteIp() {
        // basic
        HttpRequestDef.Builder<ListLoginWhiteIpRequest, ListLoginWhiteIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLoginWhiteIpRequest.class, ListLoginWhiteIpResponse.class)
                .withName("ListLoginWhiteIp")
                .withUri("/v5/{project_id}/setting/login-white-ip")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoginWhiteIpRequest::getEnterpriseProjectId,
                ListLoginWhiteIpRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("white_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoginWhiteIpRequest::getWhiteIp, ListLoginWhiteIpRequest::setWhiteIp));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLoginWhiteListRequest, ListLoginWhiteListResponse> listLoginWhiteList =
        genForListLoginWhiteList();

    private static HttpRequestDef<ListLoginWhiteListRequest, ListLoginWhiteListResponse> genForListLoginWhiteList() {
        // basic
        HttpRequestDef.Builder<ListLoginWhiteListRequest, ListLoginWhiteListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLoginWhiteListRequest.class, ListLoginWhiteListResponse.class)
                .withName("ListLoginWhiteList")
                .withUri("/v5/{project_id}/event/white-list/login")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoginWhiteListRequest::getEnterpriseProjectId,
                ListLoginWhiteListRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoginWhiteListRequest::getPrivateIp, ListLoginWhiteListRequest::setPrivateIp));
        builder.<String>withRequestField("login_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoginWhiteListRequest::getLoginIp, ListLoginWhiteListRequest::setLoginIp));
        builder.<String>withRequestField("login_user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoginWhiteListRequest::getLoginUserName,
                ListLoginWhiteListRequest::setLoginUserName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLoginWhiteListRequest::getOffset, ListLoginWhiteListRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLoginWhiteListRequest::getLimit, ListLoginWhiteListRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNamespacesRequest, ListNamespacesResponse> listNamespaces =
        genForListNamespaces();

    private static HttpRequestDef<ListNamespacesRequest, ListNamespacesResponse> genForListNamespaces() {
        // basic
        HttpRequestDef.Builder<ListNamespacesRequest, ListNamespacesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNamespacesRequest.class, ListNamespacesResponse.class)
                .withName("ListNamespaces")
                .withUri("/v5/{project_id}/container-network/{cluster_id}/namespace")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNamespacesRequest::getClusterId, ListNamespacesRequest::setClusterId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNamespacesRequest::getEnterpriseProjectId,
                ListNamespacesRequest::setEnterpriseProjectId));

        // response
        builder.<List<String>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNamespacesResponse::getBody, ListNamespacesResponse::setBody)
                .withInnerContainerType(String.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListOperationLogsByVaultNameRequest, ListOperationLogsByVaultNameResponse> listOperationLogsByVaultName =
        genForListOperationLogsByVaultName();

    private static HttpRequestDef<ListOperationLogsByVaultNameRequest, ListOperationLogsByVaultNameResponse> genForListOperationLogsByVaultName() {
        // basic
        HttpRequestDef.Builder<ListOperationLogsByVaultNameRequest, ListOperationLogsByVaultNameResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListOperationLogsByVaultNameRequest.class,
                    ListOperationLogsByVaultNameResponse.class)
                .withName("ListOperationLogsByVaultName")
                .withUri("/v5/{project_id}/ransomware/backup/operation-logs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOperationLogsByVaultNameRequest::getEnterpriseProjectId,
                ListOperationLogsByVaultNameRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOperationLogsByVaultNameRequest::getStatus,
                ListOperationLogsByVaultNameRequest::setStatus));
        builder.<String>withRequestField("resource_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOperationLogsByVaultNameRequest::getResourceName,
                ListOperationLogsByVaultNameRequest::setResourceName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOperationLogsByVaultNameRequest::getOffset,
                ListOperationLogsByVaultNameRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOperationLogsByVaultNameRequest::getLimit,
                ListOperationLogsByVaultNameRequest::setLimit));
        builder.<Integer>withRequestField("last_days",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOperationLogsByVaultNameRequest::getLastDays,
                ListOperationLogsByVaultNameRequest::setLastDays));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOrganizationTreeRequest, ListOrganizationTreeResponse> listOrganizationTree =
        genForListOrganizationTree();

    private static HttpRequestDef<ListOrganizationTreeRequest, ListOrganizationTreeResponse> genForListOrganizationTree() {
        // basic
        HttpRequestDef.Builder<ListOrganizationTreeRequest, ListOrganizationTreeResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListOrganizationTreeRequest.class, ListOrganizationTreeResponse.class)
            .withName("ListOrganizationTree")
            .withUri("/v5/setting/account/organization-tree")
            .withContentType("application/json");

        // requests
        builder.<Boolean>withRequestField("is_refresh",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListOrganizationTreeRequest::getIsRefresh,
                ListOrganizationTreeRequest::setIsRefresh));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrganizationTreeRequest::getEnterpriseProjectId,
                ListOrganizationTreeRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrganizationTreeRequest::getXSecurityToken,
                ListOrganizationTreeRequest::setXSecurityToken));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrganizationTreeRequest::getRegion, ListOrganizationTreeRequest::setRegion));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListOrganizationTreeResponse::getXRequestId,
                ListOrganizationTreeResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListPasswordComplexityRequest, ListPasswordComplexityResponse> listPasswordComplexity =
        genForListPasswordComplexity();

    private static HttpRequestDef<ListPasswordComplexityRequest, ListPasswordComplexityResponse> genForListPasswordComplexity() {
        // basic
        HttpRequestDef.Builder<ListPasswordComplexityRequest, ListPasswordComplexityResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListPasswordComplexityRequest.class, ListPasswordComplexityResponse.class)
            .withName("ListPasswordComplexity")
            .withUri("/v5/{project_id}/baseline/password-complexity")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPasswordComplexityRequest::getEnterpriseProjectId,
                ListPasswordComplexityRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPasswordComplexityRequest::getHostName,
                ListPasswordComplexityRequest::setHostName));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPasswordComplexityRequest::getHostIp, ListPasswordComplexityRequest::setHostIp));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPasswordComplexityRequest::getHostId, ListPasswordComplexityRequest::setHostId));
        builder.<String>withRequestField("result_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPasswordComplexityRequest::getResultType,
                ListPasswordComplexityRequest::setResultType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPasswordComplexityRequest::getLimit, ListPasswordComplexityRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPasswordComplexityRequest::getOffset, ListPasswordComplexityRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPoliciesRequest, ListPoliciesResponse> listPolicies = genForListPolicies();

    private static HttpRequestDef<ListPoliciesRequest, ListPoliciesResponse> genForListPolicies() {
        // basic
        HttpRequestDef.Builder<ListPoliciesRequest, ListPoliciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPoliciesRequest.class, ListPoliciesResponse.class)
                .withName("ListPolicies")
                .withUri("/v5/{project_id}/host-management/policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoliciesRequest::getEnterpriseProjectId,
                ListPoliciesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPoliciesRequest::getOffset, ListPoliciesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPoliciesRequest::getLimit, ListPoliciesRequest::setLimit));
        builder.<String>withRequestField("agent_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoliciesRequest::getAgentId, ListPoliciesRequest::setAgentId));

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
                .withUri("/v5/{project_id}/policy/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyGroupRequest::getEnterpriseProjectId,
                ListPolicyGroupRequest::setEnterpriseProjectId));
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
        builder.<String>withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyGroupRequest::getGroupName, ListPolicyGroupRequest::setGroupName));
        builder.<Boolean>withRequestField("container_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPolicyGroupRequest::getContainerMode, ListPolicyGroupRequest::setContainerMode));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyGroupRequest::getGroupId, ListPolicyGroupRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPortHostRequest, ListPortHostResponse> listPortHost = genForListPortHost();

    private static HttpRequestDef<ListPortHostRequest, ListPortHostResponse> genForListPortHost() {
        // basic
        HttpRequestDef.Builder<ListPortHostRequest, ListPortHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPortHostRequest.class, ListPortHostResponse.class)
                .withName("ListPortHost")
                .withUri("/v5/{project_id}/asset/ports/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortHostRequest::getEnterpriseProjectId,
                ListPortHostRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortHostRequest::getHostName, ListPortHostRequest::setHostName));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortHostRequest::getHostIp, ListPortHostRequest::setHostIp));
        builder.<Integer>withRequestField("port",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortHostRequest::getPort, ListPortHostRequest::setPort));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortHostRequest::getType, ListPortHostRequest::setType));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortHostRequest::getCategory, ListPortHostRequest::setCategory));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortHostRequest::getLimit, ListPortHostRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortHostRequest::getOffset, ListPortHostRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPortStatisticsRequest, ListPortStatisticsResponse> listPortStatistics =
        genForListPortStatistics();

    private static HttpRequestDef<ListPortStatisticsRequest, ListPortStatisticsResponse> genForListPortStatistics() {
        // basic
        HttpRequestDef.Builder<ListPortStatisticsRequest, ListPortStatisticsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPortStatisticsRequest.class, ListPortStatisticsResponse.class)
                .withName("ListPortStatistics")
                .withUri("/v5/{project_id}/asset/port/statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortStatisticsRequest::getEnterpriseProjectId,
                ListPortStatisticsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortStatisticsRequest::getCategory, ListPortStatisticsRequest::setCategory));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortStatisticsRequest::getSortDir, ListPortStatisticsRequest::setSortDir));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortStatisticsRequest::getLimit, ListPortStatisticsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortStatisticsRequest::getOffset, ListPortStatisticsRequest::setOffset));
        builder.<Integer>withRequestField("port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortStatisticsRequest::getPort, ListPortStatisticsRequest::setPort));
        builder.<String>withRequestField("port_string",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortStatisticsRequest::getPortString, ListPortStatisticsRequest::setPortString));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortStatisticsRequest::getType, ListPortStatisticsRequest::setType));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortStatisticsRequest::getStatus, ListPortStatisticsRequest::setStatus));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortStatisticsRequest::getSortKey, ListPortStatisticsRequest::setSortKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPortsRequest, ListPortsResponse> listPorts = genForListPorts();

    private static HttpRequestDef<ListPortsRequest, ListPortsResponse> genForListPorts() {
        // basic
        HttpRequestDef.Builder<ListPortsRequest, ListPortsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPortsRequest.class, ListPortsResponse.class)
                .withName("ListPorts")
                .withUri("/v5/{project_id}/asset/ports")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getHostId, ListPortsRequest::setHostId));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getHostName, ListPortsRequest::setHostName));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getHostIp, ListPortsRequest::setHostIp));
        builder.<Integer>withRequestField("port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortsRequest::getPort, ListPortsRequest::setPort));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getType, ListPortsRequest::setType));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getStatus, ListPortsRequest::setStatus));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getEnterpriseProjectId, ListPortsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortsRequest::getLimit, ListPortsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortsRequest::getOffset, ListPortsRequest::setOffset));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortsRequest::getCategory, ListPortsRequest::setCategory));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProcessStatisticsRequest, ListProcessStatisticsResponse> listProcessStatistics =
        genForListProcessStatistics();

    private static HttpRequestDef<ListProcessStatisticsRequest, ListProcessStatisticsResponse> genForListProcessStatistics() {
        // basic
        HttpRequestDef.Builder<ListProcessStatisticsRequest, ListProcessStatisticsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListProcessStatisticsRequest.class, ListProcessStatisticsResponse.class)
            .withName("ListProcessStatistics")
            .withUri("/v5/{project_id}/asset/process/statistics")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProcessStatisticsRequest::getEnterpriseProjectId,
                ListProcessStatisticsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProcessStatisticsRequest::getLimit, ListProcessStatisticsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProcessStatisticsRequest::getOffset, ListProcessStatisticsRequest::setOffset));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProcessStatisticsRequest::getCategory,
                ListProcessStatisticsRequest::setCategory));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProcessStatisticsRequest::getPath, ListProcessStatisticsRequest::setPath));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProcessesHostRequest, ListProcessesHostResponse> listProcessesHost =
        genForListProcessesHost();

    private static HttpRequestDef<ListProcessesHostRequest, ListProcessesHostResponse> genForListProcessesHost() {
        // basic
        HttpRequestDef.Builder<ListProcessesHostRequest, ListProcessesHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProcessesHostRequest.class, ListProcessesHostResponse.class)
                .withName("ListProcessesHost")
                .withUri("/v5/{project_id}/asset/processes/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProcessesHostRequest::getEnterpriseProjectId,
                ListProcessesHostRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProcessesHostRequest::getHostName, ListProcessesHostRequest::setHostName));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProcessesHostRequest::getHostIp, ListProcessesHostRequest::setHostIp));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProcessesHostRequest::getPath, ListProcessesHostRequest::setPath));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProcessesHostRequest::getCategory, ListProcessesHostRequest::setCategory));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProcessesHostRequest::getLimit, ListProcessesHostRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProcessesHostRequest::getOffset, ListProcessesHostRequest::setOffset));

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
                .withUri("/v5/{project_id}/{resource_type}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectTagsRequest::getResourceType, ListProjectTagsRequest::setResourceType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProtectionPolicyRequest, ListProtectionPolicyResponse> listProtectionPolicy =
        genForListProtectionPolicy();

    private static HttpRequestDef<ListProtectionPolicyRequest, ListProtectionPolicyResponse> genForListProtectionPolicy() {
        // basic
        HttpRequestDef.Builder<ListProtectionPolicyRequest, ListProtectionPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListProtectionPolicyRequest.class, ListProtectionPolicyResponse.class)
            .withName("ListProtectionPolicy")
            .withUri("/v5/{project_id}/ransomware/protection/policy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectionPolicyRequest::getEnterpriseProjectId,
                ListProtectionPolicyRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProtectionPolicyRequest::getOffset, ListProtectionPolicyRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProtectionPolicyRequest::getLimit, ListProtectionPolicyRequest::setLimit));
        builder.<String>withRequestField("policy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectionPolicyRequest::getPolicyName,
                ListProtectionPolicyRequest::setPolicyName));
        builder.<String>withRequestField("protect_policy_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectionPolicyRequest::getProtectPolicyId,
                ListProtectionPolicyRequest::setProtectPolicyId));
        builder.<String>withRequestField("operating_system",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectionPolicyRequest::getOperatingSystem,
                ListProtectionPolicyRequest::setOperatingSystem));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectionPolicyRequest::getRegion, ListProtectionPolicyRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProtectionServerRequest, ListProtectionServerResponse> listProtectionServer =
        genForListProtectionServer();

    private static HttpRequestDef<ListProtectionServerRequest, ListProtectionServerResponse> genForListProtectionServer() {
        // basic
        HttpRequestDef.Builder<ListProtectionServerRequest, ListProtectionServerResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListProtectionServerRequest.class, ListProtectionServerResponse.class)
            .withName("ListProtectionServer")
            .withUri("/v5/{project_id}/ransomware/server")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectionServerRequest::getEnterpriseProjectId,
                ListProtectionServerRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProtectionServerRequest::getOffset, ListProtectionServerRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProtectionServerRequest::getLimit, ListProtectionServerRequest::setLimit));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectionServerRequest::getHostName, ListProtectionServerRequest::setHostName));
        builder.<String>withRequestField("os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectionServerRequest::getOsType, ListProtectionServerRequest::setOsType));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectionServerRequest::getHostIp, ListProtectionServerRequest::setHostIp));
        builder.<String>withRequestField("host_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectionServerRequest::getHostStatus,
                ListProtectionServerRequest::setHostStatus));
        builder.<Integer>withRequestField("last_days",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProtectionServerRequest::getLastDays, ListProtectionServerRequest::setLastDays));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectionServerRequest::getRegion, ListProtectionServerRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProtectionServersRequest, ListProtectionServersResponse> listProtectionServers =
        genForListProtectionServers();

    private static HttpRequestDef<ListProtectionServersRequest, ListProtectionServersResponse> genForListProtectionServers() {
        // basic
        HttpRequestDef.Builder<ListProtectionServersRequest, ListProtectionServersResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListProtectionServersRequest.class, ListProtectionServersResponse.class)
            .withName("ListProtectionServers")
            .withUri("/v5/{project_id}/rasp/servers")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectionServersRequest::getEnterpriseProjectId,
                ListProtectionServersRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProtectionServersRequest::getOffset, ListProtectionServersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProtectionServersRequest::getLimit, ListProtectionServersRequest::setLimit));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectionServersRequest::getHostName,
                ListProtectionServersRequest::setHostName));
        builder.<String>withRequestField("os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectionServersRequest::getOsType, ListProtectionServersRequest::setOsType));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProtectionServersRequest::getHostIp, ListProtectionServersRequest::setHostIp));
        builder.<ListProtectionServersRequest.AppTypeEnum>withRequestField("app_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListProtectionServersRequest.AppTypeEnum.class),
            f -> f.withMarshaller(ListProtectionServersRequest::getAppType, ListProtectionServersRequest::setAppType));
        builder.<ListProtectionServersRequest.AppStatusEnum>withRequestField("app_status",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListProtectionServersRequest.AppStatusEnum.class),
            f -> f.withMarshaller(ListProtectionServersRequest::getAppStatus,
                ListProtectionServersRequest::setAppStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQueryExportTaskRequest, ListQueryExportTaskResponse> listQueryExportTask =
        genForListQueryExportTask();

    private static HttpRequestDef<ListQueryExportTaskRequest, ListQueryExportTaskResponse> genForListQueryExportTask() {
        // basic
        HttpRequestDef.Builder<ListQueryExportTaskRequest, ListQueryExportTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQueryExportTaskRequest.class, ListQueryExportTaskResponse.class)
                .withName("ListQueryExportTask")
                .withUri("/v5/{project_id}/export-task/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueryExportTaskRequest::getTaskId, ListQueryExportTaskRequest::setTaskId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueryExportTaskRequest::getEnterpriseProjectId,
                ListQueryExportTaskRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueryExportTaskRequest::getRegion, ListQueryExportTaskRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQuotasDetailRequest, ListQuotasDetailResponse> listQuotasDetail =
        genForListQuotasDetail();

    private static HttpRequestDef<ListQuotasDetailRequest, ListQuotasDetailResponse> genForListQuotasDetail() {
        // basic
        HttpRequestDef.Builder<ListQuotasDetailRequest, ListQuotasDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQuotasDetailRequest.class, ListQuotasDetailResponse.class)
                .withName("ListQuotasDetail")
                .withUri("/v5/{project_id}/billing/quotas-detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQuotasDetailRequest::getEnterpriseProjectId,
                ListQuotasDetailRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQuotasDetailRequest::getVersion, ListQuotasDetailRequest::setVersion));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQuotasDetailRequest::getCategory, ListQuotasDetailRequest::setCategory));
        builder.<String>withRequestField("quota_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQuotasDetailRequest::getQuotaStatus, ListQuotasDetailRequest::setQuotaStatus));
        builder.<String>withRequestField("used_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQuotasDetailRequest::getUsedStatus, ListQuotasDetailRequest::setUsedStatus));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQuotasDetailRequest::getHostName, ListQuotasDetailRequest::setHostName));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQuotasDetailRequest::getResourceId, ListQuotasDetailRequest::setResourceId));
        builder.<String>withRequestField("charging_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQuotasDetailRequest::getChargingMode, ListQuotasDetailRequest::setChargingMode));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQuotasDetailRequest::getLimit, ListQuotasDetailRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQuotasDetailRequest::getOffset, ListQuotasDetailRequest::setOffset));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQuotasDetailRequest::getRegion, ListQuotasDetailRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRansomwareProtectionNodesRequest, ListRansomwareProtectionNodesResponse> listRansomwareProtectionNodes =
        genForListRansomwareProtectionNodes();

    private static HttpRequestDef<ListRansomwareProtectionNodesRequest, ListRansomwareProtectionNodesResponse> genForListRansomwareProtectionNodes() {
        // basic
        HttpRequestDef.Builder<ListRansomwareProtectionNodesRequest, ListRansomwareProtectionNodesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListRansomwareProtectionNodesRequest.class,
                    ListRansomwareProtectionNodesResponse.class)
                .withName("ListRansomwareProtectionNodes")
                .withUri("/v5/{project_id}/ransomware/servers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRansomwareProtectionNodesRequest::getEnterpriseProjectId,
                ListRansomwareProtectionNodesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRansomwareProtectionNodesRequest::getOffset,
                ListRansomwareProtectionNodesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRansomwareProtectionNodesRequest::getLimit,
                ListRansomwareProtectionNodesRequest::setLimit));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRansomwareProtectionNodesRequest::getHostName,
                ListRansomwareProtectionNodesRequest::setHostName));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRansomwareProtectionNodesRequest::getHostId,
                ListRansomwareProtectionNodesRequest::setHostId));
        builder.<String>withRequestField("os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRansomwareProtectionNodesRequest::getOsType,
                ListRansomwareProtectionNodesRequest::setOsType));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRansomwareProtectionNodesRequest::getHostIp,
                ListRansomwareProtectionNodesRequest::setHostIp));
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRansomwareProtectionNodesRequest::getPrivateIp,
                ListRansomwareProtectionNodesRequest::setPrivateIp));
        builder.<String>withRequestField("host_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRansomwareProtectionNodesRequest::getHostStatus,
                ListRansomwareProtectionNodesRequest::setHostStatus));
        builder.<String>withRequestField("ransom_protection_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRansomwareProtectionNodesRequest::getRansomProtectionStatus,
                ListRansomwareProtectionNodesRequest::setRansomProtectionStatus));
        builder.<String>withRequestField("protect_policy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRansomwareProtectionNodesRequest::getProtectPolicyName,
                ListRansomwareProtectionNodesRequest::setProtectPolicyName));
        builder.<String>withRequestField("policy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRansomwareProtectionNodesRequest::getPolicyName,
                ListRansomwareProtectionNodesRequest::setPolicyName));
        builder.<String>withRequestField("policy_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRansomwareProtectionNodesRequest::getPolicyId,
                ListRansomwareProtectionNodesRequest::setPolicyId));
        builder.<String>withRequestField("agent_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRansomwareProtectionNodesRequest::getAgentStatus,
                ListRansomwareProtectionNodesRequest::setAgentStatus));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRansomwareProtectionNodesRequest::getGroupId,
                ListRansomwareProtectionNodesRequest::setGroupId));
        builder.<String>withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRansomwareProtectionNodesRequest::getGroupName,
                ListRansomwareProtectionNodesRequest::setGroupName));
        builder.<Long>withRequestField("last_days",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListRansomwareProtectionNodesRequest::getLastDays,
                ListRansomwareProtectionNodesRequest::setLastDays));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRaspEventsRequest, ListRaspEventsResponse> listRaspEvents =
        genForListRaspEvents();

    private static HttpRequestDef<ListRaspEventsRequest, ListRaspEventsResponse> genForListRaspEvents() {
        // basic
        HttpRequestDef.Builder<ListRaspEventsRequest, ListRaspEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRaspEventsRequest.class, ListRaspEventsResponse.class)
                .withName("ListRaspEvents")
                .withUri("/v5/{project_id}/rasp/events")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRaspEventsRequest::getEnterpriseProjectId,
                ListRaspEventsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRaspEventsRequest::getHostId, ListRaspEventsRequest::setHostId));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListRaspEventsRequest::getStartTime, ListRaspEventsRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListRaspEventsRequest::getEndTime, ListRaspEventsRequest::setEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRaspEventsRequest::getLimit, ListRaspEventsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRaspEventsRequest::getOffset, ListRaspEventsRequest::setOffset));
        builder.<ListRaspEventsRequest.AppTypeEnum>withRequestField("app_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRaspEventsRequest.AppTypeEnum.class),
            f -> f.withMarshaller(ListRaspEventsRequest::getAppType, ListRaspEventsRequest::setAppType));
        builder.<String>withRequestField("severity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRaspEventsRequest::getSeverity, ListRaspEventsRequest::setSeverity));
        builder.<String>withRequestField("attack_tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRaspEventsRequest::getAttackTag, ListRaspEventsRequest::setAttackTag));
        builder.<ListRaspEventsRequest.ProtectStatusEnum>withRequestField("protect_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRaspEventsRequest.ProtectStatusEnum.class),
            f -> f.withMarshaller(ListRaspEventsRequest::getProtectStatus, ListRaspEventsRequest::setProtectStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRaspPoliciesRequest, ListRaspPoliciesResponse> listRaspPolicies =
        genForListRaspPolicies();

    private static HttpRequestDef<ListRaspPoliciesRequest, ListRaspPoliciesResponse> genForListRaspPolicies() {
        // basic
        HttpRequestDef.Builder<ListRaspPoliciesRequest, ListRaspPoliciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRaspPoliciesRequest.class, ListRaspPoliciesResponse.class)
                .withName("ListRaspPolicies")
                .withUri("/v5/{project_id}/rasp/policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRaspPoliciesRequest::getEnterpriseProjectId,
                ListRaspPoliciesRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRaspPoliciesRequest::getOsType, ListRaspPoliciesRequest::setOsType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRaspPoliciesRequest::getLimit, ListRaspPoliciesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRaspPoliciesRequest::getOffset, ListRaspPoliciesRequest::setOffset));
        builder.<String>withRequestField("policy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRaspPoliciesRequest::getPolicyName, ListRaspPoliciesRequest::setPolicyName));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRaspPoliciesRequest::getRegion, ListRaspPoliciesRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRiskConfigCheckRulesRequest, ListRiskConfigCheckRulesResponse> listRiskConfigCheckRules =
        genForListRiskConfigCheckRules();

    private static HttpRequestDef<ListRiskConfigCheckRulesRequest, ListRiskConfigCheckRulesResponse> genForListRiskConfigCheckRules() {
        // basic
        HttpRequestDef.Builder<ListRiskConfigCheckRulesRequest, ListRiskConfigCheckRulesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListRiskConfigCheckRulesRequest.class, ListRiskConfigCheckRulesResponse.class)
                .withName("ListRiskConfigCheckRules")
                .withUri("/v5/{project_id}/baseline/risk-config/{check_name}/check-rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("check_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigCheckRulesRequest::getCheckName,
                ListRiskConfigCheckRulesRequest::setCheckName));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigCheckRulesRequest::getEnterpriseProjectId,
                ListRiskConfigCheckRulesRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("standard",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigCheckRulesRequest::getStandard,
                ListRiskConfigCheckRulesRequest::setStandard));
        builder.<String>withRequestField("result_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigCheckRulesRequest::getResultType,
                ListRiskConfigCheckRulesRequest::setResultType));
        builder.<String>withRequestField("check_rule_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigCheckRulesRequest::getCheckRuleName,
                ListRiskConfigCheckRulesRequest::setCheckRuleName));
        builder.<String>withRequestField("severity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigCheckRulesRequest::getSeverity,
                ListRiskConfigCheckRulesRequest::setSeverity));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigCheckRulesRequest::getHostId,
                ListRiskConfigCheckRulesRequest::setHostId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRiskConfigCheckRulesRequest::getLimit,
                ListRiskConfigCheckRulesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRiskConfigCheckRulesRequest::getOffset,
                ListRiskConfigCheckRulesRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRiskConfigHostsRequest, ListRiskConfigHostsResponse> listRiskConfigHosts =
        genForListRiskConfigHosts();

    private static HttpRequestDef<ListRiskConfigHostsRequest, ListRiskConfigHostsResponse> genForListRiskConfigHosts() {
        // basic
        HttpRequestDef.Builder<ListRiskConfigHostsRequest, ListRiskConfigHostsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRiskConfigHostsRequest.class, ListRiskConfigHostsResponse.class)
                .withName("ListRiskConfigHosts")
                .withUri("/v5/{project_id}/baseline/risk-config/{check_name}/hosts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("check_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigHostsRequest::getCheckName, ListRiskConfigHostsRequest::setCheckName));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigHostsRequest::getEnterpriseProjectId,
                ListRiskConfigHostsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("standard",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigHostsRequest::getStandard, ListRiskConfigHostsRequest::setStandard));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigHostsRequest::getHostName, ListRiskConfigHostsRequest::setHostName));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigHostsRequest::getHostIp, ListRiskConfigHostsRequest::setHostIp));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRiskConfigHostsRequest::getLimit, ListRiskConfigHostsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRiskConfigHostsRequest::getOffset, ListRiskConfigHostsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRiskConfigsRequest, ListRiskConfigsResponse> listRiskConfigs =
        genForListRiskConfigs();

    private static HttpRequestDef<ListRiskConfigsRequest, ListRiskConfigsResponse> genForListRiskConfigs() {
        // basic
        HttpRequestDef.Builder<ListRiskConfigsRequest, ListRiskConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRiskConfigsRequest.class, ListRiskConfigsResponse.class)
                .withName("ListRiskConfigs")
                .withUri("/v5/{project_id}/baseline/risk-configs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigsRequest::getEnterpriseProjectId,
                ListRiskConfigsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("check_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigsRequest::getCheckName, ListRiskConfigsRequest::setCheckName));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigsRequest::getGroupId, ListRiskConfigsRequest::setGroupId));
        builder.<String>withRequestField("severity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigsRequest::getSeverity, ListRiskConfigsRequest::setSeverity));
        builder.<String>withRequestField("standard",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigsRequest::getStandard, ListRiskConfigsRequest::setStandard));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskConfigsRequest::getHostId, ListRiskConfigsRequest::setHostId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRiskConfigsRequest::getLimit, ListRiskConfigsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRiskConfigsRequest::getOffset, ListRiskConfigsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecurityEventsRequest, ListSecurityEventsResponse> listSecurityEvents =
        genForListSecurityEvents();

    private static HttpRequestDef<ListSecurityEventsRequest, ListSecurityEventsResponse> genForListSecurityEvents() {
        // basic
        HttpRequestDef.Builder<ListSecurityEventsRequest, ListSecurityEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSecurityEventsRequest.class, ListSecurityEventsResponse.class)
                .withName("ListSecurityEvents")
                .withUri("/v5/{project_id}/event/events")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getCategory, ListSecurityEventsRequest::setCategory));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getEnterpriseProjectId,
                ListSecurityEventsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("last_days",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getLastDays, ListSecurityEventsRequest::setLastDays));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getHostName, ListSecurityEventsRequest::setHostName));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getHostId, ListSecurityEventsRequest::setHostId));
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getPrivateIp, ListSecurityEventsRequest::setPrivateIp));
        builder.<String>withRequestField("public_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getPublicIp, ListSecurityEventsRequest::setPublicIp));
        builder.<String>withRequestField("container_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getContainerName,
                ListSecurityEventsRequest::setContainerName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getOffset, ListSecurityEventsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getLimit, ListSecurityEventsRequest::setLimit));
        builder.<List<Integer>>withRequestField("event_types",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getEventTypes, ListSecurityEventsRequest::setEventTypes));
        builder.<String>withRequestField("handle_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getHandleStatus,
                ListSecurityEventsRequest::setHandleStatus));
        builder.<String>withRequestField("severity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getSeverity, ListSecurityEventsRequest::setSeverity));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getBeginTime, ListSecurityEventsRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getEndTime, ListSecurityEventsRequest::setEndTime));
        builder.<List<String>>withRequestField("event_class_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getEventClassIds,
                ListSecurityEventsRequest::setEventClassIds));
        builder.<List<String>>withRequestField("severity_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getSeverityList,
                ListSecurityEventsRequest::setSeverityList));
        builder.<String>withRequestField("attack_tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getAttackTag, ListSecurityEventsRequest::setAttackTag));
        builder.<String>withRequestField("asset_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getAssetValue, ListSecurityEventsRequest::setAssetValue));
        builder.<List<String>>withRequestField("tag_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getTagList, ListSecurityEventsRequest::setTagList));
        builder.<String>withRequestField("att_ck",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getAttCk, ListSecurityEventsRequest::setAttCk));
        builder.<String>withRequestField("event_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getEventName, ListSecurityEventsRequest::setEventName));
        builder.<Boolean>withRequestField("auto_block",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getAutoBlock, ListSecurityEventsRequest::setAutoBlock));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityEventsRequest::getRegion, ListSecurityEventsRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecurityGroupPoliciesRequest, ListSecurityGroupPoliciesResponse> listSecurityGroupPolicies =
        genForListSecurityGroupPolicies();

    private static HttpRequestDef<ListSecurityGroupPoliciesRequest, ListSecurityGroupPoliciesResponse> genForListSecurityGroupPolicies() {
        // basic
        HttpRequestDef.Builder<ListSecurityGroupPoliciesRequest, ListSecurityGroupPoliciesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListSecurityGroupPoliciesRequest.class,
                    ListSecurityGroupPoliciesResponse.class)
                .withName("ListSecurityGroupPolicies")
                .withUri("/v5/{project_id}/container-network/{cluster_id}/security-group-policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityGroupPoliciesRequest::getClusterId,
                ListSecurityGroupPoliciesRequest::setClusterId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityGroupPoliciesRequest::getEnterpriseProjectId,
                ListSecurityGroupPoliciesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityGroupPoliciesRequest::getLimit,
                ListSecurityGroupPoliciesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecurityGroupPoliciesRequest::getOffset,
                ListSecurityGroupPoliciesRequest::setOffset));

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
                .withUri("/v5/{project_id}/container-network/security-groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecurityGroupsRequest::getEnterpriseProjectId,
                ListSecurityGroupsRequest::setEnterpriseProjectId));

        // response
        builder.<List<SecurityGroup>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSecurityGroupsResponse::getBody, ListSecurityGroupsResponse::setBody)
                .withInnerContainerType(SecurityGroup.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListSwrImageRepositoryRequest, ListSwrImageRepositoryResponse> listSwrImageRepository =
        genForListSwrImageRepository();

    private static HttpRequestDef<ListSwrImageRepositoryRequest, ListSwrImageRepositoryResponse> genForListSwrImageRepository() {
        // basic
        HttpRequestDef.Builder<ListSwrImageRepositoryRequest, ListSwrImageRepositoryResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSwrImageRepositoryRequest.class, ListSwrImageRepositoryResponse.class)
            .withName("ListSwrImageRepository")
            .withUri("/v5/{project_id}/image/swr-repository")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getEnterpriseProjectId,
                ListSwrImageRepositoryRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getNamespace,
                ListSwrImageRepositoryRequest::setNamespace));
        builder.<String>withRequestField("image_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getImageName,
                ListSwrImageRepositoryRequest::setImageName));
        builder.<String>withRequestField("image_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getImageVersion,
                ListSwrImageRepositoryRequest::setImageVersion));
        builder.<Boolean>withRequestField("latest_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getLatestVersion,
                ListSwrImageRepositoryRequest::setLatestVersion));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getOffset, ListSwrImageRepositoryRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getLimit, ListSwrImageRepositoryRequest::setLimit));
        builder.<String>withRequestField("image_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getImageType,
                ListSwrImageRepositoryRequest::setImageType));
        builder.<String>withRequestField("scan_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getScanStatus,
                ListSwrImageRepositoryRequest::setScanStatus));
        builder.<String>withRequestField("instance_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getInstanceName,
                ListSwrImageRepositoryRequest::setInstanceName));
        builder.<Long>withRequestField("image_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getImageSize,
                ListSwrImageRepositoryRequest::setImageSize));
        builder.<Long>withRequestField("start_latest_update_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getStartLatestUpdateTime,
                ListSwrImageRepositoryRequest::setStartLatestUpdateTime));
        builder.<Long>withRequestField("end_latest_update_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getEndLatestUpdateTime,
                ListSwrImageRepositoryRequest::setEndLatestUpdateTime));
        builder.<Long>withRequestField("start_latest_scan_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getStartLatestScanTime,
                ListSwrImageRepositoryRequest::setStartLatestScanTime));
        builder.<Long>withRequestField("end_latest_scan_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getEndLatestScanTime,
                ListSwrImageRepositoryRequest::setEndLatestScanTime));
        builder.<Boolean>withRequestField("has_malicious_file",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getHasMaliciousFile,
                ListSwrImageRepositoryRequest::setHasMaliciousFile));
        builder.<Boolean>withRequestField("has_unsafe_setting",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getHasUnsafeSetting,
                ListSwrImageRepositoryRequest::setHasUnsafeSetting));
        builder.<Boolean>withRequestField("has_vul",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getHasVul, ListSwrImageRepositoryRequest::setHasVul));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getInstanceId,
                ListSwrImageRepositoryRequest::setInstanceId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSwrImageRepositoryRequest::getRegion, ListSwrImageRepositoryRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSystemUserWhiteListRequest, ListSystemUserWhiteListResponse> listSystemUserWhiteList =
        genForListSystemUserWhiteList();

    private static HttpRequestDef<ListSystemUserWhiteListRequest, ListSystemUserWhiteListResponse> genForListSystemUserWhiteList() {
        // basic
        HttpRequestDef.Builder<ListSystemUserWhiteListRequest, ListSystemUserWhiteListResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSystemUserWhiteListRequest.class, ListSystemUserWhiteListResponse.class)
            .withName("ListSystemUserWhiteList")
            .withUri("/v5/{project_id}/event/white-list/userlist")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSystemUserWhiteListRequest::getEnterpriseProjectId,
                ListSystemUserWhiteListRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSystemUserWhiteListRequest::getHostId,
                ListSystemUserWhiteListRequest::setHostId));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSystemUserWhiteListRequest::getHostName,
                ListSystemUserWhiteListRequest::setHostName));
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSystemUserWhiteListRequest::getPrivateIp,
                ListSystemUserWhiteListRequest::setPrivateIp));
        builder.<String>withRequestField("public_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSystemUserWhiteListRequest::getPublicIp,
                ListSystemUserWhiteListRequest::setPublicIp));
        builder.<String>withRequestField("system_user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSystemUserWhiteListRequest::getSystemUserName,
                ListSystemUserWhiteListRequest::setSystemUserName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSystemUserWhiteListRequest::getOffset,
                ListSystemUserWhiteListRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSystemUserWhiteListRequest::getLimit, ListSystemUserWhiteListRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTwoFactorLoginHostRequest, ListTwoFactorLoginHostResponse> listTwoFactorLoginHost =
        genForListTwoFactorLoginHost();

    private static HttpRequestDef<ListTwoFactorLoginHostRequest, ListTwoFactorLoginHostResponse> genForListTwoFactorLoginHost() {
        // basic
        HttpRequestDef.Builder<ListTwoFactorLoginHostRequest, ListTwoFactorLoginHostResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListTwoFactorLoginHostRequest.class, ListTwoFactorLoginHostResponse.class)
            .withName("ListTwoFactorLoginHost")
            .withUri("/v5/{project_id}/setting/two-factor-login/hosts")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTwoFactorLoginHostRequest::getEnterpriseProjectId,
                ListTwoFactorLoginHostRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTwoFactorLoginHostRequest::getHostName,
                ListTwoFactorLoginHostRequest::setHostName));
        builder.<String>withRequestField("display_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTwoFactorLoginHostRequest::getDisplayName,
                ListTwoFactorLoginHostRequest::setDisplayName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTwoFactorLoginHostRequest::getLimit, ListTwoFactorLoginHostRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTwoFactorLoginHostRequest::getOffset, ListTwoFactorLoginHostRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserChangeHistoriesRequest, ListUserChangeHistoriesResponse> listUserChangeHistories =
        genForListUserChangeHistories();

    private static HttpRequestDef<ListUserChangeHistoriesRequest, ListUserChangeHistoriesResponse> genForListUserChangeHistories() {
        // basic
        HttpRequestDef.Builder<ListUserChangeHistoriesRequest, ListUserChangeHistoriesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListUserChangeHistoriesRequest.class, ListUserChangeHistoriesResponse.class)
            .withName("ListUserChangeHistories")
            .withUri("/v5/{project_id}/asset/user/change-history")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserChangeHistoriesRequest::getHostName,
                ListUserChangeHistoriesRequest::setHostName));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserChangeHistoriesRequest::getHostId,
                ListUserChangeHistoriesRequest::setHostId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserChangeHistoriesRequest::getEnterpriseProjectId,
                ListUserChangeHistoriesRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserChangeHistoriesRequest::getUserName,
                ListUserChangeHistoriesRequest::setUserName));
        builder.<Boolean>withRequestField("root_permission",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListUserChangeHistoriesRequest::getRootPermission,
                ListUserChangeHistoriesRequest::setRootPermission));
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserChangeHistoriesRequest::getPrivateIp,
                ListUserChangeHistoriesRequest::setPrivateIp));
        builder.<String>withRequestField("change_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserChangeHistoriesRequest::getChangeType,
                ListUserChangeHistoriesRequest::setChangeType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserChangeHistoriesRequest::getLimit, ListUserChangeHistoriesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserChangeHistoriesRequest::getOffset,
                ListUserChangeHistoriesRequest::setOffset));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListUserChangeHistoriesRequest::getStartTime,
                ListUserChangeHistoriesRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListUserChangeHistoriesRequest::getEndTime,
                ListUserChangeHistoriesRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserStatisticsRequest, ListUserStatisticsResponse> listUserStatistics =
        genForListUserStatistics();

    private static HttpRequestDef<ListUserStatisticsRequest, ListUserStatisticsResponse> genForListUserStatistics() {
        // basic
        HttpRequestDef.Builder<ListUserStatisticsRequest, ListUserStatisticsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUserStatisticsRequest.class, ListUserStatisticsResponse.class)
                .withName("ListUserStatistics")
                .withUri("/v5/{project_id}/asset/user/statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserStatisticsRequest::getUserName, ListUserStatisticsRequest::setUserName));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserStatisticsRequest::getEnterpriseProjectId,
                ListUserStatisticsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserStatisticsRequest::getLimit, ListUserStatisticsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserStatisticsRequest::getOffset, ListUserStatisticsRequest::setOffset));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserStatisticsRequest::getCategory, ListUserStatisticsRequest::setCategory));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUsersRequest, ListUsersResponse> listUsers = genForListUsers();

    private static HttpRequestDef<ListUsersRequest, ListUsersResponse> genForListUsers() {
        // basic
        HttpRequestDef.Builder<ListUsersRequest, ListUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUsersRequest.class, ListUsersResponse.class)
                .withName("ListUsers")
                .withUri("/v5/{project_id}/asset/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getHostId, ListUsersRequest::setHostId));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getUserName, ListUsersRequest::setUserName));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getHostName, ListUsersRequest::setHostName));
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getPrivateIp, ListUsersRequest::setPrivateIp));
        builder.<Boolean>withRequestField("login_permission",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListUsersRequest::getLoginPermission, ListUsersRequest::setLoginPermission));
        builder.<Boolean>withRequestField("root_permission",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListUsersRequest::getRootPermission, ListUsersRequest::setRootPermission));
        builder.<String>withRequestField("user_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getUserGroup, ListUsersRequest::setUserGroup));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getEnterpriseProjectId, ListUsersRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsersRequest::getLimit, ListUsersRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsersRequest::getOffset, ListUsersRequest::setOffset));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getCategory, ListUsersRequest::setCategory));
        builder.<Boolean>withRequestField("part_match",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListUsersRequest::getPartMatch, ListUsersRequest::setPartMatch));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVulHandleHistoryRequest, ListVulHandleHistoryResponse> listVulHandleHistory =
        genForListVulHandleHistory();

    private static HttpRequestDef<ListVulHandleHistoryRequest, ListVulHandleHistoryResponse> genForListVulHandleHistory() {
        // basic
        HttpRequestDef.Builder<ListVulHandleHistoryRequest, ListVulHandleHistoryResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListVulHandleHistoryRequest.class, ListVulHandleHistoryResponse.class)
            .withName("ListVulHandleHistory")
            .withUri("/v5/{project_id}/vulnerability/handle-history")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHandleHistoryRequest::getEnterpriseProjectId,
                ListVulHandleHistoryRequest::setEnterpriseProjectId));
        builder.<List<String>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVulHandleHistoryRequest::getStatus, ListVulHandleHistoryRequest::setStatus));
        builder.<String>withRequestField("vul_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHandleHistoryRequest::getVulId, ListVulHandleHistoryRequest::setVulId));
        builder.<String>withRequestField("vul_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHandleHistoryRequest::getVulType, ListVulHandleHistoryRequest::setVulType));
        builder.<String>withRequestField("asset_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHandleHistoryRequest::getAssetValue,
                ListVulHandleHistoryRequest::setAssetValue));
        builder.<String>withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHandleHistoryRequest::getGroupName,
                ListVulHandleHistoryRequest::setGroupName));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHandleHistoryRequest::getHostName, ListVulHandleHistoryRequest::setHostName));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHandleHistoryRequest::getHostIp, ListVulHandleHistoryRequest::setHostIp));
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHandleHistoryRequest::getClusterId,
                ListVulHandleHistoryRequest::setClusterId));
        builder.<ListVulHandleHistoryRequest.SortKeyEnum>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListVulHandleHistoryRequest.SortKeyEnum.class),
            f -> f.withMarshaller(ListVulHandleHistoryRequest::getSortKey, ListVulHandleHistoryRequest::setSortKey));
        builder.<ListVulHandleHistoryRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListVulHandleHistoryRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListVulHandleHistoryRequest::getSortDir, ListVulHandleHistoryRequest::setSortDir));
        builder.<String>withRequestField("public_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHandleHistoryRequest::getPublicIp, ListVulHandleHistoryRequest::setPublicIp));
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHandleHistoryRequest::getPrivateIp,
                ListVulHandleHistoryRequest::setPrivateIp));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVulHandleHistoryRequest::getLimit, ListVulHandleHistoryRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVulHandleHistoryRequest::getOffset, ListVulHandleHistoryRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVulnerabilityCveRequest, ListVulnerabilityCveResponse> listVulnerabilityCve =
        genForListVulnerabilityCve();

    private static HttpRequestDef<ListVulnerabilityCveRequest, ListVulnerabilityCveResponse> genForListVulnerabilityCve() {
        // basic
        HttpRequestDef.Builder<ListVulnerabilityCveRequest, ListVulnerabilityCveResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListVulnerabilityCveRequest.class, ListVulnerabilityCveResponse.class)
            .withName("ListVulnerabilityCve")
            .withUri("/v5/{project_id}/image/vulnerability/{vul_id}/cve")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vul_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilityCveRequest::getVulId, ListVulnerabilityCveRequest::setVulId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilityCveRequest::getEnterpriseProjectId,
                ListVulnerabilityCveRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVulnerabilityCveRequest::getOffset, ListVulnerabilityCveRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVulnerabilityCveRequest::getLimit, ListVulnerabilityCveRequest::setLimit));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilityCveRequest::getRegion, ListVulnerabilityCveRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWeakPasswordUsersRequest, ListWeakPasswordUsersResponse> listWeakPasswordUsers =
        genForListWeakPasswordUsers();

    private static HttpRequestDef<ListWeakPasswordUsersRequest, ListWeakPasswordUsersResponse> genForListWeakPasswordUsers() {
        // basic
        HttpRequestDef.Builder<ListWeakPasswordUsersRequest, ListWeakPasswordUsersResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListWeakPasswordUsersRequest.class, ListWeakPasswordUsersResponse.class)
            .withName("ListWeakPasswordUsers")
            .withUri("/v5/{project_id}/baseline/weak-password-users")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWeakPasswordUsersRequest::getEnterpriseProjectId,
                ListWeakPasswordUsersRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWeakPasswordUsersRequest::getHostName,
                ListWeakPasswordUsersRequest::setHostName));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWeakPasswordUsersRequest::getHostIp, ListWeakPasswordUsersRequest::setHostIp));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWeakPasswordUsersRequest::getUserName,
                ListWeakPasswordUsersRequest::setUserName));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWeakPasswordUsersRequest::getHostId, ListWeakPasswordUsersRequest::setHostId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWeakPasswordUsersRequest::getLimit, ListWeakPasswordUsersRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWeakPasswordUsersRequest::getOffset, ListWeakPasswordUsersRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWebAppAndServiceStatisticsRequest, ListWebAppAndServiceStatisticsResponse> listWebAppAndServiceStatistics =
        genForListWebAppAndServiceStatistics();

    private static HttpRequestDef<ListWebAppAndServiceStatisticsRequest, ListWebAppAndServiceStatisticsResponse> genForListWebAppAndServiceStatistics() {
        // basic
        HttpRequestDef.Builder<ListWebAppAndServiceStatisticsRequest, ListWebAppAndServiceStatisticsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListWebAppAndServiceStatisticsRequest.class,
                    ListWebAppAndServiceStatisticsResponse.class)
                .withName("ListWebAppAndServiceStatistics")
                .withUri("/v5/{project_id}/asset/web-app-and-service-statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebAppAndServiceStatisticsRequest::getEnterpriseProjectId,
                ListWebAppAndServiceStatisticsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWebAppAndServiceStatisticsRequest::getOffset,
                ListWebAppAndServiceStatisticsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWebAppAndServiceStatisticsRequest::getLimit,
                ListWebAppAndServiceStatisticsRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebAppAndServiceStatisticsRequest::getName,
                ListWebAppAndServiceStatisticsRequest::setName));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebAppAndServiceStatisticsRequest::getCategory,
                ListWebAppAndServiceStatisticsRequest::setCategory));
        builder.<String>withRequestField("catalogue",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebAppAndServiceStatisticsRequest::getCatalogue,
                ListWebAppAndServiceStatisticsRequest::setCatalogue));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWebAppAndServicesRequest, ListWebAppAndServicesResponse> listWebAppAndServices =
        genForListWebAppAndServices();

    private static HttpRequestDef<ListWebAppAndServicesRequest, ListWebAppAndServicesResponse> genForListWebAppAndServices() {
        // basic
        HttpRequestDef.Builder<ListWebAppAndServicesRequest, ListWebAppAndServicesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListWebAppAndServicesRequest.class, ListWebAppAndServicesResponse.class)
            .withName("ListWebAppAndServices")
            .withUri("/v5/{project_id}/asset/web-app-and-services")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebAppAndServicesRequest::getEnterpriseProjectId,
                ListWebAppAndServicesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWebAppAndServicesRequest::getOffset, ListWebAppAndServicesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWebAppAndServicesRequest::getLimit, ListWebAppAndServicesRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebAppAndServicesRequest::getName, ListWebAppAndServicesRequest::setName));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebAppAndServicesRequest::getCategory,
                ListWebAppAndServicesRequest::setCategory));
        builder.<String>withRequestField("catalogue",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebAppAndServicesRequest::getCatalogue,
                ListWebAppAndServicesRequest::setCatalogue));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebAppAndServicesRequest::getHostName,
                ListWebAppAndServicesRequest::setHostName));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebAppAndServicesRequest::getHostId, ListWebAppAndServicesRequest::setHostId));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebAppAndServicesRequest::getHostIp, ListWebAppAndServicesRequest::setHostIp));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebAppAndServicesRequest::getVersion, ListWebAppAndServicesRequest::setVersion));
        builder.<String>withRequestField("install_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebAppAndServicesRequest::getInstallDir,
                ListWebAppAndServicesRequest::setInstallDir));
        builder.<Boolean>withRequestField("part_match",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListWebAppAndServicesRequest::getPartMatch,
                ListWebAppAndServicesRequest::setPartMatch));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWebFrameworkHostInfoRequest, ListWebFrameworkHostInfoResponse> listWebFrameworkHostInfo =
        genForListWebFrameworkHostInfo();

    private static HttpRequestDef<ListWebFrameworkHostInfoRequest, ListWebFrameworkHostInfoResponse> genForListWebFrameworkHostInfo() {
        // basic
        HttpRequestDef.Builder<ListWebFrameworkHostInfoRequest, ListWebFrameworkHostInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListWebFrameworkHostInfoRequest.class, ListWebFrameworkHostInfoResponse.class)
                .withName("ListWebFrameworkHostInfo")
                .withUri("/v5/{project_id}/asset/host/web-framework")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebFrameworkHostInfoRequest::getEnterpriseProjectId,
                ListWebFrameworkHostInfoRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWebFrameworkHostInfoRequest::getOffset,
                ListWebFrameworkHostInfoRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWebFrameworkHostInfoRequest::getLimit,
                ListWebFrameworkHostInfoRequest::setLimit));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebFrameworkHostInfoRequest::getCategory,
                ListWebFrameworkHostInfoRequest::setCategory));
        builder.<String>withRequestField("file_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebFrameworkHostInfoRequest::getFileName,
                ListWebFrameworkHostInfoRequest::setFileName));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebFrameworkHostInfoRequest::getHostName,
                ListWebFrameworkHostInfoRequest::setHostName));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebFrameworkHostInfoRequest::getHostIp,
                ListWebFrameworkHostInfoRequest::setHostIp));
        builder.<Boolean>withRequestField("part_match",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListWebFrameworkHostInfoRequest::getPartMatch,
                ListWebFrameworkHostInfoRequest::setPartMatch));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWebFrameworkStatisticsRequest, ListWebFrameworkStatisticsResponse> listWebFrameworkStatistics =
        genForListWebFrameworkStatistics();

    private static HttpRequestDef<ListWebFrameworkStatisticsRequest, ListWebFrameworkStatisticsResponse> genForListWebFrameworkStatistics() {
        // basic
        HttpRequestDef.Builder<ListWebFrameworkStatisticsRequest, ListWebFrameworkStatisticsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListWebFrameworkStatisticsRequest.class,
                    ListWebFrameworkStatisticsResponse.class)
                .withName("ListWebFrameworkStatistics")
                .withUri("/v5/{project_id}/asset/statistics/web-framework")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebFrameworkStatisticsRequest::getEnterpriseProjectId,
                ListWebFrameworkStatisticsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWebFrameworkStatisticsRequest::getOffset,
                ListWebFrameworkStatisticsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWebFrameworkStatisticsRequest::getLimit,
                ListWebFrameworkStatisticsRequest::setLimit));
        builder.<String>withRequestField("file_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebFrameworkStatisticsRequest::getFileName,
                ListWebFrameworkStatisticsRequest::setFileName));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebFrameworkStatisticsRequest::getCategory,
                ListWebFrameworkStatisticsRequest::setCategory));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWebSiteHostInfoRequest, ListWebSiteHostInfoResponse> listWebSiteHostInfo =
        genForListWebSiteHostInfo();

    private static HttpRequestDef<ListWebSiteHostInfoRequest, ListWebSiteHostInfoResponse> genForListWebSiteHostInfo() {
        // basic
        HttpRequestDef.Builder<ListWebSiteHostInfoRequest, ListWebSiteHostInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWebSiteHostInfoRequest.class, ListWebSiteHostInfoResponse.class)
                .withName("ListWebSiteHostInfo")
                .withUri("/v5/{project_id}/asset/host/web-site")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebSiteHostInfoRequest::getEnterpriseProjectId,
                ListWebSiteHostInfoRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWebSiteHostInfoRequest::getOffset, ListWebSiteHostInfoRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWebSiteHostInfoRequest::getLimit, ListWebSiteHostInfoRequest::setLimit));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebSiteHostInfoRequest::getCategory, ListWebSiteHostInfoRequest::setCategory));
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebSiteHostInfoRequest::getDomain, ListWebSiteHostInfoRequest::setDomain));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebSiteHostInfoRequest::getHostName, ListWebSiteHostInfoRequest::setHostName));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebSiteHostInfoRequest::getHostIp, ListWebSiteHostInfoRequest::setHostIp));
        builder.<Boolean>withRequestField("part_match",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListWebSiteHostInfoRequest::getPartMatch, ListWebSiteHostInfoRequest::setPartMatch));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWebSiteStatisticsRequest, ListWebSiteStatisticsResponse> listWebSiteStatistics =
        genForListWebSiteStatistics();

    private static HttpRequestDef<ListWebSiteStatisticsRequest, ListWebSiteStatisticsResponse> genForListWebSiteStatistics() {
        // basic
        HttpRequestDef.Builder<ListWebSiteStatisticsRequest, ListWebSiteStatisticsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListWebSiteStatisticsRequest.class, ListWebSiteStatisticsResponse.class)
            .withName("ListWebSiteStatistics")
            .withUri("/v5/{project_id}/asset/statistics/web-site")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebSiteStatisticsRequest::getEnterpriseProjectId,
                ListWebSiteStatisticsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWebSiteStatisticsRequest::getOffset, ListWebSiteStatisticsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWebSiteStatisticsRequest::getLimit, ListWebSiteStatisticsRequest::setLimit));
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebSiteStatisticsRequest::getDomain, ListWebSiteStatisticsRequest::setDomain));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkLoadsRequest, ListWorkLoadsResponse> listWorkLoads =
        genForListWorkLoads();

    private static HttpRequestDef<ListWorkLoadsRequest, ListWorkLoadsResponse> genForListWorkLoads() {
        // basic
        HttpRequestDef.Builder<ListWorkLoadsRequest, ListWorkLoadsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWorkLoadsRequest.class, ListWorkLoadsResponse.class)
                .withName("ListWorkLoads")
                .withUri("/v5/{project_id}/container-network/{cluster_id}/{namespace}/workloads")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkLoadsRequest::getClusterId, ListWorkLoadsRequest::setClusterId));
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkLoadsRequest::getNamespace, ListWorkLoadsRequest::setNamespace));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkLoadsRequest::getEnterpriseProjectId,
                ListWorkLoadsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("workload_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkLoadsRequest::getWorkloadType, ListWorkLoadsRequest::setWorkloadType));

        // response
        builder.<List<Workload>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListWorkLoadsResponse::getBody, ListWorkLoadsResponse::setBody)
                .withInnerContainerType(Workload.class));

        return builder.build();
    }

    public static final HttpRequestDef<ModifyDecoyPortPolicyRequest, ModifyDecoyPortPolicyResponse> modifyDecoyPortPolicy =
        genForModifyDecoyPortPolicy();

    private static HttpRequestDef<ModifyDecoyPortPolicyRequest, ModifyDecoyPortPolicyResponse> genForModifyDecoyPortPolicy() {
        // basic
        HttpRequestDef.Builder<ModifyDecoyPortPolicyRequest, ModifyDecoyPortPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, ModifyDecoyPortPolicyRequest.class, ModifyDecoyPortPolicyResponse.class)
            .withName("ModifyDecoyPortPolicy")
            .withUri("/v5/{project_id}/honeypot-port/policy/{policy_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyDecoyPortPolicyRequest::getPolicyId,
                ModifyDecoyPortPolicyRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyDecoyPortPolicyRequest::getEnterpriseProjectId,
                ModifyDecoyPortPolicyRequest::setEnterpriseProjectId));
        builder.<HoneypotPortPolicyContent>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(HoneypotPortPolicyContent.class),
            f -> f.withMarshaller(ModifyDecoyPortPolicyRequest::getBody, ModifyDecoyPortPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveAlarmWhiteListRequest, RemoveAlarmWhiteListResponse> removeAlarmWhiteList =
        genForRemoveAlarmWhiteList();

    private static HttpRequestDef<RemoveAlarmWhiteListRequest, RemoveAlarmWhiteListResponse> genForRemoveAlarmWhiteList() {
        // basic
        HttpRequestDef.Builder<RemoveAlarmWhiteListRequest, RemoveAlarmWhiteListResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, RemoveAlarmWhiteListRequest.class, RemoveAlarmWhiteListResponse.class)
            .withName("RemoveAlarmWhiteList")
            .withUri("/v5/{project_id}/event/white-list/alarm")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveAlarmWhiteListRequest::getEnterpriseProjectId,
                RemoveAlarmWhiteListRequest::setEnterpriseProjectId));
        builder.<RemoveAlarmWhiteListRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RemoveAlarmWhiteListRequestInfo.class),
            f -> f.withMarshaller(RemoveAlarmWhiteListRequest::getBody, RemoveAlarmWhiteListRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveLoginWhiteListRequest, RemoveLoginWhiteListResponse> removeLoginWhiteList =
        genForRemoveLoginWhiteList();

    private static HttpRequestDef<RemoveLoginWhiteListRequest, RemoveLoginWhiteListResponse> genForRemoveLoginWhiteList() {
        // basic
        HttpRequestDef.Builder<RemoveLoginWhiteListRequest, RemoveLoginWhiteListResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, RemoveLoginWhiteListRequest.class, RemoveLoginWhiteListResponse.class)
            .withName("RemoveLoginWhiteList")
            .withUri("/v5/{project_id}/event/white-list/login")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveLoginWhiteListRequest::getEnterpriseProjectId,
                RemoveLoginWhiteListRequest::setEnterpriseProjectId));
        builder.<RemoveLoginWhiteListRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RemoveLoginWhiteListRequestInfo.class),
            f -> f.withMarshaller(RemoveLoginWhiteListRequest::getBody, RemoveLoginWhiteListRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveSystemUserWhiteListRequest, RemoveSystemUserWhiteListResponse> removeSystemUserWhiteList =
        genForRemoveSystemUserWhiteList();

    private static HttpRequestDef<RemoveSystemUserWhiteListRequest, RemoveSystemUserWhiteListResponse> genForRemoveSystemUserWhiteList() {
        // basic
        HttpRequestDef.Builder<RemoveSystemUserWhiteListRequest, RemoveSystemUserWhiteListResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    RemoveSystemUserWhiteListRequest.class,
                    RemoveSystemUserWhiteListResponse.class)
                .withName("RemoveSystemUserWhiteList")
                .withUri("/v5/{project_id}/event/white-list/userlist")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveSystemUserWhiteListRequest::getEnterpriseProjectId,
                RemoveSystemUserWhiteListRequest::setEnterpriseProjectId));
        builder.<RemoveSystemUserWhiteListRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RemoveSystemUserWhiteListRequestInfo.class),
            f -> f.withMarshaller(RemoveSystemUserWhiteListRequest::getBody,
                RemoveSystemUserWhiteListRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunHostAssetManualCollectRequest, RunHostAssetManualCollectResponse> runHostAssetManualCollect =
        genForRunHostAssetManualCollect();

    private static HttpRequestDef<RunHostAssetManualCollectRequest, RunHostAssetManualCollectResponse> genForRunHostAssetManualCollect() {
        // basic
        HttpRequestDef.Builder<RunHostAssetManualCollectRequest, RunHostAssetManualCollectResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RunHostAssetManualCollectRequest.class,
                    RunHostAssetManualCollectResponse.class)
                .withName("RunHostAssetManualCollect")
                .withUri("/v5/{project_id}/asset/manual-collect/{type}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunHostAssetManualCollectRequest::getType,
                RunHostAssetManualCollectRequest::setType));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunHostAssetManualCollectRequest::getEnterpriseProjectId,
                RunHostAssetManualCollectRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunHostAssetManualCollectRequest::getHostId,
                RunHostAssetManualCollectRequest::setHostId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunImageSynchronizeRequest, RunImageSynchronizeResponse> runImageSynchronize =
        genForRunImageSynchronize();

    private static HttpRequestDef<RunImageSynchronizeRequest, RunImageSynchronizeResponse> genForRunImageSynchronize() {
        // basic
        HttpRequestDef.Builder<RunImageSynchronizeRequest, RunImageSynchronizeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunImageSynchronizeRequest.class, RunImageSynchronizeResponse.class)
                .withName("RunImageSynchronize")
                .withUri("/v5/{project_id}/image/synchronize")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunImageSynchronizeRequest::getEnterpriseProjectId,
                RunImageSynchronizeRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunImageSynchronizeRequest::getRegion, RunImageSynchronizeRequest::setRegion));
        builder.<RunImageSynchronizeRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunImageSynchronizeRequestInfo.class),
            f -> f.withMarshaller(RunImageSynchronizeRequest::getBody, RunImageSynchronizeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetTwoFactorLoginConfigRequest, SetTwoFactorLoginConfigResponse> setTwoFactorLoginConfig =
        genForSetTwoFactorLoginConfig();

    private static HttpRequestDef<SetTwoFactorLoginConfigRequest, SetTwoFactorLoginConfigResponse> genForSetTwoFactorLoginConfig() {
        // basic
        HttpRequestDef.Builder<SetTwoFactorLoginConfigRequest, SetTwoFactorLoginConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, SetTwoFactorLoginConfigRequest.class, SetTwoFactorLoginConfigResponse.class)
            .withName("SetTwoFactorLoginConfig")
            .withUri("/v5/{project_id}/setting/two-factor-login/config")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetTwoFactorLoginConfigRequest::getEnterpriseProjectId,
                SetTwoFactorLoginConfigRequest::setEnterpriseProjectId));
        builder.<SetTwoFactorLoginConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetTwoFactorLoginConfigRequestBody.class),
            f -> f.withMarshaller(SetTwoFactorLoginConfigRequest::getBody, SetTwoFactorLoginConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAgentStatisticsStatusRequest, ShowAgentStatisticsStatusResponse> showAgentStatisticsStatus =
        genForShowAgentStatisticsStatus();

    private static HttpRequestDef<ShowAgentStatisticsStatusRequest, ShowAgentStatisticsStatusResponse> genForShowAgentStatisticsStatus() {
        // basic
        HttpRequestDef.Builder<ShowAgentStatisticsStatusRequest, ShowAgentStatisticsStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowAgentStatisticsStatusRequest.class,
                    ShowAgentStatisticsStatusResponse.class)
                .withName("ShowAgentStatisticsStatus")
                .withUri("/v5/{project_id}/asset/overview/status/agent")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAgentStatisticsStatusRequest::getEnterpriseProjectId,
                ShowAgentStatisticsStatusRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppRaspSwitchStatusRequest, ShowAppRaspSwitchStatusResponse> showAppRaspSwitchStatus =
        genForShowAppRaspSwitchStatus();

    private static HttpRequestDef<ShowAppRaspSwitchStatusRequest, ShowAppRaspSwitchStatusResponse> genForShowAppRaspSwitchStatus() {
        // basic
        HttpRequestDef.Builder<ShowAppRaspSwitchStatusRequest, ShowAppRaspSwitchStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAppRaspSwitchStatusRequest.class, ShowAppRaspSwitchStatusResponse.class)
            .withName("ShowAppRaspSwitchStatus")
            .withUri("/v5/{project_id}/rasp/{host_id}/status")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppRaspSwitchStatusRequest::getHostId,
                ShowAppRaspSwitchStatusRequest::setHostId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppRaspSwitchStatusRequest::getEnterpriseProjectId,
                ShowAppRaspSwitchStatusRequest::setEnterpriseProjectId));
        builder.<ShowAppRaspSwitchStatusRequest.AppTypeEnum>withRequestField("app_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowAppRaspSwitchStatusRequest.AppTypeEnum.class),
            f -> f.withMarshaller(ShowAppRaspSwitchStatusRequest::getAppType,
                ShowAppRaspSwitchStatusRequest::setAppType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAssetStatisticRequest, ShowAssetStatisticResponse> showAssetStatistic =
        genForShowAssetStatistic();

    private static HttpRequestDef<ShowAssetStatisticRequest, ShowAssetStatisticResponse> genForShowAssetStatistic() {
        // basic
        HttpRequestDef.Builder<ShowAssetStatisticRequest, ShowAssetStatisticResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAssetStatisticRequest.class, ShowAssetStatisticResponse.class)
                .withName("ShowAssetStatistic")
                .withUri("/v5/{project_id}/asset/statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetStatisticRequest::getEnterpriseProjectId,
                ShowAssetStatisticRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetStatisticRequest::getHostId, ShowAssetStatisticRequest::setHostId));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetStatisticRequest::getCategory, ShowAssetStatisticRequest::setCategory));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBackupPolicyInfoRequest, ShowBackupPolicyInfoResponse> showBackupPolicyInfo =
        genForShowBackupPolicyInfo();

    private static HttpRequestDef<ShowBackupPolicyInfoRequest, ShowBackupPolicyInfoResponse> genForShowBackupPolicyInfo() {
        // basic
        HttpRequestDef.Builder<ShowBackupPolicyInfoRequest, ShowBackupPolicyInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowBackupPolicyInfoRequest.class, ShowBackupPolicyInfoResponse.class)
            .withName("ShowBackupPolicyInfo")
            .withUri("/v5/{project_id}/backup/policy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackupPolicyInfoRequest::getEnterpriseProjectId,
                ShowBackupPolicyInfoRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackupPolicyInfoRequest::getRegion, ShowBackupPolicyInfoRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBaselineScanStatusRequest, ShowBaselineScanStatusResponse> showBaselineScanStatus =
        genForShowBaselineScanStatus();

    private static HttpRequestDef<ShowBaselineScanStatusRequest, ShowBaselineScanStatusResponse> genForShowBaselineScanStatus() {
        // basic
        HttpRequestDef.Builder<ShowBaselineScanStatusRequest, ShowBaselineScanStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowBaselineScanStatusRequest.class, ShowBaselineScanStatusResponse.class)
            .withName("ShowBaselineScanStatus")
            .withUri("/v5/{project_id}/baseline/scan-status")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBaselineScanStatusRequest::getEnterpriseProjectId,
                ShowBaselineScanStatusRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBaselineWhiteListRequest, ShowBaselineWhiteListResponse> showBaselineWhiteList =
        genForShowBaselineWhiteList();

    private static HttpRequestDef<ShowBaselineWhiteListRequest, ShowBaselineWhiteListResponse> genForShowBaselineWhiteList() {
        // basic
        HttpRequestDef.Builder<ShowBaselineWhiteListRequest, ShowBaselineWhiteListResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowBaselineWhiteListRequest.class, ShowBaselineWhiteListResponse.class)
            .withName("ShowBaselineWhiteList")
            .withUri("/v5/{project_id}/baseline/whitelist")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBaselineWhiteListRequest::getEnterpriseProjectId,
                ShowBaselineWhiteListRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBaselineWhiteListRequest::getId, ShowBaselineWhiteListRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCheckRuleDetailRequest, ShowCheckRuleDetailResponse> showCheckRuleDetail =
        genForShowCheckRuleDetail();

    private static HttpRequestDef<ShowCheckRuleDetailRequest, ShowCheckRuleDetailResponse> genForShowCheckRuleDetail() {
        // basic
        HttpRequestDef.Builder<ShowCheckRuleDetailRequest, ShowCheckRuleDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCheckRuleDetailRequest.class, ShowCheckRuleDetailResponse.class)
                .withName("ShowCheckRuleDetail")
                .withUri("/v5/{project_id}/baseline/check-rule/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCheckRuleDetailRequest::getEnterpriseProjectId,
                ShowCheckRuleDetailRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("check_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCheckRuleDetailRequest::getCheckName, ShowCheckRuleDetailRequest::setCheckName));
        builder.<String>withRequestField("check_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCheckRuleDetailRequest::getCheckType, ShowCheckRuleDetailRequest::setCheckType));
        builder.<String>withRequestField("check_rule_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCheckRuleDetailRequest::getCheckRuleId,
                ShowCheckRuleDetailRequest::setCheckRuleId));
        builder.<String>withRequestField("standard",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCheckRuleDetailRequest::getStandard, ShowCheckRuleDetailRequest::setStandard));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCheckRuleDetailRequest::getHostId, ShowCheckRuleDetailRequest::setHostId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterAssetStatisticsRequest, ShowClusterAssetStatisticsResponse> showClusterAssetStatistics =
        genForShowClusterAssetStatistics();

    private static HttpRequestDef<ShowClusterAssetStatisticsRequest, ShowClusterAssetStatisticsResponse> genForShowClusterAssetStatistics() {
        // basic
        HttpRequestDef.Builder<ShowClusterAssetStatisticsRequest, ShowClusterAssetStatisticsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowClusterAssetStatisticsRequest.class,
                    ShowClusterAssetStatisticsResponse.class)
                .withName("ShowClusterAssetStatistics")
                .withUri("/v5/{project_id}/cluster/asset/statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterAssetStatisticsRequest::getEnterpriseProjectId,
                ShowClusterAssetStatisticsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterProtectPolicyTemplateRequest, ShowClusterProtectPolicyTemplateResponse> showClusterProtectPolicyTemplate =
        genForShowClusterProtectPolicyTemplate();

    private static HttpRequestDef<ShowClusterProtectPolicyTemplateRequest, ShowClusterProtectPolicyTemplateResponse> genForShowClusterProtectPolicyTemplate() {
        // basic
        HttpRequestDef.Builder<ShowClusterProtectPolicyTemplateRequest, ShowClusterProtectPolicyTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowClusterProtectPolicyTemplateRequest.class,
                    ShowClusterProtectPolicyTemplateResponse.class)
                .withName("ShowClusterProtectPolicyTemplate")
                .withUri("/v5/{project_id}/container/clusters/protection-policy-templates/{policy_template_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterProtectPolicyTemplateRequest::getPolicyTemplateId,
                ShowClusterProtectPolicyTemplateRequest::setPolicyTemplateId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterProtectPolicyTemplateRequest::getEnterpriseProjectId,
                ShowClusterProtectPolicyTemplateRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCommonPortRequest, ShowCommonPortResponse> showCommonPort =
        genForShowCommonPort();

    private static HttpRequestDef<ShowCommonPortRequest, ShowCommonPortResponse> genForShowCommonPort() {
        // basic
        HttpRequestDef.Builder<ShowCommonPortRequest, ShowCommonPortResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCommonPortRequest.class, ShowCommonPortResponse.class)
                .withName("ShowCommonPort")
                .withUri("/v5/{project_id}/asset/common-port-info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCommonPortRequest::getEnterpriseProjectId,
                ShowCommonPortRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("port",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCommonPortRequest::getPort, ShowCommonPortRequest::setPort));
        builder.<String>withRequestField("categoty",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCommonPortRequest::getCategoty, ShowCommonPortRequest::setCategoty));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowContainerNetworkInfoRequest, ShowContainerNetworkInfoResponse> showContainerNetworkInfo =
        genForShowContainerNetworkInfo();

    private static HttpRequestDef<ShowContainerNetworkInfoRequest, ShowContainerNetworkInfoResponse> genForShowContainerNetworkInfo() {
        // basic
        HttpRequestDef.Builder<ShowContainerNetworkInfoRequest, ShowContainerNetworkInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowContainerNetworkInfoRequest.class, ShowContainerNetworkInfoResponse.class)
                .withName("ShowContainerNetworkInfo")
                .withUri("/v5/{project_id}/container-network/{cluster_id}/network-info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowContainerNetworkInfoRequest::getClusterId,
                ShowContainerNetworkInfoRequest::setClusterId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowContainerNetworkInfoRequest::getEnterpriseProjectId,
                ShowContainerNetworkInfoRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowContainerNodeStatisticsRequest, ShowContainerNodeStatisticsResponse> showContainerNodeStatistics =
        genForShowContainerNodeStatistics();

    private static HttpRequestDef<ShowContainerNodeStatisticsRequest, ShowContainerNodeStatisticsResponse> genForShowContainerNodeStatistics() {
        // basic
        HttpRequestDef.Builder<ShowContainerNodeStatisticsRequest, ShowContainerNodeStatisticsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowContainerNodeStatisticsRequest.class,
                    ShowContainerNodeStatisticsResponse.class)
                .withName("ShowContainerNodeStatistics")
                .withUri("/v5/{project_id}/container/node-statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowContainerNodeStatisticsRequest::getEnterpriseProjectId,
                ShowContainerNodeStatisticsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowContainerProtectionStatusRequest, ShowContainerProtectionStatusResponse> showContainerProtectionStatus =
        genForShowContainerProtectionStatus();

    private static HttpRequestDef<ShowContainerProtectionStatusRequest, ShowContainerProtectionStatusResponse> genForShowContainerProtectionStatus() {
        // basic
        HttpRequestDef.Builder<ShowContainerProtectionStatusRequest, ShowContainerProtectionStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowContainerProtectionStatusRequest.class,
                    ShowContainerProtectionStatusResponse.class)
                .withName("ShowContainerProtectionStatus")
                .withUri("/v5/{project_id}/asset/overview/status/container/protection")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowContainerProtectionStatusRequest::getEnterpriseProjectId,
                ShowContainerProtectionStatusRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDecoyPortPolicyDetailsRequest, ShowDecoyPortPolicyDetailsResponse> showDecoyPortPolicyDetails =
        genForShowDecoyPortPolicyDetails();

    private static HttpRequestDef<ShowDecoyPortPolicyDetailsRequest, ShowDecoyPortPolicyDetailsResponse> genForShowDecoyPortPolicyDetails() {
        // basic
        HttpRequestDef.Builder<ShowDecoyPortPolicyDetailsRequest, ShowDecoyPortPolicyDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDecoyPortPolicyDetailsRequest.class,
                    ShowDecoyPortPolicyDetailsResponse.class)
                .withName("ShowDecoyPortPolicyDetails")
                .withUri("/v5/{project_id}/honeypot-port/policy/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDecoyPortPolicyDetailsRequest::getPolicyId,
                ShowDecoyPortPolicyDetailsRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDecoyPortPolicyDetailsRequest::getEnterpriseProjectId,
                ShowDecoyPortPolicyDetailsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDecoyPortPolicyDetailsRequest::getOffset,
                ShowDecoyPortPolicyDetailsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDecoyPortPolicyDetailsRequest::getLimit,
                ShowDecoyPortPolicyDetailsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHostAssetManualCollectStatusRequest, ShowHostAssetManualCollectStatusResponse> showHostAssetManualCollectStatus =
        genForShowHostAssetManualCollectStatus();

    private static HttpRequestDef<ShowHostAssetManualCollectStatusRequest, ShowHostAssetManualCollectStatusResponse> genForShowHostAssetManualCollectStatus() {
        // basic
        HttpRequestDef.Builder<ShowHostAssetManualCollectStatusRequest, ShowHostAssetManualCollectStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowHostAssetManualCollectStatusRequest.class,
                    ShowHostAssetManualCollectStatusResponse.class)
                .withName("ShowHostAssetManualCollectStatus")
                .withUri("/v5/{project_id}/asset/manual-collect/{type}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHostAssetManualCollectStatusRequest::getType,
                ShowHostAssetManualCollectStatusRequest::setType));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHostAssetManualCollectStatusRequest::getEnterpriseProjectId,
                ShowHostAssetManualCollectStatusRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHostAssetManualCollectStatusRequest::getHostId,
                ShowHostAssetManualCollectStatusRequest::setHostId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHostProtectionStatusRequest, ShowHostProtectionStatusResponse> showHostProtectionStatus =
        genForShowHostProtectionStatus();

    private static HttpRequestDef<ShowHostProtectionStatusRequest, ShowHostProtectionStatusResponse> genForShowHostProtectionStatus() {
        // basic
        HttpRequestDef.Builder<ShowHostProtectionStatusRequest, ShowHostProtectionStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowHostProtectionStatusRequest.class, ShowHostProtectionStatusResponse.class)
                .withName("ShowHostProtectionStatus")
                .withUri("/v5/{project_id}/asset/overview/status/host/protection")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHostProtectionStatusRequest::getEnterpriseProjectId,
                ShowHostProtectionStatusRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowImageAssetStatisticsRequest, ShowImageAssetStatisticsResponse> showImageAssetStatistics =
        genForShowImageAssetStatistics();

    private static HttpRequestDef<ShowImageAssetStatisticsRequest, ShowImageAssetStatisticsResponse> genForShowImageAssetStatistics() {
        // basic
        HttpRequestDef.Builder<ShowImageAssetStatisticsRequest, ShowImageAssetStatisticsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowImageAssetStatisticsRequest.class, ShowImageAssetStatisticsResponse.class)
                .withName("ShowImageAssetStatistics")
                .withUri("/v5/{project_id}/image/asset/statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageAssetStatisticsRequest::getEnterpriseProjectId,
                ShowImageAssetStatisticsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowImageCheckRuleDetailRequest, ShowImageCheckRuleDetailResponse> showImageCheckRuleDetail =
        genForShowImageCheckRuleDetail();

    private static HttpRequestDef<ShowImageCheckRuleDetailRequest, ShowImageCheckRuleDetailResponse> genForShowImageCheckRuleDetail() {
        // basic
        HttpRequestDef.Builder<ShowImageCheckRuleDetailRequest, ShowImageCheckRuleDetailResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowImageCheckRuleDetailRequest.class, ShowImageCheckRuleDetailResponse.class)
                .withName("ShowImageCheckRuleDetail")
                .withUri("/v5/{project_id}/image/baseline/check-rule/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageCheckRuleDetailRequest::getEnterpriseProjectId,
                ShowImageCheckRuleDetailRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("image_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageCheckRuleDetailRequest::getImageType,
                ShowImageCheckRuleDetailRequest::setImageType));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageCheckRuleDetailRequest::getNamespace,
                ShowImageCheckRuleDetailRequest::setNamespace));
        builder.<String>withRequestField("image_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageCheckRuleDetailRequest::getImageName,
                ShowImageCheckRuleDetailRequest::setImageName));
        builder.<String>withRequestField("image_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageCheckRuleDetailRequest::getImageVersion,
                ShowImageCheckRuleDetailRequest::setImageVersion));
        builder.<String>withRequestField("image_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageCheckRuleDetailRequest::getImageId,
                ShowImageCheckRuleDetailRequest::setImageId));
        builder.<String>withRequestField("check_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageCheckRuleDetailRequest::getCheckName,
                ShowImageCheckRuleDetailRequest::setCheckName));
        builder.<String>withRequestField("check_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageCheckRuleDetailRequest::getCheckType,
                ShowImageCheckRuleDetailRequest::setCheckType));
        builder.<String>withRequestField("check_rule_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageCheckRuleDetailRequest::getCheckRuleId,
                ShowImageCheckRuleDetailRequest::setCheckRuleId));
        builder.<String>withRequestField("standard",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageCheckRuleDetailRequest::getStandard,
                ShowImageCheckRuleDetailRequest::setStandard));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageCheckRuleDetailRequest::getInstanceId,
                ShowImageCheckRuleDetailRequest::setInstanceId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageCheckRuleDetailRequest::getRegion,
                ShowImageCheckRuleDetailRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowK8sContainerDetailRequest, ShowK8sContainerDetailResponse> showK8sContainerDetail =
        genForShowK8sContainerDetail();

    private static HttpRequestDef<ShowK8sContainerDetailRequest, ShowK8sContainerDetailResponse> genForShowK8sContainerDetail() {
        // basic
        HttpRequestDef.Builder<ShowK8sContainerDetailRequest, ShowK8sContainerDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowK8sContainerDetailRequest.class, ShowK8sContainerDetailResponse.class)
            .withName("ShowK8sContainerDetail")
            .withUri("/v5/{project_id}/kubernetes/container/detail")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowK8sContainerDetailRequest::getEnterpriseProjectId,
                ShowK8sContainerDetailRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("container_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowK8sContainerDetailRequest::getContainerId,
                ShowK8sContainerDetailRequest::setContainerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowK8sPodDetailRequest, ShowK8sPodDetailResponse> showK8sPodDetail =
        genForShowK8sPodDetail();

    private static HttpRequestDef<ShowK8sPodDetailRequest, ShowK8sPodDetailResponse> genForShowK8sPodDetail() {
        // basic
        HttpRequestDef.Builder<ShowK8sPodDetailRequest, ShowK8sPodDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowK8sPodDetailRequest.class, ShowK8sPodDetailResponse.class)
                .withName("ShowK8sPodDetail")
                .withUri("/v5/{project_id}/kubernetes/{pod_name}/pod/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pod_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowK8sPodDetailRequest::getPodName, ShowK8sPodDetailRequest::setPodName));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowK8sPodDetailRequest::getEnterpriseProjectId,
                ShowK8sPodDetailRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowKubernetesEndpointInfoRequest, ShowKubernetesEndpointInfoResponse> showKubernetesEndpointInfo =
        genForShowKubernetesEndpointInfo();

    private static HttpRequestDef<ShowKubernetesEndpointInfoRequest, ShowKubernetesEndpointInfoResponse> genForShowKubernetesEndpointInfo() {
        // basic
        HttpRequestDef.Builder<ShowKubernetesEndpointInfoRequest, ShowKubernetesEndpointInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowKubernetesEndpointInfoRequest.class,
                    ShowKubernetesEndpointInfoResponse.class)
                .withName("ShowKubernetesEndpointInfo")
                .withUri("/v5/{project_id}/kubernetes/endpoint/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKubernetesEndpointInfoRequest::getEnterpriseProjectId,
                ShowKubernetesEndpointInfoRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKubernetesEndpointInfoRequest::getId, ShowKubernetesEndpointInfoRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowKubernetesServiceInfoRequest, ShowKubernetesServiceInfoResponse> showKubernetesServiceInfo =
        genForShowKubernetesServiceInfo();

    private static HttpRequestDef<ShowKubernetesServiceInfoRequest, ShowKubernetesServiceInfoResponse> genForShowKubernetesServiceInfo() {
        // basic
        HttpRequestDef.Builder<ShowKubernetesServiceInfoRequest, ShowKubernetesServiceInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowKubernetesServiceInfoRequest.class,
                    ShowKubernetesServiceInfoResponse.class)
                .withName("ShowKubernetesServiceInfo")
                .withUri("/v5/{project_id}/kubernetes/service/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKubernetesServiceInfoRequest::getEnterpriseProjectId,
                ShowKubernetesServiceInfoRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKubernetesServiceInfoRequest::getId, ShowKubernetesServiceInfoRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLatestExportTaskByTypeRequest, ShowLatestExportTaskByTypeResponse> showLatestExportTaskByType =
        genForShowLatestExportTaskByType();

    private static HttpRequestDef<ShowLatestExportTaskByTypeRequest, ShowLatestExportTaskByTypeResponse> genForShowLatestExportTaskByType() {
        // basic
        HttpRequestDef.Builder<ShowLatestExportTaskByTypeRequest, ShowLatestExportTaskByTypeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowLatestExportTaskByTypeRequest.class,
                    ShowLatestExportTaskByTypeResponse.class)
                .withName("ShowLatestExportTaskByType")
                .withUri("/v5/{project_id}/export-task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLatestExportTaskByTypeRequest::getEnterpriseProjectId,
                ShowLatestExportTaskByTypeRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("export_task_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLatestExportTaskByTypeRequest::getExportTaskType,
                ShowLatestExportTaskByTypeRequest::setExportTaskType));
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLatestExportTaskByTypeRequest::getTaskId,
                ShowLatestExportTaskByTypeRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNetworkStatisticsRequest, ShowNetworkStatisticsResponse> showNetworkStatistics =
        genForShowNetworkStatistics();

    private static HttpRequestDef<ShowNetworkStatisticsRequest, ShowNetworkStatisticsResponse> genForShowNetworkStatistics() {
        // basic
        HttpRequestDef.Builder<ShowNetworkStatisticsRequest, ShowNetworkStatisticsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowNetworkStatisticsRequest.class, ShowNetworkStatisticsResponse.class)
            .withName("ShowNetworkStatistics")
            .withUri("/v5/{project_id}/container-network/network-statistics")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNetworkStatisticsRequest::getEnterpriseProjectId,
                ShowNetworkStatisticsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOsStatisticsInfoRequest, ShowOsStatisticsInfoResponse> showOsStatisticsInfo =
        genForShowOsStatisticsInfo();

    private static HttpRequestDef<ShowOsStatisticsInfoRequest, ShowOsStatisticsInfoResponse> genForShowOsStatisticsInfo() {
        // basic
        HttpRequestDef.Builder<ShowOsStatisticsInfoRequest, ShowOsStatisticsInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowOsStatisticsInfoRequest.class, ShowOsStatisticsInfoResponse.class)
            .withName("ShowOsStatisticsInfo")
            .withUri("/v5/{project_id}/asset/overview/status/os")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOsStatisticsInfoRequest::getEnterpriseProjectId,
                ShowOsStatisticsInfoRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPageNoticesRequest, ShowPageNoticesResponse> showPageNotices =
        genForShowPageNotices();

    private static HttpRequestDef<ShowPageNoticesRequest, ShowPageNoticesResponse> genForShowPageNotices() {
        // basic
        HttpRequestDef.Builder<ShowPageNoticesRequest, ShowPageNoticesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPageNoticesRequest.class, ShowPageNoticesResponse.class)
                .withName("ShowPageNotices")
                .withUri("/v5/{project_id}/setting/page-notices")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPageNoticesRequest::getEnterpriseProjectId,
                ShowPageNoticesRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("page_location",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPageNoticesRequest::getPageLocation, ShowPageNoticesRequest::setPageLocation));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProductdataOfferingInfosRequest, ShowProductdataOfferingInfosResponse> showProductdataOfferingInfos =
        genForShowProductdataOfferingInfos();

    private static HttpRequestDef<ShowProductdataOfferingInfosRequest, ShowProductdataOfferingInfosResponse> genForShowProductdataOfferingInfos() {
        // basic
        HttpRequestDef.Builder<ShowProductdataOfferingInfosRequest, ShowProductdataOfferingInfosResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowProductdataOfferingInfosRequest.class,
                    ShowProductdataOfferingInfosResponse.class)
                .withName("ShowProductdataOfferingInfos")
                .withUri("/v5/{project_id}/product/productdata/offering-infos")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProductdataOfferingInfosRequest::getEnterpriseProjectId,
                ShowProductdataOfferingInfosRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("site_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProductdataOfferingInfosRequest::getSiteCode,
                ShowProductdataOfferingInfosRequest::setSiteCode));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProductdataOfferingInfosRequest::getRegion,
                ShowProductdataOfferingInfosRequest::setRegion));

        // response
        builder.<List<ResourceProductDataObjectInfo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ShowProductdataOfferingInfosResponse::getBody,
                    ShowProductdataOfferingInfosResponse::setBody)
                .withInnerContainerType(ResourceProductDataObjectInfo.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotaStatisticsInfoRequest, ShowQuotaStatisticsInfoResponse> showQuotaStatisticsInfo =
        genForShowQuotaStatisticsInfo();

    private static HttpRequestDef<ShowQuotaStatisticsInfoRequest, ShowQuotaStatisticsInfoResponse> genForShowQuotaStatisticsInfo() {
        // basic
        HttpRequestDef.Builder<ShowQuotaStatisticsInfoRequest, ShowQuotaStatisticsInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowQuotaStatisticsInfoRequest.class, ShowQuotaStatisticsInfoResponse.class)
            .withName("ShowQuotaStatisticsInfo")
            .withUri("/v5/{project_id}/asset/overview/status/quota")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQuotaStatisticsInfoRequest::getEnterpriseProjectId,
                ShowQuotaStatisticsInfoRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRaspPolicyDetailRequest, ShowRaspPolicyDetailResponse> showRaspPolicyDetail =
        genForShowRaspPolicyDetail();

    private static HttpRequestDef<ShowRaspPolicyDetailRequest, ShowRaspPolicyDetailResponse> genForShowRaspPolicyDetail() {
        // basic
        HttpRequestDef.Builder<ShowRaspPolicyDetailRequest, ShowRaspPolicyDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowRaspPolicyDetailRequest.class, ShowRaspPolicyDetailResponse.class)
            .withName("ShowRaspPolicyDetail")
            .withUri("/v5/{project_id}/rasp/policy/detail")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRaspPolicyDetailRequest::getEnterpriseProjectId,
                ShowRaspPolicyDetailRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("policy_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRaspPolicyDetailRequest::getPolicyId, ShowRaspPolicyDetailRequest::setPolicyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRaspProtectStatisticsRequest, ShowRaspProtectStatisticsResponse> showRaspProtectStatistics =
        genForShowRaspProtectStatistics();

    private static HttpRequestDef<ShowRaspProtectStatisticsRequest, ShowRaspProtectStatisticsResponse> genForShowRaspProtectStatistics() {
        // basic
        HttpRequestDef.Builder<ShowRaspProtectStatisticsRequest, ShowRaspProtectStatisticsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowRaspProtectStatisticsRequest.class,
                    ShowRaspProtectStatisticsResponse.class)
                .withName("ShowRaspProtectStatistics")
                .withUri("/v5/{project_id}/rasp/statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRaspProtectStatisticsRequest::getEnterpriseProjectId,
                ShowRaspProtectStatisticsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRaspServerDetailRequest, ShowRaspServerDetailResponse> showRaspServerDetail =
        genForShowRaspServerDetail();

    private static HttpRequestDef<ShowRaspServerDetailRequest, ShowRaspServerDetailResponse> genForShowRaspServerDetail() {
        // basic
        HttpRequestDef.Builder<ShowRaspServerDetailRequest, ShowRaspServerDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowRaspServerDetailRequest.class, ShowRaspServerDetailResponse.class)
            .withName("ShowRaspServerDetail")
            .withUri("/v5/{project_id}/rasp/servers/{host_id}/applications")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRaspServerDetailRequest::getHostId, ShowRaspServerDetailRequest::setHostId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRaspServerDetailRequest::getEnterpriseProjectId,
                ShowRaspServerDetailRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRaspServerDetailRequest::getLimit, ShowRaspServerDetailRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRaspServerDetailRequest::getOffset, ShowRaspServerDetailRequest::setOffset));
        builder.<String>withRequestField("keyword",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRaspServerDetailRequest::getKeyword, ShowRaspServerDetailRequest::setKeyword));
        builder.<Integer>withRequestField("app_protect_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRaspServerDetailRequest::getAppProtectStatus,
                ShowRaspServerDetailRequest::setAppProtectStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceQuotasRequest, ShowResourceQuotasResponse> showResourceQuotas =
        genForShowResourceQuotas();

    private static HttpRequestDef<ShowResourceQuotasRequest, ShowResourceQuotasResponse> genForShowResourceQuotas() {
        // basic
        HttpRequestDef.Builder<ShowResourceQuotasRequest, ShowResourceQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResourceQuotasRequest.class, ShowResourceQuotasResponse.class)
                .withName("ShowResourceQuotas")
                .withUri("/v5/{project_id}/billing/quotas")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceQuotasRequest::getEnterpriseProjectId,
                ShowResourceQuotasRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceQuotasRequest::getVersion, ShowResourceQuotasRequest::setVersion));
        builder.<String>withRequestField("charging_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceQuotasRequest::getChargingMode,
                ShowResourceQuotasRequest::setChargingMode));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRiskConfigDetailRequest, ShowRiskConfigDetailResponse> showRiskConfigDetail =
        genForShowRiskConfigDetail();

    private static HttpRequestDef<ShowRiskConfigDetailRequest, ShowRiskConfigDetailResponse> genForShowRiskConfigDetail() {
        // basic
        HttpRequestDef.Builder<ShowRiskConfigDetailRequest, ShowRiskConfigDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowRiskConfigDetailRequest.class, ShowRiskConfigDetailResponse.class)
            .withName("ShowRiskConfigDetail")
            .withUri("/v5/{project_id}/baseline/risk-config/{check_name}/detail")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("check_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRiskConfigDetailRequest::getCheckName,
                ShowRiskConfigDetailRequest::setCheckName));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRiskConfigDetailRequest::getEnterpriseProjectId,
                ShowRiskConfigDetailRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("standard",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRiskConfigDetailRequest::getStandard, ShowRiskConfigDetailRequest::setStandard));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRiskConfigDetailRequest::getHostId, ShowRiskConfigDetailRequest::setHostId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRiskConfigDetailRequest::getLimit, ShowRiskConfigDetailRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRiskConfigDetailRequest::getOffset, ShowRiskConfigDetailRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSingleBackupPolicyInfoRequest, ShowSingleBackupPolicyInfoResponse> showSingleBackupPolicyInfo =
        genForShowSingleBackupPolicyInfo();

    private static HttpRequestDef<ShowSingleBackupPolicyInfoRequest, ShowSingleBackupPolicyInfoResponse> genForShowSingleBackupPolicyInfo() {
        // basic
        HttpRequestDef.Builder<ShowSingleBackupPolicyInfoRequest, ShowSingleBackupPolicyInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowSingleBackupPolicyInfoRequest.class,
                    ShowSingleBackupPolicyInfoResponse.class)
                .withName("ShowSingleBackupPolicyInfo")
                .withUri("/v5/{project_id}/backup/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSingleBackupPolicyInfoRequest::getPolicyId,
                ShowSingleBackupPolicyInfoRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSingleBackupPolicyInfoRequest::getEnterpriseProjectId,
                ShowSingleBackupPolicyInfoRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartProtectionRequest, StartProtectionResponse> startProtection =
        genForStartProtection();

    private static HttpRequestDef<StartProtectionRequest, StartProtectionResponse> genForStartProtection() {
        // basic
        HttpRequestDef.Builder<StartProtectionRequest, StartProtectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartProtectionRequest.class, StartProtectionResponse.class)
                .withName("StartProtection")
                .withUri("/v5/{project_id}/ransomware/protection/open")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartProtectionRequest::getEnterpriseProjectId,
                StartProtectionRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartProtectionRequest::getRegion, StartProtectionRequest::setRegion));
        builder.<ProtectionInfoRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ProtectionInfoRequestInfo.class),
            f -> f.withMarshaller(StartProtectionRequest::getBody, StartProtectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopProtectionRequest, StopProtectionResponse> stopProtection =
        genForStopProtection();

    private static HttpRequestDef<StopProtectionRequest, StopProtectionResponse> genForStopProtection() {
        // basic
        HttpRequestDef.Builder<StopProtectionRequest, StopProtectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopProtectionRequest.class, StopProtectionResponse.class)
                .withName("StopProtection")
                .withUri("/v5/{project_id}/ransomware/protection/close")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopProtectionRequest::getEnterpriseProjectId,
                StopProtectionRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopProtectionRequest::getRegion, StopProtectionRequest::setRegion));
        builder.<CloseProtectionInfoRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CloseProtectionInfoRequestInfo.class),
            f -> f.withMarshaller(StopProtectionRequest::getBody, StopProtectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchClusterProtectionModeRequest, SwitchClusterProtectionModeResponse> switchClusterProtectionMode =
        genForSwitchClusterProtectionMode();

    private static HttpRequestDef<SwitchClusterProtectionModeRequest, SwitchClusterProtectionModeResponse> genForSwitchClusterProtectionMode() {
        // basic
        HttpRequestDef.Builder<SwitchClusterProtectionModeRequest, SwitchClusterProtectionModeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    SwitchClusterProtectionModeRequest.class,
                    SwitchClusterProtectionModeResponse.class)
                .withName("SwitchClusterProtectionMode")
                .withUri("/v5/{project_id}/cluster-protect/switch-mod")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchClusterProtectionModeRequest::getEnterpriseProjectId,
                SwitchClusterProtectionModeRequest::setEnterpriseProjectId));
        builder.<SwitchClusterProtectionModeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SwitchClusterProtectionModeRequestBody.class),
            f -> f.withMarshaller(SwitchClusterProtectionModeRequest::getBody,
                SwitchClusterProtectionModeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchContainerProtectStatusRequest, SwitchContainerProtectStatusResponse> switchContainerProtectStatus =
        genForSwitchContainerProtectStatus();

    private static HttpRequestDef<SwitchContainerProtectStatusRequest, SwitchContainerProtectStatusResponse> genForSwitchContainerProtectStatus() {
        // basic
        HttpRequestDef.Builder<SwitchContainerProtectStatusRequest, SwitchContainerProtectStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    SwitchContainerProtectStatusRequest.class,
                    SwitchContainerProtectStatusResponse.class)
                .withName("SwitchContainerProtectStatus")
                .withUri("/v5/{project_id}/container/switch-version")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchContainerProtectStatusRequest::getEnterpriseProjectId,
                SwitchContainerProtectStatusRequest::setEnterpriseProjectId));
        builder.<SwitchContainerHostsProtectStatusRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SwitchContainerHostsProtectStatusRequestInfo.class),
            f -> f.withMarshaller(SwitchContainerProtectStatusRequest::getBody,
                SwitchContainerProtectStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchDecoyPortHostPolicyRequest, SwitchDecoyPortHostPolicyResponse> switchDecoyPortHostPolicy =
        genForSwitchDecoyPortHostPolicy();

    private static HttpRequestDef<SwitchDecoyPortHostPolicyRequest, SwitchDecoyPortHostPolicyResponse> genForSwitchDecoyPortHostPolicy() {
        // basic
        HttpRequestDef.Builder<SwitchDecoyPortHostPolicyRequest, SwitchDecoyPortHostPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    SwitchDecoyPortHostPolicyRequest.class,
                    SwitchDecoyPortHostPolicyResponse.class)
                .withName("SwitchDecoyPortHostPolicy")
                .withUri("/v5/{project_id}/honeypot-port/host-policy/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchDecoyPortHostPolicyRequest::getPolicyId,
                SwitchDecoyPortHostPolicyRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchDecoyPortHostPolicyRequest::getEnterpriseProjectId,
                SwitchDecoyPortHostPolicyRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchDecoyPortHostPolicyRequest::getHostId,
                SwitchDecoyPortHostPolicyRequest::setHostId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchHostsProtectStatusRequest, SwitchHostsProtectStatusResponse> switchHostsProtectStatus =
        genForSwitchHostsProtectStatus();

    private static HttpRequestDef<SwitchHostsProtectStatusRequest, SwitchHostsProtectStatusResponse> genForSwitchHostsProtectStatus() {
        // basic
        HttpRequestDef.Builder<SwitchHostsProtectStatusRequest, SwitchHostsProtectStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, SwitchHostsProtectStatusRequest.class, SwitchHostsProtectStatusResponse.class)
                .withName("SwitchHostsProtectStatus")
                .withUri("/v5/{project_id}/host-management/protection")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchHostsProtectStatusRequest::getEnterpriseProjectId,
                SwitchHostsProtectStatusRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchHostsProtectStatusRequest::getRegion,
                SwitchHostsProtectStatusRequest::setRegion));
        builder.<SwitchHostsProtectStatusRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SwitchHostsProtectStatusRequestInfo.class),
            f -> f.withMarshaller(SwitchHostsProtectStatusRequest::getBody, SwitchHostsProtectStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchRaspRequest, SwitchRaspResponse> switchRasp = genForSwitchRasp();

    private static HttpRequestDef<SwitchRaspRequest, SwitchRaspResponse> genForSwitchRasp() {
        // basic
        HttpRequestDef.Builder<SwitchRaspRequest, SwitchRaspResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SwitchRaspRequest.class, SwitchRaspResponse.class)
                .withName("SwitchRasp")
                .withUri("/v5/{project_id}/rasp/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchRaspRequest::getEnterpriseProjectId,
                SwitchRaspRequest::setEnterpriseProjectId));
        builder.<SwitchRaspRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SwitchRaspRequestInfo.class),
            f -> f.withMarshaller(SwitchRaspRequest::getBody, SwitchRaspRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SyncClusterListRequest, SyncClusterListResponse> syncClusterList =
        genForSyncClusterList();

    private static HttpRequestDef<SyncClusterListRequest, SyncClusterListResponse> genForSyncClusterList() {
        // basic
        HttpRequestDef.Builder<SyncClusterListRequest, SyncClusterListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SyncClusterListRequest.class, SyncClusterListResponse.class)
                .withName("SyncClusterList")
                .withUri("/v5/{project_id}/container-network/cluster/sync")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SyncClusterListRequest::getEnterpriseProjectId,
                SyncClusterListRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SyncClusterProtectionEventRequest, SyncClusterProtectionEventResponse> syncClusterProtectionEvent =
        genForSyncClusterProtectionEvent();

    private static HttpRequestDef<SyncClusterProtectionEventRequest, SyncClusterProtectionEventResponse> genForSyncClusterProtectionEvent() {
        // basic
        HttpRequestDef.Builder<SyncClusterProtectionEventRequest, SyncClusterProtectionEventResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    SyncClusterProtectionEventRequest.class,
                    SyncClusterProtectionEventResponse.class)
                .withName("SyncClusterProtectionEvent")
                .withUri("/v5/{project_id}/container/clusters/protection-event-sync")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SyncClusterProtectionEventRequest::getEnterpriseProjectId,
                SyncClusterProtectionEventRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SyncClusterProtectionEventRequest::getClusterId,
                SyncClusterProtectionEventRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SyncContainerNetworkNodeRequest, SyncContainerNetworkNodeResponse> syncContainerNetworkNode =
        genForSyncContainerNetworkNode();

    private static HttpRequestDef<SyncContainerNetworkNodeRequest, SyncContainerNetworkNodeResponse> genForSyncContainerNetworkNode() {
        // basic
        HttpRequestDef.Builder<SyncContainerNetworkNodeRequest, SyncContainerNetworkNodeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, SyncContainerNetworkNodeRequest.class, SyncContainerNetworkNodeResponse.class)
                .withName("SyncContainerNetworkNode")
                .withUri("/v5/{project_id}/container-network/{cluster_id}/node-sync")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SyncContainerNetworkNodeRequest::getClusterId,
                SyncContainerNetworkNodeRequest::setClusterId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SyncContainerNetworkNodeRequest::getEnterpriseProjectId,
                SyncContainerNetworkNodeRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SyncContainerNetworkPolicyListRequest, SyncContainerNetworkPolicyListResponse> syncContainerNetworkPolicyList =
        genForSyncContainerNetworkPolicyList();

    private static HttpRequestDef<SyncContainerNetworkPolicyListRequest, SyncContainerNetworkPolicyListResponse> genForSyncContainerNetworkPolicyList() {
        // basic
        HttpRequestDef.Builder<SyncContainerNetworkPolicyListRequest, SyncContainerNetworkPolicyListResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    SyncContainerNetworkPolicyListRequest.class,
                    SyncContainerNetworkPolicyListResponse.class)
                .withName("SyncContainerNetworkPolicyList")
                .withUri("/v5/{project_id}/container-network/{cluster_id}/policy-sync")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SyncContainerNetworkPolicyListRequest::getClusterId,
                SyncContainerNetworkPolicyListRequest::setClusterId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SyncContainerNetworkPolicyListRequest::getEnterpriseProjectId,
                SyncContainerNetworkPolicyListRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SyncSecurityGroupPoliciesRequest, SyncSecurityGroupPoliciesResponse> syncSecurityGroupPolicies =
        genForSyncSecurityGroupPolicies();

    private static HttpRequestDef<SyncSecurityGroupPoliciesRequest, SyncSecurityGroupPoliciesResponse> genForSyncSecurityGroupPolicies() {
        // basic
        HttpRequestDef.Builder<SyncSecurityGroupPoliciesRequest, SyncSecurityGroupPoliciesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    SyncSecurityGroupPoliciesRequest.class,
                    SyncSecurityGroupPoliciesResponse.class)
                .withName("SyncSecurityGroupPolicies")
                .withUri("/v5/{project_id}/container-network/{cluster_id}/security-group-policy-sync")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SyncSecurityGroupPoliciesRequest::getClusterId,
                SyncSecurityGroupPoliciesRequest::setClusterId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SyncSecurityGroupPoliciesRequest::getEnterpriseProjectId,
                SyncSecurityGroupPoliciesRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBackupPolicyInfoRequest, UpdateBackupPolicyInfoResponse> updateBackupPolicyInfo =
        genForUpdateBackupPolicyInfo();

    private static HttpRequestDef<UpdateBackupPolicyInfoRequest, UpdateBackupPolicyInfoResponse> genForUpdateBackupPolicyInfo() {
        // basic
        HttpRequestDef.Builder<UpdateBackupPolicyInfoRequest, UpdateBackupPolicyInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateBackupPolicyInfoRequest.class, UpdateBackupPolicyInfoResponse.class)
            .withName("UpdateBackupPolicyInfo")
            .withUri("/v5/{project_id}/backup/policy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBackupPolicyInfoRequest::getEnterpriseProjectId,
                UpdateBackupPolicyInfoRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBackupPolicyInfoRequest::getRegion, UpdateBackupPolicyInfoRequest::setRegion));
        builder.<UpdateBackupPolicyRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateBackupPolicyRequestInfo.class),
            f -> f.withMarshaller(UpdateBackupPolicyInfoRequest::getBody, UpdateBackupPolicyInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateContainerNetworkPolicyRequest, UpdateContainerNetworkPolicyResponse> updateContainerNetworkPolicy =
        genForUpdateContainerNetworkPolicy();

    private static HttpRequestDef<UpdateContainerNetworkPolicyRequest, UpdateContainerNetworkPolicyResponse> genForUpdateContainerNetworkPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateContainerNetworkPolicyRequest, UpdateContainerNetworkPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateContainerNetworkPolicyRequest.class,
                    UpdateContainerNetworkPolicyResponse.class)
                .withName("UpdateContainerNetworkPolicy")
                .withUri("/v5/{project_id}/container-network/{cluster_id}/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateContainerNetworkPolicyRequest::getClusterId,
                UpdateContainerNetworkPolicyRequest::setClusterId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateContainerNetworkPolicyRequest::getEnterpriseProjectId,
                UpdateContainerNetworkPolicyRequest::setEnterpriseProjectId));
        builder.<UpdateNetworkPolicy>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNetworkPolicy.class),
            f -> f.withMarshaller(UpdateContainerNetworkPolicyRequest::getBody,
                UpdateContainerNetworkPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePolicyRequest, UpdatePolicyResponse> updatePolicy = genForUpdatePolicy();

    private static HttpRequestDef<UpdatePolicyRequest, UpdatePolicyResponse> genForUpdatePolicy() {
        // basic
        HttpRequestDef.Builder<UpdatePolicyRequest, UpdatePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePolicyRequest.class, UpdatePolicyResponse.class)
                .withName("UpdatePolicy")
                .withUri("/v5/{project_id}/rasp/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyRequest::getEnterpriseProjectId,
                UpdatePolicyRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("policy_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyRequest::getPolicyId, UpdatePolicyRequest::setPolicyId));
        builder.<String>withRequestField("policy_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyRequest::getPolicyName, UpdatePolicyRequest::setPolicyName));
        builder.<UpdatePolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePolicyRequestBody.class),
            f -> f.withMarshaller(UpdatePolicyRequest::getBody, UpdatePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProtectionPolicyRequest, UpdateProtectionPolicyResponse> updateProtectionPolicy =
        genForUpdateProtectionPolicy();

    private static HttpRequestDef<UpdateProtectionPolicyRequest, UpdateProtectionPolicyResponse> genForUpdateProtectionPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateProtectionPolicyRequest, UpdateProtectionPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateProtectionPolicyRequest.class, UpdateProtectionPolicyResponse.class)
            .withName("UpdateProtectionPolicy")
            .withUri("/v5/{project_id}/ransomware/protection/policy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProtectionPolicyRequest::getEnterpriseProjectId,
                UpdateProtectionPolicyRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProtectionPolicyRequest::getRegion, UpdateProtectionPolicyRequest::setRegion));
        builder.<UpdateProtectionPolicyInfoRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateProtectionPolicyInfoRequestInfo.class),
            f -> f.withMarshaller(UpdateProtectionPolicyRequest::getBody, UpdateProtectionPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSecurityGroupPolicyRequest, UpdateSecurityGroupPolicyResponse> updateSecurityGroupPolicy =
        genForUpdateSecurityGroupPolicy();

    private static HttpRequestDef<UpdateSecurityGroupPolicyRequest, UpdateSecurityGroupPolicyResponse> genForUpdateSecurityGroupPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateSecurityGroupPolicyRequest, UpdateSecurityGroupPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateSecurityGroupPolicyRequest.class,
                    UpdateSecurityGroupPolicyResponse.class)
                .withName("UpdateSecurityGroupPolicy")
                .withUri("/v5/{project_id}/container-network/{cluster_id}/{namespace}/security-group-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSecurityGroupPolicyRequest::getClusterId,
                UpdateSecurityGroupPolicyRequest::setClusterId));
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSecurityGroupPolicyRequest::getNamespace,
                UpdateSecurityGroupPolicyRequest::setNamespace));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSecurityGroupPolicyRequest::getEnterpriseProjectId,
                UpdateSecurityGroupPolicyRequest::setEnterpriseProjectId));
        builder.<UpdateSecurityGroupPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSecurityGroupPolicyRequestBody.class),
            f -> f.withMarshaller(UpdateSecurityGroupPolicyRequest::getBody,
                UpdateSecurityGroupPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSystemUserWhiteListRequest, UpdateSystemUserWhiteListResponse> updateSystemUserWhiteList =
        genForUpdateSystemUserWhiteList();

    private static HttpRequestDef<UpdateSystemUserWhiteListRequest, UpdateSystemUserWhiteListResponse> genForUpdateSystemUserWhiteList() {
        // basic
        HttpRequestDef.Builder<UpdateSystemUserWhiteListRequest, UpdateSystemUserWhiteListResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateSystemUserWhiteListRequest.class,
                    UpdateSystemUserWhiteListResponse.class)
                .withName("UpdateSystemUserWhiteList")
                .withUri("/v5/{project_id}/event/white-list/userlist")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSystemUserWhiteListRequest::getEnterpriseProjectId,
                UpdateSystemUserWhiteListRequest::setEnterpriseProjectId));
        builder.<UpdateSystemUserWhiteListRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSystemUserWhiteListRequestInfo.class),
            f -> f.withMarshaller(UpdateSystemUserWhiteListRequest::getBody,
                UpdateSystemUserWhiteListRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeAntivirusPayPerScanStatusRequest, ChangeAntivirusPayPerScanStatusResponse> changeAntivirusPayPerScanStatus =
        genForChangeAntivirusPayPerScanStatus();

    private static HttpRequestDef<ChangeAntivirusPayPerScanStatusRequest, ChangeAntivirusPayPerScanStatusResponse> genForChangeAntivirusPayPerScanStatus() {
        // basic
        HttpRequestDef.Builder<ChangeAntivirusPayPerScanStatusRequest, ChangeAntivirusPayPerScanStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    ChangeAntivirusPayPerScanStatusRequest.class,
                    ChangeAntivirusPayPerScanStatusResponse.class)
                .withName("ChangeAntivirusPayPerScanStatus")
                .withUri("/v5/{project_id}/antivirus/pay-per-scan")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeAntivirusPayPerScanStatusRequest::getEnterpriseProjectId,
                ChangeAntivirusPayPerScanStatusRequest::setEnterpriseProjectId));
        builder.<ChangeAntivirusPayPerScanStatusRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeAntivirusPayPerScanStatusRequestInfo.class),
            f -> f.withMarshaller(ChangeAntivirusPayPerScanStatusRequest::getBody,
                ChangeAntivirusPayPerScanStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeAntivirusPolicyRequest, ChangeAntivirusPolicyResponse> changeAntivirusPolicy =
        genForChangeAntivirusPolicy();

    private static HttpRequestDef<ChangeAntivirusPolicyRequest, ChangeAntivirusPolicyResponse> genForChangeAntivirusPolicy() {
        // basic
        HttpRequestDef.Builder<ChangeAntivirusPolicyRequest, ChangeAntivirusPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, ChangeAntivirusPolicyRequest.class, ChangeAntivirusPolicyResponse.class)
            .withName("ChangeAntivirusPolicy")
            .withUri("/v5/{project_id}/antivirus/policy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeAntivirusPolicyRequest::getEnterpriseProjectId,
                ChangeAntivirusPolicyRequest::setEnterpriseProjectId));
        builder.<ChangeAntivirusPolicyRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeAntivirusPolicyRequestInfo.class),
            f -> f.withMarshaller(ChangeAntivirusPolicyRequest::getBody, ChangeAntivirusPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAntiVirusPaidTaskRequest, CreateAntiVirusPaidTaskResponse> createAntiVirusPaidTask =
        genForCreateAntiVirusPaidTask();

    private static HttpRequestDef<CreateAntiVirusPaidTaskRequest, CreateAntiVirusPaidTaskResponse> genForCreateAntiVirusPaidTask() {
        // basic
        HttpRequestDef.Builder<CreateAntiVirusPaidTaskRequest, CreateAntiVirusPaidTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateAntiVirusPaidTaskRequest.class, CreateAntiVirusPaidTaskResponse.class)
            .withName("CreateAntiVirusPaidTask")
            .withUri("/v5/{project_id}/antivirus/pay-per-scan/tasks")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAntiVirusPaidTaskRequest::getEnterpriseProjectId,
                CreateAntiVirusPaidTaskRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAntiVirusPaidTaskRequest::getRegion,
                CreateAntiVirusPaidTaskRequest::setRegion));
        builder.<CreateAntiVirusPaidTaskRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAntiVirusPaidTaskRequestInfo.class),
            f -> f.withMarshaller(CreateAntiVirusPaidTaskRequest::getBody, CreateAntiVirusPaidTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAntiVirusPolicyRequest, CreateAntiVirusPolicyResponse> createAntiVirusPolicy =
        genForCreateAntiVirusPolicy();

    private static HttpRequestDef<CreateAntiVirusPolicyRequest, CreateAntiVirusPolicyResponse> genForCreateAntiVirusPolicy() {
        // basic
        HttpRequestDef.Builder<CreateAntiVirusPolicyRequest, CreateAntiVirusPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateAntiVirusPolicyRequest.class, CreateAntiVirusPolicyResponse.class)
            .withName("CreateAntiVirusPolicy")
            .withUri("/v5/{project_id}/antivirus/policy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAntiVirusPolicyRequest::getEnterpriseProjectId,
                CreateAntiVirusPolicyRequest::setEnterpriseProjectId));
        builder.<CreateAntiVirusPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAntiVirusPolicyRequestBody.class),
            f -> f.withMarshaller(CreateAntiVirusPolicyRequest::getBody, CreateAntiVirusPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAntiVirusTaskRequest, CreateAntiVirusTaskResponse> createAntiVirusTask =
        genForCreateAntiVirusTask();

    private static HttpRequestDef<CreateAntiVirusTaskRequest, CreateAntiVirusTaskResponse> genForCreateAntiVirusTask() {
        // basic
        HttpRequestDef.Builder<CreateAntiVirusTaskRequest, CreateAntiVirusTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAntiVirusTaskRequest.class, CreateAntiVirusTaskResponse.class)
                .withName("CreateAntiVirusTask")
                .withUri("/v5/{project_id}/antivirus/task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAntiVirusTaskRequest::getEnterpriseProjectId,
                CreateAntiVirusTaskRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAntiVirusTaskRequest::getRegion, CreateAntiVirusTaskRequest::setRegion));
        builder.<CreateAntiVirusTaskRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAntiVirusTaskRequestInfo.class),
            f -> f.withMarshaller(CreateAntiVirusTaskRequest::getBody, CreateAntiVirusTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAntivirusPolicyRequest, DeleteAntivirusPolicyResponse> deleteAntivirusPolicy =
        genForDeleteAntivirusPolicy();

    private static HttpRequestDef<DeleteAntivirusPolicyRequest, DeleteAntivirusPolicyResponse> genForDeleteAntivirusPolicy() {
        // basic
        HttpRequestDef.Builder<DeleteAntivirusPolicyRequest, DeleteAntivirusPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DeleteAntivirusPolicyRequest.class, DeleteAntivirusPolicyResponse.class)
            .withName("DeleteAntivirusPolicy")
            .withUri("/v5/{project_id}/antivirus/policy/batch-delete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAntivirusPolicyRequest::getEnterpriseProjectId,
                DeleteAntivirusPolicyRequest::setEnterpriseProjectId));
        builder.<DeleteAntivirusPolicyRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteAntivirusPolicyRequestInfo.class),
            f -> f.withMarshaller(DeleteAntivirusPolicyRequest::getBody, DeleteAntivirusPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportAntiVirusResultRequest, ExportAntiVirusResultResponse> exportAntiVirusResult =
        genForExportAntiVirusResult();

    private static HttpRequestDef<ExportAntiVirusResultRequest, ExportAntiVirusResultResponse> genForExportAntiVirusResult() {
        // basic
        HttpRequestDef.Builder<ExportAntiVirusResultRequest, ExportAntiVirusResultResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ExportAntiVirusResultRequest.class, ExportAntiVirusResultResponse.class)
            .withName("ExportAntiVirusResult")
            .withUri("/v5/{project_id}/antivirus/result/export")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportAntiVirusResultRequest::getEnterpriseProjectId,
                ExportAntiVirusResultRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportAntiVirusResultRequest::getOffset, ExportAntiVirusResultRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportAntiVirusResultRequest::getLimit, ExportAntiVirusResultRequest::setLimit));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportAntiVirusResultRequest::getHostName,
                ExportAntiVirusResultRequest::setHostName));
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportAntiVirusResultRequest::getPrivateIp,
                ExportAntiVirusResultRequest::setPrivateIp));
        builder.<String>withRequestField("public_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportAntiVirusResultRequest::getPublicIp,
                ExportAntiVirusResultRequest::setPublicIp));
        builder.<String>withRequestField("handle_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportAntiVirusResultRequest::getHandleStatus,
                ExportAntiVirusResultRequest::setHandleStatus));
        builder.<List<String>>withRequestField("severity_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ExportAntiVirusResultRequest::getSeverityList,
                ExportAntiVirusResultRequest::setSeverityList));
        builder.<String>withRequestField("asset_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportAntiVirusResultRequest::getAssetValue,
                ExportAntiVirusResultRequest::setAssetValue));
        builder.<String>withRequestField("malware_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportAntiVirusResultRequest::getMalwareName,
                ExportAntiVirusResultRequest::setMalwareName));
        builder.<String>withRequestField("file_path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportAntiVirusResultRequest::getFilePath,
                ExportAntiVirusResultRequest::setFilePath));
        builder.<Integer>withRequestField("export_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportAntiVirusResultRequest::getExportSize,
                ExportAntiVirusResultRequest::setExportSize));
        builder.<String>withRequestField("file_hash",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportAntiVirusResultRequest::getFileHash,
                ExportAntiVirusResultRequest::setFileHash));
        builder.<String>withRequestField("task_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportAntiVirusResultRequest::getTaskName,
                ExportAntiVirusResultRequest::setTaskName));
        builder.<Boolean>withRequestField("manual_isolate",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ExportAntiVirusResultRequest::getManualIsolate,
                ExportAntiVirusResultRequest::setManualIsolate));
        builder.<ExportAntiVirusResultRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportAntiVirusResultRequestBody.class),
            f -> f.withMarshaller(ExportAntiVirusResultRequest::getBody, ExportAntiVirusResultRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<HandleAntiVirusResultRequest, HandleAntiVirusResultResponse> handleAntiVirusResult =
        genForHandleAntiVirusResult();

    private static HttpRequestDef<HandleAntiVirusResultRequest, HandleAntiVirusResultResponse> genForHandleAntiVirusResult() {
        // basic
        HttpRequestDef.Builder<HandleAntiVirusResultRequest, HandleAntiVirusResultResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, HandleAntiVirusResultRequest.class, HandleAntiVirusResultResponse.class)
            .withName("HandleAntiVirusResult")
            .withUri("/v5/{project_id}/antivirus/result/operate")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(HandleAntiVirusResultRequest::getEnterpriseProjectId,
                HandleAntiVirusResultRequest::setEnterpriseProjectId));
        builder.<OperateAntiVirusResultRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateAntiVirusResultRequestInfo.class),
            f -> f.withMarshaller(HandleAntiVirusResultRequest::getBody, HandleAntiVirusResultRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAntiVirusHostRequest, ListAntiVirusHostResponse> listAntiVirusHost =
        genForListAntiVirusHost();

    private static HttpRequestDef<ListAntiVirusHostRequest, ListAntiVirusHostResponse> genForListAntiVirusHost() {
        // basic
        HttpRequestDef.Builder<ListAntiVirusHostRequest, ListAntiVirusHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAntiVirusHostRequest.class, ListAntiVirusHostResponse.class)
                .withName("ListAntiVirusHost")
                .withUri("/v5/{project_id}/antivirus/host-management/hosts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiVirusHostRequest::getEnterpriseProjectId,
                ListAntiVirusHostRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAntiVirusHostRequest::getOffset, ListAntiVirusHostRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAntiVirusHostRequest::getLimit, ListAntiVirusHostRequest::setLimit));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiVirusHostRequest::getHostId, ListAntiVirusHostRequest::setHostId));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiVirusHostRequest::getHostName, ListAntiVirusHostRequest::setHostName));
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiVirusHostRequest::getPrivateIp, ListAntiVirusHostRequest::setPrivateIp));
        builder.<String>withRequestField("public_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiVirusHostRequest::getPublicIp, ListAntiVirusHostRequest::setPublicIp));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiVirusHostRequest::getGroupId, ListAntiVirusHostRequest::setGroupId));
        builder.<String>withRequestField("scan_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiVirusHostRequest::getScanType, ListAntiVirusHostRequest::setScanType));
        builder.<String>withRequestField("start_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiVirusHostRequest::getStartType, ListAntiVirusHostRequest::setStartType));
        builder.<String>withRequestField("policy_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiVirusHostRequest::getPolicyId, ListAntiVirusHostRequest::setPolicyId));
        builder.<Long>withRequestField("next_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAntiVirusHostRequest::getNextStartTime,
                ListAntiVirusHostRequest::setNextStartTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAntiVirusPaidHostsRequest, ListAntiVirusPaidHostsResponse> listAntiVirusPaidHosts =
        genForListAntiVirusPaidHosts();

    private static HttpRequestDef<ListAntiVirusPaidHostsRequest, ListAntiVirusPaidHostsResponse> genForListAntiVirusPaidHosts() {
        // basic
        HttpRequestDef.Builder<ListAntiVirusPaidHostsRequest, ListAntiVirusPaidHostsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAntiVirusPaidHostsRequest.class, ListAntiVirusPaidHostsResponse.class)
            .withName("ListAntiVirusPaidHosts")
            .withUri("/v5/{project_id}/antivirus/pay-per-scan/hosts")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiVirusPaidHostsRequest::getEnterpriseProjectId,
                ListAntiVirusPaidHostsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAntiVirusPaidHostsRequest::getOffset, ListAntiVirusPaidHostsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAntiVirusPaidHostsRequest::getLimit, ListAntiVirusPaidHostsRequest::setLimit));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiVirusPaidHostsRequest::getHostId, ListAntiVirusPaidHostsRequest::setHostId));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiVirusPaidHostsRequest::getHostName,
                ListAntiVirusPaidHostsRequest::setHostName));
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiVirusPaidHostsRequest::getPrivateIp,
                ListAntiVirusPaidHostsRequest::setPrivateIp));
        builder.<String>withRequestField("public_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiVirusPaidHostsRequest::getPublicIp,
                ListAntiVirusPaidHostsRequest::setPublicIp));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiVirusPaidHostsRequest::getGroupId,
                ListAntiVirusPaidHostsRequest::setGroupId));
        builder.<String>withRequestField("scan_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiVirusPaidHostsRequest::getScanType,
                ListAntiVirusPaidHostsRequest::setScanType));
        builder.<String>withRequestField("start_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiVirusPaidHostsRequest::getStartType,
                ListAntiVirusPaidHostsRequest::setStartType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAntiVirusPolicyRequest, ListAntiVirusPolicyResponse> listAntiVirusPolicy =
        genForListAntiVirusPolicy();

    private static HttpRequestDef<ListAntiVirusPolicyRequest, ListAntiVirusPolicyResponse> genForListAntiVirusPolicy() {
        // basic
        HttpRequestDef.Builder<ListAntiVirusPolicyRequest, ListAntiVirusPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAntiVirusPolicyRequest.class, ListAntiVirusPolicyResponse.class)
                .withName("ListAntiVirusPolicy")
                .withUri("/v5/{project_id}/antivirus/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiVirusPolicyRequest::getEnterpriseProjectId,
                ListAntiVirusPolicyRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAntiVirusPolicyRequest::getOffset, ListAntiVirusPolicyRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAntiVirusPolicyRequest::getLimit, ListAntiVirusPolicyRequest::setLimit));
        builder.<String>withRequestField("policy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiVirusPolicyRequest::getPolicyName,
                ListAntiVirusPolicyRequest::setPolicyName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAntiVirusResultRequest, ListAntiVirusResultResponse> listAntiVirusResult =
        genForListAntiVirusResult();

    private static HttpRequestDef<ListAntiVirusResultRequest, ListAntiVirusResultResponse> genForListAntiVirusResult() {
        // basic
        HttpRequestDef.Builder<ListAntiVirusResultRequest, ListAntiVirusResultResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAntiVirusResultRequest.class, ListAntiVirusResultResponse.class)
                .withName("ListAntiVirusResult")
                .withUri("/v5/{project_id}/antivirus/result")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiVirusResultRequest::getEnterpriseProjectId,
                ListAntiVirusResultRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAntiVirusResultRequest::getOffset, ListAntiVirusResultRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAntiVirusResultRequest::getLimit, ListAntiVirusResultRequest::setLimit));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiVirusResultRequest::getHostName, ListAntiVirusResultRequest::setHostName));
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiVirusResultRequest::getPrivateIp, ListAntiVirusResultRequest::setPrivateIp));
        builder.<String>withRequestField("public_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiVirusResultRequest::getPublicIp, ListAntiVirusResultRequest::setPublicIp));
        builder.<String>withRequestField("handle_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiVirusResultRequest::getHandleStatus,
                ListAntiVirusResultRequest::setHandleStatus));
        builder.<List<String>>withRequestField("severity_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAntiVirusResultRequest::getSeverityList,
                ListAntiVirusResultRequest::setSeverityList));
        builder.<String>withRequestField("asset_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiVirusResultRequest::getAssetValue,
                ListAntiVirusResultRequest::setAssetValue));
        builder.<String>withRequestField("malware_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiVirusResultRequest::getMalwareName,
                ListAntiVirusResultRequest::setMalwareName));
        builder.<String>withRequestField("file_path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiVirusResultRequest::getFilePath, ListAntiVirusResultRequest::setFilePath));
        builder.<String>withRequestField("file_hash",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiVirusResultRequest::getFileHash, ListAntiVirusResultRequest::setFileHash));
        builder.<String>withRequestField("task_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiVirusResultRequest::getTaskName, ListAntiVirusResultRequest::setTaskName));
        builder.<Boolean>withRequestField("manual_isolate",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAntiVirusResultRequest::getManualIsolate,
                ListAntiVirusResultRequest::setManualIsolate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAntiVirusTaskRequest, ListAntiVirusTaskResponse> listAntiVirusTask =
        genForListAntiVirusTask();

    private static HttpRequestDef<ListAntiVirusTaskRequest, ListAntiVirusTaskResponse> genForListAntiVirusTask() {
        // basic
        HttpRequestDef.Builder<ListAntiVirusTaskRequest, ListAntiVirusTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAntiVirusTaskRequest.class, ListAntiVirusTaskResponse.class)
                .withName("ListAntiVirusTask")
                .withUri("/v5/{project_id}/antivirus/task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiVirusTaskRequest::getEnterpriseProjectId,
                ListAntiVirusTaskRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("task_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiVirusTaskRequest::getTaskName, ListAntiVirusTaskRequest::setTaskName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAntiVirusTaskRequest::getOffset, ListAntiVirusTaskRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAntiVirusTaskRequest::getLimit, ListAntiVirusTaskRequest::setLimit));
        builder.<Integer>withRequestField("last_days",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAntiVirusTaskRequest::getLastDays, ListAntiVirusTaskRequest::setLastDays));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiVirusTaskRequest::getBeginTime, ListAntiVirusTaskRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiVirusTaskRequest::getEndTime, ListAntiVirusTaskRequest::setEndTime));
        builder.<String>withRequestField("task_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiVirusTaskRequest::getTaskStatus, ListAntiVirusTaskRequest::setTaskStatus));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiVirusTaskRequest::getHostName, ListAntiVirusTaskRequest::setHostName));
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiVirusTaskRequest::getPrivateIp, ListAntiVirusTaskRequest::setPrivateIp));
        builder.<String>withRequestField("public_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntiVirusTaskRequest::getPublicIp, ListAntiVirusTaskRequest::setPublicIp));
        builder.<Boolean>withRequestField("whether_paid_task",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAntiVirusTaskRequest::getWhetherPaidTask,
                ListAntiVirusTaskRequest::setWhetherPaidTask));
        builder.<List<String>>withRequestField("host_task_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAntiVirusTaskRequest::getHostTaskStatus,
                ListAntiVirusTaskRequest::setHostTaskStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAntivirusFreeQuotaRequest, ShowAntivirusFreeQuotaResponse> showAntivirusFreeQuota =
        genForShowAntivirusFreeQuota();

    private static HttpRequestDef<ShowAntivirusFreeQuotaRequest, ShowAntivirusFreeQuotaResponse> genForShowAntivirusFreeQuota() {
        // basic
        HttpRequestDef.Builder<ShowAntivirusFreeQuotaRequest, ShowAntivirusFreeQuotaResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAntivirusFreeQuotaRequest.class, ShowAntivirusFreeQuotaResponse.class)
            .withName("ShowAntivirusFreeQuota")
            .withUri("/v5/{project_id}/antivirus/pay-per-scan/free-quotas")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAntivirusFreeQuotaRequest::getEnterpriseProjectId,
                ShowAntivirusFreeQuotaRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAntivirusPayPerScanStatusRequest, ShowAntivirusPayPerScanStatusResponse> showAntivirusPayPerScanStatus =
        genForShowAntivirusPayPerScanStatus();

    private static HttpRequestDef<ShowAntivirusPayPerScanStatusRequest, ShowAntivirusPayPerScanStatusResponse> genForShowAntivirusPayPerScanStatus() {
        // basic
        HttpRequestDef.Builder<ShowAntivirusPayPerScanStatusRequest, ShowAntivirusPayPerScanStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowAntivirusPayPerScanStatusRequest.class,
                    ShowAntivirusPayPerScanStatusResponse.class)
                .withName("ShowAntivirusPayPerScanStatus")
                .withUri("/v5/{project_id}/antivirus/pay-per-scan")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAntivirusPayPerScanStatusRequest::getEnterpriseProjectId,
                ShowAntivirusPayPerScanStatusRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAntivirusStatisticRequest, ShowAntivirusStatisticResponse> showAntivirusStatistic =
        genForShowAntivirusStatistic();

    private static HttpRequestDef<ShowAntivirusStatisticRequest, ShowAntivirusStatisticResponse> genForShowAntivirusStatistic() {
        // basic
        HttpRequestDef.Builder<ShowAntivirusStatisticRequest, ShowAntivirusStatisticResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAntivirusStatisticRequest.class, ShowAntivirusStatisticResponse.class)
            .withName("ShowAntivirusStatistic")
            .withUri("/v5/{project_id}/antivirus/statistic")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAntivirusStatisticRequest::getEnterpriseProjectId,
                ShowAntivirusStatisticRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchAntivirusTaskRequest, SwitchAntivirusTaskResponse> switchAntivirusTask =
        genForSwitchAntivirusTask();

    private static HttpRequestDef<SwitchAntivirusTaskRequest, SwitchAntivirusTaskResponse> genForSwitchAntivirusTask() {
        // basic
        HttpRequestDef.Builder<SwitchAntivirusTaskRequest, SwitchAntivirusTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SwitchAntivirusTaskRequest.class, SwitchAntivirusTaskResponse.class)
                .withName("SwitchAntivirusTask")
                .withUri("/v5/{project_id}/antivirus/task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchAntivirusTaskRequest::getEnterpriseProjectId,
                SwitchAntivirusTaskRequest::setEnterpriseProjectId));
        builder.<SwitchAntivirusTaskRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SwitchAntivirusTaskRequestInfo.class),
            f -> f.withMarshaller(SwitchAntivirusTaskRequest::getBody, SwitchAntivirusTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddAppWhitelistPolicyHostRequest, AddAppWhitelistPolicyHostResponse> addAppWhitelistPolicyHost =
        genForAddAppWhitelistPolicyHost();

    private static HttpRequestDef<AddAppWhitelistPolicyHostRequest, AddAppWhitelistPolicyHostResponse> genForAddAppWhitelistPolicyHost() {
        // basic
        HttpRequestDef.Builder<AddAppWhitelistPolicyHostRequest, AddAppWhitelistPolicyHostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AddAppWhitelistPolicyHostRequest.class,
                    AddAppWhitelistPolicyHostResponse.class)
                .withName("AddAppWhitelistPolicyHost")
                .withUri("/v5/{project_id}/app/{policy_id}/host")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddAppWhitelistPolicyHostRequest::getPolicyId,
                AddAppWhitelistPolicyHostRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddAppWhitelistPolicyHostRequest::getEnterpriseProjectId,
                AddAppWhitelistPolicyHostRequest::setEnterpriseProjectId));
        builder.<AddAppWhitelistPolicyHostRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddAppWhitelistPolicyHostRequestInfo.class),
            f -> f.withMarshaller(AddAppWhitelistPolicyHostRequest::getBody,
                AddAppWhitelistPolicyHostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddAppWhitelistPolicyProcessRequest, AddAppWhitelistPolicyProcessResponse> addAppWhitelistPolicyProcess =
        genForAddAppWhitelistPolicyProcess();

    private static HttpRequestDef<AddAppWhitelistPolicyProcessRequest, AddAppWhitelistPolicyProcessResponse> genForAddAppWhitelistPolicyProcess() {
        // basic
        HttpRequestDef.Builder<AddAppWhitelistPolicyProcessRequest, AddAppWhitelistPolicyProcessResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AddAppWhitelistPolicyProcessRequest.class,
                    AddAppWhitelistPolicyProcessResponse.class)
                .withName("AddAppWhitelistPolicyProcess")
                .withUri("/v5/{project_id}/app/{policy_id}/process")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddAppWhitelistPolicyProcessRequest::getPolicyId,
                AddAppWhitelistPolicyProcessRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddAppWhitelistPolicyProcessRequest::getEnterpriseProjectId,
                AddAppWhitelistPolicyProcessRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddAppWhitelistPolicyProcessRequest::getHostId,
                AddAppWhitelistPolicyProcessRequest::setHostId));
        builder.<AddAppWhitelistPolicyProcessRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddAppWhitelistPolicyProcessRequestInfo.class),
            f -> f.withMarshaller(AddAppWhitelistPolicyProcessRequest::getBody,
                AddAppWhitelistPolicyProcessRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeAppWhitelistPolicyRequest, ChangeAppWhitelistPolicyResponse> changeAppWhitelistPolicy =
        genForChangeAppWhitelistPolicy();

    private static HttpRequestDef<ChangeAppWhitelistPolicyRequest, ChangeAppWhitelistPolicyResponse> genForChangeAppWhitelistPolicy() {
        // basic
        HttpRequestDef.Builder<ChangeAppWhitelistPolicyRequest, ChangeAppWhitelistPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, ChangeAppWhitelistPolicyRequest.class, ChangeAppWhitelistPolicyResponse.class)
                .withName("ChangeAppWhitelistPolicy")
                .withUri("/v5/{project_id}/app/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeAppWhitelistPolicyRequest::getEnterpriseProjectId,
                ChangeAppWhitelistPolicyRequest::setEnterpriseProjectId));
        builder.<ChangeAppWhitelistPolicyRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeAppWhitelistPolicyRequestInfo.class),
            f -> f.withMarshaller(ChangeAppWhitelistPolicyRequest::getBody, ChangeAppWhitelistPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeAppWhitelistPolicyProcessStatusRequest, ChangeAppWhitelistPolicyProcessStatusResponse> changeAppWhitelistPolicyProcessStatus =
        genForChangeAppWhitelistPolicyProcessStatus();

    private static HttpRequestDef<ChangeAppWhitelistPolicyProcessStatusRequest, ChangeAppWhitelistPolicyProcessStatusResponse> genForChangeAppWhitelistPolicyProcessStatus() {
        // basic
        HttpRequestDef.Builder<ChangeAppWhitelistPolicyProcessStatusRequest, ChangeAppWhitelistPolicyProcessStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    ChangeAppWhitelistPolicyProcessStatusRequest.class,
                    ChangeAppWhitelistPolicyProcessStatusResponse.class)
                .withName("ChangeAppWhitelistPolicyProcessStatus")
                .withUri("/v5/{project_id}/app/{policy_id}/process")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeAppWhitelistPolicyProcessStatusRequest::getPolicyId,
                ChangeAppWhitelistPolicyProcessStatusRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeAppWhitelistPolicyProcessStatusRequest::getEnterpriseProjectId,
                ChangeAppWhitelistPolicyProcessStatusRequest::setEnterpriseProjectId));
        builder.<ChangeAppWhitelistPolicyProcessStatusRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeAppWhitelistPolicyProcessStatusRequestInfo.class),
            f -> f.withMarshaller(ChangeAppWhitelistPolicyProcessStatusRequest::getBody,
                ChangeAppWhitelistPolicyProcessStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAppWhitelistPolicyRequest, CreateAppWhitelistPolicyResponse> createAppWhitelistPolicy =
        genForCreateAppWhitelistPolicy();

    private static HttpRequestDef<CreateAppWhitelistPolicyRequest, CreateAppWhitelistPolicyResponse> genForCreateAppWhitelistPolicy() {
        // basic
        HttpRequestDef.Builder<CreateAppWhitelistPolicyRequest, CreateAppWhitelistPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateAppWhitelistPolicyRequest.class, CreateAppWhitelistPolicyResponse.class)
                .withName("CreateAppWhitelistPolicy")
                .withUri("/v5/{project_id}/app/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAppWhitelistPolicyRequest::getEnterpriseProjectId,
                CreateAppWhitelistPolicyRequest::setEnterpriseProjectId));
        builder.<CreateAppWhitelistPolicyRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAppWhitelistPolicyRequestInfo.class),
            f -> f.withMarshaller(CreateAppWhitelistPolicyRequest::getBody, CreateAppWhitelistPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppWhitelistPolicyRequest, DeleteAppWhitelistPolicyResponse> deleteAppWhitelistPolicy =
        genForDeleteAppWhitelistPolicy();

    private static HttpRequestDef<DeleteAppWhitelistPolicyRequest, DeleteAppWhitelistPolicyResponse> genForDeleteAppWhitelistPolicy() {
        // basic
        HttpRequestDef.Builder<DeleteAppWhitelistPolicyRequest, DeleteAppWhitelistPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteAppWhitelistPolicyRequest.class,
                    DeleteAppWhitelistPolicyResponse.class)
                .withName("DeleteAppWhitelistPolicy")
                .withUri("/v5/{project_id}/app/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppWhitelistPolicyRequest::getEnterpriseProjectId,
                DeleteAppWhitelistPolicyRequest::setEnterpriseProjectId));
        builder.<DeleteAppWhitelistPolicyRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteAppWhitelistPolicyRequestInfo.class),
            f -> f.withMarshaller(DeleteAppWhitelistPolicyRequest::getBody, DeleteAppWhitelistPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppWhitelistPolicyHostRequest, DeleteAppWhitelistPolicyHostResponse> deleteAppWhitelistPolicyHost =
        genForDeleteAppWhitelistPolicyHost();

    private static HttpRequestDef<DeleteAppWhitelistPolicyHostRequest, DeleteAppWhitelistPolicyHostResponse> genForDeleteAppWhitelistPolicyHost() {
        // basic
        HttpRequestDef.Builder<DeleteAppWhitelistPolicyHostRequest, DeleteAppWhitelistPolicyHostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteAppWhitelistPolicyHostRequest.class,
                    DeleteAppWhitelistPolicyHostResponse.class)
                .withName("DeleteAppWhitelistPolicyHost")
                .withUri("/v5/{project_id}/app/{policy_id}/host")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppWhitelistPolicyHostRequest::getPolicyId,
                DeleteAppWhitelistPolicyHostRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppWhitelistPolicyHostRequest::getEnterpriseProjectId,
                DeleteAppWhitelistPolicyHostRequest::setEnterpriseProjectId));
        builder.<DeleteAppWhitelistPolicyHostRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteAppWhitelistPolicyHostRequestInfo.class),
            f -> f.withMarshaller(DeleteAppWhitelistPolicyHostRequest::getBody,
                DeleteAppWhitelistPolicyHostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppWhitelistEventRequest, ListAppWhitelistEventResponse> listAppWhitelistEvent =
        genForListAppWhitelistEvent();

    private static HttpRequestDef<ListAppWhitelistEventRequest, ListAppWhitelistEventResponse> genForListAppWhitelistEvent() {
        // basic
        HttpRequestDef.Builder<ListAppWhitelistEventRequest, ListAppWhitelistEventResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAppWhitelistEventRequest.class, ListAppWhitelistEventResponse.class)
            .withName("ListAppWhitelistEvent")
            .withUri("/v5/{project_id}/app/event")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistEventRequest::getEnterpriseProjectId,
                ListAppWhitelistEventRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("last_days",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppWhitelistEventRequest::getLastDays,
                ListAppWhitelistEventRequest::setLastDays));
        builder.<Long>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAppWhitelistEventRequest::getBeginTime,
                ListAppWhitelistEventRequest::setBeginTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAppWhitelistEventRequest::getEndTime, ListAppWhitelistEventRequest::setEndTime));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistEventRequest::getHostName,
                ListAppWhitelistEventRequest::setHostName));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistEventRequest::getHostIp, ListAppWhitelistEventRequest::setHostIp));
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistEventRequest::getPrivateIp,
                ListAppWhitelistEventRequest::setPrivateIp));
        builder.<String>withRequestField("handle_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistEventRequest::getHandleStatus,
                ListAppWhitelistEventRequest::setHandleStatus));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppWhitelistEventRequest::getOffset, ListAppWhitelistEventRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppWhitelistEventRequest::getLimit, ListAppWhitelistEventRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppWhitelistHostStatusRequest, ListAppWhitelistHostStatusResponse> listAppWhitelistHostStatus =
        genForListAppWhitelistHostStatus();

    private static HttpRequestDef<ListAppWhitelistHostStatusRequest, ListAppWhitelistHostStatusResponse> genForListAppWhitelistHostStatus() {
        // basic
        HttpRequestDef.Builder<ListAppWhitelistHostStatusRequest, ListAppWhitelistHostStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAppWhitelistHostStatusRequest.class,
                    ListAppWhitelistHostStatusResponse.class)
                .withName("ListAppWhitelistHostStatus")
                .withUri("/v5/{project_id}/app/host-management/hosts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistHostStatusRequest::getEnterpriseProjectId,
                ListAppWhitelistHostStatusRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppWhitelistHostStatusRequest::getOffset,
                ListAppWhitelistHostStatusRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppWhitelistHostStatusRequest::getLimit,
                ListAppWhitelistHostStatusRequest::setLimit));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistHostStatusRequest::getHostId,
                ListAppWhitelistHostStatusRequest::setHostId));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistHostStatusRequest::getHostName,
                ListAppWhitelistHostStatusRequest::setHostName));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistHostStatusRequest::getVersion,
                ListAppWhitelistHostStatusRequest::setVersion));
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistHostStatusRequest::getPrivateIp,
                ListAppWhitelistHostStatusRequest::setPrivateIp));
        builder.<String>withRequestField("public_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistHostStatusRequest::getPublicIp,
                ListAppWhitelistHostStatusRequest::setPublicIp));
        builder.<String>withRequestField("policy_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistHostStatusRequest::getPolicyId,
                ListAppWhitelistHostStatusRequest::setPolicyId));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistHostStatusRequest::getGroupId,
                ListAppWhitelistHostStatusRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppWhitelistPolicyRequest, ListAppWhitelistPolicyResponse> listAppWhitelistPolicy =
        genForListAppWhitelistPolicy();

    private static HttpRequestDef<ListAppWhitelistPolicyRequest, ListAppWhitelistPolicyResponse> genForListAppWhitelistPolicy() {
        // basic
        HttpRequestDef.Builder<ListAppWhitelistPolicyRequest, ListAppWhitelistPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAppWhitelistPolicyRequest.class, ListAppWhitelistPolicyResponse.class)
            .withName("ListAppWhitelistPolicy")
            .withUri("/v5/{project_id}/app/policy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistPolicyRequest::getEnterpriseProjectId,
                ListAppWhitelistPolicyRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppWhitelistPolicyRequest::getOffset, ListAppWhitelistPolicyRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppWhitelistPolicyRequest::getLimit, ListAppWhitelistPolicyRequest::setLimit));
        builder.<String>withRequestField("policy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistPolicyRequest::getPolicyName,
                ListAppWhitelistPolicyRequest::setPolicyName));
        builder.<String>withRequestField("policy_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistPolicyRequest::getPolicyType,
                ListAppWhitelistPolicyRequest::setPolicyType));
        builder.<String>withRequestField("learning_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistPolicyRequest::getLearningStatus,
                ListAppWhitelistPolicyRequest::setLearningStatus));
        builder.<Boolean>withRequestField("intercept",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAppWhitelistPolicyRequest::getIntercept,
                ListAppWhitelistPolicyRequest::setIntercept));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppWhitelistPolicyHostRequest, ListAppWhitelistPolicyHostResponse> listAppWhitelistPolicyHost =
        genForListAppWhitelistPolicyHost();

    private static HttpRequestDef<ListAppWhitelistPolicyHostRequest, ListAppWhitelistPolicyHostResponse> genForListAppWhitelistPolicyHost() {
        // basic
        HttpRequestDef.Builder<ListAppWhitelistPolicyHostRequest, ListAppWhitelistPolicyHostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAppWhitelistPolicyHostRequest.class,
                    ListAppWhitelistPolicyHostResponse.class)
                .withName("ListAppWhitelistPolicyHost")
                .withUri("/v5/{project_id}/app/host")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistPolicyHostRequest::getEnterpriseProjectId,
                ListAppWhitelistPolicyHostRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppWhitelistPolicyHostRequest::getOffset,
                ListAppWhitelistPolicyHostRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppWhitelistPolicyHostRequest::getLimit,
                ListAppWhitelistPolicyHostRequest::setLimit));
        builder.<String>withRequestField("policy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistPolicyHostRequest::getPolicyName,
                ListAppWhitelistPolicyHostRequest::setPolicyName));
        builder.<String>withRequestField("learning_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistPolicyHostRequest::getLearningStatus,
                ListAppWhitelistPolicyHostRequest::setLearningStatus));
        builder.<Boolean>withRequestField("apply_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAppWhitelistPolicyHostRequest::getApplyStatus,
                ListAppWhitelistPolicyHostRequest::setApplyStatus));
        builder.<String>withRequestField("asset_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistPolicyHostRequest::getAssetValue,
                ListAppWhitelistPolicyHostRequest::setAssetValue));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistPolicyHostRequest::getHostName,
                ListAppWhitelistPolicyHostRequest::setHostName));
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistPolicyHostRequest::getPrivateIp,
                ListAppWhitelistPolicyHostRequest::setPrivateIp));
        builder.<String>withRequestField("os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistPolicyHostRequest::getOsType,
                ListAppWhitelistPolicyHostRequest::setOsType));
        builder.<String>withRequestField("policy_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistPolicyHostRequest::getPolicyId,
                ListAppWhitelistPolicyHostRequest::setPolicyId));
        builder.<String>withRequestField("public_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistPolicyHostRequest::getPublicIp,
                ListAppWhitelistPolicyHostRequest::setPublicIp));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppWhitelistPolicyProcessRequest, ListAppWhitelistPolicyProcessResponse> listAppWhitelistPolicyProcess =
        genForListAppWhitelistPolicyProcess();

    private static HttpRequestDef<ListAppWhitelistPolicyProcessRequest, ListAppWhitelistPolicyProcessResponse> genForListAppWhitelistPolicyProcess() {
        // basic
        HttpRequestDef.Builder<ListAppWhitelistPolicyProcessRequest, ListAppWhitelistPolicyProcessResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAppWhitelistPolicyProcessRequest.class,
                    ListAppWhitelistPolicyProcessResponse.class)
                .withName("ListAppWhitelistPolicyProcess")
                .withUri("/v5/{project_id}/app/{policy_id}/process")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistPolicyProcessRequest::getPolicyId,
                ListAppWhitelistPolicyProcessRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistPolicyProcessRequest::getEnterpriseProjectId,
                ListAppWhitelistPolicyProcessRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppWhitelistPolicyProcessRequest::getOffset,
                ListAppWhitelistPolicyProcessRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppWhitelistPolicyProcessRequest::getLimit,
                ListAppWhitelistPolicyProcessRequest::setLimit));
        builder.<String>withRequestField("process_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistPolicyProcessRequest::getProcessStatus,
                ListAppWhitelistPolicyProcessRequest::setProcessStatus));
        builder.<String>withRequestField("process_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistPolicyProcessRequest::getProcessType,
                ListAppWhitelistPolicyProcessRequest::setProcessType));
        builder.<String>withRequestField("process_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistPolicyProcessRequest::getProcessName,
                ListAppWhitelistPolicyProcessRequest::setProcessName));
        builder.<String>withRequestField("process_hash",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistPolicyProcessRequest::getProcessHash,
                ListAppWhitelistPolicyProcessRequest::setProcessHash));
        builder.<String>withRequestField("process_path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistPolicyProcessRequest::getProcessPath,
                ListAppWhitelistPolicyProcessRequest::setProcessPath));
        builder.<String>withRequestField("handle_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistPolicyProcessRequest::getHandleStatus,
                ListAppWhitelistPolicyProcessRequest::setHandleStatus));
        builder.<String>withRequestField("os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistPolicyProcessRequest::getOsType,
                ListAppWhitelistPolicyProcessRequest::setOsType));
        builder.<String>withRequestField("file_signer",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistPolicyProcessRequest::getFileSigner,
                ListAppWhitelistPolicyProcessRequest::setFileSigner));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppWhitelistPolicyProcessExtendRequest, ListAppWhitelistPolicyProcessExtendResponse> listAppWhitelistPolicyProcessExtend =
        genForListAppWhitelistPolicyProcessExtend();

    private static HttpRequestDef<ListAppWhitelistPolicyProcessExtendRequest, ListAppWhitelistPolicyProcessExtendResponse> genForListAppWhitelistPolicyProcessExtend() {
        // basic
        HttpRequestDef.Builder<ListAppWhitelistPolicyProcessExtendRequest, ListAppWhitelistPolicyProcessExtendResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAppWhitelistPolicyProcessExtendRequest.class,
                    ListAppWhitelistPolicyProcessExtendResponse.class)
                .withName("ListAppWhitelistPolicyProcessExtend")
                .withUri("/v5/{project_id}/app/{policy_id}/process-extend")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistPolicyProcessExtendRequest::getPolicyId,
                ListAppWhitelistPolicyProcessExtendRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistPolicyProcessExtendRequest::getEnterpriseProjectId,
                ListAppWhitelistPolicyProcessExtendRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppWhitelistPolicyProcessExtendRequest::getHostId,
                ListAppWhitelistPolicyProcessExtendRequest::setHostId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppWhitelistAgentStaticsRequest, ShowAppWhitelistAgentStaticsResponse> showAppWhitelistAgentStatics =
        genForShowAppWhitelistAgentStatics();

    private static HttpRequestDef<ShowAppWhitelistAgentStaticsRequest, ShowAppWhitelistAgentStaticsResponse> genForShowAppWhitelistAgentStatics() {
        // basic
        HttpRequestDef.Builder<ShowAppWhitelistAgentStaticsRequest, ShowAppWhitelistAgentStaticsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowAppWhitelistAgentStaticsRequest.class,
                    ShowAppWhitelistAgentStaticsResponse.class)
                .withName("ShowAppWhitelistAgentStatics")
                .withUri("/v5/{project_id}/app/agent/statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppWhitelistAgentStaticsRequest::getEnterpriseProjectId,
                ShowAppWhitelistAgentStaticsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppWhitelistPolicyRequest, ShowAppWhitelistPolicyResponse> showAppWhitelistPolicy =
        genForShowAppWhitelistPolicy();

    private static HttpRequestDef<ShowAppWhitelistPolicyRequest, ShowAppWhitelistPolicyResponse> genForShowAppWhitelistPolicy() {
        // basic
        HttpRequestDef.Builder<ShowAppWhitelistPolicyRequest, ShowAppWhitelistPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAppWhitelistPolicyRequest.class, ShowAppWhitelistPolicyResponse.class)
            .withName("ShowAppWhitelistPolicy")
            .withUri("/v5/{project_id}/app/{policy_id}/detail")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppWhitelistPolicyRequest::getPolicyId,
                ShowAppWhitelistPolicyRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppWhitelistPolicyRequest::getEnterpriseProjectId,
                ShowAppWhitelistPolicyRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchAppWhitelistPolicyHostRequest, SwitchAppWhitelistPolicyHostResponse> switchAppWhitelistPolicyHost =
        genForSwitchAppWhitelistPolicyHost();

    private static HttpRequestDef<SwitchAppWhitelistPolicyHostRequest, SwitchAppWhitelistPolicyHostResponse> genForSwitchAppWhitelistPolicyHost() {
        // basic
        HttpRequestDef.Builder<SwitchAppWhitelistPolicyHostRequest, SwitchAppWhitelistPolicyHostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    SwitchAppWhitelistPolicyHostRequest.class,
                    SwitchAppWhitelistPolicyHostResponse.class)
                .withName("SwitchAppWhitelistPolicyHost")
                .withUri("/v5/{project_id}/app/host")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchAppWhitelistPolicyHostRequest::getEnterpriseProjectId,
                SwitchAppWhitelistPolicyHostRequest::setEnterpriseProjectId));
        builder.<SwitchAppWhitelistPolicyHostRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SwitchAppWhitelistPolicyHostRequestInfo.class),
            f -> f.withMarshaller(SwitchAppWhitelistPolicyHostRequest::getBody,
                SwitchAppWhitelistPolicyHostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchAppWhitelistPolicyLearnStatusRequest, SwitchAppWhitelistPolicyLearnStatusResponse> switchAppWhitelistPolicyLearnStatus =
        genForSwitchAppWhitelistPolicyLearnStatus();

    private static HttpRequestDef<SwitchAppWhitelistPolicyLearnStatusRequest, SwitchAppWhitelistPolicyLearnStatusResponse> genForSwitchAppWhitelistPolicyLearnStatus() {
        // basic
        HttpRequestDef.Builder<SwitchAppWhitelistPolicyLearnStatusRequest, SwitchAppWhitelistPolicyLearnStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    SwitchAppWhitelistPolicyLearnStatusRequest.class,
                    SwitchAppWhitelistPolicyLearnStatusResponse.class)
                .withName("SwitchAppWhitelistPolicyLearnStatus")
                .withUri("/v5/{project_id}/app/{policy_id}/learn")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchAppWhitelistPolicyLearnStatusRequest::getPolicyId,
                SwitchAppWhitelistPolicyLearnStatusRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchAppWhitelistPolicyLearnStatusRequest::getEnterpriseProjectId,
                SwitchAppWhitelistPolicyLearnStatusRequest::setEnterpriseProjectId));
        builder.<SwitchAppWhitelistPolicyLearnStatusRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SwitchAppWhitelistPolicyLearnStatusRequestInfo.class),
            f -> f.withMarshaller(SwitchAppWhitelistPolicyLearnStatusRequest::getBody,
                SwitchAppWhitelistPolicyLearnStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHandleAffectBaselineRequest, ListHandleAffectBaselineResponse> listHandleAffectBaseline =
        genForListHandleAffectBaseline();

    private static HttpRequestDef<ListHandleAffectBaselineRequest, ListHandleAffectBaselineResponse> genForListHandleAffectBaseline() {
        // basic
        HttpRequestDef.Builder<ListHandleAffectBaselineRequest, ListHandleAffectBaselineResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ListHandleAffectBaselineRequest.class, ListHandleAffectBaselineResponse.class)
                .withName("ListHandleAffectBaseline")
                .withUri("/v5/{project_id}/baseline/check-rule/handle-affect-baseline")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHandleAffectBaselineRequest::getEnterpriseProjectId,
                ListHandleAffectBaselineRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHandleAffectBaselineRequest::getOffset,
                ListHandleAffectBaselineRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHandleAffectBaselineRequest::getLimit,
                ListHandleAffectBaselineRequest::setLimit));
        builder.<ListHandleAffectBaselineRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListHandleAffectBaselineRequestBody.class),
            f -> f.withMarshaller(ListHandleAffectBaselineRequest::getBody, ListHandleAffectBaselineRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CopyBaselinePolicyGroupRequest, CopyBaselinePolicyGroupResponse> copyBaselinePolicyGroup =
        genForCopyBaselinePolicyGroup();

    private static HttpRequestDef<CopyBaselinePolicyGroupRequest, CopyBaselinePolicyGroupResponse> genForCopyBaselinePolicyGroup() {
        // basic
        HttpRequestDef.Builder<CopyBaselinePolicyGroupRequest, CopyBaselinePolicyGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, CopyBaselinePolicyGroupRequest.class, CopyBaselinePolicyGroupResponse.class)
            .withName("CopyBaselinePolicyGroup")
            .withUri("/v5/{project_id}/baseline/security-checks/policy-group")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyBaselinePolicyGroupRequest::getEnterpriseProjectId,
                CopyBaselinePolicyGroupRequest::setEnterpriseProjectId));
        builder.<CopyBaselinePolicyGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CopyBaselinePolicyGroupRequestBody.class),
            f -> f.withMarshaller(CopyBaselinePolicyGroupRequest::getBody, CopyBaselinePolicyGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBaselineDirectoryRequest, ShowBaselineDirectoryResponse> showBaselineDirectory =
        genForShowBaselineDirectory();

    private static HttpRequestDef<ShowBaselineDirectoryRequest, ShowBaselineDirectoryResponse> genForShowBaselineDirectory() {
        // basic
        HttpRequestDef.Builder<ShowBaselineDirectoryRequest, ShowBaselineDirectoryResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowBaselineDirectoryRequest.class, ShowBaselineDirectoryResponse.class)
            .withName("ShowBaselineDirectory")
            .withUri("/v5/{project_id}/baseline/security-checks/directory")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBaselineDirectoryRequest::getEnterpriseProjectId,
                ShowBaselineDirectoryRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("support_os",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBaselineDirectoryRequest::getSupportOs,
                ShowBaselineDirectoryRequest::setSupportOs));
        builder.<String>withRequestField("select_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBaselineDirectoryRequest::getSelectType,
                ShowBaselineDirectoryRequest::setSelectType));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBaselineDirectoryRequest::getGroupId, ShowBaselineDirectoryRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterRiskAffectResourcesRequest, ListClusterRiskAffectResourcesResponse> listClusterRiskAffectResources =
        genForListClusterRiskAffectResources();

    private static HttpRequestDef<ListClusterRiskAffectResourcesRequest, ListClusterRiskAffectResourcesResponse> genForListClusterRiskAffectResources() {
        // basic
        HttpRequestDef.Builder<ListClusterRiskAffectResourcesRequest, ListClusterRiskAffectResourcesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListClusterRiskAffectResourcesRequest.class,
                    ListClusterRiskAffectResourcesResponse.class)
                .withName("ListClusterRiskAffectResources")
                .withUri("/v5/{project_id}/container/cluster/risk/{risk_id}/affected-resources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("risk_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterRiskAffectResourcesRequest::getRiskId,
                ListClusterRiskAffectResourcesRequest::setRiskId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterRiskAffectResourcesRequest::getEnterpriseProjectId,
                ListClusterRiskAffectResourcesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClusterRiskAffectResourcesRequest::getOffset,
                ListClusterRiskAffectResourcesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClusterRiskAffectResourcesRequest::getLimit,
                ListClusterRiskAffectResourcesRequest::setLimit));
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterRiskAffectResourcesRequest::getClusterId,
                ListClusterRiskAffectResourcesRequest::setClusterId));
        builder.<String>withRequestField("resource_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterRiskAffectResourcesRequest::getResourceName,
                ListClusterRiskAffectResourcesRequest::setResourceName));
        builder.<String>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterRiskAffectResourcesRequest::getResourceType,
                ListClusterRiskAffectResourcesRequest::setResourceType));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterRiskAffectResourcesRequest::getNamespace,
                ListClusterRiskAffectResourcesRequest::setNamespace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterRisksRequest, ListClusterRisksResponse> listClusterRisks =
        genForListClusterRisks();

    private static HttpRequestDef<ListClusterRisksRequest, ListClusterRisksResponse> genForListClusterRisks() {
        // basic
        HttpRequestDef.Builder<ListClusterRisksRequest, ListClusterRisksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListClusterRisksRequest.class, ListClusterRisksResponse.class)
                .withName("ListClusterRisks")
                .withUri("/v5/{project_id}/container/cluster/risks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterRisksRequest::getEnterpriseProjectId,
                ListClusterRisksRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClusterRisksRequest::getOffset, ListClusterRisksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClusterRisksRequest::getLimit, ListClusterRisksRequest::setLimit));
        builder.<String>withRequestField("risk_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterRisksRequest::getRiskType, ListClusterRisksRequest::setRiskType));
        builder.<String>withRequestField("risk_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterRisksRequest::getRiskStatus, ListClusterRisksRequest::setRiskStatus));
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterRisksRequest::getClusterId, ListClusterRisksRequest::setClusterId));
        builder.<String>withRequestField("cluster_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterRisksRequest::getClusterName, ListClusterRisksRequest::setClusterName));
        builder.<String>withRequestField("risk_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterRisksRequest::getRiskName, ListClusterRisksRequest::setRiskName));
        builder.<String>withRequestField("risk_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterRisksRequest::getRiskLevel, ListClusterRisksRequest::setRiskLevel));
        builder.<String>withRequestField("risk_category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterRisksRequest::getRiskCategory, ListClusterRisksRequest::setRiskCategory));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterScanStatisticsRequest, ShowClusterScanStatisticsResponse> showClusterScanStatistics =
        genForShowClusterScanStatistics();

    private static HttpRequestDef<ShowClusterScanStatisticsRequest, ShowClusterScanStatisticsResponse> genForShowClusterScanStatistics() {
        // basic
        HttpRequestDef.Builder<ShowClusterScanStatisticsRequest, ShowClusterScanStatisticsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowClusterScanStatisticsRequest.class,
                    ShowClusterScanStatisticsResponse.class)
                .withName("ShowClusterScanStatistics")
                .withUri("/v5/{project_id}/container/cluster/statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterScanStatisticsRequest::getEnterpriseProjectId,
                ShowClusterScanStatisticsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectConfigsRequest, ListProjectConfigsResponse> listProjectConfigs =
        genForListProjectConfigs();

    private static HttpRequestDef<ListProjectConfigsRequest, ListProjectConfigsResponse> genForListProjectConfigs() {
        // basic
        HttpRequestDef.Builder<ListProjectConfigsRequest, ListProjectConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListProjectConfigsRequest.class, ListProjectConfigsResponse.class)
                .withName("ListProjectConfigs")
                .withUri("/v5/{project_id}/config")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectConfigsRequest::getEnterpriseProjectId,
                ListProjectConfigsRequest::setEnterpriseProjectId));
        builder.<ListProjectConfigsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListProjectConfigsRequestBody.class),
            f -> f.withMarshaller(ListProjectConfigsRequest::getBody, ListProjectConfigsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyProjectConfigsRequest, ModifyProjectConfigsResponse> modifyProjectConfigs =
        genForModifyProjectConfigs();

    private static HttpRequestDef<ModifyProjectConfigsRequest, ModifyProjectConfigsResponse> genForModifyProjectConfigs() {
        // basic
        HttpRequestDef.Builder<ModifyProjectConfigsRequest, ModifyProjectConfigsResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, ModifyProjectConfigsRequest.class, ModifyProjectConfigsResponse.class)
            .withName("ModifyProjectConfigs")
            .withUri("/v5/{project_id}/config")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyProjectConfigsRequest::getEnterpriseProjectId,
                ModifyProjectConfigsRequest::setEnterpriseProjectId));
        builder.<ModifyProjectConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyProjectConfigRequestBody.class),
            f -> f.withMarshaller(ModifyProjectConfigsRequest::getBody, ModifyProjectConfigsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SaveBrowsingHistoryRequest, SaveBrowsingHistoryResponse> saveBrowsingHistory =
        genForSaveBrowsingHistory();

    private static HttpRequestDef<SaveBrowsingHistoryRequest, SaveBrowsingHistoryResponse> genForSaveBrowsingHistory() {
        // basic
        HttpRequestDef.Builder<SaveBrowsingHistoryRequest, SaveBrowsingHistoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SaveBrowsingHistoryRequest.class, SaveBrowsingHistoryResponse.class)
                .withName("SaveBrowsingHistory")
                .withUri("/v5/{project_id}/browsing-history")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveBrowsingHistoryRequest::getEnterpriseProjectId,
                SaveBrowsingHistoryRequest::setEnterpriseProjectId));
        builder.<SaveBrowsingHistoryRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SaveBrowsingHistoryRequestInfo.class),
            f -> f.withMarshaller(SaveBrowsingHistoryRequest::getBody, SaveBrowsingHistoryRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteAgentDaemonsetRequest, BatchDeleteAgentDaemonsetResponse> batchDeleteAgentDaemonset =
        genForBatchDeleteAgentDaemonset();

    private static HttpRequestDef<BatchDeleteAgentDaemonsetRequest, BatchDeleteAgentDaemonsetResponse> genForBatchDeleteAgentDaemonset() {
        // basic
        HttpRequestDef.Builder<BatchDeleteAgentDaemonsetRequest, BatchDeleteAgentDaemonsetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteAgentDaemonsetRequest.class,
                    BatchDeleteAgentDaemonsetResponse.class)
                .withName("BatchDeleteAgentDaemonset")
                .withUri("/v5/{project_id}/container/kubernetes/clusters/daemonsets/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteAgentDaemonsetRequest::getEnterpriseProjectId,
                BatchDeleteAgentDaemonsetRequest::setEnterpriseProjectId));
        builder.<BatchDeleteDaemonsetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteDaemonsetRequestBody.class),
            f -> f.withMarshaller(BatchDeleteAgentDaemonsetRequest::getBody,
                BatchDeleteAgentDaemonsetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpgradeAgentDaemonsetRequest, BatchUpgradeAgentDaemonsetResponse> batchUpgradeAgentDaemonset =
        genForBatchUpgradeAgentDaemonset();

    private static HttpRequestDef<BatchUpgradeAgentDaemonsetRequest, BatchUpgradeAgentDaemonsetResponse> genForBatchUpgradeAgentDaemonset() {
        // basic
        HttpRequestDef.Builder<BatchUpgradeAgentDaemonsetRequest, BatchUpgradeAgentDaemonsetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchUpgradeAgentDaemonsetRequest.class,
                    BatchUpgradeAgentDaemonsetResponse.class)
                .withName("BatchUpgradeAgentDaemonset")
                .withUri("/v5/{project_id}/container/kubernetes/clusters/daemonsets/batch-upgrade")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpgradeAgentDaemonsetRequest::getEnterpriseProjectId,
                BatchUpgradeAgentDaemonsetRequest::setEnterpriseProjectId));
        builder.<BatchUpdateDaemonsetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdateDaemonsetRequestBody.class),
            f -> f.withMarshaller(BatchUpgradeAgentDaemonsetRequest::getBody,
                BatchUpgradeAgentDaemonsetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAgentDaemonsetRequest, CreateAgentDaemonsetResponse> createAgentDaemonset =
        genForCreateAgentDaemonset();

    private static HttpRequestDef<CreateAgentDaemonsetRequest, CreateAgentDaemonsetResponse> genForCreateAgentDaemonset() {
        // basic
        HttpRequestDef.Builder<CreateAgentDaemonsetRequest, CreateAgentDaemonsetResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateAgentDaemonsetRequest.class, CreateAgentDaemonsetResponse.class)
            .withName("CreateAgentDaemonset")
            .withUri("/v5/{project_id}/container/kubernetes/clusters/{cluster_id}/daemonsets")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAgentDaemonsetRequest::getClusterId,
                CreateAgentDaemonsetRequest::setClusterId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAgentDaemonsetRequest::getEnterpriseProjectId,
                CreateAgentDaemonsetRequest::setEnterpriseProjectId));
        builder.<CreateDaemonsetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateDaemonsetRequestBody.class),
            f -> f.withMarshaller(CreateAgentDaemonsetRequest::getBody, CreateAgentDaemonsetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMultiCloudClustersRequest, CreateMultiCloudClustersResponse> createMultiCloudClusters =
        genForCreateMultiCloudClusters();

    private static HttpRequestDef<CreateMultiCloudClustersRequest, CreateMultiCloudClustersResponse> genForCreateMultiCloudClusters() {
        // basic
        HttpRequestDef.Builder<CreateMultiCloudClustersRequest, CreateMultiCloudClustersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateMultiCloudClustersRequest.class, CreateMultiCloudClustersResponse.class)
                .withName("CreateMultiCloudClusters")
                .withUri("/v5/{project_id}/container/kubernetes/multi-cloud/clusters")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMultiCloudClustersRequest::getEnterpriseProjectId,
                CreateMultiCloudClustersRequest::setEnterpriseProjectId));
        builder.<MultiCloudClusterCreateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MultiCloudClusterCreateRequestBody.class),
            f -> f.withMarshaller(CreateMultiCloudClustersRequest::getBody, CreateMultiCloudClustersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAgentDaemonsetRequest, DeleteAgentDaemonsetResponse> deleteAgentDaemonset =
        genForDeleteAgentDaemonset();

    private static HttpRequestDef<DeleteAgentDaemonsetRequest, DeleteAgentDaemonsetResponse> genForDeleteAgentDaemonset() {
        // basic
        HttpRequestDef.Builder<DeleteAgentDaemonsetRequest, DeleteAgentDaemonsetResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAgentDaemonsetRequest.class, DeleteAgentDaemonsetResponse.class)
            .withName("DeleteAgentDaemonset")
            .withUri("/v5/{project_id}/container/kubernetes/clusters/{cluster_id}/daemonsets")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAgentDaemonsetRequest::getClusterId,
                DeleteAgentDaemonsetRequest::setClusterId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAgentDaemonsetRequest::getEnterpriseProjectId,
                DeleteAgentDaemonsetRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("invoked_service",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAgentDaemonsetRequest::getInvokedService,
                DeleteAgentDaemonsetRequest::setInvokedService));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAgentDaemonsetRequest::getRegion, DeleteAgentDaemonsetRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCicdConfigurationsRequest, DeleteCicdConfigurationsResponse> deleteCicdConfigurations =
        genForDeleteCicdConfigurations();

    private static HttpRequestDef<DeleteCicdConfigurationsRequest, DeleteCicdConfigurationsResponse> genForDeleteCicdConfigurations() {
        // basic
        HttpRequestDef.Builder<DeleteCicdConfigurationsRequest, DeleteCicdConfigurationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, DeleteCicdConfigurationsRequest.class, DeleteCicdConfigurationsResponse.class)
                .withName("DeleteCicdConfigurations")
                .withUri("/v5/{project_id}/image/cicd/configurations/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCicdConfigurationsRequest::getEnterpriseProjectId,
                DeleteCicdConfigurationsRequest::setEnterpriseProjectId));
        builder.<DeleteCicdConfigurationsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteCicdConfigurationsRequestBody.class),
            f -> f.withMarshaller(DeleteCicdConfigurationsRequest::getBody, DeleteCicdConfigurationsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportImageSecurityReportTaskRequest, ExportImageSecurityReportTaskResponse> exportImageSecurityReportTask =
        genForExportImageSecurityReportTask();

    private static HttpRequestDef<ExportImageSecurityReportTaskRequest, ExportImageSecurityReportTaskResponse> genForExportImageSecurityReportTask() {
        // basic
        HttpRequestDef.Builder<ExportImageSecurityReportTaskRequest, ExportImageSecurityReportTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ExportImageSecurityReportTaskRequest.class,
                    ExportImageSecurityReportTaskResponse.class)
                .withName("ExportImageSecurityReportTask")
                .withUri("/v5/{project_id}/image/security-report/export-tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportImageSecurityReportTaskRequest::getEnterpriseProjectId,
                ExportImageSecurityReportTaskRequest::setEnterpriseProjectId));
        builder.<ExportImageSecurityReportTaskRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportImageSecurityReportTaskRequestInfo.class),
            f -> f.withMarshaller(ExportImageSecurityReportTaskRequest::getBody,
                ExportImageSecurityReportTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAssociateRegistriesRequest, ListAssociateRegistriesResponse> listAssociateRegistries =
        genForListAssociateRegistries();

    private static HttpRequestDef<ListAssociateRegistriesRequest, ListAssociateRegistriesResponse> genForListAssociateRegistries() {
        // basic
        HttpRequestDef.Builder<ListAssociateRegistriesRequest, ListAssociateRegistriesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAssociateRegistriesRequest.class, ListAssociateRegistriesResponse.class)
            .withName("ListAssociateRegistries")
            .withUri("/v5/{project_id}/image/image-sync/tasks/{task_id}/registries")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssociateRegistriesRequest::getTaskId,
                ListAssociateRegistriesRequest::setTaskId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssociateRegistriesRequest::getEnterpriseProjectId,
                ListAssociateRegistriesRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("registry_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssociateRegistriesRequest::getRegistryName,
                ListAssociateRegistriesRequest::setRegistryName));
        builder.<String>withRequestField("registry_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssociateRegistriesRequest::getRegistryType,
                ListAssociateRegistriesRequest::setRegistryType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssociateRegistriesRequest::getOffset,
                ListAssociateRegistriesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssociateRegistriesRequest::getLimit, ListAssociateRegistriesRequest::setLimit));
        builder.<String>withRequestField("sync_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssociateRegistriesRequest::getSyncStatus,
                ListAssociateRegistriesRequest::setSyncStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCicdConfigurationsRequest, ListCicdConfigurationsResponse> listCicdConfigurations =
        genForListCicdConfigurations();

    private static HttpRequestDef<ListCicdConfigurationsRequest, ListCicdConfigurationsResponse> genForListCicdConfigurations() {
        // basic
        HttpRequestDef.Builder<ListCicdConfigurationsRequest, ListCicdConfigurationsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListCicdConfigurationsRequest.class, ListCicdConfigurationsResponse.class)
            .withName("ListCicdConfigurations")
            .withUri("/v5/{project_id}/image/cicd/configurations")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCicdConfigurationsRequest::getEnterpriseProjectId,
                ListCicdConfigurationsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCicdConfigurationsRequest::getOffset, ListCicdConfigurationsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCicdConfigurationsRequest::getLimit, ListCicdConfigurationsRequest::setLimit));
        builder.<String>withRequestField("cicd_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCicdConfigurationsRequest::getCicdName,
                ListCicdConfigurationsRequest::setCicdName));
        builder.<String>withRequestField("cicd_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCicdConfigurationsRequest::getCicdId, ListCicdConfigurationsRequest::setCicdId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMultiCloudClustersRequest, ListMultiCloudClustersResponse> listMultiCloudClusters =
        genForListMultiCloudClusters();

    private static HttpRequestDef<ListMultiCloudClustersRequest, ListMultiCloudClustersResponse> genForListMultiCloudClusters() {
        // basic
        HttpRequestDef.Builder<ListMultiCloudClustersRequest, ListMultiCloudClustersResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListMultiCloudClustersRequest.class, ListMultiCloudClustersResponse.class)
            .withName("ListMultiCloudClusters")
            .withUri("/v5/{project_id}/container/kubernetes/multi-cloud/clusters")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMultiCloudClustersRequest::getEnterpriseProjectId,
                ListMultiCloudClustersRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMultiCloudClustersRequest::getClusterId,
                ListMultiCloudClustersRequest::setClusterId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMultiCloudClustersRequest::getOffset, ListMultiCloudClustersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMultiCloudClustersRequest::getLimit, ListMultiCloudClustersRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyCicdConfigurationRequest, ModifyCicdConfigurationResponse> modifyCicdConfiguration =
        genForModifyCicdConfiguration();

    private static HttpRequestDef<ModifyCicdConfigurationRequest, ModifyCicdConfigurationResponse> genForModifyCicdConfiguration() {
        // basic
        HttpRequestDef.Builder<ModifyCicdConfigurationRequest, ModifyCicdConfigurationResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, ModifyCicdConfigurationRequest.class, ModifyCicdConfigurationResponse.class)
            .withName("ModifyCicdConfiguration")
            .withUri("/v5/{project_id}/image/cicd/configurations/{cicd_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cicd_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyCicdConfigurationRequest::getCicdId,
                ModifyCicdConfigurationRequest::setCicdId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyCicdConfigurationRequest::getEnterpriseProjectId,
                ModifyCicdConfigurationRequest::setEnterpriseProjectId));
        builder.<ModifyCicdConfigurationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyCicdConfigurationRequestBody.class),
            f -> f.withMarshaller(ModifyCicdConfigurationRequest::getBody, ModifyCicdConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ParseMultiCloudClusterConfigRequest, ParseMultiCloudClusterConfigResponse> parseMultiCloudClusterConfig =
        genForParseMultiCloudClusterConfig();

    private static HttpRequestDef<ParseMultiCloudClusterConfigRequest, ParseMultiCloudClusterConfigResponse> genForParseMultiCloudClusterConfig() {
        // basic
        HttpRequestDef.Builder<ParseMultiCloudClusterConfigRequest, ParseMultiCloudClusterConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ParseMultiCloudClusterConfigRequest.class,
                    ParseMultiCloudClusterConfigResponse.class)
                .withName("ParseMultiCloudClusterConfig")
                .withUri("/v5/{project_id}/container/kubernetes/multi-cloud/config-analyze")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ParseMultiCloudClusterConfigRequest::getEnterpriseProjectId,
                ParseMultiCloudClusterConfigRequest::setEnterpriseProjectId));
        builder.<MultiCloudClusterConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MultiCloudClusterConfigRequestBody.class),
            f -> f.withMarshaller(ParseMultiCloudClusterConfigRequest::getBody,
                ParseMultiCloudClusterConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveMultiCloudClustersRequest, RemoveMultiCloudClustersResponse> removeMultiCloudClusters =
        genForRemoveMultiCloudClusters();

    private static HttpRequestDef<RemoveMultiCloudClustersRequest, RemoveMultiCloudClustersResponse> genForRemoveMultiCloudClusters() {
        // basic
        HttpRequestDef.Builder<RemoveMultiCloudClustersRequest, RemoveMultiCloudClustersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    RemoveMultiCloudClustersRequest.class,
                    RemoveMultiCloudClustersResponse.class)
                .withName("RemoveMultiCloudClusters")
                .withUri("/v5/{project_id}/container/kubernetes/multi-cloud/clusters/{cluster_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveMultiCloudClustersRequest::getClusterId,
                RemoveMultiCloudClustersRequest::setClusterId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveMultiCloudClustersRequest::getEnterpriseProjectId,
                RemoveMultiCloudClustersRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAgentDaemonsetDeployTemplateRequest, ShowAgentDaemonsetDeployTemplateResponse> showAgentDaemonsetDeployTemplate =
        genForShowAgentDaemonsetDeployTemplate();

    private static HttpRequestDef<ShowAgentDaemonsetDeployTemplateRequest, ShowAgentDaemonsetDeployTemplateResponse> genForShowAgentDaemonsetDeployTemplate() {
        // basic
        HttpRequestDef.Builder<ShowAgentDaemonsetDeployTemplateRequest, ShowAgentDaemonsetDeployTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowAgentDaemonsetDeployTemplateRequest.class,
                    ShowAgentDaemonsetDeployTemplateResponse.class)
                .withName("ShowAgentDaemonsetDeployTemplate")
                .withUri("/v5/{project_id}/container/kubernetes/template")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAgentDaemonsetDeployTemplateRequest::getEnterpriseProjectId,
                ShowAgentDaemonsetDeployTemplateRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAgentDaemonsetDetailInfoRequest, ShowAgentDaemonsetDetailInfoResponse> showAgentDaemonsetDetailInfo =
        genForShowAgentDaemonsetDetailInfo();

    private static HttpRequestDef<ShowAgentDaemonsetDetailInfoRequest, ShowAgentDaemonsetDetailInfoResponse> genForShowAgentDaemonsetDetailInfo() {
        // basic
        HttpRequestDef.Builder<ShowAgentDaemonsetDetailInfoRequest, ShowAgentDaemonsetDetailInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowAgentDaemonsetDetailInfoRequest.class,
                    ShowAgentDaemonsetDetailInfoResponse.class)
                .withName("ShowAgentDaemonsetDetailInfo")
                .withUri("/v5/{project_id}/container/kubernetes/clusters/{cluster_id}/daemonsets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAgentDaemonsetDetailInfoRequest::getClusterId,
                ShowAgentDaemonsetDetailInfoRequest::setClusterId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAgentDaemonsetDetailInfoRequest::getEnterpriseProjectId,
                ShowAgentDaemonsetDetailInfoRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCicdConfigurationRequest, ShowCicdConfigurationResponse> showCicdConfiguration =
        genForShowCicdConfiguration();

    private static HttpRequestDef<ShowCicdConfigurationRequest, ShowCicdConfigurationResponse> genForShowCicdConfiguration() {
        // basic
        HttpRequestDef.Builder<ShowCicdConfigurationRequest, ShowCicdConfigurationResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowCicdConfigurationRequest.class, ShowCicdConfigurationResponse.class)
            .withName("ShowCicdConfiguration")
            .withUri("/v5/{project_id}/image/cicd/configurations/{cicd_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cicd_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCicdConfigurationRequest::getCicdId, ShowCicdConfigurationRequest::setCicdId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCicdConfigurationRequest::getEnterpriseProjectId,
                ShowCicdConfigurationRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMultiCloudClusterImageCommandRequest, ShowMultiCloudClusterImageCommandResponse> showMultiCloudClusterImageCommand =
        genForShowMultiCloudClusterImageCommand();

    private static HttpRequestDef<ShowMultiCloudClusterImageCommandRequest, ShowMultiCloudClusterImageCommandResponse> genForShowMultiCloudClusterImageCommand() {
        // basic
        HttpRequestDef.Builder<ShowMultiCloudClusterImageCommandRequest, ShowMultiCloudClusterImageCommandResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowMultiCloudClusterImageCommandRequest.class,
                    ShowMultiCloudClusterImageCommandResponse.class)
                .withName("ShowMultiCloudClusterImageCommand")
                .withUri("/v5/{project_id}/container/kubernetes/multi-cloud/image-upload-command")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_repo",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMultiCloudClusterImageCommandRequest::getImageRepo,
                ShowMultiCloudClusterImageCommandRequest::setImageRepo));
        builder.<String>withRequestField("organization",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMultiCloudClusterImageCommandRequest::getOrganization,
                ShowMultiCloudClusterImageCommandRequest::setOrganization));
        builder.<String>withRequestField("username",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMultiCloudClusterImageCommandRequest::getUsername,
                ShowMultiCloudClusterImageCommandRequest::setUsername));
        builder.<String>withRequestField("password",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMultiCloudClusterImageCommandRequest::getPassword,
                ShowMultiCloudClusterImageCommandRequest::setPassword));
        builder.<String>withRequestField("plug_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMultiCloudClusterImageCommandRequest::getPlugType,
                ShowMultiCloudClusterImageCommandRequest::setPlugType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMultiCloudClusterProxyScriptRequest, ShowMultiCloudClusterProxyScriptResponse> showMultiCloudClusterProxyScript =
        genForShowMultiCloudClusterProxyScript();

    private static HttpRequestDef<ShowMultiCloudClusterProxyScriptRequest, ShowMultiCloudClusterProxyScriptResponse> genForShowMultiCloudClusterProxyScript() {
        // basic
        HttpRequestDef.Builder<ShowMultiCloudClusterProxyScriptRequest, ShowMultiCloudClusterProxyScriptResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowMultiCloudClusterProxyScriptRequest.class,
                    ShowMultiCloudClusterProxyScriptResponse.class)
                .withName("ShowMultiCloudClusterProxyScript")
                .withUri("/v5/{project_id}/container/kubernetes/multi-cloud/clusters/{cluster_id}/agent/install-script")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMultiCloudClusterProxyScriptRequest::getClusterId,
                ShowMultiCloudClusterProxyScriptRequest::setClusterId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMultiCloudClusterProxyScriptRequest::getEnterpriseProjectId,
                ShowMultiCloudClusterProxyScriptRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SyncMultiCloudClusterStatusRequest, SyncMultiCloudClusterStatusResponse> syncMultiCloudClusterStatus =
        genForSyncMultiCloudClusterStatus();

    private static HttpRequestDef<SyncMultiCloudClusterStatusRequest, SyncMultiCloudClusterStatusResponse> genForSyncMultiCloudClusterStatus() {
        // basic
        HttpRequestDef.Builder<SyncMultiCloudClusterStatusRequest, SyncMultiCloudClusterStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    SyncMultiCloudClusterStatusRequest.class,
                    SyncMultiCloudClusterStatusResponse.class)
                .withName("SyncMultiCloudClusterStatus")
                .withUri("/v5/{project_id}/container/kubernetes/multi-cloud/clusters/status-synchronize")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SyncMultiCloudClusterStatusRequest::getEnterpriseProjectId,
                SyncMultiCloudClusterStatusRequest::setEnterpriseProjectId));
        builder.<MultiCloudClusterSyncStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MultiCloudClusterSyncStatusRequestBody.class),
            f -> f.withMarshaller(SyncMultiCloudClusterStatusRequest::getBody,
                SyncMultiCloudClusterStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAgentDaemonsetRequest, UpdateAgentDaemonsetResponse> updateAgentDaemonset =
        genForUpdateAgentDaemonset();

    private static HttpRequestDef<UpdateAgentDaemonsetRequest, UpdateAgentDaemonsetResponse> genForUpdateAgentDaemonset() {
        // basic
        HttpRequestDef.Builder<UpdateAgentDaemonsetRequest, UpdateAgentDaemonsetResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateAgentDaemonsetRequest.class, UpdateAgentDaemonsetResponse.class)
            .withName("UpdateAgentDaemonset")
            .withUri("/v5/{project_id}/container/kubernetes/clusters/{cluster_id}/daemonsets")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAgentDaemonsetRequest::getClusterId,
                UpdateAgentDaemonsetRequest::setClusterId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAgentDaemonsetRequest::getEnterpriseProjectId,
                UpdateAgentDaemonsetRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAgentDaemonsetRequest::getRegion, UpdateAgentDaemonsetRequest::setRegion));
        builder.<UpdateDaemonsetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateDaemonsetRequestBody.class),
            f -> f.withMarshaller(UpdateAgentDaemonsetRequest::getBody, UpdateAgentDaemonsetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMultiCloudClustersRequest, UpdateMultiCloudClustersResponse> updateMultiCloudClusters =
        genForUpdateMultiCloudClusters();

    private static HttpRequestDef<UpdateMultiCloudClustersRequest, UpdateMultiCloudClustersResponse> genForUpdateMultiCloudClusters() {
        // basic
        HttpRequestDef.Builder<UpdateMultiCloudClustersRequest, UpdateMultiCloudClustersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateMultiCloudClustersRequest.class, UpdateMultiCloudClustersResponse.class)
                .withName("UpdateMultiCloudClusters")
                .withUri("/v5/{project_id}/container/kubernetes/multi-cloud/clusters/{cluster_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMultiCloudClustersRequest::getClusterId,
                UpdateMultiCloudClustersRequest::setClusterId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMultiCloudClustersRequest::getEnterpriseProjectId,
                UpdateMultiCloudClustersRequest::setEnterpriseProjectId));
        builder.<UpdateMultiCloudClusterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateMultiCloudClusterRequestBody.class),
            f -> f.withMarshaller(UpdateMultiCloudClustersRequest::getBody, UpdateMultiCloudClustersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFileEventsRequest, ListFileEventsResponse> listFileEvents =
        genForListFileEvents();

    private static HttpRequestDef<ListFileEventsRequest, ListFileEventsResponse> genForListFileEvents() {
        // basic
        HttpRequestDef.Builder<ListFileEventsRequest, ListFileEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFileEventsRequest.class, ListFileEventsResponse.class)
                .withName("ListFileEvents")
                .withUri("/v5/{project_id}/files/change-files")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFileEventsRequest::getEnterpriseProjectId,
                ListFileEventsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFileEventsRequest::getHostName, ListFileEventsRequest::setHostName));
        builder.<Long>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFileEventsRequest::getBeginTime, ListFileEventsRequest::setBeginTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFileEventsRequest::getEndTime, ListFileEventsRequest::setEndTime));
        builder.<String>withRequestField("file_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFileEventsRequest::getFileName, ListFileEventsRequest::setFileName));
        builder.<String>withRequestField("file_path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFileEventsRequest::getFilePath, ListFileEventsRequest::setFilePath));
        builder.<String>withRequestField("change_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFileEventsRequest::getChangeType, ListFileEventsRequest::setChangeType));
        builder.<String>withRequestField("change_category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFileEventsRequest::getChangeCategory, ListFileEventsRequest::setChangeCategory));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFileEventsRequest::getStatus, ListFileEventsRequest::setStatus));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFileEventsRequest::getOffset, ListFileEventsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFileEventsRequest::getLimit, ListFileEventsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFileHostEventDetailsRequest, ListFileHostEventDetailsResponse> listFileHostEventDetails =
        genForListFileHostEventDetails();

    private static HttpRequestDef<ListFileHostEventDetailsRequest, ListFileHostEventDetailsResponse> genForListFileHostEventDetails() {
        // basic
        HttpRequestDef.Builder<ListFileHostEventDetailsRequest, ListFileHostEventDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListFileHostEventDetailsRequest.class, ListFileHostEventDetailsResponse.class)
                .withName("ListFileHostEventDetails")
                .withUri("/v5/{project_id}/{host_id}/files/change-files")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFileHostEventDetailsRequest::getHostId,
                ListFileHostEventDetailsRequest::setHostId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFileHostEventDetailsRequest::getEnterpriseProjectId,
                ListFileHostEventDetailsRequest::setEnterpriseProjectId));
        builder.<Long>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFileHostEventDetailsRequest::getBeginTime,
                ListFileHostEventDetailsRequest::setBeginTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFileHostEventDetailsRequest::getEndTime,
                ListFileHostEventDetailsRequest::setEndTime));
        builder.<String>withRequestField("file_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFileHostEventDetailsRequest::getFileName,
                ListFileHostEventDetailsRequest::setFileName));
        builder.<String>withRequestField("file_path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFileHostEventDetailsRequest::getFilePath,
                ListFileHostEventDetailsRequest::setFilePath));
        builder.<String>withRequestField("change_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFileHostEventDetailsRequest::getChangeType,
                ListFileHostEventDetailsRequest::setChangeType));
        builder.<String>withRequestField("change_category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFileHostEventDetailsRequest::getChangeCategory,
                ListFileHostEventDetailsRequest::setChangeCategory));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFileHostEventDetailsRequest::getStatus,
                ListFileHostEventDetailsRequest::setStatus));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFileHostEventDetailsRequest::getOffset,
                ListFileHostEventDetailsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFileHostEventDetailsRequest::getLimit,
                ListFileHostEventDetailsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFileHostsRequest, ListFileHostsResponse> listFileHosts =
        genForListFileHosts();

    private static HttpRequestDef<ListFileHostsRequest, ListFileHostsResponse> genForListFileHosts() {
        // basic
        HttpRequestDef.Builder<ListFileHostsRequest, ListFileHostsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFileHostsRequest.class, ListFileHostsResponse.class)
                .withName("ListFileHosts")
                .withUri("/v5/{project_id}/files/change-host")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFileHostsRequest::getEnterpriseProjectId,
                ListFileHostsRequest::setEnterpriseProjectId));
        builder.<Long>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFileHostsRequest::getBeginTime, ListFileHostsRequest::setBeginTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFileHostsRequest::getEndTime, ListFileHostsRequest::setEndTime));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFileHostsRequest::getHostName, ListFileHostsRequest::setHostName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFileHostsRequest::getOffset, ListFileHostsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFileHostsRequest::getLimit, ListFileHostsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFileStatisticRequest, ShowFileStatisticResponse> showFileStatistic =
        genForShowFileStatistic();

    private static HttpRequestDef<ShowFileStatisticRequest, ShowFileStatisticResponse> genForShowFileStatistic() {
        // basic
        HttpRequestDef.Builder<ShowFileStatisticRequest, ShowFileStatisticResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFileStatisticRequest.class, ShowFileStatisticResponse.class)
                .withName("ShowFileStatistic")
                .withUri("/v5/{project_id}/files/statistic")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFileStatisticRequest::getEnterpriseProjectId,
                ShowFileStatisticRequest::setEnterpriseProjectId));
        builder.<Long>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowFileStatisticRequest::getBeginTime, ShowFileStatisticRequest::setBeginTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowFileStatisticRequest::getEndTime, ShowFileStatisticRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIacFileRiskPathsRequest, ListIacFileRiskPathsResponse> listIacFileRiskPaths =
        genForListIacFileRiskPaths();

    private static HttpRequestDef<ListIacFileRiskPathsRequest, ListIacFileRiskPathsResponse> genForListIacFileRiskPaths() {
        // basic
        HttpRequestDef.Builder<ListIacFileRiskPathsRequest, ListIacFileRiskPathsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListIacFileRiskPathsRequest.class, ListIacFileRiskPathsResponse.class)
            .withName("ListIacFileRiskPaths")
            .withUri("/v5/{project_id}/container/iac/file/risk/paths")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIacFileRiskPathsRequest::getEnterpriseProjectId,
                ListIacFileRiskPathsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIacFileRiskPathsRequest::getOffset, ListIacFileRiskPathsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIacFileRiskPathsRequest::getLimit, ListIacFileRiskPathsRequest::setLimit));
        builder.<String>withRequestField("file_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIacFileRiskPathsRequest::getFileId, ListIacFileRiskPathsRequest::setFileId));
        builder.<String>withRequestField("rule_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIacFileRiskPathsRequest::getRuleId, ListIacFileRiskPathsRequest::setRuleId));
        builder.<String>withRequestField("resource_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIacFileRiskPathsRequest::getResourceName,
                ListIacFileRiskPathsRequest::setResourceName));
        builder.<String>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIacFileRiskPathsRequest::getResourceType,
                ListIacFileRiskPathsRequest::setResourceType));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIacFileRiskPathsRequest::getNamespace,
                ListIacFileRiskPathsRequest::setNamespace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIacFileRisksRequest, ListIacFileRisksResponse> listIacFileRisks =
        genForListIacFileRisks();

    private static HttpRequestDef<ListIacFileRisksRequest, ListIacFileRisksResponse> genForListIacFileRisks() {
        // basic
        HttpRequestDef.Builder<ListIacFileRisksRequest, ListIacFileRisksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListIacFileRisksRequest.class, ListIacFileRisksResponse.class)
                .withName("ListIacFileRisks")
                .withUri("/v5/{project_id}/container/iac/file/risks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIacFileRisksRequest::getEnterpriseProjectId,
                ListIacFileRisksRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIacFileRisksRequest::getOffset, ListIacFileRisksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIacFileRisksRequest::getLimit, ListIacFileRisksRequest::setLimit));
        builder.<String>withRequestField("file_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIacFileRisksRequest::getFileId, ListIacFileRisksRequest::setFileId));
        builder.<String>withRequestField("risk_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIacFileRisksRequest::getRiskName, ListIacFileRisksRequest::setRiskName));
        builder.<String>withRequestField("risk_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIacFileRisksRequest::getRiskLevel, ListIacFileRisksRequest::setRiskLevel));
        builder.<String>withRequestField("risk_category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIacFileRisksRequest::getRiskCategory, ListIacFileRisksRequest::setRiskCategory));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIacFilesRequest, ListIacFilesResponse> listIacFiles = genForListIacFiles();

    private static HttpRequestDef<ListIacFilesRequest, ListIacFilesResponse> genForListIacFiles() {
        // basic
        HttpRequestDef.Builder<ListIacFilesRequest, ListIacFilesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListIacFilesRequest.class, ListIacFilesResponse.class)
                .withName("ListIacFiles")
                .withUri("/v5/{project_id}/container/iac/files")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIacFilesRequest::getEnterpriseProjectId,
                ListIacFilesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIacFilesRequest::getOffset, ListIacFilesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIacFilesRequest::getLimit, ListIacFilesRequest::setLimit));
        builder.<String>withRequestField("scan_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIacFilesRequest::getScanType, ListIacFilesRequest::setScanType));
        builder.<String>withRequestField("file_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIacFilesRequest::getFileId, ListIacFilesRequest::setFileId));
        builder.<String>withRequestField("file_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIacFilesRequest::getFileName, ListIacFilesRequest::setFileName));
        builder.<String>withRequestField("file_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIacFilesRequest::getFileType, ListIacFilesRequest::setFileType));
        builder.<Boolean>withRequestField("risky",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListIacFilesRequest::getRisky, ListIacFilesRequest::setRisky));
        builder.<String>withRequestField("cicd_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIacFilesRequest::getCicdId, ListIacFilesRequest::setCicdId));
        builder.<String>withRequestField("cicd_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIacFilesRequest::getCicdName, ListIacFilesRequest::setCicdName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTaskRequest, CreateTaskResponse> createTask = genForCreateTask();

    private static HttpRequestDef<CreateTaskRequest, CreateTaskResponse> genForCreateTask() {
        // basic
        HttpRequestDef.Builder<CreateTaskRequest, CreateTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTaskRequest.class, CreateTaskResponse.class)
                .withName("CreateTask")
                .withUri("/v5/{project_id}/common/task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTaskRequest::getEnterpriseProjectId,
                CreateTaskRequest::setEnterpriseProjectId));
        builder.<CreateTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTaskRequestBody.class),
            f -> f.withMarshaller(CreateTaskRequest::getBody, CreateTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTaskResourcesRequest, ListTaskResourcesResponse> listTaskResources =
        genForListTaskResources();

    private static HttpRequestDef<ListTaskResourcesRequest, ListTaskResourcesResponse> genForListTaskResources() {
        // basic
        HttpRequestDef.Builder<ListTaskResourcesRequest, ListTaskResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListTaskResourcesRequest.class, ListTaskResourcesResponse.class)
                .withName("ListTaskResources")
                .withUri("/v5/{project_id}/common/tasks/{task_id}/resources/batch-query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTaskResourcesRequest::getTaskId, ListTaskResourcesRequest::setTaskId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTaskResourcesRequest::getEnterpriseProjectId,
                ListTaskResourcesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTaskResourcesRequest::getOffset, ListTaskResourcesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTaskResourcesRequest::getLimit, ListTaskResourcesRequest::setLimit));
        builder.<ListTaskResourcesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTaskResourcesRequestBody.class),
            f -> f.withMarshaller(ListTaskResourcesRequest::getBody, ListTaskResourcesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTasksRequest, ListTasksResponse> listTasks = genForListTasks();

    private static HttpRequestDef<ListTasksRequest, ListTasksResponse> genForListTasks() {
        // basic
        HttpRequestDef.Builder<ListTasksRequest, ListTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListTasksRequest.class, ListTasksResponse.class)
                .withName("ListTasks")
                .withUri("/v5/{project_id}/common/tasks/batch-query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getEnterpriseProjectId, ListTasksRequest::setEnterpriseProjectId));
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
        builder.<ListTasksRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListTasksRequestBody.class),
            f -> f.withMarshaller(ListTasksRequest::getBody, ListTasksRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskStatisticsRequest, ShowTaskStatisticsResponse> showTaskStatistics =
        genForShowTaskStatistics();

    private static HttpRequestDef<ShowTaskStatisticsRequest, ShowTaskStatisticsResponse> genForShowTaskStatistics() {
        // basic
        HttpRequestDef.Builder<ShowTaskStatisticsRequest, ShowTaskStatisticsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTaskStatisticsRequest.class, ShowTaskStatisticsResponse.class)
                .withName("ShowTaskStatistics")
                .withUri("/v5/{project_id}/common/task-statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskStatisticsRequest::getEnterpriseProjectId,
                ShowTaskStatisticsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("task_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskStatisticsRequest::getTaskType, ShowTaskStatisticsRequest::setTaskType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeVulScanPolicyRequest, ChangeVulScanPolicyResponse> changeVulScanPolicy =
        genForChangeVulScanPolicy();

    private static HttpRequestDef<ChangeVulScanPolicyRequest, ChangeVulScanPolicyResponse> genForChangeVulScanPolicy() {
        // basic
        HttpRequestDef.Builder<ChangeVulScanPolicyRequest, ChangeVulScanPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeVulScanPolicyRequest.class, ChangeVulScanPolicyResponse.class)
                .withName("ChangeVulScanPolicy")
                .withUri("/v5/{project_id}/vulnerability/scan-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeVulScanPolicyRequest::getEnterpriseProjectId,
                ChangeVulScanPolicyRequest::setEnterpriseProjectId));
        builder.<ChangeVulScanPolicyRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeVulScanPolicyRequestInfo.class),
            f -> f.withMarshaller(ChangeVulScanPolicyRequest::getBody, ChangeVulScanPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVulnerabilityScanTaskRequest, CreateVulnerabilityScanTaskResponse> createVulnerabilityScanTask =
        genForCreateVulnerabilityScanTask();

    private static HttpRequestDef<CreateVulnerabilityScanTaskRequest, CreateVulnerabilityScanTaskResponse> genForCreateVulnerabilityScanTask() {
        // basic
        HttpRequestDef.Builder<CreateVulnerabilityScanTaskRequest, CreateVulnerabilityScanTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateVulnerabilityScanTaskRequest.class,
                    CreateVulnerabilityScanTaskResponse.class)
                .withName("CreateVulnerabilityScanTask")
                .withUri("/v5/{project_id}/vulnerability/scan-task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVulnerabilityScanTaskRequest::getEnterpriseProjectId,
                CreateVulnerabilityScanTaskRequest::setEnterpriseProjectId));
        builder.<ManualVulScanRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ManualVulScanRequestInfo.class),
            f -> f.withMarshaller(CreateVulnerabilityScanTaskRequest::getBody,
                CreateVulnerabilityScanTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportHandledVulnerabilitiesRequest, ExportHandledVulnerabilitiesResponse> exportHandledVulnerabilities =
        genForExportHandledVulnerabilities();

    private static HttpRequestDef<ExportHandledVulnerabilitiesRequest, ExportHandledVulnerabilitiesResponse> genForExportHandledVulnerabilities() {
        // basic
        HttpRequestDef.Builder<ExportHandledVulnerabilitiesRequest, ExportHandledVulnerabilitiesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ExportHandledVulnerabilitiesRequest.class,
                    ExportHandledVulnerabilitiesResponse.class)
                .withName("ExportHandledVulnerabilities")
                .withUri("/v5/{project_id}/vulnerability/history/export-task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportHandledVulnerabilitiesRequest::getEnterpriseProjectId,
                ExportHandledVulnerabilitiesRequest::setEnterpriseProjectId));
        builder.<ExportHandledVulnerabilitiesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportHandledVulnerabilitiesRequestBody.class),
            f -> f.withMarshaller(ExportHandledVulnerabilitiesRequest::getBody,
                ExportHandledVulnerabilitiesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportVulHandleHistoryRequest, ExportVulHandleHistoryResponse> exportVulHandleHistory =
        genForExportVulHandleHistory();

    private static HttpRequestDef<ExportVulHandleHistoryRequest, ExportVulHandleHistoryResponse> genForExportVulHandleHistory() {
        // basic
        HttpRequestDef.Builder<ExportVulHandleHistoryRequest, ExportVulHandleHistoryResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ExportVulHandleHistoryRequest.class, ExportVulHandleHistoryResponse.class)
            .withName("ExportVulHandleHistory")
            .withUri("/v5/{project_id}/vulnerability/handle-history/export-task")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportVulHandleHistoryRequest::getEnterpriseProjectId,
                ExportVulHandleHistoryRequest::setEnterpriseProjectId));
        builder.<ExportVulHandleHistoryRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportVulHandleHistoryRequestBody.class),
            f -> f.withMarshaller(ExportVulHandleHistoryRequest::getBody, ExportVulHandleHistoryRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportVulsRequest, ExportVulsResponse> exportVuls = genForExportVuls();

    private static HttpRequestDef<ExportVulsRequest, ExportVulsResponse> genForExportVuls() {
        // basic
        HttpRequestDef.Builder<ExportVulsRequest, ExportVulsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportVulsRequest.class, ExportVulsResponse.class)
                .withName("ExportVuls")
                .withUri("/v5/{project_id}/vul/export")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportVulsRequest::getEnterpriseProjectId,
                ExportVulsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportVulsRequest::getType, ExportVulsRequest::setType));
        builder.<String>withRequestField("vul_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportVulsRequest::getVulId, ExportVulsRequest::setVulId));
        builder.<String>withRequestField("vul_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportVulsRequest::getVulName, ExportVulsRequest::setVulName));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportVulsRequest::getHostId, ExportVulsRequest::setHostId));
        builder.<Integer>withRequestField("export_size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportVulsRequest::getExportSize, ExportVulsRequest::setExportSize));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportVulsRequest::getCategory, ExportVulsRequest::setCategory));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportVulsRequest::getLimit, ExportVulsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportVulsRequest::getOffset, ExportVulsRequest::setOffset));
        builder.<String>withRequestField("repair_priority",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportVulsRequest::getRepairPriority, ExportVulsRequest::setRepairPriority));
        builder.<String>withRequestField("handle_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportVulsRequest::getHandleStatus, ExportVulsRequest::setHandleStatus));
        builder.<String>withRequestField("cve_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportVulsRequest::getCveId, ExportVulsRequest::setCveId));
        builder.<String>withRequestField("label_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportVulsRequest::getLabelList, ExportVulsRequest::setLabelList));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportVulsRequest::getStatus, ExportVulsRequest::setStatus));
        builder.<String>withRequestField("asset_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportVulsRequest::getAssetValue, ExportVulsRequest::setAssetValue));
        builder.<String>withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportVulsRequest::getGroupName, ExportVulsRequest::setGroupName));
        builder.<ExportVulRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportVulRequestBody.class),
            f -> f.withMarshaller(ExportVulsRequest::getBody, ExportVulsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostVulsRequest, ListHostVulsResponse> listHostVuls = genForListHostVuls();

    private static HttpRequestDef<ListHostVulsRequest, ListHostVulsResponse> genForListHostVuls() {
        // basic
        HttpRequestDef.Builder<ListHostVulsRequest, ListHostVulsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHostVulsRequest.class, ListHostVulsResponse.class)
                .withName("ListHostVuls")
                .withUri("/v5/{project_id}/vulnerability/host/{host_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostVulsRequest::getHostId, ListHostVulsRequest::setHostId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostVulsRequest::getEnterpriseProjectId,
                ListHostVulsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostVulsRequest::getLimit, ListHostVulsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostVulsRequest::getOffset, ListHostVulsRequest::setOffset));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostVulsRequest::getType, ListHostVulsRequest::setType));
        builder.<String>withRequestField("vul_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostVulsRequest::getVulName, ListHostVulsRequest::setVulName));
        builder.<String>withRequestField("handle_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostVulsRequest::getHandleStatus, ListHostVulsRequest::setHandleStatus));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostVulsRequest::getStatus, ListHostVulsRequest::setStatus));
        builder.<String>withRequestField("repair_priority",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostVulsRequest::getRepairPriority, ListHostVulsRequest::setRepairPriority));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVulContainerAppsRequest, ListVulContainerAppsResponse> listVulContainerApps =
        genForListVulContainerApps();

    private static HttpRequestDef<ListVulContainerAppsRequest, ListVulContainerAppsResponse> genForListVulContainerApps() {
        // basic
        HttpRequestDef.Builder<ListVulContainerAppsRequest, ListVulContainerAppsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListVulContainerAppsRequest.class, ListVulContainerAppsResponse.class)
            .withName("ListVulContainerApps")
            .withUri("/v5/{project_id}/vulnerability/container/apps")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulContainerAppsRequest::getEnterpriseProjectId,
                ListVulContainerAppsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("container_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulContainerAppsRequest::getContainerId,
                ListVulContainerAppsRequest::setContainerId));
        builder.<String>withRequestField("vul_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulContainerAppsRequest::getVulId, ListVulContainerAppsRequest::setVulId));
        builder.<String>withRequestField("handle_status",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulContainerAppsRequest::getHandleStatus,
                ListVulContainerAppsRequest::setHandleStatus));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVulContainerAppsRequest::getLimit, ListVulContainerAppsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVulContainerAppsRequest::getOffset, ListVulContainerAppsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVulContainersRequest, ListVulContainersResponse> listVulContainers =
        genForListVulContainers();

    private static HttpRequestDef<ListVulContainersRequest, ListVulContainersResponse> genForListVulContainers() {
        // basic
        HttpRequestDef.Builder<ListVulContainersRequest, ListVulContainersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVulContainersRequest.class, ListVulContainersResponse.class)
                .withName("ListVulContainers")
                .withUri("/v5/{project_id}/vulnerability/containers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulContainersRequest::getEnterpriseProjectId,
                ListVulContainersRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("vul_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulContainersRequest::getVulId, ListVulContainersRequest::setVulId));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulContainersRequest::getType, ListVulContainersRequest::setType));
        builder.<String>withRequestField("container_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulContainersRequest::getContainerName,
                ListVulContainersRequest::setContainerName));
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulContainersRequest::getClusterId, ListVulContainersRequest::setClusterId));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulContainersRequest::getStatus, ListVulContainersRequest::setStatus));
        builder.<String>withRequestField("handle_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulContainersRequest::getHandleStatus,
                ListVulContainersRequest::setHandleStatus));
        builder.<String>withRequestField("severity_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulContainersRequest::getSeverityLevel,
                ListVulContainersRequest::setSeverityLevel));
        builder.<Long>withRequestField("min_scan_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListVulContainersRequest::getMinScanTime, ListVulContainersRequest::setMinScanTime));
        builder.<Long>withRequestField("max_scan_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListVulContainersRequest::getMaxScanTime, ListVulContainersRequest::setMaxScanTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVulContainersRequest::getLimit, ListVulContainersRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVulContainersRequest::getOffset, ListVulContainersRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVulHostsRequest, ListVulHostsResponse> listVulHosts = genForListVulHosts();

    private static HttpRequestDef<ListVulHostsRequest, ListVulHostsResponse> genForListVulHosts() {
        // basic
        HttpRequestDef.Builder<ListVulHostsRequest, ListVulHostsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVulHostsRequest.class, ListVulHostsResponse.class)
                .withName("ListVulHosts")
                .withUri("/v5/{project_id}/vulnerability/hosts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHostsRequest::getEnterpriseProjectId,
                ListVulHostsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVulHostsRequest::getLimit, ListVulHostsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVulHostsRequest::getOffset, ListVulHostsRequest::setOffset));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHostsRequest::getHostName, ListVulHostsRequest::setHostName));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHostsRequest::getHostIp, ListVulHostsRequest::setHostIp));
        builder.<String>withRequestField("vul_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHostsRequest::getVulId, ListVulHostsRequest::setVulId));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHostsRequest::getType, ListVulHostsRequest::setType));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHostsRequest::getStatus, ListVulHostsRequest::setStatus));
        builder.<String>withRequestField("asset_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHostsRequest::getAssetValue, ListVulHostsRequest::setAssetValue));
        builder.<String>withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHostsRequest::getGroupName, ListVulHostsRequest::setGroupName));
        builder.<String>withRequestField("handle_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHostsRequest::getHandleStatus, ListVulHostsRequest::setHandleStatus));
        builder.<String>withRequestField("severity_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHostsRequest::getSeverityLevel, ListVulHostsRequest::setSeverityLevel));
        builder.<Boolean>withRequestField("is_affect_business",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListVulHostsRequest::getIsAffectBusiness, ListVulHostsRequest::setIsAffectBusiness));
        builder.<String>withRequestField("repair_priority",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulHostsRequest::getRepairPriority, ListVulHostsRequest::setRepairPriority));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVulScanTaskRequest, ListVulScanTaskResponse> listVulScanTask =
        genForListVulScanTask();

    private static HttpRequestDef<ListVulScanTaskRequest, ListVulScanTaskResponse> genForListVulScanTask() {
        // basic
        HttpRequestDef.Builder<ListVulScanTaskRequest, ListVulScanTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVulScanTaskRequest.class, ListVulScanTaskResponse.class)
                .withName("ListVulScanTask")
                .withUri("/v5/{project_id}/vulnerability/scan-tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulScanTaskRequest::getEnterpriseProjectId,
                ListVulScanTaskRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVulScanTaskRequest::getLimit, ListVulScanTaskRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVulScanTaskRequest::getOffset, ListVulScanTaskRequest::setOffset));
        builder.<String>withRequestField("scan_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulScanTaskRequest::getScanType, ListVulScanTaskRequest::setScanType));
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulScanTaskRequest::getTaskId, ListVulScanTaskRequest::setTaskId));
        builder.<Long>withRequestField("min_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListVulScanTaskRequest::getMinStartTime, ListVulScanTaskRequest::setMinStartTime));
        builder.<Long>withRequestField("max_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListVulScanTaskRequest::getMaxStartTime, ListVulScanTaskRequest::setMaxStartTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVulScanTaskHostRequest, ListVulScanTaskHostResponse> listVulScanTaskHost =
        genForListVulScanTaskHost();

    private static HttpRequestDef<ListVulScanTaskHostRequest, ListVulScanTaskHostResponse> genForListVulScanTaskHost() {
        // basic
        HttpRequestDef.Builder<ListVulScanTaskHostRequest, ListVulScanTaskHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVulScanTaskHostRequest.class, ListVulScanTaskHostResponse.class)
                .withName("ListVulScanTaskHost")
                .withUri("/v5/{project_id}/vulnerability/scan-task/{task_id}/hosts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulScanTaskHostRequest::getTaskId, ListVulScanTaskHostRequest::setTaskId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulScanTaskHostRequest::getEnterpriseProjectId,
                ListVulScanTaskHostRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVulScanTaskHostRequest::getLimit, ListVulScanTaskHostRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVulScanTaskHostRequest::getOffset, ListVulScanTaskHostRequest::setOffset));
        builder.<String>withRequestField("scan_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulScanTaskHostRequest::getScanStatus,
                ListVulScanTaskHostRequest::setScanStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVulnerabilitiesRequest, ListVulnerabilitiesResponse> listVulnerabilities =
        genForListVulnerabilities();

    private static HttpRequestDef<ListVulnerabilitiesRequest, ListVulnerabilitiesResponse> genForListVulnerabilities() {
        // basic
        HttpRequestDef.Builder<ListVulnerabilitiesRequest, ListVulnerabilitiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVulnerabilitiesRequest.class, ListVulnerabilitiesResponse.class)
                .withName("ListVulnerabilities")
                .withUri("/v5/{project_id}/vulnerability/vulnerabilities")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getEnterpriseProjectId,
                ListVulnerabilitiesRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getType, ListVulnerabilitiesRequest::setType));
        builder.<String>withRequestField("vul_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getVulId, ListVulnerabilitiesRequest::setVulId));
        builder.<String>withRequestField("vul_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getVulName, ListVulnerabilitiesRequest::setVulName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getLimit, ListVulnerabilitiesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getOffset, ListVulnerabilitiesRequest::setOffset));
        builder.<String>withRequestField("repair_priority",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getRepairPriority,
                ListVulnerabilitiesRequest::setRepairPriority));
        builder.<String>withRequestField("handle_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getHandleStatus,
                ListVulnerabilitiesRequest::setHandleStatus));
        builder.<String>withRequestField("cve_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getCveId, ListVulnerabilitiesRequest::setCveId));
        builder.<String>withRequestField("label_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getLabelList, ListVulnerabilitiesRequest::setLabelList));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getStatus, ListVulnerabilitiesRequest::setStatus));
        builder.<String>withRequestField("asset_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getAssetValue,
                ListVulnerabilitiesRequest::setAssetValue));
        builder.<String>withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVulnerabilitiesRequest::getGroupName, ListVulnerabilitiesRequest::setGroupName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecordUserViewVulTaskRequest, RecordUserViewVulTaskResponse> recordUserViewVulTask =
        genForRecordUserViewVulTask();

    private static HttpRequestDef<RecordUserViewVulTaskRequest, RecordUserViewVulTaskResponse> genForRecordUserViewVulTask() {
        // basic
        HttpRequestDef.Builder<RecordUserViewVulTaskRequest, RecordUserViewVulTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RecordUserViewVulTaskRequest.class, RecordUserViewVulTaskResponse.class)
            .withName("RecordUserViewVulTask")
            .withUri("/v5/{project_id}/vulnerability/task/user/trace")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecordUserViewVulTaskRequest::getEnterpriseProjectId,
                RecordUserViewVulTaskRequest::setEnterpriseProjectId));
        builder.<RecordUserViewVulTaskRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RecordUserViewVulTaskRequestInfo.class),
            f -> f.withMarshaller(RecordUserViewVulTaskRequest::getBody, RecordUserViewVulTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVulScanPolicyRequest, ShowVulScanPolicyResponse> showVulScanPolicy =
        genForShowVulScanPolicy();

    private static HttpRequestDef<ShowVulScanPolicyRequest, ShowVulScanPolicyResponse> genForShowVulScanPolicy() {
        // basic
        HttpRequestDef.Builder<ShowVulScanPolicyRequest, ShowVulScanPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVulScanPolicyRequest.class, ShowVulScanPolicyResponse.class)
                .withName("ShowVulScanPolicy")
                .withUri("/v5/{project_id}/vulnerability/scan-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVulScanPolicyRequest::getEnterpriseProjectId,
                ShowVulScanPolicyRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVulStaticsRequest, ShowVulStaticsResponse> showVulStatics =
        genForShowVulStatics();

    private static HttpRequestDef<ShowVulStaticsRequest, ShowVulStaticsResponse> genForShowVulStatics() {
        // basic
        HttpRequestDef.Builder<ShowVulStaticsRequest, ShowVulStaticsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVulStaticsRequest.class, ShowVulStaticsResponse.class)
                .withName("ShowVulStatics")
                .withUri("/v5/{project_id}/vulnerability/statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVulStaticsRequest::getEnterpriseProjectId,
                ShowVulStaticsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVulTaskStatisticsRequest, ShowVulTaskStatisticsResponse> showVulTaskStatistics =
        genForShowVulTaskStatistics();

    private static HttpRequestDef<ShowVulTaskStatisticsRequest, ShowVulTaskStatisticsResponse> genForShowVulTaskStatistics() {
        // basic
        HttpRequestDef.Builder<ShowVulTaskStatisticsRequest, ShowVulTaskStatisticsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowVulTaskStatisticsRequest.class, ShowVulTaskStatisticsResponse.class)
            .withName("ShowVulTaskStatistics")
            .withUri("/v5/{project_id}/vulnerability/task/statistics")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVulTaskStatisticsRequest::getEnterpriseProjectId,
                ShowVulTaskStatisticsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchStartWebTamperProtectionRequest, BatchStartWebTamperProtectionResponse> batchStartWebTamperProtection =
        genForBatchStartWebTamperProtection();

    private static HttpRequestDef<BatchStartWebTamperProtectionRequest, BatchStartWebTamperProtectionResponse> genForBatchStartWebTamperProtection() {
        // basic
        HttpRequestDef.Builder<BatchStartWebTamperProtectionRequest, BatchStartWebTamperProtectionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchStartWebTamperProtectionRequest.class,
                    BatchStartWebTamperProtectionResponse.class)
                .withName("BatchStartWebTamperProtection")
                .withUri("/v5/{project_id}/webtamper/protection/batch-open")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchStartWebTamperProtectionRequest::getEnterpriseProjectId,
                BatchStartWebTamperProtectionRequest::setEnterpriseProjectId));
        builder.<BatchStartWebTamperProtectionRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchStartWebTamperProtectionRequestInfo.class),
            f -> f.withMarshaller(BatchStartWebTamperProtectionRequest::getBody,
                BatchStartWebTamperProtectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportWebTamperHostRequest, ExportWebTamperHostResponse> exportWebTamperHost =
        genForExportWebTamperHost();

    private static HttpRequestDef<ExportWebTamperHostRequest, ExportWebTamperHostResponse> genForExportWebTamperHost() {
        // basic
        HttpRequestDef.Builder<ExportWebTamperHostRequest, ExportWebTamperHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportWebTamperHostRequest.class, ExportWebTamperHostResponse.class)
                .withName("ExportWebTamperHost")
                .withUri("/v5/{project_id}/webtamper/host/export")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportWebTamperHostRequest::getEnterpriseProjectId,
                ExportWebTamperHostRequest::setEnterpriseProjectId));
        builder.<ExportWebTamperHostRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportWebTamperHostRequestInfo.class),
            f -> f.withMarshaller(ExportWebTamperHostRequest::getBody, ExportWebTamperHostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostProtectHistoryInfoRequest, ListHostProtectHistoryInfoResponse> listHostProtectHistoryInfo =
        genForListHostProtectHistoryInfo();

    private static HttpRequestDef<ListHostProtectHistoryInfoRequest, ListHostProtectHistoryInfoResponse> genForListHostProtectHistoryInfo() {
        // basic
        HttpRequestDef.Builder<ListHostProtectHistoryInfoRequest, ListHostProtectHistoryInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListHostProtectHistoryInfoRequest.class,
                    ListHostProtectHistoryInfoResponse.class)
                .withName("ListHostProtectHistoryInfo")
                .withUri("/v5/{project_id}/webtamper/static/protect-history")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostProtectHistoryInfoRequest::getEnterpriseProjectId,
                ListHostProtectHistoryInfoRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostProtectHistoryInfoRequest::getHostId,
                ListHostProtectHistoryInfoRequest::setHostId));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListHostProtectHistoryInfoRequest::getStartTime,
                ListHostProtectHistoryInfoRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListHostProtectHistoryInfoRequest::getEndTime,
                ListHostProtectHistoryInfoRequest::setEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostProtectHistoryInfoRequest::getLimit,
                ListHostProtectHistoryInfoRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostProtectHistoryInfoRequest::getOffset,
                ListHostProtectHistoryInfoRequest::setOffset));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostProtectHistoryInfoRequest::getHostName,
                ListHostProtectHistoryInfoRequest::setHostName));
        builder.<String>withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostProtectHistoryInfoRequest::getHostIp,
                ListHostProtectHistoryInfoRequest::setHostIp));
        builder.<String>withRequestField("file_path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostProtectHistoryInfoRequest::getFilePath,
                ListHostProtectHistoryInfoRequest::setFilePath));
        builder.<String>withRequestField("file_operation",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostProtectHistoryInfoRequest::getFileOperation,
                ListHostProtectHistoryInfoRequest::setFileOperation));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostProtectHistoryInfoRequest::getRegion,
                ListHostProtectHistoryInfoRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostRaspProtectHistoryInfoRequest, ListHostRaspProtectHistoryInfoResponse> listHostRaspProtectHistoryInfo =
        genForListHostRaspProtectHistoryInfo();

    private static HttpRequestDef<ListHostRaspProtectHistoryInfoRequest, ListHostRaspProtectHistoryInfoResponse> genForListHostRaspProtectHistoryInfo() {
        // basic
        HttpRequestDef.Builder<ListHostRaspProtectHistoryInfoRequest, ListHostRaspProtectHistoryInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListHostRaspProtectHistoryInfoRequest.class,
                    ListHostRaspProtectHistoryInfoResponse.class)
                .withName("ListHostRaspProtectHistoryInfo")
                .withUri("/v5/{project_id}/webtamper/rasp/protect-history")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostRaspProtectHistoryInfoRequest::getEnterpriseProjectId,
                ListHostRaspProtectHistoryInfoRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostRaspProtectHistoryInfoRequest::getHostId,
                ListHostRaspProtectHistoryInfoRequest::setHostId));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListHostRaspProtectHistoryInfoRequest::getStartTime,
                ListHostRaspProtectHistoryInfoRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListHostRaspProtectHistoryInfoRequest::getEndTime,
                ListHostRaspProtectHistoryInfoRequest::setEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostRaspProtectHistoryInfoRequest::getLimit,
                ListHostRaspProtectHistoryInfoRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostRaspProtectHistoryInfoRequest::getOffset,
                ListHostRaspProtectHistoryInfoRequest::setOffset));
        builder.<Integer>withRequestField("alarm_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostRaspProtectHistoryInfoRequest::getAlarmLevel,
                ListHostRaspProtectHistoryInfoRequest::setAlarmLevel));
        builder.<String>withRequestField("severity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostRaspProtectHistoryInfoRequest::getSeverity,
                ListHostRaspProtectHistoryInfoRequest::setSeverity));
        builder.<String>withRequestField("protect_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostRaspProtectHistoryInfoRequest::getProtectStatus,
                ListHostRaspProtectHistoryInfoRequest::setProtectStatus));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostRaspProtectHistoryInfoRequest::getRegion,
                ListHostRaspProtectHistoryInfoRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWebTamperHostRequest, ListWebTamperHostResponse> listWebTamperHost =
        genForListWebTamperHost();

    private static HttpRequestDef<ListWebTamperHostRequest, ListWebTamperHostResponse> genForListWebTamperHost() {
        // basic
        HttpRequestDef.Builder<ListWebTamperHostRequest, ListWebTamperHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWebTamperHostRequest.class, ListWebTamperHostResponse.class)
                .withName("ListWebTamperHost")
                .withUri("/v5/{project_id}/webtamper/host-management/hosts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebTamperHostRequest::getEnterpriseProjectId,
                ListWebTamperHostRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWebTamperHostRequest::getOffset, ListWebTamperHostRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWebTamperHostRequest::getLimit, ListWebTamperHostRequest::setLimit));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebTamperHostRequest::getHostId, ListWebTamperHostRequest::setHostId));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebTamperHostRequest::getHostName, ListWebTamperHostRequest::setHostName));
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebTamperHostRequest::getPrivateIp, ListWebTamperHostRequest::setPrivateIp));
        builder.<String>withRequestField("public_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebTamperHostRequest::getPublicIp, ListWebTamperHostRequest::setPublicIp));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebTamperHostRequest::getGroupId, ListWebTamperHostRequest::setGroupId));
        builder.<String>withRequestField("os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebTamperHostRequest::getOsType, ListWebTamperHostRequest::setOsType));
        builder.<String>withRequestField("web_app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWebTamperHostRequest::getWebAppName, ListWebTamperHostRequest::setWebAppName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWtpProtectHostRequest, ListWtpProtectHostResponse> listWtpProtectHost =
        genForListWtpProtectHost();

    private static HttpRequestDef<ListWtpProtectHostRequest, ListWtpProtectHostResponse> genForListWtpProtectHost() {
        // basic
        HttpRequestDef.Builder<ListWtpProtectHostRequest, ListWtpProtectHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWtpProtectHostRequest.class, ListWtpProtectHostResponse.class)
                .withName("ListWtpProtectHost")
                .withUri("/v5/{project_id}/webtamper/hosts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWtpProtectHostRequest::getEnterpriseProjectId,
                ListWtpProtectHostRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWtpProtectHostRequest::getHostName, ListWtpProtectHostRequest::setHostName));
        builder.<String>withRequestField("host_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWtpProtectHostRequest::getHostId, ListWtpProtectHostRequest::setHostId));
        builder.<String>withRequestField("public_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWtpProtectHostRequest::getPublicIp, ListWtpProtectHostRequest::setPublicIp));
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWtpProtectHostRequest::getPrivateIp, ListWtpProtectHostRequest::setPrivateIp));
        builder.<String>withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWtpProtectHostRequest::getGroupName, ListWtpProtectHostRequest::setGroupName));
        builder.<String>withRequestField("os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWtpProtectHostRequest::getOsType, ListWtpProtectHostRequest::setOsType));
        builder.<String>withRequestField("protect_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWtpProtectHostRequest::getProtectStatus,
                ListWtpProtectHostRequest::setProtectStatus));
        builder.<String>withRequestField("wtp_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWtpProtectHostRequest::getWtpStatus, ListWtpProtectHostRequest::setWtpStatus));
        builder.<String>withRequestField("agent_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWtpProtectHostRequest::getAgentStatus,
                ListWtpProtectHostRequest::setAgentStatus));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWtpProtectHostRequest::getLimit, ListWtpProtectHostRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWtpProtectHostRequest::getOffset, ListWtpProtectHostRequest::setOffset));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWtpProtectHostRequest::getRegion, ListWtpProtectHostRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetRaspSwitchRequest, SetRaspSwitchResponse> setRaspSwitch =
        genForSetRaspSwitch();

    private static HttpRequestDef<SetRaspSwitchRequest, SetRaspSwitchResponse> genForSetRaspSwitch() {
        // basic
        HttpRequestDef.Builder<SetRaspSwitchRequest, SetRaspSwitchResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SetRaspSwitchRequest.class, SetRaspSwitchResponse.class)
                .withName("SetRaspSwitch")
                .withUri("/v5/{project_id}/webtamper/rasp/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetRaspSwitchRequest::getEnterpriseProjectId,
                SetRaspSwitchRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetRaspSwitchRequest::getRegion, SetRaspSwitchRequest::setRegion));
        builder.<SetRaspSwitchRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetRaspSwitchRequestInfo.class),
            f -> f.withMarshaller(SetRaspSwitchRequest::getBody, SetRaspSwitchRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetWtpProtectionStatusInfoRequest, SetWtpProtectionStatusInfoResponse> setWtpProtectionStatusInfo =
        genForSetWtpProtectionStatusInfo();

    private static HttpRequestDef<SetWtpProtectionStatusInfoRequest, SetWtpProtectionStatusInfoResponse> genForSetWtpProtectionStatusInfo() {
        // basic
        HttpRequestDef.Builder<SetWtpProtectionStatusInfoRequest, SetWtpProtectionStatusInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    SetWtpProtectionStatusInfoRequest.class,
                    SetWtpProtectionStatusInfoResponse.class)
                .withName("SetWtpProtectionStatusInfo")
                .withUri("/v5/{project_id}/webtamper/static/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetWtpProtectionStatusInfoRequest::getEnterpriseProjectId,
                SetWtpProtectionStatusInfoRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetWtpProtectionStatusInfoRequest::getRegion,
                SetWtpProtectionStatusInfoRequest::setRegion));
        builder.<SetWtpProtectionStatusRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetWtpProtectionStatusRequestInfo.class),
            f -> f.withMarshaller(SetWtpProtectionStatusInfoRequest::getBody,
                SetWtpProtectionStatusInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWebTamperHostPolicyRequest, ShowWebTamperHostPolicyResponse> showWebTamperHostPolicy =
        genForShowWebTamperHostPolicy();

    private static HttpRequestDef<ShowWebTamperHostPolicyRequest, ShowWebTamperHostPolicyResponse> genForShowWebTamperHostPolicy() {
        // basic
        HttpRequestDef.Builder<ShowWebTamperHostPolicyRequest, ShowWebTamperHostPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowWebTamperHostPolicyRequest.class, ShowWebTamperHostPolicyResponse.class)
            .withName("ShowWebTamperHostPolicy")
            .withUri("/v5/{project_id}/webtamper/{host_id}/policy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWebTamperHostPolicyRequest::getHostId,
                ShowWebTamperHostPolicyRequest::setHostId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWebTamperHostPolicyRequest::getEnterpriseProjectId,
                ShowWebTamperHostPolicyRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWebTamperRaspPathRequest, ShowWebTamperRaspPathResponse> showWebTamperRaspPath =
        genForShowWebTamperRaspPath();

    private static HttpRequestDef<ShowWebTamperRaspPathRequest, ShowWebTamperRaspPathResponse> genForShowWebTamperRaspPath() {
        // basic
        HttpRequestDef.Builder<ShowWebTamperRaspPathRequest, ShowWebTamperRaspPathResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowWebTamperRaspPathRequest.class, ShowWebTamperRaspPathResponse.class)
            .withName("ShowWebTamperRaspPath")
            .withUri("/v5/{project_id}/wtp/{host_id}/rasp-path")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWebTamperRaspPathRequest::getHostId, ShowWebTamperRaspPathRequest::setHostId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWebTamperRaspPathRequest::getEnterpriseProjectId,
                ShowWebTamperRaspPathRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWebTamperRaspPathRequest::getHostName,
                ShowWebTamperRaspPathRequest::setHostName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWebTamperHostPolicyRequest, UpdateWebTamperHostPolicyResponse> updateWebTamperHostPolicy =
        genForUpdateWebTamperHostPolicy();

    private static HttpRequestDef<UpdateWebTamperHostPolicyRequest, UpdateWebTamperHostPolicyResponse> genForUpdateWebTamperHostPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateWebTamperHostPolicyRequest, UpdateWebTamperHostPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateWebTamperHostPolicyRequest.class,
                    UpdateWebTamperHostPolicyResponse.class)
                .withName("UpdateWebTamperHostPolicy")
                .withUri("/v5/{project_id}/webtamper/{host_id}/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWebTamperHostPolicyRequest::getHostId,
                UpdateWebTamperHostPolicyRequest::setHostId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWebTamperHostPolicyRequest::getEnterpriseProjectId,
                UpdateWebTamperHostPolicyRequest::setEnterpriseProjectId));
        builder.<UpdateWebTamperHostPolicyRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateWebTamperHostPolicyRequestInfo.class),
            f -> f.withMarshaller(UpdateWebTamperHostPolicyRequest::getBody,
                UpdateWebTamperHostPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWebTamperRaspPathRequest, UpdateWebTamperRaspPathResponse> updateWebTamperRaspPath =
        genForUpdateWebTamperRaspPath();

    private static HttpRequestDef<UpdateWebTamperRaspPathRequest, UpdateWebTamperRaspPathResponse> genForUpdateWebTamperRaspPath() {
        // basic
        HttpRequestDef.Builder<UpdateWebTamperRaspPathRequest, UpdateWebTamperRaspPathResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateWebTamperRaspPathRequest.class, UpdateWebTamperRaspPathResponse.class)
            .withName("UpdateWebTamperRaspPath")
            .withUri("/v5/{project_id}/wtp/{host_id}/rasp-path")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWebTamperRaspPathRequest::getHostId,
                UpdateWebTamperRaspPathRequest::setHostId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWebTamperRaspPathRequest::getEnterpriseProjectId,
                UpdateWebTamperRaspPathRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWebTamperRaspPathRequest::getHostName,
                UpdateWebTamperRaspPathRequest::setHostName));
        builder.<UpdateWebTamperRaspPathRequestInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateWebTamperRaspPathRequestInfo.class),
            f -> f.withMarshaller(UpdateWebTamperRaspPathRequest::getBody, UpdateWebTamperRaspPathRequest::setBody));

        // response

        return builder.build();
    }

}

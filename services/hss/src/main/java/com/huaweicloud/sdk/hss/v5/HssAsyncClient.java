package com.huaweicloud.sdk.hss.v5;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.hss.v5.model.AddCceIntegrationProtectionRequest;
import com.huaweicloud.sdk.hss.v5.model.AddCceIntegrationProtectionResponse;
import com.huaweicloud.sdk.hss.v5.model.AddHostsGroupRequest;
import com.huaweicloud.sdk.hss.v5.model.AddHostsGroupResponse;
import com.huaweicloud.sdk.hss.v5.model.AddLoginWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.AddLoginWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.AddProtectionPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.AddProtectionPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.AddSystemUserWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.AddSystemUserWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.AssociatePolicyGroupRequest;
import com.huaweicloud.sdk.hss.v5.model.AssociatePolicyGroupResponse;
import com.huaweicloud.sdk.hss.v5.model.BatchAddAccountsRequest;
import com.huaweicloud.sdk.hss.v5.model.BatchAddAccountsResponse;
import com.huaweicloud.sdk.hss.v5.model.BatchCreateTagsRequest;
import com.huaweicloud.sdk.hss.v5.model.BatchCreateTagsResponse;
import com.huaweicloud.sdk.hss.v5.model.BatchScanSwrImageRequest;
import com.huaweicloud.sdk.hss.v5.model.BatchScanSwrImageResponse;
import com.huaweicloud.sdk.hss.v5.model.BatchStartProtectionRequest;
import com.huaweicloud.sdk.hss.v5.model.BatchStartProtectionResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeAntivirusPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeAntivirusPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeBlockedIpRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeBlockedIpResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeCheckRuleActionRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeCheckRuleActionResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeEventRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeEventResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeHostsGroupRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeHostsGroupResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeIsolatedFileRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeIsolatedFileResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeVulScanPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeVulScanPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.ChangeVulStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ChangeVulStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateAgentDaemonsetRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateAgentDaemonsetResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateAntiVirusPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateAntiVirusPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateAntiVirusTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateAntiVirusTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateDecoyPortPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateDecoyPortPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateQuotasOrderRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateQuotasOrderResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateVulnerabilityScanTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateVulnerabilityScanTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteAccountRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteAccountResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteAgentDaemonsetRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteAgentDaemonsetResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteAntivirusPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteAntivirusPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteDecoyPortHostPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteDecoyPortHostPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteDecoyPortPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteDecoyPortPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteHostsGroupRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteHostsGroupResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteIsolatedFileRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteIsolatedFileResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteProtectionPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteProtectionPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteResourceInstanceTagRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteResourceInstanceTagResponse;
import com.huaweicloud.sdk.hss.v5.model.ExportAntiVirusResultRequest;
import com.huaweicloud.sdk.hss.v5.model.ExportAntiVirusResultResponse;
import com.huaweicloud.sdk.hss.v5.model.ExportVulsRequest;
import com.huaweicloud.sdk.hss.v5.model.ExportVulsResponse;
import com.huaweicloud.sdk.hss.v5.model.HandleAntiVirusResultRequest;
import com.huaweicloud.sdk.hss.v5.model.HandleAntiVirusResultResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAccountsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAccountsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAgentInstallScriptRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAgentInstallScriptResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAlarmWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAlarmWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAntiVirusHostRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAntiVirusHostResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ListAppsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAppsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAutoLaunchChangeHistoriesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAutoLaunchChangeHistoriesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAutoLaunchStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAutoLaunchStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAutoLaunchsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAutoLaunchsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListBackupVaultsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListBackupVaultsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListBlockedIpRequest;
import com.huaweicloud.sdk.hss.v5.model.ListBlockedIpResponse;
import com.huaweicloud.sdk.hss.v5.model.ListCceClusterConfigRequest;
import com.huaweicloud.sdk.hss.v5.model.ListCceClusterConfigResponse;
import com.huaweicloud.sdk.hss.v5.model.ListCheckFeatureRuleRequest;
import com.huaweicloud.sdk.hss.v5.model.ListCheckFeatureRuleResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ListLoginCommonIpRequest;
import com.huaweicloud.sdk.hss.v5.model.ListLoginCommonIpResponse;
import com.huaweicloud.sdk.hss.v5.model.ListLoginCommonLocationRequest;
import com.huaweicloud.sdk.hss.v5.model.ListLoginCommonLocationResponse;
import com.huaweicloud.sdk.hss.v5.model.ListLoginWhiteIpRequest;
import com.huaweicloud.sdk.hss.v5.model.ListLoginWhiteIpResponse;
import com.huaweicloud.sdk.hss.v5.model.ListLoginWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.ListLoginWhiteListResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ListSwrImageRepositoryRequest;
import com.huaweicloud.sdk.hss.v5.model.ListSwrImageRepositoryResponse;
import com.huaweicloud.sdk.hss.v5.model.ListSystemUserWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.ListSystemUserWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.ListTwoFactorLoginHostRequest;
import com.huaweicloud.sdk.hss.v5.model.ListTwoFactorLoginHostResponse;
import com.huaweicloud.sdk.hss.v5.model.ListUserChangeHistoriesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListUserChangeHistoriesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListUserStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListUserStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListUsersRequest;
import com.huaweicloud.sdk.hss.v5.model.ListUsersResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ListWtpProtectHostRequest;
import com.huaweicloud.sdk.hss.v5.model.ListWtpProtectHostResponse;
import com.huaweicloud.sdk.hss.v5.model.ModifyDecoyPortPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ModifyDecoyPortPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.RemoveAlarmWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.RemoveAlarmWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.RemoveLoginWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.RemoveLoginWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.RemoveSystemUserWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.RemoveSystemUserWhiteListResponse;
import com.huaweicloud.sdk.hss.v5.model.RunImageSynchronizeRequest;
import com.huaweicloud.sdk.hss.v5.model.RunImageSynchronizeResponse;
import com.huaweicloud.sdk.hss.v5.model.SetRaspSwitchRequest;
import com.huaweicloud.sdk.hss.v5.model.SetRaspSwitchResponse;
import com.huaweicloud.sdk.hss.v5.model.SetTwoFactorLoginConfigRequest;
import com.huaweicloud.sdk.hss.v5.model.SetTwoFactorLoginConfigResponse;
import com.huaweicloud.sdk.hss.v5.model.SetWtpProtectionStatusInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.SetWtpProtectionStatusInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowAgentDaemonsetDetailInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowAgentDaemonsetDetailInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowAntivirusPayPerScanStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowAntivirusPayPerScanStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowAntivirusStatisticRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowAntivirusStatisticResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowAppRaspSwitchStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowAppRaspSwitchStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowAssetStatisticRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowAssetStatisticResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowBackupPolicyInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowBackupPolicyInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowCheckRuleDetailRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowCheckRuleDetailResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowDecoyPortPolicyDetailsRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowDecoyPortPolicyDetailsResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowImageCheckRuleDetailRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowImageCheckRuleDetailResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowProductdataOfferingInfosRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowProductdataOfferingInfosResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ShowVulScanPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowVulScanPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowVulStaticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowVulStaticsResponse;
import com.huaweicloud.sdk.hss.v5.model.StartProtectionRequest;
import com.huaweicloud.sdk.hss.v5.model.StartProtectionResponse;
import com.huaweicloud.sdk.hss.v5.model.StopProtectionRequest;
import com.huaweicloud.sdk.hss.v5.model.StopProtectionResponse;
import com.huaweicloud.sdk.hss.v5.model.SwitchDecoyPortHostPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.SwitchDecoyPortHostPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.SwitchHostsProtectStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.SwitchHostsProtectStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.UpdateAgentDaemonsetRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateAgentDaemonsetResponse;
import com.huaweicloud.sdk.hss.v5.model.UpdateBackupPolicyInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateBackupPolicyInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.UpdateProtectionPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateProtectionPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.UpdateSystemUserWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateSystemUserWhiteListResponse;

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
     * 部署策略组
     *
     * 部署策略组
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
     * 部署策略组
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
     * 批量开启勒索病毒防护2.0
     *
     * 批量开启勒索病毒防护,若开启备份防护，请保证该region有cbr云备份服务
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
     * 批量开启勒索病毒防护,若开启备份防护，请保证该region有cbr云备份服务
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
     * 查询备份存储库列表
     *
     * 查询备份存储库列表
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
     * 查询备份存储库列表
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
     * 查询主机静态网页防篡改防护动态
     *
     * 查询主机静态网页防篡改防护动态：展示服务器名称、服务器ip、防护策略、检测时间、防护文件、事件描述信息
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
     * 查询主机静态网页防篡改防护动态
     *
     * 查询主机静态网页防篡改防护动态：展示服务器名称、服务器ip、防护策略、检测时间、防护文件、事件描述信息
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
     * 查询主机动态网页防篡改防护动态
     *
     * 查询主机动态网页防篡改防护动态：包含告警级别、服务器ip、服务器名称、威胁类型、告警时间、攻击源ip、攻击源url信息
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
     * 查询主机动态网页防篡改防护动态
     *
     * 查询主机动态网页防篡改防护动态：包含告警级别、服务器ip、服务器名称、威胁类型、告警时间、攻击源ip、攻击源url信息
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
     * 查询镜像安全配置检测结果列表,当前支持检测CentOS 7、Debian 10、EulerOS和Ubuntu16镜像的系统配置项、SSH应用配置项。
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
     * 查询镜像安全配置检测结果列表,当前支持检测CentOS 7、Debian 10、EulerOS和Ubuntu16镜像的系统配置项、SSH应用配置项。
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
     * 查询中间件列表
     *
     * 查询中间件列表，支持通过中间件名称查询对应的服务器树
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
     * 查询中间件列表，支持通过中间件名称查询对应的服务器树
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
     * 资产指纹-端口-服务器列表
     *
     * 具备该端口的主机/容器信息
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
     * 资产指纹-端口-服务器列表
     *
     * 具备该端口的主机/容器信息
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
     * 查询进程列表
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
     * 查询进程列表
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
     * 资产指纹-进程-服务器列表
     *
     * 具备该进程的主机/容器信息
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
     * 资产指纹-进程-服务器列表
     *
     * 具备该进程的主机/容器信息
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
     * 查询swr镜像仓库镜像列表
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
     * 查询swr镜像仓库镜像列表
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
     * 查询系统用白名单列表
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
     * 查询系统用白名单列表
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
     * 查询防护列表
     *
     * 查询防护列表：查询网页防篡改主机防护状态列表信息
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
     * 查询防护列表
     *
     * 查询防护列表：查询网页防篡改主机防护状态列表信息
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
     * 开启/关闭动态网页防篡改防护
     *
     * 开启/关闭动态网页防篡改防护，下发/清空动态网页防篡改策略
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
     * 开启/关闭动态网页防篡改防护
     *
     * 开启/关闭动态网页防篡改防护，下发/清空动态网页防篡改策略
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
     * 开启关闭网页防篡改防护
     *
     * 开启/关闭网页防篡改功能防护，下发/清空网页防篡改策略
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
     * 开启/关闭网页防篡改功能防护，下发/清空网页防篡改策略
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
     * 统计资产信息，账号、端口、进程等
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
     * 统计资产信息，账号、端口、进程等
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
     * 查询HSS存储库绑定的备份策略信息
     *
     * 查询HSS存储库绑定的备份策略信息,确保已经购买了勒索防护存储库，可以从cbr云备份服务进行验证，确保已经存在HSS_projectid命名的存储库已经购买
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
     * 查询HSS存储库绑定的备份策略信息,确保已经购买了勒索防护存储库，可以从cbr云备份服务进行验证，确保已经存在HSS_projectid命名的存储库已经购买
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
     * 开启勒索病毒防护
     *
     * 开启勒索病毒防护,请保证该region有cbr云备份服务，勒索服务与云备份服务有关联关系
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
     * 开启勒索病毒防护,请保证该region有cbr云备份服务，勒索服务与云备份服务有关联关系
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

}

package com.huaweicloud.sdk.hss.v5;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.hss.v5.model.AddCceIntegrationProtectionRequest;
import com.huaweicloud.sdk.hss.v5.model.AddCceIntegrationProtectionResponse;
import com.huaweicloud.sdk.hss.v5.model.AddHostsGroupRequest;
import com.huaweicloud.sdk.hss.v5.model.AddHostsGroupResponse;
import com.huaweicloud.sdk.hss.v5.model.AssociatePolicyGroupRequest;
import com.huaweicloud.sdk.hss.v5.model.AssociatePolicyGroupResponse;
import com.huaweicloud.sdk.hss.v5.model.BatchAddAccountsRequest;
import com.huaweicloud.sdk.hss.v5.model.BatchAddAccountsResponse;
import com.huaweicloud.sdk.hss.v5.model.BatchCreateTagsRequest;
import com.huaweicloud.sdk.hss.v5.model.BatchCreateTagsResponse;
import com.huaweicloud.sdk.hss.v5.model.BatchScanSwrImageRequest;
import com.huaweicloud.sdk.hss.v5.model.BatchScanSwrImageResponse;
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
import com.huaweicloud.sdk.hss.v5.model.CreateQuotasOrderRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateQuotasOrderResponse;
import com.huaweicloud.sdk.hss.v5.model.CreateVulnerabilityScanTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.CreateVulnerabilityScanTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteAccountRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteAccountResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteAgentDaemonsetRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteAgentDaemonsetResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteHostsGroupRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteHostsGroupResponse;
import com.huaweicloud.sdk.hss.v5.model.DeleteResourceInstanceTagRequest;
import com.huaweicloud.sdk.hss.v5.model.DeleteResourceInstanceTagResponse;
import com.huaweicloud.sdk.hss.v5.model.ExportVulsRequest;
import com.huaweicloud.sdk.hss.v5.model.ExportVulsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAccountsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAccountsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListAlarmWhiteListRequest;
import com.huaweicloud.sdk.hss.v5.model.ListAlarmWhiteListResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ListBlockedIpRequest;
import com.huaweicloud.sdk.hss.v5.model.ListBlockedIpResponse;
import com.huaweicloud.sdk.hss.v5.model.ListCceClusterConfigRequest;
import com.huaweicloud.sdk.hss.v5.model.ListCceClusterConfigResponse;
import com.huaweicloud.sdk.hss.v5.model.ListContainerNodesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListContainerNodesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListContainersRequest;
import com.huaweicloud.sdk.hss.v5.model.ListContainersResponse;
import com.huaweicloud.sdk.hss.v5.model.ListDownloadExportedFileRequest;
import com.huaweicloud.sdk.hss.v5.model.ListDownloadExportedFileResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ListOrganizationTreeRequest;
import com.huaweicloud.sdk.hss.v5.model.ListOrganizationTreeResponse;
import com.huaweicloud.sdk.hss.v5.model.ListPasswordComplexityRequest;
import com.huaweicloud.sdk.hss.v5.model.ListPasswordComplexityResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ListQueryExportTaskRequest;
import com.huaweicloud.sdk.hss.v5.model.ListQueryExportTaskResponse;
import com.huaweicloud.sdk.hss.v5.model.ListQuotasDetailRequest;
import com.huaweicloud.sdk.hss.v5.model.ListQuotasDetailResponse;
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
import com.huaweicloud.sdk.hss.v5.model.ListUserChangeHistoriesRequest;
import com.huaweicloud.sdk.hss.v5.model.ListUserChangeHistoriesResponse;
import com.huaweicloud.sdk.hss.v5.model.ListUserStatisticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ListUserStatisticsResponse;
import com.huaweicloud.sdk.hss.v5.model.ListUsersRequest;
import com.huaweicloud.sdk.hss.v5.model.ListUsersResponse;
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
import com.huaweicloud.sdk.hss.v5.model.RunImageSynchronizeRequest;
import com.huaweicloud.sdk.hss.v5.model.RunImageSynchronizeResponse;
import com.huaweicloud.sdk.hss.v5.model.SetRaspSwitchRequest;
import com.huaweicloud.sdk.hss.v5.model.SetRaspSwitchResponse;
import com.huaweicloud.sdk.hss.v5.model.SetWtpProtectionStatusInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.SetWtpProtectionStatusInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowAssetStatisticRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowAssetStatisticResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowBackupPolicyInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowBackupPolicyInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowCheckRuleDetailRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowCheckRuleDetailResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowImageCheckRuleDetailRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowImageCheckRuleDetailResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowProductdataOfferingInfosRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowProductdataOfferingInfosResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowResourceQuotasRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowResourceQuotasResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowRiskConfigDetailRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowRiskConfigDetailResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowVulScanPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowVulScanPolicyResponse;
import com.huaweicloud.sdk.hss.v5.model.ShowVulStaticsRequest;
import com.huaweicloud.sdk.hss.v5.model.ShowVulStaticsResponse;
import com.huaweicloud.sdk.hss.v5.model.StartProtectionRequest;
import com.huaweicloud.sdk.hss.v5.model.StartProtectionResponse;
import com.huaweicloud.sdk.hss.v5.model.StopProtectionRequest;
import com.huaweicloud.sdk.hss.v5.model.StopProtectionResponse;
import com.huaweicloud.sdk.hss.v5.model.SwitchHostsProtectStatusRequest;
import com.huaweicloud.sdk.hss.v5.model.SwitchHostsProtectStatusResponse;
import com.huaweicloud.sdk.hss.v5.model.UpdateAgentDaemonsetRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateAgentDaemonsetResponse;
import com.huaweicloud.sdk.hss.v5.model.UpdateBackupPolicyInfoRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateBackupPolicyInfoResponse;
import com.huaweicloud.sdk.hss.v5.model.UpdateProtectionPolicyRequest;
import com.huaweicloud.sdk.hss.v5.model.UpdateProtectionPolicyResponse;

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
     * 新建cce集成防护配置
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
     * 新建cce集成防护配置
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
     * 创建服务器组
     *
     * 创建服务器组
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
     * 创建服务器组
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
     * 部署策略组
     *
     * 部署策略组
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
     * 部署策略组
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
     * 批量添加账号
     *
     * 批量添加账号
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
     * 批量添加账号
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
     * 批量创建标签
     *
     * 批量创建标签
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
     * 批量创建标签
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
     * 镜像仓库镜像批量扫描
     *
     * 镜像仓库镜像批量扫描
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
     * 镜像仓库镜像批量扫描
     *
     * 镜像仓库镜像批量扫描
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
     * 解除已拦截IP
     *
     * 解除已拦截IP
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
     * 解除已拦截IP
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
     * 对未通过的配置检查项进行忽略/取消忽略/修复/验证操作
     *
     * 对未通过的配置检查项进行忽略/取消忽略/修复/验证操作
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
     * 对未通过的配置检查项进行忽略/取消忽略/修复/验证操作
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
     * 处理告警事件
     *
     * 处理告警事件
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
     * 处理告警事件
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
     * 编辑服务器组
     *
     * 编辑服务器组
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
     * 编辑服务器组
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
     * 恢复已隔离文件
     *
     * 恢复已隔离文件
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
     * 恢复已隔离文件
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
     * 修改漏洞扫描策略
     *
     * 修改漏洞扫描策略
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
     * 修改漏洞扫描策略
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
     * 修改漏洞的状态
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
     * 修改漏洞的状态
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
     * HSS服务创建订单订购配额
     *
     * HSS服务创建订单订购配额，只支持包周期计费模式
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
     * HSS服务创建订单订购配额，只支持包周期计费模式
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
     * 创建漏洞扫描任务
     *
     * 创建漏洞扫描任务
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
     * 创建漏洞扫描任务
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
     * 删除账号
     *
     * 删除账号
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
     * 删除账号
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
     * 删除集群daemonset
     *
     * 删除集群daemonset
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
     * 删除集群daemonset
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
     * 删除服务器组
     *
     * 删除服务器组
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
     * 删除服务器组
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
     * 删除资源标签
     *
     * 删除单个资源下的标签
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
     * 删除单个资源下的标签
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
     * 导出漏洞及漏洞影响的主机的相关信息
     *
     * 导出漏洞及漏洞影响的主机的相关信息
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
     * 导出漏洞及漏洞影响的主机的相关信息
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
     * 查询多账号列表
     *
     * 查询多账号列表
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
     * 查询多账号列表
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
     * 查询告警白名单列表
     *
     * 查询告警白名单列表
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
     * 查询告警白名单列表
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
     * 获取软件信息的历史变动记录
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
     * 获取软件信息的历史变动记录
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
     * 查询软件列表，支持通过软件名称查询对应的服务器数
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
     * 查询软件列表，支持通过软件名称查询对应的服务器数
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
     * 查询软件的服务器列表
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
     * 查询软件的服务器列表
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
     * 获取自启动项的历史变动记录
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
     * 获取自启动项的历史变动记录
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
     * 查询自启动信息，支持通过传入自启动名称查询启动类型和服务器数
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
     * 查询自启动信息，支持通过传入自启动名称查询启动类型和服务器数
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
     * 查询自启动项的服务列表
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
     * 查询自启动项的服务列表
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
     * 查询已拦截IP列表
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
     * 查询已拦截IP列表
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
     * 获取集群配置
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
     * 获取集群配置
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
     * 查询容器节点列表
     *
     * 查询容器节点列表
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
     * 查询容器节点列表
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
     * 查询容器基本信息列表
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
     * 查询容器基本信息列表
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
     * 下载导出文件
     *
     * 下载导出文件
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
     * 下载导出文件
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
     * 查询服务器组列表
     *
     * 查询服务器组列表
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
     * 查询服务器组列表
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
     * 查询主机静态网页防篡改防护动态
     *
     * 查询主机静态网页防篡改防护动态：展示服务器名称、服务器ip、防护策略、检测时间、防护文件、事件描述信息
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
     * 查询主机静态网页防篡改防护动态
     *
     * 查询主机静态网页防篡改防护动态：展示服务器名称、服务器ip、防护策略、检测时间、防护文件、事件描述信息
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
     * 查询主机动态网页防篡改防护动态
     *
     * 查询主机动态网页防篡改防护动态：包含告警级别、服务器ip、服务器名称、威胁类型、告警时间、攻击源ip、攻击源url信息
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
     * 查询主机动态网页防篡改防护动态
     *
     * 查询主机动态网页防篡改防护动态：包含告警级别、服务器ip、服务器名称、威胁类型、告警时间、攻击源ip、攻击源url信息
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
     * 查询云服务器列表
     *
     * 查询云服务器列表
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
     * 查询云服务器列表
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
     * 查询单台服务器漏洞信息
     *
     * 查询单台服务器漏洞信息
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
     * 查询单台服务器漏洞信息
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
     * 查询镜像指定安全配置项的检查项列表
     *
     * 查询镜像指定安全配置项的检查项列表
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
     * 查询镜像指定安全配置项的检查项列表
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
     * 查询镜像安全配置检测结果列表,当前支持检测CentOS 7、Debian 10、EulerOS和Ubuntu16镜像的系统配置项、SSH应用配置项。
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
     * 查询镜像安全配置检测结果列表,当前支持检测CentOS 7、Debian 10、EulerOS和Ubuntu16镜像的系统配置项、SSH应用配置项。
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
     * 查询镜像的漏洞信息
     *
     * 查询镜像的漏洞信息
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
     * 查询镜像的漏洞信息
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
     * 查询已隔离文件列表
     *
     * 查询已隔离文件列表
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
     * 查询已隔离文件列表
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
     * 查询指定中间件的服务器列表，通过传入中间件名称参数，返回对应的中间件服务器列表
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
     * 查询指定中间件的服务器列表，通过传入中间件名称参数，返回对应的中间件服务器列表
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
     * 查询中间件列表
     *
     * 查询中间件列表，支持通过中间件名称查询对应的服务器树
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
     * 查询中间件列表，支持通过中间件名称查询对应的服务器树
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
     * 查询账号组织
     *
     * 查询账号组织
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
     * 查询账号组织
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
     * 查询口令复杂度策略检测报告
     *
     * 查询口令复杂度策略检测报告
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
     * 查询口令复杂度策略检测报告
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
     * 查询策略组列表
     *
     * 查询策略组列表
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
     * 查询策略组列表
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
     * 资产指纹-端口-服务器列表
     *
     * 具备该端口的主机/容器信息
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
     * 资产指纹-端口-服务器列表
     *
     * 具备该端口的主机/容器信息
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
     * 查询开放端口列表，支持通过传入端口或协议类型查询服务器数
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
     * 查询开放端口列表，支持通过传入端口或协议类型查询服务器数
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
     * 查询单服务器的开放端口列表
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
     * 查询单服务器的开放端口列表
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
     * 查询进程列表
     *
     * 查询进程列表，通过传入进程路径参数查询对应的服务器数
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
     * 查询进程列表
     *
     * 查询进程列表，通过传入进程路径参数查询对应的服务器数
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
     * 资产指纹-进程-服务器列表
     *
     * 具备该进程的主机/容器信息
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
     * 资产指纹-进程-服务器列表
     *
     * 具备该进程的主机/容器信息
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
     * 查询勒索病毒的防护策略列表
     *
     * 查询勒索病毒的防护策略列表
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
     * 查询勒索病毒的防护策略列表
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
     * 查询勒索防护服务器列表，与云备份服务配合使用。因此使用勒索相关接口之前确保该局点有云备份服务
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
     * 查询勒索防护服务器列表，与云备份服务配合使用。因此使用勒索相关接口之前确保该局点有云备份服务
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
     * 查询导出任务信息
     *
     * 查询导出任务信息
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
     * 查询导出任务信息
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
     * 查询配额详情
     *
     * 查询配额详情
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
     * 查询配额详情
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
     * 查询指定安全配置项的检查项列表
     *
     * 查询指定安全配置项的检查项列表
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
     * 查询指定安全配置项的检查项列表
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
     * 查询指定安全配置项的受影响服务器列表
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
     * 查询指定安全配置项的受影响服务器列表
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
     * 查询租户的服务器安全配置检测结果列表
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
     * 查询租户的服务器安全配置检测结果列表
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
     * 查入侵事件列表
     *
     * 查入侵事件列表
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
     * 查入侵事件列表
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
     * 查询swr镜像仓库镜像列表
     *
     * 查询swr镜像仓库镜像列表,如果需要从swr同步最新镜像，需要先调用“从swr同步镜像”接口
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
     * 查询swr镜像仓库镜像列表
     *
     * 查询swr镜像仓库镜像列表,如果需要从swr同步最新镜像，需要先调用“从swr同步镜像”接口
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
     * 获取账户变动历史信息
     *
     * 获取账户变动历史记录信息
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
     * 获取账户变动历史记录信息
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
     * 查询账号信息列表，支持通过传入账号名称参数查询对应的服务器数
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
     * 查询账号信息列表，支持通过传入账号名称参数查询对应的服务器数
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
     * 查询账号的服务器列表
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
     * 查询账号的服务器列表
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
     * 查询单个漏洞影响的云服务器信息
     *
     * 查询单个漏洞影响的云服务器信息
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
     * 查询单个漏洞影响的云服务器信息
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
     * 查询漏洞扫描任务列表
     *
     * 查询漏洞扫描任务列表
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
     * 查询漏洞扫描任务列表
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
     * 查询漏洞扫描任务对应的主机列表
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
     * 查询漏洞扫描任务对应的主机列表
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
     * 查询漏洞列表
     *
     * 查询漏洞列表
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
     * 查询漏洞列表
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
     * 漏洞对应cve信息
     *
     * 漏洞对应cve信息
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
     * 漏洞对应cve信息
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
     * 查询弱口令检测结果列表
     *
     * 查询弱口令检测结果列表
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
     * 查询弱口令检测结果列表
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
     * 查询防护列表
     *
     * 查询防护列表：查询网页防篡改主机防护状态列表信息
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
     * 查询防护列表
     *
     * 查询防护列表：查询网页防篡改主机防护状态列表信息
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
     * 从SWR服务同步镜像列表
     *
     * 从SWR服务同步镜像列表
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
     * 从SWR服务同步镜像列表
     *
     * 从SWR服务同步镜像列表
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
     * 开启/关闭动态网页防篡改防护
     *
     * 开启/关闭动态网页防篡改防护，下发/清空动态网页防篡改策略
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
     * 开启/关闭动态网页防篡改防护
     *
     * 开启/关闭动态网页防篡改防护，下发/清空动态网页防篡改策略
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
     * 开启关闭网页防篡改防护
     *
     * 开启/关闭网页防篡改功能防护，下发/清空网页防篡改策略
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
     * 开启/关闭网页防篡改功能防护，下发/清空网页防篡改策略
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
     * 统计资产信息，账号、端口、进程等
     *
     * 资产统计信息，账号、端口、进程等
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
     * 统计资产信息，账号、端口、进程等
     *
     * 资产统计信息，账号、端口、进程等
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
     * 查询HSS存储库绑定的备份策略信息
     *
     * 查询HSS存储库绑定的备份策略信息,确保已经购买了勒索防护存储库，可以从cbr云备份服务进行验证，确保已经存在HSS_projectid命名的存储库已经购买
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
     * 查询HSS存储库绑定的备份策略信息,确保已经购买了勒索防护存储库，可以从cbr云备份服务进行验证，确保已经存在HSS_projectid命名的存储库已经购买
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
     * 查询配置检查项检测报告
     *
     * 查询配置检查项检测报告
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
     * 查询配置检查项检测报告
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
     * 查询镜像配置检查项检测报告
     *
     * 查询镜像配置检查项检测报告
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
     * 查询镜像配置检查项检测报告
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
     * 查询产商品信息
     *
     * 查询产商品信息
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
     * 查询产商品信息
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
     * 查询配额信息
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
     * 查询配额信息
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
     * 查询指定安全配置项的检查结果
     *
     * 查询指定安全配置项的检查结果
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
     * 查询指定安全配置项的检查结果
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
     * 查询漏洞扫描策略
     *
     * 查询漏洞扫描策略
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
     * 查询漏洞扫描策略
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
     * 查询漏洞管理统计数据
     *
     * 查询漏洞管理统计数据
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
     * 查询漏洞管理统计数据
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
     * 开启勒索病毒防护
     *
     * 开启勒索病毒防护,请保证该region有cbr云备份服务，勒索服务与云备份服务有关联关系
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
     * 开启勒索病毒防护,请保证该region有cbr云备份服务，勒索服务与云备份服务有关联关系
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
     * 关闭勒索病毒防护
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
     * 关闭勒索病毒防护
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
     * 切换防护状态
     *
     * 切换防护状态
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
     * 切换防护状态
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
     * 更新集群daemonset
     *
     * 更新集群daemonset
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
     * 更新集群daemonset
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
     * 修改存储库绑定的备份策略
     *
     * 修改存储库绑定的备份策略
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
     * 修改存储库绑定的备份策略
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
     * 修改勒索防护策略
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
     * 修改勒索防护策略
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

}

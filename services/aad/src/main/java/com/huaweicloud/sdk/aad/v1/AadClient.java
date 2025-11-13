package com.huaweicloud.sdk.aad.v1;

import com.huaweicloud.sdk.aad.v1.model.AddBlackWhiteIpListRequest;
import com.huaweicloud.sdk.aad.v1.model.AddBlackWhiteIpListResponse;
import com.huaweicloud.sdk.aad.v1.model.AddPolicyBlackAndWhiteIpListRequest;
import com.huaweicloud.sdk.aad.v1.model.AddPolicyBlackAndWhiteIpListResponse;
import com.huaweicloud.sdk.aad.v1.model.AssociateIpToPolicyAndPackageRequest;
import com.huaweicloud.sdk.aad.v1.model.AssociateIpToPolicyAndPackageResponse;
import com.huaweicloud.sdk.aad.v1.model.AssociateIpToPolicyRequest;
import com.huaweicloud.sdk.aad.v1.model.AssociateIpToPolicyResponse;
import com.huaweicloud.sdk.aad.v1.model.BatchCreateInstanceIpRuleRequest;
import com.huaweicloud.sdk.aad.v1.model.BatchCreateInstanceIpRuleResponse;
import com.huaweicloud.sdk.aad.v1.model.BatchDeleteInstanceIpRuleRequest;
import com.huaweicloud.sdk.aad.v1.model.BatchDeleteInstanceIpRuleResponse;
import com.huaweicloud.sdk.aad.v1.model.CreateAadDomainRequest;
import com.huaweicloud.sdk.aad.v1.model.CreateAadDomainResponse;
import com.huaweicloud.sdk.aad.v1.model.CreatePolicyRequest;
import com.huaweicloud.sdk.aad.v1.model.CreatePolicyResponse;
import com.huaweicloud.sdk.aad.v1.model.DeleteAlarmConfigRequest;
import com.huaweicloud.sdk.aad.v1.model.DeleteAlarmConfigResponse;
import com.huaweicloud.sdk.aad.v1.model.DeleteBlackWhiteIpListRequest;
import com.huaweicloud.sdk.aad.v1.model.DeleteBlackWhiteIpListResponse;
import com.huaweicloud.sdk.aad.v1.model.DeletePolicyBlackAndWhiteIpListRequest;
import com.huaweicloud.sdk.aad.v1.model.DeletePolicyBlackAndWhiteIpListResponse;
import com.huaweicloud.sdk.aad.v1.model.DeletePolicyRequest;
import com.huaweicloud.sdk.aad.v1.model.DeletePolicyResponse;
import com.huaweicloud.sdk.aad.v1.model.DisassociateIpFromPolicyAndPackageRequest;
import com.huaweicloud.sdk.aad.v1.model.DisassociateIpFromPolicyAndPackageResponse;
import com.huaweicloud.sdk.aad.v1.model.DisassociateIpFromPolicyRequest;
import com.huaweicloud.sdk.aad.v1.model.DisassociateIpFromPolicyResponse;
import com.huaweicloud.sdk.aad.v1.model.ExecuteUnblockIpRequest;
import com.huaweicloud.sdk.aad.v1.model.ExecuteUnblockIpResponse;
import com.huaweicloud.sdk.aad.v1.model.ListBlockIpsRequest;
import com.huaweicloud.sdk.aad.v1.model.ListBlockIpsResponse;
import com.huaweicloud.sdk.aad.v1.model.ListDomainRequest;
import com.huaweicloud.sdk.aad.v1.model.ListDomainResponse;
import com.huaweicloud.sdk.aad.v1.model.ListInstanceIdRequest;
import com.huaweicloud.sdk.aad.v1.model.ListInstanceIdResponse;
import com.huaweicloud.sdk.aad.v1.model.ListInstanceIpRuleRequest;
import com.huaweicloud.sdk.aad.v1.model.ListInstanceIpRuleResponse;
import com.huaweicloud.sdk.aad.v1.model.ListInstanceRequest;
import com.huaweicloud.sdk.aad.v1.model.ListInstanceResponse;
import com.huaweicloud.sdk.aad.v1.model.ListPackageRequest;
import com.huaweicloud.sdk.aad.v1.model.ListPackageResponse;
import com.huaweicloud.sdk.aad.v1.model.ListPeakRequest;
import com.huaweicloud.sdk.aad.v1.model.ListPeakResponse;
import com.huaweicloud.sdk.aad.v1.model.ListPolicyRequest;
import com.huaweicloud.sdk.aad.v1.model.ListPolicyResponse;
import com.huaweicloud.sdk.aad.v1.model.ListProtectedIpRequest;
import com.huaweicloud.sdk.aad.v1.model.ListProtectedIpResponse;
import com.huaweicloud.sdk.aad.v1.model.ListSourceIpsRequest;
import com.huaweicloud.sdk.aad.v1.model.ListSourceIpsResponse;
import com.huaweicloud.sdk.aad.v1.model.ListUnblockQuotaStatisticsRequest;
import com.huaweicloud.sdk.aad.v1.model.ListUnblockQuotaStatisticsResponse;
import com.huaweicloud.sdk.aad.v1.model.ListUnboundProtectedIpRequest;
import com.huaweicloud.sdk.aad.v1.model.ListUnboundProtectedIpResponse;
import com.huaweicloud.sdk.aad.v1.model.ModifyDomainWebSwitchRequest;
import com.huaweicloud.sdk.aad.v1.model.ModifyDomainWebSwitchResponse;
import com.huaweicloud.sdk.aad.v1.model.SetCertForDomainRequest;
import com.huaweicloud.sdk.aad.v1.model.SetCertForDomainResponse;
import com.huaweicloud.sdk.aad.v1.model.ShowAlarmConfigRequest;
import com.huaweicloud.sdk.aad.v1.model.ShowAlarmConfigResponse;
import com.huaweicloud.sdk.aad.v1.model.ShowBlockStatisticsRequest;
import com.huaweicloud.sdk.aad.v1.model.ShowBlockStatisticsResponse;
import com.huaweicloud.sdk.aad.v1.model.ShowLtsConfigRequest;
import com.huaweicloud.sdk.aad.v1.model.ShowLtsConfigResponse;
import com.huaweicloud.sdk.aad.v1.model.ShowPolicyRequest;
import com.huaweicloud.sdk.aad.v1.model.ShowPolicyResponse;
import com.huaweicloud.sdk.aad.v1.model.ShowUnblockRecordRequest;
import com.huaweicloud.sdk.aad.v1.model.ShowUnblockRecordResponse;
import com.huaweicloud.sdk.aad.v1.model.UpdateAlarmConfigRequest;
import com.huaweicloud.sdk.aad.v1.model.UpdateAlarmConfigResponse;
import com.huaweicloud.sdk.aad.v1.model.UpdateDomainRequest;
import com.huaweicloud.sdk.aad.v1.model.UpdateDomainResponse;
import com.huaweicloud.sdk.aad.v1.model.UpdateInstanceIpRuleRequest;
import com.huaweicloud.sdk.aad.v1.model.UpdateInstanceIpRuleResponse;
import com.huaweicloud.sdk.aad.v1.model.UpdateLtsConfigRequest;
import com.huaweicloud.sdk.aad.v1.model.UpdateLtsConfigResponse;
import com.huaweicloud.sdk.aad.v1.model.UpdatePackageIpRequest;
import com.huaweicloud.sdk.aad.v1.model.UpdatePackageIpResponse;
import com.huaweicloud.sdk.aad.v1.model.UpdatePackageNameRequest;
import com.huaweicloud.sdk.aad.v1.model.UpdatePackageNameResponse;
import com.huaweicloud.sdk.aad.v1.model.UpdatePolicyRequest;
import com.huaweicloud.sdk.aad.v1.model.UpdatePolicyResponse;
import com.huaweicloud.sdk.aad.v1.model.UpdateTagForProtectedIpRequest;
import com.huaweicloud.sdk.aad.v1.model.UpdateTagForProtectedIpResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class AadClient {

    protected HcClient hcClient;

    public AadClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<AadClient> newBuilder() {
        ClientBuilder<AadClient> clientBuilder = new ClientBuilder<>(AadClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    /**
     * 解封IP
     *
     * 解封IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteUnblockIpRequest 请求对象
     * @return ExecuteUnblockIpResponse
     */
    public ExecuteUnblockIpResponse executeUnblockIp(ExecuteUnblockIpRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.executeUnblockIp);
    }

    /**
     * 解封IP
     *
     * 解封IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteUnblockIpRequest 请求对象
     * @return SyncInvoker<ExecuteUnblockIpRequest, ExecuteUnblockIpResponse>
     */
    public SyncInvoker<ExecuteUnblockIpRequest, ExecuteUnblockIpResponse> executeUnblockIpInvoker(
        ExecuteUnblockIpRequest request) {
        return new SyncInvoker<>(request, AadMeta.executeUnblockIp, hcClient);
    }

    /**
     * 查询租户封堵列表
     *
     * 查询租户封堵列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBlockIpsRequest 请求对象
     * @return ListBlockIpsResponse
     */
    public ListBlockIpsResponse listBlockIps(ListBlockIpsRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.listBlockIps);
    }

    /**
     * 查询租户封堵列表
     *
     * 查询租户封堵列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBlockIpsRequest 请求对象
     * @return SyncInvoker<ListBlockIpsRequest, ListBlockIpsResponse>
     */
    public SyncInvoker<ListBlockIpsRequest, ListBlockIpsResponse> listBlockIpsInvoker(ListBlockIpsRequest request) {
        return new SyncInvoker<>(request, AadMeta.listBlockIps, hcClient);
    }

    /**
     * 查询解封配额
     *
     * 查询解封配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUnblockQuotaStatisticsRequest 请求对象
     * @return ListUnblockQuotaStatisticsResponse
     */
    public ListUnblockQuotaStatisticsResponse listUnblockQuotaStatistics(ListUnblockQuotaStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.listUnblockQuotaStatistics);
    }

    /**
     * 查询解封配额
     *
     * 查询解封配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUnblockQuotaStatisticsRequest 请求对象
     * @return SyncInvoker<ListUnblockQuotaStatisticsRequest, ListUnblockQuotaStatisticsResponse>
     */
    public SyncInvoker<ListUnblockQuotaStatisticsRequest, ListUnblockQuotaStatisticsResponse> listUnblockQuotaStatisticsInvoker(
        ListUnblockQuotaStatisticsRequest request) {
        return new SyncInvoker<>(request, AadMeta.listUnblockQuotaStatistics, hcClient);
    }

    /**
     * 查询封堵统计数据
     *
     * 查询封堵统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBlockStatisticsRequest 请求对象
     * @return ShowBlockStatisticsResponse
     */
    public ShowBlockStatisticsResponse showBlockStatistics(ShowBlockStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.showBlockStatistics);
    }

    /**
     * 查询封堵统计数据
     *
     * 查询封堵统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBlockStatisticsRequest 请求对象
     * @return SyncInvoker<ShowBlockStatisticsRequest, ShowBlockStatisticsResponse>
     */
    public SyncInvoker<ShowBlockStatisticsRequest, ShowBlockStatisticsResponse> showBlockStatisticsInvoker(
        ShowBlockStatisticsRequest request) {
        return new SyncInvoker<>(request, AadMeta.showBlockStatistics, hcClient);
    }

    /**
     * 查询租户解封记录
     *
     * 查询租户解封记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUnblockRecordRequest 请求对象
     * @return ShowUnblockRecordResponse
     */
    public ShowUnblockRecordResponse showUnblockRecord(ShowUnblockRecordRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.showUnblockRecord);
    }

    /**
     * 查询租户解封记录
     *
     * 查询租户解封记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUnblockRecordRequest 请求对象
     * @return SyncInvoker<ShowUnblockRecordRequest, ShowUnblockRecordResponse>
     */
    public SyncInvoker<ShowUnblockRecordRequest, ShowUnblockRecordResponse> showUnblockRecordInvoker(
        ShowUnblockRecordRequest request) {
        return new SyncInvoker<>(request, AadMeta.showUnblockRecord, hcClient);
    }

    /**
     * 高防实例添加黑白名单
     *
     * 高防实例添加黑白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddBlackWhiteIpListRequest 请求对象
     * @return AddBlackWhiteIpListResponse
     */
    public AddBlackWhiteIpListResponse addBlackWhiteIpList(AddBlackWhiteIpListRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.addBlackWhiteIpList);
    }

    /**
     * 高防实例添加黑白名单
     *
     * 高防实例添加黑白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddBlackWhiteIpListRequest 请求对象
     * @return SyncInvoker<AddBlackWhiteIpListRequest, AddBlackWhiteIpListResponse>
     */
    public SyncInvoker<AddBlackWhiteIpListRequest, AddBlackWhiteIpListResponse> addBlackWhiteIpListInvoker(
        AddBlackWhiteIpListRequest request) {
        return new SyncInvoker<>(request, AadMeta.addBlackWhiteIpList, hcClient);
    }

    /**
     * 策略添加黑白名单
     *
     * 策略添加黑白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddPolicyBlackAndWhiteIpListRequest 请求对象
     * @return AddPolicyBlackAndWhiteIpListResponse
     */
    public AddPolicyBlackAndWhiteIpListResponse addPolicyBlackAndWhiteIpList(
        AddPolicyBlackAndWhiteIpListRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.addPolicyBlackAndWhiteIpList);
    }

    /**
     * 策略添加黑白名单
     *
     * 策略添加黑白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddPolicyBlackAndWhiteIpListRequest 请求对象
     * @return SyncInvoker<AddPolicyBlackAndWhiteIpListRequest, AddPolicyBlackAndWhiteIpListResponse>
     */
    public SyncInvoker<AddPolicyBlackAndWhiteIpListRequest, AddPolicyBlackAndWhiteIpListResponse> addPolicyBlackAndWhiteIpListInvoker(
        AddPolicyBlackAndWhiteIpListRequest request) {
        return new SyncInvoker<>(request, AadMeta.addPolicyBlackAndWhiteIpList, hcClient);
    }

    /**
     * 策略绑定防护对象
     *
     * 策略绑定防护对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateIpToPolicyRequest 请求对象
     * @return AssociateIpToPolicyResponse
     */
    public AssociateIpToPolicyResponse associateIpToPolicy(AssociateIpToPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.associateIpToPolicy);
    }

    /**
     * 策略绑定防护对象
     *
     * 策略绑定防护对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateIpToPolicyRequest 请求对象
     * @return SyncInvoker<AssociateIpToPolicyRequest, AssociateIpToPolicyResponse>
     */
    public SyncInvoker<AssociateIpToPolicyRequest, AssociateIpToPolicyResponse> associateIpToPolicyInvoker(
        AssociateIpToPolicyRequest request) {
        return new SyncInvoker<>(request, AadMeta.associateIpToPolicy, hcClient);
    }

    /**
     * 策略和实例绑定防护对象
     *
     * 策略和实例绑定防护对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateIpToPolicyAndPackageRequest 请求对象
     * @return AssociateIpToPolicyAndPackageResponse
     */
    public AssociateIpToPolicyAndPackageResponse associateIpToPolicyAndPackage(
        AssociateIpToPolicyAndPackageRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.associateIpToPolicyAndPackage);
    }

    /**
     * 策略和实例绑定防护对象
     *
     * 策略和实例绑定防护对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateIpToPolicyAndPackageRequest 请求对象
     * @return SyncInvoker<AssociateIpToPolicyAndPackageRequest, AssociateIpToPolicyAndPackageResponse>
     */
    public SyncInvoker<AssociateIpToPolicyAndPackageRequest, AssociateIpToPolicyAndPackageResponse> associateIpToPolicyAndPackageInvoker(
        AssociateIpToPolicyAndPackageRequest request) {
        return new SyncInvoker<>(request, AadMeta.associateIpToPolicyAndPackage, hcClient);
    }

    /**
     * 批量创建高防实例IP的转发规则
     *
     * 批量创建高防实例IP的转发规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateInstanceIpRuleRequest 请求对象
     * @return BatchCreateInstanceIpRuleResponse
     */
    public BatchCreateInstanceIpRuleResponse batchCreateInstanceIpRule(BatchCreateInstanceIpRuleRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.batchCreateInstanceIpRule);
    }

    /**
     * 批量创建高防实例IP的转发规则
     *
     * 批量创建高防实例IP的转发规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateInstanceIpRuleRequest 请求对象
     * @return SyncInvoker<BatchCreateInstanceIpRuleRequest, BatchCreateInstanceIpRuleResponse>
     */
    public SyncInvoker<BatchCreateInstanceIpRuleRequest, BatchCreateInstanceIpRuleResponse> batchCreateInstanceIpRuleInvoker(
        BatchCreateInstanceIpRuleRequest request) {
        return new SyncInvoker<>(request, AadMeta.batchCreateInstanceIpRule, hcClient);
    }

    /**
     * 批量删除高防实例IP的转发规则
     *
     * 批量删除高防实例IP的转发规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteInstanceIpRuleRequest 请求对象
     * @return BatchDeleteInstanceIpRuleResponse
     */
    public BatchDeleteInstanceIpRuleResponse batchDeleteInstanceIpRule(BatchDeleteInstanceIpRuleRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.batchDeleteInstanceIpRule);
    }

    /**
     * 批量删除高防实例IP的转发规则
     *
     * 批量删除高防实例IP的转发规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteInstanceIpRuleRequest 请求对象
     * @return SyncInvoker<BatchDeleteInstanceIpRuleRequest, BatchDeleteInstanceIpRuleResponse>
     */
    public SyncInvoker<BatchDeleteInstanceIpRuleRequest, BatchDeleteInstanceIpRuleResponse> batchDeleteInstanceIpRuleInvoker(
        BatchDeleteInstanceIpRuleRequest request) {
        return new SyncInvoker<>(request, AadMeta.batchDeleteInstanceIpRule, hcClient);
    }

    /**
     * 创建防护域名
     *
     * 创建防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAadDomainRequest 请求对象
     * @return CreateAadDomainResponse
     */
    public CreateAadDomainResponse createAadDomain(CreateAadDomainRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.createAadDomain);
    }

    /**
     * 创建防护域名
     *
     * 创建防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAadDomainRequest 请求对象
     * @return SyncInvoker<CreateAadDomainRequest, CreateAadDomainResponse>
     */
    public SyncInvoker<CreateAadDomainRequest, CreateAadDomainResponse> createAadDomainInvoker(
        CreateAadDomainRequest request) {
        return new SyncInvoker<>(request, AadMeta.createAadDomain, hcClient);
    }

    /**
     * 创建策略
     *
     * 创建策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyRequest 请求对象
     * @return CreatePolicyResponse
     */
    public CreatePolicyResponse createPolicy(CreatePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.createPolicy);
    }

    /**
     * 创建策略
     *
     * 创建策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyRequest 请求对象
     * @return SyncInvoker<CreatePolicyRequest, CreatePolicyResponse>
     */
    public SyncInvoker<CreatePolicyRequest, CreatePolicyResponse> createPolicyInvoker(CreatePolicyRequest request) {
        return new SyncInvoker<>(request, AadMeta.createPolicy, hcClient);
    }

    /**
     * 删除告警配置
     *
     * 删除告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlarmConfigRequest 请求对象
     * @return DeleteAlarmConfigResponse
     */
    public DeleteAlarmConfigResponse deleteAlarmConfig(DeleteAlarmConfigRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.deleteAlarmConfig);
    }

    /**
     * 删除告警配置
     *
     * 删除告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlarmConfigRequest 请求对象
     * @return SyncInvoker<DeleteAlarmConfigRequest, DeleteAlarmConfigResponse>
     */
    public SyncInvoker<DeleteAlarmConfigRequest, DeleteAlarmConfigResponse> deleteAlarmConfigInvoker(
        DeleteAlarmConfigRequest request) {
        return new SyncInvoker<>(request, AadMeta.deleteAlarmConfig, hcClient);
    }

    /**
     * 高防实例删除黑白名单
     *
     * 高防实例删除黑白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBlackWhiteIpListRequest 请求对象
     * @return DeleteBlackWhiteIpListResponse
     */
    public DeleteBlackWhiteIpListResponse deleteBlackWhiteIpList(DeleteBlackWhiteIpListRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.deleteBlackWhiteIpList);
    }

    /**
     * 高防实例删除黑白名单
     *
     * 高防实例删除黑白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBlackWhiteIpListRequest 请求对象
     * @return SyncInvoker<DeleteBlackWhiteIpListRequest, DeleteBlackWhiteIpListResponse>
     */
    public SyncInvoker<DeleteBlackWhiteIpListRequest, DeleteBlackWhiteIpListResponse> deleteBlackWhiteIpListInvoker(
        DeleteBlackWhiteIpListRequest request) {
        return new SyncInvoker<>(request, AadMeta.deleteBlackWhiteIpList, hcClient);
    }

    /**
     * 删除策略
     *
     * 删除策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyRequest 请求对象
     * @return DeletePolicyResponse
     */
    public DeletePolicyResponse deletePolicy(DeletePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.deletePolicy);
    }

    /**
     * 删除策略
     *
     * 删除策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyRequest 请求对象
     * @return SyncInvoker<DeletePolicyRequest, DeletePolicyResponse>
     */
    public SyncInvoker<DeletePolicyRequest, DeletePolicyResponse> deletePolicyInvoker(DeletePolicyRequest request) {
        return new SyncInvoker<>(request, AadMeta.deletePolicy, hcClient);
    }

    /**
     * 策略删除黑白名单
     *
     * 策略删除黑白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyBlackAndWhiteIpListRequest 请求对象
     * @return DeletePolicyBlackAndWhiteIpListResponse
     */
    public DeletePolicyBlackAndWhiteIpListResponse deletePolicyBlackAndWhiteIpList(
        DeletePolicyBlackAndWhiteIpListRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.deletePolicyBlackAndWhiteIpList);
    }

    /**
     * 策略删除黑白名单
     *
     * 策略删除黑白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyBlackAndWhiteIpListRequest 请求对象
     * @return SyncInvoker<DeletePolicyBlackAndWhiteIpListRequest, DeletePolicyBlackAndWhiteIpListResponse>
     */
    public SyncInvoker<DeletePolicyBlackAndWhiteIpListRequest, DeletePolicyBlackAndWhiteIpListResponse> deletePolicyBlackAndWhiteIpListInvoker(
        DeletePolicyBlackAndWhiteIpListRequest request) {
        return new SyncInvoker<>(request, AadMeta.deletePolicyBlackAndWhiteIpList, hcClient);
    }

    /**
     * 策略解绑防护对象
     *
     * 策略解绑防护对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateIpFromPolicyRequest 请求对象
     * @return DisassociateIpFromPolicyResponse
     */
    public DisassociateIpFromPolicyResponse disassociateIpFromPolicy(DisassociateIpFromPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.disassociateIpFromPolicy);
    }

    /**
     * 策略解绑防护对象
     *
     * 策略解绑防护对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateIpFromPolicyRequest 请求对象
     * @return SyncInvoker<DisassociateIpFromPolicyRequest, DisassociateIpFromPolicyResponse>
     */
    public SyncInvoker<DisassociateIpFromPolicyRequest, DisassociateIpFromPolicyResponse> disassociateIpFromPolicyInvoker(
        DisassociateIpFromPolicyRequest request) {
        return new SyncInvoker<>(request, AadMeta.disassociateIpFromPolicy, hcClient);
    }

    /**
     * 策略和实例解绑防护对象
     *
     * 策略和实例解绑防护对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateIpFromPolicyAndPackageRequest 请求对象
     * @return DisassociateIpFromPolicyAndPackageResponse
     */
    public DisassociateIpFromPolicyAndPackageResponse disassociateIpFromPolicyAndPackage(
        DisassociateIpFromPolicyAndPackageRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.disassociateIpFromPolicyAndPackage);
    }

    /**
     * 策略和实例解绑防护对象
     *
     * 策略和实例解绑防护对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateIpFromPolicyAndPackageRequest 请求对象
     * @return SyncInvoker<DisassociateIpFromPolicyAndPackageRequest, DisassociateIpFromPolicyAndPackageResponse>
     */
    public SyncInvoker<DisassociateIpFromPolicyAndPackageRequest, DisassociateIpFromPolicyAndPackageResponse> disassociateIpFromPolicyAndPackageInvoker(
        DisassociateIpFromPolicyAndPackageRequest request) {
        return new SyncInvoker<>(request, AadMeta.disassociateIpFromPolicyAndPackage, hcClient);
    }

    /**
     * 查询域名列表
     *
     * 查询域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainRequest 请求对象
     * @return ListDomainResponse
     */
    public ListDomainResponse listDomain(ListDomainRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.listDomain);
    }

    /**
     * 查询域名列表
     *
     * 查询域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainRequest 请求对象
     * @return SyncInvoker<ListDomainRequest, ListDomainResponse>
     */
    public SyncInvoker<ListDomainRequest, ListDomainResponse> listDomainInvoker(ListDomainRequest request) {
        return new SyncInvoker<>(request, AadMeta.listDomain, hcClient);
    }

    /**
     * 查询高防实例列表
     *
     * 查询高防实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceRequest 请求对象
     * @return ListInstanceResponse
     */
    public ListInstanceResponse listInstance(ListInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.listInstance);
    }

    /**
     * 查询高防实例列表
     *
     * 查询高防实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceRequest 请求对象
     * @return SyncInvoker<ListInstanceRequest, ListInstanceResponse>
     */
    public SyncInvoker<ListInstanceRequest, ListInstanceResponse> listInstanceInvoker(ListInstanceRequest request) {
        return new SyncInvoker<>(request, AadMeta.listInstance, hcClient);
    }

    /**
     * 查询域名关联的实例ID
     *
     * 查询域名关联的实例ID
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceIdRequest 请求对象
     * @return ListInstanceIdResponse
     */
    public ListInstanceIdResponse listInstanceId(ListInstanceIdRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.listInstanceId);
    }

    /**
     * 查询域名关联的实例ID
     *
     * 查询域名关联的实例ID
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceIdRequest 请求对象
     * @return SyncInvoker<ListInstanceIdRequest, ListInstanceIdResponse>
     */
    public SyncInvoker<ListInstanceIdRequest, ListInstanceIdResponse> listInstanceIdInvoker(
        ListInstanceIdRequest request) {
        return new SyncInvoker<>(request, AadMeta.listInstanceId, hcClient);
    }

    /**
     * 查询高防实例IP的转发规则列表
     *
     * 查询高防实例IP的转发规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceIpRuleRequest 请求对象
     * @return ListInstanceIpRuleResponse
     */
    public ListInstanceIpRuleResponse listInstanceIpRule(ListInstanceIpRuleRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.listInstanceIpRule);
    }

    /**
     * 查询高防实例IP的转发规则列表
     *
     * 查询高防实例IP的转发规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceIpRuleRequest 请求对象
     * @return SyncInvoker<ListInstanceIpRuleRequest, ListInstanceIpRuleResponse>
     */
    public SyncInvoker<ListInstanceIpRuleRequest, ListInstanceIpRuleResponse> listInstanceIpRuleInvoker(
        ListInstanceIpRuleRequest request) {
        return new SyncInvoker<>(request, AadMeta.listInstanceIpRule, hcClient);
    }

    /**
     * 查询实例列表
     *
     * 查询实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPackageRequest 请求对象
     * @return ListPackageResponse
     */
    public ListPackageResponse listPackage(ListPackageRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.listPackage);
    }

    /**
     * 查询实例列表
     *
     * 查询实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPackageRequest 请求对象
     * @return SyncInvoker<ListPackageRequest, ListPackageResponse>
     */
    public SyncInvoker<ListPackageRequest, ListPackageResponse> listPackageInvoker(ListPackageRequest request) {
        return new SyncInvoker<>(request, AadMeta.listPackage, hcClient);
    }

    /**
     * 查询流量峰值、攻击计数
     *
     * 查询流量峰值、攻击计数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPeakRequest 请求对象
     * @return ListPeakResponse
     */
    public ListPeakResponse listPeak(ListPeakRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.listPeak);
    }

    /**
     * 查询流量峰值、攻击计数
     *
     * 查询流量峰值、攻击计数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPeakRequest 请求对象
     * @return SyncInvoker<ListPeakRequest, ListPeakResponse>
     */
    public SyncInvoker<ListPeakRequest, ListPeakResponse> listPeakInvoker(ListPeakRequest request) {
        return new SyncInvoker<>(request, AadMeta.listPeak, hcClient);
    }

    /**
     * 查询策略列表
     *
     * 查询策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyRequest 请求对象
     * @return ListPolicyResponse
     */
    public ListPolicyResponse listPolicy(ListPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.listPolicy);
    }

    /**
     * 查询策略列表
     *
     * 查询策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyRequest 请求对象
     * @return SyncInvoker<ListPolicyRequest, ListPolicyResponse>
     */
    public SyncInvoker<ListPolicyRequest, ListPolicyResponse> listPolicyInvoker(ListPolicyRequest request) {
        return new SyncInvoker<>(request, AadMeta.listPolicy, hcClient);
    }

    /**
     * 查询防护对象列表
     *
     * 查询防护对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectedIpRequest 请求对象
     * @return ListProtectedIpResponse
     */
    public ListProtectedIpResponse listProtectedIp(ListProtectedIpRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.listProtectedIp);
    }

    /**
     * 查询防护对象列表
     *
     * 查询防护对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectedIpRequest 请求对象
     * @return SyncInvoker<ListProtectedIpRequest, ListProtectedIpResponse>
     */
    public SyncInvoker<ListProtectedIpRequest, ListProtectedIpResponse> listProtectedIpInvoker(
        ListProtectedIpRequest request) {
        return new SyncInvoker<>(request, AadMeta.listProtectedIp, hcClient);
    }

    /**
     * 查询高防回源IP段列表
     *
     * 查询高防回源IP段列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSourceIpsRequest 请求对象
     * @return ListSourceIpsResponse
     */
    public ListSourceIpsResponse listSourceIps(ListSourceIpsRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.listSourceIps);
    }

    /**
     * 查询高防回源IP段列表
     *
     * 查询高防回源IP段列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSourceIpsRequest 请求对象
     * @return SyncInvoker<ListSourceIpsRequest, ListSourceIpsResponse>
     */
    public SyncInvoker<ListSourceIpsRequest, ListSourceIpsResponse> listSourceIpsInvoker(ListSourceIpsRequest request) {
        return new SyncInvoker<>(request, AadMeta.listSourceIps, hcClient);
    }

    /**
     * 查询可绑定的防护对象列表
     *
     * 查询可绑定的防护对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUnboundProtectedIpRequest 请求对象
     * @return ListUnboundProtectedIpResponse
     */
    public ListUnboundProtectedIpResponse listUnboundProtectedIp(ListUnboundProtectedIpRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.listUnboundProtectedIp);
    }

    /**
     * 查询可绑定的防护对象列表
     *
     * 查询可绑定的防护对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUnboundProtectedIpRequest 请求对象
     * @return SyncInvoker<ListUnboundProtectedIpRequest, ListUnboundProtectedIpResponse>
     */
    public SyncInvoker<ListUnboundProtectedIpRequest, ListUnboundProtectedIpResponse> listUnboundProtectedIpInvoker(
        ListUnboundProtectedIpRequest request) {
        return new SyncInvoker<>(request, AadMeta.listUnboundProtectedIp, hcClient);
    }

    /**
     * 修改域名WEB基础防护开关/CC防护开关
     *
     * 修改域名WEB基础防护开关/CC防护开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyDomainWebSwitchRequest 请求对象
     * @return ModifyDomainWebSwitchResponse
     */
    public ModifyDomainWebSwitchResponse modifyDomainWebSwitch(ModifyDomainWebSwitchRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.modifyDomainWebSwitch);
    }

    /**
     * 修改域名WEB基础防护开关/CC防护开关
     *
     * 修改域名WEB基础防护开关/CC防护开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyDomainWebSwitchRequest 请求对象
     * @return SyncInvoker<ModifyDomainWebSwitchRequest, ModifyDomainWebSwitchResponse>
     */
    public SyncInvoker<ModifyDomainWebSwitchRequest, ModifyDomainWebSwitchResponse> modifyDomainWebSwitchInvoker(
        ModifyDomainWebSwitchRequest request) {
        return new SyncInvoker<>(request, AadMeta.modifyDomainWebSwitch, hcClient);
    }

    /**
     * 上传/修改域名对应证书
     *
     * 上传/修改域名对应证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetCertForDomainRequest 请求对象
     * @return SetCertForDomainResponse
     */
    public SetCertForDomainResponse setCertForDomain(SetCertForDomainRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.setCertForDomain);
    }

    /**
     * 上传/修改域名对应证书
     *
     * 上传/修改域名对应证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetCertForDomainRequest 请求对象
     * @return SyncInvoker<SetCertForDomainRequest, SetCertForDomainResponse>
     */
    public SyncInvoker<SetCertForDomainRequest, SetCertForDomainResponse> setCertForDomainInvoker(
        SetCertForDomainRequest request) {
        return new SyncInvoker<>(request, AadMeta.setCertForDomain, hcClient);
    }

    /**
     * 查询告警配置
     *
     * 查询告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmConfigRequest 请求对象
     * @return ShowAlarmConfigResponse
     */
    public ShowAlarmConfigResponse showAlarmConfig(ShowAlarmConfigRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.showAlarmConfig);
    }

    /**
     * 查询告警配置
     *
     * 查询告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmConfigRequest 请求对象
     * @return SyncInvoker<ShowAlarmConfigRequest, ShowAlarmConfigResponse>
     */
    public SyncInvoker<ShowAlarmConfigRequest, ShowAlarmConfigResponse> showAlarmConfigInvoker(
        ShowAlarmConfigRequest request) {
        return new SyncInvoker<>(request, AadMeta.showAlarmConfig, hcClient);
    }

    /**
     * 查询日志配置
     *
     * 查询日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLtsConfigRequest 请求对象
     * @return ShowLtsConfigResponse
     */
    public ShowLtsConfigResponse showLtsConfig(ShowLtsConfigRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.showLtsConfig);
    }

    /**
     * 查询日志配置
     *
     * 查询日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLtsConfigRequest 请求对象
     * @return SyncInvoker<ShowLtsConfigRequest, ShowLtsConfigResponse>
     */
    public SyncInvoker<ShowLtsConfigRequest, ShowLtsConfigResponse> showLtsConfigInvoker(ShowLtsConfigRequest request) {
        return new SyncInvoker<>(request, AadMeta.showLtsConfig, hcClient);
    }

    /**
     * 查询策略详情
     *
     * 查询策略详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyRequest 请求对象
     * @return ShowPolicyResponse
     */
    public ShowPolicyResponse showPolicy(ShowPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.showPolicy);
    }

    /**
     * 查询策略详情
     *
     * 查询策略详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyRequest 请求对象
     * @return SyncInvoker<ShowPolicyRequest, ShowPolicyResponse>
     */
    public SyncInvoker<ShowPolicyRequest, ShowPolicyResponse> showPolicyInvoker(ShowPolicyRequest request) {
        return new SyncInvoker<>(request, AadMeta.showPolicy, hcClient);
    }

    /**
     * 设置告警配置
     *
     * 设置告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlarmConfigRequest 请求对象
     * @return UpdateAlarmConfigResponse
     */
    public UpdateAlarmConfigResponse updateAlarmConfig(UpdateAlarmConfigRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.updateAlarmConfig);
    }

    /**
     * 设置告警配置
     *
     * 设置告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlarmConfigRequest 请求对象
     * @return SyncInvoker<UpdateAlarmConfigRequest, UpdateAlarmConfigResponse>
     */
    public SyncInvoker<UpdateAlarmConfigRequest, UpdateAlarmConfigResponse> updateAlarmConfigInvoker(
        UpdateAlarmConfigRequest request) {
        return new SyncInvoker<>(request, AadMeta.updateAlarmConfig, hcClient);
    }

    /**
     * 更新域名信息
     *
     * 更新域名源站配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainRequest 请求对象
     * @return UpdateDomainResponse
     */
    public UpdateDomainResponse updateDomain(UpdateDomainRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.updateDomain);
    }

    /**
     * 更新域名信息
     *
     * 更新域名源站配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainRequest 请求对象
     * @return SyncInvoker<UpdateDomainRequest, UpdateDomainResponse>
     */
    public SyncInvoker<UpdateDomainRequest, UpdateDomainResponse> updateDomainInvoker(UpdateDomainRequest request) {
        return new SyncInvoker<>(request, AadMeta.updateDomain, hcClient);
    }

    /**
     * 修改高防实例转发配置的源站IP
     *
     * 修改高防实例转发配置的源站IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceIpRuleRequest 请求对象
     * @return UpdateInstanceIpRuleResponse
     */
    public UpdateInstanceIpRuleResponse updateInstanceIpRule(UpdateInstanceIpRuleRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.updateInstanceIpRule);
    }

    /**
     * 修改高防实例转发配置的源站IP
     *
     * 修改高防实例转发配置的源站IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceIpRuleRequest 请求对象
     * @return SyncInvoker<UpdateInstanceIpRuleRequest, UpdateInstanceIpRuleResponse>
     */
    public SyncInvoker<UpdateInstanceIpRuleRequest, UpdateInstanceIpRuleResponse> updateInstanceIpRuleInvoker(
        UpdateInstanceIpRuleRequest request) {
        return new SyncInvoker<>(request, AadMeta.updateInstanceIpRule, hcClient);
    }

    /**
     * 设置日志配置
     *
     * 设置日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLtsConfigRequest 请求对象
     * @return UpdateLtsConfigResponse
     */
    public UpdateLtsConfigResponse updateLtsConfig(UpdateLtsConfigRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.updateLtsConfig);
    }

    /**
     * 设置日志配置
     *
     * 设置日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLtsConfigRequest 请求对象
     * @return SyncInvoker<UpdateLtsConfigRequest, UpdateLtsConfigResponse>
     */
    public SyncInvoker<UpdateLtsConfigRequest, UpdateLtsConfigResponse> updateLtsConfigInvoker(
        UpdateLtsConfigRequest request) {
        return new SyncInvoker<>(request, AadMeta.updateLtsConfig, hcClient);
    }

    /**
     * 更新实例绑定的全量防护对象
     *
     * 更新实例绑定的全量防护对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePackageIpRequest 请求对象
     * @return UpdatePackageIpResponse
     */
    public UpdatePackageIpResponse updatePackageIp(UpdatePackageIpRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.updatePackageIp);
    }

    /**
     * 更新实例绑定的全量防护对象
     *
     * 更新实例绑定的全量防护对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePackageIpRequest 请求对象
     * @return SyncInvoker<UpdatePackageIpRequest, UpdatePackageIpResponse>
     */
    public SyncInvoker<UpdatePackageIpRequest, UpdatePackageIpResponse> updatePackageIpInvoker(
        UpdatePackageIpRequest request) {
        return new SyncInvoker<>(request, AadMeta.updatePackageIp, hcClient);
    }

    /**
     * 更新实例名字
     *
     * 更新实例名字
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePackageNameRequest 请求对象
     * @return UpdatePackageNameResponse
     */
    public UpdatePackageNameResponse updatePackageName(UpdatePackageNameRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.updatePackageName);
    }

    /**
     * 更新实例名字
     *
     * 更新实例名字
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePackageNameRequest 请求对象
     * @return SyncInvoker<UpdatePackageNameRequest, UpdatePackageNameResponse>
     */
    public SyncInvoker<UpdatePackageNameRequest, UpdatePackageNameResponse> updatePackageNameInvoker(
        UpdatePackageNameRequest request) {
        return new SyncInvoker<>(request, AadMeta.updatePackageName, hcClient);
    }

    /**
     * 更新策略
     *
     * 更新策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyRequest 请求对象
     * @return UpdatePolicyResponse
     */
    public UpdatePolicyResponse updatePolicy(UpdatePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.updatePolicy);
    }

    /**
     * 更新策略
     *
     * 更新策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyRequest 请求对象
     * @return SyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse>
     */
    public SyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse> updatePolicyInvoker(UpdatePolicyRequest request) {
        return new SyncInvoker<>(request, AadMeta.updatePolicy, hcClient);
    }

    /**
     * 防护对象设置标签
     *
     * 防护对象设置标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTagForProtectedIpRequest 请求对象
     * @return UpdateTagForProtectedIpResponse
     */
    public UpdateTagForProtectedIpResponse updateTagForProtectedIp(UpdateTagForProtectedIpRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.updateTagForProtectedIp);
    }

    /**
     * 防护对象设置标签
     *
     * 防护对象设置标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTagForProtectedIpRequest 请求对象
     * @return SyncInvoker<UpdateTagForProtectedIpRequest, UpdateTagForProtectedIpResponse>
     */
    public SyncInvoker<UpdateTagForProtectedIpRequest, UpdateTagForProtectedIpResponse> updateTagForProtectedIpInvoker(
        UpdateTagForProtectedIpRequest request) {
        return new SyncInvoker<>(request, AadMeta.updateTagForProtectedIp, hcClient);
    }

}

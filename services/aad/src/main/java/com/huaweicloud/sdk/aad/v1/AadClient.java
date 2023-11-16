package com.huaweicloud.sdk.aad.v1;

import com.huaweicloud.sdk.aad.v1.model.AddPolicyBlackAndWhiteIpListRequest;
import com.huaweicloud.sdk.aad.v1.model.AddPolicyBlackAndWhiteIpListResponse;
import com.huaweicloud.sdk.aad.v1.model.AssociateIpToPolicyRequest;
import com.huaweicloud.sdk.aad.v1.model.AssociateIpToPolicyResponse;
import com.huaweicloud.sdk.aad.v1.model.BatchCreateInstanceIpRuleRequest;
import com.huaweicloud.sdk.aad.v1.model.BatchCreateInstanceIpRuleResponse;
import com.huaweicloud.sdk.aad.v1.model.BatchDeleteInstanceIpRuleRequest;
import com.huaweicloud.sdk.aad.v1.model.BatchDeleteInstanceIpRuleResponse;
import com.huaweicloud.sdk.aad.v1.model.CreatePolicyRequest;
import com.huaweicloud.sdk.aad.v1.model.CreatePolicyResponse;
import com.huaweicloud.sdk.aad.v1.model.DeleteAlarmConfigRequest;
import com.huaweicloud.sdk.aad.v1.model.DeleteAlarmConfigResponse;
import com.huaweicloud.sdk.aad.v1.model.DeletePolicyBlackAndWhiteIpListRequest;
import com.huaweicloud.sdk.aad.v1.model.DeletePolicyBlackAndWhiteIpListResponse;
import com.huaweicloud.sdk.aad.v1.model.DeletePolicyRequest;
import com.huaweicloud.sdk.aad.v1.model.DeletePolicyResponse;
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
import com.huaweicloud.sdk.aad.v1.model.ListUnblockQuotaStatisticsRequest;
import com.huaweicloud.sdk.aad.v1.model.ListUnblockQuotaStatisticsResponse;
import com.huaweicloud.sdk.aad.v1.model.ListUnboundProtectedIpRequest;
import com.huaweicloud.sdk.aad.v1.model.ListUnboundProtectedIpResponse;
import com.huaweicloud.sdk.aad.v1.model.ShowAlarmConfigRequest;
import com.huaweicloud.sdk.aad.v1.model.ShowAlarmConfigResponse;
import com.huaweicloud.sdk.aad.v1.model.ShowBlockStatisticsRequest;
import com.huaweicloud.sdk.aad.v1.model.ShowBlockStatisticsResponse;
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
     * @param ExecuteUnblockIpRequest 请求对象
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
     * @param ExecuteUnblockIpRequest 请求对象
     * @return SyncInvoker<ExecuteUnblockIpRequest, ExecuteUnblockIpResponse>
     */
    public SyncInvoker<ExecuteUnblockIpRequest, ExecuteUnblockIpResponse> executeUnblockIpInvoker(
        ExecuteUnblockIpRequest request) {
        return new SyncInvoker<ExecuteUnblockIpRequest, ExecuteUnblockIpResponse>(request, AadMeta.executeUnblockIp,
            hcClient);
    }

    /**
     * 查询租户封堵列表
     *
     * 查询租户封堵列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBlockIpsRequest 请求对象
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
     * @param ListBlockIpsRequest 请求对象
     * @return SyncInvoker<ListBlockIpsRequest, ListBlockIpsResponse>
     */
    public SyncInvoker<ListBlockIpsRequest, ListBlockIpsResponse> listBlockIpsInvoker(ListBlockIpsRequest request) {
        return new SyncInvoker<ListBlockIpsRequest, ListBlockIpsResponse>(request, AadMeta.listBlockIps, hcClient);
    }

    /**
     * 查询解封配额
     *
     * 查询解封配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUnblockQuotaStatisticsRequest 请求对象
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
     * @param ListUnblockQuotaStatisticsRequest 请求对象
     * @return SyncInvoker<ListUnblockQuotaStatisticsRequest, ListUnblockQuotaStatisticsResponse>
     */
    public SyncInvoker<ListUnblockQuotaStatisticsRequest, ListUnblockQuotaStatisticsResponse> listUnblockQuotaStatisticsInvoker(
        ListUnblockQuotaStatisticsRequest request) {
        return new SyncInvoker<ListUnblockQuotaStatisticsRequest, ListUnblockQuotaStatisticsResponse>(request,
            AadMeta.listUnblockQuotaStatistics, hcClient);
    }

    /**
     * 查询封堵统计数据
     *
     * 查询封堵统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBlockStatisticsRequest 请求对象
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
     * @param ShowBlockStatisticsRequest 请求对象
     * @return SyncInvoker<ShowBlockStatisticsRequest, ShowBlockStatisticsResponse>
     */
    public SyncInvoker<ShowBlockStatisticsRequest, ShowBlockStatisticsResponse> showBlockStatisticsInvoker(
        ShowBlockStatisticsRequest request) {
        return new SyncInvoker<ShowBlockStatisticsRequest, ShowBlockStatisticsResponse>(request,
            AadMeta.showBlockStatistics, hcClient);
    }

    /**
     * 查询租户解封记录
     *
     * 查询租户解封记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUnblockRecordRequest 请求对象
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
     * @param ShowUnblockRecordRequest 请求对象
     * @return SyncInvoker<ShowUnblockRecordRequest, ShowUnblockRecordResponse>
     */
    public SyncInvoker<ShowUnblockRecordRequest, ShowUnblockRecordResponse> showUnblockRecordInvoker(
        ShowUnblockRecordRequest request) {
        return new SyncInvoker<ShowUnblockRecordRequest, ShowUnblockRecordResponse>(request, AadMeta.showUnblockRecord,
            hcClient);
    }

    /**
     * 策略添加黑白名单
     *
     * 策略添加黑白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddPolicyBlackAndWhiteIpListRequest 请求对象
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
     * @param AddPolicyBlackAndWhiteIpListRequest 请求对象
     * @return SyncInvoker<AddPolicyBlackAndWhiteIpListRequest, AddPolicyBlackAndWhiteIpListResponse>
     */
    public SyncInvoker<AddPolicyBlackAndWhiteIpListRequest, AddPolicyBlackAndWhiteIpListResponse> addPolicyBlackAndWhiteIpListInvoker(
        AddPolicyBlackAndWhiteIpListRequest request) {
        return new SyncInvoker<AddPolicyBlackAndWhiteIpListRequest, AddPolicyBlackAndWhiteIpListResponse>(request,
            AadMeta.addPolicyBlackAndWhiteIpList, hcClient);
    }

    /**
     * 策略绑定防护对象
     *
     * 策略绑定防护对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateIpToPolicyRequest 请求对象
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
     * @param AssociateIpToPolicyRequest 请求对象
     * @return SyncInvoker<AssociateIpToPolicyRequest, AssociateIpToPolicyResponse>
     */
    public SyncInvoker<AssociateIpToPolicyRequest, AssociateIpToPolicyResponse> associateIpToPolicyInvoker(
        AssociateIpToPolicyRequest request) {
        return new SyncInvoker<AssociateIpToPolicyRequest, AssociateIpToPolicyResponse>(request,
            AadMeta.associateIpToPolicy, hcClient);
    }

    /**
     * 批量创建高防实例IP的转发规则
     *
     * 批量创建高防实例IP的转发规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateInstanceIpRuleRequest 请求对象
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
     * @param BatchCreateInstanceIpRuleRequest 请求对象
     * @return SyncInvoker<BatchCreateInstanceIpRuleRequest, BatchCreateInstanceIpRuleResponse>
     */
    public SyncInvoker<BatchCreateInstanceIpRuleRequest, BatchCreateInstanceIpRuleResponse> batchCreateInstanceIpRuleInvoker(
        BatchCreateInstanceIpRuleRequest request) {
        return new SyncInvoker<BatchCreateInstanceIpRuleRequest, BatchCreateInstanceIpRuleResponse>(request,
            AadMeta.batchCreateInstanceIpRule, hcClient);
    }

    /**
     * 批量删除高防实例IP的转发规则
     *
     * 批量删除高防实例IP的转发规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteInstanceIpRuleRequest 请求对象
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
     * @param BatchDeleteInstanceIpRuleRequest 请求对象
     * @return SyncInvoker<BatchDeleteInstanceIpRuleRequest, BatchDeleteInstanceIpRuleResponse>
     */
    public SyncInvoker<BatchDeleteInstanceIpRuleRequest, BatchDeleteInstanceIpRuleResponse> batchDeleteInstanceIpRuleInvoker(
        BatchDeleteInstanceIpRuleRequest request) {
        return new SyncInvoker<BatchDeleteInstanceIpRuleRequest, BatchDeleteInstanceIpRuleResponse>(request,
            AadMeta.batchDeleteInstanceIpRule, hcClient);
    }

    /**
     * 创建策略
     *
     * 创建策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePolicyRequest 请求对象
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
     * @param CreatePolicyRequest 请求对象
     * @return SyncInvoker<CreatePolicyRequest, CreatePolicyResponse>
     */
    public SyncInvoker<CreatePolicyRequest, CreatePolicyResponse> createPolicyInvoker(CreatePolicyRequest request) {
        return new SyncInvoker<CreatePolicyRequest, CreatePolicyResponse>(request, AadMeta.createPolicy, hcClient);
    }

    /**
     * 删除告警配置
     *
     * 删除告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAlarmConfigRequest 请求对象
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
     * @param DeleteAlarmConfigRequest 请求对象
     * @return SyncInvoker<DeleteAlarmConfigRequest, DeleteAlarmConfigResponse>
     */
    public SyncInvoker<DeleteAlarmConfigRequest, DeleteAlarmConfigResponse> deleteAlarmConfigInvoker(
        DeleteAlarmConfigRequest request) {
        return new SyncInvoker<DeleteAlarmConfigRequest, DeleteAlarmConfigResponse>(request, AadMeta.deleteAlarmConfig,
            hcClient);
    }

    /**
     * 删除策略
     *
     * 删除策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePolicyRequest 请求对象
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
     * @param DeletePolicyRequest 请求对象
     * @return SyncInvoker<DeletePolicyRequest, DeletePolicyResponse>
     */
    public SyncInvoker<DeletePolicyRequest, DeletePolicyResponse> deletePolicyInvoker(DeletePolicyRequest request) {
        return new SyncInvoker<DeletePolicyRequest, DeletePolicyResponse>(request, AadMeta.deletePolicy, hcClient);
    }

    /**
     * 策略删除黑白名单
     *
     * 策略删除黑白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePolicyBlackAndWhiteIpListRequest 请求对象
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
     * @param DeletePolicyBlackAndWhiteIpListRequest 请求对象
     * @return SyncInvoker<DeletePolicyBlackAndWhiteIpListRequest, DeletePolicyBlackAndWhiteIpListResponse>
     */
    public SyncInvoker<DeletePolicyBlackAndWhiteIpListRequest, DeletePolicyBlackAndWhiteIpListResponse> deletePolicyBlackAndWhiteIpListInvoker(
        DeletePolicyBlackAndWhiteIpListRequest request) {
        return new SyncInvoker<DeletePolicyBlackAndWhiteIpListRequest, DeletePolicyBlackAndWhiteIpListResponse>(request,
            AadMeta.deletePolicyBlackAndWhiteIpList, hcClient);
    }

    /**
     * 策略解绑防护对象
     *
     * 策略解绑防护对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateIpFromPolicyRequest 请求对象
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
     * @param DisassociateIpFromPolicyRequest 请求对象
     * @return SyncInvoker<DisassociateIpFromPolicyRequest, DisassociateIpFromPolicyResponse>
     */
    public SyncInvoker<DisassociateIpFromPolicyRequest, DisassociateIpFromPolicyResponse> disassociateIpFromPolicyInvoker(
        DisassociateIpFromPolicyRequest request) {
        return new SyncInvoker<DisassociateIpFromPolicyRequest, DisassociateIpFromPolicyResponse>(request,
            AadMeta.disassociateIpFromPolicy, hcClient);
    }

    /**
     * 查询域名列表
     *
     * 查询域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDomainRequest 请求对象
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
     * @param ListDomainRequest 请求对象
     * @return SyncInvoker<ListDomainRequest, ListDomainResponse>
     */
    public SyncInvoker<ListDomainRequest, ListDomainResponse> listDomainInvoker(ListDomainRequest request) {
        return new SyncInvoker<ListDomainRequest, ListDomainResponse>(request, AadMeta.listDomain, hcClient);
    }

    /**
     * 查询高防实例列表
     *
     * 查询高防实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstanceRequest 请求对象
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
     * @param ListInstanceRequest 请求对象
     * @return SyncInvoker<ListInstanceRequest, ListInstanceResponse>
     */
    public SyncInvoker<ListInstanceRequest, ListInstanceResponse> listInstanceInvoker(ListInstanceRequest request) {
        return new SyncInvoker<ListInstanceRequest, ListInstanceResponse>(request, AadMeta.listInstance, hcClient);
    }

    /**
     * 查询域名关联的实例ID
     *
     * 查询域名关联的实例ID
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstanceIdRequest 请求对象
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
     * @param ListInstanceIdRequest 请求对象
     * @return SyncInvoker<ListInstanceIdRequest, ListInstanceIdResponse>
     */
    public SyncInvoker<ListInstanceIdRequest, ListInstanceIdResponse> listInstanceIdInvoker(
        ListInstanceIdRequest request) {
        return new SyncInvoker<ListInstanceIdRequest, ListInstanceIdResponse>(request, AadMeta.listInstanceId,
            hcClient);
    }

    /**
     * 查询高防实例IP的转发规则列表
     *
     * 查询高防实例IP的转发规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstanceIpRuleRequest 请求对象
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
     * @param ListInstanceIpRuleRequest 请求对象
     * @return SyncInvoker<ListInstanceIpRuleRequest, ListInstanceIpRuleResponse>
     */
    public SyncInvoker<ListInstanceIpRuleRequest, ListInstanceIpRuleResponse> listInstanceIpRuleInvoker(
        ListInstanceIpRuleRequest request) {
        return new SyncInvoker<ListInstanceIpRuleRequest, ListInstanceIpRuleResponse>(request,
            AadMeta.listInstanceIpRule, hcClient);
    }

    /**
     * 查询防护包列表
     *
     * 查询防护包列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPackageRequest 请求对象
     * @return ListPackageResponse
     */
    public ListPackageResponse listPackage(ListPackageRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.listPackage);
    }

    /**
     * 查询防护包列表
     *
     * 查询防护包列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPackageRequest 请求对象
     * @return SyncInvoker<ListPackageRequest, ListPackageResponse>
     */
    public SyncInvoker<ListPackageRequest, ListPackageResponse> listPackageInvoker(ListPackageRequest request) {
        return new SyncInvoker<ListPackageRequest, ListPackageResponse>(request, AadMeta.listPackage, hcClient);
    }

    /**
     * 查询流量峰值、攻击计数
     *
     * 查询流量峰值、攻击计数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPeakRequest 请求对象
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
     * @param ListPeakRequest 请求对象
     * @return SyncInvoker<ListPeakRequest, ListPeakResponse>
     */
    public SyncInvoker<ListPeakRequest, ListPeakResponse> listPeakInvoker(ListPeakRequest request) {
        return new SyncInvoker<ListPeakRequest, ListPeakResponse>(request, AadMeta.listPeak, hcClient);
    }

    /**
     * 查询策略列表
     *
     * 查询策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPolicyRequest 请求对象
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
     * @param ListPolicyRequest 请求对象
     * @return SyncInvoker<ListPolicyRequest, ListPolicyResponse>
     */
    public SyncInvoker<ListPolicyRequest, ListPolicyResponse> listPolicyInvoker(ListPolicyRequest request) {
        return new SyncInvoker<ListPolicyRequest, ListPolicyResponse>(request, AadMeta.listPolicy, hcClient);
    }

    /**
     * 查询防护对象列表
     *
     * 查询防护对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProtectedIpRequest 请求对象
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
     * @param ListProtectedIpRequest 请求对象
     * @return SyncInvoker<ListProtectedIpRequest, ListProtectedIpResponse>
     */
    public SyncInvoker<ListProtectedIpRequest, ListProtectedIpResponse> listProtectedIpInvoker(
        ListProtectedIpRequest request) {
        return new SyncInvoker<ListProtectedIpRequest, ListProtectedIpResponse>(request, AadMeta.listProtectedIp,
            hcClient);
    }

    /**
     * 查询可绑定的防护对象列表
     *
     * 查询可绑定的防护对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUnboundProtectedIpRequest 请求对象
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
     * @param ListUnboundProtectedIpRequest 请求对象
     * @return SyncInvoker<ListUnboundProtectedIpRequest, ListUnboundProtectedIpResponse>
     */
    public SyncInvoker<ListUnboundProtectedIpRequest, ListUnboundProtectedIpResponse> listUnboundProtectedIpInvoker(
        ListUnboundProtectedIpRequest request) {
        return new SyncInvoker<ListUnboundProtectedIpRequest, ListUnboundProtectedIpResponse>(request,
            AadMeta.listUnboundProtectedIp, hcClient);
    }

    /**
     * 查询告警配置
     *
     * 查询告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAlarmConfigRequest 请求对象
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
     * @param ShowAlarmConfigRequest 请求对象
     * @return SyncInvoker<ShowAlarmConfigRequest, ShowAlarmConfigResponse>
     */
    public SyncInvoker<ShowAlarmConfigRequest, ShowAlarmConfigResponse> showAlarmConfigInvoker(
        ShowAlarmConfigRequest request) {
        return new SyncInvoker<ShowAlarmConfigRequest, ShowAlarmConfigResponse>(request, AadMeta.showAlarmConfig,
            hcClient);
    }

    /**
     * 查询策略详情
     *
     * 查询策略详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPolicyRequest 请求对象
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
     * @param ShowPolicyRequest 请求对象
     * @return SyncInvoker<ShowPolicyRequest, ShowPolicyResponse>
     */
    public SyncInvoker<ShowPolicyRequest, ShowPolicyResponse> showPolicyInvoker(ShowPolicyRequest request) {
        return new SyncInvoker<ShowPolicyRequest, ShowPolicyResponse>(request, AadMeta.showPolicy, hcClient);
    }

    /**
     * 设置告警配置
     *
     * 设置告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAlarmConfigRequest 请求对象
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
     * @param UpdateAlarmConfigRequest 请求对象
     * @return SyncInvoker<UpdateAlarmConfigRequest, UpdateAlarmConfigResponse>
     */
    public SyncInvoker<UpdateAlarmConfigRequest, UpdateAlarmConfigResponse> updateAlarmConfigInvoker(
        UpdateAlarmConfigRequest request) {
        return new SyncInvoker<UpdateAlarmConfigRequest, UpdateAlarmConfigResponse>(request, AadMeta.updateAlarmConfig,
            hcClient);
    }

    /**
     * 更新域名信息
     *
     * 更新域名源站配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDomainRequest 请求对象
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
     * @param UpdateDomainRequest 请求对象
     * @return SyncInvoker<UpdateDomainRequest, UpdateDomainResponse>
     */
    public SyncInvoker<UpdateDomainRequest, UpdateDomainResponse> updateDomainInvoker(UpdateDomainRequest request) {
        return new SyncInvoker<UpdateDomainRequest, UpdateDomainResponse>(request, AadMeta.updateDomain, hcClient);
    }

    /**
     * 修改高防实例转发配置的源站IP
     *
     * 修改高防实例转发配置的源站IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceIpRuleRequest 请求对象
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
     * @param UpdateInstanceIpRuleRequest 请求对象
     * @return SyncInvoker<UpdateInstanceIpRuleRequest, UpdateInstanceIpRuleResponse>
     */
    public SyncInvoker<UpdateInstanceIpRuleRequest, UpdateInstanceIpRuleResponse> updateInstanceIpRuleInvoker(
        UpdateInstanceIpRuleRequest request) {
        return new SyncInvoker<UpdateInstanceIpRuleRequest, UpdateInstanceIpRuleResponse>(request,
            AadMeta.updateInstanceIpRule, hcClient);
    }

    /**
     * 更新防护包绑定的全量防护对象
     *
     * 更新防护包绑定的全量防护对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePackageIpRequest 请求对象
     * @return UpdatePackageIpResponse
     */
    public UpdatePackageIpResponse updatePackageIp(UpdatePackageIpRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.updatePackageIp);
    }

    /**
     * 更新防护包绑定的全量防护对象
     *
     * 更新防护包绑定的全量防护对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePackageIpRequest 请求对象
     * @return SyncInvoker<UpdatePackageIpRequest, UpdatePackageIpResponse>
     */
    public SyncInvoker<UpdatePackageIpRequest, UpdatePackageIpResponse> updatePackageIpInvoker(
        UpdatePackageIpRequest request) {
        return new SyncInvoker<UpdatePackageIpRequest, UpdatePackageIpResponse>(request, AadMeta.updatePackageIp,
            hcClient);
    }

    /**
     * 更新防护包名字
     *
     * 更新防护包名字
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePackageNameRequest 请求对象
     * @return UpdatePackageNameResponse
     */
    public UpdatePackageNameResponse updatePackageName(UpdatePackageNameRequest request) {
        return hcClient.syncInvokeHttp(request, AadMeta.updatePackageName);
    }

    /**
     * 更新防护包名字
     *
     * 更新防护包名字
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePackageNameRequest 请求对象
     * @return SyncInvoker<UpdatePackageNameRequest, UpdatePackageNameResponse>
     */
    public SyncInvoker<UpdatePackageNameRequest, UpdatePackageNameResponse> updatePackageNameInvoker(
        UpdatePackageNameRequest request) {
        return new SyncInvoker<UpdatePackageNameRequest, UpdatePackageNameResponse>(request, AadMeta.updatePackageName,
            hcClient);
    }

    /**
     * 更新策略
     *
     * 更新策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePolicyRequest 请求对象
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
     * @param UpdatePolicyRequest 请求对象
     * @return SyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse>
     */
    public SyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse> updatePolicyInvoker(UpdatePolicyRequest request) {
        return new SyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse>(request, AadMeta.updatePolicy, hcClient);
    }

    /**
     * 防护对象设置标签
     *
     * 防护对象设置标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTagForProtectedIpRequest 请求对象
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
     * @param UpdateTagForProtectedIpRequest 请求对象
     * @return SyncInvoker<UpdateTagForProtectedIpRequest, UpdateTagForProtectedIpResponse>
     */
    public SyncInvoker<UpdateTagForProtectedIpRequest, UpdateTagForProtectedIpResponse> updateTagForProtectedIpInvoker(
        UpdateTagForProtectedIpRequest request) {
        return new SyncInvoker<UpdateTagForProtectedIpRequest, UpdateTagForProtectedIpResponse>(request,
            AadMeta.updateTagForProtectedIp, hcClient);
    }

}

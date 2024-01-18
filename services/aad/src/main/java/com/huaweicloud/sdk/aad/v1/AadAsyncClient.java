package com.huaweicloud.sdk.aad.v1;

import com.huaweicloud.sdk.aad.v1.model.AddBlackWhiteIpListRequest;
import com.huaweicloud.sdk.aad.v1.model.AddBlackWhiteIpListResponse;
import com.huaweicloud.sdk.aad.v1.model.AddPolicyBlackAndWhiteIpListRequest;
import com.huaweicloud.sdk.aad.v1.model.AddPolicyBlackAndWhiteIpListResponse;
import com.huaweicloud.sdk.aad.v1.model.AssociateIpToPolicyRequest;
import com.huaweicloud.sdk.aad.v1.model.AssociateIpToPolicyResponse;
import com.huaweicloud.sdk.aad.v1.model.BatchCreateInstanceIpRuleRequest;
import com.huaweicloud.sdk.aad.v1.model.BatchCreateInstanceIpRuleResponse;
import com.huaweicloud.sdk.aad.v1.model.BatchDeleteInstanceIpRuleRequest;
import com.huaweicloud.sdk.aad.v1.model.BatchDeleteInstanceIpRuleResponse;
import com.huaweicloud.sdk.aad.v1.model.CreateAadDomainRequest;
import com.huaweicloud.sdk.aad.v1.model.CreateAadDomainResponse;
import com.huaweicloud.sdk.aad.v1.model.CreateCertificateRequest;
import com.huaweicloud.sdk.aad.v1.model.CreateCertificateResponse;
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
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class AadAsyncClient {

    protected HcClient hcClient;

    public AadAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<AadAsyncClient> newBuilder() {
        ClientBuilder<AadAsyncClient> clientBuilder = new ClientBuilder<>(AadAsyncClient::new, "GlobalCredentials");
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
     * @return CompletableFuture<ExecuteUnblockIpResponse>
     */
    public CompletableFuture<ExecuteUnblockIpResponse> executeUnblockIpAsync(ExecuteUnblockIpRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.executeUnblockIp);
    }

    /**
     * 解封IP
     *
     * 解封IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteUnblockIpRequest 请求对象
     * @return AsyncInvoker<ExecuteUnblockIpRequest, ExecuteUnblockIpResponse>
     */
    public AsyncInvoker<ExecuteUnblockIpRequest, ExecuteUnblockIpResponse> executeUnblockIpAsyncInvoker(
        ExecuteUnblockIpRequest request) {
        return new AsyncInvoker<>(request, AadMeta.executeUnblockIp, hcClient);
    }

    /**
     * 查询租户封堵列表
     *
     * 查询租户封堵列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBlockIpsRequest 请求对象
     * @return CompletableFuture<ListBlockIpsResponse>
     */
    public CompletableFuture<ListBlockIpsResponse> listBlockIpsAsync(ListBlockIpsRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.listBlockIps);
    }

    /**
     * 查询租户封堵列表
     *
     * 查询租户封堵列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBlockIpsRequest 请求对象
     * @return AsyncInvoker<ListBlockIpsRequest, ListBlockIpsResponse>
     */
    public AsyncInvoker<ListBlockIpsRequest, ListBlockIpsResponse> listBlockIpsAsyncInvoker(
        ListBlockIpsRequest request) {
        return new AsyncInvoker<>(request, AadMeta.listBlockIps, hcClient);
    }

    /**
     * 查询解封配额
     *
     * 查询解封配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUnblockQuotaStatisticsRequest 请求对象
     * @return CompletableFuture<ListUnblockQuotaStatisticsResponse>
     */
    public CompletableFuture<ListUnblockQuotaStatisticsResponse> listUnblockQuotaStatisticsAsync(
        ListUnblockQuotaStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.listUnblockQuotaStatistics);
    }

    /**
     * 查询解封配额
     *
     * 查询解封配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUnblockQuotaStatisticsRequest 请求对象
     * @return AsyncInvoker<ListUnblockQuotaStatisticsRequest, ListUnblockQuotaStatisticsResponse>
     */
    public AsyncInvoker<ListUnblockQuotaStatisticsRequest, ListUnblockQuotaStatisticsResponse> listUnblockQuotaStatisticsAsyncInvoker(
        ListUnblockQuotaStatisticsRequest request) {
        return new AsyncInvoker<>(request, AadMeta.listUnblockQuotaStatistics, hcClient);
    }

    /**
     * 查询封堵统计数据
     *
     * 查询封堵统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBlockStatisticsRequest 请求对象
     * @return CompletableFuture<ShowBlockStatisticsResponse>
     */
    public CompletableFuture<ShowBlockStatisticsResponse> showBlockStatisticsAsync(ShowBlockStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.showBlockStatistics);
    }

    /**
     * 查询封堵统计数据
     *
     * 查询封堵统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBlockStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowBlockStatisticsRequest, ShowBlockStatisticsResponse>
     */
    public AsyncInvoker<ShowBlockStatisticsRequest, ShowBlockStatisticsResponse> showBlockStatisticsAsyncInvoker(
        ShowBlockStatisticsRequest request) {
        return new AsyncInvoker<>(request, AadMeta.showBlockStatistics, hcClient);
    }

    /**
     * 查询租户解封记录
     *
     * 查询租户解封记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUnblockRecordRequest 请求对象
     * @return CompletableFuture<ShowUnblockRecordResponse>
     */
    public CompletableFuture<ShowUnblockRecordResponse> showUnblockRecordAsync(ShowUnblockRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.showUnblockRecord);
    }

    /**
     * 查询租户解封记录
     *
     * 查询租户解封记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUnblockRecordRequest 请求对象
     * @return AsyncInvoker<ShowUnblockRecordRequest, ShowUnblockRecordResponse>
     */
    public AsyncInvoker<ShowUnblockRecordRequest, ShowUnblockRecordResponse> showUnblockRecordAsyncInvoker(
        ShowUnblockRecordRequest request) {
        return new AsyncInvoker<>(request, AadMeta.showUnblockRecord, hcClient);
    }

    /**
     * 高防实例添加黑白名单
     *
     * 高防实例添加黑白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddBlackWhiteIpListRequest 请求对象
     * @return CompletableFuture<AddBlackWhiteIpListResponse>
     */
    public CompletableFuture<AddBlackWhiteIpListResponse> addBlackWhiteIpListAsync(AddBlackWhiteIpListRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.addBlackWhiteIpList);
    }

    /**
     * 高防实例添加黑白名单
     *
     * 高防实例添加黑白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddBlackWhiteIpListRequest 请求对象
     * @return AsyncInvoker<AddBlackWhiteIpListRequest, AddBlackWhiteIpListResponse>
     */
    public AsyncInvoker<AddBlackWhiteIpListRequest, AddBlackWhiteIpListResponse> addBlackWhiteIpListAsyncInvoker(
        AddBlackWhiteIpListRequest request) {
        return new AsyncInvoker<>(request, AadMeta.addBlackWhiteIpList, hcClient);
    }

    /**
     * 策略添加黑白名单
     *
     * 策略添加黑白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddPolicyBlackAndWhiteIpListRequest 请求对象
     * @return CompletableFuture<AddPolicyBlackAndWhiteIpListResponse>
     */
    public CompletableFuture<AddPolicyBlackAndWhiteIpListResponse> addPolicyBlackAndWhiteIpListAsync(
        AddPolicyBlackAndWhiteIpListRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.addPolicyBlackAndWhiteIpList);
    }

    /**
     * 策略添加黑白名单
     *
     * 策略添加黑白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddPolicyBlackAndWhiteIpListRequest 请求对象
     * @return AsyncInvoker<AddPolicyBlackAndWhiteIpListRequest, AddPolicyBlackAndWhiteIpListResponse>
     */
    public AsyncInvoker<AddPolicyBlackAndWhiteIpListRequest, AddPolicyBlackAndWhiteIpListResponse> addPolicyBlackAndWhiteIpListAsyncInvoker(
        AddPolicyBlackAndWhiteIpListRequest request) {
        return new AsyncInvoker<>(request, AadMeta.addPolicyBlackAndWhiteIpList, hcClient);
    }

    /**
     * 策略绑定防护对象
     *
     * 策略绑定防护对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateIpToPolicyRequest 请求对象
     * @return CompletableFuture<AssociateIpToPolicyResponse>
     */
    public CompletableFuture<AssociateIpToPolicyResponse> associateIpToPolicyAsync(AssociateIpToPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.associateIpToPolicy);
    }

    /**
     * 策略绑定防护对象
     *
     * 策略绑定防护对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateIpToPolicyRequest 请求对象
     * @return AsyncInvoker<AssociateIpToPolicyRequest, AssociateIpToPolicyResponse>
     */
    public AsyncInvoker<AssociateIpToPolicyRequest, AssociateIpToPolicyResponse> associateIpToPolicyAsyncInvoker(
        AssociateIpToPolicyRequest request) {
        return new AsyncInvoker<>(request, AadMeta.associateIpToPolicy, hcClient);
    }

    /**
     * 批量创建高防实例IP的转发规则
     *
     * 批量创建高防实例IP的转发规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateInstanceIpRuleRequest 请求对象
     * @return CompletableFuture<BatchCreateInstanceIpRuleResponse>
     */
    public CompletableFuture<BatchCreateInstanceIpRuleResponse> batchCreateInstanceIpRuleAsync(
        BatchCreateInstanceIpRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.batchCreateInstanceIpRule);
    }

    /**
     * 批量创建高防实例IP的转发规则
     *
     * 批量创建高防实例IP的转发规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateInstanceIpRuleRequest 请求对象
     * @return AsyncInvoker<BatchCreateInstanceIpRuleRequest, BatchCreateInstanceIpRuleResponse>
     */
    public AsyncInvoker<BatchCreateInstanceIpRuleRequest, BatchCreateInstanceIpRuleResponse> batchCreateInstanceIpRuleAsyncInvoker(
        BatchCreateInstanceIpRuleRequest request) {
        return new AsyncInvoker<>(request, AadMeta.batchCreateInstanceIpRule, hcClient);
    }

    /**
     * 批量删除高防实例IP的转发规则
     *
     * 批量删除高防实例IP的转发规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteInstanceIpRuleRequest 请求对象
     * @return CompletableFuture<BatchDeleteInstanceIpRuleResponse>
     */
    public CompletableFuture<BatchDeleteInstanceIpRuleResponse> batchDeleteInstanceIpRuleAsync(
        BatchDeleteInstanceIpRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.batchDeleteInstanceIpRule);
    }

    /**
     * 批量删除高防实例IP的转发规则
     *
     * 批量删除高防实例IP的转发规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteInstanceIpRuleRequest 请求对象
     * @return AsyncInvoker<BatchDeleteInstanceIpRuleRequest, BatchDeleteInstanceIpRuleResponse>
     */
    public AsyncInvoker<BatchDeleteInstanceIpRuleRequest, BatchDeleteInstanceIpRuleResponse> batchDeleteInstanceIpRuleAsyncInvoker(
        BatchDeleteInstanceIpRuleRequest request) {
        return new AsyncInvoker<>(request, AadMeta.batchDeleteInstanceIpRule, hcClient);
    }

    /**
     * 创建防护域名
     *
     * 创建防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAadDomainRequest 请求对象
     * @return CompletableFuture<CreateAadDomainResponse>
     */
    public CompletableFuture<CreateAadDomainResponse> createAadDomainAsync(CreateAadDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.createAadDomain);
    }

    /**
     * 创建防护域名
     *
     * 创建防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAadDomainRequest 请求对象
     * @return AsyncInvoker<CreateAadDomainRequest, CreateAadDomainResponse>
     */
    public AsyncInvoker<CreateAadDomainRequest, CreateAadDomainResponse> createAadDomainAsyncInvoker(
        CreateAadDomainRequest request) {
        return new AsyncInvoker<>(request, AadMeta.createAadDomain, hcClient);
    }

    /**
     * 上传/修改域名对应证书
     *
     * 上传/修改域名对应证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCertificateRequest 请求对象
     * @return CompletableFuture<CreateCertificateResponse>
     */
    public CompletableFuture<CreateCertificateResponse> createCertificateAsync(CreateCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.createCertificate);
    }

    /**
     * 上传/修改域名对应证书
     *
     * 上传/修改域名对应证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCertificateRequest 请求对象
     * @return AsyncInvoker<CreateCertificateRequest, CreateCertificateResponse>
     */
    public AsyncInvoker<CreateCertificateRequest, CreateCertificateResponse> createCertificateAsyncInvoker(
        CreateCertificateRequest request) {
        return new AsyncInvoker<>(request, AadMeta.createCertificate, hcClient);
    }

    /**
     * 创建策略
     *
     * 创建策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyRequest 请求对象
     * @return CompletableFuture<CreatePolicyResponse>
     */
    public CompletableFuture<CreatePolicyResponse> createPolicyAsync(CreatePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.createPolicy);
    }

    /**
     * 创建策略
     *
     * 创建策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyRequest 请求对象
     * @return AsyncInvoker<CreatePolicyRequest, CreatePolicyResponse>
     */
    public AsyncInvoker<CreatePolicyRequest, CreatePolicyResponse> createPolicyAsyncInvoker(
        CreatePolicyRequest request) {
        return new AsyncInvoker<>(request, AadMeta.createPolicy, hcClient);
    }

    /**
     * 删除告警配置
     *
     * 删除告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlarmConfigRequest 请求对象
     * @return CompletableFuture<DeleteAlarmConfigResponse>
     */
    public CompletableFuture<DeleteAlarmConfigResponse> deleteAlarmConfigAsync(DeleteAlarmConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.deleteAlarmConfig);
    }

    /**
     * 删除告警配置
     *
     * 删除告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlarmConfigRequest 请求对象
     * @return AsyncInvoker<DeleteAlarmConfigRequest, DeleteAlarmConfigResponse>
     */
    public AsyncInvoker<DeleteAlarmConfigRequest, DeleteAlarmConfigResponse> deleteAlarmConfigAsyncInvoker(
        DeleteAlarmConfigRequest request) {
        return new AsyncInvoker<>(request, AadMeta.deleteAlarmConfig, hcClient);
    }

    /**
     * 高防实例删除黑白名单
     *
     * 高防实例删除黑白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBlackWhiteIpListRequest 请求对象
     * @return CompletableFuture<DeleteBlackWhiteIpListResponse>
     */
    public CompletableFuture<DeleteBlackWhiteIpListResponse> deleteBlackWhiteIpListAsync(
        DeleteBlackWhiteIpListRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.deleteBlackWhiteIpList);
    }

    /**
     * 高防实例删除黑白名单
     *
     * 高防实例删除黑白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBlackWhiteIpListRequest 请求对象
     * @return AsyncInvoker<DeleteBlackWhiteIpListRequest, DeleteBlackWhiteIpListResponse>
     */
    public AsyncInvoker<DeleteBlackWhiteIpListRequest, DeleteBlackWhiteIpListResponse> deleteBlackWhiteIpListAsyncInvoker(
        DeleteBlackWhiteIpListRequest request) {
        return new AsyncInvoker<>(request, AadMeta.deleteBlackWhiteIpList, hcClient);
    }

    /**
     * 删除策略
     *
     * 删除策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyRequest 请求对象
     * @return CompletableFuture<DeletePolicyResponse>
     */
    public CompletableFuture<DeletePolicyResponse> deletePolicyAsync(DeletePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.deletePolicy);
    }

    /**
     * 删除策略
     *
     * 删除策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyRequest 请求对象
     * @return AsyncInvoker<DeletePolicyRequest, DeletePolicyResponse>
     */
    public AsyncInvoker<DeletePolicyRequest, DeletePolicyResponse> deletePolicyAsyncInvoker(
        DeletePolicyRequest request) {
        return new AsyncInvoker<>(request, AadMeta.deletePolicy, hcClient);
    }

    /**
     * 策略删除黑白名单
     *
     * 策略删除黑白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyBlackAndWhiteIpListRequest 请求对象
     * @return CompletableFuture<DeletePolicyBlackAndWhiteIpListResponse>
     */
    public CompletableFuture<DeletePolicyBlackAndWhiteIpListResponse> deletePolicyBlackAndWhiteIpListAsync(
        DeletePolicyBlackAndWhiteIpListRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.deletePolicyBlackAndWhiteIpList);
    }

    /**
     * 策略删除黑白名单
     *
     * 策略删除黑白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyBlackAndWhiteIpListRequest 请求对象
     * @return AsyncInvoker<DeletePolicyBlackAndWhiteIpListRequest, DeletePolicyBlackAndWhiteIpListResponse>
     */
    public AsyncInvoker<DeletePolicyBlackAndWhiteIpListRequest, DeletePolicyBlackAndWhiteIpListResponse> deletePolicyBlackAndWhiteIpListAsyncInvoker(
        DeletePolicyBlackAndWhiteIpListRequest request) {
        return new AsyncInvoker<>(request, AadMeta.deletePolicyBlackAndWhiteIpList, hcClient);
    }

    /**
     * 策略解绑防护对象
     *
     * 策略解绑防护对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateIpFromPolicyRequest 请求对象
     * @return CompletableFuture<DisassociateIpFromPolicyResponse>
     */
    public CompletableFuture<DisassociateIpFromPolicyResponse> disassociateIpFromPolicyAsync(
        DisassociateIpFromPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.disassociateIpFromPolicy);
    }

    /**
     * 策略解绑防护对象
     *
     * 策略解绑防护对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateIpFromPolicyRequest 请求对象
     * @return AsyncInvoker<DisassociateIpFromPolicyRequest, DisassociateIpFromPolicyResponse>
     */
    public AsyncInvoker<DisassociateIpFromPolicyRequest, DisassociateIpFromPolicyResponse> disassociateIpFromPolicyAsyncInvoker(
        DisassociateIpFromPolicyRequest request) {
        return new AsyncInvoker<>(request, AadMeta.disassociateIpFromPolicy, hcClient);
    }

    /**
     * 查询域名列表
     *
     * 查询域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainRequest 请求对象
     * @return CompletableFuture<ListDomainResponse>
     */
    public CompletableFuture<ListDomainResponse> listDomainAsync(ListDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.listDomain);
    }

    /**
     * 查询域名列表
     *
     * 查询域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainRequest 请求对象
     * @return AsyncInvoker<ListDomainRequest, ListDomainResponse>
     */
    public AsyncInvoker<ListDomainRequest, ListDomainResponse> listDomainAsyncInvoker(ListDomainRequest request) {
        return new AsyncInvoker<>(request, AadMeta.listDomain, hcClient);
    }

    /**
     * 查询高防实例列表
     *
     * 查询高防实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceRequest 请求对象
     * @return CompletableFuture<ListInstanceResponse>
     */
    public CompletableFuture<ListInstanceResponse> listInstanceAsync(ListInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.listInstance);
    }

    /**
     * 查询高防实例列表
     *
     * 查询高防实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceRequest 请求对象
     * @return AsyncInvoker<ListInstanceRequest, ListInstanceResponse>
     */
    public AsyncInvoker<ListInstanceRequest, ListInstanceResponse> listInstanceAsyncInvoker(
        ListInstanceRequest request) {
        return new AsyncInvoker<>(request, AadMeta.listInstance, hcClient);
    }

    /**
     * 查询域名关联的实例ID
     *
     * 查询域名关联的实例ID
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceIdRequest 请求对象
     * @return CompletableFuture<ListInstanceIdResponse>
     */
    public CompletableFuture<ListInstanceIdResponse> listInstanceIdAsync(ListInstanceIdRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.listInstanceId);
    }

    /**
     * 查询域名关联的实例ID
     *
     * 查询域名关联的实例ID
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceIdRequest 请求对象
     * @return AsyncInvoker<ListInstanceIdRequest, ListInstanceIdResponse>
     */
    public AsyncInvoker<ListInstanceIdRequest, ListInstanceIdResponse> listInstanceIdAsyncInvoker(
        ListInstanceIdRequest request) {
        return new AsyncInvoker<>(request, AadMeta.listInstanceId, hcClient);
    }

    /**
     * 查询高防实例IP的转发规则列表
     *
     * 查询高防实例IP的转发规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceIpRuleRequest 请求对象
     * @return CompletableFuture<ListInstanceIpRuleResponse>
     */
    public CompletableFuture<ListInstanceIpRuleResponse> listInstanceIpRuleAsync(ListInstanceIpRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.listInstanceIpRule);
    }

    /**
     * 查询高防实例IP的转发规则列表
     *
     * 查询高防实例IP的转发规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceIpRuleRequest 请求对象
     * @return AsyncInvoker<ListInstanceIpRuleRequest, ListInstanceIpRuleResponse>
     */
    public AsyncInvoker<ListInstanceIpRuleRequest, ListInstanceIpRuleResponse> listInstanceIpRuleAsyncInvoker(
        ListInstanceIpRuleRequest request) {
        return new AsyncInvoker<>(request, AadMeta.listInstanceIpRule, hcClient);
    }

    /**
     * 查询防护包列表
     *
     * 查询防护包列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPackageRequest 请求对象
     * @return CompletableFuture<ListPackageResponse>
     */
    public CompletableFuture<ListPackageResponse> listPackageAsync(ListPackageRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.listPackage);
    }

    /**
     * 查询防护包列表
     *
     * 查询防护包列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPackageRequest 请求对象
     * @return AsyncInvoker<ListPackageRequest, ListPackageResponse>
     */
    public AsyncInvoker<ListPackageRequest, ListPackageResponse> listPackageAsyncInvoker(ListPackageRequest request) {
        return new AsyncInvoker<>(request, AadMeta.listPackage, hcClient);
    }

    /**
     * 查询流量峰值、攻击计数
     *
     * 查询流量峰值、攻击计数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPeakRequest 请求对象
     * @return CompletableFuture<ListPeakResponse>
     */
    public CompletableFuture<ListPeakResponse> listPeakAsync(ListPeakRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.listPeak);
    }

    /**
     * 查询流量峰值、攻击计数
     *
     * 查询流量峰值、攻击计数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPeakRequest 请求对象
     * @return AsyncInvoker<ListPeakRequest, ListPeakResponse>
     */
    public AsyncInvoker<ListPeakRequest, ListPeakResponse> listPeakAsyncInvoker(ListPeakRequest request) {
        return new AsyncInvoker<>(request, AadMeta.listPeak, hcClient);
    }

    /**
     * 查询策略列表
     *
     * 查询策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyRequest 请求对象
     * @return CompletableFuture<ListPolicyResponse>
     */
    public CompletableFuture<ListPolicyResponse> listPolicyAsync(ListPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.listPolicy);
    }

    /**
     * 查询策略列表
     *
     * 查询策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyRequest 请求对象
     * @return AsyncInvoker<ListPolicyRequest, ListPolicyResponse>
     */
    public AsyncInvoker<ListPolicyRequest, ListPolicyResponse> listPolicyAsyncInvoker(ListPolicyRequest request) {
        return new AsyncInvoker<>(request, AadMeta.listPolicy, hcClient);
    }

    /**
     * 查询防护对象列表
     *
     * 查询防护对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectedIpRequest 请求对象
     * @return CompletableFuture<ListProtectedIpResponse>
     */
    public CompletableFuture<ListProtectedIpResponse> listProtectedIpAsync(ListProtectedIpRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.listProtectedIp);
    }

    /**
     * 查询防护对象列表
     *
     * 查询防护对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectedIpRequest 请求对象
     * @return AsyncInvoker<ListProtectedIpRequest, ListProtectedIpResponse>
     */
    public AsyncInvoker<ListProtectedIpRequest, ListProtectedIpResponse> listProtectedIpAsyncInvoker(
        ListProtectedIpRequest request) {
        return new AsyncInvoker<>(request, AadMeta.listProtectedIp, hcClient);
    }

    /**
     * 查询高防回源IP段列表
     *
     * 查询高防回源IP段列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSourceIpsRequest 请求对象
     * @return CompletableFuture<ListSourceIpsResponse>
     */
    public CompletableFuture<ListSourceIpsResponse> listSourceIpsAsync(ListSourceIpsRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.listSourceIps);
    }

    /**
     * 查询高防回源IP段列表
     *
     * 查询高防回源IP段列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSourceIpsRequest 请求对象
     * @return AsyncInvoker<ListSourceIpsRequest, ListSourceIpsResponse>
     */
    public AsyncInvoker<ListSourceIpsRequest, ListSourceIpsResponse> listSourceIpsAsyncInvoker(
        ListSourceIpsRequest request) {
        return new AsyncInvoker<>(request, AadMeta.listSourceIps, hcClient);
    }

    /**
     * 查询可绑定的防护对象列表
     *
     * 查询可绑定的防护对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUnboundProtectedIpRequest 请求对象
     * @return CompletableFuture<ListUnboundProtectedIpResponse>
     */
    public CompletableFuture<ListUnboundProtectedIpResponse> listUnboundProtectedIpAsync(
        ListUnboundProtectedIpRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.listUnboundProtectedIp);
    }

    /**
     * 查询可绑定的防护对象列表
     *
     * 查询可绑定的防护对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUnboundProtectedIpRequest 请求对象
     * @return AsyncInvoker<ListUnboundProtectedIpRequest, ListUnboundProtectedIpResponse>
     */
    public AsyncInvoker<ListUnboundProtectedIpRequest, ListUnboundProtectedIpResponse> listUnboundProtectedIpAsyncInvoker(
        ListUnboundProtectedIpRequest request) {
        return new AsyncInvoker<>(request, AadMeta.listUnboundProtectedIp, hcClient);
    }

    /**
     * 修改域名WEB基础防护开关/CC防护开关
     *
     * 修改域名WEB基础防护开关/CC防护开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyDomainWebSwitchRequest 请求对象
     * @return CompletableFuture<ModifyDomainWebSwitchResponse>
     */
    public CompletableFuture<ModifyDomainWebSwitchResponse> modifyDomainWebSwitchAsync(
        ModifyDomainWebSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.modifyDomainWebSwitch);
    }

    /**
     * 修改域名WEB基础防护开关/CC防护开关
     *
     * 修改域名WEB基础防护开关/CC防护开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyDomainWebSwitchRequest 请求对象
     * @return AsyncInvoker<ModifyDomainWebSwitchRequest, ModifyDomainWebSwitchResponse>
     */
    public AsyncInvoker<ModifyDomainWebSwitchRequest, ModifyDomainWebSwitchResponse> modifyDomainWebSwitchAsyncInvoker(
        ModifyDomainWebSwitchRequest request) {
        return new AsyncInvoker<>(request, AadMeta.modifyDomainWebSwitch, hcClient);
    }

    /**
     * 查询告警配置
     *
     * 查询告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmConfigRequest 请求对象
     * @return CompletableFuture<ShowAlarmConfigResponse>
     */
    public CompletableFuture<ShowAlarmConfigResponse> showAlarmConfigAsync(ShowAlarmConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.showAlarmConfig);
    }

    /**
     * 查询告警配置
     *
     * 查询告警配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmConfigRequest 请求对象
     * @return AsyncInvoker<ShowAlarmConfigRequest, ShowAlarmConfigResponse>
     */
    public AsyncInvoker<ShowAlarmConfigRequest, ShowAlarmConfigResponse> showAlarmConfigAsyncInvoker(
        ShowAlarmConfigRequest request) {
        return new AsyncInvoker<>(request, AadMeta.showAlarmConfig, hcClient);
    }

    /**
     * 查询策略详情
     *
     * 查询策略详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyRequest 请求对象
     * @return CompletableFuture<ShowPolicyResponse>
     */
    public CompletableFuture<ShowPolicyResponse> showPolicyAsync(ShowPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.showPolicy);
    }

    /**
     * 查询策略详情
     *
     * 查询策略详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyRequest 请求对象
     * @return AsyncInvoker<ShowPolicyRequest, ShowPolicyResponse>
     */
    public AsyncInvoker<ShowPolicyRequest, ShowPolicyResponse> showPolicyAsyncInvoker(ShowPolicyRequest request) {
        return new AsyncInvoker<>(request, AadMeta.showPolicy, hcClient);
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
        return hcClient.asyncInvokeHttp(request, AadMeta.updateAlarmConfig);
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
        return new AsyncInvoker<>(request, AadMeta.updateAlarmConfig, hcClient);
    }

    /**
     * 更新域名信息
     *
     * 更新域名源站配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainRequest 请求对象
     * @return CompletableFuture<UpdateDomainResponse>
     */
    public CompletableFuture<UpdateDomainResponse> updateDomainAsync(UpdateDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.updateDomain);
    }

    /**
     * 更新域名信息
     *
     * 更新域名源站配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainRequest 请求对象
     * @return AsyncInvoker<UpdateDomainRequest, UpdateDomainResponse>
     */
    public AsyncInvoker<UpdateDomainRequest, UpdateDomainResponse> updateDomainAsyncInvoker(
        UpdateDomainRequest request) {
        return new AsyncInvoker<>(request, AadMeta.updateDomain, hcClient);
    }

    /**
     * 修改高防实例转发配置的源站IP
     *
     * 修改高防实例转发配置的源站IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceIpRuleRequest 请求对象
     * @return CompletableFuture<UpdateInstanceIpRuleResponse>
     */
    public CompletableFuture<UpdateInstanceIpRuleResponse> updateInstanceIpRuleAsync(
        UpdateInstanceIpRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.updateInstanceIpRule);
    }

    /**
     * 修改高防实例转发配置的源站IP
     *
     * 修改高防实例转发配置的源站IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceIpRuleRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceIpRuleRequest, UpdateInstanceIpRuleResponse>
     */
    public AsyncInvoker<UpdateInstanceIpRuleRequest, UpdateInstanceIpRuleResponse> updateInstanceIpRuleAsyncInvoker(
        UpdateInstanceIpRuleRequest request) {
        return new AsyncInvoker<>(request, AadMeta.updateInstanceIpRule, hcClient);
    }

    /**
     * 更新防护包绑定的全量防护对象
     *
     * 更新防护包绑定的全量防护对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePackageIpRequest 请求对象
     * @return CompletableFuture<UpdatePackageIpResponse>
     */
    public CompletableFuture<UpdatePackageIpResponse> updatePackageIpAsync(UpdatePackageIpRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.updatePackageIp);
    }

    /**
     * 更新防护包绑定的全量防护对象
     *
     * 更新防护包绑定的全量防护对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePackageIpRequest 请求对象
     * @return AsyncInvoker<UpdatePackageIpRequest, UpdatePackageIpResponse>
     */
    public AsyncInvoker<UpdatePackageIpRequest, UpdatePackageIpResponse> updatePackageIpAsyncInvoker(
        UpdatePackageIpRequest request) {
        return new AsyncInvoker<>(request, AadMeta.updatePackageIp, hcClient);
    }

    /**
     * 更新防护包名字
     *
     * 更新防护包名字
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePackageNameRequest 请求对象
     * @return CompletableFuture<UpdatePackageNameResponse>
     */
    public CompletableFuture<UpdatePackageNameResponse> updatePackageNameAsync(UpdatePackageNameRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.updatePackageName);
    }

    /**
     * 更新防护包名字
     *
     * 更新防护包名字
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePackageNameRequest 请求对象
     * @return AsyncInvoker<UpdatePackageNameRequest, UpdatePackageNameResponse>
     */
    public AsyncInvoker<UpdatePackageNameRequest, UpdatePackageNameResponse> updatePackageNameAsyncInvoker(
        UpdatePackageNameRequest request) {
        return new AsyncInvoker<>(request, AadMeta.updatePackageName, hcClient);
    }

    /**
     * 更新策略
     *
     * 更新策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyRequest 请求对象
     * @return CompletableFuture<UpdatePolicyResponse>
     */
    public CompletableFuture<UpdatePolicyResponse> updatePolicyAsync(UpdatePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.updatePolicy);
    }

    /**
     * 更新策略
     *
     * 更新策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyRequest 请求对象
     * @return AsyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse>
     */
    public AsyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse> updatePolicyAsyncInvoker(
        UpdatePolicyRequest request) {
        return new AsyncInvoker<>(request, AadMeta.updatePolicy, hcClient);
    }

    /**
     * 防护对象设置标签
     *
     * 防护对象设置标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTagForProtectedIpRequest 请求对象
     * @return CompletableFuture<UpdateTagForProtectedIpResponse>
     */
    public CompletableFuture<UpdateTagForProtectedIpResponse> updateTagForProtectedIpAsync(
        UpdateTagForProtectedIpRequest request) {
        return hcClient.asyncInvokeHttp(request, AadMeta.updateTagForProtectedIp);
    }

    /**
     * 防护对象设置标签
     *
     * 防护对象设置标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTagForProtectedIpRequest 请求对象
     * @return AsyncInvoker<UpdateTagForProtectedIpRequest, UpdateTagForProtectedIpResponse>
     */
    public AsyncInvoker<UpdateTagForProtectedIpRequest, UpdateTagForProtectedIpResponse> updateTagForProtectedIpAsyncInvoker(
        UpdateTagForProtectedIpRequest request) {
        return new AsyncInvoker<>(request, AadMeta.updateTagForProtectedIp, hcClient);
    }

}

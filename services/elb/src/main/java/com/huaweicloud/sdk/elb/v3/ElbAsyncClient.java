package com.huaweicloud.sdk.elb.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.elb.v3.model.BatchAddAvailableZonesRequest;
import com.huaweicloud.sdk.elb.v3.model.BatchAddAvailableZonesResponse;
import com.huaweicloud.sdk.elb.v3.model.BatchCreateMembersRequest;
import com.huaweicloud.sdk.elb.v3.model.BatchCreateMembersResponse;
import com.huaweicloud.sdk.elb.v3.model.BatchDeleteIpListRequest;
import com.huaweicloud.sdk.elb.v3.model.BatchDeleteIpListResponse;
import com.huaweicloud.sdk.elb.v3.model.BatchDeleteMembersRequest;
import com.huaweicloud.sdk.elb.v3.model.BatchDeleteMembersResponse;
import com.huaweicloud.sdk.elb.v3.model.BatchRemoveAvailableZonesRequest;
import com.huaweicloud.sdk.elb.v3.model.BatchRemoveAvailableZonesResponse;
import com.huaweicloud.sdk.elb.v3.model.BatchUpdateMembersRequest;
import com.huaweicloud.sdk.elb.v3.model.BatchUpdateMembersResponse;
import com.huaweicloud.sdk.elb.v3.model.BatchUpdatePoliciesPriorityRequest;
import com.huaweicloud.sdk.elb.v3.model.BatchUpdatePoliciesPriorityResponse;
import com.huaweicloud.sdk.elb.v3.model.ChangeLoadbalancerChargeModeRequest;
import com.huaweicloud.sdk.elb.v3.model.ChangeLoadbalancerChargeModeResponse;
import com.huaweicloud.sdk.elb.v3.model.CountPreoccupyIpNumRequest;
import com.huaweicloud.sdk.elb.v3.model.CountPreoccupyIpNumResponse;
import com.huaweicloud.sdk.elb.v3.model.CreateCertificateRequest;
import com.huaweicloud.sdk.elb.v3.model.CreateCertificateResponse;
import com.huaweicloud.sdk.elb.v3.model.CreateHealthMonitorRequest;
import com.huaweicloud.sdk.elb.v3.model.CreateHealthMonitorResponse;
import com.huaweicloud.sdk.elb.v3.model.CreateIpGroupRequest;
import com.huaweicloud.sdk.elb.v3.model.CreateIpGroupResponse;
import com.huaweicloud.sdk.elb.v3.model.CreateL7PolicyRequest;
import com.huaweicloud.sdk.elb.v3.model.CreateL7PolicyResponse;
import com.huaweicloud.sdk.elb.v3.model.CreateL7RuleRequest;
import com.huaweicloud.sdk.elb.v3.model.CreateL7RuleResponse;
import com.huaweicloud.sdk.elb.v3.model.CreateListenerRequest;
import com.huaweicloud.sdk.elb.v3.model.CreateListenerResponse;
import com.huaweicloud.sdk.elb.v3.model.CreateLoadBalancerRequest;
import com.huaweicloud.sdk.elb.v3.model.CreateLoadBalancerResponse;
import com.huaweicloud.sdk.elb.v3.model.CreateLogtankRequest;
import com.huaweicloud.sdk.elb.v3.model.CreateLogtankResponse;
import com.huaweicloud.sdk.elb.v3.model.CreateMasterSlavePoolRequest;
import com.huaweicloud.sdk.elb.v3.model.CreateMasterSlavePoolResponse;
import com.huaweicloud.sdk.elb.v3.model.CreateMemberRequest;
import com.huaweicloud.sdk.elb.v3.model.CreateMemberResponse;
import com.huaweicloud.sdk.elb.v3.model.CreatePoolRequest;
import com.huaweicloud.sdk.elb.v3.model.CreatePoolResponse;
import com.huaweicloud.sdk.elb.v3.model.CreateSecurityPolicyRequest;
import com.huaweicloud.sdk.elb.v3.model.CreateSecurityPolicyResponse;
import com.huaweicloud.sdk.elb.v3.model.DeleteCertificateRequest;
import com.huaweicloud.sdk.elb.v3.model.DeleteCertificateResponse;
import com.huaweicloud.sdk.elb.v3.model.DeleteHealthMonitorRequest;
import com.huaweicloud.sdk.elb.v3.model.DeleteHealthMonitorResponse;
import com.huaweicloud.sdk.elb.v3.model.DeleteIpGroupRequest;
import com.huaweicloud.sdk.elb.v3.model.DeleteIpGroupResponse;
import com.huaweicloud.sdk.elb.v3.model.DeleteL7PolicyRequest;
import com.huaweicloud.sdk.elb.v3.model.DeleteL7PolicyResponse;
import com.huaweicloud.sdk.elb.v3.model.DeleteL7RuleRequest;
import com.huaweicloud.sdk.elb.v3.model.DeleteL7RuleResponse;
import com.huaweicloud.sdk.elb.v3.model.DeleteListenerForceRequest;
import com.huaweicloud.sdk.elb.v3.model.DeleteListenerForceResponse;
import com.huaweicloud.sdk.elb.v3.model.DeleteListenerRequest;
import com.huaweicloud.sdk.elb.v3.model.DeleteListenerResponse;
import com.huaweicloud.sdk.elb.v3.model.DeleteLoadBalancerForceRequest;
import com.huaweicloud.sdk.elb.v3.model.DeleteLoadBalancerForceResponse;
import com.huaweicloud.sdk.elb.v3.model.DeleteLoadBalancerRequest;
import com.huaweicloud.sdk.elb.v3.model.DeleteLoadBalancerResponse;
import com.huaweicloud.sdk.elb.v3.model.DeleteLogtankRequest;
import com.huaweicloud.sdk.elb.v3.model.DeleteLogtankResponse;
import com.huaweicloud.sdk.elb.v3.model.DeleteMasterSlavePoolRequest;
import com.huaweicloud.sdk.elb.v3.model.DeleteMasterSlavePoolResponse;
import com.huaweicloud.sdk.elb.v3.model.DeleteMemberRequest;
import com.huaweicloud.sdk.elb.v3.model.DeleteMemberResponse;
import com.huaweicloud.sdk.elb.v3.model.DeletePoolRequest;
import com.huaweicloud.sdk.elb.v3.model.DeletePoolResponse;
import com.huaweicloud.sdk.elb.v3.model.DeleteSecurityPolicyRequest;
import com.huaweicloud.sdk.elb.v3.model.DeleteSecurityPolicyResponse;
import com.huaweicloud.sdk.elb.v3.model.ListAllMembersRequest;
import com.huaweicloud.sdk.elb.v3.model.ListAllMembersResponse;
import com.huaweicloud.sdk.elb.v3.model.ListApiVersionsRequest;
import com.huaweicloud.sdk.elb.v3.model.ListApiVersionsResponse;
import com.huaweicloud.sdk.elb.v3.model.ListAvailabilityZonesRequest;
import com.huaweicloud.sdk.elb.v3.model.ListAvailabilityZonesResponse;
import com.huaweicloud.sdk.elb.v3.model.ListCertificatesRequest;
import com.huaweicloud.sdk.elb.v3.model.ListCertificatesResponse;
import com.huaweicloud.sdk.elb.v3.model.ListFlavorsRequest;
import com.huaweicloud.sdk.elb.v3.model.ListFlavorsResponse;
import com.huaweicloud.sdk.elb.v3.model.ListHealthMonitorsRequest;
import com.huaweicloud.sdk.elb.v3.model.ListHealthMonitorsResponse;
import com.huaweicloud.sdk.elb.v3.model.ListIpGroupsRequest;
import com.huaweicloud.sdk.elb.v3.model.ListIpGroupsResponse;
import com.huaweicloud.sdk.elb.v3.model.ListL7PoliciesRequest;
import com.huaweicloud.sdk.elb.v3.model.ListL7PoliciesResponse;
import com.huaweicloud.sdk.elb.v3.model.ListL7RulesRequest;
import com.huaweicloud.sdk.elb.v3.model.ListL7RulesResponse;
import com.huaweicloud.sdk.elb.v3.model.ListListenersRequest;
import com.huaweicloud.sdk.elb.v3.model.ListListenersResponse;
import com.huaweicloud.sdk.elb.v3.model.ListLoadBalancersRequest;
import com.huaweicloud.sdk.elb.v3.model.ListLoadBalancersResponse;
import com.huaweicloud.sdk.elb.v3.model.ListLogtanksRequest;
import com.huaweicloud.sdk.elb.v3.model.ListLogtanksResponse;
import com.huaweicloud.sdk.elb.v3.model.ListMasterSlavePoolsRequest;
import com.huaweicloud.sdk.elb.v3.model.ListMasterSlavePoolsResponse;
import com.huaweicloud.sdk.elb.v3.model.ListMembersRequest;
import com.huaweicloud.sdk.elb.v3.model.ListMembersResponse;
import com.huaweicloud.sdk.elb.v3.model.ListPoolsRequest;
import com.huaweicloud.sdk.elb.v3.model.ListPoolsResponse;
import com.huaweicloud.sdk.elb.v3.model.ListQuotaDetailsRequest;
import com.huaweicloud.sdk.elb.v3.model.ListQuotaDetailsResponse;
import com.huaweicloud.sdk.elb.v3.model.ListSecurityPoliciesRequest;
import com.huaweicloud.sdk.elb.v3.model.ListSecurityPoliciesResponse;
import com.huaweicloud.sdk.elb.v3.model.ListSystemSecurityPoliciesRequest;
import com.huaweicloud.sdk.elb.v3.model.ListSystemSecurityPoliciesResponse;
import com.huaweicloud.sdk.elb.v3.model.ShowCertificateRequest;
import com.huaweicloud.sdk.elb.v3.model.ShowCertificateResponse;
import com.huaweicloud.sdk.elb.v3.model.ShowFlavorRequest;
import com.huaweicloud.sdk.elb.v3.model.ShowFlavorResponse;
import com.huaweicloud.sdk.elb.v3.model.ShowHealthMonitorRequest;
import com.huaweicloud.sdk.elb.v3.model.ShowHealthMonitorResponse;
import com.huaweicloud.sdk.elb.v3.model.ShowIpGroupRequest;
import com.huaweicloud.sdk.elb.v3.model.ShowIpGroupResponse;
import com.huaweicloud.sdk.elb.v3.model.ShowL7PolicyRequest;
import com.huaweicloud.sdk.elb.v3.model.ShowL7PolicyResponse;
import com.huaweicloud.sdk.elb.v3.model.ShowL7RuleRequest;
import com.huaweicloud.sdk.elb.v3.model.ShowL7RuleResponse;
import com.huaweicloud.sdk.elb.v3.model.ShowListenerRequest;
import com.huaweicloud.sdk.elb.v3.model.ShowListenerResponse;
import com.huaweicloud.sdk.elb.v3.model.ShowLoadBalancerRequest;
import com.huaweicloud.sdk.elb.v3.model.ShowLoadBalancerResponse;
import com.huaweicloud.sdk.elb.v3.model.ShowLoadBalancerStatusRequest;
import com.huaweicloud.sdk.elb.v3.model.ShowLoadBalancerStatusResponse;
import com.huaweicloud.sdk.elb.v3.model.ShowLogtankRequest;
import com.huaweicloud.sdk.elb.v3.model.ShowLogtankResponse;
import com.huaweicloud.sdk.elb.v3.model.ShowMasterSlavePoolRequest;
import com.huaweicloud.sdk.elb.v3.model.ShowMasterSlavePoolResponse;
import com.huaweicloud.sdk.elb.v3.model.ShowMemberRequest;
import com.huaweicloud.sdk.elb.v3.model.ShowMemberResponse;
import com.huaweicloud.sdk.elb.v3.model.ShowPoolRequest;
import com.huaweicloud.sdk.elb.v3.model.ShowPoolResponse;
import com.huaweicloud.sdk.elb.v3.model.ShowQuotaRequest;
import com.huaweicloud.sdk.elb.v3.model.ShowQuotaResponse;
import com.huaweicloud.sdk.elb.v3.model.ShowSecurityPolicyRequest;
import com.huaweicloud.sdk.elb.v3.model.ShowSecurityPolicyResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdateCertificateRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdateCertificateResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdateHealthMonitorRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdateHealthMonitorResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdateIpGroupRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdateIpGroupResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdateIpListRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdateIpListResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdateL7PolicyRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdateL7PolicyResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdateL7RuleRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdateL7RuleResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdateListenerRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdateListenerResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdateLoadBalancerRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdateLoadBalancerResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdateLogtankRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdateLogtankResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdateMemberRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdateMemberResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdatePoolRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdatePoolResponse;
import com.huaweicloud.sdk.elb.v3.model.UpdateSecurityPolicyRequest;
import com.huaweicloud.sdk.elb.v3.model.UpdateSecurityPolicyResponse;

import java.util.concurrent.CompletableFuture;

public class ElbAsyncClient {

    protected HcClient hcClient;

    public ElbAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ElbAsyncClient> newBuilder() {
        ClientBuilder<ElbAsyncClient> clientBuilder = new ClientBuilder<>(ElbAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 新增负载均衡器可用区
     *
     * 给负载均衡器新增可用区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddAvailableZonesRequest 请求对象
     * @return CompletableFuture<BatchAddAvailableZonesResponse>
     */
    public CompletableFuture<BatchAddAvailableZonesResponse> batchAddAvailableZonesAsync(
        BatchAddAvailableZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.batchAddAvailableZones);
    }

    /**
     * 新增负载均衡器可用区
     *
     * 给负载均衡器新增可用区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddAvailableZonesRequest 请求对象
     * @return AsyncInvoker<BatchAddAvailableZonesRequest, BatchAddAvailableZonesResponse>
     */
    public AsyncInvoker<BatchAddAvailableZonesRequest, BatchAddAvailableZonesResponse> batchAddAvailableZonesAsyncInvoker(
        BatchAddAvailableZonesRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.batchAddAvailableZones, hcClient);
    }

    /**
     * 批量创建后端服务器
     *
     * 在指定pool下批量创建后端服务器。一次最多创建200个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateMembersRequest 请求对象
     * @return CompletableFuture<BatchCreateMembersResponse>
     */
    public CompletableFuture<BatchCreateMembersResponse> batchCreateMembersAsync(BatchCreateMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.batchCreateMembers);
    }

    /**
     * 批量创建后端服务器
     *
     * 在指定pool下批量创建后端服务器。一次最多创建200个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateMembersRequest 请求对象
     * @return AsyncInvoker<BatchCreateMembersRequest, BatchCreateMembersResponse>
     */
    public AsyncInvoker<BatchCreateMembersRequest, BatchCreateMembersResponse> batchCreateMembersAsyncInvoker(
        BatchCreateMembersRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.batchCreateMembers, hcClient);
    }

    /**
     * 批量删除后端服务器
     *
     * 在指定pool下批量删除后端服务器。一次最多添加200个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteMembersRequest 请求对象
     * @return CompletableFuture<BatchDeleteMembersResponse>
     */
    public CompletableFuture<BatchDeleteMembersResponse> batchDeleteMembersAsync(BatchDeleteMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.batchDeleteMembers);
    }

    /**
     * 批量删除后端服务器
     *
     * 在指定pool下批量删除后端服务器。一次最多添加200个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteMembersRequest 请求对象
     * @return AsyncInvoker<BatchDeleteMembersRequest, BatchDeleteMembersResponse>
     */
    public AsyncInvoker<BatchDeleteMembersRequest, BatchDeleteMembersResponse> batchDeleteMembersAsyncInvoker(
        BatchDeleteMembersRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.batchDeleteMembers, hcClient);
    }

    /**
     * 移除负载均衡器可用区
     *
     * 移除负载均衡器的可用区。
     * &gt; 移除可用区可能导致已有链接断开，请谨慎操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRemoveAvailableZonesRequest 请求对象
     * @return CompletableFuture<BatchRemoveAvailableZonesResponse>
     */
    public CompletableFuture<BatchRemoveAvailableZonesResponse> batchRemoveAvailableZonesAsync(
        BatchRemoveAvailableZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.batchRemoveAvailableZones);
    }

    /**
     * 移除负载均衡器可用区
     *
     * 移除负载均衡器的可用区。
     * &gt; 移除可用区可能导致已有链接断开，请谨慎操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRemoveAvailableZonesRequest 请求对象
     * @return AsyncInvoker<BatchRemoveAvailableZonesRequest, BatchRemoveAvailableZonesResponse>
     */
    public AsyncInvoker<BatchRemoveAvailableZonesRequest, BatchRemoveAvailableZonesResponse> batchRemoveAvailableZonesAsyncInvoker(
        BatchRemoveAvailableZonesRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.batchRemoveAvailableZones, hcClient);
    }

    /**
     * 批量更新后端服务器
     *
     * 在指定pool下批量更新后端服务器。一次最多添加200个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateMembersRequest 请求对象
     * @return CompletableFuture<BatchUpdateMembersResponse>
     */
    public CompletableFuture<BatchUpdateMembersResponse> batchUpdateMembersAsync(BatchUpdateMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.batchUpdateMembers);
    }

    /**
     * 批量更新后端服务器
     *
     * 在指定pool下批量更新后端服务器。一次最多添加200个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateMembersRequest 请求对象
     * @return AsyncInvoker<BatchUpdateMembersRequest, BatchUpdateMembersResponse>
     */
    public AsyncInvoker<BatchUpdateMembersRequest, BatchUpdateMembersResponse> batchUpdateMembersAsyncInvoker(
        BatchUpdateMembersRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.batchUpdateMembers, hcClient);
    }

    /**
     * 批量更新转发策略优先级
     *
     * 批量更新转发策略的优先级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdatePoliciesPriorityRequest 请求对象
     * @return CompletableFuture<BatchUpdatePoliciesPriorityResponse>
     */
    public CompletableFuture<BatchUpdatePoliciesPriorityResponse> batchUpdatePoliciesPriorityAsync(
        BatchUpdatePoliciesPriorityRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.batchUpdatePoliciesPriority);
    }

    /**
     * 批量更新转发策略优先级
     *
     * 批量更新转发策略的优先级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdatePoliciesPriorityRequest 请求对象
     * @return AsyncInvoker<BatchUpdatePoliciesPriorityRequest, BatchUpdatePoliciesPriorityResponse>
     */
    public AsyncInvoker<BatchUpdatePoliciesPriorityRequest, BatchUpdatePoliciesPriorityResponse> batchUpdatePoliciesPriorityAsyncInvoker(
        BatchUpdatePoliciesPriorityRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.batchUpdatePoliciesPriority, hcClient);
    }

    /**
     * 变更负载均衡器计费模式
     *
     * 负载均衡器计费模式变更，当前支持的计费模式变更为：
     * 1. 按需计费转包周期计费；
     * 2. 按需按规格计费转按需按使用量计费；
     * 3. 按需按使用量计费转按需按规格计费；
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeLoadbalancerChargeModeRequest 请求对象
     * @return CompletableFuture<ChangeLoadbalancerChargeModeResponse>
     */
    public CompletableFuture<ChangeLoadbalancerChargeModeResponse> changeLoadbalancerChargeModeAsync(
        ChangeLoadbalancerChargeModeRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.changeLoadbalancerChargeMode);
    }

    /**
     * 变更负载均衡器计费模式
     *
     * 负载均衡器计费模式变更，当前支持的计费模式变更为：
     * 1. 按需计费转包周期计费；
     * 2. 按需按规格计费转按需按使用量计费；
     * 3. 按需按使用量计费转按需按规格计费；
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeLoadbalancerChargeModeRequest 请求对象
     * @return AsyncInvoker<ChangeLoadbalancerChargeModeRequest, ChangeLoadbalancerChargeModeResponse>
     */
    public AsyncInvoker<ChangeLoadbalancerChargeModeRequest, ChangeLoadbalancerChargeModeResponse> changeLoadbalancerChargeModeAsyncInvoker(
        ChangeLoadbalancerChargeModeRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.changeLoadbalancerChargeMode, hcClient);
    }

    /**
     * 创建证书
     *
     * 创建证书。用于HTTPS协议监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCertificateRequest 请求对象
     * @return CompletableFuture<CreateCertificateResponse>
     */
    public CompletableFuture<CreateCertificateResponse> createCertificateAsync(CreateCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createCertificate);
    }

    /**
     * 创建证书
     *
     * 创建证书。用于HTTPS协议监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCertificateRequest 请求对象
     * @return AsyncInvoker<CreateCertificateRequest, CreateCertificateResponse>
     */
    public AsyncInvoker<CreateCertificateRequest, CreateCertificateResponse> createCertificateAsyncInvoker(
        CreateCertificateRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.createCertificate, hcClient);
    }

    /**
     * 创建健康检查
     *
     * 创建健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHealthMonitorRequest 请求对象
     * @return CompletableFuture<CreateHealthMonitorResponse>
     */
    public CompletableFuture<CreateHealthMonitorResponse> createHealthMonitorAsync(CreateHealthMonitorRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createHealthMonitor);
    }

    /**
     * 创建健康检查
     *
     * 创建健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHealthMonitorRequest 请求对象
     * @return AsyncInvoker<CreateHealthMonitorRequest, CreateHealthMonitorResponse>
     */
    public AsyncInvoker<CreateHealthMonitorRequest, CreateHealthMonitorResponse> createHealthMonitorAsyncInvoker(
        CreateHealthMonitorRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.createHealthMonitor, hcClient);
    }

    /**
     * 创建转发策略
     *
     * 创建七层转发策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateL7PolicyRequest 请求对象
     * @return CompletableFuture<CreateL7PolicyResponse>
     */
    public CompletableFuture<CreateL7PolicyResponse> createL7PolicyAsync(CreateL7PolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createL7Policy);
    }

    /**
     * 创建转发策略
     *
     * 创建七层转发策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateL7PolicyRequest 请求对象
     * @return AsyncInvoker<CreateL7PolicyRequest, CreateL7PolicyResponse>
     */
    public AsyncInvoker<CreateL7PolicyRequest, CreateL7PolicyResponse> createL7PolicyAsyncInvoker(
        CreateL7PolicyRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.createL7Policy, hcClient);
    }

    /**
     * 创建转发规则
     *
     * 创建七层转发规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateL7RuleRequest 请求对象
     * @return CompletableFuture<CreateL7RuleResponse>
     */
    public CompletableFuture<CreateL7RuleResponse> createL7RuleAsync(CreateL7RuleRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createL7Rule);
    }

    /**
     * 创建转发规则
     *
     * 创建七层转发规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateL7RuleRequest 请求对象
     * @return AsyncInvoker<CreateL7RuleRequest, CreateL7RuleResponse>
     */
    public AsyncInvoker<CreateL7RuleRequest, CreateL7RuleResponse> createL7RuleAsyncInvoker(
        CreateL7RuleRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.createL7Rule, hcClient);
    }

    /**
     * 创建监听器
     *
     * 创建监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateListenerRequest 请求对象
     * @return CompletableFuture<CreateListenerResponse>
     */
    public CompletableFuture<CreateListenerResponse> createListenerAsync(CreateListenerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createListener);
    }

    /**
     * 创建监听器
     *
     * 创建监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateListenerRequest 请求对象
     * @return AsyncInvoker<CreateListenerRequest, CreateListenerResponse>
     */
    public AsyncInvoker<CreateListenerRequest, CreateListenerResponse> createListenerAsyncInvoker(
        CreateListenerRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.createListener, hcClient);
    }

    /**
     * 创建负载均衡器
     *
     * 创建负载均衡器。
     * 1. 若要创建内网IPv4负载均衡器，则需要设置vip_subnet_cidr_id。
     * 2. 若要创建公网IPv4负载均衡器，则需要设置publicip，以及设置vpc_id和vip_subnet_cidr_id这两个参数中的一个。
     * 3. 若要绑定有已有公网IPv4地址，
     * 则需要设置publicip_ids，以及设置vpc_id和vip_subnet_cidr_id这两个参数中的一个。
     * 4. 若要创建内网双栈负载均衡器，则需要设置ipv6_vip_virsubnet_id。
     * 5. 若要创建公网双栈负载均衡器，则需要设置ipv6_vip_virsubnet_id和ipv6_bandwidth。
     * 6. 不支持绑定已有未使用的内网IPv4、内网IPv6或公网IPv6地址。
     * 7. l4_flavor_id需要传入网络型规格id，l7_flavor_id需要传入应用型规格id。
     * 
     * [&gt; 关于计费：
     * - 若billing_info非空时，包周期。
     * - 若billing_info为空，autoscaling.enable&#x3D;true时，弹性计费。
     * - 若billing_info为空，autoscaling.enable&#x3D;false或未设置，charge_mode&#x3D;lcu，按量计费。
     * - 若billing_info为空，autoscaling.enable&#x3D;false或未设置，charge_mode&#x3D;flavor，固定规格按需计费。](tag:hws)
     * [&gt; 不支持创建IPv6地址负载均衡器](tag:dt,dt_test)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLoadBalancerRequest 请求对象
     * @return CompletableFuture<CreateLoadBalancerResponse>
     */
    public CompletableFuture<CreateLoadBalancerResponse> createLoadBalancerAsync(CreateLoadBalancerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createLoadBalancer);
    }

    /**
     * 创建负载均衡器
     *
     * 创建负载均衡器。
     * 1. 若要创建内网IPv4负载均衡器，则需要设置vip_subnet_cidr_id。
     * 2. 若要创建公网IPv4负载均衡器，则需要设置publicip，以及设置vpc_id和vip_subnet_cidr_id这两个参数中的一个。
     * 3. 若要绑定有已有公网IPv4地址，
     * 则需要设置publicip_ids，以及设置vpc_id和vip_subnet_cidr_id这两个参数中的一个。
     * 4. 若要创建内网双栈负载均衡器，则需要设置ipv6_vip_virsubnet_id。
     * 5. 若要创建公网双栈负载均衡器，则需要设置ipv6_vip_virsubnet_id和ipv6_bandwidth。
     * 6. 不支持绑定已有未使用的内网IPv4、内网IPv6或公网IPv6地址。
     * 7. l4_flavor_id需要传入网络型规格id，l7_flavor_id需要传入应用型规格id。
     * 
     * [&gt; 关于计费：
     * - 若billing_info非空时，包周期。
     * - 若billing_info为空，autoscaling.enable&#x3D;true时，弹性计费。
     * - 若billing_info为空，autoscaling.enable&#x3D;false或未设置，charge_mode&#x3D;lcu，按量计费。
     * - 若billing_info为空，autoscaling.enable&#x3D;false或未设置，charge_mode&#x3D;flavor，固定规格按需计费。](tag:hws)
     * [&gt; 不支持创建IPv6地址负载均衡器](tag:dt,dt_test)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLoadBalancerRequest 请求对象
     * @return AsyncInvoker<CreateLoadBalancerRequest, CreateLoadBalancerResponse>
     */
    public AsyncInvoker<CreateLoadBalancerRequest, CreateLoadBalancerResponse> createLoadBalancerAsyncInvoker(
        CreateLoadBalancerRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.createLoadBalancer, hcClient);
    }

    /**
     * 创建云日志
     *
     * 创建云日志。[荷兰region不支持云日志功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLogtankRequest 请求对象
     * @return CompletableFuture<CreateLogtankResponse>
     */
    public CompletableFuture<CreateLogtankResponse> createLogtankAsync(CreateLogtankRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createLogtank);
    }

    /**
     * 创建云日志
     *
     * 创建云日志。[荷兰region不支持云日志功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLogtankRequest 请求对象
     * @return AsyncInvoker<CreateLogtankRequest, CreateLogtankResponse>
     */
    public AsyncInvoker<CreateLogtankRequest, CreateLogtankResponse> createLogtankAsyncInvoker(
        CreateLogtankRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.createLogtank, hcClient);
    }

    /**
     * 创建主备后端服务器组
     *
     * 创建主备后端服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMasterSlavePoolRequest 请求对象
     * @return CompletableFuture<CreateMasterSlavePoolResponse>
     */
    public CompletableFuture<CreateMasterSlavePoolResponse> createMasterSlavePoolAsync(
        CreateMasterSlavePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createMasterSlavePool);
    }

    /**
     * 创建主备后端服务器组
     *
     * 创建主备后端服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMasterSlavePoolRequest 请求对象
     * @return AsyncInvoker<CreateMasterSlavePoolRequest, CreateMasterSlavePoolResponse>
     */
    public AsyncInvoker<CreateMasterSlavePoolRequest, CreateMasterSlavePoolResponse> createMasterSlavePoolAsyncInvoker(
        CreateMasterSlavePoolRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.createMasterSlavePool, hcClient);
    }

    /**
     * 创建后端服务器
     *
     * 创建后端服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMemberRequest 请求对象
     * @return CompletableFuture<CreateMemberResponse>
     */
    public CompletableFuture<CreateMemberResponse> createMemberAsync(CreateMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createMember);
    }

    /**
     * 创建后端服务器
     *
     * 创建后端服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMemberRequest 请求对象
     * @return AsyncInvoker<CreateMemberRequest, CreateMemberResponse>
     */
    public AsyncInvoker<CreateMemberRequest, CreateMemberResponse> createMemberAsyncInvoker(
        CreateMemberRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.createMember, hcClient);
    }

    /**
     * 创建后端服务器组
     *
     * 创建后端服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePoolRequest 请求对象
     * @return CompletableFuture<CreatePoolResponse>
     */
    public CompletableFuture<CreatePoolResponse> createPoolAsync(CreatePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createPool);
    }

    /**
     * 创建后端服务器组
     *
     * 创建后端服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePoolRequest 请求对象
     * @return AsyncInvoker<CreatePoolRequest, CreatePoolResponse>
     */
    public AsyncInvoker<CreatePoolRequest, CreatePoolResponse> createPoolAsyncInvoker(CreatePoolRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.createPool, hcClient);
    }

    /**
     * 创建自定义安全策略
     *
     * 创建自定义安全策略。用于在创建HTTPS监听器时，请求参数中指定security_policy_id来设置监听器的自定义安全策略。
     * 
     * [荷兰region不支持自定义安全策略功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityPolicyRequest 请求对象
     * @return CompletableFuture<CreateSecurityPolicyResponse>
     */
    public CompletableFuture<CreateSecurityPolicyResponse> createSecurityPolicyAsync(
        CreateSecurityPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createSecurityPolicy);
    }

    /**
     * 创建自定义安全策略
     *
     * 创建自定义安全策略。用于在创建HTTPS监听器时，请求参数中指定security_policy_id来设置监听器的自定义安全策略。
     * 
     * [荷兰region不支持自定义安全策略功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityPolicyRequest 请求对象
     * @return AsyncInvoker<CreateSecurityPolicyRequest, CreateSecurityPolicyResponse>
     */
    public AsyncInvoker<CreateSecurityPolicyRequest, CreateSecurityPolicyResponse> createSecurityPolicyAsyncInvoker(
        CreateSecurityPolicyRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.createSecurityPolicy, hcClient);
    }

    /**
     * 删除证书
     *
     * 删除证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCertificateRequest 请求对象
     * @return CompletableFuture<DeleteCertificateResponse>
     */
    public CompletableFuture<DeleteCertificateResponse> deleteCertificateAsync(DeleteCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteCertificate);
    }

    /**
     * 删除证书
     *
     * 删除证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCertificateRequest 请求对象
     * @return AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>
     */
    public AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificateAsyncInvoker(
        DeleteCertificateRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.deleteCertificate, hcClient);
    }

    /**
     * 删除健康检查
     *
     * 删除健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHealthMonitorRequest 请求对象
     * @return CompletableFuture<DeleteHealthMonitorResponse>
     */
    public CompletableFuture<DeleteHealthMonitorResponse> deleteHealthMonitorAsync(DeleteHealthMonitorRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteHealthMonitor);
    }

    /**
     * 删除健康检查
     *
     * 删除健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHealthMonitorRequest 请求对象
     * @return AsyncInvoker<DeleteHealthMonitorRequest, DeleteHealthMonitorResponse>
     */
    public AsyncInvoker<DeleteHealthMonitorRequest, DeleteHealthMonitorResponse> deleteHealthMonitorAsyncInvoker(
        DeleteHealthMonitorRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.deleteHealthMonitor, hcClient);
    }

    /**
     * 删除转发策略
     *
     * 删除七层转发策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteL7PolicyRequest 请求对象
     * @return CompletableFuture<DeleteL7PolicyResponse>
     */
    public CompletableFuture<DeleteL7PolicyResponse> deleteL7PolicyAsync(DeleteL7PolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteL7Policy);
    }

    /**
     * 删除转发策略
     *
     * 删除七层转发策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteL7PolicyRequest 请求对象
     * @return AsyncInvoker<DeleteL7PolicyRequest, DeleteL7PolicyResponse>
     */
    public AsyncInvoker<DeleteL7PolicyRequest, DeleteL7PolicyResponse> deleteL7PolicyAsyncInvoker(
        DeleteL7PolicyRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.deleteL7Policy, hcClient);
    }

    /**
     * 删除转发规则
     *
     * 删除七层转发规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteL7RuleRequest 请求对象
     * @return CompletableFuture<DeleteL7RuleResponse>
     */
    public CompletableFuture<DeleteL7RuleResponse> deleteL7RuleAsync(DeleteL7RuleRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteL7Rule);
    }

    /**
     * 删除转发规则
     *
     * 删除七层转发规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteL7RuleRequest 请求对象
     * @return AsyncInvoker<DeleteL7RuleRequest, DeleteL7RuleResponse>
     */
    public AsyncInvoker<DeleteL7RuleRequest, DeleteL7RuleResponse> deleteL7RuleAsyncInvoker(
        DeleteL7RuleRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.deleteL7Rule, hcClient);
    }

    /**
     * 删除监听器
     *
     * 删除监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteListenerRequest 请求对象
     * @return CompletableFuture<DeleteListenerResponse>
     */
    public CompletableFuture<DeleteListenerResponse> deleteListenerAsync(DeleteListenerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteListener);
    }

    /**
     * 删除监听器
     *
     * 删除监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteListenerRequest 请求对象
     * @return AsyncInvoker<DeleteListenerRequest, DeleteListenerResponse>
     */
    public AsyncInvoker<DeleteListenerRequest, DeleteListenerResponse> deleteListenerAsyncInvoker(
        DeleteListenerRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.deleteListener, hcClient);
    }

    /**
     * 级联删除监听器
     *
     * 删除监听器且级联删除其下子资源（删除监听器、转发策略等，解绑后端服务器组）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteListenerForceRequest 请求对象
     * @return CompletableFuture<DeleteListenerForceResponse>
     */
    public CompletableFuture<DeleteListenerForceResponse> deleteListenerForceAsync(DeleteListenerForceRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteListenerForce);
    }

    /**
     * 级联删除监听器
     *
     * 删除监听器且级联删除其下子资源（删除监听器、转发策略等，解绑后端服务器组）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteListenerForceRequest 请求对象
     * @return AsyncInvoker<DeleteListenerForceRequest, DeleteListenerForceResponse>
     */
    public AsyncInvoker<DeleteListenerForceRequest, DeleteListenerForceResponse> deleteListenerForceAsyncInvoker(
        DeleteListenerForceRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.deleteListenerForce, hcClient);
    }

    /**
     * 删除负载均衡器
     *
     * 删除负载均衡器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLoadBalancerRequest 请求对象
     * @return CompletableFuture<DeleteLoadBalancerResponse>
     */
    public CompletableFuture<DeleteLoadBalancerResponse> deleteLoadBalancerAsync(DeleteLoadBalancerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteLoadBalancer);
    }

    /**
     * 删除负载均衡器
     *
     * 删除负载均衡器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLoadBalancerRequest 请求对象
     * @return AsyncInvoker<DeleteLoadBalancerRequest, DeleteLoadBalancerResponse>
     */
    public AsyncInvoker<DeleteLoadBalancerRequest, DeleteLoadBalancerResponse> deleteLoadBalancerAsyncInvoker(
        DeleteLoadBalancerRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.deleteLoadBalancer, hcClient);
    }

    /**
     * 级联删除负载均衡器
     *
     * 删除负载均衡器且级联删除其下子资源（删除负载均衡器及其绑定的监听器、后端服务器组、后端服务器等一系列资源）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLoadBalancerForceRequest 请求对象
     * @return CompletableFuture<DeleteLoadBalancerForceResponse>
     */
    public CompletableFuture<DeleteLoadBalancerForceResponse> deleteLoadBalancerForceAsync(
        DeleteLoadBalancerForceRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteLoadBalancerForce);
    }

    /**
     * 级联删除负载均衡器
     *
     * 删除负载均衡器且级联删除其下子资源（删除负载均衡器及其绑定的监听器、后端服务器组、后端服务器等一系列资源）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLoadBalancerForceRequest 请求对象
     * @return AsyncInvoker<DeleteLoadBalancerForceRequest, DeleteLoadBalancerForceResponse>
     */
    public AsyncInvoker<DeleteLoadBalancerForceRequest, DeleteLoadBalancerForceResponse> deleteLoadBalancerForceAsyncInvoker(
        DeleteLoadBalancerForceRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.deleteLoadBalancerForce, hcClient);
    }

    /**
     * 删除云日志
     *
     * 删除云日志。[荷兰region不支持云日志功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogtankRequest 请求对象
     * @return CompletableFuture<DeleteLogtankResponse>
     */
    public CompletableFuture<DeleteLogtankResponse> deleteLogtankAsync(DeleteLogtankRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteLogtank);
    }

    /**
     * 删除云日志
     *
     * 删除云日志。[荷兰region不支持云日志功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogtankRequest 请求对象
     * @return AsyncInvoker<DeleteLogtankRequest, DeleteLogtankResponse>
     */
    public AsyncInvoker<DeleteLogtankRequest, DeleteLogtankResponse> deleteLogtankAsyncInvoker(
        DeleteLogtankRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.deleteLogtank, hcClient);
    }

    /**
     * 删除主备后端服务器组
     *
     * 删除主备后端服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMasterSlavePoolRequest 请求对象
     * @return CompletableFuture<DeleteMasterSlavePoolResponse>
     */
    public CompletableFuture<DeleteMasterSlavePoolResponse> deleteMasterSlavePoolAsync(
        DeleteMasterSlavePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteMasterSlavePool);
    }

    /**
     * 删除主备后端服务器组
     *
     * 删除主备后端服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMasterSlavePoolRequest 请求对象
     * @return AsyncInvoker<DeleteMasterSlavePoolRequest, DeleteMasterSlavePoolResponse>
     */
    public AsyncInvoker<DeleteMasterSlavePoolRequest, DeleteMasterSlavePoolResponse> deleteMasterSlavePoolAsyncInvoker(
        DeleteMasterSlavePoolRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.deleteMasterSlavePool, hcClient);
    }

    /**
     * 删除后端服务器
     *
     * 删除后端服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMemberRequest 请求对象
     * @return CompletableFuture<DeleteMemberResponse>
     */
    public CompletableFuture<DeleteMemberResponse> deleteMemberAsync(DeleteMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteMember);
    }

    /**
     * 删除后端服务器
     *
     * 删除后端服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMemberRequest 请求对象
     * @return AsyncInvoker<DeleteMemberRequest, DeleteMemberResponse>
     */
    public AsyncInvoker<DeleteMemberRequest, DeleteMemberResponse> deleteMemberAsyncInvoker(
        DeleteMemberRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.deleteMember, hcClient);
    }

    /**
     * 删除后端服务器组
     *
     * 删除后端服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePoolRequest 请求对象
     * @return CompletableFuture<DeletePoolResponse>
     */
    public CompletableFuture<DeletePoolResponse> deletePoolAsync(DeletePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deletePool);
    }

    /**
     * 删除后端服务器组
     *
     * 删除后端服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePoolRequest 请求对象
     * @return AsyncInvoker<DeletePoolRequest, DeletePoolResponse>
     */
    public AsyncInvoker<DeletePoolRequest, DeletePoolResponse> deletePoolAsyncInvoker(DeletePoolRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.deletePool, hcClient);
    }

    /**
     * 删除自定义安全策略
     *
     * 删除自定义安全策略。[荷兰region不支持自定义安全策略功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityPolicyRequest 请求对象
     * @return CompletableFuture<DeleteSecurityPolicyResponse>
     */
    public CompletableFuture<DeleteSecurityPolicyResponse> deleteSecurityPolicyAsync(
        DeleteSecurityPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteSecurityPolicy);
    }

    /**
     * 删除自定义安全策略
     *
     * 删除自定义安全策略。[荷兰region不支持自定义安全策略功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityPolicyRequest 请求对象
     * @return AsyncInvoker<DeleteSecurityPolicyRequest, DeleteSecurityPolicyResponse>
     */
    public AsyncInvoker<DeleteSecurityPolicyRequest, DeleteSecurityPolicyResponse> deleteSecurityPolicyAsyncInvoker(
        DeleteSecurityPolicyRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.deleteSecurityPolicy, hcClient);
    }

    /**
     * 后端服务器全局列表
     *
     * 查询当前租户下的后端服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllMembersRequest 请求对象
     * @return CompletableFuture<ListAllMembersResponse>
     */
    public CompletableFuture<ListAllMembersResponse> listAllMembersAsync(ListAllMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listAllMembers);
    }

    /**
     * 后端服务器全局列表
     *
     * 查询当前租户下的后端服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllMembersRequest 请求对象
     * @return AsyncInvoker<ListAllMembersRequest, ListAllMembersResponse>
     */
    public AsyncInvoker<ListAllMembersRequest, ListAllMembersResponse> listAllMembersAsyncInvoker(
        ListAllMembersRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.listAllMembers, hcClient);
    }

    /**
     * 查询可用区列表
     *
     * 返回租户创建LB时可使用的可用区集合列表情况。
     * 
     * - 默认情况下，会返回一个可用区集合。
     * 在（如创建LB）设置可用区时，填写的可用区必须包含在可用区集合中、为这个可用区集合的子集。
     * 
     * - 特殊场景下，部分客户要求负载均衡只能创建在指定可用区集合中，此时会返回客户定制的可用区集合。
     * 返回可用区集合可能为一个也可能为多个，比如列表有两个可用区集合\\[az1,az2\\],\\[az2,az3\\]。
     * 在创建负载均衡器时，可以选择创建在多个可用区，但所选的多个可用区必须同属于其中一个可用区集合，
     * 如可以选az2和az3，但不能选择az1和az3。你可以选择多个可用区，只要这些可用区在一个子集中
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailabilityZonesRequest 请求对象
     * @return CompletableFuture<ListAvailabilityZonesResponse>
     */
    public CompletableFuture<ListAvailabilityZonesResponse> listAvailabilityZonesAsync(
        ListAvailabilityZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listAvailabilityZones);
    }

    /**
     * 查询可用区列表
     *
     * 返回租户创建LB时可使用的可用区集合列表情况。
     * 
     * - 默认情况下，会返回一个可用区集合。
     * 在（如创建LB）设置可用区时，填写的可用区必须包含在可用区集合中、为这个可用区集合的子集。
     * 
     * - 特殊场景下，部分客户要求负载均衡只能创建在指定可用区集合中，此时会返回客户定制的可用区集合。
     * 返回可用区集合可能为一个也可能为多个，比如列表有两个可用区集合\\[az1,az2\\],\\[az2,az3\\]。
     * 在创建负载均衡器时，可以选择创建在多个可用区，但所选的多个可用区必须同属于其中一个可用区集合，
     * 如可以选az2和az3，但不能选择az1和az3。你可以选择多个可用区，只要这些可用区在一个子集中
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailabilityZonesRequest 请求对象
     * @return AsyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse>
     */
    public AsyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> listAvailabilityZonesAsyncInvoker(
        ListAvailabilityZonesRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.listAvailabilityZones, hcClient);
    }

    /**
     * 查询证书列表
     *
     * 查询证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertificatesRequest 请求对象
     * @return CompletableFuture<ListCertificatesResponse>
     */
    public CompletableFuture<ListCertificatesResponse> listCertificatesAsync(ListCertificatesRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listCertificates);
    }

    /**
     * 查询证书列表
     *
     * 查询证书列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertificatesRequest 请求对象
     * @return AsyncInvoker<ListCertificatesRequest, ListCertificatesResponse>
     */
    public AsyncInvoker<ListCertificatesRequest, ListCertificatesResponse> listCertificatesAsyncInvoker(
        ListCertificatesRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.listCertificates, hcClient);
    }

    /**
     * 查询规格列表
     *
     * 查询租户在当前region下可用的负载均衡规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return CompletableFuture<ListFlavorsResponse>
     */
    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listFlavors);
    }

    /**
     * 查询规格列表
     *
     * 查询租户在当前region下可用的负载均衡规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsAsyncInvoker(ListFlavorsRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.listFlavors, hcClient);
    }

    /**
     * 查询健康检查列表
     *
     * 健康检查列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHealthMonitorsRequest 请求对象
     * @return CompletableFuture<ListHealthMonitorsResponse>
     */
    public CompletableFuture<ListHealthMonitorsResponse> listHealthMonitorsAsync(ListHealthMonitorsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listHealthMonitors);
    }

    /**
     * 查询健康检查列表
     *
     * 健康检查列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHealthMonitorsRequest 请求对象
     * @return AsyncInvoker<ListHealthMonitorsRequest, ListHealthMonitorsResponse>
     */
    public AsyncInvoker<ListHealthMonitorsRequest, ListHealthMonitorsResponse> listHealthMonitorsAsyncInvoker(
        ListHealthMonitorsRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.listHealthMonitors, hcClient);
    }

    /**
     * 查询转发策略列表
     *
     * 查询七层转发策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListL7PoliciesRequest 请求对象
     * @return CompletableFuture<ListL7PoliciesResponse>
     */
    public CompletableFuture<ListL7PoliciesResponse> listL7PoliciesAsync(ListL7PoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listL7Policies);
    }

    /**
     * 查询转发策略列表
     *
     * 查询七层转发策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListL7PoliciesRequest 请求对象
     * @return AsyncInvoker<ListL7PoliciesRequest, ListL7PoliciesResponse>
     */
    public AsyncInvoker<ListL7PoliciesRequest, ListL7PoliciesResponse> listL7PoliciesAsyncInvoker(
        ListL7PoliciesRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.listL7Policies, hcClient);
    }

    /**
     * 查询转发规则列表
     *
     * 查询转发规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListL7RulesRequest 请求对象
     * @return CompletableFuture<ListL7RulesResponse>
     */
    public CompletableFuture<ListL7RulesResponse> listL7RulesAsync(ListL7RulesRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listL7Rules);
    }

    /**
     * 查询转发规则列表
     *
     * 查询转发规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListL7RulesRequest 请求对象
     * @return AsyncInvoker<ListL7RulesRequest, ListL7RulesResponse>
     */
    public AsyncInvoker<ListL7RulesRequest, ListL7RulesResponse> listL7RulesAsyncInvoker(ListL7RulesRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.listL7Rules, hcClient);
    }

    /**
     * 查询监听器列表
     *
     * 查询监听器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListListenersRequest 请求对象
     * @return CompletableFuture<ListListenersResponse>
     */
    public CompletableFuture<ListListenersResponse> listListenersAsync(ListListenersRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listListeners);
    }

    /**
     * 查询监听器列表
     *
     * 查询监听器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListListenersRequest 请求对象
     * @return AsyncInvoker<ListListenersRequest, ListListenersResponse>
     */
    public AsyncInvoker<ListListenersRequest, ListListenersResponse> listListenersAsyncInvoker(
        ListListenersRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.listListeners, hcClient);
    }

    /**
     * 查询负载均衡器列表
     *
     * 查询负载均衡器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLoadBalancersRequest 请求对象
     * @return CompletableFuture<ListLoadBalancersResponse>
     */
    public CompletableFuture<ListLoadBalancersResponse> listLoadBalancersAsync(ListLoadBalancersRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listLoadBalancers);
    }

    /**
     * 查询负载均衡器列表
     *
     * 查询负载均衡器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLoadBalancersRequest 请求对象
     * @return AsyncInvoker<ListLoadBalancersRequest, ListLoadBalancersResponse>
     */
    public AsyncInvoker<ListLoadBalancersRequest, ListLoadBalancersResponse> listLoadBalancersAsyncInvoker(
        ListLoadBalancersRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.listLoadBalancers, hcClient);
    }

    /**
     * 查询云日志列表
     *
     * 查询云日志列表。[荷兰region不支持云日志功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogtanksRequest 请求对象
     * @return CompletableFuture<ListLogtanksResponse>
     */
    public CompletableFuture<ListLogtanksResponse> listLogtanksAsync(ListLogtanksRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listLogtanks);
    }

    /**
     * 查询云日志列表
     *
     * 查询云日志列表。[荷兰region不支持云日志功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogtanksRequest 请求对象
     * @return AsyncInvoker<ListLogtanksRequest, ListLogtanksResponse>
     */
    public AsyncInvoker<ListLogtanksRequest, ListLogtanksResponse> listLogtanksAsyncInvoker(
        ListLogtanksRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.listLogtanks, hcClient);
    }

    /**
     * 查询主备后端服务器组列表
     *
     * 主备后端服务器组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMasterSlavePoolsRequest 请求对象
     * @return CompletableFuture<ListMasterSlavePoolsResponse>
     */
    public CompletableFuture<ListMasterSlavePoolsResponse> listMasterSlavePoolsAsync(
        ListMasterSlavePoolsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listMasterSlavePools);
    }

    /**
     * 查询主备后端服务器组列表
     *
     * 主备后端服务器组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMasterSlavePoolsRequest 请求对象
     * @return AsyncInvoker<ListMasterSlavePoolsRequest, ListMasterSlavePoolsResponse>
     */
    public AsyncInvoker<ListMasterSlavePoolsRequest, ListMasterSlavePoolsResponse> listMasterSlavePoolsAsyncInvoker(
        ListMasterSlavePoolsRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.listMasterSlavePools, hcClient);
    }

    /**
     * 查询后端服务器列表
     *
     * Pool下的后端服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMembersRequest 请求对象
     * @return CompletableFuture<ListMembersResponse>
     */
    public CompletableFuture<ListMembersResponse> listMembersAsync(ListMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listMembers);
    }

    /**
     * 查询后端服务器列表
     *
     * Pool下的后端服务器列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMembersRequest 请求对象
     * @return AsyncInvoker<ListMembersRequest, ListMembersResponse>
     */
    public AsyncInvoker<ListMembersRequest, ListMembersResponse> listMembersAsyncInvoker(ListMembersRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.listMembers, hcClient);
    }

    /**
     * 查询后端服务器组列表
     *
     * 后端服务器组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoolsRequest 请求对象
     * @return CompletableFuture<ListPoolsResponse>
     */
    public CompletableFuture<ListPoolsResponse> listPoolsAsync(ListPoolsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listPools);
    }

    /**
     * 查询后端服务器组列表
     *
     * 后端服务器组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoolsRequest 请求对象
     * @return AsyncInvoker<ListPoolsRequest, ListPoolsResponse>
     */
    public AsyncInvoker<ListPoolsRequest, ListPoolsResponse> listPoolsAsyncInvoker(ListPoolsRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.listPools, hcClient);
    }

    /**
     * 查询配额使用详情
     *
     * 查询指定项目中负载均衡相关的各类资源的当前配额和已使用配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotaDetailsRequest 请求对象
     * @return CompletableFuture<ListQuotaDetailsResponse>
     */
    public CompletableFuture<ListQuotaDetailsResponse> listQuotaDetailsAsync(ListQuotaDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listQuotaDetails);
    }

    /**
     * 查询配额使用详情
     *
     * 查询指定项目中负载均衡相关的各类资源的当前配额和已使用配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotaDetailsRequest 请求对象
     * @return AsyncInvoker<ListQuotaDetailsRequest, ListQuotaDetailsResponse>
     */
    public AsyncInvoker<ListQuotaDetailsRequest, ListQuotaDetailsResponse> listQuotaDetailsAsyncInvoker(
        ListQuotaDetailsRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.listQuotaDetails, hcClient);
    }

    /**
     * 查询自定义安全策略列表
     *
     * 查询自定义安全策略列表。[荷兰region不支持自定义安全策略功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityPoliciesRequest 请求对象
     * @return CompletableFuture<ListSecurityPoliciesResponse>
     */
    public CompletableFuture<ListSecurityPoliciesResponse> listSecurityPoliciesAsync(
        ListSecurityPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listSecurityPolicies);
    }

    /**
     * 查询自定义安全策略列表
     *
     * 查询自定义安全策略列表。[荷兰region不支持自定义安全策略功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityPoliciesRequest 请求对象
     * @return AsyncInvoker<ListSecurityPoliciesRequest, ListSecurityPoliciesResponse>
     */
    public AsyncInvoker<ListSecurityPoliciesRequest, ListSecurityPoliciesResponse> listSecurityPoliciesAsyncInvoker(
        ListSecurityPoliciesRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.listSecurityPolicies, hcClient);
    }

    /**
     * 查询系统安全策略列表
     *
     * 查询系统安全策略列表。
     * 
     * 系统安全策略为预置的所有租户通用的安全策略，租户不可新增或修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSystemSecurityPoliciesRequest 请求对象
     * @return CompletableFuture<ListSystemSecurityPoliciesResponse>
     */
    public CompletableFuture<ListSystemSecurityPoliciesResponse> listSystemSecurityPoliciesAsync(
        ListSystemSecurityPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listSystemSecurityPolicies);
    }

    /**
     * 查询系统安全策略列表
     *
     * 查询系统安全策略列表。
     * 
     * 系统安全策略为预置的所有租户通用的安全策略，租户不可新增或修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSystemSecurityPoliciesRequest 请求对象
     * @return AsyncInvoker<ListSystemSecurityPoliciesRequest, ListSystemSecurityPoliciesResponse>
     */
    public AsyncInvoker<ListSystemSecurityPoliciesRequest, ListSystemSecurityPoliciesResponse> listSystemSecurityPoliciesAsyncInvoker(
        ListSystemSecurityPoliciesRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.listSystemSecurityPolicies, hcClient);
    }

    /**
     * 查询证书详情
     *
     * 查询证书详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCertificateRequest 请求对象
     * @return CompletableFuture<ShowCertificateResponse>
     */
    public CompletableFuture<ShowCertificateResponse> showCertificateAsync(ShowCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showCertificate);
    }

    /**
     * 查询证书详情
     *
     * 查询证书详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCertificateRequest 请求对象
     * @return AsyncInvoker<ShowCertificateRequest, ShowCertificateResponse>
     */
    public AsyncInvoker<ShowCertificateRequest, ShowCertificateResponse> showCertificateAsyncInvoker(
        ShowCertificateRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.showCertificate, hcClient);
    }

    /**
     * 查询规格详情
     *
     * 查询规格的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlavorRequest 请求对象
     * @return CompletableFuture<ShowFlavorResponse>
     */
    public CompletableFuture<ShowFlavorResponse> showFlavorAsync(ShowFlavorRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showFlavor);
    }

    /**
     * 查询规格详情
     *
     * 查询规格的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlavorRequest 请求对象
     * @return AsyncInvoker<ShowFlavorRequest, ShowFlavorResponse>
     */
    public AsyncInvoker<ShowFlavorRequest, ShowFlavorResponse> showFlavorAsyncInvoker(ShowFlavorRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.showFlavor, hcClient);
    }

    /**
     * 查询健康检查详情
     *
     * 查询健康检查详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHealthMonitorRequest 请求对象
     * @return CompletableFuture<ShowHealthMonitorResponse>
     */
    public CompletableFuture<ShowHealthMonitorResponse> showHealthMonitorAsync(ShowHealthMonitorRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showHealthMonitor);
    }

    /**
     * 查询健康检查详情
     *
     * 查询健康检查详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHealthMonitorRequest 请求对象
     * @return AsyncInvoker<ShowHealthMonitorRequest, ShowHealthMonitorResponse>
     */
    public AsyncInvoker<ShowHealthMonitorRequest, ShowHealthMonitorResponse> showHealthMonitorAsyncInvoker(
        ShowHealthMonitorRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.showHealthMonitor, hcClient);
    }

    /**
     * 查询转发策略详情
     *
     * 查询七层转发策略详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowL7PolicyRequest 请求对象
     * @return CompletableFuture<ShowL7PolicyResponse>
     */
    public CompletableFuture<ShowL7PolicyResponse> showL7PolicyAsync(ShowL7PolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showL7Policy);
    }

    /**
     * 查询转发策略详情
     *
     * 查询七层转发策略详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowL7PolicyRequest 请求对象
     * @return AsyncInvoker<ShowL7PolicyRequest, ShowL7PolicyResponse>
     */
    public AsyncInvoker<ShowL7PolicyRequest, ShowL7PolicyResponse> showL7PolicyAsyncInvoker(
        ShowL7PolicyRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.showL7Policy, hcClient);
    }

    /**
     * 查询转发规则详情
     *
     * 查询七层转发规则详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowL7RuleRequest 请求对象
     * @return CompletableFuture<ShowL7RuleResponse>
     */
    public CompletableFuture<ShowL7RuleResponse> showL7RuleAsync(ShowL7RuleRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showL7Rule);
    }

    /**
     * 查询转发规则详情
     *
     * 查询七层转发规则详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowL7RuleRequest 请求对象
     * @return AsyncInvoker<ShowL7RuleRequest, ShowL7RuleResponse>
     */
    public AsyncInvoker<ShowL7RuleRequest, ShowL7RuleResponse> showL7RuleAsyncInvoker(ShowL7RuleRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.showL7Rule, hcClient);
    }

    /**
     * 查询监听器详情
     *
     * 监听器详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowListenerRequest 请求对象
     * @return CompletableFuture<ShowListenerResponse>
     */
    public CompletableFuture<ShowListenerResponse> showListenerAsync(ShowListenerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showListener);
    }

    /**
     * 查询监听器详情
     *
     * 监听器详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowListenerRequest 请求对象
     * @return AsyncInvoker<ShowListenerRequest, ShowListenerResponse>
     */
    public AsyncInvoker<ShowListenerRequest, ShowListenerResponse> showListenerAsyncInvoker(
        ShowListenerRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.showListener, hcClient);
    }

    /**
     * 查询负载均衡器详情
     *
     * 查询负载均衡器详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLoadBalancerRequest 请求对象
     * @return CompletableFuture<ShowLoadBalancerResponse>
     */
    public CompletableFuture<ShowLoadBalancerResponse> showLoadBalancerAsync(ShowLoadBalancerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showLoadBalancer);
    }

    /**
     * 查询负载均衡器详情
     *
     * 查询负载均衡器详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLoadBalancerRequest 请求对象
     * @return AsyncInvoker<ShowLoadBalancerRequest, ShowLoadBalancerResponse>
     */
    public AsyncInvoker<ShowLoadBalancerRequest, ShowLoadBalancerResponse> showLoadBalancerAsyncInvoker(
        ShowLoadBalancerRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.showLoadBalancer, hcClient);
    }

    /**
     * 查询负载均衡器状态树
     *
     * 查询负载均衡器状态树，包括负载均衡器及其关联的子资源的状态信息。
     * 注意：该接口中的operating_status不一定与对应资源的operating_status相同。
     * 如：当Member的admin_state_up&#x3D;false且operating_status&#x3D;OFFLINE时，
     * 该接口返回member的operating_status&#x3D;DISABLE。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLoadBalancerStatusRequest 请求对象
     * @return CompletableFuture<ShowLoadBalancerStatusResponse>
     */
    public CompletableFuture<ShowLoadBalancerStatusResponse> showLoadBalancerStatusAsync(
        ShowLoadBalancerStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showLoadBalancerStatus);
    }

    /**
     * 查询负载均衡器状态树
     *
     * 查询负载均衡器状态树，包括负载均衡器及其关联的子资源的状态信息。
     * 注意：该接口中的operating_status不一定与对应资源的operating_status相同。
     * 如：当Member的admin_state_up&#x3D;false且operating_status&#x3D;OFFLINE时，
     * 该接口返回member的operating_status&#x3D;DISABLE。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLoadBalancerStatusRequest 请求对象
     * @return AsyncInvoker<ShowLoadBalancerStatusRequest, ShowLoadBalancerStatusResponse>
     */
    public AsyncInvoker<ShowLoadBalancerStatusRequest, ShowLoadBalancerStatusResponse> showLoadBalancerStatusAsyncInvoker(
        ShowLoadBalancerStatusRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.showLoadBalancerStatus, hcClient);
    }

    /**
     * 查询云日志详情
     *
     * 云日志详情。[荷兰region不支持云日志功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogtankRequest 请求对象
     * @return CompletableFuture<ShowLogtankResponse>
     */
    public CompletableFuture<ShowLogtankResponse> showLogtankAsync(ShowLogtankRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showLogtank);
    }

    /**
     * 查询云日志详情
     *
     * 云日志详情。[荷兰region不支持云日志功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogtankRequest 请求对象
     * @return AsyncInvoker<ShowLogtankRequest, ShowLogtankResponse>
     */
    public AsyncInvoker<ShowLogtankRequest, ShowLogtankResponse> showLogtankAsyncInvoker(ShowLogtankRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.showLogtank, hcClient);
    }

    /**
     * 查询主备后端服务器组详情
     *
     * 主备后端服务器组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMasterSlavePoolRequest 请求对象
     * @return CompletableFuture<ShowMasterSlavePoolResponse>
     */
    public CompletableFuture<ShowMasterSlavePoolResponse> showMasterSlavePoolAsync(ShowMasterSlavePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showMasterSlavePool);
    }

    /**
     * 查询主备后端服务器组详情
     *
     * 主备后端服务器组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMasterSlavePoolRequest 请求对象
     * @return AsyncInvoker<ShowMasterSlavePoolRequest, ShowMasterSlavePoolResponse>
     */
    public AsyncInvoker<ShowMasterSlavePoolRequest, ShowMasterSlavePoolResponse> showMasterSlavePoolAsyncInvoker(
        ShowMasterSlavePoolRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.showMasterSlavePool, hcClient);
    }

    /**
     * 查询后端服务器详情
     *
     * 后端服务器详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMemberRequest 请求对象
     * @return CompletableFuture<ShowMemberResponse>
     */
    public CompletableFuture<ShowMemberResponse> showMemberAsync(ShowMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showMember);
    }

    /**
     * 查询后端服务器详情
     *
     * 后端服务器详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMemberRequest 请求对象
     * @return AsyncInvoker<ShowMemberRequest, ShowMemberResponse>
     */
    public AsyncInvoker<ShowMemberRequest, ShowMemberResponse> showMemberAsyncInvoker(ShowMemberRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.showMember, hcClient);
    }

    /**
     * 查询后端服务器组详情
     *
     * 后端服务器组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPoolRequest 请求对象
     * @return CompletableFuture<ShowPoolResponse>
     */
    public CompletableFuture<ShowPoolResponse> showPoolAsync(ShowPoolRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showPool);
    }

    /**
     * 查询后端服务器组详情
     *
     * 后端服务器组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPoolRequest 请求对象
     * @return AsyncInvoker<ShowPoolRequest, ShowPoolResponse>
     */
    public AsyncInvoker<ShowPoolRequest, ShowPoolResponse> showPoolAsyncInvoker(ShowPoolRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.showPool, hcClient);
    }

    /**
     * 查询配额详情
     *
     * 查询指定项目中负载均衡相关的各类资源的当前配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotaRequest 请求对象
     * @return CompletableFuture<ShowQuotaResponse>
     */
    public CompletableFuture<ShowQuotaResponse> showQuotaAsync(ShowQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showQuota);
    }

    /**
     * 查询配额详情
     *
     * 查询指定项目中负载均衡相关的各类资源的当前配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotaRequest 请求对象
     * @return AsyncInvoker<ShowQuotaRequest, ShowQuotaResponse>
     */
    public AsyncInvoker<ShowQuotaRequest, ShowQuotaResponse> showQuotaAsyncInvoker(ShowQuotaRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.showQuota, hcClient);
    }

    /**
     * 查询自定义安全策略详情
     *
     * 查询自定义安全策略详情。[荷兰region不支持自定义安全策略功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityPolicyRequest 请求对象
     * @return CompletableFuture<ShowSecurityPolicyResponse>
     */
    public CompletableFuture<ShowSecurityPolicyResponse> showSecurityPolicyAsync(ShowSecurityPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showSecurityPolicy);
    }

    /**
     * 查询自定义安全策略详情
     *
     * 查询自定义安全策略详情。[荷兰region不支持自定义安全策略功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityPolicyRequest 请求对象
     * @return AsyncInvoker<ShowSecurityPolicyRequest, ShowSecurityPolicyResponse>
     */
    public AsyncInvoker<ShowSecurityPolicyRequest, ShowSecurityPolicyResponse> showSecurityPolicyAsyncInvoker(
        ShowSecurityPolicyRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.showSecurityPolicy, hcClient);
    }

    /**
     * 更新证书
     *
     * 更新证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCertificateRequest 请求对象
     * @return CompletableFuture<UpdateCertificateResponse>
     */
    public CompletableFuture<UpdateCertificateResponse> updateCertificateAsync(UpdateCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateCertificate);
    }

    /**
     * 更新证书
     *
     * 更新证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCertificateRequest 请求对象
     * @return AsyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse>
     */
    public AsyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse> updateCertificateAsyncInvoker(
        UpdateCertificateRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.updateCertificate, hcClient);
    }

    /**
     * 更新健康检查
     *
     * 更新健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHealthMonitorRequest 请求对象
     * @return CompletableFuture<UpdateHealthMonitorResponse>
     */
    public CompletableFuture<UpdateHealthMonitorResponse> updateHealthMonitorAsync(UpdateHealthMonitorRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateHealthMonitor);
    }

    /**
     * 更新健康检查
     *
     * 更新健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHealthMonitorRequest 请求对象
     * @return AsyncInvoker<UpdateHealthMonitorRequest, UpdateHealthMonitorResponse>
     */
    public AsyncInvoker<UpdateHealthMonitorRequest, UpdateHealthMonitorResponse> updateHealthMonitorAsyncInvoker(
        UpdateHealthMonitorRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.updateHealthMonitor, hcClient);
    }

    /**
     * 更新转发策略
     *
     * 更新七层转发策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateL7PolicyRequest 请求对象
     * @return CompletableFuture<UpdateL7PolicyResponse>
     */
    public CompletableFuture<UpdateL7PolicyResponse> updateL7PolicyAsync(UpdateL7PolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateL7Policy);
    }

    /**
     * 更新转发策略
     *
     * 更新七层转发策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateL7PolicyRequest 请求对象
     * @return AsyncInvoker<UpdateL7PolicyRequest, UpdateL7PolicyResponse>
     */
    public AsyncInvoker<UpdateL7PolicyRequest, UpdateL7PolicyResponse> updateL7PolicyAsyncInvoker(
        UpdateL7PolicyRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.updateL7Policy, hcClient);
    }

    /**
     * 更新转发规则
     *
     * 更新七层转发规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateL7RuleRequest 请求对象
     * @return CompletableFuture<UpdateL7RuleResponse>
     */
    public CompletableFuture<UpdateL7RuleResponse> updateL7RuleAsync(UpdateL7RuleRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateL7Rule);
    }

    /**
     * 更新转发规则
     *
     * 更新七层转发规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateL7RuleRequest 请求对象
     * @return AsyncInvoker<UpdateL7RuleRequest, UpdateL7RuleResponse>
     */
    public AsyncInvoker<UpdateL7RuleRequest, UpdateL7RuleResponse> updateL7RuleAsyncInvoker(
        UpdateL7RuleRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.updateL7Rule, hcClient);
    }

    /**
     * 更新监听器
     *
     * 更新监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateListenerRequest 请求对象
     * @return CompletableFuture<UpdateListenerResponse>
     */
    public CompletableFuture<UpdateListenerResponse> updateListenerAsync(UpdateListenerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateListener);
    }

    /**
     * 更新监听器
     *
     * 更新监听器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateListenerRequest 请求对象
     * @return AsyncInvoker<UpdateListenerRequest, UpdateListenerResponse>
     */
    public AsyncInvoker<UpdateListenerRequest, UpdateListenerResponse> updateListenerAsyncInvoker(
        UpdateListenerRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.updateListener, hcClient);
    }

    /**
     * 更新负载均衡器
     *
     * 更新负载均衡器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLoadBalancerRequest 请求对象
     * @return CompletableFuture<UpdateLoadBalancerResponse>
     */
    public CompletableFuture<UpdateLoadBalancerResponse> updateLoadBalancerAsync(UpdateLoadBalancerRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateLoadBalancer);
    }

    /**
     * 更新负载均衡器
     *
     * 更新负载均衡器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLoadBalancerRequest 请求对象
     * @return AsyncInvoker<UpdateLoadBalancerRequest, UpdateLoadBalancerResponse>
     */
    public AsyncInvoker<UpdateLoadBalancerRequest, UpdateLoadBalancerResponse> updateLoadBalancerAsyncInvoker(
        UpdateLoadBalancerRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.updateLoadBalancer, hcClient);
    }

    /**
     * 更新云日志
     *
     * 更新云日志。[荷兰region不支持云日志功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLogtankRequest 请求对象
     * @return CompletableFuture<UpdateLogtankResponse>
     */
    public CompletableFuture<UpdateLogtankResponse> updateLogtankAsync(UpdateLogtankRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateLogtank);
    }

    /**
     * 更新云日志
     *
     * 更新云日志。[荷兰region不支持云日志功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLogtankRequest 请求对象
     * @return AsyncInvoker<UpdateLogtankRequest, UpdateLogtankResponse>
     */
    public AsyncInvoker<UpdateLogtankRequest, UpdateLogtankResponse> updateLogtankAsyncInvoker(
        UpdateLogtankRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.updateLogtank, hcClient);
    }

    /**
     * 更新后端服务器
     *
     * 更新后端服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMemberRequest 请求对象
     * @return CompletableFuture<UpdateMemberResponse>
     */
    public CompletableFuture<UpdateMemberResponse> updateMemberAsync(UpdateMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateMember);
    }

    /**
     * 更新后端服务器
     *
     * 更新后端服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMemberRequest 请求对象
     * @return AsyncInvoker<UpdateMemberRequest, UpdateMemberResponse>
     */
    public AsyncInvoker<UpdateMemberRequest, UpdateMemberResponse> updateMemberAsyncInvoker(
        UpdateMemberRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.updateMember, hcClient);
    }

    /**
     * 更新后端服务器组
     *
     * 更新后端服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePoolRequest 请求对象
     * @return CompletableFuture<UpdatePoolResponse>
     */
    public CompletableFuture<UpdatePoolResponse> updatePoolAsync(UpdatePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updatePool);
    }

    /**
     * 更新后端服务器组
     *
     * 更新后端服务器组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePoolRequest 请求对象
     * @return AsyncInvoker<UpdatePoolRequest, UpdatePoolResponse>
     */
    public AsyncInvoker<UpdatePoolRequest, UpdatePoolResponse> updatePoolAsyncInvoker(UpdatePoolRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.updatePool, hcClient);
    }

    /**
     * 更新自定义安全策略
     *
     * 更新自定义安全策略。[荷兰region不支持自定义安全策略功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityPolicyRequest 请求对象
     * @return CompletableFuture<UpdateSecurityPolicyResponse>
     */
    public CompletableFuture<UpdateSecurityPolicyResponse> updateSecurityPolicyAsync(
        UpdateSecurityPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateSecurityPolicy);
    }

    /**
     * 更新自定义安全策略
     *
     * 更新自定义安全策略。[荷兰region不支持自定义安全策略功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateSecurityPolicyRequest, UpdateSecurityPolicyResponse>
     */
    public AsyncInvoker<UpdateSecurityPolicyRequest, UpdateSecurityPolicyResponse> updateSecurityPolicyAsyncInvoker(
        UpdateSecurityPolicyRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.updateSecurityPolicy, hcClient);
    }

    /**
     * 查询API版本列表信息
     *
     * 返回ELB当前所有可用的API版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
     * @return CompletableFuture<ListApiVersionsResponse>
     */
    public CompletableFuture<ListApiVersionsResponse> listApiVersionsAsync(ListApiVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listApiVersions);
    }

    /**
     * 查询API版本列表信息
     *
     * 返回ELB当前所有可用的API版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
     * @return AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsAsyncInvoker(
        ListApiVersionsRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.listApiVersions, hcClient);
    }

    /**
     * 删除IP地址组的IP列表项
     *
     * 批量删除IP地址组的IP列表信息。[荷兰region不支持该API](tag:dt,dt_test)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteIpListRequest 请求对象
     * @return CompletableFuture<BatchDeleteIpListResponse>
     */
    public CompletableFuture<BatchDeleteIpListResponse> batchDeleteIpListAsync(BatchDeleteIpListRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.batchDeleteIpList);
    }

    /**
     * 删除IP地址组的IP列表项
     *
     * 批量删除IP地址组的IP列表信息。[荷兰region不支持该API](tag:dt,dt_test)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteIpListRequest 请求对象
     * @return AsyncInvoker<BatchDeleteIpListRequest, BatchDeleteIpListResponse>
     */
    public AsyncInvoker<BatchDeleteIpListRequest, BatchDeleteIpListResponse> batchDeleteIpListAsyncInvoker(
        BatchDeleteIpListRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.batchDeleteIpList, hcClient);
    }

    /**
     * 计算预占IP数
     *
     * 计算以下几种场景的预占用IP数量：
     * 
     * - 计算创建LB的第一个七层监听器后总占用IP数量：
     * 传入loadbalancer_id、l7_flavor_id为空、ip_target_enable不传或为false。
     * 
     * - 计算LB规格变更或开启跨VPC后总占用IP数量：
     * 传入参数loadbalancer_id，及l7_flavor_id不为空或ip_target_enable为true。
     * 
     * - 计算创建LB所需IP数量：传入参数availability_zone_id，
     * 及可选参数l7_flavor_id、ip_target_enable、ip_version，不能传loadbalancer_id。
     * 
     * 说明：
     * - 计算出来的预占IP数大于等于最终实际占用的IP数。
     * - 总占用IP数量，即整个LB所占用的IP数量。
     * 
     * [不支持传入l7_flavor_id](tag:hcso,fcs,fcs_vm,mix,hcso_g42,hcso_g42_b)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountPreoccupyIpNumRequest 请求对象
     * @return CompletableFuture<CountPreoccupyIpNumResponse>
     */
    public CompletableFuture<CountPreoccupyIpNumResponse> countPreoccupyIpNumAsync(CountPreoccupyIpNumRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.countPreoccupyIpNum);
    }

    /**
     * 计算预占IP数
     *
     * 计算以下几种场景的预占用IP数量：
     * 
     * - 计算创建LB的第一个七层监听器后总占用IP数量：
     * 传入loadbalancer_id、l7_flavor_id为空、ip_target_enable不传或为false。
     * 
     * - 计算LB规格变更或开启跨VPC后总占用IP数量：
     * 传入参数loadbalancer_id，及l7_flavor_id不为空或ip_target_enable为true。
     * 
     * - 计算创建LB所需IP数量：传入参数availability_zone_id，
     * 及可选参数l7_flavor_id、ip_target_enable、ip_version，不能传loadbalancer_id。
     * 
     * 说明：
     * - 计算出来的预占IP数大于等于最终实际占用的IP数。
     * - 总占用IP数量，即整个LB所占用的IP数量。
     * 
     * [不支持传入l7_flavor_id](tag:hcso,fcs,fcs_vm,mix,hcso_g42,hcso_g42_b)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountPreoccupyIpNumRequest 请求对象
     * @return AsyncInvoker<CountPreoccupyIpNumRequest, CountPreoccupyIpNumResponse>
     */
    public AsyncInvoker<CountPreoccupyIpNumRequest, CountPreoccupyIpNumResponse> countPreoccupyIpNumAsyncInvoker(
        CountPreoccupyIpNumRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.countPreoccupyIpNum, hcClient);
    }

    /**
     * 创建IP地址组
     *
     * 创建IP地址组。输入的ip可为ip地址或者CIDR子网，支持IPV4和IPV6。
     * 
     * 需要注意0.0.0.0与0.0.0.0/32视为重复，0:0:0:0:0:0:0:1与::1与::1/128视为重复，只会保存其中一个。
     * 
     * [荷兰region不支持IP地址组功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIpGroupRequest 请求对象
     * @return CompletableFuture<CreateIpGroupResponse>
     */
    public CompletableFuture<CreateIpGroupResponse> createIpGroupAsync(CreateIpGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.createIpGroup);
    }

    /**
     * 创建IP地址组
     *
     * 创建IP地址组。输入的ip可为ip地址或者CIDR子网，支持IPV4和IPV6。
     * 
     * 需要注意0.0.0.0与0.0.0.0/32视为重复，0:0:0:0:0:0:0:1与::1与::1/128视为重复，只会保存其中一个。
     * 
     * [荷兰region不支持IP地址组功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIpGroupRequest 请求对象
     * @return AsyncInvoker<CreateIpGroupRequest, CreateIpGroupResponse>
     */
    public AsyncInvoker<CreateIpGroupRequest, CreateIpGroupResponse> createIpGroupAsyncInvoker(
        CreateIpGroupRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.createIpGroup, hcClient);
    }

    /**
     * 删除IP地址组
     *
     * 删除ip地址组。[荷兰region不支持IP地址组功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIpGroupRequest 请求对象
     * @return CompletableFuture<DeleteIpGroupResponse>
     */
    public CompletableFuture<DeleteIpGroupResponse> deleteIpGroupAsync(DeleteIpGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.deleteIpGroup);
    }

    /**
     * 删除IP地址组
     *
     * 删除ip地址组。[荷兰region不支持IP地址组功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIpGroupRequest 请求对象
     * @return AsyncInvoker<DeleteIpGroupRequest, DeleteIpGroupResponse>
     */
    public AsyncInvoker<DeleteIpGroupRequest, DeleteIpGroupResponse> deleteIpGroupAsyncInvoker(
        DeleteIpGroupRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.deleteIpGroup, hcClient);
    }

    /**
     * 查询IP地址组列表
     *
     * 查询IP地址组列表。[荷兰region不支持IP地址组功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpGroupsRequest 请求对象
     * @return CompletableFuture<ListIpGroupsResponse>
     */
    public CompletableFuture<ListIpGroupsResponse> listIpGroupsAsync(ListIpGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.listIpGroups);
    }

    /**
     * 查询IP地址组列表
     *
     * 查询IP地址组列表。[荷兰region不支持IP地址组功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpGroupsRequest 请求对象
     * @return AsyncInvoker<ListIpGroupsRequest, ListIpGroupsResponse>
     */
    public AsyncInvoker<ListIpGroupsRequest, ListIpGroupsResponse> listIpGroupsAsyncInvoker(
        ListIpGroupsRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.listIpGroups, hcClient);
    }

    /**
     * 查询IP地址组详情
     *
     * 获取IP地址组详情。[荷兰region不支持IP地址组功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIpGroupRequest 请求对象
     * @return CompletableFuture<ShowIpGroupResponse>
     */
    public CompletableFuture<ShowIpGroupResponse> showIpGroupAsync(ShowIpGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.showIpGroup);
    }

    /**
     * 查询IP地址组详情
     *
     * 获取IP地址组详情。[荷兰region不支持IP地址组功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIpGroupRequest 请求对象
     * @return AsyncInvoker<ShowIpGroupRequest, ShowIpGroupResponse>
     */
    public AsyncInvoker<ShowIpGroupRequest, ShowIpGroupResponse> showIpGroupAsyncInvoker(ShowIpGroupRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.showIpGroup, hcClient);
    }

    /**
     * 更新IP地址组
     *
     * 更新IP地址组，只支持全量更新IP。即IP地址组中的ip_list将被全量覆盖，不在请求参数中的IP地址将被移除。
     * 输入的ip可为ip地址或者CIDR子网，支持IPV4和IPV6。
     * 
     * 需要注意0.0.0.0与0.0.0.0/32视为重复，0:0:0:0:0:0:0:1与::1与::1/128视为重复，只会保存其中一个。
     * 
     * [荷兰region不支持IP地址组功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIpGroupRequest 请求对象
     * @return CompletableFuture<UpdateIpGroupResponse>
     */
    public CompletableFuture<UpdateIpGroupResponse> updateIpGroupAsync(UpdateIpGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateIpGroup);
    }

    /**
     * 更新IP地址组
     *
     * 更新IP地址组，只支持全量更新IP。即IP地址组中的ip_list将被全量覆盖，不在请求参数中的IP地址将被移除。
     * 输入的ip可为ip地址或者CIDR子网，支持IPV4和IPV6。
     * 
     * 需要注意0.0.0.0与0.0.0.0/32视为重复，0:0:0:0:0:0:0:1与::1与::1/128视为重复，只会保存其中一个。
     * 
     * [荷兰region不支持IP地址组功能，请勿使用。](tag:dt)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIpGroupRequest 请求对象
     * @return AsyncInvoker<UpdateIpGroupRequest, UpdateIpGroupResponse>
     */
    public AsyncInvoker<UpdateIpGroupRequest, UpdateIpGroupResponse> updateIpGroupAsyncInvoker(
        UpdateIpGroupRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.updateIpGroup, hcClient);
    }

    /**
     * 更新IP地址组的IP列表项
     *
     * 添加新的IP地址到IP地址组的IP列表信息，或更新已有IP地址的描述。[荷兰region不支持该API](tag:dt,dt_test)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIpListRequest 请求对象
     * @return CompletableFuture<UpdateIpListResponse>
     */
    public CompletableFuture<UpdateIpListResponse> updateIpListAsync(UpdateIpListRequest request) {
        return hcClient.asyncInvokeHttp(request, ElbMeta.updateIpList);
    }

    /**
     * 更新IP地址组的IP列表项
     *
     * 添加新的IP地址到IP地址组的IP列表信息，或更新已有IP地址的描述。[荷兰region不支持该API](tag:dt,dt_test)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIpListRequest 请求对象
     * @return AsyncInvoker<UpdateIpListRequest, UpdateIpListResponse>
     */
    public AsyncInvoker<UpdateIpListRequest, UpdateIpListResponse> updateIpListAsyncInvoker(
        UpdateIpListRequest request) {
        return new AsyncInvoker<>(request, ElbMeta.updateIpList, hcClient);
    }

}

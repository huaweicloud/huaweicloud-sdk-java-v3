package com.huaweicloud.sdk.ces.v2;

import com.huaweicloud.sdk.ces.v2.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CesAsyncClient {

    protected HcClient hcClient;

    public CesAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CesAsyncClient> newBuilder() {
        return new ClientBuilder<>(CesAsyncClient::new);
    }

    /**
     * 批量增加告警规则资源
     *
     * 批量增加告警规则资源(资源分组类型的告警规则不支持)，资源分组类型的修改请使用资源分组管理相关接口
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddAlarmRuleResourcesRequest 请求对象
     * @return CompletableFuture<AddAlarmRuleResourcesResponse>
     */
    public CompletableFuture<AddAlarmRuleResourcesResponse> addAlarmRuleResourcesAsync(
        AddAlarmRuleResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.addAlarmRuleResources);
    }

    /**
     * 批量增加告警规则资源
     *
     * 批量增加告警规则资源(资源分组类型的告警规则不支持)，资源分组类型的修改请使用资源分组管理相关接口
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddAlarmRuleResourcesRequest 请求对象
     * @return AsyncInvoker<AddAlarmRuleResourcesRequest, AddAlarmRuleResourcesResponse>
     */
    public AsyncInvoker<AddAlarmRuleResourcesRequest, AddAlarmRuleResourcesResponse> addAlarmRuleResourcesAsyncInvoker(
        AddAlarmRuleResourcesRequest request) {
        return new AsyncInvoker<AddAlarmRuleResourcesRequest, AddAlarmRuleResourcesResponse>(request,
            CesMeta.addAlarmRuleResources, hcClient);
    }

    /**
     * 批量删除告警规则
     *
     * 批量删除告警规则V2接口
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeleteAlarmRulesRequest 请求对象
     * @return CompletableFuture<BatchDeleteAlarmRulesResponse>
     */
    public CompletableFuture<BatchDeleteAlarmRulesResponse> batchDeleteAlarmRulesAsync(
        BatchDeleteAlarmRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.batchDeleteAlarmRules);
    }

    /**
     * 批量删除告警规则
     *
     * 批量删除告警规则V2接口
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeleteAlarmRulesRequest 请求对象
     * @return AsyncInvoker<BatchDeleteAlarmRulesRequest, BatchDeleteAlarmRulesResponse>
     */
    public AsyncInvoker<BatchDeleteAlarmRulesRequest, BatchDeleteAlarmRulesResponse> batchDeleteAlarmRulesAsyncInvoker(
        BatchDeleteAlarmRulesRequest request) {
        return new AsyncInvoker<BatchDeleteAlarmRulesRequest, BatchDeleteAlarmRulesResponse>(request,
            CesMeta.batchDeleteAlarmRules, hcClient);
    }

    /**
     * 批量启停告警规则
     *
     * 批量启停告警规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchEnableAlarmRulesRequest 请求对象
     * @return CompletableFuture<BatchEnableAlarmRulesResponse>
     */
    public CompletableFuture<BatchEnableAlarmRulesResponse> batchEnableAlarmRulesAsync(
        BatchEnableAlarmRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.batchEnableAlarmRules);
    }

    /**
     * 批量启停告警规则
     *
     * 批量启停告警规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchEnableAlarmRulesRequest 请求对象
     * @return AsyncInvoker<BatchEnableAlarmRulesRequest, BatchEnableAlarmRulesResponse>
     */
    public AsyncInvoker<BatchEnableAlarmRulesRequest, BatchEnableAlarmRulesResponse> batchEnableAlarmRulesAsyncInvoker(
        BatchEnableAlarmRulesRequest request) {
        return new AsyncInvoker<BatchEnableAlarmRulesRequest, BatchEnableAlarmRulesResponse>(request,
            CesMeta.batchEnableAlarmRules, hcClient);
    }

    /**
     * 创建告警规则
     *
     * 创建告警规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateAlarmRulesRequest 请求对象
     * @return CompletableFuture<CreateAlarmRulesResponse>
     */
    public CompletableFuture<CreateAlarmRulesResponse> createAlarmRulesAsync(CreateAlarmRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.createAlarmRules);
    }

    /**
     * 创建告警规则
     *
     * 创建告警规则
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateAlarmRulesRequest 请求对象
     * @return AsyncInvoker<CreateAlarmRulesRequest, CreateAlarmRulesResponse>
     */
    public AsyncInvoker<CreateAlarmRulesRequest, CreateAlarmRulesResponse> createAlarmRulesAsyncInvoker(
        CreateAlarmRulesRequest request) {
        return new AsyncInvoker<CreateAlarmRulesRequest, CreateAlarmRulesResponse>(request, CesMeta.createAlarmRules,
            hcClient);
    }

    /**
     * 批量删除告警规则资源
     *
     * 批量删除告警规则资源（资源分组类型的告警规则不支持），资源分组类型的修改请使用资源分组管理相关接口
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteAlarmRuleResourcesRequest 请求对象
     * @return CompletableFuture<DeleteAlarmRuleResourcesResponse>
     */
    public CompletableFuture<DeleteAlarmRuleResourcesResponse> deleteAlarmRuleResourcesAsync(
        DeleteAlarmRuleResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.deleteAlarmRuleResources);
    }

    /**
     * 批量删除告警规则资源
     *
     * 批量删除告警规则资源（资源分组类型的告警规则不支持），资源分组类型的修改请使用资源分组管理相关接口
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteAlarmRuleResourcesRequest 请求对象
     * @return AsyncInvoker<DeleteAlarmRuleResourcesRequest, DeleteAlarmRuleResourcesResponse>
     */
    public AsyncInvoker<DeleteAlarmRuleResourcesRequest, DeleteAlarmRuleResourcesResponse> deleteAlarmRuleResourcesAsyncInvoker(
        DeleteAlarmRuleResourcesRequest request) {
        return new AsyncInvoker<DeleteAlarmRuleResourcesRequest, DeleteAlarmRuleResourcesResponse>(request,
            CesMeta.deleteAlarmRuleResources, hcClient);
    }

    /**
     * 查询主机监控维度指标信息
     *
     * 根据ECS/BMS资源ID查询磁盘、挂载点、进程、显卡、RAID控制器维度指标信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAgentDimensionInfoRequest 请求对象
     * @return CompletableFuture<ListAgentDimensionInfoResponse>
     */
    public CompletableFuture<ListAgentDimensionInfoResponse> listAgentDimensionInfoAsync(
        ListAgentDimensionInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listAgentDimensionInfo);
    }

    /**
     * 查询主机监控维度指标信息
     *
     * 根据ECS/BMS资源ID查询磁盘、挂载点、进程、显卡、RAID控制器维度指标信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAgentDimensionInfoRequest 请求对象
     * @return AsyncInvoker<ListAgentDimensionInfoRequest, ListAgentDimensionInfoResponse>
     */
    public AsyncInvoker<ListAgentDimensionInfoRequest, ListAgentDimensionInfoResponse> listAgentDimensionInfoAsyncInvoker(
        ListAgentDimensionInfoRequest request) {
        return new AsyncInvoker<ListAgentDimensionInfoRequest, ListAgentDimensionInfoResponse>(request,
            CesMeta.listAgentDimensionInfo, hcClient);
    }

    /**
     * 查询告警记录列表
     *
     * 查询告警记录列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAlarmHistoriesRequest 请求对象
     * @return CompletableFuture<ListAlarmHistoriesResponse>
     */
    public CompletableFuture<ListAlarmHistoriesResponse> listAlarmHistoriesAsync(ListAlarmHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listAlarmHistories);
    }

    /**
     * 查询告警记录列表
     *
     * 查询告警记录列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAlarmHistoriesRequest 请求对象
     * @return AsyncInvoker<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse>
     */
    public AsyncInvoker<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse> listAlarmHistoriesAsyncInvoker(
        ListAlarmHistoriesRequest request) {
        return new AsyncInvoker<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse>(request,
            CesMeta.listAlarmHistories, hcClient);
    }

    /**
     * 查询告警规则策略列表
     *
     * 根据告警规则ID查询策略列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAlarmRulePoliciesRequest 请求对象
     * @return CompletableFuture<ListAlarmRulePoliciesResponse>
     */
    public CompletableFuture<ListAlarmRulePoliciesResponse> listAlarmRulePoliciesAsync(
        ListAlarmRulePoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listAlarmRulePolicies);
    }

    /**
     * 查询告警规则策略列表
     *
     * 根据告警规则ID查询策略列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAlarmRulePoliciesRequest 请求对象
     * @return AsyncInvoker<ListAlarmRulePoliciesRequest, ListAlarmRulePoliciesResponse>
     */
    public AsyncInvoker<ListAlarmRulePoliciesRequest, ListAlarmRulePoliciesResponse> listAlarmRulePoliciesAsyncInvoker(
        ListAlarmRulePoliciesRequest request) {
        return new AsyncInvoker<ListAlarmRulePoliciesRequest, ListAlarmRulePoliciesResponse>(request,
            CesMeta.listAlarmRulePolicies, hcClient);
    }

    /**
     * 查询告警规则资源列表
     *
     * 根据告警规则ID查询告警规则资源列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAlarmRuleResourcesRequest 请求对象
     * @return CompletableFuture<ListAlarmRuleResourcesResponse>
     */
    public CompletableFuture<ListAlarmRuleResourcesResponse> listAlarmRuleResourcesAsync(
        ListAlarmRuleResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listAlarmRuleResources);
    }

    /**
     * 查询告警规则资源列表
     *
     * 根据告警规则ID查询告警规则资源列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAlarmRuleResourcesRequest 请求对象
     * @return AsyncInvoker<ListAlarmRuleResourcesRequest, ListAlarmRuleResourcesResponse>
     */
    public AsyncInvoker<ListAlarmRuleResourcesRequest, ListAlarmRuleResourcesResponse> listAlarmRuleResourcesAsyncInvoker(
        ListAlarmRuleResourcesRequest request) {
        return new AsyncInvoker<ListAlarmRuleResourcesRequest, ListAlarmRuleResourcesResponse>(request,
            CesMeta.listAlarmRuleResources, hcClient);
    }

    /**
     * 查询告警规则列表
     *
     * 查询告警规则列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAlarmRulesRequest 请求对象
     * @return CompletableFuture<ListAlarmRulesResponse>
     */
    public CompletableFuture<ListAlarmRulesResponse> listAlarmRulesAsync(ListAlarmRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listAlarmRules);
    }

    /**
     * 查询告警规则列表
     *
     * 查询告警规则列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAlarmRulesRequest 请求对象
     * @return AsyncInvoker<ListAlarmRulesRequest, ListAlarmRulesResponse>
     */
    public AsyncInvoker<ListAlarmRulesRequest, ListAlarmRulesResponse> listAlarmRulesAsyncInvoker(
        ListAlarmRulesRequest request) {
        return new AsyncInvoker<ListAlarmRulesRequest, ListAlarmRulesResponse>(request, CesMeta.listAlarmRules,
            hcClient);
    }

    /**
     * 修改告警规则策略(全量修改)
     *
     * 修改告警规则策略(全量修改)
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateAlarmRulePoliciesRequest 请求对象
     * @return CompletableFuture<UpdateAlarmRulePoliciesResponse>
     */
    public CompletableFuture<UpdateAlarmRulePoliciesResponse> updateAlarmRulePoliciesAsync(
        UpdateAlarmRulePoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.updateAlarmRulePolicies);
    }

    /**
     * 修改告警规则策略(全量修改)
     *
     * 修改告警规则策略(全量修改)
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateAlarmRulePoliciesRequest 请求对象
     * @return AsyncInvoker<UpdateAlarmRulePoliciesRequest, UpdateAlarmRulePoliciesResponse>
     */
    public AsyncInvoker<UpdateAlarmRulePoliciesRequest, UpdateAlarmRulePoliciesResponse> updateAlarmRulePoliciesAsyncInvoker(
        UpdateAlarmRulePoliciesRequest request) {
        return new AsyncInvoker<UpdateAlarmRulePoliciesRequest, UpdateAlarmRulePoliciesResponse>(request,
            CesMeta.updateAlarmRulePolicies, hcClient);
    }

}

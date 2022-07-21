package com.huaweicloud.sdk.ces.v2;

import com.huaweicloud.sdk.ces.v2.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CesClient {

    protected HcClient hcClient;

    public CesClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CesClient> newBuilder() {
        return new ClientBuilder<>(CesClient::new);
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
     * @return AddAlarmRuleResourcesResponse
     */
    public AddAlarmRuleResourcesResponse addAlarmRuleResources(AddAlarmRuleResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.addAlarmRuleResources);
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
     * @return SyncInvoker<AddAlarmRuleResourcesRequest, AddAlarmRuleResourcesResponse>
     */
    public SyncInvoker<AddAlarmRuleResourcesRequest, AddAlarmRuleResourcesResponse> addAlarmRuleResourcesInvoker(
        AddAlarmRuleResourcesRequest request) {
        return new SyncInvoker<AddAlarmRuleResourcesRequest, AddAlarmRuleResourcesResponse>(request,
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
     * @return BatchDeleteAlarmRulesResponse
     */
    public BatchDeleteAlarmRulesResponse batchDeleteAlarmRules(BatchDeleteAlarmRulesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.batchDeleteAlarmRules);
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
     * @return SyncInvoker<BatchDeleteAlarmRulesRequest, BatchDeleteAlarmRulesResponse>
     */
    public SyncInvoker<BatchDeleteAlarmRulesRequest, BatchDeleteAlarmRulesResponse> batchDeleteAlarmRulesInvoker(
        BatchDeleteAlarmRulesRequest request) {
        return new SyncInvoker<BatchDeleteAlarmRulesRequest, BatchDeleteAlarmRulesResponse>(request,
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
     * @return BatchEnableAlarmRulesResponse
     */
    public BatchEnableAlarmRulesResponse batchEnableAlarmRules(BatchEnableAlarmRulesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.batchEnableAlarmRules);
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
     * @return SyncInvoker<BatchEnableAlarmRulesRequest, BatchEnableAlarmRulesResponse>
     */
    public SyncInvoker<BatchEnableAlarmRulesRequest, BatchEnableAlarmRulesResponse> batchEnableAlarmRulesInvoker(
        BatchEnableAlarmRulesRequest request) {
        return new SyncInvoker<BatchEnableAlarmRulesRequest, BatchEnableAlarmRulesResponse>(request,
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
     * @return CreateAlarmRulesResponse
     */
    public CreateAlarmRulesResponse createAlarmRules(CreateAlarmRulesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.createAlarmRules);
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
     * @return SyncInvoker<CreateAlarmRulesRequest, CreateAlarmRulesResponse>
     */
    public SyncInvoker<CreateAlarmRulesRequest, CreateAlarmRulesResponse> createAlarmRulesInvoker(
        CreateAlarmRulesRequest request) {
        return new SyncInvoker<CreateAlarmRulesRequest, CreateAlarmRulesResponse>(request, CesMeta.createAlarmRules,
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
     * @return DeleteAlarmRuleResourcesResponse
     */
    public DeleteAlarmRuleResourcesResponse deleteAlarmRuleResources(DeleteAlarmRuleResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.deleteAlarmRuleResources);
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
     * @return SyncInvoker<DeleteAlarmRuleResourcesRequest, DeleteAlarmRuleResourcesResponse>
     */
    public SyncInvoker<DeleteAlarmRuleResourcesRequest, DeleteAlarmRuleResourcesResponse> deleteAlarmRuleResourcesInvoker(
        DeleteAlarmRuleResourcesRequest request) {
        return new SyncInvoker<DeleteAlarmRuleResourcesRequest, DeleteAlarmRuleResourcesResponse>(request,
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
     * @return ListAgentDimensionInfoResponse
     */
    public ListAgentDimensionInfoResponse listAgentDimensionInfo(ListAgentDimensionInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listAgentDimensionInfo);
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
     * @return SyncInvoker<ListAgentDimensionInfoRequest, ListAgentDimensionInfoResponse>
     */
    public SyncInvoker<ListAgentDimensionInfoRequest, ListAgentDimensionInfoResponse> listAgentDimensionInfoInvoker(
        ListAgentDimensionInfoRequest request) {
        return new SyncInvoker<ListAgentDimensionInfoRequest, ListAgentDimensionInfoResponse>(request,
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
     * @return ListAlarmHistoriesResponse
     */
    public ListAlarmHistoriesResponse listAlarmHistories(ListAlarmHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listAlarmHistories);
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
     * @return SyncInvoker<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse>
     */
    public SyncInvoker<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse> listAlarmHistoriesInvoker(
        ListAlarmHistoriesRequest request) {
        return new SyncInvoker<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse>(request,
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
     * @return ListAlarmRulePoliciesResponse
     */
    public ListAlarmRulePoliciesResponse listAlarmRulePolicies(ListAlarmRulePoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listAlarmRulePolicies);
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
     * @return SyncInvoker<ListAlarmRulePoliciesRequest, ListAlarmRulePoliciesResponse>
     */
    public SyncInvoker<ListAlarmRulePoliciesRequest, ListAlarmRulePoliciesResponse> listAlarmRulePoliciesInvoker(
        ListAlarmRulePoliciesRequest request) {
        return new SyncInvoker<ListAlarmRulePoliciesRequest, ListAlarmRulePoliciesResponse>(request,
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
     * @return ListAlarmRuleResourcesResponse
     */
    public ListAlarmRuleResourcesResponse listAlarmRuleResources(ListAlarmRuleResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listAlarmRuleResources);
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
     * @return SyncInvoker<ListAlarmRuleResourcesRequest, ListAlarmRuleResourcesResponse>
     */
    public SyncInvoker<ListAlarmRuleResourcesRequest, ListAlarmRuleResourcesResponse> listAlarmRuleResourcesInvoker(
        ListAlarmRuleResourcesRequest request) {
        return new SyncInvoker<ListAlarmRuleResourcesRequest, ListAlarmRuleResourcesResponse>(request,
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
     * @return ListAlarmRulesResponse
     */
    public ListAlarmRulesResponse listAlarmRules(ListAlarmRulesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listAlarmRules);
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
     * @return SyncInvoker<ListAlarmRulesRequest, ListAlarmRulesResponse>
     */
    public SyncInvoker<ListAlarmRulesRequest, ListAlarmRulesResponse> listAlarmRulesInvoker(
        ListAlarmRulesRequest request) {
        return new SyncInvoker<ListAlarmRulesRequest, ListAlarmRulesResponse>(request, CesMeta.listAlarmRules,
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
     * @return UpdateAlarmRulePoliciesResponse
     */
    public UpdateAlarmRulePoliciesResponse updateAlarmRulePolicies(UpdateAlarmRulePoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.updateAlarmRulePolicies);
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
     * @return SyncInvoker<UpdateAlarmRulePoliciesRequest, UpdateAlarmRulePoliciesResponse>
     */
    public SyncInvoker<UpdateAlarmRulePoliciesRequest, UpdateAlarmRulePoliciesResponse> updateAlarmRulePoliciesInvoker(
        UpdateAlarmRulePoliciesRequest request) {
        return new SyncInvoker<UpdateAlarmRulePoliciesRequest, UpdateAlarmRulePoliciesResponse>(request,
            CesMeta.updateAlarmRulePolicies, hcClient);
    }

}

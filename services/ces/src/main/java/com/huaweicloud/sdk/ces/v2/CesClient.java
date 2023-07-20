package com.huaweicloud.sdk.ces.v2;

import com.huaweicloud.sdk.ces.v2.model.AddAlarmRuleResourcesRequest;
import com.huaweicloud.sdk.ces.v2.model.AddAlarmRuleResourcesResponse;
import com.huaweicloud.sdk.ces.v2.model.BatchCreateResourcesRequest;
import com.huaweicloud.sdk.ces.v2.model.BatchCreateResourcesResponse;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteAlarmRulesRequest;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteAlarmRulesResponse;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteAlarmTemplatesRequest;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteAlarmTemplatesResponse;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteResourceGroupsRequest;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteResourceGroupsResponse;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteResourcesRequest;
import com.huaweicloud.sdk.ces.v2.model.BatchDeleteResourcesResponse;
import com.huaweicloud.sdk.ces.v2.model.BatchEnableAlarmRulesRequest;
import com.huaweicloud.sdk.ces.v2.model.BatchEnableAlarmRulesResponse;
import com.huaweicloud.sdk.ces.v2.model.CreateAlarmRulesRequest;
import com.huaweicloud.sdk.ces.v2.model.CreateAlarmRulesResponse;
import com.huaweicloud.sdk.ces.v2.model.CreateAlarmTemplateRequest;
import com.huaweicloud.sdk.ces.v2.model.CreateAlarmTemplateResponse;
import com.huaweicloud.sdk.ces.v2.model.CreateResourceGroupRequest;
import com.huaweicloud.sdk.ces.v2.model.CreateResourceGroupResponse;
import com.huaweicloud.sdk.ces.v2.model.DeleteAlarmRuleResourcesRequest;
import com.huaweicloud.sdk.ces.v2.model.DeleteAlarmRuleResourcesResponse;
import com.huaweicloud.sdk.ces.v2.model.ListAgentDimensionInfoRequest;
import com.huaweicloud.sdk.ces.v2.model.ListAgentDimensionInfoResponse;
import com.huaweicloud.sdk.ces.v2.model.ListAlarmHistoriesRequest;
import com.huaweicloud.sdk.ces.v2.model.ListAlarmHistoriesResponse;
import com.huaweicloud.sdk.ces.v2.model.ListAlarmRulePoliciesRequest;
import com.huaweicloud.sdk.ces.v2.model.ListAlarmRulePoliciesResponse;
import com.huaweicloud.sdk.ces.v2.model.ListAlarmRuleResourcesRequest;
import com.huaweicloud.sdk.ces.v2.model.ListAlarmRuleResourcesResponse;
import com.huaweicloud.sdk.ces.v2.model.ListAlarmRulesRequest;
import com.huaweicloud.sdk.ces.v2.model.ListAlarmRulesResponse;
import com.huaweicloud.sdk.ces.v2.model.ListAlarmTemplateAssociationAlarmsRequest;
import com.huaweicloud.sdk.ces.v2.model.ListAlarmTemplateAssociationAlarmsResponse;
import com.huaweicloud.sdk.ces.v2.model.ListAlarmTemplatesRequest;
import com.huaweicloud.sdk.ces.v2.model.ListAlarmTemplatesResponse;
import com.huaweicloud.sdk.ces.v2.model.ListResourceGroupsRequest;
import com.huaweicloud.sdk.ces.v2.model.ListResourceGroupsResponse;
import com.huaweicloud.sdk.ces.v2.model.ListResourceGroupsServicesResourcesRequest;
import com.huaweicloud.sdk.ces.v2.model.ListResourceGroupsServicesResourcesResponse;
import com.huaweicloud.sdk.ces.v2.model.ShowAlarmTemplateRequest;
import com.huaweicloud.sdk.ces.v2.model.ShowAlarmTemplateResponse;
import com.huaweicloud.sdk.ces.v2.model.ShowResourceGroupRequest;
import com.huaweicloud.sdk.ces.v2.model.ShowResourceGroupResponse;
import com.huaweicloud.sdk.ces.v2.model.UpdateAlarmRulePoliciesRequest;
import com.huaweicloud.sdk.ces.v2.model.UpdateAlarmRulePoliciesResponse;
import com.huaweicloud.sdk.ces.v2.model.UpdateAlarmTemplateRequest;
import com.huaweicloud.sdk.ces.v2.model.UpdateAlarmTemplateResponse;
import com.huaweicloud.sdk.ces.v2.model.UpdateResourceGroupRequest;
import com.huaweicloud.sdk.ces.v2.model.UpdateResourceGroupResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CesClient {

    protected HcClient hcClient;

    public CesClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CesClient> newBuilder() {
        ClientBuilder<CesClient> clientBuilder = new ClientBuilder<>(CesClient::new);
        return clientBuilder;
    }

    /**
     * 批量增加告警规则资源
     *
     * 批量增加告警规则资源(资源分组类型的告警规则不支持)，资源分组类型的修改请使用资源分组管理相关接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 自定义资源分组批量增加关联资源
     *
     * 给自定义资源分组,即类型为手动添加的资源分组,批量增加关联资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateResourcesRequest 请求对象
     * @return BatchCreateResourcesResponse
     */
    public BatchCreateResourcesResponse batchCreateResources(BatchCreateResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.batchCreateResources);
    }

    /**
     * 自定义资源分组批量增加关联资源
     *
     * 给自定义资源分组,即类型为手动添加的资源分组,批量增加关联资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateResourcesRequest 请求对象
     * @return SyncInvoker<BatchCreateResourcesRequest, BatchCreateResourcesResponse>
     */
    public SyncInvoker<BatchCreateResourcesRequest, BatchCreateResourcesResponse> batchCreateResourcesInvoker(
        BatchCreateResourcesRequest request) {
        return new SyncInvoker<BatchCreateResourcesRequest, BatchCreateResourcesResponse>(request,
            CesMeta.batchCreateResources, hcClient);
    }

    /**
     * 批量删除告警规则
     *
     * 批量删除告警规则V2接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 批量删除自定义告警模板
     *
     * 批量删除自定义告警模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteAlarmTemplatesRequest 请求对象
     * @return BatchDeleteAlarmTemplatesResponse
     */
    public BatchDeleteAlarmTemplatesResponse batchDeleteAlarmTemplates(BatchDeleteAlarmTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.batchDeleteAlarmTemplates);
    }

    /**
     * 批量删除自定义告警模板
     *
     * 批量删除自定义告警模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteAlarmTemplatesRequest 请求对象
     * @return SyncInvoker<BatchDeleteAlarmTemplatesRequest, BatchDeleteAlarmTemplatesResponse>
     */
    public SyncInvoker<BatchDeleteAlarmTemplatesRequest, BatchDeleteAlarmTemplatesResponse> batchDeleteAlarmTemplatesInvoker(
        BatchDeleteAlarmTemplatesRequest request) {
        return new SyncInvoker<BatchDeleteAlarmTemplatesRequest, BatchDeleteAlarmTemplatesResponse>(request,
            CesMeta.batchDeleteAlarmTemplates, hcClient);
    }

    /**
     * 批量删除资源分组
     *
     * 批量删除资源分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteResourceGroupsRequest 请求对象
     * @return BatchDeleteResourceGroupsResponse
     */
    public BatchDeleteResourceGroupsResponse batchDeleteResourceGroups(BatchDeleteResourceGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.batchDeleteResourceGroups);
    }

    /**
     * 批量删除资源分组
     *
     * 批量删除资源分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteResourceGroupsRequest 请求对象
     * @return SyncInvoker<BatchDeleteResourceGroupsRequest, BatchDeleteResourceGroupsResponse>
     */
    public SyncInvoker<BatchDeleteResourceGroupsRequest, BatchDeleteResourceGroupsResponse> batchDeleteResourceGroupsInvoker(
        BatchDeleteResourceGroupsRequest request) {
        return new SyncInvoker<BatchDeleteResourceGroupsRequest, BatchDeleteResourceGroupsResponse>(request,
            CesMeta.batchDeleteResourceGroups, hcClient);
    }

    /**
     * 自定义资源分组批量删除关联资源
     *
     * 给自定义资源分组,即类型为手动添加的资源分组,批量删除关联资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteResourcesRequest 请求对象
     * @return BatchDeleteResourcesResponse
     */
    public BatchDeleteResourcesResponse batchDeleteResources(BatchDeleteResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.batchDeleteResources);
    }

    /**
     * 自定义资源分组批量删除关联资源
     *
     * 给自定义资源分组,即类型为手动添加的资源分组,批量删除关联资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteResourcesRequest 请求对象
     * @return SyncInvoker<BatchDeleteResourcesRequest, BatchDeleteResourcesResponse>
     */
    public SyncInvoker<BatchDeleteResourcesRequest, BatchDeleteResourcesResponse> batchDeleteResourcesInvoker(
        BatchDeleteResourcesRequest request) {
        return new SyncInvoker<BatchDeleteResourcesRequest, BatchDeleteResourcesResponse>(request,
            CesMeta.batchDeleteResources, hcClient);
    }

    /**
     * 批量启停告警规则
     *
     * 批量启停告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 创建自定义告警模板
     *
     * 创建自定义告警模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAlarmTemplateRequest 请求对象
     * @return CreateAlarmTemplateResponse
     */
    public CreateAlarmTemplateResponse createAlarmTemplate(CreateAlarmTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.createAlarmTemplate);
    }

    /**
     * 创建自定义告警模板
     *
     * 创建自定义告警模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAlarmTemplateRequest 请求对象
     * @return SyncInvoker<CreateAlarmTemplateRequest, CreateAlarmTemplateResponse>
     */
    public SyncInvoker<CreateAlarmTemplateRequest, CreateAlarmTemplateResponse> createAlarmTemplateInvoker(
        CreateAlarmTemplateRequest request) {
        return new SyncInvoker<CreateAlarmTemplateRequest, CreateAlarmTemplateResponse>(request,
            CesMeta.createAlarmTemplate, hcClient);
    }

    /**
     * 创建资源分组
     *
     * 创建资源分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResourceGroupRequest 请求对象
     * @return CreateResourceGroupResponse
     */
    public CreateResourceGroupResponse createResourceGroup(CreateResourceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.createResourceGroup);
    }

    /**
     * 创建资源分组
     *
     * 创建资源分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResourceGroupRequest 请求对象
     * @return SyncInvoker<CreateResourceGroupRequest, CreateResourceGroupResponse>
     */
    public SyncInvoker<CreateResourceGroupRequest, CreateResourceGroupResponse> createResourceGroupInvoker(
        CreateResourceGroupRequest request) {
        return new SyncInvoker<CreateResourceGroupRequest, CreateResourceGroupResponse>(request,
            CesMeta.createResourceGroup, hcClient);
    }

    /**
     * 批量删除告警规则资源
     *
     * 批量删除告警规则资源（资源分组类型的告警规则不支持），资源分组类型的修改请使用资源分组管理相关接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 查询告警模板关联的告警规则列表
     *
     * 查询告警模板关联的告警规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlarmTemplateAssociationAlarmsRequest 请求对象
     * @return ListAlarmTemplateAssociationAlarmsResponse
     */
    public ListAlarmTemplateAssociationAlarmsResponse listAlarmTemplateAssociationAlarms(
        ListAlarmTemplateAssociationAlarmsRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listAlarmTemplateAssociationAlarms);
    }

    /**
     * 查询告警模板关联的告警规则列表
     *
     * 查询告警模板关联的告警规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlarmTemplateAssociationAlarmsRequest 请求对象
     * @return SyncInvoker<ListAlarmTemplateAssociationAlarmsRequest, ListAlarmTemplateAssociationAlarmsResponse>
     */
    public SyncInvoker<ListAlarmTemplateAssociationAlarmsRequest, ListAlarmTemplateAssociationAlarmsResponse> listAlarmTemplateAssociationAlarmsInvoker(
        ListAlarmTemplateAssociationAlarmsRequest request) {
        return new SyncInvoker<ListAlarmTemplateAssociationAlarmsRequest, ListAlarmTemplateAssociationAlarmsResponse>(
            request, CesMeta.listAlarmTemplateAssociationAlarms, hcClient);
    }

    /**
     * 查询告警模板列表
     *
     * 查询告警模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlarmTemplatesRequest 请求对象
     * @return ListAlarmTemplatesResponse
     */
    public ListAlarmTemplatesResponse listAlarmTemplates(ListAlarmTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listAlarmTemplates);
    }

    /**
     * 查询告警模板列表
     *
     * 查询告警模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlarmTemplatesRequest 请求对象
     * @return SyncInvoker<ListAlarmTemplatesRequest, ListAlarmTemplatesResponse>
     */
    public SyncInvoker<ListAlarmTemplatesRequest, ListAlarmTemplatesResponse> listAlarmTemplatesInvoker(
        ListAlarmTemplatesRequest request) {
        return new SyncInvoker<ListAlarmTemplatesRequest, ListAlarmTemplatesResponse>(request,
            CesMeta.listAlarmTemplates, hcClient);
    }

    /**
     * 查询资源分组列表
     *
     * 查询资源分组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceGroupsRequest 请求对象
     * @return ListResourceGroupsResponse
     */
    public ListResourceGroupsResponse listResourceGroups(ListResourceGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listResourceGroups);
    }

    /**
     * 查询资源分组列表
     *
     * 查询资源分组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceGroupsRequest 请求对象
     * @return SyncInvoker<ListResourceGroupsRequest, ListResourceGroupsResponse>
     */
    public SyncInvoker<ListResourceGroupsRequest, ListResourceGroupsResponse> listResourceGroupsInvoker(
        ListResourceGroupsRequest request) {
        return new SyncInvoker<ListResourceGroupsRequest, ListResourceGroupsResponse>(request,
            CesMeta.listResourceGroups, hcClient);
    }

    /**
     * 查询资源分组下指定服务类别特定维度的资源列表
     *
     * 查询资源分组下指定服务类别特定维度的资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceGroupsServicesResourcesRequest 请求对象
     * @return ListResourceGroupsServicesResourcesResponse
     */
    public ListResourceGroupsServicesResourcesResponse listResourceGroupsServicesResources(
        ListResourceGroupsServicesResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listResourceGroupsServicesResources);
    }

    /**
     * 查询资源分组下指定服务类别特定维度的资源列表
     *
     * 查询资源分组下指定服务类别特定维度的资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceGroupsServicesResourcesRequest 请求对象
     * @return SyncInvoker<ListResourceGroupsServicesResourcesRequest, ListResourceGroupsServicesResourcesResponse>
     */
    public SyncInvoker<ListResourceGroupsServicesResourcesRequest, ListResourceGroupsServicesResourcesResponse> listResourceGroupsServicesResourcesInvoker(
        ListResourceGroupsServicesResourcesRequest request) {
        return new SyncInvoker<ListResourceGroupsServicesResourcesRequest, ListResourceGroupsServicesResourcesResponse>(
            request, CesMeta.listResourceGroupsServicesResources, hcClient);
    }

    /**
     * 查询告警模板详情
     *
     * 查询告警模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAlarmTemplateRequest 请求对象
     * @return ShowAlarmTemplateResponse
     */
    public ShowAlarmTemplateResponse showAlarmTemplate(ShowAlarmTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.showAlarmTemplate);
    }

    /**
     * 查询告警模板详情
     *
     * 查询告警模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAlarmTemplateRequest 请求对象
     * @return SyncInvoker<ShowAlarmTemplateRequest, ShowAlarmTemplateResponse>
     */
    public SyncInvoker<ShowAlarmTemplateRequest, ShowAlarmTemplateResponse> showAlarmTemplateInvoker(
        ShowAlarmTemplateRequest request) {
        return new SyncInvoker<ShowAlarmTemplateRequest, ShowAlarmTemplateResponse>(request, CesMeta.showAlarmTemplate,
            hcClient);
    }

    /**
     * 查询指定资源分组详情
     *
     * 查询指定资源分组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceGroupRequest 请求对象
     * @return ShowResourceGroupResponse
     */
    public ShowResourceGroupResponse showResourceGroup(ShowResourceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.showResourceGroup);
    }

    /**
     * 查询指定资源分组详情
     *
     * 查询指定资源分组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceGroupRequest 请求对象
     * @return SyncInvoker<ShowResourceGroupRequest, ShowResourceGroupResponse>
     */
    public SyncInvoker<ShowResourceGroupRequest, ShowResourceGroupResponse> showResourceGroupInvoker(
        ShowResourceGroupRequest request) {
        return new SyncInvoker<ShowResourceGroupRequest, ShowResourceGroupResponse>(request, CesMeta.showResourceGroup,
            hcClient);
    }

    /**
     * 修改告警规则策略(全量修改)
     *
     * 修改告警规则策略(全量修改)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAlarmRulePoliciesRequest 请求对象
     * @return SyncInvoker<UpdateAlarmRulePoliciesRequest, UpdateAlarmRulePoliciesResponse>
     */
    public SyncInvoker<UpdateAlarmRulePoliciesRequest, UpdateAlarmRulePoliciesResponse> updateAlarmRulePoliciesInvoker(
        UpdateAlarmRulePoliciesRequest request) {
        return new SyncInvoker<UpdateAlarmRulePoliciesRequest, UpdateAlarmRulePoliciesResponse>(request,
            CesMeta.updateAlarmRulePolicies, hcClient);
    }

    /**
     * 修改自定义告警模板
     *
     * 修改自定义告警模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAlarmTemplateRequest 请求对象
     * @return UpdateAlarmTemplateResponse
     */
    public UpdateAlarmTemplateResponse updateAlarmTemplate(UpdateAlarmTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.updateAlarmTemplate);
    }

    /**
     * 修改自定义告警模板
     *
     * 修改自定义告警模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAlarmTemplateRequest 请求对象
     * @return SyncInvoker<UpdateAlarmTemplateRequest, UpdateAlarmTemplateResponse>
     */
    public SyncInvoker<UpdateAlarmTemplateRequest, UpdateAlarmTemplateResponse> updateAlarmTemplateInvoker(
        UpdateAlarmTemplateRequest request) {
        return new SyncInvoker<UpdateAlarmTemplateRequest, UpdateAlarmTemplateResponse>(request,
            CesMeta.updateAlarmTemplate, hcClient);
    }

    /**
     * 修改资源分组
     *
     * 修改资源分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateResourceGroupRequest 请求对象
     * @return UpdateResourceGroupResponse
     */
    public UpdateResourceGroupResponse updateResourceGroup(UpdateResourceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.updateResourceGroup);
    }

    /**
     * 修改资源分组
     *
     * 修改资源分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateResourceGroupRequest 请求对象
     * @return SyncInvoker<UpdateResourceGroupRequest, UpdateResourceGroupResponse>
     */
    public SyncInvoker<UpdateResourceGroupRequest, UpdateResourceGroupResponse> updateResourceGroupInvoker(
        UpdateResourceGroupRequest request) {
        return new SyncInvoker<UpdateResourceGroupRequest, UpdateResourceGroupResponse>(request,
            CesMeta.updateResourceGroup, hcClient);
    }

}

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
import com.huaweicloud.sdk.ces.v2.model.BatchUpdateWidgetsRequest;
import com.huaweicloud.sdk.ces.v2.model.BatchUpdateWidgetsResponse;
import com.huaweicloud.sdk.ces.v2.model.CreateAlarmRulesRequest;
import com.huaweicloud.sdk.ces.v2.model.CreateAlarmRulesResponse;
import com.huaweicloud.sdk.ces.v2.model.CreateAlarmTemplateRequest;
import com.huaweicloud.sdk.ces.v2.model.CreateAlarmTemplateResponse;
import com.huaweicloud.sdk.ces.v2.model.CreateDashboardWidgetsRequest;
import com.huaweicloud.sdk.ces.v2.model.CreateDashboardWidgetsResponse;
import com.huaweicloud.sdk.ces.v2.model.CreateOneDashboardRequest;
import com.huaweicloud.sdk.ces.v2.model.CreateOneDashboardResponse;
import com.huaweicloud.sdk.ces.v2.model.CreateResourceGroupRequest;
import com.huaweicloud.sdk.ces.v2.model.CreateResourceGroupResponse;
import com.huaweicloud.sdk.ces.v2.model.DeleteAlarmRuleResourcesRequest;
import com.huaweicloud.sdk.ces.v2.model.DeleteAlarmRuleResourcesResponse;
import com.huaweicloud.sdk.ces.v2.model.DeleteDashboardsRequest;
import com.huaweicloud.sdk.ces.v2.model.DeleteDashboardsResponse;
import com.huaweicloud.sdk.ces.v2.model.DeleteOneWidgetRequest;
import com.huaweicloud.sdk.ces.v2.model.DeleteOneWidgetResponse;
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
import com.huaweicloud.sdk.ces.v2.model.ListDashboardInfosRequest;
import com.huaweicloud.sdk.ces.v2.model.ListDashboardInfosResponse;
import com.huaweicloud.sdk.ces.v2.model.ListDashboardWidgetsRequest;
import com.huaweicloud.sdk.ces.v2.model.ListDashboardWidgetsResponse;
import com.huaweicloud.sdk.ces.v2.model.ListResourceGroupsRequest;
import com.huaweicloud.sdk.ces.v2.model.ListResourceGroupsResponse;
import com.huaweicloud.sdk.ces.v2.model.ListResourceGroupsServicesResourcesRequest;
import com.huaweicloud.sdk.ces.v2.model.ListResourceGroupsServicesResourcesResponse;
import com.huaweicloud.sdk.ces.v2.model.ShowAlarmTemplateRequest;
import com.huaweicloud.sdk.ces.v2.model.ShowAlarmTemplateResponse;
import com.huaweicloud.sdk.ces.v2.model.ShowResourceGroupRequest;
import com.huaweicloud.sdk.ces.v2.model.ShowResourceGroupResponse;
import com.huaweicloud.sdk.ces.v2.model.ShowWidgetRequest;
import com.huaweicloud.sdk.ces.v2.model.ShowWidgetResponse;
import com.huaweicloud.sdk.ces.v2.model.UpdateAlarmRulePoliciesRequest;
import com.huaweicloud.sdk.ces.v2.model.UpdateAlarmRulePoliciesResponse;
import com.huaweicloud.sdk.ces.v2.model.UpdateAlarmTemplateRequest;
import com.huaweicloud.sdk.ces.v2.model.UpdateAlarmTemplateResponse;
import com.huaweicloud.sdk.ces.v2.model.UpdateDashboardRequest;
import com.huaweicloud.sdk.ces.v2.model.UpdateDashboardResponse;
import com.huaweicloud.sdk.ces.v2.model.UpdateResourceGroupRequest;
import com.huaweicloud.sdk.ces.v2.model.UpdateResourceGroupResponse;
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
        ClientBuilder<CesAsyncClient> clientBuilder = new ClientBuilder<>(CesAsyncClient::new);
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 自定义资源分组批量增加关联资源
     *
     * 给自定义资源分组,即类型为手动添加的资源分组,批量增加关联资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateResourcesRequest 请求对象
     * @return CompletableFuture<BatchCreateResourcesResponse>
     */
    public CompletableFuture<BatchCreateResourcesResponse> batchCreateResourcesAsync(
        BatchCreateResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.batchCreateResources);
    }

    /**
     * 自定义资源分组批量增加关联资源
     *
     * 给自定义资源分组,即类型为手动添加的资源分组,批量增加关联资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateResourcesRequest 请求对象
     * @return AsyncInvoker<BatchCreateResourcesRequest, BatchCreateResourcesResponse>
     */
    public AsyncInvoker<BatchCreateResourcesRequest, BatchCreateResourcesResponse> batchCreateResourcesAsyncInvoker(
        BatchCreateResourcesRequest request) {
        return new AsyncInvoker<BatchCreateResourcesRequest, BatchCreateResourcesResponse>(request,
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 批量删除自定义告警模板
     *
     * 批量删除自定义告警模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteAlarmTemplatesRequest 请求对象
     * @return CompletableFuture<BatchDeleteAlarmTemplatesResponse>
     */
    public CompletableFuture<BatchDeleteAlarmTemplatesResponse> batchDeleteAlarmTemplatesAsync(
        BatchDeleteAlarmTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.batchDeleteAlarmTemplates);
    }

    /**
     * 批量删除自定义告警模板
     *
     * 批量删除自定义告警模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteAlarmTemplatesRequest 请求对象
     * @return AsyncInvoker<BatchDeleteAlarmTemplatesRequest, BatchDeleteAlarmTemplatesResponse>
     */
    public AsyncInvoker<BatchDeleteAlarmTemplatesRequest, BatchDeleteAlarmTemplatesResponse> batchDeleteAlarmTemplatesAsyncInvoker(
        BatchDeleteAlarmTemplatesRequest request) {
        return new AsyncInvoker<BatchDeleteAlarmTemplatesRequest, BatchDeleteAlarmTemplatesResponse>(request,
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
     * @return CompletableFuture<BatchDeleteResourceGroupsResponse>
     */
    public CompletableFuture<BatchDeleteResourceGroupsResponse> batchDeleteResourceGroupsAsync(
        BatchDeleteResourceGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.batchDeleteResourceGroups);
    }

    /**
     * 批量删除资源分组
     *
     * 批量删除资源分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteResourceGroupsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteResourceGroupsRequest, BatchDeleteResourceGroupsResponse>
     */
    public AsyncInvoker<BatchDeleteResourceGroupsRequest, BatchDeleteResourceGroupsResponse> batchDeleteResourceGroupsAsyncInvoker(
        BatchDeleteResourceGroupsRequest request) {
        return new AsyncInvoker<BatchDeleteResourceGroupsRequest, BatchDeleteResourceGroupsResponse>(request,
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
     * @return CompletableFuture<BatchDeleteResourcesResponse>
     */
    public CompletableFuture<BatchDeleteResourcesResponse> batchDeleteResourcesAsync(
        BatchDeleteResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.batchDeleteResources);
    }

    /**
     * 自定义资源分组批量删除关联资源
     *
     * 给自定义资源分组,即类型为手动添加的资源分组,批量删除关联资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteResourcesRequest 请求对象
     * @return AsyncInvoker<BatchDeleteResourcesRequest, BatchDeleteResourcesResponse>
     */
    public AsyncInvoker<BatchDeleteResourcesRequest, BatchDeleteResourcesResponse> batchDeleteResourcesAsyncInvoker(
        BatchDeleteResourcesRequest request) {
        return new AsyncInvoker<BatchDeleteResourcesRequest, BatchDeleteResourcesResponse>(request,
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 批量更新监控视图
     *
     * 批量更新监控视图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdateWidgetsRequest 请求对象
     * @return CompletableFuture<BatchUpdateWidgetsResponse>
     */
    public CompletableFuture<BatchUpdateWidgetsResponse> batchUpdateWidgetsAsync(BatchUpdateWidgetsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.batchUpdateWidgets);
    }

    /**
     * 批量更新监控视图
     *
     * 批量更新监控视图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdateWidgetsRequest 请求对象
     * @return AsyncInvoker<BatchUpdateWidgetsRequest, BatchUpdateWidgetsResponse>
     */
    public AsyncInvoker<BatchUpdateWidgetsRequest, BatchUpdateWidgetsResponse> batchUpdateWidgetsAsyncInvoker(
        BatchUpdateWidgetsRequest request) {
        return new AsyncInvoker<BatchUpdateWidgetsRequest, BatchUpdateWidgetsResponse>(request,
            CesMeta.batchUpdateWidgets, hcClient);
    }

    /**
     * 创建告警规则
     *
     * 创建告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 创建自定义告警模板
     *
     * 创建自定义告警模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAlarmTemplateRequest 请求对象
     * @return CompletableFuture<CreateAlarmTemplateResponse>
     */
    public CompletableFuture<CreateAlarmTemplateResponse> createAlarmTemplateAsync(CreateAlarmTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.createAlarmTemplate);
    }

    /**
     * 创建自定义告警模板
     *
     * 创建自定义告警模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAlarmTemplateRequest 请求对象
     * @return AsyncInvoker<CreateAlarmTemplateRequest, CreateAlarmTemplateResponse>
     */
    public AsyncInvoker<CreateAlarmTemplateRequest, CreateAlarmTemplateResponse> createAlarmTemplateAsyncInvoker(
        CreateAlarmTemplateRequest request) {
        return new AsyncInvoker<CreateAlarmTemplateRequest, CreateAlarmTemplateResponse>(request,
            CesMeta.createAlarmTemplate, hcClient);
    }

    /**
     * 创建/复制/批量创建监控视图到指定的监控面板
     *
     * 创建/复制/批量创建监控视图到指定的监控面板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDashboardWidgetsRequest 请求对象
     * @return CompletableFuture<CreateDashboardWidgetsResponse>
     */
    public CompletableFuture<CreateDashboardWidgetsResponse> createDashboardWidgetsAsync(
        CreateDashboardWidgetsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.createDashboardWidgets);
    }

    /**
     * 创建/复制/批量创建监控视图到指定的监控面板
     *
     * 创建/复制/批量创建监控视图到指定的监控面板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDashboardWidgetsRequest 请求对象
     * @return AsyncInvoker<CreateDashboardWidgetsRequest, CreateDashboardWidgetsResponse>
     */
    public AsyncInvoker<CreateDashboardWidgetsRequest, CreateDashboardWidgetsResponse> createDashboardWidgetsAsyncInvoker(
        CreateDashboardWidgetsRequest request) {
        return new AsyncInvoker<CreateDashboardWidgetsRequest, CreateDashboardWidgetsResponse>(request,
            CesMeta.createDashboardWidgets, hcClient);
    }

    /**
     * 创建/复制监控面板
     *
     * 创建/复制监控面板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateOneDashboardRequest 请求对象
     * @return CompletableFuture<CreateOneDashboardResponse>
     */
    public CompletableFuture<CreateOneDashboardResponse> createOneDashboardAsync(CreateOneDashboardRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.createOneDashboard);
    }

    /**
     * 创建/复制监控面板
     *
     * 创建/复制监控面板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateOneDashboardRequest 请求对象
     * @return AsyncInvoker<CreateOneDashboardRequest, CreateOneDashboardResponse>
     */
    public AsyncInvoker<CreateOneDashboardRequest, CreateOneDashboardResponse> createOneDashboardAsyncInvoker(
        CreateOneDashboardRequest request) {
        return new AsyncInvoker<CreateOneDashboardRequest, CreateOneDashboardResponse>(request,
            CesMeta.createOneDashboard, hcClient);
    }

    /**
     * 创建资源分组
     *
     * 创建资源分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResourceGroupRequest 请求对象
     * @return CompletableFuture<CreateResourceGroupResponse>
     */
    public CompletableFuture<CreateResourceGroupResponse> createResourceGroupAsync(CreateResourceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.createResourceGroup);
    }

    /**
     * 创建资源分组
     *
     * 创建资源分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResourceGroupRequest 请求对象
     * @return AsyncInvoker<CreateResourceGroupRequest, CreateResourceGroupResponse>
     */
    public AsyncInvoker<CreateResourceGroupRequest, CreateResourceGroupResponse> createResourceGroupAsyncInvoker(
        CreateResourceGroupRequest request) {
        return new AsyncInvoker<CreateResourceGroupRequest, CreateResourceGroupResponse>(request,
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 批量删除监控面板
     *
     * 批量删除监控面板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDashboardsRequest 请求对象
     * @return CompletableFuture<DeleteDashboardsResponse>
     */
    public CompletableFuture<DeleteDashboardsResponse> deleteDashboardsAsync(DeleteDashboardsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.deleteDashboards);
    }

    /**
     * 批量删除监控面板
     *
     * 批量删除监控面板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDashboardsRequest 请求对象
     * @return AsyncInvoker<DeleteDashboardsRequest, DeleteDashboardsResponse>
     */
    public AsyncInvoker<DeleteDashboardsRequest, DeleteDashboardsResponse> deleteDashboardsAsyncInvoker(
        DeleteDashboardsRequest request) {
        return new AsyncInvoker<DeleteDashboardsRequest, DeleteDashboardsResponse>(request, CesMeta.deleteDashboards,
            hcClient);
    }

    /**
     * 删除指定监控视图
     *
     * 删除指定监控视图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteOneWidgetRequest 请求对象
     * @return CompletableFuture<DeleteOneWidgetResponse>
     */
    public CompletableFuture<DeleteOneWidgetResponse> deleteOneWidgetAsync(DeleteOneWidgetRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.deleteOneWidget);
    }

    /**
     * 删除指定监控视图
     *
     * 删除指定监控视图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteOneWidgetRequest 请求对象
     * @return AsyncInvoker<DeleteOneWidgetRequest, DeleteOneWidgetResponse>
     */
    public AsyncInvoker<DeleteOneWidgetRequest, DeleteOneWidgetResponse> deleteOneWidgetAsyncInvoker(
        DeleteOneWidgetRequest request) {
        return new AsyncInvoker<DeleteOneWidgetRequest, DeleteOneWidgetResponse>(request, CesMeta.deleteOneWidget,
            hcClient);
    }

    /**
     * 查询主机监控维度指标信息
     *
     * 根据ECS/BMS资源ID查询磁盘、挂载点、进程、显卡、RAID控制器维度指标信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 查询告警模板关联的告警规则列表
     *
     * 查询告警模板关联的告警规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlarmTemplateAssociationAlarmsRequest 请求对象
     * @return CompletableFuture<ListAlarmTemplateAssociationAlarmsResponse>
     */
    public CompletableFuture<ListAlarmTemplateAssociationAlarmsResponse> listAlarmTemplateAssociationAlarmsAsync(
        ListAlarmTemplateAssociationAlarmsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listAlarmTemplateAssociationAlarms);
    }

    /**
     * 查询告警模板关联的告警规则列表
     *
     * 查询告警模板关联的告警规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlarmTemplateAssociationAlarmsRequest 请求对象
     * @return AsyncInvoker<ListAlarmTemplateAssociationAlarmsRequest, ListAlarmTemplateAssociationAlarmsResponse>
     */
    public AsyncInvoker<ListAlarmTemplateAssociationAlarmsRequest, ListAlarmTemplateAssociationAlarmsResponse> listAlarmTemplateAssociationAlarmsAsyncInvoker(
        ListAlarmTemplateAssociationAlarmsRequest request) {
        return new AsyncInvoker<ListAlarmTemplateAssociationAlarmsRequest, ListAlarmTemplateAssociationAlarmsResponse>(
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
     * @return CompletableFuture<ListAlarmTemplatesResponse>
     */
    public CompletableFuture<ListAlarmTemplatesResponse> listAlarmTemplatesAsync(ListAlarmTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listAlarmTemplates);
    }

    /**
     * 查询告警模板列表
     *
     * 查询告警模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlarmTemplatesRequest 请求对象
     * @return AsyncInvoker<ListAlarmTemplatesRequest, ListAlarmTemplatesResponse>
     */
    public AsyncInvoker<ListAlarmTemplatesRequest, ListAlarmTemplatesResponse> listAlarmTemplatesAsyncInvoker(
        ListAlarmTemplatesRequest request) {
        return new AsyncInvoker<ListAlarmTemplatesRequest, ListAlarmTemplatesResponse>(request,
            CesMeta.listAlarmTemplates, hcClient);
    }

    /**
     * 查询监控面板列表
     *
     * 查询监控面板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDashboardInfosRequest 请求对象
     * @return CompletableFuture<ListDashboardInfosResponse>
     */
    public CompletableFuture<ListDashboardInfosResponse> listDashboardInfosAsync(ListDashboardInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listDashboardInfos);
    }

    /**
     * 查询监控面板列表
     *
     * 查询监控面板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDashboardInfosRequest 请求对象
     * @return AsyncInvoker<ListDashboardInfosRequest, ListDashboardInfosResponse>
     */
    public AsyncInvoker<ListDashboardInfosRequest, ListDashboardInfosResponse> listDashboardInfosAsyncInvoker(
        ListDashboardInfosRequest request) {
        return new AsyncInvoker<ListDashboardInfosRequest, ListDashboardInfosResponse>(request,
            CesMeta.listDashboardInfos, hcClient);
    }

    /**
     * 查询指定监控面板下的监控视图列表
     *
     * 查询指定监控面板下的监控视图列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDashboardWidgetsRequest 请求对象
     * @return CompletableFuture<ListDashboardWidgetsResponse>
     */
    public CompletableFuture<ListDashboardWidgetsResponse> listDashboardWidgetsAsync(
        ListDashboardWidgetsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listDashboardWidgets);
    }

    /**
     * 查询指定监控面板下的监控视图列表
     *
     * 查询指定监控面板下的监控视图列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDashboardWidgetsRequest 请求对象
     * @return AsyncInvoker<ListDashboardWidgetsRequest, ListDashboardWidgetsResponse>
     */
    public AsyncInvoker<ListDashboardWidgetsRequest, ListDashboardWidgetsResponse> listDashboardWidgetsAsyncInvoker(
        ListDashboardWidgetsRequest request) {
        return new AsyncInvoker<ListDashboardWidgetsRequest, ListDashboardWidgetsResponse>(request,
            CesMeta.listDashboardWidgets, hcClient);
    }

    /**
     * 查询资源分组列表
     *
     * 查询资源分组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceGroupsRequest 请求对象
     * @return CompletableFuture<ListResourceGroupsResponse>
     */
    public CompletableFuture<ListResourceGroupsResponse> listResourceGroupsAsync(ListResourceGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listResourceGroups);
    }

    /**
     * 查询资源分组列表
     *
     * 查询资源分组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceGroupsRequest 请求对象
     * @return AsyncInvoker<ListResourceGroupsRequest, ListResourceGroupsResponse>
     */
    public AsyncInvoker<ListResourceGroupsRequest, ListResourceGroupsResponse> listResourceGroupsAsyncInvoker(
        ListResourceGroupsRequest request) {
        return new AsyncInvoker<ListResourceGroupsRequest, ListResourceGroupsResponse>(request,
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
     * @return CompletableFuture<ListResourceGroupsServicesResourcesResponse>
     */
    public CompletableFuture<ListResourceGroupsServicesResourcesResponse> listResourceGroupsServicesResourcesAsync(
        ListResourceGroupsServicesResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listResourceGroupsServicesResources);
    }

    /**
     * 查询资源分组下指定服务类别特定维度的资源列表
     *
     * 查询资源分组下指定服务类别特定维度的资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceGroupsServicesResourcesRequest 请求对象
     * @return AsyncInvoker<ListResourceGroupsServicesResourcesRequest, ListResourceGroupsServicesResourcesResponse>
     */
    public AsyncInvoker<ListResourceGroupsServicesResourcesRequest, ListResourceGroupsServicesResourcesResponse> listResourceGroupsServicesResourcesAsyncInvoker(
        ListResourceGroupsServicesResourcesRequest request) {
        return new AsyncInvoker<ListResourceGroupsServicesResourcesRequest, ListResourceGroupsServicesResourcesResponse>(
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
     * @return CompletableFuture<ShowAlarmTemplateResponse>
     */
    public CompletableFuture<ShowAlarmTemplateResponse> showAlarmTemplateAsync(ShowAlarmTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.showAlarmTemplate);
    }

    /**
     * 查询告警模板详情
     *
     * 查询告警模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAlarmTemplateRequest 请求对象
     * @return AsyncInvoker<ShowAlarmTemplateRequest, ShowAlarmTemplateResponse>
     */
    public AsyncInvoker<ShowAlarmTemplateRequest, ShowAlarmTemplateResponse> showAlarmTemplateAsyncInvoker(
        ShowAlarmTemplateRequest request) {
        return new AsyncInvoker<ShowAlarmTemplateRequest, ShowAlarmTemplateResponse>(request, CesMeta.showAlarmTemplate,
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
     * @return CompletableFuture<ShowResourceGroupResponse>
     */
    public CompletableFuture<ShowResourceGroupResponse> showResourceGroupAsync(ShowResourceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.showResourceGroup);
    }

    /**
     * 查询指定资源分组详情
     *
     * 查询指定资源分组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceGroupRequest 请求对象
     * @return AsyncInvoker<ShowResourceGroupRequest, ShowResourceGroupResponse>
     */
    public AsyncInvoker<ShowResourceGroupRequest, ShowResourceGroupResponse> showResourceGroupAsyncInvoker(
        ShowResourceGroupRequest request) {
        return new AsyncInvoker<ShowResourceGroupRequest, ShowResourceGroupResponse>(request, CesMeta.showResourceGroup,
            hcClient);
    }

    /**
     * 查询指定监控视图信息
     *
     * 查询指定监控视图信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowWidgetRequest 请求对象
     * @return CompletableFuture<ShowWidgetResponse>
     */
    public CompletableFuture<ShowWidgetResponse> showWidgetAsync(ShowWidgetRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.showWidget);
    }

    /**
     * 查询指定监控视图信息
     *
     * 查询指定监控视图信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowWidgetRequest 请求对象
     * @return AsyncInvoker<ShowWidgetRequest, ShowWidgetResponse>
     */
    public AsyncInvoker<ShowWidgetRequest, ShowWidgetResponse> showWidgetAsyncInvoker(ShowWidgetRequest request) {
        return new AsyncInvoker<ShowWidgetRequest, ShowWidgetResponse>(request, CesMeta.showWidget, hcClient);
    }

    /**
     * 修改告警规则策略(全量修改)
     *
     * 修改告警规则策略(全量修改)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAlarmRulePoliciesRequest 请求对象
     * @return AsyncInvoker<UpdateAlarmRulePoliciesRequest, UpdateAlarmRulePoliciesResponse>
     */
    public AsyncInvoker<UpdateAlarmRulePoliciesRequest, UpdateAlarmRulePoliciesResponse> updateAlarmRulePoliciesAsyncInvoker(
        UpdateAlarmRulePoliciesRequest request) {
        return new AsyncInvoker<UpdateAlarmRulePoliciesRequest, UpdateAlarmRulePoliciesResponse>(request,
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
     * @return CompletableFuture<UpdateAlarmTemplateResponse>
     */
    public CompletableFuture<UpdateAlarmTemplateResponse> updateAlarmTemplateAsync(UpdateAlarmTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.updateAlarmTemplate);
    }

    /**
     * 修改自定义告警模板
     *
     * 修改自定义告警模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAlarmTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateAlarmTemplateRequest, UpdateAlarmTemplateResponse>
     */
    public AsyncInvoker<UpdateAlarmTemplateRequest, UpdateAlarmTemplateResponse> updateAlarmTemplateAsyncInvoker(
        UpdateAlarmTemplateRequest request) {
        return new AsyncInvoker<UpdateAlarmTemplateRequest, UpdateAlarmTemplateResponse>(request,
            CesMeta.updateAlarmTemplate, hcClient);
    }

    /**
     * 修改监控面板
     *
     * 修改监控面板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDashboardRequest 请求对象
     * @return CompletableFuture<UpdateDashboardResponse>
     */
    public CompletableFuture<UpdateDashboardResponse> updateDashboardAsync(UpdateDashboardRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.updateDashboard);
    }

    /**
     * 修改监控面板
     *
     * 修改监控面板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDashboardRequest 请求对象
     * @return AsyncInvoker<UpdateDashboardRequest, UpdateDashboardResponse>
     */
    public AsyncInvoker<UpdateDashboardRequest, UpdateDashboardResponse> updateDashboardAsyncInvoker(
        UpdateDashboardRequest request) {
        return new AsyncInvoker<UpdateDashboardRequest, UpdateDashboardResponse>(request, CesMeta.updateDashboard,
            hcClient);
    }

    /**
     * 修改资源分组
     *
     * 修改资源分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateResourceGroupRequest 请求对象
     * @return CompletableFuture<UpdateResourceGroupResponse>
     */
    public CompletableFuture<UpdateResourceGroupResponse> updateResourceGroupAsync(UpdateResourceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.updateResourceGroup);
    }

    /**
     * 修改资源分组
     *
     * 修改资源分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateResourceGroupRequest 请求对象
     * @return AsyncInvoker<UpdateResourceGroupRequest, UpdateResourceGroupResponse>
     */
    public AsyncInvoker<UpdateResourceGroupRequest, UpdateResourceGroupResponse> updateResourceGroupAsyncInvoker(
        UpdateResourceGroupRequest request) {
        return new AsyncInvoker<UpdateResourceGroupRequest, UpdateResourceGroupResponse>(request,
            CesMeta.updateResourceGroup, hcClient);
    }

}

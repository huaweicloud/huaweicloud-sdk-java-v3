package com.huaweicloud.sdk.sa.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.sa.v2.model.*;

import java.util.concurrent.CompletableFuture;

public class SaAsyncClient {

    protected HcClient hcClient;

    public SaAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SaAsyncClient> newBuilder() {
        return new ClientBuilder<>(SaAsyncClient::new);
    }

    /**
     * 创建告警规则（仅支持华东-上海一使用）
     *
     * Create alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAlertRuleRequest 请求对象
     * @return CompletableFuture<CreateAlertRuleResponse>
     */
    public CompletableFuture<CreateAlertRuleResponse> createAlertRuleAsync(CreateAlertRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.createAlertRule);
    }

    /**
     * 创建告警规则（仅支持华东-上海一使用）
     *
     * Create alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAlertRuleRequest 请求对象
     * @return AsyncInvoker<CreateAlertRuleRequest, CreateAlertRuleResponse>
     */
    public AsyncInvoker<CreateAlertRuleRequest, CreateAlertRuleResponse> createAlertRuleAsyncInvoker(
        CreateAlertRuleRequest request) {
        return new AsyncInvoker<CreateAlertRuleRequest, CreateAlertRuleResponse>(request, SaMeta.createAlertRule,
            hcClient);
    }

    /**
     * 模拟告警规则（仅支持华东-上海一使用）
     *
     * Simulate alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAlertRuleSimulationRequest 请求对象
     * @return CompletableFuture<CreateAlertRuleSimulationResponse>
     */
    public CompletableFuture<CreateAlertRuleSimulationResponse> createAlertRuleSimulationAsync(
        CreateAlertRuleSimulationRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.createAlertRuleSimulation);
    }

    /**
     * 模拟告警规则（仅支持华东-上海一使用）
     *
     * Simulate alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAlertRuleSimulationRequest 请求对象
     * @return AsyncInvoker<CreateAlertRuleSimulationRequest, CreateAlertRuleSimulationResponse>
     */
    public AsyncInvoker<CreateAlertRuleSimulationRequest, CreateAlertRuleSimulationResponse> createAlertRuleSimulationAsyncInvoker(
        CreateAlertRuleSimulationRequest request) {
        return new AsyncInvoker<CreateAlertRuleSimulationRequest, CreateAlertRuleSimulationResponse>(request,
            SaMeta.createAlertRuleSimulation, hcClient);
    }

    /**
     * 删除告警规则（仅支持华东-上海一使用）
     *
     * Delete alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAlertRuleRequest 请求对象
     * @return CompletableFuture<DeleteAlertRuleResponse>
     */
    public CompletableFuture<DeleteAlertRuleResponse> deleteAlertRuleAsync(DeleteAlertRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.deleteAlertRule);
    }

    /**
     * 删除告警规则（仅支持华东-上海一使用）
     *
     * Delete alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAlertRuleRequest 请求对象
     * @return AsyncInvoker<DeleteAlertRuleRequest, DeleteAlertRuleResponse>
     */
    public AsyncInvoker<DeleteAlertRuleRequest, DeleteAlertRuleResponse> deleteAlertRuleAsyncInvoker(
        DeleteAlertRuleRequest request) {
        return new AsyncInvoker<DeleteAlertRuleRequest, DeleteAlertRuleResponse>(request, SaMeta.deleteAlertRule,
            hcClient);
    }

    /**
     * 停用告警规则（仅支持华东-上海一使用）
     *
     * Disable alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisableAlertRuleRequest 请求对象
     * @return CompletableFuture<DisableAlertRuleResponse>
     */
    public CompletableFuture<DisableAlertRuleResponse> disableAlertRuleAsync(DisableAlertRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.disableAlertRule);
    }

    /**
     * 停用告警规则（仅支持华东-上海一使用）
     *
     * Disable alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisableAlertRuleRequest 请求对象
     * @return AsyncInvoker<DisableAlertRuleRequest, DisableAlertRuleResponse>
     */
    public AsyncInvoker<DisableAlertRuleRequest, DisableAlertRuleResponse> disableAlertRuleAsyncInvoker(
        DisableAlertRuleRequest request) {
        return new AsyncInvoker<DisableAlertRuleRequest, DisableAlertRuleResponse>(request, SaMeta.disableAlertRule,
            hcClient);
    }

    /**
     * 启用告警规则（仅支持华东-上海一使用）
     *
     * Enable alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnableAlertRuleRequest 请求对象
     * @return CompletableFuture<EnableAlertRuleResponse>
     */
    public CompletableFuture<EnableAlertRuleResponse> enableAlertRuleAsync(EnableAlertRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.enableAlertRule);
    }

    /**
     * 启用告警规则（仅支持华东-上海一使用）
     *
     * Enable alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnableAlertRuleRequest 请求对象
     * @return AsyncInvoker<EnableAlertRuleRequest, EnableAlertRuleResponse>
     */
    public AsyncInvoker<EnableAlertRuleRequest, EnableAlertRuleResponse> enableAlertRuleAsyncInvoker(
        EnableAlertRuleRequest request) {
        return new AsyncInvoker<EnableAlertRuleRequest, EnableAlertRuleResponse>(request, SaMeta.enableAlertRule,
            hcClient);
    }

    /**
     * 告警规则总览（仅支持华东-上海一使用）
     *
     * List alert rule metrics
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlertRuleMetricsRequest 请求对象
     * @return CompletableFuture<ListAlertRuleMetricsResponse>
     */
    public CompletableFuture<ListAlertRuleMetricsResponse> listAlertRuleMetricsAsync(
        ListAlertRuleMetricsRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.listAlertRuleMetrics);
    }

    /**
     * 告警规则总览（仅支持华东-上海一使用）
     *
     * List alert rule metrics
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlertRuleMetricsRequest 请求对象
     * @return AsyncInvoker<ListAlertRuleMetricsRequest, ListAlertRuleMetricsResponse>
     */
    public AsyncInvoker<ListAlertRuleMetricsRequest, ListAlertRuleMetricsResponse> listAlertRuleMetricsAsyncInvoker(
        ListAlertRuleMetricsRequest request) {
        return new AsyncInvoker<ListAlertRuleMetricsRequest, ListAlertRuleMetricsResponse>(request,
            SaMeta.listAlertRuleMetrics, hcClient);
    }

    /**
     * 列出告警规则模板（仅支持华东-上海一使用）
     *
     * List alert rule templates
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlertRuleTemplatesRequest 请求对象
     * @return CompletableFuture<ListAlertRuleTemplatesResponse>
     */
    public CompletableFuture<ListAlertRuleTemplatesResponse> listAlertRuleTemplatesAsync(
        ListAlertRuleTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.listAlertRuleTemplates);
    }

    /**
     * 列出告警规则模板（仅支持华东-上海一使用）
     *
     * List alert rule templates
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlertRuleTemplatesRequest 请求对象
     * @return AsyncInvoker<ListAlertRuleTemplatesRequest, ListAlertRuleTemplatesResponse>
     */
    public AsyncInvoker<ListAlertRuleTemplatesRequest, ListAlertRuleTemplatesResponse> listAlertRuleTemplatesAsyncInvoker(
        ListAlertRuleTemplatesRequest request) {
        return new AsyncInvoker<ListAlertRuleTemplatesRequest, ListAlertRuleTemplatesResponse>(request,
            SaMeta.listAlertRuleTemplates, hcClient);
    }

    /**
     * 列出告警规则（仅支持华东-上海一使用）
     *
     * List alert rules
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlertRulesRequest 请求对象
     * @return CompletableFuture<ListAlertRulesResponse>
     */
    public CompletableFuture<ListAlertRulesResponse> listAlertRulesAsync(ListAlertRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.listAlertRules);
    }

    /**
     * 列出告警规则（仅支持华东-上海一使用）
     *
     * List alert rules
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlertRulesRequest 请求对象
     * @return AsyncInvoker<ListAlertRulesRequest, ListAlertRulesResponse>
     */
    public AsyncInvoker<ListAlertRulesRequest, ListAlertRulesResponse> listAlertRulesAsyncInvoker(
        ListAlertRulesRequest request) {
        return new AsyncInvoker<ListAlertRulesRequest, ListAlertRulesResponse>(request, SaMeta.listAlertRules,
            hcClient);
    }

    /**
     * 查看告警规则（仅支持华东-上海一使用）
     *
     * Get alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAlertRuleRequest 请求对象
     * @return CompletableFuture<ShowAlertRuleResponse>
     */
    public CompletableFuture<ShowAlertRuleResponse> showAlertRuleAsync(ShowAlertRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.showAlertRule);
    }

    /**
     * 查看告警规则（仅支持华东-上海一使用）
     *
     * Get alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAlertRuleRequest 请求对象
     * @return AsyncInvoker<ShowAlertRuleRequest, ShowAlertRuleResponse>
     */
    public AsyncInvoker<ShowAlertRuleRequest, ShowAlertRuleResponse> showAlertRuleAsyncInvoker(
        ShowAlertRuleRequest request) {
        return new AsyncInvoker<ShowAlertRuleRequest, ShowAlertRuleResponse>(request, SaMeta.showAlertRule, hcClient);
    }

    /**
     * 查看告警规则模板（仅支持华东-上海一使用）
     *
     * List alert rule templates
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAlertRuleTemplateRequest 请求对象
     * @return CompletableFuture<ShowAlertRuleTemplateResponse>
     */
    public CompletableFuture<ShowAlertRuleTemplateResponse> showAlertRuleTemplateAsync(
        ShowAlertRuleTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.showAlertRuleTemplate);
    }

    /**
     * 查看告警规则模板（仅支持华东-上海一使用）
     *
     * List alert rule templates
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAlertRuleTemplateRequest 请求对象
     * @return AsyncInvoker<ShowAlertRuleTemplateRequest, ShowAlertRuleTemplateResponse>
     */
    public AsyncInvoker<ShowAlertRuleTemplateRequest, ShowAlertRuleTemplateResponse> showAlertRuleTemplateAsyncInvoker(
        ShowAlertRuleTemplateRequest request) {
        return new AsyncInvoker<ShowAlertRuleTemplateRequest, ShowAlertRuleTemplateResponse>(request,
            SaMeta.showAlertRuleTemplate, hcClient);
    }

    /**
     * 更新告警规则（仅支持华东-上海一使用）
     *
     * Update alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAlertRuleRequest 请求对象
     * @return CompletableFuture<UpdateAlertRuleResponse>
     */
    public CompletableFuture<UpdateAlertRuleResponse> updateAlertRuleAsync(UpdateAlertRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.updateAlertRule);
    }

    /**
     * 更新告警规则（仅支持华东-上海一使用）
     *
     * Update alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAlertRuleRequest 请求对象
     * @return AsyncInvoker<UpdateAlertRuleRequest, UpdateAlertRuleResponse>
     */
    public AsyncInvoker<UpdateAlertRuleRequest, UpdateAlertRuleResponse> updateAlertRuleAsyncInvoker(
        UpdateAlertRuleRequest request) {
        return new AsyncInvoker<UpdateAlertRuleRequest, UpdateAlertRuleResponse>(request, SaMeta.updateAlertRule,
            hcClient);
    }

    /**
     * 更新告警（仅支持华东-上海一使用）
     *
     * 编辑告警，根据实际修改的属性更新，未修改的列不更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeAlertRequest 请求对象
     * @return CompletableFuture<ChangeAlertResponse>
     */
    public CompletableFuture<ChangeAlertResponse> changeAlertAsync(ChangeAlertRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.changeAlert);
    }

    /**
     * 更新告警（仅支持华东-上海一使用）
     *
     * 编辑告警，根据实际修改的属性更新，未修改的列不更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeAlertRequest 请求对象
     * @return AsyncInvoker<ChangeAlertRequest, ChangeAlertResponse>
     */
    public AsyncInvoker<ChangeAlertRequest, ChangeAlertResponse> changeAlertAsyncInvoker(ChangeAlertRequest request) {
        return new AsyncInvoker<ChangeAlertRequest, ChangeAlertResponse>(request, SaMeta.changeAlert, hcClient);
    }

    /**
     * 创建告警（仅支持华东-上海一使用）
     *
     * 创建告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAlertRequest 请求对象
     * @return CompletableFuture<CreateAlertResponse>
     */
    public CompletableFuture<CreateAlertResponse> createAlertAsync(CreateAlertRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.createAlert);
    }

    /**
     * 创建告警（仅支持华东-上海一使用）
     *
     * 创建告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAlertRequest 请求对象
     * @return AsyncInvoker<CreateAlertRequest, CreateAlertResponse>
     */
    public AsyncInvoker<CreateAlertRequest, CreateAlertResponse> createAlertAsyncInvoker(CreateAlertRequest request) {
        return new AsyncInvoker<CreateAlertRequest, CreateAlertResponse>(request, SaMeta.createAlert, hcClient);
    }

    /**
     * 告警转事件（仅支持华东-上海一使用）
     *
     * 告警转事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateBatchOrderAlertsRequest 请求对象
     * @return CompletableFuture<CreateBatchOrderAlertsResponse>
     */
    public CompletableFuture<CreateBatchOrderAlertsResponse> createBatchOrderAlertsAsync(
        CreateBatchOrderAlertsRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.createBatchOrderAlerts);
    }

    /**
     * 告警转事件（仅支持华东-上海一使用）
     *
     * 告警转事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateBatchOrderAlertsRequest 请求对象
     * @return AsyncInvoker<CreateBatchOrderAlertsRequest, CreateBatchOrderAlertsResponse>
     */
    public AsyncInvoker<CreateBatchOrderAlertsRequest, CreateBatchOrderAlertsResponse> createBatchOrderAlertsAsyncInvoker(
        CreateBatchOrderAlertsRequest request) {
        return new AsyncInvoker<CreateBatchOrderAlertsRequest, CreateBatchOrderAlertsResponse>(request,
            SaMeta.createBatchOrderAlerts, hcClient);
    }

    /**
     * 删除告警（仅支持华东-上海一使用）
     *
     * 删除告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAlertRequest 请求对象
     * @return CompletableFuture<DeleteAlertResponse>
     */
    public CompletableFuture<DeleteAlertResponse> deleteAlertAsync(DeleteAlertRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.deleteAlert);
    }

    /**
     * 删除告警（仅支持华东-上海一使用）
     *
     * 删除告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAlertRequest 请求对象
     * @return AsyncInvoker<DeleteAlertRequest, DeleteAlertResponse>
     */
    public AsyncInvoker<DeleteAlertRequest, DeleteAlertResponse> deleteAlertAsyncInvoker(DeleteAlertRequest request) {
        return new AsyncInvoker<DeleteAlertRequest, DeleteAlertResponse>(request, SaMeta.deleteAlert, hcClient);
    }

    /**
     * 搜索告警列表（仅支持华东-上海一使用）
     *
     * 搜索告警列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlertsRequest 请求对象
     * @return CompletableFuture<ListAlertsResponse>
     */
    public CompletableFuture<ListAlertsResponse> listAlertsAsync(ListAlertsRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.listAlerts);
    }

    /**
     * 搜索告警列表（仅支持华东-上海一使用）
     *
     * 搜索告警列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlertsRequest 请求对象
     * @return AsyncInvoker<ListAlertsRequest, ListAlertsResponse>
     */
    public AsyncInvoker<ListAlertsRequest, ListAlertsResponse> listAlertsAsyncInvoker(ListAlertsRequest request) {
        return new AsyncInvoker<ListAlertsRequest, ListAlertsResponse>(request, SaMeta.listAlerts, hcClient);
    }

    /**
     * 获取告警详情（仅支持华东-上海一使用）
     *
     * 获取告警详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAlertRequest 请求对象
     * @return CompletableFuture<ShowAlertResponse>
     */
    public CompletableFuture<ShowAlertResponse> showAlertAsync(ShowAlertRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.showAlert);
    }

    /**
     * 获取告警详情（仅支持华东-上海一使用）
     *
     * 获取告警详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAlertRequest 请求对象
     * @return AsyncInvoker<ShowAlertRequest, ShowAlertResponse>
     */
    public AsyncInvoker<ShowAlertRequest, ShowAlertResponse> showAlertAsyncInvoker(ShowAlertRequest request) {
        return new AsyncInvoker<ShowAlertRequest, ShowAlertResponse>(request, SaMeta.showAlert, hcClient);
    }

    /**
     * 更新事件（仅支持华东-上海一使用）
     *
     * 编辑事件，根据实际修改的属性更新，未修改的列不更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeIncidentRequest 请求对象
     * @return CompletableFuture<ChangeIncidentResponse>
     */
    public CompletableFuture<ChangeIncidentResponse> changeIncidentAsync(ChangeIncidentRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.changeIncident);
    }

    /**
     * 更新事件（仅支持华东-上海一使用）
     *
     * 编辑事件，根据实际修改的属性更新，未修改的列不更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeIncidentRequest 请求对象
     * @return AsyncInvoker<ChangeIncidentRequest, ChangeIncidentResponse>
     */
    public AsyncInvoker<ChangeIncidentRequest, ChangeIncidentResponse> changeIncidentAsyncInvoker(
        ChangeIncidentRequest request) {
        return new AsyncInvoker<ChangeIncidentRequest, ChangeIncidentResponse>(request, SaMeta.changeIncident,
            hcClient);
    }

    /**
     * 创建事件（仅支持华东-上海一使用）
     *
     * 创建事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateIncidentRequest 请求对象
     * @return CompletableFuture<CreateIncidentResponse>
     */
    public CompletableFuture<CreateIncidentResponse> createIncidentAsync(CreateIncidentRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.createIncident);
    }

    /**
     * 创建事件（仅支持华东-上海一使用）
     *
     * 创建事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateIncidentRequest 请求对象
     * @return AsyncInvoker<CreateIncidentRequest, CreateIncidentResponse>
     */
    public AsyncInvoker<CreateIncidentRequest, CreateIncidentResponse> createIncidentAsyncInvoker(
        CreateIncidentRequest request) {
        return new AsyncInvoker<CreateIncidentRequest, CreateIncidentResponse>(request, SaMeta.createIncident,
            hcClient);
    }

    /**
     * 创建事件（仅支持华东-上海一使用）
     *
     * 创建事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteIncidentRequest 请求对象
     * @return CompletableFuture<DeleteIncidentResponse>
     */
    public CompletableFuture<DeleteIncidentResponse> deleteIncidentAsync(DeleteIncidentRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.deleteIncident);
    }

    /**
     * 创建事件（仅支持华东-上海一使用）
     *
     * 创建事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteIncidentRequest 请求对象
     * @return AsyncInvoker<DeleteIncidentRequest, DeleteIncidentResponse>
     */
    public AsyncInvoker<DeleteIncidentRequest, DeleteIncidentResponse> deleteIncidentAsyncInvoker(
        DeleteIncidentRequest request) {
        return new AsyncInvoker<DeleteIncidentRequest, DeleteIncidentResponse>(request, SaMeta.deleteIncident,
            hcClient);
    }

    /**
     * 获取事件的类型列表（仅支持华东-上海一使用）
     *
     * 获取事件的类型列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIncidentTypesRequest 请求对象
     * @return CompletableFuture<ListIncidentTypesResponse>
     */
    public CompletableFuture<ListIncidentTypesResponse> listIncidentTypesAsync(ListIncidentTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.listIncidentTypes);
    }

    /**
     * 获取事件的类型列表（仅支持华东-上海一使用）
     *
     * 获取事件的类型列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIncidentTypesRequest 请求对象
     * @return AsyncInvoker<ListIncidentTypesRequest, ListIncidentTypesResponse>
     */
    public AsyncInvoker<ListIncidentTypesRequest, ListIncidentTypesResponse> listIncidentTypesAsyncInvoker(
        ListIncidentTypesRequest request) {
        return new AsyncInvoker<ListIncidentTypesRequest, ListIncidentTypesResponse>(request, SaMeta.listIncidentTypes,
            hcClient);
    }

    /**
     * 搜索事件列表（仅支持华东-上海一使用）
     *
     * 搜索事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIncidentsRequest 请求对象
     * @return CompletableFuture<ListIncidentsResponse>
     */
    public CompletableFuture<ListIncidentsResponse> listIncidentsAsync(ListIncidentsRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.listIncidents);
    }

    /**
     * 搜索事件列表（仅支持华东-上海一使用）
     *
     * 搜索事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIncidentsRequest 请求对象
     * @return AsyncInvoker<ListIncidentsRequest, ListIncidentsResponse>
     */
    public AsyncInvoker<ListIncidentsRequest, ListIncidentsResponse> listIncidentsAsyncInvoker(
        ListIncidentsRequest request) {
        return new AsyncInvoker<ListIncidentsRequest, ListIncidentsResponse>(request, SaMeta.listIncidents, hcClient);
    }

    /**
     * 获取事件详情（仅支持华东-上海一使用）
     *
     * 获取事件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIncidentRequest 请求对象
     * @return CompletableFuture<ShowIncidentResponse>
     */
    public CompletableFuture<ShowIncidentResponse> showIncidentAsync(ShowIncidentRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.showIncident);
    }

    /**
     * 获取事件详情（仅支持华东-上海一使用）
     *
     * 获取事件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIncidentRequest 请求对象
     * @return AsyncInvoker<ShowIncidentRequest, ShowIncidentResponse>
     */
    public AsyncInvoker<ShowIncidentRequest, ShowIncidentResponse> showIncidentAsyncInvoker(
        ShowIncidentRequest request) {
        return new AsyncInvoker<ShowIncidentRequest, ShowIncidentResponse>(request, SaMeta.showIncident, hcClient);
    }

    /**
     * 创建指标
     *
     * 创建指标（仅支持华东-上海一使用）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateIndicatorRequest 请求对象
     * @return CompletableFuture<CreateIndicatorResponse>
     */
    public CompletableFuture<CreateIndicatorResponse> createIndicatorAsync(CreateIndicatorRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.createIndicator);
    }

    /**
     * 创建指标
     *
     * 创建指标（仅支持华东-上海一使用）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateIndicatorRequest 请求对象
     * @return AsyncInvoker<CreateIndicatorRequest, CreateIndicatorResponse>
     */
    public AsyncInvoker<CreateIndicatorRequest, CreateIndicatorResponse> createIndicatorAsyncInvoker(
        CreateIndicatorRequest request) {
        return new AsyncInvoker<CreateIndicatorRequest, CreateIndicatorResponse>(request, SaMeta.createIndicator,
            hcClient);
    }

    /**
     * 删除指标
     *
     * 删除指标（仅支持华东-上海一使用）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteIndicatorRequest 请求对象
     * @return CompletableFuture<DeleteIndicatorResponse>
     */
    public CompletableFuture<DeleteIndicatorResponse> deleteIndicatorAsync(DeleteIndicatorRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.deleteIndicator);
    }

    /**
     * 删除指标
     *
     * 删除指标（仅支持华东-上海一使用）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteIndicatorRequest 请求对象
     * @return AsyncInvoker<DeleteIndicatorRequest, DeleteIndicatorResponse>
     */
    public AsyncInvoker<DeleteIndicatorRequest, DeleteIndicatorResponse> deleteIndicatorAsyncInvoker(
        DeleteIndicatorRequest request) {
        return new AsyncInvoker<DeleteIndicatorRequest, DeleteIndicatorResponse>(request, SaMeta.deleteIndicator,
            hcClient);
    }

    /**
     * 查询指标列表（仅支持华东-上海一使用）
     *
     * List all indicators
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIndicatorsRequest 请求对象
     * @return CompletableFuture<ListIndicatorsResponse>
     */
    public CompletableFuture<ListIndicatorsResponse> listIndicatorsAsync(ListIndicatorsRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.listIndicators);
    }

    /**
     * 查询指标列表（仅支持华东-上海一使用）
     *
     * List all indicators
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIndicatorsRequest 请求对象
     * @return AsyncInvoker<ListIndicatorsRequest, ListIndicatorsResponse>
     */
    public AsyncInvoker<ListIndicatorsRequest, ListIndicatorsResponse> listIndicatorsAsyncInvoker(
        ListIndicatorsRequest request) {
        return new AsyncInvoker<ListIndicatorsRequest, ListIndicatorsResponse>(request, SaMeta.listIndicators,
            hcClient);
    }

    /**
     * 查询指标详情
     *
     * 查询指标详情（仅支持华东-上海一使用）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIndicatorDetailRequest 请求对象
     * @return CompletableFuture<ShowIndicatorDetailResponse>
     */
    public CompletableFuture<ShowIndicatorDetailResponse> showIndicatorDetailAsync(ShowIndicatorDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.showIndicatorDetail);
    }

    /**
     * 查询指标详情
     *
     * 查询指标详情（仅支持华东-上海一使用）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIndicatorDetailRequest 请求对象
     * @return AsyncInvoker<ShowIndicatorDetailRequest, ShowIndicatorDetailResponse>
     */
    public AsyncInvoker<ShowIndicatorDetailRequest, ShowIndicatorDetailResponse> showIndicatorDetailAsyncInvoker(
        ShowIndicatorDetailRequest request) {
        return new AsyncInvoker<ShowIndicatorDetailRequest, ShowIndicatorDetailResponse>(request,
            SaMeta.showIndicatorDetail, hcClient);
    }

    /**
     * 更新指标
     *
     * 更新指标（仅支持华东-上海一使用）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateIndicatorRequest 请求对象
     * @return CompletableFuture<UpdateIndicatorResponse>
     */
    public CompletableFuture<UpdateIndicatorResponse> updateIndicatorAsync(UpdateIndicatorRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.updateIndicator);
    }

    /**
     * 更新指标
     *
     * 更新指标（仅支持华东-上海一使用）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateIndicatorRequest 请求对象
     * @return AsyncInvoker<UpdateIndicatorRequest, UpdateIndicatorResponse>
     */
    public AsyncInvoker<UpdateIndicatorRequest, UpdateIndicatorResponse> updateIndicatorAsyncInvoker(
        UpdateIndicatorRequest request) {
        return new AsyncInvoker<UpdateIndicatorRequest, UpdateIndicatorResponse>(request, SaMeta.updateIndicator,
            hcClient);
    }

    /**
     * 创建剧本（仅支持华东-上海一使用）
     *
     * Create playbook.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePlaybookRequest 请求对象
     * @return CompletableFuture<CreatePlaybookResponse>
     */
    public CompletableFuture<CreatePlaybookResponse> createPlaybookAsync(CreatePlaybookRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.createPlaybook);
    }

    /**
     * 创建剧本（仅支持华东-上海一使用）
     *
     * Create playbook.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePlaybookRequest 请求对象
     * @return AsyncInvoker<CreatePlaybookRequest, CreatePlaybookResponse>
     */
    public AsyncInvoker<CreatePlaybookRequest, CreatePlaybookResponse> createPlaybookAsyncInvoker(
        CreatePlaybookRequest request) {
        return new AsyncInvoker<CreatePlaybookRequest, CreatePlaybookResponse>(request, SaMeta.createPlaybook,
            hcClient);
    }

    /**
     * 删除剧本（仅支持华东-上海一使用）
     *
     * Delete playbook.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePlaybookRequest 请求对象
     * @return CompletableFuture<DeletePlaybookResponse>
     */
    public CompletableFuture<DeletePlaybookResponse> deletePlaybookAsync(DeletePlaybookRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.deletePlaybook);
    }

    /**
     * 删除剧本（仅支持华东-上海一使用）
     *
     * Delete playbook.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePlaybookRequest 请求对象
     * @return AsyncInvoker<DeletePlaybookRequest, DeletePlaybookResponse>
     */
    public AsyncInvoker<DeletePlaybookRequest, DeletePlaybookResponse> deletePlaybookAsyncInvoker(
        DeletePlaybookRequest request) {
        return new AsyncInvoker<DeletePlaybookRequest, DeletePlaybookResponse>(request, SaMeta.deletePlaybook,
            hcClient);
    }

    /**
     * 查询剧本列表（仅支持华东-上海一使用）
     *
     * List all playbooks.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPlaybooksRequest 请求对象
     * @return CompletableFuture<ListPlaybooksResponse>
     */
    public CompletableFuture<ListPlaybooksResponse> listPlaybooksAsync(ListPlaybooksRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.listPlaybooks);
    }

    /**
     * 查询剧本列表（仅支持华东-上海一使用）
     *
     * List all playbooks.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPlaybooksRequest 请求对象
     * @return AsyncInvoker<ListPlaybooksRequest, ListPlaybooksResponse>
     */
    public AsyncInvoker<ListPlaybooksRequest, ListPlaybooksResponse> listPlaybooksAsyncInvoker(
        ListPlaybooksRequest request) {
        return new AsyncInvoker<ListPlaybooksRequest, ListPlaybooksResponse>(request, SaMeta.listPlaybooks, hcClient);
    }

    /**
     * 查询剧本详情（仅支持华东-上海一使用）
     *
     * Show playbook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlaybookRequest 请求对象
     * @return CompletableFuture<ShowPlaybookResponse>
     */
    public CompletableFuture<ShowPlaybookResponse> showPlaybookAsync(ShowPlaybookRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.showPlaybook);
    }

    /**
     * 查询剧本详情（仅支持华东-上海一使用）
     *
     * Show playbook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlaybookRequest 请求对象
     * @return AsyncInvoker<ShowPlaybookRequest, ShowPlaybookResponse>
     */
    public AsyncInvoker<ShowPlaybookRequest, ShowPlaybookResponse> showPlaybookAsyncInvoker(
        ShowPlaybookRequest request) {
        return new AsyncInvoker<ShowPlaybookRequest, ShowPlaybookResponse>(request, SaMeta.showPlaybook, hcClient);
    }

    /**
     * 剧本运行监控（仅支持华东-上海一使用）
     *
     * 剧本运行监控
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlaybookMonitorsRequest 请求对象
     * @return CompletableFuture<ShowPlaybookMonitorsResponse>
     */
    public CompletableFuture<ShowPlaybookMonitorsResponse> showPlaybookMonitorsAsync(
        ShowPlaybookMonitorsRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.showPlaybookMonitors);
    }

    /**
     * 剧本运行监控（仅支持华东-上海一使用）
     *
     * 剧本运行监控
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlaybookMonitorsRequest 请求对象
     * @return AsyncInvoker<ShowPlaybookMonitorsRequest, ShowPlaybookMonitorsResponse>
     */
    public AsyncInvoker<ShowPlaybookMonitorsRequest, ShowPlaybookMonitorsResponse> showPlaybookMonitorsAsyncInvoker(
        ShowPlaybookMonitorsRequest request) {
        return new AsyncInvoker<ShowPlaybookMonitorsRequest, ShowPlaybookMonitorsResponse>(request,
            SaMeta.showPlaybookMonitors, hcClient);
    }

    /**
     * 剧本数据统计（仅支持华东-上海一使用）
     *
     * 剧本统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlaybookStatisticsRequest 请求对象
     * @return CompletableFuture<ShowPlaybookStatisticsResponse>
     */
    public CompletableFuture<ShowPlaybookStatisticsResponse> showPlaybookStatisticsAsync(
        ShowPlaybookStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.showPlaybookStatistics);
    }

    /**
     * 剧本数据统计（仅支持华东-上海一使用）
     *
     * 剧本统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlaybookStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowPlaybookStatisticsRequest, ShowPlaybookStatisticsResponse>
     */
    public AsyncInvoker<ShowPlaybookStatisticsRequest, ShowPlaybookStatisticsResponse> showPlaybookStatisticsAsyncInvoker(
        ShowPlaybookStatisticsRequest request) {
        return new AsyncInvoker<ShowPlaybookStatisticsRequest, ShowPlaybookStatisticsResponse>(request,
            SaMeta.showPlaybookStatistics, hcClient);
    }

    /**
     * 修改剧本（仅支持华东-上海一使用）
     *
     * Update playbook.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePlaybookRequest 请求对象
     * @return CompletableFuture<UpdatePlaybookResponse>
     */
    public CompletableFuture<UpdatePlaybookResponse> updatePlaybookAsync(UpdatePlaybookRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.updatePlaybook);
    }

    /**
     * 修改剧本（仅支持华东-上海一使用）
     *
     * Update playbook.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePlaybookRequest 请求对象
     * @return AsyncInvoker<UpdatePlaybookRequest, UpdatePlaybookResponse>
     */
    public AsyncInvoker<UpdatePlaybookRequest, UpdatePlaybookResponse> updatePlaybookAsyncInvoker(
        UpdatePlaybookRequest request) {
        return new AsyncInvoker<UpdatePlaybookRequest, UpdatePlaybookResponse>(request, SaMeta.updatePlaybook,
            hcClient);
    }

    /**
     * 创建剧本动作（仅支持华东-上海一使用）
     *
     * Create action.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePlaybookActionRequest 请求对象
     * @return CompletableFuture<CreatePlaybookActionResponse>
     */
    public CompletableFuture<CreatePlaybookActionResponse> createPlaybookActionAsync(
        CreatePlaybookActionRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.createPlaybookAction);
    }

    /**
     * 创建剧本动作（仅支持华东-上海一使用）
     *
     * Create action.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePlaybookActionRequest 请求对象
     * @return AsyncInvoker<CreatePlaybookActionRequest, CreatePlaybookActionResponse>
     */
    public AsyncInvoker<CreatePlaybookActionRequest, CreatePlaybookActionResponse> createPlaybookActionAsyncInvoker(
        CreatePlaybookActionRequest request) {
        return new AsyncInvoker<CreatePlaybookActionRequest, CreatePlaybookActionResponse>(request,
            SaMeta.createPlaybookAction, hcClient);
    }

    /**
     * 删除剧本动作（仅支持华东-上海一使用）
     *
     * Delete action.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePlaybookActionRequest 请求对象
     * @return CompletableFuture<DeletePlaybookActionResponse>
     */
    public CompletableFuture<DeletePlaybookActionResponse> deletePlaybookActionAsync(
        DeletePlaybookActionRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.deletePlaybookAction);
    }

    /**
     * 删除剧本动作（仅支持华东-上海一使用）
     *
     * Delete action.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePlaybookActionRequest 请求对象
     * @return AsyncInvoker<DeletePlaybookActionRequest, DeletePlaybookActionResponse>
     */
    public AsyncInvoker<DeletePlaybookActionRequest, DeletePlaybookActionResponse> deletePlaybookActionAsyncInvoker(
        DeletePlaybookActionRequest request) {
        return new AsyncInvoker<DeletePlaybookActionRequest, DeletePlaybookActionResponse>(request,
            SaMeta.deletePlaybookAction, hcClient);
    }

    /**
     * 查询剧本动作（仅支持华东-上海一使用）
     *
     * List all actions.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPlaybookActionsRequest 请求对象
     * @return CompletableFuture<ListPlaybookActionsResponse>
     */
    public CompletableFuture<ListPlaybookActionsResponse> listPlaybookActionsAsync(ListPlaybookActionsRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.listPlaybookActions);
    }

    /**
     * 查询剧本动作（仅支持华东-上海一使用）
     *
     * List all actions.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPlaybookActionsRequest 请求对象
     * @return AsyncInvoker<ListPlaybookActionsRequest, ListPlaybookActionsResponse>
     */
    public AsyncInvoker<ListPlaybookActionsRequest, ListPlaybookActionsResponse> listPlaybookActionsAsyncInvoker(
        ListPlaybookActionsRequest request) {
        return new AsyncInvoker<ListPlaybookActionsRequest, ListPlaybookActionsResponse>(request,
            SaMeta.listPlaybookActions, hcClient);
    }

    /**
     * 更新剧本动作（仅支持华东-上海一使用）
     *
     * Update action.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePlaybookActionRequest 请求对象
     * @return CompletableFuture<UpdatePlaybookActionResponse>
     */
    public CompletableFuture<UpdatePlaybookActionResponse> updatePlaybookActionAsync(
        UpdatePlaybookActionRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.updatePlaybookAction);
    }

    /**
     * 更新剧本动作（仅支持华东-上海一使用）
     *
     * Update action.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePlaybookActionRequest 请求对象
     * @return AsyncInvoker<UpdatePlaybookActionRequest, UpdatePlaybookActionResponse>
     */
    public AsyncInvoker<UpdatePlaybookActionRequest, UpdatePlaybookActionResponse> updatePlaybookActionAsyncInvoker(
        UpdatePlaybookActionRequest request) {
        return new AsyncInvoker<UpdatePlaybookActionRequest, UpdatePlaybookActionResponse>(request,
            SaMeta.updatePlaybookAction, hcClient);
    }

    /**
     * 审核剧本（仅支持华东-上海一使用）
     *
     * Create playbook approve.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePlaybookApproveRequest 请求对象
     * @return CompletableFuture<CreatePlaybookApproveResponse>
     */
    public CompletableFuture<CreatePlaybookApproveResponse> createPlaybookApproveAsync(
        CreatePlaybookApproveRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.createPlaybookApprove);
    }

    /**
     * 审核剧本（仅支持华东-上海一使用）
     *
     * Create playbook approve.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePlaybookApproveRequest 请求对象
     * @return AsyncInvoker<CreatePlaybookApproveRequest, CreatePlaybookApproveResponse>
     */
    public AsyncInvoker<CreatePlaybookApproveRequest, CreatePlaybookApproveResponse> createPlaybookApproveAsyncInvoker(
        CreatePlaybookApproveRequest request) {
        return new AsyncInvoker<CreatePlaybookApproveRequest, CreatePlaybookApproveResponse>(request,
            SaMeta.createPlaybookApprove, hcClient);
    }

    /**
     * 查询剧本审核结果（仅支持华东-上海一使用）
     *
     * List approves.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPlaybookApprovesRequest 请求对象
     * @return CompletableFuture<ListPlaybookApprovesResponse>
     */
    public CompletableFuture<ListPlaybookApprovesResponse> listPlaybookApprovesAsync(
        ListPlaybookApprovesRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.listPlaybookApproves);
    }

    /**
     * 查询剧本审核结果（仅支持华东-上海一使用）
     *
     * List approves.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPlaybookApprovesRequest 请求对象
     * @return AsyncInvoker<ListPlaybookApprovesRequest, ListPlaybookApprovesResponse>
     */
    public AsyncInvoker<ListPlaybookApprovesRequest, ListPlaybookApprovesResponse> listPlaybookApprovesAsyncInvoker(
        ListPlaybookApprovesRequest request) {
        return new AsyncInvoker<ListPlaybookApprovesRequest, ListPlaybookApprovesResponse>(request,
            SaMeta.listPlaybookApproves, hcClient);
    }

    /**
     * 操作剧本实例（仅支持华东-上海一使用）
     *
     * Operation Playbook Instance.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangePlaybookInstanceRequest 请求对象
     * @return CompletableFuture<ChangePlaybookInstanceResponse>
     */
    public CompletableFuture<ChangePlaybookInstanceResponse> changePlaybookInstanceAsync(
        ChangePlaybookInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.changePlaybookInstance);
    }

    /**
     * 操作剧本实例（仅支持华东-上海一使用）
     *
     * Operation Playbook Instance.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangePlaybookInstanceRequest 请求对象
     * @return AsyncInvoker<ChangePlaybookInstanceRequest, ChangePlaybookInstanceResponse>
     */
    public AsyncInvoker<ChangePlaybookInstanceRequest, ChangePlaybookInstanceResponse> changePlaybookInstanceAsyncInvoker(
        ChangePlaybookInstanceRequest request) {
        return new AsyncInvoker<ChangePlaybookInstanceRequest, ChangePlaybookInstanceResponse>(request,
            SaMeta.changePlaybookInstance, hcClient);
    }

    /**
     * 查询剧本实例审计日志（仅支持华东-上海一使用）
     *
     * List audit logs.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPlaybookAuditLogsRequest 请求对象
     * @return CompletableFuture<ListPlaybookAuditLogsResponse>
     */
    public CompletableFuture<ListPlaybookAuditLogsResponse> listPlaybookAuditLogsAsync(
        ListPlaybookAuditLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.listPlaybookAuditLogs);
    }

    /**
     * 查询剧本实例审计日志（仅支持华东-上海一使用）
     *
     * List audit logs.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPlaybookAuditLogsRequest 请求对象
     * @return AsyncInvoker<ListPlaybookAuditLogsRequest, ListPlaybookAuditLogsResponse>
     */
    public AsyncInvoker<ListPlaybookAuditLogsRequest, ListPlaybookAuditLogsResponse> listPlaybookAuditLogsAsyncInvoker(
        ListPlaybookAuditLogsRequest request) {
        return new AsyncInvoker<ListPlaybookAuditLogsRequest, ListPlaybookAuditLogsResponse>(request,
            SaMeta.listPlaybookAuditLogs, hcClient);
    }

    /**
     * 查询剧本实例列表（仅支持华东-上海一使用）
     *
     * List playbook instances
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPlaybookInstancesRequest 请求对象
     * @return CompletableFuture<ListPlaybookInstancesResponse>
     */
    public CompletableFuture<ListPlaybookInstancesResponse> listPlaybookInstancesAsync(
        ListPlaybookInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.listPlaybookInstances);
    }

    /**
     * 查询剧本实例列表（仅支持华东-上海一使用）
     *
     * List playbook instances
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPlaybookInstancesRequest 请求对象
     * @return AsyncInvoker<ListPlaybookInstancesRequest, ListPlaybookInstancesResponse>
     */
    public AsyncInvoker<ListPlaybookInstancesRequest, ListPlaybookInstancesResponse> listPlaybookInstancesAsyncInvoker(
        ListPlaybookInstancesRequest request) {
        return new AsyncInvoker<ListPlaybookInstancesRequest, ListPlaybookInstancesResponse>(request,
            SaMeta.listPlaybookInstances, hcClient);
    }

    /**
     * 查询剧本实例详情（仅支持华东-上海一使用）
     *
     * Show playbook instance
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlaybookInstanceRequest 请求对象
     * @return CompletableFuture<ShowPlaybookInstanceResponse>
     */
    public CompletableFuture<ShowPlaybookInstanceResponse> showPlaybookInstanceAsync(
        ShowPlaybookInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.showPlaybookInstance);
    }

    /**
     * 查询剧本实例详情（仅支持华东-上海一使用）
     *
     * Show playbook instance
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlaybookInstanceRequest 请求对象
     * @return AsyncInvoker<ShowPlaybookInstanceRequest, ShowPlaybookInstanceResponse>
     */
    public AsyncInvoker<ShowPlaybookInstanceRequest, ShowPlaybookInstanceResponse> showPlaybookInstanceAsyncInvoker(
        ShowPlaybookInstanceRequest request) {
        return new AsyncInvoker<ShowPlaybookInstanceRequest, ShowPlaybookInstanceResponse>(request,
            SaMeta.showPlaybookInstance, hcClient);
    }

    /**
     * 查询剧本拓扑关系（仅支持华东-上海一使用）
     *
     * Show playbook Topology
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlaybookTopologyRequest 请求对象
     * @return CompletableFuture<ShowPlaybookTopologyResponse>
     */
    public CompletableFuture<ShowPlaybookTopologyResponse> showPlaybookTopologyAsync(
        ShowPlaybookTopologyRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.showPlaybookTopology);
    }

    /**
     * 查询剧本拓扑关系（仅支持华东-上海一使用）
     *
     * Show playbook Topology
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlaybookTopologyRequest 请求对象
     * @return AsyncInvoker<ShowPlaybookTopologyRequest, ShowPlaybookTopologyResponse>
     */
    public AsyncInvoker<ShowPlaybookTopologyRequest, ShowPlaybookTopologyResponse> showPlaybookTopologyAsyncInvoker(
        ShowPlaybookTopologyRequest request) {
        return new AsyncInvoker<ShowPlaybookTopologyRequest, ShowPlaybookTopologyResponse>(request,
            SaMeta.showPlaybookTopology, hcClient);
    }

    /**
     * 创建剧本规则（仅支持华东-上海一使用）
     *
     * Create rule.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePlaybookRuleRequest 请求对象
     * @return CompletableFuture<CreatePlaybookRuleResponse>
     */
    public CompletableFuture<CreatePlaybookRuleResponse> createPlaybookRuleAsync(CreatePlaybookRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.createPlaybookRule);
    }

    /**
     * 创建剧本规则（仅支持华东-上海一使用）
     *
     * Create rule.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePlaybookRuleRequest 请求对象
     * @return AsyncInvoker<CreatePlaybookRuleRequest, CreatePlaybookRuleResponse>
     */
    public AsyncInvoker<CreatePlaybookRuleRequest, CreatePlaybookRuleResponse> createPlaybookRuleAsyncInvoker(
        CreatePlaybookRuleRequest request) {
        return new AsyncInvoker<CreatePlaybookRuleRequest, CreatePlaybookRuleResponse>(request,
            SaMeta.createPlaybookRule, hcClient);
    }

    /**
     * 删除剧本规则（仅支持华东-上海一使用）
     *
     * Delete rule.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePlaybookRuleRequest 请求对象
     * @return CompletableFuture<DeletePlaybookRuleResponse>
     */
    public CompletableFuture<DeletePlaybookRuleResponse> deletePlaybookRuleAsync(DeletePlaybookRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.deletePlaybookRule);
    }

    /**
     * 删除剧本规则（仅支持华东-上海一使用）
     *
     * Delete rule.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePlaybookRuleRequest 请求对象
     * @return AsyncInvoker<DeletePlaybookRuleRequest, DeletePlaybookRuleResponse>
     */
    public AsyncInvoker<DeletePlaybookRuleRequest, DeletePlaybookRuleResponse> deletePlaybookRuleAsyncInvoker(
        DeletePlaybookRuleRequest request) {
        return new AsyncInvoker<DeletePlaybookRuleRequest, DeletePlaybookRuleResponse>(request,
            SaMeta.deletePlaybookRule, hcClient);
    }

    /**
     * 查询剧本规则详情（仅支持华东-上海一使用）
     *
     * Show rule formation.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlaybookRuleRequest 请求对象
     * @return CompletableFuture<ShowPlaybookRuleResponse>
     */
    public CompletableFuture<ShowPlaybookRuleResponse> showPlaybookRuleAsync(ShowPlaybookRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.showPlaybookRule);
    }

    /**
     * 查询剧本规则详情（仅支持华东-上海一使用）
     *
     * Show rule formation.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlaybookRuleRequest 请求对象
     * @return AsyncInvoker<ShowPlaybookRuleRequest, ShowPlaybookRuleResponse>
     */
    public AsyncInvoker<ShowPlaybookRuleRequest, ShowPlaybookRuleResponse> showPlaybookRuleAsyncInvoker(
        ShowPlaybookRuleRequest request) {
        return new AsyncInvoker<ShowPlaybookRuleRequest, ShowPlaybookRuleResponse>(request, SaMeta.showPlaybookRule,
            hcClient);
    }

    /**
     * 更新剧本规则（仅支持华东-上海一使用）
     *
     * Update rule.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePlaybookRuleRequest 请求对象
     * @return CompletableFuture<UpdatePlaybookRuleResponse>
     */
    public CompletableFuture<UpdatePlaybookRuleResponse> updatePlaybookRuleAsync(UpdatePlaybookRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.updatePlaybookRule);
    }

    /**
     * 更新剧本规则（仅支持华东-上海一使用）
     *
     * Update rule.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePlaybookRuleRequest 请求对象
     * @return AsyncInvoker<UpdatePlaybookRuleRequest, UpdatePlaybookRuleResponse>
     */
    public AsyncInvoker<UpdatePlaybookRuleRequest, UpdatePlaybookRuleResponse> updatePlaybookRuleAsyncInvoker(
        UpdatePlaybookRuleRequest request) {
        return new AsyncInvoker<UpdatePlaybookRuleRequest, UpdatePlaybookRuleResponse>(request,
            SaMeta.updatePlaybookRule, hcClient);
    }

    /**
     * 克隆剧本及版本（仅支持华东-上海一使用）
     *
     * Copy Playbook and version to a new one
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CopyPlaybookVersionRequest 请求对象
     * @return CompletableFuture<CopyPlaybookVersionResponse>
     */
    public CompletableFuture<CopyPlaybookVersionResponse> copyPlaybookVersionAsync(CopyPlaybookVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.copyPlaybookVersion);
    }

    /**
     * 克隆剧本及版本（仅支持华东-上海一使用）
     *
     * Copy Playbook and version to a new one
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CopyPlaybookVersionRequest 请求对象
     * @return AsyncInvoker<CopyPlaybookVersionRequest, CopyPlaybookVersionResponse>
     */
    public AsyncInvoker<CopyPlaybookVersionRequest, CopyPlaybookVersionResponse> copyPlaybookVersionAsyncInvoker(
        CopyPlaybookVersionRequest request) {
        return new AsyncInvoker<CopyPlaybookVersionRequest, CopyPlaybookVersionResponse>(request,
            SaMeta.copyPlaybookVersion, hcClient);
    }

    /**
     * 创建剧本版本（仅支持华东-上海一使用）
     *
     * Create playbook version.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePlaybookVersionRequest 请求对象
     * @return CompletableFuture<CreatePlaybookVersionResponse>
     */
    public CompletableFuture<CreatePlaybookVersionResponse> createPlaybookVersionAsync(
        CreatePlaybookVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.createPlaybookVersion);
    }

    /**
     * 创建剧本版本（仅支持华东-上海一使用）
     *
     * Create playbook version.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePlaybookVersionRequest 请求对象
     * @return AsyncInvoker<CreatePlaybookVersionRequest, CreatePlaybookVersionResponse>
     */
    public AsyncInvoker<CreatePlaybookVersionRequest, CreatePlaybookVersionResponse> createPlaybookVersionAsyncInvoker(
        CreatePlaybookVersionRequest request) {
        return new AsyncInvoker<CreatePlaybookVersionRequest, CreatePlaybookVersionResponse>(request,
            SaMeta.createPlaybookVersion, hcClient);
    }

    /**
     * 删除剧本版本（仅支持华东-上海一使用）
     *
     * Delete playbook version.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePlaybookVersionRequest 请求对象
     * @return CompletableFuture<DeletePlaybookVersionResponse>
     */
    public CompletableFuture<DeletePlaybookVersionResponse> deletePlaybookVersionAsync(
        DeletePlaybookVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.deletePlaybookVersion);
    }

    /**
     * 删除剧本版本（仅支持华东-上海一使用）
     *
     * Delete playbook version.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePlaybookVersionRequest 请求对象
     * @return AsyncInvoker<DeletePlaybookVersionRequest, DeletePlaybookVersionResponse>
     */
    public AsyncInvoker<DeletePlaybookVersionRequest, DeletePlaybookVersionResponse> deletePlaybookVersionAsyncInvoker(
        DeletePlaybookVersionRequest request) {
        return new AsyncInvoker<DeletePlaybookVersionRequest, DeletePlaybookVersionResponse>(request,
            SaMeta.deletePlaybookVersion, hcClient);
    }

    /**
     * 查询剧本版本列表（仅支持华东-上海一使用）
     *
     * List all versions of playbook.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPlaybookVersionsRequest 请求对象
     * @return CompletableFuture<ListPlaybookVersionsResponse>
     */
    public CompletableFuture<ListPlaybookVersionsResponse> listPlaybookVersionsAsync(
        ListPlaybookVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.listPlaybookVersions);
    }

    /**
     * 查询剧本版本列表（仅支持华东-上海一使用）
     *
     * List all versions of playbook.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPlaybookVersionsRequest 请求对象
     * @return AsyncInvoker<ListPlaybookVersionsRequest, ListPlaybookVersionsResponse>
     */
    public AsyncInvoker<ListPlaybookVersionsRequest, ListPlaybookVersionsResponse> listPlaybookVersionsAsyncInvoker(
        ListPlaybookVersionsRequest request) {
        return new AsyncInvoker<ListPlaybookVersionsRequest, ListPlaybookVersionsResponse>(request,
            SaMeta.listPlaybookVersions, hcClient);
    }

    /**
     * 查询剧本版本详情（仅支持华东-上海一使用）
     *
     * Show playbook version version
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlaybookVersionRequest 请求对象
     * @return CompletableFuture<ShowPlaybookVersionResponse>
     */
    public CompletableFuture<ShowPlaybookVersionResponse> showPlaybookVersionAsync(ShowPlaybookVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.showPlaybookVersion);
    }

    /**
     * 查询剧本版本详情（仅支持华东-上海一使用）
     *
     * Show playbook version version
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlaybookVersionRequest 请求对象
     * @return AsyncInvoker<ShowPlaybookVersionRequest, ShowPlaybookVersionResponse>
     */
    public AsyncInvoker<ShowPlaybookVersionRequest, ShowPlaybookVersionResponse> showPlaybookVersionAsyncInvoker(
        ShowPlaybookVersionRequest request) {
        return new AsyncInvoker<ShowPlaybookVersionRequest, ShowPlaybookVersionResponse>(request,
            SaMeta.showPlaybookVersion, hcClient);
    }

    /**
     * 更新剧本版本（仅支持华东-上海一使用）
     *
     * Update playbook version.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePlaybookVersionRequest 请求对象
     * @return CompletableFuture<UpdatePlaybookVersionResponse>
     */
    public CompletableFuture<UpdatePlaybookVersionResponse> updatePlaybookVersionAsync(
        UpdatePlaybookVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.updatePlaybookVersion);
    }

    /**
     * 更新剧本版本（仅支持华东-上海一使用）
     *
     * Update playbook version.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePlaybookVersionRequest 请求对象
     * @return AsyncInvoker<UpdatePlaybookVersionRequest, UpdatePlaybookVersionResponse>
     */
    public AsyncInvoker<UpdatePlaybookVersionRequest, UpdatePlaybookVersionResponse> updatePlaybookVersionAsyncInvoker(
        UpdatePlaybookVersionRequest request) {
        return new AsyncInvoker<UpdatePlaybookVersionRequest, UpdatePlaybookVersionResponse>(request,
            SaMeta.updatePlaybookVersion, hcClient);
    }

    /**
     * 创建Dataobject关系
     *
     * Create Dataobject Relation
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDataobjectRelationRequest 请求对象
     * @return CompletableFuture<CreateDataobjectRelationResponse>
     */
    public CompletableFuture<CreateDataobjectRelationResponse> createDataobjectRelationAsync(
        CreateDataobjectRelationRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.createDataobjectRelation);
    }

    /**
     * 创建Dataobject关系
     *
     * Create Dataobject Relation
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDataobjectRelationRequest 请求对象
     * @return AsyncInvoker<CreateDataobjectRelationRequest, CreateDataobjectRelationResponse>
     */
    public AsyncInvoker<CreateDataobjectRelationRequest, CreateDataobjectRelationResponse> createDataobjectRelationAsyncInvoker(
        CreateDataobjectRelationRequest request) {
        return new AsyncInvoker<CreateDataobjectRelationRequest, CreateDataobjectRelationResponse>(request,
            SaMeta.createDataobjectRelation, hcClient);
    }

    /**
     * 删除Dataobject关系
     *
     * Delete Dataobject Relation
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDataobjectRelationRequest 请求对象
     * @return CompletableFuture<DeleteDataobjectRelationResponse>
     */
    public CompletableFuture<DeleteDataobjectRelationResponse> deleteDataobjectRelationAsync(
        DeleteDataobjectRelationRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.deleteDataobjectRelation);
    }

    /**
     * 删除Dataobject关系
     *
     * Delete Dataobject Relation
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDataobjectRelationRequest 请求对象
     * @return AsyncInvoker<DeleteDataobjectRelationRequest, DeleteDataobjectRelationResponse>
     */
    public AsyncInvoker<DeleteDataobjectRelationRequest, DeleteDataobjectRelationResponse> deleteDataobjectRelationAsyncInvoker(
        DeleteDataobjectRelationRequest request) {
        return new AsyncInvoker<DeleteDataobjectRelationRequest, DeleteDataobjectRelationResponse>(request,
            SaMeta.deleteDataobjectRelation, hcClient);
    }

    /**
     * 查询Dataobject关系列表
     *
     * List Dataobject Relation
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDataobjectRelationRequest 请求对象
     * @return CompletableFuture<ListDataobjectRelationResponse>
     */
    public CompletableFuture<ListDataobjectRelationResponse> listDataobjectRelationAsync(
        ListDataobjectRelationRequest request) {
        return hcClient.asyncInvokeHttp(request, SaMeta.listDataobjectRelation);
    }

    /**
     * 查询Dataobject关系列表
     *
     * List Dataobject Relation
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDataobjectRelationRequest 请求对象
     * @return AsyncInvoker<ListDataobjectRelationRequest, ListDataobjectRelationResponse>
     */
    public AsyncInvoker<ListDataobjectRelationRequest, ListDataobjectRelationResponse> listDataobjectRelationAsyncInvoker(
        ListDataobjectRelationRequest request) {
        return new AsyncInvoker<ListDataobjectRelationRequest, ListDataobjectRelationResponse>(request,
            SaMeta.listDataobjectRelation, hcClient);
    }

}

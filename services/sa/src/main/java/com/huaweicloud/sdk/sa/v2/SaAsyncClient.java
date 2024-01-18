package com.huaweicloud.sdk.sa.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.sa.v2.model.ChangeAlertRequest;
import com.huaweicloud.sdk.sa.v2.model.ChangeAlertResponse;
import com.huaweicloud.sdk.sa.v2.model.ChangeIncidentRequest;
import com.huaweicloud.sdk.sa.v2.model.ChangeIncidentResponse;
import com.huaweicloud.sdk.sa.v2.model.ChangePlaybookInstanceRequest;
import com.huaweicloud.sdk.sa.v2.model.ChangePlaybookInstanceResponse;
import com.huaweicloud.sdk.sa.v2.model.CopyPlaybookVersionRequest;
import com.huaweicloud.sdk.sa.v2.model.CopyPlaybookVersionResponse;
import com.huaweicloud.sdk.sa.v2.model.CreateAlertRequest;
import com.huaweicloud.sdk.sa.v2.model.CreateAlertResponse;
import com.huaweicloud.sdk.sa.v2.model.CreateAlertRuleRequest;
import com.huaweicloud.sdk.sa.v2.model.CreateAlertRuleResponse;
import com.huaweicloud.sdk.sa.v2.model.CreateAlertRuleSimulationRequest;
import com.huaweicloud.sdk.sa.v2.model.CreateAlertRuleSimulationResponse;
import com.huaweicloud.sdk.sa.v2.model.CreateBatchOrderAlertsRequest;
import com.huaweicloud.sdk.sa.v2.model.CreateBatchOrderAlertsResponse;
import com.huaweicloud.sdk.sa.v2.model.CreateDataobjectRelationRequest;
import com.huaweicloud.sdk.sa.v2.model.CreateDataobjectRelationResponse;
import com.huaweicloud.sdk.sa.v2.model.CreateIncidentRequest;
import com.huaweicloud.sdk.sa.v2.model.CreateIncidentResponse;
import com.huaweicloud.sdk.sa.v2.model.CreateIndicatorRequest;
import com.huaweicloud.sdk.sa.v2.model.CreateIndicatorResponse;
import com.huaweicloud.sdk.sa.v2.model.CreatePlaybookActionRequest;
import com.huaweicloud.sdk.sa.v2.model.CreatePlaybookActionResponse;
import com.huaweicloud.sdk.sa.v2.model.CreatePlaybookApproveRequest;
import com.huaweicloud.sdk.sa.v2.model.CreatePlaybookApproveResponse;
import com.huaweicloud.sdk.sa.v2.model.CreatePlaybookRequest;
import com.huaweicloud.sdk.sa.v2.model.CreatePlaybookResponse;
import com.huaweicloud.sdk.sa.v2.model.CreatePlaybookRuleRequest;
import com.huaweicloud.sdk.sa.v2.model.CreatePlaybookRuleResponse;
import com.huaweicloud.sdk.sa.v2.model.CreatePlaybookVersionRequest;
import com.huaweicloud.sdk.sa.v2.model.CreatePlaybookVersionResponse;
import com.huaweicloud.sdk.sa.v2.model.DeleteAlertRequest;
import com.huaweicloud.sdk.sa.v2.model.DeleteAlertResponse;
import com.huaweicloud.sdk.sa.v2.model.DeleteAlertRuleRequest;
import com.huaweicloud.sdk.sa.v2.model.DeleteAlertRuleResponse;
import com.huaweicloud.sdk.sa.v2.model.DeleteDataobjectRelationRequest;
import com.huaweicloud.sdk.sa.v2.model.DeleteDataobjectRelationResponse;
import com.huaweicloud.sdk.sa.v2.model.DeleteIncidentRequest;
import com.huaweicloud.sdk.sa.v2.model.DeleteIncidentResponse;
import com.huaweicloud.sdk.sa.v2.model.DeleteIndicatorRequest;
import com.huaweicloud.sdk.sa.v2.model.DeleteIndicatorResponse;
import com.huaweicloud.sdk.sa.v2.model.DeletePlaybookActionRequest;
import com.huaweicloud.sdk.sa.v2.model.DeletePlaybookActionResponse;
import com.huaweicloud.sdk.sa.v2.model.DeletePlaybookRequest;
import com.huaweicloud.sdk.sa.v2.model.DeletePlaybookResponse;
import com.huaweicloud.sdk.sa.v2.model.DeletePlaybookRuleRequest;
import com.huaweicloud.sdk.sa.v2.model.DeletePlaybookRuleResponse;
import com.huaweicloud.sdk.sa.v2.model.DeletePlaybookVersionRequest;
import com.huaweicloud.sdk.sa.v2.model.DeletePlaybookVersionResponse;
import com.huaweicloud.sdk.sa.v2.model.DisableAlertRuleRequest;
import com.huaweicloud.sdk.sa.v2.model.DisableAlertRuleResponse;
import com.huaweicloud.sdk.sa.v2.model.EnableAlertRuleRequest;
import com.huaweicloud.sdk.sa.v2.model.EnableAlertRuleResponse;
import com.huaweicloud.sdk.sa.v2.model.ListAlertRuleMetricsRequest;
import com.huaweicloud.sdk.sa.v2.model.ListAlertRuleMetricsResponse;
import com.huaweicloud.sdk.sa.v2.model.ListAlertRuleTemplatesRequest;
import com.huaweicloud.sdk.sa.v2.model.ListAlertRuleTemplatesResponse;
import com.huaweicloud.sdk.sa.v2.model.ListAlertRulesRequest;
import com.huaweicloud.sdk.sa.v2.model.ListAlertRulesResponse;
import com.huaweicloud.sdk.sa.v2.model.ListAlertsRequest;
import com.huaweicloud.sdk.sa.v2.model.ListAlertsResponse;
import com.huaweicloud.sdk.sa.v2.model.ListDataobjectRelationRequest;
import com.huaweicloud.sdk.sa.v2.model.ListDataobjectRelationResponse;
import com.huaweicloud.sdk.sa.v2.model.ListIncidentTypesRequest;
import com.huaweicloud.sdk.sa.v2.model.ListIncidentTypesResponse;
import com.huaweicloud.sdk.sa.v2.model.ListIncidentsRequest;
import com.huaweicloud.sdk.sa.v2.model.ListIncidentsResponse;
import com.huaweicloud.sdk.sa.v2.model.ListIndicatorsRequest;
import com.huaweicloud.sdk.sa.v2.model.ListIndicatorsResponse;
import com.huaweicloud.sdk.sa.v2.model.ListPlaybookActionsRequest;
import com.huaweicloud.sdk.sa.v2.model.ListPlaybookActionsResponse;
import com.huaweicloud.sdk.sa.v2.model.ListPlaybookApprovesRequest;
import com.huaweicloud.sdk.sa.v2.model.ListPlaybookApprovesResponse;
import com.huaweicloud.sdk.sa.v2.model.ListPlaybookAuditLogsRequest;
import com.huaweicloud.sdk.sa.v2.model.ListPlaybookAuditLogsResponse;
import com.huaweicloud.sdk.sa.v2.model.ListPlaybookInstancesRequest;
import com.huaweicloud.sdk.sa.v2.model.ListPlaybookInstancesResponse;
import com.huaweicloud.sdk.sa.v2.model.ListPlaybookVersionsRequest;
import com.huaweicloud.sdk.sa.v2.model.ListPlaybookVersionsResponse;
import com.huaweicloud.sdk.sa.v2.model.ListPlaybooksRequest;
import com.huaweicloud.sdk.sa.v2.model.ListPlaybooksResponse;
import com.huaweicloud.sdk.sa.v2.model.ShowAlertRequest;
import com.huaweicloud.sdk.sa.v2.model.ShowAlertResponse;
import com.huaweicloud.sdk.sa.v2.model.ShowAlertRuleRequest;
import com.huaweicloud.sdk.sa.v2.model.ShowAlertRuleResponse;
import com.huaweicloud.sdk.sa.v2.model.ShowAlertRuleTemplateRequest;
import com.huaweicloud.sdk.sa.v2.model.ShowAlertRuleTemplateResponse;
import com.huaweicloud.sdk.sa.v2.model.ShowIncidentRequest;
import com.huaweicloud.sdk.sa.v2.model.ShowIncidentResponse;
import com.huaweicloud.sdk.sa.v2.model.ShowIndicatorDetailRequest;
import com.huaweicloud.sdk.sa.v2.model.ShowIndicatorDetailResponse;
import com.huaweicloud.sdk.sa.v2.model.ShowPlaybookInstanceRequest;
import com.huaweicloud.sdk.sa.v2.model.ShowPlaybookInstanceResponse;
import com.huaweicloud.sdk.sa.v2.model.ShowPlaybookMonitorsRequest;
import com.huaweicloud.sdk.sa.v2.model.ShowPlaybookMonitorsResponse;
import com.huaweicloud.sdk.sa.v2.model.ShowPlaybookRequest;
import com.huaweicloud.sdk.sa.v2.model.ShowPlaybookResponse;
import com.huaweicloud.sdk.sa.v2.model.ShowPlaybookRuleRequest;
import com.huaweicloud.sdk.sa.v2.model.ShowPlaybookRuleResponse;
import com.huaweicloud.sdk.sa.v2.model.ShowPlaybookStatisticsRequest;
import com.huaweicloud.sdk.sa.v2.model.ShowPlaybookStatisticsResponse;
import com.huaweicloud.sdk.sa.v2.model.ShowPlaybookTopologyRequest;
import com.huaweicloud.sdk.sa.v2.model.ShowPlaybookTopologyResponse;
import com.huaweicloud.sdk.sa.v2.model.ShowPlaybookVersionRequest;
import com.huaweicloud.sdk.sa.v2.model.ShowPlaybookVersionResponse;
import com.huaweicloud.sdk.sa.v2.model.UpdateAlertRuleRequest;
import com.huaweicloud.sdk.sa.v2.model.UpdateAlertRuleResponse;
import com.huaweicloud.sdk.sa.v2.model.UpdateIndicatorRequest;
import com.huaweicloud.sdk.sa.v2.model.UpdateIndicatorResponse;
import com.huaweicloud.sdk.sa.v2.model.UpdatePlaybookActionRequest;
import com.huaweicloud.sdk.sa.v2.model.UpdatePlaybookActionResponse;
import com.huaweicloud.sdk.sa.v2.model.UpdatePlaybookRequest;
import com.huaweicloud.sdk.sa.v2.model.UpdatePlaybookResponse;
import com.huaweicloud.sdk.sa.v2.model.UpdatePlaybookRuleRequest;
import com.huaweicloud.sdk.sa.v2.model.UpdatePlaybookRuleResponse;
import com.huaweicloud.sdk.sa.v2.model.UpdatePlaybookVersionRequest;
import com.huaweicloud.sdk.sa.v2.model.UpdatePlaybookVersionResponse;

import java.util.concurrent.CompletableFuture;

public class SaAsyncClient {

    protected HcClient hcClient;

    public SaAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SaAsyncClient> newBuilder() {
        ClientBuilder<SaAsyncClient> clientBuilder = new ClientBuilder<>(SaAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 创建告警规则（仅支持华东-上海一使用）
     *
     * Create alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlertRuleRequest 请求对象
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
     * @param request CreateAlertRuleRequest 请求对象
     * @return AsyncInvoker<CreateAlertRuleRequest, CreateAlertRuleResponse>
     */
    public AsyncInvoker<CreateAlertRuleRequest, CreateAlertRuleResponse> createAlertRuleAsyncInvoker(
        CreateAlertRuleRequest request) {
        return new AsyncInvoker<>(request, SaMeta.createAlertRule, hcClient);
    }

    /**
     * 模拟告警规则（仅支持华东-上海一使用）
     *
     * Simulate alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlertRuleSimulationRequest 请求对象
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
     * @param request CreateAlertRuleSimulationRequest 请求对象
     * @return AsyncInvoker<CreateAlertRuleSimulationRequest, CreateAlertRuleSimulationResponse>
     */
    public AsyncInvoker<CreateAlertRuleSimulationRequest, CreateAlertRuleSimulationResponse> createAlertRuleSimulationAsyncInvoker(
        CreateAlertRuleSimulationRequest request) {
        return new AsyncInvoker<>(request, SaMeta.createAlertRuleSimulation, hcClient);
    }

    /**
     * 删除告警规则（仅支持华东-上海一使用）
     *
     * Delete alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlertRuleRequest 请求对象
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
     * @param request DeleteAlertRuleRequest 请求对象
     * @return AsyncInvoker<DeleteAlertRuleRequest, DeleteAlertRuleResponse>
     */
    public AsyncInvoker<DeleteAlertRuleRequest, DeleteAlertRuleResponse> deleteAlertRuleAsyncInvoker(
        DeleteAlertRuleRequest request) {
        return new AsyncInvoker<>(request, SaMeta.deleteAlertRule, hcClient);
    }

    /**
     * 停用告警规则（仅支持华东-上海一使用）
     *
     * Disable alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableAlertRuleRequest 请求对象
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
     * @param request DisableAlertRuleRequest 请求对象
     * @return AsyncInvoker<DisableAlertRuleRequest, DisableAlertRuleResponse>
     */
    public AsyncInvoker<DisableAlertRuleRequest, DisableAlertRuleResponse> disableAlertRuleAsyncInvoker(
        DisableAlertRuleRequest request) {
        return new AsyncInvoker<>(request, SaMeta.disableAlertRule, hcClient);
    }

    /**
     * 启用告警规则（仅支持华东-上海一使用）
     *
     * Enable alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableAlertRuleRequest 请求对象
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
     * @param request EnableAlertRuleRequest 请求对象
     * @return AsyncInvoker<EnableAlertRuleRequest, EnableAlertRuleResponse>
     */
    public AsyncInvoker<EnableAlertRuleRequest, EnableAlertRuleResponse> enableAlertRuleAsyncInvoker(
        EnableAlertRuleRequest request) {
        return new AsyncInvoker<>(request, SaMeta.enableAlertRule, hcClient);
    }

    /**
     * 告警规则总览（仅支持华东-上海一使用）
     *
     * List alert rule metrics
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRuleMetricsRequest 请求对象
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
     * @param request ListAlertRuleMetricsRequest 请求对象
     * @return AsyncInvoker<ListAlertRuleMetricsRequest, ListAlertRuleMetricsResponse>
     */
    public AsyncInvoker<ListAlertRuleMetricsRequest, ListAlertRuleMetricsResponse> listAlertRuleMetricsAsyncInvoker(
        ListAlertRuleMetricsRequest request) {
        return new AsyncInvoker<>(request, SaMeta.listAlertRuleMetrics, hcClient);
    }

    /**
     * 列出告警规则模板（仅支持华东-上海一使用）
     *
     * List alert rule templates
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRuleTemplatesRequest 请求对象
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
     * @param request ListAlertRuleTemplatesRequest 请求对象
     * @return AsyncInvoker<ListAlertRuleTemplatesRequest, ListAlertRuleTemplatesResponse>
     */
    public AsyncInvoker<ListAlertRuleTemplatesRequest, ListAlertRuleTemplatesResponse> listAlertRuleTemplatesAsyncInvoker(
        ListAlertRuleTemplatesRequest request) {
        return new AsyncInvoker<>(request, SaMeta.listAlertRuleTemplates, hcClient);
    }

    /**
     * 列出告警规则（仅支持华东-上海一使用）
     *
     * List alert rules
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRulesRequest 请求对象
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
     * @param request ListAlertRulesRequest 请求对象
     * @return AsyncInvoker<ListAlertRulesRequest, ListAlertRulesResponse>
     */
    public AsyncInvoker<ListAlertRulesRequest, ListAlertRulesResponse> listAlertRulesAsyncInvoker(
        ListAlertRulesRequest request) {
        return new AsyncInvoker<>(request, SaMeta.listAlertRules, hcClient);
    }

    /**
     * 查看告警规则（仅支持华东-上海一使用）
     *
     * Get alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlertRuleRequest 请求对象
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
     * @param request ShowAlertRuleRequest 请求对象
     * @return AsyncInvoker<ShowAlertRuleRequest, ShowAlertRuleResponse>
     */
    public AsyncInvoker<ShowAlertRuleRequest, ShowAlertRuleResponse> showAlertRuleAsyncInvoker(
        ShowAlertRuleRequest request) {
        return new AsyncInvoker<>(request, SaMeta.showAlertRule, hcClient);
    }

    /**
     * 查看告警规则模板（仅支持华东-上海一使用）
     *
     * List alert rule templates
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlertRuleTemplateRequest 请求对象
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
     * @param request ShowAlertRuleTemplateRequest 请求对象
     * @return AsyncInvoker<ShowAlertRuleTemplateRequest, ShowAlertRuleTemplateResponse>
     */
    public AsyncInvoker<ShowAlertRuleTemplateRequest, ShowAlertRuleTemplateResponse> showAlertRuleTemplateAsyncInvoker(
        ShowAlertRuleTemplateRequest request) {
        return new AsyncInvoker<>(request, SaMeta.showAlertRuleTemplate, hcClient);
    }

    /**
     * 更新告警规则（仅支持华东-上海一使用）
     *
     * Update alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlertRuleRequest 请求对象
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
     * @param request UpdateAlertRuleRequest 请求对象
     * @return AsyncInvoker<UpdateAlertRuleRequest, UpdateAlertRuleResponse>
     */
    public AsyncInvoker<UpdateAlertRuleRequest, UpdateAlertRuleResponse> updateAlertRuleAsyncInvoker(
        UpdateAlertRuleRequest request) {
        return new AsyncInvoker<>(request, SaMeta.updateAlertRule, hcClient);
    }

    /**
     * 更新告警（仅支持华东-上海一使用）
     *
     * 编辑告警，根据实际修改的属性更新，未修改的列不更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAlertRequest 请求对象
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
     * @param request ChangeAlertRequest 请求对象
     * @return AsyncInvoker<ChangeAlertRequest, ChangeAlertResponse>
     */
    public AsyncInvoker<ChangeAlertRequest, ChangeAlertResponse> changeAlertAsyncInvoker(ChangeAlertRequest request) {
        return new AsyncInvoker<>(request, SaMeta.changeAlert, hcClient);
    }

    /**
     * 创建告警（仅支持华东-上海一使用）
     *
     * 创建告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlertRequest 请求对象
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
     * @param request CreateAlertRequest 请求对象
     * @return AsyncInvoker<CreateAlertRequest, CreateAlertResponse>
     */
    public AsyncInvoker<CreateAlertRequest, CreateAlertResponse> createAlertAsyncInvoker(CreateAlertRequest request) {
        return new AsyncInvoker<>(request, SaMeta.createAlert, hcClient);
    }

    /**
     * 告警转事件（仅支持华东-上海一使用）
     *
     * 告警转事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBatchOrderAlertsRequest 请求对象
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
     * @param request CreateBatchOrderAlertsRequest 请求对象
     * @return AsyncInvoker<CreateBatchOrderAlertsRequest, CreateBatchOrderAlertsResponse>
     */
    public AsyncInvoker<CreateBatchOrderAlertsRequest, CreateBatchOrderAlertsResponse> createBatchOrderAlertsAsyncInvoker(
        CreateBatchOrderAlertsRequest request) {
        return new AsyncInvoker<>(request, SaMeta.createBatchOrderAlerts, hcClient);
    }

    /**
     * 删除告警（仅支持华东-上海一使用）
     *
     * 删除告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlertRequest 请求对象
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
     * @param request DeleteAlertRequest 请求对象
     * @return AsyncInvoker<DeleteAlertRequest, DeleteAlertResponse>
     */
    public AsyncInvoker<DeleteAlertRequest, DeleteAlertResponse> deleteAlertAsyncInvoker(DeleteAlertRequest request) {
        return new AsyncInvoker<>(request, SaMeta.deleteAlert, hcClient);
    }

    /**
     * 搜索告警列表（仅支持华东-上海一使用）
     *
     * 搜索告警列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertsRequest 请求对象
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
     * @param request ListAlertsRequest 请求对象
     * @return AsyncInvoker<ListAlertsRequest, ListAlertsResponse>
     */
    public AsyncInvoker<ListAlertsRequest, ListAlertsResponse> listAlertsAsyncInvoker(ListAlertsRequest request) {
        return new AsyncInvoker<>(request, SaMeta.listAlerts, hcClient);
    }

    /**
     * 获取告警详情（仅支持华东-上海一使用）
     *
     * 获取告警详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlertRequest 请求对象
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
     * @param request ShowAlertRequest 请求对象
     * @return AsyncInvoker<ShowAlertRequest, ShowAlertResponse>
     */
    public AsyncInvoker<ShowAlertRequest, ShowAlertResponse> showAlertAsyncInvoker(ShowAlertRequest request) {
        return new AsyncInvoker<>(request, SaMeta.showAlert, hcClient);
    }

    /**
     * 更新事件（仅支持华东-上海一使用）
     *
     * 编辑事件，根据实际修改的属性更新，未修改的列不更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeIncidentRequest 请求对象
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
     * @param request ChangeIncidentRequest 请求对象
     * @return AsyncInvoker<ChangeIncidentRequest, ChangeIncidentResponse>
     */
    public AsyncInvoker<ChangeIncidentRequest, ChangeIncidentResponse> changeIncidentAsyncInvoker(
        ChangeIncidentRequest request) {
        return new AsyncInvoker<>(request, SaMeta.changeIncident, hcClient);
    }

    /**
     * 创建事件（仅支持华东-上海一使用）
     *
     * 创建事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIncidentRequest 请求对象
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
     * @param request CreateIncidentRequest 请求对象
     * @return AsyncInvoker<CreateIncidentRequest, CreateIncidentResponse>
     */
    public AsyncInvoker<CreateIncidentRequest, CreateIncidentResponse> createIncidentAsyncInvoker(
        CreateIncidentRequest request) {
        return new AsyncInvoker<>(request, SaMeta.createIncident, hcClient);
    }

    /**
     * 创建事件（仅支持华东-上海一使用）
     *
     * 创建事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIncidentRequest 请求对象
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
     * @param request DeleteIncidentRequest 请求对象
     * @return AsyncInvoker<DeleteIncidentRequest, DeleteIncidentResponse>
     */
    public AsyncInvoker<DeleteIncidentRequest, DeleteIncidentResponse> deleteIncidentAsyncInvoker(
        DeleteIncidentRequest request) {
        return new AsyncInvoker<>(request, SaMeta.deleteIncident, hcClient);
    }

    /**
     * 获取事件的类型列表（仅支持华东-上海一使用）
     *
     * 获取事件的类型列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIncidentTypesRequest 请求对象
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
     * @param request ListIncidentTypesRequest 请求对象
     * @return AsyncInvoker<ListIncidentTypesRequest, ListIncidentTypesResponse>
     */
    public AsyncInvoker<ListIncidentTypesRequest, ListIncidentTypesResponse> listIncidentTypesAsyncInvoker(
        ListIncidentTypesRequest request) {
        return new AsyncInvoker<>(request, SaMeta.listIncidentTypes, hcClient);
    }

    /**
     * 搜索事件列表（仅支持华东-上海一使用）
     *
     * 搜索事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIncidentsRequest 请求对象
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
     * @param request ListIncidentsRequest 请求对象
     * @return AsyncInvoker<ListIncidentsRequest, ListIncidentsResponse>
     */
    public AsyncInvoker<ListIncidentsRequest, ListIncidentsResponse> listIncidentsAsyncInvoker(
        ListIncidentsRequest request) {
        return new AsyncInvoker<>(request, SaMeta.listIncidents, hcClient);
    }

    /**
     * 获取事件详情（仅支持华东-上海一使用）
     *
     * 获取事件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIncidentRequest 请求对象
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
     * @param request ShowIncidentRequest 请求对象
     * @return AsyncInvoker<ShowIncidentRequest, ShowIncidentResponse>
     */
    public AsyncInvoker<ShowIncidentRequest, ShowIncidentResponse> showIncidentAsyncInvoker(
        ShowIncidentRequest request) {
        return new AsyncInvoker<>(request, SaMeta.showIncident, hcClient);
    }

    /**
     * 创建指标
     *
     * 创建指标（仅支持华东-上海一使用）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIndicatorRequest 请求对象
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
     * @param request CreateIndicatorRequest 请求对象
     * @return AsyncInvoker<CreateIndicatorRequest, CreateIndicatorResponse>
     */
    public AsyncInvoker<CreateIndicatorRequest, CreateIndicatorResponse> createIndicatorAsyncInvoker(
        CreateIndicatorRequest request) {
        return new AsyncInvoker<>(request, SaMeta.createIndicator, hcClient);
    }

    /**
     * 删除指标
     *
     * 删除指标（仅支持华东-上海一使用）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIndicatorRequest 请求对象
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
     * @param request DeleteIndicatorRequest 请求对象
     * @return AsyncInvoker<DeleteIndicatorRequest, DeleteIndicatorResponse>
     */
    public AsyncInvoker<DeleteIndicatorRequest, DeleteIndicatorResponse> deleteIndicatorAsyncInvoker(
        DeleteIndicatorRequest request) {
        return new AsyncInvoker<>(request, SaMeta.deleteIndicator, hcClient);
    }

    /**
     * 查询指标列表（仅支持华东-上海一使用）
     *
     * List all indicators
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIndicatorsRequest 请求对象
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
     * @param request ListIndicatorsRequest 请求对象
     * @return AsyncInvoker<ListIndicatorsRequest, ListIndicatorsResponse>
     */
    public AsyncInvoker<ListIndicatorsRequest, ListIndicatorsResponse> listIndicatorsAsyncInvoker(
        ListIndicatorsRequest request) {
        return new AsyncInvoker<>(request, SaMeta.listIndicators, hcClient);
    }

    /**
     * 查询指标详情
     *
     * 查询指标详情（仅支持华东-上海一使用）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIndicatorDetailRequest 请求对象
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
     * @param request ShowIndicatorDetailRequest 请求对象
     * @return AsyncInvoker<ShowIndicatorDetailRequest, ShowIndicatorDetailResponse>
     */
    public AsyncInvoker<ShowIndicatorDetailRequest, ShowIndicatorDetailResponse> showIndicatorDetailAsyncInvoker(
        ShowIndicatorDetailRequest request) {
        return new AsyncInvoker<>(request, SaMeta.showIndicatorDetail, hcClient);
    }

    /**
     * 更新指标
     *
     * 更新指标（仅支持华东-上海一使用）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIndicatorRequest 请求对象
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
     * @param request UpdateIndicatorRequest 请求对象
     * @return AsyncInvoker<UpdateIndicatorRequest, UpdateIndicatorResponse>
     */
    public AsyncInvoker<UpdateIndicatorRequest, UpdateIndicatorResponse> updateIndicatorAsyncInvoker(
        UpdateIndicatorRequest request) {
        return new AsyncInvoker<>(request, SaMeta.updateIndicator, hcClient);
    }

    /**
     * 创建剧本（仅支持华东-上海一使用）
     *
     * Create playbook.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlaybookRequest 请求对象
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
     * @param request CreatePlaybookRequest 请求对象
     * @return AsyncInvoker<CreatePlaybookRequest, CreatePlaybookResponse>
     */
    public AsyncInvoker<CreatePlaybookRequest, CreatePlaybookResponse> createPlaybookAsyncInvoker(
        CreatePlaybookRequest request) {
        return new AsyncInvoker<>(request, SaMeta.createPlaybook, hcClient);
    }

    /**
     * 删除剧本（仅支持华东-上海一使用）
     *
     * Delete playbook.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePlaybookRequest 请求对象
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
     * @param request DeletePlaybookRequest 请求对象
     * @return AsyncInvoker<DeletePlaybookRequest, DeletePlaybookResponse>
     */
    public AsyncInvoker<DeletePlaybookRequest, DeletePlaybookResponse> deletePlaybookAsyncInvoker(
        DeletePlaybookRequest request) {
        return new AsyncInvoker<>(request, SaMeta.deletePlaybook, hcClient);
    }

    /**
     * 查询剧本列表（仅支持华东-上海一使用）
     *
     * List all playbooks.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybooksRequest 请求对象
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
     * @param request ListPlaybooksRequest 请求对象
     * @return AsyncInvoker<ListPlaybooksRequest, ListPlaybooksResponse>
     */
    public AsyncInvoker<ListPlaybooksRequest, ListPlaybooksResponse> listPlaybooksAsyncInvoker(
        ListPlaybooksRequest request) {
        return new AsyncInvoker<>(request, SaMeta.listPlaybooks, hcClient);
    }

    /**
     * 查询剧本详情（仅支持华东-上海一使用）
     *
     * Show playbook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookRequest 请求对象
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
     * @param request ShowPlaybookRequest 请求对象
     * @return AsyncInvoker<ShowPlaybookRequest, ShowPlaybookResponse>
     */
    public AsyncInvoker<ShowPlaybookRequest, ShowPlaybookResponse> showPlaybookAsyncInvoker(
        ShowPlaybookRequest request) {
        return new AsyncInvoker<>(request, SaMeta.showPlaybook, hcClient);
    }

    /**
     * 剧本运行监控（仅支持华东-上海一使用）
     *
     * 剧本运行监控
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookMonitorsRequest 请求对象
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
     * @param request ShowPlaybookMonitorsRequest 请求对象
     * @return AsyncInvoker<ShowPlaybookMonitorsRequest, ShowPlaybookMonitorsResponse>
     */
    public AsyncInvoker<ShowPlaybookMonitorsRequest, ShowPlaybookMonitorsResponse> showPlaybookMonitorsAsyncInvoker(
        ShowPlaybookMonitorsRequest request) {
        return new AsyncInvoker<>(request, SaMeta.showPlaybookMonitors, hcClient);
    }

    /**
     * 剧本数据统计（仅支持华东-上海一使用）
     *
     * 剧本统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookStatisticsRequest 请求对象
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
     * @param request ShowPlaybookStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowPlaybookStatisticsRequest, ShowPlaybookStatisticsResponse>
     */
    public AsyncInvoker<ShowPlaybookStatisticsRequest, ShowPlaybookStatisticsResponse> showPlaybookStatisticsAsyncInvoker(
        ShowPlaybookStatisticsRequest request) {
        return new AsyncInvoker<>(request, SaMeta.showPlaybookStatistics, hcClient);
    }

    /**
     * 修改剧本（仅支持华东-上海一使用）
     *
     * Update playbook.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePlaybookRequest 请求对象
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
     * @param request UpdatePlaybookRequest 请求对象
     * @return AsyncInvoker<UpdatePlaybookRequest, UpdatePlaybookResponse>
     */
    public AsyncInvoker<UpdatePlaybookRequest, UpdatePlaybookResponse> updatePlaybookAsyncInvoker(
        UpdatePlaybookRequest request) {
        return new AsyncInvoker<>(request, SaMeta.updatePlaybook, hcClient);
    }

    /**
     * 创建剧本动作（仅支持华东-上海一使用）
     *
     * Create action.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlaybookActionRequest 请求对象
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
     * @param request CreatePlaybookActionRequest 请求对象
     * @return AsyncInvoker<CreatePlaybookActionRequest, CreatePlaybookActionResponse>
     */
    public AsyncInvoker<CreatePlaybookActionRequest, CreatePlaybookActionResponse> createPlaybookActionAsyncInvoker(
        CreatePlaybookActionRequest request) {
        return new AsyncInvoker<>(request, SaMeta.createPlaybookAction, hcClient);
    }

    /**
     * 删除剧本动作（仅支持华东-上海一使用）
     *
     * Delete action.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePlaybookActionRequest 请求对象
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
     * @param request DeletePlaybookActionRequest 请求对象
     * @return AsyncInvoker<DeletePlaybookActionRequest, DeletePlaybookActionResponse>
     */
    public AsyncInvoker<DeletePlaybookActionRequest, DeletePlaybookActionResponse> deletePlaybookActionAsyncInvoker(
        DeletePlaybookActionRequest request) {
        return new AsyncInvoker<>(request, SaMeta.deletePlaybookAction, hcClient);
    }

    /**
     * 查询剧本动作（仅支持华东-上海一使用）
     *
     * List all actions.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybookActionsRequest 请求对象
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
     * @param request ListPlaybookActionsRequest 请求对象
     * @return AsyncInvoker<ListPlaybookActionsRequest, ListPlaybookActionsResponse>
     */
    public AsyncInvoker<ListPlaybookActionsRequest, ListPlaybookActionsResponse> listPlaybookActionsAsyncInvoker(
        ListPlaybookActionsRequest request) {
        return new AsyncInvoker<>(request, SaMeta.listPlaybookActions, hcClient);
    }

    /**
     * 更新剧本动作（仅支持华东-上海一使用）
     *
     * Update action.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePlaybookActionRequest 请求对象
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
     * @param request UpdatePlaybookActionRequest 请求对象
     * @return AsyncInvoker<UpdatePlaybookActionRequest, UpdatePlaybookActionResponse>
     */
    public AsyncInvoker<UpdatePlaybookActionRequest, UpdatePlaybookActionResponse> updatePlaybookActionAsyncInvoker(
        UpdatePlaybookActionRequest request) {
        return new AsyncInvoker<>(request, SaMeta.updatePlaybookAction, hcClient);
    }

    /**
     * 审核剧本（仅支持华东-上海一使用）
     *
     * Create playbook approve.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlaybookApproveRequest 请求对象
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
     * @param request CreatePlaybookApproveRequest 请求对象
     * @return AsyncInvoker<CreatePlaybookApproveRequest, CreatePlaybookApproveResponse>
     */
    public AsyncInvoker<CreatePlaybookApproveRequest, CreatePlaybookApproveResponse> createPlaybookApproveAsyncInvoker(
        CreatePlaybookApproveRequest request) {
        return new AsyncInvoker<>(request, SaMeta.createPlaybookApprove, hcClient);
    }

    /**
     * 查询剧本审核结果（仅支持华东-上海一使用）
     *
     * List approves.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybookApprovesRequest 请求对象
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
     * @param request ListPlaybookApprovesRequest 请求对象
     * @return AsyncInvoker<ListPlaybookApprovesRequest, ListPlaybookApprovesResponse>
     */
    public AsyncInvoker<ListPlaybookApprovesRequest, ListPlaybookApprovesResponse> listPlaybookApprovesAsyncInvoker(
        ListPlaybookApprovesRequest request) {
        return new AsyncInvoker<>(request, SaMeta.listPlaybookApproves, hcClient);
    }

    /**
     * 操作剧本实例（仅支持华东-上海一使用）
     *
     * Operation Playbook Instance.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangePlaybookInstanceRequest 请求对象
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
     * @param request ChangePlaybookInstanceRequest 请求对象
     * @return AsyncInvoker<ChangePlaybookInstanceRequest, ChangePlaybookInstanceResponse>
     */
    public AsyncInvoker<ChangePlaybookInstanceRequest, ChangePlaybookInstanceResponse> changePlaybookInstanceAsyncInvoker(
        ChangePlaybookInstanceRequest request) {
        return new AsyncInvoker<>(request, SaMeta.changePlaybookInstance, hcClient);
    }

    /**
     * 查询剧本实例审计日志（仅支持华东-上海一使用）
     *
     * List audit logs.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybookAuditLogsRequest 请求对象
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
     * @param request ListPlaybookAuditLogsRequest 请求对象
     * @return AsyncInvoker<ListPlaybookAuditLogsRequest, ListPlaybookAuditLogsResponse>
     */
    public AsyncInvoker<ListPlaybookAuditLogsRequest, ListPlaybookAuditLogsResponse> listPlaybookAuditLogsAsyncInvoker(
        ListPlaybookAuditLogsRequest request) {
        return new AsyncInvoker<>(request, SaMeta.listPlaybookAuditLogs, hcClient);
    }

    /**
     * 查询剧本实例列表（仅支持华东-上海一使用）
     *
     * List playbook instances
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybookInstancesRequest 请求对象
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
     * @param request ListPlaybookInstancesRequest 请求对象
     * @return AsyncInvoker<ListPlaybookInstancesRequest, ListPlaybookInstancesResponse>
     */
    public AsyncInvoker<ListPlaybookInstancesRequest, ListPlaybookInstancesResponse> listPlaybookInstancesAsyncInvoker(
        ListPlaybookInstancesRequest request) {
        return new AsyncInvoker<>(request, SaMeta.listPlaybookInstances, hcClient);
    }

    /**
     * 查询剧本实例详情（仅支持华东-上海一使用）
     *
     * Show playbook instance
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookInstanceRequest 请求对象
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
     * @param request ShowPlaybookInstanceRequest 请求对象
     * @return AsyncInvoker<ShowPlaybookInstanceRequest, ShowPlaybookInstanceResponse>
     */
    public AsyncInvoker<ShowPlaybookInstanceRequest, ShowPlaybookInstanceResponse> showPlaybookInstanceAsyncInvoker(
        ShowPlaybookInstanceRequest request) {
        return new AsyncInvoker<>(request, SaMeta.showPlaybookInstance, hcClient);
    }

    /**
     * 查询剧本拓扑关系（仅支持华东-上海一使用）
     *
     * Show playbook Topology
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookTopologyRequest 请求对象
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
     * @param request ShowPlaybookTopologyRequest 请求对象
     * @return AsyncInvoker<ShowPlaybookTopologyRequest, ShowPlaybookTopologyResponse>
     */
    public AsyncInvoker<ShowPlaybookTopologyRequest, ShowPlaybookTopologyResponse> showPlaybookTopologyAsyncInvoker(
        ShowPlaybookTopologyRequest request) {
        return new AsyncInvoker<>(request, SaMeta.showPlaybookTopology, hcClient);
    }

    /**
     * 创建剧本规则（仅支持华东-上海一使用）
     *
     * Create rule.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlaybookRuleRequest 请求对象
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
     * @param request CreatePlaybookRuleRequest 请求对象
     * @return AsyncInvoker<CreatePlaybookRuleRequest, CreatePlaybookRuleResponse>
     */
    public AsyncInvoker<CreatePlaybookRuleRequest, CreatePlaybookRuleResponse> createPlaybookRuleAsyncInvoker(
        CreatePlaybookRuleRequest request) {
        return new AsyncInvoker<>(request, SaMeta.createPlaybookRule, hcClient);
    }

    /**
     * 删除剧本规则（仅支持华东-上海一使用）
     *
     * Delete rule.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePlaybookRuleRequest 请求对象
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
     * @param request DeletePlaybookRuleRequest 请求对象
     * @return AsyncInvoker<DeletePlaybookRuleRequest, DeletePlaybookRuleResponse>
     */
    public AsyncInvoker<DeletePlaybookRuleRequest, DeletePlaybookRuleResponse> deletePlaybookRuleAsyncInvoker(
        DeletePlaybookRuleRequest request) {
        return new AsyncInvoker<>(request, SaMeta.deletePlaybookRule, hcClient);
    }

    /**
     * 查询剧本规则详情（仅支持华东-上海一使用）
     *
     * Show rule formation.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookRuleRequest 请求对象
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
     * @param request ShowPlaybookRuleRequest 请求对象
     * @return AsyncInvoker<ShowPlaybookRuleRequest, ShowPlaybookRuleResponse>
     */
    public AsyncInvoker<ShowPlaybookRuleRequest, ShowPlaybookRuleResponse> showPlaybookRuleAsyncInvoker(
        ShowPlaybookRuleRequest request) {
        return new AsyncInvoker<>(request, SaMeta.showPlaybookRule, hcClient);
    }

    /**
     * 更新剧本规则（仅支持华东-上海一使用）
     *
     * Update rule.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePlaybookRuleRequest 请求对象
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
     * @param request UpdatePlaybookRuleRequest 请求对象
     * @return AsyncInvoker<UpdatePlaybookRuleRequest, UpdatePlaybookRuleResponse>
     */
    public AsyncInvoker<UpdatePlaybookRuleRequest, UpdatePlaybookRuleResponse> updatePlaybookRuleAsyncInvoker(
        UpdatePlaybookRuleRequest request) {
        return new AsyncInvoker<>(request, SaMeta.updatePlaybookRule, hcClient);
    }

    /**
     * 克隆剧本及版本（仅支持华东-上海一使用）
     *
     * Copy Playbook and version to a new one
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyPlaybookVersionRequest 请求对象
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
     * @param request CopyPlaybookVersionRequest 请求对象
     * @return AsyncInvoker<CopyPlaybookVersionRequest, CopyPlaybookVersionResponse>
     */
    public AsyncInvoker<CopyPlaybookVersionRequest, CopyPlaybookVersionResponse> copyPlaybookVersionAsyncInvoker(
        CopyPlaybookVersionRequest request) {
        return new AsyncInvoker<>(request, SaMeta.copyPlaybookVersion, hcClient);
    }

    /**
     * 创建剧本版本（仅支持华东-上海一使用）
     *
     * Create playbook version.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlaybookVersionRequest 请求对象
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
     * @param request CreatePlaybookVersionRequest 请求对象
     * @return AsyncInvoker<CreatePlaybookVersionRequest, CreatePlaybookVersionResponse>
     */
    public AsyncInvoker<CreatePlaybookVersionRequest, CreatePlaybookVersionResponse> createPlaybookVersionAsyncInvoker(
        CreatePlaybookVersionRequest request) {
        return new AsyncInvoker<>(request, SaMeta.createPlaybookVersion, hcClient);
    }

    /**
     * 删除剧本版本（仅支持华东-上海一使用）
     *
     * Delete playbook version.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePlaybookVersionRequest 请求对象
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
     * @param request DeletePlaybookVersionRequest 请求对象
     * @return AsyncInvoker<DeletePlaybookVersionRequest, DeletePlaybookVersionResponse>
     */
    public AsyncInvoker<DeletePlaybookVersionRequest, DeletePlaybookVersionResponse> deletePlaybookVersionAsyncInvoker(
        DeletePlaybookVersionRequest request) {
        return new AsyncInvoker<>(request, SaMeta.deletePlaybookVersion, hcClient);
    }

    /**
     * 查询剧本版本列表（仅支持华东-上海一使用）
     *
     * List all versions of playbook.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybookVersionsRequest 请求对象
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
     * @param request ListPlaybookVersionsRequest 请求对象
     * @return AsyncInvoker<ListPlaybookVersionsRequest, ListPlaybookVersionsResponse>
     */
    public AsyncInvoker<ListPlaybookVersionsRequest, ListPlaybookVersionsResponse> listPlaybookVersionsAsyncInvoker(
        ListPlaybookVersionsRequest request) {
        return new AsyncInvoker<>(request, SaMeta.listPlaybookVersions, hcClient);
    }

    /**
     * 查询剧本版本详情（仅支持华东-上海一使用）
     *
     * Show playbook version version
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookVersionRequest 请求对象
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
     * @param request ShowPlaybookVersionRequest 请求对象
     * @return AsyncInvoker<ShowPlaybookVersionRequest, ShowPlaybookVersionResponse>
     */
    public AsyncInvoker<ShowPlaybookVersionRequest, ShowPlaybookVersionResponse> showPlaybookVersionAsyncInvoker(
        ShowPlaybookVersionRequest request) {
        return new AsyncInvoker<>(request, SaMeta.showPlaybookVersion, hcClient);
    }

    /**
     * 更新剧本版本（仅支持华东-上海一使用）
     *
     * Update playbook version.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePlaybookVersionRequest 请求对象
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
     * @param request UpdatePlaybookVersionRequest 请求对象
     * @return AsyncInvoker<UpdatePlaybookVersionRequest, UpdatePlaybookVersionResponse>
     */
    public AsyncInvoker<UpdatePlaybookVersionRequest, UpdatePlaybookVersionResponse> updatePlaybookVersionAsyncInvoker(
        UpdatePlaybookVersionRequest request) {
        return new AsyncInvoker<>(request, SaMeta.updatePlaybookVersion, hcClient);
    }

    /**
     * 创建Dataobject关系
     *
     * Create Dataobject Relation
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataobjectRelationRequest 请求对象
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
     * @param request CreateDataobjectRelationRequest 请求对象
     * @return AsyncInvoker<CreateDataobjectRelationRequest, CreateDataobjectRelationResponse>
     */
    public AsyncInvoker<CreateDataobjectRelationRequest, CreateDataobjectRelationResponse> createDataobjectRelationAsyncInvoker(
        CreateDataobjectRelationRequest request) {
        return new AsyncInvoker<>(request, SaMeta.createDataobjectRelation, hcClient);
    }

    /**
     * 删除Dataobject关系
     *
     * Delete Dataobject Relation
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDataobjectRelationRequest 请求对象
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
     * @param request DeleteDataobjectRelationRequest 请求对象
     * @return AsyncInvoker<DeleteDataobjectRelationRequest, DeleteDataobjectRelationResponse>
     */
    public AsyncInvoker<DeleteDataobjectRelationRequest, DeleteDataobjectRelationResponse> deleteDataobjectRelationAsyncInvoker(
        DeleteDataobjectRelationRequest request) {
        return new AsyncInvoker<>(request, SaMeta.deleteDataobjectRelation, hcClient);
    }

    /**
     * 查询Dataobject关系列表
     *
     * List Dataobject Relation
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataobjectRelationRequest 请求对象
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
     * @param request ListDataobjectRelationRequest 请求对象
     * @return AsyncInvoker<ListDataobjectRelationRequest, ListDataobjectRelationResponse>
     */
    public AsyncInvoker<ListDataobjectRelationRequest, ListDataobjectRelationResponse> listDataobjectRelationAsyncInvoker(
        ListDataobjectRelationRequest request) {
        return new AsyncInvoker<>(request, SaMeta.listDataobjectRelation, hcClient);
    }

}

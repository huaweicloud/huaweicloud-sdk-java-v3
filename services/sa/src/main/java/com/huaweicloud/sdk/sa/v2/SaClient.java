package com.huaweicloud.sdk.sa.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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

public class SaClient {

    protected HcClient hcClient;

    public SaClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SaClient> newBuilder() {
        ClientBuilder<SaClient> clientBuilder = new ClientBuilder<>(SaClient::new);
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
     * @return CreateAlertRuleResponse
     */
    public CreateAlertRuleResponse createAlertRule(CreateAlertRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.createAlertRule);
    }

    /**
     * 创建告警规则（仅支持华东-上海一使用）
     *
     * Create alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlertRuleRequest 请求对象
     * @return SyncInvoker<CreateAlertRuleRequest, CreateAlertRuleResponse>
     */
    public SyncInvoker<CreateAlertRuleRequest, CreateAlertRuleResponse> createAlertRuleInvoker(
        CreateAlertRuleRequest request) {
        return new SyncInvoker<>(request, SaMeta.createAlertRule, hcClient);
    }

    /**
     * 模拟告警规则（仅支持华东-上海一使用）
     *
     * Simulate alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlertRuleSimulationRequest 请求对象
     * @return CreateAlertRuleSimulationResponse
     */
    public CreateAlertRuleSimulationResponse createAlertRuleSimulation(CreateAlertRuleSimulationRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.createAlertRuleSimulation);
    }

    /**
     * 模拟告警规则（仅支持华东-上海一使用）
     *
     * Simulate alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlertRuleSimulationRequest 请求对象
     * @return SyncInvoker<CreateAlertRuleSimulationRequest, CreateAlertRuleSimulationResponse>
     */
    public SyncInvoker<CreateAlertRuleSimulationRequest, CreateAlertRuleSimulationResponse> createAlertRuleSimulationInvoker(
        CreateAlertRuleSimulationRequest request) {
        return new SyncInvoker<>(request, SaMeta.createAlertRuleSimulation, hcClient);
    }

    /**
     * 删除告警规则（仅支持华东-上海一使用）
     *
     * Delete alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlertRuleRequest 请求对象
     * @return DeleteAlertRuleResponse
     */
    public DeleteAlertRuleResponse deleteAlertRule(DeleteAlertRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.deleteAlertRule);
    }

    /**
     * 删除告警规则（仅支持华东-上海一使用）
     *
     * Delete alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlertRuleRequest 请求对象
     * @return SyncInvoker<DeleteAlertRuleRequest, DeleteAlertRuleResponse>
     */
    public SyncInvoker<DeleteAlertRuleRequest, DeleteAlertRuleResponse> deleteAlertRuleInvoker(
        DeleteAlertRuleRequest request) {
        return new SyncInvoker<>(request, SaMeta.deleteAlertRule, hcClient);
    }

    /**
     * 停用告警规则（仅支持华东-上海一使用）
     *
     * Disable alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableAlertRuleRequest 请求对象
     * @return DisableAlertRuleResponse
     */
    public DisableAlertRuleResponse disableAlertRule(DisableAlertRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.disableAlertRule);
    }

    /**
     * 停用告警规则（仅支持华东-上海一使用）
     *
     * Disable alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableAlertRuleRequest 请求对象
     * @return SyncInvoker<DisableAlertRuleRequest, DisableAlertRuleResponse>
     */
    public SyncInvoker<DisableAlertRuleRequest, DisableAlertRuleResponse> disableAlertRuleInvoker(
        DisableAlertRuleRequest request) {
        return new SyncInvoker<>(request, SaMeta.disableAlertRule, hcClient);
    }

    /**
     * 启用告警规则（仅支持华东-上海一使用）
     *
     * Enable alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableAlertRuleRequest 请求对象
     * @return EnableAlertRuleResponse
     */
    public EnableAlertRuleResponse enableAlertRule(EnableAlertRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.enableAlertRule);
    }

    /**
     * 启用告警规则（仅支持华东-上海一使用）
     *
     * Enable alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableAlertRuleRequest 请求对象
     * @return SyncInvoker<EnableAlertRuleRequest, EnableAlertRuleResponse>
     */
    public SyncInvoker<EnableAlertRuleRequest, EnableAlertRuleResponse> enableAlertRuleInvoker(
        EnableAlertRuleRequest request) {
        return new SyncInvoker<>(request, SaMeta.enableAlertRule, hcClient);
    }

    /**
     * 告警规则总览（仅支持华东-上海一使用）
     *
     * List alert rule metrics
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRuleMetricsRequest 请求对象
     * @return ListAlertRuleMetricsResponse
     */
    public ListAlertRuleMetricsResponse listAlertRuleMetrics(ListAlertRuleMetricsRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.listAlertRuleMetrics);
    }

    /**
     * 告警规则总览（仅支持华东-上海一使用）
     *
     * List alert rule metrics
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRuleMetricsRequest 请求对象
     * @return SyncInvoker<ListAlertRuleMetricsRequest, ListAlertRuleMetricsResponse>
     */
    public SyncInvoker<ListAlertRuleMetricsRequest, ListAlertRuleMetricsResponse> listAlertRuleMetricsInvoker(
        ListAlertRuleMetricsRequest request) {
        return new SyncInvoker<>(request, SaMeta.listAlertRuleMetrics, hcClient);
    }

    /**
     * 列出告警规则模板（仅支持华东-上海一使用）
     *
     * List alert rule templates
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRuleTemplatesRequest 请求对象
     * @return ListAlertRuleTemplatesResponse
     */
    public ListAlertRuleTemplatesResponse listAlertRuleTemplates(ListAlertRuleTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.listAlertRuleTemplates);
    }

    /**
     * 列出告警规则模板（仅支持华东-上海一使用）
     *
     * List alert rule templates
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRuleTemplatesRequest 请求对象
     * @return SyncInvoker<ListAlertRuleTemplatesRequest, ListAlertRuleTemplatesResponse>
     */
    public SyncInvoker<ListAlertRuleTemplatesRequest, ListAlertRuleTemplatesResponse> listAlertRuleTemplatesInvoker(
        ListAlertRuleTemplatesRequest request) {
        return new SyncInvoker<>(request, SaMeta.listAlertRuleTemplates, hcClient);
    }

    /**
     * 列出告警规则（仅支持华东-上海一使用）
     *
     * List alert rules
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRulesRequest 请求对象
     * @return ListAlertRulesResponse
     */
    public ListAlertRulesResponse listAlertRules(ListAlertRulesRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.listAlertRules);
    }

    /**
     * 列出告警规则（仅支持华东-上海一使用）
     *
     * List alert rules
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRulesRequest 请求对象
     * @return SyncInvoker<ListAlertRulesRequest, ListAlertRulesResponse>
     */
    public SyncInvoker<ListAlertRulesRequest, ListAlertRulesResponse> listAlertRulesInvoker(
        ListAlertRulesRequest request) {
        return new SyncInvoker<>(request, SaMeta.listAlertRules, hcClient);
    }

    /**
     * 查看告警规则（仅支持华东-上海一使用）
     *
     * Get alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlertRuleRequest 请求对象
     * @return ShowAlertRuleResponse
     */
    public ShowAlertRuleResponse showAlertRule(ShowAlertRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.showAlertRule);
    }

    /**
     * 查看告警规则（仅支持华东-上海一使用）
     *
     * Get alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlertRuleRequest 请求对象
     * @return SyncInvoker<ShowAlertRuleRequest, ShowAlertRuleResponse>
     */
    public SyncInvoker<ShowAlertRuleRequest, ShowAlertRuleResponse> showAlertRuleInvoker(ShowAlertRuleRequest request) {
        return new SyncInvoker<>(request, SaMeta.showAlertRule, hcClient);
    }

    /**
     * 查看告警规则模板（仅支持华东-上海一使用）
     *
     * List alert rule templates
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlertRuleTemplateRequest 请求对象
     * @return ShowAlertRuleTemplateResponse
     */
    public ShowAlertRuleTemplateResponse showAlertRuleTemplate(ShowAlertRuleTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.showAlertRuleTemplate);
    }

    /**
     * 查看告警规则模板（仅支持华东-上海一使用）
     *
     * List alert rule templates
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlertRuleTemplateRequest 请求对象
     * @return SyncInvoker<ShowAlertRuleTemplateRequest, ShowAlertRuleTemplateResponse>
     */
    public SyncInvoker<ShowAlertRuleTemplateRequest, ShowAlertRuleTemplateResponse> showAlertRuleTemplateInvoker(
        ShowAlertRuleTemplateRequest request) {
        return new SyncInvoker<>(request, SaMeta.showAlertRuleTemplate, hcClient);
    }

    /**
     * 更新告警规则（仅支持华东-上海一使用）
     *
     * Update alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlertRuleRequest 请求对象
     * @return UpdateAlertRuleResponse
     */
    public UpdateAlertRuleResponse updateAlertRule(UpdateAlertRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.updateAlertRule);
    }

    /**
     * 更新告警规则（仅支持华东-上海一使用）
     *
     * Update alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlertRuleRequest 请求对象
     * @return SyncInvoker<UpdateAlertRuleRequest, UpdateAlertRuleResponse>
     */
    public SyncInvoker<UpdateAlertRuleRequest, UpdateAlertRuleResponse> updateAlertRuleInvoker(
        UpdateAlertRuleRequest request) {
        return new SyncInvoker<>(request, SaMeta.updateAlertRule, hcClient);
    }

    /**
     * 更新告警（仅支持华东-上海一使用）
     *
     * 编辑告警，根据实际修改的属性更新，未修改的列不更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAlertRequest 请求对象
     * @return ChangeAlertResponse
     */
    public ChangeAlertResponse changeAlert(ChangeAlertRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.changeAlert);
    }

    /**
     * 更新告警（仅支持华东-上海一使用）
     *
     * 编辑告警，根据实际修改的属性更新，未修改的列不更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAlertRequest 请求对象
     * @return SyncInvoker<ChangeAlertRequest, ChangeAlertResponse>
     */
    public SyncInvoker<ChangeAlertRequest, ChangeAlertResponse> changeAlertInvoker(ChangeAlertRequest request) {
        return new SyncInvoker<>(request, SaMeta.changeAlert, hcClient);
    }

    /**
     * 创建告警（仅支持华东-上海一使用）
     *
     * 创建告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlertRequest 请求对象
     * @return CreateAlertResponse
     */
    public CreateAlertResponse createAlert(CreateAlertRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.createAlert);
    }

    /**
     * 创建告警（仅支持华东-上海一使用）
     *
     * 创建告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlertRequest 请求对象
     * @return SyncInvoker<CreateAlertRequest, CreateAlertResponse>
     */
    public SyncInvoker<CreateAlertRequest, CreateAlertResponse> createAlertInvoker(CreateAlertRequest request) {
        return new SyncInvoker<>(request, SaMeta.createAlert, hcClient);
    }

    /**
     * 告警转事件（仅支持华东-上海一使用）
     *
     * 告警转事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBatchOrderAlertsRequest 请求对象
     * @return CreateBatchOrderAlertsResponse
     */
    public CreateBatchOrderAlertsResponse createBatchOrderAlerts(CreateBatchOrderAlertsRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.createBatchOrderAlerts);
    }

    /**
     * 告警转事件（仅支持华东-上海一使用）
     *
     * 告警转事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBatchOrderAlertsRequest 请求对象
     * @return SyncInvoker<CreateBatchOrderAlertsRequest, CreateBatchOrderAlertsResponse>
     */
    public SyncInvoker<CreateBatchOrderAlertsRequest, CreateBatchOrderAlertsResponse> createBatchOrderAlertsInvoker(
        CreateBatchOrderAlertsRequest request) {
        return new SyncInvoker<>(request, SaMeta.createBatchOrderAlerts, hcClient);
    }

    /**
     * 删除告警（仅支持华东-上海一使用）
     *
     * 删除告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlertRequest 请求对象
     * @return DeleteAlertResponse
     */
    public DeleteAlertResponse deleteAlert(DeleteAlertRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.deleteAlert);
    }

    /**
     * 删除告警（仅支持华东-上海一使用）
     *
     * 删除告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlertRequest 请求对象
     * @return SyncInvoker<DeleteAlertRequest, DeleteAlertResponse>
     */
    public SyncInvoker<DeleteAlertRequest, DeleteAlertResponse> deleteAlertInvoker(DeleteAlertRequest request) {
        return new SyncInvoker<>(request, SaMeta.deleteAlert, hcClient);
    }

    /**
     * 搜索告警列表（仅支持华东-上海一使用）
     *
     * 搜索告警列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertsRequest 请求对象
     * @return ListAlertsResponse
     */
    public ListAlertsResponse listAlerts(ListAlertsRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.listAlerts);
    }

    /**
     * 搜索告警列表（仅支持华东-上海一使用）
     *
     * 搜索告警列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertsRequest 请求对象
     * @return SyncInvoker<ListAlertsRequest, ListAlertsResponse>
     */
    public SyncInvoker<ListAlertsRequest, ListAlertsResponse> listAlertsInvoker(ListAlertsRequest request) {
        return new SyncInvoker<>(request, SaMeta.listAlerts, hcClient);
    }

    /**
     * 获取告警详情（仅支持华东-上海一使用）
     *
     * 获取告警详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlertRequest 请求对象
     * @return ShowAlertResponse
     */
    public ShowAlertResponse showAlert(ShowAlertRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.showAlert);
    }

    /**
     * 获取告警详情（仅支持华东-上海一使用）
     *
     * 获取告警详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlertRequest 请求对象
     * @return SyncInvoker<ShowAlertRequest, ShowAlertResponse>
     */
    public SyncInvoker<ShowAlertRequest, ShowAlertResponse> showAlertInvoker(ShowAlertRequest request) {
        return new SyncInvoker<>(request, SaMeta.showAlert, hcClient);
    }

    /**
     * 更新事件（仅支持华东-上海一使用）
     *
     * 编辑事件，根据实际修改的属性更新，未修改的列不更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeIncidentRequest 请求对象
     * @return ChangeIncidentResponse
     */
    public ChangeIncidentResponse changeIncident(ChangeIncidentRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.changeIncident);
    }

    /**
     * 更新事件（仅支持华东-上海一使用）
     *
     * 编辑事件，根据实际修改的属性更新，未修改的列不更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeIncidentRequest 请求对象
     * @return SyncInvoker<ChangeIncidentRequest, ChangeIncidentResponse>
     */
    public SyncInvoker<ChangeIncidentRequest, ChangeIncidentResponse> changeIncidentInvoker(
        ChangeIncidentRequest request) {
        return new SyncInvoker<>(request, SaMeta.changeIncident, hcClient);
    }

    /**
     * 创建事件（仅支持华东-上海一使用）
     *
     * 创建事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIncidentRequest 请求对象
     * @return CreateIncidentResponse
     */
    public CreateIncidentResponse createIncident(CreateIncidentRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.createIncident);
    }

    /**
     * 创建事件（仅支持华东-上海一使用）
     *
     * 创建事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIncidentRequest 请求对象
     * @return SyncInvoker<CreateIncidentRequest, CreateIncidentResponse>
     */
    public SyncInvoker<CreateIncidentRequest, CreateIncidentResponse> createIncidentInvoker(
        CreateIncidentRequest request) {
        return new SyncInvoker<>(request, SaMeta.createIncident, hcClient);
    }

    /**
     * 创建事件（仅支持华东-上海一使用）
     *
     * 创建事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIncidentRequest 请求对象
     * @return DeleteIncidentResponse
     */
    public DeleteIncidentResponse deleteIncident(DeleteIncidentRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.deleteIncident);
    }

    /**
     * 创建事件（仅支持华东-上海一使用）
     *
     * 创建事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIncidentRequest 请求对象
     * @return SyncInvoker<DeleteIncidentRequest, DeleteIncidentResponse>
     */
    public SyncInvoker<DeleteIncidentRequest, DeleteIncidentResponse> deleteIncidentInvoker(
        DeleteIncidentRequest request) {
        return new SyncInvoker<>(request, SaMeta.deleteIncident, hcClient);
    }

    /**
     * 获取事件的类型列表（仅支持华东-上海一使用）
     *
     * 获取事件的类型列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIncidentTypesRequest 请求对象
     * @return ListIncidentTypesResponse
     */
    public ListIncidentTypesResponse listIncidentTypes(ListIncidentTypesRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.listIncidentTypes);
    }

    /**
     * 获取事件的类型列表（仅支持华东-上海一使用）
     *
     * 获取事件的类型列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIncidentTypesRequest 请求对象
     * @return SyncInvoker<ListIncidentTypesRequest, ListIncidentTypesResponse>
     */
    public SyncInvoker<ListIncidentTypesRequest, ListIncidentTypesResponse> listIncidentTypesInvoker(
        ListIncidentTypesRequest request) {
        return new SyncInvoker<>(request, SaMeta.listIncidentTypes, hcClient);
    }

    /**
     * 搜索事件列表（仅支持华东-上海一使用）
     *
     * 搜索事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIncidentsRequest 请求对象
     * @return ListIncidentsResponse
     */
    public ListIncidentsResponse listIncidents(ListIncidentsRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.listIncidents);
    }

    /**
     * 搜索事件列表（仅支持华东-上海一使用）
     *
     * 搜索事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIncidentsRequest 请求对象
     * @return SyncInvoker<ListIncidentsRequest, ListIncidentsResponse>
     */
    public SyncInvoker<ListIncidentsRequest, ListIncidentsResponse> listIncidentsInvoker(ListIncidentsRequest request) {
        return new SyncInvoker<>(request, SaMeta.listIncidents, hcClient);
    }

    /**
     * 获取事件详情（仅支持华东-上海一使用）
     *
     * 获取事件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIncidentRequest 请求对象
     * @return ShowIncidentResponse
     */
    public ShowIncidentResponse showIncident(ShowIncidentRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.showIncident);
    }

    /**
     * 获取事件详情（仅支持华东-上海一使用）
     *
     * 获取事件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIncidentRequest 请求对象
     * @return SyncInvoker<ShowIncidentRequest, ShowIncidentResponse>
     */
    public SyncInvoker<ShowIncidentRequest, ShowIncidentResponse> showIncidentInvoker(ShowIncidentRequest request) {
        return new SyncInvoker<>(request, SaMeta.showIncident, hcClient);
    }

    /**
     * 创建指标
     *
     * 创建指标（仅支持华东-上海一使用）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIndicatorRequest 请求对象
     * @return CreateIndicatorResponse
     */
    public CreateIndicatorResponse createIndicator(CreateIndicatorRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.createIndicator);
    }

    /**
     * 创建指标
     *
     * 创建指标（仅支持华东-上海一使用）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIndicatorRequest 请求对象
     * @return SyncInvoker<CreateIndicatorRequest, CreateIndicatorResponse>
     */
    public SyncInvoker<CreateIndicatorRequest, CreateIndicatorResponse> createIndicatorInvoker(
        CreateIndicatorRequest request) {
        return new SyncInvoker<>(request, SaMeta.createIndicator, hcClient);
    }

    /**
     * 删除指标
     *
     * 删除指标（仅支持华东-上海一使用）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIndicatorRequest 请求对象
     * @return DeleteIndicatorResponse
     */
    public DeleteIndicatorResponse deleteIndicator(DeleteIndicatorRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.deleteIndicator);
    }

    /**
     * 删除指标
     *
     * 删除指标（仅支持华东-上海一使用）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIndicatorRequest 请求对象
     * @return SyncInvoker<DeleteIndicatorRequest, DeleteIndicatorResponse>
     */
    public SyncInvoker<DeleteIndicatorRequest, DeleteIndicatorResponse> deleteIndicatorInvoker(
        DeleteIndicatorRequest request) {
        return new SyncInvoker<>(request, SaMeta.deleteIndicator, hcClient);
    }

    /**
     * 查询指标列表（仅支持华东-上海一使用）
     *
     * List all indicators
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIndicatorsRequest 请求对象
     * @return ListIndicatorsResponse
     */
    public ListIndicatorsResponse listIndicators(ListIndicatorsRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.listIndicators);
    }

    /**
     * 查询指标列表（仅支持华东-上海一使用）
     *
     * List all indicators
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIndicatorsRequest 请求对象
     * @return SyncInvoker<ListIndicatorsRequest, ListIndicatorsResponse>
     */
    public SyncInvoker<ListIndicatorsRequest, ListIndicatorsResponse> listIndicatorsInvoker(
        ListIndicatorsRequest request) {
        return new SyncInvoker<>(request, SaMeta.listIndicators, hcClient);
    }

    /**
     * 查询指标详情
     *
     * 查询指标详情（仅支持华东-上海一使用）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIndicatorDetailRequest 请求对象
     * @return ShowIndicatorDetailResponse
     */
    public ShowIndicatorDetailResponse showIndicatorDetail(ShowIndicatorDetailRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.showIndicatorDetail);
    }

    /**
     * 查询指标详情
     *
     * 查询指标详情（仅支持华东-上海一使用）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIndicatorDetailRequest 请求对象
     * @return SyncInvoker<ShowIndicatorDetailRequest, ShowIndicatorDetailResponse>
     */
    public SyncInvoker<ShowIndicatorDetailRequest, ShowIndicatorDetailResponse> showIndicatorDetailInvoker(
        ShowIndicatorDetailRequest request) {
        return new SyncInvoker<>(request, SaMeta.showIndicatorDetail, hcClient);
    }

    /**
     * 更新指标
     *
     * 更新指标（仅支持华东-上海一使用）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIndicatorRequest 请求对象
     * @return UpdateIndicatorResponse
     */
    public UpdateIndicatorResponse updateIndicator(UpdateIndicatorRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.updateIndicator);
    }

    /**
     * 更新指标
     *
     * 更新指标（仅支持华东-上海一使用）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIndicatorRequest 请求对象
     * @return SyncInvoker<UpdateIndicatorRequest, UpdateIndicatorResponse>
     */
    public SyncInvoker<UpdateIndicatorRequest, UpdateIndicatorResponse> updateIndicatorInvoker(
        UpdateIndicatorRequest request) {
        return new SyncInvoker<>(request, SaMeta.updateIndicator, hcClient);
    }

    /**
     * 创建剧本（仅支持华东-上海一使用）
     *
     * Create playbook.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlaybookRequest 请求对象
     * @return CreatePlaybookResponse
     */
    public CreatePlaybookResponse createPlaybook(CreatePlaybookRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.createPlaybook);
    }

    /**
     * 创建剧本（仅支持华东-上海一使用）
     *
     * Create playbook.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlaybookRequest 请求对象
     * @return SyncInvoker<CreatePlaybookRequest, CreatePlaybookResponse>
     */
    public SyncInvoker<CreatePlaybookRequest, CreatePlaybookResponse> createPlaybookInvoker(
        CreatePlaybookRequest request) {
        return new SyncInvoker<>(request, SaMeta.createPlaybook, hcClient);
    }

    /**
     * 删除剧本（仅支持华东-上海一使用）
     *
     * Delete playbook.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePlaybookRequest 请求对象
     * @return DeletePlaybookResponse
     */
    public DeletePlaybookResponse deletePlaybook(DeletePlaybookRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.deletePlaybook);
    }

    /**
     * 删除剧本（仅支持华东-上海一使用）
     *
     * Delete playbook.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePlaybookRequest 请求对象
     * @return SyncInvoker<DeletePlaybookRequest, DeletePlaybookResponse>
     */
    public SyncInvoker<DeletePlaybookRequest, DeletePlaybookResponse> deletePlaybookInvoker(
        DeletePlaybookRequest request) {
        return new SyncInvoker<>(request, SaMeta.deletePlaybook, hcClient);
    }

    /**
     * 查询剧本列表（仅支持华东-上海一使用）
     *
     * List all playbooks.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybooksRequest 请求对象
     * @return ListPlaybooksResponse
     */
    public ListPlaybooksResponse listPlaybooks(ListPlaybooksRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.listPlaybooks);
    }

    /**
     * 查询剧本列表（仅支持华东-上海一使用）
     *
     * List all playbooks.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybooksRequest 请求对象
     * @return SyncInvoker<ListPlaybooksRequest, ListPlaybooksResponse>
     */
    public SyncInvoker<ListPlaybooksRequest, ListPlaybooksResponse> listPlaybooksInvoker(ListPlaybooksRequest request) {
        return new SyncInvoker<>(request, SaMeta.listPlaybooks, hcClient);
    }

    /**
     * 查询剧本详情（仅支持华东-上海一使用）
     *
     * Show playbook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookRequest 请求对象
     * @return ShowPlaybookResponse
     */
    public ShowPlaybookResponse showPlaybook(ShowPlaybookRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.showPlaybook);
    }

    /**
     * 查询剧本详情（仅支持华东-上海一使用）
     *
     * Show playbook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookRequest 请求对象
     * @return SyncInvoker<ShowPlaybookRequest, ShowPlaybookResponse>
     */
    public SyncInvoker<ShowPlaybookRequest, ShowPlaybookResponse> showPlaybookInvoker(ShowPlaybookRequest request) {
        return new SyncInvoker<>(request, SaMeta.showPlaybook, hcClient);
    }

    /**
     * 剧本运行监控（仅支持华东-上海一使用）
     *
     * 剧本运行监控
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookMonitorsRequest 请求对象
     * @return ShowPlaybookMonitorsResponse
     */
    public ShowPlaybookMonitorsResponse showPlaybookMonitors(ShowPlaybookMonitorsRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.showPlaybookMonitors);
    }

    /**
     * 剧本运行监控（仅支持华东-上海一使用）
     *
     * 剧本运行监控
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookMonitorsRequest 请求对象
     * @return SyncInvoker<ShowPlaybookMonitorsRequest, ShowPlaybookMonitorsResponse>
     */
    public SyncInvoker<ShowPlaybookMonitorsRequest, ShowPlaybookMonitorsResponse> showPlaybookMonitorsInvoker(
        ShowPlaybookMonitorsRequest request) {
        return new SyncInvoker<>(request, SaMeta.showPlaybookMonitors, hcClient);
    }

    /**
     * 剧本数据统计（仅支持华东-上海一使用）
     *
     * 剧本统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookStatisticsRequest 请求对象
     * @return ShowPlaybookStatisticsResponse
     */
    public ShowPlaybookStatisticsResponse showPlaybookStatistics(ShowPlaybookStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.showPlaybookStatistics);
    }

    /**
     * 剧本数据统计（仅支持华东-上海一使用）
     *
     * 剧本统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookStatisticsRequest 请求对象
     * @return SyncInvoker<ShowPlaybookStatisticsRequest, ShowPlaybookStatisticsResponse>
     */
    public SyncInvoker<ShowPlaybookStatisticsRequest, ShowPlaybookStatisticsResponse> showPlaybookStatisticsInvoker(
        ShowPlaybookStatisticsRequest request) {
        return new SyncInvoker<>(request, SaMeta.showPlaybookStatistics, hcClient);
    }

    /**
     * 修改剧本（仅支持华东-上海一使用）
     *
     * Update playbook.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePlaybookRequest 请求对象
     * @return UpdatePlaybookResponse
     */
    public UpdatePlaybookResponse updatePlaybook(UpdatePlaybookRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.updatePlaybook);
    }

    /**
     * 修改剧本（仅支持华东-上海一使用）
     *
     * Update playbook.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePlaybookRequest 请求对象
     * @return SyncInvoker<UpdatePlaybookRequest, UpdatePlaybookResponse>
     */
    public SyncInvoker<UpdatePlaybookRequest, UpdatePlaybookResponse> updatePlaybookInvoker(
        UpdatePlaybookRequest request) {
        return new SyncInvoker<>(request, SaMeta.updatePlaybook, hcClient);
    }

    /**
     * 创建剧本动作（仅支持华东-上海一使用）
     *
     * Create action.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlaybookActionRequest 请求对象
     * @return CreatePlaybookActionResponse
     */
    public CreatePlaybookActionResponse createPlaybookAction(CreatePlaybookActionRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.createPlaybookAction);
    }

    /**
     * 创建剧本动作（仅支持华东-上海一使用）
     *
     * Create action.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlaybookActionRequest 请求对象
     * @return SyncInvoker<CreatePlaybookActionRequest, CreatePlaybookActionResponse>
     */
    public SyncInvoker<CreatePlaybookActionRequest, CreatePlaybookActionResponse> createPlaybookActionInvoker(
        CreatePlaybookActionRequest request) {
        return new SyncInvoker<>(request, SaMeta.createPlaybookAction, hcClient);
    }

    /**
     * 删除剧本动作（仅支持华东-上海一使用）
     *
     * Delete action.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePlaybookActionRequest 请求对象
     * @return DeletePlaybookActionResponse
     */
    public DeletePlaybookActionResponse deletePlaybookAction(DeletePlaybookActionRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.deletePlaybookAction);
    }

    /**
     * 删除剧本动作（仅支持华东-上海一使用）
     *
     * Delete action.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePlaybookActionRequest 请求对象
     * @return SyncInvoker<DeletePlaybookActionRequest, DeletePlaybookActionResponse>
     */
    public SyncInvoker<DeletePlaybookActionRequest, DeletePlaybookActionResponse> deletePlaybookActionInvoker(
        DeletePlaybookActionRequest request) {
        return new SyncInvoker<>(request, SaMeta.deletePlaybookAction, hcClient);
    }

    /**
     * 查询剧本动作（仅支持华东-上海一使用）
     *
     * List all actions.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybookActionsRequest 请求对象
     * @return ListPlaybookActionsResponse
     */
    public ListPlaybookActionsResponse listPlaybookActions(ListPlaybookActionsRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.listPlaybookActions);
    }

    /**
     * 查询剧本动作（仅支持华东-上海一使用）
     *
     * List all actions.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybookActionsRequest 请求对象
     * @return SyncInvoker<ListPlaybookActionsRequest, ListPlaybookActionsResponse>
     */
    public SyncInvoker<ListPlaybookActionsRequest, ListPlaybookActionsResponse> listPlaybookActionsInvoker(
        ListPlaybookActionsRequest request) {
        return new SyncInvoker<>(request, SaMeta.listPlaybookActions, hcClient);
    }

    /**
     * 更新剧本动作（仅支持华东-上海一使用）
     *
     * Update action.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePlaybookActionRequest 请求对象
     * @return UpdatePlaybookActionResponse
     */
    public UpdatePlaybookActionResponse updatePlaybookAction(UpdatePlaybookActionRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.updatePlaybookAction);
    }

    /**
     * 更新剧本动作（仅支持华东-上海一使用）
     *
     * Update action.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePlaybookActionRequest 请求对象
     * @return SyncInvoker<UpdatePlaybookActionRequest, UpdatePlaybookActionResponse>
     */
    public SyncInvoker<UpdatePlaybookActionRequest, UpdatePlaybookActionResponse> updatePlaybookActionInvoker(
        UpdatePlaybookActionRequest request) {
        return new SyncInvoker<>(request, SaMeta.updatePlaybookAction, hcClient);
    }

    /**
     * 审核剧本（仅支持华东-上海一使用）
     *
     * Create playbook approve.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlaybookApproveRequest 请求对象
     * @return CreatePlaybookApproveResponse
     */
    public CreatePlaybookApproveResponse createPlaybookApprove(CreatePlaybookApproveRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.createPlaybookApprove);
    }

    /**
     * 审核剧本（仅支持华东-上海一使用）
     *
     * Create playbook approve.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlaybookApproveRequest 请求对象
     * @return SyncInvoker<CreatePlaybookApproveRequest, CreatePlaybookApproveResponse>
     */
    public SyncInvoker<CreatePlaybookApproveRequest, CreatePlaybookApproveResponse> createPlaybookApproveInvoker(
        CreatePlaybookApproveRequest request) {
        return new SyncInvoker<>(request, SaMeta.createPlaybookApprove, hcClient);
    }

    /**
     * 查询剧本审核结果（仅支持华东-上海一使用）
     *
     * List approves.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybookApprovesRequest 请求对象
     * @return ListPlaybookApprovesResponse
     */
    public ListPlaybookApprovesResponse listPlaybookApproves(ListPlaybookApprovesRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.listPlaybookApproves);
    }

    /**
     * 查询剧本审核结果（仅支持华东-上海一使用）
     *
     * List approves.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybookApprovesRequest 请求对象
     * @return SyncInvoker<ListPlaybookApprovesRequest, ListPlaybookApprovesResponse>
     */
    public SyncInvoker<ListPlaybookApprovesRequest, ListPlaybookApprovesResponse> listPlaybookApprovesInvoker(
        ListPlaybookApprovesRequest request) {
        return new SyncInvoker<>(request, SaMeta.listPlaybookApproves, hcClient);
    }

    /**
     * 操作剧本实例（仅支持华东-上海一使用）
     *
     * Operation Playbook Instance.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangePlaybookInstanceRequest 请求对象
     * @return ChangePlaybookInstanceResponse
     */
    public ChangePlaybookInstanceResponse changePlaybookInstance(ChangePlaybookInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.changePlaybookInstance);
    }

    /**
     * 操作剧本实例（仅支持华东-上海一使用）
     *
     * Operation Playbook Instance.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangePlaybookInstanceRequest 请求对象
     * @return SyncInvoker<ChangePlaybookInstanceRequest, ChangePlaybookInstanceResponse>
     */
    public SyncInvoker<ChangePlaybookInstanceRequest, ChangePlaybookInstanceResponse> changePlaybookInstanceInvoker(
        ChangePlaybookInstanceRequest request) {
        return new SyncInvoker<>(request, SaMeta.changePlaybookInstance, hcClient);
    }

    /**
     * 查询剧本实例审计日志（仅支持华东-上海一使用）
     *
     * List audit logs.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybookAuditLogsRequest 请求对象
     * @return ListPlaybookAuditLogsResponse
     */
    public ListPlaybookAuditLogsResponse listPlaybookAuditLogs(ListPlaybookAuditLogsRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.listPlaybookAuditLogs);
    }

    /**
     * 查询剧本实例审计日志（仅支持华东-上海一使用）
     *
     * List audit logs.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybookAuditLogsRequest 请求对象
     * @return SyncInvoker<ListPlaybookAuditLogsRequest, ListPlaybookAuditLogsResponse>
     */
    public SyncInvoker<ListPlaybookAuditLogsRequest, ListPlaybookAuditLogsResponse> listPlaybookAuditLogsInvoker(
        ListPlaybookAuditLogsRequest request) {
        return new SyncInvoker<>(request, SaMeta.listPlaybookAuditLogs, hcClient);
    }

    /**
     * 查询剧本实例列表（仅支持华东-上海一使用）
     *
     * List playbook instances
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybookInstancesRequest 请求对象
     * @return ListPlaybookInstancesResponse
     */
    public ListPlaybookInstancesResponse listPlaybookInstances(ListPlaybookInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.listPlaybookInstances);
    }

    /**
     * 查询剧本实例列表（仅支持华东-上海一使用）
     *
     * List playbook instances
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybookInstancesRequest 请求对象
     * @return SyncInvoker<ListPlaybookInstancesRequest, ListPlaybookInstancesResponse>
     */
    public SyncInvoker<ListPlaybookInstancesRequest, ListPlaybookInstancesResponse> listPlaybookInstancesInvoker(
        ListPlaybookInstancesRequest request) {
        return new SyncInvoker<>(request, SaMeta.listPlaybookInstances, hcClient);
    }

    /**
     * 查询剧本实例详情（仅支持华东-上海一使用）
     *
     * Show playbook instance
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookInstanceRequest 请求对象
     * @return ShowPlaybookInstanceResponse
     */
    public ShowPlaybookInstanceResponse showPlaybookInstance(ShowPlaybookInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.showPlaybookInstance);
    }

    /**
     * 查询剧本实例详情（仅支持华东-上海一使用）
     *
     * Show playbook instance
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookInstanceRequest 请求对象
     * @return SyncInvoker<ShowPlaybookInstanceRequest, ShowPlaybookInstanceResponse>
     */
    public SyncInvoker<ShowPlaybookInstanceRequest, ShowPlaybookInstanceResponse> showPlaybookInstanceInvoker(
        ShowPlaybookInstanceRequest request) {
        return new SyncInvoker<>(request, SaMeta.showPlaybookInstance, hcClient);
    }

    /**
     * 查询剧本拓扑关系（仅支持华东-上海一使用）
     *
     * Show playbook Topology
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookTopologyRequest 请求对象
     * @return ShowPlaybookTopologyResponse
     */
    public ShowPlaybookTopologyResponse showPlaybookTopology(ShowPlaybookTopologyRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.showPlaybookTopology);
    }

    /**
     * 查询剧本拓扑关系（仅支持华东-上海一使用）
     *
     * Show playbook Topology
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookTopologyRequest 请求对象
     * @return SyncInvoker<ShowPlaybookTopologyRequest, ShowPlaybookTopologyResponse>
     */
    public SyncInvoker<ShowPlaybookTopologyRequest, ShowPlaybookTopologyResponse> showPlaybookTopologyInvoker(
        ShowPlaybookTopologyRequest request) {
        return new SyncInvoker<>(request, SaMeta.showPlaybookTopology, hcClient);
    }

    /**
     * 创建剧本规则（仅支持华东-上海一使用）
     *
     * Create rule.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlaybookRuleRequest 请求对象
     * @return CreatePlaybookRuleResponse
     */
    public CreatePlaybookRuleResponse createPlaybookRule(CreatePlaybookRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.createPlaybookRule);
    }

    /**
     * 创建剧本规则（仅支持华东-上海一使用）
     *
     * Create rule.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlaybookRuleRequest 请求对象
     * @return SyncInvoker<CreatePlaybookRuleRequest, CreatePlaybookRuleResponse>
     */
    public SyncInvoker<CreatePlaybookRuleRequest, CreatePlaybookRuleResponse> createPlaybookRuleInvoker(
        CreatePlaybookRuleRequest request) {
        return new SyncInvoker<>(request, SaMeta.createPlaybookRule, hcClient);
    }

    /**
     * 删除剧本规则（仅支持华东-上海一使用）
     *
     * Delete rule.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePlaybookRuleRequest 请求对象
     * @return DeletePlaybookRuleResponse
     */
    public DeletePlaybookRuleResponse deletePlaybookRule(DeletePlaybookRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.deletePlaybookRule);
    }

    /**
     * 删除剧本规则（仅支持华东-上海一使用）
     *
     * Delete rule.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePlaybookRuleRequest 请求对象
     * @return SyncInvoker<DeletePlaybookRuleRequest, DeletePlaybookRuleResponse>
     */
    public SyncInvoker<DeletePlaybookRuleRequest, DeletePlaybookRuleResponse> deletePlaybookRuleInvoker(
        DeletePlaybookRuleRequest request) {
        return new SyncInvoker<>(request, SaMeta.deletePlaybookRule, hcClient);
    }

    /**
     * 查询剧本规则详情（仅支持华东-上海一使用）
     *
     * Show rule formation.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookRuleRequest 请求对象
     * @return ShowPlaybookRuleResponse
     */
    public ShowPlaybookRuleResponse showPlaybookRule(ShowPlaybookRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.showPlaybookRule);
    }

    /**
     * 查询剧本规则详情（仅支持华东-上海一使用）
     *
     * Show rule formation.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookRuleRequest 请求对象
     * @return SyncInvoker<ShowPlaybookRuleRequest, ShowPlaybookRuleResponse>
     */
    public SyncInvoker<ShowPlaybookRuleRequest, ShowPlaybookRuleResponse> showPlaybookRuleInvoker(
        ShowPlaybookRuleRequest request) {
        return new SyncInvoker<>(request, SaMeta.showPlaybookRule, hcClient);
    }

    /**
     * 更新剧本规则（仅支持华东-上海一使用）
     *
     * Update rule.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePlaybookRuleRequest 请求对象
     * @return UpdatePlaybookRuleResponse
     */
    public UpdatePlaybookRuleResponse updatePlaybookRule(UpdatePlaybookRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.updatePlaybookRule);
    }

    /**
     * 更新剧本规则（仅支持华东-上海一使用）
     *
     * Update rule.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePlaybookRuleRequest 请求对象
     * @return SyncInvoker<UpdatePlaybookRuleRequest, UpdatePlaybookRuleResponse>
     */
    public SyncInvoker<UpdatePlaybookRuleRequest, UpdatePlaybookRuleResponse> updatePlaybookRuleInvoker(
        UpdatePlaybookRuleRequest request) {
        return new SyncInvoker<>(request, SaMeta.updatePlaybookRule, hcClient);
    }

    /**
     * 克隆剧本及版本（仅支持华东-上海一使用）
     *
     * Copy Playbook and version to a new one
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyPlaybookVersionRequest 请求对象
     * @return CopyPlaybookVersionResponse
     */
    public CopyPlaybookVersionResponse copyPlaybookVersion(CopyPlaybookVersionRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.copyPlaybookVersion);
    }

    /**
     * 克隆剧本及版本（仅支持华东-上海一使用）
     *
     * Copy Playbook and version to a new one
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyPlaybookVersionRequest 请求对象
     * @return SyncInvoker<CopyPlaybookVersionRequest, CopyPlaybookVersionResponse>
     */
    public SyncInvoker<CopyPlaybookVersionRequest, CopyPlaybookVersionResponse> copyPlaybookVersionInvoker(
        CopyPlaybookVersionRequest request) {
        return new SyncInvoker<>(request, SaMeta.copyPlaybookVersion, hcClient);
    }

    /**
     * 创建剧本版本（仅支持华东-上海一使用）
     *
     * Create playbook version.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlaybookVersionRequest 请求对象
     * @return CreatePlaybookVersionResponse
     */
    public CreatePlaybookVersionResponse createPlaybookVersion(CreatePlaybookVersionRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.createPlaybookVersion);
    }

    /**
     * 创建剧本版本（仅支持华东-上海一使用）
     *
     * Create playbook version.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlaybookVersionRequest 请求对象
     * @return SyncInvoker<CreatePlaybookVersionRequest, CreatePlaybookVersionResponse>
     */
    public SyncInvoker<CreatePlaybookVersionRequest, CreatePlaybookVersionResponse> createPlaybookVersionInvoker(
        CreatePlaybookVersionRequest request) {
        return new SyncInvoker<>(request, SaMeta.createPlaybookVersion, hcClient);
    }

    /**
     * 删除剧本版本（仅支持华东-上海一使用）
     *
     * Delete playbook version.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePlaybookVersionRequest 请求对象
     * @return DeletePlaybookVersionResponse
     */
    public DeletePlaybookVersionResponse deletePlaybookVersion(DeletePlaybookVersionRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.deletePlaybookVersion);
    }

    /**
     * 删除剧本版本（仅支持华东-上海一使用）
     *
     * Delete playbook version.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePlaybookVersionRequest 请求对象
     * @return SyncInvoker<DeletePlaybookVersionRequest, DeletePlaybookVersionResponse>
     */
    public SyncInvoker<DeletePlaybookVersionRequest, DeletePlaybookVersionResponse> deletePlaybookVersionInvoker(
        DeletePlaybookVersionRequest request) {
        return new SyncInvoker<>(request, SaMeta.deletePlaybookVersion, hcClient);
    }

    /**
     * 查询剧本版本列表（仅支持华东-上海一使用）
     *
     * List all versions of playbook.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybookVersionsRequest 请求对象
     * @return ListPlaybookVersionsResponse
     */
    public ListPlaybookVersionsResponse listPlaybookVersions(ListPlaybookVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.listPlaybookVersions);
    }

    /**
     * 查询剧本版本列表（仅支持华东-上海一使用）
     *
     * List all versions of playbook.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPlaybookVersionsRequest 请求对象
     * @return SyncInvoker<ListPlaybookVersionsRequest, ListPlaybookVersionsResponse>
     */
    public SyncInvoker<ListPlaybookVersionsRequest, ListPlaybookVersionsResponse> listPlaybookVersionsInvoker(
        ListPlaybookVersionsRequest request) {
        return new SyncInvoker<>(request, SaMeta.listPlaybookVersions, hcClient);
    }

    /**
     * 查询剧本版本详情（仅支持华东-上海一使用）
     *
     * Show playbook version version
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookVersionRequest 请求对象
     * @return ShowPlaybookVersionResponse
     */
    public ShowPlaybookVersionResponse showPlaybookVersion(ShowPlaybookVersionRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.showPlaybookVersion);
    }

    /**
     * 查询剧本版本详情（仅支持华东-上海一使用）
     *
     * Show playbook version version
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlaybookVersionRequest 请求对象
     * @return SyncInvoker<ShowPlaybookVersionRequest, ShowPlaybookVersionResponse>
     */
    public SyncInvoker<ShowPlaybookVersionRequest, ShowPlaybookVersionResponse> showPlaybookVersionInvoker(
        ShowPlaybookVersionRequest request) {
        return new SyncInvoker<>(request, SaMeta.showPlaybookVersion, hcClient);
    }

    /**
     * 更新剧本版本（仅支持华东-上海一使用）
     *
     * Update playbook version.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePlaybookVersionRequest 请求对象
     * @return UpdatePlaybookVersionResponse
     */
    public UpdatePlaybookVersionResponse updatePlaybookVersion(UpdatePlaybookVersionRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.updatePlaybookVersion);
    }

    /**
     * 更新剧本版本（仅支持华东-上海一使用）
     *
     * Update playbook version.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePlaybookVersionRequest 请求对象
     * @return SyncInvoker<UpdatePlaybookVersionRequest, UpdatePlaybookVersionResponse>
     */
    public SyncInvoker<UpdatePlaybookVersionRequest, UpdatePlaybookVersionResponse> updatePlaybookVersionInvoker(
        UpdatePlaybookVersionRequest request) {
        return new SyncInvoker<>(request, SaMeta.updatePlaybookVersion, hcClient);
    }

    /**
     * 创建Dataobject关系
     *
     * Create Dataobject Relation
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataobjectRelationRequest 请求对象
     * @return CreateDataobjectRelationResponse
     */
    public CreateDataobjectRelationResponse createDataobjectRelation(CreateDataobjectRelationRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.createDataobjectRelation);
    }

    /**
     * 创建Dataobject关系
     *
     * Create Dataobject Relation
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataobjectRelationRequest 请求对象
     * @return SyncInvoker<CreateDataobjectRelationRequest, CreateDataobjectRelationResponse>
     */
    public SyncInvoker<CreateDataobjectRelationRequest, CreateDataobjectRelationResponse> createDataobjectRelationInvoker(
        CreateDataobjectRelationRequest request) {
        return new SyncInvoker<>(request, SaMeta.createDataobjectRelation, hcClient);
    }

    /**
     * 删除Dataobject关系
     *
     * Delete Dataobject Relation
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDataobjectRelationRequest 请求对象
     * @return DeleteDataobjectRelationResponse
     */
    public DeleteDataobjectRelationResponse deleteDataobjectRelation(DeleteDataobjectRelationRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.deleteDataobjectRelation);
    }

    /**
     * 删除Dataobject关系
     *
     * Delete Dataobject Relation
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDataobjectRelationRequest 请求对象
     * @return SyncInvoker<DeleteDataobjectRelationRequest, DeleteDataobjectRelationResponse>
     */
    public SyncInvoker<DeleteDataobjectRelationRequest, DeleteDataobjectRelationResponse> deleteDataobjectRelationInvoker(
        DeleteDataobjectRelationRequest request) {
        return new SyncInvoker<>(request, SaMeta.deleteDataobjectRelation, hcClient);
    }

    /**
     * 查询Dataobject关系列表
     *
     * List Dataobject Relation
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataobjectRelationRequest 请求对象
     * @return ListDataobjectRelationResponse
     */
    public ListDataobjectRelationResponse listDataobjectRelation(ListDataobjectRelationRequest request) {
        return hcClient.syncInvokeHttp(request, SaMeta.listDataobjectRelation);
    }

    /**
     * 查询Dataobject关系列表
     *
     * List Dataobject Relation
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataobjectRelationRequest 请求对象
     * @return SyncInvoker<ListDataobjectRelationRequest, ListDataobjectRelationResponse>
     */
    public SyncInvoker<ListDataobjectRelationRequest, ListDataobjectRelationResponse> listDataobjectRelationInvoker(
        ListDataobjectRelationRequest request) {
        return new SyncInvoker<>(request, SaMeta.listDataobjectRelation, hcClient);
    }

}

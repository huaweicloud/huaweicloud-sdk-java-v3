package com.huaweicloud.sdk.secmaster.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.secmaster.v2.model.ChangeAlertRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ChangeAlertResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ChangeIncidentRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ChangeIncidentResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ChangePlaybookInstanceRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ChangePlaybookInstanceResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CopyPlaybookVersionRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CopyPlaybookVersionResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateAlertRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateAlertResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateAlertRuleRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateAlertRuleResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateAlertRuleSimulationRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateAlertRuleSimulationResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateBatchOrderAlertsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateBatchOrderAlertsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateDataobjectRelationsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateDataobjectRelationsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateIncidentRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateIncidentResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateIndicatorRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateIndicatorResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreatePlaybookActionRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreatePlaybookActionResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreatePlaybookApproveRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreatePlaybookApproveResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreatePlaybookRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreatePlaybookResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreatePlaybookRuleRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreatePlaybookRuleResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreatePlaybookVersionRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreatePlaybookVersionResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteAlertRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteAlertResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteAlertRuleRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteAlertRuleResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteDataobjectRelationsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteDataobjectRelationsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteIncidentRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteIncidentResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteIndicatorRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteIndicatorResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeletePlaybookActionRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeletePlaybookActionResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeletePlaybookRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeletePlaybookResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeletePlaybookRuleRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeletePlaybookRuleResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeletePlaybookVersionRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeletePlaybookVersionResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DisableAlertRuleRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DisableAlertRuleResponse;
import com.huaweicloud.sdk.secmaster.v2.model.EnableAlertRuleRequest;
import com.huaweicloud.sdk.secmaster.v2.model.EnableAlertRuleResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListAlertRuleMetricsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListAlertRuleMetricsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListAlertRuleTemplatesRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListAlertRuleTemplatesResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListAlertRulesRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListAlertRulesResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListAlertsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListAlertsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListDataobjectRelationsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListDataobjectRelationsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListIncidentsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListIncidentsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListIndicatorsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListIndicatorsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListPlaybookActionsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListPlaybookActionsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListPlaybookApprovesRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListPlaybookApprovesResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListPlaybookAuditLogsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListPlaybookAuditLogsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListPlaybookInstancesRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListPlaybookInstancesResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListPlaybookVersionsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListPlaybookVersionsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListPlaybooksRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListPlaybooksResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowAlertRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowAlertResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowAlertRuleRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowAlertRuleResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowAlertRuleTemplateRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowAlertRuleTemplateResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowIncidentRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowIncidentResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowIndicatorDetailRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowIndicatorDetailResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowPlaybookInstanceRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowPlaybookInstanceResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowPlaybookMonitorsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowPlaybookMonitorsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowPlaybookRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowPlaybookResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowPlaybookRuleRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowPlaybookRuleResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowPlaybookStatisticsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowPlaybookStatisticsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowPlaybookTopologyRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowPlaybookTopologyResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowPlaybookVersionRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowPlaybookVersionResponse;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateAlertRuleRequest;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateAlertRuleResponse;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateIndicatorRequest;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateIndicatorResponse;
import com.huaweicloud.sdk.secmaster.v2.model.UpdatePlaybookActionRequest;
import com.huaweicloud.sdk.secmaster.v2.model.UpdatePlaybookActionResponse;
import com.huaweicloud.sdk.secmaster.v2.model.UpdatePlaybookRequest;
import com.huaweicloud.sdk.secmaster.v2.model.UpdatePlaybookResponse;
import com.huaweicloud.sdk.secmaster.v2.model.UpdatePlaybookRuleRequest;
import com.huaweicloud.sdk.secmaster.v2.model.UpdatePlaybookRuleResponse;
import com.huaweicloud.sdk.secmaster.v2.model.UpdatePlaybookVersionRequest;
import com.huaweicloud.sdk.secmaster.v2.model.UpdatePlaybookVersionResponse;

import java.util.concurrent.CompletableFuture;

public class SecMasterAsyncClient {

    protected HcClient hcClient;

    public SecMasterAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SecMasterAsyncClient> newBuilder() {
        ClientBuilder<SecMasterAsyncClient> clientBuilder = new ClientBuilder<>(SecMasterAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 更新告警
     *
     * 编辑告警，根据实际修改的属性更新，未修改的列不更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeAlertRequest 请求对象
     * @return CompletableFuture<ChangeAlertResponse>
     */
    public CompletableFuture<ChangeAlertResponse> changeAlertAsync(ChangeAlertRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.changeAlert);
    }

    /**
     * 更新告警
     *
     * 编辑告警，根据实际修改的属性更新，未修改的列不更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeAlertRequest 请求对象
     * @return AsyncInvoker<ChangeAlertRequest, ChangeAlertResponse>
     */
    public AsyncInvoker<ChangeAlertRequest, ChangeAlertResponse> changeAlertAsyncInvoker(ChangeAlertRequest request) {
        return new AsyncInvoker<ChangeAlertRequest, ChangeAlertResponse>(request, SecMasterMeta.changeAlert, hcClient);
    }

    /**
     * 更新事件
     *
     * 编辑事件，根据实际修改的属性更新，未修改的列不更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeIncidentRequest 请求对象
     * @return CompletableFuture<ChangeIncidentResponse>
     */
    public CompletableFuture<ChangeIncidentResponse> changeIncidentAsync(ChangeIncidentRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.changeIncident);
    }

    /**
     * 更新事件
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
        return new AsyncInvoker<ChangeIncidentRequest, ChangeIncidentResponse>(request, SecMasterMeta.changeIncident,
            hcClient);
    }

    /**
     * 操作剧本实例
     *
     * 操作剧本实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangePlaybookInstanceRequest 请求对象
     * @return CompletableFuture<ChangePlaybookInstanceResponse>
     */
    public CompletableFuture<ChangePlaybookInstanceResponse> changePlaybookInstanceAsync(
        ChangePlaybookInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.changePlaybookInstance);
    }

    /**
     * 操作剧本实例
     *
     * 操作剧本实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangePlaybookInstanceRequest 请求对象
     * @return AsyncInvoker<ChangePlaybookInstanceRequest, ChangePlaybookInstanceResponse>
     */
    public AsyncInvoker<ChangePlaybookInstanceRequest, ChangePlaybookInstanceResponse> changePlaybookInstanceAsyncInvoker(
        ChangePlaybookInstanceRequest request) {
        return new AsyncInvoker<ChangePlaybookInstanceRequest, ChangePlaybookInstanceResponse>(request,
            SecMasterMeta.changePlaybookInstance, hcClient);
    }

    /**
     * 克隆剧本及版本
     *
     * 克隆剧本及版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CopyPlaybookVersionRequest 请求对象
     * @return CompletableFuture<CopyPlaybookVersionResponse>
     */
    public CompletableFuture<CopyPlaybookVersionResponse> copyPlaybookVersionAsync(CopyPlaybookVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.copyPlaybookVersion);
    }

    /**
     * 克隆剧本及版本
     *
     * 克隆剧本及版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CopyPlaybookVersionRequest 请求对象
     * @return AsyncInvoker<CopyPlaybookVersionRequest, CopyPlaybookVersionResponse>
     */
    public AsyncInvoker<CopyPlaybookVersionRequest, CopyPlaybookVersionResponse> copyPlaybookVersionAsyncInvoker(
        CopyPlaybookVersionRequest request) {
        return new AsyncInvoker<CopyPlaybookVersionRequest, CopyPlaybookVersionResponse>(request,
            SecMasterMeta.copyPlaybookVersion, hcClient);
    }

    /**
     * 创建告警
     *
     * 创建告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAlertRequest 请求对象
     * @return CompletableFuture<CreateAlertResponse>
     */
    public CompletableFuture<CreateAlertResponse> createAlertAsync(CreateAlertRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createAlert);
    }

    /**
     * 创建告警
     *
     * 创建告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAlertRequest 请求对象
     * @return AsyncInvoker<CreateAlertRequest, CreateAlertResponse>
     */
    public AsyncInvoker<CreateAlertRequest, CreateAlertResponse> createAlertAsyncInvoker(CreateAlertRequest request) {
        return new AsyncInvoker<CreateAlertRequest, CreateAlertResponse>(request, SecMasterMeta.createAlert, hcClient);
    }

    /**
     * 创建告警规则
     *
     * Create alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAlertRuleRequest 请求对象
     * @return CompletableFuture<CreateAlertRuleResponse>
     */
    public CompletableFuture<CreateAlertRuleResponse> createAlertRuleAsync(CreateAlertRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createAlertRule);
    }

    /**
     * 创建告警规则
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
        return new AsyncInvoker<CreateAlertRuleRequest, CreateAlertRuleResponse>(request, SecMasterMeta.createAlertRule,
            hcClient);
    }

    /**
     * 模拟告警规则
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
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createAlertRuleSimulation);
    }

    /**
     * 模拟告警规则
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
            SecMasterMeta.createAlertRuleSimulation, hcClient);
    }

    /**
     * 告警转事件
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
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createBatchOrderAlerts);
    }

    /**
     * 告警转事件
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
            SecMasterMeta.createBatchOrderAlerts, hcClient);
    }

    /**
     * 关联Dataobject
     *
     * 关联Dataobject
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDataobjectRelationsRequest 请求对象
     * @return CompletableFuture<CreateDataobjectRelationsResponse>
     */
    public CompletableFuture<CreateDataobjectRelationsResponse> createDataobjectRelationsAsync(
        CreateDataobjectRelationsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createDataobjectRelations);
    }

    /**
     * 关联Dataobject
     *
     * 关联Dataobject
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDataobjectRelationsRequest 请求对象
     * @return AsyncInvoker<CreateDataobjectRelationsRequest, CreateDataobjectRelationsResponse>
     */
    public AsyncInvoker<CreateDataobjectRelationsRequest, CreateDataobjectRelationsResponse> createDataobjectRelationsAsyncInvoker(
        CreateDataobjectRelationsRequest request) {
        return new AsyncInvoker<CreateDataobjectRelationsRequest, CreateDataobjectRelationsResponse>(request,
            SecMasterMeta.createDataobjectRelations, hcClient);
    }

    /**
     * 创建事件
     *
     * 创建事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateIncidentRequest 请求对象
     * @return CompletableFuture<CreateIncidentResponse>
     */
    public CompletableFuture<CreateIncidentResponse> createIncidentAsync(CreateIncidentRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createIncident);
    }

    /**
     * 创建事件
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
        return new AsyncInvoker<CreateIncidentRequest, CreateIncidentResponse>(request, SecMasterMeta.createIncident,
            hcClient);
    }

    /**
     * 创建指标
     *
     * 创建指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateIndicatorRequest 请求对象
     * @return CompletableFuture<CreateIndicatorResponse>
     */
    public CompletableFuture<CreateIndicatorResponse> createIndicatorAsync(CreateIndicatorRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createIndicator);
    }

    /**
     * 创建指标
     *
     * 创建指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateIndicatorRequest 请求对象
     * @return AsyncInvoker<CreateIndicatorRequest, CreateIndicatorResponse>
     */
    public AsyncInvoker<CreateIndicatorRequest, CreateIndicatorResponse> createIndicatorAsyncInvoker(
        CreateIndicatorRequest request) {
        return new AsyncInvoker<CreateIndicatorRequest, CreateIndicatorResponse>(request, SecMasterMeta.createIndicator,
            hcClient);
    }

    /**
     * 创建剧本
     *
     * 创建剧本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePlaybookRequest 请求对象
     * @return CompletableFuture<CreatePlaybookResponse>
     */
    public CompletableFuture<CreatePlaybookResponse> createPlaybookAsync(CreatePlaybookRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createPlaybook);
    }

    /**
     * 创建剧本
     *
     * 创建剧本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePlaybookRequest 请求对象
     * @return AsyncInvoker<CreatePlaybookRequest, CreatePlaybookResponse>
     */
    public AsyncInvoker<CreatePlaybookRequest, CreatePlaybookResponse> createPlaybookAsyncInvoker(
        CreatePlaybookRequest request) {
        return new AsyncInvoker<CreatePlaybookRequest, CreatePlaybookResponse>(request, SecMasterMeta.createPlaybook,
            hcClient);
    }

    /**
     * 创建剧本动作
     *
     * 创建剧本动作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePlaybookActionRequest 请求对象
     * @return CompletableFuture<CreatePlaybookActionResponse>
     */
    public CompletableFuture<CreatePlaybookActionResponse> createPlaybookActionAsync(
        CreatePlaybookActionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createPlaybookAction);
    }

    /**
     * 创建剧本动作
     *
     * 创建剧本动作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePlaybookActionRequest 请求对象
     * @return AsyncInvoker<CreatePlaybookActionRequest, CreatePlaybookActionResponse>
     */
    public AsyncInvoker<CreatePlaybookActionRequest, CreatePlaybookActionResponse> createPlaybookActionAsyncInvoker(
        CreatePlaybookActionRequest request) {
        return new AsyncInvoker<CreatePlaybookActionRequest, CreatePlaybookActionResponse>(request,
            SecMasterMeta.createPlaybookAction, hcClient);
    }

    /**
     * 审核剧本
     *
     * 审核剧本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePlaybookApproveRequest 请求对象
     * @return CompletableFuture<CreatePlaybookApproveResponse>
     */
    public CompletableFuture<CreatePlaybookApproveResponse> createPlaybookApproveAsync(
        CreatePlaybookApproveRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createPlaybookApprove);
    }

    /**
     * 审核剧本
     *
     * 审核剧本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePlaybookApproveRequest 请求对象
     * @return AsyncInvoker<CreatePlaybookApproveRequest, CreatePlaybookApproveResponse>
     */
    public AsyncInvoker<CreatePlaybookApproveRequest, CreatePlaybookApproveResponse> createPlaybookApproveAsyncInvoker(
        CreatePlaybookApproveRequest request) {
        return new AsyncInvoker<CreatePlaybookApproveRequest, CreatePlaybookApproveResponse>(request,
            SecMasterMeta.createPlaybookApprove, hcClient);
    }

    /**
     * 创建剧本规则
     *
     * 创建剧本规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePlaybookRuleRequest 请求对象
     * @return CompletableFuture<CreatePlaybookRuleResponse>
     */
    public CompletableFuture<CreatePlaybookRuleResponse> createPlaybookRuleAsync(CreatePlaybookRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createPlaybookRule);
    }

    /**
     * 创建剧本规则
     *
     * 创建剧本规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePlaybookRuleRequest 请求对象
     * @return AsyncInvoker<CreatePlaybookRuleRequest, CreatePlaybookRuleResponse>
     */
    public AsyncInvoker<CreatePlaybookRuleRequest, CreatePlaybookRuleResponse> createPlaybookRuleAsyncInvoker(
        CreatePlaybookRuleRequest request) {
        return new AsyncInvoker<CreatePlaybookRuleRequest, CreatePlaybookRuleResponse>(request,
            SecMasterMeta.createPlaybookRule, hcClient);
    }

    /**
     * 创建剧本版本
     *
     * 创建剧本版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePlaybookVersionRequest 请求对象
     * @return CompletableFuture<CreatePlaybookVersionResponse>
     */
    public CompletableFuture<CreatePlaybookVersionResponse> createPlaybookVersionAsync(
        CreatePlaybookVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createPlaybookVersion);
    }

    /**
     * 创建剧本版本
     *
     * 创建剧本版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePlaybookVersionRequest 请求对象
     * @return AsyncInvoker<CreatePlaybookVersionRequest, CreatePlaybookVersionResponse>
     */
    public AsyncInvoker<CreatePlaybookVersionRequest, CreatePlaybookVersionResponse> createPlaybookVersionAsyncInvoker(
        CreatePlaybookVersionRequest request) {
        return new AsyncInvoker<CreatePlaybookVersionRequest, CreatePlaybookVersionResponse>(request,
            SecMasterMeta.createPlaybookVersion, hcClient);
    }

    /**
     * 删除告警
     *
     * 删除告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAlertRequest 请求对象
     * @return CompletableFuture<DeleteAlertResponse>
     */
    public CompletableFuture<DeleteAlertResponse> deleteAlertAsync(DeleteAlertRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteAlert);
    }

    /**
     * 删除告警
     *
     * 删除告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAlertRequest 请求对象
     * @return AsyncInvoker<DeleteAlertRequest, DeleteAlertResponse>
     */
    public AsyncInvoker<DeleteAlertRequest, DeleteAlertResponse> deleteAlertAsyncInvoker(DeleteAlertRequest request) {
        return new AsyncInvoker<DeleteAlertRequest, DeleteAlertResponse>(request, SecMasterMeta.deleteAlert, hcClient);
    }

    /**
     * 删除告警规则
     *
     * Delete alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAlertRuleRequest 请求对象
     * @return CompletableFuture<DeleteAlertRuleResponse>
     */
    public CompletableFuture<DeleteAlertRuleResponse> deleteAlertRuleAsync(DeleteAlertRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteAlertRule);
    }

    /**
     * 删除告警规则
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
        return new AsyncInvoker<DeleteAlertRuleRequest, DeleteAlertRuleResponse>(request, SecMasterMeta.deleteAlertRule,
            hcClient);
    }

    /**
     * 取消关联Dataobject
     *
     * 取消关联Dataobject
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDataobjectRelationsRequest 请求对象
     * @return CompletableFuture<DeleteDataobjectRelationsResponse>
     */
    public CompletableFuture<DeleteDataobjectRelationsResponse> deleteDataobjectRelationsAsync(
        DeleteDataobjectRelationsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteDataobjectRelations);
    }

    /**
     * 取消关联Dataobject
     *
     * 取消关联Dataobject
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDataobjectRelationsRequest 请求对象
     * @return AsyncInvoker<DeleteDataobjectRelationsRequest, DeleteDataobjectRelationsResponse>
     */
    public AsyncInvoker<DeleteDataobjectRelationsRequest, DeleteDataobjectRelationsResponse> deleteDataobjectRelationsAsyncInvoker(
        DeleteDataobjectRelationsRequest request) {
        return new AsyncInvoker<DeleteDataobjectRelationsRequest, DeleteDataobjectRelationsResponse>(request,
            SecMasterMeta.deleteDataobjectRelations, hcClient);
    }

    /**
     * 删除事件
     *
     * 删除事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteIncidentRequest 请求对象
     * @return CompletableFuture<DeleteIncidentResponse>
     */
    public CompletableFuture<DeleteIncidentResponse> deleteIncidentAsync(DeleteIncidentRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteIncident);
    }

    /**
     * 删除事件
     *
     * 删除事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteIncidentRequest 请求对象
     * @return AsyncInvoker<DeleteIncidentRequest, DeleteIncidentResponse>
     */
    public AsyncInvoker<DeleteIncidentRequest, DeleteIncidentResponse> deleteIncidentAsyncInvoker(
        DeleteIncidentRequest request) {
        return new AsyncInvoker<DeleteIncidentRequest, DeleteIncidentResponse>(request, SecMasterMeta.deleteIncident,
            hcClient);
    }

    /**
     * 删除指标
     *
     * 删除指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteIndicatorRequest 请求对象
     * @return CompletableFuture<DeleteIndicatorResponse>
     */
    public CompletableFuture<DeleteIndicatorResponse> deleteIndicatorAsync(DeleteIndicatorRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteIndicator);
    }

    /**
     * 删除指标
     *
     * 删除指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteIndicatorRequest 请求对象
     * @return AsyncInvoker<DeleteIndicatorRequest, DeleteIndicatorResponse>
     */
    public AsyncInvoker<DeleteIndicatorRequest, DeleteIndicatorResponse> deleteIndicatorAsyncInvoker(
        DeleteIndicatorRequest request) {
        return new AsyncInvoker<DeleteIndicatorRequest, DeleteIndicatorResponse>(request, SecMasterMeta.deleteIndicator,
            hcClient);
    }

    /**
     * 删除剧本
     *
     * 删除剧本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePlaybookRequest 请求对象
     * @return CompletableFuture<DeletePlaybookResponse>
     */
    public CompletableFuture<DeletePlaybookResponse> deletePlaybookAsync(DeletePlaybookRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deletePlaybook);
    }

    /**
     * 删除剧本
     *
     * 删除剧本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePlaybookRequest 请求对象
     * @return AsyncInvoker<DeletePlaybookRequest, DeletePlaybookResponse>
     */
    public AsyncInvoker<DeletePlaybookRequest, DeletePlaybookResponse> deletePlaybookAsyncInvoker(
        DeletePlaybookRequest request) {
        return new AsyncInvoker<DeletePlaybookRequest, DeletePlaybookResponse>(request, SecMasterMeta.deletePlaybook,
            hcClient);
    }

    /**
     * 删除剧本动作
     *
     * 删除剧本动作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePlaybookActionRequest 请求对象
     * @return CompletableFuture<DeletePlaybookActionResponse>
     */
    public CompletableFuture<DeletePlaybookActionResponse> deletePlaybookActionAsync(
        DeletePlaybookActionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deletePlaybookAction);
    }

    /**
     * 删除剧本动作
     *
     * 删除剧本动作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePlaybookActionRequest 请求对象
     * @return AsyncInvoker<DeletePlaybookActionRequest, DeletePlaybookActionResponse>
     */
    public AsyncInvoker<DeletePlaybookActionRequest, DeletePlaybookActionResponse> deletePlaybookActionAsyncInvoker(
        DeletePlaybookActionRequest request) {
        return new AsyncInvoker<DeletePlaybookActionRequest, DeletePlaybookActionResponse>(request,
            SecMasterMeta.deletePlaybookAction, hcClient);
    }

    /**
     * 删除剧本规则
     *
     * 删除剧本规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePlaybookRuleRequest 请求对象
     * @return CompletableFuture<DeletePlaybookRuleResponse>
     */
    public CompletableFuture<DeletePlaybookRuleResponse> deletePlaybookRuleAsync(DeletePlaybookRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deletePlaybookRule);
    }

    /**
     * 删除剧本规则
     *
     * 删除剧本规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePlaybookRuleRequest 请求对象
     * @return AsyncInvoker<DeletePlaybookRuleRequest, DeletePlaybookRuleResponse>
     */
    public AsyncInvoker<DeletePlaybookRuleRequest, DeletePlaybookRuleResponse> deletePlaybookRuleAsyncInvoker(
        DeletePlaybookRuleRequest request) {
        return new AsyncInvoker<DeletePlaybookRuleRequest, DeletePlaybookRuleResponse>(request,
            SecMasterMeta.deletePlaybookRule, hcClient);
    }

    /**
     * 删除剧本版本
     *
     * 删除剧本版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePlaybookVersionRequest 请求对象
     * @return CompletableFuture<DeletePlaybookVersionResponse>
     */
    public CompletableFuture<DeletePlaybookVersionResponse> deletePlaybookVersionAsync(
        DeletePlaybookVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deletePlaybookVersion);
    }

    /**
     * 删除剧本版本
     *
     * 删除剧本版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePlaybookVersionRequest 请求对象
     * @return AsyncInvoker<DeletePlaybookVersionRequest, DeletePlaybookVersionResponse>
     */
    public AsyncInvoker<DeletePlaybookVersionRequest, DeletePlaybookVersionResponse> deletePlaybookVersionAsyncInvoker(
        DeletePlaybookVersionRequest request) {
        return new AsyncInvoker<DeletePlaybookVersionRequest, DeletePlaybookVersionResponse>(request,
            SecMasterMeta.deletePlaybookVersion, hcClient);
    }

    /**
     * 停用告警规则
     *
     * Disable alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisableAlertRuleRequest 请求对象
     * @return CompletableFuture<DisableAlertRuleResponse>
     */
    public CompletableFuture<DisableAlertRuleResponse> disableAlertRuleAsync(DisableAlertRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.disableAlertRule);
    }

    /**
     * 停用告警规则
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
        return new AsyncInvoker<DisableAlertRuleRequest, DisableAlertRuleResponse>(request,
            SecMasterMeta.disableAlertRule, hcClient);
    }

    /**
     * 启用告警规则
     *
     * Enable alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnableAlertRuleRequest 请求对象
     * @return CompletableFuture<EnableAlertRuleResponse>
     */
    public CompletableFuture<EnableAlertRuleResponse> enableAlertRuleAsync(EnableAlertRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.enableAlertRule);
    }

    /**
     * 启用告警规则
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
        return new AsyncInvoker<EnableAlertRuleRequest, EnableAlertRuleResponse>(request, SecMasterMeta.enableAlertRule,
            hcClient);
    }

    /**
     * 告警规则总览
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
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listAlertRuleMetrics);
    }

    /**
     * 告警规则总览
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
            SecMasterMeta.listAlertRuleMetrics, hcClient);
    }

    /**
     * 列出告警规则模板
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
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listAlertRuleTemplates);
    }

    /**
     * 列出告警规则模板
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
            SecMasterMeta.listAlertRuleTemplates, hcClient);
    }

    /**
     * 列出告警规则
     *
     * List alert rules
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlertRulesRequest 请求对象
     * @return CompletableFuture<ListAlertRulesResponse>
     */
    public CompletableFuture<ListAlertRulesResponse> listAlertRulesAsync(ListAlertRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listAlertRules);
    }

    /**
     * 列出告警规则
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
        return new AsyncInvoker<ListAlertRulesRequest, ListAlertRulesResponse>(request, SecMasterMeta.listAlertRules,
            hcClient);
    }

    /**
     * 搜索告警列表
     *
     * 搜索告警列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlertsRequest 请求对象
     * @return CompletableFuture<ListAlertsResponse>
     */
    public CompletableFuture<ListAlertsResponse> listAlertsAsync(ListAlertsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listAlerts);
    }

    /**
     * 搜索告警列表
     *
     * 搜索告警列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlertsRequest 请求对象
     * @return AsyncInvoker<ListAlertsRequest, ListAlertsResponse>
     */
    public AsyncInvoker<ListAlertsRequest, ListAlertsResponse> listAlertsAsyncInvoker(ListAlertsRequest request) {
        return new AsyncInvoker<ListAlertsRequest, ListAlertsResponse>(request, SecMasterMeta.listAlerts, hcClient);
    }

    /**
     * 查询关联Dataobject列表
     *
     * 查询关联Dataobject列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDataobjectRelationsRequest 请求对象
     * @return CompletableFuture<ListDataobjectRelationsResponse>
     */
    public CompletableFuture<ListDataobjectRelationsResponse> listDataobjectRelationsAsync(
        ListDataobjectRelationsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listDataobjectRelations);
    }

    /**
     * 查询关联Dataobject列表
     *
     * 查询关联Dataobject列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDataobjectRelationsRequest 请求对象
     * @return AsyncInvoker<ListDataobjectRelationsRequest, ListDataobjectRelationsResponse>
     */
    public AsyncInvoker<ListDataobjectRelationsRequest, ListDataobjectRelationsResponse> listDataobjectRelationsAsyncInvoker(
        ListDataobjectRelationsRequest request) {
        return new AsyncInvoker<ListDataobjectRelationsRequest, ListDataobjectRelationsResponse>(request,
            SecMasterMeta.listDataobjectRelations, hcClient);
    }

    /**
     * 搜索事件列表
     *
     * 搜索事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIncidentsRequest 请求对象
     * @return CompletableFuture<ListIncidentsResponse>
     */
    public CompletableFuture<ListIncidentsResponse> listIncidentsAsync(ListIncidentsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listIncidents);
    }

    /**
     * 搜索事件列表
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
        return new AsyncInvoker<ListIncidentsRequest, ListIncidentsResponse>(request, SecMasterMeta.listIncidents,
            hcClient);
    }

    /**
     * 查询指标列表
     *
     * 查询指标列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIndicatorsRequest 请求对象
     * @return CompletableFuture<ListIndicatorsResponse>
     */
    public CompletableFuture<ListIndicatorsResponse> listIndicatorsAsync(ListIndicatorsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listIndicators);
    }

    /**
     * 查询指标列表
     *
     * 查询指标列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIndicatorsRequest 请求对象
     * @return AsyncInvoker<ListIndicatorsRequest, ListIndicatorsResponse>
     */
    public AsyncInvoker<ListIndicatorsRequest, ListIndicatorsResponse> listIndicatorsAsyncInvoker(
        ListIndicatorsRequest request) {
        return new AsyncInvoker<ListIndicatorsRequest, ListIndicatorsResponse>(request, SecMasterMeta.listIndicators,
            hcClient);
    }

    /**
     * 查询剧本动作
     *
     * 查询剧本动作列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPlaybookActionsRequest 请求对象
     * @return CompletableFuture<ListPlaybookActionsResponse>
     */
    public CompletableFuture<ListPlaybookActionsResponse> listPlaybookActionsAsync(ListPlaybookActionsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listPlaybookActions);
    }

    /**
     * 查询剧本动作
     *
     * 查询剧本动作列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPlaybookActionsRequest 请求对象
     * @return AsyncInvoker<ListPlaybookActionsRequest, ListPlaybookActionsResponse>
     */
    public AsyncInvoker<ListPlaybookActionsRequest, ListPlaybookActionsResponse> listPlaybookActionsAsyncInvoker(
        ListPlaybookActionsRequest request) {
        return new AsyncInvoker<ListPlaybookActionsRequest, ListPlaybookActionsResponse>(request,
            SecMasterMeta.listPlaybookActions, hcClient);
    }

    /**
     * 查询剧本审核结果
     *
     * 查询剧本审核结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPlaybookApprovesRequest 请求对象
     * @return CompletableFuture<ListPlaybookApprovesResponse>
     */
    public CompletableFuture<ListPlaybookApprovesResponse> listPlaybookApprovesAsync(
        ListPlaybookApprovesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listPlaybookApproves);
    }

    /**
     * 查询剧本审核结果
     *
     * 查询剧本审核结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPlaybookApprovesRequest 请求对象
     * @return AsyncInvoker<ListPlaybookApprovesRequest, ListPlaybookApprovesResponse>
     */
    public AsyncInvoker<ListPlaybookApprovesRequest, ListPlaybookApprovesResponse> listPlaybookApprovesAsyncInvoker(
        ListPlaybookApprovesRequest request) {
        return new AsyncInvoker<ListPlaybookApprovesRequest, ListPlaybookApprovesResponse>(request,
            SecMasterMeta.listPlaybookApproves, hcClient);
    }

    /**
     * 查询剧本实例审计日志
     *
     * 查询剧本实例审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPlaybookAuditLogsRequest 请求对象
     * @return CompletableFuture<ListPlaybookAuditLogsResponse>
     */
    public CompletableFuture<ListPlaybookAuditLogsResponse> listPlaybookAuditLogsAsync(
        ListPlaybookAuditLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listPlaybookAuditLogs);
    }

    /**
     * 查询剧本实例审计日志
     *
     * 查询剧本实例审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPlaybookAuditLogsRequest 请求对象
     * @return AsyncInvoker<ListPlaybookAuditLogsRequest, ListPlaybookAuditLogsResponse>
     */
    public AsyncInvoker<ListPlaybookAuditLogsRequest, ListPlaybookAuditLogsResponse> listPlaybookAuditLogsAsyncInvoker(
        ListPlaybookAuditLogsRequest request) {
        return new AsyncInvoker<ListPlaybookAuditLogsRequest, ListPlaybookAuditLogsResponse>(request,
            SecMasterMeta.listPlaybookAuditLogs, hcClient);
    }

    /**
     * 查询剧本实例列表
     *
     * 查询剧本实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPlaybookInstancesRequest 请求对象
     * @return CompletableFuture<ListPlaybookInstancesResponse>
     */
    public CompletableFuture<ListPlaybookInstancesResponse> listPlaybookInstancesAsync(
        ListPlaybookInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listPlaybookInstances);
    }

    /**
     * 查询剧本实例列表
     *
     * 查询剧本实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPlaybookInstancesRequest 请求对象
     * @return AsyncInvoker<ListPlaybookInstancesRequest, ListPlaybookInstancesResponse>
     */
    public AsyncInvoker<ListPlaybookInstancesRequest, ListPlaybookInstancesResponse> listPlaybookInstancesAsyncInvoker(
        ListPlaybookInstancesRequest request) {
        return new AsyncInvoker<ListPlaybookInstancesRequest, ListPlaybookInstancesResponse>(request,
            SecMasterMeta.listPlaybookInstances, hcClient);
    }

    /**
     * 查询剧本版本列表
     *
     * 查询剧本版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPlaybookVersionsRequest 请求对象
     * @return CompletableFuture<ListPlaybookVersionsResponse>
     */
    public CompletableFuture<ListPlaybookVersionsResponse> listPlaybookVersionsAsync(
        ListPlaybookVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listPlaybookVersions);
    }

    /**
     * 查询剧本版本列表
     *
     * 查询剧本版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPlaybookVersionsRequest 请求对象
     * @return AsyncInvoker<ListPlaybookVersionsRequest, ListPlaybookVersionsResponse>
     */
    public AsyncInvoker<ListPlaybookVersionsRequest, ListPlaybookVersionsResponse> listPlaybookVersionsAsyncInvoker(
        ListPlaybookVersionsRequest request) {
        return new AsyncInvoker<ListPlaybookVersionsRequest, ListPlaybookVersionsResponse>(request,
            SecMasterMeta.listPlaybookVersions, hcClient);
    }

    /**
     * 查询剧本列表
     *
     * 查询剧本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPlaybooksRequest 请求对象
     * @return CompletableFuture<ListPlaybooksResponse>
     */
    public CompletableFuture<ListPlaybooksResponse> listPlaybooksAsync(ListPlaybooksRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listPlaybooks);
    }

    /**
     * 查询剧本列表
     *
     * 查询剧本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPlaybooksRequest 请求对象
     * @return AsyncInvoker<ListPlaybooksRequest, ListPlaybooksResponse>
     */
    public AsyncInvoker<ListPlaybooksRequest, ListPlaybooksResponse> listPlaybooksAsyncInvoker(
        ListPlaybooksRequest request) {
        return new AsyncInvoker<ListPlaybooksRequest, ListPlaybooksResponse>(request, SecMasterMeta.listPlaybooks,
            hcClient);
    }

    /**
     * 获取告警详情
     *
     * 获取告警详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAlertRequest 请求对象
     * @return CompletableFuture<ShowAlertResponse>
     */
    public CompletableFuture<ShowAlertResponse> showAlertAsync(ShowAlertRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showAlert);
    }

    /**
     * 获取告警详情
     *
     * 获取告警详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAlertRequest 请求对象
     * @return AsyncInvoker<ShowAlertRequest, ShowAlertResponse>
     */
    public AsyncInvoker<ShowAlertRequest, ShowAlertResponse> showAlertAsyncInvoker(ShowAlertRequest request) {
        return new AsyncInvoker<ShowAlertRequest, ShowAlertResponse>(request, SecMasterMeta.showAlert, hcClient);
    }

    /**
     * 查看告警规则
     *
     * 查看告警规则 Get alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAlertRuleRequest 请求对象
     * @return CompletableFuture<ShowAlertRuleResponse>
     */
    public CompletableFuture<ShowAlertRuleResponse> showAlertRuleAsync(ShowAlertRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showAlertRule);
    }

    /**
     * 查看告警规则
     *
     * 查看告警规则 Get alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAlertRuleRequest 请求对象
     * @return AsyncInvoker<ShowAlertRuleRequest, ShowAlertRuleResponse>
     */
    public AsyncInvoker<ShowAlertRuleRequest, ShowAlertRuleResponse> showAlertRuleAsyncInvoker(
        ShowAlertRuleRequest request) {
        return new AsyncInvoker<ShowAlertRuleRequest, ShowAlertRuleResponse>(request, SecMasterMeta.showAlertRule,
            hcClient);
    }

    /**
     * 查看告警规则模板
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
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showAlertRuleTemplate);
    }

    /**
     * 查看告警规则模板
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
            SecMasterMeta.showAlertRuleTemplate, hcClient);
    }

    /**
     * 获取事件详情
     *
     * 获取事件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIncidentRequest 请求对象
     * @return CompletableFuture<ShowIncidentResponse>
     */
    public CompletableFuture<ShowIncidentResponse> showIncidentAsync(ShowIncidentRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showIncident);
    }

    /**
     * 获取事件详情
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
        return new AsyncInvoker<ShowIncidentRequest, ShowIncidentResponse>(request, SecMasterMeta.showIncident,
            hcClient);
    }

    /**
     * 查询指标详情
     *
     * 查询指标详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIndicatorDetailRequest 请求对象
     * @return CompletableFuture<ShowIndicatorDetailResponse>
     */
    public CompletableFuture<ShowIndicatorDetailResponse> showIndicatorDetailAsync(ShowIndicatorDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showIndicatorDetail);
    }

    /**
     * 查询指标详情
     *
     * 查询指标详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIndicatorDetailRequest 请求对象
     * @return AsyncInvoker<ShowIndicatorDetailRequest, ShowIndicatorDetailResponse>
     */
    public AsyncInvoker<ShowIndicatorDetailRequest, ShowIndicatorDetailResponse> showIndicatorDetailAsyncInvoker(
        ShowIndicatorDetailRequest request) {
        return new AsyncInvoker<ShowIndicatorDetailRequest, ShowIndicatorDetailResponse>(request,
            SecMasterMeta.showIndicatorDetail, hcClient);
    }

    /**
     * 查询剧本详情
     *
     * 查询剧本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlaybookRequest 请求对象
     * @return CompletableFuture<ShowPlaybookResponse>
     */
    public CompletableFuture<ShowPlaybookResponse> showPlaybookAsync(ShowPlaybookRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showPlaybook);
    }

    /**
     * 查询剧本详情
     *
     * 查询剧本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlaybookRequest 请求对象
     * @return AsyncInvoker<ShowPlaybookRequest, ShowPlaybookResponse>
     */
    public AsyncInvoker<ShowPlaybookRequest, ShowPlaybookResponse> showPlaybookAsyncInvoker(
        ShowPlaybookRequest request) {
        return new AsyncInvoker<ShowPlaybookRequest, ShowPlaybookResponse>(request, SecMasterMeta.showPlaybook,
            hcClient);
    }

    /**
     * 查询剧本实例详情
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
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showPlaybookInstance);
    }

    /**
     * 查询剧本实例详情
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
            SecMasterMeta.showPlaybookInstance, hcClient);
    }

    /**
     * 剧本运行监控
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
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showPlaybookMonitors);
    }

    /**
     * 剧本运行监控
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
            SecMasterMeta.showPlaybookMonitors, hcClient);
    }

    /**
     * 查询剧本规则详情
     *
     * 查询剧本规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlaybookRuleRequest 请求对象
     * @return CompletableFuture<ShowPlaybookRuleResponse>
     */
    public CompletableFuture<ShowPlaybookRuleResponse> showPlaybookRuleAsync(ShowPlaybookRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showPlaybookRule);
    }

    /**
     * 查询剧本规则详情
     *
     * 查询剧本规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlaybookRuleRequest 请求对象
     * @return AsyncInvoker<ShowPlaybookRuleRequest, ShowPlaybookRuleResponse>
     */
    public AsyncInvoker<ShowPlaybookRuleRequest, ShowPlaybookRuleResponse> showPlaybookRuleAsyncInvoker(
        ShowPlaybookRuleRequest request) {
        return new AsyncInvoker<ShowPlaybookRuleRequest, ShowPlaybookRuleResponse>(request,
            SecMasterMeta.showPlaybookRule, hcClient);
    }

    /**
     * 剧本数据统计
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
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showPlaybookStatistics);
    }

    /**
     * 剧本数据统计
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
            SecMasterMeta.showPlaybookStatistics, hcClient);
    }

    /**
     * 查询剧本拓扑关系
     *
     * 查询剧本拓扑关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlaybookTopologyRequest 请求对象
     * @return CompletableFuture<ShowPlaybookTopologyResponse>
     */
    public CompletableFuture<ShowPlaybookTopologyResponse> showPlaybookTopologyAsync(
        ShowPlaybookTopologyRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showPlaybookTopology);
    }

    /**
     * 查询剧本拓扑关系
     *
     * 查询剧本拓扑关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlaybookTopologyRequest 请求对象
     * @return AsyncInvoker<ShowPlaybookTopologyRequest, ShowPlaybookTopologyResponse>
     */
    public AsyncInvoker<ShowPlaybookTopologyRequest, ShowPlaybookTopologyResponse> showPlaybookTopologyAsyncInvoker(
        ShowPlaybookTopologyRequest request) {
        return new AsyncInvoker<ShowPlaybookTopologyRequest, ShowPlaybookTopologyResponse>(request,
            SecMasterMeta.showPlaybookTopology, hcClient);
    }

    /**
     * 查询剧本版本详情
     *
     * Show playbook version version
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlaybookVersionRequest 请求对象
     * @return CompletableFuture<ShowPlaybookVersionResponse>
     */
    public CompletableFuture<ShowPlaybookVersionResponse> showPlaybookVersionAsync(ShowPlaybookVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showPlaybookVersion);
    }

    /**
     * 查询剧本版本详情
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
            SecMasterMeta.showPlaybookVersion, hcClient);
    }

    /**
     * 更新告警规则
     *
     * Update alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAlertRuleRequest 请求对象
     * @return CompletableFuture<UpdateAlertRuleResponse>
     */
    public CompletableFuture<UpdateAlertRuleResponse> updateAlertRuleAsync(UpdateAlertRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateAlertRule);
    }

    /**
     * 更新告警规则
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
        return new AsyncInvoker<UpdateAlertRuleRequest, UpdateAlertRuleResponse>(request, SecMasterMeta.updateAlertRule,
            hcClient);
    }

    /**
     * 更新指标
     *
     * 更新指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateIndicatorRequest 请求对象
     * @return CompletableFuture<UpdateIndicatorResponse>
     */
    public CompletableFuture<UpdateIndicatorResponse> updateIndicatorAsync(UpdateIndicatorRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateIndicator);
    }

    /**
     * 更新指标
     *
     * 更新指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateIndicatorRequest 请求对象
     * @return AsyncInvoker<UpdateIndicatorRequest, UpdateIndicatorResponse>
     */
    public AsyncInvoker<UpdateIndicatorRequest, UpdateIndicatorResponse> updateIndicatorAsyncInvoker(
        UpdateIndicatorRequest request) {
        return new AsyncInvoker<UpdateIndicatorRequest, UpdateIndicatorResponse>(request, SecMasterMeta.updateIndicator,
            hcClient);
    }

    /**
     * 修改剧本
     *
     * 修改剧本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePlaybookRequest 请求对象
     * @return CompletableFuture<UpdatePlaybookResponse>
     */
    public CompletableFuture<UpdatePlaybookResponse> updatePlaybookAsync(UpdatePlaybookRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updatePlaybook);
    }

    /**
     * 修改剧本
     *
     * 修改剧本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePlaybookRequest 请求对象
     * @return AsyncInvoker<UpdatePlaybookRequest, UpdatePlaybookResponse>
     */
    public AsyncInvoker<UpdatePlaybookRequest, UpdatePlaybookResponse> updatePlaybookAsyncInvoker(
        UpdatePlaybookRequest request) {
        return new AsyncInvoker<UpdatePlaybookRequest, UpdatePlaybookResponse>(request, SecMasterMeta.updatePlaybook,
            hcClient);
    }

    /**
     * 更新剧本动作
     *
     * 更新剧本动作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePlaybookActionRequest 请求对象
     * @return CompletableFuture<UpdatePlaybookActionResponse>
     */
    public CompletableFuture<UpdatePlaybookActionResponse> updatePlaybookActionAsync(
        UpdatePlaybookActionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updatePlaybookAction);
    }

    /**
     * 更新剧本动作
     *
     * 更新剧本动作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePlaybookActionRequest 请求对象
     * @return AsyncInvoker<UpdatePlaybookActionRequest, UpdatePlaybookActionResponse>
     */
    public AsyncInvoker<UpdatePlaybookActionRequest, UpdatePlaybookActionResponse> updatePlaybookActionAsyncInvoker(
        UpdatePlaybookActionRequest request) {
        return new AsyncInvoker<UpdatePlaybookActionRequest, UpdatePlaybookActionResponse>(request,
            SecMasterMeta.updatePlaybookAction, hcClient);
    }

    /**
     * 更新剧本规则
     *
     * 更新剧本规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePlaybookRuleRequest 请求对象
     * @return CompletableFuture<UpdatePlaybookRuleResponse>
     */
    public CompletableFuture<UpdatePlaybookRuleResponse> updatePlaybookRuleAsync(UpdatePlaybookRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updatePlaybookRule);
    }

    /**
     * 更新剧本规则
     *
     * 更新剧本规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePlaybookRuleRequest 请求对象
     * @return AsyncInvoker<UpdatePlaybookRuleRequest, UpdatePlaybookRuleResponse>
     */
    public AsyncInvoker<UpdatePlaybookRuleRequest, UpdatePlaybookRuleResponse> updatePlaybookRuleAsyncInvoker(
        UpdatePlaybookRuleRequest request) {
        return new AsyncInvoker<UpdatePlaybookRuleRequest, UpdatePlaybookRuleResponse>(request,
            SecMasterMeta.updatePlaybookRule, hcClient);
    }

    /**
     * 更新剧本版本
     *
     * 更新剧本版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePlaybookVersionRequest 请求对象
     * @return CompletableFuture<UpdatePlaybookVersionResponse>
     */
    public CompletableFuture<UpdatePlaybookVersionResponse> updatePlaybookVersionAsync(
        UpdatePlaybookVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updatePlaybookVersion);
    }

    /**
     * 更新剧本版本
     *
     * 更新剧本版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePlaybookVersionRequest 请求对象
     * @return AsyncInvoker<UpdatePlaybookVersionRequest, UpdatePlaybookVersionResponse>
     */
    public AsyncInvoker<UpdatePlaybookVersionRequest, UpdatePlaybookVersionResponse> updatePlaybookVersionAsyncInvoker(
        UpdatePlaybookVersionRequest request) {
        return new AsyncInvoker<UpdatePlaybookVersionRequest, UpdatePlaybookVersionResponse>(request,
            SecMasterMeta.updatePlaybookVersion, hcClient);
    }

}

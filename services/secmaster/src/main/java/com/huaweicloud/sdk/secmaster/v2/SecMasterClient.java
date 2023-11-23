package com.huaweicloud.sdk.secmaster.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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
import com.huaweicloud.sdk.secmaster.v2.model.CreateDataspaceRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateDataspaceResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateIncidentRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateIncidentResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateIndicatorRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateIndicatorResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreatePipeRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreatePipeResponse;
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
import com.huaweicloud.sdk.secmaster.v2.model.ListDataclassFieldsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListDataclassFieldsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListDataclassRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListDataclassResponse;
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
import com.huaweicloud.sdk.secmaster.v2.model.ListWorkflowsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListWorkflowsResponse;
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

public class SecMasterClient {

    protected HcClient hcClient;

    public SecMasterClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SecMasterClient> newBuilder() {
        ClientBuilder<SecMasterClient> clientBuilder = new ClientBuilder<>(SecMasterClient::new);
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
     * @return ChangeAlertResponse
     */
    public ChangeAlertResponse changeAlert(ChangeAlertRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.changeAlert);
    }

    /**
     * 更新告警
     *
     * 编辑告警，根据实际修改的属性更新，未修改的列不更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeAlertRequest 请求对象
     * @return SyncInvoker<ChangeAlertRequest, ChangeAlertResponse>
     */
    public SyncInvoker<ChangeAlertRequest, ChangeAlertResponse> changeAlertInvoker(ChangeAlertRequest request) {
        return new SyncInvoker<ChangeAlertRequest, ChangeAlertResponse>(request, SecMasterMeta.changeAlert, hcClient);
    }

    /**
     * 更新事件
     *
     * 编辑事件，根据实际修改的属性更新，未修改的列不更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeIncidentRequest 请求对象
     * @return ChangeIncidentResponse
     */
    public ChangeIncidentResponse changeIncident(ChangeIncidentRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.changeIncident);
    }

    /**
     * 更新事件
     *
     * 编辑事件，根据实际修改的属性更新，未修改的列不更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeIncidentRequest 请求对象
     * @return SyncInvoker<ChangeIncidentRequest, ChangeIncidentResponse>
     */
    public SyncInvoker<ChangeIncidentRequest, ChangeIncidentResponse> changeIncidentInvoker(
        ChangeIncidentRequest request) {
        return new SyncInvoker<ChangeIncidentRequest, ChangeIncidentResponse>(request, SecMasterMeta.changeIncident,
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
     * @return ChangePlaybookInstanceResponse
     */
    public ChangePlaybookInstanceResponse changePlaybookInstance(ChangePlaybookInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.changePlaybookInstance);
    }

    /**
     * 操作剧本实例
     *
     * 操作剧本实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangePlaybookInstanceRequest 请求对象
     * @return SyncInvoker<ChangePlaybookInstanceRequest, ChangePlaybookInstanceResponse>
     */
    public SyncInvoker<ChangePlaybookInstanceRequest, ChangePlaybookInstanceResponse> changePlaybookInstanceInvoker(
        ChangePlaybookInstanceRequest request) {
        return new SyncInvoker<ChangePlaybookInstanceRequest, ChangePlaybookInstanceResponse>(request,
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
     * @return CopyPlaybookVersionResponse
     */
    public CopyPlaybookVersionResponse copyPlaybookVersion(CopyPlaybookVersionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.copyPlaybookVersion);
    }

    /**
     * 克隆剧本及版本
     *
     * 克隆剧本及版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CopyPlaybookVersionRequest 请求对象
     * @return SyncInvoker<CopyPlaybookVersionRequest, CopyPlaybookVersionResponse>
     */
    public SyncInvoker<CopyPlaybookVersionRequest, CopyPlaybookVersionResponse> copyPlaybookVersionInvoker(
        CopyPlaybookVersionRequest request) {
        return new SyncInvoker<CopyPlaybookVersionRequest, CopyPlaybookVersionResponse>(request,
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
     * @return CreateAlertResponse
     */
    public CreateAlertResponse createAlert(CreateAlertRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createAlert);
    }

    /**
     * 创建告警
     *
     * 创建告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAlertRequest 请求对象
     * @return SyncInvoker<CreateAlertRequest, CreateAlertResponse>
     */
    public SyncInvoker<CreateAlertRequest, CreateAlertResponse> createAlertInvoker(CreateAlertRequest request) {
        return new SyncInvoker<CreateAlertRequest, CreateAlertResponse>(request, SecMasterMeta.createAlert, hcClient);
    }

    /**
     * 创建告警规则
     *
     * Create alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAlertRuleRequest 请求对象
     * @return CreateAlertRuleResponse
     */
    public CreateAlertRuleResponse createAlertRule(CreateAlertRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createAlertRule);
    }

    /**
     * 创建告警规则
     *
     * Create alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAlertRuleRequest 请求对象
     * @return SyncInvoker<CreateAlertRuleRequest, CreateAlertRuleResponse>
     */
    public SyncInvoker<CreateAlertRuleRequest, CreateAlertRuleResponse> createAlertRuleInvoker(
        CreateAlertRuleRequest request) {
        return new SyncInvoker<CreateAlertRuleRequest, CreateAlertRuleResponse>(request, SecMasterMeta.createAlertRule,
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
     * @return CreateAlertRuleSimulationResponse
     */
    public CreateAlertRuleSimulationResponse createAlertRuleSimulation(CreateAlertRuleSimulationRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createAlertRuleSimulation);
    }

    /**
     * 模拟告警规则
     *
     * Simulate alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAlertRuleSimulationRequest 请求对象
     * @return SyncInvoker<CreateAlertRuleSimulationRequest, CreateAlertRuleSimulationResponse>
     */
    public SyncInvoker<CreateAlertRuleSimulationRequest, CreateAlertRuleSimulationResponse> createAlertRuleSimulationInvoker(
        CreateAlertRuleSimulationRequest request) {
        return new SyncInvoker<CreateAlertRuleSimulationRequest, CreateAlertRuleSimulationResponse>(request,
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
     * @return CreateBatchOrderAlertsResponse
     */
    public CreateBatchOrderAlertsResponse createBatchOrderAlerts(CreateBatchOrderAlertsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createBatchOrderAlerts);
    }

    /**
     * 告警转事件
     *
     * 告警转事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateBatchOrderAlertsRequest 请求对象
     * @return SyncInvoker<CreateBatchOrderAlertsRequest, CreateBatchOrderAlertsResponse>
     */
    public SyncInvoker<CreateBatchOrderAlertsRequest, CreateBatchOrderAlertsResponse> createBatchOrderAlertsInvoker(
        CreateBatchOrderAlertsRequest request) {
        return new SyncInvoker<CreateBatchOrderAlertsRequest, CreateBatchOrderAlertsResponse>(request,
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
     * @return CreateDataobjectRelationsResponse
     */
    public CreateDataobjectRelationsResponse createDataobjectRelations(CreateDataobjectRelationsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createDataobjectRelations);
    }

    /**
     * 关联Dataobject
     *
     * 关联Dataobject
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDataobjectRelationsRequest 请求对象
     * @return SyncInvoker<CreateDataobjectRelationsRequest, CreateDataobjectRelationsResponse>
     */
    public SyncInvoker<CreateDataobjectRelationsRequest, CreateDataobjectRelationsResponse> createDataobjectRelationsInvoker(
        CreateDataobjectRelationsRequest request) {
        return new SyncInvoker<CreateDataobjectRelationsRequest, CreateDataobjectRelationsResponse>(request,
            SecMasterMeta.createDataobjectRelations, hcClient);
    }

    /**
     * create dataspace (创建数据空间)
     *
     * create dataspace
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDataspaceRequest 请求对象
     * @return CreateDataspaceResponse
     */
    public CreateDataspaceResponse createDataspace(CreateDataspaceRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createDataspace);
    }

    /**
     * create dataspace (创建数据空间)
     *
     * create dataspace
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDataspaceRequest 请求对象
     * @return SyncInvoker<CreateDataspaceRequest, CreateDataspaceResponse>
     */
    public SyncInvoker<CreateDataspaceRequest, CreateDataspaceResponse> createDataspaceInvoker(
        CreateDataspaceRequest request) {
        return new SyncInvoker<CreateDataspaceRequest, CreateDataspaceResponse>(request, SecMasterMeta.createDataspace,
            hcClient);
    }

    /**
     * 创建事件
     *
     * 创建事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateIncidentRequest 请求对象
     * @return CreateIncidentResponse
     */
    public CreateIncidentResponse createIncident(CreateIncidentRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createIncident);
    }

    /**
     * 创建事件
     *
     * 创建事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateIncidentRequest 请求对象
     * @return SyncInvoker<CreateIncidentRequest, CreateIncidentResponse>
     */
    public SyncInvoker<CreateIncidentRequest, CreateIncidentResponse> createIncidentInvoker(
        CreateIncidentRequest request) {
        return new SyncInvoker<CreateIncidentRequest, CreateIncidentResponse>(request, SecMasterMeta.createIncident,
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
     * @return CreateIndicatorResponse
     */
    public CreateIndicatorResponse createIndicator(CreateIndicatorRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createIndicator);
    }

    /**
     * 创建指标
     *
     * 创建指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateIndicatorRequest 请求对象
     * @return SyncInvoker<CreateIndicatorRequest, CreateIndicatorResponse>
     */
    public SyncInvoker<CreateIndicatorRequest, CreateIndicatorResponse> createIndicatorInvoker(
        CreateIndicatorRequest request) {
        return new SyncInvoker<CreateIndicatorRequest, CreateIndicatorResponse>(request, SecMasterMeta.createIndicator,
            hcClient);
    }

    /**
     * create pipe (创建数据管道)
     *
     * create pipe
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePipeRequest 请求对象
     * @return CreatePipeResponse
     */
    public CreatePipeResponse createPipe(CreatePipeRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createPipe);
    }

    /**
     * create pipe (创建数据管道)
     *
     * create pipe
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePipeRequest 请求对象
     * @return SyncInvoker<CreatePipeRequest, CreatePipeResponse>
     */
    public SyncInvoker<CreatePipeRequest, CreatePipeResponse> createPipeInvoker(CreatePipeRequest request) {
        return new SyncInvoker<CreatePipeRequest, CreatePipeResponse>(request, SecMasterMeta.createPipe, hcClient);
    }

    /**
     * 创建剧本
     *
     * 创建剧本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePlaybookRequest 请求对象
     * @return CreatePlaybookResponse
     */
    public CreatePlaybookResponse createPlaybook(CreatePlaybookRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createPlaybook);
    }

    /**
     * 创建剧本
     *
     * 创建剧本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePlaybookRequest 请求对象
     * @return SyncInvoker<CreatePlaybookRequest, CreatePlaybookResponse>
     */
    public SyncInvoker<CreatePlaybookRequest, CreatePlaybookResponse> createPlaybookInvoker(
        CreatePlaybookRequest request) {
        return new SyncInvoker<CreatePlaybookRequest, CreatePlaybookResponse>(request, SecMasterMeta.createPlaybook,
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
     * @return CreatePlaybookActionResponse
     */
    public CreatePlaybookActionResponse createPlaybookAction(CreatePlaybookActionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createPlaybookAction);
    }

    /**
     * 创建剧本动作
     *
     * 创建剧本动作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePlaybookActionRequest 请求对象
     * @return SyncInvoker<CreatePlaybookActionRequest, CreatePlaybookActionResponse>
     */
    public SyncInvoker<CreatePlaybookActionRequest, CreatePlaybookActionResponse> createPlaybookActionInvoker(
        CreatePlaybookActionRequest request) {
        return new SyncInvoker<CreatePlaybookActionRequest, CreatePlaybookActionResponse>(request,
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
     * @return CreatePlaybookApproveResponse
     */
    public CreatePlaybookApproveResponse createPlaybookApprove(CreatePlaybookApproveRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createPlaybookApprove);
    }

    /**
     * 审核剧本
     *
     * 审核剧本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePlaybookApproveRequest 请求对象
     * @return SyncInvoker<CreatePlaybookApproveRequest, CreatePlaybookApproveResponse>
     */
    public SyncInvoker<CreatePlaybookApproveRequest, CreatePlaybookApproveResponse> createPlaybookApproveInvoker(
        CreatePlaybookApproveRequest request) {
        return new SyncInvoker<CreatePlaybookApproveRequest, CreatePlaybookApproveResponse>(request,
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
     * @return CreatePlaybookRuleResponse
     */
    public CreatePlaybookRuleResponse createPlaybookRule(CreatePlaybookRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createPlaybookRule);
    }

    /**
     * 创建剧本规则
     *
     * 创建剧本规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePlaybookRuleRequest 请求对象
     * @return SyncInvoker<CreatePlaybookRuleRequest, CreatePlaybookRuleResponse>
     */
    public SyncInvoker<CreatePlaybookRuleRequest, CreatePlaybookRuleResponse> createPlaybookRuleInvoker(
        CreatePlaybookRuleRequest request) {
        return new SyncInvoker<CreatePlaybookRuleRequest, CreatePlaybookRuleResponse>(request,
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
     * @return CreatePlaybookVersionResponse
     */
    public CreatePlaybookVersionResponse createPlaybookVersion(CreatePlaybookVersionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createPlaybookVersion);
    }

    /**
     * 创建剧本版本
     *
     * 创建剧本版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePlaybookVersionRequest 请求对象
     * @return SyncInvoker<CreatePlaybookVersionRequest, CreatePlaybookVersionResponse>
     */
    public SyncInvoker<CreatePlaybookVersionRequest, CreatePlaybookVersionResponse> createPlaybookVersionInvoker(
        CreatePlaybookVersionRequest request) {
        return new SyncInvoker<CreatePlaybookVersionRequest, CreatePlaybookVersionResponse>(request,
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
     * @return DeleteAlertResponse
     */
    public DeleteAlertResponse deleteAlert(DeleteAlertRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteAlert);
    }

    /**
     * 删除告警
     *
     * 删除告警
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAlertRequest 请求对象
     * @return SyncInvoker<DeleteAlertRequest, DeleteAlertResponse>
     */
    public SyncInvoker<DeleteAlertRequest, DeleteAlertResponse> deleteAlertInvoker(DeleteAlertRequest request) {
        return new SyncInvoker<DeleteAlertRequest, DeleteAlertResponse>(request, SecMasterMeta.deleteAlert, hcClient);
    }

    /**
     * 删除告警规则
     *
     * Delete alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAlertRuleRequest 请求对象
     * @return DeleteAlertRuleResponse
     */
    public DeleteAlertRuleResponse deleteAlertRule(DeleteAlertRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteAlertRule);
    }

    /**
     * 删除告警规则
     *
     * Delete alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAlertRuleRequest 请求对象
     * @return SyncInvoker<DeleteAlertRuleRequest, DeleteAlertRuleResponse>
     */
    public SyncInvoker<DeleteAlertRuleRequest, DeleteAlertRuleResponse> deleteAlertRuleInvoker(
        DeleteAlertRuleRequest request) {
        return new SyncInvoker<DeleteAlertRuleRequest, DeleteAlertRuleResponse>(request, SecMasterMeta.deleteAlertRule,
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
     * @return DeleteDataobjectRelationsResponse
     */
    public DeleteDataobjectRelationsResponse deleteDataobjectRelations(DeleteDataobjectRelationsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteDataobjectRelations);
    }

    /**
     * 取消关联Dataobject
     *
     * 取消关联Dataobject
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDataobjectRelationsRequest 请求对象
     * @return SyncInvoker<DeleteDataobjectRelationsRequest, DeleteDataobjectRelationsResponse>
     */
    public SyncInvoker<DeleteDataobjectRelationsRequest, DeleteDataobjectRelationsResponse> deleteDataobjectRelationsInvoker(
        DeleteDataobjectRelationsRequest request) {
        return new SyncInvoker<DeleteDataobjectRelationsRequest, DeleteDataobjectRelationsResponse>(request,
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
     * @return DeleteIncidentResponse
     */
    public DeleteIncidentResponse deleteIncident(DeleteIncidentRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteIncident);
    }

    /**
     * 删除事件
     *
     * 删除事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteIncidentRequest 请求对象
     * @return SyncInvoker<DeleteIncidentRequest, DeleteIncidentResponse>
     */
    public SyncInvoker<DeleteIncidentRequest, DeleteIncidentResponse> deleteIncidentInvoker(
        DeleteIncidentRequest request) {
        return new SyncInvoker<DeleteIncidentRequest, DeleteIncidentResponse>(request, SecMasterMeta.deleteIncident,
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
     * @return DeleteIndicatorResponse
     */
    public DeleteIndicatorResponse deleteIndicator(DeleteIndicatorRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteIndicator);
    }

    /**
     * 删除指标
     *
     * 删除指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteIndicatorRequest 请求对象
     * @return SyncInvoker<DeleteIndicatorRequest, DeleteIndicatorResponse>
     */
    public SyncInvoker<DeleteIndicatorRequest, DeleteIndicatorResponse> deleteIndicatorInvoker(
        DeleteIndicatorRequest request) {
        return new SyncInvoker<DeleteIndicatorRequest, DeleteIndicatorResponse>(request, SecMasterMeta.deleteIndicator,
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
     * @return DeletePlaybookResponse
     */
    public DeletePlaybookResponse deletePlaybook(DeletePlaybookRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deletePlaybook);
    }

    /**
     * 删除剧本
     *
     * 删除剧本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePlaybookRequest 请求对象
     * @return SyncInvoker<DeletePlaybookRequest, DeletePlaybookResponse>
     */
    public SyncInvoker<DeletePlaybookRequest, DeletePlaybookResponse> deletePlaybookInvoker(
        DeletePlaybookRequest request) {
        return new SyncInvoker<DeletePlaybookRequest, DeletePlaybookResponse>(request, SecMasterMeta.deletePlaybook,
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
     * @return DeletePlaybookActionResponse
     */
    public DeletePlaybookActionResponse deletePlaybookAction(DeletePlaybookActionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deletePlaybookAction);
    }

    /**
     * 删除剧本动作
     *
     * 删除剧本动作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePlaybookActionRequest 请求对象
     * @return SyncInvoker<DeletePlaybookActionRequest, DeletePlaybookActionResponse>
     */
    public SyncInvoker<DeletePlaybookActionRequest, DeletePlaybookActionResponse> deletePlaybookActionInvoker(
        DeletePlaybookActionRequest request) {
        return new SyncInvoker<DeletePlaybookActionRequest, DeletePlaybookActionResponse>(request,
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
     * @return DeletePlaybookRuleResponse
     */
    public DeletePlaybookRuleResponse deletePlaybookRule(DeletePlaybookRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deletePlaybookRule);
    }

    /**
     * 删除剧本规则
     *
     * 删除剧本规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePlaybookRuleRequest 请求对象
     * @return SyncInvoker<DeletePlaybookRuleRequest, DeletePlaybookRuleResponse>
     */
    public SyncInvoker<DeletePlaybookRuleRequest, DeletePlaybookRuleResponse> deletePlaybookRuleInvoker(
        DeletePlaybookRuleRequest request) {
        return new SyncInvoker<DeletePlaybookRuleRequest, DeletePlaybookRuleResponse>(request,
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
     * @return DeletePlaybookVersionResponse
     */
    public DeletePlaybookVersionResponse deletePlaybookVersion(DeletePlaybookVersionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deletePlaybookVersion);
    }

    /**
     * 删除剧本版本
     *
     * 删除剧本版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePlaybookVersionRequest 请求对象
     * @return SyncInvoker<DeletePlaybookVersionRequest, DeletePlaybookVersionResponse>
     */
    public SyncInvoker<DeletePlaybookVersionRequest, DeletePlaybookVersionResponse> deletePlaybookVersionInvoker(
        DeletePlaybookVersionRequest request) {
        return new SyncInvoker<DeletePlaybookVersionRequest, DeletePlaybookVersionResponse>(request,
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
     * @return DisableAlertRuleResponse
     */
    public DisableAlertRuleResponse disableAlertRule(DisableAlertRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.disableAlertRule);
    }

    /**
     * 停用告警规则
     *
     * Disable alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisableAlertRuleRequest 请求对象
     * @return SyncInvoker<DisableAlertRuleRequest, DisableAlertRuleResponse>
     */
    public SyncInvoker<DisableAlertRuleRequest, DisableAlertRuleResponse> disableAlertRuleInvoker(
        DisableAlertRuleRequest request) {
        return new SyncInvoker<DisableAlertRuleRequest, DisableAlertRuleResponse>(request,
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
     * @return EnableAlertRuleResponse
     */
    public EnableAlertRuleResponse enableAlertRule(EnableAlertRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.enableAlertRule);
    }

    /**
     * 启用告警规则
     *
     * Enable alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnableAlertRuleRequest 请求对象
     * @return SyncInvoker<EnableAlertRuleRequest, EnableAlertRuleResponse>
     */
    public SyncInvoker<EnableAlertRuleRequest, EnableAlertRuleResponse> enableAlertRuleInvoker(
        EnableAlertRuleRequest request) {
        return new SyncInvoker<EnableAlertRuleRequest, EnableAlertRuleResponse>(request, SecMasterMeta.enableAlertRule,
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
     * @return ListAlertRuleMetricsResponse
     */
    public ListAlertRuleMetricsResponse listAlertRuleMetrics(ListAlertRuleMetricsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listAlertRuleMetrics);
    }

    /**
     * 告警规则总览
     *
     * List alert rule metrics
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlertRuleMetricsRequest 请求对象
     * @return SyncInvoker<ListAlertRuleMetricsRequest, ListAlertRuleMetricsResponse>
     */
    public SyncInvoker<ListAlertRuleMetricsRequest, ListAlertRuleMetricsResponse> listAlertRuleMetricsInvoker(
        ListAlertRuleMetricsRequest request) {
        return new SyncInvoker<ListAlertRuleMetricsRequest, ListAlertRuleMetricsResponse>(request,
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
     * @return ListAlertRuleTemplatesResponse
     */
    public ListAlertRuleTemplatesResponse listAlertRuleTemplates(ListAlertRuleTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listAlertRuleTemplates);
    }

    /**
     * 列出告警规则模板
     *
     * List alert rule templates
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlertRuleTemplatesRequest 请求对象
     * @return SyncInvoker<ListAlertRuleTemplatesRequest, ListAlertRuleTemplatesResponse>
     */
    public SyncInvoker<ListAlertRuleTemplatesRequest, ListAlertRuleTemplatesResponse> listAlertRuleTemplatesInvoker(
        ListAlertRuleTemplatesRequest request) {
        return new SyncInvoker<ListAlertRuleTemplatesRequest, ListAlertRuleTemplatesResponse>(request,
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
     * @return ListAlertRulesResponse
     */
    public ListAlertRulesResponse listAlertRules(ListAlertRulesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listAlertRules);
    }

    /**
     * 列出告警规则
     *
     * List alert rules
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlertRulesRequest 请求对象
     * @return SyncInvoker<ListAlertRulesRequest, ListAlertRulesResponse>
     */
    public SyncInvoker<ListAlertRulesRequest, ListAlertRulesResponse> listAlertRulesInvoker(
        ListAlertRulesRequest request) {
        return new SyncInvoker<ListAlertRulesRequest, ListAlertRulesResponse>(request, SecMasterMeta.listAlertRules,
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
     * @return ListAlertsResponse
     */
    public ListAlertsResponse listAlerts(ListAlertsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listAlerts);
    }

    /**
     * 搜索告警列表
     *
     * 搜索告警列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAlertsRequest 请求对象
     * @return SyncInvoker<ListAlertsRequest, ListAlertsResponse>
     */
    public SyncInvoker<ListAlertsRequest, ListAlertsResponse> listAlertsInvoker(ListAlertsRequest request) {
        return new SyncInvoker<ListAlertsRequest, ListAlertsResponse>(request, SecMasterMeta.listAlerts, hcClient);
    }

    /**
     * 查询数据类列表
     *
     * 查询数据类列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDataclassRequest 请求对象
     * @return ListDataclassResponse
     */
    public ListDataclassResponse listDataclass(ListDataclassRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listDataclass);
    }

    /**
     * 查询数据类列表
     *
     * 查询数据类列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDataclassRequest 请求对象
     * @return SyncInvoker<ListDataclassRequest, ListDataclassResponse>
     */
    public SyncInvoker<ListDataclassRequest, ListDataclassResponse> listDataclassInvoker(ListDataclassRequest request) {
        return new SyncInvoker<ListDataclassRequest, ListDataclassResponse>(request, SecMasterMeta.listDataclass,
            hcClient);
    }

    /**
     * 查询字段列表
     *
     * 查询字段列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDataclassFieldsRequest 请求对象
     * @return ListDataclassFieldsResponse
     */
    public ListDataclassFieldsResponse listDataclassFields(ListDataclassFieldsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listDataclassFields);
    }

    /**
     * 查询字段列表
     *
     * 查询字段列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDataclassFieldsRequest 请求对象
     * @return SyncInvoker<ListDataclassFieldsRequest, ListDataclassFieldsResponse>
     */
    public SyncInvoker<ListDataclassFieldsRequest, ListDataclassFieldsResponse> listDataclassFieldsInvoker(
        ListDataclassFieldsRequest request) {
        return new SyncInvoker<ListDataclassFieldsRequest, ListDataclassFieldsResponse>(request,
            SecMasterMeta.listDataclassFields, hcClient);
    }

    /**
     * 查询关联Dataobject列表
     *
     * 查询关联Dataobject列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDataobjectRelationsRequest 请求对象
     * @return ListDataobjectRelationsResponse
     */
    public ListDataobjectRelationsResponse listDataobjectRelations(ListDataobjectRelationsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listDataobjectRelations);
    }

    /**
     * 查询关联Dataobject列表
     *
     * 查询关联Dataobject列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDataobjectRelationsRequest 请求对象
     * @return SyncInvoker<ListDataobjectRelationsRequest, ListDataobjectRelationsResponse>
     */
    public SyncInvoker<ListDataobjectRelationsRequest, ListDataobjectRelationsResponse> listDataobjectRelationsInvoker(
        ListDataobjectRelationsRequest request) {
        return new SyncInvoker<ListDataobjectRelationsRequest, ListDataobjectRelationsResponse>(request,
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
     * @return ListIncidentsResponse
     */
    public ListIncidentsResponse listIncidents(ListIncidentsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listIncidents);
    }

    /**
     * 搜索事件列表
     *
     * 搜索事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIncidentsRequest 请求对象
     * @return SyncInvoker<ListIncidentsRequest, ListIncidentsResponse>
     */
    public SyncInvoker<ListIncidentsRequest, ListIncidentsResponse> listIncidentsInvoker(ListIncidentsRequest request) {
        return new SyncInvoker<ListIncidentsRequest, ListIncidentsResponse>(request, SecMasterMeta.listIncidents,
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
     * @return ListIndicatorsResponse
     */
    public ListIndicatorsResponse listIndicators(ListIndicatorsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listIndicators);
    }

    /**
     * 查询指标列表
     *
     * 查询指标列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIndicatorsRequest 请求对象
     * @return SyncInvoker<ListIndicatorsRequest, ListIndicatorsResponse>
     */
    public SyncInvoker<ListIndicatorsRequest, ListIndicatorsResponse> listIndicatorsInvoker(
        ListIndicatorsRequest request) {
        return new SyncInvoker<ListIndicatorsRequest, ListIndicatorsResponse>(request, SecMasterMeta.listIndicators,
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
     * @return ListPlaybookActionsResponse
     */
    public ListPlaybookActionsResponse listPlaybookActions(ListPlaybookActionsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listPlaybookActions);
    }

    /**
     * 查询剧本动作
     *
     * 查询剧本动作列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPlaybookActionsRequest 请求对象
     * @return SyncInvoker<ListPlaybookActionsRequest, ListPlaybookActionsResponse>
     */
    public SyncInvoker<ListPlaybookActionsRequest, ListPlaybookActionsResponse> listPlaybookActionsInvoker(
        ListPlaybookActionsRequest request) {
        return new SyncInvoker<ListPlaybookActionsRequest, ListPlaybookActionsResponse>(request,
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
     * @return ListPlaybookApprovesResponse
     */
    public ListPlaybookApprovesResponse listPlaybookApproves(ListPlaybookApprovesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listPlaybookApproves);
    }

    /**
     * 查询剧本审核结果
     *
     * 查询剧本审核结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPlaybookApprovesRequest 请求对象
     * @return SyncInvoker<ListPlaybookApprovesRequest, ListPlaybookApprovesResponse>
     */
    public SyncInvoker<ListPlaybookApprovesRequest, ListPlaybookApprovesResponse> listPlaybookApprovesInvoker(
        ListPlaybookApprovesRequest request) {
        return new SyncInvoker<ListPlaybookApprovesRequest, ListPlaybookApprovesResponse>(request,
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
     * @return ListPlaybookAuditLogsResponse
     */
    public ListPlaybookAuditLogsResponse listPlaybookAuditLogs(ListPlaybookAuditLogsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listPlaybookAuditLogs);
    }

    /**
     * 查询剧本实例审计日志
     *
     * 查询剧本实例审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPlaybookAuditLogsRequest 请求对象
     * @return SyncInvoker<ListPlaybookAuditLogsRequest, ListPlaybookAuditLogsResponse>
     */
    public SyncInvoker<ListPlaybookAuditLogsRequest, ListPlaybookAuditLogsResponse> listPlaybookAuditLogsInvoker(
        ListPlaybookAuditLogsRequest request) {
        return new SyncInvoker<ListPlaybookAuditLogsRequest, ListPlaybookAuditLogsResponse>(request,
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
     * @return ListPlaybookInstancesResponse
     */
    public ListPlaybookInstancesResponse listPlaybookInstances(ListPlaybookInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listPlaybookInstances);
    }

    /**
     * 查询剧本实例列表
     *
     * 查询剧本实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPlaybookInstancesRequest 请求对象
     * @return SyncInvoker<ListPlaybookInstancesRequest, ListPlaybookInstancesResponse>
     */
    public SyncInvoker<ListPlaybookInstancesRequest, ListPlaybookInstancesResponse> listPlaybookInstancesInvoker(
        ListPlaybookInstancesRequest request) {
        return new SyncInvoker<ListPlaybookInstancesRequest, ListPlaybookInstancesResponse>(request,
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
     * @return ListPlaybookVersionsResponse
     */
    public ListPlaybookVersionsResponse listPlaybookVersions(ListPlaybookVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listPlaybookVersions);
    }

    /**
     * 查询剧本版本列表
     *
     * 查询剧本版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPlaybookVersionsRequest 请求对象
     * @return SyncInvoker<ListPlaybookVersionsRequest, ListPlaybookVersionsResponse>
     */
    public SyncInvoker<ListPlaybookVersionsRequest, ListPlaybookVersionsResponse> listPlaybookVersionsInvoker(
        ListPlaybookVersionsRequest request) {
        return new SyncInvoker<ListPlaybookVersionsRequest, ListPlaybookVersionsResponse>(request,
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
     * @return ListPlaybooksResponse
     */
    public ListPlaybooksResponse listPlaybooks(ListPlaybooksRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listPlaybooks);
    }

    /**
     * 查询剧本列表
     *
     * 查询剧本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPlaybooksRequest 请求对象
     * @return SyncInvoker<ListPlaybooksRequest, ListPlaybooksResponse>
     */
    public SyncInvoker<ListPlaybooksRequest, ListPlaybooksResponse> listPlaybooksInvoker(ListPlaybooksRequest request) {
        return new SyncInvoker<ListPlaybooksRequest, ListPlaybooksResponse>(request, SecMasterMeta.listPlaybooks,
            hcClient);
    }

    /**
     * 查询流程列表
     *
     * 查询流程列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkflowsRequest 请求对象
     * @return ListWorkflowsResponse
     */
    public ListWorkflowsResponse listWorkflows(ListWorkflowsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listWorkflows);
    }

    /**
     * 查询流程列表
     *
     * 查询流程列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkflowsRequest 请求对象
     * @return SyncInvoker<ListWorkflowsRequest, ListWorkflowsResponse>
     */
    public SyncInvoker<ListWorkflowsRequest, ListWorkflowsResponse> listWorkflowsInvoker(ListWorkflowsRequest request) {
        return new SyncInvoker<ListWorkflowsRequest, ListWorkflowsResponse>(request, SecMasterMeta.listWorkflows,
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
     * @return ShowAlertResponse
     */
    public ShowAlertResponse showAlert(ShowAlertRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showAlert);
    }

    /**
     * 获取告警详情
     *
     * 获取告警详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAlertRequest 请求对象
     * @return SyncInvoker<ShowAlertRequest, ShowAlertResponse>
     */
    public SyncInvoker<ShowAlertRequest, ShowAlertResponse> showAlertInvoker(ShowAlertRequest request) {
        return new SyncInvoker<ShowAlertRequest, ShowAlertResponse>(request, SecMasterMeta.showAlert, hcClient);
    }

    /**
     * 查看告警规则
     *
     * 查看告警规则 Get alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAlertRuleRequest 请求对象
     * @return ShowAlertRuleResponse
     */
    public ShowAlertRuleResponse showAlertRule(ShowAlertRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showAlertRule);
    }

    /**
     * 查看告警规则
     *
     * 查看告警规则 Get alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAlertRuleRequest 请求对象
     * @return SyncInvoker<ShowAlertRuleRequest, ShowAlertRuleResponse>
     */
    public SyncInvoker<ShowAlertRuleRequest, ShowAlertRuleResponse> showAlertRuleInvoker(ShowAlertRuleRequest request) {
        return new SyncInvoker<ShowAlertRuleRequest, ShowAlertRuleResponse>(request, SecMasterMeta.showAlertRule,
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
     * @return ShowAlertRuleTemplateResponse
     */
    public ShowAlertRuleTemplateResponse showAlertRuleTemplate(ShowAlertRuleTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showAlertRuleTemplate);
    }

    /**
     * 查看告警规则模板
     *
     * List alert rule templates
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAlertRuleTemplateRequest 请求对象
     * @return SyncInvoker<ShowAlertRuleTemplateRequest, ShowAlertRuleTemplateResponse>
     */
    public SyncInvoker<ShowAlertRuleTemplateRequest, ShowAlertRuleTemplateResponse> showAlertRuleTemplateInvoker(
        ShowAlertRuleTemplateRequest request) {
        return new SyncInvoker<ShowAlertRuleTemplateRequest, ShowAlertRuleTemplateResponse>(request,
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
     * @return ShowIncidentResponse
     */
    public ShowIncidentResponse showIncident(ShowIncidentRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showIncident);
    }

    /**
     * 获取事件详情
     *
     * 获取事件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIncidentRequest 请求对象
     * @return SyncInvoker<ShowIncidentRequest, ShowIncidentResponse>
     */
    public SyncInvoker<ShowIncidentRequest, ShowIncidentResponse> showIncidentInvoker(ShowIncidentRequest request) {
        return new SyncInvoker<ShowIncidentRequest, ShowIncidentResponse>(request, SecMasterMeta.showIncident,
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
     * @return ShowIndicatorDetailResponse
     */
    public ShowIndicatorDetailResponse showIndicatorDetail(ShowIndicatorDetailRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showIndicatorDetail);
    }

    /**
     * 查询指标详情
     *
     * 查询指标详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIndicatorDetailRequest 请求对象
     * @return SyncInvoker<ShowIndicatorDetailRequest, ShowIndicatorDetailResponse>
     */
    public SyncInvoker<ShowIndicatorDetailRequest, ShowIndicatorDetailResponse> showIndicatorDetailInvoker(
        ShowIndicatorDetailRequest request) {
        return new SyncInvoker<ShowIndicatorDetailRequest, ShowIndicatorDetailResponse>(request,
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
     * @return ShowPlaybookResponse
     */
    public ShowPlaybookResponse showPlaybook(ShowPlaybookRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showPlaybook);
    }

    /**
     * 查询剧本详情
     *
     * 查询剧本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlaybookRequest 请求对象
     * @return SyncInvoker<ShowPlaybookRequest, ShowPlaybookResponse>
     */
    public SyncInvoker<ShowPlaybookRequest, ShowPlaybookResponse> showPlaybookInvoker(ShowPlaybookRequest request) {
        return new SyncInvoker<ShowPlaybookRequest, ShowPlaybookResponse>(request, SecMasterMeta.showPlaybook,
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
     * @return ShowPlaybookInstanceResponse
     */
    public ShowPlaybookInstanceResponse showPlaybookInstance(ShowPlaybookInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showPlaybookInstance);
    }

    /**
     * 查询剧本实例详情
     *
     * Show playbook instance
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlaybookInstanceRequest 请求对象
     * @return SyncInvoker<ShowPlaybookInstanceRequest, ShowPlaybookInstanceResponse>
     */
    public SyncInvoker<ShowPlaybookInstanceRequest, ShowPlaybookInstanceResponse> showPlaybookInstanceInvoker(
        ShowPlaybookInstanceRequest request) {
        return new SyncInvoker<ShowPlaybookInstanceRequest, ShowPlaybookInstanceResponse>(request,
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
     * @return ShowPlaybookMonitorsResponse
     */
    public ShowPlaybookMonitorsResponse showPlaybookMonitors(ShowPlaybookMonitorsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showPlaybookMonitors);
    }

    /**
     * 剧本运行监控
     *
     * 剧本运行监控
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlaybookMonitorsRequest 请求对象
     * @return SyncInvoker<ShowPlaybookMonitorsRequest, ShowPlaybookMonitorsResponse>
     */
    public SyncInvoker<ShowPlaybookMonitorsRequest, ShowPlaybookMonitorsResponse> showPlaybookMonitorsInvoker(
        ShowPlaybookMonitorsRequest request) {
        return new SyncInvoker<ShowPlaybookMonitorsRequest, ShowPlaybookMonitorsResponse>(request,
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
     * @return ShowPlaybookRuleResponse
     */
    public ShowPlaybookRuleResponse showPlaybookRule(ShowPlaybookRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showPlaybookRule);
    }

    /**
     * 查询剧本规则详情
     *
     * 查询剧本规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlaybookRuleRequest 请求对象
     * @return SyncInvoker<ShowPlaybookRuleRequest, ShowPlaybookRuleResponse>
     */
    public SyncInvoker<ShowPlaybookRuleRequest, ShowPlaybookRuleResponse> showPlaybookRuleInvoker(
        ShowPlaybookRuleRequest request) {
        return new SyncInvoker<ShowPlaybookRuleRequest, ShowPlaybookRuleResponse>(request,
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
     * @return ShowPlaybookStatisticsResponse
     */
    public ShowPlaybookStatisticsResponse showPlaybookStatistics(ShowPlaybookStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showPlaybookStatistics);
    }

    /**
     * 剧本数据统计
     *
     * 剧本统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlaybookStatisticsRequest 请求对象
     * @return SyncInvoker<ShowPlaybookStatisticsRequest, ShowPlaybookStatisticsResponse>
     */
    public SyncInvoker<ShowPlaybookStatisticsRequest, ShowPlaybookStatisticsResponse> showPlaybookStatisticsInvoker(
        ShowPlaybookStatisticsRequest request) {
        return new SyncInvoker<ShowPlaybookStatisticsRequest, ShowPlaybookStatisticsResponse>(request,
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
     * @return ShowPlaybookTopologyResponse
     */
    public ShowPlaybookTopologyResponse showPlaybookTopology(ShowPlaybookTopologyRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showPlaybookTopology);
    }

    /**
     * 查询剧本拓扑关系
     *
     * 查询剧本拓扑关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlaybookTopologyRequest 请求对象
     * @return SyncInvoker<ShowPlaybookTopologyRequest, ShowPlaybookTopologyResponse>
     */
    public SyncInvoker<ShowPlaybookTopologyRequest, ShowPlaybookTopologyResponse> showPlaybookTopologyInvoker(
        ShowPlaybookTopologyRequest request) {
        return new SyncInvoker<ShowPlaybookTopologyRequest, ShowPlaybookTopologyResponse>(request,
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
     * @return ShowPlaybookVersionResponse
     */
    public ShowPlaybookVersionResponse showPlaybookVersion(ShowPlaybookVersionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showPlaybookVersion);
    }

    /**
     * 查询剧本版本详情
     *
     * Show playbook version version
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPlaybookVersionRequest 请求对象
     * @return SyncInvoker<ShowPlaybookVersionRequest, ShowPlaybookVersionResponse>
     */
    public SyncInvoker<ShowPlaybookVersionRequest, ShowPlaybookVersionResponse> showPlaybookVersionInvoker(
        ShowPlaybookVersionRequest request) {
        return new SyncInvoker<ShowPlaybookVersionRequest, ShowPlaybookVersionResponse>(request,
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
     * @return UpdateAlertRuleResponse
     */
    public UpdateAlertRuleResponse updateAlertRule(UpdateAlertRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateAlertRule);
    }

    /**
     * 更新告警规则
     *
     * Update alert rule
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAlertRuleRequest 请求对象
     * @return SyncInvoker<UpdateAlertRuleRequest, UpdateAlertRuleResponse>
     */
    public SyncInvoker<UpdateAlertRuleRequest, UpdateAlertRuleResponse> updateAlertRuleInvoker(
        UpdateAlertRuleRequest request) {
        return new SyncInvoker<UpdateAlertRuleRequest, UpdateAlertRuleResponse>(request, SecMasterMeta.updateAlertRule,
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
     * @return UpdateIndicatorResponse
     */
    public UpdateIndicatorResponse updateIndicator(UpdateIndicatorRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateIndicator);
    }

    /**
     * 更新指标
     *
     * 更新指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateIndicatorRequest 请求对象
     * @return SyncInvoker<UpdateIndicatorRequest, UpdateIndicatorResponse>
     */
    public SyncInvoker<UpdateIndicatorRequest, UpdateIndicatorResponse> updateIndicatorInvoker(
        UpdateIndicatorRequest request) {
        return new SyncInvoker<UpdateIndicatorRequest, UpdateIndicatorResponse>(request, SecMasterMeta.updateIndicator,
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
     * @return UpdatePlaybookResponse
     */
    public UpdatePlaybookResponse updatePlaybook(UpdatePlaybookRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updatePlaybook);
    }

    /**
     * 修改剧本
     *
     * 修改剧本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePlaybookRequest 请求对象
     * @return SyncInvoker<UpdatePlaybookRequest, UpdatePlaybookResponse>
     */
    public SyncInvoker<UpdatePlaybookRequest, UpdatePlaybookResponse> updatePlaybookInvoker(
        UpdatePlaybookRequest request) {
        return new SyncInvoker<UpdatePlaybookRequest, UpdatePlaybookResponse>(request, SecMasterMeta.updatePlaybook,
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
     * @return UpdatePlaybookActionResponse
     */
    public UpdatePlaybookActionResponse updatePlaybookAction(UpdatePlaybookActionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updatePlaybookAction);
    }

    /**
     * 更新剧本动作
     *
     * 更新剧本动作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePlaybookActionRequest 请求对象
     * @return SyncInvoker<UpdatePlaybookActionRequest, UpdatePlaybookActionResponse>
     */
    public SyncInvoker<UpdatePlaybookActionRequest, UpdatePlaybookActionResponse> updatePlaybookActionInvoker(
        UpdatePlaybookActionRequest request) {
        return new SyncInvoker<UpdatePlaybookActionRequest, UpdatePlaybookActionResponse>(request,
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
     * @return UpdatePlaybookRuleResponse
     */
    public UpdatePlaybookRuleResponse updatePlaybookRule(UpdatePlaybookRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updatePlaybookRule);
    }

    /**
     * 更新剧本规则
     *
     * 更新剧本规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePlaybookRuleRequest 请求对象
     * @return SyncInvoker<UpdatePlaybookRuleRequest, UpdatePlaybookRuleResponse>
     */
    public SyncInvoker<UpdatePlaybookRuleRequest, UpdatePlaybookRuleResponse> updatePlaybookRuleInvoker(
        UpdatePlaybookRuleRequest request) {
        return new SyncInvoker<UpdatePlaybookRuleRequest, UpdatePlaybookRuleResponse>(request,
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
     * @return UpdatePlaybookVersionResponse
     */
    public UpdatePlaybookVersionResponse updatePlaybookVersion(UpdatePlaybookVersionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updatePlaybookVersion);
    }

    /**
     * 更新剧本版本
     *
     * 更新剧本版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePlaybookVersionRequest 请求对象
     * @return SyncInvoker<UpdatePlaybookVersionRequest, UpdatePlaybookVersionResponse>
     */
    public SyncInvoker<UpdatePlaybookVersionRequest, UpdatePlaybookVersionResponse> updatePlaybookVersionInvoker(
        UpdatePlaybookVersionRequest request) {
        return new SyncInvoker<UpdatePlaybookVersionRequest, UpdatePlaybookVersionResponse>(request,
            SecMasterMeta.updatePlaybookVersion, hcClient);
    }

}

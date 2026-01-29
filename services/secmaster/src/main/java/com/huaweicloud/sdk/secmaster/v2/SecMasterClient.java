package com.huaweicloud.sdk.secmaster.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.secmaster.v2.model.CreateAdhocQueryRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateAdhocQueryResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateAlertRuleRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateAlertRuleResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateAnalysisScriptRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateAnalysisScriptResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateCodeSegmentRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateCodeSegmentResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateCollectConfigRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateCollectConfigResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateCustomizedCheckitemRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateCustomizedCheckitemResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateCustomizedCompliancePackageRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateCustomizedCompliancePackageResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateDataTransformationRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateDataTransformationResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateLayoutFieldRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateLayoutFieldResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreatePipeRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreatePipeResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateRetrieveScriptRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateRetrieveScriptResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateSqlRenderRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateSqlRenderResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateSqlValidationRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateSqlValidationResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateTableAnalysisRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateTableAnalysisResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateTableRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateTableResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteAdhocQueryRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteAdhocQueryResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteAlertRuleRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteAlertRuleResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteAnalysisScriptRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteAnalysisScriptResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteCodeSegmentRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteCodeSegmentResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteCustomizedCheckitemsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteCustomizedCheckitemsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteCustomizedCompliancePackagesRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteCustomizedCompliancePackagesResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteDataTransformationRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteDataTransformationResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteLayoutFieldRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteLayoutFieldResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeletePipeRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeletePipeResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteRetrieveScriptRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteRetrieveScriptResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteTableRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteTableResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DisableAlertRuleRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DisableAlertRuleResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DisableDataConsumptionRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DisableDataConsumptionResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DisableDataTransformationRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DisableDataTransformationResponse;
import com.huaweicloud.sdk.secmaster.v2.model.EnableAlertRuleRequest;
import com.huaweicloud.sdk.secmaster.v2.model.EnableAlertRuleResponse;
import com.huaweicloud.sdk.secmaster.v2.model.EnableDataConsumptionRequest;
import com.huaweicloud.sdk.secmaster.v2.model.EnableDataConsumptionResponse;
import com.huaweicloud.sdk.secmaster.v2.model.EnableDataTransformationRequest;
import com.huaweicloud.sdk.secmaster.v2.model.EnableDataTransformationResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListAlertRuleMetricsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListAlertRuleMetricsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListAlertRuleTemplateMetricsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListAlertRuleTemplateMetricsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListAlertRuleTemplatesRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListAlertRuleTemplatesResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListAlertRulesRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListAlertRulesResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListAnalysisScriptsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListAnalysisScriptsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListCodeSegmentsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListCodeSegmentsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListCollectConfigRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListCollectConfigResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListDataTransformationMetricsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListDataTransformationMetricsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListDataTransformationsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListDataTransformationsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListDirectoriesRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListDirectoriesResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListLayoutFieldAllRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListLayoutFieldAllResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListPipesRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListPipesResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListRetrieveScriptsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListRetrieveScriptsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListTableHistogramsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListTableHistogramsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListTableLogsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListTableLogsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListTablesRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListTablesResponse;
import com.huaweicloud.sdk.secmaster.v2.model.SearchBaselineRequest;
import com.huaweicloud.sdk.secmaster.v2.model.SearchBaselineResponse;
import com.huaweicloud.sdk.secmaster.v2.model.SearchCheckitemsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.SearchCheckitemsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.SearchCompliancePackagesRequest;
import com.huaweicloud.sdk.secmaster.v2.model.SearchCompliancePackagesResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowAdhocResultRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowAdhocResultResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowAlertRuleRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowAlertRuleResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowAlertRuleTemplateRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowAlertRuleTemplateResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowAnalysisScriptRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowAnalysisScriptResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowCheckitemDetailRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowCheckitemDetailResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowCodeSegmentRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowCodeSegmentResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowCompliancePackageDetailRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowCompliancePackageDetailResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowDataConsumptionRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowDataConsumptionResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowDataTransformationRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowDataTransformationResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowLayoutFieldInfoRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowLayoutFieldInfoResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowMonitorStatsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowMonitorStatsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowPipeRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowPipeResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowRetrieveScriptRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowRetrieveScriptResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowSubscriptionResourcesRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowSubscriptionResourcesResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowTableRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowTableResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowVersionRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowVersionResponse;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateAlertRuleRequest;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateAlertRuleResponse;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateAnalysisScriptRequest;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateAnalysisScriptResponse;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateCheckitemRequest;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateCheckitemResponse;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateCodeSegmentRequest;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateCodeSegmentResponse;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateCompliancePackageRequest;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateCompliancePackageResponse;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateDataTransformationRequest;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateDataTransformationResponse;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateLayoutFieldRequest;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateLayoutFieldResponse;
import com.huaweicloud.sdk.secmaster.v2.model.UpdatePipeRequest;
import com.huaweicloud.sdk.secmaster.v2.model.UpdatePipeResponse;
import com.huaweicloud.sdk.secmaster.v2.model.UpdatePipeSchemaRequest;
import com.huaweicloud.sdk.secmaster.v2.model.UpdatePipeSchemaResponse;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateRetrieveScriptRequest;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateRetrieveScriptResponse;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateTableRequest;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateTableResponse;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateTableSchemaRequest;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateTableSchemaResponse;

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
     * 创建adhoc查询
     *
     * 创建adhoc查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAdhocQueryRequest 请求对象
     * @return CreateAdhocQueryResponse
     */
    public CreateAdhocQueryResponse createAdhocQuery(CreateAdhocQueryRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createAdhocQuery);
    }

    /**
     * 创建adhoc查询
     *
     * 创建adhoc查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAdhocQueryRequest 请求对象
     * @return SyncInvoker<CreateAdhocQueryRequest, CreateAdhocQueryResponse>
     */
    public SyncInvoker<CreateAdhocQueryRequest, CreateAdhocQueryResponse> createAdhocQueryInvoker(
        CreateAdhocQueryRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createAdhocQuery, hcClient);
    }

    /**
     * 创建告警规则
     *
     * 创建告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlertRuleRequest 请求对象
     * @return CreateAlertRuleResponse
     */
    public CreateAlertRuleResponse createAlertRule(CreateAlertRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createAlertRule);
    }

    /**
     * 创建告警规则
     *
     * 创建告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlertRuleRequest 请求对象
     * @return SyncInvoker<CreateAlertRuleRequest, CreateAlertRuleResponse>
     */
    public SyncInvoker<CreateAlertRuleRequest, CreateAlertRuleResponse> createAlertRuleInvoker(
        CreateAlertRuleRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createAlertRule, hcClient);
    }

    /**
     * 创建分析脚本
     *
     * 创建分析脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAnalysisScriptRequest 请求对象
     * @return CreateAnalysisScriptResponse
     */
    public CreateAnalysisScriptResponse createAnalysisScript(CreateAnalysisScriptRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createAnalysisScript);
    }

    /**
     * 创建分析脚本
     *
     * 创建分析脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAnalysisScriptRequest 请求对象
     * @return SyncInvoker<CreateAnalysisScriptRequest, CreateAnalysisScriptResponse>
     */
    public SyncInvoker<CreateAnalysisScriptRequest, CreateAnalysisScriptResponse> createAnalysisScriptInvoker(
        CreateAnalysisScriptRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createAnalysisScript, hcClient);
    }

    /**
     * 创建代码片段
     *
     * 创建代码片段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCodeSegmentRequest 请求对象
     * @return CreateCodeSegmentResponse
     */
    public CreateCodeSegmentResponse createCodeSegment(CreateCodeSegmentRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createCodeSegment);
    }

    /**
     * 创建代码片段
     *
     * 创建代码片段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCodeSegmentRequest 请求对象
     * @return SyncInvoker<CreateCodeSegmentRequest, CreateCodeSegmentResponse>
     */
    public SyncInvoker<CreateCodeSegmentRequest, CreateCodeSegmentResponse> createCodeSegmentInvoker(
        CreateCodeSegmentRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createCodeSegment, hcClient);
    }

    /**
     * 保存云服务采集配置
     *
     * 保存云服务采集配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCollectConfigRequest 请求对象
     * @return CreateCollectConfigResponse
     */
    public CreateCollectConfigResponse createCollectConfig(CreateCollectConfigRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createCollectConfig);
    }

    /**
     * 保存云服务采集配置
     *
     * 保存云服务采集配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCollectConfigRequest 请求对象
     * @return SyncInvoker<CreateCollectConfigRequest, CreateCollectConfigResponse>
     */
    public SyncInvoker<CreateCollectConfigRequest, CreateCollectConfigResponse> createCollectConfigInvoker(
        CreateCollectConfigRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createCollectConfig, hcClient);
    }

    /**
     * 新增自定义检查项
     *
     * 新增自定义检查项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCustomizedCheckitemRequest 请求对象
     * @return CreateCustomizedCheckitemResponse
     */
    public CreateCustomizedCheckitemResponse createCustomizedCheckitem(CreateCustomizedCheckitemRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createCustomizedCheckitem);
    }

    /**
     * 新增自定义检查项
     *
     * 新增自定义检查项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCustomizedCheckitemRequest 请求对象
     * @return SyncInvoker<CreateCustomizedCheckitemRequest, CreateCustomizedCheckitemResponse>
     */
    public SyncInvoker<CreateCustomizedCheckitemRequest, CreateCustomizedCheckitemResponse> createCustomizedCheckitemInvoker(
        CreateCustomizedCheckitemRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createCustomizedCheckitem, hcClient);
    }

    /**
     * 新增自定义遵从包
     *
     * 新增自定义遵从包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCustomizedCompliancePackageRequest 请求对象
     * @return CreateCustomizedCompliancePackageResponse
     */
    public CreateCustomizedCompliancePackageResponse createCustomizedCompliancePackage(
        CreateCustomizedCompliancePackageRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createCustomizedCompliancePackage);
    }

    /**
     * 新增自定义遵从包
     *
     * 新增自定义遵从包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCustomizedCompliancePackageRequest 请求对象
     * @return SyncInvoker<CreateCustomizedCompliancePackageRequest, CreateCustomizedCompliancePackageResponse>
     */
    public SyncInvoker<CreateCustomizedCompliancePackageRequest, CreateCustomizedCompliancePackageResponse> createCustomizedCompliancePackageInvoker(
        CreateCustomizedCompliancePackageRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createCustomizedCompliancePackage, hcClient);
    }

    /**
     * 创建数据加工
     *
     * 创建数据加工
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataTransformationRequest 请求对象
     * @return CreateDataTransformationResponse
     */
    public CreateDataTransformationResponse createDataTransformation(CreateDataTransformationRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createDataTransformation);
    }

    /**
     * 创建数据加工
     *
     * 创建数据加工
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataTransformationRequest 请求对象
     * @return SyncInvoker<CreateDataTransformationRequest, CreateDataTransformationResponse>
     */
    public SyncInvoker<CreateDataTransformationRequest, CreateDataTransformationResponse> createDataTransformationInvoker(
        CreateDataTransformationRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createDataTransformation, hcClient);
    }

    /**
     * 创建布局字段
     *
     * 创建布局字段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLayoutFieldRequest 请求对象
     * @return CreateLayoutFieldResponse
     */
    public CreateLayoutFieldResponse createLayoutField(CreateLayoutFieldRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createLayoutField);
    }

    /**
     * 创建布局字段
     *
     * 创建布局字段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLayoutFieldRequest 请求对象
     * @return SyncInvoker<CreateLayoutFieldRequest, CreateLayoutFieldResponse>
     */
    public SyncInvoker<CreateLayoutFieldRequest, CreateLayoutFieldResponse> createLayoutFieldInvoker(
        CreateLayoutFieldRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createLayoutField, hcClient);
    }

    /**
     * 创建管道
     *
     * 创建管道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePipeRequest 请求对象
     * @return CreatePipeResponse
     */
    public CreatePipeResponse createPipe(CreatePipeRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createPipe);
    }

    /**
     * 创建管道
     *
     * 创建管道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePipeRequest 请求对象
     * @return SyncInvoker<CreatePipeRequest, CreatePipeResponse>
     */
    public SyncInvoker<CreatePipeRequest, CreatePipeResponse> createPipeInvoker(CreatePipeRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createPipe, hcClient);
    }

    /**
     * 创建检索脚本
     *
     * 创建检索脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRetrieveScriptRequest 请求对象
     * @return CreateRetrieveScriptResponse
     */
    public CreateRetrieveScriptResponse createRetrieveScript(CreateRetrieveScriptRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createRetrieveScript);
    }

    /**
     * 创建检索脚本
     *
     * 创建检索脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRetrieveScriptRequest 请求对象
     * @return SyncInvoker<CreateRetrieveScriptRequest, CreateRetrieveScriptResponse>
     */
    public SyncInvoker<CreateRetrieveScriptRequest, CreateRetrieveScriptResponse> createRetrieveScriptInvoker(
        CreateRetrieveScriptRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createRetrieveScript, hcClient);
    }

    /**
     * Adhoc sql参数渲染
     *
     * Adhoc sql参数渲染
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSqlRenderRequest 请求对象
     * @return CreateSqlRenderResponse
     */
    public CreateSqlRenderResponse createSqlRender(CreateSqlRenderRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createSqlRender);
    }

    /**
     * Adhoc sql参数渲染
     *
     * Adhoc sql参数渲染
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSqlRenderRequest 请求对象
     * @return SyncInvoker<CreateSqlRenderRequest, CreateSqlRenderResponse>
     */
    public SyncInvoker<CreateSqlRenderRequest, CreateSqlRenderResponse> createSqlRenderInvoker(
        CreateSqlRenderRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createSqlRender, hcClient);
    }

    /**
     * 创建表
     *
     * 创建表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTableRequest 请求对象
     * @return CreateTableResponse
     */
    public CreateTableResponse createTable(CreateTableRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createTable);
    }

    /**
     * 创建表
     *
     * 创建表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTableRequest 请求对象
     * @return SyncInvoker<CreateTableRequest, CreateTableResponse>
     */
    public SyncInvoker<CreateTableRequest, CreateTableResponse> createTableInvoker(CreateTableRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createTable, hcClient);
    }

    /**
     * 创建安全分析查询
     *
     * 创建安全分析查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTableAnalysisRequest 请求对象
     * @return CreateTableAnalysisResponse
     */
    public CreateTableAnalysisResponse createTableAnalysis(CreateTableAnalysisRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createTableAnalysis);
    }

    /**
     * 创建安全分析查询
     *
     * 创建安全分析查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTableAnalysisRequest 请求对象
     * @return SyncInvoker<CreateTableAnalysisRequest, CreateTableAnalysisResponse>
     */
    public SyncInvoker<CreateTableAnalysisRequest, CreateTableAnalysisResponse> createTableAnalysisInvoker(
        CreateTableAnalysisRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createTableAnalysis, hcClient);
    }

    /**
     * 关闭查询操作
     *
     * 关闭查询操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAdhocQueryRequest 请求对象
     * @return DeleteAdhocQueryResponse
     */
    public DeleteAdhocQueryResponse deleteAdhocQuery(DeleteAdhocQueryRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteAdhocQuery);
    }

    /**
     * 关闭查询操作
     *
     * 关闭查询操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAdhocQueryRequest 请求对象
     * @return SyncInvoker<DeleteAdhocQueryRequest, DeleteAdhocQueryResponse>
     */
    public SyncInvoker<DeleteAdhocQueryRequest, DeleteAdhocQueryResponse> deleteAdhocQueryInvoker(
        DeleteAdhocQueryRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteAdhocQuery, hcClient);
    }

    /**
     * 删除告警规则
     *
     * 删除告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlertRuleRequest 请求对象
     * @return DeleteAlertRuleResponse
     */
    public DeleteAlertRuleResponse deleteAlertRule(DeleteAlertRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteAlertRule);
    }

    /**
     * 删除告警规则
     *
     * 删除告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlertRuleRequest 请求对象
     * @return SyncInvoker<DeleteAlertRuleRequest, DeleteAlertRuleResponse>
     */
    public SyncInvoker<DeleteAlertRuleRequest, DeleteAlertRuleResponse> deleteAlertRuleInvoker(
        DeleteAlertRuleRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteAlertRule, hcClient);
    }

    /**
     * 删除分析脚本
     *
     * 删除分析脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAnalysisScriptRequest 请求对象
     * @return DeleteAnalysisScriptResponse
     */
    public DeleteAnalysisScriptResponse deleteAnalysisScript(DeleteAnalysisScriptRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteAnalysisScript);
    }

    /**
     * 删除分析脚本
     *
     * 删除分析脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAnalysisScriptRequest 请求对象
     * @return SyncInvoker<DeleteAnalysisScriptRequest, DeleteAnalysisScriptResponse>
     */
    public SyncInvoker<DeleteAnalysisScriptRequest, DeleteAnalysisScriptResponse> deleteAnalysisScriptInvoker(
        DeleteAnalysisScriptRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteAnalysisScript, hcClient);
    }

    /**
     * 删除代码片段
     *
     * 删除代码片段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCodeSegmentRequest 请求对象
     * @return DeleteCodeSegmentResponse
     */
    public DeleteCodeSegmentResponse deleteCodeSegment(DeleteCodeSegmentRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteCodeSegment);
    }

    /**
     * 删除代码片段
     *
     * 删除代码片段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCodeSegmentRequest 请求对象
     * @return SyncInvoker<DeleteCodeSegmentRequest, DeleteCodeSegmentResponse>
     */
    public SyncInvoker<DeleteCodeSegmentRequest, DeleteCodeSegmentResponse> deleteCodeSegmentInvoker(
        DeleteCodeSegmentRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteCodeSegment, hcClient);
    }

    /**
     * 删除自定义检查项
     *
     * 删除自定义检查项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCustomizedCheckitemsRequest 请求对象
     * @return DeleteCustomizedCheckitemsResponse
     */
    public DeleteCustomizedCheckitemsResponse deleteCustomizedCheckitems(DeleteCustomizedCheckitemsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteCustomizedCheckitems);
    }

    /**
     * 删除自定义检查项
     *
     * 删除自定义检查项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCustomizedCheckitemsRequest 请求对象
     * @return SyncInvoker<DeleteCustomizedCheckitemsRequest, DeleteCustomizedCheckitemsResponse>
     */
    public SyncInvoker<DeleteCustomizedCheckitemsRequest, DeleteCustomizedCheckitemsResponse> deleteCustomizedCheckitemsInvoker(
        DeleteCustomizedCheckitemsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteCustomizedCheckitems, hcClient);
    }

    /**
     * 删除自定义遵从包
     *
     * 删除自定义遵从包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCustomizedCompliancePackagesRequest 请求对象
     * @return DeleteCustomizedCompliancePackagesResponse
     */
    public DeleteCustomizedCompliancePackagesResponse deleteCustomizedCompliancePackages(
        DeleteCustomizedCompliancePackagesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteCustomizedCompliancePackages);
    }

    /**
     * 删除自定义遵从包
     *
     * 删除自定义遵从包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCustomizedCompliancePackagesRequest 请求对象
     * @return SyncInvoker<DeleteCustomizedCompliancePackagesRequest, DeleteCustomizedCompliancePackagesResponse>
     */
    public SyncInvoker<DeleteCustomizedCompliancePackagesRequest, DeleteCustomizedCompliancePackagesResponse> deleteCustomizedCompliancePackagesInvoker(
        DeleteCustomizedCompliancePackagesRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteCustomizedCompliancePackages, hcClient);
    }

    /**
     * 删除数据加工
     *
     * 删除数据加工
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDataTransformationRequest 请求对象
     * @return DeleteDataTransformationResponse
     */
    public DeleteDataTransformationResponse deleteDataTransformation(DeleteDataTransformationRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteDataTransformation);
    }

    /**
     * 删除数据加工
     *
     * 删除数据加工
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDataTransformationRequest 请求对象
     * @return SyncInvoker<DeleteDataTransformationRequest, DeleteDataTransformationResponse>
     */
    public SyncInvoker<DeleteDataTransformationRequest, DeleteDataTransformationResponse> deleteDataTransformationInvoker(
        DeleteDataTransformationRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteDataTransformation, hcClient);
    }

    /**
     * 批量删除布局字段
     *
     * 删除布局字段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLayoutFieldRequest 请求对象
     * @return DeleteLayoutFieldResponse
     */
    public DeleteLayoutFieldResponse deleteLayoutField(DeleteLayoutFieldRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteLayoutField);
    }

    /**
     * 批量删除布局字段
     *
     * 删除布局字段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLayoutFieldRequest 请求对象
     * @return SyncInvoker<DeleteLayoutFieldRequest, DeleteLayoutFieldResponse>
     */
    public SyncInvoker<DeleteLayoutFieldRequest, DeleteLayoutFieldResponse> deleteLayoutFieldInvoker(
        DeleteLayoutFieldRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteLayoutField, hcClient);
    }

    /**
     * 删除管道
     *
     * 删除管道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePipeRequest 请求对象
     * @return DeletePipeResponse
     */
    public DeletePipeResponse deletePipe(DeletePipeRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deletePipe);
    }

    /**
     * 删除管道
     *
     * 删除管道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePipeRequest 请求对象
     * @return SyncInvoker<DeletePipeRequest, DeletePipeResponse>
     */
    public SyncInvoker<DeletePipeRequest, DeletePipeResponse> deletePipeInvoker(DeletePipeRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deletePipe, hcClient);
    }

    /**
     * 删除检索脚本
     *
     * 删除检索脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRetrieveScriptRequest 请求对象
     * @return DeleteRetrieveScriptResponse
     */
    public DeleteRetrieveScriptResponse deleteRetrieveScript(DeleteRetrieveScriptRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteRetrieveScript);
    }

    /**
     * 删除检索脚本
     *
     * 删除检索脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRetrieveScriptRequest 请求对象
     * @return SyncInvoker<DeleteRetrieveScriptRequest, DeleteRetrieveScriptResponse>
     */
    public SyncInvoker<DeleteRetrieveScriptRequest, DeleteRetrieveScriptResponse> deleteRetrieveScriptInvoker(
        DeleteRetrieveScriptRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteRetrieveScript, hcClient);
    }

    /**
     * 删除表
     *
     * 删除表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTableRequest 请求对象
     * @return DeleteTableResponse
     */
    public DeleteTableResponse deleteTable(DeleteTableRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.deleteTable);
    }

    /**
     * 删除表
     *
     * 删除表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTableRequest 请求对象
     * @return SyncInvoker<DeleteTableRequest, DeleteTableResponse>
     */
    public SyncInvoker<DeleteTableRequest, DeleteTableResponse> deleteTableInvoker(DeleteTableRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.deleteTable, hcClient);
    }

    /**
     * 停用告警规则
     *
     * 停用告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableAlertRuleRequest 请求对象
     * @return DisableAlertRuleResponse
     */
    public DisableAlertRuleResponse disableAlertRule(DisableAlertRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.disableAlertRule);
    }

    /**
     * 停用告警规则
     *
     * 停用告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableAlertRuleRequest 请求对象
     * @return SyncInvoker<DisableAlertRuleRequest, DisableAlertRuleResponse>
     */
    public SyncInvoker<DisableAlertRuleRequest, DisableAlertRuleResponse> disableAlertRuleInvoker(
        DisableAlertRuleRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.disableAlertRule, hcClient);
    }

    /**
     * 关闭实时消费
     *
     * 关闭实时消费
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableDataConsumptionRequest 请求对象
     * @return DisableDataConsumptionResponse
     */
    public DisableDataConsumptionResponse disableDataConsumption(DisableDataConsumptionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.disableDataConsumption);
    }

    /**
     * 关闭实时消费
     *
     * 关闭实时消费
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableDataConsumptionRequest 请求对象
     * @return SyncInvoker<DisableDataConsumptionRequest, DisableDataConsumptionResponse>
     */
    public SyncInvoker<DisableDataConsumptionRequest, DisableDataConsumptionResponse> disableDataConsumptionInvoker(
        DisableDataConsumptionRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.disableDataConsumption, hcClient);
    }

    /**
     * 停用数据加工
     *
     * 停用数据加工
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableDataTransformationRequest 请求对象
     * @return DisableDataTransformationResponse
     */
    public DisableDataTransformationResponse disableDataTransformation(DisableDataTransformationRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.disableDataTransformation);
    }

    /**
     * 停用数据加工
     *
     * 停用数据加工
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableDataTransformationRequest 请求对象
     * @return SyncInvoker<DisableDataTransformationRequest, DisableDataTransformationResponse>
     */
    public SyncInvoker<DisableDataTransformationRequest, DisableDataTransformationResponse> disableDataTransformationInvoker(
        DisableDataTransformationRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.disableDataTransformation, hcClient);
    }

    /**
     * 启用告警规则
     *
     * 启用告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableAlertRuleRequest 请求对象
     * @return EnableAlertRuleResponse
     */
    public EnableAlertRuleResponse enableAlertRule(EnableAlertRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.enableAlertRule);
    }

    /**
     * 启用告警规则
     *
     * 启用告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableAlertRuleRequest 请求对象
     * @return SyncInvoker<EnableAlertRuleRequest, EnableAlertRuleResponse>
     */
    public SyncInvoker<EnableAlertRuleRequest, EnableAlertRuleResponse> enableAlertRuleInvoker(
        EnableAlertRuleRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.enableAlertRule, hcClient);
    }

    /**
     * 开启实时消费
     *
     * 开启实时消费
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDataConsumptionRequest 请求对象
     * @return EnableDataConsumptionResponse
     */
    public EnableDataConsumptionResponse enableDataConsumption(EnableDataConsumptionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.enableDataConsumption);
    }

    /**
     * 开启实时消费
     *
     * 开启实时消费
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDataConsumptionRequest 请求对象
     * @return SyncInvoker<EnableDataConsumptionRequest, EnableDataConsumptionResponse>
     */
    public SyncInvoker<EnableDataConsumptionRequest, EnableDataConsumptionResponse> enableDataConsumptionInvoker(
        EnableDataConsumptionRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.enableDataConsumption, hcClient);
    }

    /**
     * 启用数据加工
     *
     * 启用数据加工
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDataTransformationRequest 请求对象
     * @return EnableDataTransformationResponse
     */
    public EnableDataTransformationResponse enableDataTransformation(EnableDataTransformationRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.enableDataTransformation);
    }

    /**
     * 启用数据加工
     *
     * 启用数据加工
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDataTransformationRequest 请求对象
     * @return SyncInvoker<EnableDataTransformationRequest, EnableDataTransformationResponse>
     */
    public SyncInvoker<EnableDataTransformationRequest, EnableDataTransformationResponse> enableDataTransformationInvoker(
        EnableDataTransformationRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.enableDataTransformation, hcClient);
    }

    /**
     * 告警规则总览
     *
     * 告警规则总览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRuleMetricsRequest 请求对象
     * @return ListAlertRuleMetricsResponse
     */
    public ListAlertRuleMetricsResponse listAlertRuleMetrics(ListAlertRuleMetricsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listAlertRuleMetrics);
    }

    /**
     * 告警规则总览
     *
     * 告警规则总览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRuleMetricsRequest 请求对象
     * @return SyncInvoker<ListAlertRuleMetricsRequest, ListAlertRuleMetricsResponse>
     */
    public SyncInvoker<ListAlertRuleMetricsRequest, ListAlertRuleMetricsResponse> listAlertRuleMetricsInvoker(
        ListAlertRuleMetricsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listAlertRuleMetrics, hcClient);
    }

    /**
     * 列出告警规则模板总览
     *
     * 列出告警规则模板总览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRuleTemplateMetricsRequest 请求对象
     * @return ListAlertRuleTemplateMetricsResponse
     */
    public ListAlertRuleTemplateMetricsResponse listAlertRuleTemplateMetrics(
        ListAlertRuleTemplateMetricsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listAlertRuleTemplateMetrics);
    }

    /**
     * 列出告警规则模板总览
     *
     * 列出告警规则模板总览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRuleTemplateMetricsRequest 请求对象
     * @return SyncInvoker<ListAlertRuleTemplateMetricsRequest, ListAlertRuleTemplateMetricsResponse>
     */
    public SyncInvoker<ListAlertRuleTemplateMetricsRequest, ListAlertRuleTemplateMetricsResponse> listAlertRuleTemplateMetricsInvoker(
        ListAlertRuleTemplateMetricsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listAlertRuleTemplateMetrics, hcClient);
    }

    /**
     * 列出告警规则模板
     *
     * 列出告警规则模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRuleTemplatesRequest 请求对象
     * @return ListAlertRuleTemplatesResponse
     */
    public ListAlertRuleTemplatesResponse listAlertRuleTemplates(ListAlertRuleTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listAlertRuleTemplates);
    }

    /**
     * 列出告警规则模板
     *
     * 列出告警规则模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRuleTemplatesRequest 请求对象
     * @return SyncInvoker<ListAlertRuleTemplatesRequest, ListAlertRuleTemplatesResponse>
     */
    public SyncInvoker<ListAlertRuleTemplatesRequest, ListAlertRuleTemplatesResponse> listAlertRuleTemplatesInvoker(
        ListAlertRuleTemplatesRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listAlertRuleTemplates, hcClient);
    }

    /**
     * 列出告警规则
     *
     * 列出告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRulesRequest 请求对象
     * @return ListAlertRulesResponse
     */
    public ListAlertRulesResponse listAlertRules(ListAlertRulesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listAlertRules);
    }

    /**
     * 列出告警规则
     *
     * 列出告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRulesRequest 请求对象
     * @return SyncInvoker<ListAlertRulesRequest, ListAlertRulesResponse>
     */
    public SyncInvoker<ListAlertRulesRequest, ListAlertRulesResponse> listAlertRulesInvoker(
        ListAlertRulesRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listAlertRules, hcClient);
    }

    /**
     * 列出分析脚本
     *
     * 列出分析脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAnalysisScriptsRequest 请求对象
     * @return ListAnalysisScriptsResponse
     */
    public ListAnalysisScriptsResponse listAnalysisScripts(ListAnalysisScriptsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listAnalysisScripts);
    }

    /**
     * 列出分析脚本
     *
     * 列出分析脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAnalysisScriptsRequest 请求对象
     * @return SyncInvoker<ListAnalysisScriptsRequest, ListAnalysisScriptsResponse>
     */
    public SyncInvoker<ListAnalysisScriptsRequest, ListAnalysisScriptsResponse> listAnalysisScriptsInvoker(
        ListAnalysisScriptsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listAnalysisScripts, hcClient);
    }

    /**
     * 列出代码片段
     *
     * 列出代码片段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCodeSegmentsRequest 请求对象
     * @return ListCodeSegmentsResponse
     */
    public ListCodeSegmentsResponse listCodeSegments(ListCodeSegmentsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listCodeSegments);
    }

    /**
     * 列出代码片段
     *
     * 列出代码片段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCodeSegmentsRequest 请求对象
     * @return SyncInvoker<ListCodeSegmentsRequest, ListCodeSegmentsResponse>
     */
    public SyncInvoker<ListCodeSegmentsRequest, ListCodeSegmentsResponse> listCodeSegmentsInvoker(
        ListCodeSegmentsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listCodeSegments, hcClient);
    }

    /**
     * 获取云服务采集配置
     *
     * 获取云服务采集配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectConfigRequest 请求对象
     * @return ListCollectConfigResponse
     */
    public ListCollectConfigResponse listCollectConfig(ListCollectConfigRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listCollectConfig);
    }

    /**
     * 获取云服务采集配置
     *
     * 获取云服务采集配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectConfigRequest 请求对象
     * @return SyncInvoker<ListCollectConfigRequest, ListCollectConfigResponse>
     */
    public SyncInvoker<ListCollectConfigRequest, ListCollectConfigResponse> listCollectConfigInvoker(
        ListCollectConfigRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listCollectConfig, hcClient);
    }

    /**
     * 数据加工总览
     *
     * 数据加工总览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataTransformationMetricsRequest 请求对象
     * @return ListDataTransformationMetricsResponse
     */
    public ListDataTransformationMetricsResponse listDataTransformationMetrics(
        ListDataTransformationMetricsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listDataTransformationMetrics);
    }

    /**
     * 数据加工总览
     *
     * 数据加工总览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataTransformationMetricsRequest 请求对象
     * @return SyncInvoker<ListDataTransformationMetricsRequest, ListDataTransformationMetricsResponse>
     */
    public SyncInvoker<ListDataTransformationMetricsRequest, ListDataTransformationMetricsResponse> listDataTransformationMetricsInvoker(
        ListDataTransformationMetricsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listDataTransformationMetrics, hcClient);
    }

    /**
     * 列出数据加工
     *
     * 列出数据加工
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataTransformationsRequest 请求对象
     * @return ListDataTransformationsResponse
     */
    public ListDataTransformationsResponse listDataTransformations(ListDataTransformationsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listDataTransformations);
    }

    /**
     * 列出数据加工
     *
     * 列出数据加工
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataTransformationsRequest 请求对象
     * @return SyncInvoker<ListDataTransformationsRequest, ListDataTransformationsResponse>
     */
    public SyncInvoker<ListDataTransformationsRequest, ListDataTransformationsResponse> listDataTransformationsInvoker(
        ListDataTransformationsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listDataTransformations, hcClient);
    }

    /**
     * 列出目录分组
     *
     * 列出目录分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDirectoriesRequest 请求对象
     * @return ListDirectoriesResponse
     */
    public ListDirectoriesResponse listDirectories(ListDirectoriesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listDirectories);
    }

    /**
     * 列出目录分组
     *
     * 列出目录分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDirectoriesRequest 请求对象
     * @return SyncInvoker<ListDirectoriesRequest, ListDirectoriesResponse>
     */
    public SyncInvoker<ListDirectoriesRequest, ListDirectoriesResponse> listDirectoriesInvoker(
        ListDirectoriesRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listDirectories, hcClient);
    }

    /**
     * 全部布局字段
     *
     * 查询布局字段列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLayoutFieldAllRequest 请求对象
     * @return ListLayoutFieldAllResponse
     */
    public ListLayoutFieldAllResponse listLayoutFieldAll(ListLayoutFieldAllRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listLayoutFieldAll);
    }

    /**
     * 全部布局字段
     *
     * 查询布局字段列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLayoutFieldAllRequest 请求对象
     * @return SyncInvoker<ListLayoutFieldAllRequest, ListLayoutFieldAllResponse>
     */
    public SyncInvoker<ListLayoutFieldAllRequest, ListLayoutFieldAllResponse> listLayoutFieldAllInvoker(
        ListLayoutFieldAllRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listLayoutFieldAll, hcClient);
    }

    /**
     * 获取管道列表
     *
     * 获取管道列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPipesRequest 请求对象
     * @return ListPipesResponse
     */
    public ListPipesResponse listPipes(ListPipesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listPipes);
    }

    /**
     * 获取管道列表
     *
     * 获取管道列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPipesRequest 请求对象
     * @return SyncInvoker<ListPipesRequest, ListPipesResponse>
     */
    public SyncInvoker<ListPipesRequest, ListPipesResponse> listPipesInvoker(ListPipesRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listPipes, hcClient);
    }

    /**
     * 列出检索脚本
     *
     * 列出检索脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRetrieveScriptsRequest 请求对象
     * @return ListRetrieveScriptsResponse
     */
    public ListRetrieveScriptsResponse listRetrieveScripts(ListRetrieveScriptsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listRetrieveScripts);
    }

    /**
     * 列出检索脚本
     *
     * 列出检索脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRetrieveScriptsRequest 请求对象
     * @return SyncInvoker<ListRetrieveScriptsRequest, ListRetrieveScriptsResponse>
     */
    public SyncInvoker<ListRetrieveScriptsRequest, ListRetrieveScriptsResponse> listRetrieveScriptsInvoker(
        ListRetrieveScriptsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listRetrieveScripts, hcClient);
    }

    /**
     * 检索表直方图
     *
     * 检索表直方图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTableHistogramsRequest 请求对象
     * @return ListTableHistogramsResponse
     */
    public ListTableHistogramsResponse listTableHistograms(ListTableHistogramsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listTableHistograms);
    }

    /**
     * 检索表直方图
     *
     * 检索表直方图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTableHistogramsRequest 请求对象
     * @return SyncInvoker<ListTableHistogramsRequest, ListTableHistogramsResponse>
     */
    public SyncInvoker<ListTableHistogramsRequest, ListTableHistogramsResponse> listTableHistogramsInvoker(
        ListTableHistogramsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listTableHistograms, hcClient);
    }

    /**
     * 检索表日志
     *
     * 检索表日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTableLogsRequest 请求对象
     * @return ListTableLogsResponse
     */
    public ListTableLogsResponse listTableLogs(ListTableLogsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listTableLogs);
    }

    /**
     * 检索表日志
     *
     * 检索表日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTableLogsRequest 请求对象
     * @return SyncInvoker<ListTableLogsRequest, ListTableLogsResponse>
     */
    public SyncInvoker<ListTableLogsRequest, ListTableLogsResponse> listTableLogsInvoker(ListTableLogsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listTableLogs, hcClient);
    }

    /**
     * 获取表列表
     *
     * 获取表列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTablesRequest 请求对象
     * @return ListTablesResponse
     */
    public ListTablesResponse listTables(ListTablesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.listTables);
    }

    /**
     * 获取表列表
     *
     * 获取表列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTablesRequest 请求对象
     * @return SyncInvoker<ListTablesRequest, ListTablesResponse>
     */
    public SyncInvoker<ListTablesRequest, ListTablesResponse> listTablesInvoker(ListTablesRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.listTables, hcClient);
    }

    /**
     * 搜索基线检查结果列表
     *
     * 搜索基线检查结果列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchBaselineRequest 请求对象
     * @return SearchBaselineResponse
     */
    public SearchBaselineResponse searchBaseline(SearchBaselineRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.searchBaseline);
    }

    /**
     * 搜索基线检查结果列表
     *
     * 搜索基线检查结果列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchBaselineRequest 请求对象
     * @return SyncInvoker<SearchBaselineRequest, SearchBaselineResponse>
     */
    public SyncInvoker<SearchBaselineRequest, SearchBaselineResponse> searchBaselineInvoker(
        SearchBaselineRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.searchBaseline, hcClient);
    }

    /**
     * 查询检查项列表
     *
     * 查询检查项列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCheckitemsRequest 请求对象
     * @return SearchCheckitemsResponse
     */
    public SearchCheckitemsResponse searchCheckitems(SearchCheckitemsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.searchCheckitems);
    }

    /**
     * 查询检查项列表
     *
     * 查询检查项列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCheckitemsRequest 请求对象
     * @return SyncInvoker<SearchCheckitemsRequest, SearchCheckitemsResponse>
     */
    public SyncInvoker<SearchCheckitemsRequest, SearchCheckitemsResponse> searchCheckitemsInvoker(
        SearchCheckitemsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.searchCheckitems, hcClient);
    }

    /**
     * 查询遵从包列表
     *
     * 查询遵从包列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCompliancePackagesRequest 请求对象
     * @return SearchCompliancePackagesResponse
     */
    public SearchCompliancePackagesResponse searchCompliancePackages(SearchCompliancePackagesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.searchCompliancePackages);
    }

    /**
     * 查询遵从包列表
     *
     * 查询遵从包列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCompliancePackagesRequest 请求对象
     * @return SyncInvoker<SearchCompliancePackagesRequest, SearchCompliancePackagesResponse>
     */
    public SyncInvoker<SearchCompliancePackagesRequest, SearchCompliancePackagesResponse> searchCompliancePackagesInvoker(
        SearchCompliancePackagesRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.searchCompliancePackages, hcClient);
    }

    /**
     * 获取adhoc查询结果
     *
     * 获取adhoc查询结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAdhocResultRequest 请求对象
     * @return ShowAdhocResultResponse
     */
    public ShowAdhocResultResponse showAdhocResult(ShowAdhocResultRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showAdhocResult);
    }

    /**
     * 获取adhoc查询结果
     *
     * 获取adhoc查询结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAdhocResultRequest 请求对象
     * @return SyncInvoker<ShowAdhocResultRequest, ShowAdhocResultResponse>
     */
    public SyncInvoker<ShowAdhocResultRequest, ShowAdhocResultResponse> showAdhocResultInvoker(
        ShowAdhocResultRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showAdhocResult, hcClient);
    }

    /**
     * 查看告警规则
     *
     * 查看告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlertRuleRequest 请求对象
     * @return ShowAlertRuleResponse
     */
    public ShowAlertRuleResponse showAlertRule(ShowAlertRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showAlertRule);
    }

    /**
     * 查看告警规则
     *
     * 查看告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlertRuleRequest 请求对象
     * @return SyncInvoker<ShowAlertRuleRequest, ShowAlertRuleResponse>
     */
    public SyncInvoker<ShowAlertRuleRequest, ShowAlertRuleResponse> showAlertRuleInvoker(ShowAlertRuleRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showAlertRule, hcClient);
    }

    /**
     * 查看告警规则模板
     *
     * 查看告警规则模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlertRuleTemplateRequest 请求对象
     * @return ShowAlertRuleTemplateResponse
     */
    public ShowAlertRuleTemplateResponse showAlertRuleTemplate(ShowAlertRuleTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showAlertRuleTemplate);
    }

    /**
     * 查看告警规则模板
     *
     * 查看告警规则模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlertRuleTemplateRequest 请求对象
     * @return SyncInvoker<ShowAlertRuleTemplateRequest, ShowAlertRuleTemplateResponse>
     */
    public SyncInvoker<ShowAlertRuleTemplateRequest, ShowAlertRuleTemplateResponse> showAlertRuleTemplateInvoker(
        ShowAlertRuleTemplateRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showAlertRuleTemplate, hcClient);
    }

    /**
     * 查看分析脚本
     *
     * 查看分析脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAnalysisScriptRequest 请求对象
     * @return ShowAnalysisScriptResponse
     */
    public ShowAnalysisScriptResponse showAnalysisScript(ShowAnalysisScriptRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showAnalysisScript);
    }

    /**
     * 查看分析脚本
     *
     * 查看分析脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAnalysisScriptRequest 请求对象
     * @return SyncInvoker<ShowAnalysisScriptRequest, ShowAnalysisScriptResponse>
     */
    public SyncInvoker<ShowAnalysisScriptRequest, ShowAnalysisScriptResponse> showAnalysisScriptInvoker(
        ShowAnalysisScriptRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showAnalysisScript, hcClient);
    }

    /**
     * 查询检查项详情
     *
     * 查询检查项详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCheckitemDetailRequest 请求对象
     * @return ShowCheckitemDetailResponse
     */
    public ShowCheckitemDetailResponse showCheckitemDetail(ShowCheckitemDetailRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showCheckitemDetail);
    }

    /**
     * 查询检查项详情
     *
     * 查询检查项详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCheckitemDetailRequest 请求对象
     * @return SyncInvoker<ShowCheckitemDetailRequest, ShowCheckitemDetailResponse>
     */
    public SyncInvoker<ShowCheckitemDetailRequest, ShowCheckitemDetailResponse> showCheckitemDetailInvoker(
        ShowCheckitemDetailRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showCheckitemDetail, hcClient);
    }

    /**
     * 查看代码片段
     *
     * 查看代码片段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCodeSegmentRequest 请求对象
     * @return ShowCodeSegmentResponse
     */
    public ShowCodeSegmentResponse showCodeSegment(ShowCodeSegmentRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showCodeSegment);
    }

    /**
     * 查看代码片段
     *
     * 查看代码片段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCodeSegmentRequest 请求对象
     * @return SyncInvoker<ShowCodeSegmentRequest, ShowCodeSegmentResponse>
     */
    public SyncInvoker<ShowCodeSegmentRequest, ShowCodeSegmentResponse> showCodeSegmentInvoker(
        ShowCodeSegmentRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showCodeSegment, hcClient);
    }

    /**
     * 查询遵从包详情
     *
     * 查询遵从包详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCompliancePackageDetailRequest 请求对象
     * @return ShowCompliancePackageDetailResponse
     */
    public ShowCompliancePackageDetailResponse showCompliancePackageDetail(ShowCompliancePackageDetailRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showCompliancePackageDetail);
    }

    /**
     * 查询遵从包详情
     *
     * 查询遵从包详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCompliancePackageDetailRequest 请求对象
     * @return SyncInvoker<ShowCompliancePackageDetailRequest, ShowCompliancePackageDetailResponse>
     */
    public SyncInvoker<ShowCompliancePackageDetailRequest, ShowCompliancePackageDetailResponse> showCompliancePackageDetailInvoker(
        ShowCompliancePackageDetailRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showCompliancePackageDetail, hcClient);
    }

    /**
     * 获取实时消费配置
     *
     * 获取实时消费配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataConsumptionRequest 请求对象
     * @return ShowDataConsumptionResponse
     */
    public ShowDataConsumptionResponse showDataConsumption(ShowDataConsumptionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showDataConsumption);
    }

    /**
     * 获取实时消费配置
     *
     * 获取实时消费配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataConsumptionRequest 请求对象
     * @return SyncInvoker<ShowDataConsumptionRequest, ShowDataConsumptionResponse>
     */
    public SyncInvoker<ShowDataConsumptionRequest, ShowDataConsumptionResponse> showDataConsumptionInvoker(
        ShowDataConsumptionRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showDataConsumption, hcClient);
    }

    /**
     * 查看数据加工
     *
     * 查看数据加工
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataTransformationRequest 请求对象
     * @return ShowDataTransformationResponse
     */
    public ShowDataTransformationResponse showDataTransformation(ShowDataTransformationRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showDataTransformation);
    }

    /**
     * 查看数据加工
     *
     * 查看数据加工
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataTransformationRequest 请求对象
     * @return SyncInvoker<ShowDataTransformationRequest, ShowDataTransformationResponse>
     */
    public SyncInvoker<ShowDataTransformationRequest, ShowDataTransformationResponse> showDataTransformationInvoker(
        ShowDataTransformationRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showDataTransformation, hcClient);
    }

    /**
     * 展示字段详情
     *
     * 查询布局字段详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLayoutFieldInfoRequest 请求对象
     * @return ShowLayoutFieldInfoResponse
     */
    public ShowLayoutFieldInfoResponse showLayoutFieldInfo(ShowLayoutFieldInfoRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showLayoutFieldInfo);
    }

    /**
     * 展示字段详情
     *
     * 查询布局字段详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLayoutFieldInfoRequest 请求对象
     * @return SyncInvoker<ShowLayoutFieldInfoRequest, ShowLayoutFieldInfoResponse>
     */
    public SyncInvoker<ShowLayoutFieldInfoRequest, ShowLayoutFieldInfoResponse> showLayoutFieldInfoInvoker(
        ShowLayoutFieldInfoRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showLayoutFieldInfo, hcClient);
    }

    /**
     * 获取监控统计信息
     *
     * 获取监控统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMonitorStatsRequest 请求对象
     * @return ShowMonitorStatsResponse
     */
    public ShowMonitorStatsResponse showMonitorStats(ShowMonitorStatsRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showMonitorStats);
    }

    /**
     * 获取监控统计信息
     *
     * 获取监控统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMonitorStatsRequest 请求对象
     * @return SyncInvoker<ShowMonitorStatsRequest, ShowMonitorStatsResponse>
     */
    public SyncInvoker<ShowMonitorStatsRequest, ShowMonitorStatsResponse> showMonitorStatsInvoker(
        ShowMonitorStatsRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showMonitorStats, hcClient);
    }

    /**
     * 获取管道详情
     *
     * 获取管道详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPipeRequest 请求对象
     * @return ShowPipeResponse
     */
    public ShowPipeResponse showPipe(ShowPipeRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showPipe);
    }

    /**
     * 获取管道详情
     *
     * 获取管道详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPipeRequest 请求对象
     * @return SyncInvoker<ShowPipeRequest, ShowPipeResponse>
     */
    public SyncInvoker<ShowPipeRequest, ShowPipeResponse> showPipeInvoker(ShowPipeRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showPipe, hcClient);
    }

    /**
     * 查看检索脚本
     *
     * 查看检索脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRetrieveScriptRequest 请求对象
     * @return ShowRetrieveScriptResponse
     */
    public ShowRetrieveScriptResponse showRetrieveScript(ShowRetrieveScriptRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showRetrieveScript);
    }

    /**
     * 查看检索脚本
     *
     * 查看检索脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRetrieveScriptRequest 请求对象
     * @return SyncInvoker<ShowRetrieveScriptRequest, ShowRetrieveScriptResponse>
     */
    public SyncInvoker<ShowRetrieveScriptRequest, ShowRetrieveScriptResponse> showRetrieveScriptInvoker(
        ShowRetrieveScriptRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showRetrieveScript, hcClient);
    }

    /**
     * 获取订阅资源信息
     *
     * 获取订阅资源信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubscriptionResourcesRequest 请求对象
     * @return ShowSubscriptionResourcesResponse
     */
    public ShowSubscriptionResourcesResponse showSubscriptionResources(ShowSubscriptionResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showSubscriptionResources);
    }

    /**
     * 获取订阅资源信息
     *
     * 获取订阅资源信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubscriptionResourcesRequest 请求对象
     * @return SyncInvoker<ShowSubscriptionResourcesRequest, ShowSubscriptionResourcesResponse>
     */
    public SyncInvoker<ShowSubscriptionResourcesRequest, ShowSubscriptionResourcesResponse> showSubscriptionResourcesInvoker(
        ShowSubscriptionResourcesRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showSubscriptionResources, hcClient);
    }

    /**
     * 获取表详情
     *
     * 获取表详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTableRequest 请求对象
     * @return ShowTableResponse
     */
    public ShowTableResponse showTable(ShowTableRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showTable);
    }

    /**
     * 获取表详情
     *
     * 获取表详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTableRequest 请求对象
     * @return SyncInvoker<ShowTableRequest, ShowTableResponse>
     */
    public SyncInvoker<ShowTableRequest, ShowTableResponse> showTableInvoker(ShowTableRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showTable, hcClient);
    }

    /**
     * 获取当前可用版本
     *
     * 获取当前可用版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVersionRequest 请求对象
     * @return ShowVersionResponse
     */
    public ShowVersionResponse showVersion(ShowVersionRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.showVersion);
    }

    /**
     * 获取当前可用版本
     *
     * 获取当前可用版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVersionRequest 请求对象
     * @return SyncInvoker<ShowVersionRequest, ShowVersionResponse>
     */
    public SyncInvoker<ShowVersionRequest, ShowVersionResponse> showVersionInvoker(ShowVersionRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.showVersion, hcClient);
    }

    /**
     * 更新告警规则
     *
     * 更新告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlertRuleRequest 请求对象
     * @return UpdateAlertRuleResponse
     */
    public UpdateAlertRuleResponse updateAlertRule(UpdateAlertRuleRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateAlertRule);
    }

    /**
     * 更新告警规则
     *
     * 更新告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlertRuleRequest 请求对象
     * @return SyncInvoker<UpdateAlertRuleRequest, UpdateAlertRuleResponse>
     */
    public SyncInvoker<UpdateAlertRuleRequest, UpdateAlertRuleResponse> updateAlertRuleInvoker(
        UpdateAlertRuleRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateAlertRule, hcClient);
    }

    /**
     * 更新分析脚本
     *
     * 更新分析脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAnalysisScriptRequest 请求对象
     * @return UpdateAnalysisScriptResponse
     */
    public UpdateAnalysisScriptResponse updateAnalysisScript(UpdateAnalysisScriptRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateAnalysisScript);
    }

    /**
     * 更新分析脚本
     *
     * 更新分析脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAnalysisScriptRequest 请求对象
     * @return SyncInvoker<UpdateAnalysisScriptRequest, UpdateAnalysisScriptResponse>
     */
    public SyncInvoker<UpdateAnalysisScriptRequest, UpdateAnalysisScriptResponse> updateAnalysisScriptInvoker(
        UpdateAnalysisScriptRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateAnalysisScript, hcClient);
    }

    /**
     * 更新检查项
     *
     * 更新检查项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCheckitemRequest 请求对象
     * @return UpdateCheckitemResponse
     */
    public UpdateCheckitemResponse updateCheckitem(UpdateCheckitemRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateCheckitem);
    }

    /**
     * 更新检查项
     *
     * 更新检查项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCheckitemRequest 请求对象
     * @return SyncInvoker<UpdateCheckitemRequest, UpdateCheckitemResponse>
     */
    public SyncInvoker<UpdateCheckitemRequest, UpdateCheckitemResponse> updateCheckitemInvoker(
        UpdateCheckitemRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateCheckitem, hcClient);
    }

    /**
     * 更新代码片段
     *
     * 更新代码片段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCodeSegmentRequest 请求对象
     * @return UpdateCodeSegmentResponse
     */
    public UpdateCodeSegmentResponse updateCodeSegment(UpdateCodeSegmentRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateCodeSegment);
    }

    /**
     * 更新代码片段
     *
     * 更新代码片段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCodeSegmentRequest 请求对象
     * @return SyncInvoker<UpdateCodeSegmentRequest, UpdateCodeSegmentResponse>
     */
    public SyncInvoker<UpdateCodeSegmentRequest, UpdateCodeSegmentResponse> updateCodeSegmentInvoker(
        UpdateCodeSegmentRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateCodeSegment, hcClient);
    }

    /**
     * 更新遵从包
     *
     * 更新遵从包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCompliancePackageRequest 请求对象
     * @return UpdateCompliancePackageResponse
     */
    public UpdateCompliancePackageResponse updateCompliancePackage(UpdateCompliancePackageRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateCompliancePackage);
    }

    /**
     * 更新遵从包
     *
     * 更新遵从包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCompliancePackageRequest 请求对象
     * @return SyncInvoker<UpdateCompliancePackageRequest, UpdateCompliancePackageResponse>
     */
    public SyncInvoker<UpdateCompliancePackageRequest, UpdateCompliancePackageResponse> updateCompliancePackageInvoker(
        UpdateCompliancePackageRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateCompliancePackage, hcClient);
    }

    /**
     * 更新数据加工
     *
     * 更新数据加工
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDataTransformationRequest 请求对象
     * @return UpdateDataTransformationResponse
     */
    public UpdateDataTransformationResponse updateDataTransformation(UpdateDataTransformationRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateDataTransformation);
    }

    /**
     * 更新数据加工
     *
     * 更新数据加工
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDataTransformationRequest 请求对象
     * @return SyncInvoker<UpdateDataTransformationRequest, UpdateDataTransformationResponse>
     */
    public SyncInvoker<UpdateDataTransformationRequest, UpdateDataTransformationResponse> updateDataTransformationInvoker(
        UpdateDataTransformationRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateDataTransformation, hcClient);
    }

    /**
     * 更新字段
     *
     * 更新布局字段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLayoutFieldRequest 请求对象
     * @return UpdateLayoutFieldResponse
     */
    public UpdateLayoutFieldResponse updateLayoutField(UpdateLayoutFieldRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateLayoutField);
    }

    /**
     * 更新字段
     *
     * 更新布局字段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLayoutFieldRequest 请求对象
     * @return SyncInvoker<UpdateLayoutFieldRequest, UpdateLayoutFieldResponse>
     */
    public SyncInvoker<UpdateLayoutFieldRequest, UpdateLayoutFieldResponse> updateLayoutFieldInvoker(
        UpdateLayoutFieldRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateLayoutField, hcClient);
    }

    /**
     * 更新管道
     *
     * 更新管道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePipeRequest 请求对象
     * @return UpdatePipeResponse
     */
    public UpdatePipeResponse updatePipe(UpdatePipeRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updatePipe);
    }

    /**
     * 更新管道
     *
     * 更新管道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePipeRequest 请求对象
     * @return SyncInvoker<UpdatePipeRequest, UpdatePipeResponse>
     */
    public SyncInvoker<UpdatePipeRequest, UpdatePipeResponse> updatePipeInvoker(UpdatePipeRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updatePipe, hcClient);
    }

    /**
     * 更新管道结构
     *
     * 更新管道结构
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePipeSchemaRequest 请求对象
     * @return UpdatePipeSchemaResponse
     */
    public UpdatePipeSchemaResponse updatePipeSchema(UpdatePipeSchemaRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updatePipeSchema);
    }

    /**
     * 更新管道结构
     *
     * 更新管道结构
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePipeSchemaRequest 请求对象
     * @return SyncInvoker<UpdatePipeSchemaRequest, UpdatePipeSchemaResponse>
     */
    public SyncInvoker<UpdatePipeSchemaRequest, UpdatePipeSchemaResponse> updatePipeSchemaInvoker(
        UpdatePipeSchemaRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updatePipeSchema, hcClient);
    }

    /**
     * 更新检索脚本
     *
     * 更新检索脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRetrieveScriptRequest 请求对象
     * @return UpdateRetrieveScriptResponse
     */
    public UpdateRetrieveScriptResponse updateRetrieveScript(UpdateRetrieveScriptRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateRetrieveScript);
    }

    /**
     * 更新检索脚本
     *
     * 更新检索脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRetrieveScriptRequest 请求对象
     * @return SyncInvoker<UpdateRetrieveScriptRequest, UpdateRetrieveScriptResponse>
     */
    public SyncInvoker<UpdateRetrieveScriptRequest, UpdateRetrieveScriptResponse> updateRetrieveScriptInvoker(
        UpdateRetrieveScriptRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateRetrieveScript, hcClient);
    }

    /**
     * 更改表详情
     *
     * 更改表详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTableRequest 请求对象
     * @return UpdateTableResponse
     */
    public UpdateTableResponse updateTable(UpdateTableRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateTable);
    }

    /**
     * 更改表详情
     *
     * 更改表详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTableRequest 请求对象
     * @return SyncInvoker<UpdateTableRequest, UpdateTableResponse>
     */
    public SyncInvoker<UpdateTableRequest, UpdateTableResponse> updateTableInvoker(UpdateTableRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateTable, hcClient);
    }

    /**
     * 更改表结构
     *
     * 更改表结构
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTableSchemaRequest 请求对象
     * @return UpdateTableSchemaResponse
     */
    public UpdateTableSchemaResponse updateTableSchema(UpdateTableSchemaRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.updateTableSchema);
    }

    /**
     * 更改表结构
     *
     * 更改表结构
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTableSchemaRequest 请求对象
     * @return SyncInvoker<UpdateTableSchemaRequest, UpdateTableSchemaResponse>
     */
    public SyncInvoker<UpdateTableSchemaRequest, UpdateTableSchemaResponse> updateTableSchemaInvoker(
        UpdateTableSchemaRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.updateTableSchema, hcClient);
    }

    /**
     * 创建SQL校验
     *
     * 创建SQL校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSqlValidationRequest 请求对象
     * @return CreateSqlValidationResponse
     */
    public CreateSqlValidationResponse createSqlValidation(CreateSqlValidationRequest request) {
        return hcClient.syncInvokeHttp(request, SecMasterMeta.createSqlValidation);
    }

    /**
     * 创建SQL校验
     *
     * 创建SQL校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSqlValidationRequest 请求对象
     * @return SyncInvoker<CreateSqlValidationRequest, CreateSqlValidationResponse>
     */
    public SyncInvoker<CreateSqlValidationRequest, CreateSqlValidationResponse> createSqlValidationInvoker(
        CreateSqlValidationRequest request) {
        return new SyncInvoker<>(request, SecMasterMeta.createSqlValidation, hcClient);
    }

}

package com.huaweicloud.sdk.secmaster.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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
     * 创建adhoc查询
     *
     * 创建adhoc查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAdhocQueryRequest 请求对象
     * @return CompletableFuture<CreateAdhocQueryResponse>
     */
    public CompletableFuture<CreateAdhocQueryResponse> createAdhocQueryAsync(CreateAdhocQueryRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createAdhocQuery);
    }

    /**
     * 创建adhoc查询
     *
     * 创建adhoc查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAdhocQueryRequest 请求对象
     * @return AsyncInvoker<CreateAdhocQueryRequest, CreateAdhocQueryResponse>
     */
    public AsyncInvoker<CreateAdhocQueryRequest, CreateAdhocQueryResponse> createAdhocQueryAsyncInvoker(
        CreateAdhocQueryRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createAdhocQuery, hcClient);
    }

    /**
     * 创建告警规则
     *
     * 创建告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlertRuleRequest 请求对象
     * @return CompletableFuture<CreateAlertRuleResponse>
     */
    public CompletableFuture<CreateAlertRuleResponse> createAlertRuleAsync(CreateAlertRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createAlertRule);
    }

    /**
     * 创建告警规则
     *
     * 创建告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlertRuleRequest 请求对象
     * @return AsyncInvoker<CreateAlertRuleRequest, CreateAlertRuleResponse>
     */
    public AsyncInvoker<CreateAlertRuleRequest, CreateAlertRuleResponse> createAlertRuleAsyncInvoker(
        CreateAlertRuleRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createAlertRule, hcClient);
    }

    /**
     * 创建分析脚本
     *
     * 创建分析脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAnalysisScriptRequest 请求对象
     * @return CompletableFuture<CreateAnalysisScriptResponse>
     */
    public CompletableFuture<CreateAnalysisScriptResponse> createAnalysisScriptAsync(
        CreateAnalysisScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createAnalysisScript);
    }

    /**
     * 创建分析脚本
     *
     * 创建分析脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAnalysisScriptRequest 请求对象
     * @return AsyncInvoker<CreateAnalysisScriptRequest, CreateAnalysisScriptResponse>
     */
    public AsyncInvoker<CreateAnalysisScriptRequest, CreateAnalysisScriptResponse> createAnalysisScriptAsyncInvoker(
        CreateAnalysisScriptRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createAnalysisScript, hcClient);
    }

    /**
     * 创建代码片段
     *
     * 创建代码片段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCodeSegmentRequest 请求对象
     * @return CompletableFuture<CreateCodeSegmentResponse>
     */
    public CompletableFuture<CreateCodeSegmentResponse> createCodeSegmentAsync(CreateCodeSegmentRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createCodeSegment);
    }

    /**
     * 创建代码片段
     *
     * 创建代码片段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCodeSegmentRequest 请求对象
     * @return AsyncInvoker<CreateCodeSegmentRequest, CreateCodeSegmentResponse>
     */
    public AsyncInvoker<CreateCodeSegmentRequest, CreateCodeSegmentResponse> createCodeSegmentAsyncInvoker(
        CreateCodeSegmentRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createCodeSegment, hcClient);
    }

    /**
     * 保存云服务采集配置
     *
     * 保存云服务采集配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCollectConfigRequest 请求对象
     * @return CompletableFuture<CreateCollectConfigResponse>
     */
    public CompletableFuture<CreateCollectConfigResponse> createCollectConfigAsync(CreateCollectConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createCollectConfig);
    }

    /**
     * 保存云服务采集配置
     *
     * 保存云服务采集配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCollectConfigRequest 请求对象
     * @return AsyncInvoker<CreateCollectConfigRequest, CreateCollectConfigResponse>
     */
    public AsyncInvoker<CreateCollectConfigRequest, CreateCollectConfigResponse> createCollectConfigAsyncInvoker(
        CreateCollectConfigRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createCollectConfig, hcClient);
    }

    /**
     * 新增自定义检查项
     *
     * 新增自定义检查项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCustomizedCheckitemRequest 请求对象
     * @return CompletableFuture<CreateCustomizedCheckitemResponse>
     */
    public CompletableFuture<CreateCustomizedCheckitemResponse> createCustomizedCheckitemAsync(
        CreateCustomizedCheckitemRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createCustomizedCheckitem);
    }

    /**
     * 新增自定义检查项
     *
     * 新增自定义检查项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCustomizedCheckitemRequest 请求对象
     * @return AsyncInvoker<CreateCustomizedCheckitemRequest, CreateCustomizedCheckitemResponse>
     */
    public AsyncInvoker<CreateCustomizedCheckitemRequest, CreateCustomizedCheckitemResponse> createCustomizedCheckitemAsyncInvoker(
        CreateCustomizedCheckitemRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createCustomizedCheckitem, hcClient);
    }

    /**
     * 新增自定义遵从包
     *
     * 新增自定义遵从包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCustomizedCompliancePackageRequest 请求对象
     * @return CompletableFuture<CreateCustomizedCompliancePackageResponse>
     */
    public CompletableFuture<CreateCustomizedCompliancePackageResponse> createCustomizedCompliancePackageAsync(
        CreateCustomizedCompliancePackageRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createCustomizedCompliancePackage);
    }

    /**
     * 新增自定义遵从包
     *
     * 新增自定义遵从包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCustomizedCompliancePackageRequest 请求对象
     * @return AsyncInvoker<CreateCustomizedCompliancePackageRequest, CreateCustomizedCompliancePackageResponse>
     */
    public AsyncInvoker<CreateCustomizedCompliancePackageRequest, CreateCustomizedCompliancePackageResponse> createCustomizedCompliancePackageAsyncInvoker(
        CreateCustomizedCompliancePackageRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createCustomizedCompliancePackage, hcClient);
    }

    /**
     * 创建数据加工
     *
     * 创建数据加工
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataTransformationRequest 请求对象
     * @return CompletableFuture<CreateDataTransformationResponse>
     */
    public CompletableFuture<CreateDataTransformationResponse> createDataTransformationAsync(
        CreateDataTransformationRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createDataTransformation);
    }

    /**
     * 创建数据加工
     *
     * 创建数据加工
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataTransformationRequest 请求对象
     * @return AsyncInvoker<CreateDataTransformationRequest, CreateDataTransformationResponse>
     */
    public AsyncInvoker<CreateDataTransformationRequest, CreateDataTransformationResponse> createDataTransformationAsyncInvoker(
        CreateDataTransformationRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createDataTransformation, hcClient);
    }

    /**
     * 创建布局字段
     *
     * 创建布局字段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLayoutFieldRequest 请求对象
     * @return CompletableFuture<CreateLayoutFieldResponse>
     */
    public CompletableFuture<CreateLayoutFieldResponse> createLayoutFieldAsync(CreateLayoutFieldRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createLayoutField);
    }

    /**
     * 创建布局字段
     *
     * 创建布局字段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLayoutFieldRequest 请求对象
     * @return AsyncInvoker<CreateLayoutFieldRequest, CreateLayoutFieldResponse>
     */
    public AsyncInvoker<CreateLayoutFieldRequest, CreateLayoutFieldResponse> createLayoutFieldAsyncInvoker(
        CreateLayoutFieldRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createLayoutField, hcClient);
    }

    /**
     * 创建管道
     *
     * 创建管道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePipeRequest 请求对象
     * @return CompletableFuture<CreatePipeResponse>
     */
    public CompletableFuture<CreatePipeResponse> createPipeAsync(CreatePipeRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createPipe);
    }

    /**
     * 创建管道
     *
     * 创建管道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePipeRequest 请求对象
     * @return AsyncInvoker<CreatePipeRequest, CreatePipeResponse>
     */
    public AsyncInvoker<CreatePipeRequest, CreatePipeResponse> createPipeAsyncInvoker(CreatePipeRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createPipe, hcClient);
    }

    /**
     * 创建检索脚本
     *
     * 创建检索脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRetrieveScriptRequest 请求对象
     * @return CompletableFuture<CreateRetrieveScriptResponse>
     */
    public CompletableFuture<CreateRetrieveScriptResponse> createRetrieveScriptAsync(
        CreateRetrieveScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createRetrieveScript);
    }

    /**
     * 创建检索脚本
     *
     * 创建检索脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRetrieveScriptRequest 请求对象
     * @return AsyncInvoker<CreateRetrieveScriptRequest, CreateRetrieveScriptResponse>
     */
    public AsyncInvoker<CreateRetrieveScriptRequest, CreateRetrieveScriptResponse> createRetrieveScriptAsyncInvoker(
        CreateRetrieveScriptRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createRetrieveScript, hcClient);
    }

    /**
     * Adhoc sql参数渲染
     *
     * Adhoc sql参数渲染
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSqlRenderRequest 请求对象
     * @return CompletableFuture<CreateSqlRenderResponse>
     */
    public CompletableFuture<CreateSqlRenderResponse> createSqlRenderAsync(CreateSqlRenderRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createSqlRender);
    }

    /**
     * Adhoc sql参数渲染
     *
     * Adhoc sql参数渲染
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSqlRenderRequest 请求对象
     * @return AsyncInvoker<CreateSqlRenderRequest, CreateSqlRenderResponse>
     */
    public AsyncInvoker<CreateSqlRenderRequest, CreateSqlRenderResponse> createSqlRenderAsyncInvoker(
        CreateSqlRenderRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createSqlRender, hcClient);
    }

    /**
     * 创建表
     *
     * 创建表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTableRequest 请求对象
     * @return CompletableFuture<CreateTableResponse>
     */
    public CompletableFuture<CreateTableResponse> createTableAsync(CreateTableRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createTable);
    }

    /**
     * 创建表
     *
     * 创建表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTableRequest 请求对象
     * @return AsyncInvoker<CreateTableRequest, CreateTableResponse>
     */
    public AsyncInvoker<CreateTableRequest, CreateTableResponse> createTableAsyncInvoker(CreateTableRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createTable, hcClient);
    }

    /**
     * 创建安全分析查询
     *
     * 创建安全分析查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTableAnalysisRequest 请求对象
     * @return CompletableFuture<CreateTableAnalysisResponse>
     */
    public CompletableFuture<CreateTableAnalysisResponse> createTableAnalysisAsync(CreateTableAnalysisRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createTableAnalysis);
    }

    /**
     * 创建安全分析查询
     *
     * 创建安全分析查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTableAnalysisRequest 请求对象
     * @return AsyncInvoker<CreateTableAnalysisRequest, CreateTableAnalysisResponse>
     */
    public AsyncInvoker<CreateTableAnalysisRequest, CreateTableAnalysisResponse> createTableAnalysisAsyncInvoker(
        CreateTableAnalysisRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createTableAnalysis, hcClient);
    }

    /**
     * 关闭查询操作
     *
     * 关闭查询操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAdhocQueryRequest 请求对象
     * @return CompletableFuture<DeleteAdhocQueryResponse>
     */
    public CompletableFuture<DeleteAdhocQueryResponse> deleteAdhocQueryAsync(DeleteAdhocQueryRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteAdhocQuery);
    }

    /**
     * 关闭查询操作
     *
     * 关闭查询操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAdhocQueryRequest 请求对象
     * @return AsyncInvoker<DeleteAdhocQueryRequest, DeleteAdhocQueryResponse>
     */
    public AsyncInvoker<DeleteAdhocQueryRequest, DeleteAdhocQueryResponse> deleteAdhocQueryAsyncInvoker(
        DeleteAdhocQueryRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteAdhocQuery, hcClient);
    }

    /**
     * 删除告警规则
     *
     * 删除告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlertRuleRequest 请求对象
     * @return CompletableFuture<DeleteAlertRuleResponse>
     */
    public CompletableFuture<DeleteAlertRuleResponse> deleteAlertRuleAsync(DeleteAlertRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteAlertRule);
    }

    /**
     * 删除告警规则
     *
     * 删除告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAlertRuleRequest 请求对象
     * @return AsyncInvoker<DeleteAlertRuleRequest, DeleteAlertRuleResponse>
     */
    public AsyncInvoker<DeleteAlertRuleRequest, DeleteAlertRuleResponse> deleteAlertRuleAsyncInvoker(
        DeleteAlertRuleRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteAlertRule, hcClient);
    }

    /**
     * 删除分析脚本
     *
     * 删除分析脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAnalysisScriptRequest 请求对象
     * @return CompletableFuture<DeleteAnalysisScriptResponse>
     */
    public CompletableFuture<DeleteAnalysisScriptResponse> deleteAnalysisScriptAsync(
        DeleteAnalysisScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteAnalysisScript);
    }

    /**
     * 删除分析脚本
     *
     * 删除分析脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAnalysisScriptRequest 请求对象
     * @return AsyncInvoker<DeleteAnalysisScriptRequest, DeleteAnalysisScriptResponse>
     */
    public AsyncInvoker<DeleteAnalysisScriptRequest, DeleteAnalysisScriptResponse> deleteAnalysisScriptAsyncInvoker(
        DeleteAnalysisScriptRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteAnalysisScript, hcClient);
    }

    /**
     * 删除代码片段
     *
     * 删除代码片段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCodeSegmentRequest 请求对象
     * @return CompletableFuture<DeleteCodeSegmentResponse>
     */
    public CompletableFuture<DeleteCodeSegmentResponse> deleteCodeSegmentAsync(DeleteCodeSegmentRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteCodeSegment);
    }

    /**
     * 删除代码片段
     *
     * 删除代码片段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCodeSegmentRequest 请求对象
     * @return AsyncInvoker<DeleteCodeSegmentRequest, DeleteCodeSegmentResponse>
     */
    public AsyncInvoker<DeleteCodeSegmentRequest, DeleteCodeSegmentResponse> deleteCodeSegmentAsyncInvoker(
        DeleteCodeSegmentRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteCodeSegment, hcClient);
    }

    /**
     * 删除自定义检查项
     *
     * 删除自定义检查项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCustomizedCheckitemsRequest 请求对象
     * @return CompletableFuture<DeleteCustomizedCheckitemsResponse>
     */
    public CompletableFuture<DeleteCustomizedCheckitemsResponse> deleteCustomizedCheckitemsAsync(
        DeleteCustomizedCheckitemsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteCustomizedCheckitems);
    }

    /**
     * 删除自定义检查项
     *
     * 删除自定义检查项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCustomizedCheckitemsRequest 请求对象
     * @return AsyncInvoker<DeleteCustomizedCheckitemsRequest, DeleteCustomizedCheckitemsResponse>
     */
    public AsyncInvoker<DeleteCustomizedCheckitemsRequest, DeleteCustomizedCheckitemsResponse> deleteCustomizedCheckitemsAsyncInvoker(
        DeleteCustomizedCheckitemsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteCustomizedCheckitems, hcClient);
    }

    /**
     * 删除自定义遵从包
     *
     * 删除自定义遵从包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCustomizedCompliancePackagesRequest 请求对象
     * @return CompletableFuture<DeleteCustomizedCompliancePackagesResponse>
     */
    public CompletableFuture<DeleteCustomizedCompliancePackagesResponse> deleteCustomizedCompliancePackagesAsync(
        DeleteCustomizedCompliancePackagesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteCustomizedCompliancePackages);
    }

    /**
     * 删除自定义遵从包
     *
     * 删除自定义遵从包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCustomizedCompliancePackagesRequest 请求对象
     * @return AsyncInvoker<DeleteCustomizedCompliancePackagesRequest, DeleteCustomizedCompliancePackagesResponse>
     */
    public AsyncInvoker<DeleteCustomizedCompliancePackagesRequest, DeleteCustomizedCompliancePackagesResponse> deleteCustomizedCompliancePackagesAsyncInvoker(
        DeleteCustomizedCompliancePackagesRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteCustomizedCompliancePackages, hcClient);
    }

    /**
     * 删除数据加工
     *
     * 删除数据加工
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDataTransformationRequest 请求对象
     * @return CompletableFuture<DeleteDataTransformationResponse>
     */
    public CompletableFuture<DeleteDataTransformationResponse> deleteDataTransformationAsync(
        DeleteDataTransformationRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteDataTransformation);
    }

    /**
     * 删除数据加工
     *
     * 删除数据加工
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDataTransformationRequest 请求对象
     * @return AsyncInvoker<DeleteDataTransformationRequest, DeleteDataTransformationResponse>
     */
    public AsyncInvoker<DeleteDataTransformationRequest, DeleteDataTransformationResponse> deleteDataTransformationAsyncInvoker(
        DeleteDataTransformationRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteDataTransformation, hcClient);
    }

    /**
     * 批量删除布局字段
     *
     * 删除布局字段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLayoutFieldRequest 请求对象
     * @return CompletableFuture<DeleteLayoutFieldResponse>
     */
    public CompletableFuture<DeleteLayoutFieldResponse> deleteLayoutFieldAsync(DeleteLayoutFieldRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteLayoutField);
    }

    /**
     * 批量删除布局字段
     *
     * 删除布局字段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLayoutFieldRequest 请求对象
     * @return AsyncInvoker<DeleteLayoutFieldRequest, DeleteLayoutFieldResponse>
     */
    public AsyncInvoker<DeleteLayoutFieldRequest, DeleteLayoutFieldResponse> deleteLayoutFieldAsyncInvoker(
        DeleteLayoutFieldRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteLayoutField, hcClient);
    }

    /**
     * 删除管道
     *
     * 删除管道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePipeRequest 请求对象
     * @return CompletableFuture<DeletePipeResponse>
     */
    public CompletableFuture<DeletePipeResponse> deletePipeAsync(DeletePipeRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deletePipe);
    }

    /**
     * 删除管道
     *
     * 删除管道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePipeRequest 请求对象
     * @return AsyncInvoker<DeletePipeRequest, DeletePipeResponse>
     */
    public AsyncInvoker<DeletePipeRequest, DeletePipeResponse> deletePipeAsyncInvoker(DeletePipeRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deletePipe, hcClient);
    }

    /**
     * 删除检索脚本
     *
     * 删除检索脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRetrieveScriptRequest 请求对象
     * @return CompletableFuture<DeleteRetrieveScriptResponse>
     */
    public CompletableFuture<DeleteRetrieveScriptResponse> deleteRetrieveScriptAsync(
        DeleteRetrieveScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteRetrieveScript);
    }

    /**
     * 删除检索脚本
     *
     * 删除检索脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRetrieveScriptRequest 请求对象
     * @return AsyncInvoker<DeleteRetrieveScriptRequest, DeleteRetrieveScriptResponse>
     */
    public AsyncInvoker<DeleteRetrieveScriptRequest, DeleteRetrieveScriptResponse> deleteRetrieveScriptAsyncInvoker(
        DeleteRetrieveScriptRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteRetrieveScript, hcClient);
    }

    /**
     * 删除表
     *
     * 删除表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTableRequest 请求对象
     * @return CompletableFuture<DeleteTableResponse>
     */
    public CompletableFuture<DeleteTableResponse> deleteTableAsync(DeleteTableRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.deleteTable);
    }

    /**
     * 删除表
     *
     * 删除表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTableRequest 请求对象
     * @return AsyncInvoker<DeleteTableRequest, DeleteTableResponse>
     */
    public AsyncInvoker<DeleteTableRequest, DeleteTableResponse> deleteTableAsyncInvoker(DeleteTableRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.deleteTable, hcClient);
    }

    /**
     * 停用告警规则
     *
     * 停用告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableAlertRuleRequest 请求对象
     * @return CompletableFuture<DisableAlertRuleResponse>
     */
    public CompletableFuture<DisableAlertRuleResponse> disableAlertRuleAsync(DisableAlertRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.disableAlertRule);
    }

    /**
     * 停用告警规则
     *
     * 停用告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableAlertRuleRequest 请求对象
     * @return AsyncInvoker<DisableAlertRuleRequest, DisableAlertRuleResponse>
     */
    public AsyncInvoker<DisableAlertRuleRequest, DisableAlertRuleResponse> disableAlertRuleAsyncInvoker(
        DisableAlertRuleRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.disableAlertRule, hcClient);
    }

    /**
     * 关闭实时消费
     *
     * 关闭实时消费
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableDataConsumptionRequest 请求对象
     * @return CompletableFuture<DisableDataConsumptionResponse>
     */
    public CompletableFuture<DisableDataConsumptionResponse> disableDataConsumptionAsync(
        DisableDataConsumptionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.disableDataConsumption);
    }

    /**
     * 关闭实时消费
     *
     * 关闭实时消费
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableDataConsumptionRequest 请求对象
     * @return AsyncInvoker<DisableDataConsumptionRequest, DisableDataConsumptionResponse>
     */
    public AsyncInvoker<DisableDataConsumptionRequest, DisableDataConsumptionResponse> disableDataConsumptionAsyncInvoker(
        DisableDataConsumptionRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.disableDataConsumption, hcClient);
    }

    /**
     * 停用数据加工
     *
     * 停用数据加工
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableDataTransformationRequest 请求对象
     * @return CompletableFuture<DisableDataTransformationResponse>
     */
    public CompletableFuture<DisableDataTransformationResponse> disableDataTransformationAsync(
        DisableDataTransformationRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.disableDataTransformation);
    }

    /**
     * 停用数据加工
     *
     * 停用数据加工
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableDataTransformationRequest 请求对象
     * @return AsyncInvoker<DisableDataTransformationRequest, DisableDataTransformationResponse>
     */
    public AsyncInvoker<DisableDataTransformationRequest, DisableDataTransformationResponse> disableDataTransformationAsyncInvoker(
        DisableDataTransformationRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.disableDataTransformation, hcClient);
    }

    /**
     * 启用告警规则
     *
     * 启用告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableAlertRuleRequest 请求对象
     * @return CompletableFuture<EnableAlertRuleResponse>
     */
    public CompletableFuture<EnableAlertRuleResponse> enableAlertRuleAsync(EnableAlertRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.enableAlertRule);
    }

    /**
     * 启用告警规则
     *
     * 启用告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableAlertRuleRequest 请求对象
     * @return AsyncInvoker<EnableAlertRuleRequest, EnableAlertRuleResponse>
     */
    public AsyncInvoker<EnableAlertRuleRequest, EnableAlertRuleResponse> enableAlertRuleAsyncInvoker(
        EnableAlertRuleRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.enableAlertRule, hcClient);
    }

    /**
     * 开启实时消费
     *
     * 开启实时消费
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDataConsumptionRequest 请求对象
     * @return CompletableFuture<EnableDataConsumptionResponse>
     */
    public CompletableFuture<EnableDataConsumptionResponse> enableDataConsumptionAsync(
        EnableDataConsumptionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.enableDataConsumption);
    }

    /**
     * 开启实时消费
     *
     * 开启实时消费
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDataConsumptionRequest 请求对象
     * @return AsyncInvoker<EnableDataConsumptionRequest, EnableDataConsumptionResponse>
     */
    public AsyncInvoker<EnableDataConsumptionRequest, EnableDataConsumptionResponse> enableDataConsumptionAsyncInvoker(
        EnableDataConsumptionRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.enableDataConsumption, hcClient);
    }

    /**
     * 启用数据加工
     *
     * 启用数据加工
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDataTransformationRequest 请求对象
     * @return CompletableFuture<EnableDataTransformationResponse>
     */
    public CompletableFuture<EnableDataTransformationResponse> enableDataTransformationAsync(
        EnableDataTransformationRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.enableDataTransformation);
    }

    /**
     * 启用数据加工
     *
     * 启用数据加工
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDataTransformationRequest 请求对象
     * @return AsyncInvoker<EnableDataTransformationRequest, EnableDataTransformationResponse>
     */
    public AsyncInvoker<EnableDataTransformationRequest, EnableDataTransformationResponse> enableDataTransformationAsyncInvoker(
        EnableDataTransformationRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.enableDataTransformation, hcClient);
    }

    /**
     * 告警规则总览
     *
     * 告警规则总览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRuleMetricsRequest 请求对象
     * @return CompletableFuture<ListAlertRuleMetricsResponse>
     */
    public CompletableFuture<ListAlertRuleMetricsResponse> listAlertRuleMetricsAsync(
        ListAlertRuleMetricsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listAlertRuleMetrics);
    }

    /**
     * 告警规则总览
     *
     * 告警规则总览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRuleMetricsRequest 请求对象
     * @return AsyncInvoker<ListAlertRuleMetricsRequest, ListAlertRuleMetricsResponse>
     */
    public AsyncInvoker<ListAlertRuleMetricsRequest, ListAlertRuleMetricsResponse> listAlertRuleMetricsAsyncInvoker(
        ListAlertRuleMetricsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listAlertRuleMetrics, hcClient);
    }

    /**
     * 列出告警规则模板总览
     *
     * 列出告警规则模板总览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRuleTemplateMetricsRequest 请求对象
     * @return CompletableFuture<ListAlertRuleTemplateMetricsResponse>
     */
    public CompletableFuture<ListAlertRuleTemplateMetricsResponse> listAlertRuleTemplateMetricsAsync(
        ListAlertRuleTemplateMetricsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listAlertRuleTemplateMetrics);
    }

    /**
     * 列出告警规则模板总览
     *
     * 列出告警规则模板总览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRuleTemplateMetricsRequest 请求对象
     * @return AsyncInvoker<ListAlertRuleTemplateMetricsRequest, ListAlertRuleTemplateMetricsResponse>
     */
    public AsyncInvoker<ListAlertRuleTemplateMetricsRequest, ListAlertRuleTemplateMetricsResponse> listAlertRuleTemplateMetricsAsyncInvoker(
        ListAlertRuleTemplateMetricsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listAlertRuleTemplateMetrics, hcClient);
    }

    /**
     * 列出告警规则模板
     *
     * 列出告警规则模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRuleTemplatesRequest 请求对象
     * @return CompletableFuture<ListAlertRuleTemplatesResponse>
     */
    public CompletableFuture<ListAlertRuleTemplatesResponse> listAlertRuleTemplatesAsync(
        ListAlertRuleTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listAlertRuleTemplates);
    }

    /**
     * 列出告警规则模板
     *
     * 列出告警规则模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRuleTemplatesRequest 请求对象
     * @return AsyncInvoker<ListAlertRuleTemplatesRequest, ListAlertRuleTemplatesResponse>
     */
    public AsyncInvoker<ListAlertRuleTemplatesRequest, ListAlertRuleTemplatesResponse> listAlertRuleTemplatesAsyncInvoker(
        ListAlertRuleTemplatesRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listAlertRuleTemplates, hcClient);
    }

    /**
     * 列出告警规则
     *
     * 列出告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRulesRequest 请求对象
     * @return CompletableFuture<ListAlertRulesResponse>
     */
    public CompletableFuture<ListAlertRulesResponse> listAlertRulesAsync(ListAlertRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listAlertRules);
    }

    /**
     * 列出告警规则
     *
     * 列出告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertRulesRequest 请求对象
     * @return AsyncInvoker<ListAlertRulesRequest, ListAlertRulesResponse>
     */
    public AsyncInvoker<ListAlertRulesRequest, ListAlertRulesResponse> listAlertRulesAsyncInvoker(
        ListAlertRulesRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listAlertRules, hcClient);
    }

    /**
     * 列出分析脚本
     *
     * 列出分析脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAnalysisScriptsRequest 请求对象
     * @return CompletableFuture<ListAnalysisScriptsResponse>
     */
    public CompletableFuture<ListAnalysisScriptsResponse> listAnalysisScriptsAsync(ListAnalysisScriptsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listAnalysisScripts);
    }

    /**
     * 列出分析脚本
     *
     * 列出分析脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAnalysisScriptsRequest 请求对象
     * @return AsyncInvoker<ListAnalysisScriptsRequest, ListAnalysisScriptsResponse>
     */
    public AsyncInvoker<ListAnalysisScriptsRequest, ListAnalysisScriptsResponse> listAnalysisScriptsAsyncInvoker(
        ListAnalysisScriptsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listAnalysisScripts, hcClient);
    }

    /**
     * 列出代码片段
     *
     * 列出代码片段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCodeSegmentsRequest 请求对象
     * @return CompletableFuture<ListCodeSegmentsResponse>
     */
    public CompletableFuture<ListCodeSegmentsResponse> listCodeSegmentsAsync(ListCodeSegmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listCodeSegments);
    }

    /**
     * 列出代码片段
     *
     * 列出代码片段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCodeSegmentsRequest 请求对象
     * @return AsyncInvoker<ListCodeSegmentsRequest, ListCodeSegmentsResponse>
     */
    public AsyncInvoker<ListCodeSegmentsRequest, ListCodeSegmentsResponse> listCodeSegmentsAsyncInvoker(
        ListCodeSegmentsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listCodeSegments, hcClient);
    }

    /**
     * 获取云服务采集配置
     *
     * 获取云服务采集配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectConfigRequest 请求对象
     * @return CompletableFuture<ListCollectConfigResponse>
     */
    public CompletableFuture<ListCollectConfigResponse> listCollectConfigAsync(ListCollectConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listCollectConfig);
    }

    /**
     * 获取云服务采集配置
     *
     * 获取云服务采集配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollectConfigRequest 请求对象
     * @return AsyncInvoker<ListCollectConfigRequest, ListCollectConfigResponse>
     */
    public AsyncInvoker<ListCollectConfigRequest, ListCollectConfigResponse> listCollectConfigAsyncInvoker(
        ListCollectConfigRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listCollectConfig, hcClient);
    }

    /**
     * 数据加工总览
     *
     * 数据加工总览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataTransformationMetricsRequest 请求对象
     * @return CompletableFuture<ListDataTransformationMetricsResponse>
     */
    public CompletableFuture<ListDataTransformationMetricsResponse> listDataTransformationMetricsAsync(
        ListDataTransformationMetricsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listDataTransformationMetrics);
    }

    /**
     * 数据加工总览
     *
     * 数据加工总览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataTransformationMetricsRequest 请求对象
     * @return AsyncInvoker<ListDataTransformationMetricsRequest, ListDataTransformationMetricsResponse>
     */
    public AsyncInvoker<ListDataTransformationMetricsRequest, ListDataTransformationMetricsResponse> listDataTransformationMetricsAsyncInvoker(
        ListDataTransformationMetricsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listDataTransformationMetrics, hcClient);
    }

    /**
     * 列出数据加工
     *
     * 列出数据加工
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataTransformationsRequest 请求对象
     * @return CompletableFuture<ListDataTransformationsResponse>
     */
    public CompletableFuture<ListDataTransformationsResponse> listDataTransformationsAsync(
        ListDataTransformationsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listDataTransformations);
    }

    /**
     * 列出数据加工
     *
     * 列出数据加工
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDataTransformationsRequest 请求对象
     * @return AsyncInvoker<ListDataTransformationsRequest, ListDataTransformationsResponse>
     */
    public AsyncInvoker<ListDataTransformationsRequest, ListDataTransformationsResponse> listDataTransformationsAsyncInvoker(
        ListDataTransformationsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listDataTransformations, hcClient);
    }

    /**
     * 列出目录分组
     *
     * 列出目录分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDirectoriesRequest 请求对象
     * @return CompletableFuture<ListDirectoriesResponse>
     */
    public CompletableFuture<ListDirectoriesResponse> listDirectoriesAsync(ListDirectoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listDirectories);
    }

    /**
     * 列出目录分组
     *
     * 列出目录分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDirectoriesRequest 请求对象
     * @return AsyncInvoker<ListDirectoriesRequest, ListDirectoriesResponse>
     */
    public AsyncInvoker<ListDirectoriesRequest, ListDirectoriesResponse> listDirectoriesAsyncInvoker(
        ListDirectoriesRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listDirectories, hcClient);
    }

    /**
     * 全部布局字段
     *
     * 查询布局字段列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLayoutFieldAllRequest 请求对象
     * @return CompletableFuture<ListLayoutFieldAllResponse>
     */
    public CompletableFuture<ListLayoutFieldAllResponse> listLayoutFieldAllAsync(ListLayoutFieldAllRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listLayoutFieldAll);
    }

    /**
     * 全部布局字段
     *
     * 查询布局字段列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLayoutFieldAllRequest 请求对象
     * @return AsyncInvoker<ListLayoutFieldAllRequest, ListLayoutFieldAllResponse>
     */
    public AsyncInvoker<ListLayoutFieldAllRequest, ListLayoutFieldAllResponse> listLayoutFieldAllAsyncInvoker(
        ListLayoutFieldAllRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listLayoutFieldAll, hcClient);
    }

    /**
     * 获取管道列表
     *
     * 获取管道列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPipesRequest 请求对象
     * @return CompletableFuture<ListPipesResponse>
     */
    public CompletableFuture<ListPipesResponse> listPipesAsync(ListPipesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listPipes);
    }

    /**
     * 获取管道列表
     *
     * 获取管道列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPipesRequest 请求对象
     * @return AsyncInvoker<ListPipesRequest, ListPipesResponse>
     */
    public AsyncInvoker<ListPipesRequest, ListPipesResponse> listPipesAsyncInvoker(ListPipesRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listPipes, hcClient);
    }

    /**
     * 列出检索脚本
     *
     * 列出检索脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRetrieveScriptsRequest 请求对象
     * @return CompletableFuture<ListRetrieveScriptsResponse>
     */
    public CompletableFuture<ListRetrieveScriptsResponse> listRetrieveScriptsAsync(ListRetrieveScriptsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listRetrieveScripts);
    }

    /**
     * 列出检索脚本
     *
     * 列出检索脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRetrieveScriptsRequest 请求对象
     * @return AsyncInvoker<ListRetrieveScriptsRequest, ListRetrieveScriptsResponse>
     */
    public AsyncInvoker<ListRetrieveScriptsRequest, ListRetrieveScriptsResponse> listRetrieveScriptsAsyncInvoker(
        ListRetrieveScriptsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listRetrieveScripts, hcClient);
    }

    /**
     * 检索表直方图
     *
     * 检索表直方图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTableHistogramsRequest 请求对象
     * @return CompletableFuture<ListTableHistogramsResponse>
     */
    public CompletableFuture<ListTableHistogramsResponse> listTableHistogramsAsync(ListTableHistogramsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listTableHistograms);
    }

    /**
     * 检索表直方图
     *
     * 检索表直方图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTableHistogramsRequest 请求对象
     * @return AsyncInvoker<ListTableHistogramsRequest, ListTableHistogramsResponse>
     */
    public AsyncInvoker<ListTableHistogramsRequest, ListTableHistogramsResponse> listTableHistogramsAsyncInvoker(
        ListTableHistogramsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listTableHistograms, hcClient);
    }

    /**
     * 检索表日志
     *
     * 检索表日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTableLogsRequest 请求对象
     * @return CompletableFuture<ListTableLogsResponse>
     */
    public CompletableFuture<ListTableLogsResponse> listTableLogsAsync(ListTableLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listTableLogs);
    }

    /**
     * 检索表日志
     *
     * 检索表日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTableLogsRequest 请求对象
     * @return AsyncInvoker<ListTableLogsRequest, ListTableLogsResponse>
     */
    public AsyncInvoker<ListTableLogsRequest, ListTableLogsResponse> listTableLogsAsyncInvoker(
        ListTableLogsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listTableLogs, hcClient);
    }

    /**
     * 获取表列表
     *
     * 获取表列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTablesRequest 请求对象
     * @return CompletableFuture<ListTablesResponse>
     */
    public CompletableFuture<ListTablesResponse> listTablesAsync(ListTablesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.listTables);
    }

    /**
     * 获取表列表
     *
     * 获取表列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTablesRequest 请求对象
     * @return AsyncInvoker<ListTablesRequest, ListTablesResponse>
     */
    public AsyncInvoker<ListTablesRequest, ListTablesResponse> listTablesAsyncInvoker(ListTablesRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.listTables, hcClient);
    }

    /**
     * 搜索基线检查结果列表
     *
     * 搜索基线检查结果列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchBaselineRequest 请求对象
     * @return CompletableFuture<SearchBaselineResponse>
     */
    public CompletableFuture<SearchBaselineResponse> searchBaselineAsync(SearchBaselineRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.searchBaseline);
    }

    /**
     * 搜索基线检查结果列表
     *
     * 搜索基线检查结果列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchBaselineRequest 请求对象
     * @return AsyncInvoker<SearchBaselineRequest, SearchBaselineResponse>
     */
    public AsyncInvoker<SearchBaselineRequest, SearchBaselineResponse> searchBaselineAsyncInvoker(
        SearchBaselineRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.searchBaseline, hcClient);
    }

    /**
     * 查询检查项列表
     *
     * 查询检查项列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCheckitemsRequest 请求对象
     * @return CompletableFuture<SearchCheckitemsResponse>
     */
    public CompletableFuture<SearchCheckitemsResponse> searchCheckitemsAsync(SearchCheckitemsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.searchCheckitems);
    }

    /**
     * 查询检查项列表
     *
     * 查询检查项列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCheckitemsRequest 请求对象
     * @return AsyncInvoker<SearchCheckitemsRequest, SearchCheckitemsResponse>
     */
    public AsyncInvoker<SearchCheckitemsRequest, SearchCheckitemsResponse> searchCheckitemsAsyncInvoker(
        SearchCheckitemsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.searchCheckitems, hcClient);
    }

    /**
     * 查询遵从包列表
     *
     * 查询遵从包列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCompliancePackagesRequest 请求对象
     * @return CompletableFuture<SearchCompliancePackagesResponse>
     */
    public CompletableFuture<SearchCompliancePackagesResponse> searchCompliancePackagesAsync(
        SearchCompliancePackagesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.searchCompliancePackages);
    }

    /**
     * 查询遵从包列表
     *
     * 查询遵从包列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCompliancePackagesRequest 请求对象
     * @return AsyncInvoker<SearchCompliancePackagesRequest, SearchCompliancePackagesResponse>
     */
    public AsyncInvoker<SearchCompliancePackagesRequest, SearchCompliancePackagesResponse> searchCompliancePackagesAsyncInvoker(
        SearchCompliancePackagesRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.searchCompliancePackages, hcClient);
    }

    /**
     * 获取adhoc查询结果
     *
     * 获取adhoc查询结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAdhocResultRequest 请求对象
     * @return CompletableFuture<ShowAdhocResultResponse>
     */
    public CompletableFuture<ShowAdhocResultResponse> showAdhocResultAsync(ShowAdhocResultRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showAdhocResult);
    }

    /**
     * 获取adhoc查询结果
     *
     * 获取adhoc查询结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAdhocResultRequest 请求对象
     * @return AsyncInvoker<ShowAdhocResultRequest, ShowAdhocResultResponse>
     */
    public AsyncInvoker<ShowAdhocResultRequest, ShowAdhocResultResponse> showAdhocResultAsyncInvoker(
        ShowAdhocResultRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showAdhocResult, hcClient);
    }

    /**
     * 查看告警规则
     *
     * 查看告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlertRuleRequest 请求对象
     * @return CompletableFuture<ShowAlertRuleResponse>
     */
    public CompletableFuture<ShowAlertRuleResponse> showAlertRuleAsync(ShowAlertRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showAlertRule);
    }

    /**
     * 查看告警规则
     *
     * 查看告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlertRuleRequest 请求对象
     * @return AsyncInvoker<ShowAlertRuleRequest, ShowAlertRuleResponse>
     */
    public AsyncInvoker<ShowAlertRuleRequest, ShowAlertRuleResponse> showAlertRuleAsyncInvoker(
        ShowAlertRuleRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showAlertRule, hcClient);
    }

    /**
     * 查看告警规则模板
     *
     * 查看告警规则模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlertRuleTemplateRequest 请求对象
     * @return CompletableFuture<ShowAlertRuleTemplateResponse>
     */
    public CompletableFuture<ShowAlertRuleTemplateResponse> showAlertRuleTemplateAsync(
        ShowAlertRuleTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showAlertRuleTemplate);
    }

    /**
     * 查看告警规则模板
     *
     * 查看告警规则模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlertRuleTemplateRequest 请求对象
     * @return AsyncInvoker<ShowAlertRuleTemplateRequest, ShowAlertRuleTemplateResponse>
     */
    public AsyncInvoker<ShowAlertRuleTemplateRequest, ShowAlertRuleTemplateResponse> showAlertRuleTemplateAsyncInvoker(
        ShowAlertRuleTemplateRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showAlertRuleTemplate, hcClient);
    }

    /**
     * 查看分析脚本
     *
     * 查看分析脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAnalysisScriptRequest 请求对象
     * @return CompletableFuture<ShowAnalysisScriptResponse>
     */
    public CompletableFuture<ShowAnalysisScriptResponse> showAnalysisScriptAsync(ShowAnalysisScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showAnalysisScript);
    }

    /**
     * 查看分析脚本
     *
     * 查看分析脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAnalysisScriptRequest 请求对象
     * @return AsyncInvoker<ShowAnalysisScriptRequest, ShowAnalysisScriptResponse>
     */
    public AsyncInvoker<ShowAnalysisScriptRequest, ShowAnalysisScriptResponse> showAnalysisScriptAsyncInvoker(
        ShowAnalysisScriptRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showAnalysisScript, hcClient);
    }

    /**
     * 查询检查项详情
     *
     * 查询检查项详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCheckitemDetailRequest 请求对象
     * @return CompletableFuture<ShowCheckitemDetailResponse>
     */
    public CompletableFuture<ShowCheckitemDetailResponse> showCheckitemDetailAsync(ShowCheckitemDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showCheckitemDetail);
    }

    /**
     * 查询检查项详情
     *
     * 查询检查项详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCheckitemDetailRequest 请求对象
     * @return AsyncInvoker<ShowCheckitemDetailRequest, ShowCheckitemDetailResponse>
     */
    public AsyncInvoker<ShowCheckitemDetailRequest, ShowCheckitemDetailResponse> showCheckitemDetailAsyncInvoker(
        ShowCheckitemDetailRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showCheckitemDetail, hcClient);
    }

    /**
     * 查看代码片段
     *
     * 查看代码片段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCodeSegmentRequest 请求对象
     * @return CompletableFuture<ShowCodeSegmentResponse>
     */
    public CompletableFuture<ShowCodeSegmentResponse> showCodeSegmentAsync(ShowCodeSegmentRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showCodeSegment);
    }

    /**
     * 查看代码片段
     *
     * 查看代码片段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCodeSegmentRequest 请求对象
     * @return AsyncInvoker<ShowCodeSegmentRequest, ShowCodeSegmentResponse>
     */
    public AsyncInvoker<ShowCodeSegmentRequest, ShowCodeSegmentResponse> showCodeSegmentAsyncInvoker(
        ShowCodeSegmentRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showCodeSegment, hcClient);
    }

    /**
     * 查询遵从包详情
     *
     * 查询遵从包详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCompliancePackageDetailRequest 请求对象
     * @return CompletableFuture<ShowCompliancePackageDetailResponse>
     */
    public CompletableFuture<ShowCompliancePackageDetailResponse> showCompliancePackageDetailAsync(
        ShowCompliancePackageDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showCompliancePackageDetail);
    }

    /**
     * 查询遵从包详情
     *
     * 查询遵从包详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCompliancePackageDetailRequest 请求对象
     * @return AsyncInvoker<ShowCompliancePackageDetailRequest, ShowCompliancePackageDetailResponse>
     */
    public AsyncInvoker<ShowCompliancePackageDetailRequest, ShowCompliancePackageDetailResponse> showCompliancePackageDetailAsyncInvoker(
        ShowCompliancePackageDetailRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showCompliancePackageDetail, hcClient);
    }

    /**
     * 获取实时消费配置
     *
     * 获取实时消费配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataConsumptionRequest 请求对象
     * @return CompletableFuture<ShowDataConsumptionResponse>
     */
    public CompletableFuture<ShowDataConsumptionResponse> showDataConsumptionAsync(ShowDataConsumptionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showDataConsumption);
    }

    /**
     * 获取实时消费配置
     *
     * 获取实时消费配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataConsumptionRequest 请求对象
     * @return AsyncInvoker<ShowDataConsumptionRequest, ShowDataConsumptionResponse>
     */
    public AsyncInvoker<ShowDataConsumptionRequest, ShowDataConsumptionResponse> showDataConsumptionAsyncInvoker(
        ShowDataConsumptionRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showDataConsumption, hcClient);
    }

    /**
     * 查看数据加工
     *
     * 查看数据加工
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataTransformationRequest 请求对象
     * @return CompletableFuture<ShowDataTransformationResponse>
     */
    public CompletableFuture<ShowDataTransformationResponse> showDataTransformationAsync(
        ShowDataTransformationRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showDataTransformation);
    }

    /**
     * 查看数据加工
     *
     * 查看数据加工
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDataTransformationRequest 请求对象
     * @return AsyncInvoker<ShowDataTransformationRequest, ShowDataTransformationResponse>
     */
    public AsyncInvoker<ShowDataTransformationRequest, ShowDataTransformationResponse> showDataTransformationAsyncInvoker(
        ShowDataTransformationRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showDataTransformation, hcClient);
    }

    /**
     * 展示字段详情
     *
     * 查询布局字段详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLayoutFieldInfoRequest 请求对象
     * @return CompletableFuture<ShowLayoutFieldInfoResponse>
     */
    public CompletableFuture<ShowLayoutFieldInfoResponse> showLayoutFieldInfoAsync(ShowLayoutFieldInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showLayoutFieldInfo);
    }

    /**
     * 展示字段详情
     *
     * 查询布局字段详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLayoutFieldInfoRequest 请求对象
     * @return AsyncInvoker<ShowLayoutFieldInfoRequest, ShowLayoutFieldInfoResponse>
     */
    public AsyncInvoker<ShowLayoutFieldInfoRequest, ShowLayoutFieldInfoResponse> showLayoutFieldInfoAsyncInvoker(
        ShowLayoutFieldInfoRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showLayoutFieldInfo, hcClient);
    }

    /**
     * 获取监控统计信息
     *
     * 获取监控统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMonitorStatsRequest 请求对象
     * @return CompletableFuture<ShowMonitorStatsResponse>
     */
    public CompletableFuture<ShowMonitorStatsResponse> showMonitorStatsAsync(ShowMonitorStatsRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showMonitorStats);
    }

    /**
     * 获取监控统计信息
     *
     * 获取监控统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMonitorStatsRequest 请求对象
     * @return AsyncInvoker<ShowMonitorStatsRequest, ShowMonitorStatsResponse>
     */
    public AsyncInvoker<ShowMonitorStatsRequest, ShowMonitorStatsResponse> showMonitorStatsAsyncInvoker(
        ShowMonitorStatsRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showMonitorStats, hcClient);
    }

    /**
     * 获取管道详情
     *
     * 获取管道详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPipeRequest 请求对象
     * @return CompletableFuture<ShowPipeResponse>
     */
    public CompletableFuture<ShowPipeResponse> showPipeAsync(ShowPipeRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showPipe);
    }

    /**
     * 获取管道详情
     *
     * 获取管道详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPipeRequest 请求对象
     * @return AsyncInvoker<ShowPipeRequest, ShowPipeResponse>
     */
    public AsyncInvoker<ShowPipeRequest, ShowPipeResponse> showPipeAsyncInvoker(ShowPipeRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showPipe, hcClient);
    }

    /**
     * 查看检索脚本
     *
     * 查看检索脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRetrieveScriptRequest 请求对象
     * @return CompletableFuture<ShowRetrieveScriptResponse>
     */
    public CompletableFuture<ShowRetrieveScriptResponse> showRetrieveScriptAsync(ShowRetrieveScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showRetrieveScript);
    }

    /**
     * 查看检索脚本
     *
     * 查看检索脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRetrieveScriptRequest 请求对象
     * @return AsyncInvoker<ShowRetrieveScriptRequest, ShowRetrieveScriptResponse>
     */
    public AsyncInvoker<ShowRetrieveScriptRequest, ShowRetrieveScriptResponse> showRetrieveScriptAsyncInvoker(
        ShowRetrieveScriptRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showRetrieveScript, hcClient);
    }

    /**
     * 获取订阅资源信息
     *
     * 获取订阅资源信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubscriptionResourcesRequest 请求对象
     * @return CompletableFuture<ShowSubscriptionResourcesResponse>
     */
    public CompletableFuture<ShowSubscriptionResourcesResponse> showSubscriptionResourcesAsync(
        ShowSubscriptionResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showSubscriptionResources);
    }

    /**
     * 获取订阅资源信息
     *
     * 获取订阅资源信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubscriptionResourcesRequest 请求对象
     * @return AsyncInvoker<ShowSubscriptionResourcesRequest, ShowSubscriptionResourcesResponse>
     */
    public AsyncInvoker<ShowSubscriptionResourcesRequest, ShowSubscriptionResourcesResponse> showSubscriptionResourcesAsyncInvoker(
        ShowSubscriptionResourcesRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showSubscriptionResources, hcClient);
    }

    /**
     * 获取表详情
     *
     * 获取表详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTableRequest 请求对象
     * @return CompletableFuture<ShowTableResponse>
     */
    public CompletableFuture<ShowTableResponse> showTableAsync(ShowTableRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showTable);
    }

    /**
     * 获取表详情
     *
     * 获取表详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTableRequest 请求对象
     * @return AsyncInvoker<ShowTableRequest, ShowTableResponse>
     */
    public AsyncInvoker<ShowTableRequest, ShowTableResponse> showTableAsyncInvoker(ShowTableRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showTable, hcClient);
    }

    /**
     * 获取当前可用版本
     *
     * 获取当前可用版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVersionRequest 请求对象
     * @return CompletableFuture<ShowVersionResponse>
     */
    public CompletableFuture<ShowVersionResponse> showVersionAsync(ShowVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.showVersion);
    }

    /**
     * 获取当前可用版本
     *
     * 获取当前可用版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVersionRequest 请求对象
     * @return AsyncInvoker<ShowVersionRequest, ShowVersionResponse>
     */
    public AsyncInvoker<ShowVersionRequest, ShowVersionResponse> showVersionAsyncInvoker(ShowVersionRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.showVersion, hcClient);
    }

    /**
     * 更新告警规则
     *
     * 更新告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlertRuleRequest 请求对象
     * @return CompletableFuture<UpdateAlertRuleResponse>
     */
    public CompletableFuture<UpdateAlertRuleResponse> updateAlertRuleAsync(UpdateAlertRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateAlertRule);
    }

    /**
     * 更新告警规则
     *
     * 更新告警规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlertRuleRequest 请求对象
     * @return AsyncInvoker<UpdateAlertRuleRequest, UpdateAlertRuleResponse>
     */
    public AsyncInvoker<UpdateAlertRuleRequest, UpdateAlertRuleResponse> updateAlertRuleAsyncInvoker(
        UpdateAlertRuleRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateAlertRule, hcClient);
    }

    /**
     * 更新分析脚本
     *
     * 更新分析脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAnalysisScriptRequest 请求对象
     * @return CompletableFuture<UpdateAnalysisScriptResponse>
     */
    public CompletableFuture<UpdateAnalysisScriptResponse> updateAnalysisScriptAsync(
        UpdateAnalysisScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateAnalysisScript);
    }

    /**
     * 更新分析脚本
     *
     * 更新分析脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAnalysisScriptRequest 请求对象
     * @return AsyncInvoker<UpdateAnalysisScriptRequest, UpdateAnalysisScriptResponse>
     */
    public AsyncInvoker<UpdateAnalysisScriptRequest, UpdateAnalysisScriptResponse> updateAnalysisScriptAsyncInvoker(
        UpdateAnalysisScriptRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateAnalysisScript, hcClient);
    }

    /**
     * 更新检查项
     *
     * 更新检查项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCheckitemRequest 请求对象
     * @return CompletableFuture<UpdateCheckitemResponse>
     */
    public CompletableFuture<UpdateCheckitemResponse> updateCheckitemAsync(UpdateCheckitemRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateCheckitem);
    }

    /**
     * 更新检查项
     *
     * 更新检查项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCheckitemRequest 请求对象
     * @return AsyncInvoker<UpdateCheckitemRequest, UpdateCheckitemResponse>
     */
    public AsyncInvoker<UpdateCheckitemRequest, UpdateCheckitemResponse> updateCheckitemAsyncInvoker(
        UpdateCheckitemRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateCheckitem, hcClient);
    }

    /**
     * 更新代码片段
     *
     * 更新代码片段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCodeSegmentRequest 请求对象
     * @return CompletableFuture<UpdateCodeSegmentResponse>
     */
    public CompletableFuture<UpdateCodeSegmentResponse> updateCodeSegmentAsync(UpdateCodeSegmentRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateCodeSegment);
    }

    /**
     * 更新代码片段
     *
     * 更新代码片段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCodeSegmentRequest 请求对象
     * @return AsyncInvoker<UpdateCodeSegmentRequest, UpdateCodeSegmentResponse>
     */
    public AsyncInvoker<UpdateCodeSegmentRequest, UpdateCodeSegmentResponse> updateCodeSegmentAsyncInvoker(
        UpdateCodeSegmentRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateCodeSegment, hcClient);
    }

    /**
     * 更新遵从包
     *
     * 更新遵从包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCompliancePackageRequest 请求对象
     * @return CompletableFuture<UpdateCompliancePackageResponse>
     */
    public CompletableFuture<UpdateCompliancePackageResponse> updateCompliancePackageAsync(
        UpdateCompliancePackageRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateCompliancePackage);
    }

    /**
     * 更新遵从包
     *
     * 更新遵从包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCompliancePackageRequest 请求对象
     * @return AsyncInvoker<UpdateCompliancePackageRequest, UpdateCompliancePackageResponse>
     */
    public AsyncInvoker<UpdateCompliancePackageRequest, UpdateCompliancePackageResponse> updateCompliancePackageAsyncInvoker(
        UpdateCompliancePackageRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateCompliancePackage, hcClient);
    }

    /**
     * 更新数据加工
     *
     * 更新数据加工
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDataTransformationRequest 请求对象
     * @return CompletableFuture<UpdateDataTransformationResponse>
     */
    public CompletableFuture<UpdateDataTransformationResponse> updateDataTransformationAsync(
        UpdateDataTransformationRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateDataTransformation);
    }

    /**
     * 更新数据加工
     *
     * 更新数据加工
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDataTransformationRequest 请求对象
     * @return AsyncInvoker<UpdateDataTransformationRequest, UpdateDataTransformationResponse>
     */
    public AsyncInvoker<UpdateDataTransformationRequest, UpdateDataTransformationResponse> updateDataTransformationAsyncInvoker(
        UpdateDataTransformationRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateDataTransformation, hcClient);
    }

    /**
     * 更新字段
     *
     * 更新布局字段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLayoutFieldRequest 请求对象
     * @return CompletableFuture<UpdateLayoutFieldResponse>
     */
    public CompletableFuture<UpdateLayoutFieldResponse> updateLayoutFieldAsync(UpdateLayoutFieldRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateLayoutField);
    }

    /**
     * 更新字段
     *
     * 更新布局字段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLayoutFieldRequest 请求对象
     * @return AsyncInvoker<UpdateLayoutFieldRequest, UpdateLayoutFieldResponse>
     */
    public AsyncInvoker<UpdateLayoutFieldRequest, UpdateLayoutFieldResponse> updateLayoutFieldAsyncInvoker(
        UpdateLayoutFieldRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateLayoutField, hcClient);
    }

    /**
     * 更新管道
     *
     * 更新管道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePipeRequest 请求对象
     * @return CompletableFuture<UpdatePipeResponse>
     */
    public CompletableFuture<UpdatePipeResponse> updatePipeAsync(UpdatePipeRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updatePipe);
    }

    /**
     * 更新管道
     *
     * 更新管道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePipeRequest 请求对象
     * @return AsyncInvoker<UpdatePipeRequest, UpdatePipeResponse>
     */
    public AsyncInvoker<UpdatePipeRequest, UpdatePipeResponse> updatePipeAsyncInvoker(UpdatePipeRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updatePipe, hcClient);
    }

    /**
     * 更新管道结构
     *
     * 更新管道结构
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePipeSchemaRequest 请求对象
     * @return CompletableFuture<UpdatePipeSchemaResponse>
     */
    public CompletableFuture<UpdatePipeSchemaResponse> updatePipeSchemaAsync(UpdatePipeSchemaRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updatePipeSchema);
    }

    /**
     * 更新管道结构
     *
     * 更新管道结构
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePipeSchemaRequest 请求对象
     * @return AsyncInvoker<UpdatePipeSchemaRequest, UpdatePipeSchemaResponse>
     */
    public AsyncInvoker<UpdatePipeSchemaRequest, UpdatePipeSchemaResponse> updatePipeSchemaAsyncInvoker(
        UpdatePipeSchemaRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updatePipeSchema, hcClient);
    }

    /**
     * 更新检索脚本
     *
     * 更新检索脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRetrieveScriptRequest 请求对象
     * @return CompletableFuture<UpdateRetrieveScriptResponse>
     */
    public CompletableFuture<UpdateRetrieveScriptResponse> updateRetrieveScriptAsync(
        UpdateRetrieveScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateRetrieveScript);
    }

    /**
     * 更新检索脚本
     *
     * 更新检索脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRetrieveScriptRequest 请求对象
     * @return AsyncInvoker<UpdateRetrieveScriptRequest, UpdateRetrieveScriptResponse>
     */
    public AsyncInvoker<UpdateRetrieveScriptRequest, UpdateRetrieveScriptResponse> updateRetrieveScriptAsyncInvoker(
        UpdateRetrieveScriptRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateRetrieveScript, hcClient);
    }

    /**
     * 更改表详情
     *
     * 更改表详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTableRequest 请求对象
     * @return CompletableFuture<UpdateTableResponse>
     */
    public CompletableFuture<UpdateTableResponse> updateTableAsync(UpdateTableRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateTable);
    }

    /**
     * 更改表详情
     *
     * 更改表详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTableRequest 请求对象
     * @return AsyncInvoker<UpdateTableRequest, UpdateTableResponse>
     */
    public AsyncInvoker<UpdateTableRequest, UpdateTableResponse> updateTableAsyncInvoker(UpdateTableRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateTable, hcClient);
    }

    /**
     * 更改表结构
     *
     * 更改表结构
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTableSchemaRequest 请求对象
     * @return CompletableFuture<UpdateTableSchemaResponse>
     */
    public CompletableFuture<UpdateTableSchemaResponse> updateTableSchemaAsync(UpdateTableSchemaRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.updateTableSchema);
    }

    /**
     * 更改表结构
     *
     * 更改表结构
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTableSchemaRequest 请求对象
     * @return AsyncInvoker<UpdateTableSchemaRequest, UpdateTableSchemaResponse>
     */
    public AsyncInvoker<UpdateTableSchemaRequest, UpdateTableSchemaResponse> updateTableSchemaAsyncInvoker(
        UpdateTableSchemaRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.updateTableSchema, hcClient);
    }

    /**
     * 创建SQL校验
     *
     * 创建SQL校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSqlValidationRequest 请求对象
     * @return CompletableFuture<CreateSqlValidationResponse>
     */
    public CompletableFuture<CreateSqlValidationResponse> createSqlValidationAsync(CreateSqlValidationRequest request) {
        return hcClient.asyncInvokeHttp(request, SecMasterMeta.createSqlValidation);
    }

    /**
     * 创建SQL校验
     *
     * 创建SQL校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSqlValidationRequest 请求对象
     * @return AsyncInvoker<CreateSqlValidationRequest, CreateSqlValidationResponse>
     */
    public AsyncInvoker<CreateSqlValidationRequest, CreateSqlValidationResponse> createSqlValidationAsyncInvoker(
        CreateSqlValidationRequest request) {
        return new AsyncInvoker<>(request, SecMasterMeta.createSqlValidation, hcClient);
    }

}

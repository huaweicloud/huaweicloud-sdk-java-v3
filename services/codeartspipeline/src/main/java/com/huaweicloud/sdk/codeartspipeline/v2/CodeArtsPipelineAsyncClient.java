package com.huaweicloud.sdk.codeartspipeline.v2;

import com.huaweicloud.sdk.codeartspipeline.v2.model.AcceptManualReviewRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.AcceptManualReviewResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.BatchMovePipelineToGroupRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.BatchMovePipelineToGroupResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.BatchShowPipelinesLatestStatusRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.BatchShowPipelinesLatestStatusResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.BatchShowPipelinesStatusRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.BatchShowPipelinesStatusResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreateBasicPluginRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreateBasicPluginResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreateOpenSourceStrategyRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreateOpenSourceStrategyResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreatePipelineByTemplateIdRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreatePipelineByTemplateIdResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreatePipelineByTemplateRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreatePipelineByTemplateResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreatePipelineGroupRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreatePipelineGroupResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreatePipelineNewRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreatePipelineNewResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreatePipelineTemplateRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreatePipelineTemplateResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreatePluginDraftRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreatePluginDraftResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreatePluginVersionRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreatePluginVersionResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreatePublisherRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreatePublisherResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreateRuleRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreateRuleResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreateStrategyRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreateStrategyResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeleteBasicPluginRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeleteBasicPluginResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeleteOpenSourceStrategyRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeleteOpenSourceStrategyResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeletePipelineGroupRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeletePipelineGroupResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeletePipelineRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeletePipelineResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeletePipelineTemplateRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeletePipelineTemplateResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeletePluginDraftRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeletePluginDraftResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeletePublisherRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeletePublisherResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeleteRuleRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeleteRuleResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeleteStrategyRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeleteStrategyResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListAvailablePublisherRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListAvailablePublisherResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListBasePluginsNewPostRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListBasePluginsNewPostResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListBasePluginsRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListBasePluginsResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListOpenSourceStrategyRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListOpenSourceStrategyResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPLuginVersionRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPLuginVersionResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPipelineRunsRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPipelineRunsResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPipelineSimpleInfoRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPipelineSimpleInfoResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPipelineTemplatesRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPipelineTemplatesResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPipelinesRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPipelinesResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPipleineBuildResultRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPipleineBuildResultResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPluginVersionNumberRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPluginVersionNumberResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPluginsRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPluginsResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListProjectOpenSourceStrategyRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListProjectOpenSourceStrategyResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListProjectStrategyRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListProjectStrategyResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPublisherRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListPublisherResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListRuleRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListRuleResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListStagePluginsRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListStagePluginsResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListStrategyRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListStrategyResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListTemplatesRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListTemplatesResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.PublishPluginBindRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.PublishPluginBindResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.PublishPluginDraftRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.PublishPluginDraftResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.PublishPluginRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.PublishPluginResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.RejectManualReviewRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.RejectManualReviewResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.RemovePipelineRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.RemovePipelineResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.RetryPipelineRunRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.RetryPipelineRunResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.RunPipelineRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.RunPipelineResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowBasicPluginRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowBasicPluginResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowInstanceStatusRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowInstanceStatusResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowOpenSourceStrategyRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowOpenSourceStrategyResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPipelineDetailRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPipelineDetailResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPipelineGroupTreeRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPipelineGroupTreeResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPipelineLogRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPipelineLogResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPipelineRunDetailRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPipelineRunDetailResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPipelineTemplateDetailRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPipelineTemplateDetailResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPipleineStatusRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPipleineStatusResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPluginInputsRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPluginInputsResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPluginMetricsRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPluginMetricsResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPluginOutputsRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPluginOutputsResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPluginVersionRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPluginVersionResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowProjectOpenSourceStrategyRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowProjectOpenSourceStrategyResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowProjectStrategyRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowProjectStrategyResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPublisherRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPublisherResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowRuleRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowRuleResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowStrategyRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowStrategyResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowTemplateDetailRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowTemplateDetailResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.StartNewPipelineRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.StartNewPipelineResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.StopPipelineNewRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.StopPipelineNewResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.StopPipelineRunRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.StopPipelineRunResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.SwitchOpenSourceStrategyRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.SwitchOpenSourceStrategyResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.SwitchStrategyRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.SwitchStrategyResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdateBasicPluginRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdateBasicPluginResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdateOpenSourceStrategyRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdateOpenSourceStrategyResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdatePipelineGroupRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdatePipelineGroupResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdatePipelineTemplateRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdatePipelineTemplateResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdatePluginBaseInfoRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdatePluginBaseInfoResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdatePluginDraftRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdatePluginDraftResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdateRuleRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdateRuleResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdateStrategyRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdateStrategyResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UploadBasicPluginRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UploadBasicPluginResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UploadPluginIconRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UploadPluginIconResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UploadPublisherIconRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UploadPublisherIconResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CodeArtsPipelineAsyncClient {

    protected HcClient hcClient;

    public CodeArtsPipelineAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CodeArtsPipelineAsyncClient> newBuilder() {
        ClientBuilder<CodeArtsPipelineAsyncClient> clientBuilder =
            new ClientBuilder<>(CodeArtsPipelineAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 通过人工审核
     *
     * 通过人工审核
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AcceptManualReviewRequest 请求对象
     * @return CompletableFuture<AcceptManualReviewResponse>
     */
    public CompletableFuture<AcceptManualReviewResponse> acceptManualReviewAsync(AcceptManualReviewRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.acceptManualReview);
    }

    /**
     * 通过人工审核
     *
     * 通过人工审核
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AcceptManualReviewRequest 请求对象
     * @return AsyncInvoker<AcceptManualReviewRequest, AcceptManualReviewResponse>
     */
    public AsyncInvoker<AcceptManualReviewRequest, AcceptManualReviewResponse> acceptManualReviewAsyncInvoker(
        AcceptManualReviewRequest request) {
        return new AsyncInvoker<AcceptManualReviewRequest, AcceptManualReviewResponse>(request,
            CodeArtsPipelineMeta.acceptManualReview, hcClient);
    }

    /**
     * 批量把流水线移动到分组下
     *
     * 批量把流水线移动到分组下
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchMovePipelineToGroupRequest 请求对象
     * @return CompletableFuture<BatchMovePipelineToGroupResponse>
     */
    public CompletableFuture<BatchMovePipelineToGroupResponse> batchMovePipelineToGroupAsync(
        BatchMovePipelineToGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.batchMovePipelineToGroup);
    }

    /**
     * 批量把流水线移动到分组下
     *
     * 批量把流水线移动到分组下
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchMovePipelineToGroupRequest 请求对象
     * @return AsyncInvoker<BatchMovePipelineToGroupRequest, BatchMovePipelineToGroupResponse>
     */
    public AsyncInvoker<BatchMovePipelineToGroupRequest, BatchMovePipelineToGroupResponse> batchMovePipelineToGroupAsyncInvoker(
        BatchMovePipelineToGroupRequest request) {
        return new AsyncInvoker<BatchMovePipelineToGroupRequest, BatchMovePipelineToGroupResponse>(request,
            CodeArtsPipelineMeta.batchMovePipelineToGroup, hcClient);
    }

    /**
     * 批量获取流水线状态
     *
     * 批量获取流水线状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowPipelinesLatestStatusRequest 请求对象
     * @return CompletableFuture<BatchShowPipelinesLatestStatusResponse>
     */
    public CompletableFuture<BatchShowPipelinesLatestStatusResponse> batchShowPipelinesLatestStatusAsync(
        BatchShowPipelinesLatestStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.batchShowPipelinesLatestStatus);
    }

    /**
     * 批量获取流水线状态
     *
     * 批量获取流水线状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowPipelinesLatestStatusRequest 请求对象
     * @return AsyncInvoker<BatchShowPipelinesLatestStatusRequest, BatchShowPipelinesLatestStatusResponse>
     */
    public AsyncInvoker<BatchShowPipelinesLatestStatusRequest, BatchShowPipelinesLatestStatusResponse> batchShowPipelinesLatestStatusAsyncInvoker(
        BatchShowPipelinesLatestStatusRequest request) {
        return new AsyncInvoker<BatchShowPipelinesLatestStatusRequest, BatchShowPipelinesLatestStatusResponse>(request,
            CodeArtsPipelineMeta.batchShowPipelinesLatestStatus, hcClient);
    }

    /**
     * 批量获取流水线状态
     *
     * 批量获取流水线状态和阶段信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowPipelinesStatusRequest 请求对象
     * @return CompletableFuture<BatchShowPipelinesStatusResponse>
     */
    public CompletableFuture<BatchShowPipelinesStatusResponse> batchShowPipelinesStatusAsync(
        BatchShowPipelinesStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.batchShowPipelinesStatus);
    }

    /**
     * 批量获取流水线状态
     *
     * 批量获取流水线状态和阶段信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowPipelinesStatusRequest 请求对象
     * @return AsyncInvoker<BatchShowPipelinesStatusRequest, BatchShowPipelinesStatusResponse>
     */
    public AsyncInvoker<BatchShowPipelinesStatusRequest, BatchShowPipelinesStatusResponse> batchShowPipelinesStatusAsyncInvoker(
        BatchShowPipelinesStatusRequest request) {
        return new AsyncInvoker<BatchShowPipelinesStatusRequest, BatchShowPipelinesStatusResponse>(request,
            CodeArtsPipelineMeta.batchShowPipelinesStatus, hcClient);
    }

    /**
     * 创建基础插件
     *
     * 创建基础插件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateBasicPluginRequest 请求对象
     * @return CompletableFuture<CreateBasicPluginResponse>
     */
    public CompletableFuture<CreateBasicPluginResponse> createBasicPluginAsync(CreateBasicPluginRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.createBasicPlugin);
    }

    /**
     * 创建基础插件
     *
     * 创建基础插件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateBasicPluginRequest 请求对象
     * @return AsyncInvoker<CreateBasicPluginRequest, CreateBasicPluginResponse>
     */
    public AsyncInvoker<CreateBasicPluginRequest, CreateBasicPluginResponse> createBasicPluginAsyncInvoker(
        CreateBasicPluginRequest request) {
        return new AsyncInvoker<CreateBasicPluginRequest, CreateBasicPluginResponse>(request,
            CodeArtsPipelineMeta.createBasicPlugin, hcClient);
    }

    /**
     * 创建租户级开源治理策略
     *
     * 创建租户级开源治理策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateOpenSourceStrategyRequest 请求对象
     * @return CompletableFuture<CreateOpenSourceStrategyResponse>
     */
    public CompletableFuture<CreateOpenSourceStrategyResponse> createOpenSourceStrategyAsync(
        CreateOpenSourceStrategyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.createOpenSourceStrategy);
    }

    /**
     * 创建租户级开源治理策略
     *
     * 创建租户级开源治理策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateOpenSourceStrategyRequest 请求对象
     * @return AsyncInvoker<CreateOpenSourceStrategyRequest, CreateOpenSourceStrategyResponse>
     */
    public AsyncInvoker<CreateOpenSourceStrategyRequest, CreateOpenSourceStrategyResponse> createOpenSourceStrategyAsyncInvoker(
        CreateOpenSourceStrategyRequest request) {
        return new AsyncInvoker<CreateOpenSourceStrategyRequest, CreateOpenSourceStrategyResponse>(request,
            CodeArtsPipelineMeta.createOpenSourceStrategy, hcClient);
    }

    /**
     * 基于模板快速创建流水线及流水线内任务
     *
     * 基于模板快速创建流水线及流水线内任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePipelineByTemplateRequest 请求对象
     * @return CompletableFuture<CreatePipelineByTemplateResponse>
     */
    public CompletableFuture<CreatePipelineByTemplateResponse> createPipelineByTemplateAsync(
        CreatePipelineByTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.createPipelineByTemplate);
    }

    /**
     * 基于模板快速创建流水线及流水线内任务
     *
     * 基于模板快速创建流水线及流水线内任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePipelineByTemplateRequest 请求对象
     * @return AsyncInvoker<CreatePipelineByTemplateRequest, CreatePipelineByTemplateResponse>
     */
    public AsyncInvoker<CreatePipelineByTemplateRequest, CreatePipelineByTemplateResponse> createPipelineByTemplateAsyncInvoker(
        CreatePipelineByTemplateRequest request) {
        return new AsyncInvoker<CreatePipelineByTemplateRequest, CreatePipelineByTemplateResponse>(request,
            CodeArtsPipelineMeta.createPipelineByTemplate, hcClient);
    }

    /**
     * 基于模板创建流水线
     *
     * 基于模板创建流水线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePipelineByTemplateIdRequest 请求对象
     * @return CompletableFuture<CreatePipelineByTemplateIdResponse>
     */
    public CompletableFuture<CreatePipelineByTemplateIdResponse> createPipelineByTemplateIdAsync(
        CreatePipelineByTemplateIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.createPipelineByTemplateId);
    }

    /**
     * 基于模板创建流水线
     *
     * 基于模板创建流水线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePipelineByTemplateIdRequest 请求对象
     * @return AsyncInvoker<CreatePipelineByTemplateIdRequest, CreatePipelineByTemplateIdResponse>
     */
    public AsyncInvoker<CreatePipelineByTemplateIdRequest, CreatePipelineByTemplateIdResponse> createPipelineByTemplateIdAsyncInvoker(
        CreatePipelineByTemplateIdRequest request) {
        return new AsyncInvoker<CreatePipelineByTemplateIdRequest, CreatePipelineByTemplateIdResponse>(request,
            CodeArtsPipelineMeta.createPipelineByTemplateId, hcClient);
    }

    /**
     * 新建流水线分组
     *
     * 新建流水线分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePipelineGroupRequest 请求对象
     * @return CompletableFuture<CreatePipelineGroupResponse>
     */
    public CompletableFuture<CreatePipelineGroupResponse> createPipelineGroupAsync(CreatePipelineGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.createPipelineGroup);
    }

    /**
     * 新建流水线分组
     *
     * 新建流水线分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePipelineGroupRequest 请求对象
     * @return AsyncInvoker<CreatePipelineGroupRequest, CreatePipelineGroupResponse>
     */
    public AsyncInvoker<CreatePipelineGroupRequest, CreatePipelineGroupResponse> createPipelineGroupAsyncInvoker(
        CreatePipelineGroupRequest request) {
        return new AsyncInvoker<CreatePipelineGroupRequest, CreatePipelineGroupResponse>(request,
            CodeArtsPipelineMeta.createPipelineGroup, hcClient);
    }

    /**
     * 创建流水线
     *
     * 创建流水线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePipelineNewRequest 请求对象
     * @return CompletableFuture<CreatePipelineNewResponse>
     */
    public CompletableFuture<CreatePipelineNewResponse> createPipelineNewAsync(CreatePipelineNewRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.createPipelineNew);
    }

    /**
     * 创建流水线
     *
     * 创建流水线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePipelineNewRequest 请求对象
     * @return AsyncInvoker<CreatePipelineNewRequest, CreatePipelineNewResponse>
     */
    public AsyncInvoker<CreatePipelineNewRequest, CreatePipelineNewResponse> createPipelineNewAsyncInvoker(
        CreatePipelineNewRequest request) {
        return new AsyncInvoker<CreatePipelineNewRequest, CreatePipelineNewResponse>(request,
            CodeArtsPipelineMeta.createPipelineNew, hcClient);
    }

    /**
     * 创建流水线模板
     *
     * 创建流水线模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePipelineTemplateRequest 请求对象
     * @return CompletableFuture<CreatePipelineTemplateResponse>
     */
    public CompletableFuture<CreatePipelineTemplateResponse> createPipelineTemplateAsync(
        CreatePipelineTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.createPipelineTemplate);
    }

    /**
     * 创建流水线模板
     *
     * 创建流水线模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePipelineTemplateRequest 请求对象
     * @return AsyncInvoker<CreatePipelineTemplateRequest, CreatePipelineTemplateResponse>
     */
    public AsyncInvoker<CreatePipelineTemplateRequest, CreatePipelineTemplateResponse> createPipelineTemplateAsyncInvoker(
        CreatePipelineTemplateRequest request) {
        return new AsyncInvoker<CreatePipelineTemplateRequest, CreatePipelineTemplateResponse>(request,
            CodeArtsPipelineMeta.createPipelineTemplate, hcClient);
    }

    /**
     * 创建插件草稿版本
     *
     * 创建插件草稿版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePluginDraftRequest 请求对象
     * @return CompletableFuture<CreatePluginDraftResponse>
     */
    public CompletableFuture<CreatePluginDraftResponse> createPluginDraftAsync(CreatePluginDraftRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.createPluginDraft);
    }

    /**
     * 创建插件草稿版本
     *
     * 创建插件草稿版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePluginDraftRequest 请求对象
     * @return AsyncInvoker<CreatePluginDraftRequest, CreatePluginDraftResponse>
     */
    public AsyncInvoker<CreatePluginDraftRequest, CreatePluginDraftResponse> createPluginDraftAsyncInvoker(
        CreatePluginDraftRequest request) {
        return new AsyncInvoker<CreatePluginDraftRequest, CreatePluginDraftResponse>(request,
            CodeArtsPipelineMeta.createPluginDraft, hcClient);
    }

    /**
     * 创建插件版本
     *
     * 创建插件版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePluginVersionRequest 请求对象
     * @return CompletableFuture<CreatePluginVersionResponse>
     */
    public CompletableFuture<CreatePluginVersionResponse> createPluginVersionAsync(CreatePluginVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.createPluginVersion);
    }

    /**
     * 创建插件版本
     *
     * 创建插件版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePluginVersionRequest 请求对象
     * @return AsyncInvoker<CreatePluginVersionRequest, CreatePluginVersionResponse>
     */
    public AsyncInvoker<CreatePluginVersionRequest, CreatePluginVersionResponse> createPluginVersionAsyncInvoker(
        CreatePluginVersionRequest request) {
        return new AsyncInvoker<CreatePluginVersionRequest, CreatePluginVersionResponse>(request,
            CodeArtsPipelineMeta.createPluginVersion, hcClient);
    }

    /**
     * 创建发布商
     *
     * 创建发布商
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePublisherRequest 请求对象
     * @return CompletableFuture<CreatePublisherResponse>
     */
    public CompletableFuture<CreatePublisherResponse> createPublisherAsync(CreatePublisherRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.createPublisher);
    }

    /**
     * 创建发布商
     *
     * 创建发布商
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePublisherRequest 请求对象
     * @return AsyncInvoker<CreatePublisherRequest, CreatePublisherResponse>
     */
    public AsyncInvoker<CreatePublisherRequest, CreatePublisherResponse> createPublisherAsyncInvoker(
        CreatePublisherRequest request) {
        return new AsyncInvoker<CreatePublisherRequest, CreatePublisherResponse>(request,
            CodeArtsPipelineMeta.createPublisher, hcClient);
    }

    /**
     * 创建规则
     *
     * 创建规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRuleRequest 请求对象
     * @return CompletableFuture<CreateRuleResponse>
     */
    public CompletableFuture<CreateRuleResponse> createRuleAsync(CreateRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.createRule);
    }

    /**
     * 创建规则
     *
     * 创建规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRuleRequest 请求对象
     * @return AsyncInvoker<CreateRuleRequest, CreateRuleResponse>
     */
    public AsyncInvoker<CreateRuleRequest, CreateRuleResponse> createRuleAsyncInvoker(CreateRuleRequest request) {
        return new AsyncInvoker<CreateRuleRequest, CreateRuleResponse>(request, CodeArtsPipelineMeta.createRule,
            hcClient);
    }

    /**
     * 创建规则集
     *
     * 创建规则集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateStrategyRequest 请求对象
     * @return CompletableFuture<CreateStrategyResponse>
     */
    public CompletableFuture<CreateStrategyResponse> createStrategyAsync(CreateStrategyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.createStrategy);
    }

    /**
     * 创建规则集
     *
     * 创建规则集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateStrategyRequest 请求对象
     * @return AsyncInvoker<CreateStrategyRequest, CreateStrategyResponse>
     */
    public AsyncInvoker<CreateStrategyRequest, CreateStrategyResponse> createStrategyAsyncInvoker(
        CreateStrategyRequest request) {
        return new AsyncInvoker<CreateStrategyRequest, CreateStrategyResponse>(request,
            CodeArtsPipelineMeta.createStrategy, hcClient);
    }

    /**
     * 删除基础插件
     *
     * 删除基础插件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBasicPluginRequest 请求对象
     * @return CompletableFuture<DeleteBasicPluginResponse>
     */
    public CompletableFuture<DeleteBasicPluginResponse> deleteBasicPluginAsync(DeleteBasicPluginRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.deleteBasicPlugin);
    }

    /**
     * 删除基础插件
     *
     * 删除基础插件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBasicPluginRequest 请求对象
     * @return AsyncInvoker<DeleteBasicPluginRequest, DeleteBasicPluginResponse>
     */
    public AsyncInvoker<DeleteBasicPluginRequest, DeleteBasicPluginResponse> deleteBasicPluginAsyncInvoker(
        DeleteBasicPluginRequest request) {
        return new AsyncInvoker<DeleteBasicPluginRequest, DeleteBasicPluginResponse>(request,
            CodeArtsPipelineMeta.deleteBasicPlugin, hcClient);
    }

    /**
     * 删除租户级开源治理策略
     *
     * 删除租户级开源治理策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteOpenSourceStrategyRequest 请求对象
     * @return CompletableFuture<DeleteOpenSourceStrategyResponse>
     */
    public CompletableFuture<DeleteOpenSourceStrategyResponse> deleteOpenSourceStrategyAsync(
        DeleteOpenSourceStrategyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.deleteOpenSourceStrategy);
    }

    /**
     * 删除租户级开源治理策略
     *
     * 删除租户级开源治理策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteOpenSourceStrategyRequest 请求对象
     * @return AsyncInvoker<DeleteOpenSourceStrategyRequest, DeleteOpenSourceStrategyResponse>
     */
    public AsyncInvoker<DeleteOpenSourceStrategyRequest, DeleteOpenSourceStrategyResponse> deleteOpenSourceStrategyAsyncInvoker(
        DeleteOpenSourceStrategyRequest request) {
        return new AsyncInvoker<DeleteOpenSourceStrategyRequest, DeleteOpenSourceStrategyResponse>(request,
            CodeArtsPipelineMeta.deleteOpenSourceStrategy, hcClient);
    }

    /**
     * 删除流水线
     *
     * 删除流水线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePipelineRequest 请求对象
     * @return CompletableFuture<DeletePipelineResponse>
     */
    public CompletableFuture<DeletePipelineResponse> deletePipelineAsync(DeletePipelineRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.deletePipeline);
    }

    /**
     * 删除流水线
     *
     * 删除流水线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePipelineRequest 请求对象
     * @return AsyncInvoker<DeletePipelineRequest, DeletePipelineResponse>
     */
    public AsyncInvoker<DeletePipelineRequest, DeletePipelineResponse> deletePipelineAsyncInvoker(
        DeletePipelineRequest request) {
        return new AsyncInvoker<DeletePipelineRequest, DeletePipelineResponse>(request,
            CodeArtsPipelineMeta.deletePipeline, hcClient);
    }

    /**
     * 删除流水线分组
     *
     * 删除流水线分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePipelineGroupRequest 请求对象
     * @return CompletableFuture<DeletePipelineGroupResponse>
     */
    public CompletableFuture<DeletePipelineGroupResponse> deletePipelineGroupAsync(DeletePipelineGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.deletePipelineGroup);
    }

    /**
     * 删除流水线分组
     *
     * 删除流水线分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePipelineGroupRequest 请求对象
     * @return AsyncInvoker<DeletePipelineGroupRequest, DeletePipelineGroupResponse>
     */
    public AsyncInvoker<DeletePipelineGroupRequest, DeletePipelineGroupResponse> deletePipelineGroupAsyncInvoker(
        DeletePipelineGroupRequest request) {
        return new AsyncInvoker<DeletePipelineGroupRequest, DeletePipelineGroupResponse>(request,
            CodeArtsPipelineMeta.deletePipelineGroup, hcClient);
    }

    /**
     * 删除流水线模板
     *
     * 删除流水线模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePipelineTemplateRequest 请求对象
     * @return CompletableFuture<DeletePipelineTemplateResponse>
     */
    public CompletableFuture<DeletePipelineTemplateResponse> deletePipelineTemplateAsync(
        DeletePipelineTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.deletePipelineTemplate);
    }

    /**
     * 删除流水线模板
     *
     * 删除流水线模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePipelineTemplateRequest 请求对象
     * @return AsyncInvoker<DeletePipelineTemplateRequest, DeletePipelineTemplateResponse>
     */
    public AsyncInvoker<DeletePipelineTemplateRequest, DeletePipelineTemplateResponse> deletePipelineTemplateAsyncInvoker(
        DeletePipelineTemplateRequest request) {
        return new AsyncInvoker<DeletePipelineTemplateRequest, DeletePipelineTemplateResponse>(request,
            CodeArtsPipelineMeta.deletePipelineTemplate, hcClient);
    }

    /**
     * 删除插件草稿
     *
     * 删除插件草稿
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePluginDraftRequest 请求对象
     * @return CompletableFuture<DeletePluginDraftResponse>
     */
    public CompletableFuture<DeletePluginDraftResponse> deletePluginDraftAsync(DeletePluginDraftRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.deletePluginDraft);
    }

    /**
     * 删除插件草稿
     *
     * 删除插件草稿
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePluginDraftRequest 请求对象
     * @return AsyncInvoker<DeletePluginDraftRequest, DeletePluginDraftResponse>
     */
    public AsyncInvoker<DeletePluginDraftRequest, DeletePluginDraftResponse> deletePluginDraftAsyncInvoker(
        DeletePluginDraftRequest request) {
        return new AsyncInvoker<DeletePluginDraftRequest, DeletePluginDraftResponse>(request,
            CodeArtsPipelineMeta.deletePluginDraft, hcClient);
    }

    /**
     * 删除发布商
     *
     * 删除发布商
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePublisherRequest 请求对象
     * @return CompletableFuture<DeletePublisherResponse>
     */
    public CompletableFuture<DeletePublisherResponse> deletePublisherAsync(DeletePublisherRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.deletePublisher);
    }

    /**
     * 删除发布商
     *
     * 删除发布商
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePublisherRequest 请求对象
     * @return AsyncInvoker<DeletePublisherRequest, DeletePublisherResponse>
     */
    public AsyncInvoker<DeletePublisherRequest, DeletePublisherResponse> deletePublisherAsyncInvoker(
        DeletePublisherRequest request) {
        return new AsyncInvoker<DeletePublisherRequest, DeletePublisherResponse>(request,
            CodeArtsPipelineMeta.deletePublisher, hcClient);
    }

    /**
     * 删除规则
     *
     * 删除规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRuleRequest 请求对象
     * @return CompletableFuture<DeleteRuleResponse>
     */
    public CompletableFuture<DeleteRuleResponse> deleteRuleAsync(DeleteRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.deleteRule);
    }

    /**
     * 删除规则
     *
     * 删除规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRuleRequest 请求对象
     * @return AsyncInvoker<DeleteRuleRequest, DeleteRuleResponse>
     */
    public AsyncInvoker<DeleteRuleRequest, DeleteRuleResponse> deleteRuleAsyncInvoker(DeleteRuleRequest request) {
        return new AsyncInvoker<DeleteRuleRequest, DeleteRuleResponse>(request, CodeArtsPipelineMeta.deleteRule,
            hcClient);
    }

    /**
     * 删除规则集
     *
     * 删除规则集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteStrategyRequest 请求对象
     * @return CompletableFuture<DeleteStrategyResponse>
     */
    public CompletableFuture<DeleteStrategyResponse> deleteStrategyAsync(DeleteStrategyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.deleteStrategy);
    }

    /**
     * 删除规则集
     *
     * 删除规则集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteStrategyRequest 请求对象
     * @return AsyncInvoker<DeleteStrategyRequest, DeleteStrategyResponse>
     */
    public AsyncInvoker<DeleteStrategyRequest, DeleteStrategyResponse> deleteStrategyAsyncInvoker(
        DeleteStrategyRequest request) {
        return new AsyncInvoker<DeleteStrategyRequest, DeleteStrategyResponse>(request,
            CodeArtsPipelineMeta.deleteStrategy, hcClient);
    }

    /**
     * 查询可用发布商
     *
     * 查询可用发布商
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAvailablePublisherRequest 请求对象
     * @return CompletableFuture<ListAvailablePublisherResponse>
     */
    public CompletableFuture<ListAvailablePublisherResponse> listAvailablePublisherAsync(
        ListAvailablePublisherRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.listAvailablePublisher);
    }

    /**
     * 查询可用发布商
     *
     * 查询可用发布商
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAvailablePublisherRequest 请求对象
     * @return AsyncInvoker<ListAvailablePublisherRequest, ListAvailablePublisherResponse>
     */
    public AsyncInvoker<ListAvailablePublisherRequest, ListAvailablePublisherResponse> listAvailablePublisherAsyncInvoker(
        ListAvailablePublisherRequest request) {
        return new AsyncInvoker<ListAvailablePublisherRequest, ListAvailablePublisherResponse>(request,
            CodeArtsPipelineMeta.listAvailablePublisher, hcClient);
    }

    /**
     * 查询基础插件列表
     *
     * 查询基础插件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBasePluginsRequest 请求对象
     * @return CompletableFuture<ListBasePluginsResponse>
     */
    public CompletableFuture<ListBasePluginsResponse> listBasePluginsAsync(ListBasePluginsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.listBasePlugins);
    }

    /**
     * 查询基础插件列表
     *
     * 查询基础插件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBasePluginsRequest 请求对象
     * @return AsyncInvoker<ListBasePluginsRequest, ListBasePluginsResponse>
     */
    public AsyncInvoker<ListBasePluginsRequest, ListBasePluginsResponse> listBasePluginsAsyncInvoker(
        ListBasePluginsRequest request) {
        return new AsyncInvoker<ListBasePluginsRequest, ListBasePluginsResponse>(request,
            CodeArtsPipelineMeta.listBasePlugins, hcClient);
    }

    /**
     * 分页查询可选插件列表
     *
     * 分页查询可选插件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBasePluginsNewPostRequest 请求对象
     * @return CompletableFuture<ListBasePluginsNewPostResponse>
     */
    public CompletableFuture<ListBasePluginsNewPostResponse> listBasePluginsNewPostAsync(
        ListBasePluginsNewPostRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.listBasePluginsNewPost);
    }

    /**
     * 分页查询可选插件列表
     *
     * 分页查询可选插件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBasePluginsNewPostRequest 请求对象
     * @return AsyncInvoker<ListBasePluginsNewPostRequest, ListBasePluginsNewPostResponse>
     */
    public AsyncInvoker<ListBasePluginsNewPostRequest, ListBasePluginsNewPostResponse> listBasePluginsNewPostAsyncInvoker(
        ListBasePluginsNewPostRequest request) {
        return new AsyncInvoker<ListBasePluginsNewPostRequest, ListBasePluginsNewPostResponse>(request,
            CodeArtsPipelineMeta.listBasePluginsNewPost, hcClient);
    }

    /**
     * 查询租户级开源治理策略列表
     *
     * 查询租户级开源治理策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOpenSourceStrategyRequest 请求对象
     * @return CompletableFuture<ListOpenSourceStrategyResponse>
     */
    public CompletableFuture<ListOpenSourceStrategyResponse> listOpenSourceStrategyAsync(
        ListOpenSourceStrategyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.listOpenSourceStrategy);
    }

    /**
     * 查询租户级开源治理策略列表
     *
     * 查询租户级开源治理策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOpenSourceStrategyRequest 请求对象
     * @return AsyncInvoker<ListOpenSourceStrategyRequest, ListOpenSourceStrategyResponse>
     */
    public AsyncInvoker<ListOpenSourceStrategyRequest, ListOpenSourceStrategyResponse> listOpenSourceStrategyAsyncInvoker(
        ListOpenSourceStrategyRequest request) {
        return new AsyncInvoker<ListOpenSourceStrategyRequest, ListOpenSourceStrategyResponse>(request,
            CodeArtsPipelineMeta.listOpenSourceStrategy, hcClient);
    }

    /**
     * 查询插件所有版本信息
     *
     * 查询插件所有版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPLuginVersionRequest 请求对象
     * @return CompletableFuture<ListPLuginVersionResponse>
     */
    public CompletableFuture<ListPLuginVersionResponse> listPLuginVersionAsync(ListPLuginVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.listPLuginVersion);
    }

    /**
     * 查询插件所有版本信息
     *
     * 查询插件所有版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPLuginVersionRequest 请求对象
     * @return AsyncInvoker<ListPLuginVersionRequest, ListPLuginVersionResponse>
     */
    public AsyncInvoker<ListPLuginVersionRequest, ListPLuginVersionResponse> listPLuginVersionAsyncInvoker(
        ListPLuginVersionRequest request) {
        return new AsyncInvoker<ListPLuginVersionRequest, ListPLuginVersionResponse>(request,
            CodeArtsPipelineMeta.listPLuginVersion, hcClient);
    }

    /**
     * 获取流水线执行记录
     *
     * 获取流水线执行记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPipelineRunsRequest 请求对象
     * @return CompletableFuture<ListPipelineRunsResponse>
     */
    public CompletableFuture<ListPipelineRunsResponse> listPipelineRunsAsync(ListPipelineRunsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.listPipelineRuns);
    }

    /**
     * 获取流水线执行记录
     *
     * 获取流水线执行记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPipelineRunsRequest 请求对象
     * @return AsyncInvoker<ListPipelineRunsRequest, ListPipelineRunsResponse>
     */
    public AsyncInvoker<ListPipelineRunsRequest, ListPipelineRunsResponse> listPipelineRunsAsyncInvoker(
        ListPipelineRunsRequest request) {
        return new AsyncInvoker<ListPipelineRunsRequest, ListPipelineRunsResponse>(request,
            CodeArtsPipelineMeta.listPipelineRuns, hcClient);
    }

    /**
     * 获取流水线列表接口
     *
     * 获取流水线列表接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPipelineSimpleInfoRequest 请求对象
     * @return CompletableFuture<ListPipelineSimpleInfoResponse>
     */
    public CompletableFuture<ListPipelineSimpleInfoResponse> listPipelineSimpleInfoAsync(
        ListPipelineSimpleInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.listPipelineSimpleInfo);
    }

    /**
     * 获取流水线列表接口
     *
     * 获取流水线列表接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPipelineSimpleInfoRequest 请求对象
     * @return AsyncInvoker<ListPipelineSimpleInfoRequest, ListPipelineSimpleInfoResponse>
     */
    public AsyncInvoker<ListPipelineSimpleInfoRequest, ListPipelineSimpleInfoResponse> listPipelineSimpleInfoAsyncInvoker(
        ListPipelineSimpleInfoRequest request) {
        return new AsyncInvoker<ListPipelineSimpleInfoRequest, ListPipelineSimpleInfoResponse>(request,
            CodeArtsPipelineMeta.listPipelineSimpleInfo, hcClient);
    }

    /**
     * 查询模板列表
     *
     * 查询流水线模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPipelineTemplatesRequest 请求对象
     * @return CompletableFuture<ListPipelineTemplatesResponse>
     */
    public CompletableFuture<ListPipelineTemplatesResponse> listPipelineTemplatesAsync(
        ListPipelineTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.listPipelineTemplates);
    }

    /**
     * 查询模板列表
     *
     * 查询流水线模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPipelineTemplatesRequest 请求对象
     * @return AsyncInvoker<ListPipelineTemplatesRequest, ListPipelineTemplatesResponse>
     */
    public AsyncInvoker<ListPipelineTemplatesRequest, ListPipelineTemplatesResponse> listPipelineTemplatesAsyncInvoker(
        ListPipelineTemplatesRequest request) {
        return new AsyncInvoker<ListPipelineTemplatesRequest, ListPipelineTemplatesResponse>(request,
            CodeArtsPipelineMeta.listPipelineTemplates, hcClient);
    }

    /**
     * 获取流水线列表/获取项目下流水线执行状况
     *
     * 获取流水线列表/获取项目下流水线执行状况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPipelinesRequest 请求对象
     * @return CompletableFuture<ListPipelinesResponse>
     */
    public CompletableFuture<ListPipelinesResponse> listPipelinesAsync(ListPipelinesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.listPipelines);
    }

    /**
     * 获取流水线列表/获取项目下流水线执行状况
     *
     * 获取流水线列表/获取项目下流水线执行状况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPipelinesRequest 请求对象
     * @return AsyncInvoker<ListPipelinesRequest, ListPipelinesResponse>
     */
    public AsyncInvoker<ListPipelinesRequest, ListPipelinesResponse> listPipelinesAsyncInvoker(
        ListPipelinesRequest request) {
        return new AsyncInvoker<ListPipelinesRequest, ListPipelinesResponse>(request,
            CodeArtsPipelineMeta.listPipelines, hcClient);
    }

    /**
     * 获取项目下流水线执行状况
     *
     * 获取项目下流水线执行状况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPipleineBuildResultRequest 请求对象
     * @return CompletableFuture<ListPipleineBuildResultResponse>
     */
    public CompletableFuture<ListPipleineBuildResultResponse> listPipleineBuildResultAsync(
        ListPipleineBuildResultRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.listPipleineBuildResult);
    }

    /**
     * 获取项目下流水线执行状况
     *
     * 获取项目下流水线执行状况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPipleineBuildResultRequest 请求对象
     * @return AsyncInvoker<ListPipleineBuildResultRequest, ListPipleineBuildResultResponse>
     */
    public AsyncInvoker<ListPipleineBuildResultRequest, ListPipleineBuildResultResponse> listPipleineBuildResultAsyncInvoker(
        ListPipleineBuildResultRequest request) {
        return new AsyncInvoker<ListPipleineBuildResultRequest, ListPipleineBuildResultResponse>(request,
            CodeArtsPipelineMeta.listPipleineBuildResult, hcClient);
    }

    /**
     * 查询插件版本号
     *
     * 查询插件版本号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPluginVersionNumberRequest 请求对象
     * @return CompletableFuture<ListPluginVersionNumberResponse>
     */
    public CompletableFuture<ListPluginVersionNumberResponse> listPluginVersionNumberAsync(
        ListPluginVersionNumberRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.listPluginVersionNumber);
    }

    /**
     * 查询插件版本号
     *
     * 查询插件版本号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPluginVersionNumberRequest 请求对象
     * @return AsyncInvoker<ListPluginVersionNumberRequest, ListPluginVersionNumberResponse>
     */
    public AsyncInvoker<ListPluginVersionNumberRequest, ListPluginVersionNumberResponse> listPluginVersionNumberAsyncInvoker(
        ListPluginVersionNumberRequest request) {
        return new AsyncInvoker<ListPluginVersionNumberRequest, ListPluginVersionNumberResponse>(request,
            CodeArtsPipelineMeta.listPluginVersionNumber, hcClient);
    }

    /**
     * 查询插件列表
     *
     * 查询插件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPluginsRequest 请求对象
     * @return CompletableFuture<ListPluginsResponse>
     */
    public CompletableFuture<ListPluginsResponse> listPluginsAsync(ListPluginsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.listPlugins);
    }

    /**
     * 查询插件列表
     *
     * 查询插件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPluginsRequest 请求对象
     * @return AsyncInvoker<ListPluginsRequest, ListPluginsResponse>
     */
    public AsyncInvoker<ListPluginsRequest, ListPluginsResponse> listPluginsAsyncInvoker(ListPluginsRequest request) {
        return new AsyncInvoker<ListPluginsRequest, ListPluginsResponse>(request, CodeArtsPipelineMeta.listPlugins,
            hcClient);
    }

    /**
     * 查询项目级开源治理策略列表
     *
     * 查询项目级开源治理策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectOpenSourceStrategyRequest 请求对象
     * @return CompletableFuture<ListProjectOpenSourceStrategyResponse>
     */
    public CompletableFuture<ListProjectOpenSourceStrategyResponse> listProjectOpenSourceStrategyAsync(
        ListProjectOpenSourceStrategyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.listProjectOpenSourceStrategy);
    }

    /**
     * 查询项目级开源治理策略列表
     *
     * 查询项目级开源治理策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectOpenSourceStrategyRequest 请求对象
     * @return AsyncInvoker<ListProjectOpenSourceStrategyRequest, ListProjectOpenSourceStrategyResponse>
     */
    public AsyncInvoker<ListProjectOpenSourceStrategyRequest, ListProjectOpenSourceStrategyResponse> listProjectOpenSourceStrategyAsyncInvoker(
        ListProjectOpenSourceStrategyRequest request) {
        return new AsyncInvoker<ListProjectOpenSourceStrategyRequest, ListProjectOpenSourceStrategyResponse>(request,
            CodeArtsPipelineMeta.listProjectOpenSourceStrategy, hcClient);
    }

    /**
     * 获取规则模板实例列表
     *
     * 获取规则集列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectStrategyRequest 请求对象
     * @return CompletableFuture<ListProjectStrategyResponse>
     */
    public CompletableFuture<ListProjectStrategyResponse> listProjectStrategyAsync(ListProjectStrategyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.listProjectStrategy);
    }

    /**
     * 获取规则模板实例列表
     *
     * 获取规则集列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectStrategyRequest 请求对象
     * @return AsyncInvoker<ListProjectStrategyRequest, ListProjectStrategyResponse>
     */
    public AsyncInvoker<ListProjectStrategyRequest, ListProjectStrategyResponse> listProjectStrategyAsyncInvoker(
        ListProjectStrategyRequest request) {
        return new AsyncInvoker<ListProjectStrategyRequest, ListProjectStrategyResponse>(request,
            CodeArtsPipelineMeta.listProjectStrategy, hcClient);
    }

    /**
     * 查询发布商列表
     *
     * 查询发布商列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPublisherRequest 请求对象
     * @return CompletableFuture<ListPublisherResponse>
     */
    public CompletableFuture<ListPublisherResponse> listPublisherAsync(ListPublisherRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.listPublisher);
    }

    /**
     * 查询发布商列表
     *
     * 查询发布商列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPublisherRequest 请求对象
     * @return AsyncInvoker<ListPublisherRequest, ListPublisherResponse>
     */
    public AsyncInvoker<ListPublisherRequest, ListPublisherResponse> listPublisherAsyncInvoker(
        ListPublisherRequest request) {
        return new AsyncInvoker<ListPublisherRequest, ListPublisherResponse>(request,
            CodeArtsPipelineMeta.listPublisher, hcClient);
    }

    /**
     * 分页获取规则列表
     *
     * 分页获取规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRuleRequest 请求对象
     * @return CompletableFuture<ListRuleResponse>
     */
    public CompletableFuture<ListRuleResponse> listRuleAsync(ListRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.listRule);
    }

    /**
     * 分页获取规则列表
     *
     * 分页获取规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRuleRequest 请求对象
     * @return AsyncInvoker<ListRuleRequest, ListRuleResponse>
     */
    public AsyncInvoker<ListRuleRequest, ListRuleResponse> listRuleAsyncInvoker(ListRuleRequest request) {
        return new AsyncInvoker<ListRuleRequest, ListRuleResponse>(request, CodeArtsPipelineMeta.listRule, hcClient);
    }

    /**
     * 查询可选插件列表
     *
     * 查询可选插件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStagePluginsRequest 请求对象
     * @return CompletableFuture<ListStagePluginsResponse>
     */
    public CompletableFuture<ListStagePluginsResponse> listStagePluginsAsync(ListStagePluginsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.listStagePlugins);
    }

    /**
     * 查询可选插件列表
     *
     * 查询可选插件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStagePluginsRequest 请求对象
     * @return AsyncInvoker<ListStagePluginsRequest, ListStagePluginsResponse>
     */
    public AsyncInvoker<ListStagePluginsRequest, ListStagePluginsResponse> listStagePluginsAsyncInvoker(
        ListStagePluginsRequest request) {
        return new AsyncInvoker<ListStagePluginsRequest, ListStagePluginsResponse>(request,
            CodeArtsPipelineMeta.listStagePlugins, hcClient);
    }

    /**
     * 获取规则集列表
     *
     * 获取规则集列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStrategyRequest 请求对象
     * @return CompletableFuture<ListStrategyResponse>
     */
    public CompletableFuture<ListStrategyResponse> listStrategyAsync(ListStrategyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.listStrategy);
    }

    /**
     * 获取规则集列表
     *
     * 获取规则集列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStrategyRequest 请求对象
     * @return AsyncInvoker<ListStrategyRequest, ListStrategyResponse>
     */
    public AsyncInvoker<ListStrategyRequest, ListStrategyResponse> listStrategyAsyncInvoker(
        ListStrategyRequest request) {
        return new AsyncInvoker<ListStrategyRequest, ListStrategyResponse>(request, CodeArtsPipelineMeta.listStrategy,
            hcClient);
    }

    /**
     * 查询模板列表
     *
     * 查询模板列表，支持分页查询,支持模板名字模糊查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTemplatesRequest 请求对象
     * @return CompletableFuture<ListTemplatesResponse>
     */
    public CompletableFuture<ListTemplatesResponse> listTemplatesAsync(ListTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.listTemplates);
    }

    /**
     * 查询模板列表
     *
     * 查询模板列表，支持分页查询,支持模板名字模糊查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTemplatesRequest 请求对象
     * @return AsyncInvoker<ListTemplatesRequest, ListTemplatesResponse>
     */
    public AsyncInvoker<ListTemplatesRequest, ListTemplatesResponse> listTemplatesAsyncInvoker(
        ListTemplatesRequest request) {
        return new AsyncInvoker<ListTemplatesRequest, ListTemplatesResponse>(request,
            CodeArtsPipelineMeta.listTemplates, hcClient);
    }

    /**
     * 发布插件
     *
     * 发布插件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishPluginRequest 请求对象
     * @return CompletableFuture<PublishPluginResponse>
     */
    public CompletableFuture<PublishPluginResponse> publishPluginAsync(PublishPluginRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.publishPlugin);
    }

    /**
     * 发布插件
     *
     * 发布插件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishPluginRequest 请求对象
     * @return AsyncInvoker<PublishPluginRequest, PublishPluginResponse>
     */
    public AsyncInvoker<PublishPluginRequest, PublishPluginResponse> publishPluginAsyncInvoker(
        PublishPluginRequest request) {
        return new AsyncInvoker<PublishPluginRequest, PublishPluginResponse>(request,
            CodeArtsPipelineMeta.publishPlugin, hcClient);
    }

    /**
     * 插件绑定发布商
     *
     * 插件绑定发布商
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishPluginBindRequest 请求对象
     * @return CompletableFuture<PublishPluginBindResponse>
     */
    public CompletableFuture<PublishPluginBindResponse> publishPluginBindAsync(PublishPluginBindRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.publishPluginBind);
    }

    /**
     * 插件绑定发布商
     *
     * 插件绑定发布商
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishPluginBindRequest 请求对象
     * @return AsyncInvoker<PublishPluginBindRequest, PublishPluginBindResponse>
     */
    public AsyncInvoker<PublishPluginBindRequest, PublishPluginBindResponse> publishPluginBindAsyncInvoker(
        PublishPluginBindRequest request) {
        return new AsyncInvoker<PublishPluginBindRequest, PublishPluginBindResponse>(request,
            CodeArtsPipelineMeta.publishPluginBind, hcClient);
    }

    /**
     * 发布插件草稿
     *
     * 发布插件草稿
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishPluginDraftRequest 请求对象
     * @return CompletableFuture<PublishPluginDraftResponse>
     */
    public CompletableFuture<PublishPluginDraftResponse> publishPluginDraftAsync(PublishPluginDraftRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.publishPluginDraft);
    }

    /**
     * 发布插件草稿
     *
     * 发布插件草稿
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishPluginDraftRequest 请求对象
     * @return AsyncInvoker<PublishPluginDraftRequest, PublishPluginDraftResponse>
     */
    public AsyncInvoker<PublishPluginDraftRequest, PublishPluginDraftResponse> publishPluginDraftAsyncInvoker(
        PublishPluginDraftRequest request) {
        return new AsyncInvoker<PublishPluginDraftRequest, PublishPluginDraftResponse>(request,
            CodeArtsPipelineMeta.publishPluginDraft, hcClient);
    }

    /**
     * 驳回人工审核
     *
     * 驳回人工审核
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RejectManualReviewRequest 请求对象
     * @return CompletableFuture<RejectManualReviewResponse>
     */
    public CompletableFuture<RejectManualReviewResponse> rejectManualReviewAsync(RejectManualReviewRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.rejectManualReview);
    }

    /**
     * 驳回人工审核
     *
     * 驳回人工审核
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RejectManualReviewRequest 请求对象
     * @return AsyncInvoker<RejectManualReviewRequest, RejectManualReviewResponse>
     */
    public AsyncInvoker<RejectManualReviewRequest, RejectManualReviewResponse> rejectManualReviewAsyncInvoker(
        RejectManualReviewRequest request) {
        return new AsyncInvoker<RejectManualReviewRequest, RejectManualReviewResponse>(request,
            CodeArtsPipelineMeta.rejectManualReview, hcClient);
    }

    /**
     * 删除流水线
     *
     * 根据id删除流水线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RemovePipelineRequest 请求对象
     * @return CompletableFuture<RemovePipelineResponse>
     */
    public CompletableFuture<RemovePipelineResponse> removePipelineAsync(RemovePipelineRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.removePipeline);
    }

    /**
     * 删除流水线
     *
     * 根据id删除流水线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RemovePipelineRequest 请求对象
     * @return AsyncInvoker<RemovePipelineRequest, RemovePipelineResponse>
     */
    public AsyncInvoker<RemovePipelineRequest, RemovePipelineResponse> removePipelineAsyncInvoker(
        RemovePipelineRequest request) {
        return new AsyncInvoker<RemovePipelineRequest, RemovePipelineResponse>(request,
            CodeArtsPipelineMeta.removePipeline, hcClient);
    }

    /**
     * 重试运行流水线
     *
     * 重试运行流水线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RetryPipelineRunRequest 请求对象
     * @return CompletableFuture<RetryPipelineRunResponse>
     */
    public CompletableFuture<RetryPipelineRunResponse> retryPipelineRunAsync(RetryPipelineRunRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.retryPipelineRun);
    }

    /**
     * 重试运行流水线
     *
     * 重试运行流水线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RetryPipelineRunRequest 请求对象
     * @return AsyncInvoker<RetryPipelineRunRequest, RetryPipelineRunResponse>
     */
    public AsyncInvoker<RetryPipelineRunRequest, RetryPipelineRunResponse> retryPipelineRunAsyncInvoker(
        RetryPipelineRunRequest request) {
        return new AsyncInvoker<RetryPipelineRunRequest, RetryPipelineRunResponse>(request,
            CodeArtsPipelineMeta.retryPipelineRun, hcClient);
    }

    /**
     * 启动流水线
     *
     * 启动流水线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunPipelineRequest 请求对象
     * @return CompletableFuture<RunPipelineResponse>
     */
    public CompletableFuture<RunPipelineResponse> runPipelineAsync(RunPipelineRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.runPipeline);
    }

    /**
     * 启动流水线
     *
     * 启动流水线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunPipelineRequest 请求对象
     * @return AsyncInvoker<RunPipelineRequest, RunPipelineResponse>
     */
    public AsyncInvoker<RunPipelineRequest, RunPipelineResponse> runPipelineAsyncInvoker(RunPipelineRequest request) {
        return new AsyncInvoker<RunPipelineRequest, RunPipelineResponse>(request, CodeArtsPipelineMeta.runPipeline,
            hcClient);
    }

    /**
     * 查询基础插件详情
     *
     * 查询基础插件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBasicPluginRequest 请求对象
     * @return CompletableFuture<ShowBasicPluginResponse>
     */
    public CompletableFuture<ShowBasicPluginResponse> showBasicPluginAsync(ShowBasicPluginRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.showBasicPlugin);
    }

    /**
     * 查询基础插件详情
     *
     * 查询基础插件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBasicPluginRequest 请求对象
     * @return AsyncInvoker<ShowBasicPluginRequest, ShowBasicPluginResponse>
     */
    public AsyncInvoker<ShowBasicPluginRequest, ShowBasicPluginResponse> showBasicPluginAsyncInvoker(
        ShowBasicPluginRequest request) {
        return new AsyncInvoker<ShowBasicPluginRequest, ShowBasicPluginResponse>(request,
            CodeArtsPipelineMeta.showBasicPlugin, hcClient);
    }

    /**
     * 检查流水线创建状态
     *
     * 检查流水线创建状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceStatusRequest 请求对象
     * @return CompletableFuture<ShowInstanceStatusResponse>
     */
    public CompletableFuture<ShowInstanceStatusResponse> showInstanceStatusAsync(ShowInstanceStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.showInstanceStatus);
    }

    /**
     * 检查流水线创建状态
     *
     * 检查流水线创建状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceStatusRequest 请求对象
     * @return AsyncInvoker<ShowInstanceStatusRequest, ShowInstanceStatusResponse>
     */
    public AsyncInvoker<ShowInstanceStatusRequest, ShowInstanceStatusResponse> showInstanceStatusAsyncInvoker(
        ShowInstanceStatusRequest request) {
        return new AsyncInvoker<ShowInstanceStatusRequest, ShowInstanceStatusResponse>(request,
            CodeArtsPipelineMeta.showInstanceStatus, hcClient);
    }

    /**
     * 查询租户级开源治理策略详情
     *
     * 查询租户级开源治理策略详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOpenSourceStrategyRequest 请求对象
     * @return CompletableFuture<ShowOpenSourceStrategyResponse>
     */
    public CompletableFuture<ShowOpenSourceStrategyResponse> showOpenSourceStrategyAsync(
        ShowOpenSourceStrategyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.showOpenSourceStrategy);
    }

    /**
     * 查询租户级开源治理策略详情
     *
     * 查询租户级开源治理策略详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOpenSourceStrategyRequest 请求对象
     * @return AsyncInvoker<ShowOpenSourceStrategyRequest, ShowOpenSourceStrategyResponse>
     */
    public AsyncInvoker<ShowOpenSourceStrategyRequest, ShowOpenSourceStrategyResponse> showOpenSourceStrategyAsyncInvoker(
        ShowOpenSourceStrategyRequest request) {
        return new AsyncInvoker<ShowOpenSourceStrategyRequest, ShowOpenSourceStrategyResponse>(request,
            CodeArtsPipelineMeta.showOpenSourceStrategy, hcClient);
    }

    /**
     * 查询流水线详情
     *
     * 查询流水线详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPipelineDetailRequest 请求对象
     * @return CompletableFuture<ShowPipelineDetailResponse>
     */
    public CompletableFuture<ShowPipelineDetailResponse> showPipelineDetailAsync(ShowPipelineDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.showPipelineDetail);
    }

    /**
     * 查询流水线详情
     *
     * 查询流水线详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPipelineDetailRequest 请求对象
     * @return AsyncInvoker<ShowPipelineDetailRequest, ShowPipelineDetailResponse>
     */
    public AsyncInvoker<ShowPipelineDetailRequest, ShowPipelineDetailResponse> showPipelineDetailAsyncInvoker(
        ShowPipelineDetailRequest request) {
        return new AsyncInvoker<ShowPipelineDetailRequest, ShowPipelineDetailResponse>(request,
            CodeArtsPipelineMeta.showPipelineDetail, hcClient);
    }

    /**
     * 查询流水线分组树
     *
     * 查询流水线分组树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPipelineGroupTreeRequest 请求对象
     * @return CompletableFuture<ShowPipelineGroupTreeResponse>
     */
    public CompletableFuture<ShowPipelineGroupTreeResponse> showPipelineGroupTreeAsync(
        ShowPipelineGroupTreeRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.showPipelineGroupTree);
    }

    /**
     * 查询流水线分组树
     *
     * 查询流水线分组树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPipelineGroupTreeRequest 请求对象
     * @return AsyncInvoker<ShowPipelineGroupTreeRequest, ShowPipelineGroupTreeResponse>
     */
    public AsyncInvoker<ShowPipelineGroupTreeRequest, ShowPipelineGroupTreeResponse> showPipelineGroupTreeAsyncInvoker(
        ShowPipelineGroupTreeRequest request) {
        return new AsyncInvoker<ShowPipelineGroupTreeRequest, ShowPipelineGroupTreeResponse>(request,
            CodeArtsPipelineMeta.showPipelineGroupTree, hcClient);
    }

    /**
     * 查询流水线日志
     *
     * 查询流水线日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPipelineLogRequest 请求对象
     * @return CompletableFuture<ShowPipelineLogResponse>
     */
    public CompletableFuture<ShowPipelineLogResponse> showPipelineLogAsync(ShowPipelineLogRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.showPipelineLog);
    }

    /**
     * 查询流水线日志
     *
     * 查询流水线日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPipelineLogRequest 请求对象
     * @return AsyncInvoker<ShowPipelineLogRequest, ShowPipelineLogResponse>
     */
    public AsyncInvoker<ShowPipelineLogRequest, ShowPipelineLogResponse> showPipelineLogAsyncInvoker(
        ShowPipelineLogRequest request) {
        return new AsyncInvoker<ShowPipelineLogRequest, ShowPipelineLogResponse>(request,
            CodeArtsPipelineMeta.showPipelineLog, hcClient);
    }

    /**
     * 获取流水线状态/获取流水线执行详情
     *
     * 获取流水线状态/获取流水线执行详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPipelineRunDetailRequest 请求对象
     * @return CompletableFuture<ShowPipelineRunDetailResponse>
     */
    public CompletableFuture<ShowPipelineRunDetailResponse> showPipelineRunDetailAsync(
        ShowPipelineRunDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.showPipelineRunDetail);
    }

    /**
     * 获取流水线状态/获取流水线执行详情
     *
     * 获取流水线状态/获取流水线执行详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPipelineRunDetailRequest 请求对象
     * @return AsyncInvoker<ShowPipelineRunDetailRequest, ShowPipelineRunDetailResponse>
     */
    public AsyncInvoker<ShowPipelineRunDetailRequest, ShowPipelineRunDetailResponse> showPipelineRunDetailAsyncInvoker(
        ShowPipelineRunDetailRequest request) {
        return new AsyncInvoker<ShowPipelineRunDetailRequest, ShowPipelineRunDetailResponse>(request,
            CodeArtsPipelineMeta.showPipelineRunDetail, hcClient);
    }

    /**
     * 查询模板详情
     *
     * 查询模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPipelineTemplateDetailRequest 请求对象
     * @return CompletableFuture<ShowPipelineTemplateDetailResponse>
     */
    public CompletableFuture<ShowPipelineTemplateDetailResponse> showPipelineTemplateDetailAsync(
        ShowPipelineTemplateDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.showPipelineTemplateDetail);
    }

    /**
     * 查询模板详情
     *
     * 查询模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPipelineTemplateDetailRequest 请求对象
     * @return AsyncInvoker<ShowPipelineTemplateDetailRequest, ShowPipelineTemplateDetailResponse>
     */
    public AsyncInvoker<ShowPipelineTemplateDetailRequest, ShowPipelineTemplateDetailResponse> showPipelineTemplateDetailAsyncInvoker(
        ShowPipelineTemplateDetailRequest request) {
        return new AsyncInvoker<ShowPipelineTemplateDetailRequest, ShowPipelineTemplateDetailResponse>(request,
            CodeArtsPipelineMeta.showPipelineTemplateDetail, hcClient);
    }

    /**
     * 获取流水线状态
     *
     * 获取流水线状态,阶段及任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPipleineStatusRequest 请求对象
     * @return CompletableFuture<ShowPipleineStatusResponse>
     */
    public CompletableFuture<ShowPipleineStatusResponse> showPipleineStatusAsync(ShowPipleineStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.showPipleineStatus);
    }

    /**
     * 获取流水线状态
     *
     * 获取流水线状态,阶段及任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPipleineStatusRequest 请求对象
     * @return AsyncInvoker<ShowPipleineStatusRequest, ShowPipleineStatusResponse>
     */
    public AsyncInvoker<ShowPipleineStatusRequest, ShowPipleineStatusResponse> showPipleineStatusAsyncInvoker(
        ShowPipleineStatusRequest request) {
        return new AsyncInvoker<ShowPipleineStatusRequest, ShowPipleineStatusResponse>(request,
            CodeArtsPipelineMeta.showPipleineStatus, hcClient);
    }

    /**
     * 查询插件输入配置
     *
     * 查询插件输入配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPluginInputsRequest 请求对象
     * @return CompletableFuture<ShowPluginInputsResponse>
     */
    public CompletableFuture<ShowPluginInputsResponse> showPluginInputsAsync(ShowPluginInputsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.showPluginInputs);
    }

    /**
     * 查询插件输入配置
     *
     * 查询插件输入配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPluginInputsRequest 请求对象
     * @return AsyncInvoker<ShowPluginInputsRequest, ShowPluginInputsResponse>
     */
    public AsyncInvoker<ShowPluginInputsRequest, ShowPluginInputsResponse> showPluginInputsAsyncInvoker(
        ShowPluginInputsRequest request) {
        return new AsyncInvoker<ShowPluginInputsRequest, ShowPluginInputsResponse>(request,
            CodeArtsPipelineMeta.showPluginInputs, hcClient);
    }

    /**
     * 查询插件指标配置
     *
     * 查询插件指标配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPluginMetricsRequest 请求对象
     * @return CompletableFuture<ShowPluginMetricsResponse>
     */
    public CompletableFuture<ShowPluginMetricsResponse> showPluginMetricsAsync(ShowPluginMetricsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.showPluginMetrics);
    }

    /**
     * 查询插件指标配置
     *
     * 查询插件指标配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPluginMetricsRequest 请求对象
     * @return AsyncInvoker<ShowPluginMetricsRequest, ShowPluginMetricsResponse>
     */
    public AsyncInvoker<ShowPluginMetricsRequest, ShowPluginMetricsResponse> showPluginMetricsAsyncInvoker(
        ShowPluginMetricsRequest request) {
        return new AsyncInvoker<ShowPluginMetricsRequest, ShowPluginMetricsResponse>(request,
            CodeArtsPipelineMeta.showPluginMetrics, hcClient);
    }

    /**
     * 查询插件输出配置
     *
     * 查询插件输出配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPluginOutputsRequest 请求对象
     * @return CompletableFuture<ShowPluginOutputsResponse>
     */
    public CompletableFuture<ShowPluginOutputsResponse> showPluginOutputsAsync(ShowPluginOutputsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.showPluginOutputs);
    }

    /**
     * 查询插件输出配置
     *
     * 查询插件输出配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPluginOutputsRequest 请求对象
     * @return AsyncInvoker<ShowPluginOutputsRequest, ShowPluginOutputsResponse>
     */
    public AsyncInvoker<ShowPluginOutputsRequest, ShowPluginOutputsResponse> showPluginOutputsAsyncInvoker(
        ShowPluginOutputsRequest request) {
        return new AsyncInvoker<ShowPluginOutputsRequest, ShowPluginOutputsResponse>(request,
            CodeArtsPipelineMeta.showPluginOutputs, hcClient);
    }

    /**
     * 查询插件版本详情
     *
     * 查询插件版本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPluginVersionRequest 请求对象
     * @return CompletableFuture<ShowPluginVersionResponse>
     */
    public CompletableFuture<ShowPluginVersionResponse> showPluginVersionAsync(ShowPluginVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.showPluginVersion);
    }

    /**
     * 查询插件版本详情
     *
     * 查询插件版本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPluginVersionRequest 请求对象
     * @return AsyncInvoker<ShowPluginVersionRequest, ShowPluginVersionResponse>
     */
    public AsyncInvoker<ShowPluginVersionRequest, ShowPluginVersionResponse> showPluginVersionAsyncInvoker(
        ShowPluginVersionRequest request) {
        return new AsyncInvoker<ShowPluginVersionRequest, ShowPluginVersionResponse>(request,
            CodeArtsPipelineMeta.showPluginVersion, hcClient);
    }

    /**
     * 查询项目级开源治理策略详情
     *
     * 查询项目级开源治理策略详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectOpenSourceStrategyRequest 请求对象
     * @return CompletableFuture<ShowProjectOpenSourceStrategyResponse>
     */
    public CompletableFuture<ShowProjectOpenSourceStrategyResponse> showProjectOpenSourceStrategyAsync(
        ShowProjectOpenSourceStrategyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.showProjectOpenSourceStrategy);
    }

    /**
     * 查询项目级开源治理策略详情
     *
     * 查询项目级开源治理策略详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectOpenSourceStrategyRequest 请求对象
     * @return AsyncInvoker<ShowProjectOpenSourceStrategyRequest, ShowProjectOpenSourceStrategyResponse>
     */
    public AsyncInvoker<ShowProjectOpenSourceStrategyRequest, ShowProjectOpenSourceStrategyResponse> showProjectOpenSourceStrategyAsyncInvoker(
        ShowProjectOpenSourceStrategyRequest request) {
        return new AsyncInvoker<ShowProjectOpenSourceStrategyRequest, ShowProjectOpenSourceStrategyResponse>(request,
            CodeArtsPipelineMeta.showProjectOpenSourceStrategy, hcClient);
    }

    /**
     * 
     *
     * 查询项目级策略详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectStrategyRequest 请求对象
     * @return CompletableFuture<ShowProjectStrategyResponse>
     */
    public CompletableFuture<ShowProjectStrategyResponse> showProjectStrategyAsync(ShowProjectStrategyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.showProjectStrategy);
    }

    /**
     * 
     *
     * 查询项目级策略详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectStrategyRequest 请求对象
     * @return AsyncInvoker<ShowProjectStrategyRequest, ShowProjectStrategyResponse>
     */
    public AsyncInvoker<ShowProjectStrategyRequest, ShowProjectStrategyResponse> showProjectStrategyAsyncInvoker(
        ShowProjectStrategyRequest request) {
        return new AsyncInvoker<ShowProjectStrategyRequest, ShowProjectStrategyResponse>(request,
            CodeArtsPipelineMeta.showProjectStrategy, hcClient);
    }

    /**
     * 查询发布商详情
     *
     * 查询发布商详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPublisherRequest 请求对象
     * @return CompletableFuture<ShowPublisherResponse>
     */
    public CompletableFuture<ShowPublisherResponse> showPublisherAsync(ShowPublisherRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.showPublisher);
    }

    /**
     * 查询发布商详情
     *
     * 查询发布商详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPublisherRequest 请求对象
     * @return AsyncInvoker<ShowPublisherRequest, ShowPublisherResponse>
     */
    public AsyncInvoker<ShowPublisherRequest, ShowPublisherResponse> showPublisherAsyncInvoker(
        ShowPublisherRequest request) {
        return new AsyncInvoker<ShowPublisherRequest, ShowPublisherResponse>(request,
            CodeArtsPipelineMeta.showPublisher, hcClient);
    }

    /**
     * 获取单条规则详情
     *
     * 获取单条规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRuleRequest 请求对象
     * @return CompletableFuture<ShowRuleResponse>
     */
    public CompletableFuture<ShowRuleResponse> showRuleAsync(ShowRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.showRule);
    }

    /**
     * 获取单条规则详情
     *
     * 获取单条规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRuleRequest 请求对象
     * @return AsyncInvoker<ShowRuleRequest, ShowRuleResponse>
     */
    public AsyncInvoker<ShowRuleRequest, ShowRuleResponse> showRuleAsyncInvoker(ShowRuleRequest request) {
        return new AsyncInvoker<ShowRuleRequest, ShowRuleResponse>(request, CodeArtsPipelineMeta.showRule, hcClient);
    }

    /**
     * 获取规则集详情
     *
     * 获取规则集详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStrategyRequest 请求对象
     * @return CompletableFuture<ShowStrategyResponse>
     */
    public CompletableFuture<ShowStrategyResponse> showStrategyAsync(ShowStrategyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.showStrategy);
    }

    /**
     * 获取规则集详情
     *
     * 获取规则集详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStrategyRequest 请求对象
     * @return AsyncInvoker<ShowStrategyRequest, ShowStrategyResponse>
     */
    public AsyncInvoker<ShowStrategyRequest, ShowStrategyResponse> showStrategyAsyncInvoker(
        ShowStrategyRequest request) {
        return new AsyncInvoker<ShowStrategyRequest, ShowStrategyResponse>(request, CodeArtsPipelineMeta.showStrategy,
            hcClient);
    }

    /**
     * 查询模板详情
     *
     * 查询模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTemplateDetailRequest 请求对象
     * @return CompletableFuture<ShowTemplateDetailResponse>
     */
    public CompletableFuture<ShowTemplateDetailResponse> showTemplateDetailAsync(ShowTemplateDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.showTemplateDetail);
    }

    /**
     * 查询模板详情
     *
     * 查询模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTemplateDetailRequest 请求对象
     * @return AsyncInvoker<ShowTemplateDetailRequest, ShowTemplateDetailResponse>
     */
    public AsyncInvoker<ShowTemplateDetailRequest, ShowTemplateDetailResponse> showTemplateDetailAsyncInvoker(
        ShowTemplateDetailRequest request) {
        return new AsyncInvoker<ShowTemplateDetailRequest, ShowTemplateDetailResponse>(request,
            CodeArtsPipelineMeta.showTemplateDetail, hcClient);
    }

    /**
     * 启动流水线
     *
     * 启动流水线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartNewPipelineRequest 请求对象
     * @return CompletableFuture<StartNewPipelineResponse>
     */
    public CompletableFuture<StartNewPipelineResponse> startNewPipelineAsync(StartNewPipelineRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.startNewPipeline);
    }

    /**
     * 启动流水线
     *
     * 启动流水线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartNewPipelineRequest 请求对象
     * @return AsyncInvoker<StartNewPipelineRequest, StartNewPipelineResponse>
     */
    public AsyncInvoker<StartNewPipelineRequest, StartNewPipelineResponse> startNewPipelineAsyncInvoker(
        StartNewPipelineRequest request) {
        return new AsyncInvoker<StartNewPipelineRequest, StartNewPipelineResponse>(request,
            CodeArtsPipelineMeta.startNewPipeline, hcClient);
    }

    /**
     * 停止流水线
     *
     * 停止流水线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopPipelineNewRequest 请求对象
     * @return CompletableFuture<StopPipelineNewResponse>
     */
    public CompletableFuture<StopPipelineNewResponse> stopPipelineNewAsync(StopPipelineNewRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.stopPipelineNew);
    }

    /**
     * 停止流水线
     *
     * 停止流水线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopPipelineNewRequest 请求对象
     * @return AsyncInvoker<StopPipelineNewRequest, StopPipelineNewResponse>
     */
    public AsyncInvoker<StopPipelineNewRequest, StopPipelineNewResponse> stopPipelineNewAsyncInvoker(
        StopPipelineNewRequest request) {
        return new AsyncInvoker<StopPipelineNewRequest, StopPipelineNewResponse>(request,
            CodeArtsPipelineMeta.stopPipelineNew, hcClient);
    }

    /**
     * 停止流水线
     *
     * 停止流水线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopPipelineRunRequest 请求对象
     * @return CompletableFuture<StopPipelineRunResponse>
     */
    public CompletableFuture<StopPipelineRunResponse> stopPipelineRunAsync(StopPipelineRunRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.stopPipelineRun);
    }

    /**
     * 停止流水线
     *
     * 停止流水线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopPipelineRunRequest 请求对象
     * @return AsyncInvoker<StopPipelineRunRequest, StopPipelineRunResponse>
     */
    public AsyncInvoker<StopPipelineRunRequest, StopPipelineRunResponse> stopPipelineRunAsyncInvoker(
        StopPipelineRunRequest request) {
        return new AsyncInvoker<StopPipelineRunRequest, StopPipelineRunResponse>(request,
            CodeArtsPipelineMeta.stopPipelineRun, hcClient);
    }

    /**
     * 修改租户级开源治理策略启用状态
     *
     * 修改租户级开源治理策略启用状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchOpenSourceStrategyRequest 请求对象
     * @return CompletableFuture<SwitchOpenSourceStrategyResponse>
     */
    public CompletableFuture<SwitchOpenSourceStrategyResponse> switchOpenSourceStrategyAsync(
        SwitchOpenSourceStrategyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.switchOpenSourceStrategy);
    }

    /**
     * 修改租户级开源治理策略启用状态
     *
     * 修改租户级开源治理策略启用状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchOpenSourceStrategyRequest 请求对象
     * @return AsyncInvoker<SwitchOpenSourceStrategyRequest, SwitchOpenSourceStrategyResponse>
     */
    public AsyncInvoker<SwitchOpenSourceStrategyRequest, SwitchOpenSourceStrategyResponse> switchOpenSourceStrategyAsyncInvoker(
        SwitchOpenSourceStrategyRequest request) {
        return new AsyncInvoker<SwitchOpenSourceStrategyRequest, SwitchOpenSourceStrategyResponse>(request,
            CodeArtsPipelineMeta.switchOpenSourceStrategy, hcClient);
    }

    /**
     * 开关规则集
     *
     * 修改规则集状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchStrategyRequest 请求对象
     * @return CompletableFuture<SwitchStrategyResponse>
     */
    public CompletableFuture<SwitchStrategyResponse> switchStrategyAsync(SwitchStrategyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.switchStrategy);
    }

    /**
     * 开关规则集
     *
     * 修改规则集状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchStrategyRequest 请求对象
     * @return AsyncInvoker<SwitchStrategyRequest, SwitchStrategyResponse>
     */
    public AsyncInvoker<SwitchStrategyRequest, SwitchStrategyResponse> switchStrategyAsyncInvoker(
        SwitchStrategyRequest request) {
        return new AsyncInvoker<SwitchStrategyRequest, SwitchStrategyResponse>(request,
            CodeArtsPipelineMeta.switchStrategy, hcClient);
    }

    /**
     * 更新基础插件
     *
     * 更新基础插件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBasicPluginRequest 请求对象
     * @return CompletableFuture<UpdateBasicPluginResponse>
     */
    public CompletableFuture<UpdateBasicPluginResponse> updateBasicPluginAsync(UpdateBasicPluginRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.updateBasicPlugin);
    }

    /**
     * 更新基础插件
     *
     * 更新基础插件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBasicPluginRequest 请求对象
     * @return AsyncInvoker<UpdateBasicPluginRequest, UpdateBasicPluginResponse>
     */
    public AsyncInvoker<UpdateBasicPluginRequest, UpdateBasicPluginResponse> updateBasicPluginAsyncInvoker(
        UpdateBasicPluginRequest request) {
        return new AsyncInvoker<UpdateBasicPluginRequest, UpdateBasicPluginResponse>(request,
            CodeArtsPipelineMeta.updateBasicPlugin, hcClient);
    }

    /**
     * 修改租户级开源治理策略
     *
     * 修改租户级开源治理策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateOpenSourceStrategyRequest 请求对象
     * @return CompletableFuture<UpdateOpenSourceStrategyResponse>
     */
    public CompletableFuture<UpdateOpenSourceStrategyResponse> updateOpenSourceStrategyAsync(
        UpdateOpenSourceStrategyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.updateOpenSourceStrategy);
    }

    /**
     * 修改租户级开源治理策略
     *
     * 修改租户级开源治理策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateOpenSourceStrategyRequest 请求对象
     * @return AsyncInvoker<UpdateOpenSourceStrategyRequest, UpdateOpenSourceStrategyResponse>
     */
    public AsyncInvoker<UpdateOpenSourceStrategyRequest, UpdateOpenSourceStrategyResponse> updateOpenSourceStrategyAsyncInvoker(
        UpdateOpenSourceStrategyRequest request) {
        return new AsyncInvoker<UpdateOpenSourceStrategyRequest, UpdateOpenSourceStrategyResponse>(request,
            CodeArtsPipelineMeta.updateOpenSourceStrategy, hcClient);
    }

    /**
     * 更新流水线分组
     *
     * 更新流水线分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePipelineGroupRequest 请求对象
     * @return CompletableFuture<UpdatePipelineGroupResponse>
     */
    public CompletableFuture<UpdatePipelineGroupResponse> updatePipelineGroupAsync(UpdatePipelineGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.updatePipelineGroup);
    }

    /**
     * 更新流水线分组
     *
     * 更新流水线分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePipelineGroupRequest 请求对象
     * @return AsyncInvoker<UpdatePipelineGroupRequest, UpdatePipelineGroupResponse>
     */
    public AsyncInvoker<UpdatePipelineGroupRequest, UpdatePipelineGroupResponse> updatePipelineGroupAsyncInvoker(
        UpdatePipelineGroupRequest request) {
        return new AsyncInvoker<UpdatePipelineGroupRequest, UpdatePipelineGroupResponse>(request,
            CodeArtsPipelineMeta.updatePipelineGroup, hcClient);
    }

    /**
     * 更新流水线模板
     *
     * 更新流水线模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePipelineTemplateRequest 请求对象
     * @return CompletableFuture<UpdatePipelineTemplateResponse>
     */
    public CompletableFuture<UpdatePipelineTemplateResponse> updatePipelineTemplateAsync(
        UpdatePipelineTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.updatePipelineTemplate);
    }

    /**
     * 更新流水线模板
     *
     * 更新流水线模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePipelineTemplateRequest 请求对象
     * @return AsyncInvoker<UpdatePipelineTemplateRequest, UpdatePipelineTemplateResponse>
     */
    public AsyncInvoker<UpdatePipelineTemplateRequest, UpdatePipelineTemplateResponse> updatePipelineTemplateAsyncInvoker(
        UpdatePipelineTemplateRequest request) {
        return new AsyncInvoker<UpdatePipelineTemplateRequest, UpdatePipelineTemplateResponse>(request,
            CodeArtsPipelineMeta.updatePipelineTemplate, hcClient);
    }

    /**
     * 更新插件基本信息
     *
     * 更新插件基本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePluginBaseInfoRequest 请求对象
     * @return CompletableFuture<UpdatePluginBaseInfoResponse>
     */
    public CompletableFuture<UpdatePluginBaseInfoResponse> updatePluginBaseInfoAsync(
        UpdatePluginBaseInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.updatePluginBaseInfo);
    }

    /**
     * 更新插件基本信息
     *
     * 更新插件基本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePluginBaseInfoRequest 请求对象
     * @return AsyncInvoker<UpdatePluginBaseInfoRequest, UpdatePluginBaseInfoResponse>
     */
    public AsyncInvoker<UpdatePluginBaseInfoRequest, UpdatePluginBaseInfoResponse> updatePluginBaseInfoAsyncInvoker(
        UpdatePluginBaseInfoRequest request) {
        return new AsyncInvoker<UpdatePluginBaseInfoRequest, UpdatePluginBaseInfoResponse>(request,
            CodeArtsPipelineMeta.updatePluginBaseInfo, hcClient);
    }

    /**
     * 更新插件草稿
     *
     * 更新插件草稿
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePluginDraftRequest 请求对象
     * @return CompletableFuture<UpdatePluginDraftResponse>
     */
    public CompletableFuture<UpdatePluginDraftResponse> updatePluginDraftAsync(UpdatePluginDraftRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.updatePluginDraft);
    }

    /**
     * 更新插件草稿
     *
     * 更新插件草稿
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePluginDraftRequest 请求对象
     * @return AsyncInvoker<UpdatePluginDraftRequest, UpdatePluginDraftResponse>
     */
    public AsyncInvoker<UpdatePluginDraftRequest, UpdatePluginDraftResponse> updatePluginDraftAsyncInvoker(
        UpdatePluginDraftRequest request) {
        return new AsyncInvoker<UpdatePluginDraftRequest, UpdatePluginDraftResponse>(request,
            CodeArtsPipelineMeta.updatePluginDraft, hcClient);
    }

    /**
     * 更新规则
     *
     * 更新规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRuleRequest 请求对象
     * @return CompletableFuture<UpdateRuleResponse>
     */
    public CompletableFuture<UpdateRuleResponse> updateRuleAsync(UpdateRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.updateRule);
    }

    /**
     * 更新规则
     *
     * 更新规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRuleRequest 请求对象
     * @return AsyncInvoker<UpdateRuleRequest, UpdateRuleResponse>
     */
    public AsyncInvoker<UpdateRuleRequest, UpdateRuleResponse> updateRuleAsyncInvoker(UpdateRuleRequest request) {
        return new AsyncInvoker<UpdateRuleRequest, UpdateRuleResponse>(request, CodeArtsPipelineMeta.updateRule,
            hcClient);
    }

    /**
     * 修改规则集
     *
     * 修改规则集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateStrategyRequest 请求对象
     * @return CompletableFuture<UpdateStrategyResponse>
     */
    public CompletableFuture<UpdateStrategyResponse> updateStrategyAsync(UpdateStrategyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.updateStrategy);
    }

    /**
     * 修改规则集
     *
     * 修改规则集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateStrategyRequest 请求对象
     * @return AsyncInvoker<UpdateStrategyRequest, UpdateStrategyResponse>
     */
    public AsyncInvoker<UpdateStrategyRequest, UpdateStrategyResponse> updateStrategyAsyncInvoker(
        UpdateStrategyRequest request) {
        return new AsyncInvoker<UpdateStrategyRequest, UpdateStrategyResponse>(request,
            CodeArtsPipelineMeta.updateStrategy, hcClient);
    }

    /**
     * 上传基础插件
     *
     * 上传基础插件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadBasicPluginRequest 请求对象
     * @return CompletableFuture<UploadBasicPluginResponse>
     */
    public CompletableFuture<UploadBasicPluginResponse> uploadBasicPluginAsync(UploadBasicPluginRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.uploadBasicPlugin);
    }

    /**
     * 上传基础插件
     *
     * 上传基础插件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadBasicPluginRequest 请求对象
     * @return AsyncInvoker<UploadBasicPluginRequest, UploadBasicPluginResponse>
     */
    public AsyncInvoker<UploadBasicPluginRequest, UploadBasicPluginResponse> uploadBasicPluginAsyncInvoker(
        UploadBasicPluginRequest request) {
        return new AsyncInvoker<UploadBasicPluginRequest, UploadBasicPluginResponse>(request,
            CodeArtsPipelineMeta.uploadBasicPlugin, hcClient);
    }

    /**
     * 更新插件图标
     *
     * 更新插件图标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadPluginIconRequest 请求对象
     * @return CompletableFuture<UploadPluginIconResponse>
     */
    public CompletableFuture<UploadPluginIconResponse> uploadPluginIconAsync(UploadPluginIconRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.uploadPluginIcon);
    }

    /**
     * 更新插件图标
     *
     * 更新插件图标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadPluginIconRequest 请求对象
     * @return AsyncInvoker<UploadPluginIconRequest, UploadPluginIconResponse>
     */
    public AsyncInvoker<UploadPluginIconRequest, UploadPluginIconResponse> uploadPluginIconAsyncInvoker(
        UploadPluginIconRequest request) {
        return new AsyncInvoker<UploadPluginIconRequest, UploadPluginIconResponse>(request,
            CodeArtsPipelineMeta.uploadPluginIcon, hcClient);
    }

    /**
     * 更新发布商图标
     *
     * 更新发布商图标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadPublisherIconRequest 请求对象
     * @return CompletableFuture<UploadPublisherIconResponse>
     */
    public CompletableFuture<UploadPublisherIconResponse> uploadPublisherIconAsync(UploadPublisherIconRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsPipelineMeta.uploadPublisherIcon);
    }

    /**
     * 更新发布商图标
     *
     * 更新发布商图标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadPublisherIconRequest 请求对象
     * @return AsyncInvoker<UploadPublisherIconRequest, UploadPublisherIconResponse>
     */
    public AsyncInvoker<UploadPublisherIconRequest, UploadPublisherIconResponse> uploadPublisherIconAsyncInvoker(
        UploadPublisherIconRequest request) {
        return new AsyncInvoker<UploadPublisherIconRequest, UploadPublisherIconResponse>(request,
            CodeArtsPipelineMeta.uploadPublisherIcon, hcClient);
    }

}

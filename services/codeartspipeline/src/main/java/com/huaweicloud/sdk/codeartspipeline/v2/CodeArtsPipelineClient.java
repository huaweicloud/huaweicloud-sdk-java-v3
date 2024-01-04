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
import com.huaweicloud.sdk.codeartspipeline.v2.model.SwitchStrategyRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.SwitchStrategyResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdateBasicPluginRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.UpdateBasicPluginResponse;
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
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CodeArtsPipelineClient {

    protected HcClient hcClient;

    public CodeArtsPipelineClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CodeArtsPipelineClient> newBuilder() {
        ClientBuilder<CodeArtsPipelineClient> clientBuilder = new ClientBuilder<>(CodeArtsPipelineClient::new);
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
     * @return AcceptManualReviewResponse
     */
    public AcceptManualReviewResponse acceptManualReview(AcceptManualReviewRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.acceptManualReview);
    }

    /**
     * 通过人工审核
     *
     * 通过人工审核
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AcceptManualReviewRequest 请求对象
     * @return SyncInvoker<AcceptManualReviewRequest, AcceptManualReviewResponse>
     */
    public SyncInvoker<AcceptManualReviewRequest, AcceptManualReviewResponse> acceptManualReviewInvoker(
        AcceptManualReviewRequest request) {
        return new SyncInvoker<AcceptManualReviewRequest, AcceptManualReviewResponse>(request,
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
     * @return BatchMovePipelineToGroupResponse
     */
    public BatchMovePipelineToGroupResponse batchMovePipelineToGroup(BatchMovePipelineToGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.batchMovePipelineToGroup);
    }

    /**
     * 批量把流水线移动到分组下
     *
     * 批量把流水线移动到分组下
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchMovePipelineToGroupRequest 请求对象
     * @return SyncInvoker<BatchMovePipelineToGroupRequest, BatchMovePipelineToGroupResponse>
     */
    public SyncInvoker<BatchMovePipelineToGroupRequest, BatchMovePipelineToGroupResponse> batchMovePipelineToGroupInvoker(
        BatchMovePipelineToGroupRequest request) {
        return new SyncInvoker<BatchMovePipelineToGroupRequest, BatchMovePipelineToGroupResponse>(request,
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
     * @return BatchShowPipelinesLatestStatusResponse
     */
    public BatchShowPipelinesLatestStatusResponse batchShowPipelinesLatestStatus(
        BatchShowPipelinesLatestStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.batchShowPipelinesLatestStatus);
    }

    /**
     * 批量获取流水线状态
     *
     * 批量获取流水线状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowPipelinesLatestStatusRequest 请求对象
     * @return SyncInvoker<BatchShowPipelinesLatestStatusRequest, BatchShowPipelinesLatestStatusResponse>
     */
    public SyncInvoker<BatchShowPipelinesLatestStatusRequest, BatchShowPipelinesLatestStatusResponse> batchShowPipelinesLatestStatusInvoker(
        BatchShowPipelinesLatestStatusRequest request) {
        return new SyncInvoker<BatchShowPipelinesLatestStatusRequest, BatchShowPipelinesLatestStatusResponse>(request,
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
     * @return BatchShowPipelinesStatusResponse
     */
    public BatchShowPipelinesStatusResponse batchShowPipelinesStatus(BatchShowPipelinesStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.batchShowPipelinesStatus);
    }

    /**
     * 批量获取流水线状态
     *
     * 批量获取流水线状态和阶段信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowPipelinesStatusRequest 请求对象
     * @return SyncInvoker<BatchShowPipelinesStatusRequest, BatchShowPipelinesStatusResponse>
     */
    public SyncInvoker<BatchShowPipelinesStatusRequest, BatchShowPipelinesStatusResponse> batchShowPipelinesStatusInvoker(
        BatchShowPipelinesStatusRequest request) {
        return new SyncInvoker<BatchShowPipelinesStatusRequest, BatchShowPipelinesStatusResponse>(request,
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
     * @return CreateBasicPluginResponse
     */
    public CreateBasicPluginResponse createBasicPlugin(CreateBasicPluginRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.createBasicPlugin);
    }

    /**
     * 创建基础插件
     *
     * 创建基础插件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateBasicPluginRequest 请求对象
     * @return SyncInvoker<CreateBasicPluginRequest, CreateBasicPluginResponse>
     */
    public SyncInvoker<CreateBasicPluginRequest, CreateBasicPluginResponse> createBasicPluginInvoker(
        CreateBasicPluginRequest request) {
        return new SyncInvoker<CreateBasicPluginRequest, CreateBasicPluginResponse>(request,
            CodeArtsPipelineMeta.createBasicPlugin, hcClient);
    }

    /**
     * 基于模板快速创建流水线及流水线内任务
     *
     * 基于模板快速创建流水线及流水线内任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePipelineByTemplateRequest 请求对象
     * @return CreatePipelineByTemplateResponse
     */
    public CreatePipelineByTemplateResponse createPipelineByTemplate(CreatePipelineByTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.createPipelineByTemplate);
    }

    /**
     * 基于模板快速创建流水线及流水线内任务
     *
     * 基于模板快速创建流水线及流水线内任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePipelineByTemplateRequest 请求对象
     * @return SyncInvoker<CreatePipelineByTemplateRequest, CreatePipelineByTemplateResponse>
     */
    public SyncInvoker<CreatePipelineByTemplateRequest, CreatePipelineByTemplateResponse> createPipelineByTemplateInvoker(
        CreatePipelineByTemplateRequest request) {
        return new SyncInvoker<CreatePipelineByTemplateRequest, CreatePipelineByTemplateResponse>(request,
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
     * @return CreatePipelineByTemplateIdResponse
     */
    public CreatePipelineByTemplateIdResponse createPipelineByTemplateId(CreatePipelineByTemplateIdRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.createPipelineByTemplateId);
    }

    /**
     * 基于模板创建流水线
     *
     * 基于模板创建流水线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePipelineByTemplateIdRequest 请求对象
     * @return SyncInvoker<CreatePipelineByTemplateIdRequest, CreatePipelineByTemplateIdResponse>
     */
    public SyncInvoker<CreatePipelineByTemplateIdRequest, CreatePipelineByTemplateIdResponse> createPipelineByTemplateIdInvoker(
        CreatePipelineByTemplateIdRequest request) {
        return new SyncInvoker<CreatePipelineByTemplateIdRequest, CreatePipelineByTemplateIdResponse>(request,
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
     * @return CreatePipelineGroupResponse
     */
    public CreatePipelineGroupResponse createPipelineGroup(CreatePipelineGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.createPipelineGroup);
    }

    /**
     * 新建流水线分组
     *
     * 新建流水线分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePipelineGroupRequest 请求对象
     * @return SyncInvoker<CreatePipelineGroupRequest, CreatePipelineGroupResponse>
     */
    public SyncInvoker<CreatePipelineGroupRequest, CreatePipelineGroupResponse> createPipelineGroupInvoker(
        CreatePipelineGroupRequest request) {
        return new SyncInvoker<CreatePipelineGroupRequest, CreatePipelineGroupResponse>(request,
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
     * @return CreatePipelineNewResponse
     */
    public CreatePipelineNewResponse createPipelineNew(CreatePipelineNewRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.createPipelineNew);
    }

    /**
     * 创建流水线
     *
     * 创建流水线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePipelineNewRequest 请求对象
     * @return SyncInvoker<CreatePipelineNewRequest, CreatePipelineNewResponse>
     */
    public SyncInvoker<CreatePipelineNewRequest, CreatePipelineNewResponse> createPipelineNewInvoker(
        CreatePipelineNewRequest request) {
        return new SyncInvoker<CreatePipelineNewRequest, CreatePipelineNewResponse>(request,
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
     * @return CreatePipelineTemplateResponse
     */
    public CreatePipelineTemplateResponse createPipelineTemplate(CreatePipelineTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.createPipelineTemplate);
    }

    /**
     * 创建流水线模板
     *
     * 创建流水线模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePipelineTemplateRequest 请求对象
     * @return SyncInvoker<CreatePipelineTemplateRequest, CreatePipelineTemplateResponse>
     */
    public SyncInvoker<CreatePipelineTemplateRequest, CreatePipelineTemplateResponse> createPipelineTemplateInvoker(
        CreatePipelineTemplateRequest request) {
        return new SyncInvoker<CreatePipelineTemplateRequest, CreatePipelineTemplateResponse>(request,
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
     * @return CreatePluginDraftResponse
     */
    public CreatePluginDraftResponse createPluginDraft(CreatePluginDraftRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.createPluginDraft);
    }

    /**
     * 创建插件草稿版本
     *
     * 创建插件草稿版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePluginDraftRequest 请求对象
     * @return SyncInvoker<CreatePluginDraftRequest, CreatePluginDraftResponse>
     */
    public SyncInvoker<CreatePluginDraftRequest, CreatePluginDraftResponse> createPluginDraftInvoker(
        CreatePluginDraftRequest request) {
        return new SyncInvoker<CreatePluginDraftRequest, CreatePluginDraftResponse>(request,
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
     * @return CreatePluginVersionResponse
     */
    public CreatePluginVersionResponse createPluginVersion(CreatePluginVersionRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.createPluginVersion);
    }

    /**
     * 创建插件版本
     *
     * 创建插件版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePluginVersionRequest 请求对象
     * @return SyncInvoker<CreatePluginVersionRequest, CreatePluginVersionResponse>
     */
    public SyncInvoker<CreatePluginVersionRequest, CreatePluginVersionResponse> createPluginVersionInvoker(
        CreatePluginVersionRequest request) {
        return new SyncInvoker<CreatePluginVersionRequest, CreatePluginVersionResponse>(request,
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
     * @return CreatePublisherResponse
     */
    public CreatePublisherResponse createPublisher(CreatePublisherRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.createPublisher);
    }

    /**
     * 创建发布商
     *
     * 创建发布商
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePublisherRequest 请求对象
     * @return SyncInvoker<CreatePublisherRequest, CreatePublisherResponse>
     */
    public SyncInvoker<CreatePublisherRequest, CreatePublisherResponse> createPublisherInvoker(
        CreatePublisherRequest request) {
        return new SyncInvoker<CreatePublisherRequest, CreatePublisherResponse>(request,
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
     * @return CreateRuleResponse
     */
    public CreateRuleResponse createRule(CreateRuleRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.createRule);
    }

    /**
     * 创建规则
     *
     * 创建规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRuleRequest 请求对象
     * @return SyncInvoker<CreateRuleRequest, CreateRuleResponse>
     */
    public SyncInvoker<CreateRuleRequest, CreateRuleResponse> createRuleInvoker(CreateRuleRequest request) {
        return new SyncInvoker<CreateRuleRequest, CreateRuleResponse>(request, CodeArtsPipelineMeta.createRule,
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
     * @return CreateStrategyResponse
     */
    public CreateStrategyResponse createStrategy(CreateStrategyRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.createStrategy);
    }

    /**
     * 创建规则集
     *
     * 创建规则集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateStrategyRequest 请求对象
     * @return SyncInvoker<CreateStrategyRequest, CreateStrategyResponse>
     */
    public SyncInvoker<CreateStrategyRequest, CreateStrategyResponse> createStrategyInvoker(
        CreateStrategyRequest request) {
        return new SyncInvoker<CreateStrategyRequest, CreateStrategyResponse>(request,
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
     * @return DeleteBasicPluginResponse
     */
    public DeleteBasicPluginResponse deleteBasicPlugin(DeleteBasicPluginRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.deleteBasicPlugin);
    }

    /**
     * 删除基础插件
     *
     * 删除基础插件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBasicPluginRequest 请求对象
     * @return SyncInvoker<DeleteBasicPluginRequest, DeleteBasicPluginResponse>
     */
    public SyncInvoker<DeleteBasicPluginRequest, DeleteBasicPluginResponse> deleteBasicPluginInvoker(
        DeleteBasicPluginRequest request) {
        return new SyncInvoker<DeleteBasicPluginRequest, DeleteBasicPluginResponse>(request,
            CodeArtsPipelineMeta.deleteBasicPlugin, hcClient);
    }

    /**
     * 删除流水线
     *
     * 删除流水线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePipelineRequest 请求对象
     * @return DeletePipelineResponse
     */
    public DeletePipelineResponse deletePipeline(DeletePipelineRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.deletePipeline);
    }

    /**
     * 删除流水线
     *
     * 删除流水线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePipelineRequest 请求对象
     * @return SyncInvoker<DeletePipelineRequest, DeletePipelineResponse>
     */
    public SyncInvoker<DeletePipelineRequest, DeletePipelineResponse> deletePipelineInvoker(
        DeletePipelineRequest request) {
        return new SyncInvoker<DeletePipelineRequest, DeletePipelineResponse>(request,
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
     * @return DeletePipelineGroupResponse
     */
    public DeletePipelineGroupResponse deletePipelineGroup(DeletePipelineGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.deletePipelineGroup);
    }

    /**
     * 删除流水线分组
     *
     * 删除流水线分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePipelineGroupRequest 请求对象
     * @return SyncInvoker<DeletePipelineGroupRequest, DeletePipelineGroupResponse>
     */
    public SyncInvoker<DeletePipelineGroupRequest, DeletePipelineGroupResponse> deletePipelineGroupInvoker(
        DeletePipelineGroupRequest request) {
        return new SyncInvoker<DeletePipelineGroupRequest, DeletePipelineGroupResponse>(request,
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
     * @return DeletePipelineTemplateResponse
     */
    public DeletePipelineTemplateResponse deletePipelineTemplate(DeletePipelineTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.deletePipelineTemplate);
    }

    /**
     * 删除流水线模板
     *
     * 删除流水线模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePipelineTemplateRequest 请求对象
     * @return SyncInvoker<DeletePipelineTemplateRequest, DeletePipelineTemplateResponse>
     */
    public SyncInvoker<DeletePipelineTemplateRequest, DeletePipelineTemplateResponse> deletePipelineTemplateInvoker(
        DeletePipelineTemplateRequest request) {
        return new SyncInvoker<DeletePipelineTemplateRequest, DeletePipelineTemplateResponse>(request,
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
     * @return DeletePluginDraftResponse
     */
    public DeletePluginDraftResponse deletePluginDraft(DeletePluginDraftRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.deletePluginDraft);
    }

    /**
     * 删除插件草稿
     *
     * 删除插件草稿
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePluginDraftRequest 请求对象
     * @return SyncInvoker<DeletePluginDraftRequest, DeletePluginDraftResponse>
     */
    public SyncInvoker<DeletePluginDraftRequest, DeletePluginDraftResponse> deletePluginDraftInvoker(
        DeletePluginDraftRequest request) {
        return new SyncInvoker<DeletePluginDraftRequest, DeletePluginDraftResponse>(request,
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
     * @return DeletePublisherResponse
     */
    public DeletePublisherResponse deletePublisher(DeletePublisherRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.deletePublisher);
    }

    /**
     * 删除发布商
     *
     * 删除发布商
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePublisherRequest 请求对象
     * @return SyncInvoker<DeletePublisherRequest, DeletePublisherResponse>
     */
    public SyncInvoker<DeletePublisherRequest, DeletePublisherResponse> deletePublisherInvoker(
        DeletePublisherRequest request) {
        return new SyncInvoker<DeletePublisherRequest, DeletePublisherResponse>(request,
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
     * @return DeleteRuleResponse
     */
    public DeleteRuleResponse deleteRule(DeleteRuleRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.deleteRule);
    }

    /**
     * 删除规则
     *
     * 删除规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRuleRequest 请求对象
     * @return SyncInvoker<DeleteRuleRequest, DeleteRuleResponse>
     */
    public SyncInvoker<DeleteRuleRequest, DeleteRuleResponse> deleteRuleInvoker(DeleteRuleRequest request) {
        return new SyncInvoker<DeleteRuleRequest, DeleteRuleResponse>(request, CodeArtsPipelineMeta.deleteRule,
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
     * @return DeleteStrategyResponse
     */
    public DeleteStrategyResponse deleteStrategy(DeleteStrategyRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.deleteStrategy);
    }

    /**
     * 删除规则集
     *
     * 删除规则集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteStrategyRequest 请求对象
     * @return SyncInvoker<DeleteStrategyRequest, DeleteStrategyResponse>
     */
    public SyncInvoker<DeleteStrategyRequest, DeleteStrategyResponse> deleteStrategyInvoker(
        DeleteStrategyRequest request) {
        return new SyncInvoker<DeleteStrategyRequest, DeleteStrategyResponse>(request,
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
     * @return ListAvailablePublisherResponse
     */
    public ListAvailablePublisherResponse listAvailablePublisher(ListAvailablePublisherRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.listAvailablePublisher);
    }

    /**
     * 查询可用发布商
     *
     * 查询可用发布商
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAvailablePublisherRequest 请求对象
     * @return SyncInvoker<ListAvailablePublisherRequest, ListAvailablePublisherResponse>
     */
    public SyncInvoker<ListAvailablePublisherRequest, ListAvailablePublisherResponse> listAvailablePublisherInvoker(
        ListAvailablePublisherRequest request) {
        return new SyncInvoker<ListAvailablePublisherRequest, ListAvailablePublisherResponse>(request,
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
     * @return ListBasePluginsResponse
     */
    public ListBasePluginsResponse listBasePlugins(ListBasePluginsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.listBasePlugins);
    }

    /**
     * 查询基础插件列表
     *
     * 查询基础插件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBasePluginsRequest 请求对象
     * @return SyncInvoker<ListBasePluginsRequest, ListBasePluginsResponse>
     */
    public SyncInvoker<ListBasePluginsRequest, ListBasePluginsResponse> listBasePluginsInvoker(
        ListBasePluginsRequest request) {
        return new SyncInvoker<ListBasePluginsRequest, ListBasePluginsResponse>(request,
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
     * @return ListBasePluginsNewPostResponse
     */
    public ListBasePluginsNewPostResponse listBasePluginsNewPost(ListBasePluginsNewPostRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.listBasePluginsNewPost);
    }

    /**
     * 分页查询可选插件列表
     *
     * 分页查询可选插件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBasePluginsNewPostRequest 请求对象
     * @return SyncInvoker<ListBasePluginsNewPostRequest, ListBasePluginsNewPostResponse>
     */
    public SyncInvoker<ListBasePluginsNewPostRequest, ListBasePluginsNewPostResponse> listBasePluginsNewPostInvoker(
        ListBasePluginsNewPostRequest request) {
        return new SyncInvoker<ListBasePluginsNewPostRequest, ListBasePluginsNewPostResponse>(request,
            CodeArtsPipelineMeta.listBasePluginsNewPost, hcClient);
    }

    /**
     * 查询插件所有版本信息
     *
     * 查询插件所有版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPLuginVersionRequest 请求对象
     * @return ListPLuginVersionResponse
     */
    public ListPLuginVersionResponse listPLuginVersion(ListPLuginVersionRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.listPLuginVersion);
    }

    /**
     * 查询插件所有版本信息
     *
     * 查询插件所有版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPLuginVersionRequest 请求对象
     * @return SyncInvoker<ListPLuginVersionRequest, ListPLuginVersionResponse>
     */
    public SyncInvoker<ListPLuginVersionRequest, ListPLuginVersionResponse> listPLuginVersionInvoker(
        ListPLuginVersionRequest request) {
        return new SyncInvoker<ListPLuginVersionRequest, ListPLuginVersionResponse>(request,
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
     * @return ListPipelineRunsResponse
     */
    public ListPipelineRunsResponse listPipelineRuns(ListPipelineRunsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.listPipelineRuns);
    }

    /**
     * 获取流水线执行记录
     *
     * 获取流水线执行记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPipelineRunsRequest 请求对象
     * @return SyncInvoker<ListPipelineRunsRequest, ListPipelineRunsResponse>
     */
    public SyncInvoker<ListPipelineRunsRequest, ListPipelineRunsResponse> listPipelineRunsInvoker(
        ListPipelineRunsRequest request) {
        return new SyncInvoker<ListPipelineRunsRequest, ListPipelineRunsResponse>(request,
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
     * @return ListPipelineSimpleInfoResponse
     */
    public ListPipelineSimpleInfoResponse listPipelineSimpleInfo(ListPipelineSimpleInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.listPipelineSimpleInfo);
    }

    /**
     * 获取流水线列表接口
     *
     * 获取流水线列表接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPipelineSimpleInfoRequest 请求对象
     * @return SyncInvoker<ListPipelineSimpleInfoRequest, ListPipelineSimpleInfoResponse>
     */
    public SyncInvoker<ListPipelineSimpleInfoRequest, ListPipelineSimpleInfoResponse> listPipelineSimpleInfoInvoker(
        ListPipelineSimpleInfoRequest request) {
        return new SyncInvoker<ListPipelineSimpleInfoRequest, ListPipelineSimpleInfoResponse>(request,
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
     * @return ListPipelineTemplatesResponse
     */
    public ListPipelineTemplatesResponse listPipelineTemplates(ListPipelineTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.listPipelineTemplates);
    }

    /**
     * 查询模板列表
     *
     * 查询流水线模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPipelineTemplatesRequest 请求对象
     * @return SyncInvoker<ListPipelineTemplatesRequest, ListPipelineTemplatesResponse>
     */
    public SyncInvoker<ListPipelineTemplatesRequest, ListPipelineTemplatesResponse> listPipelineTemplatesInvoker(
        ListPipelineTemplatesRequest request) {
        return new SyncInvoker<ListPipelineTemplatesRequest, ListPipelineTemplatesResponse>(request,
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
     * @return ListPipelinesResponse
     */
    public ListPipelinesResponse listPipelines(ListPipelinesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.listPipelines);
    }

    /**
     * 获取流水线列表/获取项目下流水线执行状况
     *
     * 获取流水线列表/获取项目下流水线执行状况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPipelinesRequest 请求对象
     * @return SyncInvoker<ListPipelinesRequest, ListPipelinesResponse>
     */
    public SyncInvoker<ListPipelinesRequest, ListPipelinesResponse> listPipelinesInvoker(ListPipelinesRequest request) {
        return new SyncInvoker<ListPipelinesRequest, ListPipelinesResponse>(request, CodeArtsPipelineMeta.listPipelines,
            hcClient);
    }

    /**
     * 获取项目下流水线执行状况
     *
     * 获取项目下流水线执行状况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPipleineBuildResultRequest 请求对象
     * @return ListPipleineBuildResultResponse
     */
    public ListPipleineBuildResultResponse listPipleineBuildResult(ListPipleineBuildResultRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.listPipleineBuildResult);
    }

    /**
     * 获取项目下流水线执行状况
     *
     * 获取项目下流水线执行状况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPipleineBuildResultRequest 请求对象
     * @return SyncInvoker<ListPipleineBuildResultRequest, ListPipleineBuildResultResponse>
     */
    public SyncInvoker<ListPipleineBuildResultRequest, ListPipleineBuildResultResponse> listPipleineBuildResultInvoker(
        ListPipleineBuildResultRequest request) {
        return new SyncInvoker<ListPipleineBuildResultRequest, ListPipleineBuildResultResponse>(request,
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
     * @return ListPluginVersionNumberResponse
     */
    public ListPluginVersionNumberResponse listPluginVersionNumber(ListPluginVersionNumberRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.listPluginVersionNumber);
    }

    /**
     * 查询插件版本号
     *
     * 查询插件版本号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPluginVersionNumberRequest 请求对象
     * @return SyncInvoker<ListPluginVersionNumberRequest, ListPluginVersionNumberResponse>
     */
    public SyncInvoker<ListPluginVersionNumberRequest, ListPluginVersionNumberResponse> listPluginVersionNumberInvoker(
        ListPluginVersionNumberRequest request) {
        return new SyncInvoker<ListPluginVersionNumberRequest, ListPluginVersionNumberResponse>(request,
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
     * @return ListPluginsResponse
     */
    public ListPluginsResponse listPlugins(ListPluginsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.listPlugins);
    }

    /**
     * 查询插件列表
     *
     * 查询插件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPluginsRequest 请求对象
     * @return SyncInvoker<ListPluginsRequest, ListPluginsResponse>
     */
    public SyncInvoker<ListPluginsRequest, ListPluginsResponse> listPluginsInvoker(ListPluginsRequest request) {
        return new SyncInvoker<ListPluginsRequest, ListPluginsResponse>(request, CodeArtsPipelineMeta.listPlugins,
            hcClient);
    }

    /**
     * 获取规则模板实例列表
     *
     * 获取规则集列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectStrategyRequest 请求对象
     * @return ListProjectStrategyResponse
     */
    public ListProjectStrategyResponse listProjectStrategy(ListProjectStrategyRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.listProjectStrategy);
    }

    /**
     * 获取规则模板实例列表
     *
     * 获取规则集列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectStrategyRequest 请求对象
     * @return SyncInvoker<ListProjectStrategyRequest, ListProjectStrategyResponse>
     */
    public SyncInvoker<ListProjectStrategyRequest, ListProjectStrategyResponse> listProjectStrategyInvoker(
        ListProjectStrategyRequest request) {
        return new SyncInvoker<ListProjectStrategyRequest, ListProjectStrategyResponse>(request,
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
     * @return ListPublisherResponse
     */
    public ListPublisherResponse listPublisher(ListPublisherRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.listPublisher);
    }

    /**
     * 查询发布商列表
     *
     * 查询发布商列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPublisherRequest 请求对象
     * @return SyncInvoker<ListPublisherRequest, ListPublisherResponse>
     */
    public SyncInvoker<ListPublisherRequest, ListPublisherResponse> listPublisherInvoker(ListPublisherRequest request) {
        return new SyncInvoker<ListPublisherRequest, ListPublisherResponse>(request, CodeArtsPipelineMeta.listPublisher,
            hcClient);
    }

    /**
     * 分页获取规则列表
     *
     * 分页获取规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRuleRequest 请求对象
     * @return ListRuleResponse
     */
    public ListRuleResponse listRule(ListRuleRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.listRule);
    }

    /**
     * 分页获取规则列表
     *
     * 分页获取规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRuleRequest 请求对象
     * @return SyncInvoker<ListRuleRequest, ListRuleResponse>
     */
    public SyncInvoker<ListRuleRequest, ListRuleResponse> listRuleInvoker(ListRuleRequest request) {
        return new SyncInvoker<ListRuleRequest, ListRuleResponse>(request, CodeArtsPipelineMeta.listRule, hcClient);
    }

    /**
     * 查询可选插件列表
     *
     * 查询可选插件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStagePluginsRequest 请求对象
     * @return ListStagePluginsResponse
     */
    public ListStagePluginsResponse listStagePlugins(ListStagePluginsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.listStagePlugins);
    }

    /**
     * 查询可选插件列表
     *
     * 查询可选插件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStagePluginsRequest 请求对象
     * @return SyncInvoker<ListStagePluginsRequest, ListStagePluginsResponse>
     */
    public SyncInvoker<ListStagePluginsRequest, ListStagePluginsResponse> listStagePluginsInvoker(
        ListStagePluginsRequest request) {
        return new SyncInvoker<ListStagePluginsRequest, ListStagePluginsResponse>(request,
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
     * @return ListStrategyResponse
     */
    public ListStrategyResponse listStrategy(ListStrategyRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.listStrategy);
    }

    /**
     * 获取规则集列表
     *
     * 获取规则集列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStrategyRequest 请求对象
     * @return SyncInvoker<ListStrategyRequest, ListStrategyResponse>
     */
    public SyncInvoker<ListStrategyRequest, ListStrategyResponse> listStrategyInvoker(ListStrategyRequest request) {
        return new SyncInvoker<ListStrategyRequest, ListStrategyResponse>(request, CodeArtsPipelineMeta.listStrategy,
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
     * @return ListTemplatesResponse
     */
    public ListTemplatesResponse listTemplates(ListTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.listTemplates);
    }

    /**
     * 查询模板列表
     *
     * 查询模板列表，支持分页查询,支持模板名字模糊查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTemplatesRequest 请求对象
     * @return SyncInvoker<ListTemplatesRequest, ListTemplatesResponse>
     */
    public SyncInvoker<ListTemplatesRequest, ListTemplatesResponse> listTemplatesInvoker(ListTemplatesRequest request) {
        return new SyncInvoker<ListTemplatesRequest, ListTemplatesResponse>(request, CodeArtsPipelineMeta.listTemplates,
            hcClient);
    }

    /**
     * 发布插件
     *
     * 发布插件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishPluginRequest 请求对象
     * @return PublishPluginResponse
     */
    public PublishPluginResponse publishPlugin(PublishPluginRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.publishPlugin);
    }

    /**
     * 发布插件
     *
     * 发布插件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishPluginRequest 请求对象
     * @return SyncInvoker<PublishPluginRequest, PublishPluginResponse>
     */
    public SyncInvoker<PublishPluginRequest, PublishPluginResponse> publishPluginInvoker(PublishPluginRequest request) {
        return new SyncInvoker<PublishPluginRequest, PublishPluginResponse>(request, CodeArtsPipelineMeta.publishPlugin,
            hcClient);
    }

    /**
     * 插件绑定发布商
     *
     * 插件绑定发布商
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishPluginBindRequest 请求对象
     * @return PublishPluginBindResponse
     */
    public PublishPluginBindResponse publishPluginBind(PublishPluginBindRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.publishPluginBind);
    }

    /**
     * 插件绑定发布商
     *
     * 插件绑定发布商
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishPluginBindRequest 请求对象
     * @return SyncInvoker<PublishPluginBindRequest, PublishPluginBindResponse>
     */
    public SyncInvoker<PublishPluginBindRequest, PublishPluginBindResponse> publishPluginBindInvoker(
        PublishPluginBindRequest request) {
        return new SyncInvoker<PublishPluginBindRequest, PublishPluginBindResponse>(request,
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
     * @return PublishPluginDraftResponse
     */
    public PublishPluginDraftResponse publishPluginDraft(PublishPluginDraftRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.publishPluginDraft);
    }

    /**
     * 发布插件草稿
     *
     * 发布插件草稿
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishPluginDraftRequest 请求对象
     * @return SyncInvoker<PublishPluginDraftRequest, PublishPluginDraftResponse>
     */
    public SyncInvoker<PublishPluginDraftRequest, PublishPluginDraftResponse> publishPluginDraftInvoker(
        PublishPluginDraftRequest request) {
        return new SyncInvoker<PublishPluginDraftRequest, PublishPluginDraftResponse>(request,
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
     * @return RejectManualReviewResponse
     */
    public RejectManualReviewResponse rejectManualReview(RejectManualReviewRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.rejectManualReview);
    }

    /**
     * 驳回人工审核
     *
     * 驳回人工审核
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RejectManualReviewRequest 请求对象
     * @return SyncInvoker<RejectManualReviewRequest, RejectManualReviewResponse>
     */
    public SyncInvoker<RejectManualReviewRequest, RejectManualReviewResponse> rejectManualReviewInvoker(
        RejectManualReviewRequest request) {
        return new SyncInvoker<RejectManualReviewRequest, RejectManualReviewResponse>(request,
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
     * @return RemovePipelineResponse
     */
    public RemovePipelineResponse removePipeline(RemovePipelineRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.removePipeline);
    }

    /**
     * 删除流水线
     *
     * 根据id删除流水线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RemovePipelineRequest 请求对象
     * @return SyncInvoker<RemovePipelineRequest, RemovePipelineResponse>
     */
    public SyncInvoker<RemovePipelineRequest, RemovePipelineResponse> removePipelineInvoker(
        RemovePipelineRequest request) {
        return new SyncInvoker<RemovePipelineRequest, RemovePipelineResponse>(request,
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
     * @return RetryPipelineRunResponse
     */
    public RetryPipelineRunResponse retryPipelineRun(RetryPipelineRunRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.retryPipelineRun);
    }

    /**
     * 重试运行流水线
     *
     * 重试运行流水线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RetryPipelineRunRequest 请求对象
     * @return SyncInvoker<RetryPipelineRunRequest, RetryPipelineRunResponse>
     */
    public SyncInvoker<RetryPipelineRunRequest, RetryPipelineRunResponse> retryPipelineRunInvoker(
        RetryPipelineRunRequest request) {
        return new SyncInvoker<RetryPipelineRunRequest, RetryPipelineRunResponse>(request,
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
     * @return RunPipelineResponse
     */
    public RunPipelineResponse runPipeline(RunPipelineRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.runPipeline);
    }

    /**
     * 启动流水线
     *
     * 启动流水线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunPipelineRequest 请求对象
     * @return SyncInvoker<RunPipelineRequest, RunPipelineResponse>
     */
    public SyncInvoker<RunPipelineRequest, RunPipelineResponse> runPipelineInvoker(RunPipelineRequest request) {
        return new SyncInvoker<RunPipelineRequest, RunPipelineResponse>(request, CodeArtsPipelineMeta.runPipeline,
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
     * @return ShowBasicPluginResponse
     */
    public ShowBasicPluginResponse showBasicPlugin(ShowBasicPluginRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.showBasicPlugin);
    }

    /**
     * 查询基础插件详情
     *
     * 查询基础插件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBasicPluginRequest 请求对象
     * @return SyncInvoker<ShowBasicPluginRequest, ShowBasicPluginResponse>
     */
    public SyncInvoker<ShowBasicPluginRequest, ShowBasicPluginResponse> showBasicPluginInvoker(
        ShowBasicPluginRequest request) {
        return new SyncInvoker<ShowBasicPluginRequest, ShowBasicPluginResponse>(request,
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
     * @return ShowInstanceStatusResponse
     */
    public ShowInstanceStatusResponse showInstanceStatus(ShowInstanceStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.showInstanceStatus);
    }

    /**
     * 检查流水线创建状态
     *
     * 检查流水线创建状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceStatusRequest 请求对象
     * @return SyncInvoker<ShowInstanceStatusRequest, ShowInstanceStatusResponse>
     */
    public SyncInvoker<ShowInstanceStatusRequest, ShowInstanceStatusResponse> showInstanceStatusInvoker(
        ShowInstanceStatusRequest request) {
        return new SyncInvoker<ShowInstanceStatusRequest, ShowInstanceStatusResponse>(request,
            CodeArtsPipelineMeta.showInstanceStatus, hcClient);
    }

    /**
     * 查询流水线详情
     *
     * 查询流水线详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPipelineDetailRequest 请求对象
     * @return ShowPipelineDetailResponse
     */
    public ShowPipelineDetailResponse showPipelineDetail(ShowPipelineDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.showPipelineDetail);
    }

    /**
     * 查询流水线详情
     *
     * 查询流水线详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPipelineDetailRequest 请求对象
     * @return SyncInvoker<ShowPipelineDetailRequest, ShowPipelineDetailResponse>
     */
    public SyncInvoker<ShowPipelineDetailRequest, ShowPipelineDetailResponse> showPipelineDetailInvoker(
        ShowPipelineDetailRequest request) {
        return new SyncInvoker<ShowPipelineDetailRequest, ShowPipelineDetailResponse>(request,
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
     * @return ShowPipelineGroupTreeResponse
     */
    public ShowPipelineGroupTreeResponse showPipelineGroupTree(ShowPipelineGroupTreeRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.showPipelineGroupTree);
    }

    /**
     * 查询流水线分组树
     *
     * 查询流水线分组树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPipelineGroupTreeRequest 请求对象
     * @return SyncInvoker<ShowPipelineGroupTreeRequest, ShowPipelineGroupTreeResponse>
     */
    public SyncInvoker<ShowPipelineGroupTreeRequest, ShowPipelineGroupTreeResponse> showPipelineGroupTreeInvoker(
        ShowPipelineGroupTreeRequest request) {
        return new SyncInvoker<ShowPipelineGroupTreeRequest, ShowPipelineGroupTreeResponse>(request,
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
     * @return ShowPipelineLogResponse
     */
    public ShowPipelineLogResponse showPipelineLog(ShowPipelineLogRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.showPipelineLog);
    }

    /**
     * 查询流水线日志
     *
     * 查询流水线日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPipelineLogRequest 请求对象
     * @return SyncInvoker<ShowPipelineLogRequest, ShowPipelineLogResponse>
     */
    public SyncInvoker<ShowPipelineLogRequest, ShowPipelineLogResponse> showPipelineLogInvoker(
        ShowPipelineLogRequest request) {
        return new SyncInvoker<ShowPipelineLogRequest, ShowPipelineLogResponse>(request,
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
     * @return ShowPipelineRunDetailResponse
     */
    public ShowPipelineRunDetailResponse showPipelineRunDetail(ShowPipelineRunDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.showPipelineRunDetail);
    }

    /**
     * 获取流水线状态/获取流水线执行详情
     *
     * 获取流水线状态/获取流水线执行详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPipelineRunDetailRequest 请求对象
     * @return SyncInvoker<ShowPipelineRunDetailRequest, ShowPipelineRunDetailResponse>
     */
    public SyncInvoker<ShowPipelineRunDetailRequest, ShowPipelineRunDetailResponse> showPipelineRunDetailInvoker(
        ShowPipelineRunDetailRequest request) {
        return new SyncInvoker<ShowPipelineRunDetailRequest, ShowPipelineRunDetailResponse>(request,
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
     * @return ShowPipelineTemplateDetailResponse
     */
    public ShowPipelineTemplateDetailResponse showPipelineTemplateDetail(ShowPipelineTemplateDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.showPipelineTemplateDetail);
    }

    /**
     * 查询模板详情
     *
     * 查询模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPipelineTemplateDetailRequest 请求对象
     * @return SyncInvoker<ShowPipelineTemplateDetailRequest, ShowPipelineTemplateDetailResponse>
     */
    public SyncInvoker<ShowPipelineTemplateDetailRequest, ShowPipelineTemplateDetailResponse> showPipelineTemplateDetailInvoker(
        ShowPipelineTemplateDetailRequest request) {
        return new SyncInvoker<ShowPipelineTemplateDetailRequest, ShowPipelineTemplateDetailResponse>(request,
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
     * @return ShowPipleineStatusResponse
     */
    public ShowPipleineStatusResponse showPipleineStatus(ShowPipleineStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.showPipleineStatus);
    }

    /**
     * 获取流水线状态
     *
     * 获取流水线状态,阶段及任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPipleineStatusRequest 请求对象
     * @return SyncInvoker<ShowPipleineStatusRequest, ShowPipleineStatusResponse>
     */
    public SyncInvoker<ShowPipleineStatusRequest, ShowPipleineStatusResponse> showPipleineStatusInvoker(
        ShowPipleineStatusRequest request) {
        return new SyncInvoker<ShowPipleineStatusRequest, ShowPipleineStatusResponse>(request,
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
     * @return ShowPluginInputsResponse
     */
    public ShowPluginInputsResponse showPluginInputs(ShowPluginInputsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.showPluginInputs);
    }

    /**
     * 查询插件输入配置
     *
     * 查询插件输入配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPluginInputsRequest 请求对象
     * @return SyncInvoker<ShowPluginInputsRequest, ShowPluginInputsResponse>
     */
    public SyncInvoker<ShowPluginInputsRequest, ShowPluginInputsResponse> showPluginInputsInvoker(
        ShowPluginInputsRequest request) {
        return new SyncInvoker<ShowPluginInputsRequest, ShowPluginInputsResponse>(request,
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
     * @return ShowPluginMetricsResponse
     */
    public ShowPluginMetricsResponse showPluginMetrics(ShowPluginMetricsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.showPluginMetrics);
    }

    /**
     * 查询插件指标配置
     *
     * 查询插件指标配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPluginMetricsRequest 请求对象
     * @return SyncInvoker<ShowPluginMetricsRequest, ShowPluginMetricsResponse>
     */
    public SyncInvoker<ShowPluginMetricsRequest, ShowPluginMetricsResponse> showPluginMetricsInvoker(
        ShowPluginMetricsRequest request) {
        return new SyncInvoker<ShowPluginMetricsRequest, ShowPluginMetricsResponse>(request,
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
     * @return ShowPluginOutputsResponse
     */
    public ShowPluginOutputsResponse showPluginOutputs(ShowPluginOutputsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.showPluginOutputs);
    }

    /**
     * 查询插件输出配置
     *
     * 查询插件输出配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPluginOutputsRequest 请求对象
     * @return SyncInvoker<ShowPluginOutputsRequest, ShowPluginOutputsResponse>
     */
    public SyncInvoker<ShowPluginOutputsRequest, ShowPluginOutputsResponse> showPluginOutputsInvoker(
        ShowPluginOutputsRequest request) {
        return new SyncInvoker<ShowPluginOutputsRequest, ShowPluginOutputsResponse>(request,
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
     * @return ShowPluginVersionResponse
     */
    public ShowPluginVersionResponse showPluginVersion(ShowPluginVersionRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.showPluginVersion);
    }

    /**
     * 查询插件版本详情
     *
     * 查询插件版本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPluginVersionRequest 请求对象
     * @return SyncInvoker<ShowPluginVersionRequest, ShowPluginVersionResponse>
     */
    public SyncInvoker<ShowPluginVersionRequest, ShowPluginVersionResponse> showPluginVersionInvoker(
        ShowPluginVersionRequest request) {
        return new SyncInvoker<ShowPluginVersionRequest, ShowPluginVersionResponse>(request,
            CodeArtsPipelineMeta.showPluginVersion, hcClient);
    }

    /**
     * 
     *
     * 查询项目级策略详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectStrategyRequest 请求对象
     * @return ShowProjectStrategyResponse
     */
    public ShowProjectStrategyResponse showProjectStrategy(ShowProjectStrategyRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.showProjectStrategy);
    }

    /**
     * 
     *
     * 查询项目级策略详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectStrategyRequest 请求对象
     * @return SyncInvoker<ShowProjectStrategyRequest, ShowProjectStrategyResponse>
     */
    public SyncInvoker<ShowProjectStrategyRequest, ShowProjectStrategyResponse> showProjectStrategyInvoker(
        ShowProjectStrategyRequest request) {
        return new SyncInvoker<ShowProjectStrategyRequest, ShowProjectStrategyResponse>(request,
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
     * @return ShowPublisherResponse
     */
    public ShowPublisherResponse showPublisher(ShowPublisherRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.showPublisher);
    }

    /**
     * 查询发布商详情
     *
     * 查询发布商详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPublisherRequest 请求对象
     * @return SyncInvoker<ShowPublisherRequest, ShowPublisherResponse>
     */
    public SyncInvoker<ShowPublisherRequest, ShowPublisherResponse> showPublisherInvoker(ShowPublisherRequest request) {
        return new SyncInvoker<ShowPublisherRequest, ShowPublisherResponse>(request, CodeArtsPipelineMeta.showPublisher,
            hcClient);
    }

    /**
     * 获取单条规则详情
     *
     * 获取单条规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRuleRequest 请求对象
     * @return ShowRuleResponse
     */
    public ShowRuleResponse showRule(ShowRuleRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.showRule);
    }

    /**
     * 获取单条规则详情
     *
     * 获取单条规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRuleRequest 请求对象
     * @return SyncInvoker<ShowRuleRequest, ShowRuleResponse>
     */
    public SyncInvoker<ShowRuleRequest, ShowRuleResponse> showRuleInvoker(ShowRuleRequest request) {
        return new SyncInvoker<ShowRuleRequest, ShowRuleResponse>(request, CodeArtsPipelineMeta.showRule, hcClient);
    }

    /**
     * 获取规则集详情
     *
     * 获取规则集详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStrategyRequest 请求对象
     * @return ShowStrategyResponse
     */
    public ShowStrategyResponse showStrategy(ShowStrategyRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.showStrategy);
    }

    /**
     * 获取规则集详情
     *
     * 获取规则集详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStrategyRequest 请求对象
     * @return SyncInvoker<ShowStrategyRequest, ShowStrategyResponse>
     */
    public SyncInvoker<ShowStrategyRequest, ShowStrategyResponse> showStrategyInvoker(ShowStrategyRequest request) {
        return new SyncInvoker<ShowStrategyRequest, ShowStrategyResponse>(request, CodeArtsPipelineMeta.showStrategy,
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
     * @return ShowTemplateDetailResponse
     */
    public ShowTemplateDetailResponse showTemplateDetail(ShowTemplateDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.showTemplateDetail);
    }

    /**
     * 查询模板详情
     *
     * 查询模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTemplateDetailRequest 请求对象
     * @return SyncInvoker<ShowTemplateDetailRequest, ShowTemplateDetailResponse>
     */
    public SyncInvoker<ShowTemplateDetailRequest, ShowTemplateDetailResponse> showTemplateDetailInvoker(
        ShowTemplateDetailRequest request) {
        return new SyncInvoker<ShowTemplateDetailRequest, ShowTemplateDetailResponse>(request,
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
     * @return StartNewPipelineResponse
     */
    public StartNewPipelineResponse startNewPipeline(StartNewPipelineRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.startNewPipeline);
    }

    /**
     * 启动流水线
     *
     * 启动流水线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartNewPipelineRequest 请求对象
     * @return SyncInvoker<StartNewPipelineRequest, StartNewPipelineResponse>
     */
    public SyncInvoker<StartNewPipelineRequest, StartNewPipelineResponse> startNewPipelineInvoker(
        StartNewPipelineRequest request) {
        return new SyncInvoker<StartNewPipelineRequest, StartNewPipelineResponse>(request,
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
     * @return StopPipelineNewResponse
     */
    public StopPipelineNewResponse stopPipelineNew(StopPipelineNewRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.stopPipelineNew);
    }

    /**
     * 停止流水线
     *
     * 停止流水线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopPipelineNewRequest 请求对象
     * @return SyncInvoker<StopPipelineNewRequest, StopPipelineNewResponse>
     */
    public SyncInvoker<StopPipelineNewRequest, StopPipelineNewResponse> stopPipelineNewInvoker(
        StopPipelineNewRequest request) {
        return new SyncInvoker<StopPipelineNewRequest, StopPipelineNewResponse>(request,
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
     * @return StopPipelineRunResponse
     */
    public StopPipelineRunResponse stopPipelineRun(StopPipelineRunRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.stopPipelineRun);
    }

    /**
     * 停止流水线
     *
     * 停止流水线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopPipelineRunRequest 请求对象
     * @return SyncInvoker<StopPipelineRunRequest, StopPipelineRunResponse>
     */
    public SyncInvoker<StopPipelineRunRequest, StopPipelineRunResponse> stopPipelineRunInvoker(
        StopPipelineRunRequest request) {
        return new SyncInvoker<StopPipelineRunRequest, StopPipelineRunResponse>(request,
            CodeArtsPipelineMeta.stopPipelineRun, hcClient);
    }

    /**
     * 开关规则集
     *
     * 修改规则集状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchStrategyRequest 请求对象
     * @return SwitchStrategyResponse
     */
    public SwitchStrategyResponse switchStrategy(SwitchStrategyRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.switchStrategy);
    }

    /**
     * 开关规则集
     *
     * 修改规则集状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchStrategyRequest 请求对象
     * @return SyncInvoker<SwitchStrategyRequest, SwitchStrategyResponse>
     */
    public SyncInvoker<SwitchStrategyRequest, SwitchStrategyResponse> switchStrategyInvoker(
        SwitchStrategyRequest request) {
        return new SyncInvoker<SwitchStrategyRequest, SwitchStrategyResponse>(request,
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
     * @return UpdateBasicPluginResponse
     */
    public UpdateBasicPluginResponse updateBasicPlugin(UpdateBasicPluginRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.updateBasicPlugin);
    }

    /**
     * 更新基础插件
     *
     * 更新基础插件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBasicPluginRequest 请求对象
     * @return SyncInvoker<UpdateBasicPluginRequest, UpdateBasicPluginResponse>
     */
    public SyncInvoker<UpdateBasicPluginRequest, UpdateBasicPluginResponse> updateBasicPluginInvoker(
        UpdateBasicPluginRequest request) {
        return new SyncInvoker<UpdateBasicPluginRequest, UpdateBasicPluginResponse>(request,
            CodeArtsPipelineMeta.updateBasicPlugin, hcClient);
    }

    /**
     * 更新流水线分组
     *
     * 更新流水线分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePipelineGroupRequest 请求对象
     * @return UpdatePipelineGroupResponse
     */
    public UpdatePipelineGroupResponse updatePipelineGroup(UpdatePipelineGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.updatePipelineGroup);
    }

    /**
     * 更新流水线分组
     *
     * 更新流水线分组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePipelineGroupRequest 请求对象
     * @return SyncInvoker<UpdatePipelineGroupRequest, UpdatePipelineGroupResponse>
     */
    public SyncInvoker<UpdatePipelineGroupRequest, UpdatePipelineGroupResponse> updatePipelineGroupInvoker(
        UpdatePipelineGroupRequest request) {
        return new SyncInvoker<UpdatePipelineGroupRequest, UpdatePipelineGroupResponse>(request,
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
     * @return UpdatePipelineTemplateResponse
     */
    public UpdatePipelineTemplateResponse updatePipelineTemplate(UpdatePipelineTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.updatePipelineTemplate);
    }

    /**
     * 更新流水线模板
     *
     * 更新流水线模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePipelineTemplateRequest 请求对象
     * @return SyncInvoker<UpdatePipelineTemplateRequest, UpdatePipelineTemplateResponse>
     */
    public SyncInvoker<UpdatePipelineTemplateRequest, UpdatePipelineTemplateResponse> updatePipelineTemplateInvoker(
        UpdatePipelineTemplateRequest request) {
        return new SyncInvoker<UpdatePipelineTemplateRequest, UpdatePipelineTemplateResponse>(request,
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
     * @return UpdatePluginBaseInfoResponse
     */
    public UpdatePluginBaseInfoResponse updatePluginBaseInfo(UpdatePluginBaseInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.updatePluginBaseInfo);
    }

    /**
     * 更新插件基本信息
     *
     * 更新插件基本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePluginBaseInfoRequest 请求对象
     * @return SyncInvoker<UpdatePluginBaseInfoRequest, UpdatePluginBaseInfoResponse>
     */
    public SyncInvoker<UpdatePluginBaseInfoRequest, UpdatePluginBaseInfoResponse> updatePluginBaseInfoInvoker(
        UpdatePluginBaseInfoRequest request) {
        return new SyncInvoker<UpdatePluginBaseInfoRequest, UpdatePluginBaseInfoResponse>(request,
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
     * @return UpdatePluginDraftResponse
     */
    public UpdatePluginDraftResponse updatePluginDraft(UpdatePluginDraftRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.updatePluginDraft);
    }

    /**
     * 更新插件草稿
     *
     * 更新插件草稿
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePluginDraftRequest 请求对象
     * @return SyncInvoker<UpdatePluginDraftRequest, UpdatePluginDraftResponse>
     */
    public SyncInvoker<UpdatePluginDraftRequest, UpdatePluginDraftResponse> updatePluginDraftInvoker(
        UpdatePluginDraftRequest request) {
        return new SyncInvoker<UpdatePluginDraftRequest, UpdatePluginDraftResponse>(request,
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
     * @return UpdateRuleResponse
     */
    public UpdateRuleResponse updateRule(UpdateRuleRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.updateRule);
    }

    /**
     * 更新规则
     *
     * 更新规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRuleRequest 请求对象
     * @return SyncInvoker<UpdateRuleRequest, UpdateRuleResponse>
     */
    public SyncInvoker<UpdateRuleRequest, UpdateRuleResponse> updateRuleInvoker(UpdateRuleRequest request) {
        return new SyncInvoker<UpdateRuleRequest, UpdateRuleResponse>(request, CodeArtsPipelineMeta.updateRule,
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
     * @return UpdateStrategyResponse
     */
    public UpdateStrategyResponse updateStrategy(UpdateStrategyRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.updateStrategy);
    }

    /**
     * 修改规则集
     *
     * 修改规则集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateStrategyRequest 请求对象
     * @return SyncInvoker<UpdateStrategyRequest, UpdateStrategyResponse>
     */
    public SyncInvoker<UpdateStrategyRequest, UpdateStrategyResponse> updateStrategyInvoker(
        UpdateStrategyRequest request) {
        return new SyncInvoker<UpdateStrategyRequest, UpdateStrategyResponse>(request,
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
     * @return UploadBasicPluginResponse
     */
    public UploadBasicPluginResponse uploadBasicPlugin(UploadBasicPluginRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.uploadBasicPlugin);
    }

    /**
     * 上传基础插件
     *
     * 上传基础插件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadBasicPluginRequest 请求对象
     * @return SyncInvoker<UploadBasicPluginRequest, UploadBasicPluginResponse>
     */
    public SyncInvoker<UploadBasicPluginRequest, UploadBasicPluginResponse> uploadBasicPluginInvoker(
        UploadBasicPluginRequest request) {
        return new SyncInvoker<UploadBasicPluginRequest, UploadBasicPluginResponse>(request,
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
     * @return UploadPluginIconResponse
     */
    public UploadPluginIconResponse uploadPluginIcon(UploadPluginIconRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.uploadPluginIcon);
    }

    /**
     * 更新插件图标
     *
     * 更新插件图标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadPluginIconRequest 请求对象
     * @return SyncInvoker<UploadPluginIconRequest, UploadPluginIconResponse>
     */
    public SyncInvoker<UploadPluginIconRequest, UploadPluginIconResponse> uploadPluginIconInvoker(
        UploadPluginIconRequest request) {
        return new SyncInvoker<UploadPluginIconRequest, UploadPluginIconResponse>(request,
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
     * @return UploadPublisherIconResponse
     */
    public UploadPublisherIconResponse uploadPublisherIcon(UploadPublisherIconRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsPipelineMeta.uploadPublisherIcon);
    }

    /**
     * 更新发布商图标
     *
     * 更新发布商图标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadPublisherIconRequest 请求对象
     * @return SyncInvoker<UploadPublisherIconRequest, UploadPublisherIconResponse>
     */
    public SyncInvoker<UploadPublisherIconRequest, UploadPublisherIconResponse> uploadPublisherIconInvoker(
        UploadPublisherIconRequest request) {
        return new SyncInvoker<UploadPublisherIconRequest, UploadPublisherIconResponse>(request,
            CodeArtsPipelineMeta.uploadPublisherIcon, hcClient);
    }

}

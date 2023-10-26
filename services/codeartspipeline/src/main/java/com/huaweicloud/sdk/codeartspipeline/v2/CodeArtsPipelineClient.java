package com.huaweicloud.sdk.codeartspipeline.v2;

import com.huaweicloud.sdk.codeartspipeline.v2.model.AcceptManualReviewRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.AcceptManualReviewResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.BatchShowPipelinesLatestStatusRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.BatchShowPipelinesLatestStatusResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.BatchShowPipelinesStatusRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.BatchShowPipelinesStatusResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreatePipelineByTemplateIdRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreatePipelineByTemplateIdResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreatePipelineByTemplateRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreatePipelineByTemplateResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreatePipelineNewRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.CreatePipelineNewResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeletePipelineRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.DeletePipelineResponse;
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
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListTemplatesRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ListTemplatesResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.RejectManualReviewRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.RejectManualReviewResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.RemovePipelineRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.RemovePipelineResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.RetryPipelineRunRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.RetryPipelineRunResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.RunPipelineRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.RunPipelineResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowInstanceStatusRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowInstanceStatusResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPipelineRunDetailRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPipelineRunDetailResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPipelineTemplateDetailRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPipelineTemplateDetailResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPipleineStatusRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowPipleineStatusResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowTemplateDetailRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.ShowTemplateDetailResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.StartNewPipelineRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.StartNewPipelineResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.StopPipelineNewRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.StopPipelineNewResponse;
import com.huaweicloud.sdk.codeartspipeline.v2.model.StopPipelineRunRequest;
import com.huaweicloud.sdk.codeartspipeline.v2.model.StopPipelineRunResponse;
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

}

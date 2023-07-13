package com.huaweicloud.sdk.cloudpipeline.v2;

import com.huaweicloud.sdk.cloudpipeline.v2.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CloudPipelineClient {

    protected HcClient hcClient;

    public CloudPipelineClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudPipelineClient> newBuilder() {
        return new ClientBuilder<>(CloudPipelineClient::new);
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
        return hcClient.syncInvokeHttp(request, CloudPipelineMeta.batchShowPipelinesLatestStatus);
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
            CloudPipelineMeta.batchShowPipelinesLatestStatus, hcClient);
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
        return hcClient.syncInvokeHttp(request, CloudPipelineMeta.batchShowPipelinesStatus);
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
            CloudPipelineMeta.batchShowPipelinesStatus, hcClient);
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
        return hcClient.syncInvokeHttp(request, CloudPipelineMeta.createPipelineByTemplate);
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
            CloudPipelineMeta.createPipelineByTemplate, hcClient);
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
        return hcClient.syncInvokeHttp(request, CloudPipelineMeta.createPipelineByTemplateId);
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
            CloudPipelineMeta.createPipelineByTemplateId, hcClient);
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
        return hcClient.syncInvokeHttp(request, CloudPipelineMeta.deletePipeline);
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
        return new SyncInvoker<DeletePipelineRequest, DeletePipelineResponse>(request, CloudPipelineMeta.deletePipeline,
            hcClient);
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
        return hcClient.syncInvokeHttp(request, CloudPipelineMeta.listPipelineRuns);
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
            CloudPipelineMeta.listPipelineRuns, hcClient);
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
        return hcClient.syncInvokeHttp(request, CloudPipelineMeta.listPipelineSimpleInfo);
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
            CloudPipelineMeta.listPipelineSimpleInfo, hcClient);
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
        return hcClient.syncInvokeHttp(request, CloudPipelineMeta.listPipelineTemplates);
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
            CloudPipelineMeta.listPipelineTemplates, hcClient);
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
        return hcClient.syncInvokeHttp(request, CloudPipelineMeta.listPipelines);
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
        return new SyncInvoker<ListPipelinesRequest, ListPipelinesResponse>(request, CloudPipelineMeta.listPipelines,
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
        return hcClient.syncInvokeHttp(request, CloudPipelineMeta.listPipleineBuildResult);
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
            CloudPipelineMeta.listPipleineBuildResult, hcClient);
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
        return hcClient.syncInvokeHttp(request, CloudPipelineMeta.listTemplates);
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
        return new SyncInvoker<ListTemplatesRequest, ListTemplatesResponse>(request, CloudPipelineMeta.listTemplates,
            hcClient);
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
        return hcClient.syncInvokeHttp(request, CloudPipelineMeta.removePipeline);
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
        return new SyncInvoker<RemovePipelineRequest, RemovePipelineResponse>(request, CloudPipelineMeta.removePipeline,
            hcClient);
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
        return hcClient.syncInvokeHttp(request, CloudPipelineMeta.runPipeline);
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
        return new SyncInvoker<RunPipelineRequest, RunPipelineResponse>(request, CloudPipelineMeta.runPipeline,
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
        return hcClient.syncInvokeHttp(request, CloudPipelineMeta.showInstanceStatus);
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
            CloudPipelineMeta.showInstanceStatus, hcClient);
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
        return hcClient.syncInvokeHttp(request, CloudPipelineMeta.showPipelineRunDetail);
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
            CloudPipelineMeta.showPipelineRunDetail, hcClient);
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
        return hcClient.syncInvokeHttp(request, CloudPipelineMeta.showPipelineTemplateDetail);
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
            CloudPipelineMeta.showPipelineTemplateDetail, hcClient);
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
        return hcClient.syncInvokeHttp(request, CloudPipelineMeta.showPipleineStatus);
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
            CloudPipelineMeta.showPipleineStatus, hcClient);
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
        return hcClient.syncInvokeHttp(request, CloudPipelineMeta.showTemplateDetail);
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
            CloudPipelineMeta.showTemplateDetail, hcClient);
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
        return hcClient.syncInvokeHttp(request, CloudPipelineMeta.startNewPipeline);
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
            CloudPipelineMeta.startNewPipeline, hcClient);
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
        return hcClient.syncInvokeHttp(request, CloudPipelineMeta.stopPipelineNew);
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
            CloudPipelineMeta.stopPipelineNew, hcClient);
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
        return hcClient.syncInvokeHttp(request, CloudPipelineMeta.stopPipelineRun);
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
            CloudPipelineMeta.stopPipelineRun, hcClient);
    }

}

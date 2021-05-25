package com.huaweicloud.sdk.cloudpipeline.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.cloudpipeline.v2.model.*;

public class CloudPipelineClient {
    protected HcClient hcClient;

    public CloudPipelineClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudPipelineClient> newBuilder() {
        return new ClientBuilder<>(CloudPipelineClient::new);
    }


    /**
     * 获取流水线状态
     * 批量获取流水线状态和阶段信息
     *
     * @param BatchShowPipelinesStatusRequest 请求对象
     * @return BatchShowPipelinesStatusResponse
     */
    public BatchShowPipelinesStatusResponse batchShowPipelinesStatus(BatchShowPipelinesStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CloudPipelineMeta.batchShowPipelinesStatus);
    }

    /**
     * 获取流水线状态
     * 批量获取流水线状态和阶段信息
     *
     * @param BatchShowPipelinesStatusRequest 请求对象
     * @return SyncInvoker<BatchShowPipelinesStatusRequest, BatchShowPipelinesStatusResponse>
     */
    public SyncInvoker<BatchShowPipelinesStatusRequest, BatchShowPipelinesStatusResponse> batchShowPipelinesStatusInvoker(BatchShowPipelinesStatusRequest request) {
        return new SyncInvoker<BatchShowPipelinesStatusRequest, BatchShowPipelinesStatusResponse>(request, CloudPipelineMeta.batchShowPipelinesStatus, hcClient);
    }

    /**
     * 基于模板快速创建流水线及流水线内任务
     * 基于模板快速创建流水线及流水线内任务
     *
     * @param CreatePipelineByTemplateRequest 请求对象
     * @return CreatePipelineByTemplateResponse
     */
    public CreatePipelineByTemplateResponse createPipelineByTemplate(CreatePipelineByTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CloudPipelineMeta.createPipelineByTemplate);
    }

    /**
     * 基于模板快速创建流水线及流水线内任务
     * 基于模板快速创建流水线及流水线内任务
     *
     * @param CreatePipelineByTemplateRequest 请求对象
     * @return SyncInvoker<CreatePipelineByTemplateRequest, CreatePipelineByTemplateResponse>
     */
    public SyncInvoker<CreatePipelineByTemplateRequest, CreatePipelineByTemplateResponse> createPipelineByTemplateInvoker(CreatePipelineByTemplateRequest request) {
        return new SyncInvoker<CreatePipelineByTemplateRequest, CreatePipelineByTemplateResponse>(request, CloudPipelineMeta.createPipelineByTemplate, hcClient);
    }

    /**
     * 获取项目下流水线执行状况
     * 获取项目下流水线执行状况
     *
     * @param ListPipleineBuildResultRequest 请求对象
     * @return ListPipleineBuildResultResponse
     */
    public ListPipleineBuildResultResponse listPipleineBuildResult(ListPipleineBuildResultRequest request) {
        return hcClient.syncInvokeHttp(request, CloudPipelineMeta.listPipleineBuildResult);
    }

    /**
     * 获取项目下流水线执行状况
     * 获取项目下流水线执行状况
     *
     * @param ListPipleineBuildResultRequest 请求对象
     * @return SyncInvoker<ListPipleineBuildResultRequest, ListPipleineBuildResultResponse>
     */
    public SyncInvoker<ListPipleineBuildResultRequest, ListPipleineBuildResultResponse> listPipleineBuildResultInvoker(ListPipleineBuildResultRequest request) {
        return new SyncInvoker<ListPipleineBuildResultRequest, ListPipleineBuildResultResponse>(request, CloudPipelineMeta.listPipleineBuildResult, hcClient);
    }

    /**
     * 查询模板列表
     * 查询模板列表，支持分页查询,支持模板名字模糊查询
     *
     * @param ListTemplatesRequest 请求对象
     * @return ListTemplatesResponse
     */
    public ListTemplatesResponse listTemplates(ListTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudPipelineMeta.listTemplates);
    }

    /**
     * 查询模板列表
     * 查询模板列表，支持分页查询,支持模板名字模糊查询
     *
     * @param ListTemplatesRequest 请求对象
     * @return SyncInvoker<ListTemplatesRequest, ListTemplatesResponse>
     */
    public SyncInvoker<ListTemplatesRequest, ListTemplatesResponse> listTemplatesInvoker(ListTemplatesRequest request) {
        return new SyncInvoker<ListTemplatesRequest, ListTemplatesResponse>(request, CloudPipelineMeta.listTemplates, hcClient);
    }

    /**
     * register注册Slave接口
     * 注册创建Slave接口
     *
     * @param RegisterAgentRequest 请求对象
     * @return RegisterAgentResponse
     */
    public RegisterAgentResponse registerAgent(RegisterAgentRequest request) {
        return hcClient.syncInvokeHttp(request, CloudPipelineMeta.registerAgent);
    }

    /**
     * register注册Slave接口
     * 注册创建Slave接口
     *
     * @param RegisterAgentRequest 请求对象
     * @return SyncInvoker<RegisterAgentRequest, RegisterAgentResponse>
     */
    public SyncInvoker<RegisterAgentRequest, RegisterAgentResponse> registerAgentInvoker(RegisterAgentRequest request) {
        return new SyncInvoker<RegisterAgentRequest, RegisterAgentResponse>(request, CloudPipelineMeta.registerAgent, hcClient);
    }

    /**
     * 删除流水线
     * 根据id删除流水线
     *
     * @param RemovePipelineRequest 请求对象
     * @return RemovePipelineResponse
     */
    public RemovePipelineResponse removePipeline(RemovePipelineRequest request) {
        return hcClient.syncInvokeHttp(request, CloudPipelineMeta.removePipeline);
    }

    /**
     * 删除流水线
     * 根据id删除流水线
     *
     * @param RemovePipelineRequest 请求对象
     * @return SyncInvoker<RemovePipelineRequest, RemovePipelineResponse>
     */
    public SyncInvoker<RemovePipelineRequest, RemovePipelineResponse> removePipelineInvoker(RemovePipelineRequest request) {
        return new SyncInvoker<RemovePipelineRequest, RemovePipelineResponse>(request, CloudPipelineMeta.removePipeline, hcClient);
    }

    /**
     * Agent状态查询
     * Agent状态查询
     *
     * @param ShowAgentStatusRequest 请求对象
     * @return ShowAgentStatusResponse
     */
    public ShowAgentStatusResponse showAgentStatus(ShowAgentStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CloudPipelineMeta.showAgentStatus);
    }

    /**
     * Agent状态查询
     * Agent状态查询
     *
     * @param ShowAgentStatusRequest 请求对象
     * @return SyncInvoker<ShowAgentStatusRequest, ShowAgentStatusResponse>
     */
    public SyncInvoker<ShowAgentStatusRequest, ShowAgentStatusResponse> showAgentStatusInvoker(ShowAgentStatusRequest request) {
        return new SyncInvoker<ShowAgentStatusRequest, ShowAgentStatusResponse>(request, CloudPipelineMeta.showAgentStatus, hcClient);
    }

    /**
     * 检查流水线创建状态
     * 检查流水线创建状态
     *
     * @param ShowInstanceStatusRequest 请求对象
     * @return ShowInstanceStatusResponse
     */
    public ShowInstanceStatusResponse showInstanceStatus(ShowInstanceStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CloudPipelineMeta.showInstanceStatus);
    }

    /**
     * 检查流水线创建状态
     * 检查流水线创建状态
     *
     * @param ShowInstanceStatusRequest 请求对象
     * @return SyncInvoker<ShowInstanceStatusRequest, ShowInstanceStatusResponse>
     */
    public SyncInvoker<ShowInstanceStatusRequest, ShowInstanceStatusResponse> showInstanceStatusInvoker(ShowInstanceStatusRequest request) {
        return new SyncInvoker<ShowInstanceStatusRequest, ShowInstanceStatusResponse>(request, CloudPipelineMeta.showInstanceStatus, hcClient);
    }

    /**
     * 获取流水线状态
     * 获取流水线状态,阶段及任务信息
     *
     * @param ShowPipleineStatusRequest 请求对象
     * @return ShowPipleineStatusResponse
     */
    public ShowPipleineStatusResponse showPipleineStatus(ShowPipleineStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CloudPipelineMeta.showPipleineStatus);
    }

    /**
     * 获取流水线状态
     * 获取流水线状态,阶段及任务信息
     *
     * @param ShowPipleineStatusRequest 请求对象
     * @return SyncInvoker<ShowPipleineStatusRequest, ShowPipleineStatusResponse>
     */
    public SyncInvoker<ShowPipleineStatusRequest, ShowPipleineStatusResponse> showPipleineStatusInvoker(ShowPipleineStatusRequest request) {
        return new SyncInvoker<ShowPipleineStatusRequest, ShowPipleineStatusResponse>(request, CloudPipelineMeta.showPipleineStatus, hcClient);
    }

    /**
     * 查询模板详情
     * 查询模板详情
     *
     * @param ShowTemplateDetailRequest 请求对象
     * @return ShowTemplateDetailResponse
     */
    public ShowTemplateDetailResponse showTemplateDetail(ShowTemplateDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CloudPipelineMeta.showTemplateDetail);
    }

    /**
     * 查询模板详情
     * 查询模板详情
     *
     * @param ShowTemplateDetailRequest 请求对象
     * @return SyncInvoker<ShowTemplateDetailRequest, ShowTemplateDetailResponse>
     */
    public SyncInvoker<ShowTemplateDetailRequest, ShowTemplateDetailResponse> showTemplateDetailInvoker(ShowTemplateDetailRequest request) {
        return new SyncInvoker<ShowTemplateDetailRequest, ShowTemplateDetailResponse>(request, CloudPipelineMeta.showTemplateDetail, hcClient);
    }

    /**
     * 启动流水线
     * 启动流水线
     *
     * @param StartNewPipelineRequest 请求对象
     * @return StartNewPipelineResponse
     */
    public StartNewPipelineResponse startNewPipeline(StartNewPipelineRequest request) {
        return hcClient.syncInvokeHttp(request, CloudPipelineMeta.startNewPipeline);
    }

    /**
     * 启动流水线
     * 启动流水线
     *
     * @param StartNewPipelineRequest 请求对象
     * @return SyncInvoker<StartNewPipelineRequest, StartNewPipelineResponse>
     */
    public SyncInvoker<StartNewPipelineRequest, StartNewPipelineResponse> startNewPipelineInvoker(StartNewPipelineRequest request) {
        return new SyncInvoker<StartNewPipelineRequest, StartNewPipelineResponse>(request, CloudPipelineMeta.startNewPipeline, hcClient);
    }

    /**
     * 停止流水线
     * 停止流水线
     *
     * @param StopPipelineNewRequest 请求对象
     * @return StopPipelineNewResponse
     */
    public StopPipelineNewResponse stopPipelineNew(StopPipelineNewRequest request) {
        return hcClient.syncInvokeHttp(request, CloudPipelineMeta.stopPipelineNew);
    }

    /**
     * 停止流水线
     * 停止流水线
     *
     * @param StopPipelineNewRequest 请求对象
     * @return SyncInvoker<StopPipelineNewRequest, StopPipelineNewResponse>
     */
    public SyncInvoker<StopPipelineNewRequest, StopPipelineNewResponse> stopPipelineNewInvoker(StopPipelineNewRequest request) {
        return new SyncInvoker<StopPipelineNewRequest, StopPipelineNewResponse>(request, CloudPipelineMeta.stopPipelineNew, hcClient);
    }

}
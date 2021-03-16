package com.huaweicloud.sdk.cloudpipeline.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.cloudpipeline.v2.model.*;

public class CloudPipelineAsyncClient {
    protected HcClient hcClient;

    public CloudPipelineAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudPipelineAsyncClient> newBuilder() {
        return new ClientBuilder<>(CloudPipelineAsyncClient::new);
    }


    /**
     * 获取流水线状态
     * 批量获取流水线状态和阶段信息
     *
     * @param BatchShowPipelinesStatusRequest 请求对象
     * @return CompletableFuture<BatchShowPipelinesStatusResponse>
     */
    public CompletableFuture<BatchShowPipelinesStatusResponse> batchShowPipelinesStatusAsync(BatchShowPipelinesStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPipelineMeta.batchShowPipelinesStatus);
    }

    /**
     * 获取流水线状态
     * 批量获取流水线状态和阶段信息
     *
     * @param BatchShowPipelinesStatusRequest 请求对象
     * @return AsyncInvoker<BatchShowPipelinesStatusRequest, BatchShowPipelinesStatusResponse>
     */
    public AsyncInvoker<BatchShowPipelinesStatusRequest, BatchShowPipelinesStatusResponse> batchShowPipelinesStatusAsyncInvoker(BatchShowPipelinesStatusRequest request) {
        return new AsyncInvoker<BatchShowPipelinesStatusRequest, BatchShowPipelinesStatusResponse>(request, CloudPipelineMeta.batchShowPipelinesStatus, hcClient);
    }

    /**
     * 基于模板快速创建流水线及流水线内任务
     * 基于模板快速创建流水线及流水线内任务
     *
     * @param CreatePipelineByTemplateRequest 请求对象
     * @return CompletableFuture<CreatePipelineByTemplateResponse>
     */
    public CompletableFuture<CreatePipelineByTemplateResponse> createPipelineByTemplateAsync(CreatePipelineByTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPipelineMeta.createPipelineByTemplate);
    }

    /**
     * 基于模板快速创建流水线及流水线内任务
     * 基于模板快速创建流水线及流水线内任务
     *
     * @param CreatePipelineByTemplateRequest 请求对象
     * @return AsyncInvoker<CreatePipelineByTemplateRequest, CreatePipelineByTemplateResponse>
     */
    public AsyncInvoker<CreatePipelineByTemplateRequest, CreatePipelineByTemplateResponse> createPipelineByTemplateAsyncInvoker(CreatePipelineByTemplateRequest request) {
        return new AsyncInvoker<CreatePipelineByTemplateRequest, CreatePipelineByTemplateResponse>(request, CloudPipelineMeta.createPipelineByTemplate, hcClient);
    }

    /**
     * 获取项目下流水线执行状况
     * 获取项目下流水线执行状况
     *
     * @param ListPipleineBuildResultRequest 请求对象
     * @return CompletableFuture<ListPipleineBuildResultResponse>
     */
    public CompletableFuture<ListPipleineBuildResultResponse> listPipleineBuildResultAsync(ListPipleineBuildResultRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPipelineMeta.listPipleineBuildResult);
    }

    /**
     * 获取项目下流水线执行状况
     * 获取项目下流水线执行状况
     *
     * @param ListPipleineBuildResultRequest 请求对象
     * @return AsyncInvoker<ListPipleineBuildResultRequest, ListPipleineBuildResultResponse>
     */
    public AsyncInvoker<ListPipleineBuildResultRequest, ListPipleineBuildResultResponse> listPipleineBuildResultAsyncInvoker(ListPipleineBuildResultRequest request) {
        return new AsyncInvoker<ListPipleineBuildResultRequest, ListPipleineBuildResultResponse>(request, CloudPipelineMeta.listPipleineBuildResult, hcClient);
    }

    /**
     * 查询模板列表
     * 查询模板列表，支持分页查询,支持模板名字模糊查询
     *
     * @param ListTemplatesRequest 请求对象
     * @return CompletableFuture<ListTemplatesResponse>
     */
    public CompletableFuture<ListTemplatesResponse> listTemplatesAsync(ListTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPipelineMeta.listTemplates);
    }

    /**
     * 查询模板列表
     * 查询模板列表，支持分页查询,支持模板名字模糊查询
     *
     * @param ListTemplatesRequest 请求对象
     * @return AsyncInvoker<ListTemplatesRequest, ListTemplatesResponse>
     */
    public AsyncInvoker<ListTemplatesRequest, ListTemplatesResponse> listTemplatesAsyncInvoker(ListTemplatesRequest request) {
        return new AsyncInvoker<ListTemplatesRequest, ListTemplatesResponse>(request, CloudPipelineMeta.listTemplates, hcClient);
    }

    /**
     * register注册Slave接口
     * 注册创建Slave接口
     *
     * @param RegisterAgentRequest 请求对象
     * @return CompletableFuture<RegisterAgentResponse>
     */
    public CompletableFuture<RegisterAgentResponse> registerAgentAsync(RegisterAgentRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPipelineMeta.registerAgent);
    }

    /**
     * register注册Slave接口
     * 注册创建Slave接口
     *
     * @param RegisterAgentRequest 请求对象
     * @return AsyncInvoker<RegisterAgentRequest, RegisterAgentResponse>
     */
    public AsyncInvoker<RegisterAgentRequest, RegisterAgentResponse> registerAgentAsyncInvoker(RegisterAgentRequest request) {
        return new AsyncInvoker<RegisterAgentRequest, RegisterAgentResponse>(request, CloudPipelineMeta.registerAgent, hcClient);
    }

    /**
     * 删除流水线
     * 根据id删除流水线
     *
     * @param RemovePipelineRequest 请求对象
     * @return CompletableFuture<RemovePipelineResponse>
     */
    public CompletableFuture<RemovePipelineResponse> removePipelineAsync(RemovePipelineRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPipelineMeta.removePipeline);
    }

    /**
     * 删除流水线
     * 根据id删除流水线
     *
     * @param RemovePipelineRequest 请求对象
     * @return AsyncInvoker<RemovePipelineRequest, RemovePipelineResponse>
     */
    public AsyncInvoker<RemovePipelineRequest, RemovePipelineResponse> removePipelineAsyncInvoker(RemovePipelineRequest request) {
        return new AsyncInvoker<RemovePipelineRequest, RemovePipelineResponse>(request, CloudPipelineMeta.removePipeline, hcClient);
    }

    /**
     * Agent状态查询
     * Agent状态查询
     *
     * @param ShowAgentStatusRequest 请求对象
     * @return CompletableFuture<ShowAgentStatusResponse>
     */
    public CompletableFuture<ShowAgentStatusResponse> showAgentStatusAsync(ShowAgentStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPipelineMeta.showAgentStatus);
    }

    /**
     * Agent状态查询
     * Agent状态查询
     *
     * @param ShowAgentStatusRequest 请求对象
     * @return AsyncInvoker<ShowAgentStatusRequest, ShowAgentStatusResponse>
     */
    public AsyncInvoker<ShowAgentStatusRequest, ShowAgentStatusResponse> showAgentStatusAsyncInvoker(ShowAgentStatusRequest request) {
        return new AsyncInvoker<ShowAgentStatusRequest, ShowAgentStatusResponse>(request, CloudPipelineMeta.showAgentStatus, hcClient);
    }

    /**
     * 检查流水线创建状态
     * 检查流水线创建状态
     *
     * @param ShowInstanceStatusRequest 请求对象
     * @return CompletableFuture<ShowInstanceStatusResponse>
     */
    public CompletableFuture<ShowInstanceStatusResponse> showInstanceStatusAsync(ShowInstanceStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPipelineMeta.showInstanceStatus);
    }

    /**
     * 检查流水线创建状态
     * 检查流水线创建状态
     *
     * @param ShowInstanceStatusRequest 请求对象
     * @return AsyncInvoker<ShowInstanceStatusRequest, ShowInstanceStatusResponse>
     */
    public AsyncInvoker<ShowInstanceStatusRequest, ShowInstanceStatusResponse> showInstanceStatusAsyncInvoker(ShowInstanceStatusRequest request) {
        return new AsyncInvoker<ShowInstanceStatusRequest, ShowInstanceStatusResponse>(request, CloudPipelineMeta.showInstanceStatus, hcClient);
    }

    /**
     * 获取流水线状态
     * 获取流水线状态,阶段及任务信息
     *
     * @param ShowPipleineStatusRequest 请求对象
     * @return CompletableFuture<ShowPipleineStatusResponse>
     */
    public CompletableFuture<ShowPipleineStatusResponse> showPipleineStatusAsync(ShowPipleineStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPipelineMeta.showPipleineStatus);
    }

    /**
     * 获取流水线状态
     * 获取流水线状态,阶段及任务信息
     *
     * @param ShowPipleineStatusRequest 请求对象
     * @return AsyncInvoker<ShowPipleineStatusRequest, ShowPipleineStatusResponse>
     */
    public AsyncInvoker<ShowPipleineStatusRequest, ShowPipleineStatusResponse> showPipleineStatusAsyncInvoker(ShowPipleineStatusRequest request) {
        return new AsyncInvoker<ShowPipleineStatusRequest, ShowPipleineStatusResponse>(request, CloudPipelineMeta.showPipleineStatus, hcClient);
    }

    /**
     * 查询模板详情
     * 查询模板详情
     *
     * @param ShowTemplateDetailRequest 请求对象
     * @return CompletableFuture<ShowTemplateDetailResponse>
     */
    public CompletableFuture<ShowTemplateDetailResponse> showTemplateDetailAsync(ShowTemplateDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPipelineMeta.showTemplateDetail);
    }

    /**
     * 查询模板详情
     * 查询模板详情
     *
     * @param ShowTemplateDetailRequest 请求对象
     * @return AsyncInvoker<ShowTemplateDetailRequest, ShowTemplateDetailResponse>
     */
    public AsyncInvoker<ShowTemplateDetailRequest, ShowTemplateDetailResponse> showTemplateDetailAsyncInvoker(ShowTemplateDetailRequest request) {
        return new AsyncInvoker<ShowTemplateDetailRequest, ShowTemplateDetailResponse>(request, CloudPipelineMeta.showTemplateDetail, hcClient);
    }

    /**
     * 启动流水线
     * 启动流水线
     *
     * @param StartNewPipelineRequest 请求对象
     * @return CompletableFuture<StartNewPipelineResponse>
     */
    public CompletableFuture<StartNewPipelineResponse> startNewPipelineAsync(StartNewPipelineRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPipelineMeta.startNewPipeline);
    }

    /**
     * 启动流水线
     * 启动流水线
     *
     * @param StartNewPipelineRequest 请求对象
     * @return AsyncInvoker<StartNewPipelineRequest, StartNewPipelineResponse>
     */
    public AsyncInvoker<StartNewPipelineRequest, StartNewPipelineResponse> startNewPipelineAsyncInvoker(StartNewPipelineRequest request) {
        return new AsyncInvoker<StartNewPipelineRequest, StartNewPipelineResponse>(request, CloudPipelineMeta.startNewPipeline, hcClient);
    }

    /**
     * 执行流水线
     * 执行流水线
     *
     * @param StartPipelineRequest 请求对象
     * @return CompletableFuture<StartPipelineResponse>
     */
    public CompletableFuture<StartPipelineResponse> startPipelineAsync(StartPipelineRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPipelineMeta.startPipeline);
    }

    /**
     * 执行流水线
     * 执行流水线
     *
     * @param StartPipelineRequest 请求对象
     * @return AsyncInvoker<StartPipelineRequest, StartPipelineResponse>
     */
    public AsyncInvoker<StartPipelineRequest, StartPipelineResponse> startPipelineAsyncInvoker(StartPipelineRequest request) {
        return new AsyncInvoker<StartPipelineRequest, StartPipelineResponse>(request, CloudPipelineMeta.startPipeline, hcClient);
    }

    /**
     * 停止流水线
     * 停止流水线
     *
     * @param StopPipelineRequest 请求对象
     * @return CompletableFuture<StopPipelineResponse>
     */
    public CompletableFuture<StopPipelineResponse> stopPipelineAsync(StopPipelineRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPipelineMeta.stopPipeline);
    }

    /**
     * 停止流水线
     * 停止流水线
     *
     * @param StopPipelineRequest 请求对象
     * @return AsyncInvoker<StopPipelineRequest, StopPipelineResponse>
     */
    public AsyncInvoker<StopPipelineRequest, StopPipelineResponse> stopPipelineAsyncInvoker(StopPipelineRequest request) {
        return new AsyncInvoker<StopPipelineRequest, StopPipelineResponse>(request, CloudPipelineMeta.stopPipeline, hcClient);
    }

}
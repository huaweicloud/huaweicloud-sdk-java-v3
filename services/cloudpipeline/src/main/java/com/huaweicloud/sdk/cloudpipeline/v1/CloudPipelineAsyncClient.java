package com.huaweicloud.sdk.cloudpipeline.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.cloudpipeline.v1.model.*;

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
     * 停止流水线
     * 停止流水线
     *
     * @param StopPipelineRequest 请求对象
     * @return CompletableFuture<StopPipelineResponse>
     */
    public CompletableFuture<StopPipelineResponse> stopPipelineAsync(StopPipelineRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPipelineMeta.stopPipeline);
    }

}
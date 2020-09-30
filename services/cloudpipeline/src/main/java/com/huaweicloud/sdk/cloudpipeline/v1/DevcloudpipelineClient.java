package com.huaweicloud.sdk.cloudpipeline.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.cloudpipeline.v1.model.*;

public class DevcloudpipelineClient {
    protected HcClient hcClient;

    public DevcloudpipelineClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DevcloudpipelineClient> newBuilder() {
        return new ClientBuilder<>(DevcloudpipelineClient::new);
    }


    /**
     * 获取流水线状态
     * 批量获取流水线状态和阶段信息
     *
     * @param BatchShowPipelinesStatusRequest 请求对象
     * @return BatchShowPipelinesStatusResponse
     */
    public BatchShowPipelinesStatusResponse batchShowPipelinesStatus(BatchShowPipelinesStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DevcloudpipelineMeta.batchShowPipelinesStatus);
    }

    /**
     * 基于模板快速创建流水线及流水线内任务
     * 基于模板快速创建流水线及流水线内任务
     *
     * @param CreatePipelineByTemplateRequest 请求对象
     * @return CreatePipelineByTemplateResponse
     */
    public CreatePipelineByTemplateResponse createPipelineByTemplate(CreatePipelineByTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DevcloudpipelineMeta.createPipelineByTemplate);
    }

    /**
     * 查询模板列表
     * 查询模板列表，支持分页查询,支持模板名字模糊查询
     *
     * @param ListTemplatesRequest 请求对象
     * @return ListTemplatesResponse
     */
    public ListTemplatesResponse listTemplates(ListTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, DevcloudpipelineMeta.listTemplates);
    }

    /**
     * register注册Slave接口
     * 注册创建Slave接口
     *
     * @param RegisterAgentRequest 请求对象
     * @return RegisterAgentResponse
     */
    public RegisterAgentResponse registerAgent(RegisterAgentRequest request) {
        return hcClient.syncInvokeHttp(request, DevcloudpipelineMeta.registerAgent);
    }

    /**
     * 删除流水线
     * 根据id删除流水线
     *
     * @param RemovePipelineRequest 请求对象
     * @return RemovePipelineResponse
     */
    public RemovePipelineResponse removePipeline(RemovePipelineRequest request) {
        return hcClient.syncInvokeHttp(request, DevcloudpipelineMeta.removePipeline);
    }

    /**
     * Agent状态查询
     * Agent状态查询
     *
     * @param ShowAgentStatusRequest 请求对象
     * @return ShowAgentStatusResponse
     */
    public ShowAgentStatusResponse showAgentStatus(ShowAgentStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DevcloudpipelineMeta.showAgentStatus);
    }

    /**
     * 检查流水线创建状态
     * 检查流水线创建状态
     *
     * @param ShowInstanceStatusRequest 请求对象
     * @return ShowInstanceStatusResponse
     */
    public ShowInstanceStatusResponse showInstanceStatus(ShowInstanceStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DevcloudpipelineMeta.showInstanceStatus);
    }

    /**
     * 获取流水线状态
     * 获取流水线状态,阶段及任务信息
     *
     * @param ShowPipleineStatusRequest 请求对象
     * @return ShowPipleineStatusResponse
     */
    public ShowPipleineStatusResponse showPipleineStatus(ShowPipleineStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DevcloudpipelineMeta.showPipleineStatus);
    }

    /**
     * 查询模板详情
     * 查询模板详情
     *
     * @param ShowTemplateDetailRequest 请求对象
     * @return ShowTemplateDetailResponse
     */
    public ShowTemplateDetailResponse showTemplateDetail(ShowTemplateDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DevcloudpipelineMeta.showTemplateDetail);
    }

    /**
     * 启动流水线
     * 启动流水线
     *
     * @param StartNewPipelineRequest 请求对象
     * @return StartNewPipelineResponse
     */
    public StartNewPipelineResponse startNewPipeline(StartNewPipelineRequest request) {
        return hcClient.syncInvokeHttp(request, DevcloudpipelineMeta.startNewPipeline);
    }

    /**
     * 执行流水线
     * 执行流水线
     *
     * @param StartPipelineRequest 请求对象
     * @return StartPipelineResponse
     */
    public StartPipelineResponse startPipeline(StartPipelineRequest request) {
        return hcClient.syncInvokeHttp(request, DevcloudpipelineMeta.startPipeline);
    }

    /**
     * 停止流水线
     * 停止流水线
     *
     * @param StopPipelineRequest 请求对象
     * @return StopPipelineResponse
     */
    public StopPipelineResponse stopPipeline(StopPipelineRequest request) {
        return hcClient.syncInvokeHttp(request, DevcloudpipelineMeta.stopPipeline);
    }

}
package com.huaweicloud.sdk.cloudpipeline.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.cloudpipeline.v1.model.*;

public class DevcloudpipelineAsyncClient {
    protected HcClient hcClient;

    public DevcloudpipelineAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DevcloudpipelineAsyncClient> newBuilder() {
        return new ClientBuilder<>(DevcloudpipelineAsyncClient::new);
    }


    public CompletableFuture<BatchShowPipelinesStatusResponse> batchShowPipelinesStatusAsync(BatchShowPipelinesStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DevcloudpipelineMeta.batchShowPipelinesStatus);
    }

    public CompletableFuture<CreatePipelineByTemplateResponse> createPipelineByTemplateAsync(CreatePipelineByTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DevcloudpipelineMeta.createPipelineByTemplate);
    }

    public CompletableFuture<ListTemplatesResponse> listTemplatesAsync(ListTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, DevcloudpipelineMeta.listTemplates);
    }

    public CompletableFuture<RegisterAgentResponse> registerAgentAsync(RegisterAgentRequest request) {
        return hcClient.asyncInvokeHttp(request, DevcloudpipelineMeta.registerAgent);
    }

    public CompletableFuture<RemovePipelineResponse> removePipelineAsync(RemovePipelineRequest request) {
        return hcClient.asyncInvokeHttp(request, DevcloudpipelineMeta.removePipeline);
    }

    public CompletableFuture<ShowAgentStatusResponse> showAgentStatusAsync(ShowAgentStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DevcloudpipelineMeta.showAgentStatus);
    }

    public CompletableFuture<ShowInstanceStatusResponse> showInstanceStatusAsync(ShowInstanceStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DevcloudpipelineMeta.showInstanceStatus);
    }

    public CompletableFuture<ShowPipleineStatusResponse> showPipleineStatusAsync(ShowPipleineStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DevcloudpipelineMeta.showPipleineStatus);
    }

    public CompletableFuture<ShowTemplateDetailResponse> showTemplateDetailAsync(ShowTemplateDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DevcloudpipelineMeta.showTemplateDetail);
    }

    public CompletableFuture<StartNewPipelineResponse> startNewPipelineAsync(StartNewPipelineRequest request) {
        return hcClient.asyncInvokeHttp(request, DevcloudpipelineMeta.startNewPipeline);
    }

    public CompletableFuture<StartPipelineResponse> startPipelineAsync(StartPipelineRequest request) {
        return hcClient.asyncInvokeHttp(request, DevcloudpipelineMeta.startPipeline);
    }

    public CompletableFuture<StopPipelineResponse> stopPipelineAsync(StopPipelineRequest request) {
        return hcClient.asyncInvokeHttp(request, DevcloudpipelineMeta.stopPipeline);
    }

}
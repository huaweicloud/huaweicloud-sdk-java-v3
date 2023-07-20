package com.huaweicloud.sdk.cloudpipeline.v2;

import com.huaweicloud.sdk.cloudpipeline.v2.model.BatchShowPipelinesLatestStatusRequest;
import com.huaweicloud.sdk.cloudpipeline.v2.model.BatchShowPipelinesLatestStatusResponse;
import com.huaweicloud.sdk.cloudpipeline.v2.model.BatchShowPipelinesStatusRequest;
import com.huaweicloud.sdk.cloudpipeline.v2.model.BatchShowPipelinesStatusResponse;
import com.huaweicloud.sdk.cloudpipeline.v2.model.CreatePipelineByTemplateIdRequest;
import com.huaweicloud.sdk.cloudpipeline.v2.model.CreatePipelineByTemplateIdResponse;
import com.huaweicloud.sdk.cloudpipeline.v2.model.CreatePipelineByTemplateRequest;
import com.huaweicloud.sdk.cloudpipeline.v2.model.CreatePipelineByTemplateResponse;
import com.huaweicloud.sdk.cloudpipeline.v2.model.DeletePipelineRequest;
import com.huaweicloud.sdk.cloudpipeline.v2.model.DeletePipelineResponse;
import com.huaweicloud.sdk.cloudpipeline.v2.model.ListPipelineRunsRequest;
import com.huaweicloud.sdk.cloudpipeline.v2.model.ListPipelineRunsResponse;
import com.huaweicloud.sdk.cloudpipeline.v2.model.ListPipelineSimpleInfoRequest;
import com.huaweicloud.sdk.cloudpipeline.v2.model.ListPipelineSimpleInfoResponse;
import com.huaweicloud.sdk.cloudpipeline.v2.model.ListPipelineTemplatesRequest;
import com.huaweicloud.sdk.cloudpipeline.v2.model.ListPipelineTemplatesResponse;
import com.huaweicloud.sdk.cloudpipeline.v2.model.ListPipelinesRequest;
import com.huaweicloud.sdk.cloudpipeline.v2.model.ListPipelinesResponse;
import com.huaweicloud.sdk.cloudpipeline.v2.model.ListPipleineBuildResultRequest;
import com.huaweicloud.sdk.cloudpipeline.v2.model.ListPipleineBuildResultResponse;
import com.huaweicloud.sdk.cloudpipeline.v2.model.ListTemplatesRequest;
import com.huaweicloud.sdk.cloudpipeline.v2.model.ListTemplatesResponse;
import com.huaweicloud.sdk.cloudpipeline.v2.model.RemovePipelineRequest;
import com.huaweicloud.sdk.cloudpipeline.v2.model.RemovePipelineResponse;
import com.huaweicloud.sdk.cloudpipeline.v2.model.RunPipelineRequest;
import com.huaweicloud.sdk.cloudpipeline.v2.model.RunPipelineResponse;
import com.huaweicloud.sdk.cloudpipeline.v2.model.ShowInstanceStatusRequest;
import com.huaweicloud.sdk.cloudpipeline.v2.model.ShowInstanceStatusResponse;
import com.huaweicloud.sdk.cloudpipeline.v2.model.ShowPipelineRunDetailRequest;
import com.huaweicloud.sdk.cloudpipeline.v2.model.ShowPipelineRunDetailResponse;
import com.huaweicloud.sdk.cloudpipeline.v2.model.ShowPipelineTemplateDetailRequest;
import com.huaweicloud.sdk.cloudpipeline.v2.model.ShowPipelineTemplateDetailResponse;
import com.huaweicloud.sdk.cloudpipeline.v2.model.ShowPipleineStatusRequest;
import com.huaweicloud.sdk.cloudpipeline.v2.model.ShowPipleineStatusResponse;
import com.huaweicloud.sdk.cloudpipeline.v2.model.ShowTemplateDetailRequest;
import com.huaweicloud.sdk.cloudpipeline.v2.model.ShowTemplateDetailResponse;
import com.huaweicloud.sdk.cloudpipeline.v2.model.StartNewPipelineRequest;
import com.huaweicloud.sdk.cloudpipeline.v2.model.StartNewPipelineResponse;
import com.huaweicloud.sdk.cloudpipeline.v2.model.StopPipelineNewRequest;
import com.huaweicloud.sdk.cloudpipeline.v2.model.StopPipelineNewResponse;
import com.huaweicloud.sdk.cloudpipeline.v2.model.StopPipelineRunRequest;
import com.huaweicloud.sdk.cloudpipeline.v2.model.StopPipelineRunResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CloudPipelineAsyncClient {

    protected HcClient hcClient;

    public CloudPipelineAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudPipelineAsyncClient> newBuilder() {
        ClientBuilder<CloudPipelineAsyncClient> clientBuilder = new ClientBuilder<>(CloudPipelineAsyncClient::new);
        return clientBuilder;
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
        return hcClient.asyncInvokeHttp(request, CloudPipelineMeta.batchShowPipelinesLatestStatus);
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
     * @return CompletableFuture<BatchShowPipelinesStatusResponse>
     */
    public CompletableFuture<BatchShowPipelinesStatusResponse> batchShowPipelinesStatusAsync(
        BatchShowPipelinesStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPipelineMeta.batchShowPipelinesStatus);
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
     * @return CompletableFuture<CreatePipelineByTemplateResponse>
     */
    public CompletableFuture<CreatePipelineByTemplateResponse> createPipelineByTemplateAsync(
        CreatePipelineByTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPipelineMeta.createPipelineByTemplate);
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
     * @return CompletableFuture<CreatePipelineByTemplateIdResponse>
     */
    public CompletableFuture<CreatePipelineByTemplateIdResponse> createPipelineByTemplateIdAsync(
        CreatePipelineByTemplateIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPipelineMeta.createPipelineByTemplateId);
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
     * @return CompletableFuture<DeletePipelineResponse>
     */
    public CompletableFuture<DeletePipelineResponse> deletePipelineAsync(DeletePipelineRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPipelineMeta.deletePipeline);
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
            CloudPipelineMeta.deletePipeline, hcClient);
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
        return hcClient.asyncInvokeHttp(request, CloudPipelineMeta.listPipelineRuns);
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
     * @return CompletableFuture<ListPipelineSimpleInfoResponse>
     */
    public CompletableFuture<ListPipelineSimpleInfoResponse> listPipelineSimpleInfoAsync(
        ListPipelineSimpleInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPipelineMeta.listPipelineSimpleInfo);
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
     * @return CompletableFuture<ListPipelineTemplatesResponse>
     */
    public CompletableFuture<ListPipelineTemplatesResponse> listPipelineTemplatesAsync(
        ListPipelineTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPipelineMeta.listPipelineTemplates);
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
     * @return CompletableFuture<ListPipelinesResponse>
     */
    public CompletableFuture<ListPipelinesResponse> listPipelinesAsync(ListPipelinesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPipelineMeta.listPipelines);
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
        return new AsyncInvoker<ListPipelinesRequest, ListPipelinesResponse>(request, CloudPipelineMeta.listPipelines,
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
     * @return CompletableFuture<ListPipleineBuildResultResponse>
     */
    public CompletableFuture<ListPipleineBuildResultResponse> listPipleineBuildResultAsync(
        ListPipleineBuildResultRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPipelineMeta.listPipleineBuildResult);
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
     * @return CompletableFuture<ListTemplatesResponse>
     */
    public CompletableFuture<ListTemplatesResponse> listTemplatesAsync(ListTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPipelineMeta.listTemplates);
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
        return new AsyncInvoker<ListTemplatesRequest, ListTemplatesResponse>(request, CloudPipelineMeta.listTemplates,
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
     * @return CompletableFuture<RemovePipelineResponse>
     */
    public CompletableFuture<RemovePipelineResponse> removePipelineAsync(RemovePipelineRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPipelineMeta.removePipeline);
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
            CloudPipelineMeta.removePipeline, hcClient);
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
        return hcClient.asyncInvokeHttp(request, CloudPipelineMeta.runPipeline);
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
        return new AsyncInvoker<RunPipelineRequest, RunPipelineResponse>(request, CloudPipelineMeta.runPipeline,
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
     * @return CompletableFuture<ShowInstanceStatusResponse>
     */
    public CompletableFuture<ShowInstanceStatusResponse> showInstanceStatusAsync(ShowInstanceStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPipelineMeta.showInstanceStatus);
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
     * @return CompletableFuture<ShowPipelineRunDetailResponse>
     */
    public CompletableFuture<ShowPipelineRunDetailResponse> showPipelineRunDetailAsync(
        ShowPipelineRunDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPipelineMeta.showPipelineRunDetail);
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
     * @return CompletableFuture<ShowPipelineTemplateDetailResponse>
     */
    public CompletableFuture<ShowPipelineTemplateDetailResponse> showPipelineTemplateDetailAsync(
        ShowPipelineTemplateDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPipelineMeta.showPipelineTemplateDetail);
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
     * @return CompletableFuture<ShowPipleineStatusResponse>
     */
    public CompletableFuture<ShowPipleineStatusResponse> showPipleineStatusAsync(ShowPipleineStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPipelineMeta.showPipleineStatus);
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
     * @return CompletableFuture<ShowTemplateDetailResponse>
     */
    public CompletableFuture<ShowTemplateDetailResponse> showTemplateDetailAsync(ShowTemplateDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPipelineMeta.showTemplateDetail);
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
     * @return CompletableFuture<StartNewPipelineResponse>
     */
    public CompletableFuture<StartNewPipelineResponse> startNewPipelineAsync(StartNewPipelineRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPipelineMeta.startNewPipeline);
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
     * @return CompletableFuture<StopPipelineNewResponse>
     */
    public CompletableFuture<StopPipelineNewResponse> stopPipelineNewAsync(StopPipelineNewRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPipelineMeta.stopPipelineNew);
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
     * @return CompletableFuture<StopPipelineRunResponse>
     */
    public CompletableFuture<StopPipelineRunResponse> stopPipelineRunAsync(StopPipelineRunRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPipelineMeta.stopPipelineRun);
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
            CloudPipelineMeta.stopPipelineRun, hcClient);
    }

}

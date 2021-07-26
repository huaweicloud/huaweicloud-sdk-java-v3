package com.huaweicloud.sdk.codecheck.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.codecheck.v2.model.*;

public class CodeCheckAsyncClient {
    protected HcClient hcClient;

    public CodeCheckAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CodeCheckAsyncClient> newBuilder() {
        return new ClientBuilder<>(CodeCheckAsyncClient::new);
    }


    /**
     * 记录事件发生次数与服务质量
     * 记录用户在前端使用的行为
     *
     * @param CollectPluginRecordRequest 请求对象
     * @return CompletableFuture<CollectPluginRecordResponse>
     */
    public CompletableFuture<CollectPluginRecordResponse> collectPluginRecordAsync(CollectPluginRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.collectPluginRecord);
    }

    /**
     * 记录事件发生次数与服务质量
     * 记录用户在前端使用的行为
     *
     * @param CollectPluginRecordRequest 请求对象
     * @return AsyncInvoker<CollectPluginRecordRequest, CollectPluginRecordResponse>
     */
    public AsyncInvoker<CollectPluginRecordRequest, CollectPluginRecordResponse> collectPluginRecordAsyncInvoker(CollectPluginRecordRequest request) {
        return new AsyncInvoker<CollectPluginRecordRequest, CollectPluginRecordResponse>(request, CodeCheckMeta.collectPluginRecord, hcClient);
    }

    /**
     * 新建检查任务
     * 新建检查任务但是不执行。
     *
     * @param CreateTaskRequest 请求对象
     * @return CompletableFuture<CreateTaskResponse>
     */
    public CompletableFuture<CreateTaskResponse> createTaskAsync(CreateTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.createTask);
    }

    /**
     * 新建检查任务
     * 新建检查任务但是不执行。
     *
     * @param CreateTaskRequest 请求对象
     * @return AsyncInvoker<CreateTaskRequest, CreateTaskResponse>
     */
    public AsyncInvoker<CreateTaskRequest, CreateTaskResponse> createTaskAsyncInvoker(CreateTaskRequest request) {
        return new AsyncInvoker<CreateTaskRequest, CreateTaskResponse>(request, CodeCheckMeta.createTask, hcClient);
    }

    /**
     * 获取一个三方库的中所有代码的详细信息
     * 获取指定库的详细内部信息，包括类、方法字段等。
     *
     * @param DownloadLibCodeAnalysisReportRequest 请求对象
     * @return CompletableFuture<DownloadLibCodeAnalysisReportResponse>
     */
    public CompletableFuture<DownloadLibCodeAnalysisReportResponse> downloadLibCodeAnalysisReportAsync(DownloadLibCodeAnalysisReportRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.downloadLibCodeAnalysisReport);
    }

    /**
     * 获取一个三方库的中所有代码的详细信息
     * 获取指定库的详细内部信息，包括类、方法字段等。
     *
     * @param DownloadLibCodeAnalysisReportRequest 请求对象
     * @return AsyncInvoker<DownloadLibCodeAnalysisReportRequest, DownloadLibCodeAnalysisReportResponse>
     */
    public AsyncInvoker<DownloadLibCodeAnalysisReportRequest, DownloadLibCodeAnalysisReportResponse> downloadLibCodeAnalysisReportAsyncInvoker(DownloadLibCodeAnalysisReportRequest request) {
        return new AsyncInvoker<DownloadLibCodeAnalysisReportRequest, DownloadLibCodeAnalysisReportResponse>(request, CodeCheckMeta.downloadLibCodeAnalysisReport, hcClient);
    }

    /**
     * 获取依赖列表里所有java库的信息，主要是漏洞信息
     * 对依赖列表进行扫描，返回其中包含的漏洞库，和对应的升级替换建议
     *
     * @param ListJavaLibUpdateSuggestionRequest 请求对象
     * @return CompletableFuture<ListJavaLibUpdateSuggestionResponse>
     */
    public CompletableFuture<ListJavaLibUpdateSuggestionResponse> listJavaLibUpdateSuggestionAsync(ListJavaLibUpdateSuggestionRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.listJavaLibUpdateSuggestion);
    }

    /**
     * 获取依赖列表里所有java库的信息，主要是漏洞信息
     * 对依赖列表进行扫描，返回其中包含的漏洞库，和对应的升级替换建议
     *
     * @param ListJavaLibUpdateSuggestionRequest 请求对象
     * @return AsyncInvoker<ListJavaLibUpdateSuggestionRequest, ListJavaLibUpdateSuggestionResponse>
     */
    public AsyncInvoker<ListJavaLibUpdateSuggestionRequest, ListJavaLibUpdateSuggestionResponse> listJavaLibUpdateSuggestionAsyncInvoker(ListJavaLibUpdateSuggestionRequest request) {
        return new AsyncInvoker<ListJavaLibUpdateSuggestionRequest, ListJavaLibUpdateSuggestionResponse>(request, CodeCheckMeta.listJavaLibUpdateSuggestion, hcClient);
    }

    /**
     * 执行检查任务
     * 执行检查任务。
     *
     * @param RunTaskRequest 请求对象
     * @return CompletableFuture<RunTaskResponse>
     */
    public CompletableFuture<RunTaskResponse> runTaskAsync(RunTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.runTask);
    }

    /**
     * 执行检查任务
     * 执行检查任务。
     *
     * @param RunTaskRequest 请求对象
     * @return AsyncInvoker<RunTaskRequest, RunTaskResponse>
     */
    public AsyncInvoker<RunTaskRequest, RunTaskResponse> runTaskAsyncInvoker(RunTaskRequest request) {
        return new AsyncInvoker<RunTaskRequest, RunTaskResponse>(request, CodeCheckMeta.runTask, hcClient);
    }

    /**
     * 查询任务执行状态
     * 根据任务ID查询任务执行状态。任务状态：0表示检查中，1表示检查失败，2表示检查成功，3表示任务中止。只有正在检查中才有进度的详细信息。
     *
     * @param ShowProgressDetailRequest 请求对象
     * @return CompletableFuture<ShowProgressDetailResponse>
     */
    public CompletableFuture<ShowProgressDetailResponse> showProgressDetailAsync(ShowProgressDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.showProgressDetail);
    }

    /**
     * 查询任务执行状态
     * 根据任务ID查询任务执行状态。任务状态：0表示检查中，1表示检查失败，2表示检查成功，3表示任务中止。只有正在检查中才有进度的详细信息。
     *
     * @param ShowProgressDetailRequest 请求对象
     * @return AsyncInvoker<ShowProgressDetailRequest, ShowProgressDetailResponse>
     */
    public AsyncInvoker<ShowProgressDetailRequest, ShowProgressDetailResponse> showProgressDetailAsyncInvoker(ShowProgressDetailRequest request) {
        return new AsyncInvoker<ShowProgressDetailRequest, ShowProgressDetailResponse>(request, CodeCheckMeta.showProgressDetail, hcClient);
    }

    /**
     * 查询缺陷详情
     * 根据检查任务ID分页查询缺陷结果详情。
     *
     * @param ShowTaskDefectsRequest 请求对象
     * @return CompletableFuture<ShowTaskDefectsResponse>
     */
    public CompletableFuture<ShowTaskDefectsResponse> showTaskDefectsAsync(ShowTaskDefectsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.showTaskDefects);
    }

    /**
     * 查询缺陷详情
     * 根据检查任务ID分页查询缺陷结果详情。
     *
     * @param ShowTaskDefectsRequest 请求对象
     * @return AsyncInvoker<ShowTaskDefectsRequest, ShowTaskDefectsResponse>
     */
    public AsyncInvoker<ShowTaskDefectsRequest, ShowTaskDefectsResponse> showTaskDefectsAsyncInvoker(ShowTaskDefectsRequest request) {
        return new AsyncInvoker<ShowTaskDefectsRequest, ShowTaskDefectsResponse>(request, CodeCheckMeta.showTaskDefects, hcClient);
    }

    /**
     * 查询缺陷详情的统计
     * 根据检查任务ID查询缺陷详情的统计
     *
     * @param ShowTaskDefectsStatisticRequest 请求对象
     * @return CompletableFuture<ShowTaskDefectsStatisticResponse>
     */
    public CompletableFuture<ShowTaskDefectsStatisticResponse> showTaskDefectsStatisticAsync(ShowTaskDefectsStatisticRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.showTaskDefectsStatistic);
    }

    /**
     * 查询缺陷详情的统计
     * 根据检查任务ID查询缺陷详情的统计
     *
     * @param ShowTaskDefectsStatisticRequest 请求对象
     * @return AsyncInvoker<ShowTaskDefectsStatisticRequest, ShowTaskDefectsStatisticResponse>
     */
    public AsyncInvoker<ShowTaskDefectsStatisticRequest, ShowTaskDefectsStatisticResponse> showTaskDefectsStatisticAsyncInvoker(ShowTaskDefectsStatisticRequest request) {
        return new AsyncInvoker<ShowTaskDefectsStatisticRequest, ShowTaskDefectsStatisticResponse>(request, CodeCheckMeta.showTaskDefectsStatistic, hcClient);
    }

    /**
     * 查询缺陷概要
     * 根据检查任务ID查询缺陷结果的概要。包括问题概述、问题状态、圈复杂度、代码重复率等。
     *
     * @param ShowTaskDetailRequest 请求对象
     * @return CompletableFuture<ShowTaskDetailResponse>
     */
    public CompletableFuture<ShowTaskDetailResponse> showTaskDetailAsync(ShowTaskDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.showTaskDetail);
    }

    /**
     * 查询缺陷概要
     * 根据检查任务ID查询缺陷结果的概要。包括问题概述、问题状态、圈复杂度、代码重复率等。
     *
     * @param ShowTaskDetailRequest 请求对象
     * @return AsyncInvoker<ShowTaskDetailRequest, ShowTaskDetailResponse>
     */
    public AsyncInvoker<ShowTaskDetailRequest, ShowTaskDetailResponse> showTaskDetailAsyncInvoker(ShowTaskDetailRequest request) {
        return new AsyncInvoker<ShowTaskDetailRequest, ShowTaskDetailResponse>(request, CodeCheckMeta.showTaskDetail, hcClient);
    }

    /**
     * 查询任务列表
     * 根据DEVCLOUD_PROJECT_UUID查询该项目下的任务列表。
     *
     * @param ShowTaskListByProjectIdRequest 请求对象
     * @return CompletableFuture<ShowTaskListByProjectIdResponse>
     */
    public CompletableFuture<ShowTaskListByProjectIdResponse> showTaskListByProjectIdAsync(ShowTaskListByProjectIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.showTaskListByProjectId);
    }

    /**
     * 查询任务列表
     * 根据DEVCLOUD_PROJECT_UUID查询该项目下的任务列表。
     *
     * @param ShowTaskListByProjectIdRequest 请求对象
     * @return AsyncInvoker<ShowTaskListByProjectIdRequest, ShowTaskListByProjectIdResponse>
     */
    public AsyncInvoker<ShowTaskListByProjectIdRequest, ShowTaskListByProjectIdResponse> showTaskListByProjectIdAsyncInvoker(ShowTaskListByProjectIdRequest request) {
        return new AsyncInvoker<ShowTaskListByProjectIdRequest, ShowTaskListByProjectIdResponse>(request, CodeCheckMeta.showTaskListByProjectId, hcClient);
    }

    /**
     * 终止检查任务
     * 根据任务ID终止检查任务。
     *
     * @param StopTaskByIdRequest 请求对象
     * @return CompletableFuture<StopTaskByIdResponse>
     */
    public CompletableFuture<StopTaskByIdResponse> stopTaskByIdAsync(StopTaskByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.stopTaskById);
    }

    /**
     * 终止检查任务
     * 根据任务ID终止检查任务。
     *
     * @param StopTaskByIdRequest 请求对象
     * @return AsyncInvoker<StopTaskByIdRequest, StopTaskByIdResponse>
     */
    public AsyncInvoker<StopTaskByIdRequest, StopTaskByIdResponse> stopTaskByIdAsyncInvoker(StopTaskByIdRequest request) {
        return new AsyncInvoker<StopTaskByIdRequest, StopTaskByIdResponse>(request, CodeCheckMeta.stopTaskById, hcClient);
    }

    /**
     * 修改缺陷状态
     * 修改检查出的缺陷的状态为已解决、已忽略
     *
     * @param UpdateDefectStatusRequest 请求对象
     * @return CompletableFuture<UpdateDefectStatusResponse>
     */
    public CompletableFuture<UpdateDefectStatusResponse> updateDefectStatusAsync(UpdateDefectStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.updateDefectStatus);
    }

    /**
     * 修改缺陷状态
     * 修改检查出的缺陷的状态为已解决、已忽略
     *
     * @param UpdateDefectStatusRequest 请求对象
     * @return AsyncInvoker<UpdateDefectStatusRequest, UpdateDefectStatusResponse>
     */
    public AsyncInvoker<UpdateDefectStatusRequest, UpdateDefectStatusResponse> updateDefectStatusAsyncInvoker(UpdateDefectStatusRequest request) {
        return new AsyncInvoker<UpdateDefectStatusRequest, UpdateDefectStatusResponse>(request, CodeCheckMeta.updateDefectStatus, hcClient);
    }

}
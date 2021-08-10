package com.huaweicloud.sdk.codecheck.v2;

import com.huaweicloud.sdk.codecheck.v2.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CodeCheckClient {

    protected HcClient hcClient;

    public CodeCheckClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CodeCheckClient> newBuilder() {
        return new ClientBuilder<>(CodeCheckClient::new);
    }

    /** 记录事件发生次数与服务质量 记录用户在前端使用的行为
     *
     * @param CollectPluginRecordRequest 请求对象
     * @return CollectPluginRecordResponse */
    public CollectPluginRecordResponse collectPluginRecord(CollectPluginRecordRequest request) {
        return hcClient.syncInvokeHttp(request, CodeCheckMeta.collectPluginRecord);
    }

    /** 记录事件发生次数与服务质量 记录用户在前端使用的行为
     *
     * @param CollectPluginRecordRequest 请求对象
     * @return SyncInvoker<CollectPluginRecordRequest, CollectPluginRecordResponse> */
    public SyncInvoker<CollectPluginRecordRequest, CollectPluginRecordResponse> collectPluginRecordInvoker(
        CollectPluginRecordRequest request) {
        return new SyncInvoker<CollectPluginRecordRequest, CollectPluginRecordResponse>(request,
            CodeCheckMeta.collectPluginRecord, hcClient);
    }

    /** 新建检查任务 新建检查任务但是不执行。
     *
     * @param CreateTaskRequest 请求对象
     * @return CreateTaskResponse */
    public CreateTaskResponse createTask(CreateTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CodeCheckMeta.createTask);
    }

    /** 新建检查任务 新建检查任务但是不执行。
     *
     * @param CreateTaskRequest 请求对象
     * @return SyncInvoker<CreateTaskRequest, CreateTaskResponse> */
    public SyncInvoker<CreateTaskRequest, CreateTaskResponse> createTaskInvoker(CreateTaskRequest request) {
        return new SyncInvoker<CreateTaskRequest, CreateTaskResponse>(request, CodeCheckMeta.createTask, hcClient);
    }

    /** 获取一个三方库的中所有代码的详细信息 获取指定库的详细内部信息，包括类、方法字段等。
     *
     * @param DownloadLibCodeAnalysisReportRequest 请求对象
     * @return DownloadLibCodeAnalysisReportResponse */
    public DownloadLibCodeAnalysisReportResponse downloadLibCodeAnalysisReport(
        DownloadLibCodeAnalysisReportRequest request) {
        return hcClient.syncInvokeHttp(request, CodeCheckMeta.downloadLibCodeAnalysisReport);
    }

    /** 获取一个三方库的中所有代码的详细信息 获取指定库的详细内部信息，包括类、方法字段等。
     *
     * @param DownloadLibCodeAnalysisReportRequest 请求对象
     * @return SyncInvoker<DownloadLibCodeAnalysisReportRequest, DownloadLibCodeAnalysisReportResponse> */
    public SyncInvoker<DownloadLibCodeAnalysisReportRequest, DownloadLibCodeAnalysisReportResponse> downloadLibCodeAnalysisReportInvoker(
        DownloadLibCodeAnalysisReportRequest request) {
        return new SyncInvoker<DownloadLibCodeAnalysisReportRequest, DownloadLibCodeAnalysisReportResponse>(request,
            CodeCheckMeta.downloadLibCodeAnalysisReport, hcClient);
    }

    /** 获取依赖列表里所有java库的信息，主要是漏洞信息 对依赖列表进行扫描，返回其中包含的漏洞库，和对应的升级替换建议
     *
     * @param ListJavaLibUpdateSuggestionRequest 请求对象
     * @return ListJavaLibUpdateSuggestionResponse */
    public ListJavaLibUpdateSuggestionResponse listJavaLibUpdateSuggestion(ListJavaLibUpdateSuggestionRequest request) {
        return hcClient.syncInvokeHttp(request, CodeCheckMeta.listJavaLibUpdateSuggestion);
    }

    /** 获取依赖列表里所有java库的信息，主要是漏洞信息 对依赖列表进行扫描，返回其中包含的漏洞库，和对应的升级替换建议
     *
     * @param ListJavaLibUpdateSuggestionRequest 请求对象
     * @return SyncInvoker<ListJavaLibUpdateSuggestionRequest, ListJavaLibUpdateSuggestionResponse> */
    public SyncInvoker<ListJavaLibUpdateSuggestionRequest, ListJavaLibUpdateSuggestionResponse> listJavaLibUpdateSuggestionInvoker(
        ListJavaLibUpdateSuggestionRequest request) {
        return new SyncInvoker<ListJavaLibUpdateSuggestionRequest, ListJavaLibUpdateSuggestionResponse>(request,
            CodeCheckMeta.listJavaLibUpdateSuggestion, hcClient);
    }

    /** 执行检查任务 执行检查任务。
     *
     * @param RunTaskRequest 请求对象
     * @return RunTaskResponse */
    public RunTaskResponse runTask(RunTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CodeCheckMeta.runTask);
    }

    /** 执行检查任务 执行检查任务。
     *
     * @param RunTaskRequest 请求对象
     * @return SyncInvoker<RunTaskRequest, RunTaskResponse> */
    public SyncInvoker<RunTaskRequest, RunTaskResponse> runTaskInvoker(RunTaskRequest request) {
        return new SyncInvoker<RunTaskRequest, RunTaskResponse>(request, CodeCheckMeta.runTask, hcClient);
    }

    /** 查询任务执行状态 根据任务ID查询任务执行状态。任务状态：0表示检查中，1表示检查失败，2表示检查成功，3表示任务中止。只有正在检查中才有进度的详细信息。
     *
     * @param ShowProgressDetailRequest 请求对象
     * @return ShowProgressDetailResponse */
    public ShowProgressDetailResponse showProgressDetail(ShowProgressDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CodeCheckMeta.showProgressDetail);
    }

    /** 查询任务执行状态 根据任务ID查询任务执行状态。任务状态：0表示检查中，1表示检查失败，2表示检查成功，3表示任务中止。只有正在检查中才有进度的详细信息。
     *
     * @param ShowProgressDetailRequest 请求对象
     * @return SyncInvoker<ShowProgressDetailRequest, ShowProgressDetailResponse> */
    public SyncInvoker<ShowProgressDetailRequest, ShowProgressDetailResponse> showProgressDetailInvoker(
        ShowProgressDetailRequest request) {
        return new SyncInvoker<ShowProgressDetailRequest, ShowProgressDetailResponse>(request,
            CodeCheckMeta.showProgressDetail, hcClient);
    }

    /** 查询缺陷详情 根据检查任务ID分页查询缺陷结果详情。
     *
     * @param ShowTaskDefectsRequest 请求对象
     * @return ShowTaskDefectsResponse */
    public ShowTaskDefectsResponse showTaskDefects(ShowTaskDefectsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeCheckMeta.showTaskDefects);
    }

    /** 查询缺陷详情 根据检查任务ID分页查询缺陷结果详情。
     *
     * @param ShowTaskDefectsRequest 请求对象
     * @return SyncInvoker<ShowTaskDefectsRequest, ShowTaskDefectsResponse> */
    public SyncInvoker<ShowTaskDefectsRequest, ShowTaskDefectsResponse> showTaskDefectsInvoker(
        ShowTaskDefectsRequest request) {
        return new SyncInvoker<ShowTaskDefectsRequest, ShowTaskDefectsResponse>(request, CodeCheckMeta.showTaskDefects,
            hcClient);
    }

    /** 查询缺陷详情的统计 根据检查任务ID查询缺陷详情的统计
     *
     * @param ShowTaskDefectsStatisticRequest 请求对象
     * @return ShowTaskDefectsStatisticResponse */
    public ShowTaskDefectsStatisticResponse showTaskDefectsStatistic(ShowTaskDefectsStatisticRequest request) {
        return hcClient.syncInvokeHttp(request, CodeCheckMeta.showTaskDefectsStatistic);
    }

    /** 查询缺陷详情的统计 根据检查任务ID查询缺陷详情的统计
     *
     * @param ShowTaskDefectsStatisticRequest 请求对象
     * @return SyncInvoker<ShowTaskDefectsStatisticRequest, ShowTaskDefectsStatisticResponse> */
    public SyncInvoker<ShowTaskDefectsStatisticRequest, ShowTaskDefectsStatisticResponse> showTaskDefectsStatisticInvoker(
        ShowTaskDefectsStatisticRequest request) {
        return new SyncInvoker<ShowTaskDefectsStatisticRequest, ShowTaskDefectsStatisticResponse>(request,
            CodeCheckMeta.showTaskDefectsStatistic, hcClient);
    }

    /** 查询缺陷概要 根据检查任务ID查询缺陷结果的概要。包括问题概述、问题状态、圈复杂度、代码重复率等。
     *
     * @param ShowTaskDetailRequest 请求对象
     * @return ShowTaskDetailResponse */
    public ShowTaskDetailResponse showTaskDetail(ShowTaskDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CodeCheckMeta.showTaskDetail);
    }

    /** 查询缺陷概要 根据检查任务ID查询缺陷结果的概要。包括问题概述、问题状态、圈复杂度、代码重复率等。
     *
     * @param ShowTaskDetailRequest 请求对象
     * @return SyncInvoker<ShowTaskDetailRequest, ShowTaskDetailResponse> */
    public SyncInvoker<ShowTaskDetailRequest, ShowTaskDetailResponse> showTaskDetailInvoker(
        ShowTaskDetailRequest request) {
        return new SyncInvoker<ShowTaskDetailRequest, ShowTaskDetailResponse>(request, CodeCheckMeta.showTaskDetail,
            hcClient);
    }

    /** 查询任务列表 根据DEVCLOUD_PROJECT_UUID查询该项目下的任务列表。
     *
     * @param ShowTaskListByProjectIdRequest 请求对象
     * @return ShowTaskListByProjectIdResponse */
    public ShowTaskListByProjectIdResponse showTaskListByProjectId(ShowTaskListByProjectIdRequest request) {
        return hcClient.syncInvokeHttp(request, CodeCheckMeta.showTaskListByProjectId);
    }

    /** 查询任务列表 根据DEVCLOUD_PROJECT_UUID查询该项目下的任务列表。
     *
     * @param ShowTaskListByProjectIdRequest 请求对象
     * @return SyncInvoker<ShowTaskListByProjectIdRequest, ShowTaskListByProjectIdResponse> */
    public SyncInvoker<ShowTaskListByProjectIdRequest, ShowTaskListByProjectIdResponse> showTaskListByProjectIdInvoker(
        ShowTaskListByProjectIdRequest request) {
        return new SyncInvoker<ShowTaskListByProjectIdRequest, ShowTaskListByProjectIdResponse>(request,
            CodeCheckMeta.showTaskListByProjectId, hcClient);
    }

    /** 终止检查任务 根据任务ID终止检查任务。
     *
     * @param StopTaskByIdRequest 请求对象
     * @return StopTaskByIdResponse */
    public StopTaskByIdResponse stopTaskById(StopTaskByIdRequest request) {
        return hcClient.syncInvokeHttp(request, CodeCheckMeta.stopTaskById);
    }

    /** 终止检查任务 根据任务ID终止检查任务。
     *
     * @param StopTaskByIdRequest 请求对象
     * @return SyncInvoker<StopTaskByIdRequest, StopTaskByIdResponse> */
    public SyncInvoker<StopTaskByIdRequest, StopTaskByIdResponse> stopTaskByIdInvoker(StopTaskByIdRequest request) {
        return new SyncInvoker<StopTaskByIdRequest, StopTaskByIdResponse>(request, CodeCheckMeta.stopTaskById,
            hcClient);
    }

    /** 修改缺陷状态 修改检查出的缺陷的状态为已解决、已忽略
     *
     * @param UpdateDefectStatusRequest 请求对象
     * @return UpdateDefectStatusResponse */
    public UpdateDefectStatusResponse updateDefectStatus(UpdateDefectStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CodeCheckMeta.updateDefectStatus);
    }

    /** 修改缺陷状态 修改检查出的缺陷的状态为已解决、已忽略
     *
     * @param UpdateDefectStatusRequest 请求对象
     * @return SyncInvoker<UpdateDefectStatusRequest, UpdateDefectStatusResponse> */
    public SyncInvoker<UpdateDefectStatusRequest, UpdateDefectStatusResponse> updateDefectStatusInvoker(
        UpdateDefectStatusRequest request) {
        return new SyncInvoker<UpdateDefectStatusRequest, UpdateDefectStatusResponse>(request,
            CodeCheckMeta.updateDefectStatus, hcClient);
    }

}

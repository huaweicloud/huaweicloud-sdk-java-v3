package com.huaweicloud.sdk.codecheck.v2;

import com.huaweicloud.sdk.codecheck.v2.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CodeCheckAsyncClient {

    protected HcClient hcClient;

    public CodeCheckAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CodeCheckAsyncClient> newBuilder() {
        return new ClientBuilder<>(CodeCheckAsyncClient::new);
    }

    /** 创建自定义规则集 可根据需求灵活的组合规则。
     *
     * @param CreateRulesetRequest 请求对象
     * @return CompletableFuture<CreateRulesetResponse> */
    public CompletableFuture<CreateRulesetResponse> createRulesetAsync(CreateRulesetRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.createRuleset);
    }

    /** 创建自定义规则集 可根据需求灵活的组合规则。
     *
     * @param CreateRulesetRequest 请求对象
     * @return AsyncInvoker<CreateRulesetRequest, CreateRulesetResponse> */
    public AsyncInvoker<CreateRulesetRequest, CreateRulesetResponse> createRulesetAsyncInvoker(
        CreateRulesetRequest request) {
        return new AsyncInvoker<CreateRulesetRequest, CreateRulesetResponse>(request, CodeCheckMeta.createRuleset,
            hcClient);
    }

    /** 新建检查任务 新建检查任务但是不执行。
     *
     * @param CreateTaskRequest 请求对象
     * @return CompletableFuture<CreateTaskResponse> */
    public CompletableFuture<CreateTaskResponse> createTaskAsync(CreateTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.createTask);
    }

    /** 新建检查任务 新建检查任务但是不执行。
     *
     * @param CreateTaskRequest 请求对象
     * @return AsyncInvoker<CreateTaskRequest, CreateTaskResponse> */
    public AsyncInvoker<CreateTaskRequest, CreateTaskResponse> createTaskAsyncInvoker(CreateTaskRequest request) {
        return new AsyncInvoker<CreateTaskRequest, CreateTaskResponse>(request, CodeCheckMeta.createTask, hcClient);
    }

    /** 删除检查任务 删除检查任务，执行中的任务删除无法再查看
     *
     * @param DeleteTaskRequest 请求对象
     * @return CompletableFuture<DeleteTaskResponse> */
    public CompletableFuture<DeleteTaskResponse> deleteTaskAsync(DeleteTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.deleteTask);
    }

    /** 删除检查任务 删除检查任务，执行中的任务删除无法再查看
     *
     * @param DeleteTaskRequest 请求对象
     * @return AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse> */
    public AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse> deleteTaskAsyncInvoker(DeleteTaskRequest request) {
        return new AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse>(request, CodeCheckMeta.deleteTask, hcClient);
    }

    /** 获取规则列表接口 根据语言、问题级别等条件查询规则列表。
     *
     * @param ListRulesRequest 请求对象
     * @return CompletableFuture<ListRulesResponse> */
    public CompletableFuture<ListRulesResponse> listRulesAsync(ListRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.listRules);
    }

    /** 获取规则列表接口 根据语言、问题级别等条件查询规则列表。
     *
     * @param ListRulesRequest 请求对象
     * @return AsyncInvoker<ListRulesRequest, ListRulesResponse> */
    public AsyncInvoker<ListRulesRequest, ListRulesResponse> listRulesAsyncInvoker(ListRulesRequest request) {
        return new AsyncInvoker<ListRulesRequest, ListRulesResponse>(request, CodeCheckMeta.listRules, hcClient);
    }

    /** 查询规则集列表 根据项目ID、语言等条件查询规则集列表。
     *
     * @param ListRulesetsRequest 请求对象
     * @return CompletableFuture<ListRulesetsResponse> */
    public CompletableFuture<ListRulesetsResponse> listRulesetsAsync(ListRulesetsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.listRulesets);
    }

    /** 查询规则集列表 根据项目ID、语言等条件查询规则集列表。
     *
     * @param ListRulesetsRequest 请求对象
     * @return AsyncInvoker<ListRulesetsRequest, ListRulesetsResponse> */
    public AsyncInvoker<ListRulesetsRequest, ListRulesetsResponse> listRulesetsAsyncInvoker(
        ListRulesetsRequest request) {
        return new AsyncInvoker<ListRulesetsRequest, ListRulesetsResponse>(request, CodeCheckMeta.listRulesets,
            hcClient);
    }

    /** 执行检查任务 执行检查任务。
     *
     * @param RunTaskRequest 请求对象
     * @return CompletableFuture<RunTaskResponse> */
    public CompletableFuture<RunTaskResponse> runTaskAsync(RunTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.runTask);
    }

    /** 执行检查任务 执行检查任务。
     *
     * @param RunTaskRequest 请求对象
     * @return AsyncInvoker<RunTaskRequest, RunTaskResponse> */
    public AsyncInvoker<RunTaskRequest, RunTaskResponse> runTaskAsyncInvoker(RunTaskRequest request) {
        return new AsyncInvoker<RunTaskRequest, RunTaskResponse>(request, CodeCheckMeta.runTask, hcClient);
    }

    /** 查询任务执行状态 根据任务ID查询任务执行状态。任务状态：0表示检查中，1表示检查失败，2表示检查成功，3表示任务中止。只有正在检查中才有进度的详细信息。
     *
     * @param ShowProgressDetailRequest 请求对象
     * @return CompletableFuture<ShowProgressDetailResponse> */
    public CompletableFuture<ShowProgressDetailResponse> showProgressDetailAsync(ShowProgressDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.showProgressDetail);
    }

    /** 查询任务执行状态 根据任务ID查询任务执行状态。任务状态：0表示检查中，1表示检查失败，2表示检查成功，3表示任务中止。只有正在检查中才有进度的详细信息。
     *
     * @param ShowProgressDetailRequest 请求对象
     * @return AsyncInvoker<ShowProgressDetailRequest, ShowProgressDetailResponse> */
    public AsyncInvoker<ShowProgressDetailRequest, ShowProgressDetailResponse> showProgressDetailAsyncInvoker(
        ShowProgressDetailRequest request) {
        return new AsyncInvoker<ShowProgressDetailRequest, ShowProgressDetailResponse>(request,
            CodeCheckMeta.showProgressDetail, hcClient);
    }

    /** 查询缺陷详情 根据检查任务ID分页查询缺陷结果详情。
     *
     * @param ShowTaskDefectsRequest 请求对象
     * @return CompletableFuture<ShowTaskDefectsResponse> */
    public CompletableFuture<ShowTaskDefectsResponse> showTaskDefectsAsync(ShowTaskDefectsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.showTaskDefects);
    }

    /** 查询缺陷详情 根据检查任务ID分页查询缺陷结果详情。
     *
     * @param ShowTaskDefectsRequest 请求对象
     * @return AsyncInvoker<ShowTaskDefectsRequest, ShowTaskDefectsResponse> */
    public AsyncInvoker<ShowTaskDefectsRequest, ShowTaskDefectsResponse> showTaskDefectsAsyncInvoker(
        ShowTaskDefectsRequest request) {
        return new AsyncInvoker<ShowTaskDefectsRequest, ShowTaskDefectsResponse>(request, CodeCheckMeta.showTaskDefects,
            hcClient);
    }

    /** 查询缺陷详情的统计 根据检查任务ID查询缺陷详情的统计
     *
     * @param ShowTaskDefectsStatisticRequest 请求对象
     * @return CompletableFuture<ShowTaskDefectsStatisticResponse> */
    public CompletableFuture<ShowTaskDefectsStatisticResponse> showTaskDefectsStatisticAsync(
        ShowTaskDefectsStatisticRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.showTaskDefectsStatistic);
    }

    /** 查询缺陷详情的统计 根据检查任务ID查询缺陷详情的统计
     *
     * @param ShowTaskDefectsStatisticRequest 请求对象
     * @return AsyncInvoker<ShowTaskDefectsStatisticRequest, ShowTaskDefectsStatisticResponse> */
    public AsyncInvoker<ShowTaskDefectsStatisticRequest, ShowTaskDefectsStatisticResponse> showTaskDefectsStatisticAsyncInvoker(
        ShowTaskDefectsStatisticRequest request) {
        return new AsyncInvoker<ShowTaskDefectsStatisticRequest, ShowTaskDefectsStatisticResponse>(request,
            CodeCheckMeta.showTaskDefectsStatistic, hcClient);
    }

    /** 查询缺陷概要 根据检查任务ID查询缺陷结果的概要。包括问题概述、问题状态、圈复杂度、代码重复率等。
     *
     * @param ShowTaskDetailRequest 请求对象
     * @return CompletableFuture<ShowTaskDetailResponse> */
    public CompletableFuture<ShowTaskDetailResponse> showTaskDetailAsync(ShowTaskDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.showTaskDetail);
    }

    /** 查询缺陷概要 根据检查任务ID查询缺陷结果的概要。包括问题概述、问题状态、圈复杂度、代码重复率等。
     *
     * @param ShowTaskDetailRequest 请求对象
     * @return AsyncInvoker<ShowTaskDetailRequest, ShowTaskDetailResponse> */
    public AsyncInvoker<ShowTaskDetailRequest, ShowTaskDetailResponse> showTaskDetailAsyncInvoker(
        ShowTaskDetailRequest request) {
        return new AsyncInvoker<ShowTaskDetailRequest, ShowTaskDetailResponse>(request, CodeCheckMeta.showTaskDetail,
            hcClient);
    }

    /** 查询任务列表 根据DEVCLOUD_PROJECT_UUID查询该项目下的任务列表。
     *
     * @param ShowTaskListByProjectIdRequest 请求对象
     * @return CompletableFuture<ShowTaskListByProjectIdResponse> */
    public CompletableFuture<ShowTaskListByProjectIdResponse> showTaskListByProjectIdAsync(
        ShowTaskListByProjectIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.showTaskListByProjectId);
    }

    /** 查询任务列表 根据DEVCLOUD_PROJECT_UUID查询该项目下的任务列表。
     *
     * @param ShowTaskListByProjectIdRequest 请求对象
     * @return AsyncInvoker<ShowTaskListByProjectIdRequest, ShowTaskListByProjectIdResponse> */
    public AsyncInvoker<ShowTaskListByProjectIdRequest, ShowTaskListByProjectIdResponse> showTaskListByProjectIdAsyncInvoker(
        ShowTaskListByProjectIdRequest request) {
        return new AsyncInvoker<ShowTaskListByProjectIdRequest, ShowTaskListByProjectIdResponse>(request,
            CodeCheckMeta.showTaskListByProjectId, hcClient);
    }

    /** 终止检查任务 根据任务ID终止检查任务。
     *
     * @param StopTaskByIdRequest 请求对象
     * @return CompletableFuture<StopTaskByIdResponse> */
    public CompletableFuture<StopTaskByIdResponse> stopTaskByIdAsync(StopTaskByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.stopTaskById);
    }

    /** 终止检查任务 根据任务ID终止检查任务。
     *
     * @param StopTaskByIdRequest 请求对象
     * @return AsyncInvoker<StopTaskByIdRequest, StopTaskByIdResponse> */
    public AsyncInvoker<StopTaskByIdRequest, StopTaskByIdResponse> stopTaskByIdAsyncInvoker(
        StopTaskByIdRequest request) {
        return new AsyncInvoker<StopTaskByIdRequest, StopTaskByIdResponse>(request, CodeCheckMeta.stopTaskById,
            hcClient);
    }

    /** 修改缺陷状态 修改检查出的缺陷的状态为已解决、已忽略
     *
     * @param UpdateDefectStatusRequest 请求对象
     * @return CompletableFuture<UpdateDefectStatusResponse> */
    public CompletableFuture<UpdateDefectStatusResponse> updateDefectStatusAsync(UpdateDefectStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.updateDefectStatus);
    }

    /** 修改缺陷状态 修改检查出的缺陷的状态为已解决、已忽略
     *
     * @param UpdateDefectStatusRequest 请求对象
     * @return AsyncInvoker<UpdateDefectStatusRequest, UpdateDefectStatusResponse> */
    public AsyncInvoker<UpdateDefectStatusRequest, UpdateDefectStatusResponse> updateDefectStatusAsyncInvoker(
        UpdateDefectStatusRequest request) {
        return new AsyncInvoker<UpdateDefectStatusRequest, UpdateDefectStatusResponse>(request,
            CodeCheckMeta.updateDefectStatus, hcClient);
    }

    /** 修改任务规则集 修改任务规则集。
     *
     * @param UpdateTaskRulesetRequest 请求对象
     * @return CompletableFuture<UpdateTaskRulesetResponse> */
    public CompletableFuture<UpdateTaskRulesetResponse> updateTaskRulesetAsync(UpdateTaskRulesetRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.updateTaskRuleset);
    }

    /** 修改任务规则集 修改任务规则集。
     *
     * @param UpdateTaskRulesetRequest 请求对象
     * @return AsyncInvoker<UpdateTaskRulesetRequest, UpdateTaskRulesetResponse> */
    public AsyncInvoker<UpdateTaskRulesetRequest, UpdateTaskRulesetResponse> updateTaskRulesetAsyncInvoker(
        UpdateTaskRulesetRequest request) {
        return new AsyncInvoker<UpdateTaskRulesetRequest, UpdateTaskRulesetResponse>(request,
            CodeCheckMeta.updateTaskRuleset, hcClient);
    }

}

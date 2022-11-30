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

    /**
     * 查询任务规则集的检查参数
     *
     * 查询任务规则集的检查参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckParametersRequest 请求对象
     * @return CompletableFuture<CheckParametersResponse>
     */
    public CompletableFuture<CheckParametersResponse> checkParametersAsync(CheckParametersRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.checkParameters);
    }

    /**
     * 查询任务规则集的检查参数
     *
     * 查询任务规则集的检查参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckParametersRequest 请求对象
     * @return AsyncInvoker<CheckParametersRequest, CheckParametersResponse>
     */
    public AsyncInvoker<CheckParametersRequest, CheckParametersResponse> checkParametersAsyncInvoker(
        CheckParametersRequest request) {
        return new AsyncInvoker<CheckParametersRequest, CheckParametersResponse>(request, CodeCheckMeta.checkParameters,
            hcClient);
    }

    /**
     * 历史扫描结果查询
     *
     * 提供每次扫描的问题数量统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckRecordRequest 请求对象
     * @return CompletableFuture<CheckRecordResponse>
     */
    public CompletableFuture<CheckRecordResponse> checkRecordAsync(CheckRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.checkRecord);
    }

    /**
     * 历史扫描结果查询
     *
     * 提供每次扫描的问题数量统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckRecordRequest 请求对象
     * @return AsyncInvoker<CheckRecordRequest, CheckRecordResponse>
     */
    public AsyncInvoker<CheckRecordRequest, CheckRecordResponse> checkRecordAsyncInvoker(CheckRecordRequest request) {
        return new AsyncInvoker<CheckRecordRequest, CheckRecordResponse>(request, CodeCheckMeta.checkRecord, hcClient);
    }

    /**
     * 查询任务规则集的检查参数
     *
     * 查询任务规则集的检查参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckRulesetParametersRequest 请求对象
     * @return CompletableFuture<CheckRulesetParametersResponse>
     */
    public CompletableFuture<CheckRulesetParametersResponse> checkRulesetParametersAsync(
        CheckRulesetParametersRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.checkRulesetParameters);
    }

    /**
     * 查询任务规则集的检查参数
     *
     * 查询任务规则集的检查参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckRulesetParametersRequest 请求对象
     * @return AsyncInvoker<CheckRulesetParametersRequest, CheckRulesetParametersResponse>
     */
    public AsyncInvoker<CheckRulesetParametersRequest, CheckRulesetParametersResponse> checkRulesetParametersAsyncInvoker(
        CheckRulesetParametersRequest request) {
        return new AsyncInvoker<CheckRulesetParametersRequest, CheckRulesetParametersResponse>(request,
            CodeCheckMeta.checkRulesetParameters, hcClient);
    }

    /**
     * 创建自定义规则集
     *
     * 可根据需求灵活的组合规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRulesetRequest 请求对象
     * @return CompletableFuture<CreateRulesetResponse>
     */
    public CompletableFuture<CreateRulesetResponse> createRulesetAsync(CreateRulesetRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.createRuleset);
    }

    /**
     * 创建自定义规则集
     *
     * 可根据需求灵活的组合规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRulesetRequest 请求对象
     * @return AsyncInvoker<CreateRulesetRequest, CreateRulesetResponse>
     */
    public AsyncInvoker<CreateRulesetRequest, CreateRulesetResponse> createRulesetAsyncInvoker(
        CreateRulesetRequest request) {
        return new AsyncInvoker<CreateRulesetRequest, CreateRulesetResponse>(request, CodeCheckMeta.createRuleset,
            hcClient);
    }

    /**
     * 新建检查任务
     *
     * 新建检查任务但是不执行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTaskRequest 请求对象
     * @return CompletableFuture<CreateTaskResponse>
     */
    public CompletableFuture<CreateTaskResponse> createTaskAsync(CreateTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.createTask);
    }

    /**
     * 新建检查任务
     *
     * 新建检查任务但是不执行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTaskRequest 请求对象
     * @return AsyncInvoker<CreateTaskRequest, CreateTaskResponse>
     */
    public AsyncInvoker<CreateTaskRequest, CreateTaskResponse> createTaskAsyncInvoker(CreateTaskRequest request) {
        return new AsyncInvoker<CreateTaskRequest, CreateTaskResponse>(request, CodeCheckMeta.createTask, hcClient);
    }

    /**
     * 删除自定义规则集
     *
     * 删除自定义规则集，正在使用中的或默认规则集不能删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRulesetRequest 请求对象
     * @return CompletableFuture<DeleteRulesetResponse>
     */
    public CompletableFuture<DeleteRulesetResponse> deleteRulesetAsync(DeleteRulesetRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.deleteRuleset);
    }

    /**
     * 删除自定义规则集
     *
     * 删除自定义规则集，正在使用中的或默认规则集不能删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRulesetRequest 请求对象
     * @return AsyncInvoker<DeleteRulesetRequest, DeleteRulesetResponse>
     */
    public AsyncInvoker<DeleteRulesetRequest, DeleteRulesetResponse> deleteRulesetAsyncInvoker(
        DeleteRulesetRequest request) {
        return new AsyncInvoker<DeleteRulesetRequest, DeleteRulesetResponse>(request, CodeCheckMeta.deleteRuleset,
            hcClient);
    }

    /**
     * 删除检查任务
     *
     * 删除检查任务，执行中的任务删除无法再查看
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTaskRequest 请求对象
     * @return CompletableFuture<DeleteTaskResponse>
     */
    public CompletableFuture<DeleteTaskResponse> deleteTaskAsync(DeleteTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.deleteTask);
    }

    /**
     * 删除检查任务
     *
     * 删除检查任务，执行中的任务删除无法再查看
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTaskRequest 请求对象
     * @return AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse>
     */
    public AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse> deleteTaskAsyncInvoker(DeleteTaskRequest request) {
        return new AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse>(request, CodeCheckMeta.deleteTask, hcClient);
    }

    /**
     * 获取规则列表接口
     *
     * 根据语言、问题级别等条件查询规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRulesRequest 请求对象
     * @return CompletableFuture<ListRulesResponse>
     */
    public CompletableFuture<ListRulesResponse> listRulesAsync(ListRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.listRules);
    }

    /**
     * 获取规则列表接口
     *
     * 根据语言、问题级别等条件查询规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRulesRequest 请求对象
     * @return AsyncInvoker<ListRulesRequest, ListRulesResponse>
     */
    public AsyncInvoker<ListRulesRequest, ListRulesResponse> listRulesAsyncInvoker(ListRulesRequest request) {
        return new AsyncInvoker<ListRulesRequest, ListRulesResponse>(request, CodeCheckMeta.listRules, hcClient);
    }

    /**
     * 查询规则集列表
     *
     * 根据项目ID、语言等条件查询规则集列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRulesetsRequest 请求对象
     * @return CompletableFuture<ListRulesetsResponse>
     */
    public CompletableFuture<ListRulesetsResponse> listRulesetsAsync(ListRulesetsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.listRulesets);
    }

    /**
     * 查询规则集列表
     *
     * 根据项目ID、语言等条件查询规则集列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRulesetsRequest 请求对象
     * @return AsyncInvoker<ListRulesetsRequest, ListRulesetsResponse>
     */
    public AsyncInvoker<ListRulesetsRequest, ListRulesetsResponse> listRulesetsAsyncInvoker(
        ListRulesetsRequest request) {
        return new AsyncInvoker<ListRulesetsRequest, ListRulesetsResponse>(request, CodeCheckMeta.listRulesets,
            hcClient);
    }

    /**
     * 任务配置检查参数
     *
     * 任务配置检查参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTaskParameterRequest 请求对象
     * @return CompletableFuture<ListTaskParameterResponse>
     */
    public CompletableFuture<ListTaskParameterResponse> listTaskParameterAsync(ListTaskParameterRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.listTaskParameter);
    }

    /**
     * 任务配置检查参数
     *
     * 任务配置检查参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTaskParameterRequest 请求对象
     * @return AsyncInvoker<ListTaskParameterRequest, ListTaskParameterResponse>
     */
    public AsyncInvoker<ListTaskParameterRequest, ListTaskParameterResponse> listTaskParameterAsyncInvoker(
        ListTaskParameterRequest request) {
        return new AsyncInvoker<ListTaskParameterRequest, ListTaskParameterResponse>(request,
            CodeCheckMeta.listTaskParameter, hcClient);
    }

    /**
     * 查询任务的已选规则集列表
     *
     * 查询任务的已选规则集列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTaskRulesetRequest 请求对象
     * @return CompletableFuture<ListTaskRulesetResponse>
     */
    public CompletableFuture<ListTaskRulesetResponse> listTaskRulesetAsync(ListTaskRulesetRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.listTaskRuleset);
    }

    /**
     * 查询任务的已选规则集列表
     *
     * 查询任务的已选规则集列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTaskRulesetRequest 请求对象
     * @return AsyncInvoker<ListTaskRulesetRequest, ListTaskRulesetResponse>
     */
    public AsyncInvoker<ListTaskRulesetRequest, ListTaskRulesetResponse> listTaskRulesetAsyncInvoker(
        ListTaskRulesetRequest request) {
        return new AsyncInvoker<ListTaskRulesetRequest, ListTaskRulesetResponse>(request, CodeCheckMeta.listTaskRuleset,
            hcClient);
    }

    /**
     * 查看规则集的规则列表
     *
     * 根据项目ID、规则集ID等条件查询规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTemplateRulesRequest 请求对象
     * @return CompletableFuture<ListTemplateRulesResponse>
     */
    public CompletableFuture<ListTemplateRulesResponse> listTemplateRulesAsync(ListTemplateRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.listTemplateRules);
    }

    /**
     * 查看规则集的规则列表
     *
     * 根据项目ID、规则集ID等条件查询规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTemplateRulesRequest 请求对象
     * @return AsyncInvoker<ListTemplateRulesRequest, ListTemplateRulesResponse>
     */
    public AsyncInvoker<ListTemplateRulesRequest, ListTemplateRulesResponse> listTemplateRulesAsyncInvoker(
        ListTemplateRulesRequest request) {
        return new AsyncInvoker<ListTemplateRulesRequest, ListTemplateRulesResponse>(request,
            CodeCheckMeta.listTemplateRules, hcClient);
    }

    /**
     * 执行检查任务
     *
     * 执行检查任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunTaskRequest 请求对象
     * @return CompletableFuture<RunTaskResponse>
     */
    public CompletableFuture<RunTaskResponse> runTaskAsync(RunTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.runTask);
    }

    /**
     * 执行检查任务
     *
     * 执行检查任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunTaskRequest 请求对象
     * @return AsyncInvoker<RunTaskRequest, RunTaskResponse>
     */
    public AsyncInvoker<RunTaskRequest, RunTaskResponse> runTaskAsyncInvoker(RunTaskRequest request) {
        return new AsyncInvoker<RunTaskRequest, RunTaskResponse>(request, CodeCheckMeta.runTask, hcClient);
    }

    /**
     * 设置每个项目对应语言的默认规则集配置
     *
     * 设置每个项目对应语言的默认规则集配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetDefaulTemplateRequest 请求对象
     * @return CompletableFuture<SetDefaulTemplateResponse>
     */
    public CompletableFuture<SetDefaulTemplateResponse> setDefaulTemplateAsync(SetDefaulTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.setDefaulTemplate);
    }

    /**
     * 设置每个项目对应语言的默认规则集配置
     *
     * 设置每个项目对应语言的默认规则集配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetDefaulTemplateRequest 请求对象
     * @return AsyncInvoker<SetDefaulTemplateRequest, SetDefaulTemplateResponse>
     */
    public AsyncInvoker<SetDefaulTemplateRequest, SetDefaulTemplateResponse> setDefaulTemplateAsyncInvoker(
        SetDefaulTemplateRequest request) {
        return new AsyncInvoker<SetDefaulTemplateRequest, SetDefaulTemplateResponse>(request,
            CodeCheckMeta.setDefaulTemplate, hcClient);
    }

    /**
     * 查询任务执行状态
     *
     * 根据任务ID查询任务执行状态。任务状态：0表示检查中，1表示检查失败，2表示检查成功，3表示任务中止。只有正在检查中才有进度的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProgressDetailRequest 请求对象
     * @return CompletableFuture<ShowProgressDetailResponse>
     */
    public CompletableFuture<ShowProgressDetailResponse> showProgressDetailAsync(ShowProgressDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.showProgressDetail);
    }

    /**
     * 查询任务执行状态
     *
     * 根据任务ID查询任务执行状态。任务状态：0表示检查中，1表示检查失败，2表示检查成功，3表示任务中止。只有正在检查中才有进度的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProgressDetailRequest 请求对象
     * @return AsyncInvoker<ShowProgressDetailRequest, ShowProgressDetailResponse>
     */
    public AsyncInvoker<ShowProgressDetailRequest, ShowProgressDetailResponse> showProgressDetailAsyncInvoker(
        ShowProgressDetailRequest request) {
        return new AsyncInvoker<ShowProgressDetailRequest, ShowProgressDetailResponse>(request,
            CodeCheckMeta.showProgressDetail, hcClient);
    }

    /**
     * 查询cmertrics缺陷概要
     *
     * 根据检查任务ID查询cmertrics缺陷概要。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskCmetricsRequest 请求对象
     * @return CompletableFuture<ShowTaskCmetricsResponse>
     */
    public CompletableFuture<ShowTaskCmetricsResponse> showTaskCmetricsAsync(ShowTaskCmetricsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.showTaskCmetrics);
    }

    /**
     * 查询cmertrics缺陷概要
     *
     * 根据检查任务ID查询cmertrics缺陷概要。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskCmetricsRequest 请求对象
     * @return AsyncInvoker<ShowTaskCmetricsRequest, ShowTaskCmetricsResponse>
     */
    public AsyncInvoker<ShowTaskCmetricsRequest, ShowTaskCmetricsResponse> showTaskCmetricsAsyncInvoker(
        ShowTaskCmetricsRequest request) {
        return new AsyncInvoker<ShowTaskCmetricsRequest, ShowTaskCmetricsResponse>(request,
            CodeCheckMeta.showTaskCmetrics, hcClient);
    }

    /**
     * 查询缺陷详情
     *
     * 根据检查任务ID分页查询缺陷结果详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskDefectsRequest 请求对象
     * @return CompletableFuture<ShowTaskDefectsResponse>
     */
    public CompletableFuture<ShowTaskDefectsResponse> showTaskDefectsAsync(ShowTaskDefectsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.showTaskDefects);
    }

    /**
     * 查询缺陷详情
     *
     * 根据检查任务ID分页查询缺陷结果详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskDefectsRequest 请求对象
     * @return AsyncInvoker<ShowTaskDefectsRequest, ShowTaskDefectsResponse>
     */
    public AsyncInvoker<ShowTaskDefectsRequest, ShowTaskDefectsResponse> showTaskDefectsAsyncInvoker(
        ShowTaskDefectsRequest request) {
        return new AsyncInvoker<ShowTaskDefectsRequest, ShowTaskDefectsResponse>(request, CodeCheckMeta.showTaskDefects,
            hcClient);
    }

    /**
     * 查询缺陷详情的统计
     *
     * 根据检查任务ID查询缺陷详情的统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskDefectsStatisticRequest 请求对象
     * @return CompletableFuture<ShowTaskDefectsStatisticResponse>
     */
    public CompletableFuture<ShowTaskDefectsStatisticResponse> showTaskDefectsStatisticAsync(
        ShowTaskDefectsStatisticRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.showTaskDefectsStatistic);
    }

    /**
     * 查询缺陷详情的统计
     *
     * 根据检查任务ID查询缺陷详情的统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskDefectsStatisticRequest 请求对象
     * @return AsyncInvoker<ShowTaskDefectsStatisticRequest, ShowTaskDefectsStatisticResponse>
     */
    public AsyncInvoker<ShowTaskDefectsStatisticRequest, ShowTaskDefectsStatisticResponse> showTaskDefectsStatisticAsyncInvoker(
        ShowTaskDefectsStatisticRequest request) {
        return new AsyncInvoker<ShowTaskDefectsStatisticRequest, ShowTaskDefectsStatisticResponse>(request,
            CodeCheckMeta.showTaskDefectsStatistic, hcClient);
    }

    /**
     * 查询缺陷概要
     *
     * 根据检查任务ID查询缺陷结果的概要。包括问题概述、问题状态、圈复杂度、代码重复率等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskDetailRequest 请求对象
     * @return CompletableFuture<ShowTaskDetailResponse>
     */
    public CompletableFuture<ShowTaskDetailResponse> showTaskDetailAsync(ShowTaskDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.showTaskDetail);
    }

    /**
     * 查询缺陷概要
     *
     * 根据检查任务ID查询缺陷结果的概要。包括问题概述、问题状态、圈复杂度、代码重复率等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskDetailRequest 请求对象
     * @return AsyncInvoker<ShowTaskDetailRequest, ShowTaskDetailResponse>
     */
    public AsyncInvoker<ShowTaskDetailRequest, ShowTaskDetailResponse> showTaskDetailAsyncInvoker(
        ShowTaskDetailRequest request) {
        return new AsyncInvoker<ShowTaskDetailRequest, ShowTaskDetailResponse>(request, CodeCheckMeta.showTaskDetail,
            hcClient);
    }

    /**
     * 查询任务列表
     *
     * 根据DEVCLOUD_PROJECT_UUID查询该项目下的任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskListByProjectIdRequest 请求对象
     * @return CompletableFuture<ShowTaskListByProjectIdResponse>
     */
    public CompletableFuture<ShowTaskListByProjectIdResponse> showTaskListByProjectIdAsync(
        ShowTaskListByProjectIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.showTaskListByProjectId);
    }

    /**
     * 查询任务列表
     *
     * 根据DEVCLOUD_PROJECT_UUID查询该项目下的任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskListByProjectIdRequest 请求对象
     * @return AsyncInvoker<ShowTaskListByProjectIdRequest, ShowTaskListByProjectIdResponse>
     */
    public AsyncInvoker<ShowTaskListByProjectIdRequest, ShowTaskListByProjectIdResponse> showTaskListByProjectIdAsyncInvoker(
        ShowTaskListByProjectIdRequest request) {
        return new AsyncInvoker<ShowTaskListByProjectIdRequest, ShowTaskListByProjectIdResponse>(request,
            CodeCheckMeta.showTaskListByProjectId, hcClient);
    }

    /**
     * 查询任务检查失败日志
     *
     * 查询任务检查失败日志，不传execute_id则查询最近一次的检查日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTasklogRequest 请求对象
     * @return CompletableFuture<ShowTasklogResponse>
     */
    public CompletableFuture<ShowTasklogResponse> showTasklogAsync(ShowTasklogRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.showTasklog);
    }

    /**
     * 查询任务检查失败日志
     *
     * 查询任务检查失败日志，不传execute_id则查询最近一次的检查日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTasklogRequest 请求对象
     * @return AsyncInvoker<ShowTasklogRequest, ShowTasklogResponse>
     */
    public AsyncInvoker<ShowTasklogRequest, ShowTasklogResponse> showTasklogAsyncInvoker(ShowTasklogRequest request) {
        return new AsyncInvoker<ShowTasklogRequest, ShowTasklogResponse>(request, CodeCheckMeta.showTasklog, hcClient);
    }

    /**
     * 查询任务的已选规则集列表
     *
     * 查询任务的已选规则集列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTasksRulesetsRequest 请求对象
     * @return CompletableFuture<ShowTasksRulesetsResponse>
     */
    public CompletableFuture<ShowTasksRulesetsResponse> showTasksRulesetsAsync(ShowTasksRulesetsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.showTasksRulesets);
    }

    /**
     * 查询任务的已选规则集列表
     *
     * 查询任务的已选规则集列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTasksRulesetsRequest 请求对象
     * @return AsyncInvoker<ShowTasksRulesetsRequest, ShowTasksRulesetsResponse>
     */
    public AsyncInvoker<ShowTasksRulesetsRequest, ShowTasksRulesetsResponse> showTasksRulesetsAsyncInvoker(
        ShowTasksRulesetsRequest request) {
        return new AsyncInvoker<ShowTasksRulesetsRequest, ShowTasksRulesetsResponse>(request,
            CodeCheckMeta.showTasksRulesets, hcClient);
    }

    /**
     * 终止检查任务
     *
     * 根据任务ID终止检查任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopTaskByIdRequest 请求对象
     * @return CompletableFuture<StopTaskByIdResponse>
     */
    public CompletableFuture<StopTaskByIdResponse> stopTaskByIdAsync(StopTaskByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.stopTaskById);
    }

    /**
     * 终止检查任务
     *
     * 根据任务ID终止检查任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopTaskByIdRequest 请求对象
     * @return AsyncInvoker<StopTaskByIdRequest, StopTaskByIdResponse>
     */
    public AsyncInvoker<StopTaskByIdRequest, StopTaskByIdResponse> stopTaskByIdAsyncInvoker(
        StopTaskByIdRequest request) {
        return new AsyncInvoker<StopTaskByIdRequest, StopTaskByIdResponse>(request, CodeCheckMeta.stopTaskById,
            hcClient);
    }

    /**
     * 修改缺陷状态
     *
     * 修改检查出的缺陷的状态为已解决、已忽略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDefectStatusRequest 请求对象
     * @return CompletableFuture<UpdateDefectStatusResponse>
     */
    public CompletableFuture<UpdateDefectStatusResponse> updateDefectStatusAsync(UpdateDefectStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.updateDefectStatus);
    }

    /**
     * 修改缺陷状态
     *
     * 修改检查出的缺陷的状态为已解决、已忽略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDefectStatusRequest 请求对象
     * @return AsyncInvoker<UpdateDefectStatusRequest, UpdateDefectStatusResponse>
     */
    public AsyncInvoker<UpdateDefectStatusRequest, UpdateDefectStatusResponse> updateDefectStatusAsyncInvoker(
        UpdateDefectStatusRequest request) {
        return new AsyncInvoker<UpdateDefectStatusRequest, UpdateDefectStatusResponse>(request,
            CodeCheckMeta.updateDefectStatus, hcClient);
    }

    /**
     * 修改任务规则集
     *
     * 修改任务规则集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskRulesetRequest 请求对象
     * @return CompletableFuture<UpdateTaskRulesetResponse>
     */
    public CompletableFuture<UpdateTaskRulesetResponse> updateTaskRulesetAsync(UpdateTaskRulesetRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeCheckMeta.updateTaskRuleset);
    }

    /**
     * 修改任务规则集
     *
     * 修改任务规则集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskRulesetRequest 请求对象
     * @return AsyncInvoker<UpdateTaskRulesetRequest, UpdateTaskRulesetResponse>
     */
    public AsyncInvoker<UpdateTaskRulesetRequest, UpdateTaskRulesetResponse> updateTaskRulesetAsyncInvoker(
        UpdateTaskRulesetRequest request) {
        return new AsyncInvoker<UpdateTaskRulesetRequest, UpdateTaskRulesetResponse>(request,
            CodeCheckMeta.updateTaskRuleset, hcClient);
    }

}

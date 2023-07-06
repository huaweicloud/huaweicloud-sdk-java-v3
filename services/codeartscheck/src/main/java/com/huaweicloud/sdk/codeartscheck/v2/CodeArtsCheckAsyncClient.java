package com.huaweicloud.sdk.codeartscheck.v2;

import com.huaweicloud.sdk.codeartscheck.v2.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CodeArtsCheckAsyncClient {

    protected HcClient hcClient;

    public CodeArtsCheckAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CodeArtsCheckAsyncClient> newBuilder() {
        return new ClientBuilder<>(CodeArtsCheckAsyncClient::new);
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
        return hcClient.asyncInvokeHttp(request, CodeArtsCheckMeta.checkParameters);
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
        return new AsyncInvoker<CheckParametersRequest, CheckParametersResponse>(request,
            CodeArtsCheckMeta.checkParameters, hcClient);
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
        return hcClient.asyncInvokeHttp(request, CodeArtsCheckMeta.checkRecord);
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
        return new AsyncInvoker<CheckRecordRequest, CheckRecordResponse>(request, CodeArtsCheckMeta.checkRecord,
            hcClient);
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
        return hcClient.asyncInvokeHttp(request, CodeArtsCheckMeta.checkRulesetParameters);
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
            CodeArtsCheckMeta.checkRulesetParameters, hcClient);
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
        return hcClient.asyncInvokeHttp(request, CodeArtsCheckMeta.createRuleset);
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
        return new AsyncInvoker<CreateRulesetRequest, CreateRulesetResponse>(request, CodeArtsCheckMeta.createRuleset,
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
        return hcClient.asyncInvokeHttp(request, CodeArtsCheckMeta.createTask);
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
        return new AsyncInvoker<CreateTaskRequest, CreateTaskResponse>(request, CodeArtsCheckMeta.createTask, hcClient);
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
        return hcClient.asyncInvokeHttp(request, CodeArtsCheckMeta.deleteRuleset);
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
        return new AsyncInvoker<DeleteRulesetRequest, DeleteRulesetResponse>(request, CodeArtsCheckMeta.deleteRuleset,
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
        return hcClient.asyncInvokeHttp(request, CodeArtsCheckMeta.deleteTask);
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
        return new AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse>(request, CodeArtsCheckMeta.deleteTask, hcClient);
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
        return hcClient.asyncInvokeHttp(request, CodeArtsCheckMeta.listRules);
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
        return new AsyncInvoker<ListRulesRequest, ListRulesResponse>(request, CodeArtsCheckMeta.listRules, hcClient);
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
        return hcClient.asyncInvokeHttp(request, CodeArtsCheckMeta.listRulesets);
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
        return new AsyncInvoker<ListRulesetsRequest, ListRulesetsResponse>(request, CodeArtsCheckMeta.listRulesets,
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
        return hcClient.asyncInvokeHttp(request, CodeArtsCheckMeta.listTaskParameter);
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
            CodeArtsCheckMeta.listTaskParameter, hcClient);
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
        return hcClient.asyncInvokeHttp(request, CodeArtsCheckMeta.listTaskRuleset);
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
        return new AsyncInvoker<ListTaskRulesetRequest, ListTaskRulesetResponse>(request,
            CodeArtsCheckMeta.listTaskRuleset, hcClient);
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
        return hcClient.asyncInvokeHttp(request, CodeArtsCheckMeta.listTemplateRules);
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
            CodeArtsCheckMeta.listTemplateRules, hcClient);
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
        return hcClient.asyncInvokeHttp(request, CodeArtsCheckMeta.runTask);
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
        return new AsyncInvoker<RunTaskRequest, RunTaskResponse>(request, CodeArtsCheckMeta.runTask, hcClient);
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
        return hcClient.asyncInvokeHttp(request, CodeArtsCheckMeta.setDefaulTemplate);
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
            CodeArtsCheckMeta.setDefaulTemplate, hcClient);
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
        return hcClient.asyncInvokeHttp(request, CodeArtsCheckMeta.showProgressDetail);
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
            CodeArtsCheckMeta.showProgressDetail, hcClient);
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
        return hcClient.asyncInvokeHttp(request, CodeArtsCheckMeta.showTaskCmetrics);
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
            CodeArtsCheckMeta.showTaskCmetrics, hcClient);
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
        return hcClient.asyncInvokeHttp(request, CodeArtsCheckMeta.showTaskDefects);
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
        return new AsyncInvoker<ShowTaskDefectsRequest, ShowTaskDefectsResponse>(request,
            CodeArtsCheckMeta.showTaskDefects, hcClient);
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
        return hcClient.asyncInvokeHttp(request, CodeArtsCheckMeta.showTaskDefectsStatistic);
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
            CodeArtsCheckMeta.showTaskDefectsStatistic, hcClient);
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
        return hcClient.asyncInvokeHttp(request, CodeArtsCheckMeta.showTaskDetail);
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
        return new AsyncInvoker<ShowTaskDetailRequest, ShowTaskDetailResponse>(request,
            CodeArtsCheckMeta.showTaskDetail, hcClient);
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
        return hcClient.asyncInvokeHttp(request, CodeArtsCheckMeta.showTaskListByProjectId);
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
            CodeArtsCheckMeta.showTaskListByProjectId, hcClient);
    }

    /**
     * 获取任务的目录树
     *
     * 获取任务的目录树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskPathTreeRequest 请求对象
     * @return CompletableFuture<ShowTaskPathTreeResponse>
     */
    public CompletableFuture<ShowTaskPathTreeResponse> showTaskPathTreeAsync(ShowTaskPathTreeRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsCheckMeta.showTaskPathTree);
    }

    /**
     * 获取任务的目录树
     *
     * 获取任务的目录树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskPathTreeRequest 请求对象
     * @return AsyncInvoker<ShowTaskPathTreeRequest, ShowTaskPathTreeResponse>
     */
    public AsyncInvoker<ShowTaskPathTreeRequest, ShowTaskPathTreeResponse> showTaskPathTreeAsyncInvoker(
        ShowTaskPathTreeRequest request) {
        return new AsyncInvoker<ShowTaskPathTreeRequest, ShowTaskPathTreeResponse>(request,
            CodeArtsCheckMeta.showTaskPathTree, hcClient);
    }

    /**
     * 查询任务的高级选项
     *
     * 查询任务的高级选项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskSettingsRequest 请求对象
     * @return CompletableFuture<ShowTaskSettingsResponse>
     */
    public CompletableFuture<ShowTaskSettingsResponse> showTaskSettingsAsync(ShowTaskSettingsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsCheckMeta.showTaskSettings);
    }

    /**
     * 查询任务的高级选项
     *
     * 查询任务的高级选项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskSettingsRequest 请求对象
     * @return AsyncInvoker<ShowTaskSettingsRequest, ShowTaskSettingsResponse>
     */
    public AsyncInvoker<ShowTaskSettingsRequest, ShowTaskSettingsResponse> showTaskSettingsAsyncInvoker(
        ShowTaskSettingsRequest request) {
        return new AsyncInvoker<ShowTaskSettingsRequest, ShowTaskSettingsResponse>(request,
            CodeArtsCheckMeta.showTaskSettings, hcClient);
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
        return hcClient.asyncInvokeHttp(request, CodeArtsCheckMeta.showTasklog);
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
        return new AsyncInvoker<ShowTasklogRequest, ShowTasklogResponse>(request, CodeArtsCheckMeta.showTasklog,
            hcClient);
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
        return hcClient.asyncInvokeHttp(request, CodeArtsCheckMeta.showTasksRulesets);
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
            CodeArtsCheckMeta.showTasksRulesets, hcClient);
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
        return hcClient.asyncInvokeHttp(request, CodeArtsCheckMeta.stopTaskById);
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
        return new AsyncInvoker<StopTaskByIdRequest, StopTaskByIdResponse>(request, CodeArtsCheckMeta.stopTaskById,
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
        return hcClient.asyncInvokeHttp(request, CodeArtsCheckMeta.updateDefectStatus);
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
            CodeArtsCheckMeta.updateDefectStatus, hcClient);
    }

    /**
     * 任务配置屏蔽目录
     *
     * 任务配置屏蔽目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateIgnorePathRequest 请求对象
     * @return CompletableFuture<UpdateIgnorePathResponse>
     */
    public CompletableFuture<UpdateIgnorePathResponse> updateIgnorePathAsync(UpdateIgnorePathRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsCheckMeta.updateIgnorePath);
    }

    /**
     * 任务配置屏蔽目录
     *
     * 任务配置屏蔽目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateIgnorePathRequest 请求对象
     * @return AsyncInvoker<UpdateIgnorePathRequest, UpdateIgnorePathResponse>
     */
    public AsyncInvoker<UpdateIgnorePathRequest, UpdateIgnorePathResponse> updateIgnorePathAsyncInvoker(
        UpdateIgnorePathRequest request) {
        return new AsyncInvoker<UpdateIgnorePathRequest, UpdateIgnorePathResponse>(request,
            CodeArtsCheckMeta.updateIgnorePath, hcClient);
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
        return hcClient.asyncInvokeHttp(request, CodeArtsCheckMeta.updateTaskRuleset);
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
            CodeArtsCheckMeta.updateTaskRuleset, hcClient);
    }

    /**
     * 任务配置高级选项
     *
     * 任务配置高级选项，如自定义镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskSettingsRequest 请求对象
     * @return CompletableFuture<UpdateTaskSettingsResponse>
     */
    public CompletableFuture<UpdateTaskSettingsResponse> updateTaskSettingsAsync(UpdateTaskSettingsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsCheckMeta.updateTaskSettings);
    }

    /**
     * 任务配置高级选项
     *
     * 任务配置高级选项，如自定义镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskSettingsRequest 请求对象
     * @return AsyncInvoker<UpdateTaskSettingsRequest, UpdateTaskSettingsResponse>
     */
    public AsyncInvoker<UpdateTaskSettingsRequest, UpdateTaskSettingsResponse> updateTaskSettingsAsyncInvoker(
        UpdateTaskSettingsRequest request) {
        return new AsyncInvoker<UpdateTaskSettingsRequest, UpdateTaskSettingsResponse>(request,
            CodeArtsCheckMeta.updateTaskSettings, hcClient);
    }

}

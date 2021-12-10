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

    /** 创建自定义规则集 可根据需求灵活的组合规则。
     *
     * @param CreateRulesetRequest 请求对象
     * @return CreateRulesetResponse */
    public CreateRulesetResponse createRuleset(CreateRulesetRequest request) {
        return hcClient.syncInvokeHttp(request, CodeCheckMeta.createRuleset);
    }

    /** 创建自定义规则集 可根据需求灵活的组合规则。
     *
     * @param CreateRulesetRequest 请求对象
     * @return SyncInvoker<CreateRulesetRequest, CreateRulesetResponse> */
    public SyncInvoker<CreateRulesetRequest, CreateRulesetResponse> createRulesetInvoker(CreateRulesetRequest request) {
        return new SyncInvoker<CreateRulesetRequest, CreateRulesetResponse>(request, CodeCheckMeta.createRuleset,
            hcClient);
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

    /** 删除检查任务 删除检查任务，执行中的任务删除无法再查看
     *
     * @param DeleteTaskRequest 请求对象
     * @return DeleteTaskResponse */
    public DeleteTaskResponse deleteTask(DeleteTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CodeCheckMeta.deleteTask);
    }

    /** 删除检查任务 删除检查任务，执行中的任务删除无法再查看
     *
     * @param DeleteTaskRequest 请求对象
     * @return SyncInvoker<DeleteTaskRequest, DeleteTaskResponse> */
    public SyncInvoker<DeleteTaskRequest, DeleteTaskResponse> deleteTaskInvoker(DeleteTaskRequest request) {
        return new SyncInvoker<DeleteTaskRequest, DeleteTaskResponse>(request, CodeCheckMeta.deleteTask, hcClient);
    }

    /** 获取规则列表接口 根据语言、问题级别等条件查询规则列表。
     *
     * @param ListRulesRequest 请求对象
     * @return ListRulesResponse */
    public ListRulesResponse listRules(ListRulesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeCheckMeta.listRules);
    }

    /** 获取规则列表接口 根据语言、问题级别等条件查询规则列表。
     *
     * @param ListRulesRequest 请求对象
     * @return SyncInvoker<ListRulesRequest, ListRulesResponse> */
    public SyncInvoker<ListRulesRequest, ListRulesResponse> listRulesInvoker(ListRulesRequest request) {
        return new SyncInvoker<ListRulesRequest, ListRulesResponse>(request, CodeCheckMeta.listRules, hcClient);
    }

    /** 查询规则集列表 根据项目ID、语言等条件查询规则集列表。
     *
     * @param ListRulesetsRequest 请求对象
     * @return ListRulesetsResponse */
    public ListRulesetsResponse listRulesets(ListRulesetsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeCheckMeta.listRulesets);
    }

    /** 查询规则集列表 根据项目ID、语言等条件查询规则集列表。
     *
     * @param ListRulesetsRequest 请求对象
     * @return SyncInvoker<ListRulesetsRequest, ListRulesetsResponse> */
    public SyncInvoker<ListRulesetsRequest, ListRulesetsResponse> listRulesetsInvoker(ListRulesetsRequest request) {
        return new SyncInvoker<ListRulesetsRequest, ListRulesetsResponse>(request, CodeCheckMeta.listRulesets,
            hcClient);
    }

    /** 查询任务的已选规则集列表 查询任务的已选规则集列表。
     *
     * @param ListTaskRulesetRequest 请求对象
     * @return ListTaskRulesetResponse */
    public ListTaskRulesetResponse listTaskRuleset(ListTaskRulesetRequest request) {
        return hcClient.syncInvokeHttp(request, CodeCheckMeta.listTaskRuleset);
    }

    /** 查询任务的已选规则集列表 查询任务的已选规则集列表。
     *
     * @param ListTaskRulesetRequest 请求对象
     * @return SyncInvoker<ListTaskRulesetRequest, ListTaskRulesetResponse> */
    public SyncInvoker<ListTaskRulesetRequest, ListTaskRulesetResponse> listTaskRulesetInvoker(
        ListTaskRulesetRequest request) {
        return new SyncInvoker<ListTaskRulesetRequest, ListTaskRulesetResponse>(request, CodeCheckMeta.listTaskRuleset,
            hcClient);
    }

    /** 查看规则集的规则列表 根据项目ID、规则集ID等条件查询规则列表。
     *
     * @param ListTemplateRulesRequest 请求对象
     * @return ListTemplateRulesResponse */
    public ListTemplateRulesResponse listTemplateRules(ListTemplateRulesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeCheckMeta.listTemplateRules);
    }

    /** 查看规则集的规则列表 根据项目ID、规则集ID等条件查询规则列表。
     *
     * @param ListTemplateRulesRequest 请求对象
     * @return SyncInvoker<ListTemplateRulesRequest, ListTemplateRulesResponse> */
    public SyncInvoker<ListTemplateRulesRequest, ListTemplateRulesResponse> listTemplateRulesInvoker(
        ListTemplateRulesRequest request) {
        return new SyncInvoker<ListTemplateRulesRequest, ListTemplateRulesResponse>(request,
            CodeCheckMeta.listTemplateRules, hcClient);
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

    /** 查询cmertrics缺陷概要 根据检查任务ID查询cmertrics缺陷概要。
     *
     * @param ShowTaskCmetricsRequest 请求对象
     * @return ShowTaskCmetricsResponse */
    public ShowTaskCmetricsResponse showTaskCmetrics(ShowTaskCmetricsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeCheckMeta.showTaskCmetrics);
    }

    /** 查询cmertrics缺陷概要 根据检查任务ID查询cmertrics缺陷概要。
     *
     * @param ShowTaskCmetricsRequest 请求对象
     * @return SyncInvoker<ShowTaskCmetricsRequest, ShowTaskCmetricsResponse> */
    public SyncInvoker<ShowTaskCmetricsRequest, ShowTaskCmetricsResponse> showTaskCmetricsInvoker(
        ShowTaskCmetricsRequest request) {
        return new SyncInvoker<ShowTaskCmetricsRequest, ShowTaskCmetricsResponse>(request,
            CodeCheckMeta.showTaskCmetrics, hcClient);
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

    /** 修改任务规则集 修改任务规则集。
     *
     * @param UpdateTaskRulesetRequest 请求对象
     * @return UpdateTaskRulesetResponse */
    public UpdateTaskRulesetResponse updateTaskRuleset(UpdateTaskRulesetRequest request) {
        return hcClient.syncInvokeHttp(request, CodeCheckMeta.updateTaskRuleset);
    }

    /** 修改任务规则集 修改任务规则集。
     *
     * @param UpdateTaskRulesetRequest 请求对象
     * @return SyncInvoker<UpdateTaskRulesetRequest, UpdateTaskRulesetResponse> */
    public SyncInvoker<UpdateTaskRulesetRequest, UpdateTaskRulesetResponse> updateTaskRulesetInvoker(
        UpdateTaskRulesetRequest request) {
        return new SyncInvoker<UpdateTaskRulesetRequest, UpdateTaskRulesetResponse>(request,
            CodeCheckMeta.updateTaskRuleset, hcClient);
    }

}

package com.huaweicloud.sdk.codeartscheck.v2;

import com.huaweicloud.sdk.codeartscheck.v2.model.CheckParametersRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.CheckParametersResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.CheckRecordRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.CheckRecordResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.CheckRulesetParametersRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.CheckRulesetParametersResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.CreateRulesetRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.CreateRulesetResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.CreateTaskRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.CreateTaskResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.DeleteRulesetRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.DeleteRulesetResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.DeleteTaskRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.DeleteTaskResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.ListRulesRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.ListRulesResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.ListRulesetsRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.ListRulesetsResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.ListTaskParameterRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.ListTaskParameterResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.ListTaskRulesetRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.ListTaskRulesetResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.ListTemplateRulesRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.ListTemplateRulesResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.RunTaskRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.RunTaskResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.SetDefaulTemplateRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.SetDefaulTemplateResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowProgressDetailRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowProgressDetailResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowTaskCmetricsRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowTaskCmetricsResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowTaskDefectsRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowTaskDefectsResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowTaskDefectsStatisticRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowTaskDefectsStatisticResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowTaskDetailRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowTaskDetailResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowTaskListByProjectIdRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowTaskListByProjectIdResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowTaskPathTreeRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowTaskPathTreeResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowTaskSettingsRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowTaskSettingsResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowTasklogRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowTasklogResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowTasksRulesetsRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.ShowTasksRulesetsResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.StopTaskByIdRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.StopTaskByIdResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.UpdateDefectStatusRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.UpdateDefectStatusResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.UpdateIgnorePathRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.UpdateIgnorePathResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.UpdateTaskRulesetRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.UpdateTaskRulesetResponse;
import com.huaweicloud.sdk.codeartscheck.v2.model.UpdateTaskSettingsRequest;
import com.huaweicloud.sdk.codeartscheck.v2.model.UpdateTaskSettingsResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CodeArtsCheckClient {

    protected HcClient hcClient;

    public CodeArtsCheckClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CodeArtsCheckClient> newBuilder() {
        ClientBuilder<CodeArtsCheckClient> clientBuilder = new ClientBuilder<>(CodeArtsCheckClient::new);
        return clientBuilder;
    }

    /**
     * 查询任务规则集的检查参数
     *
     * 查询任务规则集的检查参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckParametersRequest 请求对象
     * @return CheckParametersResponse
     */
    public CheckParametersResponse checkParameters(CheckParametersRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsCheckMeta.checkParameters);
    }

    /**
     * 查询任务规则集的检查参数
     *
     * 查询任务规则集的检查参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckParametersRequest 请求对象
     * @return SyncInvoker<CheckParametersRequest, CheckParametersResponse>
     */
    public SyncInvoker<CheckParametersRequest, CheckParametersResponse> checkParametersInvoker(
        CheckParametersRequest request) {
        return new SyncInvoker<>(request, CodeArtsCheckMeta.checkParameters, hcClient);
    }

    /**
     * 历史扫描结果查询
     *
     * 提供每次扫描的问题数量统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckRecordRequest 请求对象
     * @return CheckRecordResponse
     */
    public CheckRecordResponse checkRecord(CheckRecordRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsCheckMeta.checkRecord);
    }

    /**
     * 历史扫描结果查询
     *
     * 提供每次扫描的问题数量统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckRecordRequest 请求对象
     * @return SyncInvoker<CheckRecordRequest, CheckRecordResponse>
     */
    public SyncInvoker<CheckRecordRequest, CheckRecordResponse> checkRecordInvoker(CheckRecordRequest request) {
        return new SyncInvoker<>(request, CodeArtsCheckMeta.checkRecord, hcClient);
    }

    /**
     * 查询任务规则集的检查参数
     *
     * 查询任务规则集的检查参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckRulesetParametersRequest 请求对象
     * @return CheckRulesetParametersResponse
     */
    public CheckRulesetParametersResponse checkRulesetParameters(CheckRulesetParametersRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsCheckMeta.checkRulesetParameters);
    }

    /**
     * 查询任务规则集的检查参数
     *
     * 查询任务规则集的检查参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckRulesetParametersRequest 请求对象
     * @return SyncInvoker<CheckRulesetParametersRequest, CheckRulesetParametersResponse>
     */
    public SyncInvoker<CheckRulesetParametersRequest, CheckRulesetParametersResponse> checkRulesetParametersInvoker(
        CheckRulesetParametersRequest request) {
        return new SyncInvoker<>(request, CodeArtsCheckMeta.checkRulesetParameters, hcClient);
    }

    /**
     * 创建自定义规则集
     *
     * 可根据需求灵活的组合规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRulesetRequest 请求对象
     * @return CreateRulesetResponse
     */
    public CreateRulesetResponse createRuleset(CreateRulesetRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsCheckMeta.createRuleset);
    }

    /**
     * 创建自定义规则集
     *
     * 可根据需求灵活的组合规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRulesetRequest 请求对象
     * @return SyncInvoker<CreateRulesetRequest, CreateRulesetResponse>
     */
    public SyncInvoker<CreateRulesetRequest, CreateRulesetResponse> createRulesetInvoker(CreateRulesetRequest request) {
        return new SyncInvoker<>(request, CodeArtsCheckMeta.createRuleset, hcClient);
    }

    /**
     * 新建检查任务
     *
     * 新建检查任务但是不执行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTaskRequest 请求对象
     * @return CreateTaskResponse
     */
    public CreateTaskResponse createTask(CreateTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsCheckMeta.createTask);
    }

    /**
     * 新建检查任务
     *
     * 新建检查任务但是不执行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTaskRequest 请求对象
     * @return SyncInvoker<CreateTaskRequest, CreateTaskResponse>
     */
    public SyncInvoker<CreateTaskRequest, CreateTaskResponse> createTaskInvoker(CreateTaskRequest request) {
        return new SyncInvoker<>(request, CodeArtsCheckMeta.createTask, hcClient);
    }

    /**
     * 删除自定义规则集
     *
     * 删除自定义规则集，正在使用中的或默认规则集不能删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRulesetRequest 请求对象
     * @return DeleteRulesetResponse
     */
    public DeleteRulesetResponse deleteRuleset(DeleteRulesetRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsCheckMeta.deleteRuleset);
    }

    /**
     * 删除自定义规则集
     *
     * 删除自定义规则集，正在使用中的或默认规则集不能删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRulesetRequest 请求对象
     * @return SyncInvoker<DeleteRulesetRequest, DeleteRulesetResponse>
     */
    public SyncInvoker<DeleteRulesetRequest, DeleteRulesetResponse> deleteRulesetInvoker(DeleteRulesetRequest request) {
        return new SyncInvoker<>(request, CodeArtsCheckMeta.deleteRuleset, hcClient);
    }

    /**
     * 删除检查任务
     *
     * 删除检查任务，执行中的任务删除无法再查看
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTaskRequest 请求对象
     * @return DeleteTaskResponse
     */
    public DeleteTaskResponse deleteTask(DeleteTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsCheckMeta.deleteTask);
    }

    /**
     * 删除检查任务
     *
     * 删除检查任务，执行中的任务删除无法再查看
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTaskRequest 请求对象
     * @return SyncInvoker<DeleteTaskRequest, DeleteTaskResponse>
     */
    public SyncInvoker<DeleteTaskRequest, DeleteTaskResponse> deleteTaskInvoker(DeleteTaskRequest request) {
        return new SyncInvoker<>(request, CodeArtsCheckMeta.deleteTask, hcClient);
    }

    /**
     * 获取规则列表接口
     *
     * 根据语言、问题级别等条件查询规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRulesRequest 请求对象
     * @return ListRulesResponse
     */
    public ListRulesResponse listRules(ListRulesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsCheckMeta.listRules);
    }

    /**
     * 获取规则列表接口
     *
     * 根据语言、问题级别等条件查询规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRulesRequest 请求对象
     * @return SyncInvoker<ListRulesRequest, ListRulesResponse>
     */
    public SyncInvoker<ListRulesRequest, ListRulesResponse> listRulesInvoker(ListRulesRequest request) {
        return new SyncInvoker<>(request, CodeArtsCheckMeta.listRules, hcClient);
    }

    /**
     * 查询规则集列表
     *
     * 根据项目ID、语言等条件查询规则集列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRulesetsRequest 请求对象
     * @return ListRulesetsResponse
     */
    public ListRulesetsResponse listRulesets(ListRulesetsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsCheckMeta.listRulesets);
    }

    /**
     * 查询规则集列表
     *
     * 根据项目ID、语言等条件查询规则集列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRulesetsRequest 请求对象
     * @return SyncInvoker<ListRulesetsRequest, ListRulesetsResponse>
     */
    public SyncInvoker<ListRulesetsRequest, ListRulesetsResponse> listRulesetsInvoker(ListRulesetsRequest request) {
        return new SyncInvoker<>(request, CodeArtsCheckMeta.listRulesets, hcClient);
    }

    /**
     * 任务配置检查参数
     *
     * 任务配置检查参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskParameterRequest 请求对象
     * @return ListTaskParameterResponse
     */
    public ListTaskParameterResponse listTaskParameter(ListTaskParameterRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsCheckMeta.listTaskParameter);
    }

    /**
     * 任务配置检查参数
     *
     * 任务配置检查参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskParameterRequest 请求对象
     * @return SyncInvoker<ListTaskParameterRequest, ListTaskParameterResponse>
     */
    public SyncInvoker<ListTaskParameterRequest, ListTaskParameterResponse> listTaskParameterInvoker(
        ListTaskParameterRequest request) {
        return new SyncInvoker<>(request, CodeArtsCheckMeta.listTaskParameter, hcClient);
    }

    /**
     * 查询任务的已选规则集列表
     *
     * 查询任务的已选规则集列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskRulesetRequest 请求对象
     * @return ListTaskRulesetResponse
     */
    public ListTaskRulesetResponse listTaskRuleset(ListTaskRulesetRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsCheckMeta.listTaskRuleset);
    }

    /**
     * 查询任务的已选规则集列表
     *
     * 查询任务的已选规则集列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskRulesetRequest 请求对象
     * @return SyncInvoker<ListTaskRulesetRequest, ListTaskRulesetResponse>
     */
    public SyncInvoker<ListTaskRulesetRequest, ListTaskRulesetResponse> listTaskRulesetInvoker(
        ListTaskRulesetRequest request) {
        return new SyncInvoker<>(request, CodeArtsCheckMeta.listTaskRuleset, hcClient);
    }

    /**
     * 查看规则集的规则列表
     *
     * 根据项目ID、规则集ID等条件查询规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplateRulesRequest 请求对象
     * @return ListTemplateRulesResponse
     */
    public ListTemplateRulesResponse listTemplateRules(ListTemplateRulesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsCheckMeta.listTemplateRules);
    }

    /**
     * 查看规则集的规则列表
     *
     * 根据项目ID、规则集ID等条件查询规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplateRulesRequest 请求对象
     * @return SyncInvoker<ListTemplateRulesRequest, ListTemplateRulesResponse>
     */
    public SyncInvoker<ListTemplateRulesRequest, ListTemplateRulesResponse> listTemplateRulesInvoker(
        ListTemplateRulesRequest request) {
        return new SyncInvoker<>(request, CodeArtsCheckMeta.listTemplateRules, hcClient);
    }

    /**
     * 执行检查任务
     *
     * 执行检查任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunTaskRequest 请求对象
     * @return RunTaskResponse
     */
    public RunTaskResponse runTask(RunTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsCheckMeta.runTask);
    }

    /**
     * 执行检查任务
     *
     * 执行检查任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunTaskRequest 请求对象
     * @return SyncInvoker<RunTaskRequest, RunTaskResponse>
     */
    public SyncInvoker<RunTaskRequest, RunTaskResponse> runTaskInvoker(RunTaskRequest request) {
        return new SyncInvoker<>(request, CodeArtsCheckMeta.runTask, hcClient);
    }

    /**
     * 设置每个项目对应语言的默认规则集配置
     *
     * 设置每个项目对应语言的默认规则集配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetDefaulTemplateRequest 请求对象
     * @return SetDefaulTemplateResponse
     */
    public SetDefaulTemplateResponse setDefaulTemplate(SetDefaulTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsCheckMeta.setDefaulTemplate);
    }

    /**
     * 设置每个项目对应语言的默认规则集配置
     *
     * 设置每个项目对应语言的默认规则集配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetDefaulTemplateRequest 请求对象
     * @return SyncInvoker<SetDefaulTemplateRequest, SetDefaulTemplateResponse>
     */
    public SyncInvoker<SetDefaulTemplateRequest, SetDefaulTemplateResponse> setDefaulTemplateInvoker(
        SetDefaulTemplateRequest request) {
        return new SyncInvoker<>(request, CodeArtsCheckMeta.setDefaulTemplate, hcClient);
    }

    /**
     * 查询任务执行状态
     *
     * 根据任务ID查询任务执行状态。任务状态：0表示检查中，1表示检查失败，2表示检查成功，3表示任务中止。只有正在检查中才有进度的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProgressDetailRequest 请求对象
     * @return ShowProgressDetailResponse
     */
    public ShowProgressDetailResponse showProgressDetail(ShowProgressDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsCheckMeta.showProgressDetail);
    }

    /**
     * 查询任务执行状态
     *
     * 根据任务ID查询任务执行状态。任务状态：0表示检查中，1表示检查失败，2表示检查成功，3表示任务中止。只有正在检查中才有进度的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProgressDetailRequest 请求对象
     * @return SyncInvoker<ShowProgressDetailRequest, ShowProgressDetailResponse>
     */
    public SyncInvoker<ShowProgressDetailRequest, ShowProgressDetailResponse> showProgressDetailInvoker(
        ShowProgressDetailRequest request) {
        return new SyncInvoker<>(request, CodeArtsCheckMeta.showProgressDetail, hcClient);
    }

    /**
     * 查询cmertrics缺陷概要
     *
     * 根据检查任务ID查询cmertrics缺陷概要。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskCmetricsRequest 请求对象
     * @return ShowTaskCmetricsResponse
     */
    public ShowTaskCmetricsResponse showTaskCmetrics(ShowTaskCmetricsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsCheckMeta.showTaskCmetrics);
    }

    /**
     * 查询cmertrics缺陷概要
     *
     * 根据检查任务ID查询cmertrics缺陷概要。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskCmetricsRequest 请求对象
     * @return SyncInvoker<ShowTaskCmetricsRequest, ShowTaskCmetricsResponse>
     */
    public SyncInvoker<ShowTaskCmetricsRequest, ShowTaskCmetricsResponse> showTaskCmetricsInvoker(
        ShowTaskCmetricsRequest request) {
        return new SyncInvoker<>(request, CodeArtsCheckMeta.showTaskCmetrics, hcClient);
    }

    /**
     * 查询缺陷详情
     *
     * 根据检查任务ID分页查询缺陷结果详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskDefectsRequest 请求对象
     * @return ShowTaskDefectsResponse
     */
    public ShowTaskDefectsResponse showTaskDefects(ShowTaskDefectsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsCheckMeta.showTaskDefects);
    }

    /**
     * 查询缺陷详情
     *
     * 根据检查任务ID分页查询缺陷结果详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskDefectsRequest 请求对象
     * @return SyncInvoker<ShowTaskDefectsRequest, ShowTaskDefectsResponse>
     */
    public SyncInvoker<ShowTaskDefectsRequest, ShowTaskDefectsResponse> showTaskDefectsInvoker(
        ShowTaskDefectsRequest request) {
        return new SyncInvoker<>(request, CodeArtsCheckMeta.showTaskDefects, hcClient);
    }

    /**
     * 查询缺陷详情的统计
     *
     * 根据检查任务ID查询缺陷详情的统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskDefectsStatisticRequest 请求对象
     * @return ShowTaskDefectsStatisticResponse
     */
    public ShowTaskDefectsStatisticResponse showTaskDefectsStatistic(ShowTaskDefectsStatisticRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsCheckMeta.showTaskDefectsStatistic);
    }

    /**
     * 查询缺陷详情的统计
     *
     * 根据检查任务ID查询缺陷详情的统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskDefectsStatisticRequest 请求对象
     * @return SyncInvoker<ShowTaskDefectsStatisticRequest, ShowTaskDefectsStatisticResponse>
     */
    public SyncInvoker<ShowTaskDefectsStatisticRequest, ShowTaskDefectsStatisticResponse> showTaskDefectsStatisticInvoker(
        ShowTaskDefectsStatisticRequest request) {
        return new SyncInvoker<>(request, CodeArtsCheckMeta.showTaskDefectsStatistic, hcClient);
    }

    /**
     * 查询缺陷概要
     *
     * 根据检查任务ID查询缺陷结果的概要。包括问题概述、问题状态、圈复杂度、代码重复率等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskDetailRequest 请求对象
     * @return ShowTaskDetailResponse
     */
    public ShowTaskDetailResponse showTaskDetail(ShowTaskDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsCheckMeta.showTaskDetail);
    }

    /**
     * 查询缺陷概要
     *
     * 根据检查任务ID查询缺陷结果的概要。包括问题概述、问题状态、圈复杂度、代码重复率等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskDetailRequest 请求对象
     * @return SyncInvoker<ShowTaskDetailRequest, ShowTaskDetailResponse>
     */
    public SyncInvoker<ShowTaskDetailRequest, ShowTaskDetailResponse> showTaskDetailInvoker(
        ShowTaskDetailRequest request) {
        return new SyncInvoker<>(request, CodeArtsCheckMeta.showTaskDetail, hcClient);
    }

    /**
     * 查询任务列表
     *
     * 根据DEVCLOUD_PROJECT_UUID查询该项目下的任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskListByProjectIdRequest 请求对象
     * @return ShowTaskListByProjectIdResponse
     */
    public ShowTaskListByProjectIdResponse showTaskListByProjectId(ShowTaskListByProjectIdRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsCheckMeta.showTaskListByProjectId);
    }

    /**
     * 查询任务列表
     *
     * 根据DEVCLOUD_PROJECT_UUID查询该项目下的任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskListByProjectIdRequest 请求对象
     * @return SyncInvoker<ShowTaskListByProjectIdRequest, ShowTaskListByProjectIdResponse>
     */
    public SyncInvoker<ShowTaskListByProjectIdRequest, ShowTaskListByProjectIdResponse> showTaskListByProjectIdInvoker(
        ShowTaskListByProjectIdRequest request) {
        return new SyncInvoker<>(request, CodeArtsCheckMeta.showTaskListByProjectId, hcClient);
    }

    /**
     * 获取任务的目录树
     *
     * 获取任务的目录树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskPathTreeRequest 请求对象
     * @return ShowTaskPathTreeResponse
     */
    public ShowTaskPathTreeResponse showTaskPathTree(ShowTaskPathTreeRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsCheckMeta.showTaskPathTree);
    }

    /**
     * 获取任务的目录树
     *
     * 获取任务的目录树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskPathTreeRequest 请求对象
     * @return SyncInvoker<ShowTaskPathTreeRequest, ShowTaskPathTreeResponse>
     */
    public SyncInvoker<ShowTaskPathTreeRequest, ShowTaskPathTreeResponse> showTaskPathTreeInvoker(
        ShowTaskPathTreeRequest request) {
        return new SyncInvoker<>(request, CodeArtsCheckMeta.showTaskPathTree, hcClient);
    }

    /**
     * 查询任务的高级选项
     *
     * 查询任务的高级选项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskSettingsRequest 请求对象
     * @return ShowTaskSettingsResponse
     */
    public ShowTaskSettingsResponse showTaskSettings(ShowTaskSettingsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsCheckMeta.showTaskSettings);
    }

    /**
     * 查询任务的高级选项
     *
     * 查询任务的高级选项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskSettingsRequest 请求对象
     * @return SyncInvoker<ShowTaskSettingsRequest, ShowTaskSettingsResponse>
     */
    public SyncInvoker<ShowTaskSettingsRequest, ShowTaskSettingsResponse> showTaskSettingsInvoker(
        ShowTaskSettingsRequest request) {
        return new SyncInvoker<>(request, CodeArtsCheckMeta.showTaskSettings, hcClient);
    }

    /**
     * 查询任务检查失败日志
     *
     * 查询任务检查失败日志，不传execute_id则查询最近一次的检查日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTasklogRequest 请求对象
     * @return ShowTasklogResponse
     */
    public ShowTasklogResponse showTasklog(ShowTasklogRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsCheckMeta.showTasklog);
    }

    /**
     * 查询任务检查失败日志
     *
     * 查询任务检查失败日志，不传execute_id则查询最近一次的检查日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTasklogRequest 请求对象
     * @return SyncInvoker<ShowTasklogRequest, ShowTasklogResponse>
     */
    public SyncInvoker<ShowTasklogRequest, ShowTasklogResponse> showTasklogInvoker(ShowTasklogRequest request) {
        return new SyncInvoker<>(request, CodeArtsCheckMeta.showTasklog, hcClient);
    }

    /**
     * 查询任务的已选规则集列表
     *
     * 查询任务的已选规则集列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTasksRulesetsRequest 请求对象
     * @return ShowTasksRulesetsResponse
     */
    public ShowTasksRulesetsResponse showTasksRulesets(ShowTasksRulesetsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsCheckMeta.showTasksRulesets);
    }

    /**
     * 查询任务的已选规则集列表
     *
     * 查询任务的已选规则集列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTasksRulesetsRequest 请求对象
     * @return SyncInvoker<ShowTasksRulesetsRequest, ShowTasksRulesetsResponse>
     */
    public SyncInvoker<ShowTasksRulesetsRequest, ShowTasksRulesetsResponse> showTasksRulesetsInvoker(
        ShowTasksRulesetsRequest request) {
        return new SyncInvoker<>(request, CodeArtsCheckMeta.showTasksRulesets, hcClient);
    }

    /**
     * 终止检查任务
     *
     * 根据任务ID终止检查任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopTaskByIdRequest 请求对象
     * @return StopTaskByIdResponse
     */
    public StopTaskByIdResponse stopTaskById(StopTaskByIdRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsCheckMeta.stopTaskById);
    }

    /**
     * 终止检查任务
     *
     * 根据任务ID终止检查任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopTaskByIdRequest 请求对象
     * @return SyncInvoker<StopTaskByIdRequest, StopTaskByIdResponse>
     */
    public SyncInvoker<StopTaskByIdRequest, StopTaskByIdResponse> stopTaskByIdInvoker(StopTaskByIdRequest request) {
        return new SyncInvoker<>(request, CodeArtsCheckMeta.stopTaskById, hcClient);
    }

    /**
     * 修改缺陷状态
     *
     * 修改检查出的缺陷的状态为已解决、已忽略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDefectStatusRequest 请求对象
     * @return UpdateDefectStatusResponse
     */
    public UpdateDefectStatusResponse updateDefectStatus(UpdateDefectStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsCheckMeta.updateDefectStatus);
    }

    /**
     * 修改缺陷状态
     *
     * 修改检查出的缺陷的状态为已解决、已忽略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDefectStatusRequest 请求对象
     * @return SyncInvoker<UpdateDefectStatusRequest, UpdateDefectStatusResponse>
     */
    public SyncInvoker<UpdateDefectStatusRequest, UpdateDefectStatusResponse> updateDefectStatusInvoker(
        UpdateDefectStatusRequest request) {
        return new SyncInvoker<>(request, CodeArtsCheckMeta.updateDefectStatus, hcClient);
    }

    /**
     * 任务配置屏蔽目录
     *
     * 任务配置屏蔽目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIgnorePathRequest 请求对象
     * @return UpdateIgnorePathResponse
     */
    public UpdateIgnorePathResponse updateIgnorePath(UpdateIgnorePathRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsCheckMeta.updateIgnorePath);
    }

    /**
     * 任务配置屏蔽目录
     *
     * 任务配置屏蔽目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIgnorePathRequest 请求对象
     * @return SyncInvoker<UpdateIgnorePathRequest, UpdateIgnorePathResponse>
     */
    public SyncInvoker<UpdateIgnorePathRequest, UpdateIgnorePathResponse> updateIgnorePathInvoker(
        UpdateIgnorePathRequest request) {
        return new SyncInvoker<>(request, CodeArtsCheckMeta.updateIgnorePath, hcClient);
    }

    /**
     * 修改任务规则集
     *
     * 修改任务规则集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTaskRulesetRequest 请求对象
     * @return UpdateTaskRulesetResponse
     */
    public UpdateTaskRulesetResponse updateTaskRuleset(UpdateTaskRulesetRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsCheckMeta.updateTaskRuleset);
    }

    /**
     * 修改任务规则集
     *
     * 修改任务规则集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTaskRulesetRequest 请求对象
     * @return SyncInvoker<UpdateTaskRulesetRequest, UpdateTaskRulesetResponse>
     */
    public SyncInvoker<UpdateTaskRulesetRequest, UpdateTaskRulesetResponse> updateTaskRulesetInvoker(
        UpdateTaskRulesetRequest request) {
        return new SyncInvoker<>(request, CodeArtsCheckMeta.updateTaskRuleset, hcClient);
    }

    /**
     * 任务配置高级选项
     *
     * 任务配置高级选项，如自定义镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTaskSettingsRequest 请求对象
     * @return UpdateTaskSettingsResponse
     */
    public UpdateTaskSettingsResponse updateTaskSettings(UpdateTaskSettingsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsCheckMeta.updateTaskSettings);
    }

    /**
     * 任务配置高级选项
     *
     * 任务配置高级选项，如自定义镜像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTaskSettingsRequest 请求对象
     * @return SyncInvoker<UpdateTaskSettingsRequest, UpdateTaskSettingsResponse>
     */
    public SyncInvoker<UpdateTaskSettingsRequest, UpdateTaskSettingsResponse> updateTaskSettingsInvoker(
        UpdateTaskSettingsRequest request) {
        return new SyncInvoker<>(request, CodeArtsCheckMeta.updateTaskSettings, hcClient);
    }

}

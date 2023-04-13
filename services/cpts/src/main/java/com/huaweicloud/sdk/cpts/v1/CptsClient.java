package com.huaweicloud.sdk.cpts.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.cpts.v1.model.*;

public class CptsClient {

    protected HcClient hcClient;

    public CptsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CptsClient> newBuilder() {
        return new ClientBuilder<>(CptsClient::new);
    }

    /**
     * 创建用例
     *
     * 创建用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCaseRequest 请求对象
     * @return CreateCaseResponse
     */
    public CreateCaseResponse createCase(CreateCaseRequest request) {
        return hcClient.syncInvokeHttp(request, CptsMeta.createCase);
    }

    /**
     * 创建用例
     *
     * 创建用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCaseRequest 请求对象
     * @return SyncInvoker<CreateCaseRequest, CreateCaseResponse>
     */
    public SyncInvoker<CreateCaseRequest, CreateCaseResponse> createCaseInvoker(CreateCaseRequest request) {
        return new SyncInvoker<CreateCaseRequest, CreateCaseResponse>(request, CptsMeta.createCase, hcClient);
    }

    /**
     * 创建任务
     *
     * 创建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTaskRequest 请求对象
     * @return CreateTaskResponse
     */
    public CreateTaskResponse createTask(CreateTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CptsMeta.createTask);
    }

    /**
     * 创建任务
     *
     * 创建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTaskRequest 请求对象
     * @return SyncInvoker<CreateTaskRequest, CreateTaskResponse>
     */
    public SyncInvoker<CreateTaskRequest, CreateTaskResponse> createTaskInvoker(CreateTaskRequest request) {
        return new SyncInvoker<CreateTaskRequest, CreateTaskResponse>(request, CptsMeta.createTask, hcClient);
    }

    /**
     * 创建事务
     *
     * 创建事务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTempRequest 请求对象
     * @return CreateTempResponse
     */
    public CreateTempResponse createTemp(CreateTempRequest request) {
        return hcClient.syncInvokeHttp(request, CptsMeta.createTemp);
    }

    /**
     * 创建事务
     *
     * 创建事务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTempRequest 请求对象
     * @return SyncInvoker<CreateTempRequest, CreateTempResponse>
     */
    public SyncInvoker<CreateTempRequest, CreateTempResponse> createTempInvoker(CreateTempRequest request) {
        return new SyncInvoker<CreateTempRequest, CreateTempResponse>(request, CptsMeta.createTemp, hcClient);
    }

    /**
     * 创建变量
     *
     * 创建变量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVariableRequest 请求对象
     * @return CreateVariableResponse
     */
    public CreateVariableResponse createVariable(CreateVariableRequest request) {
        return hcClient.syncInvokeHttp(request, CptsMeta.createVariable);
    }

    /**
     * 创建变量
     *
     * 创建变量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVariableRequest 请求对象
     * @return SyncInvoker<CreateVariableRequest, CreateVariableResponse>
     */
    public SyncInvoker<CreateVariableRequest, CreateVariableResponse> createVariableInvoker(
        CreateVariableRequest request) {
        return new SyncInvoker<CreateVariableRequest, CreateVariableResponse>(request, CptsMeta.createVariable,
            hcClient);
    }

    /**
     * 调试用例
     *
     * 调试用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DebugCaseRequest 请求对象
     * @return DebugCaseResponse
     */
    public DebugCaseResponse debugCase(DebugCaseRequest request) {
        return hcClient.syncInvokeHttp(request, CptsMeta.debugCase);
    }

    /**
     * 调试用例
     *
     * 调试用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DebugCaseRequest 请求对象
     * @return SyncInvoker<DebugCaseRequest, DebugCaseResponse>
     */
    public SyncInvoker<DebugCaseRequest, DebugCaseResponse> debugCaseInvoker(DebugCaseRequest request) {
        return new SyncInvoker<DebugCaseRequest, DebugCaseResponse>(request, CptsMeta.debugCase, hcClient);
    }

    /**
     * 删除用例
     *
     * 删除用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCaseRequest 请求对象
     * @return DeleteCaseResponse
     */
    public DeleteCaseResponse deleteCase(DeleteCaseRequest request) {
        return hcClient.syncInvokeHttp(request, CptsMeta.deleteCase);
    }

    /**
     * 删除用例
     *
     * 删除用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCaseRequest 请求对象
     * @return SyncInvoker<DeleteCaseRequest, DeleteCaseResponse>
     */
    public SyncInvoker<DeleteCaseRequest, DeleteCaseResponse> deleteCaseInvoker(DeleteCaseRequest request) {
        return new SyncInvoker<DeleteCaseRequest, DeleteCaseResponse>(request, CptsMeta.deleteCase, hcClient);
    }

    /**
     * 删除任务
     *
     * 删除任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTaskRequest 请求对象
     * @return DeleteTaskResponse
     */
    public DeleteTaskResponse deleteTask(DeleteTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CptsMeta.deleteTask);
    }

    /**
     * 删除任务
     *
     * 删除任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTaskRequest 请求对象
     * @return SyncInvoker<DeleteTaskRequest, DeleteTaskResponse>
     */
    public SyncInvoker<DeleteTaskRequest, DeleteTaskResponse> deleteTaskInvoker(DeleteTaskRequest request) {
        return new SyncInvoker<DeleteTaskRequest, DeleteTaskResponse>(request, CptsMeta.deleteTask, hcClient);
    }

    /**
     * 删除事务
     *
     * 删除事务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTempRequest 请求对象
     * @return DeleteTempResponse
     */
    public DeleteTempResponse deleteTemp(DeleteTempRequest request) {
        return hcClient.syncInvokeHttp(request, CptsMeta.deleteTemp);
    }

    /**
     * 删除事务
     *
     * 删除事务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTempRequest 请求对象
     * @return SyncInvoker<DeleteTempRequest, DeleteTempResponse>
     */
    public SyncInvoker<DeleteTempRequest, DeleteTempResponse> deleteTempInvoker(DeleteTempRequest request) {
        return new SyncInvoker<DeleteTempRequest, DeleteTempResponse>(request, CptsMeta.deleteTemp, hcClient);
    }

    /**
     * 删除全局变量
     *
     * 删除全局变量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVariableRequest 请求对象
     * @return DeleteVariableResponse
     */
    public DeleteVariableResponse deleteVariable(DeleteVariableRequest request) {
        return hcClient.syncInvokeHttp(request, CptsMeta.deleteVariable);
    }

    /**
     * 删除全局变量
     *
     * 删除全局变量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVariableRequest 请求对象
     * @return SyncInvoker<DeleteVariableRequest, DeleteVariableResponse>
     */
    public SyncInvoker<DeleteVariableRequest, DeleteVariableResponse> deleteVariableInvoker(
        DeleteVariableRequest request) {
        return new SyncInvoker<DeleteVariableRequest, DeleteVariableResponse>(request, CptsMeta.deleteVariable,
            hcClient);
    }

    /**
     * 查询全局变量
     *
     * 查询全局变量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVariablesRequest 请求对象
     * @return ListVariablesResponse
     */
    public ListVariablesResponse listVariables(ListVariablesRequest request) {
        return hcClient.syncInvokeHttp(request, CptsMeta.listVariables);
    }

    /**
     * 查询全局变量
     *
     * 查询全局变量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVariablesRequest 请求对象
     * @return SyncInvoker<ListVariablesRequest, ListVariablesResponse>
     */
    public SyncInvoker<ListVariablesRequest, ListVariablesResponse> listVariablesInvoker(ListVariablesRequest request) {
        return new SyncInvoker<ListVariablesRequest, ListVariablesResponse>(request, CptsMeta.listVariables, hcClient);
    }

    /**
     * 全链路压测探针获取配置信息
     *
     * 全链路压测探针获取配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAgentConfigRequest 请求对象
     * @return ShowAgentConfigResponse
     */
    public ShowAgentConfigResponse showAgentConfig(ShowAgentConfigRequest request) {
        return hcClient.syncInvokeHttp(request, CptsMeta.showAgentConfig);
    }

    /**
     * 全链路压测探针获取配置信息
     *
     * 全链路压测探针获取配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAgentConfigRequest 请求对象
     * @return SyncInvoker<ShowAgentConfigRequest, ShowAgentConfigResponse>
     */
    public SyncInvoker<ShowAgentConfigRequest, ShowAgentConfigResponse> showAgentConfigInvoker(
        ShowAgentConfigRequest request) {
        return new SyncInvoker<ShowAgentConfigRequest, ShowAgentConfigResponse>(request, CptsMeta.showAgentConfig,
            hcClient);
    }

    /**
     * 查询CPTS任务离线报告列表
     *
     * 查询CPTS任务离线报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHistoryRunInfoRequest 请求对象
     * @return ShowHistoryRunInfoResponse
     */
    public ShowHistoryRunInfoResponse showHistoryRunInfo(ShowHistoryRunInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CptsMeta.showHistoryRunInfo);
    }

    /**
     * 查询CPTS任务离线报告列表
     *
     * 查询CPTS任务离线报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHistoryRunInfoRequest 请求对象
     * @return SyncInvoker<ShowHistoryRunInfoRequest, ShowHistoryRunInfoResponse>
     */
    public SyncInvoker<ShowHistoryRunInfoRequest, ShowHistoryRunInfoResponse> showHistoryRunInfoInvoker(
        ShowHistoryRunInfoRequest request) {
        return new SyncInvoker<ShowHistoryRunInfoRequest, ShowHistoryRunInfoResponse>(request,
            CptsMeta.showHistoryRunInfo, hcClient);
    }

    /**
     * 查询报告
     *
     * 查询报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReportRequest 请求对象
     * @return ShowReportResponse
     */
    public ShowReportResponse showReport(ShowReportRequest request) {
        return hcClient.syncInvokeHttp(request, CptsMeta.showReport);
    }

    /**
     * 查询报告
     *
     * 查询报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReportRequest 请求对象
     * @return SyncInvoker<ShowReportRequest, ShowReportResponse>
     */
    public SyncInvoker<ShowReportRequest, ShowReportResponse> showReportInvoker(ShowReportRequest request) {
        return new SyncInvoker<ShowReportRequest, ShowReportResponse>(request, CptsMeta.showReport, hcClient);
    }

    /**
     * 查询任务
     *
     * 查询任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskRequest 请求对象
     * @return ShowTaskResponse
     */
    public ShowTaskResponse showTask(ShowTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CptsMeta.showTask);
    }

    /**
     * 查询任务
     *
     * 查询任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskRequest 请求对象
     * @return SyncInvoker<ShowTaskRequest, ShowTaskResponse>
     */
    public SyncInvoker<ShowTaskRequest, ShowTaskResponse> showTaskInvoker(ShowTaskRequest request) {
        return new SyncInvoker<ShowTaskRequest, ShowTaskResponse>(request, CptsMeta.showTask, hcClient);
    }

    /**
     * 查询任务集
     *
     * 查询任务集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskSetRequest 请求对象
     * @return ShowTaskSetResponse
     */
    public ShowTaskSetResponse showTaskSet(ShowTaskSetRequest request) {
        return hcClient.syncInvokeHttp(request, CptsMeta.showTaskSet);
    }

    /**
     * 查询任务集
     *
     * 查询任务集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTaskSetRequest 请求对象
     * @return SyncInvoker<ShowTaskSetRequest, ShowTaskSetResponse>
     */
    public SyncInvoker<ShowTaskSetRequest, ShowTaskSetResponse> showTaskSetInvoker(ShowTaskSetRequest request) {
        return new SyncInvoker<ShowTaskSetRequest, ShowTaskSetResponse>(request, CptsMeta.showTaskSet, hcClient);
    }

    /**
     * 查询事务
     *
     * 查询事务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTempRequest 请求对象
     * @return ShowTempResponse
     */
    public ShowTempResponse showTemp(ShowTempRequest request) {
        return hcClient.syncInvokeHttp(request, CptsMeta.showTemp);
    }

    /**
     * 查询事务
     *
     * 查询事务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTempRequest 请求对象
     * @return SyncInvoker<ShowTempRequest, ShowTempResponse>
     */
    public SyncInvoker<ShowTempRequest, ShowTempResponse> showTempInvoker(ShowTempRequest request) {
        return new SyncInvoker<ShowTempRequest, ShowTempResponse>(request, CptsMeta.showTemp, hcClient);
    }

    /**
     * 查询事务集
     *
     * 查询事务集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTempSetRequest 请求对象
     * @return ShowTempSetResponse
     */
    public ShowTempSetResponse showTempSet(ShowTempSetRequest request) {
        return hcClient.syncInvokeHttp(request, CptsMeta.showTempSet);
    }

    /**
     * 查询事务集
     *
     * 查询事务集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTempSetRequest 请求对象
     * @return SyncInvoker<ShowTempSetRequest, ShowTempSetResponse>
     */
    public SyncInvoker<ShowTempSetRequest, ShowTempSetResponse> showTempSetInvoker(ShowTempSetRequest request) {
        return new SyncInvoker<ShowTempSetRequest, ShowTempSetResponse>(request, CptsMeta.showTempSet, hcClient);
    }

    /**
     * 全链路压测探针上报健康状态
     *
     * 全链路压测探针上报健康状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAgentHealthStatusRequest 请求对象
     * @return UpdateAgentHealthStatusResponse
     */
    public UpdateAgentHealthStatusResponse updateAgentHealthStatus(UpdateAgentHealthStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CptsMeta.updateAgentHealthStatus);
    }

    /**
     * 全链路压测探针上报健康状态
     *
     * 全链路压测探针上报健康状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAgentHealthStatusRequest 请求对象
     * @return SyncInvoker<UpdateAgentHealthStatusRequest, UpdateAgentHealthStatusResponse>
     */
    public SyncInvoker<UpdateAgentHealthStatusRequest, UpdateAgentHealthStatusResponse> updateAgentHealthStatusInvoker(
        UpdateAgentHealthStatusRequest request) {
        return new SyncInvoker<UpdateAgentHealthStatusRequest, UpdateAgentHealthStatusResponse>(request,
            CptsMeta.updateAgentHealthStatus, hcClient);
    }

    /**
     * 修改用例
     *
     * 修改用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCaseRequest 请求对象
     * @return UpdateCaseResponse
     */
    public UpdateCaseResponse updateCase(UpdateCaseRequest request) {
        return hcClient.syncInvokeHttp(request, CptsMeta.updateCase);
    }

    /**
     * 修改用例
     *
     * 修改用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCaseRequest 请求对象
     * @return SyncInvoker<UpdateCaseRequest, UpdateCaseResponse>
     */
    public SyncInvoker<UpdateCaseRequest, UpdateCaseResponse> updateCaseInvoker(UpdateCaseRequest request) {
        return new SyncInvoker<UpdateCaseRequest, UpdateCaseResponse>(request, CptsMeta.updateCase, hcClient);
    }

    /**
     * 修改任务
     *
     * 修改任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskRequest 请求对象
     * @return UpdateTaskResponse
     */
    public UpdateTaskResponse updateTask(UpdateTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CptsMeta.updateTask);
    }

    /**
     * 修改任务
     *
     * 修改任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskRequest 请求对象
     * @return SyncInvoker<UpdateTaskRequest, UpdateTaskResponse>
     */
    public SyncInvoker<UpdateTaskRequest, UpdateTaskResponse> updateTaskInvoker(UpdateTaskRequest request) {
        return new SyncInvoker<UpdateTaskRequest, UpdateTaskResponse>(request, CptsMeta.updateTask, hcClient);
    }

    /**
     * 修改任务关联用例
     *
     * 修改任务关联用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskRelatedTestCaseRequest 请求对象
     * @return UpdateTaskRelatedTestCaseResponse
     */
    public UpdateTaskRelatedTestCaseResponse updateTaskRelatedTestCase(UpdateTaskRelatedTestCaseRequest request) {
        return hcClient.syncInvokeHttp(request, CptsMeta.updateTaskRelatedTestCase);
    }

    /**
     * 修改任务关联用例
     *
     * 修改任务关联用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskRelatedTestCaseRequest 请求对象
     * @return SyncInvoker<UpdateTaskRelatedTestCaseRequest, UpdateTaskRelatedTestCaseResponse>
     */
    public SyncInvoker<UpdateTaskRelatedTestCaseRequest, UpdateTaskRelatedTestCaseResponse> updateTaskRelatedTestCaseInvoker(
        UpdateTaskRelatedTestCaseRequest request) {
        return new SyncInvoker<UpdateTaskRelatedTestCaseRequest, UpdateTaskRelatedTestCaseResponse>(request,
            CptsMeta.updateTaskRelatedTestCase, hcClient);
    }

    /**
     * 更新任务状态
     *
     * 更新任务状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskStatusRequest 请求对象
     * @return UpdateTaskStatusResponse
     */
    public UpdateTaskStatusResponse updateTaskStatus(UpdateTaskStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CptsMeta.updateTaskStatus);
    }

    /**
     * 更新任务状态
     *
     * 更新任务状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTaskStatusRequest 请求对象
     * @return SyncInvoker<UpdateTaskStatusRequest, UpdateTaskStatusResponse>
     */
    public SyncInvoker<UpdateTaskStatusRequest, UpdateTaskStatusResponse> updateTaskStatusInvoker(
        UpdateTaskStatusRequest request) {
        return new SyncInvoker<UpdateTaskStatusRequest, UpdateTaskStatusResponse>(request, CptsMeta.updateTaskStatus,
            hcClient);
    }

    /**
     * 修改事务
     *
     * 修改事务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTempRequest 请求对象
     * @return UpdateTempResponse
     */
    public UpdateTempResponse updateTemp(UpdateTempRequest request) {
        return hcClient.syncInvokeHttp(request, CptsMeta.updateTemp);
    }

    /**
     * 修改事务
     *
     * 修改事务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTempRequest 请求对象
     * @return SyncInvoker<UpdateTempRequest, UpdateTempResponse>
     */
    public SyncInvoker<UpdateTempRequest, UpdateTempResponse> updateTempInvoker(UpdateTempRequest request) {
        return new SyncInvoker<UpdateTempRequest, UpdateTempResponse>(request, CptsMeta.updateTemp, hcClient);
    }

    /**
     * 修改变量
     *
     * 修改变量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVariableRequest 请求对象
     * @return UpdateVariableResponse
     */
    public UpdateVariableResponse updateVariable(UpdateVariableRequest request) {
        return hcClient.syncInvokeHttp(request, CptsMeta.updateVariable);
    }

    /**
     * 修改变量
     *
     * 修改变量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVariableRequest 请求对象
     * @return SyncInvoker<UpdateVariableRequest, UpdateVariableResponse>
     */
    public SyncInvoker<UpdateVariableRequest, UpdateVariableResponse> updateVariableInvoker(
        UpdateVariableRequest request) {
        return new SyncInvoker<UpdateVariableRequest, UpdateVariableResponse>(request, CptsMeta.updateVariable,
            hcClient);
    }

    /**
     * 创建工程
     *
     * 创建工程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateProjectRequest 请求对象
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProject(CreateProjectRequest request) {
        return hcClient.syncInvokeHttp(request, CptsMeta.createProject);
    }

    /**
     * 创建工程
     *
     * 创建工程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateProjectRequest 请求对象
     * @return SyncInvoker<CreateProjectRequest, CreateProjectResponse>
     */
    public SyncInvoker<CreateProjectRequest, CreateProjectResponse> createProjectInvoker(CreateProjectRequest request) {
        return new SyncInvoker<CreateProjectRequest, CreateProjectResponse>(request, CptsMeta.createProject, hcClient);
    }

    /**
     * 删除工程
     *
     * 删除工程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteProjectRequest 请求对象
     * @return DeleteProjectResponse
     */
    public DeleteProjectResponse deleteProject(DeleteProjectRequest request) {
        return hcClient.syncInvokeHttp(request, CptsMeta.deleteProject);
    }

    /**
     * 删除工程
     *
     * 删除工程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteProjectRequest 请求对象
     * @return SyncInvoker<DeleteProjectRequest, DeleteProjectResponse>
     */
    public SyncInvoker<DeleteProjectRequest, DeleteProjectResponse> deleteProjectInvoker(DeleteProjectRequest request) {
        return new SyncInvoker<DeleteProjectRequest, DeleteProjectResponse>(request, CptsMeta.deleteProject, hcClient);
    }

    /**
     * 查询工程集
     *
     * 查询工程集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectSetsRequest 请求对象
     * @return ListProjectSetsResponse
     */
    public ListProjectSetsResponse listProjectSets(ListProjectSetsRequest request) {
        return hcClient.syncInvokeHttp(request, CptsMeta.listProjectSets);
    }

    /**
     * 查询工程集
     *
     * 查询工程集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectSetsRequest 请求对象
     * @return SyncInvoker<ListProjectSetsRequest, ListProjectSetsResponse>
     */
    public SyncInvoker<ListProjectSetsRequest, ListProjectSetsResponse> listProjectSetsInvoker(
        ListProjectSetsRequest request) {
        return new SyncInvoker<ListProjectSetsRequest, ListProjectSetsResponse>(request, CptsMeta.listProjectSets,
            hcClient);
    }

    /**
     * 查询用例树
     *
     * 查询用例树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectTestCaseRequest 请求对象
     * @return ListProjectTestCaseResponse
     */
    public ListProjectTestCaseResponse listProjectTestCase(ListProjectTestCaseRequest request) {
        return hcClient.syncInvokeHttp(request, CptsMeta.listProjectTestCase);
    }

    /**
     * 查询用例树
     *
     * 查询用例树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectTestCaseRequest 请求对象
     * @return SyncInvoker<ListProjectTestCaseRequest, ListProjectTestCaseResponse>
     */
    public SyncInvoker<ListProjectTestCaseRequest, ListProjectTestCaseResponse> listProjectTestCaseInvoker(
        ListProjectTestCaseRequest request) {
        return new SyncInvoker<ListProjectTestCaseRequest, ListProjectTestCaseResponse>(request,
            CptsMeta.listProjectTestCase, hcClient);
    }

    /**
     * 查询导入进度
     *
     * 查询导入进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProcessRequest 请求对象
     * @return ShowProcessResponse
     */
    public ShowProcessResponse showProcess(ShowProcessRequest request) {
        return hcClient.syncInvokeHttp(request, CptsMeta.showProcess);
    }

    /**
     * 查询导入进度
     *
     * 查询导入进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProcessRequest 请求对象
     * @return SyncInvoker<ShowProcessRequest, ShowProcessResponse>
     */
    public SyncInvoker<ShowProcessRequest, ShowProcessResponse> showProcessInvoker(ShowProcessRequest request) {
        return new SyncInvoker<ShowProcessRequest, ShowProcessResponse>(request, CptsMeta.showProcess, hcClient);
    }

    /**
     * 查询工程
     *
     * 查询工程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectRequest 请求对象
     * @return ShowProjectResponse
     */
    public ShowProjectResponse showProject(ShowProjectRequest request) {
        return hcClient.syncInvokeHttp(request, CptsMeta.showProject);
    }

    /**
     * 查询工程
     *
     * 查询工程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectRequest 请求对象
     * @return SyncInvoker<ShowProjectRequest, ShowProjectResponse>
     */
    public SyncInvoker<ShowProjectRequest, ShowProjectResponse> showProjectInvoker(ShowProjectRequest request) {
        return new SyncInvoker<ShowProjectRequest, ShowProjectResponse>(request, CptsMeta.showProject, hcClient);
    }

    /**
     * 修改工程
     *
     * 修改工程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProjectRequest 请求对象
     * @return UpdateProjectResponse
     */
    public UpdateProjectResponse updateProject(UpdateProjectRequest request) {
        return hcClient.syncInvokeHttp(request, CptsMeta.updateProject);
    }

    /**
     * 修改工程
     *
     * 修改工程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateProjectRequest 请求对象
     * @return SyncInvoker<UpdateProjectRequest, UpdateProjectResponse>
     */
    public SyncInvoker<UpdateProjectRequest, UpdateProjectResponse> updateProjectInvoker(UpdateProjectRequest request) {
        return new SyncInvoker<UpdateProjectRequest, UpdateProjectResponse>(request, CptsMeta.updateProject, hcClient);
    }

}

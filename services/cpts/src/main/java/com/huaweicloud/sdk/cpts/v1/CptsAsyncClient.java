package com.huaweicloud.sdk.cpts.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.cpts.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class CptsAsyncClient {

    protected HcClient hcClient;

    public CptsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CptsAsyncClient> newBuilder() {
        return new ClientBuilder<>(CptsAsyncClient::new);
    }

    /** 创建用例 创建用例
     *
     * @param CreateCaseRequest 请求对象
     * @return CompletableFuture<CreateCaseResponse> */
    public CompletableFuture<CreateCaseResponse> createCaseAsync(CreateCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.createCase);
    }

    /** 创建用例 创建用例
     *
     * @param CreateCaseRequest 请求对象
     * @return AsyncInvoker<CreateCaseRequest, CreateCaseResponse> */
    public AsyncInvoker<CreateCaseRequest, CreateCaseResponse> createCaseAsyncInvoker(CreateCaseRequest request) {
        return new AsyncInvoker<CreateCaseRequest, CreateCaseResponse>(request, CptsMeta.createCase, hcClient);
    }

    /** 创建任务 创建任务
     *
     * @param CreateTaskRequest 请求对象
     * @return CompletableFuture<CreateTaskResponse> */
    public CompletableFuture<CreateTaskResponse> createTaskAsync(CreateTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.createTask);
    }

    /** 创建任务 创建任务
     *
     * @param CreateTaskRequest 请求对象
     * @return AsyncInvoker<CreateTaskRequest, CreateTaskResponse> */
    public AsyncInvoker<CreateTaskRequest, CreateTaskResponse> createTaskAsyncInvoker(CreateTaskRequest request) {
        return new AsyncInvoker<CreateTaskRequest, CreateTaskResponse>(request, CptsMeta.createTask, hcClient);
    }

    /** 创建事务 创建事务
     *
     * @param CreateTempRequest 请求对象
     * @return CompletableFuture<CreateTempResponse> */
    public CompletableFuture<CreateTempResponse> createTempAsync(CreateTempRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.createTemp);
    }

    /** 创建事务 创建事务
     *
     * @param CreateTempRequest 请求对象
     * @return AsyncInvoker<CreateTempRequest, CreateTempResponse> */
    public AsyncInvoker<CreateTempRequest, CreateTempResponse> createTempAsyncInvoker(CreateTempRequest request) {
        return new AsyncInvoker<CreateTempRequest, CreateTempResponse>(request, CptsMeta.createTemp, hcClient);
    }

    /** 创建变量 创建变量
     *
     * @param CreateVariableRequest 请求对象
     * @return CompletableFuture<CreateVariableResponse> */
    public CompletableFuture<CreateVariableResponse> createVariableAsync(CreateVariableRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.createVariable);
    }

    /** 创建变量 创建变量
     *
     * @param CreateVariableRequest 请求对象
     * @return AsyncInvoker<CreateVariableRequest, CreateVariableResponse> */
    public AsyncInvoker<CreateVariableRequest, CreateVariableResponse> createVariableAsyncInvoker(
        CreateVariableRequest request) {
        return new AsyncInvoker<CreateVariableRequest, CreateVariableResponse>(request, CptsMeta.createVariable,
            hcClient);
    }

    /** 调试用例 调试用例
     *
     * @param DebugCaseRequest 请求对象
     * @return CompletableFuture<DebugCaseResponse> */
    public CompletableFuture<DebugCaseResponse> debugCaseAsync(DebugCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.debugCase);
    }

    /** 调试用例 调试用例
     *
     * @param DebugCaseRequest 请求对象
     * @return AsyncInvoker<DebugCaseRequest, DebugCaseResponse> */
    public AsyncInvoker<DebugCaseRequest, DebugCaseResponse> debugCaseAsyncInvoker(DebugCaseRequest request) {
        return new AsyncInvoker<DebugCaseRequest, DebugCaseResponse>(request, CptsMeta.debugCase, hcClient);
    }

    /** 删除用例 删除用例
     *
     * @param DeleteCaseRequest 请求对象
     * @return CompletableFuture<DeleteCaseResponse> */
    public CompletableFuture<DeleteCaseResponse> deleteCaseAsync(DeleteCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.deleteCase);
    }

    /** 删除用例 删除用例
     *
     * @param DeleteCaseRequest 请求对象
     * @return AsyncInvoker<DeleteCaseRequest, DeleteCaseResponse> */
    public AsyncInvoker<DeleteCaseRequest, DeleteCaseResponse> deleteCaseAsyncInvoker(DeleteCaseRequest request) {
        return new AsyncInvoker<DeleteCaseRequest, DeleteCaseResponse>(request, CptsMeta.deleteCase, hcClient);
    }

    /** 删除任务 删除任务
     *
     * @param DeleteTaskRequest 请求对象
     * @return CompletableFuture<DeleteTaskResponse> */
    public CompletableFuture<DeleteTaskResponse> deleteTaskAsync(DeleteTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.deleteTask);
    }

    /** 删除任务 删除任务
     *
     * @param DeleteTaskRequest 请求对象
     * @return AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse> */
    public AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse> deleteTaskAsyncInvoker(DeleteTaskRequest request) {
        return new AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse>(request, CptsMeta.deleteTask, hcClient);
    }

    /** 删除事务 删除事务
     *
     * @param DeleteTempRequest 请求对象
     * @return CompletableFuture<DeleteTempResponse> */
    public CompletableFuture<DeleteTempResponse> deleteTempAsync(DeleteTempRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.deleteTemp);
    }

    /** 删除事务 删除事务
     *
     * @param DeleteTempRequest 请求对象
     * @return AsyncInvoker<DeleteTempRequest, DeleteTempResponse> */
    public AsyncInvoker<DeleteTempRequest, DeleteTempResponse> deleteTempAsyncInvoker(DeleteTempRequest request) {
        return new AsyncInvoker<DeleteTempRequest, DeleteTempResponse>(request, CptsMeta.deleteTemp, hcClient);
    }

    /** 查询全局变量 查询全局变量
     *
     * @param ListVariablesRequest 请求对象
     * @return CompletableFuture<ListVariablesResponse> */
    public CompletableFuture<ListVariablesResponse> listVariablesAsync(ListVariablesRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.listVariables);
    }

    /** 查询全局变量 查询全局变量
     *
     * @param ListVariablesRequest 请求对象
     * @return AsyncInvoker<ListVariablesRequest, ListVariablesResponse> */
    public AsyncInvoker<ListVariablesRequest, ListVariablesResponse> listVariablesAsyncInvoker(
        ListVariablesRequest request) {
        return new AsyncInvoker<ListVariablesRequest, ListVariablesResponse>(request, CptsMeta.listVariables, hcClient);
    }

    /** 查询CPTS任务离线报告列表 查询CPTS任务离线报告列表
     *
     * @param ShowHistoryRunInfoRequest 请求对象
     * @return CompletableFuture<ShowHistoryRunInfoResponse> */
    public CompletableFuture<ShowHistoryRunInfoResponse> showHistoryRunInfoAsync(ShowHistoryRunInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.showHistoryRunInfo);
    }

    /** 查询CPTS任务离线报告列表 查询CPTS任务离线报告列表
     *
     * @param ShowHistoryRunInfoRequest 请求对象
     * @return AsyncInvoker<ShowHistoryRunInfoRequest, ShowHistoryRunInfoResponse> */
    public AsyncInvoker<ShowHistoryRunInfoRequest, ShowHistoryRunInfoResponse> showHistoryRunInfoAsyncInvoker(
        ShowHistoryRunInfoRequest request) {
        return new AsyncInvoker<ShowHistoryRunInfoRequest, ShowHistoryRunInfoResponse>(request,
            CptsMeta.showHistoryRunInfo, hcClient);
    }

    /** 查询报告 查询报告
     *
     * @param ShowReportRequest 请求对象
     * @return CompletableFuture<ShowReportResponse> */
    public CompletableFuture<ShowReportResponse> showReportAsync(ShowReportRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.showReport);
    }

    /** 查询报告 查询报告
     *
     * @param ShowReportRequest 请求对象
     * @return AsyncInvoker<ShowReportRequest, ShowReportResponse> */
    public AsyncInvoker<ShowReportRequest, ShowReportResponse> showReportAsyncInvoker(ShowReportRequest request) {
        return new AsyncInvoker<ShowReportRequest, ShowReportResponse>(request, CptsMeta.showReport, hcClient);
    }

    /** 查询任务 查询任务
     *
     * @param ShowTaskRequest 请求对象
     * @return CompletableFuture<ShowTaskResponse> */
    public CompletableFuture<ShowTaskResponse> showTaskAsync(ShowTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.showTask);
    }

    /** 查询任务 查询任务
     *
     * @param ShowTaskRequest 请求对象
     * @return AsyncInvoker<ShowTaskRequest, ShowTaskResponse> */
    public AsyncInvoker<ShowTaskRequest, ShowTaskResponse> showTaskAsyncInvoker(ShowTaskRequest request) {
        return new AsyncInvoker<ShowTaskRequest, ShowTaskResponse>(request, CptsMeta.showTask, hcClient);
    }

    /** 查询任务集 查询任务集
     *
     * @param ShowTaskSetRequest 请求对象
     * @return CompletableFuture<ShowTaskSetResponse> */
    public CompletableFuture<ShowTaskSetResponse> showTaskSetAsync(ShowTaskSetRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.showTaskSet);
    }

    /** 查询任务集 查询任务集
     *
     * @param ShowTaskSetRequest 请求对象
     * @return AsyncInvoker<ShowTaskSetRequest, ShowTaskSetResponse> */
    public AsyncInvoker<ShowTaskSetRequest, ShowTaskSetResponse> showTaskSetAsyncInvoker(ShowTaskSetRequest request) {
        return new AsyncInvoker<ShowTaskSetRequest, ShowTaskSetResponse>(request, CptsMeta.showTaskSet, hcClient);
    }

    /** 查询事务 查询事务
     *
     * @param ShowTempRequest 请求对象
     * @return CompletableFuture<ShowTempResponse> */
    public CompletableFuture<ShowTempResponse> showTempAsync(ShowTempRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.showTemp);
    }

    /** 查询事务 查询事务
     *
     * @param ShowTempRequest 请求对象
     * @return AsyncInvoker<ShowTempRequest, ShowTempResponse> */
    public AsyncInvoker<ShowTempRequest, ShowTempResponse> showTempAsyncInvoker(ShowTempRequest request) {
        return new AsyncInvoker<ShowTempRequest, ShowTempResponse>(request, CptsMeta.showTemp, hcClient);
    }

    /** 查询事务集 查询事务集
     *
     * @param ShowTempSetRequest 请求对象
     * @return CompletableFuture<ShowTempSetResponse> */
    public CompletableFuture<ShowTempSetResponse> showTempSetAsync(ShowTempSetRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.showTempSet);
    }

    /** 查询事务集 查询事务集
     *
     * @param ShowTempSetRequest 请求对象
     * @return AsyncInvoker<ShowTempSetRequest, ShowTempSetResponse> */
    public AsyncInvoker<ShowTempSetRequest, ShowTempSetResponse> showTempSetAsyncInvoker(ShowTempSetRequest request) {
        return new AsyncInvoker<ShowTempSetRequest, ShowTempSetResponse>(request, CptsMeta.showTempSet, hcClient);
    }

    /** 修改用例 修改用例
     *
     * @param UpdateCaseRequest 请求对象
     * @return CompletableFuture<UpdateCaseResponse> */
    public CompletableFuture<UpdateCaseResponse> updateCaseAsync(UpdateCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.updateCase);
    }

    /** 修改用例 修改用例
     *
     * @param UpdateCaseRequest 请求对象
     * @return AsyncInvoker<UpdateCaseRequest, UpdateCaseResponse> */
    public AsyncInvoker<UpdateCaseRequest, UpdateCaseResponse> updateCaseAsyncInvoker(UpdateCaseRequest request) {
        return new AsyncInvoker<UpdateCaseRequest, UpdateCaseResponse>(request, CptsMeta.updateCase, hcClient);
    }

    /** 修改任务 修改任务
     *
     * @param UpdateTaskRequest 请求对象
     * @return CompletableFuture<UpdateTaskResponse> */
    public CompletableFuture<UpdateTaskResponse> updateTaskAsync(UpdateTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.updateTask);
    }

    /** 修改任务 修改任务
     *
     * @param UpdateTaskRequest 请求对象
     * @return AsyncInvoker<UpdateTaskRequest, UpdateTaskResponse> */
    public AsyncInvoker<UpdateTaskRequest, UpdateTaskResponse> updateTaskAsyncInvoker(UpdateTaskRequest request) {
        return new AsyncInvoker<UpdateTaskRequest, UpdateTaskResponse>(request, CptsMeta.updateTask, hcClient);
    }

    /** 更新任务状态 更新任务状态
     *
     * @param UpdateTaskStatusRequest 请求对象
     * @return CompletableFuture<UpdateTaskStatusResponse> */
    public CompletableFuture<UpdateTaskStatusResponse> updateTaskStatusAsync(UpdateTaskStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.updateTaskStatus);
    }

    /** 更新任务状态 更新任务状态
     *
     * @param UpdateTaskStatusRequest 请求对象
     * @return AsyncInvoker<UpdateTaskStatusRequest, UpdateTaskStatusResponse> */
    public AsyncInvoker<UpdateTaskStatusRequest, UpdateTaskStatusResponse> updateTaskStatusAsyncInvoker(
        UpdateTaskStatusRequest request) {
        return new AsyncInvoker<UpdateTaskStatusRequest, UpdateTaskStatusResponse>(request, CptsMeta.updateTaskStatus,
            hcClient);
    }

    /** 修改事务 修改事务
     *
     * @param UpdateTempRequest 请求对象
     * @return CompletableFuture<UpdateTempResponse> */
    public CompletableFuture<UpdateTempResponse> updateTempAsync(UpdateTempRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.updateTemp);
    }

    /** 修改事务 修改事务
     *
     * @param UpdateTempRequest 请求对象
     * @return AsyncInvoker<UpdateTempRequest, UpdateTempResponse> */
    public AsyncInvoker<UpdateTempRequest, UpdateTempResponse> updateTempAsyncInvoker(UpdateTempRequest request) {
        return new AsyncInvoker<UpdateTempRequest, UpdateTempResponse>(request, CptsMeta.updateTemp, hcClient);
    }

    /** 修改变量 修改变量
     *
     * @param UpdateVariableRequest 请求对象
     * @return CompletableFuture<UpdateVariableResponse> */
    public CompletableFuture<UpdateVariableResponse> updateVariableAsync(UpdateVariableRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.updateVariable);
    }

    /** 修改变量 修改变量
     *
     * @param UpdateVariableRequest 请求对象
     * @return AsyncInvoker<UpdateVariableRequest, UpdateVariableResponse> */
    public AsyncInvoker<UpdateVariableRequest, UpdateVariableResponse> updateVariableAsyncInvoker(
        UpdateVariableRequest request) {
        return new AsyncInvoker<UpdateVariableRequest, UpdateVariableResponse>(request, CptsMeta.updateVariable,
            hcClient);
    }

    /** 创建工程 创建工程
     *
     * @param CreateProjectRequest 请求对象
     * @return CompletableFuture<CreateProjectResponse> */
    public CompletableFuture<CreateProjectResponse> createProjectAsync(CreateProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.createProject);
    }

    /** 创建工程 创建工程
     *
     * @param CreateProjectRequest 请求对象
     * @return AsyncInvoker<CreateProjectRequest, CreateProjectResponse> */
    public AsyncInvoker<CreateProjectRequest, CreateProjectResponse> createProjectAsyncInvoker(
        CreateProjectRequest request) {
        return new AsyncInvoker<CreateProjectRequest, CreateProjectResponse>(request, CptsMeta.createProject, hcClient);
    }

    /** 删除工程 删除工程
     *
     * @param DeleteProjectRequest 请求对象
     * @return CompletableFuture<DeleteProjectResponse> */
    public CompletableFuture<DeleteProjectResponse> deleteProjectAsync(DeleteProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.deleteProject);
    }

    /** 删除工程 删除工程
     *
     * @param DeleteProjectRequest 请求对象
     * @return AsyncInvoker<DeleteProjectRequest, DeleteProjectResponse> */
    public AsyncInvoker<DeleteProjectRequest, DeleteProjectResponse> deleteProjectAsyncInvoker(
        DeleteProjectRequest request) {
        return new AsyncInvoker<DeleteProjectRequest, DeleteProjectResponse>(request, CptsMeta.deleteProject, hcClient);
    }

    /** 查询工程集 查询工程集
     *
     * @param ListProjectSetsRequest 请求对象
     * @return CompletableFuture<ListProjectSetsResponse> */
    public CompletableFuture<ListProjectSetsResponse> listProjectSetsAsync(ListProjectSetsRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.listProjectSets);
    }

    /** 查询工程集 查询工程集
     *
     * @param ListProjectSetsRequest 请求对象
     * @return AsyncInvoker<ListProjectSetsRequest, ListProjectSetsResponse> */
    public AsyncInvoker<ListProjectSetsRequest, ListProjectSetsResponse> listProjectSetsAsyncInvoker(
        ListProjectSetsRequest request) {
        return new AsyncInvoker<ListProjectSetsRequest, ListProjectSetsResponse>(request, CptsMeta.listProjectSets,
            hcClient);
    }

    /** 查询导入进度 查询导入进度
     *
     * @param ShowProcessRequest 请求对象
     * @return CompletableFuture<ShowProcessResponse> */
    public CompletableFuture<ShowProcessResponse> showProcessAsync(ShowProcessRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.showProcess);
    }

    /** 查询导入进度 查询导入进度
     *
     * @param ShowProcessRequest 请求对象
     * @return AsyncInvoker<ShowProcessRequest, ShowProcessResponse> */
    public AsyncInvoker<ShowProcessRequest, ShowProcessResponse> showProcessAsyncInvoker(ShowProcessRequest request) {
        return new AsyncInvoker<ShowProcessRequest, ShowProcessResponse>(request, CptsMeta.showProcess, hcClient);
    }

    /** 查询工程 查询工程
     *
     * @param ShowProjectRequest 请求对象
     * @return CompletableFuture<ShowProjectResponse> */
    public CompletableFuture<ShowProjectResponse> showProjectAsync(ShowProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.showProject);
    }

    /** 查询工程 查询工程
     *
     * @param ShowProjectRequest 请求对象
     * @return AsyncInvoker<ShowProjectRequest, ShowProjectResponse> */
    public AsyncInvoker<ShowProjectRequest, ShowProjectResponse> showProjectAsyncInvoker(ShowProjectRequest request) {
        return new AsyncInvoker<ShowProjectRequest, ShowProjectResponse>(request, CptsMeta.showProject, hcClient);
    }

    /** 修改工程 修改工程
     *
     * @param UpdateProjectRequest 请求对象
     * @return CompletableFuture<UpdateProjectResponse> */
    public CompletableFuture<UpdateProjectResponse> updateProjectAsync(UpdateProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.updateProject);
    }

    /** 修改工程 修改工程
     *
     * @param UpdateProjectRequest 请求对象
     * @return AsyncInvoker<UpdateProjectRequest, UpdateProjectResponse> */
    public AsyncInvoker<UpdateProjectRequest, UpdateProjectResponse> updateProjectAsyncInvoker(
        UpdateProjectRequest request) {
        return new AsyncInvoker<UpdateProjectRequest, UpdateProjectResponse>(request, CptsMeta.updateProject, hcClient);
    }

}

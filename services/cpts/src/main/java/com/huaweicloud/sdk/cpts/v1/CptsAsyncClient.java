package com.huaweicloud.sdk.cpts.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.cpts.v1.model.BatchUpdateTaskStatusRequest;
import com.huaweicloud.sdk.cpts.v1.model.BatchUpdateTaskStatusResponse;
import com.huaweicloud.sdk.cpts.v1.model.CreateCaseRequest;
import com.huaweicloud.sdk.cpts.v1.model.CreateCaseResponse;
import com.huaweicloud.sdk.cpts.v1.model.CreateDirectoryRequest;
import com.huaweicloud.sdk.cpts.v1.model.CreateDirectoryResponse;
import com.huaweicloud.sdk.cpts.v1.model.CreateNewCaseRequest;
import com.huaweicloud.sdk.cpts.v1.model.CreateNewCaseResponse;
import com.huaweicloud.sdk.cpts.v1.model.CreateNewTaskRequest;
import com.huaweicloud.sdk.cpts.v1.model.CreateNewTaskResponse;
import com.huaweicloud.sdk.cpts.v1.model.CreateProjectRequest;
import com.huaweicloud.sdk.cpts.v1.model.CreateProjectResponse;
import com.huaweicloud.sdk.cpts.v1.model.CreateTaskRequest;
import com.huaweicloud.sdk.cpts.v1.model.CreateTaskResponse;
import com.huaweicloud.sdk.cpts.v1.model.CreateTempRequest;
import com.huaweicloud.sdk.cpts.v1.model.CreateTempResponse;
import com.huaweicloud.sdk.cpts.v1.model.CreateVariableRequest;
import com.huaweicloud.sdk.cpts.v1.model.CreateVariableResponse;
import com.huaweicloud.sdk.cpts.v1.model.DebugCaseRequest;
import com.huaweicloud.sdk.cpts.v1.model.DebugCaseResponse;
import com.huaweicloud.sdk.cpts.v1.model.DeleteCaseRequest;
import com.huaweicloud.sdk.cpts.v1.model.DeleteCaseResponse;
import com.huaweicloud.sdk.cpts.v1.model.DeleteDirectoryRequest;
import com.huaweicloud.sdk.cpts.v1.model.DeleteDirectoryResponse;
import com.huaweicloud.sdk.cpts.v1.model.DeleteNewCaseRequest;
import com.huaweicloud.sdk.cpts.v1.model.DeleteNewCaseResponse;
import com.huaweicloud.sdk.cpts.v1.model.DeleteNewTaskRequest;
import com.huaweicloud.sdk.cpts.v1.model.DeleteNewTaskResponse;
import com.huaweicloud.sdk.cpts.v1.model.DeleteProjectRequest;
import com.huaweicloud.sdk.cpts.v1.model.DeleteProjectResponse;
import com.huaweicloud.sdk.cpts.v1.model.DeleteTaskRequest;
import com.huaweicloud.sdk.cpts.v1.model.DeleteTaskResponse;
import com.huaweicloud.sdk.cpts.v1.model.DeleteTempRequest;
import com.huaweicloud.sdk.cpts.v1.model.DeleteTempResponse;
import com.huaweicloud.sdk.cpts.v1.model.DeleteVariableRequest;
import com.huaweicloud.sdk.cpts.v1.model.DeleteVariableResponse;
import com.huaweicloud.sdk.cpts.v1.model.ListProjectSetsRequest;
import com.huaweicloud.sdk.cpts.v1.model.ListProjectSetsResponse;
import com.huaweicloud.sdk.cpts.v1.model.ListProjectTestCaseRequest;
import com.huaweicloud.sdk.cpts.v1.model.ListProjectTestCaseResponse;
import com.huaweicloud.sdk.cpts.v1.model.ListTaskCasesRequest;
import com.huaweicloud.sdk.cpts.v1.model.ListTaskCasesResponse;
import com.huaweicloud.sdk.cpts.v1.model.ListVariablesRequest;
import com.huaweicloud.sdk.cpts.v1.model.ListVariablesResponse;
import com.huaweicloud.sdk.cpts.v1.model.ShowAgentConfigRequest;
import com.huaweicloud.sdk.cpts.v1.model.ShowAgentConfigResponse;
import com.huaweicloud.sdk.cpts.v1.model.ShowCaseRequest;
import com.huaweicloud.sdk.cpts.v1.model.ShowCaseResponse;
import com.huaweicloud.sdk.cpts.v1.model.ShowHistoryRunInfoRequest;
import com.huaweicloud.sdk.cpts.v1.model.ShowHistoryRunInfoResponse;
import com.huaweicloud.sdk.cpts.v1.model.ShowMergeCaseDetailRequest;
import com.huaweicloud.sdk.cpts.v1.model.ShowMergeCaseDetailResponse;
import com.huaweicloud.sdk.cpts.v1.model.ShowMergeReportLogsOutlineRequest;
import com.huaweicloud.sdk.cpts.v1.model.ShowMergeReportLogsOutlineResponse;
import com.huaweicloud.sdk.cpts.v1.model.ShowMergeTaskCaseRequest;
import com.huaweicloud.sdk.cpts.v1.model.ShowMergeTaskCaseResponse;
import com.huaweicloud.sdk.cpts.v1.model.ShowProcessRequest;
import com.huaweicloud.sdk.cpts.v1.model.ShowProcessResponse;
import com.huaweicloud.sdk.cpts.v1.model.ShowProjectRequest;
import com.huaweicloud.sdk.cpts.v1.model.ShowProjectResponse;
import com.huaweicloud.sdk.cpts.v1.model.ShowReportRequest;
import com.huaweicloud.sdk.cpts.v1.model.ShowReportResponse;
import com.huaweicloud.sdk.cpts.v1.model.ShowTaskCaseAwChartRequest;
import com.huaweicloud.sdk.cpts.v1.model.ShowTaskCaseAwChartResponse;
import com.huaweicloud.sdk.cpts.v1.model.ShowTaskRequest;
import com.huaweicloud.sdk.cpts.v1.model.ShowTaskResponse;
import com.huaweicloud.sdk.cpts.v1.model.ShowTaskSetRequest;
import com.huaweicloud.sdk.cpts.v1.model.ShowTaskSetResponse;
import com.huaweicloud.sdk.cpts.v1.model.ShowTempRequest;
import com.huaweicloud.sdk.cpts.v1.model.ShowTempResponse;
import com.huaweicloud.sdk.cpts.v1.model.ShowTempSetRequest;
import com.huaweicloud.sdk.cpts.v1.model.ShowTempSetResponse;
import com.huaweicloud.sdk.cpts.v1.model.UpdateAgentHealthStatusRequest;
import com.huaweicloud.sdk.cpts.v1.model.UpdateAgentHealthStatusResponse;
import com.huaweicloud.sdk.cpts.v1.model.UpdateCaseRequest;
import com.huaweicloud.sdk.cpts.v1.model.UpdateCaseResponse;
import com.huaweicloud.sdk.cpts.v1.model.UpdateDirectoryRequest;
import com.huaweicloud.sdk.cpts.v1.model.UpdateDirectoryResponse;
import com.huaweicloud.sdk.cpts.v1.model.UpdateNewCaseRequest;
import com.huaweicloud.sdk.cpts.v1.model.UpdateNewCaseResponse;
import com.huaweicloud.sdk.cpts.v1.model.UpdateProjectRequest;
import com.huaweicloud.sdk.cpts.v1.model.UpdateProjectResponse;
import com.huaweicloud.sdk.cpts.v1.model.UpdateTaskRelatedTestCaseRequest;
import com.huaweicloud.sdk.cpts.v1.model.UpdateTaskRelatedTestCaseResponse;
import com.huaweicloud.sdk.cpts.v1.model.UpdateTaskRequest;
import com.huaweicloud.sdk.cpts.v1.model.UpdateTaskResponse;
import com.huaweicloud.sdk.cpts.v1.model.UpdateTaskStatusRequest;
import com.huaweicloud.sdk.cpts.v1.model.UpdateTaskStatusResponse;
import com.huaweicloud.sdk.cpts.v1.model.UpdateTempRequest;
import com.huaweicloud.sdk.cpts.v1.model.UpdateTempResponse;
import com.huaweicloud.sdk.cpts.v1.model.UpdateVariableRequest;
import com.huaweicloud.sdk.cpts.v1.model.UpdateVariableResponse;

import java.util.concurrent.CompletableFuture;

public class CptsAsyncClient {

    protected HcClient hcClient;

    public CptsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CptsAsyncClient> newBuilder() {
        ClientBuilder<CptsAsyncClient> clientBuilder = new ClientBuilder<>(CptsAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 批量启停任务
     *
     * 批量启停任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateTaskStatusRequest 请求对象
     * @return CompletableFuture<BatchUpdateTaskStatusResponse>
     */
    public CompletableFuture<BatchUpdateTaskStatusResponse> batchUpdateTaskStatusAsync(
        BatchUpdateTaskStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.batchUpdateTaskStatus);
    }

    /**
     * 批量启停任务
     *
     * 批量启停任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateTaskStatusRequest 请求对象
     * @return AsyncInvoker<BatchUpdateTaskStatusRequest, BatchUpdateTaskStatusResponse>
     */
    public AsyncInvoker<BatchUpdateTaskStatusRequest, BatchUpdateTaskStatusResponse> batchUpdateTaskStatusAsyncInvoker(
        BatchUpdateTaskStatusRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.batchUpdateTaskStatus, hcClient);
    }

    /**
     * 创建用例（旧版）
     *
     * 创建用例（旧版）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCaseRequest 请求对象
     * @return CompletableFuture<CreateCaseResponse>
     */
    public CompletableFuture<CreateCaseResponse> createCaseAsync(CreateCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.createCase);
    }

    /**
     * 创建用例（旧版）
     *
     * 创建用例（旧版）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCaseRequest 请求对象
     * @return AsyncInvoker<CreateCaseRequest, CreateCaseResponse>
     */
    public AsyncInvoker<CreateCaseRequest, CreateCaseResponse> createCaseAsyncInvoker(CreateCaseRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.createCase, hcClient);
    }

    /**
     * 创建目录
     *
     * 创建目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDirectoryRequest 请求对象
     * @return CompletableFuture<CreateDirectoryResponse>
     */
    public CompletableFuture<CreateDirectoryResponse> createDirectoryAsync(CreateDirectoryRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.createDirectory);
    }

    /**
     * 创建目录
     *
     * 创建目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDirectoryRequest 请求对象
     * @return AsyncInvoker<CreateDirectoryRequest, CreateDirectoryResponse>
     */
    public AsyncInvoker<CreateDirectoryRequest, CreateDirectoryResponse> createDirectoryAsyncInvoker(
        CreateDirectoryRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.createDirectory, hcClient);
    }

    /**
     * 创建用例
     *
     * 创建用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNewCaseRequest 请求对象
     * @return CompletableFuture<CreateNewCaseResponse>
     */
    public CompletableFuture<CreateNewCaseResponse> createNewCaseAsync(CreateNewCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.createNewCase);
    }

    /**
     * 创建用例
     *
     * 创建用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNewCaseRequest 请求对象
     * @return AsyncInvoker<CreateNewCaseRequest, CreateNewCaseResponse>
     */
    public AsyncInvoker<CreateNewCaseRequest, CreateNewCaseResponse> createNewCaseAsyncInvoker(
        CreateNewCaseRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.createNewCase, hcClient);
    }

    /**
     * 创建任务
     *
     * 创建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNewTaskRequest 请求对象
     * @return CompletableFuture<CreateNewTaskResponse>
     */
    public CompletableFuture<CreateNewTaskResponse> createNewTaskAsync(CreateNewTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.createNewTask);
    }

    /**
     * 创建任务
     *
     * 创建任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNewTaskRequest 请求对象
     * @return AsyncInvoker<CreateNewTaskRequest, CreateNewTaskResponse>
     */
    public AsyncInvoker<CreateNewTaskRequest, CreateNewTaskResponse> createNewTaskAsyncInvoker(
        CreateNewTaskRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.createNewTask, hcClient);
    }

    /**
     * 创建任务（旧版）
     *
     * 创建任务（旧版）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTaskRequest 请求对象
     * @return CompletableFuture<CreateTaskResponse>
     */
    public CompletableFuture<CreateTaskResponse> createTaskAsync(CreateTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.createTask);
    }

    /**
     * 创建任务（旧版）
     *
     * 创建任务（旧版）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTaskRequest 请求对象
     * @return AsyncInvoker<CreateTaskRequest, CreateTaskResponse>
     */
    public AsyncInvoker<CreateTaskRequest, CreateTaskResponse> createTaskAsyncInvoker(CreateTaskRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.createTask, hcClient);
    }

    /**
     * 创建事务
     *
     * 创建事务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTempRequest 请求对象
     * @return CompletableFuture<CreateTempResponse>
     */
    public CompletableFuture<CreateTempResponse> createTempAsync(CreateTempRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.createTemp);
    }

    /**
     * 创建事务
     *
     * 创建事务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTempRequest 请求对象
     * @return AsyncInvoker<CreateTempRequest, CreateTempResponse>
     */
    public AsyncInvoker<CreateTempRequest, CreateTempResponse> createTempAsyncInvoker(CreateTempRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.createTemp, hcClient);
    }

    /**
     * 创建变量
     *
     * 创建变量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVariableRequest 请求对象
     * @return CompletableFuture<CreateVariableResponse>
     */
    public CompletableFuture<CreateVariableResponse> createVariableAsync(CreateVariableRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.createVariable);
    }

    /**
     * 创建变量
     *
     * 创建变量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVariableRequest 请求对象
     * @return AsyncInvoker<CreateVariableRequest, CreateVariableResponse>
     */
    public AsyncInvoker<CreateVariableRequest, CreateVariableResponse> createVariableAsyncInvoker(
        CreateVariableRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.createVariable, hcClient);
    }

    /**
     * 调试用例
     *
     * 调试用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DebugCaseRequest 请求对象
     * @return CompletableFuture<DebugCaseResponse>
     */
    public CompletableFuture<DebugCaseResponse> debugCaseAsync(DebugCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.debugCase);
    }

    /**
     * 调试用例
     *
     * 调试用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DebugCaseRequest 请求对象
     * @return AsyncInvoker<DebugCaseRequest, DebugCaseResponse>
     */
    public AsyncInvoker<DebugCaseRequest, DebugCaseResponse> debugCaseAsyncInvoker(DebugCaseRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.debugCase, hcClient);
    }

    /**
     * 删除用例（旧版）
     *
     * 删除用例（旧版）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCaseRequest 请求对象
     * @return CompletableFuture<DeleteCaseResponse>
     */
    public CompletableFuture<DeleteCaseResponse> deleteCaseAsync(DeleteCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.deleteCase);
    }

    /**
     * 删除用例（旧版）
     *
     * 删除用例（旧版）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCaseRequest 请求对象
     * @return AsyncInvoker<DeleteCaseRequest, DeleteCaseResponse>
     */
    public AsyncInvoker<DeleteCaseRequest, DeleteCaseResponse> deleteCaseAsyncInvoker(DeleteCaseRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.deleteCase, hcClient);
    }

    /**
     * 删除目录
     *
     * 删除目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDirectoryRequest 请求对象
     * @return CompletableFuture<DeleteDirectoryResponse>
     */
    public CompletableFuture<DeleteDirectoryResponse> deleteDirectoryAsync(DeleteDirectoryRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.deleteDirectory);
    }

    /**
     * 删除目录
     *
     * 删除目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDirectoryRequest 请求对象
     * @return AsyncInvoker<DeleteDirectoryRequest, DeleteDirectoryResponse>
     */
    public AsyncInvoker<DeleteDirectoryRequest, DeleteDirectoryResponse> deleteDirectoryAsyncInvoker(
        DeleteDirectoryRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.deleteDirectory, hcClient);
    }

    /**
     * 删除用例
     *
     * 删除用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNewCaseRequest 请求对象
     * @return CompletableFuture<DeleteNewCaseResponse>
     */
    public CompletableFuture<DeleteNewCaseResponse> deleteNewCaseAsync(DeleteNewCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.deleteNewCase);
    }

    /**
     * 删除用例
     *
     * 删除用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNewCaseRequest 请求对象
     * @return AsyncInvoker<DeleteNewCaseRequest, DeleteNewCaseResponse>
     */
    public AsyncInvoker<DeleteNewCaseRequest, DeleteNewCaseResponse> deleteNewCaseAsyncInvoker(
        DeleteNewCaseRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.deleteNewCase, hcClient);
    }

    /**
     * 删除任务
     *
     * 删除任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNewTaskRequest 请求对象
     * @return CompletableFuture<DeleteNewTaskResponse>
     */
    public CompletableFuture<DeleteNewTaskResponse> deleteNewTaskAsync(DeleteNewTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.deleteNewTask);
    }

    /**
     * 删除任务
     *
     * 删除任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNewTaskRequest 请求对象
     * @return AsyncInvoker<DeleteNewTaskRequest, DeleteNewTaskResponse>
     */
    public AsyncInvoker<DeleteNewTaskRequest, DeleteNewTaskResponse> deleteNewTaskAsyncInvoker(
        DeleteNewTaskRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.deleteNewTask, hcClient);
    }

    /**
     * 删除任务（旧版）
     *
     * 删除任务（旧版）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTaskRequest 请求对象
     * @return CompletableFuture<DeleteTaskResponse>
     */
    public CompletableFuture<DeleteTaskResponse> deleteTaskAsync(DeleteTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.deleteTask);
    }

    /**
     * 删除任务（旧版）
     *
     * 删除任务（旧版）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTaskRequest 请求对象
     * @return AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse>
     */
    public AsyncInvoker<DeleteTaskRequest, DeleteTaskResponse> deleteTaskAsyncInvoker(DeleteTaskRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.deleteTask, hcClient);
    }

    /**
     * 删除事务
     *
     * 删除事务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTempRequest 请求对象
     * @return CompletableFuture<DeleteTempResponse>
     */
    public CompletableFuture<DeleteTempResponse> deleteTempAsync(DeleteTempRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.deleteTemp);
    }

    /**
     * 删除事务
     *
     * 删除事务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTempRequest 请求对象
     * @return AsyncInvoker<DeleteTempRequest, DeleteTempResponse>
     */
    public AsyncInvoker<DeleteTempRequest, DeleteTempResponse> deleteTempAsyncInvoker(DeleteTempRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.deleteTemp, hcClient);
    }

    /**
     * 删除全局变量
     *
     * 删除全局变量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVariableRequest 请求对象
     * @return CompletableFuture<DeleteVariableResponse>
     */
    public CompletableFuture<DeleteVariableResponse> deleteVariableAsync(DeleteVariableRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.deleteVariable);
    }

    /**
     * 删除全局变量
     *
     * 删除全局变量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVariableRequest 请求对象
     * @return AsyncInvoker<DeleteVariableRequest, DeleteVariableResponse>
     */
    public AsyncInvoker<DeleteVariableRequest, DeleteVariableResponse> deleteVariableAsyncInvoker(
        DeleteVariableRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.deleteVariable, hcClient);
    }

    /**
     * 查询用例树
     *
     * 查询用例树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTestCaseRequest 请求对象
     * @return CompletableFuture<ListProjectTestCaseResponse>
     */
    public CompletableFuture<ListProjectTestCaseResponse> listProjectTestCaseAsync(ListProjectTestCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.listProjectTestCase);
    }

    /**
     * 查询用例树
     *
     * 查询用例树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTestCaseRequest 请求对象
     * @return AsyncInvoker<ListProjectTestCaseRequest, ListProjectTestCaseResponse>
     */
    public AsyncInvoker<ListProjectTestCaseRequest, ListProjectTestCaseResponse> listProjectTestCaseAsyncInvoker(
        ListProjectTestCaseRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.listProjectTestCase, hcClient);
    }

    /**
     * 获取任务关联的用例列表
     *
     * 获取任务关联的用例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskCasesRequest 请求对象
     * @return CompletableFuture<ListTaskCasesResponse>
     */
    public CompletableFuture<ListTaskCasesResponse> listTaskCasesAsync(ListTaskCasesRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.listTaskCases);
    }

    /**
     * 获取任务关联的用例列表
     *
     * 获取任务关联的用例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskCasesRequest 请求对象
     * @return AsyncInvoker<ListTaskCasesRequest, ListTaskCasesResponse>
     */
    public AsyncInvoker<ListTaskCasesRequest, ListTaskCasesResponse> listTaskCasesAsyncInvoker(
        ListTaskCasesRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.listTaskCases, hcClient);
    }

    /**
     * 查询全局变量
     *
     * 查询全局变量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVariablesRequest 请求对象
     * @return CompletableFuture<ListVariablesResponse>
     */
    public CompletableFuture<ListVariablesResponse> listVariablesAsync(ListVariablesRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.listVariables);
    }

    /**
     * 查询全局变量
     *
     * 查询全局变量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVariablesRequest 请求对象
     * @return AsyncInvoker<ListVariablesRequest, ListVariablesResponse>
     */
    public AsyncInvoker<ListVariablesRequest, ListVariablesResponse> listVariablesAsyncInvoker(
        ListVariablesRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.listVariables, hcClient);
    }

    /**
     * 全链路压测探针获取配置信息
     *
     * 全链路压测探针获取配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgentConfigRequest 请求对象
     * @return CompletableFuture<ShowAgentConfigResponse>
     */
    public CompletableFuture<ShowAgentConfigResponse> showAgentConfigAsync(ShowAgentConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.showAgentConfig);
    }

    /**
     * 全链路压测探针获取配置信息
     *
     * 全链路压测探针获取配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgentConfigRequest 请求对象
     * @return AsyncInvoker<ShowAgentConfigRequest, ShowAgentConfigResponse>
     */
    public AsyncInvoker<ShowAgentConfigRequest, ShowAgentConfigResponse> showAgentConfigAsyncInvoker(
        ShowAgentConfigRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.showAgentConfig, hcClient);
    }

    /**
     * 查询用例
     *
     * 查询用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCaseRequest 请求对象
     * @return CompletableFuture<ShowCaseResponse>
     */
    public CompletableFuture<ShowCaseResponse> showCaseAsync(ShowCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.showCase);
    }

    /**
     * 查询用例
     *
     * 查询用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCaseRequest 请求对象
     * @return AsyncInvoker<ShowCaseRequest, ShowCaseResponse>
     */
    public AsyncInvoker<ShowCaseRequest, ShowCaseResponse> showCaseAsyncInvoker(ShowCaseRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.showCase, hcClient);
    }

    /**
     * 查询PerfTest任务离线报告列表
     *
     * 查询PerfTest任务离线报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHistoryRunInfoRequest 请求对象
     * @return CompletableFuture<ShowHistoryRunInfoResponse>
     */
    public CompletableFuture<ShowHistoryRunInfoResponse> showHistoryRunInfoAsync(ShowHistoryRunInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.showHistoryRunInfo);
    }

    /**
     * 查询PerfTest任务离线报告列表
     *
     * 查询PerfTest任务离线报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHistoryRunInfoRequest 请求对象
     * @return AsyncInvoker<ShowHistoryRunInfoRequest, ShowHistoryRunInfoResponse>
     */
    public AsyncInvoker<ShowHistoryRunInfoRequest, ShowHistoryRunInfoResponse> showHistoryRunInfoAsyncInvoker(
        ShowHistoryRunInfoRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.showHistoryRunInfo, hcClient);
    }

    /**
     * 查询用例报告详情
     *
     * 查询用例报告详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMergeCaseDetailRequest 请求对象
     * @return CompletableFuture<ShowMergeCaseDetailResponse>
     */
    public CompletableFuture<ShowMergeCaseDetailResponse> showMergeCaseDetailAsync(ShowMergeCaseDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.showMergeCaseDetail);
    }

    /**
     * 查询用例报告详情
     *
     * 查询用例报告详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMergeCaseDetailRequest 请求对象
     * @return AsyncInvoker<ShowMergeCaseDetailRequest, ShowMergeCaseDetailResponse>
     */
    public AsyncInvoker<ShowMergeCaseDetailRequest, ShowMergeCaseDetailResponse> showMergeCaseDetailAsyncInvoker(
        ShowMergeCaseDetailRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.showMergeCaseDetail, hcClient);
    }

    /**
     * 查询报告汇总数据
     *
     * 查询报告汇总数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMergeReportLogsOutlineRequest 请求对象
     * @return CompletableFuture<ShowMergeReportLogsOutlineResponse>
     */
    public CompletableFuture<ShowMergeReportLogsOutlineResponse> showMergeReportLogsOutlineAsync(
        ShowMergeReportLogsOutlineRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.showMergeReportLogsOutline);
    }

    /**
     * 查询报告汇总数据
     *
     * 查询报告汇总数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMergeReportLogsOutlineRequest 请求对象
     * @return AsyncInvoker<ShowMergeReportLogsOutlineRequest, ShowMergeReportLogsOutlineResponse>
     */
    public AsyncInvoker<ShowMergeReportLogsOutlineRequest, ShowMergeReportLogsOutlineResponse> showMergeReportLogsOutlineAsyncInvoker(
        ShowMergeReportLogsOutlineRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.showMergeReportLogsOutline, hcClient);
    }

    /**
     * 查询任务报告的用例列表
     *
     * 查询任务报告的用例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMergeTaskCaseRequest 请求对象
     * @return CompletableFuture<ShowMergeTaskCaseResponse>
     */
    public CompletableFuture<ShowMergeTaskCaseResponse> showMergeTaskCaseAsync(ShowMergeTaskCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.showMergeTaskCase);
    }

    /**
     * 查询任务报告的用例列表
     *
     * 查询任务报告的用例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMergeTaskCaseRequest 请求对象
     * @return AsyncInvoker<ShowMergeTaskCaseRequest, ShowMergeTaskCaseResponse>
     */
    public AsyncInvoker<ShowMergeTaskCaseRequest, ShowMergeTaskCaseResponse> showMergeTaskCaseAsyncInvoker(
        ShowMergeTaskCaseRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.showMergeTaskCase, hcClient);
    }

    /**
     * 查询报告
     *
     * 查询报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportRequest 请求对象
     * @return CompletableFuture<ShowReportResponse>
     */
    public CompletableFuture<ShowReportResponse> showReportAsync(ShowReportRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.showReport);
    }

    /**
     * 查询报告
     *
     * 查询报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportRequest 请求对象
     * @return AsyncInvoker<ShowReportRequest, ShowReportResponse>
     */
    public AsyncInvoker<ShowReportRequest, ShowReportResponse> showReportAsyncInvoker(ShowReportRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.showReport, hcClient);
    }

    /**
     * 查询任务（旧版）
     *
     * 查询任务（旧版）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskRequest 请求对象
     * @return CompletableFuture<ShowTaskResponse>
     */
    public CompletableFuture<ShowTaskResponse> showTaskAsync(ShowTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.showTask);
    }

    /**
     * 查询任务（旧版）
     *
     * 查询任务（旧版）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskRequest 请求对象
     * @return AsyncInvoker<ShowTaskRequest, ShowTaskResponse>
     */
    public AsyncInvoker<ShowTaskRequest, ShowTaskResponse> showTaskAsyncInvoker(ShowTaskRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.showTask, hcClient);
    }

    /**
     * 查询用例的AW曲线图
     *
     * 查询用例的AW曲线图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskCaseAwChartRequest 请求对象
     * @return CompletableFuture<ShowTaskCaseAwChartResponse>
     */
    public CompletableFuture<ShowTaskCaseAwChartResponse> showTaskCaseAwChartAsync(ShowTaskCaseAwChartRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.showTaskCaseAwChart);
    }

    /**
     * 查询用例的AW曲线图
     *
     * 查询用例的AW曲线图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskCaseAwChartRequest 请求对象
     * @return AsyncInvoker<ShowTaskCaseAwChartRequest, ShowTaskCaseAwChartResponse>
     */
    public AsyncInvoker<ShowTaskCaseAwChartRequest, ShowTaskCaseAwChartResponse> showTaskCaseAwChartAsyncInvoker(
        ShowTaskCaseAwChartRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.showTaskCaseAwChart, hcClient);
    }

    /**
     * 查询任务集
     *
     * 查询任务集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskSetRequest 请求对象
     * @return CompletableFuture<ShowTaskSetResponse>
     */
    public CompletableFuture<ShowTaskSetResponse> showTaskSetAsync(ShowTaskSetRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.showTaskSet);
    }

    /**
     * 查询任务集
     *
     * 查询任务集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTaskSetRequest 请求对象
     * @return AsyncInvoker<ShowTaskSetRequest, ShowTaskSetResponse>
     */
    public AsyncInvoker<ShowTaskSetRequest, ShowTaskSetResponse> showTaskSetAsyncInvoker(ShowTaskSetRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.showTaskSet, hcClient);
    }

    /**
     * 查询事务
     *
     * 查询事务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTempRequest 请求对象
     * @return CompletableFuture<ShowTempResponse>
     */
    public CompletableFuture<ShowTempResponse> showTempAsync(ShowTempRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.showTemp);
    }

    /**
     * 查询事务
     *
     * 查询事务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTempRequest 请求对象
     * @return AsyncInvoker<ShowTempRequest, ShowTempResponse>
     */
    public AsyncInvoker<ShowTempRequest, ShowTempResponse> showTempAsyncInvoker(ShowTempRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.showTemp, hcClient);
    }

    /**
     * 查询事务集
     *
     * 查询事务集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTempSetRequest 请求对象
     * @return CompletableFuture<ShowTempSetResponse>
     */
    public CompletableFuture<ShowTempSetResponse> showTempSetAsync(ShowTempSetRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.showTempSet);
    }

    /**
     * 查询事务集
     *
     * 查询事务集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTempSetRequest 请求对象
     * @return AsyncInvoker<ShowTempSetRequest, ShowTempSetResponse>
     */
    public AsyncInvoker<ShowTempSetRequest, ShowTempSetResponse> showTempSetAsyncInvoker(ShowTempSetRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.showTempSet, hcClient);
    }

    /**
     * 全链路压测探针上报健康状态
     *
     * 全链路压测探针上报健康状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAgentHealthStatusRequest 请求对象
     * @return CompletableFuture<UpdateAgentHealthStatusResponse>
     */
    public CompletableFuture<UpdateAgentHealthStatusResponse> updateAgentHealthStatusAsync(
        UpdateAgentHealthStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.updateAgentHealthStatus);
    }

    /**
     * 全链路压测探针上报健康状态
     *
     * 全链路压测探针上报健康状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAgentHealthStatusRequest 请求对象
     * @return AsyncInvoker<UpdateAgentHealthStatusRequest, UpdateAgentHealthStatusResponse>
     */
    public AsyncInvoker<UpdateAgentHealthStatusRequest, UpdateAgentHealthStatusResponse> updateAgentHealthStatusAsyncInvoker(
        UpdateAgentHealthStatusRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.updateAgentHealthStatus, hcClient);
    }

    /**
     * 修改用例（旧版）
     *
     * 修改用例（旧版）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCaseRequest 请求对象
     * @return CompletableFuture<UpdateCaseResponse>
     */
    public CompletableFuture<UpdateCaseResponse> updateCaseAsync(UpdateCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.updateCase);
    }

    /**
     * 修改用例（旧版）
     *
     * 修改用例（旧版）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCaseRequest 请求对象
     * @return AsyncInvoker<UpdateCaseRequest, UpdateCaseResponse>
     */
    public AsyncInvoker<UpdateCaseRequest, UpdateCaseResponse> updateCaseAsyncInvoker(UpdateCaseRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.updateCase, hcClient);
    }

    /**
     * 修改目录
     *
     * 修改目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDirectoryRequest 请求对象
     * @return CompletableFuture<UpdateDirectoryResponse>
     */
    public CompletableFuture<UpdateDirectoryResponse> updateDirectoryAsync(UpdateDirectoryRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.updateDirectory);
    }

    /**
     * 修改目录
     *
     * 修改目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDirectoryRequest 请求对象
     * @return AsyncInvoker<UpdateDirectoryRequest, UpdateDirectoryResponse>
     */
    public AsyncInvoker<UpdateDirectoryRequest, UpdateDirectoryResponse> updateDirectoryAsyncInvoker(
        UpdateDirectoryRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.updateDirectory, hcClient);
    }

    /**
     * 修改用例
     *
     * 修改用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNewCaseRequest 请求对象
     * @return CompletableFuture<UpdateNewCaseResponse>
     */
    public CompletableFuture<UpdateNewCaseResponse> updateNewCaseAsync(UpdateNewCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.updateNewCase);
    }

    /**
     * 修改用例
     *
     * 修改用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNewCaseRequest 请求对象
     * @return AsyncInvoker<UpdateNewCaseRequest, UpdateNewCaseResponse>
     */
    public AsyncInvoker<UpdateNewCaseRequest, UpdateNewCaseResponse> updateNewCaseAsyncInvoker(
        UpdateNewCaseRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.updateNewCase, hcClient);
    }

    /**
     * 修改任务（旧版）
     *
     * 修改任务（旧版）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTaskRequest 请求对象
     * @return CompletableFuture<UpdateTaskResponse>
     */
    public CompletableFuture<UpdateTaskResponse> updateTaskAsync(UpdateTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.updateTask);
    }

    /**
     * 修改任务（旧版）
     *
     * 修改任务（旧版）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTaskRequest 请求对象
     * @return AsyncInvoker<UpdateTaskRequest, UpdateTaskResponse>
     */
    public AsyncInvoker<UpdateTaskRequest, UpdateTaskResponse> updateTaskAsyncInvoker(UpdateTaskRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.updateTask, hcClient);
    }

    /**
     * 修改任务关联用例
     *
     * 修改任务关联用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTaskRelatedTestCaseRequest 请求对象
     * @return CompletableFuture<UpdateTaskRelatedTestCaseResponse>
     */
    public CompletableFuture<UpdateTaskRelatedTestCaseResponse> updateTaskRelatedTestCaseAsync(
        UpdateTaskRelatedTestCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.updateTaskRelatedTestCase);
    }

    /**
     * 修改任务关联用例
     *
     * 修改任务关联用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTaskRelatedTestCaseRequest 请求对象
     * @return AsyncInvoker<UpdateTaskRelatedTestCaseRequest, UpdateTaskRelatedTestCaseResponse>
     */
    public AsyncInvoker<UpdateTaskRelatedTestCaseRequest, UpdateTaskRelatedTestCaseResponse> updateTaskRelatedTestCaseAsyncInvoker(
        UpdateTaskRelatedTestCaseRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.updateTaskRelatedTestCase, hcClient);
    }

    /**
     * 更新任务状态
     *
     * 更新任务状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTaskStatusRequest 请求对象
     * @return CompletableFuture<UpdateTaskStatusResponse>
     */
    public CompletableFuture<UpdateTaskStatusResponse> updateTaskStatusAsync(UpdateTaskStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.updateTaskStatus);
    }

    /**
     * 更新任务状态
     *
     * 更新任务状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTaskStatusRequest 请求对象
     * @return AsyncInvoker<UpdateTaskStatusRequest, UpdateTaskStatusResponse>
     */
    public AsyncInvoker<UpdateTaskStatusRequest, UpdateTaskStatusResponse> updateTaskStatusAsyncInvoker(
        UpdateTaskStatusRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.updateTaskStatus, hcClient);
    }

    /**
     * 修改事务
     *
     * 修改事务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTempRequest 请求对象
     * @return CompletableFuture<UpdateTempResponse>
     */
    public CompletableFuture<UpdateTempResponse> updateTempAsync(UpdateTempRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.updateTemp);
    }

    /**
     * 修改事务
     *
     * 修改事务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTempRequest 请求对象
     * @return AsyncInvoker<UpdateTempRequest, UpdateTempResponse>
     */
    public AsyncInvoker<UpdateTempRequest, UpdateTempResponse> updateTempAsyncInvoker(UpdateTempRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.updateTemp, hcClient);
    }

    /**
     * 修改变量
     *
     * 修改变量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVariableRequest 请求对象
     * @return CompletableFuture<UpdateVariableResponse>
     */
    public CompletableFuture<UpdateVariableResponse> updateVariableAsync(UpdateVariableRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.updateVariable);
    }

    /**
     * 修改变量
     *
     * 修改变量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVariableRequest 请求对象
     * @return AsyncInvoker<UpdateVariableRequest, UpdateVariableResponse>
     */
    public AsyncInvoker<UpdateVariableRequest, UpdateVariableResponse> updateVariableAsyncInvoker(
        UpdateVariableRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.updateVariable, hcClient);
    }

    /**
     * 创建工程
     *
     * 创建工程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectRequest 请求对象
     * @return CompletableFuture<CreateProjectResponse>
     */
    public CompletableFuture<CreateProjectResponse> createProjectAsync(CreateProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.createProject);
    }

    /**
     * 创建工程
     *
     * 创建工程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectRequest 请求对象
     * @return AsyncInvoker<CreateProjectRequest, CreateProjectResponse>
     */
    public AsyncInvoker<CreateProjectRequest, CreateProjectResponse> createProjectAsyncInvoker(
        CreateProjectRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.createProject, hcClient);
    }

    /**
     * 删除工程
     *
     * 删除工程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProjectRequest 请求对象
     * @return CompletableFuture<DeleteProjectResponse>
     */
    public CompletableFuture<DeleteProjectResponse> deleteProjectAsync(DeleteProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.deleteProject);
    }

    /**
     * 删除工程
     *
     * 删除工程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProjectRequest 请求对象
     * @return AsyncInvoker<DeleteProjectRequest, DeleteProjectResponse>
     */
    public AsyncInvoker<DeleteProjectRequest, DeleteProjectResponse> deleteProjectAsyncInvoker(
        DeleteProjectRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.deleteProject, hcClient);
    }

    /**
     * 查询工程集
     *
     * 查询工程集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectSetsRequest 请求对象
     * @return CompletableFuture<ListProjectSetsResponse>
     */
    public CompletableFuture<ListProjectSetsResponse> listProjectSetsAsync(ListProjectSetsRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.listProjectSets);
    }

    /**
     * 查询工程集
     *
     * 查询工程集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectSetsRequest 请求对象
     * @return AsyncInvoker<ListProjectSetsRequest, ListProjectSetsResponse>
     */
    public AsyncInvoker<ListProjectSetsRequest, ListProjectSetsResponse> listProjectSetsAsyncInvoker(
        ListProjectSetsRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.listProjectSets, hcClient);
    }

    /**
     * 查询导入进度
     *
     * 查询导入进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProcessRequest 请求对象
     * @return CompletableFuture<ShowProcessResponse>
     */
    public CompletableFuture<ShowProcessResponse> showProcessAsync(ShowProcessRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.showProcess);
    }

    /**
     * 查询导入进度
     *
     * 查询导入进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProcessRequest 请求对象
     * @return AsyncInvoker<ShowProcessRequest, ShowProcessResponse>
     */
    public AsyncInvoker<ShowProcessRequest, ShowProcessResponse> showProcessAsyncInvoker(ShowProcessRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.showProcess, hcClient);
    }

    /**
     * 查询工程
     *
     * 查询工程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectRequest 请求对象
     * @return CompletableFuture<ShowProjectResponse>
     */
    public CompletableFuture<ShowProjectResponse> showProjectAsync(ShowProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.showProject);
    }

    /**
     * 查询工程
     *
     * 查询工程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectRequest 请求对象
     * @return AsyncInvoker<ShowProjectRequest, ShowProjectResponse>
     */
    public AsyncInvoker<ShowProjectRequest, ShowProjectResponse> showProjectAsyncInvoker(ShowProjectRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.showProject, hcClient);
    }

    /**
     * 修改工程
     *
     * 修改工程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectRequest 请求对象
     * @return CompletableFuture<UpdateProjectResponse>
     */
    public CompletableFuture<UpdateProjectResponse> updateProjectAsync(UpdateProjectRequest request) {
        return hcClient.asyncInvokeHttp(request, CptsMeta.updateProject);
    }

    /**
     * 修改工程
     *
     * 修改工程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectRequest 请求对象
     * @return AsyncInvoker<UpdateProjectRequest, UpdateProjectResponse>
     */
    public AsyncInvoker<UpdateProjectRequest, UpdateProjectResponse> updateProjectAsyncInvoker(
        UpdateProjectRequest request) {
        return new AsyncInvoker<>(request, CptsMeta.updateProject, hcClient);
    }

}

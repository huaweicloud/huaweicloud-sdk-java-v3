package com.huaweicloud.sdk.aom.v1;

import com.huaweicloud.sdk.aom.v1.model.CreateFastExecuteScriptRequest;
import com.huaweicloud.sdk.aom.v1.model.CreateFastExecuteScriptResponse;
import com.huaweicloud.sdk.aom.v1.model.CreateWorkflowRequest;
import com.huaweicloud.sdk.aom.v1.model.CreateWorkflowResponse;
import com.huaweicloud.sdk.aom.v1.model.ExecuteWorkflowRequest;
import com.huaweicloud.sdk.aom.v1.model.ExecuteWorkflowResponse;
import com.huaweicloud.sdk.aom.v1.model.ListAllJobByNameRequest;
import com.huaweicloud.sdk.aom.v1.model.ListAllJobByNameResponse;
import com.huaweicloud.sdk.aom.v1.model.ListAllScriptByNameRequest;
import com.huaweicloud.sdk.aom.v1.model.ListAllScriptByNameResponse;
import com.huaweicloud.sdk.aom.v1.model.ListAllVersionByVersionIdRequest;
import com.huaweicloud.sdk.aom.v1.model.ListAllVersionByVersionIdResponse;
import com.huaweicloud.sdk.aom.v1.model.ListTemplateByJobIdRequest;
import com.huaweicloud.sdk.aom.v1.model.ListTemplateByJobIdResponse;
import com.huaweicloud.sdk.aom.v1.model.ListWorkflowExecutionsRequest;
import com.huaweicloud.sdk.aom.v1.model.ListWorkflowExecutionsResponse;
import com.huaweicloud.sdk.aom.v1.model.ListWorkflowRequest;
import com.huaweicloud.sdk.aom.v1.model.ListWorkflowResponse;
import com.huaweicloud.sdk.aom.v1.model.SearchTemplateByIdRequest;
import com.huaweicloud.sdk.aom.v1.model.SearchTemplateByIdResponse;
import com.huaweicloud.sdk.aom.v1.model.SearchWorkflowExecutionDetailRequest;
import com.huaweicloud.sdk.aom.v1.model.SearchWorkflowExecutionDetailResponse;
import com.huaweicloud.sdk.aom.v1.model.StartPausingWorkflowExecutionsRequest;
import com.huaweicloud.sdk.aom.v1.model.StartPausingWorkflowExecutionsResponse;
import com.huaweicloud.sdk.aom.v1.model.StopExecutionRequest;
import com.huaweicloud.sdk.aom.v1.model.StopExecutionResponse;
import com.huaweicloud.sdk.aom.v1.model.UpdateWorkflowTriggerStatusRequest;
import com.huaweicloud.sdk.aom.v1.model.UpdateWorkflowTriggerStatusResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class AomAsyncClient {

    protected HcClient hcClient;

    public AomAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<AomAsyncClient> newBuilder() {
        ClientBuilder<AomAsyncClient> clientBuilder = new ClientBuilder<>(AomAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 快速创建并执行脚本
     *
     * 该接口用于创建快速执行脚本的任务，可以指定脚本类型，执行用户，脚本参数，执行机器，脚本内容，在用户指定的机器上执行脚本。（注：接口目前开放的region为：华东-苏州二零一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFastExecuteScriptRequest 请求对象
     * @return CompletableFuture<CreateFastExecuteScriptResponse>
     */
    public CompletableFuture<CreateFastExecuteScriptResponse> createFastExecuteScriptAsync(
        CreateFastExecuteScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.createFastExecuteScript);
    }

    /**
     * 快速创建并执行脚本
     *
     * 该接口用于创建快速执行脚本的任务，可以指定脚本类型，执行用户，脚本参数，执行机器，脚本内容，在用户指定的机器上执行脚本。（注：接口目前开放的region为：华东-苏州二零一）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFastExecuteScriptRequest 请求对象
     * @return AsyncInvoker<CreateFastExecuteScriptRequest, CreateFastExecuteScriptResponse>
     */
    public AsyncInvoker<CreateFastExecuteScriptRequest, CreateFastExecuteScriptResponse> createFastExecuteScriptAsyncInvoker(
        CreateFastExecuteScriptRequest request) {
        return new AsyncInvoker<>(request, AomMeta.createFastExecuteScript, hcClient);
    }

    /**
     * 创建任务
     *
     * 该接口用于创建工作流（任务），返回工作流详情。任务类型取决于模板名称和&#39;input&#39;参数。（注：接口目前开放的region为：华北-北京四,华东-上海一,华东-上海二,华南-广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowRequest 请求对象
     * @return CompletableFuture<CreateWorkflowResponse>
     */
    public CompletableFuture<CreateWorkflowResponse> createWorkflowAsync(CreateWorkflowRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.createWorkflow);
    }

    /**
     * 创建任务
     *
     * 该接口用于创建工作流（任务），返回工作流详情。任务类型取决于模板名称和&#39;input&#39;参数。（注：接口目前开放的region为：华北-北京四,华东-上海一,华东-上海二,华南-广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowRequest 请求对象
     * @return AsyncInvoker<CreateWorkflowRequest, CreateWorkflowResponse>
     */
    public AsyncInvoker<CreateWorkflowRequest, CreateWorkflowResponse> createWorkflowAsyncInvoker(
        CreateWorkflowRequest request) {
        return new AsyncInvoker<>(request, AomMeta.createWorkflow, hcClient);
    }

    /**
     * 执行工作流
     *
     * 该接口可下发执行指定的任务。（注：接口目前开放的region为：华北-北京四,华东-上海一,华东-上海二,华南-广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteWorkflowRequest 请求对象
     * @return CompletableFuture<ExecuteWorkflowResponse>
     */
    public CompletableFuture<ExecuteWorkflowResponse> executeWorkflowAsync(ExecuteWorkflowRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.executeWorkflow);
    }

    /**
     * 执行工作流
     *
     * 该接口可下发执行指定的任务。（注：接口目前开放的region为：华北-北京四,华东-上海一,华东-上海二,华南-广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteWorkflowRequest 请求对象
     * @return AsyncInvoker<ExecuteWorkflowRequest, ExecuteWorkflowResponse>
     */
    public AsyncInvoker<ExecuteWorkflowRequest, ExecuteWorkflowResponse> executeWorkflowAsyncInvoker(
        ExecuteWorkflowRequest request) {
        return new AsyncInvoker<>(request, AomMeta.executeWorkflow, hcClient);
    }

    /**
     * 作业管理主页模糊查询
     *
     * 该接口可查询已创建的作业，可指定作业名称和作业创建人去精确查询，返回作业列表信息。（注：接口目前开放的region为：华北-北京四,华东-上海一,华东-上海二,华南-广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllJobByNameRequest 请求对象
     * @return CompletableFuture<ListAllJobByNameResponse>
     */
    public CompletableFuture<ListAllJobByNameResponse> listAllJobByNameAsync(ListAllJobByNameRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listAllJobByName);
    }

    /**
     * 作业管理主页模糊查询
     *
     * 该接口可查询已创建的作业，可指定作业名称和作业创建人去精确查询，返回作业列表信息。（注：接口目前开放的region为：华北-北京四,华东-上海一,华东-上海二,华南-广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllJobByNameRequest 请求对象
     * @return AsyncInvoker<ListAllJobByNameRequest, ListAllJobByNameResponse>
     */
    public AsyncInvoker<ListAllJobByNameRequest, ListAllJobByNameResponse> listAllJobByNameAsyncInvoker(
        ListAllJobByNameRequest request) {
        return new AsyncInvoker<>(request, AomMeta.listAllJobByName, hcClient);
    }

    /**
     * 脚本查询
     *
     * 该接口是脚本主页查询，可指定脚本名称和脚本创建人进行精确查询，返回包含脚本基本信息的列表数据。（注：接口目前开放的region为：华北-北京四,华东-上海一,华东-上海二,华南-广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllScriptByNameRequest 请求对象
     * @return CompletableFuture<ListAllScriptByNameResponse>
     */
    public CompletableFuture<ListAllScriptByNameResponse> listAllScriptByNameAsync(ListAllScriptByNameRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listAllScriptByName);
    }

    /**
     * 脚本查询
     *
     * 该接口是脚本主页查询，可指定脚本名称和脚本创建人进行精确查询，返回包含脚本基本信息的列表数据。（注：接口目前开放的region为：华北-北京四,华东-上海一,华东-上海二,华南-广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllScriptByNameRequest 请求对象
     * @return AsyncInvoker<ListAllScriptByNameRequest, ListAllScriptByNameResponse>
     */
    public AsyncInvoker<ListAllScriptByNameRequest, ListAllScriptByNameResponse> listAllScriptByNameAsyncInvoker(
        ListAllScriptByNameRequest request) {
        return new AsyncInvoker<>(request, AomMeta.listAllScriptByName, hcClient);
    }

    /**
     * 脚本版本查询
     *
     * 该接口可查询指定脚本ID下的所有版本，返回该名称的脚本版本列表信息。（注：接口目前开放的region为：华北-北京四,华东-上海一,华东-上海二,华南-广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllVersionByVersionIdRequest 请求对象
     * @return CompletableFuture<ListAllVersionByVersionIdResponse>
     */
    public CompletableFuture<ListAllVersionByVersionIdResponse> listAllVersionByVersionIdAsync(
        ListAllVersionByVersionIdRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listAllVersionByVersionId);
    }

    /**
     * 脚本版本查询
     *
     * 该接口可查询指定脚本ID下的所有版本，返回该名称的脚本版本列表信息。（注：接口目前开放的region为：华北-北京四,华东-上海一,华东-上海二,华南-广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllVersionByVersionIdRequest 请求对象
     * @return AsyncInvoker<ListAllVersionByVersionIdRequest, ListAllVersionByVersionIdResponse>
     */
    public AsyncInvoker<ListAllVersionByVersionIdRequest, ListAllVersionByVersionIdResponse> listAllVersionByVersionIdAsyncInvoker(
        ListAllVersionByVersionIdRequest request) {
        return new AsyncInvoker<>(request, AomMeta.listAllVersionByVersionId, hcClient);
    }

    /**
     * 根据作业id查询方案(自定义模板)列表
     *
     * 该接口可根据作业ID查询执行方案，分页返回执行方案列表。（注：接口目前开放的region为：华北-北京四,华东-上海一,华东-上海二,华南-广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplateByJobIdRequest 请求对象
     * @return CompletableFuture<ListTemplateByJobIdResponse>
     */
    public CompletableFuture<ListTemplateByJobIdResponse> listTemplateByJobIdAsync(ListTemplateByJobIdRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listTemplateByJobId);
    }

    /**
     * 根据作业id查询方案(自定义模板)列表
     *
     * 该接口可根据作业ID查询执行方案，分页返回执行方案列表。（注：接口目前开放的region为：华北-北京四,华东-上海一,华东-上海二,华南-广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplateByJobIdRequest 请求对象
     * @return AsyncInvoker<ListTemplateByJobIdRequest, ListTemplateByJobIdResponse>
     */
    public AsyncInvoker<ListTemplateByJobIdRequest, ListTemplateByJobIdResponse> listTemplateByJobIdAsyncInvoker(
        ListTemplateByJobIdRequest request) {
        return new AsyncInvoker<>(request, AomMeta.listTemplateByJobId, hcClient);
    }

    /**
     * 查询任务列表
     *
     * 该接口可返回已经创建的任务列表，可按任务名称，任务状态，任务类型，执行人，更新时间为查询条件分页查询任务。（注：接口目前开放的region为：华北-北京四,华东-上海一,华东-上海二,华南-广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkflowRequest 请求对象
     * @return CompletableFuture<ListWorkflowResponse>
     */
    public CompletableFuture<ListWorkflowResponse> listWorkflowAsync(ListWorkflowRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listWorkflow);
    }

    /**
     * 查询任务列表
     *
     * 该接口可返回已经创建的任务列表，可按任务名称，任务状态，任务类型，执行人，更新时间为查询条件分页查询任务。（注：接口目前开放的region为：华北-北京四,华东-上海一,华东-上海二,华南-广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkflowRequest 请求对象
     * @return AsyncInvoker<ListWorkflowRequest, ListWorkflowResponse>
     */
    public AsyncInvoker<ListWorkflowRequest, ListWorkflowResponse> listWorkflowAsyncInvoker(
        ListWorkflowRequest request) {
        return new AsyncInvoker<>(request, AomMeta.listWorkflow, hcClient);
    }

    /**
     * 获取任务执行历史
     *
     * 该接口可获取执行任务的执行历史。（注：接口目前开放的region为：华北-北京四,华东-上海一,华东-上海二,华南-广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkflowExecutionsRequest 请求对象
     * @return CompletableFuture<ListWorkflowExecutionsResponse>
     */
    public CompletableFuture<ListWorkflowExecutionsResponse> listWorkflowExecutionsAsync(
        ListWorkflowExecutionsRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.listWorkflowExecutions);
    }

    /**
     * 获取任务执行历史
     *
     * 该接口可获取执行任务的执行历史。（注：接口目前开放的region为：华北-北京四,华东-上海一,华东-上海二,华南-广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkflowExecutionsRequest 请求对象
     * @return AsyncInvoker<ListWorkflowExecutionsRequest, ListWorkflowExecutionsResponse>
     */
    public AsyncInvoker<ListWorkflowExecutionsRequest, ListWorkflowExecutionsResponse> listWorkflowExecutionsAsyncInvoker(
        ListWorkflowExecutionsRequest request) {
        return new AsyncInvoker<>(request, AomMeta.listWorkflowExecutions, hcClient);
    }

    /**
     * 获取方案信息
     *
     * 该接口可根据执行方案id查询执行方案详情。（注：接口目前开放的region为：华北-北京四,华东-上海一,华东-上海二,华南-广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchTemplateByIdRequest 请求对象
     * @return CompletableFuture<SearchTemplateByIdResponse>
     */
    public CompletableFuture<SearchTemplateByIdResponse> searchTemplateByIdAsync(SearchTemplateByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.searchTemplateById);
    }

    /**
     * 获取方案信息
     *
     * 该接口可根据执行方案id查询执行方案详情。（注：接口目前开放的region为：华北-北京四,华东-上海一,华东-上海二,华南-广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchTemplateByIdRequest 请求对象
     * @return AsyncInvoker<SearchTemplateByIdRequest, SearchTemplateByIdResponse>
     */
    public AsyncInvoker<SearchTemplateByIdRequest, SearchTemplateByIdResponse> searchTemplateByIdAsyncInvoker(
        SearchTemplateByIdRequest request) {
        return new AsyncInvoker<>(request, AomMeta.searchTemplateById, hcClient);
    }

    /**
     * 获取工作流执行中的执行详情
     *
     * 该接口可获取任务的执行详情，可指定工作流ID和执行ID去查询对应的任务，返回任务执行详情。（注：接口目前开放的region为：华北-北京四,华东-上海一,华东-上海二,华南-广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchWorkflowExecutionDetailRequest 请求对象
     * @return CompletableFuture<SearchWorkflowExecutionDetailResponse>
     */
    public CompletableFuture<SearchWorkflowExecutionDetailResponse> searchWorkflowExecutionDetailAsync(
        SearchWorkflowExecutionDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.searchWorkflowExecutionDetail);
    }

    /**
     * 获取工作流执行中的执行详情
     *
     * 该接口可获取任务的执行详情，可指定工作流ID和执行ID去查询对应的任务，返回任务执行详情。（注：接口目前开放的region为：华北-北京四,华东-上海一,华东-上海二,华南-广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchWorkflowExecutionDetailRequest 请求对象
     * @return AsyncInvoker<SearchWorkflowExecutionDetailRequest, SearchWorkflowExecutionDetailResponse>
     */
    public AsyncInvoker<SearchWorkflowExecutionDetailRequest, SearchWorkflowExecutionDetailResponse> searchWorkflowExecutionDetailAsyncInvoker(
        SearchWorkflowExecutionDetailRequest request) {
        return new AsyncInvoker<>(request, AomMeta.searchWorkflowExecutionDetail, hcClient);
    }

    /**
     * 对暂停中的任务进行操作
     *
     * 该接口可对任务进行失败重试、失败跳过、暂停继续操作，返回操作结果。（注：接口目前开放的region为：华北-北京四,华东-上海一,华东-上海二,华南-广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartPausingWorkflowExecutionsRequest 请求对象
     * @return CompletableFuture<StartPausingWorkflowExecutionsResponse>
     */
    public CompletableFuture<StartPausingWorkflowExecutionsResponse> startPausingWorkflowExecutionsAsync(
        StartPausingWorkflowExecutionsRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.startPausingWorkflowExecutions);
    }

    /**
     * 对暂停中的任务进行操作
     *
     * 该接口可对任务进行失败重试、失败跳过、暂停继续操作，返回操作结果。（注：接口目前开放的region为：华北-北京四,华东-上海一,华东-上海二,华南-广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartPausingWorkflowExecutionsRequest 请求对象
     * @return AsyncInvoker<StartPausingWorkflowExecutionsRequest, StartPausingWorkflowExecutionsResponse>
     */
    public AsyncInvoker<StartPausingWorkflowExecutionsRequest, StartPausingWorkflowExecutionsResponse> startPausingWorkflowExecutionsAsyncInvoker(
        StartPausingWorkflowExecutionsRequest request) {
        return new AsyncInvoker<>(request, AomMeta.startPausingWorkflowExecutions, hcClient);
    }

    /**
     * 终止任务执行
     *
     * 该接口可终止正在执行的任务，指定工作流ID和执行ID去终止对应的任务，返回终止操作状态。（注：接口目前开放的region为：华北-北京四,华东-上海一,华东-上海二,华南-广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopExecutionRequest 请求对象
     * @return CompletableFuture<StopExecutionResponse>
     */
    public CompletableFuture<StopExecutionResponse> stopExecutionAsync(StopExecutionRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.stopExecution);
    }

    /**
     * 终止任务执行
     *
     * 该接口可终止正在执行的任务，指定工作流ID和执行ID去终止对应的任务，返回终止操作状态。（注：接口目前开放的region为：华北-北京四,华东-上海一,华东-上海二,华南-广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopExecutionRequest 请求对象
     * @return AsyncInvoker<StopExecutionRequest, StopExecutionResponse>
     */
    public AsyncInvoker<StopExecutionRequest, StopExecutionResponse> stopExecutionAsyncInvoker(
        StopExecutionRequest request) {
        return new AsyncInvoker<>(request, AomMeta.stopExecution, hcClient);
    }

    /**
     * 更新任务
     *
     * 更新定时任务的启停状态，可启动定时任务或停止定时任务，返回操作任务结果。（注：接口目前开放的region为：华北-北京四,华东-上海一,华东-上海二,华南-广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkflowTriggerStatusRequest 请求对象
     * @return CompletableFuture<UpdateWorkflowTriggerStatusResponse>
     */
    public CompletableFuture<UpdateWorkflowTriggerStatusResponse> updateWorkflowTriggerStatusAsync(
        UpdateWorkflowTriggerStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.updateWorkflowTriggerStatus);
    }

    /**
     * 更新任务
     *
     * 更新定时任务的启停状态，可启动定时任务或停止定时任务，返回操作任务结果。（注：接口目前开放的region为：华北-北京四,华东-上海一,华东-上海二,华南-广州）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkflowTriggerStatusRequest 请求对象
     * @return AsyncInvoker<UpdateWorkflowTriggerStatusRequest, UpdateWorkflowTriggerStatusResponse>
     */
    public AsyncInvoker<UpdateWorkflowTriggerStatusRequest, UpdateWorkflowTriggerStatusResponse> updateWorkflowTriggerStatusAsyncInvoker(
        UpdateWorkflowTriggerStatusRequest request) {
        return new AsyncInvoker<>(request, AomMeta.updateWorkflowTriggerStatus, hcClient);
    }

}

package com.huaweicloud.sdk.functiongraph.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.functiongraph.v2.model.AsyncInvokeFunctionRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.AsyncInvokeFunctionResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.AsyncInvokeReservedFunctionRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.AsyncInvokeReservedFunctionResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.BatchDeleteFunctionTriggersRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.BatchDeleteFunctionTriggersResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.BatchDeleteWorkflowsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.BatchDeleteWorkflowsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.CancelAsyncInvocationRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.CancelAsyncInvocationResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateDependencyRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateDependencyResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateDependencyVersionRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateDependencyVersionResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateEventRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateEventResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateFunctionRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateFunctionResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateFunctionTriggerRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateFunctionTriggerResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateFunctionVersionRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateFunctionVersionResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateTagsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateTagsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateVersionAliasRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateVersionAliasResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateVpcEndpointRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateVpcEndpointResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateWorkflowRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateWorkflowResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteDependencyRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteDependencyResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteDependencyVersionRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteDependencyVersionResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteEventRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteEventResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteFunctionAsyncInvokeConfigRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteFunctionAsyncInvokeConfigResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteFunctionRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteFunctionResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteFunctionTriggerRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteFunctionTriggerResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteTagsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteTagsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteVersionAliasRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteVersionAliasResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteVpcEndpointRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteVpcEndpointResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.EnableLtsLogsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.EnableLtsLogsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ExportFunctionRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ExportFunctionResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ImportFunctionRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ImportFunctionResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.InvokeFunctionRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.InvokeFunctionResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListAsyncInvocationsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListAsyncInvocationsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListDependenciesRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListDependenciesResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListDependencyVersionRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListDependencyVersionResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListEventsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListEventsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionAsMetricRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionAsMetricResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionAsyncInvokeConfigRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionAsyncInvokeConfigResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionReservedInstancesRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionReservedInstancesResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionStatisticsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionStatisticsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionTriggersRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionTriggersResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionVersionsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionVersionsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListQuotasRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListQuotasResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListReservedInstanceConfigsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListReservedInstanceConfigsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListStatisticsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListStatisticsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListVersionAliasesRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListVersionAliasesResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListWorkflowExecutionsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListWorkflowExecutionsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListWorkflowRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListWorkflowResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.RetryWorkFlowRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.RetryWorkFlowResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowDependcyRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowDependcyResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowDependencyVersionRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowDependencyVersionResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowEventRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowEventResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFuncSnapshotStateRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFuncSnapshotStateResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFunctionAsyncInvokeConfigRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFunctionAsyncInvokeConfigResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFunctionCodeRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFunctionCodeResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFunctionConfigRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFunctionConfigResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFunctionTriggerRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFunctionTriggerResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowLtsLogDetailsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowLtsLogDetailsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowProjectTagsListRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowProjectTagsListResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowResInstanceInfoRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowResInstanceInfoResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowTenantMetricRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowTenantMetricResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowTracingRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowTracingResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowVersionAliasRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowVersionAliasResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowWorkFlowMetricRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowWorkFlowMetricResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowWorkFlowRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowWorkFlowResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowWorkflowExecutionForPageRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowWorkflowExecutionForPageResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowWorkflowExecutionRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowWorkflowExecutionResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.StartSyncWorkflowExecutionRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.StartSyncWorkflowExecutionResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.StartWorkflowExecutionRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.StartWorkflowExecutionResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.StopWorkFlowRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.StopWorkFlowResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateDependcyRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateDependcyResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateEventRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateEventResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFuncSnapshotRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFuncSnapshotResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFunctionAsyncInvokeConfigRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFunctionAsyncInvokeConfigResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFunctionCodeRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFunctionCodeResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFunctionConfigRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFunctionConfigResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFunctionMaxInstanceConfigRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFunctionMaxInstanceConfigResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFunctionReservedInstancesCountRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFunctionReservedInstancesCountResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateTracingRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateTracingResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateTriggerRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateTriggerResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateVersionAliasRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateVersionAliasResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateWorkFlowRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateWorkFlowResponse;

import java.util.concurrent.CompletableFuture;

public class FunctionGraphAsyncClient {

    protected HcClient hcClient;

    public FunctionGraphAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<FunctionGraphAsyncClient> newBuilder() {
        ClientBuilder<FunctionGraphAsyncClient> clientBuilder = new ClientBuilder<>(FunctionGraphAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 异步执行函数
     *
     * 异步执行函数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AsyncInvokeFunctionRequest 请求对象
     * @return CompletableFuture<AsyncInvokeFunctionResponse>
     */
    public CompletableFuture<AsyncInvokeFunctionResponse> asyncInvokeFunctionAsync(AsyncInvokeFunctionRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.asyncInvokeFunction);
    }

    /**
     * 异步执行函数
     *
     * 异步执行函数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AsyncInvokeFunctionRequest 请求对象
     * @return AsyncInvoker<AsyncInvokeFunctionRequest, AsyncInvokeFunctionResponse>
     */
    public AsyncInvoker<AsyncInvokeFunctionRequest, AsyncInvokeFunctionResponse> asyncInvokeFunctionAsyncInvoker(
        AsyncInvokeFunctionRequest request) {
        return new AsyncInvoker<AsyncInvokeFunctionRequest, AsyncInvokeFunctionResponse>(request,
            FunctionGraphMeta.asyncInvokeFunction, hcClient);
    }

    /**
     * 函数异步执行并返回预留实例ID
     *
     * 函数异步执行并返回预留实例ID用于场景指客户端请求执行比较费时任务，不需要同步等待执行完成返回结果，该方法提前返回任务执行对应的预留实例ID, 如果预留实例有异常，可以通过该实例ID把对应实例删除（该接口主要针对白名单用户）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AsyncInvokeReservedFunctionRequest 请求对象
     * @return CompletableFuture<AsyncInvokeReservedFunctionResponse>
     */
    public CompletableFuture<AsyncInvokeReservedFunctionResponse> asyncInvokeReservedFunctionAsync(
        AsyncInvokeReservedFunctionRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.asyncInvokeReservedFunction);
    }

    /**
     * 函数异步执行并返回预留实例ID
     *
     * 函数异步执行并返回预留实例ID用于场景指客户端请求执行比较费时任务，不需要同步等待执行完成返回结果，该方法提前返回任务执行对应的预留实例ID, 如果预留实例有异常，可以通过该实例ID把对应实例删除（该接口主要针对白名单用户）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AsyncInvokeReservedFunctionRequest 请求对象
     * @return AsyncInvoker<AsyncInvokeReservedFunctionRequest, AsyncInvokeReservedFunctionResponse>
     */
    public AsyncInvoker<AsyncInvokeReservedFunctionRequest, AsyncInvokeReservedFunctionResponse> asyncInvokeReservedFunctionAsyncInvoker(
        AsyncInvokeReservedFunctionRequest request) {
        return new AsyncInvoker<AsyncInvokeReservedFunctionRequest, AsyncInvokeReservedFunctionResponse>(request,
            FunctionGraphMeta.asyncInvokeReservedFunction, hcClient);
    }

    /**
     * 删除指定函数的所有触发器
     *
     * 删除指定函数所有触发器设置。
     * 
     * 在提供函数版本且非latest的情况下，删除对应函数版本的触发器。
     * 在提供函数别名的情况下，删除对应函数别名的触发器。
     * 在不提供函数版本（也不提供别名）或版本为latest的情况下，删除该函数所有的触发器（包括所有版本和别名）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteFunctionTriggersRequest 请求对象
     * @return CompletableFuture<BatchDeleteFunctionTriggersResponse>
     */
    public CompletableFuture<BatchDeleteFunctionTriggersResponse> batchDeleteFunctionTriggersAsync(
        BatchDeleteFunctionTriggersRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.batchDeleteFunctionTriggers);
    }

    /**
     * 删除指定函数的所有触发器
     *
     * 删除指定函数所有触发器设置。
     * 
     * 在提供函数版本且非latest的情况下，删除对应函数版本的触发器。
     * 在提供函数别名的情况下，删除对应函数别名的触发器。
     * 在不提供函数版本（也不提供别名）或版本为latest的情况下，删除该函数所有的触发器（包括所有版本和别名）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteFunctionTriggersRequest 请求对象
     * @return AsyncInvoker<BatchDeleteFunctionTriggersRequest, BatchDeleteFunctionTriggersResponse>
     */
    public AsyncInvoker<BatchDeleteFunctionTriggersRequest, BatchDeleteFunctionTriggersResponse> batchDeleteFunctionTriggersAsyncInvoker(
        BatchDeleteFunctionTriggersRequest request) {
        return new AsyncInvoker<BatchDeleteFunctionTriggersRequest, BatchDeleteFunctionTriggersResponse>(request,
            FunctionGraphMeta.batchDeleteFunctionTriggers, hcClient);
    }

    /**
     * 删除函数流
     *
     * 删除函数流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteWorkflowsRequest 请求对象
     * @return CompletableFuture<BatchDeleteWorkflowsResponse>
     */
    public CompletableFuture<BatchDeleteWorkflowsResponse> batchDeleteWorkflowsAsync(
        BatchDeleteWorkflowsRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.batchDeleteWorkflows);
    }

    /**
     * 删除函数流
     *
     * 删除函数流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteWorkflowsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteWorkflowsRequest, BatchDeleteWorkflowsResponse>
     */
    public AsyncInvoker<BatchDeleteWorkflowsRequest, BatchDeleteWorkflowsResponse> batchDeleteWorkflowsAsyncInvoker(
        BatchDeleteWorkflowsRequest request) {
        return new AsyncInvoker<BatchDeleteWorkflowsRequest, BatchDeleteWorkflowsResponse>(request,
            FunctionGraphMeta.batchDeleteWorkflows, hcClient);
    }

    /**
     * 停止函数异步调用请求
     *
     * -| 停止函数异步调用请求 当前仅支持recursive为false且force为true的参数。针对1：N的函数做并发异步调用 停止异步请求时实例同时在执行的其他请求也会被一并停止并返回4208 function invocation canceled 目前仅支持广州和贵阳一
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelAsyncInvocationRequest 请求对象
     * @return CompletableFuture<CancelAsyncInvocationResponse>
     */
    public CompletableFuture<CancelAsyncInvocationResponse> cancelAsyncInvocationAsync(
        CancelAsyncInvocationRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.cancelAsyncInvocation);
    }

    /**
     * 停止函数异步调用请求
     *
     * -| 停止函数异步调用请求 当前仅支持recursive为false且force为true的参数。针对1：N的函数做并发异步调用 停止异步请求时实例同时在执行的其他请求也会被一并停止并返回4208 function invocation canceled 目前仅支持广州和贵阳一
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelAsyncInvocationRequest 请求对象
     * @return AsyncInvoker<CancelAsyncInvocationRequest, CancelAsyncInvocationResponse>
     */
    public AsyncInvoker<CancelAsyncInvocationRequest, CancelAsyncInvocationResponse> cancelAsyncInvocationAsyncInvoker(
        CancelAsyncInvocationRequest request) {
        return new AsyncInvoker<CancelAsyncInvocationRequest, CancelAsyncInvocationResponse>(request,
            FunctionGraphMeta.cancelAsyncInvocation, hcClient);
    }

    /**
     * 创建依赖包
     *
     * 创建依赖包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDependencyRequest 请求对象
     * @return CompletableFuture<CreateDependencyResponse>
     */
    public CompletableFuture<CreateDependencyResponse> createDependencyAsync(CreateDependencyRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.createDependency);
    }

    /**
     * 创建依赖包
     *
     * 创建依赖包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDependencyRequest 请求对象
     * @return AsyncInvoker<CreateDependencyRequest, CreateDependencyResponse>
     */
    public AsyncInvoker<CreateDependencyRequest, CreateDependencyResponse> createDependencyAsyncInvoker(
        CreateDependencyRequest request) {
        return new AsyncInvoker<CreateDependencyRequest, CreateDependencyResponse>(request,
            FunctionGraphMeta.createDependency, hcClient);
    }

    /**
     * 创建依赖包版本
     *
     * 创建依赖包版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDependencyVersionRequest 请求对象
     * @return CompletableFuture<CreateDependencyVersionResponse>
     */
    public CompletableFuture<CreateDependencyVersionResponse> createDependencyVersionAsync(
        CreateDependencyVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.createDependencyVersion);
    }

    /**
     * 创建依赖包版本
     *
     * 创建依赖包版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDependencyVersionRequest 请求对象
     * @return AsyncInvoker<CreateDependencyVersionRequest, CreateDependencyVersionResponse>
     */
    public AsyncInvoker<CreateDependencyVersionRequest, CreateDependencyVersionResponse> createDependencyVersionAsyncInvoker(
        CreateDependencyVersionRequest request) {
        return new AsyncInvoker<CreateDependencyVersionRequest, CreateDependencyVersionResponse>(request,
            FunctionGraphMeta.createDependencyVersion, hcClient);
    }

    /**
     * 创建测试事件
     *
     * 创建测试事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEventRequest 请求对象
     * @return CompletableFuture<CreateEventResponse>
     */
    public CompletableFuture<CreateEventResponse> createEventAsync(CreateEventRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.createEvent);
    }

    /**
     * 创建测试事件
     *
     * 创建测试事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEventRequest 请求对象
     * @return AsyncInvoker<CreateEventRequest, CreateEventResponse>
     */
    public AsyncInvoker<CreateEventRequest, CreateEventResponse> createEventAsyncInvoker(CreateEventRequest request) {
        return new AsyncInvoker<CreateEventRequest, CreateEventResponse>(request, FunctionGraphMeta.createEvent,
            hcClient);
    }

    /**
     * 创建函数
     *
     * 创建指定的函数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFunctionRequest 请求对象
     * @return CompletableFuture<CreateFunctionResponse>
     */
    public CompletableFuture<CreateFunctionResponse> createFunctionAsync(CreateFunctionRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.createFunction);
    }

    /**
     * 创建函数
     *
     * 创建指定的函数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFunctionRequest 请求对象
     * @return AsyncInvoker<CreateFunctionRequest, CreateFunctionResponse>
     */
    public AsyncInvoker<CreateFunctionRequest, CreateFunctionResponse> createFunctionAsyncInvoker(
        CreateFunctionRequest request) {
        return new AsyncInvoker<CreateFunctionRequest, CreateFunctionResponse>(request,
            FunctionGraphMeta.createFunction, hcClient);
    }

    /**
     * 创建触发器
     *
     * 创建触发器。
     * 
     * - 可以创建的触发器类型包括TIMER、APIG、CTS、DDS、DMS、DIS、LTS、OBS、SMN、KAFKA。
     * - DDS和KAFKA触发器创建时默认为DISABLED状态，其他触发器默认为ACTIVE状态。
     * - TIMER、DDS、DMS、KAFKA、LTS触发器支持禁用，其他触发器不支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFunctionTriggerRequest 请求对象
     * @return CompletableFuture<CreateFunctionTriggerResponse>
     */
    public CompletableFuture<CreateFunctionTriggerResponse> createFunctionTriggerAsync(
        CreateFunctionTriggerRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.createFunctionTrigger);
    }

    /**
     * 创建触发器
     *
     * 创建触发器。
     * 
     * - 可以创建的触发器类型包括TIMER、APIG、CTS、DDS、DMS、DIS、LTS、OBS、SMN、KAFKA。
     * - DDS和KAFKA触发器创建时默认为DISABLED状态，其他触发器默认为ACTIVE状态。
     * - TIMER、DDS、DMS、KAFKA、LTS触发器支持禁用，其他触发器不支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFunctionTriggerRequest 请求对象
     * @return AsyncInvoker<CreateFunctionTriggerRequest, CreateFunctionTriggerResponse>
     */
    public AsyncInvoker<CreateFunctionTriggerRequest, CreateFunctionTriggerResponse> createFunctionTriggerAsyncInvoker(
        CreateFunctionTriggerRequest request) {
        return new AsyncInvoker<CreateFunctionTriggerRequest, CreateFunctionTriggerResponse>(request,
            FunctionGraphMeta.createFunctionTrigger, hcClient);
    }

    /**
     * 发布函数版本
     *
     * 发布函数版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFunctionVersionRequest 请求对象
     * @return CompletableFuture<CreateFunctionVersionResponse>
     */
    public CompletableFuture<CreateFunctionVersionResponse> createFunctionVersionAsync(
        CreateFunctionVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.createFunctionVersion);
    }

    /**
     * 发布函数版本
     *
     * 发布函数版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFunctionVersionRequest 请求对象
     * @return AsyncInvoker<CreateFunctionVersionRequest, CreateFunctionVersionResponse>
     */
    public AsyncInvoker<CreateFunctionVersionRequest, CreateFunctionVersionResponse> createFunctionVersionAsyncInvoker(
        CreateFunctionVersionRequest request) {
        return new AsyncInvoker<CreateFunctionVersionRequest, CreateFunctionVersionResponse>(request,
            FunctionGraphMeta.createFunctionVersion, hcClient);
    }

    /**
     * 创建资源标签
     *
     * 创建资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTagsRequest 请求对象
     * @return CompletableFuture<CreateTagsResponse>
     */
    public CompletableFuture<CreateTagsResponse> createTagsAsync(CreateTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.createTags);
    }

    /**
     * 创建资源标签
     *
     * 创建资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTagsRequest 请求对象
     * @return AsyncInvoker<CreateTagsRequest, CreateTagsResponse>
     */
    public AsyncInvoker<CreateTagsRequest, CreateTagsResponse> createTagsAsyncInvoker(CreateTagsRequest request) {
        return new AsyncInvoker<CreateTagsRequest, CreateTagsResponse>(request, FunctionGraphMeta.createTags, hcClient);
    }

    /**
     * 创建函数版本别名
     *
     * 创建函数灰度版本别名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVersionAliasRequest 请求对象
     * @return CompletableFuture<CreateVersionAliasResponse>
     */
    public CompletableFuture<CreateVersionAliasResponse> createVersionAliasAsync(CreateVersionAliasRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.createVersionAlias);
    }

    /**
     * 创建函数版本别名
     *
     * 创建函数灰度版本别名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVersionAliasRequest 请求对象
     * @return AsyncInvoker<CreateVersionAliasRequest, CreateVersionAliasResponse>
     */
    public AsyncInvoker<CreateVersionAliasRequest, CreateVersionAliasResponse> createVersionAliasAsyncInvoker(
        CreateVersionAliasRequest request) {
        return new AsyncInvoker<CreateVersionAliasRequest, CreateVersionAliasResponse>(request,
            FunctionGraphMeta.createVersionAlias, hcClient);
    }

    /**
     * 创建下沉入口
     *
     * 创建下沉入口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVpcEndpointRequest 请求对象
     * @return CompletableFuture<CreateVpcEndpointResponse>
     */
    public CompletableFuture<CreateVpcEndpointResponse> createVpcEndpointAsync(CreateVpcEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.createVpcEndpoint);
    }

    /**
     * 创建下沉入口
     *
     * 创建下沉入口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVpcEndpointRequest 请求对象
     * @return AsyncInvoker<CreateVpcEndpointRequest, CreateVpcEndpointResponse>
     */
    public AsyncInvoker<CreateVpcEndpointRequest, CreateVpcEndpointResponse> createVpcEndpointAsyncInvoker(
        CreateVpcEndpointRequest request) {
        return new AsyncInvoker<CreateVpcEndpointRequest, CreateVpcEndpointResponse>(request,
            FunctionGraphMeta.createVpcEndpoint, hcClient);
    }

    /**
     * 创建函数流
     *
     * 创建函数流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateWorkflowRequest 请求对象
     * @return CompletableFuture<CreateWorkflowResponse>
     */
    public CompletableFuture<CreateWorkflowResponse> createWorkflowAsync(CreateWorkflowRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.createWorkflow);
    }

    /**
     * 创建函数流
     *
     * 创建函数流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateWorkflowRequest 请求对象
     * @return AsyncInvoker<CreateWorkflowRequest, CreateWorkflowResponse>
     */
    public AsyncInvoker<CreateWorkflowRequest, CreateWorkflowResponse> createWorkflowAsyncInvoker(
        CreateWorkflowRequest request) {
        return new AsyncInvoker<CreateWorkflowRequest, CreateWorkflowResponse>(request,
            FunctionGraphMeta.createWorkflow, hcClient);
    }

    /**
     * 删除指定的依赖包
     *
     * 删除指定的依赖包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDependencyRequest 请求对象
     * @return CompletableFuture<DeleteDependencyResponse>
     */
    public CompletableFuture<DeleteDependencyResponse> deleteDependencyAsync(DeleteDependencyRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.deleteDependency);
    }

    /**
     * 删除指定的依赖包
     *
     * 删除指定的依赖包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDependencyRequest 请求对象
     * @return AsyncInvoker<DeleteDependencyRequest, DeleteDependencyResponse>
     */
    public AsyncInvoker<DeleteDependencyRequest, DeleteDependencyResponse> deleteDependencyAsyncInvoker(
        DeleteDependencyRequest request) {
        return new AsyncInvoker<DeleteDependencyRequest, DeleteDependencyResponse>(request,
            FunctionGraphMeta.deleteDependency, hcClient);
    }

    /**
     * 删除依赖包版本
     *
     * 删除依赖包版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDependencyVersionRequest 请求对象
     * @return CompletableFuture<DeleteDependencyVersionResponse>
     */
    public CompletableFuture<DeleteDependencyVersionResponse> deleteDependencyVersionAsync(
        DeleteDependencyVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.deleteDependencyVersion);
    }

    /**
     * 删除依赖包版本
     *
     * 删除依赖包版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDependencyVersionRequest 请求对象
     * @return AsyncInvoker<DeleteDependencyVersionRequest, DeleteDependencyVersionResponse>
     */
    public AsyncInvoker<DeleteDependencyVersionRequest, DeleteDependencyVersionResponse> deleteDependencyVersionAsyncInvoker(
        DeleteDependencyVersionRequest request) {
        return new AsyncInvoker<DeleteDependencyVersionRequest, DeleteDependencyVersionResponse>(request,
            FunctionGraphMeta.deleteDependencyVersion, hcClient);
    }

    /**
     * 删除指定测试事件
     *
     * 删除指定测试事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEventRequest 请求对象
     * @return CompletableFuture<DeleteEventResponse>
     */
    public CompletableFuture<DeleteEventResponse> deleteEventAsync(DeleteEventRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.deleteEvent);
    }

    /**
     * 删除指定测试事件
     *
     * 删除指定测试事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEventRequest 请求对象
     * @return AsyncInvoker<DeleteEventRequest, DeleteEventResponse>
     */
    public AsyncInvoker<DeleteEventRequest, DeleteEventResponse> deleteEventAsyncInvoker(DeleteEventRequest request) {
        return new AsyncInvoker<DeleteEventRequest, DeleteEventResponse>(request, FunctionGraphMeta.deleteEvent,
            hcClient);
    }

    /**
     * 删除函数/版本
     *
     * 删除指定的函数或者特定的版本（不允许删除latest版本）。
     * 
     * 如果URN中包含函数版本或者别名，则删除特定的函数版本或者别名指向的版本以及该版本关联的trigger。
     * 如果URN中不包含版本或者别名，则删除整个函数，包含所有版本以及别名，触发器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFunctionRequest 请求对象
     * @return CompletableFuture<DeleteFunctionResponse>
     */
    public CompletableFuture<DeleteFunctionResponse> deleteFunctionAsync(DeleteFunctionRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.deleteFunction);
    }

    /**
     * 删除函数/版本
     *
     * 删除指定的函数或者特定的版本（不允许删除latest版本）。
     * 
     * 如果URN中包含函数版本或者别名，则删除特定的函数版本或者别名指向的版本以及该版本关联的trigger。
     * 如果URN中不包含版本或者别名，则删除整个函数，包含所有版本以及别名，触发器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFunctionRequest 请求对象
     * @return AsyncInvoker<DeleteFunctionRequest, DeleteFunctionResponse>
     */
    public AsyncInvoker<DeleteFunctionRequest, DeleteFunctionResponse> deleteFunctionAsyncInvoker(
        DeleteFunctionRequest request) {
        return new AsyncInvoker<DeleteFunctionRequest, DeleteFunctionResponse>(request,
            FunctionGraphMeta.deleteFunction, hcClient);
    }

    /**
     * 删除函数异步配置信息
     *
     * 删除函数异步配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFunctionAsyncInvokeConfigRequest 请求对象
     * @return CompletableFuture<DeleteFunctionAsyncInvokeConfigResponse>
     */
    public CompletableFuture<DeleteFunctionAsyncInvokeConfigResponse> deleteFunctionAsyncInvokeConfigAsync(
        DeleteFunctionAsyncInvokeConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.deleteFunctionAsyncInvokeConfig);
    }

    /**
     * 删除函数异步配置信息
     *
     * 删除函数异步配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFunctionAsyncInvokeConfigRequest 请求对象
     * @return AsyncInvoker<DeleteFunctionAsyncInvokeConfigRequest, DeleteFunctionAsyncInvokeConfigResponse>
     */
    public AsyncInvoker<DeleteFunctionAsyncInvokeConfigRequest, DeleteFunctionAsyncInvokeConfigResponse> deleteFunctionAsyncInvokeConfigAsyncInvoker(
        DeleteFunctionAsyncInvokeConfigRequest request) {
        return new AsyncInvoker<DeleteFunctionAsyncInvokeConfigRequest, DeleteFunctionAsyncInvokeConfigResponse>(
            request, FunctionGraphMeta.deleteFunctionAsyncInvokeConfig, hcClient);
    }

    /**
     * 删除触发器
     *
     * 删除触发器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFunctionTriggerRequest 请求对象
     * @return CompletableFuture<DeleteFunctionTriggerResponse>
     */
    public CompletableFuture<DeleteFunctionTriggerResponse> deleteFunctionTriggerAsync(
        DeleteFunctionTriggerRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.deleteFunctionTrigger);
    }

    /**
     * 删除触发器
     *
     * 删除触发器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFunctionTriggerRequest 请求对象
     * @return AsyncInvoker<DeleteFunctionTriggerRequest, DeleteFunctionTriggerResponse>
     */
    public AsyncInvoker<DeleteFunctionTriggerRequest, DeleteFunctionTriggerResponse> deleteFunctionTriggerAsyncInvoker(
        DeleteFunctionTriggerRequest request) {
        return new AsyncInvoker<DeleteFunctionTriggerRequest, DeleteFunctionTriggerResponse>(request,
            FunctionGraphMeta.deleteFunctionTrigger, hcClient);
    }

    /**
     * 删除资源标签
     *
     * 删除资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTagsRequest 请求对象
     * @return CompletableFuture<DeleteTagsResponse>
     */
    public CompletableFuture<DeleteTagsResponse> deleteTagsAsync(DeleteTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.deleteTags);
    }

    /**
     * 删除资源标签
     *
     * 删除资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTagsRequest 请求对象
     * @return AsyncInvoker<DeleteTagsRequest, DeleteTagsResponse>
     */
    public AsyncInvoker<DeleteTagsRequest, DeleteTagsResponse> deleteTagsAsyncInvoker(DeleteTagsRequest request) {
        return new AsyncInvoker<DeleteTagsRequest, DeleteTagsResponse>(request, FunctionGraphMeta.deleteTags, hcClient);
    }

    /**
     * 删除函数版本别名
     *
     * 删除函数版本别名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVersionAliasRequest 请求对象
     * @return CompletableFuture<DeleteVersionAliasResponse>
     */
    public CompletableFuture<DeleteVersionAliasResponse> deleteVersionAliasAsync(DeleteVersionAliasRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.deleteVersionAlias);
    }

    /**
     * 删除函数版本别名
     *
     * 删除函数版本别名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVersionAliasRequest 请求对象
     * @return AsyncInvoker<DeleteVersionAliasRequest, DeleteVersionAliasResponse>
     */
    public AsyncInvoker<DeleteVersionAliasRequest, DeleteVersionAliasResponse> deleteVersionAliasAsyncInvoker(
        DeleteVersionAliasRequest request) {
        return new AsyncInvoker<DeleteVersionAliasRequest, DeleteVersionAliasResponse>(request,
            FunctionGraphMeta.deleteVersionAlias, hcClient);
    }

    /**
     * 删除下沉入口
     *
     * 删除下沉入口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVpcEndpointRequest 请求对象
     * @return CompletableFuture<DeleteVpcEndpointResponse>
     */
    public CompletableFuture<DeleteVpcEndpointResponse> deleteVpcEndpointAsync(DeleteVpcEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.deleteVpcEndpoint);
    }

    /**
     * 删除下沉入口
     *
     * 删除下沉入口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVpcEndpointRequest 请求对象
     * @return AsyncInvoker<DeleteVpcEndpointRequest, DeleteVpcEndpointResponse>
     */
    public AsyncInvoker<DeleteVpcEndpointRequest, DeleteVpcEndpointResponse> deleteVpcEndpointAsyncInvoker(
        DeleteVpcEndpointRequest request) {
        return new AsyncInvoker<DeleteVpcEndpointRequest, DeleteVpcEndpointResponse>(request,
            FunctionGraphMeta.deleteVpcEndpoint, hcClient);
    }

    /**
     * 开通lts日志上报功能
     *
     * 开通lts日志上报功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnableLtsLogsRequest 请求对象
     * @return CompletableFuture<EnableLtsLogsResponse>
     */
    public CompletableFuture<EnableLtsLogsResponse> enableLtsLogsAsync(EnableLtsLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.enableLtsLogs);
    }

    /**
     * 开通lts日志上报功能
     *
     * 开通lts日志上报功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnableLtsLogsRequest 请求对象
     * @return AsyncInvoker<EnableLtsLogsRequest, EnableLtsLogsResponse>
     */
    public AsyncInvoker<EnableLtsLogsRequest, EnableLtsLogsResponse> enableLtsLogsAsyncInvoker(
        EnableLtsLogsRequest request) {
        return new AsyncInvoker<EnableLtsLogsRequest, EnableLtsLogsResponse>(request, FunctionGraphMeta.enableLtsLogs,
            hcClient);
    }

    /**
     * 导出函数
     *
     * 导出函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportFunctionRequest 请求对象
     * @return CompletableFuture<ExportFunctionResponse>
     */
    public CompletableFuture<ExportFunctionResponse> exportFunctionAsync(ExportFunctionRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.exportFunction);
    }

    /**
     * 导出函数
     *
     * 导出函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportFunctionRequest 请求对象
     * @return AsyncInvoker<ExportFunctionRequest, ExportFunctionResponse>
     */
    public AsyncInvoker<ExportFunctionRequest, ExportFunctionResponse> exportFunctionAsyncInvoker(
        ExportFunctionRequest request) {
        return new AsyncInvoker<ExportFunctionRequest, ExportFunctionResponse>(request,
            FunctionGraphMeta.exportFunction, hcClient);
    }

    /**
     * 导入函数
     *
     * 导入函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportFunctionRequest 请求对象
     * @return CompletableFuture<ImportFunctionResponse>
     */
    public CompletableFuture<ImportFunctionResponse> importFunctionAsync(ImportFunctionRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.importFunction);
    }

    /**
     * 导入函数
     *
     * 导入函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportFunctionRequest 请求对象
     * @return AsyncInvoker<ImportFunctionRequest, ImportFunctionResponse>
     */
    public AsyncInvoker<ImportFunctionRequest, ImportFunctionResponse> importFunctionAsyncInvoker(
        ImportFunctionRequest request) {
        return new AsyncInvoker<ImportFunctionRequest, ImportFunctionResponse>(request,
            FunctionGraphMeta.importFunction, hcClient);
    }

    /**
     * 同步执行函数
     *
     * 同步调用指的是客户端请求需要明确等到响应结果，也就是说这样的请求必须得调用到用户的函数，并且等到调用完成才返回。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param InvokeFunctionRequest 请求对象
     * @return CompletableFuture<InvokeFunctionResponse>
     */
    public CompletableFuture<InvokeFunctionResponse> invokeFunctionAsync(InvokeFunctionRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.invokeFunction);
    }

    /**
     * 同步执行函数
     *
     * 同步调用指的是客户端请求需要明确等到响应结果，也就是说这样的请求必须得调用到用户的函数，并且等到调用完成才返回。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param InvokeFunctionRequest 请求对象
     * @return AsyncInvoker<InvokeFunctionRequest, InvokeFunctionResponse>
     */
    public AsyncInvoker<InvokeFunctionRequest, InvokeFunctionResponse> invokeFunctionAsyncInvoker(
        InvokeFunctionRequest request) {
        return new AsyncInvoker<InvokeFunctionRequest, InvokeFunctionResponse>(request,
            FunctionGraphMeta.invokeFunction, hcClient);
    }

    /**
     * 获取函数异步调用请求列表
     *
     * 获取函数异步调用请求列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAsyncInvocationsRequest 请求对象
     * @return CompletableFuture<ListAsyncInvocationsResponse>
     */
    public CompletableFuture<ListAsyncInvocationsResponse> listAsyncInvocationsAsync(
        ListAsyncInvocationsRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.listAsyncInvocations);
    }

    /**
     * 获取函数异步调用请求列表
     *
     * 获取函数异步调用请求列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAsyncInvocationsRequest 请求对象
     * @return AsyncInvoker<ListAsyncInvocationsRequest, ListAsyncInvocationsResponse>
     */
    public AsyncInvoker<ListAsyncInvocationsRequest, ListAsyncInvocationsResponse> listAsyncInvocationsAsyncInvoker(
        ListAsyncInvocationsRequest request) {
        return new AsyncInvoker<ListAsyncInvocationsRequest, ListAsyncInvocationsResponse>(request,
            FunctionGraphMeta.listAsyncInvocations, hcClient);
    }

    /**
     * 获取依赖包列表
     *
     * 获取依赖包列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDependenciesRequest 请求对象
     * @return CompletableFuture<ListDependenciesResponse>
     */
    public CompletableFuture<ListDependenciesResponse> listDependenciesAsync(ListDependenciesRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.listDependencies);
    }

    /**
     * 获取依赖包列表
     *
     * 获取依赖包列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDependenciesRequest 请求对象
     * @return AsyncInvoker<ListDependenciesRequest, ListDependenciesResponse>
     */
    public AsyncInvoker<ListDependenciesRequest, ListDependenciesResponse> listDependenciesAsyncInvoker(
        ListDependenciesRequest request) {
        return new AsyncInvoker<ListDependenciesRequest, ListDependenciesResponse>(request,
            FunctionGraphMeta.listDependencies, hcClient);
    }

    /**
     * 获取依赖包版本列表
     *
     * 获取依赖包版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDependencyVersionRequest 请求对象
     * @return CompletableFuture<ListDependencyVersionResponse>
     */
    public CompletableFuture<ListDependencyVersionResponse> listDependencyVersionAsync(
        ListDependencyVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.listDependencyVersion);
    }

    /**
     * 获取依赖包版本列表
     *
     * 获取依赖包版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDependencyVersionRequest 请求对象
     * @return AsyncInvoker<ListDependencyVersionRequest, ListDependencyVersionResponse>
     */
    public AsyncInvoker<ListDependencyVersionRequest, ListDependencyVersionResponse> listDependencyVersionAsyncInvoker(
        ListDependencyVersionRequest request) {
        return new AsyncInvoker<ListDependencyVersionRequest, ListDependencyVersionResponse>(request,
            FunctionGraphMeta.listDependencyVersion, hcClient);
    }

    /**
     * 获取指定函数的测试事件列表
     *
     * 获取指定函数的测试事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEventsRequest 请求对象
     * @return CompletableFuture<ListEventsResponse>
     */
    public CompletableFuture<ListEventsResponse> listEventsAsync(ListEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.listEvents);
    }

    /**
     * 获取指定函数的测试事件列表
     *
     * 获取指定函数的测试事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEventsRequest 请求对象
     * @return AsyncInvoker<ListEventsRequest, ListEventsResponse>
     */
    public AsyncInvoker<ListEventsRequest, ListEventsResponse> listEventsAsyncInvoker(ListEventsRequest request) {
        return new AsyncInvoker<ListEventsRequest, ListEventsResponse>(request, FunctionGraphMeta.listEvents, hcClient);
    }

    /**
     * 获取按指定指标排序的函数列表
     *
     * 按指定指标排序的函数列表。
     * 
     * 默认统计按错误次数指标统计最近一天失败次数最多的前10个函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFunctionAsMetricRequest 请求对象
     * @return CompletableFuture<ListFunctionAsMetricResponse>
     */
    public CompletableFuture<ListFunctionAsMetricResponse> listFunctionAsMetricAsync(
        ListFunctionAsMetricRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.listFunctionAsMetric);
    }

    /**
     * 获取按指定指标排序的函数列表
     *
     * 按指定指标排序的函数列表。
     * 
     * 默认统计按错误次数指标统计最近一天失败次数最多的前10个函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFunctionAsMetricRequest 请求对象
     * @return AsyncInvoker<ListFunctionAsMetricRequest, ListFunctionAsMetricResponse>
     */
    public AsyncInvoker<ListFunctionAsMetricRequest, ListFunctionAsMetricResponse> listFunctionAsMetricAsyncInvoker(
        ListFunctionAsMetricRequest request) {
        return new AsyncInvoker<ListFunctionAsMetricRequest, ListFunctionAsMetricResponse>(request,
            FunctionGraphMeta.listFunctionAsMetric, hcClient);
    }

    /**
     * 获取函数异步配置列表
     *
     * 获取指定函数所有版本的异步配置列表。。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFunctionAsyncInvokeConfigRequest 请求对象
     * @return CompletableFuture<ListFunctionAsyncInvokeConfigResponse>
     */
    public CompletableFuture<ListFunctionAsyncInvokeConfigResponse> listFunctionAsyncInvokeConfigAsync(
        ListFunctionAsyncInvokeConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.listFunctionAsyncInvokeConfig);
    }

    /**
     * 获取函数异步配置列表
     *
     * 获取指定函数所有版本的异步配置列表。。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFunctionAsyncInvokeConfigRequest 请求对象
     * @return AsyncInvoker<ListFunctionAsyncInvokeConfigRequest, ListFunctionAsyncInvokeConfigResponse>
     */
    public AsyncInvoker<ListFunctionAsyncInvokeConfigRequest, ListFunctionAsyncInvokeConfigResponse> listFunctionAsyncInvokeConfigAsyncInvoker(
        ListFunctionAsyncInvokeConfigRequest request) {
        return new AsyncInvoker<ListFunctionAsyncInvokeConfigRequest, ListFunctionAsyncInvokeConfigResponse>(request,
            FunctionGraphMeta.listFunctionAsyncInvokeConfig, hcClient);
    }

    /**
     * 获取函数预留实例数量
     *
     * 获取函数预留实例数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFunctionReservedInstancesRequest 请求对象
     * @return CompletableFuture<ListFunctionReservedInstancesResponse>
     */
    public CompletableFuture<ListFunctionReservedInstancesResponse> listFunctionReservedInstancesAsync(
        ListFunctionReservedInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.listFunctionReservedInstances);
    }

    /**
     * 获取函数预留实例数量
     *
     * 获取函数预留实例数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFunctionReservedInstancesRequest 请求对象
     * @return AsyncInvoker<ListFunctionReservedInstancesRequest, ListFunctionReservedInstancesResponse>
     */
    public AsyncInvoker<ListFunctionReservedInstancesRequest, ListFunctionReservedInstancesResponse> listFunctionReservedInstancesAsyncInvoker(
        ListFunctionReservedInstancesRequest request) {
        return new AsyncInvoker<ListFunctionReservedInstancesRequest, ListFunctionReservedInstancesResponse>(request,
            FunctionGraphMeta.listFunctionReservedInstances, hcClient);
    }

    /**
     * 获取指定时间段的函数运行指标
     *
     * 获取指定时间段的函数运行指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFunctionStatisticsRequest 请求对象
     * @return CompletableFuture<ListFunctionStatisticsResponse>
     */
    public CompletableFuture<ListFunctionStatisticsResponse> listFunctionStatisticsAsync(
        ListFunctionStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.listFunctionStatistics);
    }

    /**
     * 获取指定时间段的函数运行指标
     *
     * 获取指定时间段的函数运行指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFunctionStatisticsRequest 请求对象
     * @return AsyncInvoker<ListFunctionStatisticsRequest, ListFunctionStatisticsResponse>
     */
    public AsyncInvoker<ListFunctionStatisticsRequest, ListFunctionStatisticsResponse> listFunctionStatisticsAsyncInvoker(
        ListFunctionStatisticsRequest request) {
        return new AsyncInvoker<ListFunctionStatisticsRequest, ListFunctionStatisticsResponse>(request,
            FunctionGraphMeta.listFunctionStatistics, hcClient);
    }

    /**
     * 获取指定函数的所有触发器
     *
     * 获取指定函数的所有触发器设置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFunctionTriggersRequest 请求对象
     * @return CompletableFuture<ListFunctionTriggersResponse>
     */
    public CompletableFuture<ListFunctionTriggersResponse> listFunctionTriggersAsync(
        ListFunctionTriggersRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.listFunctionTriggers);
    }

    /**
     * 获取指定函数的所有触发器
     *
     * 获取指定函数的所有触发器设置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFunctionTriggersRequest 请求对象
     * @return AsyncInvoker<ListFunctionTriggersRequest, ListFunctionTriggersResponse>
     */
    public AsyncInvoker<ListFunctionTriggersRequest, ListFunctionTriggersResponse> listFunctionTriggersAsyncInvoker(
        ListFunctionTriggersRequest request) {
        return new AsyncInvoker<ListFunctionTriggersRequest, ListFunctionTriggersResponse>(request,
            FunctionGraphMeta.listFunctionTriggers, hcClient);
    }

    /**
     * 获取指定函数的版本列表
     *
     * 获取指定函数的版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFunctionVersionsRequest 请求对象
     * @return CompletableFuture<ListFunctionVersionsResponse>
     */
    public CompletableFuture<ListFunctionVersionsResponse> listFunctionVersionsAsync(
        ListFunctionVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.listFunctionVersions);
    }

    /**
     * 获取指定函数的版本列表
     *
     * 获取指定函数的版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFunctionVersionsRequest 请求对象
     * @return AsyncInvoker<ListFunctionVersionsRequest, ListFunctionVersionsResponse>
     */
    public AsyncInvoker<ListFunctionVersionsRequest, ListFunctionVersionsResponse> listFunctionVersionsAsyncInvoker(
        ListFunctionVersionsRequest request) {
        return new AsyncInvoker<ListFunctionVersionsRequest, ListFunctionVersionsResponse>(request,
            FunctionGraphMeta.listFunctionVersions, hcClient);
    }

    /**
     * 获取函数列表
     *
     * 获取函数列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFunctionsRequest 请求对象
     * @return CompletableFuture<ListFunctionsResponse>
     */
    public CompletableFuture<ListFunctionsResponse> listFunctionsAsync(ListFunctionsRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.listFunctions);
    }

    /**
     * 获取函数列表
     *
     * 获取函数列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFunctionsRequest 请求对象
     * @return AsyncInvoker<ListFunctionsRequest, ListFunctionsResponse>
     */
    public AsyncInvoker<ListFunctionsRequest, ListFunctionsResponse> listFunctionsAsyncInvoker(
        ListFunctionsRequest request) {
        return new AsyncInvoker<ListFunctionsRequest, ListFunctionsResponse>(request, FunctionGraphMeta.listFunctions,
            hcClient);
    }

    /**
     * 查询租户配额
     *
     * 查询租户配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
     * @return CompletableFuture<ListQuotasResponse>
     */
    public CompletableFuture<ListQuotasResponse> listQuotasAsync(ListQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.listQuotas);
    }

    /**
     * 查询租户配额
     *
     * 查询租户配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
     * @return AsyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public AsyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasAsyncInvoker(ListQuotasRequest request) {
        return new AsyncInvoker<ListQuotasRequest, ListQuotasResponse>(request, FunctionGraphMeta.listQuotas, hcClient);
    }

    /**
     * 获取函数预留实例配置列表
     *
     * 获取函数预留实例配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListReservedInstanceConfigsRequest 请求对象
     * @return CompletableFuture<ListReservedInstanceConfigsResponse>
     */
    public CompletableFuture<ListReservedInstanceConfigsResponse> listReservedInstanceConfigsAsync(
        ListReservedInstanceConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.listReservedInstanceConfigs);
    }

    /**
     * 获取函数预留实例配置列表
     *
     * 获取函数预留实例配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListReservedInstanceConfigsRequest 请求对象
     * @return AsyncInvoker<ListReservedInstanceConfigsRequest, ListReservedInstanceConfigsResponse>
     */
    public AsyncInvoker<ListReservedInstanceConfigsRequest, ListReservedInstanceConfigsResponse> listReservedInstanceConfigsAsyncInvoker(
        ListReservedInstanceConfigsRequest request) {
        return new AsyncInvoker<ListReservedInstanceConfigsRequest, ListReservedInstanceConfigsResponse>(request,
            FunctionGraphMeta.listReservedInstanceConfigs, hcClient);
    }

    /**
     * 租户函数统计信息
     *
     * 租户函数统计信息。
     * 
     * 返回三类的统计信息，函数格式和大小使用情况包括配额和使用量，流量报告。
     * 通过查询参数filter可以进行过滤，查询参数period可以指定返回的时间段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStatisticsRequest 请求对象
     * @return CompletableFuture<ListStatisticsResponse>
     */
    public CompletableFuture<ListStatisticsResponse> listStatisticsAsync(ListStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.listStatistics);
    }

    /**
     * 租户函数统计信息
     *
     * 租户函数统计信息。
     * 
     * 返回三类的统计信息，函数格式和大小使用情况包括配额和使用量，流量报告。
     * 通过查询参数filter可以进行过滤，查询参数period可以指定返回的时间段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStatisticsRequest 请求对象
     * @return AsyncInvoker<ListStatisticsRequest, ListStatisticsResponse>
     */
    public AsyncInvoker<ListStatisticsRequest, ListStatisticsResponse> listStatisticsAsyncInvoker(
        ListStatisticsRequest request) {
        return new AsyncInvoker<ListStatisticsRequest, ListStatisticsResponse>(request,
            FunctionGraphMeta.listStatistics, hcClient);
    }

    /**
     * 获取指定函数所有版本别名列表
     *
     * 获取函数版本别名列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVersionAliasesRequest 请求对象
     * @return CompletableFuture<ListVersionAliasesResponse>
     */
    public CompletableFuture<ListVersionAliasesResponse> listVersionAliasesAsync(ListVersionAliasesRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.listVersionAliases);
    }

    /**
     * 获取指定函数所有版本别名列表
     *
     * 获取函数版本别名列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVersionAliasesRequest 请求对象
     * @return AsyncInvoker<ListVersionAliasesRequest, ListVersionAliasesResponse>
     */
    public AsyncInvoker<ListVersionAliasesRequest, ListVersionAliasesResponse> listVersionAliasesAsyncInvoker(
        ListVersionAliasesRequest request) {
        return new AsyncInvoker<ListVersionAliasesRequest, ListVersionAliasesResponse>(request,
            FunctionGraphMeta.listVersionAliases, hcClient);
    }

    /**
     * 查询函数流
     *
     * 查询函数流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkflowRequest 请求对象
     * @return CompletableFuture<ListWorkflowResponse>
     */
    public CompletableFuture<ListWorkflowResponse> listWorkflowAsync(ListWorkflowRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.listWorkflow);
    }

    /**
     * 查询函数流
     *
     * 查询函数流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkflowRequest 请求对象
     * @return AsyncInvoker<ListWorkflowRequest, ListWorkflowResponse>
     */
    public AsyncInvoker<ListWorkflowRequest, ListWorkflowResponse> listWorkflowAsyncInvoker(
        ListWorkflowRequest request) {
        return new AsyncInvoker<ListWorkflowRequest, ListWorkflowResponse>(request, FunctionGraphMeta.listWorkflow,
            hcClient);
    }

    /**
     * 获取指定函数流执行实例列表
     *
     * 获取指定函数流执行实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkflowExecutionsRequest 请求对象
     * @return CompletableFuture<ListWorkflowExecutionsResponse>
     */
    public CompletableFuture<ListWorkflowExecutionsResponse> listWorkflowExecutionsAsync(
        ListWorkflowExecutionsRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.listWorkflowExecutions);
    }

    /**
     * 获取指定函数流执行实例列表
     *
     * 获取指定函数流执行实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkflowExecutionsRequest 请求对象
     * @return AsyncInvoker<ListWorkflowExecutionsRequest, ListWorkflowExecutionsResponse>
     */
    public AsyncInvoker<ListWorkflowExecutionsRequest, ListWorkflowExecutionsResponse> listWorkflowExecutionsAsyncInvoker(
        ListWorkflowExecutionsRequest request) {
        return new AsyncInvoker<ListWorkflowExecutionsRequest, ListWorkflowExecutionsResponse>(request,
            FunctionGraphMeta.listWorkflowExecutions, hcClient);
    }

    /**
     * 重试函数流
     *
     * 重试函数流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RetryWorkFlowRequest 请求对象
     * @return CompletableFuture<RetryWorkFlowResponse>
     */
    public CompletableFuture<RetryWorkFlowResponse> retryWorkFlowAsync(RetryWorkFlowRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.retryWorkFlow);
    }

    /**
     * 重试函数流
     *
     * 重试函数流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RetryWorkFlowRequest 请求对象
     * @return AsyncInvoker<RetryWorkFlowRequest, RetryWorkFlowResponse>
     */
    public AsyncInvoker<RetryWorkFlowRequest, RetryWorkFlowResponse> retryWorkFlowAsyncInvoker(
        RetryWorkFlowRequest request) {
        return new AsyncInvoker<RetryWorkFlowRequest, RetryWorkFlowResponse>(request, FunctionGraphMeta.retryWorkFlow,
            hcClient);
    }

    /**
     * 获取指定依赖包
     *
     * 获取指定依赖包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDependcyRequest 请求对象
     * @return CompletableFuture<ShowDependcyResponse>
     */
    public CompletableFuture<ShowDependcyResponse> showDependcyAsync(ShowDependcyRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.showDependcy);
    }

    /**
     * 获取指定依赖包
     *
     * 获取指定依赖包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDependcyRequest 请求对象
     * @return AsyncInvoker<ShowDependcyRequest, ShowDependcyResponse>
     */
    public AsyncInvoker<ShowDependcyRequest, ShowDependcyResponse> showDependcyAsyncInvoker(
        ShowDependcyRequest request) {
        return new AsyncInvoker<ShowDependcyRequest, ShowDependcyResponse>(request, FunctionGraphMeta.showDependcy,
            hcClient);
    }

    /**
     * 获取依赖包版本详情
     *
     * 获取依赖包版本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDependencyVersionRequest 请求对象
     * @return CompletableFuture<ShowDependencyVersionResponse>
     */
    public CompletableFuture<ShowDependencyVersionResponse> showDependencyVersionAsync(
        ShowDependencyVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.showDependencyVersion);
    }

    /**
     * 获取依赖包版本详情
     *
     * 获取依赖包版本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDependencyVersionRequest 请求对象
     * @return AsyncInvoker<ShowDependencyVersionRequest, ShowDependencyVersionResponse>
     */
    public AsyncInvoker<ShowDependencyVersionRequest, ShowDependencyVersionResponse> showDependencyVersionAsyncInvoker(
        ShowDependencyVersionRequest request) {
        return new AsyncInvoker<ShowDependencyVersionRequest, ShowDependencyVersionResponse>(request,
            FunctionGraphMeta.showDependencyVersion, hcClient);
    }

    /**
     * 获取测试事件详细信息
     *
     * 获取测试事件详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEventRequest 请求对象
     * @return CompletableFuture<ShowEventResponse>
     */
    public CompletableFuture<ShowEventResponse> showEventAsync(ShowEventRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.showEvent);
    }

    /**
     * 获取测试事件详细信息
     *
     * 获取测试事件详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEventRequest 请求对象
     * @return AsyncInvoker<ShowEventRequest, ShowEventResponse>
     */
    public AsyncInvoker<ShowEventRequest, ShowEventResponse> showEventAsyncInvoker(ShowEventRequest request) {
        return new AsyncInvoker<ShowEventRequest, ShowEventResponse>(request, FunctionGraphMeta.showEvent, hcClient);
    }

    /**
     * 查询函数快照制作状态
     *
     * 查询函数快照制作状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFuncSnapshotStateRequest 请求对象
     * @return CompletableFuture<ShowFuncSnapshotStateResponse>
     */
    public CompletableFuture<ShowFuncSnapshotStateResponse> showFuncSnapshotStateAsync(
        ShowFuncSnapshotStateRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.showFuncSnapshotState);
    }

    /**
     * 查询函数快照制作状态
     *
     * 查询函数快照制作状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFuncSnapshotStateRequest 请求对象
     * @return AsyncInvoker<ShowFuncSnapshotStateRequest, ShowFuncSnapshotStateResponse>
     */
    public AsyncInvoker<ShowFuncSnapshotStateRequest, ShowFuncSnapshotStateResponse> showFuncSnapshotStateAsyncInvoker(
        ShowFuncSnapshotStateRequest request) {
        return new AsyncInvoker<ShowFuncSnapshotStateRequest, ShowFuncSnapshotStateResponse>(request,
            FunctionGraphMeta.showFuncSnapshotState, hcClient);
    }

    /**
     * 获取函数异步配置信息
     *
     * 获取指定函数某一版本的异步配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFunctionAsyncInvokeConfigRequest 请求对象
     * @return CompletableFuture<ShowFunctionAsyncInvokeConfigResponse>
     */
    public CompletableFuture<ShowFunctionAsyncInvokeConfigResponse> showFunctionAsyncInvokeConfigAsync(
        ShowFunctionAsyncInvokeConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.showFunctionAsyncInvokeConfig);
    }

    /**
     * 获取函数异步配置信息
     *
     * 获取指定函数某一版本的异步配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFunctionAsyncInvokeConfigRequest 请求对象
     * @return AsyncInvoker<ShowFunctionAsyncInvokeConfigRequest, ShowFunctionAsyncInvokeConfigResponse>
     */
    public AsyncInvoker<ShowFunctionAsyncInvokeConfigRequest, ShowFunctionAsyncInvokeConfigResponse> showFunctionAsyncInvokeConfigAsyncInvoker(
        ShowFunctionAsyncInvokeConfigRequest request) {
        return new AsyncInvoker<ShowFunctionAsyncInvokeConfigRequest, ShowFunctionAsyncInvokeConfigResponse>(request,
            FunctionGraphMeta.showFunctionAsyncInvokeConfig, hcClient);
    }

    /**
     * 获取指定函数代码
     *
     * 获取指定函数的代码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFunctionCodeRequest 请求对象
     * @return CompletableFuture<ShowFunctionCodeResponse>
     */
    public CompletableFuture<ShowFunctionCodeResponse> showFunctionCodeAsync(ShowFunctionCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.showFunctionCode);
    }

    /**
     * 获取指定函数代码
     *
     * 获取指定函数的代码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFunctionCodeRequest 请求对象
     * @return AsyncInvoker<ShowFunctionCodeRequest, ShowFunctionCodeResponse>
     */
    public AsyncInvoker<ShowFunctionCodeRequest, ShowFunctionCodeResponse> showFunctionCodeAsyncInvoker(
        ShowFunctionCodeRequest request) {
        return new AsyncInvoker<ShowFunctionCodeRequest, ShowFunctionCodeResponse>(request,
            FunctionGraphMeta.showFunctionCode, hcClient);
    }

    /**
     * 获取函数的metadata
     *
     * 获取指定函数的metadata。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFunctionConfigRequest 请求对象
     * @return CompletableFuture<ShowFunctionConfigResponse>
     */
    public CompletableFuture<ShowFunctionConfigResponse> showFunctionConfigAsync(ShowFunctionConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.showFunctionConfig);
    }

    /**
     * 获取函数的metadata
     *
     * 获取指定函数的metadata。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFunctionConfigRequest 请求对象
     * @return AsyncInvoker<ShowFunctionConfigRequest, ShowFunctionConfigResponse>
     */
    public AsyncInvoker<ShowFunctionConfigRequest, ShowFunctionConfigResponse> showFunctionConfigAsyncInvoker(
        ShowFunctionConfigRequest request) {
        return new AsyncInvoker<ShowFunctionConfigRequest, ShowFunctionConfigResponse>(request,
            FunctionGraphMeta.showFunctionConfig, hcClient);
    }

    /**
     * 获取指定触发器的信息
     *
     * 获取特定触发器的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFunctionTriggerRequest 请求对象
     * @return CompletableFuture<ShowFunctionTriggerResponse>
     */
    public CompletableFuture<ShowFunctionTriggerResponse> showFunctionTriggerAsync(ShowFunctionTriggerRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.showFunctionTrigger);
    }

    /**
     * 获取指定触发器的信息
     *
     * 获取特定触发器的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFunctionTriggerRequest 请求对象
     * @return AsyncInvoker<ShowFunctionTriggerRequest, ShowFunctionTriggerResponse>
     */
    public AsyncInvoker<ShowFunctionTriggerRequest, ShowFunctionTriggerResponse> showFunctionTriggerAsyncInvoker(
        ShowFunctionTriggerRequest request) {
        return new AsyncInvoker<ShowFunctionTriggerRequest, ShowFunctionTriggerResponse>(request,
            FunctionGraphMeta.showFunctionTrigger, hcClient);
    }

    /**
     * 获取指定函数的lts日志组日志流配置
     *
     * 获取指定函数的lts日志组日志流配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLtsLogDetailsRequest 请求对象
     * @return CompletableFuture<ShowLtsLogDetailsResponse>
     */
    public CompletableFuture<ShowLtsLogDetailsResponse> showLtsLogDetailsAsync(ShowLtsLogDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.showLtsLogDetails);
    }

    /**
     * 获取指定函数的lts日志组日志流配置
     *
     * 获取指定函数的lts日志组日志流配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLtsLogDetailsRequest 请求对象
     * @return AsyncInvoker<ShowLtsLogDetailsRequest, ShowLtsLogDetailsResponse>
     */
    public AsyncInvoker<ShowLtsLogDetailsRequest, ShowLtsLogDetailsResponse> showLtsLogDetailsAsyncInvoker(
        ShowLtsLogDetailsRequest request) {
        return new AsyncInvoker<ShowLtsLogDetailsRequest, ShowLtsLogDetailsResponse>(request,
            FunctionGraphMeta.showLtsLogDetails, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectTagsListRequest 请求对象
     * @return CompletableFuture<ShowProjectTagsListResponse>
     */
    public CompletableFuture<ShowProjectTagsListResponse> showProjectTagsListAsync(ShowProjectTagsListRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.showProjectTagsList);
    }

    /**
     * 查询资源标签
     *
     * 查询资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectTagsListRequest 请求对象
     * @return AsyncInvoker<ShowProjectTagsListRequest, ShowProjectTagsListResponse>
     */
    public AsyncInvoker<ShowProjectTagsListRequest, ShowProjectTagsListResponse> showProjectTagsListAsyncInvoker(
        ShowProjectTagsListRequest request) {
        return new AsyncInvoker<ShowProjectTagsListRequest, ShowProjectTagsListResponse>(request,
            FunctionGraphMeta.showProjectTagsList, hcClient);
    }

    /**
     * 查询资源实例
     *
     * 查询资源实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResInstanceInfoRequest 请求对象
     * @return CompletableFuture<ShowResInstanceInfoResponse>
     */
    public CompletableFuture<ShowResInstanceInfoResponse> showResInstanceInfoAsync(ShowResInstanceInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.showResInstanceInfo);
    }

    /**
     * 查询资源实例
     *
     * 查询资源实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResInstanceInfoRequest 请求对象
     * @return AsyncInvoker<ShowResInstanceInfoRequest, ShowResInstanceInfoResponse>
     */
    public AsyncInvoker<ShowResInstanceInfoRequest, ShowResInstanceInfoResponse> showResInstanceInfoAsyncInvoker(
        ShowResInstanceInfoRequest request) {
        return new AsyncInvoker<ShowResInstanceInfoRequest, ShowResInstanceInfoResponse>(request,
            FunctionGraphMeta.showResInstanceInfo, hcClient);
    }

    /**
     * 获取函数流指标
     *
     * 获取函数流指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTenantMetricRequest 请求对象
     * @return CompletableFuture<ShowTenantMetricResponse>
     */
    public CompletableFuture<ShowTenantMetricResponse> showTenantMetricAsync(ShowTenantMetricRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.showTenantMetric);
    }

    /**
     * 获取函数流指标
     *
     * 获取函数流指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTenantMetricRequest 请求对象
     * @return AsyncInvoker<ShowTenantMetricRequest, ShowTenantMetricResponse>
     */
    public AsyncInvoker<ShowTenantMetricRequest, ShowTenantMetricResponse> showTenantMetricAsyncInvoker(
        ShowTenantMetricRequest request) {
        return new AsyncInvoker<ShowTenantMetricRequest, ShowTenantMetricResponse>(request,
            FunctionGraphMeta.showTenantMetric, hcClient);
    }

    /**
     * 获取函数调用链配置
     *
     * 获取函数调用链配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTracingRequest 请求对象
     * @return CompletableFuture<ShowTracingResponse>
     */
    public CompletableFuture<ShowTracingResponse> showTracingAsync(ShowTracingRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.showTracing);
    }

    /**
     * 获取函数调用链配置
     *
     * 获取函数调用链配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTracingRequest 请求对象
     * @return AsyncInvoker<ShowTracingRequest, ShowTracingResponse>
     */
    public AsyncInvoker<ShowTracingRequest, ShowTracingResponse> showTracingAsyncInvoker(ShowTracingRequest request) {
        return new AsyncInvoker<ShowTracingRequest, ShowTracingResponse>(request, FunctionGraphMeta.showTracing,
            hcClient);
    }

    /**
     * 获取函数版本的指定别名信息
     *
     * 获取函数指定的版本别名信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVersionAliasRequest 请求对象
     * @return CompletableFuture<ShowVersionAliasResponse>
     */
    public CompletableFuture<ShowVersionAliasResponse> showVersionAliasAsync(ShowVersionAliasRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.showVersionAlias);
    }

    /**
     * 获取函数版本的指定别名信息
     *
     * 获取函数指定的版本别名信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVersionAliasRequest 请求对象
     * @return AsyncInvoker<ShowVersionAliasRequest, ShowVersionAliasResponse>
     */
    public AsyncInvoker<ShowVersionAliasRequest, ShowVersionAliasResponse> showVersionAliasAsyncInvoker(
        ShowVersionAliasRequest request) {
        return new AsyncInvoker<ShowVersionAliasRequest, ShowVersionAliasResponse>(request,
            FunctionGraphMeta.showVersionAlias, hcClient);
    }

    /**
     * 获取指定函数流实例的元数据
     *
     * 获取指定函数流实例的元数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowWorkFlowRequest 请求对象
     * @return CompletableFuture<ShowWorkFlowResponse>
     */
    public CompletableFuture<ShowWorkFlowResponse> showWorkFlowAsync(ShowWorkFlowRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.showWorkFlow);
    }

    /**
     * 获取指定函数流实例的元数据
     *
     * 获取指定函数流实例的元数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowWorkFlowRequest 请求对象
     * @return AsyncInvoker<ShowWorkFlowRequest, ShowWorkFlowResponse>
     */
    public AsyncInvoker<ShowWorkFlowRequest, ShowWorkFlowResponse> showWorkFlowAsyncInvoker(
        ShowWorkFlowRequest request) {
        return new AsyncInvoker<ShowWorkFlowRequest, ShowWorkFlowResponse>(request, FunctionGraphMeta.showWorkFlow,
            hcClient);
    }

    /**
     * 获取指定函数流指标
     *
     * 获取指定函数流指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowWorkFlowMetricRequest 请求对象
     * @return CompletableFuture<ShowWorkFlowMetricResponse>
     */
    public CompletableFuture<ShowWorkFlowMetricResponse> showWorkFlowMetricAsync(ShowWorkFlowMetricRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.showWorkFlowMetric);
    }

    /**
     * 获取指定函数流指标
     *
     * 获取指定函数流指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowWorkFlowMetricRequest 请求对象
     * @return AsyncInvoker<ShowWorkFlowMetricRequest, ShowWorkFlowMetricResponse>
     */
    public AsyncInvoker<ShowWorkFlowMetricRequest, ShowWorkFlowMetricResponse> showWorkFlowMetricAsyncInvoker(
        ShowWorkFlowMetricRequest request) {
        return new AsyncInvoker<ShowWorkFlowMetricRequest, ShowWorkFlowMetricResponse>(request,
            FunctionGraphMeta.showWorkFlowMetric, hcClient);
    }

    /**
     * 获取指定函数流执行实例
     *
     * 获取指定函数流执行实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowWorkflowExecutionRequest 请求对象
     * @return CompletableFuture<ShowWorkflowExecutionResponse>
     */
    public CompletableFuture<ShowWorkflowExecutionResponse> showWorkflowExecutionAsync(
        ShowWorkflowExecutionRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.showWorkflowExecution);
    }

    /**
     * 获取指定函数流执行实例
     *
     * 获取指定函数流执行实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowWorkflowExecutionRequest 请求对象
     * @return AsyncInvoker<ShowWorkflowExecutionRequest, ShowWorkflowExecutionResponse>
     */
    public AsyncInvoker<ShowWorkflowExecutionRequest, ShowWorkflowExecutionResponse> showWorkflowExecutionAsyncInvoker(
        ShowWorkflowExecutionRequest request) {
        return new AsyncInvoker<ShowWorkflowExecutionRequest, ShowWorkflowExecutionResponse>(request,
            FunctionGraphMeta.showWorkflowExecution, hcClient);
    }

    /**
     * 分页获取指定函数流执行实例列表
     *
     * 分页获取指定函数流执行实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowWorkflowExecutionForPageRequest 请求对象
     * @return CompletableFuture<ShowWorkflowExecutionForPageResponse>
     */
    public CompletableFuture<ShowWorkflowExecutionForPageResponse> showWorkflowExecutionForPageAsync(
        ShowWorkflowExecutionForPageRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.showWorkflowExecutionForPage);
    }

    /**
     * 分页获取指定函数流执行实例列表
     *
     * 分页获取指定函数流执行实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowWorkflowExecutionForPageRequest 请求对象
     * @return AsyncInvoker<ShowWorkflowExecutionForPageRequest, ShowWorkflowExecutionForPageResponse>
     */
    public AsyncInvoker<ShowWorkflowExecutionForPageRequest, ShowWorkflowExecutionForPageResponse> showWorkflowExecutionForPageAsyncInvoker(
        ShowWorkflowExecutionForPageRequest request) {
        return new AsyncInvoker<ShowWorkflowExecutionForPageRequest, ShowWorkflowExecutionForPageResponse>(request,
            FunctionGraphMeta.showWorkflowExecutionForPage, hcClient);
    }

    /**
     * 同步执行函数流
     *
     * 以同步执行方式启动函数流（仅快速模式函数流支持）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartSyncWorkflowExecutionRequest 请求对象
     * @return CompletableFuture<StartSyncWorkflowExecutionResponse>
     */
    public CompletableFuture<StartSyncWorkflowExecutionResponse> startSyncWorkflowExecutionAsync(
        StartSyncWorkflowExecutionRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.startSyncWorkflowExecution);
    }

    /**
     * 同步执行函数流
     *
     * 以同步执行方式启动函数流（仅快速模式函数流支持）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartSyncWorkflowExecutionRequest 请求对象
     * @return AsyncInvoker<StartSyncWorkflowExecutionRequest, StartSyncWorkflowExecutionResponse>
     */
    public AsyncInvoker<StartSyncWorkflowExecutionRequest, StartSyncWorkflowExecutionResponse> startSyncWorkflowExecutionAsyncInvoker(
        StartSyncWorkflowExecutionRequest request) {
        return new AsyncInvoker<StartSyncWorkflowExecutionRequest, StartSyncWorkflowExecutionResponse>(request,
            FunctionGraphMeta.startSyncWorkflowExecution, hcClient);
    }

    /**
     * 开始执行函数流
     *
     * 以异步执行方式启动函数流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartWorkflowExecutionRequest 请求对象
     * @return CompletableFuture<StartWorkflowExecutionResponse>
     */
    public CompletableFuture<StartWorkflowExecutionResponse> startWorkflowExecutionAsync(
        StartWorkflowExecutionRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.startWorkflowExecution);
    }

    /**
     * 开始执行函数流
     *
     * 以异步执行方式启动函数流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartWorkflowExecutionRequest 请求对象
     * @return AsyncInvoker<StartWorkflowExecutionRequest, StartWorkflowExecutionResponse>
     */
    public AsyncInvoker<StartWorkflowExecutionRequest, StartWorkflowExecutionResponse> startWorkflowExecutionAsyncInvoker(
        StartWorkflowExecutionRequest request) {
        return new AsyncInvoker<StartWorkflowExecutionRequest, StartWorkflowExecutionResponse>(request,
            FunctionGraphMeta.startWorkflowExecution, hcClient);
    }

    /**
     * 停止函数流
     *
     * 停止函数流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopWorkFlowRequest 请求对象
     * @return CompletableFuture<StopWorkFlowResponse>
     */
    public CompletableFuture<StopWorkFlowResponse> stopWorkFlowAsync(StopWorkFlowRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.stopWorkFlow);
    }

    /**
     * 停止函数流
     *
     * 停止函数流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopWorkFlowRequest 请求对象
     * @return AsyncInvoker<StopWorkFlowRequest, StopWorkFlowResponse>
     */
    public AsyncInvoker<StopWorkFlowRequest, StopWorkFlowResponse> stopWorkFlowAsyncInvoker(
        StopWorkFlowRequest request) {
        return new AsyncInvoker<StopWorkFlowRequest, StopWorkFlowResponse>(request, FunctionGraphMeta.stopWorkFlow,
            hcClient);
    }

    /**
     * 更新指定依赖包
     *
     * 更新指定依赖包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDependcyRequest 请求对象
     * @return CompletableFuture<UpdateDependcyResponse>
     */
    public CompletableFuture<UpdateDependcyResponse> updateDependcyAsync(UpdateDependcyRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.updateDependcy);
    }

    /**
     * 更新指定依赖包
     *
     * 更新指定依赖包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDependcyRequest 请求对象
     * @return AsyncInvoker<UpdateDependcyRequest, UpdateDependcyResponse>
     */
    public AsyncInvoker<UpdateDependcyRequest, UpdateDependcyResponse> updateDependcyAsyncInvoker(
        UpdateDependcyRequest request) {
        return new AsyncInvoker<UpdateDependcyRequest, UpdateDependcyResponse>(request,
            FunctionGraphMeta.updateDependcy, hcClient);
    }

    /**
     * 更新测试事件详细信息
     *
     * 更新测试事件详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEventRequest 请求对象
     * @return CompletableFuture<UpdateEventResponse>
     */
    public CompletableFuture<UpdateEventResponse> updateEventAsync(UpdateEventRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.updateEvent);
    }

    /**
     * 更新测试事件详细信息
     *
     * 更新测试事件详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEventRequest 请求对象
     * @return AsyncInvoker<UpdateEventRequest, UpdateEventResponse>
     */
    public AsyncInvoker<UpdateEventRequest, UpdateEventResponse> updateEventAsyncInvoker(UpdateEventRequest request) {
        return new AsyncInvoker<UpdateEventRequest, UpdateEventResponse>(request, FunctionGraphMeta.updateEvent,
            hcClient);
    }

    /**
     * 禁用/启动函数快照
     *
     * 禁用/启动函数快照
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFuncSnapshotRequest 请求对象
     * @return CompletableFuture<UpdateFuncSnapshotResponse>
     */
    public CompletableFuture<UpdateFuncSnapshotResponse> updateFuncSnapshotAsync(UpdateFuncSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.updateFuncSnapshot);
    }

    /**
     * 禁用/启动函数快照
     *
     * 禁用/启动函数快照
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFuncSnapshotRequest 请求对象
     * @return AsyncInvoker<UpdateFuncSnapshotRequest, UpdateFuncSnapshotResponse>
     */
    public AsyncInvoker<UpdateFuncSnapshotRequest, UpdateFuncSnapshotResponse> updateFuncSnapshotAsyncInvoker(
        UpdateFuncSnapshotRequest request) {
        return new AsyncInvoker<UpdateFuncSnapshotRequest, UpdateFuncSnapshotResponse>(request,
            FunctionGraphMeta.updateFuncSnapshot, hcClient);
    }

    /**
     * 设置函数异步配置信息
     *
     * 设置函数异步配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFunctionAsyncInvokeConfigRequest 请求对象
     * @return CompletableFuture<UpdateFunctionAsyncInvokeConfigResponse>
     */
    public CompletableFuture<UpdateFunctionAsyncInvokeConfigResponse> updateFunctionAsyncInvokeConfigAsync(
        UpdateFunctionAsyncInvokeConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.updateFunctionAsyncInvokeConfig);
    }

    /**
     * 设置函数异步配置信息
     *
     * 设置函数异步配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFunctionAsyncInvokeConfigRequest 请求对象
     * @return AsyncInvoker<UpdateFunctionAsyncInvokeConfigRequest, UpdateFunctionAsyncInvokeConfigResponse>
     */
    public AsyncInvoker<UpdateFunctionAsyncInvokeConfigRequest, UpdateFunctionAsyncInvokeConfigResponse> updateFunctionAsyncInvokeConfigAsyncInvoker(
        UpdateFunctionAsyncInvokeConfigRequest request) {
        return new AsyncInvoker<UpdateFunctionAsyncInvokeConfigRequest, UpdateFunctionAsyncInvokeConfigResponse>(
            request, FunctionGraphMeta.updateFunctionAsyncInvokeConfig, hcClient);
    }

    /**
     * 修改函数代码
     *
     * 修改指定的函数的代码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFunctionCodeRequest 请求对象
     * @return CompletableFuture<UpdateFunctionCodeResponse>
     */
    public CompletableFuture<UpdateFunctionCodeResponse> updateFunctionCodeAsync(UpdateFunctionCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.updateFunctionCode);
    }

    /**
     * 修改函数代码
     *
     * 修改指定的函数的代码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFunctionCodeRequest 请求对象
     * @return AsyncInvoker<UpdateFunctionCodeRequest, UpdateFunctionCodeResponse>
     */
    public AsyncInvoker<UpdateFunctionCodeRequest, UpdateFunctionCodeResponse> updateFunctionCodeAsyncInvoker(
        UpdateFunctionCodeRequest request) {
        return new AsyncInvoker<UpdateFunctionCodeRequest, UpdateFunctionCodeResponse>(request,
            FunctionGraphMeta.updateFunctionCode, hcClient);
    }

    /**
     * 修改函数的metadata信息
     *
     * 修改指定的函数的metadata信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFunctionConfigRequest 请求对象
     * @return CompletableFuture<UpdateFunctionConfigResponse>
     */
    public CompletableFuture<UpdateFunctionConfigResponse> updateFunctionConfigAsync(
        UpdateFunctionConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.updateFunctionConfig);
    }

    /**
     * 修改函数的metadata信息
     *
     * 修改指定的函数的metadata信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFunctionConfigRequest 请求对象
     * @return AsyncInvoker<UpdateFunctionConfigRequest, UpdateFunctionConfigResponse>
     */
    public AsyncInvoker<UpdateFunctionConfigRequest, UpdateFunctionConfigResponse> updateFunctionConfigAsyncInvoker(
        UpdateFunctionConfigRequest request) {
        return new AsyncInvoker<UpdateFunctionConfigRequest, UpdateFunctionConfigResponse>(request,
            FunctionGraphMeta.updateFunctionConfig, hcClient);
    }

    /**
     * 更新函数最大实例数
     *
     * 更新函数最大实例数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFunctionMaxInstanceConfigRequest 请求对象
     * @return CompletableFuture<UpdateFunctionMaxInstanceConfigResponse>
     */
    public CompletableFuture<UpdateFunctionMaxInstanceConfigResponse> updateFunctionMaxInstanceConfigAsync(
        UpdateFunctionMaxInstanceConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.updateFunctionMaxInstanceConfig);
    }

    /**
     * 更新函数最大实例数
     *
     * 更新函数最大实例数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFunctionMaxInstanceConfigRequest 请求对象
     * @return AsyncInvoker<UpdateFunctionMaxInstanceConfigRequest, UpdateFunctionMaxInstanceConfigResponse>
     */
    public AsyncInvoker<UpdateFunctionMaxInstanceConfigRequest, UpdateFunctionMaxInstanceConfigResponse> updateFunctionMaxInstanceConfigAsyncInvoker(
        UpdateFunctionMaxInstanceConfigRequest request) {
        return new AsyncInvoker<UpdateFunctionMaxInstanceConfigRequest, UpdateFunctionMaxInstanceConfigResponse>(
            request, FunctionGraphMeta.updateFunctionMaxInstanceConfig, hcClient);
    }

    /**
     * 修改函数预留实例数量
     *
     * 修改函数预留实例数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFunctionReservedInstancesCountRequest 请求对象
     * @return CompletableFuture<UpdateFunctionReservedInstancesCountResponse>
     */
    public CompletableFuture<UpdateFunctionReservedInstancesCountResponse> updateFunctionReservedInstancesCountAsync(
        UpdateFunctionReservedInstancesCountRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.updateFunctionReservedInstancesCount);
    }

    /**
     * 修改函数预留实例数量
     *
     * 修改函数预留实例数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFunctionReservedInstancesCountRequest 请求对象
     * @return AsyncInvoker<UpdateFunctionReservedInstancesCountRequest, UpdateFunctionReservedInstancesCountResponse>
     */
    public AsyncInvoker<UpdateFunctionReservedInstancesCountRequest, UpdateFunctionReservedInstancesCountResponse> updateFunctionReservedInstancesCountAsyncInvoker(
        UpdateFunctionReservedInstancesCountRequest request) {
        return new AsyncInvoker<UpdateFunctionReservedInstancesCountRequest, UpdateFunctionReservedInstancesCountResponse>(
            request, FunctionGraphMeta.updateFunctionReservedInstancesCount, hcClient);
    }

    /**
     * 修改函数调用链配置
     *
     * 修改函数调用链配置,开通/修改传入aksk，关闭aksk传空
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTracingRequest 请求对象
     * @return CompletableFuture<UpdateTracingResponse>
     */
    public CompletableFuture<UpdateTracingResponse> updateTracingAsync(UpdateTracingRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.updateTracing);
    }

    /**
     * 修改函数调用链配置
     *
     * 修改函数调用链配置,开通/修改传入aksk，关闭aksk传空
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTracingRequest 请求对象
     * @return AsyncInvoker<UpdateTracingRequest, UpdateTracingResponse>
     */
    public AsyncInvoker<UpdateTracingRequest, UpdateTracingResponse> updateTracingAsyncInvoker(
        UpdateTracingRequest request) {
        return new AsyncInvoker<UpdateTracingRequest, UpdateTracingResponse>(request, FunctionGraphMeta.updateTracing,
            hcClient);
    }

    /**
     * 更新触发器
     *
     * 更新触发器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTriggerRequest 请求对象
     * @return CompletableFuture<UpdateTriggerResponse>
     */
    public CompletableFuture<UpdateTriggerResponse> updateTriggerAsync(UpdateTriggerRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.updateTrigger);
    }

    /**
     * 更新触发器
     *
     * 更新触发器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTriggerRequest 请求对象
     * @return AsyncInvoker<UpdateTriggerRequest, UpdateTriggerResponse>
     */
    public AsyncInvoker<UpdateTriggerRequest, UpdateTriggerResponse> updateTriggerAsyncInvoker(
        UpdateTriggerRequest request) {
        return new AsyncInvoker<UpdateTriggerRequest, UpdateTriggerResponse>(request, FunctionGraphMeta.updateTrigger,
            hcClient);
    }

    /**
     * 修改函数版本别名信息
     *
     * 修改函数版本别名信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVersionAliasRequest 请求对象
     * @return CompletableFuture<UpdateVersionAliasResponse>
     */
    public CompletableFuture<UpdateVersionAliasResponse> updateVersionAliasAsync(UpdateVersionAliasRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.updateVersionAlias);
    }

    /**
     * 修改函数版本别名信息
     *
     * 修改函数版本别名信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVersionAliasRequest 请求对象
     * @return AsyncInvoker<UpdateVersionAliasRequest, UpdateVersionAliasResponse>
     */
    public AsyncInvoker<UpdateVersionAliasRequest, UpdateVersionAliasResponse> updateVersionAliasAsyncInvoker(
        UpdateVersionAliasRequest request) {
        return new AsyncInvoker<UpdateVersionAliasRequest, UpdateVersionAliasResponse>(request,
            FunctionGraphMeta.updateVersionAlias, hcClient);
    }

    /**
     * 修改指定函数流实例的元数据
     *
     * 修改指定函数流实例的元数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateWorkFlowRequest 请求对象
     * @return CompletableFuture<UpdateWorkFlowResponse>
     */
    public CompletableFuture<UpdateWorkFlowResponse> updateWorkFlowAsync(UpdateWorkFlowRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.updateWorkFlow);
    }

    /**
     * 修改指定函数流实例的元数据
     *
     * 修改指定函数流实例的元数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateWorkFlowRequest 请求对象
     * @return AsyncInvoker<UpdateWorkFlowRequest, UpdateWorkFlowResponse>
     */
    public AsyncInvoker<UpdateWorkFlowRequest, UpdateWorkFlowResponse> updateWorkFlowAsyncInvoker(
        UpdateWorkFlowRequest request) {
        return new AsyncInvoker<UpdateWorkFlowRequest, UpdateWorkFlowResponse>(request,
            FunctionGraphMeta.updateWorkFlow, hcClient);
    }

}

package com.huaweicloud.sdk.functiongraph.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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
import com.huaweicloud.sdk.functiongraph.v2.model.ListActiveAsyncInvocationsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListActiveAsyncInvocationsResponse;
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

public class FunctionGraphClient {

    protected HcClient hcClient;

    public FunctionGraphClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<FunctionGraphClient> newBuilder() {
        ClientBuilder<FunctionGraphClient> clientBuilder = new ClientBuilder<>(FunctionGraphClient::new);
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
     * @return AsyncInvokeFunctionResponse
     */
    public AsyncInvokeFunctionResponse asyncInvokeFunction(AsyncInvokeFunctionRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.asyncInvokeFunction);
    }

    /**
     * 异步执行函数
     *
     * 异步执行函数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AsyncInvokeFunctionRequest 请求对象
     * @return SyncInvoker<AsyncInvokeFunctionRequest, AsyncInvokeFunctionResponse>
     */
    public SyncInvoker<AsyncInvokeFunctionRequest, AsyncInvokeFunctionResponse> asyncInvokeFunctionInvoker(
        AsyncInvokeFunctionRequest request) {
        return new SyncInvoker<AsyncInvokeFunctionRequest, AsyncInvokeFunctionResponse>(request,
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
     * @return AsyncInvokeReservedFunctionResponse
     */
    public AsyncInvokeReservedFunctionResponse asyncInvokeReservedFunction(AsyncInvokeReservedFunctionRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.asyncInvokeReservedFunction);
    }

    /**
     * 函数异步执行并返回预留实例ID
     *
     * 函数异步执行并返回预留实例ID用于场景指客户端请求执行比较费时任务，不需要同步等待执行完成返回结果，该方法提前返回任务执行对应的预留实例ID, 如果预留实例有异常，可以通过该实例ID把对应实例删除（该接口主要针对白名单用户）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AsyncInvokeReservedFunctionRequest 请求对象
     * @return SyncInvoker<AsyncInvokeReservedFunctionRequest, AsyncInvokeReservedFunctionResponse>
     */
    public SyncInvoker<AsyncInvokeReservedFunctionRequest, AsyncInvokeReservedFunctionResponse> asyncInvokeReservedFunctionInvoker(
        AsyncInvokeReservedFunctionRequest request) {
        return new SyncInvoker<AsyncInvokeReservedFunctionRequest, AsyncInvokeReservedFunctionResponse>(request,
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
     * @return BatchDeleteFunctionTriggersResponse
     */
    public BatchDeleteFunctionTriggersResponse batchDeleteFunctionTriggers(BatchDeleteFunctionTriggersRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.batchDeleteFunctionTriggers);
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
     * @return SyncInvoker<BatchDeleteFunctionTriggersRequest, BatchDeleteFunctionTriggersResponse>
     */
    public SyncInvoker<BatchDeleteFunctionTriggersRequest, BatchDeleteFunctionTriggersResponse> batchDeleteFunctionTriggersInvoker(
        BatchDeleteFunctionTriggersRequest request) {
        return new SyncInvoker<BatchDeleteFunctionTriggersRequest, BatchDeleteFunctionTriggersResponse>(request,
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
     * @return BatchDeleteWorkflowsResponse
     */
    public BatchDeleteWorkflowsResponse batchDeleteWorkflows(BatchDeleteWorkflowsRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.batchDeleteWorkflows);
    }

    /**
     * 删除函数流
     *
     * 删除函数流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteWorkflowsRequest 请求对象
     * @return SyncInvoker<BatchDeleteWorkflowsRequest, BatchDeleteWorkflowsResponse>
     */
    public SyncInvoker<BatchDeleteWorkflowsRequest, BatchDeleteWorkflowsResponse> batchDeleteWorkflowsInvoker(
        BatchDeleteWorkflowsRequest request) {
        return new SyncInvoker<BatchDeleteWorkflowsRequest, BatchDeleteWorkflowsResponse>(request,
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
     * @return CancelAsyncInvocationResponse
     */
    public CancelAsyncInvocationResponse cancelAsyncInvocation(CancelAsyncInvocationRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.cancelAsyncInvocation);
    }

    /**
     * 停止函数异步调用请求
     *
     * -| 停止函数异步调用请求 当前仅支持recursive为false且force为true的参数。针对1：N的函数做并发异步调用 停止异步请求时实例同时在执行的其他请求也会被一并停止并返回4208 function invocation canceled 目前仅支持广州和贵阳一
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelAsyncInvocationRequest 请求对象
     * @return SyncInvoker<CancelAsyncInvocationRequest, CancelAsyncInvocationResponse>
     */
    public SyncInvoker<CancelAsyncInvocationRequest, CancelAsyncInvocationResponse> cancelAsyncInvocationInvoker(
        CancelAsyncInvocationRequest request) {
        return new SyncInvoker<CancelAsyncInvocationRequest, CancelAsyncInvocationResponse>(request,
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
     * @return CreateDependencyResponse
     */
    public CreateDependencyResponse createDependency(CreateDependencyRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.createDependency);
    }

    /**
     * 创建依赖包
     *
     * 创建依赖包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDependencyRequest 请求对象
     * @return SyncInvoker<CreateDependencyRequest, CreateDependencyResponse>
     */
    public SyncInvoker<CreateDependencyRequest, CreateDependencyResponse> createDependencyInvoker(
        CreateDependencyRequest request) {
        return new SyncInvoker<CreateDependencyRequest, CreateDependencyResponse>(request,
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
     * @return CreateDependencyVersionResponse
     */
    public CreateDependencyVersionResponse createDependencyVersion(CreateDependencyVersionRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.createDependencyVersion);
    }

    /**
     * 创建依赖包版本
     *
     * 创建依赖包版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDependencyVersionRequest 请求对象
     * @return SyncInvoker<CreateDependencyVersionRequest, CreateDependencyVersionResponse>
     */
    public SyncInvoker<CreateDependencyVersionRequest, CreateDependencyVersionResponse> createDependencyVersionInvoker(
        CreateDependencyVersionRequest request) {
        return new SyncInvoker<CreateDependencyVersionRequest, CreateDependencyVersionResponse>(request,
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
     * @return CreateEventResponse
     */
    public CreateEventResponse createEvent(CreateEventRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.createEvent);
    }

    /**
     * 创建测试事件
     *
     * 创建测试事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEventRequest 请求对象
     * @return SyncInvoker<CreateEventRequest, CreateEventResponse>
     */
    public SyncInvoker<CreateEventRequest, CreateEventResponse> createEventInvoker(CreateEventRequest request) {
        return new SyncInvoker<CreateEventRequest, CreateEventResponse>(request, FunctionGraphMeta.createEvent,
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
     * @return CreateFunctionResponse
     */
    public CreateFunctionResponse createFunction(CreateFunctionRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.createFunction);
    }

    /**
     * 创建函数
     *
     * 创建指定的函数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFunctionRequest 请求对象
     * @return SyncInvoker<CreateFunctionRequest, CreateFunctionResponse>
     */
    public SyncInvoker<CreateFunctionRequest, CreateFunctionResponse> createFunctionInvoker(
        CreateFunctionRequest request) {
        return new SyncInvoker<CreateFunctionRequest, CreateFunctionResponse>(request, FunctionGraphMeta.createFunction,
            hcClient);
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
     * @return CreateFunctionTriggerResponse
     */
    public CreateFunctionTriggerResponse createFunctionTrigger(CreateFunctionTriggerRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.createFunctionTrigger);
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
     * @return SyncInvoker<CreateFunctionTriggerRequest, CreateFunctionTriggerResponse>
     */
    public SyncInvoker<CreateFunctionTriggerRequest, CreateFunctionTriggerResponse> createFunctionTriggerInvoker(
        CreateFunctionTriggerRequest request) {
        return new SyncInvoker<CreateFunctionTriggerRequest, CreateFunctionTriggerResponse>(request,
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
     * @return CreateFunctionVersionResponse
     */
    public CreateFunctionVersionResponse createFunctionVersion(CreateFunctionVersionRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.createFunctionVersion);
    }

    /**
     * 发布函数版本
     *
     * 发布函数版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFunctionVersionRequest 请求对象
     * @return SyncInvoker<CreateFunctionVersionRequest, CreateFunctionVersionResponse>
     */
    public SyncInvoker<CreateFunctionVersionRequest, CreateFunctionVersionResponse> createFunctionVersionInvoker(
        CreateFunctionVersionRequest request) {
        return new SyncInvoker<CreateFunctionVersionRequest, CreateFunctionVersionResponse>(request,
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
     * @return CreateTagsResponse
     */
    public CreateTagsResponse createTags(CreateTagsRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.createTags);
    }

    /**
     * 创建资源标签
     *
     * 创建资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTagsRequest 请求对象
     * @return SyncInvoker<CreateTagsRequest, CreateTagsResponse>
     */
    public SyncInvoker<CreateTagsRequest, CreateTagsResponse> createTagsInvoker(CreateTagsRequest request) {
        return new SyncInvoker<CreateTagsRequest, CreateTagsResponse>(request, FunctionGraphMeta.createTags, hcClient);
    }

    /**
     * 创建函数版本别名
     *
     * 创建函数灰度版本别名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVersionAliasRequest 请求对象
     * @return CreateVersionAliasResponse
     */
    public CreateVersionAliasResponse createVersionAlias(CreateVersionAliasRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.createVersionAlias);
    }

    /**
     * 创建函数版本别名
     *
     * 创建函数灰度版本别名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVersionAliasRequest 请求对象
     * @return SyncInvoker<CreateVersionAliasRequest, CreateVersionAliasResponse>
     */
    public SyncInvoker<CreateVersionAliasRequest, CreateVersionAliasResponse> createVersionAliasInvoker(
        CreateVersionAliasRequest request) {
        return new SyncInvoker<CreateVersionAliasRequest, CreateVersionAliasResponse>(request,
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
     * @return CreateVpcEndpointResponse
     */
    public CreateVpcEndpointResponse createVpcEndpoint(CreateVpcEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.createVpcEndpoint);
    }

    /**
     * 创建下沉入口
     *
     * 创建下沉入口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVpcEndpointRequest 请求对象
     * @return SyncInvoker<CreateVpcEndpointRequest, CreateVpcEndpointResponse>
     */
    public SyncInvoker<CreateVpcEndpointRequest, CreateVpcEndpointResponse> createVpcEndpointInvoker(
        CreateVpcEndpointRequest request) {
        return new SyncInvoker<CreateVpcEndpointRequest, CreateVpcEndpointResponse>(request,
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
     * @return CreateWorkflowResponse
     */
    public CreateWorkflowResponse createWorkflow(CreateWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.createWorkflow);
    }

    /**
     * 创建函数流
     *
     * 创建函数流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateWorkflowRequest 请求对象
     * @return SyncInvoker<CreateWorkflowRequest, CreateWorkflowResponse>
     */
    public SyncInvoker<CreateWorkflowRequest, CreateWorkflowResponse> createWorkflowInvoker(
        CreateWorkflowRequest request) {
        return new SyncInvoker<CreateWorkflowRequest, CreateWorkflowResponse>(request, FunctionGraphMeta.createWorkflow,
            hcClient);
    }

    /**
     * 删除指定的依赖包
     *
     * 删除指定的依赖包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDependencyRequest 请求对象
     * @return DeleteDependencyResponse
     */
    public DeleteDependencyResponse deleteDependency(DeleteDependencyRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.deleteDependency);
    }

    /**
     * 删除指定的依赖包
     *
     * 删除指定的依赖包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDependencyRequest 请求对象
     * @return SyncInvoker<DeleteDependencyRequest, DeleteDependencyResponse>
     */
    public SyncInvoker<DeleteDependencyRequest, DeleteDependencyResponse> deleteDependencyInvoker(
        DeleteDependencyRequest request) {
        return new SyncInvoker<DeleteDependencyRequest, DeleteDependencyResponse>(request,
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
     * @return DeleteDependencyVersionResponse
     */
    public DeleteDependencyVersionResponse deleteDependencyVersion(DeleteDependencyVersionRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.deleteDependencyVersion);
    }

    /**
     * 删除依赖包版本
     *
     * 删除依赖包版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDependencyVersionRequest 请求对象
     * @return SyncInvoker<DeleteDependencyVersionRequest, DeleteDependencyVersionResponse>
     */
    public SyncInvoker<DeleteDependencyVersionRequest, DeleteDependencyVersionResponse> deleteDependencyVersionInvoker(
        DeleteDependencyVersionRequest request) {
        return new SyncInvoker<DeleteDependencyVersionRequest, DeleteDependencyVersionResponse>(request,
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
     * @return DeleteEventResponse
     */
    public DeleteEventResponse deleteEvent(DeleteEventRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.deleteEvent);
    }

    /**
     * 删除指定测试事件
     *
     * 删除指定测试事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEventRequest 请求对象
     * @return SyncInvoker<DeleteEventRequest, DeleteEventResponse>
     */
    public SyncInvoker<DeleteEventRequest, DeleteEventResponse> deleteEventInvoker(DeleteEventRequest request) {
        return new SyncInvoker<DeleteEventRequest, DeleteEventResponse>(request, FunctionGraphMeta.deleteEvent,
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
     * @return DeleteFunctionResponse
     */
    public DeleteFunctionResponse deleteFunction(DeleteFunctionRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.deleteFunction);
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
     * @return SyncInvoker<DeleteFunctionRequest, DeleteFunctionResponse>
     */
    public SyncInvoker<DeleteFunctionRequest, DeleteFunctionResponse> deleteFunctionInvoker(
        DeleteFunctionRequest request) {
        return new SyncInvoker<DeleteFunctionRequest, DeleteFunctionResponse>(request, FunctionGraphMeta.deleteFunction,
            hcClient);
    }

    /**
     * 删除函数异步配置信息
     *
     * 删除函数异步配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFunctionAsyncInvokeConfigRequest 请求对象
     * @return DeleteFunctionAsyncInvokeConfigResponse
     */
    public DeleteFunctionAsyncInvokeConfigResponse deleteFunctionAsyncInvokeConfig(
        DeleteFunctionAsyncInvokeConfigRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.deleteFunctionAsyncInvokeConfig);
    }

    /**
     * 删除函数异步配置信息
     *
     * 删除函数异步配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFunctionAsyncInvokeConfigRequest 请求对象
     * @return SyncInvoker<DeleteFunctionAsyncInvokeConfigRequest, DeleteFunctionAsyncInvokeConfigResponse>
     */
    public SyncInvoker<DeleteFunctionAsyncInvokeConfigRequest, DeleteFunctionAsyncInvokeConfigResponse> deleteFunctionAsyncInvokeConfigInvoker(
        DeleteFunctionAsyncInvokeConfigRequest request) {
        return new SyncInvoker<DeleteFunctionAsyncInvokeConfigRequest, DeleteFunctionAsyncInvokeConfigResponse>(request,
            FunctionGraphMeta.deleteFunctionAsyncInvokeConfig, hcClient);
    }

    /**
     * 删除触发器
     *
     * 删除触发器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFunctionTriggerRequest 请求对象
     * @return DeleteFunctionTriggerResponse
     */
    public DeleteFunctionTriggerResponse deleteFunctionTrigger(DeleteFunctionTriggerRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.deleteFunctionTrigger);
    }

    /**
     * 删除触发器
     *
     * 删除触发器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFunctionTriggerRequest 请求对象
     * @return SyncInvoker<DeleteFunctionTriggerRequest, DeleteFunctionTriggerResponse>
     */
    public SyncInvoker<DeleteFunctionTriggerRequest, DeleteFunctionTriggerResponse> deleteFunctionTriggerInvoker(
        DeleteFunctionTriggerRequest request) {
        return new SyncInvoker<DeleteFunctionTriggerRequest, DeleteFunctionTriggerResponse>(request,
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
     * @return DeleteTagsResponse
     */
    public DeleteTagsResponse deleteTags(DeleteTagsRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.deleteTags);
    }

    /**
     * 删除资源标签
     *
     * 删除资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTagsRequest 请求对象
     * @return SyncInvoker<DeleteTagsRequest, DeleteTagsResponse>
     */
    public SyncInvoker<DeleteTagsRequest, DeleteTagsResponse> deleteTagsInvoker(DeleteTagsRequest request) {
        return new SyncInvoker<DeleteTagsRequest, DeleteTagsResponse>(request, FunctionGraphMeta.deleteTags, hcClient);
    }

    /**
     * 删除函数版本别名
     *
     * 删除函数版本别名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVersionAliasRequest 请求对象
     * @return DeleteVersionAliasResponse
     */
    public DeleteVersionAliasResponse deleteVersionAlias(DeleteVersionAliasRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.deleteVersionAlias);
    }

    /**
     * 删除函数版本别名
     *
     * 删除函数版本别名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVersionAliasRequest 请求对象
     * @return SyncInvoker<DeleteVersionAliasRequest, DeleteVersionAliasResponse>
     */
    public SyncInvoker<DeleteVersionAliasRequest, DeleteVersionAliasResponse> deleteVersionAliasInvoker(
        DeleteVersionAliasRequest request) {
        return new SyncInvoker<DeleteVersionAliasRequest, DeleteVersionAliasResponse>(request,
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
     * @return DeleteVpcEndpointResponse
     */
    public DeleteVpcEndpointResponse deleteVpcEndpoint(DeleteVpcEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.deleteVpcEndpoint);
    }

    /**
     * 删除下沉入口
     *
     * 删除下沉入口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVpcEndpointRequest 请求对象
     * @return SyncInvoker<DeleteVpcEndpointRequest, DeleteVpcEndpointResponse>
     */
    public SyncInvoker<DeleteVpcEndpointRequest, DeleteVpcEndpointResponse> deleteVpcEndpointInvoker(
        DeleteVpcEndpointRequest request) {
        return new SyncInvoker<DeleteVpcEndpointRequest, DeleteVpcEndpointResponse>(request,
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
     * @return EnableLtsLogsResponse
     */
    public EnableLtsLogsResponse enableLtsLogs(EnableLtsLogsRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.enableLtsLogs);
    }

    /**
     * 开通lts日志上报功能
     *
     * 开通lts日志上报功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnableLtsLogsRequest 请求对象
     * @return SyncInvoker<EnableLtsLogsRequest, EnableLtsLogsResponse>
     */
    public SyncInvoker<EnableLtsLogsRequest, EnableLtsLogsResponse> enableLtsLogsInvoker(EnableLtsLogsRequest request) {
        return new SyncInvoker<EnableLtsLogsRequest, EnableLtsLogsResponse>(request, FunctionGraphMeta.enableLtsLogs,
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
     * @return ExportFunctionResponse
     */
    public ExportFunctionResponse exportFunction(ExportFunctionRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.exportFunction);
    }

    /**
     * 导出函数
     *
     * 导出函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExportFunctionRequest 请求对象
     * @return SyncInvoker<ExportFunctionRequest, ExportFunctionResponse>
     */
    public SyncInvoker<ExportFunctionRequest, ExportFunctionResponse> exportFunctionInvoker(
        ExportFunctionRequest request) {
        return new SyncInvoker<ExportFunctionRequest, ExportFunctionResponse>(request, FunctionGraphMeta.exportFunction,
            hcClient);
    }

    /**
     * 导入函数
     *
     * 导入函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportFunctionRequest 请求对象
     * @return ImportFunctionResponse
     */
    public ImportFunctionResponse importFunction(ImportFunctionRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.importFunction);
    }

    /**
     * 导入函数
     *
     * 导入函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ImportFunctionRequest 请求对象
     * @return SyncInvoker<ImportFunctionRequest, ImportFunctionResponse>
     */
    public SyncInvoker<ImportFunctionRequest, ImportFunctionResponse> importFunctionInvoker(
        ImportFunctionRequest request) {
        return new SyncInvoker<ImportFunctionRequest, ImportFunctionResponse>(request, FunctionGraphMeta.importFunction,
            hcClient);
    }

    /**
     * 同步执行函数
     *
     * 同步调用指的是客户端请求需要明确等到响应结果，也就是说这样的请求必须得调用到用户的函数，并且等到调用完成才返回。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param InvokeFunctionRequest 请求对象
     * @return InvokeFunctionResponse
     */
    public InvokeFunctionResponse invokeFunction(InvokeFunctionRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.invokeFunction);
    }

    /**
     * 同步执行函数
     *
     * 同步调用指的是客户端请求需要明确等到响应结果，也就是说这样的请求必须得调用到用户的函数，并且等到调用完成才返回。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param InvokeFunctionRequest 请求对象
     * @return SyncInvoker<InvokeFunctionRequest, InvokeFunctionResponse>
     */
    public SyncInvoker<InvokeFunctionRequest, InvokeFunctionResponse> invokeFunctionInvoker(
        InvokeFunctionRequest request) {
        return new SyncInvoker<InvokeFunctionRequest, InvokeFunctionResponse>(request, FunctionGraphMeta.invokeFunction,
            hcClient);
    }

    /**
     * 获取函数活跃异步调用请求列表
     *
     * 获取函数异步调用活跃请求列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListActiveAsyncInvocationsRequest 请求对象
     * @return ListActiveAsyncInvocationsResponse
     */
    public ListActiveAsyncInvocationsResponse listActiveAsyncInvocations(ListActiveAsyncInvocationsRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listActiveAsyncInvocations);
    }

    /**
     * 获取函数活跃异步调用请求列表
     *
     * 获取函数异步调用活跃请求列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListActiveAsyncInvocationsRequest 请求对象
     * @return SyncInvoker<ListActiveAsyncInvocationsRequest, ListActiveAsyncInvocationsResponse>
     */
    public SyncInvoker<ListActiveAsyncInvocationsRequest, ListActiveAsyncInvocationsResponse> listActiveAsyncInvocationsInvoker(
        ListActiveAsyncInvocationsRequest request) {
        return new SyncInvoker<ListActiveAsyncInvocationsRequest, ListActiveAsyncInvocationsResponse>(request,
            FunctionGraphMeta.listActiveAsyncInvocations, hcClient);
    }

    /**
     * 获取函数异步调用请求列表
     *
     * 获取函数异步调用请求列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAsyncInvocationsRequest 请求对象
     * @return ListAsyncInvocationsResponse
     */
    public ListAsyncInvocationsResponse listAsyncInvocations(ListAsyncInvocationsRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listAsyncInvocations);
    }

    /**
     * 获取函数异步调用请求列表
     *
     * 获取函数异步调用请求列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAsyncInvocationsRequest 请求对象
     * @return SyncInvoker<ListAsyncInvocationsRequest, ListAsyncInvocationsResponse>
     */
    public SyncInvoker<ListAsyncInvocationsRequest, ListAsyncInvocationsResponse> listAsyncInvocationsInvoker(
        ListAsyncInvocationsRequest request) {
        return new SyncInvoker<ListAsyncInvocationsRequest, ListAsyncInvocationsResponse>(request,
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
     * @return ListDependenciesResponse
     */
    public ListDependenciesResponse listDependencies(ListDependenciesRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listDependencies);
    }

    /**
     * 获取依赖包列表
     *
     * 获取依赖包列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDependenciesRequest 请求对象
     * @return SyncInvoker<ListDependenciesRequest, ListDependenciesResponse>
     */
    public SyncInvoker<ListDependenciesRequest, ListDependenciesResponse> listDependenciesInvoker(
        ListDependenciesRequest request) {
        return new SyncInvoker<ListDependenciesRequest, ListDependenciesResponse>(request,
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
     * @return ListDependencyVersionResponse
     */
    public ListDependencyVersionResponse listDependencyVersion(ListDependencyVersionRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listDependencyVersion);
    }

    /**
     * 获取依赖包版本列表
     *
     * 获取依赖包版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDependencyVersionRequest 请求对象
     * @return SyncInvoker<ListDependencyVersionRequest, ListDependencyVersionResponse>
     */
    public SyncInvoker<ListDependencyVersionRequest, ListDependencyVersionResponse> listDependencyVersionInvoker(
        ListDependencyVersionRequest request) {
        return new SyncInvoker<ListDependencyVersionRequest, ListDependencyVersionResponse>(request,
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
     * @return ListEventsResponse
     */
    public ListEventsResponse listEvents(ListEventsRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listEvents);
    }

    /**
     * 获取指定函数的测试事件列表
     *
     * 获取指定函数的测试事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEventsRequest 请求对象
     * @return SyncInvoker<ListEventsRequest, ListEventsResponse>
     */
    public SyncInvoker<ListEventsRequest, ListEventsResponse> listEventsInvoker(ListEventsRequest request) {
        return new SyncInvoker<ListEventsRequest, ListEventsResponse>(request, FunctionGraphMeta.listEvents, hcClient);
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
     * @return ListFunctionAsMetricResponse
     */
    public ListFunctionAsMetricResponse listFunctionAsMetric(ListFunctionAsMetricRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listFunctionAsMetric);
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
     * @return SyncInvoker<ListFunctionAsMetricRequest, ListFunctionAsMetricResponse>
     */
    public SyncInvoker<ListFunctionAsMetricRequest, ListFunctionAsMetricResponse> listFunctionAsMetricInvoker(
        ListFunctionAsMetricRequest request) {
        return new SyncInvoker<ListFunctionAsMetricRequest, ListFunctionAsMetricResponse>(request,
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
     * @return ListFunctionAsyncInvokeConfigResponse
     */
    public ListFunctionAsyncInvokeConfigResponse listFunctionAsyncInvokeConfig(
        ListFunctionAsyncInvokeConfigRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listFunctionAsyncInvokeConfig);
    }

    /**
     * 获取函数异步配置列表
     *
     * 获取指定函数所有版本的异步配置列表。。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFunctionAsyncInvokeConfigRequest 请求对象
     * @return SyncInvoker<ListFunctionAsyncInvokeConfigRequest, ListFunctionAsyncInvokeConfigResponse>
     */
    public SyncInvoker<ListFunctionAsyncInvokeConfigRequest, ListFunctionAsyncInvokeConfigResponse> listFunctionAsyncInvokeConfigInvoker(
        ListFunctionAsyncInvokeConfigRequest request) {
        return new SyncInvoker<ListFunctionAsyncInvokeConfigRequest, ListFunctionAsyncInvokeConfigResponse>(request,
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
     * @return ListFunctionReservedInstancesResponse
     */
    public ListFunctionReservedInstancesResponse listFunctionReservedInstances(
        ListFunctionReservedInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listFunctionReservedInstances);
    }

    /**
     * 获取函数预留实例数量
     *
     * 获取函数预留实例数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFunctionReservedInstancesRequest 请求对象
     * @return SyncInvoker<ListFunctionReservedInstancesRequest, ListFunctionReservedInstancesResponse>
     */
    public SyncInvoker<ListFunctionReservedInstancesRequest, ListFunctionReservedInstancesResponse> listFunctionReservedInstancesInvoker(
        ListFunctionReservedInstancesRequest request) {
        return new SyncInvoker<ListFunctionReservedInstancesRequest, ListFunctionReservedInstancesResponse>(request,
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
     * @return ListFunctionStatisticsResponse
     */
    public ListFunctionStatisticsResponse listFunctionStatistics(ListFunctionStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listFunctionStatistics);
    }

    /**
     * 获取指定时间段的函数运行指标
     *
     * 获取指定时间段的函数运行指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFunctionStatisticsRequest 请求对象
     * @return SyncInvoker<ListFunctionStatisticsRequest, ListFunctionStatisticsResponse>
     */
    public SyncInvoker<ListFunctionStatisticsRequest, ListFunctionStatisticsResponse> listFunctionStatisticsInvoker(
        ListFunctionStatisticsRequest request) {
        return new SyncInvoker<ListFunctionStatisticsRequest, ListFunctionStatisticsResponse>(request,
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
     * @return ListFunctionTriggersResponse
     */
    public ListFunctionTriggersResponse listFunctionTriggers(ListFunctionTriggersRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listFunctionTriggers);
    }

    /**
     * 获取指定函数的所有触发器
     *
     * 获取指定函数的所有触发器设置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFunctionTriggersRequest 请求对象
     * @return SyncInvoker<ListFunctionTriggersRequest, ListFunctionTriggersResponse>
     */
    public SyncInvoker<ListFunctionTriggersRequest, ListFunctionTriggersResponse> listFunctionTriggersInvoker(
        ListFunctionTriggersRequest request) {
        return new SyncInvoker<ListFunctionTriggersRequest, ListFunctionTriggersResponse>(request,
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
     * @return ListFunctionVersionsResponse
     */
    public ListFunctionVersionsResponse listFunctionVersions(ListFunctionVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listFunctionVersions);
    }

    /**
     * 获取指定函数的版本列表
     *
     * 获取指定函数的版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFunctionVersionsRequest 请求对象
     * @return SyncInvoker<ListFunctionVersionsRequest, ListFunctionVersionsResponse>
     */
    public SyncInvoker<ListFunctionVersionsRequest, ListFunctionVersionsResponse> listFunctionVersionsInvoker(
        ListFunctionVersionsRequest request) {
        return new SyncInvoker<ListFunctionVersionsRequest, ListFunctionVersionsResponse>(request,
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
     * @return ListFunctionsResponse
     */
    public ListFunctionsResponse listFunctions(ListFunctionsRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listFunctions);
    }

    /**
     * 获取函数列表
     *
     * 获取函数列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFunctionsRequest 请求对象
     * @return SyncInvoker<ListFunctionsRequest, ListFunctionsResponse>
     */
    public SyncInvoker<ListFunctionsRequest, ListFunctionsResponse> listFunctionsInvoker(ListFunctionsRequest request) {
        return new SyncInvoker<ListFunctionsRequest, ListFunctionsResponse>(request, FunctionGraphMeta.listFunctions,
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
     * @return ListQuotasResponse
     */
    public ListQuotasResponse listQuotas(ListQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listQuotas);
    }

    /**
     * 查询租户配额
     *
     * 查询租户配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
     * @return SyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public SyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasInvoker(ListQuotasRequest request) {
        return new SyncInvoker<ListQuotasRequest, ListQuotasResponse>(request, FunctionGraphMeta.listQuotas, hcClient);
    }

    /**
     * 获取函数预留实例配置列表
     *
     * 获取函数预留实例配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListReservedInstanceConfigsRequest 请求对象
     * @return ListReservedInstanceConfigsResponse
     */
    public ListReservedInstanceConfigsResponse listReservedInstanceConfigs(ListReservedInstanceConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listReservedInstanceConfigs);
    }

    /**
     * 获取函数预留实例配置列表
     *
     * 获取函数预留实例配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListReservedInstanceConfigsRequest 请求对象
     * @return SyncInvoker<ListReservedInstanceConfigsRequest, ListReservedInstanceConfigsResponse>
     */
    public SyncInvoker<ListReservedInstanceConfigsRequest, ListReservedInstanceConfigsResponse> listReservedInstanceConfigsInvoker(
        ListReservedInstanceConfigsRequest request) {
        return new SyncInvoker<ListReservedInstanceConfigsRequest, ListReservedInstanceConfigsResponse>(request,
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
     * @return ListStatisticsResponse
     */
    public ListStatisticsResponse listStatistics(ListStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listStatistics);
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
     * @return SyncInvoker<ListStatisticsRequest, ListStatisticsResponse>
     */
    public SyncInvoker<ListStatisticsRequest, ListStatisticsResponse> listStatisticsInvoker(
        ListStatisticsRequest request) {
        return new SyncInvoker<ListStatisticsRequest, ListStatisticsResponse>(request, FunctionGraphMeta.listStatistics,
            hcClient);
    }

    /**
     * 获取指定函数所有版本别名列表
     *
     * 获取函数版本别名列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVersionAliasesRequest 请求对象
     * @return ListVersionAliasesResponse
     */
    public ListVersionAliasesResponse listVersionAliases(ListVersionAliasesRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listVersionAliases);
    }

    /**
     * 获取指定函数所有版本别名列表
     *
     * 获取函数版本别名列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVersionAliasesRequest 请求对象
     * @return SyncInvoker<ListVersionAliasesRequest, ListVersionAliasesResponse>
     */
    public SyncInvoker<ListVersionAliasesRequest, ListVersionAliasesResponse> listVersionAliasesInvoker(
        ListVersionAliasesRequest request) {
        return new SyncInvoker<ListVersionAliasesRequest, ListVersionAliasesResponse>(request,
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
     * @return ListWorkflowResponse
     */
    public ListWorkflowResponse listWorkflow(ListWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listWorkflow);
    }

    /**
     * 查询函数流
     *
     * 查询函数流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkflowRequest 请求对象
     * @return SyncInvoker<ListWorkflowRequest, ListWorkflowResponse>
     */
    public SyncInvoker<ListWorkflowRequest, ListWorkflowResponse> listWorkflowInvoker(ListWorkflowRequest request) {
        return new SyncInvoker<ListWorkflowRequest, ListWorkflowResponse>(request, FunctionGraphMeta.listWorkflow,
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
     * @return ListWorkflowExecutionsResponse
     */
    public ListWorkflowExecutionsResponse listWorkflowExecutions(ListWorkflowExecutionsRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listWorkflowExecutions);
    }

    /**
     * 获取指定函数流执行实例列表
     *
     * 获取指定函数流执行实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkflowExecutionsRequest 请求对象
     * @return SyncInvoker<ListWorkflowExecutionsRequest, ListWorkflowExecutionsResponse>
     */
    public SyncInvoker<ListWorkflowExecutionsRequest, ListWorkflowExecutionsResponse> listWorkflowExecutionsInvoker(
        ListWorkflowExecutionsRequest request) {
        return new SyncInvoker<ListWorkflowExecutionsRequest, ListWorkflowExecutionsResponse>(request,
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
     * @return RetryWorkFlowResponse
     */
    public RetryWorkFlowResponse retryWorkFlow(RetryWorkFlowRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.retryWorkFlow);
    }

    /**
     * 重试函数流
     *
     * 重试函数流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RetryWorkFlowRequest 请求对象
     * @return SyncInvoker<RetryWorkFlowRequest, RetryWorkFlowResponse>
     */
    public SyncInvoker<RetryWorkFlowRequest, RetryWorkFlowResponse> retryWorkFlowInvoker(RetryWorkFlowRequest request) {
        return new SyncInvoker<RetryWorkFlowRequest, RetryWorkFlowResponse>(request, FunctionGraphMeta.retryWorkFlow,
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
     * @return ShowDependcyResponse
     */
    public ShowDependcyResponse showDependcy(ShowDependcyRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.showDependcy);
    }

    /**
     * 获取指定依赖包
     *
     * 获取指定依赖包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDependcyRequest 请求对象
     * @return SyncInvoker<ShowDependcyRequest, ShowDependcyResponse>
     */
    public SyncInvoker<ShowDependcyRequest, ShowDependcyResponse> showDependcyInvoker(ShowDependcyRequest request) {
        return new SyncInvoker<ShowDependcyRequest, ShowDependcyResponse>(request, FunctionGraphMeta.showDependcy,
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
     * @return ShowDependencyVersionResponse
     */
    public ShowDependencyVersionResponse showDependencyVersion(ShowDependencyVersionRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.showDependencyVersion);
    }

    /**
     * 获取依赖包版本详情
     *
     * 获取依赖包版本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDependencyVersionRequest 请求对象
     * @return SyncInvoker<ShowDependencyVersionRequest, ShowDependencyVersionResponse>
     */
    public SyncInvoker<ShowDependencyVersionRequest, ShowDependencyVersionResponse> showDependencyVersionInvoker(
        ShowDependencyVersionRequest request) {
        return new SyncInvoker<ShowDependencyVersionRequest, ShowDependencyVersionResponse>(request,
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
     * @return ShowEventResponse
     */
    public ShowEventResponse showEvent(ShowEventRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.showEvent);
    }

    /**
     * 获取测试事件详细信息
     *
     * 获取测试事件详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEventRequest 请求对象
     * @return SyncInvoker<ShowEventRequest, ShowEventResponse>
     */
    public SyncInvoker<ShowEventRequest, ShowEventResponse> showEventInvoker(ShowEventRequest request) {
        return new SyncInvoker<ShowEventRequest, ShowEventResponse>(request, FunctionGraphMeta.showEvent, hcClient);
    }

    /**
     * 查询函数快照制作状态
     *
     * 查询函数快照制作状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFuncSnapshotStateRequest 请求对象
     * @return ShowFuncSnapshotStateResponse
     */
    public ShowFuncSnapshotStateResponse showFuncSnapshotState(ShowFuncSnapshotStateRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.showFuncSnapshotState);
    }

    /**
     * 查询函数快照制作状态
     *
     * 查询函数快照制作状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFuncSnapshotStateRequest 请求对象
     * @return SyncInvoker<ShowFuncSnapshotStateRequest, ShowFuncSnapshotStateResponse>
     */
    public SyncInvoker<ShowFuncSnapshotStateRequest, ShowFuncSnapshotStateResponse> showFuncSnapshotStateInvoker(
        ShowFuncSnapshotStateRequest request) {
        return new SyncInvoker<ShowFuncSnapshotStateRequest, ShowFuncSnapshotStateResponse>(request,
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
     * @return ShowFunctionAsyncInvokeConfigResponse
     */
    public ShowFunctionAsyncInvokeConfigResponse showFunctionAsyncInvokeConfig(
        ShowFunctionAsyncInvokeConfigRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.showFunctionAsyncInvokeConfig);
    }

    /**
     * 获取函数异步配置信息
     *
     * 获取指定函数某一版本的异步配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFunctionAsyncInvokeConfigRequest 请求对象
     * @return SyncInvoker<ShowFunctionAsyncInvokeConfigRequest, ShowFunctionAsyncInvokeConfigResponse>
     */
    public SyncInvoker<ShowFunctionAsyncInvokeConfigRequest, ShowFunctionAsyncInvokeConfigResponse> showFunctionAsyncInvokeConfigInvoker(
        ShowFunctionAsyncInvokeConfigRequest request) {
        return new SyncInvoker<ShowFunctionAsyncInvokeConfigRequest, ShowFunctionAsyncInvokeConfigResponse>(request,
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
     * @return ShowFunctionCodeResponse
     */
    public ShowFunctionCodeResponse showFunctionCode(ShowFunctionCodeRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.showFunctionCode);
    }

    /**
     * 获取指定函数代码
     *
     * 获取指定函数的代码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFunctionCodeRequest 请求对象
     * @return SyncInvoker<ShowFunctionCodeRequest, ShowFunctionCodeResponse>
     */
    public SyncInvoker<ShowFunctionCodeRequest, ShowFunctionCodeResponse> showFunctionCodeInvoker(
        ShowFunctionCodeRequest request) {
        return new SyncInvoker<ShowFunctionCodeRequest, ShowFunctionCodeResponse>(request,
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
     * @return ShowFunctionConfigResponse
     */
    public ShowFunctionConfigResponse showFunctionConfig(ShowFunctionConfigRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.showFunctionConfig);
    }

    /**
     * 获取函数的metadata
     *
     * 获取指定函数的metadata。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFunctionConfigRequest 请求对象
     * @return SyncInvoker<ShowFunctionConfigRequest, ShowFunctionConfigResponse>
     */
    public SyncInvoker<ShowFunctionConfigRequest, ShowFunctionConfigResponse> showFunctionConfigInvoker(
        ShowFunctionConfigRequest request) {
        return new SyncInvoker<ShowFunctionConfigRequest, ShowFunctionConfigResponse>(request,
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
     * @return ShowFunctionTriggerResponse
     */
    public ShowFunctionTriggerResponse showFunctionTrigger(ShowFunctionTriggerRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.showFunctionTrigger);
    }

    /**
     * 获取指定触发器的信息
     *
     * 获取特定触发器的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFunctionTriggerRequest 请求对象
     * @return SyncInvoker<ShowFunctionTriggerRequest, ShowFunctionTriggerResponse>
     */
    public SyncInvoker<ShowFunctionTriggerRequest, ShowFunctionTriggerResponse> showFunctionTriggerInvoker(
        ShowFunctionTriggerRequest request) {
        return new SyncInvoker<ShowFunctionTriggerRequest, ShowFunctionTriggerResponse>(request,
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
     * @return ShowLtsLogDetailsResponse
     */
    public ShowLtsLogDetailsResponse showLtsLogDetails(ShowLtsLogDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.showLtsLogDetails);
    }

    /**
     * 获取指定函数的lts日志组日志流配置
     *
     * 获取指定函数的lts日志组日志流配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLtsLogDetailsRequest 请求对象
     * @return SyncInvoker<ShowLtsLogDetailsRequest, ShowLtsLogDetailsResponse>
     */
    public SyncInvoker<ShowLtsLogDetailsRequest, ShowLtsLogDetailsResponse> showLtsLogDetailsInvoker(
        ShowLtsLogDetailsRequest request) {
        return new SyncInvoker<ShowLtsLogDetailsRequest, ShowLtsLogDetailsResponse>(request,
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
     * @return ShowProjectTagsListResponse
     */
    public ShowProjectTagsListResponse showProjectTagsList(ShowProjectTagsListRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.showProjectTagsList);
    }

    /**
     * 查询资源标签
     *
     * 查询资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectTagsListRequest 请求对象
     * @return SyncInvoker<ShowProjectTagsListRequest, ShowProjectTagsListResponse>
     */
    public SyncInvoker<ShowProjectTagsListRequest, ShowProjectTagsListResponse> showProjectTagsListInvoker(
        ShowProjectTagsListRequest request) {
        return new SyncInvoker<ShowProjectTagsListRequest, ShowProjectTagsListResponse>(request,
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
     * @return ShowResInstanceInfoResponse
     */
    public ShowResInstanceInfoResponse showResInstanceInfo(ShowResInstanceInfoRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.showResInstanceInfo);
    }

    /**
     * 查询资源实例
     *
     * 查询资源实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResInstanceInfoRequest 请求对象
     * @return SyncInvoker<ShowResInstanceInfoRequest, ShowResInstanceInfoResponse>
     */
    public SyncInvoker<ShowResInstanceInfoRequest, ShowResInstanceInfoResponse> showResInstanceInfoInvoker(
        ShowResInstanceInfoRequest request) {
        return new SyncInvoker<ShowResInstanceInfoRequest, ShowResInstanceInfoResponse>(request,
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
     * @return ShowTenantMetricResponse
     */
    public ShowTenantMetricResponse showTenantMetric(ShowTenantMetricRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.showTenantMetric);
    }

    /**
     * 获取函数流指标
     *
     * 获取函数流指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTenantMetricRequest 请求对象
     * @return SyncInvoker<ShowTenantMetricRequest, ShowTenantMetricResponse>
     */
    public SyncInvoker<ShowTenantMetricRequest, ShowTenantMetricResponse> showTenantMetricInvoker(
        ShowTenantMetricRequest request) {
        return new SyncInvoker<ShowTenantMetricRequest, ShowTenantMetricResponse>(request,
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
     * @return ShowTracingResponse
     */
    public ShowTracingResponse showTracing(ShowTracingRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.showTracing);
    }

    /**
     * 获取函数调用链配置
     *
     * 获取函数调用链配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTracingRequest 请求对象
     * @return SyncInvoker<ShowTracingRequest, ShowTracingResponse>
     */
    public SyncInvoker<ShowTracingRequest, ShowTracingResponse> showTracingInvoker(ShowTracingRequest request) {
        return new SyncInvoker<ShowTracingRequest, ShowTracingResponse>(request, FunctionGraphMeta.showTracing,
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
     * @return ShowVersionAliasResponse
     */
    public ShowVersionAliasResponse showVersionAlias(ShowVersionAliasRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.showVersionAlias);
    }

    /**
     * 获取函数版本的指定别名信息
     *
     * 获取函数指定的版本别名信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVersionAliasRequest 请求对象
     * @return SyncInvoker<ShowVersionAliasRequest, ShowVersionAliasResponse>
     */
    public SyncInvoker<ShowVersionAliasRequest, ShowVersionAliasResponse> showVersionAliasInvoker(
        ShowVersionAliasRequest request) {
        return new SyncInvoker<ShowVersionAliasRequest, ShowVersionAliasResponse>(request,
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
     * @return ShowWorkFlowResponse
     */
    public ShowWorkFlowResponse showWorkFlow(ShowWorkFlowRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.showWorkFlow);
    }

    /**
     * 获取指定函数流实例的元数据
     *
     * 获取指定函数流实例的元数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowWorkFlowRequest 请求对象
     * @return SyncInvoker<ShowWorkFlowRequest, ShowWorkFlowResponse>
     */
    public SyncInvoker<ShowWorkFlowRequest, ShowWorkFlowResponse> showWorkFlowInvoker(ShowWorkFlowRequest request) {
        return new SyncInvoker<ShowWorkFlowRequest, ShowWorkFlowResponse>(request, FunctionGraphMeta.showWorkFlow,
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
     * @return ShowWorkFlowMetricResponse
     */
    public ShowWorkFlowMetricResponse showWorkFlowMetric(ShowWorkFlowMetricRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.showWorkFlowMetric);
    }

    /**
     * 获取指定函数流指标
     *
     * 获取指定函数流指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowWorkFlowMetricRequest 请求对象
     * @return SyncInvoker<ShowWorkFlowMetricRequest, ShowWorkFlowMetricResponse>
     */
    public SyncInvoker<ShowWorkFlowMetricRequest, ShowWorkFlowMetricResponse> showWorkFlowMetricInvoker(
        ShowWorkFlowMetricRequest request) {
        return new SyncInvoker<ShowWorkFlowMetricRequest, ShowWorkFlowMetricResponse>(request,
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
     * @return ShowWorkflowExecutionResponse
     */
    public ShowWorkflowExecutionResponse showWorkflowExecution(ShowWorkflowExecutionRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.showWorkflowExecution);
    }

    /**
     * 获取指定函数流执行实例
     *
     * 获取指定函数流执行实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowWorkflowExecutionRequest 请求对象
     * @return SyncInvoker<ShowWorkflowExecutionRequest, ShowWorkflowExecutionResponse>
     */
    public SyncInvoker<ShowWorkflowExecutionRequest, ShowWorkflowExecutionResponse> showWorkflowExecutionInvoker(
        ShowWorkflowExecutionRequest request) {
        return new SyncInvoker<ShowWorkflowExecutionRequest, ShowWorkflowExecutionResponse>(request,
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
     * @return ShowWorkflowExecutionForPageResponse
     */
    public ShowWorkflowExecutionForPageResponse showWorkflowExecutionForPage(
        ShowWorkflowExecutionForPageRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.showWorkflowExecutionForPage);
    }

    /**
     * 分页获取指定函数流执行实例列表
     *
     * 分页获取指定函数流执行实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowWorkflowExecutionForPageRequest 请求对象
     * @return SyncInvoker<ShowWorkflowExecutionForPageRequest, ShowWorkflowExecutionForPageResponse>
     */
    public SyncInvoker<ShowWorkflowExecutionForPageRequest, ShowWorkflowExecutionForPageResponse> showWorkflowExecutionForPageInvoker(
        ShowWorkflowExecutionForPageRequest request) {
        return new SyncInvoker<ShowWorkflowExecutionForPageRequest, ShowWorkflowExecutionForPageResponse>(request,
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
     * @return StartSyncWorkflowExecutionResponse
     */
    public StartSyncWorkflowExecutionResponse startSyncWorkflowExecution(StartSyncWorkflowExecutionRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.startSyncWorkflowExecution);
    }

    /**
     * 同步执行函数流
     *
     * 以同步执行方式启动函数流（仅快速模式函数流支持）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartSyncWorkflowExecutionRequest 请求对象
     * @return SyncInvoker<StartSyncWorkflowExecutionRequest, StartSyncWorkflowExecutionResponse>
     */
    public SyncInvoker<StartSyncWorkflowExecutionRequest, StartSyncWorkflowExecutionResponse> startSyncWorkflowExecutionInvoker(
        StartSyncWorkflowExecutionRequest request) {
        return new SyncInvoker<StartSyncWorkflowExecutionRequest, StartSyncWorkflowExecutionResponse>(request,
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
     * @return StartWorkflowExecutionResponse
     */
    public StartWorkflowExecutionResponse startWorkflowExecution(StartWorkflowExecutionRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.startWorkflowExecution);
    }

    /**
     * 开始执行函数流
     *
     * 以异步执行方式启动函数流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartWorkflowExecutionRequest 请求对象
     * @return SyncInvoker<StartWorkflowExecutionRequest, StartWorkflowExecutionResponse>
     */
    public SyncInvoker<StartWorkflowExecutionRequest, StartWorkflowExecutionResponse> startWorkflowExecutionInvoker(
        StartWorkflowExecutionRequest request) {
        return new SyncInvoker<StartWorkflowExecutionRequest, StartWorkflowExecutionResponse>(request,
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
     * @return StopWorkFlowResponse
     */
    public StopWorkFlowResponse stopWorkFlow(StopWorkFlowRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.stopWorkFlow);
    }

    /**
     * 停止函数流
     *
     * 停止函数流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopWorkFlowRequest 请求对象
     * @return SyncInvoker<StopWorkFlowRequest, StopWorkFlowResponse>
     */
    public SyncInvoker<StopWorkFlowRequest, StopWorkFlowResponse> stopWorkFlowInvoker(StopWorkFlowRequest request) {
        return new SyncInvoker<StopWorkFlowRequest, StopWorkFlowResponse>(request, FunctionGraphMeta.stopWorkFlow,
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
     * @return UpdateDependcyResponse
     */
    public UpdateDependcyResponse updateDependcy(UpdateDependcyRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.updateDependcy);
    }

    /**
     * 更新指定依赖包
     *
     * 更新指定依赖包
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDependcyRequest 请求对象
     * @return SyncInvoker<UpdateDependcyRequest, UpdateDependcyResponse>
     */
    public SyncInvoker<UpdateDependcyRequest, UpdateDependcyResponse> updateDependcyInvoker(
        UpdateDependcyRequest request) {
        return new SyncInvoker<UpdateDependcyRequest, UpdateDependcyResponse>(request, FunctionGraphMeta.updateDependcy,
            hcClient);
    }

    /**
     * 更新测试事件详细信息
     *
     * 更新测试事件详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEventRequest 请求对象
     * @return UpdateEventResponse
     */
    public UpdateEventResponse updateEvent(UpdateEventRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.updateEvent);
    }

    /**
     * 更新测试事件详细信息
     *
     * 更新测试事件详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEventRequest 请求对象
     * @return SyncInvoker<UpdateEventRequest, UpdateEventResponse>
     */
    public SyncInvoker<UpdateEventRequest, UpdateEventResponse> updateEventInvoker(UpdateEventRequest request) {
        return new SyncInvoker<UpdateEventRequest, UpdateEventResponse>(request, FunctionGraphMeta.updateEvent,
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
     * @return UpdateFuncSnapshotResponse
     */
    public UpdateFuncSnapshotResponse updateFuncSnapshot(UpdateFuncSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.updateFuncSnapshot);
    }

    /**
     * 禁用/启动函数快照
     *
     * 禁用/启动函数快照
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFuncSnapshotRequest 请求对象
     * @return SyncInvoker<UpdateFuncSnapshotRequest, UpdateFuncSnapshotResponse>
     */
    public SyncInvoker<UpdateFuncSnapshotRequest, UpdateFuncSnapshotResponse> updateFuncSnapshotInvoker(
        UpdateFuncSnapshotRequest request) {
        return new SyncInvoker<UpdateFuncSnapshotRequest, UpdateFuncSnapshotResponse>(request,
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
     * @return UpdateFunctionAsyncInvokeConfigResponse
     */
    public UpdateFunctionAsyncInvokeConfigResponse updateFunctionAsyncInvokeConfig(
        UpdateFunctionAsyncInvokeConfigRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.updateFunctionAsyncInvokeConfig);
    }

    /**
     * 设置函数异步配置信息
     *
     * 设置函数异步配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFunctionAsyncInvokeConfigRequest 请求对象
     * @return SyncInvoker<UpdateFunctionAsyncInvokeConfigRequest, UpdateFunctionAsyncInvokeConfigResponse>
     */
    public SyncInvoker<UpdateFunctionAsyncInvokeConfigRequest, UpdateFunctionAsyncInvokeConfigResponse> updateFunctionAsyncInvokeConfigInvoker(
        UpdateFunctionAsyncInvokeConfigRequest request) {
        return new SyncInvoker<UpdateFunctionAsyncInvokeConfigRequest, UpdateFunctionAsyncInvokeConfigResponse>(request,
            FunctionGraphMeta.updateFunctionAsyncInvokeConfig, hcClient);
    }

    /**
     * 修改函数代码
     *
     * 修改指定的函数的代码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFunctionCodeRequest 请求对象
     * @return UpdateFunctionCodeResponse
     */
    public UpdateFunctionCodeResponse updateFunctionCode(UpdateFunctionCodeRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.updateFunctionCode);
    }

    /**
     * 修改函数代码
     *
     * 修改指定的函数的代码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFunctionCodeRequest 请求对象
     * @return SyncInvoker<UpdateFunctionCodeRequest, UpdateFunctionCodeResponse>
     */
    public SyncInvoker<UpdateFunctionCodeRequest, UpdateFunctionCodeResponse> updateFunctionCodeInvoker(
        UpdateFunctionCodeRequest request) {
        return new SyncInvoker<UpdateFunctionCodeRequest, UpdateFunctionCodeResponse>(request,
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
     * @return UpdateFunctionConfigResponse
     */
    public UpdateFunctionConfigResponse updateFunctionConfig(UpdateFunctionConfigRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.updateFunctionConfig);
    }

    /**
     * 修改函数的metadata信息
     *
     * 修改指定的函数的metadata信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFunctionConfigRequest 请求对象
     * @return SyncInvoker<UpdateFunctionConfigRequest, UpdateFunctionConfigResponse>
     */
    public SyncInvoker<UpdateFunctionConfigRequest, UpdateFunctionConfigResponse> updateFunctionConfigInvoker(
        UpdateFunctionConfigRequest request) {
        return new SyncInvoker<UpdateFunctionConfigRequest, UpdateFunctionConfigResponse>(request,
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
     * @return UpdateFunctionMaxInstanceConfigResponse
     */
    public UpdateFunctionMaxInstanceConfigResponse updateFunctionMaxInstanceConfig(
        UpdateFunctionMaxInstanceConfigRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.updateFunctionMaxInstanceConfig);
    }

    /**
     * 更新函数最大实例数
     *
     * 更新函数最大实例数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFunctionMaxInstanceConfigRequest 请求对象
     * @return SyncInvoker<UpdateFunctionMaxInstanceConfigRequest, UpdateFunctionMaxInstanceConfigResponse>
     */
    public SyncInvoker<UpdateFunctionMaxInstanceConfigRequest, UpdateFunctionMaxInstanceConfigResponse> updateFunctionMaxInstanceConfigInvoker(
        UpdateFunctionMaxInstanceConfigRequest request) {
        return new SyncInvoker<UpdateFunctionMaxInstanceConfigRequest, UpdateFunctionMaxInstanceConfigResponse>(request,
            FunctionGraphMeta.updateFunctionMaxInstanceConfig, hcClient);
    }

    /**
     * 修改函数预留实例数量
     *
     * 修改函数预留实例数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFunctionReservedInstancesCountRequest 请求对象
     * @return UpdateFunctionReservedInstancesCountResponse
     */
    public UpdateFunctionReservedInstancesCountResponse updateFunctionReservedInstancesCount(
        UpdateFunctionReservedInstancesCountRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.updateFunctionReservedInstancesCount);
    }

    /**
     * 修改函数预留实例数量
     *
     * 修改函数预留实例数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFunctionReservedInstancesCountRequest 请求对象
     * @return SyncInvoker<UpdateFunctionReservedInstancesCountRequest, UpdateFunctionReservedInstancesCountResponse>
     */
    public SyncInvoker<UpdateFunctionReservedInstancesCountRequest, UpdateFunctionReservedInstancesCountResponse> updateFunctionReservedInstancesCountInvoker(
        UpdateFunctionReservedInstancesCountRequest request) {
        return new SyncInvoker<UpdateFunctionReservedInstancesCountRequest, UpdateFunctionReservedInstancesCountResponse>(
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
     * @return UpdateTracingResponse
     */
    public UpdateTracingResponse updateTracing(UpdateTracingRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.updateTracing);
    }

    /**
     * 修改函数调用链配置
     *
     * 修改函数调用链配置,开通/修改传入aksk，关闭aksk传空
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTracingRequest 请求对象
     * @return SyncInvoker<UpdateTracingRequest, UpdateTracingResponse>
     */
    public SyncInvoker<UpdateTracingRequest, UpdateTracingResponse> updateTracingInvoker(UpdateTracingRequest request) {
        return new SyncInvoker<UpdateTracingRequest, UpdateTracingResponse>(request, FunctionGraphMeta.updateTracing,
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
     * @return UpdateTriggerResponse
     */
    public UpdateTriggerResponse updateTrigger(UpdateTriggerRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.updateTrigger);
    }

    /**
     * 更新触发器
     *
     * 更新触发器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTriggerRequest 请求对象
     * @return SyncInvoker<UpdateTriggerRequest, UpdateTriggerResponse>
     */
    public SyncInvoker<UpdateTriggerRequest, UpdateTriggerResponse> updateTriggerInvoker(UpdateTriggerRequest request) {
        return new SyncInvoker<UpdateTriggerRequest, UpdateTriggerResponse>(request, FunctionGraphMeta.updateTrigger,
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
     * @return UpdateVersionAliasResponse
     */
    public UpdateVersionAliasResponse updateVersionAlias(UpdateVersionAliasRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.updateVersionAlias);
    }

    /**
     * 修改函数版本别名信息
     *
     * 修改函数版本别名信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVersionAliasRequest 请求对象
     * @return SyncInvoker<UpdateVersionAliasRequest, UpdateVersionAliasResponse>
     */
    public SyncInvoker<UpdateVersionAliasRequest, UpdateVersionAliasResponse> updateVersionAliasInvoker(
        UpdateVersionAliasRequest request) {
        return new SyncInvoker<UpdateVersionAliasRequest, UpdateVersionAliasResponse>(request,
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
     * @return UpdateWorkFlowResponse
     */
    public UpdateWorkFlowResponse updateWorkFlow(UpdateWorkFlowRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.updateWorkFlow);
    }

    /**
     * 修改指定函数流实例的元数据
     *
     * 修改指定函数流实例的元数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateWorkFlowRequest 请求对象
     * @return SyncInvoker<UpdateWorkFlowRequest, UpdateWorkFlowResponse>
     */
    public SyncInvoker<UpdateWorkFlowRequest, UpdateWorkFlowResponse> updateWorkFlowInvoker(
        UpdateWorkFlowRequest request) {
        return new SyncInvoker<UpdateWorkFlowRequest, UpdateWorkFlowResponse>(request, FunctionGraphMeta.updateWorkFlow,
            hcClient);
    }

}

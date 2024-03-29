package com.huaweicloud.sdk.functiongraph.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.functiongraph.v2.model.AsyncInvokeFunctionRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.AsyncInvokeFunctionResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.BatchDeleteFunctionTriggersRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.BatchDeleteFunctionTriggersResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.BatchDeleteWorkflowsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.BatchDeleteWorkflowsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.CancelAsyncInvocationRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.CancelAsyncInvocationResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateCallbackWorkflowRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateCallbackWorkflowResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateDependencyVersionRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateDependencyVersionResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateEventRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateEventResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateFunctionAppRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.CreateFunctionAppResponse;
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
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteDependencyVersionRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteDependencyVersionResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteEventRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteEventResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteFunctionAppRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.DeleteFunctionAppResponse;
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
import com.huaweicloud.sdk.functiongraph.v2.model.EnableAsyncStatusLogRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.EnableAsyncStatusLogResponse;
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
import com.huaweicloud.sdk.functiongraph.v2.model.ListAppTemplatesRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListAppTemplatesResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListAsyncInvocationsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListAsyncInvocationsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListBridgeFunctionsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListBridgeFunctionsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListBridgeVersionsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListBridgeVersionsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListDependenciesRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListDependenciesResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListDependencyVersionRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListDependencyVersionResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListEventsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListEventsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionApplicationsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionApplicationsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionAsMetricRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionAsMetricResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionAsyncInvokeConfigRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionAsyncInvokeConfigResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionReservedInstancesRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionReservedInstancesResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionStatisticsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionStatisticsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionTagsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionTagsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionTemplateRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ListFunctionTemplateResponse;
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
import com.huaweicloud.sdk.functiongraph.v2.model.ShowAppTemplateRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowAppTemplateResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowDependencyVersionRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowDependencyVersionResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowEventRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowEventResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFuncReservedInstanceMetricsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFuncReservedInstanceMetricsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFuncSnapshotStateRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFuncSnapshotStateResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFunctionAppRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFunctionAppResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFunctionAsyncInvokeConfigRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFunctionAsyncInvokeConfigResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFunctionCodeRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFunctionCodeResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFunctionConfigRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFunctionConfigResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFunctionMetricsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFunctionMetricsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFunctionTemplateRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFunctionTemplateResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFunctionTriggerRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowFunctionTriggerResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowLtsLogDetailsRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowLtsLogDetailsResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowProjectAsyncStatusLogInfoRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.ShowProjectAsyncStatusLogInfoResponse;
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
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateEventRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateEventResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFuncSnapshotRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFuncSnapshotResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFunctionAsyncInvokeConfigRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFunctionAsyncInvokeConfigResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFunctionCodeRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFunctionCodeResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFunctionCollectStateRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.UpdateFunctionCollectStateResponse;
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
     * @param request AsyncInvokeFunctionRequest 请求对象
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
     * @param request AsyncInvokeFunctionRequest 请求对象
     * @return SyncInvoker<AsyncInvokeFunctionRequest, AsyncInvokeFunctionResponse>
     */
    public SyncInvoker<AsyncInvokeFunctionRequest, AsyncInvokeFunctionResponse> asyncInvokeFunctionInvoker(
        AsyncInvokeFunctionRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.asyncInvokeFunction, hcClient);
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
     * @param request BatchDeleteFunctionTriggersRequest 请求对象
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
     * @param request BatchDeleteFunctionTriggersRequest 请求对象
     * @return SyncInvoker<BatchDeleteFunctionTriggersRequest, BatchDeleteFunctionTriggersResponse>
     */
    public SyncInvoker<BatchDeleteFunctionTriggersRequest, BatchDeleteFunctionTriggersResponse> batchDeleteFunctionTriggersInvoker(
        BatchDeleteFunctionTriggersRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.batchDeleteFunctionTriggers, hcClient);
    }

    /**
     * 删除函数流
     *
     * 删除函数流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteWorkflowsRequest 请求对象
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
     * @param request BatchDeleteWorkflowsRequest 请求对象
     * @return SyncInvoker<BatchDeleteWorkflowsRequest, BatchDeleteWorkflowsResponse>
     */
    public SyncInvoker<BatchDeleteWorkflowsRequest, BatchDeleteWorkflowsResponse> batchDeleteWorkflowsInvoker(
        BatchDeleteWorkflowsRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.batchDeleteWorkflows, hcClient);
    }

    /**
     * 停止函数异步调用请求
     *
     * -| 当前仅支持参数recursive为false且force为true的函数。 在1：N的函数做并发异步调用的场景下调用停止异步请求接口时，同一函数实例同时在执行的其他请求也会被一并停止并返回4208 function invocation canceled
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelAsyncInvocationRequest 请求对象
     * @return CancelAsyncInvocationResponse
     */
    public CancelAsyncInvocationResponse cancelAsyncInvocation(CancelAsyncInvocationRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.cancelAsyncInvocation);
    }

    /**
     * 停止函数异步调用请求
     *
     * -| 当前仅支持参数recursive为false且force为true的函数。 在1：N的函数做并发异步调用的场景下调用停止异步请求接口时，同一函数实例同时在执行的其他请求也会被一并停止并返回4208 function invocation canceled
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelAsyncInvocationRequest 请求对象
     * @return SyncInvoker<CancelAsyncInvocationRequest, CancelAsyncInvocationResponse>
     */
    public SyncInvoker<CancelAsyncInvocationRequest, CancelAsyncInvocationResponse> cancelAsyncInvocationInvoker(
        CancelAsyncInvocationRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.cancelAsyncInvocation, hcClient);
    }

    /**
     * 回调工作流
     *
     * 回调工作流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCallbackWorkflowRequest 请求对象
     * @return CreateCallbackWorkflowResponse
     */
    public CreateCallbackWorkflowResponse createCallbackWorkflow(CreateCallbackWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.createCallbackWorkflow);
    }

    /**
     * 回调工作流
     *
     * 回调工作流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCallbackWorkflowRequest 请求对象
     * @return SyncInvoker<CreateCallbackWorkflowRequest, CreateCallbackWorkflowResponse>
     */
    public SyncInvoker<CreateCallbackWorkflowRequest, CreateCallbackWorkflowResponse> createCallbackWorkflowInvoker(
        CreateCallbackWorkflowRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.createCallbackWorkflow, hcClient);
    }

    /**
     * 创建依赖包版本
     *
     * 创建依赖包版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDependencyVersionRequest 请求对象
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
     * @param request CreateDependencyVersionRequest 请求对象
     * @return SyncInvoker<CreateDependencyVersionRequest, CreateDependencyVersionResponse>
     */
    public SyncInvoker<CreateDependencyVersionRequest, CreateDependencyVersionResponse> createDependencyVersionInvoker(
        CreateDependencyVersionRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.createDependencyVersion, hcClient);
    }

    /**
     * 创建测试事件
     *
     * 创建测试事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEventRequest 请求对象
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
     * @param request CreateEventRequest 请求对象
     * @return SyncInvoker<CreateEventRequest, CreateEventResponse>
     */
    public SyncInvoker<CreateEventRequest, CreateEventResponse> createEventInvoker(CreateEventRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.createEvent, hcClient);
    }

    /**
     * 创建函数
     *
     * 创建指定的函数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFunctionRequest 请求对象
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
     * @param request CreateFunctionRequest 请求对象
     * @return SyncInvoker<CreateFunctionRequest, CreateFunctionResponse>
     */
    public SyncInvoker<CreateFunctionRequest, CreateFunctionResponse> createFunctionInvoker(
        CreateFunctionRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.createFunction, hcClient);
    }

    /**
     * 创建应用程序
     *
     * 创建应用程序（该功能目前仅支持华北-北京四、华东-上海一）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFunctionAppRequest 请求对象
     * @return CreateFunctionAppResponse
     */
    public CreateFunctionAppResponse createFunctionApp(CreateFunctionAppRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.createFunctionApp);
    }

    /**
     * 创建应用程序
     *
     * 创建应用程序（该功能目前仅支持华北-北京四、华东-上海一）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFunctionAppRequest 请求对象
     * @return SyncInvoker<CreateFunctionAppRequest, CreateFunctionAppResponse>
     */
    public SyncInvoker<CreateFunctionAppRequest, CreateFunctionAppResponse> createFunctionAppInvoker(
        CreateFunctionAppRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.createFunctionApp, hcClient);
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
     * @param request CreateFunctionTriggerRequest 请求对象
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
     * @param request CreateFunctionTriggerRequest 请求对象
     * @return SyncInvoker<CreateFunctionTriggerRequest, CreateFunctionTriggerResponse>
     */
    public SyncInvoker<CreateFunctionTriggerRequest, CreateFunctionTriggerResponse> createFunctionTriggerInvoker(
        CreateFunctionTriggerRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.createFunctionTrigger, hcClient);
    }

    /**
     * 发布函数版本
     *
     * 发布函数版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFunctionVersionRequest 请求对象
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
     * @param request CreateFunctionVersionRequest 请求对象
     * @return SyncInvoker<CreateFunctionVersionRequest, CreateFunctionVersionResponse>
     */
    public SyncInvoker<CreateFunctionVersionRequest, CreateFunctionVersionResponse> createFunctionVersionInvoker(
        CreateFunctionVersionRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.createFunctionVersion, hcClient);
    }

    /**
     * 创建资源标签
     *
     * 创建资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagsRequest 请求对象
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
     * @param request CreateTagsRequest 请求对象
     * @return SyncInvoker<CreateTagsRequest, CreateTagsResponse>
     */
    public SyncInvoker<CreateTagsRequest, CreateTagsResponse> createTagsInvoker(CreateTagsRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.createTags, hcClient);
    }

    /**
     * 创建函数版本别名
     *
     * 创建函数灰度版本别名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVersionAliasRequest 请求对象
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
     * @param request CreateVersionAliasRequest 请求对象
     * @return SyncInvoker<CreateVersionAliasRequest, CreateVersionAliasResponse>
     */
    public SyncInvoker<CreateVersionAliasRequest, CreateVersionAliasResponse> createVersionAliasInvoker(
        CreateVersionAliasRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.createVersionAlias, hcClient);
    }

    /**
     * 创建下沉入口
     *
     * 创建下沉入口。（该功能目前仅支持华北-北京四、华东-上海一、华东-上海二、西南-贵阳一）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpcEndpointRequest 请求对象
     * @return CreateVpcEndpointResponse
     */
    public CreateVpcEndpointResponse createVpcEndpoint(CreateVpcEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.createVpcEndpoint);
    }

    /**
     * 创建下沉入口
     *
     * 创建下沉入口。（该功能目前仅支持华北-北京四、华东-上海一、华东-上海二、西南-贵阳一）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpcEndpointRequest 请求对象
     * @return SyncInvoker<CreateVpcEndpointRequest, CreateVpcEndpointResponse>
     */
    public SyncInvoker<CreateVpcEndpointRequest, CreateVpcEndpointResponse> createVpcEndpointInvoker(
        CreateVpcEndpointRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.createVpcEndpoint, hcClient);
    }

    /**
     * 创建函数流
     *
     * 创建函数流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkflowRequest 请求对象
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
     * @param request CreateWorkflowRequest 请求对象
     * @return SyncInvoker<CreateWorkflowRequest, CreateWorkflowResponse>
     */
    public SyncInvoker<CreateWorkflowRequest, CreateWorkflowResponse> createWorkflowInvoker(
        CreateWorkflowRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.createWorkflow, hcClient);
    }

    /**
     * 删除依赖包版本
     *
     * 删除依赖包版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDependencyVersionRequest 请求对象
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
     * @param request DeleteDependencyVersionRequest 请求对象
     * @return SyncInvoker<DeleteDependencyVersionRequest, DeleteDependencyVersionResponse>
     */
    public SyncInvoker<DeleteDependencyVersionRequest, DeleteDependencyVersionResponse> deleteDependencyVersionInvoker(
        DeleteDependencyVersionRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.deleteDependencyVersion, hcClient);
    }

    /**
     * 删除指定测试事件
     *
     * 删除指定测试事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEventRequest 请求对象
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
     * @param request DeleteEventRequest 请求对象
     * @return SyncInvoker<DeleteEventRequest, DeleteEventResponse>
     */
    public SyncInvoker<DeleteEventRequest, DeleteEventResponse> deleteEventInvoker(DeleteEventRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.deleteEvent, hcClient);
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
     * @param request DeleteFunctionRequest 请求对象
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
     * @param request DeleteFunctionRequest 请求对象
     * @return SyncInvoker<DeleteFunctionRequest, DeleteFunctionResponse>
     */
    public SyncInvoker<DeleteFunctionRequest, DeleteFunctionResponse> deleteFunctionInvoker(
        DeleteFunctionRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.deleteFunction, hcClient);
    }

    /**
     * 删除应用程序
     *
     * 删除应用程序（该功能目前仅支持华北-北京四、华东-上海一）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFunctionAppRequest 请求对象
     * @return DeleteFunctionAppResponse
     */
    public DeleteFunctionAppResponse deleteFunctionApp(DeleteFunctionAppRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.deleteFunctionApp);
    }

    /**
     * 删除应用程序
     *
     * 删除应用程序（该功能目前仅支持华北-北京四、华东-上海一）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFunctionAppRequest 请求对象
     * @return SyncInvoker<DeleteFunctionAppRequest, DeleteFunctionAppResponse>
     */
    public SyncInvoker<DeleteFunctionAppRequest, DeleteFunctionAppResponse> deleteFunctionAppInvoker(
        DeleteFunctionAppRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.deleteFunctionApp, hcClient);
    }

    /**
     * 删除函数异步配置信息
     *
     * 删除函数异步配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFunctionAsyncInvokeConfigRequest 请求对象
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
     * @param request DeleteFunctionAsyncInvokeConfigRequest 请求对象
     * @return SyncInvoker<DeleteFunctionAsyncInvokeConfigRequest, DeleteFunctionAsyncInvokeConfigResponse>
     */
    public SyncInvoker<DeleteFunctionAsyncInvokeConfigRequest, DeleteFunctionAsyncInvokeConfigResponse> deleteFunctionAsyncInvokeConfigInvoker(
        DeleteFunctionAsyncInvokeConfigRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.deleteFunctionAsyncInvokeConfig, hcClient);
    }

    /**
     * 删除触发器
     *
     * 删除触发器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFunctionTriggerRequest 请求对象
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
     * @param request DeleteFunctionTriggerRequest 请求对象
     * @return SyncInvoker<DeleteFunctionTriggerRequest, DeleteFunctionTriggerResponse>
     */
    public SyncInvoker<DeleteFunctionTriggerRequest, DeleteFunctionTriggerResponse> deleteFunctionTriggerInvoker(
        DeleteFunctionTriggerRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.deleteFunctionTrigger, hcClient);
    }

    /**
     * 删除资源标签
     *
     * 删除资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagsRequest 请求对象
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
     * @param request DeleteTagsRequest 请求对象
     * @return SyncInvoker<DeleteTagsRequest, DeleteTagsResponse>
     */
    public SyncInvoker<DeleteTagsRequest, DeleteTagsResponse> deleteTagsInvoker(DeleteTagsRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.deleteTags, hcClient);
    }

    /**
     * 删除函数版本别名
     *
     * 删除函数版本别名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVersionAliasRequest 请求对象
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
     * @param request DeleteVersionAliasRequest 请求对象
     * @return SyncInvoker<DeleteVersionAliasRequest, DeleteVersionAliasResponse>
     */
    public SyncInvoker<DeleteVersionAliasRequest, DeleteVersionAliasResponse> deleteVersionAliasInvoker(
        DeleteVersionAliasRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.deleteVersionAlias, hcClient);
    }

    /**
     * 删除下沉入口
     *
     * 删除下沉入口。（该功能目前仅支持华北-北京四、华东-上海一、华东-上海二、西南-贵阳一）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpcEndpointRequest 请求对象
     * @return DeleteVpcEndpointResponse
     */
    public DeleteVpcEndpointResponse deleteVpcEndpoint(DeleteVpcEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.deleteVpcEndpoint);
    }

    /**
     * 删除下沉入口
     *
     * 删除下沉入口。（该功能目前仅支持华北-北京四、华东-上海一、华东-上海二、西南-贵阳一）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpcEndpointRequest 请求对象
     * @return SyncInvoker<DeleteVpcEndpointRequest, DeleteVpcEndpointResponse>
     */
    public SyncInvoker<DeleteVpcEndpointRequest, DeleteVpcEndpointResponse> deleteVpcEndpointInvoker(
        DeleteVpcEndpointRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.deleteVpcEndpoint, hcClient);
    }

    /**
     * 允许异步状态通知
     *
     * 允许异步状态通知。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableAsyncStatusLogRequest 请求对象
     * @return EnableAsyncStatusLogResponse
     */
    public EnableAsyncStatusLogResponse enableAsyncStatusLog(EnableAsyncStatusLogRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.enableAsyncStatusLog);
    }

    /**
     * 允许异步状态通知
     *
     * 允许异步状态通知。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableAsyncStatusLogRequest 请求对象
     * @return SyncInvoker<EnableAsyncStatusLogRequest, EnableAsyncStatusLogResponse>
     */
    public SyncInvoker<EnableAsyncStatusLogRequest, EnableAsyncStatusLogResponse> enableAsyncStatusLogInvoker(
        EnableAsyncStatusLogRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.enableAsyncStatusLog, hcClient);
    }

    /**
     * 开通lts日志上报功能
     *
     * 开通lts日志上报功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableLtsLogsRequest 请求对象
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
     * @param request EnableLtsLogsRequest 请求对象
     * @return SyncInvoker<EnableLtsLogsRequest, EnableLtsLogsResponse>
     */
    public SyncInvoker<EnableLtsLogsRequest, EnableLtsLogsResponse> enableLtsLogsInvoker(EnableLtsLogsRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.enableLtsLogs, hcClient);
    }

    /**
     * 导出函数
     *
     * 导出函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportFunctionRequest 请求对象
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
     * @param request ExportFunctionRequest 请求对象
     * @return SyncInvoker<ExportFunctionRequest, ExportFunctionResponse>
     */
    public SyncInvoker<ExportFunctionRequest, ExportFunctionResponse> exportFunctionInvoker(
        ExportFunctionRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.exportFunction, hcClient);
    }

    /**
     * 导入函数
     *
     * 导入函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportFunctionRequest 请求对象
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
     * @param request ImportFunctionRequest 请求对象
     * @return SyncInvoker<ImportFunctionRequest, ImportFunctionResponse>
     */
    public SyncInvoker<ImportFunctionRequest, ImportFunctionResponse> importFunctionInvoker(
        ImportFunctionRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.importFunction, hcClient);
    }

    /**
     * 同步执行函数
     *
     * 同步调用指的是客户端请求需要明确等到响应结果，也就是说这样的请求必须得调用到用户的函数，并且等到调用完成才返回。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InvokeFunctionRequest 请求对象
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
     * @param request InvokeFunctionRequest 请求对象
     * @return SyncInvoker<InvokeFunctionRequest, InvokeFunctionResponse>
     */
    public SyncInvoker<InvokeFunctionRequest, InvokeFunctionResponse> invokeFunctionInvoker(
        InvokeFunctionRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.invokeFunction, hcClient);
    }

    /**
     * 获取函数活跃异步调用请求列表
     *
     * 获取函数异步调用活跃请求列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListActiveAsyncInvocationsRequest 请求对象
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
     * @param request ListActiveAsyncInvocationsRequest 请求对象
     * @return SyncInvoker<ListActiveAsyncInvocationsRequest, ListActiveAsyncInvocationsResponse>
     */
    public SyncInvoker<ListActiveAsyncInvocationsRequest, ListActiveAsyncInvocationsResponse> listActiveAsyncInvocationsInvoker(
        ListActiveAsyncInvocationsRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.listActiveAsyncInvocations, hcClient);
    }

    /**
     * 查询应用程序模板列表
     *
     * 查询应用程序模板列表（该功能目前仅支持华北-北京四、华东-上海一）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppTemplatesRequest 请求对象
     * @return ListAppTemplatesResponse
     */
    public ListAppTemplatesResponse listAppTemplates(ListAppTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listAppTemplates);
    }

    /**
     * 查询应用程序模板列表
     *
     * 查询应用程序模板列表（该功能目前仅支持华北-北京四、华东-上海一）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppTemplatesRequest 请求对象
     * @return SyncInvoker<ListAppTemplatesRequest, ListAppTemplatesResponse>
     */
    public SyncInvoker<ListAppTemplatesRequest, ListAppTemplatesResponse> listAppTemplatesInvoker(
        ListAppTemplatesRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.listAppTemplates, hcClient);
    }

    /**
     * 获取函数异步调用请求列表
     *
     * 获取函数异步调用请求列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAsyncInvocationsRequest 请求对象
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
     * @param request ListAsyncInvocationsRequest 请求对象
     * @return SyncInvoker<ListAsyncInvocationsRequest, ListAsyncInvocationsResponse>
     */
    public SyncInvoker<ListAsyncInvocationsRequest, ListAsyncInvocationsResponse> listAsyncInvocationsInvoker(
        ListAsyncInvocationsRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.listAsyncInvocations, hcClient);
    }

    /**
     * 获取指定函数绑定的servicebridge函数列表
     *
     * 获取指定函数绑定的servicebridge函数列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBridgeFunctionsRequest 请求对象
     * @return ListBridgeFunctionsResponse
     */
    public ListBridgeFunctionsResponse listBridgeFunctions(ListBridgeFunctionsRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listBridgeFunctions);
    }

    /**
     * 获取指定函数绑定的servicebridge函数列表
     *
     * 获取指定函数绑定的servicebridge函数列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBridgeFunctionsRequest 请求对象
     * @return SyncInvoker<ListBridgeFunctionsRequest, ListBridgeFunctionsResponse>
     */
    public SyncInvoker<ListBridgeFunctionsRequest, ListBridgeFunctionsResponse> listBridgeFunctionsInvoker(
        ListBridgeFunctionsRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.listBridgeFunctions, hcClient);
    }

    /**
     * 获取servicebridge可用的版本
     *
     * 获取servicebridge可用的版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBridgeVersionsRequest 请求对象
     * @return ListBridgeVersionsResponse
     */
    public ListBridgeVersionsResponse listBridgeVersions(ListBridgeVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listBridgeVersions);
    }

    /**
     * 获取servicebridge可用的版本
     *
     * 获取servicebridge可用的版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBridgeVersionsRequest 请求对象
     * @return SyncInvoker<ListBridgeVersionsRequest, ListBridgeVersionsResponse>
     */
    public SyncInvoker<ListBridgeVersionsRequest, ListBridgeVersionsResponse> listBridgeVersionsInvoker(
        ListBridgeVersionsRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.listBridgeVersions, hcClient);
    }

    /**
     * 获取依赖包列表
     *
     * 获取依赖包列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDependenciesRequest 请求对象
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
     * @param request ListDependenciesRequest 请求对象
     * @return SyncInvoker<ListDependenciesRequest, ListDependenciesResponse>
     */
    public SyncInvoker<ListDependenciesRequest, ListDependenciesResponse> listDependenciesInvoker(
        ListDependenciesRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.listDependencies, hcClient);
    }

    /**
     * 获取依赖包版本列表
     *
     * 获取依赖包版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDependencyVersionRequest 请求对象
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
     * @param request ListDependencyVersionRequest 请求对象
     * @return SyncInvoker<ListDependencyVersionRequest, ListDependencyVersionResponse>
     */
    public SyncInvoker<ListDependencyVersionRequest, ListDependencyVersionResponse> listDependencyVersionInvoker(
        ListDependencyVersionRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.listDependencyVersion, hcClient);
    }

    /**
     * 获取指定函数的测试事件列表
     *
     * 获取指定函数的测试事件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventsRequest 请求对象
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
     * @param request ListEventsRequest 请求对象
     * @return SyncInvoker<ListEventsRequest, ListEventsResponse>
     */
    public SyncInvoker<ListEventsRequest, ListEventsResponse> listEventsInvoker(ListEventsRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.listEvents, hcClient);
    }

    /**
     * 查询应用程序列表
     *
     * 查询应用程序列表（该功能目前仅支持华北-北京四、华东-上海一）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFunctionApplicationsRequest 请求对象
     * @return ListFunctionApplicationsResponse
     */
    public ListFunctionApplicationsResponse listFunctionApplications(ListFunctionApplicationsRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listFunctionApplications);
    }

    /**
     * 查询应用程序列表
     *
     * 查询应用程序列表（该功能目前仅支持华北-北京四、华东-上海一）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFunctionApplicationsRequest 请求对象
     * @return SyncInvoker<ListFunctionApplicationsRequest, ListFunctionApplicationsResponse>
     */
    public SyncInvoker<ListFunctionApplicationsRequest, ListFunctionApplicationsResponse> listFunctionApplicationsInvoker(
        ListFunctionApplicationsRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.listFunctionApplications, hcClient);
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
     * @param request ListFunctionAsMetricRequest 请求对象
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
     * @param request ListFunctionAsMetricRequest 请求对象
     * @return SyncInvoker<ListFunctionAsMetricRequest, ListFunctionAsMetricResponse>
     */
    public SyncInvoker<ListFunctionAsMetricRequest, ListFunctionAsMetricResponse> listFunctionAsMetricInvoker(
        ListFunctionAsMetricRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.listFunctionAsMetric, hcClient);
    }

    /**
     * 获取函数异步配置列表
     *
     * 获取指定函数所有版本的异步配置列表。。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFunctionAsyncInvokeConfigRequest 请求对象
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
     * @param request ListFunctionAsyncInvokeConfigRequest 请求对象
     * @return SyncInvoker<ListFunctionAsyncInvokeConfigRequest, ListFunctionAsyncInvokeConfigResponse>
     */
    public SyncInvoker<ListFunctionAsyncInvokeConfigRequest, ListFunctionAsyncInvokeConfigResponse> listFunctionAsyncInvokeConfigInvoker(
        ListFunctionAsyncInvokeConfigRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.listFunctionAsyncInvokeConfig, hcClient);
    }

    /**
     * 获取函数预留实例数量
     *
     * 获取函数预留实例数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFunctionReservedInstancesRequest 请求对象
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
     * @param request ListFunctionReservedInstancesRequest 请求对象
     * @return SyncInvoker<ListFunctionReservedInstancesRequest, ListFunctionReservedInstancesResponse>
     */
    public SyncInvoker<ListFunctionReservedInstancesRequest, ListFunctionReservedInstancesResponse> listFunctionReservedInstancesInvoker(
        ListFunctionReservedInstancesRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.listFunctionReservedInstances, hcClient);
    }

    /**
     * 获取指定时间段的函数运行指标
     *
     * 获取指定时间段的函数运行指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFunctionStatisticsRequest 请求对象
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
     * @param request ListFunctionStatisticsRequest 请求对象
     * @return SyncInvoker<ListFunctionStatisticsRequest, ListFunctionStatisticsResponse>
     */
    public SyncInvoker<ListFunctionStatisticsRequest, ListFunctionStatisticsResponse> listFunctionStatisticsInvoker(
        ListFunctionStatisticsRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.listFunctionStatistics, hcClient);
    }

    /**
     * 查询函数标签列表
     *
     * 查询函数标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFunctionTagsRequest 请求对象
     * @return ListFunctionTagsResponse
     */
    public ListFunctionTagsResponse listFunctionTags(ListFunctionTagsRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listFunctionTags);
    }

    /**
     * 查询函数标签列表
     *
     * 查询函数标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFunctionTagsRequest 请求对象
     * @return SyncInvoker<ListFunctionTagsRequest, ListFunctionTagsResponse>
     */
    public SyncInvoker<ListFunctionTagsRequest, ListFunctionTagsResponse> listFunctionTagsInvoker(
        ListFunctionTagsRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.listFunctionTags, hcClient);
    }

    /**
     * 获取函数模板列表
     *
     * 获取函数模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFunctionTemplateRequest 请求对象
     * @return ListFunctionTemplateResponse
     */
    public ListFunctionTemplateResponse listFunctionTemplate(ListFunctionTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listFunctionTemplate);
    }

    /**
     * 获取函数模板列表
     *
     * 获取函数模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFunctionTemplateRequest 请求对象
     * @return SyncInvoker<ListFunctionTemplateRequest, ListFunctionTemplateResponse>
     */
    public SyncInvoker<ListFunctionTemplateRequest, ListFunctionTemplateResponse> listFunctionTemplateInvoker(
        ListFunctionTemplateRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.listFunctionTemplate, hcClient);
    }

    /**
     * 获取指定函数的所有触发器
     *
     * 获取指定函数的所有触发器设置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFunctionTriggersRequest 请求对象
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
     * @param request ListFunctionTriggersRequest 请求对象
     * @return SyncInvoker<ListFunctionTriggersRequest, ListFunctionTriggersResponse>
     */
    public SyncInvoker<ListFunctionTriggersRequest, ListFunctionTriggersResponse> listFunctionTriggersInvoker(
        ListFunctionTriggersRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.listFunctionTriggers, hcClient);
    }

    /**
     * 获取指定函数的版本列表
     *
     * 获取指定函数的版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFunctionVersionsRequest 请求对象
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
     * @param request ListFunctionVersionsRequest 请求对象
     * @return SyncInvoker<ListFunctionVersionsRequest, ListFunctionVersionsResponse>
     */
    public SyncInvoker<ListFunctionVersionsRequest, ListFunctionVersionsResponse> listFunctionVersionsInvoker(
        ListFunctionVersionsRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.listFunctionVersions, hcClient);
    }

    /**
     * 获取函数列表
     *
     * 获取函数列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFunctionsRequest 请求对象
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
     * @param request ListFunctionsRequest 请求对象
     * @return SyncInvoker<ListFunctionsRequest, ListFunctionsResponse>
     */
    public SyncInvoker<ListFunctionsRequest, ListFunctionsResponse> listFunctionsInvoker(ListFunctionsRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.listFunctions, hcClient);
    }

    /**
     * 查询租户配额
     *
     * 查询租户配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotasRequest 请求对象
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
     * @param request ListQuotasRequest 请求对象
     * @return SyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public SyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasInvoker(ListQuotasRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.listQuotas, hcClient);
    }

    /**
     * 获取函数预留实例配置列表
     *
     * 获取函数预留实例配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReservedInstanceConfigsRequest 请求对象
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
     * @param request ListReservedInstanceConfigsRequest 请求对象
     * @return SyncInvoker<ListReservedInstanceConfigsRequest, ListReservedInstanceConfigsResponse>
     */
    public SyncInvoker<ListReservedInstanceConfigsRequest, ListReservedInstanceConfigsResponse> listReservedInstanceConfigsInvoker(
        ListReservedInstanceConfigsRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.listReservedInstanceConfigs, hcClient);
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
     * @param request ListStatisticsRequest 请求对象
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
     * @param request ListStatisticsRequest 请求对象
     * @return SyncInvoker<ListStatisticsRequest, ListStatisticsResponse>
     */
    public SyncInvoker<ListStatisticsRequest, ListStatisticsResponse> listStatisticsInvoker(
        ListStatisticsRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.listStatistics, hcClient);
    }

    /**
     * 获取指定函数所有版本别名列表
     *
     * 获取函数版本别名列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVersionAliasesRequest 请求对象
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
     * @param request ListVersionAliasesRequest 请求对象
     * @return SyncInvoker<ListVersionAliasesRequest, ListVersionAliasesResponse>
     */
    public SyncInvoker<ListVersionAliasesRequest, ListVersionAliasesResponse> listVersionAliasesInvoker(
        ListVersionAliasesRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.listVersionAliases, hcClient);
    }

    /**
     * 查询函数流
     *
     * 查询函数流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkflowRequest 请求对象
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
     * @param request ListWorkflowRequest 请求对象
     * @return SyncInvoker<ListWorkflowRequest, ListWorkflowResponse>
     */
    public SyncInvoker<ListWorkflowRequest, ListWorkflowResponse> listWorkflowInvoker(ListWorkflowRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.listWorkflow, hcClient);
    }

    /**
     * 获取指定函数流执行实例列表
     *
     * 获取指定函数流执行实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkflowExecutionsRequest 请求对象
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
     * @param request ListWorkflowExecutionsRequest 请求对象
     * @return SyncInvoker<ListWorkflowExecutionsRequest, ListWorkflowExecutionsResponse>
     */
    public SyncInvoker<ListWorkflowExecutionsRequest, ListWorkflowExecutionsResponse> listWorkflowExecutionsInvoker(
        ListWorkflowExecutionsRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.listWorkflowExecutions, hcClient);
    }

    /**
     * 重试函数流
     *
     * 重试函数流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryWorkFlowRequest 请求对象
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
     * @param request RetryWorkFlowRequest 请求对象
     * @return SyncInvoker<RetryWorkFlowRequest, RetryWorkFlowResponse>
     */
    public SyncInvoker<RetryWorkFlowRequest, RetryWorkFlowResponse> retryWorkFlowInvoker(RetryWorkFlowRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.retryWorkFlow, hcClient);
    }

    /**
     * 查询应用程序模板详情
     *
     * 查询应用程序模板详情（该功能目前仅支持华北-北京四、华东-上海一）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppTemplateRequest 请求对象
     * @return ShowAppTemplateResponse
     */
    public ShowAppTemplateResponse showAppTemplate(ShowAppTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.showAppTemplate);
    }

    /**
     * 查询应用程序模板详情
     *
     * 查询应用程序模板详情（该功能目前仅支持华北-北京四、华东-上海一）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppTemplateRequest 请求对象
     * @return SyncInvoker<ShowAppTemplateRequest, ShowAppTemplateResponse>
     */
    public SyncInvoker<ShowAppTemplateRequest, ShowAppTemplateResponse> showAppTemplateInvoker(
        ShowAppTemplateRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.showAppTemplate, hcClient);
    }

    /**
     * 获取依赖包版本详情
     *
     * 获取依赖包版本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDependencyVersionRequest 请求对象
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
     * @param request ShowDependencyVersionRequest 请求对象
     * @return SyncInvoker<ShowDependencyVersionRequest, ShowDependencyVersionResponse>
     */
    public SyncInvoker<ShowDependencyVersionRequest, ShowDependencyVersionResponse> showDependencyVersionInvoker(
        ShowDependencyVersionRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.showDependencyVersion, hcClient);
    }

    /**
     * 获取测试事件详细信息
     *
     * 获取测试事件详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEventRequest 请求对象
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
     * @param request ShowEventRequest 请求对象
     * @return SyncInvoker<ShowEventRequest, ShowEventResponse>
     */
    public SyncInvoker<ShowEventRequest, ShowEventResponse> showEventInvoker(ShowEventRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.showEvent, hcClient);
    }

    /**
     * 查询函数实例使用情况指标
     *
     * 查询函数实例使用情况指标。
     * 
     * - 指标单位为分钟：
     *     当查询时间范围小于1小时,指标周期为1分钟
     *     当查询时间范围小于1天,指标周期为30分钟
     *     当查询时间范围大于1天,指标周期为180分钟
     * - 指标分为如下几类：reservedinstancenum（预留实例使用）、concurrency（实例使用/并发）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFuncReservedInstanceMetricsRequest 请求对象
     * @return ShowFuncReservedInstanceMetricsResponse
     */
    public ShowFuncReservedInstanceMetricsResponse showFuncReservedInstanceMetrics(
        ShowFuncReservedInstanceMetricsRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.showFuncReservedInstanceMetrics);
    }

    /**
     * 查询函数实例使用情况指标
     *
     * 查询函数实例使用情况指标。
     * 
     * - 指标单位为分钟：
     *     当查询时间范围小于1小时,指标周期为1分钟
     *     当查询时间范围小于1天,指标周期为30分钟
     *     当查询时间范围大于1天,指标周期为180分钟
     * - 指标分为如下几类：reservedinstancenum（预留实例使用）、concurrency（实例使用/并发）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFuncReservedInstanceMetricsRequest 请求对象
     * @return SyncInvoker<ShowFuncReservedInstanceMetricsRequest, ShowFuncReservedInstanceMetricsResponse>
     */
    public SyncInvoker<ShowFuncReservedInstanceMetricsRequest, ShowFuncReservedInstanceMetricsResponse> showFuncReservedInstanceMetricsInvoker(
        ShowFuncReservedInstanceMetricsRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.showFuncReservedInstanceMetrics, hcClient);
    }

    /**
     * 查询函数快照制作状态
     *
     * 查询函数快照制作状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFuncSnapshotStateRequest 请求对象
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
     * @param request ShowFuncSnapshotStateRequest 请求对象
     * @return SyncInvoker<ShowFuncSnapshotStateRequest, ShowFuncSnapshotStateResponse>
     */
    public SyncInvoker<ShowFuncSnapshotStateRequest, ShowFuncSnapshotStateResponse> showFuncSnapshotStateInvoker(
        ShowFuncSnapshotStateRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.showFuncSnapshotState, hcClient);
    }

    /**
     * 查询应用程序详情
     *
     * 查询应用程序详情（该功能目前仅支持华北-北京四、华东-上海一）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFunctionAppRequest 请求对象
     * @return ShowFunctionAppResponse
     */
    public ShowFunctionAppResponse showFunctionApp(ShowFunctionAppRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.showFunctionApp);
    }

    /**
     * 查询应用程序详情
     *
     * 查询应用程序详情（该功能目前仅支持华北-北京四、华东-上海一）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFunctionAppRequest 请求对象
     * @return SyncInvoker<ShowFunctionAppRequest, ShowFunctionAppResponse>
     */
    public SyncInvoker<ShowFunctionAppRequest, ShowFunctionAppResponse> showFunctionAppInvoker(
        ShowFunctionAppRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.showFunctionApp, hcClient);
    }

    /**
     * 获取函数异步配置信息
     *
     * 获取指定函数某一版本的异步配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFunctionAsyncInvokeConfigRequest 请求对象
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
     * @param request ShowFunctionAsyncInvokeConfigRequest 请求对象
     * @return SyncInvoker<ShowFunctionAsyncInvokeConfigRequest, ShowFunctionAsyncInvokeConfigResponse>
     */
    public SyncInvoker<ShowFunctionAsyncInvokeConfigRequest, ShowFunctionAsyncInvokeConfigResponse> showFunctionAsyncInvokeConfigInvoker(
        ShowFunctionAsyncInvokeConfigRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.showFunctionAsyncInvokeConfig, hcClient);
    }

    /**
     * 获取指定函数代码
     *
     * 获取指定函数的代码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFunctionCodeRequest 请求对象
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
     * @param request ShowFunctionCodeRequest 请求对象
     * @return SyncInvoker<ShowFunctionCodeRequest, ShowFunctionCodeResponse>
     */
    public SyncInvoker<ShowFunctionCodeRequest, ShowFunctionCodeResponse> showFunctionCodeInvoker(
        ShowFunctionCodeRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.showFunctionCode, hcClient);
    }

    /**
     * 获取函数的metadata
     *
     * 获取指定函数的metadata。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFunctionConfigRequest 请求对象
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
     * @param request ShowFunctionConfigRequest 请求对象
     * @return SyncInvoker<ShowFunctionConfigRequest, ShowFunctionConfigResponse>
     */
    public SyncInvoker<ShowFunctionConfigRequest, ShowFunctionConfigResponse> showFunctionConfigInvoker(
        ShowFunctionConfigRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.showFunctionConfig, hcClient);
    }

    /**
     * 查询函数实例流量指标
     *
     * 查询函数流量指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFunctionMetricsRequest 请求对象
     * @return ShowFunctionMetricsResponse
     */
    public ShowFunctionMetricsResponse showFunctionMetrics(ShowFunctionMetricsRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.showFunctionMetrics);
    }

    /**
     * 查询函数实例流量指标
     *
     * 查询函数流量指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFunctionMetricsRequest 请求对象
     * @return SyncInvoker<ShowFunctionMetricsRequest, ShowFunctionMetricsResponse>
     */
    public SyncInvoker<ShowFunctionMetricsRequest, ShowFunctionMetricsResponse> showFunctionMetricsInvoker(
        ShowFunctionMetricsRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.showFunctionMetrics, hcClient);
    }

    /**
     * 获取指定函数模板
     *
     * 获取指定函数模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFunctionTemplateRequest 请求对象
     * @return ShowFunctionTemplateResponse
     */
    public ShowFunctionTemplateResponse showFunctionTemplate(ShowFunctionTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.showFunctionTemplate);
    }

    /**
     * 获取指定函数模板
     *
     * 获取指定函数模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFunctionTemplateRequest 请求对象
     * @return SyncInvoker<ShowFunctionTemplateRequest, ShowFunctionTemplateResponse>
     */
    public SyncInvoker<ShowFunctionTemplateRequest, ShowFunctionTemplateResponse> showFunctionTemplateInvoker(
        ShowFunctionTemplateRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.showFunctionTemplate, hcClient);
    }

    /**
     * 获取指定触发器的信息
     *
     * 获取特定触发器的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFunctionTriggerRequest 请求对象
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
     * @param request ShowFunctionTriggerRequest 请求对象
     * @return SyncInvoker<ShowFunctionTriggerRequest, ShowFunctionTriggerResponse>
     */
    public SyncInvoker<ShowFunctionTriggerRequest, ShowFunctionTriggerResponse> showFunctionTriggerInvoker(
        ShowFunctionTriggerRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.showFunctionTrigger, hcClient);
    }

    /**
     * 获取指定函数的lts日志组日志流配置
     *
     * 获取指定函数的lts日志组日志流配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLtsLogDetailsRequest 请求对象
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
     * @param request ShowLtsLogDetailsRequest 请求对象
     * @return SyncInvoker<ShowLtsLogDetailsRequest, ShowLtsLogDetailsResponse>
     */
    public SyncInvoker<ShowLtsLogDetailsRequest, ShowLtsLogDetailsResponse> showLtsLogDetailsInvoker(
        ShowLtsLogDetailsRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.showLtsLogDetails, hcClient);
    }

    /**
     * 查询异步日志详情
     *
     * 查询异步日志详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectAsyncStatusLogInfoRequest 请求对象
     * @return ShowProjectAsyncStatusLogInfoResponse
     */
    public ShowProjectAsyncStatusLogInfoResponse showProjectAsyncStatusLogInfo(
        ShowProjectAsyncStatusLogInfoRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.showProjectAsyncStatusLogInfo);
    }

    /**
     * 查询异步日志详情
     *
     * 查询异步日志详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectAsyncStatusLogInfoRequest 请求对象
     * @return SyncInvoker<ShowProjectAsyncStatusLogInfoRequest, ShowProjectAsyncStatusLogInfoResponse>
     */
    public SyncInvoker<ShowProjectAsyncStatusLogInfoRequest, ShowProjectAsyncStatusLogInfoResponse> showProjectAsyncStatusLogInfoInvoker(
        ShowProjectAsyncStatusLogInfoRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.showProjectAsyncStatusLogInfo, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectTagsListRequest 请求对象
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
     * @param request ShowProjectTagsListRequest 请求对象
     * @return SyncInvoker<ShowProjectTagsListRequest, ShowProjectTagsListResponse>
     */
    public SyncInvoker<ShowProjectTagsListRequest, ShowProjectTagsListResponse> showProjectTagsListInvoker(
        ShowProjectTagsListRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.showProjectTagsList, hcClient);
    }

    /**
     * 查询资源实例
     *
     * 查询资源实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResInstanceInfoRequest 请求对象
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
     * @param request ShowResInstanceInfoRequest 请求对象
     * @return SyncInvoker<ShowResInstanceInfoRequest, ShowResInstanceInfoResponse>
     */
    public SyncInvoker<ShowResInstanceInfoRequest, ShowResInstanceInfoResponse> showResInstanceInfoInvoker(
        ShowResInstanceInfoRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.showResInstanceInfo, hcClient);
    }

    /**
     * 获取函数流指标
     *
     * 获取函数流指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTenantMetricRequest 请求对象
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
     * @param request ShowTenantMetricRequest 请求对象
     * @return SyncInvoker<ShowTenantMetricRequest, ShowTenantMetricResponse>
     */
    public SyncInvoker<ShowTenantMetricRequest, ShowTenantMetricResponse> showTenantMetricInvoker(
        ShowTenantMetricRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.showTenantMetric, hcClient);
    }

    /**
     * 获取函数调用链配置
     *
     * 获取函数调用链配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTracingRequest 请求对象
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
     * @param request ShowTracingRequest 请求对象
     * @return SyncInvoker<ShowTracingRequest, ShowTracingResponse>
     */
    public SyncInvoker<ShowTracingRequest, ShowTracingResponse> showTracingInvoker(ShowTracingRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.showTracing, hcClient);
    }

    /**
     * 获取函数版本的指定别名信息
     *
     * 获取函数指定的版本别名信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVersionAliasRequest 请求对象
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
     * @param request ShowVersionAliasRequest 请求对象
     * @return SyncInvoker<ShowVersionAliasRequest, ShowVersionAliasResponse>
     */
    public SyncInvoker<ShowVersionAliasRequest, ShowVersionAliasResponse> showVersionAliasInvoker(
        ShowVersionAliasRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.showVersionAlias, hcClient);
    }

    /**
     * 获取指定函数流实例的元数据
     *
     * 获取指定函数流实例的元数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkFlowRequest 请求对象
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
     * @param request ShowWorkFlowRequest 请求对象
     * @return SyncInvoker<ShowWorkFlowRequest, ShowWorkFlowResponse>
     */
    public SyncInvoker<ShowWorkFlowRequest, ShowWorkFlowResponse> showWorkFlowInvoker(ShowWorkFlowRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.showWorkFlow, hcClient);
    }

    /**
     * 获取指定函数流指标
     *
     * 获取指定函数流指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkFlowMetricRequest 请求对象
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
     * @param request ShowWorkFlowMetricRequest 请求对象
     * @return SyncInvoker<ShowWorkFlowMetricRequest, ShowWorkFlowMetricResponse>
     */
    public SyncInvoker<ShowWorkFlowMetricRequest, ShowWorkFlowMetricResponse> showWorkFlowMetricInvoker(
        ShowWorkFlowMetricRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.showWorkFlowMetric, hcClient);
    }

    /**
     * 获取指定函数流执行实例
     *
     * 获取指定函数流执行实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowExecutionRequest 请求对象
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
     * @param request ShowWorkflowExecutionRequest 请求对象
     * @return SyncInvoker<ShowWorkflowExecutionRequest, ShowWorkflowExecutionResponse>
     */
    public SyncInvoker<ShowWorkflowExecutionRequest, ShowWorkflowExecutionResponse> showWorkflowExecutionInvoker(
        ShowWorkflowExecutionRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.showWorkflowExecution, hcClient);
    }

    /**
     * 分页获取指定函数流执行实例列表
     *
     * 分页获取指定函数流执行实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWorkflowExecutionForPageRequest 请求对象
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
     * @param request ShowWorkflowExecutionForPageRequest 请求对象
     * @return SyncInvoker<ShowWorkflowExecutionForPageRequest, ShowWorkflowExecutionForPageResponse>
     */
    public SyncInvoker<ShowWorkflowExecutionForPageRequest, ShowWorkflowExecutionForPageResponse> showWorkflowExecutionForPageInvoker(
        ShowWorkflowExecutionForPageRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.showWorkflowExecutionForPage, hcClient);
    }

    /**
     * 同步执行函数流
     *
     * 以同步执行方式启动函数流（仅快速模式函数流支持）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartSyncWorkflowExecutionRequest 请求对象
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
     * @param request StartSyncWorkflowExecutionRequest 请求对象
     * @return SyncInvoker<StartSyncWorkflowExecutionRequest, StartSyncWorkflowExecutionResponse>
     */
    public SyncInvoker<StartSyncWorkflowExecutionRequest, StartSyncWorkflowExecutionResponse> startSyncWorkflowExecutionInvoker(
        StartSyncWorkflowExecutionRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.startSyncWorkflowExecution, hcClient);
    }

    /**
     * 开始执行函数流
     *
     * 以异步执行方式启动函数流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartWorkflowExecutionRequest 请求对象
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
     * @param request StartWorkflowExecutionRequest 请求对象
     * @return SyncInvoker<StartWorkflowExecutionRequest, StartWorkflowExecutionResponse>
     */
    public SyncInvoker<StartWorkflowExecutionRequest, StartWorkflowExecutionResponse> startWorkflowExecutionInvoker(
        StartWorkflowExecutionRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.startWorkflowExecution, hcClient);
    }

    /**
     * 停止函数流
     *
     * 停止函数流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopWorkFlowRequest 请求对象
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
     * @param request StopWorkFlowRequest 请求对象
     * @return SyncInvoker<StopWorkFlowRequest, StopWorkFlowResponse>
     */
    public SyncInvoker<StopWorkFlowRequest, StopWorkFlowResponse> stopWorkFlowInvoker(StopWorkFlowRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.stopWorkFlow, hcClient);
    }

    /**
     * 更新测试事件详细信息
     *
     * 更新测试事件详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEventRequest 请求对象
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
     * @param request UpdateEventRequest 请求对象
     * @return SyncInvoker<UpdateEventRequest, UpdateEventResponse>
     */
    public SyncInvoker<UpdateEventRequest, UpdateEventResponse> updateEventInvoker(UpdateEventRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.updateEvent, hcClient);
    }

    /**
     * 禁用/启动函数快照
     *
     * 禁用/启动函数快照，仅支持java运行时函数，且为非latest版本才能开启函数快照功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFuncSnapshotRequest 请求对象
     * @return UpdateFuncSnapshotResponse
     */
    public UpdateFuncSnapshotResponse updateFuncSnapshot(UpdateFuncSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.updateFuncSnapshot);
    }

    /**
     * 禁用/启动函数快照
     *
     * 禁用/启动函数快照，仅支持java运行时函数，且为非latest版本才能开启函数快照功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFuncSnapshotRequest 请求对象
     * @return SyncInvoker<UpdateFuncSnapshotRequest, UpdateFuncSnapshotResponse>
     */
    public SyncInvoker<UpdateFuncSnapshotRequest, UpdateFuncSnapshotResponse> updateFuncSnapshotInvoker(
        UpdateFuncSnapshotRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.updateFuncSnapshot, hcClient);
    }

    /**
     * 设置函数异步配置信息
     *
     * 设置函数异步配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFunctionAsyncInvokeConfigRequest 请求对象
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
     * @param request UpdateFunctionAsyncInvokeConfigRequest 请求对象
     * @return SyncInvoker<UpdateFunctionAsyncInvokeConfigRequest, UpdateFunctionAsyncInvokeConfigResponse>
     */
    public SyncInvoker<UpdateFunctionAsyncInvokeConfigRequest, UpdateFunctionAsyncInvokeConfigResponse> updateFunctionAsyncInvokeConfigInvoker(
        UpdateFunctionAsyncInvokeConfigRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.updateFunctionAsyncInvokeConfig, hcClient);
    }

    /**
     * 修改函数代码
     *
     * 修改指定的函数的代码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFunctionCodeRequest 请求对象
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
     * @param request UpdateFunctionCodeRequest 请求对象
     * @return SyncInvoker<UpdateFunctionCodeRequest, UpdateFunctionCodeResponse>
     */
    public SyncInvoker<UpdateFunctionCodeRequest, UpdateFunctionCodeResponse> updateFunctionCodeInvoker(
        UpdateFunctionCodeRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.updateFunctionCode, hcClient);
    }

    /**
     * 更新函数置顶状态
     *
     * 更新函数置顶状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFunctionCollectStateRequest 请求对象
     * @return UpdateFunctionCollectStateResponse
     */
    public UpdateFunctionCollectStateResponse updateFunctionCollectState(UpdateFunctionCollectStateRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.updateFunctionCollectState);
    }

    /**
     * 更新函数置顶状态
     *
     * 更新函数置顶状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFunctionCollectStateRequest 请求对象
     * @return SyncInvoker<UpdateFunctionCollectStateRequest, UpdateFunctionCollectStateResponse>
     */
    public SyncInvoker<UpdateFunctionCollectStateRequest, UpdateFunctionCollectStateResponse> updateFunctionCollectStateInvoker(
        UpdateFunctionCollectStateRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.updateFunctionCollectState, hcClient);
    }

    /**
     * 修改函数的metadata信息
     *
     * 修改指定的函数的metadata信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFunctionConfigRequest 请求对象
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
     * @param request UpdateFunctionConfigRequest 请求对象
     * @return SyncInvoker<UpdateFunctionConfigRequest, UpdateFunctionConfigResponse>
     */
    public SyncInvoker<UpdateFunctionConfigRequest, UpdateFunctionConfigResponse> updateFunctionConfigInvoker(
        UpdateFunctionConfigRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.updateFunctionConfig, hcClient);
    }

    /**
     * 更新函数最大实例数
     *
     * 更新函数最大实例数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFunctionMaxInstanceConfigRequest 请求对象
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
     * @param request UpdateFunctionMaxInstanceConfigRequest 请求对象
     * @return SyncInvoker<UpdateFunctionMaxInstanceConfigRequest, UpdateFunctionMaxInstanceConfigResponse>
     */
    public SyncInvoker<UpdateFunctionMaxInstanceConfigRequest, UpdateFunctionMaxInstanceConfigResponse> updateFunctionMaxInstanceConfigInvoker(
        UpdateFunctionMaxInstanceConfigRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.updateFunctionMaxInstanceConfig, hcClient);
    }

    /**
     * 修改函数预留实例数量
     *
     * 修改函数预留实例数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFunctionReservedInstancesCountRequest 请求对象
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
     * @param request UpdateFunctionReservedInstancesCountRequest 请求对象
     * @return SyncInvoker<UpdateFunctionReservedInstancesCountRequest, UpdateFunctionReservedInstancesCountResponse>
     */
    public SyncInvoker<UpdateFunctionReservedInstancesCountRequest, UpdateFunctionReservedInstancesCountResponse> updateFunctionReservedInstancesCountInvoker(
        UpdateFunctionReservedInstancesCountRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.updateFunctionReservedInstancesCount, hcClient);
    }

    /**
     * 修改函数调用链配置
     *
     * 修改函数调用链配置,开通/修改传入aksk，关闭aksk传空
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTracingRequest 请求对象
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
     * @param request UpdateTracingRequest 请求对象
     * @return SyncInvoker<UpdateTracingRequest, UpdateTracingResponse>
     */
    public SyncInvoker<UpdateTracingRequest, UpdateTracingResponse> updateTracingInvoker(UpdateTracingRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.updateTracing, hcClient);
    }

    /**
     * 更新触发器
     *
     * 更新触发器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTriggerRequest 请求对象
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
     * @param request UpdateTriggerRequest 请求对象
     * @return SyncInvoker<UpdateTriggerRequest, UpdateTriggerResponse>
     */
    public SyncInvoker<UpdateTriggerRequest, UpdateTriggerResponse> updateTriggerInvoker(UpdateTriggerRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.updateTrigger, hcClient);
    }

    /**
     * 修改函数版本别名信息
     *
     * 修改函数版本别名信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVersionAliasRequest 请求对象
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
     * @param request UpdateVersionAliasRequest 请求对象
     * @return SyncInvoker<UpdateVersionAliasRequest, UpdateVersionAliasResponse>
     */
    public SyncInvoker<UpdateVersionAliasRequest, UpdateVersionAliasResponse> updateVersionAliasInvoker(
        UpdateVersionAliasRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.updateVersionAlias, hcClient);
    }

    /**
     * 修改指定函数流实例的元数据
     *
     * 修改指定函数流实例的元数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkFlowRequest 请求对象
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
     * @param request UpdateWorkFlowRequest 请求对象
     * @return SyncInvoker<UpdateWorkFlowRequest, UpdateWorkFlowResponse>
     */
    public SyncInvoker<UpdateWorkFlowRequest, UpdateWorkFlowResponse> updateWorkFlowInvoker(
        UpdateWorkFlowRequest request) {
        return new SyncInvoker<>(request, FunctionGraphMeta.updateWorkFlow, hcClient);
    }

}

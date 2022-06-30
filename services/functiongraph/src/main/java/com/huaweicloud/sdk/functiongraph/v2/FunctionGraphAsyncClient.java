package com.huaweicloud.sdk.functiongraph.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.functiongraph.v2.model.*;

import java.util.concurrent.CompletableFuture;

public class FunctionGraphAsyncClient {

    protected HcClient hcClient;

    public FunctionGraphAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<FunctionGraphAsyncClient> newBuilder() {
        return new ClientBuilder<>(FunctionGraphAsyncClient::new);
    }

    /**
     * 异步执行函数。
     *
     * 异步执行函数。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AsyncInvokeFunctionRequest 请求对象
     * @return CompletableFuture<AsyncInvokeFunctionResponse>
     */
    public CompletableFuture<AsyncInvokeFunctionResponse> asyncInvokeFunctionAsync(AsyncInvokeFunctionRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.asyncInvokeFunction);
    }

    /**
     * 异步执行函数。
     *
     * 异步执行函数。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 函数异步执行并返回预留实例ID。
     *
     * 函数异步执行并返回预留实例ID用于场景指客户端请求执行比较费时任务，不需要同步等待执行完成返回结果，该方法提前返回任务执行对应的预留实例ID, 如果预留实例有异常，
     * 可以通过该实例ID把对应实例删除（该接口主要针对白名单用户）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AsyncInvokeReservedFunctionRequest 请求对象
     * @return CompletableFuture<AsyncInvokeReservedFunctionResponse>
     */
    public CompletableFuture<AsyncInvokeReservedFunctionResponse> asyncInvokeReservedFunctionAsync(
        AsyncInvokeReservedFunctionRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.asyncInvokeReservedFunction);
    }

    /**
     * 函数异步执行并返回预留实例ID。
     *
     * 函数异步执行并返回预留实例ID用于场景指客户端请求执行比较费时任务，不需要同步等待执行完成返回结果，该方法提前返回任务执行对应的预留实例ID, 如果预留实例有异常，
     * 可以通过该实例ID把对应实例删除（该接口主要针对白名单用户）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 删除指定函数的所有触发器。
     *
     * 删除指定函数所有触发器设置。
     * 
     * 在提供函数版本且非latest的情况下，删除对应函数版本的触发器。
     * 在提供函数别名的情况下，删除对应函数别名的触发器。
     * 在不提供函数版本（也不提供别名）或版本为latest的情况下，删除该函数所有的触发器（包括所有版本和别名）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeleteFunctionTriggersRequest 请求对象
     * @return CompletableFuture<BatchDeleteFunctionTriggersResponse>
     */
    public CompletableFuture<BatchDeleteFunctionTriggersResponse> batchDeleteFunctionTriggersAsync(
        BatchDeleteFunctionTriggersRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.batchDeleteFunctionTriggers);
    }

    /**
     * 删除指定函数的所有触发器。
     *
     * 删除指定函数所有触发器设置。
     * 
     * 在提供函数版本且非latest的情况下，删除对应函数版本的触发器。
     * 在提供函数别名的情况下，删除对应函数别名的触发器。
     * 在不提供函数版本（也不提供别名）或版本为latest的情况下，删除该函数所有的触发器（包括所有版本和别名）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 删除工作流列表
     *
     * 删除工作流列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeleteWorkflowsRequest 请求对象
     * @return CompletableFuture<BatchDeleteWorkflowsResponse>
     */
    public CompletableFuture<BatchDeleteWorkflowsResponse> batchDeleteWorkflowsAsync(
        BatchDeleteWorkflowsRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.batchDeleteWorkflows);
    }

    /**
     * 删除工作流列表
     *
     * 删除工作流列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 停止函数异步调用请求
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 停止函数异步调用请求
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 创建依赖包。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 创建依赖包。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 创建测试事件
     *
     * 创建测试事件。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 创建测试事件。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateEventRequest 请求对象
     * @return AsyncInvoker<CreateEventRequest, CreateEventResponse>
     */
    public AsyncInvoker<CreateEventRequest, CreateEventResponse> createEventAsyncInvoker(CreateEventRequest request) {
        return new AsyncInvoker<CreateEventRequest, CreateEventResponse>(request, FunctionGraphMeta.createEvent,
            hcClient);
    }

    /**
     * 创建函数。
     *
     * 创建指定的函数。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateFunctionRequest 请求对象
     * @return CompletableFuture<CreateFunctionResponse>
     */
    public CompletableFuture<CreateFunctionResponse> createFunctionAsync(CreateFunctionRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.createFunction);
    }

    /**
     * 创建函数。
     *
     * 创建指定的函数。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 创建触发器。
     *
     * 创建触发器。
     * 
     * - 可以创建的触发器类型包括TIMER、APIG、CTS、DDS、DMS、DIS、LTS、OBS、SMN、KAFKA。
     * - DDS和KAFKA触发器创建时默认为DISABLED状态，其他触发器默认为ACTIVE状态。
     * - TIMER、DDS、DMS、KAFKA、LTS触发器支持禁用，其他触发器不支持。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateFunctionTriggerRequest 请求对象
     * @return CompletableFuture<CreateFunctionTriggerResponse>
     */
    public CompletableFuture<CreateFunctionTriggerResponse> createFunctionTriggerAsync(
        CreateFunctionTriggerRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.createFunctionTrigger);
    }

    /**
     * 创建触发器。
     *
     * 创建触发器。
     * 
     * - 可以创建的触发器类型包括TIMER、APIG、CTS、DDS、DMS、DIS、LTS、OBS、SMN、KAFKA。
     * - DDS和KAFKA触发器创建时默认为DISABLED状态，其他触发器默认为ACTIVE状态。
     * - TIMER、DDS、DMS、KAFKA、LTS触发器支持禁用，其他触发器不支持。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 发布函数版本。
     *
     * 发布函数版本。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateFunctionVersionRequest 请求对象
     * @return CompletableFuture<CreateFunctionVersionResponse>
     */
    public CompletableFuture<CreateFunctionVersionResponse> createFunctionVersionAsync(
        CreateFunctionVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.createFunctionVersion);
    }

    /**
     * 发布函数版本。
     *
     * 发布函数版本。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 创建函数版本别名。
     *
     * 创建函数灰度版本别名。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateVersionAliasRequest 请求对象
     * @return CompletableFuture<CreateVersionAliasResponse>
     */
    public CompletableFuture<CreateVersionAliasResponse> createVersionAliasAsync(CreateVersionAliasRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.createVersionAlias);
    }

    /**
     * 创建函数版本别名。
     *
     * 创建函数灰度版本别名。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 创建工作流列表
     *
     * 创建工作流列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateWorkflowRequest 请求对象
     * @return CompletableFuture<CreateWorkflowResponse>
     */
    public CompletableFuture<CreateWorkflowResponse> createWorkflowAsync(CreateWorkflowRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.createWorkflow);
    }

    /**
     * 创建工作流列表
     *
     * 创建工作流列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 删除依赖包
     *
     * 删除指定的依赖包。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteDependencyRequest 请求对象
     * @return CompletableFuture<DeleteDependencyResponse>
     */
    public CompletableFuture<DeleteDependencyResponse> deleteDependencyAsync(DeleteDependencyRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.deleteDependency);
    }

    /**
     * 删除依赖包
     *
     * 删除指定的依赖包。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 删除测试事件
     *
     * 删除测试事件。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteEventRequest 请求对象
     * @return CompletableFuture<DeleteEventResponse>
     */
    public CompletableFuture<DeleteEventResponse> deleteEventAsync(DeleteEventRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.deleteEvent);
    }

    /**
     * 删除测试事件
     *
     * 删除测试事件。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteEventRequest 请求对象
     * @return AsyncInvoker<DeleteEventRequest, DeleteEventResponse>
     */
    public AsyncInvoker<DeleteEventRequest, DeleteEventResponse> deleteEventAsyncInvoker(DeleteEventRequest request) {
        return new AsyncInvoker<DeleteEventRequest, DeleteEventResponse>(request, FunctionGraphMeta.deleteEvent,
            hcClient);
    }

    /**
     * 删除函数/版本。
     *
     * 删除指定的函数或者特定的版本（不允许删除latest版本）。
     * 
     * 如果URN中包含函数版本或者别名，则删除特定的函数版本或者别名指向的版本以及该版本关联的trigger。
     * 如果URN中不包含版本或者别名，则删除整个函数，包含所有版本以及别名，触发器。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteFunctionRequest 请求对象
     * @return CompletableFuture<DeleteFunctionResponse>
     */
    public CompletableFuture<DeleteFunctionResponse> deleteFunctionAsync(DeleteFunctionRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.deleteFunction);
    }

    /**
     * 删除函数/版本。
     *
     * 删除指定的函数或者特定的版本（不允许删除latest版本）。
     * 
     * 如果URN中包含函数版本或者别名，则删除特定的函数版本或者别名指向的版本以及该版本关联的trigger。
     * 如果URN中不包含版本或者别名，则删除整个函数，包含所有版本以及别名，触发器。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 删除函数异步配置信息。
     *
     * 删除函数异步配置信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteFunctionAsyncInvokeConfigRequest 请求对象
     * @return CompletableFuture<DeleteFunctionAsyncInvokeConfigResponse>
     */
    public CompletableFuture<DeleteFunctionAsyncInvokeConfigResponse> deleteFunctionAsyncInvokeConfigAsync(
        DeleteFunctionAsyncInvokeConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.deleteFunctionAsyncInvokeConfig);
    }

    /**
     * 删除函数异步配置信息。
     *
     * 删除函数异步配置信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 删除触发器。
     *
     * 删除触发器。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteFunctionTriggerRequest 请求对象
     * @return CompletableFuture<DeleteFunctionTriggerResponse>
     */
    public CompletableFuture<DeleteFunctionTriggerResponse> deleteFunctionTriggerAsync(
        DeleteFunctionTriggerRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.deleteFunctionTrigger);
    }

    /**
     * 删除触发器。
     *
     * 删除触发器。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 删除函数版本别名。
     *
     * 删除函数版本别名。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteVersionAliasRequest 请求对象
     * @return CompletableFuture<DeleteVersionAliasResponse>
     */
    public CompletableFuture<DeleteVersionAliasResponse> deleteVersionAliasAsync(DeleteVersionAliasRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.deleteVersionAlias);
    }

    /**
     * 删除函数版本别名。
     *
     * 删除函数版本别名。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 开通lts日志上报功能。
     *
     * 开通lts日志上报功能。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param EnableLtsLogsRequest 请求对象
     * @return CompletableFuture<EnableLtsLogsResponse>
     */
    public CompletableFuture<EnableLtsLogsResponse> enableLtsLogsAsync(EnableLtsLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.enableLtsLogs);
    }

    /**
     * 开通lts日志上报功能。
     *
     * 开通lts日志上报功能。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 导出函数。
     *
     * 导出函数。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExportFunctionRequest 请求对象
     * @return CompletableFuture<ExportFunctionResponse>
     */
    public CompletableFuture<ExportFunctionResponse> exportFunctionAsync(ExportFunctionRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.exportFunction);
    }

    /**
     * 导出函数。
     *
     * 导出函数。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 导入函数。
     *
     * 导入函数。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ImportFunctionRequest 请求对象
     * @return CompletableFuture<ImportFunctionResponse>
     */
    public CompletableFuture<ImportFunctionResponse> importFunctionAsync(ImportFunctionRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.importFunction);
    }

    /**
     * 导入函数。
     *
     * 导入函数。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 同步执行函数。
     *
     * 同步调用指的是客户端请求需要明确等到响应结果，也就是说这样的请求必须得调用到用户的函数，并且等到调用完成才返回。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param InvokeFunctionRequest 请求对象
     * @return CompletableFuture<InvokeFunctionResponse>
     */
    public CompletableFuture<InvokeFunctionResponse> invokeFunctionAsync(InvokeFunctionRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.invokeFunction);
    }

    /**
     * 同步执行函数。
     *
     * 同步调用指的是客户端请求需要明确等到响应结果，也就是说这样的请求必须得调用到用户的函数，并且等到调用完成才返回。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 获取依赖包列表
     *
     * 获取依赖包列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 获取依赖包列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 获取测试事件列表
     *
     * 获取指定函数的测试事件列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEventsRequest 请求对象
     * @return CompletableFuture<ListEventsResponse>
     */
    public CompletableFuture<ListEventsResponse> listEventsAsync(ListEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.listEvents);
    }

    /**
     * 获取测试事件列表
     *
     * 获取指定函数的测试事件列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEventsRequest 请求对象
     * @return AsyncInvoker<ListEventsRequest, ListEventsResponse>
     */
    public AsyncInvoker<ListEventsRequest, ListEventsResponse> listEventsAsyncInvoker(ListEventsRequest request) {
        return new AsyncInvoker<ListEventsRequest, ListEventsResponse>(request, FunctionGraphMeta.listEvents, hcClient);
    }

    /**
     * 获取函数异步调用请求列表
     *
     * 获取函数异步调用请求列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListFunctionAsyncInvocationsRequest 请求对象
     * @return CompletableFuture<ListFunctionAsyncInvocationsResponse>
     */
    public CompletableFuture<ListFunctionAsyncInvocationsResponse> listFunctionAsyncInvocationsAsync(
        ListFunctionAsyncInvocationsRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.listFunctionAsyncInvocations);
    }

    /**
     * 获取函数异步调用请求列表
     *
     * 获取函数异步调用请求列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListFunctionAsyncInvocationsRequest 请求对象
     * @return AsyncInvoker<ListFunctionAsyncInvocationsRequest, ListFunctionAsyncInvocationsResponse>
     */
    public AsyncInvoker<ListFunctionAsyncInvocationsRequest, ListFunctionAsyncInvocationsResponse> listFunctionAsyncInvocationsAsyncInvoker(
        ListFunctionAsyncInvocationsRequest request) {
        return new AsyncInvoker<ListFunctionAsyncInvocationsRequest, ListFunctionAsyncInvocationsResponse>(request,
            FunctionGraphMeta.listFunctionAsyncInvocations, hcClient);
    }

    /**
     * 获取函数异步配置列表
     *
     * 获取函数异步配置列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 获取函数异步配置列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 获取指定时间段的函数运行指标
     *
     * 获取指定时间段的函数运行指标。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 获取指定函数的所有触发器。
     *
     * 获取指定函数的所有触发器设置。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListFunctionTriggersRequest 请求对象
     * @return CompletableFuture<ListFunctionTriggersResponse>
     */
    public CompletableFuture<ListFunctionTriggersResponse> listFunctionTriggersAsync(
        ListFunctionTriggersRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.listFunctionTriggers);
    }

    /**
     * 获取指定函数的所有触发器。
     *
     * 获取指定函数的所有触发器设置。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 获取指定函数的版本列表。
     *
     * 获取指定函数的版本列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListFunctionVersionsRequest 请求对象
     * @return CompletableFuture<ListFunctionVersionsResponse>
     */
    public CompletableFuture<ListFunctionVersionsResponse> listFunctionVersionsAsync(
        ListFunctionVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.listFunctionVersions);
    }

    /**
     * 获取指定函数的版本列表。
     *
     * 获取指定函数的版本列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
     * @return AsyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public AsyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasAsyncInvoker(ListQuotasRequest request) {
        return new AsyncInvoker<ListQuotasRequest, ListQuotasResponse>(request, FunctionGraphMeta.listQuotas, hcClient);
    }

    /**
     * 租户函数统计信息
     *
     * 租户函数统计信息。
     * 
     * 返回三类的统计信息，函数格式和大小使用情况包括配额和使用量，流量报告。
     * 通过查询参数filter可以进行过滤，查询参数period可以指定返回的时间段。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 获取指定函数所有版本别名列表。
     *
     * 获取函数版本别名列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListVersionAliasesRequest 请求对象
     * @return CompletableFuture<ListVersionAliasesResponse>
     */
    public CompletableFuture<ListVersionAliasesResponse> listVersionAliasesAsync(ListVersionAliasesRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.listVersionAliases);
    }

    /**
     * 获取指定函数所有版本别名列表。
     *
     * 获取函数版本别名列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 获取指定函数流执行实例列表
     *
     * 获取指定函数流执行实例列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询工作流列表
     *
     * 查询工作流列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListWorkflowsRequest 请求对象
     * @return CompletableFuture<ListWorkflowsResponse>
     */
    public CompletableFuture<ListWorkflowsResponse> listWorkflowsAsync(ListWorkflowsRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.listWorkflows);
    }

    /**
     * 查询工作流列表
     *
     * 查询工作流列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListWorkflowsRequest 请求对象
     * @return AsyncInvoker<ListWorkflowsRequest, ListWorkflowsResponse>
     */
    public AsyncInvoker<ListWorkflowsRequest, ListWorkflowsResponse> listWorkflowsAsyncInvoker(
        ListWorkflowsRequest request) {
        return new AsyncInvoker<ListWorkflowsRequest, ListWorkflowsResponse>(request, FunctionGraphMeta.listWorkflows,
            hcClient);
    }

    /**
     * 重试工作流
     *
     * 重试工作流
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RetryWorkFlowRequest 请求对象
     * @return CompletableFuture<RetryWorkFlowResponse>
     */
    public CompletableFuture<RetryWorkFlowResponse> retryWorkFlowAsync(RetryWorkFlowRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.retryWorkFlow);
    }

    /**
     * 重试工作流
     *
     * 重试工作流
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 获取指定依赖包。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDependencyRequest 请求对象
     * @return CompletableFuture<ShowDependencyResponse>
     */
    public CompletableFuture<ShowDependencyResponse> showDependencyAsync(ShowDependencyRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.showDependency);
    }

    /**
     * 获取指定依赖包
     *
     * 获取指定依赖包。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDependencyRequest 请求对象
     * @return AsyncInvoker<ShowDependencyRequest, ShowDependencyResponse>
     */
    public AsyncInvoker<ShowDependencyRequest, ShowDependencyResponse> showDependencyAsyncInvoker(
        ShowDependencyRequest request) {
        return new AsyncInvoker<ShowDependencyRequest, ShowDependencyResponse>(request,
            FunctionGraphMeta.showDependency, hcClient);
    }

    /**
     * 获取测试事件详细信息
     *
     * 获取测试事件详细信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 获取测试事件详细信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowEventRequest 请求对象
     * @return AsyncInvoker<ShowEventRequest, ShowEventResponse>
     */
    public AsyncInvoker<ShowEventRequest, ShowEventResponse> showEventAsyncInvoker(ShowEventRequest request) {
        return new AsyncInvoker<ShowEventRequest, ShowEventResponse>(request, FunctionGraphMeta.showEvent, hcClient);
    }

    /**
     * 获取函数异步配置信息。
     *
     * 获取函数异步配置信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowFunctionAsyncInvokeConfigRequest 请求对象
     * @return CompletableFuture<ShowFunctionAsyncInvokeConfigResponse>
     */
    public CompletableFuture<ShowFunctionAsyncInvokeConfigResponse> showFunctionAsyncInvokeConfigAsync(
        ShowFunctionAsyncInvokeConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.showFunctionAsyncInvokeConfig);
    }

    /**
     * 获取函数异步配置信息。
     *
     * 获取函数异步配置信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 获取指定函数代码。
     *
     * 获取指定函数的代码。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowFunctionCodeRequest 请求对象
     * @return CompletableFuture<ShowFunctionCodeResponse>
     */
    public CompletableFuture<ShowFunctionCodeResponse> showFunctionCodeAsync(ShowFunctionCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.showFunctionCode);
    }

    /**
     * 获取指定函数代码。
     *
     * 获取指定函数的代码。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 获取函数的metadata。
     *
     * 获取指定函数的metadata。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowFunctionConfigRequest 请求对象
     * @return CompletableFuture<ShowFunctionConfigResponse>
     */
    public CompletableFuture<ShowFunctionConfigResponse> showFunctionConfigAsync(ShowFunctionConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.showFunctionConfig);
    }

    /**
     * 获取函数的metadata。
     *
     * 获取指定函数的metadata。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 获取指定触发器的信息。
     *
     * 获取特定触发器的信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowFunctionTriggerRequest 请求对象
     * @return CompletableFuture<ShowFunctionTriggerResponse>
     */
    public CompletableFuture<ShowFunctionTriggerResponse> showFunctionTriggerAsync(ShowFunctionTriggerRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.showFunctionTrigger);
    }

    /**
     * 获取指定触发器的信息。
     *
     * 获取特定触发器的信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 获取指定函数的lts日志组日志流配置。
     *
     * 获取指定函数的lts日志组日志流配置。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowLtsLogDetailsRequest 请求对象
     * @return CompletableFuture<ShowLtsLogDetailsResponse>
     */
    public CompletableFuture<ShowLtsLogDetailsResponse> showLtsLogDetailsAsync(ShowLtsLogDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.showLtsLogDetails);
    }

    /**
     * 获取指定函数的lts日志组日志流配置。
     *
     * 获取指定函数的lts日志组日志流配置。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 获取函数流指标
     *
     * 获取函数流指标
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowTracingRequest 请求对象
     * @return AsyncInvoker<ShowTracingRequest, ShowTracingResponse>
     */
    public AsyncInvoker<ShowTracingRequest, ShowTracingResponse> showTracingAsyncInvoker(ShowTracingRequest request) {
        return new AsyncInvoker<ShowTracingRequest, ShowTracingResponse>(request, FunctionGraphMeta.showTracing,
            hcClient);
    }

    /**
     * 获取函数版本的指定别名信息。
     *
     * 获取函数指定的版本别名信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowVersionAliasRequest 请求对象
     * @return CompletableFuture<ShowVersionAliasResponse>
     */
    public CompletableFuture<ShowVersionAliasResponse> showVersionAliasAsync(ShowVersionAliasRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.showVersionAlias);
    }

    /**
     * 获取函数版本的指定别名信息。
     *
     * 获取函数指定的版本别名信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 获取指定函数流实例
     *
     * 获取指定函数流实例
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowWorkFlowRequest 请求对象
     * @return CompletableFuture<ShowWorkFlowResponse>
     */
    public CompletableFuture<ShowWorkFlowResponse> showWorkFlowAsync(ShowWorkFlowRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.showWorkFlow);
    }

    /**
     * 获取指定函数流实例
     *
     * 获取指定函数流实例
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 获取指定工作流指标
     *
     * 获取指定工作流指标
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowWorkFlowMetricRequest 请求对象
     * @return CompletableFuture<ShowWorkFlowMetricResponse>
     */
    public CompletableFuture<ShowWorkFlowMetricResponse> showWorkFlowMetricAsync(ShowWorkFlowMetricRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.showWorkFlowMetric);
    }

    /**
     * 获取指定工作流指标
     *
     * 获取指定工作流指标
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 同步执行函数流
     *
     * 同步执行函数流
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 同步执行函数流
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 开始执行函数流
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 开始执行函数流
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 停止工作流
     *
     * 停止工作流
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopWorkFlowRequest 请求对象
     * @return CompletableFuture<StopWorkFlowResponse>
     */
    public CompletableFuture<StopWorkFlowResponse> stopWorkFlowAsync(StopWorkFlowRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.stopWorkFlow);
    }

    /**
     * 停止工作流
     *
     * 停止工作流
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 更新依赖包指定依赖包
     *
     * 更新依赖包指定依赖包。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateDependencyRequest 请求对象
     * @return CompletableFuture<UpdateDependencyResponse>
     */
    public CompletableFuture<UpdateDependencyResponse> updateDependencyAsync(UpdateDependencyRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.updateDependency);
    }

    /**
     * 更新依赖包指定依赖包
     *
     * 更新依赖包指定依赖包。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateDependencyRequest 请求对象
     * @return AsyncInvoker<UpdateDependencyRequest, UpdateDependencyResponse>
     */
    public AsyncInvoker<UpdateDependencyRequest, UpdateDependencyResponse> updateDependencyAsyncInvoker(
        UpdateDependencyRequest request) {
        return new AsyncInvoker<UpdateDependencyRequest, UpdateDependencyResponse>(request,
            FunctionGraphMeta.updateDependency, hcClient);
    }

    /**
     * 更新测试事件
     *
     * 更新测试事件。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateEventRequest 请求对象
     * @return CompletableFuture<UpdateEventResponse>
     */
    public CompletableFuture<UpdateEventResponse> updateEventAsync(UpdateEventRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.updateEvent);
    }

    /**
     * 更新测试事件
     *
     * 更新测试事件。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateEventRequest 请求对象
     * @return AsyncInvoker<UpdateEventRequest, UpdateEventResponse>
     */
    public AsyncInvoker<UpdateEventRequest, UpdateEventResponse> updateEventAsyncInvoker(UpdateEventRequest request) {
        return new AsyncInvoker<UpdateEventRequest, UpdateEventResponse>(request, FunctionGraphMeta.updateEvent,
            hcClient);
    }

    /**
     * 设置函数异步配置信息。
     *
     * 设置函数异步配置信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateFunctionAsyncInvokeConfigRequest 请求对象
     * @return CompletableFuture<UpdateFunctionAsyncInvokeConfigResponse>
     */
    public CompletableFuture<UpdateFunctionAsyncInvokeConfigResponse> updateFunctionAsyncInvokeConfigAsync(
        UpdateFunctionAsyncInvokeConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.updateFunctionAsyncInvokeConfig);
    }

    /**
     * 设置函数异步配置信息。
     *
     * 设置函数异步配置信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 修改函数代码。
     *
     * 修改指定的函数的代码。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateFunctionCodeRequest 请求对象
     * @return CompletableFuture<UpdateFunctionCodeResponse>
     */
    public CompletableFuture<UpdateFunctionCodeResponse> updateFunctionCodeAsync(UpdateFunctionCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.updateFunctionCode);
    }

    /**
     * 修改函数代码。
     *
     * 修改指定的函数的代码。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 修改函数的metadata信息。
     *
     * 修改指定的函数的metadata信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateFunctionConfigRequest 请求对象
     * @return CompletableFuture<UpdateFunctionConfigResponse>
     */
    public CompletableFuture<UpdateFunctionConfigResponse> updateFunctionConfigAsync(
        UpdateFunctionConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.updateFunctionConfig);
    }

    /**
     * 修改函数的metadata信息。
     *
     * 修改指定的函数的metadata信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 更新函数预留实例个数
     *
     * 为函数绑定预留实例
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateFunctionReservedInstancesRequest 请求对象
     * @return CompletableFuture<UpdateFunctionReservedInstancesResponse>
     */
    public CompletableFuture<UpdateFunctionReservedInstancesResponse> updateFunctionReservedInstancesAsync(
        UpdateFunctionReservedInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.updateFunctionReservedInstances);
    }

    /**
     * 更新函数预留实例个数
     *
     * 为函数绑定预留实例
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateFunctionReservedInstancesRequest 请求对象
     * @return AsyncInvoker<UpdateFunctionReservedInstancesRequest, UpdateFunctionReservedInstancesResponse>
     */
    public AsyncInvoker<UpdateFunctionReservedInstancesRequest, UpdateFunctionReservedInstancesResponse> updateFunctionReservedInstancesAsyncInvoker(
        UpdateFunctionReservedInstancesRequest request) {
        return new AsyncInvoker<UpdateFunctionReservedInstancesRequest, UpdateFunctionReservedInstancesResponse>(
            request, FunctionGraphMeta.updateFunctionReservedInstances, hcClient);
    }

    /**
     * 修改函数调用链配置
     *
     * 修改函数调用链配置,开通/修改传入aksk，关闭aksk传空
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 修改函数版本别名信息。
     *
     * 修改函数版本别名信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateVersionAliasRequest 请求对象
     * @return CompletableFuture<UpdateVersionAliasResponse>
     */
    public CompletableFuture<UpdateVersionAliasResponse> updateVersionAliasAsync(UpdateVersionAliasRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.updateVersionAlias);
    }

    /**
     * 修改函数版本别名信息。
     *
     * 修改函数版本别名信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 修改指定函数流实例
     *
     * 修改指定函数流实例
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateWorkFlowRequest 请求对象
     * @return CompletableFuture<UpdateWorkFlowResponse>
     */
    public CompletableFuture<UpdateWorkFlowResponse> updateWorkFlowAsync(UpdateWorkFlowRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.updateWorkFlow);
    }

    /**
     * 修改指定函数流实例
     *
     * 修改指定函数流实例
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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

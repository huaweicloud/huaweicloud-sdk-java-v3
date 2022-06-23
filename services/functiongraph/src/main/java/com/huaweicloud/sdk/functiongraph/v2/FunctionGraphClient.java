package com.huaweicloud.sdk.functiongraph.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.functiongraph.v2.model.*;

public class FunctionGraphClient {

    protected HcClient hcClient;

    public FunctionGraphClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<FunctionGraphClient> newBuilder() {
        return new ClientBuilder<>(FunctionGraphClient::new);
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
     * @return AsyncInvokeFunctionResponse
     */
    public AsyncInvokeFunctionResponse asyncInvokeFunction(AsyncInvokeFunctionRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.asyncInvokeFunction);
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
     * @return SyncInvoker<AsyncInvokeFunctionRequest, AsyncInvokeFunctionResponse>
     */
    public SyncInvoker<AsyncInvokeFunctionRequest, AsyncInvokeFunctionResponse> asyncInvokeFunctionInvoker(
        AsyncInvokeFunctionRequest request) {
        return new SyncInvoker<AsyncInvokeFunctionRequest, AsyncInvokeFunctionResponse>(request,
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
     * @return AsyncInvokeReservedFunctionResponse
     */
    public AsyncInvokeReservedFunctionResponse asyncInvokeReservedFunction(AsyncInvokeReservedFunctionRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.asyncInvokeReservedFunction);
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
     * @return SyncInvoker<AsyncInvokeReservedFunctionRequest, AsyncInvokeReservedFunctionResponse>
     */
    public SyncInvoker<AsyncInvokeReservedFunctionRequest, AsyncInvokeReservedFunctionResponse> asyncInvokeReservedFunctionInvoker(
        AsyncInvokeReservedFunctionRequest request) {
        return new SyncInvoker<AsyncInvokeReservedFunctionRequest, AsyncInvokeReservedFunctionResponse>(request,
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
     * @return BatchDeleteFunctionTriggersResponse
     */
    public BatchDeleteFunctionTriggersResponse batchDeleteFunctionTriggers(BatchDeleteFunctionTriggersRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.batchDeleteFunctionTriggers);
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
     * @return SyncInvoker<BatchDeleteFunctionTriggersRequest, BatchDeleteFunctionTriggersResponse>
     */
    public SyncInvoker<BatchDeleteFunctionTriggersRequest, BatchDeleteFunctionTriggersResponse> batchDeleteFunctionTriggersInvoker(
        BatchDeleteFunctionTriggersRequest request) {
        return new SyncInvoker<BatchDeleteFunctionTriggersRequest, BatchDeleteFunctionTriggersResponse>(request,
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
     * @return BatchDeleteWorkflowsResponse
     */
    public BatchDeleteWorkflowsResponse batchDeleteWorkflows(BatchDeleteWorkflowsRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.batchDeleteWorkflows);
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
     * 停止函数异步调用请求
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 停止函数异步调用请求
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 创建依赖包。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 创建依赖包。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 创建测试事件
     *
     * 创建测试事件。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 创建测试事件。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateEventRequest 请求对象
     * @return SyncInvoker<CreateEventRequest, CreateEventResponse>
     */
    public SyncInvoker<CreateEventRequest, CreateEventResponse> createEventInvoker(CreateEventRequest request) {
        return new SyncInvoker<CreateEventRequest, CreateEventResponse>(request, FunctionGraphMeta.createEvent,
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
     * @return CreateFunctionResponse
     */
    public CreateFunctionResponse createFunction(CreateFunctionRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.createFunction);
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
     * @return SyncInvoker<CreateFunctionRequest, CreateFunctionResponse>
     */
    public SyncInvoker<CreateFunctionRequest, CreateFunctionResponse> createFunctionInvoker(
        CreateFunctionRequest request) {
        return new SyncInvoker<CreateFunctionRequest, CreateFunctionResponse>(request, FunctionGraphMeta.createFunction,
            hcClient);
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
     * @return CreateFunctionTriggerResponse
     */
    public CreateFunctionTriggerResponse createFunctionTrigger(CreateFunctionTriggerRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.createFunctionTrigger);
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
     * @return SyncInvoker<CreateFunctionTriggerRequest, CreateFunctionTriggerResponse>
     */
    public SyncInvoker<CreateFunctionTriggerRequest, CreateFunctionTriggerResponse> createFunctionTriggerInvoker(
        CreateFunctionTriggerRequest request) {
        return new SyncInvoker<CreateFunctionTriggerRequest, CreateFunctionTriggerResponse>(request,
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
     * @return CreateFunctionVersionResponse
     */
    public CreateFunctionVersionResponse createFunctionVersion(CreateFunctionVersionRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.createFunctionVersion);
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
     * @return SyncInvoker<CreateFunctionVersionRequest, CreateFunctionVersionResponse>
     */
    public SyncInvoker<CreateFunctionVersionRequest, CreateFunctionVersionResponse> createFunctionVersionInvoker(
        CreateFunctionVersionRequest request) {
        return new SyncInvoker<CreateFunctionVersionRequest, CreateFunctionVersionResponse>(request,
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
     * @return CreateVersionAliasResponse
     */
    public CreateVersionAliasResponse createVersionAlias(CreateVersionAliasRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.createVersionAlias);
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
     * @return SyncInvoker<CreateVersionAliasRequest, CreateVersionAliasResponse>
     */
    public SyncInvoker<CreateVersionAliasRequest, CreateVersionAliasResponse> createVersionAliasInvoker(
        CreateVersionAliasRequest request) {
        return new SyncInvoker<CreateVersionAliasRequest, CreateVersionAliasResponse>(request,
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
     * @return CreateWorkflowResponse
     */
    public CreateWorkflowResponse createWorkflow(CreateWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.createWorkflow);
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
     * @return SyncInvoker<CreateWorkflowRequest, CreateWorkflowResponse>
     */
    public SyncInvoker<CreateWorkflowRequest, CreateWorkflowResponse> createWorkflowInvoker(
        CreateWorkflowRequest request) {
        return new SyncInvoker<CreateWorkflowRequest, CreateWorkflowResponse>(request, FunctionGraphMeta.createWorkflow,
            hcClient);
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
     * @return DeleteDependencyResponse
     */
    public DeleteDependencyResponse deleteDependency(DeleteDependencyRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.deleteDependency);
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
     * @return SyncInvoker<DeleteDependencyRequest, DeleteDependencyResponse>
     */
    public SyncInvoker<DeleteDependencyRequest, DeleteDependencyResponse> deleteDependencyInvoker(
        DeleteDependencyRequest request) {
        return new SyncInvoker<DeleteDependencyRequest, DeleteDependencyResponse>(request,
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
     * @return DeleteEventResponse
     */
    public DeleteEventResponse deleteEvent(DeleteEventRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.deleteEvent);
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
     * @return SyncInvoker<DeleteEventRequest, DeleteEventResponse>
     */
    public SyncInvoker<DeleteEventRequest, DeleteEventResponse> deleteEventInvoker(DeleteEventRequest request) {
        return new SyncInvoker<DeleteEventRequest, DeleteEventResponse>(request, FunctionGraphMeta.deleteEvent,
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
     * @return DeleteFunctionResponse
     */
    public DeleteFunctionResponse deleteFunction(DeleteFunctionRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.deleteFunction);
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
     * @return SyncInvoker<DeleteFunctionRequest, DeleteFunctionResponse>
     */
    public SyncInvoker<DeleteFunctionRequest, DeleteFunctionResponse> deleteFunctionInvoker(
        DeleteFunctionRequest request) {
        return new SyncInvoker<DeleteFunctionRequest, DeleteFunctionResponse>(request, FunctionGraphMeta.deleteFunction,
            hcClient);
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
     * @return DeleteFunctionAsyncInvokeConfigResponse
     */
    public DeleteFunctionAsyncInvokeConfigResponse deleteFunctionAsyncInvokeConfig(
        DeleteFunctionAsyncInvokeConfigRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.deleteFunctionAsyncInvokeConfig);
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
     * @return SyncInvoker<DeleteFunctionAsyncInvokeConfigRequest, DeleteFunctionAsyncInvokeConfigResponse>
     */
    public SyncInvoker<DeleteFunctionAsyncInvokeConfigRequest, DeleteFunctionAsyncInvokeConfigResponse> deleteFunctionAsyncInvokeConfigInvoker(
        DeleteFunctionAsyncInvokeConfigRequest request) {
        return new SyncInvoker<DeleteFunctionAsyncInvokeConfigRequest, DeleteFunctionAsyncInvokeConfigResponse>(request,
            FunctionGraphMeta.deleteFunctionAsyncInvokeConfig, hcClient);
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
     * @return DeleteFunctionTriggerResponse
     */
    public DeleteFunctionTriggerResponse deleteFunctionTrigger(DeleteFunctionTriggerRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.deleteFunctionTrigger);
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
     * @return SyncInvoker<DeleteFunctionTriggerRequest, DeleteFunctionTriggerResponse>
     */
    public SyncInvoker<DeleteFunctionTriggerRequest, DeleteFunctionTriggerResponse> deleteFunctionTriggerInvoker(
        DeleteFunctionTriggerRequest request) {
        return new SyncInvoker<DeleteFunctionTriggerRequest, DeleteFunctionTriggerResponse>(request,
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
     * @return DeleteVersionAliasResponse
     */
    public DeleteVersionAliasResponse deleteVersionAlias(DeleteVersionAliasRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.deleteVersionAlias);
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
     * @return SyncInvoker<DeleteVersionAliasRequest, DeleteVersionAliasResponse>
     */
    public SyncInvoker<DeleteVersionAliasRequest, DeleteVersionAliasResponse> deleteVersionAliasInvoker(
        DeleteVersionAliasRequest request) {
        return new SyncInvoker<DeleteVersionAliasRequest, DeleteVersionAliasResponse>(request,
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
     * @return EnableLtsLogsResponse
     */
    public EnableLtsLogsResponse enableLtsLogs(EnableLtsLogsRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.enableLtsLogs);
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
     * @return SyncInvoker<EnableLtsLogsRequest, EnableLtsLogsResponse>
     */
    public SyncInvoker<EnableLtsLogsRequest, EnableLtsLogsResponse> enableLtsLogsInvoker(EnableLtsLogsRequest request) {
        return new SyncInvoker<EnableLtsLogsRequest, EnableLtsLogsResponse>(request, FunctionGraphMeta.enableLtsLogs,
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
     * @return ExportFunctionResponse
     */
    public ExportFunctionResponse exportFunction(ExportFunctionRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.exportFunction);
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
     * @return SyncInvoker<ExportFunctionRequest, ExportFunctionResponse>
     */
    public SyncInvoker<ExportFunctionRequest, ExportFunctionResponse> exportFunctionInvoker(
        ExportFunctionRequest request) {
        return new SyncInvoker<ExportFunctionRequest, ExportFunctionResponse>(request, FunctionGraphMeta.exportFunction,
            hcClient);
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
     * @return ImportFunctionResponse
     */
    public ImportFunctionResponse importFunction(ImportFunctionRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.importFunction);
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
     * @return SyncInvoker<ImportFunctionRequest, ImportFunctionResponse>
     */
    public SyncInvoker<ImportFunctionRequest, ImportFunctionResponse> importFunctionInvoker(
        ImportFunctionRequest request) {
        return new SyncInvoker<ImportFunctionRequest, ImportFunctionResponse>(request, FunctionGraphMeta.importFunction,
            hcClient);
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
     * @return InvokeFunctionResponse
     */
    public InvokeFunctionResponse invokeFunction(InvokeFunctionRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.invokeFunction);
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
     * @return SyncInvoker<InvokeFunctionRequest, InvokeFunctionResponse>
     */
    public SyncInvoker<InvokeFunctionRequest, InvokeFunctionResponse> invokeFunctionInvoker(
        InvokeFunctionRequest request) {
        return new SyncInvoker<InvokeFunctionRequest, InvokeFunctionResponse>(request, FunctionGraphMeta.invokeFunction,
            hcClient);
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
     * @return ListDependenciesResponse
     */
    public ListDependenciesResponse listDependencies(ListDependenciesRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listDependencies);
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
     * @return SyncInvoker<ListDependenciesRequest, ListDependenciesResponse>
     */
    public SyncInvoker<ListDependenciesRequest, ListDependenciesResponse> listDependenciesInvoker(
        ListDependenciesRequest request) {
        return new SyncInvoker<ListDependenciesRequest, ListDependenciesResponse>(request,
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
     * @return ListEventsResponse
     */
    public ListEventsResponse listEvents(ListEventsRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listEvents);
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
     * @return SyncInvoker<ListEventsRequest, ListEventsResponse>
     */
    public SyncInvoker<ListEventsRequest, ListEventsResponse> listEventsInvoker(ListEventsRequest request) {
        return new SyncInvoker<ListEventsRequest, ListEventsResponse>(request, FunctionGraphMeta.listEvents, hcClient);
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
     * @return ListFunctionAsyncInvocationsResponse
     */
    public ListFunctionAsyncInvocationsResponse listFunctionAsyncInvocations(
        ListFunctionAsyncInvocationsRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listFunctionAsyncInvocations);
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
     * @return SyncInvoker<ListFunctionAsyncInvocationsRequest, ListFunctionAsyncInvocationsResponse>
     */
    public SyncInvoker<ListFunctionAsyncInvocationsRequest, ListFunctionAsyncInvocationsResponse> listFunctionAsyncInvocationsInvoker(
        ListFunctionAsyncInvocationsRequest request) {
        return new SyncInvoker<ListFunctionAsyncInvocationsRequest, ListFunctionAsyncInvocationsResponse>(request,
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
     * @return ListFunctionAsyncInvokeConfigResponse
     */
    public ListFunctionAsyncInvokeConfigResponse listFunctionAsyncInvokeConfig(
        ListFunctionAsyncInvokeConfigRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listFunctionAsyncInvokeConfig);
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
     * @return SyncInvoker<ListFunctionAsyncInvokeConfigRequest, ListFunctionAsyncInvokeConfigResponse>
     */
    public SyncInvoker<ListFunctionAsyncInvokeConfigRequest, ListFunctionAsyncInvokeConfigResponse> listFunctionAsyncInvokeConfigInvoker(
        ListFunctionAsyncInvokeConfigRequest request) {
        return new SyncInvoker<ListFunctionAsyncInvokeConfigRequest, ListFunctionAsyncInvokeConfigResponse>(request,
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 获取指定函数的所有触发器。
     *
     * 获取指定函数的所有触发器设置。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListFunctionTriggersRequest 请求对象
     * @return ListFunctionTriggersResponse
     */
    public ListFunctionTriggersResponse listFunctionTriggers(ListFunctionTriggersRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listFunctionTriggers);
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
     * @return SyncInvoker<ListFunctionTriggersRequest, ListFunctionTriggersResponse>
     */
    public SyncInvoker<ListFunctionTriggersRequest, ListFunctionTriggersResponse> listFunctionTriggersInvoker(
        ListFunctionTriggersRequest request) {
        return new SyncInvoker<ListFunctionTriggersRequest, ListFunctionTriggersResponse>(request,
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
     * @return ListFunctionVersionsResponse
     */
    public ListFunctionVersionsResponse listFunctionVersions(ListFunctionVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listFunctionVersions);
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
     * @return SyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public SyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasInvoker(ListQuotasRequest request) {
        return new SyncInvoker<ListQuotasRequest, ListQuotasResponse>(request, FunctionGraphMeta.listQuotas, hcClient);
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 获取指定函数所有版本别名列表。
     *
     * 获取函数版本别名列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListVersionAliasesRequest 请求对象
     * @return ListVersionAliasesResponse
     */
    public ListVersionAliasesResponse listVersionAliases(ListVersionAliasesRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listVersionAliases);
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
     * @return SyncInvoker<ListVersionAliasesRequest, ListVersionAliasesResponse>
     */
    public SyncInvoker<ListVersionAliasesRequest, ListVersionAliasesResponse> listVersionAliasesInvoker(
        ListVersionAliasesRequest request) {
        return new SyncInvoker<ListVersionAliasesRequest, ListVersionAliasesResponse>(request,
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询工作流列表
     *
     * 查询工作流列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListWorkflowsRequest 请求对象
     * @return ListWorkflowsResponse
     */
    public ListWorkflowsResponse listWorkflows(ListWorkflowsRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listWorkflows);
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
     * @return SyncInvoker<ListWorkflowsRequest, ListWorkflowsResponse>
     */
    public SyncInvoker<ListWorkflowsRequest, ListWorkflowsResponse> listWorkflowsInvoker(ListWorkflowsRequest request) {
        return new SyncInvoker<ListWorkflowsRequest, ListWorkflowsResponse>(request, FunctionGraphMeta.listWorkflows,
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
     * @return RetryWorkFlowResponse
     */
    public RetryWorkFlowResponse retryWorkFlow(RetryWorkFlowRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.retryWorkFlow);
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
     * @return SyncInvoker<RetryWorkFlowRequest, RetryWorkFlowResponse>
     */
    public SyncInvoker<RetryWorkFlowRequest, RetryWorkFlowResponse> retryWorkFlowInvoker(RetryWorkFlowRequest request) {
        return new SyncInvoker<RetryWorkFlowRequest, RetryWorkFlowResponse>(request, FunctionGraphMeta.retryWorkFlow,
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
     * @return ShowDependencyResponse
     */
    public ShowDependencyResponse showDependency(ShowDependencyRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.showDependency);
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
     * @return SyncInvoker<ShowDependencyRequest, ShowDependencyResponse>
     */
    public SyncInvoker<ShowDependencyRequest, ShowDependencyResponse> showDependencyInvoker(
        ShowDependencyRequest request) {
        return new SyncInvoker<ShowDependencyRequest, ShowDependencyResponse>(request, FunctionGraphMeta.showDependency,
            hcClient);
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
     * @return ShowEventResponse
     */
    public ShowEventResponse showEvent(ShowEventRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.showEvent);
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
     * @return SyncInvoker<ShowEventRequest, ShowEventResponse>
     */
    public SyncInvoker<ShowEventRequest, ShowEventResponse> showEventInvoker(ShowEventRequest request) {
        return new SyncInvoker<ShowEventRequest, ShowEventResponse>(request, FunctionGraphMeta.showEvent, hcClient);
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
     * @return ShowFunctionAsyncInvokeConfigResponse
     */
    public ShowFunctionAsyncInvokeConfigResponse showFunctionAsyncInvokeConfig(
        ShowFunctionAsyncInvokeConfigRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.showFunctionAsyncInvokeConfig);
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
     * @return SyncInvoker<ShowFunctionAsyncInvokeConfigRequest, ShowFunctionAsyncInvokeConfigResponse>
     */
    public SyncInvoker<ShowFunctionAsyncInvokeConfigRequest, ShowFunctionAsyncInvokeConfigResponse> showFunctionAsyncInvokeConfigInvoker(
        ShowFunctionAsyncInvokeConfigRequest request) {
        return new SyncInvoker<ShowFunctionAsyncInvokeConfigRequest, ShowFunctionAsyncInvokeConfigResponse>(request,
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
     * @return ShowFunctionCodeResponse
     */
    public ShowFunctionCodeResponse showFunctionCode(ShowFunctionCodeRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.showFunctionCode);
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
     * @return SyncInvoker<ShowFunctionCodeRequest, ShowFunctionCodeResponse>
     */
    public SyncInvoker<ShowFunctionCodeRequest, ShowFunctionCodeResponse> showFunctionCodeInvoker(
        ShowFunctionCodeRequest request) {
        return new SyncInvoker<ShowFunctionCodeRequest, ShowFunctionCodeResponse>(request,
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
     * @return ShowFunctionConfigResponse
     */
    public ShowFunctionConfigResponse showFunctionConfig(ShowFunctionConfigRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.showFunctionConfig);
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
     * @return SyncInvoker<ShowFunctionConfigRequest, ShowFunctionConfigResponse>
     */
    public SyncInvoker<ShowFunctionConfigRequest, ShowFunctionConfigResponse> showFunctionConfigInvoker(
        ShowFunctionConfigRequest request) {
        return new SyncInvoker<ShowFunctionConfigRequest, ShowFunctionConfigResponse>(request,
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
     * @return ShowFunctionTriggerResponse
     */
    public ShowFunctionTriggerResponse showFunctionTrigger(ShowFunctionTriggerRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.showFunctionTrigger);
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
     * @return SyncInvoker<ShowFunctionTriggerRequest, ShowFunctionTriggerResponse>
     */
    public SyncInvoker<ShowFunctionTriggerRequest, ShowFunctionTriggerResponse> showFunctionTriggerInvoker(
        ShowFunctionTriggerRequest request) {
        return new SyncInvoker<ShowFunctionTriggerRequest, ShowFunctionTriggerResponse>(request,
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
     * @return ShowLtsLogDetailsResponse
     */
    public ShowLtsLogDetailsResponse showLtsLogDetails(ShowLtsLogDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.showLtsLogDetails);
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
     * @return SyncInvoker<ShowLtsLogDetailsRequest, ShowLtsLogDetailsResponse>
     */
    public SyncInvoker<ShowLtsLogDetailsRequest, ShowLtsLogDetailsResponse> showLtsLogDetailsInvoker(
        ShowLtsLogDetailsRequest request) {
        return new SyncInvoker<ShowLtsLogDetailsRequest, ShowLtsLogDetailsResponse>(request,
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowTracingRequest 请求对象
     * @return SyncInvoker<ShowTracingRequest, ShowTracingResponse>
     */
    public SyncInvoker<ShowTracingRequest, ShowTracingResponse> showTracingInvoker(ShowTracingRequest request) {
        return new SyncInvoker<ShowTracingRequest, ShowTracingResponse>(request, FunctionGraphMeta.showTracing,
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
     * @return ShowVersionAliasResponse
     */
    public ShowVersionAliasResponse showVersionAlias(ShowVersionAliasRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.showVersionAlias);
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
     * @return SyncInvoker<ShowVersionAliasRequest, ShowVersionAliasResponse>
     */
    public SyncInvoker<ShowVersionAliasRequest, ShowVersionAliasResponse> showVersionAliasInvoker(
        ShowVersionAliasRequest request) {
        return new SyncInvoker<ShowVersionAliasRequest, ShowVersionAliasResponse>(request,
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
     * @return ShowWorkFlowResponse
     */
    public ShowWorkFlowResponse showWorkFlow(ShowWorkFlowRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.showWorkFlow);
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
     * @return SyncInvoker<ShowWorkFlowRequest, ShowWorkFlowResponse>
     */
    public SyncInvoker<ShowWorkFlowRequest, ShowWorkFlowResponse> showWorkFlowInvoker(ShowWorkFlowRequest request) {
        return new SyncInvoker<ShowWorkFlowRequest, ShowWorkFlowResponse>(request, FunctionGraphMeta.showWorkFlow,
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
     * @return ShowWorkFlowMetricResponse
     */
    public ShowWorkFlowMetricResponse showWorkFlowMetric(ShowWorkFlowMetricRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.showWorkFlowMetric);
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 同步执行函数流
     *
     * 同步执行函数流
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 同步执行函数流
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 开始执行函数流
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 开始执行函数流
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 停止工作流
     *
     * 停止工作流
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopWorkFlowRequest 请求对象
     * @return StopWorkFlowResponse
     */
    public StopWorkFlowResponse stopWorkFlow(StopWorkFlowRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.stopWorkFlow);
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
     * @return SyncInvoker<StopWorkFlowRequest, StopWorkFlowResponse>
     */
    public SyncInvoker<StopWorkFlowRequest, StopWorkFlowResponse> stopWorkFlowInvoker(StopWorkFlowRequest request) {
        return new SyncInvoker<StopWorkFlowRequest, StopWorkFlowResponse>(request, FunctionGraphMeta.stopWorkFlow,
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
     * @return UpdateDependencyResponse
     */
    public UpdateDependencyResponse updateDependency(UpdateDependencyRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.updateDependency);
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
     * @return SyncInvoker<UpdateDependencyRequest, UpdateDependencyResponse>
     */
    public SyncInvoker<UpdateDependencyRequest, UpdateDependencyResponse> updateDependencyInvoker(
        UpdateDependencyRequest request) {
        return new SyncInvoker<UpdateDependencyRequest, UpdateDependencyResponse>(request,
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
     * @return UpdateEventResponse
     */
    public UpdateEventResponse updateEvent(UpdateEventRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.updateEvent);
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
     * @return SyncInvoker<UpdateEventRequest, UpdateEventResponse>
     */
    public SyncInvoker<UpdateEventRequest, UpdateEventResponse> updateEventInvoker(UpdateEventRequest request) {
        return new SyncInvoker<UpdateEventRequest, UpdateEventResponse>(request, FunctionGraphMeta.updateEvent,
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
     * @return UpdateFunctionAsyncInvokeConfigResponse
     */
    public UpdateFunctionAsyncInvokeConfigResponse updateFunctionAsyncInvokeConfig(
        UpdateFunctionAsyncInvokeConfigRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.updateFunctionAsyncInvokeConfig);
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
     * @return SyncInvoker<UpdateFunctionAsyncInvokeConfigRequest, UpdateFunctionAsyncInvokeConfigResponse>
     */
    public SyncInvoker<UpdateFunctionAsyncInvokeConfigRequest, UpdateFunctionAsyncInvokeConfigResponse> updateFunctionAsyncInvokeConfigInvoker(
        UpdateFunctionAsyncInvokeConfigRequest request) {
        return new SyncInvoker<UpdateFunctionAsyncInvokeConfigRequest, UpdateFunctionAsyncInvokeConfigResponse>(request,
            FunctionGraphMeta.updateFunctionAsyncInvokeConfig, hcClient);
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
     * @return UpdateFunctionCodeResponse
     */
    public UpdateFunctionCodeResponse updateFunctionCode(UpdateFunctionCodeRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.updateFunctionCode);
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
     * @return SyncInvoker<UpdateFunctionCodeRequest, UpdateFunctionCodeResponse>
     */
    public SyncInvoker<UpdateFunctionCodeRequest, UpdateFunctionCodeResponse> updateFunctionCodeInvoker(
        UpdateFunctionCodeRequest request) {
        return new SyncInvoker<UpdateFunctionCodeRequest, UpdateFunctionCodeResponse>(request,
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
     * @return UpdateFunctionConfigResponse
     */
    public UpdateFunctionConfigResponse updateFunctionConfig(UpdateFunctionConfigRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.updateFunctionConfig);
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
     * @return SyncInvoker<UpdateFunctionConfigRequest, UpdateFunctionConfigResponse>
     */
    public SyncInvoker<UpdateFunctionConfigRequest, UpdateFunctionConfigResponse> updateFunctionConfigInvoker(
        UpdateFunctionConfigRequest request) {
        return new SyncInvoker<UpdateFunctionConfigRequest, UpdateFunctionConfigResponse>(request,
            FunctionGraphMeta.updateFunctionConfig, hcClient);
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
     * @return UpdateFunctionReservedInstancesResponse
     */
    public UpdateFunctionReservedInstancesResponse updateFunctionReservedInstances(
        UpdateFunctionReservedInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.updateFunctionReservedInstances);
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
     * @return SyncInvoker<UpdateFunctionReservedInstancesRequest, UpdateFunctionReservedInstancesResponse>
     */
    public SyncInvoker<UpdateFunctionReservedInstancesRequest, UpdateFunctionReservedInstancesResponse> updateFunctionReservedInstancesInvoker(
        UpdateFunctionReservedInstancesRequest request) {
        return new SyncInvoker<UpdateFunctionReservedInstancesRequest, UpdateFunctionReservedInstancesResponse>(request,
            FunctionGraphMeta.updateFunctionReservedInstances, hcClient);
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateTriggerRequest 请求对象
     * @return SyncInvoker<UpdateTriggerRequest, UpdateTriggerResponse>
     */
    public SyncInvoker<UpdateTriggerRequest, UpdateTriggerResponse> updateTriggerInvoker(UpdateTriggerRequest request) {
        return new SyncInvoker<UpdateTriggerRequest, UpdateTriggerResponse>(request, FunctionGraphMeta.updateTrigger,
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
     * @return UpdateVersionAliasResponse
     */
    public UpdateVersionAliasResponse updateVersionAlias(UpdateVersionAliasRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.updateVersionAlias);
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
     * @return SyncInvoker<UpdateVersionAliasRequest, UpdateVersionAliasResponse>
     */
    public SyncInvoker<UpdateVersionAliasRequest, UpdateVersionAliasResponse> updateVersionAliasInvoker(
        UpdateVersionAliasRequest request) {
        return new SyncInvoker<UpdateVersionAliasRequest, UpdateVersionAliasResponse>(request,
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
     * @return UpdateWorkFlowResponse
     */
    public UpdateWorkFlowResponse updateWorkFlow(UpdateWorkFlowRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.updateWorkFlow);
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
     * @return SyncInvoker<UpdateWorkFlowRequest, UpdateWorkFlowResponse>
     */
    public SyncInvoker<UpdateWorkFlowRequest, UpdateWorkFlowResponse> updateWorkFlowInvoker(
        UpdateWorkFlowRequest request) {
        return new SyncInvoker<UpdateWorkFlowRequest, UpdateWorkFlowResponse>(request, FunctionGraphMeta.updateWorkFlow,
            hcClient);
    }

}

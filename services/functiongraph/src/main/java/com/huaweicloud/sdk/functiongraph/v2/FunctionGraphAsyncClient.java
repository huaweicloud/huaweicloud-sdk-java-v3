package com.huaweicloud.sdk.functiongraph.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.functiongraph.v2.model.*;

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
     * 异步执行函数。
     *
     * @param AsyncInvokeFunctionRequest 请求对象
     * @return CompletableFuture<AsyncInvokeFunctionResponse>
     */
    public CompletableFuture<AsyncInvokeFunctionResponse> asyncInvokeFunctionAsync(AsyncInvokeFunctionRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.asyncInvokeFunction);
    }

    /**
     * 创建依赖包
     * 创建依赖包。
     *
     * @param CreateDependencyRequest 请求对象
     * @return CompletableFuture<CreateDependencyResponse>
     */
    public CompletableFuture<CreateDependencyResponse> createDependencyAsync(CreateDependencyRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.createDependency);
    }

    /**
     * 创建测试事件
     * 创建测试事件。
     *
     * @param CreateEventRequest 请求对象
     * @return CompletableFuture<CreateEventResponse>
     */
    public CompletableFuture<CreateEventResponse> createEventAsync(CreateEventRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.createEvent);
    }

    /**
     * 创建函数。
     * 创建指定的函数。
     *
     * @param CreateFunctionRequest 请求对象
     * @return CompletableFuture<CreateFunctionResponse>
     */
    public CompletableFuture<CreateFunctionResponse> createFunctionAsync(CreateFunctionRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.createFunction);
    }

    /**
     * 发布函数版本。
     * 发布函数版本。
     *
     * @param CreateFunctionVersionRequest 请求对象
     * @return CompletableFuture<CreateFunctionVersionResponse>
     */
    public CompletableFuture<CreateFunctionVersionResponse> createFunctionVersionAsync(CreateFunctionVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.createFunctionVersion);
    }

    /**
     * 创建函数版本别名。
     * 创建函数灰度版本别名。
     *
     * @param CreateVersionAliasRequest 请求对象
     * @return CompletableFuture<CreateVersionAliasResponse>
     */
    public CompletableFuture<CreateVersionAliasResponse> createVersionAliasAsync(CreateVersionAliasRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.createVersionAlias);
    }

    /**
     * 删除依赖包
     * 删除指定的依赖包。
     *
     * @param DeleteDependencyRequest 请求对象
     * @return CompletableFuture<DeleteDependencyResponse>
     */
    public CompletableFuture<DeleteDependencyResponse> deleteDependencyAsync(DeleteDependencyRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.deleteDependency);
    }

    /**
     * 删除测试事件
     * 删除测试事件。
     *
     * @param DeleteEventRequest 请求对象
     * @return CompletableFuture<DeleteEventResponse>
     */
    public CompletableFuture<DeleteEventResponse> deleteEventAsync(DeleteEventRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.deleteEvent);
    }

    /**
     * 删除函数/版本。
     * 删除指定的函数或者特定的版本（不允许删除latest版本）。  如果URN中包含函数版本或者别名，则删除特定的函数版本或者别名指向的版本以及该版本关联的trigger。 如果URN中不包含版本或者别名，则删除整个函数，包含所有版本以及别名，触发器。
     *
     * @param DeleteFunctionRequest 请求对象
     * @return CompletableFuture<DeleteFunctionResponse>
     */
    public CompletableFuture<DeleteFunctionResponse> deleteFunctionAsync(DeleteFunctionRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.deleteFunction);
    }

    /**
     * 删除函数版本别名。
     * 删除函数版本别名。
     *
     * @param DeleteVersionAliasRequest 请求对象
     * @return CompletableFuture<DeleteVersionAliasResponse>
     */
    public CompletableFuture<DeleteVersionAliasResponse> deleteVersionAliasAsync(DeleteVersionAliasRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.deleteVersionAlias);
    }

    /**
     * 同步执行函数。
     * 同步调用指的是客户端请求需要明确等到响应结果，也就是说这样的请求必须得调用到用户的函数，并且等到调用完成才返回。
     *
     * @param InvokeFunctionRequest 请求对象
     * @return CompletableFuture<InvokeFunctionResponse>
     */
    public CompletableFuture<InvokeFunctionResponse> invokeFunctionAsync(InvokeFunctionRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.invokeFunction);
    }

    /**
     * 获取依赖包列表
     * 获取依赖包列表。
     *
     * @param ListDependenciesRequest 请求对象
     * @return CompletableFuture<ListDependenciesResponse>
     */
    public CompletableFuture<ListDependenciesResponse> listDependenciesAsync(ListDependenciesRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.listDependencies);
    }

    /**
     * 获取测试事件列表
     * 获取指定函数的测试事件列表。
     *
     * @param ListEventsRequest 请求对象
     * @return CompletableFuture<ListEventsResponse>
     */
    public CompletableFuture<ListEventsResponse> listEventsAsync(ListEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.listEvents);
    }

    /**
     * 获取指定时间段的函数运行指标
     * 获取指定时间段的函数运行指标。
     *
     * @param ListFunctionStatisticsRequest 请求对象
     * @return CompletableFuture<ListFunctionStatisticsResponse>
     */
    public CompletableFuture<ListFunctionStatisticsResponse> listFunctionStatisticsAsync(ListFunctionStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.listFunctionStatistics);
    }

    /**
     * 获取指定函数的版本列表。
     * 获取指定函数的版本列表。
     *
     * @param ListFunctionVersionsRequest 请求对象
     * @return CompletableFuture<ListFunctionVersionsResponse>
     */
    public CompletableFuture<ListFunctionVersionsResponse> listFunctionVersionsAsync(ListFunctionVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.listFunctionVersions);
    }

    /**
     * 获取函数列表
     * 获取函数列表
     *
     * @param ListFunctionsRequest 请求对象
     * @return CompletableFuture<ListFunctionsResponse>
     */
    public CompletableFuture<ListFunctionsResponse> listFunctionsAsync(ListFunctionsRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.listFunctions);
    }

    /**
     * 查询租户配额
     * 查询租户配额
     *
     * @param ListQuotasRequest 请求对象
     * @return CompletableFuture<ListQuotasResponse>
     */
    public CompletableFuture<ListQuotasResponse> listQuotasAsync(ListQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.listQuotas);
    }

    /**
     * 租户函数统计信息
     * 租户函数统计信息。  返回三类的统计信息，函数格式和大小使用情况包括配额和使用量，流量报告。 通过查询参数filter可以进行过滤，查询参数period可以指定返回的时间段。
     *
     * @param ListStatisticsRequest 请求对象
     * @return CompletableFuture<ListStatisticsResponse>
     */
    public CompletableFuture<ListStatisticsResponse> listStatisticsAsync(ListStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.listStatistics);
    }

    /**
     * 获取指定函数所有版本别名列表。
     * 获取函数版本别名列表。
     *
     * @param ListVersionAliasesRequest 请求对象
     * @return CompletableFuture<ListVersionAliasesResponse>
     */
    public CompletableFuture<ListVersionAliasesResponse> listVersionAliasesAsync(ListVersionAliasesRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.listVersionAliases);
    }

    /**
     * 获取指定依赖包
     * 获取指定依赖包。
     *
     * @param ShowDependencyRequest 请求对象
     * @return CompletableFuture<ShowDependencyResponse>
     */
    public CompletableFuture<ShowDependencyResponse> showDependencyAsync(ShowDependencyRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.showDependency);
    }

    /**
     * 获取测试事件详细信息
     * 获取测试事件详细信息。
     *
     * @param ShowEventRequest 请求对象
     * @return CompletableFuture<ShowEventResponse>
     */
    public CompletableFuture<ShowEventResponse> showEventAsync(ShowEventRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.showEvent);
    }

    /**
     * 获取指定函数代码。
     * 获取指定函数的代码。
     *
     * @param ShowFunctionCodeRequest 请求对象
     * @return CompletableFuture<ShowFunctionCodeResponse>
     */
    public CompletableFuture<ShowFunctionCodeResponse> showFunctionCodeAsync(ShowFunctionCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.showFunctionCode);
    }

    /**
     * 获取函数的metadata。
     * 获取指定函数的metadata。
     *
     * @param ShowFunctionConfigRequest 请求对象
     * @return CompletableFuture<ShowFunctionConfigResponse>
     */
    public CompletableFuture<ShowFunctionConfigResponse> showFunctionConfigAsync(ShowFunctionConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.showFunctionConfig);
    }

    /**
     * 获取函数版本的指定别名信息。
     * 获取函数指定的版本别名信息。
     *
     * @param ShowVersionAliasRequest 请求对象
     * @return CompletableFuture<ShowVersionAliasResponse>
     */
    public CompletableFuture<ShowVersionAliasResponse> showVersionAliasAsync(ShowVersionAliasRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.showVersionAlias);
    }

    /**
     * 更新依赖包指定依赖包
     * 更新依赖包指定依赖包。
     *
     * @param UpdateDependencyRequest 请求对象
     * @return CompletableFuture<UpdateDependencyResponse>
     */
    public CompletableFuture<UpdateDependencyResponse> updateDependencyAsync(UpdateDependencyRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.updateDependency);
    }

    /**
     * 更新测试事件
     * 更新测试事件。
     *
     * @param UpdateEventRequest 请求对象
     * @return CompletableFuture<UpdateEventResponse>
     */
    public CompletableFuture<UpdateEventResponse> updateEventAsync(UpdateEventRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.updateEvent);
    }

    /**
     * 修改函数代码。
     * 修改指定的函数的代码。
     *
     * @param UpdateFunctionCodeRequest 请求对象
     * @return CompletableFuture<UpdateFunctionCodeResponse>
     */
    public CompletableFuture<UpdateFunctionCodeResponse> updateFunctionCodeAsync(UpdateFunctionCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.updateFunctionCode);
    }

    /**
     * 修改函数的metadata信息。
     * 修改指定的函数的metadata信息。
     *
     * @param UpdateFunctionConfigRequest 请求对象
     * @return CompletableFuture<UpdateFunctionConfigResponse>
     */
    public CompletableFuture<UpdateFunctionConfigResponse> updateFunctionConfigAsync(UpdateFunctionConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.updateFunctionConfig);
    }

    /**
     * 更新函数预留实例个数
     * 为函数绑定预留实例
     *
     * @param UpdateFunctionReservedInstancesRequest 请求对象
     * @return CompletableFuture<UpdateFunctionReservedInstancesResponse>
     */
    public CompletableFuture<UpdateFunctionReservedInstancesResponse> updateFunctionReservedInstancesAsync(UpdateFunctionReservedInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.updateFunctionReservedInstances);
    }

    /**
     * 修改函数版本别名信息。
     * 修改函数版本别名信息。
     *
     * @param UpdateVersionAliasRequest 请求对象
     * @return CompletableFuture<UpdateVersionAliasResponse>
     */
    public CompletableFuture<UpdateVersionAliasResponse> updateVersionAliasAsync(UpdateVersionAliasRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.updateVersionAlias);
    }

    /**
     * 删除指定函数的所有触发器。
     * 删除指定函数所有触发器设置。  在提供函数版本且非latest的情况下，删除对应函数版本的触发器。 在提供函数别名的情况下，删除对应函数别名的触发器。 在不提供函数版本（也不提供别名）或版本为latest的情况下，删除该函数所有的触发器（包括所有版本和别名）。
     *
     * @param BatchDeleteFunctionTriggersRequest 请求对象
     * @return CompletableFuture<BatchDeleteFunctionTriggersResponse>
     */
    public CompletableFuture<BatchDeleteFunctionTriggersResponse> batchDeleteFunctionTriggersAsync(BatchDeleteFunctionTriggersRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.batchDeleteFunctionTriggers);
    }

    /**
     * 创建触发器。
     * 创建触发器。  - 可以创建的触发器类型包括TIMER、APIG、CTS、DDS、DMS、DIS、LTS、OBS、SMN、KAFKA。 - DDS和KAFKA触发器创建时默认为DISABLED状态，其他触发器默认为ACTIVE状态。 - TIMER、DDS、DMS、KAFKA、LTS触发器支持禁用，其他触发器不支持。
     *
     * @param CreateFunctionTriggerRequest 请求对象
     * @return CompletableFuture<CreateFunctionTriggerResponse>
     */
    public CompletableFuture<CreateFunctionTriggerResponse> createFunctionTriggerAsync(CreateFunctionTriggerRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.createFunctionTrigger);
    }

    /**
     * 删除触发器。
     * 删除触发器。
     *
     * @param DeleteFunctionTriggerRequest 请求对象
     * @return CompletableFuture<DeleteFunctionTriggerResponse>
     */
    public CompletableFuture<DeleteFunctionTriggerResponse> deleteFunctionTriggerAsync(DeleteFunctionTriggerRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.deleteFunctionTrigger);
    }

    /**
     * 获取指定函数的所有触发器。
     * 获取指定函数的所有触发器设置。
     *
     * @param ListFunctionTriggersRequest 请求对象
     * @return CompletableFuture<ListFunctionTriggersResponse>
     */
    public CompletableFuture<ListFunctionTriggersResponse> listFunctionTriggersAsync(ListFunctionTriggersRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.listFunctionTriggers);
    }

    /**
     * 获取指定触发器的信息。
     * 获取特定触发器的信息。
     *
     * @param ShowFunctionTriggerRequest 请求对象
     * @return CompletableFuture<ShowFunctionTriggerResponse>
     */
    public CompletableFuture<ShowFunctionTriggerResponse> showFunctionTriggerAsync(ShowFunctionTriggerRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.showFunctionTrigger);
    }

    /**
     * 更新触发器
     * 更新触发器
     *
     * @param UpdateTriggerRequest 请求对象
     * @return CompletableFuture<UpdateTriggerResponse>
     */
    public CompletableFuture<UpdateTriggerResponse> updateTriggerAsync(UpdateTriggerRequest request) {
        return hcClient.asyncInvokeHttp(request, FunctionGraphMeta.updateTrigger);
    }

}
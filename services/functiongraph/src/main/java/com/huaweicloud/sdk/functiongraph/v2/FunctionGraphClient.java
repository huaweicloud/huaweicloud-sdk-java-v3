package com.huaweicloud.sdk.functiongraph.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
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
     * 异步执行函数。
     *
     * @param AsyncInvokeFunctionRequest 请求对象
     * @return AsyncInvokeFunctionResponse
     */
    public AsyncInvokeFunctionResponse asyncInvokeFunction(AsyncInvokeFunctionRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.asyncInvokeFunction);
    }

    /**
     * 创建函数。
     * 创建指定的函数。
     *
     * @param CreateFunctionRequest 请求对象
     * @return CreateFunctionResponse
     */
    public CreateFunctionResponse createFunction(CreateFunctionRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.createFunction);
    }

    /**
     * 发布函数版本。
     * 发布函数版本。
     *
     * @param CreateFunctionVersionRequest 请求对象
     * @return CreateFunctionVersionResponse
     */
    public CreateFunctionVersionResponse createFunctionVersion(CreateFunctionVersionRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.createFunctionVersion);
    }

    /**
     * 创建函数版本别名。
     * 创建函数灰度版本别名。
     *
     * @param CreateVersionAliasRequest 请求对象
     * @return CreateVersionAliasResponse
     */
    public CreateVersionAliasResponse createVersionAlias(CreateVersionAliasRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.createVersionAlias);
    }

    /**
     * 删除函数/版本。
     * 删除指定的函数或者特定的版本（不允许删除latest版本）。  如果URN中包含函数版本或者别名，则删除特定的函数版本或者别名指向的版本以及该版本关联的trigger。 如果URN中不包含版本或者别名，则删除整个函数，包含所有版本以及别名，触发器。
     *
     * @param DeleteFunctionRequest 请求对象
     * @return DeleteFunctionResponse
     */
    public DeleteFunctionResponse deleteFunction(DeleteFunctionRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.deleteFunction);
    }

    /**
     * 删除函数版本别名。
     * 删除函数版本别名。
     *
     * @param DeleteVersionAliasRequest 请求对象
     * @return DeleteVersionAliasResponse
     */
    public DeleteVersionAliasResponse deleteVersionAlias(DeleteVersionAliasRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.deleteVersionAlias);
    }

    /**
     * 同步执行函数。
     * 同步调用指的是客户端请求需要明确等到响应结果，也就是说这样的请求必须得调用到用户的函数，并且等到调用完成才返回。
     *
     * @param InvokeFunctionRequest 请求对象
     * @return InvokeFunctionResponse
     */
    public InvokeFunctionResponse invokeFunction(InvokeFunctionRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.invokeFunction);
    }

    /**
     * 获取指定时间段的函数运行指标
     * 获取指定时间段的函数运行指标。
     *
     * @param ListFunctionStatisticsRequest 请求对象
     * @return ListFunctionStatisticsResponse
     */
    public ListFunctionStatisticsResponse listFunctionStatistics(ListFunctionStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listFunctionStatistics);
    }

    /**
     * 获取指定函数的版本列表。
     * 获取指定函数的版本列表。
     *
     * @param ListFunctionVersionsRequest 请求对象
     * @return ListFunctionVersionsResponse
     */
    public ListFunctionVersionsResponse listFunctionVersions(ListFunctionVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listFunctionVersions);
    }

    /**
     * 获取函数列表
     * 获取函数列表
     *
     * @param ListFunctionsRequest 请求对象
     * @return ListFunctionsResponse
     */
    public ListFunctionsResponse listFunctions(ListFunctionsRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listFunctions);
    }

    /**
     * 查询租户配额
     * 查询租户配额
     *
     * @param ListQuotasRequest 请求对象
     * @return ListQuotasResponse
     */
    public ListQuotasResponse listQuotas(ListQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listQuotas);
    }

    /**
     * 租户函数统计信息
     * 租户函数统计信息。  返回三类的统计信息，函数格式和大小使用情况包括配额和使用量，流量报告。 通过查询参数filter可以进行过滤，查询参数period可以指定返回的时间段。
     *
     * @param ListStatisticsRequest 请求对象
     * @return ListStatisticsResponse
     */
    public ListStatisticsResponse listStatistics(ListStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listStatistics);
    }

    /**
     * 获取指定函数所有版本别名列表。
     * 获取函数版本别名列表。
     *
     * @param ListVersionAliasesRequest 请求对象
     * @return ListVersionAliasesResponse
     */
    public ListVersionAliasesResponse listVersionAliases(ListVersionAliasesRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listVersionAliases);
    }

    /**
     * 获取指定函数代码。
     * 获取指定函数的代码。
     *
     * @param ShowFunctionCodeRequest 请求对象
     * @return ShowFunctionCodeResponse
     */
    public ShowFunctionCodeResponse showFunctionCode(ShowFunctionCodeRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.showFunctionCode);
    }

    /**
     * 获取函数的metadata。
     * 获取指定函数的metadata。
     *
     * @param ShowFunctionConfigRequest 请求对象
     * @return ShowFunctionConfigResponse
     */
    public ShowFunctionConfigResponse showFunctionConfig(ShowFunctionConfigRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.showFunctionConfig);
    }

    /**
     * 获取函数版本的指定别名信息。
     * 获取函数指定的版本别名信息。
     *
     * @param ShowVersionAliasRequest 请求对象
     * @return ShowVersionAliasResponse
     */
    public ShowVersionAliasResponse showVersionAlias(ShowVersionAliasRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.showVersionAlias);
    }

    /**
     * 修改函数代码。
     * 修改指定的函数的代码。
     *
     * @param UpdateFunctionCodeRequest 请求对象
     * @return UpdateFunctionCodeResponse
     */
    public UpdateFunctionCodeResponse updateFunctionCode(UpdateFunctionCodeRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.updateFunctionCode);
    }

    /**
     * 修改函数的metadata信息。
     * 修改指定的函数的metadata信息。
     *
     * @param UpdateFunctionConfigRequest 请求对象
     * @return UpdateFunctionConfigResponse
     */
    public UpdateFunctionConfigResponse updateFunctionConfig(UpdateFunctionConfigRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.updateFunctionConfig);
    }

    /**
     * 修改函数版本别名信息。
     * 修改函数版本别名信息。
     *
     * @param UpdateVersionAliasRequest 请求对象
     * @return UpdateVersionAliasResponse
     */
    public UpdateVersionAliasResponse updateVersionAlias(UpdateVersionAliasRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.updateVersionAlias);
    }

    /**
     * 删除指定函数的所有触发器。
     * 删除指定函数所有触发器设置。  在提供函数版本且非latest的情况下，删除对应函数版本的触发器。 在提供函数别名的情况下，删除对应函数别名的触发器。 在不提供函数版本（也不提供别名）或版本为latest的情况下，删除该函数所有的触发器（包括所有版本和别名）。
     *
     * @param BatchDeleteFunctionTriggersRequest 请求对象
     * @return BatchDeleteFunctionTriggersResponse
     */
    public BatchDeleteFunctionTriggersResponse batchDeleteFunctionTriggers(BatchDeleteFunctionTriggersRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.batchDeleteFunctionTriggers);
    }

    /**
     * 创建触发器。
     * 创建触发器。  - 可以创建的触发器类型包括TIMER、APIG、CTS、DDS、DMS、DIS、LTS、OBS、SMN、KAFKA。 - DDS和KAFKA触发器创建时默认为DISABLE状态，其他触发器默认为ACTIVE状态。 - TIMER、DDS、DMS、KAFKA、LTS触发器支持禁用，其他触发器不支持。
     *
     * @param CreateFunctionTriggerRequest 请求对象
     * @return CreateFunctionTriggerResponse
     */
    public CreateFunctionTriggerResponse createFunctionTrigger(CreateFunctionTriggerRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.createFunctionTrigger);
    }

    /**
     * 删除触发器。
     * 删除触发器。
     *
     * @param DeleteFunctionTriggerRequest 请求对象
     * @return DeleteFunctionTriggerResponse
     */
    public DeleteFunctionTriggerResponse deleteFunctionTrigger(DeleteFunctionTriggerRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.deleteFunctionTrigger);
    }

    /**
     * 获取指定函数的所有触发器。
     * 获取指定函数的所有触发器设置。
     *
     * @param ListFunctionTriggersRequest 请求对象
     * @return ListFunctionTriggersResponse
     */
    public ListFunctionTriggersResponse listFunctionTriggers(ListFunctionTriggersRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.listFunctionTriggers);
    }

    /**
     * 获取指定触发器的信息。
     * 获取特定触发器的信息。
     *
     * @param ShowFunctionTriggerRequest 请求对象
     * @return ShowFunctionTriggerResponse
     */
    public ShowFunctionTriggerResponse showFunctionTrigger(ShowFunctionTriggerRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.showFunctionTrigger);
    }

    /**
     * 更新触发器
     * 更新触发器
     *
     * @param UpdateTriggerRequest 请求对象
     * @return UpdateTriggerResponse
     */
    public UpdateTriggerResponse updateTrigger(UpdateTriggerRequest request) {
        return hcClient.syncInvokeHttp(request, FunctionGraphMeta.updateTrigger);
    }

}
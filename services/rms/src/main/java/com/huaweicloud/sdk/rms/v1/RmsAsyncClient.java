package com.huaweicloud.sdk.rms.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.rms.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class RmsAsyncClient {

    protected HcClient hcClient;

    public RmsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<RmsAsyncClient> newBuilder() {
        return new ClientBuilder<>(RmsAsyncClient::new, "GlobalCredentials");
    }

    /** 查询资源历史 查询资源与资源关系的变更历史
     *
     * @param ShowResourceHistoryRequest 请求对象
     * @return CompletableFuture<ShowResourceHistoryResponse> */
    public CompletableFuture<ShowResourceHistoryResponse> showResourceHistoryAsync(ShowResourceHistoryRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.showResourceHistory);
    }

    /** 查询资源历史 查询资源与资源关系的变更历史
     *
     * @param ShowResourceHistoryRequest 请求对象
     * @return AsyncInvoker<ShowResourceHistoryRequest, ShowResourceHistoryResponse> */
    public AsyncInvoker<ShowResourceHistoryRequest, ShowResourceHistoryResponse> showResourceHistoryAsyncInvoker(
        ShowResourceHistoryRequest request) {
        return new AsyncInvoker<ShowResourceHistoryRequest, ShowResourceHistoryResponse>(request,
            RmsMeta.showResourceHistory, hcClient);
    }

    /** 创建合规规则 创建新的合规规则
     *
     * @param CreatePolicyAssignmentsRequest 请求对象
     * @return CompletableFuture<CreatePolicyAssignmentsResponse> */
    public CompletableFuture<CreatePolicyAssignmentsResponse> createPolicyAssignmentsAsync(
        CreatePolicyAssignmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.createPolicyAssignments);
    }

    /** 创建合规规则 创建新的合规规则
     *
     * @param CreatePolicyAssignmentsRequest 请求对象
     * @return AsyncInvoker<CreatePolicyAssignmentsRequest, CreatePolicyAssignmentsResponse> */
    public AsyncInvoker<CreatePolicyAssignmentsRequest, CreatePolicyAssignmentsResponse> createPolicyAssignmentsAsyncInvoker(
        CreatePolicyAssignmentsRequest request) {
        return new AsyncInvoker<CreatePolicyAssignmentsRequest, CreatePolicyAssignmentsResponse>(request,
            RmsMeta.createPolicyAssignments, hcClient);
    }

    /** 删除合规规则 根据规则ID删除此规则
     *
     * @param DeletePolicyAssignmentRequest 请求对象
     * @return CompletableFuture<DeletePolicyAssignmentResponse> */
    public CompletableFuture<DeletePolicyAssignmentResponse> deletePolicyAssignmentAsync(
        DeletePolicyAssignmentRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.deletePolicyAssignment);
    }

    /** 删除合规规则 根据规则ID删除此规则
     *
     * @param DeletePolicyAssignmentRequest 请求对象
     * @return AsyncInvoker<DeletePolicyAssignmentRequest, DeletePolicyAssignmentResponse> */
    public AsyncInvoker<DeletePolicyAssignmentRequest, DeletePolicyAssignmentResponse> deletePolicyAssignmentAsyncInvoker(
        DeletePolicyAssignmentRequest request) {
        return new AsyncInvoker<DeletePolicyAssignmentRequest, DeletePolicyAssignmentResponse>(request,
            RmsMeta.deletePolicyAssignment, hcClient);
    }

    /** 停用合规规则 根据规则ID停用此规则
     *
     * @param DisablePolicyAssignmentRequest 请求对象
     * @return CompletableFuture<DisablePolicyAssignmentResponse> */
    public CompletableFuture<DisablePolicyAssignmentResponse> disablePolicyAssignmentAsync(
        DisablePolicyAssignmentRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.disablePolicyAssignment);
    }

    /** 停用合规规则 根据规则ID停用此规则
     *
     * @param DisablePolicyAssignmentRequest 请求对象
     * @return AsyncInvoker<DisablePolicyAssignmentRequest, DisablePolicyAssignmentResponse> */
    public AsyncInvoker<DisablePolicyAssignmentRequest, DisablePolicyAssignmentResponse> disablePolicyAssignmentAsyncInvoker(
        DisablePolicyAssignmentRequest request) {
        return new AsyncInvoker<DisablePolicyAssignmentRequest, DisablePolicyAssignmentResponse>(request,
            RmsMeta.disablePolicyAssignment, hcClient);
    }

    /** 启用合规规则 根据规则ID启用此规则
     *
     * @param EnablePolicyAssignmentRequest 请求对象
     * @return CompletableFuture<EnablePolicyAssignmentResponse> */
    public CompletableFuture<EnablePolicyAssignmentResponse> enablePolicyAssignmentAsync(
        EnablePolicyAssignmentRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.enablePolicyAssignment);
    }

    /** 启用合规规则 根据规则ID启用此规则
     *
     * @param EnablePolicyAssignmentRequest 请求对象
     * @return AsyncInvoker<EnablePolicyAssignmentRequest, EnablePolicyAssignmentResponse> */
    public AsyncInvoker<EnablePolicyAssignmentRequest, EnablePolicyAssignmentResponse> enablePolicyAssignmentAsyncInvoker(
        EnablePolicyAssignmentRequest request) {
        return new AsyncInvoker<EnablePolicyAssignmentRequest, EnablePolicyAssignmentResponse>(request,
            RmsMeta.enablePolicyAssignment, hcClient);
    }

    /** 列出内置策略 列出用户的内置策略
     *
     * @param ListBuiltInPolicyDefinitionsRequest 请求对象
     * @return CompletableFuture<ListBuiltInPolicyDefinitionsResponse> */
    public CompletableFuture<ListBuiltInPolicyDefinitionsResponse> listBuiltInPolicyDefinitionsAsync(
        ListBuiltInPolicyDefinitionsRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.listBuiltInPolicyDefinitions);
    }

    /** 列出内置策略 列出用户的内置策略
     *
     * @param ListBuiltInPolicyDefinitionsRequest 请求对象
     * @return AsyncInvoker<ListBuiltInPolicyDefinitionsRequest, ListBuiltInPolicyDefinitionsResponse> */
    public AsyncInvoker<ListBuiltInPolicyDefinitionsRequest, ListBuiltInPolicyDefinitionsResponse> listBuiltInPolicyDefinitionsAsyncInvoker(
        ListBuiltInPolicyDefinitionsRequest request) {
        return new AsyncInvoker<ListBuiltInPolicyDefinitionsRequest, ListBuiltInPolicyDefinitionsResponse>(request,
            RmsMeta.listBuiltInPolicyDefinitions, hcClient);
    }

    /** 列出合规规则 列出用户的合规规则
     *
     * @param ListPolicyAssignmentsRequest 请求对象
     * @return CompletableFuture<ListPolicyAssignmentsResponse> */
    public CompletableFuture<ListPolicyAssignmentsResponse> listPolicyAssignmentsAsync(
        ListPolicyAssignmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.listPolicyAssignments);
    }

    /** 列出合规规则 列出用户的合规规则
     *
     * @param ListPolicyAssignmentsRequest 请求对象
     * @return AsyncInvoker<ListPolicyAssignmentsRequest, ListPolicyAssignmentsResponse> */
    public AsyncInvoker<ListPolicyAssignmentsRequest, ListPolicyAssignmentsResponse> listPolicyAssignmentsAsyncInvoker(
        ListPolicyAssignmentsRequest request) {
        return new AsyncInvoker<ListPolicyAssignmentsRequest, ListPolicyAssignmentsResponse>(request,
            RmsMeta.listPolicyAssignments, hcClient);
    }

    /** 获取规则的合规结果 根据规则ID查询所有的合规结果
     *
     * @param ListPolicyStatesByAssignmentIdRequest 请求对象
     * @return CompletableFuture<ListPolicyStatesByAssignmentIdResponse> */
    public CompletableFuture<ListPolicyStatesByAssignmentIdResponse> listPolicyStatesByAssignmentIdAsync(
        ListPolicyStatesByAssignmentIdRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.listPolicyStatesByAssignmentId);
    }

    /** 获取规则的合规结果 根据规则ID查询所有的合规结果
     *
     * @param ListPolicyStatesByAssignmentIdRequest 请求对象
     * @return AsyncInvoker<ListPolicyStatesByAssignmentIdRequest, ListPolicyStatesByAssignmentIdResponse> */
    public AsyncInvoker<ListPolicyStatesByAssignmentIdRequest, ListPolicyStatesByAssignmentIdResponse> listPolicyStatesByAssignmentIdAsyncInvoker(
        ListPolicyStatesByAssignmentIdRequest request) {
        return new AsyncInvoker<ListPolicyStatesByAssignmentIdRequest, ListPolicyStatesByAssignmentIdResponse>(request,
            RmsMeta.listPolicyStatesByAssignmentId, hcClient);
    }

    /** 获取用户的合规结果 查询用户所有的合规结果
     *
     * @param ListPolicyStatesByDomainIdRequest 请求对象
     * @return CompletableFuture<ListPolicyStatesByDomainIdResponse> */
    public CompletableFuture<ListPolicyStatesByDomainIdResponse> listPolicyStatesByDomainIdAsync(
        ListPolicyStatesByDomainIdRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.listPolicyStatesByDomainId);
    }

    /** 获取用户的合规结果 查询用户所有的合规结果
     *
     * @param ListPolicyStatesByDomainIdRequest 请求对象
     * @return AsyncInvoker<ListPolicyStatesByDomainIdRequest, ListPolicyStatesByDomainIdResponse> */
    public AsyncInvoker<ListPolicyStatesByDomainIdRequest, ListPolicyStatesByDomainIdResponse> listPolicyStatesByDomainIdAsyncInvoker(
        ListPolicyStatesByDomainIdRequest request) {
        return new AsyncInvoker<ListPolicyStatesByDomainIdRequest, ListPolicyStatesByDomainIdResponse>(request,
            RmsMeta.listPolicyStatesByDomainId, hcClient);
    }

    /** 获取资源的合规结果 根据资源ID查询所有合规结果
     *
     * @param ListPolicyStatesByResourceIdRequest 请求对象
     * @return CompletableFuture<ListPolicyStatesByResourceIdResponse> */
    public CompletableFuture<ListPolicyStatesByResourceIdResponse> listPolicyStatesByResourceIdAsync(
        ListPolicyStatesByResourceIdRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.listPolicyStatesByResourceId);
    }

    /** 获取资源的合规结果 根据资源ID查询所有合规结果
     *
     * @param ListPolicyStatesByResourceIdRequest 请求对象
     * @return AsyncInvoker<ListPolicyStatesByResourceIdRequest, ListPolicyStatesByResourceIdResponse> */
    public AsyncInvoker<ListPolicyStatesByResourceIdRequest, ListPolicyStatesByResourceIdResponse> listPolicyStatesByResourceIdAsyncInvoker(
        ListPolicyStatesByResourceIdRequest request) {
        return new AsyncInvoker<ListPolicyStatesByResourceIdRequest, ListPolicyStatesByResourceIdResponse>(request,
            RmsMeta.listPolicyStatesByResourceId, hcClient);
    }

    /** 运行合规评估 根据规则ID评估此规则
     *
     * @param RunEvaluationByPolicyAssignmentIdRequest 请求对象
     * @return CompletableFuture<RunEvaluationByPolicyAssignmentIdResponse> */
    public CompletableFuture<RunEvaluationByPolicyAssignmentIdResponse> runEvaluationByPolicyAssignmentIdAsync(
        RunEvaluationByPolicyAssignmentIdRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.runEvaluationByPolicyAssignmentId);
    }

    /** 运行合规评估 根据规则ID评估此规则
     *
     * @param RunEvaluationByPolicyAssignmentIdRequest 请求对象
     * @return AsyncInvoker<RunEvaluationByPolicyAssignmentIdRequest, RunEvaluationByPolicyAssignmentIdResponse> */
    public AsyncInvoker<RunEvaluationByPolicyAssignmentIdRequest, RunEvaluationByPolicyAssignmentIdResponse> runEvaluationByPolicyAssignmentIdAsyncInvoker(
        RunEvaluationByPolicyAssignmentIdRequest request) {
        return new AsyncInvoker<RunEvaluationByPolicyAssignmentIdRequest, RunEvaluationByPolicyAssignmentIdResponse>(
            request, RmsMeta.runEvaluationByPolicyAssignmentId, hcClient);
    }

    /** 查询单个内置策略 根据策略ID查询单个内置策略
     *
     * @param ShowBuiltInPolicyDefinitionRequest 请求对象
     * @return CompletableFuture<ShowBuiltInPolicyDefinitionResponse> */
    public CompletableFuture<ShowBuiltInPolicyDefinitionResponse> showBuiltInPolicyDefinitionAsync(
        ShowBuiltInPolicyDefinitionRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.showBuiltInPolicyDefinition);
    }

    /** 查询单个内置策略 根据策略ID查询单个内置策略
     *
     * @param ShowBuiltInPolicyDefinitionRequest 请求对象
     * @return AsyncInvoker<ShowBuiltInPolicyDefinitionRequest, ShowBuiltInPolicyDefinitionResponse> */
    public AsyncInvoker<ShowBuiltInPolicyDefinitionRequest, ShowBuiltInPolicyDefinitionResponse> showBuiltInPolicyDefinitionAsyncInvoker(
        ShowBuiltInPolicyDefinitionRequest request) {
        return new AsyncInvoker<ShowBuiltInPolicyDefinitionRequest, ShowBuiltInPolicyDefinitionResponse>(request,
            RmsMeta.showBuiltInPolicyDefinition, hcClient);
    }

    /** 获取规则的评估状态 根据规则ID查询此规则的评估状态
     *
     * @param ShowEvaluationStateByAssignmentIdRequest 请求对象
     * @return CompletableFuture<ShowEvaluationStateByAssignmentIdResponse> */
    public CompletableFuture<ShowEvaluationStateByAssignmentIdResponse> showEvaluationStateByAssignmentIdAsync(
        ShowEvaluationStateByAssignmentIdRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.showEvaluationStateByAssignmentId);
    }

    /** 获取规则的评估状态 根据规则ID查询此规则的评估状态
     *
     * @param ShowEvaluationStateByAssignmentIdRequest 请求对象
     * @return AsyncInvoker<ShowEvaluationStateByAssignmentIdRequest, ShowEvaluationStateByAssignmentIdResponse> */
    public AsyncInvoker<ShowEvaluationStateByAssignmentIdRequest, ShowEvaluationStateByAssignmentIdResponse> showEvaluationStateByAssignmentIdAsyncInvoker(
        ShowEvaluationStateByAssignmentIdRequest request) {
        return new AsyncInvoker<ShowEvaluationStateByAssignmentIdRequest, ShowEvaluationStateByAssignmentIdResponse>(
            request, RmsMeta.showEvaluationStateByAssignmentId, hcClient);
    }

    /** 获取单个合规规则 根据规则ID获取单个规则
     *
     * @param ShowPolicyAssignmentRequest 请求对象
     * @return CompletableFuture<ShowPolicyAssignmentResponse> */
    public CompletableFuture<ShowPolicyAssignmentResponse> showPolicyAssignmentAsync(
        ShowPolicyAssignmentRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.showPolicyAssignment);
    }

    /** 获取单个合规规则 根据规则ID获取单个规则
     *
     * @param ShowPolicyAssignmentRequest 请求对象
     * @return AsyncInvoker<ShowPolicyAssignmentRequest, ShowPolicyAssignmentResponse> */
    public AsyncInvoker<ShowPolicyAssignmentRequest, ShowPolicyAssignmentResponse> showPolicyAssignmentAsyncInvoker(
        ShowPolicyAssignmentRequest request) {
        return new AsyncInvoker<ShowPolicyAssignmentRequest, ShowPolicyAssignmentResponse>(request,
            RmsMeta.showPolicyAssignment, hcClient);
    }

    /** 更新合规规则 更新用户的合规规则
     *
     * @param UpdatePolicyAssignmentRequest 请求对象
     * @return CompletableFuture<UpdatePolicyAssignmentResponse> */
    public CompletableFuture<UpdatePolicyAssignmentResponse> updatePolicyAssignmentAsync(
        UpdatePolicyAssignmentRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.updatePolicyAssignment);
    }

    /** 更新合规规则 更新用户的合规规则
     *
     * @param UpdatePolicyAssignmentRequest 请求对象
     * @return AsyncInvoker<UpdatePolicyAssignmentRequest, UpdatePolicyAssignmentResponse> */
    public AsyncInvoker<UpdatePolicyAssignmentRequest, UpdatePolicyAssignmentResponse> updatePolicyAssignmentAsyncInvoker(
        UpdatePolicyAssignmentRequest request) {
        return new AsyncInvoker<UpdatePolicyAssignmentRequest, UpdatePolicyAssignmentResponse>(request,
            RmsMeta.updatePolicyAssignment, hcClient);
    }

    /** 查询租户可见的区域 查询租户可见的区域
     *
     * @param ListRegionsRequest 请求对象
     * @return CompletableFuture<ListRegionsResponse> */
    public CompletableFuture<ListRegionsResponse> listRegionsAsync(ListRegionsRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.listRegions);
    }

    /** 查询租户可见的区域 查询租户可见的区域
     *
     * @param ListRegionsRequest 请求对象
     * @return AsyncInvoker<ListRegionsRequest, ListRegionsResponse> */
    public AsyncInvoker<ListRegionsRequest, ListRegionsResponse> listRegionsAsyncInvoker(ListRegionsRequest request) {
        return new AsyncInvoker<ListRegionsRequest, ListRegionsResponse>(request, RmsMeta.listRegions, hcClient);
    }

    /** 列举资源关系 指定资源ID，查询该资源与其他资源的关联关系，可以指定关系方向为\&quot;in\&quot; 或者\&quot;out\&quot;
     *
     * @param ShowResourceRelationsRequest 请求对象
     * @return CompletableFuture<ShowResourceRelationsResponse> */
    public CompletableFuture<ShowResourceRelationsResponse> showResourceRelationsAsync(
        ShowResourceRelationsRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.showResourceRelations);
    }

    /** 列举资源关系 指定资源ID，查询该资源与其他资源的关联关系，可以指定关系方向为\&quot;in\&quot; 或者\&quot;out\&quot;
     *
     * @param ShowResourceRelationsRequest 请求对象
     * @return AsyncInvoker<ShowResourceRelationsRequest, ShowResourceRelationsResponse> */
    public AsyncInvoker<ShowResourceRelationsRequest, ShowResourceRelationsResponse> showResourceRelationsAsyncInvoker(
        ShowResourceRelationsRequest request) {
        return new AsyncInvoker<ShowResourceRelationsRequest, ShowResourceRelationsResponse>(request,
            RmsMeta.showResourceRelations, hcClient);
    }

    /** 列举所有资源 返回当前租户下所有资源，需要当前用户有rms:resources:list权限。
     *
     * @param ListAllResourcesRequest 请求对象
     * @return CompletableFuture<ListAllResourcesResponse> */
    public CompletableFuture<ListAllResourcesResponse> listAllResourcesAsync(ListAllResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.listAllResources);
    }

    /** 列举所有资源 返回当前租户下所有资源，需要当前用户有rms:resources:list权限。
     *
     * @param ListAllResourcesRequest 请求对象
     * @return AsyncInvoker<ListAllResourcesRequest, ListAllResourcesResponse> */
    public AsyncInvoker<ListAllResourcesRequest, ListAllResourcesResponse> listAllResourcesAsyncInvoker(
        ListAllResourcesRequest request) {
        return new AsyncInvoker<ListAllResourcesRequest, ListAllResourcesResponse>(request, RmsMeta.listAllResources,
            hcClient);
    }

    /** 列举云服务 查询RMS支持的云服务、资源、区域列表
     *
     * @param ListProvidersRequest 请求对象
     * @return CompletableFuture<ListProvidersResponse> */
    public CompletableFuture<ListProvidersResponse> listProvidersAsync(ListProvidersRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.listProviders);
    }

    /** 列举云服务 查询RMS支持的云服务、资源、区域列表
     *
     * @param ListProvidersRequest 请求对象
     * @return AsyncInvoker<ListProvidersRequest, ListProvidersResponse> */
    public AsyncInvoker<ListProvidersRequest, ListProvidersResponse> listProvidersAsyncInvoker(
        ListProvidersRequest request) {
        return new AsyncInvoker<ListProvidersRequest, ListProvidersResponse>(request, RmsMeta.listProviders, hcClient);
    }

    /** 列举指定类型的资源
     * 返回当前租户下特定资源类型的资源，需要当前用户有rms:resources:list权限。比如查询云服务器，对应的RMS资源类型是ecs.cloudservers，其中provider为ecs，type为cloudservers。
     * RMS支持的服务和资源类型参见[支持的服务和区域](https://console.huaweicloud.com/eps/#/resources/supported)。
     *
     * @param ListResourcesRequest 请求对象
     * @return CompletableFuture<ListResourcesResponse> */
    public CompletableFuture<ListResourcesResponse> listResourcesAsync(ListResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.listResources);
    }

    /** 列举指定类型的资源
     * 返回当前租户下特定资源类型的资源，需要当前用户有rms:resources:list权限。比如查询云服务器，对应的RMS资源类型是ecs.cloudservers，其中provider为ecs，type为cloudservers。
     * RMS支持的服务和资源类型参见[支持的服务和区域](https://console.huaweicloud.com/eps/#/resources/supported)。
     *
     * @param ListResourcesRequest 请求对象
     * @return AsyncInvoker<ListResourcesRequest, ListResourcesResponse> */
    public AsyncInvoker<ListResourcesRequest, ListResourcesResponse> listResourcesAsyncInvoker(
        ListResourcesRequest request) {
        return new AsyncInvoker<ListResourcesRequest, ListResourcesResponse>(request, RmsMeta.listResources, hcClient);
    }

    /** 查询单个资源
     * 指定资源ID，返回该资源的详细信息，需要当前用户有rms:resources:get权限。比如查询云服务器，对应的RMS资源类型是ecs.cloudservers，其中provider为ecs，type为cloudservers。RMS支持的服务和资源类型参见[支持的服务和区域](https://console.huaweicloud.com/eps/#/resources/supported)。
     *
     * @param ShowResourceByIdRequest 请求对象
     * @return CompletableFuture<ShowResourceByIdResponse> */
    public CompletableFuture<ShowResourceByIdResponse> showResourceByIdAsync(ShowResourceByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.showResourceById);
    }

    /** 查询单个资源
     * 指定资源ID，返回该资源的详细信息，需要当前用户有rms:resources:get权限。比如查询云服务器，对应的RMS资源类型是ecs.cloudservers，其中provider为ecs，type为cloudservers。RMS支持的服务和资源类型参见[支持的服务和区域](https://console.huaweicloud.com/eps/#/resources/supported)。
     *
     * @param ShowResourceByIdRequest 请求对象
     * @return AsyncInvoker<ShowResourceByIdRequest, ShowResourceByIdResponse> */
    public AsyncInvoker<ShowResourceByIdRequest, ShowResourceByIdResponse> showResourceByIdAsyncInvoker(
        ShowResourceByIdRequest request) {
        return new AsyncInvoker<ShowResourceByIdRequest, ShowResourceByIdResponse>(request, RmsMeta.showResourceById,
            hcClient);
    }

    /** 创建或更新记录器 创建或更新资源记录器，只能存在一个资源记录器
     *
     * @param CreateTrackerConfigRequest 请求对象
     * @return CompletableFuture<CreateTrackerConfigResponse> */
    public CompletableFuture<CreateTrackerConfigResponse> createTrackerConfigAsync(CreateTrackerConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.createTrackerConfig);
    }

    /** 创建或更新记录器 创建或更新资源记录器，只能存在一个资源记录器
     *
     * @param CreateTrackerConfigRequest 请求对象
     * @return AsyncInvoker<CreateTrackerConfigRequest, CreateTrackerConfigResponse> */
    public AsyncInvoker<CreateTrackerConfigRequest, CreateTrackerConfigResponse> createTrackerConfigAsyncInvoker(
        CreateTrackerConfigRequest request) {
        return new AsyncInvoker<CreateTrackerConfigRequest, CreateTrackerConfigResponse>(request,
            RmsMeta.createTrackerConfig, hcClient);
    }

    /** 删除记录器 删除资源记录器
     *
     * @param DeleteTrackerConfigRequest 请求对象
     * @return CompletableFuture<DeleteTrackerConfigResponse> */
    public CompletableFuture<DeleteTrackerConfigResponse> deleteTrackerConfigAsync(DeleteTrackerConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.deleteTrackerConfig);
    }

    /** 删除记录器 删除资源记录器
     *
     * @param DeleteTrackerConfigRequest 请求对象
     * @return AsyncInvoker<DeleteTrackerConfigRequest, DeleteTrackerConfigResponse> */
    public AsyncInvoker<DeleteTrackerConfigRequest, DeleteTrackerConfigResponse> deleteTrackerConfigAsyncInvoker(
        DeleteTrackerConfigRequest request) {
        return new AsyncInvoker<DeleteTrackerConfigRequest, DeleteTrackerConfigResponse>(request,
            RmsMeta.deleteTrackerConfig, hcClient);
    }

    /** 查询记录器 查询资源记录器的详细信息
     *
     * @param ShowTrackerConfigRequest 请求对象
     * @return CompletableFuture<ShowTrackerConfigResponse> */
    public CompletableFuture<ShowTrackerConfigResponse> showTrackerConfigAsync(ShowTrackerConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.showTrackerConfig);
    }

    /** 查询记录器 查询资源记录器的详细信息
     *
     * @param ShowTrackerConfigRequest 请求对象
     * @return AsyncInvoker<ShowTrackerConfigRequest, ShowTrackerConfigResponse> */
    public AsyncInvoker<ShowTrackerConfigRequest, ShowTrackerConfigResponse> showTrackerConfigAsyncInvoker(
        ShowTrackerConfigRequest request) {
        return new AsyncInvoker<ShowTrackerConfigRequest, ShowTrackerConfigResponse>(request, RmsMeta.showTrackerConfig,
            hcClient);
    }

}

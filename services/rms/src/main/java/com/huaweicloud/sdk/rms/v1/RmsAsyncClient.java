package com.huaweicloud.sdk.rms.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.rms.v1.model.*;

public class RmsAsyncClient {
    protected HcClient hcClient;

    public RmsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<RmsAsyncClient> newBuilder() {
        return new ClientBuilder<>(RmsAsyncClient::new, "GlobalCredentials");
    }


    /**
     * 查询资源历史
     * 查询资源与资源关系的变更历史
     *
     * @param ShowResourceHistoryRequest 请求对象
     * @return CompletableFuture<ShowResourceHistoryResponse>
     */
    public CompletableFuture<ShowResourceHistoryResponse> showResourceHistoryAsync(ShowResourceHistoryRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.showResourceHistory);
    }

    /**
     * 创建合规规则
     * 创建新的合规规则
     *
     * @param CreatePolicyAssignmentsRequest 请求对象
     * @return CompletableFuture<CreatePolicyAssignmentsResponse>
     */
    public CompletableFuture<CreatePolicyAssignmentsResponse> createPolicyAssignmentsAsync(CreatePolicyAssignmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.createPolicyAssignments);
    }

    /**
     * 删除合规规则
     * 根据规则ID删除此规则
     *
     * @param DeletePolicyAssignmentRequest 请求对象
     * @return CompletableFuture<DeletePolicyAssignmentResponse>
     */
    public CompletableFuture<DeletePolicyAssignmentResponse> deletePolicyAssignmentAsync(DeletePolicyAssignmentRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.deletePolicyAssignment);
    }

    /**
     * 停用合规规则
     * 根据规则ID停用此规则
     *
     * @param DisablePolicyAssignmentRequest 请求对象
     * @return CompletableFuture<DisablePolicyAssignmentResponse>
     */
    public CompletableFuture<DisablePolicyAssignmentResponse> disablePolicyAssignmentAsync(DisablePolicyAssignmentRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.disablePolicyAssignment);
    }

    /**
     * 启用合规规则
     * 根据规则ID启用此规则
     *
     * @param EnablePolicyAssignmentRequest 请求对象
     * @return CompletableFuture<EnablePolicyAssignmentResponse>
     */
    public CompletableFuture<EnablePolicyAssignmentResponse> enablePolicyAssignmentAsync(EnablePolicyAssignmentRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.enablePolicyAssignment);
    }

    /**
     * 列出内置策略
     * 列出用户的内置策略
     *
     * @param ListBuiltInPolicyDefinitionsRequest 请求对象
     * @return CompletableFuture<ListBuiltInPolicyDefinitionsResponse>
     */
    public CompletableFuture<ListBuiltInPolicyDefinitionsResponse> listBuiltInPolicyDefinitionsAsync(ListBuiltInPolicyDefinitionsRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.listBuiltInPolicyDefinitions);
    }

    /**
     * 列出合规规则
     * 列出用户的合规规则
     *
     * @param ListPolicyAssignmentsRequest 请求对象
     * @return CompletableFuture<ListPolicyAssignmentsResponse>
     */
    public CompletableFuture<ListPolicyAssignmentsResponse> listPolicyAssignmentsAsync(ListPolicyAssignmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.listPolicyAssignments);
    }

    /**
     * 获取规则的合规结果
     * 根据规则ID查询所有的合规结果
     *
     * @param ListPolicyStatesByAssignmentIdRequest 请求对象
     * @return CompletableFuture<ListPolicyStatesByAssignmentIdResponse>
     */
    public CompletableFuture<ListPolicyStatesByAssignmentIdResponse> listPolicyStatesByAssignmentIdAsync(ListPolicyStatesByAssignmentIdRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.listPolicyStatesByAssignmentId);
    }

    /**
     * 获取用户的合规结果
     * 查询用户所有的合规结果
     *
     * @param ListPolicyStatesByDomainIdRequest 请求对象
     * @return CompletableFuture<ListPolicyStatesByDomainIdResponse>
     */
    public CompletableFuture<ListPolicyStatesByDomainIdResponse> listPolicyStatesByDomainIdAsync(ListPolicyStatesByDomainIdRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.listPolicyStatesByDomainId);
    }

    /**
     * 获取资源的合规结果
     * 根据资源ID查询所有合规结果
     *
     * @param ListPolicyStatesByResourceIdRequest 请求对象
     * @return CompletableFuture<ListPolicyStatesByResourceIdResponse>
     */
    public CompletableFuture<ListPolicyStatesByResourceIdResponse> listPolicyStatesByResourceIdAsync(ListPolicyStatesByResourceIdRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.listPolicyStatesByResourceId);
    }

    /**
     * 运行合规评估
     * 根据规则ID评估此规则
     *
     * @param RunEvaluationByPolicyAssignmentIdRequest 请求对象
     * @return CompletableFuture<RunEvaluationByPolicyAssignmentIdResponse>
     */
    public CompletableFuture<RunEvaluationByPolicyAssignmentIdResponse> runEvaluationByPolicyAssignmentIdAsync(RunEvaluationByPolicyAssignmentIdRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.runEvaluationByPolicyAssignmentId);
    }

    /**
     * 查询单个内置策略
     * 根据策略ID查询单个内置策略
     *
     * @param ShowBuiltInPolicyDefinitionRequest 请求对象
     * @return CompletableFuture<ShowBuiltInPolicyDefinitionResponse>
     */
    public CompletableFuture<ShowBuiltInPolicyDefinitionResponse> showBuiltInPolicyDefinitionAsync(ShowBuiltInPolicyDefinitionRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.showBuiltInPolicyDefinition);
    }

    /**
     * 获取规则的评估状态
     * 根据规则ID查询此规则的评估状态
     *
     * @param ShowEvaluationStateByAssignmentIdRequest 请求对象
     * @return CompletableFuture<ShowEvaluationStateByAssignmentIdResponse>
     */
    public CompletableFuture<ShowEvaluationStateByAssignmentIdResponse> showEvaluationStateByAssignmentIdAsync(ShowEvaluationStateByAssignmentIdRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.showEvaluationStateByAssignmentId);
    }

    /**
     * 获取单个合规规则
     * 根据规则ID获取单个规则
     *
     * @param ShowPolicyAssignmentRequest 请求对象
     * @return CompletableFuture<ShowPolicyAssignmentResponse>
     */
    public CompletableFuture<ShowPolicyAssignmentResponse> showPolicyAssignmentAsync(ShowPolicyAssignmentRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.showPolicyAssignment);
    }

    /**
     * 更新合规规则
     * 更新用户的合规规则
     *
     * @param UpdatePolicyAssignmentRequest 请求对象
     * @return CompletableFuture<UpdatePolicyAssignmentResponse>
     */
    public CompletableFuture<UpdatePolicyAssignmentResponse> updatePolicyAssignmentAsync(UpdatePolicyAssignmentRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.updatePolicyAssignment);
    }

    /**
     * 列举资源关系
     * 指定资源ID，查询该资源与其他资源的关联关系，可以指定关系方向为\&quot;in\&quot; 或者\&quot;out\&quot;
     *
     * @param ShowResourceRelationsRequest 请求对象
     * @return CompletableFuture<ShowResourceRelationsResponse>
     */
    public CompletableFuture<ShowResourceRelationsResponse> showResourceRelationsAsync(ShowResourceRelationsRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.showResourceRelations);
    }

    /**
     * 列举云服务
     * 查询RMS支持的云服务、资源、区域列表
     *
     * @param ListProvidersRequest 请求对象
     * @return CompletableFuture<ListProvidersResponse>
     */
    public CompletableFuture<ListProvidersResponse> listProvidersAsync(ListProvidersRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.listProviders);
    }

    /**
     * 列举指定类型的资源
     * 返回当前租户下特定资源类型的资源，需要当前用户有rms:resources:list权限。比如查询云服务器，对应的RMS资源类型是ecs.cloudservers，其中provider为ecs，type为cloudservers。RMS支持的服务和资源类型参见[支持的服务和区域](https://console.huaweicloud.com/eps/#/resources/supported)。
     *
     * @param ListResourcesRequest 请求对象
     * @return CompletableFuture<ListResourcesResponse>
     */
    public CompletableFuture<ListResourcesResponse> listResourcesAsync(ListResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.listResources);
    }

    /**
     * 查询单个资源
     * 指定资源ID，返回该资源的详细信息，需要当前用户有rms:resources:get权限。比如查询云服务器，对应的RMS资源类型是ecs.cloudservers，其中provider为ecs，type为cloudservers。RMS支持的服务和资源类型参见[支持的服务和区域](https://console.huaweicloud.com/eps/#/resources/supported)。
     *
     * @param ShowResourceByIdRequest 请求对象
     * @return CompletableFuture<ShowResourceByIdResponse>
     */
    public CompletableFuture<ShowResourceByIdResponse> showResourceByIdAsync(ShowResourceByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.showResourceById);
    }

    /**
     * 创建或更新记录器
     * 创建或更新资源记录器，只能存在一个资源记录器
     *
     * @param CreateTrackerConfigRequest 请求对象
     * @return CompletableFuture<CreateTrackerConfigResponse>
     */
    public CompletableFuture<CreateTrackerConfigResponse> createTrackerConfigAsync(CreateTrackerConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.createTrackerConfig);
    }

    /**
     * 删除记录器
     * 删除资源记录器
     *
     * @param DeleteTrackerConfigRequest 请求对象
     * @return CompletableFuture<DeleteTrackerConfigResponse>
     */
    public CompletableFuture<DeleteTrackerConfigResponse> deleteTrackerConfigAsync(DeleteTrackerConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.deleteTrackerConfig);
    }

    /**
     * 查询记录器
     * 查询资源记录器的详细信息
     *
     * @param ShowTrackerConfigRequest 请求对象
     * @return CompletableFuture<ShowTrackerConfigResponse>
     */
    public CompletableFuture<ShowTrackerConfigResponse> showTrackerConfigAsync(ShowTrackerConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, RmsMeta.showTrackerConfig);
    }

}
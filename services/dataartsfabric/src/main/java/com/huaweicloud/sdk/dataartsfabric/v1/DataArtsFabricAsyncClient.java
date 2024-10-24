package com.huaweicloud.sdk.dataartsfabric.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.dataartsfabric.v1.model.BatchCreateFabricWorkspaceTagsRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.BatchCreateFabricWorkspaceTagsResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.BatchDeleteFabricWorkspaceTagsRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.BatchDeleteFabricWorkspaceTagsResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.CleanupModelRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.CleanupModelResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.CountTagFabricWorkspacesRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.CountTagFabricWorkspacesResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.CreateAgencyRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.CreateAgencyResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.CreateAgreementRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.CreateAgreementResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.CreateEndpointRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.CreateEndpointResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.CreateMessageNotificationPolicyRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.CreateMessageNotificationPolicyResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.CreateModelDefinitionRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.CreateModelDefinitionResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.CreateWorkspaceRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.CreateWorkspaceResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.DeleteAgencyRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.DeleteAgencyResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.DeleteAgreementRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.DeleteAgreementResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.DeleteEndpointRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.DeleteEndpointResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.DeleteMessageNotificationPolicyRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.DeleteMessageNotificationPolicyResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.DeleteModelVersionRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.DeleteModelVersionResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.DeleteWorkspaceRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.DeleteWorkspaceResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListAgencyRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListAgencyResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListBaseModelsRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListBaseModelsResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListEndpointsRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListEndpointsResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListFabricProjectTagsRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListFabricProjectTagsResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListFabricWorkspaceTagsRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListFabricWorkspaceTagsResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListFeaturesRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListFeaturesResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListMessageNotificationPolicyRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListMessageNotificationPolicyResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListModelVersionsRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListModelVersionsResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListModelsRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListModelsResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListSpecsRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListSpecsResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListTagFabricWorkspacesRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListTagFabricWorkspacesResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListWorkspacesRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ListWorkspacesResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ShowAdminHealthCheckRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ShowAdminHealthCheckResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ShowAgreementRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ShowAgreementResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ShowAgreementRuleRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ShowAgreementRuleResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ShowEndpointRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.ShowEndpointResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.SubscribeEndpointRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.SubscribeEndpointResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.UpdateEndpointRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.UpdateEndpointResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.UpdateMetricsConfigRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.UpdateMetricsConfigResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.UpdateModelDefinitionRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.UpdateModelDefinitionResponse;
import com.huaweicloud.sdk.dataartsfabric.v1.model.UpdateWorkspaceRequest;
import com.huaweicloud.sdk.dataartsfabric.v1.model.UpdateWorkspaceResponse;

import java.util.concurrent.CompletableFuture;

public class DataArtsFabricAsyncClient {

    protected HcClient hcClient;

    public DataArtsFabricAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DataArtsFabricAsyncClient> newBuilder() {
        ClientBuilder<DataArtsFabricAsyncClient> clientBuilder = new ClientBuilder<>(DataArtsFabricAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 创建服务委托
     *
     * 为用户自动创建服务所需要的服务委托。委托需要附加必需的权限策略才能使用，创建委托会自动附加必需的权限策略，也可以指定附加需要的权限策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgencyRequest 请求对象
     * @return CompletableFuture<CreateAgencyResponse>
     */
    public CompletableFuture<CreateAgencyResponse> createAgencyAsync(CreateAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricMeta.createAgency);
    }

    /**
     * 创建服务委托
     *
     * 为用户自动创建服务所需要的服务委托。委托需要附加必需的权限策略才能使用，创建委托会自动附加必需的权限策略，也可以指定附加需要的权限策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgencyRequest 请求对象
     * @return AsyncInvoker<CreateAgencyRequest, CreateAgencyResponse>
     */
    public AsyncInvoker<CreateAgencyRequest, CreateAgencyResponse> createAgencyAsyncInvoker(
        CreateAgencyRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricMeta.createAgency, hcClient);
    }

    /**
     * 删除服务委托
     *
     * 删除用户的服务委托权限。可以通过指定权限策略来删除委托中附加的权限策略，必需的权限策略无法被删除；如果不指定权限策略，会删除整个委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAgencyRequest 请求对象
     * @return CompletableFuture<DeleteAgencyResponse>
     */
    public CompletableFuture<DeleteAgencyResponse> deleteAgencyAsync(DeleteAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricMeta.deleteAgency);
    }

    /**
     * 删除服务委托
     *
     * 删除用户的服务委托权限。可以通过指定权限策略来删除委托中附加的权限策略，必需的权限策略无法被删除；如果不指定权限策略，会删除整个委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAgencyRequest 请求对象
     * @return AsyncInvoker<DeleteAgencyRequest, DeleteAgencyResponse>
     */
    public AsyncInvoker<DeleteAgencyRequest, DeleteAgencyResponse> deleteAgencyAsyncInvoker(
        DeleteAgencyRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricMeta.deleteAgency, hcClient);
    }

    /**
     * 查询服务委托
     *
     * 查询用用户服务委托详情是否满足系统所需权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgencyRequest 请求对象
     * @return CompletableFuture<ListAgencyResponse>
     */
    public CompletableFuture<ListAgencyResponse> listAgencyAsync(ListAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricMeta.listAgency);
    }

    /**
     * 查询服务委托
     *
     * 查询用用户服务委托详情是否满足系统所需权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgencyRequest 请求对象
     * @return AsyncInvoker<ListAgencyRequest, ListAgencyResponse>
     */
    public AsyncInvoker<ListAgencyRequest, ListAgencyResponse> listAgencyAsyncInvoker(ListAgencyRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricMeta.listAgency, hcClient);
    }

    /**
     * 注册租户协议
     *
     * 注册租户协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgreementRequest 请求对象
     * @return CompletableFuture<CreateAgreementResponse>
     */
    public CompletableFuture<CreateAgreementResponse> createAgreementAsync(CreateAgreementRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricMeta.createAgreement);
    }

    /**
     * 注册租户协议
     *
     * 注册租户协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgreementRequest 请求对象
     * @return AsyncInvoker<CreateAgreementRequest, CreateAgreementResponse>
     */
    public AsyncInvoker<CreateAgreementRequest, CreateAgreementResponse> createAgreementAsyncInvoker(
        CreateAgreementRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricMeta.createAgreement, hcClient);
    }

    /**
     * 删除用户注册协议
     *
     * 删除用户注册协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAgreementRequest 请求对象
     * @return CompletableFuture<DeleteAgreementResponse>
     */
    public CompletableFuture<DeleteAgreementResponse> deleteAgreementAsync(DeleteAgreementRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricMeta.deleteAgreement);
    }

    /**
     * 删除用户注册协议
     *
     * 删除用户注册协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAgreementRequest 请求对象
     * @return AsyncInvoker<DeleteAgreementRequest, DeleteAgreementResponse>
     */
    public AsyncInvoker<DeleteAgreementRequest, DeleteAgreementResponse> deleteAgreementAsyncInvoker(
        DeleteAgreementRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricMeta.deleteAgreement, hcClient);
    }

    /**
     * 查询用户是否注册协议
     *
     * 查询用户是否注册协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgreementRequest 请求对象
     * @return CompletableFuture<ShowAgreementResponse>
     */
    public CompletableFuture<ShowAgreementResponse> showAgreementAsync(ShowAgreementRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricMeta.showAgreement);
    }

    /**
     * 查询用户是否注册协议
     *
     * 查询用户是否注册协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgreementRequest 请求对象
     * @return AsyncInvoker<ShowAgreementRequest, ShowAgreementResponse>
     */
    public AsyncInvoker<ShowAgreementRequest, ShowAgreementResponse> showAgreementAsyncInvoker(
        ShowAgreementRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricMeta.showAgreement, hcClient);
    }

    /**
     * 查询系统协议
     *
     * 查询系统协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgreementRuleRequest 请求对象
     * @return CompletableFuture<ShowAgreementRuleResponse>
     */
    public CompletableFuture<ShowAgreementRuleResponse> showAgreementRuleAsync(ShowAgreementRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricMeta.showAgreementRule);
    }

    /**
     * 查询系统协议
     *
     * 查询系统协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgreementRuleRequest 请求对象
     * @return AsyncInvoker<ShowAgreementRuleRequest, ShowAgreementRuleResponse>
     */
    public AsyncInvoker<ShowAgreementRuleRequest, ShowAgreementRuleResponse> showAgreementRuleAsyncInvoker(
        ShowAgreementRuleRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricMeta.showAgreementRule, hcClient);
    }

    /**
     * 查询用户支持特性
     *
     * 查询用户支持特性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFeaturesRequest 请求对象
     * @return CompletableFuture<ListFeaturesResponse>
     */
    public CompletableFuture<ListFeaturesResponse> listFeaturesAsync(ListFeaturesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricMeta.listFeatures);
    }

    /**
     * 查询用户支持特性
     *
     * 查询用户支持特性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFeaturesRequest 请求对象
     * @return AsyncInvoker<ListFeaturesRequest, ListFeaturesResponse>
     */
    public AsyncInvoker<ListFeaturesRequest, ListFeaturesResponse> listFeaturesAsyncInvoker(
        ListFeaturesRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricMeta.listFeatures, hcClient);
    }

    /**
     * 创建Endpoint
     *
     * 创建Endpoint
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEndpointRequest 请求对象
     * @return CompletableFuture<CreateEndpointResponse>
     */
    public CompletableFuture<CreateEndpointResponse> createEndpointAsync(CreateEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricMeta.createEndpoint);
    }

    /**
     * 创建Endpoint
     *
     * 创建Endpoint
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEndpointRequest 请求对象
     * @return AsyncInvoker<CreateEndpointRequest, CreateEndpointResponse>
     */
    public AsyncInvoker<CreateEndpointRequest, CreateEndpointResponse> createEndpointAsyncInvoker(
        CreateEndpointRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricMeta.createEndpoint, hcClient);
    }

    /**
     * 删除endpioint
     *
     * 删除endpioint
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEndpointRequest 请求对象
     * @return CompletableFuture<DeleteEndpointResponse>
     */
    public CompletableFuture<DeleteEndpointResponse> deleteEndpointAsync(DeleteEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricMeta.deleteEndpoint);
    }

    /**
     * 删除endpioint
     *
     * 删除endpioint
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEndpointRequest 请求对象
     * @return AsyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse>
     */
    public AsyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse> deleteEndpointAsyncInvoker(
        DeleteEndpointRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricMeta.deleteEndpoint, hcClient);
    }

    /**
     * 查询Endpoint列表
     *
     * 查询Endpoint列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointsRequest 请求对象
     * @return CompletableFuture<ListEndpointsResponse>
     */
    public CompletableFuture<ListEndpointsResponse> listEndpointsAsync(ListEndpointsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricMeta.listEndpoints);
    }

    /**
     * 查询Endpoint列表
     *
     * 查询Endpoint列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointsRequest 请求对象
     * @return AsyncInvoker<ListEndpointsRequest, ListEndpointsResponse>
     */
    public AsyncInvoker<ListEndpointsRequest, ListEndpointsResponse> listEndpointsAsyncInvoker(
        ListEndpointsRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricMeta.listEndpoints, hcClient);
    }

    /**
     * 查询endpioint详情
     *
     * 查询endpioint详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEndpointRequest 请求对象
     * @return CompletableFuture<ShowEndpointResponse>
     */
    public CompletableFuture<ShowEndpointResponse> showEndpointAsync(ShowEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricMeta.showEndpoint);
    }

    /**
     * 查询endpioint详情
     *
     * 查询endpioint详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEndpointRequest 请求对象
     * @return AsyncInvoker<ShowEndpointRequest, ShowEndpointResponse>
     */
    public AsyncInvoker<ShowEndpointRequest, ShowEndpointResponse> showEndpointAsyncInvoker(
        ShowEndpointRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricMeta.showEndpoint, hcClient);
    }

    /**
     * 订阅Endpoint
     *
     * 在用户Workspace下订阅Endpoint（公共Endpoint场景）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SubscribeEndpointRequest 请求对象
     * @return CompletableFuture<SubscribeEndpointResponse>
     */
    public CompletableFuture<SubscribeEndpointResponse> subscribeEndpointAsync(SubscribeEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricMeta.subscribeEndpoint);
    }

    /**
     * 订阅Endpoint
     *
     * 在用户Workspace下订阅Endpoint（公共Endpoint场景）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SubscribeEndpointRequest 请求对象
     * @return AsyncInvoker<SubscribeEndpointRequest, SubscribeEndpointResponse>
     */
    public AsyncInvoker<SubscribeEndpointRequest, SubscribeEndpointResponse> subscribeEndpointAsyncInvoker(
        SubscribeEndpointRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricMeta.subscribeEndpoint, hcClient);
    }

    /**
     * 修改Endpoint
     *
     * 修改Endpoint
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointRequest 请求对象
     * @return CompletableFuture<UpdateEndpointResponse>
     */
    public CompletableFuture<UpdateEndpointResponse> updateEndpointAsync(UpdateEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricMeta.updateEndpoint);
    }

    /**
     * 修改Endpoint
     *
     * 修改Endpoint
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointRequest 请求对象
     * @return AsyncInvoker<UpdateEndpointRequest, UpdateEndpointResponse>
     */
    public AsyncInvoker<UpdateEndpointRequest, UpdateEndpointResponse> updateEndpointAsyncInvoker(
        UpdateEndpointRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricMeta.updateEndpoint, hcClient);
    }

    /**
     * 健康检查
     *
     * 服务健康检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAdminHealthCheckRequest 请求对象
     * @return CompletableFuture<ShowAdminHealthCheckResponse>
     */
    public CompletableFuture<ShowAdminHealthCheckResponse> showAdminHealthCheckAsync(
        ShowAdminHealthCheckRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricMeta.showAdminHealthCheck);
    }

    /**
     * 健康检查
     *
     * 服务健康检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAdminHealthCheckRequest 请求对象
     * @return AsyncInvoker<ShowAdminHealthCheckRequest, ShowAdminHealthCheckResponse>
     */
    public AsyncInvoker<ShowAdminHealthCheckRequest, ShowAdminHealthCheckResponse> showAdminHealthCheckAsyncInvoker(
        ShowAdminHealthCheckRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricMeta.showAdminHealthCheck, hcClient);
    }

    /**
     * 创建消息通知策略
     *
     * 创建消息通知策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMessageNotificationPolicyRequest 请求对象
     * @return CompletableFuture<CreateMessageNotificationPolicyResponse>
     */
    public CompletableFuture<CreateMessageNotificationPolicyResponse> createMessageNotificationPolicyAsync(
        CreateMessageNotificationPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricMeta.createMessageNotificationPolicy);
    }

    /**
     * 创建消息通知策略
     *
     * 创建消息通知策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMessageNotificationPolicyRequest 请求对象
     * @return AsyncInvoker<CreateMessageNotificationPolicyRequest, CreateMessageNotificationPolicyResponse>
     */
    public AsyncInvoker<CreateMessageNotificationPolicyRequest, CreateMessageNotificationPolicyResponse> createMessageNotificationPolicyAsyncInvoker(
        CreateMessageNotificationPolicyRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricMeta.createMessageNotificationPolicy, hcClient);
    }

    /**
     * 删除消息通知策略
     *
     * 删除消息通知策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMessageNotificationPolicyRequest 请求对象
     * @return CompletableFuture<DeleteMessageNotificationPolicyResponse>
     */
    public CompletableFuture<DeleteMessageNotificationPolicyResponse> deleteMessageNotificationPolicyAsync(
        DeleteMessageNotificationPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricMeta.deleteMessageNotificationPolicy);
    }

    /**
     * 删除消息通知策略
     *
     * 删除消息通知策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMessageNotificationPolicyRequest 请求对象
     * @return AsyncInvoker<DeleteMessageNotificationPolicyRequest, DeleteMessageNotificationPolicyResponse>
     */
    public AsyncInvoker<DeleteMessageNotificationPolicyRequest, DeleteMessageNotificationPolicyResponse> deleteMessageNotificationPolicyAsyncInvoker(
        DeleteMessageNotificationPolicyRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricMeta.deleteMessageNotificationPolicy, hcClient);
    }

    /**
     * 查询消息通知策略列表
     *
     * 查询消息通知策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessageNotificationPolicyRequest 请求对象
     * @return CompletableFuture<ListMessageNotificationPolicyResponse>
     */
    public CompletableFuture<ListMessageNotificationPolicyResponse> listMessageNotificationPolicyAsync(
        ListMessageNotificationPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricMeta.listMessageNotificationPolicy);
    }

    /**
     * 查询消息通知策略列表
     *
     * 查询消息通知策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessageNotificationPolicyRequest 请求对象
     * @return AsyncInvoker<ListMessageNotificationPolicyRequest, ListMessageNotificationPolicyResponse>
     */
    public AsyncInvoker<ListMessageNotificationPolicyRequest, ListMessageNotificationPolicyResponse> listMessageNotificationPolicyAsyncInvoker(
        ListMessageNotificationPolicyRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricMeta.listMessageNotificationPolicy, hcClient);
    }

    /**
     * 更新AOM监控采集配置
     *
     * 更新AOM监控采集配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMetricsConfigRequest 请求对象
     * @return CompletableFuture<UpdateMetricsConfigResponse>
     */
    public CompletableFuture<UpdateMetricsConfigResponse> updateMetricsConfigAsync(UpdateMetricsConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricMeta.updateMetricsConfig);
    }

    /**
     * 更新AOM监控采集配置
     *
     * 更新AOM监控采集配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMetricsConfigRequest 请求对象
     * @return AsyncInvoker<UpdateMetricsConfigRequest, UpdateMetricsConfigResponse>
     */
    public AsyncInvoker<UpdateMetricsConfigRequest, UpdateMetricsConfigResponse> updateMetricsConfigAsyncInvoker(
        UpdateMetricsConfigRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricMeta.updateMetricsConfig, hcClient);
    }

    /**
     * 删除未使用的模型定义
     *
     * 清理未使用的模型定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CleanupModelRequest 请求对象
     * @return CompletableFuture<CleanupModelResponse>
     */
    public CompletableFuture<CleanupModelResponse> cleanupModelAsync(CleanupModelRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricMeta.cleanupModel);
    }

    /**
     * 删除未使用的模型定义
     *
     * 清理未使用的模型定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CleanupModelRequest 请求对象
     * @return AsyncInvoker<CleanupModelRequest, CleanupModelResponse>
     */
    public AsyncInvoker<CleanupModelRequest, CleanupModelResponse> cleanupModelAsyncInvoker(
        CleanupModelRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricMeta.cleanupModel, hcClient);
    }

    /**
     * 创建模型
     *
     * 创建模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateModelDefinitionRequest 请求对象
     * @return CompletableFuture<CreateModelDefinitionResponse>
     */
    public CompletableFuture<CreateModelDefinitionResponse> createModelDefinitionAsync(
        CreateModelDefinitionRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricMeta.createModelDefinition);
    }

    /**
     * 创建模型
     *
     * 创建模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateModelDefinitionRequest 请求对象
     * @return AsyncInvoker<CreateModelDefinitionRequest, CreateModelDefinitionResponse>
     */
    public AsyncInvoker<CreateModelDefinitionRequest, CreateModelDefinitionResponse> createModelDefinitionAsyncInvoker(
        CreateModelDefinitionRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricMeta.createModelDefinition, hcClient);
    }

    /**
     * 删除模型版本
     *
     * 删除模型版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteModelVersionRequest 请求对象
     * @return CompletableFuture<DeleteModelVersionResponse>
     */
    public CompletableFuture<DeleteModelVersionResponse> deleteModelVersionAsync(DeleteModelVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricMeta.deleteModelVersion);
    }

    /**
     * 删除模型版本
     *
     * 删除模型版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteModelVersionRequest 请求对象
     * @return AsyncInvoker<DeleteModelVersionRequest, DeleteModelVersionResponse>
     */
    public AsyncInvoker<DeleteModelVersionRequest, DeleteModelVersionResponse> deleteModelVersionAsyncInvoker(
        DeleteModelVersionRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricMeta.deleteModelVersion, hcClient);
    }

    /**
     * 列举基模型
     *
     * 列举基模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBaseModelsRequest 请求对象
     * @return CompletableFuture<ListBaseModelsResponse>
     */
    public CompletableFuture<ListBaseModelsResponse> listBaseModelsAsync(ListBaseModelsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricMeta.listBaseModels);
    }

    /**
     * 列举基模型
     *
     * 列举基模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBaseModelsRequest 请求对象
     * @return AsyncInvoker<ListBaseModelsRequest, ListBaseModelsResponse>
     */
    public AsyncInvoker<ListBaseModelsRequest, ListBaseModelsResponse> listBaseModelsAsyncInvoker(
        ListBaseModelsRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricMeta.listBaseModels, hcClient);
    }

    /**
     * 查询模型的版本列表
     *
     * 查询模型的版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListModelVersionsRequest 请求对象
     * @return CompletableFuture<ListModelVersionsResponse>
     */
    public CompletableFuture<ListModelVersionsResponse> listModelVersionsAsync(ListModelVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricMeta.listModelVersions);
    }

    /**
     * 查询模型的版本列表
     *
     * 查询模型的版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListModelVersionsRequest 请求对象
     * @return AsyncInvoker<ListModelVersionsRequest, ListModelVersionsResponse>
     */
    public AsyncInvoker<ListModelVersionsRequest, ListModelVersionsResponse> listModelVersionsAsyncInvoker(
        ListModelVersionsRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricMeta.listModelVersions, hcClient);
    }

    /**
     * 列举模型
     *
     * 列举模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListModelsRequest 请求对象
     * @return CompletableFuture<ListModelsResponse>
     */
    public CompletableFuture<ListModelsResponse> listModelsAsync(ListModelsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricMeta.listModels);
    }

    /**
     * 列举模型
     *
     * 列举模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListModelsRequest 请求对象
     * @return AsyncInvoker<ListModelsRequest, ListModelsResponse>
     */
    public AsyncInvoker<ListModelsRequest, ListModelsResponse> listModelsAsyncInvoker(ListModelsRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricMeta.listModels, hcClient);
    }

    /**
     * 更新模型
     *
     * 更新模型，会生成新版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateModelDefinitionRequest 请求对象
     * @return CompletableFuture<UpdateModelDefinitionResponse>
     */
    public CompletableFuture<UpdateModelDefinitionResponse> updateModelDefinitionAsync(
        UpdateModelDefinitionRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricMeta.updateModelDefinition);
    }

    /**
     * 更新模型
     *
     * 更新模型，会生成新版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateModelDefinitionRequest 请求对象
     * @return AsyncInvoker<UpdateModelDefinitionRequest, UpdateModelDefinitionResponse>
     */
    public AsyncInvoker<UpdateModelDefinitionRequest, UpdateModelDefinitionResponse> updateModelDefinitionAsyncInvoker(
        UpdateModelDefinitionRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricMeta.updateModelDefinition, hcClient);
    }

    /**
     * 查询服务规格列表
     *
     * 查询服务规格列表，购买计算资源使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSpecsRequest 请求对象
     * @return CompletableFuture<ListSpecsResponse>
     */
    public CompletableFuture<ListSpecsResponse> listSpecsAsync(ListSpecsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricMeta.listSpecs);
    }

    /**
     * 查询服务规格列表
     *
     * 查询服务规格列表，购买计算资源使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSpecsRequest 请求对象
     * @return AsyncInvoker<ListSpecsRequest, ListSpecsResponse>
     */
    public AsyncInvoker<ListSpecsRequest, ListSpecsResponse> listSpecsAsyncInvoker(ListSpecsRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricMeta.listSpecs, hcClient);
    }

    /**
     * 批量打资源标签
     *
     * 批量打资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateFabricWorkspaceTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateFabricWorkspaceTagsResponse>
     */
    public CompletableFuture<BatchCreateFabricWorkspaceTagsResponse> batchCreateFabricWorkspaceTagsAsync(
        BatchCreateFabricWorkspaceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricMeta.batchCreateFabricWorkspaceTags);
    }

    /**
     * 批量打资源标签
     *
     * 批量打资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateFabricWorkspaceTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateFabricWorkspaceTagsRequest, BatchCreateFabricWorkspaceTagsResponse>
     */
    public AsyncInvoker<BatchCreateFabricWorkspaceTagsRequest, BatchCreateFabricWorkspaceTagsResponse> batchCreateFabricWorkspaceTagsAsyncInvoker(
        BatchCreateFabricWorkspaceTagsRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricMeta.batchCreateFabricWorkspaceTags, hcClient);
    }

    /**
     * 批量删除资源标签
     *
     * 批量删除资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteFabricWorkspaceTagsRequest 请求对象
     * @return CompletableFuture<BatchDeleteFabricWorkspaceTagsResponse>
     */
    public CompletableFuture<BatchDeleteFabricWorkspaceTagsResponse> batchDeleteFabricWorkspaceTagsAsync(
        BatchDeleteFabricWorkspaceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricMeta.batchDeleteFabricWorkspaceTags);
    }

    /**
     * 批量删除资源标签
     *
     * 批量删除资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteFabricWorkspaceTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteFabricWorkspaceTagsRequest, BatchDeleteFabricWorkspaceTagsResponse>
     */
    public AsyncInvoker<BatchDeleteFabricWorkspaceTagsRequest, BatchDeleteFabricWorkspaceTagsResponse> batchDeleteFabricWorkspaceTagsAsyncInvoker(
        BatchDeleteFabricWorkspaceTagsRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricMeta.batchDeleteFabricWorkspaceTags, hcClient);
    }

    /**
     * 查询资源实例数量
     *
     * 查询资源实例数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountTagFabricWorkspacesRequest 请求对象
     * @return CompletableFuture<CountTagFabricWorkspacesResponse>
     */
    public CompletableFuture<CountTagFabricWorkspacesResponse> countTagFabricWorkspacesAsync(
        CountTagFabricWorkspacesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricMeta.countTagFabricWorkspaces);
    }

    /**
     * 查询资源实例数量
     *
     * 查询资源实例数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountTagFabricWorkspacesRequest 请求对象
     * @return AsyncInvoker<CountTagFabricWorkspacesRequest, CountTagFabricWorkspacesResponse>
     */
    public AsyncInvoker<CountTagFabricWorkspacesRequest, CountTagFabricWorkspacesResponse> countTagFabricWorkspacesAsyncInvoker(
        CountTagFabricWorkspacesRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricMeta.countTagFabricWorkspaces, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFabricProjectTagsRequest 请求对象
     * @return CompletableFuture<ListFabricProjectTagsResponse>
     */
    public CompletableFuture<ListFabricProjectTagsResponse> listFabricProjectTagsAsync(
        ListFabricProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricMeta.listFabricProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFabricProjectTagsRequest 请求对象
     * @return AsyncInvoker<ListFabricProjectTagsRequest, ListFabricProjectTagsResponse>
     */
    public AsyncInvoker<ListFabricProjectTagsRequest, ListFabricProjectTagsResponse> listFabricProjectTagsAsyncInvoker(
        ListFabricProjectTagsRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricMeta.listFabricProjectTags, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFabricWorkspaceTagsRequest 请求对象
     * @return CompletableFuture<ListFabricWorkspaceTagsResponse>
     */
    public CompletableFuture<ListFabricWorkspaceTagsResponse> listFabricWorkspaceTagsAsync(
        ListFabricWorkspaceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricMeta.listFabricWorkspaceTags);
    }

    /**
     * 查询资源标签
     *
     * 查询资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFabricWorkspaceTagsRequest 请求对象
     * @return AsyncInvoker<ListFabricWorkspaceTagsRequest, ListFabricWorkspaceTagsResponse>
     */
    public AsyncInvoker<ListFabricWorkspaceTagsRequest, ListFabricWorkspaceTagsResponse> listFabricWorkspaceTagsAsyncInvoker(
        ListFabricWorkspaceTagsRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricMeta.listFabricWorkspaceTags, hcClient);
    }

    /**
     * 查询资源实例列表
     *
     * 查询资源实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagFabricWorkspacesRequest 请求对象
     * @return CompletableFuture<ListTagFabricWorkspacesResponse>
     */
    public CompletableFuture<ListTagFabricWorkspacesResponse> listTagFabricWorkspacesAsync(
        ListTagFabricWorkspacesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricMeta.listTagFabricWorkspaces);
    }

    /**
     * 查询资源实例列表
     *
     * 查询资源实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagFabricWorkspacesRequest 请求对象
     * @return AsyncInvoker<ListTagFabricWorkspacesRequest, ListTagFabricWorkspacesResponse>
     */
    public AsyncInvoker<ListTagFabricWorkspacesRequest, ListTagFabricWorkspacesResponse> listTagFabricWorkspacesAsyncInvoker(
        ListTagFabricWorkspacesRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricMeta.listTagFabricWorkspaces, hcClient);
    }

    /**
     * 创建Workspace
     *
     * Create workspace
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkspaceRequest 请求对象
     * @return CompletableFuture<CreateWorkspaceResponse>
     */
    public CompletableFuture<CreateWorkspaceResponse> createWorkspaceAsync(CreateWorkspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricMeta.createWorkspace);
    }

    /**
     * 创建Workspace
     *
     * Create workspace
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkspaceRequest 请求对象
     * @return AsyncInvoker<CreateWorkspaceRequest, CreateWorkspaceResponse>
     */
    public AsyncInvoker<CreateWorkspaceRequest, CreateWorkspaceResponse> createWorkspaceAsyncInvoker(
        CreateWorkspaceRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricMeta.createWorkspace, hcClient);
    }

    /**
     * 删除Workspace
     *
     * 删除Workspace
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkspaceRequest 请求对象
     * @return CompletableFuture<DeleteWorkspaceResponse>
     */
    public CompletableFuture<DeleteWorkspaceResponse> deleteWorkspaceAsync(DeleteWorkspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricMeta.deleteWorkspace);
    }

    /**
     * 删除Workspace
     *
     * 删除Workspace
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkspaceRequest 请求对象
     * @return AsyncInvoker<DeleteWorkspaceRequest, DeleteWorkspaceResponse>
     */
    public AsyncInvoker<DeleteWorkspaceRequest, DeleteWorkspaceResponse> deleteWorkspaceAsyncInvoker(
        DeleteWorkspaceRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricMeta.deleteWorkspace, hcClient);
    }

    /**
     * 查询Workspace列表
     *
     * 查询Workspace列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkspacesRequest 请求对象
     * @return CompletableFuture<ListWorkspacesResponse>
     */
    public CompletableFuture<ListWorkspacesResponse> listWorkspacesAsync(ListWorkspacesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricMeta.listWorkspaces);
    }

    /**
     * 查询Workspace列表
     *
     * 查询Workspace列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkspacesRequest 请求对象
     * @return AsyncInvoker<ListWorkspacesRequest, ListWorkspacesResponse>
     */
    public AsyncInvoker<ListWorkspacesRequest, ListWorkspacesResponse> listWorkspacesAsyncInvoker(
        ListWorkspacesRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricMeta.listWorkspaces, hcClient);
    }

    /**
     * 更新Workspace
     *
     * 更新Workspace
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkspaceRequest 请求对象
     * @return CompletableFuture<UpdateWorkspaceResponse>
     */
    public CompletableFuture<UpdateWorkspaceResponse> updateWorkspaceAsync(UpdateWorkspaceRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricMeta.updateWorkspace);
    }

    /**
     * 更新Workspace
     *
     * 更新Workspace
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkspaceRequest 请求对象
     * @return AsyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse>
     */
    public AsyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse> updateWorkspaceAsyncInvoker(
        UpdateWorkspaceRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricMeta.updateWorkspace, hcClient);
    }

}

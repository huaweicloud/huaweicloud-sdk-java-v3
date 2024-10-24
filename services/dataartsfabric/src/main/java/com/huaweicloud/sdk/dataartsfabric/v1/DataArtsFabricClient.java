package com.huaweicloud.sdk.dataartsfabric.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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

public class DataArtsFabricClient {

    protected HcClient hcClient;

    public DataArtsFabricClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DataArtsFabricClient> newBuilder() {
        ClientBuilder<DataArtsFabricClient> clientBuilder = new ClientBuilder<>(DataArtsFabricClient::new);
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
     * @return CreateAgencyResponse
     */
    public CreateAgencyResponse createAgency(CreateAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricMeta.createAgency);
    }

    /**
     * 创建服务委托
     *
     * 为用户自动创建服务所需要的服务委托。委托需要附加必需的权限策略才能使用，创建委托会自动附加必需的权限策略，也可以指定附加需要的权限策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgencyRequest 请求对象
     * @return SyncInvoker<CreateAgencyRequest, CreateAgencyResponse>
     */
    public SyncInvoker<CreateAgencyRequest, CreateAgencyResponse> createAgencyInvoker(CreateAgencyRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricMeta.createAgency, hcClient);
    }

    /**
     * 删除服务委托
     *
     * 删除用户的服务委托权限。可以通过指定权限策略来删除委托中附加的权限策略，必需的权限策略无法被删除；如果不指定权限策略，会删除整个委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAgencyRequest 请求对象
     * @return DeleteAgencyResponse
     */
    public DeleteAgencyResponse deleteAgency(DeleteAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricMeta.deleteAgency);
    }

    /**
     * 删除服务委托
     *
     * 删除用户的服务委托权限。可以通过指定权限策略来删除委托中附加的权限策略，必需的权限策略无法被删除；如果不指定权限策略，会删除整个委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAgencyRequest 请求对象
     * @return SyncInvoker<DeleteAgencyRequest, DeleteAgencyResponse>
     */
    public SyncInvoker<DeleteAgencyRequest, DeleteAgencyResponse> deleteAgencyInvoker(DeleteAgencyRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricMeta.deleteAgency, hcClient);
    }

    /**
     * 查询服务委托
     *
     * 查询用用户服务委托详情是否满足系统所需权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgencyRequest 请求对象
     * @return ListAgencyResponse
     */
    public ListAgencyResponse listAgency(ListAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricMeta.listAgency);
    }

    /**
     * 查询服务委托
     *
     * 查询用用户服务委托详情是否满足系统所需权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgencyRequest 请求对象
     * @return SyncInvoker<ListAgencyRequest, ListAgencyResponse>
     */
    public SyncInvoker<ListAgencyRequest, ListAgencyResponse> listAgencyInvoker(ListAgencyRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricMeta.listAgency, hcClient);
    }

    /**
     * 注册租户协议
     *
     * 注册租户协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgreementRequest 请求对象
     * @return CreateAgreementResponse
     */
    public CreateAgreementResponse createAgreement(CreateAgreementRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricMeta.createAgreement);
    }

    /**
     * 注册租户协议
     *
     * 注册租户协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgreementRequest 请求对象
     * @return SyncInvoker<CreateAgreementRequest, CreateAgreementResponse>
     */
    public SyncInvoker<CreateAgreementRequest, CreateAgreementResponse> createAgreementInvoker(
        CreateAgreementRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricMeta.createAgreement, hcClient);
    }

    /**
     * 删除用户注册协议
     *
     * 删除用户注册协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAgreementRequest 请求对象
     * @return DeleteAgreementResponse
     */
    public DeleteAgreementResponse deleteAgreement(DeleteAgreementRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricMeta.deleteAgreement);
    }

    /**
     * 删除用户注册协议
     *
     * 删除用户注册协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAgreementRequest 请求对象
     * @return SyncInvoker<DeleteAgreementRequest, DeleteAgreementResponse>
     */
    public SyncInvoker<DeleteAgreementRequest, DeleteAgreementResponse> deleteAgreementInvoker(
        DeleteAgreementRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricMeta.deleteAgreement, hcClient);
    }

    /**
     * 查询用户是否注册协议
     *
     * 查询用户是否注册协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgreementRequest 请求对象
     * @return ShowAgreementResponse
     */
    public ShowAgreementResponse showAgreement(ShowAgreementRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricMeta.showAgreement);
    }

    /**
     * 查询用户是否注册协议
     *
     * 查询用户是否注册协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgreementRequest 请求对象
     * @return SyncInvoker<ShowAgreementRequest, ShowAgreementResponse>
     */
    public SyncInvoker<ShowAgreementRequest, ShowAgreementResponse> showAgreementInvoker(ShowAgreementRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricMeta.showAgreement, hcClient);
    }

    /**
     * 查询系统协议
     *
     * 查询系统协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgreementRuleRequest 请求对象
     * @return ShowAgreementRuleResponse
     */
    public ShowAgreementRuleResponse showAgreementRule(ShowAgreementRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricMeta.showAgreementRule);
    }

    /**
     * 查询系统协议
     *
     * 查询系统协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgreementRuleRequest 请求对象
     * @return SyncInvoker<ShowAgreementRuleRequest, ShowAgreementRuleResponse>
     */
    public SyncInvoker<ShowAgreementRuleRequest, ShowAgreementRuleResponse> showAgreementRuleInvoker(
        ShowAgreementRuleRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricMeta.showAgreementRule, hcClient);
    }

    /**
     * 查询用户支持特性
     *
     * 查询用户支持特性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFeaturesRequest 请求对象
     * @return ListFeaturesResponse
     */
    public ListFeaturesResponse listFeatures(ListFeaturesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricMeta.listFeatures);
    }

    /**
     * 查询用户支持特性
     *
     * 查询用户支持特性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFeaturesRequest 请求对象
     * @return SyncInvoker<ListFeaturesRequest, ListFeaturesResponse>
     */
    public SyncInvoker<ListFeaturesRequest, ListFeaturesResponse> listFeaturesInvoker(ListFeaturesRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricMeta.listFeatures, hcClient);
    }

    /**
     * 创建Endpoint
     *
     * 创建Endpoint
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEndpointRequest 请求对象
     * @return CreateEndpointResponse
     */
    public CreateEndpointResponse createEndpoint(CreateEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricMeta.createEndpoint);
    }

    /**
     * 创建Endpoint
     *
     * 创建Endpoint
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEndpointRequest 请求对象
     * @return SyncInvoker<CreateEndpointRequest, CreateEndpointResponse>
     */
    public SyncInvoker<CreateEndpointRequest, CreateEndpointResponse> createEndpointInvoker(
        CreateEndpointRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricMeta.createEndpoint, hcClient);
    }

    /**
     * 删除endpioint
     *
     * 删除endpioint
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEndpointRequest 请求对象
     * @return DeleteEndpointResponse
     */
    public DeleteEndpointResponse deleteEndpoint(DeleteEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricMeta.deleteEndpoint);
    }

    /**
     * 删除endpioint
     *
     * 删除endpioint
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEndpointRequest 请求对象
     * @return SyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse>
     */
    public SyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse> deleteEndpointInvoker(
        DeleteEndpointRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricMeta.deleteEndpoint, hcClient);
    }

    /**
     * 查询Endpoint列表
     *
     * 查询Endpoint列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointsRequest 请求对象
     * @return ListEndpointsResponse
     */
    public ListEndpointsResponse listEndpoints(ListEndpointsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricMeta.listEndpoints);
    }

    /**
     * 查询Endpoint列表
     *
     * 查询Endpoint列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointsRequest 请求对象
     * @return SyncInvoker<ListEndpointsRequest, ListEndpointsResponse>
     */
    public SyncInvoker<ListEndpointsRequest, ListEndpointsResponse> listEndpointsInvoker(ListEndpointsRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricMeta.listEndpoints, hcClient);
    }

    /**
     * 查询endpioint详情
     *
     * 查询endpioint详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEndpointRequest 请求对象
     * @return ShowEndpointResponse
     */
    public ShowEndpointResponse showEndpoint(ShowEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricMeta.showEndpoint);
    }

    /**
     * 查询endpioint详情
     *
     * 查询endpioint详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEndpointRequest 请求对象
     * @return SyncInvoker<ShowEndpointRequest, ShowEndpointResponse>
     */
    public SyncInvoker<ShowEndpointRequest, ShowEndpointResponse> showEndpointInvoker(ShowEndpointRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricMeta.showEndpoint, hcClient);
    }

    /**
     * 订阅Endpoint
     *
     * 在用户Workspace下订阅Endpoint（公共Endpoint场景）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SubscribeEndpointRequest 请求对象
     * @return SubscribeEndpointResponse
     */
    public SubscribeEndpointResponse subscribeEndpoint(SubscribeEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricMeta.subscribeEndpoint);
    }

    /**
     * 订阅Endpoint
     *
     * 在用户Workspace下订阅Endpoint（公共Endpoint场景）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SubscribeEndpointRequest 请求对象
     * @return SyncInvoker<SubscribeEndpointRequest, SubscribeEndpointResponse>
     */
    public SyncInvoker<SubscribeEndpointRequest, SubscribeEndpointResponse> subscribeEndpointInvoker(
        SubscribeEndpointRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricMeta.subscribeEndpoint, hcClient);
    }

    /**
     * 修改Endpoint
     *
     * 修改Endpoint
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointRequest 请求对象
     * @return UpdateEndpointResponse
     */
    public UpdateEndpointResponse updateEndpoint(UpdateEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricMeta.updateEndpoint);
    }

    /**
     * 修改Endpoint
     *
     * 修改Endpoint
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointRequest 请求对象
     * @return SyncInvoker<UpdateEndpointRequest, UpdateEndpointResponse>
     */
    public SyncInvoker<UpdateEndpointRequest, UpdateEndpointResponse> updateEndpointInvoker(
        UpdateEndpointRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricMeta.updateEndpoint, hcClient);
    }

    /**
     * 健康检查
     *
     * 服务健康检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAdminHealthCheckRequest 请求对象
     * @return ShowAdminHealthCheckResponse
     */
    public ShowAdminHealthCheckResponse showAdminHealthCheck(ShowAdminHealthCheckRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricMeta.showAdminHealthCheck);
    }

    /**
     * 健康检查
     *
     * 服务健康检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAdminHealthCheckRequest 请求对象
     * @return SyncInvoker<ShowAdminHealthCheckRequest, ShowAdminHealthCheckResponse>
     */
    public SyncInvoker<ShowAdminHealthCheckRequest, ShowAdminHealthCheckResponse> showAdminHealthCheckInvoker(
        ShowAdminHealthCheckRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricMeta.showAdminHealthCheck, hcClient);
    }

    /**
     * 创建消息通知策略
     *
     * 创建消息通知策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMessageNotificationPolicyRequest 请求对象
     * @return CreateMessageNotificationPolicyResponse
     */
    public CreateMessageNotificationPolicyResponse createMessageNotificationPolicy(
        CreateMessageNotificationPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricMeta.createMessageNotificationPolicy);
    }

    /**
     * 创建消息通知策略
     *
     * 创建消息通知策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMessageNotificationPolicyRequest 请求对象
     * @return SyncInvoker<CreateMessageNotificationPolicyRequest, CreateMessageNotificationPolicyResponse>
     */
    public SyncInvoker<CreateMessageNotificationPolicyRequest, CreateMessageNotificationPolicyResponse> createMessageNotificationPolicyInvoker(
        CreateMessageNotificationPolicyRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricMeta.createMessageNotificationPolicy, hcClient);
    }

    /**
     * 删除消息通知策略
     *
     * 删除消息通知策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMessageNotificationPolicyRequest 请求对象
     * @return DeleteMessageNotificationPolicyResponse
     */
    public DeleteMessageNotificationPolicyResponse deleteMessageNotificationPolicy(
        DeleteMessageNotificationPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricMeta.deleteMessageNotificationPolicy);
    }

    /**
     * 删除消息通知策略
     *
     * 删除消息通知策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMessageNotificationPolicyRequest 请求对象
     * @return SyncInvoker<DeleteMessageNotificationPolicyRequest, DeleteMessageNotificationPolicyResponse>
     */
    public SyncInvoker<DeleteMessageNotificationPolicyRequest, DeleteMessageNotificationPolicyResponse> deleteMessageNotificationPolicyInvoker(
        DeleteMessageNotificationPolicyRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricMeta.deleteMessageNotificationPolicy, hcClient);
    }

    /**
     * 查询消息通知策略列表
     *
     * 查询消息通知策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessageNotificationPolicyRequest 请求对象
     * @return ListMessageNotificationPolicyResponse
     */
    public ListMessageNotificationPolicyResponse listMessageNotificationPolicy(
        ListMessageNotificationPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricMeta.listMessageNotificationPolicy);
    }

    /**
     * 查询消息通知策略列表
     *
     * 查询消息通知策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessageNotificationPolicyRequest 请求对象
     * @return SyncInvoker<ListMessageNotificationPolicyRequest, ListMessageNotificationPolicyResponse>
     */
    public SyncInvoker<ListMessageNotificationPolicyRequest, ListMessageNotificationPolicyResponse> listMessageNotificationPolicyInvoker(
        ListMessageNotificationPolicyRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricMeta.listMessageNotificationPolicy, hcClient);
    }

    /**
     * 更新AOM监控采集配置
     *
     * 更新AOM监控采集配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMetricsConfigRequest 请求对象
     * @return UpdateMetricsConfigResponse
     */
    public UpdateMetricsConfigResponse updateMetricsConfig(UpdateMetricsConfigRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricMeta.updateMetricsConfig);
    }

    /**
     * 更新AOM监控采集配置
     *
     * 更新AOM监控采集配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMetricsConfigRequest 请求对象
     * @return SyncInvoker<UpdateMetricsConfigRequest, UpdateMetricsConfigResponse>
     */
    public SyncInvoker<UpdateMetricsConfigRequest, UpdateMetricsConfigResponse> updateMetricsConfigInvoker(
        UpdateMetricsConfigRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricMeta.updateMetricsConfig, hcClient);
    }

    /**
     * 删除未使用的模型定义
     *
     * 清理未使用的模型定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CleanupModelRequest 请求对象
     * @return CleanupModelResponse
     */
    public CleanupModelResponse cleanupModel(CleanupModelRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricMeta.cleanupModel);
    }

    /**
     * 删除未使用的模型定义
     *
     * 清理未使用的模型定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CleanupModelRequest 请求对象
     * @return SyncInvoker<CleanupModelRequest, CleanupModelResponse>
     */
    public SyncInvoker<CleanupModelRequest, CleanupModelResponse> cleanupModelInvoker(CleanupModelRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricMeta.cleanupModel, hcClient);
    }

    /**
     * 创建模型
     *
     * 创建模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateModelDefinitionRequest 请求对象
     * @return CreateModelDefinitionResponse
     */
    public CreateModelDefinitionResponse createModelDefinition(CreateModelDefinitionRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricMeta.createModelDefinition);
    }

    /**
     * 创建模型
     *
     * 创建模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateModelDefinitionRequest 请求对象
     * @return SyncInvoker<CreateModelDefinitionRequest, CreateModelDefinitionResponse>
     */
    public SyncInvoker<CreateModelDefinitionRequest, CreateModelDefinitionResponse> createModelDefinitionInvoker(
        CreateModelDefinitionRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricMeta.createModelDefinition, hcClient);
    }

    /**
     * 删除模型版本
     *
     * 删除模型版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteModelVersionRequest 请求对象
     * @return DeleteModelVersionResponse
     */
    public DeleteModelVersionResponse deleteModelVersion(DeleteModelVersionRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricMeta.deleteModelVersion);
    }

    /**
     * 删除模型版本
     *
     * 删除模型版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteModelVersionRequest 请求对象
     * @return SyncInvoker<DeleteModelVersionRequest, DeleteModelVersionResponse>
     */
    public SyncInvoker<DeleteModelVersionRequest, DeleteModelVersionResponse> deleteModelVersionInvoker(
        DeleteModelVersionRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricMeta.deleteModelVersion, hcClient);
    }

    /**
     * 列举基模型
     *
     * 列举基模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBaseModelsRequest 请求对象
     * @return ListBaseModelsResponse
     */
    public ListBaseModelsResponse listBaseModels(ListBaseModelsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricMeta.listBaseModels);
    }

    /**
     * 列举基模型
     *
     * 列举基模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBaseModelsRequest 请求对象
     * @return SyncInvoker<ListBaseModelsRequest, ListBaseModelsResponse>
     */
    public SyncInvoker<ListBaseModelsRequest, ListBaseModelsResponse> listBaseModelsInvoker(
        ListBaseModelsRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricMeta.listBaseModels, hcClient);
    }

    /**
     * 查询模型的版本列表
     *
     * 查询模型的版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListModelVersionsRequest 请求对象
     * @return ListModelVersionsResponse
     */
    public ListModelVersionsResponse listModelVersions(ListModelVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricMeta.listModelVersions);
    }

    /**
     * 查询模型的版本列表
     *
     * 查询模型的版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListModelVersionsRequest 请求对象
     * @return SyncInvoker<ListModelVersionsRequest, ListModelVersionsResponse>
     */
    public SyncInvoker<ListModelVersionsRequest, ListModelVersionsResponse> listModelVersionsInvoker(
        ListModelVersionsRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricMeta.listModelVersions, hcClient);
    }

    /**
     * 列举模型
     *
     * 列举模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListModelsRequest 请求对象
     * @return ListModelsResponse
     */
    public ListModelsResponse listModels(ListModelsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricMeta.listModels);
    }

    /**
     * 列举模型
     *
     * 列举模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListModelsRequest 请求对象
     * @return SyncInvoker<ListModelsRequest, ListModelsResponse>
     */
    public SyncInvoker<ListModelsRequest, ListModelsResponse> listModelsInvoker(ListModelsRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricMeta.listModels, hcClient);
    }

    /**
     * 更新模型
     *
     * 更新模型，会生成新版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateModelDefinitionRequest 请求对象
     * @return UpdateModelDefinitionResponse
     */
    public UpdateModelDefinitionResponse updateModelDefinition(UpdateModelDefinitionRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricMeta.updateModelDefinition);
    }

    /**
     * 更新模型
     *
     * 更新模型，会生成新版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateModelDefinitionRequest 请求对象
     * @return SyncInvoker<UpdateModelDefinitionRequest, UpdateModelDefinitionResponse>
     */
    public SyncInvoker<UpdateModelDefinitionRequest, UpdateModelDefinitionResponse> updateModelDefinitionInvoker(
        UpdateModelDefinitionRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricMeta.updateModelDefinition, hcClient);
    }

    /**
     * 查询服务规格列表
     *
     * 查询服务规格列表，购买计算资源使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSpecsRequest 请求对象
     * @return ListSpecsResponse
     */
    public ListSpecsResponse listSpecs(ListSpecsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricMeta.listSpecs);
    }

    /**
     * 查询服务规格列表
     *
     * 查询服务规格列表，购买计算资源使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSpecsRequest 请求对象
     * @return SyncInvoker<ListSpecsRequest, ListSpecsResponse>
     */
    public SyncInvoker<ListSpecsRequest, ListSpecsResponse> listSpecsInvoker(ListSpecsRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricMeta.listSpecs, hcClient);
    }

    /**
     * 批量打资源标签
     *
     * 批量打资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateFabricWorkspaceTagsRequest 请求对象
     * @return BatchCreateFabricWorkspaceTagsResponse
     */
    public BatchCreateFabricWorkspaceTagsResponse batchCreateFabricWorkspaceTags(
        BatchCreateFabricWorkspaceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricMeta.batchCreateFabricWorkspaceTags);
    }

    /**
     * 批量打资源标签
     *
     * 批量打资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateFabricWorkspaceTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateFabricWorkspaceTagsRequest, BatchCreateFabricWorkspaceTagsResponse>
     */
    public SyncInvoker<BatchCreateFabricWorkspaceTagsRequest, BatchCreateFabricWorkspaceTagsResponse> batchCreateFabricWorkspaceTagsInvoker(
        BatchCreateFabricWorkspaceTagsRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricMeta.batchCreateFabricWorkspaceTags, hcClient);
    }

    /**
     * 批量删除资源标签
     *
     * 批量删除资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteFabricWorkspaceTagsRequest 请求对象
     * @return BatchDeleteFabricWorkspaceTagsResponse
     */
    public BatchDeleteFabricWorkspaceTagsResponse batchDeleteFabricWorkspaceTags(
        BatchDeleteFabricWorkspaceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricMeta.batchDeleteFabricWorkspaceTags);
    }

    /**
     * 批量删除资源标签
     *
     * 批量删除资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteFabricWorkspaceTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteFabricWorkspaceTagsRequest, BatchDeleteFabricWorkspaceTagsResponse>
     */
    public SyncInvoker<BatchDeleteFabricWorkspaceTagsRequest, BatchDeleteFabricWorkspaceTagsResponse> batchDeleteFabricWorkspaceTagsInvoker(
        BatchDeleteFabricWorkspaceTagsRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricMeta.batchDeleteFabricWorkspaceTags, hcClient);
    }

    /**
     * 查询资源实例数量
     *
     * 查询资源实例数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountTagFabricWorkspacesRequest 请求对象
     * @return CountTagFabricWorkspacesResponse
     */
    public CountTagFabricWorkspacesResponse countTagFabricWorkspaces(CountTagFabricWorkspacesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricMeta.countTagFabricWorkspaces);
    }

    /**
     * 查询资源实例数量
     *
     * 查询资源实例数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountTagFabricWorkspacesRequest 请求对象
     * @return SyncInvoker<CountTagFabricWorkspacesRequest, CountTagFabricWorkspacesResponse>
     */
    public SyncInvoker<CountTagFabricWorkspacesRequest, CountTagFabricWorkspacesResponse> countTagFabricWorkspacesInvoker(
        CountTagFabricWorkspacesRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricMeta.countTagFabricWorkspaces, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFabricProjectTagsRequest 请求对象
     * @return ListFabricProjectTagsResponse
     */
    public ListFabricProjectTagsResponse listFabricProjectTags(ListFabricProjectTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricMeta.listFabricProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFabricProjectTagsRequest 请求对象
     * @return SyncInvoker<ListFabricProjectTagsRequest, ListFabricProjectTagsResponse>
     */
    public SyncInvoker<ListFabricProjectTagsRequest, ListFabricProjectTagsResponse> listFabricProjectTagsInvoker(
        ListFabricProjectTagsRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricMeta.listFabricProjectTags, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFabricWorkspaceTagsRequest 请求对象
     * @return ListFabricWorkspaceTagsResponse
     */
    public ListFabricWorkspaceTagsResponse listFabricWorkspaceTags(ListFabricWorkspaceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricMeta.listFabricWorkspaceTags);
    }

    /**
     * 查询资源标签
     *
     * 查询资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFabricWorkspaceTagsRequest 请求对象
     * @return SyncInvoker<ListFabricWorkspaceTagsRequest, ListFabricWorkspaceTagsResponse>
     */
    public SyncInvoker<ListFabricWorkspaceTagsRequest, ListFabricWorkspaceTagsResponse> listFabricWorkspaceTagsInvoker(
        ListFabricWorkspaceTagsRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricMeta.listFabricWorkspaceTags, hcClient);
    }

    /**
     * 查询资源实例列表
     *
     * 查询资源实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagFabricWorkspacesRequest 请求对象
     * @return ListTagFabricWorkspacesResponse
     */
    public ListTagFabricWorkspacesResponse listTagFabricWorkspaces(ListTagFabricWorkspacesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricMeta.listTagFabricWorkspaces);
    }

    /**
     * 查询资源实例列表
     *
     * 查询资源实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagFabricWorkspacesRequest 请求对象
     * @return SyncInvoker<ListTagFabricWorkspacesRequest, ListTagFabricWorkspacesResponse>
     */
    public SyncInvoker<ListTagFabricWorkspacesRequest, ListTagFabricWorkspacesResponse> listTagFabricWorkspacesInvoker(
        ListTagFabricWorkspacesRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricMeta.listTagFabricWorkspaces, hcClient);
    }

    /**
     * 创建Workspace
     *
     * Create workspace
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkspaceRequest 请求对象
     * @return CreateWorkspaceResponse
     */
    public CreateWorkspaceResponse createWorkspace(CreateWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricMeta.createWorkspace);
    }

    /**
     * 创建Workspace
     *
     * Create workspace
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkspaceRequest 请求对象
     * @return SyncInvoker<CreateWorkspaceRequest, CreateWorkspaceResponse>
     */
    public SyncInvoker<CreateWorkspaceRequest, CreateWorkspaceResponse> createWorkspaceInvoker(
        CreateWorkspaceRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricMeta.createWorkspace, hcClient);
    }

    /**
     * 删除Workspace
     *
     * 删除Workspace
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkspaceRequest 请求对象
     * @return DeleteWorkspaceResponse
     */
    public DeleteWorkspaceResponse deleteWorkspace(DeleteWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricMeta.deleteWorkspace);
    }

    /**
     * 删除Workspace
     *
     * 删除Workspace
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkspaceRequest 请求对象
     * @return SyncInvoker<DeleteWorkspaceRequest, DeleteWorkspaceResponse>
     */
    public SyncInvoker<DeleteWorkspaceRequest, DeleteWorkspaceResponse> deleteWorkspaceInvoker(
        DeleteWorkspaceRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricMeta.deleteWorkspace, hcClient);
    }

    /**
     * 查询Workspace列表
     *
     * 查询Workspace列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkspacesRequest 请求对象
     * @return ListWorkspacesResponse
     */
    public ListWorkspacesResponse listWorkspaces(ListWorkspacesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricMeta.listWorkspaces);
    }

    /**
     * 查询Workspace列表
     *
     * 查询Workspace列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkspacesRequest 请求对象
     * @return SyncInvoker<ListWorkspacesRequest, ListWorkspacesResponse>
     */
    public SyncInvoker<ListWorkspacesRequest, ListWorkspacesResponse> listWorkspacesInvoker(
        ListWorkspacesRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricMeta.listWorkspaces, hcClient);
    }

    /**
     * 更新Workspace
     *
     * 更新Workspace
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkspaceRequest 请求对象
     * @return UpdateWorkspaceResponse
     */
    public UpdateWorkspaceResponse updateWorkspace(UpdateWorkspaceRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricMeta.updateWorkspace);
    }

    /**
     * 更新Workspace
     *
     * 更新Workspace
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkspaceRequest 请求对象
     * @return SyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse>
     */
    public SyncInvoker<UpdateWorkspaceRequest, UpdateWorkspaceResponse> updateWorkspaceInvoker(
        UpdateWorkspaceRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricMeta.updateWorkspace, hcClient);
    }

}

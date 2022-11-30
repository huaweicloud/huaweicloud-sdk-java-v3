package com.huaweicloud.sdk.eg.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.eg.v1.model.*;

public class EgClient {

    protected HcClient hcClient;

    public EgClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EgClient> newBuilder() {
        return new ClientBuilder<>(EgClient::new);
    }

    /**
     * 创建服务委托
     *
     * 按照业务场景，一键创建服务委托授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAgenciesRequest 请求对象
     * @return CreateAgenciesResponse
     */
    public CreateAgenciesResponse createAgencies(CreateAgenciesRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.createAgencies);
    }

    /**
     * 创建服务委托
     *
     * 按照业务场景，一键创建服务委托授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAgenciesRequest 请求对象
     * @return SyncInvoker<CreateAgenciesRequest, CreateAgenciesResponse>
     */
    public SyncInvoker<CreateAgenciesRequest, CreateAgenciesResponse> createAgenciesInvoker(
        CreateAgenciesRequest request) {
        return new SyncInvoker<CreateAgenciesRequest, CreateAgenciesResponse>(request, EgMeta.createAgencies, hcClient);
    }

    /**
     * 创建自定义事件通道
     *
     * 创建自定义事件通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateChannelRequest 请求对象
     * @return CreateChannelResponse
     */
    public CreateChannelResponse createChannel(CreateChannelRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.createChannel);
    }

    /**
     * 创建自定义事件通道
     *
     * 创建自定义事件通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateChannelRequest 请求对象
     * @return SyncInvoker<CreateChannelRequest, CreateChannelResponse>
     */
    public SyncInvoker<CreateChannelRequest, CreateChannelResponse> createChannelInvoker(CreateChannelRequest request) {
        return new SyncInvoker<CreateChannelRequest, CreateChannelResponse>(request, EgMeta.createChannel, hcClient);
    }

    /**
     * 创建目标连接
     *
     * 创建目标连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateConnectionRequest 请求对象
     * @return CreateConnectionResponse
     */
    public CreateConnectionResponse createConnection(CreateConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.createConnection);
    }

    /**
     * 创建目标连接
     *
     * 创建目标连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateConnectionRequest 请求对象
     * @return SyncInvoker<CreateConnectionRequest, CreateConnectionResponse>
     */
    public SyncInvoker<CreateConnectionRequest, CreateConnectionResponse> createConnectionInvoker(
        CreateConnectionRequest request) {
        return new SyncInvoker<CreateConnectionRequest, CreateConnectionResponse>(request, EgMeta.createConnection,
            hcClient);
    }

    /**
     * 创建访问端点
     *
     * create endpoint
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEndpointRequest 请求对象
     * @return CreateEndpointResponse
     */
    public CreateEndpointResponse createEndpoint(CreateEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.createEndpoint);
    }

    /**
     * 创建访问端点
     *
     * create endpoint
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEndpointRequest 请求对象
     * @return SyncInvoker<CreateEndpointRequest, CreateEndpointResponse>
     */
    public SyncInvoker<CreateEndpointRequest, CreateEndpointResponse> createEndpointInvoker(
        CreateEndpointRequest request) {
        return new SyncInvoker<CreateEndpointRequest, CreateEndpointResponse>(request, EgMeta.createEndpoint, hcClient);
    }

    /**
     * 创建自定义事件模型
     *
     * 创建自定义事件模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEventSchemaRequest 请求对象
     * @return CreateEventSchemaResponse
     */
    public CreateEventSchemaResponse createEventSchema(CreateEventSchemaRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.createEventSchema);
    }

    /**
     * 创建自定义事件模型
     *
     * 创建自定义事件模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEventSchemaRequest 请求对象
     * @return SyncInvoker<CreateEventSchemaRequest, CreateEventSchemaResponse>
     */
    public SyncInvoker<CreateEventSchemaRequest, CreateEventSchemaResponse> createEventSchemaInvoker(
        CreateEventSchemaRequest request) {
        return new SyncInvoker<CreateEventSchemaRequest, CreateEventSchemaResponse>(request, EgMeta.createEventSchema,
            hcClient);
    }

    /**
     * 创建自定义事件模型版本
     *
     * 创建自定义事件模型版本，版本号后台自动生成
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEventSchemaVersionRequest 请求对象
     * @return CreateEventSchemaVersionResponse
     */
    public CreateEventSchemaVersionResponse createEventSchemaVersion(CreateEventSchemaVersionRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.createEventSchemaVersion);
    }

    /**
     * 创建自定义事件模型版本
     *
     * 创建自定义事件模型版本，版本号后台自动生成
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEventSchemaVersionRequest 请求对象
     * @return SyncInvoker<CreateEventSchemaVersionRequest, CreateEventSchemaVersionResponse>
     */
    public SyncInvoker<CreateEventSchemaVersionRequest, CreateEventSchemaVersionResponse> createEventSchemaVersionInvoker(
        CreateEventSchemaVersionRequest request) {
        return new SyncInvoker<CreateEventSchemaVersionRequest, CreateEventSchemaVersionResponse>(request,
            EgMeta.createEventSchemaVersion, hcClient);
    }

    /**
     * 创建自定义事件源
     *
     * 创建用户自定义类型的事件源，只能指定自定义通道，不能指定系统通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEventSourceRequest 请求对象
     * @return CreateEventSourceResponse
     */
    public CreateEventSourceResponse createEventSource(CreateEventSourceRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.createEventSource);
    }

    /**
     * 创建自定义事件源
     *
     * 创建用户自定义类型的事件源，只能指定自定义通道，不能指定系统通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEventSourceRequest 请求对象
     * @return SyncInvoker<CreateEventSourceRequest, CreateEventSourceResponse>
     */
    public SyncInvoker<CreateEventSourceRequest, CreateEventSourceResponse> createEventSourceInvoker(
        CreateEventSourceRequest request) {
        return new SyncInvoker<CreateEventSourceRequest, CreateEventSourceResponse>(request, EgMeta.createEventSource,
            hcClient);
    }

    /**
     * 创建事件订阅
     *
     * 创建事件订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSubscriptionRequest 请求对象
     * @return CreateSubscriptionResponse
     */
    public CreateSubscriptionResponse createSubscription(CreateSubscriptionRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.createSubscription);
    }

    /**
     * 创建事件订阅
     *
     * 创建事件订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSubscriptionRequest 请求对象
     * @return SyncInvoker<CreateSubscriptionRequest, CreateSubscriptionResponse>
     */
    public SyncInvoker<CreateSubscriptionRequest, CreateSubscriptionResponse> createSubscriptionInvoker(
        CreateSubscriptionRequest request) {
        return new SyncInvoker<CreateSubscriptionRequest, CreateSubscriptionResponse>(request,
            EgMeta.createSubscription, hcClient);
    }

    /**
     * 创建事件订阅目标
     *
     * 创建单个事件订阅目标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSubscriptionTargetRequest 请求对象
     * @return CreateSubscriptionTargetResponse
     */
    public CreateSubscriptionTargetResponse createSubscriptionTarget(CreateSubscriptionTargetRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.createSubscriptionTarget);
    }

    /**
     * 创建事件订阅目标
     *
     * 创建单个事件订阅目标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSubscriptionTargetRequest 请求对象
     * @return SyncInvoker<CreateSubscriptionTargetRequest, CreateSubscriptionTargetResponse>
     */
    public SyncInvoker<CreateSubscriptionTargetRequest, CreateSubscriptionTargetResponse> createSubscriptionTargetInvoker(
        CreateSubscriptionTargetRequest request) {
        return new SyncInvoker<CreateSubscriptionTargetRequest, CreateSubscriptionTargetResponse>(request,
            EgMeta.createSubscriptionTarget, hcClient);
    }

    /**
     * 删除自定义事件通道
     *
     * 删除指定自定义事件通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteChannelRequest 请求对象
     * @return DeleteChannelResponse
     */
    public DeleteChannelResponse deleteChannel(DeleteChannelRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.deleteChannel);
    }

    /**
     * 删除自定义事件通道
     *
     * 删除指定自定义事件通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteChannelRequest 请求对象
     * @return SyncInvoker<DeleteChannelRequest, DeleteChannelResponse>
     */
    public SyncInvoker<DeleteChannelRequest, DeleteChannelResponse> deleteChannelInvoker(DeleteChannelRequest request) {
        return new SyncInvoker<DeleteChannelRequest, DeleteChannelResponse>(request, EgMeta.deleteChannel, hcClient);
    }

    /**
     * 删除目标连接
     *
     * 删除目标连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConnectionRequest 请求对象
     * @return DeleteConnectionResponse
     */
    public DeleteConnectionResponse deleteConnection(DeleteConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.deleteConnection);
    }

    /**
     * 删除目标连接
     *
     * 删除目标连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConnectionRequest 请求对象
     * @return SyncInvoker<DeleteConnectionRequest, DeleteConnectionResponse>
     */
    public SyncInvoker<DeleteConnectionRequest, DeleteConnectionResponse> deleteConnectionInvoker(
        DeleteConnectionRequest request) {
        return new SyncInvoker<DeleteConnectionRequest, DeleteConnectionResponse>(request, EgMeta.deleteConnection,
            hcClient);
    }

    /**
     * 删除访问端点
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEndpointRequest 请求对象
     * @return DeleteEndpointResponse
     */
    public DeleteEndpointResponse deleteEndpoint(DeleteEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.deleteEndpoint);
    }

    /**
     * 删除访问端点
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEndpointRequest 请求对象
     * @return SyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse>
     */
    public SyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse> deleteEndpointInvoker(
        DeleteEndpointRequest request) {
        return new SyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse>(request, EgMeta.deleteEndpoint, hcClient);
    }

    /**
     * 删除事件模型
     *
     * 删除事件模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEventSchemaRequest 请求对象
     * @return DeleteEventSchemaResponse
     */
    public DeleteEventSchemaResponse deleteEventSchema(DeleteEventSchemaRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.deleteEventSchema);
    }

    /**
     * 删除事件模型
     *
     * 删除事件模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEventSchemaRequest 请求对象
     * @return SyncInvoker<DeleteEventSchemaRequest, DeleteEventSchemaResponse>
     */
    public SyncInvoker<DeleteEventSchemaRequest, DeleteEventSchemaResponse> deleteEventSchemaInvoker(
        DeleteEventSchemaRequest request) {
        return new SyncInvoker<DeleteEventSchemaRequest, DeleteEventSchemaResponse>(request, EgMeta.deleteEventSchema,
            hcClient);
    }

    /**
     * 删除事件模型版本
     *
     * 删除事件模型指定版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEventSchemaVersionRequest 请求对象
     * @return DeleteEventSchemaVersionResponse
     */
    public DeleteEventSchemaVersionResponse deleteEventSchemaVersion(DeleteEventSchemaVersionRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.deleteEventSchemaVersion);
    }

    /**
     * 删除事件模型版本
     *
     * 删除事件模型指定版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEventSchemaVersionRequest 请求对象
     * @return SyncInvoker<DeleteEventSchemaVersionRequest, DeleteEventSchemaVersionResponse>
     */
    public SyncInvoker<DeleteEventSchemaVersionRequest, DeleteEventSchemaVersionResponse> deleteEventSchemaVersionInvoker(
        DeleteEventSchemaVersionRequest request) {
        return new SyncInvoker<DeleteEventSchemaVersionRequest, DeleteEventSchemaVersionResponse>(request,
            EgMeta.deleteEventSchemaVersion, hcClient);
    }

    /**
     * 删除自定义事件源
     *
     * 删除指定的自定义事件源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEventSourceRequest 请求对象
     * @return DeleteEventSourceResponse
     */
    public DeleteEventSourceResponse deleteEventSource(DeleteEventSourceRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.deleteEventSource);
    }

    /**
     * 删除自定义事件源
     *
     * 删除指定的自定义事件源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEventSourceRequest 请求对象
     * @return SyncInvoker<DeleteEventSourceRequest, DeleteEventSourceResponse>
     */
    public SyncInvoker<DeleteEventSourceRequest, DeleteEventSourceResponse> deleteEventSourceInvoker(
        DeleteEventSourceRequest request) {
        return new SyncInvoker<DeleteEventSourceRequest, DeleteEventSourceResponse>(request, EgMeta.deleteEventSource,
            hcClient);
    }

    /**
     * 删除事件订阅
     *
     * 删除事件订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSubscriptionRequest 请求对象
     * @return DeleteSubscriptionResponse
     */
    public DeleteSubscriptionResponse deleteSubscription(DeleteSubscriptionRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.deleteSubscription);
    }

    /**
     * 删除事件订阅
     *
     * 删除事件订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSubscriptionRequest 请求对象
     * @return SyncInvoker<DeleteSubscriptionRequest, DeleteSubscriptionResponse>
     */
    public SyncInvoker<DeleteSubscriptionRequest, DeleteSubscriptionResponse> deleteSubscriptionInvoker(
        DeleteSubscriptionRequest request) {
        return new SyncInvoker<DeleteSubscriptionRequest, DeleteSubscriptionResponse>(request,
            EgMeta.deleteSubscription, hcClient);
    }

    /**
     * 删除事件订阅目标
     *
     * 删除事件订阅目标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSubscriptionTargetRequest 请求对象
     * @return DeleteSubscriptionTargetResponse
     */
    public DeleteSubscriptionTargetResponse deleteSubscriptionTarget(DeleteSubscriptionTargetRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.deleteSubscriptionTarget);
    }

    /**
     * 删除事件订阅目标
     *
     * 删除事件订阅目标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSubscriptionTargetRequest 请求对象
     * @return SyncInvoker<DeleteSubscriptionTargetRequest, DeleteSubscriptionTargetResponse>
     */
    public SyncInvoker<DeleteSubscriptionTargetRequest, DeleteSubscriptionTargetResponse> deleteSubscriptionTargetInvoker(
        DeleteSubscriptionTargetRequest request) {
        return new SyncInvoker<DeleteSubscriptionTargetRequest, DeleteSubscriptionTargetResponse>(request,
            EgMeta.deleteSubscriptionTarget, hcClient);
    }

    /**
     * 事件模型自动发现
     *
     * 事件模型自动发现
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DiscoverEventSchemaFromDataRequest 请求对象
     * @return DiscoverEventSchemaFromDataResponse
     */
    public DiscoverEventSchemaFromDataResponse discoverEventSchemaFromData(DiscoverEventSchemaFromDataRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.discoverEventSchemaFromData);
    }

    /**
     * 事件模型自动发现
     *
     * 事件模型自动发现
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DiscoverEventSchemaFromDataRequest 请求对象
     * @return SyncInvoker<DiscoverEventSchemaFromDataRequest, DiscoverEventSchemaFromDataResponse>
     */
    public SyncInvoker<DiscoverEventSchemaFromDataRequest, DiscoverEventSchemaFromDataResponse> discoverEventSchemaFromDataInvoker(
        DiscoverEventSchemaFromDataRequest request) {
        return new SyncInvoker<DiscoverEventSchemaFromDataRequest, DiscoverEventSchemaFromDataResponse>(request,
            EgMeta.discoverEventSchemaFromData, hcClient);
    }

    /**
     * 查询服务委托
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAgenciesRequest 请求对象
     * @return ListAgenciesResponse
     */
    public ListAgenciesResponse listAgencies(ListAgenciesRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.listAgencies);
    }

    /**
     * 查询服务委托
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAgenciesRequest 请求对象
     * @return SyncInvoker<ListAgenciesRequest, ListAgenciesResponse>
     */
    public SyncInvoker<ListAgenciesRequest, ListAgenciesResponse> listAgenciesInvoker(ListAgenciesRequest request) {
        return new SyncInvoker<ListAgenciesRequest, ListAgenciesResponse>(request, EgMeta.listAgencies, hcClient);
    }

    /**
     * 查询事件通道列表
     *
     * 查询事件通道列表，包括系统通道和自定义通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListChannelsRequest 请求对象
     * @return ListChannelsResponse
     */
    public ListChannelsResponse listChannels(ListChannelsRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.listChannels);
    }

    /**
     * 查询事件通道列表
     *
     * 查询事件通道列表，包括系统通道和自定义通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListChannelsRequest 请求对象
     * @return SyncInvoker<ListChannelsRequest, ListChannelsResponse>
     */
    public SyncInvoker<ListChannelsRequest, ListChannelsResponse> listChannelsInvoker(ListChannelsRequest request) {
        return new SyncInvoker<ListChannelsRequest, ListChannelsResponse>(request, EgMeta.listChannels, hcClient);
    }

    /**
     * 查询目标连接列表
     *
     * 查询目标连接列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConnectionsRequest 请求对象
     * @return ListConnectionsResponse
     */
    public ListConnectionsResponse listConnections(ListConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.listConnections);
    }

    /**
     * 查询目标连接列表
     *
     * 查询目标连接列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConnectionsRequest 请求对象
     * @return SyncInvoker<ListConnectionsRequest, ListConnectionsResponse>
     */
    public SyncInvoker<ListConnectionsRequest, ListConnectionsResponse> listConnectionsInvoker(
        ListConnectionsRequest request) {
        return new SyncInvoker<ListConnectionsRequest, ListConnectionsResponse>(request, EgMeta.listConnections,
            hcClient);
    }

    /**
     * 查询访问端点
     *
     * list all endpoints
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEndpointsRequest 请求对象
     * @return ListEndpointsResponse
     */
    public ListEndpointsResponse listEndpoints(ListEndpointsRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.listEndpoints);
    }

    /**
     * 查询访问端点
     *
     * list all endpoints
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEndpointsRequest 请求对象
     * @return SyncInvoker<ListEndpointsRequest, ListEndpointsResponse>
     */
    public SyncInvoker<ListEndpointsRequest, ListEndpointsResponse> listEndpointsInvoker(ListEndpointsRequest request) {
        return new SyncInvoker<ListEndpointsRequest, ListEndpointsResponse>(request, EgMeta.listEndpoints, hcClient);
    }

    /**
     * 查询事件模型列表
     *
     * 查询事件模型列表，包括系统事件模型和自定义事件模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEventSchemaRequest 请求对象
     * @return ListEventSchemaResponse
     */
    public ListEventSchemaResponse listEventSchema(ListEventSchemaRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.listEventSchema);
    }

    /**
     * 查询事件模型列表
     *
     * 查询事件模型列表，包括系统事件模型和自定义事件模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEventSchemaRequest 请求对象
     * @return SyncInvoker<ListEventSchemaRequest, ListEventSchemaResponse>
     */
    public SyncInvoker<ListEventSchemaRequest, ListEventSchemaResponse> listEventSchemaInvoker(
        ListEventSchemaRequest request) {
        return new SyncInvoker<ListEventSchemaRequest, ListEventSchemaResponse>(request, EgMeta.listEventSchema,
            hcClient);
    }

    /**
     * 查询事件模型版本列表
     *
     * 查询事件模型版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEventSchemaVersionsRequest 请求对象
     * @return ListEventSchemaVersionsResponse
     */
    public ListEventSchemaVersionsResponse listEventSchemaVersions(ListEventSchemaVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.listEventSchemaVersions);
    }

    /**
     * 查询事件模型版本列表
     *
     * 查询事件模型版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEventSchemaVersionsRequest 请求对象
     * @return SyncInvoker<ListEventSchemaVersionsRequest, ListEventSchemaVersionsResponse>
     */
    public SyncInvoker<ListEventSchemaVersionsRequest, ListEventSchemaVersionsResponse> listEventSchemaVersionsInvoker(
        ListEventSchemaVersionsRequest request) {
        return new SyncInvoker<ListEventSchemaVersionsRequest, ListEventSchemaVersionsResponse>(request,
            EgMeta.listEventSchemaVersions, hcClient);
    }

    /**
     * 查询事件源列表
     *
     * 支持条件查询，如可以指定事件通道ID来查询某个事件通道下的所有事件源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEventSourcesRequest 请求对象
     * @return ListEventSourcesResponse
     */
    public ListEventSourcesResponse listEventSources(ListEventSourcesRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.listEventSources);
    }

    /**
     * 查询事件源列表
     *
     * 支持条件查询，如可以指定事件通道ID来查询某个事件通道下的所有事件源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEventSourcesRequest 请求对象
     * @return SyncInvoker<ListEventSourcesRequest, ListEventSourcesResponse>
     */
    public SyncInvoker<ListEventSourcesRequest, ListEventSourcesResponse> listEventSourcesInvoker(
        ListEventSourcesRequest request) {
        return new SyncInvoker<ListEventSourcesRequest, ListEventSourcesResponse>(request, EgMeta.listEventSources,
            hcClient);
    }

    /**
     * 查询事件目标分类
     *
     * 查询预置的事件目标分类，获取每个事件目标分类的字段定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEventTargetRequest 请求对象
     * @return ListEventTargetResponse
     */
    public ListEventTargetResponse listEventTarget(ListEventTargetRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.listEventTarget);
    }

    /**
     * 查询事件目标分类
     *
     * 查询预置的事件目标分类，获取每个事件目标分类的字段定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEventTargetRequest 请求对象
     * @return SyncInvoker<ListEventTargetRequest, ListEventTargetResponse>
     */
    public SyncInvoker<ListEventTargetRequest, ListEventTargetResponse> listEventTargetInvoker(
        ListEventTargetRequest request) {
        return new SyncInvoker<ListEventTargetRequest, ListEventTargetResponse>(request, EgMeta.listEventTarget,
            hcClient);
    }

    /**
     * 查询配额
     *
     * 查询当前租户的配额，未特殊配置过的会返回默认配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
     * @return ListQuotasResponse
     */
    public ListQuotasResponse listQuotas(ListQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.listQuotas);
    }

    /**
     * 查询配额
     *
     * 查询当前租户的配额，未特殊配置过的会返回默认配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
     * @return SyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public SyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasInvoker(ListQuotasRequest request) {
        return new SyncInvoker<ListQuotasRequest, ListQuotasResponse>(request, EgMeta.listQuotas, hcClient);
    }

    /**
     * 查询事件订阅列表
     *
     * 查询事件订阅列表，支持指定事件通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSubscriptionsRequest 请求对象
     * @return ListSubscriptionsResponse
     */
    public ListSubscriptionsResponse listSubscriptions(ListSubscriptionsRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.listSubscriptions);
    }

    /**
     * 查询事件订阅列表
     *
     * 查询事件订阅列表，支持指定事件通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSubscriptionsRequest 请求对象
     * @return SyncInvoker<ListSubscriptionsRequest, ListSubscriptionsResponse>
     */
    public SyncInvoker<ListSubscriptionsRequest, ListSubscriptionsResponse> listSubscriptionsInvoker(
        ListSubscriptionsRequest request) {
        return new SyncInvoker<ListSubscriptionsRequest, ListSubscriptionsResponse>(request, EgMeta.listSubscriptions,
            hcClient);
    }

    /**
     * 查询事件订阅列表
     *
     * 查询触发器，支持指定函数urn。一个以函数urn为目标的订阅为一个触发器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTriggersRequest 请求对象
     * @return ListTriggersResponse
     */
    public ListTriggersResponse listTriggers(ListTriggersRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.listTriggers);
    }

    /**
     * 查询事件订阅列表
     *
     * 查询触发器，支持指定函数urn。一个以函数urn为目标的订阅为一个触发器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTriggersRequest 请求对象
     * @return SyncInvoker<ListTriggersRequest, ListTriggersResponse>
     */
    public SyncInvoker<ListTriggersRequest, ListTriggersResponse> listTriggersInvoker(ListTriggersRequest request) {
        return new SyncInvoker<ListTriggersRequest, ListTriggersResponse>(request, EgMeta.listTriggers, hcClient);
    }

    /**
     * 操作事件订阅
     *
     * 操作事件订阅，支持启用、禁用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param OperateSubscriptionRequest 请求对象
     * @return OperateSubscriptionResponse
     */
    public OperateSubscriptionResponse operateSubscription(OperateSubscriptionRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.operateSubscription);
    }

    /**
     * 操作事件订阅
     *
     * 操作事件订阅，支持启用、禁用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param OperateSubscriptionRequest 请求对象
     * @return SyncInvoker<OperateSubscriptionRequest, OperateSubscriptionResponse>
     */
    public SyncInvoker<OperateSubscriptionRequest, OperateSubscriptionResponse> operateSubscriptionInvoker(
        OperateSubscriptionRequest request) {
        return new SyncInvoker<OperateSubscriptionRequest, OperateSubscriptionResponse>(request,
            EgMeta.operateSubscription, hcClient);
    }

    /**
     * 发布事件到事件通道
     *
     * 发布事件到事件通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PutEventsRequest 请求对象
     * @return PutEventsResponse
     */
    public PutEventsResponse putEvents(PutEventsRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.putEvents);
    }

    /**
     * 发布事件到事件通道
     *
     * 发布事件到事件通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PutEventsRequest 请求对象
     * @return SyncInvoker<PutEventsRequest, PutEventsResponse>
     */
    public SyncInvoker<PutEventsRequest, PutEventsResponse> putEventsInvoker(PutEventsRequest request) {
        return new SyncInvoker<PutEventsRequest, PutEventsResponse>(request, EgMeta.putEvents, hcClient);
    }

    /**
     * 查询事件通道详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailOfChannelRequest 请求对象
     * @return ShowDetailOfChannelResponse
     */
    public ShowDetailOfChannelResponse showDetailOfChannel(ShowDetailOfChannelRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.showDetailOfChannel);
    }

    /**
     * 查询事件通道详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailOfChannelRequest 请求对象
     * @return SyncInvoker<ShowDetailOfChannelRequest, ShowDetailOfChannelResponse>
     */
    public SyncInvoker<ShowDetailOfChannelRequest, ShowDetailOfChannelResponse> showDetailOfChannelInvoker(
        ShowDetailOfChannelRequest request) {
        return new SyncInvoker<ShowDetailOfChannelRequest, ShowDetailOfChannelResponse>(request,
            EgMeta.showDetailOfChannel, hcClient);
    }

    /**
     * 查询目标连接详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailOfConnectionRequest 请求对象
     * @return ShowDetailOfConnectionResponse
     */
    public ShowDetailOfConnectionResponse showDetailOfConnection(ShowDetailOfConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.showDetailOfConnection);
    }

    /**
     * 查询目标连接详情
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailOfConnectionRequest 请求对象
     * @return SyncInvoker<ShowDetailOfConnectionRequest, ShowDetailOfConnectionResponse>
     */
    public SyncInvoker<ShowDetailOfConnectionRequest, ShowDetailOfConnectionResponse> showDetailOfConnectionInvoker(
        ShowDetailOfConnectionRequest request) {
        return new SyncInvoker<ShowDetailOfConnectionRequest, ShowDetailOfConnectionResponse>(request,
            EgMeta.showDetailOfConnection, hcClient);
    }

    /**
     * 查询事件模型详情
     *
     * 查询事件模型详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailOfEventSchemaRequest 请求对象
     * @return ShowDetailOfEventSchemaResponse
     */
    public ShowDetailOfEventSchemaResponse showDetailOfEventSchema(ShowDetailOfEventSchemaRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.showDetailOfEventSchema);
    }

    /**
     * 查询事件模型详情
     *
     * 查询事件模型详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailOfEventSchemaRequest 请求对象
     * @return SyncInvoker<ShowDetailOfEventSchemaRequest, ShowDetailOfEventSchemaResponse>
     */
    public SyncInvoker<ShowDetailOfEventSchemaRequest, ShowDetailOfEventSchemaResponse> showDetailOfEventSchemaInvoker(
        ShowDetailOfEventSchemaRequest request) {
        return new SyncInvoker<ShowDetailOfEventSchemaRequest, ShowDetailOfEventSchemaResponse>(request,
            EgMeta.showDetailOfEventSchema, hcClient);
    }

    /**
     * 查询事件模型版本详情
     *
     * 查询事件模型指定版本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailOfEventSchemaVersionRequest 请求对象
     * @return ShowDetailOfEventSchemaVersionResponse
     */
    public ShowDetailOfEventSchemaVersionResponse showDetailOfEventSchemaVersion(
        ShowDetailOfEventSchemaVersionRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.showDetailOfEventSchemaVersion);
    }

    /**
     * 查询事件模型版本详情
     *
     * 查询事件模型指定版本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailOfEventSchemaVersionRequest 请求对象
     * @return SyncInvoker<ShowDetailOfEventSchemaVersionRequest, ShowDetailOfEventSchemaVersionResponse>
     */
    public SyncInvoker<ShowDetailOfEventSchemaVersionRequest, ShowDetailOfEventSchemaVersionResponse> showDetailOfEventSchemaVersionInvoker(
        ShowDetailOfEventSchemaVersionRequest request) {
        return new SyncInvoker<ShowDetailOfEventSchemaVersionRequest, ShowDetailOfEventSchemaVersionResponse>(request,
            EgMeta.showDetailOfEventSchemaVersion, hcClient);
    }

    /**
     * 查询事件源详情
     *
     * 查询事件源详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailOfEventSourceRequest 请求对象
     * @return ShowDetailOfEventSourceResponse
     */
    public ShowDetailOfEventSourceResponse showDetailOfEventSource(ShowDetailOfEventSourceRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.showDetailOfEventSource);
    }

    /**
     * 查询事件源详情
     *
     * 查询事件源详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailOfEventSourceRequest 请求对象
     * @return SyncInvoker<ShowDetailOfEventSourceRequest, ShowDetailOfEventSourceResponse>
     */
    public SyncInvoker<ShowDetailOfEventSourceRequest, ShowDetailOfEventSourceResponse> showDetailOfEventSourceInvoker(
        ShowDetailOfEventSourceRequest request) {
        return new SyncInvoker<ShowDetailOfEventSourceRequest, ShowDetailOfEventSourceResponse>(request,
            EgMeta.showDetailOfEventSource, hcClient);
    }

    /**
     * 查询事件订阅详情
     *
     * 查询事件订阅详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailOfSubscriptionRequest 请求对象
     * @return ShowDetailOfSubscriptionResponse
     */
    public ShowDetailOfSubscriptionResponse showDetailOfSubscription(ShowDetailOfSubscriptionRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.showDetailOfSubscription);
    }

    /**
     * 查询事件订阅详情
     *
     * 查询事件订阅详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailOfSubscriptionRequest 请求对象
     * @return SyncInvoker<ShowDetailOfSubscriptionRequest, ShowDetailOfSubscriptionResponse>
     */
    public SyncInvoker<ShowDetailOfSubscriptionRequest, ShowDetailOfSubscriptionResponse> showDetailOfSubscriptionInvoker(
        ShowDetailOfSubscriptionRequest request) {
        return new SyncInvoker<ShowDetailOfSubscriptionRequest, ShowDetailOfSubscriptionResponse>(request,
            EgMeta.showDetailOfSubscription, hcClient);
    }

    /**
     * 查询事件订阅目标详情
     *
     * 查询事件订阅目标详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailOfSubscriptionTargetRequest 请求对象
     * @return ShowDetailOfSubscriptionTargetResponse
     */
    public ShowDetailOfSubscriptionTargetResponse showDetailOfSubscriptionTarget(
        ShowDetailOfSubscriptionTargetRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.showDetailOfSubscriptionTarget);
    }

    /**
     * 查询事件订阅目标详情
     *
     * 查询事件订阅目标详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailOfSubscriptionTargetRequest 请求对象
     * @return SyncInvoker<ShowDetailOfSubscriptionTargetRequest, ShowDetailOfSubscriptionTargetResponse>
     */
    public SyncInvoker<ShowDetailOfSubscriptionTargetRequest, ShowDetailOfSubscriptionTargetResponse> showDetailOfSubscriptionTargetInvoker(
        ShowDetailOfSubscriptionTargetRequest request) {
        return new SyncInvoker<ShowDetailOfSubscriptionTargetRequest, ShowDetailOfSubscriptionTargetResponse>(request,
            EgMeta.showDetailOfSubscriptionTarget, hcClient);
    }

    /**
     * 更新自定义事件通道
     *
     * 更新自定义事件通道定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateChannelRequest 请求对象
     * @return UpdateChannelResponse
     */
    public UpdateChannelResponse updateChannel(UpdateChannelRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.updateChannel);
    }

    /**
     * 更新自定义事件通道
     *
     * 更新自定义事件通道定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateChannelRequest 请求对象
     * @return SyncInvoker<UpdateChannelRequest, UpdateChannelResponse>
     */
    public SyncInvoker<UpdateChannelRequest, UpdateChannelResponse> updateChannelInvoker(UpdateChannelRequest request) {
        return new SyncInvoker<UpdateChannelRequest, UpdateChannelResponse>(request, EgMeta.updateChannel, hcClient);
    }

    /**
     * 更新目标连接
     *
     * 更新目标连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateConnectionRequest 请求对象
     * @return UpdateConnectionResponse
     */
    public UpdateConnectionResponse updateConnection(UpdateConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.updateConnection);
    }

    /**
     * 更新目标连接
     *
     * 更新目标连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateConnectionRequest 请求对象
     * @return SyncInvoker<UpdateConnectionRequest, UpdateConnectionResponse>
     */
    public SyncInvoker<UpdateConnectionRequest, UpdateConnectionResponse> updateConnectionInvoker(
        UpdateConnectionRequest request) {
        return new SyncInvoker<UpdateConnectionRequest, UpdateConnectionResponse>(request, EgMeta.updateConnection,
            hcClient);
    }

    /**
     * 更新访问端点
     *
     * update endpoint
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEndpointRequest 请求对象
     * @return UpdateEndpointResponse
     */
    public UpdateEndpointResponse updateEndpoint(UpdateEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.updateEndpoint);
    }

    /**
     * 更新访问端点
     *
     * update endpoint
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEndpointRequest 请求对象
     * @return SyncInvoker<UpdateEndpointRequest, UpdateEndpointResponse>
     */
    public SyncInvoker<UpdateEndpointRequest, UpdateEndpointResponse> updateEndpointInvoker(
        UpdateEndpointRequest request) {
        return new SyncInvoker<UpdateEndpointRequest, UpdateEndpointResponse>(request, EgMeta.updateEndpoint, hcClient);
    }

    /**
     * 更新自定义事件模型
     *
     * 更新自定义事件模型定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEventSchemaRequest 请求对象
     * @return UpdateEventSchemaResponse
     */
    public UpdateEventSchemaResponse updateEventSchema(UpdateEventSchemaRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.updateEventSchema);
    }

    /**
     * 更新自定义事件模型
     *
     * 更新自定义事件模型定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEventSchemaRequest 请求对象
     * @return SyncInvoker<UpdateEventSchemaRequest, UpdateEventSchemaResponse>
     */
    public SyncInvoker<UpdateEventSchemaRequest, UpdateEventSchemaResponse> updateEventSchemaInvoker(
        UpdateEventSchemaRequest request) {
        return new SyncInvoker<UpdateEventSchemaRequest, UpdateEventSchemaResponse>(request, EgMeta.updateEventSchema,
            hcClient);
    }

    /**
     * 更新自定义事件源
     *
     * 更新自定义事件源定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEventSourceRequest 请求对象
     * @return UpdateEventSourceResponse
     */
    public UpdateEventSourceResponse updateEventSource(UpdateEventSourceRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.updateEventSource);
    }

    /**
     * 更新自定义事件源
     *
     * 更新自定义事件源定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEventSourceRequest 请求对象
     * @return SyncInvoker<UpdateEventSourceRequest, UpdateEventSourceResponse>
     */
    public SyncInvoker<UpdateEventSourceRequest, UpdateEventSourceResponse> updateEventSourceInvoker(
        UpdateEventSourceRequest request) {
        return new SyncInvoker<UpdateEventSourceRequest, UpdateEventSourceResponse>(request, EgMeta.updateEventSource,
            hcClient);
    }

    /**
     * 更新事件订阅
     *
     * 更新事件订阅定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSubscriptionRequest 请求对象
     * @return UpdateSubscriptionResponse
     */
    public UpdateSubscriptionResponse updateSubscription(UpdateSubscriptionRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.updateSubscription);
    }

    /**
     * 更新事件订阅
     *
     * 更新事件订阅定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSubscriptionRequest 请求对象
     * @return SyncInvoker<UpdateSubscriptionRequest, UpdateSubscriptionResponse>
     */
    public SyncInvoker<UpdateSubscriptionRequest, UpdateSubscriptionResponse> updateSubscriptionInvoker(
        UpdateSubscriptionRequest request) {
        return new SyncInvoker<UpdateSubscriptionRequest, UpdateSubscriptionResponse>(request,
            EgMeta.updateSubscription, hcClient);
    }

    /**
     * 更新事件订阅源
     *
     * 更新事件订阅源定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSubscriptionSourceRequest 请求对象
     * @return UpdateSubscriptionSourceResponse
     */
    public UpdateSubscriptionSourceResponse updateSubscriptionSource(UpdateSubscriptionSourceRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.updateSubscriptionSource);
    }

    /**
     * 更新事件订阅源
     *
     * 更新事件订阅源定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSubscriptionSourceRequest 请求对象
     * @return SyncInvoker<UpdateSubscriptionSourceRequest, UpdateSubscriptionSourceResponse>
     */
    public SyncInvoker<UpdateSubscriptionSourceRequest, UpdateSubscriptionSourceResponse> updateSubscriptionSourceInvoker(
        UpdateSubscriptionSourceRequest request) {
        return new SyncInvoker<UpdateSubscriptionSourceRequest, UpdateSubscriptionSourceResponse>(request,
            EgMeta.updateSubscriptionSource, hcClient);
    }

    /**
     * 更新事件订阅目标
     *
     * 更新事件订阅目标定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSubscriptionTargetRequest 请求对象
     * @return UpdateSubscriptionTargetResponse
     */
    public UpdateSubscriptionTargetResponse updateSubscriptionTarget(UpdateSubscriptionTargetRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.updateSubscriptionTarget);
    }

    /**
     * 更新事件订阅目标
     *
     * 更新事件订阅目标定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSubscriptionTargetRequest 请求对象
     * @return SyncInvoker<UpdateSubscriptionTargetRequest, UpdateSubscriptionTargetResponse>
     */
    public SyncInvoker<UpdateSubscriptionTargetRequest, UpdateSubscriptionTargetResponse> updateSubscriptionTargetInvoker(
        UpdateSubscriptionTargetRequest request) {
        return new SyncInvoker<UpdateSubscriptionTargetRequest, UpdateSubscriptionTargetResponse>(request,
            EgMeta.updateSubscriptionTarget, hcClient);
    }

    /**
     * 获取API版本列表
     *
     * 获取服务支持的API版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionsRequest 请求对象
     * @return ListApiVersionsResponse
     */
    public ListApiVersionsResponse listApiVersions(ListApiVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.listApiVersions);
    }

    /**
     * 获取API版本列表
     *
     * 获取服务支持的API版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionsRequest 请求对象
     * @return SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsInvoker(
        ListApiVersionsRequest request) {
        return new SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>(request, EgMeta.listApiVersions,
            hcClient);
    }

}

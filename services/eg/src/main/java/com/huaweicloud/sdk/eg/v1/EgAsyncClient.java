package com.huaweicloud.sdk.eg.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.eg.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class EgAsyncClient {

    protected HcClient hcClient;

    public EgAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EgAsyncClient> newBuilder() {
        return new ClientBuilder<>(EgAsyncClient::new);
    }

    /**
     * 预校验指定事件源发布事件成功
     *
     * 发布事件到事件源成功需要有订阅等条件，预先校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckPutEventsRequest 请求对象
     * @return CompletableFuture<CheckPutEventsResponse>
     */
    public CompletableFuture<CheckPutEventsResponse> checkPutEventsAsync(CheckPutEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.checkPutEvents);
    }

    /**
     * 预校验指定事件源发布事件成功
     *
     * 发布事件到事件源成功需要有订阅等条件，预先校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckPutEventsRequest 请求对象
     * @return AsyncInvoker<CheckPutEventsRequest, CheckPutEventsResponse>
     */
    public AsyncInvoker<CheckPutEventsRequest, CheckPutEventsResponse> checkPutEventsAsyncInvoker(
        CheckPutEventsRequest request) {
        return new AsyncInvoker<CheckPutEventsRequest, CheckPutEventsResponse>(request, EgMeta.checkPutEvents,
            hcClient);
    }

    /**
     * 创建服务委托
     *
     * 按照业务场景，一键创建服务委托授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAgenciesRequest 请求对象
     * @return CompletableFuture<CreateAgenciesResponse>
     */
    public CompletableFuture<CreateAgenciesResponse> createAgenciesAsync(CreateAgenciesRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.createAgencies);
    }

    /**
     * 创建服务委托
     *
     * 按照业务场景，一键创建服务委托授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAgenciesRequest 请求对象
     * @return AsyncInvoker<CreateAgenciesRequest, CreateAgenciesResponse>
     */
    public AsyncInvoker<CreateAgenciesRequest, CreateAgenciesResponse> createAgenciesAsyncInvoker(
        CreateAgenciesRequest request) {
        return new AsyncInvoker<CreateAgenciesRequest, CreateAgenciesResponse>(request, EgMeta.createAgencies,
            hcClient);
    }

    /**
     * 创建自定义事件通道
     *
     * 创建自定义事件通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateChannelRequest 请求对象
     * @return CompletableFuture<CreateChannelResponse>
     */
    public CompletableFuture<CreateChannelResponse> createChannelAsync(CreateChannelRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.createChannel);
    }

    /**
     * 创建自定义事件通道
     *
     * 创建自定义事件通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateChannelRequest 请求对象
     * @return AsyncInvoker<CreateChannelRequest, CreateChannelResponse>
     */
    public AsyncInvoker<CreateChannelRequest, CreateChannelResponse> createChannelAsyncInvoker(
        CreateChannelRequest request) {
        return new AsyncInvoker<CreateChannelRequest, CreateChannelResponse>(request, EgMeta.createChannel, hcClient);
    }

    /**
     * 创建目标连接
     *
     * 创建目标连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateConnectionRequest 请求对象
     * @return CompletableFuture<CreateConnectionResponse>
     */
    public CompletableFuture<CreateConnectionResponse> createConnectionAsync(CreateConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.createConnection);
    }

    /**
     * 创建目标连接
     *
     * 创建目标连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateConnectionRequest 请求对象
     * @return AsyncInvoker<CreateConnectionRequest, CreateConnectionResponse>
     */
    public AsyncInvoker<CreateConnectionRequest, CreateConnectionResponse> createConnectionAsyncInvoker(
        CreateConnectionRequest request) {
        return new AsyncInvoker<CreateConnectionRequest, CreateConnectionResponse>(request, EgMeta.createConnection,
            hcClient);
    }

    /**
     * 创建访问端点
     *
     * 创建访问端点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEndpointRequest 请求对象
     * @return CompletableFuture<CreateEndpointResponse>
     */
    public CompletableFuture<CreateEndpointResponse> createEndpointAsync(CreateEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.createEndpoint);
    }

    /**
     * 创建访问端点
     *
     * 创建访问端点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEndpointRequest 请求对象
     * @return AsyncInvoker<CreateEndpointRequest, CreateEndpointResponse>
     */
    public AsyncInvoker<CreateEndpointRequest, CreateEndpointResponse> createEndpointAsyncInvoker(
        CreateEndpointRequest request) {
        return new AsyncInvoker<CreateEndpointRequest, CreateEndpointResponse>(request, EgMeta.createEndpoint,
            hcClient);
    }

    /**
     * 创建自定义事件模型
     *
     * 创建自定义事件模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEventSchemaRequest 请求对象
     * @return CompletableFuture<CreateEventSchemaResponse>
     */
    public CompletableFuture<CreateEventSchemaResponse> createEventSchemaAsync(CreateEventSchemaRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.createEventSchema);
    }

    /**
     * 创建自定义事件模型
     *
     * 创建自定义事件模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEventSchemaRequest 请求对象
     * @return AsyncInvoker<CreateEventSchemaRequest, CreateEventSchemaResponse>
     */
    public AsyncInvoker<CreateEventSchemaRequest, CreateEventSchemaResponse> createEventSchemaAsyncInvoker(
        CreateEventSchemaRequest request) {
        return new AsyncInvoker<CreateEventSchemaRequest, CreateEventSchemaResponse>(request, EgMeta.createEventSchema,
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
     * @return CompletableFuture<CreateEventSchemaVersionResponse>
     */
    public CompletableFuture<CreateEventSchemaVersionResponse> createEventSchemaVersionAsync(
        CreateEventSchemaVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.createEventSchemaVersion);
    }

    /**
     * 创建自定义事件模型版本
     *
     * 创建自定义事件模型版本，版本号后台自动生成
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEventSchemaVersionRequest 请求对象
     * @return AsyncInvoker<CreateEventSchemaVersionRequest, CreateEventSchemaVersionResponse>
     */
    public AsyncInvoker<CreateEventSchemaVersionRequest, CreateEventSchemaVersionResponse> createEventSchemaVersionAsyncInvoker(
        CreateEventSchemaVersionRequest request) {
        return new AsyncInvoker<CreateEventSchemaVersionRequest, CreateEventSchemaVersionResponse>(request,
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
     * @return CompletableFuture<CreateEventSourceResponse>
     */
    public CompletableFuture<CreateEventSourceResponse> createEventSourceAsync(CreateEventSourceRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.createEventSource);
    }

    /**
     * 创建自定义事件源
     *
     * 创建用户自定义类型的事件源，只能指定自定义通道，不能指定系统通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEventSourceRequest 请求对象
     * @return AsyncInvoker<CreateEventSourceRequest, CreateEventSourceResponse>
     */
    public AsyncInvoker<CreateEventSourceRequest, CreateEventSourceResponse> createEventSourceAsyncInvoker(
        CreateEventSourceRequest request) {
        return new AsyncInvoker<CreateEventSourceRequest, CreateEventSourceResponse>(request, EgMeta.createEventSource,
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
     * @return CompletableFuture<CreateSubscriptionResponse>
     */
    public CompletableFuture<CreateSubscriptionResponse> createSubscriptionAsync(CreateSubscriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.createSubscription);
    }

    /**
     * 创建事件订阅
     *
     * 创建事件订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSubscriptionRequest 请求对象
     * @return AsyncInvoker<CreateSubscriptionRequest, CreateSubscriptionResponse>
     */
    public AsyncInvoker<CreateSubscriptionRequest, CreateSubscriptionResponse> createSubscriptionAsyncInvoker(
        CreateSubscriptionRequest request) {
        return new AsyncInvoker<CreateSubscriptionRequest, CreateSubscriptionResponse>(request,
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
     * @return CompletableFuture<CreateSubscriptionTargetResponse>
     */
    public CompletableFuture<CreateSubscriptionTargetResponse> createSubscriptionTargetAsync(
        CreateSubscriptionTargetRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.createSubscriptionTarget);
    }

    /**
     * 创建事件订阅目标
     *
     * 创建单个事件订阅目标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSubscriptionTargetRequest 请求对象
     * @return AsyncInvoker<CreateSubscriptionTargetRequest, CreateSubscriptionTargetResponse>
     */
    public AsyncInvoker<CreateSubscriptionTargetRequest, CreateSubscriptionTargetResponse> createSubscriptionTargetAsyncInvoker(
        CreateSubscriptionTargetRequest request) {
        return new AsyncInvoker<CreateSubscriptionTargetRequest, CreateSubscriptionTargetResponse>(request,
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
     * @return CompletableFuture<DeleteChannelResponse>
     */
    public CompletableFuture<DeleteChannelResponse> deleteChannelAsync(DeleteChannelRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.deleteChannel);
    }

    /**
     * 删除自定义事件通道
     *
     * 删除指定自定义事件通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteChannelRequest 请求对象
     * @return AsyncInvoker<DeleteChannelRequest, DeleteChannelResponse>
     */
    public AsyncInvoker<DeleteChannelRequest, DeleteChannelResponse> deleteChannelAsyncInvoker(
        DeleteChannelRequest request) {
        return new AsyncInvoker<DeleteChannelRequest, DeleteChannelResponse>(request, EgMeta.deleteChannel, hcClient);
    }

    /**
     * 删除目标连接
     *
     * 删除目标连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConnectionRequest 请求对象
     * @return CompletableFuture<DeleteConnectionResponse>
     */
    public CompletableFuture<DeleteConnectionResponse> deleteConnectionAsync(DeleteConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.deleteConnection);
    }

    /**
     * 删除目标连接
     *
     * 删除目标连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConnectionRequest 请求对象
     * @return AsyncInvoker<DeleteConnectionRequest, DeleteConnectionResponse>
     */
    public AsyncInvoker<DeleteConnectionRequest, DeleteConnectionResponse> deleteConnectionAsyncInvoker(
        DeleteConnectionRequest request) {
        return new AsyncInvoker<DeleteConnectionRequest, DeleteConnectionResponse>(request, EgMeta.deleteConnection,
            hcClient);
    }

    /**
     * 删除访问端点
     *
     * 删除访问端点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEndpointRequest 请求对象
     * @return CompletableFuture<DeleteEndpointResponse>
     */
    public CompletableFuture<DeleteEndpointResponse> deleteEndpointAsync(DeleteEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.deleteEndpoint);
    }

    /**
     * 删除访问端点
     *
     * 删除访问端点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEndpointRequest 请求对象
     * @return AsyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse>
     */
    public AsyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse> deleteEndpointAsyncInvoker(
        DeleteEndpointRequest request) {
        return new AsyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse>(request, EgMeta.deleteEndpoint,
            hcClient);
    }

    /**
     * 删除事件模型
     *
     * 删除事件模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEventSchemaRequest 请求对象
     * @return CompletableFuture<DeleteEventSchemaResponse>
     */
    public CompletableFuture<DeleteEventSchemaResponse> deleteEventSchemaAsync(DeleteEventSchemaRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.deleteEventSchema);
    }

    /**
     * 删除事件模型
     *
     * 删除事件模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEventSchemaRequest 请求对象
     * @return AsyncInvoker<DeleteEventSchemaRequest, DeleteEventSchemaResponse>
     */
    public AsyncInvoker<DeleteEventSchemaRequest, DeleteEventSchemaResponse> deleteEventSchemaAsyncInvoker(
        DeleteEventSchemaRequest request) {
        return new AsyncInvoker<DeleteEventSchemaRequest, DeleteEventSchemaResponse>(request, EgMeta.deleteEventSchema,
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
     * @return CompletableFuture<DeleteEventSchemaVersionResponse>
     */
    public CompletableFuture<DeleteEventSchemaVersionResponse> deleteEventSchemaVersionAsync(
        DeleteEventSchemaVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.deleteEventSchemaVersion);
    }

    /**
     * 删除事件模型版本
     *
     * 删除事件模型指定版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEventSchemaVersionRequest 请求对象
     * @return AsyncInvoker<DeleteEventSchemaVersionRequest, DeleteEventSchemaVersionResponse>
     */
    public AsyncInvoker<DeleteEventSchemaVersionRequest, DeleteEventSchemaVersionResponse> deleteEventSchemaVersionAsyncInvoker(
        DeleteEventSchemaVersionRequest request) {
        return new AsyncInvoker<DeleteEventSchemaVersionRequest, DeleteEventSchemaVersionResponse>(request,
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
     * @return CompletableFuture<DeleteEventSourceResponse>
     */
    public CompletableFuture<DeleteEventSourceResponse> deleteEventSourceAsync(DeleteEventSourceRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.deleteEventSource);
    }

    /**
     * 删除自定义事件源
     *
     * 删除指定的自定义事件源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEventSourceRequest 请求对象
     * @return AsyncInvoker<DeleteEventSourceRequest, DeleteEventSourceResponse>
     */
    public AsyncInvoker<DeleteEventSourceRequest, DeleteEventSourceResponse> deleteEventSourceAsyncInvoker(
        DeleteEventSourceRequest request) {
        return new AsyncInvoker<DeleteEventSourceRequest, DeleteEventSourceResponse>(request, EgMeta.deleteEventSource,
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
     * @return CompletableFuture<DeleteSubscriptionResponse>
     */
    public CompletableFuture<DeleteSubscriptionResponse> deleteSubscriptionAsync(DeleteSubscriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.deleteSubscription);
    }

    /**
     * 删除事件订阅
     *
     * 删除事件订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSubscriptionRequest 请求对象
     * @return AsyncInvoker<DeleteSubscriptionRequest, DeleteSubscriptionResponse>
     */
    public AsyncInvoker<DeleteSubscriptionRequest, DeleteSubscriptionResponse> deleteSubscriptionAsyncInvoker(
        DeleteSubscriptionRequest request) {
        return new AsyncInvoker<DeleteSubscriptionRequest, DeleteSubscriptionResponse>(request,
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
     * @return CompletableFuture<DeleteSubscriptionTargetResponse>
     */
    public CompletableFuture<DeleteSubscriptionTargetResponse> deleteSubscriptionTargetAsync(
        DeleteSubscriptionTargetRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.deleteSubscriptionTarget);
    }

    /**
     * 删除事件订阅目标
     *
     * 删除事件订阅目标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSubscriptionTargetRequest 请求对象
     * @return AsyncInvoker<DeleteSubscriptionTargetRequest, DeleteSubscriptionTargetResponse>
     */
    public AsyncInvoker<DeleteSubscriptionTargetRequest, DeleteSubscriptionTargetResponse> deleteSubscriptionTargetAsyncInvoker(
        DeleteSubscriptionTargetRequest request) {
        return new AsyncInvoker<DeleteSubscriptionTargetRequest, DeleteSubscriptionTargetResponse>(request,
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
     * @return CompletableFuture<DiscoverEventSchemaFromDataResponse>
     */
    public CompletableFuture<DiscoverEventSchemaFromDataResponse> discoverEventSchemaFromDataAsync(
        DiscoverEventSchemaFromDataRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.discoverEventSchemaFromData);
    }

    /**
     * 事件模型自动发现
     *
     * 事件模型自动发现
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DiscoverEventSchemaFromDataRequest 请求对象
     * @return AsyncInvoker<DiscoverEventSchemaFromDataRequest, DiscoverEventSchemaFromDataResponse>
     */
    public AsyncInvoker<DiscoverEventSchemaFromDataRequest, DiscoverEventSchemaFromDataResponse> discoverEventSchemaFromDataAsyncInvoker(
        DiscoverEventSchemaFromDataRequest request) {
        return new AsyncInvoker<DiscoverEventSchemaFromDataRequest, DiscoverEventSchemaFromDataResponse>(request,
            EgMeta.discoverEventSchemaFromData, hcClient);
    }

    /**
     * 查询服务委托
     *
     * 查询服务委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAgenciesRequest 请求对象
     * @return CompletableFuture<ListAgenciesResponse>
     */
    public CompletableFuture<ListAgenciesResponse> listAgenciesAsync(ListAgenciesRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.listAgencies);
    }

    /**
     * 查询服务委托
     *
     * 查询服务委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAgenciesRequest 请求对象
     * @return AsyncInvoker<ListAgenciesRequest, ListAgenciesResponse>
     */
    public AsyncInvoker<ListAgenciesRequest, ListAgenciesResponse> listAgenciesAsyncInvoker(
        ListAgenciesRequest request) {
        return new AsyncInvoker<ListAgenciesRequest, ListAgenciesResponse>(request, EgMeta.listAgencies, hcClient);
    }

    /**
     * 查询事件通道列表
     *
     * 查询事件通道列表，包括系统通道和自定义通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListChannelsRequest 请求对象
     * @return CompletableFuture<ListChannelsResponse>
     */
    public CompletableFuture<ListChannelsResponse> listChannelsAsync(ListChannelsRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.listChannels);
    }

    /**
     * 查询事件通道列表
     *
     * 查询事件通道列表，包括系统通道和自定义通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListChannelsRequest 请求对象
     * @return AsyncInvoker<ListChannelsRequest, ListChannelsResponse>
     */
    public AsyncInvoker<ListChannelsRequest, ListChannelsResponse> listChannelsAsyncInvoker(
        ListChannelsRequest request) {
        return new AsyncInvoker<ListChannelsRequest, ListChannelsResponse>(request, EgMeta.listChannels, hcClient);
    }

    /**
     * 查询目标连接列表
     *
     * 查询目标连接列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConnectionsRequest 请求对象
     * @return CompletableFuture<ListConnectionsResponse>
     */
    public CompletableFuture<ListConnectionsResponse> listConnectionsAsync(ListConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.listConnections);
    }

    /**
     * 查询目标连接列表
     *
     * 查询目标连接列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConnectionsRequest 请求对象
     * @return AsyncInvoker<ListConnectionsRequest, ListConnectionsResponse>
     */
    public AsyncInvoker<ListConnectionsRequest, ListConnectionsResponse> listConnectionsAsyncInvoker(
        ListConnectionsRequest request) {
        return new AsyncInvoker<ListConnectionsRequest, ListConnectionsResponse>(request, EgMeta.listConnections,
            hcClient);
    }

    /**
     * 查询访问端点
     *
     * 查询访问端点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEndpointsRequest 请求对象
     * @return CompletableFuture<ListEndpointsResponse>
     */
    public CompletableFuture<ListEndpointsResponse> listEndpointsAsync(ListEndpointsRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.listEndpoints);
    }

    /**
     * 查询访问端点
     *
     * 查询访问端点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEndpointsRequest 请求对象
     * @return AsyncInvoker<ListEndpointsRequest, ListEndpointsResponse>
     */
    public AsyncInvoker<ListEndpointsRequest, ListEndpointsResponse> listEndpointsAsyncInvoker(
        ListEndpointsRequest request) {
        return new AsyncInvoker<ListEndpointsRequest, ListEndpointsResponse>(request, EgMeta.listEndpoints, hcClient);
    }

    /**
     * 查询事件模型列表
     *
     * 查询事件模型列表，包括系统事件模型和自定义事件模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEventSchemaRequest 请求对象
     * @return CompletableFuture<ListEventSchemaResponse>
     */
    public CompletableFuture<ListEventSchemaResponse> listEventSchemaAsync(ListEventSchemaRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.listEventSchema);
    }

    /**
     * 查询事件模型列表
     *
     * 查询事件模型列表，包括系统事件模型和自定义事件模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEventSchemaRequest 请求对象
     * @return AsyncInvoker<ListEventSchemaRequest, ListEventSchemaResponse>
     */
    public AsyncInvoker<ListEventSchemaRequest, ListEventSchemaResponse> listEventSchemaAsyncInvoker(
        ListEventSchemaRequest request) {
        return new AsyncInvoker<ListEventSchemaRequest, ListEventSchemaResponse>(request, EgMeta.listEventSchema,
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
     * @return CompletableFuture<ListEventSchemaVersionsResponse>
     */
    public CompletableFuture<ListEventSchemaVersionsResponse> listEventSchemaVersionsAsync(
        ListEventSchemaVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.listEventSchemaVersions);
    }

    /**
     * 查询事件模型版本列表
     *
     * 查询事件模型版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEventSchemaVersionsRequest 请求对象
     * @return AsyncInvoker<ListEventSchemaVersionsRequest, ListEventSchemaVersionsResponse>
     */
    public AsyncInvoker<ListEventSchemaVersionsRequest, ListEventSchemaVersionsResponse> listEventSchemaVersionsAsyncInvoker(
        ListEventSchemaVersionsRequest request) {
        return new AsyncInvoker<ListEventSchemaVersionsRequest, ListEventSchemaVersionsResponse>(request,
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
     * @return CompletableFuture<ListEventSourcesResponse>
     */
    public CompletableFuture<ListEventSourcesResponse> listEventSourcesAsync(ListEventSourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.listEventSources);
    }

    /**
     * 查询事件源列表
     *
     * 支持条件查询，如可以指定事件通道ID来查询某个事件通道下的所有事件源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEventSourcesRequest 请求对象
     * @return AsyncInvoker<ListEventSourcesRequest, ListEventSourcesResponse>
     */
    public AsyncInvoker<ListEventSourcesRequest, ListEventSourcesResponse> listEventSourcesAsyncInvoker(
        ListEventSourcesRequest request) {
        return new AsyncInvoker<ListEventSourcesRequest, ListEventSourcesResponse>(request, EgMeta.listEventSources,
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
     * @return CompletableFuture<ListEventTargetResponse>
     */
    public CompletableFuture<ListEventTargetResponse> listEventTargetAsync(ListEventTargetRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.listEventTarget);
    }

    /**
     * 查询事件目标分类
     *
     * 查询预置的事件目标分类，获取每个事件目标分类的字段定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEventTargetRequest 请求对象
     * @return AsyncInvoker<ListEventTargetRequest, ListEventTargetResponse>
     */
    public AsyncInvoker<ListEventTargetRequest, ListEventTargetResponse> listEventTargetAsyncInvoker(
        ListEventTargetRequest request) {
        return new AsyncInvoker<ListEventTargetRequest, ListEventTargetResponse>(request, EgMeta.listEventTarget,
            hcClient);
    }

    /**
     * 查询事件通道监控指标数据
     *
     * 查询事件通道监控指标数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPubMetricsRequest 请求对象
     * @return CompletableFuture<ListPubMetricsResponse>
     */
    public CompletableFuture<ListPubMetricsResponse> listPubMetricsAsync(ListPubMetricsRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.listPubMetrics);
    }

    /**
     * 查询事件通道监控指标数据
     *
     * 查询事件通道监控指标数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPubMetricsRequest 请求对象
     * @return AsyncInvoker<ListPubMetricsRequest, ListPubMetricsResponse>
     */
    public AsyncInvoker<ListPubMetricsRequest, ListPubMetricsResponse> listPubMetricsAsyncInvoker(
        ListPubMetricsRequest request) {
        return new AsyncInvoker<ListPubMetricsRequest, ListPubMetricsResponse>(request, EgMeta.listPubMetrics,
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
     * @return CompletableFuture<ListQuotasResponse>
     */
    public CompletableFuture<ListQuotasResponse> listQuotasAsync(ListQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.listQuotas);
    }

    /**
     * 查询配额
     *
     * 查询当前租户的配额，未特殊配置过的会返回默认配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
     * @return AsyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public AsyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasAsyncInvoker(ListQuotasRequest request) {
        return new AsyncInvoker<ListQuotasRequest, ListQuotasResponse>(request, EgMeta.listQuotas, hcClient);
    }

    /**
     * 查询事件订阅监控指标数据
     *
     * 查询事件订阅监控指标数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSubMetricsRequest 请求对象
     * @return CompletableFuture<ListSubMetricsResponse>
     */
    public CompletableFuture<ListSubMetricsResponse> listSubMetricsAsync(ListSubMetricsRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.listSubMetrics);
    }

    /**
     * 查询事件订阅监控指标数据
     *
     * 查询事件订阅监控指标数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSubMetricsRequest 请求对象
     * @return AsyncInvoker<ListSubMetricsRequest, ListSubMetricsResponse>
     */
    public AsyncInvoker<ListSubMetricsRequest, ListSubMetricsResponse> listSubMetricsAsyncInvoker(
        ListSubMetricsRequest request) {
        return new AsyncInvoker<ListSubMetricsRequest, ListSubMetricsResponse>(request, EgMeta.listSubMetrics,
            hcClient);
    }

    /**
     * 查询事件订阅列表
     *
     * 查询事件订阅列表，支持指定事件通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSubscriptionsRequest 请求对象
     * @return CompletableFuture<ListSubscriptionsResponse>
     */
    public CompletableFuture<ListSubscriptionsResponse> listSubscriptionsAsync(ListSubscriptionsRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.listSubscriptions);
    }

    /**
     * 查询事件订阅列表
     *
     * 查询事件订阅列表，支持指定事件通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSubscriptionsRequest 请求对象
     * @return AsyncInvoker<ListSubscriptionsRequest, ListSubscriptionsResponse>
     */
    public AsyncInvoker<ListSubscriptionsRequest, ListSubscriptionsResponse> listSubscriptionsAsyncInvoker(
        ListSubscriptionsRequest request) {
        return new AsyncInvoker<ListSubscriptionsRequest, ListSubscriptionsResponse>(request, EgMeta.listSubscriptions,
            hcClient);
    }

    /**
     * 查询单个函数的EG触发器
     *
     * 查询触发器，支持指定函数urn。一个以函数urn为目标的订阅为一个触发器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTriggersRequest 请求对象
     * @return CompletableFuture<ListTriggersResponse>
     */
    public CompletableFuture<ListTriggersResponse> listTriggersAsync(ListTriggersRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.listTriggers);
    }

    /**
     * 查询单个函数的EG触发器
     *
     * 查询触发器，支持指定函数urn。一个以函数urn为目标的订阅为一个触发器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTriggersRequest 请求对象
     * @return AsyncInvoker<ListTriggersRequest, ListTriggersResponse>
     */
    public AsyncInvoker<ListTriggersRequest, ListTriggersResponse> listTriggersAsyncInvoker(
        ListTriggersRequest request) {
        return new AsyncInvoker<ListTriggersRequest, ListTriggersResponse>(request, EgMeta.listTriggers, hcClient);
    }

    /**
     * 查询单个函数流的EG触发器
     *
     * 查询触发器，支持指定函数流id。一个以函数流id为目标的订阅为一个触发器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkflowTriggersRequest 请求对象
     * @return CompletableFuture<ListWorkflowTriggersResponse>
     */
    public CompletableFuture<ListWorkflowTriggersResponse> listWorkflowTriggersAsync(
        ListWorkflowTriggersRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.listWorkflowTriggers);
    }

    /**
     * 查询单个函数流的EG触发器
     *
     * 查询触发器，支持指定函数流id。一个以函数流id为目标的订阅为一个触发器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWorkflowTriggersRequest 请求对象
     * @return AsyncInvoker<ListWorkflowTriggersRequest, ListWorkflowTriggersResponse>
     */
    public AsyncInvoker<ListWorkflowTriggersRequest, ListWorkflowTriggersResponse> listWorkflowTriggersAsyncInvoker(
        ListWorkflowTriggersRequest request) {
        return new AsyncInvoker<ListWorkflowTriggersRequest, ListWorkflowTriggersResponse>(request,
            EgMeta.listWorkflowTriggers, hcClient);
    }

    /**
     * 操作事件订阅
     *
     * 操作事件订阅，支持启用、禁用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param OperateSubscriptionRequest 请求对象
     * @return CompletableFuture<OperateSubscriptionResponse>
     */
    public CompletableFuture<OperateSubscriptionResponse> operateSubscriptionAsync(OperateSubscriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.operateSubscription);
    }

    /**
     * 操作事件订阅
     *
     * 操作事件订阅，支持启用、禁用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param OperateSubscriptionRequest 请求对象
     * @return AsyncInvoker<OperateSubscriptionRequest, OperateSubscriptionResponse>
     */
    public AsyncInvoker<OperateSubscriptionRequest, OperateSubscriptionResponse> operateSubscriptionAsyncInvoker(
        OperateSubscriptionRequest request) {
        return new AsyncInvoker<OperateSubscriptionRequest, OperateSubscriptionResponse>(request,
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
     * @return CompletableFuture<PutEventsResponse>
     */
    public CompletableFuture<PutEventsResponse> putEventsAsync(PutEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.putEvents);
    }

    /**
     * 发布事件到事件通道
     *
     * 发布事件到事件通道
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PutEventsRequest 请求对象
     * @return AsyncInvoker<PutEventsRequest, PutEventsResponse>
     */
    public AsyncInvoker<PutEventsRequest, PutEventsResponse> putEventsAsyncInvoker(PutEventsRequest request) {
        return new AsyncInvoker<PutEventsRequest, PutEventsResponse>(request, EgMeta.putEvents, hcClient);
    }

    /**
     * 查询事件通道详情
     *
     * 查询指定事件通道详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailOfChannelRequest 请求对象
     * @return CompletableFuture<ShowDetailOfChannelResponse>
     */
    public CompletableFuture<ShowDetailOfChannelResponse> showDetailOfChannelAsync(ShowDetailOfChannelRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.showDetailOfChannel);
    }

    /**
     * 查询事件通道详情
     *
     * 查询指定事件通道详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailOfChannelRequest 请求对象
     * @return AsyncInvoker<ShowDetailOfChannelRequest, ShowDetailOfChannelResponse>
     */
    public AsyncInvoker<ShowDetailOfChannelRequest, ShowDetailOfChannelResponse> showDetailOfChannelAsyncInvoker(
        ShowDetailOfChannelRequest request) {
        return new AsyncInvoker<ShowDetailOfChannelRequest, ShowDetailOfChannelResponse>(request,
            EgMeta.showDetailOfChannel, hcClient);
    }

    /**
     * 查询目标连接详情
     *
     * 查询目标连接详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailOfConnectionRequest 请求对象
     * @return CompletableFuture<ShowDetailOfConnectionResponse>
     */
    public CompletableFuture<ShowDetailOfConnectionResponse> showDetailOfConnectionAsync(
        ShowDetailOfConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.showDetailOfConnection);
    }

    /**
     * 查询目标连接详情
     *
     * 查询目标连接详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailOfConnectionRequest 请求对象
     * @return AsyncInvoker<ShowDetailOfConnectionRequest, ShowDetailOfConnectionResponse>
     */
    public AsyncInvoker<ShowDetailOfConnectionRequest, ShowDetailOfConnectionResponse> showDetailOfConnectionAsyncInvoker(
        ShowDetailOfConnectionRequest request) {
        return new AsyncInvoker<ShowDetailOfConnectionRequest, ShowDetailOfConnectionResponse>(request,
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
     * @return CompletableFuture<ShowDetailOfEventSchemaResponse>
     */
    public CompletableFuture<ShowDetailOfEventSchemaResponse> showDetailOfEventSchemaAsync(
        ShowDetailOfEventSchemaRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.showDetailOfEventSchema);
    }

    /**
     * 查询事件模型详情
     *
     * 查询事件模型详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailOfEventSchemaRequest 请求对象
     * @return AsyncInvoker<ShowDetailOfEventSchemaRequest, ShowDetailOfEventSchemaResponse>
     */
    public AsyncInvoker<ShowDetailOfEventSchemaRequest, ShowDetailOfEventSchemaResponse> showDetailOfEventSchemaAsyncInvoker(
        ShowDetailOfEventSchemaRequest request) {
        return new AsyncInvoker<ShowDetailOfEventSchemaRequest, ShowDetailOfEventSchemaResponse>(request,
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
     * @return CompletableFuture<ShowDetailOfEventSchemaVersionResponse>
     */
    public CompletableFuture<ShowDetailOfEventSchemaVersionResponse> showDetailOfEventSchemaVersionAsync(
        ShowDetailOfEventSchemaVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.showDetailOfEventSchemaVersion);
    }

    /**
     * 查询事件模型版本详情
     *
     * 查询事件模型指定版本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailOfEventSchemaVersionRequest 请求对象
     * @return AsyncInvoker<ShowDetailOfEventSchemaVersionRequest, ShowDetailOfEventSchemaVersionResponse>
     */
    public AsyncInvoker<ShowDetailOfEventSchemaVersionRequest, ShowDetailOfEventSchemaVersionResponse> showDetailOfEventSchemaVersionAsyncInvoker(
        ShowDetailOfEventSchemaVersionRequest request) {
        return new AsyncInvoker<ShowDetailOfEventSchemaVersionRequest, ShowDetailOfEventSchemaVersionResponse>(request,
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
     * @return CompletableFuture<ShowDetailOfEventSourceResponse>
     */
    public CompletableFuture<ShowDetailOfEventSourceResponse> showDetailOfEventSourceAsync(
        ShowDetailOfEventSourceRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.showDetailOfEventSource);
    }

    /**
     * 查询事件源详情
     *
     * 查询事件源详情信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailOfEventSourceRequest 请求对象
     * @return AsyncInvoker<ShowDetailOfEventSourceRequest, ShowDetailOfEventSourceResponse>
     */
    public AsyncInvoker<ShowDetailOfEventSourceRequest, ShowDetailOfEventSourceResponse> showDetailOfEventSourceAsyncInvoker(
        ShowDetailOfEventSourceRequest request) {
        return new AsyncInvoker<ShowDetailOfEventSourceRequest, ShowDetailOfEventSourceResponse>(request,
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
     * @return CompletableFuture<ShowDetailOfSubscriptionResponse>
     */
    public CompletableFuture<ShowDetailOfSubscriptionResponse> showDetailOfSubscriptionAsync(
        ShowDetailOfSubscriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.showDetailOfSubscription);
    }

    /**
     * 查询事件订阅详情
     *
     * 查询事件订阅详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailOfSubscriptionRequest 请求对象
     * @return AsyncInvoker<ShowDetailOfSubscriptionRequest, ShowDetailOfSubscriptionResponse>
     */
    public AsyncInvoker<ShowDetailOfSubscriptionRequest, ShowDetailOfSubscriptionResponse> showDetailOfSubscriptionAsyncInvoker(
        ShowDetailOfSubscriptionRequest request) {
        return new AsyncInvoker<ShowDetailOfSubscriptionRequest, ShowDetailOfSubscriptionResponse>(request,
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
     * @return CompletableFuture<ShowDetailOfSubscriptionTargetResponse>
     */
    public CompletableFuture<ShowDetailOfSubscriptionTargetResponse> showDetailOfSubscriptionTargetAsync(
        ShowDetailOfSubscriptionTargetRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.showDetailOfSubscriptionTarget);
    }

    /**
     * 查询事件订阅目标详情
     *
     * 查询事件订阅目标详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDetailOfSubscriptionTargetRequest 请求对象
     * @return AsyncInvoker<ShowDetailOfSubscriptionTargetRequest, ShowDetailOfSubscriptionTargetResponse>
     */
    public AsyncInvoker<ShowDetailOfSubscriptionTargetRequest, ShowDetailOfSubscriptionTargetResponse> showDetailOfSubscriptionTargetAsyncInvoker(
        ShowDetailOfSubscriptionTargetRequest request) {
        return new AsyncInvoker<ShowDetailOfSubscriptionTargetRequest, ShowDetailOfSubscriptionTargetResponse>(request,
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
     * @return CompletableFuture<UpdateChannelResponse>
     */
    public CompletableFuture<UpdateChannelResponse> updateChannelAsync(UpdateChannelRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.updateChannel);
    }

    /**
     * 更新自定义事件通道
     *
     * 更新自定义事件通道定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateChannelRequest 请求对象
     * @return AsyncInvoker<UpdateChannelRequest, UpdateChannelResponse>
     */
    public AsyncInvoker<UpdateChannelRequest, UpdateChannelResponse> updateChannelAsyncInvoker(
        UpdateChannelRequest request) {
        return new AsyncInvoker<UpdateChannelRequest, UpdateChannelResponse>(request, EgMeta.updateChannel, hcClient);
    }

    /**
     * 更新目标连接
     *
     * 更新目标连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateConnectionRequest 请求对象
     * @return CompletableFuture<UpdateConnectionResponse>
     */
    public CompletableFuture<UpdateConnectionResponse> updateConnectionAsync(UpdateConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.updateConnection);
    }

    /**
     * 更新目标连接
     *
     * 更新目标连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateConnectionRequest 请求对象
     * @return AsyncInvoker<UpdateConnectionRequest, UpdateConnectionResponse>
     */
    public AsyncInvoker<UpdateConnectionRequest, UpdateConnectionResponse> updateConnectionAsyncInvoker(
        UpdateConnectionRequest request) {
        return new AsyncInvoker<UpdateConnectionRequest, UpdateConnectionResponse>(request, EgMeta.updateConnection,
            hcClient);
    }

    /**
     * 更新访问端点
     *
     * 更新访问端点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEndpointRequest 请求对象
     * @return CompletableFuture<UpdateEndpointResponse>
     */
    public CompletableFuture<UpdateEndpointResponse> updateEndpointAsync(UpdateEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.updateEndpoint);
    }

    /**
     * 更新访问端点
     *
     * 更新访问端点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEndpointRequest 请求对象
     * @return AsyncInvoker<UpdateEndpointRequest, UpdateEndpointResponse>
     */
    public AsyncInvoker<UpdateEndpointRequest, UpdateEndpointResponse> updateEndpointAsyncInvoker(
        UpdateEndpointRequest request) {
        return new AsyncInvoker<UpdateEndpointRequest, UpdateEndpointResponse>(request, EgMeta.updateEndpoint,
            hcClient);
    }

    /**
     * 更新自定义事件模型
     *
     * 更新自定义事件模型定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEventSchemaRequest 请求对象
     * @return CompletableFuture<UpdateEventSchemaResponse>
     */
    public CompletableFuture<UpdateEventSchemaResponse> updateEventSchemaAsync(UpdateEventSchemaRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.updateEventSchema);
    }

    /**
     * 更新自定义事件模型
     *
     * 更新自定义事件模型定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEventSchemaRequest 请求对象
     * @return AsyncInvoker<UpdateEventSchemaRequest, UpdateEventSchemaResponse>
     */
    public AsyncInvoker<UpdateEventSchemaRequest, UpdateEventSchemaResponse> updateEventSchemaAsyncInvoker(
        UpdateEventSchemaRequest request) {
        return new AsyncInvoker<UpdateEventSchemaRequest, UpdateEventSchemaResponse>(request, EgMeta.updateEventSchema,
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
     * @return CompletableFuture<UpdateEventSourceResponse>
     */
    public CompletableFuture<UpdateEventSourceResponse> updateEventSourceAsync(UpdateEventSourceRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.updateEventSource);
    }

    /**
     * 更新自定义事件源
     *
     * 更新自定义事件源定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEventSourceRequest 请求对象
     * @return AsyncInvoker<UpdateEventSourceRequest, UpdateEventSourceResponse>
     */
    public AsyncInvoker<UpdateEventSourceRequest, UpdateEventSourceResponse> updateEventSourceAsyncInvoker(
        UpdateEventSourceRequest request) {
        return new AsyncInvoker<UpdateEventSourceRequest, UpdateEventSourceResponse>(request, EgMeta.updateEventSource,
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
     * @return CompletableFuture<UpdateSubscriptionResponse>
     */
    public CompletableFuture<UpdateSubscriptionResponse> updateSubscriptionAsync(UpdateSubscriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.updateSubscription);
    }

    /**
     * 更新事件订阅
     *
     * 更新事件订阅定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSubscriptionRequest 请求对象
     * @return AsyncInvoker<UpdateSubscriptionRequest, UpdateSubscriptionResponse>
     */
    public AsyncInvoker<UpdateSubscriptionRequest, UpdateSubscriptionResponse> updateSubscriptionAsyncInvoker(
        UpdateSubscriptionRequest request) {
        return new AsyncInvoker<UpdateSubscriptionRequest, UpdateSubscriptionResponse>(request,
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
     * @return CompletableFuture<UpdateSubscriptionSourceResponse>
     */
    public CompletableFuture<UpdateSubscriptionSourceResponse> updateSubscriptionSourceAsync(
        UpdateSubscriptionSourceRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.updateSubscriptionSource);
    }

    /**
     * 更新事件订阅源
     *
     * 更新事件订阅源定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSubscriptionSourceRequest 请求对象
     * @return AsyncInvoker<UpdateSubscriptionSourceRequest, UpdateSubscriptionSourceResponse>
     */
    public AsyncInvoker<UpdateSubscriptionSourceRequest, UpdateSubscriptionSourceResponse> updateSubscriptionSourceAsyncInvoker(
        UpdateSubscriptionSourceRequest request) {
        return new AsyncInvoker<UpdateSubscriptionSourceRequest, UpdateSubscriptionSourceResponse>(request,
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
     * @return CompletableFuture<UpdateSubscriptionTargetResponse>
     */
    public CompletableFuture<UpdateSubscriptionTargetResponse> updateSubscriptionTargetAsync(
        UpdateSubscriptionTargetRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.updateSubscriptionTarget);
    }

    /**
     * 更新事件订阅目标
     *
     * 更新事件订阅目标定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSubscriptionTargetRequest 请求对象
     * @return AsyncInvoker<UpdateSubscriptionTargetRequest, UpdateSubscriptionTargetResponse>
     */
    public AsyncInvoker<UpdateSubscriptionTargetRequest, UpdateSubscriptionTargetResponse> updateSubscriptionTargetAsyncInvoker(
        UpdateSubscriptionTargetRequest request) {
        return new AsyncInvoker<UpdateSubscriptionTargetRequest, UpdateSubscriptionTargetResponse>(request,
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
     * @return CompletableFuture<ListApiVersionsResponse>
     */
    public CompletableFuture<ListApiVersionsResponse> listApiVersionsAsync(ListApiVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.listApiVersions);
    }

    /**
     * 获取API版本列表
     *
     * 获取服务支持的API版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionsRequest 请求对象
     * @return AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsAsyncInvoker(
        ListApiVersionsRequest request) {
        return new AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>(request, EgMeta.listApiVersions,
            hcClient);
    }

    /**
     * 获取obs桶列表
     *
     * 获取obs桶列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListObsBucketsRequest 请求对象
     * @return CompletableFuture<ListObsBucketsResponse>
     */
    public CompletableFuture<ListObsBucketsResponse> listObsBucketsAsync(ListObsBucketsRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.listObsBuckets);
    }

    /**
     * 获取obs桶列表
     *
     * 获取obs桶列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListObsBucketsRequest 请求对象
     * @return AsyncInvoker<ListObsBucketsRequest, ListObsBucketsResponse>
     */
    public AsyncInvoker<ListObsBucketsRequest, ListObsBucketsResponse> listObsBucketsAsyncInvoker(
        ListObsBucketsRequest request) {
        return new AsyncInvoker<ListObsBucketsRequest, ListObsBucketsResponse>(request, EgMeta.listObsBuckets,
            hcClient);
    }

}

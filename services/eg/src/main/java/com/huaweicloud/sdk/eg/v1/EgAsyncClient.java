package com.huaweicloud.sdk.eg.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.eg.v1.model.CheckPutEventsRequest;
import com.huaweicloud.sdk.eg.v1.model.CheckPutEventsResponse;
import com.huaweicloud.sdk.eg.v1.model.CreateAgenciesRequest;
import com.huaweicloud.sdk.eg.v1.model.CreateAgenciesResponse;
import com.huaweicloud.sdk.eg.v1.model.CreateChannelRequest;
import com.huaweicloud.sdk.eg.v1.model.CreateChannelResponse;
import com.huaweicloud.sdk.eg.v1.model.CreateConnectionRequest;
import com.huaweicloud.sdk.eg.v1.model.CreateConnectionResponse;
import com.huaweicloud.sdk.eg.v1.model.CreateEndpointRequest;
import com.huaweicloud.sdk.eg.v1.model.CreateEndpointResponse;
import com.huaweicloud.sdk.eg.v1.model.CreateEventSchemaRequest;
import com.huaweicloud.sdk.eg.v1.model.CreateEventSchemaResponse;
import com.huaweicloud.sdk.eg.v1.model.CreateEventSchemaVersionRequest;
import com.huaweicloud.sdk.eg.v1.model.CreateEventSchemaVersionResponse;
import com.huaweicloud.sdk.eg.v1.model.CreateEventSourceRequest;
import com.huaweicloud.sdk.eg.v1.model.CreateEventSourceResponse;
import com.huaweicloud.sdk.eg.v1.model.CreateEventStreamingRequest;
import com.huaweicloud.sdk.eg.v1.model.CreateEventStreamingResponse;
import com.huaweicloud.sdk.eg.v1.model.CreateSubscriptionRequest;
import com.huaweicloud.sdk.eg.v1.model.CreateSubscriptionResponse;
import com.huaweicloud.sdk.eg.v1.model.CreateSubscriptionTargetRequest;
import com.huaweicloud.sdk.eg.v1.model.CreateSubscriptionTargetResponse;
import com.huaweicloud.sdk.eg.v1.model.DeleteChannelRequest;
import com.huaweicloud.sdk.eg.v1.model.DeleteChannelResponse;
import com.huaweicloud.sdk.eg.v1.model.DeleteConnectionRequest;
import com.huaweicloud.sdk.eg.v1.model.DeleteConnectionResponse;
import com.huaweicloud.sdk.eg.v1.model.DeleteEndpointRequest;
import com.huaweicloud.sdk.eg.v1.model.DeleteEndpointResponse;
import com.huaweicloud.sdk.eg.v1.model.DeleteEventSchemaRequest;
import com.huaweicloud.sdk.eg.v1.model.DeleteEventSchemaResponse;
import com.huaweicloud.sdk.eg.v1.model.DeleteEventSchemaVersionRequest;
import com.huaweicloud.sdk.eg.v1.model.DeleteEventSchemaVersionResponse;
import com.huaweicloud.sdk.eg.v1.model.DeleteEventSourceRequest;
import com.huaweicloud.sdk.eg.v1.model.DeleteEventSourceResponse;
import com.huaweicloud.sdk.eg.v1.model.DeleteEventStreamingRequest;
import com.huaweicloud.sdk.eg.v1.model.DeleteEventStreamingResponse;
import com.huaweicloud.sdk.eg.v1.model.DeleteSubscriptionRequest;
import com.huaweicloud.sdk.eg.v1.model.DeleteSubscriptionResponse;
import com.huaweicloud.sdk.eg.v1.model.DeleteSubscriptionTargetRequest;
import com.huaweicloud.sdk.eg.v1.model.DeleteSubscriptionTargetResponse;
import com.huaweicloud.sdk.eg.v1.model.DiscoverEventSchemaFromDataRequest;
import com.huaweicloud.sdk.eg.v1.model.DiscoverEventSchemaFromDataResponse;
import com.huaweicloud.sdk.eg.v1.model.ListAgenciesRequest;
import com.huaweicloud.sdk.eg.v1.model.ListAgenciesResponse;
import com.huaweicloud.sdk.eg.v1.model.ListApiVersionsRequest;
import com.huaweicloud.sdk.eg.v1.model.ListApiVersionsResponse;
import com.huaweicloud.sdk.eg.v1.model.ListChannelsRequest;
import com.huaweicloud.sdk.eg.v1.model.ListChannelsResponse;
import com.huaweicloud.sdk.eg.v1.model.ListConnectionsRequest;
import com.huaweicloud.sdk.eg.v1.model.ListConnectionsResponse;
import com.huaweicloud.sdk.eg.v1.model.ListEndpointsRequest;
import com.huaweicloud.sdk.eg.v1.model.ListEndpointsResponse;
import com.huaweicloud.sdk.eg.v1.model.ListEventSchemaRequest;
import com.huaweicloud.sdk.eg.v1.model.ListEventSchemaResponse;
import com.huaweicloud.sdk.eg.v1.model.ListEventSchemaVersionsRequest;
import com.huaweicloud.sdk.eg.v1.model.ListEventSchemaVersionsResponse;
import com.huaweicloud.sdk.eg.v1.model.ListEventSourcesRequest;
import com.huaweicloud.sdk.eg.v1.model.ListEventSourcesResponse;
import com.huaweicloud.sdk.eg.v1.model.ListEventStreamingRequest;
import com.huaweicloud.sdk.eg.v1.model.ListEventStreamingResponse;
import com.huaweicloud.sdk.eg.v1.model.ListEventTargetRequest;
import com.huaweicloud.sdk.eg.v1.model.ListEventTargetResponse;
import com.huaweicloud.sdk.eg.v1.model.ListObsBucketsRequest;
import com.huaweicloud.sdk.eg.v1.model.ListObsBucketsResponse;
import com.huaweicloud.sdk.eg.v1.model.ListPubMetricsRequest;
import com.huaweicloud.sdk.eg.v1.model.ListPubMetricsResponse;
import com.huaweicloud.sdk.eg.v1.model.ListQuotasRequest;
import com.huaweicloud.sdk.eg.v1.model.ListQuotasResponse;
import com.huaweicloud.sdk.eg.v1.model.ListSubMetricsRequest;
import com.huaweicloud.sdk.eg.v1.model.ListSubMetricsResponse;
import com.huaweicloud.sdk.eg.v1.model.ListSubscriptionsRequest;
import com.huaweicloud.sdk.eg.v1.model.ListSubscriptionsResponse;
import com.huaweicloud.sdk.eg.v1.model.ListTracedEventsRequest;
import com.huaweicloud.sdk.eg.v1.model.ListTracedEventsResponse;
import com.huaweicloud.sdk.eg.v1.model.ListTriggersRequest;
import com.huaweicloud.sdk.eg.v1.model.ListTriggersResponse;
import com.huaweicloud.sdk.eg.v1.model.ListWorkflowTriggersRequest;
import com.huaweicloud.sdk.eg.v1.model.ListWorkflowTriggersResponse;
import com.huaweicloud.sdk.eg.v1.model.OperateSubscriptionRequest;
import com.huaweicloud.sdk.eg.v1.model.OperateSubscriptionResponse;
import com.huaweicloud.sdk.eg.v1.model.PutEventsRequest;
import com.huaweicloud.sdk.eg.v1.model.PutEventsResponse;
import com.huaweicloud.sdk.eg.v1.model.PutOfficialEventsRequest;
import com.huaweicloud.sdk.eg.v1.model.PutOfficialEventsResponse;
import com.huaweicloud.sdk.eg.v1.model.ResumeEventStreamingRequest;
import com.huaweicloud.sdk.eg.v1.model.ResumeEventStreamingResponse;
import com.huaweicloud.sdk.eg.v1.model.ShowDetailOfChannelRequest;
import com.huaweicloud.sdk.eg.v1.model.ShowDetailOfChannelResponse;
import com.huaweicloud.sdk.eg.v1.model.ShowDetailOfConnectionRequest;
import com.huaweicloud.sdk.eg.v1.model.ShowDetailOfConnectionResponse;
import com.huaweicloud.sdk.eg.v1.model.ShowDetailOfEventRequest;
import com.huaweicloud.sdk.eg.v1.model.ShowDetailOfEventResponse;
import com.huaweicloud.sdk.eg.v1.model.ShowDetailOfEventSchemaRequest;
import com.huaweicloud.sdk.eg.v1.model.ShowDetailOfEventSchemaResponse;
import com.huaweicloud.sdk.eg.v1.model.ShowDetailOfEventSchemaVersionRequest;
import com.huaweicloud.sdk.eg.v1.model.ShowDetailOfEventSchemaVersionResponse;
import com.huaweicloud.sdk.eg.v1.model.ShowDetailOfEventSourceRequest;
import com.huaweicloud.sdk.eg.v1.model.ShowDetailOfEventSourceResponse;
import com.huaweicloud.sdk.eg.v1.model.ShowDetailOfEventTraceRequest;
import com.huaweicloud.sdk.eg.v1.model.ShowDetailOfEventTraceResponse;
import com.huaweicloud.sdk.eg.v1.model.ShowDetailOfSubscriptionRequest;
import com.huaweicloud.sdk.eg.v1.model.ShowDetailOfSubscriptionResponse;
import com.huaweicloud.sdk.eg.v1.model.ShowDetailOfSubscriptionTargetRequest;
import com.huaweicloud.sdk.eg.v1.model.ShowDetailOfSubscriptionTargetResponse;
import com.huaweicloud.sdk.eg.v1.model.ShowEventStreamingRequest;
import com.huaweicloud.sdk.eg.v1.model.ShowEventStreamingResponse;
import com.huaweicloud.sdk.eg.v1.model.ShowListOfEventSampleRequest;
import com.huaweicloud.sdk.eg.v1.model.ShowListOfEventSampleResponse;
import com.huaweicloud.sdk.eg.v1.model.UpdateChannelRequest;
import com.huaweicloud.sdk.eg.v1.model.UpdateChannelResponse;
import com.huaweicloud.sdk.eg.v1.model.UpdateConnectionRequest;
import com.huaweicloud.sdk.eg.v1.model.UpdateConnectionResponse;
import com.huaweicloud.sdk.eg.v1.model.UpdateEndpointRequest;
import com.huaweicloud.sdk.eg.v1.model.UpdateEndpointResponse;
import com.huaweicloud.sdk.eg.v1.model.UpdateEventSchemaRequest;
import com.huaweicloud.sdk.eg.v1.model.UpdateEventSchemaResponse;
import com.huaweicloud.sdk.eg.v1.model.UpdateEventSourceRequest;
import com.huaweicloud.sdk.eg.v1.model.UpdateEventSourceResponse;
import com.huaweicloud.sdk.eg.v1.model.UpdateEventStreamingRequest;
import com.huaweicloud.sdk.eg.v1.model.UpdateEventStreamingResponse;
import com.huaweicloud.sdk.eg.v1.model.UpdateSubscriptionRequest;
import com.huaweicloud.sdk.eg.v1.model.UpdateSubscriptionResponse;
import com.huaweicloud.sdk.eg.v1.model.UpdateSubscriptionSourceRequest;
import com.huaweicloud.sdk.eg.v1.model.UpdateSubscriptionSourceResponse;
import com.huaweicloud.sdk.eg.v1.model.UpdateSubscriptionTargetRequest;
import com.huaweicloud.sdk.eg.v1.model.UpdateSubscriptionTargetResponse;

import java.util.concurrent.CompletableFuture;

public class EgAsyncClient {

    protected HcClient hcClient;

    public EgAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EgAsyncClient> newBuilder() {
        ClientBuilder<EgAsyncClient> clientBuilder = new ClientBuilder<>(EgAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 预校验指定事件源发布事件成功
     *
     * 发布事件到事件源成功需要有订阅等条件，预先校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckPutEventsRequest 请求对象
     * @return CompletableFuture<CheckPutEventsResponse>
     */
    public CompletableFuture<CheckPutEventsResponse> checkPutEventsAsync(CheckPutEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.checkPutEvents);
    }

    /**
     * 预校验指定事件源发布事件成功
     *
     * 发布事件到事件源成功需要有订阅等条件，预先校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckPutEventsRequest 请求对象
     * @return AsyncInvoker<CheckPutEventsRequest, CheckPutEventsResponse>
     */
    public AsyncInvoker<CheckPutEventsRequest, CheckPutEventsResponse> checkPutEventsAsyncInvoker(
        CheckPutEventsRequest request) {
        return new AsyncInvoker<>(request, EgMeta.checkPutEvents, hcClient);
    }

    /**
     * 创建服务委托
     *
     * 按照业务场景，一键创建服务委托授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgenciesRequest 请求对象
     * @return CompletableFuture<CreateAgenciesResponse>
     */
    public CompletableFuture<CreateAgenciesResponse> createAgenciesAsync(CreateAgenciesRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.createAgencies);
    }

    /**
     * 创建服务委托
     *
     * 按照业务场景，一键创建服务委托授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgenciesRequest 请求对象
     * @return AsyncInvoker<CreateAgenciesRequest, CreateAgenciesResponse>
     */
    public AsyncInvoker<CreateAgenciesRequest, CreateAgenciesResponse> createAgenciesAsyncInvoker(
        CreateAgenciesRequest request) {
        return new AsyncInvoker<>(request, EgMeta.createAgencies, hcClient);
    }

    /**
     * 创建自定义事件通道
     *
     * 创建自定义事件通道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateChannelRequest 请求对象
     * @return CompletableFuture<CreateChannelResponse>
     */
    public CompletableFuture<CreateChannelResponse> createChannelAsync(CreateChannelRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.createChannel);
    }

    /**
     * 创建自定义事件通道
     *
     * 创建自定义事件通道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateChannelRequest 请求对象
     * @return AsyncInvoker<CreateChannelRequest, CreateChannelResponse>
     */
    public AsyncInvoker<CreateChannelRequest, CreateChannelResponse> createChannelAsyncInvoker(
        CreateChannelRequest request) {
        return new AsyncInvoker<>(request, EgMeta.createChannel, hcClient);
    }

    /**
     * 创建目标连接
     *
     * 创建目标连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConnectionRequest 请求对象
     * @return CompletableFuture<CreateConnectionResponse>
     */
    public CompletableFuture<CreateConnectionResponse> createConnectionAsync(CreateConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.createConnection);
    }

    /**
     * 创建目标连接
     *
     * 创建目标连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConnectionRequest 请求对象
     * @return AsyncInvoker<CreateConnectionRequest, CreateConnectionResponse>
     */
    public AsyncInvoker<CreateConnectionRequest, CreateConnectionResponse> createConnectionAsyncInvoker(
        CreateConnectionRequest request) {
        return new AsyncInvoker<>(request, EgMeta.createConnection, hcClient);
    }

    /**
     * 创建访问端点
     *
     * 创建访问端点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEndpointRequest 请求对象
     * @return CompletableFuture<CreateEndpointResponse>
     */
    public CompletableFuture<CreateEndpointResponse> createEndpointAsync(CreateEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.createEndpoint);
    }

    /**
     * 创建访问端点
     *
     * 创建访问端点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEndpointRequest 请求对象
     * @return AsyncInvoker<CreateEndpointRequest, CreateEndpointResponse>
     */
    public AsyncInvoker<CreateEndpointRequest, CreateEndpointResponse> createEndpointAsyncInvoker(
        CreateEndpointRequest request) {
        return new AsyncInvoker<>(request, EgMeta.createEndpoint, hcClient);
    }

    /**
     * 创建自定义事件模型
     *
     * 创建自定义事件模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEventSchemaRequest 请求对象
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
     * @param request CreateEventSchemaRequest 请求对象
     * @return AsyncInvoker<CreateEventSchemaRequest, CreateEventSchemaResponse>
     */
    public AsyncInvoker<CreateEventSchemaRequest, CreateEventSchemaResponse> createEventSchemaAsyncInvoker(
        CreateEventSchemaRequest request) {
        return new AsyncInvoker<>(request, EgMeta.createEventSchema, hcClient);
    }

    /**
     * 创建自定义事件模型版本
     *
     * 创建自定义事件模型版本，版本号后台自动生成
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEventSchemaVersionRequest 请求对象
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
     * @param request CreateEventSchemaVersionRequest 请求对象
     * @return AsyncInvoker<CreateEventSchemaVersionRequest, CreateEventSchemaVersionResponse>
     */
    public AsyncInvoker<CreateEventSchemaVersionRequest, CreateEventSchemaVersionResponse> createEventSchemaVersionAsyncInvoker(
        CreateEventSchemaVersionRequest request) {
        return new AsyncInvoker<>(request, EgMeta.createEventSchemaVersion, hcClient);
    }

    /**
     * 创建自定义事件源
     *
     * 创建用户自定义类型的事件源，只能指定自定义通道，不能指定系统通道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEventSourceRequest 请求对象
     * @return CompletableFuture<CreateEventSourceResponse>
     */
    public CompletableFuture<CreateEventSourceResponse> createEventSourceAsync(CreateEventSourceRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.createEventSource);
    }

    /**
     * 创建自定义事件源
     *
     * 创建用户自定义类型的事件源，只能指定自定义通道，不能指定系统通道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEventSourceRequest 请求对象
     * @return AsyncInvoker<CreateEventSourceRequest, CreateEventSourceResponse>
     */
    public AsyncInvoker<CreateEventSourceRequest, CreateEventSourceResponse> createEventSourceAsyncInvoker(
        CreateEventSourceRequest request) {
        return new AsyncInvoker<>(request, EgMeta.createEventSource, hcClient);
    }

    /**
     * 创建事件流
     *
     * 创建事件流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEventStreamingRequest 请求对象
     * @return CompletableFuture<CreateEventStreamingResponse>
     */
    public CompletableFuture<CreateEventStreamingResponse> createEventStreamingAsync(
        CreateEventStreamingRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.createEventStreaming);
    }

    /**
     * 创建事件流
     *
     * 创建事件流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEventStreamingRequest 请求对象
     * @return AsyncInvoker<CreateEventStreamingRequest, CreateEventStreamingResponse>
     */
    public AsyncInvoker<CreateEventStreamingRequest, CreateEventStreamingResponse> createEventStreamingAsyncInvoker(
        CreateEventStreamingRequest request) {
        return new AsyncInvoker<>(request, EgMeta.createEventStreaming, hcClient);
    }

    /**
     * 创建事件订阅
     *
     * 创建事件订阅。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubscriptionRequest 请求对象
     * @return CompletableFuture<CreateSubscriptionResponse>
     */
    public CompletableFuture<CreateSubscriptionResponse> createSubscriptionAsync(CreateSubscriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.createSubscription);
    }

    /**
     * 创建事件订阅
     *
     * 创建事件订阅。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubscriptionRequest 请求对象
     * @return AsyncInvoker<CreateSubscriptionRequest, CreateSubscriptionResponse>
     */
    public AsyncInvoker<CreateSubscriptionRequest, CreateSubscriptionResponse> createSubscriptionAsyncInvoker(
        CreateSubscriptionRequest request) {
        return new AsyncInvoker<>(request, EgMeta.createSubscription, hcClient);
    }

    /**
     * 创建事件订阅目标
     *
     * 创建单个事件订阅目标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubscriptionTargetRequest 请求对象
     * @return CompletableFuture<CreateSubscriptionTargetResponse>
     */
    public CompletableFuture<CreateSubscriptionTargetResponse> createSubscriptionTargetAsync(
        CreateSubscriptionTargetRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.createSubscriptionTarget);
    }

    /**
     * 创建事件订阅目标
     *
     * 创建单个事件订阅目标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubscriptionTargetRequest 请求对象
     * @return AsyncInvoker<CreateSubscriptionTargetRequest, CreateSubscriptionTargetResponse>
     */
    public AsyncInvoker<CreateSubscriptionTargetRequest, CreateSubscriptionTargetResponse> createSubscriptionTargetAsyncInvoker(
        CreateSubscriptionTargetRequest request) {
        return new AsyncInvoker<>(request, EgMeta.createSubscriptionTarget, hcClient);
    }

    /**
     * 删除自定义事件通道
     *
     * 删除指定自定义事件通道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteChannelRequest 请求对象
     * @return CompletableFuture<DeleteChannelResponse>
     */
    public CompletableFuture<DeleteChannelResponse> deleteChannelAsync(DeleteChannelRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.deleteChannel);
    }

    /**
     * 删除自定义事件通道
     *
     * 删除指定自定义事件通道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteChannelRequest 请求对象
     * @return AsyncInvoker<DeleteChannelRequest, DeleteChannelResponse>
     */
    public AsyncInvoker<DeleteChannelRequest, DeleteChannelResponse> deleteChannelAsyncInvoker(
        DeleteChannelRequest request) {
        return new AsyncInvoker<>(request, EgMeta.deleteChannel, hcClient);
    }

    /**
     * 删除目标连接
     *
     * 删除目标连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConnectionRequest 请求对象
     * @return CompletableFuture<DeleteConnectionResponse>
     */
    public CompletableFuture<DeleteConnectionResponse> deleteConnectionAsync(DeleteConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.deleteConnection);
    }

    /**
     * 删除目标连接
     *
     * 删除目标连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConnectionRequest 请求对象
     * @return AsyncInvoker<DeleteConnectionRequest, DeleteConnectionResponse>
     */
    public AsyncInvoker<DeleteConnectionRequest, DeleteConnectionResponse> deleteConnectionAsyncInvoker(
        DeleteConnectionRequest request) {
        return new AsyncInvoker<>(request, EgMeta.deleteConnection, hcClient);
    }

    /**
     * 删除访问端点
     *
     * 删除访问端点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEndpointRequest 请求对象
     * @return CompletableFuture<DeleteEndpointResponse>
     */
    public CompletableFuture<DeleteEndpointResponse> deleteEndpointAsync(DeleteEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.deleteEndpoint);
    }

    /**
     * 删除访问端点
     *
     * 删除访问端点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEndpointRequest 请求对象
     * @return AsyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse>
     */
    public AsyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse> deleteEndpointAsyncInvoker(
        DeleteEndpointRequest request) {
        return new AsyncInvoker<>(request, EgMeta.deleteEndpoint, hcClient);
    }

    /**
     * 删除事件模型
     *
     * 删除事件模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEventSchemaRequest 请求对象
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
     * @param request DeleteEventSchemaRequest 请求对象
     * @return AsyncInvoker<DeleteEventSchemaRequest, DeleteEventSchemaResponse>
     */
    public AsyncInvoker<DeleteEventSchemaRequest, DeleteEventSchemaResponse> deleteEventSchemaAsyncInvoker(
        DeleteEventSchemaRequest request) {
        return new AsyncInvoker<>(request, EgMeta.deleteEventSchema, hcClient);
    }

    /**
     * 删除事件模型版本
     *
     * 删除事件模型指定版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEventSchemaVersionRequest 请求对象
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
     * @param request DeleteEventSchemaVersionRequest 请求对象
     * @return AsyncInvoker<DeleteEventSchemaVersionRequest, DeleteEventSchemaVersionResponse>
     */
    public AsyncInvoker<DeleteEventSchemaVersionRequest, DeleteEventSchemaVersionResponse> deleteEventSchemaVersionAsyncInvoker(
        DeleteEventSchemaVersionRequest request) {
        return new AsyncInvoker<>(request, EgMeta.deleteEventSchemaVersion, hcClient);
    }

    /**
     * 删除自定义事件源
     *
     * 删除指定的自定义事件源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEventSourceRequest 请求对象
     * @return CompletableFuture<DeleteEventSourceResponse>
     */
    public CompletableFuture<DeleteEventSourceResponse> deleteEventSourceAsync(DeleteEventSourceRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.deleteEventSource);
    }

    /**
     * 删除自定义事件源
     *
     * 删除指定的自定义事件源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEventSourceRequest 请求对象
     * @return AsyncInvoker<DeleteEventSourceRequest, DeleteEventSourceResponse>
     */
    public AsyncInvoker<DeleteEventSourceRequest, DeleteEventSourceResponse> deleteEventSourceAsyncInvoker(
        DeleteEventSourceRequest request) {
        return new AsyncInvoker<>(request, EgMeta.deleteEventSource, hcClient);
    }

    /**
     * 删除事件流
     *
     * 删除事件流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEventStreamingRequest 请求对象
     * @return CompletableFuture<DeleteEventStreamingResponse>
     */
    public CompletableFuture<DeleteEventStreamingResponse> deleteEventStreamingAsync(
        DeleteEventStreamingRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.deleteEventStreaming);
    }

    /**
     * 删除事件流
     *
     * 删除事件流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEventStreamingRequest 请求对象
     * @return AsyncInvoker<DeleteEventStreamingRequest, DeleteEventStreamingResponse>
     */
    public AsyncInvoker<DeleteEventStreamingRequest, DeleteEventStreamingResponse> deleteEventStreamingAsyncInvoker(
        DeleteEventStreamingRequest request) {
        return new AsyncInvoker<>(request, EgMeta.deleteEventStreaming, hcClient);
    }

    /**
     * 删除事件订阅
     *
     * 删除事件订阅。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubscriptionRequest 请求对象
     * @return CompletableFuture<DeleteSubscriptionResponse>
     */
    public CompletableFuture<DeleteSubscriptionResponse> deleteSubscriptionAsync(DeleteSubscriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.deleteSubscription);
    }

    /**
     * 删除事件订阅
     *
     * 删除事件订阅。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubscriptionRequest 请求对象
     * @return AsyncInvoker<DeleteSubscriptionRequest, DeleteSubscriptionResponse>
     */
    public AsyncInvoker<DeleteSubscriptionRequest, DeleteSubscriptionResponse> deleteSubscriptionAsyncInvoker(
        DeleteSubscriptionRequest request) {
        return new AsyncInvoker<>(request, EgMeta.deleteSubscription, hcClient);
    }

    /**
     * 删除事件订阅目标
     *
     * 删除事件订阅目标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubscriptionTargetRequest 请求对象
     * @return CompletableFuture<DeleteSubscriptionTargetResponse>
     */
    public CompletableFuture<DeleteSubscriptionTargetResponse> deleteSubscriptionTargetAsync(
        DeleteSubscriptionTargetRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.deleteSubscriptionTarget);
    }

    /**
     * 删除事件订阅目标
     *
     * 删除事件订阅目标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubscriptionTargetRequest 请求对象
     * @return AsyncInvoker<DeleteSubscriptionTargetRequest, DeleteSubscriptionTargetResponse>
     */
    public AsyncInvoker<DeleteSubscriptionTargetRequest, DeleteSubscriptionTargetResponse> deleteSubscriptionTargetAsyncInvoker(
        DeleteSubscriptionTargetRequest request) {
        return new AsyncInvoker<>(request, EgMeta.deleteSubscriptionTarget, hcClient);
    }

    /**
     * 事件模型自动发现
     *
     * 事件模型自动发现
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DiscoverEventSchemaFromDataRequest 请求对象
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
     * @param request DiscoverEventSchemaFromDataRequest 请求对象
     * @return AsyncInvoker<DiscoverEventSchemaFromDataRequest, DiscoverEventSchemaFromDataResponse>
     */
    public AsyncInvoker<DiscoverEventSchemaFromDataRequest, DiscoverEventSchemaFromDataResponse> discoverEventSchemaFromDataAsyncInvoker(
        DiscoverEventSchemaFromDataRequest request) {
        return new AsyncInvoker<>(request, EgMeta.discoverEventSchemaFromData, hcClient);
    }

    /**
     * 查询服务委托
     *
     * 查询服务委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgenciesRequest 请求对象
     * @return CompletableFuture<ListAgenciesResponse>
     */
    public CompletableFuture<ListAgenciesResponse> listAgenciesAsync(ListAgenciesRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.listAgencies);
    }

    /**
     * 查询服务委托
     *
     * 查询服务委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgenciesRequest 请求对象
     * @return AsyncInvoker<ListAgenciesRequest, ListAgenciesResponse>
     */
    public AsyncInvoker<ListAgenciesRequest, ListAgenciesResponse> listAgenciesAsyncInvoker(
        ListAgenciesRequest request) {
        return new AsyncInvoker<>(request, EgMeta.listAgencies, hcClient);
    }

    /**
     * 查询事件通道列表
     *
     * 查询事件通道列表，包括系统通道和自定义通道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListChannelsRequest 请求对象
     * @return CompletableFuture<ListChannelsResponse>
     */
    public CompletableFuture<ListChannelsResponse> listChannelsAsync(ListChannelsRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.listChannels);
    }

    /**
     * 查询事件通道列表
     *
     * 查询事件通道列表，包括系统通道和自定义通道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListChannelsRequest 请求对象
     * @return AsyncInvoker<ListChannelsRequest, ListChannelsResponse>
     */
    public AsyncInvoker<ListChannelsRequest, ListChannelsResponse> listChannelsAsyncInvoker(
        ListChannelsRequest request) {
        return new AsyncInvoker<>(request, EgMeta.listChannels, hcClient);
    }

    /**
     * 查询目标连接列表
     *
     * 查询目标连接列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectionsRequest 请求对象
     * @return CompletableFuture<ListConnectionsResponse>
     */
    public CompletableFuture<ListConnectionsResponse> listConnectionsAsync(ListConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.listConnections);
    }

    /**
     * 查询目标连接列表
     *
     * 查询目标连接列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectionsRequest 请求对象
     * @return AsyncInvoker<ListConnectionsRequest, ListConnectionsResponse>
     */
    public AsyncInvoker<ListConnectionsRequest, ListConnectionsResponse> listConnectionsAsyncInvoker(
        ListConnectionsRequest request) {
        return new AsyncInvoker<>(request, EgMeta.listConnections, hcClient);
    }

    /**
     * 查询访问端点
     *
     * 查询访问端点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointsRequest 请求对象
     * @return CompletableFuture<ListEndpointsResponse>
     */
    public CompletableFuture<ListEndpointsResponse> listEndpointsAsync(ListEndpointsRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.listEndpoints);
    }

    /**
     * 查询访问端点
     *
     * 查询访问端点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointsRequest 请求对象
     * @return AsyncInvoker<ListEndpointsRequest, ListEndpointsResponse>
     */
    public AsyncInvoker<ListEndpointsRequest, ListEndpointsResponse> listEndpointsAsyncInvoker(
        ListEndpointsRequest request) {
        return new AsyncInvoker<>(request, EgMeta.listEndpoints, hcClient);
    }

    /**
     * 查询事件模型列表
     *
     * 查询事件模型列表，包括系统事件模型和自定义事件模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventSchemaRequest 请求对象
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
     * @param request ListEventSchemaRequest 请求对象
     * @return AsyncInvoker<ListEventSchemaRequest, ListEventSchemaResponse>
     */
    public AsyncInvoker<ListEventSchemaRequest, ListEventSchemaResponse> listEventSchemaAsyncInvoker(
        ListEventSchemaRequest request) {
        return new AsyncInvoker<>(request, EgMeta.listEventSchema, hcClient);
    }

    /**
     * 查询事件模型版本列表
     *
     * 查询事件模型版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventSchemaVersionsRequest 请求对象
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
     * @param request ListEventSchemaVersionsRequest 请求对象
     * @return AsyncInvoker<ListEventSchemaVersionsRequest, ListEventSchemaVersionsResponse>
     */
    public AsyncInvoker<ListEventSchemaVersionsRequest, ListEventSchemaVersionsResponse> listEventSchemaVersionsAsyncInvoker(
        ListEventSchemaVersionsRequest request) {
        return new AsyncInvoker<>(request, EgMeta.listEventSchemaVersions, hcClient);
    }

    /**
     * 查询事件源列表
     *
     * 支持条件查询，如可以指定事件通道ID来查询某个事件通道下的所有事件源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventSourcesRequest 请求对象
     * @return CompletableFuture<ListEventSourcesResponse>
     */
    public CompletableFuture<ListEventSourcesResponse> listEventSourcesAsync(ListEventSourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.listEventSources);
    }

    /**
     * 查询事件源列表
     *
     * 支持条件查询，如可以指定事件通道ID来查询某个事件通道下的所有事件源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventSourcesRequest 请求对象
     * @return AsyncInvoker<ListEventSourcesRequest, ListEventSourcesResponse>
     */
    public AsyncInvoker<ListEventSourcesRequest, ListEventSourcesResponse> listEventSourcesAsyncInvoker(
        ListEventSourcesRequest request) {
        return new AsyncInvoker<>(request, EgMeta.listEventSources, hcClient);
    }

    /**
     * 查询事件流列表
     *
     * 查询事件流列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventStreamingRequest 请求对象
     * @return CompletableFuture<ListEventStreamingResponse>
     */
    public CompletableFuture<ListEventStreamingResponse> listEventStreamingAsync(ListEventStreamingRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.listEventStreaming);
    }

    /**
     * 查询事件流列表
     *
     * 查询事件流列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventStreamingRequest 请求对象
     * @return AsyncInvoker<ListEventStreamingRequest, ListEventStreamingResponse>
     */
    public AsyncInvoker<ListEventStreamingRequest, ListEventStreamingResponse> listEventStreamingAsyncInvoker(
        ListEventStreamingRequest request) {
        return new AsyncInvoker<>(request, EgMeta.listEventStreaming, hcClient);
    }

    /**
     * 查询事件目标分类
     *
     * 查询预置的事件目标分类，获取每个事件目标分类的字段定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventTargetRequest 请求对象
     * @return CompletableFuture<ListEventTargetResponse>
     */
    public CompletableFuture<ListEventTargetResponse> listEventTargetAsync(ListEventTargetRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.listEventTarget);
    }

    /**
     * 查询事件目标分类
     *
     * 查询预置的事件目标分类，获取每个事件目标分类的字段定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventTargetRequest 请求对象
     * @return AsyncInvoker<ListEventTargetRequest, ListEventTargetResponse>
     */
    public AsyncInvoker<ListEventTargetRequest, ListEventTargetResponse> listEventTargetAsyncInvoker(
        ListEventTargetRequest request) {
        return new AsyncInvoker<>(request, EgMeta.listEventTarget, hcClient);
    }

    /**
     * 查询事件通道监控指标数据
     *
     * 查询事件通道监控指标数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPubMetricsRequest 请求对象
     * @return CompletableFuture<ListPubMetricsResponse>
     */
    public CompletableFuture<ListPubMetricsResponse> listPubMetricsAsync(ListPubMetricsRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.listPubMetrics);
    }

    /**
     * 查询事件通道监控指标数据
     *
     * 查询事件通道监控指标数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPubMetricsRequest 请求对象
     * @return AsyncInvoker<ListPubMetricsRequest, ListPubMetricsResponse>
     */
    public AsyncInvoker<ListPubMetricsRequest, ListPubMetricsResponse> listPubMetricsAsyncInvoker(
        ListPubMetricsRequest request) {
        return new AsyncInvoker<>(request, EgMeta.listPubMetrics, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询当前租户的配额，未特殊配置过的会返回默认配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotasRequest 请求对象
     * @return CompletableFuture<ListQuotasResponse>
     */
    public CompletableFuture<ListQuotasResponse> listQuotasAsync(ListQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.listQuotas);
    }

    /**
     * 查询配额
     *
     * 查询当前租户的配额，未特殊配置过的会返回默认配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotasRequest 请求对象
     * @return AsyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public AsyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasAsyncInvoker(ListQuotasRequest request) {
        return new AsyncInvoker<>(request, EgMeta.listQuotas, hcClient);
    }

    /**
     * 查询事件订阅监控指标数据
     *
     * 查询事件订阅监控指标数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubMetricsRequest 请求对象
     * @return CompletableFuture<ListSubMetricsResponse>
     */
    public CompletableFuture<ListSubMetricsResponse> listSubMetricsAsync(ListSubMetricsRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.listSubMetrics);
    }

    /**
     * 查询事件订阅监控指标数据
     *
     * 查询事件订阅监控指标数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubMetricsRequest 请求对象
     * @return AsyncInvoker<ListSubMetricsRequest, ListSubMetricsResponse>
     */
    public AsyncInvoker<ListSubMetricsRequest, ListSubMetricsResponse> listSubMetricsAsyncInvoker(
        ListSubMetricsRequest request) {
        return new AsyncInvoker<>(request, EgMeta.listSubMetrics, hcClient);
    }

    /**
     * 查询事件订阅列表
     *
     * 查询事件订阅列表，支持指定事件通道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubscriptionsRequest 请求对象
     * @return CompletableFuture<ListSubscriptionsResponse>
     */
    public CompletableFuture<ListSubscriptionsResponse> listSubscriptionsAsync(ListSubscriptionsRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.listSubscriptions);
    }

    /**
     * 查询事件订阅列表
     *
     * 查询事件订阅列表，支持指定事件通道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubscriptionsRequest 请求对象
     * @return AsyncInvoker<ListSubscriptionsRequest, ListSubscriptionsResponse>
     */
    public AsyncInvoker<ListSubscriptionsRequest, ListSubscriptionsResponse> listSubscriptionsAsyncInvoker(
        ListSubscriptionsRequest request) {
        return new AsyncInvoker<>(request, EgMeta.listSubscriptions, hcClient);
    }

    /**
     * 查询事件追踪列表
     *
     * 查询事件追踪列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTracedEventsRequest 请求对象
     * @return CompletableFuture<ListTracedEventsResponse>
     */
    public CompletableFuture<ListTracedEventsResponse> listTracedEventsAsync(ListTracedEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.listTracedEvents);
    }

    /**
     * 查询事件追踪列表
     *
     * 查询事件追踪列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTracedEventsRequest 请求对象
     * @return AsyncInvoker<ListTracedEventsRequest, ListTracedEventsResponse>
     */
    public AsyncInvoker<ListTracedEventsRequest, ListTracedEventsResponse> listTracedEventsAsyncInvoker(
        ListTracedEventsRequest request) {
        return new AsyncInvoker<>(request, EgMeta.listTracedEvents, hcClient);
    }

    /**
     * 查询单个函数的EG触发器
     *
     * 查询触发器，支持指定函数urn，一个以函数urn为目标的订阅为一个触发器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTriggersRequest 请求对象
     * @return CompletableFuture<ListTriggersResponse>
     */
    public CompletableFuture<ListTriggersResponse> listTriggersAsync(ListTriggersRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.listTriggers);
    }

    /**
     * 查询单个函数的EG触发器
     *
     * 查询触发器，支持指定函数urn，一个以函数urn为目标的订阅为一个触发器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTriggersRequest 请求对象
     * @return AsyncInvoker<ListTriggersRequest, ListTriggersResponse>
     */
    public AsyncInvoker<ListTriggersRequest, ListTriggersResponse> listTriggersAsyncInvoker(
        ListTriggersRequest request) {
        return new AsyncInvoker<>(request, EgMeta.listTriggers, hcClient);
    }

    /**
     * 查询单个函数流的EG触发器
     *
     * 查询触发器，支持指定函数流id，一个以函数流id为目标的订阅为一个触发器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkflowTriggersRequest 请求对象
     * @return CompletableFuture<ListWorkflowTriggersResponse>
     */
    public CompletableFuture<ListWorkflowTriggersResponse> listWorkflowTriggersAsync(
        ListWorkflowTriggersRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.listWorkflowTriggers);
    }

    /**
     * 查询单个函数流的EG触发器
     *
     * 查询触发器，支持指定函数流id，一个以函数流id为目标的订阅为一个触发器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkflowTriggersRequest 请求对象
     * @return AsyncInvoker<ListWorkflowTriggersRequest, ListWorkflowTriggersResponse>
     */
    public AsyncInvoker<ListWorkflowTriggersRequest, ListWorkflowTriggersResponse> listWorkflowTriggersAsyncInvoker(
        ListWorkflowTriggersRequest request) {
        return new AsyncInvoker<>(request, EgMeta.listWorkflowTriggers, hcClient);
    }

    /**
     * 操作事件订阅
     *
     * 操作事件订阅，支持启用、禁用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request OperateSubscriptionRequest 请求对象
     * @return CompletableFuture<OperateSubscriptionResponse>
     */
    public CompletableFuture<OperateSubscriptionResponse> operateSubscriptionAsync(OperateSubscriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.operateSubscription);
    }

    /**
     * 操作事件订阅
     *
     * 操作事件订阅，支持启用、禁用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request OperateSubscriptionRequest 请求对象
     * @return AsyncInvoker<OperateSubscriptionRequest, OperateSubscriptionResponse>
     */
    public AsyncInvoker<OperateSubscriptionRequest, OperateSubscriptionResponse> operateSubscriptionAsyncInvoker(
        OperateSubscriptionRequest request) {
        return new AsyncInvoker<>(request, EgMeta.operateSubscription, hcClient);
    }

    /**
     * 发布事件到事件通道
     *
     * 发布事件到事件通道，仅供调试使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PutEventsRequest 请求对象
     * @return CompletableFuture<PutEventsResponse>
     */
    public CompletableFuture<PutEventsResponse> putEventsAsync(PutEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.putEvents);
    }

    /**
     * 发布事件到事件通道
     *
     * 发布事件到事件通道，仅供调试使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PutEventsRequest 请求对象
     * @return AsyncInvoker<PutEventsRequest, PutEventsResponse>
     */
    public AsyncInvoker<PutEventsRequest, PutEventsResponse> putEventsAsyncInvoker(PutEventsRequest request) {
        return new AsyncInvoker<>(request, EgMeta.putEvents, hcClient);
    }

    /**
     * 发布官方事件到事件通道
     *
     * 发布官方事件到事件通道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PutOfficialEventsRequest 请求对象
     * @return CompletableFuture<PutOfficialEventsResponse>
     */
    public CompletableFuture<PutOfficialEventsResponse> putOfficialEventsAsync(PutOfficialEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.putOfficialEvents);
    }

    /**
     * 发布官方事件到事件通道
     *
     * 发布官方事件到事件通道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PutOfficialEventsRequest 请求对象
     * @return AsyncInvoker<PutOfficialEventsRequest, PutOfficialEventsResponse>
     */
    public AsyncInvoker<PutOfficialEventsRequest, PutOfficialEventsResponse> putOfficialEventsAsyncInvoker(
        PutOfficialEventsRequest request) {
        return new AsyncInvoker<>(request, EgMeta.putOfficialEvents, hcClient);
    }

    /**
     * 操作事件流
     *
     * 操作事件流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResumeEventStreamingRequest 请求对象
     * @return CompletableFuture<ResumeEventStreamingResponse>
     */
    public CompletableFuture<ResumeEventStreamingResponse> resumeEventStreamingAsync(
        ResumeEventStreamingRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.resumeEventStreaming);
    }

    /**
     * 操作事件流
     *
     * 操作事件流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResumeEventStreamingRequest 请求对象
     * @return AsyncInvoker<ResumeEventStreamingRequest, ResumeEventStreamingResponse>
     */
    public AsyncInvoker<ResumeEventStreamingRequest, ResumeEventStreamingResponse> resumeEventStreamingAsyncInvoker(
        ResumeEventStreamingRequest request) {
        return new AsyncInvoker<>(request, EgMeta.resumeEventStreaming, hcClient);
    }

    /**
     * 查询事件通道详情
     *
     * 查询指定事件通道详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailOfChannelRequest 请求对象
     * @return CompletableFuture<ShowDetailOfChannelResponse>
     */
    public CompletableFuture<ShowDetailOfChannelResponse> showDetailOfChannelAsync(ShowDetailOfChannelRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.showDetailOfChannel);
    }

    /**
     * 查询事件通道详情
     *
     * 查询指定事件通道详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailOfChannelRequest 请求对象
     * @return AsyncInvoker<ShowDetailOfChannelRequest, ShowDetailOfChannelResponse>
     */
    public AsyncInvoker<ShowDetailOfChannelRequest, ShowDetailOfChannelResponse> showDetailOfChannelAsyncInvoker(
        ShowDetailOfChannelRequest request) {
        return new AsyncInvoker<>(request, EgMeta.showDetailOfChannel, hcClient);
    }

    /**
     * 查询目标连接详情
     *
     * 查询目标连接详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailOfConnectionRequest 请求对象
     * @return CompletableFuture<ShowDetailOfConnectionResponse>
     */
    public CompletableFuture<ShowDetailOfConnectionResponse> showDetailOfConnectionAsync(
        ShowDetailOfConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.showDetailOfConnection);
    }

    /**
     * 查询目标连接详情
     *
     * 查询目标连接详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailOfConnectionRequest 请求对象
     * @return AsyncInvoker<ShowDetailOfConnectionRequest, ShowDetailOfConnectionResponse>
     */
    public AsyncInvoker<ShowDetailOfConnectionRequest, ShowDetailOfConnectionResponse> showDetailOfConnectionAsyncInvoker(
        ShowDetailOfConnectionRequest request) {
        return new AsyncInvoker<>(request, EgMeta.showDetailOfConnection, hcClient);
    }

    /**
     * 查询发送事件的内容
     *
     * 根据事件ID查询事件详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailOfEventRequest 请求对象
     * @return CompletableFuture<ShowDetailOfEventResponse>
     */
    public CompletableFuture<ShowDetailOfEventResponse> showDetailOfEventAsync(ShowDetailOfEventRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.showDetailOfEvent);
    }

    /**
     * 查询发送事件的内容
     *
     * 根据事件ID查询事件详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailOfEventRequest 请求对象
     * @return AsyncInvoker<ShowDetailOfEventRequest, ShowDetailOfEventResponse>
     */
    public AsyncInvoker<ShowDetailOfEventRequest, ShowDetailOfEventResponse> showDetailOfEventAsyncInvoker(
        ShowDetailOfEventRequest request) {
        return new AsyncInvoker<>(request, EgMeta.showDetailOfEvent, hcClient);
    }

    /**
     * 查询事件模型详情
     *
     * 查询事件模型详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailOfEventSchemaRequest 请求对象
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
     * @param request ShowDetailOfEventSchemaRequest 请求对象
     * @return AsyncInvoker<ShowDetailOfEventSchemaRequest, ShowDetailOfEventSchemaResponse>
     */
    public AsyncInvoker<ShowDetailOfEventSchemaRequest, ShowDetailOfEventSchemaResponse> showDetailOfEventSchemaAsyncInvoker(
        ShowDetailOfEventSchemaRequest request) {
        return new AsyncInvoker<>(request, EgMeta.showDetailOfEventSchema, hcClient);
    }

    /**
     * 查询事件模型版本详情
     *
     * 查询事件模型指定版本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailOfEventSchemaVersionRequest 请求对象
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
     * @param request ShowDetailOfEventSchemaVersionRequest 请求对象
     * @return AsyncInvoker<ShowDetailOfEventSchemaVersionRequest, ShowDetailOfEventSchemaVersionResponse>
     */
    public AsyncInvoker<ShowDetailOfEventSchemaVersionRequest, ShowDetailOfEventSchemaVersionResponse> showDetailOfEventSchemaVersionAsyncInvoker(
        ShowDetailOfEventSchemaVersionRequest request) {
        return new AsyncInvoker<>(request, EgMeta.showDetailOfEventSchemaVersion, hcClient);
    }

    /**
     * 查询事件源详情
     *
     * 查询事件源详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailOfEventSourceRequest 请求对象
     * @return CompletableFuture<ShowDetailOfEventSourceResponse>
     */
    public CompletableFuture<ShowDetailOfEventSourceResponse> showDetailOfEventSourceAsync(
        ShowDetailOfEventSourceRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.showDetailOfEventSource);
    }

    /**
     * 查询事件源详情
     *
     * 查询事件源详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailOfEventSourceRequest 请求对象
     * @return AsyncInvoker<ShowDetailOfEventSourceRequest, ShowDetailOfEventSourceResponse>
     */
    public AsyncInvoker<ShowDetailOfEventSourceRequest, ShowDetailOfEventSourceResponse> showDetailOfEventSourceAsyncInvoker(
        ShowDetailOfEventSourceRequest request) {
        return new AsyncInvoker<>(request, EgMeta.showDetailOfEventSource, hcClient);
    }

    /**
     * 事件轨迹详情
     *
     * 事件轨迹详情，展示事件源到投递目标的投递情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailOfEventTraceRequest 请求对象
     * @return CompletableFuture<ShowDetailOfEventTraceResponse>
     */
    public CompletableFuture<ShowDetailOfEventTraceResponse> showDetailOfEventTraceAsync(
        ShowDetailOfEventTraceRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.showDetailOfEventTrace);
    }

    /**
     * 事件轨迹详情
     *
     * 事件轨迹详情，展示事件源到投递目标的投递情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailOfEventTraceRequest 请求对象
     * @return AsyncInvoker<ShowDetailOfEventTraceRequest, ShowDetailOfEventTraceResponse>
     */
    public AsyncInvoker<ShowDetailOfEventTraceRequest, ShowDetailOfEventTraceResponse> showDetailOfEventTraceAsyncInvoker(
        ShowDetailOfEventTraceRequest request) {
        return new AsyncInvoker<>(request, EgMeta.showDetailOfEventTrace, hcClient);
    }

    /**
     * 查询事件订阅详情
     *
     * 查询事件订阅详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailOfSubscriptionRequest 请求对象
     * @return CompletableFuture<ShowDetailOfSubscriptionResponse>
     */
    public CompletableFuture<ShowDetailOfSubscriptionResponse> showDetailOfSubscriptionAsync(
        ShowDetailOfSubscriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.showDetailOfSubscription);
    }

    /**
     * 查询事件订阅详情
     *
     * 查询事件订阅详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailOfSubscriptionRequest 请求对象
     * @return AsyncInvoker<ShowDetailOfSubscriptionRequest, ShowDetailOfSubscriptionResponse>
     */
    public AsyncInvoker<ShowDetailOfSubscriptionRequest, ShowDetailOfSubscriptionResponse> showDetailOfSubscriptionAsyncInvoker(
        ShowDetailOfSubscriptionRequest request) {
        return new AsyncInvoker<>(request, EgMeta.showDetailOfSubscription, hcClient);
    }

    /**
     * 查询事件订阅目标详情
     *
     * 查询事件订阅目标详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailOfSubscriptionTargetRequest 请求对象
     * @return CompletableFuture<ShowDetailOfSubscriptionTargetResponse>
     */
    public CompletableFuture<ShowDetailOfSubscriptionTargetResponse> showDetailOfSubscriptionTargetAsync(
        ShowDetailOfSubscriptionTargetRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.showDetailOfSubscriptionTarget);
    }

    /**
     * 查询事件订阅目标详情
     *
     * 查询事件订阅目标详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailOfSubscriptionTargetRequest 请求对象
     * @return AsyncInvoker<ShowDetailOfSubscriptionTargetRequest, ShowDetailOfSubscriptionTargetResponse>
     */
    public AsyncInvoker<ShowDetailOfSubscriptionTargetRequest, ShowDetailOfSubscriptionTargetResponse> showDetailOfSubscriptionTargetAsyncInvoker(
        ShowDetailOfSubscriptionTargetRequest request) {
        return new AsyncInvoker<>(request, EgMeta.showDetailOfSubscriptionTarget, hcClient);
    }

    /**
     * 查询事件流详情
     *
     * 查询事件流详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEventStreamingRequest 请求对象
     * @return CompletableFuture<ShowEventStreamingResponse>
     */
    public CompletableFuture<ShowEventStreamingResponse> showEventStreamingAsync(ShowEventStreamingRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.showEventStreaming);
    }

    /**
     * 查询事件流详情
     *
     * 查询事件流详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEventStreamingRequest 请求对象
     * @return AsyncInvoker<ShowEventStreamingRequest, ShowEventStreamingResponse>
     */
    public AsyncInvoker<ShowEventStreamingRequest, ShowEventStreamingResponse> showEventStreamingAsyncInvoker(
        ShowEventStreamingRequest request) {
        return new AsyncInvoker<>(request, EgMeta.showEventStreaming, hcClient);
    }

    /**
     * 查询事件示例列表
     *
     * 查询事件示例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowListOfEventSampleRequest 请求对象
     * @return CompletableFuture<ShowListOfEventSampleResponse>
     */
    public CompletableFuture<ShowListOfEventSampleResponse> showListOfEventSampleAsync(
        ShowListOfEventSampleRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.showListOfEventSample);
    }

    /**
     * 查询事件示例列表
     *
     * 查询事件示例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowListOfEventSampleRequest 请求对象
     * @return AsyncInvoker<ShowListOfEventSampleRequest, ShowListOfEventSampleResponse>
     */
    public AsyncInvoker<ShowListOfEventSampleRequest, ShowListOfEventSampleResponse> showListOfEventSampleAsyncInvoker(
        ShowListOfEventSampleRequest request) {
        return new AsyncInvoker<>(request, EgMeta.showListOfEventSample, hcClient);
    }

    /**
     * 更新自定义事件通道
     *
     * 更新自定义事件通道定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateChannelRequest 请求对象
     * @return CompletableFuture<UpdateChannelResponse>
     */
    public CompletableFuture<UpdateChannelResponse> updateChannelAsync(UpdateChannelRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.updateChannel);
    }

    /**
     * 更新自定义事件通道
     *
     * 更新自定义事件通道定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateChannelRequest 请求对象
     * @return AsyncInvoker<UpdateChannelRequest, UpdateChannelResponse>
     */
    public AsyncInvoker<UpdateChannelRequest, UpdateChannelResponse> updateChannelAsyncInvoker(
        UpdateChannelRequest request) {
        return new AsyncInvoker<>(request, EgMeta.updateChannel, hcClient);
    }

    /**
     * 更新目标连接
     *
     * 更新目标连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConnectionRequest 请求对象
     * @return CompletableFuture<UpdateConnectionResponse>
     */
    public CompletableFuture<UpdateConnectionResponse> updateConnectionAsync(UpdateConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.updateConnection);
    }

    /**
     * 更新目标连接
     *
     * 更新目标连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConnectionRequest 请求对象
     * @return AsyncInvoker<UpdateConnectionRequest, UpdateConnectionResponse>
     */
    public AsyncInvoker<UpdateConnectionRequest, UpdateConnectionResponse> updateConnectionAsyncInvoker(
        UpdateConnectionRequest request) {
        return new AsyncInvoker<>(request, EgMeta.updateConnection, hcClient);
    }

    /**
     * 更新访问端点
     *
     * 更新访问端点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointRequest 请求对象
     * @return CompletableFuture<UpdateEndpointResponse>
     */
    public CompletableFuture<UpdateEndpointResponse> updateEndpointAsync(UpdateEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.updateEndpoint);
    }

    /**
     * 更新访问端点
     *
     * 更新访问端点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointRequest 请求对象
     * @return AsyncInvoker<UpdateEndpointRequest, UpdateEndpointResponse>
     */
    public AsyncInvoker<UpdateEndpointRequest, UpdateEndpointResponse> updateEndpointAsyncInvoker(
        UpdateEndpointRequest request) {
        return new AsyncInvoker<>(request, EgMeta.updateEndpoint, hcClient);
    }

    /**
     * 更新自定义事件模型
     *
     * 更新自定义事件模型定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEventSchemaRequest 请求对象
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
     * @param request UpdateEventSchemaRequest 请求对象
     * @return AsyncInvoker<UpdateEventSchemaRequest, UpdateEventSchemaResponse>
     */
    public AsyncInvoker<UpdateEventSchemaRequest, UpdateEventSchemaResponse> updateEventSchemaAsyncInvoker(
        UpdateEventSchemaRequest request) {
        return new AsyncInvoker<>(request, EgMeta.updateEventSchema, hcClient);
    }

    /**
     * 更新自定义事件源
     *
     * 更新自定义事件源定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEventSourceRequest 请求对象
     * @return CompletableFuture<UpdateEventSourceResponse>
     */
    public CompletableFuture<UpdateEventSourceResponse> updateEventSourceAsync(UpdateEventSourceRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.updateEventSource);
    }

    /**
     * 更新自定义事件源
     *
     * 更新自定义事件源定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEventSourceRequest 请求对象
     * @return AsyncInvoker<UpdateEventSourceRequest, UpdateEventSourceResponse>
     */
    public AsyncInvoker<UpdateEventSourceRequest, UpdateEventSourceResponse> updateEventSourceAsyncInvoker(
        UpdateEventSourceRequest request) {
        return new AsyncInvoker<>(request, EgMeta.updateEventSource, hcClient);
    }

    /**
     * 更新事件流
     *
     * 更新事件流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEventStreamingRequest 请求对象
     * @return CompletableFuture<UpdateEventStreamingResponse>
     */
    public CompletableFuture<UpdateEventStreamingResponse> updateEventStreamingAsync(
        UpdateEventStreamingRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.updateEventStreaming);
    }

    /**
     * 更新事件流
     *
     * 更新事件流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEventStreamingRequest 请求对象
     * @return AsyncInvoker<UpdateEventStreamingRequest, UpdateEventStreamingResponse>
     */
    public AsyncInvoker<UpdateEventStreamingRequest, UpdateEventStreamingResponse> updateEventStreamingAsyncInvoker(
        UpdateEventStreamingRequest request) {
        return new AsyncInvoker<>(request, EgMeta.updateEventStreaming, hcClient);
    }

    /**
     * 更新事件订阅
     *
     * 更新事件订阅定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubscriptionRequest 请求对象
     * @return CompletableFuture<UpdateSubscriptionResponse>
     */
    public CompletableFuture<UpdateSubscriptionResponse> updateSubscriptionAsync(UpdateSubscriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.updateSubscription);
    }

    /**
     * 更新事件订阅
     *
     * 更新事件订阅定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubscriptionRequest 请求对象
     * @return AsyncInvoker<UpdateSubscriptionRequest, UpdateSubscriptionResponse>
     */
    public AsyncInvoker<UpdateSubscriptionRequest, UpdateSubscriptionResponse> updateSubscriptionAsyncInvoker(
        UpdateSubscriptionRequest request) {
        return new AsyncInvoker<>(request, EgMeta.updateSubscription, hcClient);
    }

    /**
     * 更新事件订阅源
     *
     * 更新事件订阅源定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubscriptionSourceRequest 请求对象
     * @return CompletableFuture<UpdateSubscriptionSourceResponse>
     */
    public CompletableFuture<UpdateSubscriptionSourceResponse> updateSubscriptionSourceAsync(
        UpdateSubscriptionSourceRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.updateSubscriptionSource);
    }

    /**
     * 更新事件订阅源
     *
     * 更新事件订阅源定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubscriptionSourceRequest 请求对象
     * @return AsyncInvoker<UpdateSubscriptionSourceRequest, UpdateSubscriptionSourceResponse>
     */
    public AsyncInvoker<UpdateSubscriptionSourceRequest, UpdateSubscriptionSourceResponse> updateSubscriptionSourceAsyncInvoker(
        UpdateSubscriptionSourceRequest request) {
        return new AsyncInvoker<>(request, EgMeta.updateSubscriptionSource, hcClient);
    }

    /**
     * 更新事件订阅目标
     *
     * 更新事件订阅目标定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubscriptionTargetRequest 请求对象
     * @return CompletableFuture<UpdateSubscriptionTargetResponse>
     */
    public CompletableFuture<UpdateSubscriptionTargetResponse> updateSubscriptionTargetAsync(
        UpdateSubscriptionTargetRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.updateSubscriptionTarget);
    }

    /**
     * 更新事件订阅目标
     *
     * 更新事件订阅目标定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubscriptionTargetRequest 请求对象
     * @return AsyncInvoker<UpdateSubscriptionTargetRequest, UpdateSubscriptionTargetResponse>
     */
    public AsyncInvoker<UpdateSubscriptionTargetRequest, UpdateSubscriptionTargetResponse> updateSubscriptionTargetAsyncInvoker(
        UpdateSubscriptionTargetRequest request) {
        return new AsyncInvoker<>(request, EgMeta.updateSubscriptionTarget, hcClient);
    }

    /**
     * 获取API版本列表
     *
     * 获取服务支持的API版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
     * @return CompletableFuture<ListApiVersionsResponse>
     */
    public CompletableFuture<ListApiVersionsResponse> listApiVersionsAsync(ListApiVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.listApiVersions);
    }

    /**
     * 获取API版本列表
     *
     * 获取服务支持的API版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
     * @return AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsAsyncInvoker(
        ListApiVersionsRequest request) {
        return new AsyncInvoker<>(request, EgMeta.listApiVersions, hcClient);
    }

    /**
     * 获取obs桶列表
     *
     * 获取obs桶列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListObsBucketsRequest 请求对象
     * @return CompletableFuture<ListObsBucketsResponse>
     */
    public CompletableFuture<ListObsBucketsResponse> listObsBucketsAsync(ListObsBucketsRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.listObsBuckets);
    }

    /**
     * 获取obs桶列表
     *
     * 获取obs桶列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListObsBucketsRequest 请求对象
     * @return AsyncInvoker<ListObsBucketsRequest, ListObsBucketsResponse>
     */
    public AsyncInvoker<ListObsBucketsRequest, ListObsBucketsResponse> listObsBucketsAsyncInvoker(
        ListObsBucketsRequest request) {
        return new AsyncInvoker<>(request, EgMeta.listObsBuckets, hcClient);
    }

}

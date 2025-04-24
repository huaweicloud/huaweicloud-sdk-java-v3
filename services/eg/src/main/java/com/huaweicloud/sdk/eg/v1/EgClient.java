package com.huaweicloud.sdk.eg.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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
import com.huaweicloud.sdk.eg.v1.model.ExecuteSubscriptionOperationRequest;
import com.huaweicloud.sdk.eg.v1.model.ExecuteSubscriptionOperationResponse;
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

public class EgClient {

    protected HcClient hcClient;

    public EgClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EgClient> newBuilder() {
        ClientBuilder<EgClient> clientBuilder = new ClientBuilder<>(EgClient::new);
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
     * @return CheckPutEventsResponse
     */
    public CheckPutEventsResponse checkPutEvents(CheckPutEventsRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.checkPutEvents);
    }

    /**
     * 预校验指定事件源发布事件成功
     *
     * 发布事件到事件源成功需要有订阅等条件，预先校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckPutEventsRequest 请求对象
     * @return SyncInvoker<CheckPutEventsRequest, CheckPutEventsResponse>
     */
    public SyncInvoker<CheckPutEventsRequest, CheckPutEventsResponse> checkPutEventsInvoker(
        CheckPutEventsRequest request) {
        return new SyncInvoker<>(request, EgMeta.checkPutEvents, hcClient);
    }

    /**
     * 创建服务委托
     *
     * 按照业务场景，一键创建服务委托授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgenciesRequest 请求对象
     * @return CreateAgenciesResponse
     */
    public CreateAgenciesResponse createAgencies(CreateAgenciesRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.createAgencies);
    }

    /**
     * 创建服务委托
     *
     * 按照业务场景，一键创建服务委托授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgenciesRequest 请求对象
     * @return SyncInvoker<CreateAgenciesRequest, CreateAgenciesResponse>
     */
    public SyncInvoker<CreateAgenciesRequest, CreateAgenciesResponse> createAgenciesInvoker(
        CreateAgenciesRequest request) {
        return new SyncInvoker<>(request, EgMeta.createAgencies, hcClient);
    }

    /**
     * 创建自定义事件通道
     *
     * 创建自定义事件通道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateChannelRequest 请求对象
     * @return CreateChannelResponse
     */
    public CreateChannelResponse createChannel(CreateChannelRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.createChannel);
    }

    /**
     * 创建自定义事件通道
     *
     * 创建自定义事件通道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateChannelRequest 请求对象
     * @return SyncInvoker<CreateChannelRequest, CreateChannelResponse>
     */
    public SyncInvoker<CreateChannelRequest, CreateChannelResponse> createChannelInvoker(CreateChannelRequest request) {
        return new SyncInvoker<>(request, EgMeta.createChannel, hcClient);
    }

    /**
     * 创建目标连接
     *
     * 创建目标连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConnectionRequest 请求对象
     * @return CreateConnectionResponse
     */
    public CreateConnectionResponse createConnection(CreateConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.createConnection);
    }

    /**
     * 创建目标连接
     *
     * 创建目标连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConnectionRequest 请求对象
     * @return SyncInvoker<CreateConnectionRequest, CreateConnectionResponse>
     */
    public SyncInvoker<CreateConnectionRequest, CreateConnectionResponse> createConnectionInvoker(
        CreateConnectionRequest request) {
        return new SyncInvoker<>(request, EgMeta.createConnection, hcClient);
    }

    /**
     * 创建访问端点
     *
     * 创建访问端点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEndpointRequest 请求对象
     * @return CreateEndpointResponse
     */
    public CreateEndpointResponse createEndpoint(CreateEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.createEndpoint);
    }

    /**
     * 创建访问端点
     *
     * 创建访问端点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEndpointRequest 请求对象
     * @return SyncInvoker<CreateEndpointRequest, CreateEndpointResponse>
     */
    public SyncInvoker<CreateEndpointRequest, CreateEndpointResponse> createEndpointInvoker(
        CreateEndpointRequest request) {
        return new SyncInvoker<>(request, EgMeta.createEndpoint, hcClient);
    }

    /**
     * 创建自定义事件模型
     *
     * 创建自定义事件模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEventSchemaRequest 请求对象
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
     * @param request CreateEventSchemaRequest 请求对象
     * @return SyncInvoker<CreateEventSchemaRequest, CreateEventSchemaResponse>
     */
    public SyncInvoker<CreateEventSchemaRequest, CreateEventSchemaResponse> createEventSchemaInvoker(
        CreateEventSchemaRequest request) {
        return new SyncInvoker<>(request, EgMeta.createEventSchema, hcClient);
    }

    /**
     * 创建自定义事件模型版本
     *
     * 创建自定义事件模型版本，版本号后台自动生成
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEventSchemaVersionRequest 请求对象
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
     * @param request CreateEventSchemaVersionRequest 请求对象
     * @return SyncInvoker<CreateEventSchemaVersionRequest, CreateEventSchemaVersionResponse>
     */
    public SyncInvoker<CreateEventSchemaVersionRequest, CreateEventSchemaVersionResponse> createEventSchemaVersionInvoker(
        CreateEventSchemaVersionRequest request) {
        return new SyncInvoker<>(request, EgMeta.createEventSchemaVersion, hcClient);
    }

    /**
     * 创建自定义事件源
     *
     * 创建用户自定义类型的事件源，只能指定自定义通道，不能指定系统通道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEventSourceRequest 请求对象
     * @return CreateEventSourceResponse
     */
    public CreateEventSourceResponse createEventSource(CreateEventSourceRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.createEventSource);
    }

    /**
     * 创建自定义事件源
     *
     * 创建用户自定义类型的事件源，只能指定自定义通道，不能指定系统通道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEventSourceRequest 请求对象
     * @return SyncInvoker<CreateEventSourceRequest, CreateEventSourceResponse>
     */
    public SyncInvoker<CreateEventSourceRequest, CreateEventSourceResponse> createEventSourceInvoker(
        CreateEventSourceRequest request) {
        return new SyncInvoker<>(request, EgMeta.createEventSource, hcClient);
    }

    /**
     * 创建事件流
     *
     * 创建事件流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEventStreamingRequest 请求对象
     * @return CreateEventStreamingResponse
     */
    public CreateEventStreamingResponse createEventStreaming(CreateEventStreamingRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.createEventStreaming);
    }

    /**
     * 创建事件流
     *
     * 创建事件流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEventStreamingRequest 请求对象
     * @return SyncInvoker<CreateEventStreamingRequest, CreateEventStreamingResponse>
     */
    public SyncInvoker<CreateEventStreamingRequest, CreateEventStreamingResponse> createEventStreamingInvoker(
        CreateEventStreamingRequest request) {
        return new SyncInvoker<>(request, EgMeta.createEventStreaming, hcClient);
    }

    /**
     * 创建事件订阅
     *
     * 创建事件订阅。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubscriptionRequest 请求对象
     * @return CreateSubscriptionResponse
     */
    public CreateSubscriptionResponse createSubscription(CreateSubscriptionRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.createSubscription);
    }

    /**
     * 创建事件订阅
     *
     * 创建事件订阅。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubscriptionRequest 请求对象
     * @return SyncInvoker<CreateSubscriptionRequest, CreateSubscriptionResponse>
     */
    public SyncInvoker<CreateSubscriptionRequest, CreateSubscriptionResponse> createSubscriptionInvoker(
        CreateSubscriptionRequest request) {
        return new SyncInvoker<>(request, EgMeta.createSubscription, hcClient);
    }

    /**
     * 创建事件订阅目标
     *
     * 创建单个事件订阅目标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubscriptionTargetRequest 请求对象
     * @return CreateSubscriptionTargetResponse
     */
    public CreateSubscriptionTargetResponse createSubscriptionTarget(CreateSubscriptionTargetRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.createSubscriptionTarget);
    }

    /**
     * 创建事件订阅目标
     *
     * 创建单个事件订阅目标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubscriptionTargetRequest 请求对象
     * @return SyncInvoker<CreateSubscriptionTargetRequest, CreateSubscriptionTargetResponse>
     */
    public SyncInvoker<CreateSubscriptionTargetRequest, CreateSubscriptionTargetResponse> createSubscriptionTargetInvoker(
        CreateSubscriptionTargetRequest request) {
        return new SyncInvoker<>(request, EgMeta.createSubscriptionTarget, hcClient);
    }

    /**
     * 删除自定义事件通道
     *
     * 删除指定自定义事件通道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteChannelRequest 请求对象
     * @return DeleteChannelResponse
     */
    public DeleteChannelResponse deleteChannel(DeleteChannelRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.deleteChannel);
    }

    /**
     * 删除自定义事件通道
     *
     * 删除指定自定义事件通道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteChannelRequest 请求对象
     * @return SyncInvoker<DeleteChannelRequest, DeleteChannelResponse>
     */
    public SyncInvoker<DeleteChannelRequest, DeleteChannelResponse> deleteChannelInvoker(DeleteChannelRequest request) {
        return new SyncInvoker<>(request, EgMeta.deleteChannel, hcClient);
    }

    /**
     * 删除目标连接
     *
     * 删除目标连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConnectionRequest 请求对象
     * @return DeleteConnectionResponse
     */
    public DeleteConnectionResponse deleteConnection(DeleteConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.deleteConnection);
    }

    /**
     * 删除目标连接
     *
     * 删除目标连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConnectionRequest 请求对象
     * @return SyncInvoker<DeleteConnectionRequest, DeleteConnectionResponse>
     */
    public SyncInvoker<DeleteConnectionRequest, DeleteConnectionResponse> deleteConnectionInvoker(
        DeleteConnectionRequest request) {
        return new SyncInvoker<>(request, EgMeta.deleteConnection, hcClient);
    }

    /**
     * 删除访问端点
     *
     * 删除访问端点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEndpointRequest 请求对象
     * @return DeleteEndpointResponse
     */
    public DeleteEndpointResponse deleteEndpoint(DeleteEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.deleteEndpoint);
    }

    /**
     * 删除访问端点
     *
     * 删除访问端点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEndpointRequest 请求对象
     * @return SyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse>
     */
    public SyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse> deleteEndpointInvoker(
        DeleteEndpointRequest request) {
        return new SyncInvoker<>(request, EgMeta.deleteEndpoint, hcClient);
    }

    /**
     * 删除事件模型
     *
     * 删除事件模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEventSchemaRequest 请求对象
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
     * @param request DeleteEventSchemaRequest 请求对象
     * @return SyncInvoker<DeleteEventSchemaRequest, DeleteEventSchemaResponse>
     */
    public SyncInvoker<DeleteEventSchemaRequest, DeleteEventSchemaResponse> deleteEventSchemaInvoker(
        DeleteEventSchemaRequest request) {
        return new SyncInvoker<>(request, EgMeta.deleteEventSchema, hcClient);
    }

    /**
     * 删除事件模型版本
     *
     * 删除事件模型指定版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEventSchemaVersionRequest 请求对象
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
     * @param request DeleteEventSchemaVersionRequest 请求对象
     * @return SyncInvoker<DeleteEventSchemaVersionRequest, DeleteEventSchemaVersionResponse>
     */
    public SyncInvoker<DeleteEventSchemaVersionRequest, DeleteEventSchemaVersionResponse> deleteEventSchemaVersionInvoker(
        DeleteEventSchemaVersionRequest request) {
        return new SyncInvoker<>(request, EgMeta.deleteEventSchemaVersion, hcClient);
    }

    /**
     * 删除自定义事件源
     *
     * 删除指定的自定义事件源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEventSourceRequest 请求对象
     * @return DeleteEventSourceResponse
     */
    public DeleteEventSourceResponse deleteEventSource(DeleteEventSourceRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.deleteEventSource);
    }

    /**
     * 删除自定义事件源
     *
     * 删除指定的自定义事件源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEventSourceRequest 请求对象
     * @return SyncInvoker<DeleteEventSourceRequest, DeleteEventSourceResponse>
     */
    public SyncInvoker<DeleteEventSourceRequest, DeleteEventSourceResponse> deleteEventSourceInvoker(
        DeleteEventSourceRequest request) {
        return new SyncInvoker<>(request, EgMeta.deleteEventSource, hcClient);
    }

    /**
     * 删除事件流
     *
     * 删除事件流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEventStreamingRequest 请求对象
     * @return DeleteEventStreamingResponse
     */
    public DeleteEventStreamingResponse deleteEventStreaming(DeleteEventStreamingRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.deleteEventStreaming);
    }

    /**
     * 删除事件流
     *
     * 删除事件流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEventStreamingRequest 请求对象
     * @return SyncInvoker<DeleteEventStreamingRequest, DeleteEventStreamingResponse>
     */
    public SyncInvoker<DeleteEventStreamingRequest, DeleteEventStreamingResponse> deleteEventStreamingInvoker(
        DeleteEventStreamingRequest request) {
        return new SyncInvoker<>(request, EgMeta.deleteEventStreaming, hcClient);
    }

    /**
     * 删除事件订阅
     *
     * 删除事件订阅。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubscriptionRequest 请求对象
     * @return DeleteSubscriptionResponse
     */
    public DeleteSubscriptionResponse deleteSubscription(DeleteSubscriptionRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.deleteSubscription);
    }

    /**
     * 删除事件订阅
     *
     * 删除事件订阅。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubscriptionRequest 请求对象
     * @return SyncInvoker<DeleteSubscriptionRequest, DeleteSubscriptionResponse>
     */
    public SyncInvoker<DeleteSubscriptionRequest, DeleteSubscriptionResponse> deleteSubscriptionInvoker(
        DeleteSubscriptionRequest request) {
        return new SyncInvoker<>(request, EgMeta.deleteSubscription, hcClient);
    }

    /**
     * 删除事件订阅目标
     *
     * 删除事件订阅目标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubscriptionTargetRequest 请求对象
     * @return DeleteSubscriptionTargetResponse
     */
    public DeleteSubscriptionTargetResponse deleteSubscriptionTarget(DeleteSubscriptionTargetRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.deleteSubscriptionTarget);
    }

    /**
     * 删除事件订阅目标
     *
     * 删除事件订阅目标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubscriptionTargetRequest 请求对象
     * @return SyncInvoker<DeleteSubscriptionTargetRequest, DeleteSubscriptionTargetResponse>
     */
    public SyncInvoker<DeleteSubscriptionTargetRequest, DeleteSubscriptionTargetResponse> deleteSubscriptionTargetInvoker(
        DeleteSubscriptionTargetRequest request) {
        return new SyncInvoker<>(request, EgMeta.deleteSubscriptionTarget, hcClient);
    }

    /**
     * 事件模型自动发现
     *
     * 事件模型自动发现
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DiscoverEventSchemaFromDataRequest 请求对象
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
     * @param request DiscoverEventSchemaFromDataRequest 请求对象
     * @return SyncInvoker<DiscoverEventSchemaFromDataRequest, DiscoverEventSchemaFromDataResponse>
     */
    public SyncInvoker<DiscoverEventSchemaFromDataRequest, DiscoverEventSchemaFromDataResponse> discoverEventSchemaFromDataInvoker(
        DiscoverEventSchemaFromDataRequest request) {
        return new SyncInvoker<>(request, EgMeta.discoverEventSchemaFromData, hcClient);
    }

    /**
     * 操作事件订阅
     *
     * 操作事件订阅，支持启用、禁用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteSubscriptionOperationRequest 请求对象
     * @return ExecuteSubscriptionOperationResponse
     */
    public ExecuteSubscriptionOperationResponse executeSubscriptionOperation(
        ExecuteSubscriptionOperationRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.executeSubscriptionOperation);
    }

    /**
     * 操作事件订阅
     *
     * 操作事件订阅，支持启用、禁用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteSubscriptionOperationRequest 请求对象
     * @return SyncInvoker<ExecuteSubscriptionOperationRequest, ExecuteSubscriptionOperationResponse>
     */
    public SyncInvoker<ExecuteSubscriptionOperationRequest, ExecuteSubscriptionOperationResponse> executeSubscriptionOperationInvoker(
        ExecuteSubscriptionOperationRequest request) {
        return new SyncInvoker<>(request, EgMeta.executeSubscriptionOperation, hcClient);
    }

    /**
     * 查询服务委托
     *
     * 查询服务委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgenciesRequest 请求对象
     * @return ListAgenciesResponse
     */
    public ListAgenciesResponse listAgencies(ListAgenciesRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.listAgencies);
    }

    /**
     * 查询服务委托
     *
     * 查询服务委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgenciesRequest 请求对象
     * @return SyncInvoker<ListAgenciesRequest, ListAgenciesResponse>
     */
    public SyncInvoker<ListAgenciesRequest, ListAgenciesResponse> listAgenciesInvoker(ListAgenciesRequest request) {
        return new SyncInvoker<>(request, EgMeta.listAgencies, hcClient);
    }

    /**
     * 查询事件通道列表
     *
     * 查询事件通道列表，包括系统通道和自定义通道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListChannelsRequest 请求对象
     * @return ListChannelsResponse
     */
    public ListChannelsResponse listChannels(ListChannelsRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.listChannels);
    }

    /**
     * 查询事件通道列表
     *
     * 查询事件通道列表，包括系统通道和自定义通道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListChannelsRequest 请求对象
     * @return SyncInvoker<ListChannelsRequest, ListChannelsResponse>
     */
    public SyncInvoker<ListChannelsRequest, ListChannelsResponse> listChannelsInvoker(ListChannelsRequest request) {
        return new SyncInvoker<>(request, EgMeta.listChannels, hcClient);
    }

    /**
     * 查询目标连接列表
     *
     * 查询目标连接列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectionsRequest 请求对象
     * @return ListConnectionsResponse
     */
    public ListConnectionsResponse listConnections(ListConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.listConnections);
    }

    /**
     * 查询目标连接列表
     *
     * 查询目标连接列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectionsRequest 请求对象
     * @return SyncInvoker<ListConnectionsRequest, ListConnectionsResponse>
     */
    public SyncInvoker<ListConnectionsRequest, ListConnectionsResponse> listConnectionsInvoker(
        ListConnectionsRequest request) {
        return new SyncInvoker<>(request, EgMeta.listConnections, hcClient);
    }

    /**
     * 查询访问端点
     *
     * 查询访问端点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointsRequest 请求对象
     * @return ListEndpointsResponse
     */
    public ListEndpointsResponse listEndpoints(ListEndpointsRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.listEndpoints);
    }

    /**
     * 查询访问端点
     *
     * 查询访问端点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointsRequest 请求对象
     * @return SyncInvoker<ListEndpointsRequest, ListEndpointsResponse>
     */
    public SyncInvoker<ListEndpointsRequest, ListEndpointsResponse> listEndpointsInvoker(ListEndpointsRequest request) {
        return new SyncInvoker<>(request, EgMeta.listEndpoints, hcClient);
    }

    /**
     * 查询事件模型列表
     *
     * 查询事件模型列表，包括系统事件模型和自定义事件模型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventSchemaRequest 请求对象
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
     * @param request ListEventSchemaRequest 请求对象
     * @return SyncInvoker<ListEventSchemaRequest, ListEventSchemaResponse>
     */
    public SyncInvoker<ListEventSchemaRequest, ListEventSchemaResponse> listEventSchemaInvoker(
        ListEventSchemaRequest request) {
        return new SyncInvoker<>(request, EgMeta.listEventSchema, hcClient);
    }

    /**
     * 查询事件模型版本列表
     *
     * 查询事件模型版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventSchemaVersionsRequest 请求对象
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
     * @param request ListEventSchemaVersionsRequest 请求对象
     * @return SyncInvoker<ListEventSchemaVersionsRequest, ListEventSchemaVersionsResponse>
     */
    public SyncInvoker<ListEventSchemaVersionsRequest, ListEventSchemaVersionsResponse> listEventSchemaVersionsInvoker(
        ListEventSchemaVersionsRequest request) {
        return new SyncInvoker<>(request, EgMeta.listEventSchemaVersions, hcClient);
    }

    /**
     * 查询事件源列表
     *
     * 支持条件查询，如可以指定事件通道ID来查询某个事件通道下的所有事件源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventSourcesRequest 请求对象
     * @return ListEventSourcesResponse
     */
    public ListEventSourcesResponse listEventSources(ListEventSourcesRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.listEventSources);
    }

    /**
     * 查询事件源列表
     *
     * 支持条件查询，如可以指定事件通道ID来查询某个事件通道下的所有事件源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventSourcesRequest 请求对象
     * @return SyncInvoker<ListEventSourcesRequest, ListEventSourcesResponse>
     */
    public SyncInvoker<ListEventSourcesRequest, ListEventSourcesResponse> listEventSourcesInvoker(
        ListEventSourcesRequest request) {
        return new SyncInvoker<>(request, EgMeta.listEventSources, hcClient);
    }

    /**
     * 查询事件流列表
     *
     * 查询事件流列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventStreamingRequest 请求对象
     * @return ListEventStreamingResponse
     */
    public ListEventStreamingResponse listEventStreaming(ListEventStreamingRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.listEventStreaming);
    }

    /**
     * 查询事件流列表
     *
     * 查询事件流列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventStreamingRequest 请求对象
     * @return SyncInvoker<ListEventStreamingRequest, ListEventStreamingResponse>
     */
    public SyncInvoker<ListEventStreamingRequest, ListEventStreamingResponse> listEventStreamingInvoker(
        ListEventStreamingRequest request) {
        return new SyncInvoker<>(request, EgMeta.listEventStreaming, hcClient);
    }

    /**
     * 查询事件目标分类
     *
     * 查询预置的事件目标分类，获取每个事件目标分类的字段定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventTargetRequest 请求对象
     * @return ListEventTargetResponse
     */
    public ListEventTargetResponse listEventTarget(ListEventTargetRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.listEventTarget);
    }

    /**
     * 查询事件目标分类
     *
     * 查询预置的事件目标分类，获取每个事件目标分类的字段定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventTargetRequest 请求对象
     * @return SyncInvoker<ListEventTargetRequest, ListEventTargetResponse>
     */
    public SyncInvoker<ListEventTargetRequest, ListEventTargetResponse> listEventTargetInvoker(
        ListEventTargetRequest request) {
        return new SyncInvoker<>(request, EgMeta.listEventTarget, hcClient);
    }

    /**
     * 查询事件通道监控指标数据
     *
     * 查询事件通道监控指标数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPubMetricsRequest 请求对象
     * @return ListPubMetricsResponse
     */
    public ListPubMetricsResponse listPubMetrics(ListPubMetricsRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.listPubMetrics);
    }

    /**
     * 查询事件通道监控指标数据
     *
     * 查询事件通道监控指标数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPubMetricsRequest 请求对象
     * @return SyncInvoker<ListPubMetricsRequest, ListPubMetricsResponse>
     */
    public SyncInvoker<ListPubMetricsRequest, ListPubMetricsResponse> listPubMetricsInvoker(
        ListPubMetricsRequest request) {
        return new SyncInvoker<>(request, EgMeta.listPubMetrics, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询当前租户的配额，未特殊配置过的会返回默认配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotasRequest 请求对象
     * @return ListQuotasResponse
     */
    public ListQuotasResponse listQuotas(ListQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.listQuotas);
    }

    /**
     * 查询配额
     *
     * 查询当前租户的配额，未特殊配置过的会返回默认配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotasRequest 请求对象
     * @return SyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public SyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasInvoker(ListQuotasRequest request) {
        return new SyncInvoker<>(request, EgMeta.listQuotas, hcClient);
    }

    /**
     * 查询事件订阅监控指标数据
     *
     * 查询事件订阅监控指标数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubMetricsRequest 请求对象
     * @return ListSubMetricsResponse
     */
    public ListSubMetricsResponse listSubMetrics(ListSubMetricsRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.listSubMetrics);
    }

    /**
     * 查询事件订阅监控指标数据
     *
     * 查询事件订阅监控指标数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubMetricsRequest 请求对象
     * @return SyncInvoker<ListSubMetricsRequest, ListSubMetricsResponse>
     */
    public SyncInvoker<ListSubMetricsRequest, ListSubMetricsResponse> listSubMetricsInvoker(
        ListSubMetricsRequest request) {
        return new SyncInvoker<>(request, EgMeta.listSubMetrics, hcClient);
    }

    /**
     * 查询事件订阅列表
     *
     * 查询事件订阅列表，支持指定事件通道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubscriptionsRequest 请求对象
     * @return ListSubscriptionsResponse
     */
    public ListSubscriptionsResponse listSubscriptions(ListSubscriptionsRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.listSubscriptions);
    }

    /**
     * 查询事件订阅列表
     *
     * 查询事件订阅列表，支持指定事件通道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubscriptionsRequest 请求对象
     * @return SyncInvoker<ListSubscriptionsRequest, ListSubscriptionsResponse>
     */
    public SyncInvoker<ListSubscriptionsRequest, ListSubscriptionsResponse> listSubscriptionsInvoker(
        ListSubscriptionsRequest request) {
        return new SyncInvoker<>(request, EgMeta.listSubscriptions, hcClient);
    }

    /**
     * 查询事件追踪列表
     *
     * 查询事件追踪列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTracedEventsRequest 请求对象
     * @return ListTracedEventsResponse
     */
    public ListTracedEventsResponse listTracedEvents(ListTracedEventsRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.listTracedEvents);
    }

    /**
     * 查询事件追踪列表
     *
     * 查询事件追踪列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTracedEventsRequest 请求对象
     * @return SyncInvoker<ListTracedEventsRequest, ListTracedEventsResponse>
     */
    public SyncInvoker<ListTracedEventsRequest, ListTracedEventsResponse> listTracedEventsInvoker(
        ListTracedEventsRequest request) {
        return new SyncInvoker<>(request, EgMeta.listTracedEvents, hcClient);
    }

    /**
     * 查询单个函数的EG触发器
     *
     * 查询触发器，支持指定函数urn，一个以函数urn为目标的订阅为一个触发器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTriggersRequest 请求对象
     * @return ListTriggersResponse
     */
    public ListTriggersResponse listTriggers(ListTriggersRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.listTriggers);
    }

    /**
     * 查询单个函数的EG触发器
     *
     * 查询触发器，支持指定函数urn，一个以函数urn为目标的订阅为一个触发器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTriggersRequest 请求对象
     * @return SyncInvoker<ListTriggersRequest, ListTriggersResponse>
     */
    public SyncInvoker<ListTriggersRequest, ListTriggersResponse> listTriggersInvoker(ListTriggersRequest request) {
        return new SyncInvoker<>(request, EgMeta.listTriggers, hcClient);
    }

    /**
     * 查询单个函数流的EG触发器
     *
     * 查询触发器，支持指定函数流id，一个以函数流id为目标的订阅为一个触发器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkflowTriggersRequest 请求对象
     * @return ListWorkflowTriggersResponse
     */
    public ListWorkflowTriggersResponse listWorkflowTriggers(ListWorkflowTriggersRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.listWorkflowTriggers);
    }

    /**
     * 查询单个函数流的EG触发器
     *
     * 查询触发器，支持指定函数流id，一个以函数流id为目标的订阅为一个触发器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkflowTriggersRequest 请求对象
     * @return SyncInvoker<ListWorkflowTriggersRequest, ListWorkflowTriggersResponse>
     */
    public SyncInvoker<ListWorkflowTriggersRequest, ListWorkflowTriggersResponse> listWorkflowTriggersInvoker(
        ListWorkflowTriggersRequest request) {
        return new SyncInvoker<>(request, EgMeta.listWorkflowTriggers, hcClient);
    }

    /**
     * 发布事件到事件通道
     *
     * 发布事件到事件通道，仅供调试使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PutEventsRequest 请求对象
     * @return PutEventsResponse
     */
    public PutEventsResponse putEvents(PutEventsRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.putEvents);
    }

    /**
     * 发布事件到事件通道
     *
     * 发布事件到事件通道，仅供调试使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PutEventsRequest 请求对象
     * @return SyncInvoker<PutEventsRequest, PutEventsResponse>
     */
    public SyncInvoker<PutEventsRequest, PutEventsResponse> putEventsInvoker(PutEventsRequest request) {
        return new SyncInvoker<>(request, EgMeta.putEvents, hcClient);
    }

    /**
     * 发布官方事件到事件通道
     *
     * 发布官方事件到事件通道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PutOfficialEventsRequest 请求对象
     * @return PutOfficialEventsResponse
     */
    public PutOfficialEventsResponse putOfficialEvents(PutOfficialEventsRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.putOfficialEvents);
    }

    /**
     * 发布官方事件到事件通道
     *
     * 发布官方事件到事件通道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PutOfficialEventsRequest 请求对象
     * @return SyncInvoker<PutOfficialEventsRequest, PutOfficialEventsResponse>
     */
    public SyncInvoker<PutOfficialEventsRequest, PutOfficialEventsResponse> putOfficialEventsInvoker(
        PutOfficialEventsRequest request) {
        return new SyncInvoker<>(request, EgMeta.putOfficialEvents, hcClient);
    }

    /**
     * 操作事件流
     *
     * 操作事件流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResumeEventStreamingRequest 请求对象
     * @return ResumeEventStreamingResponse
     */
    public ResumeEventStreamingResponse resumeEventStreaming(ResumeEventStreamingRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.resumeEventStreaming);
    }

    /**
     * 操作事件流
     *
     * 操作事件流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResumeEventStreamingRequest 请求对象
     * @return SyncInvoker<ResumeEventStreamingRequest, ResumeEventStreamingResponse>
     */
    public SyncInvoker<ResumeEventStreamingRequest, ResumeEventStreamingResponse> resumeEventStreamingInvoker(
        ResumeEventStreamingRequest request) {
        return new SyncInvoker<>(request, EgMeta.resumeEventStreaming, hcClient);
    }

    /**
     * 查询事件通道详情
     *
     * 查询指定事件通道详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailOfChannelRequest 请求对象
     * @return ShowDetailOfChannelResponse
     */
    public ShowDetailOfChannelResponse showDetailOfChannel(ShowDetailOfChannelRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.showDetailOfChannel);
    }

    /**
     * 查询事件通道详情
     *
     * 查询指定事件通道详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailOfChannelRequest 请求对象
     * @return SyncInvoker<ShowDetailOfChannelRequest, ShowDetailOfChannelResponse>
     */
    public SyncInvoker<ShowDetailOfChannelRequest, ShowDetailOfChannelResponse> showDetailOfChannelInvoker(
        ShowDetailOfChannelRequest request) {
        return new SyncInvoker<>(request, EgMeta.showDetailOfChannel, hcClient);
    }

    /**
     * 查询目标连接详情
     *
     * 查询目标连接详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailOfConnectionRequest 请求对象
     * @return ShowDetailOfConnectionResponse
     */
    public ShowDetailOfConnectionResponse showDetailOfConnection(ShowDetailOfConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.showDetailOfConnection);
    }

    /**
     * 查询目标连接详情
     *
     * 查询目标连接详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailOfConnectionRequest 请求对象
     * @return SyncInvoker<ShowDetailOfConnectionRequest, ShowDetailOfConnectionResponse>
     */
    public SyncInvoker<ShowDetailOfConnectionRequest, ShowDetailOfConnectionResponse> showDetailOfConnectionInvoker(
        ShowDetailOfConnectionRequest request) {
        return new SyncInvoker<>(request, EgMeta.showDetailOfConnection, hcClient);
    }

    /**
     * 查询发送事件的内容
     *
     * 根据事件ID查询事件详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailOfEventRequest 请求对象
     * @return ShowDetailOfEventResponse
     */
    public ShowDetailOfEventResponse showDetailOfEvent(ShowDetailOfEventRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.showDetailOfEvent);
    }

    /**
     * 查询发送事件的内容
     *
     * 根据事件ID查询事件详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailOfEventRequest 请求对象
     * @return SyncInvoker<ShowDetailOfEventRequest, ShowDetailOfEventResponse>
     */
    public SyncInvoker<ShowDetailOfEventRequest, ShowDetailOfEventResponse> showDetailOfEventInvoker(
        ShowDetailOfEventRequest request) {
        return new SyncInvoker<>(request, EgMeta.showDetailOfEvent, hcClient);
    }

    /**
     * 查询事件模型详情
     *
     * 查询事件模型详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailOfEventSchemaRequest 请求对象
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
     * @param request ShowDetailOfEventSchemaRequest 请求对象
     * @return SyncInvoker<ShowDetailOfEventSchemaRequest, ShowDetailOfEventSchemaResponse>
     */
    public SyncInvoker<ShowDetailOfEventSchemaRequest, ShowDetailOfEventSchemaResponse> showDetailOfEventSchemaInvoker(
        ShowDetailOfEventSchemaRequest request) {
        return new SyncInvoker<>(request, EgMeta.showDetailOfEventSchema, hcClient);
    }

    /**
     * 查询事件模型版本详情
     *
     * 查询事件模型指定版本详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailOfEventSchemaVersionRequest 请求对象
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
     * @param request ShowDetailOfEventSchemaVersionRequest 请求对象
     * @return SyncInvoker<ShowDetailOfEventSchemaVersionRequest, ShowDetailOfEventSchemaVersionResponse>
     */
    public SyncInvoker<ShowDetailOfEventSchemaVersionRequest, ShowDetailOfEventSchemaVersionResponse> showDetailOfEventSchemaVersionInvoker(
        ShowDetailOfEventSchemaVersionRequest request) {
        return new SyncInvoker<>(request, EgMeta.showDetailOfEventSchemaVersion, hcClient);
    }

    /**
     * 查询事件源详情
     *
     * 查询事件源详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailOfEventSourceRequest 请求对象
     * @return ShowDetailOfEventSourceResponse
     */
    public ShowDetailOfEventSourceResponse showDetailOfEventSource(ShowDetailOfEventSourceRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.showDetailOfEventSource);
    }

    /**
     * 查询事件源详情
     *
     * 查询事件源详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailOfEventSourceRequest 请求对象
     * @return SyncInvoker<ShowDetailOfEventSourceRequest, ShowDetailOfEventSourceResponse>
     */
    public SyncInvoker<ShowDetailOfEventSourceRequest, ShowDetailOfEventSourceResponse> showDetailOfEventSourceInvoker(
        ShowDetailOfEventSourceRequest request) {
        return new SyncInvoker<>(request, EgMeta.showDetailOfEventSource, hcClient);
    }

    /**
     * 事件轨迹详情
     *
     * 事件轨迹详情，展示事件源到投递目标的投递情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailOfEventTraceRequest 请求对象
     * @return ShowDetailOfEventTraceResponse
     */
    public ShowDetailOfEventTraceResponse showDetailOfEventTrace(ShowDetailOfEventTraceRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.showDetailOfEventTrace);
    }

    /**
     * 事件轨迹详情
     *
     * 事件轨迹详情，展示事件源到投递目标的投递情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailOfEventTraceRequest 请求对象
     * @return SyncInvoker<ShowDetailOfEventTraceRequest, ShowDetailOfEventTraceResponse>
     */
    public SyncInvoker<ShowDetailOfEventTraceRequest, ShowDetailOfEventTraceResponse> showDetailOfEventTraceInvoker(
        ShowDetailOfEventTraceRequest request) {
        return new SyncInvoker<>(request, EgMeta.showDetailOfEventTrace, hcClient);
    }

    /**
     * 查询事件订阅详情
     *
     * 查询事件订阅详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailOfSubscriptionRequest 请求对象
     * @return ShowDetailOfSubscriptionResponse
     */
    public ShowDetailOfSubscriptionResponse showDetailOfSubscription(ShowDetailOfSubscriptionRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.showDetailOfSubscription);
    }

    /**
     * 查询事件订阅详情
     *
     * 查询事件订阅详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailOfSubscriptionRequest 请求对象
     * @return SyncInvoker<ShowDetailOfSubscriptionRequest, ShowDetailOfSubscriptionResponse>
     */
    public SyncInvoker<ShowDetailOfSubscriptionRequest, ShowDetailOfSubscriptionResponse> showDetailOfSubscriptionInvoker(
        ShowDetailOfSubscriptionRequest request) {
        return new SyncInvoker<>(request, EgMeta.showDetailOfSubscription, hcClient);
    }

    /**
     * 查询事件订阅目标详情
     *
     * 查询事件订阅目标详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailOfSubscriptionTargetRequest 请求对象
     * @return ShowDetailOfSubscriptionTargetResponse
     */
    public ShowDetailOfSubscriptionTargetResponse showDetailOfSubscriptionTarget(
        ShowDetailOfSubscriptionTargetRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.showDetailOfSubscriptionTarget);
    }

    /**
     * 查询事件订阅目标详情
     *
     * 查询事件订阅目标详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDetailOfSubscriptionTargetRequest 请求对象
     * @return SyncInvoker<ShowDetailOfSubscriptionTargetRequest, ShowDetailOfSubscriptionTargetResponse>
     */
    public SyncInvoker<ShowDetailOfSubscriptionTargetRequest, ShowDetailOfSubscriptionTargetResponse> showDetailOfSubscriptionTargetInvoker(
        ShowDetailOfSubscriptionTargetRequest request) {
        return new SyncInvoker<>(request, EgMeta.showDetailOfSubscriptionTarget, hcClient);
    }

    /**
     * 查询事件流详情
     *
     * 查询事件流详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEventStreamingRequest 请求对象
     * @return ShowEventStreamingResponse
     */
    public ShowEventStreamingResponse showEventStreaming(ShowEventStreamingRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.showEventStreaming);
    }

    /**
     * 查询事件流详情
     *
     * 查询事件流详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEventStreamingRequest 请求对象
     * @return SyncInvoker<ShowEventStreamingRequest, ShowEventStreamingResponse>
     */
    public SyncInvoker<ShowEventStreamingRequest, ShowEventStreamingResponse> showEventStreamingInvoker(
        ShowEventStreamingRequest request) {
        return new SyncInvoker<>(request, EgMeta.showEventStreaming, hcClient);
    }

    /**
     * 查询事件示例列表
     *
     * 查询事件示例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowListOfEventSampleRequest 请求对象
     * @return ShowListOfEventSampleResponse
     */
    public ShowListOfEventSampleResponse showListOfEventSample(ShowListOfEventSampleRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.showListOfEventSample);
    }

    /**
     * 查询事件示例列表
     *
     * 查询事件示例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowListOfEventSampleRequest 请求对象
     * @return SyncInvoker<ShowListOfEventSampleRequest, ShowListOfEventSampleResponse>
     */
    public SyncInvoker<ShowListOfEventSampleRequest, ShowListOfEventSampleResponse> showListOfEventSampleInvoker(
        ShowListOfEventSampleRequest request) {
        return new SyncInvoker<>(request, EgMeta.showListOfEventSample, hcClient);
    }

    /**
     * 更新自定义事件通道
     *
     * 更新自定义事件通道定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateChannelRequest 请求对象
     * @return UpdateChannelResponse
     */
    public UpdateChannelResponse updateChannel(UpdateChannelRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.updateChannel);
    }

    /**
     * 更新自定义事件通道
     *
     * 更新自定义事件通道定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateChannelRequest 请求对象
     * @return SyncInvoker<UpdateChannelRequest, UpdateChannelResponse>
     */
    public SyncInvoker<UpdateChannelRequest, UpdateChannelResponse> updateChannelInvoker(UpdateChannelRequest request) {
        return new SyncInvoker<>(request, EgMeta.updateChannel, hcClient);
    }

    /**
     * 更新目标连接
     *
     * 更新目标连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConnectionRequest 请求对象
     * @return UpdateConnectionResponse
     */
    public UpdateConnectionResponse updateConnection(UpdateConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.updateConnection);
    }

    /**
     * 更新目标连接
     *
     * 更新目标连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConnectionRequest 请求对象
     * @return SyncInvoker<UpdateConnectionRequest, UpdateConnectionResponse>
     */
    public SyncInvoker<UpdateConnectionRequest, UpdateConnectionResponse> updateConnectionInvoker(
        UpdateConnectionRequest request) {
        return new SyncInvoker<>(request, EgMeta.updateConnection, hcClient);
    }

    /**
     * 更新访问端点
     *
     * 更新访问端点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointRequest 请求对象
     * @return UpdateEndpointResponse
     */
    public UpdateEndpointResponse updateEndpoint(UpdateEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.updateEndpoint);
    }

    /**
     * 更新访问端点
     *
     * 更新访问端点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointRequest 请求对象
     * @return SyncInvoker<UpdateEndpointRequest, UpdateEndpointResponse>
     */
    public SyncInvoker<UpdateEndpointRequest, UpdateEndpointResponse> updateEndpointInvoker(
        UpdateEndpointRequest request) {
        return new SyncInvoker<>(request, EgMeta.updateEndpoint, hcClient);
    }

    /**
     * 更新自定义事件模型
     *
     * 更新自定义事件模型定义
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEventSchemaRequest 请求对象
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
     * @param request UpdateEventSchemaRequest 请求对象
     * @return SyncInvoker<UpdateEventSchemaRequest, UpdateEventSchemaResponse>
     */
    public SyncInvoker<UpdateEventSchemaRequest, UpdateEventSchemaResponse> updateEventSchemaInvoker(
        UpdateEventSchemaRequest request) {
        return new SyncInvoker<>(request, EgMeta.updateEventSchema, hcClient);
    }

    /**
     * 更新自定义事件源
     *
     * 更新自定义事件源定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEventSourceRequest 请求对象
     * @return UpdateEventSourceResponse
     */
    public UpdateEventSourceResponse updateEventSource(UpdateEventSourceRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.updateEventSource);
    }

    /**
     * 更新自定义事件源
     *
     * 更新自定义事件源定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEventSourceRequest 请求对象
     * @return SyncInvoker<UpdateEventSourceRequest, UpdateEventSourceResponse>
     */
    public SyncInvoker<UpdateEventSourceRequest, UpdateEventSourceResponse> updateEventSourceInvoker(
        UpdateEventSourceRequest request) {
        return new SyncInvoker<>(request, EgMeta.updateEventSource, hcClient);
    }

    /**
     * 更新事件流
     *
     * 更新事件流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEventStreamingRequest 请求对象
     * @return UpdateEventStreamingResponse
     */
    public UpdateEventStreamingResponse updateEventStreaming(UpdateEventStreamingRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.updateEventStreaming);
    }

    /**
     * 更新事件流
     *
     * 更新事件流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEventStreamingRequest 请求对象
     * @return SyncInvoker<UpdateEventStreamingRequest, UpdateEventStreamingResponse>
     */
    public SyncInvoker<UpdateEventStreamingRequest, UpdateEventStreamingResponse> updateEventStreamingInvoker(
        UpdateEventStreamingRequest request) {
        return new SyncInvoker<>(request, EgMeta.updateEventStreaming, hcClient);
    }

    /**
     * 更新事件订阅
     *
     * 更新事件订阅定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubscriptionRequest 请求对象
     * @return UpdateSubscriptionResponse
     */
    public UpdateSubscriptionResponse updateSubscription(UpdateSubscriptionRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.updateSubscription);
    }

    /**
     * 更新事件订阅
     *
     * 更新事件订阅定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubscriptionRequest 请求对象
     * @return SyncInvoker<UpdateSubscriptionRequest, UpdateSubscriptionResponse>
     */
    public SyncInvoker<UpdateSubscriptionRequest, UpdateSubscriptionResponse> updateSubscriptionInvoker(
        UpdateSubscriptionRequest request) {
        return new SyncInvoker<>(request, EgMeta.updateSubscription, hcClient);
    }

    /**
     * 更新事件订阅源
     *
     * 更新事件订阅源定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubscriptionSourceRequest 请求对象
     * @return UpdateSubscriptionSourceResponse
     */
    public UpdateSubscriptionSourceResponse updateSubscriptionSource(UpdateSubscriptionSourceRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.updateSubscriptionSource);
    }

    /**
     * 更新事件订阅源
     *
     * 更新事件订阅源定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubscriptionSourceRequest 请求对象
     * @return SyncInvoker<UpdateSubscriptionSourceRequest, UpdateSubscriptionSourceResponse>
     */
    public SyncInvoker<UpdateSubscriptionSourceRequest, UpdateSubscriptionSourceResponse> updateSubscriptionSourceInvoker(
        UpdateSubscriptionSourceRequest request) {
        return new SyncInvoker<>(request, EgMeta.updateSubscriptionSource, hcClient);
    }

    /**
     * 更新事件订阅目标
     *
     * 更新事件订阅目标定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubscriptionTargetRequest 请求对象
     * @return UpdateSubscriptionTargetResponse
     */
    public UpdateSubscriptionTargetResponse updateSubscriptionTarget(UpdateSubscriptionTargetRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.updateSubscriptionTarget);
    }

    /**
     * 更新事件订阅目标
     *
     * 更新事件订阅目标定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubscriptionTargetRequest 请求对象
     * @return SyncInvoker<UpdateSubscriptionTargetRequest, UpdateSubscriptionTargetResponse>
     */
    public SyncInvoker<UpdateSubscriptionTargetRequest, UpdateSubscriptionTargetResponse> updateSubscriptionTargetInvoker(
        UpdateSubscriptionTargetRequest request) {
        return new SyncInvoker<>(request, EgMeta.updateSubscriptionTarget, hcClient);
    }

    /**
     * 获取API版本列表
     *
     * 获取服务支持的API版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
     * @return ListApiVersionsResponse
     */
    public ListApiVersionsResponse listApiVersions(ListApiVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.listApiVersions);
    }

    /**
     * 获取API版本列表
     *
     * 获取服务支持的API版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
     * @return SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsInvoker(
        ListApiVersionsRequest request) {
        return new SyncInvoker<>(request, EgMeta.listApiVersions, hcClient);
    }

    /**
     * 获取obs桶列表
     *
     * 获取obs桶列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListObsBucketsRequest 请求对象
     * @return ListObsBucketsResponse
     */
    public ListObsBucketsResponse listObsBuckets(ListObsBucketsRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.listObsBuckets);
    }

    /**
     * 获取obs桶列表
     *
     * 获取obs桶列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListObsBucketsRequest 请求对象
     * @return SyncInvoker<ListObsBucketsRequest, ListObsBucketsResponse>
     */
    public SyncInvoker<ListObsBucketsRequest, ListObsBucketsResponse> listObsBucketsInvoker(
        ListObsBucketsRequest request) {
        return new SyncInvoker<>(request, EgMeta.listObsBuckets, hcClient);
    }

}

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
     * 创建自定义事件通道
     *
     * 创建自定义事件通道。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 创建自定义事件通道。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateChannelRequest 请求对象
     * @return AsyncInvoker<CreateChannelRequest, CreateChannelResponse>
     */
    public AsyncInvoker<CreateChannelRequest, CreateChannelResponse> createChannelAsyncInvoker(
        CreateChannelRequest request) {
        return new AsyncInvoker<CreateChannelRequest, CreateChannelResponse>(request, EgMeta.createChannel, hcClient);
    }

    /**
     * 创建自定义事件源
     *
     * 创建用户自定义类型的事件源，只能指定自定义通道，不能指定官方通道。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 创建用户自定义类型的事件源，只能指定自定义通道，不能指定官方通道。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 创建事件订阅。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 创建事件订阅。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 在事件订阅中增加一个事件目标。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 在事件订阅中增加一个事件目标。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 删除指定自定义事件通道。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 删除指定自定义事件通道。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteChannelRequest 请求对象
     * @return AsyncInvoker<DeleteChannelRequest, DeleteChannelResponse>
     */
    public AsyncInvoker<DeleteChannelRequest, DeleteChannelResponse> deleteChannelAsyncInvoker(
        DeleteChannelRequest request) {
        return new AsyncInvoker<DeleteChannelRequest, DeleteChannelResponse>(request, EgMeta.deleteChannel, hcClient);
    }

    /**
     * 删除自定义事件源
     *
     * 删除指定的自定义事件源。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 删除指定的自定义事件源。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 删除事件订阅。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 删除事件订阅。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 删除事件订阅中的事件目标。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 删除事件订阅中的事件目标。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询事件通道列表
     *
     * 查询事件通道列表，包括官方通道和自定义通道。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询事件通道列表，包括官方通道和自定义通道。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListChannelsRequest 请求对象
     * @return AsyncInvoker<ListChannelsRequest, ListChannelsResponse>
     */
    public AsyncInvoker<ListChannelsRequest, ListChannelsResponse> listChannelsAsyncInvoker(
        ListChannelsRequest request) {
        return new AsyncInvoker<ListChannelsRequest, ListChannelsResponse>(request, EgMeta.listChannels, hcClient);
    }

    /**
     * 查询事件源列表
     *
     * 查询事件源列表，支持条件查询，如可以指定事件通道ID来查询某个事件通道下的所有事件源。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询事件源列表，支持条件查询，如可以指定事件通道ID来查询某个事件通道下的所有事件源。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询预置的事件目标分类，获取每个事件目标分类的字段定义。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询预置的事件目标分类，获取每个事件目标分类的字段定义。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询配额
     *
     * 查询当前租户的配额，未特殊配置过的会返回默认配额。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询当前租户的配额，未特殊配置过的会返回默认配额。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListQuotasRequest 请求对象
     * @return AsyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public AsyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasAsyncInvoker(ListQuotasRequest request) {
        return new AsyncInvoker<ListQuotasRequest, ListQuotasResponse>(request, EgMeta.listQuotas, hcClient);
    }

    /**
     * 查询事件订阅列表
     *
     * 查询事件订阅列表，支持指定事件通道。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询事件订阅列表，支持指定事件通道。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 启用/禁用事件订阅
     *
     * 启用/禁用事件订阅。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param OperateSubscriptionRequest 请求对象
     * @return CompletableFuture<OperateSubscriptionResponse>
     */
    public CompletableFuture<OperateSubscriptionResponse> operateSubscriptionAsync(OperateSubscriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, EgMeta.operateSubscription);
    }

    /**
     * 启用/禁用事件订阅
     *
     * 启用/禁用事件订阅。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 发布事件到事件通道。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 发布事件到事件通道。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询事件通道详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询事件通道详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询事件源详情
     *
     * 查询事件源详情信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询事件源详情信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询事件订阅详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询事件订阅详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询事件订阅中事件目标的详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询事件订阅中事件目标的详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 修改自定义事件通道的描述信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 修改自定义事件通道的描述信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateChannelRequest 请求对象
     * @return AsyncInvoker<UpdateChannelRequest, UpdateChannelResponse>
     */
    public AsyncInvoker<UpdateChannelRequest, UpdateChannelResponse> updateChannelAsyncInvoker(
        UpdateChannelRequest request) {
        return new AsyncInvoker<UpdateChannelRequest, UpdateChannelResponse>(request, EgMeta.updateChannel, hcClient);
    }

    /**
     * 更新自定义事件源
     *
     * 修改自定义事件源的描述信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 修改自定义事件源的描述信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 更新事件订阅描述信息、事件源参数或者事件目标参数。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 更新事件订阅描述信息、事件源参数或者事件目标参数。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 更新事件订阅中事件源的参数。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 更新事件订阅中事件源的参数。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 更新事件订阅中事件目标的参数。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 更新事件订阅中事件目标的参数。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateSubscriptionTargetRequest 请求对象
     * @return AsyncInvoker<UpdateSubscriptionTargetRequest, UpdateSubscriptionTargetResponse>
     */
    public AsyncInvoker<UpdateSubscriptionTargetRequest, UpdateSubscriptionTargetResponse> updateSubscriptionTargetAsyncInvoker(
        UpdateSubscriptionTargetRequest request) {
        return new AsyncInvoker<UpdateSubscriptionTargetRequest, UpdateSubscriptionTargetResponse>(request,
            EgMeta.updateSubscriptionTarget, hcClient);
    }

}

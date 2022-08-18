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
     * 创建自定义事件通道
     *
     * 创建自定义事件通道。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 创建自定义事件通道。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateChannelRequest 请求对象
     * @return SyncInvoker<CreateChannelRequest, CreateChannelResponse>
     */
    public SyncInvoker<CreateChannelRequest, CreateChannelResponse> createChannelInvoker(CreateChannelRequest request) {
        return new SyncInvoker<CreateChannelRequest, CreateChannelResponse>(request, EgMeta.createChannel, hcClient);
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
     * @return CreateEventSourceResponse
     */
    public CreateEventSourceResponse createEventSource(CreateEventSourceRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.createEventSource);
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
     * 创建事件订阅。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 创建事件订阅。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 在事件订阅中增加一个事件目标。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 在事件订阅中增加一个事件目标。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 删除指定自定义事件通道。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 删除指定自定义事件通道。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteChannelRequest 请求对象
     * @return SyncInvoker<DeleteChannelRequest, DeleteChannelResponse>
     */
    public SyncInvoker<DeleteChannelRequest, DeleteChannelResponse> deleteChannelInvoker(DeleteChannelRequest request) {
        return new SyncInvoker<DeleteChannelRequest, DeleteChannelResponse>(request, EgMeta.deleteChannel, hcClient);
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 删除事件订阅。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 删除事件订阅。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 删除事件订阅中的事件目标。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 删除事件订阅中的事件目标。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询事件通道列表
     *
     * 查询事件通道列表，包括官方通道和自定义通道。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询事件通道列表，包括官方通道和自定义通道。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListChannelsRequest 请求对象
     * @return SyncInvoker<ListChannelsRequest, ListChannelsResponse>
     */
    public SyncInvoker<ListChannelsRequest, ListChannelsResponse> listChannelsInvoker(ListChannelsRequest request) {
        return new SyncInvoker<ListChannelsRequest, ListChannelsResponse>(request, EgMeta.listChannels, hcClient);
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
     * @return ListEventSourcesResponse
     */
    public ListEventSourcesResponse listEventSources(ListEventSourcesRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.listEventSources);
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
     * 查询预置的事件目标分类，获取每个事件目标分类的字段定义。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询预置的事件目标分类，获取每个事件目标分类的字段定义。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询当前租户的配额，未特殊配置过的会返回默认配额。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询当前租户的配额，未特殊配置过的会返回默认配额。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询事件订阅列表，支持指定事件通道。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询事件订阅列表，支持指定事件通道。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 启用/禁用事件订阅
     *
     * 启用/禁用事件订阅。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param OperateSubscriptionRequest 请求对象
     * @return OperateSubscriptionResponse
     */
    public OperateSubscriptionResponse operateSubscription(OperateSubscriptionRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.operateSubscription);
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
     * 发布事件到事件通道。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 发布事件到事件通道。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询事件通道详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询事件通道详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询事件源详情
     *
     * 查询事件源详情信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询事件源详情信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询事件订阅详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询事件订阅详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询事件订阅中事件目标的详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询事件订阅中事件目标的详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 修改自定义事件通道的描述信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 修改自定义事件通道的描述信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateChannelRequest 请求对象
     * @return SyncInvoker<UpdateChannelRequest, UpdateChannelResponse>
     */
    public SyncInvoker<UpdateChannelRequest, UpdateChannelResponse> updateChannelInvoker(UpdateChannelRequest request) {
        return new SyncInvoker<UpdateChannelRequest, UpdateChannelResponse>(request, EgMeta.updateChannel, hcClient);
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
     * @return UpdateEventSourceResponse
     */
    public UpdateEventSourceResponse updateEventSource(UpdateEventSourceRequest request) {
        return hcClient.syncInvokeHttp(request, EgMeta.updateEventSource);
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
     * 更新事件订阅描述信息、事件源参数或者事件目标参数。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 更新事件订阅描述信息、事件源参数或者事件目标参数。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 更新事件订阅中事件源的参数。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 更新事件订阅中事件源的参数。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 更新事件订阅中事件目标的参数。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 更新事件订阅中事件目标的参数。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateSubscriptionTargetRequest 请求对象
     * @return SyncInvoker<UpdateSubscriptionTargetRequest, UpdateSubscriptionTargetResponse>
     */
    public SyncInvoker<UpdateSubscriptionTargetRequest, UpdateSubscriptionTargetResponse> updateSubscriptionTargetInvoker(
        UpdateSubscriptionTargetRequest request) {
        return new SyncInvoker<UpdateSubscriptionTargetRequest, UpdateSubscriptionTargetResponse>(request,
            EgMeta.updateSubscriptionTarget, hcClient);
    }

}

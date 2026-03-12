package com.huaweicloud.sdk.modelarts.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.modelarts.v1.model.AcceptScheduledEventRequest;
import com.huaweicloud.sdk.modelarts.v1.model.AcceptScheduledEventResponse;
import com.huaweicloud.sdk.modelarts.v1.model.ListScheduledEventsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListScheduledEventsResponse;

import java.util.concurrent.CompletableFuture;

public class ModelArtsAsyncClient {

    protected HcClient hcClient;

    public ModelArtsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ModelArtsAsyncClient> newBuilder() {
        ClientBuilder<ModelArtsAsyncClient> clientBuilder = new ClientBuilder<>(ModelArtsAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 计划事件授权
     *
     * 计划事件授权接口用于为指定的计划事件分配或调整权限。该接口适用于以下场景：当创建新的计划事件、调整现有计划事件的权限设置或变更权限分配时，用户可通过此接口为指定的计划事件授予或修改权限。使用该接口的前提条件是计划事件已存在且用户具有管理员权限。授权操作完成后，计划事件的权限设置将被更新，相关变更将被记录以便审计。若计划事件不存在、用户无权限操作或授权信息格式不正确，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AcceptScheduledEventRequest 请求对象
     * @return CompletableFuture<AcceptScheduledEventResponse>
     */
    public CompletableFuture<AcceptScheduledEventResponse> acceptScheduledEventAsync(
        AcceptScheduledEventRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.acceptScheduledEvent);
    }

    /**
     * 计划事件授权
     *
     * 计划事件授权接口用于为指定的计划事件分配或调整权限。该接口适用于以下场景：当创建新的计划事件、调整现有计划事件的权限设置或变更权限分配时，用户可通过此接口为指定的计划事件授予或修改权限。使用该接口的前提条件是计划事件已存在且用户具有管理员权限。授权操作完成后，计划事件的权限设置将被更新，相关变更将被记录以便审计。若计划事件不存在、用户无权限操作或授权信息格式不正确，接口将返回相应的错误信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AcceptScheduledEventRequest 请求对象
     * @return AsyncInvoker<AcceptScheduledEventRequest, AcceptScheduledEventResponse>
     */
    public AsyncInvoker<AcceptScheduledEventRequest, AcceptScheduledEventResponse> acceptScheduledEventAsyncInvoker(
        AcceptScheduledEventRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.acceptScheduledEvent, hcClient);
    }

    /**
     * 查询计划事件列表
     *
     * 查询计划事件列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledEventsRequest 请求对象
     * @return CompletableFuture<ListScheduledEventsResponse>
     */
    public CompletableFuture<ListScheduledEventsResponse> listScheduledEventsAsync(ListScheduledEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModelArtsMeta.listScheduledEvents);
    }

    /**
     * 查询计划事件列表
     *
     * 查询计划事件列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledEventsRequest 请求对象
     * @return AsyncInvoker<ListScheduledEventsRequest, ListScheduledEventsResponse>
     */
    public AsyncInvoker<ListScheduledEventsRequest, ListScheduledEventsResponse> listScheduledEventsAsyncInvoker(
        ListScheduledEventsRequest request) {
        return new AsyncInvoker<>(request, ModelArtsMeta.listScheduledEvents, hcClient);
    }

}

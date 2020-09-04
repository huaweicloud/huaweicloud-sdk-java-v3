package com.huaweicloud.sdk.dms.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.dms.v2.model.*;

public class DmsAsyncClient {
    protected HcClient hcClient;

    public DmsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DmsAsyncClient> newBuilder() {
        return new ClientBuilder<>(DmsAsyncClient::new);
    }


    public CompletableFuture<BatchCreateOrDeleteQueueTagResponse> batchCreateOrDeleteQueueTagAsync(BatchCreateOrDeleteQueueTagRequest request) {
        return hcClient.asyncInvokeHttp(request, DmsMeta.batchCreateOrDeleteQueueTag);
    }

    public CompletableFuture<ConfirmConsumptionMessagesResponse> confirmConsumptionMessagesAsync(ConfirmConsumptionMessagesRequest request) {
        return hcClient.asyncInvokeHttp(request, DmsMeta.confirmConsumptionMessages);
    }

    public CompletableFuture<ConfirmDeadLettersMessagesResponse> confirmDeadLettersMessagesAsync(ConfirmDeadLettersMessagesRequest request) {
        return hcClient.asyncInvokeHttp(request, DmsMeta.confirmDeadLettersMessages);
    }

    public CompletableFuture<ConsumeDeadlettersMessageResponse> consumeDeadlettersMessageAsync(ConsumeDeadlettersMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, DmsMeta.consumeDeadlettersMessage);
    }

    public CompletableFuture<ConsumeMessagesResponse> consumeMessagesAsync(ConsumeMessagesRequest request) {
        return hcClient.asyncInvokeHttp(request, DmsMeta.consumeMessages);
    }

    public CompletableFuture<CreateConsumerGroupResponse> createConsumerGroupAsync(CreateConsumerGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, DmsMeta.createConsumerGroup);
    }

    public CompletableFuture<CreateQueueResponse> createQueueAsync(CreateQueueRequest request) {
        return hcClient.asyncInvokeHttp(request, DmsMeta.createQueue);
    }

    public CompletableFuture<DeleteQueueResponse> deleteQueueAsync(DeleteQueueRequest request) {
        return hcClient.asyncInvokeHttp(request, DmsMeta.deleteQueue);
    }

    public CompletableFuture<DeleteSpecifiedConsumerGroupResponse> deleteSpecifiedConsumerGroupAsync(DeleteSpecifiedConsumerGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, DmsMeta.deleteSpecifiedConsumerGroup);
    }

    public CompletableFuture<ListConsumerGroupsResponse> listConsumerGroupsAsync(ListConsumerGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, DmsMeta.listConsumerGroups);
    }

    public CompletableFuture<ListQueuesResponse> listQueuesAsync(ListQueuesRequest request) {
        return hcClient.asyncInvokeHttp(request, DmsMeta.listQueues);
    }

    public CompletableFuture<SendMessagesResponse> sendMessagesAsync(SendMessagesRequest request) {
        return hcClient.asyncInvokeHttp(request, DmsMeta.sendMessages);
    }

    public CompletableFuture<ShowProjectTagsResponse> showProjectTagsAsync(ShowProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DmsMeta.showProjectTags);
    }

    public CompletableFuture<ShowQueueResponse> showQueueAsync(ShowQueueRequest request) {
        return hcClient.asyncInvokeHttp(request, DmsMeta.showQueue);
    }

    public CompletableFuture<ShowQueueTagsResponse> showQueueTagsAsync(ShowQueueTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DmsMeta.showQueueTags);
    }

    public CompletableFuture<ShowQuotasResponse> showQuotasAsync(ShowQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, DmsMeta.showQuotas);
    }

}
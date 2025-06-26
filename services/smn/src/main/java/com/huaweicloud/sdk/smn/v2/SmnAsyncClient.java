package com.huaweicloud.sdk.smn.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.smn.v2.model.AddSubscriptionFromSubscriptionUserRequest;
import com.huaweicloud.sdk.smn.v2.model.AddSubscriptionFromSubscriptionUserResponse;
import com.huaweicloud.sdk.smn.v2.model.AddSubscriptionRequest;
import com.huaweicloud.sdk.smn.v2.model.AddSubscriptionResponse;
import com.huaweicloud.sdk.smn.v2.model.BatchCreateOrDeleteResourceTagsRequest;
import com.huaweicloud.sdk.smn.v2.model.BatchCreateOrDeleteResourceTagsResponse;
import com.huaweicloud.sdk.smn.v2.model.BatchCreateSubscriptionsFilterPolicesRequest;
import com.huaweicloud.sdk.smn.v2.model.BatchCreateSubscriptionsFilterPolicesResponse;
import com.huaweicloud.sdk.smn.v2.model.BatchDeleteSubscriptionsFilterPolicesRequest;
import com.huaweicloud.sdk.smn.v2.model.BatchDeleteSubscriptionsFilterPolicesResponse;
import com.huaweicloud.sdk.smn.v2.model.BatchUpdateSubscriptionsFilterPolicesRequest;
import com.huaweicloud.sdk.smn.v2.model.BatchUpdateSubscriptionsFilterPolicesResponse;
import com.huaweicloud.sdk.smn.v2.model.CancelSubscriptionRequest;
import com.huaweicloud.sdk.smn.v2.model.CancelSubscriptionResponse;
import com.huaweicloud.sdk.smn.v2.model.CreateApplicationEndpointRequest;
import com.huaweicloud.sdk.smn.v2.model.CreateApplicationEndpointResponse;
import com.huaweicloud.sdk.smn.v2.model.CreateApplicationRequest;
import com.huaweicloud.sdk.smn.v2.model.CreateApplicationResponse;
import com.huaweicloud.sdk.smn.v2.model.CreateLogtankRequest;
import com.huaweicloud.sdk.smn.v2.model.CreateLogtankResponse;
import com.huaweicloud.sdk.smn.v2.model.CreateMessageTemplateRequest;
import com.huaweicloud.sdk.smn.v2.model.CreateMessageTemplateResponse;
import com.huaweicloud.sdk.smn.v2.model.CreateNotifyPolicyRequest;
import com.huaweicloud.sdk.smn.v2.model.CreateNotifyPolicyResponse;
import com.huaweicloud.sdk.smn.v2.model.CreateResourceTagRequest;
import com.huaweicloud.sdk.smn.v2.model.CreateResourceTagResponse;
import com.huaweicloud.sdk.smn.v2.model.CreateTopicRequest;
import com.huaweicloud.sdk.smn.v2.model.CreateTopicResponse;
import com.huaweicloud.sdk.smn.v2.model.DeleteApplicationEndpointRequest;
import com.huaweicloud.sdk.smn.v2.model.DeleteApplicationEndpointResponse;
import com.huaweicloud.sdk.smn.v2.model.DeleteApplicationRequest;
import com.huaweicloud.sdk.smn.v2.model.DeleteApplicationResponse;
import com.huaweicloud.sdk.smn.v2.model.DeleteLogtankRequest;
import com.huaweicloud.sdk.smn.v2.model.DeleteLogtankResponse;
import com.huaweicloud.sdk.smn.v2.model.DeleteMessageTemplateRequest;
import com.huaweicloud.sdk.smn.v2.model.DeleteMessageTemplateResponse;
import com.huaweicloud.sdk.smn.v2.model.DeleteNotifyPolicyRequest;
import com.huaweicloud.sdk.smn.v2.model.DeleteNotifyPolicyResponse;
import com.huaweicloud.sdk.smn.v2.model.DeleteResourceTagRequest;
import com.huaweicloud.sdk.smn.v2.model.DeleteResourceTagResponse;
import com.huaweicloud.sdk.smn.v2.model.DeleteTopicAttributeByNameRequest;
import com.huaweicloud.sdk.smn.v2.model.DeleteTopicAttributeByNameResponse;
import com.huaweicloud.sdk.smn.v2.model.DeleteTopicAttributesRequest;
import com.huaweicloud.sdk.smn.v2.model.DeleteTopicAttributesResponse;
import com.huaweicloud.sdk.smn.v2.model.DeleteTopicRequest;
import com.huaweicloud.sdk.smn.v2.model.DeleteTopicResponse;
import com.huaweicloud.sdk.smn.v2.model.ListApplicationAttributesRequest;
import com.huaweicloud.sdk.smn.v2.model.ListApplicationAttributesResponse;
import com.huaweicloud.sdk.smn.v2.model.ListApplicationEndpointAttributesRequest;
import com.huaweicloud.sdk.smn.v2.model.ListApplicationEndpointAttributesResponse;
import com.huaweicloud.sdk.smn.v2.model.ListApplicationEndpointsRequest;
import com.huaweicloud.sdk.smn.v2.model.ListApplicationEndpointsResponse;
import com.huaweicloud.sdk.smn.v2.model.ListApplicationsRequest;
import com.huaweicloud.sdk.smn.v2.model.ListApplicationsResponse;
import com.huaweicloud.sdk.smn.v2.model.ListLogtankRequest;
import com.huaweicloud.sdk.smn.v2.model.ListLogtankResponse;
import com.huaweicloud.sdk.smn.v2.model.ListMessageTemplateDetailsRequest;
import com.huaweicloud.sdk.smn.v2.model.ListMessageTemplateDetailsResponse;
import com.huaweicloud.sdk.smn.v2.model.ListMessageTemplatesRequest;
import com.huaweicloud.sdk.smn.v2.model.ListMessageTemplatesResponse;
import com.huaweicloud.sdk.smn.v2.model.ListProjectTagsRequest;
import com.huaweicloud.sdk.smn.v2.model.ListProjectTagsResponse;
import com.huaweicloud.sdk.smn.v2.model.ListResourceInstancesRequest;
import com.huaweicloud.sdk.smn.v2.model.ListResourceInstancesResponse;
import com.huaweicloud.sdk.smn.v2.model.ListResourceTagsRequest;
import com.huaweicloud.sdk.smn.v2.model.ListResourceTagsResponse;
import com.huaweicloud.sdk.smn.v2.model.ListSubscriptionsByTopicRequest;
import com.huaweicloud.sdk.smn.v2.model.ListSubscriptionsByTopicResponse;
import com.huaweicloud.sdk.smn.v2.model.ListSubscriptionsRequest;
import com.huaweicloud.sdk.smn.v2.model.ListSubscriptionsResponse;
import com.huaweicloud.sdk.smn.v2.model.ListTopicAttributesRequest;
import com.huaweicloud.sdk.smn.v2.model.ListTopicAttributesResponse;
import com.huaweicloud.sdk.smn.v2.model.ListTopicDetailsRequest;
import com.huaweicloud.sdk.smn.v2.model.ListTopicDetailsResponse;
import com.huaweicloud.sdk.smn.v2.model.ListTopicMessageStatisticsRequest;
import com.huaweicloud.sdk.smn.v2.model.ListTopicMessageStatisticsResponse;
import com.huaweicloud.sdk.smn.v2.model.ListTopicsRequest;
import com.huaweicloud.sdk.smn.v2.model.ListTopicsResponse;
import com.huaweicloud.sdk.smn.v2.model.ListVersionRequest;
import com.huaweicloud.sdk.smn.v2.model.ListVersionResponse;
import com.huaweicloud.sdk.smn.v2.model.ListVersionsRequest;
import com.huaweicloud.sdk.smn.v2.model.ListVersionsResponse;
import com.huaweicloud.sdk.smn.v2.model.PublishAppMessageRequest;
import com.huaweicloud.sdk.smn.v2.model.PublishAppMessageResponse;
import com.huaweicloud.sdk.smn.v2.model.PublishHttpDetectRequest;
import com.huaweicloud.sdk.smn.v2.model.PublishHttpDetectResponse;
import com.huaweicloud.sdk.smn.v2.model.PublishMessageRequest;
import com.huaweicloud.sdk.smn.v2.model.PublishMessageResponse;
import com.huaweicloud.sdk.smn.v2.model.ShowHttpDetectResultRequest;
import com.huaweicloud.sdk.smn.v2.model.ShowHttpDetectResultResponse;
import com.huaweicloud.sdk.smn.v2.model.ShowNotifyPolicyRequest;
import com.huaweicloud.sdk.smn.v2.model.ShowNotifyPolicyResponse;
import com.huaweicloud.sdk.smn.v2.model.UpdateApplicationEndpointRequest;
import com.huaweicloud.sdk.smn.v2.model.UpdateApplicationEndpointResponse;
import com.huaweicloud.sdk.smn.v2.model.UpdateApplicationRequest;
import com.huaweicloud.sdk.smn.v2.model.UpdateApplicationResponse;
import com.huaweicloud.sdk.smn.v2.model.UpdateLogtankRequest;
import com.huaweicloud.sdk.smn.v2.model.UpdateLogtankResponse;
import com.huaweicloud.sdk.smn.v2.model.UpdateMessageTemplateRequest;
import com.huaweicloud.sdk.smn.v2.model.UpdateMessageTemplateResponse;
import com.huaweicloud.sdk.smn.v2.model.UpdateNotifyPolicyRequest;
import com.huaweicloud.sdk.smn.v2.model.UpdateNotifyPolicyResponse;
import com.huaweicloud.sdk.smn.v2.model.UpdateSubscriptionRequest;
import com.huaweicloud.sdk.smn.v2.model.UpdateSubscriptionResponse;
import com.huaweicloud.sdk.smn.v2.model.UpdateTopicAttributeRequest;
import com.huaweicloud.sdk.smn.v2.model.UpdateTopicAttributeResponse;
import com.huaweicloud.sdk.smn.v2.model.UpdateTopicRequest;
import com.huaweicloud.sdk.smn.v2.model.UpdateTopicResponse;

import java.util.concurrent.CompletableFuture;

public class SmnAsyncClient {

    protected HcClient hcClient;

    public SmnAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SmnAsyncClient> newBuilder() {
        ClientBuilder<SmnAsyncClient> clientBuilder = new ClientBuilder<>(SmnAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 订阅
     *
     * 为指定Topic添加一个订阅者，如果订阅者的状态为未确认，则向订阅者发送一个确认的消息。待订阅者进行ConfirmSubscription确认后，该订阅者才能收到Topic发布的消息。单Topic默认可添加10000个订阅者，高并发场景下，可能会出现订阅者数量超过10000仍添加成功的情况，此为正常现象。接口是幂等的，如果添加已存在的订阅者，则返回成功，且status code为200，否则status code为201。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSubscriptionRequest 请求对象
     * @return CompletableFuture<AddSubscriptionResponse>
     */
    public CompletableFuture<AddSubscriptionResponse> addSubscriptionAsync(AddSubscriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.addSubscription);
    }

    /**
     * 订阅
     *
     * 为指定Topic添加一个订阅者，如果订阅者的状态为未确认，则向订阅者发送一个确认的消息。待订阅者进行ConfirmSubscription确认后，该订阅者才能收到Topic发布的消息。单Topic默认可添加10000个订阅者，高并发场景下，可能会出现订阅者数量超过10000仍添加成功的情况，此为正常现象。接口是幂等的，如果添加已存在的订阅者，则返回成功，且status code为200，否则status code为201。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSubscriptionRequest 请求对象
     * @return AsyncInvoker<AddSubscriptionRequest, AddSubscriptionResponse>
     */
    public AsyncInvoker<AddSubscriptionRequest, AddSubscriptionResponse> addSubscriptionAsyncInvoker(
        AddSubscriptionRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.addSubscription, hcClient);
    }

    /**
     * 导入订阅
     *
     * 为指定的Topic添加订阅者，订阅者信息来源为订阅用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSubscriptionFromSubscriptionUserRequest 请求对象
     * @return CompletableFuture<AddSubscriptionFromSubscriptionUserResponse>
     */
    public CompletableFuture<AddSubscriptionFromSubscriptionUserResponse> addSubscriptionFromSubscriptionUserAsync(
        AddSubscriptionFromSubscriptionUserRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.addSubscriptionFromSubscriptionUser);
    }

    /**
     * 导入订阅
     *
     * 为指定的Topic添加订阅者，订阅者信息来源为订阅用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSubscriptionFromSubscriptionUserRequest 请求对象
     * @return AsyncInvoker<AddSubscriptionFromSubscriptionUserRequest, AddSubscriptionFromSubscriptionUserResponse>
     */
    public AsyncInvoker<AddSubscriptionFromSubscriptionUserRequest, AddSubscriptionFromSubscriptionUserResponse> addSubscriptionFromSubscriptionUserAsyncInvoker(
        AddSubscriptionFromSubscriptionUserRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.addSubscriptionFromSubscriptionUser, hcClient);
    }

    /**
     * 批量添加删除资源标签
     *
     * 为指定实例批量添加或删除标签。一个资源上最多有10个标签。
     * 此接口为幂等接口：创建时如果请求体中存在重复key则报错。
     * 创建时，不允许重复key，如果数据库存在就覆盖。
     * 删除时，如果删除的标签不存在，默认处理成功，删除时不对标签字符集范围做校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateOrDeleteResourceTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateOrDeleteResourceTagsResponse>
     */
    public CompletableFuture<BatchCreateOrDeleteResourceTagsResponse> batchCreateOrDeleteResourceTagsAsync(
        BatchCreateOrDeleteResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.batchCreateOrDeleteResourceTags);
    }

    /**
     * 批量添加删除资源标签
     *
     * 为指定实例批量添加或删除标签。一个资源上最多有10个标签。
     * 此接口为幂等接口：创建时如果请求体中存在重复key则报错。
     * 创建时，不允许重复key，如果数据库存在就覆盖。
     * 删除时，如果删除的标签不存在，默认处理成功，删除时不对标签字符集范围做校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateOrDeleteResourceTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateOrDeleteResourceTagsRequest, BatchCreateOrDeleteResourceTagsResponse>
     */
    public AsyncInvoker<BatchCreateOrDeleteResourceTagsRequest, BatchCreateOrDeleteResourceTagsResponse> batchCreateOrDeleteResourceTagsAsyncInvoker(
        BatchCreateOrDeleteResourceTagsRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.batchCreateOrDeleteResourceTags, hcClient);
    }

    /**
     * 批量创建订阅过滤策略
     *
     * 创建订阅者的消息过滤策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateSubscriptionsFilterPolicesRequest 请求对象
     * @return CompletableFuture<BatchCreateSubscriptionsFilterPolicesResponse>
     */
    public CompletableFuture<BatchCreateSubscriptionsFilterPolicesResponse> batchCreateSubscriptionsFilterPolicesAsync(
        BatchCreateSubscriptionsFilterPolicesRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.batchCreateSubscriptionsFilterPolices);
    }

    /**
     * 批量创建订阅过滤策略
     *
     * 创建订阅者的消息过滤策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateSubscriptionsFilterPolicesRequest 请求对象
     * @return AsyncInvoker<BatchCreateSubscriptionsFilterPolicesRequest, BatchCreateSubscriptionsFilterPolicesResponse>
     */
    public AsyncInvoker<BatchCreateSubscriptionsFilterPolicesRequest, BatchCreateSubscriptionsFilterPolicesResponse> batchCreateSubscriptionsFilterPolicesAsyncInvoker(
        BatchCreateSubscriptionsFilterPolicesRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.batchCreateSubscriptionsFilterPolices, hcClient);
    }

    /**
     * 批量删除订阅过滤策略
     *
     * 删除订阅者的消息过滤策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSubscriptionsFilterPolicesRequest 请求对象
     * @return CompletableFuture<BatchDeleteSubscriptionsFilterPolicesResponse>
     */
    public CompletableFuture<BatchDeleteSubscriptionsFilterPolicesResponse> batchDeleteSubscriptionsFilterPolicesAsync(
        BatchDeleteSubscriptionsFilterPolicesRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.batchDeleteSubscriptionsFilterPolices);
    }

    /**
     * 批量删除订阅过滤策略
     *
     * 删除订阅者的消息过滤策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSubscriptionsFilterPolicesRequest 请求对象
     * @return AsyncInvoker<BatchDeleteSubscriptionsFilterPolicesRequest, BatchDeleteSubscriptionsFilterPolicesResponse>
     */
    public AsyncInvoker<BatchDeleteSubscriptionsFilterPolicesRequest, BatchDeleteSubscriptionsFilterPolicesResponse> batchDeleteSubscriptionsFilterPolicesAsyncInvoker(
        BatchDeleteSubscriptionsFilterPolicesRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.batchDeleteSubscriptionsFilterPolices, hcClient);
    }

    /**
     * 批量更新订阅过滤策略
     *
     * 更新订阅者的消息过滤策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateSubscriptionsFilterPolicesRequest 请求对象
     * @return CompletableFuture<BatchUpdateSubscriptionsFilterPolicesResponse>
     */
    public CompletableFuture<BatchUpdateSubscriptionsFilterPolicesResponse> batchUpdateSubscriptionsFilterPolicesAsync(
        BatchUpdateSubscriptionsFilterPolicesRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.batchUpdateSubscriptionsFilterPolices);
    }

    /**
     * 批量更新订阅过滤策略
     *
     * 更新订阅者的消息过滤策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateSubscriptionsFilterPolicesRequest 请求对象
     * @return AsyncInvoker<BatchUpdateSubscriptionsFilterPolicesRequest, BatchUpdateSubscriptionsFilterPolicesResponse>
     */
    public AsyncInvoker<BatchUpdateSubscriptionsFilterPolicesRequest, BatchUpdateSubscriptionsFilterPolicesResponse> batchUpdateSubscriptionsFilterPolicesAsyncInvoker(
        BatchUpdateSubscriptionsFilterPolicesRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.batchUpdateSubscriptionsFilterPolices, hcClient);
    }

    /**
     * 取消订阅
     *
     * 删除指定的订阅者。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelSubscriptionRequest 请求对象
     * @return CompletableFuture<CancelSubscriptionResponse>
     */
    public CompletableFuture<CancelSubscriptionResponse> cancelSubscriptionAsync(CancelSubscriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.cancelSubscription);
    }

    /**
     * 取消订阅
     *
     * 删除指定的订阅者。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelSubscriptionRequest 请求对象
     * @return AsyncInvoker<CancelSubscriptionRequest, CancelSubscriptionResponse>
     */
    public AsyncInvoker<CancelSubscriptionRequest, CancelSubscriptionResponse> cancelSubscriptionAsyncInvoker(
        CancelSubscriptionRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.cancelSubscription, hcClient);
    }

    /**
     * 绑定云日志
     *
     * 为指定Topic绑定一个云日志，用于记录主题消息发送状态等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLogtankRequest 请求对象
     * @return CompletableFuture<CreateLogtankResponse>
     */
    public CompletableFuture<CreateLogtankResponse> createLogtankAsync(CreateLogtankRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.createLogtank);
    }

    /**
     * 绑定云日志
     *
     * 为指定Topic绑定一个云日志，用于记录主题消息发送状态等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLogtankRequest 请求对象
     * @return AsyncInvoker<CreateLogtankRequest, CreateLogtankResponse>
     */
    public AsyncInvoker<CreateLogtankRequest, CreateLogtankResponse> createLogtankAsyncInvoker(
        CreateLogtankRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.createLogtank, hcClient);
    }

    /**
     * 创建消息模板
     *
     * 创建一个模板，用户可以按照模板去发送消息，这样可以减少请求的数据量。
     * 单用户默认可创建100个消息模板，高并发场景下，可能会出现消息模板数量超过100仍创建成功的情况，此为正常现象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMessageTemplateRequest 请求对象
     * @return CompletableFuture<CreateMessageTemplateResponse>
     */
    public CompletableFuture<CreateMessageTemplateResponse> createMessageTemplateAsync(
        CreateMessageTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.createMessageTemplate);
    }

    /**
     * 创建消息模板
     *
     * 创建一个模板，用户可以按照模板去发送消息，这样可以减少请求的数据量。
     * 单用户默认可创建100个消息模板，高并发场景下，可能会出现消息模板数量超过100仍创建成功的情况，此为正常现象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMessageTemplateRequest 请求对象
     * @return AsyncInvoker<CreateMessageTemplateRequest, CreateMessageTemplateResponse>
     */
    public AsyncInvoker<CreateMessageTemplateRequest, CreateMessageTemplateResponse> createMessageTemplateAsyncInvoker(
        CreateMessageTemplateRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.createMessageTemplate, hcClient);
    }

    /**
     * 创建通知策略
     *
     * 创建通知策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNotifyPolicyRequest 请求对象
     * @return CompletableFuture<CreateNotifyPolicyResponse>
     */
    public CompletableFuture<CreateNotifyPolicyResponse> createNotifyPolicyAsync(CreateNotifyPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.createNotifyPolicy);
    }

    /**
     * 创建通知策略
     *
     * 创建通知策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNotifyPolicyRequest 请求对象
     * @return AsyncInvoker<CreateNotifyPolicyRequest, CreateNotifyPolicyResponse>
     */
    public AsyncInvoker<CreateNotifyPolicyRequest, CreateNotifyPolicyResponse> createNotifyPolicyAsyncInvoker(
        CreateNotifyPolicyRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.createNotifyPolicy, hcClient);
    }

    /**
     * 添加资源标签
     *
     * 一个资源上最多有10个标签。此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceTagRequest 请求对象
     * @return CompletableFuture<CreateResourceTagResponse>
     */
    public CompletableFuture<CreateResourceTagResponse> createResourceTagAsync(CreateResourceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.createResourceTag);
    }

    /**
     * 添加资源标签
     *
     * 一个资源上最多有10个标签。此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceTagRequest 请求对象
     * @return AsyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse>
     */
    public AsyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse> createResourceTagAsyncInvoker(
        CreateResourceTagRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.createResourceTag, hcClient);
    }

    /**
     * 创建主题
     *
     * 创建Topic，单用户默认配额为3000。高并发场景下，可能会出现Topic数量超过3000仍创建成功的情况，此为正常现象。
     * 接口是幂等的，接口调用返回成功时，若已存在同名的Topic，返回的status code为200，否则返回的status code为201
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTopicRequest 请求对象
     * @return CompletableFuture<CreateTopicResponse>
     */
    public CompletableFuture<CreateTopicResponse> createTopicAsync(CreateTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.createTopic);
    }

    /**
     * 创建主题
     *
     * 创建Topic，单用户默认配额为3000。高并发场景下，可能会出现Topic数量超过3000仍创建成功的情况，此为正常现象。
     * 接口是幂等的，接口调用返回成功时，若已存在同名的Topic，返回的status code为200，否则返回的status code为201
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTopicRequest 请求对象
     * @return AsyncInvoker<CreateTopicRequest, CreateTopicResponse>
     */
    public AsyncInvoker<CreateTopicRequest, CreateTopicResponse> createTopicAsyncInvoker(CreateTopicRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.createTopic, hcClient);
    }

    /**
     * 解绑云日志
     *
     * 解绑指定Topic绑定的云日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogtankRequest 请求对象
     * @return CompletableFuture<DeleteLogtankResponse>
     */
    public CompletableFuture<DeleteLogtankResponse> deleteLogtankAsync(DeleteLogtankRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.deleteLogtank);
    }

    /**
     * 解绑云日志
     *
     * 解绑指定Topic绑定的云日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogtankRequest 请求对象
     * @return AsyncInvoker<DeleteLogtankRequest, DeleteLogtankResponse>
     */
    public AsyncInvoker<DeleteLogtankRequest, DeleteLogtankResponse> deleteLogtankAsyncInvoker(
        DeleteLogtankRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.deleteLogtank, hcClient);
    }

    /**
     * 删除消息模板
     *
     * 删除消息模板。删除模板之前的消息请求都可以使用该模板发送，删除之后无法再使用该模板发送消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMessageTemplateRequest 请求对象
     * @return CompletableFuture<DeleteMessageTemplateResponse>
     */
    public CompletableFuture<DeleteMessageTemplateResponse> deleteMessageTemplateAsync(
        DeleteMessageTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.deleteMessageTemplate);
    }

    /**
     * 删除消息模板
     *
     * 删除消息模板。删除模板之前的消息请求都可以使用该模板发送，删除之后无法再使用该模板发送消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMessageTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteMessageTemplateRequest, DeleteMessageTemplateResponse>
     */
    public AsyncInvoker<DeleteMessageTemplateRequest, DeleteMessageTemplateResponse> deleteMessageTemplateAsyncInvoker(
        DeleteMessageTemplateRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.deleteMessageTemplate, hcClient);
    }

    /**
     * 删除通知策略
     *
     * 删除通知策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNotifyPolicyRequest 请求对象
     * @return CompletableFuture<DeleteNotifyPolicyResponse>
     */
    public CompletableFuture<DeleteNotifyPolicyResponse> deleteNotifyPolicyAsync(DeleteNotifyPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.deleteNotifyPolicy);
    }

    /**
     * 删除通知策略
     *
     * 删除通知策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNotifyPolicyRequest 请求对象
     * @return AsyncInvoker<DeleteNotifyPolicyRequest, DeleteNotifyPolicyResponse>
     */
    public AsyncInvoker<DeleteNotifyPolicyRequest, DeleteNotifyPolicyResponse> deleteNotifyPolicyAsyncInvoker(
        DeleteNotifyPolicyRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.deleteNotifyPolicy, hcClient);
    }

    /**
     * 删除资源标签
     *
     * 幂等接口：删除时，不对标签做校验。删除的key不存在报404，key不能为空或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceTagRequest 请求对象
     * @return CompletableFuture<DeleteResourceTagResponse>
     */
    public CompletableFuture<DeleteResourceTagResponse> deleteResourceTagAsync(DeleteResourceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.deleteResourceTag);
    }

    /**
     * 删除资源标签
     *
     * 幂等接口：删除时，不对标签做校验。删除的key不存在报404，key不能为空或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceTagRequest 请求对象
     * @return AsyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse>
     */
    public AsyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse> deleteResourceTagAsyncInvoker(
        DeleteResourceTagRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.deleteResourceTag, hcClient);
    }

    /**
     * 删除主题
     *
     * 删除主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTopicRequest 请求对象
     * @return CompletableFuture<DeleteTopicResponse>
     */
    public CompletableFuture<DeleteTopicResponse> deleteTopicAsync(DeleteTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.deleteTopic);
    }

    /**
     * 删除主题
     *
     * 删除主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTopicRequest 请求对象
     * @return AsyncInvoker<DeleteTopicRequest, DeleteTopicResponse>
     */
    public AsyncInvoker<DeleteTopicRequest, DeleteTopicResponse> deleteTopicAsyncInvoker(DeleteTopicRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.deleteTopic, hcClient);
    }

    /**
     * 删除指定名称的主题策略
     *
     * 删除指定名称的主题策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTopicAttributeByNameRequest 请求对象
     * @return CompletableFuture<DeleteTopicAttributeByNameResponse>
     */
    public CompletableFuture<DeleteTopicAttributeByNameResponse> deleteTopicAttributeByNameAsync(
        DeleteTopicAttributeByNameRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.deleteTopicAttributeByName);
    }

    /**
     * 删除指定名称的主题策略
     *
     * 删除指定名称的主题策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTopicAttributeByNameRequest 请求对象
     * @return AsyncInvoker<DeleteTopicAttributeByNameRequest, DeleteTopicAttributeByNameResponse>
     */
    public AsyncInvoker<DeleteTopicAttributeByNameRequest, DeleteTopicAttributeByNameResponse> deleteTopicAttributeByNameAsyncInvoker(
        DeleteTopicAttributeByNameRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.deleteTopicAttributeByName, hcClient);
    }

    /**
     * 删除所有主题策略
     *
     * 删除所有主题策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTopicAttributesRequest 请求对象
     * @return CompletableFuture<DeleteTopicAttributesResponse>
     */
    public CompletableFuture<DeleteTopicAttributesResponse> deleteTopicAttributesAsync(
        DeleteTopicAttributesRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.deleteTopicAttributes);
    }

    /**
     * 删除所有主题策略
     *
     * 删除所有主题策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTopicAttributesRequest 请求对象
     * @return AsyncInvoker<DeleteTopicAttributesRequest, DeleteTopicAttributesResponse>
     */
    public AsyncInvoker<DeleteTopicAttributesRequest, DeleteTopicAttributesResponse> deleteTopicAttributesAsyncInvoker(
        DeleteTopicAttributesRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.deleteTopicAttributes, hcClient);
    }

    /**
     * 查询云日志
     *
     * 查询指定Topic绑定的云日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogtankRequest 请求对象
     * @return CompletableFuture<ListLogtankResponse>
     */
    public CompletableFuture<ListLogtankResponse> listLogtankAsync(ListLogtankRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listLogtank);
    }

    /**
     * 查询云日志
     *
     * 查询指定Topic绑定的云日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogtankRequest 请求对象
     * @return AsyncInvoker<ListLogtankRequest, ListLogtankResponse>
     */
    public AsyncInvoker<ListLogtankRequest, ListLogtankResponse> listLogtankAsyncInvoker(ListLogtankRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.listLogtank, hcClient);
    }

    /**
     * 查询消息模板详情
     *
     * 查询模板详情，包括模板内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessageTemplateDetailsRequest 请求对象
     * @return CompletableFuture<ListMessageTemplateDetailsResponse>
     */
    public CompletableFuture<ListMessageTemplateDetailsResponse> listMessageTemplateDetailsAsync(
        ListMessageTemplateDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listMessageTemplateDetails);
    }

    /**
     * 查询消息模板详情
     *
     * 查询模板详情，包括模板内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessageTemplateDetailsRequest 请求对象
     * @return AsyncInvoker<ListMessageTemplateDetailsRequest, ListMessageTemplateDetailsResponse>
     */
    public AsyncInvoker<ListMessageTemplateDetailsRequest, ListMessageTemplateDetailsResponse> listMessageTemplateDetailsAsyncInvoker(
        ListMessageTemplateDetailsRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.listMessageTemplateDetails, hcClient);
    }

    /**
     * 查询消息模板列表
     *
     * 分页查询模板列表，模板列表按照创建时间进行升序排列。分页查询可以指定offset以及limit。如果不存在模板，则返回空列表。额外的查询参数分别有message_template_name和protocol。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessageTemplatesRequest 请求对象
     * @return CompletableFuture<ListMessageTemplatesResponse>
     */
    public CompletableFuture<ListMessageTemplatesResponse> listMessageTemplatesAsync(
        ListMessageTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listMessageTemplates);
    }

    /**
     * 查询消息模板列表
     *
     * 分页查询模板列表，模板列表按照创建时间进行升序排列。分页查询可以指定offset以及limit。如果不存在模板，则返回空列表。额外的查询参数分别有message_template_name和protocol。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessageTemplatesRequest 请求对象
     * @return AsyncInvoker<ListMessageTemplatesRequest, ListMessageTemplatesResponse>
     */
    public AsyncInvoker<ListMessageTemplatesRequest, ListMessageTemplatesResponse> listMessageTemplatesAsyncInvoker(
        ListMessageTemplatesRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.listMessageTemplates, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询租户在指定Region和实例类型的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return CompletableFuture<ListProjectTagsResponse>
     */
    public CompletableFuture<ListProjectTagsResponse> listProjectTagsAsync(ListProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询租户在指定Region和实例类型的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsAsyncInvoker(
        ListProjectTagsRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.listProjectTags, hcClient);
    }

    /**
     * 查询资源实例
     *
     * 使用标签过滤实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceInstancesRequest 请求对象
     * @return CompletableFuture<ListResourceInstancesResponse>
     */
    public CompletableFuture<ListResourceInstancesResponse> listResourceInstancesAsync(
        ListResourceInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listResourceInstances);
    }

    /**
     * 查询资源实例
     *
     * 使用标签过滤实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceInstancesRequest 请求对象
     * @return AsyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse>
     */
    public AsyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse> listResourceInstancesAsyncInvoker(
        ListResourceInstancesRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.listResourceInstances, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceTagsRequest 请求对象
     * @return CompletableFuture<ListResourceTagsResponse>
     */
    public CompletableFuture<ListResourceTagsResponse> listResourceTagsAsync(ListResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listResourceTags);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceTagsRequest 请求对象
     * @return AsyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse>
     */
    public AsyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse> listResourceTagsAsyncInvoker(
        ListResourceTagsRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.listResourceTags, hcClient);
    }

    /**
     * 查询订阅者列表
     *
     * 分页返回请求者的所有的订阅列表，订阅列表按照订阅创建时间进行升序排列。分页查询可以指定offset以及limit。如果订阅者不存在，返回空列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubscriptionsRequest 请求对象
     * @return CompletableFuture<ListSubscriptionsResponse>
     */
    public CompletableFuture<ListSubscriptionsResponse> listSubscriptionsAsync(ListSubscriptionsRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listSubscriptions);
    }

    /**
     * 查询订阅者列表
     *
     * 分页返回请求者的所有的订阅列表，订阅列表按照订阅创建时间进行升序排列。分页查询可以指定offset以及limit。如果订阅者不存在，返回空列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubscriptionsRequest 请求对象
     * @return AsyncInvoker<ListSubscriptionsRequest, ListSubscriptionsResponse>
     */
    public AsyncInvoker<ListSubscriptionsRequest, ListSubscriptionsResponse> listSubscriptionsAsyncInvoker(
        ListSubscriptionsRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.listSubscriptions, hcClient);
    }

    /**
     * 查询指定Topic的订阅者列表
     *
     * 分页获取特定Topic的订阅列表，订阅列表按照订阅创建时间进行升序排列。分页查询可以指定offset以及limit。如果指定Topic不存在订阅者，返回空列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubscriptionsByTopicRequest 请求对象
     * @return CompletableFuture<ListSubscriptionsByTopicResponse>
     */
    public CompletableFuture<ListSubscriptionsByTopicResponse> listSubscriptionsByTopicAsync(
        ListSubscriptionsByTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listSubscriptionsByTopic);
    }

    /**
     * 查询指定Topic的订阅者列表
     *
     * 分页获取特定Topic的订阅列表，订阅列表按照订阅创建时间进行升序排列。分页查询可以指定offset以及limit。如果指定Topic不存在订阅者，返回空列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubscriptionsByTopicRequest 请求对象
     * @return AsyncInvoker<ListSubscriptionsByTopicRequest, ListSubscriptionsByTopicResponse>
     */
    public AsyncInvoker<ListSubscriptionsByTopicRequest, ListSubscriptionsByTopicResponse> listSubscriptionsByTopicAsyncInvoker(
        ListSubscriptionsByTopicRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.listSubscriptionsByTopic, hcClient);
    }

    /**
     * 查询主题策略
     *
     * 查询主题的策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopicAttributesRequest 请求对象
     * @return CompletableFuture<ListTopicAttributesResponse>
     */
    public CompletableFuture<ListTopicAttributesResponse> listTopicAttributesAsync(ListTopicAttributesRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listTopicAttributes);
    }

    /**
     * 查询主题策略
     *
     * 查询主题的策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopicAttributesRequest 请求对象
     * @return AsyncInvoker<ListTopicAttributesRequest, ListTopicAttributesResponse>
     */
    public AsyncInvoker<ListTopicAttributesRequest, ListTopicAttributesResponse> listTopicAttributesAsyncInvoker(
        ListTopicAttributesRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.listTopicAttributes, hcClient);
    }

    /**
     * 查询主题详情
     *
     * 查询Topic的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopicDetailsRequest 请求对象
     * @return CompletableFuture<ListTopicDetailsResponse>
     */
    public CompletableFuture<ListTopicDetailsResponse> listTopicDetailsAsync(ListTopicDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listTopicDetails);
    }

    /**
     * 查询主题详情
     *
     * 查询Topic的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopicDetailsRequest 请求对象
     * @return AsyncInvoker<ListTopicDetailsRequest, ListTopicDetailsResponse>
     */
    public AsyncInvoker<ListTopicDetailsRequest, ListTopicDetailsResponse> listTopicDetailsAsyncInvoker(
        ListTopicDetailsRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.listTopicDetails, hcClient);
    }

    /**
     * 查询主题的发送详情
     *
     * 查询Topic的发送数据详情，最多支持查询31天内所有计量数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopicMessageStatisticsRequest 请求对象
     * @return CompletableFuture<ListTopicMessageStatisticsResponse>
     */
    public CompletableFuture<ListTopicMessageStatisticsResponse> listTopicMessageStatisticsAsync(
        ListTopicMessageStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listTopicMessageStatistics);
    }

    /**
     * 查询主题的发送详情
     *
     * 查询Topic的发送数据详情，最多支持查询31天内所有计量数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopicMessageStatisticsRequest 请求对象
     * @return AsyncInvoker<ListTopicMessageStatisticsRequest, ListTopicMessageStatisticsResponse>
     */
    public AsyncInvoker<ListTopicMessageStatisticsRequest, ListTopicMessageStatisticsResponse> listTopicMessageStatisticsAsyncInvoker(
        ListTopicMessageStatisticsRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.listTopicMessageStatistics, hcClient);
    }

    /**
     * 查询主题列表
     *
     * 分页查询Topic列表，Topic列表按照Topic创建时间进行降序排列。分页查询可以指定offset以及limit。如果不存在Topic，则返回空列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopicsRequest 请求对象
     * @return CompletableFuture<ListTopicsResponse>
     */
    public CompletableFuture<ListTopicsResponse> listTopicsAsync(ListTopicsRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listTopics);
    }

    /**
     * 查询主题列表
     *
     * 分页查询Topic列表，Topic列表按照Topic创建时间进行降序排列。分页查询可以指定offset以及limit。如果不存在Topic，则返回空列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopicsRequest 请求对象
     * @return AsyncInvoker<ListTopicsRequest, ListTopicsResponse>
     */
    public AsyncInvoker<ListTopicsRequest, ListTopicsResponse> listTopicsAsyncInvoker(ListTopicsRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.listTopics, hcClient);
    }

    /**
     * 查询SMN API V2版本信息
     *
     * 查询SMN API V2版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVersionRequest 请求对象
     * @return CompletableFuture<ListVersionResponse>
     */
    public CompletableFuture<ListVersionResponse> listVersionAsync(ListVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listVersion);
    }

    /**
     * 查询SMN API V2版本信息
     *
     * 查询SMN API V2版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVersionRequest 请求对象
     * @return AsyncInvoker<ListVersionRequest, ListVersionResponse>
     */
    public AsyncInvoker<ListVersionRequest, ListVersionResponse> listVersionAsyncInvoker(ListVersionRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.listVersion, hcClient);
    }

    /**
     * 查询SMN支持的API版本号信息
     *
     * 查询SMN开放API支持的版本号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVersionsRequest 请求对象
     * @return CompletableFuture<ListVersionsResponse>
     */
    public CompletableFuture<ListVersionsResponse> listVersionsAsync(ListVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listVersions);
    }

    /**
     * 查询SMN支持的API版本号信息
     *
     * 查询SMN开放API支持的版本号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVersionsRequest 请求对象
     * @return AsyncInvoker<ListVersionsRequest, ListVersionsResponse>
     */
    public AsyncInvoker<ListVersionsRequest, ListVersionsResponse> listVersionsAsyncInvoker(
        ListVersionsRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.listVersions, hcClient);
    }

    /**
     * 发布探测消息
     *
     * 基于主题发送http/https探测消息，探测当前http/https 终端是否可用，SMN出口是否能够正常访问该终端。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishHttpDetectRequest 请求对象
     * @return CompletableFuture<PublishHttpDetectResponse>
     */
    public CompletableFuture<PublishHttpDetectResponse> publishHttpDetectAsync(PublishHttpDetectRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.publishHttpDetect);
    }

    /**
     * 发布探测消息
     *
     * 基于主题发送http/https探测消息，探测当前http/https 终端是否可用，SMN出口是否能够正常访问该终端。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishHttpDetectRequest 请求对象
     * @return AsyncInvoker<PublishHttpDetectRequest, PublishHttpDetectResponse>
     */
    public AsyncInvoker<PublishHttpDetectRequest, PublishHttpDetectResponse> publishHttpDetectAsyncInvoker(
        PublishHttpDetectRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.publishHttpDetect, hcClient);
    }

    /**
     * 消息发布
     *
     * 将消息发送给Topic的所有订阅端点。当返回消息ID时，该消息已被保存并开始尝试将其推送给Topic的订阅者。为确保您的消息能够成功推送到各个订阅者，请确保您的消息内容符合当地法律法规要求。
     * 三种消息发送方式
     * 
     * message
     * 
     * message_structure
     * 
     * message_template_name
     * 
     * 只需要设置其中一个，如果同时设置，生效的优先级为
     * message_structure &gt; message_template_name &gt; message。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishMessageRequest 请求对象
     * @return CompletableFuture<PublishMessageResponse>
     */
    public CompletableFuture<PublishMessageResponse> publishMessageAsync(PublishMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.publishMessage);
    }

    /**
     * 消息发布
     *
     * 将消息发送给Topic的所有订阅端点。当返回消息ID时，该消息已被保存并开始尝试将其推送给Topic的订阅者。为确保您的消息能够成功推送到各个订阅者，请确保您的消息内容符合当地法律法规要求。
     * 三种消息发送方式
     * 
     * message
     * 
     * message_structure
     * 
     * message_template_name
     * 
     * 只需要设置其中一个，如果同时设置，生效的优先级为
     * message_structure &gt; message_template_name &gt; message。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishMessageRequest 请求对象
     * @return AsyncInvoker<PublishMessageRequest, PublishMessageResponse>
     */
    public AsyncInvoker<PublishMessageRequest, PublishMessageResponse> publishMessageAsyncInvoker(
        PublishMessageRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.publishMessage, hcClient);
    }

    /**
     * 获取http探测结果
     *
     * 根据http探测发送返回的task_id查询探测结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpDetectResultRequest 请求对象
     * @return CompletableFuture<ShowHttpDetectResultResponse>
     */
    public CompletableFuture<ShowHttpDetectResultResponse> showHttpDetectResultAsync(
        ShowHttpDetectResultRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.showHttpDetectResult);
    }

    /**
     * 获取http探测结果
     *
     * 根据http探测发送返回的task_id查询探测结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpDetectResultRequest 请求对象
     * @return AsyncInvoker<ShowHttpDetectResultRequest, ShowHttpDetectResultResponse>
     */
    public AsyncInvoker<ShowHttpDetectResultRequest, ShowHttpDetectResultResponse> showHttpDetectResultAsyncInvoker(
        ShowHttpDetectResultRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.showHttpDetectResult, hcClient);
    }

    /**
     * 查询通知策略
     *
     * 查询通知策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNotifyPolicyRequest 请求对象
     * @return CompletableFuture<ShowNotifyPolicyResponse>
     */
    public CompletableFuture<ShowNotifyPolicyResponse> showNotifyPolicyAsync(ShowNotifyPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.showNotifyPolicy);
    }

    /**
     * 查询通知策略
     *
     * 查询通知策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNotifyPolicyRequest 请求对象
     * @return AsyncInvoker<ShowNotifyPolicyRequest, ShowNotifyPolicyResponse>
     */
    public AsyncInvoker<ShowNotifyPolicyRequest, ShowNotifyPolicyResponse> showNotifyPolicyAsyncInvoker(
        ShowNotifyPolicyRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.showNotifyPolicy, hcClient);
    }

    /**
     * 更新云日志
     *
     * 更新指定Topic绑定的云日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLogtankRequest 请求对象
     * @return CompletableFuture<UpdateLogtankResponse>
     */
    public CompletableFuture<UpdateLogtankResponse> updateLogtankAsync(UpdateLogtankRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.updateLogtank);
    }

    /**
     * 更新云日志
     *
     * 更新指定Topic绑定的云日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLogtankRequest 请求对象
     * @return AsyncInvoker<UpdateLogtankRequest, UpdateLogtankResponse>
     */
    public AsyncInvoker<UpdateLogtankRequest, UpdateLogtankResponse> updateLogtankAsyncInvoker(
        UpdateLogtankRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.updateLogtank, hcClient);
    }

    /**
     * 更新消息模板
     *
     * 修改消息模板的内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMessageTemplateRequest 请求对象
     * @return CompletableFuture<UpdateMessageTemplateResponse>
     */
    public CompletableFuture<UpdateMessageTemplateResponse> updateMessageTemplateAsync(
        UpdateMessageTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.updateMessageTemplate);
    }

    /**
     * 更新消息模板
     *
     * 修改消息模板的内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMessageTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateMessageTemplateRequest, UpdateMessageTemplateResponse>
     */
    public AsyncInvoker<UpdateMessageTemplateRequest, UpdateMessageTemplateResponse> updateMessageTemplateAsyncInvoker(
        UpdateMessageTemplateRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.updateMessageTemplate, hcClient);
    }

    /**
     * 修改通知策略
     *
     * 修改通知策略，该接口仅支持全量修改，不支持部分修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNotifyPolicyRequest 请求对象
     * @return CompletableFuture<UpdateNotifyPolicyResponse>
     */
    public CompletableFuture<UpdateNotifyPolicyResponse> updateNotifyPolicyAsync(UpdateNotifyPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.updateNotifyPolicy);
    }

    /**
     * 修改通知策略
     *
     * 修改通知策略，该接口仅支持全量修改，不支持部分修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNotifyPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateNotifyPolicyRequest, UpdateNotifyPolicyResponse>
     */
    public AsyncInvoker<UpdateNotifyPolicyRequest, UpdateNotifyPolicyResponse> updateNotifyPolicyAsyncInvoker(
        UpdateNotifyPolicyRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.updateNotifyPolicy, hcClient);
    }

    /**
     * 更新订阅者
     *
     * 更新订阅者备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubscriptionRequest 请求对象
     * @return CompletableFuture<UpdateSubscriptionResponse>
     */
    public CompletableFuture<UpdateSubscriptionResponse> updateSubscriptionAsync(UpdateSubscriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.updateSubscription);
    }

    /**
     * 更新订阅者
     *
     * 更新订阅者备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubscriptionRequest 请求对象
     * @return AsyncInvoker<UpdateSubscriptionRequest, UpdateSubscriptionResponse>
     */
    public AsyncInvoker<UpdateSubscriptionRequest, UpdateSubscriptionResponse> updateSubscriptionAsyncInvoker(
        UpdateSubscriptionRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.updateSubscription, hcClient);
    }

    /**
     * 更新主题
     *
     * 更新显示名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTopicRequest 请求对象
     * @return CompletableFuture<UpdateTopicResponse>
     */
    public CompletableFuture<UpdateTopicResponse> updateTopicAsync(UpdateTopicRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.updateTopic);
    }

    /**
     * 更新主题
     *
     * 更新显示名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTopicRequest 请求对象
     * @return AsyncInvoker<UpdateTopicRequest, UpdateTopicResponse>
     */
    public AsyncInvoker<UpdateTopicRequest, UpdateTopicResponse> updateTopicAsyncInvoker(UpdateTopicRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.updateTopic, hcClient);
    }

    /**
     * 更新主题策略
     *
     * 更新主题的策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTopicAttributeRequest 请求对象
     * @return CompletableFuture<UpdateTopicAttributeResponse>
     */
    public CompletableFuture<UpdateTopicAttributeResponse> updateTopicAttributeAsync(
        UpdateTopicAttributeRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.updateTopicAttribute);
    }

    /**
     * 更新主题策略
     *
     * 更新主题的策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTopicAttributeRequest 请求对象
     * @return AsyncInvoker<UpdateTopicAttributeRequest, UpdateTopicAttributeResponse>
     */
    public AsyncInvoker<UpdateTopicAttributeRequest, UpdateTopicAttributeResponse> updateTopicAttributeAsyncInvoker(
        UpdateTopicAttributeRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.updateTopicAttribute, hcClient);
    }

    /**
     * 创建Application
     *
     * 创建平台应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApplicationRequest 请求对象
     * @return CompletableFuture<CreateApplicationResponse>
     */
    @Deprecated
    public CompletableFuture<CreateApplicationResponse> createApplicationAsync(CreateApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.createApplication);
    }

    /**
     * 创建Application
     *
     * 创建平台应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApplicationRequest 请求对象
     * @return AsyncInvoker<CreateApplicationRequest, CreateApplicationResponse>
     */
    @Deprecated
    public AsyncInvoker<CreateApplicationRequest, CreateApplicationResponse> createApplicationAsyncInvoker(
        CreateApplicationRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.createApplication, hcClient);
    }

    /**
     * 删除Application
     *
     * 删除平台应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationRequest 请求对象
     * @return CompletableFuture<DeleteApplicationResponse>
     */
    @Deprecated
    public CompletableFuture<DeleteApplicationResponse> deleteApplicationAsync(DeleteApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.deleteApplication);
    }

    /**
     * 删除Application
     *
     * 删除平台应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationRequest 请求对象
     * @return AsyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse>
     */
    @Deprecated
    public AsyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse> deleteApplicationAsyncInvoker(
        DeleteApplicationRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.deleteApplication, hcClient);
    }

    /**
     * 查询Application属性
     *
     * 获取应用平台属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationAttributesRequest 请求对象
     * @return CompletableFuture<ListApplicationAttributesResponse>
     */
    @Deprecated
    public CompletableFuture<ListApplicationAttributesResponse> listApplicationAttributesAsync(
        ListApplicationAttributesRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listApplicationAttributes);
    }

    /**
     * 查询Application属性
     *
     * 获取应用平台属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationAttributesRequest 请求对象
     * @return AsyncInvoker<ListApplicationAttributesRequest, ListApplicationAttributesResponse>
     */
    @Deprecated
    public AsyncInvoker<ListApplicationAttributesRequest, ListApplicationAttributesResponse> listApplicationAttributesAsyncInvoker(
        ListApplicationAttributesRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.listApplicationAttributes, hcClient);
    }

    /**
     * 查询Application
     *
     * 查询应用平台列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationsRequest 请求对象
     * @return CompletableFuture<ListApplicationsResponse>
     */
    @Deprecated
    public CompletableFuture<ListApplicationsResponse> listApplicationsAsync(ListApplicationsRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listApplications);
    }

    /**
     * 查询Application
     *
     * 查询应用平台列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationsRequest 请求对象
     * @return AsyncInvoker<ListApplicationsRequest, ListApplicationsResponse>
     */
    @Deprecated
    public AsyncInvoker<ListApplicationsRequest, ListApplicationsResponse> listApplicationsAsyncInvoker(
        ListApplicationsRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.listApplications, hcClient);
    }

    /**
     * App消息发布
     *
     * 将消息直发给endpoint设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishAppMessageRequest 请求对象
     * @return CompletableFuture<PublishAppMessageResponse>
     */
    @Deprecated
    public CompletableFuture<PublishAppMessageResponse> publishAppMessageAsync(PublishAppMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.publishAppMessage);
    }

    /**
     * App消息发布
     *
     * 将消息直发给endpoint设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishAppMessageRequest 请求对象
     * @return AsyncInvoker<PublishAppMessageRequest, PublishAppMessageResponse>
     */
    @Deprecated
    public AsyncInvoker<PublishAppMessageRequest, PublishAppMessageResponse> publishAppMessageAsyncInvoker(
        PublishAppMessageRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.publishAppMessage, hcClient);
    }

    /**
     * 更新Application
     *
     * 更新应用平台。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationRequest 请求对象
     * @return CompletableFuture<UpdateApplicationResponse>
     */
    @Deprecated
    public CompletableFuture<UpdateApplicationResponse> updateApplicationAsync(UpdateApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.updateApplication);
    }

    /**
     * 更新Application
     *
     * 更新应用平台。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationRequest 请求对象
     * @return AsyncInvoker<UpdateApplicationRequest, UpdateApplicationResponse>
     */
    @Deprecated
    public AsyncInvoker<UpdateApplicationRequest, UpdateApplicationResponse> updateApplicationAsyncInvoker(
        UpdateApplicationRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.updateApplication, hcClient);
    }

    /**
     * 创建Application endpoint
     *
     * 创建应用平台的endpoint终端。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApplicationEndpointRequest 请求对象
     * @return CompletableFuture<CreateApplicationEndpointResponse>
     */
    @Deprecated
    public CompletableFuture<CreateApplicationEndpointResponse> createApplicationEndpointAsync(
        CreateApplicationEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.createApplicationEndpoint);
    }

    /**
     * 创建Application endpoint
     *
     * 创建应用平台的endpoint终端。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApplicationEndpointRequest 请求对象
     * @return AsyncInvoker<CreateApplicationEndpointRequest, CreateApplicationEndpointResponse>
     */
    @Deprecated
    public AsyncInvoker<CreateApplicationEndpointRequest, CreateApplicationEndpointResponse> createApplicationEndpointAsyncInvoker(
        CreateApplicationEndpointRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.createApplicationEndpoint, hcClient);
    }

    /**
     * 删除Application endpoint
     *
     * 删除设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationEndpointRequest 请求对象
     * @return CompletableFuture<DeleteApplicationEndpointResponse>
     */
    @Deprecated
    public CompletableFuture<DeleteApplicationEndpointResponse> deleteApplicationEndpointAsync(
        DeleteApplicationEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.deleteApplicationEndpoint);
    }

    /**
     * 删除Application endpoint
     *
     * 删除设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationEndpointRequest 请求对象
     * @return AsyncInvoker<DeleteApplicationEndpointRequest, DeleteApplicationEndpointResponse>
     */
    @Deprecated
    public AsyncInvoker<DeleteApplicationEndpointRequest, DeleteApplicationEndpointResponse> deleteApplicationEndpointAsyncInvoker(
        DeleteApplicationEndpointRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.deleteApplicationEndpoint, hcClient);
    }

    /**
     * 查询Application的Endpoint属性
     *
     * 获取endpoint的属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationEndpointAttributesRequest 请求对象
     * @return CompletableFuture<ListApplicationEndpointAttributesResponse>
     */
    @Deprecated
    public CompletableFuture<ListApplicationEndpointAttributesResponse> listApplicationEndpointAttributesAsync(
        ListApplicationEndpointAttributesRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listApplicationEndpointAttributes);
    }

    /**
     * 查询Application的Endpoint属性
     *
     * 获取endpoint的属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationEndpointAttributesRequest 请求对象
     * @return AsyncInvoker<ListApplicationEndpointAttributesRequest, ListApplicationEndpointAttributesResponse>
     */
    @Deprecated
    public AsyncInvoker<ListApplicationEndpointAttributesRequest, ListApplicationEndpointAttributesResponse> listApplicationEndpointAttributesAsyncInvoker(
        ListApplicationEndpointAttributesRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.listApplicationEndpointAttributes, hcClient);
    }

    /**
     * 查询Application的Endpoint列表
     *
     * 查询平台的endpoint列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationEndpointsRequest 请求对象
     * @return CompletableFuture<ListApplicationEndpointsResponse>
     */
    @Deprecated
    public CompletableFuture<ListApplicationEndpointsResponse> listApplicationEndpointsAsync(
        ListApplicationEndpointsRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listApplicationEndpoints);
    }

    /**
     * 查询Application的Endpoint列表
     *
     * 查询平台的endpoint列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationEndpointsRequest 请求对象
     * @return AsyncInvoker<ListApplicationEndpointsRequest, ListApplicationEndpointsResponse>
     */
    @Deprecated
    public AsyncInvoker<ListApplicationEndpointsRequest, ListApplicationEndpointsResponse> listApplicationEndpointsAsyncInvoker(
        ListApplicationEndpointsRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.listApplicationEndpoints, hcClient);
    }

    /**
     * 更新Application endpoint
     *
     * 更新设备属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationEndpointRequest 请求对象
     * @return CompletableFuture<UpdateApplicationEndpointResponse>
     */
    @Deprecated
    public CompletableFuture<UpdateApplicationEndpointResponse> updateApplicationEndpointAsync(
        UpdateApplicationEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.updateApplicationEndpoint);
    }

    /**
     * 更新Application endpoint
     *
     * 更新设备属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationEndpointRequest 请求对象
     * @return AsyncInvoker<UpdateApplicationEndpointRequest, UpdateApplicationEndpointResponse>
     */
    @Deprecated
    public AsyncInvoker<UpdateApplicationEndpointRequest, UpdateApplicationEndpointResponse> updateApplicationEndpointAsyncInvoker(
        UpdateApplicationEndpointRequest request) {
        return new AsyncInvoker<>(request, SmnMeta.updateApplicationEndpoint, hcClient);
    }

}

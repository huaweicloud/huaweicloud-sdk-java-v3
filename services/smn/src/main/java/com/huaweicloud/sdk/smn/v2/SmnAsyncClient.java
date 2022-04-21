package com.huaweicloud.sdk.smn.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.smn.v2.model.*;

import java.util.concurrent.CompletableFuture;

public class SmnAsyncClient {

    protected HcClient hcClient;

    public SmnAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SmnAsyncClient> newBuilder() {
        return new ClientBuilder<>(SmnAsyncClient::new);
    }

    /**
     * 订阅
     *
     * 为指定Topic添加一个订阅者，如果订阅者的状态为未确认，则向订阅者发送一个确认的消息。待订阅者进行ConfirmSubscription确认后，该订阅者才能收到Topic发布的消息。单Topic默认可添加10000个订阅者，高并发场景下，可能会出现订阅者数量超过10000仍添加成功的情况，此为正常现象。接口是幂等的，如果添加已存在的订阅者，则返回成功，且status code为200，否则status code为201。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddSubscriptionRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AddSubscriptionRequest 请求对象
     * @return AsyncInvoker<AddSubscriptionRequest, AddSubscriptionResponse>
     */
    public AsyncInvoker<AddSubscriptionRequest, AddSubscriptionResponse> addSubscriptionAsyncInvoker(
        AddSubscriptionRequest request) {
        return new AsyncInvoker<AddSubscriptionRequest, AddSubscriptionResponse>(request, SmnMeta.addSubscription,
            hcClient);
    }

    /**
     * 批量添加删除资源标签
     *
     * 为指定实例批量添加或删除标签。一个资源上最多有10个标签。
     * 此接口为幂等接口：创建时如果请求体中存在重复key则报错。
     * 创建时，不允许重复key，如果数据库存在就覆盖。
     * 删除时，如果删除的标签不存在，默认处理成功，删除时不对标签字符集范围做校验。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchCreateOrDeleteResourceTagsRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchCreateOrDeleteResourceTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateOrDeleteResourceTagsRequest, BatchCreateOrDeleteResourceTagsResponse>
     */
    public AsyncInvoker<BatchCreateOrDeleteResourceTagsRequest, BatchCreateOrDeleteResourceTagsResponse> batchCreateOrDeleteResourceTagsAsyncInvoker(
        BatchCreateOrDeleteResourceTagsRequest request) {
        return new AsyncInvoker<BatchCreateOrDeleteResourceTagsRequest, BatchCreateOrDeleteResourceTagsResponse>(
            request, SmnMeta.batchCreateOrDeleteResourceTags, hcClient);
    }

    /**
     * 取消订阅
     *
     * 删除指定的订阅者。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CancelSubscriptionRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CancelSubscriptionRequest 请求对象
     * @return AsyncInvoker<CancelSubscriptionRequest, CancelSubscriptionResponse>
     */
    public AsyncInvoker<CancelSubscriptionRequest, CancelSubscriptionResponse> cancelSubscriptionAsyncInvoker(
        CancelSubscriptionRequest request) {
        return new AsyncInvoker<CancelSubscriptionRequest, CancelSubscriptionResponse>(request,
            SmnMeta.cancelSubscription, hcClient);
    }

    /**
     * 创建消息模板
     *
     * 创建一个模板，用户可以按照模板去发送消息，这样可以减少请求的数据量。
     * 单用户默认可创建100个消息模板，高并发场景下，可能会出现消息模板数量超过100仍创建成功的情况，此为正常现象。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateMessageTemplateRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateMessageTemplateRequest 请求对象
     * @return AsyncInvoker<CreateMessageTemplateRequest, CreateMessageTemplateResponse>
     */
    public AsyncInvoker<CreateMessageTemplateRequest, CreateMessageTemplateResponse> createMessageTemplateAsyncInvoker(
        CreateMessageTemplateRequest request) {
        return new AsyncInvoker<CreateMessageTemplateRequest, CreateMessageTemplateResponse>(request,
            SmnMeta.createMessageTemplate, hcClient);
    }

    /**
     * 添加资源标签
     *
     * 一个资源上最多有10个标签。此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateResourceTagRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateResourceTagRequest 请求对象
     * @return AsyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse>
     */
    public AsyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse> createResourceTagAsyncInvoker(
        CreateResourceTagRequest request) {
        return new AsyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse>(request, SmnMeta.createResourceTag,
            hcClient);
    }

    /**
     * 创建主题
     *
     * 创建Topic，单用户默认配额为3000。高并发场景下，可能会出现Topic数量超过3000仍创建成功的情况，此为正常现象。
     * 接口是幂等的，接口调用返回成功时，若已存在同名的Topic，返回的status code为200，否则返回的status code为201
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateTopicRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateTopicRequest 请求对象
     * @return AsyncInvoker<CreateTopicRequest, CreateTopicResponse>
     */
    public AsyncInvoker<CreateTopicRequest, CreateTopicResponse> createTopicAsyncInvoker(CreateTopicRequest request) {
        return new AsyncInvoker<CreateTopicRequest, CreateTopicResponse>(request, SmnMeta.createTopic, hcClient);
    }

    /**
     * 删除消息模板
     *
     * 删除消息模板。删除模板之前的消息请求都可以使用该模板发送，删除之后无法再使用该模板发送消息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteMessageTemplateRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteMessageTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteMessageTemplateRequest, DeleteMessageTemplateResponse>
     */
    public AsyncInvoker<DeleteMessageTemplateRequest, DeleteMessageTemplateResponse> deleteMessageTemplateAsyncInvoker(
        DeleteMessageTemplateRequest request) {
        return new AsyncInvoker<DeleteMessageTemplateRequest, DeleteMessageTemplateResponse>(request,
            SmnMeta.deleteMessageTemplate, hcClient);
    }

    /**
     * 删除资源标签
     *
     * 幂等接口：删除时，不对标签做校验。删除的key不存在报404，key不能为空或者空字符串。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteResourceTagRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteResourceTagRequest 请求对象
     * @return AsyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse>
     */
    public AsyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse> deleteResourceTagAsyncInvoker(
        DeleteResourceTagRequest request) {
        return new AsyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse>(request, SmnMeta.deleteResourceTag,
            hcClient);
    }

    /**
     * 删除主题
     *
     * 删除主题。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteTopicRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteTopicRequest 请求对象
     * @return AsyncInvoker<DeleteTopicRequest, DeleteTopicResponse>
     */
    public AsyncInvoker<DeleteTopicRequest, DeleteTopicResponse> deleteTopicAsyncInvoker(DeleteTopicRequest request) {
        return new AsyncInvoker<DeleteTopicRequest, DeleteTopicResponse>(request, SmnMeta.deleteTopic, hcClient);
    }

    /**
     * 删除指定名称的主题策略
     *
     * 删除指定名称的主题策略。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteTopicAttributeByNameRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteTopicAttributeByNameRequest 请求对象
     * @return AsyncInvoker<DeleteTopicAttributeByNameRequest, DeleteTopicAttributeByNameResponse>
     */
    public AsyncInvoker<DeleteTopicAttributeByNameRequest, DeleteTopicAttributeByNameResponse> deleteTopicAttributeByNameAsyncInvoker(
        DeleteTopicAttributeByNameRequest request) {
        return new AsyncInvoker<DeleteTopicAttributeByNameRequest, DeleteTopicAttributeByNameResponse>(request,
            SmnMeta.deleteTopicAttributeByName, hcClient);
    }

    /**
     * 删除所有主题策略
     *
     * 删除所有主题策略。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteTopicAttributesRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteTopicAttributesRequest 请求对象
     * @return AsyncInvoker<DeleteTopicAttributesRequest, DeleteTopicAttributesResponse>
     */
    public AsyncInvoker<DeleteTopicAttributesRequest, DeleteTopicAttributesResponse> deleteTopicAttributesAsyncInvoker(
        DeleteTopicAttributesRequest request) {
        return new AsyncInvoker<DeleteTopicAttributesRequest, DeleteTopicAttributesResponse>(request,
            SmnMeta.deleteTopicAttributes, hcClient);
    }

    /**
     * 查询消息模板详情
     *
     * 查询模板详情，包括模板内容。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListMessageTemplateDetailsRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListMessageTemplateDetailsRequest 请求对象
     * @return AsyncInvoker<ListMessageTemplateDetailsRequest, ListMessageTemplateDetailsResponse>
     */
    public AsyncInvoker<ListMessageTemplateDetailsRequest, ListMessageTemplateDetailsResponse> listMessageTemplateDetailsAsyncInvoker(
        ListMessageTemplateDetailsRequest request) {
        return new AsyncInvoker<ListMessageTemplateDetailsRequest, ListMessageTemplateDetailsResponse>(request,
            SmnMeta.listMessageTemplateDetails, hcClient);
    }

    /**
     * 查询消息模板列表
     *
     * 分页查询模板列表，模板列表按照创建时间进行升序排列。分页查询可以指定offset以及limit。如果不存在模板，则返回空列表。额外的查询参数分别有message_template_name和protocol。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListMessageTemplatesRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListMessageTemplatesRequest 请求对象
     * @return AsyncInvoker<ListMessageTemplatesRequest, ListMessageTemplatesResponse>
     */
    public AsyncInvoker<ListMessageTemplatesRequest, ListMessageTemplatesResponse> listMessageTemplatesAsyncInvoker(
        ListMessageTemplatesRequest request) {
        return new AsyncInvoker<ListMessageTemplatesRequest, ListMessageTemplatesResponse>(request,
            SmnMeta.listMessageTemplates, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询租户在指定Region和实例类型的所有标签集合。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListProjectTagsRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListProjectTagsRequest 请求对象
     * @return AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsAsyncInvoker(
        ListProjectTagsRequest request) {
        return new AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>(request, SmnMeta.listProjectTags,
            hcClient);
    }

    /**
     * 查询资源实例
     *
     * 使用标签过滤实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListResourceInstancesRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListResourceInstancesRequest 请求对象
     * @return AsyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse>
     */
    public AsyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse> listResourceInstancesAsyncInvoker(
        ListResourceInstancesRequest request) {
        return new AsyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse>(request,
            SmnMeta.listResourceInstances, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListResourceTagsRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListResourceTagsRequest 请求对象
     * @return AsyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse>
     */
    public AsyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse> listResourceTagsAsyncInvoker(
        ListResourceTagsRequest request) {
        return new AsyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse>(request, SmnMeta.listResourceTags,
            hcClient);
    }

    /**
     * 查询订阅者列表
     *
     * 分页返回请求者的所有的订阅列表，订阅列表按照订阅创建时间进行升序排列。分页查询可以指定offset以及limit。如果订阅者不存在，返回空列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSubscriptionsRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSubscriptionsRequest 请求对象
     * @return AsyncInvoker<ListSubscriptionsRequest, ListSubscriptionsResponse>
     */
    public AsyncInvoker<ListSubscriptionsRequest, ListSubscriptionsResponse> listSubscriptionsAsyncInvoker(
        ListSubscriptionsRequest request) {
        return new AsyncInvoker<ListSubscriptionsRequest, ListSubscriptionsResponse>(request, SmnMeta.listSubscriptions,
            hcClient);
    }

    /**
     * 查询指定Topic的订阅者列表
     *
     * 分页获取特定Topic的订阅列表，订阅列表按照订阅创建时间进行升序排列。分页查询可以指定offset以及limit。如果指定Topic不存在订阅者，返回空列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSubscriptionsByTopicRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSubscriptionsByTopicRequest 请求对象
     * @return AsyncInvoker<ListSubscriptionsByTopicRequest, ListSubscriptionsByTopicResponse>
     */
    public AsyncInvoker<ListSubscriptionsByTopicRequest, ListSubscriptionsByTopicResponse> listSubscriptionsByTopicAsyncInvoker(
        ListSubscriptionsByTopicRequest request) {
        return new AsyncInvoker<ListSubscriptionsByTopicRequest, ListSubscriptionsByTopicResponse>(request,
            SmnMeta.listSubscriptionsByTopic, hcClient);
    }

    /**
     * 查询主题策略
     *
     * 查询主题的策略信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTopicAttributesRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTopicAttributesRequest 请求对象
     * @return AsyncInvoker<ListTopicAttributesRequest, ListTopicAttributesResponse>
     */
    public AsyncInvoker<ListTopicAttributesRequest, ListTopicAttributesResponse> listTopicAttributesAsyncInvoker(
        ListTopicAttributesRequest request) {
        return new AsyncInvoker<ListTopicAttributesRequest, ListTopicAttributesResponse>(request,
            SmnMeta.listTopicAttributes, hcClient);
    }

    /**
     * 查询主题详情
     *
     * 查询Topic的详细信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTopicDetailsRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTopicDetailsRequest 请求对象
     * @return AsyncInvoker<ListTopicDetailsRequest, ListTopicDetailsResponse>
     */
    public AsyncInvoker<ListTopicDetailsRequest, ListTopicDetailsResponse> listTopicDetailsAsyncInvoker(
        ListTopicDetailsRequest request) {
        return new AsyncInvoker<ListTopicDetailsRequest, ListTopicDetailsResponse>(request, SmnMeta.listTopicDetails,
            hcClient);
    }

    /**
     * 查询主题列表
     *
     * 分页查询Topic列表，Topic列表按照Topic创建时间进行降序排列。分页查询可以指定offset以及limit。如果不存在Topic，则返回空列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTopicsRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTopicsRequest 请求对象
     * @return AsyncInvoker<ListTopicsRequest, ListTopicsResponse>
     */
    public AsyncInvoker<ListTopicsRequest, ListTopicsResponse> listTopicsAsyncInvoker(ListTopicsRequest request) {
        return new AsyncInvoker<ListTopicsRequest, ListTopicsResponse>(request, SmnMeta.listTopics, hcClient);
    }

    /**
     * 查询SMN API V2版本信息
     *
     * 查询SMN API V2版本信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListVersionRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListVersionRequest 请求对象
     * @return AsyncInvoker<ListVersionRequest, ListVersionResponse>
     */
    public AsyncInvoker<ListVersionRequest, ListVersionResponse> listVersionAsyncInvoker(ListVersionRequest request) {
        return new AsyncInvoker<ListVersionRequest, ListVersionResponse>(request, SmnMeta.listVersion, hcClient);
    }

    /**
     * 查询SMN支持的API版本号信息
     *
     * 查询SMN开放API支持的版本号。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListVersionsRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListVersionsRequest 请求对象
     * @return AsyncInvoker<ListVersionsRequest, ListVersionsResponse>
     */
    public AsyncInvoker<ListVersionsRequest, ListVersionsResponse> listVersionsAsyncInvoker(
        ListVersionsRequest request) {
        return new AsyncInvoker<ListVersionsRequest, ListVersionsResponse>(request, SmnMeta.listVersions, hcClient);
    }

    /**
     * 消息发布
     *
     * 将消息发送给Topic的所有订阅端点。当返回消息ID时，该消息已被保存并开始尝试将其推送给Topic的订阅者。三种消息发送方式
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param PublishMessageRequest 请求对象
     * @return CompletableFuture<PublishMessageResponse>
     */
    public CompletableFuture<PublishMessageResponse> publishMessageAsync(PublishMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.publishMessage);
    }

    /**
     * 消息发布
     *
     * 将消息发送给Topic的所有订阅端点。当返回消息ID时，该消息已被保存并开始尝试将其推送给Topic的订阅者。三种消息发送方式
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param PublishMessageRequest 请求对象
     * @return AsyncInvoker<PublishMessageRequest, PublishMessageResponse>
     */
    public AsyncInvoker<PublishMessageRequest, PublishMessageResponse> publishMessageAsyncInvoker(
        PublishMessageRequest request) {
        return new AsyncInvoker<PublishMessageRequest, PublishMessageResponse>(request, SmnMeta.publishMessage,
            hcClient);
    }

    /**
     * 更新消息模板
     *
     * 修改消息模板的内容。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateMessageTemplateRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateMessageTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateMessageTemplateRequest, UpdateMessageTemplateResponse>
     */
    public AsyncInvoker<UpdateMessageTemplateRequest, UpdateMessageTemplateResponse> updateMessageTemplateAsyncInvoker(
        UpdateMessageTemplateRequest request) {
        return new AsyncInvoker<UpdateMessageTemplateRequest, UpdateMessageTemplateResponse>(request,
            SmnMeta.updateMessageTemplate, hcClient);
    }

    /**
     * 更新主题
     *
     * 更新显示名。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateTopicRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateTopicRequest 请求对象
     * @return AsyncInvoker<UpdateTopicRequest, UpdateTopicResponse>
     */
    public AsyncInvoker<UpdateTopicRequest, UpdateTopicResponse> updateTopicAsyncInvoker(UpdateTopicRequest request) {
        return new AsyncInvoker<UpdateTopicRequest, UpdateTopicResponse>(request, SmnMeta.updateTopic, hcClient);
    }

    /**
     * 更新主题策略
     *
     * 更新主题的策略信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateTopicAttributeRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateTopicAttributeRequest 请求对象
     * @return AsyncInvoker<UpdateTopicAttributeRequest, UpdateTopicAttributeResponse>
     */
    public AsyncInvoker<UpdateTopicAttributeRequest, UpdateTopicAttributeResponse> updateTopicAttributeAsyncInvoker(
        UpdateTopicAttributeRequest request) {
        return new AsyncInvoker<UpdateTopicAttributeRequest, UpdateTopicAttributeResponse>(request,
            SmnMeta.updateTopicAttribute, hcClient);
    }

    /**
     * 创建Application
     *
     * 创建平台应用。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateApplicationRequest 请求对象
     * @return CompletableFuture<CreateApplicationResponse>
     */
    public CompletableFuture<CreateApplicationResponse> createApplicationAsync(CreateApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.createApplication);
    }

    /**
     * 创建Application
     *
     * 创建平台应用。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateApplicationRequest 请求对象
     * @return AsyncInvoker<CreateApplicationRequest, CreateApplicationResponse>
     */
    public AsyncInvoker<CreateApplicationRequest, CreateApplicationResponse> createApplicationAsyncInvoker(
        CreateApplicationRequest request) {
        return new AsyncInvoker<CreateApplicationRequest, CreateApplicationResponse>(request, SmnMeta.createApplication,
            hcClient);
    }

    /**
     * 删除Application
     *
     * 删除平台应用。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteApplicationRequest 请求对象
     * @return CompletableFuture<DeleteApplicationResponse>
     */
    public CompletableFuture<DeleteApplicationResponse> deleteApplicationAsync(DeleteApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.deleteApplication);
    }

    /**
     * 删除Application
     *
     * 删除平台应用。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteApplicationRequest 请求对象
     * @return AsyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse>
     */
    public AsyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse> deleteApplicationAsyncInvoker(
        DeleteApplicationRequest request) {
        return new AsyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse>(request, SmnMeta.deleteApplication,
            hcClient);
    }

    /**
     * 查询Application属性
     *
     * 获取应用平台属性。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListApplicationAttributesRequest 请求对象
     * @return CompletableFuture<ListApplicationAttributesResponse>
     */
    public CompletableFuture<ListApplicationAttributesResponse> listApplicationAttributesAsync(
        ListApplicationAttributesRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listApplicationAttributes);
    }

    /**
     * 查询Application属性
     *
     * 获取应用平台属性。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListApplicationAttributesRequest 请求对象
     * @return AsyncInvoker<ListApplicationAttributesRequest, ListApplicationAttributesResponse>
     */
    public AsyncInvoker<ListApplicationAttributesRequest, ListApplicationAttributesResponse> listApplicationAttributesAsyncInvoker(
        ListApplicationAttributesRequest request) {
        return new AsyncInvoker<ListApplicationAttributesRequest, ListApplicationAttributesResponse>(request,
            SmnMeta.listApplicationAttributes, hcClient);
    }

    /**
     * 查询Application
     *
     * 查询应用平台列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListApplicationsRequest 请求对象
     * @return CompletableFuture<ListApplicationsResponse>
     */
    public CompletableFuture<ListApplicationsResponse> listApplicationsAsync(ListApplicationsRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listApplications);
    }

    /**
     * 查询Application
     *
     * 查询应用平台列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListApplicationsRequest 请求对象
     * @return AsyncInvoker<ListApplicationsRequest, ListApplicationsResponse>
     */
    public AsyncInvoker<ListApplicationsRequest, ListApplicationsResponse> listApplicationsAsyncInvoker(
        ListApplicationsRequest request) {
        return new AsyncInvoker<ListApplicationsRequest, ListApplicationsResponse>(request, SmnMeta.listApplications,
            hcClient);
    }

    /**
     * App消息发布
     *
     * 将消息直发给endpoint设备。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param PublishAppMessageRequest 请求对象
     * @return CompletableFuture<PublishAppMessageResponse>
     */
    public CompletableFuture<PublishAppMessageResponse> publishAppMessageAsync(PublishAppMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.publishAppMessage);
    }

    /**
     * App消息发布
     *
     * 将消息直发给endpoint设备。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param PublishAppMessageRequest 请求对象
     * @return AsyncInvoker<PublishAppMessageRequest, PublishAppMessageResponse>
     */
    public AsyncInvoker<PublishAppMessageRequest, PublishAppMessageResponse> publishAppMessageAsyncInvoker(
        PublishAppMessageRequest request) {
        return new AsyncInvoker<PublishAppMessageRequest, PublishAppMessageResponse>(request, SmnMeta.publishAppMessage,
            hcClient);
    }

    /**
     * 更新Application
     *
     * 更新应用平台。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateApplicationRequest 请求对象
     * @return CompletableFuture<UpdateApplicationResponse>
     */
    public CompletableFuture<UpdateApplicationResponse> updateApplicationAsync(UpdateApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.updateApplication);
    }

    /**
     * 更新Application
     *
     * 更新应用平台。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateApplicationRequest 请求对象
     * @return AsyncInvoker<UpdateApplicationRequest, UpdateApplicationResponse>
     */
    public AsyncInvoker<UpdateApplicationRequest, UpdateApplicationResponse> updateApplicationAsyncInvoker(
        UpdateApplicationRequest request) {
        return new AsyncInvoker<UpdateApplicationRequest, UpdateApplicationResponse>(request, SmnMeta.updateApplication,
            hcClient);
    }

    /**
     * 创建Application endpoint
     *
     * 创建应用平台的endpoint终端。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateApplicationEndpointRequest 请求对象
     * @return CompletableFuture<CreateApplicationEndpointResponse>
     */
    public CompletableFuture<CreateApplicationEndpointResponse> createApplicationEndpointAsync(
        CreateApplicationEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.createApplicationEndpoint);
    }

    /**
     * 创建Application endpoint
     *
     * 创建应用平台的endpoint终端。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateApplicationEndpointRequest 请求对象
     * @return AsyncInvoker<CreateApplicationEndpointRequest, CreateApplicationEndpointResponse>
     */
    public AsyncInvoker<CreateApplicationEndpointRequest, CreateApplicationEndpointResponse> createApplicationEndpointAsyncInvoker(
        CreateApplicationEndpointRequest request) {
        return new AsyncInvoker<CreateApplicationEndpointRequest, CreateApplicationEndpointResponse>(request,
            SmnMeta.createApplicationEndpoint, hcClient);
    }

    /**
     * 删除Application endpoint
     *
     * 删除设备。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteApplicationEndpointRequest 请求对象
     * @return CompletableFuture<DeleteApplicationEndpointResponse>
     */
    public CompletableFuture<DeleteApplicationEndpointResponse> deleteApplicationEndpointAsync(
        DeleteApplicationEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.deleteApplicationEndpoint);
    }

    /**
     * 删除Application endpoint
     *
     * 删除设备。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteApplicationEndpointRequest 请求对象
     * @return AsyncInvoker<DeleteApplicationEndpointRequest, DeleteApplicationEndpointResponse>
     */
    public AsyncInvoker<DeleteApplicationEndpointRequest, DeleteApplicationEndpointResponse> deleteApplicationEndpointAsyncInvoker(
        DeleteApplicationEndpointRequest request) {
        return new AsyncInvoker<DeleteApplicationEndpointRequest, DeleteApplicationEndpointResponse>(request,
            SmnMeta.deleteApplicationEndpoint, hcClient);
    }

    /**
     * 查询Application的Endpoint属性
     *
     * 获取endpoint的属性。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListApplicationEndpointAttributesRequest 请求对象
     * @return CompletableFuture<ListApplicationEndpointAttributesResponse>
     */
    public CompletableFuture<ListApplicationEndpointAttributesResponse> listApplicationEndpointAttributesAsync(
        ListApplicationEndpointAttributesRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listApplicationEndpointAttributes);
    }

    /**
     * 查询Application的Endpoint属性
     *
     * 获取endpoint的属性。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListApplicationEndpointAttributesRequest 请求对象
     * @return AsyncInvoker<ListApplicationEndpointAttributesRequest, ListApplicationEndpointAttributesResponse>
     */
    public AsyncInvoker<ListApplicationEndpointAttributesRequest, ListApplicationEndpointAttributesResponse> listApplicationEndpointAttributesAsyncInvoker(
        ListApplicationEndpointAttributesRequest request) {
        return new AsyncInvoker<ListApplicationEndpointAttributesRequest, ListApplicationEndpointAttributesResponse>(
            request, SmnMeta.listApplicationEndpointAttributes, hcClient);
    }

    /**
     * 查询Application的Endpoint列表
     *
     * 查询平台的endpoint列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListApplicationEndpointsRequest 请求对象
     * @return CompletableFuture<ListApplicationEndpointsResponse>
     */
    public CompletableFuture<ListApplicationEndpointsResponse> listApplicationEndpointsAsync(
        ListApplicationEndpointsRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.listApplicationEndpoints);
    }

    /**
     * 查询Application的Endpoint列表
     *
     * 查询平台的endpoint列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListApplicationEndpointsRequest 请求对象
     * @return AsyncInvoker<ListApplicationEndpointsRequest, ListApplicationEndpointsResponse>
     */
    public AsyncInvoker<ListApplicationEndpointsRequest, ListApplicationEndpointsResponse> listApplicationEndpointsAsyncInvoker(
        ListApplicationEndpointsRequest request) {
        return new AsyncInvoker<ListApplicationEndpointsRequest, ListApplicationEndpointsResponse>(request,
            SmnMeta.listApplicationEndpoints, hcClient);
    }

    /**
     * 更新Application endpoint
     *
     * 更新设备属性。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateApplicationEndpointRequest 请求对象
     * @return CompletableFuture<UpdateApplicationEndpointResponse>
     */
    public CompletableFuture<UpdateApplicationEndpointResponse> updateApplicationEndpointAsync(
        UpdateApplicationEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnMeta.updateApplicationEndpoint);
    }

    /**
     * 更新Application endpoint
     *
     * 更新设备属性。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateApplicationEndpointRequest 请求对象
     * @return AsyncInvoker<UpdateApplicationEndpointRequest, UpdateApplicationEndpointResponse>
     */
    public AsyncInvoker<UpdateApplicationEndpointRequest, UpdateApplicationEndpointResponse> updateApplicationEndpointAsyncInvoker(
        UpdateApplicationEndpointRequest request) {
        return new AsyncInvoker<UpdateApplicationEndpointRequest, UpdateApplicationEndpointResponse>(request,
            SmnMeta.updateApplicationEndpoint, hcClient);
    }

}

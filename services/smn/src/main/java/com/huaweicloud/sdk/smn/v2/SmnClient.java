package com.huaweicloud.sdk.smn.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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

public class SmnClient {

    protected HcClient hcClient;

    public SmnClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SmnClient> newBuilder() {
        ClientBuilder<SmnClient> clientBuilder = new ClientBuilder<>(SmnClient::new);
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
     * @return AddSubscriptionResponse
     */
    public AddSubscriptionResponse addSubscription(AddSubscriptionRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.addSubscription);
    }

    /**
     * 订阅
     *
     * 为指定Topic添加一个订阅者，如果订阅者的状态为未确认，则向订阅者发送一个确认的消息。待订阅者进行ConfirmSubscription确认后，该订阅者才能收到Topic发布的消息。单Topic默认可添加10000个订阅者，高并发场景下，可能会出现订阅者数量超过10000仍添加成功的情况，此为正常现象。接口是幂等的，如果添加已存在的订阅者，则返回成功，且status code为200，否则status code为201。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSubscriptionRequest 请求对象
     * @return SyncInvoker<AddSubscriptionRequest, AddSubscriptionResponse>
     */
    public SyncInvoker<AddSubscriptionRequest, AddSubscriptionResponse> addSubscriptionInvoker(
        AddSubscriptionRequest request) {
        return new SyncInvoker<>(request, SmnMeta.addSubscription, hcClient);
    }

    /**
     * 导入订阅
     *
     * 为指定的Topic添加订阅者，订阅者信息来源为订阅用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSubscriptionFromSubscriptionUserRequest 请求对象
     * @return AddSubscriptionFromSubscriptionUserResponse
     */
    public AddSubscriptionFromSubscriptionUserResponse addSubscriptionFromSubscriptionUser(
        AddSubscriptionFromSubscriptionUserRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.addSubscriptionFromSubscriptionUser);
    }

    /**
     * 导入订阅
     *
     * 为指定的Topic添加订阅者，订阅者信息来源为订阅用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSubscriptionFromSubscriptionUserRequest 请求对象
     * @return SyncInvoker<AddSubscriptionFromSubscriptionUserRequest, AddSubscriptionFromSubscriptionUserResponse>
     */
    public SyncInvoker<AddSubscriptionFromSubscriptionUserRequest, AddSubscriptionFromSubscriptionUserResponse> addSubscriptionFromSubscriptionUserInvoker(
        AddSubscriptionFromSubscriptionUserRequest request) {
        return new SyncInvoker<>(request, SmnMeta.addSubscriptionFromSubscriptionUser, hcClient);
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
     * @return BatchCreateOrDeleteResourceTagsResponse
     */
    public BatchCreateOrDeleteResourceTagsResponse batchCreateOrDeleteResourceTags(
        BatchCreateOrDeleteResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.batchCreateOrDeleteResourceTags);
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
     * @return SyncInvoker<BatchCreateOrDeleteResourceTagsRequest, BatchCreateOrDeleteResourceTagsResponse>
     */
    public SyncInvoker<BatchCreateOrDeleteResourceTagsRequest, BatchCreateOrDeleteResourceTagsResponse> batchCreateOrDeleteResourceTagsInvoker(
        BatchCreateOrDeleteResourceTagsRequest request) {
        return new SyncInvoker<>(request, SmnMeta.batchCreateOrDeleteResourceTags, hcClient);
    }

    /**
     * 批量创建订阅过滤策略
     *
     * 创建订阅者的消息过滤策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateSubscriptionsFilterPolicesRequest 请求对象
     * @return BatchCreateSubscriptionsFilterPolicesResponse
     */
    public BatchCreateSubscriptionsFilterPolicesResponse batchCreateSubscriptionsFilterPolices(
        BatchCreateSubscriptionsFilterPolicesRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.batchCreateSubscriptionsFilterPolices);
    }

    /**
     * 批量创建订阅过滤策略
     *
     * 创建订阅者的消息过滤策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateSubscriptionsFilterPolicesRequest 请求对象
     * @return SyncInvoker<BatchCreateSubscriptionsFilterPolicesRequest, BatchCreateSubscriptionsFilterPolicesResponse>
     */
    public SyncInvoker<BatchCreateSubscriptionsFilterPolicesRequest, BatchCreateSubscriptionsFilterPolicesResponse> batchCreateSubscriptionsFilterPolicesInvoker(
        BatchCreateSubscriptionsFilterPolicesRequest request) {
        return new SyncInvoker<>(request, SmnMeta.batchCreateSubscriptionsFilterPolices, hcClient);
    }

    /**
     * 批量删除订阅过滤策略
     *
     * 删除订阅者的消息过滤策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSubscriptionsFilterPolicesRequest 请求对象
     * @return BatchDeleteSubscriptionsFilterPolicesResponse
     */
    public BatchDeleteSubscriptionsFilterPolicesResponse batchDeleteSubscriptionsFilterPolices(
        BatchDeleteSubscriptionsFilterPolicesRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.batchDeleteSubscriptionsFilterPolices);
    }

    /**
     * 批量删除订阅过滤策略
     *
     * 删除订阅者的消息过滤策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteSubscriptionsFilterPolicesRequest 请求对象
     * @return SyncInvoker<BatchDeleteSubscriptionsFilterPolicesRequest, BatchDeleteSubscriptionsFilterPolicesResponse>
     */
    public SyncInvoker<BatchDeleteSubscriptionsFilterPolicesRequest, BatchDeleteSubscriptionsFilterPolicesResponse> batchDeleteSubscriptionsFilterPolicesInvoker(
        BatchDeleteSubscriptionsFilterPolicesRequest request) {
        return new SyncInvoker<>(request, SmnMeta.batchDeleteSubscriptionsFilterPolices, hcClient);
    }

    /**
     * 批量更新订阅过滤策略
     *
     * 更新订阅者的消息过滤策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateSubscriptionsFilterPolicesRequest 请求对象
     * @return BatchUpdateSubscriptionsFilterPolicesResponse
     */
    public BatchUpdateSubscriptionsFilterPolicesResponse batchUpdateSubscriptionsFilterPolices(
        BatchUpdateSubscriptionsFilterPolicesRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.batchUpdateSubscriptionsFilterPolices);
    }

    /**
     * 批量更新订阅过滤策略
     *
     * 更新订阅者的消息过滤策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateSubscriptionsFilterPolicesRequest 请求对象
     * @return SyncInvoker<BatchUpdateSubscriptionsFilterPolicesRequest, BatchUpdateSubscriptionsFilterPolicesResponse>
     */
    public SyncInvoker<BatchUpdateSubscriptionsFilterPolicesRequest, BatchUpdateSubscriptionsFilterPolicesResponse> batchUpdateSubscriptionsFilterPolicesInvoker(
        BatchUpdateSubscriptionsFilterPolicesRequest request) {
        return new SyncInvoker<>(request, SmnMeta.batchUpdateSubscriptionsFilterPolices, hcClient);
    }

    /**
     * 取消订阅
     *
     * 删除指定的订阅者。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelSubscriptionRequest 请求对象
     * @return CancelSubscriptionResponse
     */
    public CancelSubscriptionResponse cancelSubscription(CancelSubscriptionRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.cancelSubscription);
    }

    /**
     * 取消订阅
     *
     * 删除指定的订阅者。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelSubscriptionRequest 请求对象
     * @return SyncInvoker<CancelSubscriptionRequest, CancelSubscriptionResponse>
     */
    public SyncInvoker<CancelSubscriptionRequest, CancelSubscriptionResponse> cancelSubscriptionInvoker(
        CancelSubscriptionRequest request) {
        return new SyncInvoker<>(request, SmnMeta.cancelSubscription, hcClient);
    }

    /**
     * 绑定云日志
     *
     * 为指定Topic绑定一个云日志，用于记录主题消息发送状态等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLogtankRequest 请求对象
     * @return CreateLogtankResponse
     */
    public CreateLogtankResponse createLogtank(CreateLogtankRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.createLogtank);
    }

    /**
     * 绑定云日志
     *
     * 为指定Topic绑定一个云日志，用于记录主题消息发送状态等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLogtankRequest 请求对象
     * @return SyncInvoker<CreateLogtankRequest, CreateLogtankResponse>
     */
    public SyncInvoker<CreateLogtankRequest, CreateLogtankResponse> createLogtankInvoker(CreateLogtankRequest request) {
        return new SyncInvoker<>(request, SmnMeta.createLogtank, hcClient);
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
     * @return CreateMessageTemplateResponse
     */
    public CreateMessageTemplateResponse createMessageTemplate(CreateMessageTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.createMessageTemplate);
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
     * @return SyncInvoker<CreateMessageTemplateRequest, CreateMessageTemplateResponse>
     */
    public SyncInvoker<CreateMessageTemplateRequest, CreateMessageTemplateResponse> createMessageTemplateInvoker(
        CreateMessageTemplateRequest request) {
        return new SyncInvoker<>(request, SmnMeta.createMessageTemplate, hcClient);
    }

    /**
     * 创建通知策略
     *
     * 创建通知策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNotifyPolicyRequest 请求对象
     * @return CreateNotifyPolicyResponse
     */
    public CreateNotifyPolicyResponse createNotifyPolicy(CreateNotifyPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.createNotifyPolicy);
    }

    /**
     * 创建通知策略
     *
     * 创建通知策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNotifyPolicyRequest 请求对象
     * @return SyncInvoker<CreateNotifyPolicyRequest, CreateNotifyPolicyResponse>
     */
    public SyncInvoker<CreateNotifyPolicyRequest, CreateNotifyPolicyResponse> createNotifyPolicyInvoker(
        CreateNotifyPolicyRequest request) {
        return new SyncInvoker<>(request, SmnMeta.createNotifyPolicy, hcClient);
    }

    /**
     * 添加资源标签
     *
     * 一个资源上最多有10个标签。此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceTagRequest 请求对象
     * @return CreateResourceTagResponse
     */
    public CreateResourceTagResponse createResourceTag(CreateResourceTagRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.createResourceTag);
    }

    /**
     * 添加资源标签
     *
     * 一个资源上最多有10个标签。此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceTagRequest 请求对象
     * @return SyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse>
     */
    public SyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse> createResourceTagInvoker(
        CreateResourceTagRequest request) {
        return new SyncInvoker<>(request, SmnMeta.createResourceTag, hcClient);
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
     * @return CreateTopicResponse
     */
    public CreateTopicResponse createTopic(CreateTopicRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.createTopic);
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
     * @return SyncInvoker<CreateTopicRequest, CreateTopicResponse>
     */
    public SyncInvoker<CreateTopicRequest, CreateTopicResponse> createTopicInvoker(CreateTopicRequest request) {
        return new SyncInvoker<>(request, SmnMeta.createTopic, hcClient);
    }

    /**
     * 解绑云日志
     *
     * 解绑指定Topic绑定的云日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogtankRequest 请求对象
     * @return DeleteLogtankResponse
     */
    public DeleteLogtankResponse deleteLogtank(DeleteLogtankRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.deleteLogtank);
    }

    /**
     * 解绑云日志
     *
     * 解绑指定Topic绑定的云日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogtankRequest 请求对象
     * @return SyncInvoker<DeleteLogtankRequest, DeleteLogtankResponse>
     */
    public SyncInvoker<DeleteLogtankRequest, DeleteLogtankResponse> deleteLogtankInvoker(DeleteLogtankRequest request) {
        return new SyncInvoker<>(request, SmnMeta.deleteLogtank, hcClient);
    }

    /**
     * 删除消息模板
     *
     * 删除消息模板。删除模板之前的消息请求都可以使用该模板发送，删除之后无法再使用该模板发送消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMessageTemplateRequest 请求对象
     * @return DeleteMessageTemplateResponse
     */
    public DeleteMessageTemplateResponse deleteMessageTemplate(DeleteMessageTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.deleteMessageTemplate);
    }

    /**
     * 删除消息模板
     *
     * 删除消息模板。删除模板之前的消息请求都可以使用该模板发送，删除之后无法再使用该模板发送消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMessageTemplateRequest 请求对象
     * @return SyncInvoker<DeleteMessageTemplateRequest, DeleteMessageTemplateResponse>
     */
    public SyncInvoker<DeleteMessageTemplateRequest, DeleteMessageTemplateResponse> deleteMessageTemplateInvoker(
        DeleteMessageTemplateRequest request) {
        return new SyncInvoker<>(request, SmnMeta.deleteMessageTemplate, hcClient);
    }

    /**
     * 删除通知策略
     *
     * 删除通知策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNotifyPolicyRequest 请求对象
     * @return DeleteNotifyPolicyResponse
     */
    public DeleteNotifyPolicyResponse deleteNotifyPolicy(DeleteNotifyPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.deleteNotifyPolicy);
    }

    /**
     * 删除通知策略
     *
     * 删除通知策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNotifyPolicyRequest 请求对象
     * @return SyncInvoker<DeleteNotifyPolicyRequest, DeleteNotifyPolicyResponse>
     */
    public SyncInvoker<DeleteNotifyPolicyRequest, DeleteNotifyPolicyResponse> deleteNotifyPolicyInvoker(
        DeleteNotifyPolicyRequest request) {
        return new SyncInvoker<>(request, SmnMeta.deleteNotifyPolicy, hcClient);
    }

    /**
     * 删除资源标签
     *
     * 幂等接口：删除时，不对标签做校验。删除的key不存在报404，key不能为空或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceTagRequest 请求对象
     * @return DeleteResourceTagResponse
     */
    public DeleteResourceTagResponse deleteResourceTag(DeleteResourceTagRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.deleteResourceTag);
    }

    /**
     * 删除资源标签
     *
     * 幂等接口：删除时，不对标签做校验。删除的key不存在报404，key不能为空或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceTagRequest 请求对象
     * @return SyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse>
     */
    public SyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse> deleteResourceTagInvoker(
        DeleteResourceTagRequest request) {
        return new SyncInvoker<>(request, SmnMeta.deleteResourceTag, hcClient);
    }

    /**
     * 删除主题
     *
     * 删除主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTopicRequest 请求对象
     * @return DeleteTopicResponse
     */
    public DeleteTopicResponse deleteTopic(DeleteTopicRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.deleteTopic);
    }

    /**
     * 删除主题
     *
     * 删除主题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTopicRequest 请求对象
     * @return SyncInvoker<DeleteTopicRequest, DeleteTopicResponse>
     */
    public SyncInvoker<DeleteTopicRequest, DeleteTopicResponse> deleteTopicInvoker(DeleteTopicRequest request) {
        return new SyncInvoker<>(request, SmnMeta.deleteTopic, hcClient);
    }

    /**
     * 删除指定名称的主题策略
     *
     * 删除指定名称的主题策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTopicAttributeByNameRequest 请求对象
     * @return DeleteTopicAttributeByNameResponse
     */
    public DeleteTopicAttributeByNameResponse deleteTopicAttributeByName(DeleteTopicAttributeByNameRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.deleteTopicAttributeByName);
    }

    /**
     * 删除指定名称的主题策略
     *
     * 删除指定名称的主题策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTopicAttributeByNameRequest 请求对象
     * @return SyncInvoker<DeleteTopicAttributeByNameRequest, DeleteTopicAttributeByNameResponse>
     */
    public SyncInvoker<DeleteTopicAttributeByNameRequest, DeleteTopicAttributeByNameResponse> deleteTopicAttributeByNameInvoker(
        DeleteTopicAttributeByNameRequest request) {
        return new SyncInvoker<>(request, SmnMeta.deleteTopicAttributeByName, hcClient);
    }

    /**
     * 删除所有主题策略
     *
     * 删除所有主题策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTopicAttributesRequest 请求对象
     * @return DeleteTopicAttributesResponse
     */
    public DeleteTopicAttributesResponse deleteTopicAttributes(DeleteTopicAttributesRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.deleteTopicAttributes);
    }

    /**
     * 删除所有主题策略
     *
     * 删除所有主题策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTopicAttributesRequest 请求对象
     * @return SyncInvoker<DeleteTopicAttributesRequest, DeleteTopicAttributesResponse>
     */
    public SyncInvoker<DeleteTopicAttributesRequest, DeleteTopicAttributesResponse> deleteTopicAttributesInvoker(
        DeleteTopicAttributesRequest request) {
        return new SyncInvoker<>(request, SmnMeta.deleteTopicAttributes, hcClient);
    }

    /**
     * 查询云日志
     *
     * 查询指定Topic绑定的云日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogtankRequest 请求对象
     * @return ListLogtankResponse
     */
    public ListLogtankResponse listLogtank(ListLogtankRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listLogtank);
    }

    /**
     * 查询云日志
     *
     * 查询指定Topic绑定的云日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogtankRequest 请求对象
     * @return SyncInvoker<ListLogtankRequest, ListLogtankResponse>
     */
    public SyncInvoker<ListLogtankRequest, ListLogtankResponse> listLogtankInvoker(ListLogtankRequest request) {
        return new SyncInvoker<>(request, SmnMeta.listLogtank, hcClient);
    }

    /**
     * 查询消息模板详情
     *
     * 查询模板详情，包括模板内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessageTemplateDetailsRequest 请求对象
     * @return ListMessageTemplateDetailsResponse
     */
    public ListMessageTemplateDetailsResponse listMessageTemplateDetails(ListMessageTemplateDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listMessageTemplateDetails);
    }

    /**
     * 查询消息模板详情
     *
     * 查询模板详情，包括模板内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessageTemplateDetailsRequest 请求对象
     * @return SyncInvoker<ListMessageTemplateDetailsRequest, ListMessageTemplateDetailsResponse>
     */
    public SyncInvoker<ListMessageTemplateDetailsRequest, ListMessageTemplateDetailsResponse> listMessageTemplateDetailsInvoker(
        ListMessageTemplateDetailsRequest request) {
        return new SyncInvoker<>(request, SmnMeta.listMessageTemplateDetails, hcClient);
    }

    /**
     * 查询消息模板列表
     *
     * 分页查询模板列表，模板列表按照创建时间进行升序排列。分页查询可以指定offset以及limit。如果不存在模板，则返回空列表。额外的查询参数分别有message_template_name和protocol。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessageTemplatesRequest 请求对象
     * @return ListMessageTemplatesResponse
     */
    public ListMessageTemplatesResponse listMessageTemplates(ListMessageTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listMessageTemplates);
    }

    /**
     * 查询消息模板列表
     *
     * 分页查询模板列表，模板列表按照创建时间进行升序排列。分页查询可以指定offset以及limit。如果不存在模板，则返回空列表。额外的查询参数分别有message_template_name和protocol。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMessageTemplatesRequest 请求对象
     * @return SyncInvoker<ListMessageTemplatesRequest, ListMessageTemplatesResponse>
     */
    public SyncInvoker<ListMessageTemplatesRequest, ListMessageTemplatesResponse> listMessageTemplatesInvoker(
        ListMessageTemplatesRequest request) {
        return new SyncInvoker<>(request, SmnMeta.listMessageTemplates, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询租户在指定Region和实例类型的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return ListProjectTagsResponse
     */
    public ListProjectTagsResponse listProjectTags(ListProjectTagsRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询租户在指定Region和实例类型的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsInvoker(
        ListProjectTagsRequest request) {
        return new SyncInvoker<>(request, SmnMeta.listProjectTags, hcClient);
    }

    /**
     * 查询资源实例
     *
     * 使用标签过滤实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceInstancesRequest 请求对象
     * @return ListResourceInstancesResponse
     */
    public ListResourceInstancesResponse listResourceInstances(ListResourceInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listResourceInstances);
    }

    /**
     * 查询资源实例
     *
     * 使用标签过滤实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceInstancesRequest 请求对象
     * @return SyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse>
     */
    public SyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse> listResourceInstancesInvoker(
        ListResourceInstancesRequest request) {
        return new SyncInvoker<>(request, SmnMeta.listResourceInstances, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceTagsRequest 请求对象
     * @return ListResourceTagsResponse
     */
    public ListResourceTagsResponse listResourceTags(ListResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listResourceTags);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceTagsRequest 请求对象
     * @return SyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse>
     */
    public SyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse> listResourceTagsInvoker(
        ListResourceTagsRequest request) {
        return new SyncInvoker<>(request, SmnMeta.listResourceTags, hcClient);
    }

    /**
     * 查询订阅者列表
     *
     * 分页返回请求者的所有的订阅列表，订阅列表按照订阅创建时间进行升序排列。分页查询可以指定offset以及limit。如果订阅者不存在，返回空列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubscriptionsRequest 请求对象
     * @return ListSubscriptionsResponse
     */
    public ListSubscriptionsResponse listSubscriptions(ListSubscriptionsRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listSubscriptions);
    }

    /**
     * 查询订阅者列表
     *
     * 分页返回请求者的所有的订阅列表，订阅列表按照订阅创建时间进行升序排列。分页查询可以指定offset以及limit。如果订阅者不存在，返回空列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubscriptionsRequest 请求对象
     * @return SyncInvoker<ListSubscriptionsRequest, ListSubscriptionsResponse>
     */
    public SyncInvoker<ListSubscriptionsRequest, ListSubscriptionsResponse> listSubscriptionsInvoker(
        ListSubscriptionsRequest request) {
        return new SyncInvoker<>(request, SmnMeta.listSubscriptions, hcClient);
    }

    /**
     * 查询指定Topic的订阅者列表
     *
     * 分页获取特定Topic的订阅列表，订阅列表按照订阅创建时间进行升序排列。分页查询可以指定offset以及limit。如果指定Topic不存在订阅者，返回空列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubscriptionsByTopicRequest 请求对象
     * @return ListSubscriptionsByTopicResponse
     */
    public ListSubscriptionsByTopicResponse listSubscriptionsByTopic(ListSubscriptionsByTopicRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listSubscriptionsByTopic);
    }

    /**
     * 查询指定Topic的订阅者列表
     *
     * 分页获取特定Topic的订阅列表，订阅列表按照订阅创建时间进行升序排列。分页查询可以指定offset以及limit。如果指定Topic不存在订阅者，返回空列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubscriptionsByTopicRequest 请求对象
     * @return SyncInvoker<ListSubscriptionsByTopicRequest, ListSubscriptionsByTopicResponse>
     */
    public SyncInvoker<ListSubscriptionsByTopicRequest, ListSubscriptionsByTopicResponse> listSubscriptionsByTopicInvoker(
        ListSubscriptionsByTopicRequest request) {
        return new SyncInvoker<>(request, SmnMeta.listSubscriptionsByTopic, hcClient);
    }

    /**
     * 查询主题策略
     *
     * 查询主题的策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopicAttributesRequest 请求对象
     * @return ListTopicAttributesResponse
     */
    public ListTopicAttributesResponse listTopicAttributes(ListTopicAttributesRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listTopicAttributes);
    }

    /**
     * 查询主题策略
     *
     * 查询主题的策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopicAttributesRequest 请求对象
     * @return SyncInvoker<ListTopicAttributesRequest, ListTopicAttributesResponse>
     */
    public SyncInvoker<ListTopicAttributesRequest, ListTopicAttributesResponse> listTopicAttributesInvoker(
        ListTopicAttributesRequest request) {
        return new SyncInvoker<>(request, SmnMeta.listTopicAttributes, hcClient);
    }

    /**
     * 查询主题详情
     *
     * 查询Topic的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopicDetailsRequest 请求对象
     * @return ListTopicDetailsResponse
     */
    public ListTopicDetailsResponse listTopicDetails(ListTopicDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listTopicDetails);
    }

    /**
     * 查询主题详情
     *
     * 查询Topic的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopicDetailsRequest 请求对象
     * @return SyncInvoker<ListTopicDetailsRequest, ListTopicDetailsResponse>
     */
    public SyncInvoker<ListTopicDetailsRequest, ListTopicDetailsResponse> listTopicDetailsInvoker(
        ListTopicDetailsRequest request) {
        return new SyncInvoker<>(request, SmnMeta.listTopicDetails, hcClient);
    }

    /**
     * 查询主题的发送详情
     *
     * 查询Topic的发送数据详情，最多支持查询31天内所有计量数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopicMessageStatisticsRequest 请求对象
     * @return ListTopicMessageStatisticsResponse
     */
    public ListTopicMessageStatisticsResponse listTopicMessageStatistics(ListTopicMessageStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listTopicMessageStatistics);
    }

    /**
     * 查询主题的发送详情
     *
     * 查询Topic的发送数据详情，最多支持查询31天内所有计量数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopicMessageStatisticsRequest 请求对象
     * @return SyncInvoker<ListTopicMessageStatisticsRequest, ListTopicMessageStatisticsResponse>
     */
    public SyncInvoker<ListTopicMessageStatisticsRequest, ListTopicMessageStatisticsResponse> listTopicMessageStatisticsInvoker(
        ListTopicMessageStatisticsRequest request) {
        return new SyncInvoker<>(request, SmnMeta.listTopicMessageStatistics, hcClient);
    }

    /**
     * 查询主题列表
     *
     * 分页查询Topic列表，Topic列表按照Topic创建时间进行降序排列。分页查询可以指定offset以及limit。如果不存在Topic，则返回空列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopicsRequest 请求对象
     * @return ListTopicsResponse
     */
    public ListTopicsResponse listTopics(ListTopicsRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listTopics);
    }

    /**
     * 查询主题列表
     *
     * 分页查询Topic列表，Topic列表按照Topic创建时间进行降序排列。分页查询可以指定offset以及limit。如果不存在Topic，则返回空列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopicsRequest 请求对象
     * @return SyncInvoker<ListTopicsRequest, ListTopicsResponse>
     */
    public SyncInvoker<ListTopicsRequest, ListTopicsResponse> listTopicsInvoker(ListTopicsRequest request) {
        return new SyncInvoker<>(request, SmnMeta.listTopics, hcClient);
    }

    /**
     * 查询SMN API V2版本信息
     *
     * 查询SMN API V2版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVersionRequest 请求对象
     * @return ListVersionResponse
     */
    public ListVersionResponse listVersion(ListVersionRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listVersion);
    }

    /**
     * 查询SMN API V2版本信息
     *
     * 查询SMN API V2版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVersionRequest 请求对象
     * @return SyncInvoker<ListVersionRequest, ListVersionResponse>
     */
    public SyncInvoker<ListVersionRequest, ListVersionResponse> listVersionInvoker(ListVersionRequest request) {
        return new SyncInvoker<>(request, SmnMeta.listVersion, hcClient);
    }

    /**
     * 查询SMN支持的API版本号信息
     *
     * 查询SMN开放API支持的版本号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVersionsRequest 请求对象
     * @return ListVersionsResponse
     */
    public ListVersionsResponse listVersions(ListVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listVersions);
    }

    /**
     * 查询SMN支持的API版本号信息
     *
     * 查询SMN开放API支持的版本号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVersionsRequest 请求对象
     * @return SyncInvoker<ListVersionsRequest, ListVersionsResponse>
     */
    public SyncInvoker<ListVersionsRequest, ListVersionsResponse> listVersionsInvoker(ListVersionsRequest request) {
        return new SyncInvoker<>(request, SmnMeta.listVersions, hcClient);
    }

    /**
     * 发布探测消息
     *
     * 基于主题发送http/https探测消息，探测当前http/https 终端是否可用，SMN出口是否能够正常访问该终端。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishHttpDetectRequest 请求对象
     * @return PublishHttpDetectResponse
     */
    public PublishHttpDetectResponse publishHttpDetect(PublishHttpDetectRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.publishHttpDetect);
    }

    /**
     * 发布探测消息
     *
     * 基于主题发送http/https探测消息，探测当前http/https 终端是否可用，SMN出口是否能够正常访问该终端。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishHttpDetectRequest 请求对象
     * @return SyncInvoker<PublishHttpDetectRequest, PublishHttpDetectResponse>
     */
    public SyncInvoker<PublishHttpDetectRequest, PublishHttpDetectResponse> publishHttpDetectInvoker(
        PublishHttpDetectRequest request) {
        return new SyncInvoker<>(request, SmnMeta.publishHttpDetect, hcClient);
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
     * @return PublishMessageResponse
     */
    public PublishMessageResponse publishMessage(PublishMessageRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.publishMessage);
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
     * @return SyncInvoker<PublishMessageRequest, PublishMessageResponse>
     */
    public SyncInvoker<PublishMessageRequest, PublishMessageResponse> publishMessageInvoker(
        PublishMessageRequest request) {
        return new SyncInvoker<>(request, SmnMeta.publishMessage, hcClient);
    }

    /**
     * 获取http探测结果
     *
     * 根据http探测发送返回的task_id查询探测结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpDetectResultRequest 请求对象
     * @return ShowHttpDetectResultResponse
     */
    public ShowHttpDetectResultResponse showHttpDetectResult(ShowHttpDetectResultRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.showHttpDetectResult);
    }

    /**
     * 获取http探测结果
     *
     * 根据http探测发送返回的task_id查询探测结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpDetectResultRequest 请求对象
     * @return SyncInvoker<ShowHttpDetectResultRequest, ShowHttpDetectResultResponse>
     */
    public SyncInvoker<ShowHttpDetectResultRequest, ShowHttpDetectResultResponse> showHttpDetectResultInvoker(
        ShowHttpDetectResultRequest request) {
        return new SyncInvoker<>(request, SmnMeta.showHttpDetectResult, hcClient);
    }

    /**
     * 查询通知策略
     *
     * 查询通知策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNotifyPolicyRequest 请求对象
     * @return ShowNotifyPolicyResponse
     */
    public ShowNotifyPolicyResponse showNotifyPolicy(ShowNotifyPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.showNotifyPolicy);
    }

    /**
     * 查询通知策略
     *
     * 查询通知策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNotifyPolicyRequest 请求对象
     * @return SyncInvoker<ShowNotifyPolicyRequest, ShowNotifyPolicyResponse>
     */
    public SyncInvoker<ShowNotifyPolicyRequest, ShowNotifyPolicyResponse> showNotifyPolicyInvoker(
        ShowNotifyPolicyRequest request) {
        return new SyncInvoker<>(request, SmnMeta.showNotifyPolicy, hcClient);
    }

    /**
     * 更新云日志
     *
     * 更新指定Topic绑定的云日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLogtankRequest 请求对象
     * @return UpdateLogtankResponse
     */
    public UpdateLogtankResponse updateLogtank(UpdateLogtankRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.updateLogtank);
    }

    /**
     * 更新云日志
     *
     * 更新指定Topic绑定的云日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLogtankRequest 请求对象
     * @return SyncInvoker<UpdateLogtankRequest, UpdateLogtankResponse>
     */
    public SyncInvoker<UpdateLogtankRequest, UpdateLogtankResponse> updateLogtankInvoker(UpdateLogtankRequest request) {
        return new SyncInvoker<>(request, SmnMeta.updateLogtank, hcClient);
    }

    /**
     * 更新消息模板
     *
     * 修改消息模板的内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMessageTemplateRequest 请求对象
     * @return UpdateMessageTemplateResponse
     */
    public UpdateMessageTemplateResponse updateMessageTemplate(UpdateMessageTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.updateMessageTemplate);
    }

    /**
     * 更新消息模板
     *
     * 修改消息模板的内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMessageTemplateRequest 请求对象
     * @return SyncInvoker<UpdateMessageTemplateRequest, UpdateMessageTemplateResponse>
     */
    public SyncInvoker<UpdateMessageTemplateRequest, UpdateMessageTemplateResponse> updateMessageTemplateInvoker(
        UpdateMessageTemplateRequest request) {
        return new SyncInvoker<>(request, SmnMeta.updateMessageTemplate, hcClient);
    }

    /**
     * 修改通知策略
     *
     * 修改通知策略，该接口仅支持全量修改，不支持部分修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNotifyPolicyRequest 请求对象
     * @return UpdateNotifyPolicyResponse
     */
    public UpdateNotifyPolicyResponse updateNotifyPolicy(UpdateNotifyPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.updateNotifyPolicy);
    }

    /**
     * 修改通知策略
     *
     * 修改通知策略，该接口仅支持全量修改，不支持部分修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNotifyPolicyRequest 请求对象
     * @return SyncInvoker<UpdateNotifyPolicyRequest, UpdateNotifyPolicyResponse>
     */
    public SyncInvoker<UpdateNotifyPolicyRequest, UpdateNotifyPolicyResponse> updateNotifyPolicyInvoker(
        UpdateNotifyPolicyRequest request) {
        return new SyncInvoker<>(request, SmnMeta.updateNotifyPolicy, hcClient);
    }

    /**
     * 更新订阅者
     *
     * 更新订阅者备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubscriptionRequest 请求对象
     * @return UpdateSubscriptionResponse
     */
    public UpdateSubscriptionResponse updateSubscription(UpdateSubscriptionRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.updateSubscription);
    }

    /**
     * 更新订阅者
     *
     * 更新订阅者备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubscriptionRequest 请求对象
     * @return SyncInvoker<UpdateSubscriptionRequest, UpdateSubscriptionResponse>
     */
    public SyncInvoker<UpdateSubscriptionRequest, UpdateSubscriptionResponse> updateSubscriptionInvoker(
        UpdateSubscriptionRequest request) {
        return new SyncInvoker<>(request, SmnMeta.updateSubscription, hcClient);
    }

    /**
     * 更新主题
     *
     * 更新显示名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTopicRequest 请求对象
     * @return UpdateTopicResponse
     */
    public UpdateTopicResponse updateTopic(UpdateTopicRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.updateTopic);
    }

    /**
     * 更新主题
     *
     * 更新显示名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTopicRequest 请求对象
     * @return SyncInvoker<UpdateTopicRequest, UpdateTopicResponse>
     */
    public SyncInvoker<UpdateTopicRequest, UpdateTopicResponse> updateTopicInvoker(UpdateTopicRequest request) {
        return new SyncInvoker<>(request, SmnMeta.updateTopic, hcClient);
    }

    /**
     * 更新主题策略
     *
     * 更新主题的策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTopicAttributeRequest 请求对象
     * @return UpdateTopicAttributeResponse
     */
    public UpdateTopicAttributeResponse updateTopicAttribute(UpdateTopicAttributeRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.updateTopicAttribute);
    }

    /**
     * 更新主题策略
     *
     * 更新主题的策略信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTopicAttributeRequest 请求对象
     * @return SyncInvoker<UpdateTopicAttributeRequest, UpdateTopicAttributeResponse>
     */
    public SyncInvoker<UpdateTopicAttributeRequest, UpdateTopicAttributeResponse> updateTopicAttributeInvoker(
        UpdateTopicAttributeRequest request) {
        return new SyncInvoker<>(request, SmnMeta.updateTopicAttribute, hcClient);
    }

    /**
     * 创建Application
     *
     * 创建平台应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApplicationRequest 请求对象
     * @return CreateApplicationResponse
     */
    @Deprecated
    public CreateApplicationResponse createApplication(CreateApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.createApplication);
    }

    /**
     * 创建Application
     *
     * 创建平台应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApplicationRequest 请求对象
     * @return SyncInvoker<CreateApplicationRequest, CreateApplicationResponse>
     */
    @Deprecated
    public SyncInvoker<CreateApplicationRequest, CreateApplicationResponse> createApplicationInvoker(
        CreateApplicationRequest request) {
        return new SyncInvoker<>(request, SmnMeta.createApplication, hcClient);
    }

    /**
     * 删除Application
     *
     * 删除平台应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationRequest 请求对象
     * @return DeleteApplicationResponse
     */
    @Deprecated
    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.deleteApplication);
    }

    /**
     * 删除Application
     *
     * 删除平台应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationRequest 请求对象
     * @return SyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse>
     */
    @Deprecated
    public SyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse> deleteApplicationInvoker(
        DeleteApplicationRequest request) {
        return new SyncInvoker<>(request, SmnMeta.deleteApplication, hcClient);
    }

    /**
     * 查询Application属性
     *
     * 获取应用平台属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationAttributesRequest 请求对象
     * @return ListApplicationAttributesResponse
     */
    @Deprecated
    public ListApplicationAttributesResponse listApplicationAttributes(ListApplicationAttributesRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listApplicationAttributes);
    }

    /**
     * 查询Application属性
     *
     * 获取应用平台属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationAttributesRequest 请求对象
     * @return SyncInvoker<ListApplicationAttributesRequest, ListApplicationAttributesResponse>
     */
    @Deprecated
    public SyncInvoker<ListApplicationAttributesRequest, ListApplicationAttributesResponse> listApplicationAttributesInvoker(
        ListApplicationAttributesRequest request) {
        return new SyncInvoker<>(request, SmnMeta.listApplicationAttributes, hcClient);
    }

    /**
     * 查询Application
     *
     * 查询应用平台列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationsRequest 请求对象
     * @return ListApplicationsResponse
     */
    @Deprecated
    public ListApplicationsResponse listApplications(ListApplicationsRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listApplications);
    }

    /**
     * 查询Application
     *
     * 查询应用平台列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationsRequest 请求对象
     * @return SyncInvoker<ListApplicationsRequest, ListApplicationsResponse>
     */
    @Deprecated
    public SyncInvoker<ListApplicationsRequest, ListApplicationsResponse> listApplicationsInvoker(
        ListApplicationsRequest request) {
        return new SyncInvoker<>(request, SmnMeta.listApplications, hcClient);
    }

    /**
     * App消息发布
     *
     * 将消息直发给endpoint设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishAppMessageRequest 请求对象
     * @return PublishAppMessageResponse
     */
    @Deprecated
    public PublishAppMessageResponse publishAppMessage(PublishAppMessageRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.publishAppMessage);
    }

    /**
     * App消息发布
     *
     * 将消息直发给endpoint设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishAppMessageRequest 请求对象
     * @return SyncInvoker<PublishAppMessageRequest, PublishAppMessageResponse>
     */
    @Deprecated
    public SyncInvoker<PublishAppMessageRequest, PublishAppMessageResponse> publishAppMessageInvoker(
        PublishAppMessageRequest request) {
        return new SyncInvoker<>(request, SmnMeta.publishAppMessage, hcClient);
    }

    /**
     * 更新Application
     *
     * 更新应用平台。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationRequest 请求对象
     * @return UpdateApplicationResponse
     */
    @Deprecated
    public UpdateApplicationResponse updateApplication(UpdateApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.updateApplication);
    }

    /**
     * 更新Application
     *
     * 更新应用平台。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationRequest 请求对象
     * @return SyncInvoker<UpdateApplicationRequest, UpdateApplicationResponse>
     */
    @Deprecated
    public SyncInvoker<UpdateApplicationRequest, UpdateApplicationResponse> updateApplicationInvoker(
        UpdateApplicationRequest request) {
        return new SyncInvoker<>(request, SmnMeta.updateApplication, hcClient);
    }

    /**
     * 创建Application endpoint
     *
     * 创建应用平台的endpoint终端。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApplicationEndpointRequest 请求对象
     * @return CreateApplicationEndpointResponse
     */
    @Deprecated
    public CreateApplicationEndpointResponse createApplicationEndpoint(CreateApplicationEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.createApplicationEndpoint);
    }

    /**
     * 创建Application endpoint
     *
     * 创建应用平台的endpoint终端。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApplicationEndpointRequest 请求对象
     * @return SyncInvoker<CreateApplicationEndpointRequest, CreateApplicationEndpointResponse>
     */
    @Deprecated
    public SyncInvoker<CreateApplicationEndpointRequest, CreateApplicationEndpointResponse> createApplicationEndpointInvoker(
        CreateApplicationEndpointRequest request) {
        return new SyncInvoker<>(request, SmnMeta.createApplicationEndpoint, hcClient);
    }

    /**
     * 删除Application endpoint
     *
     * 删除设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationEndpointRequest 请求对象
     * @return DeleteApplicationEndpointResponse
     */
    @Deprecated
    public DeleteApplicationEndpointResponse deleteApplicationEndpoint(DeleteApplicationEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.deleteApplicationEndpoint);
    }

    /**
     * 删除Application endpoint
     *
     * 删除设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationEndpointRequest 请求对象
     * @return SyncInvoker<DeleteApplicationEndpointRequest, DeleteApplicationEndpointResponse>
     */
    @Deprecated
    public SyncInvoker<DeleteApplicationEndpointRequest, DeleteApplicationEndpointResponse> deleteApplicationEndpointInvoker(
        DeleteApplicationEndpointRequest request) {
        return new SyncInvoker<>(request, SmnMeta.deleteApplicationEndpoint, hcClient);
    }

    /**
     * 查询Application的Endpoint属性
     *
     * 获取endpoint的属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationEndpointAttributesRequest 请求对象
     * @return ListApplicationEndpointAttributesResponse
     */
    @Deprecated
    public ListApplicationEndpointAttributesResponse listApplicationEndpointAttributes(
        ListApplicationEndpointAttributesRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listApplicationEndpointAttributes);
    }

    /**
     * 查询Application的Endpoint属性
     *
     * 获取endpoint的属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationEndpointAttributesRequest 请求对象
     * @return SyncInvoker<ListApplicationEndpointAttributesRequest, ListApplicationEndpointAttributesResponse>
     */
    @Deprecated
    public SyncInvoker<ListApplicationEndpointAttributesRequest, ListApplicationEndpointAttributesResponse> listApplicationEndpointAttributesInvoker(
        ListApplicationEndpointAttributesRequest request) {
        return new SyncInvoker<>(request, SmnMeta.listApplicationEndpointAttributes, hcClient);
    }

    /**
     * 查询Application的Endpoint列表
     *
     * 查询平台的endpoint列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationEndpointsRequest 请求对象
     * @return ListApplicationEndpointsResponse
     */
    @Deprecated
    public ListApplicationEndpointsResponse listApplicationEndpoints(ListApplicationEndpointsRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listApplicationEndpoints);
    }

    /**
     * 查询Application的Endpoint列表
     *
     * 查询平台的endpoint列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicationEndpointsRequest 请求对象
     * @return SyncInvoker<ListApplicationEndpointsRequest, ListApplicationEndpointsResponse>
     */
    @Deprecated
    public SyncInvoker<ListApplicationEndpointsRequest, ListApplicationEndpointsResponse> listApplicationEndpointsInvoker(
        ListApplicationEndpointsRequest request) {
        return new SyncInvoker<>(request, SmnMeta.listApplicationEndpoints, hcClient);
    }

    /**
     * 更新Application endpoint
     *
     * 更新设备属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationEndpointRequest 请求对象
     * @return UpdateApplicationEndpointResponse
     */
    @Deprecated
    public UpdateApplicationEndpointResponse updateApplicationEndpoint(UpdateApplicationEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.updateApplicationEndpoint);
    }

    /**
     * 更新Application endpoint
     *
     * 更新设备属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationEndpointRequest 请求对象
     * @return SyncInvoker<UpdateApplicationEndpointRequest, UpdateApplicationEndpointResponse>
     */
    @Deprecated
    public SyncInvoker<UpdateApplicationEndpointRequest, UpdateApplicationEndpointResponse> updateApplicationEndpointInvoker(
        UpdateApplicationEndpointRequest request) {
        return new SyncInvoker<>(request, SmnMeta.updateApplicationEndpoint, hcClient);
    }

}

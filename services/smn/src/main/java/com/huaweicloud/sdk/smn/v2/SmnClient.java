package com.huaweicloud.sdk.smn.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.smn.v2.model.*;

public class SmnClient {

    protected HcClient hcClient;

    public SmnClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SmnClient> newBuilder() {
        return new ClientBuilder<>(SmnClient::new);
    }

    /** 订阅
     * 为指定Topic添加一个订阅者，如果订阅者的状态为未确认，则向订阅者发送一个确认的消息。待订阅者进行ConfirmSubscription确认后，该订阅者才能收到Topic发布的消息。单Topic默认可添加10000个订阅者，高并发场景下，可能会出现订阅者数量超过10000仍添加成功的情况，此为正常现象。接口是幂等的，如果添加已存在的订阅者，则返回成功，且status
     * code为200，否则status code为201。
     *
     * @param AddSubscriptionRequest 请求对象
     * @return AddSubscriptionResponse */
    public AddSubscriptionResponse addSubscription(AddSubscriptionRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.addSubscription);
    }

    /** 订阅
     * 为指定Topic添加一个订阅者，如果订阅者的状态为未确认，则向订阅者发送一个确认的消息。待订阅者进行ConfirmSubscription确认后，该订阅者才能收到Topic发布的消息。单Topic默认可添加10000个订阅者，高并发场景下，可能会出现订阅者数量超过10000仍添加成功的情况，此为正常现象。接口是幂等的，如果添加已存在的订阅者，则返回成功，且status
     * code为200，否则status code为201。
     *
     * @param AddSubscriptionRequest 请求对象
     * @return SyncInvoker<AddSubscriptionRequest, AddSubscriptionResponse> */
    public SyncInvoker<AddSubscriptionRequest, AddSubscriptionResponse> addSubscriptionInvoker(
        AddSubscriptionRequest request) {
        return new SyncInvoker<AddSubscriptionRequest, AddSubscriptionResponse>(request, SmnMeta.addSubscription,
            hcClient);
    }

    /** 批量添加删除资源标签 为指定实例批量添加或删除标签。一个资源上最多有10个标签。 此接口为幂等接口：创建时如果请求体中存在重复key则报错。 创建时，不允许重复key，如果数据库存在就覆盖。
     * 删除时，如果删除的标签不存在，默认处理成功，删除时不对标签字符集范围做校验。
     *
     * @param BatchCreateOrDeleteResourceTagsRequest 请求对象
     * @return BatchCreateOrDeleteResourceTagsResponse */
    public BatchCreateOrDeleteResourceTagsResponse batchCreateOrDeleteResourceTags(
        BatchCreateOrDeleteResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.batchCreateOrDeleteResourceTags);
    }

    /** 批量添加删除资源标签 为指定实例批量添加或删除标签。一个资源上最多有10个标签。 此接口为幂等接口：创建时如果请求体中存在重复key则报错。 创建时，不允许重复key，如果数据库存在就覆盖。
     * 删除时，如果删除的标签不存在，默认处理成功，删除时不对标签字符集范围做校验。
     *
     * @param BatchCreateOrDeleteResourceTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateOrDeleteResourceTagsRequest, BatchCreateOrDeleteResourceTagsResponse> */
    public SyncInvoker<BatchCreateOrDeleteResourceTagsRequest, BatchCreateOrDeleteResourceTagsResponse> batchCreateOrDeleteResourceTagsInvoker(
        BatchCreateOrDeleteResourceTagsRequest request) {
        return new SyncInvoker<BatchCreateOrDeleteResourceTagsRequest, BatchCreateOrDeleteResourceTagsResponse>(request,
            SmnMeta.batchCreateOrDeleteResourceTags, hcClient);
    }

    /** 取消订阅 删除指定的订阅者。
     *
     * @param CancelSubscriptionRequest 请求对象
     * @return CancelSubscriptionResponse */
    public CancelSubscriptionResponse cancelSubscription(CancelSubscriptionRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.cancelSubscription);
    }

    /** 取消订阅 删除指定的订阅者。
     *
     * @param CancelSubscriptionRequest 请求对象
     * @return SyncInvoker<CancelSubscriptionRequest, CancelSubscriptionResponse> */
    public SyncInvoker<CancelSubscriptionRequest, CancelSubscriptionResponse> cancelSubscriptionInvoker(
        CancelSubscriptionRequest request) {
        return new SyncInvoker<CancelSubscriptionRequest, CancelSubscriptionResponse>(request,
            SmnMeta.cancelSubscription, hcClient);
    }

    /** 创建消息模板 创建一个模板，用户可以按照模板去发送消息，这样可以减少请求的数据量。 单用户默认可创建100个消息模板，高并发场景下，可能会出现消息模板数量超过100仍创建成功的情况，此为正常现象。
     *
     * @param CreateMessageTemplateRequest 请求对象
     * @return CreateMessageTemplateResponse */
    public CreateMessageTemplateResponse createMessageTemplate(CreateMessageTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.createMessageTemplate);
    }

    /** 创建消息模板 创建一个模板，用户可以按照模板去发送消息，这样可以减少请求的数据量。 单用户默认可创建100个消息模板，高并发场景下，可能会出现消息模板数量超过100仍创建成功的情况，此为正常现象。
     *
     * @param CreateMessageTemplateRequest 请求对象
     * @return SyncInvoker<CreateMessageTemplateRequest, CreateMessageTemplateResponse> */
    public SyncInvoker<CreateMessageTemplateRequest, CreateMessageTemplateResponse> createMessageTemplateInvoker(
        CreateMessageTemplateRequest request) {
        return new SyncInvoker<CreateMessageTemplateRequest, CreateMessageTemplateResponse>(request,
            SmnMeta.createMessageTemplate, hcClient);
    }

    /** 添加资源标签 一个资源上最多有10个标签。此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     *
     * @param CreateResourceTagRequest 请求对象
     * @return CreateResourceTagResponse */
    public CreateResourceTagResponse createResourceTag(CreateResourceTagRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.createResourceTag);
    }

    /** 添加资源标签 一个资源上最多有10个标签。此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     *
     * @param CreateResourceTagRequest 请求对象
     * @return SyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse> */
    public SyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse> createResourceTagInvoker(
        CreateResourceTagRequest request) {
        return new SyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse>(request, SmnMeta.createResourceTag,
            hcClient);
    }

    /** 创建主题 创建Topic，单用户默认配额为3000。高并发场景下，可能会出现Topic数量超过3000仍创建成功的情况，此为正常现象。 接口是幂等的，接口调用返回成功时，若已存在同名的Topic，返回的status
     * code为200，否则返回的status code为201
     *
     * @param CreateTopicRequest 请求对象
     * @return CreateTopicResponse */
    public CreateTopicResponse createTopic(CreateTopicRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.createTopic);
    }

    /** 创建主题 创建Topic，单用户默认配额为3000。高并发场景下，可能会出现Topic数量超过3000仍创建成功的情况，此为正常现象。 接口是幂等的，接口调用返回成功时，若已存在同名的Topic，返回的status
     * code为200，否则返回的status code为201
     *
     * @param CreateTopicRequest 请求对象
     * @return SyncInvoker<CreateTopicRequest, CreateTopicResponse> */
    public SyncInvoker<CreateTopicRequest, CreateTopicResponse> createTopicInvoker(CreateTopicRequest request) {
        return new SyncInvoker<CreateTopicRequest, CreateTopicResponse>(request, SmnMeta.createTopic, hcClient);
    }

    /** 删除消息模板 删除消息模板。删除模板之前的消息请求都可以使用该模板发送，删除之后无法再使用该模板发送消息。
     *
     * @param DeleteMessageTemplateRequest 请求对象
     * @return DeleteMessageTemplateResponse */
    public DeleteMessageTemplateResponse deleteMessageTemplate(DeleteMessageTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.deleteMessageTemplate);
    }

    /** 删除消息模板 删除消息模板。删除模板之前的消息请求都可以使用该模板发送，删除之后无法再使用该模板发送消息。
     *
     * @param DeleteMessageTemplateRequest 请求对象
     * @return SyncInvoker<DeleteMessageTemplateRequest, DeleteMessageTemplateResponse> */
    public SyncInvoker<DeleteMessageTemplateRequest, DeleteMessageTemplateResponse> deleteMessageTemplateInvoker(
        DeleteMessageTemplateRequest request) {
        return new SyncInvoker<DeleteMessageTemplateRequest, DeleteMessageTemplateResponse>(request,
            SmnMeta.deleteMessageTemplate, hcClient);
    }

    /** 删除资源标签 幂等接口：删除时，不对标签做校验。删除的key不存在报404，key不能为空或者空字符串。
     *
     * @param DeleteResourceTagRequest 请求对象
     * @return DeleteResourceTagResponse */
    public DeleteResourceTagResponse deleteResourceTag(DeleteResourceTagRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.deleteResourceTag);
    }

    /** 删除资源标签 幂等接口：删除时，不对标签做校验。删除的key不存在报404，key不能为空或者空字符串。
     *
     * @param DeleteResourceTagRequest 请求对象
     * @return SyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse> */
    public SyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse> deleteResourceTagInvoker(
        DeleteResourceTagRequest request) {
        return new SyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse>(request, SmnMeta.deleteResourceTag,
            hcClient);
    }

    /** 删除主题 删除主题。
     *
     * @param DeleteTopicRequest 请求对象
     * @return DeleteTopicResponse */
    public DeleteTopicResponse deleteTopic(DeleteTopicRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.deleteTopic);
    }

    /** 删除主题 删除主题。
     *
     * @param DeleteTopicRequest 请求对象
     * @return SyncInvoker<DeleteTopicRequest, DeleteTopicResponse> */
    public SyncInvoker<DeleteTopicRequest, DeleteTopicResponse> deleteTopicInvoker(DeleteTopicRequest request) {
        return new SyncInvoker<DeleteTopicRequest, DeleteTopicResponse>(request, SmnMeta.deleteTopic, hcClient);
    }

    /** 删除指定名称的主题策略 删除指定名称的主题策略。
     *
     * @param DeleteTopicAttributeByNameRequest 请求对象
     * @return DeleteTopicAttributeByNameResponse */
    public DeleteTopicAttributeByNameResponse deleteTopicAttributeByName(DeleteTopicAttributeByNameRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.deleteTopicAttributeByName);
    }

    /** 删除指定名称的主题策略 删除指定名称的主题策略。
     *
     * @param DeleteTopicAttributeByNameRequest 请求对象
     * @return SyncInvoker<DeleteTopicAttributeByNameRequest, DeleteTopicAttributeByNameResponse> */
    public SyncInvoker<DeleteTopicAttributeByNameRequest, DeleteTopicAttributeByNameResponse> deleteTopicAttributeByNameInvoker(
        DeleteTopicAttributeByNameRequest request) {
        return new SyncInvoker<DeleteTopicAttributeByNameRequest, DeleteTopicAttributeByNameResponse>(request,
            SmnMeta.deleteTopicAttributeByName, hcClient);
    }

    /** 删除所有主题策略 删除所有主题策略。
     *
     * @param DeleteTopicAttributesRequest 请求对象
     * @return DeleteTopicAttributesResponse */
    public DeleteTopicAttributesResponse deleteTopicAttributes(DeleteTopicAttributesRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.deleteTopicAttributes);
    }

    /** 删除所有主题策略 删除所有主题策略。
     *
     * @param DeleteTopicAttributesRequest 请求对象
     * @return SyncInvoker<DeleteTopicAttributesRequest, DeleteTopicAttributesResponse> */
    public SyncInvoker<DeleteTopicAttributesRequest, DeleteTopicAttributesResponse> deleteTopicAttributesInvoker(
        DeleteTopicAttributesRequest request) {
        return new SyncInvoker<DeleteTopicAttributesRequest, DeleteTopicAttributesResponse>(request,
            SmnMeta.deleteTopicAttributes, hcClient);
    }

    /** 查询消息模板详情 查询模板详情，包括模板内容。
     *
     * @param ListMessageTemplateDetailsRequest 请求对象
     * @return ListMessageTemplateDetailsResponse */
    public ListMessageTemplateDetailsResponse listMessageTemplateDetails(ListMessageTemplateDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listMessageTemplateDetails);
    }

    /** 查询消息模板详情 查询模板详情，包括模板内容。
     *
     * @param ListMessageTemplateDetailsRequest 请求对象
     * @return SyncInvoker<ListMessageTemplateDetailsRequest, ListMessageTemplateDetailsResponse> */
    public SyncInvoker<ListMessageTemplateDetailsRequest, ListMessageTemplateDetailsResponse> listMessageTemplateDetailsInvoker(
        ListMessageTemplateDetailsRequest request) {
        return new SyncInvoker<ListMessageTemplateDetailsRequest, ListMessageTemplateDetailsResponse>(request,
            SmnMeta.listMessageTemplateDetails, hcClient);
    }

    /** 查询消息模板列表
     * 分页查询模板列表，模板列表按照创建时间进行升序排列。分页查询可以指定offset以及limit。如果不存在模板，则返回空列表。额外的查询参数分别有message_template_name和protocol。
     *
     * @param ListMessageTemplatesRequest 请求对象
     * @return ListMessageTemplatesResponse */
    public ListMessageTemplatesResponse listMessageTemplates(ListMessageTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listMessageTemplates);
    }

    /** 查询消息模板列表
     * 分页查询模板列表，模板列表按照创建时间进行升序排列。分页查询可以指定offset以及limit。如果不存在模板，则返回空列表。额外的查询参数分别有message_template_name和protocol。
     *
     * @param ListMessageTemplatesRequest 请求对象
     * @return SyncInvoker<ListMessageTemplatesRequest, ListMessageTemplatesResponse> */
    public SyncInvoker<ListMessageTemplatesRequest, ListMessageTemplatesResponse> listMessageTemplatesInvoker(
        ListMessageTemplatesRequest request) {
        return new SyncInvoker<ListMessageTemplatesRequest, ListMessageTemplatesResponse>(request,
            SmnMeta.listMessageTemplates, hcClient);
    }

    /** 查询项目标签 查询租户在指定Region和实例类型的所有标签集合。
     *
     * @param ListProjectTagsRequest 请求对象
     * @return ListProjectTagsResponse */
    public ListProjectTagsResponse listProjectTags(ListProjectTagsRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listProjectTags);
    }

    /** 查询项目标签 查询租户在指定Region和实例类型的所有标签集合。
     *
     * @param ListProjectTagsRequest 请求对象
     * @return SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> */
    public SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsInvoker(
        ListProjectTagsRequest request) {
        return new SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>(request, SmnMeta.listProjectTags,
            hcClient);
    }

    /** 查询资源实例 使用标签过滤实例。
     *
     * @param ListResourceInstancesRequest 请求对象
     * @return ListResourceInstancesResponse */
    public ListResourceInstancesResponse listResourceInstances(ListResourceInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listResourceInstances);
    }

    /** 查询资源实例 使用标签过滤实例。
     *
     * @param ListResourceInstancesRequest 请求对象
     * @return SyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse> */
    public SyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse> listResourceInstancesInvoker(
        ListResourceInstancesRequest request) {
        return new SyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse>(request,
            SmnMeta.listResourceInstances, hcClient);
    }

    /** 查询资源标签 查询指定实例的标签信息。
     *
     * @param ListResourceTagsRequest 请求对象
     * @return ListResourceTagsResponse */
    public ListResourceTagsResponse listResourceTags(ListResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listResourceTags);
    }

    /** 查询资源标签 查询指定实例的标签信息。
     *
     * @param ListResourceTagsRequest 请求对象
     * @return SyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse> */
    public SyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse> listResourceTagsInvoker(
        ListResourceTagsRequest request) {
        return new SyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse>(request, SmnMeta.listResourceTags,
            hcClient);
    }

    /** 查询订阅者列表 分页返回请求者的所有的订阅列表，订阅列表按照订阅创建时间进行升序排列。分页查询可以指定offset以及limit。如果订阅者不存在，返回空列表。
     *
     * @param ListSubscriptionsRequest 请求对象
     * @return ListSubscriptionsResponse */
    public ListSubscriptionsResponse listSubscriptions(ListSubscriptionsRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listSubscriptions);
    }

    /** 查询订阅者列表 分页返回请求者的所有的订阅列表，订阅列表按照订阅创建时间进行升序排列。分页查询可以指定offset以及limit。如果订阅者不存在，返回空列表。
     *
     * @param ListSubscriptionsRequest 请求对象
     * @return SyncInvoker<ListSubscriptionsRequest, ListSubscriptionsResponse> */
    public SyncInvoker<ListSubscriptionsRequest, ListSubscriptionsResponse> listSubscriptionsInvoker(
        ListSubscriptionsRequest request) {
        return new SyncInvoker<ListSubscriptionsRequest, ListSubscriptionsResponse>(request, SmnMeta.listSubscriptions,
            hcClient);
    }

    /** 查询指定Topic的订阅者列表 分页获取特定Topic的订阅列表，订阅列表按照订阅创建时间进行升序排列。分页查询可以指定offset以及limit。如果指定Topic不存在订阅者，返回空列表。
     *
     * @param ListSubscriptionsByTopicRequest 请求对象
     * @return ListSubscriptionsByTopicResponse */
    public ListSubscriptionsByTopicResponse listSubscriptionsByTopic(ListSubscriptionsByTopicRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listSubscriptionsByTopic);
    }

    /** 查询指定Topic的订阅者列表 分页获取特定Topic的订阅列表，订阅列表按照订阅创建时间进行升序排列。分页查询可以指定offset以及limit。如果指定Topic不存在订阅者，返回空列表。
     *
     * @param ListSubscriptionsByTopicRequest 请求对象
     * @return SyncInvoker<ListSubscriptionsByTopicRequest, ListSubscriptionsByTopicResponse> */
    public SyncInvoker<ListSubscriptionsByTopicRequest, ListSubscriptionsByTopicResponse> listSubscriptionsByTopicInvoker(
        ListSubscriptionsByTopicRequest request) {
        return new SyncInvoker<ListSubscriptionsByTopicRequest, ListSubscriptionsByTopicResponse>(request,
            SmnMeta.listSubscriptionsByTopic, hcClient);
    }

    /** 查询主题策略 查询主题的策略信息。
     *
     * @param ListTopicAttributesRequest 请求对象
     * @return ListTopicAttributesResponse */
    public ListTopicAttributesResponse listTopicAttributes(ListTopicAttributesRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listTopicAttributes);
    }

    /** 查询主题策略 查询主题的策略信息。
     *
     * @param ListTopicAttributesRequest 请求对象
     * @return SyncInvoker<ListTopicAttributesRequest, ListTopicAttributesResponse> */
    public SyncInvoker<ListTopicAttributesRequest, ListTopicAttributesResponse> listTopicAttributesInvoker(
        ListTopicAttributesRequest request) {
        return new SyncInvoker<ListTopicAttributesRequest, ListTopicAttributesResponse>(request,
            SmnMeta.listTopicAttributes, hcClient);
    }

    /** 查询主题详情 查询Topic的详细信息。
     *
     * @param ListTopicDetailsRequest 请求对象
     * @return ListTopicDetailsResponse */
    public ListTopicDetailsResponse listTopicDetails(ListTopicDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listTopicDetails);
    }

    /** 查询主题详情 查询Topic的详细信息。
     *
     * @param ListTopicDetailsRequest 请求对象
     * @return SyncInvoker<ListTopicDetailsRequest, ListTopicDetailsResponse> */
    public SyncInvoker<ListTopicDetailsRequest, ListTopicDetailsResponse> listTopicDetailsInvoker(
        ListTopicDetailsRequest request) {
        return new SyncInvoker<ListTopicDetailsRequest, ListTopicDetailsResponse>(request, SmnMeta.listTopicDetails,
            hcClient);
    }

    /** 查询主题列表 分页查询Topic列表，Topic列表按照Topic创建时间进行降序排列。分页查询可以指定offset以及limit。如果不存在Topic，则返回空列表。
     *
     * @param ListTopicsRequest 请求对象
     * @return ListTopicsResponse */
    public ListTopicsResponse listTopics(ListTopicsRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listTopics);
    }

    /** 查询主题列表 分页查询Topic列表，Topic列表按照Topic创建时间进行降序排列。分页查询可以指定offset以及limit。如果不存在Topic，则返回空列表。
     *
     * @param ListTopicsRequest 请求对象
     * @return SyncInvoker<ListTopicsRequest, ListTopicsResponse> */
    public SyncInvoker<ListTopicsRequest, ListTopicsResponse> listTopicsInvoker(ListTopicsRequest request) {
        return new SyncInvoker<ListTopicsRequest, ListTopicsResponse>(request, SmnMeta.listTopics, hcClient);
    }

    /** 查询SMN API V2版本信息 查询SMN API V2版本信息。
     *
     * @param ListVersionRequest 请求对象
     * @return ListVersionResponse */
    public ListVersionResponse listVersion(ListVersionRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listVersion);
    }

    /** 查询SMN API V2版本信息 查询SMN API V2版本信息。
     *
     * @param ListVersionRequest 请求对象
     * @return SyncInvoker<ListVersionRequest, ListVersionResponse> */
    public SyncInvoker<ListVersionRequest, ListVersionResponse> listVersionInvoker(ListVersionRequest request) {
        return new SyncInvoker<ListVersionRequest, ListVersionResponse>(request, SmnMeta.listVersion, hcClient);
    }

    /** 查询SMN支持的API版本号信息 查询SMN开放API支持的版本号。
     *
     * @param ListVersionsRequest 请求对象
     * @return ListVersionsResponse */
    public ListVersionsResponse listVersions(ListVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listVersions);
    }

    /** 查询SMN支持的API版本号信息 查询SMN开放API支持的版本号。
     *
     * @param ListVersionsRequest 请求对象
     * @return SyncInvoker<ListVersionsRequest, ListVersionsResponse> */
    public SyncInvoker<ListVersionsRequest, ListVersionsResponse> listVersionsInvoker(ListVersionsRequest request) {
        return new SyncInvoker<ListVersionsRequest, ListVersionsResponse>(request, SmnMeta.listVersions, hcClient);
    }

    /** 消息发布 将消息发送给Topic的所有订阅端点。当返回消息ID时，该消息已被保存并开始尝试将其推送给Topic的订阅者。三种消息发送方式 message message_structure
     * message_template_name 只需要设置其中一个，如果同时设置，生效的优先级为 message_structure &gt; message_template_name &gt; message。
     *
     * @param PublishMessageRequest 请求对象
     * @return PublishMessageResponse */
    public PublishMessageResponse publishMessage(PublishMessageRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.publishMessage);
    }

    /** 消息发布 将消息发送给Topic的所有订阅端点。当返回消息ID时，该消息已被保存并开始尝试将其推送给Topic的订阅者。三种消息发送方式 message message_structure
     * message_template_name 只需要设置其中一个，如果同时设置，生效的优先级为 message_structure &gt; message_template_name &gt; message。
     *
     * @param PublishMessageRequest 请求对象
     * @return SyncInvoker<PublishMessageRequest, PublishMessageResponse> */
    public SyncInvoker<PublishMessageRequest, PublishMessageResponse> publishMessageInvoker(
        PublishMessageRequest request) {
        return new SyncInvoker<PublishMessageRequest, PublishMessageResponse>(request, SmnMeta.publishMessage,
            hcClient);
    }

    /** 更新消息模板 修改消息模板的内容。
     *
     * @param UpdateMessageTemplateRequest 请求对象
     * @return UpdateMessageTemplateResponse */
    public UpdateMessageTemplateResponse updateMessageTemplate(UpdateMessageTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.updateMessageTemplate);
    }

    /** 更新消息模板 修改消息模板的内容。
     *
     * @param UpdateMessageTemplateRequest 请求对象
     * @return SyncInvoker<UpdateMessageTemplateRequest, UpdateMessageTemplateResponse> */
    public SyncInvoker<UpdateMessageTemplateRequest, UpdateMessageTemplateResponse> updateMessageTemplateInvoker(
        UpdateMessageTemplateRequest request) {
        return new SyncInvoker<UpdateMessageTemplateRequest, UpdateMessageTemplateResponse>(request,
            SmnMeta.updateMessageTemplate, hcClient);
    }

    /** 更新主题 更新显示名。
     *
     * @param UpdateTopicRequest 请求对象
     * @return UpdateTopicResponse */
    public UpdateTopicResponse updateTopic(UpdateTopicRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.updateTopic);
    }

    /** 更新主题 更新显示名。
     *
     * @param UpdateTopicRequest 请求对象
     * @return SyncInvoker<UpdateTopicRequest, UpdateTopicResponse> */
    public SyncInvoker<UpdateTopicRequest, UpdateTopicResponse> updateTopicInvoker(UpdateTopicRequest request) {
        return new SyncInvoker<UpdateTopicRequest, UpdateTopicResponse>(request, SmnMeta.updateTopic, hcClient);
    }

    /** 更新主题策略 更新主题的策略信息。
     *
     * @param UpdateTopicAttributeRequest 请求对象
     * @return UpdateTopicAttributeResponse */
    public UpdateTopicAttributeResponse updateTopicAttribute(UpdateTopicAttributeRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.updateTopicAttribute);
    }

    /** 更新主题策略 更新主题的策略信息。
     *
     * @param UpdateTopicAttributeRequest 请求对象
     * @return SyncInvoker<UpdateTopicAttributeRequest, UpdateTopicAttributeResponse> */
    public SyncInvoker<UpdateTopicAttributeRequest, UpdateTopicAttributeResponse> updateTopicAttributeInvoker(
        UpdateTopicAttributeRequest request) {
        return new SyncInvoker<UpdateTopicAttributeRequest, UpdateTopicAttributeResponse>(request,
            SmnMeta.updateTopicAttribute, hcClient);
    }

    /** 创建Application 创建平台应用。
     *
     * @param CreateApplicationRequest 请求对象
     * @return CreateApplicationResponse */
    public CreateApplicationResponse createApplication(CreateApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.createApplication);
    }

    /** 创建Application 创建平台应用。
     *
     * @param CreateApplicationRequest 请求对象
     * @return SyncInvoker<CreateApplicationRequest, CreateApplicationResponse> */
    public SyncInvoker<CreateApplicationRequest, CreateApplicationResponse> createApplicationInvoker(
        CreateApplicationRequest request) {
        return new SyncInvoker<CreateApplicationRequest, CreateApplicationResponse>(request, SmnMeta.createApplication,
            hcClient);
    }

    /** 删除Application 删除平台应用。
     *
     * @param DeleteApplicationRequest 请求对象
     * @return DeleteApplicationResponse */
    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.deleteApplication);
    }

    /** 删除Application 删除平台应用。
     *
     * @param DeleteApplicationRequest 请求对象
     * @return SyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse> */
    public SyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse> deleteApplicationInvoker(
        DeleteApplicationRequest request) {
        return new SyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse>(request, SmnMeta.deleteApplication,
            hcClient);
    }

    /** 查询Application属性 获取应用平台属性。
     *
     * @param ListApplicationAttributesRequest 请求对象
     * @return ListApplicationAttributesResponse */
    public ListApplicationAttributesResponse listApplicationAttributes(ListApplicationAttributesRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listApplicationAttributes);
    }

    /** 查询Application属性 获取应用平台属性。
     *
     * @param ListApplicationAttributesRequest 请求对象
     * @return SyncInvoker<ListApplicationAttributesRequest, ListApplicationAttributesResponse> */
    public SyncInvoker<ListApplicationAttributesRequest, ListApplicationAttributesResponse> listApplicationAttributesInvoker(
        ListApplicationAttributesRequest request) {
        return new SyncInvoker<ListApplicationAttributesRequest, ListApplicationAttributesResponse>(request,
            SmnMeta.listApplicationAttributes, hcClient);
    }

    /** 查询Application 查询应用平台列表。
     *
     * @param ListApplicationsRequest 请求对象
     * @return ListApplicationsResponse */
    public ListApplicationsResponse listApplications(ListApplicationsRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listApplications);
    }

    /** 查询Application 查询应用平台列表。
     *
     * @param ListApplicationsRequest 请求对象
     * @return SyncInvoker<ListApplicationsRequest, ListApplicationsResponse> */
    public SyncInvoker<ListApplicationsRequest, ListApplicationsResponse> listApplicationsInvoker(
        ListApplicationsRequest request) {
        return new SyncInvoker<ListApplicationsRequest, ListApplicationsResponse>(request, SmnMeta.listApplications,
            hcClient);
    }

    /** App消息发布 将消息直发给endpoint设备。
     *
     * @param PublishAppMessageRequest 请求对象
     * @return PublishAppMessageResponse */
    public PublishAppMessageResponse publishAppMessage(PublishAppMessageRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.publishAppMessage);
    }

    /** App消息发布 将消息直发给endpoint设备。
     *
     * @param PublishAppMessageRequest 请求对象
     * @return SyncInvoker<PublishAppMessageRequest, PublishAppMessageResponse> */
    public SyncInvoker<PublishAppMessageRequest, PublishAppMessageResponse> publishAppMessageInvoker(
        PublishAppMessageRequest request) {
        return new SyncInvoker<PublishAppMessageRequest, PublishAppMessageResponse>(request, SmnMeta.publishAppMessage,
            hcClient);
    }

    /** 更新Application 更新应用平台。
     *
     * @param UpdateApplicationRequest 请求对象
     * @return UpdateApplicationResponse */
    public UpdateApplicationResponse updateApplication(UpdateApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.updateApplication);
    }

    /** 更新Application 更新应用平台。
     *
     * @param UpdateApplicationRequest 请求对象
     * @return SyncInvoker<UpdateApplicationRequest, UpdateApplicationResponse> */
    public SyncInvoker<UpdateApplicationRequest, UpdateApplicationResponse> updateApplicationInvoker(
        UpdateApplicationRequest request) {
        return new SyncInvoker<UpdateApplicationRequest, UpdateApplicationResponse>(request, SmnMeta.updateApplication,
            hcClient);
    }

    /** 创建Application endpoint 创建应用平台的endpoint终端。
     *
     * @param CreateApplicationEndpointRequest 请求对象
     * @return CreateApplicationEndpointResponse */
    public CreateApplicationEndpointResponse createApplicationEndpoint(CreateApplicationEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.createApplicationEndpoint);
    }

    /** 创建Application endpoint 创建应用平台的endpoint终端。
     *
     * @param CreateApplicationEndpointRequest 请求对象
     * @return SyncInvoker<CreateApplicationEndpointRequest, CreateApplicationEndpointResponse> */
    public SyncInvoker<CreateApplicationEndpointRequest, CreateApplicationEndpointResponse> createApplicationEndpointInvoker(
        CreateApplicationEndpointRequest request) {
        return new SyncInvoker<CreateApplicationEndpointRequest, CreateApplicationEndpointResponse>(request,
            SmnMeta.createApplicationEndpoint, hcClient);
    }

    /** 删除Application endpoint 删除设备。
     *
     * @param DeleteApplicationEndpointRequest 请求对象
     * @return DeleteApplicationEndpointResponse */
    public DeleteApplicationEndpointResponse deleteApplicationEndpoint(DeleteApplicationEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.deleteApplicationEndpoint);
    }

    /** 删除Application endpoint 删除设备。
     *
     * @param DeleteApplicationEndpointRequest 请求对象
     * @return SyncInvoker<DeleteApplicationEndpointRequest, DeleteApplicationEndpointResponse> */
    public SyncInvoker<DeleteApplicationEndpointRequest, DeleteApplicationEndpointResponse> deleteApplicationEndpointInvoker(
        DeleteApplicationEndpointRequest request) {
        return new SyncInvoker<DeleteApplicationEndpointRequest, DeleteApplicationEndpointResponse>(request,
            SmnMeta.deleteApplicationEndpoint, hcClient);
    }

    /** 查询Application的Endpoint属性 获取endpoint的属性。
     *
     * @param ListApplicationEndpointAttributesRequest 请求对象
     * @return ListApplicationEndpointAttributesResponse */
    public ListApplicationEndpointAttributesResponse listApplicationEndpointAttributes(
        ListApplicationEndpointAttributesRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listApplicationEndpointAttributes);
    }

    /** 查询Application的Endpoint属性 获取endpoint的属性。
     *
     * @param ListApplicationEndpointAttributesRequest 请求对象
     * @return SyncInvoker<ListApplicationEndpointAttributesRequest, ListApplicationEndpointAttributesResponse> */
    public SyncInvoker<ListApplicationEndpointAttributesRequest, ListApplicationEndpointAttributesResponse> listApplicationEndpointAttributesInvoker(
        ListApplicationEndpointAttributesRequest request) {
        return new SyncInvoker<ListApplicationEndpointAttributesRequest, ListApplicationEndpointAttributesResponse>(
            request, SmnMeta.listApplicationEndpointAttributes, hcClient);
    }

    /** 查询Application的Endpoint列表 查询平台的endpoint列表。
     *
     * @param ListApplicationEndpointsRequest 请求对象
     * @return ListApplicationEndpointsResponse */
    public ListApplicationEndpointsResponse listApplicationEndpoints(ListApplicationEndpointsRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.listApplicationEndpoints);
    }

    /** 查询Application的Endpoint列表 查询平台的endpoint列表。
     *
     * @param ListApplicationEndpointsRequest 请求对象
     * @return SyncInvoker<ListApplicationEndpointsRequest, ListApplicationEndpointsResponse> */
    public SyncInvoker<ListApplicationEndpointsRequest, ListApplicationEndpointsResponse> listApplicationEndpointsInvoker(
        ListApplicationEndpointsRequest request) {
        return new SyncInvoker<ListApplicationEndpointsRequest, ListApplicationEndpointsResponse>(request,
            SmnMeta.listApplicationEndpoints, hcClient);
    }

    /** 更新Application endpoint 更新设备属性。
     *
     * @param UpdateApplicationEndpointRequest 请求对象
     * @return UpdateApplicationEndpointResponse */
    public UpdateApplicationEndpointResponse updateApplicationEndpoint(UpdateApplicationEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, SmnMeta.updateApplicationEndpoint);
    }

    /** 更新Application endpoint 更新设备属性。
     *
     * @param UpdateApplicationEndpointRequest 请求对象
     * @return SyncInvoker<UpdateApplicationEndpointRequest, UpdateApplicationEndpointResponse> */
    public SyncInvoker<UpdateApplicationEndpointRequest, UpdateApplicationEndpointResponse> updateApplicationEndpointInvoker(
        UpdateApplicationEndpointRequest request) {
        return new SyncInvoker<UpdateApplicationEndpointRequest, UpdateApplicationEndpointResponse>(request,
            SmnMeta.updateApplicationEndpoint, hcClient);
    }

}

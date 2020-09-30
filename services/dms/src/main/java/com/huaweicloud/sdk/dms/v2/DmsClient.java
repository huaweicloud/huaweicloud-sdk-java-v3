package com.huaweicloud.sdk.dms.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.dms.v2.model.*;

public class DmsClient {
    protected HcClient hcClient;

    public DmsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DmsClient> newBuilder() {
        return new ClientBuilder<>(DmsClient::new);
    }


    /**
     * 批量添加或删除队列标签
     * 批量添加或删除队列标签。
     *
     * @param BatchCreateOrDeleteQueueTagRequest 请求对象
     * @return BatchCreateOrDeleteQueueTagResponse
     */
    public BatchCreateOrDeleteQueueTagResponse batchCreateOrDeleteQueueTag(BatchCreateOrDeleteQueueTagRequest request) {
        return hcClient.syncInvokeHttp(request, DmsMeta.batchCreateOrDeleteQueueTag);
    }

    /**
     * 确认已消费指定消息
     * 确认已经消费指定消息。  在消费者消费消息期间，消息仍然停留在队列中，但消息从被消费开始的30秒内不能被该消费组再次消费，若在这30秒内没有被消费者确认消费，则DMS认为消息未消费成功，将可以被继续消费。  如果消息被确认消费成功，消息将不能被该消费组再次消费，但是消息仍然保持在队列中，并且可以被其它消费组消费，消息在队列中的保留时间默认为72小时（除非队列被删除），72小时后会被删除。  消息批量消费确认时，必须严格按照消息消费的顺序提交确认，DMS按顺序判定消息是否消费成功，如果某条消息未确认或消费失败，则不再继续检测，默认后续消息全部消费失败。建议当对某一条消息处理失败时，不再需要继续处理本批消息中的后续消息，直接对已正确处理的消息进行确认。  确认消费失败后，可以再次重新消费和确认。当开启死信时，消息进行多次重复消费仍然失败后，DMS会将该条消息转存到死信队列中，有效期为72小时，用户可以根据需要对死信消息进行重新消费。
     *
     * @param ConfirmConsumptionMessagesRequest 请求对象
     * @return ConfirmConsumptionMessagesResponse
     */
    public ConfirmConsumptionMessagesResponse confirmConsumptionMessages(ConfirmConsumptionMessagesRequest request) {
        return hcClient.syncInvokeHttp(request, DmsMeta.confirmConsumptionMessages);
    }

    /**
     * 确认已消费死信消息
     * 确认已经消费指定的死信消息。  在消费者消费死信消息期间，死信消息仍然停留在队列中，但死信消息从被消费开始的30秒内不能被该消费组再次消费，若在这30秒内没有被消费者确认消费，则DMS认为死信消息未消费成功，将可以被继续消费。  如果死信消息被确认消费成功，该死信消息将不能被该消费组再次消费，死信消息的保留时间为72小时（除非消费组被删除），72小时后会被删除。  消息批量消费确认时，必须严格按照消息消费的顺序提交确认，DMS按顺序判定消息是否消费成功，如果某条消息未确认或消费失败，则不再继续检测，默认后续消息全部消费失败。建议当对某一条消息处理失败时，不再需要继续处理本批消息中的后续消息，直接对已正确处理的消息进行确认。  仅NORMAL队列和FIFO队列可以开启死信消息，因为只有NORMAL队列和FIFO队列可消费死信消息。
     *
     * @param ConfirmDeadLettersMessagesRequest 请求对象
     * @return ConfirmDeadLettersMessagesResponse
     */
    public ConfirmDeadLettersMessagesResponse confirmDeadLettersMessages(ConfirmDeadLettersMessagesRequest request) {
        return hcClient.syncInvokeHttp(request, DmsMeta.confirmDeadLettersMessages);
    }

    /**
     * 消费死信消息
     * 消费指定消费组产生的死信消息。可同时消费多条消息，每次消费的消息负载不超过512KB。  仅NORMAL队列和FIFO队列可以开启死信消息，因为只有NORMAL队列和FIFO队列可消费死信消息。
     *
     * @param ConsumeDeadlettersMessageRequest 请求对象
     * @return ConsumeDeadlettersMessageResponse
     */
    public ConsumeDeadlettersMessageResponse consumeDeadlettersMessage(ConsumeDeadlettersMessageRequest request) {
        return hcClient.syncInvokeHttp(request, DmsMeta.consumeDeadlettersMessage);
    }

    /**
     * 消费消息
     * 消费指定队列中的消息。可同时消费多条消息，每次消费的消息负载不超过512KB。  当队列中消息较少时，单次消费返回的消息数量可能会少于指定条数，但多次消费最终可获取全部消息，当队列为空时，返回为空。  每个消费组只支持一种Label规则，如果第二次消费更换了Label规则，则消费失败。
     *
     * @param ConsumeMessagesRequest 请求对象
     * @return ConsumeMessagesResponse
     */
    public ConsumeMessagesResponse consumeMessages(ConsumeMessagesRequest request) {
        return hcClient.syncInvokeHttp(request, DmsMeta.consumeMessages);
    }

    /**
     * 创建消费组
     * 创建消费组。  可同时为指定队列创建多个消费组。  &gt; 创建消费组后系统内部完成初始化需要1-3秒，如果创建消费组后立即进行操作，可能会导致消费失败。建议3秒后再操作该队列。
     *
     * @param CreateConsumerGroupRequest 请求对象
     * @return CreateConsumerGroupResponse
     */
    public CreateConsumerGroupResponse createConsumerGroup(CreateConsumerGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DmsMeta.createConsumerGroup);
    }

    /**
     * 创建队列
     * 每个project_id默认只能创建30个队列。 &gt; 创建队列时系统内部完成初始化需要1-3秒，如果创建队列后立即进行操作，可能会导致生产消息、消费消息、查询队列详情、创建消费组和删除队列等操作失败。建议3秒后再操作该队列。
     *
     * @param CreateQueueRequest 请求对象
     * @return CreateQueueResponse
     */
    public CreateQueueResponse createQueue(CreateQueueRequest request) {
        return hcClient.syncInvokeHttp(request, DmsMeta.createQueue);
    }

    /**
     * 删除指定队列
     * 删除指定的队列。
     *
     * @param DeleteQueueRequest 请求对象
     * @return DeleteQueueResponse
     */
    public DeleteQueueResponse deleteQueue(DeleteQueueRequest request) {
        return hcClient.syncInvokeHttp(request, DmsMeta.deleteQueue);
    }

    /**
     * 删除指定消费组
     * 删除指定消费组。
     *
     * @param DeleteSpecifiedConsumerGroupRequest 请求对象
     * @return DeleteSpecifiedConsumerGroupResponse
     */
    public DeleteSpecifiedConsumerGroupResponse deleteSpecifiedConsumerGroup(DeleteSpecifiedConsumerGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DmsMeta.deleteSpecifiedConsumerGroup);
    }

    /**
     * 查看指定队列的所有消费组
     * 获取指定队列的所有消费组。
     *
     * @param ListConsumerGroupsRequest 请求对象
     * @return ListConsumerGroupsResponse
     */
    public ListConsumerGroupsResponse listConsumerGroups(ListConsumerGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, DmsMeta.listConsumerGroups);
    }

    /**
     * 查看所有队列
     * 查看所有队列。
     *
     * @param ListQueuesRequest 请求对象
     * @return ListQueuesResponse
     */
    public ListQueuesResponse listQueues(ListQueuesRequest request) {
        return hcClient.syncInvokeHttp(request, DmsMeta.listQueues);
    }

    /**
     * 向指定队列发送消息
     * 向指定队列发送消息，可同时发送多条消息。  - 每次最多发送10条。 - 每次发送的消息总负载不超过512KB。 - Kafka队列的消息保存时间在创建队列时可以设置，可设置范围为1~72小时。其他队列的消息最大保存时长为72小时。
     *
     * @param SendMessagesRequest 请求对象
     * @return SendMessagesResponse
     */
    public SendMessagesResponse sendMessages(SendMessagesRequest request) {
        return hcClient.syncInvokeHttp(request, DmsMeta.sendMessages);
    }

    /**
     * 查询项目标签
     * 查询项目标签。
     *
     * @param ShowProjectTagsRequest 请求对象
     * @return ShowProjectTagsResponse
     */
    public ShowProjectTagsResponse showProjectTags(ShowProjectTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DmsMeta.showProjectTags);
    }

    /**
     * 查看指定队列
     * 查看指定的队列。
     *
     * @param ShowQueueRequest 请求对象
     * @return ShowQueueResponse
     */
    public ShowQueueResponse showQueue(ShowQueueRequest request) {
        return hcClient.syncInvokeHttp(request, DmsMeta.showQueue);
    }

    /**
     * 查询队列标签
     * 查询队列标签。
     *
     * @param ShowQueueTagsRequest 请求对象
     * @return ShowQueueTagsResponse
     */
    public ShowQueueTagsResponse showQueueTags(ShowQueueTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DmsMeta.showQueueTags);
    }

    /**
     * 查看租户配额
     * 查看当前项目的配额。
     *
     * @param ShowQuotasRequest 请求对象
     * @return ShowQuotasResponse
     */
    public ShowQuotasResponse showQuotas(ShowQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, DmsMeta.showQuotas);
    }

}
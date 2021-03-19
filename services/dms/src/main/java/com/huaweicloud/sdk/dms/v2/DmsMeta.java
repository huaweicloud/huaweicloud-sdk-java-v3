package com.huaweicloud.sdk.dms.v2;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dms.v2.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class DmsMeta {

    public static final HttpRequestDef<BatchCreateOrDeleteQueueTagRequest, BatchCreateOrDeleteQueueTagResponse> batchCreateOrDeleteQueueTag = genForbatchCreateOrDeleteQueueTag();

    private static HttpRequestDef<BatchCreateOrDeleteQueueTagRequest, BatchCreateOrDeleteQueueTagResponse> genForbatchCreateOrDeleteQueueTag() {
        // basic
        HttpRequestDef.Builder<BatchCreateOrDeleteQueueTagRequest, BatchCreateOrDeleteQueueTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateOrDeleteQueueTagRequest.class, BatchCreateOrDeleteQueueTagResponse.class)
                .withName("BatchCreateOrDeleteQueueTag")
                .withUri("/v2/{project_id}/queue/{queue_id}/tags/action")
                .withContentType("application/json");

        // requests
        builder.withRequestField("queue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchCreateOrDeleteQueueTagRequest::getQueueId, (req, v) -> {
                req.setQueueId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchCreateOrDeleteTagReq.class,
            f -> f.withMarshaller(BatchCreateOrDeleteQueueTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ConfirmConsumptionMessagesRequest, ConfirmConsumptionMessagesResponse> confirmConsumptionMessages = genForconfirmConsumptionMessages();

    private static HttpRequestDef<ConfirmConsumptionMessagesRequest, ConfirmConsumptionMessagesResponse> genForconfirmConsumptionMessages() {
        // basic
        HttpRequestDef.Builder<ConfirmConsumptionMessagesRequest, ConfirmConsumptionMessagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ConfirmConsumptionMessagesRequest.class, ConfirmConsumptionMessagesResponse.class)
                .withName("ConfirmConsumptionMessages")
                .withUri("/v2/{project_id}/queues/{queue_id}/groups/{consumer_group_id}/ack")
                .withContentType("application/json");

        // requests
        builder.withRequestField("queue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ConfirmConsumptionMessagesRequest::getQueueId, (req, v) -> {
                req.setQueueId(v);
            })
        );
        builder.withRequestField("consumer_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ConfirmConsumptionMessagesRequest::getConsumerGroupId, (req, v) -> {
                req.setConsumerGroupId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ConfirmConsumptionMessagesReq.class,
            f -> f.withMarshaller(ConfirmConsumptionMessagesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ConfirmDeadLettersMessagesRequest, ConfirmDeadLettersMessagesResponse> confirmDeadLettersMessages = genForconfirmDeadLettersMessages();

    private static HttpRequestDef<ConfirmDeadLettersMessagesRequest, ConfirmDeadLettersMessagesResponse> genForconfirmDeadLettersMessages() {
        // basic
        HttpRequestDef.Builder<ConfirmDeadLettersMessagesRequest, ConfirmDeadLettersMessagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ConfirmDeadLettersMessagesRequest.class, ConfirmDeadLettersMessagesResponse.class)
                .withName("ConfirmDeadLettersMessages")
                .withUri("/v2/{project_id}/queues/{queue_id}/groups/{consumer_group_id}/deadletters/ack")
                .withContentType("application/json");

        // requests
        builder.withRequestField("queue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ConfirmDeadLettersMessagesRequest::getQueueId, (req, v) -> {
                req.setQueueId(v);
            })
        );
        builder.withRequestField("consumer_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ConfirmDeadLettersMessagesRequest::getConsumerGroupId, (req, v) -> {
                req.setConsumerGroupId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ConfirmDeadLettersMessagesReq.class,
            f -> f.withMarshaller(ConfirmDeadLettersMessagesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ConsumeDeadlettersMessageRequest, ConsumeDeadlettersMessageResponse> consumeDeadlettersMessage = genForconsumeDeadlettersMessage();

    private static HttpRequestDef<ConsumeDeadlettersMessageRequest, ConsumeDeadlettersMessageResponse> genForconsumeDeadlettersMessage() {
        // basic
        HttpRequestDef.Builder<ConsumeDeadlettersMessageRequest, ConsumeDeadlettersMessageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ConsumeDeadlettersMessageRequest.class, ConsumeDeadlettersMessageResponse.class)
                .withName("ConsumeDeadlettersMessage")
                .withUri("/v2/{project_id}/queues/{queue_id}/groups/{consumer_group_id}/deadletters")
                .withContentType("application/json");

        // requests
        builder.withRequestField("queue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ConsumeDeadlettersMessageRequest::getQueueId, (req, v) -> {
                req.setQueueId(v);
            })
        );
        builder.withRequestField("consumer_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ConsumeDeadlettersMessageRequest::getConsumerGroupId, (req, v) -> {
                req.setConsumerGroupId(v);
            })
        );
        builder.withRequestField("max_msgs",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ConsumeDeadlettersMessageRequest::getMaxMsgs, (req, v) -> {
                req.setMaxMsgs(v);
            })
        );
        builder.withRequestField("time_wait",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ConsumeDeadlettersMessageRequest::getTimeWait, (req, v) -> {
                req.setTimeWait(v);
            })
        );
        builder.withRequestField("ack_wait",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ConsumeDeadlettersMessageRequest::getAckWait, (req, v) -> {
                req.setAckWait(v);
            })
        );

        // response
        

        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ConsumeDeadlettersMessageResponse::getBody, (response, data)->{
                response.setBody(data);
            }).withInnerContainerType(ConsumeDeadlettersMessage.class)
        );


        return builder.build();
    }

    public static final HttpRequestDef<ConsumeMessagesRequest, ConsumeMessagesResponse> consumeMessages = genForconsumeMessages();

    private static HttpRequestDef<ConsumeMessagesRequest, ConsumeMessagesResponse> genForconsumeMessages() {
        // basic
        HttpRequestDef.Builder<ConsumeMessagesRequest, ConsumeMessagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ConsumeMessagesRequest.class, ConsumeMessagesResponse.class)
                .withName("ConsumeMessages")
                .withUri("/v2/{project_id}/queues/{queue_id}/groups/{consumer_group_id}/messages")
                .withContentType("application/json");

        // requests
        builder.withRequestField("queue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ConsumeMessagesRequest::getQueueId, (req, v) -> {
                req.setQueueId(v);
            })
        );
        builder.withRequestField("consumer_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ConsumeMessagesRequest::getConsumerGroupId, (req, v) -> {
                req.setConsumerGroupId(v);
            })
        );
        builder.withRequestField("max_msgs",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ConsumeMessagesRequest::getMaxMsgs, (req, v) -> {
                req.setMaxMsgs(v);
            })
        );
        builder.withRequestField("time_wait",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ConsumeMessagesRequest::getTimeWait, (req, v) -> {
                req.setTimeWait(v);
            })
        );
        builder.withRequestField("ack_wait",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ConsumeMessagesRequest::getAckWait, (req, v) -> {
                req.setAckWait(v);
            })
        );
        builder.withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ConsumeMessagesRequest::getTag, (req, v) -> {
                req.setTag(v);
            })
        );
        builder.withRequestField("tag_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ConsumeMessagesRequest::getTagType, (req, v) -> {
                req.setTagType(v);
            })
        );

        // response
        

        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ConsumeMessagesResponse::getBody, (response, data)->{
                response.setBody(data);
            }).withInnerContainerType(ConsumeMessage.class)
        );


        return builder.build();
    }

    public static final HttpRequestDef<CreateConsumerGroupRequest, CreateConsumerGroupResponse> createConsumerGroup = genForcreateConsumerGroup();

    private static HttpRequestDef<CreateConsumerGroupRequest, CreateConsumerGroupResponse> genForcreateConsumerGroup() {
        // basic
        HttpRequestDef.Builder<CreateConsumerGroupRequest, CreateConsumerGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateConsumerGroupRequest.class, CreateConsumerGroupResponse.class)
                .withName("CreateConsumerGroup")
                .withUri("/v2/{project_id}/queues/{queue_id}/groups")
                .withContentType("application/json");

        // requests
        builder.withRequestField("queue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateConsumerGroupRequest::getQueueId, (req, v) -> {
                req.setQueueId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateConsumerGroupReq.class,
            f -> f.withMarshaller(CreateConsumerGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<CreateQueueRequest, CreateQueueResponse> createQueue = genForcreateQueue();

    private static HttpRequestDef<CreateQueueRequest, CreateQueueResponse> genForcreateQueue() {
        // basic
        HttpRequestDef.Builder<CreateQueueRequest, CreateQueueResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateQueueRequest.class, CreateQueueResponse.class)
                .withName("CreateQueue")
                .withUri("/v2/{project_id}/queues")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateQueueReq.class,
            f -> f.withMarshaller(CreateQueueRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<DeleteQueueRequest, DeleteQueueResponse> deleteQueue = genFordeleteQueue();

    private static HttpRequestDef<DeleteQueueRequest, DeleteQueueResponse> genFordeleteQueue() {
        // basic
        HttpRequestDef.Builder<DeleteQueueRequest, DeleteQueueResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteQueueRequest.class, DeleteQueueResponse.class)
                .withName("DeleteQueue")
                .withUri("/v2/{project_id}/queues/{queue_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("queue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteQueueRequest::getQueueId, (req, v) -> {
                req.setQueueId(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<DeleteSpecifiedConsumerGroupRequest, DeleteSpecifiedConsumerGroupResponse> deleteSpecifiedConsumerGroup = genFordeleteSpecifiedConsumerGroup();

    private static HttpRequestDef<DeleteSpecifiedConsumerGroupRequest, DeleteSpecifiedConsumerGroupResponse> genFordeleteSpecifiedConsumerGroup() {
        // basic
        HttpRequestDef.Builder<DeleteSpecifiedConsumerGroupRequest, DeleteSpecifiedConsumerGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSpecifiedConsumerGroupRequest.class, DeleteSpecifiedConsumerGroupResponse.class)
                .withName("DeleteSpecifiedConsumerGroup")
                .withUri("/v2/{project_id}/queues/{queue_id}/groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("queue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteSpecifiedConsumerGroupRequest::getQueueId, (req, v) -> {
                req.setQueueId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteSpecifiedConsumerGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ListConsumerGroupsRequest, ListConsumerGroupsResponse> listConsumerGroups = genForlistConsumerGroups();

    private static HttpRequestDef<ListConsumerGroupsRequest, ListConsumerGroupsResponse> genForlistConsumerGroups() {
        // basic
        HttpRequestDef.Builder<ListConsumerGroupsRequest, ListConsumerGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListConsumerGroupsRequest.class, ListConsumerGroupsResponse.class)
                .withName("ListConsumerGroups")
                .withUri("/v2/{project_id}/queues/{queue_id}/groups")
                .withContentType("application/json");

        // requests
        builder.withRequestField("queue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListConsumerGroupsRequest::getQueueId, (req, v) -> {
                req.setQueueId(v);
            })
        );
        builder.withRequestField("include_deadletter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListConsumerGroupsRequest::getIncludeDeadletter, (req, v) -> {
                req.setIncludeDeadletter(v);
            })
        );
        builder.withRequestField("include_messages_num",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListConsumerGroupsRequest::getIncludeMessagesNum, (req, v) -> {
                req.setIncludeMessagesNum(v);
            })
        );
        builder.withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListConsumerGroupsRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            })
        );
        builder.withRequestField("current_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListConsumerGroupsRequest::getCurrentPage, (req, v) -> {
                req.setCurrentPage(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ListQueuesRequest, ListQueuesResponse> listQueues = genForlistQueues();

    private static HttpRequestDef<ListQueuesRequest, ListQueuesResponse> genForlistQueues() {
        // basic
        HttpRequestDef.Builder<ListQueuesRequest, ListQueuesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQueuesRequest.class, ListQueuesResponse.class)
                .withName("ListQueues")
                .withUri("/v2/{project_id}/queues")
                .withContentType("application/json");

        // requests
        builder.withRequestField("include_deadletter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListQueuesRequest::getIncludeDeadletter, (req, v) -> {
                req.setIncludeDeadletter(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<SendMessagesRequest, SendMessagesResponse> sendMessages = genForsendMessages();

    private static HttpRequestDef<SendMessagesRequest, SendMessagesResponse> genForsendMessages() {
        // basic
        HttpRequestDef.Builder<SendMessagesRequest, SendMessagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SendMessagesRequest.class, SendMessagesResponse.class)
                .withName("SendMessages")
                .withUri("/v2/{project_id}/queues/{queue_id}/messages")
                .withContentType("application/json");

        // requests
        builder.withRequestField("queue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(SendMessagesRequest::getQueueId, (req, v) -> {
                req.setQueueId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            SendMessagesReq.class,
            f -> f.withMarshaller(SendMessagesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectTagsRequest, ShowProjectTagsResponse> showProjectTags = genForshowProjectTags();

    private static HttpRequestDef<ShowProjectTagsRequest, ShowProjectTagsResponse> genForshowProjectTags() {
        // basic
        HttpRequestDef.Builder<ShowProjectTagsRequest, ShowProjectTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProjectTagsRequest.class, ShowProjectTagsResponse.class)
                .withName("ShowProjectTags")
                .withUri("/v2/{project_id}/queue/tags")
                .withContentType("application/json");

        // requests

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ShowQueueRequest, ShowQueueResponse> showQueue = genForshowQueue();

    private static HttpRequestDef<ShowQueueRequest, ShowQueueResponse> genForshowQueue() {
        // basic
        HttpRequestDef.Builder<ShowQueueRequest, ShowQueueResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQueueRequest.class, ShowQueueResponse.class)
                .withName("ShowQueue")
                .withUri("/v2/{project_id}/queues/{queue_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("queue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowQueueRequest::getQueueId, (req, v) -> {
                req.setQueueId(v);
            })
        );
        builder.withRequestField("include_deadletter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ShowQueueRequest::getIncludeDeadletter, (req, v) -> {
                req.setIncludeDeadletter(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ShowQueueTagsRequest, ShowQueueTagsResponse> showQueueTags = genForshowQueueTags();

    private static HttpRequestDef<ShowQueueTagsRequest, ShowQueueTagsResponse> genForshowQueueTags() {
        // basic
        HttpRequestDef.Builder<ShowQueueTagsRequest, ShowQueueTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQueueTagsRequest.class, ShowQueueTagsResponse.class)
                .withName("ShowQueueTags")
                .withUri("/v2/{project_id}/queue/{queue_id}/tags")
                .withContentType("application/json");

        // requests
        builder.withRequestField("queue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowQueueTagsRequest::getQueueId, (req, v) -> {
                req.setQueueId(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> showQuotas = genForshowQuotas();

    private static HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> genForshowQuotas() {
        // basic
        HttpRequestDef.Builder<ShowQuotasRequest, ShowQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQuotasRequest.class, ShowQuotasResponse.class)
                .withName("ShowQuotas")
                .withUri("/v2/{project_id}/quotas")
                .withContentType("application/json");

        // requests

        // response
        



        return builder.build();
    }

}

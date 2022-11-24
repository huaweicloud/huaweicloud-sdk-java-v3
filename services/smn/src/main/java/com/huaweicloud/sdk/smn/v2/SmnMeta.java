package com.huaweicloud.sdk.smn.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.smn.v2.model.*;

@SuppressWarnings("unchecked")
public class SmnMeta {

    public static final HttpRequestDef<AddSubscriptionRequest, AddSubscriptionResponse> addSubscription =
        genForaddSubscription();

    private static HttpRequestDef<AddSubscriptionRequest, AddSubscriptionResponse> genForaddSubscription() {
        // basic
        HttpRequestDef.Builder<AddSubscriptionRequest, AddSubscriptionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddSubscriptionRequest.class, AddSubscriptionResponse.class)
                .withName("AddSubscription")
                .withUri("/v2/{project_id}/notifications/topics/{topic_urn}/subscriptions")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("topic_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddSubscriptionRequest::getTopicUrn, (req, v) -> {
                req.setTopicUrn(v);
            }));
        builder.<AddSubscriptionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AddSubscriptionRequestBody.class),
            f -> f.withMarshaller(AddSubscriptionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateOrDeleteResourceTagsRequest, BatchCreateOrDeleteResourceTagsResponse> batchCreateOrDeleteResourceTags =
        genForbatchCreateOrDeleteResourceTags();

    private static HttpRequestDef<BatchCreateOrDeleteResourceTagsRequest, BatchCreateOrDeleteResourceTagsResponse> genForbatchCreateOrDeleteResourceTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateOrDeleteResourceTagsRequest, BatchCreateOrDeleteResourceTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateOrDeleteResourceTagsRequest.class,
                    BatchCreateOrDeleteResourceTagsResponse.class)
                .withName("BatchCreateOrDeleteResourceTags")
                .withUri("/v2/{project_id}/{resource_type}/{resource_id}/tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateOrDeleteResourceTagsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateOrDeleteResourceTagsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<BatchCreateOrDeleteResourceTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchCreateOrDeleteResourceTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateOrDeleteResourceTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelSubscriptionRequest, CancelSubscriptionResponse> cancelSubscription =
        genForcancelSubscription();

    private static HttpRequestDef<CancelSubscriptionRequest, CancelSubscriptionResponse> genForcancelSubscription() {
        // basic
        HttpRequestDef.Builder<CancelSubscriptionRequest, CancelSubscriptionResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, CancelSubscriptionRequest.class, CancelSubscriptionResponse.class)
                .withName("CancelSubscription")
                .withUri("/v2/{project_id}/notifications/subscriptions/{subscription_urn}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("subscription_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelSubscriptionRequest::getSubscriptionUrn, (req, v) -> {
                req.setSubscriptionUrn(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMessageTemplateRequest, CreateMessageTemplateResponse> createMessageTemplate =
        genForcreateMessageTemplate();

    private static HttpRequestDef<CreateMessageTemplateRequest, CreateMessageTemplateResponse> genForcreateMessageTemplate() {
        // basic
        HttpRequestDef.Builder<CreateMessageTemplateRequest, CreateMessageTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateMessageTemplateRequest.class, CreateMessageTemplateResponse.class)
            .withName("CreateMessageTemplate")
            .withUri("/v2/{project_id}/notifications/message_template")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateMessageTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateMessageTemplateRequestBody.class),
            f -> f.withMarshaller(CreateMessageTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResourceTagRequest, CreateResourceTagResponse> createResourceTag =
        genForcreateResourceTag();

    private static HttpRequestDef<CreateResourceTagRequest, CreateResourceTagResponse> genForcreateResourceTag() {
        // basic
        HttpRequestDef.Builder<CreateResourceTagRequest, CreateResourceTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateResourceTagRequest.class, CreateResourceTagResponse.class)
                .withName("CreateResourceTag")
                .withUri("/v2/{project_id}/{resource_type}/{resource_id}/tags")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateResourceTagRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateResourceTagRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<CreateResourceTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateResourceTagRequestBody.class),
            f -> f.withMarshaller(CreateResourceTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTopicRequest, CreateTopicResponse> createTopic = genForcreateTopic();

    private static HttpRequestDef<CreateTopicRequest, CreateTopicResponse> genForcreateTopic() {
        // basic
        HttpRequestDef.Builder<CreateTopicRequest, CreateTopicResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTopicRequest.class, CreateTopicResponse.class)
                .withName("CreateTopic")
                .withUri("/v2/{project_id}/notifications/topics")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateTopicRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTopicRequestBody.class),
            f -> f.withMarshaller(CreateTopicRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMessageTemplateRequest, DeleteMessageTemplateResponse> deleteMessageTemplate =
        genFordeleteMessageTemplate();

    private static HttpRequestDef<DeleteMessageTemplateRequest, DeleteMessageTemplateResponse> genFordeleteMessageTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteMessageTemplateRequest, DeleteMessageTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteMessageTemplateRequest.class, DeleteMessageTemplateResponse.class)
            .withName("DeleteMessageTemplate")
            .withUri("/v2/{project_id}/notifications/message_template/{message_template_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("message_template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMessageTemplateRequest::getMessageTemplateId, (req, v) -> {
                req.setMessageTemplateId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResourceTagRequest, DeleteResourceTagResponse> deleteResourceTag =
        genFordeleteResourceTag();

    private static HttpRequestDef<DeleteResourceTagRequest, DeleteResourceTagResponse> genFordeleteResourceTag() {
        // basic
        HttpRequestDef.Builder<DeleteResourceTagRequest, DeleteResourceTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteResourceTagRequest.class, DeleteResourceTagResponse.class)
                .withName("DeleteResourceTag")
                .withUri("/v2/{project_id}/{resource_type}/{resource_id}/tags/{key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceTagRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceTagRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceTagRequest::getKey, (req, v) -> {
                req.setKey(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTopicRequest, DeleteTopicResponse> deleteTopic = genFordeleteTopic();

    private static HttpRequestDef<DeleteTopicRequest, DeleteTopicResponse> genFordeleteTopic() {
        // basic
        HttpRequestDef.Builder<DeleteTopicRequest, DeleteTopicResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTopicRequest.class, DeleteTopicResponse.class)
                .withName("DeleteTopic")
                .withUri("/v2/{project_id}/notifications/topics/{topic_urn}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("topic_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTopicRequest::getTopicUrn, (req, v) -> {
                req.setTopicUrn(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTopicAttributeByNameRequest, DeleteTopicAttributeByNameResponse> deleteTopicAttributeByName =
        genFordeleteTopicAttributeByName();

    private static HttpRequestDef<DeleteTopicAttributeByNameRequest, DeleteTopicAttributeByNameResponse> genFordeleteTopicAttributeByName() {
        // basic
        HttpRequestDef.Builder<DeleteTopicAttributeByNameRequest, DeleteTopicAttributeByNameResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteTopicAttributeByNameRequest.class,
                    DeleteTopicAttributeByNameResponse.class)
                .withName("DeleteTopicAttributeByName")
                .withUri("/v2/{project_id}/notifications/topics/{topic_urn}/attributes/{name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("topic_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTopicAttributeByNameRequest::getTopicUrn, (req, v) -> {
                req.setTopicUrn(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTopicAttributeByNameRequest::getName, (req, v) -> {
                req.setName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTopicAttributesRequest, DeleteTopicAttributesResponse> deleteTopicAttributes =
        genFordeleteTopicAttributes();

    private static HttpRequestDef<DeleteTopicAttributesRequest, DeleteTopicAttributesResponse> genFordeleteTopicAttributes() {
        // basic
        HttpRequestDef.Builder<DeleteTopicAttributesRequest, DeleteTopicAttributesResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteTopicAttributesRequest.class, DeleteTopicAttributesResponse.class)
            .withName("DeleteTopicAttributes")
            .withUri("/v2/{project_id}/notifications/topics/{topic_urn}/attributes")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("topic_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTopicAttributesRequest::getTopicUrn, (req, v) -> {
                req.setTopicUrn(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMessageTemplateDetailsRequest, ListMessageTemplateDetailsResponse> listMessageTemplateDetails =
        genForlistMessageTemplateDetails();

    private static HttpRequestDef<ListMessageTemplateDetailsRequest, ListMessageTemplateDetailsResponse> genForlistMessageTemplateDetails() {
        // basic
        HttpRequestDef.Builder<ListMessageTemplateDetailsRequest, ListMessageTemplateDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListMessageTemplateDetailsRequest.class,
                    ListMessageTemplateDetailsResponse.class)
                .withName("ListMessageTemplateDetails")
                .withUri("/v2/{project_id}/notifications/message_template/{message_template_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("message_template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessageTemplateDetailsRequest::getMessageTemplateId, (req, v) -> {
                req.setMessageTemplateId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMessageTemplatesRequest, ListMessageTemplatesResponse> listMessageTemplates =
        genForlistMessageTemplates();

    private static HttpRequestDef<ListMessageTemplatesRequest, ListMessageTemplatesResponse> genForlistMessageTemplates() {
        // basic
        HttpRequestDef.Builder<ListMessageTemplatesRequest, ListMessageTemplatesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListMessageTemplatesRequest.class, ListMessageTemplatesResponse.class)
            .withName("ListMessageTemplates")
            .withUri("/v2/{project_id}/notifications/message_template")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMessageTemplatesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMessageTemplatesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("message_template_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessageTemplatesRequest::getMessageTemplateName, (req, v) -> {
                req.setMessageTemplateName(v);
            }));
        builder.<String>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessageTemplatesRequest::getProtocol, (req, v) -> {
                req.setProtocol(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTags =
        genForlistProjectTags();

    private static HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> genForlistProjectTags() {
        // basic
        HttpRequestDef.Builder<ListProjectTagsRequest, ListProjectTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectTagsRequest.class, ListProjectTagsResponse.class)
                .withName("ListProjectTags")
                .withUri("/v2/{project_id}/{resource_type}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectTagsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceInstancesRequest, ListResourceInstancesResponse> listResourceInstances =
        genForlistResourceInstances();

    private static HttpRequestDef<ListResourceInstancesRequest, ListResourceInstancesResponse> genForlistResourceInstances() {
        // basic
        HttpRequestDef.Builder<ListResourceInstancesRequest, ListResourceInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListResourceInstancesRequest.class, ListResourceInstancesResponse.class)
            .withName("ListResourceInstances")
            .withUri("/v2/{project_id}/{resource_type}/resource_instances/action")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceInstancesRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<ListInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstanceRequestBody.class),
            f -> f.withMarshaller(ListResourceInstancesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceTagsRequest, ListResourceTagsResponse> listResourceTags =
        genForlistResourceTags();

    private static HttpRequestDef<ListResourceTagsRequest, ListResourceTagsResponse> genForlistResourceTags() {
        // basic
        HttpRequestDef.Builder<ListResourceTagsRequest, ListResourceTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResourceTagsRequest.class, ListResourceTagsResponse.class)
                .withName("ListResourceTags")
                .withUri("/v2/{project_id}/{resource_type}/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceTagsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceTagsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubscriptionsRequest, ListSubscriptionsResponse> listSubscriptions =
        genForlistSubscriptions();

    private static HttpRequestDef<ListSubscriptionsRequest, ListSubscriptionsResponse> genForlistSubscriptions() {
        // basic
        HttpRequestDef.Builder<ListSubscriptionsRequest, ListSubscriptionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSubscriptionsRequest.class, ListSubscriptionsResponse.class)
                .withName("ListSubscriptions")
                .withUri("/v2/{project_id}/notifications/subscriptions")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubscriptionsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubscriptionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubscriptionsRequest::getProtocol, (req, v) -> {
                req.setProtocol(v);
            }));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubscriptionsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("endpoint",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubscriptionsRequest::getEndpoint, (req, v) -> {
                req.setEndpoint(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubscriptionsByTopicRequest, ListSubscriptionsByTopicResponse> listSubscriptionsByTopic =
        genForlistSubscriptionsByTopic();

    private static HttpRequestDef<ListSubscriptionsByTopicRequest, ListSubscriptionsByTopicResponse> genForlistSubscriptionsByTopic() {
        // basic
        HttpRequestDef.Builder<ListSubscriptionsByTopicRequest, ListSubscriptionsByTopicResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListSubscriptionsByTopicRequest.class, ListSubscriptionsByTopicResponse.class)
                .withName("ListSubscriptionsByTopic")
                .withUri("/v2/{project_id}/notifications/topics/{topic_urn}/subscriptions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("topic_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubscriptionsByTopicRequest::getTopicUrn, (req, v) -> {
                req.setTopicUrn(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubscriptionsByTopicRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubscriptionsByTopicRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTopicAttributesRequest, ListTopicAttributesResponse> listTopicAttributes =
        genForlistTopicAttributes();

    private static HttpRequestDef<ListTopicAttributesRequest, ListTopicAttributesResponse> genForlistTopicAttributes() {
        // basic
        HttpRequestDef.Builder<ListTopicAttributesRequest, ListTopicAttributesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTopicAttributesRequest.class, ListTopicAttributesResponse.class)
                .withName("ListTopicAttributes")
                .withUri("/v2/{project_id}/notifications/topics/{topic_urn}/attributes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("topic_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopicAttributesRequest::getTopicUrn, (req, v) -> {
                req.setTopicUrn(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopicAttributesRequest::getName, (req, v) -> {
                req.setName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTopicDetailsRequest, ListTopicDetailsResponse> listTopicDetails =
        genForlistTopicDetails();

    private static HttpRequestDef<ListTopicDetailsRequest, ListTopicDetailsResponse> genForlistTopicDetails() {
        // basic
        HttpRequestDef.Builder<ListTopicDetailsRequest, ListTopicDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTopicDetailsRequest.class, ListTopicDetailsResponse.class)
                .withName("ListTopicDetails")
                .withUri("/v2/{project_id}/notifications/topics/{topic_urn}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("topic_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopicDetailsRequest::getTopicUrn, (req, v) -> {
                req.setTopicUrn(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTopicsRequest, ListTopicsResponse> listTopics = genForlistTopics();

    private static HttpRequestDef<ListTopicsRequest, ListTopicsResponse> genForlistTopics() {
        // basic
        HttpRequestDef.Builder<ListTopicsRequest, ListTopicsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTopicsRequest.class, ListTopicsResponse.class)
                .withName("ListTopics")
                .withUri("/v2/{project_id}/notifications/topics")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTopicsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTopicsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopicsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopicsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("fuzzy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopicsRequest::getFuzzyName, (req, v) -> {
                req.setFuzzyName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVersionRequest, ListVersionResponse> listVersion = genForlistVersion();

    private static HttpRequestDef<ListVersionRequest, ListVersionResponse> genForlistVersion() {
        // basic
        HttpRequestDef.Builder<ListVersionRequest, ListVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVersionRequest.class, ListVersionResponse.class)
                .withName("ListVersion")
                .withUri("/{api_version}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("api_version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVersionRequest::getApiVersion, (req, v) -> {
                req.setApiVersion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVersionsRequest, ListVersionsResponse> listVersions = genForlistVersions();

    private static HttpRequestDef<ListVersionsRequest, ListVersionsResponse> genForlistVersions() {
        // basic
        HttpRequestDef.Builder<ListVersionsRequest, ListVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVersionsRequest.class, ListVersionsResponse.class)
                .withName("ListVersions")
                .withUri("/")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PublishMessageRequest, PublishMessageResponse> publishMessage =
        genForpublishMessage();

    private static HttpRequestDef<PublishMessageRequest, PublishMessageResponse> genForpublishMessage() {
        // basic
        HttpRequestDef.Builder<PublishMessageRequest, PublishMessageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PublishMessageRequest.class, PublishMessageResponse.class)
                .withName("PublishMessage")
                .withUri("/v2/{project_id}/notifications/topics/{topic_urn}/publish")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("topic_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishMessageRequest::getTopicUrn, (req, v) -> {
                req.setTopicUrn(v);
            }));
        builder.<PublishMessageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PublishMessageRequestBody.class),
            f -> f.withMarshaller(PublishMessageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMessageTemplateRequest, UpdateMessageTemplateResponse> updateMessageTemplate =
        genForupdateMessageTemplate();

    private static HttpRequestDef<UpdateMessageTemplateRequest, UpdateMessageTemplateResponse> genForupdateMessageTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateMessageTemplateRequest, UpdateMessageTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateMessageTemplateRequest.class, UpdateMessageTemplateResponse.class)
            .withName("UpdateMessageTemplate")
            .withUri("/v2/{project_id}/notifications/message_template/{message_template_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("message_template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMessageTemplateRequest::getMessageTemplateId, (req, v) -> {
                req.setMessageTemplateId(v);
            }));
        builder.<UpdateMessageTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateMessageTemplateRequestBody.class),
            f -> f.withMarshaller(UpdateMessageTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTopicRequest, UpdateTopicResponse> updateTopic = genForupdateTopic();

    private static HttpRequestDef<UpdateTopicRequest, UpdateTopicResponse> genForupdateTopic() {
        // basic
        HttpRequestDef.Builder<UpdateTopicRequest, UpdateTopicResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTopicRequest.class, UpdateTopicResponse.class)
                .withName("UpdateTopic")
                .withUri("/v2/{project_id}/notifications/topics/{topic_urn}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("topic_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTopicRequest::getTopicUrn, (req, v) -> {
                req.setTopicUrn(v);
            }));
        builder.<UpdateTopicRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTopicRequestBody.class),
            f -> f.withMarshaller(UpdateTopicRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTopicAttributeRequest, UpdateTopicAttributeResponse> updateTopicAttribute =
        genForupdateTopicAttribute();

    private static HttpRequestDef<UpdateTopicAttributeRequest, UpdateTopicAttributeResponse> genForupdateTopicAttribute() {
        // basic
        HttpRequestDef.Builder<UpdateTopicAttributeRequest, UpdateTopicAttributeResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateTopicAttributeRequest.class, UpdateTopicAttributeResponse.class)
            .withName("UpdateTopicAttribute")
            .withUri("/v2/{project_id}/notifications/topics/{topic_urn}/attributes/{name}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("topic_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTopicAttributeRequest::getTopicUrn, (req, v) -> {
                req.setTopicUrn(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTopicAttributeRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<UpdateTopicAttributeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTopicAttributeRequestBody.class),
            f -> f.withMarshaller(UpdateTopicAttributeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateApplicationRequest, CreateApplicationResponse> createApplication =
        genForcreateApplication();

    private static HttpRequestDef<CreateApplicationRequest, CreateApplicationResponse> genForcreateApplication() {
        // basic
        HttpRequestDef.Builder<CreateApplicationRequest, CreateApplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateApplicationRequest.class, CreateApplicationResponse.class)
                .withName("CreateApplication")
                .withUri("/v2/{project_id}/notifications/applications")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateApplicationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateApplicationRequestBody.class),
            f -> f.withMarshaller(CreateApplicationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteApplicationRequest, DeleteApplicationResponse> deleteApplication =
        genFordeleteApplication();

    private static HttpRequestDef<DeleteApplicationRequest, DeleteApplicationResponse> genFordeleteApplication() {
        // basic
        HttpRequestDef.Builder<DeleteApplicationRequest, DeleteApplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteApplicationRequest.class, DeleteApplicationResponse.class)
                .withName("DeleteApplication")
                .withUri("/v2/{project_id}/notifications/applications/{application_urn}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApplicationRequest::getApplicationUrn, (req, v) -> {
                req.setApplicationUrn(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApplicationAttributesRequest, ListApplicationAttributesResponse> listApplicationAttributes =
        genForlistApplicationAttributes();

    private static HttpRequestDef<ListApplicationAttributesRequest, ListApplicationAttributesResponse> genForlistApplicationAttributes() {
        // basic
        HttpRequestDef.Builder<ListApplicationAttributesRequest, ListApplicationAttributesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListApplicationAttributesRequest.class,
                    ListApplicationAttributesResponse.class)
                .withName("ListApplicationAttributes")
                .withUri("/v2/{project_id}/notifications/applications/{application_urn}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationAttributesRequest::getApplicationUrn, (req, v) -> {
                req.setApplicationUrn(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApplicationsRequest, ListApplicationsResponse> listApplications =
        genForlistApplications();

    private static HttpRequestDef<ListApplicationsRequest, ListApplicationsResponse> genForlistApplications() {
        // basic
        HttpRequestDef.Builder<ListApplicationsRequest, ListApplicationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApplicationsRequest.class, ListApplicationsResponse.class)
                .withName("ListApplications")
                .withUri("/v2/{project_id}/notifications/applications")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApplicationsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApplicationsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("platform",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationsRequest::getPlatform, (req, v) -> {
                req.setPlatform(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PublishAppMessageRequest, PublishAppMessageResponse> publishAppMessage =
        genForpublishAppMessage();

    private static HttpRequestDef<PublishAppMessageRequest, PublishAppMessageResponse> genForpublishAppMessage() {
        // basic
        HttpRequestDef.Builder<PublishAppMessageRequest, PublishAppMessageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PublishAppMessageRequest.class, PublishAppMessageResponse.class)
                .withName("PublishAppMessage")
                .withUri("/v2/{project_id}/notifications/endpoints/{endpoint_urn}/publish")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("endpoint_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishAppMessageRequest::getEndpointUrn, (req, v) -> {
                req.setEndpointUrn(v);
            }));
        builder.<PublishAppMessageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PublishAppMessageRequestBody.class),
            f -> f.withMarshaller(PublishAppMessageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateApplicationRequest, UpdateApplicationResponse> updateApplication =
        genForupdateApplication();

    private static HttpRequestDef<UpdateApplicationRequest, UpdateApplicationResponse> genForupdateApplication() {
        // basic
        HttpRequestDef.Builder<UpdateApplicationRequest, UpdateApplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateApplicationRequest.class, UpdateApplicationResponse.class)
                .withName("UpdateApplication")
                .withUri("/v2/{project_id}/notifications/applications/{application_urn}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("application_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApplicationRequest::getApplicationUrn, (req, v) -> {
                req.setApplicationUrn(v);
            }));
        builder.<UpdateApplicationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateApplicationRequestBody.class),
            f -> f.withMarshaller(UpdateApplicationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateApplicationEndpointRequest, CreateApplicationEndpointResponse> createApplicationEndpoint =
        genForcreateApplicationEndpoint();

    private static HttpRequestDef<CreateApplicationEndpointRequest, CreateApplicationEndpointResponse> genForcreateApplicationEndpoint() {
        // basic
        HttpRequestDef.Builder<CreateApplicationEndpointRequest, CreateApplicationEndpointResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateApplicationEndpointRequest.class,
                    CreateApplicationEndpointResponse.class)
                .withName("CreateApplicationEndpoint")
                .withUri("/v2/{project_id}/notifications/applications/{application_urn}/endpoints")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("application_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateApplicationEndpointRequest::getApplicationUrn, (req, v) -> {
                req.setApplicationUrn(v);
            }));
        builder.<CreateApplicationEndpointRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateApplicationEndpointRequestBody.class),
            f -> f.withMarshaller(CreateApplicationEndpointRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteApplicationEndpointRequest, DeleteApplicationEndpointResponse> deleteApplicationEndpoint =
        genFordeleteApplicationEndpoint();

    private static HttpRequestDef<DeleteApplicationEndpointRequest, DeleteApplicationEndpointResponse> genFordeleteApplicationEndpoint() {
        // basic
        HttpRequestDef.Builder<DeleteApplicationEndpointRequest, DeleteApplicationEndpointResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteApplicationEndpointRequest.class,
                    DeleteApplicationEndpointResponse.class)
                .withName("DeleteApplicationEndpoint")
                .withUri("/v2/{project_id}/notifications/endpoints/{endpoint_urn}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("endpoint_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApplicationEndpointRequest::getEndpointUrn, (req, v) -> {
                req.setEndpointUrn(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApplicationEndpointAttributesRequest, ListApplicationEndpointAttributesResponse> listApplicationEndpointAttributes =
        genForlistApplicationEndpointAttributes();

    private static HttpRequestDef<ListApplicationEndpointAttributesRequest, ListApplicationEndpointAttributesResponse> genForlistApplicationEndpointAttributes() {
        // basic
        HttpRequestDef.Builder<ListApplicationEndpointAttributesRequest, ListApplicationEndpointAttributesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListApplicationEndpointAttributesRequest.class,
                    ListApplicationEndpointAttributesResponse.class)
                .withName("ListApplicationEndpointAttributes")
                .withUri("/v2/{project_id}/notifications/endpoints/{endpoint_urn}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("endpoint_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationEndpointAttributesRequest::getEndpointUrn, (req, v) -> {
                req.setEndpointUrn(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApplicationEndpointsRequest, ListApplicationEndpointsResponse> listApplicationEndpoints =
        genForlistApplicationEndpoints();

    private static HttpRequestDef<ListApplicationEndpointsRequest, ListApplicationEndpointsResponse> genForlistApplicationEndpoints() {
        // basic
        HttpRequestDef.Builder<ListApplicationEndpointsRequest, ListApplicationEndpointsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListApplicationEndpointsRequest.class, ListApplicationEndpointsResponse.class)
                .withName("ListApplicationEndpoints")
                .withUri("/v2/{project_id}/notifications/applications/{application_urn}/endpoints")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationEndpointsRequest::getApplicationUrn, (req, v) -> {
                req.setApplicationUrn(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApplicationEndpointsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApplicationEndpointsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("enabled",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationEndpointsRequest::getEnabled, (req, v) -> {
                req.setEnabled(v);
            }));
        builder.<String>withRequestField("token",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationEndpointsRequest::getToken, (req, v) -> {
                req.setToken(v);
            }));
        builder.<String>withRequestField("user_data",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationEndpointsRequest::getUserData, (req, v) -> {
                req.setUserData(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateApplicationEndpointRequest, UpdateApplicationEndpointResponse> updateApplicationEndpoint =
        genForupdateApplicationEndpoint();

    private static HttpRequestDef<UpdateApplicationEndpointRequest, UpdateApplicationEndpointResponse> genForupdateApplicationEndpoint() {
        // basic
        HttpRequestDef.Builder<UpdateApplicationEndpointRequest, UpdateApplicationEndpointResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateApplicationEndpointRequest.class,
                    UpdateApplicationEndpointResponse.class)
                .withName("UpdateApplicationEndpoint")
                .withUri("/v2/{project_id}/notifications/endpoints/{endpoint_urn}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("endpoint_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApplicationEndpointRequest::getEndpointUrn, (req, v) -> {
                req.setEndpointUrn(v);
            }));
        builder.<UpdateApplicationEndpointRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateApplicationEndpointRequestBody.class),
            f -> f.withMarshaller(UpdateApplicationEndpointRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}

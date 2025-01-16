package com.huaweicloud.sdk.smn.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.smn.v2.model.AddSubscriptionFromSubscriptionUserRequest;
import com.huaweicloud.sdk.smn.v2.model.AddSubscriptionFromSubscriptionUserRequestBody;
import com.huaweicloud.sdk.smn.v2.model.AddSubscriptionFromSubscriptionUserResponse;
import com.huaweicloud.sdk.smn.v2.model.AddSubscriptionRequest;
import com.huaweicloud.sdk.smn.v2.model.AddSubscriptionRequestBody;
import com.huaweicloud.sdk.smn.v2.model.AddSubscriptionResponse;
import com.huaweicloud.sdk.smn.v2.model.BatchCreateOrDeleteResourceTagsRequest;
import com.huaweicloud.sdk.smn.v2.model.BatchCreateOrDeleteResourceTagsRequestBody;
import com.huaweicloud.sdk.smn.v2.model.BatchCreateOrDeleteResourceTagsResponse;
import com.huaweicloud.sdk.smn.v2.model.BatchCreateSubscriptionsFilterPolicesRequest;
import com.huaweicloud.sdk.smn.v2.model.BatchCreateSubscriptionsFilterPolicesResponse;
import com.huaweicloud.sdk.smn.v2.model.BatchDeleteSubscriptionsFilterPolicesRequest;
import com.huaweicloud.sdk.smn.v2.model.BatchDeleteSubscriptionsFilterPolicesRequestBody;
import com.huaweicloud.sdk.smn.v2.model.BatchDeleteSubscriptionsFilterPolicesResponse;
import com.huaweicloud.sdk.smn.v2.model.BatchSubscriptionsFilterPolicesRequestBody;
import com.huaweicloud.sdk.smn.v2.model.BatchUpdateSubscriptionsFilterPolicesRequest;
import com.huaweicloud.sdk.smn.v2.model.BatchUpdateSubscriptionsFilterPolicesResponse;
import com.huaweicloud.sdk.smn.v2.model.CancelSubscriptionRequest;
import com.huaweicloud.sdk.smn.v2.model.CancelSubscriptionResponse;
import com.huaweicloud.sdk.smn.v2.model.CreateApplicationEndpointRequest;
import com.huaweicloud.sdk.smn.v2.model.CreateApplicationEndpointRequestBody;
import com.huaweicloud.sdk.smn.v2.model.CreateApplicationEndpointResponse;
import com.huaweicloud.sdk.smn.v2.model.CreateApplicationRequest;
import com.huaweicloud.sdk.smn.v2.model.CreateApplicationRequestBody;
import com.huaweicloud.sdk.smn.v2.model.CreateApplicationResponse;
import com.huaweicloud.sdk.smn.v2.model.CreateLogtankRequest;
import com.huaweicloud.sdk.smn.v2.model.CreateLogtankRequestBody;
import com.huaweicloud.sdk.smn.v2.model.CreateLogtankResponse;
import com.huaweicloud.sdk.smn.v2.model.CreateMessageTemplateRequest;
import com.huaweicloud.sdk.smn.v2.model.CreateMessageTemplateRequestBody;
import com.huaweicloud.sdk.smn.v2.model.CreateMessageTemplateResponse;
import com.huaweicloud.sdk.smn.v2.model.CreateNotifyPolicyRequest;
import com.huaweicloud.sdk.smn.v2.model.CreateNotifyPolicyResponse;
import com.huaweicloud.sdk.smn.v2.model.CreateResourceTagRequest;
import com.huaweicloud.sdk.smn.v2.model.CreateResourceTagRequestBody;
import com.huaweicloud.sdk.smn.v2.model.CreateResourceTagResponse;
import com.huaweicloud.sdk.smn.v2.model.CreateTopicRequest;
import com.huaweicloud.sdk.smn.v2.model.CreateTopicRequestBody;
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
import com.huaweicloud.sdk.smn.v2.model.HttpDetectRequestBody;
import com.huaweicloud.sdk.smn.v2.model.ListApplicationAttributesRequest;
import com.huaweicloud.sdk.smn.v2.model.ListApplicationAttributesResponse;
import com.huaweicloud.sdk.smn.v2.model.ListApplicationEndpointAttributesRequest;
import com.huaweicloud.sdk.smn.v2.model.ListApplicationEndpointAttributesResponse;
import com.huaweicloud.sdk.smn.v2.model.ListApplicationEndpointsRequest;
import com.huaweicloud.sdk.smn.v2.model.ListApplicationEndpointsResponse;
import com.huaweicloud.sdk.smn.v2.model.ListApplicationsRequest;
import com.huaweicloud.sdk.smn.v2.model.ListApplicationsResponse;
import com.huaweicloud.sdk.smn.v2.model.ListInstanceRequestBody;
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
import com.huaweicloud.sdk.smn.v2.model.ListTopicsRequest;
import com.huaweicloud.sdk.smn.v2.model.ListTopicsResponse;
import com.huaweicloud.sdk.smn.v2.model.ListVersionRequest;
import com.huaweicloud.sdk.smn.v2.model.ListVersionResponse;
import com.huaweicloud.sdk.smn.v2.model.ListVersionsRequest;
import com.huaweicloud.sdk.smn.v2.model.ListVersionsResponse;
import com.huaweicloud.sdk.smn.v2.model.NotifyPolicyRequestBody;
import com.huaweicloud.sdk.smn.v2.model.PublishAppMessageRequest;
import com.huaweicloud.sdk.smn.v2.model.PublishAppMessageRequestBody;
import com.huaweicloud.sdk.smn.v2.model.PublishAppMessageResponse;
import com.huaweicloud.sdk.smn.v2.model.PublishHttpDetectRequest;
import com.huaweicloud.sdk.smn.v2.model.PublishHttpDetectResponse;
import com.huaweicloud.sdk.smn.v2.model.PublishMessageRequest;
import com.huaweicloud.sdk.smn.v2.model.PublishMessageRequestBody;
import com.huaweicloud.sdk.smn.v2.model.PublishMessageResponse;
import com.huaweicloud.sdk.smn.v2.model.ShowHttpDetectResultRequest;
import com.huaweicloud.sdk.smn.v2.model.ShowHttpDetectResultResponse;
import com.huaweicloud.sdk.smn.v2.model.ShowNotifyPolicyRequest;
import com.huaweicloud.sdk.smn.v2.model.ShowNotifyPolicyResponse;
import com.huaweicloud.sdk.smn.v2.model.UpdateApplicationEndpointRequest;
import com.huaweicloud.sdk.smn.v2.model.UpdateApplicationEndpointRequestBody;
import com.huaweicloud.sdk.smn.v2.model.UpdateApplicationEndpointResponse;
import com.huaweicloud.sdk.smn.v2.model.UpdateApplicationRequest;
import com.huaweicloud.sdk.smn.v2.model.UpdateApplicationRequestBody;
import com.huaweicloud.sdk.smn.v2.model.UpdateApplicationResponse;
import com.huaweicloud.sdk.smn.v2.model.UpdateLogtankRequest;
import com.huaweicloud.sdk.smn.v2.model.UpdateLogtankRequestBody;
import com.huaweicloud.sdk.smn.v2.model.UpdateLogtankResponse;
import com.huaweicloud.sdk.smn.v2.model.UpdateMessageTemplateRequest;
import com.huaweicloud.sdk.smn.v2.model.UpdateMessageTemplateRequestBody;
import com.huaweicloud.sdk.smn.v2.model.UpdateMessageTemplateResponse;
import com.huaweicloud.sdk.smn.v2.model.UpdateNotifyPolicyRequest;
import com.huaweicloud.sdk.smn.v2.model.UpdateNotifyPolicyResponse;
import com.huaweicloud.sdk.smn.v2.model.UpdateSubscriptionRequest;
import com.huaweicloud.sdk.smn.v2.model.UpdateSubscriptionRequestBody;
import com.huaweicloud.sdk.smn.v2.model.UpdateSubscriptionResponse;
import com.huaweicloud.sdk.smn.v2.model.UpdateTopicAttributeRequest;
import com.huaweicloud.sdk.smn.v2.model.UpdateTopicAttributeRequestBody;
import com.huaweicloud.sdk.smn.v2.model.UpdateTopicAttributeResponse;
import com.huaweicloud.sdk.smn.v2.model.UpdateTopicRequest;
import com.huaweicloud.sdk.smn.v2.model.UpdateTopicRequestBody;
import com.huaweicloud.sdk.smn.v2.model.UpdateTopicResponse;

@SuppressWarnings("unchecked")
public class SmnMeta {

    public static final HttpRequestDef<AddSubscriptionRequest, AddSubscriptionResponse> addSubscription =
        genForAddSubscription();

    private static HttpRequestDef<AddSubscriptionRequest, AddSubscriptionResponse> genForAddSubscription() {
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
            f -> f.withMarshaller(AddSubscriptionRequest::getTopicUrn, AddSubscriptionRequest::setTopicUrn));
        builder.<AddSubscriptionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AddSubscriptionRequestBody.class),
            f -> f.withMarshaller(AddSubscriptionRequest::getBody, AddSubscriptionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddSubscriptionFromSubscriptionUserRequest, AddSubscriptionFromSubscriptionUserResponse> addSubscriptionFromSubscriptionUser =
        genForAddSubscriptionFromSubscriptionUser();

    private static HttpRequestDef<AddSubscriptionFromSubscriptionUserRequest, AddSubscriptionFromSubscriptionUserResponse> genForAddSubscriptionFromSubscriptionUser() {
        // basic
        HttpRequestDef.Builder<AddSubscriptionFromSubscriptionUserRequest, AddSubscriptionFromSubscriptionUserResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AddSubscriptionFromSubscriptionUserRequest.class,
                    AddSubscriptionFromSubscriptionUserResponse.class)
                .withName("AddSubscriptionFromSubscriptionUser")
                .withUri("/v2/{project_id}/notifications/topics/{topic_urn}/subscriptions/from-subscription-users")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("topic_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddSubscriptionFromSubscriptionUserRequest::getTopicUrn,
                AddSubscriptionFromSubscriptionUserRequest::setTopicUrn));
        builder.<AddSubscriptionFromSubscriptionUserRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddSubscriptionFromSubscriptionUserRequestBody.class),
            f -> f.withMarshaller(AddSubscriptionFromSubscriptionUserRequest::getBody,
                AddSubscriptionFromSubscriptionUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateOrDeleteResourceTagsRequest, BatchCreateOrDeleteResourceTagsResponse> batchCreateOrDeleteResourceTags =
        genForBatchCreateOrDeleteResourceTags();

    private static HttpRequestDef<BatchCreateOrDeleteResourceTagsRequest, BatchCreateOrDeleteResourceTagsResponse> genForBatchCreateOrDeleteResourceTags() {
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
            f -> f.withMarshaller(BatchCreateOrDeleteResourceTagsRequest::getResourceType,
                BatchCreateOrDeleteResourceTagsRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateOrDeleteResourceTagsRequest::getResourceId,
                BatchCreateOrDeleteResourceTagsRequest::setResourceId));
        builder.<BatchCreateOrDeleteResourceTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchCreateOrDeleteResourceTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateOrDeleteResourceTagsRequest::getBody,
                BatchCreateOrDeleteResourceTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateSubscriptionsFilterPolicesRequest, BatchCreateSubscriptionsFilterPolicesResponse> batchCreateSubscriptionsFilterPolices =
        genForBatchCreateSubscriptionsFilterPolices();

    private static HttpRequestDef<BatchCreateSubscriptionsFilterPolicesRequest, BatchCreateSubscriptionsFilterPolicesResponse> genForBatchCreateSubscriptionsFilterPolices() {
        // basic
        HttpRequestDef.Builder<BatchCreateSubscriptionsFilterPolicesRequest, BatchCreateSubscriptionsFilterPolicesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateSubscriptionsFilterPolicesRequest.class,
                    BatchCreateSubscriptionsFilterPolicesResponse.class)
                .withName("BatchCreateSubscriptionsFilterPolices")
                .withUri("/v2/{project_id}/notifications/subscriptions/filter_polices")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchSubscriptionsFilterPolicesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchSubscriptionsFilterPolicesRequestBody.class),
            f -> f.withMarshaller(BatchCreateSubscriptionsFilterPolicesRequest::getBody,
                BatchCreateSubscriptionsFilterPolicesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteSubscriptionsFilterPolicesRequest, BatchDeleteSubscriptionsFilterPolicesResponse> batchDeleteSubscriptionsFilterPolices =
        genForBatchDeleteSubscriptionsFilterPolices();

    private static HttpRequestDef<BatchDeleteSubscriptionsFilterPolicesRequest, BatchDeleteSubscriptionsFilterPolicesResponse> genForBatchDeleteSubscriptionsFilterPolices() {
        // basic
        HttpRequestDef.Builder<BatchDeleteSubscriptionsFilterPolicesRequest, BatchDeleteSubscriptionsFilterPolicesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    BatchDeleteSubscriptionsFilterPolicesRequest.class,
                    BatchDeleteSubscriptionsFilterPolicesResponse.class)
                .withName("BatchDeleteSubscriptionsFilterPolices")
                .withUri("/v2/{project_id}/notifications/subscriptions/filter_polices")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchDeleteSubscriptionsFilterPolicesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteSubscriptionsFilterPolicesRequestBody.class),
            f -> f.withMarshaller(BatchDeleteSubscriptionsFilterPolicesRequest::getBody,
                BatchDeleteSubscriptionsFilterPolicesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateSubscriptionsFilterPolicesRequest, BatchUpdateSubscriptionsFilterPolicesResponse> batchUpdateSubscriptionsFilterPolices =
        genForBatchUpdateSubscriptionsFilterPolices();

    private static HttpRequestDef<BatchUpdateSubscriptionsFilterPolicesRequest, BatchUpdateSubscriptionsFilterPolicesResponse> genForBatchUpdateSubscriptionsFilterPolices() {
        // basic
        HttpRequestDef.Builder<BatchUpdateSubscriptionsFilterPolicesRequest, BatchUpdateSubscriptionsFilterPolicesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    BatchUpdateSubscriptionsFilterPolicesRequest.class,
                    BatchUpdateSubscriptionsFilterPolicesResponse.class)
                .withName("BatchUpdateSubscriptionsFilterPolices")
                .withUri("/v2/{project_id}/notifications/subscriptions/filter_polices")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchSubscriptionsFilterPolicesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchSubscriptionsFilterPolicesRequestBody.class),
            f -> f.withMarshaller(BatchUpdateSubscriptionsFilterPolicesRequest::getBody,
                BatchUpdateSubscriptionsFilterPolicesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelSubscriptionRequest, CancelSubscriptionResponse> cancelSubscription =
        genForCancelSubscription();

    private static HttpRequestDef<CancelSubscriptionRequest, CancelSubscriptionResponse> genForCancelSubscription() {
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
            f -> f.withMarshaller(CancelSubscriptionRequest::getSubscriptionUrn,
                CancelSubscriptionRequest::setSubscriptionUrn));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLogtankRequest, CreateLogtankResponse> createLogtank =
        genForCreateLogtank();

    private static HttpRequestDef<CreateLogtankRequest, CreateLogtankResponse> genForCreateLogtank() {
        // basic
        HttpRequestDef.Builder<CreateLogtankRequest, CreateLogtankResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLogtankRequest.class, CreateLogtankResponse.class)
                .withName("CreateLogtank")
                .withUri("/v2/{project_id}/notifications/topics/{topic_urn}/logtanks")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("topic_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLogtankRequest::getTopicUrn, CreateLogtankRequest::setTopicUrn));
        builder.<CreateLogtankRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLogtankRequestBody.class),
            f -> f.withMarshaller(CreateLogtankRequest::getBody, CreateLogtankRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMessageTemplateRequest, CreateMessageTemplateResponse> createMessageTemplate =
        genForCreateMessageTemplate();

    private static HttpRequestDef<CreateMessageTemplateRequest, CreateMessageTemplateResponse> genForCreateMessageTemplate() {
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
            f -> f.withMarshaller(CreateMessageTemplateRequest::getBody, CreateMessageTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNotifyPolicyRequest, CreateNotifyPolicyResponse> createNotifyPolicy =
        genForCreateNotifyPolicy();

    private static HttpRequestDef<CreateNotifyPolicyRequest, CreateNotifyPolicyResponse> genForCreateNotifyPolicy() {
        // basic
        HttpRequestDef.Builder<CreateNotifyPolicyRequest, CreateNotifyPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateNotifyPolicyRequest.class, CreateNotifyPolicyResponse.class)
                .withName("CreateNotifyPolicy")
                .withUri("/v2/{project_id}/notifications/topics/{topic_urn}/notify-policy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("topic_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateNotifyPolicyRequest::getTopicUrn, CreateNotifyPolicyRequest::setTopicUrn));
        builder.<NotifyPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NotifyPolicyRequestBody.class),
            f -> f.withMarshaller(CreateNotifyPolicyRequest::getBody, CreateNotifyPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResourceTagRequest, CreateResourceTagResponse> createResourceTag =
        genForCreateResourceTag();

    private static HttpRequestDef<CreateResourceTagRequest, CreateResourceTagResponse> genForCreateResourceTag() {
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
            f -> f.withMarshaller(CreateResourceTagRequest::getResourceType,
                CreateResourceTagRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateResourceTagRequest::getResourceId, CreateResourceTagRequest::setResourceId));
        builder.<CreateResourceTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateResourceTagRequestBody.class),
            f -> f.withMarshaller(CreateResourceTagRequest::getBody, CreateResourceTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTopicRequest, CreateTopicResponse> createTopic = genForCreateTopic();

    private static HttpRequestDef<CreateTopicRequest, CreateTopicResponse> genForCreateTopic() {
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
            f -> f.withMarshaller(CreateTopicRequest::getBody, CreateTopicRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLogtankRequest, DeleteLogtankResponse> deleteLogtank =
        genForDeleteLogtank();

    private static HttpRequestDef<DeleteLogtankRequest, DeleteLogtankResponse> genForDeleteLogtank() {
        // basic
        HttpRequestDef.Builder<DeleteLogtankRequest, DeleteLogtankResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteLogtankRequest.class, DeleteLogtankResponse.class)
                .withName("DeleteLogtank")
                .withUri("/v2/{project_id}/notifications/topics/{topic_urn}/logtanks/{logtank_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("topic_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLogtankRequest::getTopicUrn, DeleteLogtankRequest::setTopicUrn));
        builder.<String>withRequestField("logtank_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLogtankRequest::getLogtankId, DeleteLogtankRequest::setLogtankId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMessageTemplateRequest, DeleteMessageTemplateResponse> deleteMessageTemplate =
        genForDeleteMessageTemplate();

    private static HttpRequestDef<DeleteMessageTemplateRequest, DeleteMessageTemplateResponse> genForDeleteMessageTemplate() {
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
            f -> f.withMarshaller(DeleteMessageTemplateRequest::getMessageTemplateId,
                DeleteMessageTemplateRequest::setMessageTemplateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNotifyPolicyRequest, DeleteNotifyPolicyResponse> deleteNotifyPolicy =
        genForDeleteNotifyPolicy();

    private static HttpRequestDef<DeleteNotifyPolicyRequest, DeleteNotifyPolicyResponse> genForDeleteNotifyPolicy() {
        // basic
        HttpRequestDef.Builder<DeleteNotifyPolicyRequest, DeleteNotifyPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteNotifyPolicyRequest.class, DeleteNotifyPolicyResponse.class)
                .withName("DeleteNotifyPolicy")
                .withUri("/v2/{project_id}/notifications/topics/{topic_urn}/notify-policy/{notify_policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("topic_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNotifyPolicyRequest::getTopicUrn, DeleteNotifyPolicyRequest::setTopicUrn));
        builder.<String>withRequestField("notify_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNotifyPolicyRequest::getNotifyPolicyId,
                DeleteNotifyPolicyRequest::setNotifyPolicyId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteNotifyPolicyResponse::getBody, DeleteNotifyPolicyResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResourceTagRequest, DeleteResourceTagResponse> deleteResourceTag =
        genForDeleteResourceTag();

    private static HttpRequestDef<DeleteResourceTagRequest, DeleteResourceTagResponse> genForDeleteResourceTag() {
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
            f -> f.withMarshaller(DeleteResourceTagRequest::getResourceType,
                DeleteResourceTagRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceTagRequest::getResourceId, DeleteResourceTagRequest::setResourceId));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceTagRequest::getKey, DeleteResourceTagRequest::setKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTopicRequest, DeleteTopicResponse> deleteTopic = genForDeleteTopic();

    private static HttpRequestDef<DeleteTopicRequest, DeleteTopicResponse> genForDeleteTopic() {
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
            f -> f.withMarshaller(DeleteTopicRequest::getTopicUrn, DeleteTopicRequest::setTopicUrn));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTopicAttributeByNameRequest, DeleteTopicAttributeByNameResponse> deleteTopicAttributeByName =
        genForDeleteTopicAttributeByName();

    private static HttpRequestDef<DeleteTopicAttributeByNameRequest, DeleteTopicAttributeByNameResponse> genForDeleteTopicAttributeByName() {
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
            f -> f.withMarshaller(DeleteTopicAttributeByNameRequest::getTopicUrn,
                DeleteTopicAttributeByNameRequest::setTopicUrn));
        builder.<String>withRequestField("name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTopicAttributeByNameRequest::getName,
                DeleteTopicAttributeByNameRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTopicAttributesRequest, DeleteTopicAttributesResponse> deleteTopicAttributes =
        genForDeleteTopicAttributes();

    private static HttpRequestDef<DeleteTopicAttributesRequest, DeleteTopicAttributesResponse> genForDeleteTopicAttributes() {
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
            f -> f.withMarshaller(DeleteTopicAttributesRequest::getTopicUrn,
                DeleteTopicAttributesRequest::setTopicUrn));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLogtankRequest, ListLogtankResponse> listLogtank = genForListLogtank();

    private static HttpRequestDef<ListLogtankRequest, ListLogtankResponse> genForListLogtank() {
        // basic
        HttpRequestDef.Builder<ListLogtankRequest, ListLogtankResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLogtankRequest.class, ListLogtankResponse.class)
                .withName("ListLogtank")
                .withUri("/v2/{project_id}/notifications/topics/{topic_urn}/logtanks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("topic_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogtankRequest::getTopicUrn, ListLogtankRequest::setTopicUrn));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMessageTemplateDetailsRequest, ListMessageTemplateDetailsResponse> listMessageTemplateDetails =
        genForListMessageTemplateDetails();

    private static HttpRequestDef<ListMessageTemplateDetailsRequest, ListMessageTemplateDetailsResponse> genForListMessageTemplateDetails() {
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
            f -> f.withMarshaller(ListMessageTemplateDetailsRequest::getMessageTemplateId,
                ListMessageTemplateDetailsRequest::setMessageTemplateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMessageTemplatesRequest, ListMessageTemplatesResponse> listMessageTemplates =
        genForListMessageTemplates();

    private static HttpRequestDef<ListMessageTemplatesRequest, ListMessageTemplatesResponse> genForListMessageTemplates() {
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
            f -> f.withMarshaller(ListMessageTemplatesRequest::getOffset, ListMessageTemplatesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMessageTemplatesRequest::getLimit, ListMessageTemplatesRequest::setLimit));
        builder.<String>withRequestField("message_template_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessageTemplatesRequest::getMessageTemplateName,
                ListMessageTemplatesRequest::setMessageTemplateName));
        builder.<String>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMessageTemplatesRequest::getProtocol, ListMessageTemplatesRequest::setProtocol));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTags =
        genForListProjectTags();

    private static HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> genForListProjectTags() {
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
            f -> f.withMarshaller(ListProjectTagsRequest::getResourceType, ListProjectTagsRequest::setResourceType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceInstancesRequest, ListResourceInstancesResponse> listResourceInstances =
        genForListResourceInstances();

    private static HttpRequestDef<ListResourceInstancesRequest, ListResourceInstancesResponse> genForListResourceInstances() {
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
            f -> f.withMarshaller(ListResourceInstancesRequest::getResourceType,
                ListResourceInstancesRequest::setResourceType));
        builder.<ListInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstanceRequestBody.class),
            f -> f.withMarshaller(ListResourceInstancesRequest::getBody, ListResourceInstancesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceTagsRequest, ListResourceTagsResponse> listResourceTags =
        genForListResourceTags();

    private static HttpRequestDef<ListResourceTagsRequest, ListResourceTagsResponse> genForListResourceTags() {
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
            f -> f.withMarshaller(ListResourceTagsRequest::getResourceType, ListResourceTagsRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceTagsRequest::getResourceId, ListResourceTagsRequest::setResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubscriptionsRequest, ListSubscriptionsResponse> listSubscriptions =
        genForListSubscriptions();

    private static HttpRequestDef<ListSubscriptionsRequest, ListSubscriptionsResponse> genForListSubscriptions() {
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
            f -> f.withMarshaller(ListSubscriptionsRequest::getOffset, ListSubscriptionsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubscriptionsRequest::getLimit, ListSubscriptionsRequest::setLimit));
        builder.<String>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubscriptionsRequest::getProtocol, ListSubscriptionsRequest::setProtocol));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubscriptionsRequest::getStatus, ListSubscriptionsRequest::setStatus));
        builder.<String>withRequestField("endpoint",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubscriptionsRequest::getEndpoint, ListSubscriptionsRequest::setEndpoint));
        builder.<String>withRequestField("fuzzy_remark",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubscriptionsRequest::getFuzzyRemark, ListSubscriptionsRequest::setFuzzyRemark));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubscriptionsByTopicRequest, ListSubscriptionsByTopicResponse> listSubscriptionsByTopic =
        genForListSubscriptionsByTopic();

    private static HttpRequestDef<ListSubscriptionsByTopicRequest, ListSubscriptionsByTopicResponse> genForListSubscriptionsByTopic() {
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
            f -> f.withMarshaller(ListSubscriptionsByTopicRequest::getTopicUrn,
                ListSubscriptionsByTopicRequest::setTopicUrn));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubscriptionsByTopicRequest::getOffset,
                ListSubscriptionsByTopicRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubscriptionsByTopicRequest::getLimit,
                ListSubscriptionsByTopicRequest::setLimit));
        builder.<String>withRequestField("fuzzy_remark",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubscriptionsByTopicRequest::getFuzzyRemark,
                ListSubscriptionsByTopicRequest::setFuzzyRemark));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTopicAttributesRequest, ListTopicAttributesResponse> listTopicAttributes =
        genForListTopicAttributes();

    private static HttpRequestDef<ListTopicAttributesRequest, ListTopicAttributesResponse> genForListTopicAttributes() {
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
            f -> f.withMarshaller(ListTopicAttributesRequest::getTopicUrn, ListTopicAttributesRequest::setTopicUrn));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopicAttributesRequest::getName, ListTopicAttributesRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTopicDetailsRequest, ListTopicDetailsResponse> listTopicDetails =
        genForListTopicDetails();

    private static HttpRequestDef<ListTopicDetailsRequest, ListTopicDetailsResponse> genForListTopicDetails() {
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
            f -> f.withMarshaller(ListTopicDetailsRequest::getTopicUrn, ListTopicDetailsRequest::setTopicUrn));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTopicsRequest, ListTopicsResponse> listTopics = genForListTopics();

    private static HttpRequestDef<ListTopicsRequest, ListTopicsResponse> genForListTopics() {
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
            f -> f.withMarshaller(ListTopicsRequest::getOffset, ListTopicsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTopicsRequest::getLimit, ListTopicsRequest::setLimit));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopicsRequest::getEnterpriseProjectId,
                ListTopicsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopicsRequest::getName, ListTopicsRequest::setName));
        builder.<String>withRequestField("fuzzy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopicsRequest::getFuzzyName, ListTopicsRequest::setFuzzyName));
        builder.<String>withRequestField("topic_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopicsRequest::getTopicId, ListTopicsRequest::setTopicId));
        builder.<String>withRequestField("fuzzy_display_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopicsRequest::getFuzzyDisplayName, ListTopicsRequest::setFuzzyDisplayName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVersionRequest, ListVersionResponse> listVersion = genForListVersion();

    private static HttpRequestDef<ListVersionRequest, ListVersionResponse> genForListVersion() {
        // basic
        HttpRequestDef.Builder<ListVersionRequest, ListVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVersionRequest.class, ListVersionResponse.class)
                .withName("ListVersion")
                .withUri("/v2")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVersionsRequest, ListVersionsResponse> listVersions = genForListVersions();

    private static HttpRequestDef<ListVersionsRequest, ListVersionsResponse> genForListVersions() {
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

    public static final HttpRequestDef<PublishHttpDetectRequest, PublishHttpDetectResponse> publishHttpDetect =
        genForPublishHttpDetect();

    private static HttpRequestDef<PublishHttpDetectRequest, PublishHttpDetectResponse> genForPublishHttpDetect() {
        // basic
        HttpRequestDef.Builder<PublishHttpDetectRequest, PublishHttpDetectResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PublishHttpDetectRequest.class, PublishHttpDetectResponse.class)
                .withName("PublishHttpDetect")
                .withUri("/v2/{project_id}/notifications/topics/{topic_urn}/detection")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("topic_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishHttpDetectRequest::getTopicUrn, PublishHttpDetectRequest::setTopicUrn));
        builder.<HttpDetectRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(HttpDetectRequestBody.class),
            f -> f.withMarshaller(PublishHttpDetectRequest::getBody, PublishHttpDetectRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PublishMessageRequest, PublishMessageResponse> publishMessage =
        genForPublishMessage();

    private static HttpRequestDef<PublishMessageRequest, PublishMessageResponse> genForPublishMessage() {
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
            f -> f.withMarshaller(PublishMessageRequest::getTopicUrn, PublishMessageRequest::setTopicUrn));
        builder.<PublishMessageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PublishMessageRequestBody.class),
            f -> f.withMarshaller(PublishMessageRequest::getBody, PublishMessageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHttpDetectResultRequest, ShowHttpDetectResultResponse> showHttpDetectResult =
        genForShowHttpDetectResult();

    private static HttpRequestDef<ShowHttpDetectResultRequest, ShowHttpDetectResultResponse> genForShowHttpDetectResult() {
        // basic
        HttpRequestDef.Builder<ShowHttpDetectResultRequest, ShowHttpDetectResultResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowHttpDetectResultRequest.class, ShowHttpDetectResultResponse.class)
            .withName("ShowHttpDetectResult")
            .withUri("/v2/{project_id}/notifications/topics/{topic_urn}/detection/{task_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("topic_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpDetectResultRequest::getTopicUrn, ShowHttpDetectResultRequest::setTopicUrn));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpDetectResultRequest::getTaskId, ShowHttpDetectResultRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNotifyPolicyRequest, ShowNotifyPolicyResponse> showNotifyPolicy =
        genForShowNotifyPolicy();

    private static HttpRequestDef<ShowNotifyPolicyRequest, ShowNotifyPolicyResponse> genForShowNotifyPolicy() {
        // basic
        HttpRequestDef.Builder<ShowNotifyPolicyRequest, ShowNotifyPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNotifyPolicyRequest.class, ShowNotifyPolicyResponse.class)
                .withName("ShowNotifyPolicy")
                .withUri("/v2/{project_id}/notifications/topics/{topic_urn}/notify-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("topic_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNotifyPolicyRequest::getTopicUrn, ShowNotifyPolicyRequest::setTopicUrn));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLogtankRequest, UpdateLogtankResponse> updateLogtank =
        genForUpdateLogtank();

    private static HttpRequestDef<UpdateLogtankRequest, UpdateLogtankResponse> genForUpdateLogtank() {
        // basic
        HttpRequestDef.Builder<UpdateLogtankRequest, UpdateLogtankResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateLogtankRequest.class, UpdateLogtankResponse.class)
                .withName("UpdateLogtank")
                .withUri("/v2/{project_id}/notifications/topics/{topic_urn}/logtanks/{logtank_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("topic_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLogtankRequest::getTopicUrn, UpdateLogtankRequest::setTopicUrn));
        builder.<String>withRequestField("logtank_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLogtankRequest::getLogtankId, UpdateLogtankRequest::setLogtankId));
        builder.<UpdateLogtankRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLogtankRequestBody.class),
            f -> f.withMarshaller(UpdateLogtankRequest::getBody, UpdateLogtankRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMessageTemplateRequest, UpdateMessageTemplateResponse> updateMessageTemplate =
        genForUpdateMessageTemplate();

    private static HttpRequestDef<UpdateMessageTemplateRequest, UpdateMessageTemplateResponse> genForUpdateMessageTemplate() {
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
            f -> f.withMarshaller(UpdateMessageTemplateRequest::getMessageTemplateId,
                UpdateMessageTemplateRequest::setMessageTemplateId));
        builder.<UpdateMessageTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateMessageTemplateRequestBody.class),
            f -> f.withMarshaller(UpdateMessageTemplateRequest::getBody, UpdateMessageTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNotifyPolicyRequest, UpdateNotifyPolicyResponse> updateNotifyPolicy =
        genForUpdateNotifyPolicy();

    private static HttpRequestDef<UpdateNotifyPolicyRequest, UpdateNotifyPolicyResponse> genForUpdateNotifyPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateNotifyPolicyRequest, UpdateNotifyPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateNotifyPolicyRequest.class, UpdateNotifyPolicyResponse.class)
                .withName("UpdateNotifyPolicy")
                .withUri("/v2/{project_id}/notifications/topics/{topic_urn}/notify-policy/{notify_policy_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("topic_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNotifyPolicyRequest::getTopicUrn, UpdateNotifyPolicyRequest::setTopicUrn));
        builder.<String>withRequestField("notify_policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNotifyPolicyRequest::getNotifyPolicyId,
                UpdateNotifyPolicyRequest::setNotifyPolicyId));
        builder.<NotifyPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NotifyPolicyRequestBody.class),
            f -> f.withMarshaller(UpdateNotifyPolicyRequest::getBody, UpdateNotifyPolicyRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateNotifyPolicyResponse::getBody, UpdateNotifyPolicyResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSubscriptionRequest, UpdateSubscriptionResponse> updateSubscription =
        genForUpdateSubscription();

    private static HttpRequestDef<UpdateSubscriptionRequest, UpdateSubscriptionResponse> genForUpdateSubscription() {
        // basic
        HttpRequestDef.Builder<UpdateSubscriptionRequest, UpdateSubscriptionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSubscriptionRequest.class, UpdateSubscriptionResponse.class)
                .withName("UpdateSubscription")
                .withUri("/v2/{project_id}/notifications/topics/{topic_urn}/subscriptions/{subscription_urn}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("topic_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSubscriptionRequest::getTopicUrn, UpdateSubscriptionRequest::setTopicUrn));
        builder.<String>withRequestField("subscription_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSubscriptionRequest::getSubscriptionUrn,
                UpdateSubscriptionRequest::setSubscriptionUrn));
        builder.<UpdateSubscriptionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSubscriptionRequestBody.class),
            f -> f.withMarshaller(UpdateSubscriptionRequest::getBody, UpdateSubscriptionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTopicRequest, UpdateTopicResponse> updateTopic = genForUpdateTopic();

    private static HttpRequestDef<UpdateTopicRequest, UpdateTopicResponse> genForUpdateTopic() {
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
            f -> f.withMarshaller(UpdateTopicRequest::getTopicUrn, UpdateTopicRequest::setTopicUrn));
        builder.<UpdateTopicRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTopicRequestBody.class),
            f -> f.withMarshaller(UpdateTopicRequest::getBody, UpdateTopicRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTopicAttributeRequest, UpdateTopicAttributeResponse> updateTopicAttribute =
        genForUpdateTopicAttribute();

    private static HttpRequestDef<UpdateTopicAttributeRequest, UpdateTopicAttributeResponse> genForUpdateTopicAttribute() {
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
            f -> f.withMarshaller(UpdateTopicAttributeRequest::getTopicUrn, UpdateTopicAttributeRequest::setTopicUrn));
        builder.<String>withRequestField("name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTopicAttributeRequest::getName, UpdateTopicAttributeRequest::setName));
        builder.<UpdateTopicAttributeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTopicAttributeRequestBody.class),
            f -> f.withMarshaller(UpdateTopicAttributeRequest::getBody, UpdateTopicAttributeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateApplicationRequest, CreateApplicationResponse> createApplication =
        genForCreateApplication();

    private static HttpRequestDef<CreateApplicationRequest, CreateApplicationResponse> genForCreateApplication() {
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
            f -> f.withMarshaller(CreateApplicationRequest::getBody, CreateApplicationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteApplicationRequest, DeleteApplicationResponse> deleteApplication =
        genForDeleteApplication();

    private static HttpRequestDef<DeleteApplicationRequest, DeleteApplicationResponse> genForDeleteApplication() {
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
            f -> f.withMarshaller(DeleteApplicationRequest::getApplicationUrn,
                DeleteApplicationRequest::setApplicationUrn));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApplicationAttributesRequest, ListApplicationAttributesResponse> listApplicationAttributes =
        genForListApplicationAttributes();

    private static HttpRequestDef<ListApplicationAttributesRequest, ListApplicationAttributesResponse> genForListApplicationAttributes() {
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
            f -> f.withMarshaller(ListApplicationAttributesRequest::getApplicationUrn,
                ListApplicationAttributesRequest::setApplicationUrn));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApplicationsRequest, ListApplicationsResponse> listApplications =
        genForListApplications();

    private static HttpRequestDef<ListApplicationsRequest, ListApplicationsResponse> genForListApplications() {
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
            f -> f.withMarshaller(ListApplicationsRequest::getOffset, ListApplicationsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApplicationsRequest::getLimit, ListApplicationsRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationsRequest::getName, ListApplicationsRequest::setName));
        builder.<String>withRequestField("platform",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationsRequest::getPlatform, ListApplicationsRequest::setPlatform));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PublishAppMessageRequest, PublishAppMessageResponse> publishAppMessage =
        genForPublishAppMessage();

    private static HttpRequestDef<PublishAppMessageRequest, PublishAppMessageResponse> genForPublishAppMessage() {
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
            f -> f.withMarshaller(PublishAppMessageRequest::getEndpointUrn, PublishAppMessageRequest::setEndpointUrn));
        builder.<PublishAppMessageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PublishAppMessageRequestBody.class),
            f -> f.withMarshaller(PublishAppMessageRequest::getBody, PublishAppMessageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateApplicationRequest, UpdateApplicationResponse> updateApplication =
        genForUpdateApplication();

    private static HttpRequestDef<UpdateApplicationRequest, UpdateApplicationResponse> genForUpdateApplication() {
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
            f -> f.withMarshaller(UpdateApplicationRequest::getApplicationUrn,
                UpdateApplicationRequest::setApplicationUrn));
        builder.<UpdateApplicationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateApplicationRequestBody.class),
            f -> f.withMarshaller(UpdateApplicationRequest::getBody, UpdateApplicationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateApplicationEndpointRequest, CreateApplicationEndpointResponse> createApplicationEndpoint =
        genForCreateApplicationEndpoint();

    private static HttpRequestDef<CreateApplicationEndpointRequest, CreateApplicationEndpointResponse> genForCreateApplicationEndpoint() {
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
            f -> f.withMarshaller(CreateApplicationEndpointRequest::getApplicationUrn,
                CreateApplicationEndpointRequest::setApplicationUrn));
        builder.<CreateApplicationEndpointRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateApplicationEndpointRequestBody.class),
            f -> f.withMarshaller(CreateApplicationEndpointRequest::getBody,
                CreateApplicationEndpointRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteApplicationEndpointRequest, DeleteApplicationEndpointResponse> deleteApplicationEndpoint =
        genForDeleteApplicationEndpoint();

    private static HttpRequestDef<DeleteApplicationEndpointRequest, DeleteApplicationEndpointResponse> genForDeleteApplicationEndpoint() {
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
            f -> f.withMarshaller(DeleteApplicationEndpointRequest::getEndpointUrn,
                DeleteApplicationEndpointRequest::setEndpointUrn));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApplicationEndpointAttributesRequest, ListApplicationEndpointAttributesResponse> listApplicationEndpointAttributes =
        genForListApplicationEndpointAttributes();

    private static HttpRequestDef<ListApplicationEndpointAttributesRequest, ListApplicationEndpointAttributesResponse> genForListApplicationEndpointAttributes() {
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
            f -> f.withMarshaller(ListApplicationEndpointAttributesRequest::getEndpointUrn,
                ListApplicationEndpointAttributesRequest::setEndpointUrn));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApplicationEndpointsRequest, ListApplicationEndpointsResponse> listApplicationEndpoints =
        genForListApplicationEndpoints();

    private static HttpRequestDef<ListApplicationEndpointsRequest, ListApplicationEndpointsResponse> genForListApplicationEndpoints() {
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
            f -> f.withMarshaller(ListApplicationEndpointsRequest::getApplicationUrn,
                ListApplicationEndpointsRequest::setApplicationUrn));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApplicationEndpointsRequest::getOffset,
                ListApplicationEndpointsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApplicationEndpointsRequest::getLimit,
                ListApplicationEndpointsRequest::setLimit));
        builder.<String>withRequestField("enabled",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationEndpointsRequest::getEnabled,
                ListApplicationEndpointsRequest::setEnabled));
        builder.<String>withRequestField("token",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationEndpointsRequest::getToken,
                ListApplicationEndpointsRequest::setToken));
        builder.<String>withRequestField("user_data",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationEndpointsRequest::getUserData,
                ListApplicationEndpointsRequest::setUserData));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateApplicationEndpointRequest, UpdateApplicationEndpointResponse> updateApplicationEndpoint =
        genForUpdateApplicationEndpoint();

    private static HttpRequestDef<UpdateApplicationEndpointRequest, UpdateApplicationEndpointResponse> genForUpdateApplicationEndpoint() {
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
            f -> f.withMarshaller(UpdateApplicationEndpointRequest::getEndpointUrn,
                UpdateApplicationEndpointRequest::setEndpointUrn));
        builder.<UpdateApplicationEndpointRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateApplicationEndpointRequestBody.class),
            f -> f.withMarshaller(UpdateApplicationEndpointRequest::getBody,
                UpdateApplicationEndpointRequest::setBody));

        // response

        return builder.build();
    }

}

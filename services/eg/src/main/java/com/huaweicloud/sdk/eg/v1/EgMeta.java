package com.huaweicloud.sdk.eg.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.eg.v1.model.*;

@SuppressWarnings("unchecked")
public class EgMeta {

    public static final HttpRequestDef<CreateChannelRequest, CreateChannelResponse> createChannel =
        genForcreateChannel();

    private static HttpRequestDef<CreateChannelRequest, CreateChannelResponse> genForcreateChannel() {
        // basic
        HttpRequestDef.Builder<CreateChannelRequest, CreateChannelResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateChannelRequest.class, CreateChannelResponse.class)
                .withName("CreateChannel")
                .withUri("/v1/{project_id}/channels")
                .withContentType("application/json");

        // requests
        builder.<ChannelCreateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChannelCreateReq.class),
            f -> f.withMarshaller(CreateChannelRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEventSourceRequest, CreateEventSourceResponse> createEventSource =
        genForcreateEventSource();

    private static HttpRequestDef<CreateEventSourceRequest, CreateEventSourceResponse> genForcreateEventSource() {
        // basic
        HttpRequestDef.Builder<CreateEventSourceRequest, CreateEventSourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEventSourceRequest.class, CreateEventSourceResponse.class)
                .withName("CreateEventSource")
                .withUri("/v1/{project_id}/sources")
                .withContentType("application/json");

        // requests
        builder.<CustomizeSourceCreateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CustomizeSourceCreateReq.class),
            f -> f.withMarshaller(CreateEventSourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSubscriptionRequest, CreateSubscriptionResponse> createSubscription =
        genForcreateSubscription();

    private static HttpRequestDef<CreateSubscriptionRequest, CreateSubscriptionResponse> genForcreateSubscription() {
        // basic
        HttpRequestDef.Builder<CreateSubscriptionRequest, CreateSubscriptionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSubscriptionRequest.class, CreateSubscriptionResponse.class)
                .withName("CreateSubscription")
                .withUri("/v1/{project_id}/subscriptions")
                .withContentType("application/json");

        // requests
        builder.<SubscriptionCreateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SubscriptionCreateReq.class),
            f -> f.withMarshaller(CreateSubscriptionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSubscriptionTargetRequest, CreateSubscriptionTargetResponse> createSubscriptionTarget =
        genForcreateSubscriptionTarget();

    private static HttpRequestDef<CreateSubscriptionTargetRequest, CreateSubscriptionTargetResponse> genForcreateSubscriptionTarget() {
        // basic
        HttpRequestDef.Builder<CreateSubscriptionTargetRequest, CreateSubscriptionTargetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateSubscriptionTargetRequest.class, CreateSubscriptionTargetResponse.class)
                .withName("CreateSubscriptionTarget")
                .withUri("/v1/{project_id}/subscriptions/{subscription_id}/targets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("subscription_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSubscriptionTargetRequest::getSubscriptionId, (req, v) -> {
                req.setSubscriptionId(v);
            }));
        builder.<SubscriptionTarget>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SubscriptionTarget.class),
            f -> f.withMarshaller(CreateSubscriptionTargetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteChannelRequest, DeleteChannelResponse> deleteChannel =
        genFordeleteChannel();

    private static HttpRequestDef<DeleteChannelRequest, DeleteChannelResponse> genFordeleteChannel() {
        // basic
        HttpRequestDef.Builder<DeleteChannelRequest, DeleteChannelResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteChannelRequest.class, DeleteChannelResponse.class)
                .withName("DeleteChannel")
                .withUri("/v1/{project_id}/channels/{channel_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteChannelRequest::getChannelId, (req, v) -> {
                req.setChannelId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEventSourceRequest, DeleteEventSourceResponse> deleteEventSource =
        genFordeleteEventSource();

    private static HttpRequestDef<DeleteEventSourceRequest, DeleteEventSourceResponse> genFordeleteEventSource() {
        // basic
        HttpRequestDef.Builder<DeleteEventSourceRequest, DeleteEventSourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteEventSourceRequest.class, DeleteEventSourceResponse.class)
                .withName("DeleteEventSource")
                .withUri("/v1/{project_id}/sources/{source_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("source_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEventSourceRequest::getSourceId, (req, v) -> {
                req.setSourceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSubscriptionRequest, DeleteSubscriptionResponse> deleteSubscription =
        genFordeleteSubscription();

    private static HttpRequestDef<DeleteSubscriptionRequest, DeleteSubscriptionResponse> genFordeleteSubscription() {
        // basic
        HttpRequestDef.Builder<DeleteSubscriptionRequest, DeleteSubscriptionResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSubscriptionRequest.class, DeleteSubscriptionResponse.class)
                .withName("DeleteSubscription")
                .withUri("/v1/{project_id}/subscriptions/{subscription_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("subscription_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSubscriptionRequest::getSubscriptionId, (req, v) -> {
                req.setSubscriptionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSubscriptionTargetRequest, DeleteSubscriptionTargetResponse> deleteSubscriptionTarget =
        genFordeleteSubscriptionTarget();

    private static HttpRequestDef<DeleteSubscriptionTargetRequest, DeleteSubscriptionTargetResponse> genFordeleteSubscriptionTarget() {
        // basic
        HttpRequestDef.Builder<DeleteSubscriptionTargetRequest, DeleteSubscriptionTargetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteSubscriptionTargetRequest.class,
                    DeleteSubscriptionTargetResponse.class)
                .withName("DeleteSubscriptionTarget")
                .withUri("/v1/{project_id}/subscriptions/{subscription_id}/targets/{target_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("subscription_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSubscriptionTargetRequest::getSubscriptionId, (req, v) -> {
                req.setSubscriptionId(v);
            }));
        builder.<String>withRequestField("target_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSubscriptionTargetRequest::getTargetId, (req, v) -> {
                req.setTargetId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListChannelsRequest, ListChannelsResponse> listChannels = genForlistChannels();

    private static HttpRequestDef<ListChannelsRequest, ListChannelsResponse> genForlistChannels() {
        // basic
        HttpRequestDef.Builder<ListChannelsRequest, ListChannelsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListChannelsRequest.class, ListChannelsResponse.class)
                .withName("ListChannels")
                .withUri("/v1/{project_id}/channels")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListChannelsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListChannelsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListChannelsRequest::getSort, (req, v) -> {
                req.setSort(v);
            }));
        builder.<ListChannelsRequest.ProviderTypeEnum>withRequestField("provider_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListChannelsRequest.ProviderTypeEnum.class),
            f -> f.withMarshaller(ListChannelsRequest::getProviderType, (req, v) -> {
                req.setProviderType(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListChannelsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("fuzzy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListChannelsRequest::getFuzzyName, (req, v) -> {
                req.setFuzzyName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEventSourcesRequest, ListEventSourcesResponse> listEventSources =
        genForlistEventSources();

    private static HttpRequestDef<ListEventSourcesRequest, ListEventSourcesResponse> genForlistEventSources() {
        // basic
        HttpRequestDef.Builder<ListEventSourcesRequest, ListEventSourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEventSourcesRequest.class, ListEventSourcesResponse.class)
                .withName("ListEventSources")
                .withUri("/v1/{project_id}/sources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("channel_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventSourcesRequest::getChannelId, (req, v) -> {
                req.setChannelId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEventSourcesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEventSourcesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventSourcesRequest::getSort, (req, v) -> {
                req.setSort(v);
            }));
        builder.<ListEventSourcesRequest.ProviderTypeEnum>withRequestField("provider_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEventSourcesRequest.ProviderTypeEnum.class),
            f -> f.withMarshaller(ListEventSourcesRequest::getProviderType, (req, v) -> {
                req.setProviderType(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventSourcesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("fuzzy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventSourcesRequest::getFuzzyName, (req, v) -> {
                req.setFuzzyName(v);
            }));
        builder.<String>withRequestField("fuzzy_label",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventSourcesRequest::getFuzzyLabel, (req, v) -> {
                req.setFuzzyLabel(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEventTargetRequest, ListEventTargetResponse> listEventTarget =
        genForlistEventTarget();

    private static HttpRequestDef<ListEventTargetRequest, ListEventTargetResponse> genForlistEventTarget() {
        // basic
        HttpRequestDef.Builder<ListEventTargetRequest, ListEventTargetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEventTargetRequest.class, ListEventTargetResponse.class)
                .withName("ListEventTarget")
                .withUri("/v1/{project_id}/target-catalogs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEventTargetRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEventTargetRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventTargetRequest::getSort, (req, v) -> {
                req.setSort(v);
            }));
        builder.<String>withRequestField("fuzzy_label",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventTargetRequest::getFuzzyLabel, (req, v) -> {
                req.setFuzzyLabel(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQuotasRequest, ListQuotasResponse> listQuotas = genForlistQuotas();

    private static HttpRequestDef<ListQuotasRequest, ListQuotasResponse> genForlistQuotas() {
        // basic
        HttpRequestDef.Builder<ListQuotasRequest, ListQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQuotasRequest.class, ListQuotasResponse.class)
                .withName("ListQuotas")
                .withUri("/v1/{project_id}/quotas")
                .withContentType("application/json");

        // requests
        builder.<ListQuotasRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListQuotasRequest.TypeEnum.class),
            f -> f.withMarshaller(ListQuotasRequest::getType, (req, v) -> {
                req.setType(v);
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
                .withUri("/v1/{project_id}/subscriptions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("channel_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubscriptionsRequest::getChannelId, (req, v) -> {
                req.setChannelId(v);
            }));
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
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubscriptionsRequest::getSort, (req, v) -> {
                req.setSort(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubscriptionsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("fuzzy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubscriptionsRequest::getFuzzyName, (req, v) -> {
                req.setFuzzyName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<OperateSubscriptionRequest, OperateSubscriptionResponse> operateSubscription =
        genForoperateSubscription();

    private static HttpRequestDef<OperateSubscriptionRequest, OperateSubscriptionResponse> genForoperateSubscription() {
        // basic
        HttpRequestDef.Builder<OperateSubscriptionRequest, OperateSubscriptionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, OperateSubscriptionRequest.class, OperateSubscriptionResponse.class)
                .withName("OperateSubscription")
                .withUri("/v1/{project_id}/subscriptions/operation")
                .withContentType("application/json");

        // requests
        builder.<SubscriptionOperateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SubscriptionOperateReq.class),
            f -> f.withMarshaller(OperateSubscriptionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PutEventsRequest, PutEventsResponse> putEvents = genForputEvents();

    private static HttpRequestDef<PutEventsRequest, PutEventsResponse> genForputEvents() {
        // basic
        HttpRequestDef.Builder<PutEventsRequest, PutEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PutEventsRequest.class, PutEventsResponse.class)
                .withName("PutEvents")
                .withUri("/v1/{project_id}/channels/{channel_id}/events")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutEventsRequest::getChannelId, (req, v) -> {
                req.setChannelId(v);
            }));
        builder.<PutEventsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PutEventsReq.class),
            f -> f.withMarshaller(PutEventsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailOfChannelRequest, ShowDetailOfChannelResponse> showDetailOfChannel =
        genForshowDetailOfChannel();

    private static HttpRequestDef<ShowDetailOfChannelRequest, ShowDetailOfChannelResponse> genForshowDetailOfChannel() {
        // basic
        HttpRequestDef.Builder<ShowDetailOfChannelRequest, ShowDetailOfChannelResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDetailOfChannelRequest.class, ShowDetailOfChannelResponse.class)
                .withName("ShowDetailOfChannel")
                .withUri("/v1/{project_id}/channels/{channel_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailOfChannelRequest::getChannelId, (req, v) -> {
                req.setChannelId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailOfEventSourceRequest, ShowDetailOfEventSourceResponse> showDetailOfEventSource =
        genForshowDetailOfEventSource();

    private static HttpRequestDef<ShowDetailOfEventSourceRequest, ShowDetailOfEventSourceResponse> genForshowDetailOfEventSource() {
        // basic
        HttpRequestDef.Builder<ShowDetailOfEventSourceRequest, ShowDetailOfEventSourceResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDetailOfEventSourceRequest.class, ShowDetailOfEventSourceResponse.class)
            .withName("ShowDetailOfEventSource")
            .withUri("/v1/{project_id}/sources/{source_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("source_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailOfEventSourceRequest::getSourceId, (req, v) -> {
                req.setSourceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailOfSubscriptionRequest, ShowDetailOfSubscriptionResponse> showDetailOfSubscription =
        genForshowDetailOfSubscription();

    private static HttpRequestDef<ShowDetailOfSubscriptionRequest, ShowDetailOfSubscriptionResponse> genForshowDetailOfSubscription() {
        // basic
        HttpRequestDef.Builder<ShowDetailOfSubscriptionRequest, ShowDetailOfSubscriptionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowDetailOfSubscriptionRequest.class, ShowDetailOfSubscriptionResponse.class)
                .withName("ShowDetailOfSubscription")
                .withUri("/v1/{project_id}/subscriptions/{subscription_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("subscription_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailOfSubscriptionRequest::getSubscriptionId, (req, v) -> {
                req.setSubscriptionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailOfSubscriptionTargetRequest, ShowDetailOfSubscriptionTargetResponse> showDetailOfSubscriptionTarget =
        genForshowDetailOfSubscriptionTarget();

    private static HttpRequestDef<ShowDetailOfSubscriptionTargetRequest, ShowDetailOfSubscriptionTargetResponse> genForshowDetailOfSubscriptionTarget() {
        // basic
        HttpRequestDef.Builder<ShowDetailOfSubscriptionTargetRequest, ShowDetailOfSubscriptionTargetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDetailOfSubscriptionTargetRequest.class,
                    ShowDetailOfSubscriptionTargetResponse.class)
                .withName("ShowDetailOfSubscriptionTarget")
                .withUri("/v1/{project_id}/subscriptions/{subscription_id}/targets/{target_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("subscription_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailOfSubscriptionTargetRequest::getSubscriptionId, (req, v) -> {
                req.setSubscriptionId(v);
            }));
        builder.<String>withRequestField("target_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailOfSubscriptionTargetRequest::getTargetId, (req, v) -> {
                req.setTargetId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateChannelRequest, UpdateChannelResponse> updateChannel =
        genForupdateChannel();

    private static HttpRequestDef<UpdateChannelRequest, UpdateChannelResponse> genForupdateChannel() {
        // basic
        HttpRequestDef.Builder<UpdateChannelRequest, UpdateChannelResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateChannelRequest.class, UpdateChannelResponse.class)
                .withName("UpdateChannel")
                .withUri("/v1/{project_id}/channels/{channel_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateChannelRequest::getChannelId, (req, v) -> {
                req.setChannelId(v);
            }));
        builder.<ChannelUpdateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChannelUpdateReq.class),
            f -> f.withMarshaller(UpdateChannelRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEventSourceRequest, UpdateEventSourceResponse> updateEventSource =
        genForupdateEventSource();

    private static HttpRequestDef<UpdateEventSourceRequest, UpdateEventSourceResponse> genForupdateEventSource() {
        // basic
        HttpRequestDef.Builder<UpdateEventSourceRequest, UpdateEventSourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateEventSourceRequest.class, UpdateEventSourceResponse.class)
                .withName("UpdateEventSource")
                .withUri("/v1/{project_id}/sources/{source_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("source_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEventSourceRequest::getSourceId, (req, v) -> {
                req.setSourceId(v);
            }));
        builder.<CustomizeSourceUpdateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CustomizeSourceUpdateReq.class),
            f -> f.withMarshaller(UpdateEventSourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSubscriptionRequest, UpdateSubscriptionResponse> updateSubscription =
        genForupdateSubscription();

    private static HttpRequestDef<UpdateSubscriptionRequest, UpdateSubscriptionResponse> genForupdateSubscription() {
        // basic
        HttpRequestDef.Builder<UpdateSubscriptionRequest, UpdateSubscriptionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSubscriptionRequest.class, UpdateSubscriptionResponse.class)
                .withName("UpdateSubscription")
                .withUri("/v1/{project_id}/subscriptions/{subscription_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("subscription_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSubscriptionRequest::getSubscriptionId, (req, v) -> {
                req.setSubscriptionId(v);
            }));
        builder.<SubscriptionUpdateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SubscriptionUpdateReq.class),
            f -> f.withMarshaller(UpdateSubscriptionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSubscriptionSourceRequest, UpdateSubscriptionSourceResponse> updateSubscriptionSource =
        genForupdateSubscriptionSource();

    private static HttpRequestDef<UpdateSubscriptionSourceRequest, UpdateSubscriptionSourceResponse> genForupdateSubscriptionSource() {
        // basic
        HttpRequestDef.Builder<UpdateSubscriptionSourceRequest, UpdateSubscriptionSourceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateSubscriptionSourceRequest.class, UpdateSubscriptionSourceResponse.class)
                .withName("UpdateSubscriptionSource")
                .withUri("/v1/{project_id}/subscriptions/{subscription_id}/sources/{source_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("subscription_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSubscriptionSourceRequest::getSubscriptionId, (req, v) -> {
                req.setSubscriptionId(v);
            }));
        builder.<String>withRequestField("source_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSubscriptionSourceRequest::getSourceId, (req, v) -> {
                req.setSourceId(v);
            }));
        builder.<SubscriptionSource>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SubscriptionSource.class),
            f -> f.withMarshaller(UpdateSubscriptionSourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSubscriptionTargetRequest, UpdateSubscriptionTargetResponse> updateSubscriptionTarget =
        genForupdateSubscriptionTarget();

    private static HttpRequestDef<UpdateSubscriptionTargetRequest, UpdateSubscriptionTargetResponse> genForupdateSubscriptionTarget() {
        // basic
        HttpRequestDef.Builder<UpdateSubscriptionTargetRequest, UpdateSubscriptionTargetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateSubscriptionTargetRequest.class, UpdateSubscriptionTargetResponse.class)
                .withName("UpdateSubscriptionTarget")
                .withUri("/v1/{project_id}/subscriptions/{subscription_id}/targets/{target_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("subscription_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSubscriptionTargetRequest::getSubscriptionId, (req, v) -> {
                req.setSubscriptionId(v);
            }));
        builder.<String>withRequestField("target_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSubscriptionTargetRequest::getTargetId, (req, v) -> {
                req.setTargetId(v);
            }));
        builder.<SubscriptionTarget>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SubscriptionTarget.class),
            f -> f.withMarshaller(UpdateSubscriptionTargetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}

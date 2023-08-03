package com.huaweicloud.sdk.eg.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.eg.v1.model.AgencyCreateReq;
import com.huaweicloud.sdk.eg.v1.model.ChannelCreateReq;
import com.huaweicloud.sdk.eg.v1.model.ChannelUpdateReq;
import com.huaweicloud.sdk.eg.v1.model.CheckPutEventsReq;
import com.huaweicloud.sdk.eg.v1.model.CheckPutEventsRequest;
import com.huaweicloud.sdk.eg.v1.model.CheckPutEventsResponse;
import com.huaweicloud.sdk.eg.v1.model.ConnectionCreateReq;
import com.huaweicloud.sdk.eg.v1.model.ConnectionUpdateReq;
import com.huaweicloud.sdk.eg.v1.model.CreateAgenciesRequest;
import com.huaweicloud.sdk.eg.v1.model.CreateAgenciesResponse;
import com.huaweicloud.sdk.eg.v1.model.CreateChannelRequest;
import com.huaweicloud.sdk.eg.v1.model.CreateChannelResponse;
import com.huaweicloud.sdk.eg.v1.model.CreateConnectionRequest;
import com.huaweicloud.sdk.eg.v1.model.CreateConnectionResponse;
import com.huaweicloud.sdk.eg.v1.model.CreateEndpointRequest;
import com.huaweicloud.sdk.eg.v1.model.CreateEndpointResponse;
import com.huaweicloud.sdk.eg.v1.model.CreateEventSourceRequest;
import com.huaweicloud.sdk.eg.v1.model.CreateEventSourceResponse;
import com.huaweicloud.sdk.eg.v1.model.CreateEventStreamingRequest;
import com.huaweicloud.sdk.eg.v1.model.CreateEventStreamingResponse;
import com.huaweicloud.sdk.eg.v1.model.CreateSubscriptionRequest;
import com.huaweicloud.sdk.eg.v1.model.CreateSubscriptionResponse;
import com.huaweicloud.sdk.eg.v1.model.CreateSubscriptionTargetRequest;
import com.huaweicloud.sdk.eg.v1.model.CreateSubscriptionTargetResponse;
import com.huaweicloud.sdk.eg.v1.model.CustomizeSourceCreateReq;
import com.huaweicloud.sdk.eg.v1.model.CustomizeSourceUpdateReq;
import com.huaweicloud.sdk.eg.v1.model.DeleteChannelRequest;
import com.huaweicloud.sdk.eg.v1.model.DeleteChannelResponse;
import com.huaweicloud.sdk.eg.v1.model.DeleteConnectionRequest;
import com.huaweicloud.sdk.eg.v1.model.DeleteConnectionResponse;
import com.huaweicloud.sdk.eg.v1.model.DeleteEndpointRequest;
import com.huaweicloud.sdk.eg.v1.model.DeleteEndpointResponse;
import com.huaweicloud.sdk.eg.v1.model.DeleteEventSourceRequest;
import com.huaweicloud.sdk.eg.v1.model.DeleteEventSourceResponse;
import com.huaweicloud.sdk.eg.v1.model.DeleteEventStreamingRequest;
import com.huaweicloud.sdk.eg.v1.model.DeleteEventStreamingResponse;
import com.huaweicloud.sdk.eg.v1.model.DeleteSubscriptionRequest;
import com.huaweicloud.sdk.eg.v1.model.DeleteSubscriptionResponse;
import com.huaweicloud.sdk.eg.v1.model.DeleteSubscriptionTargetRequest;
import com.huaweicloud.sdk.eg.v1.model.DeleteSubscriptionTargetResponse;
import com.huaweicloud.sdk.eg.v1.model.EndpointCreateReq;
import com.huaweicloud.sdk.eg.v1.model.EndpointUpdateReq;
import com.huaweicloud.sdk.eg.v1.model.EventStreamingCreateReq;
import com.huaweicloud.sdk.eg.v1.model.EventStreamingDetail;
import com.huaweicloud.sdk.eg.v1.model.EventStreamingOperateReq;
import com.huaweicloud.sdk.eg.v1.model.EventStreamingUpdateReq;
import com.huaweicloud.sdk.eg.v1.model.ListAgenciesRequest;
import com.huaweicloud.sdk.eg.v1.model.ListAgenciesResponse;
import com.huaweicloud.sdk.eg.v1.model.ListApiVersionsRequest;
import com.huaweicloud.sdk.eg.v1.model.ListApiVersionsResponse;
import com.huaweicloud.sdk.eg.v1.model.ListChannelsRequest;
import com.huaweicloud.sdk.eg.v1.model.ListChannelsResponse;
import com.huaweicloud.sdk.eg.v1.model.ListConnectionsRequest;
import com.huaweicloud.sdk.eg.v1.model.ListConnectionsResponse;
import com.huaweicloud.sdk.eg.v1.model.ListEndpointsRequest;
import com.huaweicloud.sdk.eg.v1.model.ListEndpointsResponse;
import com.huaweicloud.sdk.eg.v1.model.ListEventSourcesRequest;
import com.huaweicloud.sdk.eg.v1.model.ListEventSourcesResponse;
import com.huaweicloud.sdk.eg.v1.model.ListEventStreamingRequest;
import com.huaweicloud.sdk.eg.v1.model.ListEventStreamingResponse;
import com.huaweicloud.sdk.eg.v1.model.ListEventTargetRequest;
import com.huaweicloud.sdk.eg.v1.model.ListEventTargetResponse;
import com.huaweicloud.sdk.eg.v1.model.ListObsBucketsRequest;
import com.huaweicloud.sdk.eg.v1.model.ListObsBucketsResponse;
import com.huaweicloud.sdk.eg.v1.model.ListPubMetricsRequest;
import com.huaweicloud.sdk.eg.v1.model.ListPubMetricsResponse;
import com.huaweicloud.sdk.eg.v1.model.ListQuotasRequest;
import com.huaweicloud.sdk.eg.v1.model.ListQuotasResponse;
import com.huaweicloud.sdk.eg.v1.model.ListSubMetricsRequest;
import com.huaweicloud.sdk.eg.v1.model.ListSubMetricsResponse;
import com.huaweicloud.sdk.eg.v1.model.ListSubscriptionsRequest;
import com.huaweicloud.sdk.eg.v1.model.ListSubscriptionsResponse;
import com.huaweicloud.sdk.eg.v1.model.ListTracedEventsRequest;
import com.huaweicloud.sdk.eg.v1.model.ListTracedEventsResponse;
import com.huaweicloud.sdk.eg.v1.model.ListTriggersRequest;
import com.huaweicloud.sdk.eg.v1.model.ListTriggersResponse;
import com.huaweicloud.sdk.eg.v1.model.ListWorkflowTriggersRequest;
import com.huaweicloud.sdk.eg.v1.model.ListWorkflowTriggersResponse;
import com.huaweicloud.sdk.eg.v1.model.OperateSubscriptionRequest;
import com.huaweicloud.sdk.eg.v1.model.OperateSubscriptionResponse;
import com.huaweicloud.sdk.eg.v1.model.PutEventsReq;
import com.huaweicloud.sdk.eg.v1.model.PutEventsRequest;
import com.huaweicloud.sdk.eg.v1.model.PutEventsResponse;
import com.huaweicloud.sdk.eg.v1.model.PutOfficialEventsRequest;
import com.huaweicloud.sdk.eg.v1.model.PutOfficialEventsResponse;
import com.huaweicloud.sdk.eg.v1.model.ResumeEventStreamingRequest;
import com.huaweicloud.sdk.eg.v1.model.ResumeEventStreamingResponse;
import com.huaweicloud.sdk.eg.v1.model.ShowDetailOfChannelRequest;
import com.huaweicloud.sdk.eg.v1.model.ShowDetailOfChannelResponse;
import com.huaweicloud.sdk.eg.v1.model.ShowDetailOfConnectionRequest;
import com.huaweicloud.sdk.eg.v1.model.ShowDetailOfConnectionResponse;
import com.huaweicloud.sdk.eg.v1.model.ShowDetailOfEventRequest;
import com.huaweicloud.sdk.eg.v1.model.ShowDetailOfEventResponse;
import com.huaweicloud.sdk.eg.v1.model.ShowDetailOfEventSourceRequest;
import com.huaweicloud.sdk.eg.v1.model.ShowDetailOfEventSourceResponse;
import com.huaweicloud.sdk.eg.v1.model.ShowDetailOfEventTraceRequest;
import com.huaweicloud.sdk.eg.v1.model.ShowDetailOfEventTraceResponse;
import com.huaweicloud.sdk.eg.v1.model.ShowDetailOfSubscriptionRequest;
import com.huaweicloud.sdk.eg.v1.model.ShowDetailOfSubscriptionResponse;
import com.huaweicloud.sdk.eg.v1.model.ShowDetailOfSubscriptionTargetRequest;
import com.huaweicloud.sdk.eg.v1.model.ShowDetailOfSubscriptionTargetResponse;
import com.huaweicloud.sdk.eg.v1.model.ShowEventStreamingRequest;
import com.huaweicloud.sdk.eg.v1.model.ShowEventStreamingResponse;
import com.huaweicloud.sdk.eg.v1.model.SubscriptionCreateReq;
import com.huaweicloud.sdk.eg.v1.model.SubscriptionOperateReq;
import com.huaweicloud.sdk.eg.v1.model.SubscriptionSource;
import com.huaweicloud.sdk.eg.v1.model.SubscriptionTarget;
import com.huaweicloud.sdk.eg.v1.model.SubscriptionUpdateReq;
import com.huaweicloud.sdk.eg.v1.model.UpdateChannelRequest;
import com.huaweicloud.sdk.eg.v1.model.UpdateChannelResponse;
import com.huaweicloud.sdk.eg.v1.model.UpdateConnectionRequest;
import com.huaweicloud.sdk.eg.v1.model.UpdateConnectionResponse;
import com.huaweicloud.sdk.eg.v1.model.UpdateEndpointRequest;
import com.huaweicloud.sdk.eg.v1.model.UpdateEndpointResponse;
import com.huaweicloud.sdk.eg.v1.model.UpdateEventSourceRequest;
import com.huaweicloud.sdk.eg.v1.model.UpdateEventSourceResponse;
import com.huaweicloud.sdk.eg.v1.model.UpdateEventStreamingRequest;
import com.huaweicloud.sdk.eg.v1.model.UpdateEventStreamingResponse;
import com.huaweicloud.sdk.eg.v1.model.UpdateSubscriptionRequest;
import com.huaweicloud.sdk.eg.v1.model.UpdateSubscriptionResponse;
import com.huaweicloud.sdk.eg.v1.model.UpdateSubscriptionSourceRequest;
import com.huaweicloud.sdk.eg.v1.model.UpdateSubscriptionSourceResponse;
import com.huaweicloud.sdk.eg.v1.model.UpdateSubscriptionTargetRequest;
import com.huaweicloud.sdk.eg.v1.model.UpdateSubscriptionTargetResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class EgMeta {

    public static final HttpRequestDef<CheckPutEventsRequest, CheckPutEventsResponse> checkPutEvents =
        genForcheckPutEvents();

    private static HttpRequestDef<CheckPutEventsRequest, CheckPutEventsResponse> genForcheckPutEvents() {
        // basic
        HttpRequestDef.Builder<CheckPutEventsRequest, CheckPutEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckPutEventsRequest.class, CheckPutEventsResponse.class)
                .withName("CheckPutEvents")
                .withUri("/v1/{project_id}/events/check")
                .withContentType("application/json");

        // requests
        builder.<CheckPutEventsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CheckPutEventsReq.class),
            f -> f.withMarshaller(CheckPutEventsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CheckPutEventsResponse::getXRequestId, CheckPutEventsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateAgenciesRequest, CreateAgenciesResponse> createAgencies =
        genForcreateAgencies();

    private static HttpRequestDef<CreateAgenciesRequest, CreateAgenciesResponse> genForcreateAgencies() {
        // basic
        HttpRequestDef.Builder<CreateAgenciesRequest, CreateAgenciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAgenciesRequest.class, CreateAgenciesResponse.class)
                .withName("CreateAgencies")
                .withUri("/v1/{project_id}/service-agencies")
                .withContentType("application/json");

        // requests
        builder.<AgencyCreateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AgencyCreateReq.class),
            f -> f.withMarshaller(CreateAgenciesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

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

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateChannelResponse::getXRequestId, CreateChannelResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateConnectionRequest, CreateConnectionResponse> createConnection =
        genForcreateConnection();

    private static HttpRequestDef<CreateConnectionRequest, CreateConnectionResponse> genForcreateConnection() {
        // basic
        HttpRequestDef.Builder<CreateConnectionRequest, CreateConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateConnectionRequest.class, CreateConnectionResponse.class)
                .withName("CreateConnection")
                .withUri("/v1/{project_id}/connections")
                .withContentType("application/json");

        // requests
        builder.<ConnectionCreateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConnectionCreateReq.class),
            f -> f.withMarshaller(CreateConnectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateConnectionResponse::getXRequestId, CreateConnectionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateEndpointRequest, CreateEndpointResponse> createEndpoint =
        genForcreateEndpoint();

    private static HttpRequestDef<CreateEndpointRequest, CreateEndpointResponse> genForcreateEndpoint() {
        // basic
        HttpRequestDef.Builder<CreateEndpointRequest, CreateEndpointResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEndpointRequest.class, CreateEndpointResponse.class)
                .withName("CreateEndpoint")
                .withUri("/v1/{project_id}/endpoints")
                .withContentType("application/json");

        // requests
        builder.<EndpointCreateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EndpointCreateReq.class),
            f -> f.withMarshaller(CreateEndpointRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateEndpointResponse::getXRequestId, CreateEndpointResponse::setXRequestId));
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

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateEventSourceResponse::getXRequestId, CreateEventSourceResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateEventStreamingRequest, CreateEventStreamingResponse> createEventStreaming =
        genForcreateEventStreaming();

    private static HttpRequestDef<CreateEventStreamingRequest, CreateEventStreamingResponse> genForcreateEventStreaming() {
        // basic
        HttpRequestDef.Builder<CreateEventStreamingRequest, CreateEventStreamingResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateEventStreamingRequest.class, CreateEventStreamingResponse.class)
            .withName("CreateEventStreaming")
            .withUri("/v1/{project_id}/eventstreamings")
            .withContentType("application/json");

        // requests
        builder.<EventStreamingCreateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EventStreamingCreateReq.class),
            f -> f.withMarshaller(CreateEventStreamingRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateEventStreamingResponse::getXRequestId,
                CreateEventStreamingResponse::setXRequestId));
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

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateSubscriptionResponse::getXRequestId,
                CreateSubscriptionResponse::setXRequestId));
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

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateSubscriptionTargetResponse::getXRequestId,
                CreateSubscriptionTargetResponse::setXRequestId));
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

    public static final HttpRequestDef<DeleteConnectionRequest, DeleteConnectionResponse> deleteConnection =
        genFordeleteConnection();

    private static HttpRequestDef<DeleteConnectionRequest, DeleteConnectionResponse> genFordeleteConnection() {
        // basic
        HttpRequestDef.Builder<DeleteConnectionRequest, DeleteConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteConnectionRequest.class, DeleteConnectionResponse.class)
                .withName("DeleteConnection")
                .withUri("/v1/{project_id}/connections/{connection_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConnectionRequest::getConnectionId, (req, v) -> {
                req.setConnectionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEndpointRequest, DeleteEndpointResponse> deleteEndpoint =
        genFordeleteEndpoint();

    private static HttpRequestDef<DeleteEndpointRequest, DeleteEndpointResponse> genFordeleteEndpoint() {
        // basic
        HttpRequestDef.Builder<DeleteEndpointRequest, DeleteEndpointResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteEndpointRequest.class, DeleteEndpointResponse.class)
                .withName("DeleteEndpoint")
                .withUri("/v1/{project_id}/endpoints/{endpoint_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("endpoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEndpointRequest::getEndpointId, (req, v) -> {
                req.setEndpointId(v);
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

    public static final HttpRequestDef<DeleteEventStreamingRequest, DeleteEventStreamingResponse> deleteEventStreaming =
        genFordeleteEventStreaming();

    private static HttpRequestDef<DeleteEventStreamingRequest, DeleteEventStreamingResponse> genFordeleteEventStreaming() {
        // basic
        HttpRequestDef.Builder<DeleteEventStreamingRequest, DeleteEventStreamingResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteEventStreamingRequest.class, DeleteEventStreamingResponse.class)
            .withName("DeleteEventStreaming")
            .withUri("/v1/{project_id}/eventstreamings/{eventstreaming_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eventstreaming_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEventStreamingRequest::getEventstreamingId, (req, v) -> {
                req.setEventstreamingId(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteEventStreamingResponse::getXRequestId,
                DeleteEventStreamingResponse::setXRequestId));
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

    public static final HttpRequestDef<ListAgenciesRequest, ListAgenciesResponse> listAgencies = genForlistAgencies();

    private static HttpRequestDef<ListAgenciesRequest, ListAgenciesResponse> genForlistAgencies() {
        // basic
        HttpRequestDef.Builder<ListAgenciesRequest, ListAgenciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAgenciesRequest.class, ListAgenciesResponse.class)
                .withName("ListAgencies")
                .withUri("/v1/{project_id}/service-agencies")
                .withContentType("application/json");

        // requests
        builder.<ListAgenciesRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListAgenciesRequest.TypeEnum.class),
            f -> f.withMarshaller(ListAgenciesRequest::getType, (req, v) -> {
                req.setType(v);
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

    public static final HttpRequestDef<ListConnectionsRequest, ListConnectionsResponse> listConnections =
        genForlistConnections();

    private static HttpRequestDef<ListConnectionsRequest, ListConnectionsResponse> genForlistConnections() {
        // basic
        HttpRequestDef.Builder<ListConnectionsRequest, ListConnectionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListConnectionsRequest.class, ListConnectionsResponse.class)
                .withName("ListConnections")
                .withUri("/v1/{project_id}/connections")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConnectionsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConnectionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsRequest::getSort, (req, v) -> {
                req.setSort(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("fuzzy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsRequest::getFuzzyName, (req, v) -> {
                req.setFuzzyName(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEndpointsRequest, ListEndpointsResponse> listEndpoints =
        genForlistEndpoints();

    private static HttpRequestDef<ListEndpointsRequest, ListEndpointsResponse> genForlistEndpoints() {
        // basic
        HttpRequestDef.Builder<ListEndpointsRequest, ListEndpointsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEndpointsRequest.class, ListEndpointsResponse.class)
                .withName("ListEndpoints")
                .withUri("/v1/{project_id}/endpoints")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEndpointsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEndpointsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getSort, (req, v) -> {
                req.setSort(v);
            }));
        builder.<ListEndpointsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEndpointsRequest.TypeEnum.class),
            f -> f.withMarshaller(ListEndpointsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            }));
        builder.<String>withRequestField("fuzzy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getFuzzyName, (req, v) -> {
                req.setFuzzyName(v);
            }));
        builder.<String>withRequestField("subnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getSubnetId, (req, v) -> {
                req.setSubnetId(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListEndpointsResponse::getXRequestId, ListEndpointsResponse::setXRequestId));
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

    public static final HttpRequestDef<ListEventStreamingRequest, ListEventStreamingResponse> listEventStreaming =
        genForlistEventStreaming();

    private static HttpRequestDef<ListEventStreamingRequest, ListEventStreamingResponse> genForlistEventStreaming() {
        // basic
        HttpRequestDef.Builder<ListEventStreamingRequest, ListEventStreamingResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEventStreamingRequest.class, ListEventStreamingResponse.class)
                .withName("ListEventStreaming")
                .withUri("/v1/{project_id}/eventstreamings")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEventStreamingRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEventStreamingRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response
        builder.<List<EventStreamingDetail>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEventStreamingResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(EventStreamingDetail.class));

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListEventStreamingResponse::getXRequestId,
                ListEventStreamingResponse::setXRequestId));
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
        builder.<List<ListEventTargetRequest.SupportTypesEnum>>withRequestField("support_types",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEventTargetRequest::getSupportTypes, (req, v) -> {
                req.setSupportTypes(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPubMetricsRequest, ListPubMetricsResponse> listPubMetrics =
        genForlistPubMetrics();

    private static HttpRequestDef<ListPubMetricsRequest, ListPubMetricsResponse> genForlistPubMetrics() {
        // basic
        HttpRequestDef.Builder<ListPubMetricsRequest, ListPubMetricsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPubMetricsRequest.class, ListPubMetricsResponse.class)
                .withName("ListPubMetrics")
                .withUri("/v1/{project_id}/metrics/pub")
                .withContentType("application/json");

        // requests
        builder.<ListPubMetricsRequest.FilterEnum>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPubMetricsRequest.FilterEnum.class),
            f -> f.withMarshaller(ListPubMetricsRequest::getFilter, (req, v) -> {
                req.setFilter(v);
            }));
        builder.<Integer>withRequestField("period",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPubMetricsRequest::getPeriod, (req, v) -> {
                req.setPeriod(v);
            }));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListPubMetricsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListPubMetricsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("channel_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPubMetricsRequest::getChannelId, (req, v) -> {
                req.setChannelId(v);
            }));
        builder.<ListPubMetricsRequest.ProviderTypeEnum>withRequestField("provider_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPubMetricsRequest.ProviderTypeEnum.class),
            f -> f.withMarshaller(ListPubMetricsRequest::getProviderType, (req, v) -> {
                req.setProviderType(v);
            }));
        builder.<String>withRequestField("source_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPubMetricsRequest::getSourceName, (req, v) -> {
                req.setSourceName(v);
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

    public static final HttpRequestDef<ListSubMetricsRequest, ListSubMetricsResponse> listSubMetrics =
        genForlistSubMetrics();

    private static HttpRequestDef<ListSubMetricsRequest, ListSubMetricsResponse> genForlistSubMetrics() {
        // basic
        HttpRequestDef.Builder<ListSubMetricsRequest, ListSubMetricsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSubMetricsRequest.class, ListSubMetricsResponse.class)
                .withName("ListSubMetrics")
                .withUri("/v1/{project_id}/metrics/sub")
                .withContentType("application/json");

        // requests
        builder.<ListSubMetricsRequest.FilterEnum>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSubMetricsRequest.FilterEnum.class),
            f -> f.withMarshaller(ListSubMetricsRequest::getFilter, (req, v) -> {
                req.setFilter(v);
            }));
        builder.<Integer>withRequestField("period",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubMetricsRequest::getPeriod, (req, v) -> {
                req.setPeriod(v);
            }));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSubMetricsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSubMetricsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("subscription_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubMetricsRequest::getSubscriptionId, (req, v) -> {
                req.setSubscriptionId(v);
            }));
        builder.<ListSubMetricsRequest.ProviderTypeEnum>withRequestField("provider_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSubMetricsRequest.ProviderTypeEnum.class),
            f -> f.withMarshaller(ListSubMetricsRequest::getProviderType, (req, v) -> {
                req.setProviderType(v);
            }));
        builder.<String>withRequestField("target_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubMetricsRequest::getTargetId, (req, v) -> {
                req.setTargetId(v);
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
        builder.<String>withRequestField("connection_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubscriptionsRequest::getConnectionId, (req, v) -> {
                req.setConnectionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTracedEventsRequest, ListTracedEventsResponse> listTracedEvents =
        genForlistTracedEvents();

    private static HttpRequestDef<ListTracedEventsRequest, ListTracedEventsResponse> genForlistTracedEvents() {
        // basic
        HttpRequestDef.Builder<ListTracedEventsRequest, ListTracedEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTracedEventsRequest.class, ListTracedEventsResponse.class)
                .withName("ListTracedEvents")
                .withUri("/v1/{project_id}/traced-events")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTracedEventsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTracedEventsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("event_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTracedEventsRequest::getEventId, (req, v) -> {
                req.setEventId(v);
            }));
        builder.<String>withRequestField("source_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTracedEventsRequest::getSourceName, (req, v) -> {
                req.setSourceName(v);
            }));
        builder.<String>withRequestField("event_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTracedEventsRequest::getEventType, (req, v) -> {
                req.setEventType(v);
            }));
        builder.<String>withRequestField("subscription_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTracedEventsRequest::getSubscriptionName, (req, v) -> {
                req.setSubscriptionName(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTracedEventsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTracedEventsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("channel_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTracedEventsRequest::getChannelId, (req, v) -> {
                req.setChannelId(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTracedEventsResponse::getXRequestId, ListTracedEventsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListTriggersRequest, ListTriggersResponse> listTriggers = genForlistTriggers();

    private static HttpRequestDef<ListTriggersRequest, ListTriggersResponse> genForlistTriggers() {
        // basic
        HttpRequestDef.Builder<ListTriggersRequest, ListTriggersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTriggersRequest.class, ListTriggersResponse.class)
                .withName("ListTriggers")
                .withUri("/v1/{project_id}/subscription-triggers/{func_urn}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("func_urn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTriggersRequest::getFuncUrn, (req, v) -> {
                req.setFuncUrn(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTriggersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTriggersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTriggersRequest::getSort, (req, v) -> {
                req.setSort(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkflowTriggersRequest, ListWorkflowTriggersResponse> listWorkflowTriggers =
        genForlistWorkflowTriggers();

    private static HttpRequestDef<ListWorkflowTriggersRequest, ListWorkflowTriggersResponse> genForlistWorkflowTriggers() {
        // basic
        HttpRequestDef.Builder<ListWorkflowTriggersRequest, ListWorkflowTriggersResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListWorkflowTriggersRequest.class, ListWorkflowTriggersResponse.class)
            .withName("ListWorkflowTriggers")
            .withUri("/v1/{project_id}/subscription-triggers/workflow/{workflow_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workflow_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowTriggersRequest::getWorkflowId, (req, v) -> {
                req.setWorkflowId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkflowTriggersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkflowTriggersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowTriggersRequest::getSort, (req, v) -> {
                req.setSort(v);
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

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(OperateSubscriptionResponse::getXRequestId,
                OperateSubscriptionResponse::setXRequestId));
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

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(PutEventsResponse::getXRequestId, PutEventsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<PutOfficialEventsRequest, PutOfficialEventsResponse> putOfficialEvents =
        genForputOfficialEvents();

    private static HttpRequestDef<PutOfficialEventsRequest, PutOfficialEventsResponse> genForputOfficialEvents() {
        // basic
        HttpRequestDef.Builder<PutOfficialEventsRequest, PutOfficialEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PutOfficialEventsRequest.class, PutOfficialEventsResponse.class)
                .withName("PutOfficialEvents")
                .withUri("/v1/{project_id}/official/sources/{source_name}/events")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("source_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutOfficialEventsRequest::getSourceName, (req, v) -> {
                req.setSourceName(v);
            }));
        builder.<PutEventsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PutEventsReq.class),
            f -> f.withMarshaller(PutOfficialEventsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(PutOfficialEventsResponse::getXRequestId, PutOfficialEventsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ResumeEventStreamingRequest, ResumeEventStreamingResponse> resumeEventStreaming =
        genForresumeEventStreaming();

    private static HttpRequestDef<ResumeEventStreamingRequest, ResumeEventStreamingResponse> genForresumeEventStreaming() {
        // basic
        HttpRequestDef.Builder<ResumeEventStreamingRequest, ResumeEventStreamingResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ResumeEventStreamingRequest.class, ResumeEventStreamingResponse.class)
            .withName("ResumeEventStreaming")
            .withUri("/v1/{project_id}/eventstreamings/operate/{eventstreaming_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eventstreaming_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResumeEventStreamingRequest::getEventstreamingId, (req, v) -> {
                req.setEventstreamingId(v);
            }));
        builder.<EventStreamingOperateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EventStreamingOperateReq.class),
            f -> f.withMarshaller(ResumeEventStreamingRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ResumeEventStreamingResponse::getXRequestId,
                ResumeEventStreamingResponse::setXRequestId));
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

    public static final HttpRequestDef<ShowDetailOfConnectionRequest, ShowDetailOfConnectionResponse> showDetailOfConnection =
        genForshowDetailOfConnection();

    private static HttpRequestDef<ShowDetailOfConnectionRequest, ShowDetailOfConnectionResponse> genForshowDetailOfConnection() {
        // basic
        HttpRequestDef.Builder<ShowDetailOfConnectionRequest, ShowDetailOfConnectionResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDetailOfConnectionRequest.class, ShowDetailOfConnectionResponse.class)
            .withName("ShowDetailOfConnection")
            .withUri("/v1/{project_id}/connections/{connection_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailOfConnectionRequest::getConnectionId, (req, v) -> {
                req.setConnectionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailOfEventRequest, ShowDetailOfEventResponse> showDetailOfEvent =
        genForshowDetailOfEvent();

    private static HttpRequestDef<ShowDetailOfEventRequest, ShowDetailOfEventResponse> genForshowDetailOfEvent() {
        // basic
        HttpRequestDef.Builder<ShowDetailOfEventRequest, ShowDetailOfEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDetailOfEventRequest.class, ShowDetailOfEventResponse.class)
                .withName("ShowDetailOfEvent")
                .withUri("/v1/{project_id}/events/detail/{trace_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("trace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailOfEventRequest::getTraceId, (req, v) -> {
                req.setTraceId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowDetailOfEventResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

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

    public static final HttpRequestDef<ShowDetailOfEventTraceRequest, ShowDetailOfEventTraceResponse> showDetailOfEventTrace =
        genForshowDetailOfEventTrace();

    private static HttpRequestDef<ShowDetailOfEventTraceRequest, ShowDetailOfEventTraceResponse> genForshowDetailOfEventTrace() {
        // basic
        HttpRequestDef.Builder<ShowDetailOfEventTraceRequest, ShowDetailOfEventTraceResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDetailOfEventTraceRequest.class, ShowDetailOfEventTraceResponse.class)
            .withName("ShowDetailOfEventTrace")
            .withUri("/v1/{project_id}/events/trace/detail/{trace_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("trace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailOfEventTraceRequest::getTraceId, (req, v) -> {
                req.setTraceId(v);
            }));
        builder.<String>withRequestField("channel_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailOfEventTraceRequest::getChannelId, (req, v) -> {
                req.setChannelId(v);
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

    public static final HttpRequestDef<ShowEventStreamingRequest, ShowEventStreamingResponse> showEventStreaming =
        genForshowEventStreaming();

    private static HttpRequestDef<ShowEventStreamingRequest, ShowEventStreamingResponse> genForshowEventStreaming() {
        // basic
        HttpRequestDef.Builder<ShowEventStreamingRequest, ShowEventStreamingResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEventStreamingRequest.class, ShowEventStreamingResponse.class)
                .withName("ShowEventStreaming")
                .withUri("/v1/{project_id}/eventstreamings/{eventstreaming_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eventstreaming_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEventStreamingRequest::getEventstreamingId, (req, v) -> {
                req.setEventstreamingId(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowEventStreamingResponse::getXRequestId,
                ShowEventStreamingResponse::setXRequestId));
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

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateChannelResponse::getXRequestId, UpdateChannelResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateConnectionRequest, UpdateConnectionResponse> updateConnection =
        genForupdateConnection();

    private static HttpRequestDef<UpdateConnectionRequest, UpdateConnectionResponse> genForupdateConnection() {
        // basic
        HttpRequestDef.Builder<UpdateConnectionRequest, UpdateConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateConnectionRequest.class, UpdateConnectionResponse.class)
                .withName("UpdateConnection")
                .withUri("/v1/{project_id}/connections/{connection_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateConnectionRequest::getConnectionId, (req, v) -> {
                req.setConnectionId(v);
            }));
        builder.<ConnectionUpdateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConnectionUpdateReq.class),
            f -> f.withMarshaller(UpdateConnectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateConnectionResponse::getXRequestId, UpdateConnectionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateEndpointRequest, UpdateEndpointResponse> updateEndpoint =
        genForupdateEndpoint();

    private static HttpRequestDef<UpdateEndpointRequest, UpdateEndpointResponse> genForupdateEndpoint() {
        // basic
        HttpRequestDef.Builder<UpdateEndpointRequest, UpdateEndpointResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateEndpointRequest.class, UpdateEndpointResponse.class)
                .withName("UpdateEndpoint")
                .withUri("/v1/{project_id}/endpoints/{endpoint_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("endpoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEndpointRequest::getEndpointId, (req, v) -> {
                req.setEndpointId(v);
            }));
        builder.<EndpointUpdateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(EndpointUpdateReq.class),
            f -> f.withMarshaller(UpdateEndpointRequest::getBody, (req, v) -> {
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

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateEventSourceResponse::getXRequestId, UpdateEventSourceResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateEventStreamingRequest, UpdateEventStreamingResponse> updateEventStreaming =
        genForupdateEventStreaming();

    private static HttpRequestDef<UpdateEventStreamingRequest, UpdateEventStreamingResponse> genForupdateEventStreaming() {
        // basic
        HttpRequestDef.Builder<UpdateEventStreamingRequest, UpdateEventStreamingResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateEventStreamingRequest.class, UpdateEventStreamingResponse.class)
            .withName("UpdateEventStreaming")
            .withUri("/v1/{project_id}/eventstreamings/{eventstreaming_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eventstreaming_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEventStreamingRequest::getEventstreamingId, (req, v) -> {
                req.setEventstreamingId(v);
            }));
        builder.<EventStreamingUpdateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EventStreamingUpdateReq.class),
            f -> f.withMarshaller(UpdateEventStreamingRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateEventStreamingResponse::getXRequestId,
                UpdateEventStreamingResponse::setXRequestId));
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

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateSubscriptionResponse::getXRequestId,
                UpdateSubscriptionResponse::setXRequestId));
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

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateSubscriptionSourceResponse::getXRequestId,
                UpdateSubscriptionSourceResponse::setXRequestId));
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

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateSubscriptionTargetResponse::getXRequestId,
                UpdateSubscriptionTargetResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersions =
        genForlistApiVersions();

    private static HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> genForlistApiVersions() {
        // basic
        HttpRequestDef.Builder<ListApiVersionsRequest, ListApiVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiVersionsRequest.class, ListApiVersionsResponse.class)
                .withName("ListApiVersions")
                .withUri("/")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListObsBucketsRequest, ListObsBucketsResponse> listObsBuckets =
        genForlistObsBuckets();

    private static HttpRequestDef<ListObsBucketsRequest, ListObsBucketsResponse> genForlistObsBuckets() {
        // basic
        HttpRequestDef.Builder<ListObsBucketsRequest, ListObsBucketsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListObsBucketsRequest.class, ListObsBucketsResponse.class)
                .withName("ListObsBuckets")
                .withUri("/v1/{project_id}/subscriptions/obsbuckets")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListObsBucketsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListObsBucketsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListObsBucketsRequest::getSort, (req, v) -> {
                req.setSort(v);
            }));

        // response

        return builder.build();
    }

}

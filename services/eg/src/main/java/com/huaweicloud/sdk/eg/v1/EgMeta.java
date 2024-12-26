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
import com.huaweicloud.sdk.eg.v1.model.CreateEventSchemaRequest;
import com.huaweicloud.sdk.eg.v1.model.CreateEventSchemaResponse;
import com.huaweicloud.sdk.eg.v1.model.CreateEventSchemaVersionRequest;
import com.huaweicloud.sdk.eg.v1.model.CreateEventSchemaVersionResponse;
import com.huaweicloud.sdk.eg.v1.model.CreateEventSourceRequest;
import com.huaweicloud.sdk.eg.v1.model.CreateEventSourceResponse;
import com.huaweicloud.sdk.eg.v1.model.CreateEventStreamingRequest;
import com.huaweicloud.sdk.eg.v1.model.CreateEventStreamingResponse;
import com.huaweicloud.sdk.eg.v1.model.CreateSubscriptionRequest;
import com.huaweicloud.sdk.eg.v1.model.CreateSubscriptionResponse;
import com.huaweicloud.sdk.eg.v1.model.CreateSubscriptionTargetRequest;
import com.huaweicloud.sdk.eg.v1.model.CreateSubscriptionTargetResponse;
import com.huaweicloud.sdk.eg.v1.model.CustomizeSchemaCreateReq;
import com.huaweicloud.sdk.eg.v1.model.CustomizeSchemaUpdateReq;
import com.huaweicloud.sdk.eg.v1.model.CustomizeSchemaVersionCreateReq;
import com.huaweicloud.sdk.eg.v1.model.CustomizeSourceCreateReq;
import com.huaweicloud.sdk.eg.v1.model.CustomizeSourceUpdateReq;
import com.huaweicloud.sdk.eg.v1.model.DeleteChannelRequest;
import com.huaweicloud.sdk.eg.v1.model.DeleteChannelResponse;
import com.huaweicloud.sdk.eg.v1.model.DeleteConnectionRequest;
import com.huaweicloud.sdk.eg.v1.model.DeleteConnectionResponse;
import com.huaweicloud.sdk.eg.v1.model.DeleteEndpointRequest;
import com.huaweicloud.sdk.eg.v1.model.DeleteEndpointResponse;
import com.huaweicloud.sdk.eg.v1.model.DeleteEventSchemaRequest;
import com.huaweicloud.sdk.eg.v1.model.DeleteEventSchemaResponse;
import com.huaweicloud.sdk.eg.v1.model.DeleteEventSchemaVersionRequest;
import com.huaweicloud.sdk.eg.v1.model.DeleteEventSchemaVersionResponse;
import com.huaweicloud.sdk.eg.v1.model.DeleteEventSourceRequest;
import com.huaweicloud.sdk.eg.v1.model.DeleteEventSourceResponse;
import com.huaweicloud.sdk.eg.v1.model.DeleteEventStreamingRequest;
import com.huaweicloud.sdk.eg.v1.model.DeleteEventStreamingResponse;
import com.huaweicloud.sdk.eg.v1.model.DeleteSubscriptionRequest;
import com.huaweicloud.sdk.eg.v1.model.DeleteSubscriptionResponse;
import com.huaweicloud.sdk.eg.v1.model.DeleteSubscriptionTargetRequest;
import com.huaweicloud.sdk.eg.v1.model.DeleteSubscriptionTargetResponse;
import com.huaweicloud.sdk.eg.v1.model.DiscoverEventSchemaFromDataRequest;
import com.huaweicloud.sdk.eg.v1.model.DiscoverEventSchemaFromDataResponse;
import com.huaweicloud.sdk.eg.v1.model.EndpointCreateReq;
import com.huaweicloud.sdk.eg.v1.model.EndpointUpdateReq;
import com.huaweicloud.sdk.eg.v1.model.EventStreamingCreateReq;
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
import com.huaweicloud.sdk.eg.v1.model.ListEventSchemaRequest;
import com.huaweicloud.sdk.eg.v1.model.ListEventSchemaResponse;
import com.huaweicloud.sdk.eg.v1.model.ListEventSchemaVersionsRequest;
import com.huaweicloud.sdk.eg.v1.model.ListEventSchemaVersionsResponse;
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
import com.huaweicloud.sdk.eg.v1.model.ShowDetailOfEventSchemaRequest;
import com.huaweicloud.sdk.eg.v1.model.ShowDetailOfEventSchemaResponse;
import com.huaweicloud.sdk.eg.v1.model.ShowDetailOfEventSchemaVersionRequest;
import com.huaweicloud.sdk.eg.v1.model.ShowDetailOfEventSchemaVersionResponse;
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
import com.huaweicloud.sdk.eg.v1.model.ShowListOfEventSampleRequest;
import com.huaweicloud.sdk.eg.v1.model.ShowListOfEventSampleResponse;
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
import com.huaweicloud.sdk.eg.v1.model.UpdateEventSchemaRequest;
import com.huaweicloud.sdk.eg.v1.model.UpdateEventSchemaResponse;
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
        genForCheckPutEvents();

    private static HttpRequestDef<CheckPutEventsRequest, CheckPutEventsResponse> genForCheckPutEvents() {
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
            f -> f.withMarshaller(CheckPutEventsRequest::getBody, CheckPutEventsRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CheckPutEventsResponse::getXRequestId, CheckPutEventsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateAgenciesRequest, CreateAgenciesResponse> createAgencies =
        genForCreateAgencies();

    private static HttpRequestDef<CreateAgenciesRequest, CreateAgenciesResponse> genForCreateAgencies() {
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
            f -> f.withMarshaller(CreateAgenciesRequest::getBody, CreateAgenciesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateChannelRequest, CreateChannelResponse> createChannel =
        genForCreateChannel();

    private static HttpRequestDef<CreateChannelRequest, CreateChannelResponse> genForCreateChannel() {
        // basic
        HttpRequestDef.Builder<CreateChannelRequest, CreateChannelResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateChannelRequest.class, CreateChannelResponse.class)
                .withName("CreateChannel")
                .withUri("/v1/{project_id}/channels")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateChannelRequest::getEnterpriseProjectId,
                CreateChannelRequest::setEnterpriseProjectId));
        builder.<ChannelCreateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChannelCreateReq.class),
            f -> f.withMarshaller(CreateChannelRequest::getBody, CreateChannelRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateChannelResponse::getXRequestId, CreateChannelResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateConnectionRequest, CreateConnectionResponse> createConnection =
        genForCreateConnection();

    private static HttpRequestDef<CreateConnectionRequest, CreateConnectionResponse> genForCreateConnection() {
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
            f -> f.withMarshaller(CreateConnectionRequest::getBody, CreateConnectionRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateConnectionResponse::getXRequestId, CreateConnectionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateEndpointRequest, CreateEndpointResponse> createEndpoint =
        genForCreateEndpoint();

    private static HttpRequestDef<CreateEndpointRequest, CreateEndpointResponse> genForCreateEndpoint() {
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
            f -> f.withMarshaller(CreateEndpointRequest::getBody, CreateEndpointRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateEndpointResponse::getXRequestId, CreateEndpointResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateEventSchemaRequest, CreateEventSchemaResponse> createEventSchema =
        genForCreateEventSchema();

    private static HttpRequestDef<CreateEventSchemaRequest, CreateEventSchemaResponse> genForCreateEventSchema() {
        // basic
        HttpRequestDef.Builder<CreateEventSchemaRequest, CreateEventSchemaResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEventSchemaRequest.class, CreateEventSchemaResponse.class)
                .withName("CreateEventSchema")
                .withUri("/v1/{project_id}/schemas")
                .withContentType("application/json");

        // requests
        builder.<CustomizeSchemaCreateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CustomizeSchemaCreateReq.class),
            f -> f.withMarshaller(CreateEventSchemaRequest::getBody, CreateEventSchemaRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateEventSchemaResponse::getXRequestId, CreateEventSchemaResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateEventSchemaVersionRequest, CreateEventSchemaVersionResponse> createEventSchemaVersion =
        genForCreateEventSchemaVersion();

    private static HttpRequestDef<CreateEventSchemaVersionRequest, CreateEventSchemaVersionResponse> genForCreateEventSchemaVersion() {
        // basic
        HttpRequestDef.Builder<CreateEventSchemaVersionRequest, CreateEventSchemaVersionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateEventSchemaVersionRequest.class, CreateEventSchemaVersionResponse.class)
                .withName("CreateEventSchemaVersion")
                .withUri("/v1/{project_id}/schemas/{schema_id}/versions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("schema_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEventSchemaVersionRequest::getSchemaId,
                CreateEventSchemaVersionRequest::setSchemaId));
        builder.<CustomizeSchemaVersionCreateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CustomizeSchemaVersionCreateReq.class),
            f -> f.withMarshaller(CreateEventSchemaVersionRequest::getBody, CreateEventSchemaVersionRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateEventSchemaVersionResponse::getXRequestId,
                CreateEventSchemaVersionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateEventSourceRequest, CreateEventSourceResponse> createEventSource =
        genForCreateEventSource();

    private static HttpRequestDef<CreateEventSourceRequest, CreateEventSourceResponse> genForCreateEventSource() {
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
            f -> f.withMarshaller(CreateEventSourceRequest::getBody, CreateEventSourceRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateEventSourceResponse::getXRequestId, CreateEventSourceResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateEventStreamingRequest, CreateEventStreamingResponse> createEventStreaming =
        genForCreateEventStreaming();

    private static HttpRequestDef<CreateEventStreamingRequest, CreateEventStreamingResponse> genForCreateEventStreaming() {
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
            f -> f.withMarshaller(CreateEventStreamingRequest::getBody, CreateEventStreamingRequest::setBody));

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
        genForCreateSubscription();

    private static HttpRequestDef<CreateSubscriptionRequest, CreateSubscriptionResponse> genForCreateSubscription() {
        // basic
        HttpRequestDef.Builder<CreateSubscriptionRequest, CreateSubscriptionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSubscriptionRequest.class, CreateSubscriptionResponse.class)
                .withName("CreateSubscription")
                .withUri("/v1/{project_id}/subscriptions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSubscriptionRequest::getEnterpriseProjectId,
                CreateSubscriptionRequest::setEnterpriseProjectId));
        builder.<SubscriptionCreateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SubscriptionCreateReq.class),
            f -> f.withMarshaller(CreateSubscriptionRequest::getBody, CreateSubscriptionRequest::setBody));

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
        genForCreateSubscriptionTarget();

    private static HttpRequestDef<CreateSubscriptionTargetRequest, CreateSubscriptionTargetResponse> genForCreateSubscriptionTarget() {
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
            f -> f.withMarshaller(CreateSubscriptionTargetRequest::getSubscriptionId,
                CreateSubscriptionTargetRequest::setSubscriptionId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSubscriptionTargetRequest::getEnterpriseProjectId,
                CreateSubscriptionTargetRequest::setEnterpriseProjectId));
        builder.<SubscriptionTarget>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SubscriptionTarget.class),
            f -> f.withMarshaller(CreateSubscriptionTargetRequest::getBody, CreateSubscriptionTargetRequest::setBody));

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
        genForDeleteChannel();

    private static HttpRequestDef<DeleteChannelRequest, DeleteChannelResponse> genForDeleteChannel() {
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
            f -> f.withMarshaller(DeleteChannelRequest::getChannelId, DeleteChannelRequest::setChannelId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteChannelRequest::getEnterpriseProjectId,
                DeleteChannelRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConnectionRequest, DeleteConnectionResponse> deleteConnection =
        genForDeleteConnection();

    private static HttpRequestDef<DeleteConnectionRequest, DeleteConnectionResponse> genForDeleteConnection() {
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
            f -> f.withMarshaller(DeleteConnectionRequest::getConnectionId, DeleteConnectionRequest::setConnectionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEndpointRequest, DeleteEndpointResponse> deleteEndpoint =
        genForDeleteEndpoint();

    private static HttpRequestDef<DeleteEndpointRequest, DeleteEndpointResponse> genForDeleteEndpoint() {
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
            f -> f.withMarshaller(DeleteEndpointRequest::getEndpointId, DeleteEndpointRequest::setEndpointId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEventSchemaRequest, DeleteEventSchemaResponse> deleteEventSchema =
        genForDeleteEventSchema();

    private static HttpRequestDef<DeleteEventSchemaRequest, DeleteEventSchemaResponse> genForDeleteEventSchema() {
        // basic
        HttpRequestDef.Builder<DeleteEventSchemaRequest, DeleteEventSchemaResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteEventSchemaRequest.class, DeleteEventSchemaResponse.class)
                .withName("DeleteEventSchema")
                .withUri("/v1/{project_id}/schemas/{schema_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("schema_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEventSchemaRequest::getSchemaId, DeleteEventSchemaRequest::setSchemaId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEventSchemaVersionRequest, DeleteEventSchemaVersionResponse> deleteEventSchemaVersion =
        genForDeleteEventSchemaVersion();

    private static HttpRequestDef<DeleteEventSchemaVersionRequest, DeleteEventSchemaVersionResponse> genForDeleteEventSchemaVersion() {
        // basic
        HttpRequestDef.Builder<DeleteEventSchemaVersionRequest, DeleteEventSchemaVersionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteEventSchemaVersionRequest.class,
                    DeleteEventSchemaVersionResponse.class)
                .withName("DeleteEventSchemaVersion")
                .withUri("/v1/{project_id}/schemas/{schema_id}/versions/{version}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("schema_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEventSchemaVersionRequest::getSchemaId,
                DeleteEventSchemaVersionRequest::setSchemaId));
        builder.<Integer>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteEventSchemaVersionRequest::getVersion,
                DeleteEventSchemaVersionRequest::setVersion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEventSourceRequest, DeleteEventSourceResponse> deleteEventSource =
        genForDeleteEventSource();

    private static HttpRequestDef<DeleteEventSourceRequest, DeleteEventSourceResponse> genForDeleteEventSource() {
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
            f -> f.withMarshaller(DeleteEventSourceRequest::getSourceId, DeleteEventSourceRequest::setSourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEventStreamingRequest, DeleteEventStreamingResponse> deleteEventStreaming =
        genForDeleteEventStreaming();

    private static HttpRequestDef<DeleteEventStreamingRequest, DeleteEventStreamingResponse> genForDeleteEventStreaming() {
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
            f -> f.withMarshaller(DeleteEventStreamingRequest::getEventstreamingId,
                DeleteEventStreamingRequest::setEventstreamingId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSubscriptionRequest, DeleteSubscriptionResponse> deleteSubscription =
        genForDeleteSubscription();

    private static HttpRequestDef<DeleteSubscriptionRequest, DeleteSubscriptionResponse> genForDeleteSubscription() {
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
            f -> f.withMarshaller(DeleteSubscriptionRequest::getSubscriptionId,
                DeleteSubscriptionRequest::setSubscriptionId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSubscriptionRequest::getEnterpriseProjectId,
                DeleteSubscriptionRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSubscriptionTargetRequest, DeleteSubscriptionTargetResponse> deleteSubscriptionTarget =
        genForDeleteSubscriptionTarget();

    private static HttpRequestDef<DeleteSubscriptionTargetRequest, DeleteSubscriptionTargetResponse> genForDeleteSubscriptionTarget() {
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
            f -> f.withMarshaller(DeleteSubscriptionTargetRequest::getSubscriptionId,
                DeleteSubscriptionTargetRequest::setSubscriptionId));
        builder.<String>withRequestField("target_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSubscriptionTargetRequest::getTargetId,
                DeleteSubscriptionTargetRequest::setTargetId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSubscriptionTargetRequest::getEnterpriseProjectId,
                DeleteSubscriptionTargetRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DiscoverEventSchemaFromDataRequest, DiscoverEventSchemaFromDataResponse> discoverEventSchemaFromData =
        genForDiscoverEventSchemaFromData();

    private static HttpRequestDef<DiscoverEventSchemaFromDataRequest, DiscoverEventSchemaFromDataResponse> genForDiscoverEventSchemaFromData() {
        // basic
        HttpRequestDef.Builder<DiscoverEventSchemaFromDataRequest, DiscoverEventSchemaFromDataResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DiscoverEventSchemaFromDataRequest.class,
                    DiscoverEventSchemaFromDataResponse.class)
                .withName("DiscoverEventSchemaFromData")
                .withUri("/v1/{project_id}/schema-discover")
                .withContentType("application/json");

        // requests
        builder.<Object>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Object.class),
            f -> f.withMarshaller(DiscoverEventSchemaFromDataRequest::getBody,
                DiscoverEventSchemaFromDataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAgenciesRequest, ListAgenciesResponse> listAgencies = genForListAgencies();

    private static HttpRequestDef<ListAgenciesRequest, ListAgenciesResponse> genForListAgencies() {
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
            f -> f.withMarshaller(ListAgenciesRequest::getType, ListAgenciesRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListChannelsRequest, ListChannelsResponse> listChannels = genForListChannels();

    private static HttpRequestDef<ListChannelsRequest, ListChannelsResponse> genForListChannels() {
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
            f -> f.withMarshaller(ListChannelsRequest::getOffset, ListChannelsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListChannelsRequest::getLimit, ListChannelsRequest::setLimit));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListChannelsRequest::getSort, ListChannelsRequest::setSort));
        builder.<ListChannelsRequest.ProviderTypeEnum>withRequestField("provider_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListChannelsRequest.ProviderTypeEnum.class),
            f -> f.withMarshaller(ListChannelsRequest::getProviderType, ListChannelsRequest::setProviderType));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListChannelsRequest::getName, ListChannelsRequest::setName));
        builder.<String>withRequestField("fuzzy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListChannelsRequest::getFuzzyName, ListChannelsRequest::setFuzzyName));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListChannelsRequest::getEnterpriseProjectId,
                ListChannelsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConnectionsRequest, ListConnectionsResponse> listConnections =
        genForListConnections();

    private static HttpRequestDef<ListConnectionsRequest, ListConnectionsResponse> genForListConnections() {
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
            f -> f.withMarshaller(ListConnectionsRequest::getOffset, ListConnectionsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConnectionsRequest::getLimit, ListConnectionsRequest::setLimit));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsRequest::getSort, ListConnectionsRequest::setSort));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsRequest::getName, ListConnectionsRequest::setName));
        builder.<String>withRequestField("fuzzy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsRequest::getFuzzyName, ListConnectionsRequest::setFuzzyName));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsRequest::getInstanceId, ListConnectionsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEndpointsRequest, ListEndpointsResponse> listEndpoints =
        genForListEndpoints();

    private static HttpRequestDef<ListEndpointsRequest, ListEndpointsResponse> genForListEndpoints() {
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
            f -> f.withMarshaller(ListEndpointsRequest::getOffset, ListEndpointsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEndpointsRequest::getLimit, ListEndpointsRequest::setLimit));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getSort, ListEndpointsRequest::setSort));
        builder.<ListEndpointsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEndpointsRequest.TypeEnum.class),
            f -> f.withMarshaller(ListEndpointsRequest::getType, ListEndpointsRequest::setType));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getName, ListEndpointsRequest::setName));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getVpcId, ListEndpointsRequest::setVpcId));
        builder.<String>withRequestField("fuzzy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getFuzzyName, ListEndpointsRequest::setFuzzyName));
        builder.<String>withRequestField("subnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getSubnetId, ListEndpointsRequest::setSubnetId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListEndpointsResponse::getXRequestId, ListEndpointsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListEventSchemaRequest, ListEventSchemaResponse> listEventSchema =
        genForListEventSchema();

    private static HttpRequestDef<ListEventSchemaRequest, ListEventSchemaResponse> genForListEventSchema() {
        // basic
        HttpRequestDef.Builder<ListEventSchemaRequest, ListEventSchemaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEventSchemaRequest.class, ListEventSchemaResponse.class)
                .withName("ListEventSchema")
                .withUri("/v1/{project_id}/schemas")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEventSchemaRequest::getOffset, ListEventSchemaRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEventSchemaRequest::getLimit, ListEventSchemaRequest::setLimit));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventSchemaRequest::getSort, ListEventSchemaRequest::setSort));
        builder.<ListEventSchemaRequest.ProviderTypeEnum>withRequestField("provider_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEventSchemaRequest.ProviderTypeEnum.class),
            f -> f.withMarshaller(ListEventSchemaRequest::getProviderType, ListEventSchemaRequest::setProviderType));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventSchemaRequest::getName, ListEventSchemaRequest::setName));
        builder.<String>withRequestField("fuzzy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventSchemaRequest::getFuzzyName, ListEventSchemaRequest::setFuzzyName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEventSchemaVersionsRequest, ListEventSchemaVersionsResponse> listEventSchemaVersions =
        genForListEventSchemaVersions();

    private static HttpRequestDef<ListEventSchemaVersionsRequest, ListEventSchemaVersionsResponse> genForListEventSchemaVersions() {
        // basic
        HttpRequestDef.Builder<ListEventSchemaVersionsRequest, ListEventSchemaVersionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListEventSchemaVersionsRequest.class, ListEventSchemaVersionsResponse.class)
            .withName("ListEventSchemaVersions")
            .withUri("/v1/{project_id}/schemas/{schema_id}/versions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("schema_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventSchemaVersionsRequest::getSchemaId,
                ListEventSchemaVersionsRequest::setSchemaId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEventSchemaVersionsRequest::getOffset,
                ListEventSchemaVersionsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEventSchemaVersionsRequest::getLimit, ListEventSchemaVersionsRequest::setLimit));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventSchemaVersionsRequest::getSort, ListEventSchemaVersionsRequest::setSort));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventSchemaVersionsRequest::getVersion,
                ListEventSchemaVersionsRequest::setVersion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEventSourcesRequest, ListEventSourcesResponse> listEventSources =
        genForListEventSources();

    private static HttpRequestDef<ListEventSourcesRequest, ListEventSourcesResponse> genForListEventSources() {
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
            f -> f.withMarshaller(ListEventSourcesRequest::getChannelId, ListEventSourcesRequest::setChannelId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEventSourcesRequest::getOffset, ListEventSourcesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEventSourcesRequest::getLimit, ListEventSourcesRequest::setLimit));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventSourcesRequest::getSort, ListEventSourcesRequest::setSort));
        builder.<ListEventSourcesRequest.ProviderTypeEnum>withRequestField("provider_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEventSourcesRequest.ProviderTypeEnum.class),
            f -> f.withMarshaller(ListEventSourcesRequest::getProviderType, ListEventSourcesRequest::setProviderType));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventSourcesRequest::getName, ListEventSourcesRequest::setName));
        builder.<String>withRequestField("fuzzy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventSourcesRequest::getFuzzyName, ListEventSourcesRequest::setFuzzyName));
        builder.<String>withRequestField("fuzzy_label",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventSourcesRequest::getFuzzyLabel, ListEventSourcesRequest::setFuzzyLabel));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEventStreamingRequest, ListEventStreamingResponse> listEventStreaming =
        genForListEventStreaming();

    private static HttpRequestDef<ListEventStreamingRequest, ListEventStreamingResponse> genForListEventStreaming() {
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
            f -> f.withMarshaller(ListEventStreamingRequest::getOffset, ListEventStreamingRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEventStreamingRequest::getLimit, ListEventStreamingRequest::setLimit));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListEventStreamingResponse::getXRequestId,
                ListEventStreamingResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListEventTargetRequest, ListEventTargetResponse> listEventTarget =
        genForListEventTarget();

    private static HttpRequestDef<ListEventTargetRequest, ListEventTargetResponse> genForListEventTarget() {
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
            f -> f.withMarshaller(ListEventTargetRequest::getOffset, ListEventTargetRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEventTargetRequest::getLimit, ListEventTargetRequest::setLimit));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventTargetRequest::getSort, ListEventTargetRequest::setSort));
        builder.<String>withRequestField("fuzzy_label",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventTargetRequest::getFuzzyLabel, ListEventTargetRequest::setFuzzyLabel));
        builder.<List<ListEventTargetRequest.SupportTypesEnum>>withRequestField("support_types",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEventTargetRequest::getSupportTypes, ListEventTargetRequest::setSupportTypes));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPubMetricsRequest, ListPubMetricsResponse> listPubMetrics =
        genForListPubMetrics();

    private static HttpRequestDef<ListPubMetricsRequest, ListPubMetricsResponse> genForListPubMetrics() {
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
            f -> f.withMarshaller(ListPubMetricsRequest::getFilter, ListPubMetricsRequest::setFilter));
        builder.<Integer>withRequestField("period",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPubMetricsRequest::getPeriod, ListPubMetricsRequest::setPeriod));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListPubMetricsRequest::getStartTime, ListPubMetricsRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListPubMetricsRequest::getEndTime, ListPubMetricsRequest::setEndTime));
        builder.<String>withRequestField("channel_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPubMetricsRequest::getChannelId, ListPubMetricsRequest::setChannelId));
        builder.<ListPubMetricsRequest.ProviderTypeEnum>withRequestField("provider_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPubMetricsRequest.ProviderTypeEnum.class),
            f -> f.withMarshaller(ListPubMetricsRequest::getProviderType, ListPubMetricsRequest::setProviderType));
        builder.<String>withRequestField("source_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPubMetricsRequest::getSourceName, ListPubMetricsRequest::setSourceName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQuotasRequest, ListQuotasResponse> listQuotas = genForListQuotas();

    private static HttpRequestDef<ListQuotasRequest, ListQuotasResponse> genForListQuotas() {
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
            f -> f.withMarshaller(ListQuotasRequest::getType, ListQuotasRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubMetricsRequest, ListSubMetricsResponse> listSubMetrics =
        genForListSubMetrics();

    private static HttpRequestDef<ListSubMetricsRequest, ListSubMetricsResponse> genForListSubMetrics() {
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
            f -> f.withMarshaller(ListSubMetricsRequest::getFilter, ListSubMetricsRequest::setFilter));
        builder.<Integer>withRequestField("period",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubMetricsRequest::getPeriod, ListSubMetricsRequest::setPeriod));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSubMetricsRequest::getStartTime, ListSubMetricsRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSubMetricsRequest::getEndTime, ListSubMetricsRequest::setEndTime));
        builder.<String>withRequestField("subscription_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubMetricsRequest::getSubscriptionId, ListSubMetricsRequest::setSubscriptionId));
        builder.<ListSubMetricsRequest.ProviderTypeEnum>withRequestField("provider_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSubMetricsRequest.ProviderTypeEnum.class),
            f -> f.withMarshaller(ListSubMetricsRequest::getProviderType, ListSubMetricsRequest::setProviderType));
        builder.<String>withRequestField("target_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubMetricsRequest::getTargetId, ListSubMetricsRequest::setTargetId));

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
                .withUri("/v1/{project_id}/subscriptions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("channel_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubscriptionsRequest::getChannelId, ListSubscriptionsRequest::setChannelId));
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
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubscriptionsRequest::getSort, ListSubscriptionsRequest::setSort));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubscriptionsRequest::getName, ListSubscriptionsRequest::setName));
        builder.<String>withRequestField("fuzzy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubscriptionsRequest::getFuzzyName, ListSubscriptionsRequest::setFuzzyName));
        builder.<String>withRequestField("connection_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubscriptionsRequest::getConnectionId,
                ListSubscriptionsRequest::setConnectionId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubscriptionsRequest::getEnterpriseProjectId,
                ListSubscriptionsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTracedEventsRequest, ListTracedEventsResponse> listTracedEvents =
        genForListTracedEvents();

    private static HttpRequestDef<ListTracedEventsRequest, ListTracedEventsResponse> genForListTracedEvents() {
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
            f -> f.withMarshaller(ListTracedEventsRequest::getStartTime, ListTracedEventsRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTracedEventsRequest::getEndTime, ListTracedEventsRequest::setEndTime));
        builder.<String>withRequestField("event_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTracedEventsRequest::getEventId, ListTracedEventsRequest::setEventId));
        builder.<String>withRequestField("source_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTracedEventsRequest::getSourceName, ListTracedEventsRequest::setSourceName));
        builder.<String>withRequestField("event_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTracedEventsRequest::getEventType, ListTracedEventsRequest::setEventType));
        builder.<String>withRequestField("subscription_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTracedEventsRequest::getSubscriptionName,
                ListTracedEventsRequest::setSubscriptionName));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTracedEventsRequest::getLimit, ListTracedEventsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTracedEventsRequest::getOffset, ListTracedEventsRequest::setOffset));
        builder.<String>withRequestField("channel_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTracedEventsRequest::getChannelId, ListTracedEventsRequest::setChannelId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTracedEventsResponse::getXRequestId, ListTracedEventsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListTriggersRequest, ListTriggersResponse> listTriggers = genForListTriggers();

    private static HttpRequestDef<ListTriggersRequest, ListTriggersResponse> genForListTriggers() {
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
            f -> f.withMarshaller(ListTriggersRequest::getFuncUrn, ListTriggersRequest::setFuncUrn));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTriggersRequest::getOffset, ListTriggersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTriggersRequest::getLimit, ListTriggersRequest::setLimit));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTriggersRequest::getSort, ListTriggersRequest::setSort));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkflowTriggersRequest, ListWorkflowTriggersResponse> listWorkflowTriggers =
        genForListWorkflowTriggers();

    private static HttpRequestDef<ListWorkflowTriggersRequest, ListWorkflowTriggersResponse> genForListWorkflowTriggers() {
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
            f -> f.withMarshaller(ListWorkflowTriggersRequest::getWorkflowId,
                ListWorkflowTriggersRequest::setWorkflowId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkflowTriggersRequest::getOffset, ListWorkflowTriggersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkflowTriggersRequest::getLimit, ListWorkflowTriggersRequest::setLimit));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowTriggersRequest::getSort, ListWorkflowTriggersRequest::setSort));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<OperateSubscriptionRequest, OperateSubscriptionResponse> operateSubscription =
        genForOperateSubscription();

    private static HttpRequestDef<OperateSubscriptionRequest, OperateSubscriptionResponse> genForOperateSubscription() {
        // basic
        HttpRequestDef.Builder<OperateSubscriptionRequest, OperateSubscriptionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, OperateSubscriptionRequest.class, OperateSubscriptionResponse.class)
                .withName("OperateSubscription")
                .withUri("/v1/{project_id}/subscriptions/operation")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(OperateSubscriptionRequest::getEnterpriseProjectId,
                OperateSubscriptionRequest::setEnterpriseProjectId));
        builder.<SubscriptionOperateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SubscriptionOperateReq.class),
            f -> f.withMarshaller(OperateSubscriptionRequest::getBody, OperateSubscriptionRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(OperateSubscriptionResponse::getXRequestId,
                OperateSubscriptionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<PutEventsRequest, PutEventsResponse> putEvents = genForPutEvents();

    private static HttpRequestDef<PutEventsRequest, PutEventsResponse> genForPutEvents() {
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
            f -> f.withMarshaller(PutEventsRequest::getChannelId, PutEventsRequest::setChannelId));
        builder.<PutEventsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PutEventsReq.class),
            f -> f.withMarshaller(PutEventsRequest::getBody, PutEventsRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(PutEventsResponse::getXRequestId, PutEventsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<PutOfficialEventsRequest, PutOfficialEventsResponse> putOfficialEvents =
        genForPutOfficialEvents();

    private static HttpRequestDef<PutOfficialEventsRequest, PutOfficialEventsResponse> genForPutOfficialEvents() {
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
            f -> f.withMarshaller(PutOfficialEventsRequest::getSourceName, PutOfficialEventsRequest::setSourceName));
        builder.<PutEventsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PutEventsReq.class),
            f -> f.withMarshaller(PutOfficialEventsRequest::getBody, PutOfficialEventsRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(PutOfficialEventsResponse::getXRequestId, PutOfficialEventsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ResumeEventStreamingRequest, ResumeEventStreamingResponse> resumeEventStreaming =
        genForResumeEventStreaming();

    private static HttpRequestDef<ResumeEventStreamingRequest, ResumeEventStreamingResponse> genForResumeEventStreaming() {
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
            f -> f.withMarshaller(ResumeEventStreamingRequest::getEventstreamingId,
                ResumeEventStreamingRequest::setEventstreamingId));
        builder.<EventStreamingOperateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EventStreamingOperateReq.class),
            f -> f.withMarshaller(ResumeEventStreamingRequest::getBody, ResumeEventStreamingRequest::setBody));

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
        genForShowDetailOfChannel();

    private static HttpRequestDef<ShowDetailOfChannelRequest, ShowDetailOfChannelResponse> genForShowDetailOfChannel() {
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
            f -> f.withMarshaller(ShowDetailOfChannelRequest::getChannelId, ShowDetailOfChannelRequest::setChannelId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailOfChannelRequest::getEnterpriseProjectId,
                ShowDetailOfChannelRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailOfConnectionRequest, ShowDetailOfConnectionResponse> showDetailOfConnection =
        genForShowDetailOfConnection();

    private static HttpRequestDef<ShowDetailOfConnectionRequest, ShowDetailOfConnectionResponse> genForShowDetailOfConnection() {
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
            f -> f.withMarshaller(ShowDetailOfConnectionRequest::getConnectionId,
                ShowDetailOfConnectionRequest::setConnectionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailOfEventRequest, ShowDetailOfEventResponse> showDetailOfEvent =
        genForShowDetailOfEvent();

    private static HttpRequestDef<ShowDetailOfEventRequest, ShowDetailOfEventResponse> genForShowDetailOfEvent() {
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
            f -> f.withMarshaller(ShowDetailOfEventRequest::getTraceId, ShowDetailOfEventRequest::setTraceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowDetailOfEventResponse::getBody, ShowDetailOfEventResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailOfEventSchemaRequest, ShowDetailOfEventSchemaResponse> showDetailOfEventSchema =
        genForShowDetailOfEventSchema();

    private static HttpRequestDef<ShowDetailOfEventSchemaRequest, ShowDetailOfEventSchemaResponse> genForShowDetailOfEventSchema() {
        // basic
        HttpRequestDef.Builder<ShowDetailOfEventSchemaRequest, ShowDetailOfEventSchemaResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDetailOfEventSchemaRequest.class, ShowDetailOfEventSchemaResponse.class)
            .withName("ShowDetailOfEventSchema")
            .withUri("/v1/{project_id}/schemas/{schema_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("schema_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailOfEventSchemaRequest::getSchemaId,
                ShowDetailOfEventSchemaRequest::setSchemaId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailOfEventSchemaVersionRequest, ShowDetailOfEventSchemaVersionResponse> showDetailOfEventSchemaVersion =
        genForShowDetailOfEventSchemaVersion();

    private static HttpRequestDef<ShowDetailOfEventSchemaVersionRequest, ShowDetailOfEventSchemaVersionResponse> genForShowDetailOfEventSchemaVersion() {
        // basic
        HttpRequestDef.Builder<ShowDetailOfEventSchemaVersionRequest, ShowDetailOfEventSchemaVersionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDetailOfEventSchemaVersionRequest.class,
                    ShowDetailOfEventSchemaVersionResponse.class)
                .withName("ShowDetailOfEventSchemaVersion")
                .withUri("/v1/{project_id}/schemas/{schema_id}/versions/{version}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("schema_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailOfEventSchemaVersionRequest::getSchemaId,
                ShowDetailOfEventSchemaVersionRequest::setSchemaId));
        builder.<Integer>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDetailOfEventSchemaVersionRequest::getVersion,
                ShowDetailOfEventSchemaVersionRequest::setVersion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailOfEventSourceRequest, ShowDetailOfEventSourceResponse> showDetailOfEventSource =
        genForShowDetailOfEventSource();

    private static HttpRequestDef<ShowDetailOfEventSourceRequest, ShowDetailOfEventSourceResponse> genForShowDetailOfEventSource() {
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
            f -> f.withMarshaller(ShowDetailOfEventSourceRequest::getSourceId,
                ShowDetailOfEventSourceRequest::setSourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailOfEventTraceRequest, ShowDetailOfEventTraceResponse> showDetailOfEventTrace =
        genForShowDetailOfEventTrace();

    private static HttpRequestDef<ShowDetailOfEventTraceRequest, ShowDetailOfEventTraceResponse> genForShowDetailOfEventTrace() {
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
            f -> f.withMarshaller(ShowDetailOfEventTraceRequest::getTraceId,
                ShowDetailOfEventTraceRequest::setTraceId));
        builder.<String>withRequestField("channel_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailOfEventTraceRequest::getChannelId,
                ShowDetailOfEventTraceRequest::setChannelId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailOfSubscriptionRequest, ShowDetailOfSubscriptionResponse> showDetailOfSubscription =
        genForShowDetailOfSubscription();

    private static HttpRequestDef<ShowDetailOfSubscriptionRequest, ShowDetailOfSubscriptionResponse> genForShowDetailOfSubscription() {
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
            f -> f.withMarshaller(ShowDetailOfSubscriptionRequest::getSubscriptionId,
                ShowDetailOfSubscriptionRequest::setSubscriptionId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailOfSubscriptionRequest::getEnterpriseProjectId,
                ShowDetailOfSubscriptionRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailOfSubscriptionTargetRequest, ShowDetailOfSubscriptionTargetResponse> showDetailOfSubscriptionTarget =
        genForShowDetailOfSubscriptionTarget();

    private static HttpRequestDef<ShowDetailOfSubscriptionTargetRequest, ShowDetailOfSubscriptionTargetResponse> genForShowDetailOfSubscriptionTarget() {
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
            f -> f.withMarshaller(ShowDetailOfSubscriptionTargetRequest::getSubscriptionId,
                ShowDetailOfSubscriptionTargetRequest::setSubscriptionId));
        builder.<String>withRequestField("target_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailOfSubscriptionTargetRequest::getTargetId,
                ShowDetailOfSubscriptionTargetRequest::setTargetId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailOfSubscriptionTargetRequest::getEnterpriseProjectId,
                ShowDetailOfSubscriptionTargetRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEventStreamingRequest, ShowEventStreamingResponse> showEventStreaming =
        genForShowEventStreaming();

    private static HttpRequestDef<ShowEventStreamingRequest, ShowEventStreamingResponse> genForShowEventStreaming() {
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
            f -> f.withMarshaller(ShowEventStreamingRequest::getEventstreamingId,
                ShowEventStreamingRequest::setEventstreamingId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowEventStreamingResponse::getXRequestId,
                ShowEventStreamingResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowListOfEventSampleRequest, ShowListOfEventSampleResponse> showListOfEventSample =
        genForShowListOfEventSample();

    private static HttpRequestDef<ShowListOfEventSampleRequest, ShowListOfEventSampleResponse> genForShowListOfEventSample() {
        // basic
        HttpRequestDef.Builder<ShowListOfEventSampleRequest, ShowListOfEventSampleResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowListOfEventSampleRequest.class, ShowListOfEventSampleResponse.class)
            .withName("ShowListOfEventSample")
            .withUri("/v1/{project_id}/samples")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowListOfEventSampleRequest::getOffset, ShowListOfEventSampleRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowListOfEventSampleRequest::getLimit, ShowListOfEventSampleRequest::setLimit));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowListOfEventSampleRequest::getSort, ShowListOfEventSampleRequest::setSort));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowListOfEventSampleRequest::getName, ShowListOfEventSampleRequest::setName));
        builder.<String>withRequestField("event_type_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowListOfEventSampleRequest::getEventTypeName,
                ShowListOfEventSampleRequest::setEventTypeName));
        builder.<String>withRequestField("event_source_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowListOfEventSampleRequest::getEventSourceId,
                ShowListOfEventSampleRequest::setEventSourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateChannelRequest, UpdateChannelResponse> updateChannel =
        genForUpdateChannel();

    private static HttpRequestDef<UpdateChannelRequest, UpdateChannelResponse> genForUpdateChannel() {
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
            f -> f.withMarshaller(UpdateChannelRequest::getChannelId, UpdateChannelRequest::setChannelId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateChannelRequest::getEnterpriseProjectId,
                UpdateChannelRequest::setEnterpriseProjectId));
        builder.<ChannelUpdateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChannelUpdateReq.class),
            f -> f.withMarshaller(UpdateChannelRequest::getBody, UpdateChannelRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateChannelResponse::getXRequestId, UpdateChannelResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateConnectionRequest, UpdateConnectionResponse> updateConnection =
        genForUpdateConnection();

    private static HttpRequestDef<UpdateConnectionRequest, UpdateConnectionResponse> genForUpdateConnection() {
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
            f -> f.withMarshaller(UpdateConnectionRequest::getConnectionId, UpdateConnectionRequest::setConnectionId));
        builder.<ConnectionUpdateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConnectionUpdateReq.class),
            f -> f.withMarshaller(UpdateConnectionRequest::getBody, UpdateConnectionRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateConnectionResponse::getXRequestId, UpdateConnectionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateEndpointRequest, UpdateEndpointResponse> updateEndpoint =
        genForUpdateEndpoint();

    private static HttpRequestDef<UpdateEndpointRequest, UpdateEndpointResponse> genForUpdateEndpoint() {
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
            f -> f.withMarshaller(UpdateEndpointRequest::getEndpointId, UpdateEndpointRequest::setEndpointId));
        builder.<EndpointUpdateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(EndpointUpdateReq.class),
            f -> f.withMarshaller(UpdateEndpointRequest::getBody, UpdateEndpointRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEventSchemaRequest, UpdateEventSchemaResponse> updateEventSchema =
        genForUpdateEventSchema();

    private static HttpRequestDef<UpdateEventSchemaRequest, UpdateEventSchemaResponse> genForUpdateEventSchema() {
        // basic
        HttpRequestDef.Builder<UpdateEventSchemaRequest, UpdateEventSchemaResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateEventSchemaRequest.class, UpdateEventSchemaResponse.class)
                .withName("UpdateEventSchema")
                .withUri("/v1/{project_id}/schemas/{schema_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("schema_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEventSchemaRequest::getSchemaId, UpdateEventSchemaRequest::setSchemaId));
        builder.<CustomizeSchemaUpdateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CustomizeSchemaUpdateReq.class),
            f -> f.withMarshaller(UpdateEventSchemaRequest::getBody, UpdateEventSchemaRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateEventSchemaResponse::getXRequestId, UpdateEventSchemaResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateEventSourceRequest, UpdateEventSourceResponse> updateEventSource =
        genForUpdateEventSource();

    private static HttpRequestDef<UpdateEventSourceRequest, UpdateEventSourceResponse> genForUpdateEventSource() {
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
            f -> f.withMarshaller(UpdateEventSourceRequest::getSourceId, UpdateEventSourceRequest::setSourceId));
        builder.<CustomizeSourceUpdateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CustomizeSourceUpdateReq.class),
            f -> f.withMarshaller(UpdateEventSourceRequest::getBody, UpdateEventSourceRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateEventSourceResponse::getXRequestId, UpdateEventSourceResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateEventStreamingRequest, UpdateEventStreamingResponse> updateEventStreaming =
        genForUpdateEventStreaming();

    private static HttpRequestDef<UpdateEventStreamingRequest, UpdateEventStreamingResponse> genForUpdateEventStreaming() {
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
            f -> f.withMarshaller(UpdateEventStreamingRequest::getEventstreamingId,
                UpdateEventStreamingRequest::setEventstreamingId));
        builder.<EventStreamingUpdateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EventStreamingUpdateReq.class),
            f -> f.withMarshaller(UpdateEventStreamingRequest::getBody, UpdateEventStreamingRequest::setBody));

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
        genForUpdateSubscription();

    private static HttpRequestDef<UpdateSubscriptionRequest, UpdateSubscriptionResponse> genForUpdateSubscription() {
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
            f -> f.withMarshaller(UpdateSubscriptionRequest::getSubscriptionId,
                UpdateSubscriptionRequest::setSubscriptionId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSubscriptionRequest::getEnterpriseProjectId,
                UpdateSubscriptionRequest::setEnterpriseProjectId));
        builder.<SubscriptionUpdateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SubscriptionUpdateReq.class),
            f -> f.withMarshaller(UpdateSubscriptionRequest::getBody, UpdateSubscriptionRequest::setBody));

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
        genForUpdateSubscriptionSource();

    private static HttpRequestDef<UpdateSubscriptionSourceRequest, UpdateSubscriptionSourceResponse> genForUpdateSubscriptionSource() {
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
            f -> f.withMarshaller(UpdateSubscriptionSourceRequest::getSubscriptionId,
                UpdateSubscriptionSourceRequest::setSubscriptionId));
        builder.<String>withRequestField("source_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSubscriptionSourceRequest::getSourceId,
                UpdateSubscriptionSourceRequest::setSourceId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSubscriptionSourceRequest::getEnterpriseProjectId,
                UpdateSubscriptionSourceRequest::setEnterpriseProjectId));
        builder.<SubscriptionSource>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SubscriptionSource.class),
            f -> f.withMarshaller(UpdateSubscriptionSourceRequest::getBody, UpdateSubscriptionSourceRequest::setBody));

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
        genForUpdateSubscriptionTarget();

    private static HttpRequestDef<UpdateSubscriptionTargetRequest, UpdateSubscriptionTargetResponse> genForUpdateSubscriptionTarget() {
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
            f -> f.withMarshaller(UpdateSubscriptionTargetRequest::getSubscriptionId,
                UpdateSubscriptionTargetRequest::setSubscriptionId));
        builder.<String>withRequestField("target_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSubscriptionTargetRequest::getTargetId,
                UpdateSubscriptionTargetRequest::setTargetId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSubscriptionTargetRequest::getEnterpriseProjectId,
                UpdateSubscriptionTargetRequest::setEnterpriseProjectId));
        builder.<SubscriptionTarget>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SubscriptionTarget.class),
            f -> f.withMarshaller(UpdateSubscriptionTargetRequest::getBody, UpdateSubscriptionTargetRequest::setBody));

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
        genForListApiVersions();

    private static HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> genForListApiVersions() {
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
        genForListObsBuckets();

    private static HttpRequestDef<ListObsBucketsRequest, ListObsBucketsResponse> genForListObsBuckets() {
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
            f -> f.withMarshaller(ListObsBucketsRequest::getOffset, ListObsBucketsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListObsBucketsRequest::getLimit, ListObsBucketsRequest::setLimit));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListObsBucketsRequest::getSort, ListObsBucketsRequest::setSort));

        // response

        return builder.build();
    }

}

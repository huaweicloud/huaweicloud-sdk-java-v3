package com.huaweicloud.sdk.modelarts.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.modelarts.v1.model.AcceptScheduledEventRequest;
import com.huaweicloud.sdk.modelarts.v1.model.AcceptScheduledEventResponse;
import com.huaweicloud.sdk.modelarts.v1.model.EventUpdate;
import com.huaweicloud.sdk.modelarts.v1.model.ListScheduledEventsRequest;
import com.huaweicloud.sdk.modelarts.v1.model.ListScheduledEventsResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class ModelArtsMeta {

    public static final HttpRequestDef<AcceptScheduledEventRequest, AcceptScheduledEventResponse> acceptScheduledEvent =
        genForAcceptScheduledEvent();

    private static HttpRequestDef<AcceptScheduledEventRequest, AcceptScheduledEventResponse> genForAcceptScheduledEvent() {
        // basic
        HttpRequestDef.Builder<AcceptScheduledEventRequest, AcceptScheduledEventResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AcceptScheduledEventRequest.class, AcceptScheduledEventResponse.class)
            .withName("AcceptScheduledEvent")
            .withUri("/v1/{project_id}/scheduled-events/{event_id}/accept")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("event_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AcceptScheduledEventRequest::getEventId, AcceptScheduledEventRequest::setEventId));
        builder.<String>withRequestField("workspaceId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AcceptScheduledEventRequest::getWorkspaceId,
                AcceptScheduledEventRequest::setWorkspaceId));
        builder.<EventUpdate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EventUpdate.class),
            f -> f.withMarshaller(AcceptScheduledEventRequest::getBody, AcceptScheduledEventRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AcceptScheduledEventResponse::getXRequestId,
                AcceptScheduledEventResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListScheduledEventsRequest, ListScheduledEventsResponse> listScheduledEvents =
        genForListScheduledEvents();

    private static HttpRequestDef<ListScheduledEventsRequest, ListScheduledEventsResponse> genForListScheduledEvents() {
        // basic
        HttpRequestDef.Builder<ListScheduledEventsRequest, ListScheduledEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScheduledEventsRequest.class, ListScheduledEventsResponse.class)
                .withName("ListScheduledEvents")
                .withUri("/v1/{project_id}/scheduled-events")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspaceId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduledEventsRequest::getWorkspaceId,
                ListScheduledEventsRequest::setWorkspaceId));
        builder.<List<String>>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListScheduledEventsRequest::getState, ListScheduledEventsRequest::setState));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListScheduledEventsResponse::getXRequestId,
                ListScheduledEventsResponse::setXRequestId));
        return builder.build();
    }

}

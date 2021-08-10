package com.huaweicloud.sdk.cts.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.cts.v3.model.*;

@SuppressWarnings("unchecked")
public class CtsMeta {

    public static final HttpRequestDef<CreateTrackerRequest, CreateTrackerResponse> createTracker =
        genForcreateTracker();

    private static HttpRequestDef<CreateTrackerRequest, CreateTrackerResponse> genForcreateTracker() {
        // basic
        HttpRequestDef.Builder<CreateTrackerRequest, CreateTrackerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTrackerRequest.class, CreateTrackerResponse.class)
                .withName("CreateTracker")
                .withUri("/v3/{project_id}/tracker")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateTrackerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTrackerRequestBody.class),
            f -> f.withMarshaller(CreateTrackerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTrackerRequest, DeleteTrackerResponse> deleteTracker =
        genFordeleteTracker();

    private static HttpRequestDef<DeleteTrackerRequest, DeleteTrackerResponse> genFordeleteTracker() {
        // basic
        HttpRequestDef.Builder<DeleteTrackerRequest, DeleteTrackerResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTrackerRequest.class, DeleteTrackerResponse.class)
                .withName("DeleteTracker")
                .withUri("/v3/{project_id}/trackers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tracker_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTrackerRequest::getTrackerName, (req, v) -> {
                req.setTrackerName(v);
            }));
        builder.<DeleteTrackerRequest.TrackerTypeEnum>withRequestField("tracker_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteTrackerRequest.TrackerTypeEnum.class),
            f -> f.withMarshaller(DeleteTrackerRequest::getTrackerType, (req, v) -> {
                req.setTrackerType(v);
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
                .withUri("/v3/{project_id}/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTracesRequest, ListTracesResponse> listTraces = genForlistTraces();

    private static HttpRequestDef<ListTracesRequest, ListTracesResponse> genForlistTraces() {
        // basic
        HttpRequestDef.Builder<ListTracesRequest, ListTracesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTracesRequest.class, ListTracesResponse.class)
                .withName("ListTraces")
                .withUri("/v3/{project_id}/traces")
                .withContentType("application/json");

        // requests
        builder.<ListTracesRequest.TraceTypeEnum>withRequestField("trace_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListTracesRequest.TraceTypeEnum.class),
            f -> f.withMarshaller(ListTracesRequest::getTraceType, (req, v) -> {
                req.setTraceType(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTracesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Long>withRequestField("from",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTracesRequest::getFrom, (req, v) -> {
                req.setFrom(v);
            }));
        builder.<String>withRequestField("next",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTracesRequest::getNext, (req, v) -> {
                req.setNext(v);
            }));
        builder.<Long>withRequestField("to",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTracesRequest::getTo, (req, v) -> {
                req.setTo(v);
            }));
        builder.<String>withRequestField("tracker_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTracesRequest::getTrackerName, (req, v) -> {
                req.setTrackerName(v);
            }));
        builder.<String>withRequestField("service_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTracesRequest::getServiceType, (req, v) -> {
                req.setServiceType(v);
            }));
        builder.<String>withRequestField("user",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTracesRequest::getUser, (req, v) -> {
                req.setUser(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTracesRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("resource_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTracesRequest::getResourceName, (req, v) -> {
                req.setResourceName(v);
            }));
        builder.<String>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTracesRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("trace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTracesRequest::getTraceId, (req, v) -> {
                req.setTraceId(v);
            }));
        builder.<String>withRequestField("trace_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTracesRequest::getTraceName, (req, v) -> {
                req.setTraceName(v);
            }));
        builder.<ListTracesRequest.TraceRatingEnum>withRequestField("trace_rating",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTracesRequest.TraceRatingEnum.class),
            f -> f.withMarshaller(ListTracesRequest::getTraceRating, (req, v) -> {
                req.setTraceRating(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTrackersRequest, ListTrackersResponse> listTrackers = genForlistTrackers();

    private static HttpRequestDef<ListTrackersRequest, ListTrackersResponse> genForlistTrackers() {
        // basic
        HttpRequestDef.Builder<ListTrackersRequest, ListTrackersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTrackersRequest.class, ListTrackersResponse.class)
                .withName("ListTrackers")
                .withUri("/v3/{project_id}/trackers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tracker_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTrackersRequest::getTrackerName, (req, v) -> {
                req.setTrackerName(v);
            }));
        builder.<ListTrackersRequest.TrackerTypeEnum>withRequestField("tracker_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTrackersRequest.TrackerTypeEnum.class),
            f -> f.withMarshaller(ListTrackersRequest::getTrackerType, (req, v) -> {
                req.setTrackerType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTrackerRequest, UpdateTrackerResponse> updateTracker =
        genForupdateTracker();

    private static HttpRequestDef<UpdateTrackerRequest, UpdateTrackerResponse> genForupdateTracker() {
        // basic
        HttpRequestDef.Builder<UpdateTrackerRequest, UpdateTrackerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTrackerRequest.class, UpdateTrackerResponse.class)
                .withName("UpdateTracker")
                .withUri("/v3/{project_id}/tracker")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<UpdateTrackerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTrackerRequestBody.class),
            f -> f.withMarshaller(UpdateTrackerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}

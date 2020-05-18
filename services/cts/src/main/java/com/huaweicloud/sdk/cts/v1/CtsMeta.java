package com.huaweicloud.sdk.cts.v1;

import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.core.http.HttpMethod;

import com.huaweicloud.sdk.cts.v1.model.*;

@SuppressWarnings("unchecked")
public class CtsMeta {

    public static final HttpRequestDef<CreateTrackerRequest, CreateTrackerResponse> createTracker = genForcreateTracker();

    private static HttpRequestDef<CreateTrackerRequest, CreateTrackerResponse> genForcreateTracker() {
        // basic
        HttpRequestDef.Builder<CreateTrackerRequest, CreateTrackerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTrackerRequest.class, CreateTrackerResponse.class)
                .withUri("/v1.0/{project_id}/tracker")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                CreateTrackerRequestBody.class,
                f -> f.withMarshaller(CreateTrackerRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<DeleteTrackerRequest, DeleteTrackerResponse> deleteTracker = genFordeleteTracker();

    private static HttpRequestDef<DeleteTrackerRequest, DeleteTrackerResponse> genFordeleteTracker() {
        // basic
        HttpRequestDef.Builder<DeleteTrackerRequest, DeleteTrackerResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTrackerRequest.class, DeleteTrackerResponse.class)
                .withUri("/v1.0/{project_id}/tracker");

        // requests
        builder.withRequestField("tracker_name",
                LocationType.Query,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(DeleteTrackerRequest::getTrackerName, (req, v) -> {
                    req.setTrackerName(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ListTracesV2Request, ListTracesV2Response> listTracesV2 = genForlistTracesV2();

    private static HttpRequestDef<ListTracesV2Request, ListTracesV2Response> genForlistTracesV2() {
        // basic
        HttpRequestDef.Builder<ListTracesV2Request, ListTracesV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTracesV2Request.class, ListTracesV2Response.class)
                .withUri("/v2.0/{project_id}/{tracker_name}/trace");

        // requests
        builder.withRequestField("tracker_name",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ListTracesV2Request::getTrackerName, (req, v) -> {
                    req.setTrackerName(v);
                })
        );
        builder.withRequestField("service_type",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListTracesV2Request::getServiceType, (req, v) -> {
                    req.setServiceType(v);
                })
        );
        builder.withRequestField("user",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListTracesV2Request::getUser, (req, v) -> {
                    req.setUser(v);
                })
        );
        builder.withRequestField("from",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Long.class,
                f -> f.withMarshaller(ListTracesV2Request::getFrom, (req, v) -> {
                    req.setFrom(v);
                })
        );
        builder.withRequestField("limit",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Integer.class,
                f -> f.withMarshaller(ListTracesV2Request::getLimit, (req, v) -> {
                    req.setLimit(v);
                })
        );
        builder.withRequestField("next",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListTracesV2Request::getNext, (req, v) -> {
                    req.setNext(v);
                })
        );
        builder.withRequestField("resource_id",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListTracesV2Request::getResourceId, (req, v) -> {
                    req.setResourceId(v);
                })
        );
        builder.withRequestField("resource_name",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListTracesV2Request::getResourceName, (req, v) -> {
                    req.setResourceName(v);
                })
        );
        builder.withRequestField("resource_type",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListTracesV2Request::getResourceType, (req, v) -> {
                    req.setResourceType(v);
                })
        );
        builder.withRequestField("to",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                Long.class,
                f -> f.withMarshaller(ListTracesV2Request::getTo, (req, v) -> {
                    req.setTo(v);
                })
        );
        builder.withRequestField("trace_id",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListTracesV2Request::getTraceId, (req, v) -> {
                    req.setTraceId(v);
                })
        );
        builder.withRequestField("trace_name",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListTracesV2Request::getTraceName, (req, v) -> {
                    req.setTraceName(v);
                })
        );
        builder.withRequestField("trace_rating",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                String.class,
                f -> f.withMarshaller(ListTracesV2Request::getTraceRating, (req, v) -> {
                    req.setTraceRating(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<ListTrackerRequest, ListTrackerResponse> listTracker = genForlistTracker();

    private static HttpRequestDef<ListTrackerRequest, ListTrackerResponse> genForlistTracker() {
        // basic
        HttpRequestDef.Builder<ListTrackerRequest, ListTrackerResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTrackerRequest.class, ListTrackerResponse.class)
                .withUri("/v1.0/{project_id}/tracker");

        // requests
        builder.withRequestField("tracker_name",
                LocationType.Query,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ListTrackerRequest::getTrackerName, (req, v) -> {
                    req.setTrackerName(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<UpdateTrackerRequest, UpdateTrackerResponse> updateTracker = genForupdateTracker();

    private static HttpRequestDef<UpdateTrackerRequest, UpdateTrackerResponse> genForupdateTracker() {
        // basic
        HttpRequestDef.Builder<UpdateTrackerRequest, UpdateTrackerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTrackerRequest.class, UpdateTrackerResponse.class)
                .withUri("/v1.0/{project_id}/tracker/{tracker_name}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("tracker_name",
                LocationType.Path,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(UpdateTrackerRequest::getTrackerName, (req, v) -> {
                    req.setTrackerName(v);
                })
        );
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                UpdateTrackerRequestBody.class,
                f -> f.withMarshaller(UpdateTrackerRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

}


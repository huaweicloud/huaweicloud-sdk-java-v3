package com.huaweicloud.sdk.cts.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.cts.v3.model.BatchCreateResourceTagsRequest;
import com.huaweicloud.sdk.cts.v3.model.BatchCreateResourceTagsRequestBody;
import com.huaweicloud.sdk.cts.v3.model.BatchCreateResourceTagsResponse;
import com.huaweicloud.sdk.cts.v3.model.BatchDeleteResourceTagsRequest;
import com.huaweicloud.sdk.cts.v3.model.BatchDeleteResourceTagsRequestBody;
import com.huaweicloud.sdk.cts.v3.model.BatchDeleteResourceTagsResponse;
import com.huaweicloud.sdk.cts.v3.model.CheckObsBucketsRequest;
import com.huaweicloud.sdk.cts.v3.model.CheckObsBucketsRequestBody;
import com.huaweicloud.sdk.cts.v3.model.CheckObsBucketsResponse;
import com.huaweicloud.sdk.cts.v3.model.CreateNotificationRequest;
import com.huaweicloud.sdk.cts.v3.model.CreateNotificationRequestBody;
import com.huaweicloud.sdk.cts.v3.model.CreateNotificationResponse;
import com.huaweicloud.sdk.cts.v3.model.CreateTrackerRequest;
import com.huaweicloud.sdk.cts.v3.model.CreateTrackerRequestBody;
import com.huaweicloud.sdk.cts.v3.model.CreateTrackerResponse;
import com.huaweicloud.sdk.cts.v3.model.DeleteNotificationRequest;
import com.huaweicloud.sdk.cts.v3.model.DeleteNotificationResponse;
import com.huaweicloud.sdk.cts.v3.model.DeleteTrackerRequest;
import com.huaweicloud.sdk.cts.v3.model.DeleteTrackerResponse;
import com.huaweicloud.sdk.cts.v3.model.ListNotificationsRequest;
import com.huaweicloud.sdk.cts.v3.model.ListNotificationsResponse;
import com.huaweicloud.sdk.cts.v3.model.ListOperationsRequest;
import com.huaweicloud.sdk.cts.v3.model.ListOperationsResponse;
import com.huaweicloud.sdk.cts.v3.model.ListQuotasRequest;
import com.huaweicloud.sdk.cts.v3.model.ListQuotasResponse;
import com.huaweicloud.sdk.cts.v3.model.ListTraceResourcesRequest;
import com.huaweicloud.sdk.cts.v3.model.ListTraceResourcesResponse;
import com.huaweicloud.sdk.cts.v3.model.ListTracesRequest;
import com.huaweicloud.sdk.cts.v3.model.ListTracesResponse;
import com.huaweicloud.sdk.cts.v3.model.ListTrackersRequest;
import com.huaweicloud.sdk.cts.v3.model.ListTrackersResponse;
import com.huaweicloud.sdk.cts.v3.model.ListUserResourcesRequest;
import com.huaweicloud.sdk.cts.v3.model.ListUserResourcesResponse;
import com.huaweicloud.sdk.cts.v3.model.UpdateNotificationRequest;
import com.huaweicloud.sdk.cts.v3.model.UpdateNotificationRequestBody;
import com.huaweicloud.sdk.cts.v3.model.UpdateNotificationResponse;
import com.huaweicloud.sdk.cts.v3.model.UpdateTrackerRequest;
import com.huaweicloud.sdk.cts.v3.model.UpdateTrackerRequestBody;
import com.huaweicloud.sdk.cts.v3.model.UpdateTrackerResponse;

@SuppressWarnings("unchecked")
public class CtsMeta {

    public static final HttpRequestDef<BatchCreateResourceTagsRequest, BatchCreateResourceTagsResponse> batchCreateResourceTags =
        genForbatchCreateResourceTags();

    private static HttpRequestDef<BatchCreateResourceTagsRequest, BatchCreateResourceTagsResponse> genForbatchCreateResourceTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateResourceTagsRequest, BatchCreateResourceTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCreateResourceTagsRequest.class, BatchCreateResourceTagsResponse.class)
            .withName("BatchCreateResourceTags")
            .withUri("/v3/{project_id}/{resource_type}/{resource_id}/tags/create")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateResourceTagsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<BatchCreateResourceTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateResourceTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(BatchCreateResourceTagsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<BatchCreateResourceTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateResourceTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateResourceTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteResourceTagsRequest, BatchDeleteResourceTagsResponse> batchDeleteResourceTags =
        genForbatchDeleteResourceTags();

    private static HttpRequestDef<BatchDeleteResourceTagsRequest, BatchDeleteResourceTagsResponse> genForbatchDeleteResourceTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteResourceTagsRequest, BatchDeleteResourceTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, BatchDeleteResourceTagsRequest.class, BatchDeleteResourceTagsResponse.class)
            .withName("BatchDeleteResourceTags")
            .withUri("/v3/{project_id}/{resource_type}/{resource_id}/tags/delete")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteResourceTagsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<BatchDeleteResourceTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteResourceTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(BatchDeleteResourceTagsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<BatchDeleteResourceTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteResourceTagsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteResourceTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckObsBucketsRequest, CheckObsBucketsResponse> checkObsBuckets =
        genForcheckObsBuckets();

    private static HttpRequestDef<CheckObsBucketsRequest, CheckObsBucketsResponse> genForcheckObsBuckets() {
        // basic
        HttpRequestDef.Builder<CheckObsBucketsRequest, CheckObsBucketsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckObsBucketsRequest.class, CheckObsBucketsResponse.class)
                .withName("CheckObsBuckets")
                .withUri("/v3/{domain_id}/checkbucket")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckObsBucketsRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<CheckObsBucketsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckObsBucketsRequestBody.class),
            f -> f.withMarshaller(CheckObsBucketsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNotificationRequest, CreateNotificationResponse> createNotification =
        genForcreateNotification();

    private static HttpRequestDef<CreateNotificationRequest, CreateNotificationResponse> genForcreateNotification() {
        // basic
        HttpRequestDef.Builder<CreateNotificationRequest, CreateNotificationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateNotificationRequest.class, CreateNotificationResponse.class)
                .withName("CreateNotification")
                .withUri("/v3/{project_id}/notifications")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateNotificationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateNotificationRequestBody.class),
            f -> f.withMarshaller(CreateNotificationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

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

    public static final HttpRequestDef<DeleteNotificationRequest, DeleteNotificationResponse> deleteNotification =
        genFordeleteNotification();

    private static HttpRequestDef<DeleteNotificationRequest, DeleteNotificationResponse> genFordeleteNotification() {
        // basic
        HttpRequestDef.Builder<DeleteNotificationRequest, DeleteNotificationResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteNotificationRequest.class, DeleteNotificationResponse.class)
                .withName("DeleteNotification")
                .withUri("/v3/{project_id}/notifications")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("notification_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNotificationRequest::getNotificationId, (req, v) -> {
                req.setNotificationId(v);
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

    public static final HttpRequestDef<ListNotificationsRequest, ListNotificationsResponse> listNotifications =
        genForlistNotifications();

    private static HttpRequestDef<ListNotificationsRequest, ListNotificationsResponse> genForlistNotifications() {
        // basic
        HttpRequestDef.Builder<ListNotificationsRequest, ListNotificationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNotificationsRequest.class, ListNotificationsResponse.class)
                .withName("ListNotifications")
                .withUri("/v3/{project_id}/notifications/{notification_type}")
                .withContentType("application/json");

        // requests
        builder.<ListNotificationsRequest.NotificationTypeEnum>withRequestField("notification_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListNotificationsRequest.NotificationTypeEnum.class),
            f -> f.withMarshaller(ListNotificationsRequest::getNotificationType, (req, v) -> {
                req.setNotificationType(v);
            }));
        builder.<String>withRequestField("notification_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNotificationsRequest::getNotificationName, (req, v) -> {
                req.setNotificationName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOperationsRequest, ListOperationsResponse> listOperations =
        genForlistOperations();

    private static HttpRequestDef<ListOperationsRequest, ListOperationsResponse> genForlistOperations() {
        // basic
        HttpRequestDef.Builder<ListOperationsRequest, ListOperationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListOperationsRequest.class, ListOperationsResponse.class)
                .withName("ListOperations")
                .withUri("/v3/{project_id}/operations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOperationsRequest::getServiceType, (req, v) -> {
                req.setServiceType(v);
            }));
        builder.<String>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOperationsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
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

    public static final HttpRequestDef<ListTraceResourcesRequest, ListTraceResourcesResponse> listTraceResources =
        genForlistTraceResources();

    private static HttpRequestDef<ListTraceResourcesRequest, ListTraceResourcesResponse> genForlistTraceResources() {
        // basic
        HttpRequestDef.Builder<ListTraceResourcesRequest, ListTraceResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTraceResourcesRequest.class, ListTraceResourcesResponse.class)
                .withName("ListTraceResources")
                .withUri("/v3/{domain_id}/resources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTraceResourcesRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));

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

    public static final HttpRequestDef<ListUserResourcesRequest, ListUserResourcesResponse> listUserResources =
        genForlistUserResources();

    private static HttpRequestDef<ListUserResourcesRequest, ListUserResourcesResponse> genForlistUserResources() {
        // basic
        HttpRequestDef.Builder<ListUserResourcesRequest, ListUserResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUserResourcesRequest.class, ListUserResourcesResponse.class)
                .withName("ListUserResources")
                .withUri("/v3/{project_id}/user-resources")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNotificationRequest, UpdateNotificationResponse> updateNotification =
        genForupdateNotification();

    private static HttpRequestDef<UpdateNotificationRequest, UpdateNotificationResponse> genForupdateNotification() {
        // basic
        HttpRequestDef.Builder<UpdateNotificationRequest, UpdateNotificationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateNotificationRequest.class, UpdateNotificationResponse.class)
                .withName("UpdateNotification")
                .withUri("/v3/{project_id}/notifications")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<UpdateNotificationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNotificationRequestBody.class),
            f -> f.withMarshaller(UpdateNotificationRequest::getBody, (req, v) -> {
                req.setBody(v);
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

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
        genForBatchCreateResourceTags();

    private static HttpRequestDef<BatchCreateResourceTagsRequest, BatchCreateResourceTagsResponse> genForBatchCreateResourceTags() {
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
            f -> f.withMarshaller(BatchCreateResourceTagsRequest::getResourceId,
                BatchCreateResourceTagsRequest::setResourceId));
        builder.<BatchCreateResourceTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateResourceTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(BatchCreateResourceTagsRequest::getResourceType,
                BatchCreateResourceTagsRequest::setResourceType));
        builder.<BatchCreateResourceTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateResourceTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateResourceTagsRequest::getBody, BatchCreateResourceTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteResourceTagsRequest, BatchDeleteResourceTagsResponse> batchDeleteResourceTags =
        genForBatchDeleteResourceTags();

    private static HttpRequestDef<BatchDeleteResourceTagsRequest, BatchDeleteResourceTagsResponse> genForBatchDeleteResourceTags() {
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
            f -> f.withMarshaller(BatchDeleteResourceTagsRequest::getResourceId,
                BatchDeleteResourceTagsRequest::setResourceId));
        builder.<BatchDeleteResourceTagsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteResourceTagsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(BatchDeleteResourceTagsRequest::getResourceType,
                BatchDeleteResourceTagsRequest::setResourceType));
        builder.<BatchDeleteResourceTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteResourceTagsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteResourceTagsRequest::getBody, BatchDeleteResourceTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckObsBucketsRequest, CheckObsBucketsResponse> checkObsBuckets =
        genForCheckObsBuckets();

    private static HttpRequestDef<CheckObsBucketsRequest, CheckObsBucketsResponse> genForCheckObsBuckets() {
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
            f -> f.withMarshaller(CheckObsBucketsRequest::getDomainId, CheckObsBucketsRequest::setDomainId));
        builder.<CheckObsBucketsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckObsBucketsRequestBody.class),
            f -> f.withMarshaller(CheckObsBucketsRequest::getBody, CheckObsBucketsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNotificationRequest, CreateNotificationResponse> createNotification =
        genForCreateNotification();

    private static HttpRequestDef<CreateNotificationRequest, CreateNotificationResponse> genForCreateNotification() {
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
            f -> f.withMarshaller(CreateNotificationRequest::getBody, CreateNotificationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTrackerRequest, CreateTrackerResponse> createTracker =
        genForCreateTracker();

    private static HttpRequestDef<CreateTrackerRequest, CreateTrackerResponse> genForCreateTracker() {
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
            f -> f.withMarshaller(CreateTrackerRequest::getBody, CreateTrackerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNotificationRequest, DeleteNotificationResponse> deleteNotification =
        genForDeleteNotification();

    private static HttpRequestDef<DeleteNotificationRequest, DeleteNotificationResponse> genForDeleteNotification() {
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
            f -> f.withMarshaller(DeleteNotificationRequest::getNotificationId,
                DeleteNotificationRequest::setNotificationId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTrackerRequest, DeleteTrackerResponse> deleteTracker =
        genForDeleteTracker();

    private static HttpRequestDef<DeleteTrackerRequest, DeleteTrackerResponse> genForDeleteTracker() {
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
            f -> f.withMarshaller(DeleteTrackerRequest::getTrackerName, DeleteTrackerRequest::setTrackerName));
        builder.<DeleteTrackerRequest.TrackerTypeEnum>withRequestField("tracker_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteTrackerRequest.TrackerTypeEnum.class),
            f -> f.withMarshaller(DeleteTrackerRequest::getTrackerType, DeleteTrackerRequest::setTrackerType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNotificationsRequest, ListNotificationsResponse> listNotifications =
        genForListNotifications();

    private static HttpRequestDef<ListNotificationsRequest, ListNotificationsResponse> genForListNotifications() {
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
            f -> f.withMarshaller(ListNotificationsRequest::getNotificationType,
                ListNotificationsRequest::setNotificationType));
        builder.<String>withRequestField("notification_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNotificationsRequest::getNotificationName,
                ListNotificationsRequest::setNotificationName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOperationsRequest, ListOperationsResponse> listOperations =
        genForListOperations();

    private static HttpRequestDef<ListOperationsRequest, ListOperationsResponse> genForListOperations() {
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
            f -> f.withMarshaller(ListOperationsRequest::getServiceType, ListOperationsRequest::setServiceType));
        builder.<String>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOperationsRequest::getResourceType, ListOperationsRequest::setResourceType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQuotasRequest, ListQuotasResponse> listQuotas = genForListQuotas();

    private static HttpRequestDef<ListQuotasRequest, ListQuotasResponse> genForListQuotas() {
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
        genForListTraceResources();

    private static HttpRequestDef<ListTraceResourcesRequest, ListTraceResourcesResponse> genForListTraceResources() {
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
            f -> f.withMarshaller(ListTraceResourcesRequest::getDomainId, ListTraceResourcesRequest::setDomainId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTracesRequest, ListTracesResponse> listTraces = genForListTraces();

    private static HttpRequestDef<ListTracesRequest, ListTracesResponse> genForListTraces() {
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
            f -> f.withMarshaller(ListTracesRequest::getTraceType, ListTracesRequest::setTraceType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTracesRequest::getLimit, ListTracesRequest::setLimit));
        builder.<Long>withRequestField("from",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTracesRequest::getFrom, ListTracesRequest::setFrom));
        builder.<String>withRequestField("next",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTracesRequest::getNext, ListTracesRequest::setNext));
        builder.<Long>withRequestField("to",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTracesRequest::getTo, ListTracesRequest::setTo));
        builder.<String>withRequestField("tracker_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTracesRequest::getTrackerName, ListTracesRequest::setTrackerName));
        builder.<String>withRequestField("service_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTracesRequest::getServiceType, ListTracesRequest::setServiceType));
        builder.<String>withRequestField("user",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTracesRequest::getUser, ListTracesRequest::setUser));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTracesRequest::getResourceId, ListTracesRequest::setResourceId));
        builder.<String>withRequestField("resource_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTracesRequest::getResourceName, ListTracesRequest::setResourceName));
        builder.<String>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTracesRequest::getResourceType, ListTracesRequest::setResourceType));
        builder.<String>withRequestField("trace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTracesRequest::getTraceId, ListTracesRequest::setTraceId));
        builder.<String>withRequestField("trace_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTracesRequest::getTraceName, ListTracesRequest::setTraceName));
        builder.<ListTracesRequest.TraceRatingEnum>withRequestField("trace_rating",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTracesRequest.TraceRatingEnum.class),
            f -> f.withMarshaller(ListTracesRequest::getTraceRating, ListTracesRequest::setTraceRating));
        builder.<String>withRequestField("access_key_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTracesRequest::getAccessKeyId, ListTracesRequest::setAccessKeyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTracesRequest::getEnterpriseProjectId,
                ListTracesRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTrackersRequest, ListTrackersResponse> listTrackers = genForListTrackers();

    private static HttpRequestDef<ListTrackersRequest, ListTrackersResponse> genForListTrackers() {
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
            f -> f.withMarshaller(ListTrackersRequest::getTrackerName, ListTrackersRequest::setTrackerName));
        builder.<ListTrackersRequest.TrackerTypeEnum>withRequestField("tracker_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTrackersRequest.TrackerTypeEnum.class),
            f -> f.withMarshaller(ListTrackersRequest::getTrackerType, ListTrackersRequest::setTrackerType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserResourcesRequest, ListUserResourcesResponse> listUserResources =
        genForListUserResources();

    private static HttpRequestDef<ListUserResourcesRequest, ListUserResourcesResponse> genForListUserResources() {
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
        genForUpdateNotification();

    private static HttpRequestDef<UpdateNotificationRequest, UpdateNotificationResponse> genForUpdateNotification() {
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
            f -> f.withMarshaller(UpdateNotificationRequest::getBody, UpdateNotificationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTrackerRequest, UpdateTrackerResponse> updateTracker =
        genForUpdateTracker();

    private static HttpRequestDef<UpdateTrackerRequest, UpdateTrackerResponse> genForUpdateTracker() {
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
            f -> f.withMarshaller(UpdateTrackerRequest::getBody, UpdateTrackerRequest::setBody));

        // response

        return builder.build();
    }

}

package com.huaweicloud.sdk.oms.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.oms.v2.model.BatchUpdateTasksReq;
import com.huaweicloud.sdk.oms.v2.model.BatchUpdateTasksRequest;
import com.huaweicloud.sdk.oms.v2.model.BatchUpdateTasksResponse;
import com.huaweicloud.sdk.oms.v2.model.CheckPrefixReq;
import com.huaweicloud.sdk.oms.v2.model.CheckPrefixRequest;
import com.huaweicloud.sdk.oms.v2.model.CheckPrefixResponse;
import com.huaweicloud.sdk.oms.v2.model.CreateSyncEventsRequest;
import com.huaweicloud.sdk.oms.v2.model.CreateSyncEventsResponse;
import com.huaweicloud.sdk.oms.v2.model.CreateSyncTaskReq;
import com.huaweicloud.sdk.oms.v2.model.CreateSyncTaskRequest;
import com.huaweicloud.sdk.oms.v2.model.CreateSyncTaskResponse;
import com.huaweicloud.sdk.oms.v2.model.CreateTaskGroupReq;
import com.huaweicloud.sdk.oms.v2.model.CreateTaskGroupRequest;
import com.huaweicloud.sdk.oms.v2.model.CreateTaskGroupResponse;
import com.huaweicloud.sdk.oms.v2.model.CreateTaskReq;
import com.huaweicloud.sdk.oms.v2.model.CreateTaskRequest;
import com.huaweicloud.sdk.oms.v2.model.CreateTaskResponse;
import com.huaweicloud.sdk.oms.v2.model.DeleteSyncTaskRequest;
import com.huaweicloud.sdk.oms.v2.model.DeleteSyncTaskResponse;
import com.huaweicloud.sdk.oms.v2.model.DeleteTaskGroupRequest;
import com.huaweicloud.sdk.oms.v2.model.DeleteTaskGroupResponse;
import com.huaweicloud.sdk.oms.v2.model.DeleteTaskRequest;
import com.huaweicloud.sdk.oms.v2.model.DeleteTaskResponse;
import com.huaweicloud.sdk.oms.v2.model.ListApiVersionsRequest;
import com.huaweicloud.sdk.oms.v2.model.ListApiVersionsResponse;
import com.huaweicloud.sdk.oms.v2.model.ListBucketsReq;
import com.huaweicloud.sdk.oms.v2.model.ListSyncTaskStatisticRequest;
import com.huaweicloud.sdk.oms.v2.model.ListSyncTaskStatisticResponse;
import com.huaweicloud.sdk.oms.v2.model.ListSyncTasksRequest;
import com.huaweicloud.sdk.oms.v2.model.ListSyncTasksResponse;
import com.huaweicloud.sdk.oms.v2.model.ListTaskGroupRequest;
import com.huaweicloud.sdk.oms.v2.model.ListTaskGroupResponse;
import com.huaweicloud.sdk.oms.v2.model.ListTasksRequest;
import com.huaweicloud.sdk.oms.v2.model.ListTasksResponse;
import com.huaweicloud.sdk.oms.v2.model.RetryTaskGroupReq;
import com.huaweicloud.sdk.oms.v2.model.RetryTaskGroupRequest;
import com.huaweicloud.sdk.oms.v2.model.RetryTaskGroupResponse;
import com.huaweicloud.sdk.oms.v2.model.ShowApiInfoRequest;
import com.huaweicloud.sdk.oms.v2.model.ShowApiInfoResponse;
import com.huaweicloud.sdk.oms.v2.model.ShowBucketListRequest;
import com.huaweicloud.sdk.oms.v2.model.ShowBucketListResponse;
import com.huaweicloud.sdk.oms.v2.model.ShowBucketObjectsRequest;
import com.huaweicloud.sdk.oms.v2.model.ShowBucketObjectsResponse;
import com.huaweicloud.sdk.oms.v2.model.ShowBucketRegionReq;
import com.huaweicloud.sdk.oms.v2.model.ShowBucketRegionRequest;
import com.huaweicloud.sdk.oms.v2.model.ShowBucketRegionResponse;
import com.huaweicloud.sdk.oms.v2.model.ShowBucketReq;
import com.huaweicloud.sdk.oms.v2.model.ShowCdnInfoReq;
import com.huaweicloud.sdk.oms.v2.model.ShowCdnInfoRequest;
import com.huaweicloud.sdk.oms.v2.model.ShowCdnInfoResponse;
import com.huaweicloud.sdk.oms.v2.model.ShowCloudTypeRequest;
import com.huaweicloud.sdk.oms.v2.model.ShowCloudTypeResponse;
import com.huaweicloud.sdk.oms.v2.model.ShowRegionInfoRequest;
import com.huaweicloud.sdk.oms.v2.model.ShowRegionInfoResp;
import com.huaweicloud.sdk.oms.v2.model.ShowRegionInfoResponse;
import com.huaweicloud.sdk.oms.v2.model.ShowSyncTaskRequest;
import com.huaweicloud.sdk.oms.v2.model.ShowSyncTaskResponse;
import com.huaweicloud.sdk.oms.v2.model.ShowTaskGroupRequest;
import com.huaweicloud.sdk.oms.v2.model.ShowTaskGroupResponse;
import com.huaweicloud.sdk.oms.v2.model.ShowTaskRequest;
import com.huaweicloud.sdk.oms.v2.model.ShowTaskResponse;
import com.huaweicloud.sdk.oms.v2.model.StartSyncTaskReq;
import com.huaweicloud.sdk.oms.v2.model.StartSyncTaskRequest;
import com.huaweicloud.sdk.oms.v2.model.StartSyncTaskResponse;
import com.huaweicloud.sdk.oms.v2.model.StartTaskGroupReq;
import com.huaweicloud.sdk.oms.v2.model.StartTaskGroupRequest;
import com.huaweicloud.sdk.oms.v2.model.StartTaskGroupResponse;
import com.huaweicloud.sdk.oms.v2.model.StartTaskReq;
import com.huaweicloud.sdk.oms.v2.model.StartTaskRequest;
import com.huaweicloud.sdk.oms.v2.model.StartTaskResponse;
import com.huaweicloud.sdk.oms.v2.model.StopSyncTaskRequest;
import com.huaweicloud.sdk.oms.v2.model.StopSyncTaskResponse;
import com.huaweicloud.sdk.oms.v2.model.StopTaskGroupRequest;
import com.huaweicloud.sdk.oms.v2.model.StopTaskGroupResponse;
import com.huaweicloud.sdk.oms.v2.model.StopTaskRequest;
import com.huaweicloud.sdk.oms.v2.model.StopTaskResponse;
import com.huaweicloud.sdk.oms.v2.model.SyncObjectReq;
import com.huaweicloud.sdk.oms.v2.model.UpdateBandwidthPolicyReq;
import com.huaweicloud.sdk.oms.v2.model.UpdateBandwidthPolicyRequest;
import com.huaweicloud.sdk.oms.v2.model.UpdateBandwidthPolicyResponse;
import com.huaweicloud.sdk.oms.v2.model.UpdatePrivacyAgreementRecordRequest;
import com.huaweicloud.sdk.oms.v2.model.UpdatePrivacyAgreementRecordResponse;
import com.huaweicloud.sdk.oms.v2.model.UpdateTaskGroupRequest;
import com.huaweicloud.sdk.oms.v2.model.UpdateTaskGroupResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class OmsMeta {

    public static final HttpRequestDef<BatchUpdateTasksRequest, BatchUpdateTasksResponse> batchUpdateTasks =
        genForBatchUpdateTasks();

    private static HttpRequestDef<BatchUpdateTasksRequest, BatchUpdateTasksResponse> genForBatchUpdateTasks() {
        // basic
        HttpRequestDef.Builder<BatchUpdateTasksRequest, BatchUpdateTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchUpdateTasksRequest.class, BatchUpdateTasksResponse.class)
                .withName("BatchUpdateTasks")
                .withUri("/v2/{project_id}/tasks/batch-update")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchUpdateTasksReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdateTasksReq.class),
            f -> f.withMarshaller(BatchUpdateTasksRequest::getBody, BatchUpdateTasksRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckPrefixRequest, CheckPrefixResponse> checkPrefix = genForCheckPrefix();

    private static HttpRequestDef<CheckPrefixRequest, CheckPrefixResponse> genForCheckPrefix() {
        // basic
        HttpRequestDef.Builder<CheckPrefixRequest, CheckPrefixResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckPrefixRequest.class, CheckPrefixResponse.class)
                .withName("CheckPrefix")
                .withUri("/v2/{project_id}/objectstorage/buckets/prefix")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CheckPrefixReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckPrefixReq.class),
            f -> f.withMarshaller(CheckPrefixRequest::getBody, CheckPrefixRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSyncEventsRequest, CreateSyncEventsResponse> createSyncEvents =
        genForCreateSyncEvents();

    private static HttpRequestDef<CreateSyncEventsRequest, CreateSyncEventsResponse> genForCreateSyncEvents() {
        // basic
        HttpRequestDef.Builder<CreateSyncEventsRequest, CreateSyncEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSyncEventsRequest.class, CreateSyncEventsResponse.class)
                .withName("CreateSyncEvents")
                .withUri("/v2/{project_id}/sync-tasks/{sync_task_id}/events")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("sync_task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSyncEventsRequest::getSyncTaskId, CreateSyncEventsRequest::setSyncTaskId));
        builder.<SyncObjectReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SyncObjectReq.class),
            f -> f.withMarshaller(CreateSyncEventsRequest::getBody, CreateSyncEventsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSyncTaskRequest, CreateSyncTaskResponse> createSyncTask =
        genForCreateSyncTask();

    private static HttpRequestDef<CreateSyncTaskRequest, CreateSyncTaskResponse> genForCreateSyncTask() {
        // basic
        HttpRequestDef.Builder<CreateSyncTaskRequest, CreateSyncTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSyncTaskRequest.class, CreateSyncTaskResponse.class)
                .withName("CreateSyncTask")
                .withUri("/v2/{project_id}/sync-tasks")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateSyncTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSyncTaskReq.class),
            f -> f.withMarshaller(CreateSyncTaskRequest::getBody, CreateSyncTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTaskRequest, CreateTaskResponse> createTask = genForCreateTask();

    private static HttpRequestDef<CreateTaskRequest, CreateTaskResponse> genForCreateTask() {
        // basic
        HttpRequestDef.Builder<CreateTaskRequest, CreateTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTaskRequest.class, CreateTaskResponse.class)
                .withName("CreateTask")
                .withUri("/v2/{project_id}/tasks")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTaskReq.class),
            f -> f.withMarshaller(CreateTaskRequest::getBody, CreateTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTaskGroupRequest, CreateTaskGroupResponse> createTaskGroup =
        genForCreateTaskGroup();

    private static HttpRequestDef<CreateTaskGroupRequest, CreateTaskGroupResponse> genForCreateTaskGroup() {
        // basic
        HttpRequestDef.Builder<CreateTaskGroupRequest, CreateTaskGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTaskGroupRequest.class, CreateTaskGroupResponse.class)
                .withName("CreateTaskGroup")
                .withUri("/v2/{project_id}/taskgroups")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateTaskGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTaskGroupReq.class),
            f -> f.withMarshaller(CreateTaskGroupRequest::getBody, CreateTaskGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSyncTaskRequest, DeleteSyncTaskResponse> deleteSyncTask =
        genForDeleteSyncTask();

    private static HttpRequestDef<DeleteSyncTaskRequest, DeleteSyncTaskResponse> genForDeleteSyncTask() {
        // basic
        HttpRequestDef.Builder<DeleteSyncTaskRequest, DeleteSyncTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSyncTaskRequest.class, DeleteSyncTaskResponse.class)
                .withName("DeleteSyncTask")
                .withUri("/v2/{project_id}/sync-tasks/{sync_task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("sync_task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSyncTaskRequest::getSyncTaskId, DeleteSyncTaskRequest::setSyncTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTaskRequest, DeleteTaskResponse> deleteTask = genForDeleteTask();

    private static HttpRequestDef<DeleteTaskRequest, DeleteTaskResponse> genForDeleteTask() {
        // basic
        HttpRequestDef.Builder<DeleteTaskRequest, DeleteTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTaskRequest.class, DeleteTaskResponse.class)
                .withName("DeleteTask")
                .withUri("/v2/{project_id}/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(DeleteTaskRequest::getTaskId, DeleteTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTaskGroupRequest, DeleteTaskGroupResponse> deleteTaskGroup =
        genForDeleteTaskGroup();

    private static HttpRequestDef<DeleteTaskGroupRequest, DeleteTaskGroupResponse> genForDeleteTaskGroup() {
        // basic
        HttpRequestDef.Builder<DeleteTaskGroupRequest, DeleteTaskGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTaskGroupRequest.class, DeleteTaskGroupResponse.class)
                .withName("DeleteTaskGroup")
                .withUri("/v2/{project_id}/taskgroups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTaskGroupRequest::getGroupId, DeleteTaskGroupRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSyncTaskStatisticRequest, ListSyncTaskStatisticResponse> listSyncTaskStatistic =
        genForListSyncTaskStatistic();

    private static HttpRequestDef<ListSyncTaskStatisticRequest, ListSyncTaskStatisticResponse> genForListSyncTaskStatistic() {
        // basic
        HttpRequestDef.Builder<ListSyncTaskStatisticRequest, ListSyncTaskStatisticResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSyncTaskStatisticRequest.class, ListSyncTaskStatisticResponse.class)
            .withName("ListSyncTaskStatistic")
            .withUri("/v2/{project_id}/sync-tasks/{sync_task_id}/statistics")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("sync_task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSyncTaskStatisticRequest::getSyncTaskId,
                ListSyncTaskStatisticRequest::setSyncTaskId));
        builder.<ListSyncTaskStatisticRequest.DataTypeEnum>withRequestField("data_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListSyncTaskStatisticRequest.DataTypeEnum.class),
            f -> f.withMarshaller(ListSyncTaskStatisticRequest::getDataType,
                ListSyncTaskStatisticRequest::setDataType));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSyncTaskStatisticRequest::getStartTime,
                ListSyncTaskStatisticRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSyncTaskStatisticRequest::getEndTime, ListSyncTaskStatisticRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSyncTasksRequest, ListSyncTasksResponse> listSyncTasks =
        genForListSyncTasks();

    private static HttpRequestDef<ListSyncTasksRequest, ListSyncTasksResponse> genForListSyncTasks() {
        // basic
        HttpRequestDef.Builder<ListSyncTasksRequest, ListSyncTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSyncTasksRequest.class, ListSyncTasksResponse.class)
                .withName("ListSyncTasks")
                .withUri("/v2/{project_id}/sync-tasks")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSyncTasksRequest::getLimit, ListSyncTasksRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSyncTasksRequest::getOffset, ListSyncTasksRequest::setOffset));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSyncTasksRequest::getStatus, ListSyncTasksRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTaskGroupRequest, ListTaskGroupResponse> listTaskGroup =
        genForListTaskGroup();

    private static HttpRequestDef<ListTaskGroupRequest, ListTaskGroupResponse> genForListTaskGroup() {
        // basic
        HttpRequestDef.Builder<ListTaskGroupRequest, ListTaskGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTaskGroupRequest.class, ListTaskGroupResponse.class)
                .withName("ListTaskGroup")
                .withUri("/v2/{project_id}/taskgroups")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTaskGroupRequest::getLimit, ListTaskGroupRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTaskGroupRequest::getOffset, ListTaskGroupRequest::setOffset));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTaskGroupRequest::getStatus, ListTaskGroupRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTasksRequest, ListTasksResponse> listTasks = genForListTasks();

    private static HttpRequestDef<ListTasksRequest, ListTasksResponse> genForListTasks() {
        // basic
        HttpRequestDef.Builder<ListTasksRequest, ListTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTasksRequest.class, ListTasksResponse.class)
                .withName("ListTasks")
                .withUri("/v2/{project_id}/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getGroupId, ListTasksRequest::setGroupId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTasksRequest::getLimit, ListTasksRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTasksRequest::getOffset, ListTasksRequest::setOffset));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTasksRequest::getStatus, ListTasksRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RetryTaskGroupRequest, RetryTaskGroupResponse> retryTaskGroup =
        genForRetryTaskGroup();

    private static HttpRequestDef<RetryTaskGroupRequest, RetryTaskGroupResponse> genForRetryTaskGroup() {
        // basic
        HttpRequestDef.Builder<RetryTaskGroupRequest, RetryTaskGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, RetryTaskGroupRequest.class, RetryTaskGroupResponse.class)
                .withName("RetryTaskGroup")
                .withUri("/v2/{project_id}/taskgroups/{group_id}/retry")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryTaskGroupRequest::getGroupId, RetryTaskGroupRequest::setGroupId));
        builder.<RetryTaskGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RetryTaskGroupReq.class),
            f -> f.withMarshaller(RetryTaskGroupRequest::getBody, RetryTaskGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBucketListRequest, ShowBucketListResponse> showBucketList =
        genForShowBucketList();

    private static HttpRequestDef<ShowBucketListRequest, ShowBucketListResponse> genForShowBucketList() {
        // basic
        HttpRequestDef.Builder<ShowBucketListRequest, ShowBucketListResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowBucketListRequest.class, ShowBucketListResponse.class)
                .withName("ShowBucketList")
                .withUri("/v2/{project_id}/objectstorage/buckets")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ListBucketsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListBucketsReq.class),
            f -> f.withMarshaller(ShowBucketListRequest::getBody, ShowBucketListRequest::setBody));

        // response
        builder.<List<String>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowBucketListResponse::getBody, ShowBucketListResponse::setBody)
                .withInnerContainerType(String.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowBucketObjectsRequest, ShowBucketObjectsResponse> showBucketObjects =
        genForShowBucketObjects();

    private static HttpRequestDef<ShowBucketObjectsRequest, ShowBucketObjectsResponse> genForShowBucketObjects() {
        // basic
        HttpRequestDef.Builder<ShowBucketObjectsRequest, ShowBucketObjectsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowBucketObjectsRequest.class, ShowBucketObjectsResponse.class)
                .withName("ShowBucketObjects")
                .withUri("/v2/{project_id}/objectstorage/buckets/objects")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ShowBucketReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowBucketReq.class),
            f -> f.withMarshaller(ShowBucketObjectsRequest::getBody, ShowBucketObjectsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBucketRegionRequest, ShowBucketRegionResponse> showBucketRegion =
        genForShowBucketRegion();

    private static HttpRequestDef<ShowBucketRegionRequest, ShowBucketRegionResponse> genForShowBucketRegion() {
        // basic
        HttpRequestDef.Builder<ShowBucketRegionRequest, ShowBucketRegionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowBucketRegionRequest.class, ShowBucketRegionResponse.class)
                .withName("ShowBucketRegion")
                .withUri("/v2/{project_id}/objectstorage/buckets/regions")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ShowBucketRegionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowBucketRegionReq.class),
            f -> f.withMarshaller(ShowBucketRegionRequest::getBody, ShowBucketRegionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCdnInfoRequest, ShowCdnInfoResponse> showCdnInfo = genForShowCdnInfo();

    private static HttpRequestDef<ShowCdnInfoRequest, ShowCdnInfoResponse> genForShowCdnInfo() {
        // basic
        HttpRequestDef.Builder<ShowCdnInfoRequest, ShowCdnInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowCdnInfoRequest.class, ShowCdnInfoResponse.class)
                .withName("ShowCdnInfo")
                .withUri("/v2/{project_id}/objectstorage/buckets/cdn-info")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ShowCdnInfoReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowCdnInfoReq.class),
            f -> f.withMarshaller(ShowCdnInfoRequest::getBody, ShowCdnInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCloudTypeRequest, ShowCloudTypeResponse> showCloudType =
        genForShowCloudType();

    private static HttpRequestDef<ShowCloudTypeRequest, ShowCloudTypeResponse> genForShowCloudType() {
        // basic
        HttpRequestDef.Builder<ShowCloudTypeRequest, ShowCloudTypeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCloudTypeRequest.class, ShowCloudTypeResponse.class)
                .withName("ShowCloudType")
                .withUri("/v2/{project_id}/objectstorage/cloud-type")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCloudTypeRequest::getType, ShowCloudTypeRequest::setType));

        // response
        builder.<List<String>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowCloudTypeResponse::getBody, ShowCloudTypeResponse::setBody)
                .withInnerContainerType(String.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowRegionInfoRequest, ShowRegionInfoResponse> showRegionInfo =
        genForShowRegionInfo();

    private static HttpRequestDef<ShowRegionInfoRequest, ShowRegionInfoResponse> genForShowRegionInfo() {
        // basic
        HttpRequestDef.Builder<ShowRegionInfoRequest, ShowRegionInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRegionInfoRequest.class, ShowRegionInfoResponse.class)
                .withName("ShowRegionInfo")
                .withUri("/v2/{project_id}/objectstorage/data-center")
                .withContentType("application/json");

        // requests

        // response
        builder.<List<ShowRegionInfoResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowRegionInfoResponse::getBody, ShowRegionInfoResponse::setBody)
                .withInnerContainerType(ShowRegionInfoResp.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowSyncTaskRequest, ShowSyncTaskResponse> showSyncTask = genForShowSyncTask();

    private static HttpRequestDef<ShowSyncTaskRequest, ShowSyncTaskResponse> genForShowSyncTask() {
        // basic
        HttpRequestDef.Builder<ShowSyncTaskRequest, ShowSyncTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSyncTaskRequest.class, ShowSyncTaskResponse.class)
                .withName("ShowSyncTask")
                .withUri("/v2/{project_id}/sync-tasks/{sync_task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("sync_task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSyncTaskRequest::getSyncTaskId, ShowSyncTaskRequest::setSyncTaskId));
        builder.<Long>withRequestField("query_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowSyncTaskRequest::getQueryTime, ShowSyncTaskRequest::setQueryTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskRequest, ShowTaskResponse> showTask = genForShowTask();

    private static HttpRequestDef<ShowTaskRequest, ShowTaskResponse> genForShowTask() {
        // basic
        HttpRequestDef.Builder<ShowTaskRequest, ShowTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTaskRequest.class, ShowTaskResponse.class)
                .withName("ShowTask")
                .withUri("/v2/{project_id}/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowTaskRequest::getTaskId, ShowTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskGroupRequest, ShowTaskGroupResponse> showTaskGroup =
        genForShowTaskGroup();

    private static HttpRequestDef<ShowTaskGroupRequest, ShowTaskGroupResponse> genForShowTaskGroup() {
        // basic
        HttpRequestDef.Builder<ShowTaskGroupRequest, ShowTaskGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTaskGroupRequest.class, ShowTaskGroupResponse.class)
                .withName("ShowTaskGroup")
                .withUri("/v2/{project_id}/taskgroups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskGroupRequest::getGroupId, ShowTaskGroupRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartSyncTaskRequest, StartSyncTaskResponse> startSyncTask =
        genForStartSyncTask();

    private static HttpRequestDef<StartSyncTaskRequest, StartSyncTaskResponse> genForStartSyncTask() {
        // basic
        HttpRequestDef.Builder<StartSyncTaskRequest, StartSyncTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartSyncTaskRequest.class, StartSyncTaskResponse.class)
                .withName("StartSyncTask")
                .withUri("/v2/{project_id}/sync-tasks/{sync_task_id}/start")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("sync_task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartSyncTaskRequest::getSyncTaskId, StartSyncTaskRequest::setSyncTaskId));
        builder.<StartSyncTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartSyncTaskReq.class),
            f -> f.withMarshaller(StartSyncTaskRequest::getBody, StartSyncTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartTaskRequest, StartTaskResponse> startTask = genForStartTask();

    private static HttpRequestDef<StartTaskRequest, StartTaskResponse> genForStartTask() {
        // basic
        HttpRequestDef.Builder<StartTaskRequest, StartTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartTaskRequest.class, StartTaskResponse.class)
                .withName("StartTask")
                .withUri("/v2/{project_id}/tasks/{task_id}/start")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<Long>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(StartTaskRequest::getTaskId, StartTaskRequest::setTaskId));
        builder.<StartTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartTaskReq.class),
            f -> f.withMarshaller(StartTaskRequest::getBody, StartTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartTaskGroupRequest, StartTaskGroupResponse> startTaskGroup =
        genForStartTaskGroup();

    private static HttpRequestDef<StartTaskGroupRequest, StartTaskGroupResponse> genForStartTaskGroup() {
        // basic
        HttpRequestDef.Builder<StartTaskGroupRequest, StartTaskGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, StartTaskGroupRequest.class, StartTaskGroupResponse.class)
                .withName("StartTaskGroup")
                .withUri("/v2/{project_id}/taskgroups/{group_id}/start")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartTaskGroupRequest::getGroupId, StartTaskGroupRequest::setGroupId));
        builder.<StartTaskGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartTaskGroupReq.class),
            f -> f.withMarshaller(StartTaskGroupRequest::getBody, StartTaskGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopSyncTaskRequest, StopSyncTaskResponse> stopSyncTask = genForStopSyncTask();

    private static HttpRequestDef<StopSyncTaskRequest, StopSyncTaskResponse> genForStopSyncTask() {
        // basic
        HttpRequestDef.Builder<StopSyncTaskRequest, StopSyncTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopSyncTaskRequest.class, StopSyncTaskResponse.class)
                .withName("StopSyncTask")
                .withUri("/v2/{project_id}/sync-tasks/{sync_task_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("sync_task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopSyncTaskRequest::getSyncTaskId, StopSyncTaskRequest::setSyncTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopTaskRequest, StopTaskResponse> stopTask = genForStopTask();

    private static HttpRequestDef<StopTaskRequest, StopTaskResponse> genForStopTask() {
        // basic
        HttpRequestDef.Builder<StopTaskRequest, StopTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopTaskRequest.class, StopTaskResponse.class)
                .withName("StopTask")
                .withUri("/v2/{project_id}/tasks/{task_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(StopTaskRequest::getTaskId, StopTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopTaskGroupRequest, StopTaskGroupResponse> stopTaskGroup =
        genForStopTaskGroup();

    private static HttpRequestDef<StopTaskGroupRequest, StopTaskGroupResponse> genForStopTaskGroup() {
        // basic
        HttpRequestDef.Builder<StopTaskGroupRequest, StopTaskGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, StopTaskGroupRequest.class, StopTaskGroupResponse.class)
                .withName("StopTaskGroup")
                .withUri("/v2/{project_id}/taskgroups/{group_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopTaskGroupRequest::getGroupId, StopTaskGroupRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBandwidthPolicyRequest, UpdateBandwidthPolicyResponse> updateBandwidthPolicy =
        genForUpdateBandwidthPolicy();

    private static HttpRequestDef<UpdateBandwidthPolicyRequest, UpdateBandwidthPolicyResponse> genForUpdateBandwidthPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateBandwidthPolicyRequest, UpdateBandwidthPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateBandwidthPolicyRequest.class, UpdateBandwidthPolicyResponse.class)
            .withName("UpdateBandwidthPolicy")
            .withUri("/v2/{project_id}/tasks/{task_id}/bandwidth-policy")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<Long>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(UpdateBandwidthPolicyRequest::getTaskId, UpdateBandwidthPolicyRequest::setTaskId));
        builder.<UpdateBandwidthPolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateBandwidthPolicyReq.class),
            f -> f.withMarshaller(UpdateBandwidthPolicyRequest::getBody, UpdateBandwidthPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePrivacyAgreementRecordRequest, UpdatePrivacyAgreementRecordResponse> updatePrivacyAgreementRecord =
        genForUpdatePrivacyAgreementRecord();

    private static HttpRequestDef<UpdatePrivacyAgreementRecordRequest, UpdatePrivacyAgreementRecordResponse> genForUpdatePrivacyAgreementRecord() {
        // basic
        HttpRequestDef.Builder<UpdatePrivacyAgreementRecordRequest, UpdatePrivacyAgreementRecordResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdatePrivacyAgreementRecordRequest.class,
                    UpdatePrivacyAgreementRecordResponse.class)
                .withName("UpdatePrivacyAgreementRecord")
                .withUri("/v2/{project_id}/privacy-agreements")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTaskGroupRequest, UpdateTaskGroupResponse> updateTaskGroup =
        genForUpdateTaskGroup();

    private static HttpRequestDef<UpdateTaskGroupRequest, UpdateTaskGroupResponse> genForUpdateTaskGroup() {
        // basic
        HttpRequestDef.Builder<UpdateTaskGroupRequest, UpdateTaskGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTaskGroupRequest.class, UpdateTaskGroupResponse.class)
                .withName("UpdateTaskGroup")
                .withUri("/v2/{project_id}/taskgroups/{group_id}/update")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTaskGroupRequest::getGroupId, UpdateTaskGroupRequest::setGroupId));
        builder.<UpdateBandwidthPolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateBandwidthPolicyReq.class),
            f -> f.withMarshaller(UpdateTaskGroupRequest::getBody, UpdateTaskGroupRequest::setBody));

        // response

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

    public static final HttpRequestDef<ShowApiInfoRequest, ShowApiInfoResponse> showApiInfo = genForShowApiInfo();

    private static HttpRequestDef<ShowApiInfoRequest, ShowApiInfoResponse> genForShowApiInfo() {
        // basic
        HttpRequestDef.Builder<ShowApiInfoRequest, ShowApiInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApiInfoRequest.class, ShowApiInfoResponse.class)
                .withName("ShowApiInfo")
                .withUri("/{version}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApiInfoRequest::getVersion, ShowApiInfoRequest::setVersion));

        // response

        return builder.build();
    }

}

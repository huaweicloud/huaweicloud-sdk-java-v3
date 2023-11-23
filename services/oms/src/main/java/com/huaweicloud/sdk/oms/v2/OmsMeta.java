package com.huaweicloud.sdk.oms.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
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
import com.huaweicloud.sdk.oms.v2.model.UpdateTaskGroupRequest;
import com.huaweicloud.sdk.oms.v2.model.UpdateTaskGroupResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class OmsMeta {

    public static final HttpRequestDef<CheckPrefixRequest, CheckPrefixResponse> checkPrefix = genForcheckPrefix();

    private static HttpRequestDef<CheckPrefixRequest, CheckPrefixResponse> genForcheckPrefix() {
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
            f -> f.withMarshaller(CheckPrefixRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSyncEventsRequest, CreateSyncEventsResponse> createSyncEvents =
        genForcreateSyncEvents();

    private static HttpRequestDef<CreateSyncEventsRequest, CreateSyncEventsResponse> genForcreateSyncEvents() {
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
            f -> f.withMarshaller(CreateSyncEventsRequest::getSyncTaskId, (req, v) -> {
                req.setSyncTaskId(v);
            }));
        builder.<SyncObjectReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SyncObjectReq.class),
            f -> f.withMarshaller(CreateSyncEventsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSyncTaskRequest, CreateSyncTaskResponse> createSyncTask =
        genForcreateSyncTask();

    private static HttpRequestDef<CreateSyncTaskRequest, CreateSyncTaskResponse> genForcreateSyncTask() {
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
            f -> f.withMarshaller(CreateSyncTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTaskRequest, CreateTaskResponse> createTask = genForcreateTask();

    private static HttpRequestDef<CreateTaskRequest, CreateTaskResponse> genForcreateTask() {
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
            f -> f.withMarshaller(CreateTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTaskGroupRequest, CreateTaskGroupResponse> createTaskGroup =
        genForcreateTaskGroup();

    private static HttpRequestDef<CreateTaskGroupRequest, CreateTaskGroupResponse> genForcreateTaskGroup() {
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
            f -> f.withMarshaller(CreateTaskGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSyncTaskRequest, DeleteSyncTaskResponse> deleteSyncTask =
        genFordeleteSyncTask();

    private static HttpRequestDef<DeleteSyncTaskRequest, DeleteSyncTaskResponse> genFordeleteSyncTask() {
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
            f -> f.withMarshaller(DeleteSyncTaskRequest::getSyncTaskId, (req, v) -> {
                req.setSyncTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTaskRequest, DeleteTaskResponse> deleteTask = genFordeleteTask();

    private static HttpRequestDef<DeleteTaskRequest, DeleteTaskResponse> genFordeleteTask() {
        // basic
        HttpRequestDef.Builder<DeleteTaskRequest, DeleteTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTaskRequest.class, DeleteTaskResponse.class)
                .withName("DeleteTask")
                .withUri("/v2/{project_id}/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTaskGroupRequest, DeleteTaskGroupResponse> deleteTaskGroup =
        genFordeleteTaskGroup();

    private static HttpRequestDef<DeleteTaskGroupRequest, DeleteTaskGroupResponse> genFordeleteTaskGroup() {
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
            f -> f.withMarshaller(DeleteTaskGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSyncTaskStatisticRequest, ListSyncTaskStatisticResponse> listSyncTaskStatistic =
        genForlistSyncTaskStatistic();

    private static HttpRequestDef<ListSyncTaskStatisticRequest, ListSyncTaskStatisticResponse> genForlistSyncTaskStatistic() {
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
            f -> f.withMarshaller(ListSyncTaskStatisticRequest::getSyncTaskId, (req, v) -> {
                req.setSyncTaskId(v);
            }));
        builder.<ListSyncTaskStatisticRequest.DataTypeEnum>withRequestField("data_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListSyncTaskStatisticRequest.DataTypeEnum.class),
            f -> f.withMarshaller(ListSyncTaskStatisticRequest::getDataType, (req, v) -> {
                req.setDataType(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSyncTaskStatisticRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSyncTaskStatisticRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSyncTasksRequest, ListSyncTasksResponse> listSyncTasks =
        genForlistSyncTasks();

    private static HttpRequestDef<ListSyncTasksRequest, ListSyncTasksResponse> genForlistSyncTasks() {
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
            f -> f.withMarshaller(ListSyncTasksRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSyncTasksRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSyncTasksRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTaskGroupRequest, ListTaskGroupResponse> listTaskGroup =
        genForlistTaskGroup();

    private static HttpRequestDef<ListTaskGroupRequest, ListTaskGroupResponse> genForlistTaskGroup() {
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
            f -> f.withMarshaller(ListTaskGroupRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTaskGroupRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTaskGroupRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTasksRequest, ListTasksResponse> listTasks = genForlistTasks();

    private static HttpRequestDef<ListTasksRequest, ListTasksResponse> genForlistTasks() {
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
            f -> f.withMarshaller(ListTasksRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTasksRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTasksRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTasksRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RetryTaskGroupRequest, RetryTaskGroupResponse> retryTaskGroup =
        genForretryTaskGroup();

    private static HttpRequestDef<RetryTaskGroupRequest, RetryTaskGroupResponse> genForretryTaskGroup() {
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
            f -> f.withMarshaller(RetryTaskGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<RetryTaskGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RetryTaskGroupReq.class),
            f -> f.withMarshaller(RetryTaskGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBucketListRequest, ShowBucketListResponse> showBucketList =
        genForshowBucketList();

    private static HttpRequestDef<ShowBucketListRequest, ShowBucketListResponse> genForshowBucketList() {
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
            f -> f.withMarshaller(ShowBucketListRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<String>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowBucketListResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(String.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowBucketObjectsRequest, ShowBucketObjectsResponse> showBucketObjects =
        genForshowBucketObjects();

    private static HttpRequestDef<ShowBucketObjectsRequest, ShowBucketObjectsResponse> genForshowBucketObjects() {
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
            f -> f.withMarshaller(ShowBucketObjectsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBucketRegionRequest, ShowBucketRegionResponse> showBucketRegion =
        genForshowBucketRegion();

    private static HttpRequestDef<ShowBucketRegionRequest, ShowBucketRegionResponse> genForshowBucketRegion() {
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
            f -> f.withMarshaller(ShowBucketRegionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCdnInfoRequest, ShowCdnInfoResponse> showCdnInfo = genForshowCdnInfo();

    private static HttpRequestDef<ShowCdnInfoRequest, ShowCdnInfoResponse> genForshowCdnInfo() {
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
            f -> f.withMarshaller(ShowCdnInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCloudTypeRequest, ShowCloudTypeResponse> showCloudType =
        genForshowCloudType();

    private static HttpRequestDef<ShowCloudTypeRequest, ShowCloudTypeResponse> genForshowCloudType() {
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
            f -> f.withMarshaller(ShowCloudTypeRequest::getType, (req, v) -> {
                req.setType(v);
            }));

        // response
        builder.<List<String>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowCloudTypeResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(String.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowRegionInfoRequest, ShowRegionInfoResponse> showRegionInfo =
        genForshowRegionInfo();

    private static HttpRequestDef<ShowRegionInfoRequest, ShowRegionInfoResponse> genForshowRegionInfo() {
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
            f -> f.withMarshaller(ShowRegionInfoResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(ShowRegionInfoResp.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowSyncTaskRequest, ShowSyncTaskResponse> showSyncTask = genForshowSyncTask();

    private static HttpRequestDef<ShowSyncTaskRequest, ShowSyncTaskResponse> genForshowSyncTask() {
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
            f -> f.withMarshaller(ShowSyncTaskRequest::getSyncTaskId, (req, v) -> {
                req.setSyncTaskId(v);
            }));
        builder.<String>withRequestField("query_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSyncTaskRequest::getQueryTime, (req, v) -> {
                req.setQueryTime(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskRequest, ShowTaskResponse> showTask = genForshowTask();

    private static HttpRequestDef<ShowTaskRequest, ShowTaskResponse> genForshowTask() {
        // basic
        HttpRequestDef.Builder<ShowTaskRequest, ShowTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTaskRequest.class, ShowTaskResponse.class)
                .withName("ShowTask")
                .withUri("/v2/{project_id}/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskGroupRequest, ShowTaskGroupResponse> showTaskGroup =
        genForshowTaskGroup();

    private static HttpRequestDef<ShowTaskGroupRequest, ShowTaskGroupResponse> genForshowTaskGroup() {
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
            f -> f.withMarshaller(ShowTaskGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartSyncTaskRequest, StartSyncTaskResponse> startSyncTask =
        genForstartSyncTask();

    private static HttpRequestDef<StartSyncTaskRequest, StartSyncTaskResponse> genForstartSyncTask() {
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
            f -> f.withMarshaller(StartSyncTaskRequest::getSyncTaskId, (req, v) -> {
                req.setSyncTaskId(v);
            }));
        builder.<StartSyncTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartSyncTaskReq.class),
            f -> f.withMarshaller(StartSyncTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartTaskRequest, StartTaskResponse> startTask = genForstartTask();

    private static HttpRequestDef<StartTaskRequest, StartTaskResponse> genForstartTask() {
        // basic
        HttpRequestDef.Builder<StartTaskRequest, StartTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartTaskRequest.class, StartTaskResponse.class)
                .withName("StartTask")
                .withUri("/v2/{project_id}/tasks/{task_id}/start")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<StartTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartTaskReq.class),
            f -> f.withMarshaller(StartTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartTaskGroupRequest, StartTaskGroupResponse> startTaskGroup =
        genForstartTaskGroup();

    private static HttpRequestDef<StartTaskGroupRequest, StartTaskGroupResponse> genForstartTaskGroup() {
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
            f -> f.withMarshaller(StartTaskGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<StartTaskGroupReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartTaskGroupReq.class),
            f -> f.withMarshaller(StartTaskGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopSyncTaskRequest, StopSyncTaskResponse> stopSyncTask = genForstopSyncTask();

    private static HttpRequestDef<StopSyncTaskRequest, StopSyncTaskResponse> genForstopSyncTask() {
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
            f -> f.withMarshaller(StopSyncTaskRequest::getSyncTaskId, (req, v) -> {
                req.setSyncTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopTaskRequest, StopTaskResponse> stopTask = genForstopTask();

    private static HttpRequestDef<StopTaskRequest, StopTaskResponse> genForstopTask() {
        // basic
        HttpRequestDef.Builder<StopTaskRequest, StopTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopTaskRequest.class, StopTaskResponse.class)
                .withName("StopTask")
                .withUri("/v2/{project_id}/tasks/{task_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopTaskGroupRequest, StopTaskGroupResponse> stopTaskGroup =
        genForstopTaskGroup();

    private static HttpRequestDef<StopTaskGroupRequest, StopTaskGroupResponse> genForstopTaskGroup() {
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
            f -> f.withMarshaller(StopTaskGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBandwidthPolicyRequest, UpdateBandwidthPolicyResponse> updateBandwidthPolicy =
        genForupdateBandwidthPolicy();

    private static HttpRequestDef<UpdateBandwidthPolicyRequest, UpdateBandwidthPolicyResponse> genForupdateBandwidthPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateBandwidthPolicyRequest, UpdateBandwidthPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateBandwidthPolicyRequest.class, UpdateBandwidthPolicyResponse.class)
            .withName("UpdateBandwidthPolicy")
            .withUri("/v2/{project_id}/tasks/{task_id}/bandwidth-policy")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBandwidthPolicyRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<UpdateBandwidthPolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateBandwidthPolicyReq.class),
            f -> f.withMarshaller(UpdateBandwidthPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTaskGroupRequest, UpdateTaskGroupResponse> updateTaskGroup =
        genForupdateTaskGroup();

    private static HttpRequestDef<UpdateTaskGroupRequest, UpdateTaskGroupResponse> genForupdateTaskGroup() {
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
            f -> f.withMarshaller(UpdateTaskGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<UpdateBandwidthPolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateBandwidthPolicyReq.class),
            f -> f.withMarshaller(UpdateTaskGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

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

    public static final HttpRequestDef<ShowApiInfoRequest, ShowApiInfoResponse> showApiInfo = genForshowApiInfo();

    private static HttpRequestDef<ShowApiInfoRequest, ShowApiInfoResponse> genForshowApiInfo() {
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
            f -> f.withMarshaller(ShowApiInfoRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));

        // response

        return builder.build();
    }

}

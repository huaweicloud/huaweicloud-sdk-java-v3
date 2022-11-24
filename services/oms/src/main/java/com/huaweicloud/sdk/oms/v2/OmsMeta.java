package com.huaweicloud.sdk.oms.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.oms.v2.model.*;

@SuppressWarnings("unchecked")
public class OmsMeta {

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

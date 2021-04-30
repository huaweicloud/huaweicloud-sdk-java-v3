package com.huaweicloud.sdk.oms.v2;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.oms.v2.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class OmsMeta {

    public static final HttpRequestDef<CreateTaskRequest, CreateTaskResponse> createTask = genForcreateTask();

    private static HttpRequestDef<CreateTaskRequest, CreateTaskResponse> genForcreateTask() {
        // basic
        HttpRequestDef.Builder<CreateTaskRequest, CreateTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTaskRequest.class, CreateTaskResponse.class)
                .withName("CreateTask")
                .withUri("/v2/{project_id}/tasks")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateTaskReq.class,
            f -> f.withMarshaller(CreateTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

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
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(DeleteTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );

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
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTasksRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListTasksRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListTasksRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListTasksRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );

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
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ShowTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );

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
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(StartTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            StartTaskReq.class,
            f -> f.withMarshaller(StartTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

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
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(StopTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateBandwidthPolicyRequest, UpdateBandwidthPolicyResponse> updateBandwidthPolicy = genForupdateBandwidthPolicy();

    private static HttpRequestDef<UpdateBandwidthPolicyRequest, UpdateBandwidthPolicyResponse> genForupdateBandwidthPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateBandwidthPolicyRequest, UpdateBandwidthPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateBandwidthPolicyRequest.class, UpdateBandwidthPolicyResponse.class)
                .withName("UpdateBandwidthPolicy")
                .withUri("/v2/{project_id}/tasks/{task_id}/bandwidth-policy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(UpdateBandwidthPolicyRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateBandwidthPolicyReq.class,
            f -> f.withMarshaller(UpdateBandwidthPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersions = genForlistApiVersions();

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
        builder.withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowApiInfoRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateSyncEventsRequest, CreateSyncEventsResponse> createSyncEvents = genForcreateSyncEvents();

    private static HttpRequestDef<CreateSyncEventsRequest, CreateSyncEventsResponse> genForcreateSyncEvents() {
        // basic
        HttpRequestDef.Builder<CreateSyncEventsRequest, CreateSyncEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSyncEventsRequest.class, CreateSyncEventsResponse.class)
                .withName("CreateSyncEvents")
                .withUri("/v2/{project_id}/sync-tasks/{sync_task_id}/events")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("sync_task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateSyncEventsRequest::getSyncTaskId, (req, v) -> {
                req.setSyncTaskId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            SyncObjectReq.class,
            f -> f.withMarshaller(CreateSyncEventsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

}

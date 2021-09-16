package com.huaweicloud.sdk.codecheck.v2;

import com.huaweicloud.sdk.codecheck.v2.model.*;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CodeCheckMeta {

    public static final HttpRequestDef<CreateTaskRequest, CreateTaskResponse> createTask = genForcreateTask();

    private static HttpRequestDef<CreateTaskRequest, CreateTaskResponse> genForcreateTask() {
        // basic
        HttpRequestDef.Builder<CreateTaskRequest, CreateTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTaskRequest.class, CreateTaskResponse.class)
                .withName("CreateTask")
                .withUri("/v2/{project_id}/task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTaskRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<CreateTaskRequestV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTaskRequestV2.class),
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
                .withUri("/v2/tasks/{task_id}")
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

    public static final HttpRequestDef<RunTaskRequest, RunTaskResponse> runTask = genForrunTask();

    private static HttpRequestDef<RunTaskRequest, RunTaskResponse> genForrunTask() {
        // basic
        HttpRequestDef.Builder<RunTaskRequest, RunTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunTaskRequest.class, RunTaskResponse.class)
                .withName("RunTask")
                .withUri("/v2/tasks/{task_id}/run")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<RunRequestV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RunRequestV2.class),
            f -> f.withMarshaller(RunTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProgressDetailRequest, ShowProgressDetailResponse> showProgressDetail =
        genForshowProgressDetail();

    private static HttpRequestDef<ShowProgressDetailRequest, ShowProgressDetailResponse> genForshowProgressDetail() {
        // basic
        HttpRequestDef.Builder<ShowProgressDetailRequest, ShowProgressDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProgressDetailRequest.class, ShowProgressDetailResponse.class)
                .withName("ShowProgressDetail")
                .withUri("/v2/tasks/{task_id}/progress")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProgressDetailRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskDefectsRequest, ShowTaskDefectsResponse> showTaskDefects =
        genForshowTaskDefects();

    private static HttpRequestDef<ShowTaskDefectsRequest, ShowTaskDefectsResponse> genForshowTaskDefects() {
        // basic
        HttpRequestDef.Builder<ShowTaskDefectsRequest, ShowTaskDefectsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTaskDefectsRequest.class, ShowTaskDefectsResponse.class)
                .withName("ShowTaskDefects")
                .withUri("/v2/tasks/{task_id}/defects-detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskDefectsRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTaskDefectsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTaskDefectsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("status_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskDefectsRequest::getStatusIds, (req, v) -> {
                req.setStatusIds(v);
            }));
        builder.<String>withRequestField("severity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskDefectsRequest::getSeverity, (req, v) -> {
                req.setSeverity(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskDefectsStatisticRequest, ShowTaskDefectsStatisticResponse> showTaskDefectsStatistic =
        genForshowTaskDefectsStatistic();

    private static HttpRequestDef<ShowTaskDefectsStatisticRequest, ShowTaskDefectsStatisticResponse> genForshowTaskDefectsStatistic() {
        // basic
        HttpRequestDef.Builder<ShowTaskDefectsStatisticRequest, ShowTaskDefectsStatisticResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowTaskDefectsStatisticRequest.class, ShowTaskDefectsStatisticResponse.class)
                .withName("ShowTaskDefectsStatistic")
                .withUri("/v2/tasks/{task_id}/defects-statistic")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskDefectsStatisticRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskDetailRequest, ShowTaskDetailResponse> showTaskDetail =
        genForshowTaskDetail();

    private static HttpRequestDef<ShowTaskDetailRequest, ShowTaskDetailResponse> genForshowTaskDetail() {
        // basic
        HttpRequestDef.Builder<ShowTaskDetailRequest, ShowTaskDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTaskDetailRequest.class, ShowTaskDetailResponse.class)
                .withName("ShowTaskDetail")
                .withUri("/v2/tasks/{task_id}/defects-summary")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskDetailRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskListByProjectIdRequest, ShowTaskListByProjectIdResponse> showTaskListByProjectId =
        genForshowTaskListByProjectId();

    private static HttpRequestDef<ShowTaskListByProjectIdRequest, ShowTaskListByProjectIdResponse> genForshowTaskListByProjectId() {
        // basic
        HttpRequestDef.Builder<ShowTaskListByProjectIdRequest, ShowTaskListByProjectIdResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowTaskListByProjectIdRequest.class, ShowTaskListByProjectIdResponse.class)
            .withName("ShowTaskListByProjectId")
            .withUri("/v2/{project_id}/tasks")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskListByProjectIdRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTaskListByProjectIdRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTaskListByProjectIdRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopTaskByIdRequest, StopTaskByIdResponse> stopTaskById = genForstopTaskById();

    private static HttpRequestDef<StopTaskByIdRequest, StopTaskByIdResponse> genForstopTaskById() {
        // basic
        HttpRequestDef.Builder<StopTaskByIdRequest, StopTaskByIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopTaskByIdRequest.class, StopTaskByIdResponse.class)
                .withName("StopTaskById")
                .withUri("/v2/tasks/{task_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopTaskByIdRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDefectStatusRequest, UpdateDefectStatusResponse> updateDefectStatus =
        genForupdateDefectStatus();

    private static HttpRequestDef<UpdateDefectStatusRequest, UpdateDefectStatusResponse> genForupdateDefectStatus() {
        // basic
        HttpRequestDef.Builder<UpdateDefectStatusRequest, UpdateDefectStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDefectStatusRequest.class, UpdateDefectStatusResponse.class)
                .withName("UpdateDefectStatus")
                .withUri("/v2/tasks/{task_id}/defect-status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDefectStatusRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<UpdateDefectRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDefectRequestBody.class),
            f -> f.withMarshaller(UpdateDefectStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}

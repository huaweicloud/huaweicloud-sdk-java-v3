package com.huaweicloud.sdk.koomap.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.koomap.v1.model.CheckImageDataDto;
import com.huaweicloud.sdk.koomap.v1.model.CheckImageResultDto;
import com.huaweicloud.sdk.koomap.v1.model.CreateTaskDto;
import com.huaweicloud.sdk.koomap.v1.model.CreateTaskRequest;
import com.huaweicloud.sdk.koomap.v1.model.CreateTaskResponse;
import com.huaweicloud.sdk.koomap.v1.model.CreateWorkSpaceDto;
import com.huaweicloud.sdk.koomap.v1.model.CreateWorkspaceRequest;
import com.huaweicloud.sdk.koomap.v1.model.CreateWorkspaceResponse;
import com.huaweicloud.sdk.koomap.v1.model.DeleteTaskRequest;
import com.huaweicloud.sdk.koomap.v1.model.DeleteTaskResponse;
import com.huaweicloud.sdk.koomap.v1.model.DeleteWorkspaceRequest;
import com.huaweicloud.sdk.koomap.v1.model.DeleteWorkspaceResponse;
import com.huaweicloud.sdk.koomap.v1.model.ListImageBaseInfoRequest;
import com.huaweicloud.sdk.koomap.v1.model.ListImageBaseInfoRequestBody;
import com.huaweicloud.sdk.koomap.v1.model.ListImageBaseInfoResponse;
import com.huaweicloud.sdk.koomap.v1.model.ListTaskInfoRequest;
import com.huaweicloud.sdk.koomap.v1.model.ListTaskInfoResponse;
import com.huaweicloud.sdk.koomap.v1.model.ListUsageInfoRequest;
import com.huaweicloud.sdk.koomap.v1.model.ListUsageInfoResponse;
import com.huaweicloud.sdk.koomap.v1.model.ListWorkspaceRequest;
import com.huaweicloud.sdk.koomap.v1.model.ListWorkspaceResponse;
import com.huaweicloud.sdk.koomap.v1.model.NaviServiceReq;
import com.huaweicloud.sdk.koomap.v1.model.ShowTaskOverviewRequest;
import com.huaweicloud.sdk.koomap.v1.model.ShowTaskOverviewResponse;
import com.huaweicloud.sdk.koomap.v1.model.StartNaviRequest;
import com.huaweicloud.sdk.koomap.v1.model.StartNaviResponse;
import com.huaweicloud.sdk.koomap.v1.model.StartTaskRequest;
import com.huaweicloud.sdk.koomap.v1.model.StartTaskResponse;
import com.huaweicloud.sdk.koomap.v1.model.StartVpsRequest;
import com.huaweicloud.sdk.koomap.v1.model.StartVpsResponse;
import com.huaweicloud.sdk.koomap.v1.model.StopTaskRequest;
import com.huaweicloud.sdk.koomap.v1.model.StopTaskResponse;
import com.huaweicloud.sdk.koomap.v1.model.UpdateTaskArchivedStatusRequest;
import com.huaweicloud.sdk.koomap.v1.model.UpdateTaskArchivedStatusResponse;
import com.huaweicloud.sdk.koomap.v1.model.UpdateWorkSpaceDto;
import com.huaweicloud.sdk.koomap.v1.model.UpdateWorkspaceRequest;
import com.huaweicloud.sdk.koomap.v1.model.UpdateWorkspaceResponse;
import com.huaweicloud.sdk.koomap.v1.model.ValidateImageRequest;
import com.huaweicloud.sdk.koomap.v1.model.ValidateImageResponse;
import com.huaweicloud.sdk.koomap.v1.model.VpsServiceReq;

import java.util.List;

@SuppressWarnings("unchecked")
public class KooMapMeta {

    public static final HttpRequestDef<CreateTaskRequest, CreateTaskResponse> createTask = genForcreateTask();

    private static HttpRequestDef<CreateTaskRequest, CreateTaskResponse> genForcreateTask() {
        // basic
        HttpRequestDef.Builder<CreateTaskRequest, CreateTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTaskRequest.class, CreateTaskResponse.class)
                .withName("CreateTask")
                .withUri("/v1/kmp-control/tasks")
                .withContentType("application/json");

        // requests
        builder.<CreateTaskDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTaskDto.class),
            f -> f.withMarshaller(CreateTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWorkspaceRequest, CreateWorkspaceResponse> createWorkspace =
        genForcreateWorkspace();

    private static HttpRequestDef<CreateWorkspaceRequest, CreateWorkspaceResponse> genForcreateWorkspace() {
        // basic
        HttpRequestDef.Builder<CreateWorkspaceRequest, CreateWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateWorkspaceRequest.class, CreateWorkspaceResponse.class)
                .withName("CreateWorkspace")
                .withUri("/v1/kmp-control/workspaces")
                .withContentType("application/json");

        // requests
        builder.<CreateWorkSpaceDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateWorkSpaceDto.class),
            f -> f.withMarshaller(CreateWorkspaceRequest::getBody, (req, v) -> {
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
                .withUri("/v1/kmp-control/tasks/{task_id}")
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
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteTaskResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWorkspaceRequest, DeleteWorkspaceResponse> deleteWorkspace =
        genFordeleteWorkspace();

    private static HttpRequestDef<DeleteWorkspaceRequest, DeleteWorkspaceResponse> genFordeleteWorkspace() {
        // basic
        HttpRequestDef.Builder<DeleteWorkspaceRequest, DeleteWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteWorkspaceRequest.class, DeleteWorkspaceResponse.class)
                .withName("DeleteWorkspace")
                .withUri("/v1/kmp-control/workspaces/{workspace_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkspaceRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteWorkspaceResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ListImageBaseInfoRequest, ListImageBaseInfoResponse> listImageBaseInfo =
        genForlistImageBaseInfo();

    private static HttpRequestDef<ListImageBaseInfoRequest, ListImageBaseInfoResponse> genForlistImageBaseInfo() {
        // basic
        HttpRequestDef.Builder<ListImageBaseInfoRequest, ListImageBaseInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListImageBaseInfoRequest.class, ListImageBaseInfoResponse.class)
                .withName("ListImageBaseInfo")
                .withUri("/v1/kmp-data/imageinfo")
                .withContentType("multipart/form-data");

        // requests
        builder.<ListImageBaseInfoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListImageBaseInfoRequestBody.class),
            f -> f.withMarshaller(ListImageBaseInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTaskInfoRequest, ListTaskInfoResponse> listTaskInfo = genForlistTaskInfo();

    private static HttpRequestDef<ListTaskInfoRequest, ListTaskInfoResponse> genForlistTaskInfo() {
        // basic
        HttpRequestDef.Builder<ListTaskInfoRequest, ListTaskInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTaskInfoRequest.class, ListTaskInfoResponse.class)
                .withName("ListTaskInfo")
                .withUri("/v1/kmp-control/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTaskInfoRequest::getTaskName, (req, v) -> {
                req.setTaskName(v);
            }));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTaskInfoRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<List<String>>withRequestField("task_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTaskInfoRequest::getTaskStatus, (req, v) -> {
                req.setTaskStatus(v);
            }));
        builder.<String>withRequestField("create_time_start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTaskInfoRequest::getCreateTimeStart, (req, v) -> {
                req.setCreateTimeStart(v);
            }));
        builder.<String>withRequestField("create_time_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTaskInfoRequest::getCreateTimeEnd, (req, v) -> {
                req.setCreateTimeEnd(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTaskInfoRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTaskInfoRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUsageInfoRequest, ListUsageInfoResponse> listUsageInfo =
        genForlistUsageInfo();

    private static HttpRequestDef<ListUsageInfoRequest, ListUsageInfoResponse> genForlistUsageInfo() {
        // basic
        HttpRequestDef.Builder<ListUsageInfoRequest, ListUsageInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUsageInfoRequest.class, ListUsageInfoResponse.class)
                .withName("ListUsageInfo")
                .withUri("/v1/kmp-control/usages")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("usage_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsageInfoRequest::getUsageType, (req, v) -> {
                req.setUsageType(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsageInfoRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsageInfoRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkspaceRequest, ListWorkspaceResponse> listWorkspace =
        genForlistWorkspace();

    private static HttpRequestDef<ListWorkspaceRequest, ListWorkspaceResponse> genForlistWorkspace() {
        // basic
        HttpRequestDef.Builder<ListWorkspaceRequest, ListWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWorkspaceRequest.class, ListWorkspaceResponse.class)
                .withName("ListWorkspace")
                .withUri("/v1/kmp-control/workspaces")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspaceRequest::getWorkspaceName, (req, v) -> {
                req.setWorkspaceName(v);
            }));
        builder.<String>withRequestField("workspace_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspaceRequest::getWorkspaceType, (req, v) -> {
                req.setWorkspaceType(v);
            }));
        builder.<String>withRequestField("create_time_start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspaceRequest::getCreateTimeStart, (req, v) -> {
                req.setCreateTimeStart(v);
            }));
        builder.<String>withRequestField("create_time_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspaceRequest::getCreateTimeEnd, (req, v) -> {
                req.setCreateTimeEnd(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkspaceRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkspaceRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Boolean>withRequestField("star",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListWorkspaceRequest::getStar, (req, v) -> {
                req.setStar(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskOverviewRequest, ShowTaskOverviewResponse> showTaskOverview =
        genForshowTaskOverview();

    private static HttpRequestDef<ShowTaskOverviewRequest, ShowTaskOverviewResponse> genForshowTaskOverview() {
        // basic
        HttpRequestDef.Builder<ShowTaskOverviewRequest, ShowTaskOverviewResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTaskOverviewRequest.class, ShowTaskOverviewResponse.class)
                .withName("ShowTaskOverview")
                .withUri("/v1/kmp-control/tasks/overview")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskOverviewRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartNaviRequest, StartNaviResponse> startNavi = genForstartNavi();

    private static HttpRequestDef<StartNaviRequest, StartNaviResponse> genForstartNavi() {
        // basic
        HttpRequestDef.Builder<StartNaviRequest, StartNaviResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartNaviRequest.class, StartNaviResponse.class)
                .withName("StartNavi")
                .withUri("/v1/algo/navi")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Trace-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartNaviRequest::getXTraceId, (req, v) -> {
                req.setXTraceId(v);
            }));
        builder.<String>withRequestField("App-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartNaviRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("Uuid",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartNaviRequest::getUuid, (req, v) -> {
                req.setUuid(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartNaviRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<NaviServiceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NaviServiceReq.class),
            f -> f.withMarshaller(StartNaviRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-Trace-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StartNaviResponse::getXTraceId, StartNaviResponse::setXTraceId));
        return builder.build();
    }

    public static final HttpRequestDef<StartTaskRequest, StartTaskResponse> startTask = genForstartTask();

    private static HttpRequestDef<StartTaskRequest, StartTaskResponse> genForstartTask() {
        // basic
        HttpRequestDef.Builder<StartTaskRequest, StartTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartTaskRequest.class, StartTaskResponse.class)
                .withName("StartTask")
                .withUri("/v1/kmp-control/tasks/{task_id}/start")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StartTaskResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<StartVpsRequest, StartVpsResponse> startVps = genForstartVps();

    private static HttpRequestDef<StartVpsRequest, StartVpsResponse> genForstartVps() {
        // basic
        HttpRequestDef.Builder<StartVpsRequest, StartVpsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartVpsRequest.class, StartVpsResponse.class)
                .withName("StartVps")
                .withUri("/v1/algo/vps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Trace-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartVpsRequest::getXTraceId, (req, v) -> {
                req.setXTraceId(v);
            }));
        builder.<String>withRequestField("App-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartVpsRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("Uuid",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartVpsRequest::getUuid, (req, v) -> {
                req.setUuid(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartVpsRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<VpsServiceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VpsServiceReq.class),
            f -> f.withMarshaller(StartVpsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-Trace-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StartVpsResponse::getXTraceId, StartVpsResponse::setXTraceId));
        return builder.build();
    }

    public static final HttpRequestDef<StopTaskRequest, StopTaskResponse> stopTask = genForstopTask();

    private static HttpRequestDef<StopTaskRequest, StopTaskResponse> genForstopTask() {
        // basic
        HttpRequestDef.Builder<StopTaskRequest, StopTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopTaskRequest.class, StopTaskResponse.class)
                .withName("StopTask")
                .withUri("/v1/kmp-control/tasks/{task_id}/stop")
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
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StopTaskResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTaskArchivedStatusRequest, UpdateTaskArchivedStatusResponse> updateTaskArchivedStatus =
        genForupdateTaskArchivedStatus();

    private static HttpRequestDef<UpdateTaskArchivedStatusRequest, UpdateTaskArchivedStatusResponse> genForupdateTaskArchivedStatus() {
        // basic
        HttpRequestDef.Builder<UpdateTaskArchivedStatusRequest, UpdateTaskArchivedStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, UpdateTaskArchivedStatusRequest.class, UpdateTaskArchivedStatusResponse.class)
                .withName("UpdateTaskArchivedStatus")
                .withUri("/v1/kmp-control/tasks/{task_id}/archive")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTaskArchivedStatusRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<Boolean>withRequestField("archived",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(UpdateTaskArchivedStatusRequest::getArchived, (req, v) -> {
                req.setArchived(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateTaskArchivedStatusResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWorkspaceRequest, UpdateWorkspaceResponse> updateWorkspace =
        genForupdateWorkspace();

    private static HttpRequestDef<UpdateWorkspaceRequest, UpdateWorkspaceResponse> genForupdateWorkspace() {
        // basic
        HttpRequestDef.Builder<UpdateWorkspaceRequest, UpdateWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateWorkspaceRequest.class, UpdateWorkspaceResponse.class)
                .withName("UpdateWorkspace")
                .withUri("/v1/kmp-control/workspaces/{workspace_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkspaceRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<UpdateWorkSpaceDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateWorkSpaceDto.class),
            f -> f.withMarshaller(UpdateWorkspaceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ValidateImageRequest, ValidateImageResponse> validateImage =
        genForvalidateImage();

    private static HttpRequestDef<ValidateImageRequest, ValidateImageResponse> genForvalidateImage() {
        // basic
        HttpRequestDef.Builder<ValidateImageRequest, ValidateImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ValidateImageRequest.class, ValidateImageResponse.class)
                .withName("ValidateImage")
                .withUri("/v1/kmp-control/tasks/image")
                .withContentType("application/json");

        // requests
        builder.<CheckImageDataDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckImageDataDto.class),
            f -> f.withMarshaller(ValidateImageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<CheckImageResultDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ValidateImageResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(CheckImageResultDto.class));

        return builder.build();
    }

}

package com.huaweicloud.sdk.codecheck.v2;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.codecheck.v2.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class CodeCheckMeta {

    public static final HttpRequestDef<CreateTaskV2Request, CreateTaskV2Response> createTaskV2 = genForcreateTaskV2();

    private static HttpRequestDef<CreateTaskV2Request, CreateTaskV2Response> genForcreateTaskV2() {
        // basic
        HttpRequestDef.Builder<CreateTaskV2Request, CreateTaskV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTaskV2Request.class, CreateTaskV2Response.class)
                .withName("CreateTaskV2")
                .withUri("/v2/{project_id}/task")
                .withContentType("application/json");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateTaskV2Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateTaskRequestV2.class,
            f -> f.withMarshaller(CreateTaskV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunTaskV2Request, RunTaskV2Response> runTaskV2 = genForrunTaskV2();

    private static HttpRequestDef<RunTaskV2Request, RunTaskV2Response> genForrunTaskV2() {
        // basic
        HttpRequestDef.Builder<RunTaskV2Request, RunTaskV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunTaskV2Request.class, RunTaskV2Response.class)
                .withName("RunTaskV2")
                .withUri("/v2/tasks/{task_id}/run")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(RunTaskV2Request::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            RunRequestV2.class,
            f -> f.withMarshaller(RunTaskV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProgressDetailV2Request, ShowProgressDetailV2Response> showProgressDetailV2 = genForshowProgressDetailV2();

    private static HttpRequestDef<ShowProgressDetailV2Request, ShowProgressDetailV2Response> genForshowProgressDetailV2() {
        // basic
        HttpRequestDef.Builder<ShowProgressDetailV2Request, ShowProgressDetailV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProgressDetailV2Request.class, ShowProgressDetailV2Response.class)
                .withName("ShowProgressDetailV2")
                .withUri("/v2/tasks/{task_id}/progress")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowProgressDetailV2Request::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskDetailV2Request, ShowTaskDetailV2Response> showTaskDetailV2 = genForshowTaskDetailV2();

    private static HttpRequestDef<ShowTaskDetailV2Request, ShowTaskDetailV2Response> genForshowTaskDetailV2() {
        // basic
        HttpRequestDef.Builder<ShowTaskDetailV2Request, ShowTaskDetailV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTaskDetailV2Request.class, ShowTaskDetailV2Response.class)
                .withName("ShowTaskDetailV2")
                .withUri("/v2/tasks/{task_id}/defects-summary")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowTaskDetailV2Request::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskListByProjectIdV2Request, ShowTaskListByProjectIdV2Response> showTaskListByProjectIdV2 = genForshowTaskListByProjectIdV2();

    private static HttpRequestDef<ShowTaskListByProjectIdV2Request, ShowTaskListByProjectIdV2Response> genForshowTaskListByProjectIdV2() {
        // basic
        HttpRequestDef.Builder<ShowTaskListByProjectIdV2Request, ShowTaskListByProjectIdV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTaskListByProjectIdV2Request.class, ShowTaskListByProjectIdV2Response.class)
                .withName("ShowTaskListByProjectIdV2")
                .withUri("/v2/{project_id}/tasks")
                .withContentType("application/json");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowTaskListByProjectIdV2Request::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowTaskListByProjectIdV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowTaskListByProjectIdV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopTaskByIdV2Request, StopTaskByIdV2Response> stopTaskByIdV2 = genForstopTaskByIdV2();

    private static HttpRequestDef<StopTaskByIdV2Request, StopTaskByIdV2Response> genForstopTaskByIdV2() {
        // basic
        HttpRequestDef.Builder<StopTaskByIdV2Request, StopTaskByIdV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopTaskByIdV2Request.class, StopTaskByIdV2Response.class)
                .withName("StopTaskByIdV2")
                .withUri("/v2/tasks/{task_id}/stop")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(StopTaskByIdV2Request::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );

        // response

        return builder.build();
    }

}

package com.huaweicloud.sdk.optverse.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.optverse.v1.model.CreateTaskRequest;
import com.huaweicloud.sdk.optverse.v1.model.CreateTaskResponse;
import com.huaweicloud.sdk.optverse.v1.model.DeleteTaskRequest;
import com.huaweicloud.sdk.optverse.v1.model.DeleteTaskResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListTaskRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListTaskResponse;
import com.huaweicloud.sdk.optverse.v1.model.ShowTaskRequest;
import com.huaweicloud.sdk.optverse.v1.model.ShowTaskResponse;
import com.huaweicloud.sdk.optverse.v1.model.TaskDto;

@SuppressWarnings("unchecked")
public class OptVerseMeta {

    public static final HttpRequestDef<CreateTaskRequest, CreateTaskResponse> createTask = genForcreateTask();

    private static HttpRequestDef<CreateTaskRequest, CreateTaskResponse> genForcreateTask() {
        // basic
        HttpRequestDef.Builder<CreateTaskRequest, CreateTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTaskRequest.class, CreateTaskResponse.class)
                .withName("CreateTask")
                .withUri("/v1/{project_id}/optverse/{service_group}/{service_type}/tasks")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("service_group",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTaskRequest::getServiceGroup, (req, v) -> {
                req.setServiceGroup(v);
            }));
        builder.<String>withRequestField("service_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTaskRequest::getServiceType, (req, v) -> {
                req.setServiceType(v);
            }));
        builder.<String>withRequestField("X-Apig-AppCode",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTaskRequest::getXApigAppCode, (req, v) -> {
                req.setXApigAppCode(v);
            }));
        builder.<TaskDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TaskDto.class),
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
                .withUri("/v1/{project_id}/optverse/{service_group}/{service_type}/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_group",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTaskRequest::getServiceGroup, (req, v) -> {
                req.setServiceGroup(v);
            }));
        builder.<String>withRequestField("service_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTaskRequest::getServiceType, (req, v) -> {
                req.setServiceType(v);
            }));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<String>withRequestField("X-Apig-AppCode",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTaskRequest::getXApigAppCode, (req, v) -> {
                req.setXApigAppCode(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTaskRequest, ListTaskResponse> listTask = genForlistTask();

    private static HttpRequestDef<ListTaskRequest, ListTaskResponse> genForlistTask() {
        // basic
        HttpRequestDef.Builder<ListTaskRequest, ListTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTaskRequest.class, ListTaskResponse.class)
                .withName("ListTask")
                .withUri("/v1/{project_id}/optverse/{service_group}/{service_type}/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_group",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTaskRequest::getServiceGroup, (req, v) -> {
                req.setServiceGroup(v);
            }));
        builder.<String>withRequestField("service_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTaskRequest::getServiceType, (req, v) -> {
                req.setServiceType(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTaskRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTaskRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("X-Apig-AppCode",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTaskRequest::getXApigAppCode, (req, v) -> {
                req.setXApigAppCode(v);
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
                .withUri("/v1/{project_id}/optverse/{service_group}/{service_type}/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_group",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskRequest::getServiceGroup, (req, v) -> {
                req.setServiceGroup(v);
            }));
        builder.<String>withRequestField("service_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskRequest::getServiceType, (req, v) -> {
                req.setServiceType(v);
            }));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<Boolean>withRequestField("input_enable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowTaskRequest::getInputEnable, (req, v) -> {
                req.setInputEnable(v);
            }));
        builder.<String>withRequestField("X-Apig-AppCode",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskRequest::getXApigAppCode, (req, v) -> {
                req.setXApigAppCode(v);
            }));

        // response

        return builder.build();
    }

}

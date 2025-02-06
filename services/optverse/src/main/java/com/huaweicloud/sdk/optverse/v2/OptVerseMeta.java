package com.huaweicloud.sdk.optverse.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.optverse.v2.model.CreateTaskRequest;
import com.huaweicloud.sdk.optverse.v2.model.CreateTaskResponse;
import com.huaweicloud.sdk.optverse.v2.model.DeleteTaskRequest;
import com.huaweicloud.sdk.optverse.v2.model.DeleteTaskResponse;
import com.huaweicloud.sdk.optverse.v2.model.ListTaskRequest;
import com.huaweicloud.sdk.optverse.v2.model.ListTaskResponse;
import com.huaweicloud.sdk.optverse.v2.model.ShowTaskRequest;
import com.huaweicloud.sdk.optverse.v2.model.ShowTaskResponse;
import com.huaweicloud.sdk.optverse.v2.model.TaskDto;

@SuppressWarnings("unchecked")
public class OptVerseMeta {

    public static final HttpRequestDef<CreateTaskRequest, CreateTaskResponse> createTask = genForCreateTask();

    private static HttpRequestDef<CreateTaskRequest, CreateTaskResponse> genForCreateTask() {
        // basic
        HttpRequestDef.Builder<CreateTaskRequest, CreateTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTaskRequest.class, CreateTaskResponse.class)
                .withName("CreateTask")
                .withUri("/v2/{project_id}/optverse/{service_type}/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTaskRequest::getServiceType, CreateTaskRequest::setServiceType));
        builder.<TaskDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TaskDto.class),
            f -> f.withMarshaller(CreateTaskRequest::getBody, CreateTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTaskRequest, DeleteTaskResponse> deleteTask = genForDeleteTask();

    private static HttpRequestDef<DeleteTaskRequest, DeleteTaskResponse> genForDeleteTask() {
        // basic
        HttpRequestDef.Builder<DeleteTaskRequest, DeleteTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTaskRequest.class, DeleteTaskResponse.class)
                .withName("DeleteTask")
                .withUri("/v2/{project_id}/optverse/{service_type}/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTaskRequest::getServiceType, DeleteTaskRequest::setServiceType));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTaskRequest::getTaskId, DeleteTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTaskRequest, ListTaskResponse> listTask = genForListTask();

    private static HttpRequestDef<ListTaskRequest, ListTaskResponse> genForListTask() {
        // basic
        HttpRequestDef.Builder<ListTaskRequest, ListTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTaskRequest.class, ListTaskResponse.class)
                .withName("ListTask")
                .withUri("/v2/{project_id}/optverse/{service_type}/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTaskRequest::getServiceType, ListTaskRequest::setServiceType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTaskRequest::getLimit, ListTaskRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTaskRequest::getOffset, ListTaskRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskRequest, ShowTaskResponse> showTask = genForShowTask();

    private static HttpRequestDef<ShowTaskRequest, ShowTaskResponse> genForShowTask() {
        // basic
        HttpRequestDef.Builder<ShowTaskRequest, ShowTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTaskRequest.class, ShowTaskResponse.class)
                .withName("ShowTask")
                .withUri("/v2/{project_id}/optverse/{service_type}/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskRequest::getServiceType, ShowTaskRequest::setServiceType));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskRequest::getTaskId, ShowTaskRequest::setTaskId));
        builder.<Boolean>withRequestField("input_enable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowTaskRequest::getInputEnable, ShowTaskRequest::setInputEnable));

        // response

        return builder.build();
    }

}

package com.huaweicloud.sdk.campusgo.v2;

import com.huaweicloud.sdk.campusgo.v2.model.CreateResponseBody;
import com.huaweicloud.sdk.campusgo.v2.model.CreateTasksRequest;
import com.huaweicloud.sdk.campusgo.v2.model.CreateTasksRequestBody;
import com.huaweicloud.sdk.campusgo.v2.model.CreateTasksResponse;
import com.huaweicloud.sdk.campusgo.v2.model.DeleteTaskRequest;
import com.huaweicloud.sdk.campusgo.v2.model.DeleteTaskResponse;
import com.huaweicloud.sdk.campusgo.v2.model.ListTasksDetailsRequest;
import com.huaweicloud.sdk.campusgo.v2.model.ListTasksDetailsResponse;
import com.huaweicloud.sdk.campusgo.v2.model.ShowTaskRequest;
import com.huaweicloud.sdk.campusgo.v2.model.ShowTaskResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;

@SuppressWarnings("unchecked")
public class CampusGoMeta {

    public static final HttpRequestDef<CreateTasksRequest, CreateTasksResponse> createTasks = genForCreateTasks();

    private static HttpRequestDef<CreateTasksRequest, CreateTasksResponse> genForCreateTasks() {
        // basic
        HttpRequestDef.Builder<CreateTasksRequest, CreateTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTasksRequest.class, CreateTasksResponse.class)
                .withName("CreateTasks")
                .withUri("/v2/{project_id}/services/{service_name}/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTasksRequest::getServiceName, CreateTasksRequest::setServiceName));
        builder.<CreateTasksRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTasksRequestBody.class),
            f -> f.withMarshaller(CreateTasksRequest::getBody, CreateTasksRequest::setBody));

        // response
        builder.<List<CreateResponseBody>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CreateTasksResponse::getBody, CreateTasksResponse::setBody)
                .withInnerContainerType(CreateResponseBody.class));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTaskRequest, DeleteTaskResponse> deleteTask = genForDeleteTask();

    private static HttpRequestDef<DeleteTaskRequest, DeleteTaskResponse> genForDeleteTask() {
        // basic
        HttpRequestDef.Builder<DeleteTaskRequest, DeleteTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTaskRequest.class, DeleteTaskResponse.class)
                .withName("DeleteTask")
                .withUri("/v2/{project_id}/services/{service_name}/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTaskRequest::getServiceName, DeleteTaskRequest::setServiceName));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTaskRequest::getTaskId, DeleteTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTasksDetailsRequest, ListTasksDetailsResponse> listTasksDetails =
        genForListTasksDetails();

    private static HttpRequestDef<ListTasksDetailsRequest, ListTasksDetailsResponse> genForListTasksDetails() {
        // basic
        HttpRequestDef.Builder<ListTasksDetailsRequest, ListTasksDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTasksDetailsRequest.class, ListTasksDetailsResponse.class)
                .withName("ListTasksDetails")
                .withUri("/v2/{project_id}/services/{service_name}/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksDetailsRequest::getServiceName, ListTasksDetailsRequest::setServiceName));
        builder.<String>withRequestField("service_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksDetailsRequest::getServiceVersion,
                ListTasksDetailsRequest::setServiceVersion));
        builder.<ListTasksDetailsRequest.StateEnum>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTasksDetailsRequest.StateEnum.class),
            f -> f.withMarshaller(ListTasksDetailsRequest::getState, ListTasksDetailsRequest::setState));
        builder.<String>withRequestField("name_like",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksDetailsRequest::getNameLike, ListTasksDetailsRequest::setNameLike));
        builder.<String>withRequestField("id_like",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksDetailsRequest::getIdLike, ListTasksDetailsRequest::setIdLike));
        builder.<Long>withRequestField("created_since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTasksDetailsRequest::getCreatedSince, ListTasksDetailsRequest::setCreatedSince));
        builder.<Long>withRequestField("created_until",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTasksDetailsRequest::getCreatedUntil, ListTasksDetailsRequest::setCreatedUntil));
        builder.<ListTasksDetailsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTasksDetailsRequest.OrderEnum.class),
            f -> f.withMarshaller(ListTasksDetailsRequest::getOrder, ListTasksDetailsRequest::setOrder));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTasksDetailsRequest::getOffset, ListTasksDetailsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTasksDetailsRequest::getLimit, ListTasksDetailsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskRequest, ShowTaskResponse> showTask = genForShowTask();

    private static HttpRequestDef<ShowTaskRequest, ShowTaskResponse> genForShowTask() {
        // basic
        HttpRequestDef.Builder<ShowTaskRequest, ShowTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTaskRequest.class, ShowTaskResponse.class)
                .withName("ShowTask")
                .withUri("/v2/{project_id}/services/{service_name}/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskRequest::getServiceName, ShowTaskRequest::setServiceName));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskRequest::getTaskId, ShowTaskRequest::setTaskId));

        // response

        return builder.build();
    }

}

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

    public static final HttpRequestDef<CreateTasksRequest, CreateTasksResponse> createTasks = genForcreateTasks();

    private static HttpRequestDef<CreateTasksRequest, CreateTasksResponse> genForcreateTasks() {
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
            f -> f.withMarshaller(CreateTasksRequest::getServiceName, (req, v) -> {
                req.setServiceName(v);
            }));
        builder.<CreateTasksRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTasksRequestBody.class),
            f -> f.withMarshaller(CreateTasksRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<CreateResponseBody>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CreateTasksResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(CreateResponseBody.class));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTaskRequest, DeleteTaskResponse> deleteTask = genFordeleteTask();

    private static HttpRequestDef<DeleteTaskRequest, DeleteTaskResponse> genFordeleteTask() {
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
            f -> f.withMarshaller(DeleteTaskRequest::getServiceName, (req, v) -> {
                req.setServiceName(v);
            }));
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

    public static final HttpRequestDef<ListTasksDetailsRequest, ListTasksDetailsResponse> listTasksDetails =
        genForlistTasksDetails();

    private static HttpRequestDef<ListTasksDetailsRequest, ListTasksDetailsResponse> genForlistTasksDetails() {
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
            f -> f.withMarshaller(ListTasksDetailsRequest::getServiceName, (req, v) -> {
                req.setServiceName(v);
            }));
        builder.<String>withRequestField("service_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksDetailsRequest::getServiceVersion, (req, v) -> {
                req.setServiceVersion(v);
            }));
        builder.<ListTasksDetailsRequest.StateEnum>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTasksDetailsRequest.StateEnum.class),
            f -> f.withMarshaller(ListTasksDetailsRequest::getState, (req, v) -> {
                req.setState(v);
            }));
        builder.<String>withRequestField("name_like",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksDetailsRequest::getNameLike, (req, v) -> {
                req.setNameLike(v);
            }));
        builder.<String>withRequestField("id_like",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksDetailsRequest::getIdLike, (req, v) -> {
                req.setIdLike(v);
            }));
        builder.<Long>withRequestField("created_since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTasksDetailsRequest::getCreatedSince, (req, v) -> {
                req.setCreatedSince(v);
            }));
        builder.<Long>withRequestField("created_until",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTasksDetailsRequest::getCreatedUntil, (req, v) -> {
                req.setCreatedUntil(v);
            }));
        builder.<ListTasksDetailsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTasksDetailsRequest.OrderEnum.class),
            f -> f.withMarshaller(ListTasksDetailsRequest::getOrder, (req, v) -> {
                req.setOrder(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTasksDetailsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTasksDetailsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
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
                .withUri("/v2/{project_id}/services/{service_name}/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskRequest::getServiceName, (req, v) -> {
                req.setServiceName(v);
            }));
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

}

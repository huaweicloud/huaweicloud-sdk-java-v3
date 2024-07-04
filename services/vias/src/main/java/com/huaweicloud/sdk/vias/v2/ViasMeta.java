package com.huaweicloud.sdk.vias.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.vias.v2.model.BatchStartStopTaskRequest;
import com.huaweicloud.sdk.vias.v2.model.BatchStartStopTaskResponse;
import com.huaweicloud.sdk.vias.v2.model.CreateBatchTaskRequest;
import com.huaweicloud.sdk.vias.v2.model.CreateBatchTaskResponse;
import com.huaweicloud.sdk.vias.v2.model.CreateBatchTasksRequestBody;
import com.huaweicloud.sdk.vias.v2.model.CreateEdgePoolRequest;
import com.huaweicloud.sdk.vias.v2.model.CreateEdgePoolRequestDto;
import com.huaweicloud.sdk.vias.v2.model.CreateEdgePoolResponse;
import com.huaweicloud.sdk.vias.v2.model.CreateTaskRequest;
import com.huaweicloud.sdk.vias.v2.model.CreateTaskResponse;
import com.huaweicloud.sdk.vias.v2.model.CreateTasksRequestBody;
import com.huaweicloud.sdk.vias.v2.model.CreateVideoGroupDto;
import com.huaweicloud.sdk.vias.v2.model.CreateVideoGroupRequest;
import com.huaweicloud.sdk.vias.v2.model.CreateVideoGroupResponse;
import com.huaweicloud.sdk.vias.v2.model.CreateVideoSourceDto;
import com.huaweicloud.sdk.vias.v2.model.CreateVideoSourceRequest;
import com.huaweicloud.sdk.vias.v2.model.CreateVideoSourceResponse;
import com.huaweicloud.sdk.vias.v2.model.DeleteBatchTaskRequest;
import com.huaweicloud.sdk.vias.v2.model.DeleteBatchTaskResponse;
import com.huaweicloud.sdk.vias.v2.model.DeleteEdgePoolRequest;
import com.huaweicloud.sdk.vias.v2.model.DeleteEdgePoolResponse;
import com.huaweicloud.sdk.vias.v2.model.DeleteTaskRequest;
import com.huaweicloud.sdk.vias.v2.model.DeleteTaskResponse;
import com.huaweicloud.sdk.vias.v2.model.DeleteVideoGroupRequest;
import com.huaweicloud.sdk.vias.v2.model.DeleteVideoGroupResponse;
import com.huaweicloud.sdk.vias.v2.model.DeleteVideoSourceRequest;
import com.huaweicloud.sdk.vias.v2.model.DeleteVideoSourceResponse;
import com.huaweicloud.sdk.vias.v2.model.DeployAlgorithmRequest;
import com.huaweicloud.sdk.vias.v2.model.DeployAlgorithmResponse;
import com.huaweicloud.sdk.vias.v2.model.DeployServiceReq;
import com.huaweicloud.sdk.vias.v2.model.ListBatchTasksRequest;
import com.huaweicloud.sdk.vias.v2.model.ListBatchTasksResponse;
import com.huaweicloud.sdk.vias.v2.model.ListEdgePoolsRequest;
import com.huaweicloud.sdk.vias.v2.model.ListEdgePoolsResponse;
import com.huaweicloud.sdk.vias.v2.model.ListTasksRequest;
import com.huaweicloud.sdk.vias.v2.model.ListTasksResponse;
import com.huaweicloud.sdk.vias.v2.model.ListUserServicesRequest;
import com.huaweicloud.sdk.vias.v2.model.ListUserServicesResponse;
import com.huaweicloud.sdk.vias.v2.model.ListVideoGroupsRequest;
import com.huaweicloud.sdk.vias.v2.model.ListVideoGroupsResponse;
import com.huaweicloud.sdk.vias.v2.model.ListVideoSourcesRequest;
import com.huaweicloud.sdk.vias.v2.model.ListVideoSourcesResponse;
import com.huaweicloud.sdk.vias.v2.model.ShowEdgePoolInfoRequest;
import com.huaweicloud.sdk.vias.v2.model.ShowEdgePoolInfoResponse;
import com.huaweicloud.sdk.vias.v2.model.ShowServiceDetailRequest;
import com.huaweicloud.sdk.vias.v2.model.ShowServiceDetailResponse;
import com.huaweicloud.sdk.vias.v2.model.ShowTaskInfoRequest;
import com.huaweicloud.sdk.vias.v2.model.ShowTaskInfoResponse;
import com.huaweicloud.sdk.vias.v2.model.ShowVideoGroupDetailRequest;
import com.huaweicloud.sdk.vias.v2.model.ShowVideoGroupDetailResponse;
import com.huaweicloud.sdk.vias.v2.model.ShowVideoSourceDetailRequest;
import com.huaweicloud.sdk.vias.v2.model.ShowVideoSourceDetailResponse;
import com.huaweicloud.sdk.vias.v2.model.StartStopTaskRequest;
import com.huaweicloud.sdk.vias.v2.model.StartStopTaskResponse;
import com.huaweicloud.sdk.vias.v2.model.StopDeployAlgorithmRequest;
import com.huaweicloud.sdk.vias.v2.model.StopDeployAlgorithmResponse;
import com.huaweicloud.sdk.vias.v2.model.UpdateBatchTaskRequest;
import com.huaweicloud.sdk.vias.v2.model.UpdateBatchTaskRequestBody;
import com.huaweicloud.sdk.vias.v2.model.UpdateBatchTaskResponse;
import com.huaweicloud.sdk.vias.v2.model.UpdateTaskRequest;
import com.huaweicloud.sdk.vias.v2.model.UpdateTaskResponse;
import com.huaweicloud.sdk.vias.v2.model.UpdateTasksRequestBody;
import com.huaweicloud.sdk.vias.v2.model.UpdateVideoGroupDto;
import com.huaweicloud.sdk.vias.v2.model.UpdateVideoGroupRequest;
import com.huaweicloud.sdk.vias.v2.model.UpdateVideoGroupResponse;
import com.huaweicloud.sdk.vias.v2.model.UpdateVideoSourceDto;
import com.huaweicloud.sdk.vias.v2.model.UpdateVideoSourceRequest;
import com.huaweicloud.sdk.vias.v2.model.UpdateVideoSourceResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class ViasMeta {

    public static final HttpRequestDef<DeployAlgorithmRequest, DeployAlgorithmResponse> deployAlgorithm =
        genForDeployAlgorithm();

    private static HttpRequestDef<DeployAlgorithmRequest, DeployAlgorithmResponse> genForDeployAlgorithm() {
        // basic
        HttpRequestDef.Builder<DeployAlgorithmRequest, DeployAlgorithmResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeployAlgorithmRequest.class, DeployAlgorithmResponse.class)
                .withName("DeployAlgorithm")
                .withUri("/v2/{project_id}/algorithm/{alg_id}/deploy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("alg_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeployAlgorithmRequest::getAlgId, DeployAlgorithmRequest::setAlgId));
        builder.<DeployServiceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeployServiceReq.class),
            f -> f.withMarshaller(DeployAlgorithmRequest::getBody, DeployAlgorithmRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserServicesRequest, ListUserServicesResponse> listUserServices =
        genForListUserServices();

    private static HttpRequestDef<ListUserServicesRequest, ListUserServicesResponse> genForListUserServices() {
        // basic
        HttpRequestDef.Builder<ListUserServicesRequest, ListUserServicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUserServicesRequest.class, ListUserServicesResponse.class)
                .withName("ListUserServices")
                .withUri("/v2/{project_id}/algorithm/services/user")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name_like",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserServicesRequest::getNameLike, ListUserServicesRequest::setNameLike));
        builder.<Boolean>withRequestField("is_paged",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListUserServicesRequest::getIsPaged, ListUserServicesRequest::setIsPaged));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserServicesRequest::getPageSize, ListUserServicesRequest::setPageSize));
        builder.<Integer>withRequestField("page_num",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserServicesRequest::getPageNum, ListUserServicesRequest::setPageNum));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserServicesRequest::getOrderBy, ListUserServicesRequest::setOrderBy));
        builder.<String>withRequestField("sort_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserServicesRequest::getSortName, ListUserServicesRequest::setSortName));
        builder.<List<String>>withRequestField("alg_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListUserServicesRequest::getAlgStatus, ListUserServicesRequest::setAlgStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowServiceDetailRequest, ShowServiceDetailResponse> showServiceDetail =
        genForShowServiceDetail();

    private static HttpRequestDef<ShowServiceDetailRequest, ShowServiceDetailResponse> genForShowServiceDetail() {
        // basic
        HttpRequestDef.Builder<ShowServiceDetailRequest, ShowServiceDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowServiceDetailRequest.class, ShowServiceDetailResponse.class)
                .withName("ShowServiceDetail")
                .withUri("/v2/{project_id}/algorithm/services/{service_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowServiceDetailRequest::getServiceId, ShowServiceDetailRequest::setServiceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopDeployAlgorithmRequest, StopDeployAlgorithmResponse> stopDeployAlgorithm =
        genForStopDeployAlgorithm();

    private static HttpRequestDef<StopDeployAlgorithmRequest, StopDeployAlgorithmResponse> genForStopDeployAlgorithm() {
        // basic
        HttpRequestDef.Builder<StopDeployAlgorithmRequest, StopDeployAlgorithmResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, StopDeployAlgorithmRequest.class, StopDeployAlgorithmResponse.class)
                .withName("StopDeployAlgorithm")
                .withUri("/v2/{project_id}/algorithm/{alg_id}/deploy/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("alg_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopDeployAlgorithmRequest::getAlgId, StopDeployAlgorithmRequest::setAlgId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchStartStopTaskRequest, BatchStartStopTaskResponse> batchStartStopTask =
        genForBatchStartStopTask();

    private static HttpRequestDef<BatchStartStopTaskRequest, BatchStartStopTaskResponse> genForBatchStartStopTask() {
        // basic
        HttpRequestDef.Builder<BatchStartStopTaskRequest, BatchStartStopTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, BatchStartStopTaskRequest.class, BatchStartStopTaskResponse.class)
                .withName("BatchStartStopTask")
                .withUri("/v2/{project_id}/batch-tasks/{id}/action/{command}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchStartStopTaskRequest::getId, BatchStartStopTaskRequest::setId));
        builder.<String>withRequestField("command",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchStartStopTaskRequest::getCommand, BatchStartStopTaskRequest::setCommand));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBatchTaskRequest, CreateBatchTaskResponse> createBatchTask =
        genForCreateBatchTask();

    private static HttpRequestDef<CreateBatchTaskRequest, CreateBatchTaskResponse> genForCreateBatchTask() {
        // basic
        HttpRequestDef.Builder<CreateBatchTaskRequest, CreateBatchTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateBatchTaskRequest.class, CreateBatchTaskResponse.class)
                .withName("CreateBatchTask")
                .withUri("/v2/{project_id}/batch-tasks")
                .withContentType("application/json");

        // requests
        builder.<CreateBatchTasksRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateBatchTasksRequestBody.class),
            f -> f.withMarshaller(CreateBatchTaskRequest::getBody, CreateBatchTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBatchTaskRequest, DeleteBatchTaskResponse> deleteBatchTask =
        genForDeleteBatchTask();

    private static HttpRequestDef<DeleteBatchTaskRequest, DeleteBatchTaskResponse> genForDeleteBatchTask() {
        // basic
        HttpRequestDef.Builder<DeleteBatchTaskRequest, DeleteBatchTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteBatchTaskRequest.class, DeleteBatchTaskResponse.class)
                .withName("DeleteBatchTask")
                .withUri("/v2/{project_id}/batch-tasks/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBatchTaskRequest::getId, DeleteBatchTaskRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBatchTasksRequest, ListBatchTasksResponse> listBatchTasks =
        genForListBatchTasks();

    private static HttpRequestDef<ListBatchTasksRequest, ListBatchTasksResponse> genForListBatchTasks() {
        // basic
        HttpRequestDef.Builder<ListBatchTasksRequest, ListBatchTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBatchTasksRequest.class, ListBatchTasksResponse.class)
                .withName("ListBatchTasks")
                .withUri("/v2/{project_id}/batch-tasks")
                .withContentType("application/json");

        // requests
        builder.<Boolean>withRequestField("is_paged",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListBatchTasksRequest::getIsPaged, ListBatchTasksRequest::setIsPaged));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBatchTasksRequest::getPageSize, ListBatchTasksRequest::setPageSize));
        builder.<Integer>withRequestField("page_num",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBatchTasksRequest::getPageNum, ListBatchTasksRequest::setPageNum));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchTasksRequest::getOrderBy, ListBatchTasksRequest::setOrderBy));
        builder.<String>withRequestField("sort_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchTasksRequest::getSortName, ListBatchTasksRequest::setSortName));
        builder.<String>withRequestField("video_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchTasksRequest::getVideoGroup, ListBatchTasksRequest::setVideoGroup));
        builder.<String>withRequestField("task_state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchTasksRequest::getTaskState, ListBatchTasksRequest::setTaskState));
        builder.<String>withRequestField("type_like",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchTasksRequest::getTypeLike, ListBatchTasksRequest::setTypeLike));
        builder.<String>withRequestField("name_like",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchTasksRequest::getNameLike, ListBatchTasksRequest::setNameLike));
        builder.<String>withRequestField("manufacturer",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchTasksRequest::getManufacturer, ListBatchTasksRequest::setManufacturer));
        builder.<String>withRequestField("title",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchTasksRequest::getTitle, ListBatchTasksRequest::setTitle));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBatchTaskRequest, UpdateBatchTaskResponse> updateBatchTask =
        genForUpdateBatchTask();

    private static HttpRequestDef<UpdateBatchTaskRequest, UpdateBatchTaskResponse> genForUpdateBatchTask() {
        // basic
        HttpRequestDef.Builder<UpdateBatchTaskRequest, UpdateBatchTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateBatchTaskRequest.class, UpdateBatchTaskResponse.class)
                .withName("UpdateBatchTask")
                .withUri("/v2/{project_id}/batch-tasks/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBatchTaskRequest::getId, UpdateBatchTaskRequest::setId));
        builder.<UpdateBatchTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateBatchTaskRequestBody.class),
            f -> f.withMarshaller(UpdateBatchTaskRequest::getBody, UpdateBatchTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEdgePoolRequest, CreateEdgePoolResponse> createEdgePool =
        genForCreateEdgePool();

    private static HttpRequestDef<CreateEdgePoolRequest, CreateEdgePoolResponse> genForCreateEdgePool() {
        // basic
        HttpRequestDef.Builder<CreateEdgePoolRequest, CreateEdgePoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEdgePoolRequest.class, CreateEdgePoolResponse.class)
                .withName("CreateEdgePool")
                .withUri("/v2/{project_id}/edge-pools")
                .withContentType("application/json");

        // requests
        builder.<CreateEdgePoolRequestDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateEdgePoolRequestDto.class),
            f -> f.withMarshaller(CreateEdgePoolRequest::getBody, CreateEdgePoolRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEdgePoolRequest, DeleteEdgePoolResponse> deleteEdgePool =
        genForDeleteEdgePool();

    private static HttpRequestDef<DeleteEdgePoolRequest, DeleteEdgePoolResponse> genForDeleteEdgePool() {
        // basic
        HttpRequestDef.Builder<DeleteEdgePoolRequest, DeleteEdgePoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteEdgePoolRequest.class, DeleteEdgePoolResponse.class)
                .withName("DeleteEdgePool")
                .withUri("/v2/{project_id}/edge-pools/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgePoolRequest::getId, DeleteEdgePoolRequest::setId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteEdgePoolResponse::getBody, DeleteEdgePoolResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListEdgePoolsRequest, ListEdgePoolsResponse> listEdgePools =
        genForListEdgePools();

    private static HttpRequestDef<ListEdgePoolsRequest, ListEdgePoolsResponse> genForListEdgePools() {
        // basic
        HttpRequestDef.Builder<ListEdgePoolsRequest, ListEdgePoolsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEdgePoolsRequest.class, ListEdgePoolsResponse.class)
                .withName("ListEdgePools")
                .withUri("/v2/{project_id}/edge-pools")
                .withContentType("application/json");

        // requests
        builder.<Boolean>withRequestField("is_paged",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListEdgePoolsRequest::getIsPaged, ListEdgePoolsRequest::setIsPaged));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEdgePoolsRequest::getPageSize, ListEdgePoolsRequest::setPageSize));
        builder.<Integer>withRequestField("page_num",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEdgePoolsRequest::getPageNum, ListEdgePoolsRequest::setPageNum));
        builder.<String>withRequestField("name_like",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgePoolsRequest::getNameLike, ListEdgePoolsRequest::setNameLike));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgePoolsRequest::getOrderBy, ListEdgePoolsRequest::setOrderBy));
        builder.<String>withRequestField("sort_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgePoolsRequest::getSortName, ListEdgePoolsRequest::setSortName));
        builder.<String>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgePoolsRequest::getState, ListEdgePoolsRequest::setState));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEdgePoolInfoRequest, ShowEdgePoolInfoResponse> showEdgePoolInfo =
        genForShowEdgePoolInfo();

    private static HttpRequestDef<ShowEdgePoolInfoRequest, ShowEdgePoolInfoResponse> genForShowEdgePoolInfo() {
        // basic
        HttpRequestDef.Builder<ShowEdgePoolInfoRequest, ShowEdgePoolInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEdgePoolInfoRequest.class, ShowEdgePoolInfoResponse.class)
                .withName("ShowEdgePoolInfo")
                .withUri("/v2/{project_id}/edge-pools/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEdgePoolInfoRequest::getId, ShowEdgePoolInfoRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTaskRequest, CreateTaskResponse> createTask = genForCreateTask();

    private static HttpRequestDef<CreateTaskRequest, CreateTaskResponse> genForCreateTask() {
        // basic
        HttpRequestDef.Builder<CreateTaskRequest, CreateTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTaskRequest.class, CreateTaskResponse.class)
                .withName("CreateTask")
                .withUri("/v2/{project_id}/services/{service_name}/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTaskRequest::getServiceName, CreateTaskRequest::setServiceName));
        builder.<CreateTasksRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTasksRequestBody.class),
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
                .withUri("/v2/{project_id}/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTaskRequest::getTaskId, DeleteTaskRequest::setTaskId));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(DeleteTaskResponse::getBody, DeleteTaskResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListTasksRequest, ListTasksResponse> listTasks = genForListTasks();

    private static HttpRequestDef<ListTasksRequest, ListTasksResponse> genForListTasks() {
        // basic
        HttpRequestDef.Builder<ListTasksRequest, ListTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTasksRequest.class, ListTasksResponse.class)
                .withName("ListTasks")
                .withUri("/v2/{project_id}/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("source_data_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getSourceDataType, ListTasksRequest::setSourceDataType));
        builder.<String>withRequestField("title",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getTitle, ListTasksRequest::setTitle));
        builder.<String>withRequestField("camera_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getCameraName, ListTasksRequest::setCameraName));
        builder.<String>withRequestField("task_state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getTaskState, ListTasksRequest::setTaskState));
        builder.<String>withRequestField("task_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getTaskName, ListTasksRequest::setTaskName));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTasksRequest::getPageSize, ListTasksRequest::setPageSize));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTasksRequest::getPage, ListTasksRequest::setPage));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getSortDir, ListTasksRequest::setSortDir));
        builder.<String>withRequestField("batch_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getBatchId, ListTasksRequest::setBatchId));
        builder.<String>withRequestField("video_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getVideoGroupId, ListTasksRequest::setVideoGroupId));
        builder.<String>withRequestField("company",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getCompany, ListTasksRequest::setCompany));
        builder.<String>withRequestField("alg_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getAlgId, ListTasksRequest::setAlgId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskInfoRequest, ShowTaskInfoResponse> showTaskInfo = genForShowTaskInfo();

    private static HttpRequestDef<ShowTaskInfoRequest, ShowTaskInfoResponse> genForShowTaskInfo() {
        // basic
        HttpRequestDef.Builder<ShowTaskInfoRequest, ShowTaskInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTaskInfoRequest.class, ShowTaskInfoResponse.class)
                .withName("ShowTaskInfo")
                .withUri("/v2/{project_id}/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskInfoRequest::getTaskId, ShowTaskInfoRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartStopTaskRequest, StartStopTaskResponse> startStopTask =
        genForStartStopTask();

    private static HttpRequestDef<StartStopTaskRequest, StartStopTaskResponse> genForStartStopTask() {
        // basic
        HttpRequestDef.Builder<StartStopTaskRequest, StartStopTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, StartStopTaskRequest.class, StartStopTaskResponse.class)
                .withName("StartStopTask")
                .withUri("/v2/{project_id}/tasks/{task_id}/action/{command}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartStopTaskRequest::getTaskId, StartStopTaskRequest::setTaskId));
        builder.<String>withRequestField("command",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartStopTaskRequest::getCommand, StartStopTaskRequest::setCommand));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(StartStopTaskResponse::getBody, StartStopTaskResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTaskRequest, UpdateTaskResponse> updateTask = genForUpdateTask();

    private static HttpRequestDef<UpdateTaskRequest, UpdateTaskResponse> genForUpdateTask() {
        // basic
        HttpRequestDef.Builder<UpdateTaskRequest, UpdateTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTaskRequest.class, UpdateTaskResponse.class)
                .withName("UpdateTask")
                .withUri("/v2/{project_id}/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTaskRequest::getTaskId, UpdateTaskRequest::setTaskId));
        builder.<UpdateTasksRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTasksRequestBody.class),
            f -> f.withMarshaller(UpdateTaskRequest::getBody, UpdateTaskRequest::setBody));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(UpdateTaskResponse::getBody, UpdateTaskResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<CreateVideoGroupRequest, CreateVideoGroupResponse> createVideoGroup =
        genForCreateVideoGroup();

    private static HttpRequestDef<CreateVideoGroupRequest, CreateVideoGroupResponse> genForCreateVideoGroup() {
        // basic
        HttpRequestDef.Builder<CreateVideoGroupRequest, CreateVideoGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVideoGroupRequest.class, CreateVideoGroupResponse.class)
                .withName("CreateVideoGroup")
                .withUri("/v2/{project_id}/video-group")
                .withContentType("application/json");

        // requests
        builder.<CreateVideoGroupDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVideoGroupDto.class),
            f -> f.withMarshaller(CreateVideoGroupRequest::getBody, CreateVideoGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVideoGroupRequest, DeleteVideoGroupResponse> deleteVideoGroup =
        genForDeleteVideoGroup();

    private static HttpRequestDef<DeleteVideoGroupRequest, DeleteVideoGroupResponse> genForDeleteVideoGroup() {
        // basic
        HttpRequestDef.Builder<DeleteVideoGroupRequest, DeleteVideoGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteVideoGroupRequest.class, DeleteVideoGroupResponse.class)
                .withName("DeleteVideoGroup")
                .withUri("/v2/{project_id}/video-group/{video_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("video_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVideoGroupRequest::getVideoGroupId, DeleteVideoGroupRequest::setVideoGroupId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteVideoGroupResponse::getBody, DeleteVideoGroupResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListVideoGroupsRequest, ListVideoGroupsResponse> listVideoGroups =
        genForListVideoGroups();

    private static HttpRequestDef<ListVideoGroupsRequest, ListVideoGroupsResponse> genForListVideoGroups() {
        // basic
        HttpRequestDef.Builder<ListVideoGroupsRequest, ListVideoGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVideoGroupsRequest.class, ListVideoGroupsResponse.class)
                .withName("ListVideoGroups")
                .withUri("/v2/{project_id}/video-group/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("sort_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVideoGroupsRequest::getSortName, ListVideoGroupsRequest::setSortName));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVideoGroupsRequest::getOrderBy, ListVideoGroupsRequest::setOrderBy));
        builder.<Boolean>withRequestField("is_paged",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListVideoGroupsRequest::getIsPaged, ListVideoGroupsRequest::setIsPaged));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVideoGroupsRequest::getPageSize, ListVideoGroupsRequest::setPageSize));
        builder.<Integer>withRequestField("page_num",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVideoGroupsRequest::getPageNum, ListVideoGroupsRequest::setPageNum));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVideoGroupsRequest::getName, ListVideoGroupsRequest::setName));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVideoGroupsRequest::getStatus, ListVideoGroupsRequest::setStatus));
        builder.<List<String>>withRequestField("access_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVideoGroupsRequest::getAccessType, ListVideoGroupsRequest::setAccessType));
        builder.<Boolean>withRequestField("has_task",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListVideoGroupsRequest::getHasTask, ListVideoGroupsRequest::setHasTask));
        builder.<List<String>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVideoGroupsRequest::getType, ListVideoGroupsRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVideoGroupDetailRequest, ShowVideoGroupDetailResponse> showVideoGroupDetail =
        genForShowVideoGroupDetail();

    private static HttpRequestDef<ShowVideoGroupDetailRequest, ShowVideoGroupDetailResponse> genForShowVideoGroupDetail() {
        // basic
        HttpRequestDef.Builder<ShowVideoGroupDetailRequest, ShowVideoGroupDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowVideoGroupDetailRequest.class, ShowVideoGroupDetailResponse.class)
            .withName("ShowVideoGroupDetail")
            .withUri("/v2/{project_id}/video-group/{video_group_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("video_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVideoGroupDetailRequest::getVideoGroupId,
                ShowVideoGroupDetailRequest::setVideoGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVideoGroupRequest, UpdateVideoGroupResponse> updateVideoGroup =
        genForUpdateVideoGroup();

    private static HttpRequestDef<UpdateVideoGroupRequest, UpdateVideoGroupResponse> genForUpdateVideoGroup() {
        // basic
        HttpRequestDef.Builder<UpdateVideoGroupRequest, UpdateVideoGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateVideoGroupRequest.class, UpdateVideoGroupResponse.class)
                .withName("UpdateVideoGroup")
                .withUri("/v2/{project_id}/video-group/{video_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("video_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVideoGroupRequest::getVideoGroupId, UpdateVideoGroupRequest::setVideoGroupId));
        builder.<UpdateVideoGroupDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateVideoGroupDto.class),
            f -> f.withMarshaller(UpdateVideoGroupRequest::getBody, UpdateVideoGroupRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateVideoGroupResponse::getBody, UpdateVideoGroupResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<CreateVideoSourceRequest, CreateVideoSourceResponse> createVideoSource =
        genForCreateVideoSource();

    private static HttpRequestDef<CreateVideoSourceRequest, CreateVideoSourceResponse> genForCreateVideoSource() {
        // basic
        HttpRequestDef.Builder<CreateVideoSourceRequest, CreateVideoSourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVideoSourceRequest.class, CreateVideoSourceResponse.class)
                .withName("CreateVideoSource")
                .withUri("/v2/{project_id}/source")
                .withContentType("application/json");

        // requests
        builder.<CreateVideoSourceDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVideoSourceDto.class),
            f -> f.withMarshaller(CreateVideoSourceRequest::getBody, CreateVideoSourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVideoSourceRequest, DeleteVideoSourceResponse> deleteVideoSource =
        genForDeleteVideoSource();

    private static HttpRequestDef<DeleteVideoSourceRequest, DeleteVideoSourceResponse> genForDeleteVideoSource() {
        // basic
        HttpRequestDef.Builder<DeleteVideoSourceRequest, DeleteVideoSourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteVideoSourceRequest.class, DeleteVideoSourceResponse.class)
                .withName("DeleteVideoSource")
                .withUri("/v2/{project_id}/source/{video_source_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("video_source_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVideoSourceRequest::getVideoSourceId,
                DeleteVideoSourceRequest::setVideoSourceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteVideoSourceResponse::getBody, DeleteVideoSourceResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListVideoSourcesRequest, ListVideoSourcesResponse> listVideoSources =
        genForListVideoSources();

    private static HttpRequestDef<ListVideoSourcesRequest, ListVideoSourcesResponse> genForListVideoSources() {
        // basic
        HttpRequestDef.Builder<ListVideoSourcesRequest, ListVideoSourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVideoSourcesRequest.class, ListVideoSourcesResponse.class)
                .withName("ListVideoSources")
                .withUri("/v2/{project_id}/source/sources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("scope",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVideoSourcesRequest::getScope, ListVideoSourcesRequest::setScope));
        builder.<String>withRequestField("scope_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVideoSourcesRequest::getScopeName, ListVideoSourcesRequest::setScopeName));
        builder.<List<String>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVideoSourcesRequest::getStatus, ListVideoSourcesRequest::setStatus));
        builder.<List<String>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVideoSourcesRequest::getType, ListVideoSourcesRequest::setType));
        builder.<List<String>>withRequestField("video_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVideoSourcesRequest::getVideoGroupId, ListVideoSourcesRequest::setVideoGroupId));
        builder.<String>withRequestField("sort_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVideoSourcesRequest::getSortName, ListVideoSourcesRequest::setSortName));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVideoSourcesRequest::getOrderBy, ListVideoSourcesRequest::setOrderBy));
        builder.<Boolean>withRequestField("is_paged",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListVideoSourcesRequest::getIsPaged, ListVideoSourcesRequest::setIsPaged));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVideoSourcesRequest::getPageSize, ListVideoSourcesRequest::setPageSize));
        builder.<Integer>withRequestField("page_num",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVideoSourcesRequest::getPageNum, ListVideoSourcesRequest::setPageNum));
        builder.<List<String>>withRequestField("access_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListVideoSourcesRequest::getAccessType, ListVideoSourcesRequest::setAccessType));
        builder.<String>withRequestField("platform_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVideoSourcesRequest::getPlatformName, ListVideoSourcesRequest::setPlatformName));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVideoSourcesRequest::getTag, ListVideoSourcesRequest::setTag));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVideoSourceDetailRequest, ShowVideoSourceDetailResponse> showVideoSourceDetail =
        genForShowVideoSourceDetail();

    private static HttpRequestDef<ShowVideoSourceDetailRequest, ShowVideoSourceDetailResponse> genForShowVideoSourceDetail() {
        // basic
        HttpRequestDef.Builder<ShowVideoSourceDetailRequest, ShowVideoSourceDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowVideoSourceDetailRequest.class, ShowVideoSourceDetailResponse.class)
            .withName("ShowVideoSourceDetail")
            .withUri("/v2/{project_id}/source/sources/{video_source_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("video_source_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVideoSourceDetailRequest::getVideoSourceId,
                ShowVideoSourceDetailRequest::setVideoSourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVideoSourceRequest, UpdateVideoSourceResponse> updateVideoSource =
        genForUpdateVideoSource();

    private static HttpRequestDef<UpdateVideoSourceRequest, UpdateVideoSourceResponse> genForUpdateVideoSource() {
        // basic
        HttpRequestDef.Builder<UpdateVideoSourceRequest, UpdateVideoSourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateVideoSourceRequest.class, UpdateVideoSourceResponse.class)
                .withName("UpdateVideoSource")
                .withUri("/v2/{project_id}/source/{video_source_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("video_source_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVideoSourceRequest::getVideoSourceId,
                UpdateVideoSourceRequest::setVideoSourceId));
        builder.<UpdateVideoSourceDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateVideoSourceDto.class),
            f -> f.withMarshaller(UpdateVideoSourceRequest::getBody, UpdateVideoSourceRequest::setBody));

        // response

        return builder.build();
    }

}

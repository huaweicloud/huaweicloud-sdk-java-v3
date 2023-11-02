package com.huaweicloud.sdk.koomap.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.koomap.v1.model.AddSpurPointRequest;
import com.huaweicloud.sdk.koomap.v1.model.AddSpurPointResponse;
import com.huaweicloud.sdk.koomap.v1.model.ArchiveReal3DTaskBody;
import com.huaweicloud.sdk.koomap.v1.model.CheckImageDataDto;
import com.huaweicloud.sdk.koomap.v1.model.CheckImageResultDto;
import com.huaweicloud.sdk.koomap.v1.model.CreateCommonWorkspaceRequest;
import com.huaweicloud.sdk.koomap.v1.model.CreateCommonWorkspaceResponse;
import com.huaweicloud.sdk.koomap.v1.model.CreateMarkerInfoRequest;
import com.huaweicloud.sdk.koomap.v1.model.CreateMarkerInfoResponse;
import com.huaweicloud.sdk.koomap.v1.model.CreateReal3DTaskDto;
import com.huaweicloud.sdk.koomap.v1.model.CreateReal3DTaskRequest;
import com.huaweicloud.sdk.koomap.v1.model.CreateReal3DTaskResponse;
import com.huaweicloud.sdk.koomap.v1.model.CreateTaskDto;
import com.huaweicloud.sdk.koomap.v1.model.CreateTaskRequest;
import com.huaweicloud.sdk.koomap.v1.model.CreateTaskResponse;
import com.huaweicloud.sdk.koomap.v1.model.CreateWorkspaceDto;
import com.huaweicloud.sdk.koomap.v1.model.DeleteCommonWorkspaceRequest;
import com.huaweicloud.sdk.koomap.v1.model.DeleteCommonWorkspaceResponse;
import com.huaweicloud.sdk.koomap.v1.model.DeleteMarkPointInfoRequest;
import com.huaweicloud.sdk.koomap.v1.model.DeleteMarkPointInfoResponse;
import com.huaweicloud.sdk.koomap.v1.model.DeleteReal3DProductRequest;
import com.huaweicloud.sdk.koomap.v1.model.DeleteReal3DProductResponse;
import com.huaweicloud.sdk.koomap.v1.model.DeleteReal3DTaskRequest;
import com.huaweicloud.sdk.koomap.v1.model.DeleteReal3DTaskResponse;
import com.huaweicloud.sdk.koomap.v1.model.DeleteSpurPointRequest;
import com.huaweicloud.sdk.koomap.v1.model.DeleteSpurPointResponse;
import com.huaweicloud.sdk.koomap.v1.model.DeleteTaskRequest;
import com.huaweicloud.sdk.koomap.v1.model.DeleteTaskResponse;
import com.huaweicloud.sdk.koomap.v1.model.DeletedSpurInfo;
import com.huaweicloud.sdk.koomap.v1.model.EstimateSpurPointRequest;
import com.huaweicloud.sdk.koomap.v1.model.EstimateSpurPointResponse;
import com.huaweicloud.sdk.koomap.v1.model.IdDto;
import com.huaweicloud.sdk.koomap.v1.model.ListCommonWorkspaceRequest;
import com.huaweicloud.sdk.koomap.v1.model.ListCommonWorkspaceResponse;
import com.huaweicloud.sdk.koomap.v1.model.ListFolderRequest;
import com.huaweicloud.sdk.koomap.v1.model.ListFolderResponse;
import com.huaweicloud.sdk.koomap.v1.model.ListImageBaseInfoRequest;
import com.huaweicloud.sdk.koomap.v1.model.ListImageBaseInfoRequestBody;
import com.huaweicloud.sdk.koomap.v1.model.ListImageBaseInfoResponse;
import com.huaweicloud.sdk.koomap.v1.model.ListMarkPointsRequest;
import com.huaweicloud.sdk.koomap.v1.model.ListMarkPointsResponse;
import com.huaweicloud.sdk.koomap.v1.model.ListReal3DProductsRequest;
import com.huaweicloud.sdk.koomap.v1.model.ListReal3DProductsResponse;
import com.huaweicloud.sdk.koomap.v1.model.ListSpurPointsRequest;
import com.huaweicloud.sdk.koomap.v1.model.ListSpurPointsResponse;
import com.huaweicloud.sdk.koomap.v1.model.ListTaskInfoRequest;
import com.huaweicloud.sdk.koomap.v1.model.ListTaskInfoResponse;
import com.huaweicloud.sdk.koomap.v1.model.ListTasksInWorkspaceRequest;
import com.huaweicloud.sdk.koomap.v1.model.ListTasksInWorkspaceResponse;
import com.huaweicloud.sdk.koomap.v1.model.ListUsageInfoRequest;
import com.huaweicloud.sdk.koomap.v1.model.ListUsageInfoResponse;
import com.huaweicloud.sdk.koomap.v1.model.MarkQueryParaInfo;
import com.huaweicloud.sdk.koomap.v1.model.NaviServiceReq;
import com.huaweicloud.sdk.koomap.v1.model.SaveMarkPointInfoRequest;
import com.huaweicloud.sdk.koomap.v1.model.SaveMarkPointInfoRequestBody;
import com.huaweicloud.sdk.koomap.v1.model.SaveMarkPointInfoResponse;
import com.huaweicloud.sdk.koomap.v1.model.ShowReal3DUsageRequest;
import com.huaweicloud.sdk.koomap.v1.model.ShowReal3DUsageResponse;
import com.huaweicloud.sdk.koomap.v1.model.ShowSpurPredictStatusRequest;
import com.huaweicloud.sdk.koomap.v1.model.ShowSpurPredictStatusResponse;
import com.huaweicloud.sdk.koomap.v1.model.ShowTaskOverviewInWorkspaceRequest;
import com.huaweicloud.sdk.koomap.v1.model.ShowTaskOverviewInWorkspaceResponse;
import com.huaweicloud.sdk.koomap.v1.model.ShowTaskOverviewRequest;
import com.huaweicloud.sdk.koomap.v1.model.ShowTaskOverviewResponse;
import com.huaweicloud.sdk.koomap.v1.model.SpurInfo;
import com.huaweicloud.sdk.koomap.v1.model.SpurPredictDetail;
import com.huaweicloud.sdk.koomap.v1.model.SpurPredictParaInfo;
import com.huaweicloud.sdk.koomap.v1.model.SpurPredictStatusPara;
import com.huaweicloud.sdk.koomap.v1.model.SpurQueryParaInfo;
import com.huaweicloud.sdk.koomap.v1.model.StartNaviRequest;
import com.huaweicloud.sdk.koomap.v1.model.StartNaviResponse;
import com.huaweicloud.sdk.koomap.v1.model.StartReal3DTaskBody;
import com.huaweicloud.sdk.koomap.v1.model.StartReal3DTaskRequest;
import com.huaweicloud.sdk.koomap.v1.model.StartReal3DTaskResponse;
import com.huaweicloud.sdk.koomap.v1.model.StartTaskRequest;
import com.huaweicloud.sdk.koomap.v1.model.StartTaskResponse;
import com.huaweicloud.sdk.koomap.v1.model.StartVpsRequest;
import com.huaweicloud.sdk.koomap.v1.model.StartVpsResponse;
import com.huaweicloud.sdk.koomap.v1.model.StopReal3DTaskRequest;
import com.huaweicloud.sdk.koomap.v1.model.StopReal3DTaskResponse;
import com.huaweicloud.sdk.koomap.v1.model.StopTaskRequest;
import com.huaweicloud.sdk.koomap.v1.model.StopTaskResponse;
import com.huaweicloud.sdk.koomap.v1.model.UpdateCommonWorkspaceRequest;
import com.huaweicloud.sdk.koomap.v1.model.UpdateCommonWorkspaceResponse;
import com.huaweicloud.sdk.koomap.v1.model.UpdateReal3DTaskArchivedStatusRequest;
import com.huaweicloud.sdk.koomap.v1.model.UpdateReal3DTaskArchivedStatusResponse;
import com.huaweicloud.sdk.koomap.v1.model.UpdateReal3DTaskDto;
import com.huaweicloud.sdk.koomap.v1.model.UpdateReal3DTaskRequest;
import com.huaweicloud.sdk.koomap.v1.model.UpdateReal3DTaskResponse;
import com.huaweicloud.sdk.koomap.v1.model.UpdateTaskArchivedStatusRequest;
import com.huaweicloud.sdk.koomap.v1.model.UpdateTaskArchivedStatusResponse;
import com.huaweicloud.sdk.koomap.v1.model.UpdateWorkspaceDto;
import com.huaweicloud.sdk.koomap.v1.model.ValidateImageRequest;
import com.huaweicloud.sdk.koomap.v1.model.ValidateImageResponse;
import com.huaweicloud.sdk.koomap.v1.model.VpsServiceReq;

import java.util.List;

@SuppressWarnings("unchecked")
public class KooMapMeta {

    public static final HttpRequestDef<AddSpurPointRequest, AddSpurPointResponse> addSpurPoint = genForaddSpurPoint();

    private static HttpRequestDef<AddSpurPointRequest, AddSpurPointResponse> genForaddSpurPoint() {
        // basic
        HttpRequestDef.Builder<AddSpurPointRequest, AddSpurPointResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddSpurPointRequest.class, AddSpurPointResponse.class)
                .withName("AddSpurPoint")
                .withUri("/v1/real3d/spur")
                .withContentType("application/json");

        // requests
        builder.<SpurInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SpurInfo.class),
            f -> f.withMarshaller(AddSpurPointRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCommonWorkspaceRequest, CreateCommonWorkspaceResponse> createCommonWorkspace =
        genForcreateCommonWorkspace();

    private static HttpRequestDef<CreateCommonWorkspaceRequest, CreateCommonWorkspaceResponse> genForcreateCommonWorkspace() {
        // basic
        HttpRequestDef.Builder<CreateCommonWorkspaceRequest, CreateCommonWorkspaceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateCommonWorkspaceRequest.class, CreateCommonWorkspaceResponse.class)
            .withName("CreateCommonWorkspace")
            .withUri("/v1/workspaces")
            .withContentType("application/json");

        // requests
        builder.<CreateWorkspaceDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateWorkspaceDto.class),
            f -> f.withMarshaller(CreateCommonWorkspaceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMarkerInfoRequest, CreateMarkerInfoResponse> createMarkerInfo =
        genForcreateMarkerInfo();

    private static HttpRequestDef<CreateMarkerInfoRequest, CreateMarkerInfoResponse> genForcreateMarkerInfo() {
        // basic
        HttpRequestDef.Builder<CreateMarkerInfoRequest, CreateMarkerInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMarkerInfoRequest.class, CreateMarkerInfoResponse.class)
                .withName("CreateMarkerInfo")
                .withUri("/v1/real3d/spur/{task_id}/markerinfo")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMarkerInfoRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateMarkerInfoResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<CreateReal3DTaskRequest, CreateReal3DTaskResponse> createReal3DTask =
        genForcreateReal3DTask();

    private static HttpRequestDef<CreateReal3DTaskRequest, CreateReal3DTaskResponse> genForcreateReal3DTask() {
        // basic
        HttpRequestDef.Builder<CreateReal3DTaskRequest, CreateReal3DTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateReal3DTaskRequest.class, CreateReal3DTaskResponse.class)
                .withName("CreateReal3DTask")
                .withUri("/v1/real3d/{workspace_id}/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateReal3DTaskRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<CreateReal3DTaskDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateReal3DTaskDto.class),
            f -> f.withMarshaller(CreateReal3DTaskRequest::getBody, (req, v) -> {
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

    public static final HttpRequestDef<DeleteCommonWorkspaceRequest, DeleteCommonWorkspaceResponse> deleteCommonWorkspace =
        genFordeleteCommonWorkspace();

    private static HttpRequestDef<DeleteCommonWorkspaceRequest, DeleteCommonWorkspaceResponse> genFordeleteCommonWorkspace() {
        // basic
        HttpRequestDef.Builder<DeleteCommonWorkspaceRequest, DeleteCommonWorkspaceResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteCommonWorkspaceRequest.class, DeleteCommonWorkspaceResponse.class)
            .withName("DeleteCommonWorkspace")
            .withUri("/v1/workspaces/{workspace_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCommonWorkspaceRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<Object>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Object.class),
            f -> f.withMarshaller(DeleteCommonWorkspaceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteCommonWorkspaceResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMarkPointInfoRequest, DeleteMarkPointInfoResponse> deleteMarkPointInfo =
        genFordeleteMarkPointInfo();

    private static HttpRequestDef<DeleteMarkPointInfoRequest, DeleteMarkPointInfoResponse> genFordeleteMarkPointInfo() {
        // basic
        HttpRequestDef.Builder<DeleteMarkPointInfoRequest, DeleteMarkPointInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteMarkPointInfoRequest.class, DeleteMarkPointInfoResponse.class)
            .withName("DeleteMarkPointInfo")
            .withUri("/v1/real3d/markinfo/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMarkPointInfoRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<Object>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Object.class),
            f -> f.withMarshaller(DeleteMarkPointInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteMarkPointInfoResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteReal3DProductRequest, DeleteReal3DProductResponse> deleteReal3DProduct =
        genFordeleteReal3DProduct();

    private static HttpRequestDef<DeleteReal3DProductRequest, DeleteReal3DProductResponse> genFordeleteReal3DProduct() {
        // basic
        HttpRequestDef.Builder<DeleteReal3DProductRequest, DeleteReal3DProductResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteReal3DProductRequest.class, DeleteReal3DProductResponse.class)
            .withName("DeleteReal3DProduct")
            .withUri("/v1/real3d/products/{product_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("product_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteReal3DProductRequest::getProductId, (req, v) -> {
                req.setProductId(v);
            }));
        builder.<Object>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Object.class),
            f -> f.withMarshaller(DeleteReal3DProductRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteReal3DProductResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteReal3DTaskRequest, DeleteReal3DTaskResponse> deleteReal3DTask =
        genFordeleteReal3DTask();

    private static HttpRequestDef<DeleteReal3DTaskRequest, DeleteReal3DTaskResponse> genFordeleteReal3DTask() {
        // basic
        HttpRequestDef.Builder<DeleteReal3DTaskRequest, DeleteReal3DTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteReal3DTaskRequest.class, DeleteReal3DTaskResponse.class)
                .withName("DeleteReal3DTask")
                .withUri("/v1/real3d/{workspace_id}/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteReal3DTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteReal3DTaskRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<Object>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Object.class),
            f -> f.withMarshaller(DeleteReal3DTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteReal3DTaskResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSpurPointRequest, DeleteSpurPointResponse> deleteSpurPoint =
        genFordeleteSpurPoint();

    private static HttpRequestDef<DeleteSpurPointRequest, DeleteSpurPointResponse> genFordeleteSpurPoint() {
        // basic
        HttpRequestDef.Builder<DeleteSpurPointRequest, DeleteSpurPointResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSpurPointRequest.class, DeleteSpurPointResponse.class)
                .withName("DeleteSpurPoint")
                .withUri("/v1/real3d/spur")
                .withContentType("application/json");

        // requests
        builder.<DeletedSpurInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeletedSpurInfo.class),
            f -> f.withMarshaller(DeleteSpurPointRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteSpurPointResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTaskRequest, DeleteTaskResponse> deleteTask = genFordeleteTask();

    private static HttpRequestDef<DeleteTaskRequest, DeleteTaskResponse> genFordeleteTask() {
        // basic
        HttpRequestDef.Builder<DeleteTaskRequest, DeleteTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTaskRequest.class, DeleteTaskResponse.class)
                .withName("DeleteTask")
                .withUri("/v1/kmp-control/tasks")
                .withContentType("application/json");

        // requests
        builder.<IdDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IdDto.class),
            f -> f.withMarshaller(DeleteTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
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

    public static final HttpRequestDef<EstimateSpurPointRequest, EstimateSpurPointResponse> estimateSpurPoint =
        genForestimateSpurPoint();

    private static HttpRequestDef<EstimateSpurPointRequest, EstimateSpurPointResponse> genForestimateSpurPoint() {
        // basic
        HttpRequestDef.Builder<EstimateSpurPointRequest, EstimateSpurPointResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EstimateSpurPointRequest.class, EstimateSpurPointResponse.class)
                .withName("EstimateSpurPoint")
                .withUri("/v1/real3d/spur/predict")
                .withContentType("application/json");

        // requests
        builder.<SpurPredictParaInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SpurPredictParaInfo.class),
            f -> f.withMarshaller(EstimateSpurPointRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<SpurPredictDetail>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(EstimateSpurPointResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(SpurPredictDetail.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListCommonWorkspaceRequest, ListCommonWorkspaceResponse> listCommonWorkspace =
        genForlistCommonWorkspace();

    private static HttpRequestDef<ListCommonWorkspaceRequest, ListCommonWorkspaceResponse> genForlistCommonWorkspace() {
        // basic
        HttpRequestDef.Builder<ListCommonWorkspaceRequest, ListCommonWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCommonWorkspaceRequest.class, ListCommonWorkspaceResponse.class)
                .withName("ListCommonWorkspace")
                .withUri("/v1/workspaces")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCommonWorkspaceRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCommonWorkspaceRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<List<String>>withRequestField("workspace_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCommonWorkspaceRequest::getWorkspaceIds, (req, v) -> {
                req.setWorkspaceIds(v);
            }));
        builder.<String>withRequestField("workspace_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommonWorkspaceRequest::getWorkspaceName, (req, v) -> {
                req.setWorkspaceName(v);
            }));
        builder.<Boolean>withRequestField("star",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCommonWorkspaceRequest::getStar, (req, v) -> {
                req.setStar(v);
            }));
        builder.<String>withRequestField("create_time_from",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommonWorkspaceRequest::getCreateTimeFrom, (req, v) -> {
                req.setCreateTimeFrom(v);
            }));
        builder.<String>withRequestField("create_time_to",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommonWorkspaceRequest::getCreateTimeTo, (req, v) -> {
                req.setCreateTimeTo(v);
            }));
        builder.<String>withRequestField("update_time_from",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommonWorkspaceRequest::getUpdateTimeFrom, (req, v) -> {
                req.setUpdateTimeFrom(v);
            }));
        builder.<String>withRequestField("update_time_to",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommonWorkspaceRequest::getUpdateTimeTo, (req, v) -> {
                req.setUpdateTimeTo(v);
            }));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommonWorkspaceRequest::getOrderBy, (req, v) -> {
                req.setOrderBy(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFolderRequest, ListFolderResponse> listFolder = genForlistFolder();

    private static HttpRequestDef<ListFolderRequest, ListFolderResponse> genForlistFolder() {
        // basic
        HttpRequestDef.Builder<ListFolderRequest, ListFolderResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFolderRequest.class, ListFolderResponse.class)
                .withName("ListFolder")
                .withUri("/v1/real3d/folders")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFolderRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFolderRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

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

    public static final HttpRequestDef<ListMarkPointsRequest, ListMarkPointsResponse> listMarkPoints =
        genForlistMarkPoints();

    private static HttpRequestDef<ListMarkPointsRequest, ListMarkPointsResponse> genForlistMarkPoints() {
        // basic
        HttpRequestDef.Builder<ListMarkPointsRequest, ListMarkPointsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListMarkPointsRequest.class, ListMarkPointsResponse.class)
                .withName("ListMarkPoints")
                .withUri("/v1/real3d/markinfo")
                .withContentType("application/json");

        // requests
        builder.<MarkQueryParaInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MarkQueryParaInfo.class),
            f -> f.withMarshaller(ListMarkPointsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListReal3DProductsRequest, ListReal3DProductsResponse> listReal3DProducts =
        genForlistReal3DProducts();

    private static HttpRequestDef<ListReal3DProductsRequest, ListReal3DProductsResponse> genForlistReal3DProducts() {
        // basic
        HttpRequestDef.Builder<ListReal3DProductsRequest, ListReal3DProductsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListReal3DProductsRequest.class, ListReal3DProductsResponse.class)
                .withName("ListReal3DProducts")
                .withUri("/v1/real3d/products")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListReal3DProductsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListReal3DProductsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("product_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReal3DProductsRequest::getProductName, (req, v) -> {
                req.setProductName(v);
            }));
        builder.<String>withRequestField("product_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReal3DProductsRequest::getProductId, (req, v) -> {
                req.setProductId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSpurPointsRequest, ListSpurPointsResponse> listSpurPoints =
        genForlistSpurPoints();

    private static HttpRequestDef<ListSpurPointsRequest, ListSpurPointsResponse> genForlistSpurPoints() {
        // basic
        HttpRequestDef.Builder<ListSpurPointsRequest, ListSpurPointsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListSpurPointsRequest.class, ListSpurPointsResponse.class)
                .withName("ListSpurPoints")
                .withUri("/v1/real3d/spurs")
                .withContentType("application/json");

        // requests
        builder.<SpurQueryParaInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SpurQueryParaInfo.class),
            f -> f.withMarshaller(ListSpurPointsRequest::getBody, (req, v) -> {
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

    public static final HttpRequestDef<ListTasksInWorkspaceRequest, ListTasksInWorkspaceResponse> listTasksInWorkspace =
        genForlistTasksInWorkspace();

    private static HttpRequestDef<ListTasksInWorkspaceRequest, ListTasksInWorkspaceResponse> genForlistTasksInWorkspace() {
        // basic
        HttpRequestDef.Builder<ListTasksInWorkspaceRequest, ListTasksInWorkspaceResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListTasksInWorkspaceRequest.class, ListTasksInWorkspaceResponse.class)
            .withName("ListTasksInWorkspace")
            .withUri("/v1/real3d/{workspace_id}/tasks")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksInWorkspaceRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTasksInWorkspaceRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTasksInWorkspaceRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("task_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksInWorkspaceRequest::getTaskName, (req, v) -> {
                req.setTaskName(v);
            }));
        builder.<List<String>>withRequestField("task_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTasksInWorkspaceRequest::getTaskType, (req, v) -> {
                req.setTaskType(v);
            }));
        builder.<String>withRequestField("create_time_from",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksInWorkspaceRequest::getCreateTimeFrom, (req, v) -> {
                req.setCreateTimeFrom(v);
            }));
        builder.<String>withRequestField("create_time_to",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksInWorkspaceRequest::getCreateTimeTo, (req, v) -> {
                req.setCreateTimeTo(v);
            }));
        builder.<String>withRequestField("update_time_from",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksInWorkspaceRequest::getUpdateTimeFrom, (req, v) -> {
                req.setUpdateTimeFrom(v);
            }));
        builder.<String>withRequestField("update_time_to",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksInWorkspaceRequest::getUpdateTimeTo, (req, v) -> {
                req.setUpdateTimeTo(v);
            }));
        builder.<List<String>>withRequestField("task_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTasksInWorkspaceRequest::getTaskIds, (req, v) -> {
                req.setTaskIds(v);
            }));
        builder.<List<String>>withRequestField("task_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTasksInWorkspaceRequest::getTaskStatus, (req, v) -> {
                req.setTaskStatus(v);
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
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsageInfoRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsageInfoRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SaveMarkPointInfoRequest, SaveMarkPointInfoResponse> saveMarkPointInfo =
        genForsaveMarkPointInfo();

    private static HttpRequestDef<SaveMarkPointInfoRequest, SaveMarkPointInfoResponse> genForsaveMarkPointInfo() {
        // basic
        HttpRequestDef.Builder<SaveMarkPointInfoRequest, SaveMarkPointInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SaveMarkPointInfoRequest.class, SaveMarkPointInfoResponse.class)
                .withName("SaveMarkPointInfo")
                .withUri("/v1/real3d/markinfo")
                .withContentType("multipart/form-data");

        // requests
        builder.<SaveMarkPointInfoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SaveMarkPointInfoRequestBody.class),
            f -> f.withMarshaller(SaveMarkPointInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SaveMarkPointInfoResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ShowReal3DUsageRequest, ShowReal3DUsageResponse> showReal3DUsage =
        genForshowReal3DUsage();

    private static HttpRequestDef<ShowReal3DUsageRequest, ShowReal3DUsageResponse> genForshowReal3DUsage() {
        // basic
        HttpRequestDef.Builder<ShowReal3DUsageRequest, ShowReal3DUsageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowReal3DUsageRequest.class, ShowReal3DUsageResponse.class)
                .withName("ShowReal3DUsage")
                .withUri("/v1/real3d/usages")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("usage_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReal3DUsageRequest::getUsageType, (req, v) -> {
                req.setUsageType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSpurPredictStatusRequest, ShowSpurPredictStatusResponse> showSpurPredictStatus =
        genForshowSpurPredictStatus();

    private static HttpRequestDef<ShowSpurPredictStatusRequest, ShowSpurPredictStatusResponse> genForshowSpurPredictStatus() {
        // basic
        HttpRequestDef.Builder<ShowSpurPredictStatusRequest, ShowSpurPredictStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ShowSpurPredictStatusRequest.class, ShowSpurPredictStatusResponse.class)
            .withName("ShowSpurPredictStatus")
            .withUri("/v1/real3d/spur/predict/status")
            .withContentType("application/json");

        // requests
        builder.<SpurPredictStatusPara>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SpurPredictStatusPara.class),
            f -> f.withMarshaller(ShowSpurPredictStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
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

    public static final HttpRequestDef<ShowTaskOverviewInWorkspaceRequest, ShowTaskOverviewInWorkspaceResponse> showTaskOverviewInWorkspace =
        genForshowTaskOverviewInWorkspace();

    private static HttpRequestDef<ShowTaskOverviewInWorkspaceRequest, ShowTaskOverviewInWorkspaceResponse> genForshowTaskOverviewInWorkspace() {
        // basic
        HttpRequestDef.Builder<ShowTaskOverviewInWorkspaceRequest, ShowTaskOverviewInWorkspaceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowTaskOverviewInWorkspaceRequest.class,
                    ShowTaskOverviewInWorkspaceResponse.class)
                .withName("ShowTaskOverviewInWorkspace")
                .withUri("/v1/real3d/{workspace_id}/tasks/overview")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskOverviewInWorkspaceRequest::getWorkspaceId, (req, v) -> {
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

    public static final HttpRequestDef<StartReal3DTaskRequest, StartReal3DTaskResponse> startReal3DTask =
        genForstartReal3DTask();

    private static HttpRequestDef<StartReal3DTaskRequest, StartReal3DTaskResponse> genForstartReal3DTask() {
        // basic
        HttpRequestDef.Builder<StartReal3DTaskRequest, StartReal3DTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartReal3DTaskRequest.class, StartReal3DTaskResponse.class)
                .withName("StartReal3DTask")
                .withUri("/v1/real3d/{workspace_id}/tasks/{task_id}/start")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartReal3DTaskRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartReal3DTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<StartReal3DTaskBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartReal3DTaskBody.class),
            f -> f.withMarshaller(StartReal3DTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
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
                .withUri("/v1/kmp-control/tasks/start")
                .withContentType("application/json");

        // requests
        builder.<IdDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IdDto.class),
            f -> f.withMarshaller(StartTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
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

    public static final HttpRequestDef<StopReal3DTaskRequest, StopReal3DTaskResponse> stopReal3DTask =
        genForstopReal3DTask();

    private static HttpRequestDef<StopReal3DTaskRequest, StopReal3DTaskResponse> genForstopReal3DTask() {
        // basic
        HttpRequestDef.Builder<StopReal3DTaskRequest, StopReal3DTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopReal3DTaskRequest.class, StopReal3DTaskResponse.class)
                .withName("StopReal3DTask")
                .withUri("/v1/real3d/{workspace_id}/tasks/{task_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopReal3DTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopReal3DTaskRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<Object>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Object.class),
            f -> f.withMarshaller(StopReal3DTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StopReal3DTaskResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<StopTaskRequest, StopTaskResponse> stopTask = genForstopTask();

    private static HttpRequestDef<StopTaskRequest, StopTaskResponse> genForstopTask() {
        // basic
        HttpRequestDef.Builder<StopTaskRequest, StopTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopTaskRequest.class, StopTaskResponse.class)
                .withName("StopTask")
                .withUri("/v1/kmp-control/tasks/stop")
                .withContentType("application/json");

        // requests
        builder.<IdDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IdDto.class),
            f -> f.withMarshaller(StopTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
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

    public static final HttpRequestDef<UpdateCommonWorkspaceRequest, UpdateCommonWorkspaceResponse> updateCommonWorkspace =
        genForupdateCommonWorkspace();

    private static HttpRequestDef<UpdateCommonWorkspaceRequest, UpdateCommonWorkspaceResponse> genForupdateCommonWorkspace() {
        // basic
        HttpRequestDef.Builder<UpdateCommonWorkspaceRequest, UpdateCommonWorkspaceResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateCommonWorkspaceRequest.class, UpdateCommonWorkspaceResponse.class)
            .withName("UpdateCommonWorkspace")
            .withUri("/v1/workspaces/{workspace_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCommonWorkspaceRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<UpdateWorkspaceDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateWorkspaceDto.class),
            f -> f.withMarshaller(UpdateCommonWorkspaceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateReal3DTaskRequest, UpdateReal3DTaskResponse> updateReal3DTask =
        genForupdateReal3DTask();

    private static HttpRequestDef<UpdateReal3DTaskRequest, UpdateReal3DTaskResponse> genForupdateReal3DTask() {
        // basic
        HttpRequestDef.Builder<UpdateReal3DTaskRequest, UpdateReal3DTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateReal3DTaskRequest.class, UpdateReal3DTaskResponse.class)
                .withName("UpdateReal3DTask")
                .withUri("/v1/real3d/{workspace_id}/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateReal3DTaskRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateReal3DTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<UpdateReal3DTaskDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateReal3DTaskDto.class),
            f -> f.withMarshaller(UpdateReal3DTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateReal3DTaskArchivedStatusRequest, UpdateReal3DTaskArchivedStatusResponse> updateReal3DTaskArchivedStatus =
        genForupdateReal3DTaskArchivedStatus();

    private static HttpRequestDef<UpdateReal3DTaskArchivedStatusRequest, UpdateReal3DTaskArchivedStatusResponse> genForupdateReal3DTaskArchivedStatus() {
        // basic
        HttpRequestDef.Builder<UpdateReal3DTaskArchivedStatusRequest, UpdateReal3DTaskArchivedStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateReal3DTaskArchivedStatusRequest.class,
                    UpdateReal3DTaskArchivedStatusResponse.class)
                .withName("UpdateReal3DTaskArchivedStatus")
                .withUri("/v1/real3d/{workspace_id}/tasks/{task_id}/archive")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateReal3DTaskArchivedStatusRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateReal3DTaskArchivedStatusRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<ArchiveReal3DTaskBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ArchiveReal3DTaskBody.class),
            f -> f.withMarshaller(UpdateReal3DTaskArchivedStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

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
                .withUri("/v1/kmp-control/tasks/archive")
                .withContentType("application/json");

        // requests
        builder.<Boolean>withRequestField("archived",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(UpdateTaskArchivedStatusRequest::getArchived, (req, v) -> {
                req.setArchived(v);
            }));
        builder.<IdDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IdDto.class),
            f -> f.withMarshaller(UpdateTaskArchivedStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
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

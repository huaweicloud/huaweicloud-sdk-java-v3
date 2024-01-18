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
import com.huaweicloud.sdk.koomap.v1.model.DeleteReal3DProductRequest;
import com.huaweicloud.sdk.koomap.v1.model.DeleteReal3DProductResponse;
import com.huaweicloud.sdk.koomap.v1.model.DeleteReal3DTaskRequest;
import com.huaweicloud.sdk.koomap.v1.model.DeleteReal3DTaskResponse;
import com.huaweicloud.sdk.koomap.v1.model.DeleteSpurPointRequest;
import com.huaweicloud.sdk.koomap.v1.model.DeleteSpurPointResponse;
import com.huaweicloud.sdk.koomap.v1.model.DeleteTaskRequest;
import com.huaweicloud.sdk.koomap.v1.model.DeleteTaskResponse;
import com.huaweicloud.sdk.koomap.v1.model.DeletedSpurInfo;
import com.huaweicloud.sdk.koomap.v1.model.IdDto;
import com.huaweicloud.sdk.koomap.v1.model.ListCommonWorkspaceRequest;
import com.huaweicloud.sdk.koomap.v1.model.ListCommonWorkspaceResponse;
import com.huaweicloud.sdk.koomap.v1.model.ListFolderRequest;
import com.huaweicloud.sdk.koomap.v1.model.ListFolderResponse;
import com.huaweicloud.sdk.koomap.v1.model.ListImageBaseInfoRequest;
import com.huaweicloud.sdk.koomap.v1.model.ListImageBaseInfoRequestBody;
import com.huaweicloud.sdk.koomap.v1.model.ListImageBaseInfoResponse;
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
import com.huaweicloud.sdk.koomap.v1.model.NaviServiceReq;
import com.huaweicloud.sdk.koomap.v1.model.QueryFolderReq;
import com.huaweicloud.sdk.koomap.v1.model.ShowReal3DUsageRequest;
import com.huaweicloud.sdk.koomap.v1.model.ShowReal3DUsageResponse;
import com.huaweicloud.sdk.koomap.v1.model.ShowSpurCountRequest;
import com.huaweicloud.sdk.koomap.v1.model.ShowSpurCountResponse;
import com.huaweicloud.sdk.koomap.v1.model.ShowTaskOverviewInWorkspaceRequest;
import com.huaweicloud.sdk.koomap.v1.model.ShowTaskOverviewInWorkspaceResponse;
import com.huaweicloud.sdk.koomap.v1.model.ShowTaskOverviewRequest;
import com.huaweicloud.sdk.koomap.v1.model.ShowTaskOverviewResponse;
import com.huaweicloud.sdk.koomap.v1.model.SpurCountQueryParaInfo;
import com.huaweicloud.sdk.koomap.v1.model.SpurInfo;
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

    public static final HttpRequestDef<AddSpurPointRequest, AddSpurPointResponse> addSpurPoint = genForAddSpurPoint();

    private static HttpRequestDef<AddSpurPointRequest, AddSpurPointResponse> genForAddSpurPoint() {
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
            f -> f.withMarshaller(AddSpurPointRequest::getBody, AddSpurPointRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCommonWorkspaceRequest, CreateCommonWorkspaceResponse> createCommonWorkspace =
        genForCreateCommonWorkspace();

    private static HttpRequestDef<CreateCommonWorkspaceRequest, CreateCommonWorkspaceResponse> genForCreateCommonWorkspace() {
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
            f -> f.withMarshaller(CreateCommonWorkspaceRequest::getBody, CreateCommonWorkspaceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMarkerInfoRequest, CreateMarkerInfoResponse> createMarkerInfo =
        genForCreateMarkerInfo();

    private static HttpRequestDef<CreateMarkerInfoRequest, CreateMarkerInfoResponse> genForCreateMarkerInfo() {
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
            f -> f.withMarshaller(CreateMarkerInfoRequest::getTaskId, CreateMarkerInfoRequest::setTaskId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateMarkerInfoResponse::getBody, CreateMarkerInfoResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<CreateReal3DTaskRequest, CreateReal3DTaskResponse> createReal3DTask =
        genForCreateReal3DTask();

    private static HttpRequestDef<CreateReal3DTaskRequest, CreateReal3DTaskResponse> genForCreateReal3DTask() {
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
            f -> f.withMarshaller(CreateReal3DTaskRequest::getWorkspaceId, CreateReal3DTaskRequest::setWorkspaceId));
        builder.<CreateReal3DTaskDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateReal3DTaskDto.class),
            f -> f.withMarshaller(CreateReal3DTaskRequest::getBody, CreateReal3DTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTaskRequest, CreateTaskResponse> createTask = genForCreateTask();

    private static HttpRequestDef<CreateTaskRequest, CreateTaskResponse> genForCreateTask() {
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
            f -> f.withMarshaller(CreateTaskRequest::getBody, CreateTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCommonWorkspaceRequest, DeleteCommonWorkspaceResponse> deleteCommonWorkspace =
        genForDeleteCommonWorkspace();

    private static HttpRequestDef<DeleteCommonWorkspaceRequest, DeleteCommonWorkspaceResponse> genForDeleteCommonWorkspace() {
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
            f -> f.withMarshaller(DeleteCommonWorkspaceRequest::getWorkspaceId,
                DeleteCommonWorkspaceRequest::setWorkspaceId));
        builder.<Object>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Object.class),
            f -> f.withMarshaller(DeleteCommonWorkspaceRequest::getBody, DeleteCommonWorkspaceRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteCommonWorkspaceResponse::getBody, DeleteCommonWorkspaceResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteReal3DProductRequest, DeleteReal3DProductResponse> deleteReal3DProduct =
        genForDeleteReal3DProduct();

    private static HttpRequestDef<DeleteReal3DProductRequest, DeleteReal3DProductResponse> genForDeleteReal3DProduct() {
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
            f -> f.withMarshaller(DeleteReal3DProductRequest::getProductId, DeleteReal3DProductRequest::setProductId));
        builder.<Object>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Object.class),
            f -> f.withMarshaller(DeleteReal3DProductRequest::getBody, DeleteReal3DProductRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteReal3DProductResponse::getBody, DeleteReal3DProductResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteReal3DTaskRequest, DeleteReal3DTaskResponse> deleteReal3DTask =
        genForDeleteReal3DTask();

    private static HttpRequestDef<DeleteReal3DTaskRequest, DeleteReal3DTaskResponse> genForDeleteReal3DTask() {
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
            f -> f.withMarshaller(DeleteReal3DTaskRequest::getTaskId, DeleteReal3DTaskRequest::setTaskId));
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteReal3DTaskRequest::getWorkspaceId, DeleteReal3DTaskRequest::setWorkspaceId));
        builder.<Object>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Object.class),
            f -> f.withMarshaller(DeleteReal3DTaskRequest::getBody, DeleteReal3DTaskRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteReal3DTaskResponse::getBody, DeleteReal3DTaskResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSpurPointRequest, DeleteSpurPointResponse> deleteSpurPoint =
        genForDeleteSpurPoint();

    private static HttpRequestDef<DeleteSpurPointRequest, DeleteSpurPointResponse> genForDeleteSpurPoint() {
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
            f -> f.withMarshaller(DeleteSpurPointRequest::getBody, DeleteSpurPointRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteSpurPointResponse::getBody, DeleteSpurPointResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTaskRequest, DeleteTaskResponse> deleteTask = genForDeleteTask();

    private static HttpRequestDef<DeleteTaskRequest, DeleteTaskResponse> genForDeleteTask() {
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
            f -> f.withMarshaller(DeleteTaskRequest::getBody, DeleteTaskRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteTaskResponse::getBody, DeleteTaskResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListCommonWorkspaceRequest, ListCommonWorkspaceResponse> listCommonWorkspace =
        genForListCommonWorkspace();

    private static HttpRequestDef<ListCommonWorkspaceRequest, ListCommonWorkspaceResponse> genForListCommonWorkspace() {
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
            f -> f.withMarshaller(ListCommonWorkspaceRequest::getOffset, ListCommonWorkspaceRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCommonWorkspaceRequest::getLimit, ListCommonWorkspaceRequest::setLimit));
        builder.<List<String>>withRequestField("workspace_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListCommonWorkspaceRequest::getWorkspaceIds,
                ListCommonWorkspaceRequest::setWorkspaceIds));
        builder.<String>withRequestField("workspace_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommonWorkspaceRequest::getWorkspaceName,
                ListCommonWorkspaceRequest::setWorkspaceName));
        builder.<Boolean>withRequestField("star",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCommonWorkspaceRequest::getStar, ListCommonWorkspaceRequest::setStar));
        builder.<String>withRequestField("create_time_from",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommonWorkspaceRequest::getCreateTimeFrom,
                ListCommonWorkspaceRequest::setCreateTimeFrom));
        builder.<String>withRequestField("create_time_to",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommonWorkspaceRequest::getCreateTimeTo,
                ListCommonWorkspaceRequest::setCreateTimeTo));
        builder.<String>withRequestField("update_time_from",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommonWorkspaceRequest::getUpdateTimeFrom,
                ListCommonWorkspaceRequest::setUpdateTimeFrom));
        builder.<String>withRequestField("update_time_to",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommonWorkspaceRequest::getUpdateTimeTo,
                ListCommonWorkspaceRequest::setUpdateTimeTo));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommonWorkspaceRequest::getOrderBy, ListCommonWorkspaceRequest::setOrderBy));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFolderRequest, ListFolderResponse> listFolder = genForListFolder();

    private static HttpRequestDef<ListFolderRequest, ListFolderResponse> genForListFolder() {
        // basic
        HttpRequestDef.Builder<ListFolderRequest, ListFolderResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFolderRequest.class, ListFolderResponse.class)
                .withName("ListFolder")
                .withUri("/v1/real3d/folders")
                .withContentType("application/json");

        // requests
        builder.<QueryFolderReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryFolderReq.class),
            f -> f.withMarshaller(ListFolderRequest::getBody, ListFolderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImageBaseInfoRequest, ListImageBaseInfoResponse> listImageBaseInfo =
        genForListImageBaseInfo();

    private static HttpRequestDef<ListImageBaseInfoRequest, ListImageBaseInfoResponse> genForListImageBaseInfo() {
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
            f -> f.withMarshaller(ListImageBaseInfoRequest::getBody, ListImageBaseInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListReal3DProductsRequest, ListReal3DProductsResponse> listReal3DProducts =
        genForListReal3DProducts();

    private static HttpRequestDef<ListReal3DProductsRequest, ListReal3DProductsResponse> genForListReal3DProducts() {
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
            f -> f.withMarshaller(ListReal3DProductsRequest::getOffset, ListReal3DProductsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListReal3DProductsRequest::getLimit, ListReal3DProductsRequest::setLimit));
        builder.<String>withRequestField("product_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReal3DProductsRequest::getProductName,
                ListReal3DProductsRequest::setProductName));
        builder.<String>withRequestField("product_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReal3DProductsRequest::getProductId, ListReal3DProductsRequest::setProductId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSpurPointsRequest, ListSpurPointsResponse> listSpurPoints =
        genForListSpurPoints();

    private static HttpRequestDef<ListSpurPointsRequest, ListSpurPointsResponse> genForListSpurPoints() {
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
            f -> f.withMarshaller(ListSpurPointsRequest::getBody, ListSpurPointsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTaskInfoRequest, ListTaskInfoResponse> listTaskInfo = genForListTaskInfo();

    private static HttpRequestDef<ListTaskInfoRequest, ListTaskInfoResponse> genForListTaskInfo() {
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
            f -> f.withMarshaller(ListTaskInfoRequest::getTaskName, ListTaskInfoRequest::setTaskName));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTaskInfoRequest::getWorkspaceId, ListTaskInfoRequest::setWorkspaceId));
        builder.<List<String>>withRequestField("task_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTaskInfoRequest::getTaskStatus, ListTaskInfoRequest::setTaskStatus));
        builder.<String>withRequestField("create_time_start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTaskInfoRequest::getCreateTimeStart, ListTaskInfoRequest::setCreateTimeStart));
        builder.<String>withRequestField("create_time_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTaskInfoRequest::getCreateTimeEnd, ListTaskInfoRequest::setCreateTimeEnd));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTaskInfoRequest::getOffset, ListTaskInfoRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTaskInfoRequest::getLimit, ListTaskInfoRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTasksInWorkspaceRequest, ListTasksInWorkspaceResponse> listTasksInWorkspace =
        genForListTasksInWorkspace();

    private static HttpRequestDef<ListTasksInWorkspaceRequest, ListTasksInWorkspaceResponse> genForListTasksInWorkspace() {
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
            f -> f.withMarshaller(ListTasksInWorkspaceRequest::getWorkspaceId,
                ListTasksInWorkspaceRequest::setWorkspaceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTasksInWorkspaceRequest::getOffset, ListTasksInWorkspaceRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTasksInWorkspaceRequest::getLimit, ListTasksInWorkspaceRequest::setLimit));
        builder.<String>withRequestField("task_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksInWorkspaceRequest::getTaskName, ListTasksInWorkspaceRequest::setTaskName));
        builder.<List<String>>withRequestField("task_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTasksInWorkspaceRequest::getTaskType, ListTasksInWorkspaceRequest::setTaskType));
        builder.<String>withRequestField("modeling_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksInWorkspaceRequest::getModelingType,
                ListTasksInWorkspaceRequest::setModelingType));
        builder.<String>withRequestField("create_time_from",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksInWorkspaceRequest::getCreateTimeFrom,
                ListTasksInWorkspaceRequest::setCreateTimeFrom));
        builder.<String>withRequestField("create_time_to",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksInWorkspaceRequest::getCreateTimeTo,
                ListTasksInWorkspaceRequest::setCreateTimeTo));
        builder.<String>withRequestField("update_time_from",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksInWorkspaceRequest::getUpdateTimeFrom,
                ListTasksInWorkspaceRequest::setUpdateTimeFrom));
        builder.<String>withRequestField("update_time_to",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksInWorkspaceRequest::getUpdateTimeTo,
                ListTasksInWorkspaceRequest::setUpdateTimeTo));
        builder.<List<String>>withRequestField("task_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTasksInWorkspaceRequest::getTaskIds, ListTasksInWorkspaceRequest::setTaskIds));
        builder.<List<String>>withRequestField("task_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTasksInWorkspaceRequest::getTaskStatus,
                ListTasksInWorkspaceRequest::setTaskStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUsageInfoRequest, ListUsageInfoResponse> listUsageInfo =
        genForListUsageInfo();

    private static HttpRequestDef<ListUsageInfoRequest, ListUsageInfoResponse> genForListUsageInfo() {
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
            f -> f.withMarshaller(ListUsageInfoRequest::getUsageType, ListUsageInfoRequest::setUsageType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsageInfoRequest::getLimit, ListUsageInfoRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsageInfoRequest::getOffset, ListUsageInfoRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowReal3DUsageRequest, ShowReal3DUsageResponse> showReal3DUsage =
        genForShowReal3DUsage();

    private static HttpRequestDef<ShowReal3DUsageRequest, ShowReal3DUsageResponse> genForShowReal3DUsage() {
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
            f -> f.withMarshaller(ShowReal3DUsageRequest::getUsageType, ShowReal3DUsageRequest::setUsageType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSpurCountRequest, ShowSpurCountResponse> showSpurCount =
        genForShowSpurCount();

    private static HttpRequestDef<ShowSpurCountRequest, ShowSpurCountResponse> genForShowSpurCount() {
        // basic
        HttpRequestDef.Builder<ShowSpurCountRequest, ShowSpurCountResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowSpurCountRequest.class, ShowSpurCountResponse.class)
                .withName("ShowSpurCount")
                .withUri("/v1/real3d/spur/count")
                .withContentType("application/json");

        // requests
        builder.<SpurCountQueryParaInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SpurCountQueryParaInfo.class),
            f -> f.withMarshaller(ShowSpurCountRequest::getBody, ShowSpurCountRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskOverviewRequest, ShowTaskOverviewResponse> showTaskOverview =
        genForShowTaskOverview();

    private static HttpRequestDef<ShowTaskOverviewRequest, ShowTaskOverviewResponse> genForShowTaskOverview() {
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
            f -> f.withMarshaller(ShowTaskOverviewRequest::getWorkspaceId, ShowTaskOverviewRequest::setWorkspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskOverviewInWorkspaceRequest, ShowTaskOverviewInWorkspaceResponse> showTaskOverviewInWorkspace =
        genForShowTaskOverviewInWorkspace();

    private static HttpRequestDef<ShowTaskOverviewInWorkspaceRequest, ShowTaskOverviewInWorkspaceResponse> genForShowTaskOverviewInWorkspace() {
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
            f -> f.withMarshaller(ShowTaskOverviewInWorkspaceRequest::getWorkspaceId,
                ShowTaskOverviewInWorkspaceRequest::setWorkspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartNaviRequest, StartNaviResponse> startNavi = genForStartNavi();

    private static HttpRequestDef<StartNaviRequest, StartNaviResponse> genForStartNavi() {
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
            f -> f.withMarshaller(StartNaviRequest::getXTraceId, StartNaviRequest::setXTraceId));
        builder.<String>withRequestField("App-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartNaviRequest::getAppId, StartNaviRequest::setAppId));
        builder.<String>withRequestField("Uuid",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartNaviRequest::getUuid, StartNaviRequest::setUuid));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartNaviRequest::getAuthorization, StartNaviRequest::setAuthorization));
        builder.<NaviServiceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NaviServiceReq.class),
            f -> f.withMarshaller(StartNaviRequest::getBody, StartNaviRequest::setBody));

        // response

        builder.<String>withResponseField("X-Trace-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StartNaviResponse::getXTraceId, StartNaviResponse::setXTraceId));
        return builder.build();
    }

    public static final HttpRequestDef<StartReal3DTaskRequest, StartReal3DTaskResponse> startReal3DTask =
        genForStartReal3DTask();

    private static HttpRequestDef<StartReal3DTaskRequest, StartReal3DTaskResponse> genForStartReal3DTask() {
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
            f -> f.withMarshaller(StartReal3DTaskRequest::getWorkspaceId, StartReal3DTaskRequest::setWorkspaceId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartReal3DTaskRequest::getTaskId, StartReal3DTaskRequest::setTaskId));
        builder.<StartReal3DTaskBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartReal3DTaskBody.class),
            f -> f.withMarshaller(StartReal3DTaskRequest::getBody, StartReal3DTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartTaskRequest, StartTaskResponse> startTask = genForStartTask();

    private static HttpRequestDef<StartTaskRequest, StartTaskResponse> genForStartTask() {
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
            f -> f.withMarshaller(StartTaskRequest::getBody, StartTaskRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StartTaskResponse::getBody, StartTaskResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<StartVpsRequest, StartVpsResponse> startVps = genForStartVps();

    private static HttpRequestDef<StartVpsRequest, StartVpsResponse> genForStartVps() {
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
            f -> f.withMarshaller(StartVpsRequest::getXTraceId, StartVpsRequest::setXTraceId));
        builder.<String>withRequestField("App-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartVpsRequest::getAppId, StartVpsRequest::setAppId));
        builder.<String>withRequestField("Uuid",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartVpsRequest::getUuid, StartVpsRequest::setUuid));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartVpsRequest::getAuthorization, StartVpsRequest::setAuthorization));
        builder.<VpsServiceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VpsServiceReq.class),
            f -> f.withMarshaller(StartVpsRequest::getBody, StartVpsRequest::setBody));

        // response

        builder.<String>withResponseField("X-Trace-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StartVpsResponse::getXTraceId, StartVpsResponse::setXTraceId));
        return builder.build();
    }

    public static final HttpRequestDef<StopReal3DTaskRequest, StopReal3DTaskResponse> stopReal3DTask =
        genForStopReal3DTask();

    private static HttpRequestDef<StopReal3DTaskRequest, StopReal3DTaskResponse> genForStopReal3DTask() {
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
            f -> f.withMarshaller(StopReal3DTaskRequest::getTaskId, StopReal3DTaskRequest::setTaskId));
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopReal3DTaskRequest::getWorkspaceId, StopReal3DTaskRequest::setWorkspaceId));
        builder.<Object>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Object.class),
            f -> f.withMarshaller(StopReal3DTaskRequest::getBody, StopReal3DTaskRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StopReal3DTaskResponse::getBody, StopReal3DTaskResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<StopTaskRequest, StopTaskResponse> stopTask = genForStopTask();

    private static HttpRequestDef<StopTaskRequest, StopTaskResponse> genForStopTask() {
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
            f -> f.withMarshaller(StopTaskRequest::getBody, StopTaskRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StopTaskResponse::getBody, StopTaskResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCommonWorkspaceRequest, UpdateCommonWorkspaceResponse> updateCommonWorkspace =
        genForUpdateCommonWorkspace();

    private static HttpRequestDef<UpdateCommonWorkspaceRequest, UpdateCommonWorkspaceResponse> genForUpdateCommonWorkspace() {
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
            f -> f.withMarshaller(UpdateCommonWorkspaceRequest::getWorkspaceId,
                UpdateCommonWorkspaceRequest::setWorkspaceId));
        builder.<UpdateWorkspaceDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateWorkspaceDto.class),
            f -> f.withMarshaller(UpdateCommonWorkspaceRequest::getBody, UpdateCommonWorkspaceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateReal3DTaskRequest, UpdateReal3DTaskResponse> updateReal3DTask =
        genForUpdateReal3DTask();

    private static HttpRequestDef<UpdateReal3DTaskRequest, UpdateReal3DTaskResponse> genForUpdateReal3DTask() {
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
            f -> f.withMarshaller(UpdateReal3DTaskRequest::getWorkspaceId, UpdateReal3DTaskRequest::setWorkspaceId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateReal3DTaskRequest::getTaskId, UpdateReal3DTaskRequest::setTaskId));
        builder.<UpdateReal3DTaskDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateReal3DTaskDto.class),
            f -> f.withMarshaller(UpdateReal3DTaskRequest::getBody, UpdateReal3DTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateReal3DTaskArchivedStatusRequest, UpdateReal3DTaskArchivedStatusResponse> updateReal3DTaskArchivedStatus =
        genForUpdateReal3DTaskArchivedStatus();

    private static HttpRequestDef<UpdateReal3DTaskArchivedStatusRequest, UpdateReal3DTaskArchivedStatusResponse> genForUpdateReal3DTaskArchivedStatus() {
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
            f -> f.withMarshaller(UpdateReal3DTaskArchivedStatusRequest::getTaskId,
                UpdateReal3DTaskArchivedStatusRequest::setTaskId));
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateReal3DTaskArchivedStatusRequest::getWorkspaceId,
                UpdateReal3DTaskArchivedStatusRequest::setWorkspaceId));
        builder.<ArchiveReal3DTaskBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ArchiveReal3DTaskBody.class),
            f -> f.withMarshaller(UpdateReal3DTaskArchivedStatusRequest::getBody,
                UpdateReal3DTaskArchivedStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTaskArchivedStatusRequest, UpdateTaskArchivedStatusResponse> updateTaskArchivedStatus =
        genForUpdateTaskArchivedStatus();

    private static HttpRequestDef<UpdateTaskArchivedStatusRequest, UpdateTaskArchivedStatusResponse> genForUpdateTaskArchivedStatus() {
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
            f -> f.withMarshaller(UpdateTaskArchivedStatusRequest::getArchived,
                UpdateTaskArchivedStatusRequest::setArchived));
        builder.<IdDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IdDto.class),
            f -> f.withMarshaller(UpdateTaskArchivedStatusRequest::getBody, UpdateTaskArchivedStatusRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateTaskArchivedStatusResponse::getBody,
                UpdateTaskArchivedStatusResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ValidateImageRequest, ValidateImageResponse> validateImage =
        genForValidateImage();

    private static HttpRequestDef<ValidateImageRequest, ValidateImageResponse> genForValidateImage() {
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
            f -> f.withMarshaller(ValidateImageRequest::getBody, ValidateImageRequest::setBody));

        // response
        builder.<List<CheckImageResultDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ValidateImageResponse::getBody, ValidateImageResponse::setBody)
                .withInnerContainerType(CheckImageResultDto.class));

        return builder.build();
    }

}

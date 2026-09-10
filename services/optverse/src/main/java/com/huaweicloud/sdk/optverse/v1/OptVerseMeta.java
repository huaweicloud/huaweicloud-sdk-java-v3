package com.huaweicloud.sdk.optverse.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.optverse.v1.model.AlgorithmCreateDto;
import com.huaweicloud.sdk.optverse.v1.model.AuthorizePermissionRequest;
import com.huaweicloud.sdk.optverse.v1.model.AuthorizePermissionResponse;
import com.huaweicloud.sdk.optverse.v1.model.BatchDeleteEvolveTaskRequest;
import com.huaweicloud.sdk.optverse.v1.model.BatchDeleteEvolveTaskResponse;
import com.huaweicloud.sdk.optverse.v1.model.CancelChatRequest;
import com.huaweicloud.sdk.optverse.v1.model.CancelChatResponse;
import com.huaweicloud.sdk.optverse.v1.model.CreateAlgorithmRequest;
import com.huaweicloud.sdk.optverse.v1.model.CreateAlgorithmResponse;
import com.huaweicloud.sdk.optverse.v1.model.CreateArtifactsReq;
import com.huaweicloud.sdk.optverse.v1.model.CreateArtifactsRequest;
import com.huaweicloud.sdk.optverse.v1.model.CreateArtifactsResponse;
import com.huaweicloud.sdk.optverse.v1.model.CreateEvolveTaskRequest;
import com.huaweicloud.sdk.optverse.v1.model.CreateEvolveTaskResponse;
import com.huaweicloud.sdk.optverse.v1.model.CreateModelServiceReq;
import com.huaweicloud.sdk.optverse.v1.model.CreateModelServiceRequest;
import com.huaweicloud.sdk.optverse.v1.model.CreateModelServiceResponse;
import com.huaweicloud.sdk.optverse.v1.model.CreateModelServiceTaskReq;
import com.huaweicloud.sdk.optverse.v1.model.CreateModelServiceTaskRequest;
import com.huaweicloud.sdk.optverse.v1.model.CreateModelServiceTaskResponse;
import com.huaweicloud.sdk.optverse.v1.model.DeleteAlgorithmFileRequest;
import com.huaweicloud.sdk.optverse.v1.model.DeleteAlgorithmFileResponse;
import com.huaweicloud.sdk.optverse.v1.model.DeleteAlgorithmRequest;
import com.huaweicloud.sdk.optverse.v1.model.DeleteAlgorithmResponse;
import com.huaweicloud.sdk.optverse.v1.model.DeleteChatRequest;
import com.huaweicloud.sdk.optverse.v1.model.DeleteChatResponse;
import com.huaweicloud.sdk.optverse.v1.model.DeleteEvolveTaskRequest;
import com.huaweicloud.sdk.optverse.v1.model.DeleteEvolveTaskResponse;
import com.huaweicloud.sdk.optverse.v1.model.DeleteModelAssetRequest;
import com.huaweicloud.sdk.optverse.v1.model.DeleteModelAssetResponse;
import com.huaweicloud.sdk.optverse.v1.model.DeleteModelServiceRequest;
import com.huaweicloud.sdk.optverse.v1.model.DeleteModelServiceResponse;
import com.huaweicloud.sdk.optverse.v1.model.DownloadFileRequest;
import com.huaweicloud.sdk.optverse.v1.model.DownloadFileResponse;
import com.huaweicloud.sdk.optverse.v1.model.EvolveTaskBatchDeleteReq;
import com.huaweicloud.sdk.optverse.v1.model.EvolveTaskCreateReq;
import com.huaweicloud.sdk.optverse.v1.model.ImportAlgorithmFileRequest;
import com.huaweicloud.sdk.optverse.v1.model.ImportAlgorithmFileRequestBody;
import com.huaweicloud.sdk.optverse.v1.model.ImportAlgorithmFileResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListAlgorithmsRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListAlgorithmsResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListArtifactsRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListArtifactsResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListBucketsRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListBucketsResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListChatRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListChatResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListDirectoryByAlgorithmIdRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListDirectoryByAlgorithmIdResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListDirectoryByResultCommitIdRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListDirectoryByResultCommitIdResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListEvolveTaskMetasRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListEvolveTaskMetasResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListEvolveTaskStatsRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListEvolveTaskStatsResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListModelAssetsRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListModelAssetsResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListModelServiceTasksRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListModelServiceTasksResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListObjectRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListObjectResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListPermissionRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListPermissionResponse;
import com.huaweicloud.sdk.optverse.v1.model.PublishChatReq;
import com.huaweicloud.sdk.optverse.v1.model.PublishChatRequest;
import com.huaweicloud.sdk.optverse.v1.model.PublishChatResponse;
import com.huaweicloud.sdk.optverse.v1.model.PublishModelReq;
import com.huaweicloud.sdk.optverse.v1.model.PublishModelRequest;
import com.huaweicloud.sdk.optverse.v1.model.PublishModelResponse;
import com.huaweicloud.sdk.optverse.v1.model.RevokePermissionRequest;
import com.huaweicloud.sdk.optverse.v1.model.RevokePermissionResponse;
import com.huaweicloud.sdk.optverse.v1.model.SaveAlgorithmFileRequest;
import com.huaweicloud.sdk.optverse.v1.model.SaveAlgorithmFileRequestBody;
import com.huaweicloud.sdk.optverse.v1.model.SaveAlgorithmFileResponse;
import com.huaweicloud.sdk.optverse.v1.model.ShowAlgorithmFileRequest;
import com.huaweicloud.sdk.optverse.v1.model.ShowAlgorithmFileResponse;
import com.huaweicloud.sdk.optverse.v1.model.ShowAlgorithmRequest;
import com.huaweicloud.sdk.optverse.v1.model.ShowAlgorithmResponse;
import com.huaweicloud.sdk.optverse.v1.model.ShowChatRequest;
import com.huaweicloud.sdk.optverse.v1.model.ShowChatResponse;
import com.huaweicloud.sdk.optverse.v1.model.ShowModelAssetDetailRequest;
import com.huaweicloud.sdk.optverse.v1.model.ShowModelAssetDetailResponse;
import com.huaweicloud.sdk.optverse.v1.model.ShowModelServiceDetailRequest;
import com.huaweicloud.sdk.optverse.v1.model.ShowModelServiceDetailResponse;
import com.huaweicloud.sdk.optverse.v1.model.ShowModelServiceListRequest;
import com.huaweicloud.sdk.optverse.v1.model.ShowModelServiceListResponse;
import com.huaweicloud.sdk.optverse.v1.model.ShowModelServiceTaskRequest;
import com.huaweicloud.sdk.optverse.v1.model.ShowModelServiceTaskResponse;
import com.huaweicloud.sdk.optverse.v1.model.ShowTaskDetailsRequest;
import com.huaweicloud.sdk.optverse.v1.model.ShowTaskDetailsResponse;
import com.huaweicloud.sdk.optverse.v1.model.ShowTaskResultCommitRequest;
import com.huaweicloud.sdk.optverse.v1.model.ShowTaskResultCommitResponse;
import com.huaweicloud.sdk.optverse.v1.model.ShowTaskResultListRequest;
import com.huaweicloud.sdk.optverse.v1.model.ShowTaskResultListResponse;
import com.huaweicloud.sdk.optverse.v1.model.ShowTaskRunningDetailsRequest;
import com.huaweicloud.sdk.optverse.v1.model.ShowTaskRunningDetailsResponse;
import com.huaweicloud.sdk.optverse.v1.model.ShowTaskRunningLogRequest;
import com.huaweicloud.sdk.optverse.v1.model.ShowTaskRunningLogResponse;
import com.huaweicloud.sdk.optverse.v1.model.StartEvolveTaskRequest;
import com.huaweicloud.sdk.optverse.v1.model.StartEvolveTaskResponse;
import com.huaweicloud.sdk.optverse.v1.model.StartModelServiceRequest;
import com.huaweicloud.sdk.optverse.v1.model.StartModelServiceResponse;
import com.huaweicloud.sdk.optverse.v1.model.StopEvolveTaskRequest;
import com.huaweicloud.sdk.optverse.v1.model.StopEvolveTaskResponse;
import com.huaweicloud.sdk.optverse.v1.model.StopModelServiceRequest;
import com.huaweicloud.sdk.optverse.v1.model.StopModelServiceResponse;
import com.huaweicloud.sdk.optverse.v1.model.UpdateAlgorithmDto;
import com.huaweicloud.sdk.optverse.v1.model.UpdateAlgorithmRequest;
import com.huaweicloud.sdk.optverse.v1.model.UpdateAlgorithmResponse;
import com.huaweicloud.sdk.optverse.v1.model.UpdateChatReq;
import com.huaweicloud.sdk.optverse.v1.model.UpdateChatRequest;
import com.huaweicloud.sdk.optverse.v1.model.UpdateChatResponse;
import com.huaweicloud.sdk.optverse.v1.model.UpdateEvolveTaskRequest;
import com.huaweicloud.sdk.optverse.v1.model.UpdateEvolveTaskResponse;
import com.huaweicloud.sdk.optverse.v1.model.UpdateModelAssetReq;
import com.huaweicloud.sdk.optverse.v1.model.UpdateModelAssetRequest;
import com.huaweicloud.sdk.optverse.v1.model.UpdateModelAssetResponse;
import com.huaweicloud.sdk.optverse.v1.model.UpdateModelServiceReq;
import com.huaweicloud.sdk.optverse.v1.model.UpdateModelServiceRequest;
import com.huaweicloud.sdk.optverse.v1.model.UpdateModelServiceResponse;
import com.huaweicloud.sdk.optverse.v1.model.UploadFileRequest;
import com.huaweicloud.sdk.optverse.v1.model.UploadFileRequestBody;
import com.huaweicloud.sdk.optverse.v1.model.UploadFileResponse;
import com.huaweicloud.sdk.optverse.v1.model.UploadModelServiceTaskFileRequest;
import com.huaweicloud.sdk.optverse.v1.model.UploadModelServiceTaskFileRequestBody;
import com.huaweicloud.sdk.optverse.v1.model.UploadModelServiceTaskFileResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class OptVerseMeta {

    public static final HttpRequestDef<BatchDeleteEvolveTaskRequest, BatchDeleteEvolveTaskResponse> batchDeleteEvolveTask =
        genForBatchDeleteEvolveTask();

    private static HttpRequestDef<BatchDeleteEvolveTaskRequest, BatchDeleteEvolveTaskResponse> genForBatchDeleteEvolveTask() {
        // basic
        HttpRequestDef.Builder<BatchDeleteEvolveTaskRequest, BatchDeleteEvolveTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteEvolveTaskRequest.class, BatchDeleteEvolveTaskResponse.class)
            .withName("BatchDeleteEvolveTask")
            .withUri("/v1/{project_id}/llm4ad/evolve-tasks/batch-delete")
            .withContentType("application/json");

        // requests
        builder.<EvolveTaskBatchDeleteReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EvolveTaskBatchDeleteReq.class),
            f -> f.withMarshaller(BatchDeleteEvolveTaskRequest::getBody, BatchDeleteEvolveTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAlgorithmRequest, CreateAlgorithmResponse> createAlgorithm =
        genForCreateAlgorithm();

    private static HttpRequestDef<CreateAlgorithmRequest, CreateAlgorithmResponse> genForCreateAlgorithm() {
        // basic
        HttpRequestDef.Builder<CreateAlgorithmRequest, CreateAlgorithmResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAlgorithmRequest.class, CreateAlgorithmResponse.class)
                .withName("CreateAlgorithm")
                .withUri("/v1/{project_id}/llm4ad/algorithms")
                .withContentType("application/json");

        // requests
        builder.<AlgorithmCreateDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AlgorithmCreateDto.class),
            f -> f.withMarshaller(CreateAlgorithmRequest::getBody, CreateAlgorithmRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEvolveTaskRequest, CreateEvolveTaskResponse> createEvolveTask =
        genForCreateEvolveTask();

    private static HttpRequestDef<CreateEvolveTaskRequest, CreateEvolveTaskResponse> genForCreateEvolveTask() {
        // basic
        HttpRequestDef.Builder<CreateEvolveTaskRequest, CreateEvolveTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEvolveTaskRequest.class, CreateEvolveTaskResponse.class)
                .withName("CreateEvolveTask")
                .withUri("/v1/{project_id}/llm4ad/evolve-tasks")
                .withContentType("application/json");

        // requests
        builder.<EvolveTaskCreateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EvolveTaskCreateReq.class),
            f -> f.withMarshaller(CreateEvolveTaskRequest::getBody, CreateEvolveTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAlgorithmRequest, DeleteAlgorithmResponse> deleteAlgorithm =
        genForDeleteAlgorithm();

    private static HttpRequestDef<DeleteAlgorithmRequest, DeleteAlgorithmResponse> genForDeleteAlgorithm() {
        // basic
        HttpRequestDef.Builder<DeleteAlgorithmRequest, DeleteAlgorithmResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAlgorithmRequest.class, DeleteAlgorithmResponse.class)
                .withName("DeleteAlgorithm")
                .withUri("/v1/{project_id}/llm4ad/algorithms/{algorithm_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("algorithm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAlgorithmRequest::getAlgorithmId, DeleteAlgorithmRequest::setAlgorithmId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAlgorithmFileRequest, DeleteAlgorithmFileResponse> deleteAlgorithmFile =
        genForDeleteAlgorithmFile();

    private static HttpRequestDef<DeleteAlgorithmFileRequest, DeleteAlgorithmFileResponse> genForDeleteAlgorithmFile() {
        // basic
        HttpRequestDef.Builder<DeleteAlgorithmFileRequest, DeleteAlgorithmFileResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAlgorithmFileRequest.class, DeleteAlgorithmFileResponse.class)
            .withName("DeleteAlgorithmFile")
            .withUri("/v1/{project_id}/llm4ad/algorithms/{algorithm_id}/editor/files")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("algorithm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAlgorithmFileRequest::getAlgorithmId,
                DeleteAlgorithmFileRequest::setAlgorithmId));
        builder.<String>withRequestField("file_path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAlgorithmFileRequest::getFilePath, DeleteAlgorithmFileRequest::setFilePath));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEvolveTaskRequest, DeleteEvolveTaskResponse> deleteEvolveTask =
        genForDeleteEvolveTask();

    private static HttpRequestDef<DeleteEvolveTaskRequest, DeleteEvolveTaskResponse> genForDeleteEvolveTask() {
        // basic
        HttpRequestDef.Builder<DeleteEvolveTaskRequest, DeleteEvolveTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteEvolveTaskRequest.class, DeleteEvolveTaskResponse.class)
                .withName("DeleteEvolveTask")
                .withUri("/v1/{project_id}/llm4ad/evolve-tasks/{evolve_task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("evolve_task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEvolveTaskRequest::getEvolveTaskId, DeleteEvolveTaskRequest::setEvolveTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportAlgorithmFileRequest, ImportAlgorithmFileResponse> importAlgorithmFile =
        genForImportAlgorithmFile();

    private static HttpRequestDef<ImportAlgorithmFileRequest, ImportAlgorithmFileResponse> genForImportAlgorithmFile() {
        // basic
        HttpRequestDef.Builder<ImportAlgorithmFileRequest, ImportAlgorithmFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ImportAlgorithmFileRequest.class, ImportAlgorithmFileResponse.class)
                .withName("ImportAlgorithmFile")
                .withUri("/v1/{project_id}/llm4ad/algorithms/{algorithm_id}/editor/init")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("algorithm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportAlgorithmFileRequest::getAlgorithmId,
                ImportAlgorithmFileRequest::setAlgorithmId));
        builder.<ImportAlgorithmFileRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportAlgorithmFileRequestBody.class),
            f -> f.withMarshaller(ImportAlgorithmFileRequest::getBody, ImportAlgorithmFileRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlgorithmsRequest, ListAlgorithmsResponse> listAlgorithms =
        genForListAlgorithms();

    private static HttpRequestDef<ListAlgorithmsRequest, ListAlgorithmsResponse> genForListAlgorithms() {
        // basic
        HttpRequestDef.Builder<ListAlgorithmsRequest, ListAlgorithmsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlgorithmsRequest.class, ListAlgorithmsResponse.class)
                .withName("ListAlgorithms")
                .withUri("/v1/{project_id}/llm4ad/algorithms")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlgorithmsRequest::getOrder, ListAlgorithmsRequest::setOrder));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlgorithmsRequest::getLimit, ListAlgorithmsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlgorithmsRequest::getOffset, ListAlgorithmsRequest::setOffset));
        builder.<String>withRequestField("lang",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlgorithmsRequest::getLang, ListAlgorithmsRequest::setLang));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlgorithmsRequest::getId, ListAlgorithmsRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlgorithmsRequest::getName, ListAlgorithmsRequest::setName));
        builder.<String>withRequestField("user_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlgorithmsRequest::getUserId, ListAlgorithmsRequest::setUserId));
        builder.<ListAlgorithmsRequest.VisibilityEnum>withRequestField("visibility",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAlgorithmsRequest.VisibilityEnum.class),
            f -> f.withMarshaller(ListAlgorithmsRequest::getVisibility, ListAlgorithmsRequest::setVisibility));
        builder.<Long>withRequestField("create_time_start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAlgorithmsRequest::getCreateTimeStart,
                ListAlgorithmsRequest::setCreateTimeStart));
        builder.<Long>withRequestField("create_time_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAlgorithmsRequest::getCreateTimeEnd, ListAlgorithmsRequest::setCreateTimeEnd));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDirectoryByAlgorithmIdRequest, ListDirectoryByAlgorithmIdResponse> listDirectoryByAlgorithmId =
        genForListDirectoryByAlgorithmId();

    private static HttpRequestDef<ListDirectoryByAlgorithmIdRequest, ListDirectoryByAlgorithmIdResponse> genForListDirectoryByAlgorithmId() {
        // basic
        HttpRequestDef.Builder<ListDirectoryByAlgorithmIdRequest, ListDirectoryByAlgorithmIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListDirectoryByAlgorithmIdRequest.class,
                    ListDirectoryByAlgorithmIdResponse.class)
                .withName("ListDirectoryByAlgorithmId")
                .withUri("/v1/{project_id}/llm4ad/algorithms/{algorithm_id}/editor/root")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("algorithm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDirectoryByAlgorithmIdRequest::getAlgorithmId,
                ListDirectoryByAlgorithmIdRequest::setAlgorithmId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDirectoryByResultCommitIdRequest, ListDirectoryByResultCommitIdResponse> listDirectoryByResultCommitId =
        genForListDirectoryByResultCommitId();

    private static HttpRequestDef<ListDirectoryByResultCommitIdRequest, ListDirectoryByResultCommitIdResponse> genForListDirectoryByResultCommitId() {
        // basic
        HttpRequestDef.Builder<ListDirectoryByResultCommitIdRequest, ListDirectoryByResultCommitIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListDirectoryByResultCommitIdRequest.class,
                    ListDirectoryByResultCommitIdResponse.class)
                .withName("ListDirectoryByResultCommitId")
                .withUri("/v1/{project_id}/llm4ad/evolve-tasks/{evolve_task_id}/result/{commit_id}/root")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("evolve_task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDirectoryByResultCommitIdRequest::getEvolveTaskId,
                ListDirectoryByResultCommitIdRequest::setEvolveTaskId));
        builder.<String>withRequestField("commit_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDirectoryByResultCommitIdRequest::getCommitId,
                ListDirectoryByResultCommitIdRequest::setCommitId));
        builder.<Integer>withRequestField("iteration",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDirectoryByResultCommitIdRequest::getIteration,
                ListDirectoryByResultCommitIdRequest::setIteration));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEvolveTaskMetasRequest, ListEvolveTaskMetasResponse> listEvolveTaskMetas =
        genForListEvolveTaskMetas();

    private static HttpRequestDef<ListEvolveTaskMetasRequest, ListEvolveTaskMetasResponse> genForListEvolveTaskMetas() {
        // basic
        HttpRequestDef.Builder<ListEvolveTaskMetasRequest, ListEvolveTaskMetasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEvolveTaskMetasRequest.class, ListEvolveTaskMetasResponse.class)
                .withName("ListEvolveTaskMetas")
                .withUri("/v1/{project_id}/llm4ad/evolve-tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEvolveTaskMetasRequest::getSortDir, ListEvolveTaskMetasRequest::setSortDir));
        builder.<String>withRequestField("algorithm_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEvolveTaskMetasRequest::getAlgorithmId,
                ListEvolveTaskMetasRequest::setAlgorithmId));
        builder.<String>withRequestField("task_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEvolveTaskMetasRequest::getTaskName, ListEvolveTaskMetasRequest::setTaskName));
        builder.<List<String>>withRequestField("status_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEvolveTaskMetasRequest::getStatusList,
                ListEvolveTaskMetasRequest::setStatusList));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEvolveTaskMetasRequest::getUserName, ListEvolveTaskMetasRequest::setUserName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEvolveTaskMetasRequest::getLimit, ListEvolveTaskMetasRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEvolveTaskMetasRequest::getOffset, ListEvolveTaskMetasRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEvolveTaskStatsRequest, ListEvolveTaskStatsResponse> listEvolveTaskStats =
        genForListEvolveTaskStats();

    private static HttpRequestDef<ListEvolveTaskStatsRequest, ListEvolveTaskStatsResponse> genForListEvolveTaskStats() {
        // basic
        HttpRequestDef.Builder<ListEvolveTaskStatsRequest, ListEvolveTaskStatsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEvolveTaskStatsRequest.class, ListEvolveTaskStatsResponse.class)
                .withName("ListEvolveTaskStats")
                .withUri("/v1/{project_id}/llm4ad/evolve-tasks/stats")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("algorithm_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEvolveTaskStatsRequest::getAlgorithmId,
                ListEvolveTaskStatsRequest::setAlgorithmId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SaveAlgorithmFileRequest, SaveAlgorithmFileResponse> saveAlgorithmFile =
        genForSaveAlgorithmFile();

    private static HttpRequestDef<SaveAlgorithmFileRequest, SaveAlgorithmFileResponse> genForSaveAlgorithmFile() {
        // basic
        HttpRequestDef.Builder<SaveAlgorithmFileRequest, SaveAlgorithmFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SaveAlgorithmFileRequest.class, SaveAlgorithmFileResponse.class)
                .withName("SaveAlgorithmFile")
                .withUri("/v1/{project_id}/llm4ad/algorithms/{algorithm_id}/editor/files")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("algorithm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveAlgorithmFileRequest::getAlgorithmId, SaveAlgorithmFileRequest::setAlgorithmId));
        builder.<SaveAlgorithmFileRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SaveAlgorithmFileRequestBody.class),
            f -> f.withMarshaller(SaveAlgorithmFileRequest::getBody, SaveAlgorithmFileRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAlgorithmRequest, ShowAlgorithmResponse> showAlgorithm =
        genForShowAlgorithm();

    private static HttpRequestDef<ShowAlgorithmRequest, ShowAlgorithmResponse> genForShowAlgorithm() {
        // basic
        HttpRequestDef.Builder<ShowAlgorithmRequest, ShowAlgorithmResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAlgorithmRequest.class, ShowAlgorithmResponse.class)
                .withName("ShowAlgorithm")
                .withUri("/v1/{project_id}/llm4ad/algorithms/{algorithm_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("algorithm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAlgorithmRequest::getAlgorithmId, ShowAlgorithmRequest::setAlgorithmId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAlgorithmFileRequest, ShowAlgorithmFileResponse> showAlgorithmFile =
        genForShowAlgorithmFile();

    private static HttpRequestDef<ShowAlgorithmFileRequest, ShowAlgorithmFileResponse> genForShowAlgorithmFile() {
        // basic
        HttpRequestDef.Builder<ShowAlgorithmFileRequest, ShowAlgorithmFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAlgorithmFileRequest.class, ShowAlgorithmFileResponse.class)
                .withName("ShowAlgorithmFile")
                .withUri("/v1/{project_id}/llm4ad/algorithms/{algorithm_id}/editor/files")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("algorithm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAlgorithmFileRequest::getAlgorithmId, ShowAlgorithmFileRequest::setAlgorithmId));
        builder.<String>withRequestField("file_path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAlgorithmFileRequest::getFilePath, ShowAlgorithmFileRequest::setFilePath));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskDetailsRequest, ShowTaskDetailsResponse> showTaskDetails =
        genForShowTaskDetails();

    private static HttpRequestDef<ShowTaskDetailsRequest, ShowTaskDetailsResponse> genForShowTaskDetails() {
        // basic
        HttpRequestDef.Builder<ShowTaskDetailsRequest, ShowTaskDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTaskDetailsRequest.class, ShowTaskDetailsResponse.class)
                .withName("ShowTaskDetails")
                .withUri("/v1/{project_id}/llm4ad/evolve-tasks/{evolve_task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("evolve_task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskDetailsRequest::getEvolveTaskId, ShowTaskDetailsRequest::setEvolveTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskResultCommitRequest, ShowTaskResultCommitResponse> showTaskResultCommit =
        genForShowTaskResultCommit();

    private static HttpRequestDef<ShowTaskResultCommitRequest, ShowTaskResultCommitResponse> genForShowTaskResultCommit() {
        // basic
        HttpRequestDef.Builder<ShowTaskResultCommitRequest, ShowTaskResultCommitResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowTaskResultCommitRequest.class, ShowTaskResultCommitResponse.class)
            .withName("ShowTaskResultCommit")
            .withUri("/v1/{project_id}/llm4ad/evolve-tasks/{evolve_task_id}/result/{commit_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("evolve_task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskResultCommitRequest::getEvolveTaskId,
                ShowTaskResultCommitRequest::setEvolveTaskId));
        builder.<String>withRequestField("commit_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskResultCommitRequest::getCommitId, ShowTaskResultCommitRequest::setCommitId));
        builder.<Integer>withRequestField("iteration",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTaskResultCommitRequest::getIteration,
                ShowTaskResultCommitRequest::setIteration));
        builder.<ShowTaskResultCommitRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowTaskResultCommitRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowTaskResultCommitRequest::getType, ShowTaskResultCommitRequest::setType));
        builder.<String>withRequestField("file_path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskResultCommitRequest::getFilePath, ShowTaskResultCommitRequest::setFilePath));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskResultListRequest, ShowTaskResultListResponse> showTaskResultList =
        genForShowTaskResultList();

    private static HttpRequestDef<ShowTaskResultListRequest, ShowTaskResultListResponse> genForShowTaskResultList() {
        // basic
        HttpRequestDef.Builder<ShowTaskResultListRequest, ShowTaskResultListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTaskResultListRequest.class, ShowTaskResultListResponse.class)
                .withName("ShowTaskResultList")
                .withUri("/v1/{project_id}/llm4ad/evolve-tasks/{evolve_task_id}/result")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("evolve_task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskResultListRequest::getEvolveTaskId,
                ShowTaskResultListRequest::setEvolveTaskId));
        builder.<Integer>withRequestField("iteration",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTaskResultListRequest::getIteration, ShowTaskResultListRequest::setIteration));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskRunningDetailsRequest, ShowTaskRunningDetailsResponse> showTaskRunningDetails =
        genForShowTaskRunningDetails();

    private static HttpRequestDef<ShowTaskRunningDetailsRequest, ShowTaskRunningDetailsResponse> genForShowTaskRunningDetails() {
        // basic
        HttpRequestDef.Builder<ShowTaskRunningDetailsRequest, ShowTaskRunningDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowTaskRunningDetailsRequest.class, ShowTaskRunningDetailsResponse.class)
            .withName("ShowTaskRunningDetails")
            .withUri("/v1/{project_id}/llm4ad/evolve-tasks/{evolve_task_id}/stats")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("evolve_task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskRunningDetailsRequest::getEvolveTaskId,
                ShowTaskRunningDetailsRequest::setEvolveTaskId));
        builder.<ShowTaskRunningDetailsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowTaskRunningDetailsRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowTaskRunningDetailsRequest::getType, ShowTaskRunningDetailsRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskRunningLogRequest, ShowTaskRunningLogResponse> showTaskRunningLog =
        genForShowTaskRunningLog();

    private static HttpRequestDef<ShowTaskRunningLogRequest, ShowTaskRunningLogResponse> genForShowTaskRunningLog() {
        // basic
        HttpRequestDef.Builder<ShowTaskRunningLogRequest, ShowTaskRunningLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTaskRunningLogRequest.class, ShowTaskRunningLogResponse.class)
                .withName("ShowTaskRunningLog")
                .withUri("/v1/{project_id}/llm4ad/evolve-tasks/{evolve_task_id}/log")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("evolve_task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskRunningLogRequest::getEvolveTaskId,
                ShowTaskRunningLogRequest::setEvolveTaskId));
        builder.<Long>withRequestField("start_byte",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowTaskRunningLogRequest::getStartByte, ShowTaskRunningLogRequest::setStartByte));
        builder.<Long>withRequestField("end_byte",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowTaskRunningLogRequest::getEndByte, ShowTaskRunningLogRequest::setEndByte));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartEvolveTaskRequest, StartEvolveTaskResponse> startEvolveTask =
        genForStartEvolveTask();

    private static HttpRequestDef<StartEvolveTaskRequest, StartEvolveTaskResponse> genForStartEvolveTask() {
        // basic
        HttpRequestDef.Builder<StartEvolveTaskRequest, StartEvolveTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartEvolveTaskRequest.class, StartEvolveTaskResponse.class)
                .withName("StartEvolveTask")
                .withUri("/v1/{project_id}/llm4ad/evolve-tasks/{evolve_task_id}/start")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("evolve_task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartEvolveTaskRequest::getEvolveTaskId, StartEvolveTaskRequest::setEvolveTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopEvolveTaskRequest, StopEvolveTaskResponse> stopEvolveTask =
        genForStopEvolveTask();

    private static HttpRequestDef<StopEvolveTaskRequest, StopEvolveTaskResponse> genForStopEvolveTask() {
        // basic
        HttpRequestDef.Builder<StopEvolveTaskRequest, StopEvolveTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopEvolveTaskRequest.class, StopEvolveTaskResponse.class)
                .withName("StopEvolveTask")
                .withUri("/v1/{project_id}/llm4ad/evolve-tasks/{evolve_task_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("evolve_task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopEvolveTaskRequest::getEvolveTaskId, StopEvolveTaskRequest::setEvolveTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAlgorithmRequest, UpdateAlgorithmResponse> updateAlgorithm =
        genForUpdateAlgorithm();

    private static HttpRequestDef<UpdateAlgorithmRequest, UpdateAlgorithmResponse> genForUpdateAlgorithm() {
        // basic
        HttpRequestDef.Builder<UpdateAlgorithmRequest, UpdateAlgorithmResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateAlgorithmRequest.class, UpdateAlgorithmResponse.class)
                .withName("UpdateAlgorithm")
                .withUri("/v1/{project_id}/llm4ad/algorithms/{algorithm_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("algorithm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAlgorithmRequest::getAlgorithmId, UpdateAlgorithmRequest::setAlgorithmId));
        builder.<UpdateAlgorithmDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAlgorithmDto.class),
            f -> f.withMarshaller(UpdateAlgorithmRequest::getBody, UpdateAlgorithmRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEvolveTaskRequest, UpdateEvolveTaskResponse> updateEvolveTask =
        genForUpdateEvolveTask();

    private static HttpRequestDef<UpdateEvolveTaskRequest, UpdateEvolveTaskResponse> genForUpdateEvolveTask() {
        // basic
        HttpRequestDef.Builder<UpdateEvolveTaskRequest, UpdateEvolveTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateEvolveTaskRequest.class, UpdateEvolveTaskResponse.class)
                .withName("UpdateEvolveTask")
                .withUri("/v1/{project_id}/llm4ad/evolve-tasks/{evolve_task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("evolve_task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEvolveTaskRequest::getEvolveTaskId, UpdateEvolveTaskRequest::setEvolveTaskId));
        builder.<EvolveTaskCreateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EvolveTaskCreateReq.class),
            f -> f.withMarshaller(UpdateEvolveTaskRequest::getBody, UpdateEvolveTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteModelAssetRequest, DeleteModelAssetResponse> deleteModelAsset =
        genForDeleteModelAsset();

    private static HttpRequestDef<DeleteModelAssetRequest, DeleteModelAssetResponse> genForDeleteModelAsset() {
        // basic
        HttpRequestDef.Builder<DeleteModelAssetRequest, DeleteModelAssetResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteModelAssetRequest.class, DeleteModelAssetResponse.class)
                .withName("DeleteModelAsset")
                .withUri("/v1/{project_id}/asset-manager/model-assets/{asset_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteModelAssetRequest::getAssetId, DeleteModelAssetRequest::setAssetId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListModelAssetsRequest, ListModelAssetsResponse> listModelAssets =
        genForListModelAssets();

    private static HttpRequestDef<ListModelAssetsRequest, ListModelAssetsResponse> genForListModelAssets() {
        // basic
        HttpRequestDef.Builder<ListModelAssetsRequest, ListModelAssetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListModelAssetsRequest.class, ListModelAssetsResponse.class)
                .withName("ListModelAssets")
                .withUri("/v1/{project_id}/asset-manager/model-assets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("asset_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListModelAssetsRequest::getAssetCode, ListModelAssetsRequest::setAssetCode));
        builder.<String>withRequestField("asset_source",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListModelAssetsRequest::getAssetSource, ListModelAssetsRequest::setAssetSource));
        builder.<String>withRequestField("asset_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListModelAssetsRequest::getAssetType, ListModelAssetsRequest::setAssetType));
        builder.<String>withRequestField("sub_asset_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListModelAssetsRequest::getSubAssetType, ListModelAssetsRequest::setSubAssetType));
        builder.<String>withRequestField("chat_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListModelAssetsRequest::getChatId, ListModelAssetsRequest::setChatId));
        builder.<List<String>>withRequestField("asset_actions",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListModelAssetsRequest::getAssetActions, ListModelAssetsRequest::setAssetActions));
        builder.<String>withRequestField("asset_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListModelAssetsRequest::getAssetName, ListModelAssetsRequest::setAssetName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListModelAssetsRequest::getOffset, ListModelAssetsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListModelAssetsRequest::getLimit, ListModelAssetsRequest::setLimit));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListModelAssetsRequest::getSortDir, ListModelAssetsRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowModelAssetDetailRequest, ShowModelAssetDetailResponse> showModelAssetDetail =
        genForShowModelAssetDetail();

    private static HttpRequestDef<ShowModelAssetDetailRequest, ShowModelAssetDetailResponse> genForShowModelAssetDetail() {
        // basic
        HttpRequestDef.Builder<ShowModelAssetDetailRequest, ShowModelAssetDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowModelAssetDetailRequest.class, ShowModelAssetDetailResponse.class)
            .withName("ShowModelAssetDetail")
            .withUri("/v1/{project_id}/asset-manager/model-assets/{asset_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowModelAssetDetailRequest::getAssetId, ShowModelAssetDetailRequest::setAssetId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateModelAssetRequest, UpdateModelAssetResponse> updateModelAsset =
        genForUpdateModelAsset();

    private static HttpRequestDef<UpdateModelAssetRequest, UpdateModelAssetResponse> genForUpdateModelAsset() {
        // basic
        HttpRequestDef.Builder<UpdateModelAssetRequest, UpdateModelAssetResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateModelAssetRequest.class, UpdateModelAssetResponse.class)
                .withName("UpdateModelAsset")
                .withUri("/v1/{project_id}/asset-manager/model-assets/{asset_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateModelAssetRequest::getAssetId, UpdateModelAssetRequest::setAssetId));
        builder.<UpdateModelAssetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateModelAssetReq.class),
            f -> f.withMarshaller(UpdateModelAssetRequest::getBody, UpdateModelAssetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelChatRequest, CancelChatResponse> cancelChat = genForCancelChat();

    private static HttpRequestDef<CancelChatRequest, CancelChatResponse> genForCancelChat() {
        // basic
        HttpRequestDef.Builder<CancelChatRequest, CancelChatResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CancelChatRequest.class, CancelChatResponse.class)
                .withName("CancelChat")
                .withUri("/v1/{project_id}/chats/{chat_id}/cancel")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("chat_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelChatRequest::getChatId, CancelChatRequest::setChatId));
        builder.<String>withRequestField("X-Chat-Route-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelChatRequest::getXChatRouteId, CancelChatRequest::setXChatRouteId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateArtifactsRequest, CreateArtifactsResponse> createArtifacts =
        genForCreateArtifacts();

    private static HttpRequestDef<CreateArtifactsRequest, CreateArtifactsResponse> genForCreateArtifacts() {
        // basic
        HttpRequestDef.Builder<CreateArtifactsRequest, CreateArtifactsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateArtifactsRequest.class, CreateArtifactsResponse.class)
                .withName("CreateArtifacts")
                .withUri("/v1/{project_id}/chats/{chat_id}/artifacts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("chat_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateArtifactsRequest::getChatId, CreateArtifactsRequest::setChatId));
        builder.<CreateArtifactsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateArtifactsReq.class),
            f -> f.withMarshaller(CreateArtifactsRequest::getBody, CreateArtifactsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteChatRequest, DeleteChatResponse> deleteChat = genForDeleteChat();

    private static HttpRequestDef<DeleteChatRequest, DeleteChatResponse> genForDeleteChat() {
        // basic
        HttpRequestDef.Builder<DeleteChatRequest, DeleteChatResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteChatRequest.class, DeleteChatResponse.class)
                .withName("DeleteChat")
                .withUri("/v1/{project_id}/chats/{chat_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("chat_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteChatRequest::getChatId, DeleteChatRequest::setChatId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadFileRequest, DownloadFileResponse> downloadFile = genForDownloadFile();

    private static HttpRequestDef<DownloadFileRequest, DownloadFileResponse> genForDownloadFile() {
        // basic
        HttpRequestDef.Builder<DownloadFileRequest, DownloadFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadFileRequest.class, DownloadFileResponse.class)
                .withName("DownloadFile")
                .withUri("/v1/{project_id}/chats/{chat_id}/file/{filename}/download")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("chat_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadFileRequest::getChatId, DownloadFileRequest::setChatId));
        builder.<String>withRequestField("filename",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadFileRequest::getFilename, DownloadFileRequest::setFilename));
        builder.<Boolean>withRequestField("X-Need-Content",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DownloadFileRequest::getXNeedContent, DownloadFileRequest::setXNeedContent));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListArtifactsRequest, ListArtifactsResponse> listArtifacts =
        genForListArtifacts();

    private static HttpRequestDef<ListArtifactsRequest, ListArtifactsResponse> genForListArtifacts() {
        // basic
        HttpRequestDef.Builder<ListArtifactsRequest, ListArtifactsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListArtifactsRequest.class, ListArtifactsResponse.class)
                .withName("ListArtifacts")
                .withUri("/v1/{project_id}/chats/{chat_id}/artifacts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("chat_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListArtifactsRequest::getChatId, ListArtifactsRequest::setChatId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListChatRequest, ListChatResponse> listChat = genForListChat();

    private static HttpRequestDef<ListChatRequest, ListChatResponse> genForListChat() {
        // basic
        HttpRequestDef.Builder<ListChatRequest, ListChatResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListChatRequest.class, ListChatResponse.class)
                .withName("ListChat")
                .withUri("/v1/{project_id}/chats")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListChatRequest::getLimit, ListChatRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListChatRequest::getOffset, ListChatRequest::setOffset));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListChatRequest::getSortDir, ListChatRequest::setSortDir));
        builder.<String>withRequestField("title",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListChatRequest::getTitle, ListChatRequest::setTitle));
        builder.<String>withRequestField("agent_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListChatRequest::getAgentType, ListChatRequest::setAgentType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PublishChatRequest, PublishChatResponse> publishChat = genForPublishChat();

    private static HttpRequestDef<PublishChatRequest, PublishChatResponse> genForPublishChat() {
        // basic
        HttpRequestDef.Builder<PublishChatRequest, PublishChatResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PublishChatRequest.class, PublishChatResponse.class)
                .withName("PublishChat")
                .withUri("/v1/{project_id}/chats/{chat_id}/publish")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("chat_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PublishChatRequest::getChatId, PublishChatRequest::setChatId));
        builder.<PublishChatReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PublishChatReq.class),
            f -> f.withMarshaller(PublishChatRequest::getBody, PublishChatRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowChatRequest, ShowChatResponse> showChat = genForShowChat();

    private static HttpRequestDef<ShowChatRequest, ShowChatResponse> genForShowChat() {
        // basic
        HttpRequestDef.Builder<ShowChatRequest, ShowChatResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowChatRequest.class, ShowChatResponse.class)
                .withName("ShowChat")
                .withUri("/v1/{project_id}/chats/{chat_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("chat_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowChatRequest::getChatId, ShowChatRequest::setChatId));

        // response

        builder.<String>withResponseField("X-Chat-Route-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowChatResponse::getXChatRouteId, ShowChatResponse::setXChatRouteId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateChatRequest, UpdateChatResponse> updateChat = genForUpdateChat();

    private static HttpRequestDef<UpdateChatRequest, UpdateChatResponse> genForUpdateChat() {
        // basic
        HttpRequestDef.Builder<UpdateChatRequest, UpdateChatResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateChatRequest.class, UpdateChatResponse.class)
                .withName("UpdateChat")
                .withUri("/v1/{project_id}/chats/{chat_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("chat_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateChatRequest::getChatId, UpdateChatRequest::setChatId));
        builder.<UpdateChatReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateChatReq.class),
            f -> f.withMarshaller(UpdateChatRequest::getBody, UpdateChatRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadFileRequest, UploadFileResponse> uploadFile = genForUploadFile();

    private static HttpRequestDef<UploadFileRequest, UploadFileResponse> genForUploadFile() {
        // basic
        HttpRequestDef.Builder<UploadFileRequest, UploadFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadFileRequest.class, UploadFileResponse.class)
                .withName("UploadFile")
                .withUri("/v1/{project_id}/chats/file/upload")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("X-Chat-Route-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadFileRequest::getXChatRouteId, UploadFileRequest::setXChatRouteId));
        builder.<UploadFileRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadFileRequestBody.class),
            f -> f.withMarshaller(UploadFileRequest::getBody, UploadFileRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateModelServiceRequest, CreateModelServiceResponse> createModelService =
        genForCreateModelService();

    private static HttpRequestDef<CreateModelServiceRequest, CreateModelServiceResponse> genForCreateModelService() {
        // basic
        HttpRequestDef.Builder<CreateModelServiceRequest, CreateModelServiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateModelServiceRequest.class, CreateModelServiceResponse.class)
                .withName("CreateModelService")
                .withUri("/v1/{project_id}/model-service/services")
                .withContentType("application/json");

        // requests
        builder.<CreateModelServiceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateModelServiceReq.class),
            f -> f.withMarshaller(CreateModelServiceRequest::getBody, CreateModelServiceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateModelServiceTaskRequest, CreateModelServiceTaskResponse> createModelServiceTask =
        genForCreateModelServiceTask();

    private static HttpRequestDef<CreateModelServiceTaskRequest, CreateModelServiceTaskResponse> genForCreateModelServiceTask() {
        // basic
        HttpRequestDef.Builder<CreateModelServiceTaskRequest, CreateModelServiceTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateModelServiceTaskRequest.class, CreateModelServiceTaskResponse.class)
            .withName("CreateModelServiceTask")
            .withUri("/v1/{project_id}/model-service/services/{service_id}/tasks")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateModelServiceTaskRequest::getServiceId,
                CreateModelServiceTaskRequest::setServiceId));
        builder.<CreateModelServiceTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateModelServiceTaskReq.class),
            f -> f.withMarshaller(CreateModelServiceTaskRequest::getBody, CreateModelServiceTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteModelServiceRequest, DeleteModelServiceResponse> deleteModelService =
        genForDeleteModelService();

    private static HttpRequestDef<DeleteModelServiceRequest, DeleteModelServiceResponse> genForDeleteModelService() {
        // basic
        HttpRequestDef.Builder<DeleteModelServiceRequest, DeleteModelServiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteModelServiceRequest.class, DeleteModelServiceResponse.class)
                .withName("DeleteModelService")
                .withUri("/v1/{project_id}/model-service/services/{service_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteModelServiceRequest::getServiceId, DeleteModelServiceRequest::setServiceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListModelServiceTasksRequest, ListModelServiceTasksResponse> listModelServiceTasks =
        genForListModelServiceTasks();

    private static HttpRequestDef<ListModelServiceTasksRequest, ListModelServiceTasksResponse> genForListModelServiceTasks() {
        // basic
        HttpRequestDef.Builder<ListModelServiceTasksRequest, ListModelServiceTasksResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListModelServiceTasksRequest.class, ListModelServiceTasksResponse.class)
            .withName("ListModelServiceTasks")
            .withUri("/v1/{project_id}/model-service/services/{service_id}/tasks")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListModelServiceTasksRequest::getServiceId,
                ListModelServiceTasksRequest::setServiceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowModelServiceDetailRequest, ShowModelServiceDetailResponse> showModelServiceDetail =
        genForShowModelServiceDetail();

    private static HttpRequestDef<ShowModelServiceDetailRequest, ShowModelServiceDetailResponse> genForShowModelServiceDetail() {
        // basic
        HttpRequestDef.Builder<ShowModelServiceDetailRequest, ShowModelServiceDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowModelServiceDetailRequest.class, ShowModelServiceDetailResponse.class)
            .withName("ShowModelServiceDetail")
            .withUri("/v1/{project_id}/model-service/services/{service_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowModelServiceDetailRequest::getServiceId,
                ShowModelServiceDetailRequest::setServiceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowModelServiceListRequest, ShowModelServiceListResponse> showModelServiceList =
        genForShowModelServiceList();

    private static HttpRequestDef<ShowModelServiceListRequest, ShowModelServiceListResponse> genForShowModelServiceList() {
        // basic
        HttpRequestDef.Builder<ShowModelServiceListRequest, ShowModelServiceListResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowModelServiceListRequest.class, ShowModelServiceListResponse.class)
            .withName("ShowModelServiceList")
            .withUri("/v1/{project_id}/model-service/services")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("infer_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowModelServiceListRequest::getInferType,
                ShowModelServiceListRequest::setInferType));
        builder.<String>withRequestField("asset_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowModelServiceListRequest::getAssetId, ShowModelServiceListRequest::setAssetId));
        builder.<String>withRequestField("asset_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowModelServiceListRequest::getAssetType,
                ShowModelServiceListRequest::setAssetType));
        builder.<String>withRequestField("asset_sub_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowModelServiceListRequest::getAssetSubType,
                ShowModelServiceListRequest::setAssetSubType));
        builder.<String>withRequestField("chip_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowModelServiceListRequest::getChipType, ShowModelServiceListRequest::setChipType));
        builder.<String>withRequestField("platform",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowModelServiceListRequest::getPlatform, ShowModelServiceListRequest::setPlatform));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowModelServiceListRequest::getStatus, ShowModelServiceListRequest::setStatus));
        builder.<String>withRequestField("use_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowModelServiceListRequest::getUseType, ShowModelServiceListRequest::setUseType));
        builder.<String>withRequestField("model_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowModelServiceListRequest::getModelName,
                ShowModelServiceListRequest::setModelName));
        builder.<String>withRequestField("service_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowModelServiceListRequest::getServiceName,
                ShowModelServiceListRequest::setServiceName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowModelServiceListRequest::getOffset, ShowModelServiceListRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowModelServiceListRequest::getLimit, ShowModelServiceListRequest::setLimit));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowModelServiceListRequest::getSortDir, ShowModelServiceListRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowModelServiceTaskRequest, ShowModelServiceTaskResponse> showModelServiceTask =
        genForShowModelServiceTask();

    private static HttpRequestDef<ShowModelServiceTaskRequest, ShowModelServiceTaskResponse> genForShowModelServiceTask() {
        // basic
        HttpRequestDef.Builder<ShowModelServiceTaskRequest, ShowModelServiceTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowModelServiceTaskRequest.class, ShowModelServiceTaskResponse.class)
            .withName("ShowModelServiceTask")
            .withUri("/v1/{project_id}/model-service/services/{service_id}/tasks/{task_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowModelServiceTaskRequest::getServiceId,
                ShowModelServiceTaskRequest::setServiceId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowModelServiceTaskRequest::getTaskId, ShowModelServiceTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartModelServiceRequest, StartModelServiceResponse> startModelService =
        genForStartModelService();

    private static HttpRequestDef<StartModelServiceRequest, StartModelServiceResponse> genForStartModelService() {
        // basic
        HttpRequestDef.Builder<StartModelServiceRequest, StartModelServiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartModelServiceRequest.class, StartModelServiceResponse.class)
                .withName("StartModelService")
                .withUri("/v1/{project_id}/model-service/services/{service_id}/start")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartModelServiceRequest::getServiceId, StartModelServiceRequest::setServiceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopModelServiceRequest, StopModelServiceResponse> stopModelService =
        genForStopModelService();

    private static HttpRequestDef<StopModelServiceRequest, StopModelServiceResponse> genForStopModelService() {
        // basic
        HttpRequestDef.Builder<StopModelServiceRequest, StopModelServiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopModelServiceRequest.class, StopModelServiceResponse.class)
                .withName("StopModelService")
                .withUri("/v1/{project_id}/model-service/services/{service_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopModelServiceRequest::getServiceId, StopModelServiceRequest::setServiceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateModelServiceRequest, UpdateModelServiceResponse> updateModelService =
        genForUpdateModelService();

    private static HttpRequestDef<UpdateModelServiceRequest, UpdateModelServiceResponse> genForUpdateModelService() {
        // basic
        HttpRequestDef.Builder<UpdateModelServiceRequest, UpdateModelServiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateModelServiceRequest.class, UpdateModelServiceResponse.class)
                .withName("UpdateModelService")
                .withUri("/v1/{project_id}/model-service/services/{service_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateModelServiceRequest::getServiceId, UpdateModelServiceRequest::setServiceId));
        builder.<UpdateModelServiceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateModelServiceReq.class),
            f -> f.withMarshaller(UpdateModelServiceRequest::getBody, UpdateModelServiceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadModelServiceTaskFileRequest, UploadModelServiceTaskFileResponse> uploadModelServiceTaskFile =
        genForUploadModelServiceTaskFile();

    private static HttpRequestDef<UploadModelServiceTaskFileRequest, UploadModelServiceTaskFileResponse> genForUploadModelServiceTaskFile() {
        // basic
        HttpRequestDef.Builder<UploadModelServiceTaskFileRequest, UploadModelServiceTaskFileResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UploadModelServiceTaskFileRequest.class,
                    UploadModelServiceTaskFileResponse.class)
                .withName("UploadModelServiceTaskFile")
                .withUri("/v1/{project_id}/model-service/services/{service_id}/files/upload")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadModelServiceTaskFileRequest::getServiceId,
                UploadModelServiceTaskFileRequest::setServiceId));
        builder.<UploadModelServiceTaskFileRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadModelServiceTaskFileRequestBody.class),
            f -> f.withMarshaller(UploadModelServiceTaskFileRequest::getBody,
                UploadModelServiceTaskFileRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PublishModelRequest, PublishModelResponse> publishModel = genForPublishModel();

    private static HttpRequestDef<PublishModelRequest, PublishModelResponse> genForPublishModel() {
        // basic
        HttpRequestDef.Builder<PublishModelRequest, PublishModelResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PublishModelRequest.class, PublishModelResponse.class)
                .withName("PublishModel")
                .withUri("/v1/{project_id}/model-train/model/publish")
                .withContentType("application/json");

        // requests
        builder.<PublishModelReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PublishModelReq.class),
            f -> f.withMarshaller(PublishModelRequest::getBody, PublishModelRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AuthorizePermissionRequest, AuthorizePermissionResponse> authorizePermission =
        genForAuthorizePermission();

    private static HttpRequestDef<AuthorizePermissionRequest, AuthorizePermissionResponse> genForAuthorizePermission() {
        // basic
        HttpRequestDef.Builder<AuthorizePermissionRequest, AuthorizePermissionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, AuthorizePermissionRequest.class, AuthorizePermissionResponse.class)
                .withName("AuthorizePermission")
                .withUri("/v1/{project_id}/llm4ad/obs/permission/{bucket}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bucket",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AuthorizePermissionRequest::getBucket, AuthorizePermissionRequest::setBucket));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBucketsRequest, ListBucketsResponse> listBuckets = genForListBuckets();

    private static HttpRequestDef<ListBucketsRequest, ListBucketsResponse> genForListBuckets() {
        // basic
        HttpRequestDef.Builder<ListBucketsRequest, ListBucketsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBucketsRequest.class, ListBucketsResponse.class)
                .withName("ListBuckets")
                .withUri("/v1/{project_id}/llm4ad/obs/buckets")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListObjectRequest, ListObjectResponse> listObject = genForListObject();

    private static HttpRequestDef<ListObjectRequest, ListObjectResponse> genForListObject() {
        // basic
        HttpRequestDef.Builder<ListObjectRequest, ListObjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListObjectRequest.class, ListObjectResponse.class)
                .withName("ListObject")
                .withUri("/v1/{project_id}/llm4ad/obs/objects")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bucket",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListObjectRequest::getBucket, ListObjectRequest::setBucket));
        builder.<String>withRequestField("key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListObjectRequest::getKey, ListObjectRequest::setKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPermissionRequest, ListPermissionResponse> listPermission =
        genForListPermission();

    private static HttpRequestDef<ListPermissionRequest, ListPermissionResponse> genForListPermission() {
        // basic
        HttpRequestDef.Builder<ListPermissionRequest, ListPermissionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPermissionRequest.class, ListPermissionResponse.class)
                .withName("ListPermission")
                .withUri("/v1/{project_id}/llm4ad/obs/permission/{bucket}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bucket",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionRequest::getBucket, ListPermissionRequest::setBucket));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RevokePermissionRequest, RevokePermissionResponse> revokePermission =
        genForRevokePermission();

    private static HttpRequestDef<RevokePermissionRequest, RevokePermissionResponse> genForRevokePermission() {
        // basic
        HttpRequestDef.Builder<RevokePermissionRequest, RevokePermissionResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, RevokePermissionRequest.class, RevokePermissionResponse.class)
                .withName("RevokePermission")
                .withUri("/v1/{project_id}/llm4ad/obs/permission/{bucket}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bucket",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RevokePermissionRequest::getBucket, RevokePermissionRequest::setBucket));

        // response

        return builder.build();
    }

}

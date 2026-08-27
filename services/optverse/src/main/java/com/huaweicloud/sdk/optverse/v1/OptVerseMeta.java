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
import com.huaweicloud.sdk.optverse.v1.model.CreateAlgorithmRequest;
import com.huaweicloud.sdk.optverse.v1.model.CreateAlgorithmResponse;
import com.huaweicloud.sdk.optverse.v1.model.CreateEvolveTaskRequest;
import com.huaweicloud.sdk.optverse.v1.model.CreateEvolveTaskResponse;
import com.huaweicloud.sdk.optverse.v1.model.DeleteAlgorithmFileRequest;
import com.huaweicloud.sdk.optverse.v1.model.DeleteAlgorithmFileResponse;
import com.huaweicloud.sdk.optverse.v1.model.DeleteAlgorithmRequest;
import com.huaweicloud.sdk.optverse.v1.model.DeleteAlgorithmResponse;
import com.huaweicloud.sdk.optverse.v1.model.DeleteEvolveTaskRequest;
import com.huaweicloud.sdk.optverse.v1.model.DeleteEvolveTaskResponse;
import com.huaweicloud.sdk.optverse.v1.model.EvolveTaskBatchDeleteReq;
import com.huaweicloud.sdk.optverse.v1.model.EvolveTaskCreateReq;
import com.huaweicloud.sdk.optverse.v1.model.ImportAlgorithmFileRequest;
import com.huaweicloud.sdk.optverse.v1.model.ImportAlgorithmFileRequestBody;
import com.huaweicloud.sdk.optverse.v1.model.ImportAlgorithmFileResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListAlgorithmsRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListAlgorithmsResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListBucketsRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListBucketsResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListDirectoryByAlgorithmIdRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListDirectoryByAlgorithmIdResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListDirectoryByResultCommitIdRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListDirectoryByResultCommitIdResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListEvolveTaskMetasRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListEvolveTaskMetasResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListEvolveTaskStatsRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListEvolveTaskStatsResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListObjectRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListObjectResponse;
import com.huaweicloud.sdk.optverse.v1.model.ListPermissionRequest;
import com.huaweicloud.sdk.optverse.v1.model.ListPermissionResponse;
import com.huaweicloud.sdk.optverse.v1.model.RevokePermissionRequest;
import com.huaweicloud.sdk.optverse.v1.model.RevokePermissionResponse;
import com.huaweicloud.sdk.optverse.v1.model.SaveAlgorithmFileRequest;
import com.huaweicloud.sdk.optverse.v1.model.SaveAlgorithmFileRequestBody;
import com.huaweicloud.sdk.optverse.v1.model.SaveAlgorithmFileResponse;
import com.huaweicloud.sdk.optverse.v1.model.ShowAlgorithmFileRequest;
import com.huaweicloud.sdk.optverse.v1.model.ShowAlgorithmFileResponse;
import com.huaweicloud.sdk.optverse.v1.model.ShowAlgorithmRequest;
import com.huaweicloud.sdk.optverse.v1.model.ShowAlgorithmResponse;
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
import com.huaweicloud.sdk.optverse.v1.model.StopEvolveTaskRequest;
import com.huaweicloud.sdk.optverse.v1.model.StopEvolveTaskResponse;
import com.huaweicloud.sdk.optverse.v1.model.UpdateAlgorithmDto;
import com.huaweicloud.sdk.optverse.v1.model.UpdateAlgorithmRequest;
import com.huaweicloud.sdk.optverse.v1.model.UpdateAlgorithmResponse;
import com.huaweicloud.sdk.optverse.v1.model.UpdateEvolveTaskRequest;
import com.huaweicloud.sdk.optverse.v1.model.UpdateEvolveTaskResponse;

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

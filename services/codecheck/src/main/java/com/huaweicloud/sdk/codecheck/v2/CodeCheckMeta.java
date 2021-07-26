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

    public static final HttpRequestDef<CollectPluginRecordRequest, CollectPluginRecordResponse> collectPluginRecord = genForcollectPluginRecord();

    private static HttpRequestDef<CollectPluginRecordRequest, CollectPluginRecordResponse> genForcollectPluginRecord() {
        // basic
        HttpRequestDef.Builder<CollectPluginRecordRequest, CollectPluginRecordResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CollectPluginRecordRequest.class, CollectPluginRecordResponse.class)
                .withName("CollectPluginRecord")
                .withUri("/v2/java/plugin-record")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            PluginRecordModel.class,
            f -> f.withMarshaller(CollectPluginRecordRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateTaskRequest, CreateTaskResponse> createTask = genForcreateTask();

    private static HttpRequestDef<CreateTaskRequest, CreateTaskResponse> genForcreateTask() {
        // basic
        HttpRequestDef.Builder<CreateTaskRequest, CreateTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTaskRequest.class, CreateTaskResponse.class)
                .withName("CreateTask")
                .withUri("/v2/{project_id}/task")
                .withContentType("application/json");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateTaskRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateTaskRequestV2.class,
            f -> f.withMarshaller(CreateTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DownloadLibCodeAnalysisReportRequest, DownloadLibCodeAnalysisReportResponse> downloadLibCodeAnalysisReport = genFordownloadLibCodeAnalysisReport();

    private static HttpRequestDef<DownloadLibCodeAnalysisReportRequest, DownloadLibCodeAnalysisReportResponse> genFordownloadLibCodeAnalysisReport() {
        // basic
        HttpRequestDef.Builder<DownloadLibCodeAnalysisReportRequest, DownloadLibCodeAnalysisReportResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DownloadLibCodeAnalysisReportRequest.class, DownloadLibCodeAnalysisReportResponse.class)
                .withName("DownloadLibCodeAnalysisReport")
                .withUri("/v2/java/lib-code-analysis-report")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            JavaLibBean.class,
            f -> f.withMarshaller(DownloadLibCodeAnalysisReportRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListJavaLibUpdateSuggestionRequest, ListJavaLibUpdateSuggestionResponse> listJavaLibUpdateSuggestion = genForlistJavaLibUpdateSuggestion();

    private static HttpRequestDef<ListJavaLibUpdateSuggestionRequest, ListJavaLibUpdateSuggestionResponse> genForlistJavaLibUpdateSuggestion() {
        // basic
        HttpRequestDef.Builder<ListJavaLibUpdateSuggestionRequest, ListJavaLibUpdateSuggestionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListJavaLibUpdateSuggestionRequest.class, ListJavaLibUpdateSuggestionResponse.class)
                .withName("ListJavaLibUpdateSuggestion")
                .withUri("/v2/java/lib-update-suggestion")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ListJavaLibUpdateSuggestionRequestBody.class,
            f -> f.withMarshaller(ListJavaLibUpdateSuggestionRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListJavaLibUpdateSuggestionResponse::getBody, (response, data)->{
                response.setBody(data);
            }).withInnerContainerType(JavaReplaceLibInfo.class)
        );


        return builder.build();
    }

    public static final HttpRequestDef<RunTaskRequest, RunTaskResponse> runTask = genForrunTask();

    private static HttpRequestDef<RunTaskRequest, RunTaskResponse> genForrunTask() {
        // basic
        HttpRequestDef.Builder<RunTaskRequest, RunTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunTaskRequest.class, RunTaskResponse.class)
                .withName("RunTask")
                .withUri("/v2/tasks/{task_id}/run")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(RunTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            RunRequestV2.class,
            f -> f.withMarshaller(RunTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowProgressDetailRequest, ShowProgressDetailResponse> showProgressDetail = genForshowProgressDetail();

    private static HttpRequestDef<ShowProgressDetailRequest, ShowProgressDetailResponse> genForshowProgressDetail() {
        // basic
        HttpRequestDef.Builder<ShowProgressDetailRequest, ShowProgressDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProgressDetailRequest.class, ShowProgressDetailResponse.class)
                .withName("ShowProgressDetail")
                .withUri("/v2/tasks/{task_id}/progress")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowProgressDetailRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskDefectsRequest, ShowTaskDefectsResponse> showTaskDefects = genForshowTaskDefects();

    private static HttpRequestDef<ShowTaskDefectsRequest, ShowTaskDefectsResponse> genForshowTaskDefects() {
        // basic
        HttpRequestDef.Builder<ShowTaskDefectsRequest, ShowTaskDefectsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTaskDefectsRequest.class, ShowTaskDefectsResponse.class)
                .withName("ShowTaskDefects")
                .withUri("/v2/tasks/{task_id}/defects-detail")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowTaskDefectsRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowTaskDefectsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowTaskDefectsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskDefectsStatisticRequest, ShowTaskDefectsStatisticResponse> showTaskDefectsStatistic = genForshowTaskDefectsStatistic();

    private static HttpRequestDef<ShowTaskDefectsStatisticRequest, ShowTaskDefectsStatisticResponse> genForshowTaskDefectsStatistic() {
        // basic
        HttpRequestDef.Builder<ShowTaskDefectsStatisticRequest, ShowTaskDefectsStatisticResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTaskDefectsStatisticRequest.class, ShowTaskDefectsStatisticResponse.class)
                .withName("ShowTaskDefectsStatistic")
                .withUri("/v2/tasks/{task_id}/defects-statistic")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowTaskDefectsStatisticRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskDetailRequest, ShowTaskDetailResponse> showTaskDetail = genForshowTaskDetail();

    private static HttpRequestDef<ShowTaskDetailRequest, ShowTaskDetailResponse> genForshowTaskDetail() {
        // basic
        HttpRequestDef.Builder<ShowTaskDetailRequest, ShowTaskDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTaskDetailRequest.class, ShowTaskDetailResponse.class)
                .withName("ShowTaskDetail")
                .withUri("/v2/tasks/{task_id}/defects-summary")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowTaskDetailRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskListByProjectIdRequest, ShowTaskListByProjectIdResponse> showTaskListByProjectId = genForshowTaskListByProjectId();

    private static HttpRequestDef<ShowTaskListByProjectIdRequest, ShowTaskListByProjectIdResponse> genForshowTaskListByProjectId() {
        // basic
        HttpRequestDef.Builder<ShowTaskListByProjectIdRequest, ShowTaskListByProjectIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTaskListByProjectIdRequest.class, ShowTaskListByProjectIdResponse.class)
                .withName("ShowTaskListByProjectId")
                .withUri("/v2/{project_id}/tasks")
                .withContentType("application/json");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowTaskListByProjectIdRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowTaskListByProjectIdRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowTaskListByProjectIdRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<StopTaskByIdRequest, StopTaskByIdResponse> stopTaskById = genForstopTaskById();

    private static HttpRequestDef<StopTaskByIdRequest, StopTaskByIdResponse> genForstopTaskById() {
        // basic
        HttpRequestDef.Builder<StopTaskByIdRequest, StopTaskByIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopTaskByIdRequest.class, StopTaskByIdResponse.class)
                .withName("StopTaskById")
                .withUri("/v2/tasks/{task_id}/stop")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(StopTaskByIdRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateDefectStatusRequest, UpdateDefectStatusResponse> updateDefectStatus = genForupdateDefectStatus();

    private static HttpRequestDef<UpdateDefectStatusRequest, UpdateDefectStatusResponse> genForupdateDefectStatus() {
        // basic
        HttpRequestDef.Builder<UpdateDefectStatusRequest, UpdateDefectStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDefectStatusRequest.class, UpdateDefectStatusResponse.class)
                .withName("UpdateDefectStatus")
                .withUri("/v2/tasks/{task_id}/defect-status")
                .withContentType("application/json");

        // requests
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateDefectStatusRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateDefectRequestBody.class,
            f -> f.withMarshaller(UpdateDefectStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

}

package com.huaweicloud.sdk.codeartsbuild.v3;

import com.huaweicloud.sdk.codeartsbuild.v3.model.CreateBuildJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CreateBuildJobRequestBody;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CreateBuildJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CreateTemplatesRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CreateTemplatesRequestBody;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CreateTemplatesResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DeleteBuildJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DeleteBuildJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DeleteTemplatesRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DeleteTemplatesResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DisableBuildJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DisableBuildJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DisableNoticeRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DisableNoticeResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadBuildLogRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadBuildLogResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadKeystoreRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadKeystoreResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadLogByRecordIdRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadLogByRecordIdResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadTaskLogRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadTaskLogResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.EnableBuildJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.EnableBuildJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListJobConfigRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListJobConfigResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListNoticeRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListNoticeResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListTemplatesRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListTemplatesResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.RunJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.RunJobRequestBody;
import com.huaweicloud.sdk.codeartsbuild.v3.model.RunJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowFlowGraphRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowFlowGraphResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowHistoryDetailsRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowHistoryDetailsResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobListByProjectIdRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobListByProjectIdResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobStatusRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobStatusResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobSuccessRatioRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobSuccessRatioResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowLastHistoryRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowLastHistoryResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowListHistoryRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowListHistoryResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowListPeriodHistoryRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowListPeriodHistoryResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowOutputInfoRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowOutputInfoResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowRecordDetailRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowRecordDetailResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowRecordInfoRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowRecordInfoResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.StopBuildJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.StopBuildJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.StopJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.StopJobRequestBody;
import com.huaweicloud.sdk.codeartsbuild.v3.model.StopJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateBuildJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateBuildJobRequestBody;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateBuildJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateNoticeRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateNoticeRequestBody;
import com.huaweicloud.sdk.codeartsbuild.v3.model.UpdateNoticeResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CodeArtsBuildMeta {

    public static final HttpRequestDef<CreateBuildJobRequest, CreateBuildJobResponse> createBuildJob =
        genForcreateBuildJob();

    private static HttpRequestDef<CreateBuildJobRequest, CreateBuildJobResponse> genForcreateBuildJob() {
        // basic
        HttpRequestDef.Builder<CreateBuildJobRequest, CreateBuildJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateBuildJobRequest.class, CreateBuildJobResponse.class)
                .withName("CreateBuildJob")
                .withUri("/v3/jobs/create")
                .withContentType("application/json");

        // requests
        builder.<CreateBuildJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateBuildJobRequestBody.class),
            f -> f.withMarshaller(CreateBuildJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTemplatesRequest, CreateTemplatesResponse> createTemplates =
        genForcreateTemplates();

    private static HttpRequestDef<CreateTemplatesRequest, CreateTemplatesResponse> genForcreateTemplates() {
        // basic
        HttpRequestDef.Builder<CreateTemplatesRequest, CreateTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTemplatesRequest.class, CreateTemplatesResponse.class)
                .withName("CreateTemplates")
                .withUri("/v3/templates/create")
                .withContentType("application/json");

        // requests
        builder.<CreateTemplatesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTemplatesRequestBody.class),
            f -> f.withMarshaller(CreateTemplatesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBuildJobRequest, DeleteBuildJobResponse> deleteBuildJob =
        genFordeleteBuildJob();

    private static HttpRequestDef<DeleteBuildJobRequest, DeleteBuildJobResponse> genFordeleteBuildJob() {
        // basic
        HttpRequestDef.Builder<DeleteBuildJobRequest, DeleteBuildJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteBuildJobRequest.class, DeleteBuildJobResponse.class)
                .withName("DeleteBuildJob")
                .withUri("/v3/jobs/{job_id}/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBuildJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplatesRequest, DeleteTemplatesResponse> deleteTemplates =
        genFordeleteTemplates();

    private static HttpRequestDef<DeleteTemplatesRequest, DeleteTemplatesResponse> genFordeleteTemplates() {
        // basic
        HttpRequestDef.Builder<DeleteTemplatesRequest, DeleteTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTemplatesRequest.class, DeleteTemplatesResponse.class)
                .withName("DeleteTemplates")
                .withUri("/v3/templates/{uuid}/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplatesRequest::getUuid, (req, v) -> {
                req.setUuid(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableBuildJobRequest, DisableBuildJobResponse> disableBuildJob =
        genFordisableBuildJob();

    private static HttpRequestDef<DisableBuildJobRequest, DisableBuildJobResponse> genFordisableBuildJob() {
        // basic
        HttpRequestDef.Builder<DisableBuildJobRequest, DisableBuildJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisableBuildJobRequest.class, DisableBuildJobResponse.class)
                .withName("DisableBuildJob")
                .withUri("/v3/jobs/{job_id}/disable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableBuildJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableNoticeRequest, DisableNoticeResponse> disableNotice =
        genFordisableNotice();

    private static HttpRequestDef<DisableNoticeRequest, DisableNoticeResponse> genFordisableNotice() {
        // basic
        HttpRequestDef.Builder<DisableNoticeRequest, DisableNoticeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisableNoticeRequest.class, DisableNoticeResponse.class)
                .withName("DisableNotice")
                .withUri("/v3/jobs/notice/{job_id}/disable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableNoticeRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("notice_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableNoticeRequest::getNoticeType, (req, v) -> {
                req.setNoticeType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadBuildLogRequest, DownloadBuildLogResponse> downloadBuildLog =
        genFordownloadBuildLog();

    private static HttpRequestDef<DownloadBuildLogRequest, DownloadBuildLogResponse> genFordownloadBuildLog() {
        // basic
        HttpRequestDef.Builder<DownloadBuildLogRequest, DownloadBuildLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadBuildLogRequest.class, DownloadBuildLogResponse.class)
                .withName("DownloadBuildLog")
                .withUri("/v4/{record_id}/download-log")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("record_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadBuildLogRequest::getRecordId, (req, v) -> {
                req.setRecordId(v);
            }));
        builder.<String>withRequestField("log_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadBuildLogRequest::getLogLevel, (req, v) -> {
                req.setLogLevel(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadKeystoreRequest, DownloadKeystoreResponse> downloadKeystore =
        genFordownloadKeystore();

    private static HttpRequestDef<DownloadKeystoreRequest, DownloadKeystoreResponse> genFordownloadKeystore() {
        // basic
        HttpRequestDef.Builder<DownloadKeystoreRequest, DownloadKeystoreResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadKeystoreRequest.class, DownloadKeystoreResponse.class)
                .withName("DownloadKeystore")
                .withUri("/v3/keystore")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("file_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadKeystoreRequest::getFileName, (req, v) -> {
                req.setFileName(v);
            }));
        builder.<String>withRequestField("domain_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadKeystoreRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadTaskLogRequest, DownloadTaskLogResponse> downloadTaskLog =
        genFordownloadTaskLog();

    private static HttpRequestDef<DownloadTaskLogRequest, DownloadTaskLogResponse> genFordownloadTaskLog() {
        // basic
        HttpRequestDef.Builder<DownloadTaskLogRequest, DownloadTaskLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadTaskLogRequest.class, DownloadTaskLogResponse.class)
                .withName("DownloadTaskLog")
                .withUri("/v4/{record_id}/task-log")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("record_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadTaskLogRequest::getRecordId, (req, v) -> {
                req.setRecordId(v);
            }));
        builder.<String>withRequestField("task_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadTaskLogRequest::getTaskName, (req, v) -> {
                req.setTaskName(v);
            }));
        builder.<String>withRequestField("log_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadTaskLogRequest::getLogLevel, (req, v) -> {
                req.setLogLevel(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableBuildJobRequest, EnableBuildJobResponse> enableBuildJob =
        genForenableBuildJob();

    private static HttpRequestDef<EnableBuildJobRequest, EnableBuildJobResponse> genForenableBuildJob() {
        // basic
        HttpRequestDef.Builder<EnableBuildJobRequest, EnableBuildJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableBuildJobRequest.class, EnableBuildJobResponse.class)
                .withName("EnableBuildJob")
                .withUri("/v3/jobs/{job_id}/recover")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableBuildJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobConfigRequest, ListJobConfigResponse> listJobConfig =
        genForlistJobConfig();

    private static HttpRequestDef<ListJobConfigRequest, ListJobConfigResponse> genForlistJobConfig() {
        // basic
        HttpRequestDef.Builder<ListJobConfigRequest, ListJobConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListJobConfigRequest.class, ListJobConfigResponse.class)
                .withName("ListJobConfig")
                .withUri("/v3/jobs/{job_id}/query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobConfigRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("get_all_params",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobConfigRequest::getGetAllParams, (req, v) -> {
                req.setGetAllParams(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNoticeRequest, ListNoticeResponse> listNotice = genForlistNotice();

    private static HttpRequestDef<ListNoticeRequest, ListNoticeResponse> genForlistNotice() {
        // basic
        HttpRequestDef.Builder<ListNoticeRequest, ListNoticeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNoticeRequest.class, ListNoticeResponse.class)
                .withName("ListNotice")
                .withUri("/v3/jobs/notice/{job_id}/query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNoticeRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> listTemplates =
        genForlistTemplates();

    private static HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> genForlistTemplates() {
        // basic
        HttpRequestDef.Builder<ListTemplatesRequest, ListTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTemplatesRequest.class, ListTemplatesResponse.class)
                .withName("ListTemplates")
                .withUri("/v3/templates/query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplatesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplatesRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<String>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplatesRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunJobRequest, RunJobResponse> runJob = genForrunJob();

    private static HttpRequestDef<RunJobRequest, RunJobResponse> genForrunJob() {
        // basic
        HttpRequestDef.Builder<RunJobRequest, RunJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunJobRequest.class, RunJobResponse.class)
                .withName("RunJob")
                .withUri("/v3/jobs/build")
                .withContentType("application/json");

        // requests
        builder.<RunJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunJobRequestBody.class),
            f -> f.withMarshaller(RunJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHistoryDetailsRequest, ShowHistoryDetailsResponse> showHistoryDetails =
        genForshowHistoryDetails();

    private static HttpRequestDef<ShowHistoryDetailsRequest, ShowHistoryDetailsResponse> genForshowHistoryDetails() {
        // basic
        HttpRequestDef.Builder<ShowHistoryDetailsRequest, ShowHistoryDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHistoryDetailsRequest.class, ShowHistoryDetailsResponse.class)
                .withName("ShowHistoryDetails")
                .withUri("/v3/jobs/{job_id}/{build_number}/history-details")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHistoryDetailsRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<Integer>withRequestField("build_number",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHistoryDetailsRequest::getBuildNumber, (req, v) -> {
                req.setBuildNumber(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobListByProjectIdRequest, ShowJobListByProjectIdResponse> showJobListByProjectId =
        genForshowJobListByProjectId();

    private static HttpRequestDef<ShowJobListByProjectIdRequest, ShowJobListByProjectIdResponse> genForshowJobListByProjectId() {
        // basic
        HttpRequestDef.Builder<ShowJobListByProjectIdRequest, ShowJobListByProjectIdResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowJobListByProjectIdRequest.class, ShowJobListByProjectIdResponse.class)
            .withName("ShowJobListByProjectId")
            .withUri("/v3/{project_id}/jobs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobListByProjectIdRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<Integer>withRequestField("page_index",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowJobListByProjectIdRequest::getPageIndex, (req, v) -> {
                req.setPageIndex(v);
            }));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowJobListByProjectIdRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobStatusRequest, ShowJobStatusResponse> showJobStatus =
        genForshowJobStatus();

    private static HttpRequestDef<ShowJobStatusRequest, ShowJobStatusResponse> genForshowJobStatus() {
        // basic
        HttpRequestDef.Builder<ShowJobStatusRequest, ShowJobStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobStatusRequest.class, ShowJobStatusResponse.class)
                .withName("ShowJobStatus")
                .withUri("/v3/jobs/{job_id}/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobStatusRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobSuccessRatioRequest, ShowJobSuccessRatioResponse> showJobSuccessRatio =
        genForshowJobSuccessRatio();

    private static HttpRequestDef<ShowJobSuccessRatioRequest, ShowJobSuccessRatioResponse> genForshowJobSuccessRatio() {
        // basic
        HttpRequestDef.Builder<ShowJobSuccessRatioRequest, ShowJobSuccessRatioResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobSuccessRatioRequest.class, ShowJobSuccessRatioResponse.class)
                .withName("ShowJobSuccessRatio")
                .withUri("/v3/jobs/{job_id}/success-ratio")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobSuccessRatioRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobSuccessRatioRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobSuccessRatioRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLastHistoryRequest, ShowLastHistoryResponse> showLastHistory =
        genForshowLastHistory();

    private static HttpRequestDef<ShowLastHistoryRequest, ShowLastHistoryResponse> genForshowLastHistory() {
        // basic
        HttpRequestDef.Builder<ShowLastHistoryRequest, ShowLastHistoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLastHistoryRequest.class, ShowLastHistoryResponse.class)
                .withName("ShowLastHistory")
                .withUri("/v3/jobs/{project_id}/last-history")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLastHistoryRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("repository_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLastHistoryRequest::getRepositoryName, (req, v) -> {
                req.setRepositoryName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowListHistoryRequest, ShowListHistoryResponse> showListHistory =
        genForshowListHistory();

    private static HttpRequestDef<ShowListHistoryRequest, ShowListHistoryResponse> genForshowListHistory() {
        // basic
        HttpRequestDef.Builder<ShowListHistoryRequest, ShowListHistoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowListHistoryRequest.class, ShowListHistoryResponse.class)
                .withName("ShowListHistory")
                .withUri("/v3/jobs/{job_id}/history")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowListHistoryRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowListHistoryRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowListHistoryRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("interval",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowListHistoryRequest::getInterval, (req, v) -> {
                req.setInterval(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowListPeriodHistoryRequest, ShowListPeriodHistoryResponse> showListPeriodHistory =
        genForshowListPeriodHistory();

    private static HttpRequestDef<ShowListPeriodHistoryRequest, ShowListPeriodHistoryResponse> genForshowListPeriodHistory() {
        // basic
        HttpRequestDef.Builder<ShowListPeriodHistoryRequest, ShowListPeriodHistoryResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowListPeriodHistoryRequest.class, ShowListPeriodHistoryResponse.class)
            .withName("ShowListPeriodHistory")
            .withUri("/v3/jobs/{job_id}/period-history")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowListPeriodHistoryRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowListPeriodHistoryRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowListPeriodHistoryRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowListPeriodHistoryRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowListPeriodHistoryRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOutputInfoRequest, ShowOutputInfoResponse> showOutputInfo =
        genForshowOutputInfo();

    private static HttpRequestDef<ShowOutputInfoRequest, ShowOutputInfoResponse> genForshowOutputInfo() {
        // basic
        HttpRequestDef.Builder<ShowOutputInfoRequest, ShowOutputInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowOutputInfoRequest.class, ShowOutputInfoResponse.class)
                .withName("ShowOutputInfo")
                .withUri("/v3/jobs/{job_id}/{build_no}/output-info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOutputInfoRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<Integer>withRequestField("build_no",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowOutputInfoRequest::getBuildNo, (req, v) -> {
                req.setBuildNo(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRecordDetailRequest, ShowRecordDetailResponse> showRecordDetail =
        genForshowRecordDetail();

    private static HttpRequestDef<ShowRecordDetailRequest, ShowRecordDetailResponse> genForshowRecordDetail() {
        // basic
        HttpRequestDef.Builder<ShowRecordDetailRequest, ShowRecordDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRecordDetailRequest.class, ShowRecordDetailResponse.class)
                .withName("ShowRecordDetail")
                .withUri("/v4/jobs/{job_id}/{build_no}/record-info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordDetailRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<Integer>withRequestField("build_no",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRecordDetailRequest::getBuildNo, (req, v) -> {
                req.setBuildNo(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopBuildJobRequest, StopBuildJobResponse> stopBuildJob = genForstopBuildJob();

    private static HttpRequestDef<StopBuildJobRequest, StopBuildJobResponse> genForstopBuildJob() {
        // basic
        HttpRequestDef.Builder<StopBuildJobRequest, StopBuildJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopBuildJobRequest.class, StopBuildJobResponse.class)
                .withName("StopBuildJob")
                .withUri("/v3/jobs/{job_id}/{build_no}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopBuildJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<Integer>withRequestField("build_no",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(StopBuildJobRequest::getBuildNo, (req, v) -> {
                req.setBuildNo(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBuildJobRequest, UpdateBuildJobResponse> updateBuildJob =
        genForupdateBuildJob();

    private static HttpRequestDef<UpdateBuildJobRequest, UpdateBuildJobResponse> genForupdateBuildJob() {
        // basic
        HttpRequestDef.Builder<UpdateBuildJobRequest, UpdateBuildJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateBuildJobRequest.class, UpdateBuildJobResponse.class)
                .withName("UpdateBuildJob")
                .withUri("/v3/jobs/update")
                .withContentType("application/json");

        // requests
        builder.<UpdateBuildJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateBuildJobRequestBody.class),
            f -> f.withMarshaller(UpdateBuildJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNoticeRequest, UpdateNoticeResponse> updateNotice = genForupdateNotice();

    private static HttpRequestDef<UpdateNoticeRequest, UpdateNoticeResponse> genForupdateNotice() {
        // basic
        HttpRequestDef.Builder<UpdateNoticeRequest, UpdateNoticeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateNoticeRequest.class, UpdateNoticeResponse.class)
                .withName("UpdateNotice")
                .withUri("/v3/jobs/notice/{job_id}/update")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNoticeRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<UpdateNoticeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNoticeRequestBody.class),
            f -> f.withMarshaller(UpdateNoticeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadLogByRecordIdRequest, DownloadLogByRecordIdResponse> downloadLogByRecordId =
        genFordownloadLogByRecordId();

    private static HttpRequestDef<DownloadLogByRecordIdRequest, DownloadLogByRecordIdResponse> genFordownloadLogByRecordId() {
        // basic
        HttpRequestDef.Builder<DownloadLogByRecordIdRequest, DownloadLogByRecordIdResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, DownloadLogByRecordIdRequest.class, DownloadLogByRecordIdResponse.class)
            .withName("DownloadLogByRecordId")
            .withUri("/v3/{record_id}/download-log")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("record_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadLogByRecordIdRequest::getRecordId, (req, v) -> {
                req.setRecordId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFlowGraphRequest, ShowFlowGraphResponse> showFlowGraph =
        genForshowFlowGraph();

    private static HttpRequestDef<ShowFlowGraphRequest, ShowFlowGraphResponse> genForshowFlowGraph() {
        // basic
        HttpRequestDef.Builder<ShowFlowGraphRequest, ShowFlowGraphResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFlowGraphRequest.class, ShowFlowGraphResponse.class)
                .withName("ShowFlowGraph")
                .withUri("/v3/{build_flow_record_id}/flow-graph")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("build_flow_record_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFlowGraphRequest::getBuildFlowRecordId, (req, v) -> {
                req.setBuildFlowRecordId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRecordInfoRequest, ShowRecordInfoResponse> showRecordInfo =
        genForshowRecordInfo();

    private static HttpRequestDef<ShowRecordInfoRequest, ShowRecordInfoResponse> genForshowRecordInfo() {
        // basic
        HttpRequestDef.Builder<ShowRecordInfoRequest, ShowRecordInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRecordInfoRequest.class, ShowRecordInfoResponse.class)
                .withName("ShowRecordInfo")
                .withUri("/v3/jobs/{job_id}/{build_no}/record-info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordInfoRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<Integer>withRequestField("build_no",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRecordInfoRequest::getBuildNo, (req, v) -> {
                req.setBuildNo(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopJobRequest, StopJobResponse> stopJob = genForstopJob();

    private static HttpRequestDef<StopJobRequest, StopJobResponse> genForstopJob() {
        // basic
        HttpRequestDef.Builder<StopJobRequest, StopJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopJobRequest.class, StopJobResponse.class)
                .withName("StopJob")
                .withUri("/v3/jobs/stop")
                .withContentType("application/json");

        // requests
        builder.<StopJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StopJobRequestBody.class),
            f -> f.withMarshaller(StopJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}

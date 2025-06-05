package com.huaweicloud.sdk.codeartsbuild.v3;

import com.huaweicloud.sdk.codeartsbuild.v3.model.CheckJobNameIsExistsRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.CheckJobNameIsExistsResponse;
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
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadKeystoreByNameRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadKeystoreByNameResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadKeystoreRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadKeystoreResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadLogByRecordIdRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadLogByRecordIdResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadRealTimeLogRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadRealTimeLogResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadTaskLogRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.DownloadTaskLogResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.EnableBuildJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.EnableBuildJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListBuildInfoRecordByJobIdRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListBuildInfoRecordByJobIdResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListBuildInfoRecordRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListBuildInfoRecordResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListJobConfigRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListJobConfigResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListKeystoreRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListKeystoreResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListNoticeRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListNoticeResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListOfficialTemplateRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListOfficialTemplateResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListProjectJobsRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListProjectJobsResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListRecordsRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListRecordsResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListRecyclingJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListRecyclingJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListRelatedProjectInfoRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListRelatedProjectInfoResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListTemplatesRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ListTemplatesResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.RunJobRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.RunJobRequestBody;
import com.huaweicloud.sdk.codeartsbuild.v3.model.RunJobResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowBuildInfoRecordRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowBuildInfoRecordResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowBuildParamsListRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowBuildParamsListResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowBuildRecordBuildScriptRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowBuildRecordBuildScriptResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowBuildRecordFullStagesRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowBuildRecordFullStagesResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowBuildRecordRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowBuildRecordResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowDefaultBuildParametersRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowDefaultBuildParametersResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowDockerfileTemplateRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowDockerfileTemplateResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowFlowGraphRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowFlowGraphResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowHistoryDetailsRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowHistoryDetailsResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowImageTemplateListRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowImageTemplateListResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobBuildSuccessRatioRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobBuildSuccessRatioResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobBuildTimeRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobBuildTimeResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobConfigDiffRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobConfigDiffResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobConfigRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobConfigResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobInfoRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobInfoResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobListByProjectIdRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobListByProjectIdResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobNoticeConfigInfoRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobNoticeConfigInfoResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobRolePermissionRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobRolePermissionResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobStatusRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobStatusResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobSuccessRatioRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobSuccessRatioResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobSystemParametersRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowJobSystemParametersResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowKeystorePermissionRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowKeystorePermissionResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowLastHistoryRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowLastHistoryResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowListHistoryRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowListHistoryResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowListPeriodHistoryRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowListPeriodHistoryResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowOutputInfoRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowOutputInfoResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowProjectPermissionRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowProjectPermissionResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowRecordDetailRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowRecordDetailResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowRecordInfoRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowRecordInfoResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowRelatedProjectRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowRelatedProjectResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowReportSummaryRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowReportSummaryResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowRunningStatusRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowRunningStatusResponse;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowYamlTemplateRequest;
import com.huaweicloud.sdk.codeartsbuild.v3.model.ShowYamlTemplateResponse;
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

import java.util.List;

@SuppressWarnings("unchecked")
public class CodeArtsBuildMeta {

    public static final HttpRequestDef<CheckJobNameIsExistsRequest, CheckJobNameIsExistsResponse> checkJobNameIsExists =
        genForCheckJobNameIsExists();

    private static HttpRequestDef<CheckJobNameIsExistsRequest, CheckJobNameIsExistsResponse> genForCheckJobNameIsExists() {
        // basic
        HttpRequestDef.Builder<CheckJobNameIsExistsRequest, CheckJobNameIsExistsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, CheckJobNameIsExistsRequest.class, CheckJobNameIsExistsResponse.class)
            .withName("CheckJobNameIsExists")
            .withUri("/v1/job/check/exist")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckJobNameIsExistsRequest::getProjectId,
                CheckJobNameIsExistsRequest::setProjectId));
        builder.<String>withRequestField("job_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckJobNameIsExistsRequest::getJobName, CheckJobNameIsExistsRequest::setJobName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBuildJobRequest, CreateBuildJobResponse> createBuildJob =
        genForCreateBuildJob();

    private static HttpRequestDef<CreateBuildJobRequest, CreateBuildJobResponse> genForCreateBuildJob() {
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
            f -> f.withMarshaller(CreateBuildJobRequest::getBody, CreateBuildJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTemplatesRequest, CreateTemplatesResponse> createTemplates =
        genForCreateTemplates();

    private static HttpRequestDef<CreateTemplatesRequest, CreateTemplatesResponse> genForCreateTemplates() {
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
            f -> f.withMarshaller(CreateTemplatesRequest::getBody, CreateTemplatesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBuildJobRequest, DeleteBuildJobResponse> deleteBuildJob =
        genForDeleteBuildJob();

    private static HttpRequestDef<DeleteBuildJobRequest, DeleteBuildJobResponse> genForDeleteBuildJob() {
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
            f -> f.withMarshaller(DeleteBuildJobRequest::getJobId, DeleteBuildJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplatesRequest, DeleteTemplatesResponse> deleteTemplates =
        genForDeleteTemplates();

    private static HttpRequestDef<DeleteTemplatesRequest, DeleteTemplatesResponse> genForDeleteTemplates() {
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
            f -> f.withMarshaller(DeleteTemplatesRequest::getUuid, DeleteTemplatesRequest::setUuid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableBuildJobRequest, DisableBuildJobResponse> disableBuildJob =
        genForDisableBuildJob();

    private static HttpRequestDef<DisableBuildJobRequest, DisableBuildJobResponse> genForDisableBuildJob() {
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
            f -> f.withMarshaller(DisableBuildJobRequest::getJobId, DisableBuildJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableNoticeRequest, DisableNoticeResponse> disableNotice =
        genForDisableNotice();

    private static HttpRequestDef<DisableNoticeRequest, DisableNoticeResponse> genForDisableNotice() {
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
            f -> f.withMarshaller(DisableNoticeRequest::getJobId, DisableNoticeRequest::setJobId));
        builder.<String>withRequestField("notice_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableNoticeRequest::getNoticeType, DisableNoticeRequest::setNoticeType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadBuildLogRequest, DownloadBuildLogResponse> downloadBuildLog =
        genForDownloadBuildLog();

    private static HttpRequestDef<DownloadBuildLogRequest, DownloadBuildLogResponse> genForDownloadBuildLog() {
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
            f -> f.withMarshaller(DownloadBuildLogRequest::getRecordId, DownloadBuildLogRequest::setRecordId));
        builder.<String>withRequestField("log_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadBuildLogRequest::getLogLevel, DownloadBuildLogRequest::setLogLevel));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadKeystoreRequest, DownloadKeystoreResponse> downloadKeystore =
        genForDownloadKeystore();

    private static HttpRequestDef<DownloadKeystoreRequest, DownloadKeystoreResponse> genForDownloadKeystore() {
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
            f -> f.withMarshaller(DownloadKeystoreRequest::getFileName, DownloadKeystoreRequest::setFileName));
        builder.<String>withRequestField("domain_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadKeystoreRequest::getDomainId, DownloadKeystoreRequest::setDomainId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadKeystoreByNameRequest, DownloadKeystoreByNameResponse> downloadKeystoreByName =
        genForDownloadKeystoreByName();

    private static HttpRequestDef<DownloadKeystoreByNameRequest, DownloadKeystoreByNameResponse> genForDownloadKeystoreByName() {
        // basic
        HttpRequestDef.Builder<DownloadKeystoreByNameRequest, DownloadKeystoreByNameResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, DownloadKeystoreByNameRequest.class, DownloadKeystoreByNameResponse.class)
            .withName("DownloadKeystoreByName")
            .withUri("/v2/keystore/download")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadKeystoreByNameRequest::getName, DownloadKeystoreByNameRequest::setName));
        builder.<String>withRequestField("domain_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadKeystoreByNameRequest::getDomainId,
                DownloadKeystoreByNameRequest::setDomainId));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadKeystoreByNameRequest::getId, DownloadKeystoreByNameRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadRealTimeLogRequest, DownloadRealTimeLogResponse> downloadRealTimeLog =
        genForDownloadRealTimeLog();

    private static HttpRequestDef<DownloadRealTimeLogRequest, DownloadRealTimeLogResponse> genForDownloadRealTimeLog() {
        // basic
        HttpRequestDef.Builder<DownloadRealTimeLogRequest, DownloadRealTimeLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadRealTimeLogRequest.class, DownloadRealTimeLogResponse.class)
                .withName("DownloadRealTimeLog")
                .withUri("/v3/jobs/{job_id}/{build_no}/real-time-log")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadRealTimeLogRequest::getJobId, DownloadRealTimeLogRequest::setJobId));
        builder.<Integer>withRequestField("build_no",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DownloadRealTimeLogRequest::getBuildNo, DownloadRealTimeLogRequest::setBuildNo));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DownloadRealTimeLogRequest::getOffset, DownloadRealTimeLogRequest::setOffset));
        builder.<Integer>withRequestField("length",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DownloadRealTimeLogRequest::getLength, DownloadRealTimeLogRequest::setLength));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadTaskLogRequest, DownloadTaskLogResponse> downloadTaskLog =
        genForDownloadTaskLog();

    private static HttpRequestDef<DownloadTaskLogRequest, DownloadTaskLogResponse> genForDownloadTaskLog() {
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
            f -> f.withMarshaller(DownloadTaskLogRequest::getRecordId, DownloadTaskLogRequest::setRecordId));
        builder.<String>withRequestField("task_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadTaskLogRequest::getTaskName, DownloadTaskLogRequest::setTaskName));
        builder.<String>withRequestField("log_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadTaskLogRequest::getLogLevel, DownloadTaskLogRequest::setLogLevel));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableBuildJobRequest, EnableBuildJobResponse> enableBuildJob =
        genForEnableBuildJob();

    private static HttpRequestDef<EnableBuildJobRequest, EnableBuildJobResponse> genForEnableBuildJob() {
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
            f -> f.withMarshaller(EnableBuildJobRequest::getJobId, EnableBuildJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBuildInfoRecordRequest, ListBuildInfoRecordResponse> listBuildInfoRecord =
        genForListBuildInfoRecord();

    private static HttpRequestDef<ListBuildInfoRecordRequest, ListBuildInfoRecordResponse> genForListBuildInfoRecord() {
        // basic
        HttpRequestDef.Builder<ListBuildInfoRecordRequest, ListBuildInfoRecordResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBuildInfoRecordRequest.class, ListBuildInfoRecordResponse.class)
                .withName("ListBuildInfoRecord")
                .withUri("/v3/jobs/{job_id}/build-info-records")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBuildInfoRecordRequest::getJobId, ListBuildInfoRecordRequest::setJobId));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBuildInfoRecordRequest::getStartTime, ListBuildInfoRecordRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBuildInfoRecordRequest::getEndTime, ListBuildInfoRecordRequest::setEndTime));
        builder.<Integer>withRequestField("page_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBuildInfoRecordRequest::getPageIndex, ListBuildInfoRecordRequest::setPageIndex));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBuildInfoRecordRequest::getPageSize, ListBuildInfoRecordRequest::setPageSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBuildInfoRecordByJobIdRequest, ListBuildInfoRecordByJobIdResponse> listBuildInfoRecordByJobId =
        genForListBuildInfoRecordByJobId();

    private static HttpRequestDef<ListBuildInfoRecordByJobIdRequest, ListBuildInfoRecordByJobIdResponse> genForListBuildInfoRecordByJobId() {
        // basic
        HttpRequestDef.Builder<ListBuildInfoRecordByJobIdRequest, ListBuildInfoRecordByJobIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListBuildInfoRecordByJobIdRequest.class,
                    ListBuildInfoRecordByJobIdResponse.class)
                .withName("ListBuildInfoRecordByJobId")
                .withUri("/v1/record/{job_id}/list")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBuildInfoRecordByJobIdRequest::getJobId,
                ListBuildInfoRecordByJobIdRequest::setJobId));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBuildInfoRecordByJobIdRequest::getStartTime,
                ListBuildInfoRecordByJobIdRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBuildInfoRecordByJobIdRequest::getEndTime,
                ListBuildInfoRecordByJobIdRequest::setEndTime));
        builder.<Integer>withRequestField("page_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBuildInfoRecordByJobIdRequest::getPageIndex,
                ListBuildInfoRecordByJobIdRequest::setPageIndex));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBuildInfoRecordByJobIdRequest::getPageSize,
                ListBuildInfoRecordByJobIdRequest::setPageSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobConfigRequest, ListJobConfigResponse> listJobConfig =
        genForListJobConfig();

    private static HttpRequestDef<ListJobConfigRequest, ListJobConfigResponse> genForListJobConfig() {
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
            f -> f.withMarshaller(ListJobConfigRequest::getJobId, ListJobConfigRequest::setJobId));
        builder.<String>withRequestField("get_all_params",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobConfigRequest::getGetAllParams, ListJobConfigRequest::setGetAllParams));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListKeystoreRequest, ListKeystoreResponse> listKeystore = genForListKeystore();

    private static HttpRequestDef<ListKeystoreRequest, ListKeystoreResponse> genForListKeystore() {
        // basic
        HttpRequestDef.Builder<ListKeystoreRequest, ListKeystoreResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListKeystoreRequest.class, ListKeystoreResponse.class)
                .withName("ListKeystore")
                .withUri("/v2/keystore/name")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNoticeRequest, ListNoticeResponse> listNotice = genForListNotice();

    private static HttpRequestDef<ListNoticeRequest, ListNoticeResponse> genForListNotice() {
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
            f -> f.withMarshaller(ListNoticeRequest::getJobId, ListNoticeRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOfficialTemplateRequest, ListOfficialTemplateResponse> listOfficialTemplate =
        genForListOfficialTemplate();

    private static HttpRequestDef<ListOfficialTemplateRequest, ListOfficialTemplateResponse> genForListOfficialTemplate() {
        // basic
        HttpRequestDef.Builder<ListOfficialTemplateRequest, ListOfficialTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListOfficialTemplateRequest.class, ListOfficialTemplateResponse.class)
            .withName("ListOfficialTemplate")
            .withUri("/v1/template/officialtemplates")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOfficialTemplateRequest::getName, ListOfficialTemplateRequest::setName));
        builder.<String>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOfficialTemplateRequest::getPage, ListOfficialTemplateRequest::setPage));
        builder.<String>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOfficialTemplateRequest::getPageSize, ListOfficialTemplateRequest::setPageSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectJobsRequest, ListProjectJobsResponse> listProjectJobs =
        genForListProjectJobs();

    private static HttpRequestDef<ListProjectJobsRequest, ListProjectJobsResponse> genForListProjectJobs() {
        // basic
        HttpRequestDef.Builder<ListProjectJobsRequest, ListProjectJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectJobsRequest.class, ListProjectJobsResponse.class)
                .withName("ListProjectJobs")
                .withUri("/v1/job/{project_id}/list")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectJobsRequest::getProjectId, ListProjectJobsRequest::setProjectId));
        builder.<Integer>withRequestField("page_index",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectJobsRequest::getPageIndex, ListProjectJobsRequest::setPageIndex));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectJobsRequest::getPageSize, ListProjectJobsRequest::setPageSize));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectJobsRequest::getSearch, ListProjectJobsRequest::setSearch));
        builder.<String>withRequestField("sort_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectJobsRequest::getSortField, ListProjectJobsRequest::setSortField));
        builder.<String>withRequestField("sort_order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectJobsRequest::getSortOrder, ListProjectJobsRequest::setSortOrder));
        builder.<String>withRequestField("creator_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectJobsRequest::getCreatorId, ListProjectJobsRequest::setCreatorId));
        builder.<String>withRequestField("build_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectJobsRequest::getBuildStatus, ListProjectJobsRequest::setBuildStatus));
        builder.<Boolean>withRequestField("by_group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListProjectJobsRequest::getByGroup, ListProjectJobsRequest::setByGroup));
        builder.<String>withRequestField("group_path_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectJobsRequest::getGroupPathId, ListProjectJobsRequest::setGroupPathId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRecordsRequest, ListRecordsResponse> listRecords = genForListRecords();

    private static HttpRequestDef<ListRecordsRequest, ListRecordsResponse> genForListRecords() {
        // basic
        HttpRequestDef.Builder<ListRecordsRequest, ListRecordsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRecordsRequest.class, ListRecordsResponse.class)
                .withName("ListRecords")
                .withUri("/v1/record/{build_project_id}/records")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("build_project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordsRequest::getBuildProjectId, ListRecordsRequest::setBuildProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecordsRequest::getPage, ListRecordsRequest::setPage));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecordsRequest::getLimit, ListRecordsRequest::setLimit));
        builder.<List<String>>withRequestField("triggers",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRecordsRequest::getTriggers, ListRecordsRequest::setTriggers));
        builder.<List<String>>withRequestField("branches",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRecordsRequest::getBranches, ListRecordsRequest::setBranches));
        builder.<List<String>>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRecordsRequest::getTags, ListRecordsRequest::setTags));
        builder.<String>withRequestField("from_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordsRequest::getFromDate, ListRecordsRequest::setFromDate));
        builder.<String>withRequestField("to_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordsRequest::getToDate, ListRecordsRequest::setToDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRecyclingJobRequest, ListRecyclingJobResponse> listRecyclingJob =
        genForListRecyclingJob();

    private static HttpRequestDef<ListRecyclingJobRequest, ListRecyclingJobResponse> genForListRecyclingJob() {
        // basic
        HttpRequestDef.Builder<ListRecyclingJobRequest, ListRecyclingJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRecyclingJobRequest.class, ListRecyclingJobResponse.class)
                .withName("ListRecyclingJob")
                .withUri("/v1/job/recycling-jobs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecyclingJobRequest::getPageSize, ListRecyclingJobRequest::setPageSize));
        builder.<Integer>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecyclingJobRequest::getPageNo, ListRecyclingJobRequest::setPageNo));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecyclingJobRequest::getSearch, ListRecyclingJobRequest::setSearch));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRelatedProjectInfoRequest, ListRelatedProjectInfoResponse> listRelatedProjectInfo =
        genForListRelatedProjectInfo();

    private static HttpRequestDef<ListRelatedProjectInfoRequest, ListRelatedProjectInfoResponse> genForListRelatedProjectInfo() {
        // basic
        HttpRequestDef.Builder<ListRelatedProjectInfoRequest, ListRelatedProjectInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListRelatedProjectInfoRequest.class, ListRelatedProjectInfoResponse.class)
            .withName("ListRelatedProjectInfo")
            .withUri("/v1/domain/project/related-page")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRelatedProjectInfoRequest::getPageSize,
                ListRelatedProjectInfoRequest::setPageSize));
        builder.<Integer>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRelatedProjectInfoRequest::getPageNo, ListRelatedProjectInfoRequest::setPageNo));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRelatedProjectInfoRequest::getSearch, ListRelatedProjectInfoRequest::setSearch));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> listTemplates =
        genForListTemplates();

    private static HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> genForListTemplates() {
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
            f -> f.withMarshaller(ListTemplatesRequest::getName, ListTemplatesRequest::setName));
        builder.<String>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplatesRequest::getPage, ListTemplatesRequest::setPage));
        builder.<String>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplatesRequest::getPageSize, ListTemplatesRequest::setPageSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunJobRequest, RunJobResponse> runJob = genForRunJob();

    private static HttpRequestDef<RunJobRequest, RunJobResponse> genForRunJob() {
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
            f -> f.withMarshaller(RunJobRequest::getBody, RunJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBuildInfoRecordRequest, ShowBuildInfoRecordResponse> showBuildInfoRecord =
        genForShowBuildInfoRecord();

    private static HttpRequestDef<ShowBuildInfoRecordRequest, ShowBuildInfoRecordResponse> genForShowBuildInfoRecord() {
        // basic
        HttpRequestDef.Builder<ShowBuildInfoRecordRequest, ShowBuildInfoRecordResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBuildInfoRecordRequest.class, ShowBuildInfoRecordResponse.class)
                .withName("ShowBuildInfoRecord")
                .withUri("/v1/record/{job_id}/{build_no}/build-info-record")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBuildInfoRecordRequest::getJobId, ShowBuildInfoRecordRequest::setJobId));
        builder.<Integer>withRequestField("build_no",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowBuildInfoRecordRequest::getBuildNo, ShowBuildInfoRecordRequest::setBuildNo));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBuildParamsListRequest, ShowBuildParamsListResponse> showBuildParamsList =
        genForShowBuildParamsList();

    private static HttpRequestDef<ShowBuildParamsListRequest, ShowBuildParamsListResponse> genForShowBuildParamsList() {
        // basic
        HttpRequestDef.Builder<ShowBuildParamsListRequest, ShowBuildParamsListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBuildParamsListRequest.class, ShowBuildParamsListResponse.class)
                .withName("ShowBuildParamsList")
                .withUri("/v1/job/build-params")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBuildRecordRequest, ShowBuildRecordResponse> showBuildRecord =
        genForShowBuildRecord();

    private static HttpRequestDef<ShowBuildRecordRequest, ShowBuildRecordResponse> genForShowBuildRecord() {
        // basic
        HttpRequestDef.Builder<ShowBuildRecordRequest, ShowBuildRecordResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBuildRecordRequest.class, ShowBuildRecordResponse.class)
                .withName("ShowBuildRecord")
                .withUri("/v1/record/{record_id}/info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("record_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBuildRecordRequest::getRecordId, ShowBuildRecordRequest::setRecordId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBuildRecordBuildScriptRequest, ShowBuildRecordBuildScriptResponse> showBuildRecordBuildScript =
        genForShowBuildRecordBuildScript();

    private static HttpRequestDef<ShowBuildRecordBuildScriptRequest, ShowBuildRecordBuildScriptResponse> genForShowBuildRecordBuildScript() {
        // basic
        HttpRequestDef.Builder<ShowBuildRecordBuildScriptRequest, ShowBuildRecordBuildScriptResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowBuildRecordBuildScriptRequest.class,
                    ShowBuildRecordBuildScriptResponse.class)
                .withName("ShowBuildRecordBuildScript")
                .withUri("/v1/record/{record_id}/build-script")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("record_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBuildRecordBuildScriptRequest::getRecordId,
                ShowBuildRecordBuildScriptRequest::setRecordId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBuildRecordFullStagesRequest, ShowBuildRecordFullStagesResponse> showBuildRecordFullStages =
        genForShowBuildRecordFullStages();

    private static HttpRequestDef<ShowBuildRecordFullStagesRequest, ShowBuildRecordFullStagesResponse> genForShowBuildRecordFullStages() {
        // basic
        HttpRequestDef.Builder<ShowBuildRecordFullStagesRequest, ShowBuildRecordFullStagesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowBuildRecordFullStagesRequest.class,
                    ShowBuildRecordFullStagesResponse.class)
                .withName("ShowBuildRecordFullStages")
                .withUri("/v1/record/{record_id}/full-stages")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("record_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBuildRecordFullStagesRequest::getRecordId,
                ShowBuildRecordFullStagesRequest::setRecordId));
        builder.<Boolean>withRequestField("cascade",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowBuildRecordFullStagesRequest::getCascade,
                ShowBuildRecordFullStagesRequest::setCascade));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDefaultBuildParametersRequest, ShowDefaultBuildParametersResponse> showDefaultBuildParameters =
        genForShowDefaultBuildParameters();

    private static HttpRequestDef<ShowDefaultBuildParametersRequest, ShowDefaultBuildParametersResponse> genForShowDefaultBuildParameters() {
        // basic
        HttpRequestDef.Builder<ShowDefaultBuildParametersRequest, ShowDefaultBuildParametersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDefaultBuildParametersRequest.class,
                    ShowDefaultBuildParametersResponse.class)
                .withName("ShowDefaultBuildParameters")
                .withUri("/v1/job/default-parameters")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDockerfileTemplateRequest, ShowDockerfileTemplateResponse> showDockerfileTemplate =
        genForShowDockerfileTemplate();

    private static HttpRequestDef<ShowDockerfileTemplateRequest, ShowDockerfileTemplateResponse> genForShowDockerfileTemplate() {
        // basic
        HttpRequestDef.Builder<ShowDockerfileTemplateRequest, ShowDockerfileTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDockerfileTemplateRequest.class, ShowDockerfileTemplateResponse.class)
            .withName("ShowDockerfileTemplate")
            .withUri("/v1/image/dockerfile-template")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("image_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDockerfileTemplateRequest::getImageId,
                ShowDockerfileTemplateRequest::setImageId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHistoryDetailsRequest, ShowHistoryDetailsResponse> showHistoryDetails =
        genForShowHistoryDetails();

    private static HttpRequestDef<ShowHistoryDetailsRequest, ShowHistoryDetailsResponse> genForShowHistoryDetails() {
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
            f -> f.withMarshaller(ShowHistoryDetailsRequest::getJobId, ShowHistoryDetailsRequest::setJobId));
        builder.<Integer>withRequestField("build_number",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHistoryDetailsRequest::getBuildNumber,
                ShowHistoryDetailsRequest::setBuildNumber));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowImageTemplateListRequest, ShowImageTemplateListResponse> showImageTemplateList =
        genForShowImageTemplateList();

    private static HttpRequestDef<ShowImageTemplateListRequest, ShowImageTemplateListResponse> genForShowImageTemplateList() {
        // basic
        HttpRequestDef.Builder<ShowImageTemplateListRequest, ShowImageTemplateListResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowImageTemplateListRequest.class, ShowImageTemplateListResponse.class)
            .withName("ShowImageTemplateList")
            .withUri("/v1/image/templates")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobBuildSuccessRatioRequest, ShowJobBuildSuccessRatioResponse> showJobBuildSuccessRatio =
        genForShowJobBuildSuccessRatio();

    private static HttpRequestDef<ShowJobBuildSuccessRatioRequest, ShowJobBuildSuccessRatioResponse> genForShowJobBuildSuccessRatio() {
        // basic
        HttpRequestDef.Builder<ShowJobBuildSuccessRatioRequest, ShowJobBuildSuccessRatioResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowJobBuildSuccessRatioRequest.class, ShowJobBuildSuccessRatioResponse.class)
                .withName("ShowJobBuildSuccessRatio")
                .withUri("/v1/report/ratio")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobBuildSuccessRatioRequest::getJobId,
                ShowJobBuildSuccessRatioRequest::setJobId));
        builder.<String>withRequestField("repository_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobBuildSuccessRatioRequest::getRepositoryName,
                ShowJobBuildSuccessRatioRequest::setRepositoryName));
        builder.<String>withRequestField("branch",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobBuildSuccessRatioRequest::getBranch,
                ShowJobBuildSuccessRatioRequest::setBranch));
        builder.<Integer>withRequestField("interval",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowJobBuildSuccessRatioRequest::getInterval,
                ShowJobBuildSuccessRatioRequest::setInterval));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobBuildTimeRequest, ShowJobBuildTimeResponse> showJobBuildTime =
        genForShowJobBuildTime();

    private static HttpRequestDef<ShowJobBuildTimeRequest, ShowJobBuildTimeResponse> genForShowJobBuildTime() {
        // basic
        HttpRequestDef.Builder<ShowJobBuildTimeRequest, ShowJobBuildTimeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobBuildTimeRequest.class, ShowJobBuildTimeResponse.class)
                .withName("ShowJobBuildTime")
                .withUri("/v1/report/time")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobBuildTimeRequest::getJobId, ShowJobBuildTimeRequest::setJobId));
        builder.<String>withRequestField("repository_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobBuildTimeRequest::getRepositoryName,
                ShowJobBuildTimeRequest::setRepositoryName));
        builder.<String>withRequestField("branch",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobBuildTimeRequest::getBranch, ShowJobBuildTimeRequest::setBranch));
        builder.<Integer>withRequestField("interval",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowJobBuildTimeRequest::getInterval, ShowJobBuildTimeRequest::setInterval));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobConfigRequest, ShowJobConfigResponse> showJobConfig =
        genForShowJobConfig();

    private static HttpRequestDef<ShowJobConfigRequest, ShowJobConfigResponse> genForShowJobConfig() {
        // basic
        HttpRequestDef.Builder<ShowJobConfigRequest, ShowJobConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobConfigRequest.class, ShowJobConfigResponse.class)
                .withName("ShowJobConfig")
                .withUri("/v1/job/{job_id}/config")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobConfigRequest::getJobId, ShowJobConfigRequest::setJobId));
        builder.<String>withRequestField("get_all_params",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobConfigRequest::getGetAllParams, ShowJobConfigRequest::setGetAllParams));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobConfigDiffRequest, ShowJobConfigDiffResponse> showJobConfigDiff =
        genForShowJobConfigDiff();

    private static HttpRequestDef<ShowJobConfigDiffRequest, ShowJobConfigDiffResponse> genForShowJobConfigDiff() {
        // basic
        HttpRequestDef.Builder<ShowJobConfigDiffRequest, ShowJobConfigDiffResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobConfigDiffRequest.class, ShowJobConfigDiffResponse.class)
                .withName("ShowJobConfigDiff")
                .withUri("/v1/job/{job_id}/diff")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobConfigDiffRequest::getJobId, ShowJobConfigDiffRequest::setJobId));
        builder.<String>withRequestField("revisedl_no",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobConfigDiffRequest::getRevisedlNo, ShowJobConfigDiffRequest::setRevisedlNo));
        builder.<String>withRequestField("original_no",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobConfigDiffRequest::getOriginalNo, ShowJobConfigDiffRequest::setOriginalNo));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobInfoRequest, ShowJobInfoResponse> showJobInfo = genForShowJobInfo();

    private static HttpRequestDef<ShowJobInfoRequest, ShowJobInfoResponse> genForShowJobInfo() {
        // basic
        HttpRequestDef.Builder<ShowJobInfoRequest, ShowJobInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobInfoRequest.class, ShowJobInfoResponse.class)
                .withName("ShowJobInfo")
                .withUri("/v1/job/{job_id}/info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobInfoRequest::getJobId, ShowJobInfoRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobListByProjectIdRequest, ShowJobListByProjectIdResponse> showJobListByProjectId =
        genForShowJobListByProjectId();

    private static HttpRequestDef<ShowJobListByProjectIdRequest, ShowJobListByProjectIdResponse> genForShowJobListByProjectId() {
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
            f -> f.withMarshaller(ShowJobListByProjectIdRequest::getProjectId,
                ShowJobListByProjectIdRequest::setProjectId));
        builder.<Integer>withRequestField("page_index",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowJobListByProjectIdRequest::getPageIndex,
                ShowJobListByProjectIdRequest::setPageIndex));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowJobListByProjectIdRequest::getPageSize,
                ShowJobListByProjectIdRequest::setPageSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobNoticeConfigInfoRequest, ShowJobNoticeConfigInfoResponse> showJobNoticeConfigInfo =
        genForShowJobNoticeConfigInfo();

    private static HttpRequestDef<ShowJobNoticeConfigInfoRequest, ShowJobNoticeConfigInfoResponse> genForShowJobNoticeConfigInfo() {
        // basic
        HttpRequestDef.Builder<ShowJobNoticeConfigInfoRequest, ShowJobNoticeConfigInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowJobNoticeConfigInfoRequest.class, ShowJobNoticeConfigInfoResponse.class)
            .withName("ShowJobNoticeConfigInfo")
            .withUri("/v1/job/{job_id}/notice")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobNoticeConfigInfoRequest::getJobId, ShowJobNoticeConfigInfoRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobRolePermissionRequest, ShowJobRolePermissionResponse> showJobRolePermission =
        genForShowJobRolePermission();

    private static HttpRequestDef<ShowJobRolePermissionRequest, ShowJobRolePermissionResponse> genForShowJobRolePermission() {
        // basic
        HttpRequestDef.Builder<ShowJobRolePermissionRequest, ShowJobRolePermissionResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowJobRolePermissionRequest.class, ShowJobRolePermissionResponse.class)
            .withName("ShowJobRolePermission")
            .withUri("/v1/job/permission/role")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobRolePermissionRequest::getJobId, ShowJobRolePermissionRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobStatusRequest, ShowJobStatusResponse> showJobStatus =
        genForShowJobStatus();

    private static HttpRequestDef<ShowJobStatusRequest, ShowJobStatusResponse> genForShowJobStatus() {
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
            f -> f.withMarshaller(ShowJobStatusRequest::getJobId, ShowJobStatusRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobSuccessRatioRequest, ShowJobSuccessRatioResponse> showJobSuccessRatio =
        genForShowJobSuccessRatio();

    private static HttpRequestDef<ShowJobSuccessRatioRequest, ShowJobSuccessRatioResponse> genForShowJobSuccessRatio() {
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
            f -> f.withMarshaller(ShowJobSuccessRatioRequest::getJobId, ShowJobSuccessRatioRequest::setJobId));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobSuccessRatioRequest::getStartTime, ShowJobSuccessRatioRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobSuccessRatioRequest::getEndTime, ShowJobSuccessRatioRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobSystemParametersRequest, ShowJobSystemParametersResponse> showJobSystemParameters =
        genForShowJobSystemParameters();

    private static HttpRequestDef<ShowJobSystemParametersRequest, ShowJobSystemParametersResponse> genForShowJobSystemParameters() {
        // basic
        HttpRequestDef.Builder<ShowJobSystemParametersRequest, ShowJobSystemParametersResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowJobSystemParametersRequest.class, ShowJobSystemParametersResponse.class)
            .withName("ShowJobSystemParameters")
            .withUri("/v1/job/system-parameters")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowKeystorePermissionRequest, ShowKeystorePermissionResponse> showKeystorePermission =
        genForShowKeystorePermission();

    private static HttpRequestDef<ShowKeystorePermissionRequest, ShowKeystorePermissionResponse> genForShowKeystorePermission() {
        // basic
        HttpRequestDef.Builder<ShowKeystorePermissionRequest, ShowKeystorePermissionResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowKeystorePermissionRequest.class, ShowKeystorePermissionResponse.class)
            .withName("ShowKeystorePermission")
            .withUri("/v2/keystore/permission/{keystore_id}/query")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("keystore_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKeystorePermissionRequest::getKeystoreId,
                ShowKeystorePermissionRequest::setKeystoreId));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowKeystorePermissionRequest::getPageSize,
                ShowKeystorePermissionRequest::setPageSize));
        builder.<String>withRequestField("page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKeystorePermissionRequest::getPage, ShowKeystorePermissionRequest::setPage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLastHistoryRequest, ShowLastHistoryResponse> showLastHistory =
        genForShowLastHistory();

    private static HttpRequestDef<ShowLastHistoryRequest, ShowLastHistoryResponse> genForShowLastHistory() {
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
            f -> f.withMarshaller(ShowLastHistoryRequest::getProjectId, ShowLastHistoryRequest::setProjectId));
        builder.<String>withRequestField("repository_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLastHistoryRequest::getRepositoryName,
                ShowLastHistoryRequest::setRepositoryName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowListHistoryRequest, ShowListHistoryResponse> showListHistory =
        genForShowListHistory();

    private static HttpRequestDef<ShowListHistoryRequest, ShowListHistoryResponse> genForShowListHistory() {
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
            f -> f.withMarshaller(ShowListHistoryRequest::getJobId, ShowListHistoryRequest::setJobId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowListHistoryRequest::getOffset, ShowListHistoryRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowListHistoryRequest::getLimit, ShowListHistoryRequest::setLimit));
        builder.<Integer>withRequestField("interval",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowListHistoryRequest::getInterval, ShowListHistoryRequest::setInterval));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowListPeriodHistoryRequest, ShowListPeriodHistoryResponse> showListPeriodHistory =
        genForShowListPeriodHistory();

    private static HttpRequestDef<ShowListPeriodHistoryRequest, ShowListPeriodHistoryResponse> genForShowListPeriodHistory() {
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
            f -> f.withMarshaller(ShowListPeriodHistoryRequest::getJobId, ShowListPeriodHistoryRequest::setJobId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowListPeriodHistoryRequest::getOffset, ShowListPeriodHistoryRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowListPeriodHistoryRequest::getLimit, ShowListPeriodHistoryRequest::setLimit));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowListPeriodHistoryRequest::getStartTime,
                ShowListPeriodHistoryRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowListPeriodHistoryRequest::getEndTime, ShowListPeriodHistoryRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOutputInfoRequest, ShowOutputInfoResponse> showOutputInfo =
        genForShowOutputInfo();

    private static HttpRequestDef<ShowOutputInfoRequest, ShowOutputInfoResponse> genForShowOutputInfo() {
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
            f -> f.withMarshaller(ShowOutputInfoRequest::getJobId, ShowOutputInfoRequest::setJobId));
        builder.<Integer>withRequestField("build_no",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowOutputInfoRequest::getBuildNo, ShowOutputInfoRequest::setBuildNo));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectPermissionRequest, ShowProjectPermissionResponse> showProjectPermission =
        genForShowProjectPermission();

    private static HttpRequestDef<ShowProjectPermissionRequest, ShowProjectPermissionResponse> genForShowProjectPermission() {
        // basic
        HttpRequestDef.Builder<ShowProjectPermissionRequest, ShowProjectPermissionResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowProjectPermissionRequest.class, ShowProjectPermissionResponse.class)
            .withName("ShowProjectPermission")
            .withUri("/v1/domain/user-permission")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectPermissionRequest::getProjectId,
                ShowProjectPermissionRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRecordDetailRequest, ShowRecordDetailResponse> showRecordDetail =
        genForShowRecordDetail();

    private static HttpRequestDef<ShowRecordDetailRequest, ShowRecordDetailResponse> genForShowRecordDetail() {
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
            f -> f.withMarshaller(ShowRecordDetailRequest::getJobId, ShowRecordDetailRequest::setJobId));
        builder.<Integer>withRequestField("build_no",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRecordDetailRequest::getBuildNo, ShowRecordDetailRequest::setBuildNo));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRelatedProjectRequest, ShowRelatedProjectResponse> showRelatedProject =
        genForShowRelatedProject();

    private static HttpRequestDef<ShowRelatedProjectRequest, ShowRelatedProjectResponse> genForShowRelatedProject() {
        // basic
        HttpRequestDef.Builder<ShowRelatedProjectRequest, ShowRelatedProjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRelatedProjectRequest.class, ShowRelatedProjectResponse.class)
                .withName("ShowRelatedProject")
                .withUri("/v1/domain/project/related")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowReportSummaryRequest, ShowReportSummaryResponse> showReportSummary =
        genForShowReportSummary();

    private static HttpRequestDef<ShowReportSummaryRequest, ShowReportSummaryResponse> genForShowReportSummary() {
        // basic
        HttpRequestDef.Builder<ShowReportSummaryRequest, ShowReportSummaryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowReportSummaryRequest.class, ShowReportSummaryResponse.class)
                .withName("ShowReportSummary")
                .withUri("/v1/report/{job_id}/summary")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReportSummaryRequest::getJobId, ShowReportSummaryRequest::setJobId));
        builder.<Integer>withRequestField("build_no",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowReportSummaryRequest::getBuildNo, ShowReportSummaryRequest::setBuildNo));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRunningStatusRequest, ShowRunningStatusResponse> showRunningStatus =
        genForShowRunningStatus();

    private static HttpRequestDef<ShowRunningStatusRequest, ShowRunningStatusResponse> genForShowRunningStatus() {
        // basic
        HttpRequestDef.Builder<ShowRunningStatusRequest, ShowRunningStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRunningStatusRequest.class, ShowRunningStatusResponse.class)
                .withName("ShowRunningStatus")
                .withUri("/v1/job/{job_id}/running-status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRunningStatusRequest::getJobId, ShowRunningStatusRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowYamlTemplateRequest, ShowYamlTemplateResponse> showYamlTemplate =
        genForShowYamlTemplate();

    private static HttpRequestDef<ShowYamlTemplateRequest, ShowYamlTemplateResponse> genForShowYamlTemplate() {
        // basic
        HttpRequestDef.Builder<ShowYamlTemplateRequest, ShowYamlTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowYamlTemplateRequest.class, ShowYamlTemplateResponse.class)
                .withName("ShowYamlTemplate")
                .withUri("/v1/template/{job_id}/default-template")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowYamlTemplateRequest::getJobId, ShowYamlTemplateRequest::setJobId));
        builder.<String>withRequestField("default_host",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowYamlTemplateRequest::getDefaultHost, ShowYamlTemplateRequest::setDefaultHost));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopBuildJobRequest, StopBuildJobResponse> stopBuildJob = genForStopBuildJob();

    private static HttpRequestDef<StopBuildJobRequest, StopBuildJobResponse> genForStopBuildJob() {
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
            f -> f.withMarshaller(StopBuildJobRequest::getJobId, StopBuildJobRequest::setJobId));
        builder.<Integer>withRequestField("build_no",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(StopBuildJobRequest::getBuildNo, StopBuildJobRequest::setBuildNo));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBuildJobRequest, UpdateBuildJobResponse> updateBuildJob =
        genForUpdateBuildJob();

    private static HttpRequestDef<UpdateBuildJobRequest, UpdateBuildJobResponse> genForUpdateBuildJob() {
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
            f -> f.withMarshaller(UpdateBuildJobRequest::getBody, UpdateBuildJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNoticeRequest, UpdateNoticeResponse> updateNotice = genForUpdateNotice();

    private static HttpRequestDef<UpdateNoticeRequest, UpdateNoticeResponse> genForUpdateNotice() {
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
            f -> f.withMarshaller(UpdateNoticeRequest::getJobId, UpdateNoticeRequest::setJobId));
        builder.<UpdateNoticeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNoticeRequestBody.class),
            f -> f.withMarshaller(UpdateNoticeRequest::getBody, UpdateNoticeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadLogByRecordIdRequest, DownloadLogByRecordIdResponse> downloadLogByRecordId =
        genForDownloadLogByRecordId();

    private static HttpRequestDef<DownloadLogByRecordIdRequest, DownloadLogByRecordIdResponse> genForDownloadLogByRecordId() {
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
            f -> f.withMarshaller(DownloadLogByRecordIdRequest::getRecordId,
                DownloadLogByRecordIdRequest::setRecordId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFlowGraphRequest, ShowFlowGraphResponse> showFlowGraph =
        genForShowFlowGraph();

    private static HttpRequestDef<ShowFlowGraphRequest, ShowFlowGraphResponse> genForShowFlowGraph() {
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
            f -> f.withMarshaller(ShowFlowGraphRequest::getBuildFlowRecordId,
                ShowFlowGraphRequest::setBuildFlowRecordId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRecordInfoRequest, ShowRecordInfoResponse> showRecordInfo =
        genForShowRecordInfo();

    private static HttpRequestDef<ShowRecordInfoRequest, ShowRecordInfoResponse> genForShowRecordInfo() {
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
            f -> f.withMarshaller(ShowRecordInfoRequest::getJobId, ShowRecordInfoRequest::setJobId));
        builder.<Integer>withRequestField("build_no",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRecordInfoRequest::getBuildNo, ShowRecordInfoRequest::setBuildNo));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopJobRequest, StopJobResponse> stopJob = genForStopJob();

    private static HttpRequestDef<StopJobRequest, StopJobResponse> genForStopJob() {
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
            f -> f.withMarshaller(StopJobRequest::getBody, StopJobRequest::setBody));

        // response

        return builder.build();
    }

}

package com.huaweicloud.sdk.codeartsbuild.v3;

import com.huaweicloud.sdk.codeartsbuild.v3.model.*;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CodeArtsBuildMeta {

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

}

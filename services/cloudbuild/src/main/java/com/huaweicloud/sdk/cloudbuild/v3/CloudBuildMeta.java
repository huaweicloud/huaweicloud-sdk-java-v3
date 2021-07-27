package com.huaweicloud.sdk.cloudbuild.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.cloudbuild.v3.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class CloudBuildMeta {

    public static final HttpRequestDef<DownloadKeystoreRequest, DownloadKeystoreResponse> downloadKeystore = genFordownloadKeystore();

    private static HttpRequestDef<DownloadKeystoreRequest, DownloadKeystoreResponse> genFordownloadKeystore() {
        // basic
        HttpRequestDef.Builder<DownloadKeystoreRequest, DownloadKeystoreResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadKeystoreRequest.class, DownloadKeystoreResponse.class)
                .withName("DownloadKeystore")
                .withUri("/v3/keystore")
                .withContentType("application/json");

        // requests
        builder.withRequestField("file_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DownloadKeystoreRequest::getFileName, (req, v) -> {
                req.setFileName(v);
            })
        );
        builder.withRequestField("domain_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DownloadKeystoreRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            })
        );

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
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RunJobRequestBody.class,
            f -> f.withMarshaller(RunJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowJobListByProjectIdRequest, ShowJobListByProjectIdResponse> showJobListByProjectId = genForshowJobListByProjectId();

    private static HttpRequestDef<ShowJobListByProjectIdRequest, ShowJobListByProjectIdResponse> genForshowJobListByProjectId() {
        // basic
        HttpRequestDef.Builder<ShowJobListByProjectIdRequest, ShowJobListByProjectIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobListByProjectIdRequest.class, ShowJobListByProjectIdResponse.class)
                .withName("ShowJobListByProjectId")
                .withUri("/v3/{project_id}/jobs")
                .withContentType("application/json");

        // requests
        builder.withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowJobListByProjectIdRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            })
        );
        builder.withRequestField("page_index",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ShowJobListByProjectIdRequest::getPageIndex, (req, v) -> {
                req.setPageIndex(v);
            })
        );
        builder.withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ShowJobListByProjectIdRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowJobStatusRequest, ShowJobStatusResponse> showJobStatus = genForshowJobStatus();

    private static HttpRequestDef<ShowJobStatusRequest, ShowJobStatusResponse> genForshowJobStatus() {
        // basic
        HttpRequestDef.Builder<ShowJobStatusRequest, ShowJobStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobStatusRequest.class, ShowJobStatusResponse.class)
                .withName("ShowJobStatus")
                .withUri("/v3/jobs/{job_id}/status")
                .withContentType("application/json");

        // requests
        builder.withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowJobStatusRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowListHistoryRequest, ShowListHistoryResponse> showListHistory = genForshowListHistory();

    private static HttpRequestDef<ShowListHistoryRequest, ShowListHistoryResponse> genForshowListHistory() {
        // basic
        HttpRequestDef.Builder<ShowListHistoryRequest, ShowListHistoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowListHistoryRequest.class, ShowListHistoryResponse.class)
                .withName("ShowListHistory")
                .withUri("/v3/jobs/{job_id}/history")
                .withContentType("application/json");

        // requests
        builder.withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowListHistoryRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ShowListHistoryRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ShowListHistoryRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("interval",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ShowListHistoryRequest::getInterval, (req, v) -> {
                req.setInterval(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowListPeriodHistoryRequest, ShowListPeriodHistoryResponse> showListPeriodHistory = genForshowListPeriodHistory();

    private static HttpRequestDef<ShowListPeriodHistoryRequest, ShowListPeriodHistoryResponse> genForshowListPeriodHistory() {
        // basic
        HttpRequestDef.Builder<ShowListPeriodHistoryRequest, ShowListPeriodHistoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowListPeriodHistoryRequest.class, ShowListPeriodHistoryResponse.class)
                .withName("ShowListPeriodHistory")
                .withUri("/v3/jobs/{job_id}/period-history")
                .withContentType("application/json");

        // requests
        builder.withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowListPeriodHistoryRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ShowListPeriodHistoryRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ShowListPeriodHistoryRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowListPeriodHistoryRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowListPeriodHistoryRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );

        // response
        


        return builder.build();
    }

}

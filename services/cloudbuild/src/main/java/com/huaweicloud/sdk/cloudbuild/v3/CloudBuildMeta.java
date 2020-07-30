package com.huaweicloud.sdk.cloudbuild.v3;

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

    public static final HttpRequestDef<RunJobRequest, RunJobResponse> runJob = genForrunJob();

    private static HttpRequestDef<RunJobRequest, RunJobResponse> genForrunJob() {
        // basic
        HttpRequestDef.Builder<RunJobRequest, RunJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunJobRequest.class, RunJobResponse.class)
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
                .withUri("/v3/{project_id}/jobs");

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
                .withUri("/v3/jobs/{job_id}/status");

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

}

package com.huaweicloud.sdk.moderation.v1;

import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.core.http.HttpMethod;

import com.huaweicloud.sdk.moderation.v1.model.*;

@SuppressWarnings("unchecked")
public class ModerationMeta {

    public static final HttpRequestDef<RunCheckResultRequest, RunCheckResultResponse> runCheckResult = genForrunCheckResult();

    private static HttpRequestDef<RunCheckResultRequest, RunCheckResultResponse> genForrunCheckResult() {
        // basic
        HttpRequestDef.Builder<RunCheckResultRequest, RunCheckResultResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, RunCheckResultRequest.class, RunCheckResultResponse.class)
                .withUri("/v1.0/moderation/image/batch");

        // requests
        builder.withRequestField("job_id",
                LocationType.Query,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(RunCheckResultRequest::getJobId, (req, v) -> {
                    req.setJobId(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<RunCheckTaskJobsRequest, RunCheckTaskJobsResponse> runCheckTaskJobs = genForrunCheckTaskJobs();

    private static HttpRequestDef<RunCheckTaskJobsRequest, RunCheckTaskJobsResponse> genForrunCheckTaskJobs() {
        // basic
        HttpRequestDef.Builder<RunCheckTaskJobsRequest, RunCheckTaskJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, RunCheckTaskJobsRequest.class, RunCheckTaskJobsResponse.class)
                .withUri("/v1.0/moderation/image/batch/jobs");

        // requests
        builder.withRequestField("status",
                LocationType.Query,
                FieldExistence.NULL_IGNORE,
                RunCheckTaskJobsRequest.StatusEnum.class,
                f -> f.withMarshaller(RunCheckTaskJobsRequest::getStatus, (req, v) -> {
                    req.setStatus(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<RunImageBatchModerationRequest, RunImageBatchModerationResponse> runImageBatchModeration = genForrunImageBatchModeration();

    private static HttpRequestDef<RunImageBatchModerationRequest, RunImageBatchModerationResponse> genForrunImageBatchModeration() {
        // basic
        HttpRequestDef.Builder<RunImageBatchModerationRequest, RunImageBatchModerationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunImageBatchModerationRequest.class, RunImageBatchModerationResponse.class)
                .withUri("/v1.0/moderation/image/batch")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                ImageBatchModerationReq.class,
                f -> f.withMarshaller(RunImageBatchModerationRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<RunImageModerationRequest, RunImageModerationResponse> runImageModeration = genForrunImageModeration();

    private static HttpRequestDef<RunImageModerationRequest, RunImageModerationResponse> genForrunImageModeration() {
        // basic
        HttpRequestDef.Builder<RunImageModerationRequest, RunImageModerationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunImageModerationRequest.class, RunImageModerationResponse.class)
                .withUri("/v1.0/moderation/image")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                ImageDetectionReq.class,
                f -> f.withMarshaller(RunImageModerationRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<RunTaskSumbitRequest, RunTaskSumbitResponse> runTaskSumbit = genForrunTaskSumbit();

    private static HttpRequestDef<RunTaskSumbitRequest, RunTaskSumbitResponse> genForrunTaskSumbit() {
        // basic
        HttpRequestDef.Builder<RunTaskSumbitRequest, RunTaskSumbitResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunTaskSumbitRequest.class, RunTaskSumbitResponse.class)
                .withUri("/v1.0/moderation/image/batch/jobs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                TaskSumbitReq.class,
                f -> f.withMarshaller(RunTaskSumbitRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

    public static final HttpRequestDef<RunTextModerationRequest, RunTextModerationResponse> runTextModeration = genForrunTextModeration();

    private static HttpRequestDef<RunTextModerationRequest, RunTextModerationResponse> genForrunTextModeration() {
        // basic
        HttpRequestDef.Builder<RunTextModerationRequest, RunTextModerationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunTextModerationRequest.class, RunTextModerationResponse.class)
                .withUri("/v1.0/moderation/text")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
                LocationType.Body,
                FieldExistence.NON_NULL_NON_EMPTY,
                TextDetectionReq.class,
                f -> f.withMarshaller(RunTextModerationRequest::getBody, (req, v) -> {
                    req.setBody(v);
                })
        );

        // response

        return builder.build();

    }

}


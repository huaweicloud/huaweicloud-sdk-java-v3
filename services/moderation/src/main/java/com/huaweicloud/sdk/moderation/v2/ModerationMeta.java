package com.huaweicloud.sdk.moderation.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.moderation.v2.model.*;

@SuppressWarnings("unchecked")
public class ModerationMeta {

    public static final HttpRequestDef<RunCheckResultRequest, RunCheckResultResponse> runCheckResult =
        genForrunCheckResult();

    private static HttpRequestDef<RunCheckResultRequest, RunCheckResultResponse> genForrunCheckResult() {
        // basic
        HttpRequestDef.Builder<RunCheckResultRequest, RunCheckResultResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, RunCheckResultRequest.class, RunCheckResultResponse.class)
                .withName("RunCheckResult")
                .withUri("/v2/{project_id}/moderation/image/batch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunCheckResultRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunCheckTaskJobsRequest, RunCheckTaskJobsResponse> runCheckTaskJobs =
        genForrunCheckTaskJobs();

    private static HttpRequestDef<RunCheckTaskJobsRequest, RunCheckTaskJobsResponse> genForrunCheckTaskJobs() {
        // basic
        HttpRequestDef.Builder<RunCheckTaskJobsRequest, RunCheckTaskJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, RunCheckTaskJobsRequest.class, RunCheckTaskJobsResponse.class)
                .withName("RunCheckTaskJobs")
                .withUri("/v2/{project_id}/moderation/image/batch/jobs")
                .withContentType("application/json");

        // requests
        builder.<RunCheckTaskJobsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RunCheckTaskJobsRequest.StatusEnum.class),
            f -> f.withMarshaller(RunCheckTaskJobsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(RunCheckTaskJobsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(RunCheckTaskJobsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunImageBatchModerationRequest, RunImageBatchModerationResponse> runImageBatchModeration =
        genForrunImageBatchModeration();

    private static HttpRequestDef<RunImageBatchModerationRequest, RunImageBatchModerationResponse> genForrunImageBatchModeration() {
        // basic
        HttpRequestDef.Builder<RunImageBatchModerationRequest, RunImageBatchModerationResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RunImageBatchModerationRequest.class, RunImageBatchModerationResponse.class)
            .withName("RunImageBatchModeration")
            .withUri("/v2/{project_id}/moderation/image/batch")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ImageBatchModerationReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImageBatchModerationReq.class),
            f -> f.withMarshaller(RunImageBatchModerationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunImageModerationRequest, RunImageModerationResponse> runImageModeration =
        genForrunImageModeration();

    private static HttpRequestDef<RunImageModerationRequest, RunImageModerationResponse> genForrunImageModeration() {
        // basic
        HttpRequestDef.Builder<RunImageModerationRequest, RunImageModerationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunImageModerationRequest.class, RunImageModerationResponse.class)
                .withName("RunImageModeration")
                .withUri("/v2/{project_id}/moderation/image")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ImageDetectionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImageDetectionReq.class),
            f -> f.withMarshaller(RunImageModerationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunModerationAudioRequest, RunModerationAudioResponse> runModerationAudio =
        genForrunModerationAudio();

    private static HttpRequestDef<RunModerationAudioRequest, RunModerationAudioResponse> genForrunModerationAudio() {
        // basic
        HttpRequestDef.Builder<RunModerationAudioRequest, RunModerationAudioResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunModerationAudioRequest.class, RunModerationAudioResponse.class)
                .withName("RunModerationAudio")
                .withUri("/v2/{project_id}/moderation/voice")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<RunModerationAudioRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunModerationAudioRequestBody.class),
            f -> f.withMarshaller(RunModerationAudioRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunTaskSumbitRequest, RunTaskSumbitResponse> runTaskSumbit =
        genForrunTaskSumbit();

    private static HttpRequestDef<RunTaskSumbitRequest, RunTaskSumbitResponse> genForrunTaskSumbit() {
        // basic
        HttpRequestDef.Builder<RunTaskSumbitRequest, RunTaskSumbitResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunTaskSumbitRequest.class, RunTaskSumbitResponse.class)
                .withName("RunTaskSumbit")
                .withUri("/v2/{project_id}/moderation/image/batch/jobs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<TaskSumbitReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TaskSumbitReq.class),
            f -> f.withMarshaller(RunTaskSumbitRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunTextModerationRequest, RunTextModerationResponse> runTextModeration =
        genForrunTextModeration();

    private static HttpRequestDef<RunTextModerationRequest, RunTextModerationResponse> genForrunTextModeration() {
        // basic
        HttpRequestDef.Builder<RunTextModerationRequest, RunTextModerationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunTextModerationRequest.class, RunTextModerationResponse.class)
                .withName("RunTextModeration")
                .withUri("/v2/{project_id}/moderation/text")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<TextDetectionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TextDetectionReq.class),
            f -> f.withMarshaller(RunTextModerationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}

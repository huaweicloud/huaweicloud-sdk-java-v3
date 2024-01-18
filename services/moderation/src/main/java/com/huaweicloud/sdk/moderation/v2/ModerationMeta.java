package com.huaweicloud.sdk.moderation.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.moderation.v2.model.ImageBatchModerationReq;
import com.huaweicloud.sdk.moderation.v2.model.ImageDetectionReq;
import com.huaweicloud.sdk.moderation.v2.model.RunCheckResultRequest;
import com.huaweicloud.sdk.moderation.v2.model.RunCheckResultResponse;
import com.huaweicloud.sdk.moderation.v2.model.RunCheckTaskJobsRequest;
import com.huaweicloud.sdk.moderation.v2.model.RunCheckTaskJobsResponse;
import com.huaweicloud.sdk.moderation.v2.model.RunImageBatchModerationRequest;
import com.huaweicloud.sdk.moderation.v2.model.RunImageBatchModerationResponse;
import com.huaweicloud.sdk.moderation.v2.model.RunImageModerationRequest;
import com.huaweicloud.sdk.moderation.v2.model.RunImageModerationResponse;
import com.huaweicloud.sdk.moderation.v2.model.RunModerationAudioRequest;
import com.huaweicloud.sdk.moderation.v2.model.RunModerationAudioRequestBody;
import com.huaweicloud.sdk.moderation.v2.model.RunModerationAudioResponse;
import com.huaweicloud.sdk.moderation.v2.model.RunTaskSumbitRequest;
import com.huaweicloud.sdk.moderation.v2.model.RunTaskSumbitResponse;
import com.huaweicloud.sdk.moderation.v2.model.RunTextModerationRequest;
import com.huaweicloud.sdk.moderation.v2.model.RunTextModerationResponse;
import com.huaweicloud.sdk.moderation.v2.model.TaskSumbitReq;
import com.huaweicloud.sdk.moderation.v2.model.TextDetectionReq;

@SuppressWarnings("unchecked")
public class ModerationMeta {

    public static final HttpRequestDef<RunCheckResultRequest, RunCheckResultResponse> runCheckResult =
        genForRunCheckResult();

    private static HttpRequestDef<RunCheckResultRequest, RunCheckResultResponse> genForRunCheckResult() {
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
            f -> f.withMarshaller(RunCheckResultRequest::getJobId, RunCheckResultRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunCheckTaskJobsRequest, RunCheckTaskJobsResponse> runCheckTaskJobs =
        genForRunCheckTaskJobs();

    private static HttpRequestDef<RunCheckTaskJobsRequest, RunCheckTaskJobsResponse> genForRunCheckTaskJobs() {
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
            f -> f.withMarshaller(RunCheckTaskJobsRequest::getStatus, RunCheckTaskJobsRequest::setStatus));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(RunCheckTaskJobsRequest::getOffset, RunCheckTaskJobsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(RunCheckTaskJobsRequest::getLimit, RunCheckTaskJobsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunImageBatchModerationRequest, RunImageBatchModerationResponse> runImageBatchModeration =
        genForRunImageBatchModeration();

    private static HttpRequestDef<RunImageBatchModerationRequest, RunImageBatchModerationResponse> genForRunImageBatchModeration() {
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
            f -> f.withMarshaller(RunImageBatchModerationRequest::getBody, RunImageBatchModerationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunImageModerationRequest, RunImageModerationResponse> runImageModeration =
        genForRunImageModeration();

    private static HttpRequestDef<RunImageModerationRequest, RunImageModerationResponse> genForRunImageModeration() {
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
            f -> f.withMarshaller(RunImageModerationRequest::getBody, RunImageModerationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunModerationAudioRequest, RunModerationAudioResponse> runModerationAudio =
        genForRunModerationAudio();

    private static HttpRequestDef<RunModerationAudioRequest, RunModerationAudioResponse> genForRunModerationAudio() {
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
            f -> f.withMarshaller(RunModerationAudioRequest::getBody, RunModerationAudioRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunTaskSumbitRequest, RunTaskSumbitResponse> runTaskSumbit =
        genForRunTaskSumbit();

    private static HttpRequestDef<RunTaskSumbitRequest, RunTaskSumbitResponse> genForRunTaskSumbit() {
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
            f -> f.withMarshaller(RunTaskSumbitRequest::getBody, RunTaskSumbitRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunTextModerationRequest, RunTextModerationResponse> runTextModeration =
        genForRunTextModeration();

    private static HttpRequestDef<RunTextModerationRequest, RunTextModerationResponse> genForRunTextModeration() {
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
            f -> f.withMarshaller(RunTextModerationRequest::getBody, RunTextModerationRequest::setBody));

        // response

        return builder.build();
    }

}

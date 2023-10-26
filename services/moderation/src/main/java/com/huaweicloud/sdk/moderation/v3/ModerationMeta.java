package com.huaweicloud.sdk.moderation.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.moderation.v3.model.AudioCreateRequest;
import com.huaweicloud.sdk.moderation.v3.model.AudioStreamCreateRequest;
import com.huaweicloud.sdk.moderation.v3.model.CheckImageModerationRequest;
import com.huaweicloud.sdk.moderation.v3.model.CheckImageModerationResponse;
import com.huaweicloud.sdk.moderation.v3.model.ImageDetectionReq;
import com.huaweicloud.sdk.moderation.v3.model.RunCloseAudioStreamModerationJobRequest;
import com.huaweicloud.sdk.moderation.v3.model.RunCloseAudioStreamModerationJobResponse;
import com.huaweicloud.sdk.moderation.v3.model.RunCloseVideoStreamModerationJobRequest;
import com.huaweicloud.sdk.moderation.v3.model.RunCloseVideoStreamModerationJobResponse;
import com.huaweicloud.sdk.moderation.v3.model.RunCreateAudioModerationJobRequest;
import com.huaweicloud.sdk.moderation.v3.model.RunCreateAudioModerationJobResponse;
import com.huaweicloud.sdk.moderation.v3.model.RunCreateAudioStreamModerationJobRequest;
import com.huaweicloud.sdk.moderation.v3.model.RunCreateAudioStreamModerationJobResponse;
import com.huaweicloud.sdk.moderation.v3.model.RunCreateVideoModerationJobRequest;
import com.huaweicloud.sdk.moderation.v3.model.RunCreateVideoModerationJobResponse;
import com.huaweicloud.sdk.moderation.v3.model.RunCreateVideoStreamModerationJobRequest;
import com.huaweicloud.sdk.moderation.v3.model.RunCreateVideoStreamModerationJobResponse;
import com.huaweicloud.sdk.moderation.v3.model.RunQueryAudioModerationJobRequest;
import com.huaweicloud.sdk.moderation.v3.model.RunQueryAudioModerationJobResponse;
import com.huaweicloud.sdk.moderation.v3.model.RunQueryVideoModerationJobRequest;
import com.huaweicloud.sdk.moderation.v3.model.RunQueryVideoModerationJobResponse;
import com.huaweicloud.sdk.moderation.v3.model.RunTextModerationRequest;
import com.huaweicloud.sdk.moderation.v3.model.RunTextModerationResponse;
import com.huaweicloud.sdk.moderation.v3.model.TextDetectionReq;
import com.huaweicloud.sdk.moderation.v3.model.VideoCreateRequest;
import com.huaweicloud.sdk.moderation.v3.model.VideoStreamCreateRequest;

@SuppressWarnings("unchecked")
public class ModerationMeta {

    public static final HttpRequestDef<CheckImageModerationRequest, CheckImageModerationResponse> checkImageModeration =
        genForcheckImageModeration();

    private static HttpRequestDef<CheckImageModerationRequest, CheckImageModerationResponse> genForcheckImageModeration() {
        // basic
        HttpRequestDef.Builder<CheckImageModerationRequest, CheckImageModerationResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CheckImageModerationRequest.class, CheckImageModerationResponse.class)
            .withName("CheckImageModeration")
            .withUri("/v3/{project_id}/moderation/image")
            .withContentType("application/json");

        // requests
        builder.<ImageDetectionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImageDetectionReq.class),
            f -> f.withMarshaller(CheckImageModerationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunCloseAudioStreamModerationJobRequest, RunCloseAudioStreamModerationJobResponse> runCloseAudioStreamModerationJob =
        genForrunCloseAudioStreamModerationJob();

    private static HttpRequestDef<RunCloseAudioStreamModerationJobRequest, RunCloseAudioStreamModerationJobResponse> genForrunCloseAudioStreamModerationJob() {
        // basic
        HttpRequestDef.Builder<RunCloseAudioStreamModerationJobRequest, RunCloseAudioStreamModerationJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RunCloseAudioStreamModerationJobRequest.class,
                    RunCloseAudioStreamModerationJobResponse.class)
                .withName("RunCloseAudioStreamModerationJob")
                .withUri("/v3/{project_id}/moderation/audio-stream/jobs/stop/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunCloseAudioStreamModerationJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunCloseVideoStreamModerationJobRequest, RunCloseVideoStreamModerationJobResponse> runCloseVideoStreamModerationJob =
        genForrunCloseVideoStreamModerationJob();

    private static HttpRequestDef<RunCloseVideoStreamModerationJobRequest, RunCloseVideoStreamModerationJobResponse> genForrunCloseVideoStreamModerationJob() {
        // basic
        HttpRequestDef.Builder<RunCloseVideoStreamModerationJobRequest, RunCloseVideoStreamModerationJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RunCloseVideoStreamModerationJobRequest.class,
                    RunCloseVideoStreamModerationJobResponse.class)
                .withName("RunCloseVideoStreamModerationJob")
                .withUri("/v3/{project_id}/moderation/video-stream/jobs/stop/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunCloseVideoStreamModerationJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunCreateAudioModerationJobRequest, RunCreateAudioModerationJobResponse> runCreateAudioModerationJob =
        genForrunCreateAudioModerationJob();

    private static HttpRequestDef<RunCreateAudioModerationJobRequest, RunCreateAudioModerationJobResponse> genForrunCreateAudioModerationJob() {
        // basic
        HttpRequestDef.Builder<RunCreateAudioModerationJobRequest, RunCreateAudioModerationJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RunCreateAudioModerationJobRequest.class,
                    RunCreateAudioModerationJobResponse.class)
                .withName("RunCreateAudioModerationJob")
                .withUri("/v3/{project_id}/moderation/audio/jobs")
                .withContentType("application/json");

        // requests
        builder.<AudioCreateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AudioCreateRequest.class),
            f -> f.withMarshaller(RunCreateAudioModerationJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunCreateAudioStreamModerationJobRequest, RunCreateAudioStreamModerationJobResponse> runCreateAudioStreamModerationJob =
        genForrunCreateAudioStreamModerationJob();

    private static HttpRequestDef<RunCreateAudioStreamModerationJobRequest, RunCreateAudioStreamModerationJobResponse> genForrunCreateAudioStreamModerationJob() {
        // basic
        HttpRequestDef.Builder<RunCreateAudioStreamModerationJobRequest, RunCreateAudioStreamModerationJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RunCreateAudioStreamModerationJobRequest.class,
                    RunCreateAudioStreamModerationJobResponse.class)
                .withName("RunCreateAudioStreamModerationJob")
                .withUri("/v3/{project_id}/moderation/audio-stream/jobs")
                .withContentType("application/json");

        // requests
        builder.<AudioStreamCreateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AudioStreamCreateRequest.class),
            f -> f.withMarshaller(RunCreateAudioStreamModerationJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunCreateVideoModerationJobRequest, RunCreateVideoModerationJobResponse> runCreateVideoModerationJob =
        genForrunCreateVideoModerationJob();

    private static HttpRequestDef<RunCreateVideoModerationJobRequest, RunCreateVideoModerationJobResponse> genForrunCreateVideoModerationJob() {
        // basic
        HttpRequestDef.Builder<RunCreateVideoModerationJobRequest, RunCreateVideoModerationJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RunCreateVideoModerationJobRequest.class,
                    RunCreateVideoModerationJobResponse.class)
                .withName("RunCreateVideoModerationJob")
                .withUri("/v3/{project_id}/moderation/video/jobs")
                .withContentType("application/json");

        // requests
        builder.<VideoCreateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VideoCreateRequest.class),
            f -> f.withMarshaller(RunCreateVideoModerationJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunCreateVideoStreamModerationJobRequest, RunCreateVideoStreamModerationJobResponse> runCreateVideoStreamModerationJob =
        genForrunCreateVideoStreamModerationJob();

    private static HttpRequestDef<RunCreateVideoStreamModerationJobRequest, RunCreateVideoStreamModerationJobResponse> genForrunCreateVideoStreamModerationJob() {
        // basic
        HttpRequestDef.Builder<RunCreateVideoStreamModerationJobRequest, RunCreateVideoStreamModerationJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RunCreateVideoStreamModerationJobRequest.class,
                    RunCreateVideoStreamModerationJobResponse.class)
                .withName("RunCreateVideoStreamModerationJob")
                .withUri("/v3/{project_id}/moderation/video-stream/jobs")
                .withContentType("application/json");

        // requests
        builder.<VideoStreamCreateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VideoStreamCreateRequest.class),
            f -> f.withMarshaller(RunCreateVideoStreamModerationJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunQueryAudioModerationJobRequest, RunQueryAudioModerationJobResponse> runQueryAudioModerationJob =
        genForrunQueryAudioModerationJob();

    private static HttpRequestDef<RunQueryAudioModerationJobRequest, RunQueryAudioModerationJobResponse> genForrunQueryAudioModerationJob() {
        // basic
        HttpRequestDef.Builder<RunQueryAudioModerationJobRequest, RunQueryAudioModerationJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    RunQueryAudioModerationJobRequest.class,
                    RunQueryAudioModerationJobResponse.class)
                .withName("RunQueryAudioModerationJob")
                .withUri("/v3/{project_id}/moderation/audio/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunQueryAudioModerationJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunQueryVideoModerationJobRequest, RunQueryVideoModerationJobResponse> runQueryVideoModerationJob =
        genForrunQueryVideoModerationJob();

    private static HttpRequestDef<RunQueryVideoModerationJobRequest, RunQueryVideoModerationJobResponse> genForrunQueryVideoModerationJob() {
        // basic
        HttpRequestDef.Builder<RunQueryVideoModerationJobRequest, RunQueryVideoModerationJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    RunQueryVideoModerationJobRequest.class,
                    RunQueryVideoModerationJobResponse.class)
                .withName("RunQueryVideoModerationJob")
                .withUri("/v3/{project_id}/moderation/video/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunQueryVideoModerationJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
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
                .withUri("/v3/{project_id}/moderation/text")
                .withContentType("application/json");

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

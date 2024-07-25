package com.huaweicloud.sdk.moderation.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.moderation.v3.model.AudioCreateRequest;
import com.huaweicloud.sdk.moderation.v3.model.AudioStreamCreateRequest;
import com.huaweicloud.sdk.moderation.v3.model.BatchCheckImageSyncRequest;
import com.huaweicloud.sdk.moderation.v3.model.BatchCheckImageSyncResponse;
import com.huaweicloud.sdk.moderation.v3.model.CheckImageModerationRequest;
import com.huaweicloud.sdk.moderation.v3.model.CheckImageModerationResponse;
import com.huaweicloud.sdk.moderation.v3.model.DocumentCreateRequest;
import com.huaweicloud.sdk.moderation.v3.model.ImageBatchSyncReq;
import com.huaweicloud.sdk.moderation.v3.model.ImageDetectionReq;
import com.huaweicloud.sdk.moderation.v3.model.RunCloseAudioStreamModerationJobRequest;
import com.huaweicloud.sdk.moderation.v3.model.RunCloseAudioStreamModerationJobResponse;
import com.huaweicloud.sdk.moderation.v3.model.RunCloseVideoStreamModerationJobRequest;
import com.huaweicloud.sdk.moderation.v3.model.RunCloseVideoStreamModerationJobResponse;
import com.huaweicloud.sdk.moderation.v3.model.RunCreateAudioModerationJobRequest;
import com.huaweicloud.sdk.moderation.v3.model.RunCreateAudioModerationJobResponse;
import com.huaweicloud.sdk.moderation.v3.model.RunCreateAudioStreamModerationJobRequest;
import com.huaweicloud.sdk.moderation.v3.model.RunCreateAudioStreamModerationJobResponse;
import com.huaweicloud.sdk.moderation.v3.model.RunCreateDocumentModerationJobRequest;
import com.huaweicloud.sdk.moderation.v3.model.RunCreateDocumentModerationJobResponse;
import com.huaweicloud.sdk.moderation.v3.model.RunCreateVideoModerationJobRequest;
import com.huaweicloud.sdk.moderation.v3.model.RunCreateVideoModerationJobResponse;
import com.huaweicloud.sdk.moderation.v3.model.RunCreateVideoStreamModerationJobRequest;
import com.huaweicloud.sdk.moderation.v3.model.RunCreateVideoStreamModerationJobResponse;
import com.huaweicloud.sdk.moderation.v3.model.RunQueryAudioModerationJobRequest;
import com.huaweicloud.sdk.moderation.v3.model.RunQueryAudioModerationJobResponse;
import com.huaweicloud.sdk.moderation.v3.model.RunQueryDocumentModerationJobRequest;
import com.huaweicloud.sdk.moderation.v3.model.RunQueryDocumentModerationJobResponse;
import com.huaweicloud.sdk.moderation.v3.model.RunQueryVideoModerationJobRequest;
import com.huaweicloud.sdk.moderation.v3.model.RunQueryVideoModerationJobResponse;
import com.huaweicloud.sdk.moderation.v3.model.RunTextModerationRequest;
import com.huaweicloud.sdk.moderation.v3.model.RunTextModerationResponse;
import com.huaweicloud.sdk.moderation.v3.model.TextDetectionReq;
import com.huaweicloud.sdk.moderation.v3.model.VideoCreateRequest;
import com.huaweicloud.sdk.moderation.v3.model.VideoStreamCreateRequest;

@SuppressWarnings("unchecked")
public class ModerationMeta {

    public static final HttpRequestDef<BatchCheckImageSyncRequest, BatchCheckImageSyncResponse> batchCheckImageSync =
        genForBatchCheckImageSync();

    private static HttpRequestDef<BatchCheckImageSyncRequest, BatchCheckImageSyncResponse> genForBatchCheckImageSync() {
        // basic
        HttpRequestDef.Builder<BatchCheckImageSyncRequest, BatchCheckImageSyncResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCheckImageSyncRequest.class, BatchCheckImageSyncResponse.class)
                .withName("BatchCheckImageSync")
                .withUri("/v3/{project_id}/moderation/image/batch")
                .withContentType("application/json");

        // requests
        builder.<ImageBatchSyncReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImageBatchSyncReq.class),
            f -> f.withMarshaller(BatchCheckImageSyncRequest::getBody, BatchCheckImageSyncRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckImageModerationRequest, CheckImageModerationResponse> checkImageModeration =
        genForCheckImageModeration();

    private static HttpRequestDef<CheckImageModerationRequest, CheckImageModerationResponse> genForCheckImageModeration() {
        // basic
        HttpRequestDef.Builder<CheckImageModerationRequest, CheckImageModerationResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CheckImageModerationRequest.class, CheckImageModerationResponse.class)
            .withName("CheckImageModeration")
            .withUri("/v3/{project_id}/moderation/image")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckImageModerationRequest::getEnterpriseProjectId,
                CheckImageModerationRequest::setEnterpriseProjectId));
        builder.<ImageDetectionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImageDetectionReq.class),
            f -> f.withMarshaller(CheckImageModerationRequest::getBody, CheckImageModerationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunCloseAudioStreamModerationJobRequest, RunCloseAudioStreamModerationJobResponse> runCloseAudioStreamModerationJob =
        genForRunCloseAudioStreamModerationJob();

    private static HttpRequestDef<RunCloseAudioStreamModerationJobRequest, RunCloseAudioStreamModerationJobResponse> genForRunCloseAudioStreamModerationJob() {
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
            f -> f.withMarshaller(RunCloseAudioStreamModerationJobRequest::getJobId,
                RunCloseAudioStreamModerationJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunCloseVideoStreamModerationJobRequest, RunCloseVideoStreamModerationJobResponse> runCloseVideoStreamModerationJob =
        genForRunCloseVideoStreamModerationJob();

    private static HttpRequestDef<RunCloseVideoStreamModerationJobRequest, RunCloseVideoStreamModerationJobResponse> genForRunCloseVideoStreamModerationJob() {
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
            f -> f.withMarshaller(RunCloseVideoStreamModerationJobRequest::getJobId,
                RunCloseVideoStreamModerationJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunCreateAudioModerationJobRequest, RunCreateAudioModerationJobResponse> runCreateAudioModerationJob =
        genForRunCreateAudioModerationJob();

    private static HttpRequestDef<RunCreateAudioModerationJobRequest, RunCreateAudioModerationJobResponse> genForRunCreateAudioModerationJob() {
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
            f -> f.withMarshaller(RunCreateAudioModerationJobRequest::getBody,
                RunCreateAudioModerationJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunCreateAudioStreamModerationJobRequest, RunCreateAudioStreamModerationJobResponse> runCreateAudioStreamModerationJob =
        genForRunCreateAudioStreamModerationJob();

    private static HttpRequestDef<RunCreateAudioStreamModerationJobRequest, RunCreateAudioStreamModerationJobResponse> genForRunCreateAudioStreamModerationJob() {
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
            f -> f.withMarshaller(RunCreateAudioStreamModerationJobRequest::getBody,
                RunCreateAudioStreamModerationJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunCreateDocumentModerationJobRequest, RunCreateDocumentModerationJobResponse> runCreateDocumentModerationJob =
        genForRunCreateDocumentModerationJob();

    private static HttpRequestDef<RunCreateDocumentModerationJobRequest, RunCreateDocumentModerationJobResponse> genForRunCreateDocumentModerationJob() {
        // basic
        HttpRequestDef.Builder<RunCreateDocumentModerationJobRequest, RunCreateDocumentModerationJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RunCreateDocumentModerationJobRequest.class,
                    RunCreateDocumentModerationJobResponse.class)
                .withName("RunCreateDocumentModerationJob")
                .withUri("/v3/{project_id}/moderation/document/jobs")
                .withContentType("application/json");

        // requests
        builder.<DocumentCreateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DocumentCreateRequest.class),
            f -> f.withMarshaller(RunCreateDocumentModerationJobRequest::getBody,
                RunCreateDocumentModerationJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunCreateVideoModerationJobRequest, RunCreateVideoModerationJobResponse> runCreateVideoModerationJob =
        genForRunCreateVideoModerationJob();

    private static HttpRequestDef<RunCreateVideoModerationJobRequest, RunCreateVideoModerationJobResponse> genForRunCreateVideoModerationJob() {
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
            f -> f.withMarshaller(RunCreateVideoModerationJobRequest::getBody,
                RunCreateVideoModerationJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunCreateVideoStreamModerationJobRequest, RunCreateVideoStreamModerationJobResponse> runCreateVideoStreamModerationJob =
        genForRunCreateVideoStreamModerationJob();

    private static HttpRequestDef<RunCreateVideoStreamModerationJobRequest, RunCreateVideoStreamModerationJobResponse> genForRunCreateVideoStreamModerationJob() {
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
            f -> f.withMarshaller(RunCreateVideoStreamModerationJobRequest::getBody,
                RunCreateVideoStreamModerationJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunQueryAudioModerationJobRequest, RunQueryAudioModerationJobResponse> runQueryAudioModerationJob =
        genForRunQueryAudioModerationJob();

    private static HttpRequestDef<RunQueryAudioModerationJobRequest, RunQueryAudioModerationJobResponse> genForRunQueryAudioModerationJob() {
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
            f -> f.withMarshaller(RunQueryAudioModerationJobRequest::getJobId,
                RunQueryAudioModerationJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunQueryDocumentModerationJobRequest, RunQueryDocumentModerationJobResponse> runQueryDocumentModerationJob =
        genForRunQueryDocumentModerationJob();

    private static HttpRequestDef<RunQueryDocumentModerationJobRequest, RunQueryDocumentModerationJobResponse> genForRunQueryDocumentModerationJob() {
        // basic
        HttpRequestDef.Builder<RunQueryDocumentModerationJobRequest, RunQueryDocumentModerationJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    RunQueryDocumentModerationJobRequest.class,
                    RunQueryDocumentModerationJobResponse.class)
                .withName("RunQueryDocumentModerationJob")
                .withUri("/v3/{project_id}/moderation/document/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunQueryDocumentModerationJobRequest::getJobId,
                RunQueryDocumentModerationJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunQueryVideoModerationJobRequest, RunQueryVideoModerationJobResponse> runQueryVideoModerationJob =
        genForRunQueryVideoModerationJob();

    private static HttpRequestDef<RunQueryVideoModerationJobRequest, RunQueryVideoModerationJobResponse> genForRunQueryVideoModerationJob() {
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
            f -> f.withMarshaller(RunQueryVideoModerationJobRequest::getJobId,
                RunQueryVideoModerationJobRequest::setJobId));

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
                .withUri("/v3/{project_id}/moderation/text")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunTextModerationRequest::getEnterpriseProjectId,
                RunTextModerationRequest::setEnterpriseProjectId));
        builder.<TextDetectionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TextDetectionReq.class),
            f -> f.withMarshaller(RunTextModerationRequest::getBody, RunTextModerationRequest::setBody));

        // response

        return builder.build();
    }

}

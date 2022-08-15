package com.huaweicloud.sdk.moderation.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.moderation.v3.model.*;

@SuppressWarnings("unchecked")
public class ModerationMeta {

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

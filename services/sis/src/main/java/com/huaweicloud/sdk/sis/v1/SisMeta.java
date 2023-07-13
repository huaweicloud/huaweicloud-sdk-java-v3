package com.huaweicloud.sdk.sis.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.sis.v1.model.CollectTranscriberJobRequest;
import com.huaweicloud.sdk.sis.v1.model.CollectTranscriberJobResponse;
import com.huaweicloud.sdk.sis.v1.model.CreateVocabularyRequest;
import com.huaweicloud.sdk.sis.v1.model.CreateVocabularyResponse;
import com.huaweicloud.sdk.sis.v1.model.DeleteVocabularyRequest;
import com.huaweicloud.sdk.sis.v1.model.DeleteVocabularyResponse;
import com.huaweicloud.sdk.sis.v1.model.PostCreateVocabReq;
import com.huaweicloud.sdk.sis.v1.model.PostCustomTTSReq;
import com.huaweicloud.sdk.sis.v1.model.PostMultiModalAssessmentReq;
import com.huaweicloud.sdk.sis.v1.model.PostShortAudioAssessmentReq;
import com.huaweicloud.sdk.sis.v1.model.PostShortAudioReq;
import com.huaweicloud.sdk.sis.v1.model.PostTranscriberJobs;
import com.huaweicloud.sdk.sis.v1.model.PushTranscriberJobsRequest;
import com.huaweicloud.sdk.sis.v1.model.PushTranscriberJobsResponse;
import com.huaweicloud.sdk.sis.v1.model.PutUpdateVocabReq;
import com.huaweicloud.sdk.sis.v1.model.RecognizeFlashAsrRequest;
import com.huaweicloud.sdk.sis.v1.model.RecognizeFlashAsrResponse;
import com.huaweicloud.sdk.sis.v1.model.RecognizeShortAudioRequest;
import com.huaweicloud.sdk.sis.v1.model.RecognizeShortAudioResponse;
import com.huaweicloud.sdk.sis.v1.model.RunAudioAssessmentRequest;
import com.huaweicloud.sdk.sis.v1.model.RunAudioAssessmentResponse;
import com.huaweicloud.sdk.sis.v1.model.RunMultiModalAssessmentRequest;
import com.huaweicloud.sdk.sis.v1.model.RunMultiModalAssessmentResponse;
import com.huaweicloud.sdk.sis.v1.model.RunTtsRequest;
import com.huaweicloud.sdk.sis.v1.model.RunTtsResponse;
import com.huaweicloud.sdk.sis.v1.model.ShowVocabulariesParams;
import com.huaweicloud.sdk.sis.v1.model.ShowVocabulariesRequest;
import com.huaweicloud.sdk.sis.v1.model.ShowVocabulariesResponse;
import com.huaweicloud.sdk.sis.v1.model.ShowVocabularyRequest;
import com.huaweicloud.sdk.sis.v1.model.ShowVocabularyResponse;
import com.huaweicloud.sdk.sis.v1.model.UpdateVocabularyRequest;
import com.huaweicloud.sdk.sis.v1.model.UpdateVocabularyResponse;

@SuppressWarnings("unchecked")
public class SisMeta {

    public static final HttpRequestDef<CollectTranscriberJobRequest, CollectTranscriberJobResponse> collectTranscriberJob =
        genForcollectTranscriberJob();

    private static HttpRequestDef<CollectTranscriberJobRequest, CollectTranscriberJobResponse> genForcollectTranscriberJob() {
        // basic
        HttpRequestDef.Builder<CollectTranscriberJobRequest, CollectTranscriberJobResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, CollectTranscriberJobRequest.class, CollectTranscriberJobResponse.class)
            .withName("CollectTranscriberJob")
            .withUri("/v1/{project_id}/asr/transcriber/jobs/{job_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CollectTranscriberJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVocabularyRequest, CreateVocabularyResponse> createVocabulary =
        genForcreateVocabulary();

    private static HttpRequestDef<CreateVocabularyRequest, CreateVocabularyResponse> genForcreateVocabulary() {
        // basic
        HttpRequestDef.Builder<CreateVocabularyRequest, CreateVocabularyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVocabularyRequest.class, CreateVocabularyResponse.class)
                .withName("CreateVocabulary")
                .withUri("/v1/{project_id}/asr/vocabularies")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<PostCreateVocabReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostCreateVocabReq.class),
            f -> f.withMarshaller(CreateVocabularyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVocabularyRequest, DeleteVocabularyResponse> deleteVocabulary =
        genFordeleteVocabulary();

    private static HttpRequestDef<DeleteVocabularyRequest, DeleteVocabularyResponse> genFordeleteVocabulary() {
        // basic
        HttpRequestDef.Builder<DeleteVocabularyRequest, DeleteVocabularyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteVocabularyRequest.class, DeleteVocabularyResponse.class)
                .withName("DeleteVocabulary")
                .withUri("/v1/{project_id}/asr/vocabularies/{vocabulary_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vocabulary_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVocabularyRequest::getVocabularyId, (req, v) -> {
                req.setVocabularyId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PushTranscriberJobsRequest, PushTranscriberJobsResponse> pushTranscriberJobs =
        genForpushTranscriberJobs();

    private static HttpRequestDef<PushTranscriberJobsRequest, PushTranscriberJobsResponse> genForpushTranscriberJobs() {
        // basic
        HttpRequestDef.Builder<PushTranscriberJobsRequest, PushTranscriberJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PushTranscriberJobsRequest.class, PushTranscriberJobsResponse.class)
                .withName("PushTranscriberJobs")
                .withUri("/v1/{project_id}/asr/transcriber/jobs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Enterprise-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PushTranscriberJobsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<PostTranscriberJobs>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PostTranscriberJobs.class),
            f -> f.withMarshaller(PushTranscriberJobsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeFlashAsrRequest, RecognizeFlashAsrResponse> recognizeFlashAsr =
        genForrecognizeFlashAsr();

    private static HttpRequestDef<RecognizeFlashAsrRequest, RecognizeFlashAsrResponse> genForrecognizeFlashAsr() {
        // basic
        HttpRequestDef.Builder<RecognizeFlashAsrRequest, RecognizeFlashAsrResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeFlashAsrRequest.class, RecognizeFlashAsrResponse.class)
                .withName("RecognizeFlashAsr")
                .withUri("/v1/{project_id}/asr/flash")
                .withContentType("application/json");

        // requests
        builder.<RecognizeFlashAsrRequest.PropertyEnum>withRequestField("property",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RecognizeFlashAsrRequest.PropertyEnum.class),
            f -> f.withMarshaller(RecognizeFlashAsrRequest::getProperty, (req, v) -> {
                req.setProperty(v);
            }));
        builder.<RecognizeFlashAsrRequest.AudioFormatEnum>withRequestField("audio_format",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RecognizeFlashAsrRequest.AudioFormatEnum.class),
            f -> f.withMarshaller(RecognizeFlashAsrRequest::getAudioFormat, (req, v) -> {
                req.setAudioFormat(v);
            }));
        builder.<RecognizeFlashAsrRequest.AddPuncEnum>withRequestField("add_punc",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RecognizeFlashAsrRequest.AddPuncEnum.class),
            f -> f.withMarshaller(RecognizeFlashAsrRequest::getAddPunc, (req, v) -> {
                req.setAddPunc(v);
            }));
        builder.<RecognizeFlashAsrRequest.DigitNormEnum>withRequestField("digit_norm",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RecognizeFlashAsrRequest.DigitNormEnum.class),
            f -> f.withMarshaller(RecognizeFlashAsrRequest::getDigitNorm, (req, v) -> {
                req.setDigitNorm(v);
            }));
        builder.<RecognizeFlashAsrRequest.NeedWordInfoEnum>withRequestField("need_word_info",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RecognizeFlashAsrRequest.NeedWordInfoEnum.class),
            f -> f.withMarshaller(RecognizeFlashAsrRequest::getNeedWordInfo, (req, v) -> {
                req.setNeedWordInfo(v);
            }));
        builder.<String>withRequestField("vocabulary_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeFlashAsrRequest::getVocabularyId, (req, v) -> {
                req.setVocabularyId(v);
            }));
        builder.<String>withRequestField("obs_bucket_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeFlashAsrRequest::getObsBucketName, (req, v) -> {
                req.setObsBucketName(v);
            }));
        builder.<String>withRequestField("obs_object_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeFlashAsrRequest::getObsObjectKey, (req, v) -> {
                req.setObsObjectKey(v);
            }));
        builder.<RecognizeFlashAsrRequest.FirstChannelOnlyEnum>withRequestField("first_channel_only",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RecognizeFlashAsrRequest.FirstChannelOnlyEnum.class),
            f -> f.withMarshaller(RecognizeFlashAsrRequest::getFirstChannelOnly, (req, v) -> {
                req.setFirstChannelOnly(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeShortAudioRequest, RecognizeShortAudioResponse> recognizeShortAudio =
        genForrecognizeShortAudio();

    private static HttpRequestDef<RecognizeShortAudioRequest, RecognizeShortAudioResponse> genForrecognizeShortAudio() {
        // basic
        HttpRequestDef.Builder<RecognizeShortAudioRequest, RecognizeShortAudioResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RecognizeShortAudioRequest.class, RecognizeShortAudioResponse.class)
                .withName("RecognizeShortAudio")
                .withUri("/v1/{project_id}/asr/short-audio")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<PostShortAudioReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostShortAudioReq.class),
            f -> f.withMarshaller(RecognizeShortAudioRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunAudioAssessmentRequest, RunAudioAssessmentResponse> runAudioAssessment =
        genForrunAudioAssessment();

    private static HttpRequestDef<RunAudioAssessmentRequest, RunAudioAssessmentResponse> genForrunAudioAssessment() {
        // basic
        HttpRequestDef.Builder<RunAudioAssessmentRequest, RunAudioAssessmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunAudioAssessmentRequest.class, RunAudioAssessmentResponse.class)
                .withName("RunAudioAssessment")
                .withUri("/v1/{project_id}/assessment/audio")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<PostShortAudioAssessmentReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostShortAudioAssessmentReq.class),
            f -> f.withMarshaller(RunAudioAssessmentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunMultiModalAssessmentRequest, RunMultiModalAssessmentResponse> runMultiModalAssessment =
        genForrunMultiModalAssessment();

    private static HttpRequestDef<RunMultiModalAssessmentRequest, RunMultiModalAssessmentResponse> genForrunMultiModalAssessment() {
        // basic
        HttpRequestDef.Builder<RunMultiModalAssessmentRequest, RunMultiModalAssessmentResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RunMultiModalAssessmentRequest.class, RunMultiModalAssessmentResponse.class)
            .withName("RunMultiModalAssessment")
            .withUri("/v1/{project_id}/assessment/video")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<PostMultiModalAssessmentReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostMultiModalAssessmentReq.class),
            f -> f.withMarshaller(RunMultiModalAssessmentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunTtsRequest, RunTtsResponse> runTts = genForrunTts();

    private static HttpRequestDef<RunTtsRequest, RunTtsResponse> genForrunTts() {
        // basic
        HttpRequestDef.Builder<RunTtsRequest, RunTtsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunTtsRequest.class, RunTtsResponse.class)
                .withName("RunTts")
                .withUri("/v1/{project_id}/tts")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<PostCustomTTSReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostCustomTTSReq.class),
            f -> f.withMarshaller(RunTtsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVocabulariesRequest, ShowVocabulariesResponse> showVocabularies =
        genForshowVocabularies();

    private static HttpRequestDef<ShowVocabulariesRequest, ShowVocabulariesResponse> genForshowVocabularies() {
        // basic
        HttpRequestDef.Builder<ShowVocabulariesRequest, ShowVocabulariesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVocabulariesRequest.class, ShowVocabulariesResponse.class)
                .withName("ShowVocabularies")
                .withUri("/v1/{project_id}/asr/vocabularies")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowVocabulariesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowVocabulariesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ShowVocabulariesParams>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowVocabulariesParams.class),
            f -> f.withMarshaller(ShowVocabulariesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVocabularyRequest, ShowVocabularyResponse> showVocabulary =
        genForshowVocabulary();

    private static HttpRequestDef<ShowVocabularyRequest, ShowVocabularyResponse> genForshowVocabulary() {
        // basic
        HttpRequestDef.Builder<ShowVocabularyRequest, ShowVocabularyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVocabularyRequest.class, ShowVocabularyResponse.class)
                .withName("ShowVocabulary")
                .withUri("/v1/{project_id}/asr/vocabularies/{vocabulary_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vocabulary_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVocabularyRequest::getVocabularyId, (req, v) -> {
                req.setVocabularyId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVocabularyRequest, UpdateVocabularyResponse> updateVocabulary =
        genForupdateVocabulary();

    private static HttpRequestDef<UpdateVocabularyRequest, UpdateVocabularyResponse> genForupdateVocabulary() {
        // basic
        HttpRequestDef.Builder<UpdateVocabularyRequest, UpdateVocabularyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateVocabularyRequest.class, UpdateVocabularyResponse.class)
                .withName("UpdateVocabulary")
                .withUri("/v1/{project_id}/asr/vocabularies/{vocabulary_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("vocabulary_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVocabularyRequest::getVocabularyId, (req, v) -> {
                req.setVocabularyId(v);
            }));
        builder.<PutUpdateVocabReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PutUpdateVocabReq.class),
            f -> f.withMarshaller(UpdateVocabularyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}

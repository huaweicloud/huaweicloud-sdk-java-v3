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
import com.huaweicloud.sdk.sis.v1.model.CreateVoiceRequest;
import com.huaweicloud.sdk.sis.v1.model.CreateVoiceResponse;
import com.huaweicloud.sdk.sis.v1.model.DeleteVocabularyRequest;
import com.huaweicloud.sdk.sis.v1.model.DeleteVocabularyResponse;
import com.huaweicloud.sdk.sis.v1.model.GenerateSpeechRequest;
import com.huaweicloud.sdk.sis.v1.model.GenerateSpeechRequestBody;
import com.huaweicloud.sdk.sis.v1.model.GenerateSpeechResponse;
import com.huaweicloud.sdk.sis.v1.model.ListVoicesRequest;
import com.huaweicloud.sdk.sis.v1.model.ListVoicesResponse;
import com.huaweicloud.sdk.sis.v1.model.PostCreateVocabReq;
import com.huaweicloud.sdk.sis.v1.model.PostCustomTTSReq;
import com.huaweicloud.sdk.sis.v1.model.PostShortAudioReq;
import com.huaweicloud.sdk.sis.v1.model.PostTranscriberJobs;
import com.huaweicloud.sdk.sis.v1.model.PushTranscriberJobsRequest;
import com.huaweicloud.sdk.sis.v1.model.PushTranscriberJobsResponse;
import com.huaweicloud.sdk.sis.v1.model.PutUpdateVocabReq;
import com.huaweicloud.sdk.sis.v1.model.RecognizeFlashAsrRequest;
import com.huaweicloud.sdk.sis.v1.model.RecognizeFlashAsrResponse;
import com.huaweicloud.sdk.sis.v1.model.RecognizeShortAudioRequest;
import com.huaweicloud.sdk.sis.v1.model.RecognizeShortAudioResponse;
import com.huaweicloud.sdk.sis.v1.model.RegisterVoiceReq;
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
        genForCollectTranscriberJob();

    private static HttpRequestDef<CollectTranscriberJobRequest, CollectTranscriberJobResponse> genForCollectTranscriberJob() {
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
            f -> f.withMarshaller(CollectTranscriberJobRequest::getJobId, CollectTranscriberJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVocabularyRequest, CreateVocabularyResponse> createVocabulary =
        genForCreateVocabulary();

    private static HttpRequestDef<CreateVocabularyRequest, CreateVocabularyResponse> genForCreateVocabulary() {
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
            f -> f.withMarshaller(CreateVocabularyRequest::getBody, CreateVocabularyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVoiceRequest, CreateVoiceResponse> createVoice = genForCreateVoice();

    private static HttpRequestDef<CreateVoiceRequest, CreateVoiceResponse> genForCreateVoice() {
        // basic
        HttpRequestDef.Builder<CreateVoiceRequest, CreateVoiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVoiceRequest.class, CreateVoiceResponse.class)
                .withName("CreateVoice")
                .withUri("/v1/{project_id}/vcs/voices")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<RegisterVoiceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RegisterVoiceReq.class),
            f -> f.withMarshaller(CreateVoiceRequest::getBody, CreateVoiceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVocabularyRequest, DeleteVocabularyResponse> deleteVocabulary =
        genForDeleteVocabulary();

    private static HttpRequestDef<DeleteVocabularyRequest, DeleteVocabularyResponse> genForDeleteVocabulary() {
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
            f -> f.withMarshaller(DeleteVocabularyRequest::getVocabularyId, DeleteVocabularyRequest::setVocabularyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GenerateSpeechRequest, GenerateSpeechResponse> generateSpeech =
        genForGenerateSpeech();

    private static HttpRequestDef<GenerateSpeechRequest, GenerateSpeechResponse> genForGenerateSpeech() {
        // basic
        HttpRequestDef.Builder<GenerateSpeechRequest, GenerateSpeechResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, GenerateSpeechRequest.class, GenerateSpeechResponse.class)
                .withName("GenerateSpeech")
                .withUri("/v1/{project_id}/vcs/voices/clone")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<GenerateSpeechRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GenerateSpeechRequestBody.class),
            f -> f.withMarshaller(GenerateSpeechRequest::getBody, GenerateSpeechRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVoicesRequest, ListVoicesResponse> listVoices = genForListVoices();

    private static HttpRequestDef<ListVoicesRequest, ListVoicesResponse> genForListVoices() {
        // basic
        HttpRequestDef.Builder<ListVoicesRequest, ListVoicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVoicesRequest.class, ListVoicesResponse.class)
                .withName("ListVoices")
                .withUri("/v1/{project_id}/vcs/voices")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVoicesRequest::getLimit, ListVoicesRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVoicesRequest::getOffset, ListVoicesRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PushTranscriberJobsRequest, PushTranscriberJobsResponse> pushTranscriberJobs =
        genForPushTranscriberJobs();

    private static HttpRequestDef<PushTranscriberJobsRequest, PushTranscriberJobsResponse> genForPushTranscriberJobs() {
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
            f -> f.withMarshaller(PushTranscriberJobsRequest::getEnterpriseProjectId,
                PushTranscriberJobsRequest::setEnterpriseProjectId));
        builder.<PostTranscriberJobs>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PostTranscriberJobs.class),
            f -> f.withMarshaller(PushTranscriberJobsRequest::getBody, PushTranscriberJobsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeFlashAsrRequest, RecognizeFlashAsrResponse> recognizeFlashAsr =
        genForRecognizeFlashAsr();

    private static HttpRequestDef<RecognizeFlashAsrRequest, RecognizeFlashAsrResponse> genForRecognizeFlashAsr() {
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
            f -> f.withMarshaller(RecognizeFlashAsrRequest::getProperty, RecognizeFlashAsrRequest::setProperty));
        builder.<RecognizeFlashAsrRequest.AudioFormatEnum>withRequestField("audio_format",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RecognizeFlashAsrRequest.AudioFormatEnum.class),
            f -> f.withMarshaller(RecognizeFlashAsrRequest::getAudioFormat, RecognizeFlashAsrRequest::setAudioFormat));
        builder.<String>withRequestField("obs_bucket_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeFlashAsrRequest::getObsBucketName,
                RecognizeFlashAsrRequest::setObsBucketName));
        builder.<String>withRequestField("obs_object_key",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeFlashAsrRequest::getObsObjectKey,
                RecognizeFlashAsrRequest::setObsObjectKey));
        builder.<RecognizeFlashAsrRequest.AddPuncEnum>withRequestField("add_punc",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RecognizeFlashAsrRequest.AddPuncEnum.class),
            f -> f.withMarshaller(RecognizeFlashAsrRequest::getAddPunc, RecognizeFlashAsrRequest::setAddPunc));
        builder.<RecognizeFlashAsrRequest.DigitNormEnum>withRequestField("digit_norm",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RecognizeFlashAsrRequest.DigitNormEnum.class),
            f -> f.withMarshaller(RecognizeFlashAsrRequest::getDigitNorm, RecognizeFlashAsrRequest::setDigitNorm));
        builder.<RecognizeFlashAsrRequest.NeedWordInfoEnum>withRequestField("need_word_info",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RecognizeFlashAsrRequest.NeedWordInfoEnum.class),
            f -> f.withMarshaller(RecognizeFlashAsrRequest::getNeedWordInfo,
                RecognizeFlashAsrRequest::setNeedWordInfo));
        builder.<String>withRequestField("vocabulary_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecognizeFlashAsrRequest::getVocabularyId,
                RecognizeFlashAsrRequest::setVocabularyId));
        builder.<RecognizeFlashAsrRequest.FirstChannelOnlyEnum>withRequestField("first_channel_only",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RecognizeFlashAsrRequest.FirstChannelOnlyEnum.class),
            f -> f.withMarshaller(RecognizeFlashAsrRequest::getFirstChannelOnly,
                RecognizeFlashAsrRequest::setFirstChannelOnly));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecognizeShortAudioRequest, RecognizeShortAudioResponse> recognizeShortAudio =
        genForRecognizeShortAudio();

    private static HttpRequestDef<RecognizeShortAudioRequest, RecognizeShortAudioResponse> genForRecognizeShortAudio() {
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
            f -> f.withMarshaller(RecognizeShortAudioRequest::getBody, RecognizeShortAudioRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunTtsRequest, RunTtsResponse> runTts = genForRunTts();

    private static HttpRequestDef<RunTtsRequest, RunTtsResponse> genForRunTts() {
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
            f -> f.withMarshaller(RunTtsRequest::getBody, RunTtsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVocabulariesRequest, ShowVocabulariesResponse> showVocabularies =
        genForShowVocabularies();

    private static HttpRequestDef<ShowVocabulariesRequest, ShowVocabulariesResponse> genForShowVocabularies() {
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
            f -> f.withMarshaller(ShowVocabulariesRequest::getOffset, ShowVocabulariesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowVocabulariesRequest::getLimit, ShowVocabulariesRequest::setLimit));
        builder.<ShowVocabulariesParams>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowVocabulariesParams.class),
            f -> f.withMarshaller(ShowVocabulariesRequest::getBody, ShowVocabulariesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVocabularyRequest, ShowVocabularyResponse> showVocabulary =
        genForShowVocabulary();

    private static HttpRequestDef<ShowVocabularyRequest, ShowVocabularyResponse> genForShowVocabulary() {
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
            f -> f.withMarshaller(ShowVocabularyRequest::getVocabularyId, ShowVocabularyRequest::setVocabularyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVocabularyRequest, UpdateVocabularyResponse> updateVocabulary =
        genForUpdateVocabulary();

    private static HttpRequestDef<UpdateVocabularyRequest, UpdateVocabularyResponse> genForUpdateVocabulary() {
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
            f -> f.withMarshaller(UpdateVocabularyRequest::getVocabularyId, UpdateVocabularyRequest::setVocabularyId));
        builder.<PutUpdateVocabReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PutUpdateVocabReq.class),
            f -> f.withMarshaller(UpdateVocabularyRequest::getBody, UpdateVocabularyRequest::setBody));

        // response

        return builder.build();
    }

}

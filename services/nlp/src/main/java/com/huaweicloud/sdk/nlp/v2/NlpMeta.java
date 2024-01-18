package com.huaweicloud.sdk.nlp.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.nlp.v2.model.AspectSentimentAdvanceRequest;
import com.huaweicloud.sdk.nlp.v2.model.AspectSentimentRequest;
import com.huaweicloud.sdk.nlp.v2.model.ClassificationReq;
import com.huaweicloud.sdk.nlp.v2.model.ConstituencyParserReq;
import com.huaweicloud.sdk.nlp.v2.model.CreatePoem;
import com.huaweicloud.sdk.nlp.v2.model.DependencyParserRequest;
import com.huaweicloud.sdk.nlp.v2.model.DocumentClassificationReq;
import com.huaweicloud.sdk.nlp.v2.model.DomainSentimentReq;
import com.huaweicloud.sdk.nlp.v2.model.EntitySentimentReq;
import com.huaweicloud.sdk.nlp.v2.model.FileTranslationReq;
import com.huaweicloud.sdk.nlp.v2.model.HWCloudSentimentReq;
import com.huaweicloud.sdk.nlp.v2.model.IntentReq;
import com.huaweicloud.sdk.nlp.v2.model.KeywordExtractReq;
import com.huaweicloud.sdk.nlp.v2.model.LanguageDetectionReq;
import com.huaweicloud.sdk.nlp.v2.model.NerRequest;
import com.huaweicloud.sdk.nlp.v2.model.PostDomainNerRequest;
import com.huaweicloud.sdk.nlp.v2.model.PostEntityLinkingRequest;
import com.huaweicloud.sdk.nlp.v2.model.PostEventExtractionReq;
import com.huaweicloud.sdk.nlp.v2.model.PostMultiGrainedSegmentReq;
import com.huaweicloud.sdk.nlp.v2.model.PostSentenceEmbeddingReq;
import com.huaweicloud.sdk.nlp.v2.model.RunAspectSentimentAdvanceRequest;
import com.huaweicloud.sdk.nlp.v2.model.RunAspectSentimentAdvanceResponse;
import com.huaweicloud.sdk.nlp.v2.model.RunAspectSentimentRequest;
import com.huaweicloud.sdk.nlp.v2.model.RunAspectSentimentResponse;
import com.huaweicloud.sdk.nlp.v2.model.RunClassificationRequest;
import com.huaweicloud.sdk.nlp.v2.model.RunClassificationResponse;
import com.huaweicloud.sdk.nlp.v2.model.RunConstituencyParserRequest;
import com.huaweicloud.sdk.nlp.v2.model.RunConstituencyParserResponse;
import com.huaweicloud.sdk.nlp.v2.model.RunDependencyParserRequest;
import com.huaweicloud.sdk.nlp.v2.model.RunDependencyParserResponse;
import com.huaweicloud.sdk.nlp.v2.model.RunDocClassificationRequest;
import com.huaweicloud.sdk.nlp.v2.model.RunDocClassificationResponse;
import com.huaweicloud.sdk.nlp.v2.model.RunDomainSentimentRequest;
import com.huaweicloud.sdk.nlp.v2.model.RunDomainSentimentResponse;
import com.huaweicloud.sdk.nlp.v2.model.RunEntityLinkingRequest;
import com.huaweicloud.sdk.nlp.v2.model.RunEntityLinkingResponse;
import com.huaweicloud.sdk.nlp.v2.model.RunEntitySentimentRequest;
import com.huaweicloud.sdk.nlp.v2.model.RunEntitySentimentResponse;
import com.huaweicloud.sdk.nlp.v2.model.RunEventExtractionRequest;
import com.huaweicloud.sdk.nlp.v2.model.RunEventExtractionResponse;
import com.huaweicloud.sdk.nlp.v2.model.RunFileTranslationRequest;
import com.huaweicloud.sdk.nlp.v2.model.RunFileTranslationResponse;
import com.huaweicloud.sdk.nlp.v2.model.RunGetFileTranslationResultRequest;
import com.huaweicloud.sdk.nlp.v2.model.RunGetFileTranslationResultResponse;
import com.huaweicloud.sdk.nlp.v2.model.RunKeywordExtractRequest;
import com.huaweicloud.sdk.nlp.v2.model.RunKeywordExtractResponse;
import com.huaweicloud.sdk.nlp.v2.model.RunLanguageDetectionRequest;
import com.huaweicloud.sdk.nlp.v2.model.RunLanguageDetectionResponse;
import com.huaweicloud.sdk.nlp.v2.model.RunMultiGrainedSegmentRequest;
import com.huaweicloud.sdk.nlp.v2.model.RunMultiGrainedSegmentResponse;
import com.huaweicloud.sdk.nlp.v2.model.RunNerDomainRequest;
import com.huaweicloud.sdk.nlp.v2.model.RunNerDomainResponse;
import com.huaweicloud.sdk.nlp.v2.model.RunNerRequest;
import com.huaweicloud.sdk.nlp.v2.model.RunNerResponse;
import com.huaweicloud.sdk.nlp.v2.model.RunPoemRequest;
import com.huaweicloud.sdk.nlp.v2.model.RunPoemResponse;
import com.huaweicloud.sdk.nlp.v2.model.RunSegmentRequest;
import com.huaweicloud.sdk.nlp.v2.model.RunSegmentResponse;
import com.huaweicloud.sdk.nlp.v2.model.RunSemanticParserRequest;
import com.huaweicloud.sdk.nlp.v2.model.RunSemanticParserResponse;
import com.huaweicloud.sdk.nlp.v2.model.RunSentenceEmbeddingRequest;
import com.huaweicloud.sdk.nlp.v2.model.RunSentenceEmbeddingResponse;
import com.huaweicloud.sdk.nlp.v2.model.RunSentimentRequest;
import com.huaweicloud.sdk.nlp.v2.model.RunSentimentResponse;
import com.huaweicloud.sdk.nlp.v2.model.RunSummaryDomainRequest;
import com.huaweicloud.sdk.nlp.v2.model.RunSummaryDomainResponse;
import com.huaweicloud.sdk.nlp.v2.model.RunSummaryRequest;
import com.huaweicloud.sdk.nlp.v2.model.RunSummaryResponse;
import com.huaweicloud.sdk.nlp.v2.model.RunTextSimilarityAdvanceRequest;
import com.huaweicloud.sdk.nlp.v2.model.RunTextSimilarityAdvanceResponse;
import com.huaweicloud.sdk.nlp.v2.model.RunTextSimilarityRequest;
import com.huaweicloud.sdk.nlp.v2.model.RunTextSimilarityResponse;
import com.huaweicloud.sdk.nlp.v2.model.RunTextTranslationRequest;
import com.huaweicloud.sdk.nlp.v2.model.RunTextTranslationResponse;
import com.huaweicloud.sdk.nlp.v2.model.SegmentRequest;
import com.huaweicloud.sdk.nlp.v2.model.SummaryDomainReq;
import com.huaweicloud.sdk.nlp.v2.model.SummaryReq;
import com.huaweicloud.sdk.nlp.v2.model.TextSimilarityAdvanceRequest;
import com.huaweicloud.sdk.nlp.v2.model.TextSimilarityRequest;
import com.huaweicloud.sdk.nlp.v2.model.TextTranslationReq;

@SuppressWarnings("unchecked")
public class NlpMeta {

    public static final HttpRequestDef<RunAspectSentimentRequest, RunAspectSentimentResponse> runAspectSentiment =
        genForRunAspectSentiment();

    private static HttpRequestDef<RunAspectSentimentRequest, RunAspectSentimentResponse> genForRunAspectSentiment() {
        // basic
        HttpRequestDef.Builder<RunAspectSentimentRequest, RunAspectSentimentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunAspectSentimentRequest.class, RunAspectSentimentResponse.class)
                .withName("RunAspectSentiment")
                .withUri("/v1/{project_id}/nlu/aspect-sentiment")
                .withContentType("application/json");

        // requests
        builder.<AspectSentimentRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AspectSentimentRequest.class),
            f -> f.withMarshaller(RunAspectSentimentRequest::getBody, RunAspectSentimentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunAspectSentimentAdvanceRequest, RunAspectSentimentAdvanceResponse> runAspectSentimentAdvance =
        genForRunAspectSentimentAdvance();

    private static HttpRequestDef<RunAspectSentimentAdvanceRequest, RunAspectSentimentAdvanceResponse> genForRunAspectSentimentAdvance() {
        // basic
        HttpRequestDef.Builder<RunAspectSentimentAdvanceRequest, RunAspectSentimentAdvanceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RunAspectSentimentAdvanceRequest.class,
                    RunAspectSentimentAdvanceResponse.class)
                .withName("RunAspectSentimentAdvance")
                .withUri("/v1/{project_id}/nlu/aspect-sentiment/advance")
                .withContentType("application/json");

        // requests
        builder.<AspectSentimentAdvanceRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AspectSentimentAdvanceRequest.class),
            f -> f.withMarshaller(RunAspectSentimentAdvanceRequest::getBody,
                RunAspectSentimentAdvanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunClassificationRequest, RunClassificationResponse> runClassification =
        genForRunClassification();

    private static HttpRequestDef<RunClassificationRequest, RunClassificationResponse> genForRunClassification() {
        // basic
        HttpRequestDef.Builder<RunClassificationRequest, RunClassificationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunClassificationRequest.class, RunClassificationResponse.class)
                .withName("RunClassification")
                .withUri("/v1/{project_id}/nlu/classification")
                .withContentType("application/json");

        // requests
        builder.<ClassificationReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ClassificationReq.class),
            f -> f.withMarshaller(RunClassificationRequest::getBody, RunClassificationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunConstituencyParserRequest, RunConstituencyParserResponse> runConstituencyParser =
        genForRunConstituencyParser();

    private static HttpRequestDef<RunConstituencyParserRequest, RunConstituencyParserResponse> genForRunConstituencyParser() {
        // basic
        HttpRequestDef.Builder<RunConstituencyParserRequest, RunConstituencyParserResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RunConstituencyParserRequest.class, RunConstituencyParserResponse.class)
            .withName("RunConstituencyParser")
            .withUri("/v1/{project_id}/nlp-fundamental/constituency-parser")
            .withContentType("application/json");

        // requests
        builder.<ConstituencyParserReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConstituencyParserReq.class),
            f -> f.withMarshaller(RunConstituencyParserRequest::getBody, RunConstituencyParserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunDependencyParserRequest, RunDependencyParserResponse> runDependencyParser =
        genForRunDependencyParser();

    private static HttpRequestDef<RunDependencyParserRequest, RunDependencyParserResponse> genForRunDependencyParser() {
        // basic
        HttpRequestDef.Builder<RunDependencyParserRequest, RunDependencyParserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunDependencyParserRequest.class, RunDependencyParserResponse.class)
                .withName("RunDependencyParser")
                .withUri("/v1/{project_id}/nlp-fundamental/dependency-parser")
                .withContentType("application/json");

        // requests
        builder.<DependencyParserRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DependencyParserRequest.class),
            f -> f.withMarshaller(RunDependencyParserRequest::getBody, RunDependencyParserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunDocClassificationRequest, RunDocClassificationResponse> runDocClassification =
        genForRunDocClassification();

    private static HttpRequestDef<RunDocClassificationRequest, RunDocClassificationResponse> genForRunDocClassification() {
        // basic
        HttpRequestDef.Builder<RunDocClassificationRequest, RunDocClassificationResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RunDocClassificationRequest.class, RunDocClassificationResponse.class)
            .withName("RunDocClassification")
            .withUri("/v1/{project_id}/nlu/doc-classification")
            .withContentType("application/json");

        // requests
        builder.<DocumentClassificationReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DocumentClassificationReq.class),
            f -> f.withMarshaller(RunDocClassificationRequest::getBody, RunDocClassificationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunDomainSentimentRequest, RunDomainSentimentResponse> runDomainSentiment =
        genForRunDomainSentiment();

    private static HttpRequestDef<RunDomainSentimentRequest, RunDomainSentimentResponse> genForRunDomainSentiment() {
        // basic
        HttpRequestDef.Builder<RunDomainSentimentRequest, RunDomainSentimentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunDomainSentimentRequest.class, RunDomainSentimentResponse.class)
                .withName("RunDomainSentiment")
                .withUri("/v1/{project_id}/nlu/sentiment/domain")
                .withContentType("application/json");

        // requests
        builder.<DomainSentimentReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DomainSentimentReq.class),
            f -> f.withMarshaller(RunDomainSentimentRequest::getBody, RunDomainSentimentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunEntityLinkingRequest, RunEntityLinkingResponse> runEntityLinking =
        genForRunEntityLinking();

    private static HttpRequestDef<RunEntityLinkingRequest, RunEntityLinkingResponse> genForRunEntityLinking() {
        // basic
        HttpRequestDef.Builder<RunEntityLinkingRequest, RunEntityLinkingResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunEntityLinkingRequest.class, RunEntityLinkingResponse.class)
                .withName("RunEntityLinking")
                .withUri("/v1/{project_id}/nlp-fundamental/entity-linking")
                .withContentType("application/json");

        // requests
        builder.<PostEntityLinkingRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostEntityLinkingRequest.class),
            f -> f.withMarshaller(RunEntityLinkingRequest::getBody, RunEntityLinkingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunEntitySentimentRequest, RunEntitySentimentResponse> runEntitySentiment =
        genForRunEntitySentiment();

    private static HttpRequestDef<RunEntitySentimentRequest, RunEntitySentimentResponse> genForRunEntitySentiment() {
        // basic
        HttpRequestDef.Builder<RunEntitySentimentRequest, RunEntitySentimentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunEntitySentimentRequest.class, RunEntitySentimentResponse.class)
                .withName("RunEntitySentiment")
                .withUri("/v1/{project_id}/nlu/entity-sentiment")
                .withContentType("application/json");

        // requests
        builder.<EntitySentimentReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EntitySentimentReq.class),
            f -> f.withMarshaller(RunEntitySentimentRequest::getBody, RunEntitySentimentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunEventExtractionRequest, RunEventExtractionResponse> runEventExtraction =
        genForRunEventExtraction();

    private static HttpRequestDef<RunEventExtractionRequest, RunEventExtractionResponse> genForRunEventExtraction() {
        // basic
        HttpRequestDef.Builder<RunEventExtractionRequest, RunEventExtractionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunEventExtractionRequest.class, RunEventExtractionResponse.class)
                .withName("RunEventExtraction")
                .withUri("/v1/{project_id}/nlp-fundamental/event-extraction")
                .withContentType("application/json");

        // requests
        builder.<PostEventExtractionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostEventExtractionReq.class),
            f -> f.withMarshaller(RunEventExtractionRequest::getBody, RunEventExtractionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunFileTranslationRequest, RunFileTranslationResponse> runFileTranslation =
        genForRunFileTranslation();

    private static HttpRequestDef<RunFileTranslationRequest, RunFileTranslationResponse> genForRunFileTranslation() {
        // basic
        HttpRequestDef.Builder<RunFileTranslationRequest, RunFileTranslationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunFileTranslationRequest.class, RunFileTranslationResponse.class)
                .withName("RunFileTranslation")
                .withUri("/v1/{project_id}/machine-translation/file-translation/jobs")
                .withContentType("application/json");

        // requests
        builder.<FileTranslationReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FileTranslationReq.class),
            f -> f.withMarshaller(RunFileTranslationRequest::getBody, RunFileTranslationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunGetFileTranslationResultRequest, RunGetFileTranslationResultResponse> runGetFileTranslationResult =
        genForRunGetFileTranslationResult();

    private static HttpRequestDef<RunGetFileTranslationResultRequest, RunGetFileTranslationResultResponse> genForRunGetFileTranslationResult() {
        // basic
        HttpRequestDef.Builder<RunGetFileTranslationResultRequest, RunGetFileTranslationResultResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    RunGetFileTranslationResultRequest.class,
                    RunGetFileTranslationResultResponse.class)
                .withName("RunGetFileTranslationResult")
                .withUri("/v1/{project_id}/machine-translation/file-translation/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunGetFileTranslationResultRequest::getJobId,
                RunGetFileTranslationResultRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunKeywordExtractRequest, RunKeywordExtractResponse> runKeywordExtract =
        genForRunKeywordExtract();

    private static HttpRequestDef<RunKeywordExtractRequest, RunKeywordExtractResponse> genForRunKeywordExtract() {
        // basic
        HttpRequestDef.Builder<RunKeywordExtractRequest, RunKeywordExtractResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunKeywordExtractRequest.class, RunKeywordExtractResponse.class)
                .withName("RunKeywordExtract")
                .withUri("/v1/{project_id}/nlp-fundamental/keyword-extraction")
                .withContentType("application/json");

        // requests
        builder.<KeywordExtractReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(KeywordExtractReq.class),
            f -> f.withMarshaller(RunKeywordExtractRequest::getBody, RunKeywordExtractRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunLanguageDetectionRequest, RunLanguageDetectionResponse> runLanguageDetection =
        genForRunLanguageDetection();

    private static HttpRequestDef<RunLanguageDetectionRequest, RunLanguageDetectionResponse> genForRunLanguageDetection() {
        // basic
        HttpRequestDef.Builder<RunLanguageDetectionRequest, RunLanguageDetectionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RunLanguageDetectionRequest.class, RunLanguageDetectionResponse.class)
            .withName("RunLanguageDetection")
            .withUri("/v1/{project_id}/machine-translation/language-detection")
            .withContentType("application/json");

        // requests
        builder.<LanguageDetectionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LanguageDetectionReq.class),
            f -> f.withMarshaller(RunLanguageDetectionRequest::getBody, RunLanguageDetectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunMultiGrainedSegmentRequest, RunMultiGrainedSegmentResponse> runMultiGrainedSegment =
        genForRunMultiGrainedSegment();

    private static HttpRequestDef<RunMultiGrainedSegmentRequest, RunMultiGrainedSegmentResponse> genForRunMultiGrainedSegment() {
        // basic
        HttpRequestDef.Builder<RunMultiGrainedSegmentRequest, RunMultiGrainedSegmentResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RunMultiGrainedSegmentRequest.class, RunMultiGrainedSegmentResponse.class)
            .withName("RunMultiGrainedSegment")
            .withUri("/v1/{project_id}/nlp-fundamental/multi-grained-segment")
            .withContentType("application/json");

        // requests
        builder.<PostMultiGrainedSegmentReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostMultiGrainedSegmentReq.class),
            f -> f.withMarshaller(RunMultiGrainedSegmentRequest::getBody, RunMultiGrainedSegmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunNerRequest, RunNerResponse> runNer = genForRunNer();

    private static HttpRequestDef<RunNerRequest, RunNerResponse> genForRunNer() {
        // basic
        HttpRequestDef.Builder<RunNerRequest, RunNerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunNerRequest.class, RunNerResponse.class)
                .withName("RunNer")
                .withUri("/v1/{project_id}/nlp-fundamental/ner")
                .withContentType("application/json");

        // requests
        builder.<NerRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NerRequest.class),
            f -> f.withMarshaller(RunNerRequest::getBody, RunNerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunNerDomainRequest, RunNerDomainResponse> runNerDomain = genForRunNerDomain();

    private static HttpRequestDef<RunNerDomainRequest, RunNerDomainResponse> genForRunNerDomain() {
        // basic
        HttpRequestDef.Builder<RunNerDomainRequest, RunNerDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunNerDomainRequest.class, RunNerDomainResponse.class)
                .withName("RunNerDomain")
                .withUri("/v1/{project_id}/nlp-fundamental/ner/domain")
                .withContentType("application/json");

        // requests
        builder.<PostDomainNerRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostDomainNerRequest.class),
            f -> f.withMarshaller(RunNerDomainRequest::getBody, RunNerDomainRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunPoemRequest, RunPoemResponse> runPoem = genForRunPoem();

    private static HttpRequestDef<RunPoemRequest, RunPoemResponse> genForRunPoem() {
        // basic
        HttpRequestDef.Builder<RunPoemRequest, RunPoemResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunPoemRequest.class, RunPoemResponse.class)
                .withName("RunPoem")
                .withUri("/v1/{project_id}/nlg/poem")
                .withContentType("application/json");

        // requests
        builder.<CreatePoem>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePoem.class),
            f -> f.withMarshaller(RunPoemRequest::getBody, RunPoemRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunSegmentRequest, RunSegmentResponse> runSegment = genForRunSegment();

    private static HttpRequestDef<RunSegmentRequest, RunSegmentResponse> genForRunSegment() {
        // basic
        HttpRequestDef.Builder<RunSegmentRequest, RunSegmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunSegmentRequest.class, RunSegmentResponse.class)
                .withName("RunSegment")
                .withUri("/v1/{project_id}/nlp-fundamental/segment")
                .withContentType("application/json");

        // requests
        builder.<SegmentRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SegmentRequest.class),
            f -> f.withMarshaller(RunSegmentRequest::getBody, RunSegmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunSemanticParserRequest, RunSemanticParserResponse> runSemanticParser =
        genForRunSemanticParser();

    private static HttpRequestDef<RunSemanticParserRequest, RunSemanticParserResponse> genForRunSemanticParser() {
        // basic
        HttpRequestDef.Builder<RunSemanticParserRequest, RunSemanticParserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunSemanticParserRequest.class, RunSemanticParserResponse.class)
                .withName("RunSemanticParser")
                .withUri("/v1/{project_id}/nlu/semantic-parser")
                .withContentType("application/json");

        // requests
        builder.<IntentReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IntentReq.class),
            f -> f.withMarshaller(RunSemanticParserRequest::getBody, RunSemanticParserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunSentenceEmbeddingRequest, RunSentenceEmbeddingResponse> runSentenceEmbedding =
        genForRunSentenceEmbedding();

    private static HttpRequestDef<RunSentenceEmbeddingRequest, RunSentenceEmbeddingResponse> genForRunSentenceEmbedding() {
        // basic
        HttpRequestDef.Builder<RunSentenceEmbeddingRequest, RunSentenceEmbeddingResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RunSentenceEmbeddingRequest.class, RunSentenceEmbeddingResponse.class)
            .withName("RunSentenceEmbedding")
            .withUri("/v1/{project_id}/nlp-fundamental/sentence-embedding")
            .withContentType("application/json");

        // requests
        builder.<PostSentenceEmbeddingReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostSentenceEmbeddingReq.class),
            f -> f.withMarshaller(RunSentenceEmbeddingRequest::getBody, RunSentenceEmbeddingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunSentimentRequest, RunSentimentResponse> runSentiment = genForRunSentiment();

    private static HttpRequestDef<RunSentimentRequest, RunSentimentResponse> genForRunSentiment() {
        // basic
        HttpRequestDef.Builder<RunSentimentRequest, RunSentimentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunSentimentRequest.class, RunSentimentResponse.class)
                .withName("RunSentiment")
                .withUri("/v1/{project_id}/nlu/sentiment")
                .withContentType("application/json");

        // requests
        builder.<HWCloudSentimentReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(HWCloudSentimentReq.class),
            f -> f.withMarshaller(RunSentimentRequest::getBody, RunSentimentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunSummaryRequest, RunSummaryResponse> runSummary = genForRunSummary();

    private static HttpRequestDef<RunSummaryRequest, RunSummaryResponse> genForRunSummary() {
        // basic
        HttpRequestDef.Builder<RunSummaryRequest, RunSummaryResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunSummaryRequest.class, RunSummaryResponse.class)
                .withName("RunSummary")
                .withUri("/v1/{project_id}/nlg/summarization")
                .withContentType("application/json");

        // requests
        builder.<SummaryReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SummaryReq.class),
            f -> f.withMarshaller(RunSummaryRequest::getBody, RunSummaryRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunSummaryDomainRequest, RunSummaryDomainResponse> runSummaryDomain =
        genForRunSummaryDomain();

    private static HttpRequestDef<RunSummaryDomainRequest, RunSummaryDomainResponse> genForRunSummaryDomain() {
        // basic
        HttpRequestDef.Builder<RunSummaryDomainRequest, RunSummaryDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunSummaryDomainRequest.class, RunSummaryDomainResponse.class)
                .withName("RunSummaryDomain")
                .withUri("/v1/{project_id}/nlg/summarization/domain")
                .withContentType("application/json");

        // requests
        builder.<SummaryDomainReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SummaryDomainReq.class),
            f -> f.withMarshaller(RunSummaryDomainRequest::getBody, RunSummaryDomainRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunTextSimilarityRequest, RunTextSimilarityResponse> runTextSimilarity =
        genForRunTextSimilarity();

    private static HttpRequestDef<RunTextSimilarityRequest, RunTextSimilarityResponse> genForRunTextSimilarity() {
        // basic
        HttpRequestDef.Builder<RunTextSimilarityRequest, RunTextSimilarityResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunTextSimilarityRequest.class, RunTextSimilarityResponse.class)
                .withName("RunTextSimilarity")
                .withUri("/v1/{project_id}/nlp-fundamental/text-similarity")
                .withContentType("application/json");

        // requests
        builder.<TextSimilarityRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TextSimilarityRequest.class),
            f -> f.withMarshaller(RunTextSimilarityRequest::getBody, RunTextSimilarityRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunTextSimilarityAdvanceRequest, RunTextSimilarityAdvanceResponse> runTextSimilarityAdvance =
        genForRunTextSimilarityAdvance();

    private static HttpRequestDef<RunTextSimilarityAdvanceRequest, RunTextSimilarityAdvanceResponse> genForRunTextSimilarityAdvance() {
        // basic
        HttpRequestDef.Builder<RunTextSimilarityAdvanceRequest, RunTextSimilarityAdvanceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, RunTextSimilarityAdvanceRequest.class, RunTextSimilarityAdvanceResponse.class)
                .withName("RunTextSimilarityAdvance")
                .withUri("/v1/{project_id}/nlp-fundamental/text-similarity/advance")
                .withContentType("application/json");

        // requests
        builder.<TextSimilarityAdvanceRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TextSimilarityAdvanceRequest.class),
            f -> f.withMarshaller(RunTextSimilarityAdvanceRequest::getBody, RunTextSimilarityAdvanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunTextTranslationRequest, RunTextTranslationResponse> runTextTranslation =
        genForRunTextTranslation();

    private static HttpRequestDef<RunTextTranslationRequest, RunTextTranslationResponse> genForRunTextTranslation() {
        // basic
        HttpRequestDef.Builder<RunTextTranslationRequest, RunTextTranslationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunTextTranslationRequest.class, RunTextTranslationResponse.class)
                .withName("RunTextTranslation")
                .withUri("/v1/{project_id}/machine-translation/text-translation")
                .withContentType("application/json");

        // requests
        builder.<TextTranslationReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TextTranslationReq.class),
            f -> f.withMarshaller(RunTextTranslationRequest::getBody, RunTextTranslationRequest::setBody));

        // response

        return builder.build();
    }

}

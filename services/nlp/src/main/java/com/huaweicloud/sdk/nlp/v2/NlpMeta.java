package com.huaweicloud.sdk.nlp.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.nlp.v2.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class NlpMeta {

    public static final HttpRequestDef<RunAspectSentimentRequest, RunAspectSentimentResponse> runAspectSentiment = genForrunAspectSentiment();

    private static HttpRequestDef<RunAspectSentimentRequest, RunAspectSentimentResponse> genForrunAspectSentiment() {
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
            f -> f.withMarshaller(RunAspectSentimentRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RunAspectSentimentAdvanceRequest, RunAspectSentimentAdvanceResponse> runAspectSentimentAdvance = genForrunAspectSentimentAdvance();

    private static HttpRequestDef<RunAspectSentimentAdvanceRequest, RunAspectSentimentAdvanceResponse> genForrunAspectSentimentAdvance() {
        // basic
        HttpRequestDef.Builder<RunAspectSentimentAdvanceRequest, RunAspectSentimentAdvanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunAspectSentimentAdvanceRequest.class, RunAspectSentimentAdvanceResponse.class)
                .withName("RunAspectSentimentAdvance")
                .withUri("/v1/{project_id}/nlu/aspect-sentiment/advance")
                .withContentType("application/json");

        // requests
        builder.<AspectSentimentAdvanceRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AspectSentimentAdvanceRequest.class),
            f -> f.withMarshaller(RunAspectSentimentAdvanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RunClassificationRequest, RunClassificationResponse> runClassification = genForrunClassification();

    private static HttpRequestDef<RunClassificationRequest, RunClassificationResponse> genForrunClassification() {
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
            f -> f.withMarshaller(RunClassificationRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RunConstituencyParserRequest, RunConstituencyParserResponse> runConstituencyParser = genForrunConstituencyParser();

    private static HttpRequestDef<RunConstituencyParserRequest, RunConstituencyParserResponse> genForrunConstituencyParser() {
        // basic
        HttpRequestDef.Builder<RunConstituencyParserRequest, RunConstituencyParserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunConstituencyParserRequest.class, RunConstituencyParserResponse.class)
                .withName("RunConstituencyParser")
                .withUri("/v1/{project_id}/nlp-fundamental/constituency-parser")
                .withContentType("application/json");

        // requests
        builder.<ConstituencyParserReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConstituencyParserReq.class),
            f -> f.withMarshaller(RunConstituencyParserRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RunDependencyParserRequest, RunDependencyParserResponse> runDependencyParser = genForrunDependencyParser();

    private static HttpRequestDef<RunDependencyParserRequest, RunDependencyParserResponse> genForrunDependencyParser() {
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
            f -> f.withMarshaller(RunDependencyParserRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RunDocClassificationRequest, RunDocClassificationResponse> runDocClassification = genForrunDocClassification();

    private static HttpRequestDef<RunDocClassificationRequest, RunDocClassificationResponse> genForrunDocClassification() {
        // basic
        HttpRequestDef.Builder<RunDocClassificationRequest, RunDocClassificationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunDocClassificationRequest.class, RunDocClassificationResponse.class)
                .withName("RunDocClassification")
                .withUri("/v1/{project_id}/nlu/doc-classification")
                .withContentType("application/json");

        // requests
        builder.<DocumentClassificationReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DocumentClassificationReq.class),
            f -> f.withMarshaller(RunDocClassificationRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RunDomainSentimentRequest, RunDomainSentimentResponse> runDomainSentiment = genForrunDomainSentiment();

    private static HttpRequestDef<RunDomainSentimentRequest, RunDomainSentimentResponse> genForrunDomainSentiment() {
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
            f -> f.withMarshaller(RunDomainSentimentRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RunEntityLinkingRequest, RunEntityLinkingResponse> runEntityLinking = genForrunEntityLinking();

    private static HttpRequestDef<RunEntityLinkingRequest, RunEntityLinkingResponse> genForrunEntityLinking() {
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
            f -> f.withMarshaller(RunEntityLinkingRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RunEntitySentimentRequest, RunEntitySentimentResponse> runEntitySentiment = genForrunEntitySentiment();

    private static HttpRequestDef<RunEntitySentimentRequest, RunEntitySentimentResponse> genForrunEntitySentiment() {
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
            f -> f.withMarshaller(RunEntitySentimentRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RunEventExtractionRequest, RunEventExtractionResponse> runEventExtraction = genForrunEventExtraction();

    private static HttpRequestDef<RunEventExtractionRequest, RunEventExtractionResponse> genForrunEventExtraction() {
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
            f -> f.withMarshaller(RunEventExtractionRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RunFileTranslationRequest, RunFileTranslationResponse> runFileTranslation = genForrunFileTranslation();

    private static HttpRequestDef<RunFileTranslationRequest, RunFileTranslationResponse> genForrunFileTranslation() {
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
            f -> f.withMarshaller(RunFileTranslationRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RunGetFileTranslationResultRequest, RunGetFileTranslationResultResponse> runGetFileTranslationResult = genForrunGetFileTranslationResult();

    private static HttpRequestDef<RunGetFileTranslationResultRequest, RunGetFileTranslationResultResponse> genForrunGetFileTranslationResult() {
        // basic
        HttpRequestDef.Builder<RunGetFileTranslationResultRequest, RunGetFileTranslationResultResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, RunGetFileTranslationResultRequest.class, RunGetFileTranslationResultResponse.class)
                .withName("RunGetFileTranslationResult")
                .withUri("/v1/{project_id}/machine-translation/file-translation/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunGetFileTranslationResultRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RunKeywordExtractRequest, RunKeywordExtractResponse> runKeywordExtract = genForrunKeywordExtract();

    private static HttpRequestDef<RunKeywordExtractRequest, RunKeywordExtractResponse> genForrunKeywordExtract() {
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
            f -> f.withMarshaller(RunKeywordExtractRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RunLanguageDetectionRequest, RunLanguageDetectionResponse> runLanguageDetection = genForrunLanguageDetection();

    private static HttpRequestDef<RunLanguageDetectionRequest, RunLanguageDetectionResponse> genForrunLanguageDetection() {
        // basic
        HttpRequestDef.Builder<RunLanguageDetectionRequest, RunLanguageDetectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunLanguageDetectionRequest.class, RunLanguageDetectionResponse.class)
                .withName("RunLanguageDetection")
                .withUri("/v1/{project_id}/machine-translation/language-detection")
                .withContentType("application/json");

        // requests
        builder.<LanguageDetectionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LanguageDetectionReq.class),
            f -> f.withMarshaller(RunLanguageDetectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RunMultiGrainedSegmentRequest, RunMultiGrainedSegmentResponse> runMultiGrainedSegment = genForrunMultiGrainedSegment();

    private static HttpRequestDef<RunMultiGrainedSegmentRequest, RunMultiGrainedSegmentResponse> genForrunMultiGrainedSegment() {
        // basic
        HttpRequestDef.Builder<RunMultiGrainedSegmentRequest, RunMultiGrainedSegmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunMultiGrainedSegmentRequest.class, RunMultiGrainedSegmentResponse.class)
                .withName("RunMultiGrainedSegment")
                .withUri("/v1/{project_id}/nlp-fundamental/multi-grained-segment")
                .withContentType("application/json");

        // requests
        builder.<PostMultiGrainedSegmentReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostMultiGrainedSegmentReq.class),
            f -> f.withMarshaller(RunMultiGrainedSegmentRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RunNerRequest, RunNerResponse> runNer = genForrunNer();

    private static HttpRequestDef<RunNerRequest, RunNerResponse> genForrunNer() {
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
            f -> f.withMarshaller(RunNerRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RunNerDomainRequest, RunNerDomainResponse> runNerDomain = genForrunNerDomain();

    private static HttpRequestDef<RunNerDomainRequest, RunNerDomainResponse> genForrunNerDomain() {
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
            f -> f.withMarshaller(RunNerDomainRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RunPoemRequest, RunPoemResponse> runPoem = genForrunPoem();

    private static HttpRequestDef<RunPoemRequest, RunPoemResponse> genForrunPoem() {
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
            f -> f.withMarshaller(RunPoemRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RunSegmentRequest, RunSegmentResponse> runSegment = genForrunSegment();

    private static HttpRequestDef<RunSegmentRequest, RunSegmentResponse> genForrunSegment() {
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
            f -> f.withMarshaller(RunSegmentRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RunSemanticParserRequest, RunSemanticParserResponse> runSemanticParser = genForrunSemanticParser();

    private static HttpRequestDef<RunSemanticParserRequest, RunSemanticParserResponse> genForrunSemanticParser() {
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
            f -> f.withMarshaller(RunSemanticParserRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RunSentenceEmbeddingRequest, RunSentenceEmbeddingResponse> runSentenceEmbedding = genForrunSentenceEmbedding();

    private static HttpRequestDef<RunSentenceEmbeddingRequest, RunSentenceEmbeddingResponse> genForrunSentenceEmbedding() {
        // basic
        HttpRequestDef.Builder<RunSentenceEmbeddingRequest, RunSentenceEmbeddingResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunSentenceEmbeddingRequest.class, RunSentenceEmbeddingResponse.class)
                .withName("RunSentenceEmbedding")
                .withUri("/v1/{project_id}/nlp-fundamental/sentence-embedding")
                .withContentType("application/json");

        // requests
        builder.<PostSentenceEmbeddingReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostSentenceEmbeddingReq.class),
            f -> f.withMarshaller(RunSentenceEmbeddingRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RunSentimentRequest, RunSentimentResponse> runSentiment = genForrunSentiment();

    private static HttpRequestDef<RunSentimentRequest, RunSentimentResponse> genForrunSentiment() {
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
            f -> f.withMarshaller(RunSentimentRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RunSummaryRequest, RunSummaryResponse> runSummary = genForrunSummary();

    private static HttpRequestDef<RunSummaryRequest, RunSummaryResponse> genForrunSummary() {
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
            f -> f.withMarshaller(RunSummaryRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RunSummaryDomainRequest, RunSummaryDomainResponse> runSummaryDomain = genForrunSummaryDomain();

    private static HttpRequestDef<RunSummaryDomainRequest, RunSummaryDomainResponse> genForrunSummaryDomain() {
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
            f -> f.withMarshaller(RunSummaryDomainRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RunTextSimilarityRequest, RunTextSimilarityResponse> runTextSimilarity = genForrunTextSimilarity();

    private static HttpRequestDef<RunTextSimilarityRequest, RunTextSimilarityResponse> genForrunTextSimilarity() {
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
            f -> f.withMarshaller(RunTextSimilarityRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RunTextSimilarityAdvanceRequest, RunTextSimilarityAdvanceResponse> runTextSimilarityAdvance = genForrunTextSimilarityAdvance();

    private static HttpRequestDef<RunTextSimilarityAdvanceRequest, RunTextSimilarityAdvanceResponse> genForrunTextSimilarityAdvance() {
        // basic
        HttpRequestDef.Builder<RunTextSimilarityAdvanceRequest, RunTextSimilarityAdvanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunTextSimilarityAdvanceRequest.class, RunTextSimilarityAdvanceResponse.class)
                .withName("RunTextSimilarityAdvance")
                .withUri("/v1/{project_id}/nlp-fundamental/text-similarity/advance")
                .withContentType("application/json");

        // requests
        builder.<TextSimilarityAdvanceRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TextSimilarityAdvanceRequest.class),
            f -> f.withMarshaller(RunTextSimilarityAdvanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<RunTextTranslationRequest, RunTextTranslationResponse> runTextTranslation = genForrunTextTranslation();

    private static HttpRequestDef<RunTextTranslationRequest, RunTextTranslationResponse> genForrunTextTranslation() {
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
            f -> f.withMarshaller(RunTextTranslationRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

}

package com.huaweicloud.sdk.image.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.image.v2.model.*;

@SuppressWarnings("unchecked")
public class ImageMeta {

    public static final HttpRequestDef<RunCelebrityRecognitionRequest, RunCelebrityRecognitionResponse> runCelebrityRecognition =
        genForrunCelebrityRecognition();

    private static HttpRequestDef<RunCelebrityRecognitionRequest, RunCelebrityRecognitionResponse> genForrunCelebrityRecognition() {
        // basic
        HttpRequestDef.Builder<RunCelebrityRecognitionRequest, RunCelebrityRecognitionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RunCelebrityRecognitionRequest.class, RunCelebrityRecognitionResponse.class)
            .withName("RunCelebrityRecognition")
            .withUri("/v2/{project_id}/image/celebrity-recognition")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CelebrityRecognitionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CelebrityRecognitionReq.class),
            f -> f.withMarshaller(RunCelebrityRecognitionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunImageMainObjectDetectionRequest, RunImageMainObjectDetectionResponse> runImageMainObjectDetection =
        genForrunImageMainObjectDetection();

    private static HttpRequestDef<RunImageMainObjectDetectionRequest, RunImageMainObjectDetectionResponse> genForrunImageMainObjectDetection() {
        // basic
        HttpRequestDef.Builder<RunImageMainObjectDetectionRequest, RunImageMainObjectDetectionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RunImageMainObjectDetectionRequest.class,
                    RunImageMainObjectDetectionResponse.class)
                .withName("RunImageMainObjectDetection")
                .withUri("/v3/{project_id}/image/main-object-detection")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ImageMainObjectDetectionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImageMainObjectDetectionReq.class),
            f -> f.withMarshaller(RunImageMainObjectDetectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunImageMediaTaggingRequest, RunImageMediaTaggingResponse> runImageMediaTagging =
        genForrunImageMediaTagging();

    private static HttpRequestDef<RunImageMediaTaggingRequest, RunImageMediaTaggingResponse> genForrunImageMediaTagging() {
        // basic
        HttpRequestDef.Builder<RunImageMediaTaggingRequest, RunImageMediaTaggingResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RunImageMediaTaggingRequest.class, RunImageMediaTaggingResponse.class)
            .withName("RunImageMediaTagging")
            .withUri("/v2/{project_id}/image/media-tagging")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ImageMediaTaggingReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImageMediaTaggingReq.class),
            f -> f.withMarshaller(RunImageMediaTaggingRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunImageTaggingRequest, RunImageTaggingResponse> runImageTagging =
        genForrunImageTagging();

    private static HttpRequestDef<RunImageTaggingRequest, RunImageTaggingResponse> genForrunImageTagging() {
        // basic
        HttpRequestDef.Builder<RunImageTaggingRequest, RunImageTaggingResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunImageTaggingRequest.class, RunImageTaggingResponse.class)
                .withName("RunImageTagging")
                .withUri("/v2/{project_id}/image/tagging")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ImageTaggingReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImageTaggingReq.class),
            f -> f.withMarshaller(RunImageTaggingRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}

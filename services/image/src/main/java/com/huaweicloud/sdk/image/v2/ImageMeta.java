package com.huaweicloud.sdk.image.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.image.v2.model.CelebrityRecognitionReq;
import com.huaweicloud.sdk.image.v2.model.ImageMainObjectDetectionReq;
import com.huaweicloud.sdk.image.v2.model.ImageMediaTaggingDetReq;
import com.huaweicloud.sdk.image.v2.model.ImageMediaTaggingReq;
import com.huaweicloud.sdk.image.v2.model.ImageTaggingReq;
import com.huaweicloud.sdk.image.v2.model.RecaptureDetectReq;
import com.huaweicloud.sdk.image.v2.model.RunCelebrityRecognitionRequest;
import com.huaweicloud.sdk.image.v2.model.RunCelebrityRecognitionResponse;
import com.huaweicloud.sdk.image.v2.model.RunImageMainObjectDetectionRequest;
import com.huaweicloud.sdk.image.v2.model.RunImageMainObjectDetectionResponse;
import com.huaweicloud.sdk.image.v2.model.RunImageMediaTaggingDetRequest;
import com.huaweicloud.sdk.image.v2.model.RunImageMediaTaggingDetResponse;
import com.huaweicloud.sdk.image.v2.model.RunImageMediaTaggingRequest;
import com.huaweicloud.sdk.image.v2.model.RunImageMediaTaggingResponse;
import com.huaweicloud.sdk.image.v2.model.RunImageTaggingRequest;
import com.huaweicloud.sdk.image.v2.model.RunImageTaggingResponse;
import com.huaweicloud.sdk.image.v2.model.RunRecaptureDetectRequest;
import com.huaweicloud.sdk.image.v2.model.RunRecaptureDetectResponse;

@SuppressWarnings("unchecked")
public class ImageMeta {

    public static final HttpRequestDef<RunCelebrityRecognitionRequest, RunCelebrityRecognitionResponse> runCelebrityRecognition =
        genForRunCelebrityRecognition();

    private static HttpRequestDef<RunCelebrityRecognitionRequest, RunCelebrityRecognitionResponse> genForRunCelebrityRecognition() {
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
            f -> f.withMarshaller(RunCelebrityRecognitionRequest::getBody, RunCelebrityRecognitionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunImageMainObjectDetectionRequest, RunImageMainObjectDetectionResponse> runImageMainObjectDetection =
        genForRunImageMainObjectDetection();

    private static HttpRequestDef<RunImageMainObjectDetectionRequest, RunImageMainObjectDetectionResponse> genForRunImageMainObjectDetection() {
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
            f -> f.withMarshaller(RunImageMainObjectDetectionRequest::getBody,
                RunImageMainObjectDetectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunImageMediaTaggingRequest, RunImageMediaTaggingResponse> runImageMediaTagging =
        genForRunImageMediaTagging();

    private static HttpRequestDef<RunImageMediaTaggingRequest, RunImageMediaTaggingResponse> genForRunImageMediaTagging() {
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
            f -> f.withMarshaller(RunImageMediaTaggingRequest::getBody, RunImageMediaTaggingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunImageMediaTaggingDetRequest, RunImageMediaTaggingDetResponse> runImageMediaTaggingDet =
        genForRunImageMediaTaggingDet();

    private static HttpRequestDef<RunImageMediaTaggingDetRequest, RunImageMediaTaggingDetResponse> genForRunImageMediaTaggingDet() {
        // basic
        HttpRequestDef.Builder<RunImageMediaTaggingDetRequest, RunImageMediaTaggingDetResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RunImageMediaTaggingDetRequest.class, RunImageMediaTaggingDetResponse.class)
            .withName("RunImageMediaTaggingDet")
            .withUri("/v2/{project_id}/image/media-tagging-det")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ImageMediaTaggingDetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImageMediaTaggingDetReq.class),
            f -> f.withMarshaller(RunImageMediaTaggingDetRequest::getBody, RunImageMediaTaggingDetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunImageTaggingRequest, RunImageTaggingResponse> runImageTagging =
        genForRunImageTagging();

    private static HttpRequestDef<RunImageTaggingRequest, RunImageTaggingResponse> genForRunImageTagging() {
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
            f -> f.withMarshaller(RunImageTaggingRequest::getBody, RunImageTaggingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunRecaptureDetectRequest, RunRecaptureDetectResponse> runRecaptureDetect =
        genForRunRecaptureDetect();

    private static HttpRequestDef<RunRecaptureDetectRequest, RunRecaptureDetectResponse> genForRunRecaptureDetect() {
        // basic
        HttpRequestDef.Builder<RunRecaptureDetectRequest, RunRecaptureDetectResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunRecaptureDetectRequest.class, RunRecaptureDetectResponse.class)
                .withName("RunRecaptureDetect")
                .withUri("/v2/{project_id}/image/recapture-detect")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<RecaptureDetectReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RecaptureDetectReq.class),
            f -> f.withMarshaller(RunRecaptureDetectRequest::getBody, RunRecaptureDetectRequest::setBody));

        // response

        return builder.build();
    }

}

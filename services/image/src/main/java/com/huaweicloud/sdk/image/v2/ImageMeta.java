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

    public static final HttpRequestDef<RunDeleteCustomTagsRequest, RunDeleteCustomTagsResponse> runDeleteCustomTags =
        genForrunDeleteCustomTags();

    private static HttpRequestDef<RunDeleteCustomTagsRequest, RunDeleteCustomTagsResponse> genForrunDeleteCustomTags() {
        // basic
        HttpRequestDef.Builder<RunDeleteCustomTagsRequest, RunDeleteCustomTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, RunDeleteCustomTagsRequest.class, RunDeleteCustomTagsResponse.class)
            .withName("RunDeleteCustomTags")
            .withUri("/v2/{project_id}/image/media-tagging/custom-tags")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunImageDescriptionRequest, RunImageDescriptionResponse> runImageDescription =
        genForrunImageDescription();

    private static HttpRequestDef<RunImageDescriptionRequest, RunImageDescriptionResponse> genForrunImageDescription() {
        // basic
        HttpRequestDef.Builder<RunImageDescriptionRequest, RunImageDescriptionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunImageDescriptionRequest.class, RunImageDescriptionResponse.class)
                .withName("RunImageDescription")
                .withUri("/v2/{project_id}/image/description")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ImageDescriptionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImageDescriptionReq.class),
            f -> f.withMarshaller(RunImageDescriptionRequest::getBody, (req, v) -> {
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

    public static final HttpRequestDef<RunImageMediaTaggingDetRequest, RunImageMediaTaggingDetResponse> runImageMediaTaggingDet =
        genForrunImageMediaTaggingDet();

    private static HttpRequestDef<RunImageMediaTaggingDetRequest, RunImageMediaTaggingDetResponse> genForrunImageMediaTaggingDet() {
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
            f -> f.withMarshaller(RunImageMediaTaggingDetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunImageSuperResolutionRequest, RunImageSuperResolutionResponse> runImageSuperResolution =
        genForrunImageSuperResolution();

    private static HttpRequestDef<RunImageSuperResolutionRequest, RunImageSuperResolutionResponse> genForrunImageSuperResolution() {
        // basic
        HttpRequestDef.Builder<RunImageSuperResolutionRequest, RunImageSuperResolutionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RunImageSuperResolutionRequest.class, RunImageSuperResolutionResponse.class)
            .withName("RunImageSuperResolution")
            .withUri("/v2/{project_id}/image/image-super-resolution")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ImageSuperResolutionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImageSuperResolutionReq.class),
            f -> f.withMarshaller(RunImageSuperResolutionRequest::getBody, (req, v) -> {
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

    public static final HttpRequestDef<RunQueryCustomTagsRequest, RunQueryCustomTagsResponse> runQueryCustomTags =
        genForrunQueryCustomTags();

    private static HttpRequestDef<RunQueryCustomTagsRequest, RunQueryCustomTagsResponse> genForrunQueryCustomTags() {
        // basic
        HttpRequestDef.Builder<RunQueryCustomTagsRequest, RunQueryCustomTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, RunQueryCustomTagsRequest.class, RunQueryCustomTagsResponse.class)
                .withName("RunQueryCustomTags")
                .withUri("/v2/{project_id}/image/media-tagging/custom-tags/check")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunRecaptureDetectRequest, RunRecaptureDetectResponse> runRecaptureDetect =
        genForrunRecaptureDetect();

    private static HttpRequestDef<RunRecaptureDetectRequest, RunRecaptureDetectResponse> genForrunRecaptureDetect() {
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
            f -> f.withMarshaller(RunRecaptureDetectRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}

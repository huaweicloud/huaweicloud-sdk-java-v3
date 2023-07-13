package com.huaweicloud.sdk.image.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.image.v2.model.CelebrityRecognitionReq;
import com.huaweicloud.sdk.image.v2.model.CreateImageHighresolutionMattingTaskRequest;
import com.huaweicloud.sdk.image.v2.model.CreateImageHighresolutionMattingTaskResponse;
import com.huaweicloud.sdk.image.v2.model.CreateVideoTaggingMediaTaskRequest;
import com.huaweicloud.sdk.image.v2.model.CreateVideoTaggingMediaTaskRequestBody;
import com.huaweicloud.sdk.image.v2.model.CreateVideoTaggingMediaTaskResponse;
import com.huaweicloud.sdk.image.v2.model.ImageDescriptionReq;
import com.huaweicloud.sdk.image.v2.model.ImageHighresolutionMattingRequestBody;
import com.huaweicloud.sdk.image.v2.model.ImageMainObjectDetectionReq;
import com.huaweicloud.sdk.image.v2.model.ImageMediaTaggingDetReq;
import com.huaweicloud.sdk.image.v2.model.ImageMediaTaggingReq;
import com.huaweicloud.sdk.image.v2.model.ImageSuperResolutionReq;
import com.huaweicloud.sdk.image.v2.model.ImageTaggingReq;
import com.huaweicloud.sdk.image.v2.model.RecaptureDetectReq;
import com.huaweicloud.sdk.image.v2.model.RunCelebrityRecognitionRequest;
import com.huaweicloud.sdk.image.v2.model.RunCelebrityRecognitionResponse;
import com.huaweicloud.sdk.image.v2.model.RunImageDescriptionRequest;
import com.huaweicloud.sdk.image.v2.model.RunImageDescriptionResponse;
import com.huaweicloud.sdk.image.v2.model.RunImageMainObjectDetectionRequest;
import com.huaweicloud.sdk.image.v2.model.RunImageMainObjectDetectionResponse;
import com.huaweicloud.sdk.image.v2.model.RunImageMediaTaggingDetRequest;
import com.huaweicloud.sdk.image.v2.model.RunImageMediaTaggingDetResponse;
import com.huaweicloud.sdk.image.v2.model.RunImageMediaTaggingRequest;
import com.huaweicloud.sdk.image.v2.model.RunImageMediaTaggingResponse;
import com.huaweicloud.sdk.image.v2.model.RunImageSuperResolutionRequest;
import com.huaweicloud.sdk.image.v2.model.RunImageSuperResolutionResponse;
import com.huaweicloud.sdk.image.v2.model.RunImageTaggingRequest;
import com.huaweicloud.sdk.image.v2.model.RunImageTaggingResponse;
import com.huaweicloud.sdk.image.v2.model.RunRecaptureDetectRequest;
import com.huaweicloud.sdk.image.v2.model.RunRecaptureDetectResponse;
import com.huaweicloud.sdk.image.v2.model.ShowImageHighresolutionMattingTaskRequest;
import com.huaweicloud.sdk.image.v2.model.ShowImageHighresolutionMattingTaskResponse;
import com.huaweicloud.sdk.image.v2.model.ShowVideoTaggingMediaTaskRequest;
import com.huaweicloud.sdk.image.v2.model.ShowVideoTaggingMediaTaskResponse;

@SuppressWarnings("unchecked")
public class ImageMeta {

    public static final HttpRequestDef<CreateImageHighresolutionMattingTaskRequest, CreateImageHighresolutionMattingTaskResponse> createImageHighresolutionMattingTask =
        genForcreateImageHighresolutionMattingTask();

    private static HttpRequestDef<CreateImageHighresolutionMattingTaskRequest, CreateImageHighresolutionMattingTaskResponse> genForcreateImageHighresolutionMattingTask() {
        // basic
        HttpRequestDef.Builder<CreateImageHighresolutionMattingTaskRequest, CreateImageHighresolutionMattingTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateImageHighresolutionMattingTaskRequest.class,
                    CreateImageHighresolutionMattingTaskResponse.class)
                .withName("CreateImageHighresolutionMattingTask")
                .withUri("/v2/{project_id}/image/image-highresolution-matting/tasks")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ImageHighresolutionMattingRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImageHighresolutionMattingRequestBody.class),
            f -> f.withMarshaller(CreateImageHighresolutionMattingTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateImageHighresolutionMattingTaskResponse::getXRequestId,
                CreateImageHighresolutionMattingTaskResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateVideoTaggingMediaTaskRequest, CreateVideoTaggingMediaTaskResponse> createVideoTaggingMediaTask =
        genForcreateVideoTaggingMediaTask();

    private static HttpRequestDef<CreateVideoTaggingMediaTaskRequest, CreateVideoTaggingMediaTaskResponse> genForcreateVideoTaggingMediaTask() {
        // basic
        HttpRequestDef.Builder<CreateVideoTaggingMediaTaskRequest, CreateVideoTaggingMediaTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateVideoTaggingMediaTaskRequest.class,
                    CreateVideoTaggingMediaTaskResponse.class)
                .withName("CreateVideoTaggingMediaTask")
                .withUri("/v2/{project_id}/image/video-tagging-media/tasks")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateVideoTaggingMediaTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVideoTaggingMediaTaskRequestBody.class),
            f -> f.withMarshaller(CreateVideoTaggingMediaTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateVideoTaggingMediaTaskResponse::getXRequestId,
                CreateVideoTaggingMediaTaskResponse::setXRequestId));
        return builder.build();
    }

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

    public static final HttpRequestDef<ShowImageHighresolutionMattingTaskRequest, ShowImageHighresolutionMattingTaskResponse> showImageHighresolutionMattingTask =
        genForshowImageHighresolutionMattingTask();

    private static HttpRequestDef<ShowImageHighresolutionMattingTaskRequest, ShowImageHighresolutionMattingTaskResponse> genForshowImageHighresolutionMattingTask() {
        // basic
        HttpRequestDef.Builder<ShowImageHighresolutionMattingTaskRequest, ShowImageHighresolutionMattingTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowImageHighresolutionMattingTaskRequest.class,
                    ShowImageHighresolutionMattingTaskResponse.class)
                .withName("ShowImageHighresolutionMattingTask")
                .withUri("/v2/{project_id}/image/image-highresolution-matting/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageHighresolutionMattingTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowImageHighresolutionMattingTaskResponse::getXRequestId,
                ShowImageHighresolutionMattingTaskResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowVideoTaggingMediaTaskRequest, ShowVideoTaggingMediaTaskResponse> showVideoTaggingMediaTask =
        genForshowVideoTaggingMediaTask();

    private static HttpRequestDef<ShowVideoTaggingMediaTaskRequest, ShowVideoTaggingMediaTaskResponse> genForshowVideoTaggingMediaTask() {
        // basic
        HttpRequestDef.Builder<ShowVideoTaggingMediaTaskRequest, ShowVideoTaggingMediaTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowVideoTaggingMediaTaskRequest.class,
                    ShowVideoTaggingMediaTaskResponse.class)
                .withName("ShowVideoTaggingMediaTask")
                .withUri("/v2/{project_id}/image/video-tagging-media/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVideoTaggingMediaTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowVideoTaggingMediaTaskResponse::getXRequestId,
                ShowVideoTaggingMediaTaskResponse::setXRequestId));
        return builder.build();
    }

}

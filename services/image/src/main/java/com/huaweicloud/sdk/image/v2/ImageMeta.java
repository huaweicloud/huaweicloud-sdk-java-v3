package com.huaweicloud.sdk.image.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.image.v2.model.*;

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

    public static final HttpRequestDef<CreateImageToVideoTaskRequest, CreateImageToVideoTaskResponse> createImageToVideoTask =
        genForcreateImageToVideoTask();

    private static HttpRequestDef<CreateImageToVideoTaskRequest, CreateImageToVideoTaskResponse> genForcreateImageToVideoTask() {
        // basic
        HttpRequestDef.Builder<CreateImageToVideoTaskRequest, CreateImageToVideoTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateImageToVideoTaskRequest.class, CreateImageToVideoTaskResponse.class)
            .withName("CreateImageToVideoTask")
            .withUri("/v2/{project_id}/image/image-to-video/tasks")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ImageToVideoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImageToVideoRequestBody.class),
            f -> f.withMarshaller(CreateImageToVideoTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateImageToVideoTaskResponse::getXRequestId,
                CreateImageToVideoTaskResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateImageTranslateTaskRequest, CreateImageTranslateTaskResponse> createImageTranslateTask =
        genForcreateImageTranslateTask();

    private static HttpRequestDef<CreateImageTranslateTaskRequest, CreateImageTranslateTaskResponse> genForcreateImageTranslateTask() {
        // basic
        HttpRequestDef.Builder<CreateImageTranslateTaskRequest, CreateImageTranslateTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateImageTranslateTaskRequest.class, CreateImageTranslateTaskResponse.class)
                .withName("CreateImageTranslateTask")
                .withUri("/v2/{project_id}/image/image-wisedesign-translate/tasks")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ImageTranslateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImageTranslateRequestBody.class),
            f -> f.withMarshaller(CreateImageTranslateTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateImageTranslateTaskResponse::getXRequestId,
                CreateImageTranslateTaskResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateVideoCoverAnalysisTaskRequest, CreateVideoCoverAnalysisTaskResponse> createVideoCoverAnalysisTask =
        genForcreateVideoCoverAnalysisTask();

    private static HttpRequestDef<CreateVideoCoverAnalysisTaskRequest, CreateVideoCoverAnalysisTaskResponse> genForcreateVideoCoverAnalysisTask() {
        // basic
        HttpRequestDef.Builder<CreateVideoCoverAnalysisTaskRequest, CreateVideoCoverAnalysisTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateVideoCoverAnalysisTaskRequest.class,
                    CreateVideoCoverAnalysisTaskResponse.class)
                .withName("CreateVideoCoverAnalysisTask")
                .withUri("/v2/{project_id}/image/video-cover-analysis/tasks")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<VideoCoverAnalysisCreateTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VideoCoverAnalysisCreateTaskRequestBody.class),
            f -> f.withMarshaller(CreateVideoCoverAnalysisTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateVideoCoverAnalysisTaskResponse::getXRequestId,
                CreateVideoCoverAnalysisTaskResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateVideoCuttingTaskRequest, CreateVideoCuttingTaskResponse> createVideoCuttingTask =
        genForcreateVideoCuttingTask();

    private static HttpRequestDef<CreateVideoCuttingTaskRequest, CreateVideoCuttingTaskResponse> genForcreateVideoCuttingTask() {
        // basic
        HttpRequestDef.Builder<CreateVideoCuttingTaskRequest, CreateVideoCuttingTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateVideoCuttingTaskRequest.class, CreateVideoCuttingTaskResponse.class)
            .withName("CreateVideoCuttingTask")
            .withUri("/v2/{project_id}/image/video-cutting/tasks")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<VideoCuttingRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VideoCuttingRequestBody.class),
            f -> f.withMarshaller(CreateVideoCuttingTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateVideoCuttingTaskResponse::getXRequestId,
                CreateVideoCuttingTaskResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateVideoObjectMaskingTaskRequest, CreateVideoObjectMaskingTaskResponse> createVideoObjectMaskingTask =
        genForcreateVideoObjectMaskingTask();

    private static HttpRequestDef<CreateVideoObjectMaskingTaskRequest, CreateVideoObjectMaskingTaskResponse> genForcreateVideoObjectMaskingTask() {
        // basic
        HttpRequestDef.Builder<CreateVideoObjectMaskingTaskRequest, CreateVideoObjectMaskingTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateVideoObjectMaskingTaskRequest.class,
                    CreateVideoObjectMaskingTaskResponse.class)
                .withName("CreateVideoObjectMaskingTask")
                .withUri("/v2/{project_id}/image/video-object-masking/tasks")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateVideoObjectMaskingTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVideoObjectMaskingTaskRequestBody.class),
            f -> f.withMarshaller(CreateVideoObjectMaskingTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVideoShotSplitTaskRequest, CreateVideoShotSplitTaskResponse> createVideoShotSplitTask =
        genForcreateVideoShotSplitTask();

    private static HttpRequestDef<CreateVideoShotSplitTaskRequest, CreateVideoShotSplitTaskResponse> genForcreateVideoShotSplitTask() {
        // basic
        HttpRequestDef.Builder<CreateVideoShotSplitTaskRequest, CreateVideoShotSplitTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateVideoShotSplitTaskRequest.class, CreateVideoShotSplitTaskResponse.class)
                .withName("CreateVideoShotSplitTask")
                .withUri("/v2/{project_id}/image/video-shot-split/tasks")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateVideoSplitTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVideoSplitTaskRequestBody.class),
            f -> f.withMarshaller(CreateVideoShotSplitTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVideoSummarizationAnalysisTaskRequest, CreateVideoSummarizationAnalysisTaskResponse> createVideoSummarizationAnalysisTask =
        genForcreateVideoSummarizationAnalysisTask();

    private static HttpRequestDef<CreateVideoSummarizationAnalysisTaskRequest, CreateVideoSummarizationAnalysisTaskResponse> genForcreateVideoSummarizationAnalysisTask() {
        // basic
        HttpRequestDef.Builder<CreateVideoSummarizationAnalysisTaskRequest, CreateVideoSummarizationAnalysisTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateVideoSummarizationAnalysisTaskRequest.class,
                    CreateVideoSummarizationAnalysisTaskResponse.class)
                .withName("CreateVideoSummarizationAnalysisTask")
                .withUri("/v2/{project_id}/image/video-summarization-analysis/tasks")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<VideoSummarizationCreateTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VideoSummarizationCreateTaskRequestBody.class),
            f -> f.withMarshaller(CreateVideoSummarizationAnalysisTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVideoSynthesisTaskRequest, CreateVideoSynthesisTaskResponse> createVideoSynthesisTask =
        genForcreateVideoSynthesisTask();

    private static HttpRequestDef<CreateVideoSynthesisTaskRequest, CreateVideoSynthesisTaskResponse> genForcreateVideoSynthesisTask() {
        // basic
        HttpRequestDef.Builder<CreateVideoSynthesisTaskRequest, CreateVideoSynthesisTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateVideoSynthesisTaskRequest.class, CreateVideoSynthesisTaskResponse.class)
                .withName("CreateVideoSynthesisTask")
                .withUri("/v2/{project_id}/image/video-synthesis/tasks")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<VideoSynthesisRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VideoSynthesisRequestBody.class),
            f -> f.withMarshaller(CreateVideoSynthesisTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateVideoSynthesisTaskResponse::getXRequestId,
                CreateVideoSynthesisTaskResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateVideoTranslateTaskRequest, CreateVideoTranslateTaskResponse> createVideoTranslateTask =
        genForcreateVideoTranslateTask();

    private static HttpRequestDef<CreateVideoTranslateTaskRequest, CreateVideoTranslateTaskResponse> genForcreateVideoTranslateTask() {
        // basic
        HttpRequestDef.Builder<CreateVideoTranslateTaskRequest, CreateVideoTranslateTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateVideoTranslateTaskRequest.class, CreateVideoTranslateTaskResponse.class)
                .withName("CreateVideoTranslateTask")
                .withUri("/v2/{project_id}/image/video-translate/tasks")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<VideoTranslateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VideoTranslateRequestBody.class),
            f -> f.withMarshaller(CreateVideoTranslateTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateVideoTranslateTaskResponse::getXRequestId,
                CreateVideoTranslateTaskResponse::setXRequestId));
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

    public static final HttpRequestDef<RunImageWisedesignCropRequest, RunImageWisedesignCropResponse> runImageWisedesignCrop =
        genForrunImageWisedesignCrop();

    private static HttpRequestDef<RunImageWisedesignCropRequest, RunImageWisedesignCropResponse> genForrunImageWisedesignCrop() {
        // basic
        HttpRequestDef.Builder<RunImageWisedesignCropRequest, RunImageWisedesignCropResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RunImageWisedesignCropRequest.class, RunImageWisedesignCropResponse.class)
            .withName("RunImageWisedesignCrop")
            .withUri("/v2/{project_id}/image/image-wisedesign-crop")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ImageWisedesignCropReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImageWisedesignCropReq.class),
            f -> f.withMarshaller(RunImageWisedesignCropRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunImageWisedesignInpaintingRequest, RunImageWisedesignInpaintingResponse> runImageWisedesignInpainting =
        genForrunImageWisedesignInpainting();

    private static HttpRequestDef<RunImageWisedesignInpaintingRequest, RunImageWisedesignInpaintingResponse> genForrunImageWisedesignInpainting() {
        // basic
        HttpRequestDef.Builder<RunImageWisedesignInpaintingRequest, RunImageWisedesignInpaintingResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RunImageWisedesignInpaintingRequest.class,
                    RunImageWisedesignInpaintingResponse.class)
                .withName("RunImageWisedesignInpainting")
                .withUri("/v2/{project_id}/image/image-wisedesign-inpainting")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ImageWisedesignInpaintingReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImageWisedesignInpaintingReq.class),
            f -> f.withMarshaller(RunImageWisedesignInpaintingRequest::getBody, (req, v) -> {
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

    public static final HttpRequestDef<ShowImageToVideoTaskRequest, ShowImageToVideoTaskResponse> showImageToVideoTask =
        genForshowImageToVideoTask();

    private static HttpRequestDef<ShowImageToVideoTaskRequest, ShowImageToVideoTaskResponse> genForshowImageToVideoTask() {
        // basic
        HttpRequestDef.Builder<ShowImageToVideoTaskRequest, ShowImageToVideoTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowImageToVideoTaskRequest.class, ShowImageToVideoTaskResponse.class)
            .withName("ShowImageToVideoTask")
            .withUri("/v2/{project_id}/image/image-to-video/tasks/{task_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageToVideoTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowImageToVideoTaskResponse::getXRequestId,
                ShowImageToVideoTaskResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowImageTranslateTaskRequest, ShowImageTranslateTaskResponse> showImageTranslateTask =
        genForshowImageTranslateTask();

    private static HttpRequestDef<ShowImageTranslateTaskRequest, ShowImageTranslateTaskResponse> genForshowImageTranslateTask() {
        // basic
        HttpRequestDef.Builder<ShowImageTranslateTaskRequest, ShowImageTranslateTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowImageTranslateTaskRequest.class, ShowImageTranslateTaskResponse.class)
            .withName("ShowImageTranslateTask")
            .withUri("/v2/{project_id}/image/image-wisedesign-translate/tasks/{task_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageTranslateTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowImageTranslateTaskResponse::getXRequestId,
                ShowImageTranslateTaskResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowVideoCoverAnalysisTaskRequest, ShowVideoCoverAnalysisTaskResponse> showVideoCoverAnalysisTask =
        genForshowVideoCoverAnalysisTask();

    private static HttpRequestDef<ShowVideoCoverAnalysisTaskRequest, ShowVideoCoverAnalysisTaskResponse> genForshowVideoCoverAnalysisTask() {
        // basic
        HttpRequestDef.Builder<ShowVideoCoverAnalysisTaskRequest, ShowVideoCoverAnalysisTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowVideoCoverAnalysisTaskRequest.class,
                    ShowVideoCoverAnalysisTaskResponse.class)
                .withName("ShowVideoCoverAnalysisTask")
                .withUri("/v2/{project_id}/image/video-cover-analysis/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVideoCoverAnalysisTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowVideoCoverAnalysisTaskResponse::getXRequestId,
                ShowVideoCoverAnalysisTaskResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowVideoCuttingTaskRequest, ShowVideoCuttingTaskResponse> showVideoCuttingTask =
        genForshowVideoCuttingTask();

    private static HttpRequestDef<ShowVideoCuttingTaskRequest, ShowVideoCuttingTaskResponse> genForshowVideoCuttingTask() {
        // basic
        HttpRequestDef.Builder<ShowVideoCuttingTaskRequest, ShowVideoCuttingTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowVideoCuttingTaskRequest.class, ShowVideoCuttingTaskResponse.class)
            .withName("ShowVideoCuttingTask")
            .withUri("/v2/{project_id}/image/video-cutting/tasks/{task_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVideoCuttingTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowVideoCuttingTaskResponse::getXRequestId,
                ShowVideoCuttingTaskResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowVideoObjectMaskingTaskRequest, ShowVideoObjectMaskingTaskResponse> showVideoObjectMaskingTask =
        genForshowVideoObjectMaskingTask();

    private static HttpRequestDef<ShowVideoObjectMaskingTaskRequest, ShowVideoObjectMaskingTaskResponse> genForshowVideoObjectMaskingTask() {
        // basic
        HttpRequestDef.Builder<ShowVideoObjectMaskingTaskRequest, ShowVideoObjectMaskingTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowVideoObjectMaskingTaskRequest.class,
                    ShowVideoObjectMaskingTaskResponse.class)
                .withName("ShowVideoObjectMaskingTask")
                .withUri("/v2/{project_id}/image/video-object-masking/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVideoObjectMaskingTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowVideoObjectMaskingTaskResponse::getXRequestId,
                ShowVideoObjectMaskingTaskResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowVideoShotSplitTaskRequest, ShowVideoShotSplitTaskResponse> showVideoShotSplitTask =
        genForshowVideoShotSplitTask();

    private static HttpRequestDef<ShowVideoShotSplitTaskRequest, ShowVideoShotSplitTaskResponse> genForshowVideoShotSplitTask() {
        // basic
        HttpRequestDef.Builder<ShowVideoShotSplitTaskRequest, ShowVideoShotSplitTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowVideoShotSplitTaskRequest.class, ShowVideoShotSplitTaskResponse.class)
            .withName("ShowVideoShotSplitTask")
            .withUri("/v2/{project_id}/image/video-shot-split/tasks/{task_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVideoShotSplitTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowVideoShotSplitTaskResponse::getXRequestId,
                ShowVideoShotSplitTaskResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowVideoSummarizationAnalysisTaskRequest, ShowVideoSummarizationAnalysisTaskResponse> showVideoSummarizationAnalysisTask =
        genForshowVideoSummarizationAnalysisTask();

    private static HttpRequestDef<ShowVideoSummarizationAnalysisTaskRequest, ShowVideoSummarizationAnalysisTaskResponse> genForshowVideoSummarizationAnalysisTask() {
        // basic
        HttpRequestDef.Builder<ShowVideoSummarizationAnalysisTaskRequest, ShowVideoSummarizationAnalysisTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowVideoSummarizationAnalysisTaskRequest.class,
                    ShowVideoSummarizationAnalysisTaskResponse.class)
                .withName("ShowVideoSummarizationAnalysisTask")
                .withUri("/v2/{project_id}/image/video-summarization-analysis/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVideoSummarizationAnalysisTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowVideoSummarizationAnalysisTaskResponse::getXRequestId,
                ShowVideoSummarizationAnalysisTaskResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowVideoSynthesisTaskRequest, ShowVideoSynthesisTaskResponse> showVideoSynthesisTask =
        genForshowVideoSynthesisTask();

    private static HttpRequestDef<ShowVideoSynthesisTaskRequest, ShowVideoSynthesisTaskResponse> genForshowVideoSynthesisTask() {
        // basic
        HttpRequestDef.Builder<ShowVideoSynthesisTaskRequest, ShowVideoSynthesisTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowVideoSynthesisTaskRequest.class, ShowVideoSynthesisTaskResponse.class)
            .withName("ShowVideoSynthesisTask")
            .withUri("/v2/{project_id}/image/video-synthesis/tasks/{task_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVideoSynthesisTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowVideoSynthesisTaskResponse::getXRequestId,
                ShowVideoSynthesisTaskResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowVideoTranslateTaskRequest, ShowVideoTranslateTaskResponse> showVideoTranslateTask =
        genForshowVideoTranslateTask();

    private static HttpRequestDef<ShowVideoTranslateTaskRequest, ShowVideoTranslateTaskResponse> genForshowVideoTranslateTask() {
        // basic
        HttpRequestDef.Builder<ShowVideoTranslateTaskRequest, ShowVideoTranslateTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowVideoTranslateTaskRequest.class, ShowVideoTranslateTaskResponse.class)
            .withName("ShowVideoTranslateTask")
            .withUri("/v2/{project_id}/image/video-translate/tasks/{task_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVideoTranslateTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowVideoTranslateTaskResponse::getXRequestId,
                ShowVideoTranslateTaskResponse::setXRequestId));
        return builder.build();
    }

}

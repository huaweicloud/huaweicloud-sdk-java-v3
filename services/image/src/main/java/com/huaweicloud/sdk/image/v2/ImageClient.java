package com.huaweicloud.sdk.image.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.image.v2.model.*;

public class ImageClient {

    protected HcClient hcClient;

    public ImageClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ImageClient> newBuilder() {
        return new ClientBuilder<>(ImageClient::new);
    }

    /**
     * 创建任务
     *
     * Create Task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateImageHighresolutionMattingTaskRequest 请求对象
     * @return CreateImageHighresolutionMattingTaskResponse
     */
    public CreateImageHighresolutionMattingTaskResponse createImageHighresolutionMattingTask(
        CreateImageHighresolutionMattingTaskRequest request) {
        return hcClient.syncInvokeHttp(request, ImageMeta.createImageHighresolutionMattingTask);
    }

    /**
     * 创建任务
     *
     * Create Task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateImageHighresolutionMattingTaskRequest 请求对象
     * @return SyncInvoker<CreateImageHighresolutionMattingTaskRequest, CreateImageHighresolutionMattingTaskResponse>
     */
    public SyncInvoker<CreateImageHighresolutionMattingTaskRequest, CreateImageHighresolutionMattingTaskResponse> createImageHighresolutionMattingTaskInvoker(
        CreateImageHighresolutionMattingTaskRequest request) {
        return new SyncInvoker<CreateImageHighresolutionMattingTaskRequest, CreateImageHighresolutionMattingTaskResponse>(
            request, ImageMeta.createImageHighresolutionMattingTask, hcClient);
    }

    /**
     * 创建任务
     *
     * Create Task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateImageToVideoTaskRequest 请求对象
     * @return CreateImageToVideoTaskResponse
     */
    public CreateImageToVideoTaskResponse createImageToVideoTask(CreateImageToVideoTaskRequest request) {
        return hcClient.syncInvokeHttp(request, ImageMeta.createImageToVideoTask);
    }

    /**
     * 创建任务
     *
     * Create Task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateImageToVideoTaskRequest 请求对象
     * @return SyncInvoker<CreateImageToVideoTaskRequest, CreateImageToVideoTaskResponse>
     */
    public SyncInvoker<CreateImageToVideoTaskRequest, CreateImageToVideoTaskResponse> createImageToVideoTaskInvoker(
        CreateImageToVideoTaskRequest request) {
        return new SyncInvoker<CreateImageToVideoTaskRequest, CreateImageToVideoTaskResponse>(request,
            ImageMeta.createImageToVideoTask, hcClient);
    }

    /**
     * 创建任务
     *
     * Create Task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateImageTranslateTaskRequest 请求对象
     * @return CreateImageTranslateTaskResponse
     */
    public CreateImageTranslateTaskResponse createImageTranslateTask(CreateImageTranslateTaskRequest request) {
        return hcClient.syncInvokeHttp(request, ImageMeta.createImageTranslateTask);
    }

    /**
     * 创建任务
     *
     * Create Task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateImageTranslateTaskRequest 请求对象
     * @return SyncInvoker<CreateImageTranslateTaskRequest, CreateImageTranslateTaskResponse>
     */
    public SyncInvoker<CreateImageTranslateTaskRequest, CreateImageTranslateTaskResponse> createImageTranslateTaskInvoker(
        CreateImageTranslateTaskRequest request) {
        return new SyncInvoker<CreateImageTranslateTaskRequest, CreateImageTranslateTaskResponse>(request,
            ImageMeta.createImageTranslateTask, hcClient);
    }

    /**
     * 创建图像重构任务
     *
     * Create Task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateImageVariationTaskRequest 请求对象
     * @return CreateImageVariationTaskResponse
     */
    public CreateImageVariationTaskResponse createImageVariationTask(CreateImageVariationTaskRequest request) {
        return hcClient.syncInvokeHttp(request, ImageMeta.createImageVariationTask);
    }

    /**
     * 创建图像重构任务
     *
     * Create Task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateImageVariationTaskRequest 请求对象
     * @return SyncInvoker<CreateImageVariationTaskRequest, CreateImageVariationTaskResponse>
     */
    public SyncInvoker<CreateImageVariationTaskRequest, CreateImageVariationTaskResponse> createImageVariationTaskInvoker(
        CreateImageVariationTaskRequest request) {
        return new SyncInvoker<CreateImageVariationTaskRequest, CreateImageVariationTaskResponse>(request,
            ImageMeta.createImageVariationTask, hcClient);
    }

    /**
     * 创建文生图任务
     *
     * Create Task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTextToImageTaskRequest 请求对象
     * @return CreateTextToImageTaskResponse
     */
    public CreateTextToImageTaskResponse createTextToImageTask(CreateTextToImageTaskRequest request) {
        return hcClient.syncInvokeHttp(request, ImageMeta.createTextToImageTask);
    }

    /**
     * 创建文生图任务
     *
     * Create Task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTextToImageTaskRequest 请求对象
     * @return SyncInvoker<CreateTextToImageTaskRequest, CreateTextToImageTaskResponse>
     */
    public SyncInvoker<CreateTextToImageTaskRequest, CreateTextToImageTaskResponse> createTextToImageTaskInvoker(
        CreateTextToImageTaskRequest request) {
        return new SyncInvoker<CreateTextToImageTaskRequest, CreateTextToImageTaskResponse>(request,
            ImageMeta.createTextToImageTask, hcClient);
    }

    /**
     * 创建任务
     *
     * 创建视频封面任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVideoCoverAnalysisTaskRequest 请求对象
     * @return CreateVideoCoverAnalysisTaskResponse
     */
    public CreateVideoCoverAnalysisTaskResponse createVideoCoverAnalysisTask(
        CreateVideoCoverAnalysisTaskRequest request) {
        return hcClient.syncInvokeHttp(request, ImageMeta.createVideoCoverAnalysisTask);
    }

    /**
     * 创建任务
     *
     * 创建视频封面任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVideoCoverAnalysisTaskRequest 请求对象
     * @return SyncInvoker<CreateVideoCoverAnalysisTaskRequest, CreateVideoCoverAnalysisTaskResponse>
     */
    public SyncInvoker<CreateVideoCoverAnalysisTaskRequest, CreateVideoCoverAnalysisTaskResponse> createVideoCoverAnalysisTaskInvoker(
        CreateVideoCoverAnalysisTaskRequest request) {
        return new SyncInvoker<CreateVideoCoverAnalysisTaskRequest, CreateVideoCoverAnalysisTaskResponse>(request,
            ImageMeta.createVideoCoverAnalysisTask, hcClient);
    }

    /**
     * 创建任务
     *
     * Create Task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVideoCuttingTaskRequest 请求对象
     * @return CreateVideoCuttingTaskResponse
     */
    public CreateVideoCuttingTaskResponse createVideoCuttingTask(CreateVideoCuttingTaskRequest request) {
        return hcClient.syncInvokeHttp(request, ImageMeta.createVideoCuttingTask);
    }

    /**
     * 创建任务
     *
     * Create Task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVideoCuttingTaskRequest 请求对象
     * @return SyncInvoker<CreateVideoCuttingTaskRequest, CreateVideoCuttingTaskResponse>
     */
    public SyncInvoker<CreateVideoCuttingTaskRequest, CreateVideoCuttingTaskResponse> createVideoCuttingTaskInvoker(
        CreateVideoCuttingTaskRequest request) {
        return new SyncInvoker<CreateVideoCuttingTaskRequest, CreateVideoCuttingTaskResponse>(request,
            ImageMeta.createVideoCuttingTask, hcClient);
    }

    /**
     * 创建任务
     *
     * 创建视频拆条任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVideoShotSplitTaskRequest 请求对象
     * @return CreateVideoShotSplitTaskResponse
     */
    public CreateVideoShotSplitTaskResponse createVideoShotSplitTask(CreateVideoShotSplitTaskRequest request) {
        return hcClient.syncInvokeHttp(request, ImageMeta.createVideoShotSplitTask);
    }

    /**
     * 创建任务
     *
     * 创建视频拆条任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVideoShotSplitTaskRequest 请求对象
     * @return SyncInvoker<CreateVideoShotSplitTaskRequest, CreateVideoShotSplitTaskResponse>
     */
    public SyncInvoker<CreateVideoShotSplitTaskRequest, CreateVideoShotSplitTaskResponse> createVideoShotSplitTaskInvoker(
        CreateVideoShotSplitTaskRequest request) {
        return new SyncInvoker<CreateVideoShotSplitTaskRequest, CreateVideoShotSplitTaskResponse>(request,
            ImageMeta.createVideoShotSplitTask, hcClient);
    }

    /**
     * 创建任务
     *
     * Create Task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVideoSummarizationAnalysisTaskRequest 请求对象
     * @return CreateVideoSummarizationAnalysisTaskResponse
     */
    public CreateVideoSummarizationAnalysisTaskResponse createVideoSummarizationAnalysisTask(
        CreateVideoSummarizationAnalysisTaskRequest request) {
        return hcClient.syncInvokeHttp(request, ImageMeta.createVideoSummarizationAnalysisTask);
    }

    /**
     * 创建任务
     *
     * Create Task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVideoSummarizationAnalysisTaskRequest 请求对象
     * @return SyncInvoker<CreateVideoSummarizationAnalysisTaskRequest, CreateVideoSummarizationAnalysisTaskResponse>
     */
    public SyncInvoker<CreateVideoSummarizationAnalysisTaskRequest, CreateVideoSummarizationAnalysisTaskResponse> createVideoSummarizationAnalysisTaskInvoker(
        CreateVideoSummarizationAnalysisTaskRequest request) {
        return new SyncInvoker<CreateVideoSummarizationAnalysisTaskRequest, CreateVideoSummarizationAnalysisTaskResponse>(
            request, ImageMeta.createVideoSummarizationAnalysisTask, hcClient);
    }

    /**
     * 创建任务
     *
     * Create Task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVideoSynthesisTaskRequest 请求对象
     * @return CreateVideoSynthesisTaskResponse
     */
    public CreateVideoSynthesisTaskResponse createVideoSynthesisTask(CreateVideoSynthesisTaskRequest request) {
        return hcClient.syncInvokeHttp(request, ImageMeta.createVideoSynthesisTask);
    }

    /**
     * 创建任务
     *
     * Create Task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVideoSynthesisTaskRequest 请求对象
     * @return SyncInvoker<CreateVideoSynthesisTaskRequest, CreateVideoSynthesisTaskResponse>
     */
    public SyncInvoker<CreateVideoSynthesisTaskRequest, CreateVideoSynthesisTaskResponse> createVideoSynthesisTaskInvoker(
        CreateVideoSynthesisTaskRequest request) {
        return new SyncInvoker<CreateVideoSynthesisTaskRequest, CreateVideoSynthesisTaskResponse>(request,
            ImageMeta.createVideoSynthesisTask, hcClient);
    }

    /**
     * 创建任务
     *
     * Create Task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVideoTranslateTaskRequest 请求对象
     * @return CreateVideoTranslateTaskResponse
     */
    public CreateVideoTranslateTaskResponse createVideoTranslateTask(CreateVideoTranslateTaskRequest request) {
        return hcClient.syncInvokeHttp(request, ImageMeta.createVideoTranslateTask);
    }

    /**
     * 创建任务
     *
     * Create Task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVideoTranslateTaskRequest 请求对象
     * @return SyncInvoker<CreateVideoTranslateTaskRequest, CreateVideoTranslateTaskResponse>
     */
    public SyncInvoker<CreateVideoTranslateTaskRequest, CreateVideoTranslateTaskResponse> createVideoTranslateTaskInvoker(
        CreateVideoTranslateTaskRequest request) {
        return new SyncInvoker<CreateVideoTranslateTaskRequest, CreateVideoTranslateTaskResponse>(request,
            ImageMeta.createVideoTranslateTask, hcClient);
    }

    /**
     * 名人识别
     *
     * 分析并识别图片中包含的政治人物、明星及网红人物，返回人物信息及人脸坐标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunCelebrityRecognitionRequest 请求对象
     * @return RunCelebrityRecognitionResponse
     */
    public RunCelebrityRecognitionResponse runCelebrityRecognition(RunCelebrityRecognitionRequest request) {
        return hcClient.syncInvokeHttp(request, ImageMeta.runCelebrityRecognition);
    }

    /**
     * 名人识别
     *
     * 分析并识别图片中包含的政治人物、明星及网红人物，返回人物信息及人脸坐标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunCelebrityRecognitionRequest 请求对象
     * @return SyncInvoker<RunCelebrityRecognitionRequest, RunCelebrityRecognitionResponse>
     */
    public SyncInvoker<RunCelebrityRecognitionRequest, RunCelebrityRecognitionResponse> runCelebrityRecognitionInvoker(
        RunCelebrityRecognitionRequest request) {
        return new SyncInvoker<RunCelebrityRecognitionRequest, RunCelebrityRecognitionResponse>(request,
            ImageMeta.runCelebrityRecognition, hcClient);
    }

    /**
     * 删除媒资图像标签
     *
     * 用于用户删除自定义的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunDeleteCustomTagsRequest 请求对象
     * @return RunDeleteCustomTagsResponse
     */
    public RunDeleteCustomTagsResponse runDeleteCustomTags(RunDeleteCustomTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ImageMeta.runDeleteCustomTags);
    }

    /**
     * 删除媒资图像标签
     *
     * 用于用户删除自定义的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunDeleteCustomTagsRequest 请求对象
     * @return SyncInvoker<RunDeleteCustomTagsRequest, RunDeleteCustomTagsResponse>
     */
    public SyncInvoker<RunDeleteCustomTagsRequest, RunDeleteCustomTagsResponse> runDeleteCustomTagsInvoker(
        RunDeleteCustomTagsRequest request) {
        return new SyncInvoker<RunDeleteCustomTagsRequest, RunDeleteCustomTagsResponse>(request,
            ImageMeta.runDeleteCustomTags, hcClient);
    }

    /**
     * 图像描述
     *
     * 图像描述
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunImageDescriptionRequest 请求对象
     * @return RunImageDescriptionResponse
     */
    public RunImageDescriptionResponse runImageDescription(RunImageDescriptionRequest request) {
        return hcClient.syncInvokeHttp(request, ImageMeta.runImageDescription);
    }

    /**
     * 图像描述
     *
     * 图像描述
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunImageDescriptionRequest 请求对象
     * @return SyncInvoker<RunImageDescriptionRequest, RunImageDescriptionResponse>
     */
    public SyncInvoker<RunImageDescriptionRequest, RunImageDescriptionResponse> runImageDescriptionInvoker(
        RunImageDescriptionRequest request) {
        return new SyncInvoker<RunImageDescriptionRequest, RunImageDescriptionResponse>(request,
            ImageMeta.runImageDescription, hcClient);
    }

    /**
     * 主体识别
     *
     * 检测图像中的主要内容，返回主要内容的坐标信息，这里的主要内容包括两方面：bounding_box和main_object_box
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunImageMainObjectDetectionRequest 请求对象
     * @return RunImageMainObjectDetectionResponse
     */
    public RunImageMainObjectDetectionResponse runImageMainObjectDetection(RunImageMainObjectDetectionRequest request) {
        return hcClient.syncInvokeHttp(request, ImageMeta.runImageMainObjectDetection);
    }

    /**
     * 主体识别
     *
     * 检测图像中的主要内容，返回主要内容的坐标信息，这里的主要内容包括两方面：bounding_box和main_object_box
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunImageMainObjectDetectionRequest 请求对象
     * @return SyncInvoker<RunImageMainObjectDetectionRequest, RunImageMainObjectDetectionResponse>
     */
    public SyncInvoker<RunImageMainObjectDetectionRequest, RunImageMainObjectDetectionResponse> runImageMainObjectDetectionInvoker(
        RunImageMainObjectDetectionRequest request) {
        return new SyncInvoker<RunImageMainObjectDetectionRequest, RunImageMainObjectDetectionResponse>(request,
            ImageMeta.runImageMainObjectDetection, hcClient);
    }

    /**
     * 标签识别
     *
     * 自然图像的语义内容非常丰富，一个图像包含多个标签内容，图像标签服务准确识别自然图片中数百种场景、上千种通用物体及其属性，让智能相册管理、照片检索和分类、基于场景内容或者物体的广告推荐等功能更加直观。使用时用户发送待处理图片，返回图片标签内容及相应置信度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunImageMediaTaggingRequest 请求对象
     * @return RunImageMediaTaggingResponse
     */
    public RunImageMediaTaggingResponse runImageMediaTagging(RunImageMediaTaggingRequest request) {
        return hcClient.syncInvokeHttp(request, ImageMeta.runImageMediaTagging);
    }

    /**
     * 标签识别
     *
     * 自然图像的语义内容非常丰富，一个图像包含多个标签内容，图像标签服务准确识别自然图片中数百种场景、上千种通用物体及其属性，让智能相册管理、照片检索和分类、基于场景内容或者物体的广告推荐等功能更加直观。使用时用户发送待处理图片，返回图片标签内容及相应置信度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunImageMediaTaggingRequest 请求对象
     * @return SyncInvoker<RunImageMediaTaggingRequest, RunImageMediaTaggingResponse>
     */
    public SyncInvoker<RunImageMediaTaggingRequest, RunImageMediaTaggingResponse> runImageMediaTaggingInvoker(
        RunImageMediaTaggingRequest request) {
        return new SyncInvoker<RunImageMediaTaggingRequest, RunImageMediaTaggingResponse>(request,
            ImageMeta.runImageMediaTagging, hcClient);
    }

    /**
     * 媒资图像标签检测
     *
     * 自然图像的语义内容非常丰富，一个图像包含多个标签内容，图像标签服务准确识别自然图片中数百种场景、上千种通用物体及其属性，让智能相册管理、照片检索和分类、基于场景内容或者物体的广告推荐等功能更加直观。使用时用户发送待处理图片，返回图片标签内容及相应的位置坐标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunImageMediaTaggingDetRequest 请求对象
     * @return RunImageMediaTaggingDetResponse
     */
    public RunImageMediaTaggingDetResponse runImageMediaTaggingDet(RunImageMediaTaggingDetRequest request) {
        return hcClient.syncInvokeHttp(request, ImageMeta.runImageMediaTaggingDet);
    }

    /**
     * 媒资图像标签检测
     *
     * 自然图像的语义内容非常丰富，一个图像包含多个标签内容，图像标签服务准确识别自然图片中数百种场景、上千种通用物体及其属性，让智能相册管理、照片检索和分类、基于场景内容或者物体的广告推荐等功能更加直观。使用时用户发送待处理图片，返回图片标签内容及相应的位置坐标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunImageMediaTaggingDetRequest 请求对象
     * @return SyncInvoker<RunImageMediaTaggingDetRequest, RunImageMediaTaggingDetResponse>
     */
    public SyncInvoker<RunImageMediaTaggingDetRequest, RunImageMediaTaggingDetResponse> runImageMediaTaggingDetInvoker(
        RunImageMediaTaggingDetRequest request) {
        return new SyncInvoker<RunImageMediaTaggingDetRequest, RunImageMediaTaggingDetResponse>(request,
            ImageMeta.runImageMediaTaggingDet, hcClient);
    }

    /**
     * 图像超分
     *
     * 图像数据，base64编码，输入图像范围200px ~ 1080px，支持JPG/PNG/BMP/JPEG/WEBP格式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunImageSuperResolutionRequest 请求对象
     * @return RunImageSuperResolutionResponse
     */
    public RunImageSuperResolutionResponse runImageSuperResolution(RunImageSuperResolutionRequest request) {
        return hcClient.syncInvokeHttp(request, ImageMeta.runImageSuperResolution);
    }

    /**
     * 图像超分
     *
     * 图像数据，base64编码，输入图像范围200px ~ 1080px，支持JPG/PNG/BMP/JPEG/WEBP格式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunImageSuperResolutionRequest 请求对象
     * @return SyncInvoker<RunImageSuperResolutionRequest, RunImageSuperResolutionResponse>
     */
    public SyncInvoker<RunImageSuperResolutionRequest, RunImageSuperResolutionResponse> runImageSuperResolutionInvoker(
        RunImageSuperResolutionRequest request) {
        return new SyncInvoker<RunImageSuperResolutionRequest, RunImageSuperResolutionResponse>(request,
            ImageMeta.runImageSuperResolution, hcClient);
    }

    /**
     * 图像标签
     *
     * 自然图像的语义内容非常丰富，一个图像包含多个标签内容，图像标签服务准确识别自然图片中数百种场景、上千种通用物体及其属性，让智能相册管理、照片检索和分类、基于场景内容或者物体的广告推荐等功能更加直观。使用时用户发送待处理图片，返回图片标签内容及相应置信度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunImageTaggingRequest 请求对象
     * @return RunImageTaggingResponse
     */
    public RunImageTaggingResponse runImageTagging(RunImageTaggingRequest request) {
        return hcClient.syncInvokeHttp(request, ImageMeta.runImageTagging);
    }

    /**
     * 图像标签
     *
     * 自然图像的语义内容非常丰富，一个图像包含多个标签内容，图像标签服务准确识别自然图片中数百种场景、上千种通用物体及其属性，让智能相册管理、照片检索和分类、基于场景内容或者物体的广告推荐等功能更加直观。使用时用户发送待处理图片，返回图片标签内容及相应置信度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunImageTaggingRequest 请求对象
     * @return SyncInvoker<RunImageTaggingRequest, RunImageTaggingResponse>
     */
    public SyncInvoker<RunImageTaggingRequest, RunImageTaggingResponse> runImageTaggingInvoker(
        RunImageTaggingRequest request) {
        return new SyncInvoker<RunImageTaggingRequest, RunImageTaggingResponse>(request, ImageMeta.runImageTagging,
            hcClient);
    }

    /**
     * 智能设计图像裁剪
     *
     * 智能设计图像裁剪服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunImageWisedesignCropRequest 请求对象
     * @return RunImageWisedesignCropResponse
     */
    public RunImageWisedesignCropResponse runImageWisedesignCrop(RunImageWisedesignCropRequest request) {
        return hcClient.syncInvokeHttp(request, ImageMeta.runImageWisedesignCrop);
    }

    /**
     * 智能设计图像裁剪
     *
     * 智能设计图像裁剪服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunImageWisedesignCropRequest 请求对象
     * @return SyncInvoker<RunImageWisedesignCropRequest, RunImageWisedesignCropResponse>
     */
    public SyncInvoker<RunImageWisedesignCropRequest, RunImageWisedesignCropResponse> runImageWisedesignCropInvoker(
        RunImageWisedesignCropRequest request) {
        return new SyncInvoker<RunImageWisedesignCropRequest, RunImageWisedesignCropResponse>(request,
            ImageMeta.runImageWisedesignCrop, hcClient);
    }

    /**
     * 智能设计图像修复
     *
     * 智能设计图像修复服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunImageWisedesignInpaintingRequest 请求对象
     * @return RunImageWisedesignInpaintingResponse
     */
    public RunImageWisedesignInpaintingResponse runImageWisedesignInpainting(
        RunImageWisedesignInpaintingRequest request) {
        return hcClient.syncInvokeHttp(request, ImageMeta.runImageWisedesignInpainting);
    }

    /**
     * 智能设计图像修复
     *
     * 智能设计图像修复服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunImageWisedesignInpaintingRequest 请求对象
     * @return SyncInvoker<RunImageWisedesignInpaintingRequest, RunImageWisedesignInpaintingResponse>
     */
    public SyncInvoker<RunImageWisedesignInpaintingRequest, RunImageWisedesignInpaintingResponse> runImageWisedesignInpaintingInvoker(
        RunImageWisedesignInpaintingRequest request) {
        return new SyncInvoker<RunImageWisedesignInpaintingRequest, RunImageWisedesignInpaintingResponse>(request,
            ImageMeta.runImageWisedesignInpainting, hcClient);
    }

    /**
     * 查询媒资图像标签
     *
     * 用于用户自查是否存在自定义的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunQueryCustomTagsRequest 请求对象
     * @return RunQueryCustomTagsResponse
     */
    public RunQueryCustomTagsResponse runQueryCustomTags(RunQueryCustomTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ImageMeta.runQueryCustomTags);
    }

    /**
     * 查询媒资图像标签
     *
     * 用于用户自查是否存在自定义的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunQueryCustomTagsRequest 请求对象
     * @return SyncInvoker<RunQueryCustomTagsRequest, RunQueryCustomTagsResponse>
     */
    public SyncInvoker<RunQueryCustomTagsRequest, RunQueryCustomTagsResponse> runQueryCustomTagsInvoker(
        RunQueryCustomTagsRequest request) {
        return new SyncInvoker<RunQueryCustomTagsRequest, RunQueryCustomTagsResponse>(request,
            ImageMeta.runQueryCustomTags, hcClient);
    }

    /**
     * 翻拍识别
     *
     * 零售行业通常根据零售店的销售量进行销售奖励，拍摄售出商品的条形码上传后台是常用的统计方式。翻拍识别利用深度神经网络算法判断条形码图片为原始拍摄，还是经过二次翻拍、打印翻拍等手法二次处理的图片。利用翻拍识别，可以检测出经过二次处理的不合规范图片，使得统计数据更准确、有效。。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunRecaptureDetectRequest 请求对象
     * @return RunRecaptureDetectResponse
     */
    public RunRecaptureDetectResponse runRecaptureDetect(RunRecaptureDetectRequest request) {
        return hcClient.syncInvokeHttp(request, ImageMeta.runRecaptureDetect);
    }

    /**
     * 翻拍识别
     *
     * 零售行业通常根据零售店的销售量进行销售奖励，拍摄售出商品的条形码上传后台是常用的统计方式。翻拍识别利用深度神经网络算法判断条形码图片为原始拍摄，还是经过二次翻拍、打印翻拍等手法二次处理的图片。利用翻拍识别，可以检测出经过二次处理的不合规范图片，使得统计数据更准确、有效。。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunRecaptureDetectRequest 请求对象
     * @return SyncInvoker<RunRecaptureDetectRequest, RunRecaptureDetectResponse>
     */
    public SyncInvoker<RunRecaptureDetectRequest, RunRecaptureDetectResponse> runRecaptureDetectInvoker(
        RunRecaptureDetectRequest request) {
        return new SyncInvoker<RunRecaptureDetectRequest, RunRecaptureDetectResponse>(request,
            ImageMeta.runRecaptureDetect, hcClient);
    }

    /**
     * 查询任务
     *
     * show task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowImageHighresolutionMattingTaskRequest 请求对象
     * @return ShowImageHighresolutionMattingTaskResponse
     */
    public ShowImageHighresolutionMattingTaskResponse showImageHighresolutionMattingTask(
        ShowImageHighresolutionMattingTaskRequest request) {
        return hcClient.syncInvokeHttp(request, ImageMeta.showImageHighresolutionMattingTask);
    }

    /**
     * 查询任务
     *
     * show task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowImageHighresolutionMattingTaskRequest 请求对象
     * @return SyncInvoker<ShowImageHighresolutionMattingTaskRequest, ShowImageHighresolutionMattingTaskResponse>
     */
    public SyncInvoker<ShowImageHighresolutionMattingTaskRequest, ShowImageHighresolutionMattingTaskResponse> showImageHighresolutionMattingTaskInvoker(
        ShowImageHighresolutionMattingTaskRequest request) {
        return new SyncInvoker<ShowImageHighresolutionMattingTaskRequest, ShowImageHighresolutionMattingTaskResponse>(
            request, ImageMeta.showImageHighresolutionMattingTask, hcClient);
    }

    /**
     * 查询任务
     *
     * show task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowImageToVideoTaskRequest 请求对象
     * @return ShowImageToVideoTaskResponse
     */
    public ShowImageToVideoTaskResponse showImageToVideoTask(ShowImageToVideoTaskRequest request) {
        return hcClient.syncInvokeHttp(request, ImageMeta.showImageToVideoTask);
    }

    /**
     * 查询任务
     *
     * show task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowImageToVideoTaskRequest 请求对象
     * @return SyncInvoker<ShowImageToVideoTaskRequest, ShowImageToVideoTaskResponse>
     */
    public SyncInvoker<ShowImageToVideoTaskRequest, ShowImageToVideoTaskResponse> showImageToVideoTaskInvoker(
        ShowImageToVideoTaskRequest request) {
        return new SyncInvoker<ShowImageToVideoTaskRequest, ShowImageToVideoTaskResponse>(request,
            ImageMeta.showImageToVideoTask, hcClient);
    }

    /**
     * 查询任务
     *
     * show task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowImageTranslateTaskRequest 请求对象
     * @return ShowImageTranslateTaskResponse
     */
    public ShowImageTranslateTaskResponse showImageTranslateTask(ShowImageTranslateTaskRequest request) {
        return hcClient.syncInvokeHttp(request, ImageMeta.showImageTranslateTask);
    }

    /**
     * 查询任务
     *
     * show task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowImageTranslateTaskRequest 请求对象
     * @return SyncInvoker<ShowImageTranslateTaskRequest, ShowImageTranslateTaskResponse>
     */
    public SyncInvoker<ShowImageTranslateTaskRequest, ShowImageTranslateTaskResponse> showImageTranslateTaskInvoker(
        ShowImageTranslateTaskRequest request) {
        return new SyncInvoker<ShowImageTranslateTaskRequest, ShowImageTranslateTaskResponse>(request,
            ImageMeta.showImageTranslateTask, hcClient);
    }

    /**
     * show task 查询任务信息
     *
     * show task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowImageVariationTaskRequest 请求对象
     * @return ShowImageVariationTaskResponse
     */
    public ShowImageVariationTaskResponse showImageVariationTask(ShowImageVariationTaskRequest request) {
        return hcClient.syncInvokeHttp(request, ImageMeta.showImageVariationTask);
    }

    /**
     * show task 查询任务信息
     *
     * show task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowImageVariationTaskRequest 请求对象
     * @return SyncInvoker<ShowImageVariationTaskRequest, ShowImageVariationTaskResponse>
     */
    public SyncInvoker<ShowImageVariationTaskRequest, ShowImageVariationTaskResponse> showImageVariationTaskInvoker(
        ShowImageVariationTaskRequest request) {
        return new SyncInvoker<ShowImageVariationTaskRequest, ShowImageVariationTaskResponse>(request,
            ImageMeta.showImageVariationTask, hcClient);
    }

    /**
     * show task 查询任务信息
     *
     * show task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTextToImageTaskRequest 请求对象
     * @return ShowTextToImageTaskResponse
     */
    public ShowTextToImageTaskResponse showTextToImageTask(ShowTextToImageTaskRequest request) {
        return hcClient.syncInvokeHttp(request, ImageMeta.showTextToImageTask);
    }

    /**
     * show task 查询任务信息
     *
     * show task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTextToImageTaskRequest 请求对象
     * @return SyncInvoker<ShowTextToImageTaskRequest, ShowTextToImageTaskResponse>
     */
    public SyncInvoker<ShowTextToImageTaskRequest, ShowTextToImageTaskResponse> showTextToImageTaskInvoker(
        ShowTextToImageTaskRequest request) {
        return new SyncInvoker<ShowTextToImageTaskRequest, ShowTextToImageTaskResponse>(request,
            ImageMeta.showTextToImageTask, hcClient);
    }

    /**
     * 查询任务
     *
     * 查询视频封面任务完成状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVideoCoverAnalysisTaskRequest 请求对象
     * @return ShowVideoCoverAnalysisTaskResponse
     */
    public ShowVideoCoverAnalysisTaskResponse showVideoCoverAnalysisTask(ShowVideoCoverAnalysisTaskRequest request) {
        return hcClient.syncInvokeHttp(request, ImageMeta.showVideoCoverAnalysisTask);
    }

    /**
     * 查询任务
     *
     * 查询视频封面任务完成状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVideoCoverAnalysisTaskRequest 请求对象
     * @return SyncInvoker<ShowVideoCoverAnalysisTaskRequest, ShowVideoCoverAnalysisTaskResponse>
     */
    public SyncInvoker<ShowVideoCoverAnalysisTaskRequest, ShowVideoCoverAnalysisTaskResponse> showVideoCoverAnalysisTaskInvoker(
        ShowVideoCoverAnalysisTaskRequest request) {
        return new SyncInvoker<ShowVideoCoverAnalysisTaskRequest, ShowVideoCoverAnalysisTaskResponse>(request,
            ImageMeta.showVideoCoverAnalysisTask, hcClient);
    }

    /**
     * 查询任务
     *
     * show task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVideoCuttingTaskRequest 请求对象
     * @return ShowVideoCuttingTaskResponse
     */
    public ShowVideoCuttingTaskResponse showVideoCuttingTask(ShowVideoCuttingTaskRequest request) {
        return hcClient.syncInvokeHttp(request, ImageMeta.showVideoCuttingTask);
    }

    /**
     * 查询任务
     *
     * show task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVideoCuttingTaskRequest 请求对象
     * @return SyncInvoker<ShowVideoCuttingTaskRequest, ShowVideoCuttingTaskResponse>
     */
    public SyncInvoker<ShowVideoCuttingTaskRequest, ShowVideoCuttingTaskResponse> showVideoCuttingTaskInvoker(
        ShowVideoCuttingTaskRequest request) {
        return new SyncInvoker<ShowVideoCuttingTaskRequest, ShowVideoCuttingTaskResponse>(request,
            ImageMeta.showVideoCuttingTask, hcClient);
    }

    /**
     * 查询任务
     *
     * 查询拆条任务状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVideoShotSplitTaskRequest 请求对象
     * @return ShowVideoShotSplitTaskResponse
     */
    public ShowVideoShotSplitTaskResponse showVideoShotSplitTask(ShowVideoShotSplitTaskRequest request) {
        return hcClient.syncInvokeHttp(request, ImageMeta.showVideoShotSplitTask);
    }

    /**
     * 查询任务
     *
     * 查询拆条任务状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVideoShotSplitTaskRequest 请求对象
     * @return SyncInvoker<ShowVideoShotSplitTaskRequest, ShowVideoShotSplitTaskResponse>
     */
    public SyncInvoker<ShowVideoShotSplitTaskRequest, ShowVideoShotSplitTaskResponse> showVideoShotSplitTaskInvoker(
        ShowVideoShotSplitTaskRequest request) {
        return new SyncInvoker<ShowVideoShotSplitTaskRequest, ShowVideoShotSplitTaskResponse>(request,
            ImageMeta.showVideoShotSplitTask, hcClient);
    }

    /**
     * 查询任务
     *
     * show task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVideoSummarizationAnalysisTaskRequest 请求对象
     * @return ShowVideoSummarizationAnalysisTaskResponse
     */
    public ShowVideoSummarizationAnalysisTaskResponse showVideoSummarizationAnalysisTask(
        ShowVideoSummarizationAnalysisTaskRequest request) {
        return hcClient.syncInvokeHttp(request, ImageMeta.showVideoSummarizationAnalysisTask);
    }

    /**
     * 查询任务
     *
     * show task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVideoSummarizationAnalysisTaskRequest 请求对象
     * @return SyncInvoker<ShowVideoSummarizationAnalysisTaskRequest, ShowVideoSummarizationAnalysisTaskResponse>
     */
    public SyncInvoker<ShowVideoSummarizationAnalysisTaskRequest, ShowVideoSummarizationAnalysisTaskResponse> showVideoSummarizationAnalysisTaskInvoker(
        ShowVideoSummarizationAnalysisTaskRequest request) {
        return new SyncInvoker<ShowVideoSummarizationAnalysisTaskRequest, ShowVideoSummarizationAnalysisTaskResponse>(
            request, ImageMeta.showVideoSummarizationAnalysisTask, hcClient);
    }

    /**
     * 查询任务
     *
     * show task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVideoSynthesisTaskRequest 请求对象
     * @return ShowVideoSynthesisTaskResponse
     */
    public ShowVideoSynthesisTaskResponse showVideoSynthesisTask(ShowVideoSynthesisTaskRequest request) {
        return hcClient.syncInvokeHttp(request, ImageMeta.showVideoSynthesisTask);
    }

    /**
     * 查询任务
     *
     * show task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVideoSynthesisTaskRequest 请求对象
     * @return SyncInvoker<ShowVideoSynthesisTaskRequest, ShowVideoSynthesisTaskResponse>
     */
    public SyncInvoker<ShowVideoSynthesisTaskRequest, ShowVideoSynthesisTaskResponse> showVideoSynthesisTaskInvoker(
        ShowVideoSynthesisTaskRequest request) {
        return new SyncInvoker<ShowVideoSynthesisTaskRequest, ShowVideoSynthesisTaskResponse>(request,
            ImageMeta.showVideoSynthesisTask, hcClient);
    }

    /**
     * 查询任务
     *
     * show task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVideoTranslateTaskRequest 请求对象
     * @return ShowVideoTranslateTaskResponse
     */
    public ShowVideoTranslateTaskResponse showVideoTranslateTask(ShowVideoTranslateTaskRequest request) {
        return hcClient.syncInvokeHttp(request, ImageMeta.showVideoTranslateTask);
    }

    /**
     * 查询任务
     *
     * show task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVideoTranslateTaskRequest 请求对象
     * @return SyncInvoker<ShowVideoTranslateTaskRequest, ShowVideoTranslateTaskResponse>
     */
    public SyncInvoker<ShowVideoTranslateTaskRequest, ShowVideoTranslateTaskResponse> showVideoTranslateTaskInvoker(
        ShowVideoTranslateTaskRequest request) {
        return new SyncInvoker<ShowVideoTranslateTaskRequest, ShowVideoTranslateTaskResponse>(request,
            ImageMeta.showVideoTranslateTask, hcClient);
    }

}

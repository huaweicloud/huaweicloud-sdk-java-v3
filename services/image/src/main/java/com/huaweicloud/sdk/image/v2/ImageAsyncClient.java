package com.huaweicloud.sdk.image.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.image.v2.model.*;

import java.util.concurrent.CompletableFuture;

public class ImageAsyncClient {

    protected HcClient hcClient;

    public ImageAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ImageAsyncClient> newBuilder() {
        return new ClientBuilder<>(ImageAsyncClient::new);
    }

    /**
     * 创建任务
     *
     * Create Task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateImageHighresolutionMattingTaskRequest 请求对象
     * @return CompletableFuture<CreateImageHighresolutionMattingTaskResponse>
     */
    public CompletableFuture<CreateImageHighresolutionMattingTaskResponse> createImageHighresolutionMattingTaskAsync(
        CreateImageHighresolutionMattingTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.createImageHighresolutionMattingTask);
    }

    /**
     * 创建任务
     *
     * Create Task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateImageHighresolutionMattingTaskRequest 请求对象
     * @return AsyncInvoker<CreateImageHighresolutionMattingTaskRequest, CreateImageHighresolutionMattingTaskResponse>
     */
    public AsyncInvoker<CreateImageHighresolutionMattingTaskRequest, CreateImageHighresolutionMattingTaskResponse> createImageHighresolutionMattingTaskAsyncInvoker(
        CreateImageHighresolutionMattingTaskRequest request) {
        return new AsyncInvoker<CreateImageHighresolutionMattingTaskRequest, CreateImageHighresolutionMattingTaskResponse>(
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
     * @return CompletableFuture<CreateImageToVideoTaskResponse>
     */
    public CompletableFuture<CreateImageToVideoTaskResponse> createImageToVideoTaskAsync(
        CreateImageToVideoTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.createImageToVideoTask);
    }

    /**
     * 创建任务
     *
     * Create Task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateImageToVideoTaskRequest 请求对象
     * @return AsyncInvoker<CreateImageToVideoTaskRequest, CreateImageToVideoTaskResponse>
     */
    public AsyncInvoker<CreateImageToVideoTaskRequest, CreateImageToVideoTaskResponse> createImageToVideoTaskAsyncInvoker(
        CreateImageToVideoTaskRequest request) {
        return new AsyncInvoker<CreateImageToVideoTaskRequest, CreateImageToVideoTaskResponse>(request,
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
     * @return CompletableFuture<CreateImageTranslateTaskResponse>
     */
    public CompletableFuture<CreateImageTranslateTaskResponse> createImageTranslateTaskAsync(
        CreateImageTranslateTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.createImageTranslateTask);
    }

    /**
     * 创建任务
     *
     * Create Task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateImageTranslateTaskRequest 请求对象
     * @return AsyncInvoker<CreateImageTranslateTaskRequest, CreateImageTranslateTaskResponse>
     */
    public AsyncInvoker<CreateImageTranslateTaskRequest, CreateImageTranslateTaskResponse> createImageTranslateTaskAsyncInvoker(
        CreateImageTranslateTaskRequest request) {
        return new AsyncInvoker<CreateImageTranslateTaskRequest, CreateImageTranslateTaskResponse>(request,
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
     * @return CompletableFuture<CreateImageVariationTaskResponse>
     */
    public CompletableFuture<CreateImageVariationTaskResponse> createImageVariationTaskAsync(
        CreateImageVariationTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.createImageVariationTask);
    }

    /**
     * 创建图像重构任务
     *
     * Create Task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateImageVariationTaskRequest 请求对象
     * @return AsyncInvoker<CreateImageVariationTaskRequest, CreateImageVariationTaskResponse>
     */
    public AsyncInvoker<CreateImageVariationTaskRequest, CreateImageVariationTaskResponse> createImageVariationTaskAsyncInvoker(
        CreateImageVariationTaskRequest request) {
        return new AsyncInvoker<CreateImageVariationTaskRequest, CreateImageVariationTaskResponse>(request,
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
     * @return CompletableFuture<CreateTextToImageTaskResponse>
     */
    public CompletableFuture<CreateTextToImageTaskResponse> createTextToImageTaskAsync(
        CreateTextToImageTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.createTextToImageTask);
    }

    /**
     * 创建文生图任务
     *
     * Create Task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTextToImageTaskRequest 请求对象
     * @return AsyncInvoker<CreateTextToImageTaskRequest, CreateTextToImageTaskResponse>
     */
    public AsyncInvoker<CreateTextToImageTaskRequest, CreateTextToImageTaskResponse> createTextToImageTaskAsyncInvoker(
        CreateTextToImageTaskRequest request) {
        return new AsyncInvoker<CreateTextToImageTaskRequest, CreateTextToImageTaskResponse>(request,
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
     * @return CompletableFuture<CreateVideoCoverAnalysisTaskResponse>
     */
    public CompletableFuture<CreateVideoCoverAnalysisTaskResponse> createVideoCoverAnalysisTaskAsync(
        CreateVideoCoverAnalysisTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.createVideoCoverAnalysisTask);
    }

    /**
     * 创建任务
     *
     * 创建视频封面任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVideoCoverAnalysisTaskRequest 请求对象
     * @return AsyncInvoker<CreateVideoCoverAnalysisTaskRequest, CreateVideoCoverAnalysisTaskResponse>
     */
    public AsyncInvoker<CreateVideoCoverAnalysisTaskRequest, CreateVideoCoverAnalysisTaskResponse> createVideoCoverAnalysisTaskAsyncInvoker(
        CreateVideoCoverAnalysisTaskRequest request) {
        return new AsyncInvoker<CreateVideoCoverAnalysisTaskRequest, CreateVideoCoverAnalysisTaskResponse>(request,
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
     * @return CompletableFuture<CreateVideoCuttingTaskResponse>
     */
    public CompletableFuture<CreateVideoCuttingTaskResponse> createVideoCuttingTaskAsync(
        CreateVideoCuttingTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.createVideoCuttingTask);
    }

    /**
     * 创建任务
     *
     * Create Task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVideoCuttingTaskRequest 请求对象
     * @return AsyncInvoker<CreateVideoCuttingTaskRequest, CreateVideoCuttingTaskResponse>
     */
    public AsyncInvoker<CreateVideoCuttingTaskRequest, CreateVideoCuttingTaskResponse> createVideoCuttingTaskAsyncInvoker(
        CreateVideoCuttingTaskRequest request) {
        return new AsyncInvoker<CreateVideoCuttingTaskRequest, CreateVideoCuttingTaskResponse>(request,
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
     * @return CompletableFuture<CreateVideoShotSplitTaskResponse>
     */
    public CompletableFuture<CreateVideoShotSplitTaskResponse> createVideoShotSplitTaskAsync(
        CreateVideoShotSplitTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.createVideoShotSplitTask);
    }

    /**
     * 创建任务
     *
     * 创建视频拆条任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVideoShotSplitTaskRequest 请求对象
     * @return AsyncInvoker<CreateVideoShotSplitTaskRequest, CreateVideoShotSplitTaskResponse>
     */
    public AsyncInvoker<CreateVideoShotSplitTaskRequest, CreateVideoShotSplitTaskResponse> createVideoShotSplitTaskAsyncInvoker(
        CreateVideoShotSplitTaskRequest request) {
        return new AsyncInvoker<CreateVideoShotSplitTaskRequest, CreateVideoShotSplitTaskResponse>(request,
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
     * @return CompletableFuture<CreateVideoSummarizationAnalysisTaskResponse>
     */
    public CompletableFuture<CreateVideoSummarizationAnalysisTaskResponse> createVideoSummarizationAnalysisTaskAsync(
        CreateVideoSummarizationAnalysisTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.createVideoSummarizationAnalysisTask);
    }

    /**
     * 创建任务
     *
     * Create Task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVideoSummarizationAnalysisTaskRequest 请求对象
     * @return AsyncInvoker<CreateVideoSummarizationAnalysisTaskRequest, CreateVideoSummarizationAnalysisTaskResponse>
     */
    public AsyncInvoker<CreateVideoSummarizationAnalysisTaskRequest, CreateVideoSummarizationAnalysisTaskResponse> createVideoSummarizationAnalysisTaskAsyncInvoker(
        CreateVideoSummarizationAnalysisTaskRequest request) {
        return new AsyncInvoker<CreateVideoSummarizationAnalysisTaskRequest, CreateVideoSummarizationAnalysisTaskResponse>(
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
     * @return CompletableFuture<CreateVideoSynthesisTaskResponse>
     */
    public CompletableFuture<CreateVideoSynthesisTaskResponse> createVideoSynthesisTaskAsync(
        CreateVideoSynthesisTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.createVideoSynthesisTask);
    }

    /**
     * 创建任务
     *
     * Create Task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVideoSynthesisTaskRequest 请求对象
     * @return AsyncInvoker<CreateVideoSynthesisTaskRequest, CreateVideoSynthesisTaskResponse>
     */
    public AsyncInvoker<CreateVideoSynthesisTaskRequest, CreateVideoSynthesisTaskResponse> createVideoSynthesisTaskAsyncInvoker(
        CreateVideoSynthesisTaskRequest request) {
        return new AsyncInvoker<CreateVideoSynthesisTaskRequest, CreateVideoSynthesisTaskResponse>(request,
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
     * @return CompletableFuture<CreateVideoTranslateTaskResponse>
     */
    public CompletableFuture<CreateVideoTranslateTaskResponse> createVideoTranslateTaskAsync(
        CreateVideoTranslateTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.createVideoTranslateTask);
    }

    /**
     * 创建任务
     *
     * Create Task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVideoTranslateTaskRequest 请求对象
     * @return AsyncInvoker<CreateVideoTranslateTaskRequest, CreateVideoTranslateTaskResponse>
     */
    public AsyncInvoker<CreateVideoTranslateTaskRequest, CreateVideoTranslateTaskResponse> createVideoTranslateTaskAsyncInvoker(
        CreateVideoTranslateTaskRequest request) {
        return new AsyncInvoker<CreateVideoTranslateTaskRequest, CreateVideoTranslateTaskResponse>(request,
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
     * @return CompletableFuture<RunCelebrityRecognitionResponse>
     */
    public CompletableFuture<RunCelebrityRecognitionResponse> runCelebrityRecognitionAsync(
        RunCelebrityRecognitionRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.runCelebrityRecognition);
    }

    /**
     * 名人识别
     *
     * 分析并识别图片中包含的政治人物、明星及网红人物，返回人物信息及人脸坐标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunCelebrityRecognitionRequest 请求对象
     * @return AsyncInvoker<RunCelebrityRecognitionRequest, RunCelebrityRecognitionResponse>
     */
    public AsyncInvoker<RunCelebrityRecognitionRequest, RunCelebrityRecognitionResponse> runCelebrityRecognitionAsyncInvoker(
        RunCelebrityRecognitionRequest request) {
        return new AsyncInvoker<RunCelebrityRecognitionRequest, RunCelebrityRecognitionResponse>(request,
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
     * @return CompletableFuture<RunDeleteCustomTagsResponse>
     */
    public CompletableFuture<RunDeleteCustomTagsResponse> runDeleteCustomTagsAsync(RunDeleteCustomTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.runDeleteCustomTags);
    }

    /**
     * 删除媒资图像标签
     *
     * 用于用户删除自定义的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunDeleteCustomTagsRequest 请求对象
     * @return AsyncInvoker<RunDeleteCustomTagsRequest, RunDeleteCustomTagsResponse>
     */
    public AsyncInvoker<RunDeleteCustomTagsRequest, RunDeleteCustomTagsResponse> runDeleteCustomTagsAsyncInvoker(
        RunDeleteCustomTagsRequest request) {
        return new AsyncInvoker<RunDeleteCustomTagsRequest, RunDeleteCustomTagsResponse>(request,
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
     * @return CompletableFuture<RunImageDescriptionResponse>
     */
    public CompletableFuture<RunImageDescriptionResponse> runImageDescriptionAsync(RunImageDescriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.runImageDescription);
    }

    /**
     * 图像描述
     *
     * 图像描述
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunImageDescriptionRequest 请求对象
     * @return AsyncInvoker<RunImageDescriptionRequest, RunImageDescriptionResponse>
     */
    public AsyncInvoker<RunImageDescriptionRequest, RunImageDescriptionResponse> runImageDescriptionAsyncInvoker(
        RunImageDescriptionRequest request) {
        return new AsyncInvoker<RunImageDescriptionRequest, RunImageDescriptionResponse>(request,
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
     * @return CompletableFuture<RunImageMainObjectDetectionResponse>
     */
    public CompletableFuture<RunImageMainObjectDetectionResponse> runImageMainObjectDetectionAsync(
        RunImageMainObjectDetectionRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.runImageMainObjectDetection);
    }

    /**
     * 主体识别
     *
     * 检测图像中的主要内容，返回主要内容的坐标信息，这里的主要内容包括两方面：bounding_box和main_object_box
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunImageMainObjectDetectionRequest 请求对象
     * @return AsyncInvoker<RunImageMainObjectDetectionRequest, RunImageMainObjectDetectionResponse>
     */
    public AsyncInvoker<RunImageMainObjectDetectionRequest, RunImageMainObjectDetectionResponse> runImageMainObjectDetectionAsyncInvoker(
        RunImageMainObjectDetectionRequest request) {
        return new AsyncInvoker<RunImageMainObjectDetectionRequest, RunImageMainObjectDetectionResponse>(request,
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
     * @return CompletableFuture<RunImageMediaTaggingResponse>
     */
    public CompletableFuture<RunImageMediaTaggingResponse> runImageMediaTaggingAsync(
        RunImageMediaTaggingRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.runImageMediaTagging);
    }

    /**
     * 标签识别
     *
     * 自然图像的语义内容非常丰富，一个图像包含多个标签内容，图像标签服务准确识别自然图片中数百种场景、上千种通用物体及其属性，让智能相册管理、照片检索和分类、基于场景内容或者物体的广告推荐等功能更加直观。使用时用户发送待处理图片，返回图片标签内容及相应置信度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunImageMediaTaggingRequest 请求对象
     * @return AsyncInvoker<RunImageMediaTaggingRequest, RunImageMediaTaggingResponse>
     */
    public AsyncInvoker<RunImageMediaTaggingRequest, RunImageMediaTaggingResponse> runImageMediaTaggingAsyncInvoker(
        RunImageMediaTaggingRequest request) {
        return new AsyncInvoker<RunImageMediaTaggingRequest, RunImageMediaTaggingResponse>(request,
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
     * @return CompletableFuture<RunImageMediaTaggingDetResponse>
     */
    public CompletableFuture<RunImageMediaTaggingDetResponse> runImageMediaTaggingDetAsync(
        RunImageMediaTaggingDetRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.runImageMediaTaggingDet);
    }

    /**
     * 媒资图像标签检测
     *
     * 自然图像的语义内容非常丰富，一个图像包含多个标签内容，图像标签服务准确识别自然图片中数百种场景、上千种通用物体及其属性，让智能相册管理、照片检索和分类、基于场景内容或者物体的广告推荐等功能更加直观。使用时用户发送待处理图片，返回图片标签内容及相应的位置坐标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunImageMediaTaggingDetRequest 请求对象
     * @return AsyncInvoker<RunImageMediaTaggingDetRequest, RunImageMediaTaggingDetResponse>
     */
    public AsyncInvoker<RunImageMediaTaggingDetRequest, RunImageMediaTaggingDetResponse> runImageMediaTaggingDetAsyncInvoker(
        RunImageMediaTaggingDetRequest request) {
        return new AsyncInvoker<RunImageMediaTaggingDetRequest, RunImageMediaTaggingDetResponse>(request,
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
     * @return CompletableFuture<RunImageSuperResolutionResponse>
     */
    public CompletableFuture<RunImageSuperResolutionResponse> runImageSuperResolutionAsync(
        RunImageSuperResolutionRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.runImageSuperResolution);
    }

    /**
     * 图像超分
     *
     * 图像数据，base64编码，输入图像范围200px ~ 1080px，支持JPG/PNG/BMP/JPEG/WEBP格式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunImageSuperResolutionRequest 请求对象
     * @return AsyncInvoker<RunImageSuperResolutionRequest, RunImageSuperResolutionResponse>
     */
    public AsyncInvoker<RunImageSuperResolutionRequest, RunImageSuperResolutionResponse> runImageSuperResolutionAsyncInvoker(
        RunImageSuperResolutionRequest request) {
        return new AsyncInvoker<RunImageSuperResolutionRequest, RunImageSuperResolutionResponse>(request,
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
     * @return CompletableFuture<RunImageTaggingResponse>
     */
    public CompletableFuture<RunImageTaggingResponse> runImageTaggingAsync(RunImageTaggingRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.runImageTagging);
    }

    /**
     * 图像标签
     *
     * 自然图像的语义内容非常丰富，一个图像包含多个标签内容，图像标签服务准确识别自然图片中数百种场景、上千种通用物体及其属性，让智能相册管理、照片检索和分类、基于场景内容或者物体的广告推荐等功能更加直观。使用时用户发送待处理图片，返回图片标签内容及相应置信度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunImageTaggingRequest 请求对象
     * @return AsyncInvoker<RunImageTaggingRequest, RunImageTaggingResponse>
     */
    public AsyncInvoker<RunImageTaggingRequest, RunImageTaggingResponse> runImageTaggingAsyncInvoker(
        RunImageTaggingRequest request) {
        return new AsyncInvoker<RunImageTaggingRequest, RunImageTaggingResponse>(request, ImageMeta.runImageTagging,
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
     * @return CompletableFuture<RunImageWisedesignCropResponse>
     */
    public CompletableFuture<RunImageWisedesignCropResponse> runImageWisedesignCropAsync(
        RunImageWisedesignCropRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.runImageWisedesignCrop);
    }

    /**
     * 智能设计图像裁剪
     *
     * 智能设计图像裁剪服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunImageWisedesignCropRequest 请求对象
     * @return AsyncInvoker<RunImageWisedesignCropRequest, RunImageWisedesignCropResponse>
     */
    public AsyncInvoker<RunImageWisedesignCropRequest, RunImageWisedesignCropResponse> runImageWisedesignCropAsyncInvoker(
        RunImageWisedesignCropRequest request) {
        return new AsyncInvoker<RunImageWisedesignCropRequest, RunImageWisedesignCropResponse>(request,
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
     * @return CompletableFuture<RunImageWisedesignInpaintingResponse>
     */
    public CompletableFuture<RunImageWisedesignInpaintingResponse> runImageWisedesignInpaintingAsync(
        RunImageWisedesignInpaintingRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.runImageWisedesignInpainting);
    }

    /**
     * 智能设计图像修复
     *
     * 智能设计图像修复服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunImageWisedesignInpaintingRequest 请求对象
     * @return AsyncInvoker<RunImageWisedesignInpaintingRequest, RunImageWisedesignInpaintingResponse>
     */
    public AsyncInvoker<RunImageWisedesignInpaintingRequest, RunImageWisedesignInpaintingResponse> runImageWisedesignInpaintingAsyncInvoker(
        RunImageWisedesignInpaintingRequest request) {
        return new AsyncInvoker<RunImageWisedesignInpaintingRequest, RunImageWisedesignInpaintingResponse>(request,
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
     * @return CompletableFuture<RunQueryCustomTagsResponse>
     */
    public CompletableFuture<RunQueryCustomTagsResponse> runQueryCustomTagsAsync(RunQueryCustomTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.runQueryCustomTags);
    }

    /**
     * 查询媒资图像标签
     *
     * 用于用户自查是否存在自定义的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunQueryCustomTagsRequest 请求对象
     * @return AsyncInvoker<RunQueryCustomTagsRequest, RunQueryCustomTagsResponse>
     */
    public AsyncInvoker<RunQueryCustomTagsRequest, RunQueryCustomTagsResponse> runQueryCustomTagsAsyncInvoker(
        RunQueryCustomTagsRequest request) {
        return new AsyncInvoker<RunQueryCustomTagsRequest, RunQueryCustomTagsResponse>(request,
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
     * @return CompletableFuture<RunRecaptureDetectResponse>
     */
    public CompletableFuture<RunRecaptureDetectResponse> runRecaptureDetectAsync(RunRecaptureDetectRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.runRecaptureDetect);
    }

    /**
     * 翻拍识别
     *
     * 零售行业通常根据零售店的销售量进行销售奖励，拍摄售出商品的条形码上传后台是常用的统计方式。翻拍识别利用深度神经网络算法判断条形码图片为原始拍摄，还是经过二次翻拍、打印翻拍等手法二次处理的图片。利用翻拍识别，可以检测出经过二次处理的不合规范图片，使得统计数据更准确、有效。。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunRecaptureDetectRequest 请求对象
     * @return AsyncInvoker<RunRecaptureDetectRequest, RunRecaptureDetectResponse>
     */
    public AsyncInvoker<RunRecaptureDetectRequest, RunRecaptureDetectResponse> runRecaptureDetectAsyncInvoker(
        RunRecaptureDetectRequest request) {
        return new AsyncInvoker<RunRecaptureDetectRequest, RunRecaptureDetectResponse>(request,
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
     * @return CompletableFuture<ShowImageHighresolutionMattingTaskResponse>
     */
    public CompletableFuture<ShowImageHighresolutionMattingTaskResponse> showImageHighresolutionMattingTaskAsync(
        ShowImageHighresolutionMattingTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.showImageHighresolutionMattingTask);
    }

    /**
     * 查询任务
     *
     * show task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowImageHighresolutionMattingTaskRequest 请求对象
     * @return AsyncInvoker<ShowImageHighresolutionMattingTaskRequest, ShowImageHighresolutionMattingTaskResponse>
     */
    public AsyncInvoker<ShowImageHighresolutionMattingTaskRequest, ShowImageHighresolutionMattingTaskResponse> showImageHighresolutionMattingTaskAsyncInvoker(
        ShowImageHighresolutionMattingTaskRequest request) {
        return new AsyncInvoker<ShowImageHighresolutionMattingTaskRequest, ShowImageHighresolutionMattingTaskResponse>(
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
     * @return CompletableFuture<ShowImageToVideoTaskResponse>
     */
    public CompletableFuture<ShowImageToVideoTaskResponse> showImageToVideoTaskAsync(
        ShowImageToVideoTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.showImageToVideoTask);
    }

    /**
     * 查询任务
     *
     * show task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowImageToVideoTaskRequest 请求对象
     * @return AsyncInvoker<ShowImageToVideoTaskRequest, ShowImageToVideoTaskResponse>
     */
    public AsyncInvoker<ShowImageToVideoTaskRequest, ShowImageToVideoTaskResponse> showImageToVideoTaskAsyncInvoker(
        ShowImageToVideoTaskRequest request) {
        return new AsyncInvoker<ShowImageToVideoTaskRequest, ShowImageToVideoTaskResponse>(request,
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
     * @return CompletableFuture<ShowImageTranslateTaskResponse>
     */
    public CompletableFuture<ShowImageTranslateTaskResponse> showImageTranslateTaskAsync(
        ShowImageTranslateTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.showImageTranslateTask);
    }

    /**
     * 查询任务
     *
     * show task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowImageTranslateTaskRequest 请求对象
     * @return AsyncInvoker<ShowImageTranslateTaskRequest, ShowImageTranslateTaskResponse>
     */
    public AsyncInvoker<ShowImageTranslateTaskRequest, ShowImageTranslateTaskResponse> showImageTranslateTaskAsyncInvoker(
        ShowImageTranslateTaskRequest request) {
        return new AsyncInvoker<ShowImageTranslateTaskRequest, ShowImageTranslateTaskResponse>(request,
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
     * @return CompletableFuture<ShowImageVariationTaskResponse>
     */
    public CompletableFuture<ShowImageVariationTaskResponse> showImageVariationTaskAsync(
        ShowImageVariationTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.showImageVariationTask);
    }

    /**
     * show task 查询任务信息
     *
     * show task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowImageVariationTaskRequest 请求对象
     * @return AsyncInvoker<ShowImageVariationTaskRequest, ShowImageVariationTaskResponse>
     */
    public AsyncInvoker<ShowImageVariationTaskRequest, ShowImageVariationTaskResponse> showImageVariationTaskAsyncInvoker(
        ShowImageVariationTaskRequest request) {
        return new AsyncInvoker<ShowImageVariationTaskRequest, ShowImageVariationTaskResponse>(request,
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
     * @return CompletableFuture<ShowTextToImageTaskResponse>
     */
    public CompletableFuture<ShowTextToImageTaskResponse> showTextToImageTaskAsync(ShowTextToImageTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.showTextToImageTask);
    }

    /**
     * show task 查询任务信息
     *
     * show task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTextToImageTaskRequest 请求对象
     * @return AsyncInvoker<ShowTextToImageTaskRequest, ShowTextToImageTaskResponse>
     */
    public AsyncInvoker<ShowTextToImageTaskRequest, ShowTextToImageTaskResponse> showTextToImageTaskAsyncInvoker(
        ShowTextToImageTaskRequest request) {
        return new AsyncInvoker<ShowTextToImageTaskRequest, ShowTextToImageTaskResponse>(request,
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
     * @return CompletableFuture<ShowVideoCoverAnalysisTaskResponse>
     */
    public CompletableFuture<ShowVideoCoverAnalysisTaskResponse> showVideoCoverAnalysisTaskAsync(
        ShowVideoCoverAnalysisTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.showVideoCoverAnalysisTask);
    }

    /**
     * 查询任务
     *
     * 查询视频封面任务完成状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVideoCoverAnalysisTaskRequest 请求对象
     * @return AsyncInvoker<ShowVideoCoverAnalysisTaskRequest, ShowVideoCoverAnalysisTaskResponse>
     */
    public AsyncInvoker<ShowVideoCoverAnalysisTaskRequest, ShowVideoCoverAnalysisTaskResponse> showVideoCoverAnalysisTaskAsyncInvoker(
        ShowVideoCoverAnalysisTaskRequest request) {
        return new AsyncInvoker<ShowVideoCoverAnalysisTaskRequest, ShowVideoCoverAnalysisTaskResponse>(request,
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
     * @return CompletableFuture<ShowVideoCuttingTaskResponse>
     */
    public CompletableFuture<ShowVideoCuttingTaskResponse> showVideoCuttingTaskAsync(
        ShowVideoCuttingTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.showVideoCuttingTask);
    }

    /**
     * 查询任务
     *
     * show task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVideoCuttingTaskRequest 请求对象
     * @return AsyncInvoker<ShowVideoCuttingTaskRequest, ShowVideoCuttingTaskResponse>
     */
    public AsyncInvoker<ShowVideoCuttingTaskRequest, ShowVideoCuttingTaskResponse> showVideoCuttingTaskAsyncInvoker(
        ShowVideoCuttingTaskRequest request) {
        return new AsyncInvoker<ShowVideoCuttingTaskRequest, ShowVideoCuttingTaskResponse>(request,
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
     * @return CompletableFuture<ShowVideoShotSplitTaskResponse>
     */
    public CompletableFuture<ShowVideoShotSplitTaskResponse> showVideoShotSplitTaskAsync(
        ShowVideoShotSplitTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.showVideoShotSplitTask);
    }

    /**
     * 查询任务
     *
     * 查询拆条任务状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVideoShotSplitTaskRequest 请求对象
     * @return AsyncInvoker<ShowVideoShotSplitTaskRequest, ShowVideoShotSplitTaskResponse>
     */
    public AsyncInvoker<ShowVideoShotSplitTaskRequest, ShowVideoShotSplitTaskResponse> showVideoShotSplitTaskAsyncInvoker(
        ShowVideoShotSplitTaskRequest request) {
        return new AsyncInvoker<ShowVideoShotSplitTaskRequest, ShowVideoShotSplitTaskResponse>(request,
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
     * @return CompletableFuture<ShowVideoSummarizationAnalysisTaskResponse>
     */
    public CompletableFuture<ShowVideoSummarizationAnalysisTaskResponse> showVideoSummarizationAnalysisTaskAsync(
        ShowVideoSummarizationAnalysisTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.showVideoSummarizationAnalysisTask);
    }

    /**
     * 查询任务
     *
     * show task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVideoSummarizationAnalysisTaskRequest 请求对象
     * @return AsyncInvoker<ShowVideoSummarizationAnalysisTaskRequest, ShowVideoSummarizationAnalysisTaskResponse>
     */
    public AsyncInvoker<ShowVideoSummarizationAnalysisTaskRequest, ShowVideoSummarizationAnalysisTaskResponse> showVideoSummarizationAnalysisTaskAsyncInvoker(
        ShowVideoSummarizationAnalysisTaskRequest request) {
        return new AsyncInvoker<ShowVideoSummarizationAnalysisTaskRequest, ShowVideoSummarizationAnalysisTaskResponse>(
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
     * @return CompletableFuture<ShowVideoSynthesisTaskResponse>
     */
    public CompletableFuture<ShowVideoSynthesisTaskResponse> showVideoSynthesisTaskAsync(
        ShowVideoSynthesisTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.showVideoSynthesisTask);
    }

    /**
     * 查询任务
     *
     * show task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVideoSynthesisTaskRequest 请求对象
     * @return AsyncInvoker<ShowVideoSynthesisTaskRequest, ShowVideoSynthesisTaskResponse>
     */
    public AsyncInvoker<ShowVideoSynthesisTaskRequest, ShowVideoSynthesisTaskResponse> showVideoSynthesisTaskAsyncInvoker(
        ShowVideoSynthesisTaskRequest request) {
        return new AsyncInvoker<ShowVideoSynthesisTaskRequest, ShowVideoSynthesisTaskResponse>(request,
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
     * @return CompletableFuture<ShowVideoTranslateTaskResponse>
     */
    public CompletableFuture<ShowVideoTranslateTaskResponse> showVideoTranslateTaskAsync(
        ShowVideoTranslateTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.showVideoTranslateTask);
    }

    /**
     * 查询任务
     *
     * show task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVideoTranslateTaskRequest 请求对象
     * @return AsyncInvoker<ShowVideoTranslateTaskRequest, ShowVideoTranslateTaskResponse>
     */
    public AsyncInvoker<ShowVideoTranslateTaskRequest, ShowVideoTranslateTaskResponse> showVideoTranslateTaskAsyncInvoker(
        ShowVideoTranslateTaskRequest request) {
        return new AsyncInvoker<ShowVideoTranslateTaskRequest, ShowVideoTranslateTaskResponse>(request,
            ImageMeta.showVideoTranslateTask, hcClient);
    }

}

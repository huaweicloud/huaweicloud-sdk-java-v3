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
     * 创建图像高清抠图任务
     *
     * 创建图像高清抠图任务，将输入的高清图像中的商品主体从原图中扣取出来，输出商品主体图片或者蒙版。
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
     * 创建图像高清抠图任务
     *
     * 创建图像高清抠图任务，将输入的高清图像中的商品主体从原图中扣取出来，输出商品主体图片或者蒙版。
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
     * 创建视频脱敏任务
     *
     * 创建视频脱敏除任务，将输入视频的图像敏感信息模糊化，包括视频中的人脸和车牌
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVideoObjectMaskingTaskRequest 请求对象
     * @return CompletableFuture<CreateVideoObjectMaskingTaskResponse>
     */
    public CompletableFuture<CreateVideoObjectMaskingTaskResponse> createVideoObjectMaskingTaskAsync(
        CreateVideoObjectMaskingTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.createVideoObjectMaskingTask);
    }

    /**
     * 创建视频脱敏任务
     *
     * 创建视频脱敏除任务，将输入视频的图像敏感信息模糊化，包括视频中的人脸和车牌
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVideoObjectMaskingTaskRequest 请求对象
     * @return AsyncInvoker<CreateVideoObjectMaskingTaskRequest, CreateVideoObjectMaskingTaskResponse>
     */
    public AsyncInvoker<CreateVideoObjectMaskingTaskRequest, CreateVideoObjectMaskingTaskResponse> createVideoObjectMaskingTaskAsyncInvoker(
        CreateVideoObjectMaskingTaskRequest request) {
        return new AsyncInvoker<CreateVideoObjectMaskingTaskRequest, CreateVideoObjectMaskingTaskResponse>(request,
            ImageMeta.createVideoObjectMaskingTask, hcClient);
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
     * 查询图像高清抠图任务
     *
     * 查询图像高清抠图任务，返回参数配置以及任务状态信息。
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
     * 查询图像高清抠图任务
     *
     * 查询图像高清抠图任务，返回参数配置以及任务状态信息。
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
     * 查询视频脱敏任务详情
     *
     * show task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVideoObjectMaskingTaskRequest 请求对象
     * @return CompletableFuture<ShowVideoObjectMaskingTaskResponse>
     */
    public CompletableFuture<ShowVideoObjectMaskingTaskResponse> showVideoObjectMaskingTaskAsync(
        ShowVideoObjectMaskingTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.showVideoObjectMaskingTask);
    }

    /**
     * 查询视频脱敏任务详情
     *
     * show task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVideoObjectMaskingTaskRequest 请求对象
     * @return AsyncInvoker<ShowVideoObjectMaskingTaskRequest, ShowVideoObjectMaskingTaskResponse>
     */
    public AsyncInvoker<ShowVideoObjectMaskingTaskRequest, ShowVideoObjectMaskingTaskResponse> showVideoObjectMaskingTaskAsyncInvoker(
        ShowVideoObjectMaskingTaskRequest request) {
        return new AsyncInvoker<ShowVideoObjectMaskingTaskRequest, ShowVideoObjectMaskingTaskResponse>(request,
            ImageMeta.showVideoObjectMaskingTask, hcClient);
    }

}

package com.huaweicloud.sdk.image.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.image.v2.model.CreateImageHighresolutionMattingTaskRequest;
import com.huaweicloud.sdk.image.v2.model.CreateImageHighresolutionMattingTaskResponse;
import com.huaweicloud.sdk.image.v2.model.CreateVideoTaggingMediaTaskRequest;
import com.huaweicloud.sdk.image.v2.model.CreateVideoTaggingMediaTaskResponse;
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

public class ImageClient {

    protected HcClient hcClient;

    public ImageClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ImageClient> newBuilder() {
        ClientBuilder<ImageClient> clientBuilder = new ClientBuilder<>(ImageClient::new);
        return clientBuilder;
    }

    /**
     * 创建图像高清抠图任务
     *
     * 创建图像高清抠图任务，将输入的高清图像中的商品主体从原图中扣取出来，输出商品主体图片或者蒙版。
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
     * 创建图像高清抠图任务
     *
     * 创建图像高清抠图任务，将输入的高清图像中的商品主体从原图中扣取出来，输出商品主体图片或者蒙版。
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
     * 创建视频标签任务
     *
     * 创建视频标签任务，输入一段视频，通过AI模型分析视频中的信息，输出视频所包含的媒资标签、名人标签、logo标签、语音标签、OCR标签等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVideoTaggingMediaTaskRequest 请求对象
     * @return CreateVideoTaggingMediaTaskResponse
     */
    public CreateVideoTaggingMediaTaskResponse createVideoTaggingMediaTask(CreateVideoTaggingMediaTaskRequest request) {
        return hcClient.syncInvokeHttp(request, ImageMeta.createVideoTaggingMediaTask);
    }

    /**
     * 创建视频标签任务
     *
     * 创建视频标签任务，输入一段视频，通过AI模型分析视频中的信息，输出视频所包含的媒资标签、名人标签、logo标签、语音标签、OCR标签等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVideoTaggingMediaTaskRequest 请求对象
     * @return SyncInvoker<CreateVideoTaggingMediaTaskRequest, CreateVideoTaggingMediaTaskResponse>
     */
    public SyncInvoker<CreateVideoTaggingMediaTaskRequest, CreateVideoTaggingMediaTaskResponse> createVideoTaggingMediaTaskInvoker(
        CreateVideoTaggingMediaTaskRequest request) {
        return new SyncInvoker<CreateVideoTaggingMediaTaskRequest, CreateVideoTaggingMediaTaskResponse>(request,
            ImageMeta.createVideoTaggingMediaTask, hcClient);
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
     * 查询图像高清抠图任务
     *
     * 查询图像高清抠图任务，返回参数配置以及任务状态信息。
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
     * 查询图像高清抠图任务
     *
     * 查询图像高清抠图任务，返回参数配置以及任务状态信息。
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
     * 查询视频标签任务
     *
     * 查询视频标签任务详情，返回参数配置以及任务状态信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVideoTaggingMediaTaskRequest 请求对象
     * @return ShowVideoTaggingMediaTaskResponse
     */
    public ShowVideoTaggingMediaTaskResponse showVideoTaggingMediaTask(ShowVideoTaggingMediaTaskRequest request) {
        return hcClient.syncInvokeHttp(request, ImageMeta.showVideoTaggingMediaTask);
    }

    /**
     * 查询视频标签任务
     *
     * 查询视频标签任务详情，返回参数配置以及任务状态信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVideoTaggingMediaTaskRequest 请求对象
     * @return SyncInvoker<ShowVideoTaggingMediaTaskRequest, ShowVideoTaggingMediaTaskResponse>
     */
    public SyncInvoker<ShowVideoTaggingMediaTaskRequest, ShowVideoTaggingMediaTaskResponse> showVideoTaggingMediaTaskInvoker(
        ShowVideoTaggingMediaTaskRequest request) {
        return new SyncInvoker<ShowVideoTaggingMediaTaskRequest, ShowVideoTaggingMediaTaskResponse>(request,
            ImageMeta.showVideoTaggingMediaTask, hcClient);
    }

}

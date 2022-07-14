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
     * 名人识别
     *
     * 分析并识别图片中包含的政治人物、明星及网红人物，返回人物信息及人脸坐标。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 图像主体识别
     *
     * 检测图像中的主要内容，返回主要内容的坐标信息，这里的主要内容包括两方面：bounding_box和main_object_box
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunImageMainObjectDetectionRequest 请求对象
     * @return CompletableFuture<RunImageMainObjectDetectionResponse>
     */
    public CompletableFuture<RunImageMainObjectDetectionResponse> runImageMainObjectDetectionAsync(
        RunImageMainObjectDetectionRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.runImageMainObjectDetection);
    }

    /**
     * 图像主体识别
     *
     * 检测图像中的主要内容，返回主要内容的坐标信息，这里的主要内容包括两方面：bounding_box和main_object_box
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 媒资图像标签
     *
     * 自然图像的语义内容非常丰富，一个图像包含多个标签内容，图像标签服务准确识别自然图片中数百种场景、上千种通用物体及其属性，让智能相册管理、照片检索和分类、基于场景内容或者物体的广告推荐等功能更加直观。使用时用户发送待处理图片，返回图片标签内容及相应置信度。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunImageMediaTaggingRequest 请求对象
     * @return CompletableFuture<RunImageMediaTaggingResponse>
     */
    public CompletableFuture<RunImageMediaTaggingResponse> runImageMediaTaggingAsync(
        RunImageMediaTaggingRequest request) {
        return hcClient.asyncInvokeHttp(request, ImageMeta.runImageMediaTagging);
    }

    /**
     * 媒资图像标签
     *
     * 自然图像的语义内容非常丰富，一个图像包含多个标签内容，图像标签服务准确识别自然图片中数百种场景、上千种通用物体及其属性，让智能相册管理、照片检索和分类、基于场景内容或者物体的广告推荐等功能更加直观。使用时用户发送待处理图片，返回图片标签内容及相应置信度。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 图像标签
     *
     * 自然图像的语义内容非常丰富，一个图像包含多个标签内容，图像标签服务准确识别自然图片中数百种场景、上千种通用物体及其属性，让智能相册管理、照片检索和分类、基于场景内容或者物体的广告推荐等功能更加直观。使用时用户发送待处理图片，返回图片标签内容及相应置信度。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunImageTaggingRequest 请求对象
     * @return AsyncInvoker<RunImageTaggingRequest, RunImageTaggingResponse>
     */
    public AsyncInvoker<RunImageTaggingRequest, RunImageTaggingResponse> runImageTaggingAsyncInvoker(
        RunImageTaggingRequest request) {
        return new AsyncInvoker<RunImageTaggingRequest, RunImageTaggingResponse>(request, ImageMeta.runImageTagging,
            hcClient);
    }

}

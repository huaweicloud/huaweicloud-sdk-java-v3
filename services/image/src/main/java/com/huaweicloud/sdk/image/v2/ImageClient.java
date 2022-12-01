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

}

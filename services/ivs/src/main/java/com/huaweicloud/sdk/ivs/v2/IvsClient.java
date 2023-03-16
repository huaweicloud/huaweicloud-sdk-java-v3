package com.huaweicloud.sdk.ivs.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.ivs.v2.model.*;

public class IvsClient {

    protected HcClient hcClient;

    public IvsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IvsClient> newBuilder() {
        return new ClientBuilder<>(IvsClient::new);
    }

    /**
     * 人证核身证件版（二要素）
     *
     * 使用姓名、身份证号码二要素进行身份审核。身份验证时，传入的数据为身份证信息。提取身份证信息时，可以使用身份证正反面图片，也可以直接输入姓名、身份证号文本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DetectExtentionByIdCardImageRequest 请求对象
     * @return DetectExtentionByIdCardImageResponse
     */
    public DetectExtentionByIdCardImageResponse detectExtentionByIdCardImage(
        DetectExtentionByIdCardImageRequest request) {
        return hcClient.syncInvokeHttp(request, IvsMeta.detectExtentionByIdCardImage);
    }

    /**
     * 人证核身证件版（二要素）
     *
     * 使用姓名、身份证号码二要素进行身份审核。身份验证时，传入的数据为身份证信息。提取身份证信息时，可以使用身份证正反面图片，也可以直接输入姓名、身份证号文本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DetectExtentionByIdCardImageRequest 请求对象
     * @return SyncInvoker<DetectExtentionByIdCardImageRequest, DetectExtentionByIdCardImageResponse>
     */
    public SyncInvoker<DetectExtentionByIdCardImageRequest, DetectExtentionByIdCardImageResponse> detectExtentionByIdCardImageInvoker(
        DetectExtentionByIdCardImageRequest request) {
        return new SyncInvoker<DetectExtentionByIdCardImageRequest, DetectExtentionByIdCardImageResponse>(request,
            IvsMeta.detectExtentionByIdCardImage, hcClient);
    }

    /**
     * 人证核身证件版（二要素）
     *
     * 使用姓名、身份证号码二要素进行身份审核。身份验证时，传入的数据为身份证信息。提取身份证信息时，可以使用身份证正反面图片，也可以直接输入姓名、身份证号文本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DetectExtentionByNameAndIdRequest 请求对象
     * @return DetectExtentionByNameAndIdResponse
     */
    public DetectExtentionByNameAndIdResponse detectExtentionByNameAndId(DetectExtentionByNameAndIdRequest request) {
        return hcClient.syncInvokeHttp(request, IvsMeta.detectExtentionByNameAndId);
    }

    /**
     * 人证核身证件版（二要素）
     *
     * 使用姓名、身份证号码二要素进行身份审核。身份验证时，传入的数据为身份证信息。提取身份证信息时，可以使用身份证正反面图片，也可以直接输入姓名、身份证号文本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DetectExtentionByNameAndIdRequest 请求对象
     * @return SyncInvoker<DetectExtentionByNameAndIdRequest, DetectExtentionByNameAndIdResponse>
     */
    public SyncInvoker<DetectExtentionByNameAndIdRequest, DetectExtentionByNameAndIdResponse> detectExtentionByNameAndIdInvoker(
        DetectExtentionByNameAndIdRequest request) {
        return new SyncInvoker<DetectExtentionByNameAndIdRequest, DetectExtentionByNameAndIdResponse>(request,
            IvsMeta.detectExtentionByNameAndId, hcClient);
    }

    /**
     * 人证核身标准版（三要素）
     *
     * 使用身份证正反面图片提取姓名和身份证号码，与人脸图片进行三要素身份审核。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DetectStandardByIdCardImageRequest 请求对象
     * @return DetectStandardByIdCardImageResponse
     */
    public DetectStandardByIdCardImageResponse detectStandardByIdCardImage(DetectStandardByIdCardImageRequest request) {
        return hcClient.syncInvokeHttp(request, IvsMeta.detectStandardByIdCardImage);
    }

    /**
     * 人证核身标准版（三要素）
     *
     * 使用身份证正反面图片提取姓名和身份证号码，与人脸图片进行三要素身份审核。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DetectStandardByIdCardImageRequest 请求对象
     * @return SyncInvoker<DetectStandardByIdCardImageRequest, DetectStandardByIdCardImageResponse>
     */
    public SyncInvoker<DetectStandardByIdCardImageRequest, DetectStandardByIdCardImageResponse> detectStandardByIdCardImageInvoker(
        DetectStandardByIdCardImageRequest request) {
        return new SyncInvoker<DetectStandardByIdCardImageRequest, DetectStandardByIdCardImageResponse>(request,
            IvsMeta.detectStandardByIdCardImage, hcClient);
    }

    /**
     * 人证核身标准版（三要素）
     *
     * 使用姓名、身份证号文本和人脸图片进行三要素身份审核。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DetectStandardByNameAndIdRequest 请求对象
     * @return DetectStandardByNameAndIdResponse
     */
    public DetectStandardByNameAndIdResponse detectStandardByNameAndId(DetectStandardByNameAndIdRequest request) {
        return hcClient.syncInvokeHttp(request, IvsMeta.detectStandardByNameAndId);
    }

    /**
     * 人证核身标准版（三要素）
     *
     * 使用姓名、身份证号文本和人脸图片进行三要素身份审核。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DetectStandardByNameAndIdRequest 请求对象
     * @return SyncInvoker<DetectStandardByNameAndIdRequest, DetectStandardByNameAndIdResponse>
     */
    public SyncInvoker<DetectStandardByNameAndIdRequest, DetectStandardByNameAndIdResponse> detectStandardByNameAndIdInvoker(
        DetectStandardByNameAndIdRequest request) {
        return new SyncInvoker<DetectStandardByNameAndIdRequest, DetectStandardByNameAndIdResponse>(request,
            IvsMeta.detectStandardByNameAndId, hcClient);
    }

    /**
     * 人证核身标准版（三要素）
     *
     * 从身份证正反面图片中提取姓名和身份证号码，并对视频做活体检测后提取人脸图片，以此进行三要素身份审核。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DetectStandardByVideoAndIdCardImageRequest 请求对象
     * @return DetectStandardByVideoAndIdCardImageResponse
     */
    public DetectStandardByVideoAndIdCardImageResponse detectStandardByVideoAndIdCardImage(
        DetectStandardByVideoAndIdCardImageRequest request) {
        return hcClient.syncInvokeHttp(request, IvsMeta.detectStandardByVideoAndIdCardImage);
    }

    /**
     * 人证核身标准版（三要素）
     *
     * 从身份证正反面图片中提取姓名和身份证号码，并对视频做活体检测后提取人脸图片，以此进行三要素身份审核。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DetectStandardByVideoAndIdCardImageRequest 请求对象
     * @return SyncInvoker<DetectStandardByVideoAndIdCardImageRequest, DetectStandardByVideoAndIdCardImageResponse>
     */
    public SyncInvoker<DetectStandardByVideoAndIdCardImageRequest, DetectStandardByVideoAndIdCardImageResponse> detectStandardByVideoAndIdCardImageInvoker(
        DetectStandardByVideoAndIdCardImageRequest request) {
        return new SyncInvoker<DetectStandardByVideoAndIdCardImageRequest, DetectStandardByVideoAndIdCardImageResponse>(
            request, IvsMeta.detectStandardByVideoAndIdCardImage, hcClient);
    }

    /**
     * 人证核身标准版（三要素）
     *
     * 使用姓名、身份证号文本，并对视频做活体检测后提取人脸图片，以此进行三要素身份审核。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DetectStandardByVideoAndNameAndIdRequest 请求对象
     * @return DetectStandardByVideoAndNameAndIdResponse
     */
    public DetectStandardByVideoAndNameAndIdResponse detectStandardByVideoAndNameAndId(
        DetectStandardByVideoAndNameAndIdRequest request) {
        return hcClient.syncInvokeHttp(request, IvsMeta.detectStandardByVideoAndNameAndId);
    }

    /**
     * 人证核身标准版（三要素）
     *
     * 使用姓名、身份证号文本，并对视频做活体检测后提取人脸图片，以此进行三要素身份审核。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DetectStandardByVideoAndNameAndIdRequest 请求对象
     * @return SyncInvoker<DetectStandardByVideoAndNameAndIdRequest, DetectStandardByVideoAndNameAndIdResponse>
     */
    public SyncInvoker<DetectStandardByVideoAndNameAndIdRequest, DetectStandardByVideoAndNameAndIdResponse> detectStandardByVideoAndNameAndIdInvoker(
        DetectStandardByVideoAndNameAndIdRequest request) {
        return new SyncInvoker<DetectStandardByVideoAndNameAndIdRequest, DetectStandardByVideoAndNameAndIdResponse>(
            request, IvsMeta.detectStandardByVideoAndNameAndId, hcClient);
    }

}

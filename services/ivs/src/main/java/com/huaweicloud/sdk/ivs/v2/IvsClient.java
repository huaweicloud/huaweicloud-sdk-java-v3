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
     * 使用姓名、身份证号码、人脸图片三要素进行身份审核。
     * 身份验证时，传入的数据为人脸图片、身份证信息。提取身份证信息时，可以使用身份证正反面图片，也可以直接输入姓名、身份证号文本。
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
     * 使用姓名、身份证号码、人脸图片三要素进行身份审核。
     * 身份验证时，传入的数据为人脸图片、身份证信息。提取身份证信息时，可以使用身份证正反面图片，也可以直接输入姓名、身份证号文本。
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
     * 校验用户上传的身份证图片支持正反面同时上传 中的信息的真实性，输出最终的审核结果。 该接口也支持用户直接上传姓名和身份证号码进行合法性校验 。
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
     * 校验用户上传的身份证图片支持正反面同时上传 中的信息的真实性，输出最终的审核结果。 该接口也支持用户直接上传姓名和身份证号码进行合法性校验 。
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

}

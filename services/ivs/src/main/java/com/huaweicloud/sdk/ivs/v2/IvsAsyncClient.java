package com.huaweicloud.sdk.ivs.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.ivs.v2.model.*;

import java.util.concurrent.CompletableFuture;

public class IvsAsyncClient {

    protected HcClient hcClient;

    public IvsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IvsAsyncClient> newBuilder() {
        return new ClientBuilder<>(IvsAsyncClient::new);
    }

    /**
     * 人证核身证件版（二要素）
     *
     * 使用姓名、身份证号码二要素进行身份审核。身份验证时，传入的数据为身份证信息。提取身份证信息时，可以使用身份证正反面图片，也可以直接输入姓名、身份证号文本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DetectExtentionByIdCardImageRequest 请求对象
     * @return CompletableFuture<DetectExtentionByIdCardImageResponse>
     */
    public CompletableFuture<DetectExtentionByIdCardImageResponse> detectExtentionByIdCardImageAsync(
        DetectExtentionByIdCardImageRequest request) {
        return hcClient.asyncInvokeHttp(request, IvsMeta.detectExtentionByIdCardImage);
    }

    /**
     * 人证核身证件版（二要素）
     *
     * 使用姓名、身份证号码二要素进行身份审核。身份验证时，传入的数据为身份证信息。提取身份证信息时，可以使用身份证正反面图片，也可以直接输入姓名、身份证号文本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DetectExtentionByIdCardImageRequest 请求对象
     * @return AsyncInvoker<DetectExtentionByIdCardImageRequest, DetectExtentionByIdCardImageResponse>
     */
    public AsyncInvoker<DetectExtentionByIdCardImageRequest, DetectExtentionByIdCardImageResponse> detectExtentionByIdCardImageAsyncInvoker(
        DetectExtentionByIdCardImageRequest request) {
        return new AsyncInvoker<DetectExtentionByIdCardImageRequest, DetectExtentionByIdCardImageResponse>(request,
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
     * @return CompletableFuture<DetectExtentionByNameAndIdResponse>
     */
    public CompletableFuture<DetectExtentionByNameAndIdResponse> detectExtentionByNameAndIdAsync(
        DetectExtentionByNameAndIdRequest request) {
        return hcClient.asyncInvokeHttp(request, IvsMeta.detectExtentionByNameAndId);
    }

    /**
     * 人证核身证件版（二要素）
     *
     * 使用姓名、身份证号码二要素进行身份审核。身份验证时，传入的数据为身份证信息。提取身份证信息时，可以使用身份证正反面图片，也可以直接输入姓名、身份证号文本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DetectExtentionByNameAndIdRequest 请求对象
     * @return AsyncInvoker<DetectExtentionByNameAndIdRequest, DetectExtentionByNameAndIdResponse>
     */
    public AsyncInvoker<DetectExtentionByNameAndIdRequest, DetectExtentionByNameAndIdResponse> detectExtentionByNameAndIdAsyncInvoker(
        DetectExtentionByNameAndIdRequest request) {
        return new AsyncInvoker<DetectExtentionByNameAndIdRequest, DetectExtentionByNameAndIdResponse>(request,
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
     * @return CompletableFuture<DetectStandardByIdCardImageResponse>
     */
    public CompletableFuture<DetectStandardByIdCardImageResponse> detectStandardByIdCardImageAsync(
        DetectStandardByIdCardImageRequest request) {
        return hcClient.asyncInvokeHttp(request, IvsMeta.detectStandardByIdCardImage);
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
     * @return AsyncInvoker<DetectStandardByIdCardImageRequest, DetectStandardByIdCardImageResponse>
     */
    public AsyncInvoker<DetectStandardByIdCardImageRequest, DetectStandardByIdCardImageResponse> detectStandardByIdCardImageAsyncInvoker(
        DetectStandardByIdCardImageRequest request) {
        return new AsyncInvoker<DetectStandardByIdCardImageRequest, DetectStandardByIdCardImageResponse>(request,
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
     * @return CompletableFuture<DetectStandardByNameAndIdResponse>
     */
    public CompletableFuture<DetectStandardByNameAndIdResponse> detectStandardByNameAndIdAsync(
        DetectStandardByNameAndIdRequest request) {
        return hcClient.asyncInvokeHttp(request, IvsMeta.detectStandardByNameAndId);
    }

    /**
     * 人证核身标准版（三要素）
     *
     * 校验用户上传的身份证图片支持正反面同时上传 中的信息的真实性，输出最终的审核结果。 该接口也支持用户直接上传姓名和身份证号码进行合法性校验 。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DetectStandardByNameAndIdRequest 请求对象
     * @return AsyncInvoker<DetectStandardByNameAndIdRequest, DetectStandardByNameAndIdResponse>
     */
    public AsyncInvoker<DetectStandardByNameAndIdRequest, DetectStandardByNameAndIdResponse> detectStandardByNameAndIdAsyncInvoker(
        DetectStandardByNameAndIdRequest request) {
        return new AsyncInvoker<DetectStandardByNameAndIdRequest, DetectStandardByNameAndIdResponse>(request,
            IvsMeta.detectStandardByNameAndId, hcClient);
    }

}

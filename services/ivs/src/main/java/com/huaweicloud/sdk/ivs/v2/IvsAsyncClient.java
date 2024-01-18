package com.huaweicloud.sdk.ivs.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.ivs.v2.model.DetectExtentionByIdCardImageRequest;
import com.huaweicloud.sdk.ivs.v2.model.DetectExtentionByIdCardImageResponse;
import com.huaweicloud.sdk.ivs.v2.model.DetectExtentionByNameAndIdRequest;
import com.huaweicloud.sdk.ivs.v2.model.DetectExtentionByNameAndIdResponse;
import com.huaweicloud.sdk.ivs.v2.model.DetectStandardByIdCardImageRequest;
import com.huaweicloud.sdk.ivs.v2.model.DetectStandardByIdCardImageResponse;
import com.huaweicloud.sdk.ivs.v2.model.DetectStandardByNameAndIdRequest;
import com.huaweicloud.sdk.ivs.v2.model.DetectStandardByNameAndIdResponse;
import com.huaweicloud.sdk.ivs.v2.model.DetectStandardByVideoAndIdCardImageRequest;
import com.huaweicloud.sdk.ivs.v2.model.DetectStandardByVideoAndIdCardImageResponse;
import com.huaweicloud.sdk.ivs.v2.model.DetectStandardByVideoAndNameAndIdRequest;
import com.huaweicloud.sdk.ivs.v2.model.DetectStandardByVideoAndNameAndIdResponse;

import java.util.concurrent.CompletableFuture;

public class IvsAsyncClient {

    protected HcClient hcClient;

    public IvsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IvsAsyncClient> newBuilder() {
        ClientBuilder<IvsAsyncClient> clientBuilder = new ClientBuilder<>(IvsAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 人证核身证件版（二要素）
     *
     * 使用姓名、身份证号码二要素进行身份审核。身份验证时，传入的数据为身份证信息。提取身份证信息时，可以使用身份证正反面图片，也可以直接输入姓名、身份证号文本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectExtentionByIdCardImageRequest 请求对象
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
     * @param request DetectExtentionByIdCardImageRequest 请求对象
     * @return AsyncInvoker<DetectExtentionByIdCardImageRequest, DetectExtentionByIdCardImageResponse>
     */
    public AsyncInvoker<DetectExtentionByIdCardImageRequest, DetectExtentionByIdCardImageResponse> detectExtentionByIdCardImageAsyncInvoker(
        DetectExtentionByIdCardImageRequest request) {
        return new AsyncInvoker<>(request, IvsMeta.detectExtentionByIdCardImage, hcClient);
    }

    /**
     * 人证核身证件版（二要素）
     *
     * 使用姓名、身份证号码二要素进行身份审核。身份验证时，传入的数据为身份证信息。提取身份证信息时，可以使用身份证正反面图片，也可以直接输入姓名、身份证号文本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectExtentionByNameAndIdRequest 请求对象
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
     * @param request DetectExtentionByNameAndIdRequest 请求对象
     * @return AsyncInvoker<DetectExtentionByNameAndIdRequest, DetectExtentionByNameAndIdResponse>
     */
    public AsyncInvoker<DetectExtentionByNameAndIdRequest, DetectExtentionByNameAndIdResponse> detectExtentionByNameAndIdAsyncInvoker(
        DetectExtentionByNameAndIdRequest request) {
        return new AsyncInvoker<>(request, IvsMeta.detectExtentionByNameAndId, hcClient);
    }

    /**
     * 人证核身标准版（三要素）
     *
     * 使用身份证正反面图片提取姓名和身份证号码，与人脸图片进行三要素身份审核。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectStandardByIdCardImageRequest 请求对象
     * @return CompletableFuture<DetectStandardByIdCardImageResponse>
     */
    public CompletableFuture<DetectStandardByIdCardImageResponse> detectStandardByIdCardImageAsync(
        DetectStandardByIdCardImageRequest request) {
        return hcClient.asyncInvokeHttp(request, IvsMeta.detectStandardByIdCardImage);
    }

    /**
     * 人证核身标准版（三要素）
     *
     * 使用身份证正反面图片提取姓名和身份证号码，与人脸图片进行三要素身份审核。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectStandardByIdCardImageRequest 请求对象
     * @return AsyncInvoker<DetectStandardByIdCardImageRequest, DetectStandardByIdCardImageResponse>
     */
    public AsyncInvoker<DetectStandardByIdCardImageRequest, DetectStandardByIdCardImageResponse> detectStandardByIdCardImageAsyncInvoker(
        DetectStandardByIdCardImageRequest request) {
        return new AsyncInvoker<>(request, IvsMeta.detectStandardByIdCardImage, hcClient);
    }

    /**
     * 人证核身标准版（三要素）
     *
     * 使用姓名、身份证号文本和人脸图片进行三要素身份审核。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectStandardByNameAndIdRequest 请求对象
     * @return CompletableFuture<DetectStandardByNameAndIdResponse>
     */
    public CompletableFuture<DetectStandardByNameAndIdResponse> detectStandardByNameAndIdAsync(
        DetectStandardByNameAndIdRequest request) {
        return hcClient.asyncInvokeHttp(request, IvsMeta.detectStandardByNameAndId);
    }

    /**
     * 人证核身标准版（三要素）
     *
     * 使用姓名、身份证号文本和人脸图片进行三要素身份审核。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectStandardByNameAndIdRequest 请求对象
     * @return AsyncInvoker<DetectStandardByNameAndIdRequest, DetectStandardByNameAndIdResponse>
     */
    public AsyncInvoker<DetectStandardByNameAndIdRequest, DetectStandardByNameAndIdResponse> detectStandardByNameAndIdAsyncInvoker(
        DetectStandardByNameAndIdRequest request) {
        return new AsyncInvoker<>(request, IvsMeta.detectStandardByNameAndId, hcClient);
    }

    /**
     * 人证核身标准版（三要素）
     *
     * 从身份证正反面图片中提取姓名和身份证号码，并对视频做活体检测后提取人脸图片，以此进行三要素身份审核。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectStandardByVideoAndIdCardImageRequest 请求对象
     * @return CompletableFuture<DetectStandardByVideoAndIdCardImageResponse>
     */
    public CompletableFuture<DetectStandardByVideoAndIdCardImageResponse> detectStandardByVideoAndIdCardImageAsync(
        DetectStandardByVideoAndIdCardImageRequest request) {
        return hcClient.asyncInvokeHttp(request, IvsMeta.detectStandardByVideoAndIdCardImage);
    }

    /**
     * 人证核身标准版（三要素）
     *
     * 从身份证正反面图片中提取姓名和身份证号码，并对视频做活体检测后提取人脸图片，以此进行三要素身份审核。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectStandardByVideoAndIdCardImageRequest 请求对象
     * @return AsyncInvoker<DetectStandardByVideoAndIdCardImageRequest, DetectStandardByVideoAndIdCardImageResponse>
     */
    public AsyncInvoker<DetectStandardByVideoAndIdCardImageRequest, DetectStandardByVideoAndIdCardImageResponse> detectStandardByVideoAndIdCardImageAsyncInvoker(
        DetectStandardByVideoAndIdCardImageRequest request) {
        return new AsyncInvoker<>(request, IvsMeta.detectStandardByVideoAndIdCardImage, hcClient);
    }

    /**
     * 人证核身标准版（三要素）
     *
     * 使用姓名、身份证号文本，并对视频做活体检测后提取人脸图片，以此进行三要素身份审核。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectStandardByVideoAndNameAndIdRequest 请求对象
     * @return CompletableFuture<DetectStandardByVideoAndNameAndIdResponse>
     */
    public CompletableFuture<DetectStandardByVideoAndNameAndIdResponse> detectStandardByVideoAndNameAndIdAsync(
        DetectStandardByVideoAndNameAndIdRequest request) {
        return hcClient.asyncInvokeHttp(request, IvsMeta.detectStandardByVideoAndNameAndId);
    }

    /**
     * 人证核身标准版（三要素）
     *
     * 使用姓名、身份证号文本，并对视频做活体检测后提取人脸图片，以此进行三要素身份审核。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectStandardByVideoAndNameAndIdRequest 请求对象
     * @return AsyncInvoker<DetectStandardByVideoAndNameAndIdRequest, DetectStandardByVideoAndNameAndIdResponse>
     */
    public AsyncInvoker<DetectStandardByVideoAndNameAndIdRequest, DetectStandardByVideoAndNameAndIdResponse> detectStandardByVideoAndNameAndIdAsyncInvoker(
        DetectStandardByVideoAndNameAndIdRequest request) {
        return new AsyncInvoker<>(request, IvsMeta.detectStandardByVideoAndNameAndId, hcClient);
    }

}

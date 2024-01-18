package com.huaweicloud.sdk.frs.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.frs.v2.model.AddFacesByBase64Request;
import com.huaweicloud.sdk.frs.v2.model.AddFacesByBase64Response;
import com.huaweicloud.sdk.frs.v2.model.AddFacesByFileRequest;
import com.huaweicloud.sdk.frs.v2.model.AddFacesByFileResponse;
import com.huaweicloud.sdk.frs.v2.model.AddFacesByUrlRequest;
import com.huaweicloud.sdk.frs.v2.model.AddFacesByUrlResponse;
import com.huaweicloud.sdk.frs.v2.model.BatchDeleteFacesRequest;
import com.huaweicloud.sdk.frs.v2.model.BatchDeleteFacesResponse;
import com.huaweicloud.sdk.frs.v2.model.CompareFaceByBase64Request;
import com.huaweicloud.sdk.frs.v2.model.CompareFaceByBase64Response;
import com.huaweicloud.sdk.frs.v2.model.CompareFaceByFileRequest;
import com.huaweicloud.sdk.frs.v2.model.CompareFaceByFileResponse;
import com.huaweicloud.sdk.frs.v2.model.CompareFaceByUrlRequest;
import com.huaweicloud.sdk.frs.v2.model.CompareFaceByUrlResponse;
import com.huaweicloud.sdk.frs.v2.model.CreateFaceSetRequest;
import com.huaweicloud.sdk.frs.v2.model.CreateFaceSetResponse;
import com.huaweicloud.sdk.frs.v2.model.DeleteFaceByExternalImageIdRequest;
import com.huaweicloud.sdk.frs.v2.model.DeleteFaceByExternalImageIdResponse;
import com.huaweicloud.sdk.frs.v2.model.DeleteFaceByFaceIdRequest;
import com.huaweicloud.sdk.frs.v2.model.DeleteFaceByFaceIdResponse;
import com.huaweicloud.sdk.frs.v2.model.DeleteFaceSetRequest;
import com.huaweicloud.sdk.frs.v2.model.DeleteFaceSetResponse;
import com.huaweicloud.sdk.frs.v2.model.DetectFaceByBase64IntlRequest;
import com.huaweicloud.sdk.frs.v2.model.DetectFaceByBase64IntlResponse;
import com.huaweicloud.sdk.frs.v2.model.DetectFaceByBase64Request;
import com.huaweicloud.sdk.frs.v2.model.DetectFaceByBase64Response;
import com.huaweicloud.sdk.frs.v2.model.DetectFaceByFileIntlRequest;
import com.huaweicloud.sdk.frs.v2.model.DetectFaceByFileIntlResponse;
import com.huaweicloud.sdk.frs.v2.model.DetectFaceByFileRequest;
import com.huaweicloud.sdk.frs.v2.model.DetectFaceByFileResponse;
import com.huaweicloud.sdk.frs.v2.model.DetectFaceByUrlIntlRequest;
import com.huaweicloud.sdk.frs.v2.model.DetectFaceByUrlIntlResponse;
import com.huaweicloud.sdk.frs.v2.model.DetectFaceByUrlRequest;
import com.huaweicloud.sdk.frs.v2.model.DetectFaceByUrlResponse;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveByBase64IntlRequest;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveByBase64IntlResponse;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveByBase64Request;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveByBase64Response;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveByFileIntlRequest;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveByFileIntlResponse;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveByFileRequest;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveByFileResponse;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveByUrlIntlRequest;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveByUrlIntlResponse;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveByUrlRequest;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveByUrlResponse;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveFaceByBase64Request;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveFaceByBase64Response;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveFaceByFileRequest;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveFaceByFileResponse;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveFaceByUrlRequest;
import com.huaweicloud.sdk.frs.v2.model.DetectLiveFaceByUrlResponse;
import com.huaweicloud.sdk.frs.v2.model.SearchFaceByBase64Request;
import com.huaweicloud.sdk.frs.v2.model.SearchFaceByBase64Response;
import com.huaweicloud.sdk.frs.v2.model.SearchFaceByFaceIdRequest;
import com.huaweicloud.sdk.frs.v2.model.SearchFaceByFaceIdResponse;
import com.huaweicloud.sdk.frs.v2.model.SearchFaceByFileRequest;
import com.huaweicloud.sdk.frs.v2.model.SearchFaceByFileResponse;
import com.huaweicloud.sdk.frs.v2.model.SearchFaceByUrlRequest;
import com.huaweicloud.sdk.frs.v2.model.SearchFaceByUrlResponse;
import com.huaweicloud.sdk.frs.v2.model.ShowAllFaceSetsRequest;
import com.huaweicloud.sdk.frs.v2.model.ShowAllFaceSetsResponse;
import com.huaweicloud.sdk.frs.v2.model.ShowFaceSetRequest;
import com.huaweicloud.sdk.frs.v2.model.ShowFaceSetResponse;
import com.huaweicloud.sdk.frs.v2.model.ShowFacesByFaceIdRequest;
import com.huaweicloud.sdk.frs.v2.model.ShowFacesByFaceIdResponse;
import com.huaweicloud.sdk.frs.v2.model.ShowFacesByLimitRequest;
import com.huaweicloud.sdk.frs.v2.model.ShowFacesByLimitResponse;
import com.huaweicloud.sdk.frs.v2.model.UpdateFaceRequest;
import com.huaweicloud.sdk.frs.v2.model.UpdateFaceResponse;

import java.util.concurrent.CompletableFuture;

public class FrsAsyncClient {

    protected HcClient hcClient;

    public FrsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<FrsAsyncClient> newBuilder() {
        ClientBuilder<FrsAsyncClient> clientBuilder = new ClientBuilder<>(FrsAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 添加人脸
     *
     * 添加人脸到人脸库中。将单张图片中的人脸添加至人脸库中，支持添加最大人脸或所有人脸。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddFacesByBase64Request 请求对象
     * @return CompletableFuture<AddFacesByBase64Response>
     */
    public CompletableFuture<AddFacesByBase64Response> addFacesByBase64Async(AddFacesByBase64Request request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.addFacesByBase64);
    }

    /**
     * 添加人脸
     *
     * 添加人脸到人脸库中。将单张图片中的人脸添加至人脸库中，支持添加最大人脸或所有人脸。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddFacesByBase64Request 请求对象
     * @return AsyncInvoker<AddFacesByBase64Request, AddFacesByBase64Response>
     */
    public AsyncInvoker<AddFacesByBase64Request, AddFacesByBase64Response> addFacesByBase64AsyncInvoker(
        AddFacesByBase64Request request) {
        return new AsyncInvoker<>(request, FrsMeta.addFacesByBase64, hcClient);
    }

    /**
     * 添加人脸
     *
     * 添加人脸到人脸库中。将单张图片中的人脸添加至人脸库中，支持添加最大人脸或所有人脸。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddFacesByFileRequest 请求对象
     * @return CompletableFuture<AddFacesByFileResponse>
     */
    public CompletableFuture<AddFacesByFileResponse> addFacesByFileAsync(AddFacesByFileRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.addFacesByFile);
    }

    /**
     * 添加人脸
     *
     * 添加人脸到人脸库中。将单张图片中的人脸添加至人脸库中，支持添加最大人脸或所有人脸。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddFacesByFileRequest 请求对象
     * @return AsyncInvoker<AddFacesByFileRequest, AddFacesByFileResponse>
     */
    public AsyncInvoker<AddFacesByFileRequest, AddFacesByFileResponse> addFacesByFileAsyncInvoker(
        AddFacesByFileRequest request) {
        return new AsyncInvoker<>(request, FrsMeta.addFacesByFile, hcClient);
    }

    /**
     * 添加人脸
     *
     * 添加人脸到人脸库中。将单张图片中的人脸添加至人脸库中，支持添加最大人脸或所有人脸。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddFacesByUrlRequest 请求对象
     * @return CompletableFuture<AddFacesByUrlResponse>
     */
    public CompletableFuture<AddFacesByUrlResponse> addFacesByUrlAsync(AddFacesByUrlRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.addFacesByUrl);
    }

    /**
     * 添加人脸
     *
     * 添加人脸到人脸库中。将单张图片中的人脸添加至人脸库中，支持添加最大人脸或所有人脸。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddFacesByUrlRequest 请求对象
     * @return AsyncInvoker<AddFacesByUrlRequest, AddFacesByUrlResponse>
     */
    public AsyncInvoker<AddFacesByUrlRequest, AddFacesByUrlResponse> addFacesByUrlAsyncInvoker(
        AddFacesByUrlRequest request) {
        return new AsyncInvoker<>(request, FrsMeta.addFacesByUrl, hcClient);
    }

    /**
     * 批量删除人脸
     *
     * 自定义筛选条件，批量删除人脸库中的符合指定条件的多张人脸。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteFacesRequest 请求对象
     * @return CompletableFuture<BatchDeleteFacesResponse>
     */
    public CompletableFuture<BatchDeleteFacesResponse> batchDeleteFacesAsync(BatchDeleteFacesRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.batchDeleteFaces);
    }

    /**
     * 批量删除人脸
     *
     * 自定义筛选条件，批量删除人脸库中的符合指定条件的多张人脸。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteFacesRequest 请求对象
     * @return AsyncInvoker<BatchDeleteFacesRequest, BatchDeleteFacesResponse>
     */
    public AsyncInvoker<BatchDeleteFacesRequest, BatchDeleteFacesResponse> batchDeleteFacesAsyncInvoker(
        BatchDeleteFacesRequest request) {
        return new AsyncInvoker<>(request, FrsMeta.batchDeleteFaces, hcClient);
    }

    /**
     * 人脸比对
     *
     * 人脸比对是将两个人脸进行比对，来判断是否为同一个人，返回比对置信度。如果传入的图片中包含多个人脸，选取最大的人脸进行比对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CompareFaceByBase64Request 请求对象
     * @return CompletableFuture<CompareFaceByBase64Response>
     */
    public CompletableFuture<CompareFaceByBase64Response> compareFaceByBase64Async(CompareFaceByBase64Request request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.compareFaceByBase64);
    }

    /**
     * 人脸比对
     *
     * 人脸比对是将两个人脸进行比对，来判断是否为同一个人，返回比对置信度。如果传入的图片中包含多个人脸，选取最大的人脸进行比对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CompareFaceByBase64Request 请求对象
     * @return AsyncInvoker<CompareFaceByBase64Request, CompareFaceByBase64Response>
     */
    public AsyncInvoker<CompareFaceByBase64Request, CompareFaceByBase64Response> compareFaceByBase64AsyncInvoker(
        CompareFaceByBase64Request request) {
        return new AsyncInvoker<>(request, FrsMeta.compareFaceByBase64, hcClient);
    }

    /**
     * 人脸比对
     *
     * 人脸比对是将两个人脸进行比对，来判断是否为同一个人，返回比对置信度。如果传入的图片中包含多个人脸，选取最大的人脸进行比对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CompareFaceByFileRequest 请求对象
     * @return CompletableFuture<CompareFaceByFileResponse>
     */
    public CompletableFuture<CompareFaceByFileResponse> compareFaceByFileAsync(CompareFaceByFileRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.compareFaceByFile);
    }

    /**
     * 人脸比对
     *
     * 人脸比对是将两个人脸进行比对，来判断是否为同一个人，返回比对置信度。如果传入的图片中包含多个人脸，选取最大的人脸进行比对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CompareFaceByFileRequest 请求对象
     * @return AsyncInvoker<CompareFaceByFileRequest, CompareFaceByFileResponse>
     */
    public AsyncInvoker<CompareFaceByFileRequest, CompareFaceByFileResponse> compareFaceByFileAsyncInvoker(
        CompareFaceByFileRequest request) {
        return new AsyncInvoker<>(request, FrsMeta.compareFaceByFile, hcClient);
    }

    /**
     * 人脸比对
     *
     * 人脸比对是将两个人脸进行比对，来判断是否为同一个人，返回比对置信度。如果传入的图片中包含多个人脸，选取最大的人脸进行比对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CompareFaceByUrlRequest 请求对象
     * @return CompletableFuture<CompareFaceByUrlResponse>
     */
    public CompletableFuture<CompareFaceByUrlResponse> compareFaceByUrlAsync(CompareFaceByUrlRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.compareFaceByUrl);
    }

    /**
     * 人脸比对
     *
     * 人脸比对是将两个人脸进行比对，来判断是否为同一个人，返回比对置信度。如果传入的图片中包含多个人脸，选取最大的人脸进行比对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CompareFaceByUrlRequest 请求对象
     * @return AsyncInvoker<CompareFaceByUrlRequest, CompareFaceByUrlResponse>
     */
    public AsyncInvoker<CompareFaceByUrlRequest, CompareFaceByUrlResponse> compareFaceByUrlAsyncInvoker(
        CompareFaceByUrlRequest request) {
        return new AsyncInvoker<>(request, FrsMeta.compareFaceByUrl, hcClient);
    }

    /**
     * 创建人脸库
     *
     * 创建用于存储人脸特征的人脸库。您最多可以创建10个人脸库，每个人脸库最大容量为10万个人脸特征。如有更大规格的需求请联系客服。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFaceSetRequest 请求对象
     * @return CompletableFuture<CreateFaceSetResponse>
     */
    public CompletableFuture<CreateFaceSetResponse> createFaceSetAsync(CreateFaceSetRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.createFaceSet);
    }

    /**
     * 创建人脸库
     *
     * 创建用于存储人脸特征的人脸库。您最多可以创建10个人脸库，每个人脸库最大容量为10万个人脸特征。如有更大规格的需求请联系客服。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFaceSetRequest 请求对象
     * @return AsyncInvoker<CreateFaceSetRequest, CreateFaceSetResponse>
     */
    public AsyncInvoker<CreateFaceSetRequest, CreateFaceSetResponse> createFaceSetAsyncInvoker(
        CreateFaceSetRequest request) {
        return new AsyncInvoker<>(request, FrsMeta.createFaceSet, hcClient);
    }

    /**
     * 删除人脸
     *
     * 根据external_image_id删除人脸。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFaceByExternalImageIdRequest 请求对象
     * @return CompletableFuture<DeleteFaceByExternalImageIdResponse>
     */
    public CompletableFuture<DeleteFaceByExternalImageIdResponse> deleteFaceByExternalImageIdAsync(
        DeleteFaceByExternalImageIdRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.deleteFaceByExternalImageId);
    }

    /**
     * 删除人脸
     *
     * 根据external_image_id删除人脸。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFaceByExternalImageIdRequest 请求对象
     * @return AsyncInvoker<DeleteFaceByExternalImageIdRequest, DeleteFaceByExternalImageIdResponse>
     */
    public AsyncInvoker<DeleteFaceByExternalImageIdRequest, DeleteFaceByExternalImageIdResponse> deleteFaceByExternalImageIdAsyncInvoker(
        DeleteFaceByExternalImageIdRequest request) {
        return new AsyncInvoker<>(request, FrsMeta.deleteFaceByExternalImageId, hcClient);
    }

    /**
     * 删除人脸
     *
     * 根据face_id删除人脸。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFaceByFaceIdRequest 请求对象
     * @return CompletableFuture<DeleteFaceByFaceIdResponse>
     */
    public CompletableFuture<DeleteFaceByFaceIdResponse> deleteFaceByFaceIdAsync(DeleteFaceByFaceIdRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.deleteFaceByFaceId);
    }

    /**
     * 删除人脸
     *
     * 根据face_id删除人脸。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFaceByFaceIdRequest 请求对象
     * @return AsyncInvoker<DeleteFaceByFaceIdRequest, DeleteFaceByFaceIdResponse>
     */
    public AsyncInvoker<DeleteFaceByFaceIdRequest, DeleteFaceByFaceIdResponse> deleteFaceByFaceIdAsyncInvoker(
        DeleteFaceByFaceIdRequest request) {
        return new AsyncInvoker<>(request, FrsMeta.deleteFaceByFaceId, hcClient);
    }

    /**
     * 删除人脸库
     *
     * 删除人脸库以及其中所有的人脸。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFaceSetRequest 请求对象
     * @return CompletableFuture<DeleteFaceSetResponse>
     */
    public CompletableFuture<DeleteFaceSetResponse> deleteFaceSetAsync(DeleteFaceSetRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.deleteFaceSet);
    }

    /**
     * 删除人脸库
     *
     * 删除人脸库以及其中所有的人脸。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFaceSetRequest 请求对象
     * @return AsyncInvoker<DeleteFaceSetRequest, DeleteFaceSetResponse>
     */
    public AsyncInvoker<DeleteFaceSetRequest, DeleteFaceSetResponse> deleteFaceSetAsyncInvoker(
        DeleteFaceSetRequest request) {
        return new AsyncInvoker<>(request, FrsMeta.deleteFaceSet, hcClient);
    }

    /**
     * 人脸检测
     *
     * 人脸检测是对输入图片进行人脸检测和分析，输出人脸在图像中的位置、人脸关键点位置和人脸关键属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectFaceByBase64Request 请求对象
     * @return CompletableFuture<DetectFaceByBase64Response>
     */
    public CompletableFuture<DetectFaceByBase64Response> detectFaceByBase64Async(DetectFaceByBase64Request request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.detectFaceByBase64);
    }

    /**
     * 人脸检测
     *
     * 人脸检测是对输入图片进行人脸检测和分析，输出人脸在图像中的位置、人脸关键点位置和人脸关键属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectFaceByBase64Request 请求对象
     * @return AsyncInvoker<DetectFaceByBase64Request, DetectFaceByBase64Response>
     */
    public AsyncInvoker<DetectFaceByBase64Request, DetectFaceByBase64Response> detectFaceByBase64AsyncInvoker(
        DetectFaceByBase64Request request) {
        return new AsyncInvoker<>(request, FrsMeta.detectFaceByBase64, hcClient);
    }

    /**
     * 人脸检测
     *
     * 人脸检测是对输入图片进行人脸检测和分析，输出人脸在图像中的位置、人脸关键点位置和人脸关键属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectFaceByBase64IntlRequest 请求对象
     * @return CompletableFuture<DetectFaceByBase64IntlResponse>
     */
    public CompletableFuture<DetectFaceByBase64IntlResponse> detectFaceByBase64IntlAsync(
        DetectFaceByBase64IntlRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.detectFaceByBase64Intl);
    }

    /**
     * 人脸检测
     *
     * 人脸检测是对输入图片进行人脸检测和分析，输出人脸在图像中的位置、人脸关键点位置和人脸关键属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectFaceByBase64IntlRequest 请求对象
     * @return AsyncInvoker<DetectFaceByBase64IntlRequest, DetectFaceByBase64IntlResponse>
     */
    public AsyncInvoker<DetectFaceByBase64IntlRequest, DetectFaceByBase64IntlResponse> detectFaceByBase64IntlAsyncInvoker(
        DetectFaceByBase64IntlRequest request) {
        return new AsyncInvoker<>(request, FrsMeta.detectFaceByBase64Intl, hcClient);
    }

    /**
     * 人脸检测
     *
     * 人脸检测是对输入图片进行人脸检测和分析，输出人脸在图像中的位置、人脸关键点位置和人脸关键属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectFaceByFileRequest 请求对象
     * @return CompletableFuture<DetectFaceByFileResponse>
     */
    public CompletableFuture<DetectFaceByFileResponse> detectFaceByFileAsync(DetectFaceByFileRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.detectFaceByFile);
    }

    /**
     * 人脸检测
     *
     * 人脸检测是对输入图片进行人脸检测和分析，输出人脸在图像中的位置、人脸关键点位置和人脸关键属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectFaceByFileRequest 请求对象
     * @return AsyncInvoker<DetectFaceByFileRequest, DetectFaceByFileResponse>
     */
    public AsyncInvoker<DetectFaceByFileRequest, DetectFaceByFileResponse> detectFaceByFileAsyncInvoker(
        DetectFaceByFileRequest request) {
        return new AsyncInvoker<>(request, FrsMeta.detectFaceByFile, hcClient);
    }

    /**
     * 人脸检测
     *
     * 人脸检测是对输入图片进行人脸检测和分析，输出人脸在图像中的位置、人脸关键点位置和人脸关键属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectFaceByFileIntlRequest 请求对象
     * @return CompletableFuture<DetectFaceByFileIntlResponse>
     */
    public CompletableFuture<DetectFaceByFileIntlResponse> detectFaceByFileIntlAsync(
        DetectFaceByFileIntlRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.detectFaceByFileIntl);
    }

    /**
     * 人脸检测
     *
     * 人脸检测是对输入图片进行人脸检测和分析，输出人脸在图像中的位置、人脸关键点位置和人脸关键属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectFaceByFileIntlRequest 请求对象
     * @return AsyncInvoker<DetectFaceByFileIntlRequest, DetectFaceByFileIntlResponse>
     */
    public AsyncInvoker<DetectFaceByFileIntlRequest, DetectFaceByFileIntlResponse> detectFaceByFileIntlAsyncInvoker(
        DetectFaceByFileIntlRequest request) {
        return new AsyncInvoker<>(request, FrsMeta.detectFaceByFileIntl, hcClient);
    }

    /**
     * 人脸检测
     *
     * 人脸检测是对输入图片进行人脸检测和分析，输出人脸在图像中的位置、人脸关键点位置和人脸关键属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectFaceByUrlRequest 请求对象
     * @return CompletableFuture<DetectFaceByUrlResponse>
     */
    public CompletableFuture<DetectFaceByUrlResponse> detectFaceByUrlAsync(DetectFaceByUrlRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.detectFaceByUrl);
    }

    /**
     * 人脸检测
     *
     * 人脸检测是对输入图片进行人脸检测和分析，输出人脸在图像中的位置、人脸关键点位置和人脸关键属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectFaceByUrlRequest 请求对象
     * @return AsyncInvoker<DetectFaceByUrlRequest, DetectFaceByUrlResponse>
     */
    public AsyncInvoker<DetectFaceByUrlRequest, DetectFaceByUrlResponse> detectFaceByUrlAsyncInvoker(
        DetectFaceByUrlRequest request) {
        return new AsyncInvoker<>(request, FrsMeta.detectFaceByUrl, hcClient);
    }

    /**
     * 人脸检测
     *
     * 人脸检测是对输入图片进行人脸检测和分析，输出人脸在图像中的位置、人脸关键点位置和人脸关键属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectFaceByUrlIntlRequest 请求对象
     * @return CompletableFuture<DetectFaceByUrlIntlResponse>
     */
    public CompletableFuture<DetectFaceByUrlIntlResponse> detectFaceByUrlIntlAsync(DetectFaceByUrlIntlRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.detectFaceByUrlIntl);
    }

    /**
     * 人脸检测
     *
     * 人脸检测是对输入图片进行人脸检测和分析，输出人脸在图像中的位置、人脸关键点位置和人脸关键属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectFaceByUrlIntlRequest 请求对象
     * @return AsyncInvoker<DetectFaceByUrlIntlRequest, DetectFaceByUrlIntlResponse>
     */
    public AsyncInvoker<DetectFaceByUrlIntlRequest, DetectFaceByUrlIntlResponse> detectFaceByUrlIntlAsyncInvoker(
        DetectFaceByUrlIntlRequest request) {
        return new AsyncInvoker<>(request, FrsMeta.detectFaceByUrlIntl, hcClient);
    }

    /**
     * 动作活体检测
     *
     * 动作活体检测是通过判断视频中的人物动作与传入动作列表是否一致来识别视频中人物是否为活体。如果有多张人脸出现，则选取最大的人脸进行判定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectLiveByBase64Request 请求对象
     * @return CompletableFuture<DetectLiveByBase64Response>
     */
    public CompletableFuture<DetectLiveByBase64Response> detectLiveByBase64Async(DetectLiveByBase64Request request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.detectLiveByBase64);
    }

    /**
     * 动作活体检测
     *
     * 动作活体检测是通过判断视频中的人物动作与传入动作列表是否一致来识别视频中人物是否为活体。如果有多张人脸出现，则选取最大的人脸进行判定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectLiveByBase64Request 请求对象
     * @return AsyncInvoker<DetectLiveByBase64Request, DetectLiveByBase64Response>
     */
    public AsyncInvoker<DetectLiveByBase64Request, DetectLiveByBase64Response> detectLiveByBase64AsyncInvoker(
        DetectLiveByBase64Request request) {
        return new AsyncInvoker<>(request, FrsMeta.detectLiveByBase64, hcClient);
    }

    /**
     * 动作活体检测
     *
     * 动作活体检测是通过判断视频中的人物动作与传入动作列表是否一致来识别视频中人物是否为活体。如果有多张人脸出现，则选取最大的人脸进行判定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectLiveByBase64IntlRequest 请求对象
     * @return CompletableFuture<DetectLiveByBase64IntlResponse>
     */
    public CompletableFuture<DetectLiveByBase64IntlResponse> detectLiveByBase64IntlAsync(
        DetectLiveByBase64IntlRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.detectLiveByBase64Intl);
    }

    /**
     * 动作活体检测
     *
     * 动作活体检测是通过判断视频中的人物动作与传入动作列表是否一致来识别视频中人物是否为活体。如果有多张人脸出现，则选取最大的人脸进行判定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectLiveByBase64IntlRequest 请求对象
     * @return AsyncInvoker<DetectLiveByBase64IntlRequest, DetectLiveByBase64IntlResponse>
     */
    public AsyncInvoker<DetectLiveByBase64IntlRequest, DetectLiveByBase64IntlResponse> detectLiveByBase64IntlAsyncInvoker(
        DetectLiveByBase64IntlRequest request) {
        return new AsyncInvoker<>(request, FrsMeta.detectLiveByBase64Intl, hcClient);
    }

    /**
     * 动作活体检测
     *
     * 动作活体检测是通过判断视频中的人物动作与传入动作列表是否一致来识别视频中人物是否为活体。如果有多张人脸出现，则选取最大的人脸进行判定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectLiveByFileRequest 请求对象
     * @return CompletableFuture<DetectLiveByFileResponse>
     */
    public CompletableFuture<DetectLiveByFileResponse> detectLiveByFileAsync(DetectLiveByFileRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.detectLiveByFile);
    }

    /**
     * 动作活体检测
     *
     * 动作活体检测是通过判断视频中的人物动作与传入动作列表是否一致来识别视频中人物是否为活体。如果有多张人脸出现，则选取最大的人脸进行判定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectLiveByFileRequest 请求对象
     * @return AsyncInvoker<DetectLiveByFileRequest, DetectLiveByFileResponse>
     */
    public AsyncInvoker<DetectLiveByFileRequest, DetectLiveByFileResponse> detectLiveByFileAsyncInvoker(
        DetectLiveByFileRequest request) {
        return new AsyncInvoker<>(request, FrsMeta.detectLiveByFile, hcClient);
    }

    /**
     * 动作活体检测
     *
     * 动作活体检测是通过判断视频中的人物动作与传入动作列表是否一致来识别视频中人物是否为活体。如果有多张人脸出现，则选取最大的人脸进行判定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectLiveByFileIntlRequest 请求对象
     * @return CompletableFuture<DetectLiveByFileIntlResponse>
     */
    public CompletableFuture<DetectLiveByFileIntlResponse> detectLiveByFileIntlAsync(
        DetectLiveByFileIntlRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.detectLiveByFileIntl);
    }

    /**
     * 动作活体检测
     *
     * 动作活体检测是通过判断视频中的人物动作与传入动作列表是否一致来识别视频中人物是否为活体。如果有多张人脸出现，则选取最大的人脸进行判定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectLiveByFileIntlRequest 请求对象
     * @return AsyncInvoker<DetectLiveByFileIntlRequest, DetectLiveByFileIntlResponse>
     */
    public AsyncInvoker<DetectLiveByFileIntlRequest, DetectLiveByFileIntlResponse> detectLiveByFileIntlAsyncInvoker(
        DetectLiveByFileIntlRequest request) {
        return new AsyncInvoker<>(request, FrsMeta.detectLiveByFileIntl, hcClient);
    }

    /**
     * 动作活体检测
     *
     * 动作活体检测是通过判断视频中的人物动作与传入动作列表是否一致来识别视频中人物是否为活体。如果有多张人脸出现，则选取最大的人脸进行判定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectLiveByUrlRequest 请求对象
     * @return CompletableFuture<DetectLiveByUrlResponse>
     */
    public CompletableFuture<DetectLiveByUrlResponse> detectLiveByUrlAsync(DetectLiveByUrlRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.detectLiveByUrl);
    }

    /**
     * 动作活体检测
     *
     * 动作活体检测是通过判断视频中的人物动作与传入动作列表是否一致来识别视频中人物是否为活体。如果有多张人脸出现，则选取最大的人脸进行判定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectLiveByUrlRequest 请求对象
     * @return AsyncInvoker<DetectLiveByUrlRequest, DetectLiveByUrlResponse>
     */
    public AsyncInvoker<DetectLiveByUrlRequest, DetectLiveByUrlResponse> detectLiveByUrlAsyncInvoker(
        DetectLiveByUrlRequest request) {
        return new AsyncInvoker<>(request, FrsMeta.detectLiveByUrl, hcClient);
    }

    /**
     * 动作活体检测
     *
     * 动作活体检测是通过判断视频中的人物动作与传入动作列表是否一致来识别视频中人物是否为活体。如果有多张人脸出现，则选取最大的人脸进行判定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectLiveByUrlIntlRequest 请求对象
     * @return CompletableFuture<DetectLiveByUrlIntlResponse>
     */
    public CompletableFuture<DetectLiveByUrlIntlResponse> detectLiveByUrlIntlAsync(DetectLiveByUrlIntlRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.detectLiveByUrlIntl);
    }

    /**
     * 动作活体检测
     *
     * 动作活体检测是通过判断视频中的人物动作与传入动作列表是否一致来识别视频中人物是否为活体。如果有多张人脸出现，则选取最大的人脸进行判定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectLiveByUrlIntlRequest 请求对象
     * @return AsyncInvoker<DetectLiveByUrlIntlRequest, DetectLiveByUrlIntlResponse>
     */
    public AsyncInvoker<DetectLiveByUrlIntlRequest, DetectLiveByUrlIntlResponse> detectLiveByUrlIntlAsyncInvoker(
        DetectLiveByUrlIntlRequest request) {
        return new AsyncInvoker<>(request, FrsMeta.detectLiveByUrlIntl, hcClient);
    }

    /**
     * 静默活体检测
     *
     * 静默活体检测是基于人脸图片中可能存在的畸变、摩尔纹、反光、倒影、边框等信息，判断图片中的人脸是否来自于真人活体，有效抵御纸质翻拍照、电子翻拍照以及视频翻拍等各种攻击方式。静默活体检测支持单张图片，不支持多人脸图片。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectLiveFaceByBase64Request 请求对象
     * @return CompletableFuture<DetectLiveFaceByBase64Response>
     */
    public CompletableFuture<DetectLiveFaceByBase64Response> detectLiveFaceByBase64Async(
        DetectLiveFaceByBase64Request request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.detectLiveFaceByBase64);
    }

    /**
     * 静默活体检测
     *
     * 静默活体检测是基于人脸图片中可能存在的畸变、摩尔纹、反光、倒影、边框等信息，判断图片中的人脸是否来自于真人活体，有效抵御纸质翻拍照、电子翻拍照以及视频翻拍等各种攻击方式。静默活体检测支持单张图片，不支持多人脸图片。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectLiveFaceByBase64Request 请求对象
     * @return AsyncInvoker<DetectLiveFaceByBase64Request, DetectLiveFaceByBase64Response>
     */
    public AsyncInvoker<DetectLiveFaceByBase64Request, DetectLiveFaceByBase64Response> detectLiveFaceByBase64AsyncInvoker(
        DetectLiveFaceByBase64Request request) {
        return new AsyncInvoker<>(request, FrsMeta.detectLiveFaceByBase64, hcClient);
    }

    /**
     * 静默活体检测
     *
     * 静默活体检测是基于人脸图片中可能存在的畸变、摩尔纹、反光、倒影、边框等信息，判断图片中的人脸是否来自于真人活体，有效抵御纸质翻拍照、电子翻拍照以及视频翻拍等各种攻击方式。静默活体检测支持单张图片，不支持多人脸图片。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectLiveFaceByFileRequest 请求对象
     * @return CompletableFuture<DetectLiveFaceByFileResponse>
     */
    public CompletableFuture<DetectLiveFaceByFileResponse> detectLiveFaceByFileAsync(
        DetectLiveFaceByFileRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.detectLiveFaceByFile);
    }

    /**
     * 静默活体检测
     *
     * 静默活体检测是基于人脸图片中可能存在的畸变、摩尔纹、反光、倒影、边框等信息，判断图片中的人脸是否来自于真人活体，有效抵御纸质翻拍照、电子翻拍照以及视频翻拍等各种攻击方式。静默活体检测支持单张图片，不支持多人脸图片。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectLiveFaceByFileRequest 请求对象
     * @return AsyncInvoker<DetectLiveFaceByFileRequest, DetectLiveFaceByFileResponse>
     */
    public AsyncInvoker<DetectLiveFaceByFileRequest, DetectLiveFaceByFileResponse> detectLiveFaceByFileAsyncInvoker(
        DetectLiveFaceByFileRequest request) {
        return new AsyncInvoker<>(request, FrsMeta.detectLiveFaceByFile, hcClient);
    }

    /**
     * 静默活体检测
     *
     * 静默活体检测是基于人脸图片中可能存在的畸变、摩尔纹、反光、倒影、边框等信息，判断图片中的人脸是否来自于真人活体，有效抵御纸质翻拍照、电子翻拍照以及视频翻拍等各种攻击方式。静默活体检测支持单张图片，不支持多人脸图片。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectLiveFaceByUrlRequest 请求对象
     * @return CompletableFuture<DetectLiveFaceByUrlResponse>
     */
    public CompletableFuture<DetectLiveFaceByUrlResponse> detectLiveFaceByUrlAsync(DetectLiveFaceByUrlRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.detectLiveFaceByUrl);
    }

    /**
     * 静默活体检测
     *
     * 静默活体检测是基于人脸图片中可能存在的畸变、摩尔纹、反光、倒影、边框等信息，判断图片中的人脸是否来自于真人活体，有效抵御纸质翻拍照、电子翻拍照以及视频翻拍等各种攻击方式。静默活体检测支持单张图片，不支持多人脸图片。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectLiveFaceByUrlRequest 请求对象
     * @return AsyncInvoker<DetectLiveFaceByUrlRequest, DetectLiveFaceByUrlResponse>
     */
    public AsyncInvoker<DetectLiveFaceByUrlRequest, DetectLiveFaceByUrlResponse> detectLiveFaceByUrlAsyncInvoker(
        DetectLiveFaceByUrlRequest request) {
        return new AsyncInvoker<>(request, FrsMeta.detectLiveFaceByUrl, hcClient);
    }

    /**
     * 人脸搜索
     *
     * 人脸搜索是指在已有的人脸库中，查询与目标人脸相似的一张或者多张人脸，并返回相应的置信度。
     * 支持传入图片或者faceID进行人脸搜索，如果传入的是多张人脸图片，选取图片中检测到的最大尺寸人脸作为检索的输入。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchFaceByBase64Request 请求对象
     * @return CompletableFuture<SearchFaceByBase64Response>
     */
    public CompletableFuture<SearchFaceByBase64Response> searchFaceByBase64Async(SearchFaceByBase64Request request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.searchFaceByBase64);
    }

    /**
     * 人脸搜索
     *
     * 人脸搜索是指在已有的人脸库中，查询与目标人脸相似的一张或者多张人脸，并返回相应的置信度。
     * 支持传入图片或者faceID进行人脸搜索，如果传入的是多张人脸图片，选取图片中检测到的最大尺寸人脸作为检索的输入。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchFaceByBase64Request 请求对象
     * @return AsyncInvoker<SearchFaceByBase64Request, SearchFaceByBase64Response>
     */
    public AsyncInvoker<SearchFaceByBase64Request, SearchFaceByBase64Response> searchFaceByBase64AsyncInvoker(
        SearchFaceByBase64Request request) {
        return new AsyncInvoker<>(request, FrsMeta.searchFaceByBase64, hcClient);
    }

    /**
     * 人脸搜索
     *
     * 人脸搜索是指在已有的人脸库中，查询与目标人脸相似的一张或者多张人脸，并返回相应的置信度。
     * 支持传入图片或者faceID进行人脸搜索，如果传入的是多张人脸图片，选取图片中检测到的最大尺寸人脸作为检索的输入。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchFaceByFaceIdRequest 请求对象
     * @return CompletableFuture<SearchFaceByFaceIdResponse>
     */
    public CompletableFuture<SearchFaceByFaceIdResponse> searchFaceByFaceIdAsync(SearchFaceByFaceIdRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.searchFaceByFaceId);
    }

    /**
     * 人脸搜索
     *
     * 人脸搜索是指在已有的人脸库中，查询与目标人脸相似的一张或者多张人脸，并返回相应的置信度。
     * 支持传入图片或者faceID进行人脸搜索，如果传入的是多张人脸图片，选取图片中检测到的最大尺寸人脸作为检索的输入。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchFaceByFaceIdRequest 请求对象
     * @return AsyncInvoker<SearchFaceByFaceIdRequest, SearchFaceByFaceIdResponse>
     */
    public AsyncInvoker<SearchFaceByFaceIdRequest, SearchFaceByFaceIdResponse> searchFaceByFaceIdAsyncInvoker(
        SearchFaceByFaceIdRequest request) {
        return new AsyncInvoker<>(request, FrsMeta.searchFaceByFaceId, hcClient);
    }

    /**
     * 人脸搜索
     *
     * 人脸搜索是指在已有的人脸库中，查询与目标人脸相似的一张或者多张人脸，并返回相应的置信度。
     * 支持传入图片或者faceID进行人脸搜索，如果传入的是多张人脸图片，选取图片中检测到的最大尺寸人脸作为检索的输入。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchFaceByFileRequest 请求对象
     * @return CompletableFuture<SearchFaceByFileResponse>
     */
    public CompletableFuture<SearchFaceByFileResponse> searchFaceByFileAsync(SearchFaceByFileRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.searchFaceByFile);
    }

    /**
     * 人脸搜索
     *
     * 人脸搜索是指在已有的人脸库中，查询与目标人脸相似的一张或者多张人脸，并返回相应的置信度。
     * 支持传入图片或者faceID进行人脸搜索，如果传入的是多张人脸图片，选取图片中检测到的最大尺寸人脸作为检索的输入。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchFaceByFileRequest 请求对象
     * @return AsyncInvoker<SearchFaceByFileRequest, SearchFaceByFileResponse>
     */
    public AsyncInvoker<SearchFaceByFileRequest, SearchFaceByFileResponse> searchFaceByFileAsyncInvoker(
        SearchFaceByFileRequest request) {
        return new AsyncInvoker<>(request, FrsMeta.searchFaceByFile, hcClient);
    }

    /**
     * 人脸搜索
     *
     * 人脸搜索是指在已有的人脸库中，查询与目标人脸相似的一张或者多张人脸，并返回相应的置信度。
     * 支持传入图片或者faceID进行人脸搜索，如果传入的是多张人脸图片，选取图片中检测到的最大尺寸人脸作为检索的输入。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchFaceByUrlRequest 请求对象
     * @return CompletableFuture<SearchFaceByUrlResponse>
     */
    public CompletableFuture<SearchFaceByUrlResponse> searchFaceByUrlAsync(SearchFaceByUrlRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.searchFaceByUrl);
    }

    /**
     * 人脸搜索
     *
     * 人脸搜索是指在已有的人脸库中，查询与目标人脸相似的一张或者多张人脸，并返回相应的置信度。
     * 支持传入图片或者faceID进行人脸搜索，如果传入的是多张人脸图片，选取图片中检测到的最大尺寸人脸作为检索的输入。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchFaceByUrlRequest 请求对象
     * @return AsyncInvoker<SearchFaceByUrlRequest, SearchFaceByUrlResponse>
     */
    public AsyncInvoker<SearchFaceByUrlRequest, SearchFaceByUrlResponse> searchFaceByUrlAsyncInvoker(
        SearchFaceByUrlRequest request) {
        return new AsyncInvoker<>(request, FrsMeta.searchFaceByUrl, hcClient);
    }

    /**
     * 查询所有人脸库
     *
     * 查询当前用户所有人脸库的状态信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAllFaceSetsRequest 请求对象
     * @return CompletableFuture<ShowAllFaceSetsResponse>
     */
    public CompletableFuture<ShowAllFaceSetsResponse> showAllFaceSetsAsync(ShowAllFaceSetsRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.showAllFaceSets);
    }

    /**
     * 查询所有人脸库
     *
     * 查询当前用户所有人脸库的状态信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAllFaceSetsRequest 请求对象
     * @return AsyncInvoker<ShowAllFaceSetsRequest, ShowAllFaceSetsResponse>
     */
    public AsyncInvoker<ShowAllFaceSetsRequest, ShowAllFaceSetsResponse> showAllFaceSetsAsyncInvoker(
        ShowAllFaceSetsRequest request) {
        return new AsyncInvoker<>(request, FrsMeta.showAllFaceSets, hcClient);
    }

    /**
     * 查询人脸库
     *
     * 查询人脸库当前的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFaceSetRequest 请求对象
     * @return CompletableFuture<ShowFaceSetResponse>
     */
    public CompletableFuture<ShowFaceSetResponse> showFaceSetAsync(ShowFaceSetRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.showFaceSet);
    }

    /**
     * 查询人脸库
     *
     * 查询人脸库当前的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFaceSetRequest 请求对象
     * @return AsyncInvoker<ShowFaceSetRequest, ShowFaceSetResponse>
     */
    public AsyncInvoker<ShowFaceSetRequest, ShowFaceSetResponse> showFaceSetAsyncInvoker(ShowFaceSetRequest request) {
        return new AsyncInvoker<>(request, FrsMeta.showFaceSet, hcClient);
    }

    /**
     * 查询人脸
     *
     * 查询指定人脸库中人脸信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFacesByFaceIdRequest 请求对象
     * @return CompletableFuture<ShowFacesByFaceIdResponse>
     */
    public CompletableFuture<ShowFacesByFaceIdResponse> showFacesByFaceIdAsync(ShowFacesByFaceIdRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.showFacesByFaceId);
    }

    /**
     * 查询人脸
     *
     * 查询指定人脸库中人脸信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFacesByFaceIdRequest 请求对象
     * @return AsyncInvoker<ShowFacesByFaceIdRequest, ShowFacesByFaceIdResponse>
     */
    public AsyncInvoker<ShowFacesByFaceIdRequest, ShowFacesByFaceIdResponse> showFacesByFaceIdAsyncInvoker(
        ShowFacesByFaceIdRequest request) {
        return new AsyncInvoker<>(request, FrsMeta.showFacesByFaceId, hcClient);
    }

    /**
     * 查询人脸
     *
     * 查询指定人脸库中人脸信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFacesByLimitRequest 请求对象
     * @return CompletableFuture<ShowFacesByLimitResponse>
     */
    public CompletableFuture<ShowFacesByLimitResponse> showFacesByLimitAsync(ShowFacesByLimitRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.showFacesByLimit);
    }

    /**
     * 查询人脸
     *
     * 查询指定人脸库中人脸信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFacesByLimitRequest 请求对象
     * @return AsyncInvoker<ShowFacesByLimitRequest, ShowFacesByLimitResponse>
     */
    public AsyncInvoker<ShowFacesByLimitRequest, ShowFacesByLimitResponse> showFacesByLimitAsyncInvoker(
        ShowFacesByLimitRequest request) {
        return new AsyncInvoker<>(request, FrsMeta.showFacesByLimit, hcClient);
    }

    /**
     * 更新人脸
     *
     * 根据人脸ID（face_id）更新单张人脸信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFaceRequest 请求对象
     * @return CompletableFuture<UpdateFaceResponse>
     */
    public CompletableFuture<UpdateFaceResponse> updateFaceAsync(UpdateFaceRequest request) {
        return hcClient.asyncInvokeHttp(request, FrsMeta.updateFace);
    }

    /**
     * 更新人脸
     *
     * 根据人脸ID（face_id）更新单张人脸信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFaceRequest 请求对象
     * @return AsyncInvoker<UpdateFaceRequest, UpdateFaceResponse>
     */
    public AsyncInvoker<UpdateFaceRequest, UpdateFaceResponse> updateFaceAsyncInvoker(UpdateFaceRequest request) {
        return new AsyncInvoker<>(request, FrsMeta.updateFace, hcClient);
    }

}

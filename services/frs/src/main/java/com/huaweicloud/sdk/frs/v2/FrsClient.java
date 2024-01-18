package com.huaweicloud.sdk.frs.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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

public class FrsClient {

    protected HcClient hcClient;

    public FrsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<FrsClient> newBuilder() {
        ClientBuilder<FrsClient> clientBuilder = new ClientBuilder<>(FrsClient::new);
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
     * @return AddFacesByBase64Response
     */
    public AddFacesByBase64Response addFacesByBase64(AddFacesByBase64Request request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.addFacesByBase64);
    }

    /**
     * 添加人脸
     *
     * 添加人脸到人脸库中。将单张图片中的人脸添加至人脸库中，支持添加最大人脸或所有人脸。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddFacesByBase64Request 请求对象
     * @return SyncInvoker<AddFacesByBase64Request, AddFacesByBase64Response>
     */
    public SyncInvoker<AddFacesByBase64Request, AddFacesByBase64Response> addFacesByBase64Invoker(
        AddFacesByBase64Request request) {
        return new SyncInvoker<>(request, FrsMeta.addFacesByBase64, hcClient);
    }

    /**
     * 添加人脸
     *
     * 添加人脸到人脸库中。将单张图片中的人脸添加至人脸库中，支持添加最大人脸或所有人脸。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddFacesByFileRequest 请求对象
     * @return AddFacesByFileResponse
     */
    public AddFacesByFileResponse addFacesByFile(AddFacesByFileRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.addFacesByFile);
    }

    /**
     * 添加人脸
     *
     * 添加人脸到人脸库中。将单张图片中的人脸添加至人脸库中，支持添加最大人脸或所有人脸。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddFacesByFileRequest 请求对象
     * @return SyncInvoker<AddFacesByFileRequest, AddFacesByFileResponse>
     */
    public SyncInvoker<AddFacesByFileRequest, AddFacesByFileResponse> addFacesByFileInvoker(
        AddFacesByFileRequest request) {
        return new SyncInvoker<>(request, FrsMeta.addFacesByFile, hcClient);
    }

    /**
     * 添加人脸
     *
     * 添加人脸到人脸库中。将单张图片中的人脸添加至人脸库中，支持添加最大人脸或所有人脸。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddFacesByUrlRequest 请求对象
     * @return AddFacesByUrlResponse
     */
    public AddFacesByUrlResponse addFacesByUrl(AddFacesByUrlRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.addFacesByUrl);
    }

    /**
     * 添加人脸
     *
     * 添加人脸到人脸库中。将单张图片中的人脸添加至人脸库中，支持添加最大人脸或所有人脸。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddFacesByUrlRequest 请求对象
     * @return SyncInvoker<AddFacesByUrlRequest, AddFacesByUrlResponse>
     */
    public SyncInvoker<AddFacesByUrlRequest, AddFacesByUrlResponse> addFacesByUrlInvoker(AddFacesByUrlRequest request) {
        return new SyncInvoker<>(request, FrsMeta.addFacesByUrl, hcClient);
    }

    /**
     * 批量删除人脸
     *
     * 自定义筛选条件，批量删除人脸库中的符合指定条件的多张人脸。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteFacesRequest 请求对象
     * @return BatchDeleteFacesResponse
     */
    public BatchDeleteFacesResponse batchDeleteFaces(BatchDeleteFacesRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.batchDeleteFaces);
    }

    /**
     * 批量删除人脸
     *
     * 自定义筛选条件，批量删除人脸库中的符合指定条件的多张人脸。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteFacesRequest 请求对象
     * @return SyncInvoker<BatchDeleteFacesRequest, BatchDeleteFacesResponse>
     */
    public SyncInvoker<BatchDeleteFacesRequest, BatchDeleteFacesResponse> batchDeleteFacesInvoker(
        BatchDeleteFacesRequest request) {
        return new SyncInvoker<>(request, FrsMeta.batchDeleteFaces, hcClient);
    }

    /**
     * 人脸比对
     *
     * 人脸比对是将两个人脸进行比对，来判断是否为同一个人，返回比对置信度。如果传入的图片中包含多个人脸，选取最大的人脸进行比对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CompareFaceByBase64Request 请求对象
     * @return CompareFaceByBase64Response
     */
    public CompareFaceByBase64Response compareFaceByBase64(CompareFaceByBase64Request request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.compareFaceByBase64);
    }

    /**
     * 人脸比对
     *
     * 人脸比对是将两个人脸进行比对，来判断是否为同一个人，返回比对置信度。如果传入的图片中包含多个人脸，选取最大的人脸进行比对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CompareFaceByBase64Request 请求对象
     * @return SyncInvoker<CompareFaceByBase64Request, CompareFaceByBase64Response>
     */
    public SyncInvoker<CompareFaceByBase64Request, CompareFaceByBase64Response> compareFaceByBase64Invoker(
        CompareFaceByBase64Request request) {
        return new SyncInvoker<>(request, FrsMeta.compareFaceByBase64, hcClient);
    }

    /**
     * 人脸比对
     *
     * 人脸比对是将两个人脸进行比对，来判断是否为同一个人，返回比对置信度。如果传入的图片中包含多个人脸，选取最大的人脸进行比对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CompareFaceByFileRequest 请求对象
     * @return CompareFaceByFileResponse
     */
    public CompareFaceByFileResponse compareFaceByFile(CompareFaceByFileRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.compareFaceByFile);
    }

    /**
     * 人脸比对
     *
     * 人脸比对是将两个人脸进行比对，来判断是否为同一个人，返回比对置信度。如果传入的图片中包含多个人脸，选取最大的人脸进行比对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CompareFaceByFileRequest 请求对象
     * @return SyncInvoker<CompareFaceByFileRequest, CompareFaceByFileResponse>
     */
    public SyncInvoker<CompareFaceByFileRequest, CompareFaceByFileResponse> compareFaceByFileInvoker(
        CompareFaceByFileRequest request) {
        return new SyncInvoker<>(request, FrsMeta.compareFaceByFile, hcClient);
    }

    /**
     * 人脸比对
     *
     * 人脸比对是将两个人脸进行比对，来判断是否为同一个人，返回比对置信度。如果传入的图片中包含多个人脸，选取最大的人脸进行比对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CompareFaceByUrlRequest 请求对象
     * @return CompareFaceByUrlResponse
     */
    public CompareFaceByUrlResponse compareFaceByUrl(CompareFaceByUrlRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.compareFaceByUrl);
    }

    /**
     * 人脸比对
     *
     * 人脸比对是将两个人脸进行比对，来判断是否为同一个人，返回比对置信度。如果传入的图片中包含多个人脸，选取最大的人脸进行比对。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CompareFaceByUrlRequest 请求对象
     * @return SyncInvoker<CompareFaceByUrlRequest, CompareFaceByUrlResponse>
     */
    public SyncInvoker<CompareFaceByUrlRequest, CompareFaceByUrlResponse> compareFaceByUrlInvoker(
        CompareFaceByUrlRequest request) {
        return new SyncInvoker<>(request, FrsMeta.compareFaceByUrl, hcClient);
    }

    /**
     * 创建人脸库
     *
     * 创建用于存储人脸特征的人脸库。您最多可以创建10个人脸库，每个人脸库最大容量为10万个人脸特征。如有更大规格的需求请联系客服。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFaceSetRequest 请求对象
     * @return CreateFaceSetResponse
     */
    public CreateFaceSetResponse createFaceSet(CreateFaceSetRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.createFaceSet);
    }

    /**
     * 创建人脸库
     *
     * 创建用于存储人脸特征的人脸库。您最多可以创建10个人脸库，每个人脸库最大容量为10万个人脸特征。如有更大规格的需求请联系客服。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFaceSetRequest 请求对象
     * @return SyncInvoker<CreateFaceSetRequest, CreateFaceSetResponse>
     */
    public SyncInvoker<CreateFaceSetRequest, CreateFaceSetResponse> createFaceSetInvoker(CreateFaceSetRequest request) {
        return new SyncInvoker<>(request, FrsMeta.createFaceSet, hcClient);
    }

    /**
     * 删除人脸
     *
     * 根据external_image_id删除人脸。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFaceByExternalImageIdRequest 请求对象
     * @return DeleteFaceByExternalImageIdResponse
     */
    public DeleteFaceByExternalImageIdResponse deleteFaceByExternalImageId(DeleteFaceByExternalImageIdRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.deleteFaceByExternalImageId);
    }

    /**
     * 删除人脸
     *
     * 根据external_image_id删除人脸。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFaceByExternalImageIdRequest 请求对象
     * @return SyncInvoker<DeleteFaceByExternalImageIdRequest, DeleteFaceByExternalImageIdResponse>
     */
    public SyncInvoker<DeleteFaceByExternalImageIdRequest, DeleteFaceByExternalImageIdResponse> deleteFaceByExternalImageIdInvoker(
        DeleteFaceByExternalImageIdRequest request) {
        return new SyncInvoker<>(request, FrsMeta.deleteFaceByExternalImageId, hcClient);
    }

    /**
     * 删除人脸
     *
     * 根据face_id删除人脸。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFaceByFaceIdRequest 请求对象
     * @return DeleteFaceByFaceIdResponse
     */
    public DeleteFaceByFaceIdResponse deleteFaceByFaceId(DeleteFaceByFaceIdRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.deleteFaceByFaceId);
    }

    /**
     * 删除人脸
     *
     * 根据face_id删除人脸。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFaceByFaceIdRequest 请求对象
     * @return SyncInvoker<DeleteFaceByFaceIdRequest, DeleteFaceByFaceIdResponse>
     */
    public SyncInvoker<DeleteFaceByFaceIdRequest, DeleteFaceByFaceIdResponse> deleteFaceByFaceIdInvoker(
        DeleteFaceByFaceIdRequest request) {
        return new SyncInvoker<>(request, FrsMeta.deleteFaceByFaceId, hcClient);
    }

    /**
     * 删除人脸库
     *
     * 删除人脸库以及其中所有的人脸。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFaceSetRequest 请求对象
     * @return DeleteFaceSetResponse
     */
    public DeleteFaceSetResponse deleteFaceSet(DeleteFaceSetRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.deleteFaceSet);
    }

    /**
     * 删除人脸库
     *
     * 删除人脸库以及其中所有的人脸。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFaceSetRequest 请求对象
     * @return SyncInvoker<DeleteFaceSetRequest, DeleteFaceSetResponse>
     */
    public SyncInvoker<DeleteFaceSetRequest, DeleteFaceSetResponse> deleteFaceSetInvoker(DeleteFaceSetRequest request) {
        return new SyncInvoker<>(request, FrsMeta.deleteFaceSet, hcClient);
    }

    /**
     * 人脸检测
     *
     * 人脸检测是对输入图片进行人脸检测和分析，输出人脸在图像中的位置、人脸关键点位置和人脸关键属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectFaceByBase64Request 请求对象
     * @return DetectFaceByBase64Response
     */
    public DetectFaceByBase64Response detectFaceByBase64(DetectFaceByBase64Request request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.detectFaceByBase64);
    }

    /**
     * 人脸检测
     *
     * 人脸检测是对输入图片进行人脸检测和分析，输出人脸在图像中的位置、人脸关键点位置和人脸关键属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectFaceByBase64Request 请求对象
     * @return SyncInvoker<DetectFaceByBase64Request, DetectFaceByBase64Response>
     */
    public SyncInvoker<DetectFaceByBase64Request, DetectFaceByBase64Response> detectFaceByBase64Invoker(
        DetectFaceByBase64Request request) {
        return new SyncInvoker<>(request, FrsMeta.detectFaceByBase64, hcClient);
    }

    /**
     * 人脸检测
     *
     * 人脸检测是对输入图片进行人脸检测和分析，输出人脸在图像中的位置、人脸关键点位置和人脸关键属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectFaceByBase64IntlRequest 请求对象
     * @return DetectFaceByBase64IntlResponse
     */
    public DetectFaceByBase64IntlResponse detectFaceByBase64Intl(DetectFaceByBase64IntlRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.detectFaceByBase64Intl);
    }

    /**
     * 人脸检测
     *
     * 人脸检测是对输入图片进行人脸检测和分析，输出人脸在图像中的位置、人脸关键点位置和人脸关键属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectFaceByBase64IntlRequest 请求对象
     * @return SyncInvoker<DetectFaceByBase64IntlRequest, DetectFaceByBase64IntlResponse>
     */
    public SyncInvoker<DetectFaceByBase64IntlRequest, DetectFaceByBase64IntlResponse> detectFaceByBase64IntlInvoker(
        DetectFaceByBase64IntlRequest request) {
        return new SyncInvoker<>(request, FrsMeta.detectFaceByBase64Intl, hcClient);
    }

    /**
     * 人脸检测
     *
     * 人脸检测是对输入图片进行人脸检测和分析，输出人脸在图像中的位置、人脸关键点位置和人脸关键属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectFaceByFileRequest 请求对象
     * @return DetectFaceByFileResponse
     */
    public DetectFaceByFileResponse detectFaceByFile(DetectFaceByFileRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.detectFaceByFile);
    }

    /**
     * 人脸检测
     *
     * 人脸检测是对输入图片进行人脸检测和分析，输出人脸在图像中的位置、人脸关键点位置和人脸关键属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectFaceByFileRequest 请求对象
     * @return SyncInvoker<DetectFaceByFileRequest, DetectFaceByFileResponse>
     */
    public SyncInvoker<DetectFaceByFileRequest, DetectFaceByFileResponse> detectFaceByFileInvoker(
        DetectFaceByFileRequest request) {
        return new SyncInvoker<>(request, FrsMeta.detectFaceByFile, hcClient);
    }

    /**
     * 人脸检测
     *
     * 人脸检测是对输入图片进行人脸检测和分析，输出人脸在图像中的位置、人脸关键点位置和人脸关键属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectFaceByFileIntlRequest 请求对象
     * @return DetectFaceByFileIntlResponse
     */
    public DetectFaceByFileIntlResponse detectFaceByFileIntl(DetectFaceByFileIntlRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.detectFaceByFileIntl);
    }

    /**
     * 人脸检测
     *
     * 人脸检测是对输入图片进行人脸检测和分析，输出人脸在图像中的位置、人脸关键点位置和人脸关键属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectFaceByFileIntlRequest 请求对象
     * @return SyncInvoker<DetectFaceByFileIntlRequest, DetectFaceByFileIntlResponse>
     */
    public SyncInvoker<DetectFaceByFileIntlRequest, DetectFaceByFileIntlResponse> detectFaceByFileIntlInvoker(
        DetectFaceByFileIntlRequest request) {
        return new SyncInvoker<>(request, FrsMeta.detectFaceByFileIntl, hcClient);
    }

    /**
     * 人脸检测
     *
     * 人脸检测是对输入图片进行人脸检测和分析，输出人脸在图像中的位置、人脸关键点位置和人脸关键属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectFaceByUrlRequest 请求对象
     * @return DetectFaceByUrlResponse
     */
    public DetectFaceByUrlResponse detectFaceByUrl(DetectFaceByUrlRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.detectFaceByUrl);
    }

    /**
     * 人脸检测
     *
     * 人脸检测是对输入图片进行人脸检测和分析，输出人脸在图像中的位置、人脸关键点位置和人脸关键属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectFaceByUrlRequest 请求对象
     * @return SyncInvoker<DetectFaceByUrlRequest, DetectFaceByUrlResponse>
     */
    public SyncInvoker<DetectFaceByUrlRequest, DetectFaceByUrlResponse> detectFaceByUrlInvoker(
        DetectFaceByUrlRequest request) {
        return new SyncInvoker<>(request, FrsMeta.detectFaceByUrl, hcClient);
    }

    /**
     * 人脸检测
     *
     * 人脸检测是对输入图片进行人脸检测和分析，输出人脸在图像中的位置、人脸关键点位置和人脸关键属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectFaceByUrlIntlRequest 请求对象
     * @return DetectFaceByUrlIntlResponse
     */
    public DetectFaceByUrlIntlResponse detectFaceByUrlIntl(DetectFaceByUrlIntlRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.detectFaceByUrlIntl);
    }

    /**
     * 人脸检测
     *
     * 人脸检测是对输入图片进行人脸检测和分析，输出人脸在图像中的位置、人脸关键点位置和人脸关键属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectFaceByUrlIntlRequest 请求对象
     * @return SyncInvoker<DetectFaceByUrlIntlRequest, DetectFaceByUrlIntlResponse>
     */
    public SyncInvoker<DetectFaceByUrlIntlRequest, DetectFaceByUrlIntlResponse> detectFaceByUrlIntlInvoker(
        DetectFaceByUrlIntlRequest request) {
        return new SyncInvoker<>(request, FrsMeta.detectFaceByUrlIntl, hcClient);
    }

    /**
     * 动作活体检测
     *
     * 动作活体检测是通过判断视频中的人物动作与传入动作列表是否一致来识别视频中人物是否为活体。如果有多张人脸出现，则选取最大的人脸进行判定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectLiveByBase64Request 请求对象
     * @return DetectLiveByBase64Response
     */
    public DetectLiveByBase64Response detectLiveByBase64(DetectLiveByBase64Request request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.detectLiveByBase64);
    }

    /**
     * 动作活体检测
     *
     * 动作活体检测是通过判断视频中的人物动作与传入动作列表是否一致来识别视频中人物是否为活体。如果有多张人脸出现，则选取最大的人脸进行判定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectLiveByBase64Request 请求对象
     * @return SyncInvoker<DetectLiveByBase64Request, DetectLiveByBase64Response>
     */
    public SyncInvoker<DetectLiveByBase64Request, DetectLiveByBase64Response> detectLiveByBase64Invoker(
        DetectLiveByBase64Request request) {
        return new SyncInvoker<>(request, FrsMeta.detectLiveByBase64, hcClient);
    }

    /**
     * 动作活体检测
     *
     * 动作活体检测是通过判断视频中的人物动作与传入动作列表是否一致来识别视频中人物是否为活体。如果有多张人脸出现，则选取最大的人脸进行判定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectLiveByBase64IntlRequest 请求对象
     * @return DetectLiveByBase64IntlResponse
     */
    public DetectLiveByBase64IntlResponse detectLiveByBase64Intl(DetectLiveByBase64IntlRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.detectLiveByBase64Intl);
    }

    /**
     * 动作活体检测
     *
     * 动作活体检测是通过判断视频中的人物动作与传入动作列表是否一致来识别视频中人物是否为活体。如果有多张人脸出现，则选取最大的人脸进行判定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectLiveByBase64IntlRequest 请求对象
     * @return SyncInvoker<DetectLiveByBase64IntlRequest, DetectLiveByBase64IntlResponse>
     */
    public SyncInvoker<DetectLiveByBase64IntlRequest, DetectLiveByBase64IntlResponse> detectLiveByBase64IntlInvoker(
        DetectLiveByBase64IntlRequest request) {
        return new SyncInvoker<>(request, FrsMeta.detectLiveByBase64Intl, hcClient);
    }

    /**
     * 动作活体检测
     *
     * 动作活体检测是通过判断视频中的人物动作与传入动作列表是否一致来识别视频中人物是否为活体。如果有多张人脸出现，则选取最大的人脸进行判定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectLiveByFileRequest 请求对象
     * @return DetectLiveByFileResponse
     */
    public DetectLiveByFileResponse detectLiveByFile(DetectLiveByFileRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.detectLiveByFile);
    }

    /**
     * 动作活体检测
     *
     * 动作活体检测是通过判断视频中的人物动作与传入动作列表是否一致来识别视频中人物是否为活体。如果有多张人脸出现，则选取最大的人脸进行判定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectLiveByFileRequest 请求对象
     * @return SyncInvoker<DetectLiveByFileRequest, DetectLiveByFileResponse>
     */
    public SyncInvoker<DetectLiveByFileRequest, DetectLiveByFileResponse> detectLiveByFileInvoker(
        DetectLiveByFileRequest request) {
        return new SyncInvoker<>(request, FrsMeta.detectLiveByFile, hcClient);
    }

    /**
     * 动作活体检测
     *
     * 动作活体检测是通过判断视频中的人物动作与传入动作列表是否一致来识别视频中人物是否为活体。如果有多张人脸出现，则选取最大的人脸进行判定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectLiveByFileIntlRequest 请求对象
     * @return DetectLiveByFileIntlResponse
     */
    public DetectLiveByFileIntlResponse detectLiveByFileIntl(DetectLiveByFileIntlRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.detectLiveByFileIntl);
    }

    /**
     * 动作活体检测
     *
     * 动作活体检测是通过判断视频中的人物动作与传入动作列表是否一致来识别视频中人物是否为活体。如果有多张人脸出现，则选取最大的人脸进行判定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectLiveByFileIntlRequest 请求对象
     * @return SyncInvoker<DetectLiveByFileIntlRequest, DetectLiveByFileIntlResponse>
     */
    public SyncInvoker<DetectLiveByFileIntlRequest, DetectLiveByFileIntlResponse> detectLiveByFileIntlInvoker(
        DetectLiveByFileIntlRequest request) {
        return new SyncInvoker<>(request, FrsMeta.detectLiveByFileIntl, hcClient);
    }

    /**
     * 动作活体检测
     *
     * 动作活体检测是通过判断视频中的人物动作与传入动作列表是否一致来识别视频中人物是否为活体。如果有多张人脸出现，则选取最大的人脸进行判定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectLiveByUrlRequest 请求对象
     * @return DetectLiveByUrlResponse
     */
    public DetectLiveByUrlResponse detectLiveByUrl(DetectLiveByUrlRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.detectLiveByUrl);
    }

    /**
     * 动作活体检测
     *
     * 动作活体检测是通过判断视频中的人物动作与传入动作列表是否一致来识别视频中人物是否为活体。如果有多张人脸出现，则选取最大的人脸进行判定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectLiveByUrlRequest 请求对象
     * @return SyncInvoker<DetectLiveByUrlRequest, DetectLiveByUrlResponse>
     */
    public SyncInvoker<DetectLiveByUrlRequest, DetectLiveByUrlResponse> detectLiveByUrlInvoker(
        DetectLiveByUrlRequest request) {
        return new SyncInvoker<>(request, FrsMeta.detectLiveByUrl, hcClient);
    }

    /**
     * 动作活体检测
     *
     * 动作活体检测是通过判断视频中的人物动作与传入动作列表是否一致来识别视频中人物是否为活体。如果有多张人脸出现，则选取最大的人脸进行判定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectLiveByUrlIntlRequest 请求对象
     * @return DetectLiveByUrlIntlResponse
     */
    public DetectLiveByUrlIntlResponse detectLiveByUrlIntl(DetectLiveByUrlIntlRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.detectLiveByUrlIntl);
    }

    /**
     * 动作活体检测
     *
     * 动作活体检测是通过判断视频中的人物动作与传入动作列表是否一致来识别视频中人物是否为活体。如果有多张人脸出现，则选取最大的人脸进行判定。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectLiveByUrlIntlRequest 请求对象
     * @return SyncInvoker<DetectLiveByUrlIntlRequest, DetectLiveByUrlIntlResponse>
     */
    public SyncInvoker<DetectLiveByUrlIntlRequest, DetectLiveByUrlIntlResponse> detectLiveByUrlIntlInvoker(
        DetectLiveByUrlIntlRequest request) {
        return new SyncInvoker<>(request, FrsMeta.detectLiveByUrlIntl, hcClient);
    }

    /**
     * 静默活体检测
     *
     * 静默活体检测是基于人脸图片中可能存在的畸变、摩尔纹、反光、倒影、边框等信息，判断图片中的人脸是否来自于真人活体，有效抵御纸质翻拍照、电子翻拍照以及视频翻拍等各种攻击方式。静默活体检测支持单张图片，不支持多人脸图片。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectLiveFaceByBase64Request 请求对象
     * @return DetectLiveFaceByBase64Response
     */
    public DetectLiveFaceByBase64Response detectLiveFaceByBase64(DetectLiveFaceByBase64Request request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.detectLiveFaceByBase64);
    }

    /**
     * 静默活体检测
     *
     * 静默活体检测是基于人脸图片中可能存在的畸变、摩尔纹、反光、倒影、边框等信息，判断图片中的人脸是否来自于真人活体，有效抵御纸质翻拍照、电子翻拍照以及视频翻拍等各种攻击方式。静默活体检测支持单张图片，不支持多人脸图片。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectLiveFaceByBase64Request 请求对象
     * @return SyncInvoker<DetectLiveFaceByBase64Request, DetectLiveFaceByBase64Response>
     */
    public SyncInvoker<DetectLiveFaceByBase64Request, DetectLiveFaceByBase64Response> detectLiveFaceByBase64Invoker(
        DetectLiveFaceByBase64Request request) {
        return new SyncInvoker<>(request, FrsMeta.detectLiveFaceByBase64, hcClient);
    }

    /**
     * 静默活体检测
     *
     * 静默活体检测是基于人脸图片中可能存在的畸变、摩尔纹、反光、倒影、边框等信息，判断图片中的人脸是否来自于真人活体，有效抵御纸质翻拍照、电子翻拍照以及视频翻拍等各种攻击方式。静默活体检测支持单张图片，不支持多人脸图片。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectLiveFaceByFileRequest 请求对象
     * @return DetectLiveFaceByFileResponse
     */
    public DetectLiveFaceByFileResponse detectLiveFaceByFile(DetectLiveFaceByFileRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.detectLiveFaceByFile);
    }

    /**
     * 静默活体检测
     *
     * 静默活体检测是基于人脸图片中可能存在的畸变、摩尔纹、反光、倒影、边框等信息，判断图片中的人脸是否来自于真人活体，有效抵御纸质翻拍照、电子翻拍照以及视频翻拍等各种攻击方式。静默活体检测支持单张图片，不支持多人脸图片。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectLiveFaceByFileRequest 请求对象
     * @return SyncInvoker<DetectLiveFaceByFileRequest, DetectLiveFaceByFileResponse>
     */
    public SyncInvoker<DetectLiveFaceByFileRequest, DetectLiveFaceByFileResponse> detectLiveFaceByFileInvoker(
        DetectLiveFaceByFileRequest request) {
        return new SyncInvoker<>(request, FrsMeta.detectLiveFaceByFile, hcClient);
    }

    /**
     * 静默活体检测
     *
     * 静默活体检测是基于人脸图片中可能存在的畸变、摩尔纹、反光、倒影、边框等信息，判断图片中的人脸是否来自于真人活体，有效抵御纸质翻拍照、电子翻拍照以及视频翻拍等各种攻击方式。静默活体检测支持单张图片，不支持多人脸图片。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectLiveFaceByUrlRequest 请求对象
     * @return DetectLiveFaceByUrlResponse
     */
    public DetectLiveFaceByUrlResponse detectLiveFaceByUrl(DetectLiveFaceByUrlRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.detectLiveFaceByUrl);
    }

    /**
     * 静默活体检测
     *
     * 静默活体检测是基于人脸图片中可能存在的畸变、摩尔纹、反光、倒影、边框等信息，判断图片中的人脸是否来自于真人活体，有效抵御纸质翻拍照、电子翻拍照以及视频翻拍等各种攻击方式。静默活体检测支持单张图片，不支持多人脸图片。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetectLiveFaceByUrlRequest 请求对象
     * @return SyncInvoker<DetectLiveFaceByUrlRequest, DetectLiveFaceByUrlResponse>
     */
    public SyncInvoker<DetectLiveFaceByUrlRequest, DetectLiveFaceByUrlResponse> detectLiveFaceByUrlInvoker(
        DetectLiveFaceByUrlRequest request) {
        return new SyncInvoker<>(request, FrsMeta.detectLiveFaceByUrl, hcClient);
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
     * @return SearchFaceByBase64Response
     */
    public SearchFaceByBase64Response searchFaceByBase64(SearchFaceByBase64Request request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.searchFaceByBase64);
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
     * @return SyncInvoker<SearchFaceByBase64Request, SearchFaceByBase64Response>
     */
    public SyncInvoker<SearchFaceByBase64Request, SearchFaceByBase64Response> searchFaceByBase64Invoker(
        SearchFaceByBase64Request request) {
        return new SyncInvoker<>(request, FrsMeta.searchFaceByBase64, hcClient);
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
     * @return SearchFaceByFaceIdResponse
     */
    public SearchFaceByFaceIdResponse searchFaceByFaceId(SearchFaceByFaceIdRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.searchFaceByFaceId);
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
     * @return SyncInvoker<SearchFaceByFaceIdRequest, SearchFaceByFaceIdResponse>
     */
    public SyncInvoker<SearchFaceByFaceIdRequest, SearchFaceByFaceIdResponse> searchFaceByFaceIdInvoker(
        SearchFaceByFaceIdRequest request) {
        return new SyncInvoker<>(request, FrsMeta.searchFaceByFaceId, hcClient);
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
     * @return SearchFaceByFileResponse
     */
    public SearchFaceByFileResponse searchFaceByFile(SearchFaceByFileRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.searchFaceByFile);
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
     * @return SyncInvoker<SearchFaceByFileRequest, SearchFaceByFileResponse>
     */
    public SyncInvoker<SearchFaceByFileRequest, SearchFaceByFileResponse> searchFaceByFileInvoker(
        SearchFaceByFileRequest request) {
        return new SyncInvoker<>(request, FrsMeta.searchFaceByFile, hcClient);
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
     * @return SearchFaceByUrlResponse
     */
    public SearchFaceByUrlResponse searchFaceByUrl(SearchFaceByUrlRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.searchFaceByUrl);
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
     * @return SyncInvoker<SearchFaceByUrlRequest, SearchFaceByUrlResponse>
     */
    public SyncInvoker<SearchFaceByUrlRequest, SearchFaceByUrlResponse> searchFaceByUrlInvoker(
        SearchFaceByUrlRequest request) {
        return new SyncInvoker<>(request, FrsMeta.searchFaceByUrl, hcClient);
    }

    /**
     * 查询所有人脸库
     *
     * 查询当前用户所有人脸库的状态信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAllFaceSetsRequest 请求对象
     * @return ShowAllFaceSetsResponse
     */
    public ShowAllFaceSetsResponse showAllFaceSets(ShowAllFaceSetsRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.showAllFaceSets);
    }

    /**
     * 查询所有人脸库
     *
     * 查询当前用户所有人脸库的状态信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAllFaceSetsRequest 请求对象
     * @return SyncInvoker<ShowAllFaceSetsRequest, ShowAllFaceSetsResponse>
     */
    public SyncInvoker<ShowAllFaceSetsRequest, ShowAllFaceSetsResponse> showAllFaceSetsInvoker(
        ShowAllFaceSetsRequest request) {
        return new SyncInvoker<>(request, FrsMeta.showAllFaceSets, hcClient);
    }

    /**
     * 查询人脸库
     *
     * 查询人脸库当前的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFaceSetRequest 请求对象
     * @return ShowFaceSetResponse
     */
    public ShowFaceSetResponse showFaceSet(ShowFaceSetRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.showFaceSet);
    }

    /**
     * 查询人脸库
     *
     * 查询人脸库当前的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFaceSetRequest 请求对象
     * @return SyncInvoker<ShowFaceSetRequest, ShowFaceSetResponse>
     */
    public SyncInvoker<ShowFaceSetRequest, ShowFaceSetResponse> showFaceSetInvoker(ShowFaceSetRequest request) {
        return new SyncInvoker<>(request, FrsMeta.showFaceSet, hcClient);
    }

    /**
     * 查询人脸
     *
     * 查询指定人脸库中人脸信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFacesByFaceIdRequest 请求对象
     * @return ShowFacesByFaceIdResponse
     */
    public ShowFacesByFaceIdResponse showFacesByFaceId(ShowFacesByFaceIdRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.showFacesByFaceId);
    }

    /**
     * 查询人脸
     *
     * 查询指定人脸库中人脸信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFacesByFaceIdRequest 请求对象
     * @return SyncInvoker<ShowFacesByFaceIdRequest, ShowFacesByFaceIdResponse>
     */
    public SyncInvoker<ShowFacesByFaceIdRequest, ShowFacesByFaceIdResponse> showFacesByFaceIdInvoker(
        ShowFacesByFaceIdRequest request) {
        return new SyncInvoker<>(request, FrsMeta.showFacesByFaceId, hcClient);
    }

    /**
     * 查询人脸
     *
     * 查询指定人脸库中人脸信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFacesByLimitRequest 请求对象
     * @return ShowFacesByLimitResponse
     */
    public ShowFacesByLimitResponse showFacesByLimit(ShowFacesByLimitRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.showFacesByLimit);
    }

    /**
     * 查询人脸
     *
     * 查询指定人脸库中人脸信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFacesByLimitRequest 请求对象
     * @return SyncInvoker<ShowFacesByLimitRequest, ShowFacesByLimitResponse>
     */
    public SyncInvoker<ShowFacesByLimitRequest, ShowFacesByLimitResponse> showFacesByLimitInvoker(
        ShowFacesByLimitRequest request) {
        return new SyncInvoker<>(request, FrsMeta.showFacesByLimit, hcClient);
    }

    /**
     * 更新人脸
     *
     * 根据人脸ID（face_id）更新单张人脸信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFaceRequest 请求对象
     * @return UpdateFaceResponse
     */
    public UpdateFaceResponse updateFace(UpdateFaceRequest request) {
        return hcClient.syncInvokeHttp(request, FrsMeta.updateFace);
    }

    /**
     * 更新人脸
     *
     * 根据人脸ID（face_id）更新单张人脸信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFaceRequest 请求对象
     * @return SyncInvoker<UpdateFaceRequest, UpdateFaceResponse>
     */
    public SyncInvoker<UpdateFaceRequest, UpdateFaceResponse> updateFaceInvoker(UpdateFaceRequest request) {
        return new SyncInvoker<>(request, FrsMeta.updateFace, hcClient);
    }

}

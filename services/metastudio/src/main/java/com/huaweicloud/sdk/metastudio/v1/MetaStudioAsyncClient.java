package com.huaweicloud.sdk.metastudio.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.metastudio.v1.model.ConfirmFileUploadRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ConfirmFileUploadResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateDigitalAssetRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateDigitalAssetResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateFileRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateFileResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePictureModelingByUrlJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePictureModelingByUrlJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePictureModelingJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePictureModelingJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateTtsaRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateTtsaResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateVideoMotionCaptureJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateVideoMotionCaptureJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteAssetRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteAssetResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteFileRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteFileResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ExecuteVideoMotionCaptureCommandRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ExecuteVideoMotionCaptureCommandResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListAssetSummaryRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListAssetSummaryResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListAssetsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListAssetsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListPictureModelingJobsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListPictureModelingJobsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListStylesRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListStylesResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListTtsaDataRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListTtsaDataResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListTtsaJobsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListTtsaJobsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListVideoMotionCaptureJobsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListVideoMotionCaptureJobsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.RestoreAssetRequest;
import com.huaweicloud.sdk.metastudio.v1.model.RestoreAssetResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowAssetRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowAssetResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowPictureModelingJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowPictureModelingJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowVideoMotionCaptureJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowVideoMotionCaptureJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.StopVideoMotionCaptureJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.StopVideoMotionCaptureJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateDigitalAssetRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateDigitalAssetResponse;

import java.util.concurrent.CompletableFuture;

public class MetaStudioAsyncClient {

    protected HcClient hcClient;

    public MetaStudioAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<MetaStudioAsyncClient> newBuilder() {
        ClientBuilder<MetaStudioAsyncClient> clientBuilder = new ClientBuilder<>(MetaStudioAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 创建资产
     *
     * 该接口用于在资产库中添加上传新的媒体资产。可上传的资产类型包括：数字人模型、素材、视频、图片、场景等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDigitalAssetRequest 请求对象
     * @return CompletableFuture<CreateDigitalAssetResponse>
     */
    public CompletableFuture<CreateDigitalAssetResponse> createDigitalAssetAsync(CreateDigitalAssetRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createDigitalAsset);
    }

    /**
     * 创建资产
     *
     * 该接口用于在资产库中添加上传新的媒体资产。可上传的资产类型包括：数字人模型、素材、视频、图片、场景等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDigitalAssetRequest 请求对象
     * @return AsyncInvoker<CreateDigitalAssetRequest, CreateDigitalAssetResponse>
     */
    public AsyncInvoker<CreateDigitalAssetRequest, CreateDigitalAssetResponse> createDigitalAssetAsyncInvoker(
        CreateDigitalAssetRequest request) {
        return new AsyncInvoker<CreateDigitalAssetRequest, CreateDigitalAssetResponse>(request,
            MetaStudioMeta.createDigitalAsset, hcClient);
    }

    /**
     * 删除资产
     *
     * 该接口用于删除资产库中的媒体资产。第一次调用删除接口，将指定资产放入回收站；第二次调用删除接口，将指定资产彻底删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAssetRequest 请求对象
     * @return CompletableFuture<DeleteAssetResponse>
     */
    public CompletableFuture<DeleteAssetResponse> deleteAssetAsync(DeleteAssetRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.deleteAsset);
    }

    /**
     * 删除资产
     *
     * 该接口用于删除资产库中的媒体资产。第一次调用删除接口，将指定资产放入回收站；第二次调用删除接口，将指定资产彻底删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAssetRequest 请求对象
     * @return AsyncInvoker<DeleteAssetRequest, DeleteAssetResponse>
     */
    public AsyncInvoker<DeleteAssetRequest, DeleteAssetResponse> deleteAssetAsyncInvoker(DeleteAssetRequest request) {
        return new AsyncInvoker<DeleteAssetRequest, DeleteAssetResponse>(request, MetaStudioMeta.deleteAsset, hcClient);
    }

    /**
     * 查询资产概要
     *
     * 该接口用于查询媒体资产库中指定的多个资产的概要信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAssetSummaryRequest 请求对象
     * @return CompletableFuture<ListAssetSummaryResponse>
     */
    public CompletableFuture<ListAssetSummaryResponse> listAssetSummaryAsync(ListAssetSummaryRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.listAssetSummary);
    }

    /**
     * 查询资产概要
     *
     * 该接口用于查询媒体资产库中指定的多个资产的概要信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAssetSummaryRequest 请求对象
     * @return AsyncInvoker<ListAssetSummaryRequest, ListAssetSummaryResponse>
     */
    public AsyncInvoker<ListAssetSummaryRequest, ListAssetSummaryResponse> listAssetSummaryAsyncInvoker(
        ListAssetSummaryRequest request) {
        return new AsyncInvoker<ListAssetSummaryRequest, ListAssetSummaryResponse>(request,
            MetaStudioMeta.listAssetSummary, hcClient);
    }

    /**
     * 查询资产列表
     *
     * 该接口用于查询资产库中的媒体资产列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAssetsRequest 请求对象
     * @return CompletableFuture<ListAssetsResponse>
     */
    public CompletableFuture<ListAssetsResponse> listAssetsAsync(ListAssetsRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.listAssets);
    }

    /**
     * 查询资产列表
     *
     * 该接口用于查询资产库中的媒体资产列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAssetsRequest 请求对象
     * @return AsyncInvoker<ListAssetsRequest, ListAssetsResponse>
     */
    public AsyncInvoker<ListAssetsRequest, ListAssetsResponse> listAssetsAsyncInvoker(ListAssetsRequest request) {
        return new AsyncInvoker<ListAssetsRequest, ListAssetsResponse>(request, MetaStudioMeta.listAssets, hcClient);
    }

    /**
     * 恢复被删除的资产
     *
     * 该接口用于恢复被删除至回收站的媒体资产。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreAssetRequest 请求对象
     * @return CompletableFuture<RestoreAssetResponse>
     */
    public CompletableFuture<RestoreAssetResponse> restoreAssetAsync(RestoreAssetRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.restoreAsset);
    }

    /**
     * 恢复被删除的资产
     *
     * 该接口用于恢复被删除至回收站的媒体资产。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreAssetRequest 请求对象
     * @return AsyncInvoker<RestoreAssetRequest, RestoreAssetResponse>
     */
    public AsyncInvoker<RestoreAssetRequest, RestoreAssetResponse> restoreAssetAsyncInvoker(
        RestoreAssetRequest request) {
        return new AsyncInvoker<RestoreAssetRequest, RestoreAssetResponse>(request, MetaStudioMeta.restoreAsset,
            hcClient);
    }

    /**
     * 查询资产详情
     *
     * 该接口用于查询资产库中指定媒体资产的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAssetRequest 请求对象
     * @return CompletableFuture<ShowAssetResponse>
     */
    public CompletableFuture<ShowAssetResponse> showAssetAsync(ShowAssetRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.showAsset);
    }

    /**
     * 查询资产详情
     *
     * 该接口用于查询资产库中指定媒体资产的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAssetRequest 请求对象
     * @return AsyncInvoker<ShowAssetRequest, ShowAssetResponse>
     */
    public AsyncInvoker<ShowAssetRequest, ShowAssetResponse> showAssetAsyncInvoker(ShowAssetRequest request) {
        return new AsyncInvoker<ShowAssetRequest, ShowAssetResponse>(request, MetaStudioMeta.showAsset, hcClient);
    }

    /**
     * 更新资产
     *
     * 该接口用于更新资产库中的媒体资产信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDigitalAssetRequest 请求对象
     * @return CompletableFuture<UpdateDigitalAssetResponse>
     */
    public CompletableFuture<UpdateDigitalAssetResponse> updateDigitalAssetAsync(UpdateDigitalAssetRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.updateDigitalAsset);
    }

    /**
     * 更新资产
     *
     * 该接口用于更新资产库中的媒体资产信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDigitalAssetRequest 请求对象
     * @return AsyncInvoker<UpdateDigitalAssetRequest, UpdateDigitalAssetResponse>
     */
    public AsyncInvoker<UpdateDigitalAssetRequest, UpdateDigitalAssetResponse> updateDigitalAssetAsyncInvoker(
        UpdateDigitalAssetRequest request) {
        return new AsyncInvoker<UpdateDigitalAssetRequest, UpdateDigitalAssetResponse>(request,
            MetaStudioMeta.updateDigitalAsset, hcClient);
    }

    /**
     * 确认文件已上传
     *
     * 资产文件上传完毕后，通过该接口确认上传完成。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ConfirmFileUploadRequest 请求对象
     * @return CompletableFuture<ConfirmFileUploadResponse>
     */
    public CompletableFuture<ConfirmFileUploadResponse> confirmFileUploadAsync(ConfirmFileUploadRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.confirmFileUpload);
    }

    /**
     * 确认文件已上传
     *
     * 资产文件上传完毕后，通过该接口确认上传完成。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ConfirmFileUploadRequest 请求对象
     * @return AsyncInvoker<ConfirmFileUploadRequest, ConfirmFileUploadResponse>
     */
    public AsyncInvoker<ConfirmFileUploadRequest, ConfirmFileUploadResponse> confirmFileUploadAsyncInvoker(
        ConfirmFileUploadRequest request) {
        return new AsyncInvoker<ConfirmFileUploadRequest, ConfirmFileUploadResponse>(request,
            MetaStudioMeta.confirmFileUpload, hcClient);
    }

    /**
     * 创建文件并获取上传URL
     *
     * 该接口用于创建文件并获取上传URL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFileRequest 请求对象
     * @return CompletableFuture<CreateFileResponse>
     */
    public CompletableFuture<CreateFileResponse> createFileAsync(CreateFileRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createFile);
    }

    /**
     * 创建文件并获取上传URL
     *
     * 该接口用于创建文件并获取上传URL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFileRequest 请求对象
     * @return AsyncInvoker<CreateFileRequest, CreateFileResponse>
     */
    public AsyncInvoker<CreateFileRequest, CreateFileResponse> createFileAsyncInvoker(CreateFileRequest request) {
        return new AsyncInvoker<CreateFileRequest, CreateFileResponse>(request, MetaStudioMeta.createFile, hcClient);
    }

    /**
     * 删除文件
     *
     * 该接口用于删除媒体资产库中指定的文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFileRequest 请求对象
     * @return CompletableFuture<DeleteFileResponse>
     */
    public CompletableFuture<DeleteFileResponse> deleteFileAsync(DeleteFileRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.deleteFile);
    }

    /**
     * 删除文件
     *
     * 该接口用于删除媒体资产库中指定的文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFileRequest 请求对象
     * @return AsyncInvoker<DeleteFileRequest, DeleteFileResponse>
     */
    public AsyncInvoker<DeleteFileRequest, DeleteFileResponse> deleteFileAsyncInvoker(DeleteFileRequest request) {
        return new AsyncInvoker<DeleteFileRequest, DeleteFileResponse>(request, MetaStudioMeta.deleteFile, hcClient);
    }

    /**
     * 基于图片URL创建照片建模任务
     *
     * 该接口用于从URL中获取图片进行照片建模任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePictureModelingByUrlJobRequest 请求对象
     * @return CompletableFuture<CreatePictureModelingByUrlJobResponse>
     */
    public CompletableFuture<CreatePictureModelingByUrlJobResponse> createPictureModelingByUrlJobAsync(
        CreatePictureModelingByUrlJobRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createPictureModelingByUrlJob);
    }

    /**
     * 基于图片URL创建照片建模任务
     *
     * 该接口用于从URL中获取图片进行照片建模任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePictureModelingByUrlJobRequest 请求对象
     * @return AsyncInvoker<CreatePictureModelingByUrlJobRequest, CreatePictureModelingByUrlJobResponse>
     */
    public AsyncInvoker<CreatePictureModelingByUrlJobRequest, CreatePictureModelingByUrlJobResponse> createPictureModelingByUrlJobAsyncInvoker(
        CreatePictureModelingByUrlJobRequest request) {
        return new AsyncInvoker<CreatePictureModelingByUrlJobRequest, CreatePictureModelingByUrlJobResponse>(request,
            MetaStudioMeta.createPictureModelingByUrlJob, hcClient);
    }

    /**
     * 创建照片建模任务
     *
     * 该接口用于创建风格化照片建模任务。通过上传照片，生成风格化数字人模型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePictureModelingJobRequest 请求对象
     * @return CompletableFuture<CreatePictureModelingJobResponse>
     */
    public CompletableFuture<CreatePictureModelingJobResponse> createPictureModelingJobAsync(
        CreatePictureModelingJobRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createPictureModelingJob);
    }

    /**
     * 创建照片建模任务
     *
     * 该接口用于创建风格化照片建模任务。通过上传照片，生成风格化数字人模型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePictureModelingJobRequest 请求对象
     * @return AsyncInvoker<CreatePictureModelingJobRequest, CreatePictureModelingJobResponse>
     */
    public AsyncInvoker<CreatePictureModelingJobRequest, CreatePictureModelingJobResponse> createPictureModelingJobAsyncInvoker(
        CreatePictureModelingJobRequest request) {
        return new AsyncInvoker<CreatePictureModelingJobRequest, CreatePictureModelingJobResponse>(request,
            MetaStudioMeta.createPictureModelingJob, hcClient);
    }

    /**
     * 照片建模任务列表查询
     *
     * 该接口用于查询风格化照片建模任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPictureModelingJobsRequest 请求对象
     * @return CompletableFuture<ListPictureModelingJobsResponse>
     */
    public CompletableFuture<ListPictureModelingJobsResponse> listPictureModelingJobsAsync(
        ListPictureModelingJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.listPictureModelingJobs);
    }

    /**
     * 照片建模任务列表查询
     *
     * 该接口用于查询风格化照片建模任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPictureModelingJobsRequest 请求对象
     * @return AsyncInvoker<ListPictureModelingJobsRequest, ListPictureModelingJobsResponse>
     */
    public AsyncInvoker<ListPictureModelingJobsRequest, ListPictureModelingJobsResponse> listPictureModelingJobsAsyncInvoker(
        ListPictureModelingJobsRequest request) {
        return new AsyncInvoker<ListPictureModelingJobsRequest, ListPictureModelingJobsResponse>(request,
            MetaStudioMeta.listPictureModelingJobs, hcClient);
    }

    /**
     * 照片建模任务详情查询
     *
     * 该接口用于风格化查询照片建模任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPictureModelingJobRequest 请求对象
     * @return CompletableFuture<ShowPictureModelingJobResponse>
     */
    public CompletableFuture<ShowPictureModelingJobResponse> showPictureModelingJobAsync(
        ShowPictureModelingJobRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.showPictureModelingJob);
    }

    /**
     * 照片建模任务详情查询
     *
     * 该接口用于风格化查询照片建模任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPictureModelingJobRequest 请求对象
     * @return AsyncInvoker<ShowPictureModelingJobRequest, ShowPictureModelingJobResponse>
     */
    public AsyncInvoker<ShowPictureModelingJobRequest, ShowPictureModelingJobResponse> showPictureModelingJobAsyncInvoker(
        ShowPictureModelingJobRequest request) {
        return new AsyncInvoker<ShowPictureModelingJobRequest, ShowPictureModelingJobResponse>(request,
            MetaStudioMeta.showPictureModelingJob, hcClient);
    }

    /**
     * 查询数字人风格列表
     *
     * 查询数字人风格列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStylesRequest 请求对象
     * @return CompletableFuture<ListStylesResponse>
     */
    public CompletableFuture<ListStylesResponse> listStylesAsync(ListStylesRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.listStyles);
    }

    /**
     * 查询数字人风格列表
     *
     * 查询数字人风格列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStylesRequest 请求对象
     * @return AsyncInvoker<ListStylesRequest, ListStylesResponse>
     */
    public AsyncInvoker<ListStylesRequest, ListStylesResponse> listStylesAsyncInvoker(ListStylesRequest request) {
        return new AsyncInvoker<ListStylesRequest, ListStylesResponse>(request, MetaStudioMeta.listStyles, hcClient);
    }

    /**
     * 创建语音驱动任务
     *
     * 该接口用于创建驱动数字人表情、动作及语音的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTtsaRequest 请求对象
     * @return CompletableFuture<CreateTtsaResponse>
     */
    public CompletableFuture<CreateTtsaResponse> createTtsaAsync(CreateTtsaRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createTtsa);
    }

    /**
     * 创建语音驱动任务
     *
     * 该接口用于创建驱动数字人表情、动作及语音的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTtsaRequest 请求对象
     * @return AsyncInvoker<CreateTtsaRequest, CreateTtsaResponse>
     */
    public AsyncInvoker<CreateTtsaRequest, CreateTtsaResponse> createTtsaAsyncInvoker(CreateTtsaRequest request) {
        return new AsyncInvoker<CreateTtsaRequest, CreateTtsaResponse>(request, MetaStudioMeta.createTtsa, hcClient);
    }

    /**
     * 获取语音驱动数据
     *
     * 该接口用于获取生成的数字人驱动数据，包括语音、表情、动作等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTtsaDataRequest 请求对象
     * @return CompletableFuture<ListTtsaDataResponse>
     */
    public CompletableFuture<ListTtsaDataResponse> listTtsaDataAsync(ListTtsaDataRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.listTtsaData);
    }

    /**
     * 获取语音驱动数据
     *
     * 该接口用于获取生成的数字人驱动数据，包括语音、表情、动作等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTtsaDataRequest 请求对象
     * @return AsyncInvoker<ListTtsaDataRequest, ListTtsaDataResponse>
     */
    public AsyncInvoker<ListTtsaDataRequest, ListTtsaDataResponse> listTtsaDataAsyncInvoker(
        ListTtsaDataRequest request) {
        return new AsyncInvoker<ListTtsaDataRequest, ListTtsaDataResponse>(request, MetaStudioMeta.listTtsaData,
            hcClient);
    }

    /**
     * 获取语音驱动任务列表
     *
     * 该接口用于查询驱动数字人表情、动作及语音的任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTtsaJobsRequest 请求对象
     * @return CompletableFuture<ListTtsaJobsResponse>
     */
    public CompletableFuture<ListTtsaJobsResponse> listTtsaJobsAsync(ListTtsaJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.listTtsaJobs);
    }

    /**
     * 获取语音驱动任务列表
     *
     * 该接口用于查询驱动数字人表情、动作及语音的任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTtsaJobsRequest 请求对象
     * @return AsyncInvoker<ListTtsaJobsRequest, ListTtsaJobsResponse>
     */
    public AsyncInvoker<ListTtsaJobsRequest, ListTtsaJobsResponse> listTtsaJobsAsyncInvoker(
        ListTtsaJobsRequest request) {
        return new AsyncInvoker<ListTtsaJobsRequest, ListTtsaJobsResponse>(request, MetaStudioMeta.listTtsaJobs,
            hcClient);
    }

    /**
     * 创建视频驱动任务
     *
     * 该接口用于创建视频驱动任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVideoMotionCaptureJobRequest 请求对象
     * @return CompletableFuture<CreateVideoMotionCaptureJobResponse>
     */
    public CompletableFuture<CreateVideoMotionCaptureJobResponse> createVideoMotionCaptureJobAsync(
        CreateVideoMotionCaptureJobRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createVideoMotionCaptureJob);
    }

    /**
     * 创建视频驱动任务
     *
     * 该接口用于创建视频驱动任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVideoMotionCaptureJobRequest 请求对象
     * @return AsyncInvoker<CreateVideoMotionCaptureJobRequest, CreateVideoMotionCaptureJobResponse>
     */
    public AsyncInvoker<CreateVideoMotionCaptureJobRequest, CreateVideoMotionCaptureJobResponse> createVideoMotionCaptureJobAsyncInvoker(
        CreateVideoMotionCaptureJobRequest request) {
        return new AsyncInvoker<CreateVideoMotionCaptureJobRequest, CreateVideoMotionCaptureJobResponse>(request,
            MetaStudioMeta.createVideoMotionCaptureJob, hcClient);
    }

    /**
     * 控制数字人驱动
     *
     * 该接口用于控制数字人驱动。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteVideoMotionCaptureCommandRequest 请求对象
     * @return CompletableFuture<ExecuteVideoMotionCaptureCommandResponse>
     */
    public CompletableFuture<ExecuteVideoMotionCaptureCommandResponse> executeVideoMotionCaptureCommandAsync(
        ExecuteVideoMotionCaptureCommandRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.executeVideoMotionCaptureCommand);
    }

    /**
     * 控制数字人驱动
     *
     * 该接口用于控制数字人驱动。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteVideoMotionCaptureCommandRequest 请求对象
     * @return AsyncInvoker<ExecuteVideoMotionCaptureCommandRequest, ExecuteVideoMotionCaptureCommandResponse>
     */
    public AsyncInvoker<ExecuteVideoMotionCaptureCommandRequest, ExecuteVideoMotionCaptureCommandResponse> executeVideoMotionCaptureCommandAsyncInvoker(
        ExecuteVideoMotionCaptureCommandRequest request) {
        return new AsyncInvoker<ExecuteVideoMotionCaptureCommandRequest, ExecuteVideoMotionCaptureCommandResponse>(
            request, MetaStudioMeta.executeVideoMotionCaptureCommand, hcClient);
    }

    /**
     * 查询视频驱动任务列表
     *
     * 该接口用于查询视频驱动任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVideoMotionCaptureJobsRequest 请求对象
     * @return CompletableFuture<ListVideoMotionCaptureJobsResponse>
     */
    public CompletableFuture<ListVideoMotionCaptureJobsResponse> listVideoMotionCaptureJobsAsync(
        ListVideoMotionCaptureJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.listVideoMotionCaptureJobs);
    }

    /**
     * 查询视频驱动任务列表
     *
     * 该接口用于查询视频驱动任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVideoMotionCaptureJobsRequest 请求对象
     * @return AsyncInvoker<ListVideoMotionCaptureJobsRequest, ListVideoMotionCaptureJobsResponse>
     */
    public AsyncInvoker<ListVideoMotionCaptureJobsRequest, ListVideoMotionCaptureJobsResponse> listVideoMotionCaptureJobsAsyncInvoker(
        ListVideoMotionCaptureJobsRequest request) {
        return new AsyncInvoker<ListVideoMotionCaptureJobsRequest, ListVideoMotionCaptureJobsResponse>(request,
            MetaStudioMeta.listVideoMotionCaptureJobs, hcClient);
    }

    /**
     * 查询视频驱动任务详情
     *
     * 该接口用于查询视频驱动任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVideoMotionCaptureJobRequest 请求对象
     * @return CompletableFuture<ShowVideoMotionCaptureJobResponse>
     */
    public CompletableFuture<ShowVideoMotionCaptureJobResponse> showVideoMotionCaptureJobAsync(
        ShowVideoMotionCaptureJobRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.showVideoMotionCaptureJob);
    }

    /**
     * 查询视频驱动任务详情
     *
     * 该接口用于查询视频驱动任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVideoMotionCaptureJobRequest 请求对象
     * @return AsyncInvoker<ShowVideoMotionCaptureJobRequest, ShowVideoMotionCaptureJobResponse>
     */
    public AsyncInvoker<ShowVideoMotionCaptureJobRequest, ShowVideoMotionCaptureJobResponse> showVideoMotionCaptureJobAsyncInvoker(
        ShowVideoMotionCaptureJobRequest request) {
        return new AsyncInvoker<ShowVideoMotionCaptureJobRequest, ShowVideoMotionCaptureJobResponse>(request,
            MetaStudioMeta.showVideoMotionCaptureJob, hcClient);
    }

    /**
     * 停止视频驱动任务
     *
     * 该接口用于停止视频驱动任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopVideoMotionCaptureJobRequest 请求对象
     * @return CompletableFuture<StopVideoMotionCaptureJobResponse>
     */
    public CompletableFuture<StopVideoMotionCaptureJobResponse> stopVideoMotionCaptureJobAsync(
        StopVideoMotionCaptureJobRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.stopVideoMotionCaptureJob);
    }

    /**
     * 停止视频驱动任务
     *
     * 该接口用于停止视频驱动任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopVideoMotionCaptureJobRequest 请求对象
     * @return AsyncInvoker<StopVideoMotionCaptureJobRequest, StopVideoMotionCaptureJobResponse>
     */
    public AsyncInvoker<StopVideoMotionCaptureJobRequest, StopVideoMotionCaptureJobResponse> stopVideoMotionCaptureJobAsyncInvoker(
        StopVideoMotionCaptureJobRequest request) {
        return new AsyncInvoker<StopVideoMotionCaptureJobRequest, StopVideoMotionCaptureJobResponse>(request,
            MetaStudioMeta.stopVideoMotionCaptureJob, hcClient);
    }

}

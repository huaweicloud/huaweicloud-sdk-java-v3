package com.huaweicloud.sdk.metastudio.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.metastudio.v1.model.Cancel2DDigitalHumanVideoRequest;
import com.huaweicloud.sdk.metastudio.v1.model.Cancel2DDigitalHumanVideoResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CancelPhotoDigitalHumanVideoRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CancelPhotoDigitalHumanVideoResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ConfirmFileUploadRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ConfirmFileUploadResponse;
import com.huaweicloud.sdk.metastudio.v1.model.Create2DDigitalHumanVideoRequest;
import com.huaweicloud.sdk.metastudio.v1.model.Create2DDigitalHumanVideoResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateDigitalAssetRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateDigitalAssetResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateDigitalHumanBusinessCardRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateDigitalHumanBusinessCardResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateFileRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateFileResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePhotoDigitalHumanVideoRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePhotoDigitalHumanVideoResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePictureModelingByUrlJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePictureModelingByUrlJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePictureModelingJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePictureModelingJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateSmartLiveRoomRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateSmartLiveRoomResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateTtsaRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateTtsaResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateVideoMotionCaptureJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateVideoMotionCaptureJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateVideoScriptsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateVideoScriptsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteAssetRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteAssetResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteDigitalHumanBusinessCardRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteDigitalHumanBusinessCardResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteFileRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteFileResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteSmartLiveRoomRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteSmartLiveRoomResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteVideoScriptRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteVideoScriptResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ExecuteSmartLiveCommandRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ExecuteSmartLiveCommandResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ExecuteVideoMotionCaptureCommandRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ExecuteVideoMotionCaptureCommandResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListAssetSummaryRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListAssetSummaryResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListAssetsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListAssetsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListDigitalHumanBusinessCardRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListDigitalHumanBusinessCardResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListPictureModelingJobsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListPictureModelingJobsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListSmartLiveRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListSmartLiveResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListSmartLiveRoomsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListSmartLiveRoomsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListStylesRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListStylesResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListTtsaDataRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListTtsaDataResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListTtsaJobsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListTtsaJobsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListVideoMotionCaptureJobsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListVideoMotionCaptureJobsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListVideoScriptsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListVideoScriptsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.LiveEventReportRequest;
import com.huaweicloud.sdk.metastudio.v1.model.LiveEventReportResponse;
import com.huaweicloud.sdk.metastudio.v1.model.RestoreAssetRequest;
import com.huaweicloud.sdk.metastudio.v1.model.RestoreAssetResponse;
import com.huaweicloud.sdk.metastudio.v1.model.Show2DDigitalHumanVideoRequest;
import com.huaweicloud.sdk.metastudio.v1.model.Show2DDigitalHumanVideoResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowAssetRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowAssetResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowDigitalHumanBusinessCardRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowDigitalHumanBusinessCardResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowPhotoDigitalHumanVideoRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowPhotoDigitalHumanVideoResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowPictureModelingJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowPictureModelingJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowSmartLiveRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowSmartLiveResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowSmartLiveRoomRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowSmartLiveRoomResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowVideoMotionCaptureJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowVideoMotionCaptureJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowVideoScriptRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowVideoScriptResponse;
import com.huaweicloud.sdk.metastudio.v1.model.StartSmartLiveRequest;
import com.huaweicloud.sdk.metastudio.v1.model.StartSmartLiveResponse;
import com.huaweicloud.sdk.metastudio.v1.model.StopSmartLiveRequest;
import com.huaweicloud.sdk.metastudio.v1.model.StopSmartLiveResponse;
import com.huaweicloud.sdk.metastudio.v1.model.StopVideoMotionCaptureJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.StopVideoMotionCaptureJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateDigitalAssetRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateDigitalAssetResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateDigitalHumanBusinessCardRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateDigitalHumanBusinessCardResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateSmartLiveRoomRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateSmartLiveRoomResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateVideoScriptRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateVideoScriptResponse;

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
     * 创建数字人名片制作
     *
     * 该接口用于数字人名片制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDigitalHumanBusinessCardRequest 请求对象
     * @return CompletableFuture<CreateDigitalHumanBusinessCardResponse>
     */
    public CompletableFuture<CreateDigitalHumanBusinessCardResponse> createDigitalHumanBusinessCardAsync(
        CreateDigitalHumanBusinessCardRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createDigitalHumanBusinessCard);
    }

    /**
     * 创建数字人名片制作
     *
     * 该接口用于数字人名片制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDigitalHumanBusinessCardRequest 请求对象
     * @return AsyncInvoker<CreateDigitalHumanBusinessCardRequest, CreateDigitalHumanBusinessCardResponse>
     */
    public AsyncInvoker<CreateDigitalHumanBusinessCardRequest, CreateDigitalHumanBusinessCardResponse> createDigitalHumanBusinessCardAsyncInvoker(
        CreateDigitalHumanBusinessCardRequest request) {
        return new AsyncInvoker<CreateDigitalHumanBusinessCardRequest, CreateDigitalHumanBusinessCardResponse>(request,
            MetaStudioMeta.createDigitalHumanBusinessCard, hcClient);
    }

    /**
     * 删除数字人名片制作任务
     *
     * 该接口用于删除数字人名片制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDigitalHumanBusinessCardRequest 请求对象
     * @return CompletableFuture<DeleteDigitalHumanBusinessCardResponse>
     */
    public CompletableFuture<DeleteDigitalHumanBusinessCardResponse> deleteDigitalHumanBusinessCardAsync(
        DeleteDigitalHumanBusinessCardRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.deleteDigitalHumanBusinessCard);
    }

    /**
     * 删除数字人名片制作任务
     *
     * 该接口用于删除数字人名片制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDigitalHumanBusinessCardRequest 请求对象
     * @return AsyncInvoker<DeleteDigitalHumanBusinessCardRequest, DeleteDigitalHumanBusinessCardResponse>
     */
    public AsyncInvoker<DeleteDigitalHumanBusinessCardRequest, DeleteDigitalHumanBusinessCardResponse> deleteDigitalHumanBusinessCardAsyncInvoker(
        DeleteDigitalHumanBusinessCardRequest request) {
        return new AsyncInvoker<DeleteDigitalHumanBusinessCardRequest, DeleteDigitalHumanBusinessCardResponse>(request,
            MetaStudioMeta.deleteDigitalHumanBusinessCard, hcClient);
    }

    /**
     * 查询数字人名片制作任务列表
     *
     * 该接口用于查询数字人名片制作任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDigitalHumanBusinessCardRequest 请求对象
     * @return CompletableFuture<ListDigitalHumanBusinessCardResponse>
     */
    public CompletableFuture<ListDigitalHumanBusinessCardResponse> listDigitalHumanBusinessCardAsync(
        ListDigitalHumanBusinessCardRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.listDigitalHumanBusinessCard);
    }

    /**
     * 查询数字人名片制作任务列表
     *
     * 该接口用于查询数字人名片制作任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDigitalHumanBusinessCardRequest 请求对象
     * @return AsyncInvoker<ListDigitalHumanBusinessCardRequest, ListDigitalHumanBusinessCardResponse>
     */
    public AsyncInvoker<ListDigitalHumanBusinessCardRequest, ListDigitalHumanBusinessCardResponse> listDigitalHumanBusinessCardAsyncInvoker(
        ListDigitalHumanBusinessCardRequest request) {
        return new AsyncInvoker<ListDigitalHumanBusinessCardRequest, ListDigitalHumanBusinessCardResponse>(request,
            MetaStudioMeta.listDigitalHumanBusinessCard, hcClient);
    }

    /**
     * 查询数字人名片制作任务详情
     *
     * 该接口用于查询数字人名片制作任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDigitalHumanBusinessCardRequest 请求对象
     * @return CompletableFuture<ShowDigitalHumanBusinessCardResponse>
     */
    public CompletableFuture<ShowDigitalHumanBusinessCardResponse> showDigitalHumanBusinessCardAsync(
        ShowDigitalHumanBusinessCardRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.showDigitalHumanBusinessCard);
    }

    /**
     * 查询数字人名片制作任务详情
     *
     * 该接口用于查询数字人名片制作任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDigitalHumanBusinessCardRequest 请求对象
     * @return AsyncInvoker<ShowDigitalHumanBusinessCardRequest, ShowDigitalHumanBusinessCardResponse>
     */
    public AsyncInvoker<ShowDigitalHumanBusinessCardRequest, ShowDigitalHumanBusinessCardResponse> showDigitalHumanBusinessCardAsyncInvoker(
        ShowDigitalHumanBusinessCardRequest request) {
        return new AsyncInvoker<ShowDigitalHumanBusinessCardRequest, ShowDigitalHumanBusinessCardResponse>(request,
            MetaStudioMeta.showDigitalHumanBusinessCard, hcClient);
    }

    /**
     * 更新数字人名片制作
     *
     * 该接口用于更新数字人名片制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDigitalHumanBusinessCardRequest 请求对象
     * @return CompletableFuture<UpdateDigitalHumanBusinessCardResponse>
     */
    public CompletableFuture<UpdateDigitalHumanBusinessCardResponse> updateDigitalHumanBusinessCardAsync(
        UpdateDigitalHumanBusinessCardRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.updateDigitalHumanBusinessCard);
    }

    /**
     * 更新数字人名片制作
     *
     * 该接口用于更新数字人名片制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDigitalHumanBusinessCardRequest 请求对象
     * @return AsyncInvoker<UpdateDigitalHumanBusinessCardRequest, UpdateDigitalHumanBusinessCardResponse>
     */
    public AsyncInvoker<UpdateDigitalHumanBusinessCardRequest, UpdateDigitalHumanBusinessCardResponse> updateDigitalHumanBusinessCardAsyncInvoker(
        UpdateDigitalHumanBusinessCardRequest request) {
        return new AsyncInvoker<UpdateDigitalHumanBusinessCardRequest, UpdateDigitalHumanBusinessCardResponse>(request,
            MetaStudioMeta.updateDigitalHumanBusinessCard, hcClient);
    }

    /**
     * 取消等待中的分身数字人视频制作任务
     *
     * 该接口用于取消等待中的分身数字人视频制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param Cancel2DDigitalHumanVideoRequest 请求对象
     * @return CompletableFuture<Cancel2DDigitalHumanVideoResponse>
     */
    public CompletableFuture<Cancel2DDigitalHumanVideoResponse> cancel2DDigitalHumanVideoAsync(
        Cancel2DDigitalHumanVideoRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.cancel2DDigitalHumanVideo);
    }

    /**
     * 取消等待中的分身数字人视频制作任务
     *
     * 该接口用于取消等待中的分身数字人视频制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param Cancel2DDigitalHumanVideoRequest 请求对象
     * @return AsyncInvoker<Cancel2DDigitalHumanVideoRequest, Cancel2DDigitalHumanVideoResponse>
     */
    public AsyncInvoker<Cancel2DDigitalHumanVideoRequest, Cancel2DDigitalHumanVideoResponse> cancel2DDigitalHumanVideoAsyncInvoker(
        Cancel2DDigitalHumanVideoRequest request) {
        return new AsyncInvoker<Cancel2DDigitalHumanVideoRequest, Cancel2DDigitalHumanVideoResponse>(request,
            MetaStudioMeta.cancel2DDigitalHumanVideo, hcClient);
    }

    /**
     * 创建分身数字人视频制作任务
     *
     * 该接口用于创建分身数字人视频制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param Create2DDigitalHumanVideoRequest 请求对象
     * @return CompletableFuture<Create2DDigitalHumanVideoResponse>
     */
    public CompletableFuture<Create2DDigitalHumanVideoResponse> create2DDigitalHumanVideoAsync(
        Create2DDigitalHumanVideoRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.create2DDigitalHumanVideo);
    }

    /**
     * 创建分身数字人视频制作任务
     *
     * 该接口用于创建分身数字人视频制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param Create2DDigitalHumanVideoRequest 请求对象
     * @return AsyncInvoker<Create2DDigitalHumanVideoRequest, Create2DDigitalHumanVideoResponse>
     */
    public AsyncInvoker<Create2DDigitalHumanVideoRequest, Create2DDigitalHumanVideoResponse> create2DDigitalHumanVideoAsyncInvoker(
        Create2DDigitalHumanVideoRequest request) {
        return new AsyncInvoker<Create2DDigitalHumanVideoRequest, Create2DDigitalHumanVideoResponse>(request,
            MetaStudioMeta.create2DDigitalHumanVideo, hcClient);
    }

    /**
     * 查询分身数字人视频制作任务详情
     *
     * 该接口用于查询分身数字人视频制作任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param Show2DDigitalHumanVideoRequest 请求对象
     * @return CompletableFuture<Show2DDigitalHumanVideoResponse>
     */
    public CompletableFuture<Show2DDigitalHumanVideoResponse> show2DDigitalHumanVideoAsync(
        Show2DDigitalHumanVideoRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.show2DDigitalHumanVideo);
    }

    /**
     * 查询分身数字人视频制作任务详情
     *
     * 该接口用于查询分身数字人视频制作任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param Show2DDigitalHumanVideoRequest 请求对象
     * @return AsyncInvoker<Show2DDigitalHumanVideoRequest, Show2DDigitalHumanVideoResponse>
     */
    public AsyncInvoker<Show2DDigitalHumanVideoRequest, Show2DDigitalHumanVideoResponse> show2DDigitalHumanVideoAsyncInvoker(
        Show2DDigitalHumanVideoRequest request) {
        return new AsyncInvoker<Show2DDigitalHumanVideoRequest, Show2DDigitalHumanVideoResponse>(request,
            MetaStudioMeta.show2DDigitalHumanVideo, hcClient);
    }

    /**
     * 取消等待中的照片分身数字人视频制作任务
     *
     * 该接口用于取消等待中的照片分身数字人视频制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelPhotoDigitalHumanVideoRequest 请求对象
     * @return CompletableFuture<CancelPhotoDigitalHumanVideoResponse>
     */
    public CompletableFuture<CancelPhotoDigitalHumanVideoResponse> cancelPhotoDigitalHumanVideoAsync(
        CancelPhotoDigitalHumanVideoRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.cancelPhotoDigitalHumanVideo);
    }

    /**
     * 取消等待中的照片分身数字人视频制作任务
     *
     * 该接口用于取消等待中的照片分身数字人视频制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelPhotoDigitalHumanVideoRequest 请求对象
     * @return AsyncInvoker<CancelPhotoDigitalHumanVideoRequest, CancelPhotoDigitalHumanVideoResponse>
     */
    public AsyncInvoker<CancelPhotoDigitalHumanVideoRequest, CancelPhotoDigitalHumanVideoResponse> cancelPhotoDigitalHumanVideoAsyncInvoker(
        CancelPhotoDigitalHumanVideoRequest request) {
        return new AsyncInvoker<CancelPhotoDigitalHumanVideoRequest, CancelPhotoDigitalHumanVideoResponse>(request,
            MetaStudioMeta.cancelPhotoDigitalHumanVideo, hcClient);
    }

    /**
     * 创建照片分身数字人视频制作任务
     *
     * 该接口用于创建照片分身数字人视频制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePhotoDigitalHumanVideoRequest 请求对象
     * @return CompletableFuture<CreatePhotoDigitalHumanVideoResponse>
     */
    public CompletableFuture<CreatePhotoDigitalHumanVideoResponse> createPhotoDigitalHumanVideoAsync(
        CreatePhotoDigitalHumanVideoRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createPhotoDigitalHumanVideo);
    }

    /**
     * 创建照片分身数字人视频制作任务
     *
     * 该接口用于创建照片分身数字人视频制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePhotoDigitalHumanVideoRequest 请求对象
     * @return AsyncInvoker<CreatePhotoDigitalHumanVideoRequest, CreatePhotoDigitalHumanVideoResponse>
     */
    public AsyncInvoker<CreatePhotoDigitalHumanVideoRequest, CreatePhotoDigitalHumanVideoResponse> createPhotoDigitalHumanVideoAsyncInvoker(
        CreatePhotoDigitalHumanVideoRequest request) {
        return new AsyncInvoker<CreatePhotoDigitalHumanVideoRequest, CreatePhotoDigitalHumanVideoResponse>(request,
            MetaStudioMeta.createPhotoDigitalHumanVideo, hcClient);
    }

    /**
     * 查询照片分身数字人视频制作任务详情
     *
     * 该接口用于查询照片分身数字人视频制作任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPhotoDigitalHumanVideoRequest 请求对象
     * @return CompletableFuture<ShowPhotoDigitalHumanVideoResponse>
     */
    public CompletableFuture<ShowPhotoDigitalHumanVideoResponse> showPhotoDigitalHumanVideoAsync(
        ShowPhotoDigitalHumanVideoRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.showPhotoDigitalHumanVideo);
    }

    /**
     * 查询照片分身数字人视频制作任务详情
     *
     * 该接口用于查询照片分身数字人视频制作任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPhotoDigitalHumanVideoRequest 请求对象
     * @return AsyncInvoker<ShowPhotoDigitalHumanVideoRequest, ShowPhotoDigitalHumanVideoResponse>
     */
    public AsyncInvoker<ShowPhotoDigitalHumanVideoRequest, ShowPhotoDigitalHumanVideoResponse> showPhotoDigitalHumanVideoAsyncInvoker(
        ShowPhotoDigitalHumanVideoRequest request) {
        return new AsyncInvoker<ShowPhotoDigitalHumanVideoRequest, ShowPhotoDigitalHumanVideoResponse>(request,
            MetaStudioMeta.showPhotoDigitalHumanVideo, hcClient);
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
     * 控制数字人直播过程
     *
     * 该接口用于控制数字人直播过程。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteSmartLiveCommandRequest 请求对象
     * @return CompletableFuture<ExecuteSmartLiveCommandResponse>
     */
    public CompletableFuture<ExecuteSmartLiveCommandResponse> executeSmartLiveCommandAsync(
        ExecuteSmartLiveCommandRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.executeSmartLiveCommand);
    }

    /**
     * 控制数字人直播过程
     *
     * 该接口用于控制数字人直播过程。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteSmartLiveCommandRequest 请求对象
     * @return AsyncInvoker<ExecuteSmartLiveCommandRequest, ExecuteSmartLiveCommandResponse>
     */
    public AsyncInvoker<ExecuteSmartLiveCommandRequest, ExecuteSmartLiveCommandResponse> executeSmartLiveCommandAsyncInvoker(
        ExecuteSmartLiveCommandRequest request) {
        return new AsyncInvoker<ExecuteSmartLiveCommandRequest, ExecuteSmartLiveCommandResponse>(request,
            MetaStudioMeta.executeSmartLiveCommand, hcClient);
    }

    /**
     * 查询数字人智能直播任务列表
     *
     * 该接口用于查询数字人智能直播任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSmartLiveRequest 请求对象
     * @return CompletableFuture<ListSmartLiveResponse>
     */
    public CompletableFuture<ListSmartLiveResponse> listSmartLiveAsync(ListSmartLiveRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.listSmartLive);
    }

    /**
     * 查询数字人智能直播任务列表
     *
     * 该接口用于查询数字人智能直播任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSmartLiveRequest 请求对象
     * @return AsyncInvoker<ListSmartLiveRequest, ListSmartLiveResponse>
     */
    public AsyncInvoker<ListSmartLiveRequest, ListSmartLiveResponse> listSmartLiveAsyncInvoker(
        ListSmartLiveRequest request) {
        return new AsyncInvoker<ListSmartLiveRequest, ListSmartLiveResponse>(request, MetaStudioMeta.listSmartLive,
            hcClient);
    }

    /**
     * 上报直播间事件
     *
     * 该接口用于上报直播间事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param LiveEventReportRequest 请求对象
     * @return CompletableFuture<LiveEventReportResponse>
     */
    public CompletableFuture<LiveEventReportResponse> liveEventReportAsync(LiveEventReportRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.liveEventReport);
    }

    /**
     * 上报直播间事件
     *
     * 该接口用于上报直播间事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param LiveEventReportRequest 请求对象
     * @return AsyncInvoker<LiveEventReportRequest, LiveEventReportResponse>
     */
    public AsyncInvoker<LiveEventReportRequest, LiveEventReportResponse> liveEventReportAsyncInvoker(
        LiveEventReportRequest request) {
        return new AsyncInvoker<LiveEventReportRequest, LiveEventReportResponse>(request,
            MetaStudioMeta.liveEventReport, hcClient);
    }

    /**
     * 查询数字人智能直播任务详情
     *
     * 该接口用于查询数字人智能直播任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSmartLiveRequest 请求对象
     * @return CompletableFuture<ShowSmartLiveResponse>
     */
    public CompletableFuture<ShowSmartLiveResponse> showSmartLiveAsync(ShowSmartLiveRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.showSmartLive);
    }

    /**
     * 查询数字人智能直播任务详情
     *
     * 该接口用于查询数字人智能直播任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSmartLiveRequest 请求对象
     * @return AsyncInvoker<ShowSmartLiveRequest, ShowSmartLiveResponse>
     */
    public AsyncInvoker<ShowSmartLiveRequest, ShowSmartLiveResponse> showSmartLiveAsyncInvoker(
        ShowSmartLiveRequest request) {
        return new AsyncInvoker<ShowSmartLiveRequest, ShowSmartLiveResponse>(request, MetaStudioMeta.showSmartLive,
            hcClient);
    }

    /**
     * 启动数字人智能直播任务
     *
     * 该接口用于启动数字人智能直播任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartSmartLiveRequest 请求对象
     * @return CompletableFuture<StartSmartLiveResponse>
     */
    public CompletableFuture<StartSmartLiveResponse> startSmartLiveAsync(StartSmartLiveRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.startSmartLive);
    }

    /**
     * 启动数字人智能直播任务
     *
     * 该接口用于启动数字人智能直播任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartSmartLiveRequest 请求对象
     * @return AsyncInvoker<StartSmartLiveRequest, StartSmartLiveResponse>
     */
    public AsyncInvoker<StartSmartLiveRequest, StartSmartLiveResponse> startSmartLiveAsyncInvoker(
        StartSmartLiveRequest request) {
        return new AsyncInvoker<StartSmartLiveRequest, StartSmartLiveResponse>(request, MetaStudioMeta.startSmartLive,
            hcClient);
    }

    /**
     * 结束数字人智能直播任务
     *
     * 该接口用于结束数字人智能直播任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopSmartLiveRequest 请求对象
     * @return CompletableFuture<StopSmartLiveResponse>
     */
    public CompletableFuture<StopSmartLiveResponse> stopSmartLiveAsync(StopSmartLiveRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.stopSmartLive);
    }

    /**
     * 结束数字人智能直播任务
     *
     * 该接口用于结束数字人智能直播任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopSmartLiveRequest 请求对象
     * @return AsyncInvoker<StopSmartLiveRequest, StopSmartLiveResponse>
     */
    public AsyncInvoker<StopSmartLiveRequest, StopSmartLiveResponse> stopSmartLiveAsyncInvoker(
        StopSmartLiveRequest request) {
        return new AsyncInvoker<StopSmartLiveRequest, StopSmartLiveResponse>(request, MetaStudioMeta.stopSmartLive,
            hcClient);
    }

    /**
     * 创建智能直播间
     *
     * 该接口用于创建智能直播间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSmartLiveRoomRequest 请求对象
     * @return CompletableFuture<CreateSmartLiveRoomResponse>
     */
    public CompletableFuture<CreateSmartLiveRoomResponse> createSmartLiveRoomAsync(CreateSmartLiveRoomRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createSmartLiveRoom);
    }

    /**
     * 创建智能直播间
     *
     * 该接口用于创建智能直播间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSmartLiveRoomRequest 请求对象
     * @return AsyncInvoker<CreateSmartLiveRoomRequest, CreateSmartLiveRoomResponse>
     */
    public AsyncInvoker<CreateSmartLiveRoomRequest, CreateSmartLiveRoomResponse> createSmartLiveRoomAsyncInvoker(
        CreateSmartLiveRoomRequest request) {
        return new AsyncInvoker<CreateSmartLiveRoomRequest, CreateSmartLiveRoomResponse>(request,
            MetaStudioMeta.createSmartLiveRoom, hcClient);
    }

    /**
     * 删除智能直播间
     *
     * 该接口用于删除智能直播间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSmartLiveRoomRequest 请求对象
     * @return CompletableFuture<DeleteSmartLiveRoomResponse>
     */
    public CompletableFuture<DeleteSmartLiveRoomResponse> deleteSmartLiveRoomAsync(DeleteSmartLiveRoomRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.deleteSmartLiveRoom);
    }

    /**
     * 删除智能直播间
     *
     * 该接口用于删除智能直播间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSmartLiveRoomRequest 请求对象
     * @return AsyncInvoker<DeleteSmartLiveRoomRequest, DeleteSmartLiveRoomResponse>
     */
    public AsyncInvoker<DeleteSmartLiveRoomRequest, DeleteSmartLiveRoomResponse> deleteSmartLiveRoomAsyncInvoker(
        DeleteSmartLiveRoomRequest request) {
        return new AsyncInvoker<DeleteSmartLiveRoomRequest, DeleteSmartLiveRoomResponse>(request,
            MetaStudioMeta.deleteSmartLiveRoom, hcClient);
    }

    /**
     * 查询智能直播间列表
     *
     * 该接口用于智能直播间列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSmartLiveRoomsRequest 请求对象
     * @return CompletableFuture<ListSmartLiveRoomsResponse>
     */
    public CompletableFuture<ListSmartLiveRoomsResponse> listSmartLiveRoomsAsync(ListSmartLiveRoomsRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.listSmartLiveRooms);
    }

    /**
     * 查询智能直播间列表
     *
     * 该接口用于智能直播间列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSmartLiveRoomsRequest 请求对象
     * @return AsyncInvoker<ListSmartLiveRoomsRequest, ListSmartLiveRoomsResponse>
     */
    public AsyncInvoker<ListSmartLiveRoomsRequest, ListSmartLiveRoomsResponse> listSmartLiveRoomsAsyncInvoker(
        ListSmartLiveRoomsRequest request) {
        return new AsyncInvoker<ListSmartLiveRoomsRequest, ListSmartLiveRoomsResponse>(request,
            MetaStudioMeta.listSmartLiveRooms, hcClient);
    }

    /**
     * 查询智能直播剧本详情
     *
     * 该接口用于查询智能直播剧本详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSmartLiveRoomRequest 请求对象
     * @return CompletableFuture<ShowSmartLiveRoomResponse>
     */
    public CompletableFuture<ShowSmartLiveRoomResponse> showSmartLiveRoomAsync(ShowSmartLiveRoomRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.showSmartLiveRoom);
    }

    /**
     * 查询智能直播剧本详情
     *
     * 该接口用于查询智能直播剧本详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSmartLiveRoomRequest 请求对象
     * @return AsyncInvoker<ShowSmartLiveRoomRequest, ShowSmartLiveRoomResponse>
     */
    public AsyncInvoker<ShowSmartLiveRoomRequest, ShowSmartLiveRoomResponse> showSmartLiveRoomAsyncInvoker(
        ShowSmartLiveRoomRequest request) {
        return new AsyncInvoker<ShowSmartLiveRoomRequest, ShowSmartLiveRoomResponse>(request,
            MetaStudioMeta.showSmartLiveRoom, hcClient);
    }

    /**
     * 更新智能直播间信息
     *
     * 该接口用于智能直播间信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSmartLiveRoomRequest 请求对象
     * @return CompletableFuture<UpdateSmartLiveRoomResponse>
     */
    public CompletableFuture<UpdateSmartLiveRoomResponse> updateSmartLiveRoomAsync(UpdateSmartLiveRoomRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.updateSmartLiveRoom);
    }

    /**
     * 更新智能直播间信息
     *
     * 该接口用于智能直播间信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSmartLiveRoomRequest 请求对象
     * @return AsyncInvoker<UpdateSmartLiveRoomRequest, UpdateSmartLiveRoomResponse>
     */
    public AsyncInvoker<UpdateSmartLiveRoomRequest, UpdateSmartLiveRoomResponse> updateSmartLiveRoomAsyncInvoker(
        UpdateSmartLiveRoomRequest request) {
        return new AsyncInvoker<UpdateSmartLiveRoomRequest, UpdateSmartLiveRoomResponse>(request,
            MetaStudioMeta.updateSmartLiveRoom, hcClient);
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

    /**
     * 创建视频制作剧本
     *
     * 该接口用于创建视频制作剧本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVideoScriptsRequest 请求对象
     * @return CompletableFuture<CreateVideoScriptsResponse>
     */
    public CompletableFuture<CreateVideoScriptsResponse> createVideoScriptsAsync(CreateVideoScriptsRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createVideoScripts);
    }

    /**
     * 创建视频制作剧本
     *
     * 该接口用于创建视频制作剧本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVideoScriptsRequest 请求对象
     * @return AsyncInvoker<CreateVideoScriptsRequest, CreateVideoScriptsResponse>
     */
    public AsyncInvoker<CreateVideoScriptsRequest, CreateVideoScriptsResponse> createVideoScriptsAsyncInvoker(
        CreateVideoScriptsRequest request) {
        return new AsyncInvoker<CreateVideoScriptsRequest, CreateVideoScriptsResponse>(request,
            MetaStudioMeta.createVideoScripts, hcClient);
    }

    /**
     * 删除视频制作剧本
     *
     * 该接口用于删除视频制作剧本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVideoScriptRequest 请求对象
     * @return CompletableFuture<DeleteVideoScriptResponse>
     */
    public CompletableFuture<DeleteVideoScriptResponse> deleteVideoScriptAsync(DeleteVideoScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.deleteVideoScript);
    }

    /**
     * 删除视频制作剧本
     *
     * 该接口用于删除视频制作剧本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVideoScriptRequest 请求对象
     * @return AsyncInvoker<DeleteVideoScriptRequest, DeleteVideoScriptResponse>
     */
    public AsyncInvoker<DeleteVideoScriptRequest, DeleteVideoScriptResponse> deleteVideoScriptAsyncInvoker(
        DeleteVideoScriptRequest request) {
        return new AsyncInvoker<DeleteVideoScriptRequest, DeleteVideoScriptResponse>(request,
            MetaStudioMeta.deleteVideoScript, hcClient);
    }

    /**
     * 查询视频制作剧本列表
     *
     * 该接口用于查询视频制作剧本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVideoScriptsRequest 请求对象
     * @return CompletableFuture<ListVideoScriptsResponse>
     */
    public CompletableFuture<ListVideoScriptsResponse> listVideoScriptsAsync(ListVideoScriptsRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.listVideoScripts);
    }

    /**
     * 查询视频制作剧本列表
     *
     * 该接口用于查询视频制作剧本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVideoScriptsRequest 请求对象
     * @return AsyncInvoker<ListVideoScriptsRequest, ListVideoScriptsResponse>
     */
    public AsyncInvoker<ListVideoScriptsRequest, ListVideoScriptsResponse> listVideoScriptsAsyncInvoker(
        ListVideoScriptsRequest request) {
        return new AsyncInvoker<ListVideoScriptsRequest, ListVideoScriptsResponse>(request,
            MetaStudioMeta.listVideoScripts, hcClient);
    }

    /**
     * 查询视频制作剧本详情
     *
     * 该接口用于查询视频制作剧本详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVideoScriptRequest 请求对象
     * @return CompletableFuture<ShowVideoScriptResponse>
     */
    public CompletableFuture<ShowVideoScriptResponse> showVideoScriptAsync(ShowVideoScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.showVideoScript);
    }

    /**
     * 查询视频制作剧本详情
     *
     * 该接口用于查询视频制作剧本详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVideoScriptRequest 请求对象
     * @return AsyncInvoker<ShowVideoScriptRequest, ShowVideoScriptResponse>
     */
    public AsyncInvoker<ShowVideoScriptRequest, ShowVideoScriptResponse> showVideoScriptAsyncInvoker(
        ShowVideoScriptRequest request) {
        return new AsyncInvoker<ShowVideoScriptRequest, ShowVideoScriptResponse>(request,
            MetaStudioMeta.showVideoScript, hcClient);
    }

    /**
     * 更新视频制作剧本
     *
     * 该接口用于更新视频制作剧本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVideoScriptRequest 请求对象
     * @return CompletableFuture<UpdateVideoScriptResponse>
     */
    public CompletableFuture<UpdateVideoScriptResponse> updateVideoScriptAsync(UpdateVideoScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.updateVideoScript);
    }

    /**
     * 更新视频制作剧本
     *
     * 该接口用于更新视频制作剧本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVideoScriptRequest 请求对象
     * @return AsyncInvoker<UpdateVideoScriptRequest, UpdateVideoScriptResponse>
     */
    public AsyncInvoker<UpdateVideoScriptRequest, UpdateVideoScriptResponse> updateVideoScriptAsyncInvoker(
        UpdateVideoScriptRequest request) {
        return new AsyncInvoker<UpdateVideoScriptRequest, UpdateVideoScriptResponse>(request,
            MetaStudioMeta.updateVideoScript, hcClient);
    }

}

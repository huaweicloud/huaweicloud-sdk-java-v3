package com.huaweicloud.sdk.vod.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.vod.v1.model.CancelAssetTranscodeTaskRequest;
import com.huaweicloud.sdk.vod.v1.model.CancelAssetTranscodeTaskResponse;
import com.huaweicloud.sdk.vod.v1.model.CancelExtractAudioTaskRequest;
import com.huaweicloud.sdk.vod.v1.model.CancelExtractAudioTaskResponse;
import com.huaweicloud.sdk.vod.v1.model.CheckMd5DuplicationRequest;
import com.huaweicloud.sdk.vod.v1.model.CheckMd5DuplicationResponse;
import com.huaweicloud.sdk.vod.v1.model.ConfirmAssetUploadRequest;
import com.huaweicloud.sdk.vod.v1.model.ConfirmAssetUploadResponse;
import com.huaweicloud.sdk.vod.v1.model.ConfirmImageUploadRequest;
import com.huaweicloud.sdk.vod.v1.model.ConfirmImageUploadResponse;
import com.huaweicloud.sdk.vod.v1.model.CreateAssetByFileUploadRequest;
import com.huaweicloud.sdk.vod.v1.model.CreateAssetByFileUploadResponse;
import com.huaweicloud.sdk.vod.v1.model.CreateAssetCategoryRequest;
import com.huaweicloud.sdk.vod.v1.model.CreateAssetCategoryResponse;
import com.huaweicloud.sdk.vod.v1.model.CreateAssetProcessTaskRequest;
import com.huaweicloud.sdk.vod.v1.model.CreateAssetProcessTaskResponse;
import com.huaweicloud.sdk.vod.v1.model.CreateAssetReviewTaskRequest;
import com.huaweicloud.sdk.vod.v1.model.CreateAssetReviewTaskResponse;
import com.huaweicloud.sdk.vod.v1.model.CreateExtractAudioTaskRequest;
import com.huaweicloud.sdk.vod.v1.model.CreateExtractAudioTaskResponse;
import com.huaweicloud.sdk.vod.v1.model.CreatePreheatingAssetRequest;
import com.huaweicloud.sdk.vod.v1.model.CreatePreheatingAssetResponse;
import com.huaweicloud.sdk.vod.v1.model.CreateTakeOverTaskRequest;
import com.huaweicloud.sdk.vod.v1.model.CreateTakeOverTaskResponse;
import com.huaweicloud.sdk.vod.v1.model.CreateTemplateGroupCollectionRequest;
import com.huaweicloud.sdk.vod.v1.model.CreateTemplateGroupCollectionResponse;
import com.huaweicloud.sdk.vod.v1.model.CreateTemplateGroupRequest;
import com.huaweicloud.sdk.vod.v1.model.CreateTemplateGroupResponse;
import com.huaweicloud.sdk.vod.v1.model.CreateTranscodeTemplateRequest;
import com.huaweicloud.sdk.vod.v1.model.CreateTranscodeTemplateResponse;
import com.huaweicloud.sdk.vod.v1.model.CreateWatermarkTemplateRequest;
import com.huaweicloud.sdk.vod.v1.model.CreateWatermarkTemplateResponse;
import com.huaweicloud.sdk.vod.v1.model.DeleteAssetCategoryRequest;
import com.huaweicloud.sdk.vod.v1.model.DeleteAssetCategoryResponse;
import com.huaweicloud.sdk.vod.v1.model.DeleteAssetsRequest;
import com.huaweicloud.sdk.vod.v1.model.DeleteAssetsResponse;
import com.huaweicloud.sdk.vod.v1.model.DeleteTemplateGroupCollectionRequest;
import com.huaweicloud.sdk.vod.v1.model.DeleteTemplateGroupCollectionResponse;
import com.huaweicloud.sdk.vod.v1.model.DeleteTemplateGroupRequest;
import com.huaweicloud.sdk.vod.v1.model.DeleteTemplateGroupResponse;
import com.huaweicloud.sdk.vod.v1.model.DeleteTranscodeProductRequest;
import com.huaweicloud.sdk.vod.v1.model.DeleteTranscodeProductResponse;
import com.huaweicloud.sdk.vod.v1.model.DeleteTranscodeTemplateRequest;
import com.huaweicloud.sdk.vod.v1.model.DeleteTranscodeTemplateResponse;
import com.huaweicloud.sdk.vod.v1.model.DeleteWatermarkTemplateRequest;
import com.huaweicloud.sdk.vod.v1.model.DeleteWatermarkTemplateResponse;
import com.huaweicloud.sdk.vod.v1.model.ListAssetCategoryRequest;
import com.huaweicloud.sdk.vod.v1.model.ListAssetCategoryResponse;
import com.huaweicloud.sdk.vod.v1.model.ListAssetDailySummaryLogRequest;
import com.huaweicloud.sdk.vod.v1.model.ListAssetDailySummaryLogResponse;
import com.huaweicloud.sdk.vod.v1.model.ListAssetListRequest;
import com.huaweicloud.sdk.vod.v1.model.ListAssetListResponse;
import com.huaweicloud.sdk.vod.v1.model.ListDomainLogsRequest;
import com.huaweicloud.sdk.vod.v1.model.ListDomainLogsResponse;
import com.huaweicloud.sdk.vod.v1.model.ListTakeOverTaskRequest;
import com.huaweicloud.sdk.vod.v1.model.ListTakeOverTaskResponse;
import com.huaweicloud.sdk.vod.v1.model.ListTemplateGroupCollectionRequest;
import com.huaweicloud.sdk.vod.v1.model.ListTemplateGroupCollectionResponse;
import com.huaweicloud.sdk.vod.v1.model.ListTemplateGroupRequest;
import com.huaweicloud.sdk.vod.v1.model.ListTemplateGroupResponse;
import com.huaweicloud.sdk.vod.v1.model.ListTopStatisticsRequest;
import com.huaweicloud.sdk.vod.v1.model.ListTopStatisticsResponse;
import com.huaweicloud.sdk.vod.v1.model.ListTranscodeTemplateRequest;
import com.huaweicloud.sdk.vod.v1.model.ListTranscodeTemplateResponse;
import com.huaweicloud.sdk.vod.v1.model.ListWatermarkTemplateRequest;
import com.huaweicloud.sdk.vod.v1.model.ListWatermarkTemplateResponse;
import com.huaweicloud.sdk.vod.v1.model.ModifySubtitleRequest;
import com.huaweicloud.sdk.vod.v1.model.ModifySubtitleResponse;
import com.huaweicloud.sdk.vod.v1.model.PublishAssetFromObsRequest;
import com.huaweicloud.sdk.vod.v1.model.PublishAssetFromObsResponse;
import com.huaweicloud.sdk.vod.v1.model.PublishAssetsRequest;
import com.huaweicloud.sdk.vod.v1.model.PublishAssetsResponse;
import com.huaweicloud.sdk.vod.v1.model.ShowAssetCipherRequest;
import com.huaweicloud.sdk.vod.v1.model.ShowAssetCipherResponse;
import com.huaweicloud.sdk.vod.v1.model.ShowAssetDetailRequest;
import com.huaweicloud.sdk.vod.v1.model.ShowAssetDetailResponse;
import com.huaweicloud.sdk.vod.v1.model.ShowAssetMetaRequest;
import com.huaweicloud.sdk.vod.v1.model.ShowAssetMetaResponse;
import com.huaweicloud.sdk.vod.v1.model.ShowAssetTempAuthorityRequest;
import com.huaweicloud.sdk.vod.v1.model.ShowAssetTempAuthorityResponse;
import com.huaweicloud.sdk.vod.v1.model.ShowCdnStatisticsRequest;
import com.huaweicloud.sdk.vod.v1.model.ShowCdnStatisticsResponse;
import com.huaweicloud.sdk.vod.v1.model.ShowPreheatingAssetRequest;
import com.huaweicloud.sdk.vod.v1.model.ShowPreheatingAssetResponse;
import com.huaweicloud.sdk.vod.v1.model.ShowStorageModeTypeRequest;
import com.huaweicloud.sdk.vod.v1.model.ShowStorageModeTypeResponse;
import com.huaweicloud.sdk.vod.v1.model.ShowTakeOverAssetDetailsRequest;
import com.huaweicloud.sdk.vod.v1.model.ShowTakeOverAssetDetailsResponse;
import com.huaweicloud.sdk.vod.v1.model.ShowTakeOverTaskDetailsRequest;
import com.huaweicloud.sdk.vod.v1.model.ShowTakeOverTaskDetailsResponse;
import com.huaweicloud.sdk.vod.v1.model.ShowVodRetrievalRequest;
import com.huaweicloud.sdk.vod.v1.model.ShowVodRetrievalResponse;
import com.huaweicloud.sdk.vod.v1.model.ShowVodStatisticsRequest;
import com.huaweicloud.sdk.vod.v1.model.ShowVodStatisticsResponse;
import com.huaweicloud.sdk.vod.v1.model.UnpublishAssetsRequest;
import com.huaweicloud.sdk.vod.v1.model.UnpublishAssetsResponse;
import com.huaweicloud.sdk.vod.v1.model.UpdateAssetCategoryRequest;
import com.huaweicloud.sdk.vod.v1.model.UpdateAssetCategoryResponse;
import com.huaweicloud.sdk.vod.v1.model.UpdateAssetMetaRequest;
import com.huaweicloud.sdk.vod.v1.model.UpdateAssetMetaResponse;
import com.huaweicloud.sdk.vod.v1.model.UpdateAssetRequest;
import com.huaweicloud.sdk.vod.v1.model.UpdateAssetResponse;
import com.huaweicloud.sdk.vod.v1.model.UpdateBucketAuthorizedRequest;
import com.huaweicloud.sdk.vod.v1.model.UpdateBucketAuthorizedResponse;
import com.huaweicloud.sdk.vod.v1.model.UpdateCoverByThumbnailRequest;
import com.huaweicloud.sdk.vod.v1.model.UpdateCoverByThumbnailResponse;
import com.huaweicloud.sdk.vod.v1.model.UpdateStorageModeRequest;
import com.huaweicloud.sdk.vod.v1.model.UpdateStorageModeResponse;
import com.huaweicloud.sdk.vod.v1.model.UpdateStorageModeTypeRequest;
import com.huaweicloud.sdk.vod.v1.model.UpdateStorageModeTypeResponse;
import com.huaweicloud.sdk.vod.v1.model.UpdateTemplateGroupCollectionRequest;
import com.huaweicloud.sdk.vod.v1.model.UpdateTemplateGroupCollectionResponse;
import com.huaweicloud.sdk.vod.v1.model.UpdateTemplateGroupRequest;
import com.huaweicloud.sdk.vod.v1.model.UpdateTemplateGroupResponse;
import com.huaweicloud.sdk.vod.v1.model.UpdateTranscodeTemplateRequest;
import com.huaweicloud.sdk.vod.v1.model.UpdateTranscodeTemplateResponse;
import com.huaweicloud.sdk.vod.v1.model.UpdateWatermarkTemplateRequest;
import com.huaweicloud.sdk.vod.v1.model.UpdateWatermarkTemplateResponse;
import com.huaweicloud.sdk.vod.v1.model.UploadMetaDataByUrlRequest;
import com.huaweicloud.sdk.vod.v1.model.UploadMetaDataByUrlResponse;

import java.util.concurrent.CompletableFuture;

public class VodAsyncClient {

    protected HcClient hcClient;

    public VodAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VodAsyncClient> newBuilder() {
        ClientBuilder<VodAsyncClient> clientBuilder = new ClientBuilder<>(VodAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 取消媒资转码任务
     *
     * 取消媒资转码任务，只能取消排队中的转码任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelAssetTranscodeTaskRequest 请求对象
     * @return CompletableFuture<CancelAssetTranscodeTaskResponse>
     */
    public CompletableFuture<CancelAssetTranscodeTaskResponse> cancelAssetTranscodeTaskAsync(
        CancelAssetTranscodeTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.cancelAssetTranscodeTask);
    }

    /**
     * 取消媒资转码任务
     *
     * 取消媒资转码任务，只能取消排队中的转码任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelAssetTranscodeTaskRequest 请求对象
     * @return AsyncInvoker<CancelAssetTranscodeTaskRequest, CancelAssetTranscodeTaskResponse>
     */
    public AsyncInvoker<CancelAssetTranscodeTaskRequest, CancelAssetTranscodeTaskResponse> cancelAssetTranscodeTaskAsyncInvoker(
        CancelAssetTranscodeTaskRequest request) {
        return new AsyncInvoker<>(request, VodMeta.cancelAssetTranscodeTask, hcClient);
    }

    /**
     * 取消提取音频任务
     *
     * 取消提取音频任务，只有排队中的提取音频任务才可以取消。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelExtractAudioTaskRequest 请求对象
     * @return CompletableFuture<CancelExtractAudioTaskResponse>
     */
    public CompletableFuture<CancelExtractAudioTaskResponse> cancelExtractAudioTaskAsync(
        CancelExtractAudioTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.cancelExtractAudioTask);
    }

    /**
     * 取消提取音频任务
     *
     * 取消提取音频任务，只有排队中的提取音频任务才可以取消。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelExtractAudioTaskRequest 请求对象
     * @return AsyncInvoker<CancelExtractAudioTaskRequest, CancelExtractAudioTaskResponse>
     */
    public AsyncInvoker<CancelExtractAudioTaskRequest, CancelExtractAudioTaskResponse> cancelExtractAudioTaskAsyncInvoker(
        CancelExtractAudioTaskRequest request) {
        return new AsyncInvoker<>(request, VodMeta.cancelExtractAudioTask, hcClient);
    }

    /**
     * 上传检验
     *
     * 校验媒资文件是否已存储于视频点播服务中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckMd5DuplicationRequest 请求对象
     * @return CompletableFuture<CheckMd5DuplicationResponse>
     */
    public CompletableFuture<CheckMd5DuplicationResponse> checkMd5DuplicationAsync(CheckMd5DuplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.checkMd5Duplication);
    }

    /**
     * 上传检验
     *
     * 校验媒资文件是否已存储于视频点播服务中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckMd5DuplicationRequest 请求对象
     * @return AsyncInvoker<CheckMd5DuplicationRequest, CheckMd5DuplicationResponse>
     */
    public AsyncInvoker<CheckMd5DuplicationRequest, CheckMd5DuplicationResponse> checkMd5DuplicationAsyncInvoker(
        CheckMd5DuplicationRequest request) {
        return new AsyncInvoker<>(request, VodMeta.checkMd5Duplication, hcClient);
    }

    /**
     * 确认媒资上传
     *
     * 媒资分段上传完成后，需要调用此接口通知点播服务媒资上传的状态，表示媒资上传创建完成。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmAssetUploadRequest 请求对象
     * @return CompletableFuture<ConfirmAssetUploadResponse>
     */
    public CompletableFuture<ConfirmAssetUploadResponse> confirmAssetUploadAsync(ConfirmAssetUploadRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.confirmAssetUpload);
    }

    /**
     * 确认媒资上传
     *
     * 媒资分段上传完成后，需要调用此接口通知点播服务媒资上传的状态，表示媒资上传创建完成。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmAssetUploadRequest 请求对象
     * @return AsyncInvoker<ConfirmAssetUploadRequest, ConfirmAssetUploadResponse>
     */
    public AsyncInvoker<ConfirmAssetUploadRequest, ConfirmAssetUploadResponse> confirmAssetUploadAsyncInvoker(
        ConfirmAssetUploadRequest request) {
        return new AsyncInvoker<>(request, VodMeta.confirmAssetUpload, hcClient);
    }

    /**
     * 确认水印图片上传
     *
     * 确认水印图片上传状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmImageUploadRequest 请求对象
     * @return CompletableFuture<ConfirmImageUploadResponse>
     */
    public CompletableFuture<ConfirmImageUploadResponse> confirmImageUploadAsync(ConfirmImageUploadRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.confirmImageUpload);
    }

    /**
     * 确认水印图片上传
     *
     * 确认水印图片上传状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmImageUploadRequest 请求对象
     * @return AsyncInvoker<ConfirmImageUploadRequest, ConfirmImageUploadResponse>
     */
    public AsyncInvoker<ConfirmImageUploadRequest, ConfirmImageUploadResponse> confirmImageUploadAsyncInvoker(
        ConfirmImageUploadRequest request) {
        return new AsyncInvoker<>(request, VodMeta.confirmImageUpload, hcClient);
    }

    /**
     * 创建媒资：上传方式
     *
     * 调用该接口创建媒资时，需要将对应的媒资文件上传到点播服务的OBS桶中。
     * 
     * 若上传的单媒资文件大小小于20M，则可以直接用PUT方法对该接口返回的地址进行上传。具体使用方法请参考[示例1：媒资上传（20M以下）](https://support.huaweicloud.com/api-vod/vod_04_0195.html)。
     * 
     * 若上传的单个媒资大小大于20M，则需要进行二进制流分割后上传，该接口的具体使用方法请参考[示例2：媒资分段上传（20M以上）](https://support.huaweicloud.com/api-vod/vod_04_0216.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAssetByFileUploadRequest 请求对象
     * @return CompletableFuture<CreateAssetByFileUploadResponse>
     */
    public CompletableFuture<CreateAssetByFileUploadResponse> createAssetByFileUploadAsync(
        CreateAssetByFileUploadRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.createAssetByFileUpload);
    }

    /**
     * 创建媒资：上传方式
     *
     * 调用该接口创建媒资时，需要将对应的媒资文件上传到点播服务的OBS桶中。
     * 
     * 若上传的单媒资文件大小小于20M，则可以直接用PUT方法对该接口返回的地址进行上传。具体使用方法请参考[示例1：媒资上传（20M以下）](https://support.huaweicloud.com/api-vod/vod_04_0195.html)。
     * 
     * 若上传的单个媒资大小大于20M，则需要进行二进制流分割后上传，该接口的具体使用方法请参考[示例2：媒资分段上传（20M以上）](https://support.huaweicloud.com/api-vod/vod_04_0216.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAssetByFileUploadRequest 请求对象
     * @return AsyncInvoker<CreateAssetByFileUploadRequest, CreateAssetByFileUploadResponse>
     */
    public AsyncInvoker<CreateAssetByFileUploadRequest, CreateAssetByFileUploadResponse> createAssetByFileUploadAsyncInvoker(
        CreateAssetByFileUploadRequest request) {
        return new AsyncInvoker<>(request, VodMeta.createAssetByFileUpload, hcClient);
    }

    /**
     * 创建媒资分类
     *
     * 创建媒资分类。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAssetCategoryRequest 请求对象
     * @return CompletableFuture<CreateAssetCategoryResponse>
     */
    public CompletableFuture<CreateAssetCategoryResponse> createAssetCategoryAsync(CreateAssetCategoryRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.createAssetCategory);
    }

    /**
     * 创建媒资分类
     *
     * 创建媒资分类。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAssetCategoryRequest 请求对象
     * @return AsyncInvoker<CreateAssetCategoryRequest, CreateAssetCategoryResponse>
     */
    public AsyncInvoker<CreateAssetCategoryRequest, CreateAssetCategoryResponse> createAssetCategoryAsyncInvoker(
        CreateAssetCategoryRequest request) {
        return new AsyncInvoker<>(request, VodMeta.createAssetCategory, hcClient);
    }

    /**
     * 媒资处理
     *
     * 实现视频转码、截图、加密等处理。既可以同时启动多种操作，也可以只启动一种操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAssetProcessTaskRequest 请求对象
     * @return CompletableFuture<CreateAssetProcessTaskResponse>
     */
    public CompletableFuture<CreateAssetProcessTaskResponse> createAssetProcessTaskAsync(
        CreateAssetProcessTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.createAssetProcessTask);
    }

    /**
     * 媒资处理
     *
     * 实现视频转码、截图、加密等处理。既可以同时启动多种操作，也可以只启动一种操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAssetProcessTaskRequest 请求对象
     * @return AsyncInvoker<CreateAssetProcessTaskRequest, CreateAssetProcessTaskResponse>
     */
    public AsyncInvoker<CreateAssetProcessTaskRequest, CreateAssetProcessTaskResponse> createAssetProcessTaskAsyncInvoker(
        CreateAssetProcessTaskRequest request) {
        return new AsyncInvoker<>(request, VodMeta.createAssetProcessTask, hcClient);
    }

    /**
     * 创建审核媒资任务
     *
     * 对上传的媒资进行审核。审核后，可以调用[查询媒资详细信息](https://support.huaweicloud.com/api-vod/vod_04_0202.html)接口查看审核结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAssetReviewTaskRequest 请求对象
     * @return CompletableFuture<CreateAssetReviewTaskResponse>
     */
    public CompletableFuture<CreateAssetReviewTaskResponse> createAssetReviewTaskAsync(
        CreateAssetReviewTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.createAssetReviewTask);
    }

    /**
     * 创建审核媒资任务
     *
     * 对上传的媒资进行审核。审核后，可以调用[查询媒资详细信息](https://support.huaweicloud.com/api-vod/vod_04_0202.html)接口查看审核结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAssetReviewTaskRequest 请求对象
     * @return AsyncInvoker<CreateAssetReviewTaskRequest, CreateAssetReviewTaskResponse>
     */
    public AsyncInvoker<CreateAssetReviewTaskRequest, CreateAssetReviewTaskResponse> createAssetReviewTaskAsyncInvoker(
        CreateAssetReviewTaskRequest request) {
        return new AsyncInvoker<>(request, VodMeta.createAssetReviewTask, hcClient);
    }

    /**
     * 音频提取
     *
     * 本接口为异步接口，创建音频提取任务下发成功后会返回asset_id和提取的audio_asset_id，但此时音频提取任务并没有立即完成，可通过消息订阅界面配置的音频提取完成事件来获取音频提取任务完成与否。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateExtractAudioTaskRequest 请求对象
     * @return CompletableFuture<CreateExtractAudioTaskResponse>
     */
    public CompletableFuture<CreateExtractAudioTaskResponse> createExtractAudioTaskAsync(
        CreateExtractAudioTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.createExtractAudioTask);
    }

    /**
     * 音频提取
     *
     * 本接口为异步接口，创建音频提取任务下发成功后会返回asset_id和提取的audio_asset_id，但此时音频提取任务并没有立即完成，可通过消息订阅界面配置的音频提取完成事件来获取音频提取任务完成与否。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateExtractAudioTaskRequest 请求对象
     * @return AsyncInvoker<CreateExtractAudioTaskRequest, CreateExtractAudioTaskResponse>
     */
    public AsyncInvoker<CreateExtractAudioTaskRequest, CreateExtractAudioTaskResponse> createExtractAudioTaskAsyncInvoker(
        CreateExtractAudioTaskRequest request) {
        return new AsyncInvoker<>(request, VodMeta.createExtractAudioTask, hcClient);
    }

    /**
     * CDN预热
     *
     * 媒资发布后，可通过指定媒资ID或URL向CDN预热。用户初次请求时，将由CDN节点提供请求媒资，加快用户下载缓存时间，提高用户体验。单租户每天最多预热1000个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePreheatingAssetRequest 请求对象
     * @return CompletableFuture<CreatePreheatingAssetResponse>
     */
    public CompletableFuture<CreatePreheatingAssetResponse> createPreheatingAssetAsync(
        CreatePreheatingAssetRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.createPreheatingAsset);
    }

    /**
     * CDN预热
     *
     * 媒资发布后，可通过指定媒资ID或URL向CDN预热。用户初次请求时，将由CDN节点提供请求媒资，加快用户下载缓存时间，提高用户体验。单租户每天最多预热1000个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePreheatingAssetRequest 请求对象
     * @return AsyncInvoker<CreatePreheatingAssetRequest, CreatePreheatingAssetResponse>
     */
    public AsyncInvoker<CreatePreheatingAssetRequest, CreatePreheatingAssetResponse> createPreheatingAssetAsyncInvoker(
        CreatePreheatingAssetRequest request) {
        return new AsyncInvoker<>(request, VodMeta.createPreheatingAsset, hcClient);
    }

    /**
     * 创建媒资：OBS托管方式
     *
     * 通过存量托管的方式，将已存储在OBS桶中的音视频文件同步到点播服务。
     * 
     * OBS托管方式分为增量托管和存量托管，增量托管暂只支持通过视频点播控制台配置，配置后，若OBS有新增音视频文件，则会自动同步到点播服务中，具体请参见[增量托管](https://support.huaweicloud.com/usermanual-vod/vod010032.html)。两个托管方式都需要先将对应的OBS桶授权给点播服务，具体请参见[桶授权](https://support.huaweicloud.com/usermanual-vod/vod010031.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTakeOverTaskRequest 请求对象
     * @return CompletableFuture<CreateTakeOverTaskResponse>
     */
    public CompletableFuture<CreateTakeOverTaskResponse> createTakeOverTaskAsync(CreateTakeOverTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.createTakeOverTask);
    }

    /**
     * 创建媒资：OBS托管方式
     *
     * 通过存量托管的方式，将已存储在OBS桶中的音视频文件同步到点播服务。
     * 
     * OBS托管方式分为增量托管和存量托管，增量托管暂只支持通过视频点播控制台配置，配置后，若OBS有新增音视频文件，则会自动同步到点播服务中，具体请参见[增量托管](https://support.huaweicloud.com/usermanual-vod/vod010032.html)。两个托管方式都需要先将对应的OBS桶授权给点播服务，具体请参见[桶授权](https://support.huaweicloud.com/usermanual-vod/vod010031.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTakeOverTaskRequest 请求对象
     * @return AsyncInvoker<CreateTakeOverTaskRequest, CreateTakeOverTaskResponse>
     */
    public AsyncInvoker<CreateTakeOverTaskRequest, CreateTakeOverTaskResponse> createTakeOverTaskAsyncInvoker(
        CreateTakeOverTaskRequest request) {
        return new AsyncInvoker<>(request, VodMeta.createTakeOverTask, hcClient);
    }

    /**
     * 创建自定义转码模板组
     *
     * 创建自定义转码模板组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTemplateGroupRequest 请求对象
     * @return CompletableFuture<CreateTemplateGroupResponse>
     */
    public CompletableFuture<CreateTemplateGroupResponse> createTemplateGroupAsync(CreateTemplateGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.createTemplateGroup);
    }

    /**
     * 创建自定义转码模板组
     *
     * 创建自定义转码模板组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTemplateGroupRequest 请求对象
     * @return AsyncInvoker<CreateTemplateGroupRequest, CreateTemplateGroupResponse>
     */
    public AsyncInvoker<CreateTemplateGroupRequest, CreateTemplateGroupResponse> createTemplateGroupAsyncInvoker(
        CreateTemplateGroupRequest request) {
        return new AsyncInvoker<>(request, VodMeta.createTemplateGroup, hcClient);
    }

    /**
     * 创建转码模板组集合
     *
     * 创建转码模板组集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTemplateGroupCollectionRequest 请求对象
     * @return CompletableFuture<CreateTemplateGroupCollectionResponse>
     */
    public CompletableFuture<CreateTemplateGroupCollectionResponse> createTemplateGroupCollectionAsync(
        CreateTemplateGroupCollectionRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.createTemplateGroupCollection);
    }

    /**
     * 创建转码模板组集合
     *
     * 创建转码模板组集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTemplateGroupCollectionRequest 请求对象
     * @return AsyncInvoker<CreateTemplateGroupCollectionRequest, CreateTemplateGroupCollectionResponse>
     */
    public AsyncInvoker<CreateTemplateGroupCollectionRequest, CreateTemplateGroupCollectionResponse> createTemplateGroupCollectionAsyncInvoker(
        CreateTemplateGroupCollectionRequest request) {
        return new AsyncInvoker<>(request, VodMeta.createTemplateGroupCollection, hcClient);
    }

    /**
     * 创建自定义转码模板
     *
     * 创建自定义转码模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTranscodeTemplateRequest 请求对象
     * @return CompletableFuture<CreateTranscodeTemplateResponse>
     */
    public CompletableFuture<CreateTranscodeTemplateResponse> createTranscodeTemplateAsync(
        CreateTranscodeTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.createTranscodeTemplate);
    }

    /**
     * 创建自定义转码模板
     *
     * 创建自定义转码模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTranscodeTemplateRequest 请求对象
     * @return AsyncInvoker<CreateTranscodeTemplateRequest, CreateTranscodeTemplateResponse>
     */
    public AsyncInvoker<CreateTranscodeTemplateRequest, CreateTranscodeTemplateResponse> createTranscodeTemplateAsyncInvoker(
        CreateTranscodeTemplateRequest request) {
        return new AsyncInvoker<>(request, VodMeta.createTranscodeTemplate, hcClient);
    }

    /**
     * 创建水印模板
     *
     * 创建水印模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWatermarkTemplateRequest 请求对象
     * @return CompletableFuture<CreateWatermarkTemplateResponse>
     */
    public CompletableFuture<CreateWatermarkTemplateResponse> createWatermarkTemplateAsync(
        CreateWatermarkTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.createWatermarkTemplate);
    }

    /**
     * 创建水印模板
     *
     * 创建水印模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWatermarkTemplateRequest 请求对象
     * @return AsyncInvoker<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse>
     */
    public AsyncInvoker<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse> createWatermarkTemplateAsyncInvoker(
        CreateWatermarkTemplateRequest request) {
        return new AsyncInvoker<>(request, VodMeta.createWatermarkTemplate, hcClient);
    }

    /**
     * 删除媒资分类
     *
     * 删除媒资分类。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAssetCategoryRequest 请求对象
     * @return CompletableFuture<DeleteAssetCategoryResponse>
     */
    public CompletableFuture<DeleteAssetCategoryResponse> deleteAssetCategoryAsync(DeleteAssetCategoryRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.deleteAssetCategory);
    }

    /**
     * 删除媒资分类
     *
     * 删除媒资分类。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAssetCategoryRequest 请求对象
     * @return AsyncInvoker<DeleteAssetCategoryRequest, DeleteAssetCategoryResponse>
     */
    public AsyncInvoker<DeleteAssetCategoryRequest, DeleteAssetCategoryResponse> deleteAssetCategoryAsyncInvoker(
        DeleteAssetCategoryRequest request) {
        return new AsyncInvoker<>(request, VodMeta.deleteAssetCategory, hcClient);
    }

    /**
     * 删除媒资
     *
     * 删除媒资。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAssetsRequest 请求对象
     * @return CompletableFuture<DeleteAssetsResponse>
     */
    public CompletableFuture<DeleteAssetsResponse> deleteAssetsAsync(DeleteAssetsRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.deleteAssets);
    }

    /**
     * 删除媒资
     *
     * 删除媒资。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAssetsRequest 请求对象
     * @return AsyncInvoker<DeleteAssetsRequest, DeleteAssetsResponse>
     */
    public AsyncInvoker<DeleteAssetsRequest, DeleteAssetsResponse> deleteAssetsAsyncInvoker(
        DeleteAssetsRequest request) {
        return new AsyncInvoker<>(request, VodMeta.deleteAssets, hcClient);
    }

    /**
     * 删除自定义转码模板组
     *
     * 删除自定义转码模板组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTemplateGroupRequest 请求对象
     * @return CompletableFuture<DeleteTemplateGroupResponse>
     */
    public CompletableFuture<DeleteTemplateGroupResponse> deleteTemplateGroupAsync(DeleteTemplateGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.deleteTemplateGroup);
    }

    /**
     * 删除自定义转码模板组
     *
     * 删除自定义转码模板组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTemplateGroupRequest 请求对象
     * @return AsyncInvoker<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse>
     */
    public AsyncInvoker<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse> deleteTemplateGroupAsyncInvoker(
        DeleteTemplateGroupRequest request) {
        return new AsyncInvoker<>(request, VodMeta.deleteTemplateGroup, hcClient);
    }

    /**
     * 删除转码模板组集合
     *
     * 删除转码模板组集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTemplateGroupCollectionRequest 请求对象
     * @return CompletableFuture<DeleteTemplateGroupCollectionResponse>
     */
    public CompletableFuture<DeleteTemplateGroupCollectionResponse> deleteTemplateGroupCollectionAsync(
        DeleteTemplateGroupCollectionRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.deleteTemplateGroupCollection);
    }

    /**
     * 删除转码模板组集合
     *
     * 删除转码模板组集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTemplateGroupCollectionRequest 请求对象
     * @return AsyncInvoker<DeleteTemplateGroupCollectionRequest, DeleteTemplateGroupCollectionResponse>
     */
    public AsyncInvoker<DeleteTemplateGroupCollectionRequest, DeleteTemplateGroupCollectionResponse> deleteTemplateGroupCollectionAsyncInvoker(
        DeleteTemplateGroupCollectionRequest request) {
        return new AsyncInvoker<>(request, VodMeta.deleteTemplateGroupCollection, hcClient);
    }

    /**
     * 删除转码产物
     *
     * 删除转码产物。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTranscodeProductRequest 请求对象
     * @return CompletableFuture<DeleteTranscodeProductResponse>
     */
    public CompletableFuture<DeleteTranscodeProductResponse> deleteTranscodeProductAsync(
        DeleteTranscodeProductRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.deleteTranscodeProduct);
    }

    /**
     * 删除转码产物
     *
     * 删除转码产物。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTranscodeProductRequest 请求对象
     * @return AsyncInvoker<DeleteTranscodeProductRequest, DeleteTranscodeProductResponse>
     */
    public AsyncInvoker<DeleteTranscodeProductRequest, DeleteTranscodeProductResponse> deleteTranscodeProductAsyncInvoker(
        DeleteTranscodeProductRequest request) {
        return new AsyncInvoker<>(request, VodMeta.deleteTranscodeProduct, hcClient);
    }

    /**
     * 删除自定义模板
     *
     * 删除自定义模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTranscodeTemplateRequest 请求对象
     * @return CompletableFuture<DeleteTranscodeTemplateResponse>
     */
    public CompletableFuture<DeleteTranscodeTemplateResponse> deleteTranscodeTemplateAsync(
        DeleteTranscodeTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.deleteTranscodeTemplate);
    }

    /**
     * 删除自定义模板
     *
     * 删除自定义模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTranscodeTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteTranscodeTemplateRequest, DeleteTranscodeTemplateResponse>
     */
    public AsyncInvoker<DeleteTranscodeTemplateRequest, DeleteTranscodeTemplateResponse> deleteTranscodeTemplateAsyncInvoker(
        DeleteTranscodeTemplateRequest request) {
        return new AsyncInvoker<>(request, VodMeta.deleteTranscodeTemplate, hcClient);
    }

    /**
     * 删除水印模板
     *
     * 删除水印模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWatermarkTemplateRequest 请求对象
     * @return CompletableFuture<DeleteWatermarkTemplateResponse>
     */
    public CompletableFuture<DeleteWatermarkTemplateResponse> deleteWatermarkTemplateAsync(
        DeleteWatermarkTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.deleteWatermarkTemplate);
    }

    /**
     * 删除水印模板
     *
     * 删除水印模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWatermarkTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse>
     */
    public AsyncInvoker<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse> deleteWatermarkTemplateAsyncInvoker(
        DeleteWatermarkTemplateRequest request) {
        return new AsyncInvoker<>(request, VodMeta.deleteWatermarkTemplate, hcClient);
    }

    /**
     * 查询指定分类信息
     *
     * 查询指定分类信息，及其子分类（即下一级分类）的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssetCategoryRequest 请求对象
     * @return CompletableFuture<ListAssetCategoryResponse>
     */
    public CompletableFuture<ListAssetCategoryResponse> listAssetCategoryAsync(ListAssetCategoryRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.listAssetCategory);
    }

    /**
     * 查询指定分类信息
     *
     * 查询指定分类信息，及其子分类（即下一级分类）的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssetCategoryRequest 请求对象
     * @return AsyncInvoker<ListAssetCategoryRequest, ListAssetCategoryResponse>
     */
    public AsyncInvoker<ListAssetCategoryRequest, ListAssetCategoryResponse> listAssetCategoryAsyncInvoker(
        ListAssetCategoryRequest request) {
        return new AsyncInvoker<>(request, VodMeta.listAssetCategory, hcClient);
    }

    /**
     * 查询媒资日播放统计数据
     *
     * 查询媒资日播放统计数据。
     * 
     * 使用媒资日播放统计查询API前，需要先提交工单开通统计功能，才能触发统计任务。
     * 
     * 支持查询最近一年的播放统计数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssetDailySummaryLogRequest 请求对象
     * @return CompletableFuture<ListAssetDailySummaryLogResponse>
     */
    public CompletableFuture<ListAssetDailySummaryLogResponse> listAssetDailySummaryLogAsync(
        ListAssetDailySummaryLogRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.listAssetDailySummaryLog);
    }

    /**
     * 查询媒资日播放统计数据
     *
     * 查询媒资日播放统计数据。
     * 
     * 使用媒资日播放统计查询API前，需要先提交工单开通统计功能，才能触发统计任务。
     * 
     * 支持查询最近一年的播放统计数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssetDailySummaryLogRequest 请求对象
     * @return AsyncInvoker<ListAssetDailySummaryLogRequest, ListAssetDailySummaryLogResponse>
     */
    public AsyncInvoker<ListAssetDailySummaryLogRequest, ListAssetDailySummaryLogResponse> listAssetDailySummaryLogAsyncInvoker(
        ListAssetDailySummaryLogRequest request) {
        return new AsyncInvoker<>(request, VodMeta.listAssetDailySummaryLog, hcClient);
    }

    /**
     * 查询媒资列表
     *
     * 查询媒资列表，列表中的每一条记录包含媒资的概要信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssetListRequest 请求对象
     * @return CompletableFuture<ListAssetListResponse>
     */
    public CompletableFuture<ListAssetListResponse> listAssetListAsync(ListAssetListRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.listAssetList);
    }

    /**
     * 查询媒资列表
     *
     * 查询媒资列表，列表中的每一条记录包含媒资的概要信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssetListRequest 请求对象
     * @return AsyncInvoker<ListAssetListRequest, ListAssetListResponse>
     */
    public AsyncInvoker<ListAssetListRequest, ListAssetListResponse> listAssetListAsyncInvoker(
        ListAssetListRequest request) {
        return new AsyncInvoker<>(request, VodMeta.listAssetList, hcClient);
    }

    /**
     * 查询域名播放日志
     *
     * 查询指定点播域名某段时间内在CDN的相关日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainLogsRequest 请求对象
     * @return CompletableFuture<ListDomainLogsResponse>
     */
    public CompletableFuture<ListDomainLogsResponse> listDomainLogsAsync(ListDomainLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.listDomainLogs);
    }

    /**
     * 查询域名播放日志
     *
     * 查询指定点播域名某段时间内在CDN的相关日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainLogsRequest 请求对象
     * @return AsyncInvoker<ListDomainLogsRequest, ListDomainLogsResponse>
     */
    public AsyncInvoker<ListDomainLogsRequest, ListDomainLogsResponse> listDomainLogsAsyncInvoker(
        ListDomainLogsRequest request) {
        return new AsyncInvoker<>(request, VodMeta.listDomainLogs, hcClient);
    }

    /**
     * 查询转码模板组列表
     *
     * 查询转码模板组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplateGroupRequest 请求对象
     * @return CompletableFuture<ListTemplateGroupResponse>
     */
    public CompletableFuture<ListTemplateGroupResponse> listTemplateGroupAsync(ListTemplateGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.listTemplateGroup);
    }

    /**
     * 查询转码模板组列表
     *
     * 查询转码模板组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplateGroupRequest 请求对象
     * @return AsyncInvoker<ListTemplateGroupRequest, ListTemplateGroupResponse>
     */
    public AsyncInvoker<ListTemplateGroupRequest, ListTemplateGroupResponse> listTemplateGroupAsyncInvoker(
        ListTemplateGroupRequest request) {
        return new AsyncInvoker<>(request, VodMeta.listTemplateGroup, hcClient);
    }

    /**
     * 查询自定义模板组集合
     *
     * 查询转码模板组集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplateGroupCollectionRequest 请求对象
     * @return CompletableFuture<ListTemplateGroupCollectionResponse>
     */
    public CompletableFuture<ListTemplateGroupCollectionResponse> listTemplateGroupCollectionAsync(
        ListTemplateGroupCollectionRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.listTemplateGroupCollection);
    }

    /**
     * 查询自定义模板组集合
     *
     * 查询转码模板组集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplateGroupCollectionRequest 请求对象
     * @return AsyncInvoker<ListTemplateGroupCollectionRequest, ListTemplateGroupCollectionResponse>
     */
    public AsyncInvoker<ListTemplateGroupCollectionRequest, ListTemplateGroupCollectionResponse> listTemplateGroupCollectionAsyncInvoker(
        ListTemplateGroupCollectionRequest request) {
        return new AsyncInvoker<>(request, VodMeta.listTemplateGroupCollection, hcClient);
    }

    /**
     * 查询TopN媒资信息
     *
     * 查询指定域名在指定日期播放次数排名Top 100的媒资统计数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopStatisticsRequest 请求对象
     * @return CompletableFuture<ListTopStatisticsResponse>
     */
    public CompletableFuture<ListTopStatisticsResponse> listTopStatisticsAsync(ListTopStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.listTopStatistics);
    }

    /**
     * 查询TopN媒资信息
     *
     * 查询指定域名在指定日期播放次数排名Top 100的媒资统计数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopStatisticsRequest 请求对象
     * @return AsyncInvoker<ListTopStatisticsRequest, ListTopStatisticsResponse>
     */
    public AsyncInvoker<ListTopStatisticsRequest, ListTopStatisticsResponse> listTopStatisticsAsyncInvoker(
        ListTopStatisticsRequest request) {
        return new AsyncInvoker<>(request, VodMeta.listTopStatistics, hcClient);
    }

    /**
     * 查询转码模板列表
     *
     * 查询转码模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTranscodeTemplateRequest 请求对象
     * @return CompletableFuture<ListTranscodeTemplateResponse>
     */
    public CompletableFuture<ListTranscodeTemplateResponse> listTranscodeTemplateAsync(
        ListTranscodeTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.listTranscodeTemplate);
    }

    /**
     * 查询转码模板列表
     *
     * 查询转码模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTranscodeTemplateRequest 请求对象
     * @return AsyncInvoker<ListTranscodeTemplateRequest, ListTranscodeTemplateResponse>
     */
    public AsyncInvoker<ListTranscodeTemplateRequest, ListTranscodeTemplateResponse> listTranscodeTemplateAsyncInvoker(
        ListTranscodeTemplateRequest request) {
        return new AsyncInvoker<>(request, VodMeta.listTranscodeTemplate, hcClient);
    }

    /**
     * 查询水印列表
     *
     * 查询水印模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWatermarkTemplateRequest 请求对象
     * @return CompletableFuture<ListWatermarkTemplateResponse>
     */
    public CompletableFuture<ListWatermarkTemplateResponse> listWatermarkTemplateAsync(
        ListWatermarkTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.listWatermarkTemplate);
    }

    /**
     * 查询水印列表
     *
     * 查询水印模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWatermarkTemplateRequest 请求对象
     * @return AsyncInvoker<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse>
     */
    public AsyncInvoker<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse> listWatermarkTemplateAsyncInvoker(
        ListWatermarkTemplateRequest request) {
        return new AsyncInvoker<>(request, VodMeta.listWatermarkTemplate, hcClient);
    }

    /**
     * 多字幕封装
     *
     * 多字幕封装，仅支持 HLS VTT格式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifySubtitleRequest 请求对象
     * @return CompletableFuture<ModifySubtitleResponse>
     */
    public CompletableFuture<ModifySubtitleResponse> modifySubtitleAsync(ModifySubtitleRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.modifySubtitle);
    }

    /**
     * 多字幕封装
     *
     * 多字幕封装，仅支持 HLS VTT格式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifySubtitleRequest 请求对象
     * @return AsyncInvoker<ModifySubtitleRequest, ModifySubtitleResponse>
     */
    public AsyncInvoker<ModifySubtitleRequest, ModifySubtitleResponse> modifySubtitleAsyncInvoker(
        ModifySubtitleRequest request) {
        return new AsyncInvoker<>(request, VodMeta.modifySubtitle, hcClient);
    }

    /**
     * 创建媒资：OBS转存方式
     *
     * 若您在使用点播服务前，已经在OBS桶中存储了音视频文件，您可以使用该接口将存储在OBS桶中的音视频文件转存到点播服务中，使用点播服务的音视频管理功能。调用该接口前，您需要调用[桶授权](https://support.huaweicloud.com/api-vod/vod_04_0199.html)接口，将存储音视频文件的OBS桶授权给点播服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishAssetFromObsRequest 请求对象
     * @return CompletableFuture<PublishAssetFromObsResponse>
     */
    public CompletableFuture<PublishAssetFromObsResponse> publishAssetFromObsAsync(PublishAssetFromObsRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.publishAssetFromObs);
    }

    /**
     * 创建媒资：OBS转存方式
     *
     * 若您在使用点播服务前，已经在OBS桶中存储了音视频文件，您可以使用该接口将存储在OBS桶中的音视频文件转存到点播服务中，使用点播服务的音视频管理功能。调用该接口前，您需要调用[桶授权](https://support.huaweicloud.com/api-vod/vod_04_0199.html)接口，将存储音视频文件的OBS桶授权给点播服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishAssetFromObsRequest 请求对象
     * @return AsyncInvoker<PublishAssetFromObsRequest, PublishAssetFromObsResponse>
     */
    public AsyncInvoker<PublishAssetFromObsRequest, PublishAssetFromObsResponse> publishAssetFromObsAsyncInvoker(
        PublishAssetFromObsRequest request) {
        return new AsyncInvoker<>(request, VodMeta.publishAssetFromObs, hcClient);
    }

    /**
     * 媒资发布
     *
     * 将媒资设置为发布状态。支持批量发布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishAssetsRequest 请求对象
     * @return CompletableFuture<PublishAssetsResponse>
     */
    public CompletableFuture<PublishAssetsResponse> publishAssetsAsync(PublishAssetsRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.publishAssets);
    }

    /**
     * 媒资发布
     *
     * 将媒资设置为发布状态。支持批量发布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PublishAssetsRequest 请求对象
     * @return AsyncInvoker<PublishAssetsRequest, PublishAssetsResponse>
     */
    public AsyncInvoker<PublishAssetsRequest, PublishAssetsResponse> publishAssetsAsyncInvoker(
        PublishAssetsRequest request) {
        return new AsyncInvoker<>(request, VodMeta.publishAssets, hcClient);
    }

    /**
     * 密钥查询
     *
     * 终端播放HLS加密视频时，向租户管理系统请求密钥，租户管理系统先查询其本地有没有已缓存的密钥，没有时则调用此接口向VOD查询。该接口的具体使用场景请参见[通过HLS加密防止视频泄露](https://support.huaweicloud.com/bestpractice-vod/vod_10_0004.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssetCipherRequest 请求对象
     * @return CompletableFuture<ShowAssetCipherResponse>
     */
    public CompletableFuture<ShowAssetCipherResponse> showAssetCipherAsync(ShowAssetCipherRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.showAssetCipher);
    }

    /**
     * 密钥查询
     *
     * 终端播放HLS加密视频时，向租户管理系统请求密钥，租户管理系统先查询其本地有没有已缓存的密钥，没有时则调用此接口向VOD查询。该接口的具体使用场景请参见[通过HLS加密防止视频泄露](https://support.huaweicloud.com/bestpractice-vod/vod_10_0004.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssetCipherRequest 请求对象
     * @return AsyncInvoker<ShowAssetCipherRequest, ShowAssetCipherResponse>
     */
    public AsyncInvoker<ShowAssetCipherRequest, ShowAssetCipherResponse> showAssetCipherAsyncInvoker(
        ShowAssetCipherRequest request) {
        return new AsyncInvoker<>(request, VodMeta.showAssetCipher, hcClient);
    }

    /**
     * 查询指定媒资的详细信息
     *
     * 查询指定媒资的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssetDetailRequest 请求对象
     * @return CompletableFuture<ShowAssetDetailResponse>
     */
    public CompletableFuture<ShowAssetDetailResponse> showAssetDetailAsync(ShowAssetDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.showAssetDetail);
    }

    /**
     * 查询指定媒资的详细信息
     *
     * 查询指定媒资的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssetDetailRequest 请求对象
     * @return AsyncInvoker<ShowAssetDetailRequest, ShowAssetDetailResponse>
     */
    public AsyncInvoker<ShowAssetDetailRequest, ShowAssetDetailResponse> showAssetDetailAsyncInvoker(
        ShowAssetDetailRequest request) {
        return new AsyncInvoker<>(request, VodMeta.showAssetDetail, hcClient);
    }

    /**
     * 查询媒资信息
     *
     * 查询媒资信息，支持指定媒资ID、分类、状态、起止时间查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssetMetaRequest 请求对象
     * @return CompletableFuture<ShowAssetMetaResponse>
     */
    public CompletableFuture<ShowAssetMetaResponse> showAssetMetaAsync(ShowAssetMetaRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.showAssetMeta);
    }

    /**
     * 查询媒资信息
     *
     * 查询媒资信息，支持指定媒资ID、分类、状态、起止时间查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssetMetaRequest 请求对象
     * @return AsyncInvoker<ShowAssetMetaRequest, ShowAssetMetaResponse>
     */
    public AsyncInvoker<ShowAssetMetaRequest, ShowAssetMetaResponse> showAssetMetaAsyncInvoker(
        ShowAssetMetaRequest request) {
        return new AsyncInvoker<>(request, VodMeta.showAssetMeta, hcClient);
    }

    /**
     * 获取分段上传授权
     *
     * 客户端请求创建媒资时，如果媒资文件超过20MB，需采用分段的方式向OBS上传，在每次与OBS交互前，客户端需通过此接口获取到授权方可与OBS交互。
     * 
     * 该接口可以获取[初始化多段上传任务](https://support.huaweicloud.com/api-obs/obs_04_0098.html)、[上传段](https://support.huaweicloud.com/api-obs/obs_04_0099.html)、[合并段](https://support.huaweicloud.com/api-obs/obs_04_0102.html)、[列举已上传段](https://support.huaweicloud.com/api-obs/obs_04_0101.html)、[取消段合并](https://support.huaweicloud.com/api-obs/obs_04_0103.html)的带有临时授权的URL，用户需要根据OBS的接口文档配置相应请求的HTTP请求方法、请求头、请求体，然后请求对应的带有临时授权的URL。
     * 
     * 视频分段上传方式和OBS的接口文档保持一致，包括HTTP请求方法、请求头、请求体等各种入参，此接口的作用是为用户生成带有鉴权信息的URL（鉴权信息即query_str），用来替换OBS接口中对应的URL，临时给用户开通向点播服务的桶上传文件的权限。
     * 
     * 调用获取授权接口时需要传入bucket、object_key、http_verb，其中bucket和object_key是由[创建媒资：上传方式](https://support.huaweicloud.com/api-vod/vod_04_0196.html)接口中返回的响应体中的target字段获得的bucket和object，http_verb需要根据指定的操作选择。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssetTempAuthorityRequest 请求对象
     * @return CompletableFuture<ShowAssetTempAuthorityResponse>
     */
    public CompletableFuture<ShowAssetTempAuthorityResponse> showAssetTempAuthorityAsync(
        ShowAssetTempAuthorityRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.showAssetTempAuthority);
    }

    /**
     * 获取分段上传授权
     *
     * 客户端请求创建媒资时，如果媒资文件超过20MB，需采用分段的方式向OBS上传，在每次与OBS交互前，客户端需通过此接口获取到授权方可与OBS交互。
     * 
     * 该接口可以获取[初始化多段上传任务](https://support.huaweicloud.com/api-obs/obs_04_0098.html)、[上传段](https://support.huaweicloud.com/api-obs/obs_04_0099.html)、[合并段](https://support.huaweicloud.com/api-obs/obs_04_0102.html)、[列举已上传段](https://support.huaweicloud.com/api-obs/obs_04_0101.html)、[取消段合并](https://support.huaweicloud.com/api-obs/obs_04_0103.html)的带有临时授权的URL，用户需要根据OBS的接口文档配置相应请求的HTTP请求方法、请求头、请求体，然后请求对应的带有临时授权的URL。
     * 
     * 视频分段上传方式和OBS的接口文档保持一致，包括HTTP请求方法、请求头、请求体等各种入参，此接口的作用是为用户生成带有鉴权信息的URL（鉴权信息即query_str），用来替换OBS接口中对应的URL，临时给用户开通向点播服务的桶上传文件的权限。
     * 
     * 调用获取授权接口时需要传入bucket、object_key、http_verb，其中bucket和object_key是由[创建媒资：上传方式](https://support.huaweicloud.com/api-vod/vod_04_0196.html)接口中返回的响应体中的target字段获得的bucket和object，http_verb需要根据指定的操作选择。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssetTempAuthorityRequest 请求对象
     * @return AsyncInvoker<ShowAssetTempAuthorityRequest, ShowAssetTempAuthorityResponse>
     */
    public AsyncInvoker<ShowAssetTempAuthorityRequest, ShowAssetTempAuthorityResponse> showAssetTempAuthorityAsyncInvoker(
        ShowAssetTempAuthorityRequest request) {
        return new AsyncInvoker<>(request, VodMeta.showAssetTempAuthority, hcClient);
    }

    /**
     * 查询CDN统计信息
     *
     * 查询CDN的统计数据，包括流量、峰值带宽、请求总数、请求命中率、流量命中率。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCdnStatisticsRequest 请求对象
     * @return CompletableFuture<ShowCdnStatisticsResponse>
     */
    public CompletableFuture<ShowCdnStatisticsResponse> showCdnStatisticsAsync(ShowCdnStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.showCdnStatistics);
    }

    /**
     * 查询CDN统计信息
     *
     * 查询CDN的统计数据，包括流量、峰值带宽、请求总数、请求命中率、流量命中率。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCdnStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowCdnStatisticsRequest, ShowCdnStatisticsResponse>
     */
    public AsyncInvoker<ShowCdnStatisticsRequest, ShowCdnStatisticsResponse> showCdnStatisticsAsyncInvoker(
        ShowCdnStatisticsRequest request) {
        return new AsyncInvoker<>(request, VodMeta.showCdnStatistics, hcClient);
    }

    /**
     * 查询CDN预热
     *
     * 查询预热结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPreheatingAssetRequest 请求对象
     * @return CompletableFuture<ShowPreheatingAssetResponse>
     */
    public CompletableFuture<ShowPreheatingAssetResponse> showPreheatingAssetAsync(ShowPreheatingAssetRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.showPreheatingAsset);
    }

    /**
     * 查询CDN预热
     *
     * 查询预热结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPreheatingAssetRequest 请求对象
     * @return AsyncInvoker<ShowPreheatingAssetRequest, ShowPreheatingAssetResponse>
     */
    public AsyncInvoker<ShowPreheatingAssetRequest, ShowPreheatingAssetResponse> showPreheatingAssetAsyncInvoker(
        ShowPreheatingAssetRequest request) {
        return new AsyncInvoker<>(request, VodMeta.showPreheatingAsset, hcClient);
    }

    /**
     * 查询媒资降冷配置
     *
     * 查询媒资降冷配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStorageModeTypeRequest 请求对象
     * @return CompletableFuture<ShowStorageModeTypeResponse>
     */
    public CompletableFuture<ShowStorageModeTypeResponse> showStorageModeTypeAsync(ShowStorageModeTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.showStorageModeType);
    }

    /**
     * 查询媒资降冷配置
     *
     * 查询媒资降冷配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStorageModeTypeRequest 请求对象
     * @return AsyncInvoker<ShowStorageModeTypeRequest, ShowStorageModeTypeResponse>
     */
    public AsyncInvoker<ShowStorageModeTypeRequest, ShowStorageModeTypeResponse> showStorageModeTypeAsyncInvoker(
        ShowStorageModeTypeRequest request) {
        return new AsyncInvoker<>(request, VodMeta.showStorageModeType, hcClient);
    }

    /**
     * 查询取回数据信息
     *
     * ## 典型场景 ##
     *  用于查询点播低频和归档取回量统计数据。&lt;br/&gt;
     * 
     * ## 接口功能 ##
     *  用于查询点播低频和归档取回量统计数据。&lt;br/&gt;
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVodRetrievalRequest 请求对象
     * @return CompletableFuture<ShowVodRetrievalResponse>
     */
    public CompletableFuture<ShowVodRetrievalResponse> showVodRetrievalAsync(ShowVodRetrievalRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.showVodRetrieval);
    }

    /**
     * 查询取回数据信息
     *
     * ## 典型场景 ##
     *  用于查询点播低频和归档取回量统计数据。&lt;br/&gt;
     * 
     * ## 接口功能 ##
     *  用于查询点播低频和归档取回量统计数据。&lt;br/&gt;
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVodRetrievalRequest 请求对象
     * @return AsyncInvoker<ShowVodRetrievalRequest, ShowVodRetrievalResponse>
     */
    public AsyncInvoker<ShowVodRetrievalRequest, ShowVodRetrievalResponse> showVodRetrievalAsyncInvoker(
        ShowVodRetrievalRequest request) {
        return new AsyncInvoker<>(request, VodMeta.showVodRetrieval, hcClient);
    }

    /**
     * 查询源站统计信息
     *
     * 查询点播源站的统计数据，包括流量、存储空间、转码时长。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVodStatisticsRequest 请求对象
     * @return CompletableFuture<ShowVodStatisticsResponse>
     */
    public CompletableFuture<ShowVodStatisticsResponse> showVodStatisticsAsync(ShowVodStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.showVodStatistics);
    }

    /**
     * 查询源站统计信息
     *
     * 查询点播源站的统计数据，包括流量、存储空间、转码时长。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVodStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowVodStatisticsRequest, ShowVodStatisticsResponse>
     */
    public AsyncInvoker<ShowVodStatisticsRequest, ShowVodStatisticsResponse> showVodStatisticsAsyncInvoker(
        ShowVodStatisticsRequest request) {
        return new AsyncInvoker<>(request, VodMeta.showVodStatistics, hcClient);
    }

    /**
     * 媒资发布取消
     *
     * 将媒资设置为未发布状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnpublishAssetsRequest 请求对象
     * @return CompletableFuture<UnpublishAssetsResponse>
     */
    public CompletableFuture<UnpublishAssetsResponse> unpublishAssetsAsync(UnpublishAssetsRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.unpublishAssets);
    }

    /**
     * 媒资发布取消
     *
     * 将媒资设置为未发布状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnpublishAssetsRequest 请求对象
     * @return AsyncInvoker<UnpublishAssetsRequest, UnpublishAssetsResponse>
     */
    public AsyncInvoker<UnpublishAssetsRequest, UnpublishAssetsResponse> unpublishAssetsAsyncInvoker(
        UnpublishAssetsRequest request) {
        return new AsyncInvoker<>(request, VodMeta.unpublishAssets, hcClient);
    }

    /**
     * 视频更新
     *
     * 媒资创建后，单独上传封面、更新视频文件或更新已有封面。
     * 
     * 如果是更新视频文件，更新完后要通过[确认媒资上传](https://support.huaweicloud.com/api-vod/vod_04_0198.html)接口通知点播服务。
     * 
     * 如果是更新封面或单独上传封面，则不需通知。
     * 
     * 更新视频可以使用分段上传，具体方式可以参考[示例2：媒资分段上传（20M以上）](https://support.huaweicloud.com/api-vod/vod_04_0216.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAssetRequest 请求对象
     * @return CompletableFuture<UpdateAssetResponse>
     */
    public CompletableFuture<UpdateAssetResponse> updateAssetAsync(UpdateAssetRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.updateAsset);
    }

    /**
     * 视频更新
     *
     * 媒资创建后，单独上传封面、更新视频文件或更新已有封面。
     * 
     * 如果是更新视频文件，更新完后要通过[确认媒资上传](https://support.huaweicloud.com/api-vod/vod_04_0198.html)接口通知点播服务。
     * 
     * 如果是更新封面或单独上传封面，则不需通知。
     * 
     * 更新视频可以使用分段上传，具体方式可以参考[示例2：媒资分段上传（20M以上）](https://support.huaweicloud.com/api-vod/vod_04_0216.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAssetRequest 请求对象
     * @return AsyncInvoker<UpdateAssetRequest, UpdateAssetResponse>
     */
    public AsyncInvoker<UpdateAssetRequest, UpdateAssetResponse> updateAssetAsyncInvoker(UpdateAssetRequest request) {
        return new AsyncInvoker<>(request, VodMeta.updateAsset, hcClient);
    }

    /**
     * 修改媒资分类
     *
     * 修改媒资分类。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAssetCategoryRequest 请求对象
     * @return CompletableFuture<UpdateAssetCategoryResponse>
     */
    public CompletableFuture<UpdateAssetCategoryResponse> updateAssetCategoryAsync(UpdateAssetCategoryRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.updateAssetCategory);
    }

    /**
     * 修改媒资分类
     *
     * 修改媒资分类。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAssetCategoryRequest 请求对象
     * @return AsyncInvoker<UpdateAssetCategoryRequest, UpdateAssetCategoryResponse>
     */
    public AsyncInvoker<UpdateAssetCategoryRequest, UpdateAssetCategoryResponse> updateAssetCategoryAsyncInvoker(
        UpdateAssetCategoryRequest request) {
        return new AsyncInvoker<>(request, VodMeta.updateAssetCategory, hcClient);
    }

    /**
     * 修改媒资属性
     *
     * 修改媒资属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAssetMetaRequest 请求对象
     * @return CompletableFuture<UpdateAssetMetaResponse>
     */
    public CompletableFuture<UpdateAssetMetaResponse> updateAssetMetaAsync(UpdateAssetMetaRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.updateAssetMeta);
    }

    /**
     * 修改媒资属性
     *
     * 修改媒资属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAssetMetaRequest 请求对象
     * @return AsyncInvoker<UpdateAssetMetaRequest, UpdateAssetMetaResponse>
     */
    public AsyncInvoker<UpdateAssetMetaRequest, UpdateAssetMetaResponse> updateAssetMetaAsyncInvoker(
        UpdateAssetMetaRequest request) {
        return new AsyncInvoker<>(request, VodMeta.updateAssetMeta, hcClient);
    }

    /**
     * 桶授权
     *
     * 用户可以通过该接口将OBS桶授权给点播服务或取消点播服务的授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBucketAuthorizedRequest 请求对象
     * @return CompletableFuture<UpdateBucketAuthorizedResponse>
     */
    public CompletableFuture<UpdateBucketAuthorizedResponse> updateBucketAuthorizedAsync(
        UpdateBucketAuthorizedRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.updateBucketAuthorized);
    }

    /**
     * 桶授权
     *
     * 用户可以通过该接口将OBS桶授权给点播服务或取消点播服务的授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBucketAuthorizedRequest 请求对象
     * @return AsyncInvoker<UpdateBucketAuthorizedRequest, UpdateBucketAuthorizedResponse>
     */
    public AsyncInvoker<UpdateBucketAuthorizedRequest, UpdateBucketAuthorizedResponse> updateBucketAuthorizedAsyncInvoker(
        UpdateBucketAuthorizedRequest request) {
        return new AsyncInvoker<>(request, VodMeta.updateBucketAuthorized, hcClient);
    }

    /**
     * 设置封面
     *
     * 将视频截图生成的某张图片设置成封面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCoverByThumbnailRequest 请求对象
     * @return CompletableFuture<UpdateCoverByThumbnailResponse>
     */
    public CompletableFuture<UpdateCoverByThumbnailResponse> updateCoverByThumbnailAsync(
        UpdateCoverByThumbnailRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.updateCoverByThumbnail);
    }

    /**
     * 设置封面
     *
     * 将视频截图生成的某张图片设置成封面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCoverByThumbnailRequest 请求对象
     * @return AsyncInvoker<UpdateCoverByThumbnailRequest, UpdateCoverByThumbnailResponse>
     */
    public AsyncInvoker<UpdateCoverByThumbnailRequest, UpdateCoverByThumbnailResponse> updateCoverByThumbnailAsyncInvoker(
        UpdateCoverByThumbnailRequest request) {
        return new AsyncInvoker<>(request, VodMeta.updateCoverByThumbnail, hcClient);
    }

    /**
     * 修改媒资文件在obs的存储模式
     *
     * ## 接口功能 ##
     *   修改媒资文件在obs的存储模式&lt;br/&gt;
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStorageModeRequest 请求对象
     * @return CompletableFuture<UpdateStorageModeResponse>
     */
    public CompletableFuture<UpdateStorageModeResponse> updateStorageModeAsync(UpdateStorageModeRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.updateStorageMode);
    }

    /**
     * 修改媒资文件在obs的存储模式
     *
     * ## 接口功能 ##
     *   修改媒资文件在obs的存储模式&lt;br/&gt;
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStorageModeRequest 请求对象
     * @return AsyncInvoker<UpdateStorageModeRequest, UpdateStorageModeResponse>
     */
    public AsyncInvoker<UpdateStorageModeRequest, UpdateStorageModeResponse> updateStorageModeAsyncInvoker(
        UpdateStorageModeRequest request) {
        return new AsyncInvoker<>(request, VodMeta.updateStorageMode, hcClient);
    }

    /**
     * 修改媒资降冷粒度
     *
     * 修改媒资降冷粒度。
     * 
     * 默认为整个媒资粒度，支持转为仅原文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStorageModeTypeRequest 请求对象
     * @return CompletableFuture<UpdateStorageModeTypeResponse>
     */
    public CompletableFuture<UpdateStorageModeTypeResponse> updateStorageModeTypeAsync(
        UpdateStorageModeTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.updateStorageModeType);
    }

    /**
     * 修改媒资降冷粒度
     *
     * 修改媒资降冷粒度。
     * 
     * 默认为整个媒资粒度，支持转为仅原文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStorageModeTypeRequest 请求对象
     * @return AsyncInvoker<UpdateStorageModeTypeRequest, UpdateStorageModeTypeResponse>
     */
    public AsyncInvoker<UpdateStorageModeTypeRequest, UpdateStorageModeTypeResponse> updateStorageModeTypeAsyncInvoker(
        UpdateStorageModeTypeRequest request) {
        return new AsyncInvoker<>(request, VodMeta.updateStorageModeType, hcClient);
    }

    /**
     * 修改自定义转码模板组
     *
     * 修改自定义转码模板组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTemplateGroupRequest 请求对象
     * @return CompletableFuture<UpdateTemplateGroupResponse>
     */
    public CompletableFuture<UpdateTemplateGroupResponse> updateTemplateGroupAsync(UpdateTemplateGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.updateTemplateGroup);
    }

    /**
     * 修改自定义转码模板组
     *
     * 修改自定义转码模板组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTemplateGroupRequest 请求对象
     * @return AsyncInvoker<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse>
     */
    public AsyncInvoker<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse> updateTemplateGroupAsyncInvoker(
        UpdateTemplateGroupRequest request) {
        return new AsyncInvoker<>(request, VodMeta.updateTemplateGroup, hcClient);
    }

    /**
     * 修改转码模板组集合
     *
     * 修改转码模板组结合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTemplateGroupCollectionRequest 请求对象
     * @return CompletableFuture<UpdateTemplateGroupCollectionResponse>
     */
    public CompletableFuture<UpdateTemplateGroupCollectionResponse> updateTemplateGroupCollectionAsync(
        UpdateTemplateGroupCollectionRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.updateTemplateGroupCollection);
    }

    /**
     * 修改转码模板组集合
     *
     * 修改转码模板组结合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTemplateGroupCollectionRequest 请求对象
     * @return AsyncInvoker<UpdateTemplateGroupCollectionRequest, UpdateTemplateGroupCollectionResponse>
     */
    public AsyncInvoker<UpdateTemplateGroupCollectionRequest, UpdateTemplateGroupCollectionResponse> updateTemplateGroupCollectionAsyncInvoker(
        UpdateTemplateGroupCollectionRequest request) {
        return new AsyncInvoker<>(request, VodMeta.updateTemplateGroupCollection, hcClient);
    }

    /**
     * 修改转码模板
     *
     * 修改转码模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTranscodeTemplateRequest 请求对象
     * @return CompletableFuture<UpdateTranscodeTemplateResponse>
     */
    public CompletableFuture<UpdateTranscodeTemplateResponse> updateTranscodeTemplateAsync(
        UpdateTranscodeTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.updateTranscodeTemplate);
    }

    /**
     * 修改转码模板
     *
     * 修改转码模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTranscodeTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateTranscodeTemplateRequest, UpdateTranscodeTemplateResponse>
     */
    public AsyncInvoker<UpdateTranscodeTemplateRequest, UpdateTranscodeTemplateResponse> updateTranscodeTemplateAsyncInvoker(
        UpdateTranscodeTemplateRequest request) {
        return new AsyncInvoker<>(request, VodMeta.updateTranscodeTemplate, hcClient);
    }

    /**
     * 修改水印模板
     *
     * 修改水印模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWatermarkTemplateRequest 请求对象
     * @return CompletableFuture<UpdateWatermarkTemplateResponse>
     */
    public CompletableFuture<UpdateWatermarkTemplateResponse> updateWatermarkTemplateAsync(
        UpdateWatermarkTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.updateWatermarkTemplate);
    }

    /**
     * 修改水印模板
     *
     * 修改水印模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWatermarkTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse>
     */
    public AsyncInvoker<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse> updateWatermarkTemplateAsyncInvoker(
        UpdateWatermarkTemplateRequest request) {
        return new AsyncInvoker<>(request, VodMeta.updateWatermarkTemplate, hcClient);
    }

    /**
     * 创建媒资：URL拉取注入
     *
     * 基于音视频源文件URL，将音视频文件离线拉取上传到点播服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadMetaDataByUrlRequest 请求对象
     * @return CompletableFuture<UploadMetaDataByUrlResponse>
     */
    public CompletableFuture<UploadMetaDataByUrlResponse> uploadMetaDataByUrlAsync(UploadMetaDataByUrlRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.uploadMetaDataByUrl);
    }

    /**
     * 创建媒资：URL拉取注入
     *
     * 基于音视频源文件URL，将音视频文件离线拉取上传到点播服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadMetaDataByUrlRequest 请求对象
     * @return AsyncInvoker<UploadMetaDataByUrlRequest, UploadMetaDataByUrlResponse>
     */
    public AsyncInvoker<UploadMetaDataByUrlRequest, UploadMetaDataByUrlResponse> uploadMetaDataByUrlAsyncInvoker(
        UploadMetaDataByUrlRequest request) {
        return new AsyncInvoker<>(request, VodMeta.uploadMetaDataByUrl, hcClient);
    }

    /**
     * 查询托管任务
     *
     * 查询OBS存量托管任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTakeOverTaskRequest 请求对象
     * @return CompletableFuture<ListTakeOverTaskResponse>
     */
    public CompletableFuture<ListTakeOverTaskResponse> listTakeOverTaskAsync(ListTakeOverTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.listTakeOverTask);
    }

    /**
     * 查询托管任务
     *
     * 查询OBS存量托管任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTakeOverTaskRequest 请求对象
     * @return AsyncInvoker<ListTakeOverTaskRequest, ListTakeOverTaskResponse>
     */
    public AsyncInvoker<ListTakeOverTaskRequest, ListTakeOverTaskResponse> listTakeOverTaskAsyncInvoker(
        ListTakeOverTaskRequest request) {
        return new AsyncInvoker<>(request, VodMeta.listTakeOverTask, hcClient);
    }

    /**
     * 查询托管媒资详情
     *
     * 查询OBS托管媒资的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTakeOverAssetDetailsRequest 请求对象
     * @return CompletableFuture<ShowTakeOverAssetDetailsResponse>
     */
    public CompletableFuture<ShowTakeOverAssetDetailsResponse> showTakeOverAssetDetailsAsync(
        ShowTakeOverAssetDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.showTakeOverAssetDetails);
    }

    /**
     * 查询托管媒资详情
     *
     * 查询OBS托管媒资的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTakeOverAssetDetailsRequest 请求对象
     * @return AsyncInvoker<ShowTakeOverAssetDetailsRequest, ShowTakeOverAssetDetailsResponse>
     */
    public AsyncInvoker<ShowTakeOverAssetDetailsRequest, ShowTakeOverAssetDetailsResponse> showTakeOverAssetDetailsAsyncInvoker(
        ShowTakeOverAssetDetailsRequest request) {
        return new AsyncInvoker<>(request, VodMeta.showTakeOverAssetDetails, hcClient);
    }

    /**
     * 查询托管任务详情
     *
     * 查询OBS存量托管任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTakeOverTaskDetailsRequest 请求对象
     * @return CompletableFuture<ShowTakeOverTaskDetailsResponse>
     */
    public CompletableFuture<ShowTakeOverTaskDetailsResponse> showTakeOverTaskDetailsAsync(
        ShowTakeOverTaskDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.showTakeOverTaskDetails);
    }

    /**
     * 查询托管任务详情
     *
     * 查询OBS存量托管任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTakeOverTaskDetailsRequest 请求对象
     * @return AsyncInvoker<ShowTakeOverTaskDetailsRequest, ShowTakeOverTaskDetailsResponse>
     */
    public AsyncInvoker<ShowTakeOverTaskDetailsRequest, ShowTakeOverTaskDetailsResponse> showTakeOverTaskDetailsAsyncInvoker(
        ShowTakeOverTaskDetailsRequest request) {
        return new AsyncInvoker<>(request, VodMeta.showTakeOverTaskDetails, hcClient);
    }

}

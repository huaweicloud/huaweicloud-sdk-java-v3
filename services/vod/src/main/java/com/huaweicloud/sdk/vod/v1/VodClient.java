package com.huaweicloud.sdk.vod.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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

public class VodClient {

    protected HcClient hcClient;

    public VodClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VodClient> newBuilder() {
        ClientBuilder<VodClient> clientBuilder = new ClientBuilder<>(VodClient::new);
        return clientBuilder;
    }

    /**
     * 取消媒资转码任务
     *
     * 取消媒资转码任务，只能取消排队中的转码任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelAssetTranscodeTaskRequest 请求对象
     * @return CancelAssetTranscodeTaskResponse
     */
    public CancelAssetTranscodeTaskResponse cancelAssetTranscodeTask(CancelAssetTranscodeTaskRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.cancelAssetTranscodeTask);
    }

    /**
     * 取消媒资转码任务
     *
     * 取消媒资转码任务，只能取消排队中的转码任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelAssetTranscodeTaskRequest 请求对象
     * @return SyncInvoker<CancelAssetTranscodeTaskRequest, CancelAssetTranscodeTaskResponse>
     */
    public SyncInvoker<CancelAssetTranscodeTaskRequest, CancelAssetTranscodeTaskResponse> cancelAssetTranscodeTaskInvoker(
        CancelAssetTranscodeTaskRequest request) {
        return new SyncInvoker<CancelAssetTranscodeTaskRequest, CancelAssetTranscodeTaskResponse>(request,
            VodMeta.cancelAssetTranscodeTask, hcClient);
    }

    /**
     * 取消提取音频任务
     *
     * 取消提取音频任务，只有排队中的提取音频任务才可以取消。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelExtractAudioTaskRequest 请求对象
     * @return CancelExtractAudioTaskResponse
     */
    public CancelExtractAudioTaskResponse cancelExtractAudioTask(CancelExtractAudioTaskRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.cancelExtractAudioTask);
    }

    /**
     * 取消提取音频任务
     *
     * 取消提取音频任务，只有排队中的提取音频任务才可以取消。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelExtractAudioTaskRequest 请求对象
     * @return SyncInvoker<CancelExtractAudioTaskRequest, CancelExtractAudioTaskResponse>
     */
    public SyncInvoker<CancelExtractAudioTaskRequest, CancelExtractAudioTaskResponse> cancelExtractAudioTaskInvoker(
        CancelExtractAudioTaskRequest request) {
        return new SyncInvoker<CancelExtractAudioTaskRequest, CancelExtractAudioTaskResponse>(request,
            VodMeta.cancelExtractAudioTask, hcClient);
    }

    /**
     * 上传检验
     *
     * 校验媒资文件是否已存储于视频点播服务中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckMd5DuplicationRequest 请求对象
     * @return CheckMd5DuplicationResponse
     */
    public CheckMd5DuplicationResponse checkMd5Duplication(CheckMd5DuplicationRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.checkMd5Duplication);
    }

    /**
     * 上传检验
     *
     * 校验媒资文件是否已存储于视频点播服务中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckMd5DuplicationRequest 请求对象
     * @return SyncInvoker<CheckMd5DuplicationRequest, CheckMd5DuplicationResponse>
     */
    public SyncInvoker<CheckMd5DuplicationRequest, CheckMd5DuplicationResponse> checkMd5DuplicationInvoker(
        CheckMd5DuplicationRequest request) {
        return new SyncInvoker<CheckMd5DuplicationRequest, CheckMd5DuplicationResponse>(request,
            VodMeta.checkMd5Duplication, hcClient);
    }

    /**
     * 确认媒资上传
     *
     * 媒资分段上传完成后，需要调用此接口通知点播服务媒资上传的状态，表示媒资上传创建完成。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ConfirmAssetUploadRequest 请求对象
     * @return ConfirmAssetUploadResponse
     */
    public ConfirmAssetUploadResponse confirmAssetUpload(ConfirmAssetUploadRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.confirmAssetUpload);
    }

    /**
     * 确认媒资上传
     *
     * 媒资分段上传完成后，需要调用此接口通知点播服务媒资上传的状态，表示媒资上传创建完成。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ConfirmAssetUploadRequest 请求对象
     * @return SyncInvoker<ConfirmAssetUploadRequest, ConfirmAssetUploadResponse>
     */
    public SyncInvoker<ConfirmAssetUploadRequest, ConfirmAssetUploadResponse> confirmAssetUploadInvoker(
        ConfirmAssetUploadRequest request) {
        return new SyncInvoker<ConfirmAssetUploadRequest, ConfirmAssetUploadResponse>(request,
            VodMeta.confirmAssetUpload, hcClient);
    }

    /**
     * 确认水印图片上传
     *
     * 确认水印图片上传状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ConfirmImageUploadRequest 请求对象
     * @return ConfirmImageUploadResponse
     */
    public ConfirmImageUploadResponse confirmImageUpload(ConfirmImageUploadRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.confirmImageUpload);
    }

    /**
     * 确认水印图片上传
     *
     * 确认水印图片上传状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ConfirmImageUploadRequest 请求对象
     * @return SyncInvoker<ConfirmImageUploadRequest, ConfirmImageUploadResponse>
     */
    public SyncInvoker<ConfirmImageUploadRequest, ConfirmImageUploadResponse> confirmImageUploadInvoker(
        ConfirmImageUploadRequest request) {
        return new SyncInvoker<ConfirmImageUploadRequest, ConfirmImageUploadResponse>(request,
            VodMeta.confirmImageUpload, hcClient);
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
     * @param CreateAssetByFileUploadRequest 请求对象
     * @return CreateAssetByFileUploadResponse
     */
    public CreateAssetByFileUploadResponse createAssetByFileUpload(CreateAssetByFileUploadRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.createAssetByFileUpload);
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
     * @param CreateAssetByFileUploadRequest 请求对象
     * @return SyncInvoker<CreateAssetByFileUploadRequest, CreateAssetByFileUploadResponse>
     */
    public SyncInvoker<CreateAssetByFileUploadRequest, CreateAssetByFileUploadResponse> createAssetByFileUploadInvoker(
        CreateAssetByFileUploadRequest request) {
        return new SyncInvoker<CreateAssetByFileUploadRequest, CreateAssetByFileUploadResponse>(request,
            VodMeta.createAssetByFileUpload, hcClient);
    }

    /**
     * 创建媒资分类
     *
     * 创建媒资分类。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAssetCategoryRequest 请求对象
     * @return CreateAssetCategoryResponse
     */
    public CreateAssetCategoryResponse createAssetCategory(CreateAssetCategoryRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.createAssetCategory);
    }

    /**
     * 创建媒资分类
     *
     * 创建媒资分类。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAssetCategoryRequest 请求对象
     * @return SyncInvoker<CreateAssetCategoryRequest, CreateAssetCategoryResponse>
     */
    public SyncInvoker<CreateAssetCategoryRequest, CreateAssetCategoryResponse> createAssetCategoryInvoker(
        CreateAssetCategoryRequest request) {
        return new SyncInvoker<CreateAssetCategoryRequest, CreateAssetCategoryResponse>(request,
            VodMeta.createAssetCategory, hcClient);
    }

    /**
     * 媒资处理
     *
     * 实现视频转码、截图、加密等处理。既可以同时启动多种操作，也可以只启动一种操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAssetProcessTaskRequest 请求对象
     * @return CreateAssetProcessTaskResponse
     */
    public CreateAssetProcessTaskResponse createAssetProcessTask(CreateAssetProcessTaskRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.createAssetProcessTask);
    }

    /**
     * 媒资处理
     *
     * 实现视频转码、截图、加密等处理。既可以同时启动多种操作，也可以只启动一种操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAssetProcessTaskRequest 请求对象
     * @return SyncInvoker<CreateAssetProcessTaskRequest, CreateAssetProcessTaskResponse>
     */
    public SyncInvoker<CreateAssetProcessTaskRequest, CreateAssetProcessTaskResponse> createAssetProcessTaskInvoker(
        CreateAssetProcessTaskRequest request) {
        return new SyncInvoker<CreateAssetProcessTaskRequest, CreateAssetProcessTaskResponse>(request,
            VodMeta.createAssetProcessTask, hcClient);
    }

    /**
     * 创建审核媒资任务
     *
     * 对上传的媒资进行审核。审核后，可以调用[查询媒资详细信息](https://support.huaweicloud.com/api-vod/vod_04_0202.html)接口查看审核结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAssetReviewTaskRequest 请求对象
     * @return CreateAssetReviewTaskResponse
     */
    public CreateAssetReviewTaskResponse createAssetReviewTask(CreateAssetReviewTaskRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.createAssetReviewTask);
    }

    /**
     * 创建审核媒资任务
     *
     * 对上传的媒资进行审核。审核后，可以调用[查询媒资详细信息](https://support.huaweicloud.com/api-vod/vod_04_0202.html)接口查看审核结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAssetReviewTaskRequest 请求对象
     * @return SyncInvoker<CreateAssetReviewTaskRequest, CreateAssetReviewTaskResponse>
     */
    public SyncInvoker<CreateAssetReviewTaskRequest, CreateAssetReviewTaskResponse> createAssetReviewTaskInvoker(
        CreateAssetReviewTaskRequest request) {
        return new SyncInvoker<CreateAssetReviewTaskRequest, CreateAssetReviewTaskResponse>(request,
            VodMeta.createAssetReviewTask, hcClient);
    }

    /**
     * 音频提取
     *
     * 本接口为异步接口，创建音频提取任务下发成功后会返回asset_id和提取的audio_asset_id，但此时音频提取任务并没有立即完成，可通过消息订阅界面配置的音频提取完成事件来获取音频提取任务完成与否。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateExtractAudioTaskRequest 请求对象
     * @return CreateExtractAudioTaskResponse
     */
    public CreateExtractAudioTaskResponse createExtractAudioTask(CreateExtractAudioTaskRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.createExtractAudioTask);
    }

    /**
     * 音频提取
     *
     * 本接口为异步接口，创建音频提取任务下发成功后会返回asset_id和提取的audio_asset_id，但此时音频提取任务并没有立即完成，可通过消息订阅界面配置的音频提取完成事件来获取音频提取任务完成与否。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateExtractAudioTaskRequest 请求对象
     * @return SyncInvoker<CreateExtractAudioTaskRequest, CreateExtractAudioTaskResponse>
     */
    public SyncInvoker<CreateExtractAudioTaskRequest, CreateExtractAudioTaskResponse> createExtractAudioTaskInvoker(
        CreateExtractAudioTaskRequest request) {
        return new SyncInvoker<CreateExtractAudioTaskRequest, CreateExtractAudioTaskResponse>(request,
            VodMeta.createExtractAudioTask, hcClient);
    }

    /**
     * CDN预热
     *
     * 媒资发布后，可通过指定媒资ID或URL向CDN预热。用户初次请求时，将由CDN节点提供请求媒资，加快用户下载缓存时间，提高用户体验。单租户每天最多预热1000个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePreheatingAssetRequest 请求对象
     * @return CreatePreheatingAssetResponse
     */
    public CreatePreheatingAssetResponse createPreheatingAsset(CreatePreheatingAssetRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.createPreheatingAsset);
    }

    /**
     * CDN预热
     *
     * 媒资发布后，可通过指定媒资ID或URL向CDN预热。用户初次请求时，将由CDN节点提供请求媒资，加快用户下载缓存时间，提高用户体验。单租户每天最多预热1000个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePreheatingAssetRequest 请求对象
     * @return SyncInvoker<CreatePreheatingAssetRequest, CreatePreheatingAssetResponse>
     */
    public SyncInvoker<CreatePreheatingAssetRequest, CreatePreheatingAssetResponse> createPreheatingAssetInvoker(
        CreatePreheatingAssetRequest request) {
        return new SyncInvoker<CreatePreheatingAssetRequest, CreatePreheatingAssetResponse>(request,
            VodMeta.createPreheatingAsset, hcClient);
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
     * @param CreateTakeOverTaskRequest 请求对象
     * @return CreateTakeOverTaskResponse
     */
    public CreateTakeOverTaskResponse createTakeOverTask(CreateTakeOverTaskRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.createTakeOverTask);
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
     * @param CreateTakeOverTaskRequest 请求对象
     * @return SyncInvoker<CreateTakeOverTaskRequest, CreateTakeOverTaskResponse>
     */
    public SyncInvoker<CreateTakeOverTaskRequest, CreateTakeOverTaskResponse> createTakeOverTaskInvoker(
        CreateTakeOverTaskRequest request) {
        return new SyncInvoker<CreateTakeOverTaskRequest, CreateTakeOverTaskResponse>(request,
            VodMeta.createTakeOverTask, hcClient);
    }

    /**
     * 创建自定义转码模板组
     *
     * 创建自定义转码模板组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTemplateGroupRequest 请求对象
     * @return CreateTemplateGroupResponse
     */
    public CreateTemplateGroupResponse createTemplateGroup(CreateTemplateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.createTemplateGroup);
    }

    /**
     * 创建自定义转码模板组
     *
     * 创建自定义转码模板组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTemplateGroupRequest 请求对象
     * @return SyncInvoker<CreateTemplateGroupRequest, CreateTemplateGroupResponse>
     */
    public SyncInvoker<CreateTemplateGroupRequest, CreateTemplateGroupResponse> createTemplateGroupInvoker(
        CreateTemplateGroupRequest request) {
        return new SyncInvoker<CreateTemplateGroupRequest, CreateTemplateGroupResponse>(request,
            VodMeta.createTemplateGroup, hcClient);
    }

    /**
     * 创建转码模板组集合
     *
     * 创建转码模板组集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTemplateGroupCollectionRequest 请求对象
     * @return CreateTemplateGroupCollectionResponse
     */
    public CreateTemplateGroupCollectionResponse createTemplateGroupCollection(
        CreateTemplateGroupCollectionRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.createTemplateGroupCollection);
    }

    /**
     * 创建转码模板组集合
     *
     * 创建转码模板组集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTemplateGroupCollectionRequest 请求对象
     * @return SyncInvoker<CreateTemplateGroupCollectionRequest, CreateTemplateGroupCollectionResponse>
     */
    public SyncInvoker<CreateTemplateGroupCollectionRequest, CreateTemplateGroupCollectionResponse> createTemplateGroupCollectionInvoker(
        CreateTemplateGroupCollectionRequest request) {
        return new SyncInvoker<CreateTemplateGroupCollectionRequest, CreateTemplateGroupCollectionResponse>(request,
            VodMeta.createTemplateGroupCollection, hcClient);
    }

    /**
     * 创建自定义转码模板
     *
     * 创建自定义转码模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTranscodeTemplateRequest 请求对象
     * @return CreateTranscodeTemplateResponse
     */
    public CreateTranscodeTemplateResponse createTranscodeTemplate(CreateTranscodeTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.createTranscodeTemplate);
    }

    /**
     * 创建自定义转码模板
     *
     * 创建自定义转码模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTranscodeTemplateRequest 请求对象
     * @return SyncInvoker<CreateTranscodeTemplateRequest, CreateTranscodeTemplateResponse>
     */
    public SyncInvoker<CreateTranscodeTemplateRequest, CreateTranscodeTemplateResponse> createTranscodeTemplateInvoker(
        CreateTranscodeTemplateRequest request) {
        return new SyncInvoker<CreateTranscodeTemplateRequest, CreateTranscodeTemplateResponse>(request,
            VodMeta.createTranscodeTemplate, hcClient);
    }

    /**
     * 创建水印模板
     *
     * 创建水印模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateWatermarkTemplateRequest 请求对象
     * @return CreateWatermarkTemplateResponse
     */
    public CreateWatermarkTemplateResponse createWatermarkTemplate(CreateWatermarkTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.createWatermarkTemplate);
    }

    /**
     * 创建水印模板
     *
     * 创建水印模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateWatermarkTemplateRequest 请求对象
     * @return SyncInvoker<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse>
     */
    public SyncInvoker<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse> createWatermarkTemplateInvoker(
        CreateWatermarkTemplateRequest request) {
        return new SyncInvoker<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse>(request,
            VodMeta.createWatermarkTemplate, hcClient);
    }

    /**
     * 删除媒资分类
     *
     * 删除媒资分类。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAssetCategoryRequest 请求对象
     * @return DeleteAssetCategoryResponse
     */
    public DeleteAssetCategoryResponse deleteAssetCategory(DeleteAssetCategoryRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.deleteAssetCategory);
    }

    /**
     * 删除媒资分类
     *
     * 删除媒资分类。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAssetCategoryRequest 请求对象
     * @return SyncInvoker<DeleteAssetCategoryRequest, DeleteAssetCategoryResponse>
     */
    public SyncInvoker<DeleteAssetCategoryRequest, DeleteAssetCategoryResponse> deleteAssetCategoryInvoker(
        DeleteAssetCategoryRequest request) {
        return new SyncInvoker<DeleteAssetCategoryRequest, DeleteAssetCategoryResponse>(request,
            VodMeta.deleteAssetCategory, hcClient);
    }

    /**
     * 删除媒资
     *
     * 删除媒资。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAssetsRequest 请求对象
     * @return DeleteAssetsResponse
     */
    public DeleteAssetsResponse deleteAssets(DeleteAssetsRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.deleteAssets);
    }

    /**
     * 删除媒资
     *
     * 删除媒资。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAssetsRequest 请求对象
     * @return SyncInvoker<DeleteAssetsRequest, DeleteAssetsResponse>
     */
    public SyncInvoker<DeleteAssetsRequest, DeleteAssetsResponse> deleteAssetsInvoker(DeleteAssetsRequest request) {
        return new SyncInvoker<DeleteAssetsRequest, DeleteAssetsResponse>(request, VodMeta.deleteAssets, hcClient);
    }

    /**
     * 删除自定义转码模板组
     *
     * 删除自定义转码模板组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTemplateGroupRequest 请求对象
     * @return DeleteTemplateGroupResponse
     */
    public DeleteTemplateGroupResponse deleteTemplateGroup(DeleteTemplateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.deleteTemplateGroup);
    }

    /**
     * 删除自定义转码模板组
     *
     * 删除自定义转码模板组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTemplateGroupRequest 请求对象
     * @return SyncInvoker<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse>
     */
    public SyncInvoker<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse> deleteTemplateGroupInvoker(
        DeleteTemplateGroupRequest request) {
        return new SyncInvoker<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse>(request,
            VodMeta.deleteTemplateGroup, hcClient);
    }

    /**
     * 删除转码模板组集合
     *
     * 删除转码模板组集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTemplateGroupCollectionRequest 请求对象
     * @return DeleteTemplateGroupCollectionResponse
     */
    public DeleteTemplateGroupCollectionResponse deleteTemplateGroupCollection(
        DeleteTemplateGroupCollectionRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.deleteTemplateGroupCollection);
    }

    /**
     * 删除转码模板组集合
     *
     * 删除转码模板组集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTemplateGroupCollectionRequest 请求对象
     * @return SyncInvoker<DeleteTemplateGroupCollectionRequest, DeleteTemplateGroupCollectionResponse>
     */
    public SyncInvoker<DeleteTemplateGroupCollectionRequest, DeleteTemplateGroupCollectionResponse> deleteTemplateGroupCollectionInvoker(
        DeleteTemplateGroupCollectionRequest request) {
        return new SyncInvoker<DeleteTemplateGroupCollectionRequest, DeleteTemplateGroupCollectionResponse>(request,
            VodMeta.deleteTemplateGroupCollection, hcClient);
    }

    /**
     * 删除自定义模板
     *
     * 删除自定义模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTranscodeTemplateRequest 请求对象
     * @return DeleteTranscodeTemplateResponse
     */
    public DeleteTranscodeTemplateResponse deleteTranscodeTemplate(DeleteTranscodeTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.deleteTranscodeTemplate);
    }

    /**
     * 删除自定义模板
     *
     * 删除自定义模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTranscodeTemplateRequest 请求对象
     * @return SyncInvoker<DeleteTranscodeTemplateRequest, DeleteTranscodeTemplateResponse>
     */
    public SyncInvoker<DeleteTranscodeTemplateRequest, DeleteTranscodeTemplateResponse> deleteTranscodeTemplateInvoker(
        DeleteTranscodeTemplateRequest request) {
        return new SyncInvoker<DeleteTranscodeTemplateRequest, DeleteTranscodeTemplateResponse>(request,
            VodMeta.deleteTranscodeTemplate, hcClient);
    }

    /**
     * 删除水印模板
     *
     * 删除水印模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteWatermarkTemplateRequest 请求对象
     * @return DeleteWatermarkTemplateResponse
     */
    public DeleteWatermarkTemplateResponse deleteWatermarkTemplate(DeleteWatermarkTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.deleteWatermarkTemplate);
    }

    /**
     * 删除水印模板
     *
     * 删除水印模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteWatermarkTemplateRequest 请求对象
     * @return SyncInvoker<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse>
     */
    public SyncInvoker<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse> deleteWatermarkTemplateInvoker(
        DeleteWatermarkTemplateRequest request) {
        return new SyncInvoker<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse>(request,
            VodMeta.deleteWatermarkTemplate, hcClient);
    }

    /**
     * 查询指定分类信息
     *
     * 查询指定分类信息，及其子分类（即下一级分类）的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAssetCategoryRequest 请求对象
     * @return ListAssetCategoryResponse
     */
    public ListAssetCategoryResponse listAssetCategory(ListAssetCategoryRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.listAssetCategory);
    }

    /**
     * 查询指定分类信息
     *
     * 查询指定分类信息，及其子分类（即下一级分类）的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAssetCategoryRequest 请求对象
     * @return SyncInvoker<ListAssetCategoryRequest, ListAssetCategoryResponse>
     */
    public SyncInvoker<ListAssetCategoryRequest, ListAssetCategoryResponse> listAssetCategoryInvoker(
        ListAssetCategoryRequest request) {
        return new SyncInvoker<ListAssetCategoryRequest, ListAssetCategoryResponse>(request, VodMeta.listAssetCategory,
            hcClient);
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
     * @param ListAssetDailySummaryLogRequest 请求对象
     * @return ListAssetDailySummaryLogResponse
     */
    public ListAssetDailySummaryLogResponse listAssetDailySummaryLog(ListAssetDailySummaryLogRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.listAssetDailySummaryLog);
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
     * @param ListAssetDailySummaryLogRequest 请求对象
     * @return SyncInvoker<ListAssetDailySummaryLogRequest, ListAssetDailySummaryLogResponse>
     */
    public SyncInvoker<ListAssetDailySummaryLogRequest, ListAssetDailySummaryLogResponse> listAssetDailySummaryLogInvoker(
        ListAssetDailySummaryLogRequest request) {
        return new SyncInvoker<ListAssetDailySummaryLogRequest, ListAssetDailySummaryLogResponse>(request,
            VodMeta.listAssetDailySummaryLog, hcClient);
    }

    /**
     * 查询媒资列表
     *
     * 查询媒资列表，列表中的每一条记录包含媒资的概要信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAssetListRequest 请求对象
     * @return ListAssetListResponse
     */
    public ListAssetListResponse listAssetList(ListAssetListRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.listAssetList);
    }

    /**
     * 查询媒资列表
     *
     * 查询媒资列表，列表中的每一条记录包含媒资的概要信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAssetListRequest 请求对象
     * @return SyncInvoker<ListAssetListRequest, ListAssetListResponse>
     */
    public SyncInvoker<ListAssetListRequest, ListAssetListResponse> listAssetListInvoker(ListAssetListRequest request) {
        return new SyncInvoker<ListAssetListRequest, ListAssetListResponse>(request, VodMeta.listAssetList, hcClient);
    }

    /**
     * 查询域名播放日志
     *
     * 查询指定点播域名某段时间内在CDN的相关日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDomainLogsRequest 请求对象
     * @return ListDomainLogsResponse
     */
    public ListDomainLogsResponse listDomainLogs(ListDomainLogsRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.listDomainLogs);
    }

    /**
     * 查询域名播放日志
     *
     * 查询指定点播域名某段时间内在CDN的相关日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDomainLogsRequest 请求对象
     * @return SyncInvoker<ListDomainLogsRequest, ListDomainLogsResponse>
     */
    public SyncInvoker<ListDomainLogsRequest, ListDomainLogsResponse> listDomainLogsInvoker(
        ListDomainLogsRequest request) {
        return new SyncInvoker<ListDomainLogsRequest, ListDomainLogsResponse>(request, VodMeta.listDomainLogs,
            hcClient);
    }

    /**
     * 查询转码模板组列表
     *
     * 查询转码模板组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTemplateGroupRequest 请求对象
     * @return ListTemplateGroupResponse
     */
    public ListTemplateGroupResponse listTemplateGroup(ListTemplateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.listTemplateGroup);
    }

    /**
     * 查询转码模板组列表
     *
     * 查询转码模板组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTemplateGroupRequest 请求对象
     * @return SyncInvoker<ListTemplateGroupRequest, ListTemplateGroupResponse>
     */
    public SyncInvoker<ListTemplateGroupRequest, ListTemplateGroupResponse> listTemplateGroupInvoker(
        ListTemplateGroupRequest request) {
        return new SyncInvoker<ListTemplateGroupRequest, ListTemplateGroupResponse>(request, VodMeta.listTemplateGroup,
            hcClient);
    }

    /**
     * 查询自定义模板组集合
     *
     * 查询转码模板组集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTemplateGroupCollectionRequest 请求对象
     * @return ListTemplateGroupCollectionResponse
     */
    public ListTemplateGroupCollectionResponse listTemplateGroupCollection(ListTemplateGroupCollectionRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.listTemplateGroupCollection);
    }

    /**
     * 查询自定义模板组集合
     *
     * 查询转码模板组集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTemplateGroupCollectionRequest 请求对象
     * @return SyncInvoker<ListTemplateGroupCollectionRequest, ListTemplateGroupCollectionResponse>
     */
    public SyncInvoker<ListTemplateGroupCollectionRequest, ListTemplateGroupCollectionResponse> listTemplateGroupCollectionInvoker(
        ListTemplateGroupCollectionRequest request) {
        return new SyncInvoker<ListTemplateGroupCollectionRequest, ListTemplateGroupCollectionResponse>(request,
            VodMeta.listTemplateGroupCollection, hcClient);
    }

    /**
     * 查询TopN媒资信息
     *
     * 查询指定域名在指定日期播放次数排名Top 100的媒资统计数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTopStatisticsRequest 请求对象
     * @return ListTopStatisticsResponse
     */
    public ListTopStatisticsResponse listTopStatistics(ListTopStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.listTopStatistics);
    }

    /**
     * 查询TopN媒资信息
     *
     * 查询指定域名在指定日期播放次数排名Top 100的媒资统计数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTopStatisticsRequest 请求对象
     * @return SyncInvoker<ListTopStatisticsRequest, ListTopStatisticsResponse>
     */
    public SyncInvoker<ListTopStatisticsRequest, ListTopStatisticsResponse> listTopStatisticsInvoker(
        ListTopStatisticsRequest request) {
        return new SyncInvoker<ListTopStatisticsRequest, ListTopStatisticsResponse>(request, VodMeta.listTopStatistics,
            hcClient);
    }

    /**
     * 查询转码模板列表
     *
     * 查询转码模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTranscodeTemplateRequest 请求对象
     * @return ListTranscodeTemplateResponse
     */
    public ListTranscodeTemplateResponse listTranscodeTemplate(ListTranscodeTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.listTranscodeTemplate);
    }

    /**
     * 查询转码模板列表
     *
     * 查询转码模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTranscodeTemplateRequest 请求对象
     * @return SyncInvoker<ListTranscodeTemplateRequest, ListTranscodeTemplateResponse>
     */
    public SyncInvoker<ListTranscodeTemplateRequest, ListTranscodeTemplateResponse> listTranscodeTemplateInvoker(
        ListTranscodeTemplateRequest request) {
        return new SyncInvoker<ListTranscodeTemplateRequest, ListTranscodeTemplateResponse>(request,
            VodMeta.listTranscodeTemplate, hcClient);
    }

    /**
     * 查询水印列表
     *
     * 查询水印模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWatermarkTemplateRequest 请求对象
     * @return ListWatermarkTemplateResponse
     */
    public ListWatermarkTemplateResponse listWatermarkTemplate(ListWatermarkTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.listWatermarkTemplate);
    }

    /**
     * 查询水印列表
     *
     * 查询水印模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWatermarkTemplateRequest 请求对象
     * @return SyncInvoker<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse>
     */
    public SyncInvoker<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse> listWatermarkTemplateInvoker(
        ListWatermarkTemplateRequest request) {
        return new SyncInvoker<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse>(request,
            VodMeta.listWatermarkTemplate, hcClient);
    }

    /**
     * 创建媒资：OBS转存方式
     *
     * 若您在使用点播服务前，已经在OBS桶中存储了音视频文件，您可以使用该接口将存储在OBS桶中的音视频文件转存到点播服务中，使用点播服务的音视频管理功能。调用该接口前，您需要调用[桶授权](https://support.huaweicloud.com/api-vod/vod_04_0199.html)接口，将存储音视频文件的OBS桶授权给点播服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishAssetFromObsRequest 请求对象
     * @return PublishAssetFromObsResponse
     */
    public PublishAssetFromObsResponse publishAssetFromObs(PublishAssetFromObsRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.publishAssetFromObs);
    }

    /**
     * 创建媒资：OBS转存方式
     *
     * 若您在使用点播服务前，已经在OBS桶中存储了音视频文件，您可以使用该接口将存储在OBS桶中的音视频文件转存到点播服务中，使用点播服务的音视频管理功能。调用该接口前，您需要调用[桶授权](https://support.huaweicloud.com/api-vod/vod_04_0199.html)接口，将存储音视频文件的OBS桶授权给点播服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishAssetFromObsRequest 请求对象
     * @return SyncInvoker<PublishAssetFromObsRequest, PublishAssetFromObsResponse>
     */
    public SyncInvoker<PublishAssetFromObsRequest, PublishAssetFromObsResponse> publishAssetFromObsInvoker(
        PublishAssetFromObsRequest request) {
        return new SyncInvoker<PublishAssetFromObsRequest, PublishAssetFromObsResponse>(request,
            VodMeta.publishAssetFromObs, hcClient);
    }

    /**
     * 媒资发布
     *
     * 将媒资设置为发布状态。支持批量发布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishAssetsRequest 请求对象
     * @return PublishAssetsResponse
     */
    public PublishAssetsResponse publishAssets(PublishAssetsRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.publishAssets);
    }

    /**
     * 媒资发布
     *
     * 将媒资设置为发布状态。支持批量发布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PublishAssetsRequest 请求对象
     * @return SyncInvoker<PublishAssetsRequest, PublishAssetsResponse>
     */
    public SyncInvoker<PublishAssetsRequest, PublishAssetsResponse> publishAssetsInvoker(PublishAssetsRequest request) {
        return new SyncInvoker<PublishAssetsRequest, PublishAssetsResponse>(request, VodMeta.publishAssets, hcClient);
    }

    /**
     * 密钥查询
     *
     * 终端播放HLS加密视频时，向租户管理系统请求密钥，租户管理系统先查询其本地有没有已缓存的密钥，没有时则调用此接口向VOD查询。该接口的具体使用场景请参见[通过HLS加密防止视频泄露](https://support.huaweicloud.com/bestpractice-vod/vod_10_0004.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAssetCipherRequest 请求对象
     * @return ShowAssetCipherResponse
     */
    public ShowAssetCipherResponse showAssetCipher(ShowAssetCipherRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.showAssetCipher);
    }

    /**
     * 密钥查询
     *
     * 终端播放HLS加密视频时，向租户管理系统请求密钥，租户管理系统先查询其本地有没有已缓存的密钥，没有时则调用此接口向VOD查询。该接口的具体使用场景请参见[通过HLS加密防止视频泄露](https://support.huaweicloud.com/bestpractice-vod/vod_10_0004.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAssetCipherRequest 请求对象
     * @return SyncInvoker<ShowAssetCipherRequest, ShowAssetCipherResponse>
     */
    public SyncInvoker<ShowAssetCipherRequest, ShowAssetCipherResponse> showAssetCipherInvoker(
        ShowAssetCipherRequest request) {
        return new SyncInvoker<ShowAssetCipherRequest, ShowAssetCipherResponse>(request, VodMeta.showAssetCipher,
            hcClient);
    }

    /**
     * 查询指定媒资的详细信息
     *
     * 查询指定媒资的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAssetDetailRequest 请求对象
     * @return ShowAssetDetailResponse
     */
    public ShowAssetDetailResponse showAssetDetail(ShowAssetDetailRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.showAssetDetail);
    }

    /**
     * 查询指定媒资的详细信息
     *
     * 查询指定媒资的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAssetDetailRequest 请求对象
     * @return SyncInvoker<ShowAssetDetailRequest, ShowAssetDetailResponse>
     */
    public SyncInvoker<ShowAssetDetailRequest, ShowAssetDetailResponse> showAssetDetailInvoker(
        ShowAssetDetailRequest request) {
        return new SyncInvoker<ShowAssetDetailRequest, ShowAssetDetailResponse>(request, VodMeta.showAssetDetail,
            hcClient);
    }

    /**
     * 查询媒资信息
     *
     * 查询媒资信息，支持指定媒资ID、分类、状态、起止时间查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAssetMetaRequest 请求对象
     * @return ShowAssetMetaResponse
     */
    public ShowAssetMetaResponse showAssetMeta(ShowAssetMetaRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.showAssetMeta);
    }

    /**
     * 查询媒资信息
     *
     * 查询媒资信息，支持指定媒资ID、分类、状态、起止时间查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAssetMetaRequest 请求对象
     * @return SyncInvoker<ShowAssetMetaRequest, ShowAssetMetaResponse>
     */
    public SyncInvoker<ShowAssetMetaRequest, ShowAssetMetaResponse> showAssetMetaInvoker(ShowAssetMetaRequest request) {
        return new SyncInvoker<ShowAssetMetaRequest, ShowAssetMetaResponse>(request, VodMeta.showAssetMeta, hcClient);
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
     * @param ShowAssetTempAuthorityRequest 请求对象
     * @return ShowAssetTempAuthorityResponse
     */
    public ShowAssetTempAuthorityResponse showAssetTempAuthority(ShowAssetTempAuthorityRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.showAssetTempAuthority);
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
     * @param ShowAssetTempAuthorityRequest 请求对象
     * @return SyncInvoker<ShowAssetTempAuthorityRequest, ShowAssetTempAuthorityResponse>
     */
    public SyncInvoker<ShowAssetTempAuthorityRequest, ShowAssetTempAuthorityResponse> showAssetTempAuthorityInvoker(
        ShowAssetTempAuthorityRequest request) {
        return new SyncInvoker<ShowAssetTempAuthorityRequest, ShowAssetTempAuthorityResponse>(request,
            VodMeta.showAssetTempAuthority, hcClient);
    }

    /**
     * 查询CDN统计信息
     *
     * 查询CDN的统计数据，包括流量、峰值带宽、请求总数、请求命中率、流量命中率。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCdnStatisticsRequest 请求对象
     * @return ShowCdnStatisticsResponse
     */
    public ShowCdnStatisticsResponse showCdnStatistics(ShowCdnStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.showCdnStatistics);
    }

    /**
     * 查询CDN统计信息
     *
     * 查询CDN的统计数据，包括流量、峰值带宽、请求总数、请求命中率、流量命中率。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCdnStatisticsRequest 请求对象
     * @return SyncInvoker<ShowCdnStatisticsRequest, ShowCdnStatisticsResponse>
     */
    public SyncInvoker<ShowCdnStatisticsRequest, ShowCdnStatisticsResponse> showCdnStatisticsInvoker(
        ShowCdnStatisticsRequest request) {
        return new SyncInvoker<ShowCdnStatisticsRequest, ShowCdnStatisticsResponse>(request, VodMeta.showCdnStatistics,
            hcClient);
    }

    /**
     * 查询CDN预热
     *
     * 查询预热结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPreheatingAssetRequest 请求对象
     * @return ShowPreheatingAssetResponse
     */
    public ShowPreheatingAssetResponse showPreheatingAsset(ShowPreheatingAssetRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.showPreheatingAsset);
    }

    /**
     * 查询CDN预热
     *
     * 查询预热结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPreheatingAssetRequest 请求对象
     * @return SyncInvoker<ShowPreheatingAssetRequest, ShowPreheatingAssetResponse>
     */
    public SyncInvoker<ShowPreheatingAssetRequest, ShowPreheatingAssetResponse> showPreheatingAssetInvoker(
        ShowPreheatingAssetRequest request) {
        return new SyncInvoker<ShowPreheatingAssetRequest, ShowPreheatingAssetResponse>(request,
            VodMeta.showPreheatingAsset, hcClient);
    }

    /**
     * 查询源站统计信息
     *
     * 查询点播源站的统计数据，包括流量、存储空间、转码时长。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVodStatisticsRequest 请求对象
     * @return ShowVodStatisticsResponse
     */
    public ShowVodStatisticsResponse showVodStatistics(ShowVodStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.showVodStatistics);
    }

    /**
     * 查询源站统计信息
     *
     * 查询点播源站的统计数据，包括流量、存储空间、转码时长。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVodStatisticsRequest 请求对象
     * @return SyncInvoker<ShowVodStatisticsRequest, ShowVodStatisticsResponse>
     */
    public SyncInvoker<ShowVodStatisticsRequest, ShowVodStatisticsResponse> showVodStatisticsInvoker(
        ShowVodStatisticsRequest request) {
        return new SyncInvoker<ShowVodStatisticsRequest, ShowVodStatisticsResponse>(request, VodMeta.showVodStatistics,
            hcClient);
    }

    /**
     * 媒资发布取消
     *
     * 将媒资设置为未发布状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UnpublishAssetsRequest 请求对象
     * @return UnpublishAssetsResponse
     */
    public UnpublishAssetsResponse unpublishAssets(UnpublishAssetsRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.unpublishAssets);
    }

    /**
     * 媒资发布取消
     *
     * 将媒资设置为未发布状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UnpublishAssetsRequest 请求对象
     * @return SyncInvoker<UnpublishAssetsRequest, UnpublishAssetsResponse>
     */
    public SyncInvoker<UnpublishAssetsRequest, UnpublishAssetsResponse> unpublishAssetsInvoker(
        UnpublishAssetsRequest request) {
        return new SyncInvoker<UnpublishAssetsRequest, UnpublishAssetsResponse>(request, VodMeta.unpublishAssets,
            hcClient);
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
     * @param UpdateAssetRequest 请求对象
     * @return UpdateAssetResponse
     */
    public UpdateAssetResponse updateAsset(UpdateAssetRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.updateAsset);
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
     * @param UpdateAssetRequest 请求对象
     * @return SyncInvoker<UpdateAssetRequest, UpdateAssetResponse>
     */
    public SyncInvoker<UpdateAssetRequest, UpdateAssetResponse> updateAssetInvoker(UpdateAssetRequest request) {
        return new SyncInvoker<UpdateAssetRequest, UpdateAssetResponse>(request, VodMeta.updateAsset, hcClient);
    }

    /**
     * 修改媒资分类
     *
     * 修改媒资分类。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAssetCategoryRequest 请求对象
     * @return UpdateAssetCategoryResponse
     */
    public UpdateAssetCategoryResponse updateAssetCategory(UpdateAssetCategoryRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.updateAssetCategory);
    }

    /**
     * 修改媒资分类
     *
     * 修改媒资分类。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAssetCategoryRequest 请求对象
     * @return SyncInvoker<UpdateAssetCategoryRequest, UpdateAssetCategoryResponse>
     */
    public SyncInvoker<UpdateAssetCategoryRequest, UpdateAssetCategoryResponse> updateAssetCategoryInvoker(
        UpdateAssetCategoryRequest request) {
        return new SyncInvoker<UpdateAssetCategoryRequest, UpdateAssetCategoryResponse>(request,
            VodMeta.updateAssetCategory, hcClient);
    }

    /**
     * 修改媒资属性
     *
     * 修改媒资属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAssetMetaRequest 请求对象
     * @return UpdateAssetMetaResponse
     */
    public UpdateAssetMetaResponse updateAssetMeta(UpdateAssetMetaRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.updateAssetMeta);
    }

    /**
     * 修改媒资属性
     *
     * 修改媒资属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAssetMetaRequest 请求对象
     * @return SyncInvoker<UpdateAssetMetaRequest, UpdateAssetMetaResponse>
     */
    public SyncInvoker<UpdateAssetMetaRequest, UpdateAssetMetaResponse> updateAssetMetaInvoker(
        UpdateAssetMetaRequest request) {
        return new SyncInvoker<UpdateAssetMetaRequest, UpdateAssetMetaResponse>(request, VodMeta.updateAssetMeta,
            hcClient);
    }

    /**
     * 桶授权
     *
     * 用户可以通过该接口将OBS桶授权给点播服务或取消点播服务的授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBucketAuthorizedRequest 请求对象
     * @return UpdateBucketAuthorizedResponse
     */
    public UpdateBucketAuthorizedResponse updateBucketAuthorized(UpdateBucketAuthorizedRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.updateBucketAuthorized);
    }

    /**
     * 桶授权
     *
     * 用户可以通过该接口将OBS桶授权给点播服务或取消点播服务的授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBucketAuthorizedRequest 请求对象
     * @return SyncInvoker<UpdateBucketAuthorizedRequest, UpdateBucketAuthorizedResponse>
     */
    public SyncInvoker<UpdateBucketAuthorizedRequest, UpdateBucketAuthorizedResponse> updateBucketAuthorizedInvoker(
        UpdateBucketAuthorizedRequest request) {
        return new SyncInvoker<UpdateBucketAuthorizedRequest, UpdateBucketAuthorizedResponse>(request,
            VodMeta.updateBucketAuthorized, hcClient);
    }

    /**
     * 设置封面
     *
     * 将视频截图生成的某张图片设置成封面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCoverByThumbnailRequest 请求对象
     * @return UpdateCoverByThumbnailResponse
     */
    public UpdateCoverByThumbnailResponse updateCoverByThumbnail(UpdateCoverByThumbnailRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.updateCoverByThumbnail);
    }

    /**
     * 设置封面
     *
     * 将视频截图生成的某张图片设置成封面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCoverByThumbnailRequest 请求对象
     * @return SyncInvoker<UpdateCoverByThumbnailRequest, UpdateCoverByThumbnailResponse>
     */
    public SyncInvoker<UpdateCoverByThumbnailRequest, UpdateCoverByThumbnailResponse> updateCoverByThumbnailInvoker(
        UpdateCoverByThumbnailRequest request) {
        return new SyncInvoker<UpdateCoverByThumbnailRequest, UpdateCoverByThumbnailResponse>(request,
            VodMeta.updateCoverByThumbnail, hcClient);
    }

    /**
     * 修改自定义转码模板组
     *
     * 修改自定义转码模板组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTemplateGroupRequest 请求对象
     * @return UpdateTemplateGroupResponse
     */
    public UpdateTemplateGroupResponse updateTemplateGroup(UpdateTemplateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.updateTemplateGroup);
    }

    /**
     * 修改自定义转码模板组
     *
     * 修改自定义转码模板组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTemplateGroupRequest 请求对象
     * @return SyncInvoker<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse>
     */
    public SyncInvoker<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse> updateTemplateGroupInvoker(
        UpdateTemplateGroupRequest request) {
        return new SyncInvoker<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse>(request,
            VodMeta.updateTemplateGroup, hcClient);
    }

    /**
     * 修改转码模板组集合
     *
     * 修改转码模板组结合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTemplateGroupCollectionRequest 请求对象
     * @return UpdateTemplateGroupCollectionResponse
     */
    public UpdateTemplateGroupCollectionResponse updateTemplateGroupCollection(
        UpdateTemplateGroupCollectionRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.updateTemplateGroupCollection);
    }

    /**
     * 修改转码模板组集合
     *
     * 修改转码模板组结合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTemplateGroupCollectionRequest 请求对象
     * @return SyncInvoker<UpdateTemplateGroupCollectionRequest, UpdateTemplateGroupCollectionResponse>
     */
    public SyncInvoker<UpdateTemplateGroupCollectionRequest, UpdateTemplateGroupCollectionResponse> updateTemplateGroupCollectionInvoker(
        UpdateTemplateGroupCollectionRequest request) {
        return new SyncInvoker<UpdateTemplateGroupCollectionRequest, UpdateTemplateGroupCollectionResponse>(request,
            VodMeta.updateTemplateGroupCollection, hcClient);
    }

    /**
     * 修改转码模板
     *
     * 修改转码模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTranscodeTemplateRequest 请求对象
     * @return UpdateTranscodeTemplateResponse
     */
    public UpdateTranscodeTemplateResponse updateTranscodeTemplate(UpdateTranscodeTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.updateTranscodeTemplate);
    }

    /**
     * 修改转码模板
     *
     * 修改转码模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTranscodeTemplateRequest 请求对象
     * @return SyncInvoker<UpdateTranscodeTemplateRequest, UpdateTranscodeTemplateResponse>
     */
    public SyncInvoker<UpdateTranscodeTemplateRequest, UpdateTranscodeTemplateResponse> updateTranscodeTemplateInvoker(
        UpdateTranscodeTemplateRequest request) {
        return new SyncInvoker<UpdateTranscodeTemplateRequest, UpdateTranscodeTemplateResponse>(request,
            VodMeta.updateTranscodeTemplate, hcClient);
    }

    /**
     * 修改水印模板
     *
     * 修改水印模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateWatermarkTemplateRequest 请求对象
     * @return UpdateWatermarkTemplateResponse
     */
    public UpdateWatermarkTemplateResponse updateWatermarkTemplate(UpdateWatermarkTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.updateWatermarkTemplate);
    }

    /**
     * 修改水印模板
     *
     * 修改水印模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateWatermarkTemplateRequest 请求对象
     * @return SyncInvoker<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse>
     */
    public SyncInvoker<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse> updateWatermarkTemplateInvoker(
        UpdateWatermarkTemplateRequest request) {
        return new SyncInvoker<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse>(request,
            VodMeta.updateWatermarkTemplate, hcClient);
    }

    /**
     * 创建媒资：URL拉取注入
     *
     * 基于音视频源文件URL，将音视频文件离线拉取上传到点播服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadMetaDataByUrlRequest 请求对象
     * @return UploadMetaDataByUrlResponse
     */
    public UploadMetaDataByUrlResponse uploadMetaDataByUrl(UploadMetaDataByUrlRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.uploadMetaDataByUrl);
    }

    /**
     * 创建媒资：URL拉取注入
     *
     * 基于音视频源文件URL，将音视频文件离线拉取上传到点播服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadMetaDataByUrlRequest 请求对象
     * @return SyncInvoker<UploadMetaDataByUrlRequest, UploadMetaDataByUrlResponse>
     */
    public SyncInvoker<UploadMetaDataByUrlRequest, UploadMetaDataByUrlResponse> uploadMetaDataByUrlInvoker(
        UploadMetaDataByUrlRequest request) {
        return new SyncInvoker<UploadMetaDataByUrlRequest, UploadMetaDataByUrlResponse>(request,
            VodMeta.uploadMetaDataByUrl, hcClient);
    }

    /**
     * 查询托管任务
     *
     * 查询OBS存量托管任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTakeOverTaskRequest 请求对象
     * @return ListTakeOverTaskResponse
     */
    public ListTakeOverTaskResponse listTakeOverTask(ListTakeOverTaskRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.listTakeOverTask);
    }

    /**
     * 查询托管任务
     *
     * 查询OBS存量托管任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTakeOverTaskRequest 请求对象
     * @return SyncInvoker<ListTakeOverTaskRequest, ListTakeOverTaskResponse>
     */
    public SyncInvoker<ListTakeOverTaskRequest, ListTakeOverTaskResponse> listTakeOverTaskInvoker(
        ListTakeOverTaskRequest request) {
        return new SyncInvoker<ListTakeOverTaskRequest, ListTakeOverTaskResponse>(request, VodMeta.listTakeOverTask,
            hcClient);
    }

    /**
     * 查询托管媒资详情
     *
     * 查询OBS托管媒资的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTakeOverAssetDetailsRequest 请求对象
     * @return ShowTakeOverAssetDetailsResponse
     */
    public ShowTakeOverAssetDetailsResponse showTakeOverAssetDetails(ShowTakeOverAssetDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.showTakeOverAssetDetails);
    }

    /**
     * 查询托管媒资详情
     *
     * 查询OBS托管媒资的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTakeOverAssetDetailsRequest 请求对象
     * @return SyncInvoker<ShowTakeOverAssetDetailsRequest, ShowTakeOverAssetDetailsResponse>
     */
    public SyncInvoker<ShowTakeOverAssetDetailsRequest, ShowTakeOverAssetDetailsResponse> showTakeOverAssetDetailsInvoker(
        ShowTakeOverAssetDetailsRequest request) {
        return new SyncInvoker<ShowTakeOverAssetDetailsRequest, ShowTakeOverAssetDetailsResponse>(request,
            VodMeta.showTakeOverAssetDetails, hcClient);
    }

    /**
     * 查询托管任务详情
     *
     * 查询OBS存量托管任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTakeOverTaskDetailsRequest 请求对象
     * @return ShowTakeOverTaskDetailsResponse
     */
    public ShowTakeOverTaskDetailsResponse showTakeOverTaskDetails(ShowTakeOverTaskDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.showTakeOverTaskDetails);
    }

    /**
     * 查询托管任务详情
     *
     * 查询OBS存量托管任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTakeOverTaskDetailsRequest 请求对象
     * @return SyncInvoker<ShowTakeOverTaskDetailsRequest, ShowTakeOverTaskDetailsResponse>
     */
    public SyncInvoker<ShowTakeOverTaskDetailsRequest, ShowTakeOverTaskDetailsResponse> showTakeOverTaskDetailsInvoker(
        ShowTakeOverTaskDetailsRequest request) {
        return new SyncInvoker<ShowTakeOverTaskDetailsRequest, ShowTakeOverTaskDetailsResponse>(request,
            VodMeta.showTakeOverTaskDetails, hcClient);
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
     * @param ShowVodRetrievalRequest 请求对象
     * @return ShowVodRetrievalResponse
     */
    public ShowVodRetrievalResponse showVodRetrieval(ShowVodRetrievalRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.showVodRetrieval);
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
     * @param ShowVodRetrievalRequest 请求对象
     * @return SyncInvoker<ShowVodRetrievalRequest, ShowVodRetrievalResponse>
     */
    public SyncInvoker<ShowVodRetrievalRequest, ShowVodRetrievalResponse> showVodRetrievalInvoker(
        ShowVodRetrievalRequest request) {
        return new SyncInvoker<ShowVodRetrievalRequest, ShowVodRetrievalResponse>(request, VodMeta.showVodRetrieval,
            hcClient);
    }

    /**
     * 多字幕封装
     *
     * 多字幕封装，仅支持 HLS VTT格式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifySubtitleRequest 请求对象
     * @return ModifySubtitleResponse
     */
    public ModifySubtitleResponse modifySubtitle(ModifySubtitleRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.modifySubtitle);
    }

    /**
     * 多字幕封装
     *
     * 多字幕封装，仅支持 HLS VTT格式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifySubtitleRequest 请求对象
     * @return SyncInvoker<ModifySubtitleRequest, ModifySubtitleResponse>
     */
    public SyncInvoker<ModifySubtitleRequest, ModifySubtitleResponse> modifySubtitleInvoker(
        ModifySubtitleRequest request) {
        return new SyncInvoker<ModifySubtitleRequest, ModifySubtitleResponse>(request, VodMeta.modifySubtitle,
            hcClient);
    }

    /**
     * 修改媒资文件在obs的存储模式
     *
     * ## 接口功能 ##
     *   修改媒资文件在obs的存储模式&lt;br/&gt;
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateStorageModeRequest 请求对象
     * @return UpdateStorageModeResponse
     */
    public UpdateStorageModeResponse updateStorageMode(UpdateStorageModeRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.updateStorageMode);
    }

    /**
     * 修改媒资文件在obs的存储模式
     *
     * ## 接口功能 ##
     *   修改媒资文件在obs的存储模式&lt;br/&gt;
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateStorageModeRequest 请求对象
     * @return SyncInvoker<UpdateStorageModeRequest, UpdateStorageModeResponse>
     */
    public SyncInvoker<UpdateStorageModeRequest, UpdateStorageModeResponse> updateStorageModeInvoker(
        UpdateStorageModeRequest request) {
        return new SyncInvoker<UpdateStorageModeRequest, UpdateStorageModeResponse>(request, VodMeta.updateStorageMode,
            hcClient);
    }

}

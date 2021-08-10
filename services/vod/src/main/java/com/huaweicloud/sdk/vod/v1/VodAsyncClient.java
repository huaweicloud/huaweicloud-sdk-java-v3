package com.huaweicloud.sdk.vod.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.vod.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class VodAsyncClient {

    protected HcClient hcClient;

    public VodAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VodAsyncClient> newBuilder() {
        return new ClientBuilder<>(VodAsyncClient::new);
    }

    /** 取消媒资转码任务 取消媒资转码任务，只能取消排队中的转码任务。
     *
     * @param CancelAssetTranscodeTaskRequest 请求对象
     * @return CompletableFuture<CancelAssetTranscodeTaskResponse> */
    public CompletableFuture<CancelAssetTranscodeTaskResponse> cancelAssetTranscodeTaskAsync(
        CancelAssetTranscodeTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.cancelAssetTranscodeTask);
    }

    /** 取消媒资转码任务 取消媒资转码任务，只能取消排队中的转码任务。
     *
     * @param CancelAssetTranscodeTaskRequest 请求对象
     * @return AsyncInvoker<CancelAssetTranscodeTaskRequest, CancelAssetTranscodeTaskResponse> */
    public AsyncInvoker<CancelAssetTranscodeTaskRequest, CancelAssetTranscodeTaskResponse> cancelAssetTranscodeTaskAsyncInvoker(
        CancelAssetTranscodeTaskRequest request) {
        return new AsyncInvoker<CancelAssetTranscodeTaskRequest, CancelAssetTranscodeTaskResponse>(request,
            VodMeta.cancelAssetTranscodeTask, hcClient);
    }

    /** 取消提取音频任务 取消提取音频任务，只有排队中的提取音频任务才可以取消。
     *
     * @param CancelExtractAudioTaskRequest 请求对象
     * @return CompletableFuture<CancelExtractAudioTaskResponse> */
    public CompletableFuture<CancelExtractAudioTaskResponse> cancelExtractAudioTaskAsync(
        CancelExtractAudioTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.cancelExtractAudioTask);
    }

    /** 取消提取音频任务 取消提取音频任务，只有排队中的提取音频任务才可以取消。
     *
     * @param CancelExtractAudioTaskRequest 请求对象
     * @return AsyncInvoker<CancelExtractAudioTaskRequest, CancelExtractAudioTaskResponse> */
    public AsyncInvoker<CancelExtractAudioTaskRequest, CancelExtractAudioTaskResponse> cancelExtractAudioTaskAsyncInvoker(
        CancelExtractAudioTaskRequest request) {
        return new AsyncInvoker<CancelExtractAudioTaskRequest, CancelExtractAudioTaskResponse>(request,
            VodMeta.cancelExtractAudioTask, hcClient);
    }

    /** 上传检验 校验媒资文件是否已存储于视频点播服务中。
     *
     * @param CheckMd5DuplicationRequest 请求对象
     * @return CompletableFuture<CheckMd5DuplicationResponse> */
    public CompletableFuture<CheckMd5DuplicationResponse> checkMd5DuplicationAsync(CheckMd5DuplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.checkMd5Duplication);
    }

    /** 上传检验 校验媒资文件是否已存储于视频点播服务中。
     *
     * @param CheckMd5DuplicationRequest 请求对象
     * @return AsyncInvoker<CheckMd5DuplicationRequest, CheckMd5DuplicationResponse> */
    public AsyncInvoker<CheckMd5DuplicationRequest, CheckMd5DuplicationResponse> checkMd5DuplicationAsyncInvoker(
        CheckMd5DuplicationRequest request) {
        return new AsyncInvoker<CheckMd5DuplicationRequest, CheckMd5DuplicationResponse>(request,
            VodMeta.checkMd5Duplication, hcClient);
    }

    /** 确认媒资上传 媒资分段上传完成后，需要调用此接口通知点播服务媒资上传的状态，表示媒资上传创建完成。
     *
     * @param ConfirmAssetUploadRequest 请求对象
     * @return CompletableFuture<ConfirmAssetUploadResponse> */
    public CompletableFuture<ConfirmAssetUploadResponse> confirmAssetUploadAsync(ConfirmAssetUploadRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.confirmAssetUpload);
    }

    /** 确认媒资上传 媒资分段上传完成后，需要调用此接口通知点播服务媒资上传的状态，表示媒资上传创建完成。
     *
     * @param ConfirmAssetUploadRequest 请求对象
     * @return AsyncInvoker<ConfirmAssetUploadRequest, ConfirmAssetUploadResponse> */
    public AsyncInvoker<ConfirmAssetUploadRequest, ConfirmAssetUploadResponse> confirmAssetUploadAsyncInvoker(
        ConfirmAssetUploadRequest request) {
        return new AsyncInvoker<ConfirmAssetUploadRequest, ConfirmAssetUploadResponse>(request,
            VodMeta.confirmAssetUpload, hcClient);
    }

    /** 确认水印图片上传 确认水印图片上传状态。
     *
     * @param ConfirmImageUploadRequest 请求对象
     * @return CompletableFuture<ConfirmImageUploadResponse> */
    public CompletableFuture<ConfirmImageUploadResponse> confirmImageUploadAsync(ConfirmImageUploadRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.confirmImageUpload);
    }

    /** 确认水印图片上传 确认水印图片上传状态。
     *
     * @param ConfirmImageUploadRequest 请求对象
     * @return AsyncInvoker<ConfirmImageUploadRequest, ConfirmImageUploadResponse> */
    public AsyncInvoker<ConfirmImageUploadRequest, ConfirmImageUploadResponse> confirmImageUploadAsyncInvoker(
        ConfirmImageUploadRequest request) {
        return new AsyncInvoker<ConfirmImageUploadRequest, ConfirmImageUploadResponse>(request,
            VodMeta.confirmImageUpload, hcClient);
    }

    /** 创建媒资：上传方式 调用该接口创建媒资时，需要将对应的媒资文件上传到点播服务的OBS桶中。
     * 若上传的单媒资文件大小小于20M，则可以直接用PUT方法对该接口返回的地址进行上传。具体使用方法请参考[示例1：媒资上传（20M以下）](https://support.huaweicloud.com/api-vod/vod_04_0195.html)。
     * 若上传的单个媒资大小大于20M，则需要进行二进制流分割后上传，该接口的具体使用方法请参考[示例2：媒资分段上传（20M以上）](https://support.huaweicloud.com/api-vod/vod_04_0216.html)。
     *
     * @param CreateAssetByFileUploadRequest 请求对象
     * @return CompletableFuture<CreateAssetByFileUploadResponse> */
    public CompletableFuture<CreateAssetByFileUploadResponse> createAssetByFileUploadAsync(
        CreateAssetByFileUploadRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.createAssetByFileUpload);
    }

    /** 创建媒资：上传方式 调用该接口创建媒资时，需要将对应的媒资文件上传到点播服务的OBS桶中。
     * 若上传的单媒资文件大小小于20M，则可以直接用PUT方法对该接口返回的地址进行上传。具体使用方法请参考[示例1：媒资上传（20M以下）](https://support.huaweicloud.com/api-vod/vod_04_0195.html)。
     * 若上传的单个媒资大小大于20M，则需要进行二进制流分割后上传，该接口的具体使用方法请参考[示例2：媒资分段上传（20M以上）](https://support.huaweicloud.com/api-vod/vod_04_0216.html)。
     *
     * @param CreateAssetByFileUploadRequest 请求对象
     * @return AsyncInvoker<CreateAssetByFileUploadRequest, CreateAssetByFileUploadResponse> */
    public AsyncInvoker<CreateAssetByFileUploadRequest, CreateAssetByFileUploadResponse> createAssetByFileUploadAsyncInvoker(
        CreateAssetByFileUploadRequest request) {
        return new AsyncInvoker<CreateAssetByFileUploadRequest, CreateAssetByFileUploadResponse>(request,
            VodMeta.createAssetByFileUpload, hcClient);
    }

    /** 创建媒资分类 创建媒资分类。
     *
     * @param CreateAssetCategoryRequest 请求对象
     * @return CompletableFuture<CreateAssetCategoryResponse> */
    public CompletableFuture<CreateAssetCategoryResponse> createAssetCategoryAsync(CreateAssetCategoryRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.createAssetCategory);
    }

    /** 创建媒资分类 创建媒资分类。
     *
     * @param CreateAssetCategoryRequest 请求对象
     * @return AsyncInvoker<CreateAssetCategoryRequest, CreateAssetCategoryResponse> */
    public AsyncInvoker<CreateAssetCategoryRequest, CreateAssetCategoryResponse> createAssetCategoryAsyncInvoker(
        CreateAssetCategoryRequest request) {
        return new AsyncInvoker<CreateAssetCategoryRequest, CreateAssetCategoryResponse>(request,
            VodMeta.createAssetCategory, hcClient);
    }

    /** 媒资处理 实现视频转码、截图、加密等处理。既可以同时启动多种操作，也可以只启动一种操作。
     *
     * @param CreateAssetProcessTaskRequest 请求对象
     * @return CompletableFuture<CreateAssetProcessTaskResponse> */
    public CompletableFuture<CreateAssetProcessTaskResponse> createAssetProcessTaskAsync(
        CreateAssetProcessTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.createAssetProcessTask);
    }

    /** 媒资处理 实现视频转码、截图、加密等处理。既可以同时启动多种操作，也可以只启动一种操作。
     *
     * @param CreateAssetProcessTaskRequest 请求对象
     * @return AsyncInvoker<CreateAssetProcessTaskRequest, CreateAssetProcessTaskResponse> */
    public AsyncInvoker<CreateAssetProcessTaskRequest, CreateAssetProcessTaskResponse> createAssetProcessTaskAsyncInvoker(
        CreateAssetProcessTaskRequest request) {
        return new AsyncInvoker<CreateAssetProcessTaskRequest, CreateAssetProcessTaskResponse>(request,
            VodMeta.createAssetProcessTask, hcClient);
    }

    /** 创建审核媒资任务 对上传的媒资进行审核。审核后，可以调用[查询媒资详细信息](https://support.huaweicloud.com/api-vod/vod_04_0202.html)接口查看审核结果。
     *
     * @param CreateAssetReviewTaskRequest 请求对象
     * @return CompletableFuture<CreateAssetReviewTaskResponse> */
    public CompletableFuture<CreateAssetReviewTaskResponse> createAssetReviewTaskAsync(
        CreateAssetReviewTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.createAssetReviewTask);
    }

    /** 创建审核媒资任务 对上传的媒资进行审核。审核后，可以调用[查询媒资详细信息](https://support.huaweicloud.com/api-vod/vod_04_0202.html)接口查看审核结果。
     *
     * @param CreateAssetReviewTaskRequest 请求对象
     * @return AsyncInvoker<CreateAssetReviewTaskRequest, CreateAssetReviewTaskResponse> */
    public AsyncInvoker<CreateAssetReviewTaskRequest, CreateAssetReviewTaskResponse> createAssetReviewTaskAsyncInvoker(
        CreateAssetReviewTaskRequest request) {
        return new AsyncInvoker<CreateAssetReviewTaskRequest, CreateAssetReviewTaskResponse>(request,
            VodMeta.createAssetReviewTask, hcClient);
    }

    /** 音频提取 用于从已有视频文件中提取音频。
     *
     * @param CreateExtractAudioTaskRequest 请求对象
     * @return CompletableFuture<CreateExtractAudioTaskResponse> */
    public CompletableFuture<CreateExtractAudioTaskResponse> createExtractAudioTaskAsync(
        CreateExtractAudioTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.createExtractAudioTask);
    }

    /** 音频提取 用于从已有视频文件中提取音频。
     *
     * @param CreateExtractAudioTaskRequest 请求对象
     * @return AsyncInvoker<CreateExtractAudioTaskRequest, CreateExtractAudioTaskResponse> */
    public AsyncInvoker<CreateExtractAudioTaskRequest, CreateExtractAudioTaskResponse> createExtractAudioTaskAsyncInvoker(
        CreateExtractAudioTaskRequest request) {
        return new AsyncInvoker<CreateExtractAudioTaskRequest, CreateExtractAudioTaskResponse>(request,
            VodMeta.createExtractAudioTask, hcClient);
    }

    /** CDN预热 媒资发布后，可通过指定媒资ID或URL向CDN预热。用户初次请求时，将由CDN节点提供请求媒资，加快用户下载缓存时间，提高用户体验。
     *
     * @param CreatePreheatingAssetRequest 请求对象
     * @return CompletableFuture<CreatePreheatingAssetResponse> */
    public CompletableFuture<CreatePreheatingAssetResponse> createPreheatingAssetAsync(
        CreatePreheatingAssetRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.createPreheatingAsset);
    }

    /** CDN预热 媒资发布后，可通过指定媒资ID或URL向CDN预热。用户初次请求时，将由CDN节点提供请求媒资，加快用户下载缓存时间，提高用户体验。
     *
     * @param CreatePreheatingAssetRequest 请求对象
     * @return AsyncInvoker<CreatePreheatingAssetRequest, CreatePreheatingAssetResponse> */
    public AsyncInvoker<CreatePreheatingAssetRequest, CreatePreheatingAssetResponse> createPreheatingAssetAsyncInvoker(
        CreatePreheatingAssetRequest request) {
        return new AsyncInvoker<CreatePreheatingAssetRequest, CreatePreheatingAssetResponse>(request,
            VodMeta.createPreheatingAsset, hcClient);
    }

    /** 创建媒资：OBS托管方式 通过存量托管的方式，将已存储在OBS桶中的音视频文件同步到点播服务。
     * OBS托管方式分为增量托管和存量托管，增量托管暂只支持通过视频点播控制台配置，配置后，若OBS有新增音视频文件，则会自动同步到点播服务中，具体请参见[增量托管](https://support.huaweicloud.com/usermanual-vod/vod010032.html)。两个托管方式都需要先将对应的OBS桶授权给点播服务，具体请参见[桶授权](https://support.huaweicloud.com/usermanual-vod/vod010031.html)。
     *
     * @param CreateTakeOverTaskRequest 请求对象
     * @return CompletableFuture<CreateTakeOverTaskResponse> */
    public CompletableFuture<CreateTakeOverTaskResponse> createTakeOverTaskAsync(CreateTakeOverTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.createTakeOverTask);
    }

    /** 创建媒资：OBS托管方式 通过存量托管的方式，将已存储在OBS桶中的音视频文件同步到点播服务。
     * OBS托管方式分为增量托管和存量托管，增量托管暂只支持通过视频点播控制台配置，配置后，若OBS有新增音视频文件，则会自动同步到点播服务中，具体请参见[增量托管](https://support.huaweicloud.com/usermanual-vod/vod010032.html)。两个托管方式都需要先将对应的OBS桶授权给点播服务，具体请参见[桶授权](https://support.huaweicloud.com/usermanual-vod/vod010031.html)。
     *
     * @param CreateTakeOverTaskRequest 请求对象
     * @return AsyncInvoker<CreateTakeOverTaskRequest, CreateTakeOverTaskResponse> */
    public AsyncInvoker<CreateTakeOverTaskRequest, CreateTakeOverTaskResponse> createTakeOverTaskAsyncInvoker(
        CreateTakeOverTaskRequest request) {
        return new AsyncInvoker<CreateTakeOverTaskRequest, CreateTakeOverTaskResponse>(request,
            VodMeta.createTakeOverTask, hcClient);
    }

    /** 创建自定义转码模板组 创建自定义转码模板组。
     *
     * @param CreateTemplateGroupRequest 请求对象
     * @return CompletableFuture<CreateTemplateGroupResponse> */
    public CompletableFuture<CreateTemplateGroupResponse> createTemplateGroupAsync(CreateTemplateGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.createTemplateGroup);
    }

    /** 创建自定义转码模板组 创建自定义转码模板组。
     *
     * @param CreateTemplateGroupRequest 请求对象
     * @return AsyncInvoker<CreateTemplateGroupRequest, CreateTemplateGroupResponse> */
    public AsyncInvoker<CreateTemplateGroupRequest, CreateTemplateGroupResponse> createTemplateGroupAsyncInvoker(
        CreateTemplateGroupRequest request) {
        return new AsyncInvoker<CreateTemplateGroupRequest, CreateTemplateGroupResponse>(request,
            VodMeta.createTemplateGroup, hcClient);
    }

    /** 创建水印模板 创建水印模板。
     *
     * @param CreateWatermarkTemplateRequest 请求对象
     * @return CompletableFuture<CreateWatermarkTemplateResponse> */
    public CompletableFuture<CreateWatermarkTemplateResponse> createWatermarkTemplateAsync(
        CreateWatermarkTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.createWatermarkTemplate);
    }

    /** 创建水印模板 创建水印模板。
     *
     * @param CreateWatermarkTemplateRequest 请求对象
     * @return AsyncInvoker<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse> */
    public AsyncInvoker<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse> createWatermarkTemplateAsyncInvoker(
        CreateWatermarkTemplateRequest request) {
        return new AsyncInvoker<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse>(request,
            VodMeta.createWatermarkTemplate, hcClient);
    }

    /** 删除媒资分类 删除媒资分类。
     *
     * @param DeleteAssetCategoryRequest 请求对象
     * @return CompletableFuture<DeleteAssetCategoryResponse> */
    public CompletableFuture<DeleteAssetCategoryResponse> deleteAssetCategoryAsync(DeleteAssetCategoryRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.deleteAssetCategory);
    }

    /** 删除媒资分类 删除媒资分类。
     *
     * @param DeleteAssetCategoryRequest 请求对象
     * @return AsyncInvoker<DeleteAssetCategoryRequest, DeleteAssetCategoryResponse> */
    public AsyncInvoker<DeleteAssetCategoryRequest, DeleteAssetCategoryResponse> deleteAssetCategoryAsyncInvoker(
        DeleteAssetCategoryRequest request) {
        return new AsyncInvoker<DeleteAssetCategoryRequest, DeleteAssetCategoryResponse>(request,
            VodMeta.deleteAssetCategory, hcClient);
    }

    /** 删除媒资 删除媒资。
     *
     * @param DeleteAssetsRequest 请求对象
     * @return CompletableFuture<DeleteAssetsResponse> */
    public CompletableFuture<DeleteAssetsResponse> deleteAssetsAsync(DeleteAssetsRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.deleteAssets);
    }

    /** 删除媒资 删除媒资。
     *
     * @param DeleteAssetsRequest 请求对象
     * @return AsyncInvoker<DeleteAssetsRequest, DeleteAssetsResponse> */
    public AsyncInvoker<DeleteAssetsRequest, DeleteAssetsResponse> deleteAssetsAsyncInvoker(
        DeleteAssetsRequest request) {
        return new AsyncInvoker<DeleteAssetsRequest, DeleteAssetsResponse>(request, VodMeta.deleteAssets, hcClient);
    }

    /** 删除自定义转码模板组 删除自定义转码模板组。
     *
     * @param DeleteTemplateGroupRequest 请求对象
     * @return CompletableFuture<DeleteTemplateGroupResponse> */
    public CompletableFuture<DeleteTemplateGroupResponse> deleteTemplateGroupAsync(DeleteTemplateGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.deleteTemplateGroup);
    }

    /** 删除自定义转码模板组 删除自定义转码模板组。
     *
     * @param DeleteTemplateGroupRequest 请求对象
     * @return AsyncInvoker<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse> */
    public AsyncInvoker<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse> deleteTemplateGroupAsyncInvoker(
        DeleteTemplateGroupRequest request) {
        return new AsyncInvoker<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse>(request,
            VodMeta.deleteTemplateGroup, hcClient);
    }

    /** 删除水印模板 删除水印模板
     *
     * @param DeleteWatermarkTemplateRequest 请求对象
     * @return CompletableFuture<DeleteWatermarkTemplateResponse> */
    public CompletableFuture<DeleteWatermarkTemplateResponse> deleteWatermarkTemplateAsync(
        DeleteWatermarkTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.deleteWatermarkTemplate);
    }

    /** 删除水印模板 删除水印模板
     *
     * @param DeleteWatermarkTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse> */
    public AsyncInvoker<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse> deleteWatermarkTemplateAsyncInvoker(
        DeleteWatermarkTemplateRequest request) {
        return new AsyncInvoker<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse>(request,
            VodMeta.deleteWatermarkTemplate, hcClient);
    }

    /** 查询指定分类信息 查询指定分类信息，及其子分类（即下一级分类）的列表。
     *
     * @param ListAssetCategoryRequest 请求对象
     * @return CompletableFuture<ListAssetCategoryResponse> */
    public CompletableFuture<ListAssetCategoryResponse> listAssetCategoryAsync(ListAssetCategoryRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.listAssetCategory);
    }

    /** 查询指定分类信息 查询指定分类信息，及其子分类（即下一级分类）的列表。
     *
     * @param ListAssetCategoryRequest 请求对象
     * @return AsyncInvoker<ListAssetCategoryRequest, ListAssetCategoryResponse> */
    public AsyncInvoker<ListAssetCategoryRequest, ListAssetCategoryResponse> listAssetCategoryAsyncInvoker(
        ListAssetCategoryRequest request) {
        return new AsyncInvoker<ListAssetCategoryRequest, ListAssetCategoryResponse>(request, VodMeta.listAssetCategory,
            hcClient);
    }

    /** 查询媒资列表 查询媒资列表，列表中的每一条记录包含媒资的概要信息。
     *
     * @param ListAssetListRequest 请求对象
     * @return CompletableFuture<ListAssetListResponse> */
    public CompletableFuture<ListAssetListResponse> listAssetListAsync(ListAssetListRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.listAssetList);
    }

    /** 查询媒资列表 查询媒资列表，列表中的每一条记录包含媒资的概要信息。
     *
     * @param ListAssetListRequest 请求对象
     * @return AsyncInvoker<ListAssetListRequest, ListAssetListResponse> */
    public AsyncInvoker<ListAssetListRequest, ListAssetListResponse> listAssetListAsyncInvoker(
        ListAssetListRequest request) {
        return new AsyncInvoker<ListAssetListRequest, ListAssetListResponse>(request, VodMeta.listAssetList, hcClient);
    }

    /** 查询转码模板组列表 查询转码模板组列表。
     *
     * @param ListTemplateGroupRequest 请求对象
     * @return CompletableFuture<ListTemplateGroupResponse> */
    public CompletableFuture<ListTemplateGroupResponse> listTemplateGroupAsync(ListTemplateGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.listTemplateGroup);
    }

    /** 查询转码模板组列表 查询转码模板组列表。
     *
     * @param ListTemplateGroupRequest 请求对象
     * @return AsyncInvoker<ListTemplateGroupRequest, ListTemplateGroupResponse> */
    public AsyncInvoker<ListTemplateGroupRequest, ListTemplateGroupResponse> listTemplateGroupAsyncInvoker(
        ListTemplateGroupRequest request) {
        return new AsyncInvoker<ListTemplateGroupRequest, ListTemplateGroupResponse>(request, VodMeta.listTemplateGroup,
            hcClient);
    }

    /** 查询TopN媒资信息 查询指定域名在指定日期播放次数排名Top 100的媒资统计数据。
     *
     * @param ListTopStatisticsRequest 请求对象
     * @return CompletableFuture<ListTopStatisticsResponse> */
    public CompletableFuture<ListTopStatisticsResponse> listTopStatisticsAsync(ListTopStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.listTopStatistics);
    }

    /** 查询TopN媒资信息 查询指定域名在指定日期播放次数排名Top 100的媒资统计数据。
     *
     * @param ListTopStatisticsRequest 请求对象
     * @return AsyncInvoker<ListTopStatisticsRequest, ListTopStatisticsResponse> */
    public AsyncInvoker<ListTopStatisticsRequest, ListTopStatisticsResponse> listTopStatisticsAsyncInvoker(
        ListTopStatisticsRequest request) {
        return new AsyncInvoker<ListTopStatisticsRequest, ListTopStatisticsResponse>(request, VodMeta.listTopStatistics,
            hcClient);
    }

    /** 查询水印列表 查询水印模板
     *
     * @param ListWatermarkTemplateRequest 请求对象
     * @return CompletableFuture<ListWatermarkTemplateResponse> */
    public CompletableFuture<ListWatermarkTemplateResponse> listWatermarkTemplateAsync(
        ListWatermarkTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.listWatermarkTemplate);
    }

    /** 查询水印列表 查询水印模板
     *
     * @param ListWatermarkTemplateRequest 请求对象
     * @return AsyncInvoker<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse> */
    public AsyncInvoker<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse> listWatermarkTemplateAsyncInvoker(
        ListWatermarkTemplateRequest request) {
        return new AsyncInvoker<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse>(request,
            VodMeta.listWatermarkTemplate, hcClient);
    }

    /** 创建媒资：OBS转存方式
     * 若您在使用点播服务前，已经在OBS桶中存储了音视频文件，您可以使用该接口将存储在OBS桶中的音视频文件转存到点播服务中，使用点播服务的音视频管理功能。调用该接口前，您需要调用[桶授权](https://support.huaweicloud.com/api-vod/vod_04_0199.html)接口，将存储音视频文件的OBS桶授权给点播服务。
     *
     * @param PublishAssetFromObsRequest 请求对象
     * @return CompletableFuture<PublishAssetFromObsResponse> */
    public CompletableFuture<PublishAssetFromObsResponse> publishAssetFromObsAsync(PublishAssetFromObsRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.publishAssetFromObs);
    }

    /** 创建媒资：OBS转存方式
     * 若您在使用点播服务前，已经在OBS桶中存储了音视频文件，您可以使用该接口将存储在OBS桶中的音视频文件转存到点播服务中，使用点播服务的音视频管理功能。调用该接口前，您需要调用[桶授权](https://support.huaweicloud.com/api-vod/vod_04_0199.html)接口，将存储音视频文件的OBS桶授权给点播服务。
     *
     * @param PublishAssetFromObsRequest 请求对象
     * @return AsyncInvoker<PublishAssetFromObsRequest, PublishAssetFromObsResponse> */
    public AsyncInvoker<PublishAssetFromObsRequest, PublishAssetFromObsResponse> publishAssetFromObsAsyncInvoker(
        PublishAssetFromObsRequest request) {
        return new AsyncInvoker<PublishAssetFromObsRequest, PublishAssetFromObsResponse>(request,
            VodMeta.publishAssetFromObs, hcClient);
    }

    /** 媒资发布 将媒资设置为发布状态。支持批量发布。
     *
     * @param PublishAssetsRequest 请求对象
     * @return CompletableFuture<PublishAssetsResponse> */
    public CompletableFuture<PublishAssetsResponse> publishAssetsAsync(PublishAssetsRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.publishAssets);
    }

    /** 媒资发布 将媒资设置为发布状态。支持批量发布。
     *
     * @param PublishAssetsRequest 请求对象
     * @return AsyncInvoker<PublishAssetsRequest, PublishAssetsResponse> */
    public AsyncInvoker<PublishAssetsRequest, PublishAssetsResponse> publishAssetsAsyncInvoker(
        PublishAssetsRequest request) {
        return new AsyncInvoker<PublishAssetsRequest, PublishAssetsResponse>(request, VodMeta.publishAssets, hcClient);
    }

    /** 密钥查询
     * 终端播放HLS加密视频时，向租户管理系统请求密钥，租户管理系统先查询其本地有没有已缓存的密钥，没有时则调用此接口向VOD查询。该接口的具体使用场景请参见[通过HLS加密防止视频泄露](https://support.huaweicloud.com/bestpractice-vod/vod_10_0004.html)。
     *
     * @param ShowAssetCipherRequest 请求对象
     * @return CompletableFuture<ShowAssetCipherResponse> */
    public CompletableFuture<ShowAssetCipherResponse> showAssetCipherAsync(ShowAssetCipherRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.showAssetCipher);
    }

    /** 密钥查询
     * 终端播放HLS加密视频时，向租户管理系统请求密钥，租户管理系统先查询其本地有没有已缓存的密钥，没有时则调用此接口向VOD查询。该接口的具体使用场景请参见[通过HLS加密防止视频泄露](https://support.huaweicloud.com/bestpractice-vod/vod_10_0004.html)。
     *
     * @param ShowAssetCipherRequest 请求对象
     * @return AsyncInvoker<ShowAssetCipherRequest, ShowAssetCipherResponse> */
    public AsyncInvoker<ShowAssetCipherRequest, ShowAssetCipherResponse> showAssetCipherAsyncInvoker(
        ShowAssetCipherRequest request) {
        return new AsyncInvoker<ShowAssetCipherRequest, ShowAssetCipherResponse>(request, VodMeta.showAssetCipher,
            hcClient);
    }

    /** 查询指定媒资的详细信息 查询指定媒资的详细信息。
     *
     * @param ShowAssetDetailRequest 请求对象
     * @return CompletableFuture<ShowAssetDetailResponse> */
    public CompletableFuture<ShowAssetDetailResponse> showAssetDetailAsync(ShowAssetDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.showAssetDetail);
    }

    /** 查询指定媒资的详细信息 查询指定媒资的详细信息。
     *
     * @param ShowAssetDetailRequest 请求对象
     * @return AsyncInvoker<ShowAssetDetailRequest, ShowAssetDetailResponse> */
    public AsyncInvoker<ShowAssetDetailRequest, ShowAssetDetailResponse> showAssetDetailAsyncInvoker(
        ShowAssetDetailRequest request) {
        return new AsyncInvoker<ShowAssetDetailRequest, ShowAssetDetailResponse>(request, VodMeta.showAssetDetail,
            hcClient);
    }

    /** 查询媒资信息 查询媒资信息，支持指定媒资ID、分类、状态、起止时间查询。
     *
     * @param ShowAssetMetaRequest 请求对象
     * @return CompletableFuture<ShowAssetMetaResponse> */
    public CompletableFuture<ShowAssetMetaResponse> showAssetMetaAsync(ShowAssetMetaRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.showAssetMeta);
    }

    /** 查询媒资信息 查询媒资信息，支持指定媒资ID、分类、状态、起止时间查询。
     *
     * @param ShowAssetMetaRequest 请求对象
     * @return AsyncInvoker<ShowAssetMetaRequest, ShowAssetMetaResponse> */
    public AsyncInvoker<ShowAssetMetaRequest, ShowAssetMetaResponse> showAssetMetaAsyncInvoker(
        ShowAssetMetaRequest request) {
        return new AsyncInvoker<ShowAssetMetaRequest, ShowAssetMetaResponse>(request, VodMeta.showAssetMeta, hcClient);
    }

    /** 获取分段上传授权 客户端请求创建媒资时，如果媒资文件超过20MB，需采用分段的方式向OBS上传，在每次与OBS交互前，客户端需通过此接口获取到授权方可与OBS交互。
     * 该接口可以获取[初始化多段上传任务](https://support.huaweicloud.com/api-obs/obs_04_0098.html)、[上传段](https://support.huaweicloud.com/api-obs/obs_04_0099.html)、[合并段](https://support.huaweicloud.com/api-obs/obs_04_0102.html)、[列举已上传段](https://support.huaweicloud.com/api-obs/obs_04_0101.html)、[取消段合并](https://support.huaweicloud.com/api-obs/obs_04_0103.html)的带有临时授权的URL，用户需要根据OBS的接口文档配置相应请求的HTTP请求方法、请求头、请求体，然后请求对应的带有临时授权的URL。
     * 视频分段上传方式和OBS的接口文档保持一致，包括HTTP请求方法、请求头、请求体等各种入参，此接口的作用是为用户生成带有鉴权信息的URL（鉴权信息即query_str），用来替换OBS接口中对应的URL，临时给用户开通向点播服务的桶上传文件的权限。
     * 调用获取授权接口时需要传入bucket、object_key、http_verb，其中bucket和object_key是由[创建媒资：上传方式](https://support.huaweicloud.com/api-vod/vod_04_0196.html)接口中返回的响应体中的target字段获得的bucket和object，http_verb需要根据指定的操作选择。
     *
     * @param ShowAssetTempAuthorityRequest 请求对象
     * @return CompletableFuture<ShowAssetTempAuthorityResponse> */
    public CompletableFuture<ShowAssetTempAuthorityResponse> showAssetTempAuthorityAsync(
        ShowAssetTempAuthorityRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.showAssetTempAuthority);
    }

    /** 获取分段上传授权 客户端请求创建媒资时，如果媒资文件超过20MB，需采用分段的方式向OBS上传，在每次与OBS交互前，客户端需通过此接口获取到授权方可与OBS交互。
     * 该接口可以获取[初始化多段上传任务](https://support.huaweicloud.com/api-obs/obs_04_0098.html)、[上传段](https://support.huaweicloud.com/api-obs/obs_04_0099.html)、[合并段](https://support.huaweicloud.com/api-obs/obs_04_0102.html)、[列举已上传段](https://support.huaweicloud.com/api-obs/obs_04_0101.html)、[取消段合并](https://support.huaweicloud.com/api-obs/obs_04_0103.html)的带有临时授权的URL，用户需要根据OBS的接口文档配置相应请求的HTTP请求方法、请求头、请求体，然后请求对应的带有临时授权的URL。
     * 视频分段上传方式和OBS的接口文档保持一致，包括HTTP请求方法、请求头、请求体等各种入参，此接口的作用是为用户生成带有鉴权信息的URL（鉴权信息即query_str），用来替换OBS接口中对应的URL，临时给用户开通向点播服务的桶上传文件的权限。
     * 调用获取授权接口时需要传入bucket、object_key、http_verb，其中bucket和object_key是由[创建媒资：上传方式](https://support.huaweicloud.com/api-vod/vod_04_0196.html)接口中返回的响应体中的target字段获得的bucket和object，http_verb需要根据指定的操作选择。
     *
     * @param ShowAssetTempAuthorityRequest 请求对象
     * @return AsyncInvoker<ShowAssetTempAuthorityRequest, ShowAssetTempAuthorityResponse> */
    public AsyncInvoker<ShowAssetTempAuthorityRequest, ShowAssetTempAuthorityResponse> showAssetTempAuthorityAsyncInvoker(
        ShowAssetTempAuthorityRequest request) {
        return new AsyncInvoker<ShowAssetTempAuthorityRequest, ShowAssetTempAuthorityResponse>(request,
            VodMeta.showAssetTempAuthority, hcClient);
    }

    /** 查询CDN统计信息 查询CDN的统计数据，包括流量、峰值带宽、请求总数、请求命中率、流量命中率。
     *
     * @param ShowCdnStatisticsRequest 请求对象
     * @return CompletableFuture<ShowCdnStatisticsResponse> */
    public CompletableFuture<ShowCdnStatisticsResponse> showCdnStatisticsAsync(ShowCdnStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.showCdnStatistics);
    }

    /** 查询CDN统计信息 查询CDN的统计数据，包括流量、峰值带宽、请求总数、请求命中率、流量命中率。
     *
     * @param ShowCdnStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowCdnStatisticsRequest, ShowCdnStatisticsResponse> */
    public AsyncInvoker<ShowCdnStatisticsRequest, ShowCdnStatisticsResponse> showCdnStatisticsAsyncInvoker(
        ShowCdnStatisticsRequest request) {
        return new AsyncInvoker<ShowCdnStatisticsRequest, ShowCdnStatisticsResponse>(request, VodMeta.showCdnStatistics,
            hcClient);
    }

    /** 查询CDN预热 查询预热结果。
     *
     * @param ShowPreheatingAssetRequest 请求对象
     * @return CompletableFuture<ShowPreheatingAssetResponse> */
    public CompletableFuture<ShowPreheatingAssetResponse> showPreheatingAssetAsync(ShowPreheatingAssetRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.showPreheatingAsset);
    }

    /** 查询CDN预热 查询预热结果。
     *
     * @param ShowPreheatingAssetRequest 请求对象
     * @return AsyncInvoker<ShowPreheatingAssetRequest, ShowPreheatingAssetResponse> */
    public AsyncInvoker<ShowPreheatingAssetRequest, ShowPreheatingAssetResponse> showPreheatingAssetAsyncInvoker(
        ShowPreheatingAssetRequest request) {
        return new AsyncInvoker<ShowPreheatingAssetRequest, ShowPreheatingAssetResponse>(request,
            VodMeta.showPreheatingAsset, hcClient);
    }

    /** 查询源站统计信息 查询点播源站的统计数据，包括流量、存储空间、转码时长。
     *
     * @param ShowVodStatisticsRequest 请求对象
     * @return CompletableFuture<ShowVodStatisticsResponse> */
    public CompletableFuture<ShowVodStatisticsResponse> showVodStatisticsAsync(ShowVodStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.showVodStatistics);
    }

    /** 查询源站统计信息 查询点播源站的统计数据，包括流量、存储空间、转码时长。
     *
     * @param ShowVodStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowVodStatisticsRequest, ShowVodStatisticsResponse> */
    public AsyncInvoker<ShowVodStatisticsRequest, ShowVodStatisticsResponse> showVodStatisticsAsyncInvoker(
        ShowVodStatisticsRequest request) {
        return new AsyncInvoker<ShowVodStatisticsRequest, ShowVodStatisticsResponse>(request, VodMeta.showVodStatistics,
            hcClient);
    }

    /** 媒资发布取消 将媒资设置为未发布状态。
     *
     * @param UnpublishAssetsRequest 请求对象
     * @return CompletableFuture<UnpublishAssetsResponse> */
    public CompletableFuture<UnpublishAssetsResponse> unpublishAssetsAsync(UnpublishAssetsRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.unpublishAssets);
    }

    /** 媒资发布取消 将媒资设置为未发布状态。
     *
     * @param UnpublishAssetsRequest 请求对象
     * @return AsyncInvoker<UnpublishAssetsRequest, UnpublishAssetsResponse> */
    public AsyncInvoker<UnpublishAssetsRequest, UnpublishAssetsResponse> unpublishAssetsAsyncInvoker(
        UnpublishAssetsRequest request) {
        return new AsyncInvoker<UnpublishAssetsRequest, UnpublishAssetsResponse>(request, VodMeta.unpublishAssets,
            hcClient);
    }

    /** 视频更新 媒资创建后，单独上传封面、更新视频文件或更新已有封面。
     * 如果是更新视频文件，更新完后要通过[确认媒资上传](https://support.huaweicloud.com/api-vod/vod_04_0198.html)接口通知点播服务。
     * 如果是更新封面或单独上传封面，则不需通知。
     * 更新视频可以使用分段上传，具体方式可以参考[示例2：媒资分段上传（20M以上）](https://support.huaweicloud.com/api-vod/vod_04_0216.html)。
     *
     * @param UpdateAssetRequest 请求对象
     * @return CompletableFuture<UpdateAssetResponse> */
    public CompletableFuture<UpdateAssetResponse> updateAssetAsync(UpdateAssetRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.updateAsset);
    }

    /** 视频更新 媒资创建后，单独上传封面、更新视频文件或更新已有封面。
     * 如果是更新视频文件，更新完后要通过[确认媒资上传](https://support.huaweicloud.com/api-vod/vod_04_0198.html)接口通知点播服务。
     * 如果是更新封面或单独上传封面，则不需通知。
     * 更新视频可以使用分段上传，具体方式可以参考[示例2：媒资分段上传（20M以上）](https://support.huaweicloud.com/api-vod/vod_04_0216.html)。
     *
     * @param UpdateAssetRequest 请求对象
     * @return AsyncInvoker<UpdateAssetRequest, UpdateAssetResponse> */
    public AsyncInvoker<UpdateAssetRequest, UpdateAssetResponse> updateAssetAsyncInvoker(UpdateAssetRequest request) {
        return new AsyncInvoker<UpdateAssetRequest, UpdateAssetResponse>(request, VodMeta.updateAsset, hcClient);
    }

    /** 修改媒资分类 修改媒资分类。
     *
     * @param UpdateAssetCategoryRequest 请求对象
     * @return CompletableFuture<UpdateAssetCategoryResponse> */
    public CompletableFuture<UpdateAssetCategoryResponse> updateAssetCategoryAsync(UpdateAssetCategoryRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.updateAssetCategory);
    }

    /** 修改媒资分类 修改媒资分类。
     *
     * @param UpdateAssetCategoryRequest 请求对象
     * @return AsyncInvoker<UpdateAssetCategoryRequest, UpdateAssetCategoryResponse> */
    public AsyncInvoker<UpdateAssetCategoryRequest, UpdateAssetCategoryResponse> updateAssetCategoryAsyncInvoker(
        UpdateAssetCategoryRequest request) {
        return new AsyncInvoker<UpdateAssetCategoryRequest, UpdateAssetCategoryResponse>(request,
            VodMeta.updateAssetCategory, hcClient);
    }

    /** 修改媒资属性 修改媒资属性。
     *
     * @param UpdateAssetMetaRequest 请求对象
     * @return CompletableFuture<UpdateAssetMetaResponse> */
    public CompletableFuture<UpdateAssetMetaResponse> updateAssetMetaAsync(UpdateAssetMetaRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.updateAssetMeta);
    }

    /** 修改媒资属性 修改媒资属性。
     *
     * @param UpdateAssetMetaRequest 请求对象
     * @return AsyncInvoker<UpdateAssetMetaRequest, UpdateAssetMetaResponse> */
    public AsyncInvoker<UpdateAssetMetaRequest, UpdateAssetMetaResponse> updateAssetMetaAsyncInvoker(
        UpdateAssetMetaRequest request) {
        return new AsyncInvoker<UpdateAssetMetaRequest, UpdateAssetMetaResponse>(request, VodMeta.updateAssetMeta,
            hcClient);
    }

    /** 桶授权 用户可以通过该接口将OBS桶授权给点播服务或取消点播服务的授权。
     *
     * @param UpdateBucketAuthorizedRequest 请求对象
     * @return CompletableFuture<UpdateBucketAuthorizedResponse> */
    public CompletableFuture<UpdateBucketAuthorizedResponse> updateBucketAuthorizedAsync(
        UpdateBucketAuthorizedRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.updateBucketAuthorized);
    }

    /** 桶授权 用户可以通过该接口将OBS桶授权给点播服务或取消点播服务的授权。
     *
     * @param UpdateBucketAuthorizedRequest 请求对象
     * @return AsyncInvoker<UpdateBucketAuthorizedRequest, UpdateBucketAuthorizedResponse> */
    public AsyncInvoker<UpdateBucketAuthorizedRequest, UpdateBucketAuthorizedResponse> updateBucketAuthorizedAsyncInvoker(
        UpdateBucketAuthorizedRequest request) {
        return new AsyncInvoker<UpdateBucketAuthorizedRequest, UpdateBucketAuthorizedResponse>(request,
            VodMeta.updateBucketAuthorized, hcClient);
    }

    /** 设置封面 将视频截图生成的某张图片设置成封面。
     *
     * @param UpdateCoverByThumbnailRequest 请求对象
     * @return CompletableFuture<UpdateCoverByThumbnailResponse> */
    public CompletableFuture<UpdateCoverByThumbnailResponse> updateCoverByThumbnailAsync(
        UpdateCoverByThumbnailRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.updateCoverByThumbnail);
    }

    /** 设置封面 将视频截图生成的某张图片设置成封面。
     *
     * @param UpdateCoverByThumbnailRequest 请求对象
     * @return AsyncInvoker<UpdateCoverByThumbnailRequest, UpdateCoverByThumbnailResponse> */
    public AsyncInvoker<UpdateCoverByThumbnailRequest, UpdateCoverByThumbnailResponse> updateCoverByThumbnailAsyncInvoker(
        UpdateCoverByThumbnailRequest request) {
        return new AsyncInvoker<UpdateCoverByThumbnailRequest, UpdateCoverByThumbnailResponse>(request,
            VodMeta.updateCoverByThumbnail, hcClient);
    }

    /** 修改自定义转码模板组 修改自定义转码模板组。
     *
     * @param UpdateTemplateGroupRequest 请求对象
     * @return CompletableFuture<UpdateTemplateGroupResponse> */
    public CompletableFuture<UpdateTemplateGroupResponse> updateTemplateGroupAsync(UpdateTemplateGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.updateTemplateGroup);
    }

    /** 修改自定义转码模板组 修改自定义转码模板组。
     *
     * @param UpdateTemplateGroupRequest 请求对象
     * @return AsyncInvoker<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse> */
    public AsyncInvoker<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse> updateTemplateGroupAsyncInvoker(
        UpdateTemplateGroupRequest request) {
        return new AsyncInvoker<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse>(request,
            VodMeta.updateTemplateGroup, hcClient);
    }

    /** 修改水印模板 修改水印模板
     *
     * @param UpdateWatermarkTemplateRequest 请求对象
     * @return CompletableFuture<UpdateWatermarkTemplateResponse> */
    public CompletableFuture<UpdateWatermarkTemplateResponse> updateWatermarkTemplateAsync(
        UpdateWatermarkTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.updateWatermarkTemplate);
    }

    /** 修改水印模板 修改水印模板
     *
     * @param UpdateWatermarkTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse> */
    public AsyncInvoker<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse> updateWatermarkTemplateAsyncInvoker(
        UpdateWatermarkTemplateRequest request) {
        return new AsyncInvoker<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse>(request,
            VodMeta.updateWatermarkTemplate, hcClient);
    }

    /** 创建媒资：URL拉取注入 基于音视频源文件URL，将音视频文件离线拉取上传到点播服务。
     *
     * @param UploadMetaDataByUrlRequest 请求对象
     * @return CompletableFuture<UploadMetaDataByUrlResponse> */
    public CompletableFuture<UploadMetaDataByUrlResponse> uploadMetaDataByUrlAsync(UploadMetaDataByUrlRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.uploadMetaDataByUrl);
    }

    /** 创建媒资：URL拉取注入 基于音视频源文件URL，将音视频文件离线拉取上传到点播服务。
     *
     * @param UploadMetaDataByUrlRequest 请求对象
     * @return AsyncInvoker<UploadMetaDataByUrlRequest, UploadMetaDataByUrlResponse> */
    public AsyncInvoker<UploadMetaDataByUrlRequest, UploadMetaDataByUrlResponse> uploadMetaDataByUrlAsyncInvoker(
        UploadMetaDataByUrlRequest request) {
        return new AsyncInvoker<UploadMetaDataByUrlRequest, UploadMetaDataByUrlResponse>(request,
            VodMeta.uploadMetaDataByUrl, hcClient);
    }

    /** 查询托管任务 查询OBS存量托管任务列表。
     *
     * @param ListTakeOverTaskRequest 请求对象
     * @return CompletableFuture<ListTakeOverTaskResponse> */
    public CompletableFuture<ListTakeOverTaskResponse> listTakeOverTaskAsync(ListTakeOverTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.listTakeOverTask);
    }

    /** 查询托管任务 查询OBS存量托管任务列表。
     *
     * @param ListTakeOverTaskRequest 请求对象
     * @return AsyncInvoker<ListTakeOverTaskRequest, ListTakeOverTaskResponse> */
    public AsyncInvoker<ListTakeOverTaskRequest, ListTakeOverTaskResponse> listTakeOverTaskAsyncInvoker(
        ListTakeOverTaskRequest request) {
        return new AsyncInvoker<ListTakeOverTaskRequest, ListTakeOverTaskResponse>(request, VodMeta.listTakeOverTask,
            hcClient);
    }

    /** 查询托管媒资详情 查询OBS托管媒资的详细信息。
     *
     * @param ShowTakeOverAssetDetailsRequest 请求对象
     * @return CompletableFuture<ShowTakeOverAssetDetailsResponse> */
    public CompletableFuture<ShowTakeOverAssetDetailsResponse> showTakeOverAssetDetailsAsync(
        ShowTakeOverAssetDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.showTakeOverAssetDetails);
    }

    /** 查询托管媒资详情 查询OBS托管媒资的详细信息。
     *
     * @param ShowTakeOverAssetDetailsRequest 请求对象
     * @return AsyncInvoker<ShowTakeOverAssetDetailsRequest, ShowTakeOverAssetDetailsResponse> */
    public AsyncInvoker<ShowTakeOverAssetDetailsRequest, ShowTakeOverAssetDetailsResponse> showTakeOverAssetDetailsAsyncInvoker(
        ShowTakeOverAssetDetailsRequest request) {
        return new AsyncInvoker<ShowTakeOverAssetDetailsRequest, ShowTakeOverAssetDetailsResponse>(request,
            VodMeta.showTakeOverAssetDetails, hcClient);
    }

    /** 查询托管任务详情 查询OBS存量托管任务详情。
     *
     * @param ShowTakeOverTaskDetailsRequest 请求对象
     * @return CompletableFuture<ShowTakeOverTaskDetailsResponse> */
    public CompletableFuture<ShowTakeOverTaskDetailsResponse> showTakeOverTaskDetailsAsync(
        ShowTakeOverTaskDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.showTakeOverTaskDetails);
    }

    /** 查询托管任务详情 查询OBS存量托管任务详情。
     *
     * @param ShowTakeOverTaskDetailsRequest 请求对象
     * @return AsyncInvoker<ShowTakeOverTaskDetailsRequest, ShowTakeOverTaskDetailsResponse> */
    public AsyncInvoker<ShowTakeOverTaskDetailsRequest, ShowTakeOverTaskDetailsResponse> showTakeOverTaskDetailsAsyncInvoker(
        ShowTakeOverTaskDetailsRequest request) {
        return new AsyncInvoker<ShowTakeOverTaskDetailsRequest, ShowTakeOverTaskDetailsResponse>(request,
            VodMeta.showTakeOverTaskDetails, hcClient);
    }

}

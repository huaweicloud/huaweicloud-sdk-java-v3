package com.huaweicloud.sdk.vod.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.vod.v1.model.*;

public class VodAsyncClient {
    protected HcClient hcClient;

    public VodAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VodAsyncClient> newBuilder() {
        return new ClientBuilder<>(VodAsyncClient::new);
    }


    /**
     * 取消媒资转码任务
     * ## 典型场景 ##   取消媒资转码任务。&lt;br/&gt;  ## 接口功能 ##   取消媒资转码任务，只能取消排队中的转码任务。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param CancelAssetTranscodeTaskRequest 请求对象
     * @return CompletableFuture<CancelAssetTranscodeTaskResponse>
     */
    public CompletableFuture<CancelAssetTranscodeTaskResponse> cancelAssetTranscodeTaskAsync(CancelAssetTranscodeTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.cancelAssetTranscodeTask);
    }

    /**
     * 取消媒资转码任务
     * ## 典型场景 ##   取消媒资转码任务。&lt;br/&gt;  ## 接口功能 ##   取消媒资转码任务，只能取消排队中的转码任务。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param CancelAssetTranscodeTaskRequest 请求对象
     * @return AsyncInvoker<CancelAssetTranscodeTaskRequest, CancelAssetTranscodeTaskResponse>
     */
    public AsyncInvoker<CancelAssetTranscodeTaskRequest, CancelAssetTranscodeTaskResponse> cancelAssetTranscodeTaskAsyncInvoker(CancelAssetTranscodeTaskRequest request) {
        return new AsyncInvoker<CancelAssetTranscodeTaskRequest, CancelAssetTranscodeTaskResponse>(request, VodMeta.cancelAssetTranscodeTask, hcClient);
    }

    /**
     * 取消提取音频任务
     * ## 典型场景 ##   取消提取音频任务调用此接口&lt;br/&gt;  ## 接口功能 ##   取消提取音频任务，只有排队中的音频任务才可以取消&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param CancelExtractAudioTaskRequest 请求对象
     * @return CompletableFuture<CancelExtractAudioTaskResponse>
     */
    public CompletableFuture<CancelExtractAudioTaskResponse> cancelExtractAudioTaskAsync(CancelExtractAudioTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.cancelExtractAudioTask);
    }

    /**
     * 取消提取音频任务
     * ## 典型场景 ##   取消提取音频任务调用此接口&lt;br/&gt;  ## 接口功能 ##   取消提取音频任务，只有排队中的音频任务才可以取消&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param CancelExtractAudioTaskRequest 请求对象
     * @return AsyncInvoker<CancelExtractAudioTaskRequest, CancelExtractAudioTaskResponse>
     */
    public AsyncInvoker<CancelExtractAudioTaskRequest, CancelExtractAudioTaskResponse> cancelExtractAudioTaskAsyncInvoker(CancelExtractAudioTaskRequest request) {
        return new AsyncInvoker<CancelExtractAudioTaskRequest, CancelExtractAudioTaskResponse>(request, VodMeta.cancelExtractAudioTask, hcClient);
    }

    /**
     * 文件上传MD5校验
     * 查询音视频MD5是否重复
     *
     * @param CheckMd5DuplicationRequest 请求对象
     * @return CompletableFuture<CheckMd5DuplicationResponse>
     */
    public CompletableFuture<CheckMd5DuplicationResponse> checkMd5DuplicationAsync(CheckMd5DuplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.checkMd5Duplication);
    }

    /**
     * 文件上传MD5校验
     * 查询音视频MD5是否重复
     *
     * @param CheckMd5DuplicationRequest 请求对象
     * @return AsyncInvoker<CheckMd5DuplicationRequest, CheckMd5DuplicationResponse>
     */
    public AsyncInvoker<CheckMd5DuplicationRequest, CheckMd5DuplicationResponse> checkMd5DuplicationAsyncInvoker(CheckMd5DuplicationRequest request) {
        return new AsyncInvoker<CheckMd5DuplicationRequest, CheckMd5DuplicationResponse>(request, VodMeta.checkMd5Duplication, hcClient);
    }

    /**
     * 确认媒资上传
     * ## 典型场景 ##   确认媒资上传时调用此接口。&lt;br/&gt;  ## 接口功能 ##   确认媒资上传。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param ConfirmAssetUploadRequest 请求对象
     * @return CompletableFuture<ConfirmAssetUploadResponse>
     */
    public CompletableFuture<ConfirmAssetUploadResponse> confirmAssetUploadAsync(ConfirmAssetUploadRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.confirmAssetUpload);
    }

    /**
     * 确认媒资上传
     * ## 典型场景 ##   确认媒资上传时调用此接口。&lt;br/&gt;  ## 接口功能 ##   确认媒资上传。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param ConfirmAssetUploadRequest 请求对象
     * @return AsyncInvoker<ConfirmAssetUploadRequest, ConfirmAssetUploadResponse>
     */
    public AsyncInvoker<ConfirmAssetUploadRequest, ConfirmAssetUploadResponse> confirmAssetUploadAsyncInvoker(ConfirmAssetUploadRequest request) {
        return new AsyncInvoker<ConfirmAssetUploadRequest, ConfirmAssetUploadResponse>(request, VodMeta.confirmAssetUpload, hcClient);
    }

    /**
     * 确认水印图片上传
     * ## 典型场景 ##   确认水印图片上传调用此接口&lt;br/&gt;  ## 接口功能 ##   确认水印图片是否已经上传至对象存储&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param ConfirmImageUploadRequest 请求对象
     * @return CompletableFuture<ConfirmImageUploadResponse>
     */
    public CompletableFuture<ConfirmImageUploadResponse> confirmImageUploadAsync(ConfirmImageUploadRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.confirmImageUpload);
    }

    /**
     * 确认水印图片上传
     * ## 典型场景 ##   确认水印图片上传调用此接口&lt;br/&gt;  ## 接口功能 ##   确认水印图片是否已经上传至对象存储&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param ConfirmImageUploadRequest 请求对象
     * @return AsyncInvoker<ConfirmImageUploadRequest, ConfirmImageUploadResponse>
     */
    public AsyncInvoker<ConfirmImageUploadRequest, ConfirmImageUploadResponse> confirmImageUploadAsyncInvoker(ConfirmImageUploadRequest request) {
        return new AsyncInvoker<ConfirmImageUploadRequest, ConfirmImageUploadResponse>(request, VodMeta.confirmImageUpload, hcClient);
    }

    /**
     * 上传方式创建媒资
     * 上传方式创建媒资。
     *
     * @param CreateAssetByFileUploadRequest 请求对象
     * @return CompletableFuture<CreateAssetByFileUploadResponse>
     */
    public CompletableFuture<CreateAssetByFileUploadResponse> createAssetByFileUploadAsync(CreateAssetByFileUploadRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.createAssetByFileUpload);
    }

    /**
     * 上传方式创建媒资
     * 上传方式创建媒资。
     *
     * @param CreateAssetByFileUploadRequest 请求对象
     * @return AsyncInvoker<CreateAssetByFileUploadRequest, CreateAssetByFileUploadResponse>
     */
    public AsyncInvoker<CreateAssetByFileUploadRequest, CreateAssetByFileUploadResponse> createAssetByFileUploadAsyncInvoker(CreateAssetByFileUploadRequest request) {
        return new AsyncInvoker<CreateAssetByFileUploadRequest, CreateAssetByFileUploadResponse>(request, VodMeta.createAssetByFileUpload, hcClient);
    }

    /**
     * 创建媒资分类
     * ## 典型场景 ##   创建媒资分类。&lt;br/&gt;  ## 接口功能 ##   创建媒资分类。&lt;br/&gt;  ## 接口约束 ##   最大支持三级分类，每个分类最多支持创建128个子分类。&lt;br/&gt; 
     *
     * @param CreateAssetCategoryRequest 请求对象
     * @return CompletableFuture<CreateAssetCategoryResponse>
     */
    public CompletableFuture<CreateAssetCategoryResponse> createAssetCategoryAsync(CreateAssetCategoryRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.createAssetCategory);
    }

    /**
     * 创建媒资分类
     * ## 典型场景 ##   创建媒资分类。&lt;br/&gt;  ## 接口功能 ##   创建媒资分类。&lt;br/&gt;  ## 接口约束 ##   最大支持三级分类，每个分类最多支持创建128个子分类。&lt;br/&gt; 
     *
     * @param CreateAssetCategoryRequest 请求对象
     * @return AsyncInvoker<CreateAssetCategoryRequest, CreateAssetCategoryResponse>
     */
    public AsyncInvoker<CreateAssetCategoryRequest, CreateAssetCategoryResponse> createAssetCategoryAsyncInvoker(CreateAssetCategoryRequest request) {
        return new AsyncInvoker<CreateAssetCategoryRequest, CreateAssetCategoryResponse>(request, VodMeta.createAssetCategory, hcClient);
    }

    /**
     * 媒资处理
     * ## 典型场景 ##   媒资处理。&lt;br/&gt;  ## 接口功能 ##   媒资处理。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param CreateAssetProcessTaskRequest 请求对象
     * @return CompletableFuture<CreateAssetProcessTaskResponse>
     */
    public CompletableFuture<CreateAssetProcessTaskResponse> createAssetProcessTaskAsync(CreateAssetProcessTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.createAssetProcessTask);
    }

    /**
     * 媒资处理
     * ## 典型场景 ##   媒资处理。&lt;br/&gt;  ## 接口功能 ##   媒资处理。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param CreateAssetProcessTaskRequest 请求对象
     * @return AsyncInvoker<CreateAssetProcessTaskRequest, CreateAssetProcessTaskResponse>
     */
    public AsyncInvoker<CreateAssetProcessTaskRequest, CreateAssetProcessTaskResponse> createAssetProcessTaskAsyncInvoker(CreateAssetProcessTaskRequest request) {
        return new AsyncInvoker<CreateAssetProcessTaskRequest, CreateAssetProcessTaskResponse>(request, VodMeta.createAssetProcessTask, hcClient);
    }

    /**
     * 创建审核媒资任务
     * 媒资审核接口
     *
     * @param CreateAssetReviewTaskRequest 请求对象
     * @return CompletableFuture<CreateAssetReviewTaskResponse>
     */
    public CompletableFuture<CreateAssetReviewTaskResponse> createAssetReviewTaskAsync(CreateAssetReviewTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.createAssetReviewTask);
    }

    /**
     * 创建审核媒资任务
     * 媒资审核接口
     *
     * @param CreateAssetReviewTaskRequest 请求对象
     * @return AsyncInvoker<CreateAssetReviewTaskRequest, CreateAssetReviewTaskResponse>
     */
    public AsyncInvoker<CreateAssetReviewTaskRequest, CreateAssetReviewTaskResponse> createAssetReviewTaskAsyncInvoker(CreateAssetReviewTaskRequest request) {
        return new AsyncInvoker<CreateAssetReviewTaskRequest, CreateAssetReviewTaskResponse>(request, VodMeta.createAssetReviewTask, hcClient);
    }

    /**
     * 视频媒资提取音频
     * ## 典型场景 ##   从媒资中提取音频调用此接口&lt;br/&gt;  ## 接口功能 ##   视频媒资提取音频&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param CreateExtractAudioTaskRequest 请求对象
     * @return CompletableFuture<CreateExtractAudioTaskResponse>
     */
    public CompletableFuture<CreateExtractAudioTaskResponse> createExtractAudioTaskAsync(CreateExtractAudioTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.createExtractAudioTask);
    }

    /**
     * 视频媒资提取音频
     * ## 典型场景 ##   从媒资中提取音频调用此接口&lt;br/&gt;  ## 接口功能 ##   视频媒资提取音频&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param CreateExtractAudioTaskRequest 请求对象
     * @return AsyncInvoker<CreateExtractAudioTaskRequest, CreateExtractAudioTaskResponse>
     */
    public AsyncInvoker<CreateExtractAudioTaskRequest, CreateExtractAudioTaskResponse> createExtractAudioTaskAsyncInvoker(CreateExtractAudioTaskRequest request) {
        return new AsyncInvoker<CreateExtractAudioTaskRequest, CreateExtractAudioTaskResponse>(request, VodMeta.createExtractAudioTask, hcClient);
    }

    /**
     * 创建自定义模板组
     * ## 典型场景 ##   创建自定义模板组时调用此接口。&lt;br/&gt;  ## 接口功能 ##   创建模板组。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param CreateTemplateGroupRequest 请求对象
     * @return CompletableFuture<CreateTemplateGroupResponse>
     */
    public CompletableFuture<CreateTemplateGroupResponse> createTemplateGroupAsync(CreateTemplateGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.createTemplateGroup);
    }

    /**
     * 创建自定义模板组
     * ## 典型场景 ##   创建自定义模板组时调用此接口。&lt;br/&gt;  ## 接口功能 ##   创建模板组。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param CreateTemplateGroupRequest 请求对象
     * @return AsyncInvoker<CreateTemplateGroupRequest, CreateTemplateGroupResponse>
     */
    public AsyncInvoker<CreateTemplateGroupRequest, CreateTemplateGroupResponse> createTemplateGroupAsyncInvoker(CreateTemplateGroupRequest request) {
        return new AsyncInvoker<CreateTemplateGroupRequest, CreateTemplateGroupResponse>(request, VodMeta.createTemplateGroup, hcClient);
    }

    /**
     * 创建水印模板
     * ## 典型场景 ##   创建水印模板调用此接口&lt;br/&gt;  ## 接口功能 ##   创建水印模板&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param CreateWatermarkTemplateRequest 请求对象
     * @return CompletableFuture<CreateWatermarkTemplateResponse>
     */
    public CompletableFuture<CreateWatermarkTemplateResponse> createWatermarkTemplateAsync(CreateWatermarkTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.createWatermarkTemplate);
    }

    /**
     * 创建水印模板
     * ## 典型场景 ##   创建水印模板调用此接口&lt;br/&gt;  ## 接口功能 ##   创建水印模板&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param CreateWatermarkTemplateRequest 请求对象
     * @return AsyncInvoker<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse>
     */
    public AsyncInvoker<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse> createWatermarkTemplateAsyncInvoker(CreateWatermarkTemplateRequest request) {
        return new AsyncInvoker<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse>(request, VodMeta.createWatermarkTemplate, hcClient);
    }

    /**
     * 删除媒资分类
     * ## 典型场景 ##   删除媒资分类。&lt;br/&gt;  ## 接口功能 ##   删除媒资分类。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param DeleteAssetCategoryRequest 请求对象
     * @return CompletableFuture<DeleteAssetCategoryResponse>
     */
    public CompletableFuture<DeleteAssetCategoryResponse> deleteAssetCategoryAsync(DeleteAssetCategoryRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.deleteAssetCategory);
    }

    /**
     * 删除媒资分类
     * ## 典型场景 ##   删除媒资分类。&lt;br/&gt;  ## 接口功能 ##   删除媒资分类。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param DeleteAssetCategoryRequest 请求对象
     * @return AsyncInvoker<DeleteAssetCategoryRequest, DeleteAssetCategoryResponse>
     */
    public AsyncInvoker<DeleteAssetCategoryRequest, DeleteAssetCategoryResponse> deleteAssetCategoryAsyncInvoker(DeleteAssetCategoryRequest request) {
        return new AsyncInvoker<DeleteAssetCategoryRequest, DeleteAssetCategoryResponse>(request, VodMeta.deleteAssetCategory, hcClient);
    }

    /**
     * 删除媒资，支持批量删除
     * ## 典型场景 ##   删除媒资，支持批量删除。&lt;br/&gt;  ## 接口功能 ##   删除媒资，支持批量删除。&lt;br/&gt;  ## 接口约束 ##   最多删除十个。&lt;br/&gt; 
     *
     * @param DeleteAssetsRequest 请求对象
     * @return CompletableFuture<DeleteAssetsResponse>
     */
    public CompletableFuture<DeleteAssetsResponse> deleteAssetsAsync(DeleteAssetsRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.deleteAssets);
    }

    /**
     * 删除媒资，支持批量删除
     * ## 典型场景 ##   删除媒资，支持批量删除。&lt;br/&gt;  ## 接口功能 ##   删除媒资，支持批量删除。&lt;br/&gt;  ## 接口约束 ##   最多删除十个。&lt;br/&gt; 
     *
     * @param DeleteAssetsRequest 请求对象
     * @return AsyncInvoker<DeleteAssetsRequest, DeleteAssetsResponse>
     */
    public AsyncInvoker<DeleteAssetsRequest, DeleteAssetsResponse> deleteAssetsAsyncInvoker(DeleteAssetsRequest request) {
        return new AsyncInvoker<DeleteAssetsRequest, DeleteAssetsResponse>(request, VodMeta.deleteAssets, hcClient);
    }

    /**
     * 删除自定义模板组
     * ## 典型场景 ##   删除自定义模板组接口。&lt;br/&gt;  ## 接口功能 ##   删除自定义模板组。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param DeleteTemplateGroupRequest 请求对象
     * @return CompletableFuture<DeleteTemplateGroupResponse>
     */
    public CompletableFuture<DeleteTemplateGroupResponse> deleteTemplateGroupAsync(DeleteTemplateGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.deleteTemplateGroup);
    }

    /**
     * 删除自定义模板组
     * ## 典型场景 ##   删除自定义模板组接口。&lt;br/&gt;  ## 接口功能 ##   删除自定义模板组。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param DeleteTemplateGroupRequest 请求对象
     * @return AsyncInvoker<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse>
     */
    public AsyncInvoker<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse> deleteTemplateGroupAsyncInvoker(DeleteTemplateGroupRequest request) {
        return new AsyncInvoker<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse>(request, VodMeta.deleteTemplateGroup, hcClient);
    }

    /**
     * 删除水印模板
     * ## 典型场景 ##   删除水印模板&lt;br/&gt;  ## 接口功能 ##   删除水印模板&lt;br/&gt;  ## 接口约束 ##   无&lt;br/&gt; 
     *
     * @param DeleteWatermarkTemplateRequest 请求对象
     * @return CompletableFuture<DeleteWatermarkTemplateResponse>
     */
    public CompletableFuture<DeleteWatermarkTemplateResponse> deleteWatermarkTemplateAsync(DeleteWatermarkTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.deleteWatermarkTemplate);
    }

    /**
     * 删除水印模板
     * ## 典型场景 ##   删除水印模板&lt;br/&gt;  ## 接口功能 ##   删除水印模板&lt;br/&gt;  ## 接口约束 ##   无&lt;br/&gt; 
     *
     * @param DeleteWatermarkTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse>
     */
    public AsyncInvoker<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse> deleteWatermarkTemplateAsyncInvoker(DeleteWatermarkTemplateRequest request) {
        return new AsyncInvoker<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse>(request, VodMeta.deleteWatermarkTemplate, hcClient);
    }

    /**
     * 查询指定分类信息
     * ## 典型场景 ##   查询指定分类信息，及其子分类（即下一级分类）的列表。&lt;br/&gt;  ## 接口功能 ##   查询指定分类信息。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param ListAssetCategoryRequest 请求对象
     * @return CompletableFuture<ListAssetCategoryResponse>
     */
    public CompletableFuture<ListAssetCategoryResponse> listAssetCategoryAsync(ListAssetCategoryRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.listAssetCategory);
    }

    /**
     * 查询指定分类信息
     * ## 典型场景 ##   查询指定分类信息，及其子分类（即下一级分类）的列表。&lt;br/&gt;  ## 接口功能 ##   查询指定分类信息。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param ListAssetCategoryRequest 请求对象
     * @return AsyncInvoker<ListAssetCategoryRequest, ListAssetCategoryResponse>
     */
    public AsyncInvoker<ListAssetCategoryRequest, ListAssetCategoryResponse> listAssetCategoryAsyncInvoker(ListAssetCategoryRequest request) {
        return new AsyncInvoker<ListAssetCategoryRequest, ListAssetCategoryResponse>(request, VodMeta.listAssetCategory, hcClient);
    }

    /**
     * 查询媒资列表
     * 查询媒资列表
     *
     * @param ListAssetListRequest 请求对象
     * @return CompletableFuture<ListAssetListResponse>
     */
    public CompletableFuture<ListAssetListResponse> listAssetListAsync(ListAssetListRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.listAssetList);
    }

    /**
     * 查询媒资列表
     * 查询媒资列表
     *
     * @param ListAssetListRequest 请求对象
     * @return AsyncInvoker<ListAssetListRequest, ListAssetListResponse>
     */
    public AsyncInvoker<ListAssetListRequest, ListAssetListResponse> listAssetListAsyncInvoker(ListAssetListRequest request) {
        return new AsyncInvoker<ListAssetListRequest, ListAssetListResponse>(request, VodMeta.listAssetList, hcClient);
    }

    /**
     * 查询模板组列表
     * ## 典型场景 ##   查询模板组列表调用此接口。&lt;br/&gt;  ## 接口功能 ##   查询模板组列表。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param ListTemplateGroupRequest 请求对象
     * @return CompletableFuture<ListTemplateGroupResponse>
     */
    public CompletableFuture<ListTemplateGroupResponse> listTemplateGroupAsync(ListTemplateGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.listTemplateGroup);
    }

    /**
     * 查询模板组列表
     * ## 典型场景 ##   查询模板组列表调用此接口。&lt;br/&gt;  ## 接口功能 ##   查询模板组列表。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param ListTemplateGroupRequest 请求对象
     * @return AsyncInvoker<ListTemplateGroupRequest, ListTemplateGroupResponse>
     */
    public AsyncInvoker<ListTemplateGroupRequest, ListTemplateGroupResponse> listTemplateGroupAsyncInvoker(ListTemplateGroupRequest request) {
        return new AsyncInvoker<ListTemplateGroupRequest, ListTemplateGroupResponse>(request, VodMeta.listTemplateGroup, hcClient);
    }

    /**
     * 查询TopN播放视频信息
     * ## 典型场景 ##  查询TopN播放视频信息 。&lt;br/&gt;  ## 接口功能 ##  查询TopN播放视频信息 。&lt;br/&gt;  ##  接口约束 ##   无。&lt;br/&gt; 
     *
     * @param ListTopStatisticsRequest 请求对象
     * @return CompletableFuture<ListTopStatisticsResponse>
     */
    public CompletableFuture<ListTopStatisticsResponse> listTopStatisticsAsync(ListTopStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.listTopStatistics);
    }

    /**
     * 查询TopN播放视频信息
     * ## 典型场景 ##  查询TopN播放视频信息 。&lt;br/&gt;  ## 接口功能 ##  查询TopN播放视频信息 。&lt;br/&gt;  ##  接口约束 ##   无。&lt;br/&gt; 
     *
     * @param ListTopStatisticsRequest 请求对象
     * @return AsyncInvoker<ListTopStatisticsRequest, ListTopStatisticsResponse>
     */
    public AsyncInvoker<ListTopStatisticsRequest, ListTopStatisticsResponse> listTopStatisticsAsyncInvoker(ListTopStatisticsRequest request) {
        return new AsyncInvoker<ListTopStatisticsRequest, ListTopStatisticsResponse>(request, VodMeta.listTopStatistics, hcClient);
    }

    /**
     * 查询水印列表
     * ## 典型场景 ##   查询水印模板&lt;br/&gt;  ## 接口功能 ##   查询水印模板&lt;br/&gt;  ## 接口约束 ##   查询所有水印&lt;br/&gt; 
     *
     * @param ListWatermarkTemplateRequest 请求对象
     * @return CompletableFuture<ListWatermarkTemplateResponse>
     */
    public CompletableFuture<ListWatermarkTemplateResponse> listWatermarkTemplateAsync(ListWatermarkTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.listWatermarkTemplate);
    }

    /**
     * 查询水印列表
     * ## 典型场景 ##   查询水印模板&lt;br/&gt;  ## 接口功能 ##   查询水印模板&lt;br/&gt;  ## 接口约束 ##   查询所有水印&lt;br/&gt; 
     *
     * @param ListWatermarkTemplateRequest 请求对象
     * @return AsyncInvoker<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse>
     */
    public AsyncInvoker<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse> listWatermarkTemplateAsyncInvoker(ListWatermarkTemplateRequest request) {
        return new AsyncInvoker<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse>(request, VodMeta.listWatermarkTemplate, hcClient);
    }

    /**
     * 从OBS一键发布媒资
     * ## 典型场景 ##   从OBS转存媒资,一键发布。&lt;br/&gt;  ## 接口功能 ##    在OBS中的媒资一键发布到VOD。&lt;br/&gt;  ## 接口约束 ##   OBS的桶必须先授权给VOD服务用户。&lt;br/&gt; 
     *
     * @param PublishAssetFromObsRequest 请求对象
     * @return CompletableFuture<PublishAssetFromObsResponse>
     */
    public CompletableFuture<PublishAssetFromObsResponse> publishAssetFromObsAsync(PublishAssetFromObsRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.publishAssetFromObs);
    }

    /**
     * 从OBS一键发布媒资
     * ## 典型场景 ##   从OBS转存媒资,一键发布。&lt;br/&gt;  ## 接口功能 ##    在OBS中的媒资一键发布到VOD。&lt;br/&gt;  ## 接口约束 ##   OBS的桶必须先授权给VOD服务用户。&lt;br/&gt; 
     *
     * @param PublishAssetFromObsRequest 请求对象
     * @return AsyncInvoker<PublishAssetFromObsRequest, PublishAssetFromObsResponse>
     */
    public AsyncInvoker<PublishAssetFromObsRequest, PublishAssetFromObsResponse> publishAssetFromObsAsyncInvoker(PublishAssetFromObsRequest request) {
        return new AsyncInvoker<PublishAssetFromObsRequest, PublishAssetFromObsResponse>(request, VodMeta.publishAssetFromObs, hcClient);
    }

    /**
     * 媒资发布
     * ## 典型场景 ##   媒资发布,支持批量发布。&lt;br/&gt;  ## 接口功能 ##   媒资发布,支持批量发布。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param PublishAssetsRequest 请求对象
     * @return CompletableFuture<PublishAssetsResponse>
     */
    public CompletableFuture<PublishAssetsResponse> publishAssetsAsync(PublishAssetsRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.publishAssets);
    }

    /**
     * 媒资发布
     * ## 典型场景 ##   媒资发布,支持批量发布。&lt;br/&gt;  ## 接口功能 ##   媒资发布,支持批量发布。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param PublishAssetsRequest 请求对象
     * @return AsyncInvoker<PublishAssetsRequest, PublishAssetsResponse>
     */
    public AsyncInvoker<PublishAssetsRequest, PublishAssetsResponse> publishAssetsAsyncInvoker(PublishAssetsRequest request) {
        return new AsyncInvoker<PublishAssetsRequest, PublishAssetsResponse>(request, VodMeta.publishAssets, hcClient);
    }

    /**
     * 查询指定媒资的详细信息
     * 查询指定媒资的详细信息
     *
     * @param ShowAssetDetailRequest 请求对象
     * @return CompletableFuture<ShowAssetDetailResponse>
     */
    public CompletableFuture<ShowAssetDetailResponse> showAssetDetailAsync(ShowAssetDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.showAssetDetail);
    }

    /**
     * 查询指定媒资的详细信息
     * 查询指定媒资的详细信息
     *
     * @param ShowAssetDetailRequest 请求对象
     * @return AsyncInvoker<ShowAssetDetailRequest, ShowAssetDetailResponse>
     */
    public AsyncInvoker<ShowAssetDetailRequest, ShowAssetDetailResponse> showAssetDetailAsyncInvoker(ShowAssetDetailRequest request) {
        return new AsyncInvoker<ShowAssetDetailRequest, ShowAssetDetailResponse>(request, VodMeta.showAssetDetail, hcClient);
    }

    /**
     * 查询媒资信息
     * ## 典型场景 ##   查询媒资信息。&lt;br/&gt;  ## 接口功能 ##   查询媒资信息。&lt;br/&gt;  ## 接口约束 ##   最多同时查询10个。&lt;br/&gt; 
     *
     * @param ShowAssetMetaRequest 请求对象
     * @return CompletableFuture<ShowAssetMetaResponse>
     */
    public CompletableFuture<ShowAssetMetaResponse> showAssetMetaAsync(ShowAssetMetaRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.showAssetMeta);
    }

    /**
     * 查询媒资信息
     * ## 典型场景 ##   查询媒资信息。&lt;br/&gt;  ## 接口功能 ##   查询媒资信息。&lt;br/&gt;  ## 接口约束 ##   最多同时查询10个。&lt;br/&gt; 
     *
     * @param ShowAssetMetaRequest 请求对象
     * @return AsyncInvoker<ShowAssetMetaRequest, ShowAssetMetaResponse>
     */
    public AsyncInvoker<ShowAssetMetaRequest, ShowAssetMetaResponse> showAssetMetaAsyncInvoker(ShowAssetMetaRequest request) {
        return new AsyncInvoker<ShowAssetMetaRequest, ShowAssetMetaResponse>(request, VodMeta.showAssetMeta, hcClient);
    }

    /**
     * 获取授权（New Version）
     * 客户端请求创建媒资时，如果媒资文件超过100MB，需采用分段的方式向OBS上传，在每次与OBS交互前，客户端需通过此接口获取到授权方可与OBS交互。 
     *
     * @param ShowAssetTempAuthorityRequest 请求对象
     * @return CompletableFuture<ShowAssetTempAuthorityResponse>
     */
    public CompletableFuture<ShowAssetTempAuthorityResponse> showAssetTempAuthorityAsync(ShowAssetTempAuthorityRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.showAssetTempAuthority);
    }

    /**
     * 获取授权（New Version）
     * 客户端请求创建媒资时，如果媒资文件超过100MB，需采用分段的方式向OBS上传，在每次与OBS交互前，客户端需通过此接口获取到授权方可与OBS交互。 
     *
     * @param ShowAssetTempAuthorityRequest 请求对象
     * @return AsyncInvoker<ShowAssetTempAuthorityRequest, ShowAssetTempAuthorityResponse>
     */
    public AsyncInvoker<ShowAssetTempAuthorityRequest, ShowAssetTempAuthorityResponse> showAssetTempAuthorityAsyncInvoker(ShowAssetTempAuthorityRequest request) {
        return new AsyncInvoker<ShowAssetTempAuthorityRequest, ShowAssetTempAuthorityResponse>(request, VodMeta.showAssetTempAuthority, hcClient);
    }

    /**
     * 查询域名的cdn数据信息
     * ## 典型场景 ##  查询域名的cdn数据信息 。&lt;br/&gt;  ## 接口功能 ##  查询域名的cdn数据信息 。&lt;br/&gt;  ##  接口约束 ##   无。&lt;br/&gt; 
     *
     * @param ShowCdnStatisticsRequest 请求对象
     * @return CompletableFuture<ShowCdnStatisticsResponse>
     */
    public CompletableFuture<ShowCdnStatisticsResponse> showCdnStatisticsAsync(ShowCdnStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.showCdnStatistics);
    }

    /**
     * 查询域名的cdn数据信息
     * ## 典型场景 ##  查询域名的cdn数据信息 。&lt;br/&gt;  ## 接口功能 ##  查询域名的cdn数据信息 。&lt;br/&gt;  ##  接口约束 ##   无。&lt;br/&gt; 
     *
     * @param ShowCdnStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowCdnStatisticsRequest, ShowCdnStatisticsResponse>
     */
    public AsyncInvoker<ShowCdnStatisticsRequest, ShowCdnStatisticsResponse> showCdnStatisticsAsyncInvoker(ShowCdnStatisticsRequest request) {
        return new AsyncInvoker<ShowCdnStatisticsRequest, ShowCdnStatisticsResponse>(request, VodMeta.showCdnStatistics, hcClient);
    }

    /**
     * 查询源站数据信息
     * ## 典型场景 ##  用于查询点播源站相关的统计数据，包括流量、存储空间、转码时长等 。&lt;br/&gt;  ## 接口功能 ##  用于查询点播源站相关的统计数据，包括流量、存储空间、转码时长等 。&lt;br/&gt;  ##  接口约束 ##   无。&lt;br/&gt; 
     *
     * @param ShowVodStatisticsRequest 请求对象
     * @return CompletableFuture<ShowVodStatisticsResponse>
     */
    public CompletableFuture<ShowVodStatisticsResponse> showVodStatisticsAsync(ShowVodStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.showVodStatistics);
    }

    /**
     * 查询源站数据信息
     * ## 典型场景 ##  用于查询点播源站相关的统计数据，包括流量、存储空间、转码时长等 。&lt;br/&gt;  ## 接口功能 ##  用于查询点播源站相关的统计数据，包括流量、存储空间、转码时长等 。&lt;br/&gt;  ##  接口约束 ##   无。&lt;br/&gt; 
     *
     * @param ShowVodStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowVodStatisticsRequest, ShowVodStatisticsResponse>
     */
    public AsyncInvoker<ShowVodStatisticsRequest, ShowVodStatisticsResponse> showVodStatisticsAsyncInvoker(ShowVodStatisticsRequest request) {
        return new AsyncInvoker<ShowVodStatisticsRequest, ShowVodStatisticsResponse>(request, VodMeta.showVodStatistics, hcClient);
    }

    /**
     * 媒资取消发布
     * ## 典型场景 ##   媒资取消发布。&lt;br/&gt;  ## 接口功能 ##   媒资取消发布。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param UnpublishAssetsRequest 请求对象
     * @return CompletableFuture<UnpublishAssetsResponse>
     */
    public CompletableFuture<UnpublishAssetsResponse> unpublishAssetsAsync(UnpublishAssetsRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.unpublishAssets);
    }

    /**
     * 媒资取消发布
     * ## 典型场景 ##   媒资取消发布。&lt;br/&gt;  ## 接口功能 ##   媒资取消发布。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param UnpublishAssetsRequest 请求对象
     * @return AsyncInvoker<UnpublishAssetsRequest, UnpublishAssetsResponse>
     */
    public AsyncInvoker<UnpublishAssetsRequest, UnpublishAssetsResponse> unpublishAssetsAsyncInvoker(UnpublishAssetsRequest request) {
        return new AsyncInvoker<UnpublishAssetsRequest, UnpublishAssetsResponse>(request, VodMeta.unpublishAssets, hcClient);
    }

    /**
     * 媒资更新
     * ## 典型场景 ##   媒资更新,单独上传封面、更新视频文件或更新已有封面。&lt;br/&gt;  ## 接口功能 ##   媒资更新。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param UpdateAssetRequest 请求对象
     * @return CompletableFuture<UpdateAssetResponse>
     */
    public CompletableFuture<UpdateAssetResponse> updateAssetAsync(UpdateAssetRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.updateAsset);
    }

    /**
     * 媒资更新
     * ## 典型场景 ##   媒资更新,单独上传封面、更新视频文件或更新已有封面。&lt;br/&gt;  ## 接口功能 ##   媒资更新。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param UpdateAssetRequest 请求对象
     * @return AsyncInvoker<UpdateAssetRequest, UpdateAssetResponse>
     */
    public AsyncInvoker<UpdateAssetRequest, UpdateAssetResponse> updateAssetAsyncInvoker(UpdateAssetRequest request) {
        return new AsyncInvoker<UpdateAssetRequest, UpdateAssetResponse>(request, VodMeta.updateAsset, hcClient);
    }

    /**
     * 修改媒资分类
     * ## 典型场景 ##   修改媒资分类。&lt;br/&gt;  ## 接口功能 ##   修改媒资分类。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param UpdateAssetCategoryRequest 请求对象
     * @return CompletableFuture<UpdateAssetCategoryResponse>
     */
    public CompletableFuture<UpdateAssetCategoryResponse> updateAssetCategoryAsync(UpdateAssetCategoryRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.updateAssetCategory);
    }

    /**
     * 修改媒资分类
     * ## 典型场景 ##   修改媒资分类。&lt;br/&gt;  ## 接口功能 ##   修改媒资分类。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param UpdateAssetCategoryRequest 请求对象
     * @return AsyncInvoker<UpdateAssetCategoryRequest, UpdateAssetCategoryResponse>
     */
    public AsyncInvoker<UpdateAssetCategoryRequest, UpdateAssetCategoryResponse> updateAssetCategoryAsyncInvoker(UpdateAssetCategoryRequest request) {
        return new AsyncInvoker<UpdateAssetCategoryRequest, UpdateAssetCategoryResponse>(request, VodMeta.updateAssetCategory, hcClient);
    }

    /**
     * 更新媒资信息
     * ## 典型场景 ##   更新媒资信息。&lt;br/&gt;  ## 接口功能 ##   更新媒资信息。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param UpdateAssetMetaRequest 请求对象
     * @return CompletableFuture<UpdateAssetMetaResponse>
     */
    public CompletableFuture<UpdateAssetMetaResponse> updateAssetMetaAsync(UpdateAssetMetaRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.updateAssetMeta);
    }

    /**
     * 更新媒资信息
     * ## 典型场景 ##   更新媒资信息。&lt;br/&gt;  ## 接口功能 ##   更新媒资信息。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param UpdateAssetMetaRequest 请求对象
     * @return AsyncInvoker<UpdateAssetMetaRequest, UpdateAssetMetaResponse>
     */
    public AsyncInvoker<UpdateAssetMetaRequest, UpdateAssetMetaResponse> updateAssetMetaAsyncInvoker(UpdateAssetMetaRequest request) {
        return new AsyncInvoker<UpdateAssetMetaRequest, UpdateAssetMetaResponse>(request, VodMeta.updateAssetMeta, hcClient);
    }

    /**
     * 修改桶授权
     * ## 典型场景 ##   用户通过桶策略方式授权给VOD用户操作桶的权限。&lt;br/&gt;  ## 接口功能 ##   用户通过桶策略方式授权给VOD用户操作桶的权限。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param UpdateBucketAuthorizedRequest 请求对象
     * @return CompletableFuture<UpdateBucketAuthorizedResponse>
     */
    public CompletableFuture<UpdateBucketAuthorizedResponse> updateBucketAuthorizedAsync(UpdateBucketAuthorizedRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.updateBucketAuthorized);
    }

    /**
     * 修改桶授权
     * ## 典型场景 ##   用户通过桶策略方式授权给VOD用户操作桶的权限。&lt;br/&gt;  ## 接口功能 ##   用户通过桶策略方式授权给VOD用户操作桶的权限。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param UpdateBucketAuthorizedRequest 请求对象
     * @return AsyncInvoker<UpdateBucketAuthorizedRequest, UpdateBucketAuthorizedResponse>
     */
    public AsyncInvoker<UpdateBucketAuthorizedRequest, UpdateBucketAuthorizedResponse> updateBucketAuthorizedAsyncInvoker(UpdateBucketAuthorizedRequest request) {
        return new AsyncInvoker<UpdateBucketAuthorizedRequest, UpdateBucketAuthorizedResponse>(request, VodMeta.updateBucketAuthorized, hcClient);
    }

    /**
     * 租户选择截图，来更新封面
     * ## 典型场景 ##   租户选择截图，来更新封面。&lt;br/&gt;  ## 接口功能 ##   租户选择截图，来更新封面 。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param UpdateCoverByThumbnailRequest 请求对象
     * @return CompletableFuture<UpdateCoverByThumbnailResponse>
     */
    public CompletableFuture<UpdateCoverByThumbnailResponse> updateCoverByThumbnailAsync(UpdateCoverByThumbnailRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.updateCoverByThumbnail);
    }

    /**
     * 租户选择截图，来更新封面
     * ## 典型场景 ##   租户选择截图，来更新封面。&lt;br/&gt;  ## 接口功能 ##   租户选择截图，来更新封面 。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param UpdateCoverByThumbnailRequest 请求对象
     * @return AsyncInvoker<UpdateCoverByThumbnailRequest, UpdateCoverByThumbnailResponse>
     */
    public AsyncInvoker<UpdateCoverByThumbnailRequest, UpdateCoverByThumbnailResponse> updateCoverByThumbnailAsyncInvoker(UpdateCoverByThumbnailRequest request) {
        return new AsyncInvoker<UpdateCoverByThumbnailRequest, UpdateCoverByThumbnailResponse>(request, VodMeta.updateCoverByThumbnail, hcClient);
    }

    /**
     * 修改模板组
     * ## 典型场景 ##  修改模板组接口。&lt;br/&gt;  ## 接口功能 ##   修改模板组。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param UpdateTemplateGroupRequest 请求对象
     * @return CompletableFuture<UpdateTemplateGroupResponse>
     */
    public CompletableFuture<UpdateTemplateGroupResponse> updateTemplateGroupAsync(UpdateTemplateGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.updateTemplateGroup);
    }

    /**
     * 修改模板组
     * ## 典型场景 ##  修改模板组接口。&lt;br/&gt;  ## 接口功能 ##   修改模板组。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param UpdateTemplateGroupRequest 请求对象
     * @return AsyncInvoker<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse>
     */
    public AsyncInvoker<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse> updateTemplateGroupAsyncInvoker(UpdateTemplateGroupRequest request) {
        return new AsyncInvoker<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse>(request, VodMeta.updateTemplateGroup, hcClient);
    }

    /**
     * 修改水印模板
     * ## 典型场景 ##   修改水印模板&lt;br/&gt;  ## 接口功能 ##   修改水印模板&lt;br/&gt;  ## 接口约束 ##   无&lt;br/&gt; 
     *
     * @param UpdateWatermarkTemplateRequest 请求对象
     * @return CompletableFuture<UpdateWatermarkTemplateResponse>
     */
    public CompletableFuture<UpdateWatermarkTemplateResponse> updateWatermarkTemplateAsync(UpdateWatermarkTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.updateWatermarkTemplate);
    }

    /**
     * 修改水印模板
     * ## 典型场景 ##   修改水印模板&lt;br/&gt;  ## 接口功能 ##   修改水印模板&lt;br/&gt;  ## 接口约束 ##   无&lt;br/&gt; 
     *
     * @param UpdateWatermarkTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse>
     */
    public AsyncInvoker<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse> updateWatermarkTemplateAsyncInvoker(UpdateWatermarkTemplateRequest request) {
        return new AsyncInvoker<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse>(request, VodMeta.updateWatermarkTemplate, hcClient);
    }

    /**
     * 通过URL拉取方式创建媒资
     * ## 典型场景 ##    创建媒资：URL拉取注入。&lt;br/&gt;  ## 接口功能 ##    创建媒资：URL拉取注入。&lt;br/&gt;  ## 接口约束 ##    无&lt;br/&gt; 
     *
     * @param UploadMetaDataByUrlRequest 请求对象
     * @return CompletableFuture<UploadMetaDataByUrlResponse>
     */
    public CompletableFuture<UploadMetaDataByUrlResponse> uploadMetaDataByUrlAsync(UploadMetaDataByUrlRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.uploadMetaDataByUrl);
    }

    /**
     * 通过URL拉取方式创建媒资
     * ## 典型场景 ##    创建媒资：URL拉取注入。&lt;br/&gt;  ## 接口功能 ##    创建媒资：URL拉取注入。&lt;br/&gt;  ## 接口约束 ##    无&lt;br/&gt; 
     *
     * @param UploadMetaDataByUrlRequest 请求对象
     * @return AsyncInvoker<UploadMetaDataByUrlRequest, UploadMetaDataByUrlResponse>
     */
    public AsyncInvoker<UploadMetaDataByUrlRequest, UploadMetaDataByUrlResponse> uploadMetaDataByUrlAsyncInvoker(UploadMetaDataByUrlRequest request) {
        return new AsyncInvoker<UploadMetaDataByUrlRequest, UploadMetaDataByUrlResponse>(request, VodMeta.uploadMetaDataByUrl, hcClient);
    }

    /**
     * CDN预热
     * ## 典型场景 ##   点播发布后可向CDN预热。&lt;br/&gt;  ## 接口功能 ##   CDN预热。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param CreatePreheatingAssetRequest 请求对象
     * @return CompletableFuture<CreatePreheatingAssetResponse>
     */
    public CompletableFuture<CreatePreheatingAssetResponse> createPreheatingAssetAsync(CreatePreheatingAssetRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.createPreheatingAsset);
    }

    /**
     * CDN预热
     * ## 典型场景 ##   点播发布后可向CDN预热。&lt;br/&gt;  ## 接口功能 ##   CDN预热。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param CreatePreheatingAssetRequest 请求对象
     * @return AsyncInvoker<CreatePreheatingAssetRequest, CreatePreheatingAssetResponse>
     */
    public AsyncInvoker<CreatePreheatingAssetRequest, CreatePreheatingAssetResponse> createPreheatingAssetAsyncInvoker(CreatePreheatingAssetRequest request) {
        return new AsyncInvoker<CreatePreheatingAssetRequest, CreatePreheatingAssetResponse>(request, VodMeta.createPreheatingAsset, hcClient);
    }

    /**
     * 查询CDN预热
     * ## 典型场景 ##   向CDN查询预热。&lt;br/&gt;  ## 接口功能 ##   查询CDN预热。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param ShowPreheatingAssetRequest 请求对象
     * @return CompletableFuture<ShowPreheatingAssetResponse>
     */
    public CompletableFuture<ShowPreheatingAssetResponse> showPreheatingAssetAsync(ShowPreheatingAssetRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.showPreheatingAsset);
    }

    /**
     * 查询CDN预热
     * ## 典型场景 ##   向CDN查询预热。&lt;br/&gt;  ## 接口功能 ##   查询CDN预热。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param ShowPreheatingAssetRequest 请求对象
     * @return AsyncInvoker<ShowPreheatingAssetRequest, ShowPreheatingAssetResponse>
     */
    public AsyncInvoker<ShowPreheatingAssetRequest, ShowPreheatingAssetResponse> showPreheatingAssetAsyncInvoker(ShowPreheatingAssetRequest request) {
        return new AsyncInvoker<ShowPreheatingAssetRequest, ShowPreheatingAssetResponse>(request, VodMeta.showPreheatingAsset, hcClient);
    }

    /**
     * 查询密钥
     * ## 典型场景 ##   终端在尝试播放加密HLS时会先向租户Server请求密钥，租户Server则对终端身份进行认证，认证通过后再向VOD查询密钥&lt;br/&gt;  ## 接口功能 ##   查询密钥&lt;br/&gt;  ## 接口约束 ##   暂无&lt;br/&gt; 
     *
     * @param ShowAssetCipherRequest 请求对象
     * @return CompletableFuture<ShowAssetCipherResponse>
     */
    public CompletableFuture<ShowAssetCipherResponse> showAssetCipherAsync(ShowAssetCipherRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.showAssetCipher);
    }

    /**
     * 查询密钥
     * ## 典型场景 ##   终端在尝试播放加密HLS时会先向租户Server请求密钥，租户Server则对终端身份进行认证，认证通过后再向VOD查询密钥&lt;br/&gt;  ## 接口功能 ##   查询密钥&lt;br/&gt;  ## 接口约束 ##   暂无&lt;br/&gt; 
     *
     * @param ShowAssetCipherRequest 请求对象
     * @return AsyncInvoker<ShowAssetCipherRequest, ShowAssetCipherResponse>
     */
    public AsyncInvoker<ShowAssetCipherRequest, ShowAssetCipherResponse> showAssetCipherAsyncInvoker(ShowAssetCipherRequest request) {
        return new AsyncInvoker<ShowAssetCipherRequest, ShowAssetCipherResponse>(request, VodMeta.showAssetCipher, hcClient);
    }

    /**
     * 创建托管任务
     * ## 典型场景 ##   创建托管任务&lt;br/&gt;  ## 接口功能 ##   &lt;br/&gt;  ## 接口约束 ##&lt;br/&gt; 
     *
     * @param CreateTakeOverTaskRequest 请求对象
     * @return CompletableFuture<CreateTakeOverTaskResponse>
     */
    public CompletableFuture<CreateTakeOverTaskResponse> createTakeOverTaskAsync(CreateTakeOverTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.createTakeOverTask);
    }

    /**
     * 创建托管任务
     * ## 典型场景 ##   创建托管任务&lt;br/&gt;  ## 接口功能 ##   &lt;br/&gt;  ## 接口约束 ##&lt;br/&gt; 
     *
     * @param CreateTakeOverTaskRequest 请求对象
     * @return AsyncInvoker<CreateTakeOverTaskRequest, CreateTakeOverTaskResponse>
     */
    public AsyncInvoker<CreateTakeOverTaskRequest, CreateTakeOverTaskResponse> createTakeOverTaskAsyncInvoker(CreateTakeOverTaskRequest request) {
        return new AsyncInvoker<CreateTakeOverTaskRequest, CreateTakeOverTaskResponse>(request, VodMeta.createTakeOverTask, hcClient);
    }

    /**
     * 查询托管任务
     * ## 典型场景 ##   查询托管任务&lt;br/&gt;  ## 接口功能 ##   查询托管任务&lt;br/&gt;  ## 接口约束 ##&lt;br/&gt; 
     *
     * @param ListTakeOverTaskRequest 请求对象
     * @return CompletableFuture<ListTakeOverTaskResponse>
     */
    public CompletableFuture<ListTakeOverTaskResponse> listTakeOverTaskAsync(ListTakeOverTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.listTakeOverTask);
    }

    /**
     * 查询托管任务
     * ## 典型场景 ##   查询托管任务&lt;br/&gt;  ## 接口功能 ##   查询托管任务&lt;br/&gt;  ## 接口约束 ##&lt;br/&gt; 
     *
     * @param ListTakeOverTaskRequest 请求对象
     * @return AsyncInvoker<ListTakeOverTaskRequest, ListTakeOverTaskResponse>
     */
    public AsyncInvoker<ListTakeOverTaskRequest, ListTakeOverTaskResponse> listTakeOverTaskAsyncInvoker(ListTakeOverTaskRequest request) {
        return new AsyncInvoker<ListTakeOverTaskRequest, ListTakeOverTaskResponse>(request, VodMeta.listTakeOverTask, hcClient);
    }

    /**
     * 查询托管媒资详情
     * ## 典型场景 ##   查询托管媒资详情&lt;br/&gt;  ## 接口功能 ##   查询托管媒资详情&lt;br/&gt;  ## 接口约束 ##&lt;br/&gt; 
     *
     * @param ShowTakeOverAssetDetailsRequest 请求对象
     * @return CompletableFuture<ShowTakeOverAssetDetailsResponse>
     */
    public CompletableFuture<ShowTakeOverAssetDetailsResponse> showTakeOverAssetDetailsAsync(ShowTakeOverAssetDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.showTakeOverAssetDetails);
    }

    /**
     * 查询托管媒资详情
     * ## 典型场景 ##   查询托管媒资详情&lt;br/&gt;  ## 接口功能 ##   查询托管媒资详情&lt;br/&gt;  ## 接口约束 ##&lt;br/&gt; 
     *
     * @param ShowTakeOverAssetDetailsRequest 请求对象
     * @return AsyncInvoker<ShowTakeOverAssetDetailsRequest, ShowTakeOverAssetDetailsResponse>
     */
    public AsyncInvoker<ShowTakeOverAssetDetailsRequest, ShowTakeOverAssetDetailsResponse> showTakeOverAssetDetailsAsyncInvoker(ShowTakeOverAssetDetailsRequest request) {
        return new AsyncInvoker<ShowTakeOverAssetDetailsRequest, ShowTakeOverAssetDetailsResponse>(request, VodMeta.showTakeOverAssetDetails, hcClient);
    }

    /**
     * 查询托管任务详情
     * ## 典型场景 ##   查询托管任务详情&lt;br/&gt;  ## 接口功能 ##   查询托管任务详情&lt;br/&gt;  ## 接口约束 ##&lt;br/&gt; 
     *
     * @param ShowTakeOverTaskDetailsRequest 请求对象
     * @return CompletableFuture<ShowTakeOverTaskDetailsResponse>
     */
    public CompletableFuture<ShowTakeOverTaskDetailsResponse> showTakeOverTaskDetailsAsync(ShowTakeOverTaskDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, VodMeta.showTakeOverTaskDetails);
    }

    /**
     * 查询托管任务详情
     * ## 典型场景 ##   查询托管任务详情&lt;br/&gt;  ## 接口功能 ##   查询托管任务详情&lt;br/&gt;  ## 接口约束 ##&lt;br/&gt; 
     *
     * @param ShowTakeOverTaskDetailsRequest 请求对象
     * @return AsyncInvoker<ShowTakeOverTaskDetailsRequest, ShowTakeOverTaskDetailsResponse>
     */
    public AsyncInvoker<ShowTakeOverTaskDetailsRequest, ShowTakeOverTaskDetailsResponse> showTakeOverTaskDetailsAsyncInvoker(ShowTakeOverTaskDetailsRequest request) {
        return new AsyncInvoker<ShowTakeOverTaskDetailsRequest, ShowTakeOverTaskDetailsResponse>(request, VodMeta.showTakeOverTaskDetails, hcClient);
    }

}
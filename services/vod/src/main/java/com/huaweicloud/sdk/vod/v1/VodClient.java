package com.huaweicloud.sdk.vod.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.vod.v1.model.*;

public class VodClient {
    protected HcClient hcClient;

    public VodClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VodClient> newBuilder() {
        return new ClientBuilder<>(VodClient::new);
    }


    /**
     * 取消媒资转码任务
     * ## 典型场景 ##   取消媒资转码任务。&lt;br/&gt;  ## 接口功能 ##   取消媒资转码任务，只能取消排队中的转码任务。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param CancelAssetTranscodeTaskRequest 请求对象
     * @return CancelAssetTranscodeTaskResponse
     */
    public CancelAssetTranscodeTaskResponse cancelAssetTranscodeTask(CancelAssetTranscodeTaskRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.cancelAssetTranscodeTask);
    }

    /**
     * 取消媒资转码任务
     * ## 典型场景 ##   取消媒资转码任务。&lt;br/&gt;  ## 接口功能 ##   取消媒资转码任务，只能取消排队中的转码任务。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param CancelAssetTranscodeTaskRequest 请求对象
     * @return SyncInvoker<CancelAssetTranscodeTaskRequest, CancelAssetTranscodeTaskResponse>
     */
    public SyncInvoker<CancelAssetTranscodeTaskRequest, CancelAssetTranscodeTaskResponse> cancelAssetTranscodeTaskInvoker(CancelAssetTranscodeTaskRequest request) {
        return new SyncInvoker<CancelAssetTranscodeTaskRequest, CancelAssetTranscodeTaskResponse>(request, VodMeta.cancelAssetTranscodeTask, hcClient);
    }

    /**
     * 取消提取音频任务
     * ## 典型场景 ##   取消提取音频任务调用此接口&lt;br/&gt;  ## 接口功能 ##   取消提取音频任务，只有排队中的音频任务才可以取消&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param CancelExtractAudioTaskRequest 请求对象
     * @return CancelExtractAudioTaskResponse
     */
    public CancelExtractAudioTaskResponse cancelExtractAudioTask(CancelExtractAudioTaskRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.cancelExtractAudioTask);
    }

    /**
     * 取消提取音频任务
     * ## 典型场景 ##   取消提取音频任务调用此接口&lt;br/&gt;  ## 接口功能 ##   取消提取音频任务，只有排队中的音频任务才可以取消&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param CancelExtractAudioTaskRequest 请求对象
     * @return SyncInvoker<CancelExtractAudioTaskRequest, CancelExtractAudioTaskResponse>
     */
    public SyncInvoker<CancelExtractAudioTaskRequest, CancelExtractAudioTaskResponse> cancelExtractAudioTaskInvoker(CancelExtractAudioTaskRequest request) {
        return new SyncInvoker<CancelExtractAudioTaskRequest, CancelExtractAudioTaskResponse>(request, VodMeta.cancelExtractAudioTask, hcClient);
    }

    /**
     * 文件上传MD5校验
     * 查询音视频MD5是否重复
     *
     * @param CheckMd5DuplicationRequest 请求对象
     * @return CheckMd5DuplicationResponse
     */
    public CheckMd5DuplicationResponse checkMd5Duplication(CheckMd5DuplicationRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.checkMd5Duplication);
    }

    /**
     * 文件上传MD5校验
     * 查询音视频MD5是否重复
     *
     * @param CheckMd5DuplicationRequest 请求对象
     * @return SyncInvoker<CheckMd5DuplicationRequest, CheckMd5DuplicationResponse>
     */
    public SyncInvoker<CheckMd5DuplicationRequest, CheckMd5DuplicationResponse> checkMd5DuplicationInvoker(CheckMd5DuplicationRequest request) {
        return new SyncInvoker<CheckMd5DuplicationRequest, CheckMd5DuplicationResponse>(request, VodMeta.checkMd5Duplication, hcClient);
    }

    /**
     * 确认媒资上传
     * ## 典型场景 ##   确认媒资上传时调用此接口。&lt;br/&gt;  ## 接口功能 ##   确认媒资上传。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param ConfirmAssetUploadRequest 请求对象
     * @return ConfirmAssetUploadResponse
     */
    public ConfirmAssetUploadResponse confirmAssetUpload(ConfirmAssetUploadRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.confirmAssetUpload);
    }

    /**
     * 确认媒资上传
     * ## 典型场景 ##   确认媒资上传时调用此接口。&lt;br/&gt;  ## 接口功能 ##   确认媒资上传。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param ConfirmAssetUploadRequest 请求对象
     * @return SyncInvoker<ConfirmAssetUploadRequest, ConfirmAssetUploadResponse>
     */
    public SyncInvoker<ConfirmAssetUploadRequest, ConfirmAssetUploadResponse> confirmAssetUploadInvoker(ConfirmAssetUploadRequest request) {
        return new SyncInvoker<ConfirmAssetUploadRequest, ConfirmAssetUploadResponse>(request, VodMeta.confirmAssetUpload, hcClient);
    }

    /**
     * 确认水印图片上传
     * ## 典型场景 ##   确认水印图片上传调用此接口&lt;br/&gt;  ## 接口功能 ##   确认水印图片是否已经上传至对象存储&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param ConfirmImageUploadRequest 请求对象
     * @return ConfirmImageUploadResponse
     */
    public ConfirmImageUploadResponse confirmImageUpload(ConfirmImageUploadRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.confirmImageUpload);
    }

    /**
     * 确认水印图片上传
     * ## 典型场景 ##   确认水印图片上传调用此接口&lt;br/&gt;  ## 接口功能 ##   确认水印图片是否已经上传至对象存储&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param ConfirmImageUploadRequest 请求对象
     * @return SyncInvoker<ConfirmImageUploadRequest, ConfirmImageUploadResponse>
     */
    public SyncInvoker<ConfirmImageUploadRequest, ConfirmImageUploadResponse> confirmImageUploadInvoker(ConfirmImageUploadRequest request) {
        return new SyncInvoker<ConfirmImageUploadRequest, ConfirmImageUploadResponse>(request, VodMeta.confirmImageUpload, hcClient);
    }

    /**
     * 上传方式创建媒资
     * 上传方式创建媒资。
     *
     * @param CreateAssetByFileUploadRequest 请求对象
     * @return CreateAssetByFileUploadResponse
     */
    public CreateAssetByFileUploadResponse createAssetByFileUpload(CreateAssetByFileUploadRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.createAssetByFileUpload);
    }

    /**
     * 上传方式创建媒资
     * 上传方式创建媒资。
     *
     * @param CreateAssetByFileUploadRequest 请求对象
     * @return SyncInvoker<CreateAssetByFileUploadRequest, CreateAssetByFileUploadResponse>
     */
    public SyncInvoker<CreateAssetByFileUploadRequest, CreateAssetByFileUploadResponse> createAssetByFileUploadInvoker(CreateAssetByFileUploadRequest request) {
        return new SyncInvoker<CreateAssetByFileUploadRequest, CreateAssetByFileUploadResponse>(request, VodMeta.createAssetByFileUpload, hcClient);
    }

    /**
     * 创建媒资分类
     * ## 典型场景 ##   创建媒资分类。&lt;br/&gt;  ## 接口功能 ##   创建媒资分类。&lt;br/&gt;  ## 接口约束 ##   最大支持三级分类，每个分类最多支持创建128个子分类。&lt;br/&gt; 
     *
     * @param CreateAssetCategoryRequest 请求对象
     * @return CreateAssetCategoryResponse
     */
    public CreateAssetCategoryResponse createAssetCategory(CreateAssetCategoryRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.createAssetCategory);
    }

    /**
     * 创建媒资分类
     * ## 典型场景 ##   创建媒资分类。&lt;br/&gt;  ## 接口功能 ##   创建媒资分类。&lt;br/&gt;  ## 接口约束 ##   最大支持三级分类，每个分类最多支持创建128个子分类。&lt;br/&gt; 
     *
     * @param CreateAssetCategoryRequest 请求对象
     * @return SyncInvoker<CreateAssetCategoryRequest, CreateAssetCategoryResponse>
     */
    public SyncInvoker<CreateAssetCategoryRequest, CreateAssetCategoryResponse> createAssetCategoryInvoker(CreateAssetCategoryRequest request) {
        return new SyncInvoker<CreateAssetCategoryRequest, CreateAssetCategoryResponse>(request, VodMeta.createAssetCategory, hcClient);
    }

    /**
     * 媒资处理
     * ## 典型场景 ##   媒资处理。&lt;br/&gt;  ## 接口功能 ##   媒资处理。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param CreateAssetProcessTaskRequest 请求对象
     * @return CreateAssetProcessTaskResponse
     */
    public CreateAssetProcessTaskResponse createAssetProcessTask(CreateAssetProcessTaskRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.createAssetProcessTask);
    }

    /**
     * 媒资处理
     * ## 典型场景 ##   媒资处理。&lt;br/&gt;  ## 接口功能 ##   媒资处理。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param CreateAssetProcessTaskRequest 请求对象
     * @return SyncInvoker<CreateAssetProcessTaskRequest, CreateAssetProcessTaskResponse>
     */
    public SyncInvoker<CreateAssetProcessTaskRequest, CreateAssetProcessTaskResponse> createAssetProcessTaskInvoker(CreateAssetProcessTaskRequest request) {
        return new SyncInvoker<CreateAssetProcessTaskRequest, CreateAssetProcessTaskResponse>(request, VodMeta.createAssetProcessTask, hcClient);
    }

    /**
     * 创建审核媒资任务
     * 媒资审核接口
     *
     * @param CreateAssetReviewTaskRequest 请求对象
     * @return CreateAssetReviewTaskResponse
     */
    public CreateAssetReviewTaskResponse createAssetReviewTask(CreateAssetReviewTaskRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.createAssetReviewTask);
    }

    /**
     * 创建审核媒资任务
     * 媒资审核接口
     *
     * @param CreateAssetReviewTaskRequest 请求对象
     * @return SyncInvoker<CreateAssetReviewTaskRequest, CreateAssetReviewTaskResponse>
     */
    public SyncInvoker<CreateAssetReviewTaskRequest, CreateAssetReviewTaskResponse> createAssetReviewTaskInvoker(CreateAssetReviewTaskRequest request) {
        return new SyncInvoker<CreateAssetReviewTaskRequest, CreateAssetReviewTaskResponse>(request, VodMeta.createAssetReviewTask, hcClient);
    }

    /**
     * 视频媒资提取音频
     * ## 典型场景 ##   从媒资中提取音频调用此接口&lt;br/&gt;  ## 接口功能 ##   视频媒资提取音频&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param CreateExtractAudioTaskRequest 请求对象
     * @return CreateExtractAudioTaskResponse
     */
    public CreateExtractAudioTaskResponse createExtractAudioTask(CreateExtractAudioTaskRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.createExtractAudioTask);
    }

    /**
     * 视频媒资提取音频
     * ## 典型场景 ##   从媒资中提取音频调用此接口&lt;br/&gt;  ## 接口功能 ##   视频媒资提取音频&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param CreateExtractAudioTaskRequest 请求对象
     * @return SyncInvoker<CreateExtractAudioTaskRequest, CreateExtractAudioTaskResponse>
     */
    public SyncInvoker<CreateExtractAudioTaskRequest, CreateExtractAudioTaskResponse> createExtractAudioTaskInvoker(CreateExtractAudioTaskRequest request) {
        return new SyncInvoker<CreateExtractAudioTaskRequest, CreateExtractAudioTaskResponse>(request, VodMeta.createExtractAudioTask, hcClient);
    }

    /**
     * 创建自定义模板组
     * ## 典型场景 ##   创建自定义模板组时调用此接口。&lt;br/&gt;  ## 接口功能 ##   创建模板组。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param CreateTemplateGroupRequest 请求对象
     * @return CreateTemplateGroupResponse
     */
    public CreateTemplateGroupResponse createTemplateGroup(CreateTemplateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.createTemplateGroup);
    }

    /**
     * 创建自定义模板组
     * ## 典型场景 ##   创建自定义模板组时调用此接口。&lt;br/&gt;  ## 接口功能 ##   创建模板组。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param CreateTemplateGroupRequest 请求对象
     * @return SyncInvoker<CreateTemplateGroupRequest, CreateTemplateGroupResponse>
     */
    public SyncInvoker<CreateTemplateGroupRequest, CreateTemplateGroupResponse> createTemplateGroupInvoker(CreateTemplateGroupRequest request) {
        return new SyncInvoker<CreateTemplateGroupRequest, CreateTemplateGroupResponse>(request, VodMeta.createTemplateGroup, hcClient);
    }

    /**
     * 创建水印模板
     * ## 典型场景 ##   创建水印模板调用此接口&lt;br/&gt;  ## 接口功能 ##   创建水印模板&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param CreateWatermarkTemplateRequest 请求对象
     * @return CreateWatermarkTemplateResponse
     */
    public CreateWatermarkTemplateResponse createWatermarkTemplate(CreateWatermarkTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.createWatermarkTemplate);
    }

    /**
     * 创建水印模板
     * ## 典型场景 ##   创建水印模板调用此接口&lt;br/&gt;  ## 接口功能 ##   创建水印模板&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param CreateWatermarkTemplateRequest 请求对象
     * @return SyncInvoker<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse>
     */
    public SyncInvoker<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse> createWatermarkTemplateInvoker(CreateWatermarkTemplateRequest request) {
        return new SyncInvoker<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse>(request, VodMeta.createWatermarkTemplate, hcClient);
    }

    /**
     * 删除媒资分类
     * ## 典型场景 ##   删除媒资分类。&lt;br/&gt;  ## 接口功能 ##   删除媒资分类。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param DeleteAssetCategoryRequest 请求对象
     * @return DeleteAssetCategoryResponse
     */
    public DeleteAssetCategoryResponse deleteAssetCategory(DeleteAssetCategoryRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.deleteAssetCategory);
    }

    /**
     * 删除媒资分类
     * ## 典型场景 ##   删除媒资分类。&lt;br/&gt;  ## 接口功能 ##   删除媒资分类。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param DeleteAssetCategoryRequest 请求对象
     * @return SyncInvoker<DeleteAssetCategoryRequest, DeleteAssetCategoryResponse>
     */
    public SyncInvoker<DeleteAssetCategoryRequest, DeleteAssetCategoryResponse> deleteAssetCategoryInvoker(DeleteAssetCategoryRequest request) {
        return new SyncInvoker<DeleteAssetCategoryRequest, DeleteAssetCategoryResponse>(request, VodMeta.deleteAssetCategory, hcClient);
    }

    /**
     * 删除媒资，支持批量删除
     * ## 典型场景 ##   删除媒资，支持批量删除。&lt;br/&gt;  ## 接口功能 ##   删除媒资，支持批量删除。&lt;br/&gt;  ## 接口约束 ##   最多删除十个。&lt;br/&gt; 
     *
     * @param DeleteAssetsRequest 请求对象
     * @return DeleteAssetsResponse
     */
    public DeleteAssetsResponse deleteAssets(DeleteAssetsRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.deleteAssets);
    }

    /**
     * 删除媒资，支持批量删除
     * ## 典型场景 ##   删除媒资，支持批量删除。&lt;br/&gt;  ## 接口功能 ##   删除媒资，支持批量删除。&lt;br/&gt;  ## 接口约束 ##   最多删除十个。&lt;br/&gt; 
     *
     * @param DeleteAssetsRequest 请求对象
     * @return SyncInvoker<DeleteAssetsRequest, DeleteAssetsResponse>
     */
    public SyncInvoker<DeleteAssetsRequest, DeleteAssetsResponse> deleteAssetsInvoker(DeleteAssetsRequest request) {
        return new SyncInvoker<DeleteAssetsRequest, DeleteAssetsResponse>(request, VodMeta.deleteAssets, hcClient);
    }

    /**
     * 删除自定义模板组
     * ## 典型场景 ##   删除自定义模板组接口。&lt;br/&gt;  ## 接口功能 ##   删除自定义模板组。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param DeleteTemplateGroupRequest 请求对象
     * @return DeleteTemplateGroupResponse
     */
    public DeleteTemplateGroupResponse deleteTemplateGroup(DeleteTemplateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.deleteTemplateGroup);
    }

    /**
     * 删除自定义模板组
     * ## 典型场景 ##   删除自定义模板组接口。&lt;br/&gt;  ## 接口功能 ##   删除自定义模板组。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param DeleteTemplateGroupRequest 请求对象
     * @return SyncInvoker<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse>
     */
    public SyncInvoker<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse> deleteTemplateGroupInvoker(DeleteTemplateGroupRequest request) {
        return new SyncInvoker<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse>(request, VodMeta.deleteTemplateGroup, hcClient);
    }

    /**
     * 删除水印模板
     * ## 典型场景 ##   删除水印模板&lt;br/&gt;  ## 接口功能 ##   删除水印模板&lt;br/&gt;  ## 接口约束 ##   无&lt;br/&gt; 
     *
     * @param DeleteWatermarkTemplateRequest 请求对象
     * @return DeleteWatermarkTemplateResponse
     */
    public DeleteWatermarkTemplateResponse deleteWatermarkTemplate(DeleteWatermarkTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.deleteWatermarkTemplate);
    }

    /**
     * 删除水印模板
     * ## 典型场景 ##   删除水印模板&lt;br/&gt;  ## 接口功能 ##   删除水印模板&lt;br/&gt;  ## 接口约束 ##   无&lt;br/&gt; 
     *
     * @param DeleteWatermarkTemplateRequest 请求对象
     * @return SyncInvoker<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse>
     */
    public SyncInvoker<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse> deleteWatermarkTemplateInvoker(DeleteWatermarkTemplateRequest request) {
        return new SyncInvoker<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse>(request, VodMeta.deleteWatermarkTemplate, hcClient);
    }

    /**
     * 查询指定分类信息
     * ## 典型场景 ##   查询指定分类信息，及其子分类（即下一级分类）的列表。&lt;br/&gt;  ## 接口功能 ##   查询指定分类信息。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param ListAssetCategoryRequest 请求对象
     * @return ListAssetCategoryResponse
     */
    public ListAssetCategoryResponse listAssetCategory(ListAssetCategoryRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.listAssetCategory);
    }

    /**
     * 查询指定分类信息
     * ## 典型场景 ##   查询指定分类信息，及其子分类（即下一级分类）的列表。&lt;br/&gt;  ## 接口功能 ##   查询指定分类信息。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param ListAssetCategoryRequest 请求对象
     * @return SyncInvoker<ListAssetCategoryRequest, ListAssetCategoryResponse>
     */
    public SyncInvoker<ListAssetCategoryRequest, ListAssetCategoryResponse> listAssetCategoryInvoker(ListAssetCategoryRequest request) {
        return new SyncInvoker<ListAssetCategoryRequest, ListAssetCategoryResponse>(request, VodMeta.listAssetCategory, hcClient);
    }

    /**
     * 查询媒资列表
     * 查询媒资列表
     *
     * @param ListAssetListRequest 请求对象
     * @return ListAssetListResponse
     */
    public ListAssetListResponse listAssetList(ListAssetListRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.listAssetList);
    }

    /**
     * 查询媒资列表
     * 查询媒资列表
     *
     * @param ListAssetListRequest 请求对象
     * @return SyncInvoker<ListAssetListRequest, ListAssetListResponse>
     */
    public SyncInvoker<ListAssetListRequest, ListAssetListResponse> listAssetListInvoker(ListAssetListRequest request) {
        return new SyncInvoker<ListAssetListRequest, ListAssetListResponse>(request, VodMeta.listAssetList, hcClient);
    }

    /**
     * 查询模板组列表
     * ## 典型场景 ##   查询模板组列表调用此接口。&lt;br/&gt;  ## 接口功能 ##   查询模板组列表。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param ListTemplateGroupRequest 请求对象
     * @return ListTemplateGroupResponse
     */
    public ListTemplateGroupResponse listTemplateGroup(ListTemplateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.listTemplateGroup);
    }

    /**
     * 查询模板组列表
     * ## 典型场景 ##   查询模板组列表调用此接口。&lt;br/&gt;  ## 接口功能 ##   查询模板组列表。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param ListTemplateGroupRequest 请求对象
     * @return SyncInvoker<ListTemplateGroupRequest, ListTemplateGroupResponse>
     */
    public SyncInvoker<ListTemplateGroupRequest, ListTemplateGroupResponse> listTemplateGroupInvoker(ListTemplateGroupRequest request) {
        return new SyncInvoker<ListTemplateGroupRequest, ListTemplateGroupResponse>(request, VodMeta.listTemplateGroup, hcClient);
    }

    /**
     * 查询TopN播放视频信息
     * ## 典型场景 ##  查询TopN播放视频信息 。&lt;br/&gt;  ## 接口功能 ##  查询TopN播放视频信息 。&lt;br/&gt;  ##  接口约束 ##   无。&lt;br/&gt; 
     *
     * @param ListTopStatisticsRequest 请求对象
     * @return ListTopStatisticsResponse
     */
    public ListTopStatisticsResponse listTopStatistics(ListTopStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.listTopStatistics);
    }

    /**
     * 查询TopN播放视频信息
     * ## 典型场景 ##  查询TopN播放视频信息 。&lt;br/&gt;  ## 接口功能 ##  查询TopN播放视频信息 。&lt;br/&gt;  ##  接口约束 ##   无。&lt;br/&gt; 
     *
     * @param ListTopStatisticsRequest 请求对象
     * @return SyncInvoker<ListTopStatisticsRequest, ListTopStatisticsResponse>
     */
    public SyncInvoker<ListTopStatisticsRequest, ListTopStatisticsResponse> listTopStatisticsInvoker(ListTopStatisticsRequest request) {
        return new SyncInvoker<ListTopStatisticsRequest, ListTopStatisticsResponse>(request, VodMeta.listTopStatistics, hcClient);
    }

    /**
     * 查询水印列表
     * ## 典型场景 ##   查询水印模板&lt;br/&gt;  ## 接口功能 ##   查询水印模板&lt;br/&gt;  ## 接口约束 ##   查询所有水印&lt;br/&gt; 
     *
     * @param ListWatermarkTemplateRequest 请求对象
     * @return ListWatermarkTemplateResponse
     */
    public ListWatermarkTemplateResponse listWatermarkTemplate(ListWatermarkTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.listWatermarkTemplate);
    }

    /**
     * 查询水印列表
     * ## 典型场景 ##   查询水印模板&lt;br/&gt;  ## 接口功能 ##   查询水印模板&lt;br/&gt;  ## 接口约束 ##   查询所有水印&lt;br/&gt; 
     *
     * @param ListWatermarkTemplateRequest 请求对象
     * @return SyncInvoker<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse>
     */
    public SyncInvoker<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse> listWatermarkTemplateInvoker(ListWatermarkTemplateRequest request) {
        return new SyncInvoker<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse>(request, VodMeta.listWatermarkTemplate, hcClient);
    }

    /**
     * 从OBS一键发布媒资
     * ## 典型场景 ##   从OBS转存媒资,一键发布。&lt;br/&gt;  ## 接口功能 ##    在OBS中的媒资一键发布到VOD。&lt;br/&gt;  ## 接口约束 ##   OBS的桶必须先授权给VOD服务用户。&lt;br/&gt; 
     *
     * @param PublishAssetFromObsRequest 请求对象
     * @return PublishAssetFromObsResponse
     */
    public PublishAssetFromObsResponse publishAssetFromObs(PublishAssetFromObsRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.publishAssetFromObs);
    }

    /**
     * 从OBS一键发布媒资
     * ## 典型场景 ##   从OBS转存媒资,一键发布。&lt;br/&gt;  ## 接口功能 ##    在OBS中的媒资一键发布到VOD。&lt;br/&gt;  ## 接口约束 ##   OBS的桶必须先授权给VOD服务用户。&lt;br/&gt; 
     *
     * @param PublishAssetFromObsRequest 请求对象
     * @return SyncInvoker<PublishAssetFromObsRequest, PublishAssetFromObsResponse>
     */
    public SyncInvoker<PublishAssetFromObsRequest, PublishAssetFromObsResponse> publishAssetFromObsInvoker(PublishAssetFromObsRequest request) {
        return new SyncInvoker<PublishAssetFromObsRequest, PublishAssetFromObsResponse>(request, VodMeta.publishAssetFromObs, hcClient);
    }

    /**
     * 媒资发布
     * ## 典型场景 ##   媒资发布,支持批量发布。&lt;br/&gt;  ## 接口功能 ##   媒资发布,支持批量发布。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param PublishAssetsRequest 请求对象
     * @return PublishAssetsResponse
     */
    public PublishAssetsResponse publishAssets(PublishAssetsRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.publishAssets);
    }

    /**
     * 媒资发布
     * ## 典型场景 ##   媒资发布,支持批量发布。&lt;br/&gt;  ## 接口功能 ##   媒资发布,支持批量发布。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param PublishAssetsRequest 请求对象
     * @return SyncInvoker<PublishAssetsRequest, PublishAssetsResponse>
     */
    public SyncInvoker<PublishAssetsRequest, PublishAssetsResponse> publishAssetsInvoker(PublishAssetsRequest request) {
        return new SyncInvoker<PublishAssetsRequest, PublishAssetsResponse>(request, VodMeta.publishAssets, hcClient);
    }

    /**
     * 查询指定媒资的详细信息
     * 查询指定媒资的详细信息
     *
     * @param ShowAssetDetailRequest 请求对象
     * @return ShowAssetDetailResponse
     */
    public ShowAssetDetailResponse showAssetDetail(ShowAssetDetailRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.showAssetDetail);
    }

    /**
     * 查询指定媒资的详细信息
     * 查询指定媒资的详细信息
     *
     * @param ShowAssetDetailRequest 请求对象
     * @return SyncInvoker<ShowAssetDetailRequest, ShowAssetDetailResponse>
     */
    public SyncInvoker<ShowAssetDetailRequest, ShowAssetDetailResponse> showAssetDetailInvoker(ShowAssetDetailRequest request) {
        return new SyncInvoker<ShowAssetDetailRequest, ShowAssetDetailResponse>(request, VodMeta.showAssetDetail, hcClient);
    }

    /**
     * 查询媒资信息
     * ## 典型场景 ##   查询媒资信息。&lt;br/&gt;  ## 接口功能 ##   查询媒资信息。&lt;br/&gt;  ## 接口约束 ##   最多同时查询10个。&lt;br/&gt; 
     *
     * @param ShowAssetMetaRequest 请求对象
     * @return ShowAssetMetaResponse
     */
    public ShowAssetMetaResponse showAssetMeta(ShowAssetMetaRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.showAssetMeta);
    }

    /**
     * 查询媒资信息
     * ## 典型场景 ##   查询媒资信息。&lt;br/&gt;  ## 接口功能 ##   查询媒资信息。&lt;br/&gt;  ## 接口约束 ##   最多同时查询10个。&lt;br/&gt; 
     *
     * @param ShowAssetMetaRequest 请求对象
     * @return SyncInvoker<ShowAssetMetaRequest, ShowAssetMetaResponse>
     */
    public SyncInvoker<ShowAssetMetaRequest, ShowAssetMetaResponse> showAssetMetaInvoker(ShowAssetMetaRequest request) {
        return new SyncInvoker<ShowAssetMetaRequest, ShowAssetMetaResponse>(request, VodMeta.showAssetMeta, hcClient);
    }

    /**
     * 获取授权（New Version）
     * 客户端请求创建媒资时，如果媒资文件超过100MB，需采用分段的方式向OBS上传，在每次与OBS交互前，客户端需通过此接口获取到授权方可与OBS交互。 
     *
     * @param ShowAssetTempAuthorityRequest 请求对象
     * @return ShowAssetTempAuthorityResponse
     */
    public ShowAssetTempAuthorityResponse showAssetTempAuthority(ShowAssetTempAuthorityRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.showAssetTempAuthority);
    }

    /**
     * 获取授权（New Version）
     * 客户端请求创建媒资时，如果媒资文件超过100MB，需采用分段的方式向OBS上传，在每次与OBS交互前，客户端需通过此接口获取到授权方可与OBS交互。 
     *
     * @param ShowAssetTempAuthorityRequest 请求对象
     * @return SyncInvoker<ShowAssetTempAuthorityRequest, ShowAssetTempAuthorityResponse>
     */
    public SyncInvoker<ShowAssetTempAuthorityRequest, ShowAssetTempAuthorityResponse> showAssetTempAuthorityInvoker(ShowAssetTempAuthorityRequest request) {
        return new SyncInvoker<ShowAssetTempAuthorityRequest, ShowAssetTempAuthorityResponse>(request, VodMeta.showAssetTempAuthority, hcClient);
    }

    /**
     * 查询域名的cdn数据信息
     * ## 典型场景 ##  查询域名的cdn数据信息 。&lt;br/&gt;  ## 接口功能 ##  查询域名的cdn数据信息 。&lt;br/&gt;  ##  接口约束 ##   无。&lt;br/&gt; 
     *
     * @param ShowCdnStatisticsRequest 请求对象
     * @return ShowCdnStatisticsResponse
     */
    public ShowCdnStatisticsResponse showCdnStatistics(ShowCdnStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.showCdnStatistics);
    }

    /**
     * 查询域名的cdn数据信息
     * ## 典型场景 ##  查询域名的cdn数据信息 。&lt;br/&gt;  ## 接口功能 ##  查询域名的cdn数据信息 。&lt;br/&gt;  ##  接口约束 ##   无。&lt;br/&gt; 
     *
     * @param ShowCdnStatisticsRequest 请求对象
     * @return SyncInvoker<ShowCdnStatisticsRequest, ShowCdnStatisticsResponse>
     */
    public SyncInvoker<ShowCdnStatisticsRequest, ShowCdnStatisticsResponse> showCdnStatisticsInvoker(ShowCdnStatisticsRequest request) {
        return new SyncInvoker<ShowCdnStatisticsRequest, ShowCdnStatisticsResponse>(request, VodMeta.showCdnStatistics, hcClient);
    }

    /**
     * 查询源站数据信息
     * ## 典型场景 ##  用于查询点播源站相关的统计数据，包括流量、存储空间、转码时长等 。&lt;br/&gt;  ## 接口功能 ##  用于查询点播源站相关的统计数据，包括流量、存储空间、转码时长等 。&lt;br/&gt;  ##  接口约束 ##   无。&lt;br/&gt; 
     *
     * @param ShowVodStatisticsRequest 请求对象
     * @return ShowVodStatisticsResponse
     */
    public ShowVodStatisticsResponse showVodStatistics(ShowVodStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.showVodStatistics);
    }

    /**
     * 查询源站数据信息
     * ## 典型场景 ##  用于查询点播源站相关的统计数据，包括流量、存储空间、转码时长等 。&lt;br/&gt;  ## 接口功能 ##  用于查询点播源站相关的统计数据，包括流量、存储空间、转码时长等 。&lt;br/&gt;  ##  接口约束 ##   无。&lt;br/&gt; 
     *
     * @param ShowVodStatisticsRequest 请求对象
     * @return SyncInvoker<ShowVodStatisticsRequest, ShowVodStatisticsResponse>
     */
    public SyncInvoker<ShowVodStatisticsRequest, ShowVodStatisticsResponse> showVodStatisticsInvoker(ShowVodStatisticsRequest request) {
        return new SyncInvoker<ShowVodStatisticsRequest, ShowVodStatisticsResponse>(request, VodMeta.showVodStatistics, hcClient);
    }

    /**
     * 媒资取消发布
     * ## 典型场景 ##   媒资取消发布。&lt;br/&gt;  ## 接口功能 ##   媒资取消发布。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param UnpublishAssetsRequest 请求对象
     * @return UnpublishAssetsResponse
     */
    public UnpublishAssetsResponse unpublishAssets(UnpublishAssetsRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.unpublishAssets);
    }

    /**
     * 媒资取消发布
     * ## 典型场景 ##   媒资取消发布。&lt;br/&gt;  ## 接口功能 ##   媒资取消发布。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param UnpublishAssetsRequest 请求对象
     * @return SyncInvoker<UnpublishAssetsRequest, UnpublishAssetsResponse>
     */
    public SyncInvoker<UnpublishAssetsRequest, UnpublishAssetsResponse> unpublishAssetsInvoker(UnpublishAssetsRequest request) {
        return new SyncInvoker<UnpublishAssetsRequest, UnpublishAssetsResponse>(request, VodMeta.unpublishAssets, hcClient);
    }

    /**
     * 媒资更新
     * ## 典型场景 ##   媒资更新,单独上传封面、更新视频文件或更新已有封面。&lt;br/&gt;  ## 接口功能 ##   媒资更新。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param UpdateAssetRequest 请求对象
     * @return UpdateAssetResponse
     */
    public UpdateAssetResponse updateAsset(UpdateAssetRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.updateAsset);
    }

    /**
     * 媒资更新
     * ## 典型场景 ##   媒资更新,单独上传封面、更新视频文件或更新已有封面。&lt;br/&gt;  ## 接口功能 ##   媒资更新。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param UpdateAssetRequest 请求对象
     * @return SyncInvoker<UpdateAssetRequest, UpdateAssetResponse>
     */
    public SyncInvoker<UpdateAssetRequest, UpdateAssetResponse> updateAssetInvoker(UpdateAssetRequest request) {
        return new SyncInvoker<UpdateAssetRequest, UpdateAssetResponse>(request, VodMeta.updateAsset, hcClient);
    }

    /**
     * 修改媒资分类
     * ## 典型场景 ##   修改媒资分类。&lt;br/&gt;  ## 接口功能 ##   修改媒资分类。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param UpdateAssetCategoryRequest 请求对象
     * @return UpdateAssetCategoryResponse
     */
    public UpdateAssetCategoryResponse updateAssetCategory(UpdateAssetCategoryRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.updateAssetCategory);
    }

    /**
     * 修改媒资分类
     * ## 典型场景 ##   修改媒资分类。&lt;br/&gt;  ## 接口功能 ##   修改媒资分类。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param UpdateAssetCategoryRequest 请求对象
     * @return SyncInvoker<UpdateAssetCategoryRequest, UpdateAssetCategoryResponse>
     */
    public SyncInvoker<UpdateAssetCategoryRequest, UpdateAssetCategoryResponse> updateAssetCategoryInvoker(UpdateAssetCategoryRequest request) {
        return new SyncInvoker<UpdateAssetCategoryRequest, UpdateAssetCategoryResponse>(request, VodMeta.updateAssetCategory, hcClient);
    }

    /**
     * 更新媒资信息
     * ## 典型场景 ##   更新媒资信息。&lt;br/&gt;  ## 接口功能 ##   更新媒资信息。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param UpdateAssetMetaRequest 请求对象
     * @return UpdateAssetMetaResponse
     */
    public UpdateAssetMetaResponse updateAssetMeta(UpdateAssetMetaRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.updateAssetMeta);
    }

    /**
     * 更新媒资信息
     * ## 典型场景 ##   更新媒资信息。&lt;br/&gt;  ## 接口功能 ##   更新媒资信息。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param UpdateAssetMetaRequest 请求对象
     * @return SyncInvoker<UpdateAssetMetaRequest, UpdateAssetMetaResponse>
     */
    public SyncInvoker<UpdateAssetMetaRequest, UpdateAssetMetaResponse> updateAssetMetaInvoker(UpdateAssetMetaRequest request) {
        return new SyncInvoker<UpdateAssetMetaRequest, UpdateAssetMetaResponse>(request, VodMeta.updateAssetMeta, hcClient);
    }

    /**
     * 修改桶授权
     * ## 典型场景 ##   用户通过桶策略方式授权给VOD用户操作桶的权限。&lt;br/&gt;  ## 接口功能 ##   用户通过桶策略方式授权给VOD用户操作桶的权限。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param UpdateBucketAuthorizedRequest 请求对象
     * @return UpdateBucketAuthorizedResponse
     */
    public UpdateBucketAuthorizedResponse updateBucketAuthorized(UpdateBucketAuthorizedRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.updateBucketAuthorized);
    }

    /**
     * 修改桶授权
     * ## 典型场景 ##   用户通过桶策略方式授权给VOD用户操作桶的权限。&lt;br/&gt;  ## 接口功能 ##   用户通过桶策略方式授权给VOD用户操作桶的权限。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param UpdateBucketAuthorizedRequest 请求对象
     * @return SyncInvoker<UpdateBucketAuthorizedRequest, UpdateBucketAuthorizedResponse>
     */
    public SyncInvoker<UpdateBucketAuthorizedRequest, UpdateBucketAuthorizedResponse> updateBucketAuthorizedInvoker(UpdateBucketAuthorizedRequest request) {
        return new SyncInvoker<UpdateBucketAuthorizedRequest, UpdateBucketAuthorizedResponse>(request, VodMeta.updateBucketAuthorized, hcClient);
    }

    /**
     * 租户选择截图，来更新封面
     * ## 典型场景 ##   租户选择截图，来更新封面。&lt;br/&gt;  ## 接口功能 ##   租户选择截图，来更新封面 。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param UpdateCoverByThumbnailRequest 请求对象
     * @return UpdateCoverByThumbnailResponse
     */
    public UpdateCoverByThumbnailResponse updateCoverByThumbnail(UpdateCoverByThumbnailRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.updateCoverByThumbnail);
    }

    /**
     * 租户选择截图，来更新封面
     * ## 典型场景 ##   租户选择截图，来更新封面。&lt;br/&gt;  ## 接口功能 ##   租户选择截图，来更新封面 。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param UpdateCoverByThumbnailRequest 请求对象
     * @return SyncInvoker<UpdateCoverByThumbnailRequest, UpdateCoverByThumbnailResponse>
     */
    public SyncInvoker<UpdateCoverByThumbnailRequest, UpdateCoverByThumbnailResponse> updateCoverByThumbnailInvoker(UpdateCoverByThumbnailRequest request) {
        return new SyncInvoker<UpdateCoverByThumbnailRequest, UpdateCoverByThumbnailResponse>(request, VodMeta.updateCoverByThumbnail, hcClient);
    }

    /**
     * 修改模板组
     * ## 典型场景 ##  修改模板组接口。&lt;br/&gt;  ## 接口功能 ##   修改模板组。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param UpdateTemplateGroupRequest 请求对象
     * @return UpdateTemplateGroupResponse
     */
    public UpdateTemplateGroupResponse updateTemplateGroup(UpdateTemplateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.updateTemplateGroup);
    }

    /**
     * 修改模板组
     * ## 典型场景 ##  修改模板组接口。&lt;br/&gt;  ## 接口功能 ##   修改模板组。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param UpdateTemplateGroupRequest 请求对象
     * @return SyncInvoker<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse>
     */
    public SyncInvoker<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse> updateTemplateGroupInvoker(UpdateTemplateGroupRequest request) {
        return new SyncInvoker<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse>(request, VodMeta.updateTemplateGroup, hcClient);
    }

    /**
     * 修改水印模板
     * ## 典型场景 ##   修改水印模板&lt;br/&gt;  ## 接口功能 ##   修改水印模板&lt;br/&gt;  ## 接口约束 ##   无&lt;br/&gt; 
     *
     * @param UpdateWatermarkTemplateRequest 请求对象
     * @return UpdateWatermarkTemplateResponse
     */
    public UpdateWatermarkTemplateResponse updateWatermarkTemplate(UpdateWatermarkTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.updateWatermarkTemplate);
    }

    /**
     * 修改水印模板
     * ## 典型场景 ##   修改水印模板&lt;br/&gt;  ## 接口功能 ##   修改水印模板&lt;br/&gt;  ## 接口约束 ##   无&lt;br/&gt; 
     *
     * @param UpdateWatermarkTemplateRequest 请求对象
     * @return SyncInvoker<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse>
     */
    public SyncInvoker<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse> updateWatermarkTemplateInvoker(UpdateWatermarkTemplateRequest request) {
        return new SyncInvoker<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse>(request, VodMeta.updateWatermarkTemplate, hcClient);
    }

    /**
     * 通过URL拉取方式创建媒资
     * ## 典型场景 ##    创建媒资：URL拉取注入。&lt;br/&gt;  ## 接口功能 ##    创建媒资：URL拉取注入。&lt;br/&gt;  ## 接口约束 ##    无&lt;br/&gt; 
     *
     * @param UploadMetaDataByUrlRequest 请求对象
     * @return UploadMetaDataByUrlResponse
     */
    public UploadMetaDataByUrlResponse uploadMetaDataByUrl(UploadMetaDataByUrlRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.uploadMetaDataByUrl);
    }

    /**
     * 通过URL拉取方式创建媒资
     * ## 典型场景 ##    创建媒资：URL拉取注入。&lt;br/&gt;  ## 接口功能 ##    创建媒资：URL拉取注入。&lt;br/&gt;  ## 接口约束 ##    无&lt;br/&gt; 
     *
     * @param UploadMetaDataByUrlRequest 请求对象
     * @return SyncInvoker<UploadMetaDataByUrlRequest, UploadMetaDataByUrlResponse>
     */
    public SyncInvoker<UploadMetaDataByUrlRequest, UploadMetaDataByUrlResponse> uploadMetaDataByUrlInvoker(UploadMetaDataByUrlRequest request) {
        return new SyncInvoker<UploadMetaDataByUrlRequest, UploadMetaDataByUrlResponse>(request, VodMeta.uploadMetaDataByUrl, hcClient);
    }

    /**
     * CDN预热
     * ## 典型场景 ##   点播发布后可向CDN预热。&lt;br/&gt;  ## 接口功能 ##   CDN预热。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param CreatePreheatingAssetRequest 请求对象
     * @return CreatePreheatingAssetResponse
     */
    public CreatePreheatingAssetResponse createPreheatingAsset(CreatePreheatingAssetRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.createPreheatingAsset);
    }

    /**
     * CDN预热
     * ## 典型场景 ##   点播发布后可向CDN预热。&lt;br/&gt;  ## 接口功能 ##   CDN预热。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param CreatePreheatingAssetRequest 请求对象
     * @return SyncInvoker<CreatePreheatingAssetRequest, CreatePreheatingAssetResponse>
     */
    public SyncInvoker<CreatePreheatingAssetRequest, CreatePreheatingAssetResponse> createPreheatingAssetInvoker(CreatePreheatingAssetRequest request) {
        return new SyncInvoker<CreatePreheatingAssetRequest, CreatePreheatingAssetResponse>(request, VodMeta.createPreheatingAsset, hcClient);
    }

    /**
     * 查询CDN预热
     * ## 典型场景 ##   向CDN查询预热。&lt;br/&gt;  ## 接口功能 ##   查询CDN预热。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param ShowPreheatingAssetRequest 请求对象
     * @return ShowPreheatingAssetResponse
     */
    public ShowPreheatingAssetResponse showPreheatingAsset(ShowPreheatingAssetRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.showPreheatingAsset);
    }

    /**
     * 查询CDN预热
     * ## 典型场景 ##   向CDN查询预热。&lt;br/&gt;  ## 接口功能 ##   查询CDN预热。&lt;br/&gt;  ## 接口约束 ##   无。&lt;br/&gt; 
     *
     * @param ShowPreheatingAssetRequest 请求对象
     * @return SyncInvoker<ShowPreheatingAssetRequest, ShowPreheatingAssetResponse>
     */
    public SyncInvoker<ShowPreheatingAssetRequest, ShowPreheatingAssetResponse> showPreheatingAssetInvoker(ShowPreheatingAssetRequest request) {
        return new SyncInvoker<ShowPreheatingAssetRequest, ShowPreheatingAssetResponse>(request, VodMeta.showPreheatingAsset, hcClient);
    }

    /**
     * 查询密钥
     * ## 典型场景 ##   终端在尝试播放加密HLS时会先向租户Server请求密钥，租户Server则对终端身份进行认证，认证通过后再向VOD查询密钥&lt;br/&gt;  ## 接口功能 ##   查询密钥&lt;br/&gt;  ## 接口约束 ##   暂无&lt;br/&gt; 
     *
     * @param ShowAssetCipherRequest 请求对象
     * @return ShowAssetCipherResponse
     */
    public ShowAssetCipherResponse showAssetCipher(ShowAssetCipherRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.showAssetCipher);
    }

    /**
     * 查询密钥
     * ## 典型场景 ##   终端在尝试播放加密HLS时会先向租户Server请求密钥，租户Server则对终端身份进行认证，认证通过后再向VOD查询密钥&lt;br/&gt;  ## 接口功能 ##   查询密钥&lt;br/&gt;  ## 接口约束 ##   暂无&lt;br/&gt; 
     *
     * @param ShowAssetCipherRequest 请求对象
     * @return SyncInvoker<ShowAssetCipherRequest, ShowAssetCipherResponse>
     */
    public SyncInvoker<ShowAssetCipherRequest, ShowAssetCipherResponse> showAssetCipherInvoker(ShowAssetCipherRequest request) {
        return new SyncInvoker<ShowAssetCipherRequest, ShowAssetCipherResponse>(request, VodMeta.showAssetCipher, hcClient);
    }

    /**
     * 创建托管任务
     * ## 典型场景 ##   创建托管任务&lt;br/&gt;  ## 接口功能 ##   &lt;br/&gt;  ## 接口约束 ##&lt;br/&gt; 
     *
     * @param CreateTakeOverTaskRequest 请求对象
     * @return CreateTakeOverTaskResponse
     */
    public CreateTakeOverTaskResponse createTakeOverTask(CreateTakeOverTaskRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.createTakeOverTask);
    }

    /**
     * 创建托管任务
     * ## 典型场景 ##   创建托管任务&lt;br/&gt;  ## 接口功能 ##   &lt;br/&gt;  ## 接口约束 ##&lt;br/&gt; 
     *
     * @param CreateTakeOverTaskRequest 请求对象
     * @return SyncInvoker<CreateTakeOverTaskRequest, CreateTakeOverTaskResponse>
     */
    public SyncInvoker<CreateTakeOverTaskRequest, CreateTakeOverTaskResponse> createTakeOverTaskInvoker(CreateTakeOverTaskRequest request) {
        return new SyncInvoker<CreateTakeOverTaskRequest, CreateTakeOverTaskResponse>(request, VodMeta.createTakeOverTask, hcClient);
    }

    /**
     * 查询托管任务
     * ## 典型场景 ##   查询托管任务&lt;br/&gt;  ## 接口功能 ##   查询托管任务&lt;br/&gt;  ## 接口约束 ##&lt;br/&gt; 
     *
     * @param ListTakeOverTaskRequest 请求对象
     * @return ListTakeOverTaskResponse
     */
    public ListTakeOverTaskResponse listTakeOverTask(ListTakeOverTaskRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.listTakeOverTask);
    }

    /**
     * 查询托管任务
     * ## 典型场景 ##   查询托管任务&lt;br/&gt;  ## 接口功能 ##   查询托管任务&lt;br/&gt;  ## 接口约束 ##&lt;br/&gt; 
     *
     * @param ListTakeOverTaskRequest 请求对象
     * @return SyncInvoker<ListTakeOverTaskRequest, ListTakeOverTaskResponse>
     */
    public SyncInvoker<ListTakeOverTaskRequest, ListTakeOverTaskResponse> listTakeOverTaskInvoker(ListTakeOverTaskRequest request) {
        return new SyncInvoker<ListTakeOverTaskRequest, ListTakeOverTaskResponse>(request, VodMeta.listTakeOverTask, hcClient);
    }

    /**
     * 查询托管媒资详情
     * ## 典型场景 ##   查询托管媒资详情&lt;br/&gt;  ## 接口功能 ##   查询托管媒资详情&lt;br/&gt;  ## 接口约束 ##&lt;br/&gt; 
     *
     * @param ShowTakeOverAssetDetailsRequest 请求对象
     * @return ShowTakeOverAssetDetailsResponse
     */
    public ShowTakeOverAssetDetailsResponse showTakeOverAssetDetails(ShowTakeOverAssetDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.showTakeOverAssetDetails);
    }

    /**
     * 查询托管媒资详情
     * ## 典型场景 ##   查询托管媒资详情&lt;br/&gt;  ## 接口功能 ##   查询托管媒资详情&lt;br/&gt;  ## 接口约束 ##&lt;br/&gt; 
     *
     * @param ShowTakeOverAssetDetailsRequest 请求对象
     * @return SyncInvoker<ShowTakeOverAssetDetailsRequest, ShowTakeOverAssetDetailsResponse>
     */
    public SyncInvoker<ShowTakeOverAssetDetailsRequest, ShowTakeOverAssetDetailsResponse> showTakeOverAssetDetailsInvoker(ShowTakeOverAssetDetailsRequest request) {
        return new SyncInvoker<ShowTakeOverAssetDetailsRequest, ShowTakeOverAssetDetailsResponse>(request, VodMeta.showTakeOverAssetDetails, hcClient);
    }

    /**
     * 查询托管任务详情
     * ## 典型场景 ##   查询托管任务详情&lt;br/&gt;  ## 接口功能 ##   查询托管任务详情&lt;br/&gt;  ## 接口约束 ##&lt;br/&gt; 
     *
     * @param ShowTakeOverTaskDetailsRequest 请求对象
     * @return ShowTakeOverTaskDetailsResponse
     */
    public ShowTakeOverTaskDetailsResponse showTakeOverTaskDetails(ShowTakeOverTaskDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, VodMeta.showTakeOverTaskDetails);
    }

    /**
     * 查询托管任务详情
     * ## 典型场景 ##   查询托管任务详情&lt;br/&gt;  ## 接口功能 ##   查询托管任务详情&lt;br/&gt;  ## 接口约束 ##&lt;br/&gt; 
     *
     * @param ShowTakeOverTaskDetailsRequest 请求对象
     * @return SyncInvoker<ShowTakeOverTaskDetailsRequest, ShowTakeOverTaskDetailsResponse>
     */
    public SyncInvoker<ShowTakeOverTaskDetailsRequest, ShowTakeOverTaskDetailsResponse> showTakeOverTaskDetailsInvoker(ShowTakeOverTaskDetailsRequest request) {
        return new SyncInvoker<ShowTakeOverTaskDetailsRequest, ShowTakeOverTaskDetailsResponse>(request, VodMeta.showTakeOverTaskDetails, hcClient);
    }

}
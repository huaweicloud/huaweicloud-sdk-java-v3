package com.huaweicloud.sdk.mpc.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.mpc.v1.model.*;

public class MpcClient {
    protected HcClient hcClient;

    public MpcClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<MpcClient> newBuilder() {
        return new ClientBuilder<>(MpcClient::new);
    }


    /**
     * 新建转动图任务
     * 创建动图任务，用于将完整的视频文件或视频文件中的一部分转换为动态图文件，暂只支持输出GIF文件。 待转动图的视频文件需要存储在与媒体处理服务同区域的OBS桶中，且该OBS桶已授权。 
     *
     * @param CreateAnimatedGraphicsTaskRequest 请求对象
     * @return CreateAnimatedGraphicsTaskResponse
     */
    public CreateAnimatedGraphicsTaskResponse createAnimatedGraphicsTask(CreateAnimatedGraphicsTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createAnimatedGraphicsTask);
    }

    /**
     * 取消转动图任务
     * 取消已下发的生成动图任务，仅支持取消正在排队中的任务。 
     *
     * @param DeleteAnimatedGraphicsTaskRequest 请求对象
     * @return DeleteAnimatedGraphicsTaskResponse
     */
    public DeleteAnimatedGraphicsTaskResponse deleteAnimatedGraphicsTask(DeleteAnimatedGraphicsTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteAnimatedGraphicsTask);
    }

    /**
     * 查询转动图任务
     * 查询动图任务的状态。 
     *
     * @param ListAnimatedGraphicsTaskRequest 请求对象
     * @return ListAnimatedGraphicsTaskResponse
     */
    public ListAnimatedGraphicsTaskResponse listAnimatedGraphicsTask(ListAnimatedGraphicsTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listAnimatedGraphicsTask);
    }

    /**
     * 新建独立加密任务
     * 支持独立加密，包括创建、查询、删除独立加密任务。  约束：   - 只支持转码后的文件进行加密。   - 加密的文件必须是m3u8或者mpd结尾的文件。 
     *
     * @param CreateEncryptTaskRequest 请求对象
     * @return CreateEncryptTaskResponse
     */
    public CreateEncryptTaskResponse createEncryptTask(CreateEncryptTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createEncryptTask);
    }

    /**
     * 取消独立加密任务
     * 取消独立加密任务。  约束：    只能取消正在任务队列中排队的任务。已开始加密或已完成的加密任务不能取消。 
     *
     * @param DeleteEncryptTaskRequest 请求对象
     * @return DeleteEncryptTaskResponse
     */
    public DeleteEncryptTaskResponse deleteEncryptTask(DeleteEncryptTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteEncryptTask);
    }

    /**
     * 查询独立加密任务
     * 查询独立加密任务状态。返回任务执行结果或当前状态。 
     *
     * @param ListEncryptTaskRequest 请求对象
     * @return ListEncryptTaskResponse
     */
    public ListEncryptTaskResponse listEncryptTask(ListEncryptTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listEncryptTask);
    }

    /**
     * 新建视频解析任务
     * 创建视频解析任务，解析视频元数据。 
     *
     * @param CreateExtractTaskRequest 请求对象
     * @return CreateExtractTaskResponse
     */
    public CreateExtractTaskResponse createExtractTask(CreateExtractTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createExtractTask);
    }

    /**
     * 取消视频解析任务
     * 取消已下发的视频解析任务，仅支持取消正在排队中的任务。 
     *
     * @param DeleteExtractTaskRequest 请求对象
     * @return DeleteExtractTaskResponse
     */
    public DeleteExtractTaskResponse deleteExtractTask(DeleteExtractTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteExtractTask);
    }

    /**
     * 查询视频解析任务
     * 查询解析任务的状态和结果。 
     *
     * @param ListExtractTaskRequest 请求对象
     * @return ListExtractTaskResponse
     */
    public ListExtractTaskResponse listExtractTask(ListExtractTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listExtractTask);
    }

    /**
     * 查询媒资转码详情
     * 查询媒资转码详情
     *
     * @param ListTranscodeDetailRequest 请求对象
     * @return ListTranscodeDetailResponse
     */
    public ListTranscodeDetailResponse listTranscodeDetail(ListTranscodeDetailRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listTranscodeDetail);
    }

    /**
     * 取消转封装任务
     * 取消已下发的转封装任务，仅支持取消正在排队中的任务。。 
     *
     * @param CancelRemuxTaskRequest 请求对象
     * @return CancelRemuxTaskResponse
     */
    public CancelRemuxTaskResponse cancelRemuxTask(CancelRemuxTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.cancelRemuxTask);
    }

    /**
     * 新建转封装任务
     * 创建转封装任务，转换音视频文件的格式，但不改变其分辨率和码率。 待转封装的媒资文件需要存储在与媒体处理服务同区域的OBS桶中，且该OBS桶已授权。 
     *
     * @param CreateRemuxTaskRequest 请求对象
     * @return CreateRemuxTaskResponse
     */
    public CreateRemuxTaskResponse createRemuxTask(CreateRemuxTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createRemuxTask);
    }

    /**
     * 重试转封装任务
     * 对失败的转封装任务进行重试。 
     *
     * @param CreateRetryRemuxTaskRequest 请求对象
     * @return CreateRetryRemuxTaskResponse
     */
    public CreateRetryRemuxTaskResponse createRetryRemuxTask(CreateRetryRemuxTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createRetryRemuxTask);
    }

    /**
     * 删除转封装任务(仅供Console调用)
     * 删除转封装任务 
     *
     * @param DeleteRemuxTaskRequest 请求对象
     * @return DeleteRemuxTaskResponse
     */
    public DeleteRemuxTaskResponse deleteRemuxTask(DeleteRemuxTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteRemuxTask);
    }

    /**
     * 查询转封装任务
     * 查询转封装任务状态。 
     *
     * @param ListRemuxTaskRequest 请求对象
     * @return ListRemuxTaskResponse
     */
    public ListRemuxTaskResponse listRemuxTask(ListRemuxTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listRemuxTask);
    }

    /**
     * 新建转码模板组
     * 新建转码模板组，最多支持一进六出。 
     *
     * @param CreateTemplateGroupRequest 请求对象
     * @return CreateTemplateGroupResponse
     */
    public CreateTemplateGroupResponse createTemplateGroup(CreateTemplateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createTemplateGroup);
    }

    /**
     * 删除转码模板组
     * 删除转码模板组。 
     *
     * @param DeleteTemplateGroupRequest 请求对象
     * @return DeleteTemplateGroupResponse
     */
    public DeleteTemplateGroupResponse deleteTemplateGroup(DeleteTemplateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteTemplateGroup);
    }

    /**
     * 查询转码模板组
     * 查询转码模板组列表。 
     *
     * @param ListTemplateGroupRequest 请求对象
     * @return ListTemplateGroupResponse
     */
    public ListTemplateGroupResponse listTemplateGroup(ListTemplateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listTemplateGroup);
    }

    /**
     * 更新转码模板组
     * 修改模板组接口。 
     *
     * @param UpdateTemplateGroupRequest 请求对象
     * @return UpdateTemplateGroupResponse
     */
    public UpdateTemplateGroupResponse updateTemplateGroup(UpdateTemplateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.updateTemplateGroup);
    }

    /**
     * 新建截图任务
     * 新建截图任务，视频截图将从首帧开始，按设置的时间间隔截图，最后截取末帧。 待截图的视频文件需要存储在与媒体处理服务同区域的OBS桶中，且该OBS桶已授权。  约束：   暂只支持生成JPG格式的图片文件。 
     *
     * @param CreateThumbnailsTaskRequest 请求对象
     * @return CreateThumbnailsTaskResponse
     */
    public CreateThumbnailsTaskResponse createThumbnailsTask(CreateThumbnailsTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createThumbnailsTask);
    }

    /**
     * 取消截图任务
     * 取消已下发截图任务。 只能取消已接受尚在队列中等待处理的任务，已完成或正在执行阶段的任务不能取消。 
     *
     * @param DeleteThumbnailsTaskRequest 请求对象
     * @return DeleteThumbnailsTaskResponse
     */
    public DeleteThumbnailsTaskResponse deleteThumbnailsTask(DeleteThumbnailsTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteThumbnailsTask);
    }

    /**
     * 查询截图任务
     * 查询截图任务状态。返回任务执行结果，包括状态、输入、输出等信息。 
     *
     * @param ListThumbnailsTaskRequest 请求对象
     * @return ListThumbnailsTaskResponse
     */
    public ListThumbnailsTaskResponse listThumbnailsTask(ListThumbnailsTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listThumbnailsTask);
    }

    /**
     * 新建转码任务
     * 新建转码任务可以将视频进行转码，并在转码过程中压制水印、视频截图等。视频转码前需要配置转码模板。 待转码的音视频需要存储在与媒体处理服务同区域的OBS桶中，且该OBS桶已授权。 
     *
     * @param CreateTranscodingTaskRequest 请求对象
     * @return CreateTranscodingTaskResponse
     */
    public CreateTranscodingTaskResponse createTranscodingTask(CreateTranscodingTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createTranscodingTask);
    }

    /**
     * 取消转码任务
     * 取消已下发转码任务。 只能取消正在转码任务队列中排队的转码任务。已开始转码或已完成的转码任务不能取消。 
     *
     * @param DeleteTranscodingTaskRequest 请求对象
     * @return DeleteTranscodingTaskResponse
     */
    public DeleteTranscodingTaskResponse deleteTranscodingTask(DeleteTranscodingTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteTranscodingTask);
    }

    /**
     * 查询转码任务
     * 查询转码任务状态。 
     *
     * @param ListTranscodingTaskRequest 请求对象
     * @return ListTranscodingTaskResponse
     */
    public ListTranscodingTaskResponse listTranscodingTask(ListTranscodingTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listTranscodingTask);
    }

    /**
     * 新建转码模板
     * 新建转码模板，采用自定义的模板转码。 
     *
     * @param CreateTransTemplateRequest 请求对象
     * @return CreateTransTemplateResponse
     */
    public CreateTransTemplateResponse createTransTemplate(CreateTransTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createTransTemplate);
    }

    /**
     * 删除转码模板
     * 删除转码模板。
     *
     * @param DeleteTemplateRequest 请求对象
     * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteTemplate);
    }

    /**
     * 查询转码模板
     * 查询用户自定义转码配置模板。 支持指定模板ID查询，或分页全量查询。转码配置模板ID，最多10个。 
     *
     * @param ListTemplateRequest 请求对象
     * @return ListTemplateResponse
     */
    public ListTemplateResponse listTemplate(ListTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listTemplate);
    }

    /**
     * 更新转码模板
     * 更新转码模板。
     *
     * @param UpdateTransTemplateRequest 请求对象
     * @return UpdateTransTemplateResponse
     */
    public UpdateTransTemplateResponse updateTransTemplate(UpdateTransTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.updateTransTemplate);
    }

    /**
     * 新建水印模板
     * 自定义水印模板。 
     *
     * @param CreateWatermarkTemplateRequest 请求对象
     * @return CreateWatermarkTemplateResponse
     */
    public CreateWatermarkTemplateResponse createWatermarkTemplate(CreateWatermarkTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createWatermarkTemplate);
    }

    /**
     * 删除水印模板
     * 删除自定义水印模板。 
     *
     * @param DeleteWatermarkTemplateRequest 请求对象
     * @return DeleteWatermarkTemplateResponse
     */
    public DeleteWatermarkTemplateResponse deleteWatermarkTemplate(DeleteWatermarkTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteWatermarkTemplate);
    }

    /**
     * 查询水印模板
     * 查询自定义水印模板。支持指定模板ID查询，或分页全量查询。 
     *
     * @param ListWatermarkTemplateRequest 请求对象
     * @return ListWatermarkTemplateResponse
     */
    public ListWatermarkTemplateResponse listWatermarkTemplate(ListWatermarkTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listWatermarkTemplate);
    }

    /**
     * 更新水印模板
     * 更新自定义水印模板。 
     *
     * @param UpdateWatermarkTemplateRequest 请求对象
     * @return UpdateWatermarkTemplateResponse
     */
    public UpdateWatermarkTemplateResponse updateWatermarkTemplate(UpdateWatermarkTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.updateWatermarkTemplate);
    }

}
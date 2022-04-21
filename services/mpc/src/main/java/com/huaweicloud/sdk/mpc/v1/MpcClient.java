package com.huaweicloud.sdk.mpc.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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
     *
     * 创建动图任务，用于将完整的视频文件或视频文件中的一部分转换为动态图文件，暂只支持输出GIF文件。
     * 待转动图的视频文件需要存储在与媒体处理服务同区域的OBS桶中，且该OBS桶已授权。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateAnimatedGraphicsTaskRequest 请求对象
     * @return CreateAnimatedGraphicsTaskResponse
     */
    public CreateAnimatedGraphicsTaskResponse createAnimatedGraphicsTask(CreateAnimatedGraphicsTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createAnimatedGraphicsTask);
    }

    /**
     * 新建转动图任务
     *
     * 创建动图任务，用于将完整的视频文件或视频文件中的一部分转换为动态图文件，暂只支持输出GIF文件。
     * 待转动图的视频文件需要存储在与媒体处理服务同区域的OBS桶中，且该OBS桶已授权。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateAnimatedGraphicsTaskRequest 请求对象
     * @return SyncInvoker<CreateAnimatedGraphicsTaskRequest, CreateAnimatedGraphicsTaskResponse>
     */
    public SyncInvoker<CreateAnimatedGraphicsTaskRequest, CreateAnimatedGraphicsTaskResponse> createAnimatedGraphicsTaskInvoker(
        CreateAnimatedGraphicsTaskRequest request) {
        return new SyncInvoker<CreateAnimatedGraphicsTaskRequest, CreateAnimatedGraphicsTaskResponse>(request,
            MpcMeta.createAnimatedGraphicsTask, hcClient);
    }

    /**
     * 取消转动图任务
     *
     * 取消已下发的生成动图任务，仅支持取消正在排队中的任务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteAnimatedGraphicsTaskRequest 请求对象
     * @return DeleteAnimatedGraphicsTaskResponse
     */
    public DeleteAnimatedGraphicsTaskResponse deleteAnimatedGraphicsTask(DeleteAnimatedGraphicsTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteAnimatedGraphicsTask);
    }

    /**
     * 取消转动图任务
     *
     * 取消已下发的生成动图任务，仅支持取消正在排队中的任务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteAnimatedGraphicsTaskRequest 请求对象
     * @return SyncInvoker<DeleteAnimatedGraphicsTaskRequest, DeleteAnimatedGraphicsTaskResponse>
     */
    public SyncInvoker<DeleteAnimatedGraphicsTaskRequest, DeleteAnimatedGraphicsTaskResponse> deleteAnimatedGraphicsTaskInvoker(
        DeleteAnimatedGraphicsTaskRequest request) {
        return new SyncInvoker<DeleteAnimatedGraphicsTaskRequest, DeleteAnimatedGraphicsTaskResponse>(request,
            MpcMeta.deleteAnimatedGraphicsTask, hcClient);
    }

    /**
     * 查询转动图任务
     *
     * 查询动图任务的状态。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAnimatedGraphicsTaskRequest 请求对象
     * @return ListAnimatedGraphicsTaskResponse
     */
    public ListAnimatedGraphicsTaskResponse listAnimatedGraphicsTask(ListAnimatedGraphicsTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listAnimatedGraphicsTask);
    }

    /**
     * 查询转动图任务
     *
     * 查询动图任务的状态。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAnimatedGraphicsTaskRequest 请求对象
     * @return SyncInvoker<ListAnimatedGraphicsTaskRequest, ListAnimatedGraphicsTaskResponse>
     */
    public SyncInvoker<ListAnimatedGraphicsTaskRequest, ListAnimatedGraphicsTaskResponse> listAnimatedGraphicsTaskInvoker(
        ListAnimatedGraphicsTaskRequest request) {
        return new SyncInvoker<ListAnimatedGraphicsTaskRequest, ListAnimatedGraphicsTaskResponse>(request,
            MpcMeta.listAnimatedGraphicsTask, hcClient);
    }

    /**
     * 新建剪辑任务
     *
     * 创建剪辑任务，用于将多个视频文件进行裁剪成多个视频分段，并且可以把这些视频分段合并成一个视频，剪切和拼接功能可以单独使用。
     * 待剪辑的视频文件需要存储在与媒体处理服务同区域的OBS桶中，且该OBS桶已授权。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateEditingJobRequest 请求对象
     * @return CreateEditingJobResponse
     */
    public CreateEditingJobResponse createEditingJob(CreateEditingJobRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createEditingJob);
    }

    /**
     * 新建剪辑任务
     *
     * 创建剪辑任务，用于将多个视频文件进行裁剪成多个视频分段，并且可以把这些视频分段合并成一个视频，剪切和拼接功能可以单独使用。
     * 待剪辑的视频文件需要存储在与媒体处理服务同区域的OBS桶中，且该OBS桶已授权。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateEditingJobRequest 请求对象
     * @return SyncInvoker<CreateEditingJobRequest, CreateEditingJobResponse>
     */
    public SyncInvoker<CreateEditingJobRequest, CreateEditingJobResponse> createEditingJobInvoker(
        CreateEditingJobRequest request) {
        return new SyncInvoker<CreateEditingJobRequest, CreateEditingJobResponse>(request, MpcMeta.createEditingJob,
            hcClient);
    }

    /**
     * 取消剪辑任务
     *
     * 取消已下发的生成剪辑任务，仅支持取消正在排队中的任务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteEditingJobRequest 请求对象
     * @return DeleteEditingJobResponse
     */
    public DeleteEditingJobResponse deleteEditingJob(DeleteEditingJobRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteEditingJob);
    }

    /**
     * 取消剪辑任务
     *
     * 取消已下发的生成剪辑任务，仅支持取消正在排队中的任务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteEditingJobRequest 请求对象
     * @return SyncInvoker<DeleteEditingJobRequest, DeleteEditingJobResponse>
     */
    public SyncInvoker<DeleteEditingJobRequest, DeleteEditingJobResponse> deleteEditingJobInvoker(
        DeleteEditingJobRequest request) {
        return new SyncInvoker<DeleteEditingJobRequest, DeleteEditingJobResponse>(request, MpcMeta.deleteEditingJob,
            hcClient);
    }

    /**
     * 查询剪辑任务
     *
     * 查询剪辑任务的状态。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEditingJobRequest 请求对象
     * @return ListEditingJobResponse
     */
    public ListEditingJobResponse listEditingJob(ListEditingJobRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listEditingJob);
    }

    /**
     * 查询剪辑任务
     *
     * 查询剪辑任务的状态。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEditingJobRequest 请求对象
     * @return SyncInvoker<ListEditingJobRequest, ListEditingJobResponse>
     */
    public SyncInvoker<ListEditingJobRequest, ListEditingJobResponse> listEditingJobInvoker(
        ListEditingJobRequest request) {
        return new SyncInvoker<ListEditingJobRequest, ListEditingJobResponse>(request, MpcMeta.listEditingJob,
            hcClient);
    }

    /**
     * 新建独立加密任务
     *
     * 支持独立加密，包括创建、查询、删除独立加密任务。
     * 
     * 约束：
     *   - 只支持转码后的文件进行加密。
     *   - 加密的文件必须是m3u8或者mpd结尾的文件。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateEncryptTaskRequest 请求对象
     * @return CreateEncryptTaskResponse
     */
    public CreateEncryptTaskResponse createEncryptTask(CreateEncryptTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createEncryptTask);
    }

    /**
     * 新建独立加密任务
     *
     * 支持独立加密，包括创建、查询、删除独立加密任务。
     * 
     * 约束：
     *   - 只支持转码后的文件进行加密。
     *   - 加密的文件必须是m3u8或者mpd结尾的文件。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateEncryptTaskRequest 请求对象
     * @return SyncInvoker<CreateEncryptTaskRequest, CreateEncryptTaskResponse>
     */
    public SyncInvoker<CreateEncryptTaskRequest, CreateEncryptTaskResponse> createEncryptTaskInvoker(
        CreateEncryptTaskRequest request) {
        return new SyncInvoker<CreateEncryptTaskRequest, CreateEncryptTaskResponse>(request, MpcMeta.createEncryptTask,
            hcClient);
    }

    /**
     * 取消独立加密任务
     *
     * 取消独立加密任务。
     * 
     * 约束：
     * 
     *   只能取消正在任务队列中排队的任务。已开始加密或已完成的加密任务不能取消。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteEncryptTaskRequest 请求对象
     * @return DeleteEncryptTaskResponse
     */
    public DeleteEncryptTaskResponse deleteEncryptTask(DeleteEncryptTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteEncryptTask);
    }

    /**
     * 取消独立加密任务
     *
     * 取消独立加密任务。
     * 
     * 约束：
     * 
     *   只能取消正在任务队列中排队的任务。已开始加密或已完成的加密任务不能取消。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteEncryptTaskRequest 请求对象
     * @return SyncInvoker<DeleteEncryptTaskRequest, DeleteEncryptTaskResponse>
     */
    public SyncInvoker<DeleteEncryptTaskRequest, DeleteEncryptTaskResponse> deleteEncryptTaskInvoker(
        DeleteEncryptTaskRequest request) {
        return new SyncInvoker<DeleteEncryptTaskRequest, DeleteEncryptTaskResponse>(request, MpcMeta.deleteEncryptTask,
            hcClient);
    }

    /**
     * 查询独立加密任务
     *
     * 查询独立加密任务状态。返回任务执行结果或当前状态。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEncryptTaskRequest 请求对象
     * @return ListEncryptTaskResponse
     */
    public ListEncryptTaskResponse listEncryptTask(ListEncryptTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listEncryptTask);
    }

    /**
     * 查询独立加密任务
     *
     * 查询独立加密任务状态。返回任务执行结果或当前状态。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEncryptTaskRequest 请求对象
     * @return SyncInvoker<ListEncryptTaskRequest, ListEncryptTaskResponse>
     */
    public SyncInvoker<ListEncryptTaskRequest, ListEncryptTaskResponse> listEncryptTaskInvoker(
        ListEncryptTaskRequest request) {
        return new SyncInvoker<ListEncryptTaskRequest, ListEncryptTaskResponse>(request, MpcMeta.listEncryptTask,
            hcClient);
    }

    /**
     * 新建视频解析任务
     *
     * 创建视频解析任务，解析视频元数据。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateExtractTaskRequest 请求对象
     * @return CreateExtractTaskResponse
     */
    public CreateExtractTaskResponse createExtractTask(CreateExtractTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createExtractTask);
    }

    /**
     * 新建视频解析任务
     *
     * 创建视频解析任务，解析视频元数据。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateExtractTaskRequest 请求对象
     * @return SyncInvoker<CreateExtractTaskRequest, CreateExtractTaskResponse>
     */
    public SyncInvoker<CreateExtractTaskRequest, CreateExtractTaskResponse> createExtractTaskInvoker(
        CreateExtractTaskRequest request) {
        return new SyncInvoker<CreateExtractTaskRequest, CreateExtractTaskResponse>(request, MpcMeta.createExtractTask,
            hcClient);
    }

    /**
     * 取消视频解析任务
     *
     * 取消已下发的视频解析任务，仅支持取消正在排队中的任务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteExtractTaskRequest 请求对象
     * @return DeleteExtractTaskResponse
     */
    public DeleteExtractTaskResponse deleteExtractTask(DeleteExtractTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteExtractTask);
    }

    /**
     * 取消视频解析任务
     *
     * 取消已下发的视频解析任务，仅支持取消正在排队中的任务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteExtractTaskRequest 请求对象
     * @return SyncInvoker<DeleteExtractTaskRequest, DeleteExtractTaskResponse>
     */
    public SyncInvoker<DeleteExtractTaskRequest, DeleteExtractTaskResponse> deleteExtractTaskInvoker(
        DeleteExtractTaskRequest request) {
        return new SyncInvoker<DeleteExtractTaskRequest, DeleteExtractTaskResponse>(request, MpcMeta.deleteExtractTask,
            hcClient);
    }

    /**
     * 查询视频解析任务
     *
     * 查询解析任务的状态和结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListExtractTaskRequest 请求对象
     * @return ListExtractTaskResponse
     */
    public ListExtractTaskResponse listExtractTask(ListExtractTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listExtractTask);
    }

    /**
     * 查询视频解析任务
     *
     * 查询解析任务的状态和结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListExtractTaskRequest 请求对象
     * @return SyncInvoker<ListExtractTaskRequest, ListExtractTaskResponse>
     */
    public SyncInvoker<ListExtractTaskRequest, ListExtractTaskResponse> listExtractTaskInvoker(
        ListExtractTaskRequest request) {
        return new SyncInvoker<ListExtractTaskRequest, ListExtractTaskResponse>(request, MpcMeta.listExtractTask,
            hcClient);
    }

    /**
     * 合并多声道任务、重置声轨任务上报接口
     *
     * ## 典型场景 ##
     *   合并音频多声道文件任务、重置音频文件声轨任务上报结果接口。
     * ## 接口功能 ##
     *   合并音频多声道文件任务、重置音频文件声轨任务上报结果接口。
     * ## 接口约束 ##
     *   无。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateMbTasksReportRequest 请求对象
     * @return CreateMbTasksReportResponse
     */
    public CreateMbTasksReportResponse createMbTasksReport(CreateMbTasksReportRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createMbTasksReport);
    }

    /**
     * 合并多声道任务、重置声轨任务上报接口
     *
     * ## 典型场景 ##
     *   合并音频多声道文件任务、重置音频文件声轨任务上报结果接口。
     * ## 接口功能 ##
     *   合并音频多声道文件任务、重置音频文件声轨任务上报结果接口。
     * ## 接口约束 ##
     *   无。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateMbTasksReportRequest 请求对象
     * @return SyncInvoker<CreateMbTasksReportRequest, CreateMbTasksReportResponse>
     */
    public SyncInvoker<CreateMbTasksReportRequest, CreateMbTasksReportResponse> createMbTasksReportInvoker(
        CreateMbTasksReportRequest request) {
        return new SyncInvoker<CreateMbTasksReportRequest, CreateMbTasksReportResponse>(request,
            MpcMeta.createMbTasksReport, hcClient);
    }

    /**
     * 创建声道合并任务
     *
     * 创建声道合并任务，合并声道任务支持将每个声道各放一个文件中的片源，合并为单个音频文件。
     * 执行合并声道的源音频文件需要存储在与媒体处理服务同区域的OBS桶中，且该OBS桶已授权。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateMergeChannelsTaskRequest 请求对象
     * @return CreateMergeChannelsTaskResponse
     */
    public CreateMergeChannelsTaskResponse createMergeChannelsTask(CreateMergeChannelsTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createMergeChannelsTask);
    }

    /**
     * 创建声道合并任务
     *
     * 创建声道合并任务，合并声道任务支持将每个声道各放一个文件中的片源，合并为单个音频文件。
     * 执行合并声道的源音频文件需要存储在与媒体处理服务同区域的OBS桶中，且该OBS桶已授权。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateMergeChannelsTaskRequest 请求对象
     * @return SyncInvoker<CreateMergeChannelsTaskRequest, CreateMergeChannelsTaskResponse>
     */
    public SyncInvoker<CreateMergeChannelsTaskRequest, CreateMergeChannelsTaskResponse> createMergeChannelsTaskInvoker(
        CreateMergeChannelsTaskRequest request) {
        return new SyncInvoker<CreateMergeChannelsTaskRequest, CreateMergeChannelsTaskResponse>(request,
            MpcMeta.createMergeChannelsTask, hcClient);
    }

    /**
     * 创建音轨重置任务
     *
     * 创建音轨重置任务，重置音轨任务支持按人工指定关系声道layout，语言标签，转封装片源，使其满足转码输入。
     * 执行音轨重置的源音频文件需要存储在与媒体处理服务同区域的OBS桶中，且该OBS桶已授权。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateResetTracksTaskRequest 请求对象
     * @return CreateResetTracksTaskResponse
     */
    public CreateResetTracksTaskResponse createResetTracksTask(CreateResetTracksTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createResetTracksTask);
    }

    /**
     * 创建音轨重置任务
     *
     * 创建音轨重置任务，重置音轨任务支持按人工指定关系声道layout，语言标签，转封装片源，使其满足转码输入。
     * 执行音轨重置的源音频文件需要存储在与媒体处理服务同区域的OBS桶中，且该OBS桶已授权。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateResetTracksTaskRequest 请求对象
     * @return SyncInvoker<CreateResetTracksTaskRequest, CreateResetTracksTaskResponse>
     */
    public SyncInvoker<CreateResetTracksTaskRequest, CreateResetTracksTaskResponse> createResetTracksTaskInvoker(
        CreateResetTracksTaskRequest request) {
        return new SyncInvoker<CreateResetTracksTaskRequest, CreateResetTracksTaskResponse>(request,
            MpcMeta.createResetTracksTask, hcClient);
    }

    /**
     * 取消声道合并任务
     *
     * 取消合并音频多声道文件。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteMergeChannelsTaskRequest 请求对象
     * @return DeleteMergeChannelsTaskResponse
     */
    public DeleteMergeChannelsTaskResponse deleteMergeChannelsTask(DeleteMergeChannelsTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteMergeChannelsTask);
    }

    /**
     * 取消声道合并任务
     *
     * 取消合并音频多声道文件。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteMergeChannelsTaskRequest 请求对象
     * @return SyncInvoker<DeleteMergeChannelsTaskRequest, DeleteMergeChannelsTaskResponse>
     */
    public SyncInvoker<DeleteMergeChannelsTaskRequest, DeleteMergeChannelsTaskResponse> deleteMergeChannelsTaskInvoker(
        DeleteMergeChannelsTaskRequest request) {
        return new SyncInvoker<DeleteMergeChannelsTaskRequest, DeleteMergeChannelsTaskResponse>(request,
            MpcMeta.deleteMergeChannelsTask, hcClient);
    }

    /**
     * 取消音轨重置任务
     *
     * 取消重置音频文件声轨任务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteResetTracksTaskRequest 请求对象
     * @return DeleteResetTracksTaskResponse
     */
    public DeleteResetTracksTaskResponse deleteResetTracksTask(DeleteResetTracksTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteResetTracksTask);
    }

    /**
     * 取消音轨重置任务
     *
     * 取消重置音频文件声轨任务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteResetTracksTaskRequest 请求对象
     * @return SyncInvoker<DeleteResetTracksTaskRequest, DeleteResetTracksTaskResponse>
     */
    public SyncInvoker<DeleteResetTracksTaskRequest, DeleteResetTracksTaskResponse> deleteResetTracksTaskInvoker(
        DeleteResetTracksTaskRequest request) {
        return new SyncInvoker<DeleteResetTracksTaskRequest, DeleteResetTracksTaskResponse>(request,
            MpcMeta.deleteResetTracksTask, hcClient);
    }

    /**
     * 查询声道合并任务
     *
     * 查询声道合并任务的状态。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListMergeChannelsTaskRequest 请求对象
     * @return ListMergeChannelsTaskResponse
     */
    public ListMergeChannelsTaskResponse listMergeChannelsTask(ListMergeChannelsTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listMergeChannelsTask);
    }

    /**
     * 查询声道合并任务
     *
     * 查询声道合并任务的状态。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListMergeChannelsTaskRequest 请求对象
     * @return SyncInvoker<ListMergeChannelsTaskRequest, ListMergeChannelsTaskResponse>
     */
    public SyncInvoker<ListMergeChannelsTaskRequest, ListMergeChannelsTaskResponse> listMergeChannelsTaskInvoker(
        ListMergeChannelsTaskRequest request) {
        return new SyncInvoker<ListMergeChannelsTaskRequest, ListMergeChannelsTaskResponse>(request,
            MpcMeta.listMergeChannelsTask, hcClient);
    }

    /**
     * 查询音轨重置任务
     *
     * 查询音轨重置任务的状态。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListResetTracksTaskRequest 请求对象
     * @return ListResetTracksTaskResponse
     */
    public ListResetTracksTaskResponse listResetTracksTask(ListResetTracksTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listResetTracksTask);
    }

    /**
     * 查询音轨重置任务
     *
     * 查询音轨重置任务的状态。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListResetTracksTaskRequest 请求对象
     * @return SyncInvoker<ListResetTracksTaskRequest, ListResetTracksTaskResponse>
     */
    public SyncInvoker<ListResetTracksTaskRequest, ListResetTracksTaskResponse> listResetTracksTaskInvoker(
        ListResetTracksTaskRequest request) {
        return new SyncInvoker<ListResetTracksTaskRequest, ListResetTracksTaskResponse>(request,
            MpcMeta.listResetTracksTask, hcClient);
    }

    /**
     * 创建视频增强任务
     *
     * ## 典型场景 ##
     *   创建视频增强任务。
     * 
     * ## 接口功能 ##
     *   创建视频增强任务。
     * 
     * ## 接口约束 ##
     *   无。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateMediaProcessTaskRequest 请求对象
     * @return CreateMediaProcessTaskResponse
     */
    public CreateMediaProcessTaskResponse createMediaProcessTask(CreateMediaProcessTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createMediaProcessTask);
    }

    /**
     * 创建视频增强任务
     *
     * ## 典型场景 ##
     *   创建视频增强任务。
     * 
     * ## 接口功能 ##
     *   创建视频增强任务。
     * 
     * ## 接口约束 ##
     *   无。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateMediaProcessTaskRequest 请求对象
     * @return SyncInvoker<CreateMediaProcessTaskRequest, CreateMediaProcessTaskResponse>
     */
    public SyncInvoker<CreateMediaProcessTaskRequest, CreateMediaProcessTaskResponse> createMediaProcessTaskInvoker(
        CreateMediaProcessTaskRequest request) {
        return new SyncInvoker<CreateMediaProcessTaskRequest, CreateMediaProcessTaskResponse>(request,
            MpcMeta.createMediaProcessTask, hcClient);
    }

    /**
     * 取消视频增强任务
     *
     * ## 典型场景 ##
     *   取消视频增强任务。
     * 
     * ## 接口功能 ##
     *   取消视频增强任务。
     * 
     * ## 接口约束 ##
     *   仅可删除正在排队中的任务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteMediaProcessTaskRequest 请求对象
     * @return DeleteMediaProcessTaskResponse
     */
    public DeleteMediaProcessTaskResponse deleteMediaProcessTask(DeleteMediaProcessTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteMediaProcessTask);
    }

    /**
     * 取消视频增强任务
     *
     * ## 典型场景 ##
     *   取消视频增强任务。
     * 
     * ## 接口功能 ##
     *   取消视频增强任务。
     * 
     * ## 接口约束 ##
     *   仅可删除正在排队中的任务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteMediaProcessTaskRequest 请求对象
     * @return SyncInvoker<DeleteMediaProcessTaskRequest, DeleteMediaProcessTaskResponse>
     */
    public SyncInvoker<DeleteMediaProcessTaskRequest, DeleteMediaProcessTaskResponse> deleteMediaProcessTaskInvoker(
        DeleteMediaProcessTaskRequest request) {
        return new SyncInvoker<DeleteMediaProcessTaskRequest, DeleteMediaProcessTaskResponse>(request,
            MpcMeta.deleteMediaProcessTask, hcClient);
    }

    /**
     * 查询视频增强任务
     *
     * ## 典型场景 ##
     *   查询视频增强任务。
     * 
     * ## 接口功能 ##
     *   查询视频增强任务。
     * 
     * ## 接口约束 ##
     *   无。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListMediaProcessTaskRequest 请求对象
     * @return ListMediaProcessTaskResponse
     */
    public ListMediaProcessTaskResponse listMediaProcessTask(ListMediaProcessTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listMediaProcessTask);
    }

    /**
     * 查询视频增强任务
     *
     * ## 典型场景 ##
     *   查询视频增强任务。
     * 
     * ## 接口功能 ##
     *   查询视频增强任务。
     * 
     * ## 接口约束 ##
     *   无。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListMediaProcessTaskRequest 请求对象
     * @return SyncInvoker<ListMediaProcessTaskRequest, ListMediaProcessTaskResponse>
     */
    public SyncInvoker<ListMediaProcessTaskRequest, ListMediaProcessTaskResponse> listMediaProcessTaskInvoker(
        ListMediaProcessTaskRequest request) {
        return new SyncInvoker<ListMediaProcessTaskRequest, ListMediaProcessTaskResponse>(request,
            MpcMeta.listMediaProcessTask, hcClient);
    }

    /**
     * mpe通知mpc
     *
     * ## 典型场景 ##
     *   mpe通知mpc。
     * ## 接口功能 ##
     *   mpe调用此接口通知mpc转封装等结果。
     * ## 接口约束 ##
     *   无。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateMpeCallBackRequest 请求对象
     * @return CreateMpeCallBackResponse
     */
    public CreateMpeCallBackResponse createMpeCallBack(CreateMpeCallBackRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createMpeCallBack);
    }

    /**
     * mpe通知mpc
     *
     * ## 典型场景 ##
     *   mpe通知mpc。
     * ## 接口功能 ##
     *   mpe调用此接口通知mpc转封装等结果。
     * ## 接口约束 ##
     *   无。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateMpeCallBackRequest 请求对象
     * @return SyncInvoker<CreateMpeCallBackRequest, CreateMpeCallBackResponse>
     */
    public SyncInvoker<CreateMpeCallBackRequest, CreateMpeCallBackResponse> createMpeCallBackInvoker(
        CreateMpeCallBackRequest request) {
        return new SyncInvoker<CreateMpeCallBackRequest, CreateMpeCallBackResponse>(request, MpcMeta.createMpeCallBack,
            hcClient);
    }

    /**
     * 创建视频增强模板
     *
     * 创建视频增强模板
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateQualityEnhanceTemplateRequest 请求对象
     * @return CreateQualityEnhanceTemplateResponse
     */
    public CreateQualityEnhanceTemplateResponse createQualityEnhanceTemplate(
        CreateQualityEnhanceTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createQualityEnhanceTemplate);
    }

    /**
     * 创建视频增强模板
     *
     * 创建视频增强模板
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateQualityEnhanceTemplateRequest 请求对象
     * @return SyncInvoker<CreateQualityEnhanceTemplateRequest, CreateQualityEnhanceTemplateResponse>
     */
    public SyncInvoker<CreateQualityEnhanceTemplateRequest, CreateQualityEnhanceTemplateResponse> createQualityEnhanceTemplateInvoker(
        CreateQualityEnhanceTemplateRequest request) {
        return new SyncInvoker<CreateQualityEnhanceTemplateRequest, CreateQualityEnhanceTemplateResponse>(request,
            MpcMeta.createQualityEnhanceTemplate, hcClient);
    }

    /**
     * 删除用户视频增强模板
     *
     * 删除用户视频增强模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteQualityEnhanceTemplateRequest 请求对象
     * @return DeleteQualityEnhanceTemplateResponse
     */
    public DeleteQualityEnhanceTemplateResponse deleteQualityEnhanceTemplate(
        DeleteQualityEnhanceTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteQualityEnhanceTemplate);
    }

    /**
     * 删除用户视频增强模板
     *
     * 删除用户视频增强模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteQualityEnhanceTemplateRequest 请求对象
     * @return SyncInvoker<DeleteQualityEnhanceTemplateRequest, DeleteQualityEnhanceTemplateResponse>
     */
    public SyncInvoker<DeleteQualityEnhanceTemplateRequest, DeleteQualityEnhanceTemplateResponse> deleteQualityEnhanceTemplateInvoker(
        DeleteQualityEnhanceTemplateRequest request) {
        return new SyncInvoker<DeleteQualityEnhanceTemplateRequest, DeleteQualityEnhanceTemplateResponse>(request,
            MpcMeta.deleteQualityEnhanceTemplate, hcClient);
    }

    /**
     * 查询视频增强预置模板
     *
     * 查询视频增强预置模板，返回所有结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListQualityEnhanceDefaultTemplateRequest 请求对象
     * @return ListQualityEnhanceDefaultTemplateResponse
     */
    public ListQualityEnhanceDefaultTemplateResponse listQualityEnhanceDefaultTemplate(
        ListQualityEnhanceDefaultTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listQualityEnhanceDefaultTemplate);
    }

    /**
     * 查询视频增强预置模板
     *
     * 查询视频增强预置模板，返回所有结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListQualityEnhanceDefaultTemplateRequest 请求对象
     * @return SyncInvoker<ListQualityEnhanceDefaultTemplateRequest, ListQualityEnhanceDefaultTemplateResponse>
     */
    public SyncInvoker<ListQualityEnhanceDefaultTemplateRequest, ListQualityEnhanceDefaultTemplateResponse> listQualityEnhanceDefaultTemplateInvoker(
        ListQualityEnhanceDefaultTemplateRequest request) {
        return new SyncInvoker<ListQualityEnhanceDefaultTemplateRequest, ListQualityEnhanceDefaultTemplateResponse>(
            request, MpcMeta.listQualityEnhanceDefaultTemplate, hcClient);
    }

    /**
     * 更新视频增强模板
     *
     * 更新视频增强模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateQualityEnhanceTemplateRequest 请求对象
     * @return UpdateQualityEnhanceTemplateResponse
     */
    public UpdateQualityEnhanceTemplateResponse updateQualityEnhanceTemplate(
        UpdateQualityEnhanceTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.updateQualityEnhanceTemplate);
    }

    /**
     * 更新视频增强模板
     *
     * 更新视频增强模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateQualityEnhanceTemplateRequest 请求对象
     * @return SyncInvoker<UpdateQualityEnhanceTemplateRequest, UpdateQualityEnhanceTemplateResponse>
     */
    public SyncInvoker<UpdateQualityEnhanceTemplateRequest, UpdateQualityEnhanceTemplateResponse> updateQualityEnhanceTemplateInvoker(
        UpdateQualityEnhanceTemplateRequest request) {
        return new SyncInvoker<UpdateQualityEnhanceTemplateRequest, UpdateQualityEnhanceTemplateResponse>(request,
            MpcMeta.updateQualityEnhanceTemplate, hcClient);
    }

    /**
     * 查询媒资转码详情
     *
     * 查询媒资转码详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTranscodeDetailRequest 请求对象
     * @return ListTranscodeDetailResponse
     */
    public ListTranscodeDetailResponse listTranscodeDetail(ListTranscodeDetailRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listTranscodeDetail);
    }

    /**
     * 查询媒资转码详情
     *
     * 查询媒资转码详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTranscodeDetailRequest 请求对象
     * @return SyncInvoker<ListTranscodeDetailRequest, ListTranscodeDetailResponse>
     */
    public SyncInvoker<ListTranscodeDetailRequest, ListTranscodeDetailResponse> listTranscodeDetailInvoker(
        ListTranscodeDetailRequest request) {
        return new SyncInvoker<ListTranscodeDetailRequest, ListTranscodeDetailResponse>(request,
            MpcMeta.listTranscodeDetail, hcClient);
    }

    /**
     * 取消转封装任务
     *
     * 取消已下发的转封装任务，仅支持取消正在排队中的任务。。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CancelRemuxTaskRequest 请求对象
     * @return CancelRemuxTaskResponse
     */
    public CancelRemuxTaskResponse cancelRemuxTask(CancelRemuxTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.cancelRemuxTask);
    }

    /**
     * 取消转封装任务
     *
     * 取消已下发的转封装任务，仅支持取消正在排队中的任务。。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CancelRemuxTaskRequest 请求对象
     * @return SyncInvoker<CancelRemuxTaskRequest, CancelRemuxTaskResponse>
     */
    public SyncInvoker<CancelRemuxTaskRequest, CancelRemuxTaskResponse> cancelRemuxTaskInvoker(
        CancelRemuxTaskRequest request) {
        return new SyncInvoker<CancelRemuxTaskRequest, CancelRemuxTaskResponse>(request, MpcMeta.cancelRemuxTask,
            hcClient);
    }

    /**
     * 新建转封装任务
     *
     * 创建转封装任务，转换音视频文件的格式，但不改变其分辨率和码率。
     * 待转封装的媒资文件需要存储在与媒体处理服务同区域的OBS桶中，且该OBS桶已授权。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateRemuxTaskRequest 请求对象
     * @return CreateRemuxTaskResponse
     */
    public CreateRemuxTaskResponse createRemuxTask(CreateRemuxTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createRemuxTask);
    }

    /**
     * 新建转封装任务
     *
     * 创建转封装任务，转换音视频文件的格式，但不改变其分辨率和码率。
     * 待转封装的媒资文件需要存储在与媒体处理服务同区域的OBS桶中，且该OBS桶已授权。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateRemuxTaskRequest 请求对象
     * @return SyncInvoker<CreateRemuxTaskRequest, CreateRemuxTaskResponse>
     */
    public SyncInvoker<CreateRemuxTaskRequest, CreateRemuxTaskResponse> createRemuxTaskInvoker(
        CreateRemuxTaskRequest request) {
        return new SyncInvoker<CreateRemuxTaskRequest, CreateRemuxTaskResponse>(request, MpcMeta.createRemuxTask,
            hcClient);
    }

    /**
     * 重试转封装任务
     *
     * 对失败的转封装任务进行重试。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateRetryRemuxTaskRequest 请求对象
     * @return CreateRetryRemuxTaskResponse
     */
    public CreateRetryRemuxTaskResponse createRetryRemuxTask(CreateRetryRemuxTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createRetryRemuxTask);
    }

    /**
     * 重试转封装任务
     *
     * 对失败的转封装任务进行重试。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateRetryRemuxTaskRequest 请求对象
     * @return SyncInvoker<CreateRetryRemuxTaskRequest, CreateRetryRemuxTaskResponse>
     */
    public SyncInvoker<CreateRetryRemuxTaskRequest, CreateRetryRemuxTaskResponse> createRetryRemuxTaskInvoker(
        CreateRetryRemuxTaskRequest request) {
        return new SyncInvoker<CreateRetryRemuxTaskRequest, CreateRetryRemuxTaskResponse>(request,
            MpcMeta.createRetryRemuxTask, hcClient);
    }

    /**
     * 删除转封装任务(仅供Console调用)
     *
     * 删除转封装任务
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteRemuxTaskRequest 请求对象
     * @return DeleteRemuxTaskResponse
     */
    public DeleteRemuxTaskResponse deleteRemuxTask(DeleteRemuxTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteRemuxTask);
    }

    /**
     * 删除转封装任务(仅供Console调用)
     *
     * 删除转封装任务
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteRemuxTaskRequest 请求对象
     * @return SyncInvoker<DeleteRemuxTaskRequest, DeleteRemuxTaskResponse>
     */
    public SyncInvoker<DeleteRemuxTaskRequest, DeleteRemuxTaskResponse> deleteRemuxTaskInvoker(
        DeleteRemuxTaskRequest request) {
        return new SyncInvoker<DeleteRemuxTaskRequest, DeleteRemuxTaskResponse>(request, MpcMeta.deleteRemuxTask,
            hcClient);
    }

    /**
     * 查询转封装任务
     *
     * 查询转封装任务状态。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListRemuxTaskRequest 请求对象
     * @return ListRemuxTaskResponse
     */
    public ListRemuxTaskResponse listRemuxTask(ListRemuxTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listRemuxTask);
    }

    /**
     * 查询转封装任务
     *
     * 查询转封装任务状态。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListRemuxTaskRequest 请求对象
     * @return SyncInvoker<ListRemuxTaskRequest, ListRemuxTaskResponse>
     */
    public SyncInvoker<ListRemuxTaskRequest, ListRemuxTaskResponse> listRemuxTaskInvoker(ListRemuxTaskRequest request) {
        return new SyncInvoker<ListRemuxTaskRequest, ListRemuxTaskResponse>(request, MpcMeta.listRemuxTask, hcClient);
    }

    /**
     * 新建转码模板组
     *
     * 新建转码模板组，最多支持一进六出。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateTemplateGroupRequest 请求对象
     * @return CreateTemplateGroupResponse
     */
    public CreateTemplateGroupResponse createTemplateGroup(CreateTemplateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createTemplateGroup);
    }

    /**
     * 新建转码模板组
     *
     * 新建转码模板组，最多支持一进六出。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateTemplateGroupRequest 请求对象
     * @return SyncInvoker<CreateTemplateGroupRequest, CreateTemplateGroupResponse>
     */
    public SyncInvoker<CreateTemplateGroupRequest, CreateTemplateGroupResponse> createTemplateGroupInvoker(
        CreateTemplateGroupRequest request) {
        return new SyncInvoker<CreateTemplateGroupRequest, CreateTemplateGroupResponse>(request,
            MpcMeta.createTemplateGroup, hcClient);
    }

    /**
     * 删除转码模板组
     *
     * 删除转码模板组。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteTemplateGroupRequest 请求对象
     * @return DeleteTemplateGroupResponse
     */
    public DeleteTemplateGroupResponse deleteTemplateGroup(DeleteTemplateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteTemplateGroup);
    }

    /**
     * 删除转码模板组
     *
     * 删除转码模板组。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteTemplateGroupRequest 请求对象
     * @return SyncInvoker<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse>
     */
    public SyncInvoker<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse> deleteTemplateGroupInvoker(
        DeleteTemplateGroupRequest request) {
        return new SyncInvoker<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse>(request,
            MpcMeta.deleteTemplateGroup, hcClient);
    }

    /**
     * 查询转码模板组
     *
     * 查询转码模板组列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTemplateGroupRequest 请求对象
     * @return ListTemplateGroupResponse
     */
    public ListTemplateGroupResponse listTemplateGroup(ListTemplateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listTemplateGroup);
    }

    /**
     * 查询转码模板组
     *
     * 查询转码模板组列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTemplateGroupRequest 请求对象
     * @return SyncInvoker<ListTemplateGroupRequest, ListTemplateGroupResponse>
     */
    public SyncInvoker<ListTemplateGroupRequest, ListTemplateGroupResponse> listTemplateGroupInvoker(
        ListTemplateGroupRequest request) {
        return new SyncInvoker<ListTemplateGroupRequest, ListTemplateGroupResponse>(request, MpcMeta.listTemplateGroup,
            hcClient);
    }

    /**
     * 更新转码模板组
     *
     * 修改模板组接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateTemplateGroupRequest 请求对象
     * @return UpdateTemplateGroupResponse
     */
    public UpdateTemplateGroupResponse updateTemplateGroup(UpdateTemplateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.updateTemplateGroup);
    }

    /**
     * 更新转码模板组
     *
     * 修改模板组接口。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateTemplateGroupRequest 请求对象
     * @return SyncInvoker<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse>
     */
    public SyncInvoker<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse> updateTemplateGroupInvoker(
        UpdateTemplateGroupRequest request) {
        return new SyncInvoker<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse>(request,
            MpcMeta.updateTemplateGroup, hcClient);
    }

    /**
     * 新建截图任务
     *
     * 新建截图任务，视频截图将从首帧开始，按设置的时间间隔截图，最后截取末帧。
     * 待截图的视频文件需要存储在与媒体处理服务同区域的OBS桶中，且该OBS桶已授权。
     * 
     * 约束：
     *   暂只支持生成JPG格式的图片文件。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateThumbnailsTaskRequest 请求对象
     * @return CreateThumbnailsTaskResponse
     */
    public CreateThumbnailsTaskResponse createThumbnailsTask(CreateThumbnailsTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createThumbnailsTask);
    }

    /**
     * 新建截图任务
     *
     * 新建截图任务，视频截图将从首帧开始，按设置的时间间隔截图，最后截取末帧。
     * 待截图的视频文件需要存储在与媒体处理服务同区域的OBS桶中，且该OBS桶已授权。
     * 
     * 约束：
     *   暂只支持生成JPG格式的图片文件。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateThumbnailsTaskRequest 请求对象
     * @return SyncInvoker<CreateThumbnailsTaskRequest, CreateThumbnailsTaskResponse>
     */
    public SyncInvoker<CreateThumbnailsTaskRequest, CreateThumbnailsTaskResponse> createThumbnailsTaskInvoker(
        CreateThumbnailsTaskRequest request) {
        return new SyncInvoker<CreateThumbnailsTaskRequest, CreateThumbnailsTaskResponse>(request,
            MpcMeta.createThumbnailsTask, hcClient);
    }

    /**
     * 取消截图任务
     *
     * 取消已下发截图任务。
     * 只能取消已接受尚在队列中等待处理的任务，已完成或正在执行阶段的任务不能取消。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteThumbnailsTaskRequest 请求对象
     * @return DeleteThumbnailsTaskResponse
     */
    public DeleteThumbnailsTaskResponse deleteThumbnailsTask(DeleteThumbnailsTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteThumbnailsTask);
    }

    /**
     * 取消截图任务
     *
     * 取消已下发截图任务。
     * 只能取消已接受尚在队列中等待处理的任务，已完成或正在执行阶段的任务不能取消。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteThumbnailsTaskRequest 请求对象
     * @return SyncInvoker<DeleteThumbnailsTaskRequest, DeleteThumbnailsTaskResponse>
     */
    public SyncInvoker<DeleteThumbnailsTaskRequest, DeleteThumbnailsTaskResponse> deleteThumbnailsTaskInvoker(
        DeleteThumbnailsTaskRequest request) {
        return new SyncInvoker<DeleteThumbnailsTaskRequest, DeleteThumbnailsTaskResponse>(request,
            MpcMeta.deleteThumbnailsTask, hcClient);
    }

    /**
     * 查询截图任务
     *
     * 查询截图任务状态。返回任务执行结果，包括状态、输入、输出等信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListThumbnailsTaskRequest 请求对象
     * @return ListThumbnailsTaskResponse
     */
    public ListThumbnailsTaskResponse listThumbnailsTask(ListThumbnailsTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listThumbnailsTask);
    }

    /**
     * 查询截图任务
     *
     * 查询截图任务状态。返回任务执行结果，包括状态、输入、输出等信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListThumbnailsTaskRequest 请求对象
     * @return SyncInvoker<ListThumbnailsTaskRequest, ListThumbnailsTaskResponse>
     */
    public SyncInvoker<ListThumbnailsTaskRequest, ListThumbnailsTaskResponse> listThumbnailsTaskInvoker(
        ListThumbnailsTaskRequest request) {
        return new SyncInvoker<ListThumbnailsTaskRequest, ListThumbnailsTaskResponse>(request,
            MpcMeta.listThumbnailsTask, hcClient);
    }

    /**
     * 新建转码任务
     *
     * 新建转码任务可以将视频进行转码，并在转码过程中压制水印、视频截图等。视频转码前需要配置转码模板。
     * 待转码的音视频需要存储在与媒体处理服务同区域的OBS桶中，且该OBS桶已授权。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateTranscodingTaskRequest 请求对象
     * @return CreateTranscodingTaskResponse
     */
    public CreateTranscodingTaskResponse createTranscodingTask(CreateTranscodingTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createTranscodingTask);
    }

    /**
     * 新建转码任务
     *
     * 新建转码任务可以将视频进行转码，并在转码过程中压制水印、视频截图等。视频转码前需要配置转码模板。
     * 待转码的音视频需要存储在与媒体处理服务同区域的OBS桶中，且该OBS桶已授权。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateTranscodingTaskRequest 请求对象
     * @return SyncInvoker<CreateTranscodingTaskRequest, CreateTranscodingTaskResponse>
     */
    public SyncInvoker<CreateTranscodingTaskRequest, CreateTranscodingTaskResponse> createTranscodingTaskInvoker(
        CreateTranscodingTaskRequest request) {
        return new SyncInvoker<CreateTranscodingTaskRequest, CreateTranscodingTaskResponse>(request,
            MpcMeta.createTranscodingTask, hcClient);
    }

    /**
     * 取消转码任务
     *
     * 取消已下发转码任务。
     * 只能取消正在转码任务队列中排队的转码任务。已开始转码或已完成的转码任务不能取消。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteTranscodingTaskRequest 请求对象
     * @return DeleteTranscodingTaskResponse
     */
    public DeleteTranscodingTaskResponse deleteTranscodingTask(DeleteTranscodingTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteTranscodingTask);
    }

    /**
     * 取消转码任务
     *
     * 取消已下发转码任务。
     * 只能取消正在转码任务队列中排队的转码任务。已开始转码或已完成的转码任务不能取消。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteTranscodingTaskRequest 请求对象
     * @return SyncInvoker<DeleteTranscodingTaskRequest, DeleteTranscodingTaskResponse>
     */
    public SyncInvoker<DeleteTranscodingTaskRequest, DeleteTranscodingTaskResponse> deleteTranscodingTaskInvoker(
        DeleteTranscodingTaskRequest request) {
        return new SyncInvoker<DeleteTranscodingTaskRequest, DeleteTranscodingTaskResponse>(request,
            MpcMeta.deleteTranscodingTask, hcClient);
    }

    /**
     * 查询转码任务
     *
     * 查询转码任务状态。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTranscodingTaskRequest 请求对象
     * @return ListTranscodingTaskResponse
     */
    public ListTranscodingTaskResponse listTranscodingTask(ListTranscodingTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listTranscodingTask);
    }

    /**
     * 查询转码任务
     *
     * 查询转码任务状态。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTranscodingTaskRequest 请求对象
     * @return SyncInvoker<ListTranscodingTaskRequest, ListTranscodingTaskResponse>
     */
    public SyncInvoker<ListTranscodingTaskRequest, ListTranscodingTaskResponse> listTranscodingTaskInvoker(
        ListTranscodingTaskRequest request) {
        return new SyncInvoker<ListTranscodingTaskRequest, ListTranscodingTaskResponse>(request,
            MpcMeta.listTranscodingTask, hcClient);
    }

    /**
     * 新建转码模板
     *
     * 新建转码模板，采用自定义的模板转码。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateTransTemplateRequest 请求对象
     * @return CreateTransTemplateResponse
     */
    public CreateTransTemplateResponse createTransTemplate(CreateTransTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createTransTemplate);
    }

    /**
     * 新建转码模板
     *
     * 新建转码模板，采用自定义的模板转码。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateTransTemplateRequest 请求对象
     * @return SyncInvoker<CreateTransTemplateRequest, CreateTransTemplateResponse>
     */
    public SyncInvoker<CreateTransTemplateRequest, CreateTransTemplateResponse> createTransTemplateInvoker(
        CreateTransTemplateRequest request) {
        return new SyncInvoker<CreateTransTemplateRequest, CreateTransTemplateResponse>(request,
            MpcMeta.createTransTemplate, hcClient);
    }

    /**
     * 删除转码模板
     *
     * 删除转码模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteTemplateRequest 请求对象
     * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteTemplate);
    }

    /**
     * 删除转码模板
     *
     * 删除转码模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteTemplateRequest 请求对象
     * @return SyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse>
     */
    public SyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplateInvoker(
        DeleteTemplateRequest request) {
        return new SyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse>(request, MpcMeta.deleteTemplate,
            hcClient);
    }

    /**
     * 查询转码模板
     *
     * 查询用户自定义转码配置模板。
     * 支持指定模板ID查询，或分页全量查询。转码配置模板ID，最多10个。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTemplateRequest 请求对象
     * @return ListTemplateResponse
     */
    public ListTemplateResponse listTemplate(ListTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listTemplate);
    }

    /**
     * 查询转码模板
     *
     * 查询用户自定义转码配置模板。
     * 支持指定模板ID查询，或分页全量查询。转码配置模板ID，最多10个。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTemplateRequest 请求对象
     * @return SyncInvoker<ListTemplateRequest, ListTemplateResponse>
     */
    public SyncInvoker<ListTemplateRequest, ListTemplateResponse> listTemplateInvoker(ListTemplateRequest request) {
        return new SyncInvoker<ListTemplateRequest, ListTemplateResponse>(request, MpcMeta.listTemplate, hcClient);
    }

    /**
     * 更新转码模板
     *
     * 更新转码模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateTransTemplateRequest 请求对象
     * @return UpdateTransTemplateResponse
     */
    public UpdateTransTemplateResponse updateTransTemplate(UpdateTransTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.updateTransTemplate);
    }

    /**
     * 更新转码模板
     *
     * 更新转码模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateTransTemplateRequest 请求对象
     * @return SyncInvoker<UpdateTransTemplateRequest, UpdateTransTemplateResponse>
     */
    public SyncInvoker<UpdateTransTemplateRequest, UpdateTransTemplateResponse> updateTransTemplateInvoker(
        UpdateTransTemplateRequest request) {
        return new SyncInvoker<UpdateTransTemplateRequest, UpdateTransTemplateResponse>(request,
            MpcMeta.updateTransTemplate, hcClient);
    }

    /**
     * 新建水印模板
     *
     * 自定义水印模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateWatermarkTemplateRequest 请求对象
     * @return CreateWatermarkTemplateResponse
     */
    public CreateWatermarkTemplateResponse createWatermarkTemplate(CreateWatermarkTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createWatermarkTemplate);
    }

    /**
     * 新建水印模板
     *
     * 自定义水印模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateWatermarkTemplateRequest 请求对象
     * @return SyncInvoker<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse>
     */
    public SyncInvoker<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse> createWatermarkTemplateInvoker(
        CreateWatermarkTemplateRequest request) {
        return new SyncInvoker<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse>(request,
            MpcMeta.createWatermarkTemplate, hcClient);
    }

    /**
     * 删除水印模板
     *
     * 删除自定义水印模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteWatermarkTemplateRequest 请求对象
     * @return DeleteWatermarkTemplateResponse
     */
    public DeleteWatermarkTemplateResponse deleteWatermarkTemplate(DeleteWatermarkTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteWatermarkTemplate);
    }

    /**
     * 删除水印模板
     *
     * 删除自定义水印模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteWatermarkTemplateRequest 请求对象
     * @return SyncInvoker<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse>
     */
    public SyncInvoker<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse> deleteWatermarkTemplateInvoker(
        DeleteWatermarkTemplateRequest request) {
        return new SyncInvoker<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse>(request,
            MpcMeta.deleteWatermarkTemplate, hcClient);
    }

    /**
     * 查询水印模板
     *
     * 查询自定义水印模板。支持指定模板ID查询，或分页全量查询。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListWatermarkTemplateRequest 请求对象
     * @return ListWatermarkTemplateResponse
     */
    public ListWatermarkTemplateResponse listWatermarkTemplate(ListWatermarkTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listWatermarkTemplate);
    }

    /**
     * 查询水印模板
     *
     * 查询自定义水印模板。支持指定模板ID查询，或分页全量查询。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListWatermarkTemplateRequest 请求对象
     * @return SyncInvoker<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse>
     */
    public SyncInvoker<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse> listWatermarkTemplateInvoker(
        ListWatermarkTemplateRequest request) {
        return new SyncInvoker<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse>(request,
            MpcMeta.listWatermarkTemplate, hcClient);
    }

    /**
     * 更新水印模板
     *
     * 更新自定义水印模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateWatermarkTemplateRequest 请求对象
     * @return UpdateWatermarkTemplateResponse
     */
    public UpdateWatermarkTemplateResponse updateWatermarkTemplate(UpdateWatermarkTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.updateWatermarkTemplate);
    }

    /**
     * 更新水印模板
     *
     * 更新自定义水印模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateWatermarkTemplateRequest 请求对象
     * @return SyncInvoker<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse>
     */
    public SyncInvoker<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse> updateWatermarkTemplateInvoker(
        UpdateWatermarkTemplateRequest request) {
        return new SyncInvoker<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse>(request,
            MpcMeta.updateWatermarkTemplate, hcClient);
    }

}

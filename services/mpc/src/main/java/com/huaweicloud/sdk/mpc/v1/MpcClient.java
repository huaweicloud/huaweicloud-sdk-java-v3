package com.huaweicloud.sdk.mpc.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.mpc.v1.model.CancelRemuxTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.CancelRemuxTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.CreateAgenciesTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.CreateAgenciesTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.CreateAnimatedGraphicsTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.CreateAnimatedGraphicsTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.CreateEditingJobRequest;
import com.huaweicloud.sdk.mpc.v1.model.CreateEditingJobResponse;
import com.huaweicloud.sdk.mpc.v1.model.CreateEncryptTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.CreateEncryptTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.CreateExtractTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.CreateExtractTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.CreateMbTasksReportRequest;
import com.huaweicloud.sdk.mpc.v1.model.CreateMbTasksReportResponse;
import com.huaweicloud.sdk.mpc.v1.model.CreateMediaProcessTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.CreateMediaProcessTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.CreateMergeChannelsTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.CreateMergeChannelsTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.CreateMpeCallBackRequest;
import com.huaweicloud.sdk.mpc.v1.model.CreateMpeCallBackResponse;
import com.huaweicloud.sdk.mpc.v1.model.CreateQualityEnhanceTemplateRequest;
import com.huaweicloud.sdk.mpc.v1.model.CreateQualityEnhanceTemplateResponse;
import com.huaweicloud.sdk.mpc.v1.model.CreateRemuxTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.CreateRemuxTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.CreateResetTracksTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.CreateResetTracksTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.CreateRetryRemuxTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.CreateRetryRemuxTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.CreateTemplateGroupRequest;
import com.huaweicloud.sdk.mpc.v1.model.CreateTemplateGroupResponse;
import com.huaweicloud.sdk.mpc.v1.model.CreateThumbnailsTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.CreateThumbnailsTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.CreateTransTemplateRequest;
import com.huaweicloud.sdk.mpc.v1.model.CreateTransTemplateResponse;
import com.huaweicloud.sdk.mpc.v1.model.CreateTranscodingTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.CreateTranscodingTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.CreateWatermarkTemplateRequest;
import com.huaweicloud.sdk.mpc.v1.model.CreateWatermarkTemplateResponse;
import com.huaweicloud.sdk.mpc.v1.model.DeleteAnimatedGraphicsTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.DeleteAnimatedGraphicsTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.DeleteEditingJobRequest;
import com.huaweicloud.sdk.mpc.v1.model.DeleteEditingJobResponse;
import com.huaweicloud.sdk.mpc.v1.model.DeleteEncryptTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.DeleteEncryptTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.DeleteExtractTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.DeleteExtractTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.DeleteMediaProcessTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.DeleteMediaProcessTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.DeleteMergeChannelsTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.DeleteMergeChannelsTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.DeleteQualityEnhanceTemplateRequest;
import com.huaweicloud.sdk.mpc.v1.model.DeleteQualityEnhanceTemplateResponse;
import com.huaweicloud.sdk.mpc.v1.model.DeleteRemuxTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.DeleteRemuxTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.DeleteResetTracksTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.DeleteResetTracksTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.DeleteTemplateGroupRequest;
import com.huaweicloud.sdk.mpc.v1.model.DeleteTemplateGroupResponse;
import com.huaweicloud.sdk.mpc.v1.model.DeleteTemplateRequest;
import com.huaweicloud.sdk.mpc.v1.model.DeleteTemplateResponse;
import com.huaweicloud.sdk.mpc.v1.model.DeleteThumbnailsTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.DeleteThumbnailsTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.DeleteTranscodingTaskByConsoleRequest;
import com.huaweicloud.sdk.mpc.v1.model.DeleteTranscodingTaskByConsoleResponse;
import com.huaweicloud.sdk.mpc.v1.model.DeleteTranscodingTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.DeleteTranscodingTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.DeleteWatermarkTemplateRequest;
import com.huaweicloud.sdk.mpc.v1.model.DeleteWatermarkTemplateResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListAllBucketsRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListAllBucketsResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListAllObsObjListRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListAllObsObjListResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListAnimatedGraphicsTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListAnimatedGraphicsTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListEditingJobRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListEditingJobResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListEncryptTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListEncryptTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListExtractTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListExtractTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListMediaProcessTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListMediaProcessTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListMergeChannelsTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListMergeChannelsTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListNotifyEventRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListNotifyEventResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListNotifySmnTopicConfigRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListNotifySmnTopicConfigResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListQualityEnhanceDefaultTemplateRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListQualityEnhanceDefaultTemplateResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListRemuxTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListRemuxTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListResetTracksTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListResetTracksTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListStatSummaryRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListStatSummaryResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListTemplateGroupRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListTemplateGroupResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListTemplateRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListTemplateResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListThumbnailsTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListThumbnailsTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListTranscodeDetailRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListTranscodeDetailResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListTranscodingTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListTranscodingTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.ListWatermarkTemplateRequest;
import com.huaweicloud.sdk.mpc.v1.model.ListWatermarkTemplateResponse;
import com.huaweicloud.sdk.mpc.v1.model.NotifySmnTopicConfigRequest;
import com.huaweicloud.sdk.mpc.v1.model.NotifySmnTopicConfigResponse;
import com.huaweicloud.sdk.mpc.v1.model.ShowAgenciesTaskRequest;
import com.huaweicloud.sdk.mpc.v1.model.ShowAgenciesTaskResponse;
import com.huaweicloud.sdk.mpc.v1.model.ShowTenantAccessInfoRequest;
import com.huaweicloud.sdk.mpc.v1.model.ShowTenantAccessInfoResponse;
import com.huaweicloud.sdk.mpc.v1.model.UpdateBucketAuthorizedRequest;
import com.huaweicloud.sdk.mpc.v1.model.UpdateBucketAuthorizedResponse;
import com.huaweicloud.sdk.mpc.v1.model.UpdateQualityEnhanceTemplateRequest;
import com.huaweicloud.sdk.mpc.v1.model.UpdateQualityEnhanceTemplateResponse;
import com.huaweicloud.sdk.mpc.v1.model.UpdateTemplateGroupRequest;
import com.huaweicloud.sdk.mpc.v1.model.UpdateTemplateGroupResponse;
import com.huaweicloud.sdk.mpc.v1.model.UpdateTenantAccessInfoRequest;
import com.huaweicloud.sdk.mpc.v1.model.UpdateTenantAccessInfoResponse;
import com.huaweicloud.sdk.mpc.v1.model.UpdateTransTemplateRequest;
import com.huaweicloud.sdk.mpc.v1.model.UpdateTransTemplateResponse;
import com.huaweicloud.sdk.mpc.v1.model.UpdateWatermarkTemplateRequest;
import com.huaweicloud.sdk.mpc.v1.model.UpdateWatermarkTemplateResponse;

public class MpcClient {

    protected HcClient hcClient;

    public MpcClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<MpcClient> newBuilder() {
        ClientBuilder<MpcClient> clientBuilder = new ClientBuilder<>(MpcClient::new);
        return clientBuilder;
    }

    /**
     * 新建转动图任务
     *
     * 创建动图任务，用于将完整的视频文件或视频文件中的一部分转换为动态图文件，暂只支持输出GIF文件。
     * 待转动图的视频文件需要存储在与媒体处理服务同区域的OBS桶中，且该OBS桶已授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAnimatedGraphicsTaskRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAnimatedGraphicsTaskRequest 请求对象
     * @return SyncInvoker<CreateAnimatedGraphicsTaskRequest, CreateAnimatedGraphicsTaskResponse>
     */
    public SyncInvoker<CreateAnimatedGraphicsTaskRequest, CreateAnimatedGraphicsTaskResponse> createAnimatedGraphicsTaskInvoker(
        CreateAnimatedGraphicsTaskRequest request) {
        return new SyncInvoker<>(request, MpcMeta.createAnimatedGraphicsTask, hcClient);
    }

    /**
     * 取消转动图任务
     *
     * 取消已下发的生成动图任务，仅支持取消正在排队中的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAnimatedGraphicsTaskRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAnimatedGraphicsTaskRequest 请求对象
     * @return SyncInvoker<DeleteAnimatedGraphicsTaskRequest, DeleteAnimatedGraphicsTaskResponse>
     */
    public SyncInvoker<DeleteAnimatedGraphicsTaskRequest, DeleteAnimatedGraphicsTaskResponse> deleteAnimatedGraphicsTaskInvoker(
        DeleteAnimatedGraphicsTaskRequest request) {
        return new SyncInvoker<>(request, MpcMeta.deleteAnimatedGraphicsTask, hcClient);
    }

    /**
     * 查询转动图任务
     *
     * 查询动图任务的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAnimatedGraphicsTaskRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAnimatedGraphicsTaskRequest 请求对象
     * @return SyncInvoker<ListAnimatedGraphicsTaskRequest, ListAnimatedGraphicsTaskResponse>
     */
    public SyncInvoker<ListAnimatedGraphicsTaskRequest, ListAnimatedGraphicsTaskResponse> listAnimatedGraphicsTaskInvoker(
        ListAnimatedGraphicsTaskRequest request) {
        return new SyncInvoker<>(request, MpcMeta.listAnimatedGraphicsTask, hcClient);
    }

    /**
     * 请求委托任务
     *
     * 开启或关闭\&quot;委托授权\&quot;, 开启后，媒体处理服务将拥有您所有桶的读写权限，子账号不支持委托授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgenciesTaskRequest 请求对象
     * @return CreateAgenciesTaskResponse
     */
    public CreateAgenciesTaskResponse createAgenciesTask(CreateAgenciesTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createAgenciesTask);
    }

    /**
     * 请求委托任务
     *
     * 开启或关闭\&quot;委托授权\&quot;, 开启后，媒体处理服务将拥有您所有桶的读写权限，子账号不支持委托授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgenciesTaskRequest 请求对象
     * @return SyncInvoker<CreateAgenciesTaskRequest, CreateAgenciesTaskResponse>
     */
    public SyncInvoker<CreateAgenciesTaskRequest, CreateAgenciesTaskResponse> createAgenciesTaskInvoker(
        CreateAgenciesTaskRequest request) {
        return new SyncInvoker<>(request, MpcMeta.createAgenciesTask, hcClient);
    }

    /**
     * 查询桶列表
     *
     * 请求查询自己创建的指定的桶区域位置的桶列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllBucketsRequest 请求对象
     * @return ListAllBucketsResponse
     */
    public ListAllBucketsResponse listAllBuckets(ListAllBucketsRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listAllBuckets);
    }

    /**
     * 查询桶列表
     *
     * 请求查询自己创建的指定的桶区域位置的桶列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllBucketsRequest 请求对象
     * @return SyncInvoker<ListAllBucketsRequest, ListAllBucketsResponse>
     */
    public SyncInvoker<ListAllBucketsRequest, ListAllBucketsResponse> listAllBucketsInvoker(
        ListAllBucketsRequest request) {
        return new SyncInvoker<>(request, MpcMeta.listAllBuckets, hcClient);
    }

    /**
     * 查询桶里的object
     *
     * 查询桶里的object。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllObsObjListRequest 请求对象
     * @return ListAllObsObjListResponse
     */
    public ListAllObsObjListResponse listAllObsObjList(ListAllObsObjListRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listAllObsObjList);
    }

    /**
     * 查询桶里的object
     *
     * 查询桶里的object。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllObsObjListRequest 请求对象
     * @return SyncInvoker<ListAllObsObjListRequest, ListAllObsObjListResponse>
     */
    public SyncInvoker<ListAllObsObjListRequest, ListAllObsObjListResponse> listAllObsObjListInvoker(
        ListAllObsObjListRequest request) {
        return new SyncInvoker<>(request, MpcMeta.listAllObsObjList, hcClient);
    }

    /**
     * 查询转码服务端所有事件
     *
     * 查询消息订阅功能板块, SMN主题的所有订阅事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotifyEventRequest 请求对象
     * @return ListNotifyEventResponse
     */
    public ListNotifyEventResponse listNotifyEvent(ListNotifyEventRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listNotifyEvent);
    }

    /**
     * 查询转码服务端所有事件
     *
     * 查询消息订阅功能板块, SMN主题的所有订阅事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotifyEventRequest 请求对象
     * @return SyncInvoker<ListNotifyEventRequest, ListNotifyEventResponse>
     */
    public SyncInvoker<ListNotifyEventRequest, ListNotifyEventResponse> listNotifyEventInvoker(
        ListNotifyEventRequest request) {
        return new SyncInvoker<>(request, MpcMeta.listNotifyEvent, hcClient);
    }

    /**
     * 查询转码服务端事件通知
     *
     * 查询消息订阅功能板块, SMN主题的订阅事件的启用状态和订阅消息的启用状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotifySmnTopicConfigRequest 请求对象
     * @return ListNotifySmnTopicConfigResponse
     */
    public ListNotifySmnTopicConfigResponse listNotifySmnTopicConfig(ListNotifySmnTopicConfigRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listNotifySmnTopicConfig);
    }

    /**
     * 查询转码服务端事件通知
     *
     * 查询消息订阅功能板块, SMN主题的订阅事件的启用状态和订阅消息的启用状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotifySmnTopicConfigRequest 请求对象
     * @return SyncInvoker<ListNotifySmnTopicConfigRequest, ListNotifySmnTopicConfigResponse>
     */
    public SyncInvoker<ListNotifySmnTopicConfigRequest, ListNotifySmnTopicConfigResponse> listNotifySmnTopicConfigInvoker(
        ListNotifySmnTopicConfigRequest request) {
        return new SyncInvoker<>(request, MpcMeta.listNotifySmnTopicConfig, hcClient);
    }

    /**
     * 配置转码服务端事件通知
     *
     * 配置转码服务端事件通知。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NotifySmnTopicConfigRequest 请求对象
     * @return NotifySmnTopicConfigResponse
     */
    public NotifySmnTopicConfigResponse notifySmnTopicConfig(NotifySmnTopicConfigRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.notifySmnTopicConfig);
    }

    /**
     * 配置转码服务端事件通知
     *
     * 配置转码服务端事件通知。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NotifySmnTopicConfigRequest 请求对象
     * @return SyncInvoker<NotifySmnTopicConfigRequest, NotifySmnTopicConfigResponse>
     */
    public SyncInvoker<NotifySmnTopicConfigRequest, NotifySmnTopicConfigResponse> notifySmnTopicConfigInvoker(
        NotifySmnTopicConfigRequest request) {
        return new SyncInvoker<>(request, MpcMeta.notifySmnTopicConfig, hcClient);
    }

    /**
     * 查询创建委托任务状态
     *
     * 查询创建委托任务状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgenciesTaskRequest 请求对象
     * @return ShowAgenciesTaskResponse
     */
    public ShowAgenciesTaskResponse showAgenciesTask(ShowAgenciesTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.showAgenciesTask);
    }

    /**
     * 查询创建委托任务状态
     *
     * 查询创建委托任务状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgenciesTaskRequest 请求对象
     * @return SyncInvoker<ShowAgenciesTaskRequest, ShowAgenciesTaskResponse>
     */
    public SyncInvoker<ShowAgenciesTaskRequest, ShowAgenciesTaskResponse> showAgenciesTaskInvoker(
        ShowAgenciesTaskRequest request) {
        return new SyncInvoker<>(request, MpcMeta.showAgenciesTask, hcClient);
    }

    /**
     * 桶授权或取消授权
     *
     * 对OBS桶进行授权或取消授权，媒体处理服务仅拥有已授权桶的读写权限。（暂不支持KMS加密桶的授权）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBucketAuthorizedRequest 请求对象
     * @return UpdateBucketAuthorizedResponse
     */
    public UpdateBucketAuthorizedResponse updateBucketAuthorized(UpdateBucketAuthorizedRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.updateBucketAuthorized);
    }

    /**
     * 桶授权或取消授权
     *
     * 对OBS桶进行授权或取消授权，媒体处理服务仅拥有已授权桶的读写权限。（暂不支持KMS加密桶的授权）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBucketAuthorizedRequest 请求对象
     * @return SyncInvoker<UpdateBucketAuthorizedRequest, UpdateBucketAuthorizedResponse>
     */
    public SyncInvoker<UpdateBucketAuthorizedRequest, UpdateBucketAuthorizedResponse> updateBucketAuthorizedInvoker(
        UpdateBucketAuthorizedRequest request) {
        return new SyncInvoker<>(request, MpcMeta.updateBucketAuthorized, hcClient);
    }

    /**
     * 新建剪辑任务
     *
     * 创建剪辑任务，用于将多个视频文件进行裁剪成多个视频分段，并且可以把这些视频分段合并成一个视频，剪切和拼接功能可以单独使用。
     * 待剪辑的视频文件需要存储在与媒体处理服务同区域的OBS桶中，且该OBS桶已授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEditingJobRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEditingJobRequest 请求对象
     * @return SyncInvoker<CreateEditingJobRequest, CreateEditingJobResponse>
     */
    public SyncInvoker<CreateEditingJobRequest, CreateEditingJobResponse> createEditingJobInvoker(
        CreateEditingJobRequest request) {
        return new SyncInvoker<>(request, MpcMeta.createEditingJob, hcClient);
    }

    /**
     * 取消剪辑任务
     *
     * 取消已下发的生成剪辑任务，仅支持取消正在排队中的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEditingJobRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEditingJobRequest 请求对象
     * @return SyncInvoker<DeleteEditingJobRequest, DeleteEditingJobResponse>
     */
    public SyncInvoker<DeleteEditingJobRequest, DeleteEditingJobResponse> deleteEditingJobInvoker(
        DeleteEditingJobRequest request) {
        return new SyncInvoker<>(request, MpcMeta.deleteEditingJob, hcClient);
    }

    /**
     * 查询剪辑任务
     *
     * 查询剪辑任务的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEditingJobRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEditingJobRequest 请求对象
     * @return SyncInvoker<ListEditingJobRequest, ListEditingJobResponse>
     */
    public SyncInvoker<ListEditingJobRequest, ListEditingJobResponse> listEditingJobInvoker(
        ListEditingJobRequest request) {
        return new SyncInvoker<>(request, MpcMeta.listEditingJob, hcClient);
    }

    /**
     * 新建独立加密任务
     *
     * 支持独立加密，包括创建、查询、删除独立加密任务。该API已废弃。
     * 
     * 约束：
     *   - 只支持转码后的文件进行加密。
     *   - 加密的文件必须是m3u8或者mpd结尾的文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEncryptTaskRequest 请求对象
     * @return CreateEncryptTaskResponse
     */
    public CreateEncryptTaskResponse createEncryptTask(CreateEncryptTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.createEncryptTask);
    }

    /**
     * 新建独立加密任务
     *
     * 支持独立加密，包括创建、查询、删除独立加密任务。该API已废弃。
     * 
     * 约束：
     *   - 只支持转码后的文件进行加密。
     *   - 加密的文件必须是m3u8或者mpd结尾的文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEncryptTaskRequest 请求对象
     * @return SyncInvoker<CreateEncryptTaskRequest, CreateEncryptTaskResponse>
     */
    public SyncInvoker<CreateEncryptTaskRequest, CreateEncryptTaskResponse> createEncryptTaskInvoker(
        CreateEncryptTaskRequest request) {
        return new SyncInvoker<>(request, MpcMeta.createEncryptTask, hcClient);
    }

    /**
     * 取消独立加密任务
     *
     * 取消独立加密任务。该API已废弃。
     * 
     * 约束：
     * 
     *   只能取消正在任务队列中排队的任务。已开始加密或已完成的加密任务不能取消。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEncryptTaskRequest 请求对象
     * @return DeleteEncryptTaskResponse
     */
    public DeleteEncryptTaskResponse deleteEncryptTask(DeleteEncryptTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteEncryptTask);
    }

    /**
     * 取消独立加密任务
     *
     * 取消独立加密任务。该API已废弃。
     * 
     * 约束：
     * 
     *   只能取消正在任务队列中排队的任务。已开始加密或已完成的加密任务不能取消。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEncryptTaskRequest 请求对象
     * @return SyncInvoker<DeleteEncryptTaskRequest, DeleteEncryptTaskResponse>
     */
    public SyncInvoker<DeleteEncryptTaskRequest, DeleteEncryptTaskResponse> deleteEncryptTaskInvoker(
        DeleteEncryptTaskRequest request) {
        return new SyncInvoker<>(request, MpcMeta.deleteEncryptTask, hcClient);
    }

    /**
     * 查询独立加密任务
     *
     * 查询独立加密任务状态。返回任务执行结果或当前状态。该API已废弃。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEncryptTaskRequest 请求对象
     * @return ListEncryptTaskResponse
     */
    public ListEncryptTaskResponse listEncryptTask(ListEncryptTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listEncryptTask);
    }

    /**
     * 查询独立加密任务
     *
     * 查询独立加密任务状态。返回任务执行结果或当前状态。该API已废弃。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEncryptTaskRequest 请求对象
     * @return SyncInvoker<ListEncryptTaskRequest, ListEncryptTaskResponse>
     */
    public SyncInvoker<ListEncryptTaskRequest, ListEncryptTaskResponse> listEncryptTaskInvoker(
        ListEncryptTaskRequest request) {
        return new SyncInvoker<>(request, MpcMeta.listEncryptTask, hcClient);
    }

    /**
     * 新建视频解析任务
     *
     * 创建视频解析任务，解析视频元数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateExtractTaskRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateExtractTaskRequest 请求对象
     * @return SyncInvoker<CreateExtractTaskRequest, CreateExtractTaskResponse>
     */
    public SyncInvoker<CreateExtractTaskRequest, CreateExtractTaskResponse> createExtractTaskInvoker(
        CreateExtractTaskRequest request) {
        return new SyncInvoker<>(request, MpcMeta.createExtractTask, hcClient);
    }

    /**
     * 取消视频解析任务
     *
     * 取消已下发的视频解析任务，仅支持取消正在排队中的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteExtractTaskRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteExtractTaskRequest 请求对象
     * @return SyncInvoker<DeleteExtractTaskRequest, DeleteExtractTaskResponse>
     */
    public SyncInvoker<DeleteExtractTaskRequest, DeleteExtractTaskResponse> deleteExtractTaskInvoker(
        DeleteExtractTaskRequest request) {
        return new SyncInvoker<>(request, MpcMeta.deleteExtractTask, hcClient);
    }

    /**
     * 查询视频解析任务
     *
     * 查询解析任务的状态和结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExtractTaskRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExtractTaskRequest 请求对象
     * @return SyncInvoker<ListExtractTaskRequest, ListExtractTaskResponse>
     */
    public SyncInvoker<ListExtractTaskRequest, ListExtractTaskResponse> listExtractTaskInvoker(
        ListExtractTaskRequest request) {
        return new SyncInvoker<>(request, MpcMeta.listExtractTask, hcClient);
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMbTasksReportRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMbTasksReportRequest 请求对象
     * @return SyncInvoker<CreateMbTasksReportRequest, CreateMbTasksReportResponse>
     */
    public SyncInvoker<CreateMbTasksReportRequest, CreateMbTasksReportResponse> createMbTasksReportInvoker(
        CreateMbTasksReportRequest request) {
        return new SyncInvoker<>(request, MpcMeta.createMbTasksReport, hcClient);
    }

    /**
     * 创建声道合并任务
     *
     * 创建声道合并任务，合并声道任务支持将每个声道各放一个文件中的片源，合并为单个音频文件。
     * 执行合并声道的源音频文件需要存储在与媒体处理服务同区域的OBS桶中，且该OBS桶已授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMergeChannelsTaskRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMergeChannelsTaskRequest 请求对象
     * @return SyncInvoker<CreateMergeChannelsTaskRequest, CreateMergeChannelsTaskResponse>
     */
    public SyncInvoker<CreateMergeChannelsTaskRequest, CreateMergeChannelsTaskResponse> createMergeChannelsTaskInvoker(
        CreateMergeChannelsTaskRequest request) {
        return new SyncInvoker<>(request, MpcMeta.createMergeChannelsTask, hcClient);
    }

    /**
     * 创建音轨重置任务
     *
     * 创建音轨重置任务，重置音轨任务支持按人工指定关系声道layout，语言标签，转封装片源，使其满足转码输入。
     * 执行音轨重置的源音频文件需要存储在与媒体处理服务同区域的OBS桶中，且该OBS桶已授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResetTracksTaskRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResetTracksTaskRequest 请求对象
     * @return SyncInvoker<CreateResetTracksTaskRequest, CreateResetTracksTaskResponse>
     */
    public SyncInvoker<CreateResetTracksTaskRequest, CreateResetTracksTaskResponse> createResetTracksTaskInvoker(
        CreateResetTracksTaskRequest request) {
        return new SyncInvoker<>(request, MpcMeta.createResetTracksTask, hcClient);
    }

    /**
     * 取消声道合并任务
     *
     * 取消合并音频多声道文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMergeChannelsTaskRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMergeChannelsTaskRequest 请求对象
     * @return SyncInvoker<DeleteMergeChannelsTaskRequest, DeleteMergeChannelsTaskResponse>
     */
    public SyncInvoker<DeleteMergeChannelsTaskRequest, DeleteMergeChannelsTaskResponse> deleteMergeChannelsTaskInvoker(
        DeleteMergeChannelsTaskRequest request) {
        return new SyncInvoker<>(request, MpcMeta.deleteMergeChannelsTask, hcClient);
    }

    /**
     * 取消音轨重置任务
     *
     * 取消重置音频文件声轨任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResetTracksTaskRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResetTracksTaskRequest 请求对象
     * @return SyncInvoker<DeleteResetTracksTaskRequest, DeleteResetTracksTaskResponse>
     */
    public SyncInvoker<DeleteResetTracksTaskRequest, DeleteResetTracksTaskResponse> deleteResetTracksTaskInvoker(
        DeleteResetTracksTaskRequest request) {
        return new SyncInvoker<>(request, MpcMeta.deleteResetTracksTask, hcClient);
    }

    /**
     * 查询声道合并任务
     *
     * 查询声道合并任务的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeChannelsTaskRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeChannelsTaskRequest 请求对象
     * @return SyncInvoker<ListMergeChannelsTaskRequest, ListMergeChannelsTaskResponse>
     */
    public SyncInvoker<ListMergeChannelsTaskRequest, ListMergeChannelsTaskResponse> listMergeChannelsTaskInvoker(
        ListMergeChannelsTaskRequest request) {
        return new SyncInvoker<>(request, MpcMeta.listMergeChannelsTask, hcClient);
    }

    /**
     * 查询音轨重置任务
     *
     * 查询音轨重置任务的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResetTracksTaskRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResetTracksTaskRequest 请求对象
     * @return SyncInvoker<ListResetTracksTaskRequest, ListResetTracksTaskResponse>
     */
    public SyncInvoker<ListResetTracksTaskRequest, ListResetTracksTaskResponse> listResetTracksTaskInvoker(
        ListResetTracksTaskRequest request) {
        return new SyncInvoker<>(request, MpcMeta.listResetTracksTask, hcClient);
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMediaProcessTaskRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMediaProcessTaskRequest 请求对象
     * @return SyncInvoker<CreateMediaProcessTaskRequest, CreateMediaProcessTaskResponse>
     */
    public SyncInvoker<CreateMediaProcessTaskRequest, CreateMediaProcessTaskResponse> createMediaProcessTaskInvoker(
        CreateMediaProcessTaskRequest request) {
        return new SyncInvoker<>(request, MpcMeta.createMediaProcessTask, hcClient);
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMediaProcessTaskRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMediaProcessTaskRequest 请求对象
     * @return SyncInvoker<DeleteMediaProcessTaskRequest, DeleteMediaProcessTaskResponse>
     */
    public SyncInvoker<DeleteMediaProcessTaskRequest, DeleteMediaProcessTaskResponse> deleteMediaProcessTaskInvoker(
        DeleteMediaProcessTaskRequest request) {
        return new SyncInvoker<>(request, MpcMeta.deleteMediaProcessTask, hcClient);
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMediaProcessTaskRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMediaProcessTaskRequest 请求对象
     * @return SyncInvoker<ListMediaProcessTaskRequest, ListMediaProcessTaskResponse>
     */
    public SyncInvoker<ListMediaProcessTaskRequest, ListMediaProcessTaskResponse> listMediaProcessTaskInvoker(
        ListMediaProcessTaskRequest request) {
        return new SyncInvoker<>(request, MpcMeta.listMediaProcessTask, hcClient);
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMpeCallBackRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMpeCallBackRequest 请求对象
     * @return SyncInvoker<CreateMpeCallBackRequest, CreateMpeCallBackResponse>
     */
    public SyncInvoker<CreateMpeCallBackRequest, CreateMpeCallBackResponse> createMpeCallBackInvoker(
        CreateMpeCallBackRequest request) {
        return new SyncInvoker<>(request, MpcMeta.createMpeCallBack, hcClient);
    }

    /**
     * 创建视频增强模板
     *
     * 创建视频增强模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateQualityEnhanceTemplateRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateQualityEnhanceTemplateRequest 请求对象
     * @return SyncInvoker<CreateQualityEnhanceTemplateRequest, CreateQualityEnhanceTemplateResponse>
     */
    public SyncInvoker<CreateQualityEnhanceTemplateRequest, CreateQualityEnhanceTemplateResponse> createQualityEnhanceTemplateInvoker(
        CreateQualityEnhanceTemplateRequest request) {
        return new SyncInvoker<>(request, MpcMeta.createQualityEnhanceTemplate, hcClient);
    }

    /**
     * 删除用户视频增强模板
     *
     * 删除用户视频增强模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteQualityEnhanceTemplateRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteQualityEnhanceTemplateRequest 请求对象
     * @return SyncInvoker<DeleteQualityEnhanceTemplateRequest, DeleteQualityEnhanceTemplateResponse>
     */
    public SyncInvoker<DeleteQualityEnhanceTemplateRequest, DeleteQualityEnhanceTemplateResponse> deleteQualityEnhanceTemplateInvoker(
        DeleteQualityEnhanceTemplateRequest request) {
        return new SyncInvoker<>(request, MpcMeta.deleteQualityEnhanceTemplate, hcClient);
    }

    /**
     * 查询视频增强预置模板
     *
     * 查询视频增强预置模板，返回所有结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQualityEnhanceDefaultTemplateRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQualityEnhanceDefaultTemplateRequest 请求对象
     * @return SyncInvoker<ListQualityEnhanceDefaultTemplateRequest, ListQualityEnhanceDefaultTemplateResponse>
     */
    public SyncInvoker<ListQualityEnhanceDefaultTemplateRequest, ListQualityEnhanceDefaultTemplateResponse> listQualityEnhanceDefaultTemplateInvoker(
        ListQualityEnhanceDefaultTemplateRequest request) {
        return new SyncInvoker<>(request, MpcMeta.listQualityEnhanceDefaultTemplate, hcClient);
    }

    /**
     * 更新视频增强模板
     *
     * 更新视频增强模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateQualityEnhanceTemplateRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateQualityEnhanceTemplateRequest 请求对象
     * @return SyncInvoker<UpdateQualityEnhanceTemplateRequest, UpdateQualityEnhanceTemplateResponse>
     */
    public SyncInvoker<UpdateQualityEnhanceTemplateRequest, UpdateQualityEnhanceTemplateResponse> updateQualityEnhanceTemplateInvoker(
        UpdateQualityEnhanceTemplateRequest request) {
        return new SyncInvoker<>(request, MpcMeta.updateQualityEnhanceTemplate, hcClient);
    }

    /**
     * 查询媒资转码详情
     *
     * 查询媒资转码详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTranscodeDetailRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTranscodeDetailRequest 请求对象
     * @return SyncInvoker<ListTranscodeDetailRequest, ListTranscodeDetailResponse>
     */
    public SyncInvoker<ListTranscodeDetailRequest, ListTranscodeDetailResponse> listTranscodeDetailInvoker(
        ListTranscodeDetailRequest request) {
        return new SyncInvoker<>(request, MpcMeta.listTranscodeDetail, hcClient);
    }

    /**
     * 取消转封装任务
     *
     * 取消已下发的转封装任务，仅支持取消正在排队中的任务。。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelRemuxTaskRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelRemuxTaskRequest 请求对象
     * @return SyncInvoker<CancelRemuxTaskRequest, CancelRemuxTaskResponse>
     */
    public SyncInvoker<CancelRemuxTaskRequest, CancelRemuxTaskResponse> cancelRemuxTaskInvoker(
        CancelRemuxTaskRequest request) {
        return new SyncInvoker<>(request, MpcMeta.cancelRemuxTask, hcClient);
    }

    /**
     * 新建转封装任务
     *
     * 创建转封装任务，转换音视频文件的格式，但不改变其分辨率和码率。
     * 待转封装的媒资文件需要存储在与媒体处理服务同区域的OBS桶中，且该OBS桶已授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRemuxTaskRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRemuxTaskRequest 请求对象
     * @return SyncInvoker<CreateRemuxTaskRequest, CreateRemuxTaskResponse>
     */
    public SyncInvoker<CreateRemuxTaskRequest, CreateRemuxTaskResponse> createRemuxTaskInvoker(
        CreateRemuxTaskRequest request) {
        return new SyncInvoker<>(request, MpcMeta.createRemuxTask, hcClient);
    }

    /**
     * 重试转封装任务
     *
     * 对失败的转封装任务进行重试。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRetryRemuxTaskRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRetryRemuxTaskRequest 请求对象
     * @return SyncInvoker<CreateRetryRemuxTaskRequest, CreateRetryRemuxTaskResponse>
     */
    public SyncInvoker<CreateRetryRemuxTaskRequest, CreateRetryRemuxTaskResponse> createRetryRemuxTaskInvoker(
        CreateRetryRemuxTaskRequest request) {
        return new SyncInvoker<>(request, MpcMeta.createRetryRemuxTask, hcClient);
    }

    /**
     * 删除转封装任务记录
     *
     * 删除转封装任务记录，只能删除状态为“已取消”，“转码成功”，“转码失败”的任务记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRemuxTaskRequest 请求对象
     * @return DeleteRemuxTaskResponse
     */
    public DeleteRemuxTaskResponse deleteRemuxTask(DeleteRemuxTaskRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteRemuxTask);
    }

    /**
     * 删除转封装任务记录
     *
     * 删除转封装任务记录，只能删除状态为“已取消”，“转码成功”，“转码失败”的任务记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRemuxTaskRequest 请求对象
     * @return SyncInvoker<DeleteRemuxTaskRequest, DeleteRemuxTaskResponse>
     */
    public SyncInvoker<DeleteRemuxTaskRequest, DeleteRemuxTaskResponse> deleteRemuxTaskInvoker(
        DeleteRemuxTaskRequest request) {
        return new SyncInvoker<>(request, MpcMeta.deleteRemuxTask, hcClient);
    }

    /**
     * 查询转封装任务
     *
     * 查询转封装任务状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRemuxTaskRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRemuxTaskRequest 请求对象
     * @return SyncInvoker<ListRemuxTaskRequest, ListRemuxTaskResponse>
     */
    public SyncInvoker<ListRemuxTaskRequest, ListRemuxTaskResponse> listRemuxTaskInvoker(ListRemuxTaskRequest request) {
        return new SyncInvoker<>(request, MpcMeta.listRemuxTask, hcClient);
    }

    /**
     * 新建转码模板组
     *
     * 新建转码模板组，最多支持一进六出。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTemplateGroupRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTemplateGroupRequest 请求对象
     * @return SyncInvoker<CreateTemplateGroupRequest, CreateTemplateGroupResponse>
     */
    public SyncInvoker<CreateTemplateGroupRequest, CreateTemplateGroupResponse> createTemplateGroupInvoker(
        CreateTemplateGroupRequest request) {
        return new SyncInvoker<>(request, MpcMeta.createTemplateGroup, hcClient);
    }

    /**
     * 删除转码模板组
     *
     * 删除转码模板组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTemplateGroupRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTemplateGroupRequest 请求对象
     * @return SyncInvoker<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse>
     */
    public SyncInvoker<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse> deleteTemplateGroupInvoker(
        DeleteTemplateGroupRequest request) {
        return new SyncInvoker<>(request, MpcMeta.deleteTemplateGroup, hcClient);
    }

    /**
     * 查询转码模板组
     *
     * 查询转码模板组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplateGroupRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplateGroupRequest 请求对象
     * @return SyncInvoker<ListTemplateGroupRequest, ListTemplateGroupResponse>
     */
    public SyncInvoker<ListTemplateGroupRequest, ListTemplateGroupResponse> listTemplateGroupInvoker(
        ListTemplateGroupRequest request) {
        return new SyncInvoker<>(request, MpcMeta.listTemplateGroup, hcClient);
    }

    /**
     * 更新转码模板组
     *
     * 修改模板组接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTemplateGroupRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTemplateGroupRequest 请求对象
     * @return SyncInvoker<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse>
     */
    public SyncInvoker<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse> updateTemplateGroupInvoker(
        UpdateTemplateGroupRequest request) {
        return new SyncInvoker<>(request, MpcMeta.updateTemplateGroup, hcClient);
    }

    /**
     * 租户查询服务开通状态信息
     *
     * 租户查询媒体转码服务开通状态信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTenantAccessInfoRequest 请求对象
     * @return ShowTenantAccessInfoResponse
     */
    public ShowTenantAccessInfoResponse showTenantAccessInfo(ShowTenantAccessInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.showTenantAccessInfo);
    }

    /**
     * 租户查询服务开通状态信息
     *
     * 租户查询媒体转码服务开通状态信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTenantAccessInfoRequest 请求对象
     * @return SyncInvoker<ShowTenantAccessInfoRequest, ShowTenantAccessInfoResponse>
     */
    public SyncInvoker<ShowTenantAccessInfoRequest, ShowTenantAccessInfoResponse> showTenantAccessInfoInvoker(
        ShowTenantAccessInfoRequest request) {
        return new SyncInvoker<>(request, MpcMeta.showTenantAccessInfo, hcClient);
    }

    /**
     * 租户开通媒体转码服务
     *
     * 租户开通媒体转码服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTenantAccessInfoRequest 请求对象
     * @return UpdateTenantAccessInfoResponse
     */
    public UpdateTenantAccessInfoResponse updateTenantAccessInfo(UpdateTenantAccessInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.updateTenantAccessInfo);
    }

    /**
     * 租户开通媒体转码服务
     *
     * 租户开通媒体转码服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTenantAccessInfoRequest 请求对象
     * @return SyncInvoker<UpdateTenantAccessInfoRequest, UpdateTenantAccessInfoResponse>
     */
    public SyncInvoker<UpdateTenantAccessInfoRequest, UpdateTenantAccessInfoResponse> updateTenantAccessInfoInvoker(
        UpdateTenantAccessInfoRequest request) {
        return new SyncInvoker<>(request, MpcMeta.updateTenantAccessInfo, hcClient);
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateThumbnailsTaskRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateThumbnailsTaskRequest 请求对象
     * @return SyncInvoker<CreateThumbnailsTaskRequest, CreateThumbnailsTaskResponse>
     */
    public SyncInvoker<CreateThumbnailsTaskRequest, CreateThumbnailsTaskResponse> createThumbnailsTaskInvoker(
        CreateThumbnailsTaskRequest request) {
        return new SyncInvoker<>(request, MpcMeta.createThumbnailsTask, hcClient);
    }

    /**
     * 取消截图任务
     *
     * 取消已下发截图任务。
     * 只能取消已接受尚在队列中等待处理的任务，已完成或正在执行阶段的任务不能取消。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteThumbnailsTaskRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteThumbnailsTaskRequest 请求对象
     * @return SyncInvoker<DeleteThumbnailsTaskRequest, DeleteThumbnailsTaskResponse>
     */
    public SyncInvoker<DeleteThumbnailsTaskRequest, DeleteThumbnailsTaskResponse> deleteThumbnailsTaskInvoker(
        DeleteThumbnailsTaskRequest request) {
        return new SyncInvoker<>(request, MpcMeta.deleteThumbnailsTask, hcClient);
    }

    /**
     * 查询截图任务
     *
     * 查询截图任务状态。返回任务执行结果，包括状态、输入、输出等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListThumbnailsTaskRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListThumbnailsTaskRequest 请求对象
     * @return SyncInvoker<ListThumbnailsTaskRequest, ListThumbnailsTaskResponse>
     */
    public SyncInvoker<ListThumbnailsTaskRequest, ListThumbnailsTaskResponse> listThumbnailsTaskInvoker(
        ListThumbnailsTaskRequest request) {
        return new SyncInvoker<>(request, MpcMeta.listThumbnailsTask, hcClient);
    }

    /**
     * 新建转码任务
     *
     * 新建转码任务可以将视频进行转码，并在转码过程中压制水印、视频截图等。视频转码前需要配置转码模板。
     * 待转码的音视频需要存储在与媒体处理服务同区域的OBS桶中，且该OBS桶已授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTranscodingTaskRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTranscodingTaskRequest 请求对象
     * @return SyncInvoker<CreateTranscodingTaskRequest, CreateTranscodingTaskResponse>
     */
    public SyncInvoker<CreateTranscodingTaskRequest, CreateTranscodingTaskResponse> createTranscodingTaskInvoker(
        CreateTranscodingTaskRequest request) {
        return new SyncInvoker<>(request, MpcMeta.createTranscodingTask, hcClient);
    }

    /**
     * 取消转码任务
     *
     * 取消已下发转码任务。
     * 只能取消正在转码任务队列中排队的转码任务。已开始转码或已完成的转码任务不能取消。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTranscodingTaskRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTranscodingTaskRequest 请求对象
     * @return SyncInvoker<DeleteTranscodingTaskRequest, DeleteTranscodingTaskResponse>
     */
    public SyncInvoker<DeleteTranscodingTaskRequest, DeleteTranscodingTaskResponse> deleteTranscodingTaskInvoker(
        DeleteTranscodingTaskRequest request) {
        return new SyncInvoker<>(request, MpcMeta.deleteTranscodingTask, hcClient);
    }

    /**
     * 删除转码任务记录
     *
     * 删除转码任务记录，只能删除状态为“已取消”，“转码成功”，“转码失败”的转码任务记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTranscodingTaskByConsoleRequest 请求对象
     * @return DeleteTranscodingTaskByConsoleResponse
     */
    public DeleteTranscodingTaskByConsoleResponse deleteTranscodingTaskByConsole(
        DeleteTranscodingTaskByConsoleRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.deleteTranscodingTaskByConsole);
    }

    /**
     * 删除转码任务记录
     *
     * 删除转码任务记录，只能删除状态为“已取消”，“转码成功”，“转码失败”的转码任务记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTranscodingTaskByConsoleRequest 请求对象
     * @return SyncInvoker<DeleteTranscodingTaskByConsoleRequest, DeleteTranscodingTaskByConsoleResponse>
     */
    public SyncInvoker<DeleteTranscodingTaskByConsoleRequest, DeleteTranscodingTaskByConsoleResponse> deleteTranscodingTaskByConsoleInvoker(
        DeleteTranscodingTaskByConsoleRequest request) {
        return new SyncInvoker<>(request, MpcMeta.deleteTranscodingTaskByConsole, hcClient);
    }

    /**
     * 查询点播概览信息
     *
     * 查询最近一周，最近一月或者自定义时间段的“转码时长”，“调用转码API次数”。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStatSummaryRequest 请求对象
     * @return ListStatSummaryResponse
     */
    public ListStatSummaryResponse listStatSummary(ListStatSummaryRequest request) {
        return hcClient.syncInvokeHttp(request, MpcMeta.listStatSummary);
    }

    /**
     * 查询点播概览信息
     *
     * 查询最近一周，最近一月或者自定义时间段的“转码时长”，“调用转码API次数”。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStatSummaryRequest 请求对象
     * @return SyncInvoker<ListStatSummaryRequest, ListStatSummaryResponse>
     */
    public SyncInvoker<ListStatSummaryRequest, ListStatSummaryResponse> listStatSummaryInvoker(
        ListStatSummaryRequest request) {
        return new SyncInvoker<>(request, MpcMeta.listStatSummary, hcClient);
    }

    /**
     * 查询转码任务
     *
     * 查询转码任务状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTranscodingTaskRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTranscodingTaskRequest 请求对象
     * @return SyncInvoker<ListTranscodingTaskRequest, ListTranscodingTaskResponse>
     */
    public SyncInvoker<ListTranscodingTaskRequest, ListTranscodingTaskResponse> listTranscodingTaskInvoker(
        ListTranscodingTaskRequest request) {
        return new SyncInvoker<>(request, MpcMeta.listTranscodingTask, hcClient);
    }

    /**
     * 新建转码模板
     *
     * 新建转码模板，采用自定义的模板转码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTransTemplateRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTransTemplateRequest 请求对象
     * @return SyncInvoker<CreateTransTemplateRequest, CreateTransTemplateResponse>
     */
    public SyncInvoker<CreateTransTemplateRequest, CreateTransTemplateResponse> createTransTemplateInvoker(
        CreateTransTemplateRequest request) {
        return new SyncInvoker<>(request, MpcMeta.createTransTemplate, hcClient);
    }

    /**
     * 删除转码模板
     *
     * 删除转码模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTemplateRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTemplateRequest 请求对象
     * @return SyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse>
     */
    public SyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplateInvoker(
        DeleteTemplateRequest request) {
        return new SyncInvoker<>(request, MpcMeta.deleteTemplate, hcClient);
    }

    /**
     * 查询转码模板
     *
     * 查询用户自定义转码配置模板。
     * 支持指定模板ID查询，或分页全量查询。转码配置模板ID，最多10个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplateRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplateRequest 请求对象
     * @return SyncInvoker<ListTemplateRequest, ListTemplateResponse>
     */
    public SyncInvoker<ListTemplateRequest, ListTemplateResponse> listTemplateInvoker(ListTemplateRequest request) {
        return new SyncInvoker<>(request, MpcMeta.listTemplate, hcClient);
    }

    /**
     * 更新转码模板
     *
     * 更新转码模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTransTemplateRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTransTemplateRequest 请求对象
     * @return SyncInvoker<UpdateTransTemplateRequest, UpdateTransTemplateResponse>
     */
    public SyncInvoker<UpdateTransTemplateRequest, UpdateTransTemplateResponse> updateTransTemplateInvoker(
        UpdateTransTemplateRequest request) {
        return new SyncInvoker<>(request, MpcMeta.updateTransTemplate, hcClient);
    }

    /**
     * 新建水印模板
     *
     * 自定义水印模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWatermarkTemplateRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWatermarkTemplateRequest 请求对象
     * @return SyncInvoker<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse>
     */
    public SyncInvoker<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse> createWatermarkTemplateInvoker(
        CreateWatermarkTemplateRequest request) {
        return new SyncInvoker<>(request, MpcMeta.createWatermarkTemplate, hcClient);
    }

    /**
     * 删除水印模板
     *
     * 删除自定义水印模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWatermarkTemplateRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWatermarkTemplateRequest 请求对象
     * @return SyncInvoker<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse>
     */
    public SyncInvoker<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse> deleteWatermarkTemplateInvoker(
        DeleteWatermarkTemplateRequest request) {
        return new SyncInvoker<>(request, MpcMeta.deleteWatermarkTemplate, hcClient);
    }

    /**
     * 查询水印模板
     *
     * 查询自定义水印模板。支持指定模板ID查询，或分页全量查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWatermarkTemplateRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWatermarkTemplateRequest 请求对象
     * @return SyncInvoker<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse>
     */
    public SyncInvoker<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse> listWatermarkTemplateInvoker(
        ListWatermarkTemplateRequest request) {
        return new SyncInvoker<>(request, MpcMeta.listWatermarkTemplate, hcClient);
    }

    /**
     * 更新水印模板
     *
     * 更新自定义水印模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWatermarkTemplateRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWatermarkTemplateRequest 请求对象
     * @return SyncInvoker<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse>
     */
    public SyncInvoker<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse> updateWatermarkTemplateInvoker(
        UpdateWatermarkTemplateRequest request) {
        return new SyncInvoker<>(request, MpcMeta.updateWatermarkTemplate, hcClient);
    }

}

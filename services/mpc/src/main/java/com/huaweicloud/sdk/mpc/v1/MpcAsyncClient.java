package com.huaweicloud.sdk.mpc.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.mpc.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class MpcAsyncClient {

    protected HcClient hcClient;

    public MpcAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<MpcAsyncClient> newBuilder() {
        return new ClientBuilder<>(MpcAsyncClient::new);
    }

    /**
     * 新建转动图任务
     *
     * 创建动图任务，用于将完整的视频文件或视频文件中的一部分转换为动态图文件，暂只支持输出GIF文件。
     * 待转动图的视频文件需要存储在与媒体处理服务同区域的OBS桶中，且该OBS桶已授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAnimatedGraphicsTaskRequest 请求对象
     * @return CompletableFuture<CreateAnimatedGraphicsTaskResponse>
     */
    public CompletableFuture<CreateAnimatedGraphicsTaskResponse> createAnimatedGraphicsTaskAsync(
        CreateAnimatedGraphicsTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createAnimatedGraphicsTask);
    }

    /**
     * 新建转动图任务
     *
     * 创建动图任务，用于将完整的视频文件或视频文件中的一部分转换为动态图文件，暂只支持输出GIF文件。
     * 待转动图的视频文件需要存储在与媒体处理服务同区域的OBS桶中，且该OBS桶已授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAnimatedGraphicsTaskRequest 请求对象
     * @return AsyncInvoker<CreateAnimatedGraphicsTaskRequest, CreateAnimatedGraphicsTaskResponse>
     */
    public AsyncInvoker<CreateAnimatedGraphicsTaskRequest, CreateAnimatedGraphicsTaskResponse> createAnimatedGraphicsTaskAsyncInvoker(
        CreateAnimatedGraphicsTaskRequest request) {
        return new AsyncInvoker<CreateAnimatedGraphicsTaskRequest, CreateAnimatedGraphicsTaskResponse>(request,
            MpcMeta.createAnimatedGraphicsTask, hcClient);
    }

    /**
     * 取消转动图任务
     *
     * 取消已下发的生成动图任务，仅支持取消正在排队中的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAnimatedGraphicsTaskRequest 请求对象
     * @return CompletableFuture<DeleteAnimatedGraphicsTaskResponse>
     */
    public CompletableFuture<DeleteAnimatedGraphicsTaskResponse> deleteAnimatedGraphicsTaskAsync(
        DeleteAnimatedGraphicsTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteAnimatedGraphicsTask);
    }

    /**
     * 取消转动图任务
     *
     * 取消已下发的生成动图任务，仅支持取消正在排队中的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAnimatedGraphicsTaskRequest 请求对象
     * @return AsyncInvoker<DeleteAnimatedGraphicsTaskRequest, DeleteAnimatedGraphicsTaskResponse>
     */
    public AsyncInvoker<DeleteAnimatedGraphicsTaskRequest, DeleteAnimatedGraphicsTaskResponse> deleteAnimatedGraphicsTaskAsyncInvoker(
        DeleteAnimatedGraphicsTaskRequest request) {
        return new AsyncInvoker<DeleteAnimatedGraphicsTaskRequest, DeleteAnimatedGraphicsTaskResponse>(request,
            MpcMeta.deleteAnimatedGraphicsTask, hcClient);
    }

    /**
     * 查询转动图任务
     *
     * 查询动图任务的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAnimatedGraphicsTaskRequest 请求对象
     * @return CompletableFuture<ListAnimatedGraphicsTaskResponse>
     */
    public CompletableFuture<ListAnimatedGraphicsTaskResponse> listAnimatedGraphicsTaskAsync(
        ListAnimatedGraphicsTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listAnimatedGraphicsTask);
    }

    /**
     * 查询转动图任务
     *
     * 查询动图任务的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAnimatedGraphicsTaskRequest 请求对象
     * @return AsyncInvoker<ListAnimatedGraphicsTaskRequest, ListAnimatedGraphicsTaskResponse>
     */
    public AsyncInvoker<ListAnimatedGraphicsTaskRequest, ListAnimatedGraphicsTaskResponse> listAnimatedGraphicsTaskAsyncInvoker(
        ListAnimatedGraphicsTaskRequest request) {
        return new AsyncInvoker<ListAnimatedGraphicsTaskRequest, ListAnimatedGraphicsTaskResponse>(request,
            MpcMeta.listAnimatedGraphicsTask, hcClient);
    }

    /**
     * 请求委托任务
     *
     * 开启或关闭\&quot;委托授权\&quot;, 开启后，媒体处理服务将拥有您所有桶的读写权限，子账号不支持委托授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAgenciesTaskRequest 请求对象
     * @return CompletableFuture<CreateAgenciesTaskResponse>
     */
    public CompletableFuture<CreateAgenciesTaskResponse> createAgenciesTaskAsync(CreateAgenciesTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createAgenciesTask);
    }

    /**
     * 请求委托任务
     *
     * 开启或关闭\&quot;委托授权\&quot;, 开启后，媒体处理服务将拥有您所有桶的读写权限，子账号不支持委托授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAgenciesTaskRequest 请求对象
     * @return AsyncInvoker<CreateAgenciesTaskRequest, CreateAgenciesTaskResponse>
     */
    public AsyncInvoker<CreateAgenciesTaskRequest, CreateAgenciesTaskResponse> createAgenciesTaskAsyncInvoker(
        CreateAgenciesTaskRequest request) {
        return new AsyncInvoker<CreateAgenciesTaskRequest, CreateAgenciesTaskResponse>(request,
            MpcMeta.createAgenciesTask, hcClient);
    }

    /**
     * 查询桶列表
     *
     * 请求查询自己创建的指定的桶区域位置的桶列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllBucketsRequest 请求对象
     * @return CompletableFuture<ListAllBucketsResponse>
     */
    public CompletableFuture<ListAllBucketsResponse> listAllBucketsAsync(ListAllBucketsRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listAllBuckets);
    }

    /**
     * 查询桶列表
     *
     * 请求查询自己创建的指定的桶区域位置的桶列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllBucketsRequest 请求对象
     * @return AsyncInvoker<ListAllBucketsRequest, ListAllBucketsResponse>
     */
    public AsyncInvoker<ListAllBucketsRequest, ListAllBucketsResponse> listAllBucketsAsyncInvoker(
        ListAllBucketsRequest request) {
        return new AsyncInvoker<ListAllBucketsRequest, ListAllBucketsResponse>(request, MpcMeta.listAllBuckets,
            hcClient);
    }

    /**
     * 查询桶里的object
     *
     * 查询桶里的object。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllObsObjListRequest 请求对象
     * @return CompletableFuture<ListAllObsObjListResponse>
     */
    public CompletableFuture<ListAllObsObjListResponse> listAllObsObjListAsync(ListAllObsObjListRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listAllObsObjList);
    }

    /**
     * 查询桶里的object
     *
     * 查询桶里的object。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllObsObjListRequest 请求对象
     * @return AsyncInvoker<ListAllObsObjListRequest, ListAllObsObjListResponse>
     */
    public AsyncInvoker<ListAllObsObjListRequest, ListAllObsObjListResponse> listAllObsObjListAsyncInvoker(
        ListAllObsObjListRequest request) {
        return new AsyncInvoker<ListAllObsObjListRequest, ListAllObsObjListResponse>(request, MpcMeta.listAllObsObjList,
            hcClient);
    }

    /**
     * 查询转码服务端所有事件
     *
     * 查询消息订阅功能板块, SMN主题的所有订阅事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNotifyEventRequest 请求对象
     * @return CompletableFuture<ListNotifyEventResponse>
     */
    public CompletableFuture<ListNotifyEventResponse> listNotifyEventAsync(ListNotifyEventRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listNotifyEvent);
    }

    /**
     * 查询转码服务端所有事件
     *
     * 查询消息订阅功能板块, SMN主题的所有订阅事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNotifyEventRequest 请求对象
     * @return AsyncInvoker<ListNotifyEventRequest, ListNotifyEventResponse>
     */
    public AsyncInvoker<ListNotifyEventRequest, ListNotifyEventResponse> listNotifyEventAsyncInvoker(
        ListNotifyEventRequest request) {
        return new AsyncInvoker<ListNotifyEventRequest, ListNotifyEventResponse>(request, MpcMeta.listNotifyEvent,
            hcClient);
    }

    /**
     * 查询转码服务端事件通知
     *
     * 查询消息订阅功能板块, SMN主题的订阅事件的启用状态和订阅消息的启用状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNotifySmnTopicConfigRequest 请求对象
     * @return CompletableFuture<ListNotifySmnTopicConfigResponse>
     */
    public CompletableFuture<ListNotifySmnTopicConfigResponse> listNotifySmnTopicConfigAsync(
        ListNotifySmnTopicConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listNotifySmnTopicConfig);
    }

    /**
     * 查询转码服务端事件通知
     *
     * 查询消息订阅功能板块, SMN主题的订阅事件的启用状态和订阅消息的启用状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNotifySmnTopicConfigRequest 请求对象
     * @return AsyncInvoker<ListNotifySmnTopicConfigRequest, ListNotifySmnTopicConfigResponse>
     */
    public AsyncInvoker<ListNotifySmnTopicConfigRequest, ListNotifySmnTopicConfigResponse> listNotifySmnTopicConfigAsyncInvoker(
        ListNotifySmnTopicConfigRequest request) {
        return new AsyncInvoker<ListNotifySmnTopicConfigRequest, ListNotifySmnTopicConfigResponse>(request,
            MpcMeta.listNotifySmnTopicConfig, hcClient);
    }

    /**
     * 配置转码服务端事件通知
     *
     * 配置转码服务端事件通知。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NotifySmnTopicConfigRequest 请求对象
     * @return CompletableFuture<NotifySmnTopicConfigResponse>
     */
    public CompletableFuture<NotifySmnTopicConfigResponse> notifySmnTopicConfigAsync(
        NotifySmnTopicConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.notifySmnTopicConfig);
    }

    /**
     * 配置转码服务端事件通知
     *
     * 配置转码服务端事件通知。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NotifySmnTopicConfigRequest 请求对象
     * @return AsyncInvoker<NotifySmnTopicConfigRequest, NotifySmnTopicConfigResponse>
     */
    public AsyncInvoker<NotifySmnTopicConfigRequest, NotifySmnTopicConfigResponse> notifySmnTopicConfigAsyncInvoker(
        NotifySmnTopicConfigRequest request) {
        return new AsyncInvoker<NotifySmnTopicConfigRequest, NotifySmnTopicConfigResponse>(request,
            MpcMeta.notifySmnTopicConfig, hcClient);
    }

    /**
     * 查询创建委托任务状态
     *
     * 查询创建委托任务状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAgenciesTaskRequest 请求对象
     * @return CompletableFuture<ShowAgenciesTaskResponse>
     */
    public CompletableFuture<ShowAgenciesTaskResponse> showAgenciesTaskAsync(ShowAgenciesTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.showAgenciesTask);
    }

    /**
     * 查询创建委托任务状态
     *
     * 查询创建委托任务状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAgenciesTaskRequest 请求对象
     * @return AsyncInvoker<ShowAgenciesTaskRequest, ShowAgenciesTaskResponse>
     */
    public AsyncInvoker<ShowAgenciesTaskRequest, ShowAgenciesTaskResponse> showAgenciesTaskAsyncInvoker(
        ShowAgenciesTaskRequest request) {
        return new AsyncInvoker<ShowAgenciesTaskRequest, ShowAgenciesTaskResponse>(request, MpcMeta.showAgenciesTask,
            hcClient);
    }

    /**
     * 桶授权或取消授权
     *
     * 对OBS桶进行授权或取消授权，媒体处理服务仅拥有已授权桶的读写权限。（暂不支持KMS加密桶的授权）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBucketAuthorizedRequest 请求对象
     * @return CompletableFuture<UpdateBucketAuthorizedResponse>
     */
    public CompletableFuture<UpdateBucketAuthorizedResponse> updateBucketAuthorizedAsync(
        UpdateBucketAuthorizedRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.updateBucketAuthorized);
    }

    /**
     * 桶授权或取消授权
     *
     * 对OBS桶进行授权或取消授权，媒体处理服务仅拥有已授权桶的读写权限。（暂不支持KMS加密桶的授权）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBucketAuthorizedRequest 请求对象
     * @return AsyncInvoker<UpdateBucketAuthorizedRequest, UpdateBucketAuthorizedResponse>
     */
    public AsyncInvoker<UpdateBucketAuthorizedRequest, UpdateBucketAuthorizedResponse> updateBucketAuthorizedAsyncInvoker(
        UpdateBucketAuthorizedRequest request) {
        return new AsyncInvoker<UpdateBucketAuthorizedRequest, UpdateBucketAuthorizedResponse>(request,
            MpcMeta.updateBucketAuthorized, hcClient);
    }

    /**
     * 新建剪辑任务
     *
     * 创建剪辑任务，用于将多个视频文件进行裁剪成多个视频分段，并且可以把这些视频分段合并成一个视频，剪切和拼接功能可以单独使用。
     * 待剪辑的视频文件需要存储在与媒体处理服务同区域的OBS桶中，且该OBS桶已授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEditingJobRequest 请求对象
     * @return CompletableFuture<CreateEditingJobResponse>
     */
    public CompletableFuture<CreateEditingJobResponse> createEditingJobAsync(CreateEditingJobRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createEditingJob);
    }

    /**
     * 新建剪辑任务
     *
     * 创建剪辑任务，用于将多个视频文件进行裁剪成多个视频分段，并且可以把这些视频分段合并成一个视频，剪切和拼接功能可以单独使用。
     * 待剪辑的视频文件需要存储在与媒体处理服务同区域的OBS桶中，且该OBS桶已授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEditingJobRequest 请求对象
     * @return AsyncInvoker<CreateEditingJobRequest, CreateEditingJobResponse>
     */
    public AsyncInvoker<CreateEditingJobRequest, CreateEditingJobResponse> createEditingJobAsyncInvoker(
        CreateEditingJobRequest request) {
        return new AsyncInvoker<CreateEditingJobRequest, CreateEditingJobResponse>(request, MpcMeta.createEditingJob,
            hcClient);
    }

    /**
     * 取消剪辑任务
     *
     * 取消已下发的生成剪辑任务，仅支持取消正在排队中的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEditingJobRequest 请求对象
     * @return CompletableFuture<DeleteEditingJobResponse>
     */
    public CompletableFuture<DeleteEditingJobResponse> deleteEditingJobAsync(DeleteEditingJobRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteEditingJob);
    }

    /**
     * 取消剪辑任务
     *
     * 取消已下发的生成剪辑任务，仅支持取消正在排队中的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEditingJobRequest 请求对象
     * @return AsyncInvoker<DeleteEditingJobRequest, DeleteEditingJobResponse>
     */
    public AsyncInvoker<DeleteEditingJobRequest, DeleteEditingJobResponse> deleteEditingJobAsyncInvoker(
        DeleteEditingJobRequest request) {
        return new AsyncInvoker<DeleteEditingJobRequest, DeleteEditingJobResponse>(request, MpcMeta.deleteEditingJob,
            hcClient);
    }

    /**
     * 查询剪辑任务
     *
     * 查询剪辑任务的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEditingJobRequest 请求对象
     * @return CompletableFuture<ListEditingJobResponse>
     */
    public CompletableFuture<ListEditingJobResponse> listEditingJobAsync(ListEditingJobRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listEditingJob);
    }

    /**
     * 查询剪辑任务
     *
     * 查询剪辑任务的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEditingJobRequest 请求对象
     * @return AsyncInvoker<ListEditingJobRequest, ListEditingJobResponse>
     */
    public AsyncInvoker<ListEditingJobRequest, ListEditingJobResponse> listEditingJobAsyncInvoker(
        ListEditingJobRequest request) {
        return new AsyncInvoker<ListEditingJobRequest, ListEditingJobResponse>(request, MpcMeta.listEditingJob,
            hcClient);
    }

    /**
     * 新建剪辑拼接任务
     *
     * 创建剪辑任务，用于将多个视频文件进行裁剪成多个视频分段，并且可以把这些视频分段合并成一个视频。
     * 待剪辑的视频文件需要存储在与媒体处理服务同区域的OBS桶中，且该OBS桶已授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEditingJobsRequest 请求对象
     * @return CompletableFuture<CreateEditingJobsResponse>
     */
    public CompletableFuture<CreateEditingJobsResponse> createEditingJobsAsync(CreateEditingJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createEditingJobs);
    }

    /**
     * 新建剪辑拼接任务
     *
     * 创建剪辑任务，用于将多个视频文件进行裁剪成多个视频分段，并且可以把这些视频分段合并成一个视频。
     * 待剪辑的视频文件需要存储在与媒体处理服务同区域的OBS桶中，且该OBS桶已授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEditingJobsRequest 请求对象
     * @return AsyncInvoker<CreateEditingJobsRequest, CreateEditingJobsResponse>
     */
    public AsyncInvoker<CreateEditingJobsRequest, CreateEditingJobsResponse> createEditingJobsAsyncInvoker(
        CreateEditingJobsRequest request) {
        return new AsyncInvoker<CreateEditingJobsRequest, CreateEditingJobsResponse>(request, MpcMeta.createEditingJobs,
            hcClient);
    }

    /**
     * 取消剪辑任务
     *
     * 取消已下发的生成剪辑任务，仅支持取消正在排队中的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEditingJobsRequest 请求对象
     * @return CompletableFuture<DeleteEditingJobsResponse>
     */
    public CompletableFuture<DeleteEditingJobsResponse> deleteEditingJobsAsync(DeleteEditingJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteEditingJobs);
    }

    /**
     * 取消剪辑任务
     *
     * 取消已下发的生成剪辑任务，仅支持取消正在排队中的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEditingJobsRequest 请求对象
     * @return AsyncInvoker<DeleteEditingJobsRequest, DeleteEditingJobsResponse>
     */
    public AsyncInvoker<DeleteEditingJobsRequest, DeleteEditingJobsResponse> deleteEditingJobsAsyncInvoker(
        DeleteEditingJobsRequest request) {
        return new AsyncInvoker<DeleteEditingJobsRequest, DeleteEditingJobsResponse>(request, MpcMeta.deleteEditingJobs,
            hcClient);
    }

    /**
     * 查询剪辑任务
     *
     * 查询剪辑任务的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEditingJobsRequest 请求对象
     * @return CompletableFuture<ListEditingJobsResponse>
     */
    public CompletableFuture<ListEditingJobsResponse> listEditingJobsAsync(ListEditingJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listEditingJobs);
    }

    /**
     * 查询剪辑任务
     *
     * 查询剪辑任务的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEditingJobsRequest 请求对象
     * @return AsyncInvoker<ListEditingJobsRequest, ListEditingJobsResponse>
     */
    public AsyncInvoker<ListEditingJobsRequest, ListEditingJobsResponse> listEditingJobsAsyncInvoker(
        ListEditingJobsRequest request) {
        return new AsyncInvoker<ListEditingJobsRequest, ListEditingJobsResponse>(request, MpcMeta.listEditingJobs,
            hcClient);
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
     * @param CreateEncryptTaskRequest 请求对象
     * @return CompletableFuture<CreateEncryptTaskResponse>
     */
    public CompletableFuture<CreateEncryptTaskResponse> createEncryptTaskAsync(CreateEncryptTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createEncryptTask);
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
     * @param CreateEncryptTaskRequest 请求对象
     * @return AsyncInvoker<CreateEncryptTaskRequest, CreateEncryptTaskResponse>
     */
    public AsyncInvoker<CreateEncryptTaskRequest, CreateEncryptTaskResponse> createEncryptTaskAsyncInvoker(
        CreateEncryptTaskRequest request) {
        return new AsyncInvoker<CreateEncryptTaskRequest, CreateEncryptTaskResponse>(request, MpcMeta.createEncryptTask,
            hcClient);
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
     * @param DeleteEncryptTaskRequest 请求对象
     * @return CompletableFuture<DeleteEncryptTaskResponse>
     */
    public CompletableFuture<DeleteEncryptTaskResponse> deleteEncryptTaskAsync(DeleteEncryptTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteEncryptTask);
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
     * @param DeleteEncryptTaskRequest 请求对象
     * @return AsyncInvoker<DeleteEncryptTaskRequest, DeleteEncryptTaskResponse>
     */
    public AsyncInvoker<DeleteEncryptTaskRequest, DeleteEncryptTaskResponse> deleteEncryptTaskAsyncInvoker(
        DeleteEncryptTaskRequest request) {
        return new AsyncInvoker<DeleteEncryptTaskRequest, DeleteEncryptTaskResponse>(request, MpcMeta.deleteEncryptTask,
            hcClient);
    }

    /**
     * 查询独立加密任务
     *
     * 查询独立加密任务状态。返回任务执行结果或当前状态。该API已废弃。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEncryptTaskRequest 请求对象
     * @return CompletableFuture<ListEncryptTaskResponse>
     */
    public CompletableFuture<ListEncryptTaskResponse> listEncryptTaskAsync(ListEncryptTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listEncryptTask);
    }

    /**
     * 查询独立加密任务
     *
     * 查询独立加密任务状态。返回任务执行结果或当前状态。该API已废弃。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEncryptTaskRequest 请求对象
     * @return AsyncInvoker<ListEncryptTaskRequest, ListEncryptTaskResponse>
     */
    public AsyncInvoker<ListEncryptTaskRequest, ListEncryptTaskResponse> listEncryptTaskAsyncInvoker(
        ListEncryptTaskRequest request) {
        return new AsyncInvoker<ListEncryptTaskRequest, ListEncryptTaskResponse>(request, MpcMeta.listEncryptTask,
            hcClient);
    }

    /**
     * 新建视频解析任务
     *
     * 创建视频解析任务，解析视频元数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateExtractTaskRequest 请求对象
     * @return CompletableFuture<CreateExtractTaskResponse>
     */
    public CompletableFuture<CreateExtractTaskResponse> createExtractTaskAsync(CreateExtractTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createExtractTask);
    }

    /**
     * 新建视频解析任务
     *
     * 创建视频解析任务，解析视频元数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateExtractTaskRequest 请求对象
     * @return AsyncInvoker<CreateExtractTaskRequest, CreateExtractTaskResponse>
     */
    public AsyncInvoker<CreateExtractTaskRequest, CreateExtractTaskResponse> createExtractTaskAsyncInvoker(
        CreateExtractTaskRequest request) {
        return new AsyncInvoker<CreateExtractTaskRequest, CreateExtractTaskResponse>(request, MpcMeta.createExtractTask,
            hcClient);
    }

    /**
     * 取消视频解析任务
     *
     * 取消已下发的视频解析任务，仅支持取消正在排队中的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteExtractTaskRequest 请求对象
     * @return CompletableFuture<DeleteExtractTaskResponse>
     */
    public CompletableFuture<DeleteExtractTaskResponse> deleteExtractTaskAsync(DeleteExtractTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteExtractTask);
    }

    /**
     * 取消视频解析任务
     *
     * 取消已下发的视频解析任务，仅支持取消正在排队中的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteExtractTaskRequest 请求对象
     * @return AsyncInvoker<DeleteExtractTaskRequest, DeleteExtractTaskResponse>
     */
    public AsyncInvoker<DeleteExtractTaskRequest, DeleteExtractTaskResponse> deleteExtractTaskAsyncInvoker(
        DeleteExtractTaskRequest request) {
        return new AsyncInvoker<DeleteExtractTaskRequest, DeleteExtractTaskResponse>(request, MpcMeta.deleteExtractTask,
            hcClient);
    }

    /**
     * 查询视频解析任务
     *
     * 查询解析任务的状态和结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListExtractTaskRequest 请求对象
     * @return CompletableFuture<ListExtractTaskResponse>
     */
    public CompletableFuture<ListExtractTaskResponse> listExtractTaskAsync(ListExtractTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listExtractTask);
    }

    /**
     * 查询视频解析任务
     *
     * 查询解析任务的状态和结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListExtractTaskRequest 请求对象
     * @return AsyncInvoker<ListExtractTaskRequest, ListExtractTaskResponse>
     */
    public AsyncInvoker<ListExtractTaskRequest, ListExtractTaskResponse> listExtractTaskAsyncInvoker(
        ListExtractTaskRequest request) {
        return new AsyncInvoker<ListExtractTaskRequest, ListExtractTaskResponse>(request, MpcMeta.listExtractTask,
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateMbTasksReportRequest 请求对象
     * @return CompletableFuture<CreateMbTasksReportResponse>
     */
    public CompletableFuture<CreateMbTasksReportResponse> createMbTasksReportAsync(CreateMbTasksReportRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createMbTasksReport);
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
     * @param CreateMbTasksReportRequest 请求对象
     * @return AsyncInvoker<CreateMbTasksReportRequest, CreateMbTasksReportResponse>
     */
    public AsyncInvoker<CreateMbTasksReportRequest, CreateMbTasksReportResponse> createMbTasksReportAsyncInvoker(
        CreateMbTasksReportRequest request) {
        return new AsyncInvoker<CreateMbTasksReportRequest, CreateMbTasksReportResponse>(request,
            MpcMeta.createMbTasksReport, hcClient);
    }

    /**
     * 创建声道合并任务
     *
     * 创建声道合并任务，合并声道任务支持将每个声道各放一个文件中的片源，合并为单个音频文件。
     * 执行合并声道的源音频文件需要存储在与媒体处理服务同区域的OBS桶中，且该OBS桶已授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateMergeChannelsTaskRequest 请求对象
     * @return CompletableFuture<CreateMergeChannelsTaskResponse>
     */
    public CompletableFuture<CreateMergeChannelsTaskResponse> createMergeChannelsTaskAsync(
        CreateMergeChannelsTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createMergeChannelsTask);
    }

    /**
     * 创建声道合并任务
     *
     * 创建声道合并任务，合并声道任务支持将每个声道各放一个文件中的片源，合并为单个音频文件。
     * 执行合并声道的源音频文件需要存储在与媒体处理服务同区域的OBS桶中，且该OBS桶已授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateMergeChannelsTaskRequest 请求对象
     * @return AsyncInvoker<CreateMergeChannelsTaskRequest, CreateMergeChannelsTaskResponse>
     */
    public AsyncInvoker<CreateMergeChannelsTaskRequest, CreateMergeChannelsTaskResponse> createMergeChannelsTaskAsyncInvoker(
        CreateMergeChannelsTaskRequest request) {
        return new AsyncInvoker<CreateMergeChannelsTaskRequest, CreateMergeChannelsTaskResponse>(request,
            MpcMeta.createMergeChannelsTask, hcClient);
    }

    /**
     * 创建音轨重置任务
     *
     * 创建音轨重置任务，重置音轨任务支持按人工指定关系声道layout，语言标签，转封装片源，使其满足转码输入。
     * 执行音轨重置的源音频文件需要存储在与媒体处理服务同区域的OBS桶中，且该OBS桶已授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResetTracksTaskRequest 请求对象
     * @return CompletableFuture<CreateResetTracksTaskResponse>
     */
    public CompletableFuture<CreateResetTracksTaskResponse> createResetTracksTaskAsync(
        CreateResetTracksTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createResetTracksTask);
    }

    /**
     * 创建音轨重置任务
     *
     * 创建音轨重置任务，重置音轨任务支持按人工指定关系声道layout，语言标签，转封装片源，使其满足转码输入。
     * 执行音轨重置的源音频文件需要存储在与媒体处理服务同区域的OBS桶中，且该OBS桶已授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResetTracksTaskRequest 请求对象
     * @return AsyncInvoker<CreateResetTracksTaskRequest, CreateResetTracksTaskResponse>
     */
    public AsyncInvoker<CreateResetTracksTaskRequest, CreateResetTracksTaskResponse> createResetTracksTaskAsyncInvoker(
        CreateResetTracksTaskRequest request) {
        return new AsyncInvoker<CreateResetTracksTaskRequest, CreateResetTracksTaskResponse>(request,
            MpcMeta.createResetTracksTask, hcClient);
    }

    /**
     * 取消声道合并任务
     *
     * 取消合并音频多声道文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMergeChannelsTaskRequest 请求对象
     * @return CompletableFuture<DeleteMergeChannelsTaskResponse>
     */
    public CompletableFuture<DeleteMergeChannelsTaskResponse> deleteMergeChannelsTaskAsync(
        DeleteMergeChannelsTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteMergeChannelsTask);
    }

    /**
     * 取消声道合并任务
     *
     * 取消合并音频多声道文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMergeChannelsTaskRequest 请求对象
     * @return AsyncInvoker<DeleteMergeChannelsTaskRequest, DeleteMergeChannelsTaskResponse>
     */
    public AsyncInvoker<DeleteMergeChannelsTaskRequest, DeleteMergeChannelsTaskResponse> deleteMergeChannelsTaskAsyncInvoker(
        DeleteMergeChannelsTaskRequest request) {
        return new AsyncInvoker<DeleteMergeChannelsTaskRequest, DeleteMergeChannelsTaskResponse>(request,
            MpcMeta.deleteMergeChannelsTask, hcClient);
    }

    /**
     * 取消音轨重置任务
     *
     * 取消重置音频文件声轨任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResetTracksTaskRequest 请求对象
     * @return CompletableFuture<DeleteResetTracksTaskResponse>
     */
    public CompletableFuture<DeleteResetTracksTaskResponse> deleteResetTracksTaskAsync(
        DeleteResetTracksTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteResetTracksTask);
    }

    /**
     * 取消音轨重置任务
     *
     * 取消重置音频文件声轨任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResetTracksTaskRequest 请求对象
     * @return AsyncInvoker<DeleteResetTracksTaskRequest, DeleteResetTracksTaskResponse>
     */
    public AsyncInvoker<DeleteResetTracksTaskRequest, DeleteResetTracksTaskResponse> deleteResetTracksTaskAsyncInvoker(
        DeleteResetTracksTaskRequest request) {
        return new AsyncInvoker<DeleteResetTracksTaskRequest, DeleteResetTracksTaskResponse>(request,
            MpcMeta.deleteResetTracksTask, hcClient);
    }

    /**
     * 查询声道合并任务
     *
     * 查询声道合并任务的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMergeChannelsTaskRequest 请求对象
     * @return CompletableFuture<ListMergeChannelsTaskResponse>
     */
    public CompletableFuture<ListMergeChannelsTaskResponse> listMergeChannelsTaskAsync(
        ListMergeChannelsTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listMergeChannelsTask);
    }

    /**
     * 查询声道合并任务
     *
     * 查询声道合并任务的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMergeChannelsTaskRequest 请求对象
     * @return AsyncInvoker<ListMergeChannelsTaskRequest, ListMergeChannelsTaskResponse>
     */
    public AsyncInvoker<ListMergeChannelsTaskRequest, ListMergeChannelsTaskResponse> listMergeChannelsTaskAsyncInvoker(
        ListMergeChannelsTaskRequest request) {
        return new AsyncInvoker<ListMergeChannelsTaskRequest, ListMergeChannelsTaskResponse>(request,
            MpcMeta.listMergeChannelsTask, hcClient);
    }

    /**
     * 查询音轨重置任务
     *
     * 查询音轨重置任务的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResetTracksTaskRequest 请求对象
     * @return CompletableFuture<ListResetTracksTaskResponse>
     */
    public CompletableFuture<ListResetTracksTaskResponse> listResetTracksTaskAsync(ListResetTracksTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listResetTracksTask);
    }

    /**
     * 查询音轨重置任务
     *
     * 查询音轨重置任务的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResetTracksTaskRequest 请求对象
     * @return AsyncInvoker<ListResetTracksTaskRequest, ListResetTracksTaskResponse>
     */
    public AsyncInvoker<ListResetTracksTaskRequest, ListResetTracksTaskResponse> listResetTracksTaskAsyncInvoker(
        ListResetTracksTaskRequest request) {
        return new AsyncInvoker<ListResetTracksTaskRequest, ListResetTracksTaskResponse>(request,
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateMediaProcessTaskRequest 请求对象
     * @return CompletableFuture<CreateMediaProcessTaskResponse>
     */
    public CompletableFuture<CreateMediaProcessTaskResponse> createMediaProcessTaskAsync(
        CreateMediaProcessTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createMediaProcessTask);
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
     * @param CreateMediaProcessTaskRequest 请求对象
     * @return AsyncInvoker<CreateMediaProcessTaskRequest, CreateMediaProcessTaskResponse>
     */
    public AsyncInvoker<CreateMediaProcessTaskRequest, CreateMediaProcessTaskResponse> createMediaProcessTaskAsyncInvoker(
        CreateMediaProcessTaskRequest request) {
        return new AsyncInvoker<CreateMediaProcessTaskRequest, CreateMediaProcessTaskResponse>(request,
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteMediaProcessTaskRequest 请求对象
     * @return CompletableFuture<DeleteMediaProcessTaskResponse>
     */
    public CompletableFuture<DeleteMediaProcessTaskResponse> deleteMediaProcessTaskAsync(
        DeleteMediaProcessTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteMediaProcessTask);
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
     * @param DeleteMediaProcessTaskRequest 请求对象
     * @return AsyncInvoker<DeleteMediaProcessTaskRequest, DeleteMediaProcessTaskResponse>
     */
    public AsyncInvoker<DeleteMediaProcessTaskRequest, DeleteMediaProcessTaskResponse> deleteMediaProcessTaskAsyncInvoker(
        DeleteMediaProcessTaskRequest request) {
        return new AsyncInvoker<DeleteMediaProcessTaskRequest, DeleteMediaProcessTaskResponse>(request,
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMediaProcessTaskRequest 请求对象
     * @return CompletableFuture<ListMediaProcessTaskResponse>
     */
    public CompletableFuture<ListMediaProcessTaskResponse> listMediaProcessTaskAsync(
        ListMediaProcessTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listMediaProcessTask);
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
     * @param ListMediaProcessTaskRequest 请求对象
     * @return AsyncInvoker<ListMediaProcessTaskRequest, ListMediaProcessTaskResponse>
     */
    public AsyncInvoker<ListMediaProcessTaskRequest, ListMediaProcessTaskResponse> listMediaProcessTaskAsyncInvoker(
        ListMediaProcessTaskRequest request) {
        return new AsyncInvoker<ListMediaProcessTaskRequest, ListMediaProcessTaskResponse>(request,
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateMpeCallBackRequest 请求对象
     * @return CompletableFuture<CreateMpeCallBackResponse>
     */
    public CompletableFuture<CreateMpeCallBackResponse> createMpeCallBackAsync(CreateMpeCallBackRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createMpeCallBack);
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
     * @param CreateMpeCallBackRequest 请求对象
     * @return AsyncInvoker<CreateMpeCallBackRequest, CreateMpeCallBackResponse>
     */
    public AsyncInvoker<CreateMpeCallBackRequest, CreateMpeCallBackResponse> createMpeCallBackAsyncInvoker(
        CreateMpeCallBackRequest request) {
        return new AsyncInvoker<CreateMpeCallBackRequest, CreateMpeCallBackResponse>(request, MpcMeta.createMpeCallBack,
            hcClient);
    }

    /**
     * 创建视频增强模板
     *
     * 创建视频增强模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateQualityEnhanceTemplateRequest 请求对象
     * @return CompletableFuture<CreateQualityEnhanceTemplateResponse>
     */
    public CompletableFuture<CreateQualityEnhanceTemplateResponse> createQualityEnhanceTemplateAsync(
        CreateQualityEnhanceTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createQualityEnhanceTemplate);
    }

    /**
     * 创建视频增强模板
     *
     * 创建视频增强模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateQualityEnhanceTemplateRequest 请求对象
     * @return AsyncInvoker<CreateQualityEnhanceTemplateRequest, CreateQualityEnhanceTemplateResponse>
     */
    public AsyncInvoker<CreateQualityEnhanceTemplateRequest, CreateQualityEnhanceTemplateResponse> createQualityEnhanceTemplateAsyncInvoker(
        CreateQualityEnhanceTemplateRequest request) {
        return new AsyncInvoker<CreateQualityEnhanceTemplateRequest, CreateQualityEnhanceTemplateResponse>(request,
            MpcMeta.createQualityEnhanceTemplate, hcClient);
    }

    /**
     * 删除用户视频增强模板
     *
     * 删除用户视频增强模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteQualityEnhanceTemplateRequest 请求对象
     * @return CompletableFuture<DeleteQualityEnhanceTemplateResponse>
     */
    public CompletableFuture<DeleteQualityEnhanceTemplateResponse> deleteQualityEnhanceTemplateAsync(
        DeleteQualityEnhanceTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteQualityEnhanceTemplate);
    }

    /**
     * 删除用户视频增强模板
     *
     * 删除用户视频增强模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteQualityEnhanceTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteQualityEnhanceTemplateRequest, DeleteQualityEnhanceTemplateResponse>
     */
    public AsyncInvoker<DeleteQualityEnhanceTemplateRequest, DeleteQualityEnhanceTemplateResponse> deleteQualityEnhanceTemplateAsyncInvoker(
        DeleteQualityEnhanceTemplateRequest request) {
        return new AsyncInvoker<DeleteQualityEnhanceTemplateRequest, DeleteQualityEnhanceTemplateResponse>(request,
            MpcMeta.deleteQualityEnhanceTemplate, hcClient);
    }

    /**
     * 查询视频增强预置模板
     *
     * 查询视频增强预置模板，返回所有结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQualityEnhanceDefaultTemplateRequest 请求对象
     * @return CompletableFuture<ListQualityEnhanceDefaultTemplateResponse>
     */
    public CompletableFuture<ListQualityEnhanceDefaultTemplateResponse> listQualityEnhanceDefaultTemplateAsync(
        ListQualityEnhanceDefaultTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listQualityEnhanceDefaultTemplate);
    }

    /**
     * 查询视频增强预置模板
     *
     * 查询视频增强预置模板，返回所有结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQualityEnhanceDefaultTemplateRequest 请求对象
     * @return AsyncInvoker<ListQualityEnhanceDefaultTemplateRequest, ListQualityEnhanceDefaultTemplateResponse>
     */
    public AsyncInvoker<ListQualityEnhanceDefaultTemplateRequest, ListQualityEnhanceDefaultTemplateResponse> listQualityEnhanceDefaultTemplateAsyncInvoker(
        ListQualityEnhanceDefaultTemplateRequest request) {
        return new AsyncInvoker<ListQualityEnhanceDefaultTemplateRequest, ListQualityEnhanceDefaultTemplateResponse>(
            request, MpcMeta.listQualityEnhanceDefaultTemplate, hcClient);
    }

    /**
     * 更新视频增强模板
     *
     * 更新视频增强模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateQualityEnhanceTemplateRequest 请求对象
     * @return CompletableFuture<UpdateQualityEnhanceTemplateResponse>
     */
    public CompletableFuture<UpdateQualityEnhanceTemplateResponse> updateQualityEnhanceTemplateAsync(
        UpdateQualityEnhanceTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.updateQualityEnhanceTemplate);
    }

    /**
     * 更新视频增强模板
     *
     * 更新视频增强模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateQualityEnhanceTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateQualityEnhanceTemplateRequest, UpdateQualityEnhanceTemplateResponse>
     */
    public AsyncInvoker<UpdateQualityEnhanceTemplateRequest, UpdateQualityEnhanceTemplateResponse> updateQualityEnhanceTemplateAsyncInvoker(
        UpdateQualityEnhanceTemplateRequest request) {
        return new AsyncInvoker<UpdateQualityEnhanceTemplateRequest, UpdateQualityEnhanceTemplateResponse>(request,
            MpcMeta.updateQualityEnhanceTemplate, hcClient);
    }

    /**
     * 查询媒资转码详情
     *
     * 查询媒资转码详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTranscodeDetailRequest 请求对象
     * @return CompletableFuture<ListTranscodeDetailResponse>
     */
    public CompletableFuture<ListTranscodeDetailResponse> listTranscodeDetailAsync(ListTranscodeDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listTranscodeDetail);
    }

    /**
     * 查询媒资转码详情
     *
     * 查询媒资转码详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTranscodeDetailRequest 请求对象
     * @return AsyncInvoker<ListTranscodeDetailRequest, ListTranscodeDetailResponse>
     */
    public AsyncInvoker<ListTranscodeDetailRequest, ListTranscodeDetailResponse> listTranscodeDetailAsyncInvoker(
        ListTranscodeDetailRequest request) {
        return new AsyncInvoker<ListTranscodeDetailRequest, ListTranscodeDetailResponse>(request,
            MpcMeta.listTranscodeDetail, hcClient);
    }

    /**
     * 取消转封装任务
     *
     * 取消已下发的转封装任务，仅支持取消正在排队中的任务。。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelRemuxTaskRequest 请求对象
     * @return CompletableFuture<CancelRemuxTaskResponse>
     */
    public CompletableFuture<CancelRemuxTaskResponse> cancelRemuxTaskAsync(CancelRemuxTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.cancelRemuxTask);
    }

    /**
     * 取消转封装任务
     *
     * 取消已下发的转封装任务，仅支持取消正在排队中的任务。。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelRemuxTaskRequest 请求对象
     * @return AsyncInvoker<CancelRemuxTaskRequest, CancelRemuxTaskResponse>
     */
    public AsyncInvoker<CancelRemuxTaskRequest, CancelRemuxTaskResponse> cancelRemuxTaskAsyncInvoker(
        CancelRemuxTaskRequest request) {
        return new AsyncInvoker<CancelRemuxTaskRequest, CancelRemuxTaskResponse>(request, MpcMeta.cancelRemuxTask,
            hcClient);
    }

    /**
     * 新建转封装任务
     *
     * 创建转封装任务，转换音视频文件的格式，但不改变其分辨率和码率。
     * 待转封装的媒资文件需要存储在与媒体处理服务同区域的OBS桶中，且该OBS桶已授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRemuxTaskRequest 请求对象
     * @return CompletableFuture<CreateRemuxTaskResponse>
     */
    public CompletableFuture<CreateRemuxTaskResponse> createRemuxTaskAsync(CreateRemuxTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createRemuxTask);
    }

    /**
     * 新建转封装任务
     *
     * 创建转封装任务，转换音视频文件的格式，但不改变其分辨率和码率。
     * 待转封装的媒资文件需要存储在与媒体处理服务同区域的OBS桶中，且该OBS桶已授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRemuxTaskRequest 请求对象
     * @return AsyncInvoker<CreateRemuxTaskRequest, CreateRemuxTaskResponse>
     */
    public AsyncInvoker<CreateRemuxTaskRequest, CreateRemuxTaskResponse> createRemuxTaskAsyncInvoker(
        CreateRemuxTaskRequest request) {
        return new AsyncInvoker<CreateRemuxTaskRequest, CreateRemuxTaskResponse>(request, MpcMeta.createRemuxTask,
            hcClient);
    }

    /**
     * 重试转封装任务
     *
     * 对失败的转封装任务进行重试。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRetryRemuxTaskRequest 请求对象
     * @return CompletableFuture<CreateRetryRemuxTaskResponse>
     */
    public CompletableFuture<CreateRetryRemuxTaskResponse> createRetryRemuxTaskAsync(
        CreateRetryRemuxTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createRetryRemuxTask);
    }

    /**
     * 重试转封装任务
     *
     * 对失败的转封装任务进行重试。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRetryRemuxTaskRequest 请求对象
     * @return AsyncInvoker<CreateRetryRemuxTaskRequest, CreateRetryRemuxTaskResponse>
     */
    public AsyncInvoker<CreateRetryRemuxTaskRequest, CreateRetryRemuxTaskResponse> createRetryRemuxTaskAsyncInvoker(
        CreateRetryRemuxTaskRequest request) {
        return new AsyncInvoker<CreateRetryRemuxTaskRequest, CreateRetryRemuxTaskResponse>(request,
            MpcMeta.createRetryRemuxTask, hcClient);
    }

    /**
     * 删除转封装任务记录
     *
     * 删除转封装任务记录，只能删除状态为“已取消”，“转码成功”，“转码失败”的任务记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRemuxTaskRequest 请求对象
     * @return CompletableFuture<DeleteRemuxTaskResponse>
     */
    public CompletableFuture<DeleteRemuxTaskResponse> deleteRemuxTaskAsync(DeleteRemuxTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteRemuxTask);
    }

    /**
     * 删除转封装任务记录
     *
     * 删除转封装任务记录，只能删除状态为“已取消”，“转码成功”，“转码失败”的任务记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRemuxTaskRequest 请求对象
     * @return AsyncInvoker<DeleteRemuxTaskRequest, DeleteRemuxTaskResponse>
     */
    public AsyncInvoker<DeleteRemuxTaskRequest, DeleteRemuxTaskResponse> deleteRemuxTaskAsyncInvoker(
        DeleteRemuxTaskRequest request) {
        return new AsyncInvoker<DeleteRemuxTaskRequest, DeleteRemuxTaskResponse>(request, MpcMeta.deleteRemuxTask,
            hcClient);
    }

    /**
     * 查询转封装任务
     *
     * 查询转封装任务状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRemuxTaskRequest 请求对象
     * @return CompletableFuture<ListRemuxTaskResponse>
     */
    public CompletableFuture<ListRemuxTaskResponse> listRemuxTaskAsync(ListRemuxTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listRemuxTask);
    }

    /**
     * 查询转封装任务
     *
     * 查询转封装任务状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRemuxTaskRequest 请求对象
     * @return AsyncInvoker<ListRemuxTaskRequest, ListRemuxTaskResponse>
     */
    public AsyncInvoker<ListRemuxTaskRequest, ListRemuxTaskResponse> listRemuxTaskAsyncInvoker(
        ListRemuxTaskRequest request) {
        return new AsyncInvoker<ListRemuxTaskRequest, ListRemuxTaskResponse>(request, MpcMeta.listRemuxTask, hcClient);
    }

    /**
     * 新建转码模板组
     *
     * 新建转码模板组，最多支持一进六出。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTemplateGroupRequest 请求对象
     * @return CompletableFuture<CreateTemplateGroupResponse>
     */
    public CompletableFuture<CreateTemplateGroupResponse> createTemplateGroupAsync(CreateTemplateGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createTemplateGroup);
    }

    /**
     * 新建转码模板组
     *
     * 新建转码模板组，最多支持一进六出。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTemplateGroupRequest 请求对象
     * @return AsyncInvoker<CreateTemplateGroupRequest, CreateTemplateGroupResponse>
     */
    public AsyncInvoker<CreateTemplateGroupRequest, CreateTemplateGroupResponse> createTemplateGroupAsyncInvoker(
        CreateTemplateGroupRequest request) {
        return new AsyncInvoker<CreateTemplateGroupRequest, CreateTemplateGroupResponse>(request,
            MpcMeta.createTemplateGroup, hcClient);
    }

    /**
     * 删除转码模板组
     *
     * 删除转码模板组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTemplateGroupRequest 请求对象
     * @return CompletableFuture<DeleteTemplateGroupResponse>
     */
    public CompletableFuture<DeleteTemplateGroupResponse> deleteTemplateGroupAsync(DeleteTemplateGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteTemplateGroup);
    }

    /**
     * 删除转码模板组
     *
     * 删除转码模板组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTemplateGroupRequest 请求对象
     * @return AsyncInvoker<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse>
     */
    public AsyncInvoker<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse> deleteTemplateGroupAsyncInvoker(
        DeleteTemplateGroupRequest request) {
        return new AsyncInvoker<DeleteTemplateGroupRequest, DeleteTemplateGroupResponse>(request,
            MpcMeta.deleteTemplateGroup, hcClient);
    }

    /**
     * 查询转码模板组
     *
     * 查询转码模板组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTemplateGroupRequest 请求对象
     * @return CompletableFuture<ListTemplateGroupResponse>
     */
    public CompletableFuture<ListTemplateGroupResponse> listTemplateGroupAsync(ListTemplateGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listTemplateGroup);
    }

    /**
     * 查询转码模板组
     *
     * 查询转码模板组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTemplateGroupRequest 请求对象
     * @return AsyncInvoker<ListTemplateGroupRequest, ListTemplateGroupResponse>
     */
    public AsyncInvoker<ListTemplateGroupRequest, ListTemplateGroupResponse> listTemplateGroupAsyncInvoker(
        ListTemplateGroupRequest request) {
        return new AsyncInvoker<ListTemplateGroupRequest, ListTemplateGroupResponse>(request, MpcMeta.listTemplateGroup,
            hcClient);
    }

    /**
     * 更新转码模板组
     *
     * 修改模板组接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTemplateGroupRequest 请求对象
     * @return CompletableFuture<UpdateTemplateGroupResponse>
     */
    public CompletableFuture<UpdateTemplateGroupResponse> updateTemplateGroupAsync(UpdateTemplateGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.updateTemplateGroup);
    }

    /**
     * 更新转码模板组
     *
     * 修改模板组接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTemplateGroupRequest 请求对象
     * @return AsyncInvoker<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse>
     */
    public AsyncInvoker<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse> updateTemplateGroupAsyncInvoker(
        UpdateTemplateGroupRequest request) {
        return new AsyncInvoker<UpdateTemplateGroupRequest, UpdateTemplateGroupResponse>(request,
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateThumbnailsTaskRequest 请求对象
     * @return CompletableFuture<CreateThumbnailsTaskResponse>
     */
    public CompletableFuture<CreateThumbnailsTaskResponse> createThumbnailsTaskAsync(
        CreateThumbnailsTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createThumbnailsTask);
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
     * @param CreateThumbnailsTaskRequest 请求对象
     * @return AsyncInvoker<CreateThumbnailsTaskRequest, CreateThumbnailsTaskResponse>
     */
    public AsyncInvoker<CreateThumbnailsTaskRequest, CreateThumbnailsTaskResponse> createThumbnailsTaskAsyncInvoker(
        CreateThumbnailsTaskRequest request) {
        return new AsyncInvoker<CreateThumbnailsTaskRequest, CreateThumbnailsTaskResponse>(request,
            MpcMeta.createThumbnailsTask, hcClient);
    }

    /**
     * 取消截图任务
     *
     * 取消已下发截图任务。
     * 只能取消已接受尚在队列中等待处理的任务，已完成或正在执行阶段的任务不能取消。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteThumbnailsTaskRequest 请求对象
     * @return CompletableFuture<DeleteThumbnailsTaskResponse>
     */
    public CompletableFuture<DeleteThumbnailsTaskResponse> deleteThumbnailsTaskAsync(
        DeleteThumbnailsTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteThumbnailsTask);
    }

    /**
     * 取消截图任务
     *
     * 取消已下发截图任务。
     * 只能取消已接受尚在队列中等待处理的任务，已完成或正在执行阶段的任务不能取消。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteThumbnailsTaskRequest 请求对象
     * @return AsyncInvoker<DeleteThumbnailsTaskRequest, DeleteThumbnailsTaskResponse>
     */
    public AsyncInvoker<DeleteThumbnailsTaskRequest, DeleteThumbnailsTaskResponse> deleteThumbnailsTaskAsyncInvoker(
        DeleteThumbnailsTaskRequest request) {
        return new AsyncInvoker<DeleteThumbnailsTaskRequest, DeleteThumbnailsTaskResponse>(request,
            MpcMeta.deleteThumbnailsTask, hcClient);
    }

    /**
     * 查询截图任务
     *
     * 查询截图任务状态。返回任务执行结果，包括状态、输入、输出等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListThumbnailsTaskRequest 请求对象
     * @return CompletableFuture<ListThumbnailsTaskResponse>
     */
    public CompletableFuture<ListThumbnailsTaskResponse> listThumbnailsTaskAsync(ListThumbnailsTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listThumbnailsTask);
    }

    /**
     * 查询截图任务
     *
     * 查询截图任务状态。返回任务执行结果，包括状态、输入、输出等信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListThumbnailsTaskRequest 请求对象
     * @return AsyncInvoker<ListThumbnailsTaskRequest, ListThumbnailsTaskResponse>
     */
    public AsyncInvoker<ListThumbnailsTaskRequest, ListThumbnailsTaskResponse> listThumbnailsTaskAsyncInvoker(
        ListThumbnailsTaskRequest request) {
        return new AsyncInvoker<ListThumbnailsTaskRequest, ListThumbnailsTaskResponse>(request,
            MpcMeta.listThumbnailsTask, hcClient);
    }

    /**
     * 新建转码任务
     *
     * 新建转码任务可以将视频进行转码，并在转码过程中压制水印、视频截图等。视频转码前需要配置转码模板。
     * 待转码的音视频需要存储在与媒体处理服务同区域的OBS桶中，且该OBS桶已授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTranscodingTaskRequest 请求对象
     * @return CompletableFuture<CreateTranscodingTaskResponse>
     */
    public CompletableFuture<CreateTranscodingTaskResponse> createTranscodingTaskAsync(
        CreateTranscodingTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createTranscodingTask);
    }

    /**
     * 新建转码任务
     *
     * 新建转码任务可以将视频进行转码，并在转码过程中压制水印、视频截图等。视频转码前需要配置转码模板。
     * 待转码的音视频需要存储在与媒体处理服务同区域的OBS桶中，且该OBS桶已授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTranscodingTaskRequest 请求对象
     * @return AsyncInvoker<CreateTranscodingTaskRequest, CreateTranscodingTaskResponse>
     */
    public AsyncInvoker<CreateTranscodingTaskRequest, CreateTranscodingTaskResponse> createTranscodingTaskAsyncInvoker(
        CreateTranscodingTaskRequest request) {
        return new AsyncInvoker<CreateTranscodingTaskRequest, CreateTranscodingTaskResponse>(request,
            MpcMeta.createTranscodingTask, hcClient);
    }

    /**
     * 取消转码任务
     *
     * 取消已下发转码任务。
     * 只能取消正在转码任务队列中排队的转码任务。已开始转码或已完成的转码任务不能取消。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTranscodingTaskRequest 请求对象
     * @return CompletableFuture<DeleteTranscodingTaskResponse>
     */
    public CompletableFuture<DeleteTranscodingTaskResponse> deleteTranscodingTaskAsync(
        DeleteTranscodingTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteTranscodingTask);
    }

    /**
     * 取消转码任务
     *
     * 取消已下发转码任务。
     * 只能取消正在转码任务队列中排队的转码任务。已开始转码或已完成的转码任务不能取消。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTranscodingTaskRequest 请求对象
     * @return AsyncInvoker<DeleteTranscodingTaskRequest, DeleteTranscodingTaskResponse>
     */
    public AsyncInvoker<DeleteTranscodingTaskRequest, DeleteTranscodingTaskResponse> deleteTranscodingTaskAsyncInvoker(
        DeleteTranscodingTaskRequest request) {
        return new AsyncInvoker<DeleteTranscodingTaskRequest, DeleteTranscodingTaskResponse>(request,
            MpcMeta.deleteTranscodingTask, hcClient);
    }

    /**
     * 删除转码任务记录
     *
     * 删除转码任务记录，只能删除状态为“已取消”，“转码成功”，“转码失败”的转码任务记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTranscodingTaskByConsoleRequest 请求对象
     * @return CompletableFuture<DeleteTranscodingTaskByConsoleResponse>
     */
    public CompletableFuture<DeleteTranscodingTaskByConsoleResponse> deleteTranscodingTaskByConsoleAsync(
        DeleteTranscodingTaskByConsoleRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteTranscodingTaskByConsole);
    }

    /**
     * 删除转码任务记录
     *
     * 删除转码任务记录，只能删除状态为“已取消”，“转码成功”，“转码失败”的转码任务记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTranscodingTaskByConsoleRequest 请求对象
     * @return AsyncInvoker<DeleteTranscodingTaskByConsoleRequest, DeleteTranscodingTaskByConsoleResponse>
     */
    public AsyncInvoker<DeleteTranscodingTaskByConsoleRequest, DeleteTranscodingTaskByConsoleResponse> deleteTranscodingTaskByConsoleAsyncInvoker(
        DeleteTranscodingTaskByConsoleRequest request) {
        return new AsyncInvoker<DeleteTranscodingTaskByConsoleRequest, DeleteTranscodingTaskByConsoleResponse>(request,
            MpcMeta.deleteTranscodingTaskByConsole, hcClient);
    }

    /**
     * 查询点播概览信息
     *
     * 查询最近一周，最近一月或者自定义时间段的“转码时长”，“调用转码API次数”。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStatSummaryRequest 请求对象
     * @return CompletableFuture<ListStatSummaryResponse>
     */
    public CompletableFuture<ListStatSummaryResponse> listStatSummaryAsync(ListStatSummaryRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listStatSummary);
    }

    /**
     * 查询点播概览信息
     *
     * 查询最近一周，最近一月或者自定义时间段的“转码时长”，“调用转码API次数”。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStatSummaryRequest 请求对象
     * @return AsyncInvoker<ListStatSummaryRequest, ListStatSummaryResponse>
     */
    public AsyncInvoker<ListStatSummaryRequest, ListStatSummaryResponse> listStatSummaryAsyncInvoker(
        ListStatSummaryRequest request) {
        return new AsyncInvoker<ListStatSummaryRequest, ListStatSummaryResponse>(request, MpcMeta.listStatSummary,
            hcClient);
    }

    /**
     * 查询转码任务
     *
     * 查询转码任务状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTranscodingTaskRequest 请求对象
     * @return CompletableFuture<ListTranscodingTaskResponse>
     */
    public CompletableFuture<ListTranscodingTaskResponse> listTranscodingTaskAsync(ListTranscodingTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listTranscodingTask);
    }

    /**
     * 查询转码任务
     *
     * 查询转码任务状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTranscodingTaskRequest 请求对象
     * @return AsyncInvoker<ListTranscodingTaskRequest, ListTranscodingTaskResponse>
     */
    public AsyncInvoker<ListTranscodingTaskRequest, ListTranscodingTaskResponse> listTranscodingTaskAsyncInvoker(
        ListTranscodingTaskRequest request) {
        return new AsyncInvoker<ListTranscodingTaskRequest, ListTranscodingTaskResponse>(request,
            MpcMeta.listTranscodingTask, hcClient);
    }

    /**
     * 新建转码模板
     *
     * 新建转码模板，采用自定义的模板转码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTransTemplateRequest 请求对象
     * @return CompletableFuture<CreateTransTemplateResponse>
     */
    public CompletableFuture<CreateTransTemplateResponse> createTransTemplateAsync(CreateTransTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createTransTemplate);
    }

    /**
     * 新建转码模板
     *
     * 新建转码模板，采用自定义的模板转码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTransTemplateRequest 请求对象
     * @return AsyncInvoker<CreateTransTemplateRequest, CreateTransTemplateResponse>
     */
    public AsyncInvoker<CreateTransTemplateRequest, CreateTransTemplateResponse> createTransTemplateAsyncInvoker(
        CreateTransTemplateRequest request) {
        return new AsyncInvoker<CreateTransTemplateRequest, CreateTransTemplateResponse>(request,
            MpcMeta.createTransTemplate, hcClient);
    }

    /**
     * 删除转码模板
     *
     * 删除转码模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTemplateRequest 请求对象
     * @return CompletableFuture<DeleteTemplateResponse>
     */
    public CompletableFuture<DeleteTemplateResponse> deleteTemplateAsync(DeleteTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteTemplate);
    }

    /**
     * 删除转码模板
     *
     * 删除转码模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse>
     */
    public AsyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplateAsyncInvoker(
        DeleteTemplateRequest request) {
        return new AsyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse>(request, MpcMeta.deleteTemplate,
            hcClient);
    }

    /**
     * 查询转码模板
     *
     * 查询用户自定义转码配置模板。
     * 支持指定模板ID查询，或分页全量查询。转码配置模板ID，最多10个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTemplateRequest 请求对象
     * @return CompletableFuture<ListTemplateResponse>
     */
    public CompletableFuture<ListTemplateResponse> listTemplateAsync(ListTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listTemplate);
    }

    /**
     * 查询转码模板
     *
     * 查询用户自定义转码配置模板。
     * 支持指定模板ID查询，或分页全量查询。转码配置模板ID，最多10个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTemplateRequest 请求对象
     * @return AsyncInvoker<ListTemplateRequest, ListTemplateResponse>
     */
    public AsyncInvoker<ListTemplateRequest, ListTemplateResponse> listTemplateAsyncInvoker(
        ListTemplateRequest request) {
        return new AsyncInvoker<ListTemplateRequest, ListTemplateResponse>(request, MpcMeta.listTemplate, hcClient);
    }

    /**
     * 更新转码模板
     *
     * 更新转码模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTransTemplateRequest 请求对象
     * @return CompletableFuture<UpdateTransTemplateResponse>
     */
    public CompletableFuture<UpdateTransTemplateResponse> updateTransTemplateAsync(UpdateTransTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.updateTransTemplate);
    }

    /**
     * 更新转码模板
     *
     * 更新转码模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTransTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateTransTemplateRequest, UpdateTransTemplateResponse>
     */
    public AsyncInvoker<UpdateTransTemplateRequest, UpdateTransTemplateResponse> updateTransTemplateAsyncInvoker(
        UpdateTransTemplateRequest request) {
        return new AsyncInvoker<UpdateTransTemplateRequest, UpdateTransTemplateResponse>(request,
            MpcMeta.updateTransTemplate, hcClient);
    }

    /**
     * 新建水印模板
     *
     * 自定义水印模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateWatermarkTemplateRequest 请求对象
     * @return CompletableFuture<CreateWatermarkTemplateResponse>
     */
    public CompletableFuture<CreateWatermarkTemplateResponse> createWatermarkTemplateAsync(
        CreateWatermarkTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.createWatermarkTemplate);
    }

    /**
     * 新建水印模板
     *
     * 自定义水印模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateWatermarkTemplateRequest 请求对象
     * @return AsyncInvoker<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse>
     */
    public AsyncInvoker<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse> createWatermarkTemplateAsyncInvoker(
        CreateWatermarkTemplateRequest request) {
        return new AsyncInvoker<CreateWatermarkTemplateRequest, CreateWatermarkTemplateResponse>(request,
            MpcMeta.createWatermarkTemplate, hcClient);
    }

    /**
     * 删除水印模板
     *
     * 删除自定义水印模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteWatermarkTemplateRequest 请求对象
     * @return CompletableFuture<DeleteWatermarkTemplateResponse>
     */
    public CompletableFuture<DeleteWatermarkTemplateResponse> deleteWatermarkTemplateAsync(
        DeleteWatermarkTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.deleteWatermarkTemplate);
    }

    /**
     * 删除水印模板
     *
     * 删除自定义水印模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteWatermarkTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse>
     */
    public AsyncInvoker<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse> deleteWatermarkTemplateAsyncInvoker(
        DeleteWatermarkTemplateRequest request) {
        return new AsyncInvoker<DeleteWatermarkTemplateRequest, DeleteWatermarkTemplateResponse>(request,
            MpcMeta.deleteWatermarkTemplate, hcClient);
    }

    /**
     * 查询水印模板
     *
     * 查询自定义水印模板。支持指定模板ID查询，或分页全量查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWatermarkTemplateRequest 请求对象
     * @return CompletableFuture<ListWatermarkTemplateResponse>
     */
    public CompletableFuture<ListWatermarkTemplateResponse> listWatermarkTemplateAsync(
        ListWatermarkTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.listWatermarkTemplate);
    }

    /**
     * 查询水印模板
     *
     * 查询自定义水印模板。支持指定模板ID查询，或分页全量查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListWatermarkTemplateRequest 请求对象
     * @return AsyncInvoker<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse>
     */
    public AsyncInvoker<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse> listWatermarkTemplateAsyncInvoker(
        ListWatermarkTemplateRequest request) {
        return new AsyncInvoker<ListWatermarkTemplateRequest, ListWatermarkTemplateResponse>(request,
            MpcMeta.listWatermarkTemplate, hcClient);
    }

    /**
     * 更新水印模板
     *
     * 更新自定义水印模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateWatermarkTemplateRequest 请求对象
     * @return CompletableFuture<UpdateWatermarkTemplateResponse>
     */
    public CompletableFuture<UpdateWatermarkTemplateResponse> updateWatermarkTemplateAsync(
        UpdateWatermarkTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MpcMeta.updateWatermarkTemplate);
    }

    /**
     * 更新水印模板
     *
     * 更新自定义水印模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateWatermarkTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse>
     */
    public AsyncInvoker<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse> updateWatermarkTemplateAsyncInvoker(
        UpdateWatermarkTemplateRequest request) {
        return new AsyncInvoker<UpdateWatermarkTemplateRequest, UpdateWatermarkTemplateResponse>(request,
            MpcMeta.updateWatermarkTemplate, hcClient);
    }

}

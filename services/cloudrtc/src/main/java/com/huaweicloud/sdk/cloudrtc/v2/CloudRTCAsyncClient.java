package com.huaweicloud.sdk.cloudrtc.v2;

import com.huaweicloud.sdk.cloudrtc.v2.model.CreateAppRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.CreateAppResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.CreateIndividualStreamJobRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.CreateIndividualStreamJobResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.CreateMixJobRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.CreateMixJobResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.CreateRecordRuleRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.CreateRecordRuleResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.DeleteAppRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.DeleteAppResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.DeleteRecordRuleRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.DeleteRecordRuleResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.ListAppsRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.ListAppsResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.ListObsBucketObjectsRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.ListObsBucketObjectsResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.ListObsBucketsRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.ListObsBucketsResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.ListRecordRulesRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.ListRecordRulesResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.RemoveRoomRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.RemoveRoomResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.RemoveUsersRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.RemoveUsersResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.ShowAppRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.ShowAppResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.ShowAutoRecordRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.ShowAutoRecordResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.ShowIndividualStreamJobRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.ShowIndividualStreamJobResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.ShowMixJobRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.ShowMixJobResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.ShowRecordCallbackRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.ShowRecordCallbackResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.ShowRecordRuleRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.ShowRecordRuleResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.StartAppRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.StartAppResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.StopAppRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.StopAppResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.StopIndividualStreamJobRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.StopIndividualStreamJobResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.StopMixJobRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.StopMixJobResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.UpdateAutoRecordRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.UpdateAutoRecordResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.UpdateIndividualStreamJobRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.UpdateIndividualStreamJobResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.UpdateMixJobRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.UpdateMixJobResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.UpdateObsBucketAuthorityRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.UpdateObsBucketAuthorityResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.UpdateRecordCallbackRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.UpdateRecordCallbackResponse;
import com.huaweicloud.sdk.cloudrtc.v2.model.UpdateRecordRuleRequest;
import com.huaweicloud.sdk.cloudrtc.v2.model.UpdateRecordRuleResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CloudRTCAsyncClient {

    protected HcClient hcClient;

    public CloudRTCAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudRTCAsyncClient> newBuilder() {
        ClientBuilder<CloudRTCAsyncClient> clientBuilder = new ClientBuilder<>(CloudRTCAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 创建应用
     *
     * 调用此接口创建应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppRequest 请求对象
     * @return CompletableFuture<CreateAppResponse>
     */
    public CompletableFuture<CreateAppResponse> createAppAsync(CreateAppRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.createApp);
    }

    /**
     * 创建应用
     *
     * 调用此接口创建应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppRequest 请求对象
     * @return AsyncInvoker<CreateAppRequest, CreateAppResponse>
     */
    public AsyncInvoker<CreateAppRequest, CreateAppResponse> createAppAsyncInvoker(CreateAppRequest request) {
        return new AsyncInvoker<>(request, CloudRTCMeta.createApp, hcClient);
    }

    /**
     * 启动单流任务
     *
     * 调用此接口接口启动单流任务。
     * 
     * API触发单流录制流名规则：{jobtype}\\_{jobid}\\_{roomid}\\_{userid}
     * 
     * jobtype取值为&#39;s&#39;代表单流录制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIndividualStreamJobRequest 请求对象
     * @return CompletableFuture<CreateIndividualStreamJobResponse>
     */
    public CompletableFuture<CreateIndividualStreamJobResponse> createIndividualStreamJobAsync(
        CreateIndividualStreamJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.createIndividualStreamJob);
    }

    /**
     * 启动单流任务
     *
     * 调用此接口接口启动单流任务。
     * 
     * API触发单流录制流名规则：{jobtype}\\_{jobid}\\_{roomid}\\_{userid}
     * 
     * jobtype取值为&#39;s&#39;代表单流录制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIndividualStreamJobRequest 请求对象
     * @return AsyncInvoker<CreateIndividualStreamJobRequest, CreateIndividualStreamJobResponse>
     */
    public AsyncInvoker<CreateIndividualStreamJobRequest, CreateIndividualStreamJobResponse> createIndividualStreamJobAsyncInvoker(
        CreateIndividualStreamJobRequest request) {
        return new AsyncInvoker<>(request, CloudRTCMeta.createIndividualStreamJob, hcClient);
    }

    /**
     * 启动合流任务
     *
     * 调用此接口创建合流转码任务。
     * 
     * 支持纯音频录制和音视频录制：
     * 
     * - 纯音频录制
     * 
     *   encode_template填audio_only，音频合流会动态选择最大三方的声音。
     * 
     *   layout_template、layout_panes以及其他视频相关参数都不填，填就忽略。
     * 
     * - 音视频录制（包括共享桌面）
     * 
     *   encode_template非audio_only，layout_template、layout_panes必须非空。
     * 
     *   音频合流会动态选择最大三方的声音。
     * 
     *   API触发合流录制流名规则：{jobtype}\\_{jobid}\\_{roomid}，其中jobtype取值为&#39;m&#39;代表合流录制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMixJobRequest 请求对象
     * @return CompletableFuture<CreateMixJobResponse>
     */
    public CompletableFuture<CreateMixJobResponse> createMixJobAsync(CreateMixJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.createMixJob);
    }

    /**
     * 启动合流任务
     *
     * 调用此接口创建合流转码任务。
     * 
     * 支持纯音频录制和音视频录制：
     * 
     * - 纯音频录制
     * 
     *   encode_template填audio_only，音频合流会动态选择最大三方的声音。
     * 
     *   layout_template、layout_panes以及其他视频相关参数都不填，填就忽略。
     * 
     * - 音视频录制（包括共享桌面）
     * 
     *   encode_template非audio_only，layout_template、layout_panes必须非空。
     * 
     *   音频合流会动态选择最大三方的声音。
     * 
     *   API触发合流录制流名规则：{jobtype}\\_{jobid}\\_{roomid}，其中jobtype取值为&#39;m&#39;代表合流录制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMixJobRequest 请求对象
     * @return AsyncInvoker<CreateMixJobRequest, CreateMixJobResponse>
     */
    public AsyncInvoker<CreateMixJobRequest, CreateMixJobResponse> createMixJobAsyncInvoker(
        CreateMixJobRequest request) {
        return new AsyncInvoker<>(request, CloudRTCMeta.createMixJob, hcClient);
    }

    /**
     * 创建或更新录制规则
     *
     * 调用此接口创建或更新录制规则。
     * 
     * - 若当前app在请求的location中无录制规则，则会创建新的录制规则
     * - 若当前app在请求的location中已有录制规则，则会更新原来的录制规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRecordRuleRequest 请求对象
     * @return CompletableFuture<CreateRecordRuleResponse>
     */
    public CompletableFuture<CreateRecordRuleResponse> createRecordRuleAsync(CreateRecordRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.createRecordRule);
    }

    /**
     * 创建或更新录制规则
     *
     * 调用此接口创建或更新录制规则。
     * 
     * - 若当前app在请求的location中无录制规则，则会创建新的录制规则
     * - 若当前app在请求的location中已有录制规则，则会更新原来的录制规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRecordRuleRequest 请求对象
     * @return AsyncInvoker<CreateRecordRuleRequest, CreateRecordRuleResponse>
     */
    public AsyncInvoker<CreateRecordRuleRequest, CreateRecordRuleResponse> createRecordRuleAsyncInvoker(
        CreateRecordRuleRequest request) {
        return new AsyncInvoker<>(request, CloudRTCMeta.createRecordRule, hcClient);
    }

    /**
     * 删除应用
     *
     * 调用此接口删除单个应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppRequest 请求对象
     * @return CompletableFuture<DeleteAppResponse>
     */
    public CompletableFuture<DeleteAppResponse> deleteAppAsync(DeleteAppRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.deleteApp);
    }

    /**
     * 删除应用
     *
     * 调用此接口删除单个应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppRequest 请求对象
     * @return AsyncInvoker<DeleteAppRequest, DeleteAppResponse>
     */
    public AsyncInvoker<DeleteAppRequest, DeleteAppResponse> deleteAppAsyncInvoker(DeleteAppRequest request) {
        return new AsyncInvoker<>(request, CloudRTCMeta.deleteApp, hcClient);
    }

    /**
     * 删除录制规则
     *
     * 调用此接口删除录制规则，对于正在使用的录制规则，不允许删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRecordRuleRequest 请求对象
     * @return CompletableFuture<DeleteRecordRuleResponse>
     */
    public CompletableFuture<DeleteRecordRuleResponse> deleteRecordRuleAsync(DeleteRecordRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.deleteRecordRule);
    }

    /**
     * 删除录制规则
     *
     * 调用此接口删除录制规则，对于正在使用的录制规则，不允许删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRecordRuleRequest 请求对象
     * @return AsyncInvoker<DeleteRecordRuleRequest, DeleteRecordRuleResponse>
     */
    public AsyncInvoker<DeleteRecordRuleRequest, DeleteRecordRuleResponse> deleteRecordRuleAsyncInvoker(
        DeleteRecordRuleRequest request) {
        return new AsyncInvoker<>(request, CloudRTCMeta.deleteRecordRule, hcClient);
    }

    /**
     * 查询应用列表
     *
     * 调用此接口查询应用列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsRequest 请求对象
     * @return CompletableFuture<ListAppsResponse>
     */
    public CompletableFuture<ListAppsResponse> listAppsAsync(ListAppsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.listApps);
    }

    /**
     * 查询应用列表
     *
     * 调用此接口查询应用列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsRequest 请求对象
     * @return AsyncInvoker<ListAppsRequest, ListAppsResponse>
     */
    public AsyncInvoker<ListAppsRequest, ListAppsResponse> listAppsAsyncInvoker(ListAppsRequest request) {
        return new AsyncInvoker<>(request, CloudRTCMeta.listApps, hcClient);
    }

    /**
     * 查询录制规则列表
     *
     * 调用此接口查询录制规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecordRulesRequest 请求对象
     * @return CompletableFuture<ListRecordRulesResponse>
     */
    public CompletableFuture<ListRecordRulesResponse> listRecordRulesAsync(ListRecordRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.listRecordRules);
    }

    /**
     * 查询录制规则列表
     *
     * 调用此接口查询录制规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecordRulesRequest 请求对象
     * @return AsyncInvoker<ListRecordRulesRequest, ListRecordRulesResponse>
     */
    public AsyncInvoker<ListRecordRulesRequest, ListRecordRulesResponse> listRecordRulesAsyncInvoker(
        ListRecordRulesRequest request) {
        return new AsyncInvoker<>(request, CloudRTCMeta.listRecordRules, hcClient);
    }

    /**
     * 解散房间
     *
     * 调用此接口解散房间，将该房间中所有用户踢出房间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveRoomRequest 请求对象
     * @return CompletableFuture<RemoveRoomResponse>
     */
    public CompletableFuture<RemoveRoomResponse> removeRoomAsync(RemoveRoomRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.removeRoom);
    }

    /**
     * 解散房间
     *
     * 调用此接口解散房间，将该房间中所有用户踢出房间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveRoomRequest 请求对象
     * @return AsyncInvoker<RemoveRoomRequest, RemoveRoomResponse>
     */
    public AsyncInvoker<RemoveRoomRequest, RemoveRoomResponse> removeRoomAsyncInvoker(RemoveRoomRequest request) {
        return new AsyncInvoker<>(request, CloudRTCMeta.removeRoom, hcClient);
    }

    /**
     * 踢除在线用户
     *
     * 调用此接口强制用户离开房间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveUsersRequest 请求对象
     * @return CompletableFuture<RemoveUsersResponse>
     */
    public CompletableFuture<RemoveUsersResponse> removeUsersAsync(RemoveUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.removeUsers);
    }

    /**
     * 踢除在线用户
     *
     * 调用此接口强制用户离开房间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveUsersRequest 请求对象
     * @return AsyncInvoker<RemoveUsersRequest, RemoveUsersResponse>
     */
    public AsyncInvoker<RemoveUsersRequest, RemoveUsersResponse> removeUsersAsyncInvoker(RemoveUsersRequest request) {
        return new AsyncInvoker<>(request, CloudRTCMeta.removeUsers, hcClient);
    }

    /**
     * 查询单个应用
     *
     * 调用此接口查询单个应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppRequest 请求对象
     * @return CompletableFuture<ShowAppResponse>
     */
    public CompletableFuture<ShowAppResponse> showAppAsync(ShowAppRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.showApp);
    }

    /**
     * 查询单个应用
     *
     * 调用此接口查询单个应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppRequest 请求对象
     * @return AsyncInvoker<ShowAppRequest, ShowAppResponse>
     */
    public AsyncInvoker<ShowAppRequest, ShowAppResponse> showAppAsyncInvoker(ShowAppRequest request) {
        return new AsyncInvoker<>(request, CloudRTCMeta.showApp, hcClient);
    }

    /**
     * 查询自动录制配置
     *
     * 调用此接口查询自动录制配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoRecordRequest 请求对象
     * @return CompletableFuture<ShowAutoRecordResponse>
     */
    public CompletableFuture<ShowAutoRecordResponse> showAutoRecordAsync(ShowAutoRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.showAutoRecord);
    }

    /**
     * 查询自动录制配置
     *
     * 调用此接口查询自动录制配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoRecordRequest 请求对象
     * @return AsyncInvoker<ShowAutoRecordRequest, ShowAutoRecordResponse>
     */
    public AsyncInvoker<ShowAutoRecordRequest, ShowAutoRecordResponse> showAutoRecordAsyncInvoker(
        ShowAutoRecordRequest request) {
        return new AsyncInvoker<>(request, CloudRTCMeta.showAutoRecord, hcClient);
    }

    /**
     * 查询单流任务状态
     *
     * 调用此接口查询单流任务状态。
     * 
     * 租户的OBS桶内的情况，暂不支持查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIndividualStreamJobRequest 请求对象
     * @return CompletableFuture<ShowIndividualStreamJobResponse>
     */
    public CompletableFuture<ShowIndividualStreamJobResponse> showIndividualStreamJobAsync(
        ShowIndividualStreamJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.showIndividualStreamJob);
    }

    /**
     * 查询单流任务状态
     *
     * 调用此接口查询单流任务状态。
     * 
     * 租户的OBS桶内的情况，暂不支持查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIndividualStreamJobRequest 请求对象
     * @return AsyncInvoker<ShowIndividualStreamJobRequest, ShowIndividualStreamJobResponse>
     */
    public AsyncInvoker<ShowIndividualStreamJobRequest, ShowIndividualStreamJobResponse> showIndividualStreamJobAsyncInvoker(
        ShowIndividualStreamJobRequest request) {
        return new AsyncInvoker<>(request, CloudRTCMeta.showIndividualStreamJob, hcClient);
    }

    /**
     * 查询合流任务
     *
     * 调用此接口查询合流转码任务状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMixJobRequest 请求对象
     * @return CompletableFuture<ShowMixJobResponse>
     */
    public CompletableFuture<ShowMixJobResponse> showMixJobAsync(ShowMixJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.showMixJob);
    }

    /**
     * 查询合流任务
     *
     * 调用此接口查询合流转码任务状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMixJobRequest 请求对象
     * @return AsyncInvoker<ShowMixJobRequest, ShowMixJobResponse>
     */
    public AsyncInvoker<ShowMixJobRequest, ShowMixJobResponse> showMixJobAsyncInvoker(ShowMixJobRequest request) {
        return new AsyncInvoker<>(request, CloudRTCMeta.showMixJob, hcClient);
    }

    /**
     * 查询增值（录制）事件回调配置
     *
     * 调用此接口查询增值（录制）事件回调配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordCallbackRequest 请求对象
     * @return CompletableFuture<ShowRecordCallbackResponse>
     */
    public CompletableFuture<ShowRecordCallbackResponse> showRecordCallbackAsync(ShowRecordCallbackRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.showRecordCallback);
    }

    /**
     * 查询增值（录制）事件回调配置
     *
     * 调用此接口查询增值（录制）事件回调配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordCallbackRequest 请求对象
     * @return AsyncInvoker<ShowRecordCallbackRequest, ShowRecordCallbackResponse>
     */
    public AsyncInvoker<ShowRecordCallbackRequest, ShowRecordCallbackResponse> showRecordCallbackAsyncInvoker(
        ShowRecordCallbackRequest request) {
        return new AsyncInvoker<>(request, CloudRTCMeta.showRecordCallback, hcClient);
    }

    /**
     * 查询录制规则
     *
     * 调用此接口查询指定录制规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordRuleRequest 请求对象
     * @return CompletableFuture<ShowRecordRuleResponse>
     */
    public CompletableFuture<ShowRecordRuleResponse> showRecordRuleAsync(ShowRecordRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.showRecordRule);
    }

    /**
     * 查询录制规则
     *
     * 调用此接口查询指定录制规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordRuleRequest 请求对象
     * @return AsyncInvoker<ShowRecordRuleRequest, ShowRecordRuleResponse>
     */
    public AsyncInvoker<ShowRecordRuleRequest, ShowRecordRuleResponse> showRecordRuleAsyncInvoker(
        ShowRecordRuleRequest request) {
        return new AsyncInvoker<>(request, CloudRTCMeta.showRecordRule, hcClient);
    }

    /**
     * 启用应用
     *
     * 调用此接口启用单个应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartAppRequest 请求对象
     * @return CompletableFuture<StartAppResponse>
     */
    public CompletableFuture<StartAppResponse> startAppAsync(StartAppRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.startApp);
    }

    /**
     * 启用应用
     *
     * 调用此接口启用单个应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartAppRequest 请求对象
     * @return AsyncInvoker<StartAppRequest, StartAppResponse>
     */
    public AsyncInvoker<StartAppRequest, StartAppResponse> startAppAsyncInvoker(StartAppRequest request) {
        return new AsyncInvoker<>(request, CloudRTCMeta.startApp, hcClient);
    }

    /**
     * 停用应用
     *
     * 调用此接口停用单个应用。
     * 
     * 应用停用后，新房间无法新增和加入，已加入的房间可以继续使用。合流、录制功能等也不可用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopAppRequest 请求对象
     * @return CompletableFuture<StopAppResponse>
     */
    public CompletableFuture<StopAppResponse> stopAppAsync(StopAppRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.stopApp);
    }

    /**
     * 停用应用
     *
     * 调用此接口停用单个应用。
     * 
     * 应用停用后，新房间无法新增和加入，已加入的房间可以继续使用。合流、录制功能等也不可用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopAppRequest 请求对象
     * @return AsyncInvoker<StopAppRequest, StopAppResponse>
     */
    public AsyncInvoker<StopAppRequest, StopAppResponse> stopAppAsyncInvoker(StopAppRequest request) {
        return new AsyncInvoker<>(request, CloudRTCMeta.stopApp, hcClient);
    }

    /**
     * 停止单流任务
     *
     * 调用此接口停止单流任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopIndividualStreamJobRequest 请求对象
     * @return CompletableFuture<StopIndividualStreamJobResponse>
     */
    public CompletableFuture<StopIndividualStreamJobResponse> stopIndividualStreamJobAsync(
        StopIndividualStreamJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.stopIndividualStreamJob);
    }

    /**
     * 停止单流任务
     *
     * 调用此接口停止单流任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopIndividualStreamJobRequest 请求对象
     * @return AsyncInvoker<StopIndividualStreamJobRequest, StopIndividualStreamJobResponse>
     */
    public AsyncInvoker<StopIndividualStreamJobRequest, StopIndividualStreamJobResponse> stopIndividualStreamJobAsyncInvoker(
        StopIndividualStreamJobRequest request) {
        return new AsyncInvoker<>(request, CloudRTCMeta.stopIndividualStreamJob, hcClient);
    }

    /**
     * 停止合流任务
     *
     * 调用此接口停止已下发的合流转码任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopMixJobRequest 请求对象
     * @return CompletableFuture<StopMixJobResponse>
     */
    public CompletableFuture<StopMixJobResponse> stopMixJobAsync(StopMixJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.stopMixJob);
    }

    /**
     * 停止合流任务
     *
     * 调用此接口停止已下发的合流转码任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopMixJobRequest 请求对象
     * @return AsyncInvoker<StopMixJobRequest, StopMixJobResponse>
     */
    public AsyncInvoker<StopMixJobRequest, StopMixJobResponse> stopMixJobAsyncInvoker(StopMixJobRequest request) {
        return new AsyncInvoker<>(request, CloudRTCMeta.stopMixJob, hcClient);
    }

    /**
     * 更新自动录制配置
     *
     * 更新自动录制配置，租户可以开启自动单流录制或者停用自动单流录制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAutoRecordRequest 请求对象
     * @return CompletableFuture<UpdateAutoRecordResponse>
     */
    public CompletableFuture<UpdateAutoRecordResponse> updateAutoRecordAsync(UpdateAutoRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.updateAutoRecord);
    }

    /**
     * 更新自动录制配置
     *
     * 更新自动录制配置，租户可以开启自动单流录制或者停用自动单流录制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAutoRecordRequest 请求对象
     * @return AsyncInvoker<UpdateAutoRecordRequest, UpdateAutoRecordResponse>
     */
    public AsyncInvoker<UpdateAutoRecordRequest, UpdateAutoRecordResponse> updateAutoRecordAsyncInvoker(
        UpdateAutoRecordRequest request) {
        return new AsyncInvoker<>(request, CloudRTCMeta.updateAutoRecord, hcClient);
    }

    /**
     * 更新单流任务
     *
     * 调用此接口修改单流任务。
     * 
     * 仅部分场景支持修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIndividualStreamJobRequest 请求对象
     * @return CompletableFuture<UpdateIndividualStreamJobResponse>
     */
    public CompletableFuture<UpdateIndividualStreamJobResponse> updateIndividualStreamJobAsync(
        UpdateIndividualStreamJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.updateIndividualStreamJob);
    }

    /**
     * 更新单流任务
     *
     * 调用此接口修改单流任务。
     * 
     * 仅部分场景支持修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIndividualStreamJobRequest 请求对象
     * @return AsyncInvoker<UpdateIndividualStreamJobRequest, UpdateIndividualStreamJobResponse>
     */
    public AsyncInvoker<UpdateIndividualStreamJobRequest, UpdateIndividualStreamJobResponse> updateIndividualStreamJobAsyncInvoker(
        UpdateIndividualStreamJobRequest request) {
        return new AsyncInvoker<>(request, CloudRTCMeta.updateIndividualStreamJob, hcClient);
    }

    /**
     * 修改合流任务
     *
     * 调用此接口更新合流任务布局。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMixJobRequest 请求对象
     * @return CompletableFuture<UpdateMixJobResponse>
     */
    public CompletableFuture<UpdateMixJobResponse> updateMixJobAsync(UpdateMixJobRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.updateMixJob);
    }

    /**
     * 修改合流任务
     *
     * 调用此接口更新合流任务布局。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMixJobRequest 请求对象
     * @return AsyncInvoker<UpdateMixJobRequest, UpdateMixJobResponse>
     */
    public AsyncInvoker<UpdateMixJobRequest, UpdateMixJobResponse> updateMixJobAsyncInvoker(
        UpdateMixJobRequest request) {
        return new AsyncInvoker<>(request, CloudRTCMeta.updateMixJob, hcClient);
    }

    /**
     * 配置RTC增值（录制）事件回调
     *
     * 调用此接口配置增值（录制）事件上报回调。
     * 
     * 当任务发生订阅了的事件时，通过该接口配置的回调地址通知。
     * 
     * 回调格式参考/customer-record-notify-url定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecordCallbackRequest 请求对象
     * @return CompletableFuture<UpdateRecordCallbackResponse>
     */
    public CompletableFuture<UpdateRecordCallbackResponse> updateRecordCallbackAsync(
        UpdateRecordCallbackRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.updateRecordCallback);
    }

    /**
     * 配置RTC增值（录制）事件回调
     *
     * 调用此接口配置增值（录制）事件上报回调。
     * 
     * 当任务发生订阅了的事件时，通过该接口配置的回调地址通知。
     * 
     * 回调格式参考/customer-record-notify-url定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecordCallbackRequest 请求对象
     * @return AsyncInvoker<UpdateRecordCallbackRequest, UpdateRecordCallbackResponse>
     */
    public AsyncInvoker<UpdateRecordCallbackRequest, UpdateRecordCallbackResponse> updateRecordCallbackAsyncInvoker(
        UpdateRecordCallbackRequest request) {
        return new AsyncInvoker<>(request, CloudRTCMeta.updateRecordCallback, hcClient);
    }

    /**
     * 更新录制规则
     *
     * 调用此接口更新录制规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecordRuleRequest 请求对象
     * @return CompletableFuture<UpdateRecordRuleResponse>
     */
    public CompletableFuture<UpdateRecordRuleResponse> updateRecordRuleAsync(UpdateRecordRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.updateRecordRule);
    }

    /**
     * 更新录制规则
     *
     * 调用此接口更新录制规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecordRuleRequest 请求对象
     * @return AsyncInvoker<UpdateRecordRuleRequest, UpdateRecordRuleResponse>
     */
    public AsyncInvoker<UpdateRecordRuleRequest, UpdateRecordRuleResponse> updateRecordRuleAsyncInvoker(
        UpdateRecordRuleRequest request) {
        return new AsyncInvoker<>(request, CloudRTCMeta.updateRecordRule, hcClient);
    }

    /**
     * 查询OBS桶下对象列表
     *
     * 查询OBS桶下对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListObsBucketObjectsRequest 请求对象
     * @return CompletableFuture<ListObsBucketObjectsResponse>
     */
    public CompletableFuture<ListObsBucketObjectsResponse> listObsBucketObjectsAsync(
        ListObsBucketObjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.listObsBucketObjects);
    }

    /**
     * 查询OBS桶下对象列表
     *
     * 查询OBS桶下对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListObsBucketObjectsRequest 请求对象
     * @return AsyncInvoker<ListObsBucketObjectsRequest, ListObsBucketObjectsResponse>
     */
    public AsyncInvoker<ListObsBucketObjectsRequest, ListObsBucketObjectsResponse> listObsBucketObjectsAsyncInvoker(
        ListObsBucketObjectsRequest request) {
        return new AsyncInvoker<>(request, CloudRTCMeta.listObsBucketObjects, hcClient);
    }

    /**
     * 查询OBS桶列表
     *
     * 查询OBS桶列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListObsBucketsRequest 请求对象
     * @return CompletableFuture<ListObsBucketsResponse>
     */
    public CompletableFuture<ListObsBucketsResponse> listObsBucketsAsync(ListObsBucketsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.listObsBuckets);
    }

    /**
     * 查询OBS桶列表
     *
     * 查询OBS桶列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListObsBucketsRequest 请求对象
     * @return AsyncInvoker<ListObsBucketsRequest, ListObsBucketsResponse>
     */
    public AsyncInvoker<ListObsBucketsRequest, ListObsBucketsResponse> listObsBucketsAsyncInvoker(
        ListObsBucketsRequest request) {
        return new AsyncInvoker<>(request, CloudRTCMeta.listObsBuckets, hcClient);
    }

    /**
     * OBS桶授权及取消授权
     *
     * OBS桶授权及取消授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateObsBucketAuthorityRequest 请求对象
     * @return CompletableFuture<UpdateObsBucketAuthorityResponse>
     */
    public CompletableFuture<UpdateObsBucketAuthorityResponse> updateObsBucketAuthorityAsync(
        UpdateObsBucketAuthorityRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudRTCMeta.updateObsBucketAuthority);
    }

    /**
     * OBS桶授权及取消授权
     *
     * OBS桶授权及取消授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateObsBucketAuthorityRequest 请求对象
     * @return AsyncInvoker<UpdateObsBucketAuthorityRequest, UpdateObsBucketAuthorityResponse>
     */
    public AsyncInvoker<UpdateObsBucketAuthorityRequest, UpdateObsBucketAuthorityResponse> updateObsBucketAuthorityAsyncInvoker(
        UpdateObsBucketAuthorityRequest request) {
        return new AsyncInvoker<>(request, CloudRTCMeta.updateObsBucketAuthority, hcClient);
    }

}

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
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CloudRTCClient {

    protected HcClient hcClient;

    public CloudRTCClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudRTCClient> newBuilder() {
        ClientBuilder<CloudRTCClient> clientBuilder = new ClientBuilder<>(CloudRTCClient::new);
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
     * @return CreateAppResponse
     */
    public CreateAppResponse createApp(CreateAppRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.createApp);
    }

    /**
     * 创建应用
     *
     * 调用此接口创建应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAppRequest 请求对象
     * @return SyncInvoker<CreateAppRequest, CreateAppResponse>
     */
    public SyncInvoker<CreateAppRequest, CreateAppResponse> createAppInvoker(CreateAppRequest request) {
        return new SyncInvoker<>(request, CloudRTCMeta.createApp, hcClient);
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
     * @return CreateIndividualStreamJobResponse
     */
    public CreateIndividualStreamJobResponse createIndividualStreamJob(CreateIndividualStreamJobRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.createIndividualStreamJob);
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
     * @return SyncInvoker<CreateIndividualStreamJobRequest, CreateIndividualStreamJobResponse>
     */
    public SyncInvoker<CreateIndividualStreamJobRequest, CreateIndividualStreamJobResponse> createIndividualStreamJobInvoker(
        CreateIndividualStreamJobRequest request) {
        return new SyncInvoker<>(request, CloudRTCMeta.createIndividualStreamJob, hcClient);
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
     * @return CreateMixJobResponse
     */
    public CreateMixJobResponse createMixJob(CreateMixJobRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.createMixJob);
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
     * @return SyncInvoker<CreateMixJobRequest, CreateMixJobResponse>
     */
    public SyncInvoker<CreateMixJobRequest, CreateMixJobResponse> createMixJobInvoker(CreateMixJobRequest request) {
        return new SyncInvoker<>(request, CloudRTCMeta.createMixJob, hcClient);
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
     * @return CreateRecordRuleResponse
     */
    public CreateRecordRuleResponse createRecordRule(CreateRecordRuleRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.createRecordRule);
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
     * @return SyncInvoker<CreateRecordRuleRequest, CreateRecordRuleResponse>
     */
    public SyncInvoker<CreateRecordRuleRequest, CreateRecordRuleResponse> createRecordRuleInvoker(
        CreateRecordRuleRequest request) {
        return new SyncInvoker<>(request, CloudRTCMeta.createRecordRule, hcClient);
    }

    /**
     * 删除应用
     *
     * 调用此接口删除单个应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppRequest 请求对象
     * @return DeleteAppResponse
     */
    public DeleteAppResponse deleteApp(DeleteAppRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.deleteApp);
    }

    /**
     * 删除应用
     *
     * 调用此接口删除单个应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppRequest 请求对象
     * @return SyncInvoker<DeleteAppRequest, DeleteAppResponse>
     */
    public SyncInvoker<DeleteAppRequest, DeleteAppResponse> deleteAppInvoker(DeleteAppRequest request) {
        return new SyncInvoker<>(request, CloudRTCMeta.deleteApp, hcClient);
    }

    /**
     * 删除录制规则
     *
     * 调用此接口删除录制规则，对于正在使用的录制规则，不允许删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRecordRuleRequest 请求对象
     * @return DeleteRecordRuleResponse
     */
    public DeleteRecordRuleResponse deleteRecordRule(DeleteRecordRuleRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.deleteRecordRule);
    }

    /**
     * 删除录制规则
     *
     * 调用此接口删除录制规则，对于正在使用的录制规则，不允许删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRecordRuleRequest 请求对象
     * @return SyncInvoker<DeleteRecordRuleRequest, DeleteRecordRuleResponse>
     */
    public SyncInvoker<DeleteRecordRuleRequest, DeleteRecordRuleResponse> deleteRecordRuleInvoker(
        DeleteRecordRuleRequest request) {
        return new SyncInvoker<>(request, CloudRTCMeta.deleteRecordRule, hcClient);
    }

    /**
     * 查询应用列表
     *
     * 调用此接口查询应用列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsRequest 请求对象
     * @return ListAppsResponse
     */
    public ListAppsResponse listApps(ListAppsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.listApps);
    }

    /**
     * 查询应用列表
     *
     * 调用此接口查询应用列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsRequest 请求对象
     * @return SyncInvoker<ListAppsRequest, ListAppsResponse>
     */
    public SyncInvoker<ListAppsRequest, ListAppsResponse> listAppsInvoker(ListAppsRequest request) {
        return new SyncInvoker<>(request, CloudRTCMeta.listApps, hcClient);
    }

    /**
     * 查询录制规则列表
     *
     * 调用此接口查询录制规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecordRulesRequest 请求对象
     * @return ListRecordRulesResponse
     */
    public ListRecordRulesResponse listRecordRules(ListRecordRulesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.listRecordRules);
    }

    /**
     * 查询录制规则列表
     *
     * 调用此接口查询录制规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecordRulesRequest 请求对象
     * @return SyncInvoker<ListRecordRulesRequest, ListRecordRulesResponse>
     */
    public SyncInvoker<ListRecordRulesRequest, ListRecordRulesResponse> listRecordRulesInvoker(
        ListRecordRulesRequest request) {
        return new SyncInvoker<>(request, CloudRTCMeta.listRecordRules, hcClient);
    }

    /**
     * 解散房间
     *
     * 调用此接口解散房间，将该房间中所有用户踢出房间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveRoomRequest 请求对象
     * @return RemoveRoomResponse
     */
    public RemoveRoomResponse removeRoom(RemoveRoomRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.removeRoom);
    }

    /**
     * 解散房间
     *
     * 调用此接口解散房间，将该房间中所有用户踢出房间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveRoomRequest 请求对象
     * @return SyncInvoker<RemoveRoomRequest, RemoveRoomResponse>
     */
    public SyncInvoker<RemoveRoomRequest, RemoveRoomResponse> removeRoomInvoker(RemoveRoomRequest request) {
        return new SyncInvoker<>(request, CloudRTCMeta.removeRoom, hcClient);
    }

    /**
     * 踢除在线用户
     *
     * 调用此接口强制用户离开房间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveUsersRequest 请求对象
     * @return RemoveUsersResponse
     */
    public RemoveUsersResponse removeUsers(RemoveUsersRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.removeUsers);
    }

    /**
     * 踢除在线用户
     *
     * 调用此接口强制用户离开房间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveUsersRequest 请求对象
     * @return SyncInvoker<RemoveUsersRequest, RemoveUsersResponse>
     */
    public SyncInvoker<RemoveUsersRequest, RemoveUsersResponse> removeUsersInvoker(RemoveUsersRequest request) {
        return new SyncInvoker<>(request, CloudRTCMeta.removeUsers, hcClient);
    }

    /**
     * 查询单个应用
     *
     * 调用此接口查询单个应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppRequest 请求对象
     * @return ShowAppResponse
     */
    public ShowAppResponse showApp(ShowAppRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.showApp);
    }

    /**
     * 查询单个应用
     *
     * 调用此接口查询单个应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppRequest 请求对象
     * @return SyncInvoker<ShowAppRequest, ShowAppResponse>
     */
    public SyncInvoker<ShowAppRequest, ShowAppResponse> showAppInvoker(ShowAppRequest request) {
        return new SyncInvoker<>(request, CloudRTCMeta.showApp, hcClient);
    }

    /**
     * 查询自动录制配置
     *
     * 调用此接口查询自动录制配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoRecordRequest 请求对象
     * @return ShowAutoRecordResponse
     */
    public ShowAutoRecordResponse showAutoRecord(ShowAutoRecordRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.showAutoRecord);
    }

    /**
     * 查询自动录制配置
     *
     * 调用此接口查询自动录制配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoRecordRequest 请求对象
     * @return SyncInvoker<ShowAutoRecordRequest, ShowAutoRecordResponse>
     */
    public SyncInvoker<ShowAutoRecordRequest, ShowAutoRecordResponse> showAutoRecordInvoker(
        ShowAutoRecordRequest request) {
        return new SyncInvoker<>(request, CloudRTCMeta.showAutoRecord, hcClient);
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
     * @return ShowIndividualStreamJobResponse
     */
    public ShowIndividualStreamJobResponse showIndividualStreamJob(ShowIndividualStreamJobRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.showIndividualStreamJob);
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
     * @return SyncInvoker<ShowIndividualStreamJobRequest, ShowIndividualStreamJobResponse>
     */
    public SyncInvoker<ShowIndividualStreamJobRequest, ShowIndividualStreamJobResponse> showIndividualStreamJobInvoker(
        ShowIndividualStreamJobRequest request) {
        return new SyncInvoker<>(request, CloudRTCMeta.showIndividualStreamJob, hcClient);
    }

    /**
     * 查询合流任务
     *
     * 调用此接口查询合流转码任务状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMixJobRequest 请求对象
     * @return ShowMixJobResponse
     */
    public ShowMixJobResponse showMixJob(ShowMixJobRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.showMixJob);
    }

    /**
     * 查询合流任务
     *
     * 调用此接口查询合流转码任务状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMixJobRequest 请求对象
     * @return SyncInvoker<ShowMixJobRequest, ShowMixJobResponse>
     */
    public SyncInvoker<ShowMixJobRequest, ShowMixJobResponse> showMixJobInvoker(ShowMixJobRequest request) {
        return new SyncInvoker<>(request, CloudRTCMeta.showMixJob, hcClient);
    }

    /**
     * 查询增值（录制）事件回调配置
     *
     * 调用此接口查询增值（录制）事件回调配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordCallbackRequest 请求对象
     * @return ShowRecordCallbackResponse
     */
    public ShowRecordCallbackResponse showRecordCallback(ShowRecordCallbackRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.showRecordCallback);
    }

    /**
     * 查询增值（录制）事件回调配置
     *
     * 调用此接口查询增值（录制）事件回调配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordCallbackRequest 请求对象
     * @return SyncInvoker<ShowRecordCallbackRequest, ShowRecordCallbackResponse>
     */
    public SyncInvoker<ShowRecordCallbackRequest, ShowRecordCallbackResponse> showRecordCallbackInvoker(
        ShowRecordCallbackRequest request) {
        return new SyncInvoker<>(request, CloudRTCMeta.showRecordCallback, hcClient);
    }

    /**
     * 查询录制规则
     *
     * 调用此接口查询指定录制规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordRuleRequest 请求对象
     * @return ShowRecordRuleResponse
     */
    public ShowRecordRuleResponse showRecordRule(ShowRecordRuleRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.showRecordRule);
    }

    /**
     * 查询录制规则
     *
     * 调用此接口查询指定录制规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordRuleRequest 请求对象
     * @return SyncInvoker<ShowRecordRuleRequest, ShowRecordRuleResponse>
     */
    public SyncInvoker<ShowRecordRuleRequest, ShowRecordRuleResponse> showRecordRuleInvoker(
        ShowRecordRuleRequest request) {
        return new SyncInvoker<>(request, CloudRTCMeta.showRecordRule, hcClient);
    }

    /**
     * 启用应用
     *
     * 调用此接口启用单个应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartAppRequest 请求对象
     * @return StartAppResponse
     */
    public StartAppResponse startApp(StartAppRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.startApp);
    }

    /**
     * 启用应用
     *
     * 调用此接口启用单个应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartAppRequest 请求对象
     * @return SyncInvoker<StartAppRequest, StartAppResponse>
     */
    public SyncInvoker<StartAppRequest, StartAppResponse> startAppInvoker(StartAppRequest request) {
        return new SyncInvoker<>(request, CloudRTCMeta.startApp, hcClient);
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
     * @return StopAppResponse
     */
    public StopAppResponse stopApp(StopAppRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.stopApp);
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
     * @return SyncInvoker<StopAppRequest, StopAppResponse>
     */
    public SyncInvoker<StopAppRequest, StopAppResponse> stopAppInvoker(StopAppRequest request) {
        return new SyncInvoker<>(request, CloudRTCMeta.stopApp, hcClient);
    }

    /**
     * 停止单流任务
     *
     * 调用此接口停止单流任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopIndividualStreamJobRequest 请求对象
     * @return StopIndividualStreamJobResponse
     */
    public StopIndividualStreamJobResponse stopIndividualStreamJob(StopIndividualStreamJobRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.stopIndividualStreamJob);
    }

    /**
     * 停止单流任务
     *
     * 调用此接口停止单流任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopIndividualStreamJobRequest 请求对象
     * @return SyncInvoker<StopIndividualStreamJobRequest, StopIndividualStreamJobResponse>
     */
    public SyncInvoker<StopIndividualStreamJobRequest, StopIndividualStreamJobResponse> stopIndividualStreamJobInvoker(
        StopIndividualStreamJobRequest request) {
        return new SyncInvoker<>(request, CloudRTCMeta.stopIndividualStreamJob, hcClient);
    }

    /**
     * 停止合流任务
     *
     * 调用此接口停止已下发的合流转码任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopMixJobRequest 请求对象
     * @return StopMixJobResponse
     */
    public StopMixJobResponse stopMixJob(StopMixJobRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.stopMixJob);
    }

    /**
     * 停止合流任务
     *
     * 调用此接口停止已下发的合流转码任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopMixJobRequest 请求对象
     * @return SyncInvoker<StopMixJobRequest, StopMixJobResponse>
     */
    public SyncInvoker<StopMixJobRequest, StopMixJobResponse> stopMixJobInvoker(StopMixJobRequest request) {
        return new SyncInvoker<>(request, CloudRTCMeta.stopMixJob, hcClient);
    }

    /**
     * 更新自动录制配置
     *
     * 更新自动录制配置，租户可以开启自动单流录制或者停用自动单流录制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAutoRecordRequest 请求对象
     * @return UpdateAutoRecordResponse
     */
    public UpdateAutoRecordResponse updateAutoRecord(UpdateAutoRecordRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.updateAutoRecord);
    }

    /**
     * 更新自动录制配置
     *
     * 更新自动录制配置，租户可以开启自动单流录制或者停用自动单流录制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAutoRecordRequest 请求对象
     * @return SyncInvoker<UpdateAutoRecordRequest, UpdateAutoRecordResponse>
     */
    public SyncInvoker<UpdateAutoRecordRequest, UpdateAutoRecordResponse> updateAutoRecordInvoker(
        UpdateAutoRecordRequest request) {
        return new SyncInvoker<>(request, CloudRTCMeta.updateAutoRecord, hcClient);
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
     * @return UpdateIndividualStreamJobResponse
     */
    public UpdateIndividualStreamJobResponse updateIndividualStreamJob(UpdateIndividualStreamJobRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.updateIndividualStreamJob);
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
     * @return SyncInvoker<UpdateIndividualStreamJobRequest, UpdateIndividualStreamJobResponse>
     */
    public SyncInvoker<UpdateIndividualStreamJobRequest, UpdateIndividualStreamJobResponse> updateIndividualStreamJobInvoker(
        UpdateIndividualStreamJobRequest request) {
        return new SyncInvoker<>(request, CloudRTCMeta.updateIndividualStreamJob, hcClient);
    }

    /**
     * 修改合流任务
     *
     * 调用此接口更新合流任务布局。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMixJobRequest 请求对象
     * @return UpdateMixJobResponse
     */
    public UpdateMixJobResponse updateMixJob(UpdateMixJobRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.updateMixJob);
    }

    /**
     * 修改合流任务
     *
     * 调用此接口更新合流任务布局。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMixJobRequest 请求对象
     * @return SyncInvoker<UpdateMixJobRequest, UpdateMixJobResponse>
     */
    public SyncInvoker<UpdateMixJobRequest, UpdateMixJobResponse> updateMixJobInvoker(UpdateMixJobRequest request) {
        return new SyncInvoker<>(request, CloudRTCMeta.updateMixJob, hcClient);
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
     * @return UpdateRecordCallbackResponse
     */
    public UpdateRecordCallbackResponse updateRecordCallback(UpdateRecordCallbackRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.updateRecordCallback);
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
     * @return SyncInvoker<UpdateRecordCallbackRequest, UpdateRecordCallbackResponse>
     */
    public SyncInvoker<UpdateRecordCallbackRequest, UpdateRecordCallbackResponse> updateRecordCallbackInvoker(
        UpdateRecordCallbackRequest request) {
        return new SyncInvoker<>(request, CloudRTCMeta.updateRecordCallback, hcClient);
    }

    /**
     * 更新录制规则
     *
     * 调用此接口更新录制规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecordRuleRequest 请求对象
     * @return UpdateRecordRuleResponse
     */
    public UpdateRecordRuleResponse updateRecordRule(UpdateRecordRuleRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.updateRecordRule);
    }

    /**
     * 更新录制规则
     *
     * 调用此接口更新录制规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecordRuleRequest 请求对象
     * @return SyncInvoker<UpdateRecordRuleRequest, UpdateRecordRuleResponse>
     */
    public SyncInvoker<UpdateRecordRuleRequest, UpdateRecordRuleResponse> updateRecordRuleInvoker(
        UpdateRecordRuleRequest request) {
        return new SyncInvoker<>(request, CloudRTCMeta.updateRecordRule, hcClient);
    }

    /**
     * 查询OBS桶下对象列表
     *
     * 查询OBS桶下对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListObsBucketObjectsRequest 请求对象
     * @return ListObsBucketObjectsResponse
     */
    public ListObsBucketObjectsResponse listObsBucketObjects(ListObsBucketObjectsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.listObsBucketObjects);
    }

    /**
     * 查询OBS桶下对象列表
     *
     * 查询OBS桶下对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListObsBucketObjectsRequest 请求对象
     * @return SyncInvoker<ListObsBucketObjectsRequest, ListObsBucketObjectsResponse>
     */
    public SyncInvoker<ListObsBucketObjectsRequest, ListObsBucketObjectsResponse> listObsBucketObjectsInvoker(
        ListObsBucketObjectsRequest request) {
        return new SyncInvoker<>(request, CloudRTCMeta.listObsBucketObjects, hcClient);
    }

    /**
     * 查询OBS桶列表
     *
     * 查询OBS桶列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListObsBucketsRequest 请求对象
     * @return ListObsBucketsResponse
     */
    public ListObsBucketsResponse listObsBuckets(ListObsBucketsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.listObsBuckets);
    }

    /**
     * 查询OBS桶列表
     *
     * 查询OBS桶列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListObsBucketsRequest 请求对象
     * @return SyncInvoker<ListObsBucketsRequest, ListObsBucketsResponse>
     */
    public SyncInvoker<ListObsBucketsRequest, ListObsBucketsResponse> listObsBucketsInvoker(
        ListObsBucketsRequest request) {
        return new SyncInvoker<>(request, CloudRTCMeta.listObsBuckets, hcClient);
    }

    /**
     * OBS桶授权及取消授权
     *
     * OBS桶授权及取消授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateObsBucketAuthorityRequest 请求对象
     * @return UpdateObsBucketAuthorityResponse
     */
    public UpdateObsBucketAuthorityResponse updateObsBucketAuthority(UpdateObsBucketAuthorityRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.updateObsBucketAuthority);
    }

    /**
     * OBS桶授权及取消授权
     *
     * OBS桶授权及取消授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateObsBucketAuthorityRequest 请求对象
     * @return SyncInvoker<UpdateObsBucketAuthorityRequest, UpdateObsBucketAuthorityResponse>
     */
    public SyncInvoker<UpdateObsBucketAuthorityRequest, UpdateObsBucketAuthorityResponse> updateObsBucketAuthorityInvoker(
        UpdateObsBucketAuthorityRequest request) {
        return new SyncInvoker<>(request, CloudRTCMeta.updateObsBucketAuthority, hcClient);
    }

}

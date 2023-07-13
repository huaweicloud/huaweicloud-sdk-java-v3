package com.huaweicloud.sdk.cloudrtc.v2;

import com.huaweicloud.sdk.cloudrtc.v2.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CloudRTCClient {

    protected HcClient hcClient;

    public CloudRTCClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudRTCClient> newBuilder() {
        return new ClientBuilder<>(CloudRTCClient::new);
    }

    /**
     * 创建应用
     *
     * 调用此接口创建应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppRequest 请求对象
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
     * @param CreateAppRequest 请求对象
     * @return SyncInvoker<CreateAppRequest, CreateAppResponse>
     */
    public SyncInvoker<CreateAppRequest, CreateAppResponse> createAppInvoker(CreateAppRequest request) {
        return new SyncInvoker<CreateAppRequest, CreateAppResponse>(request, CloudRTCMeta.createApp, hcClient);
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
     * @param CreateIndividualStreamJobRequest 请求对象
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
     * @param CreateIndividualStreamJobRequest 请求对象
     * @return SyncInvoker<CreateIndividualStreamJobRequest, CreateIndividualStreamJobResponse>
     */
    public SyncInvoker<CreateIndividualStreamJobRequest, CreateIndividualStreamJobResponse> createIndividualStreamJobInvoker(
        CreateIndividualStreamJobRequest request) {
        return new SyncInvoker<CreateIndividualStreamJobRequest, CreateIndividualStreamJobResponse>(request,
            CloudRTCMeta.createIndividualStreamJob, hcClient);
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
     * @param CreateMixJobRequest 请求对象
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
     * @param CreateMixJobRequest 请求对象
     * @return SyncInvoker<CreateMixJobRequest, CreateMixJobResponse>
     */
    public SyncInvoker<CreateMixJobRequest, CreateMixJobResponse> createMixJobInvoker(CreateMixJobRequest request) {
        return new SyncInvoker<CreateMixJobRequest, CreateMixJobResponse>(request, CloudRTCMeta.createMixJob, hcClient);
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
     * @param CreateRecordRuleRequest 请求对象
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
     * @param CreateRecordRuleRequest 请求对象
     * @return SyncInvoker<CreateRecordRuleRequest, CreateRecordRuleResponse>
     */
    public SyncInvoker<CreateRecordRuleRequest, CreateRecordRuleResponse> createRecordRuleInvoker(
        CreateRecordRuleRequest request) {
        return new SyncInvoker<CreateRecordRuleRequest, CreateRecordRuleResponse>(request,
            CloudRTCMeta.createRecordRule, hcClient);
    }

    /**
     * 删除应用
     *
     * 调用此接口删除单个应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAppRequest 请求对象
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
     * @param DeleteAppRequest 请求对象
     * @return SyncInvoker<DeleteAppRequest, DeleteAppResponse>
     */
    public SyncInvoker<DeleteAppRequest, DeleteAppResponse> deleteAppInvoker(DeleteAppRequest request) {
        return new SyncInvoker<DeleteAppRequest, DeleteAppResponse>(request, CloudRTCMeta.deleteApp, hcClient);
    }

    /**
     * 删除录制规则
     *
     * 调用此接口删除录制规则，对于正在使用的录制规则，不允许删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRecordRuleRequest 请求对象
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
     * @param DeleteRecordRuleRequest 请求对象
     * @return SyncInvoker<DeleteRecordRuleRequest, DeleteRecordRuleResponse>
     */
    public SyncInvoker<DeleteRecordRuleRequest, DeleteRecordRuleResponse> deleteRecordRuleInvoker(
        DeleteRecordRuleRequest request) {
        return new SyncInvoker<DeleteRecordRuleRequest, DeleteRecordRuleResponse>(request,
            CloudRTCMeta.deleteRecordRule, hcClient);
    }

    /**
     * 查询应用列表
     *
     * 调用此接口查询应用列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppsRequest 请求对象
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
     * @param ListAppsRequest 请求对象
     * @return SyncInvoker<ListAppsRequest, ListAppsResponse>
     */
    public SyncInvoker<ListAppsRequest, ListAppsResponse> listAppsInvoker(ListAppsRequest request) {
        return new SyncInvoker<ListAppsRequest, ListAppsResponse>(request, CloudRTCMeta.listApps, hcClient);
    }

    /**
     * 查询录制规则列表
     *
     * 调用此接口查询录制规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRecordRulesRequest 请求对象
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
     * @param ListRecordRulesRequest 请求对象
     * @return SyncInvoker<ListRecordRulesRequest, ListRecordRulesResponse>
     */
    public SyncInvoker<ListRecordRulesRequest, ListRecordRulesResponse> listRecordRulesInvoker(
        ListRecordRulesRequest request) {
        return new SyncInvoker<ListRecordRulesRequest, ListRecordRulesResponse>(request, CloudRTCMeta.listRecordRules,
            hcClient);
    }

    /**
     * 解散房间
     *
     * 调用此接口解散房间，将该房间中所有用户踢出房间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RemoveRoomRequest 请求对象
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
     * @param RemoveRoomRequest 请求对象
     * @return SyncInvoker<RemoveRoomRequest, RemoveRoomResponse>
     */
    public SyncInvoker<RemoveRoomRequest, RemoveRoomResponse> removeRoomInvoker(RemoveRoomRequest request) {
        return new SyncInvoker<RemoveRoomRequest, RemoveRoomResponse>(request, CloudRTCMeta.removeRoom, hcClient);
    }

    /**
     * 踢除在线用户
     *
     * 调用此接口强制用户离开房间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RemoveUsersRequest 请求对象
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
     * @param RemoveUsersRequest 请求对象
     * @return SyncInvoker<RemoveUsersRequest, RemoveUsersResponse>
     */
    public SyncInvoker<RemoveUsersRequest, RemoveUsersResponse> removeUsersInvoker(RemoveUsersRequest request) {
        return new SyncInvoker<RemoveUsersRequest, RemoveUsersResponse>(request, CloudRTCMeta.removeUsers, hcClient);
    }

    /**
     * 查询单个应用
     *
     * 调用此接口查询单个应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppRequest 请求对象
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
     * @param ShowAppRequest 请求对象
     * @return SyncInvoker<ShowAppRequest, ShowAppResponse>
     */
    public SyncInvoker<ShowAppRequest, ShowAppResponse> showAppInvoker(ShowAppRequest request) {
        return new SyncInvoker<ShowAppRequest, ShowAppResponse>(request, CloudRTCMeta.showApp, hcClient);
    }

    /**
     * 查询自动录制配置
     *
     * 调用此接口查询自动录制配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAutoRecordRequest 请求对象
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
     * @param ShowAutoRecordRequest 请求对象
     * @return SyncInvoker<ShowAutoRecordRequest, ShowAutoRecordResponse>
     */
    public SyncInvoker<ShowAutoRecordRequest, ShowAutoRecordResponse> showAutoRecordInvoker(
        ShowAutoRecordRequest request) {
        return new SyncInvoker<ShowAutoRecordRequest, ShowAutoRecordResponse>(request, CloudRTCMeta.showAutoRecord,
            hcClient);
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
     * @param ShowIndividualStreamJobRequest 请求对象
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
     * @param ShowIndividualStreamJobRequest 请求对象
     * @return SyncInvoker<ShowIndividualStreamJobRequest, ShowIndividualStreamJobResponse>
     */
    public SyncInvoker<ShowIndividualStreamJobRequest, ShowIndividualStreamJobResponse> showIndividualStreamJobInvoker(
        ShowIndividualStreamJobRequest request) {
        return new SyncInvoker<ShowIndividualStreamJobRequest, ShowIndividualStreamJobResponse>(request,
            CloudRTCMeta.showIndividualStreamJob, hcClient);
    }

    /**
     * 查询合流任务
     *
     * 调用此接口查询合流转码任务状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMixJobRequest 请求对象
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
     * @param ShowMixJobRequest 请求对象
     * @return SyncInvoker<ShowMixJobRequest, ShowMixJobResponse>
     */
    public SyncInvoker<ShowMixJobRequest, ShowMixJobResponse> showMixJobInvoker(ShowMixJobRequest request) {
        return new SyncInvoker<ShowMixJobRequest, ShowMixJobResponse>(request, CloudRTCMeta.showMixJob, hcClient);
    }

    /**
     * 查询增值（录制）事件回调配置
     *
     * 调用此接口查询增值（录制）事件回调配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRecordCallbackRequest 请求对象
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
     * @param ShowRecordCallbackRequest 请求对象
     * @return SyncInvoker<ShowRecordCallbackRequest, ShowRecordCallbackResponse>
     */
    public SyncInvoker<ShowRecordCallbackRequest, ShowRecordCallbackResponse> showRecordCallbackInvoker(
        ShowRecordCallbackRequest request) {
        return new SyncInvoker<ShowRecordCallbackRequest, ShowRecordCallbackResponse>(request,
            CloudRTCMeta.showRecordCallback, hcClient);
    }

    /**
     * 查询录制规则
     *
     * 调用此接口查询指定录制规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRecordRuleRequest 请求对象
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
     * @param ShowRecordRuleRequest 请求对象
     * @return SyncInvoker<ShowRecordRuleRequest, ShowRecordRuleResponse>
     */
    public SyncInvoker<ShowRecordRuleRequest, ShowRecordRuleResponse> showRecordRuleInvoker(
        ShowRecordRuleRequest request) {
        return new SyncInvoker<ShowRecordRuleRequest, ShowRecordRuleResponse>(request, CloudRTCMeta.showRecordRule,
            hcClient);
    }

    /**
     * 查询访问控制参数
     *
     * 查询应用鉴权配置参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUrlAuthRequest 请求对象
     * @return ShowUrlAuthResponse
     */
    public ShowUrlAuthResponse showUrlAuth(ShowUrlAuthRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.showUrlAuth);
    }

    /**
     * 查询访问控制参数
     *
     * 查询应用鉴权配置参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUrlAuthRequest 请求对象
     * @return SyncInvoker<ShowUrlAuthRequest, ShowUrlAuthResponse>
     */
    public SyncInvoker<ShowUrlAuthRequest, ShowUrlAuthResponse> showUrlAuthInvoker(ShowUrlAuthRequest request) {
        return new SyncInvoker<ShowUrlAuthRequest, ShowUrlAuthResponse>(request, CloudRTCMeta.showUrlAuth, hcClient);
    }

    /**
     * 启用应用
     *
     * 调用此接口启用单个应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartAppRequest 请求对象
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
     * @param StartAppRequest 请求对象
     * @return SyncInvoker<StartAppRequest, StartAppResponse>
     */
    public SyncInvoker<StartAppRequest, StartAppResponse> startAppInvoker(StartAppRequest request) {
        return new SyncInvoker<StartAppRequest, StartAppResponse>(request, CloudRTCMeta.startApp, hcClient);
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
     * @param StopAppRequest 请求对象
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
     * @param StopAppRequest 请求对象
     * @return SyncInvoker<StopAppRequest, StopAppResponse>
     */
    public SyncInvoker<StopAppRequest, StopAppResponse> stopAppInvoker(StopAppRequest request) {
        return new SyncInvoker<StopAppRequest, StopAppResponse>(request, CloudRTCMeta.stopApp, hcClient);
    }

    /**
     * 停止单流任务
     *
     * 调用此接口停止单流任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopIndividualStreamJobRequest 请求对象
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
     * @param StopIndividualStreamJobRequest 请求对象
     * @return SyncInvoker<StopIndividualStreamJobRequest, StopIndividualStreamJobResponse>
     */
    public SyncInvoker<StopIndividualStreamJobRequest, StopIndividualStreamJobResponse> stopIndividualStreamJobInvoker(
        StopIndividualStreamJobRequest request) {
        return new SyncInvoker<StopIndividualStreamJobRequest, StopIndividualStreamJobResponse>(request,
            CloudRTCMeta.stopIndividualStreamJob, hcClient);
    }

    /**
     * 停止合流任务
     *
     * 调用此接口停止已下发的合流转码任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopMixJobRequest 请求对象
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
     * @param StopMixJobRequest 请求对象
     * @return SyncInvoker<StopMixJobRequest, StopMixJobResponse>
     */
    public SyncInvoker<StopMixJobRequest, StopMixJobResponse> stopMixJobInvoker(StopMixJobRequest request) {
        return new SyncInvoker<StopMixJobRequest, StopMixJobResponse>(request, CloudRTCMeta.stopMixJob, hcClient);
    }

    /**
     * 更新自动录制配置
     *
     * 更新自动录制配置，租户可以开启自动单流录制或者停用自动单流录制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAutoRecordRequest 请求对象
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
     * @param UpdateAutoRecordRequest 请求对象
     * @return SyncInvoker<UpdateAutoRecordRequest, UpdateAutoRecordResponse>
     */
    public SyncInvoker<UpdateAutoRecordRequest, UpdateAutoRecordResponse> updateAutoRecordInvoker(
        UpdateAutoRecordRequest request) {
        return new SyncInvoker<UpdateAutoRecordRequest, UpdateAutoRecordResponse>(request,
            CloudRTCMeta.updateAutoRecord, hcClient);
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
     * @param UpdateIndividualStreamJobRequest 请求对象
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
     * @param UpdateIndividualStreamJobRequest 请求对象
     * @return SyncInvoker<UpdateIndividualStreamJobRequest, UpdateIndividualStreamJobResponse>
     */
    public SyncInvoker<UpdateIndividualStreamJobRequest, UpdateIndividualStreamJobResponse> updateIndividualStreamJobInvoker(
        UpdateIndividualStreamJobRequest request) {
        return new SyncInvoker<UpdateIndividualStreamJobRequest, UpdateIndividualStreamJobResponse>(request,
            CloudRTCMeta.updateIndividualStreamJob, hcClient);
    }

    /**
     * 修改合流任务
     *
     * 调用此接口更新合流任务布局。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateMixJobRequest 请求对象
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
     * @param UpdateMixJobRequest 请求对象
     * @return SyncInvoker<UpdateMixJobRequest, UpdateMixJobResponse>
     */
    public SyncInvoker<UpdateMixJobRequest, UpdateMixJobResponse> updateMixJobInvoker(UpdateMixJobRequest request) {
        return new SyncInvoker<UpdateMixJobRequest, UpdateMixJobResponse>(request, CloudRTCMeta.updateMixJob, hcClient);
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
     * @param UpdateRecordCallbackRequest 请求对象
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
     * @param UpdateRecordCallbackRequest 请求对象
     * @return SyncInvoker<UpdateRecordCallbackRequest, UpdateRecordCallbackResponse>
     */
    public SyncInvoker<UpdateRecordCallbackRequest, UpdateRecordCallbackResponse> updateRecordCallbackInvoker(
        UpdateRecordCallbackRequest request) {
        return new SyncInvoker<UpdateRecordCallbackRequest, UpdateRecordCallbackResponse>(request,
            CloudRTCMeta.updateRecordCallback, hcClient);
    }

    /**
     * 更新录制规则
     *
     * 调用此接口更新录制规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRecordRuleRequest 请求对象
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
     * @param UpdateRecordRuleRequest 请求对象
     * @return SyncInvoker<UpdateRecordRuleRequest, UpdateRecordRuleResponse>
     */
    public SyncInvoker<UpdateRecordRuleRequest, UpdateRecordRuleResponse> updateRecordRuleInvoker(
        UpdateRecordRuleRequest request) {
        return new SyncInvoker<UpdateRecordRuleRequest, UpdateRecordRuleResponse>(request,
            CloudRTCMeta.updateRecordRule, hcClient);
    }

    /**
     * 开关访问控制
     *
     * 调用此接口开启或关闭URL鉴权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateUrlAuthRequest 请求对象
     * @return UpdateUrlAuthResponse
     */
    public UpdateUrlAuthResponse updateUrlAuth(UpdateUrlAuthRequest request) {
        return hcClient.syncInvokeHttp(request, CloudRTCMeta.updateUrlAuth);
    }

    /**
     * 开关访问控制
     *
     * 调用此接口开启或关闭URL鉴权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateUrlAuthRequest 请求对象
     * @return SyncInvoker<UpdateUrlAuthRequest, UpdateUrlAuthResponse>
     */
    public SyncInvoker<UpdateUrlAuthRequest, UpdateUrlAuthResponse> updateUrlAuthInvoker(UpdateUrlAuthRequest request) {
        return new SyncInvoker<UpdateUrlAuthRequest, UpdateUrlAuthResponse>(request, CloudRTCMeta.updateUrlAuth,
            hcClient);
    }

}

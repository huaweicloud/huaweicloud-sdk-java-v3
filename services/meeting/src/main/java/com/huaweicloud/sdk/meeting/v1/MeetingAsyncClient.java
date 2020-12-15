package com.huaweicloud.sdk.meeting.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.meeting.v1.model.*;

public class MeetingAsyncClient {
    protected HcClient hcClient;

    public MeetingAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<MeetingAsyncClient> newBuilder() {
        return new ClientBuilder<>(MeetingAsyncClient::new, "MeetingCredentials");
    }


    /**
     * SP管理员创建企业
     * 创建企业，默认管理员及分配资源。
     *
     * @param AddCorpRequest 请求对象
     * @return CompletableFuture<AddCorpResponse>
     */
    public CompletableFuture<AddCorpResponse> addCorpAsync(AddCorpRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.addCorp);
    }

    /**
     * 添加企业管理员
     * 企业默认管理员添加企业普通管理员
     *
     * @param AddCorpAdminRequest 请求对象
     * @return CompletableFuture<AddCorpAdminResponse>
     */
    public CompletableFuture<AddCorpAdminResponse> addCorpAdminAsync(AddCorpAdminRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.addCorpAdmin);
    }

    /**
     * 添加部门
     * 企业管理员通过该接口添加部门，最多支持10级部门，每级子部门最多支持100个，默认企业最大部门数量为3000个。
     *
     * @param AddDepartmentRequest 请求对象
     * @return CompletableFuture<AddDepartmentResponse>
     */
    public CompletableFuture<AddDepartmentResponse> addDepartmentAsync(AddDepartmentRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.addDepartment);
    }

    /**
     * 增加终端
     * 企业管理员通过该接口添加硬终端。
     *
     * @param AddDeviceRequest 请求对象
     * @return CompletableFuture<AddDeviceResponse>
     */
    public CompletableFuture<AddDeviceResponse> addDeviceAsync(AddDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.addDevice);
    }

    /**
     * 新增全球窗节目
     * 新增全球窗节目
     *
     * @param AddProgramRequest 请求对象
     * @return CompletableFuture<AddProgramResponse>
     */
    public CompletableFuture<AddProgramResponse> addProgramAsync(AddProgramRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.addProgram);
    }

    /**
     * 新增全球窗发布
     * 新增全球窗发布
     *
     * @param AddPublicationRequest 请求对象
     * @return CompletableFuture<AddPublicationResponse>
     */
    public CompletableFuture<AddPublicationResponse> addPublicationAsync(AddPublicationRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.addPublication);
    }

    /**
     * 分配企业资源
     * 企业新增资源发放。优化适配，该接口同时支持修改，带resourceId后会判断该资源是否存在，存在即修改（支持修改的参数见修改接口），否则按新增处理
     *
     * @param AddResourceRequest 请求对象
     * @return CompletableFuture<AddResourceResponse>
     */
    public CompletableFuture<AddResourceResponse> addResourceAsync(AddResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.addResource);
    }

    /**
     * 保存会议纪要到个人云空间
     * 用户使用手机扫码后，手机端请求服务端将当前会议纪要文件保存到个人云空间。二维码内容  cloudlink://cloudlink.huawei.com/h5page?action&#x3D;SAVE_MEETING_FILE&amp;key1&#x3D;value1&amp;key2&#x3D;value2    key/value的个数可能变化，终端解析后，在发起后续请求时，将所有key/value存为map，作为入参即可。
     *
     * @param AddToPersonalSpaceRequest 请求对象
     * @return CompletableFuture<AddToPersonalSpaceResponse>
     */
    public CompletableFuture<AddToPersonalSpaceResponse> addToPersonalSpaceAsync(AddToPersonalSpaceRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.addToPersonalSpace);
    }

    /**
     * 添加用户
     * 企业管理员通过该接口添加企业用户。
     *
     * @param AddUserRequest 请求对象
     * @return CompletableFuture<AddUserResponse>
     */
    public CompletableFuture<AddUserResponse> addUserAsync(AddUserRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.addUser);
    }

    /**
     * 与会者自己解除静音
     * 决定与会者是否可以自己解除静音。
     *
     * @param AllowGuestUnmuteRequest 请求对象
     * @return CompletableFuture<AllowGuestUnmuteResponse>
     */
    public CompletableFuture<AllowGuestUnmuteResponse> allowGuestUnmuteAsync(AllowGuestUnmuteRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.allowGuestUnmute);
    }

    /**
     * 分配专用云会议室
     * 企业管理员通过该接口将云会议室分配给用户、硬终端（当前仅支持分配TE10、TE20、HUAWEI Board、HUAWEI Bar 500及HUAWEI Box系列硬件终端）。云会议室分配给硬件终端后，需要重启或重新激活硬件终端。若需要管理云会议室、预约会议、录制会议或进行完整的会控操作，请同时将该云会议室分配给会议用户。
     *
     * @param AssociateVmrRequest 请求对象
     * @return CompletableFuture<AssociateVmrResponse>
     */
    public CompletableFuture<AssociateVmrResponse> associateVmrAsync(AssociateVmrRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.associateVmr);
    }

    /**
     * 批量删除企业管理员
     * 批量删除企业管理员
     *
     * @param BatchDeleteCorpAdminsRequest 请求对象
     * @return CompletableFuture<BatchDeleteCorpAdminsResponse>
     */
    public CompletableFuture<BatchDeleteCorpAdminsResponse> batchDeleteCorpAdminsAsync(BatchDeleteCorpAdminsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.batchDeleteCorpAdmins);
    }

    /**
     * 批量删除终端
     * 企业管理员通过该接口批量删除终端，返回删除失败的列表。
     *
     * @param BatchDeleteDevicesRequest 请求对象
     * @return CompletableFuture<BatchDeleteDevicesResponse>
     */
    public CompletableFuture<BatchDeleteDevicesResponse> batchDeleteDevicesAsync(BatchDeleteDevicesRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.batchDeleteDevices);
    }

    /**
     * 删除全球窗素材
     * 删除全球窗素材
     *
     * @param BatchDeleteMaterialsRequest 请求对象
     * @return CompletableFuture<BatchDeleteMaterialsResponse>
     */
    public CompletableFuture<BatchDeleteMaterialsResponse> batchDeleteMaterialsAsync(BatchDeleteMaterialsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.batchDeleteMaterials);
    }

    /**
     * 删除全球窗节目
     * 删除全球窗节目
     *
     * @param BatchDeleteProgramsRequest 请求对象
     * @return CompletableFuture<BatchDeleteProgramsResponse>
     */
    public CompletableFuture<BatchDeleteProgramsResponse> batchDeleteProgramsAsync(BatchDeleteProgramsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.batchDeletePrograms);
    }

    /**
     * 删除全球窗发布
     * 删除全球窗发布
     *
     * @param BatchDeletePublicationsRequest 请求对象
     * @return CompletableFuture<BatchDeletePublicationsResponse>
     */
    public CompletableFuture<BatchDeletePublicationsResponse> batchDeletePublicationsAsync(BatchDeletePublicationsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.batchDeletePublications);
    }

    /**
     * 批量删除用户
     * 企业管理员通过该接口批量删除企业用户，全量成功或全量失败。
     *
     * @param BatchDeleteUsersRequest 请求对象
     * @return CompletableFuture<BatchDeleteUsersResponse>
     */
    public CompletableFuture<BatchDeleteUsersResponse> batchDeleteUsersAsync(BatchDeleteUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.batchDeleteUsers);
    }

    /**
     * 批量修改终端状态
     * 批量修改终端状态
     *
     * @param BatchUpdateDevicesStatusRequest 请求对象
     * @return CompletableFuture<BatchUpdateDevicesStatusResponse>
     */
    public CompletableFuture<BatchUpdateDevicesStatusResponse> batchUpdateDevicesStatusAsync(BatchUpdateDevicesStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.batchUpdateDevicesStatus);
    }

    /**
     * 批量修改用户状态
     * 企业管理员通过该接口批量修改用户状态，当用户账号数资源或者第三方电子白板资源到期后，若企业内对应资源的用户账号超过数量后会被系统随机自动停用，此时可通过该接口修改用户的状态。
     *
     * @param BatchUpdateUserStatusRequest 请求对象
     * @return CompletableFuture<BatchUpdateUserStatusResponse>
     */
    public CompletableFuture<BatchUpdateUserStatusResponse> batchUpdateUserStatusAsync(BatchUpdateUserStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.batchUpdateUserStatus);
    }

    /**
     * 广播会场
     * 同一时间，只允许一个与会者被广播。
     *
     * @param BroadcastParticipantRequest 请求对象
     * @return CompletableFuture<BroadcastParticipantResponse>
     */
    public CompletableFuture<BroadcastParticipantResponse> broadcastParticipantAsync(BroadcastParticipantRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.broadcastParticipant);
    }

    /**
     * 取消预约会议
     * 取消预约会议。
     *
     * @param CancelMeetingRequest 请求对象
     * @return CompletableFuture<CancelMeetingResponse>
     */
    public CompletableFuture<CancelMeetingResponse> cancelMeetingAsync(CancelMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.cancelMeeting);
    }

    /**
     * 校验滑块验证码
     * 该接口提供校验滑块验证码。服务器收到请求，返回校验结果。用户在前台界面通过滑块操作匹配图形，使得抠图和原图吻合。然后服务器进行校验滑块验证码。
     *
     * @param CheckSlideVerifyCodeRequest 请求对象
     * @return CompletableFuture<CheckSlideVerifyCodeResponse>
     */
    public CompletableFuture<CheckSlideVerifyCodeResponse> checkSlideVerifyCodeAsync(CheckSlideVerifyCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.checkSlideVerifyCode);
    }

    /**
     * 校验Token
     * 该接口提供校验token合法性功能。服务器收到请求后，验证token合法性并返回结果。如果参数needGenNewToken为true时，生成新的token并返回。
     *
     * @param CheckTokenRequest 请求对象
     * @return CompletableFuture<CheckTokenResponse>
     */
    public CompletableFuture<CheckTokenResponse> checkTokenAsync(CheckTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.checkToken);
    }

    /**
     * 校验手机和邮箱对应的验证码
     * 企业用户通过该接口校验手机和邮箱对应的验证码，一分钟内记录尝试次数不得超过5次。
     *
     * @param CheckVeriCodeForUpdateUserInfoRequest 请求对象
     * @return CompletableFuture<CheckVeriCodeForUpdateUserInfoResponse>
     */
    public CompletableFuture<CheckVeriCodeForUpdateUserInfoResponse> checkVeriCodeForUpdateUserInfoAsync(CheckVeriCodeForUpdateUserInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.checkVeriCodeForUpdateUserInfo);
    }

    /**
     * 校验验证码
     * 该接口提供校验验证码，服务器收到请求，返回结果。
     *
     * @param CheckVerifyCodeRequest 请求对象
     * @return CompletableFuture<CheckVerifyCodeResponse>
     */
    public CompletableFuture<CheckVerifyCodeResponse> checkVerifyCodeAsync(CheckVerifyCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.checkVerifyCode);
    }

    /**
     * 匿名用户会议鉴权
     * 未登陆终端，通过输入会议ID进行会议鉴权，返回鉴权随机数。如果需要密码则返回需要会议密码错误码，然后终端弹出输入会议ID输入框，用户输入密码后，终端再次调用该接口进行鉴权。
     *
     * @param CreateAnonymousAuthRandomRequest 请求对象
     * @return CompletableFuture<CreateAnonymousAuthRandomResponse>
     */
    public CompletableFuture<CreateAnonymousAuthRandomResponse> createAnonymousAuthRandomAsync(CreateAnonymousAuthRandomRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.createAnonymousAuthRandom);
    }

    /**
     * 获取会控Token
     * 获取会控授权令牌，然后会议会被拉起。
     *
     * @param CreateConfTokenRequest 请求对象
     * @return CompletableFuture<CreateConfTokenResponse>
     */
    public CompletableFuture<CreateConfTokenResponse> createConfTokenAsync(CreateConfTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.createConfToken);
    }

    /**
     * 创建会议
     * 您可根据需要创建立即会议和预约会议。
     *
     * @param CreateMeetingRequest 请求对象
     * @return CompletableFuture<CreateMeetingResponse>
     */
    public CompletableFuture<CreateMeetingResponse> createMeetingAsync(CreateMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.createMeeting);
    }

    /**
     * 获取页面免登陆跳转的nonce信息
     * 通过token生成页面免登陆跳转到华为云会议的Portal的nonce信息。获取到nonce信息后，通过链接https://bmeeting.huaweicloud.com/?lang&#x3D;zh-CN&amp;nonce&#x3D;xxxxxxxxxxxxx#/login进行免登陆跳转。
     *
     * @param CreatePortalRefNonceRequest 请求对象
     * @return CompletableFuture<CreatePortalRefNonceResponse>
     */
    public CompletableFuture<CreatePortalRefNonceResponse> createPortalRefNonceAsync(CreatePortalRefNonceRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.createPortalRefNonce);
    }

    /**
     * 删除与会者
     * 删除与会者。
     *
     * @param DeleteAttendeesRequest 请求对象
     * @return CompletableFuture<DeleteAttendeesResponse>
     */
    public CompletableFuture<DeleteAttendeesResponse> deleteAttendeesAsync(DeleteAttendeesRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.deleteAttendees);
    }

    /**
     * SP管理员删除企业
     * 删除企业
     *
     * @param DeleteCorpRequest 请求对象
     * @return CompletableFuture<DeleteCorpResponse>
     */
    public CompletableFuture<DeleteCorpResponse> deleteCorpAsync(DeleteCorpRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.deleteCorp);
    }

    /**
     * 删除专用云会议室
     * 企业管理员通过该接口删除企业的专用云会议室
     *
     * @param DeleteCorpVmrRequest 请求对象
     * @return CompletableFuture<DeleteCorpVmrResponse>
     */
    public CompletableFuture<DeleteCorpVmrResponse> deleteCorpVmrAsync(DeleteCorpVmrRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.deleteCorpVmr);
    }

    /**
     * 删除部门
     * 企业管理员通过该接口删除部门。
     *
     * @param DeleteDepartmentRequest 请求对象
     * @return CompletableFuture<DeleteDepartmentResponse>
     */
    public CompletableFuture<DeleteDepartmentResponse> deleteDepartmentAsync(DeleteDepartmentRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.deleteDepartment);
    }

    /**
     * 批量删除录制
     * 批量删除录制。
     *
     * @param DeleteRecordingsRequest 请求对象
     * @return CompletableFuture<DeleteRecordingsResponse>
     */
    public CompletableFuture<DeleteRecordingsResponse> deleteRecordingsAsync(DeleteRecordingsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.deleteRecordings);
    }

    /**
     * 删除企业资源
     * 企业删除资源项，删除资源项后，企业资源总数会自动减少
     *
     * @param DeleteResourceRequest 请求对象
     * @return CompletableFuture<DeleteResourceResponse>
     */
    public CompletableFuture<DeleteResourceResponse> deleteResourceAsync(DeleteResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.deleteResource);
    }

    /**
     * 从用户或终端回收企业专用VMR
     * 给企业用户回收vmr，需要做好纵向越权校验，避免企业管理员给其他企业的账号分配
     *
     * @param DisassociateVmrRequest 请求对象
     * @return CompletableFuture<DisassociateVmrResponse>
     */
    public CompletableFuture<DisassociateVmrResponse> disassociateVmrAsync(DisassociateVmrRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.disassociateVmr);
    }

    /**
     * 编辑预约会议
     * 编辑预约会议。会议开始后，不能被编辑。
     *
     * @param EditMeetingRequest 请求对象
     * @return CompletableFuture<EditMeetingResponse>
     */
    public CompletableFuture<EditMeetingResponse> editMeetingAsync(EditMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.editMeeting);
    }

    /**
     * 举手
     * 所有来宾可以举手。来宾举手后，可以取消自己的举手。主持人可以取消所有来宾的举手。
     *
     * @param HandRequest 请求对象
     * @return CompletableFuture<HandResponse>
     */
    public CompletableFuture<HandResponse> handAsync(HandRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.hand);
    }

    /**
     * 挂断与会者
     * 挂断正在通话中的与会者。
     *
     * @param HangUpRequest 请求对象
     * @return CompletableFuture<HangUpResponse>
     */
    public CompletableFuture<HangUpResponse> hangUpAsync(HangUpRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.hangUp);
    }

    /**
     * 邀请与会者
     * 邀请与会者加入会议。
     *
     * @param InviteParticipantRequest 请求对象
     * @return CompletableFuture<InviteParticipantResponse>
     */
    public CompletableFuture<InviteParticipantResponse> inviteParticipantAsync(InviteParticipantRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.inviteParticipant);
    }

    /**
     * 通过会议ID和密码邀请与会者
     * 通过会议ID和密码邀请与会者
     *
     * @param InviteWithPwdRequest 请求对象
     * @return CompletableFuture<InviteWithPwdResponse>
     */
    public CompletableFuture<InviteWithPwdResponse> inviteWithPwdAsync(InviteWithPwdRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.inviteWithPwd);
    }

    /**
     * 启停会议直播
     * 启动或停止会议直播。
     *
     * @param LiveRequest 请求对象
     * @return CompletableFuture<LiveResponse>
     */
    public CompletableFuture<LiveResponse> liveAsync(LiveRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.live);
    }

    /**
     * 锁定会议
     * 锁定或解锁会议。锁定会议后，不允许与会者加入会议。
     *
     * @param LockMeetingRequest 请求对象
     * @return CompletableFuture<LockMeetingResponse>
     */
    public CompletableFuture<LockMeetingResponse> lockMeetingAsync(LockMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.lockMeeting);
    }

    /**
     * 锁定会场视频源
     * 锁定或者解锁某在线会场的视频源。
     *
     * @param LockViewRequest 请求对象
     * @return CompletableFuture<LockViewResponse>
     */
    public CompletableFuture<LockViewResponse> lockViewAsync(LockViewRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.lockView);
    }

    /**
     * 全场静音
     * 主持人可以通过该接口静音/取消静音整个会议所有与会者（主持人除外）。
     *
     * @param MuteMeetingRequest 请求对象
     * @return CompletableFuture<MuteMeetingResponse>
     */
    public CompletableFuture<MuteMeetingResponse> muteMeetingAsync(MuteMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.muteMeeting);
    }

    /**
     * 静音与会者
     * 主持人可以静音/取消静音任意与会者，来宾也可静音/取消静音自己。
     *
     * @param MuteParticipantRequest 请求对象
     * @return CompletableFuture<MuteParticipantResponse>
     */
    public CompletableFuture<MuteParticipantResponse> muteParticipantAsync(MuteParticipantRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.muteParticipant);
    }

    /**
     * 延长会议
     * 延长会议。
     *
     * @param ProlongMeetingRequest 请求对象
     * @return CompletableFuture<ProlongMeetingResponse>
     */
    public CompletableFuture<ProlongMeetingResponse> prolongMeetingAsync(ProlongMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.prolongMeeting);
    }

    /**
     * 启停会议录制
     * 启动或停止会议录制。
     *
     * @param RecordRequest 请求对象
     * @return CompletableFuture<RecordResponse>
     */
    public CompletableFuture<RecordResponse> recordAsync(RecordRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.record);
    }

    /**
     * 重命名与会者
     * 重命名某个与会者。
     *
     * @param RenameParticipantRequest 请求对象
     * @return CompletableFuture<RenameParticipantResponse>
     */
    public CompletableFuture<RenameParticipantResponse> renameParticipantAsync(RenameParticipantRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.renameParticipant);
    }

    /**
     * 重置激活码
     * 当硬终端激活码失效时，企业管理员可以通过该接口重置激活码，使用重新获取的激活码激活终端，每24小时可重新激活5次。
     *
     * @param ResetActivecodeRequest 请求对象
     * @return CompletableFuture<ResetActivecodeResponse>
     */
    public CompletableFuture<ResetActivecodeResponse> resetActivecodeAsync(ResetActivecodeRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.resetActivecode);
    }

    /**
     * 用户重置密码
     * 该接口提供给用户重置密码功能，服务器收到请求，重新设置用户密码并返回结果。
     *
     * @param ResetPwdRequest 请求对象
     * @return CompletableFuture<ResetPwdResponse>
     */
    public CompletableFuture<ResetPwdResponse> resetPwdAsync(ResetPwdRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.resetPwd);
    }

    /**
     * 企业管理员重置企业成员密码
     * 企业管理员通过该接口提供企业管理员重置企业成员密码的功能。当服务器收到重置密码的请求时，发送新的密码到企业成员的邮箱或者短信，并返回结果。
     *
     * @param ResetPwdByAdminRequest 请求对象
     * @return CompletableFuture<ResetPwdByAdminResponse>
     */
    public CompletableFuture<ResetPwdByAdminResponse> resetPwdByAdminAsync(ResetPwdByAdminRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.resetPwdByAdmin);
    }

    /**
     * 点名会场
     * 同一时间，只允许一个与会者被点名。点名会场的效果是除了主持人外，点名与会者为非静音状态，未点名的与会者统一为静音状态。
     *
     * @param RollcallParticipantRequest 请求对象
     * @return CompletableFuture<RollcallParticipantResponse>
     */
    public CompletableFuture<RollcallParticipantResponse> rollcallParticipantAsync(RollcallParticipantRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.rollcallParticipant);
    }

    /**
     * 查询历史会议的与会者记录
     * 查询指定历史会议的与会者记录。
     *
     * @param SearchAttendanceRecordsOfHisMeetingRequest 请求对象
     * @return CompletableFuture<SearchAttendanceRecordsOfHisMeetingResponse>
     */
    public CompletableFuture<SearchAttendanceRecordsOfHisMeetingResponse> searchAttendanceRecordsOfHisMeetingAsync(SearchAttendanceRecordsOfHisMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchAttendanceRecordsOfHisMeeting);
    }

    /**
     * SP管理员分页搜索企业
     * 分页搜索企业,支持名称、企业ID搜索
     *
     * @param SearchCorpRequest 请求对象
     * @return CompletableFuture<SearchCorpResponse>
     */
    public CompletableFuture<SearchCorpResponse> searchCorpAsync(SearchCorpRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchCorp);
    }

    /**
     * 分页查询企业管理员
     * 通过该接口分页查询企业管理员。
     *
     * @param SearchCorpAdminsRequest 请求对象
     * @return CompletableFuture<SearchCorpAdminsResponse>
     */
    public CompletableFuture<SearchCorpAdminsResponse> searchCorpAdminsAsync(SearchCorpAdminsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchCorpAdmins);
    }

    /**
     * 查询企业通讯录
     * 企业用户（含管理员）通过该接口查询该企业的通讯录。
     *
     * @param SearchCorpDirRequest 请求对象
     * @return CompletableFuture<SearchCorpDirResponse>
     */
    public CompletableFuture<SearchCorpDirResponse> searchCorpDirAsync(SearchCorpDirRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchCorpDir);
    }

    /**
     * 分页查询专用云会议室
     * 企业管理员通过该接口分页查询企业的专用云会议室。
     *
     * @param SearchCorpVmrRequest 请求对象
     * @return CompletableFuture<SearchCorpVmrResponse>
     */
    public CompletableFuture<SearchCorpVmrResponse> searchCorpVmrAsync(SearchCorpVmrRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchCorpVmr);
    }

    /**
     * 查询历史会议的会控记录
     * 查询指定历史会议的会控记录。
     *
     * @param SearchCtlRecordsOfHisMeetingRequest 请求对象
     * @return CompletableFuture<SearchCtlRecordsOfHisMeetingResponse>
     */
    public CompletableFuture<SearchCtlRecordsOfHisMeetingResponse> searchCtlRecordsOfHisMeetingAsync(SearchCtlRecordsOfHisMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchCtlRecordsOfHisMeeting);
    }

    /**
     * 按名称查询所有的部门
     * 企业管理员通过该接口按名称查询所有的部门。
     *
     * @param SearchDepartmentByNameRequest 请求对象
     * @return CompletableFuture<SearchDepartmentByNameResponse>
     */
    public CompletableFuture<SearchDepartmentByNameResponse> searchDepartmentByNameAsync(SearchDepartmentByNameRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchDepartmentByName);
    }

    /**
     * 分页查询终端
     * 企业管理员通过该接口分页查询终端信息。
     *
     * @param SearchDevicesRequest 请求对象
     * @return CompletableFuture<SearchDevicesResponse>
     */
    public CompletableFuture<SearchDevicesResponse> searchDevicesAsync(SearchDevicesRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchDevices);
    }

    /**
     * 查询历史会议列表
     * 管理员可以查询管理权限域内所有的历史会议，普通用户仅能查询当前帐号管理的历史会议。不带查询参数时，默认查询权限范围内的历史会议。
     *
     * @param SearchHisMeetingsRequest 请求对象
     * @return CompletableFuture<SearchHisMeetingsResponse>
     */
    public CompletableFuture<SearchHisMeetingsResponse> searchHisMeetingsAsync(SearchHisMeetingsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchHisMeetings);
    }

    /**
     * 分页查询全球窗素材
     * 分页查询全球窗素材
     *
     * @param SearchMaterialsRequest 请求对象
     * @return CompletableFuture<SearchMaterialsResponse>
     */
    public CompletableFuture<SearchMaterialsResponse> searchMaterialsAsync(SearchMaterialsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchMaterials);
    }

    /**
     * 查询会议纪要列表
     * 用户查询自己的会议纪要列表
     *
     * @param SearchMeetingFileListRequest 请求对象
     * @return CompletableFuture<SearchMeetingFileListResponse>
     */
    public CompletableFuture<SearchMeetingFileListResponse> searchMeetingFileListAsync(SearchMeetingFileListRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchMeetingFileList);
    }

    /**
     * 查询会议列表
     * 管理员可以查询管理权限域内所有的会议，普通用户仅能查询当前帐号管理的会议。不带查询参数时，默认查询权限范围内正在召开或还未召开的会议。
     *
     * @param SearchMeetingsRequest 请求对象
     * @return CompletableFuture<SearchMeetingsResponse>
     */
    public CompletableFuture<SearchMeetingsResponse> searchMeetingsAsync(SearchMeetingsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchMeetings);
    }

    /**
     * 分页查询用户云会议室
     * 企业用户通过该接口查询个人已分配的云会议室，包括个人及专用两种。
     *
     * @param SearchMemberVmrRequest 请求对象
     * @return CompletableFuture<SearchMemberVmrResponse>
     */
    public CompletableFuture<SearchMemberVmrResponse> searchMemberVmrAsync(SearchMemberVmrRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchMemberVmr);
    }

    /**
     * 查询在线会议列表
     * 管理员可以查询管理权限域内所有在线会议，普通用户仅能查询当前自己帐号管理的在线会议。不带查询参数时，默认查询权限范围内的在线会议，按开始时间升序排列。
     *
     * @param SearchOnlineMeetingsRequest 请求对象
     * @return CompletableFuture<SearchOnlineMeetingsResponse>
     */
    public CompletableFuture<SearchOnlineMeetingsResponse> searchOnlineMeetingsAsync(SearchOnlineMeetingsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchOnlineMeetings);
    }

    /**
     * 查询全球窗节目
     * 获取全球窗节目
     *
     * @param SearchProgramsRequest 请求对象
     * @return CompletableFuture<SearchProgramsResponse>
     */
    public CompletableFuture<SearchProgramsResponse> searchProgramsAsync(SearchProgramsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchPrograms);
    }

    /**
     * 查询全球窗发布
     * 获取全球窗发布
     *
     * @param SearchPublicationsRequest 请求对象
     * @return CompletableFuture<SearchPublicationsResponse>
     */
    public CompletableFuture<SearchPublicationsResponse> searchPublicationsAsync(SearchPublicationsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchPublications);
    }

    /**
     * 查询录制列表
     * 管理员可以查询管理权限域内所有的录制，普通用户仅能查询当前帐号管理的录制。不带查询参数时，默认查询权限范围内的录制。
     *
     * @param SearchRecordingsRequest 请求对象
     * @return CompletableFuture<SearchRecordingsResponse>
     */
    public CompletableFuture<SearchRecordingsResponse> searchRecordingsAsync(SearchRecordingsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchRecordings);
    }

    /**
     * 分页查询企业资源
     * sp根据条件查询企业的资源项
     *
     * @param SearchResourceRequest 请求对象
     * @return CompletableFuture<SearchResourceResponse>
     */
    public CompletableFuture<SearchResourceResponse> searchResourceAsync(SearchResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchResource);
    }

    /**
     * 分页查询企业资源操作记录
     * sp根据条件查询企业的资源操作记录，支持根据resourceId模糊搜索
     *
     * @param SearchResourceOpRecordRequest 请求对象
     * @return CompletableFuture<SearchResourceOpRecordResponse>
     */
    public CompletableFuture<SearchResourceOpRecordResponse> searchResourceOpRecordAsync(SearchResourceOpRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchResourceOpRecord);
    }

    /**
     * 分页查询用户
     * 企业管理员通过该接口分页查询企业用户。
     *
     * @param SearchUsersRequest 请求对象
     * @return CompletableFuture<SearchUsersResponse>
     */
    public CompletableFuture<SearchUsersResponse> searchUsersAsync(SearchUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchUsers);
    }

    /**
     * 发送滑块验证码
     * 该接口提供发送滑块验证码。服务器收到请求，返回抠图以及抠图后的原图等结果。需要在前台界面显示出抠图以及抠图后的原图，用户通过滑块操作来匹配图形。
     *
     * @param SendSlideVerifyCodeRequest 请求对象
     * @return CompletableFuture<SendSlideVerifyCodeResponse>
     */
    public CompletableFuture<SendSlideVerifyCodeResponse> sendSlideVerifyCodeAsync(SendSlideVerifyCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.sendSlideVerifyCode);
    }

    /**
     * 发送验证码
     * 该接口提供发送验证码，服务器收到请求，发送验证码到邮箱或者短信并返回结果。用户在前台界面通过滑块验证后，再进行发送验证码操作。
     *
     * @param SendVeriCodeForChangePwdRequest 请求对象
     * @return CompletableFuture<SendVeriCodeForChangePwdResponse>
     */
    public CompletableFuture<SendVeriCodeForChangePwdResponse> sendVeriCodeForChangePwdAsync(SendVeriCodeForChangePwdRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.sendVeriCodeForChangePwd);
    }

    /**
     * 获取验证码
     * 获取验证码，向手机或邮箱发送，一分钟内只会发送一次。
     *
     * @param SendVeriCodeForUpdateUserInfoRequest 请求对象
     * @return CompletableFuture<SendVeriCodeForUpdateUserInfoResponse>
     */
    public CompletableFuture<SendVeriCodeForUpdateUserInfoResponse> sendVeriCodeForUpdateUserInfoAsync(SendVeriCodeForUpdateUserInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.sendVeriCodeForUpdateUserInfo);
    }

    /**
     * 设置自定义多画面
     * 场景描述：会议管理员在confportal手动设置多画面 功能描述：提供给会议管理员手动设置多画面的功能
     *
     * @param SetCustomMultiPictureRequest 请求对象
     * @return CompletableFuture<SetCustomMultiPictureResponse>
     */
    public CompletableFuture<SetCustomMultiPictureResponse> setCustomMultiPictureAsync(SetCustomMultiPictureRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.setCustomMultiPicture);
    }

    /**
     * 主持人选看
     * 用于主持人轮询、主持人选看多画面、主持人选看会场操作。目前只适用于硬终端为主持人的场景。
     *
     * @param SetHostViewRequest 请求对象
     * @return CompletableFuture<SetHostViewResponse>
     */
    public CompletableFuture<SetHostViewResponse> setHostViewAsync(SetHostViewRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.setHostView);
    }

    /**
     * 设置多画面
     * 设置会议多画面。
     *
     * @param SetMultiPictureRequest 请求对象
     * @return CompletableFuture<SetMultiPictureResponse>
     */
    public CompletableFuture<SetMultiPictureResponse> setMultiPictureAsync(SetMultiPictureRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.setMultiPicture);
    }

    /**
     * 会场选看
     * 目前只适用于硬终端选看其他会场人的场景。
     *
     * @param SetParticipantViewRequest 请求对象
     * @return CompletableFuture<SetParticipantViewResponse>
     */
    public CompletableFuture<SetParticipantViewResponse> setParticipantViewAsync(SetParticipantViewRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.setParticipantView);
    }

    /**
     * 申请主持人
     * 申请或释放主持人。普通用户可申请主持人，主持人可释放主持人权限。
     *
     * @param SetRoleRequest 请求对象
     * @return CompletableFuture<SetRoleResponse>
     */
    public CompletableFuture<SetRoleResponse> setRoleAsync(SetRoleRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.setRole);
    }

    /**
     * 通过会议ID查询企业ID
     * 与某个会议在同一个SP下的用户，可以通过会议ID查询到该会议对应的企业ID。
     *
     * @param ShowConfOrgRequest 请求对象
     * @return CompletableFuture<ShowConfOrgResponse>
     */
    public CompletableFuture<ShowConfOrgResponse> showConfOrgAsync(ShowConfOrgRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showConfOrg);
    }

    /**
     * SP管理员查询企业
     * 获取企业
     *
     * @param ShowCorpRequest 请求对象
     * @return CompletableFuture<ShowCorpResponse>
     */
    public CompletableFuture<ShowCorpResponse> showCorpAsync(ShowCorpRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showCorp);
    }

    /**
     * 查询企业管理员
     * 通过该接口查询企业管理员。
     *
     * @param ShowCorpAdminRequest 请求对象
     * @return CompletableFuture<ShowCorpAdminResponse>
     */
    public CompletableFuture<ShowCorpAdminResponse> showCorpAdminAsync(ShowCorpAdminRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showCorpAdmin);
    }

    /**
     * 企业管理员查询企业注册信息
     * 企业管理员通过该接口查询企业注册信息。
     *
     * @param ShowCorpBasicInfoRequest 请求对象
     * @return CompletableFuture<ShowCorpBasicInfoResponse>
     */
    public CompletableFuture<ShowCorpBasicInfoResponse> showCorpBasicInfoAsync(ShowCorpBasicInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showCorpBasicInfo);
    }

    /**
     * 企业管理员查询企业内资源及业务权限
     * 企业管理员通过该接口查询企业内资源及业务权限，包括查询已使用的资源情况。
     *
     * @param ShowCorpResourceRequest 请求对象
     * @return CompletableFuture<ShowCorpResourceResponse>
     */
    public CompletableFuture<ShowCorpResourceResponse> showCorpResourceAsync(ShowCorpResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showCorpResource);
    }

    /**
     * 查询部门及其一级子部门列表
     * 企业管理员通过该接口查询部门及其一级子部门列表。
     *
     * @param ShowDeptAndChildDeptRequest 请求对象
     * @return CompletableFuture<ShowDeptAndChildDeptResponse>
     */
    public CompletableFuture<ShowDeptAndChildDeptResponse> showDeptAndChildDeptAsync(ShowDeptAndChildDeptRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showDeptAndChildDept);
    }

    /**
     * 查询终端详情
     * 企业管理员通过该接口查询终端详情。
     *
     * @param ShowDeviceDetailRequest 请求对象
     * @return CompletableFuture<ShowDeviceDetailResponse>
     */
    public CompletableFuture<ShowDeviceDetailResponse> showDeviceDetailAsync(ShowDeviceDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showDeviceDetail);
    }

    /**
     * 查询设备状态
     * 调用本接口可以查询硬终端的状态。 硬终端与发起查询请求的帐号需在同一企业下，否则会鉴权失败。 
     *
     * @param ShowDeviceStatusRequest 请求对象
     * @return CompletableFuture<ShowDeviceStatusResponse>
     */
    public CompletableFuture<ShowDeviceStatusResponse> showDeviceStatusAsync(ShowDeviceStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showDeviceStatus);
    }

    /**
     * 获取所有终端类型
     * 企业管理员通过该接口获取所有的终端类型。
     *
     * @param ShowDeviceTypesRequest 请求对象
     * @return CompletableFuture<ShowDeviceTypesResponse>
     */
    public CompletableFuture<ShowDeviceTypesResponse> showDeviceTypesAsync(ShowDeviceTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showDeviceTypes);
    }

    /**
     * 查询历史会议详情
     * 管理员可以查询管理权限域内所有的历史会议详情，普通用户仅能查询当前帐号管理的历史会议详情。
     *
     * @param ShowHisMeetingDetailRequest 请求对象
     * @return CompletableFuture<ShowHisMeetingDetailResponse>
     */
    public CompletableFuture<ShowHisMeetingDetailResponse> showHisMeetingDetailAsync(ShowHisMeetingDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showHisMeetingDetail);
    }

    /**
     * 查询会议详情
     * 管理员可以查询管理权限域内所有会议的详情，普通用户仅能查询当前帐号管理的会议详情。
     *
     * @param ShowMeetingDetailRequest 请求对象
     * @return CompletableFuture<ShowMeetingDetailResponse>
     */
    public CompletableFuture<ShowMeetingDetailResponse> showMeetingDetailAsync(ShowMeetingDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showMeetingDetail);
    }

    /**
     * 查询会议纪要详情
     * 用户查询单个会议纪要详情（主要目的是为了得到外链）。 IdeaHub是使用fileCode来查，所以终端保持一致。
     *
     * @param ShowMeetingFileRequest 请求对象
     * @return CompletableFuture<ShowMeetingFileResponse>
     */
    public CompletableFuture<ShowMeetingFileResponse> showMeetingFileAsync(ShowMeetingFileRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showMeetingFile);
    }

    /**
     * 打开会议纪要文件列表
     * 用户使用手机扫码后，手机端请求服务端，让服务端通知指定IdeaHub打开指定用户的会议纪要文件列表。二维码内容  cloudlink://cloudlink.huawei.com/h5page?action&#x3D;OPEN_MEETING_FILE_LIST&amp;key1&#x3D;value1&amp;key2&#x3D;value2    key/value的个数可能变化，终端解析后，在发起后续请求时，将所有key/value存为map，作为入参即可。
     *
     * @param ShowMeetingFileListRequest 请求对象
     * @return CompletableFuture<ShowMeetingFileListResponse>
     */
    public CompletableFuture<ShowMeetingFileListResponse> showMeetingFileListAsync(ShowMeetingFileListRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showMeetingFileList);
    }

    /**
     * 用户查询自己的信息
     * 企业用户通过该接口查询自己的信息。
     *
     * @param ShowMyInfoRequest 请求对象
     * @return CompletableFuture<ShowMyInfoResponse>
     */
    public CompletableFuture<ShowMyInfoResponse> showMyInfoAsync(ShowMyInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showMyInfo);
    }

    /**
     * 查询在线会议详情
     * 管理员可以查询管理权限域内所有的在线会议详情，普通用户仅能查询当前自己的帐号管理的在线会议详情。
     *
     * @param ShowOnlineMeetingDetailRequest 请求对象
     * @return CompletableFuture<ShowOnlineMeetingDetailResponse>
     */
    public CompletableFuture<ShowOnlineMeetingDetailResponse> showOnlineMeetingDetailAsync(ShowOnlineMeetingDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showOnlineMeetingDetail);
    }

    /**
     * 根据ID查询节目详情
     * 根据ID获取节目详情
     *
     * @param ShowProgramRequest 请求对象
     * @return CompletableFuture<ShowProgramResponse>
     */
    public CompletableFuture<ShowProgramResponse> showProgramAsync(ShowProgramRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showProgram);
    }

    /**
     * 根据ID查询全球窗发布详情
     * 根据ID获取发布详情
     *
     * @param ShowPublicationRequest 请求对象
     * @return CompletableFuture<ShowPublicationResponse>
     */
    public CompletableFuture<ShowPublicationResponse> showPublicationAsync(ShowPublicationRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showPublication);
    }

    /**
     * 查询会议实时信息
     * 查询会议实时信息
     *
     * @param ShowRealTimeInfoOfMeetingRequest 请求对象
     * @return CompletableFuture<ShowRealTimeInfoOfMeetingResponse>
     */
    public CompletableFuture<ShowRealTimeInfoOfMeetingResponse> showRealTimeInfoOfMeetingAsync(ShowRealTimeInfoOfMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showRealTimeInfoOfMeeting);
    }

    /**
     * 查询录制详情
     * 查询某个录制详情。
     *
     * @param ShowRecordingDetailRequest 请求对象
     * @return CompletableFuture<ShowRecordingDetailResponse>
     */
    public CompletableFuture<ShowRecordingDetailResponse> showRecordingDetailAsync(ShowRecordingDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showRecordingDetail);
    }

    /**
     * 查询会议所在区域信息
     * 查询会议所在区域信息，如果会议不存在或者会议未召开，返回对应的错误码。
     *
     * @param ShowRegionInfoOfMeetingRequest 请求对象
     * @return CompletableFuture<ShowRegionInfoOfMeetingResponse>
     */
    public CompletableFuture<ShowRegionInfoOfMeetingResponse> showRegionInfoOfMeetingAsync(ShowRegionInfoOfMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showRegionInfoOfMeeting);
    }

    /**
     * 查询SP的共享资源使用信息
     * SP管理查询所属SP的共享资源使用信息
     *
     * @param ShowSpResRequest 请求对象
     * @return CompletableFuture<ShowSpResResponse>
     */
    public CompletableFuture<ShowSpResResponse> showSpResAsync(ShowSpResRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showSpRes);
    }

    /**
     * 查询用户详情
     * 企业管理员通过该接口查询企业用户详情
     *
     * @param ShowUserDetailRequest 请求对象
     * @return CompletableFuture<ShowUserDetailResponse>
     */
    public CompletableFuture<ShowUserDetailResponse> showUserDetailAsync(ShowUserDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showUserDetail);
    }

    /**
     * 结束会议
     * 结束会议。
     *
     * @param StopMeetingRequest 请求对象
     * @return CompletableFuture<StopMeetingResponse>
     */
    public CompletableFuture<StopMeetingResponse> stopMeetingAsync(StopMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.stopMeeting);
    }

    /**
     * 切换视频显示策略
     * 切换视频显示策略
     *
     * @param SwitchModeRequest 请求对象
     * @return CompletableFuture<SwitchModeResponse>
     */
    public CompletableFuture<SwitchModeResponse> switchModeAsync(SwitchModeRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.switchMode);
    }

    /**
     * 修改手机或邮箱
     * 企业用户通过该接口修改手机或邮箱，需要先获取验证码，验证多次失败会禁止修改。
     *
     * @param UpdateContactRequest 请求对象
     * @return CompletableFuture<UpdateContactResponse>
     */
    public CompletableFuture<UpdateContactResponse> updateContactAsync(UpdateContactRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateContact);
    }

    /**
     * SP管理员修改企业
     * 修改企业，若任一参数为null或者不携带则不修改
     *
     * @param UpdateCorpRequest 请求对象
     * @return CompletableFuture<UpdateCorpResponse>
     */
    public CompletableFuture<UpdateCorpResponse> updateCorpAsync(UpdateCorpRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateCorp);
    }

    /**
     * 企业管理员修改企业注册信息
     * 企业管理员通过该接口修改企业注册信息。当前只支持修改地址。
     *
     * @param UpdateCorpBasicInfoRequest 请求对象
     * @return CompletableFuture<UpdateCorpBasicInfoResponse>
     */
    public CompletableFuture<UpdateCorpBasicInfoResponse> updateCorpBasicInfoAsync(UpdateCorpBasicInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateCorpBasicInfo);
    }

    /**
     * 修改部门
     * 企业管理员通过该接口修改部门。
     *
     * @param UpdateDepartmentRequest 请求对象
     * @return CompletableFuture<UpdateDepartmentResponse>
     */
    public CompletableFuture<UpdateDepartmentResponse> updateDepartmentAsync(UpdateDepartmentRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateDepartment);
    }

    /**
     * 修改终端
     * 企业管理员通过该接口修改终端。
     *
     * @param UpdateDeviceRequest 请求对象
     * @return CompletableFuture<UpdateDeviceResponse>
     */
    public CompletableFuture<UpdateDeviceResponse> updateDeviceAsync(UpdateDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateDevice);
    }

    /**
     * 更新全球窗素材
     * 更新全球窗素材
     *
     * @param UpdateMaterialRequest 请求对象
     * @return CompletableFuture<UpdateMaterialResponse>
     */
    public CompletableFuture<UpdateMaterialResponse> updateMaterialAsync(UpdateMaterialRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateMaterial);
    }

    /**
     * 修改用户云会议室
     * 企业用户登录后可以修改分配给用户的专用云会议室及个人云会议室。
     *
     * @param UpdateMemberVmrRequest 请求对象
     * @return CompletableFuture<UpdateMemberVmrResponse>
     */
    public CompletableFuture<UpdateMemberVmrResponse> updateMemberVmrAsync(UpdateMemberVmrRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateMemberVmr);
    }

    /**
     * 用户修改自己的信息
     * 企业用户通过该接口修改自己的信息。
     *
     * @param UpdateMyInfoRequest 请求对象
     * @return CompletableFuture<UpdateMyInfoResponse>
     */
    public CompletableFuture<UpdateMyInfoResponse> updateMyInfoAsync(UpdateMyInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateMyInfo);
    }

    /**
     * 更新全球窗节目
     * 更新全球窗节目
     *
     * @param UpdateProgramRequest 请求对象
     * @return CompletableFuture<UpdateProgramResponse>
     */
    public CompletableFuture<UpdateProgramResponse> updateProgramAsync(UpdateProgramRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateProgram);
    }

    /**
     * 修改全球窗发布
     * 修改全球窗发布
     *
     * @param UpdatePublicationRequest 请求对象
     * @return CompletableFuture<UpdatePublicationResponse>
     */
    public CompletableFuture<UpdatePublicationResponse> updatePublicationAsync(UpdatePublicationRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updatePublication);
    }

    /**
     * 修改密码
     * 企业成员通过该接口提供用户修改密码功能，服务器收到请求，修改用户密码并返回结果。
     *
     * @param UpdatePwdRequest 请求对象
     * @return CompletableFuture<UpdatePwdResponse>
     */
    public CompletableFuture<UpdatePwdResponse> updatePwdAsync(UpdatePwdRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updatePwd);
    }

    /**
     * 修改企业资源
     * 企业修改资源的过期时间、停用状态
     *
     * @param UpdateResourceRequest 请求对象
     * @return CompletableFuture<UpdateResourceResponse>
     */
    public CompletableFuture<UpdateResourceResponse> updateResourceAsync(UpdateResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateResource);
    }

    /**
     * 刷新Token
     * 该接口提供刷新Token功能，根据传入的Token，刷新Token失效时间并返回结果。
     *
     * @param UpdateTokenRequest 请求对象
     * @return CompletableFuture<UpdateTokenResponse>
     */
    public CompletableFuture<UpdateTokenResponse> updateTokenAsync(UpdateTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateToken);
    }

    /**
     * 修改用户
     * 企业管理员通过该接口修改企业用户。
     *
     * @param UpdateUserRequest 请求对象
     * @return CompletableFuture<UpdateUserResponse>
     */
    public CompletableFuture<UpdateUserResponse> updateUserAsync(UpdateUserRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateUser);
    }

}
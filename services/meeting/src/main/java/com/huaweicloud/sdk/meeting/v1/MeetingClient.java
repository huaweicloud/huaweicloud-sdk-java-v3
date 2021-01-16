package com.huaweicloud.sdk.meeting.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.meeting.v1.model.*;

public class MeetingClient {
    protected HcClient hcClient;

    public MeetingClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<MeetingClient> newBuilder() {
        return new ClientBuilder<>(MeetingClient::new, "MeetingCredentials");
    }


    /**
     * SP管理员创建企业
     * 创建企业，默认管理员及分配资源。
     *
     * @param AddCorpRequest 请求对象
     * @return AddCorpResponse
     */
    public AddCorpResponse addCorp(AddCorpRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addCorp);
    }

    /**
     * 添加企业管理员
     * 企业默认管理员添加企业普通管理员
     *
     * @param AddCorpAdminRequest 请求对象
     * @return AddCorpAdminResponse
     */
    public AddCorpAdminResponse addCorpAdmin(AddCorpAdminRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addCorpAdmin);
    }

    /**
     * 添加部门
     * 企业管理员通过该接口添加部门，最多支持10级部门，每级子部门最多支持100个，默认企业最大部门数量为3000个。
     *
     * @param AddDepartmentRequest 请求对象
     * @return AddDepartmentResponse
     */
    public AddDepartmentResponse addDepartment(AddDepartmentRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addDepartment);
    }

    /**
     * 增加终端
     * 企业管理员通过该接口添加硬终端。
     *
     * @param AddDeviceRequest 请求对象
     * @return AddDeviceResponse
     */
    public AddDeviceResponse addDevice(AddDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addDevice);
    }

    /**
     * 新增全球窗节目
     * 新增全球窗节目
     *
     * @param AddProgramRequest 请求对象
     * @return AddProgramResponse
     */
    public AddProgramResponse addProgram(AddProgramRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addProgram);
    }

    /**
     * 新增全球窗发布
     * 新增全球窗发布
     *
     * @param AddPublicationRequest 请求对象
     * @return AddPublicationResponse
     */
    public AddPublicationResponse addPublication(AddPublicationRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addPublication);
    }

    /**
     * 分配企业资源
     * 企业新增资源发放。优化适配，该接口同时支持修改，带resourceId后会判断该资源是否存在，存在即修改（支持修改的参数见修改接口），否则按新增处理
     *
     * @param AddResourceRequest 请求对象
     * @return AddResourceResponse
     */
    public AddResourceResponse addResource(AddResourceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addResource);
    }

    /**
     * 保存会议纪要到个人云空间
     * 用户使用手机扫码后，手机端请求服务端将当前会议纪要文件保存到个人云空间。二维码内容  cloudlink://cloudlink.huawei.com/h5page?action&#x3D;SAVE_MEETING_FILE&amp;key1&#x3D;value1&amp;key2&#x3D;value2    key/value的个数可能变化，终端解析后，在发起后续请求时，将所有key/value存为map，作为入参即可。
     *
     * @param AddToPersonalSpaceRequest 请求对象
     * @return AddToPersonalSpaceResponse
     */
    public AddToPersonalSpaceResponse addToPersonalSpace(AddToPersonalSpaceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addToPersonalSpace);
    }

    /**
     * 添加用户
     * 企业管理员通过该接口添加企业用户。
     *
     * @param AddUserRequest 请求对象
     * @return AddUserResponse
     */
    public AddUserResponse addUser(AddUserRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addUser);
    }

    /**
     * 与会者自己解除静音
     * 决定与会者是否可以自己解除静音。
     *
     * @param AllowGuestUnmuteRequest 请求对象
     * @return AllowGuestUnmuteResponse
     */
    public AllowGuestUnmuteResponse allowGuestUnmute(AllowGuestUnmuteRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.allowGuestUnmute);
    }

    /**
     * 分配专用云会议室
     * 企业管理员通过该接口将云会议室分配给用户、硬终端（当前仅支持分配TE10、TE20、HUAWEI Board、HUAWEI Bar 500及HUAWEI Box系列硬件终端）。云会议室分配给硬件终端后，需要重启或重新激活硬件终端。若需要管理云会议室、预约会议、录制会议或进行完整的会控操作，请同时将该云会议室分配给会议用户。
     *
     * @param AssociateVmrRequest 请求对象
     * @return AssociateVmrResponse
     */
    public AssociateVmrResponse associateVmr(AssociateVmrRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.associateVmr);
    }

    /**
     * 批量删除企业管理员
     * 批量删除企业管理员
     *
     * @param BatchDeleteCorpAdminsRequest 请求对象
     * @return BatchDeleteCorpAdminsResponse
     */
    public BatchDeleteCorpAdminsResponse batchDeleteCorpAdmins(BatchDeleteCorpAdminsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.batchDeleteCorpAdmins);
    }

    /**
     * 批量删除终端
     * 企业管理员通过该接口批量删除终端，返回删除失败的列表。
     *
     * @param BatchDeleteDevicesRequest 请求对象
     * @return BatchDeleteDevicesResponse
     */
    public BatchDeleteDevicesResponse batchDeleteDevices(BatchDeleteDevicesRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.batchDeleteDevices);
    }

    /**
     * 删除全球窗素材
     * 删除全球窗素材
     *
     * @param BatchDeleteMaterialsRequest 请求对象
     * @return BatchDeleteMaterialsResponse
     */
    public BatchDeleteMaterialsResponse batchDeleteMaterials(BatchDeleteMaterialsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.batchDeleteMaterials);
    }

    /**
     * 删除全球窗节目
     * 删除全球窗节目
     *
     * @param BatchDeleteProgramsRequest 请求对象
     * @return BatchDeleteProgramsResponse
     */
    public BatchDeleteProgramsResponse batchDeletePrograms(BatchDeleteProgramsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.batchDeletePrograms);
    }

    /**
     * 删除全球窗发布
     * 删除全球窗发布
     *
     * @param BatchDeletePublicationsRequest 请求对象
     * @return BatchDeletePublicationsResponse
     */
    public BatchDeletePublicationsResponse batchDeletePublications(BatchDeletePublicationsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.batchDeletePublications);
    }

    /**
     * 批量删除用户
     * 企业管理员通过该接口批量删除企业用户，全量成功或全量失败。
     *
     * @param BatchDeleteUsersRequest 请求对象
     * @return BatchDeleteUsersResponse
     */
    public BatchDeleteUsersResponse batchDeleteUsers(BatchDeleteUsersRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.batchDeleteUsers);
    }

    /**
     * 批量修改终端状态
     * 批量修改终端状态
     *
     * @param BatchUpdateDevicesStatusRequest 请求对象
     * @return BatchUpdateDevicesStatusResponse
     */
    public BatchUpdateDevicesStatusResponse batchUpdateDevicesStatus(BatchUpdateDevicesStatusRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.batchUpdateDevicesStatus);
    }

    /**
     * 批量修改用户状态
     * 企业管理员通过该接口批量修改用户状态，当用户账号数资源或者第三方电子白板资源到期后，若企业内对应资源的用户账号超过数量后会被系统随机自动停用，此时可通过该接口修改用户的状态。
     *
     * @param BatchUpdateUserStatusRequest 请求对象
     * @return BatchUpdateUserStatusResponse
     */
    public BatchUpdateUserStatusResponse batchUpdateUserStatus(BatchUpdateUserStatusRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.batchUpdateUserStatus);
    }

    /**
     * 广播会场
     * 同一时间，只允许一个与会者被广播。
     *
     * @param BroadcastParticipantRequest 请求对象
     * @return BroadcastParticipantResponse
     */
    public BroadcastParticipantResponse broadcastParticipant(BroadcastParticipantRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.broadcastParticipant);
    }

    /**
     * 取消预约会议
     * 取消预约会议。
     *
     * @param CancelMeetingRequest 请求对象
     * @return CancelMeetingResponse
     */
    public CancelMeetingResponse cancelMeeting(CancelMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.cancelMeeting);
    }

    /**
     * 校验滑块验证码
     * 该接口提供校验滑块验证码。服务器收到请求，返回校验结果。用户在前台界面通过滑块操作匹配图形，使得抠图和原图吻合。然后服务器进行校验滑块验证码。
     *
     * @param CheckSlideVerifyCodeRequest 请求对象
     * @return CheckSlideVerifyCodeResponse
     */
    public CheckSlideVerifyCodeResponse checkSlideVerifyCode(CheckSlideVerifyCodeRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.checkSlideVerifyCode);
    }

    /**
     * 校验Token
     * 该接口提供校验token合法性功能。服务器收到请求后，验证token合法性并返回结果。如果参数needGenNewToken为true时，生成新的token并返回。
     *
     * @param CheckTokenRequest 请求对象
     * @return CheckTokenResponse
     */
    public CheckTokenResponse checkToken(CheckTokenRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.checkToken);
    }

    /**
     * 校验手机和邮箱对应的验证码
     * 企业用户通过该接口校验手机和邮箱对应的验证码，一分钟内记录尝试次数不得超过5次。
     *
     * @param CheckVeriCodeForUpdateUserInfoRequest 请求对象
     * @return CheckVeriCodeForUpdateUserInfoResponse
     */
    public CheckVeriCodeForUpdateUserInfoResponse checkVeriCodeForUpdateUserInfo(CheckVeriCodeForUpdateUserInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.checkVeriCodeForUpdateUserInfo);
    }

    /**
     * 校验验证码
     * 该接口提供校验验证码，服务器收到请求，返回结果。
     *
     * @param CheckVerifyCodeRequest 请求对象
     * @return CheckVerifyCodeResponse
     */
    public CheckVerifyCodeResponse checkVerifyCode(CheckVerifyCodeRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.checkVerifyCode);
    }

    /**
     * 匿名用户会议鉴权
     * 未登陆终端，通过输入会议ID进行会议鉴权，返回鉴权随机数。如果需要密码则返回需要会议密码错误码，然后终端弹出输入会议ID输入框，用户输入密码后，终端再次调用该接口进行鉴权。
     *
     * @param CreateAnonymousAuthRandomRequest 请求对象
     * @return CreateAnonymousAuthRandomResponse
     */
    public CreateAnonymousAuthRandomResponse createAnonymousAuthRandom(CreateAnonymousAuthRandomRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.createAnonymousAuthRandom);
    }

    /**
     * 获取会控Token
     * 获取会控授权令牌，然后会议会被拉起。
     *
     * @param CreateConfTokenRequest 请求对象
     * @return CreateConfTokenResponse
     */
    public CreateConfTokenResponse createConfToken(CreateConfTokenRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.createConfToken);
    }

    /**
     * 创建会议
     * 您可根据需要创建立即会议和预约会议。
     *
     * @param CreateMeetingRequest 请求对象
     * @return CreateMeetingResponse
     */
    public CreateMeetingResponse createMeeting(CreateMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.createMeeting);
    }

    /**
     * 获取页面免登陆跳转的nonce信息
     * 通过token生成页面免登陆跳转到华为云会议的Portal的nonce信息。获取到nonce信息后，通过链接https://bmeeting.huaweicloud.com/?lang&#x3D;zh-CN&amp;nonce&#x3D;xxxxxxxxxxxxx#/login进行免登陆跳转。
     *
     * @param CreatePortalRefNonceRequest 请求对象
     * @return CreatePortalRefNonceResponse
     */
    public CreatePortalRefNonceResponse createPortalRefNonce(CreatePortalRefNonceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.createPortalRefNonce);
    }

    /**
     * 删除与会者
     * 删除与会者。
     *
     * @param DeleteAttendeesRequest 请求对象
     * @return DeleteAttendeesResponse
     */
    public DeleteAttendeesResponse deleteAttendees(DeleteAttendeesRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.deleteAttendees);
    }

    /**
     * SP管理员删除企业
     * 删除企业
     *
     * @param DeleteCorpRequest 请求对象
     * @return DeleteCorpResponse
     */
    public DeleteCorpResponse deleteCorp(DeleteCorpRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.deleteCorp);
    }

    /**
     * 删除专用云会议室
     * 企业管理员通过该接口删除企业的专用云会议室
     *
     * @param DeleteCorpVmrRequest 请求对象
     * @return DeleteCorpVmrResponse
     */
    public DeleteCorpVmrResponse deleteCorpVmr(DeleteCorpVmrRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.deleteCorpVmr);
    }

    /**
     * 删除部门
     * 企业管理员通过该接口删除部门。
     *
     * @param DeleteDepartmentRequest 请求对象
     * @return DeleteDepartmentResponse
     */
    public DeleteDepartmentResponse deleteDepartment(DeleteDepartmentRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.deleteDepartment);
    }

    /**
     * 批量删除录制
     * 批量删除录制。
     *
     * @param DeleteRecordingsRequest 请求对象
     * @return DeleteRecordingsResponse
     */
    public DeleteRecordingsResponse deleteRecordings(DeleteRecordingsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.deleteRecordings);
    }

    /**
     * 删除企业资源
     * 企业删除资源项，删除资源项后，企业资源总数会自动减少
     *
     * @param DeleteResourceRequest 请求对象
     * @return DeleteResourceResponse
     */
    public DeleteResourceResponse deleteResource(DeleteResourceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.deleteResource);
    }

    /**
     * 从用户或终端回收企业专用VMR
     * 给企业用户回收vmr，需要做好纵向越权校验，避免企业管理员给其他企业的账号分配
     *
     * @param DisassociateVmrRequest 请求对象
     * @return DisassociateVmrResponse
     */
    public DisassociateVmrResponse disassociateVmr(DisassociateVmrRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.disassociateVmr);
    }

    /**
     * 编辑预约会议
     * 编辑预约会议。会议开始后，不能被编辑。
     *
     * @param EditMeetingRequest 请求对象
     * @return EditMeetingResponse
     */
    public EditMeetingResponse editMeeting(EditMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.editMeeting);
    }

    /**
     * 举手
     * 所有来宾可以举手。来宾举手后，可以取消自己的举手。主持人可以取消所有来宾的举手。
     *
     * @param HandRequest 请求对象
     * @return HandResponse
     */
    public HandResponse hand(HandRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.hand);
    }

    /**
     * 挂断与会者
     * 挂断正在通话中的与会者。
     *
     * @param HangUpRequest 请求对象
     * @return HangUpResponse
     */
    public HangUpResponse hangUp(HangUpRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.hangUp);
    }

    /**
     * 邀请与会者
     * 邀请与会者加入会议。
     *
     * @param InviteParticipantRequest 请求对象
     * @return InviteParticipantResponse
     */
    public InviteParticipantResponse inviteParticipant(InviteParticipantRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.inviteParticipant);
    }

    /**
     * 通过会议ID和密码邀请与会者
     * 通过会议ID和密码邀请与会者
     *
     * @param InviteWithPwdRequest 请求对象
     * @return InviteWithPwdResponse
     */
    public InviteWithPwdResponse inviteWithPwd(InviteWithPwdRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.inviteWithPwd);
    }

    /**
     * 启停会议直播
     * 启动或停止会议直播。
     *
     * @param LiveRequest 请求对象
     * @return LiveResponse
     */
    public LiveResponse live(LiveRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.live);
    }

    /**
     * 锁定会议
     * 锁定或解锁会议。锁定会议后，不允许与会者加入会议。
     *
     * @param LockMeetingRequest 请求对象
     * @return LockMeetingResponse
     */
    public LockMeetingResponse lockMeeting(LockMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.lockMeeting);
    }

    /**
     * 锁定会场视频源
     * 锁定或者解锁某在线会场的视频源。
     *
     * @param LockViewRequest 请求对象
     * @return LockViewResponse
     */
    public LockViewResponse lockView(LockViewRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.lockView);
    }

    /**
     * 全场静音
     * 主持人可以通过该接口静音/取消静音整个会议所有与会者（主持人除外）。
     *
     * @param MuteMeetingRequest 请求对象
     * @return MuteMeetingResponse
     */
    public MuteMeetingResponse muteMeeting(MuteMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.muteMeeting);
    }

    /**
     * 静音与会者
     * 主持人可以静音/取消静音任意与会者，来宾也可静音/取消静音自己。
     *
     * @param MuteParticipantRequest 请求对象
     * @return MuteParticipantResponse
     */
    public MuteParticipantResponse muteParticipant(MuteParticipantRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.muteParticipant);
    }

    /**
     * 延长会议
     * 延长会议。
     *
     * @param ProlongMeetingRequest 请求对象
     * @return ProlongMeetingResponse
     */
    public ProlongMeetingResponse prolongMeeting(ProlongMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.prolongMeeting);
    }

    /**
     * 启停会议录制
     * 启动或停止会议录制。
     *
     * @param RecordRequest 请求对象
     * @return RecordResponse
     */
    public RecordResponse record(RecordRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.record);
    }

    /**
     * 重命名与会者
     * 重命名某个与会者。
     *
     * @param RenameParticipantRequest 请求对象
     * @return RenameParticipantResponse
     */
    public RenameParticipantResponse renameParticipant(RenameParticipantRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.renameParticipant);
    }

    /**
     * 重置激活码
     * 当硬终端激活码失效时，企业管理员可以通过该接口重置激活码，使用重新获取的激活码激活终端，每24小时可重新激活5次。
     *
     * @param ResetActivecodeRequest 请求对象
     * @return ResetActivecodeResponse
     */
    public ResetActivecodeResponse resetActivecode(ResetActivecodeRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.resetActivecode);
    }

    /**
     * 用户重置密码
     * 该接口提供给用户重置密码功能，服务器收到请求，重新设置用户密码并返回结果。
     *
     * @param ResetPwdRequest 请求对象
     * @return ResetPwdResponse
     */
    public ResetPwdResponse resetPwd(ResetPwdRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.resetPwd);
    }

    /**
     * 企业管理员重置企业成员密码
     * 企业管理员通过该接口提供企业管理员重置企业成员密码的功能。当服务器收到重置密码的请求时，发送新的密码到企业成员的邮箱或者短信，并返回结果。
     *
     * @param ResetPwdByAdminRequest 请求对象
     * @return ResetPwdByAdminResponse
     */
    public ResetPwdByAdminResponse resetPwdByAdmin(ResetPwdByAdminRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.resetPwdByAdmin);
    }

    /**
     * 点名会场
     * 同一时间，只允许一个与会者被点名。点名会场的效果是除了主持人外，点名与会者为非静音状态，未点名的与会者统一为静音状态。
     *
     * @param RollcallParticipantRequest 请求对象
     * @return RollcallParticipantResponse
     */
    public RollcallParticipantResponse rollcallParticipant(RollcallParticipantRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.rollcallParticipant);
    }

    /**
     * 查询历史会议的与会者记录
     * 查询指定历史会议的与会者记录。
     *
     * @param SearchAttendanceRecordsOfHisMeetingRequest 请求对象
     * @return SearchAttendanceRecordsOfHisMeetingResponse
     */
    public SearchAttendanceRecordsOfHisMeetingResponse searchAttendanceRecordsOfHisMeeting(SearchAttendanceRecordsOfHisMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchAttendanceRecordsOfHisMeeting);
    }

    /**
     * SP管理员分页搜索企业
     * 分页搜索企业,支持名称、企业ID搜索
     *
     * @param SearchCorpRequest 请求对象
     * @return SearchCorpResponse
     */
    public SearchCorpResponse searchCorp(SearchCorpRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchCorp);
    }

    /**
     * 分页查询企业管理员
     * 通过该接口分页查询企业管理员。
     *
     * @param SearchCorpAdminsRequest 请求对象
     * @return SearchCorpAdminsResponse
     */
    public SearchCorpAdminsResponse searchCorpAdmins(SearchCorpAdminsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchCorpAdmins);
    }

    /**
     * 查询企业通讯录
     * 企业用户（含管理员）通过该接口查询该企业的通讯录。
     *
     * @param SearchCorpDirRequest 请求对象
     * @return SearchCorpDirResponse
     */
    public SearchCorpDirResponse searchCorpDir(SearchCorpDirRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchCorpDir);
    }

    /**
     * 分页查询专用云会议室
     * 企业管理员通过该接口分页查询企业的专用云会议室。
     *
     * @param SearchCorpVmrRequest 请求对象
     * @return SearchCorpVmrResponse
     */
    public SearchCorpVmrResponse searchCorpVmr(SearchCorpVmrRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchCorpVmr);
    }

    /**
     * 查询历史会议的会控记录
     * 查询指定历史会议的会控记录。
     *
     * @param SearchCtlRecordsOfHisMeetingRequest 请求对象
     * @return SearchCtlRecordsOfHisMeetingResponse
     */
    public SearchCtlRecordsOfHisMeetingResponse searchCtlRecordsOfHisMeeting(SearchCtlRecordsOfHisMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchCtlRecordsOfHisMeeting);
    }

    /**
     * 按名称查询所有的部门
     * 企业管理员通过该接口按名称查询所有的部门。
     *
     * @param SearchDepartmentByNameRequest 请求对象
     * @return SearchDepartmentByNameResponse
     */
    public SearchDepartmentByNameResponse searchDepartmentByName(SearchDepartmentByNameRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchDepartmentByName);
    }

    /**
     * 分页查询终端
     * 企业管理员通过该接口分页查询终端信息。
     *
     * @param SearchDevicesRequest 请求对象
     * @return SearchDevicesResponse
     */
    public SearchDevicesResponse searchDevices(SearchDevicesRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchDevices);
    }

    /**
     * 查询历史会议列表
     * 管理员可以查询管理权限域内所有的历史会议，普通用户仅能查询当前帐号管理的历史会议。不带查询参数时，默认查询权限范围内的历史会议。
     *
     * @param SearchHisMeetingsRequest 请求对象
     * @return SearchHisMeetingsResponse
     */
    public SearchHisMeetingsResponse searchHisMeetings(SearchHisMeetingsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchHisMeetings);
    }

    /**
     * 分页查询全球窗素材
     * 分页查询全球窗素材
     *
     * @param SearchMaterialsRequest 请求对象
     * @return SearchMaterialsResponse
     */
    public SearchMaterialsResponse searchMaterials(SearchMaterialsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchMaterials);
    }

    /**
     * 查询会议纪要列表
     * 用户查询自己的会议纪要列表
     *
     * @param SearchMeetingFileListRequest 请求对象
     * @return SearchMeetingFileListResponse
     */
    public SearchMeetingFileListResponse searchMeetingFileList(SearchMeetingFileListRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchMeetingFileList);
    }

    /**
     * 查询会议列表
     * 管理员可以查询管理权限域内所有的会议，普通用户仅能查询当前帐号管理的会议。不带查询参数时，默认查询权限范围内正在召开或还未召开的会议。
     *
     * @param SearchMeetingsRequest 请求对象
     * @return SearchMeetingsResponse
     */
    public SearchMeetingsResponse searchMeetings(SearchMeetingsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchMeetings);
    }

    /**
     * 分页查询用户云会议室
     * 企业用户通过该接口查询个人已分配的云会议室，包括个人及专用两种。
     *
     * @param SearchMemberVmrRequest 请求对象
     * @return SearchMemberVmrResponse
     */
    public SearchMemberVmrResponse searchMemberVmr(SearchMemberVmrRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchMemberVmr);
    }

    /**
     * 查询在线会议列表
     * 管理员可以查询管理权限域内所有在线会议，普通用户仅能查询当前自己帐号管理的在线会议。不带查询参数时，默认查询权限范围内的在线会议，按开始时间升序排列。
     *
     * @param SearchOnlineMeetingsRequest 请求对象
     * @return SearchOnlineMeetingsResponse
     */
    public SearchOnlineMeetingsResponse searchOnlineMeetings(SearchOnlineMeetingsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchOnlineMeetings);
    }

    /**
     * 查询全球窗节目
     * 获取全球窗节目
     *
     * @param SearchProgramsRequest 请求对象
     * @return SearchProgramsResponse
     */
    public SearchProgramsResponse searchPrograms(SearchProgramsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchPrograms);
    }

    /**
     * 查询全球窗发布
     * 获取全球窗发布
     *
     * @param SearchPublicationsRequest 请求对象
     * @return SearchPublicationsResponse
     */
    public SearchPublicationsResponse searchPublications(SearchPublicationsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchPublications);
    }

    /**
     * 查询录制列表
     * 管理员可以查询管理权限域内所有的录制，普通用户仅能查询当前帐号管理的录制。不带查询参数时，默认查询权限范围内的录制。
     *
     * @param SearchRecordingsRequest 请求对象
     * @return SearchRecordingsResponse
     */
    public SearchRecordingsResponse searchRecordings(SearchRecordingsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchRecordings);
    }

    /**
     * 分页查询企业资源
     * sp根据条件查询企业的资源项
     *
     * @param SearchResourceRequest 请求对象
     * @return SearchResourceResponse
     */
    public SearchResourceResponse searchResource(SearchResourceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchResource);
    }

    /**
     * 分页查询企业资源操作记录
     * sp根据条件查询企业的资源操作记录，支持根据resourceId模糊搜索
     *
     * @param SearchResourceOpRecordRequest 请求对象
     * @return SearchResourceOpRecordResponse
     */
    public SearchResourceOpRecordResponse searchResourceOpRecord(SearchResourceOpRecordRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchResourceOpRecord);
    }

    /**
     * 分页查询用户
     * 企业管理员通过该接口分页查询企业用户。
     *
     * @param SearchUsersRequest 请求对象
     * @return SearchUsersResponse
     */
    public SearchUsersResponse searchUsers(SearchUsersRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchUsers);
    }

    /**
     * 发送滑块验证码
     * 该接口提供发送滑块验证码。服务器收到请求，返回抠图以及抠图后的原图等结果。需要在前台界面显示出抠图以及抠图后的原图，用户通过滑块操作来匹配图形。
     *
     * @param SendSlideVerifyCodeRequest 请求对象
     * @return SendSlideVerifyCodeResponse
     */
    public SendSlideVerifyCodeResponse sendSlideVerifyCode(SendSlideVerifyCodeRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.sendSlideVerifyCode);
    }

    /**
     * 发送验证码
     * 该接口提供发送验证码，服务器收到请求，发送验证码到邮箱或者短信并返回结果。用户在前台界面通过滑块验证后，再进行发送验证码操作。
     *
     * @param SendVeriCodeForChangePwdRequest 请求对象
     * @return SendVeriCodeForChangePwdResponse
     */
    public SendVeriCodeForChangePwdResponse sendVeriCodeForChangePwd(SendVeriCodeForChangePwdRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.sendVeriCodeForChangePwd);
    }

    /**
     * 获取验证码
     * 获取验证码，向手机或邮箱发送，一分钟内只会发送一次。
     *
     * @param SendVeriCodeForUpdateUserInfoRequest 请求对象
     * @return SendVeriCodeForUpdateUserInfoResponse
     */
    public SendVeriCodeForUpdateUserInfoResponse sendVeriCodeForUpdateUserInfo(SendVeriCodeForUpdateUserInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.sendVeriCodeForUpdateUserInfo);
    }

    /**
     * 设置自定义多画面
     * 场景描述：会议管理员在confportal手动设置多画面 功能描述：提供给会议管理员手动设置多画面的功能
     *
     * @param SetCustomMultiPictureRequest 请求对象
     * @return SetCustomMultiPictureResponse
     */
    public SetCustomMultiPictureResponse setCustomMultiPicture(SetCustomMultiPictureRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.setCustomMultiPicture);
    }

    /**
     * 主持人选看
     * 用于主持人轮询、主持人选看多画面、主持人选看会场操作。目前只适用于硬终端为主持人的场景。
     *
     * @param SetHostViewRequest 请求对象
     * @return SetHostViewResponse
     */
    public SetHostViewResponse setHostView(SetHostViewRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.setHostView);
    }

    /**
     * 设置多画面
     * 设置会议多画面。
     *
     * @param SetMultiPictureRequest 请求对象
     * @return SetMultiPictureResponse
     */
    public SetMultiPictureResponse setMultiPicture(SetMultiPictureRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.setMultiPicture);
    }

    /**
     * 会场选看
     * 目前只适用于硬终端选看其他会场人的场景。
     *
     * @param SetParticipantViewRequest 请求对象
     * @return SetParticipantViewResponse
     */
    public SetParticipantViewResponse setParticipantView(SetParticipantViewRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.setParticipantView);
    }

    /**
     * 申请主持人
     * 申请或释放主持人。普通用户可申请主持人，主持人可释放主持人权限。
     *
     * @param SetRoleRequest 请求对象
     * @return SetRoleResponse
     */
    public SetRoleResponse setRole(SetRoleRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.setRole);
    }

    /**
     * 通过会议ID查询企业ID
     * 与某个会议在同一个SP下的用户，可以通过会议ID查询到该会议对应的企业ID。
     *
     * @param ShowConfOrgRequest 请求对象
     * @return ShowConfOrgResponse
     */
    public ShowConfOrgResponse showConfOrg(ShowConfOrgRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showConfOrg);
    }

    /**
     * SP管理员查询企业
     * 获取企业
     *
     * @param ShowCorpRequest 请求对象
     * @return ShowCorpResponse
     */
    public ShowCorpResponse showCorp(ShowCorpRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showCorp);
    }

    /**
     * 查询企业管理员
     * 通过该接口查询企业管理员。
     *
     * @param ShowCorpAdminRequest 请求对象
     * @return ShowCorpAdminResponse
     */
    public ShowCorpAdminResponse showCorpAdmin(ShowCorpAdminRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showCorpAdmin);
    }

    /**
     * 企业管理员查询企业注册信息
     * 企业管理员通过该接口查询企业注册信息。
     *
     * @param ShowCorpBasicInfoRequest 请求对象
     * @return ShowCorpBasicInfoResponse
     */
    public ShowCorpBasicInfoResponse showCorpBasicInfo(ShowCorpBasicInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showCorpBasicInfo);
    }

    /**
     * 企业管理员查询企业内资源及业务权限
     * 企业管理员通过该接口查询企业内资源及业务权限，包括查询已使用的资源情况。
     *
     * @param ShowCorpResourceRequest 请求对象
     * @return ShowCorpResourceResponse
     */
    public ShowCorpResourceResponse showCorpResource(ShowCorpResourceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showCorpResource);
    }

    /**
     * 查询部门及其一级子部门列表
     * 企业管理员通过该接口查询部门及其一级子部门列表。
     *
     * @param ShowDeptAndChildDeptRequest 请求对象
     * @return ShowDeptAndChildDeptResponse
     */
    public ShowDeptAndChildDeptResponse showDeptAndChildDept(ShowDeptAndChildDeptRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showDeptAndChildDept);
    }

    /**
     * 查询终端详情
     * 企业管理员通过该接口查询终端详情。
     *
     * @param ShowDeviceDetailRequest 请求对象
     * @return ShowDeviceDetailResponse
     */
    public ShowDeviceDetailResponse showDeviceDetail(ShowDeviceDetailRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showDeviceDetail);
    }

    /**
     * 查询设备状态
     * 调用本接口可以查询硬终端的状态。 硬终端与发起查询请求的帐号需在同一企业下，否则会鉴权失败。 
     *
     * @param ShowDeviceStatusRequest 请求对象
     * @return ShowDeviceStatusResponse
     */
    public ShowDeviceStatusResponse showDeviceStatus(ShowDeviceStatusRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showDeviceStatus);
    }

    /**
     * 获取所有终端类型
     * 企业管理员通过该接口获取所有的终端类型。
     *
     * @param ShowDeviceTypesRequest 请求对象
     * @return ShowDeviceTypesResponse
     */
    public ShowDeviceTypesResponse showDeviceTypes(ShowDeviceTypesRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showDeviceTypes);
    }

    /**
     * 查询历史会议详情
     * 管理员可以查询管理权限域内所有的历史会议详情，普通用户仅能查询当前帐号管理的历史会议详情。
     *
     * @param ShowHisMeetingDetailRequest 请求对象
     * @return ShowHisMeetingDetailResponse
     */
    public ShowHisMeetingDetailResponse showHisMeetingDetail(ShowHisMeetingDetailRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showHisMeetingDetail);
    }

    /**
     * 查询会议详情
     * 管理员可以查询管理权限域内所有会议的详情，普通用户仅能查询当前帐号管理的会议详情。
     *
     * @param ShowMeetingDetailRequest 请求对象
     * @return ShowMeetingDetailResponse
     */
    public ShowMeetingDetailResponse showMeetingDetail(ShowMeetingDetailRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showMeetingDetail);
    }

    /**
     * 查询会议纪要详情
     * 用户查询单个会议纪要详情（主要目的是为了得到外链）。 IdeaHub是使用fileCode来查，所以终端保持一致。
     *
     * @param ShowMeetingFileRequest 请求对象
     * @return ShowMeetingFileResponse
     */
    public ShowMeetingFileResponse showMeetingFile(ShowMeetingFileRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showMeetingFile);
    }

    /**
     * 打开会议纪要文件列表
     * 用户使用手机扫码后，手机端请求服务端，让服务端通知指定IdeaHub打开指定用户的会议纪要文件列表。二维码内容  cloudlink://cloudlink.huawei.com/h5page?action&#x3D;OPEN_MEETING_FILE_LIST&amp;key1&#x3D;value1&amp;key2&#x3D;value2    key/value的个数可能变化，终端解析后，在发起后续请求时，将所有key/value存为map，作为入参即可。
     *
     * @param ShowMeetingFileListRequest 请求对象
     * @return ShowMeetingFileListResponse
     */
    public ShowMeetingFileListResponse showMeetingFileList(ShowMeetingFileListRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showMeetingFileList);
    }

    /**
     * 用户查询自己的信息
     * 企业用户通过该接口查询自己的信息。
     *
     * @param ShowMyInfoRequest 请求对象
     * @return ShowMyInfoResponse
     */
    public ShowMyInfoResponse showMyInfo(ShowMyInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showMyInfo);
    }

    /**
     * 查询在线会议详情
     * 管理员可以查询管理权限域内所有的在线会议详情，普通用户仅能查询当前自己的帐号管理的在线会议详情。
     *
     * @param ShowOnlineMeetingDetailRequest 请求对象
     * @return ShowOnlineMeetingDetailResponse
     */
    public ShowOnlineMeetingDetailResponse showOnlineMeetingDetail(ShowOnlineMeetingDetailRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showOnlineMeetingDetail);
    }

    /**
     * 查询企业的资源使用信息
     * 企业管理员查询资源使用信息
     *
     * @param ShowOrgResRequest 请求对象
     * @return ShowOrgResResponse
     */
    public ShowOrgResResponse showOrgRes(ShowOrgResRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showOrgRes);
    }

    /**
     * 根据ID查询节目详情
     * 根据ID获取节目详情
     *
     * @param ShowProgramRequest 请求对象
     * @return ShowProgramResponse
     */
    public ShowProgramResponse showProgram(ShowProgramRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showProgram);
    }

    /**
     * 根据ID查询全球窗发布详情
     * 根据ID获取发布详情
     *
     * @param ShowPublicationRequest 请求对象
     * @return ShowPublicationResponse
     */
    public ShowPublicationResponse showPublication(ShowPublicationRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showPublication);
    }

    /**
     * 查询会议实时信息
     * 查询会议实时信息
     *
     * @param ShowRealTimeInfoOfMeetingRequest 请求对象
     * @return ShowRealTimeInfoOfMeetingResponse
     */
    public ShowRealTimeInfoOfMeetingResponse showRealTimeInfoOfMeeting(ShowRealTimeInfoOfMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showRealTimeInfoOfMeeting);
    }

    /**
     * 查询录制详情
     * 查询某个录制详情。
     *
     * @param ShowRecordingDetailRequest 请求对象
     * @return ShowRecordingDetailResponse
     */
    public ShowRecordingDetailResponse showRecordingDetail(ShowRecordingDetailRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showRecordingDetail);
    }

    /**
     * 查询会议所在区域信息
     * 查询会议所在区域信息，如果会议不存在或者会议未召开，返回对应的错误码。
     *
     * @param ShowRegionInfoOfMeetingRequest 请求对象
     * @return ShowRegionInfoOfMeetingResponse
     */
    public ShowRegionInfoOfMeetingResponse showRegionInfoOfMeeting(ShowRegionInfoOfMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showRegionInfoOfMeeting);
    }

    /**
     * 查询SP的共享资源使用信息
     * SP管理查询所属SP的共享资源使用信息
     *
     * @param ShowSpResRequest 请求对象
     * @return ShowSpResResponse
     */
    public ShowSpResResponse showSpRes(ShowSpResRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showSpRes);
    }

    /**
     * 查询用户详情
     * 企业管理员通过该接口查询企业用户详情
     *
     * @param ShowUserDetailRequest 请求对象
     * @return ShowUserDetailResponse
     */
    public ShowUserDetailResponse showUserDetail(ShowUserDetailRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showUserDetail);
    }

    /**
     * 结束会议
     * 结束会议。
     *
     * @param StopMeetingRequest 请求对象
     * @return StopMeetingResponse
     */
    public StopMeetingResponse stopMeeting(StopMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.stopMeeting);
    }

    /**
     * 切换视频显示策略
     * 切换视频显示策略
     *
     * @param SwitchModeRequest 请求对象
     * @return SwitchModeResponse
     */
    public SwitchModeResponse switchMode(SwitchModeRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.switchMode);
    }

    /**
     * 修改手机或邮箱
     * 企业用户通过该接口修改手机或邮箱，需要先获取验证码，验证多次失败会禁止修改。
     *
     * @param UpdateContactRequest 请求对象
     * @return UpdateContactResponse
     */
    public UpdateContactResponse updateContact(UpdateContactRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateContact);
    }

    /**
     * SP管理员修改企业
     * 修改企业，若任一参数为null或者不携带则不修改
     *
     * @param UpdateCorpRequest 请求对象
     * @return UpdateCorpResponse
     */
    public UpdateCorpResponse updateCorp(UpdateCorpRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateCorp);
    }

    /**
     * 企业管理员修改企业注册信息
     * 企业管理员通过该接口修改企业注册信息。当前只支持修改地址。
     *
     * @param UpdateCorpBasicInfoRequest 请求对象
     * @return UpdateCorpBasicInfoResponse
     */
    public UpdateCorpBasicInfoResponse updateCorpBasicInfo(UpdateCorpBasicInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateCorpBasicInfo);
    }

    /**
     * 修改部门
     * 企业管理员通过该接口修改部门。
     *
     * @param UpdateDepartmentRequest 请求对象
     * @return UpdateDepartmentResponse
     */
    public UpdateDepartmentResponse updateDepartment(UpdateDepartmentRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateDepartment);
    }

    /**
     * 修改终端
     * 企业管理员通过该接口修改终端。
     *
     * @param UpdateDeviceRequest 请求对象
     * @return UpdateDeviceResponse
     */
    public UpdateDeviceResponse updateDevice(UpdateDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateDevice);
    }

    /**
     * 更新全球窗素材
     * 更新全球窗素材
     *
     * @param UpdateMaterialRequest 请求对象
     * @return UpdateMaterialResponse
     */
    public UpdateMaterialResponse updateMaterial(UpdateMaterialRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateMaterial);
    }

    /**
     * 修改用户云会议室
     * 企业用户登录后可以修改分配给用户的专用云会议室及个人云会议室。
     *
     * @param UpdateMemberVmrRequest 请求对象
     * @return UpdateMemberVmrResponse
     */
    public UpdateMemberVmrResponse updateMemberVmr(UpdateMemberVmrRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateMemberVmr);
    }

    /**
     * 用户修改自己的信息
     * 企业用户通过该接口修改自己的信息。
     *
     * @param UpdateMyInfoRequest 请求对象
     * @return UpdateMyInfoResponse
     */
    public UpdateMyInfoResponse updateMyInfo(UpdateMyInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateMyInfo);
    }

    /**
     * 更新全球窗节目
     * 更新全球窗节目
     *
     * @param UpdateProgramRequest 请求对象
     * @return UpdateProgramResponse
     */
    public UpdateProgramResponse updateProgram(UpdateProgramRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateProgram);
    }

    /**
     * 修改全球窗发布
     * 修改全球窗发布
     *
     * @param UpdatePublicationRequest 请求对象
     * @return UpdatePublicationResponse
     */
    public UpdatePublicationResponse updatePublication(UpdatePublicationRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updatePublication);
    }

    /**
     * 修改密码
     * 企业成员通过该接口提供用户修改密码功能，服务器收到请求，修改用户密码并返回结果。
     *
     * @param UpdatePwdRequest 请求对象
     * @return UpdatePwdResponse
     */
    public UpdatePwdResponse updatePwd(UpdatePwdRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updatePwd);
    }

    /**
     * 修改企业资源
     * 企业修改资源的过期时间、停用状态
     *
     * @param UpdateResourceRequest 请求对象
     * @return UpdateResourceResponse
     */
    public UpdateResourceResponse updateResource(UpdateResourceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateResource);
    }

    /**
     * 刷新Token
     * 该接口提供刷新Token功能，根据传入的Token，刷新Token失效时间并返回结果。
     *
     * @param UpdateTokenRequest 请求对象
     * @return UpdateTokenResponse
     */
    public UpdateTokenResponse updateToken(UpdateTokenRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateToken);
    }

    /**
     * 修改用户
     * 企业管理员通过该接口修改企业用户。
     *
     * @param UpdateUserRequest 请求对象
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUser(UpdateUserRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateUser);
    }

}
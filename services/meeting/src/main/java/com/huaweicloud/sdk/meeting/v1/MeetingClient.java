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
        return new ClientBuilder<>(MeetingClient::new);
    }

    public AddCorpResponse addCorp(AddCorpRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addCorp);
    }

    public AddCorpAdminResponse addCorpAdmin(AddCorpAdminRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addCorpAdmin);
    }

    public AddDepartmentResponse addDepartment(AddDepartmentRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addDepartment);
    }

    public AddDeviceResponse addDevice(AddDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addDevice);
    }

    public AddResourceResponse addResource(AddResourceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addResource);
    }

    public AddUserResponse addUser(AddUserRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addUser);
    }

    public AllowGuestUnmuteResponse allowGuestUnmute(AllowGuestUnmuteRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.allowGuestUnmute);
    }

    public AssociateVmrResponse associateVmr(AssociateVmrRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.associateVmr);
    }

    public BatchDeleteCorpAdminsResponse batchDeleteCorpAdmins(BatchDeleteCorpAdminsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.batchDeleteCorpAdmins);
    }

    public BatchDeleteDevicesResponse batchDeleteDevices(BatchDeleteDevicesRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.batchDeleteDevices);
    }

    public BatchDeleteUsersResponse batchDeleteUsers(BatchDeleteUsersRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.batchDeleteUsers);
    }

    public BatchUpdateDevicesStatusResponse batchUpdateDevicesStatus(BatchUpdateDevicesStatusRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.batchUpdateDevicesStatus);
    }

    public BatchUpdateUserStatusResponse batchUpdateUserStatus(BatchUpdateUserStatusRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.batchUpdateUserStatus);
    }

    public BroadcastParticipantResponse broadcastParticipant(BroadcastParticipantRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.broadcastParticipant);
    }

    public CancelMeetingResponse cancelMeeting(CancelMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.cancelMeeting);
    }

    public CheckSlideVerifyCodeResponse checkSlideVerifyCode(CheckSlideVerifyCodeRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.checkSlideVerifyCode);
    }

    public CheckTokenResponse checkToken(CheckTokenRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.checkToken);
    }

    public CheckVeriCodeForUpdateUserInfoResponse checkVeriCodeForUpdateUserInfo(CheckVeriCodeForUpdateUserInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.checkVeriCodeForUpdateUserInfo);
    }

    public CheckVerifyCodeResponse checkVerifyCode(CheckVerifyCodeRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.checkVerifyCode);
    }

    public CreateAnonymousAuthRandomResponse createAnonymousAuthRandom(CreateAnonymousAuthRandomRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.createAnonymousAuthRandom);
    }

    public CreateConfTokenResponse createConfToken(CreateConfTokenRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.createConfToken);
    }

    public CreateMeetingResponse createMeeting(CreateMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.createMeeting);
    }

    public DeleteAttendeesResponse deleteAttendees(DeleteAttendeesRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.deleteAttendees);
    }

    public DeleteCorpResponse deleteCorp(DeleteCorpRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.deleteCorp);
    }

    public DeleteCorpVmrResponse deleteCorpVmr(DeleteCorpVmrRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.deleteCorpVmr);
    }

    public DeleteDepartmentResponse deleteDepartment(DeleteDepartmentRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.deleteDepartment);
    }

    public DeleteRecordingsResponse deleteRecordings(DeleteRecordingsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.deleteRecordings);
    }

    public DeleteResourceResponse deleteResource(DeleteResourceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.deleteResource);
    }

    public DisassociateVmrResponse disassociateVmr(DisassociateVmrRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.disassociateVmr);
    }

    public EditMeetingResponse editMeeting(EditMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.editMeeting);
    }

    public HandResponse hand(HandRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.hand);
    }

    public HangUpResponse hangUp(HangUpRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.hangUp);
    }

    public InviteParticipantResponse inviteParticipant(InviteParticipantRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.inviteParticipant);
    }

    public LiveResponse live(LiveRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.live);
    }

    public LockMeetingResponse lockMeeting(LockMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.lockMeeting);
    }

    public LockViewResponse lockView(LockViewRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.lockView);
    }

    public MuteMeetingResponse muteMeeting(MuteMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.muteMeeting);
    }

    public MuteParticipantResponse muteParticipant(MuteParticipantRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.muteParticipant);
    }

    public ProlongMeetingResponse prolongMeeting(ProlongMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.prolongMeeting);
    }

    public RecordResponse record(RecordRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.record);
    }

    public RenameParticipantResponse renameParticipant(RenameParticipantRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.renameParticipant);
    }

    public ResetActivecodeResponse resetActivecode(ResetActivecodeRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.resetActivecode);
    }

    public ResetPwdResponse resetPwd(ResetPwdRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.resetPwd);
    }

    public ResetPwdByAdminResponse resetPwdByAdmin(ResetPwdByAdminRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.resetPwdByAdmin);
    }

    public RollcallParticipantResponse rollcallParticipant(RollcallParticipantRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.rollcallParticipant);
    }

    public SearchAttendanceRecordsOfHisMeetingResponse searchAttendanceRecordsOfHisMeeting(SearchAttendanceRecordsOfHisMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchAttendanceRecordsOfHisMeeting);
    }

    public SearchCorpResponse searchCorp(SearchCorpRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchCorp);
    }

    public SearchCorpAdminsResponse searchCorpAdmins(SearchCorpAdminsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchCorpAdmins);
    }

    public SearchCorpDirResponse searchCorpDir(SearchCorpDirRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchCorpDir);
    }

    public SearchCorpVmrResponse searchCorpVmr(SearchCorpVmrRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchCorpVmr);
    }

    public SearchCtlRecordsOfHisMeetingResponse searchCtlRecordsOfHisMeeting(SearchCtlRecordsOfHisMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchCtlRecordsOfHisMeeting);
    }

    public SearchDepartmentByNameResponse searchDepartmentByName(SearchDepartmentByNameRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchDepartmentByName);
    }

    public SearchDevicesResponse searchDevices(SearchDevicesRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchDevices);
    }

    public SearchHisMeetingsResponse searchHisMeetings(SearchHisMeetingsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchHisMeetings);
    }

    public SearchMeetingsResponse searchMeetings(SearchMeetingsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchMeetings);
    }

    public SearchMemberVmrResponse searchMemberVmr(SearchMemberVmrRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchMemberVmr);
    }

    public SearchOnlineMeetingsResponse searchOnlineMeetings(SearchOnlineMeetingsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchOnlineMeetings);
    }

    public SearchRecordingsResponse searchRecordings(SearchRecordingsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchRecordings);
    }

    public SearchResourceResponse searchResource(SearchResourceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchResource);
    }

    public SearchResourceOpRecordResponse searchResourceOpRecord(SearchResourceOpRecordRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchResourceOpRecord);
    }

    public SearchUsersResponse searchUsers(SearchUsersRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchUsers);
    }

    public SendSlideVerifyCodeResponse sendSlideVerifyCode(SendSlideVerifyCodeRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.sendSlideVerifyCode);
    }

    public SendVeriCodeForChangePwdResponse sendVeriCodeForChangePwd(SendVeriCodeForChangePwdRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.sendVeriCodeForChangePwd);
    }

    public SendVeriCodeForUpdateUserInfoResponse sendVeriCodeForUpdateUserInfo(SendVeriCodeForUpdateUserInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.sendVeriCodeForUpdateUserInfo);
    }

    public SetHostViewResponse setHostView(SetHostViewRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.setHostView);
    }

    public SetMultiPictureResponse setMultiPicture(SetMultiPictureRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.setMultiPicture);
    }

    public SetParticipantViewResponse setParticipantView(SetParticipantViewRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.setParticipantView);
    }

    public SetRoleResponse setRole(SetRoleRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.setRole);
    }

    public ShowCorpResponse showCorp(ShowCorpRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showCorp);
    }

    public ShowCorpAdminResponse showCorpAdmin(ShowCorpAdminRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showCorpAdmin);
    }

    public ShowCorpBasicInfoResponse showCorpBasicInfo(ShowCorpBasicInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showCorpBasicInfo);
    }

    public ShowCorpResourceResponse showCorpResource(ShowCorpResourceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showCorpResource);
    }

    public ShowDeptAndChildDeptResponse showDeptAndChildDept(ShowDeptAndChildDeptRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showDeptAndChildDept);
    }

    public ShowDeviceDetailResponse showDeviceDetail(ShowDeviceDetailRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showDeviceDetail);
    }

    public ShowDeviceStatusResponse showDeviceStatus(ShowDeviceStatusRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showDeviceStatus);
    }

    public ShowDeviceTypesResponse showDeviceTypes(ShowDeviceTypesRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showDeviceTypes);
    }

    public ShowHisMeetingDetailResponse showHisMeetingDetail(ShowHisMeetingDetailRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showHisMeetingDetail);
    }

    public ShowMeetingDetailResponse showMeetingDetail(ShowMeetingDetailRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showMeetingDetail);
    }

    public ShowMyInfoResponse showMyInfo(ShowMyInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showMyInfo);
    }

    public ShowOnlineMeetingDetailResponse showOnlineMeetingDetail(ShowOnlineMeetingDetailRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showOnlineMeetingDetail);
    }

    public ShowRealTimeInfoOfMeetingResponse showRealTimeInfoOfMeeting(ShowRealTimeInfoOfMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showRealTimeInfoOfMeeting);
    }

    public ShowRecordingDetailResponse showRecordingDetail(ShowRecordingDetailRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showRecordingDetail);
    }

    public ShowRegionInfoOfMeetingResponse showRegionInfoOfMeeting(ShowRegionInfoOfMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showRegionInfoOfMeeting);
    }

    public ShowUserDetailResponse showUserDetail(ShowUserDetailRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showUserDetail);
    }

    public StopMeetingResponse stopMeeting(StopMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.stopMeeting);
    }

    public SwitchModeResponse switchMode(SwitchModeRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.switchMode);
    }

    public UpdateContactResponse updateContact(UpdateContactRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateContact);
    }

    public UpdateCorpResponse updateCorp(UpdateCorpRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateCorp);
    }

    public UpdateCorpBasicInfoResponse updateCorpBasicInfo(UpdateCorpBasicInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateCorpBasicInfo);
    }

    public UpdateDepartmentResponse updateDepartment(UpdateDepartmentRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateDepartment);
    }

    public UpdateDeviceResponse updateDevice(UpdateDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateDevice);
    }

    public UpdateMemberVmrResponse updateMemberVmr(UpdateMemberVmrRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateMemberVmr);
    }

    public UpdateMyInfoResponse updateMyInfo(UpdateMyInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateMyInfo);
    }

    public UpdatePwdResponse updatePwd(UpdatePwdRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updatePwd);
    }

    public UpdateResourceResponse updateResource(UpdateResourceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateResource);
    }

    public UpdateTokenResponse updateToken(UpdateTokenRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateToken);
    }

    public UpdateUserResponse updateUser(UpdateUserRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateUser);
    }

}
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
        return new ClientBuilder<>(MeetingAsyncClient::new);
    }


    public CompletableFuture<AddCorpResponse> addCorpAsync(AddCorpRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.addCorp);
    }

    public CompletableFuture<AddCorpAdminResponse> addCorpAdminAsync(AddCorpAdminRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.addCorpAdmin);
    }

    public CompletableFuture<AddDepartmentResponse> addDepartmentAsync(AddDepartmentRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.addDepartment);
    }

    public CompletableFuture<AddDeviceResponse> addDeviceAsync(AddDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.addDevice);
    }

    public CompletableFuture<AddResourceResponse> addResourceAsync(AddResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.addResource);
    }

    public CompletableFuture<AddUserResponse> addUserAsync(AddUserRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.addUser);
    }

    public CompletableFuture<AllowGuestUnmuteResponse> allowGuestUnmuteAsync(AllowGuestUnmuteRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.allowGuestUnmute);
    }

    public CompletableFuture<AssociateVmrResponse> associateVmrAsync(AssociateVmrRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.associateVmr);
    }

    public CompletableFuture<BatchDeleteCorpAdminsResponse> batchDeleteCorpAdminsAsync(BatchDeleteCorpAdminsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.batchDeleteCorpAdmins);
    }

    public CompletableFuture<BatchDeleteDevicesResponse> batchDeleteDevicesAsync(BatchDeleteDevicesRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.batchDeleteDevices);
    }

    public CompletableFuture<BatchDeleteUsersResponse> batchDeleteUsersAsync(BatchDeleteUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.batchDeleteUsers);
    }

    public CompletableFuture<BatchUpdateDevicesStatusResponse> batchUpdateDevicesStatusAsync(BatchUpdateDevicesStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.batchUpdateDevicesStatus);
    }

    public CompletableFuture<BatchUpdateUserStatusResponse> batchUpdateUserStatusAsync(BatchUpdateUserStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.batchUpdateUserStatus);
    }

    public CompletableFuture<BroadcastParticipantResponse> broadcastParticipantAsync(BroadcastParticipantRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.broadcastParticipant);
    }

    public CompletableFuture<CancelMeetingResponse> cancelMeetingAsync(CancelMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.cancelMeeting);
    }

    public CompletableFuture<CheckSlideVerifyCodeResponse> checkSlideVerifyCodeAsync(CheckSlideVerifyCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.checkSlideVerifyCode);
    }

    public CompletableFuture<CheckTokenResponse> checkTokenAsync(CheckTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.checkToken);
    }

    public CompletableFuture<CheckVeriCodeForUpdateUserInfoResponse> checkVeriCodeForUpdateUserInfoAsync(CheckVeriCodeForUpdateUserInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.checkVeriCodeForUpdateUserInfo);
    }

    public CompletableFuture<CheckVerifyCodeResponse> checkVerifyCodeAsync(CheckVerifyCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.checkVerifyCode);
    }

    public CompletableFuture<CreateAnonymousAuthRandomResponse> createAnonymousAuthRandomAsync(CreateAnonymousAuthRandomRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.createAnonymousAuthRandom);
    }

    public CompletableFuture<CreateConfTokenResponse> createConfTokenAsync(CreateConfTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.createConfToken);
    }

    public CompletableFuture<CreateMeetingResponse> createMeetingAsync(CreateMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.createMeeting);
    }

    public CompletableFuture<DeleteAttendeesResponse> deleteAttendeesAsync(DeleteAttendeesRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.deleteAttendees);
    }

    public CompletableFuture<DeleteCorpResponse> deleteCorpAsync(DeleteCorpRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.deleteCorp);
    }

    public CompletableFuture<DeleteCorpVmrResponse> deleteCorpVmrAsync(DeleteCorpVmrRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.deleteCorpVmr);
    }

    public CompletableFuture<DeleteDepartmentResponse> deleteDepartmentAsync(DeleteDepartmentRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.deleteDepartment);
    }

    public CompletableFuture<DeleteRecordingsResponse> deleteRecordingsAsync(DeleteRecordingsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.deleteRecordings);
    }

    public CompletableFuture<DeleteResourceResponse> deleteResourceAsync(DeleteResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.deleteResource);
    }

    public CompletableFuture<DisassociateVmrResponse> disassociateVmrAsync(DisassociateVmrRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.disassociateVmr);
    }

    public CompletableFuture<EditMeetingResponse> editMeetingAsync(EditMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.editMeeting);
    }

    public CompletableFuture<HandResponse> handAsync(HandRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.hand);
    }

    public CompletableFuture<HangUpResponse> hangUpAsync(HangUpRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.hangUp);
    }

    public CompletableFuture<InviteParticipantResponse> inviteParticipantAsync(InviteParticipantRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.inviteParticipant);
    }

    public CompletableFuture<LiveResponse> liveAsync(LiveRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.live);
    }

    public CompletableFuture<LockMeetingResponse> lockMeetingAsync(LockMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.lockMeeting);
    }

    public CompletableFuture<LockViewResponse> lockViewAsync(LockViewRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.lockView);
    }

    public CompletableFuture<MuteMeetingResponse> muteMeetingAsync(MuteMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.muteMeeting);
    }

    public CompletableFuture<MuteParticipantResponse> muteParticipantAsync(MuteParticipantRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.muteParticipant);
    }

    public CompletableFuture<ProlongMeetingResponse> prolongMeetingAsync(ProlongMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.prolongMeeting);
    }

    public CompletableFuture<RecordResponse> recordAsync(RecordRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.record);
    }

    public CompletableFuture<RenameParticipantResponse> renameParticipantAsync(RenameParticipantRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.renameParticipant);
    }

    public CompletableFuture<ResetActivecodeResponse> resetActivecodeAsync(ResetActivecodeRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.resetActivecode);
    }

    public CompletableFuture<ResetPwdResponse> resetPwdAsync(ResetPwdRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.resetPwd);
    }

    public CompletableFuture<ResetPwdByAdminResponse> resetPwdByAdminAsync(ResetPwdByAdminRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.resetPwdByAdmin);
    }

    public CompletableFuture<RollcallParticipantResponse> rollcallParticipantAsync(RollcallParticipantRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.rollcallParticipant);
    }

    public CompletableFuture<SearchAttendanceRecordsOfHisMeetingResponse> searchAttendanceRecordsOfHisMeetingAsync(SearchAttendanceRecordsOfHisMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchAttendanceRecordsOfHisMeeting);
    }

    public CompletableFuture<SearchCorpResponse> searchCorpAsync(SearchCorpRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchCorp);
    }

    public CompletableFuture<SearchCorpAdminsResponse> searchCorpAdminsAsync(SearchCorpAdminsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchCorpAdmins);
    }

    public CompletableFuture<SearchCorpDirResponse> searchCorpDirAsync(SearchCorpDirRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchCorpDir);
    }

    public CompletableFuture<SearchCorpVmrResponse> searchCorpVmrAsync(SearchCorpVmrRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchCorpVmr);
    }

    public CompletableFuture<SearchCtlRecordsOfHisMeetingResponse> searchCtlRecordsOfHisMeetingAsync(SearchCtlRecordsOfHisMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchCtlRecordsOfHisMeeting);
    }

    public CompletableFuture<SearchDepartmentByNameResponse> searchDepartmentByNameAsync(SearchDepartmentByNameRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchDepartmentByName);
    }

    public CompletableFuture<SearchDevicesResponse> searchDevicesAsync(SearchDevicesRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchDevices);
    }

    public CompletableFuture<SearchHisMeetingsResponse> searchHisMeetingsAsync(SearchHisMeetingsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchHisMeetings);
    }

    public CompletableFuture<SearchMeetingsResponse> searchMeetingsAsync(SearchMeetingsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchMeetings);
    }

    public CompletableFuture<SearchMemberVmrResponse> searchMemberVmrAsync(SearchMemberVmrRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchMemberVmr);
    }

    public CompletableFuture<SearchOnlineMeetingsResponse> searchOnlineMeetingsAsync(SearchOnlineMeetingsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchOnlineMeetings);
    }

    public CompletableFuture<SearchRecordingsResponse> searchRecordingsAsync(SearchRecordingsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchRecordings);
    }

    public CompletableFuture<SearchResourceResponse> searchResourceAsync(SearchResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchResource);
    }

    public CompletableFuture<SearchResourceOpRecordResponse> searchResourceOpRecordAsync(SearchResourceOpRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchResourceOpRecord);
    }

    public CompletableFuture<SearchUsersResponse> searchUsersAsync(SearchUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchUsers);
    }

    public CompletableFuture<SendSlideVerifyCodeResponse> sendSlideVerifyCodeAsync(SendSlideVerifyCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.sendSlideVerifyCode);
    }

    public CompletableFuture<SendVeriCodeForChangePwdResponse> sendVeriCodeForChangePwdAsync(SendVeriCodeForChangePwdRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.sendVeriCodeForChangePwd);
    }

    public CompletableFuture<SendVeriCodeForUpdateUserInfoResponse> sendVeriCodeForUpdateUserInfoAsync(SendVeriCodeForUpdateUserInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.sendVeriCodeForUpdateUserInfo);
    }

    public CompletableFuture<SetHostViewResponse> setHostViewAsync(SetHostViewRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.setHostView);
    }

    public CompletableFuture<SetMultiPictureResponse> setMultiPictureAsync(SetMultiPictureRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.setMultiPicture);
    }

    public CompletableFuture<SetParticipantViewResponse> setParticipantViewAsync(SetParticipantViewRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.setParticipantView);
    }

    public CompletableFuture<SetRoleResponse> setRoleAsync(SetRoleRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.setRole);
    }

    public CompletableFuture<ShowCorpResponse> showCorpAsync(ShowCorpRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showCorp);
    }

    public CompletableFuture<ShowCorpAdminResponse> showCorpAdminAsync(ShowCorpAdminRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showCorpAdmin);
    }

    public CompletableFuture<ShowCorpBasicInfoResponse> showCorpBasicInfoAsync(ShowCorpBasicInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showCorpBasicInfo);
    }

    public CompletableFuture<ShowCorpResourceResponse> showCorpResourceAsync(ShowCorpResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showCorpResource);
    }

    public CompletableFuture<ShowDeptAndChildDeptResponse> showDeptAndChildDeptAsync(ShowDeptAndChildDeptRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showDeptAndChildDept);
    }

    public CompletableFuture<ShowDeviceDetailResponse> showDeviceDetailAsync(ShowDeviceDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showDeviceDetail);
    }

    public CompletableFuture<ShowDeviceStatusResponse> showDeviceStatusAsync(ShowDeviceStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showDeviceStatus);
    }

    public CompletableFuture<ShowDeviceTypesResponse> showDeviceTypesAsync(ShowDeviceTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showDeviceTypes);
    }

    public CompletableFuture<ShowHisMeetingDetailResponse> showHisMeetingDetailAsync(ShowHisMeetingDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showHisMeetingDetail);
    }

    public CompletableFuture<ShowMeetingDetailResponse> showMeetingDetailAsync(ShowMeetingDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showMeetingDetail);
    }

    public CompletableFuture<ShowMyInfoResponse> showMyInfoAsync(ShowMyInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showMyInfo);
    }

    public CompletableFuture<ShowOnlineMeetingDetailResponse> showOnlineMeetingDetailAsync(ShowOnlineMeetingDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showOnlineMeetingDetail);
    }

    public CompletableFuture<ShowRealTimeInfoOfMeetingResponse> showRealTimeInfoOfMeetingAsync(ShowRealTimeInfoOfMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showRealTimeInfoOfMeeting);
    }

    public CompletableFuture<ShowRecordingDetailResponse> showRecordingDetailAsync(ShowRecordingDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showRecordingDetail);
    }

    public CompletableFuture<ShowRegionInfoOfMeetingResponse> showRegionInfoOfMeetingAsync(ShowRegionInfoOfMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showRegionInfoOfMeeting);
    }

    public CompletableFuture<ShowUserDetailResponse> showUserDetailAsync(ShowUserDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showUserDetail);
    }

    public CompletableFuture<StopMeetingResponse> stopMeetingAsync(StopMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.stopMeeting);
    }

    public CompletableFuture<SwitchModeResponse> switchModeAsync(SwitchModeRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.switchMode);
    }

    public CompletableFuture<UpdateContactResponse> updateContactAsync(UpdateContactRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateContact);
    }

    public CompletableFuture<UpdateCorpResponse> updateCorpAsync(UpdateCorpRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateCorp);
    }

    public CompletableFuture<UpdateCorpBasicInfoResponse> updateCorpBasicInfoAsync(UpdateCorpBasicInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateCorpBasicInfo);
    }

    public CompletableFuture<UpdateDepartmentResponse> updateDepartmentAsync(UpdateDepartmentRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateDepartment);
    }

    public CompletableFuture<UpdateDeviceResponse> updateDeviceAsync(UpdateDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateDevice);
    }

    public CompletableFuture<UpdateMemberVmrResponse> updateMemberVmrAsync(UpdateMemberVmrRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateMemberVmr);
    }

    public CompletableFuture<UpdateMyInfoResponse> updateMyInfoAsync(UpdateMyInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateMyInfo);
    }

    public CompletableFuture<UpdatePwdResponse> updatePwdAsync(UpdatePwdRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updatePwd);
    }

    public CompletableFuture<UpdateResourceResponse> updateResourceAsync(UpdateResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateResource);
    }

    public CompletableFuture<UpdateTokenResponse> updateTokenAsync(UpdateTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateToken);
    }

    public CompletableFuture<UpdateUserResponse> updateUserAsync(UpdateUserRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateUser);
    }

}
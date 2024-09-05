package com.huaweicloud.sdk.meeting.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.meeting.v1.model.AddAppIdRequest;
import com.huaweicloud.sdk.meeting.v1.model.AddAppIdResponse;
import com.huaweicloud.sdk.meeting.v1.model.AddCorpAdminRequest;
import com.huaweicloud.sdk.meeting.v1.model.AddCorpAdminResponse;
import com.huaweicloud.sdk.meeting.v1.model.AddCorpRequest;
import com.huaweicloud.sdk.meeting.v1.model.AddCorpResponse;
import com.huaweicloud.sdk.meeting.v1.model.AddDepartmentRequest;
import com.huaweicloud.sdk.meeting.v1.model.AddDepartmentResponse;
import com.huaweicloud.sdk.meeting.v1.model.AddDeviceRequest;
import com.huaweicloud.sdk.meeting.v1.model.AddDeviceResponse;
import com.huaweicloud.sdk.meeting.v1.model.AddMaterialRequest;
import com.huaweicloud.sdk.meeting.v1.model.AddMaterialResponse;
import com.huaweicloud.sdk.meeting.v1.model.AddProgramRequest;
import com.huaweicloud.sdk.meeting.v1.model.AddProgramResponse;
import com.huaweicloud.sdk.meeting.v1.model.AddPublicationRequest;
import com.huaweicloud.sdk.meeting.v1.model.AddPublicationResponse;
import com.huaweicloud.sdk.meeting.v1.model.AddResourceRequest;
import com.huaweicloud.sdk.meeting.v1.model.AddResourceResponse;
import com.huaweicloud.sdk.meeting.v1.model.AddToPersonalSpaceRequest;
import com.huaweicloud.sdk.meeting.v1.model.AddToPersonalSpaceResponse;
import com.huaweicloud.sdk.meeting.v1.model.AddUserRequest;
import com.huaweicloud.sdk.meeting.v1.model.AddUserResponse;
import com.huaweicloud.sdk.meeting.v1.model.AllowClientRecordRequest;
import com.huaweicloud.sdk.meeting.v1.model.AllowClientRecordResponse;
import com.huaweicloud.sdk.meeting.v1.model.AllowGuestUnmuteRequest;
import com.huaweicloud.sdk.meeting.v1.model.AllowGuestUnmuteResponse;
import com.huaweicloud.sdk.meeting.v1.model.AllowWaitingParticipantRequest;
import com.huaweicloud.sdk.meeting.v1.model.AllowWaitingParticipantResponse;
import com.huaweicloud.sdk.meeting.v1.model.AssociateVmrRequest;
import com.huaweicloud.sdk.meeting.v1.model.AssociateVmrResponse;
import com.huaweicloud.sdk.meeting.v1.model.BatchDeleteCorpAdminsRequest;
import com.huaweicloud.sdk.meeting.v1.model.BatchDeleteCorpAdminsResponse;
import com.huaweicloud.sdk.meeting.v1.model.BatchDeleteDevicesRequest;
import com.huaweicloud.sdk.meeting.v1.model.BatchDeleteDevicesResponse;
import com.huaweicloud.sdk.meeting.v1.model.BatchDeleteMaterialsRequest;
import com.huaweicloud.sdk.meeting.v1.model.BatchDeleteMaterialsResponse;
import com.huaweicloud.sdk.meeting.v1.model.BatchDeleteProgramsRequest;
import com.huaweicloud.sdk.meeting.v1.model.BatchDeleteProgramsResponse;
import com.huaweicloud.sdk.meeting.v1.model.BatchDeletePublicationsRequest;
import com.huaweicloud.sdk.meeting.v1.model.BatchDeletePublicationsResponse;
import com.huaweicloud.sdk.meeting.v1.model.BatchDeleteUsersRequest;
import com.huaweicloud.sdk.meeting.v1.model.BatchDeleteUsersResponse;
import com.huaweicloud.sdk.meeting.v1.model.BatchHandRequest;
import com.huaweicloud.sdk.meeting.v1.model.BatchHandResponse;
import com.huaweicloud.sdk.meeting.v1.model.BatchSearchAppIdRequest;
import com.huaweicloud.sdk.meeting.v1.model.BatchSearchAppIdResponse;
import com.huaweicloud.sdk.meeting.v1.model.BatchShowUserDetailsRequest;
import com.huaweicloud.sdk.meeting.v1.model.BatchShowUserDetailsResponse;
import com.huaweicloud.sdk.meeting.v1.model.BatchUpdateDevicesStatusRequest;
import com.huaweicloud.sdk.meeting.v1.model.BatchUpdateDevicesStatusResponse;
import com.huaweicloud.sdk.meeting.v1.model.BatchUpdateUserStatusRequest;
import com.huaweicloud.sdk.meeting.v1.model.BatchUpdateUserStatusResponse;
import com.huaweicloud.sdk.meeting.v1.model.BroadcastParticipantRequest;
import com.huaweicloud.sdk.meeting.v1.model.BroadcastParticipantResponse;
import com.huaweicloud.sdk.meeting.v1.model.CancelBroadcastRequest;
import com.huaweicloud.sdk.meeting.v1.model.CancelBroadcastResponse;
import com.huaweicloud.sdk.meeting.v1.model.CancelMeetingRequest;
import com.huaweicloud.sdk.meeting.v1.model.CancelMeetingResponse;
import com.huaweicloud.sdk.meeting.v1.model.CancelRecurringMeetingRequest;
import com.huaweicloud.sdk.meeting.v1.model.CancelRecurringMeetingResponse;
import com.huaweicloud.sdk.meeting.v1.model.CancelRecurringSubMeetingRequest;
import com.huaweicloud.sdk.meeting.v1.model.CancelRecurringSubMeetingResponse;
import com.huaweicloud.sdk.meeting.v1.model.CheckSlideVerifyCodeRequest;
import com.huaweicloud.sdk.meeting.v1.model.CheckSlideVerifyCodeResponse;
import com.huaweicloud.sdk.meeting.v1.model.CheckTokenRequest;
import com.huaweicloud.sdk.meeting.v1.model.CheckTokenResponse;
import com.huaweicloud.sdk.meeting.v1.model.CheckVeriCodeForUpdateUserInfoRequest;
import com.huaweicloud.sdk.meeting.v1.model.CheckVeriCodeForUpdateUserInfoResponse;
import com.huaweicloud.sdk.meeting.v1.model.CheckVerifyCodeRequest;
import com.huaweicloud.sdk.meeting.v1.model.CheckVerifyCodeResponse;
import com.huaweicloud.sdk.meeting.v1.model.CreateAnonymousAuthRandomRequest;
import com.huaweicloud.sdk.meeting.v1.model.CreateAnonymousAuthRandomResponse;
import com.huaweicloud.sdk.meeting.v1.model.CreateAuthRandomRequest;
import com.huaweicloud.sdk.meeting.v1.model.CreateAuthRandomResponse;
import com.huaweicloud.sdk.meeting.v1.model.CreateConfTokenRequest;
import com.huaweicloud.sdk.meeting.v1.model.CreateConfTokenResponse;
import com.huaweicloud.sdk.meeting.v1.model.CreateMeetingRequest;
import com.huaweicloud.sdk.meeting.v1.model.CreateMeetingResponse;
import com.huaweicloud.sdk.meeting.v1.model.CreatePortalRefNonceRequest;
import com.huaweicloud.sdk.meeting.v1.model.CreatePortalRefNonceResponse;
import com.huaweicloud.sdk.meeting.v1.model.CreateRecurringMeetingRequest;
import com.huaweicloud.sdk.meeting.v1.model.CreateRecurringMeetingResponse;
import com.huaweicloud.sdk.meeting.v1.model.CreateVisionActiveCodeRequest;
import com.huaweicloud.sdk.meeting.v1.model.CreateVisionActiveCodeResponse;
import com.huaweicloud.sdk.meeting.v1.model.CreateWebSocketTokenRequest;
import com.huaweicloud.sdk.meeting.v1.model.CreateWebSocketTokenResponse;
import com.huaweicloud.sdk.meeting.v1.model.CreateWebinarRequest;
import com.huaweicloud.sdk.meeting.v1.model.CreateWebinarResponse;
import com.huaweicloud.sdk.meeting.v1.model.DeleteAppIdRequest;
import com.huaweicloud.sdk.meeting.v1.model.DeleteAppIdResponse;
import com.huaweicloud.sdk.meeting.v1.model.DeleteAttendeesRequest;
import com.huaweicloud.sdk.meeting.v1.model.DeleteAttendeesResponse;
import com.huaweicloud.sdk.meeting.v1.model.DeleteCorpRequest;
import com.huaweicloud.sdk.meeting.v1.model.DeleteCorpResponse;
import com.huaweicloud.sdk.meeting.v1.model.DeleteCorpVmrRequest;
import com.huaweicloud.sdk.meeting.v1.model.DeleteCorpVmrResponse;
import com.huaweicloud.sdk.meeting.v1.model.DeleteDepartmentRequest;
import com.huaweicloud.sdk.meeting.v1.model.DeleteDepartmentResponse;
import com.huaweicloud.sdk.meeting.v1.model.DeleteLayoutRequest;
import com.huaweicloud.sdk.meeting.v1.model.DeleteLayoutResponse;
import com.huaweicloud.sdk.meeting.v1.model.DeleteRecordingsRequest;
import com.huaweicloud.sdk.meeting.v1.model.DeleteRecordingsResponse;
import com.huaweicloud.sdk.meeting.v1.model.DeleteResourceRequest;
import com.huaweicloud.sdk.meeting.v1.model.DeleteResourceResponse;
import com.huaweicloud.sdk.meeting.v1.model.DeleteTokenRequest;
import com.huaweicloud.sdk.meeting.v1.model.DeleteTokenResponse;
import com.huaweicloud.sdk.meeting.v1.model.DeleteVisionActiveCodeRequest;
import com.huaweicloud.sdk.meeting.v1.model.DeleteVisionActiveCodeResponse;
import com.huaweicloud.sdk.meeting.v1.model.DeleteWebHookConfigRequest;
import com.huaweicloud.sdk.meeting.v1.model.DeleteWebHookConfigResponse;
import com.huaweicloud.sdk.meeting.v1.model.DeleteWebinarRequest;
import com.huaweicloud.sdk.meeting.v1.model.DeleteWebinarResponse;
import com.huaweicloud.sdk.meeting.v1.model.DisassociateVmrRequest;
import com.huaweicloud.sdk.meeting.v1.model.DisassociateVmrResponse;
import com.huaweicloud.sdk.meeting.v1.model.HandRequest;
import com.huaweicloud.sdk.meeting.v1.model.HandResponse;
import com.huaweicloud.sdk.meeting.v1.model.HangUpRequest;
import com.huaweicloud.sdk.meeting.v1.model.HangUpResponse;
import com.huaweicloud.sdk.meeting.v1.model.InviteOperateVideoRequest;
import com.huaweicloud.sdk.meeting.v1.model.InviteOperateVideoResponse;
import com.huaweicloud.sdk.meeting.v1.model.InviteParticipantRequest;
import com.huaweicloud.sdk.meeting.v1.model.InviteParticipantResponse;
import com.huaweicloud.sdk.meeting.v1.model.InviteShareRequest;
import com.huaweicloud.sdk.meeting.v1.model.InviteShareResponse;
import com.huaweicloud.sdk.meeting.v1.model.InviteUserRequest;
import com.huaweicloud.sdk.meeting.v1.model.InviteUserResponse;
import com.huaweicloud.sdk.meeting.v1.model.InviteWithPwdRequest;
import com.huaweicloud.sdk.meeting.v1.model.InviteWithPwdResponse;
import com.huaweicloud.sdk.meeting.v1.model.ListHistoryWebinarsRequest;
import com.huaweicloud.sdk.meeting.v1.model.ListHistoryWebinarsResponse;
import com.huaweicloud.sdk.meeting.v1.model.ListNetworkQualityRequest;
import com.huaweicloud.sdk.meeting.v1.model.ListNetworkQualityResponse;
import com.huaweicloud.sdk.meeting.v1.model.ListOngoingWebinarsRequest;
import com.huaweicloud.sdk.meeting.v1.model.ListOngoingWebinarsResponse;
import com.huaweicloud.sdk.meeting.v1.model.ListUpComingWebinarsRequest;
import com.huaweicloud.sdk.meeting.v1.model.ListUpComingWebinarsResponse;
import com.huaweicloud.sdk.meeting.v1.model.LiveRequest;
import com.huaweicloud.sdk.meeting.v1.model.LiveResponse;
import com.huaweicloud.sdk.meeting.v1.model.LockMeetingRequest;
import com.huaweicloud.sdk.meeting.v1.model.LockMeetingResponse;
import com.huaweicloud.sdk.meeting.v1.model.LockViewRequest;
import com.huaweicloud.sdk.meeting.v1.model.LockViewResponse;
import com.huaweicloud.sdk.meeting.v1.model.MoveToWaitingRoomRequest;
import com.huaweicloud.sdk.meeting.v1.model.MoveToWaitingRoomResponse;
import com.huaweicloud.sdk.meeting.v1.model.MuteMeetingRequest;
import com.huaweicloud.sdk.meeting.v1.model.MuteMeetingResponse;
import com.huaweicloud.sdk.meeting.v1.model.MuteParticipantRequest;
import com.huaweicloud.sdk.meeting.v1.model.MuteParticipantResponse;
import com.huaweicloud.sdk.meeting.v1.model.ProlongMeetingRequest;
import com.huaweicloud.sdk.meeting.v1.model.ProlongMeetingResponse;
import com.huaweicloud.sdk.meeting.v1.model.RecordRequest;
import com.huaweicloud.sdk.meeting.v1.model.RecordResponse;
import com.huaweicloud.sdk.meeting.v1.model.RenameParticipantRequest;
import com.huaweicloud.sdk.meeting.v1.model.RenameParticipantResponse;
import com.huaweicloud.sdk.meeting.v1.model.ResetActivecodeRequest;
import com.huaweicloud.sdk.meeting.v1.model.ResetActivecodeResponse;
import com.huaweicloud.sdk.meeting.v1.model.ResetAppKeyRequest;
import com.huaweicloud.sdk.meeting.v1.model.ResetAppKeyResponse;
import com.huaweicloud.sdk.meeting.v1.model.ResetPwdByAdminRequest;
import com.huaweicloud.sdk.meeting.v1.model.ResetPwdByAdminResponse;
import com.huaweicloud.sdk.meeting.v1.model.ResetPwdRequest;
import com.huaweicloud.sdk.meeting.v1.model.ResetPwdResponse;
import com.huaweicloud.sdk.meeting.v1.model.ResetVisionActiveCodeRequest;
import com.huaweicloud.sdk.meeting.v1.model.ResetVisionActiveCodeResponse;
import com.huaweicloud.sdk.meeting.v1.model.ResumeSimultaneousInterpretationRequest;
import com.huaweicloud.sdk.meeting.v1.model.ResumeSimultaneousInterpretationResponse;
import com.huaweicloud.sdk.meeting.v1.model.RollcallParticipantRequest;
import com.huaweicloud.sdk.meeting.v1.model.RollcallParticipantResponse;
import com.huaweicloud.sdk.meeting.v1.model.SaveLayoutRequest;
import com.huaweicloud.sdk.meeting.v1.model.SaveLayoutResponse;
import com.huaweicloud.sdk.meeting.v1.model.SearchAttendanceRecordsOfHisMeetingRequest;
import com.huaweicloud.sdk.meeting.v1.model.SearchAttendanceRecordsOfHisMeetingResponse;
import com.huaweicloud.sdk.meeting.v1.model.SearchCorpAdminsRequest;
import com.huaweicloud.sdk.meeting.v1.model.SearchCorpAdminsResponse;
import com.huaweicloud.sdk.meeting.v1.model.SearchCorpDirRequest;
import com.huaweicloud.sdk.meeting.v1.model.SearchCorpDirResponse;
import com.huaweicloud.sdk.meeting.v1.model.SearchCorpExternalDirRequest;
import com.huaweicloud.sdk.meeting.v1.model.SearchCorpExternalDirResponse;
import com.huaweicloud.sdk.meeting.v1.model.SearchCorpRequest;
import com.huaweicloud.sdk.meeting.v1.model.SearchCorpResourcesRequest;
import com.huaweicloud.sdk.meeting.v1.model.SearchCorpResourcesResponse;
import com.huaweicloud.sdk.meeting.v1.model.SearchCorpResponse;
import com.huaweicloud.sdk.meeting.v1.model.SearchCorpVmrRequest;
import com.huaweicloud.sdk.meeting.v1.model.SearchCorpVmrResponse;
import com.huaweicloud.sdk.meeting.v1.model.SearchCtlRecordsOfHisMeetingRequest;
import com.huaweicloud.sdk.meeting.v1.model.SearchCtlRecordsOfHisMeetingResponse;
import com.huaweicloud.sdk.meeting.v1.model.SearchDepartmentByNameRequest;
import com.huaweicloud.sdk.meeting.v1.model.SearchDepartmentByNameResponse;
import com.huaweicloud.sdk.meeting.v1.model.SearchDevicesRequest;
import com.huaweicloud.sdk.meeting.v1.model.SearchDevicesResponse;
import com.huaweicloud.sdk.meeting.v1.model.SearchHisMeetingsRequest;
import com.huaweicloud.sdk.meeting.v1.model.SearchHisMeetingsResponse;
import com.huaweicloud.sdk.meeting.v1.model.SearchMaterialsRequest;
import com.huaweicloud.sdk.meeting.v1.model.SearchMaterialsResponse;
import com.huaweicloud.sdk.meeting.v1.model.SearchMeetingFileListRequest;
import com.huaweicloud.sdk.meeting.v1.model.SearchMeetingFileListResponse;
import com.huaweicloud.sdk.meeting.v1.model.SearchMeetingsRequest;
import com.huaweicloud.sdk.meeting.v1.model.SearchMeetingsResponse;
import com.huaweicloud.sdk.meeting.v1.model.SearchMemberVmrRequest;
import com.huaweicloud.sdk.meeting.v1.model.SearchMemberVmrResponse;
import com.huaweicloud.sdk.meeting.v1.model.SearchOnlineMeetingsRequest;
import com.huaweicloud.sdk.meeting.v1.model.SearchOnlineMeetingsResponse;
import com.huaweicloud.sdk.meeting.v1.model.SearchProgramsRequest;
import com.huaweicloud.sdk.meeting.v1.model.SearchProgramsResponse;
import com.huaweicloud.sdk.meeting.v1.model.SearchPublicationsRequest;
import com.huaweicloud.sdk.meeting.v1.model.SearchPublicationsResponse;
import com.huaweicloud.sdk.meeting.v1.model.SearchQosHistoryMeetingsRequest;
import com.huaweicloud.sdk.meeting.v1.model.SearchQosHistoryMeetingsResponse;
import com.huaweicloud.sdk.meeting.v1.model.SearchQosOnlineMeetingsRequest;
import com.huaweicloud.sdk.meeting.v1.model.SearchQosOnlineMeetingsResponse;
import com.huaweicloud.sdk.meeting.v1.model.SearchQosParticipantDetailRequest;
import com.huaweicloud.sdk.meeting.v1.model.SearchQosParticipantDetailResponse;
import com.huaweicloud.sdk.meeting.v1.model.SearchQosParticipantsRequest;
import com.huaweicloud.sdk.meeting.v1.model.SearchQosParticipantsResponse;
import com.huaweicloud.sdk.meeting.v1.model.SearchRecordingsRequest;
import com.huaweicloud.sdk.meeting.v1.model.SearchRecordingsResponse;
import com.huaweicloud.sdk.meeting.v1.model.SearchResourceOpRecordRequest;
import com.huaweicloud.sdk.meeting.v1.model.SearchResourceOpRecordResponse;
import com.huaweicloud.sdk.meeting.v1.model.SearchResourceRequest;
import com.huaweicloud.sdk.meeting.v1.model.SearchResourceResponse;
import com.huaweicloud.sdk.meeting.v1.model.SearchStatisticConferenceInfoRequest;
import com.huaweicloud.sdk.meeting.v1.model.SearchStatisticConferenceInfoResponse;
import com.huaweicloud.sdk.meeting.v1.model.SearchStatisticConferenceParticipantRequest;
import com.huaweicloud.sdk.meeting.v1.model.SearchStatisticConferenceParticipantResponse;
import com.huaweicloud.sdk.meeting.v1.model.SearchStatisticResourceInfoRequest;
import com.huaweicloud.sdk.meeting.v1.model.SearchStatisticResourceInfoResponse;
import com.huaweicloud.sdk.meeting.v1.model.SearchStatisticUserInfoRequest;
import com.huaweicloud.sdk.meeting.v1.model.SearchStatisticUserInfoResponse;
import com.huaweicloud.sdk.meeting.v1.model.SearchUsersRequest;
import com.huaweicloud.sdk.meeting.v1.model.SearchUsersResponse;
import com.huaweicloud.sdk.meeting.v1.model.SearchVisionActiveCodeRequest;
import com.huaweicloud.sdk.meeting.v1.model.SearchVisionActiveCodeResponse;
import com.huaweicloud.sdk.meeting.v1.model.SendSlideVerifyCodeRequest;
import com.huaweicloud.sdk.meeting.v1.model.SendSlideVerifyCodeResponse;
import com.huaweicloud.sdk.meeting.v1.model.SendVeriCodeForChangePwdRequest;
import com.huaweicloud.sdk.meeting.v1.model.SendVeriCodeForChangePwdResponse;
import com.huaweicloud.sdk.meeting.v1.model.SendVeriCodeForUpdateUserInfoRequest;
import com.huaweicloud.sdk.meeting.v1.model.SendVeriCodeForUpdateUserInfoResponse;
import com.huaweicloud.sdk.meeting.v1.model.SetAttendeeLanChannelRequest;
import com.huaweicloud.sdk.meeting.v1.model.SetAttendeeLanChannelResponse;
import com.huaweicloud.sdk.meeting.v1.model.SetCohostRequest;
import com.huaweicloud.sdk.meeting.v1.model.SetCohostResponse;
import com.huaweicloud.sdk.meeting.v1.model.SetCustomMultiPictureRequest;
import com.huaweicloud.sdk.meeting.v1.model.SetCustomMultiPictureResponse;
import com.huaweicloud.sdk.meeting.v1.model.SetHostViewRequest;
import com.huaweicloud.sdk.meeting.v1.model.SetHostViewResponse;
import com.huaweicloud.sdk.meeting.v1.model.SetInterpreterGroupRequest;
import com.huaweicloud.sdk.meeting.v1.model.SetInterpreterGroupResponse;
import com.huaweicloud.sdk.meeting.v1.model.SetMultiPictureRequest;
import com.huaweicloud.sdk.meeting.v1.model.SetMultiPictureResponse;
import com.huaweicloud.sdk.meeting.v1.model.SetParticipantViewRequest;
import com.huaweicloud.sdk.meeting.v1.model.SetParticipantViewResponse;
import com.huaweicloud.sdk.meeting.v1.model.SetProfileImageRequest;
import com.huaweicloud.sdk.meeting.v1.model.SetProfileImageResponse;
import com.huaweicloud.sdk.meeting.v1.model.SetQosThresholdRequest;
import com.huaweicloud.sdk.meeting.v1.model.SetQosThresholdResponse;
import com.huaweicloud.sdk.meeting.v1.model.SetRoleRequest;
import com.huaweicloud.sdk.meeting.v1.model.SetRoleResponse;
import com.huaweicloud.sdk.meeting.v1.model.SetSsoConfigRequest;
import com.huaweicloud.sdk.meeting.v1.model.SetSsoConfigResponse;
import com.huaweicloud.sdk.meeting.v1.model.SetUserProfileImageRequest;
import com.huaweicloud.sdk.meeting.v1.model.SetUserProfileImageResponse;
import com.huaweicloud.sdk.meeting.v1.model.SetWebHookConfigRequest;
import com.huaweicloud.sdk.meeting.v1.model.SetWebHookConfigResponse;
import com.huaweicloud.sdk.meeting.v1.model.ShowConfOrgRequest;
import com.huaweicloud.sdk.meeting.v1.model.ShowConfOrgResponse;
import com.huaweicloud.sdk.meeting.v1.model.ShowCorpAdminRequest;
import com.huaweicloud.sdk.meeting.v1.model.ShowCorpAdminResponse;
import com.huaweicloud.sdk.meeting.v1.model.ShowCorpBasicInfoRequest;
import com.huaweicloud.sdk.meeting.v1.model.ShowCorpBasicInfoResponse;
import com.huaweicloud.sdk.meeting.v1.model.ShowCorpRequest;
import com.huaweicloud.sdk.meeting.v1.model.ShowCorpResourceRequest;
import com.huaweicloud.sdk.meeting.v1.model.ShowCorpResourceResponse;
import com.huaweicloud.sdk.meeting.v1.model.ShowCorpResponse;
import com.huaweicloud.sdk.meeting.v1.model.ShowDepartmentRequest;
import com.huaweicloud.sdk.meeting.v1.model.ShowDepartmentResponse;
import com.huaweicloud.sdk.meeting.v1.model.ShowDeptAndChildDeptRequest;
import com.huaweicloud.sdk.meeting.v1.model.ShowDeptAndChildDeptResponse;
import com.huaweicloud.sdk.meeting.v1.model.ShowDeviceDetailRequest;
import com.huaweicloud.sdk.meeting.v1.model.ShowDeviceDetailResponse;
import com.huaweicloud.sdk.meeting.v1.model.ShowDeviceStatusRequest;
import com.huaweicloud.sdk.meeting.v1.model.ShowDeviceStatusResponse;
import com.huaweicloud.sdk.meeting.v1.model.ShowDeviceTypesRequest;
import com.huaweicloud.sdk.meeting.v1.model.ShowDeviceTypesResponse;
import com.huaweicloud.sdk.meeting.v1.model.ShowHisMeetingDetailRequest;
import com.huaweicloud.sdk.meeting.v1.model.ShowHisMeetingDetailResponse;
import com.huaweicloud.sdk.meeting.v1.model.ShowLayoutRequest;
import com.huaweicloud.sdk.meeting.v1.model.ShowLayoutResponse;
import com.huaweicloud.sdk.meeting.v1.model.ShowMeetingDetailRequest;
import com.huaweicloud.sdk.meeting.v1.model.ShowMeetingDetailResponse;
import com.huaweicloud.sdk.meeting.v1.model.ShowMeetingFileListRequest;
import com.huaweicloud.sdk.meeting.v1.model.ShowMeetingFileListResponse;
import com.huaweicloud.sdk.meeting.v1.model.ShowMeetingFileRequest;
import com.huaweicloud.sdk.meeting.v1.model.ShowMeetingFileResponse;
import com.huaweicloud.sdk.meeting.v1.model.ShowMyInfoRequest;
import com.huaweicloud.sdk.meeting.v1.model.ShowMyInfoResponse;
import com.huaweicloud.sdk.meeting.v1.model.ShowOnlineMeetingDetailRequest;
import com.huaweicloud.sdk.meeting.v1.model.ShowOnlineMeetingDetailResponse;
import com.huaweicloud.sdk.meeting.v1.model.ShowOrgResRequest;
import com.huaweicloud.sdk.meeting.v1.model.ShowOrgResResponse;
import com.huaweicloud.sdk.meeting.v1.model.ShowProgramRequest;
import com.huaweicloud.sdk.meeting.v1.model.ShowProgramResponse;
import com.huaweicloud.sdk.meeting.v1.model.ShowPublicationRequest;
import com.huaweicloud.sdk.meeting.v1.model.ShowPublicationResponse;
import com.huaweicloud.sdk.meeting.v1.model.ShowQosThresholdRequest;
import com.huaweicloud.sdk.meeting.v1.model.ShowQosThresholdResponse;
import com.huaweicloud.sdk.meeting.v1.model.ShowRealTimeInfoOfMeetingRequest;
import com.huaweicloud.sdk.meeting.v1.model.ShowRealTimeInfoOfMeetingResponse;
import com.huaweicloud.sdk.meeting.v1.model.ShowRecordingDetailRequest;
import com.huaweicloud.sdk.meeting.v1.model.ShowRecordingDetailResponse;
import com.huaweicloud.sdk.meeting.v1.model.ShowRecordingFileDownloadUrlsRequest;
import com.huaweicloud.sdk.meeting.v1.model.ShowRecordingFileDownloadUrlsResponse;
import com.huaweicloud.sdk.meeting.v1.model.ShowRegionInfoOfMeetingRequest;
import com.huaweicloud.sdk.meeting.v1.model.ShowRegionInfoOfMeetingResponse;
import com.huaweicloud.sdk.meeting.v1.model.ShowRoomSettingRequest;
import com.huaweicloud.sdk.meeting.v1.model.ShowRoomSettingResponse;
import com.huaweicloud.sdk.meeting.v1.model.ShowSpResRequest;
import com.huaweicloud.sdk.meeting.v1.model.ShowSpResResponse;
import com.huaweicloud.sdk.meeting.v1.model.ShowSpResourceRequest;
import com.huaweicloud.sdk.meeting.v1.model.ShowSpResourceResponse;
import com.huaweicloud.sdk.meeting.v1.model.ShowSsoConfigRequest;
import com.huaweicloud.sdk.meeting.v1.model.ShowSsoConfigResponse;
import com.huaweicloud.sdk.meeting.v1.model.ShowUserDetailRequest;
import com.huaweicloud.sdk.meeting.v1.model.ShowUserDetailResponse;
import com.huaweicloud.sdk.meeting.v1.model.ShowWebHookConfigRequest;
import com.huaweicloud.sdk.meeting.v1.model.ShowWebHookConfigResponse;
import com.huaweicloud.sdk.meeting.v1.model.ShowWebinarRequest;
import com.huaweicloud.sdk.meeting.v1.model.ShowWebinarResponse;
import com.huaweicloud.sdk.meeting.v1.model.StartMeetingRequest;
import com.huaweicloud.sdk.meeting.v1.model.StartMeetingResponse;
import com.huaweicloud.sdk.meeting.v1.model.StopMeetingRequest;
import com.huaweicloud.sdk.meeting.v1.model.StopMeetingResponse;
import com.huaweicloud.sdk.meeting.v1.model.SwitchModeRequest;
import com.huaweicloud.sdk.meeting.v1.model.SwitchModeResponse;
import com.huaweicloud.sdk.meeting.v1.model.UpdateAppIdRequest;
import com.huaweicloud.sdk.meeting.v1.model.UpdateAppIdResponse;
import com.huaweicloud.sdk.meeting.v1.model.UpdateContactRequest;
import com.huaweicloud.sdk.meeting.v1.model.UpdateContactResponse;
import com.huaweicloud.sdk.meeting.v1.model.UpdateCorpBasicInfoRequest;
import com.huaweicloud.sdk.meeting.v1.model.UpdateCorpBasicInfoResponse;
import com.huaweicloud.sdk.meeting.v1.model.UpdateCorpRequest;
import com.huaweicloud.sdk.meeting.v1.model.UpdateCorpResponse;
import com.huaweicloud.sdk.meeting.v1.model.UpdateDepartmentRequest;
import com.huaweicloud.sdk.meeting.v1.model.UpdateDepartmentResponse;
import com.huaweicloud.sdk.meeting.v1.model.UpdateDeviceRequest;
import com.huaweicloud.sdk.meeting.v1.model.UpdateDeviceResponse;
import com.huaweicloud.sdk.meeting.v1.model.UpdateMaterialRequest;
import com.huaweicloud.sdk.meeting.v1.model.UpdateMaterialResponse;
import com.huaweicloud.sdk.meeting.v1.model.UpdateMeetingRequest;
import com.huaweicloud.sdk.meeting.v1.model.UpdateMeetingResponse;
import com.huaweicloud.sdk.meeting.v1.model.UpdateMemberVmrRequest;
import com.huaweicloud.sdk.meeting.v1.model.UpdateMemberVmrResponse;
import com.huaweicloud.sdk.meeting.v1.model.UpdateMyInfoRequest;
import com.huaweicloud.sdk.meeting.v1.model.UpdateMyInfoResponse;
import com.huaweicloud.sdk.meeting.v1.model.UpdateProgramRequest;
import com.huaweicloud.sdk.meeting.v1.model.UpdateProgramResponse;
import com.huaweicloud.sdk.meeting.v1.model.UpdatePublicationRequest;
import com.huaweicloud.sdk.meeting.v1.model.UpdatePublicationResponse;
import com.huaweicloud.sdk.meeting.v1.model.UpdatePwdRequest;
import com.huaweicloud.sdk.meeting.v1.model.UpdatePwdResponse;
import com.huaweicloud.sdk.meeting.v1.model.UpdateRecurringMeetingRequest;
import com.huaweicloud.sdk.meeting.v1.model.UpdateRecurringMeetingResponse;
import com.huaweicloud.sdk.meeting.v1.model.UpdateRecurringSubMeetingRequest;
import com.huaweicloud.sdk.meeting.v1.model.UpdateRecurringSubMeetingResponse;
import com.huaweicloud.sdk.meeting.v1.model.UpdateResourceRequest;
import com.huaweicloud.sdk.meeting.v1.model.UpdateResourceResponse;
import com.huaweicloud.sdk.meeting.v1.model.UpdateRoomSettingRequest;
import com.huaweicloud.sdk.meeting.v1.model.UpdateRoomSettingResponse;
import com.huaweicloud.sdk.meeting.v1.model.UpdateStartedConfConfigRequest;
import com.huaweicloud.sdk.meeting.v1.model.UpdateStartedConfConfigResponse;
import com.huaweicloud.sdk.meeting.v1.model.UpdateTokenRequest;
import com.huaweicloud.sdk.meeting.v1.model.UpdateTokenResponse;
import com.huaweicloud.sdk.meeting.v1.model.UpdateUserRequest;
import com.huaweicloud.sdk.meeting.v1.model.UpdateUserResponse;
import com.huaweicloud.sdk.meeting.v1.model.UpdateWebHookConfigStatusRequest;
import com.huaweicloud.sdk.meeting.v1.model.UpdateWebHookConfigStatusResponse;
import com.huaweicloud.sdk.meeting.v1.model.UpdateWebinarRequest;
import com.huaweicloud.sdk.meeting.v1.model.UpdateWebinarResponse;
import com.huaweicloud.sdk.meeting.v1.model.UploadFileRequest;
import com.huaweicloud.sdk.meeting.v1.model.UploadFileResponse;

public class MeetingClient {

    protected HcClient hcClient;

    public MeetingClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<MeetingClient> newBuilder() {
        ClientBuilder<MeetingClient> clientBuilder = new ClientBuilder<>(MeetingClient::new, "MeetingCredentials");
        return clientBuilder;
    }

    /**
     * 添加企业应用
     *
     * 企业默认管理员添加应用，添加应用后，记录返回信息，后续可通过[[执行App ID鉴权](https://support.huaweicloud.com/api-meeting/meeting_21_0311.html)](tag:hws) [[执行App ID鉴权](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_0311.html)](tag:hk)获取accessToken
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAppIdRequest 请求对象
     * @return AddAppIdResponse
     */
    public AddAppIdResponse addAppId(AddAppIdRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addAppId);
    }

    /**
     * 添加企业应用
     *
     * 企业默认管理员添加应用，添加应用后，记录返回信息，后续可通过[[执行App ID鉴权](https://support.huaweicloud.com/api-meeting/meeting_21_0311.html)](tag:hws) [[执行App ID鉴权](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_0311.html)](tag:hk)获取accessToken
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddAppIdRequest 请求对象
     * @return SyncInvoker<AddAppIdRequest, AddAppIdResponse>
     */
    public SyncInvoker<AddAppIdRequest, AddAppIdResponse> addAppIdInvoker(AddAppIdRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.addAppId, hcClient);
    }

    /**
     * SP管理员创建企业
     *
     * 创建企业，默认管理员及分配资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddCorpRequest 请求对象
     * @return AddCorpResponse
     */
    public AddCorpResponse addCorp(AddCorpRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addCorp);
    }

    /**
     * SP管理员创建企业
     *
     * 创建企业，默认管理员及分配资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddCorpRequest 请求对象
     * @return SyncInvoker<AddCorpRequest, AddCorpResponse>
     */
    public SyncInvoker<AddCorpRequest, AddCorpResponse> addCorpInvoker(AddCorpRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.addCorp, hcClient);
    }

    /**
     * 添加企业管理员
     *
     * 企业默认管理员添加企业普通管理员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddCorpAdminRequest 请求对象
     * @return AddCorpAdminResponse
     */
    public AddCorpAdminResponse addCorpAdmin(AddCorpAdminRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addCorpAdmin);
    }

    /**
     * 添加企业管理员
     *
     * 企业默认管理员添加企业普通管理员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddCorpAdminRequest 请求对象
     * @return SyncInvoker<AddCorpAdminRequest, AddCorpAdminResponse>
     */
    public SyncInvoker<AddCorpAdminRequest, AddCorpAdminResponse> addCorpAdminInvoker(AddCorpAdminRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.addCorpAdmin, hcClient);
    }

    /**
     * 添加部门
     *
     * 企业管理员通过该接口添加部门，最多支持10级部门，每级子部门最多支持100个，默认企业最大部门数量为10000个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDepartmentRequest 请求对象
     * @return AddDepartmentResponse
     */
    public AddDepartmentResponse addDepartment(AddDepartmentRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addDepartment);
    }

    /**
     * 添加部门
     *
     * 企业管理员通过该接口添加部门，最多支持10级部门，每级子部门最多支持100个，默认企业最大部门数量为10000个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDepartmentRequest 请求对象
     * @return SyncInvoker<AddDepartmentRequest, AddDepartmentResponse>
     */
    public SyncInvoker<AddDepartmentRequest, AddDepartmentResponse> addDepartmentInvoker(AddDepartmentRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.addDepartment, hcClient);
    }

    /**
     * 增加终端
     *
     * 企业管理员通过该接口添加专业会议终端。专业会议终端包括DP300/HUAWEI Bar系列/HUAWEI Board/TE系列。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDeviceRequest 请求对象
     * @return AddDeviceResponse
     */
    public AddDeviceResponse addDevice(AddDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addDevice);
    }

    /**
     * 增加终端
     *
     * 企业管理员通过该接口添加专业会议终端。专业会议终端包括DP300/HUAWEI Bar系列/HUAWEI Board/TE系列。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDeviceRequest 请求对象
     * @return SyncInvoker<AddDeviceRequest, AddDeviceResponse>
     */
    public SyncInvoker<AddDeviceRequest, AddDeviceResponse> addDeviceInvoker(AddDeviceRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.addDevice, hcClient);
    }

    /**
     * 新增信息窗素材
     *
     * 新增信息窗素材（上传素材文件）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddMaterialRequest 请求对象
     * @return AddMaterialResponse
     */
    public AddMaterialResponse addMaterial(AddMaterialRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addMaterial);
    }

    /**
     * 新增信息窗素材
     *
     * 新增信息窗素材（上传素材文件）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddMaterialRequest 请求对象
     * @return SyncInvoker<AddMaterialRequest, AddMaterialResponse>
     */
    public SyncInvoker<AddMaterialRequest, AddMaterialResponse> addMaterialInvoker(AddMaterialRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.addMaterial, hcClient);
    }

    /**
     * 新增信息窗节目
     *
     * 新增信息窗节目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddProgramRequest 请求对象
     * @return AddProgramResponse
     */
    public AddProgramResponse addProgram(AddProgramRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addProgram);
    }

    /**
     * 新增信息窗节目
     *
     * 新增信息窗节目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddProgramRequest 请求对象
     * @return SyncInvoker<AddProgramRequest, AddProgramResponse>
     */
    public SyncInvoker<AddProgramRequest, AddProgramResponse> addProgramInvoker(AddProgramRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.addProgram, hcClient);
    }

    /**
     * 新增信息窗发布
     *
     * 新增信息窗发布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddPublicationRequest 请求对象
     * @return AddPublicationResponse
     */
    public AddPublicationResponse addPublication(AddPublicationRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addPublication);
    }

    /**
     * 新增信息窗发布
     *
     * 新增信息窗发布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddPublicationRequest 请求对象
     * @return SyncInvoker<AddPublicationRequest, AddPublicationResponse>
     */
    public SyncInvoker<AddPublicationRequest, AddPublicationResponse> addPublicationInvoker(
        AddPublicationRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.addPublication, hcClient);
    }

    /**
     * SP管理员分配企业资源
     *
     * 企业新增资源发放。该接口同时支持修改，带resourceId后会判断该资源是否存在，存在即修改（支持修改的参数见修改接口），否则按新增处理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddResourceRequest 请求对象
     * @return AddResourceResponse
     */
    public AddResourceResponse addResource(AddResourceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addResource);
    }

    /**
     * SP管理员分配企业资源
     *
     * 企业新增资源发放。该接口同时支持修改，带resourceId后会判断该资源是否存在，存在即修改（支持修改的参数见修改接口），否则按新增处理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddResourceRequest 请求对象
     * @return SyncInvoker<AddResourceRequest, AddResourceResponse>
     */
    public SyncInvoker<AddResourceRequest, AddResourceResponse> addResourceInvoker(AddResourceRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.addResource, hcClient);
    }

    /**
     * 保存会议纪要到个人云空间
     *
     * 用户使用手机扫码后,手机端请求服务端将当前会议纪要文件保存到个人云空间。二维码内容 ：cloudlink://cloudlink.huawei.com/h5page?action&#x3D;SAVE_MEETING_FILE&amp;key1&#x3D;value1&amp;key2&#x3D;value2 。key/value的个数可能变化，终端解析后，在发起后续请求时，将所有key/value存为map，作为入参即可。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddToPersonalSpaceRequest 请求对象
     * @return AddToPersonalSpaceResponse
     */
    public AddToPersonalSpaceResponse addToPersonalSpace(AddToPersonalSpaceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addToPersonalSpace);
    }

    /**
     * 保存会议纪要到个人云空间
     *
     * 用户使用手机扫码后,手机端请求服务端将当前会议纪要文件保存到个人云空间。二维码内容 ：cloudlink://cloudlink.huawei.com/h5page?action&#x3D;SAVE_MEETING_FILE&amp;key1&#x3D;value1&amp;key2&#x3D;value2 。key/value的个数可能变化，终端解析后，在发起后续请求时，将所有key/value存为map，作为入参即可。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddToPersonalSpaceRequest 请求对象
     * @return SyncInvoker<AddToPersonalSpaceRequest, AddToPersonalSpaceResponse>
     */
    public SyncInvoker<AddToPersonalSpaceRequest, AddToPersonalSpaceResponse> addToPersonalSpaceInvoker(
        AddToPersonalSpaceRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.addToPersonalSpace, hcClient);
    }

    /**
     * 添加用户
     *
     * 企业管理员通过该接口添加企业用户。
     * &gt; 默认添加用户后，用户第一次登录华为云会议App或者Portal时需要修改密码。若需关闭第一次登录修改密码，请联系华为销售人员，并提供华为云会议企业ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddUserRequest 请求对象
     * @return AddUserResponse
     */
    public AddUserResponse addUser(AddUserRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.addUser);
    }

    /**
     * 添加用户
     *
     * 企业管理员通过该接口添加企业用户。
     * &gt; 默认添加用户后，用户第一次登录华为云会议App或者Portal时需要修改密码。若需关闭第一次登录修改密码，请联系华为销售人员，并提供华为云会议企业ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddUserRequest 请求对象
     * @return SyncInvoker<AddUserRequest, AddUserResponse>
     */
    public SyncInvoker<AddUserRequest, AddUserResponse> addUserInvoker(AddUserRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.addUser, hcClient);
    }

    /**
     * 允许客户端录制
     *
     * 该接口用于设置允许/禁止与会者客户端本地录制（非云端录制）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AllowClientRecordRequest 请求对象
     * @return AllowClientRecordResponse
     */
    public AllowClientRecordResponse allowClientRecord(AllowClientRecordRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.allowClientRecord);
    }

    /**
     * 允许客户端录制
     *
     * 该接口用于设置允许/禁止与会者客户端本地录制（非云端录制）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AllowClientRecordRequest 请求对象
     * @return SyncInvoker<AllowClientRecordRequest, AllowClientRecordResponse>
     */
    public SyncInvoker<AllowClientRecordRequest, AllowClientRecordResponse> allowClientRecordInvoker(
        AllowClientRecordRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.allowClientRecord, hcClient);
    }

    /**
     * 与会者自己解除静音
     *
     * 该接口用于设置与会者是否可以自己解除静音。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AllowGuestUnmuteRequest 请求对象
     * @return AllowGuestUnmuteResponse
     */
    public AllowGuestUnmuteResponse allowGuestUnmute(AllowGuestUnmuteRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.allowGuestUnmute);
    }

    /**
     * 与会者自己解除静音
     *
     * 该接口用于设置与会者是否可以自己解除静音。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AllowGuestUnmuteRequest 请求对象
     * @return SyncInvoker<AllowGuestUnmuteRequest, AllowGuestUnmuteResponse>
     */
    public SyncInvoker<AllowGuestUnmuteRequest, AllowGuestUnmuteResponse> allowGuestUnmuteInvoker(
        AllowGuestUnmuteRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.allowGuestUnmute, hcClient);
    }

    /**
     * 准入等候者
     *
     * 该接口用于允许等候室中的成员进入会议。可以允许全部成员进入会议，或者允许指定成员进入会议。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AllowWaitingParticipantRequest 请求对象
     * @return AllowWaitingParticipantResponse
     */
    public AllowWaitingParticipantResponse allowWaitingParticipant(AllowWaitingParticipantRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.allowWaitingParticipant);
    }

    /**
     * 准入等候者
     *
     * 该接口用于允许等候室中的成员进入会议。可以允许全部成员进入会议，或者允许指定成员进入会议。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AllowWaitingParticipantRequest 请求对象
     * @return SyncInvoker<AllowWaitingParticipantRequest, AllowWaitingParticipantResponse>
     */
    public SyncInvoker<AllowWaitingParticipantRequest, AllowWaitingParticipantResponse> allowWaitingParticipantInvoker(
        AllowWaitingParticipantRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.allowWaitingParticipant, hcClient);
    }

    /**
     * 分配云会议室
     *
     * 企业管理员通过该接口将云会议室分配给用户、专业会议终端（TE10、TE20、HUAWEI Board、HUAWEI Bar 500及HUAWEI Box系列）、智慧屏TV、电子白板（SmartRooms）、IdeaHub。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateVmrRequest 请求对象
     * @return AssociateVmrResponse
     */
    public AssociateVmrResponse associateVmr(AssociateVmrRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.associateVmr);
    }

    /**
     * 分配云会议室
     *
     * 企业管理员通过该接口将云会议室分配给用户、专业会议终端（TE10、TE20、HUAWEI Board、HUAWEI Bar 500及HUAWEI Box系列）、智慧屏TV、电子白板（SmartRooms）、IdeaHub。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateVmrRequest 请求对象
     * @return SyncInvoker<AssociateVmrRequest, AssociateVmrResponse>
     */
    public SyncInvoker<AssociateVmrRequest, AssociateVmrResponse> associateVmrInvoker(AssociateVmrRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.associateVmr, hcClient);
    }

    /**
     * 批量删除企业管理员
     *
     * 通过该接口批量删除企业管理员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteCorpAdminsRequest 请求对象
     * @return BatchDeleteCorpAdminsResponse
     */
    public BatchDeleteCorpAdminsResponse batchDeleteCorpAdmins(BatchDeleteCorpAdminsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.batchDeleteCorpAdmins);
    }

    /**
     * 批量删除企业管理员
     *
     * 通过该接口批量删除企业管理员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteCorpAdminsRequest 请求对象
     * @return SyncInvoker<BatchDeleteCorpAdminsRequest, BatchDeleteCorpAdminsResponse>
     */
    public SyncInvoker<BatchDeleteCorpAdminsRequest, BatchDeleteCorpAdminsResponse> batchDeleteCorpAdminsInvoker(
        BatchDeleteCorpAdminsRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.batchDeleteCorpAdmins, hcClient);
    }

    /**
     * 批量删除终端
     *
     * 企业管理员通过该接口批量删除专业会议终端，返回删除失败的列表。
     * &gt; 如果需要删除Ideahub、SmartRooms、智慧屏TV请使用[[批量删除用户](https://support.huaweicloud.com/api-meeting/meeting_21_0070.html)](tag:hws)[[批量删除用户](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_0070.html)](tag:hk)接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDevicesRequest 请求对象
     * @return BatchDeleteDevicesResponse
     */
    public BatchDeleteDevicesResponse batchDeleteDevices(BatchDeleteDevicesRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.batchDeleteDevices);
    }

    /**
     * 批量删除终端
     *
     * 企业管理员通过该接口批量删除专业会议终端，返回删除失败的列表。
     * &gt; 如果需要删除Ideahub、SmartRooms、智慧屏TV请使用[[批量删除用户](https://support.huaweicloud.com/api-meeting/meeting_21_0070.html)](tag:hws)[[批量删除用户](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_0070.html)](tag:hk)接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteDevicesRequest 请求对象
     * @return SyncInvoker<BatchDeleteDevicesRequest, BatchDeleteDevicesResponse>
     */
    public SyncInvoker<BatchDeleteDevicesRequest, BatchDeleteDevicesResponse> batchDeleteDevicesInvoker(
        BatchDeleteDevicesRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.batchDeleteDevices, hcClient);
    }

    /**
     * 删除信息窗素材
     *
     * 删除信息窗素材。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteMaterialsRequest 请求对象
     * @return BatchDeleteMaterialsResponse
     */
    public BatchDeleteMaterialsResponse batchDeleteMaterials(BatchDeleteMaterialsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.batchDeleteMaterials);
    }

    /**
     * 删除信息窗素材
     *
     * 删除信息窗素材。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteMaterialsRequest 请求对象
     * @return SyncInvoker<BatchDeleteMaterialsRequest, BatchDeleteMaterialsResponse>
     */
    public SyncInvoker<BatchDeleteMaterialsRequest, BatchDeleteMaterialsResponse> batchDeleteMaterialsInvoker(
        BatchDeleteMaterialsRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.batchDeleteMaterials, hcClient);
    }

    /**
     * 删除信息窗节目
     *
     * 删除信息窗节目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteProgramsRequest 请求对象
     * @return BatchDeleteProgramsResponse
     */
    public BatchDeleteProgramsResponse batchDeletePrograms(BatchDeleteProgramsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.batchDeletePrograms);
    }

    /**
     * 删除信息窗节目
     *
     * 删除信息窗节目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteProgramsRequest 请求对象
     * @return SyncInvoker<BatchDeleteProgramsRequest, BatchDeleteProgramsResponse>
     */
    public SyncInvoker<BatchDeleteProgramsRequest, BatchDeleteProgramsResponse> batchDeleteProgramsInvoker(
        BatchDeleteProgramsRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.batchDeletePrograms, hcClient);
    }

    /**
     * 删除信息窗发布
     *
     * 删除信息窗发布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeletePublicationsRequest 请求对象
     * @return BatchDeletePublicationsResponse
     */
    public BatchDeletePublicationsResponse batchDeletePublications(BatchDeletePublicationsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.batchDeletePublications);
    }

    /**
     * 删除信息窗发布
     *
     * 删除信息窗发布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeletePublicationsRequest 请求对象
     * @return SyncInvoker<BatchDeletePublicationsRequest, BatchDeletePublicationsResponse>
     */
    public SyncInvoker<BatchDeletePublicationsRequest, BatchDeletePublicationsResponse> batchDeletePublicationsInvoker(
        BatchDeletePublicationsRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.batchDeletePublications, hcClient);
    }

    /**
     * 批量删除用户
     *
     * 企业管理员通过该接口批量删除企业用户。删除多个用户时，全部删除成功或者全部删除失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteUsersRequest 请求对象
     * @return BatchDeleteUsersResponse
     */
    public BatchDeleteUsersResponse batchDeleteUsers(BatchDeleteUsersRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.batchDeleteUsers);
    }

    /**
     * 批量删除用户
     *
     * 企业管理员通过该接口批量删除企业用户。删除多个用户时，全部删除成功或者全部删除失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteUsersRequest 请求对象
     * @return SyncInvoker<BatchDeleteUsersRequest, BatchDeleteUsersResponse>
     */
    public SyncInvoker<BatchDeleteUsersRequest, BatchDeleteUsersResponse> batchDeleteUsersInvoker(
        BatchDeleteUsersRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.batchDeleteUsers, hcClient);
    }

    /**
     * 批量举手
     *
     * 该接口用于批量设置来宾的举手/放下举手状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchHandRequest 请求对象
     * @return BatchHandResponse
     */
    public BatchHandResponse batchHand(BatchHandRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.batchHand);
    }

    /**
     * 批量举手
     *
     * 该接口用于批量设置来宾的举手/放下举手状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchHandRequest 请求对象
     * @return SyncInvoker<BatchHandRequest, BatchHandResponse>
     */
    public SyncInvoker<BatchHandRequest, BatchHandResponse> batchHandInvoker(BatchHandRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.batchHand, hcClient);
    }

    /**
     * 分页查询企业应用
     *
     * 企业默认管理员分页查询企业应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSearchAppIdRequest 请求对象
     * @return BatchSearchAppIdResponse
     */
    public BatchSearchAppIdResponse batchSearchAppId(BatchSearchAppIdRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.batchSearchAppId);
    }

    /**
     * 分页查询企业应用
     *
     * 企业默认管理员分页查询企业应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSearchAppIdRequest 请求对象
     * @return SyncInvoker<BatchSearchAppIdRequest, BatchSearchAppIdResponse>
     */
    public SyncInvoker<BatchSearchAppIdRequest, BatchSearchAppIdResponse> batchSearchAppIdInvoker(
        BatchSearchAppIdRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.batchSearchAppId, hcClient);
    }

    /**
     * 批量查询用户详情
     *
     * 批量查询用户详情，支持指定第三方账号查询详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchShowUserDetailsRequest 请求对象
     * @return BatchShowUserDetailsResponse
     */
    public BatchShowUserDetailsResponse batchShowUserDetails(BatchShowUserDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.batchShowUserDetails);
    }

    /**
     * 批量查询用户详情
     *
     * 批量查询用户详情，支持指定第三方账号查询详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchShowUserDetailsRequest 请求对象
     * @return SyncInvoker<BatchShowUserDetailsRequest, BatchShowUserDetailsResponse>
     */
    public SyncInvoker<BatchShowUserDetailsRequest, BatchShowUserDetailsResponse> batchShowUserDetailsInvoker(
        BatchShowUserDetailsRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.batchShowUserDetails, hcClient);
    }

    /**
     * 批量修改终端状态
     *
     * 企业管理员通过该接口批量修改专业会议终端状态。当硬终端资源到期后，若企业内对应资源的硬终端超过数量后会被系统随机自动停用，此时可通过该接口修改专业会议终端的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateDevicesStatusRequest 请求对象
     * @return BatchUpdateDevicesStatusResponse
     */
    public BatchUpdateDevicesStatusResponse batchUpdateDevicesStatus(BatchUpdateDevicesStatusRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.batchUpdateDevicesStatus);
    }

    /**
     * 批量修改终端状态
     *
     * 企业管理员通过该接口批量修改专业会议终端状态。当硬终端资源到期后，若企业内对应资源的硬终端超过数量后会被系统随机自动停用，此时可通过该接口修改专业会议终端的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateDevicesStatusRequest 请求对象
     * @return SyncInvoker<BatchUpdateDevicesStatusRequest, BatchUpdateDevicesStatusResponse>
     */
    public SyncInvoker<BatchUpdateDevicesStatusRequest, BatchUpdateDevicesStatusResponse> batchUpdateDevicesStatusInvoker(
        BatchUpdateDevicesStatusRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.batchUpdateDevicesStatus, hcClient);
    }

    /**
     * 批量修改用户状态
     *
     * 企业管理员通过该接口批量修改用户状态，当用户帐号数资源或者电子白板（SmartRooms）资源到期后，若企业内对应资源的用户帐号超过数量后会被系统随机自动停用，此时可通过该接口修改用户的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateUserStatusRequest 请求对象
     * @return BatchUpdateUserStatusResponse
     */
    public BatchUpdateUserStatusResponse batchUpdateUserStatus(BatchUpdateUserStatusRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.batchUpdateUserStatus);
    }

    /**
     * 批量修改用户状态
     *
     * 企业管理员通过该接口批量修改用户状态，当用户帐号数资源或者电子白板（SmartRooms）资源到期后，若企业内对应资源的用户帐号超过数量后会被系统随机自动停用，此时可通过该接口修改用户的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateUserStatusRequest 请求对象
     * @return SyncInvoker<BatchUpdateUserStatusRequest, BatchUpdateUserStatusResponse>
     */
    public SyncInvoker<BatchUpdateUserStatusRequest, BatchUpdateUserStatusResponse> batchUpdateUserStatusInvoker(
        BatchUpdateUserStatusRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.batchUpdateUserStatus, hcClient);
    }

    /**
     * 广播会场
     *
     * 该接口用于广播指定的与会者。同一时间，只允许一个与会者被广播。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BroadcastParticipantRequest 请求对象
     * @return BroadcastParticipantResponse
     */
    public BroadcastParticipantResponse broadcastParticipant(BroadcastParticipantRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.broadcastParticipant);
    }

    /**
     * 广播会场
     *
     * 该接口用于广播指定的与会者。同一时间，只允许一个与会者被广播。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BroadcastParticipantRequest 请求对象
     * @return SyncInvoker<BroadcastParticipantRequest, BroadcastParticipantResponse>
     */
    public SyncInvoker<BroadcastParticipantRequest, BroadcastParticipantResponse> broadcastParticipantInvoker(
        BroadcastParticipantRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.broadcastParticipant, hcClient);
    }

    /**
     * 取消广播
     *
     * 该接口用于取消广播，包括：取消广播多画面，取消广播会场，取消点名会场。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelBroadcastRequest 请求对象
     * @return CancelBroadcastResponse
     */
    public CancelBroadcastResponse cancelBroadcast(CancelBroadcastRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.cancelBroadcast);
    }

    /**
     * 取消广播
     *
     * 该接口用于取消广播，包括：取消广播多画面，取消广播会场，取消点名会场。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelBroadcastRequest 请求对象
     * @return SyncInvoker<CancelBroadcastRequest, CancelBroadcastResponse>
     */
    public SyncInvoker<CancelBroadcastRequest, CancelBroadcastResponse> cancelBroadcastInvoker(
        CancelBroadcastRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.cancelBroadcast, hcClient);
    }

    /**
     * 取消预约会议
     *
     * 该接口用于取消预约的会议。企业管理员可以取消本企业下用户创建的会议，普通用户只能取消自己创建的会议。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelMeetingRequest 请求对象
     * @return CancelMeetingResponse
     */
    public CancelMeetingResponse cancelMeeting(CancelMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.cancelMeeting);
    }

    /**
     * 取消预约会议
     *
     * 该接口用于取消预约的会议。企业管理员可以取消本企业下用户创建的会议，普通用户只能取消自己创建的会议。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelMeetingRequest 请求对象
     * @return SyncInvoker<CancelMeetingRequest, CancelMeetingResponse>
     */
    public SyncInvoker<CancelMeetingRequest, CancelMeetingResponse> cancelMeetingInvoker(CancelMeetingRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.cancelMeeting, hcClient);
    }

    /**
     * 取消周期性会议
     *
     * 该接口用于取消周期性会议。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelRecurringMeetingRequest 请求对象
     * @return CancelRecurringMeetingResponse
     */
    public CancelRecurringMeetingResponse cancelRecurringMeeting(CancelRecurringMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.cancelRecurringMeeting);
    }

    /**
     * 取消周期性会议
     *
     * 该接口用于取消周期性会议。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelRecurringMeetingRequest 请求对象
     * @return SyncInvoker<CancelRecurringMeetingRequest, CancelRecurringMeetingResponse>
     */
    public SyncInvoker<CancelRecurringMeetingRequest, CancelRecurringMeetingResponse> cancelRecurringMeetingInvoker(
        CancelRecurringMeetingRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.cancelRecurringMeeting, hcClient);
    }

    /**
     * 取消周期性会议的子会议
     *
     * 该接口用于取消周期性会议的子会议。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelRecurringSubMeetingRequest 请求对象
     * @return CancelRecurringSubMeetingResponse
     */
    public CancelRecurringSubMeetingResponse cancelRecurringSubMeeting(CancelRecurringSubMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.cancelRecurringSubMeeting);
    }

    /**
     * 取消周期性会议的子会议
     *
     * 该接口用于取消周期性会议的子会议。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelRecurringSubMeetingRequest 请求对象
     * @return SyncInvoker<CancelRecurringSubMeetingRequest, CancelRecurringSubMeetingResponse>
     */
    public SyncInvoker<CancelRecurringSubMeetingRequest, CancelRecurringSubMeetingResponse> cancelRecurringSubMeetingInvoker(
        CancelRecurringSubMeetingRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.cancelRecurringSubMeeting, hcClient);
    }

    /**
     * 校验滑块验证码
     *
     * 该接口提供校验滑块验证码。服务器收到请求，返回校验结果。用户在前台界面通过滑块操作匹配图形，使得抠图和原图吻合。然后服务器进行校验滑块验证码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckSlideVerifyCodeRequest 请求对象
     * @return CheckSlideVerifyCodeResponse
     */
    public CheckSlideVerifyCodeResponse checkSlideVerifyCode(CheckSlideVerifyCodeRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.checkSlideVerifyCode);
    }

    /**
     * 校验滑块验证码
     *
     * 该接口提供校验滑块验证码。服务器收到请求，返回校验结果。用户在前台界面通过滑块操作匹配图形，使得抠图和原图吻合。然后服务器进行校验滑块验证码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckSlideVerifyCodeRequest 请求对象
     * @return SyncInvoker<CheckSlideVerifyCodeRequest, CheckSlideVerifyCodeResponse>
     */
    public SyncInvoker<CheckSlideVerifyCodeRequest, CheckSlideVerifyCodeResponse> checkSlideVerifyCodeInvoker(
        CheckSlideVerifyCodeRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.checkSlideVerifyCode, hcClient);
    }

    /**
     * 校验Token
     *
     * 该接口提供校验token合法性功能。服务器收到请求后，验证token合法性并返回结果。如果参数needGenNewToken为true时，生成新的token并返回。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckTokenRequest 请求对象
     * @return CheckTokenResponse
     */
    public CheckTokenResponse checkToken(CheckTokenRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.checkToken);
    }

    /**
     * 校验Token
     *
     * 该接口提供校验token合法性功能。服务器收到请求后，验证token合法性并返回结果。如果参数needGenNewToken为true时，生成新的token并返回。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckTokenRequest 请求对象
     * @return SyncInvoker<CheckTokenRequest, CheckTokenResponse>
     */
    public SyncInvoker<CheckTokenRequest, CheckTokenResponse> checkTokenInvoker(CheckTokenRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.checkToken, hcClient);
    }

    /**
     * 校验手机和邮箱对应的验证码
     *
     * 企业用户通过该接口校验手机和邮箱对应的验证码，一分钟内记录尝试次数不得超过5次。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckVeriCodeForUpdateUserInfoRequest 请求对象
     * @return CheckVeriCodeForUpdateUserInfoResponse
     */
    public CheckVeriCodeForUpdateUserInfoResponse checkVeriCodeForUpdateUserInfo(
        CheckVeriCodeForUpdateUserInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.checkVeriCodeForUpdateUserInfo);
    }

    /**
     * 校验手机和邮箱对应的验证码
     *
     * 企业用户通过该接口校验手机和邮箱对应的验证码，一分钟内记录尝试次数不得超过5次。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckVeriCodeForUpdateUserInfoRequest 请求对象
     * @return SyncInvoker<CheckVeriCodeForUpdateUserInfoRequest, CheckVeriCodeForUpdateUserInfoResponse>
     */
    public SyncInvoker<CheckVeriCodeForUpdateUserInfoRequest, CheckVeriCodeForUpdateUserInfoResponse> checkVeriCodeForUpdateUserInfoInvoker(
        CheckVeriCodeForUpdateUserInfoRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.checkVeriCodeForUpdateUserInfo, hcClient);
    }

    /**
     * 校验验证码
     *
     * 该接口提供校验验证码，服务器收到请求，返回结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckVerifyCodeRequest 请求对象
     * @return CheckVerifyCodeResponse
     */
    public CheckVerifyCodeResponse checkVerifyCode(CheckVerifyCodeRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.checkVerifyCode);
    }

    /**
     * 校验验证码
     *
     * 该接口提供校验验证码，服务器收到请求，返回结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckVerifyCodeRequest 请求对象
     * @return SyncInvoker<CheckVerifyCodeRequest, CheckVerifyCodeResponse>
     */
    public SyncInvoker<CheckVerifyCodeRequest, CheckVerifyCodeResponse> checkVerifyCodeInvoker(
        CheckVerifyCodeRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.checkVerifyCode, hcClient);
    }

    /**
     * 匿名用户会议鉴权
     *
     * 该接口用于匿名用户入会鉴权。请求根据会议ID和密码鉴权，返回鉴权随机数（可以根据该随机数获取匿名用户信息、会议信息等）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAnonymousAuthRandomRequest 请求对象
     * @return CreateAnonymousAuthRandomResponse
     */
    public CreateAnonymousAuthRandomResponse createAnonymousAuthRandom(CreateAnonymousAuthRandomRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.createAnonymousAuthRandom);
    }

    /**
     * 匿名用户会议鉴权
     *
     * 该接口用于匿名用户入会鉴权。请求根据会议ID和密码鉴权，返回鉴权随机数（可以根据该随机数获取匿名用户信息、会议信息等）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAnonymousAuthRandomRequest 请求对象
     * @return SyncInvoker<CreateAnonymousAuthRandomRequest, CreateAnonymousAuthRandomResponse>
     */
    public SyncInvoker<CreateAnonymousAuthRandomRequest, CreateAnonymousAuthRandomResponse> createAnonymousAuthRandomInvoker(
        CreateAnonymousAuthRandomRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.createAnonymousAuthRandom, hcClient);
    }

    /**
     * 获取会控Token
     *
     * 该接口用于获取正在召开会议的会控Token（未开始的会议调用该接口返回失败）。Token有效期是半个小时。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfTokenRequest 请求对象
     * @return CreateConfTokenResponse
     */
    public CreateConfTokenResponse createConfToken(CreateConfTokenRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.createConfToken);
    }

    /**
     * 获取会控Token
     *
     * 该接口用于获取正在召开会议的会控Token（未开始的会议调用该接口返回失败）。Token有效期是半个小时。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfTokenRequest 请求对象
     * @return SyncInvoker<CreateConfTokenRequest, CreateConfTokenResponse>
     */
    public SyncInvoker<CreateConfTokenRequest, CreateConfTokenResponse> createConfTokenInvoker(
        CreateConfTokenRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.createConfToken, hcClient);
    }

    /**
     * 创建会议
     *
     * 该接口用于创建立即会议和预约会议。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMeetingRequest 请求对象
     * @return CreateMeetingResponse
     */
    public CreateMeetingResponse createMeeting(CreateMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.createMeeting);
    }

    /**
     * 创建会议
     *
     * 该接口用于创建立即会议和预约会议。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMeetingRequest 请求对象
     * @return SyncInvoker<CreateMeetingRequest, CreateMeetingResponse>
     */
    public SyncInvoker<CreateMeetingRequest, CreateMeetingResponse> createMeetingInvoker(CreateMeetingRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.createMeeting, hcClient);
    }

    /**
     * 获取页面免登陆跳转的nonce信息
     *
     * 通过Access Token生成页面免登陆跳转到华为云会议的Portal的nonce信息。获取到nonce信息后，通过链接https://meeting.huaweicloud.com/?lang&#x3D;zh-CN&amp;nonce&#x3D;xxxxxxxxxxxxx#/login进行免登陆跳转。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePortalRefNonceRequest 请求对象
     * @return CreatePortalRefNonceResponse
     */
    public CreatePortalRefNonceResponse createPortalRefNonce(CreatePortalRefNonceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.createPortalRefNonce);
    }

    /**
     * 获取页面免登陆跳转的nonce信息
     *
     * 通过Access Token生成页面免登陆跳转到华为云会议的Portal的nonce信息。获取到nonce信息后，通过链接https://meeting.huaweicloud.com/?lang&#x3D;zh-CN&amp;nonce&#x3D;xxxxxxxxxxxxx#/login进行免登陆跳转。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePortalRefNonceRequest 请求对象
     * @return SyncInvoker<CreatePortalRefNonceRequest, CreatePortalRefNonceResponse>
     */
    public SyncInvoker<CreatePortalRefNonceRequest, CreatePortalRefNonceResponse> createPortalRefNonceInvoker(
        CreatePortalRefNonceRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.createPortalRefNonce, hcClient);
    }

    /**
     * 创建周期性会议
     *
     * 该接口用于预约周期性会议。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRecurringMeetingRequest 请求对象
     * @return CreateRecurringMeetingResponse
     */
    public CreateRecurringMeetingResponse createRecurringMeeting(CreateRecurringMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.createRecurringMeeting);
    }

    /**
     * 创建周期性会议
     *
     * 该接口用于预约周期性会议。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRecurringMeetingRequest 请求对象
     * @return SyncInvoker<CreateRecurringMeetingRequest, CreateRecurringMeetingResponse>
     */
    public SyncInvoker<CreateRecurringMeetingRequest, CreateRecurringMeetingResponse> createRecurringMeetingInvoker(
        CreateRecurringMeetingRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.createRecurringMeeting, hcClient);
    }

    /**
     * 企业管理员生成激活码
     *
     * 企业管理员生成智慧屏、电子白板（SmartRooms）、Ideahub的激活码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVisionActiveCodeRequest 请求对象
     * @return CreateVisionActiveCodeResponse
     */
    public CreateVisionActiveCodeResponse createVisionActiveCode(CreateVisionActiveCodeRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.createVisionActiveCode);
    }

    /**
     * 企业管理员生成激活码
     *
     * 企业管理员生成智慧屏、电子白板（SmartRooms）、Ideahub的激活码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVisionActiveCodeRequest 请求对象
     * @return SyncInvoker<CreateVisionActiveCodeRequest, CreateVisionActiveCodeResponse>
     */
    public SyncInvoker<CreateVisionActiveCodeRequest, CreateVisionActiveCodeResponse> createVisionActiveCodeInvoker(
        CreateVisionActiveCodeRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.createVisionActiveCode, hcClient);
    }

    /**
     * 获取websocket建链Token
     *
     * 该接口用于获取会控WebSocket建链的临时Token。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWebSocketTokenRequest 请求对象
     * @return CreateWebSocketTokenResponse
     */
    public CreateWebSocketTokenResponse createWebSocketToken(CreateWebSocketTokenRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.createWebSocketToken);
    }

    /**
     * 获取websocket建链Token
     *
     * 该接口用于获取会控WebSocket建链的临时Token。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWebSocketTokenRequest 请求对象
     * @return SyncInvoker<CreateWebSocketTokenRequest, CreateWebSocketTokenResponse>
     */
    public SyncInvoker<CreateWebSocketTokenRequest, CreateWebSocketTokenResponse> createWebSocketTokenInvoker(
        CreateWebSocketTokenRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.createWebSocketToken, hcClient);
    }

    /**
     * 预约网络研讨会
     *
     * 该接口用于创建网络研讨会。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWebinarRequest 请求对象
     * @return CreateWebinarResponse
     */
    public CreateWebinarResponse createWebinar(CreateWebinarRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.createWebinar);
    }

    /**
     * 预约网络研讨会
     *
     * 该接口用于创建网络研讨会。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWebinarRequest 请求对象
     * @return SyncInvoker<CreateWebinarRequest, CreateWebinarResponse>
     */
    public SyncInvoker<CreateWebinarRequest, CreateWebinarResponse> createWebinarInvoker(CreateWebinarRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.createWebinar, hcClient);
    }

    /**
     * 删除企业应用
     *
     * 企业管理员删除企业应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppIdRequest 请求对象
     * @return DeleteAppIdResponse
     */
    public DeleteAppIdResponse deleteAppId(DeleteAppIdRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.deleteAppId);
    }

    /**
     * 删除企业应用
     *
     * 企业管理员删除企业应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAppIdRequest 请求对象
     * @return SyncInvoker<DeleteAppIdRequest, DeleteAppIdResponse>
     */
    public SyncInvoker<DeleteAppIdRequest, DeleteAppIdResponse> deleteAppIdInvoker(DeleteAppIdRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.deleteAppId, hcClient);
    }

    /**
     * 删除与会者
     *
     * 该接口用于删除与会者。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAttendeesRequest 请求对象
     * @return DeleteAttendeesResponse
     */
    public DeleteAttendeesResponse deleteAttendees(DeleteAttendeesRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.deleteAttendees);
    }

    /**
     * 删除与会者
     *
     * 该接口用于删除与会者。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAttendeesRequest 请求对象
     * @return SyncInvoker<DeleteAttendeesRequest, DeleteAttendeesResponse>
     */
    public SyncInvoker<DeleteAttendeesRequest, DeleteAttendeesResponse> deleteAttendeesInvoker(
        DeleteAttendeesRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.deleteAttendees, hcClient);
    }

    /**
     * SP管理员删除企业
     *
     * 删除企业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCorpRequest 请求对象
     * @return DeleteCorpResponse
     */
    public DeleteCorpResponse deleteCorp(DeleteCorpRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.deleteCorp);
    }

    /**
     * SP管理员删除企业
     *
     * 删除企业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCorpRequest 请求对象
     * @return SyncInvoker<DeleteCorpRequest, DeleteCorpResponse>
     */
    public SyncInvoker<DeleteCorpRequest, DeleteCorpResponse> deleteCorpInvoker(DeleteCorpRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.deleteCorp, hcClient);
    }

    /**
     * 删除云会议室
     *
     * 企业管理员通过该接口删除企业的云会议室。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCorpVmrRequest 请求对象
     * @return DeleteCorpVmrResponse
     */
    public DeleteCorpVmrResponse deleteCorpVmr(DeleteCorpVmrRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.deleteCorpVmr);
    }

    /**
     * 删除云会议室
     *
     * 企业管理员通过该接口删除企业的云会议室。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCorpVmrRequest 请求对象
     * @return SyncInvoker<DeleteCorpVmrRequest, DeleteCorpVmrResponse>
     */
    public SyncInvoker<DeleteCorpVmrRequest, DeleteCorpVmrResponse> deleteCorpVmrInvoker(DeleteCorpVmrRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.deleteCorpVmr, hcClient);
    }

    /**
     * 删除部门
     *
     * 企业管理员通过该接口删除部门。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDepartmentRequest 请求对象
     * @return DeleteDepartmentResponse
     */
    public DeleteDepartmentResponse deleteDepartment(DeleteDepartmentRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.deleteDepartment);
    }

    /**
     * 删除部门
     *
     * 企业管理员通过该接口删除部门。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDepartmentRequest 请求对象
     * @return SyncInvoker<DeleteDepartmentRequest, DeleteDepartmentResponse>
     */
    public SyncInvoker<DeleteDepartmentRequest, DeleteDepartmentResponse> deleteDepartmentInvoker(
        DeleteDepartmentRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.deleteDepartment, hcClient);
    }

    /**
     * 删除多画面布局
     *
     * 该接口用于删除当前会议已保存的多画面布局。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLayoutRequest 请求对象
     * @return DeleteLayoutResponse
     */
    public DeleteLayoutResponse deleteLayout(DeleteLayoutRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.deleteLayout);
    }

    /**
     * 删除多画面布局
     *
     * 该接口用于删除当前会议已保存的多画面布局。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLayoutRequest 请求对象
     * @return SyncInvoker<DeleteLayoutRequest, DeleteLayoutResponse>
     */
    public SyncInvoker<DeleteLayoutRequest, DeleteLayoutResponse> deleteLayoutInvoker(DeleteLayoutRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.deleteLayout, hcClient);
    }

    /**
     * 批量删除录制
     *
     * 该接口用于批量删除会议的录制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRecordingsRequest 请求对象
     * @return DeleteRecordingsResponse
     */
    public DeleteRecordingsResponse deleteRecordings(DeleteRecordingsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.deleteRecordings);
    }

    /**
     * 批量删除录制
     *
     * 该接口用于批量删除会议的录制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRecordingsRequest 请求对象
     * @return SyncInvoker<DeleteRecordingsRequest, DeleteRecordingsResponse>
     */
    public SyncInvoker<DeleteRecordingsRequest, DeleteRecordingsResponse> deleteRecordingsInvoker(
        DeleteRecordingsRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.deleteRecordings, hcClient);
    }

    /**
     * SP管理员根据删除企业资源
     *
     * 企业删除资源项，删除资源项后，企业资源总数会自动减少。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceRequest 请求对象
     * @return DeleteResourceResponse
     */
    public DeleteResourceResponse deleteResource(DeleteResourceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.deleteResource);
    }

    /**
     * SP管理员根据删除企业资源
     *
     * 企业删除资源项，删除资源项后，企业资源总数会自动减少。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceRequest 请求对象
     * @return SyncInvoker<DeleteResourceRequest, DeleteResourceResponse>
     */
    public SyncInvoker<DeleteResourceRequest, DeleteResourceResponse> deleteResourceInvoker(
        DeleteResourceRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.deleteResource, hcClient);
    }

    /**
     * 注销登录
     *
     * 该接口提供注销功能。服务器收到请求后，删除该Token。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTokenRequest 请求对象
     * @return DeleteTokenResponse
     */
    public DeleteTokenResponse deleteToken(DeleteTokenRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.deleteToken);
    }

    /**
     * 注销登录
     *
     * 该接口提供注销功能。服务器收到请求后，删除该Token。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTokenRequest 请求对象
     * @return SyncInvoker<DeleteTokenRequest, DeleteTokenResponse>
     */
    public SyncInvoker<DeleteTokenRequest, DeleteTokenResponse> deleteTokenInvoker(DeleteTokenRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.deleteToken, hcClient);
    }

    /**
     * 企业管理员删除激活码
     *
     * 企业管理员批量删除激活码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVisionActiveCodeRequest 请求对象
     * @return DeleteVisionActiveCodeResponse
     */
    public DeleteVisionActiveCodeResponse deleteVisionActiveCode(DeleteVisionActiveCodeRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.deleteVisionActiveCode);
    }

    /**
     * 企业管理员删除激活码
     *
     * 企业管理员批量删除激活码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVisionActiveCodeRequest 请求对象
     * @return SyncInvoker<DeleteVisionActiveCodeRequest, DeleteVisionActiveCodeResponse>
     */
    public SyncInvoker<DeleteVisionActiveCodeRequest, DeleteVisionActiveCodeResponse> deleteVisionActiveCodeInvoker(
        DeleteVisionActiveCodeRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.deleteVisionActiveCode, hcClient);
    }

    /**
     * 删除事件推送
     *
     * 该接口用于管理员删除已配置的事件推送设置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWebHookConfigRequest 请求对象
     * @return DeleteWebHookConfigResponse
     */
    public DeleteWebHookConfigResponse deleteWebHookConfig(DeleteWebHookConfigRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.deleteWebHookConfig);
    }

    /**
     * 删除事件推送
     *
     * 该接口用于管理员删除已配置的事件推送设置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWebHookConfigRequest 请求对象
     * @return SyncInvoker<DeleteWebHookConfigRequest, DeleteWebHookConfigResponse>
     */
    public SyncInvoker<DeleteWebHookConfigRequest, DeleteWebHookConfigResponse> deleteWebHookConfigInvoker(
        DeleteWebHookConfigRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.deleteWebHookConfig, hcClient);
    }

    /**
     * 取消网络研讨会
     *
     * 该接口用于取消已预约的网络研讨会。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWebinarRequest 请求对象
     * @return DeleteWebinarResponse
     */
    public DeleteWebinarResponse deleteWebinar(DeleteWebinarRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.deleteWebinar);
    }

    /**
     * 取消网络研讨会
     *
     * 该接口用于取消已预约的网络研讨会。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWebinarRequest 请求对象
     * @return SyncInvoker<DeleteWebinarRequest, DeleteWebinarResponse>
     */
    public SyncInvoker<DeleteWebinarRequest, DeleteWebinarResponse> deleteWebinarInvoker(DeleteWebinarRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.deleteWebinar, hcClient);
    }

    /**
     * 回收云会议室
     *
     * 企业管理员通过该接口回收云会议室。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateVmrRequest 请求对象
     * @return DisassociateVmrResponse
     */
    public DisassociateVmrResponse disassociateVmr(DisassociateVmrRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.disassociateVmr);
    }

    /**
     * 回收云会议室
     *
     * 企业管理员通过该接口回收云会议室。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateVmrRequest 请求对象
     * @return SyncInvoker<DisassociateVmrRequest, DisassociateVmrResponse>
     */
    public SyncInvoker<DisassociateVmrRequest, DisassociateVmrResponse> disassociateVmrInvoker(
        DisassociateVmrRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.disassociateVmr, hcClient);
    }

    /**
     * 举手
     *
     * 该接口用于设置指定与会者的举手/放下举手状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HandRequest 请求对象
     * @return HandResponse
     */
    public HandResponse hand(HandRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.hand);
    }

    /**
     * 举手
     *
     * 该接口用于设置指定与会者的举手/放下举手状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HandRequest 请求对象
     * @return SyncInvoker<HandRequest, HandResponse>
     */
    public SyncInvoker<HandRequest, HandResponse> handInvoker(HandRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.hand, hcClient);
    }

    /**
     * 挂断与会者
     *
     * 该接口用于挂断正在通话中的与会者。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HangUpRequest 请求对象
     * @return HangUpResponse
     */
    public HangUpResponse hangUp(HangUpRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.hangUp);
    }

    /**
     * 挂断与会者
     *
     * 该接口用于挂断正在通话中的与会者。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HangUpRequest 请求对象
     * @return SyncInvoker<HangUpRequest, HangUpResponse>
     */
    public SyncInvoker<HangUpRequest, HangUpResponse> hangUpInvoker(HangUpRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.hangUp, hcClient);
    }

    /**
     * 主持人邀请与会者开启/关闭摄像头
     *
     * 该接口用于邀请指定与会者开启、关闭摄像头。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InviteOperateVideoRequest 请求对象
     * @return InviteOperateVideoResponse
     */
    public InviteOperateVideoResponse inviteOperateVideo(InviteOperateVideoRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.inviteOperateVideo);
    }

    /**
     * 主持人邀请与会者开启/关闭摄像头
     *
     * 该接口用于邀请指定与会者开启、关闭摄像头。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InviteOperateVideoRequest 请求对象
     * @return SyncInvoker<InviteOperateVideoRequest, InviteOperateVideoResponse>
     */
    public SyncInvoker<InviteOperateVideoRequest, InviteOperateVideoResponse> inviteOperateVideoInvoker(
        InviteOperateVideoRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.inviteOperateVideo, hcClient);
    }

    /**
     * 邀请与会者
     *
     * 该接口用于邀请与会者加入会议。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InviteParticipantRequest 请求对象
     * @return InviteParticipantResponse
     */
    public InviteParticipantResponse inviteParticipant(InviteParticipantRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.inviteParticipant);
    }

    /**
     * 邀请与会者
     *
     * 该接口用于邀请与会者加入会议。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InviteParticipantRequest 请求对象
     * @return SyncInvoker<InviteParticipantRequest, InviteParticipantResponse>
     */
    public SyncInvoker<InviteParticipantRequest, InviteParticipantResponse> inviteParticipantInvoker(
        InviteParticipantRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.inviteParticipant, hcClient);
    }

    /**
     * 邀请共享
     *
     * 该接口用于邀请/取消邀请指定与会人共享桌面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InviteShareRequest 请求对象
     * @return InviteShareResponse
     */
    public InviteShareResponse inviteShare(InviteShareRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.inviteShare);
    }

    /**
     * 邀请共享
     *
     * 该接口用于邀请/取消邀请指定与会人共享桌面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InviteShareRequest 请求对象
     * @return SyncInvoker<InviteShareRequest, InviteShareResponse>
     */
    public SyncInvoker<InviteShareRequest, InviteShareResponse> inviteShareInvoker(InviteShareRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.inviteShare, hcClient);
    }

    /**
     * 邀请用户
     *
     * 通过手机号码或者邮箱地址邀请用户加入企业。
     * * 若被邀请用户在华为云会议系统中不存在，则：
     *   - 华为云会议免费版和华为云会议标准版发送短信/邮件邀请用户完成注册后加入企业。用户注册成功后，加入该企业。
     *   - 华为云会议旗舰版在企业内直接添加该用户。用户会收到华为云会议的初始密码，用户第一次以手机号或者邮箱登录时，需要修改密码。
     * * 若被邀请用户在华为云会议系统中存在，则该用户会收到短信或者邮件确认。确认完成后改用户加入企业内。该用户的密码保持原来的密码不变。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InviteUserRequest 请求对象
     * @return InviteUserResponse
     */
    public InviteUserResponse inviteUser(InviteUserRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.inviteUser);
    }

    /**
     * 邀请用户
     *
     * 通过手机号码或者邮箱地址邀请用户加入企业。
     * * 若被邀请用户在华为云会议系统中不存在，则：
     *   - 华为云会议免费版和华为云会议标准版发送短信/邮件邀请用户完成注册后加入企业。用户注册成功后，加入该企业。
     *   - 华为云会议旗舰版在企业内直接添加该用户。用户会收到华为云会议的初始密码，用户第一次以手机号或者邮箱登录时，需要修改密码。
     * * 若被邀请用户在华为云会议系统中存在，则该用户会收到短信或者邮件确认。确认完成后改用户加入企业内。该用户的密码保持原来的密码不变。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InviteUserRequest 请求对象
     * @return SyncInvoker<InviteUserRequest, InviteUserResponse>
     */
    public SyncInvoker<InviteUserRequest, InviteUserResponse> inviteUserInvoker(InviteUserRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.inviteUser, hcClient);
    }

    /**
     * 通过会议ID和密码邀请与会者
     *
     * 该接口用于通过会议ID和密码邀请与会者。一般用于App已知会议ID和来宾密码，通过扫码等方式获取其他终端的SIP号码后，使用该接口将其他终端邀请加入会议中。
     * &gt; 需要管理员在企业的“会议设置”&gt;“来宾扫码邀请任意硬终端入会”设置成打开，才允许通过来宾密码邀请其他终端入会。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InviteWithPwdRequest 请求对象
     * @return InviteWithPwdResponse
     */
    public InviteWithPwdResponse inviteWithPwd(InviteWithPwdRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.inviteWithPwd);
    }

    /**
     * 通过会议ID和密码邀请与会者
     *
     * 该接口用于通过会议ID和密码邀请与会者。一般用于App已知会议ID和来宾密码，通过扫码等方式获取其他终端的SIP号码后，使用该接口将其他终端邀请加入会议中。
     * &gt; 需要管理员在企业的“会议设置”&gt;“来宾扫码邀请任意硬终端入会”设置成打开，才允许通过来宾密码邀请其他终端入会。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InviteWithPwdRequest 请求对象
     * @return SyncInvoker<InviteWithPwdRequest, InviteWithPwdResponse>
     */
    public SyncInvoker<InviteWithPwdRequest, InviteWithPwdResponse> inviteWithPwdInvoker(InviteWithPwdRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.inviteWithPwd, hcClient);
    }

    /**
     * 查询历史召开的网络研讨会列表
     *
     * 该接口用于查询历史网络研讨会。管理员可查询企业内历史网络研讨会，非管理员可查询个人历史网络研讨会。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryWebinarsRequest 请求对象
     * @return ListHistoryWebinarsResponse
     */
    public ListHistoryWebinarsResponse listHistoryWebinars(ListHistoryWebinarsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.listHistoryWebinars);
    }

    /**
     * 查询历史召开的网络研讨会列表
     *
     * 该接口用于查询历史网络研讨会。管理员可查询企业内历史网络研讨会，非管理员可查询个人历史网络研讨会。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryWebinarsRequest 请求对象
     * @return SyncInvoker<ListHistoryWebinarsRequest, ListHistoryWebinarsResponse>
     */
    public SyncInvoker<ListHistoryWebinarsRequest, ListHistoryWebinarsResponse> listHistoryWebinarsInvoker(
        ListHistoryWebinarsRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.listHistoryWebinars, hcClient);
    }

    /**
     * 查询会场网络质量
     *
     * 查询会场网络质量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNetworkQualityRequest 请求对象
     * @return ListNetworkQualityResponse
     */
    public ListNetworkQualityResponse listNetworkQuality(ListNetworkQualityRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.listNetworkQuality);
    }

    /**
     * 查询会场网络质量
     *
     * 查询会场网络质量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNetworkQualityRequest 请求对象
     * @return SyncInvoker<ListNetworkQualityRequest, ListNetworkQualityResponse>
     */
    public SyncInvoker<ListNetworkQualityRequest, ListNetworkQualityResponse> listNetworkQualityInvoker(
        ListNetworkQualityRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.listNetworkQuality, hcClient);
    }

    /**
     * 查询正在召开的网络研讨会列表
     *
     * 该接口用于查询正在召开的网络研讨会。管理员可查询企业内正在召开网络研讨会，非管理员可查询自己预订的正在召开的网络研讨会。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOngoingWebinarsRequest 请求对象
     * @return ListOngoingWebinarsResponse
     */
    public ListOngoingWebinarsResponse listOngoingWebinars(ListOngoingWebinarsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.listOngoingWebinars);
    }

    /**
     * 查询正在召开的网络研讨会列表
     *
     * 该接口用于查询正在召开的网络研讨会。管理员可查询企业内正在召开网络研讨会，非管理员可查询自己预订的正在召开的网络研讨会。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOngoingWebinarsRequest 请求对象
     * @return SyncInvoker<ListOngoingWebinarsRequest, ListOngoingWebinarsResponse>
     */
    public SyncInvoker<ListOngoingWebinarsRequest, ListOngoingWebinarsResponse> listOngoingWebinarsInvoker(
        ListOngoingWebinarsRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.listOngoingWebinars, hcClient);
    }

    /**
     * 查询即将召开的网络研讨会列表
     *
     * 该接口用于查询即将召开的网络研讨会。管理员可查询企业内即将召开网络研讨会，非管理员可查询自己预订的即将召开的网络研讨会。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUpComingWebinarsRequest 请求对象
     * @return ListUpComingWebinarsResponse
     */
    public ListUpComingWebinarsResponse listUpComingWebinars(ListUpComingWebinarsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.listUpComingWebinars);
    }

    /**
     * 查询即将召开的网络研讨会列表
     *
     * 该接口用于查询即将召开的网络研讨会。管理员可查询企业内即将召开网络研讨会，非管理员可查询自己预订的即将召开的网络研讨会。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUpComingWebinarsRequest 请求对象
     * @return SyncInvoker<ListUpComingWebinarsRequest, ListUpComingWebinarsResponse>
     */
    public SyncInvoker<ListUpComingWebinarsRequest, ListUpComingWebinarsResponse> listUpComingWebinarsInvoker(
        ListUpComingWebinarsRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.listUpComingWebinars, hcClient);
    }

    /**
     * 启停会议直播
     *
     * 该接口用于启动或停止会议直播。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LiveRequest 请求对象
     * @return LiveResponse
     */
    public LiveResponse live(LiveRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.live);
    }

    /**
     * 启停会议直播
     *
     * 该接口用于启动或停止会议直播。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LiveRequest 请求对象
     * @return SyncInvoker<LiveRequest, LiveResponse>
     */
    public SyncInvoker<LiveRequest, LiveResponse> liveInvoker(LiveRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.live, hcClient);
    }

    /**
     * 锁定会议
     *
     * 该接口用于锁定或解锁会议。锁定会议后，不允许新的来宾主动加入会议。会议锁定后使用主持人密码/主持人链接加入会议或者主持人邀请来宾不受影响。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LockMeetingRequest 请求对象
     * @return LockMeetingResponse
     */
    public LockMeetingResponse lockMeeting(LockMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.lockMeeting);
    }

    /**
     * 锁定会议
     *
     * 该接口用于锁定或解锁会议。锁定会议后，不允许新的来宾主动加入会议。会议锁定后使用主持人密码/主持人链接加入会议或者主持人邀请来宾不受影响。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LockMeetingRequest 请求对象
     * @return SyncInvoker<LockMeetingRequest, LockMeetingResponse>
     */
    public SyncInvoker<LockMeetingRequest, LockMeetingResponse> lockMeetingInvoker(LockMeetingRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.lockMeeting, hcClient);
    }

    /**
     * 锁定会场视频源
     *
     * 该接口用于锁定或者解锁某在线会场的视频源。只适用于专业会议终端（如TE系列等）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LockViewRequest 请求对象
     * @return LockViewResponse
     */
    public LockViewResponse lockView(LockViewRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.lockView);
    }

    /**
     * 锁定会场视频源
     *
     * 该接口用于锁定或者解锁某在线会场的视频源。只适用于专业会议终端（如TE系列等）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LockViewRequest 请求对象
     * @return SyncInvoker<LockViewRequest, LockViewResponse>
     */
    public SyncInvoker<LockViewRequest, LockViewResponse> lockViewInvoker(LockViewRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.lockView, hcClient);
    }

    /**
     * 移入等候室
     *
     * 该接口用于将会中的指定与会者移入到等候室。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MoveToWaitingRoomRequest 请求对象
     * @return MoveToWaitingRoomResponse
     */
    public MoveToWaitingRoomResponse moveToWaitingRoom(MoveToWaitingRoomRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.moveToWaitingRoom);
    }

    /**
     * 移入等候室
     *
     * 该接口用于将会中的指定与会者移入到等候室。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MoveToWaitingRoomRequest 请求对象
     * @return SyncInvoker<MoveToWaitingRoomRequest, MoveToWaitingRoomResponse>
     */
    public SyncInvoker<MoveToWaitingRoomRequest, MoveToWaitingRoomResponse> moveToWaitingRoomInvoker(
        MoveToWaitingRoomRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.moveToWaitingRoom, hcClient);
    }

    /**
     * 全场静音
     *
     * 该接口用于设置整个会议所有与会者（主持人除外）的静音/取消静音状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MuteMeetingRequest 请求对象
     * @return MuteMeetingResponse
     */
    public MuteMeetingResponse muteMeeting(MuteMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.muteMeeting);
    }

    /**
     * 全场静音
     *
     * 该接口用于设置整个会议所有与会者（主持人除外）的静音/取消静音状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MuteMeetingRequest 请求对象
     * @return SyncInvoker<MuteMeetingRequest, MuteMeetingResponse>
     */
    public SyncInvoker<MuteMeetingRequest, MuteMeetingResponse> muteMeetingInvoker(MuteMeetingRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.muteMeeting, hcClient);
    }

    /**
     * 静音与会者
     *
     * 该接口用于设置指定与会者静音/取消静音状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MuteParticipantRequest 请求对象
     * @return MuteParticipantResponse
     */
    public MuteParticipantResponse muteParticipant(MuteParticipantRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.muteParticipant);
    }

    /**
     * 静音与会者
     *
     * 该接口用于设置指定与会者静音/取消静音状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MuteParticipantRequest 请求对象
     * @return SyncInvoker<MuteParticipantRequest, MuteParticipantResponse>
     */
    public SyncInvoker<MuteParticipantRequest, MuteParticipantResponse> muteParticipantInvoker(
        MuteParticipantRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.muteParticipant, hcClient);
    }

    /**
     * 延长会议
     *
     * 该接口用于延长会议时间。默认会议自动延长。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ProlongMeetingRequest 请求对象
     * @return ProlongMeetingResponse
     */
    public ProlongMeetingResponse prolongMeeting(ProlongMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.prolongMeeting);
    }

    /**
     * 延长会议
     *
     * 该接口用于延长会议时间。默认会议自动延长。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ProlongMeetingRequest 请求对象
     * @return SyncInvoker<ProlongMeetingRequest, ProlongMeetingResponse>
     */
    public SyncInvoker<ProlongMeetingRequest, ProlongMeetingResponse> prolongMeetingInvoker(
        ProlongMeetingRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.prolongMeeting, hcClient);
    }

    /**
     * 启停会议录制
     *
     * 该接口用于启动或停止会议云录制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RecordRequest 请求对象
     * @return RecordResponse
     */
    public RecordResponse record(RecordRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.record);
    }

    /**
     * 启停会议录制
     *
     * 该接口用于启动或停止会议云录制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RecordRequest 请求对象
     * @return SyncInvoker<RecordRequest, RecordResponse>
     */
    public SyncInvoker<RecordRequest, RecordResponse> recordInvoker(RecordRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.record, hcClient);
    }

    /**
     * 重命名与会者
     *
     * 重命名某个与会者。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RenameParticipantRequest 请求对象
     * @return RenameParticipantResponse
     */
    public RenameParticipantResponse renameParticipant(RenameParticipantRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.renameParticipant);
    }

    /**
     * 重命名与会者
     *
     * 重命名某个与会者。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RenameParticipantRequest 请求对象
     * @return SyncInvoker<RenameParticipantRequest, RenameParticipantResponse>
     */
    public SyncInvoker<RenameParticipantRequest, RenameParticipantResponse> renameParticipantInvoker(
        RenameParticipantRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.renameParticipant, hcClient);
    }

    /**
     * 企业管理员通过sn重置激活码
     *
     * 当硬终端激活码失效时，企业管理员可以通过该接口重置激活码，使用重新获取的激活码激活终端，每24小时可重新激活5次。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetActivecodeRequest 请求对象
     * @return ResetActivecodeResponse
     */
    public ResetActivecodeResponse resetActivecode(ResetActivecodeRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.resetActivecode);
    }

    /**
     * 企业管理员通过sn重置激活码
     *
     * 当硬终端激活码失效时，企业管理员可以通过该接口重置激活码，使用重新获取的激活码激活终端，每24小时可重新激活5次。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetActivecodeRequest 请求对象
     * @return SyncInvoker<ResetActivecodeRequest, ResetActivecodeResponse>
     */
    public SyncInvoker<ResetActivecodeRequest, ResetActivecodeResponse> resetActivecodeInvoker(
        ResetActivecodeRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.resetActivecode, hcClient);
    }

    /**
     * 重置企业应用appkey
     *
     * 企业默认管理员重置企业应用appkey
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetAppKeyRequest 请求对象
     * @return ResetAppKeyResponse
     */
    public ResetAppKeyResponse resetAppKey(ResetAppKeyRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.resetAppKey);
    }

    /**
     * 重置企业应用appkey
     *
     * 企业默认管理员重置企业应用appkey
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetAppKeyRequest 请求对象
     * @return SyncInvoker<ResetAppKeyRequest, ResetAppKeyResponse>
     */
    public SyncInvoker<ResetAppKeyRequest, ResetAppKeyResponse> resetAppKeyInvoker(ResetAppKeyRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.resetAppKey, hcClient);
    }

    /**
     * 用户重置密码
     *
     * 该接口提供给用户重置密码功能，服务器收到请求，重新设置用户密码并返回结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPwdRequest 请求对象
     * @return ResetPwdResponse
     */
    public ResetPwdResponse resetPwd(ResetPwdRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.resetPwd);
    }

    /**
     * 用户重置密码
     *
     * 该接口提供给用户重置密码功能，服务器收到请求，重新设置用户密码并返回结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPwdRequest 请求对象
     * @return SyncInvoker<ResetPwdRequest, ResetPwdResponse>
     */
    public SyncInvoker<ResetPwdRequest, ResetPwdResponse> resetPwdInvoker(ResetPwdRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.resetPwd, hcClient);
    }

    /**
     * 企业管理员重置企业成员密码
     *
     * 企业管理员通过该接口提供企业管理员重置企业成员密码的功能。当服务器收到重置密码的请求时，发送新的密码到企业成员的邮箱或者短信，并返回结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPwdByAdminRequest 请求对象
     * @return ResetPwdByAdminResponse
     */
    public ResetPwdByAdminResponse resetPwdByAdmin(ResetPwdByAdminRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.resetPwdByAdmin);
    }

    /**
     * 企业管理员重置企业成员密码
     *
     * 企业管理员通过该接口提供企业管理员重置企业成员密码的功能。当服务器收到重置密码的请求时，发送新的密码到企业成员的邮箱或者短信，并返回结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPwdByAdminRequest 请求对象
     * @return SyncInvoker<ResetPwdByAdminRequest, ResetPwdByAdminResponse>
     */
    public SyncInvoker<ResetPwdByAdminRequest, ResetPwdByAdminResponse> resetPwdByAdminInvoker(
        ResetPwdByAdminRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.resetPwdByAdmin, hcClient);
    }

    /**
     * 企业管理员重置帐号的激活码
     *
     * 企业管理员重置帐号的激活码，重置后，原设备直接解绑，必须重新激活使用,若手机邮箱不填，则不会发送新的激活码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetVisionActiveCodeRequest 请求对象
     * @return ResetVisionActiveCodeResponse
     */
    public ResetVisionActiveCodeResponse resetVisionActiveCode(ResetVisionActiveCodeRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.resetVisionActiveCode);
    }

    /**
     * 企业管理员重置帐号的激活码
     *
     * 企业管理员重置帐号的激活码，重置后，原设备直接解绑，必须重新激活使用,若手机邮箱不填，则不会发送新的激活码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetVisionActiveCodeRequest 请求对象
     * @return SyncInvoker<ResetVisionActiveCodeRequest, ResetVisionActiveCodeResponse>
     */
    public SyncInvoker<ResetVisionActiveCodeRequest, ResetVisionActiveCodeResponse> resetVisionActiveCodeInvoker(
        ResetVisionActiveCodeRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.resetVisionActiveCode, hcClient);
    }

    /**
     * 开启/关闭同声传译
     *
     * 该接口用于会议主席可以通过该接口开启/关闭同声传译。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResumeSimultaneousInterpretationRequest 请求对象
     * @return ResumeSimultaneousInterpretationResponse
     */
    public ResumeSimultaneousInterpretationResponse resumeSimultaneousInterpretation(
        ResumeSimultaneousInterpretationRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.resumeSimultaneousInterpretation);
    }

    /**
     * 开启/关闭同声传译
     *
     * 该接口用于会议主席可以通过该接口开启/关闭同声传译。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResumeSimultaneousInterpretationRequest 请求对象
     * @return SyncInvoker<ResumeSimultaneousInterpretationRequest, ResumeSimultaneousInterpretationResponse>
     */
    public SyncInvoker<ResumeSimultaneousInterpretationRequest, ResumeSimultaneousInterpretationResponse> resumeSimultaneousInterpretationInvoker(
        ResumeSimultaneousInterpretationRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.resumeSimultaneousInterpretation, hcClient);
    }

    /**
     * 点名会场
     *
     * 该接口用于点名指定与会者。点名会场的效果是除了主持人外，点名与会者为非静音状态，未点名的与会者统一为静音状态。同一时间，只允许一个与会者被点名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RollcallParticipantRequest 请求对象
     * @return RollcallParticipantResponse
     */
    public RollcallParticipantResponse rollcallParticipant(RollcallParticipantRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.rollcallParticipant);
    }

    /**
     * 点名会场
     *
     * 该接口用于点名指定与会者。点名会场的效果是除了主持人外，点名与会者为非静音状态，未点名的与会者统一为静音状态。同一时间，只允许一个与会者被点名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RollcallParticipantRequest 请求对象
     * @return SyncInvoker<RollcallParticipantRequest, RollcallParticipantResponse>
     */
    public SyncInvoker<RollcallParticipantRequest, RollcallParticipantResponse> rollcallParticipantInvoker(
        RollcallParticipantRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.rollcallParticipant, hcClient);
    }

    /**
     * 保存多画面布局
     *
     * 该接口用于保存多画面布局。保存的多画面布局，只能在当前会议使用，会议结束后，保存的多画面布局就会释放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveLayoutRequest 请求对象
     * @return SaveLayoutResponse
     */
    public SaveLayoutResponse saveLayout(SaveLayoutRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.saveLayout);
    }

    /**
     * 保存多画面布局
     *
     * 该接口用于保存多画面布局。保存的多画面布局，只能在当前会议使用，会议结束后，保存的多画面布局就会释放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveLayoutRequest 请求对象
     * @return SyncInvoker<SaveLayoutRequest, SaveLayoutResponse>
     */
    public SyncInvoker<SaveLayoutRequest, SaveLayoutResponse> saveLayoutInvoker(SaveLayoutRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.saveLayout, hcClient);
    }

    /**
     * 查询历史会议的与会者记录
     *
     * 该接口用于查询指定历史会议的与会者记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchAttendanceRecordsOfHisMeetingRequest 请求对象
     * @return SearchAttendanceRecordsOfHisMeetingResponse
     */
    public SearchAttendanceRecordsOfHisMeetingResponse searchAttendanceRecordsOfHisMeeting(
        SearchAttendanceRecordsOfHisMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchAttendanceRecordsOfHisMeeting);
    }

    /**
     * 查询历史会议的与会者记录
     *
     * 该接口用于查询指定历史会议的与会者记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchAttendanceRecordsOfHisMeetingRequest 请求对象
     * @return SyncInvoker<SearchAttendanceRecordsOfHisMeetingRequest, SearchAttendanceRecordsOfHisMeetingResponse>
     */
    public SyncInvoker<SearchAttendanceRecordsOfHisMeetingRequest, SearchAttendanceRecordsOfHisMeetingResponse> searchAttendanceRecordsOfHisMeetingInvoker(
        SearchAttendanceRecordsOfHisMeetingRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.searchAttendanceRecordsOfHisMeeting, hcClient);
    }

    /**
     * SP管理员分页搜索企业
     *
     * SP管理员分页搜索企业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCorpRequest 请求对象
     * @return SearchCorpResponse
     */
    public SearchCorpResponse searchCorp(SearchCorpRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchCorp);
    }

    /**
     * SP管理员分页搜索企业
     *
     * SP管理员分页搜索企业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCorpRequest 请求对象
     * @return SyncInvoker<SearchCorpRequest, SearchCorpResponse>
     */
    public SyncInvoker<SearchCorpRequest, SearchCorpResponse> searchCorpInvoker(SearchCorpRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.searchCorp, hcClient);
    }

    /**
     * 分页查询企业管理员
     *
     * 通过该接口分页查询企业管理员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCorpAdminsRequest 请求对象
     * @return SearchCorpAdminsResponse
     */
    public SearchCorpAdminsResponse searchCorpAdmins(SearchCorpAdminsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchCorpAdmins);
    }

    /**
     * 分页查询企业管理员
     *
     * 通过该接口分页查询企业管理员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCorpAdminsRequest 请求对象
     * @return SyncInvoker<SearchCorpAdminsRequest, SearchCorpAdminsResponse>
     */
    public SyncInvoker<SearchCorpAdminsRequest, SearchCorpAdminsResponse> searchCorpAdminsInvoker(
        SearchCorpAdminsRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.searchCorpAdmins, hcClient);
    }

    /**
     * 查询企业通讯录
     *
     * 企业用户（含管理员）通过该接口查询该企业的通讯录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCorpDirRequest 请求对象
     * @return SearchCorpDirResponse
     */
    public SearchCorpDirResponse searchCorpDir(SearchCorpDirRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchCorpDir);
    }

    /**
     * 查询企业通讯录
     *
     * 企业用户（含管理员）通过该接口查询该企业的通讯录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCorpDirRequest 请求对象
     * @return SyncInvoker<SearchCorpDirRequest, SearchCorpDirResponse>
     */
    public SyncInvoker<SearchCorpDirRequest, SearchCorpDirResponse> searchCorpDirInvoker(SearchCorpDirRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.searchCorpDir, hcClient);
    }

    /**
     * 查询企业外部联系人
     *
     * 企业用户（含管理员）通过该接口查询该企业的外部联系人或者个人外部联系人。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCorpExternalDirRequest 请求对象
     * @return SearchCorpExternalDirResponse
     */
    public SearchCorpExternalDirResponse searchCorpExternalDir(SearchCorpExternalDirRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchCorpExternalDir);
    }

    /**
     * 查询企业外部联系人
     *
     * 企业用户（含管理员）通过该接口查询该企业的外部联系人或者个人外部联系人。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCorpExternalDirRequest 请求对象
     * @return SyncInvoker<SearchCorpExternalDirRequest, SearchCorpExternalDirResponse>
     */
    public SyncInvoker<SearchCorpExternalDirRequest, SearchCorpExternalDirResponse> searchCorpExternalDirInvoker(
        SearchCorpExternalDirRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.searchCorpExternalDir, hcClient);
    }

    /**
     * 企业管理员分页查询企业资源订单列表
     *
     * 企业管理员根据条件查询企业资源订单列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCorpResourcesRequest 请求对象
     * @return SearchCorpResourcesResponse
     */
    public SearchCorpResourcesResponse searchCorpResources(SearchCorpResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchCorpResources);
    }

    /**
     * 企业管理员分页查询企业资源订单列表
     *
     * 企业管理员根据条件查询企业资源订单列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCorpResourcesRequest 请求对象
     * @return SyncInvoker<SearchCorpResourcesRequest, SearchCorpResourcesResponse>
     */
    public SyncInvoker<SearchCorpResourcesRequest, SearchCorpResourcesResponse> searchCorpResourcesInvoker(
        SearchCorpResourcesRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.searchCorpResources, hcClient);
    }

    /**
     * 企业管理员分页查询企业云会议室
     *
     * 企业管理员通过该接口分页查询企业的云会议室。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCorpVmrRequest 请求对象
     * @return SearchCorpVmrResponse
     */
    public SearchCorpVmrResponse searchCorpVmr(SearchCorpVmrRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchCorpVmr);
    }

    /**
     * 企业管理员分页查询企业云会议室
     *
     * 企业管理员通过该接口分页查询企业的云会议室。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCorpVmrRequest 请求对象
     * @return SyncInvoker<SearchCorpVmrRequest, SearchCorpVmrResponse>
     */
    public SyncInvoker<SearchCorpVmrRequest, SearchCorpVmrResponse> searchCorpVmrInvoker(SearchCorpVmrRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.searchCorpVmr, hcClient);
    }

    /**
     * 查询历史会议的会控记录
     *
     * 该接口用于查询指定历史会议的会控记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCtlRecordsOfHisMeetingRequest 请求对象
     * @return SearchCtlRecordsOfHisMeetingResponse
     */
    public SearchCtlRecordsOfHisMeetingResponse searchCtlRecordsOfHisMeeting(
        SearchCtlRecordsOfHisMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchCtlRecordsOfHisMeeting);
    }

    /**
     * 查询历史会议的会控记录
     *
     * 该接口用于查询指定历史会议的会控记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCtlRecordsOfHisMeetingRequest 请求对象
     * @return SyncInvoker<SearchCtlRecordsOfHisMeetingRequest, SearchCtlRecordsOfHisMeetingResponse>
     */
    public SyncInvoker<SearchCtlRecordsOfHisMeetingRequest, SearchCtlRecordsOfHisMeetingResponse> searchCtlRecordsOfHisMeetingInvoker(
        SearchCtlRecordsOfHisMeetingRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.searchCtlRecordsOfHisMeeting, hcClient);
    }

    /**
     * 按名称查询所有的部门
     *
     * 企业管理员通过该接口按名称查询所有的部门。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchDepartmentByNameRequest 请求对象
     * @return SearchDepartmentByNameResponse
     */
    public SearchDepartmentByNameResponse searchDepartmentByName(SearchDepartmentByNameRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchDepartmentByName);
    }

    /**
     * 按名称查询所有的部门
     *
     * 企业管理员通过该接口按名称查询所有的部门。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchDepartmentByNameRequest 请求对象
     * @return SyncInvoker<SearchDepartmentByNameRequest, SearchDepartmentByNameResponse>
     */
    public SyncInvoker<SearchDepartmentByNameRequest, SearchDepartmentByNameResponse> searchDepartmentByNameInvoker(
        SearchDepartmentByNameRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.searchDepartmentByName, hcClient);
    }

    /**
     * 分页查询终端
     *
     * 企业管理员通过该接口分页查询专业会议终端信息。
     * &gt; 如果需要查询Ideahub、SmartRooms、智慧屏TV请使用[[分页查询用户](https://support.huaweicloud.com/api-meeting/meeting_21_0071.html)](tag:hws)[[分页查询用户](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_0071.html)](tag:hk)接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchDevicesRequest 请求对象
     * @return SearchDevicesResponse
     */
    public SearchDevicesResponse searchDevices(SearchDevicesRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchDevices);
    }

    /**
     * 分页查询终端
     *
     * 企业管理员通过该接口分页查询专业会议终端信息。
     * &gt; 如果需要查询Ideahub、SmartRooms、智慧屏TV请使用[[分页查询用户](https://support.huaweicloud.com/api-meeting/meeting_21_0071.html)](tag:hws)[[分页查询用户](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_0071.html)](tag:hk)接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchDevicesRequest 请求对象
     * @return SyncInvoker<SearchDevicesRequest, SearchDevicesResponse>
     */
    public SyncInvoker<SearchDevicesRequest, SearchDevicesResponse> searchDevicesInvoker(SearchDevicesRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.searchDevices, hcClient);
    }

    /**
     * 查询历史会议列表
     *
     * 该接口用于查询已经结束的会议。管理员可以查询本企业内所有的历史会议，普通用户仅能查询自己创建或者被邀请的历史会议。不带查询参数时，默认查询权限范围内的历史会议。
     * &gt; * 普通用户如果只是通过会议ID或者会议链接接入会议，不是预定者会前邀请或者会中主持人邀请的，则历史会议中无法查到
     * &gt; * 如果同一个会议召开并结束多次，则会产生多条历史会议（会议ID相同，会议UUID不同）
     * &gt; * 历史会议记录默认保留6个月，最长保留12个月。保留时间管理员可在“会议设置”的“历史会议留存时间”中修改
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchHisMeetingsRequest 请求对象
     * @return SearchHisMeetingsResponse
     */
    public SearchHisMeetingsResponse searchHisMeetings(SearchHisMeetingsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchHisMeetings);
    }

    /**
     * 查询历史会议列表
     *
     * 该接口用于查询已经结束的会议。管理员可以查询本企业内所有的历史会议，普通用户仅能查询自己创建或者被邀请的历史会议。不带查询参数时，默认查询权限范围内的历史会议。
     * &gt; * 普通用户如果只是通过会议ID或者会议链接接入会议，不是预定者会前邀请或者会中主持人邀请的，则历史会议中无法查到
     * &gt; * 如果同一个会议召开并结束多次，则会产生多条历史会议（会议ID相同，会议UUID不同）
     * &gt; * 历史会议记录默认保留6个月，最长保留12个月。保留时间管理员可在“会议设置”的“历史会议留存时间”中修改
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchHisMeetingsRequest 请求对象
     * @return SyncInvoker<SearchHisMeetingsRequest, SearchHisMeetingsResponse>
     */
    public SyncInvoker<SearchHisMeetingsRequest, SearchHisMeetingsResponse> searchHisMeetingsInvoker(
        SearchHisMeetingsRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.searchHisMeetings, hcClient);
    }

    /**
     * 分页查询信息窗素材
     *
     * 分页查询信息窗素材。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchMaterialsRequest 请求对象
     * @return SearchMaterialsResponse
     */
    public SearchMaterialsResponse searchMaterials(SearchMaterialsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchMaterials);
    }

    /**
     * 分页查询信息窗素材
     *
     * 分页查询信息窗素材。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchMaterialsRequest 请求对象
     * @return SyncInvoker<SearchMaterialsRequest, SearchMaterialsResponse>
     */
    public SyncInvoker<SearchMaterialsRequest, SearchMaterialsResponse> searchMaterialsInvoker(
        SearchMaterialsRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.searchMaterials, hcClient);
    }

    /**
     * 查询会议纪要列表
     *
     * 用户查询自己的会议纪要列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchMeetingFileListRequest 请求对象
     * @return SearchMeetingFileListResponse
     */
    public SearchMeetingFileListResponse searchMeetingFileList(SearchMeetingFileListRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchMeetingFileList);
    }

    /**
     * 查询会议纪要列表
     *
     * 用户查询自己的会议纪要列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchMeetingFileListRequest 请求对象
     * @return SyncInvoker<SearchMeetingFileListRequest, SearchMeetingFileListResponse>
     */
    public SyncInvoker<SearchMeetingFileListRequest, SearchMeetingFileListResponse> searchMeetingFileListInvoker(
        SearchMeetingFileListRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.searchMeetingFileList, hcClient);
    }

    /**
     * 查询会议列表
     *
     * 该接口用于查询尚未结束的会议。
     * * 管理员可以查询管理权限域内所有的会议，普通用户仅能查询自己创建或者需要参加的会议。不带查询参数时，默认查询权限范围内正在召开或还未召开的会议。
     * * 只能查询尚未结束的会议（既正在召开的会议和已预约还未召开的会议）。如果需要查询历史会议列表，请参考[[查询历史会议列表](https://support.huaweicloud.com/api-meeting/meeting_21_0051.html)](tag:hws)[[查询历史会议列表](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_0051.html)](tag:hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchMeetingsRequest 请求对象
     * @return SearchMeetingsResponse
     */
    public SearchMeetingsResponse searchMeetings(SearchMeetingsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchMeetings);
    }

    /**
     * 查询会议列表
     *
     * 该接口用于查询尚未结束的会议。
     * * 管理员可以查询管理权限域内所有的会议，普通用户仅能查询自己创建或者需要参加的会议。不带查询参数时，默认查询权限范围内正在召开或还未召开的会议。
     * * 只能查询尚未结束的会议（既正在召开的会议和已预约还未召开的会议）。如果需要查询历史会议列表，请参考[[查询历史会议列表](https://support.huaweicloud.com/api-meeting/meeting_21_0051.html)](tag:hws)[[查询历史会议列表](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_0051.html)](tag:hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchMeetingsRequest 请求对象
     * @return SyncInvoker<SearchMeetingsRequest, SearchMeetingsResponse>
     */
    public SyncInvoker<SearchMeetingsRequest, SearchMeetingsResponse> searchMeetingsInvoker(
        SearchMeetingsRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.searchMeetings, hcClient);
    }

    /**
     * 普通用户分页查询云会议室及个人会议ID
     *
     * 企业用户通过该接口查询个人已分配的云会议室及个人会议ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchMemberVmrRequest 请求对象
     * @return SearchMemberVmrResponse
     */
    public SearchMemberVmrResponse searchMemberVmr(SearchMemberVmrRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchMemberVmr);
    }

    /**
     * 普通用户分页查询云会议室及个人会议ID
     *
     * 企业用户通过该接口查询个人已分配的云会议室及个人会议ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchMemberVmrRequest 请求对象
     * @return SyncInvoker<SearchMemberVmrRequest, SearchMemberVmrResponse>
     */
    public SyncInvoker<SearchMemberVmrRequest, SearchMemberVmrResponse> searchMemberVmrInvoker(
        SearchMemberVmrRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.searchMemberVmr, hcClient);
    }

    /**
     * 查询在线会议列表
     *
     * 该接口用于查询正在召开的会议列表。管理员可以查询本企业内所有在线会议，普通用户仅能查询当前自己帐号创建或者需要参加的在线会议。不带查询参数时，默认查询权限范围内的在线会议，按开始时间升序排列。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchOnlineMeetingsRequest 请求对象
     * @return SearchOnlineMeetingsResponse
     */
    public SearchOnlineMeetingsResponse searchOnlineMeetings(SearchOnlineMeetingsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchOnlineMeetings);
    }

    /**
     * 查询在线会议列表
     *
     * 该接口用于查询正在召开的会议列表。管理员可以查询本企业内所有在线会议，普通用户仅能查询当前自己帐号创建或者需要参加的在线会议。不带查询参数时，默认查询权限范围内的在线会议，按开始时间升序排列。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchOnlineMeetingsRequest 请求对象
     * @return SyncInvoker<SearchOnlineMeetingsRequest, SearchOnlineMeetingsResponse>
     */
    public SyncInvoker<SearchOnlineMeetingsRequest, SearchOnlineMeetingsResponse> searchOnlineMeetingsInvoker(
        SearchOnlineMeetingsRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.searchOnlineMeetings, hcClient);
    }

    /**
     * 查询信息窗节目
     *
     * 获取信息窗节目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchProgramsRequest 请求对象
     * @return SearchProgramsResponse
     */
    public SearchProgramsResponse searchPrograms(SearchProgramsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchPrograms);
    }

    /**
     * 查询信息窗节目
     *
     * 获取信息窗节目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchProgramsRequest 请求对象
     * @return SyncInvoker<SearchProgramsRequest, SearchProgramsResponse>
     */
    public SyncInvoker<SearchProgramsRequest, SearchProgramsResponse> searchProgramsInvoker(
        SearchProgramsRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.searchPrograms, hcClient);
    }

    /**
     * 查询信息窗发布
     *
     * 获取信息窗发布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchPublicationsRequest 请求对象
     * @return SearchPublicationsResponse
     */
    public SearchPublicationsResponse searchPublications(SearchPublicationsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchPublications);
    }

    /**
     * 查询信息窗发布
     *
     * 获取信息窗发布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchPublicationsRequest 请求对象
     * @return SyncInvoker<SearchPublicationsRequest, SearchPublicationsResponse>
     */
    public SyncInvoker<SearchPublicationsRequest, SearchPublicationsResponse> searchPublicationsInvoker(
        SearchPublicationsRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.searchPublications, hcClient);
    }

    /**
     * 查询录制列表
     *
     * 该接口用于查询会议录制列表。管理员可以查询本企业内所有的录制，普通用户仅能查询自己创建的会议的录制。不带查询参数时，默认查询权限范围内的录制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchRecordingsRequest 请求对象
     * @return SearchRecordingsResponse
     */
    public SearchRecordingsResponse searchRecordings(SearchRecordingsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchRecordings);
    }

    /**
     * 查询录制列表
     *
     * 该接口用于查询会议录制列表。管理员可以查询本企业内所有的录制，普通用户仅能查询自己创建的会议的录制。不带查询参数时，默认查询权限范围内的录制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchRecordingsRequest 请求对象
     * @return SyncInvoker<SearchRecordingsRequest, SearchRecordingsResponse>
     */
    public SyncInvoker<SearchRecordingsRequest, SearchRecordingsResponse> searchRecordingsInvoker(
        SearchRecordingsRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.searchRecordings, hcClient);
    }

    /**
     * SP管理员根据分页查询企业资源
     *
     * SP根据条件查询企业的资源项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchResourceRequest 请求对象
     * @return SearchResourceResponse
     */
    public SearchResourceResponse searchResource(SearchResourceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchResource);
    }

    /**
     * SP管理员根据分页查询企业资源
     *
     * SP根据条件查询企业的资源项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchResourceRequest 请求对象
     * @return SyncInvoker<SearchResourceRequest, SearchResourceResponse>
     */
    public SyncInvoker<SearchResourceRequest, SearchResourceResponse> searchResourceInvoker(
        SearchResourceRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.searchResource, hcClient);
    }

    /**
     * SP管理员分页查询企业资源操作记录
     *
     * SP根据根据条件查询企业的资源操作记录，支持根据resourceId模糊搜索。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchResourceOpRecordRequest 请求对象
     * @return SearchResourceOpRecordResponse
     */
    public SearchResourceOpRecordResponse searchResourceOpRecord(SearchResourceOpRecordRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchResourceOpRecord);
    }

    /**
     * SP管理员分页查询企业资源操作记录
     *
     * SP根据根据条件查询企业的资源操作记录，支持根据resourceId模糊搜索。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchResourceOpRecordRequest 请求对象
     * @return SyncInvoker<SearchResourceOpRecordRequest, SearchResourceOpRecordResponse>
     */
    public SyncInvoker<SearchResourceOpRecordRequest, SearchResourceOpRecordResponse> searchResourceOpRecordInvoker(
        SearchResourceOpRecordRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.searchResourceOpRecord, hcClient);
    }

    /**
     * 分页查询用户
     *
     * 企业管理员通过该接口分页查询企业用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchUsersRequest 请求对象
     * @return SearchUsersResponse
     */
    public SearchUsersResponse searchUsers(SearchUsersRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchUsers);
    }

    /**
     * 分页查询用户
     *
     * 企业管理员通过该接口分页查询企业用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchUsersRequest 请求对象
     * @return SyncInvoker<SearchUsersRequest, SearchUsersResponse>
     */
    public SyncInvoker<SearchUsersRequest, SearchUsersResponse> searchUsersInvoker(SearchUsersRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.searchUsers, hcClient);
    }

    /**
     * 企业管理员分页查询激活码
     *
     * 企业管理员分页查询激活码，支持激活码、终端名称模糊查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchVisionActiveCodeRequest 请求对象
     * @return SearchVisionActiveCodeResponse
     */
    public SearchVisionActiveCodeResponse searchVisionActiveCode(SearchVisionActiveCodeRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchVisionActiveCode);
    }

    /**
     * 企业管理员分页查询激活码
     *
     * 企业管理员分页查询激活码，支持激活码、终端名称模糊查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchVisionActiveCodeRequest 请求对象
     * @return SyncInvoker<SearchVisionActiveCodeRequest, SearchVisionActiveCodeResponse>
     */
    public SyncInvoker<SearchVisionActiveCodeRequest, SearchVisionActiveCodeResponse> searchVisionActiveCodeInvoker(
        SearchVisionActiveCodeRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.searchVisionActiveCode, hcClient);
    }

    /**
     * 发送滑块验证码
     *
     * 该接口提供发送滑块验证码。服务器收到请求，返回抠图以及抠图后的原图等结果。需要在前台界面显示出抠图以及抠图后的原图，用户通过滑块操作来匹配图形。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendSlideVerifyCodeRequest 请求对象
     * @return SendSlideVerifyCodeResponse
     */
    public SendSlideVerifyCodeResponse sendSlideVerifyCode(SendSlideVerifyCodeRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.sendSlideVerifyCode);
    }

    /**
     * 发送滑块验证码
     *
     * 该接口提供发送滑块验证码。服务器收到请求，返回抠图以及抠图后的原图等结果。需要在前台界面显示出抠图以及抠图后的原图，用户通过滑块操作来匹配图形。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendSlideVerifyCodeRequest 请求对象
     * @return SyncInvoker<SendSlideVerifyCodeRequest, SendSlideVerifyCodeResponse>
     */
    public SyncInvoker<SendSlideVerifyCodeRequest, SendSlideVerifyCodeResponse> sendSlideVerifyCodeInvoker(
        SendSlideVerifyCodeRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.sendSlideVerifyCode, hcClient);
    }

    /**
     * 发送验证码
     *
     * 该接口提供发送验证码，服务器收到请求，发送验证码到邮箱或者短信并返回结果。用户在前台界面通过滑块验证后，再进行发送验证码操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendVeriCodeForChangePwdRequest 请求对象
     * @return SendVeriCodeForChangePwdResponse
     */
    public SendVeriCodeForChangePwdResponse sendVeriCodeForChangePwd(SendVeriCodeForChangePwdRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.sendVeriCodeForChangePwd);
    }

    /**
     * 发送验证码
     *
     * 该接口提供发送验证码，服务器收到请求，发送验证码到邮箱或者短信并返回结果。用户在前台界面通过滑块验证后，再进行发送验证码操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendVeriCodeForChangePwdRequest 请求对象
     * @return SyncInvoker<SendVeriCodeForChangePwdRequest, SendVeriCodeForChangePwdResponse>
     */
    public SyncInvoker<SendVeriCodeForChangePwdRequest, SendVeriCodeForChangePwdResponse> sendVeriCodeForChangePwdInvoker(
        SendVeriCodeForChangePwdRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.sendVeriCodeForChangePwd, hcClient);
    }

    /**
     * 获取验证码
     *
     * 修改用户手机或邮箱时，需要获取验证码。企业用户通过该接口获取验证码，系统会向用户的手机或邮箱发送，验证码1分钟内有效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendVeriCodeForUpdateUserInfoRequest 请求对象
     * @return SendVeriCodeForUpdateUserInfoResponse
     */
    public SendVeriCodeForUpdateUserInfoResponse sendVeriCodeForUpdateUserInfo(
        SendVeriCodeForUpdateUserInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.sendVeriCodeForUpdateUserInfo);
    }

    /**
     * 获取验证码
     *
     * 修改用户手机或邮箱时，需要获取验证码。企业用户通过该接口获取验证码，系统会向用户的手机或邮箱发送，验证码1分钟内有效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendVeriCodeForUpdateUserInfoRequest 请求对象
     * @return SyncInvoker<SendVeriCodeForUpdateUserInfoRequest, SendVeriCodeForUpdateUserInfoResponse>
     */
    public SyncInvoker<SendVeriCodeForUpdateUserInfoRequest, SendVeriCodeForUpdateUserInfoResponse> sendVeriCodeForUpdateUserInfoInvoker(
        SendVeriCodeForUpdateUserInfoRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.sendVeriCodeForUpdateUserInfo, hcClient);
    }

    /**
     * 设置普通与会人的语言频道
     *
     * 主持人通过该接口设置某些普通与会者(包括主持人)加入哪个语言频道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAttendeeLanChannelRequest 请求对象
     * @return SetAttendeeLanChannelResponse
     */
    public SetAttendeeLanChannelResponse setAttendeeLanChannel(SetAttendeeLanChannelRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.setAttendeeLanChannel);
    }

    /**
     * 设置普通与会人的语言频道
     *
     * 主持人通过该接口设置某些普通与会者(包括主持人)加入哪个语言频道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAttendeeLanChannelRequest 请求对象
     * @return SyncInvoker<SetAttendeeLanChannelRequest, SetAttendeeLanChannelResponse>
     */
    public SyncInvoker<SetAttendeeLanChannelRequest, SetAttendeeLanChannelResponse> setAttendeeLanChannelInvoker(
        SetAttendeeLanChannelRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.setAttendeeLanChannel, hcClient);
    }

    /**
     * 申请联席主持人
     *
     * 该接口用于设置联席主持人或释放联席主持人。只能将来宾设置为联席主持人。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetCohostRequest 请求对象
     * @return SetCohostResponse
     */
    public SetCohostResponse setCohost(SetCohostRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.setCohost);
    }

    /**
     * 申请联席主持人
     *
     * 该接口用于设置联席主持人或释放联席主持人。只能将来宾设置为联席主持人。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetCohostRequest 请求对象
     * @return SyncInvoker<SetCohostRequest, SetCohostResponse>
     */
    public SyncInvoker<SetCohostRequest, SetCohostResponse> setCohostInvoker(SetCohostRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.setCohost, hcClient);
    }

    /**
     * 设置自定义多画面
     *
     * 该接口用于设置会中多画面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetCustomMultiPictureRequest 请求对象
     * @return SetCustomMultiPictureResponse
     */
    public SetCustomMultiPictureResponse setCustomMultiPicture(SetCustomMultiPictureRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.setCustomMultiPicture);
    }

    /**
     * 设置自定义多画面
     *
     * 该接口用于设置会中多画面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetCustomMultiPictureRequest 请求对象
     * @return SyncInvoker<SetCustomMultiPictureRequest, SetCustomMultiPictureResponse>
     */
    public SyncInvoker<SetCustomMultiPictureRequest, SetCustomMultiPictureResponse> setCustomMultiPictureInvoker(
        SetCustomMultiPictureRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.setCustomMultiPicture, hcClient);
    }

    /**
     * 主持人选看
     *
     * 该接口用于主持人轮询、主持人选看多画面、主持人选看会场操作。只适用于专业会议终端（如TE系列等）为主持人的场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetHostViewRequest 请求对象
     * @return SetHostViewResponse
     */
    public SetHostViewResponse setHostView(SetHostViewRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.setHostView);
    }

    /**
     * 主持人选看
     *
     * 该接口用于主持人轮询、主持人选看多画面、主持人选看会场操作。只适用于专业会议终端（如TE系列等）为主持人的场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetHostViewRequest 请求对象
     * @return SyncInvoker<SetHostViewRequest, SetHostViewResponse>
     */
    public SyncInvoker<SetHostViewRequest, SetHostViewResponse> setHostViewInvoker(SetHostViewRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.setHostView, hcClient);
    }

    /**
     * 设置传译组
     *
     * 主持人通过该接口设置传译组，每个传译组支持两种语言，传译组内支持多个传译员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetInterpreterGroupRequest 请求对象
     * @return SetInterpreterGroupResponse
     */
    public SetInterpreterGroupResponse setInterpreterGroup(SetInterpreterGroupRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.setInterpreterGroup);
    }

    /**
     * 设置传译组
     *
     * 主持人通过该接口设置传译组，每个传译组支持两种语言，传译组内支持多个传译员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetInterpreterGroupRequest 请求对象
     * @return SyncInvoker<SetInterpreterGroupRequest, SetInterpreterGroupResponse>
     */
    public SyncInvoker<SetInterpreterGroupRequest, SetInterpreterGroupResponse> setInterpreterGroupInvoker(
        SetInterpreterGroupRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.setInterpreterGroup, hcClient);
    }

    /**
     * 设置多画面
     *
     * 设置会议多画面。该接口废弃不用，请使用“[[设置自定义多画面](https://support.huaweicloud.com/api-meeting/meeting_21_0418.html)](tag:hws)[[设置自定义多画面](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_0418.html)](tag:hk)”接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetMultiPictureRequest 请求对象
     * @return SetMultiPictureResponse
     */
    public SetMultiPictureResponse setMultiPicture(SetMultiPictureRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.setMultiPicture);
    }

    /**
     * 设置多画面
     *
     * 设置会议多画面。该接口废弃不用，请使用“[[设置自定义多画面](https://support.huaweicloud.com/api-meeting/meeting_21_0418.html)](tag:hws)[[设置自定义多画面](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_0418.html)](tag:hk)”接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetMultiPictureRequest 请求对象
     * @return SyncInvoker<SetMultiPictureRequest, SetMultiPictureResponse>
     */
    public SyncInvoker<SetMultiPictureRequest, SetMultiPictureResponse> setMultiPictureInvoker(
        SetMultiPictureRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.setMultiPicture, hcClient);
    }

    /**
     * 会场选看
     *
     * 该接口用于专业会议终端（如TE系列等）选看其他与会者。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetParticipantViewRequest 请求对象
     * @return SetParticipantViewResponse
     */
    public SetParticipantViewResponse setParticipantView(SetParticipantViewRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.setParticipantView);
    }

    /**
     * 会场选看
     *
     * 该接口用于专业会议终端（如TE系列等）选看其他与会者。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetParticipantViewRequest 请求对象
     * @return SyncInvoker<SetParticipantViewRequest, SetParticipantViewResponse>
     */
    public SyncInvoker<SetParticipantViewRequest, SetParticipantViewResponse> setParticipantViewInvoker(
        SetParticipantViewRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.setParticipantView, hcClient);
    }

    /**
     * 用户设置头像
     *
     * 用户设置头像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetProfileImageRequest 请求对象
     * @return SetProfileImageResponse
     */
    public SetProfileImageResponse setProfileImage(SetProfileImageRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.setProfileImage);
    }

    /**
     * 用户设置头像
     *
     * 用户设置头像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetProfileImageRequest 请求对象
     * @return SyncInvoker<SetProfileImageRequest, SetProfileImageResponse>
     */
    public SyncInvoker<SetProfileImageRequest, SetProfileImageResponse> setProfileImageInvoker(
        SetProfileImageRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.setProfileImage, hcClient);
    }

    /**
     * 申请主持人
     *
     * 该接口用于设置主持人或释放主持人。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRoleRequest 请求对象
     * @return SetRoleResponse
     */
    public SetRoleResponse setRole(SetRoleRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.setRole);
    }

    /**
     * 申请主持人
     *
     * 该接口用于设置主持人或释放主持人。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRoleRequest 请求对象
     * @return SyncInvoker<SetRoleRequest, SetRoleResponse>
     */
    public SyncInvoker<SetRoleRequest, SetRoleResponse> setRoleInvoker(SetRoleRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.setRole, hcClient);
    }

    /**
     * 设置SSO登录配置
     *
     * 该接口用于设置SSO登录的鉴权配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetSsoConfigRequest 请求对象
     * @return SetSsoConfigResponse
     */
    public SetSsoConfigResponse setSsoConfig(SetSsoConfigRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.setSsoConfig);
    }

    /**
     * 设置SSO登录配置
     *
     * 该接口用于设置SSO登录的鉴权配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetSsoConfigRequest 请求对象
     * @return SyncInvoker<SetSsoConfigRequest, SetSsoConfigResponse>
     */
    public SyncInvoker<SetSsoConfigRequest, SetSsoConfigResponse> setSsoConfigInvoker(SetSsoConfigRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.setSsoConfig, hcClient);
    }

    /**
     * 企业管理员设置企业成员头像
     *
     * 为企业内的用户设置头像（只允许管理员调用）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetUserProfileImageRequest 请求对象
     * @return SetUserProfileImageResponse
     */
    public SetUserProfileImageResponse setUserProfileImage(SetUserProfileImageRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.setUserProfileImage);
    }

    /**
     * 企业管理员设置企业成员头像
     *
     * 为企业内的用户设置头像（只允许管理员调用）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetUserProfileImageRequest 请求对象
     * @return SyncInvoker<SetUserProfileImageRequest, SetUserProfileImageResponse>
     */
    public SyncInvoker<SetUserProfileImageRequest, SetUserProfileImageResponse> setUserProfileImageInvoker(
        SetUserProfileImageRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.setUserProfileImage, hcClient);
    }

    /**
     * 设置事件推送
     *
     * 该接口用于管理员设置企业级会议事件订阅配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetWebHookConfigRequest 请求对象
     * @return SetWebHookConfigResponse
     */
    public SetWebHookConfigResponse setWebHookConfig(SetWebHookConfigRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.setWebHookConfig);
    }

    /**
     * 设置事件推送
     *
     * 该接口用于管理员设置企业级会议事件订阅配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetWebHookConfigRequest 请求对象
     * @return SyncInvoker<SetWebHookConfigRequest, SetWebHookConfigResponse>
     */
    public SyncInvoker<SetWebHookConfigRequest, SetWebHookConfigResponse> setWebHookConfigInvoker(
        SetWebHookConfigRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.setWebHookConfig, hcClient);
    }

    /**
     * SP管理员查询会议归属企业
     *
     * SP管理员根据会议ID查询该会议归属的企业ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfOrgRequest 请求对象
     * @return ShowConfOrgResponse
     */
    public ShowConfOrgResponse showConfOrg(ShowConfOrgRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showConfOrg);
    }

    /**
     * SP管理员查询会议归属企业
     *
     * SP管理员根据会议ID查询该会议归属的企业ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfOrgRequest 请求对象
     * @return SyncInvoker<ShowConfOrgRequest, ShowConfOrgResponse>
     */
    public SyncInvoker<ShowConfOrgRequest, ShowConfOrgResponse> showConfOrgInvoker(ShowConfOrgRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.showConfOrg, hcClient);
    }

    /**
     * SP管理员查询企业
     *
     * 获取企业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCorpRequest 请求对象
     * @return ShowCorpResponse
     */
    public ShowCorpResponse showCorp(ShowCorpRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showCorp);
    }

    /**
     * SP管理员查询企业
     *
     * 获取企业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCorpRequest 请求对象
     * @return SyncInvoker<ShowCorpRequest, ShowCorpResponse>
     */
    public SyncInvoker<ShowCorpRequest, ShowCorpResponse> showCorpInvoker(ShowCorpRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.showCorp, hcClient);
    }

    /**
     * 查询企业管理员
     *
     * 通过该接口查询企业管理员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCorpAdminRequest 请求对象
     * @return ShowCorpAdminResponse
     */
    public ShowCorpAdminResponse showCorpAdmin(ShowCorpAdminRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showCorpAdmin);
    }

    /**
     * 查询企业管理员
     *
     * 通过该接口查询企业管理员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCorpAdminRequest 请求对象
     * @return SyncInvoker<ShowCorpAdminRequest, ShowCorpAdminResponse>
     */
    public SyncInvoker<ShowCorpAdminRequest, ShowCorpAdminResponse> showCorpAdminInvoker(ShowCorpAdminRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.showCorpAdmin, hcClient);
    }

    /**
     * 企业管理员查询企业注册信息
     *
     * 企业管理员通过该接口查询企业注册信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCorpBasicInfoRequest 请求对象
     * @return ShowCorpBasicInfoResponse
     */
    public ShowCorpBasicInfoResponse showCorpBasicInfo(ShowCorpBasicInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showCorpBasicInfo);
    }

    /**
     * 企业管理员查询企业注册信息
     *
     * 企业管理员通过该接口查询企业注册信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCorpBasicInfoRequest 请求对象
     * @return SyncInvoker<ShowCorpBasicInfoRequest, ShowCorpBasicInfoResponse>
     */
    public SyncInvoker<ShowCorpBasicInfoRequest, ShowCorpBasicInfoResponse> showCorpBasicInfoInvoker(
        ShowCorpBasicInfoRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.showCorpBasicInfo, hcClient);
    }

    /**
     * 企业管理员查询企业内资源及业务权限
     *
     * 企业管理员通过该接口查询企业内资源及业务权限，包括查询已使用的资源情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCorpResourceRequest 请求对象
     * @return ShowCorpResourceResponse
     */
    public ShowCorpResourceResponse showCorpResource(ShowCorpResourceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showCorpResource);
    }

    /**
     * 企业管理员查询企业内资源及业务权限
     *
     * 企业管理员通过该接口查询企业内资源及业务权限，包括查询已使用的资源情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCorpResourceRequest 请求对象
     * @return SyncInvoker<ShowCorpResourceRequest, ShowCorpResourceResponse>
     */
    public SyncInvoker<ShowCorpResourceRequest, ShowCorpResourceResponse> showCorpResourceInvoker(
        ShowCorpResourceRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.showCorpResource, hcClient);
    }

    /**
     * 通过部门编码查询部门信息
     *
     * 通过部门编码查询部门信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDepartmentRequest 请求对象
     * @return ShowDepartmentResponse
     */
    public ShowDepartmentResponse showDepartment(ShowDepartmentRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showDepartment);
    }

    /**
     * 通过部门编码查询部门信息
     *
     * 通过部门编码查询部门信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDepartmentRequest 请求对象
     * @return SyncInvoker<ShowDepartmentRequest, ShowDepartmentResponse>
     */
    public SyncInvoker<ShowDepartmentRequest, ShowDepartmentResponse> showDepartmentInvoker(
        ShowDepartmentRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.showDepartment, hcClient);
    }

    /**
     * 查询部门及其一级子部门列表
     *
     * 企业管理员通过该接口查询部门及其一级子部门列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeptAndChildDeptRequest 请求对象
     * @return ShowDeptAndChildDeptResponse
     */
    public ShowDeptAndChildDeptResponse showDeptAndChildDept(ShowDeptAndChildDeptRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showDeptAndChildDept);
    }

    /**
     * 查询部门及其一级子部门列表
     *
     * 企业管理员通过该接口查询部门及其一级子部门列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeptAndChildDeptRequest 请求对象
     * @return SyncInvoker<ShowDeptAndChildDeptRequest, ShowDeptAndChildDeptResponse>
     */
    public SyncInvoker<ShowDeptAndChildDeptRequest, ShowDeptAndChildDeptResponse> showDeptAndChildDeptInvoker(
        ShowDeptAndChildDeptRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.showDeptAndChildDept, hcClient);
    }

    /**
     * 查询终端详情
     *
     * 企业管理员通过该接口查询专业会议终端详情。
     * &gt; 如果需要查询Ideahub、SmartRooms、智慧屏TV详情请使用[[查询用户详情](https://support.huaweicloud.com/api-meeting/meeting_21_0069.html)](tag:hws)[[查询用户详情](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_0069.html)](tag:hk)接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeviceDetailRequest 请求对象
     * @return ShowDeviceDetailResponse
     */
    public ShowDeviceDetailResponse showDeviceDetail(ShowDeviceDetailRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showDeviceDetail);
    }

    /**
     * 查询终端详情
     *
     * 企业管理员通过该接口查询专业会议终端详情。
     * &gt; 如果需要查询Ideahub、SmartRooms、智慧屏TV详情请使用[[查询用户详情](https://support.huaweicloud.com/api-meeting/meeting_21_0069.html)](tag:hws)[[查询用户详情](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_0069.html)](tag:hk)接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeviceDetailRequest 请求对象
     * @return SyncInvoker<ShowDeviceDetailRequest, ShowDeviceDetailResponse>
     */
    public SyncInvoker<ShowDeviceDetailRequest, ShowDeviceDetailResponse> showDeviceDetailInvoker(
        ShowDeviceDetailRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.showDeviceDetail, hcClient);
    }

    /**
     * 查询设备状态
     *
     * 调用本接口可以查询硬终端的状态。
     * 硬终端与发起查询请求的帐号需在同一企业下，否则会鉴权失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeviceStatusRequest 请求对象
     * @return ShowDeviceStatusResponse
     */
    public ShowDeviceStatusResponse showDeviceStatus(ShowDeviceStatusRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showDeviceStatus);
    }

    /**
     * 查询设备状态
     *
     * 调用本接口可以查询硬终端的状态。
     * 硬终端与发起查询请求的帐号需在同一企业下，否则会鉴权失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeviceStatusRequest 请求对象
     * @return SyncInvoker<ShowDeviceStatusRequest, ShowDeviceStatusResponse>
     */
    public SyncInvoker<ShowDeviceStatusRequest, ShowDeviceStatusResponse> showDeviceStatusInvoker(
        ShowDeviceStatusRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.showDeviceStatus, hcClient);
    }

    /**
     * 获取所有终端类型
     *
     * 企业管理员通过该接口获取所有的专业会议终端类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeviceTypesRequest 请求对象
     * @return ShowDeviceTypesResponse
     */
    public ShowDeviceTypesResponse showDeviceTypes(ShowDeviceTypesRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showDeviceTypes);
    }

    /**
     * 获取所有终端类型
     *
     * 企业管理员通过该接口获取所有的专业会议终端类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeviceTypesRequest 请求对象
     * @return SyncInvoker<ShowDeviceTypesRequest, ShowDeviceTypesResponse>
     */
    public SyncInvoker<ShowDeviceTypesRequest, ShowDeviceTypesResponse> showDeviceTypesInvoker(
        ShowDeviceTypesRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.showDeviceTypes, hcClient);
    }

    /**
     * 查询历史会议详情
     *
     * 该接口用户查询指定历史会议的详情。管理员可以查询本企业内所有的历史会议详情，普通用户仅能查询自己创建或者被邀请的历史会议详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHisMeetingDetailRequest 请求对象
     * @return ShowHisMeetingDetailResponse
     */
    public ShowHisMeetingDetailResponse showHisMeetingDetail(ShowHisMeetingDetailRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showHisMeetingDetail);
    }

    /**
     * 查询历史会议详情
     *
     * 该接口用户查询指定历史会议的详情。管理员可以查询本企业内所有的历史会议详情，普通用户仅能查询自己创建或者被邀请的历史会议详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHisMeetingDetailRequest 请求对象
     * @return SyncInvoker<ShowHisMeetingDetailRequest, ShowHisMeetingDetailResponse>
     */
    public SyncInvoker<ShowHisMeetingDetailRequest, ShowHisMeetingDetailResponse> showHisMeetingDetailInvoker(
        ShowHisMeetingDetailRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.showHisMeetingDetail, hcClient);
    }

    /**
     * 查询多画面布局
     *
     * 该接口用于查询当前会议已保存的多画面布局。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLayoutRequest 请求对象
     * @return ShowLayoutResponse
     */
    public ShowLayoutResponse showLayout(ShowLayoutRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showLayout);
    }

    /**
     * 查询多画面布局
     *
     * 该接口用于查询当前会议已保存的多画面布局。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLayoutRequest 请求对象
     * @return SyncInvoker<ShowLayoutRequest, ShowLayoutResponse>
     */
    public SyncInvoker<ShowLayoutRequest, ShowLayoutResponse> showLayoutInvoker(ShowLayoutRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.showLayout, hcClient);
    }

    /**
     * 查询会议详情
     *
     * 查询偏移量
     * * 管理员可以查询管理权限域内所有会议的详情，普通用户仅能查询自己创建或者需要参加的会议详情。
     * * 只能查询尚未结束的会议（既正在召开的会议和已预约还未召开的会议）。如果需要查询历史会议列详情，请参考[[查询历史会议详情](https://support.huaweicloud.com/api-meeting/meeting_21_0052.html)](tag:hws)[[查询历史会议详情](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_0052.html)](tag:hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMeetingDetailRequest 请求对象
     * @return ShowMeetingDetailResponse
     */
    public ShowMeetingDetailResponse showMeetingDetail(ShowMeetingDetailRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showMeetingDetail);
    }

    /**
     * 查询会议详情
     *
     * 查询偏移量
     * * 管理员可以查询管理权限域内所有会议的详情，普通用户仅能查询自己创建或者需要参加的会议详情。
     * * 只能查询尚未结束的会议（既正在召开的会议和已预约还未召开的会议）。如果需要查询历史会议列详情，请参考[[查询历史会议详情](https://support.huaweicloud.com/api-meeting/meeting_21_0052.html)](tag:hws)[[查询历史会议详情](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_0052.html)](tag:hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMeetingDetailRequest 请求对象
     * @return SyncInvoker<ShowMeetingDetailRequest, ShowMeetingDetailResponse>
     */
    public SyncInvoker<ShowMeetingDetailRequest, ShowMeetingDetailResponse> showMeetingDetailInvoker(
        ShowMeetingDetailRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.showMeetingDetail, hcClient);
    }

    /**
     * 查询会议纪要详情
     *
     * 用户查询单个会议纪要详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMeetingFileRequest 请求对象
     * @return ShowMeetingFileResponse
     */
    public ShowMeetingFileResponse showMeetingFile(ShowMeetingFileRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showMeetingFile);
    }

    /**
     * 查询会议纪要详情
     *
     * 用户查询单个会议纪要详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMeetingFileRequest 请求对象
     * @return SyncInvoker<ShowMeetingFileRequest, ShowMeetingFileResponse>
     */
    public SyncInvoker<ShowMeetingFileRequest, ShowMeetingFileResponse> showMeetingFileInvoker(
        ShowMeetingFileRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.showMeetingFile, hcClient);
    }

    /**
     * 打开会议纪要文件列表
     *
     * 用户使用手机扫码后，手机端请求服务端,让服务端通知指定IdeaHub打开指定用户的会议纪要文件列表。二维码内容 ：cloudlink://cloudlink.huawei.com/h5page?action&#x3D;OPEN_MEETING_FILE_LIST&amp;key1&#x3D;value1&amp;key2&#x3D;value2 。key/value的个数可能变化，终端解析后，在发起后续请求时，将所有key/value存为map，作为入参即可。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMeetingFileListRequest 请求对象
     * @return ShowMeetingFileListResponse
     */
    public ShowMeetingFileListResponse showMeetingFileList(ShowMeetingFileListRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showMeetingFileList);
    }

    /**
     * 打开会议纪要文件列表
     *
     * 用户使用手机扫码后，手机端请求服务端,让服务端通知指定IdeaHub打开指定用户的会议纪要文件列表。二维码内容 ：cloudlink://cloudlink.huawei.com/h5page?action&#x3D;OPEN_MEETING_FILE_LIST&amp;key1&#x3D;value1&amp;key2&#x3D;value2 。key/value的个数可能变化，终端解析后，在发起后续请求时，将所有key/value存为map，作为入参即可。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMeetingFileListRequest 请求对象
     * @return SyncInvoker<ShowMeetingFileListRequest, ShowMeetingFileListResponse>
     */
    public SyncInvoker<ShowMeetingFileListRequest, ShowMeetingFileListResponse> showMeetingFileListInvoker(
        ShowMeetingFileListRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.showMeetingFileList, hcClient);
    }

    /**
     * 用户查询自己的信息
     *
     * 企业用户通过该接口查询自己的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMyInfoRequest 请求对象
     * @return ShowMyInfoResponse
     */
    public ShowMyInfoResponse showMyInfo(ShowMyInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showMyInfo);
    }

    /**
     * 用户查询自己的信息
     *
     * 企业用户通过该接口查询自己的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMyInfoRequest 请求对象
     * @return SyncInvoker<ShowMyInfoRequest, ShowMyInfoResponse>
     */
    public SyncInvoker<ShowMyInfoRequest, ShowMyInfoResponse> showMyInfoInvoker(ShowMyInfoRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.showMyInfo, hcClient);
    }

    /**
     * 查询在线会议详情
     *
     * 该接口用于查询正在召开的会议详情。管理员可以查询本企业内所有的在线会议详情，普通用户仅能查询自己帐号创建或者需要参加的在线会议详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOnlineMeetingDetailRequest 请求对象
     * @return ShowOnlineMeetingDetailResponse
     */
    public ShowOnlineMeetingDetailResponse showOnlineMeetingDetail(ShowOnlineMeetingDetailRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showOnlineMeetingDetail);
    }

    /**
     * 查询在线会议详情
     *
     * 该接口用于查询正在召开的会议详情。管理员可以查询本企业内所有的在线会议详情，普通用户仅能查询自己帐号创建或者需要参加的在线会议详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOnlineMeetingDetailRequest 请求对象
     * @return SyncInvoker<ShowOnlineMeetingDetailRequest, ShowOnlineMeetingDetailResponse>
     */
    public SyncInvoker<ShowOnlineMeetingDetailRequest, ShowOnlineMeetingDetailResponse> showOnlineMeetingDetailInvoker(
        ShowOnlineMeetingDetailRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.showOnlineMeetingDetail, hcClient);
    }

    /**
     * 企业管理员查询企业资源使用信息
     *
     * 企业管理员查询所属企业的资源使用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrgResRequest 请求对象
     * @return ShowOrgResResponse
     */
    public ShowOrgResResponse showOrgRes(ShowOrgResRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showOrgRes);
    }

    /**
     * 企业管理员查询企业资源使用信息
     *
     * 企业管理员查询所属企业的资源使用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrgResRequest 请求对象
     * @return SyncInvoker<ShowOrgResRequest, ShowOrgResResponse>
     */
    public SyncInvoker<ShowOrgResRequest, ShowOrgResResponse> showOrgResInvoker(ShowOrgResRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.showOrgRes, hcClient);
    }

    /**
     * 根据ID查询节目详情
     *
     * 根据ID获取节目详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProgramRequest 请求对象
     * @return ShowProgramResponse
     */
    public ShowProgramResponse showProgram(ShowProgramRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showProgram);
    }

    /**
     * 根据ID查询节目详情
     *
     * 根据ID获取节目详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProgramRequest 请求对象
     * @return SyncInvoker<ShowProgramRequest, ShowProgramResponse>
     */
    public SyncInvoker<ShowProgramRequest, ShowProgramResponse> showProgramInvoker(ShowProgramRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.showProgram, hcClient);
    }

    /**
     * 根据ID查询信息窗发布详情
     *
     * 根据ID获取发布详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublicationRequest 请求对象
     * @return ShowPublicationResponse
     */
    public ShowPublicationResponse showPublication(ShowPublicationRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showPublication);
    }

    /**
     * 根据ID查询信息窗发布详情
     *
     * 根据ID获取发布详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublicationRequest 请求对象
     * @return SyncInvoker<ShowPublicationRequest, ShowPublicationResponse>
     */
    public SyncInvoker<ShowPublicationRequest, ShowPublicationResponse> showPublicationInvoker(
        ShowPublicationRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.showPublication, hcClient);
    }

    /**
     * 查询会议实时信息
     *
     * 该接口用于查询正在召开的会议实时信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRealTimeInfoOfMeetingRequest 请求对象
     * @return ShowRealTimeInfoOfMeetingResponse
     */
    public ShowRealTimeInfoOfMeetingResponse showRealTimeInfoOfMeeting(ShowRealTimeInfoOfMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showRealTimeInfoOfMeeting);
    }

    /**
     * 查询会议实时信息
     *
     * 该接口用于查询正在召开的会议实时信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRealTimeInfoOfMeetingRequest 请求对象
     * @return SyncInvoker<ShowRealTimeInfoOfMeetingRequest, ShowRealTimeInfoOfMeetingResponse>
     */
    public SyncInvoker<ShowRealTimeInfoOfMeetingRequest, ShowRealTimeInfoOfMeetingResponse> showRealTimeInfoOfMeetingInvoker(
        ShowRealTimeInfoOfMeetingRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.showRealTimeInfoOfMeeting, hcClient);
    }

    /**
     * 查询录制详情
     *
     * 改接口用于查询某个会议录制的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordingDetailRequest 请求对象
     * @return ShowRecordingDetailResponse
     */
    public ShowRecordingDetailResponse showRecordingDetail(ShowRecordingDetailRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showRecordingDetail);
    }

    /**
     * 查询录制详情
     *
     * 改接口用于查询某个会议录制的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordingDetailRequest 请求对象
     * @return SyncInvoker<ShowRecordingDetailRequest, ShowRecordingDetailResponse>
     */
    public SyncInvoker<ShowRecordingDetailRequest, ShowRecordingDetailResponse> showRecordingDetailInvoker(
        ShowRecordingDetailRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.showRecordingDetail, hcClient);
    }

    /**
     * 查询录制文件下载链接
     *
     * 该接口用户查询指定会议录制文件下载链接。
     * &gt; * 仅企业管理员权限的帐号才能查询录制文件的下载链接
     * &gt; * 这个接口需要在华为云会议后台开通白名单后才能调用。请联系华为销售人员，并提供华为云会议企业ID
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordingFileDownloadUrlsRequest 请求对象
     * @return ShowRecordingFileDownloadUrlsResponse
     */
    public ShowRecordingFileDownloadUrlsResponse showRecordingFileDownloadUrls(
        ShowRecordingFileDownloadUrlsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showRecordingFileDownloadUrls);
    }

    /**
     * 查询录制文件下载链接
     *
     * 该接口用户查询指定会议录制文件下载链接。
     * &gt; * 仅企业管理员权限的帐号才能查询录制文件的下载链接
     * &gt; * 这个接口需要在华为云会议后台开通白名单后才能调用。请联系华为销售人员，并提供华为云会议企业ID
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordingFileDownloadUrlsRequest 请求对象
     * @return SyncInvoker<ShowRecordingFileDownloadUrlsRequest, ShowRecordingFileDownloadUrlsResponse>
     */
    public SyncInvoker<ShowRecordingFileDownloadUrlsRequest, ShowRecordingFileDownloadUrlsResponse> showRecordingFileDownloadUrlsInvoker(
        ShowRecordingFileDownloadUrlsRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.showRecordingFileDownloadUrls, hcClient);
    }

    /**
     * 查询会议所在区域信息
     *
     * 该接口用于查询会议所在区域的IP和域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRegionInfoOfMeetingRequest 请求对象
     * @return ShowRegionInfoOfMeetingResponse
     */
    public ShowRegionInfoOfMeetingResponse showRegionInfoOfMeeting(ShowRegionInfoOfMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showRegionInfoOfMeeting);
    }

    /**
     * 查询会议所在区域信息
     *
     * 该接口用于查询会议所在区域的IP和域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRegionInfoOfMeetingRequest 请求对象
     * @return SyncInvoker<ShowRegionInfoOfMeetingRequest, ShowRegionInfoOfMeetingResponse>
     */
    public SyncInvoker<ShowRegionInfoOfMeetingRequest, ShowRegionInfoOfMeetingResponse> showRegionInfoOfMeetingInvoker(
        ShowRegionInfoOfMeetingRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.showRegionInfoOfMeeting, hcClient);
    }

    /**
     * 查询网络研讨会高级设置
     *
     * 该接口用于查询指定网络研讨会的高级设置。管理员可查询企业内的网络研讨会高级设置，非管理员只可查询自己预定的网络研讨会的高级设置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRoomSettingRequest 请求对象
     * @return ShowRoomSettingResponse
     */
    public ShowRoomSettingResponse showRoomSetting(ShowRoomSettingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showRoomSetting);
    }

    /**
     * 查询网络研讨会高级设置
     *
     * 该接口用于查询指定网络研讨会的高级设置。管理员可查询企业内的网络研讨会高级设置，非管理员只可查询自己预定的网络研讨会的高级设置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRoomSettingRequest 请求对象
     * @return SyncInvoker<ShowRoomSettingRequest, ShowRoomSettingResponse>
     */
    public SyncInvoker<ShowRoomSettingRequest, ShowRoomSettingResponse> showRoomSettingInvoker(
        ShowRoomSettingRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.showRoomSetting, hcClient);
    }

    /**
     * SP管理员查询SP下资源使用信息
     *
     * SP管理员查询所属SP的共享资源使用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSpResRequest 请求对象
     * @return ShowSpResResponse
     */
    public ShowSpResResponse showSpRes(ShowSpResRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showSpRes);
    }

    /**
     * SP管理员查询SP下资源使用信息
     *
     * SP管理员查询所属SP的共享资源使用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSpResRequest 请求对象
     * @return SyncInvoker<ShowSpResRequest, ShowSpResResponse>
     */
    public SyncInvoker<ShowSpResRequest, ShowSpResResponse> showSpResInvoker(ShowSpResRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.showSpRes, hcClient);
    }

    /**
     * SP管理员查询资源信息
     *
     * SP管理员查询SP的所有资源，包括已使用的资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSpResourceRequest 请求对象
     * @return ShowSpResourceResponse
     */
    public ShowSpResourceResponse showSpResource(ShowSpResourceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showSpResource);
    }

    /**
     * SP管理员查询资源信息
     *
     * SP管理员查询SP的所有资源，包括已使用的资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSpResourceRequest 请求对象
     * @return SyncInvoker<ShowSpResourceRequest, ShowSpResourceResponse>
     */
    public SyncInvoker<ShowSpResourceRequest, ShowSpResourceResponse> showSpResourceInvoker(
        ShowSpResourceRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.showSpResource, hcClient);
    }

    /**
     * 查询SSO登录配置
     *
     * 该接口用于查询SSO登录的鉴权配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSsoConfigRequest 请求对象
     * @return ShowSsoConfigResponse
     */
    public ShowSsoConfigResponse showSsoConfig(ShowSsoConfigRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showSsoConfig);
    }

    /**
     * 查询SSO登录配置
     *
     * 该接口用于查询SSO登录的鉴权配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSsoConfigRequest 请求对象
     * @return SyncInvoker<ShowSsoConfigRequest, ShowSsoConfigResponse>
     */
    public SyncInvoker<ShowSsoConfigRequest, ShowSsoConfigResponse> showSsoConfigInvoker(ShowSsoConfigRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.showSsoConfig, hcClient);
    }

    /**
     * 查询用户详情
     *
     * 企业管理员通过该接口查询企业用户详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserDetailRequest 请求对象
     * @return ShowUserDetailResponse
     */
    public ShowUserDetailResponse showUserDetail(ShowUserDetailRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showUserDetail);
    }

    /**
     * 查询用户详情
     *
     * 企业管理员通过该接口查询企业用户详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserDetailRequest 请求对象
     * @return SyncInvoker<ShowUserDetailRequest, ShowUserDetailResponse>
     */
    public SyncInvoker<ShowUserDetailRequest, ShowUserDetailResponse> showUserDetailInvoker(
        ShowUserDetailRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.showUserDetail, hcClient);
    }

    /**
     * 查询事件推送
     *
     * 该接口用于管理员查询企业事件订阅配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWebHookConfigRequest 请求对象
     * @return ShowWebHookConfigResponse
     */
    public ShowWebHookConfigResponse showWebHookConfig(ShowWebHookConfigRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showWebHookConfig);
    }

    /**
     * 查询事件推送
     *
     * 该接口用于管理员查询企业事件订阅配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWebHookConfigRequest 请求对象
     * @return SyncInvoker<ShowWebHookConfigRequest, ShowWebHookConfigResponse>
     */
    public SyncInvoker<ShowWebHookConfigRequest, ShowWebHookConfigResponse> showWebHookConfigInvoker(
        ShowWebHookConfigRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.showWebHookConfig, hcClient);
    }

    /**
     * 查询网络研讨会详情
     *
     * 该接口用于查询指定网络研讨会的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWebinarRequest 请求对象
     * @return ShowWebinarResponse
     */
    public ShowWebinarResponse showWebinar(ShowWebinarRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showWebinar);
    }

    /**
     * 查询网络研讨会详情
     *
     * 该接口用于查询指定网络研讨会的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWebinarRequest 请求对象
     * @return SyncInvoker<ShowWebinarRequest, ShowWebinarResponse>
     */
    public SyncInvoker<ShowWebinarRequest, ShowWebinarResponse> showWebinarInvoker(ShowWebinarRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.showWebinar, hcClient);
    }

    /**
     * 激活会议
     *
     * 该接口用于通过会议ID和会议密码激活会议。所有的会控接口都需要在会议激活后才能调用，可以通过该接口先激活会议。
     * &gt; 来宾密码是否可以激活会议取决于会议创建时是否设置了“是否允许来宾启动会议”（allowGuestStartConf&#x3D;true）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartMeetingRequest 请求对象
     * @return StartMeetingResponse
     */
    public StartMeetingResponse startMeeting(StartMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.startMeeting);
    }

    /**
     * 激活会议
     *
     * 该接口用于通过会议ID和会议密码激活会议。所有的会控接口都需要在会议激活后才能调用，可以通过该接口先激活会议。
     * &gt; 来宾密码是否可以激活会议取决于会议创建时是否设置了“是否允许来宾启动会议”（allowGuestStartConf&#x3D;true）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartMeetingRequest 请求对象
     * @return SyncInvoker<StartMeetingRequest, StartMeetingResponse>
     */
    public SyncInvoker<StartMeetingRequest, StartMeetingResponse> startMeetingInvoker(StartMeetingRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.startMeeting, hcClient);
    }

    /**
     * 结束会议
     *
     * 该接口用于结束正在召开的会议。
     * &gt; * 如果管理员在企业的会议设置中关闭“结束会议保留预约记录”开关，会议结束后会议列表中将删除该会议，与会者不能再次加入该会议。否则会议预约时间到之前，与会者可以再次加入该会议
     * &gt; * “结束会议保留预约记录”默认是开的
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopMeetingRequest 请求对象
     * @return StopMeetingResponse
     */
    public StopMeetingResponse stopMeeting(StopMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.stopMeeting);
    }

    /**
     * 结束会议
     *
     * 该接口用于结束正在召开的会议。
     * &gt; * 如果管理员在企业的会议设置中关闭“结束会议保留预约记录”开关，会议结束后会议列表中将删除该会议，与会者不能再次加入该会议。否则会议预约时间到之前，与会者可以再次加入该会议
     * &gt; * “结束会议保留预约记录”默认是开的
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopMeetingRequest 请求对象
     * @return SyncInvoker<StopMeetingRequest, StopMeetingResponse>
     */
    public SyncInvoker<StopMeetingRequest, StopMeetingResponse> stopMeetingInvoker(StopMeetingRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.stopMeeting, hcClient);
    }

    /**
     * 切换视频显示策略
     *
     * 该接口用于切换会中视频画面显示策略，包括广播多画面，广播单画面，声控多画面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchModeRequest 请求对象
     * @return SwitchModeResponse
     */
    public SwitchModeResponse switchMode(SwitchModeRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.switchMode);
    }

    /**
     * 切换视频显示策略
     *
     * 该接口用于切换会中视频画面显示策略，包括广播多画面，广播单画面，声控多画面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchModeRequest 请求对象
     * @return SyncInvoker<SwitchModeRequest, SwitchModeResponse>
     */
    public SyncInvoker<SwitchModeRequest, SwitchModeResponse> switchModeInvoker(SwitchModeRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.switchMode, hcClient);
    }

    /**
     * 修改企业应用
     *
     * 企业默认管理员修改企业应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppIdRequest 请求对象
     * @return UpdateAppIdResponse
     */
    public UpdateAppIdResponse updateAppId(UpdateAppIdRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateAppId);
    }

    /**
     * 修改企业应用
     *
     * 企业默认管理员修改企业应用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAppIdRequest 请求对象
     * @return SyncInvoker<UpdateAppIdRequest, UpdateAppIdResponse>
     */
    public SyncInvoker<UpdateAppIdRequest, UpdateAppIdResponse> updateAppIdInvoker(UpdateAppIdRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.updateAppId, hcClient);
    }

    /**
     * 修改手机或邮箱
     *
     * 企业用户通过该接口修改手机或邮箱，需要先获取验证码，验证多次失败会禁止修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateContactRequest 请求对象
     * @return UpdateContactResponse
     */
    public UpdateContactResponse updateContact(UpdateContactRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateContact);
    }

    /**
     * 修改手机或邮箱
     *
     * 企业用户通过该接口修改手机或邮箱，需要先获取验证码，验证多次失败会禁止修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateContactRequest 请求对象
     * @return SyncInvoker<UpdateContactRequest, UpdateContactResponse>
     */
    public SyncInvoker<UpdateContactRequest, UpdateContactResponse> updateContactInvoker(UpdateContactRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.updateContact, hcClient);
    }

    /**
     * SP管理员修改企业
     *
     * 修改企业，若任一参数为null或者不携带则不修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCorpRequest 请求对象
     * @return UpdateCorpResponse
     */
    public UpdateCorpResponse updateCorp(UpdateCorpRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateCorp);
    }

    /**
     * SP管理员修改企业
     *
     * 修改企业，若任一参数为null或者不携带则不修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCorpRequest 请求对象
     * @return SyncInvoker<UpdateCorpRequest, UpdateCorpResponse>
     */
    public SyncInvoker<UpdateCorpRequest, UpdateCorpResponse> updateCorpInvoker(UpdateCorpRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.updateCorp, hcClient);
    }

    /**
     * 企业管理员修改企业注册信息
     *
     * 企业管理员通过该接口修改企业注册信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCorpBasicInfoRequest 请求对象
     * @return UpdateCorpBasicInfoResponse
     */
    public UpdateCorpBasicInfoResponse updateCorpBasicInfo(UpdateCorpBasicInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateCorpBasicInfo);
    }

    /**
     * 企业管理员修改企业注册信息
     *
     * 企业管理员通过该接口修改企业注册信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCorpBasicInfoRequest 请求对象
     * @return SyncInvoker<UpdateCorpBasicInfoRequest, UpdateCorpBasicInfoResponse>
     */
    public SyncInvoker<UpdateCorpBasicInfoRequest, UpdateCorpBasicInfoResponse> updateCorpBasicInfoInvoker(
        UpdateCorpBasicInfoRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.updateCorpBasicInfo, hcClient);
    }

    /**
     * 修改部门
     *
     * 企业管理员通过该接口修改部门。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDepartmentRequest 请求对象
     * @return UpdateDepartmentResponse
     */
    public UpdateDepartmentResponse updateDepartment(UpdateDepartmentRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateDepartment);
    }

    /**
     * 修改部门
     *
     * 企业管理员通过该接口修改部门。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDepartmentRequest 请求对象
     * @return SyncInvoker<UpdateDepartmentRequest, UpdateDepartmentResponse>
     */
    public SyncInvoker<UpdateDepartmentRequest, UpdateDepartmentResponse> updateDepartmentInvoker(
        UpdateDepartmentRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.updateDepartment, hcClient);
    }

    /**
     * 修改终端
     *
     * 企业管理员通过该接口修改专业会议终端。
     * &gt; 如果需要修改Ideahub、SmartRooms、智慧屏TV请使用[[修改用户](https://support.huaweicloud.com/api-meeting/meeting_21_0068.html)](tag:hws)[[修改用户](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_0068.html)](tag:hk)接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDeviceRequest 请求对象
     * @return UpdateDeviceResponse
     */
    public UpdateDeviceResponse updateDevice(UpdateDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateDevice);
    }

    /**
     * 修改终端
     *
     * 企业管理员通过该接口修改专业会议终端。
     * &gt; 如果需要修改Ideahub、SmartRooms、智慧屏TV请使用[[修改用户](https://support.huaweicloud.com/api-meeting/meeting_21_0068.html)](tag:hws)[[修改用户](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_0068.html)](tag:hk)接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDeviceRequest 请求对象
     * @return SyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse>
     */
    public SyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse> updateDeviceInvoker(UpdateDeviceRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.updateDevice, hcClient);
    }

    /**
     * 更新信息窗素材
     *
     * 更新信息窗素材。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMaterialRequest 请求对象
     * @return UpdateMaterialResponse
     */
    public UpdateMaterialResponse updateMaterial(UpdateMaterialRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateMaterial);
    }

    /**
     * 更新信息窗素材
     *
     * 更新信息窗素材。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMaterialRequest 请求对象
     * @return SyncInvoker<UpdateMaterialRequest, UpdateMaterialResponse>
     */
    public SyncInvoker<UpdateMaterialRequest, UpdateMaterialResponse> updateMaterialInvoker(
        UpdateMaterialRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.updateMaterial, hcClient);
    }

    /**
     * 编辑预约会议
     *
     * 该接口用于修改已预约的会议。会议开始后，不能被修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMeetingRequest 请求对象
     * @return UpdateMeetingResponse
     */
    public UpdateMeetingResponse updateMeeting(UpdateMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateMeeting);
    }

    /**
     * 编辑预约会议
     *
     * 该接口用于修改已预约的会议。会议开始后，不能被修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMeetingRequest 请求对象
     * @return SyncInvoker<UpdateMeetingRequest, UpdateMeetingResponse>
     */
    public SyncInvoker<UpdateMeetingRequest, UpdateMeetingResponse> updateMeetingInvoker(UpdateMeetingRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.updateMeeting, hcClient);
    }

    /**
     * 修改用会议室及个人会议ID信息
     *
     * 企业用户登录后可以修改分配给用户的云会议室及个人会议ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMemberVmrRequest 请求对象
     * @return UpdateMemberVmrResponse
     */
    public UpdateMemberVmrResponse updateMemberVmr(UpdateMemberVmrRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateMemberVmr);
    }

    /**
     * 修改用会议室及个人会议ID信息
     *
     * 企业用户登录后可以修改分配给用户的云会议室及个人会议ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMemberVmrRequest 请求对象
     * @return SyncInvoker<UpdateMemberVmrRequest, UpdateMemberVmrResponse>
     */
    public SyncInvoker<UpdateMemberVmrRequest, UpdateMemberVmrResponse> updateMemberVmrInvoker(
        UpdateMemberVmrRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.updateMemberVmr, hcClient);
    }

    /**
     * 用户修改自己的信息
     *
     * 企业用户通过该接口修改自己的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMyInfoRequest 请求对象
     * @return UpdateMyInfoResponse
     */
    public UpdateMyInfoResponse updateMyInfo(UpdateMyInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateMyInfo);
    }

    /**
     * 用户修改自己的信息
     *
     * 企业用户通过该接口修改自己的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMyInfoRequest 请求对象
     * @return SyncInvoker<UpdateMyInfoRequest, UpdateMyInfoResponse>
     */
    public SyncInvoker<UpdateMyInfoRequest, UpdateMyInfoResponse> updateMyInfoInvoker(UpdateMyInfoRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.updateMyInfo, hcClient);
    }

    /**
     * 更新信息窗节目
     *
     * 更新信息窗节目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProgramRequest 请求对象
     * @return UpdateProgramResponse
     */
    public UpdateProgramResponse updateProgram(UpdateProgramRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateProgram);
    }

    /**
     * 更新信息窗节目
     *
     * 更新信息窗节目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProgramRequest 请求对象
     * @return SyncInvoker<UpdateProgramRequest, UpdateProgramResponse>
     */
    public SyncInvoker<UpdateProgramRequest, UpdateProgramResponse> updateProgramInvoker(UpdateProgramRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.updateProgram, hcClient);
    }

    /**
     * 修改信息窗发布
     *
     * 修改信息窗发布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePublicationRequest 请求对象
     * @return UpdatePublicationResponse
     */
    public UpdatePublicationResponse updatePublication(UpdatePublicationRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updatePublication);
    }

    /**
     * 修改信息窗发布
     *
     * 修改信息窗发布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePublicationRequest 请求对象
     * @return SyncInvoker<UpdatePublicationRequest, UpdatePublicationResponse>
     */
    public SyncInvoker<UpdatePublicationRequest, UpdatePublicationResponse> updatePublicationInvoker(
        UpdatePublicationRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.updatePublication, hcClient);
    }

    /**
     * 修改密码
     *
     * 企业成员通过该接口提供用户修改密码功能，服务器收到请求，修改用户密码并返回结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePwdRequest 请求对象
     * @return UpdatePwdResponse
     */
    public UpdatePwdResponse updatePwd(UpdatePwdRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updatePwd);
    }

    /**
     * 修改密码
     *
     * 企业成员通过该接口提供用户修改密码功能，服务器收到请求，修改用户密码并返回结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePwdRequest 请求对象
     * @return SyncInvoker<UpdatePwdRequest, UpdatePwdResponse>
     */
    public SyncInvoker<UpdatePwdRequest, UpdatePwdResponse> updatePwdInvoker(UpdatePwdRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.updatePwd, hcClient);
    }

    /**
     * 编辑周期性会议
     *
     * 该接口用于修改已预约的周期性会议。会议开始后，不能被修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecurringMeetingRequest 请求对象
     * @return UpdateRecurringMeetingResponse
     */
    public UpdateRecurringMeetingResponse updateRecurringMeeting(UpdateRecurringMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateRecurringMeeting);
    }

    /**
     * 编辑周期性会议
     *
     * 该接口用于修改已预约的周期性会议。会议开始后，不能被修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecurringMeetingRequest 请求对象
     * @return SyncInvoker<UpdateRecurringMeetingRequest, UpdateRecurringMeetingResponse>
     */
    public SyncInvoker<UpdateRecurringMeetingRequest, UpdateRecurringMeetingResponse> updateRecurringMeetingInvoker(
        UpdateRecurringMeetingRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.updateRecurringMeeting, hcClient);
    }

    /**
     * 编辑周期性会议的子会议
     *
     * 该接口用于修改已预约的周期性会议的子会议。会议开始后，不能被修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecurringSubMeetingRequest 请求对象
     * @return UpdateRecurringSubMeetingResponse
     */
    public UpdateRecurringSubMeetingResponse updateRecurringSubMeeting(UpdateRecurringSubMeetingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateRecurringSubMeeting);
    }

    /**
     * 编辑周期性会议的子会议
     *
     * 该接口用于修改已预约的周期性会议的子会议。会议开始后，不能被修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecurringSubMeetingRequest 请求对象
     * @return SyncInvoker<UpdateRecurringSubMeetingRequest, UpdateRecurringSubMeetingResponse>
     */
    public SyncInvoker<UpdateRecurringSubMeetingRequest, UpdateRecurringSubMeetingResponse> updateRecurringSubMeetingInvoker(
        UpdateRecurringSubMeetingRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.updateRecurringSubMeeting, hcClient);
    }

    /**
     * SP管理员根据修改企业资源
     *
     * 企业修改资源的过期时间、停用状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResourceRequest 请求对象
     * @return UpdateResourceResponse
     */
    public UpdateResourceResponse updateResource(UpdateResourceRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateResource);
    }

    /**
     * SP管理员根据修改企业资源
     *
     * 企业修改资源的过期时间、停用状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResourceRequest 请求对象
     * @return SyncInvoker<UpdateResourceRequest, UpdateResourceResponse>
     */
    public SyncInvoker<UpdateResourceRequest, UpdateResourceResponse> updateResourceInvoker(
        UpdateResourceRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.updateResource, hcClient);
    }

    /**
     * 修改网络研讨会高级设置
     *
     * 该接口用于设置指定网络研讨会的高级设置。管理员可设置企业内的网络研讨会高级设置，非管理员只可设置自己预定的网络研讨会的高级设置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRoomSettingRequest 请求对象
     * @return UpdateRoomSettingResponse
     */
    public UpdateRoomSettingResponse updateRoomSetting(UpdateRoomSettingRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateRoomSetting);
    }

    /**
     * 修改网络研讨会高级设置
     *
     * 该接口用于设置指定网络研讨会的高级设置。管理员可设置企业内的网络研讨会高级设置，非管理员只可设置自己预定的网络研讨会的高级设置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRoomSettingRequest 请求对象
     * @return SyncInvoker<UpdateRoomSettingRequest, UpdateRoomSettingResponse>
     */
    public SyncInvoker<UpdateRoomSettingRequest, UpdateRoomSettingResponse> updateRoomSettingInvoker(
        UpdateRoomSettingRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.updateRoomSetting, hcClient);
    }

    /**
     * 会中修改配置
     *
     * 该接口用于修改会议配置，包括会议共享是否锁定，允许呼入范围。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStartedConfConfigRequest 请求对象
     * @return UpdateStartedConfConfigResponse
     */
    public UpdateStartedConfConfigResponse updateStartedConfConfig(UpdateStartedConfConfigRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateStartedConfConfig);
    }

    /**
     * 会中修改配置
     *
     * 该接口用于修改会议配置，包括会议共享是否锁定，允许呼入范围。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStartedConfConfigRequest 请求对象
     * @return SyncInvoker<UpdateStartedConfConfigRequest, UpdateStartedConfConfigResponse>
     */
    public SyncInvoker<UpdateStartedConfConfigRequest, UpdateStartedConfConfigResponse> updateStartedConfConfigInvoker(
        UpdateStartedConfConfigRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.updateStartedConfConfig, hcClient);
    }

    /**
     * 刷新Token
     *
     * 该接口提供刷新Token功能，根据传入的Token，刷新Token失效时间并返回结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTokenRequest 请求对象
     * @return UpdateTokenResponse
     */
    public UpdateTokenResponse updateToken(UpdateTokenRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateToken);
    }

    /**
     * 刷新Token
     *
     * 该接口提供刷新Token功能，根据传入的Token，刷新Token失效时间并返回结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTokenRequest 请求对象
     * @return SyncInvoker<UpdateTokenRequest, UpdateTokenResponse>
     */
    public SyncInvoker<UpdateTokenRequest, UpdateTokenResponse> updateTokenInvoker(UpdateTokenRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.updateToken, hcClient);
    }

    /**
     * 修改用户
     *
     * 企业管理员通过该接口修改企业用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserRequest 请求对象
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUser(UpdateUserRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateUser);
    }

    /**
     * 修改用户
     *
     * 企业管理员通过该接口修改企业用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserRequest 请求对象
     * @return SyncInvoker<UpdateUserRequest, UpdateUserResponse>
     */
    public SyncInvoker<UpdateUserRequest, UpdateUserResponse> updateUserInvoker(UpdateUserRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.updateUser, hcClient);
    }

    /**
     * 开启事件推送
     *
     * 该接口用于管理员变更订阅配置使用状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWebHookConfigStatusRequest 请求对象
     * @return UpdateWebHookConfigStatusResponse
     */
    public UpdateWebHookConfigStatusResponse updateWebHookConfigStatus(UpdateWebHookConfigStatusRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateWebHookConfigStatus);
    }

    /**
     * 开启事件推送
     *
     * 该接口用于管理员变更订阅配置使用状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWebHookConfigStatusRequest 请求对象
     * @return SyncInvoker<UpdateWebHookConfigStatusRequest, UpdateWebHookConfigStatusResponse>
     */
    public SyncInvoker<UpdateWebHookConfigStatusRequest, UpdateWebHookConfigStatusResponse> updateWebHookConfigStatusInvoker(
        UpdateWebHookConfigStatusRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.updateWebHookConfigStatus, hcClient);
    }

    /**
     * 编辑网络研讨会
     *
     * 该接口用于修改已创建的网络研讨会。网络研讨会开始后不能修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWebinarRequest 请求对象
     * @return UpdateWebinarResponse
     */
    public UpdateWebinarResponse updateWebinar(UpdateWebinarRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.updateWebinar);
    }

    /**
     * 编辑网络研讨会
     *
     * 该接口用于修改已创建的网络研讨会。网络研讨会开始后不能修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWebinarRequest 请求对象
     * @return SyncInvoker<UpdateWebinarRequest, UpdateWebinarResponse>
     */
    public SyncInvoker<UpdateWebinarRequest, UpdateWebinarResponse> updateWebinarInvoker(UpdateWebinarRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.updateWebinar, hcClient);
    }

    /**
     * 上传图片
     *
     * 该接口用户上传网络研讨会高级设置用的图片。图片可用于网络研讨会的封面和Logo。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadFileRequest 请求对象
     * @return UploadFileResponse
     */
    public UploadFileResponse uploadFile(UploadFileRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.uploadFile);
    }

    /**
     * 上传图片
     *
     * 该接口用户上传网络研讨会高级设置用的图片。图片可用于网络研讨会的封面和Logo。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadFileRequest 请求对象
     * @return SyncInvoker<UploadFileRequest, UploadFileResponse>
     */
    public SyncInvoker<UploadFileRequest, UploadFileResponse> uploadFileInvoker(UploadFileRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.uploadFile, hcClient);
    }

    /**
     * 获取会议鉴权随机数
     *
     * 根据会议ID + 密码鉴权返回鉴权随机数，如果是小程序调用时，需要企业支持小程序功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuthRandomRequest 请求对象
     * @return CreateAuthRandomResponse
     */
    public CreateAuthRandomResponse createAuthRandom(CreateAuthRandomRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.createAuthRandom);
    }

    /**
     * 获取会议鉴权随机数
     *
     * 根据会议ID + 密码鉴权返回鉴权随机数，如果是小程序调用时，需要企业支持小程序功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuthRandomRequest 请求对象
     * @return SyncInvoker<CreateAuthRandomRequest, CreateAuthRandomResponse>
     */
    public SyncInvoker<CreateAuthRandomRequest, CreateAuthRandomResponse> createAuthRandomInvoker(
        CreateAuthRandomRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.createAuthRandom, hcClient);
    }

    /**
     * 查询QoS历史会议列表
     *
     * 该接口用于查询企业内历史会议的QoS告警。仅旗舰版企业/标准版企业的企业管理员有权限查询。可以查询最近3个月内的数据。
     * &gt; 仪表盘的QoS统计功能需要申请才能开通。请联系华为销售人员，并提供华为云会议企业ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchQosHistoryMeetingsRequest 请求对象
     * @return SearchQosHistoryMeetingsResponse
     */
    public SearchQosHistoryMeetingsResponse searchQosHistoryMeetings(SearchQosHistoryMeetingsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchQosHistoryMeetings);
    }

    /**
     * 查询QoS历史会议列表
     *
     * 该接口用于查询企业内历史会议的QoS告警。仅旗舰版企业/标准版企业的企业管理员有权限查询。可以查询最近3个月内的数据。
     * &gt; 仪表盘的QoS统计功能需要申请才能开通。请联系华为销售人员，并提供华为云会议企业ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchQosHistoryMeetingsRequest 请求对象
     * @return SyncInvoker<SearchQosHistoryMeetingsRequest, SearchQosHistoryMeetingsResponse>
     */
    public SyncInvoker<SearchQosHistoryMeetingsRequest, SearchQosHistoryMeetingsResponse> searchQosHistoryMeetingsInvoker(
        SearchQosHistoryMeetingsRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.searchQosHistoryMeetings, hcClient);
    }

    /**
     * 查询QoS在线会议列表
     *
     * 该接口用于查询企业内正在召开会议的QoS告警。仅旗舰版企业/标准版企业的企业管理员有权限查询。
     * &gt; 仪表盘的QoS统计功能需要申请才能开通。请联系华为销售人员，并提供华为云会议企业ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchQosOnlineMeetingsRequest 请求对象
     * @return SearchQosOnlineMeetingsResponse
     */
    public SearchQosOnlineMeetingsResponse searchQosOnlineMeetings(SearchQosOnlineMeetingsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchQosOnlineMeetings);
    }

    /**
     * 查询QoS在线会议列表
     *
     * 该接口用于查询企业内正在召开会议的QoS告警。仅旗舰版企业/标准版企业的企业管理员有权限查询。
     * &gt; 仪表盘的QoS统计功能需要申请才能开通。请联系华为销售人员，并提供华为云会议企业ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchQosOnlineMeetingsRequest 请求对象
     * @return SyncInvoker<SearchQosOnlineMeetingsRequest, SearchQosOnlineMeetingsResponse>
     */
    public SyncInvoker<SearchQosOnlineMeetingsRequest, SearchQosOnlineMeetingsResponse> searchQosOnlineMeetingsInvoker(
        SearchQosOnlineMeetingsRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.searchQosOnlineMeetings, hcClient);
    }

    /**
     * 查询与会者的QoS数据
     *
     * 该接口用于查询企业内在线会议或历史会议的与会者QoS数据。仅旗舰版企业/标准版企业的企业管理员有权限查询。
     * &gt; 仪表盘的QoS统计功能需要申请才能开通。请联系华为销售人员，并提供华为云会议企业ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchQosParticipantDetailRequest 请求对象
     * @return SearchQosParticipantDetailResponse
     */
    public SearchQosParticipantDetailResponse searchQosParticipantDetail(SearchQosParticipantDetailRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchQosParticipantDetail);
    }

    /**
     * 查询与会者的QoS数据
     *
     * 该接口用于查询企业内在线会议或历史会议的与会者QoS数据。仅旗舰版企业/标准版企业的企业管理员有权限查询。
     * &gt; 仪表盘的QoS统计功能需要申请才能开通。请联系华为销售人员，并提供华为云会议企业ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchQosParticipantDetailRequest 请求对象
     * @return SyncInvoker<SearchQosParticipantDetailRequest, SearchQosParticipantDetailResponse>
     */
    public SyncInvoker<SearchQosParticipantDetailRequest, SearchQosParticipantDetailResponse> searchQosParticipantDetailInvoker(
        SearchQosParticipantDetailRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.searchQosParticipantDetail, hcClient);
    }

    /**
     * 查询QoS会议与会者列表
     *
     * 该接口用于查询企业内在线会议或历史会议的与会者QoS告警。仅旗舰版企业/标准版企业的企业管理员有权限查询。
     * &gt; 仪表盘的QoS统计功能需要申请才能开通。请联系华为销售人员，并提供华为云会议企业ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchQosParticipantsRequest 请求对象
     * @return SearchQosParticipantsResponse
     */
    public SearchQosParticipantsResponse searchQosParticipants(SearchQosParticipantsRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchQosParticipants);
    }

    /**
     * 查询QoS会议与会者列表
     *
     * 该接口用于查询企业内在线会议或历史会议的与会者QoS告警。仅旗舰版企业/标准版企业的企业管理员有权限查询。
     * &gt; 仪表盘的QoS统计功能需要申请才能开通。请联系华为销售人员，并提供华为云会议企业ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchQosParticipantsRequest 请求对象
     * @return SyncInvoker<SearchQosParticipantsRequest, SearchQosParticipantsResponse>
     */
    public SyncInvoker<SearchQosParticipantsRequest, SearchQosParticipantsResponse> searchQosParticipantsInvoker(
        SearchQosParticipantsRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.searchQosParticipants, hcClient);
    }

    /**
     * 设置QoS告警阈值
     *
     * 该接口用于设置QoS告警阈值。仅旗舰版企业/标准版企业的企业管理员有权限设置。
     * &gt; 仪表盘的QoS统计功能需要申请才能开通。请联系华为销售人员，并提供华为云会议企业ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetQosThresholdRequest 请求对象
     * @return SetQosThresholdResponse
     */
    public SetQosThresholdResponse setQosThreshold(SetQosThresholdRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.setQosThreshold);
    }

    /**
     * 设置QoS告警阈值
     *
     * 该接口用于设置QoS告警阈值。仅旗舰版企业/标准版企业的企业管理员有权限设置。
     * &gt; 仪表盘的QoS统计功能需要申请才能开通。请联系华为销售人员，并提供华为云会议企业ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetQosThresholdRequest 请求对象
     * @return SyncInvoker<SetQosThresholdRequest, SetQosThresholdResponse>
     */
    public SyncInvoker<SetQosThresholdRequest, SetQosThresholdResponse> setQosThresholdInvoker(
        SetQosThresholdRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.setQosThreshold, hcClient);
    }

    /**
     * 查询QoS告警阈值
     *
     * 该接口用于查询QoS告警阈值。仅旗舰版企业/标准版企业的企业管理员有权限查询。
     * &gt; 该接口用于查询QoS告警阈值。仅旗舰版企业/标准版企业的企业管理员有权限查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQosThresholdRequest 请求对象
     * @return ShowQosThresholdResponse
     */
    public ShowQosThresholdResponse showQosThreshold(ShowQosThresholdRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.showQosThreshold);
    }

    /**
     * 查询QoS告警阈值
     *
     * 该接口用于查询QoS告警阈值。仅旗舰版企业/标准版企业的企业管理员有权限查询。
     * &gt; 该接口用于查询QoS告警阈值。仅旗舰版企业/标准版企业的企业管理员有权限查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQosThresholdRequest 请求对象
     * @return SyncInvoker<ShowQosThresholdRequest, ShowQosThresholdResponse>
     */
    public SyncInvoker<ShowQosThresholdRequest, ShowQosThresholdResponse> showQosThresholdInvoker(
        ShowQosThresholdRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.showQosThreshold, hcClient);
    }

    /**
     * 查询企业级会议总体统计数据
     *
     * 该接口用于查询企业内：
     * * 单日内按小时统计的会议数据。
     * * 指定日期范围内按日/按月统计的会议数据。
     * &gt; 仅旗舰版企业/标准版企业的企业管理员有权限查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchStatisticConferenceInfoRequest 请求对象
     * @return SearchStatisticConferenceInfoResponse
     */
    public SearchStatisticConferenceInfoResponse searchStatisticConferenceInfo(
        SearchStatisticConferenceInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchStatisticConferenceInfo);
    }

    /**
     * 查询企业级会议总体统计数据
     *
     * 该接口用于查询企业内：
     * * 单日内按小时统计的会议数据。
     * * 指定日期范围内按日/按月统计的会议数据。
     * &gt; 仅旗舰版企业/标准版企业的企业管理员有权限查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchStatisticConferenceInfoRequest 请求对象
     * @return SyncInvoker<SearchStatisticConferenceInfoRequest, SearchStatisticConferenceInfoResponse>
     */
    public SyncInvoker<SearchStatisticConferenceInfoRequest, SearchStatisticConferenceInfoResponse> searchStatisticConferenceInfoInvoker(
        SearchStatisticConferenceInfoRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.searchStatisticConferenceInfo, hcClient);
    }

    /**
     * 查询企业级会议与会统计数据
     *
     * 该接口用于查询企业内与会者数据统计：
     * * 查询与会用户统计数据，按日/按月统计。
     * * 查询与会硬件终端统计数据，按日/按月统计。
     * * 查询与会设备统计数据，按日/按月统计。
     * &gt; 仅旗舰版企业/标准版企业的企业管理员有权限查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchStatisticConferenceParticipantRequest 请求对象
     * @return SearchStatisticConferenceParticipantResponse
     */
    public SearchStatisticConferenceParticipantResponse searchStatisticConferenceParticipant(
        SearchStatisticConferenceParticipantRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchStatisticConferenceParticipant);
    }

    /**
     * 查询企业级会议与会统计数据
     *
     * 该接口用于查询企业内与会者数据统计：
     * * 查询与会用户统计数据，按日/按月统计。
     * * 查询与会硬件终端统计数据，按日/按月统计。
     * * 查询与会设备统计数据，按日/按月统计。
     * &gt; 仅旗舰版企业/标准版企业的企业管理员有权限查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchStatisticConferenceParticipantRequest 请求对象
     * @return SyncInvoker<SearchStatisticConferenceParticipantRequest, SearchStatisticConferenceParticipantResponse>
     */
    public SyncInvoker<SearchStatisticConferenceParticipantRequest, SearchStatisticConferenceParticipantResponse> searchStatisticConferenceParticipantInvoker(
        SearchStatisticConferenceParticipantRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.searchStatisticConferenceParticipant, hcClient);
    }

    /**
     * 查询企业级会议已购资源使用统计数据
     *
     * 该接口用于查询企业内已购资源使用状况数据统计：
     * * 查询已购资源使用状况，按日/按月统计。
     * &gt; 仅旗舰版企业/标准版企业的企业管理员有权限查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchStatisticResourceInfoRequest 请求对象
     * @return SearchStatisticResourceInfoResponse
     */
    public SearchStatisticResourceInfoResponse searchStatisticResourceInfo(SearchStatisticResourceInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchStatisticResourceInfo);
    }

    /**
     * 查询企业级会议已购资源使用统计数据
     *
     * 该接口用于查询企业内已购资源使用状况数据统计：
     * * 查询已购资源使用状况，按日/按月统计。
     * &gt; 仅旗舰版企业/标准版企业的企业管理员有权限查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchStatisticResourceInfoRequest 请求对象
     * @return SyncInvoker<SearchStatisticResourceInfoRequest, SearchStatisticResourceInfoResponse>
     */
    public SyncInvoker<SearchStatisticResourceInfoRequest, SearchStatisticResourceInfoResponse> searchStatisticResourceInfoInvoker(
        SearchStatisticResourceInfoRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.searchStatisticResourceInfo, hcClient);
    }

    /**
     * 查询企业级会议的用户统计数据
     *
     * 该接口用于查询企业内用户数据统计：
     * * 查询会议用户登录数据，按日/按月统计。
     * * 查询会议用户激活数据，按日/按月统计。
     * * 查询会议用户登录设备数据，按日/按月统计。
     * &gt; 仅旗舰版企业/标准版企业的企业管理员有权限查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchStatisticUserInfoRequest 请求对象
     * @return SearchStatisticUserInfoResponse
     */
    public SearchStatisticUserInfoResponse searchStatisticUserInfo(SearchStatisticUserInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MeetingMeta.searchStatisticUserInfo);
    }

    /**
     * 查询企业级会议的用户统计数据
     *
     * 该接口用于查询企业内用户数据统计：
     * * 查询会议用户登录数据，按日/按月统计。
     * * 查询会议用户激活数据，按日/按月统计。
     * * 查询会议用户登录设备数据，按日/按月统计。
     * &gt; 仅旗舰版企业/标准版企业的企业管理员有权限查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchStatisticUserInfoRequest 请求对象
     * @return SyncInvoker<SearchStatisticUserInfoRequest, SearchStatisticUserInfoResponse>
     */
    public SyncInvoker<SearchStatisticUserInfoRequest, SearchStatisticUserInfoResponse> searchStatisticUserInfoInvoker(
        SearchStatisticUserInfoRequest request) {
        return new SyncInvoker<>(request, MeetingMeta.searchStatisticUserInfo, hcClient);
    }

}

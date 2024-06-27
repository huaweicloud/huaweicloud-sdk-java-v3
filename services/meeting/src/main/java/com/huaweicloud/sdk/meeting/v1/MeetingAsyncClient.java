package com.huaweicloud.sdk.meeting.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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

import java.util.concurrent.CompletableFuture;

public class MeetingAsyncClient {

    protected HcClient hcClient;

    public MeetingAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<MeetingAsyncClient> newBuilder() {
        ClientBuilder<MeetingAsyncClient> clientBuilder =
            new ClientBuilder<>(MeetingAsyncClient::new, "MeetingCredentials");
        return clientBuilder;
    }

    /**
     * SP管理员创建企业
     *
     * 创建企业，默认管理员及分配资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddCorpRequest 请求对象
     * @return CompletableFuture<AddCorpResponse>
     */
    public CompletableFuture<AddCorpResponse> addCorpAsync(AddCorpRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.addCorp);
    }

    /**
     * SP管理员创建企业
     *
     * 创建企业，默认管理员及分配资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddCorpRequest 请求对象
     * @return AsyncInvoker<AddCorpRequest, AddCorpResponse>
     */
    public AsyncInvoker<AddCorpRequest, AddCorpResponse> addCorpAsyncInvoker(AddCorpRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.addCorp, hcClient);
    }

    /**
     * 添加企业管理员
     *
     * 企业默认管理员添加企业普通管理员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddCorpAdminRequest 请求对象
     * @return CompletableFuture<AddCorpAdminResponse>
     */
    public CompletableFuture<AddCorpAdminResponse> addCorpAdminAsync(AddCorpAdminRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.addCorpAdmin);
    }

    /**
     * 添加企业管理员
     *
     * 企业默认管理员添加企业普通管理员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddCorpAdminRequest 请求对象
     * @return AsyncInvoker<AddCorpAdminRequest, AddCorpAdminResponse>
     */
    public AsyncInvoker<AddCorpAdminRequest, AddCorpAdminResponse> addCorpAdminAsyncInvoker(
        AddCorpAdminRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.addCorpAdmin, hcClient);
    }

    /**
     * 添加部门
     *
     * 企业管理员通过该接口添加部门，最多支持10级部门，每级子部门最多支持100个，默认企业最大部门数量为10000个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDepartmentRequest 请求对象
     * @return CompletableFuture<AddDepartmentResponse>
     */
    public CompletableFuture<AddDepartmentResponse> addDepartmentAsync(AddDepartmentRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.addDepartment);
    }

    /**
     * 添加部门
     *
     * 企业管理员通过该接口添加部门，最多支持10级部门，每级子部门最多支持100个，默认企业最大部门数量为10000个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDepartmentRequest 请求对象
     * @return AsyncInvoker<AddDepartmentRequest, AddDepartmentResponse>
     */
    public AsyncInvoker<AddDepartmentRequest, AddDepartmentResponse> addDepartmentAsyncInvoker(
        AddDepartmentRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.addDepartment, hcClient);
    }

    /**
     * 增加终端
     *
     * 企业管理员通过该接口添加专业会议终端。专业会议终端包括DP300/HUAWEI Bar系列/HUAWEI Board/TE系列。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDeviceRequest 请求对象
     * @return CompletableFuture<AddDeviceResponse>
     */
    public CompletableFuture<AddDeviceResponse> addDeviceAsync(AddDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.addDevice);
    }

    /**
     * 增加终端
     *
     * 企业管理员通过该接口添加专业会议终端。专业会议终端包括DP300/HUAWEI Bar系列/HUAWEI Board/TE系列。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDeviceRequest 请求对象
     * @return AsyncInvoker<AddDeviceRequest, AddDeviceResponse>
     */
    public AsyncInvoker<AddDeviceRequest, AddDeviceResponse> addDeviceAsyncInvoker(AddDeviceRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.addDevice, hcClient);
    }

    /**
     * 新增信息窗素材
     *
     * 新增信息窗素材（上传素材文件）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddMaterialRequest 请求对象
     * @return CompletableFuture<AddMaterialResponse>
     */
    public CompletableFuture<AddMaterialResponse> addMaterialAsync(AddMaterialRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.addMaterial);
    }

    /**
     * 新增信息窗素材
     *
     * 新增信息窗素材（上传素材文件）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddMaterialRequest 请求对象
     * @return AsyncInvoker<AddMaterialRequest, AddMaterialResponse>
     */
    public AsyncInvoker<AddMaterialRequest, AddMaterialResponse> addMaterialAsyncInvoker(AddMaterialRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.addMaterial, hcClient);
    }

    /**
     * 新增信息窗节目
     *
     * 新增信息窗节目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddProgramRequest 请求对象
     * @return CompletableFuture<AddProgramResponse>
     */
    public CompletableFuture<AddProgramResponse> addProgramAsync(AddProgramRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.addProgram);
    }

    /**
     * 新增信息窗节目
     *
     * 新增信息窗节目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddProgramRequest 请求对象
     * @return AsyncInvoker<AddProgramRequest, AddProgramResponse>
     */
    public AsyncInvoker<AddProgramRequest, AddProgramResponse> addProgramAsyncInvoker(AddProgramRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.addProgram, hcClient);
    }

    /**
     * 新增信息窗发布
     *
     * 新增信息窗发布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddPublicationRequest 请求对象
     * @return CompletableFuture<AddPublicationResponse>
     */
    public CompletableFuture<AddPublicationResponse> addPublicationAsync(AddPublicationRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.addPublication);
    }

    /**
     * 新增信息窗发布
     *
     * 新增信息窗发布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddPublicationRequest 请求对象
     * @return AsyncInvoker<AddPublicationRequest, AddPublicationResponse>
     */
    public AsyncInvoker<AddPublicationRequest, AddPublicationResponse> addPublicationAsyncInvoker(
        AddPublicationRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.addPublication, hcClient);
    }

    /**
     * SP管理员分配企业资源
     *
     * 企业新增资源发放。该接口同时支持修改，带resourceId后会判断该资源是否存在，存在即修改（支持修改的参数见修改接口），否则按新增处理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddResourceRequest 请求对象
     * @return CompletableFuture<AddResourceResponse>
     */
    public CompletableFuture<AddResourceResponse> addResourceAsync(AddResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.addResource);
    }

    /**
     * SP管理员分配企业资源
     *
     * 企业新增资源发放。该接口同时支持修改，带resourceId后会判断该资源是否存在，存在即修改（支持修改的参数见修改接口），否则按新增处理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddResourceRequest 请求对象
     * @return AsyncInvoker<AddResourceRequest, AddResourceResponse>
     */
    public AsyncInvoker<AddResourceRequest, AddResourceResponse> addResourceAsyncInvoker(AddResourceRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.addResource, hcClient);
    }

    /**
     * 保存会议纪要到个人云空间
     *
     * 用户使用手机扫码后,手机端请求服务端将当前会议纪要文件保存到个人云空间。二维码内容 ：cloudlink://cloudlink.huawei.com/h5page?action&#x3D;SAVE_MEETING_FILE&amp;key1&#x3D;value1&amp;key2&#x3D;value2 。key/value的个数可能变化，终端解析后，在发起后续请求时，将所有key/value存为map，作为入参即可。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddToPersonalSpaceRequest 请求对象
     * @return CompletableFuture<AddToPersonalSpaceResponse>
     */
    public CompletableFuture<AddToPersonalSpaceResponse> addToPersonalSpaceAsync(AddToPersonalSpaceRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.addToPersonalSpace);
    }

    /**
     * 保存会议纪要到个人云空间
     *
     * 用户使用手机扫码后,手机端请求服务端将当前会议纪要文件保存到个人云空间。二维码内容 ：cloudlink://cloudlink.huawei.com/h5page?action&#x3D;SAVE_MEETING_FILE&amp;key1&#x3D;value1&amp;key2&#x3D;value2 。key/value的个数可能变化，终端解析后，在发起后续请求时，将所有key/value存为map，作为入参即可。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddToPersonalSpaceRequest 请求对象
     * @return AsyncInvoker<AddToPersonalSpaceRequest, AddToPersonalSpaceResponse>
     */
    public AsyncInvoker<AddToPersonalSpaceRequest, AddToPersonalSpaceResponse> addToPersonalSpaceAsyncInvoker(
        AddToPersonalSpaceRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.addToPersonalSpace, hcClient);
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
     * @return CompletableFuture<AddUserResponse>
     */
    public CompletableFuture<AddUserResponse> addUserAsync(AddUserRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.addUser);
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
     * @return AsyncInvoker<AddUserRequest, AddUserResponse>
     */
    public AsyncInvoker<AddUserRequest, AddUserResponse> addUserAsyncInvoker(AddUserRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.addUser, hcClient);
    }

    /**
     * 允许客户端录制
     *
     * 该接口用于设置允许/禁止与会者客户端本地录制（非云端录制）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AllowClientRecordRequest 请求对象
     * @return CompletableFuture<AllowClientRecordResponse>
     */
    public CompletableFuture<AllowClientRecordResponse> allowClientRecordAsync(AllowClientRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.allowClientRecord);
    }

    /**
     * 允许客户端录制
     *
     * 该接口用于设置允许/禁止与会者客户端本地录制（非云端录制）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AllowClientRecordRequest 请求对象
     * @return AsyncInvoker<AllowClientRecordRequest, AllowClientRecordResponse>
     */
    public AsyncInvoker<AllowClientRecordRequest, AllowClientRecordResponse> allowClientRecordAsyncInvoker(
        AllowClientRecordRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.allowClientRecord, hcClient);
    }

    /**
     * 与会者自己解除静音
     *
     * 该接口用于设置与会者是否可以自己解除静音。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AllowGuestUnmuteRequest 请求对象
     * @return CompletableFuture<AllowGuestUnmuteResponse>
     */
    public CompletableFuture<AllowGuestUnmuteResponse> allowGuestUnmuteAsync(AllowGuestUnmuteRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.allowGuestUnmute);
    }

    /**
     * 与会者自己解除静音
     *
     * 该接口用于设置与会者是否可以自己解除静音。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AllowGuestUnmuteRequest 请求对象
     * @return AsyncInvoker<AllowGuestUnmuteRequest, AllowGuestUnmuteResponse>
     */
    public AsyncInvoker<AllowGuestUnmuteRequest, AllowGuestUnmuteResponse> allowGuestUnmuteAsyncInvoker(
        AllowGuestUnmuteRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.allowGuestUnmute, hcClient);
    }

    /**
     * 准入等候者
     *
     * 该接口用于允许等候室中的成员进入会议。可以允许全部成员进入会议，或者允许指定成员进入会议。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AllowWaitingParticipantRequest 请求对象
     * @return CompletableFuture<AllowWaitingParticipantResponse>
     */
    public CompletableFuture<AllowWaitingParticipantResponse> allowWaitingParticipantAsync(
        AllowWaitingParticipantRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.allowWaitingParticipant);
    }

    /**
     * 准入等候者
     *
     * 该接口用于允许等候室中的成员进入会议。可以允许全部成员进入会议，或者允许指定成员进入会议。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AllowWaitingParticipantRequest 请求对象
     * @return AsyncInvoker<AllowWaitingParticipantRequest, AllowWaitingParticipantResponse>
     */
    public AsyncInvoker<AllowWaitingParticipantRequest, AllowWaitingParticipantResponse> allowWaitingParticipantAsyncInvoker(
        AllowWaitingParticipantRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.allowWaitingParticipant, hcClient);
    }

    /**
     * 分配云会议室
     *
     * 企业管理员通过该接口将云会议室分配给用户、专业会议终端（TE10、TE20、HUAWEI Board、HUAWEI Bar 500及HUAWEI Box系列）、智慧屏TV、电子白板（SmartRooms）、IdeaHub。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateVmrRequest 请求对象
     * @return CompletableFuture<AssociateVmrResponse>
     */
    public CompletableFuture<AssociateVmrResponse> associateVmrAsync(AssociateVmrRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.associateVmr);
    }

    /**
     * 分配云会议室
     *
     * 企业管理员通过该接口将云会议室分配给用户、专业会议终端（TE10、TE20、HUAWEI Board、HUAWEI Bar 500及HUAWEI Box系列）、智慧屏TV、电子白板（SmartRooms）、IdeaHub。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateVmrRequest 请求对象
     * @return AsyncInvoker<AssociateVmrRequest, AssociateVmrResponse>
     */
    public AsyncInvoker<AssociateVmrRequest, AssociateVmrResponse> associateVmrAsyncInvoker(
        AssociateVmrRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.associateVmr, hcClient);
    }

    /**
     * 批量删除企业管理员
     *
     * 通过该接口批量删除企业管理员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteCorpAdminsRequest 请求对象
     * @return CompletableFuture<BatchDeleteCorpAdminsResponse>
     */
    public CompletableFuture<BatchDeleteCorpAdminsResponse> batchDeleteCorpAdminsAsync(
        BatchDeleteCorpAdminsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.batchDeleteCorpAdmins);
    }

    /**
     * 批量删除企业管理员
     *
     * 通过该接口批量删除企业管理员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteCorpAdminsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteCorpAdminsRequest, BatchDeleteCorpAdminsResponse>
     */
    public AsyncInvoker<BatchDeleteCorpAdminsRequest, BatchDeleteCorpAdminsResponse> batchDeleteCorpAdminsAsyncInvoker(
        BatchDeleteCorpAdminsRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.batchDeleteCorpAdmins, hcClient);
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
     * @return CompletableFuture<BatchDeleteDevicesResponse>
     */
    public CompletableFuture<BatchDeleteDevicesResponse> batchDeleteDevicesAsync(BatchDeleteDevicesRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.batchDeleteDevices);
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
     * @return AsyncInvoker<BatchDeleteDevicesRequest, BatchDeleteDevicesResponse>
     */
    public AsyncInvoker<BatchDeleteDevicesRequest, BatchDeleteDevicesResponse> batchDeleteDevicesAsyncInvoker(
        BatchDeleteDevicesRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.batchDeleteDevices, hcClient);
    }

    /**
     * 删除信息窗素材
     *
     * 删除信息窗素材。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteMaterialsRequest 请求对象
     * @return CompletableFuture<BatchDeleteMaterialsResponse>
     */
    public CompletableFuture<BatchDeleteMaterialsResponse> batchDeleteMaterialsAsync(
        BatchDeleteMaterialsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.batchDeleteMaterials);
    }

    /**
     * 删除信息窗素材
     *
     * 删除信息窗素材。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteMaterialsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteMaterialsRequest, BatchDeleteMaterialsResponse>
     */
    public AsyncInvoker<BatchDeleteMaterialsRequest, BatchDeleteMaterialsResponse> batchDeleteMaterialsAsyncInvoker(
        BatchDeleteMaterialsRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.batchDeleteMaterials, hcClient);
    }

    /**
     * 删除信息窗节目
     *
     * 删除信息窗节目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteProgramsRequest 请求对象
     * @return CompletableFuture<BatchDeleteProgramsResponse>
     */
    public CompletableFuture<BatchDeleteProgramsResponse> batchDeleteProgramsAsync(BatchDeleteProgramsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.batchDeletePrograms);
    }

    /**
     * 删除信息窗节目
     *
     * 删除信息窗节目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteProgramsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteProgramsRequest, BatchDeleteProgramsResponse>
     */
    public AsyncInvoker<BatchDeleteProgramsRequest, BatchDeleteProgramsResponse> batchDeleteProgramsAsyncInvoker(
        BatchDeleteProgramsRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.batchDeletePrograms, hcClient);
    }

    /**
     * 删除信息窗发布
     *
     * 删除信息窗发布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeletePublicationsRequest 请求对象
     * @return CompletableFuture<BatchDeletePublicationsResponse>
     */
    public CompletableFuture<BatchDeletePublicationsResponse> batchDeletePublicationsAsync(
        BatchDeletePublicationsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.batchDeletePublications);
    }

    /**
     * 删除信息窗发布
     *
     * 删除信息窗发布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeletePublicationsRequest 请求对象
     * @return AsyncInvoker<BatchDeletePublicationsRequest, BatchDeletePublicationsResponse>
     */
    public AsyncInvoker<BatchDeletePublicationsRequest, BatchDeletePublicationsResponse> batchDeletePublicationsAsyncInvoker(
        BatchDeletePublicationsRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.batchDeletePublications, hcClient);
    }

    /**
     * 批量删除用户
     *
     * 企业管理员通过该接口批量删除企业用户。删除多个用户时，全部删除成功或者全部删除失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteUsersRequest 请求对象
     * @return CompletableFuture<BatchDeleteUsersResponse>
     */
    public CompletableFuture<BatchDeleteUsersResponse> batchDeleteUsersAsync(BatchDeleteUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.batchDeleteUsers);
    }

    /**
     * 批量删除用户
     *
     * 企业管理员通过该接口批量删除企业用户。删除多个用户时，全部删除成功或者全部删除失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteUsersRequest 请求对象
     * @return AsyncInvoker<BatchDeleteUsersRequest, BatchDeleteUsersResponse>
     */
    public AsyncInvoker<BatchDeleteUsersRequest, BatchDeleteUsersResponse> batchDeleteUsersAsyncInvoker(
        BatchDeleteUsersRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.batchDeleteUsers, hcClient);
    }

    /**
     * 批量举手
     *
     * 该接口用于批量设置来宾的举手/放下举手状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchHandRequest 请求对象
     * @return CompletableFuture<BatchHandResponse>
     */
    public CompletableFuture<BatchHandResponse> batchHandAsync(BatchHandRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.batchHand);
    }

    /**
     * 批量举手
     *
     * 该接口用于批量设置来宾的举手/放下举手状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchHandRequest 请求对象
     * @return AsyncInvoker<BatchHandRequest, BatchHandResponse>
     */
    public AsyncInvoker<BatchHandRequest, BatchHandResponse> batchHandAsyncInvoker(BatchHandRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.batchHand, hcClient);
    }

    /**
     * 批量查询用户详情
     *
     * 批量查询用户详情，支持指定第三方账号查询详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchShowUserDetailsRequest 请求对象
     * @return CompletableFuture<BatchShowUserDetailsResponse>
     */
    public CompletableFuture<BatchShowUserDetailsResponse> batchShowUserDetailsAsync(
        BatchShowUserDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.batchShowUserDetails);
    }

    /**
     * 批量查询用户详情
     *
     * 批量查询用户详情，支持指定第三方账号查询详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchShowUserDetailsRequest 请求对象
     * @return AsyncInvoker<BatchShowUserDetailsRequest, BatchShowUserDetailsResponse>
     */
    public AsyncInvoker<BatchShowUserDetailsRequest, BatchShowUserDetailsResponse> batchShowUserDetailsAsyncInvoker(
        BatchShowUserDetailsRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.batchShowUserDetails, hcClient);
    }

    /**
     * 批量修改终端状态
     *
     * 企业管理员通过该接口批量修改专业会议终端状态。当硬终端资源到期后，若企业内对应资源的硬终端超过数量后会被系统随机自动停用，此时可通过该接口修改专业会议终端的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateDevicesStatusRequest 请求对象
     * @return CompletableFuture<BatchUpdateDevicesStatusResponse>
     */
    public CompletableFuture<BatchUpdateDevicesStatusResponse> batchUpdateDevicesStatusAsync(
        BatchUpdateDevicesStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.batchUpdateDevicesStatus);
    }

    /**
     * 批量修改终端状态
     *
     * 企业管理员通过该接口批量修改专业会议终端状态。当硬终端资源到期后，若企业内对应资源的硬终端超过数量后会被系统随机自动停用，此时可通过该接口修改专业会议终端的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateDevicesStatusRequest 请求对象
     * @return AsyncInvoker<BatchUpdateDevicesStatusRequest, BatchUpdateDevicesStatusResponse>
     */
    public AsyncInvoker<BatchUpdateDevicesStatusRequest, BatchUpdateDevicesStatusResponse> batchUpdateDevicesStatusAsyncInvoker(
        BatchUpdateDevicesStatusRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.batchUpdateDevicesStatus, hcClient);
    }

    /**
     * 批量修改用户状态
     *
     * 企业管理员通过该接口批量修改用户状态，当用户帐号数资源或者电子白板（SmartRooms）资源到期后，若企业内对应资源的用户帐号超过数量后会被系统随机自动停用，此时可通过该接口修改用户的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateUserStatusRequest 请求对象
     * @return CompletableFuture<BatchUpdateUserStatusResponse>
     */
    public CompletableFuture<BatchUpdateUserStatusResponse> batchUpdateUserStatusAsync(
        BatchUpdateUserStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.batchUpdateUserStatus);
    }

    /**
     * 批量修改用户状态
     *
     * 企业管理员通过该接口批量修改用户状态，当用户帐号数资源或者电子白板（SmartRooms）资源到期后，若企业内对应资源的用户帐号超过数量后会被系统随机自动停用，此时可通过该接口修改用户的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateUserStatusRequest 请求对象
     * @return AsyncInvoker<BatchUpdateUserStatusRequest, BatchUpdateUserStatusResponse>
     */
    public AsyncInvoker<BatchUpdateUserStatusRequest, BatchUpdateUserStatusResponse> batchUpdateUserStatusAsyncInvoker(
        BatchUpdateUserStatusRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.batchUpdateUserStatus, hcClient);
    }

    /**
     * 广播会场
     *
     * 该接口用于广播指定的与会者。同一时间，只允许一个与会者被广播。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BroadcastParticipantRequest 请求对象
     * @return CompletableFuture<BroadcastParticipantResponse>
     */
    public CompletableFuture<BroadcastParticipantResponse> broadcastParticipantAsync(
        BroadcastParticipantRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.broadcastParticipant);
    }

    /**
     * 广播会场
     *
     * 该接口用于广播指定的与会者。同一时间，只允许一个与会者被广播。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BroadcastParticipantRequest 请求对象
     * @return AsyncInvoker<BroadcastParticipantRequest, BroadcastParticipantResponse>
     */
    public AsyncInvoker<BroadcastParticipantRequest, BroadcastParticipantResponse> broadcastParticipantAsyncInvoker(
        BroadcastParticipantRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.broadcastParticipant, hcClient);
    }

    /**
     * 取消广播
     *
     * 该接口用于取消广播，包括：取消广播多画面，取消广播会场，取消点名会场。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelBroadcastRequest 请求对象
     * @return CompletableFuture<CancelBroadcastResponse>
     */
    public CompletableFuture<CancelBroadcastResponse> cancelBroadcastAsync(CancelBroadcastRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.cancelBroadcast);
    }

    /**
     * 取消广播
     *
     * 该接口用于取消广播，包括：取消广播多画面，取消广播会场，取消点名会场。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelBroadcastRequest 请求对象
     * @return AsyncInvoker<CancelBroadcastRequest, CancelBroadcastResponse>
     */
    public AsyncInvoker<CancelBroadcastRequest, CancelBroadcastResponse> cancelBroadcastAsyncInvoker(
        CancelBroadcastRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.cancelBroadcast, hcClient);
    }

    /**
     * 取消预约会议
     *
     * 该接口用于取消预约的会议。企业管理员可以取消本企业下用户创建的会议，普通用户只能取消自己创建的会议。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelMeetingRequest 请求对象
     * @return CompletableFuture<CancelMeetingResponse>
     */
    public CompletableFuture<CancelMeetingResponse> cancelMeetingAsync(CancelMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.cancelMeeting);
    }

    /**
     * 取消预约会议
     *
     * 该接口用于取消预约的会议。企业管理员可以取消本企业下用户创建的会议，普通用户只能取消自己创建的会议。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelMeetingRequest 请求对象
     * @return AsyncInvoker<CancelMeetingRequest, CancelMeetingResponse>
     */
    public AsyncInvoker<CancelMeetingRequest, CancelMeetingResponse> cancelMeetingAsyncInvoker(
        CancelMeetingRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.cancelMeeting, hcClient);
    }

    /**
     * 取消周期性会议
     *
     * 该接口用于取消周期性会议。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelRecurringMeetingRequest 请求对象
     * @return CompletableFuture<CancelRecurringMeetingResponse>
     */
    public CompletableFuture<CancelRecurringMeetingResponse> cancelRecurringMeetingAsync(
        CancelRecurringMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.cancelRecurringMeeting);
    }

    /**
     * 取消周期性会议
     *
     * 该接口用于取消周期性会议。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelRecurringMeetingRequest 请求对象
     * @return AsyncInvoker<CancelRecurringMeetingRequest, CancelRecurringMeetingResponse>
     */
    public AsyncInvoker<CancelRecurringMeetingRequest, CancelRecurringMeetingResponse> cancelRecurringMeetingAsyncInvoker(
        CancelRecurringMeetingRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.cancelRecurringMeeting, hcClient);
    }

    /**
     * 取消周期性会议的子会议
     *
     * 该接口用于取消周期性会议的子会议。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelRecurringSubMeetingRequest 请求对象
     * @return CompletableFuture<CancelRecurringSubMeetingResponse>
     */
    public CompletableFuture<CancelRecurringSubMeetingResponse> cancelRecurringSubMeetingAsync(
        CancelRecurringSubMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.cancelRecurringSubMeeting);
    }

    /**
     * 取消周期性会议的子会议
     *
     * 该接口用于取消周期性会议的子会议。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelRecurringSubMeetingRequest 请求对象
     * @return AsyncInvoker<CancelRecurringSubMeetingRequest, CancelRecurringSubMeetingResponse>
     */
    public AsyncInvoker<CancelRecurringSubMeetingRequest, CancelRecurringSubMeetingResponse> cancelRecurringSubMeetingAsyncInvoker(
        CancelRecurringSubMeetingRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.cancelRecurringSubMeeting, hcClient);
    }

    /**
     * 校验滑块验证码
     *
     * 该接口提供校验滑块验证码。服务器收到请求，返回校验结果。用户在前台界面通过滑块操作匹配图形，使得抠图和原图吻合。然后服务器进行校验滑块验证码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckSlideVerifyCodeRequest 请求对象
     * @return CompletableFuture<CheckSlideVerifyCodeResponse>
     */
    public CompletableFuture<CheckSlideVerifyCodeResponse> checkSlideVerifyCodeAsync(
        CheckSlideVerifyCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.checkSlideVerifyCode);
    }

    /**
     * 校验滑块验证码
     *
     * 该接口提供校验滑块验证码。服务器收到请求，返回校验结果。用户在前台界面通过滑块操作匹配图形，使得抠图和原图吻合。然后服务器进行校验滑块验证码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckSlideVerifyCodeRequest 请求对象
     * @return AsyncInvoker<CheckSlideVerifyCodeRequest, CheckSlideVerifyCodeResponse>
     */
    public AsyncInvoker<CheckSlideVerifyCodeRequest, CheckSlideVerifyCodeResponse> checkSlideVerifyCodeAsyncInvoker(
        CheckSlideVerifyCodeRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.checkSlideVerifyCode, hcClient);
    }

    /**
     * 校验Token
     *
     * 该接口提供校验token合法性功能。服务器收到请求后，验证token合法性并返回结果。如果参数needGenNewToken为true时，生成新的token并返回。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckTokenRequest 请求对象
     * @return CompletableFuture<CheckTokenResponse>
     */
    public CompletableFuture<CheckTokenResponse> checkTokenAsync(CheckTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.checkToken);
    }

    /**
     * 校验Token
     *
     * 该接口提供校验token合法性功能。服务器收到请求后，验证token合法性并返回结果。如果参数needGenNewToken为true时，生成新的token并返回。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckTokenRequest 请求对象
     * @return AsyncInvoker<CheckTokenRequest, CheckTokenResponse>
     */
    public AsyncInvoker<CheckTokenRequest, CheckTokenResponse> checkTokenAsyncInvoker(CheckTokenRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.checkToken, hcClient);
    }

    /**
     * 校验手机和邮箱对应的验证码
     *
     * 企业用户通过该接口校验手机和邮箱对应的验证码，一分钟内记录尝试次数不得超过5次。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckVeriCodeForUpdateUserInfoRequest 请求对象
     * @return CompletableFuture<CheckVeriCodeForUpdateUserInfoResponse>
     */
    public CompletableFuture<CheckVeriCodeForUpdateUserInfoResponse> checkVeriCodeForUpdateUserInfoAsync(
        CheckVeriCodeForUpdateUserInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.checkVeriCodeForUpdateUserInfo);
    }

    /**
     * 校验手机和邮箱对应的验证码
     *
     * 企业用户通过该接口校验手机和邮箱对应的验证码，一分钟内记录尝试次数不得超过5次。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckVeriCodeForUpdateUserInfoRequest 请求对象
     * @return AsyncInvoker<CheckVeriCodeForUpdateUserInfoRequest, CheckVeriCodeForUpdateUserInfoResponse>
     */
    public AsyncInvoker<CheckVeriCodeForUpdateUserInfoRequest, CheckVeriCodeForUpdateUserInfoResponse> checkVeriCodeForUpdateUserInfoAsyncInvoker(
        CheckVeriCodeForUpdateUserInfoRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.checkVeriCodeForUpdateUserInfo, hcClient);
    }

    /**
     * 校验验证码
     *
     * 该接口提供校验验证码，服务器收到请求，返回结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckVerifyCodeRequest 请求对象
     * @return CompletableFuture<CheckVerifyCodeResponse>
     */
    public CompletableFuture<CheckVerifyCodeResponse> checkVerifyCodeAsync(CheckVerifyCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.checkVerifyCode);
    }

    /**
     * 校验验证码
     *
     * 该接口提供校验验证码，服务器收到请求，返回结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckVerifyCodeRequest 请求对象
     * @return AsyncInvoker<CheckVerifyCodeRequest, CheckVerifyCodeResponse>
     */
    public AsyncInvoker<CheckVerifyCodeRequest, CheckVerifyCodeResponse> checkVerifyCodeAsyncInvoker(
        CheckVerifyCodeRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.checkVerifyCode, hcClient);
    }

    /**
     * 匿名用户会议鉴权
     *
     * 该接口用于匿名用户入会鉴权。请求根据会议ID和密码鉴权，返回鉴权随机数（可以根据该随机数获取匿名用户信息、会议信息等）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAnonymousAuthRandomRequest 请求对象
     * @return CompletableFuture<CreateAnonymousAuthRandomResponse>
     */
    public CompletableFuture<CreateAnonymousAuthRandomResponse> createAnonymousAuthRandomAsync(
        CreateAnonymousAuthRandomRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.createAnonymousAuthRandom);
    }

    /**
     * 匿名用户会议鉴权
     *
     * 该接口用于匿名用户入会鉴权。请求根据会议ID和密码鉴权，返回鉴权随机数（可以根据该随机数获取匿名用户信息、会议信息等）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAnonymousAuthRandomRequest 请求对象
     * @return AsyncInvoker<CreateAnonymousAuthRandomRequest, CreateAnonymousAuthRandomResponse>
     */
    public AsyncInvoker<CreateAnonymousAuthRandomRequest, CreateAnonymousAuthRandomResponse> createAnonymousAuthRandomAsyncInvoker(
        CreateAnonymousAuthRandomRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.createAnonymousAuthRandom, hcClient);
    }

    /**
     * 获取会控Token
     *
     * 该接口用于获取正在召开会议的会控Token（未开始的会议调用该接口返回失败）。Token有效期是半个小时。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfTokenRequest 请求对象
     * @return CompletableFuture<CreateConfTokenResponse>
     */
    public CompletableFuture<CreateConfTokenResponse> createConfTokenAsync(CreateConfTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.createConfToken);
    }

    /**
     * 获取会控Token
     *
     * 该接口用于获取正在召开会议的会控Token（未开始的会议调用该接口返回失败）。Token有效期是半个小时。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfTokenRequest 请求对象
     * @return AsyncInvoker<CreateConfTokenRequest, CreateConfTokenResponse>
     */
    public AsyncInvoker<CreateConfTokenRequest, CreateConfTokenResponse> createConfTokenAsyncInvoker(
        CreateConfTokenRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.createConfToken, hcClient);
    }

    /**
     * 创建会议
     *
     * 该接口用于创建立即会议和预约会议。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMeetingRequest 请求对象
     * @return CompletableFuture<CreateMeetingResponse>
     */
    public CompletableFuture<CreateMeetingResponse> createMeetingAsync(CreateMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.createMeeting);
    }

    /**
     * 创建会议
     *
     * 该接口用于创建立即会议和预约会议。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMeetingRequest 请求对象
     * @return AsyncInvoker<CreateMeetingRequest, CreateMeetingResponse>
     */
    public AsyncInvoker<CreateMeetingRequest, CreateMeetingResponse> createMeetingAsyncInvoker(
        CreateMeetingRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.createMeeting, hcClient);
    }

    /**
     * 获取页面免登陆跳转的nonce信息
     *
     * 通过Access Token生成页面免登陆跳转到华为云会议的Portal的nonce信息。获取到nonce信息后，通过链接https://meeting.huaweicloud.com/?lang&#x3D;zh-CN&amp;nonce&#x3D;xxxxxxxxxxxxx#/login进行免登陆跳转。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePortalRefNonceRequest 请求对象
     * @return CompletableFuture<CreatePortalRefNonceResponse>
     */
    public CompletableFuture<CreatePortalRefNonceResponse> createPortalRefNonceAsync(
        CreatePortalRefNonceRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.createPortalRefNonce);
    }

    /**
     * 获取页面免登陆跳转的nonce信息
     *
     * 通过Access Token生成页面免登陆跳转到华为云会议的Portal的nonce信息。获取到nonce信息后，通过链接https://meeting.huaweicloud.com/?lang&#x3D;zh-CN&amp;nonce&#x3D;xxxxxxxxxxxxx#/login进行免登陆跳转。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePortalRefNonceRequest 请求对象
     * @return AsyncInvoker<CreatePortalRefNonceRequest, CreatePortalRefNonceResponse>
     */
    public AsyncInvoker<CreatePortalRefNonceRequest, CreatePortalRefNonceResponse> createPortalRefNonceAsyncInvoker(
        CreatePortalRefNonceRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.createPortalRefNonce, hcClient);
    }

    /**
     * 创建周期性会议
     *
     * 该接口用于预约周期性会议。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRecurringMeetingRequest 请求对象
     * @return CompletableFuture<CreateRecurringMeetingResponse>
     */
    public CompletableFuture<CreateRecurringMeetingResponse> createRecurringMeetingAsync(
        CreateRecurringMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.createRecurringMeeting);
    }

    /**
     * 创建周期性会议
     *
     * 该接口用于预约周期性会议。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRecurringMeetingRequest 请求对象
     * @return AsyncInvoker<CreateRecurringMeetingRequest, CreateRecurringMeetingResponse>
     */
    public AsyncInvoker<CreateRecurringMeetingRequest, CreateRecurringMeetingResponse> createRecurringMeetingAsyncInvoker(
        CreateRecurringMeetingRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.createRecurringMeeting, hcClient);
    }

    /**
     * 企业管理员生成激活码
     *
     * 企业管理员生成智慧屏、电子白板（SmartRooms）、Ideahub的激活码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVisionActiveCodeRequest 请求对象
     * @return CompletableFuture<CreateVisionActiveCodeResponse>
     */
    public CompletableFuture<CreateVisionActiveCodeResponse> createVisionActiveCodeAsync(
        CreateVisionActiveCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.createVisionActiveCode);
    }

    /**
     * 企业管理员生成激活码
     *
     * 企业管理员生成智慧屏、电子白板（SmartRooms）、Ideahub的激活码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVisionActiveCodeRequest 请求对象
     * @return AsyncInvoker<CreateVisionActiveCodeRequest, CreateVisionActiveCodeResponse>
     */
    public AsyncInvoker<CreateVisionActiveCodeRequest, CreateVisionActiveCodeResponse> createVisionActiveCodeAsyncInvoker(
        CreateVisionActiveCodeRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.createVisionActiveCode, hcClient);
    }

    /**
     * 获取websocket建链Token
     *
     * 该接口用于获取会控WebSocket建链的临时Token。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWebSocketTokenRequest 请求对象
     * @return CompletableFuture<CreateWebSocketTokenResponse>
     */
    public CompletableFuture<CreateWebSocketTokenResponse> createWebSocketTokenAsync(
        CreateWebSocketTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.createWebSocketToken);
    }

    /**
     * 获取websocket建链Token
     *
     * 该接口用于获取会控WebSocket建链的临时Token。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWebSocketTokenRequest 请求对象
     * @return AsyncInvoker<CreateWebSocketTokenRequest, CreateWebSocketTokenResponse>
     */
    public AsyncInvoker<CreateWebSocketTokenRequest, CreateWebSocketTokenResponse> createWebSocketTokenAsyncInvoker(
        CreateWebSocketTokenRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.createWebSocketToken, hcClient);
    }

    /**
     * 预约网络研讨会
     *
     * 该接口用于创建网络研讨会。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWebinarRequest 请求对象
     * @return CompletableFuture<CreateWebinarResponse>
     */
    public CompletableFuture<CreateWebinarResponse> createWebinarAsync(CreateWebinarRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.createWebinar);
    }

    /**
     * 预约网络研讨会
     *
     * 该接口用于创建网络研讨会。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWebinarRequest 请求对象
     * @return AsyncInvoker<CreateWebinarRequest, CreateWebinarResponse>
     */
    public AsyncInvoker<CreateWebinarRequest, CreateWebinarResponse> createWebinarAsyncInvoker(
        CreateWebinarRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.createWebinar, hcClient);
    }

    /**
     * 删除与会者
     *
     * 该接口用于删除与会者。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAttendeesRequest 请求对象
     * @return CompletableFuture<DeleteAttendeesResponse>
     */
    public CompletableFuture<DeleteAttendeesResponse> deleteAttendeesAsync(DeleteAttendeesRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.deleteAttendees);
    }

    /**
     * 删除与会者
     *
     * 该接口用于删除与会者。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAttendeesRequest 请求对象
     * @return AsyncInvoker<DeleteAttendeesRequest, DeleteAttendeesResponse>
     */
    public AsyncInvoker<DeleteAttendeesRequest, DeleteAttendeesResponse> deleteAttendeesAsyncInvoker(
        DeleteAttendeesRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.deleteAttendees, hcClient);
    }

    /**
     * SP管理员删除企业
     *
     * 删除企业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCorpRequest 请求对象
     * @return CompletableFuture<DeleteCorpResponse>
     */
    public CompletableFuture<DeleteCorpResponse> deleteCorpAsync(DeleteCorpRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.deleteCorp);
    }

    /**
     * SP管理员删除企业
     *
     * 删除企业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCorpRequest 请求对象
     * @return AsyncInvoker<DeleteCorpRequest, DeleteCorpResponse>
     */
    public AsyncInvoker<DeleteCorpRequest, DeleteCorpResponse> deleteCorpAsyncInvoker(DeleteCorpRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.deleteCorp, hcClient);
    }

    /**
     * 删除云会议室
     *
     * 企业管理员通过该接口删除企业的云会议室。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCorpVmrRequest 请求对象
     * @return CompletableFuture<DeleteCorpVmrResponse>
     */
    public CompletableFuture<DeleteCorpVmrResponse> deleteCorpVmrAsync(DeleteCorpVmrRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.deleteCorpVmr);
    }

    /**
     * 删除云会议室
     *
     * 企业管理员通过该接口删除企业的云会议室。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCorpVmrRequest 请求对象
     * @return AsyncInvoker<DeleteCorpVmrRequest, DeleteCorpVmrResponse>
     */
    public AsyncInvoker<DeleteCorpVmrRequest, DeleteCorpVmrResponse> deleteCorpVmrAsyncInvoker(
        DeleteCorpVmrRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.deleteCorpVmr, hcClient);
    }

    /**
     * 删除部门
     *
     * 企业管理员通过该接口删除部门。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDepartmentRequest 请求对象
     * @return CompletableFuture<DeleteDepartmentResponse>
     */
    public CompletableFuture<DeleteDepartmentResponse> deleteDepartmentAsync(DeleteDepartmentRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.deleteDepartment);
    }

    /**
     * 删除部门
     *
     * 企业管理员通过该接口删除部门。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDepartmentRequest 请求对象
     * @return AsyncInvoker<DeleteDepartmentRequest, DeleteDepartmentResponse>
     */
    public AsyncInvoker<DeleteDepartmentRequest, DeleteDepartmentResponse> deleteDepartmentAsyncInvoker(
        DeleteDepartmentRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.deleteDepartment, hcClient);
    }

    /**
     * 删除多画面布局
     *
     * 该接口用于删除当前会议已保存的多画面布局。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLayoutRequest 请求对象
     * @return CompletableFuture<DeleteLayoutResponse>
     */
    public CompletableFuture<DeleteLayoutResponse> deleteLayoutAsync(DeleteLayoutRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.deleteLayout);
    }

    /**
     * 删除多画面布局
     *
     * 该接口用于删除当前会议已保存的多画面布局。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLayoutRequest 请求对象
     * @return AsyncInvoker<DeleteLayoutRequest, DeleteLayoutResponse>
     */
    public AsyncInvoker<DeleteLayoutRequest, DeleteLayoutResponse> deleteLayoutAsyncInvoker(
        DeleteLayoutRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.deleteLayout, hcClient);
    }

    /**
     * 批量删除录制
     *
     * 该接口用于批量删除会议的录制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRecordingsRequest 请求对象
     * @return CompletableFuture<DeleteRecordingsResponse>
     */
    public CompletableFuture<DeleteRecordingsResponse> deleteRecordingsAsync(DeleteRecordingsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.deleteRecordings);
    }

    /**
     * 批量删除录制
     *
     * 该接口用于批量删除会议的录制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRecordingsRequest 请求对象
     * @return AsyncInvoker<DeleteRecordingsRequest, DeleteRecordingsResponse>
     */
    public AsyncInvoker<DeleteRecordingsRequest, DeleteRecordingsResponse> deleteRecordingsAsyncInvoker(
        DeleteRecordingsRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.deleteRecordings, hcClient);
    }

    /**
     * SP管理员根据删除企业资源
     *
     * 企业删除资源项，删除资源项后，企业资源总数会自动减少。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceRequest 请求对象
     * @return CompletableFuture<DeleteResourceResponse>
     */
    public CompletableFuture<DeleteResourceResponse> deleteResourceAsync(DeleteResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.deleteResource);
    }

    /**
     * SP管理员根据删除企业资源
     *
     * 企业删除资源项，删除资源项后，企业资源总数会自动减少。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceRequest 请求对象
     * @return AsyncInvoker<DeleteResourceRequest, DeleteResourceResponse>
     */
    public AsyncInvoker<DeleteResourceRequest, DeleteResourceResponse> deleteResourceAsyncInvoker(
        DeleteResourceRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.deleteResource, hcClient);
    }

    /**
     * 注销登录
     *
     * 该接口提供注销功能。服务器收到请求后，删除该Token。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTokenRequest 请求对象
     * @return CompletableFuture<DeleteTokenResponse>
     */
    public CompletableFuture<DeleteTokenResponse> deleteTokenAsync(DeleteTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.deleteToken);
    }

    /**
     * 注销登录
     *
     * 该接口提供注销功能。服务器收到请求后，删除该Token。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTokenRequest 请求对象
     * @return AsyncInvoker<DeleteTokenRequest, DeleteTokenResponse>
     */
    public AsyncInvoker<DeleteTokenRequest, DeleteTokenResponse> deleteTokenAsyncInvoker(DeleteTokenRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.deleteToken, hcClient);
    }

    /**
     * 企业管理员删除激活码
     *
     * 企业管理员批量删除激活码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVisionActiveCodeRequest 请求对象
     * @return CompletableFuture<DeleteVisionActiveCodeResponse>
     */
    public CompletableFuture<DeleteVisionActiveCodeResponse> deleteVisionActiveCodeAsync(
        DeleteVisionActiveCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.deleteVisionActiveCode);
    }

    /**
     * 企业管理员删除激活码
     *
     * 企业管理员批量删除激活码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVisionActiveCodeRequest 请求对象
     * @return AsyncInvoker<DeleteVisionActiveCodeRequest, DeleteVisionActiveCodeResponse>
     */
    public AsyncInvoker<DeleteVisionActiveCodeRequest, DeleteVisionActiveCodeResponse> deleteVisionActiveCodeAsyncInvoker(
        DeleteVisionActiveCodeRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.deleteVisionActiveCode, hcClient);
    }

    /**
     * 删除事件推送
     *
     * 该接口用于管理员删除已配置的事件推送设置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWebHookConfigRequest 请求对象
     * @return CompletableFuture<DeleteWebHookConfigResponse>
     */
    public CompletableFuture<DeleteWebHookConfigResponse> deleteWebHookConfigAsync(DeleteWebHookConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.deleteWebHookConfig);
    }

    /**
     * 删除事件推送
     *
     * 该接口用于管理员删除已配置的事件推送设置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWebHookConfigRequest 请求对象
     * @return AsyncInvoker<DeleteWebHookConfigRequest, DeleteWebHookConfigResponse>
     */
    public AsyncInvoker<DeleteWebHookConfigRequest, DeleteWebHookConfigResponse> deleteWebHookConfigAsyncInvoker(
        DeleteWebHookConfigRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.deleteWebHookConfig, hcClient);
    }

    /**
     * 取消网络研讨会
     *
     * 该接口用于取消已预约的网络研讨会。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWebinarRequest 请求对象
     * @return CompletableFuture<DeleteWebinarResponse>
     */
    public CompletableFuture<DeleteWebinarResponse> deleteWebinarAsync(DeleteWebinarRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.deleteWebinar);
    }

    /**
     * 取消网络研讨会
     *
     * 该接口用于取消已预约的网络研讨会。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWebinarRequest 请求对象
     * @return AsyncInvoker<DeleteWebinarRequest, DeleteWebinarResponse>
     */
    public AsyncInvoker<DeleteWebinarRequest, DeleteWebinarResponse> deleteWebinarAsyncInvoker(
        DeleteWebinarRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.deleteWebinar, hcClient);
    }

    /**
     * 回收云会议室
     *
     * 企业管理员通过该接口回收云会议室。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateVmrRequest 请求对象
     * @return CompletableFuture<DisassociateVmrResponse>
     */
    public CompletableFuture<DisassociateVmrResponse> disassociateVmrAsync(DisassociateVmrRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.disassociateVmr);
    }

    /**
     * 回收云会议室
     *
     * 企业管理员通过该接口回收云会议室。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateVmrRequest 请求对象
     * @return AsyncInvoker<DisassociateVmrRequest, DisassociateVmrResponse>
     */
    public AsyncInvoker<DisassociateVmrRequest, DisassociateVmrResponse> disassociateVmrAsyncInvoker(
        DisassociateVmrRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.disassociateVmr, hcClient);
    }

    /**
     * 举手
     *
     * 该接口用于设置指定与会者的举手/放下举手状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HandRequest 请求对象
     * @return CompletableFuture<HandResponse>
     */
    public CompletableFuture<HandResponse> handAsync(HandRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.hand);
    }

    /**
     * 举手
     *
     * 该接口用于设置指定与会者的举手/放下举手状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HandRequest 请求对象
     * @return AsyncInvoker<HandRequest, HandResponse>
     */
    public AsyncInvoker<HandRequest, HandResponse> handAsyncInvoker(HandRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.hand, hcClient);
    }

    /**
     * 挂断与会者
     *
     * 该接口用于挂断正在通话中的与会者。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HangUpRequest 请求对象
     * @return CompletableFuture<HangUpResponse>
     */
    public CompletableFuture<HangUpResponse> hangUpAsync(HangUpRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.hangUp);
    }

    /**
     * 挂断与会者
     *
     * 该接口用于挂断正在通话中的与会者。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HangUpRequest 请求对象
     * @return AsyncInvoker<HangUpRequest, HangUpResponse>
     */
    public AsyncInvoker<HangUpRequest, HangUpResponse> hangUpAsyncInvoker(HangUpRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.hangUp, hcClient);
    }

    /**
     * 主持人邀请与会者开启/关闭摄像头
     *
     * 该接口用于邀请指定与会者开启、关闭摄像头。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InviteOperateVideoRequest 请求对象
     * @return CompletableFuture<InviteOperateVideoResponse>
     */
    public CompletableFuture<InviteOperateVideoResponse> inviteOperateVideoAsync(InviteOperateVideoRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.inviteOperateVideo);
    }

    /**
     * 主持人邀请与会者开启/关闭摄像头
     *
     * 该接口用于邀请指定与会者开启、关闭摄像头。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InviteOperateVideoRequest 请求对象
     * @return AsyncInvoker<InviteOperateVideoRequest, InviteOperateVideoResponse>
     */
    public AsyncInvoker<InviteOperateVideoRequest, InviteOperateVideoResponse> inviteOperateVideoAsyncInvoker(
        InviteOperateVideoRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.inviteOperateVideo, hcClient);
    }

    /**
     * 邀请与会者
     *
     * 该接口用于邀请与会者加入会议。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InviteParticipantRequest 请求对象
     * @return CompletableFuture<InviteParticipantResponse>
     */
    public CompletableFuture<InviteParticipantResponse> inviteParticipantAsync(InviteParticipantRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.inviteParticipant);
    }

    /**
     * 邀请与会者
     *
     * 该接口用于邀请与会者加入会议。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InviteParticipantRequest 请求对象
     * @return AsyncInvoker<InviteParticipantRequest, InviteParticipantResponse>
     */
    public AsyncInvoker<InviteParticipantRequest, InviteParticipantResponse> inviteParticipantAsyncInvoker(
        InviteParticipantRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.inviteParticipant, hcClient);
    }

    /**
     * 邀请共享
     *
     * 该接口用于邀请/取消邀请指定与会人共享桌面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InviteShareRequest 请求对象
     * @return CompletableFuture<InviteShareResponse>
     */
    public CompletableFuture<InviteShareResponse> inviteShareAsync(InviteShareRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.inviteShare);
    }

    /**
     * 邀请共享
     *
     * 该接口用于邀请/取消邀请指定与会人共享桌面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InviteShareRequest 请求对象
     * @return AsyncInvoker<InviteShareRequest, InviteShareResponse>
     */
    public AsyncInvoker<InviteShareRequest, InviteShareResponse> inviteShareAsyncInvoker(InviteShareRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.inviteShare, hcClient);
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
     * @return CompletableFuture<InviteUserResponse>
     */
    public CompletableFuture<InviteUserResponse> inviteUserAsync(InviteUserRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.inviteUser);
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
     * @return AsyncInvoker<InviteUserRequest, InviteUserResponse>
     */
    public AsyncInvoker<InviteUserRequest, InviteUserResponse> inviteUserAsyncInvoker(InviteUserRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.inviteUser, hcClient);
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
     * @return CompletableFuture<InviteWithPwdResponse>
     */
    public CompletableFuture<InviteWithPwdResponse> inviteWithPwdAsync(InviteWithPwdRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.inviteWithPwd);
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
     * @return AsyncInvoker<InviteWithPwdRequest, InviteWithPwdResponse>
     */
    public AsyncInvoker<InviteWithPwdRequest, InviteWithPwdResponse> inviteWithPwdAsyncInvoker(
        InviteWithPwdRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.inviteWithPwd, hcClient);
    }

    /**
     * 查询历史召开的网络研讨会列表
     *
     * 该接口用于查询历史网络研讨会。管理员可查询企业内历史网络研讨会，非管理员可查询个人历史网络研讨会。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryWebinarsRequest 请求对象
     * @return CompletableFuture<ListHistoryWebinarsResponse>
     */
    public CompletableFuture<ListHistoryWebinarsResponse> listHistoryWebinarsAsync(ListHistoryWebinarsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.listHistoryWebinars);
    }

    /**
     * 查询历史召开的网络研讨会列表
     *
     * 该接口用于查询历史网络研讨会。管理员可查询企业内历史网络研讨会，非管理员可查询个人历史网络研讨会。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryWebinarsRequest 请求对象
     * @return AsyncInvoker<ListHistoryWebinarsRequest, ListHistoryWebinarsResponse>
     */
    public AsyncInvoker<ListHistoryWebinarsRequest, ListHistoryWebinarsResponse> listHistoryWebinarsAsyncInvoker(
        ListHistoryWebinarsRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.listHistoryWebinars, hcClient);
    }

    /**
     * 查询会场网络质量
     *
     * 查询会场网络质量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNetworkQualityRequest 请求对象
     * @return CompletableFuture<ListNetworkQualityResponse>
     */
    public CompletableFuture<ListNetworkQualityResponse> listNetworkQualityAsync(ListNetworkQualityRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.listNetworkQuality);
    }

    /**
     * 查询会场网络质量
     *
     * 查询会场网络质量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNetworkQualityRequest 请求对象
     * @return AsyncInvoker<ListNetworkQualityRequest, ListNetworkQualityResponse>
     */
    public AsyncInvoker<ListNetworkQualityRequest, ListNetworkQualityResponse> listNetworkQualityAsyncInvoker(
        ListNetworkQualityRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.listNetworkQuality, hcClient);
    }

    /**
     * 查询正在召开的网络研讨会列表
     *
     * 该接口用于查询正在召开的网络研讨会。管理员可查询企业内正在召开网络研讨会，非管理员可查询自己预订的正在召开的网络研讨会。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOngoingWebinarsRequest 请求对象
     * @return CompletableFuture<ListOngoingWebinarsResponse>
     */
    public CompletableFuture<ListOngoingWebinarsResponse> listOngoingWebinarsAsync(ListOngoingWebinarsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.listOngoingWebinars);
    }

    /**
     * 查询正在召开的网络研讨会列表
     *
     * 该接口用于查询正在召开的网络研讨会。管理员可查询企业内正在召开网络研讨会，非管理员可查询自己预订的正在召开的网络研讨会。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOngoingWebinarsRequest 请求对象
     * @return AsyncInvoker<ListOngoingWebinarsRequest, ListOngoingWebinarsResponse>
     */
    public AsyncInvoker<ListOngoingWebinarsRequest, ListOngoingWebinarsResponse> listOngoingWebinarsAsyncInvoker(
        ListOngoingWebinarsRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.listOngoingWebinars, hcClient);
    }

    /**
     * 查询即将召开的网络研讨会列表
     *
     * 该接口用于查询即将召开的网络研讨会。管理员可查询企业内即将召开网络研讨会，非管理员可查询自己预订的即将召开的网络研讨会。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUpComingWebinarsRequest 请求对象
     * @return CompletableFuture<ListUpComingWebinarsResponse>
     */
    public CompletableFuture<ListUpComingWebinarsResponse> listUpComingWebinarsAsync(
        ListUpComingWebinarsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.listUpComingWebinars);
    }

    /**
     * 查询即将召开的网络研讨会列表
     *
     * 该接口用于查询即将召开的网络研讨会。管理员可查询企业内即将召开网络研讨会，非管理员可查询自己预订的即将召开的网络研讨会。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUpComingWebinarsRequest 请求对象
     * @return AsyncInvoker<ListUpComingWebinarsRequest, ListUpComingWebinarsResponse>
     */
    public AsyncInvoker<ListUpComingWebinarsRequest, ListUpComingWebinarsResponse> listUpComingWebinarsAsyncInvoker(
        ListUpComingWebinarsRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.listUpComingWebinars, hcClient);
    }

    /**
     * 启停会议直播
     *
     * 该接口用于启动或停止会议直播。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LiveRequest 请求对象
     * @return CompletableFuture<LiveResponse>
     */
    public CompletableFuture<LiveResponse> liveAsync(LiveRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.live);
    }

    /**
     * 启停会议直播
     *
     * 该接口用于启动或停止会议直播。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LiveRequest 请求对象
     * @return AsyncInvoker<LiveRequest, LiveResponse>
     */
    public AsyncInvoker<LiveRequest, LiveResponse> liveAsyncInvoker(LiveRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.live, hcClient);
    }

    /**
     * 锁定会议
     *
     * 该接口用于锁定或解锁会议。锁定会议后，不允许新的来宾主动加入会议。会议锁定后使用主持人密码/主持人链接加入会议或者主持人邀请来宾不受影响。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LockMeetingRequest 请求对象
     * @return CompletableFuture<LockMeetingResponse>
     */
    public CompletableFuture<LockMeetingResponse> lockMeetingAsync(LockMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.lockMeeting);
    }

    /**
     * 锁定会议
     *
     * 该接口用于锁定或解锁会议。锁定会议后，不允许新的来宾主动加入会议。会议锁定后使用主持人密码/主持人链接加入会议或者主持人邀请来宾不受影响。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LockMeetingRequest 请求对象
     * @return AsyncInvoker<LockMeetingRequest, LockMeetingResponse>
     */
    public AsyncInvoker<LockMeetingRequest, LockMeetingResponse> lockMeetingAsyncInvoker(LockMeetingRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.lockMeeting, hcClient);
    }

    /**
     * 锁定会场视频源
     *
     * 该接口用于锁定或者解锁某在线会场的视频源。只适用于专业会议终端（如TE系列等）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LockViewRequest 请求对象
     * @return CompletableFuture<LockViewResponse>
     */
    public CompletableFuture<LockViewResponse> lockViewAsync(LockViewRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.lockView);
    }

    /**
     * 锁定会场视频源
     *
     * 该接口用于锁定或者解锁某在线会场的视频源。只适用于专业会议终端（如TE系列等）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LockViewRequest 请求对象
     * @return AsyncInvoker<LockViewRequest, LockViewResponse>
     */
    public AsyncInvoker<LockViewRequest, LockViewResponse> lockViewAsyncInvoker(LockViewRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.lockView, hcClient);
    }

    /**
     * 移入等候室
     *
     * 该接口用于将会中的指定与会者移入到等候室。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MoveToWaitingRoomRequest 请求对象
     * @return CompletableFuture<MoveToWaitingRoomResponse>
     */
    public CompletableFuture<MoveToWaitingRoomResponse> moveToWaitingRoomAsync(MoveToWaitingRoomRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.moveToWaitingRoom);
    }

    /**
     * 移入等候室
     *
     * 该接口用于将会中的指定与会者移入到等候室。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MoveToWaitingRoomRequest 请求对象
     * @return AsyncInvoker<MoveToWaitingRoomRequest, MoveToWaitingRoomResponse>
     */
    public AsyncInvoker<MoveToWaitingRoomRequest, MoveToWaitingRoomResponse> moveToWaitingRoomAsyncInvoker(
        MoveToWaitingRoomRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.moveToWaitingRoom, hcClient);
    }

    /**
     * 全场静音
     *
     * 该接口用于设置整个会议所有与会者（主持人除外）的静音/取消静音状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MuteMeetingRequest 请求对象
     * @return CompletableFuture<MuteMeetingResponse>
     */
    public CompletableFuture<MuteMeetingResponse> muteMeetingAsync(MuteMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.muteMeeting);
    }

    /**
     * 全场静音
     *
     * 该接口用于设置整个会议所有与会者（主持人除外）的静音/取消静音状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MuteMeetingRequest 请求对象
     * @return AsyncInvoker<MuteMeetingRequest, MuteMeetingResponse>
     */
    public AsyncInvoker<MuteMeetingRequest, MuteMeetingResponse> muteMeetingAsyncInvoker(MuteMeetingRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.muteMeeting, hcClient);
    }

    /**
     * 静音与会者
     *
     * 该接口用于设置指定与会者静音/取消静音状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MuteParticipantRequest 请求对象
     * @return CompletableFuture<MuteParticipantResponse>
     */
    public CompletableFuture<MuteParticipantResponse> muteParticipantAsync(MuteParticipantRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.muteParticipant);
    }

    /**
     * 静音与会者
     *
     * 该接口用于设置指定与会者静音/取消静音状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MuteParticipantRequest 请求对象
     * @return AsyncInvoker<MuteParticipantRequest, MuteParticipantResponse>
     */
    public AsyncInvoker<MuteParticipantRequest, MuteParticipantResponse> muteParticipantAsyncInvoker(
        MuteParticipantRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.muteParticipant, hcClient);
    }

    /**
     * 延长会议
     *
     * 该接口用于延长会议时间。默认会议自动延长。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ProlongMeetingRequest 请求对象
     * @return CompletableFuture<ProlongMeetingResponse>
     */
    public CompletableFuture<ProlongMeetingResponse> prolongMeetingAsync(ProlongMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.prolongMeeting);
    }

    /**
     * 延长会议
     *
     * 该接口用于延长会议时间。默认会议自动延长。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ProlongMeetingRequest 请求对象
     * @return AsyncInvoker<ProlongMeetingRequest, ProlongMeetingResponse>
     */
    public AsyncInvoker<ProlongMeetingRequest, ProlongMeetingResponse> prolongMeetingAsyncInvoker(
        ProlongMeetingRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.prolongMeeting, hcClient);
    }

    /**
     * 启停会议录制
     *
     * 该接口用于启动或停止会议云录制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RecordRequest 请求对象
     * @return CompletableFuture<RecordResponse>
     */
    public CompletableFuture<RecordResponse> recordAsync(RecordRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.record);
    }

    /**
     * 启停会议录制
     *
     * 该接口用于启动或停止会议云录制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RecordRequest 请求对象
     * @return AsyncInvoker<RecordRequest, RecordResponse>
     */
    public AsyncInvoker<RecordRequest, RecordResponse> recordAsyncInvoker(RecordRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.record, hcClient);
    }

    /**
     * 重命名与会者
     *
     * 重命名某个与会者。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RenameParticipantRequest 请求对象
     * @return CompletableFuture<RenameParticipantResponse>
     */
    public CompletableFuture<RenameParticipantResponse> renameParticipantAsync(RenameParticipantRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.renameParticipant);
    }

    /**
     * 重命名与会者
     *
     * 重命名某个与会者。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RenameParticipantRequest 请求对象
     * @return AsyncInvoker<RenameParticipantRequest, RenameParticipantResponse>
     */
    public AsyncInvoker<RenameParticipantRequest, RenameParticipantResponse> renameParticipantAsyncInvoker(
        RenameParticipantRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.renameParticipant, hcClient);
    }

    /**
     * 企业管理员通过sn重置激活码
     *
     * 当硬终端激活码失效时，企业管理员可以通过该接口重置激活码，使用重新获取的激活码激活终端，每24小时可重新激活5次。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetActivecodeRequest 请求对象
     * @return CompletableFuture<ResetActivecodeResponse>
     */
    public CompletableFuture<ResetActivecodeResponse> resetActivecodeAsync(ResetActivecodeRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.resetActivecode);
    }

    /**
     * 企业管理员通过sn重置激活码
     *
     * 当硬终端激活码失效时，企业管理员可以通过该接口重置激活码，使用重新获取的激活码激活终端，每24小时可重新激活5次。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetActivecodeRequest 请求对象
     * @return AsyncInvoker<ResetActivecodeRequest, ResetActivecodeResponse>
     */
    public AsyncInvoker<ResetActivecodeRequest, ResetActivecodeResponse> resetActivecodeAsyncInvoker(
        ResetActivecodeRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.resetActivecode, hcClient);
    }

    /**
     * 用户重置密码
     *
     * 该接口提供给用户重置密码功能，服务器收到请求，重新设置用户密码并返回结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPwdRequest 请求对象
     * @return CompletableFuture<ResetPwdResponse>
     */
    public CompletableFuture<ResetPwdResponse> resetPwdAsync(ResetPwdRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.resetPwd);
    }

    /**
     * 用户重置密码
     *
     * 该接口提供给用户重置密码功能，服务器收到请求，重新设置用户密码并返回结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPwdRequest 请求对象
     * @return AsyncInvoker<ResetPwdRequest, ResetPwdResponse>
     */
    public AsyncInvoker<ResetPwdRequest, ResetPwdResponse> resetPwdAsyncInvoker(ResetPwdRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.resetPwd, hcClient);
    }

    /**
     * 企业管理员重置企业成员密码
     *
     * 企业管理员通过该接口提供企业管理员重置企业成员密码的功能。当服务器收到重置密码的请求时，发送新的密码到企业成员的邮箱或者短信，并返回结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPwdByAdminRequest 请求对象
     * @return CompletableFuture<ResetPwdByAdminResponse>
     */
    public CompletableFuture<ResetPwdByAdminResponse> resetPwdByAdminAsync(ResetPwdByAdminRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.resetPwdByAdmin);
    }

    /**
     * 企业管理员重置企业成员密码
     *
     * 企业管理员通过该接口提供企业管理员重置企业成员密码的功能。当服务器收到重置密码的请求时，发送新的密码到企业成员的邮箱或者短信，并返回结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPwdByAdminRequest 请求对象
     * @return AsyncInvoker<ResetPwdByAdminRequest, ResetPwdByAdminResponse>
     */
    public AsyncInvoker<ResetPwdByAdminRequest, ResetPwdByAdminResponse> resetPwdByAdminAsyncInvoker(
        ResetPwdByAdminRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.resetPwdByAdmin, hcClient);
    }

    /**
     * 企业管理员重置帐号的激活码
     *
     * 企业管理员重置帐号的激活码，重置后，原设备直接解绑，必须重新激活使用,若手机邮箱不填，则不会发送新的激活码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetVisionActiveCodeRequest 请求对象
     * @return CompletableFuture<ResetVisionActiveCodeResponse>
     */
    public CompletableFuture<ResetVisionActiveCodeResponse> resetVisionActiveCodeAsync(
        ResetVisionActiveCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.resetVisionActiveCode);
    }

    /**
     * 企业管理员重置帐号的激活码
     *
     * 企业管理员重置帐号的激活码，重置后，原设备直接解绑，必须重新激活使用,若手机邮箱不填，则不会发送新的激活码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetVisionActiveCodeRequest 请求对象
     * @return AsyncInvoker<ResetVisionActiveCodeRequest, ResetVisionActiveCodeResponse>
     */
    public AsyncInvoker<ResetVisionActiveCodeRequest, ResetVisionActiveCodeResponse> resetVisionActiveCodeAsyncInvoker(
        ResetVisionActiveCodeRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.resetVisionActiveCode, hcClient);
    }

    /**
     * 开启/关闭同声传译
     *
     * 该接口用于会议主席可以通过该接口开启/关闭同声传译。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResumeSimultaneousInterpretationRequest 请求对象
     * @return CompletableFuture<ResumeSimultaneousInterpretationResponse>
     */
    public CompletableFuture<ResumeSimultaneousInterpretationResponse> resumeSimultaneousInterpretationAsync(
        ResumeSimultaneousInterpretationRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.resumeSimultaneousInterpretation);
    }

    /**
     * 开启/关闭同声传译
     *
     * 该接口用于会议主席可以通过该接口开启/关闭同声传译。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResumeSimultaneousInterpretationRequest 请求对象
     * @return AsyncInvoker<ResumeSimultaneousInterpretationRequest, ResumeSimultaneousInterpretationResponse>
     */
    public AsyncInvoker<ResumeSimultaneousInterpretationRequest, ResumeSimultaneousInterpretationResponse> resumeSimultaneousInterpretationAsyncInvoker(
        ResumeSimultaneousInterpretationRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.resumeSimultaneousInterpretation, hcClient);
    }

    /**
     * 点名会场
     *
     * 该接口用于点名指定与会者。点名会场的效果是除了主持人外，点名与会者为非静音状态，未点名的与会者统一为静音状态。同一时间，只允许一个与会者被点名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RollcallParticipantRequest 请求对象
     * @return CompletableFuture<RollcallParticipantResponse>
     */
    public CompletableFuture<RollcallParticipantResponse> rollcallParticipantAsync(RollcallParticipantRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.rollcallParticipant);
    }

    /**
     * 点名会场
     *
     * 该接口用于点名指定与会者。点名会场的效果是除了主持人外，点名与会者为非静音状态，未点名的与会者统一为静音状态。同一时间，只允许一个与会者被点名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RollcallParticipantRequest 请求对象
     * @return AsyncInvoker<RollcallParticipantRequest, RollcallParticipantResponse>
     */
    public AsyncInvoker<RollcallParticipantRequest, RollcallParticipantResponse> rollcallParticipantAsyncInvoker(
        RollcallParticipantRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.rollcallParticipant, hcClient);
    }

    /**
     * 保存多画面布局
     *
     * 该接口用于保存多画面布局。保存的多画面布局，只能在当前会议使用，会议结束后，保存的多画面布局就会释放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveLayoutRequest 请求对象
     * @return CompletableFuture<SaveLayoutResponse>
     */
    public CompletableFuture<SaveLayoutResponse> saveLayoutAsync(SaveLayoutRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.saveLayout);
    }

    /**
     * 保存多画面布局
     *
     * 该接口用于保存多画面布局。保存的多画面布局，只能在当前会议使用，会议结束后，保存的多画面布局就会释放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveLayoutRequest 请求对象
     * @return AsyncInvoker<SaveLayoutRequest, SaveLayoutResponse>
     */
    public AsyncInvoker<SaveLayoutRequest, SaveLayoutResponse> saveLayoutAsyncInvoker(SaveLayoutRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.saveLayout, hcClient);
    }

    /**
     * 查询历史会议的与会者记录
     *
     * 该接口用于查询指定历史会议的与会者记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchAttendanceRecordsOfHisMeetingRequest 请求对象
     * @return CompletableFuture<SearchAttendanceRecordsOfHisMeetingResponse>
     */
    public CompletableFuture<SearchAttendanceRecordsOfHisMeetingResponse> searchAttendanceRecordsOfHisMeetingAsync(
        SearchAttendanceRecordsOfHisMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchAttendanceRecordsOfHisMeeting);
    }

    /**
     * 查询历史会议的与会者记录
     *
     * 该接口用于查询指定历史会议的与会者记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchAttendanceRecordsOfHisMeetingRequest 请求对象
     * @return AsyncInvoker<SearchAttendanceRecordsOfHisMeetingRequest, SearchAttendanceRecordsOfHisMeetingResponse>
     */
    public AsyncInvoker<SearchAttendanceRecordsOfHisMeetingRequest, SearchAttendanceRecordsOfHisMeetingResponse> searchAttendanceRecordsOfHisMeetingAsyncInvoker(
        SearchAttendanceRecordsOfHisMeetingRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.searchAttendanceRecordsOfHisMeeting, hcClient);
    }

    /**
     * SP管理员分页搜索企业
     *
     * SP管理员分页搜索企业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCorpRequest 请求对象
     * @return CompletableFuture<SearchCorpResponse>
     */
    public CompletableFuture<SearchCorpResponse> searchCorpAsync(SearchCorpRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchCorp);
    }

    /**
     * SP管理员分页搜索企业
     *
     * SP管理员分页搜索企业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCorpRequest 请求对象
     * @return AsyncInvoker<SearchCorpRequest, SearchCorpResponse>
     */
    public AsyncInvoker<SearchCorpRequest, SearchCorpResponse> searchCorpAsyncInvoker(SearchCorpRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.searchCorp, hcClient);
    }

    /**
     * 分页查询企业管理员
     *
     * 通过该接口分页查询企业管理员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCorpAdminsRequest 请求对象
     * @return CompletableFuture<SearchCorpAdminsResponse>
     */
    public CompletableFuture<SearchCorpAdminsResponse> searchCorpAdminsAsync(SearchCorpAdminsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchCorpAdmins);
    }

    /**
     * 分页查询企业管理员
     *
     * 通过该接口分页查询企业管理员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCorpAdminsRequest 请求对象
     * @return AsyncInvoker<SearchCorpAdminsRequest, SearchCorpAdminsResponse>
     */
    public AsyncInvoker<SearchCorpAdminsRequest, SearchCorpAdminsResponse> searchCorpAdminsAsyncInvoker(
        SearchCorpAdminsRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.searchCorpAdmins, hcClient);
    }

    /**
     * 查询企业通讯录
     *
     * 企业用户（含管理员）通过该接口查询该企业的通讯录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCorpDirRequest 请求对象
     * @return CompletableFuture<SearchCorpDirResponse>
     */
    public CompletableFuture<SearchCorpDirResponse> searchCorpDirAsync(SearchCorpDirRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchCorpDir);
    }

    /**
     * 查询企业通讯录
     *
     * 企业用户（含管理员）通过该接口查询该企业的通讯录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCorpDirRequest 请求对象
     * @return AsyncInvoker<SearchCorpDirRequest, SearchCorpDirResponse>
     */
    public AsyncInvoker<SearchCorpDirRequest, SearchCorpDirResponse> searchCorpDirAsyncInvoker(
        SearchCorpDirRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.searchCorpDir, hcClient);
    }

    /**
     * 查询企业外部联系人
     *
     * 企业用户（含管理员）通过该接口查询该企业的外部联系人或者个人外部联系人。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCorpExternalDirRequest 请求对象
     * @return CompletableFuture<SearchCorpExternalDirResponse>
     */
    public CompletableFuture<SearchCorpExternalDirResponse> searchCorpExternalDirAsync(
        SearchCorpExternalDirRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchCorpExternalDir);
    }

    /**
     * 查询企业外部联系人
     *
     * 企业用户（含管理员）通过该接口查询该企业的外部联系人或者个人外部联系人。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCorpExternalDirRequest 请求对象
     * @return AsyncInvoker<SearchCorpExternalDirRequest, SearchCorpExternalDirResponse>
     */
    public AsyncInvoker<SearchCorpExternalDirRequest, SearchCorpExternalDirResponse> searchCorpExternalDirAsyncInvoker(
        SearchCorpExternalDirRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.searchCorpExternalDir, hcClient);
    }

    /**
     * 企业管理员分页查询企业资源订单列表
     *
     * 企业管理员根据条件查询企业资源订单列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCorpResourcesRequest 请求对象
     * @return CompletableFuture<SearchCorpResourcesResponse>
     */
    public CompletableFuture<SearchCorpResourcesResponse> searchCorpResourcesAsync(SearchCorpResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchCorpResources);
    }

    /**
     * 企业管理员分页查询企业资源订单列表
     *
     * 企业管理员根据条件查询企业资源订单列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCorpResourcesRequest 请求对象
     * @return AsyncInvoker<SearchCorpResourcesRequest, SearchCorpResourcesResponse>
     */
    public AsyncInvoker<SearchCorpResourcesRequest, SearchCorpResourcesResponse> searchCorpResourcesAsyncInvoker(
        SearchCorpResourcesRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.searchCorpResources, hcClient);
    }

    /**
     * 企业管理员分页查询企业云会议室
     *
     * 企业管理员通过该接口分页查询企业的云会议室。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCorpVmrRequest 请求对象
     * @return CompletableFuture<SearchCorpVmrResponse>
     */
    public CompletableFuture<SearchCorpVmrResponse> searchCorpVmrAsync(SearchCorpVmrRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchCorpVmr);
    }

    /**
     * 企业管理员分页查询企业云会议室
     *
     * 企业管理员通过该接口分页查询企业的云会议室。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCorpVmrRequest 请求对象
     * @return AsyncInvoker<SearchCorpVmrRequest, SearchCorpVmrResponse>
     */
    public AsyncInvoker<SearchCorpVmrRequest, SearchCorpVmrResponse> searchCorpVmrAsyncInvoker(
        SearchCorpVmrRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.searchCorpVmr, hcClient);
    }

    /**
     * 查询历史会议的会控记录
     *
     * 该接口用于查询指定历史会议的会控记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCtlRecordsOfHisMeetingRequest 请求对象
     * @return CompletableFuture<SearchCtlRecordsOfHisMeetingResponse>
     */
    public CompletableFuture<SearchCtlRecordsOfHisMeetingResponse> searchCtlRecordsOfHisMeetingAsync(
        SearchCtlRecordsOfHisMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchCtlRecordsOfHisMeeting);
    }

    /**
     * 查询历史会议的会控记录
     *
     * 该接口用于查询指定历史会议的会控记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchCtlRecordsOfHisMeetingRequest 请求对象
     * @return AsyncInvoker<SearchCtlRecordsOfHisMeetingRequest, SearchCtlRecordsOfHisMeetingResponse>
     */
    public AsyncInvoker<SearchCtlRecordsOfHisMeetingRequest, SearchCtlRecordsOfHisMeetingResponse> searchCtlRecordsOfHisMeetingAsyncInvoker(
        SearchCtlRecordsOfHisMeetingRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.searchCtlRecordsOfHisMeeting, hcClient);
    }

    /**
     * 按名称查询所有的部门
     *
     * 企业管理员通过该接口按名称查询所有的部门。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchDepartmentByNameRequest 请求对象
     * @return CompletableFuture<SearchDepartmentByNameResponse>
     */
    public CompletableFuture<SearchDepartmentByNameResponse> searchDepartmentByNameAsync(
        SearchDepartmentByNameRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchDepartmentByName);
    }

    /**
     * 按名称查询所有的部门
     *
     * 企业管理员通过该接口按名称查询所有的部门。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchDepartmentByNameRequest 请求对象
     * @return AsyncInvoker<SearchDepartmentByNameRequest, SearchDepartmentByNameResponse>
     */
    public AsyncInvoker<SearchDepartmentByNameRequest, SearchDepartmentByNameResponse> searchDepartmentByNameAsyncInvoker(
        SearchDepartmentByNameRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.searchDepartmentByName, hcClient);
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
     * @return CompletableFuture<SearchDevicesResponse>
     */
    public CompletableFuture<SearchDevicesResponse> searchDevicesAsync(SearchDevicesRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchDevices);
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
     * @return AsyncInvoker<SearchDevicesRequest, SearchDevicesResponse>
     */
    public AsyncInvoker<SearchDevicesRequest, SearchDevicesResponse> searchDevicesAsyncInvoker(
        SearchDevicesRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.searchDevices, hcClient);
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
     * @return CompletableFuture<SearchHisMeetingsResponse>
     */
    public CompletableFuture<SearchHisMeetingsResponse> searchHisMeetingsAsync(SearchHisMeetingsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchHisMeetings);
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
     * @return AsyncInvoker<SearchHisMeetingsRequest, SearchHisMeetingsResponse>
     */
    public AsyncInvoker<SearchHisMeetingsRequest, SearchHisMeetingsResponse> searchHisMeetingsAsyncInvoker(
        SearchHisMeetingsRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.searchHisMeetings, hcClient);
    }

    /**
     * 分页查询信息窗素材
     *
     * 分页查询信息窗素材。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchMaterialsRequest 请求对象
     * @return CompletableFuture<SearchMaterialsResponse>
     */
    public CompletableFuture<SearchMaterialsResponse> searchMaterialsAsync(SearchMaterialsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchMaterials);
    }

    /**
     * 分页查询信息窗素材
     *
     * 分页查询信息窗素材。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchMaterialsRequest 请求对象
     * @return AsyncInvoker<SearchMaterialsRequest, SearchMaterialsResponse>
     */
    public AsyncInvoker<SearchMaterialsRequest, SearchMaterialsResponse> searchMaterialsAsyncInvoker(
        SearchMaterialsRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.searchMaterials, hcClient);
    }

    /**
     * 查询会议纪要列表
     *
     * 用户查询自己的会议纪要列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchMeetingFileListRequest 请求对象
     * @return CompletableFuture<SearchMeetingFileListResponse>
     */
    public CompletableFuture<SearchMeetingFileListResponse> searchMeetingFileListAsync(
        SearchMeetingFileListRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchMeetingFileList);
    }

    /**
     * 查询会议纪要列表
     *
     * 用户查询自己的会议纪要列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchMeetingFileListRequest 请求对象
     * @return AsyncInvoker<SearchMeetingFileListRequest, SearchMeetingFileListResponse>
     */
    public AsyncInvoker<SearchMeetingFileListRequest, SearchMeetingFileListResponse> searchMeetingFileListAsyncInvoker(
        SearchMeetingFileListRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.searchMeetingFileList, hcClient);
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
     * @return CompletableFuture<SearchMeetingsResponse>
     */
    public CompletableFuture<SearchMeetingsResponse> searchMeetingsAsync(SearchMeetingsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchMeetings);
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
     * @return AsyncInvoker<SearchMeetingsRequest, SearchMeetingsResponse>
     */
    public AsyncInvoker<SearchMeetingsRequest, SearchMeetingsResponse> searchMeetingsAsyncInvoker(
        SearchMeetingsRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.searchMeetings, hcClient);
    }

    /**
     * 普通用户分页查询云会议室及个人会议ID
     *
     * 企业用户通过该接口查询个人已分配的云会议室及个人会议ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchMemberVmrRequest 请求对象
     * @return CompletableFuture<SearchMemberVmrResponse>
     */
    public CompletableFuture<SearchMemberVmrResponse> searchMemberVmrAsync(SearchMemberVmrRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchMemberVmr);
    }

    /**
     * 普通用户分页查询云会议室及个人会议ID
     *
     * 企业用户通过该接口查询个人已分配的云会议室及个人会议ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchMemberVmrRequest 请求对象
     * @return AsyncInvoker<SearchMemberVmrRequest, SearchMemberVmrResponse>
     */
    public AsyncInvoker<SearchMemberVmrRequest, SearchMemberVmrResponse> searchMemberVmrAsyncInvoker(
        SearchMemberVmrRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.searchMemberVmr, hcClient);
    }

    /**
     * 查询在线会议列表
     *
     * 该接口用于查询正在召开的会议列表。管理员可以查询本企业内所有在线会议，普通用户仅能查询当前自己帐号创建或者需要参加的在线会议。不带查询参数时，默认查询权限范围内的在线会议，按开始时间升序排列。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchOnlineMeetingsRequest 请求对象
     * @return CompletableFuture<SearchOnlineMeetingsResponse>
     */
    public CompletableFuture<SearchOnlineMeetingsResponse> searchOnlineMeetingsAsync(
        SearchOnlineMeetingsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchOnlineMeetings);
    }

    /**
     * 查询在线会议列表
     *
     * 该接口用于查询正在召开的会议列表。管理员可以查询本企业内所有在线会议，普通用户仅能查询当前自己帐号创建或者需要参加的在线会议。不带查询参数时，默认查询权限范围内的在线会议，按开始时间升序排列。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchOnlineMeetingsRequest 请求对象
     * @return AsyncInvoker<SearchOnlineMeetingsRequest, SearchOnlineMeetingsResponse>
     */
    public AsyncInvoker<SearchOnlineMeetingsRequest, SearchOnlineMeetingsResponse> searchOnlineMeetingsAsyncInvoker(
        SearchOnlineMeetingsRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.searchOnlineMeetings, hcClient);
    }

    /**
     * 查询信息窗节目
     *
     * 获取信息窗节目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchProgramsRequest 请求对象
     * @return CompletableFuture<SearchProgramsResponse>
     */
    public CompletableFuture<SearchProgramsResponse> searchProgramsAsync(SearchProgramsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchPrograms);
    }

    /**
     * 查询信息窗节目
     *
     * 获取信息窗节目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchProgramsRequest 请求对象
     * @return AsyncInvoker<SearchProgramsRequest, SearchProgramsResponse>
     */
    public AsyncInvoker<SearchProgramsRequest, SearchProgramsResponse> searchProgramsAsyncInvoker(
        SearchProgramsRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.searchPrograms, hcClient);
    }

    /**
     * 查询信息窗发布
     *
     * 获取信息窗发布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchPublicationsRequest 请求对象
     * @return CompletableFuture<SearchPublicationsResponse>
     */
    public CompletableFuture<SearchPublicationsResponse> searchPublicationsAsync(SearchPublicationsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchPublications);
    }

    /**
     * 查询信息窗发布
     *
     * 获取信息窗发布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchPublicationsRequest 请求对象
     * @return AsyncInvoker<SearchPublicationsRequest, SearchPublicationsResponse>
     */
    public AsyncInvoker<SearchPublicationsRequest, SearchPublicationsResponse> searchPublicationsAsyncInvoker(
        SearchPublicationsRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.searchPublications, hcClient);
    }

    /**
     * 查询录制列表
     *
     * 该接口用于查询会议录制列表。管理员可以查询本企业内所有的录制，普通用户仅能查询自己创建的会议的录制。不带查询参数时，默认查询权限范围内的录制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchRecordingsRequest 请求对象
     * @return CompletableFuture<SearchRecordingsResponse>
     */
    public CompletableFuture<SearchRecordingsResponse> searchRecordingsAsync(SearchRecordingsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchRecordings);
    }

    /**
     * 查询录制列表
     *
     * 该接口用于查询会议录制列表。管理员可以查询本企业内所有的录制，普通用户仅能查询自己创建的会议的录制。不带查询参数时，默认查询权限范围内的录制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchRecordingsRequest 请求对象
     * @return AsyncInvoker<SearchRecordingsRequest, SearchRecordingsResponse>
     */
    public AsyncInvoker<SearchRecordingsRequest, SearchRecordingsResponse> searchRecordingsAsyncInvoker(
        SearchRecordingsRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.searchRecordings, hcClient);
    }

    /**
     * SP管理员根据分页查询企业资源
     *
     * SP根据条件查询企业的资源项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchResourceRequest 请求对象
     * @return CompletableFuture<SearchResourceResponse>
     */
    public CompletableFuture<SearchResourceResponse> searchResourceAsync(SearchResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchResource);
    }

    /**
     * SP管理员根据分页查询企业资源
     *
     * SP根据条件查询企业的资源项。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchResourceRequest 请求对象
     * @return AsyncInvoker<SearchResourceRequest, SearchResourceResponse>
     */
    public AsyncInvoker<SearchResourceRequest, SearchResourceResponse> searchResourceAsyncInvoker(
        SearchResourceRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.searchResource, hcClient);
    }

    /**
     * SP管理员分页查询企业资源操作记录
     *
     * SP根据根据条件查询企业的资源操作记录，支持根据resourceId模糊搜索。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchResourceOpRecordRequest 请求对象
     * @return CompletableFuture<SearchResourceOpRecordResponse>
     */
    public CompletableFuture<SearchResourceOpRecordResponse> searchResourceOpRecordAsync(
        SearchResourceOpRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchResourceOpRecord);
    }

    /**
     * SP管理员分页查询企业资源操作记录
     *
     * SP根据根据条件查询企业的资源操作记录，支持根据resourceId模糊搜索。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchResourceOpRecordRequest 请求对象
     * @return AsyncInvoker<SearchResourceOpRecordRequest, SearchResourceOpRecordResponse>
     */
    public AsyncInvoker<SearchResourceOpRecordRequest, SearchResourceOpRecordResponse> searchResourceOpRecordAsyncInvoker(
        SearchResourceOpRecordRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.searchResourceOpRecord, hcClient);
    }

    /**
     * 分页查询用户
     *
     * 企业管理员通过该接口分页查询企业用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchUsersRequest 请求对象
     * @return CompletableFuture<SearchUsersResponse>
     */
    public CompletableFuture<SearchUsersResponse> searchUsersAsync(SearchUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchUsers);
    }

    /**
     * 分页查询用户
     *
     * 企业管理员通过该接口分页查询企业用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchUsersRequest 请求对象
     * @return AsyncInvoker<SearchUsersRequest, SearchUsersResponse>
     */
    public AsyncInvoker<SearchUsersRequest, SearchUsersResponse> searchUsersAsyncInvoker(SearchUsersRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.searchUsers, hcClient);
    }

    /**
     * 企业管理员分页查询激活码
     *
     * 企业管理员分页查询激活码，支持激活码、终端名称模糊查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchVisionActiveCodeRequest 请求对象
     * @return CompletableFuture<SearchVisionActiveCodeResponse>
     */
    public CompletableFuture<SearchVisionActiveCodeResponse> searchVisionActiveCodeAsync(
        SearchVisionActiveCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchVisionActiveCode);
    }

    /**
     * 企业管理员分页查询激活码
     *
     * 企业管理员分页查询激活码，支持激活码、终端名称模糊查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchVisionActiveCodeRequest 请求对象
     * @return AsyncInvoker<SearchVisionActiveCodeRequest, SearchVisionActiveCodeResponse>
     */
    public AsyncInvoker<SearchVisionActiveCodeRequest, SearchVisionActiveCodeResponse> searchVisionActiveCodeAsyncInvoker(
        SearchVisionActiveCodeRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.searchVisionActiveCode, hcClient);
    }

    /**
     * 发送滑块验证码
     *
     * 该接口提供发送滑块验证码。服务器收到请求，返回抠图以及抠图后的原图等结果。需要在前台界面显示出抠图以及抠图后的原图，用户通过滑块操作来匹配图形。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendSlideVerifyCodeRequest 请求对象
     * @return CompletableFuture<SendSlideVerifyCodeResponse>
     */
    public CompletableFuture<SendSlideVerifyCodeResponse> sendSlideVerifyCodeAsync(SendSlideVerifyCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.sendSlideVerifyCode);
    }

    /**
     * 发送滑块验证码
     *
     * 该接口提供发送滑块验证码。服务器收到请求，返回抠图以及抠图后的原图等结果。需要在前台界面显示出抠图以及抠图后的原图，用户通过滑块操作来匹配图形。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendSlideVerifyCodeRequest 请求对象
     * @return AsyncInvoker<SendSlideVerifyCodeRequest, SendSlideVerifyCodeResponse>
     */
    public AsyncInvoker<SendSlideVerifyCodeRequest, SendSlideVerifyCodeResponse> sendSlideVerifyCodeAsyncInvoker(
        SendSlideVerifyCodeRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.sendSlideVerifyCode, hcClient);
    }

    /**
     * 发送验证码
     *
     * 该接口提供发送验证码，服务器收到请求，发送验证码到邮箱或者短信并返回结果。用户在前台界面通过滑块验证后，再进行发送验证码操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendVeriCodeForChangePwdRequest 请求对象
     * @return CompletableFuture<SendVeriCodeForChangePwdResponse>
     */
    public CompletableFuture<SendVeriCodeForChangePwdResponse> sendVeriCodeForChangePwdAsync(
        SendVeriCodeForChangePwdRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.sendVeriCodeForChangePwd);
    }

    /**
     * 发送验证码
     *
     * 该接口提供发送验证码，服务器收到请求，发送验证码到邮箱或者短信并返回结果。用户在前台界面通过滑块验证后，再进行发送验证码操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendVeriCodeForChangePwdRequest 请求对象
     * @return AsyncInvoker<SendVeriCodeForChangePwdRequest, SendVeriCodeForChangePwdResponse>
     */
    public AsyncInvoker<SendVeriCodeForChangePwdRequest, SendVeriCodeForChangePwdResponse> sendVeriCodeForChangePwdAsyncInvoker(
        SendVeriCodeForChangePwdRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.sendVeriCodeForChangePwd, hcClient);
    }

    /**
     * 获取验证码
     *
     * 修改用户手机或邮箱时，需要获取验证码。企业用户通过该接口获取验证码，系统会向用户的手机或邮箱发送，验证码1分钟内有效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendVeriCodeForUpdateUserInfoRequest 请求对象
     * @return CompletableFuture<SendVeriCodeForUpdateUserInfoResponse>
     */
    public CompletableFuture<SendVeriCodeForUpdateUserInfoResponse> sendVeriCodeForUpdateUserInfoAsync(
        SendVeriCodeForUpdateUserInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.sendVeriCodeForUpdateUserInfo);
    }

    /**
     * 获取验证码
     *
     * 修改用户手机或邮箱时，需要获取验证码。企业用户通过该接口获取验证码，系统会向用户的手机或邮箱发送，验证码1分钟内有效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendVeriCodeForUpdateUserInfoRequest 请求对象
     * @return AsyncInvoker<SendVeriCodeForUpdateUserInfoRequest, SendVeriCodeForUpdateUserInfoResponse>
     */
    public AsyncInvoker<SendVeriCodeForUpdateUserInfoRequest, SendVeriCodeForUpdateUserInfoResponse> sendVeriCodeForUpdateUserInfoAsyncInvoker(
        SendVeriCodeForUpdateUserInfoRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.sendVeriCodeForUpdateUserInfo, hcClient);
    }

    /**
     * 设置普通与会人的语言频道
     *
     * 主持人通过该接口设置某些普通与会者(包括主持人)加入哪个语言频道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAttendeeLanChannelRequest 请求对象
     * @return CompletableFuture<SetAttendeeLanChannelResponse>
     */
    public CompletableFuture<SetAttendeeLanChannelResponse> setAttendeeLanChannelAsync(
        SetAttendeeLanChannelRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.setAttendeeLanChannel);
    }

    /**
     * 设置普通与会人的语言频道
     *
     * 主持人通过该接口设置某些普通与会者(包括主持人)加入哪个语言频道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAttendeeLanChannelRequest 请求对象
     * @return AsyncInvoker<SetAttendeeLanChannelRequest, SetAttendeeLanChannelResponse>
     */
    public AsyncInvoker<SetAttendeeLanChannelRequest, SetAttendeeLanChannelResponse> setAttendeeLanChannelAsyncInvoker(
        SetAttendeeLanChannelRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.setAttendeeLanChannel, hcClient);
    }

    /**
     * 申请联席主持人
     *
     * 该接口用于设置联席主持人或释放联席主持人。只能将来宾设置为联席主持人。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetCohostRequest 请求对象
     * @return CompletableFuture<SetCohostResponse>
     */
    public CompletableFuture<SetCohostResponse> setCohostAsync(SetCohostRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.setCohost);
    }

    /**
     * 申请联席主持人
     *
     * 该接口用于设置联席主持人或释放联席主持人。只能将来宾设置为联席主持人。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetCohostRequest 请求对象
     * @return AsyncInvoker<SetCohostRequest, SetCohostResponse>
     */
    public AsyncInvoker<SetCohostRequest, SetCohostResponse> setCohostAsyncInvoker(SetCohostRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.setCohost, hcClient);
    }

    /**
     * 设置自定义多画面
     *
     * 该接口用于设置会中多画面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetCustomMultiPictureRequest 请求对象
     * @return CompletableFuture<SetCustomMultiPictureResponse>
     */
    public CompletableFuture<SetCustomMultiPictureResponse> setCustomMultiPictureAsync(
        SetCustomMultiPictureRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.setCustomMultiPicture);
    }

    /**
     * 设置自定义多画面
     *
     * 该接口用于设置会中多画面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetCustomMultiPictureRequest 请求对象
     * @return AsyncInvoker<SetCustomMultiPictureRequest, SetCustomMultiPictureResponse>
     */
    public AsyncInvoker<SetCustomMultiPictureRequest, SetCustomMultiPictureResponse> setCustomMultiPictureAsyncInvoker(
        SetCustomMultiPictureRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.setCustomMultiPicture, hcClient);
    }

    /**
     * 主持人选看
     *
     * 该接口用于主持人轮询、主持人选看多画面、主持人选看会场操作。只适用于专业会议终端（如TE系列等）为主持人的场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetHostViewRequest 请求对象
     * @return CompletableFuture<SetHostViewResponse>
     */
    public CompletableFuture<SetHostViewResponse> setHostViewAsync(SetHostViewRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.setHostView);
    }

    /**
     * 主持人选看
     *
     * 该接口用于主持人轮询、主持人选看多画面、主持人选看会场操作。只适用于专业会议终端（如TE系列等）为主持人的场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetHostViewRequest 请求对象
     * @return AsyncInvoker<SetHostViewRequest, SetHostViewResponse>
     */
    public AsyncInvoker<SetHostViewRequest, SetHostViewResponse> setHostViewAsyncInvoker(SetHostViewRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.setHostView, hcClient);
    }

    /**
     * 设置传译组
     *
     * 主持人通过该接口设置传译组，每个传译组支持两种语言，传译组内支持多个传译员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetInterpreterGroupRequest 请求对象
     * @return CompletableFuture<SetInterpreterGroupResponse>
     */
    public CompletableFuture<SetInterpreterGroupResponse> setInterpreterGroupAsync(SetInterpreterGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.setInterpreterGroup);
    }

    /**
     * 设置传译组
     *
     * 主持人通过该接口设置传译组，每个传译组支持两种语言，传译组内支持多个传译员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetInterpreterGroupRequest 请求对象
     * @return AsyncInvoker<SetInterpreterGroupRequest, SetInterpreterGroupResponse>
     */
    public AsyncInvoker<SetInterpreterGroupRequest, SetInterpreterGroupResponse> setInterpreterGroupAsyncInvoker(
        SetInterpreterGroupRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.setInterpreterGroup, hcClient);
    }

    /**
     * 设置多画面
     *
     * 设置会议多画面。该接口废弃不用，请使用“[[设置自定义多画面](https://support.huaweicloud.com/api-meeting/meeting_21_0418.html)](tag:hws)[[设置自定义多画面](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_0418.html)](tag:hk)”接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetMultiPictureRequest 请求对象
     * @return CompletableFuture<SetMultiPictureResponse>
     */
    public CompletableFuture<SetMultiPictureResponse> setMultiPictureAsync(SetMultiPictureRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.setMultiPicture);
    }

    /**
     * 设置多画面
     *
     * 设置会议多画面。该接口废弃不用，请使用“[[设置自定义多画面](https://support.huaweicloud.com/api-meeting/meeting_21_0418.html)](tag:hws)[[设置自定义多画面](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_0418.html)](tag:hk)”接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetMultiPictureRequest 请求对象
     * @return AsyncInvoker<SetMultiPictureRequest, SetMultiPictureResponse>
     */
    public AsyncInvoker<SetMultiPictureRequest, SetMultiPictureResponse> setMultiPictureAsyncInvoker(
        SetMultiPictureRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.setMultiPicture, hcClient);
    }

    /**
     * 会场选看
     *
     * 该接口用于专业会议终端（如TE系列等）选看其他与会者。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetParticipantViewRequest 请求对象
     * @return CompletableFuture<SetParticipantViewResponse>
     */
    public CompletableFuture<SetParticipantViewResponse> setParticipantViewAsync(SetParticipantViewRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.setParticipantView);
    }

    /**
     * 会场选看
     *
     * 该接口用于专业会议终端（如TE系列等）选看其他与会者。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetParticipantViewRequest 请求对象
     * @return AsyncInvoker<SetParticipantViewRequest, SetParticipantViewResponse>
     */
    public AsyncInvoker<SetParticipantViewRequest, SetParticipantViewResponse> setParticipantViewAsyncInvoker(
        SetParticipantViewRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.setParticipantView, hcClient);
    }

    /**
     * 用户设置头像
     *
     * 用户设置头像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetProfileImageRequest 请求对象
     * @return CompletableFuture<SetProfileImageResponse>
     */
    public CompletableFuture<SetProfileImageResponse> setProfileImageAsync(SetProfileImageRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.setProfileImage);
    }

    /**
     * 用户设置头像
     *
     * 用户设置头像
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetProfileImageRequest 请求对象
     * @return AsyncInvoker<SetProfileImageRequest, SetProfileImageResponse>
     */
    public AsyncInvoker<SetProfileImageRequest, SetProfileImageResponse> setProfileImageAsyncInvoker(
        SetProfileImageRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.setProfileImage, hcClient);
    }

    /**
     * 申请主持人
     *
     * 该接口用于设置主持人或释放主持人。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRoleRequest 请求对象
     * @return CompletableFuture<SetRoleResponse>
     */
    public CompletableFuture<SetRoleResponse> setRoleAsync(SetRoleRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.setRole);
    }

    /**
     * 申请主持人
     *
     * 该接口用于设置主持人或释放主持人。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRoleRequest 请求对象
     * @return AsyncInvoker<SetRoleRequest, SetRoleResponse>
     */
    public AsyncInvoker<SetRoleRequest, SetRoleResponse> setRoleAsyncInvoker(SetRoleRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.setRole, hcClient);
    }

    /**
     * 设置SSO登录配置
     *
     * 该接口用于设置SSO登录的鉴权配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetSsoConfigRequest 请求对象
     * @return CompletableFuture<SetSsoConfigResponse>
     */
    public CompletableFuture<SetSsoConfigResponse> setSsoConfigAsync(SetSsoConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.setSsoConfig);
    }

    /**
     * 设置SSO登录配置
     *
     * 该接口用于设置SSO登录的鉴权配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetSsoConfigRequest 请求对象
     * @return AsyncInvoker<SetSsoConfigRequest, SetSsoConfigResponse>
     */
    public AsyncInvoker<SetSsoConfigRequest, SetSsoConfigResponse> setSsoConfigAsyncInvoker(
        SetSsoConfigRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.setSsoConfig, hcClient);
    }

    /**
     * 企业管理员设置企业成员头像
     *
     * 为企业内的用户设置头像（只允许管理员调用）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetUserProfileImageRequest 请求对象
     * @return CompletableFuture<SetUserProfileImageResponse>
     */
    public CompletableFuture<SetUserProfileImageResponse> setUserProfileImageAsync(SetUserProfileImageRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.setUserProfileImage);
    }

    /**
     * 企业管理员设置企业成员头像
     *
     * 为企业内的用户设置头像（只允许管理员调用）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetUserProfileImageRequest 请求对象
     * @return AsyncInvoker<SetUserProfileImageRequest, SetUserProfileImageResponse>
     */
    public AsyncInvoker<SetUserProfileImageRequest, SetUserProfileImageResponse> setUserProfileImageAsyncInvoker(
        SetUserProfileImageRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.setUserProfileImage, hcClient);
    }

    /**
     * 设置事件推送
     *
     * 该接口用于管理员设置企业级会议事件订阅配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetWebHookConfigRequest 请求对象
     * @return CompletableFuture<SetWebHookConfigResponse>
     */
    public CompletableFuture<SetWebHookConfigResponse> setWebHookConfigAsync(SetWebHookConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.setWebHookConfig);
    }

    /**
     * 设置事件推送
     *
     * 该接口用于管理员设置企业级会议事件订阅配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetWebHookConfigRequest 请求对象
     * @return AsyncInvoker<SetWebHookConfigRequest, SetWebHookConfigResponse>
     */
    public AsyncInvoker<SetWebHookConfigRequest, SetWebHookConfigResponse> setWebHookConfigAsyncInvoker(
        SetWebHookConfigRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.setWebHookConfig, hcClient);
    }

    /**
     * SP管理员查询会议归属企业
     *
     * SP管理员根据会议ID查询该会议归属的企业ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfOrgRequest 请求对象
     * @return CompletableFuture<ShowConfOrgResponse>
     */
    public CompletableFuture<ShowConfOrgResponse> showConfOrgAsync(ShowConfOrgRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showConfOrg);
    }

    /**
     * SP管理员查询会议归属企业
     *
     * SP管理员根据会议ID查询该会议归属的企业ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfOrgRequest 请求对象
     * @return AsyncInvoker<ShowConfOrgRequest, ShowConfOrgResponse>
     */
    public AsyncInvoker<ShowConfOrgRequest, ShowConfOrgResponse> showConfOrgAsyncInvoker(ShowConfOrgRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.showConfOrg, hcClient);
    }

    /**
     * SP管理员查询企业
     *
     * 获取企业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCorpRequest 请求对象
     * @return CompletableFuture<ShowCorpResponse>
     */
    public CompletableFuture<ShowCorpResponse> showCorpAsync(ShowCorpRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showCorp);
    }

    /**
     * SP管理员查询企业
     *
     * 获取企业。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCorpRequest 请求对象
     * @return AsyncInvoker<ShowCorpRequest, ShowCorpResponse>
     */
    public AsyncInvoker<ShowCorpRequest, ShowCorpResponse> showCorpAsyncInvoker(ShowCorpRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.showCorp, hcClient);
    }

    /**
     * 查询企业管理员
     *
     * 通过该接口查询企业管理员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCorpAdminRequest 请求对象
     * @return CompletableFuture<ShowCorpAdminResponse>
     */
    public CompletableFuture<ShowCorpAdminResponse> showCorpAdminAsync(ShowCorpAdminRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showCorpAdmin);
    }

    /**
     * 查询企业管理员
     *
     * 通过该接口查询企业管理员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCorpAdminRequest 请求对象
     * @return AsyncInvoker<ShowCorpAdminRequest, ShowCorpAdminResponse>
     */
    public AsyncInvoker<ShowCorpAdminRequest, ShowCorpAdminResponse> showCorpAdminAsyncInvoker(
        ShowCorpAdminRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.showCorpAdmin, hcClient);
    }

    /**
     * 企业管理员查询企业注册信息
     *
     * 企业管理员通过该接口查询企业注册信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCorpBasicInfoRequest 请求对象
     * @return CompletableFuture<ShowCorpBasicInfoResponse>
     */
    public CompletableFuture<ShowCorpBasicInfoResponse> showCorpBasicInfoAsync(ShowCorpBasicInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showCorpBasicInfo);
    }

    /**
     * 企业管理员查询企业注册信息
     *
     * 企业管理员通过该接口查询企业注册信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCorpBasicInfoRequest 请求对象
     * @return AsyncInvoker<ShowCorpBasicInfoRequest, ShowCorpBasicInfoResponse>
     */
    public AsyncInvoker<ShowCorpBasicInfoRequest, ShowCorpBasicInfoResponse> showCorpBasicInfoAsyncInvoker(
        ShowCorpBasicInfoRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.showCorpBasicInfo, hcClient);
    }

    /**
     * 企业管理员查询企业内资源及业务权限
     *
     * 企业管理员通过该接口查询企业内资源及业务权限，包括查询已使用的资源情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCorpResourceRequest 请求对象
     * @return CompletableFuture<ShowCorpResourceResponse>
     */
    public CompletableFuture<ShowCorpResourceResponse> showCorpResourceAsync(ShowCorpResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showCorpResource);
    }

    /**
     * 企业管理员查询企业内资源及业务权限
     *
     * 企业管理员通过该接口查询企业内资源及业务权限，包括查询已使用的资源情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCorpResourceRequest 请求对象
     * @return AsyncInvoker<ShowCorpResourceRequest, ShowCorpResourceResponse>
     */
    public AsyncInvoker<ShowCorpResourceRequest, ShowCorpResourceResponse> showCorpResourceAsyncInvoker(
        ShowCorpResourceRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.showCorpResource, hcClient);
    }

    /**
     * 通过部门编码查询部门信息
     *
     * 通过部门编码查询部门信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDepartmentRequest 请求对象
     * @return CompletableFuture<ShowDepartmentResponse>
     */
    public CompletableFuture<ShowDepartmentResponse> showDepartmentAsync(ShowDepartmentRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showDepartment);
    }

    /**
     * 通过部门编码查询部门信息
     *
     * 通过部门编码查询部门信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDepartmentRequest 请求对象
     * @return AsyncInvoker<ShowDepartmentRequest, ShowDepartmentResponse>
     */
    public AsyncInvoker<ShowDepartmentRequest, ShowDepartmentResponse> showDepartmentAsyncInvoker(
        ShowDepartmentRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.showDepartment, hcClient);
    }

    /**
     * 查询部门及其一级子部门列表
     *
     * 企业管理员通过该接口查询部门及其一级子部门列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeptAndChildDeptRequest 请求对象
     * @return CompletableFuture<ShowDeptAndChildDeptResponse>
     */
    public CompletableFuture<ShowDeptAndChildDeptResponse> showDeptAndChildDeptAsync(
        ShowDeptAndChildDeptRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showDeptAndChildDept);
    }

    /**
     * 查询部门及其一级子部门列表
     *
     * 企业管理员通过该接口查询部门及其一级子部门列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeptAndChildDeptRequest 请求对象
     * @return AsyncInvoker<ShowDeptAndChildDeptRequest, ShowDeptAndChildDeptResponse>
     */
    public AsyncInvoker<ShowDeptAndChildDeptRequest, ShowDeptAndChildDeptResponse> showDeptAndChildDeptAsyncInvoker(
        ShowDeptAndChildDeptRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.showDeptAndChildDept, hcClient);
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
     * @return CompletableFuture<ShowDeviceDetailResponse>
     */
    public CompletableFuture<ShowDeviceDetailResponse> showDeviceDetailAsync(ShowDeviceDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showDeviceDetail);
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
     * @return AsyncInvoker<ShowDeviceDetailRequest, ShowDeviceDetailResponse>
     */
    public AsyncInvoker<ShowDeviceDetailRequest, ShowDeviceDetailResponse> showDeviceDetailAsyncInvoker(
        ShowDeviceDetailRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.showDeviceDetail, hcClient);
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
     * @return CompletableFuture<ShowDeviceStatusResponse>
     */
    public CompletableFuture<ShowDeviceStatusResponse> showDeviceStatusAsync(ShowDeviceStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showDeviceStatus);
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
     * @return AsyncInvoker<ShowDeviceStatusRequest, ShowDeviceStatusResponse>
     */
    public AsyncInvoker<ShowDeviceStatusRequest, ShowDeviceStatusResponse> showDeviceStatusAsyncInvoker(
        ShowDeviceStatusRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.showDeviceStatus, hcClient);
    }

    /**
     * 获取所有终端类型
     *
     * 企业管理员通过该接口获取所有的专业会议终端类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeviceTypesRequest 请求对象
     * @return CompletableFuture<ShowDeviceTypesResponse>
     */
    public CompletableFuture<ShowDeviceTypesResponse> showDeviceTypesAsync(ShowDeviceTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showDeviceTypes);
    }

    /**
     * 获取所有终端类型
     *
     * 企业管理员通过该接口获取所有的专业会议终端类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeviceTypesRequest 请求对象
     * @return AsyncInvoker<ShowDeviceTypesRequest, ShowDeviceTypesResponse>
     */
    public AsyncInvoker<ShowDeviceTypesRequest, ShowDeviceTypesResponse> showDeviceTypesAsyncInvoker(
        ShowDeviceTypesRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.showDeviceTypes, hcClient);
    }

    /**
     * 查询历史会议详情
     *
     * 该接口用户查询指定历史会议的详情。管理员可以查询本企业内所有的历史会议详情，普通用户仅能查询自己创建或者被邀请的历史会议详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHisMeetingDetailRequest 请求对象
     * @return CompletableFuture<ShowHisMeetingDetailResponse>
     */
    public CompletableFuture<ShowHisMeetingDetailResponse> showHisMeetingDetailAsync(
        ShowHisMeetingDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showHisMeetingDetail);
    }

    /**
     * 查询历史会议详情
     *
     * 该接口用户查询指定历史会议的详情。管理员可以查询本企业内所有的历史会议详情，普通用户仅能查询自己创建或者被邀请的历史会议详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHisMeetingDetailRequest 请求对象
     * @return AsyncInvoker<ShowHisMeetingDetailRequest, ShowHisMeetingDetailResponse>
     */
    public AsyncInvoker<ShowHisMeetingDetailRequest, ShowHisMeetingDetailResponse> showHisMeetingDetailAsyncInvoker(
        ShowHisMeetingDetailRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.showHisMeetingDetail, hcClient);
    }

    /**
     * 查询多画面布局
     *
     * 该接口用于查询当前会议已保存的多画面布局。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLayoutRequest 请求对象
     * @return CompletableFuture<ShowLayoutResponse>
     */
    public CompletableFuture<ShowLayoutResponse> showLayoutAsync(ShowLayoutRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showLayout);
    }

    /**
     * 查询多画面布局
     *
     * 该接口用于查询当前会议已保存的多画面布局。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLayoutRequest 请求对象
     * @return AsyncInvoker<ShowLayoutRequest, ShowLayoutResponse>
     */
    public AsyncInvoker<ShowLayoutRequest, ShowLayoutResponse> showLayoutAsyncInvoker(ShowLayoutRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.showLayout, hcClient);
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
     * @return CompletableFuture<ShowMeetingDetailResponse>
     */
    public CompletableFuture<ShowMeetingDetailResponse> showMeetingDetailAsync(ShowMeetingDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showMeetingDetail);
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
     * @return AsyncInvoker<ShowMeetingDetailRequest, ShowMeetingDetailResponse>
     */
    public AsyncInvoker<ShowMeetingDetailRequest, ShowMeetingDetailResponse> showMeetingDetailAsyncInvoker(
        ShowMeetingDetailRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.showMeetingDetail, hcClient);
    }

    /**
     * 查询会议纪要详情
     *
     * 用户查询单个会议纪要详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMeetingFileRequest 请求对象
     * @return CompletableFuture<ShowMeetingFileResponse>
     */
    public CompletableFuture<ShowMeetingFileResponse> showMeetingFileAsync(ShowMeetingFileRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showMeetingFile);
    }

    /**
     * 查询会议纪要详情
     *
     * 用户查询单个会议纪要详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMeetingFileRequest 请求对象
     * @return AsyncInvoker<ShowMeetingFileRequest, ShowMeetingFileResponse>
     */
    public AsyncInvoker<ShowMeetingFileRequest, ShowMeetingFileResponse> showMeetingFileAsyncInvoker(
        ShowMeetingFileRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.showMeetingFile, hcClient);
    }

    /**
     * 打开会议纪要文件列表
     *
     * 用户使用手机扫码后，手机端请求服务端,让服务端通知指定IdeaHub打开指定用户的会议纪要文件列表。二维码内容 ：cloudlink://cloudlink.huawei.com/h5page?action&#x3D;OPEN_MEETING_FILE_LIST&amp;key1&#x3D;value1&amp;key2&#x3D;value2 。key/value的个数可能变化，终端解析后，在发起后续请求时，将所有key/value存为map，作为入参即可。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMeetingFileListRequest 请求对象
     * @return CompletableFuture<ShowMeetingFileListResponse>
     */
    public CompletableFuture<ShowMeetingFileListResponse> showMeetingFileListAsync(ShowMeetingFileListRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showMeetingFileList);
    }

    /**
     * 打开会议纪要文件列表
     *
     * 用户使用手机扫码后，手机端请求服务端,让服务端通知指定IdeaHub打开指定用户的会议纪要文件列表。二维码内容 ：cloudlink://cloudlink.huawei.com/h5page?action&#x3D;OPEN_MEETING_FILE_LIST&amp;key1&#x3D;value1&amp;key2&#x3D;value2 。key/value的个数可能变化，终端解析后，在发起后续请求时，将所有key/value存为map，作为入参即可。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMeetingFileListRequest 请求对象
     * @return AsyncInvoker<ShowMeetingFileListRequest, ShowMeetingFileListResponse>
     */
    public AsyncInvoker<ShowMeetingFileListRequest, ShowMeetingFileListResponse> showMeetingFileListAsyncInvoker(
        ShowMeetingFileListRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.showMeetingFileList, hcClient);
    }

    /**
     * 用户查询自己的信息
     *
     * 企业用户通过该接口查询自己的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMyInfoRequest 请求对象
     * @return CompletableFuture<ShowMyInfoResponse>
     */
    public CompletableFuture<ShowMyInfoResponse> showMyInfoAsync(ShowMyInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showMyInfo);
    }

    /**
     * 用户查询自己的信息
     *
     * 企业用户通过该接口查询自己的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMyInfoRequest 请求对象
     * @return AsyncInvoker<ShowMyInfoRequest, ShowMyInfoResponse>
     */
    public AsyncInvoker<ShowMyInfoRequest, ShowMyInfoResponse> showMyInfoAsyncInvoker(ShowMyInfoRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.showMyInfo, hcClient);
    }

    /**
     * 查询在线会议详情
     *
     * 该接口用于查询正在召开的会议详情。管理员可以查询本企业内所有的在线会议详情，普通用户仅能查询自己帐号创建或者需要参加的在线会议详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOnlineMeetingDetailRequest 请求对象
     * @return CompletableFuture<ShowOnlineMeetingDetailResponse>
     */
    public CompletableFuture<ShowOnlineMeetingDetailResponse> showOnlineMeetingDetailAsync(
        ShowOnlineMeetingDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showOnlineMeetingDetail);
    }

    /**
     * 查询在线会议详情
     *
     * 该接口用于查询正在召开的会议详情。管理员可以查询本企业内所有的在线会议详情，普通用户仅能查询自己帐号创建或者需要参加的在线会议详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOnlineMeetingDetailRequest 请求对象
     * @return AsyncInvoker<ShowOnlineMeetingDetailRequest, ShowOnlineMeetingDetailResponse>
     */
    public AsyncInvoker<ShowOnlineMeetingDetailRequest, ShowOnlineMeetingDetailResponse> showOnlineMeetingDetailAsyncInvoker(
        ShowOnlineMeetingDetailRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.showOnlineMeetingDetail, hcClient);
    }

    /**
     * 企业管理员查询企业资源使用信息
     *
     * 企业管理员查询所属企业的资源使用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrgResRequest 请求对象
     * @return CompletableFuture<ShowOrgResResponse>
     */
    public CompletableFuture<ShowOrgResResponse> showOrgResAsync(ShowOrgResRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showOrgRes);
    }

    /**
     * 企业管理员查询企业资源使用信息
     *
     * 企业管理员查询所属企业的资源使用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrgResRequest 请求对象
     * @return AsyncInvoker<ShowOrgResRequest, ShowOrgResResponse>
     */
    public AsyncInvoker<ShowOrgResRequest, ShowOrgResResponse> showOrgResAsyncInvoker(ShowOrgResRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.showOrgRes, hcClient);
    }

    /**
     * 根据ID查询节目详情
     *
     * 根据ID获取节目详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProgramRequest 请求对象
     * @return CompletableFuture<ShowProgramResponse>
     */
    public CompletableFuture<ShowProgramResponse> showProgramAsync(ShowProgramRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showProgram);
    }

    /**
     * 根据ID查询节目详情
     *
     * 根据ID获取节目详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProgramRequest 请求对象
     * @return AsyncInvoker<ShowProgramRequest, ShowProgramResponse>
     */
    public AsyncInvoker<ShowProgramRequest, ShowProgramResponse> showProgramAsyncInvoker(ShowProgramRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.showProgram, hcClient);
    }

    /**
     * 根据ID查询信息窗发布详情
     *
     * 根据ID获取发布详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublicationRequest 请求对象
     * @return CompletableFuture<ShowPublicationResponse>
     */
    public CompletableFuture<ShowPublicationResponse> showPublicationAsync(ShowPublicationRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showPublication);
    }

    /**
     * 根据ID查询信息窗发布详情
     *
     * 根据ID获取发布详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublicationRequest 请求对象
     * @return AsyncInvoker<ShowPublicationRequest, ShowPublicationResponse>
     */
    public AsyncInvoker<ShowPublicationRequest, ShowPublicationResponse> showPublicationAsyncInvoker(
        ShowPublicationRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.showPublication, hcClient);
    }

    /**
     * 查询会议实时信息
     *
     * 该接口用于查询正在召开的会议实时信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRealTimeInfoOfMeetingRequest 请求对象
     * @return CompletableFuture<ShowRealTimeInfoOfMeetingResponse>
     */
    public CompletableFuture<ShowRealTimeInfoOfMeetingResponse> showRealTimeInfoOfMeetingAsync(
        ShowRealTimeInfoOfMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showRealTimeInfoOfMeeting);
    }

    /**
     * 查询会议实时信息
     *
     * 该接口用于查询正在召开的会议实时信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRealTimeInfoOfMeetingRequest 请求对象
     * @return AsyncInvoker<ShowRealTimeInfoOfMeetingRequest, ShowRealTimeInfoOfMeetingResponse>
     */
    public AsyncInvoker<ShowRealTimeInfoOfMeetingRequest, ShowRealTimeInfoOfMeetingResponse> showRealTimeInfoOfMeetingAsyncInvoker(
        ShowRealTimeInfoOfMeetingRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.showRealTimeInfoOfMeeting, hcClient);
    }

    /**
     * 查询录制详情
     *
     * 改接口用于查询某个会议录制的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordingDetailRequest 请求对象
     * @return CompletableFuture<ShowRecordingDetailResponse>
     */
    public CompletableFuture<ShowRecordingDetailResponse> showRecordingDetailAsync(ShowRecordingDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showRecordingDetail);
    }

    /**
     * 查询录制详情
     *
     * 改接口用于查询某个会议录制的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordingDetailRequest 请求对象
     * @return AsyncInvoker<ShowRecordingDetailRequest, ShowRecordingDetailResponse>
     */
    public AsyncInvoker<ShowRecordingDetailRequest, ShowRecordingDetailResponse> showRecordingDetailAsyncInvoker(
        ShowRecordingDetailRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.showRecordingDetail, hcClient);
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
     * @return CompletableFuture<ShowRecordingFileDownloadUrlsResponse>
     */
    public CompletableFuture<ShowRecordingFileDownloadUrlsResponse> showRecordingFileDownloadUrlsAsync(
        ShowRecordingFileDownloadUrlsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showRecordingFileDownloadUrls);
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
     * @return AsyncInvoker<ShowRecordingFileDownloadUrlsRequest, ShowRecordingFileDownloadUrlsResponse>
     */
    public AsyncInvoker<ShowRecordingFileDownloadUrlsRequest, ShowRecordingFileDownloadUrlsResponse> showRecordingFileDownloadUrlsAsyncInvoker(
        ShowRecordingFileDownloadUrlsRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.showRecordingFileDownloadUrls, hcClient);
    }

    /**
     * 查询会议所在区域信息
     *
     * 该接口用于查询会议所在区域的IP和域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRegionInfoOfMeetingRequest 请求对象
     * @return CompletableFuture<ShowRegionInfoOfMeetingResponse>
     */
    public CompletableFuture<ShowRegionInfoOfMeetingResponse> showRegionInfoOfMeetingAsync(
        ShowRegionInfoOfMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showRegionInfoOfMeeting);
    }

    /**
     * 查询会议所在区域信息
     *
     * 该接口用于查询会议所在区域的IP和域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRegionInfoOfMeetingRequest 请求对象
     * @return AsyncInvoker<ShowRegionInfoOfMeetingRequest, ShowRegionInfoOfMeetingResponse>
     */
    public AsyncInvoker<ShowRegionInfoOfMeetingRequest, ShowRegionInfoOfMeetingResponse> showRegionInfoOfMeetingAsyncInvoker(
        ShowRegionInfoOfMeetingRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.showRegionInfoOfMeeting, hcClient);
    }

    /**
     * 查询网络研讨会高级设置
     *
     * 该接口用于查询指定网络研讨会的高级设置。管理员可查询企业内的网络研讨会高级设置，非管理员只可查询自己预定的网络研讨会的高级设置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRoomSettingRequest 请求对象
     * @return CompletableFuture<ShowRoomSettingResponse>
     */
    public CompletableFuture<ShowRoomSettingResponse> showRoomSettingAsync(ShowRoomSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showRoomSetting);
    }

    /**
     * 查询网络研讨会高级设置
     *
     * 该接口用于查询指定网络研讨会的高级设置。管理员可查询企业内的网络研讨会高级设置，非管理员只可查询自己预定的网络研讨会的高级设置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRoomSettingRequest 请求对象
     * @return AsyncInvoker<ShowRoomSettingRequest, ShowRoomSettingResponse>
     */
    public AsyncInvoker<ShowRoomSettingRequest, ShowRoomSettingResponse> showRoomSettingAsyncInvoker(
        ShowRoomSettingRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.showRoomSetting, hcClient);
    }

    /**
     * SP管理员查询SP下资源使用信息
     *
     * SP管理员查询所属SP的共享资源使用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSpResRequest 请求对象
     * @return CompletableFuture<ShowSpResResponse>
     */
    public CompletableFuture<ShowSpResResponse> showSpResAsync(ShowSpResRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showSpRes);
    }

    /**
     * SP管理员查询SP下资源使用信息
     *
     * SP管理员查询所属SP的共享资源使用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSpResRequest 请求对象
     * @return AsyncInvoker<ShowSpResRequest, ShowSpResResponse>
     */
    public AsyncInvoker<ShowSpResRequest, ShowSpResResponse> showSpResAsyncInvoker(ShowSpResRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.showSpRes, hcClient);
    }

    /**
     * SP管理员查询资源信息
     *
     * SP管理员查询SP的所有资源，包括已使用的资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSpResourceRequest 请求对象
     * @return CompletableFuture<ShowSpResourceResponse>
     */
    public CompletableFuture<ShowSpResourceResponse> showSpResourceAsync(ShowSpResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showSpResource);
    }

    /**
     * SP管理员查询资源信息
     *
     * SP管理员查询SP的所有资源，包括已使用的资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSpResourceRequest 请求对象
     * @return AsyncInvoker<ShowSpResourceRequest, ShowSpResourceResponse>
     */
    public AsyncInvoker<ShowSpResourceRequest, ShowSpResourceResponse> showSpResourceAsyncInvoker(
        ShowSpResourceRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.showSpResource, hcClient);
    }

    /**
     * 查询SSO登录配置
     *
     * 该接口用于查询SSO登录的鉴权配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSsoConfigRequest 请求对象
     * @return CompletableFuture<ShowSsoConfigResponse>
     */
    public CompletableFuture<ShowSsoConfigResponse> showSsoConfigAsync(ShowSsoConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showSsoConfig);
    }

    /**
     * 查询SSO登录配置
     *
     * 该接口用于查询SSO登录的鉴权配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSsoConfigRequest 请求对象
     * @return AsyncInvoker<ShowSsoConfigRequest, ShowSsoConfigResponse>
     */
    public AsyncInvoker<ShowSsoConfigRequest, ShowSsoConfigResponse> showSsoConfigAsyncInvoker(
        ShowSsoConfigRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.showSsoConfig, hcClient);
    }

    /**
     * 查询用户详情
     *
     * 企业管理员通过该接口查询企业用户详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserDetailRequest 请求对象
     * @return CompletableFuture<ShowUserDetailResponse>
     */
    public CompletableFuture<ShowUserDetailResponse> showUserDetailAsync(ShowUserDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showUserDetail);
    }

    /**
     * 查询用户详情
     *
     * 企业管理员通过该接口查询企业用户详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserDetailRequest 请求对象
     * @return AsyncInvoker<ShowUserDetailRequest, ShowUserDetailResponse>
     */
    public AsyncInvoker<ShowUserDetailRequest, ShowUserDetailResponse> showUserDetailAsyncInvoker(
        ShowUserDetailRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.showUserDetail, hcClient);
    }

    /**
     * 查询事件推送
     *
     * 该接口用于管理员查询企业事件订阅配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWebHookConfigRequest 请求对象
     * @return CompletableFuture<ShowWebHookConfigResponse>
     */
    public CompletableFuture<ShowWebHookConfigResponse> showWebHookConfigAsync(ShowWebHookConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showWebHookConfig);
    }

    /**
     * 查询事件推送
     *
     * 该接口用于管理员查询企业事件订阅配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWebHookConfigRequest 请求对象
     * @return AsyncInvoker<ShowWebHookConfigRequest, ShowWebHookConfigResponse>
     */
    public AsyncInvoker<ShowWebHookConfigRequest, ShowWebHookConfigResponse> showWebHookConfigAsyncInvoker(
        ShowWebHookConfigRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.showWebHookConfig, hcClient);
    }

    /**
     * 查询网络研讨会详情
     *
     * 该接口用于查询指定网络研讨会的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWebinarRequest 请求对象
     * @return CompletableFuture<ShowWebinarResponse>
     */
    public CompletableFuture<ShowWebinarResponse> showWebinarAsync(ShowWebinarRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showWebinar);
    }

    /**
     * 查询网络研讨会详情
     *
     * 该接口用于查询指定网络研讨会的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWebinarRequest 请求对象
     * @return AsyncInvoker<ShowWebinarRequest, ShowWebinarResponse>
     */
    public AsyncInvoker<ShowWebinarRequest, ShowWebinarResponse> showWebinarAsyncInvoker(ShowWebinarRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.showWebinar, hcClient);
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
     * @return CompletableFuture<StartMeetingResponse>
     */
    public CompletableFuture<StartMeetingResponse> startMeetingAsync(StartMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.startMeeting);
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
     * @return AsyncInvoker<StartMeetingRequest, StartMeetingResponse>
     */
    public AsyncInvoker<StartMeetingRequest, StartMeetingResponse> startMeetingAsyncInvoker(
        StartMeetingRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.startMeeting, hcClient);
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
     * @return CompletableFuture<StopMeetingResponse>
     */
    public CompletableFuture<StopMeetingResponse> stopMeetingAsync(StopMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.stopMeeting);
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
     * @return AsyncInvoker<StopMeetingRequest, StopMeetingResponse>
     */
    public AsyncInvoker<StopMeetingRequest, StopMeetingResponse> stopMeetingAsyncInvoker(StopMeetingRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.stopMeeting, hcClient);
    }

    /**
     * 切换视频显示策略
     *
     * 该接口用于切换会中视频画面显示策略，包括广播多画面，广播单画面，声控多画面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchModeRequest 请求对象
     * @return CompletableFuture<SwitchModeResponse>
     */
    public CompletableFuture<SwitchModeResponse> switchModeAsync(SwitchModeRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.switchMode);
    }

    /**
     * 切换视频显示策略
     *
     * 该接口用于切换会中视频画面显示策略，包括广播多画面，广播单画面，声控多画面。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchModeRequest 请求对象
     * @return AsyncInvoker<SwitchModeRequest, SwitchModeResponse>
     */
    public AsyncInvoker<SwitchModeRequest, SwitchModeResponse> switchModeAsyncInvoker(SwitchModeRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.switchMode, hcClient);
    }

    /**
     * 修改手机或邮箱
     *
     * 企业用户通过该接口修改手机或邮箱，需要先获取验证码，验证多次失败会禁止修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateContactRequest 请求对象
     * @return CompletableFuture<UpdateContactResponse>
     */
    public CompletableFuture<UpdateContactResponse> updateContactAsync(UpdateContactRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateContact);
    }

    /**
     * 修改手机或邮箱
     *
     * 企业用户通过该接口修改手机或邮箱，需要先获取验证码，验证多次失败会禁止修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateContactRequest 请求对象
     * @return AsyncInvoker<UpdateContactRequest, UpdateContactResponse>
     */
    public AsyncInvoker<UpdateContactRequest, UpdateContactResponse> updateContactAsyncInvoker(
        UpdateContactRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.updateContact, hcClient);
    }

    /**
     * SP管理员修改企业
     *
     * 修改企业，若任一参数为null或者不携带则不修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCorpRequest 请求对象
     * @return CompletableFuture<UpdateCorpResponse>
     */
    public CompletableFuture<UpdateCorpResponse> updateCorpAsync(UpdateCorpRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateCorp);
    }

    /**
     * SP管理员修改企业
     *
     * 修改企业，若任一参数为null或者不携带则不修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCorpRequest 请求对象
     * @return AsyncInvoker<UpdateCorpRequest, UpdateCorpResponse>
     */
    public AsyncInvoker<UpdateCorpRequest, UpdateCorpResponse> updateCorpAsyncInvoker(UpdateCorpRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.updateCorp, hcClient);
    }

    /**
     * 企业管理员修改企业注册信息
     *
     * 企业管理员通过该接口修改企业注册信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCorpBasicInfoRequest 请求对象
     * @return CompletableFuture<UpdateCorpBasicInfoResponse>
     */
    public CompletableFuture<UpdateCorpBasicInfoResponse> updateCorpBasicInfoAsync(UpdateCorpBasicInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateCorpBasicInfo);
    }

    /**
     * 企业管理员修改企业注册信息
     *
     * 企业管理员通过该接口修改企业注册信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCorpBasicInfoRequest 请求对象
     * @return AsyncInvoker<UpdateCorpBasicInfoRequest, UpdateCorpBasicInfoResponse>
     */
    public AsyncInvoker<UpdateCorpBasicInfoRequest, UpdateCorpBasicInfoResponse> updateCorpBasicInfoAsyncInvoker(
        UpdateCorpBasicInfoRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.updateCorpBasicInfo, hcClient);
    }

    /**
     * 修改部门
     *
     * 企业管理员通过该接口修改部门。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDepartmentRequest 请求对象
     * @return CompletableFuture<UpdateDepartmentResponse>
     */
    public CompletableFuture<UpdateDepartmentResponse> updateDepartmentAsync(UpdateDepartmentRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateDepartment);
    }

    /**
     * 修改部门
     *
     * 企业管理员通过该接口修改部门。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDepartmentRequest 请求对象
     * @return AsyncInvoker<UpdateDepartmentRequest, UpdateDepartmentResponse>
     */
    public AsyncInvoker<UpdateDepartmentRequest, UpdateDepartmentResponse> updateDepartmentAsyncInvoker(
        UpdateDepartmentRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.updateDepartment, hcClient);
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
     * @return CompletableFuture<UpdateDeviceResponse>
     */
    public CompletableFuture<UpdateDeviceResponse> updateDeviceAsync(UpdateDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateDevice);
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
     * @return AsyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse>
     */
    public AsyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse> updateDeviceAsyncInvoker(
        UpdateDeviceRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.updateDevice, hcClient);
    }

    /**
     * 更新信息窗素材
     *
     * 更新信息窗素材。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMaterialRequest 请求对象
     * @return CompletableFuture<UpdateMaterialResponse>
     */
    public CompletableFuture<UpdateMaterialResponse> updateMaterialAsync(UpdateMaterialRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateMaterial);
    }

    /**
     * 更新信息窗素材
     *
     * 更新信息窗素材。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMaterialRequest 请求对象
     * @return AsyncInvoker<UpdateMaterialRequest, UpdateMaterialResponse>
     */
    public AsyncInvoker<UpdateMaterialRequest, UpdateMaterialResponse> updateMaterialAsyncInvoker(
        UpdateMaterialRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.updateMaterial, hcClient);
    }

    /**
     * 编辑预约会议
     *
     * 该接口用于修改已预约的会议。会议开始后，不能被修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMeetingRequest 请求对象
     * @return CompletableFuture<UpdateMeetingResponse>
     */
    public CompletableFuture<UpdateMeetingResponse> updateMeetingAsync(UpdateMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateMeeting);
    }

    /**
     * 编辑预约会议
     *
     * 该接口用于修改已预约的会议。会议开始后，不能被修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMeetingRequest 请求对象
     * @return AsyncInvoker<UpdateMeetingRequest, UpdateMeetingResponse>
     */
    public AsyncInvoker<UpdateMeetingRequest, UpdateMeetingResponse> updateMeetingAsyncInvoker(
        UpdateMeetingRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.updateMeeting, hcClient);
    }

    /**
     * 修改用会议室及个人会议ID信息
     *
     * 企业用户登录后可以修改分配给用户的云会议室及个人会议ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMemberVmrRequest 请求对象
     * @return CompletableFuture<UpdateMemberVmrResponse>
     */
    public CompletableFuture<UpdateMemberVmrResponse> updateMemberVmrAsync(UpdateMemberVmrRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateMemberVmr);
    }

    /**
     * 修改用会议室及个人会议ID信息
     *
     * 企业用户登录后可以修改分配给用户的云会议室及个人会议ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMemberVmrRequest 请求对象
     * @return AsyncInvoker<UpdateMemberVmrRequest, UpdateMemberVmrResponse>
     */
    public AsyncInvoker<UpdateMemberVmrRequest, UpdateMemberVmrResponse> updateMemberVmrAsyncInvoker(
        UpdateMemberVmrRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.updateMemberVmr, hcClient);
    }

    /**
     * 用户修改自己的信息
     *
     * 企业用户通过该接口修改自己的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMyInfoRequest 请求对象
     * @return CompletableFuture<UpdateMyInfoResponse>
     */
    public CompletableFuture<UpdateMyInfoResponse> updateMyInfoAsync(UpdateMyInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateMyInfo);
    }

    /**
     * 用户修改自己的信息
     *
     * 企业用户通过该接口修改自己的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMyInfoRequest 请求对象
     * @return AsyncInvoker<UpdateMyInfoRequest, UpdateMyInfoResponse>
     */
    public AsyncInvoker<UpdateMyInfoRequest, UpdateMyInfoResponse> updateMyInfoAsyncInvoker(
        UpdateMyInfoRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.updateMyInfo, hcClient);
    }

    /**
     * 更新信息窗节目
     *
     * 更新信息窗节目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProgramRequest 请求对象
     * @return CompletableFuture<UpdateProgramResponse>
     */
    public CompletableFuture<UpdateProgramResponse> updateProgramAsync(UpdateProgramRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateProgram);
    }

    /**
     * 更新信息窗节目
     *
     * 更新信息窗节目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProgramRequest 请求对象
     * @return AsyncInvoker<UpdateProgramRequest, UpdateProgramResponse>
     */
    public AsyncInvoker<UpdateProgramRequest, UpdateProgramResponse> updateProgramAsyncInvoker(
        UpdateProgramRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.updateProgram, hcClient);
    }

    /**
     * 修改信息窗发布
     *
     * 修改信息窗发布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePublicationRequest 请求对象
     * @return CompletableFuture<UpdatePublicationResponse>
     */
    public CompletableFuture<UpdatePublicationResponse> updatePublicationAsync(UpdatePublicationRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updatePublication);
    }

    /**
     * 修改信息窗发布
     *
     * 修改信息窗发布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePublicationRequest 请求对象
     * @return AsyncInvoker<UpdatePublicationRequest, UpdatePublicationResponse>
     */
    public AsyncInvoker<UpdatePublicationRequest, UpdatePublicationResponse> updatePublicationAsyncInvoker(
        UpdatePublicationRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.updatePublication, hcClient);
    }

    /**
     * 修改密码
     *
     * 企业成员通过该接口提供用户修改密码功能，服务器收到请求，修改用户密码并返回结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePwdRequest 请求对象
     * @return CompletableFuture<UpdatePwdResponse>
     */
    public CompletableFuture<UpdatePwdResponse> updatePwdAsync(UpdatePwdRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updatePwd);
    }

    /**
     * 修改密码
     *
     * 企业成员通过该接口提供用户修改密码功能，服务器收到请求，修改用户密码并返回结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePwdRequest 请求对象
     * @return AsyncInvoker<UpdatePwdRequest, UpdatePwdResponse>
     */
    public AsyncInvoker<UpdatePwdRequest, UpdatePwdResponse> updatePwdAsyncInvoker(UpdatePwdRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.updatePwd, hcClient);
    }

    /**
     * 编辑周期性会议
     *
     * 该接口用于修改已预约的周期性会议。会议开始后，不能被修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecurringMeetingRequest 请求对象
     * @return CompletableFuture<UpdateRecurringMeetingResponse>
     */
    public CompletableFuture<UpdateRecurringMeetingResponse> updateRecurringMeetingAsync(
        UpdateRecurringMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateRecurringMeeting);
    }

    /**
     * 编辑周期性会议
     *
     * 该接口用于修改已预约的周期性会议。会议开始后，不能被修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecurringMeetingRequest 请求对象
     * @return AsyncInvoker<UpdateRecurringMeetingRequest, UpdateRecurringMeetingResponse>
     */
    public AsyncInvoker<UpdateRecurringMeetingRequest, UpdateRecurringMeetingResponse> updateRecurringMeetingAsyncInvoker(
        UpdateRecurringMeetingRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.updateRecurringMeeting, hcClient);
    }

    /**
     * 编辑周期性会议的子会议
     *
     * 该接口用于修改已预约的周期性会议的子会议。会议开始后，不能被修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecurringSubMeetingRequest 请求对象
     * @return CompletableFuture<UpdateRecurringSubMeetingResponse>
     */
    public CompletableFuture<UpdateRecurringSubMeetingResponse> updateRecurringSubMeetingAsync(
        UpdateRecurringSubMeetingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateRecurringSubMeeting);
    }

    /**
     * 编辑周期性会议的子会议
     *
     * 该接口用于修改已预约的周期性会议的子会议。会议开始后，不能被修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecurringSubMeetingRequest 请求对象
     * @return AsyncInvoker<UpdateRecurringSubMeetingRequest, UpdateRecurringSubMeetingResponse>
     */
    public AsyncInvoker<UpdateRecurringSubMeetingRequest, UpdateRecurringSubMeetingResponse> updateRecurringSubMeetingAsyncInvoker(
        UpdateRecurringSubMeetingRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.updateRecurringSubMeeting, hcClient);
    }

    /**
     * SP管理员根据修改企业资源
     *
     * 企业修改资源的过期时间、停用状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResourceRequest 请求对象
     * @return CompletableFuture<UpdateResourceResponse>
     */
    public CompletableFuture<UpdateResourceResponse> updateResourceAsync(UpdateResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateResource);
    }

    /**
     * SP管理员根据修改企业资源
     *
     * 企业修改资源的过期时间、停用状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResourceRequest 请求对象
     * @return AsyncInvoker<UpdateResourceRequest, UpdateResourceResponse>
     */
    public AsyncInvoker<UpdateResourceRequest, UpdateResourceResponse> updateResourceAsyncInvoker(
        UpdateResourceRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.updateResource, hcClient);
    }

    /**
     * 修改网络研讨会高级设置
     *
     * 该接口用于设置指定网络研讨会的高级设置。管理员可设置企业内的网络研讨会高级设置，非管理员只可设置自己预定的网络研讨会的高级设置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRoomSettingRequest 请求对象
     * @return CompletableFuture<UpdateRoomSettingResponse>
     */
    public CompletableFuture<UpdateRoomSettingResponse> updateRoomSettingAsync(UpdateRoomSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateRoomSetting);
    }

    /**
     * 修改网络研讨会高级设置
     *
     * 该接口用于设置指定网络研讨会的高级设置。管理员可设置企业内的网络研讨会高级设置，非管理员只可设置自己预定的网络研讨会的高级设置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRoomSettingRequest 请求对象
     * @return AsyncInvoker<UpdateRoomSettingRequest, UpdateRoomSettingResponse>
     */
    public AsyncInvoker<UpdateRoomSettingRequest, UpdateRoomSettingResponse> updateRoomSettingAsyncInvoker(
        UpdateRoomSettingRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.updateRoomSetting, hcClient);
    }

    /**
     * 会中修改配置
     *
     * 该接口用于修改会议配置，包括会议共享是否锁定，允许呼入范围。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStartedConfConfigRequest 请求对象
     * @return CompletableFuture<UpdateStartedConfConfigResponse>
     */
    public CompletableFuture<UpdateStartedConfConfigResponse> updateStartedConfConfigAsync(
        UpdateStartedConfConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateStartedConfConfig);
    }

    /**
     * 会中修改配置
     *
     * 该接口用于修改会议配置，包括会议共享是否锁定，允许呼入范围。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStartedConfConfigRequest 请求对象
     * @return AsyncInvoker<UpdateStartedConfConfigRequest, UpdateStartedConfConfigResponse>
     */
    public AsyncInvoker<UpdateStartedConfConfigRequest, UpdateStartedConfConfigResponse> updateStartedConfConfigAsyncInvoker(
        UpdateStartedConfConfigRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.updateStartedConfConfig, hcClient);
    }

    /**
     * 刷新Token
     *
     * 该接口提供刷新Token功能，根据传入的Token，刷新Token失效时间并返回结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTokenRequest 请求对象
     * @return CompletableFuture<UpdateTokenResponse>
     */
    public CompletableFuture<UpdateTokenResponse> updateTokenAsync(UpdateTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateToken);
    }

    /**
     * 刷新Token
     *
     * 该接口提供刷新Token功能，根据传入的Token，刷新Token失效时间并返回结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTokenRequest 请求对象
     * @return AsyncInvoker<UpdateTokenRequest, UpdateTokenResponse>
     */
    public AsyncInvoker<UpdateTokenRequest, UpdateTokenResponse> updateTokenAsyncInvoker(UpdateTokenRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.updateToken, hcClient);
    }

    /**
     * 修改用户
     *
     * 企业管理员通过该接口修改企业用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserRequest 请求对象
     * @return CompletableFuture<UpdateUserResponse>
     */
    public CompletableFuture<UpdateUserResponse> updateUserAsync(UpdateUserRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateUser);
    }

    /**
     * 修改用户
     *
     * 企业管理员通过该接口修改企业用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserRequest 请求对象
     * @return AsyncInvoker<UpdateUserRequest, UpdateUserResponse>
     */
    public AsyncInvoker<UpdateUserRequest, UpdateUserResponse> updateUserAsyncInvoker(UpdateUserRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.updateUser, hcClient);
    }

    /**
     * 开启事件推送
     *
     * 该接口用于管理员变更订阅配置使用状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWebHookConfigStatusRequest 请求对象
     * @return CompletableFuture<UpdateWebHookConfigStatusResponse>
     */
    public CompletableFuture<UpdateWebHookConfigStatusResponse> updateWebHookConfigStatusAsync(
        UpdateWebHookConfigStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateWebHookConfigStatus);
    }

    /**
     * 开启事件推送
     *
     * 该接口用于管理员变更订阅配置使用状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWebHookConfigStatusRequest 请求对象
     * @return AsyncInvoker<UpdateWebHookConfigStatusRequest, UpdateWebHookConfigStatusResponse>
     */
    public AsyncInvoker<UpdateWebHookConfigStatusRequest, UpdateWebHookConfigStatusResponse> updateWebHookConfigStatusAsyncInvoker(
        UpdateWebHookConfigStatusRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.updateWebHookConfigStatus, hcClient);
    }

    /**
     * 编辑网络研讨会
     *
     * 该接口用于修改已创建的网络研讨会。网络研讨会开始后不能修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWebinarRequest 请求对象
     * @return CompletableFuture<UpdateWebinarResponse>
     */
    public CompletableFuture<UpdateWebinarResponse> updateWebinarAsync(UpdateWebinarRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.updateWebinar);
    }

    /**
     * 编辑网络研讨会
     *
     * 该接口用于修改已创建的网络研讨会。网络研讨会开始后不能修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWebinarRequest 请求对象
     * @return AsyncInvoker<UpdateWebinarRequest, UpdateWebinarResponse>
     */
    public AsyncInvoker<UpdateWebinarRequest, UpdateWebinarResponse> updateWebinarAsyncInvoker(
        UpdateWebinarRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.updateWebinar, hcClient);
    }

    /**
     * 上传图片
     *
     * 该接口用户上传网络研讨会高级设置用的图片。图片可用于网络研讨会的封面和Logo。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadFileRequest 请求对象
     * @return CompletableFuture<UploadFileResponse>
     */
    public CompletableFuture<UploadFileResponse> uploadFileAsync(UploadFileRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.uploadFile);
    }

    /**
     * 上传图片
     *
     * 该接口用户上传网络研讨会高级设置用的图片。图片可用于网络研讨会的封面和Logo。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadFileRequest 请求对象
     * @return AsyncInvoker<UploadFileRequest, UploadFileResponse>
     */
    public AsyncInvoker<UploadFileRequest, UploadFileResponse> uploadFileAsyncInvoker(UploadFileRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.uploadFile, hcClient);
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
     * @return CompletableFuture<SearchQosHistoryMeetingsResponse>
     */
    public CompletableFuture<SearchQosHistoryMeetingsResponse> searchQosHistoryMeetingsAsync(
        SearchQosHistoryMeetingsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchQosHistoryMeetings);
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
     * @return AsyncInvoker<SearchQosHistoryMeetingsRequest, SearchQosHistoryMeetingsResponse>
     */
    public AsyncInvoker<SearchQosHistoryMeetingsRequest, SearchQosHistoryMeetingsResponse> searchQosHistoryMeetingsAsyncInvoker(
        SearchQosHistoryMeetingsRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.searchQosHistoryMeetings, hcClient);
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
     * @return CompletableFuture<SearchQosOnlineMeetingsResponse>
     */
    public CompletableFuture<SearchQosOnlineMeetingsResponse> searchQosOnlineMeetingsAsync(
        SearchQosOnlineMeetingsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchQosOnlineMeetings);
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
     * @return AsyncInvoker<SearchQosOnlineMeetingsRequest, SearchQosOnlineMeetingsResponse>
     */
    public AsyncInvoker<SearchQosOnlineMeetingsRequest, SearchQosOnlineMeetingsResponse> searchQosOnlineMeetingsAsyncInvoker(
        SearchQosOnlineMeetingsRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.searchQosOnlineMeetings, hcClient);
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
     * @return CompletableFuture<SearchQosParticipantDetailResponse>
     */
    public CompletableFuture<SearchQosParticipantDetailResponse> searchQosParticipantDetailAsync(
        SearchQosParticipantDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchQosParticipantDetail);
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
     * @return AsyncInvoker<SearchQosParticipantDetailRequest, SearchQosParticipantDetailResponse>
     */
    public AsyncInvoker<SearchQosParticipantDetailRequest, SearchQosParticipantDetailResponse> searchQosParticipantDetailAsyncInvoker(
        SearchQosParticipantDetailRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.searchQosParticipantDetail, hcClient);
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
     * @return CompletableFuture<SearchQosParticipantsResponse>
     */
    public CompletableFuture<SearchQosParticipantsResponse> searchQosParticipantsAsync(
        SearchQosParticipantsRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchQosParticipants);
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
     * @return AsyncInvoker<SearchQosParticipantsRequest, SearchQosParticipantsResponse>
     */
    public AsyncInvoker<SearchQosParticipantsRequest, SearchQosParticipantsResponse> searchQosParticipantsAsyncInvoker(
        SearchQosParticipantsRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.searchQosParticipants, hcClient);
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
     * @return CompletableFuture<SetQosThresholdResponse>
     */
    public CompletableFuture<SetQosThresholdResponse> setQosThresholdAsync(SetQosThresholdRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.setQosThreshold);
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
     * @return AsyncInvoker<SetQosThresholdRequest, SetQosThresholdResponse>
     */
    public AsyncInvoker<SetQosThresholdRequest, SetQosThresholdResponse> setQosThresholdAsyncInvoker(
        SetQosThresholdRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.setQosThreshold, hcClient);
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
     * @return CompletableFuture<ShowQosThresholdResponse>
     */
    public CompletableFuture<ShowQosThresholdResponse> showQosThresholdAsync(ShowQosThresholdRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.showQosThreshold);
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
     * @return AsyncInvoker<ShowQosThresholdRequest, ShowQosThresholdResponse>
     */
    public AsyncInvoker<ShowQosThresholdRequest, ShowQosThresholdResponse> showQosThresholdAsyncInvoker(
        ShowQosThresholdRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.showQosThreshold, hcClient);
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
     * @return CompletableFuture<SearchStatisticConferenceInfoResponse>
     */
    public CompletableFuture<SearchStatisticConferenceInfoResponse> searchStatisticConferenceInfoAsync(
        SearchStatisticConferenceInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchStatisticConferenceInfo);
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
     * @return AsyncInvoker<SearchStatisticConferenceInfoRequest, SearchStatisticConferenceInfoResponse>
     */
    public AsyncInvoker<SearchStatisticConferenceInfoRequest, SearchStatisticConferenceInfoResponse> searchStatisticConferenceInfoAsyncInvoker(
        SearchStatisticConferenceInfoRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.searchStatisticConferenceInfo, hcClient);
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
     * @return CompletableFuture<SearchStatisticConferenceParticipantResponse>
     */
    public CompletableFuture<SearchStatisticConferenceParticipantResponse> searchStatisticConferenceParticipantAsync(
        SearchStatisticConferenceParticipantRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchStatisticConferenceParticipant);
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
     * @return AsyncInvoker<SearchStatisticConferenceParticipantRequest, SearchStatisticConferenceParticipantResponse>
     */
    public AsyncInvoker<SearchStatisticConferenceParticipantRequest, SearchStatisticConferenceParticipantResponse> searchStatisticConferenceParticipantAsyncInvoker(
        SearchStatisticConferenceParticipantRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.searchStatisticConferenceParticipant, hcClient);
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
     * @return CompletableFuture<SearchStatisticResourceInfoResponse>
     */
    public CompletableFuture<SearchStatisticResourceInfoResponse> searchStatisticResourceInfoAsync(
        SearchStatisticResourceInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchStatisticResourceInfo);
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
     * @return AsyncInvoker<SearchStatisticResourceInfoRequest, SearchStatisticResourceInfoResponse>
     */
    public AsyncInvoker<SearchStatisticResourceInfoRequest, SearchStatisticResourceInfoResponse> searchStatisticResourceInfoAsyncInvoker(
        SearchStatisticResourceInfoRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.searchStatisticResourceInfo, hcClient);
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
     * @return CompletableFuture<SearchStatisticUserInfoResponse>
     */
    public CompletableFuture<SearchStatisticUserInfoResponse> searchStatisticUserInfoAsync(
        SearchStatisticUserInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, MeetingMeta.searchStatisticUserInfo);
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
     * @return AsyncInvoker<SearchStatisticUserInfoRequest, SearchStatisticUserInfoResponse>
     */
    public AsyncInvoker<SearchStatisticUserInfoRequest, SearchStatisticUserInfoResponse> searchStatisticUserInfoAsyncInvoker(
        SearchStatisticUserInfoRequest request) {
        return new AsyncInvoker<>(request, MeetingMeta.searchStatisticUserInfo, hcClient);
    }

}

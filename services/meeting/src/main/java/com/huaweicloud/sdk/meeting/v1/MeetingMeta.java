package com.huaweicloud.sdk.meeting.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.meeting.v1.model.ActiveDTO;
import com.huaweicloud.sdk.meeting.v1.model.AddCorpAdminRequest;
import com.huaweicloud.sdk.meeting.v1.model.AddCorpAdminResponse;
import com.huaweicloud.sdk.meeting.v1.model.AddCorpDTO;
import com.huaweicloud.sdk.meeting.v1.model.AddCorpRequest;
import com.huaweicloud.sdk.meeting.v1.model.AddCorpResponse;
import com.huaweicloud.sdk.meeting.v1.model.AddDepartmentRequest;
import com.huaweicloud.sdk.meeting.v1.model.AddDepartmentResponse;
import com.huaweicloud.sdk.meeting.v1.model.AddDeviceDTO;
import com.huaweicloud.sdk.meeting.v1.model.AddDeviceRequest;
import com.huaweicloud.sdk.meeting.v1.model.AddDeviceResponse;
import com.huaweicloud.sdk.meeting.v1.model.AddMaterialRequest;
import com.huaweicloud.sdk.meeting.v1.model.AddMaterialRequestBody;
import com.huaweicloud.sdk.meeting.v1.model.AddMaterialResponse;
import com.huaweicloud.sdk.meeting.v1.model.AddProgramRequest;
import com.huaweicloud.sdk.meeting.v1.model.AddProgramResponse;
import com.huaweicloud.sdk.meeting.v1.model.AddPublicationRequest;
import com.huaweicloud.sdk.meeting.v1.model.AddPublicationResponse;
import com.huaweicloud.sdk.meeting.v1.model.AddResourceRequest;
import com.huaweicloud.sdk.meeting.v1.model.AddResourceResponse;
import com.huaweicloud.sdk.meeting.v1.model.AddToPersonalSpaceRequest;
import com.huaweicloud.sdk.meeting.v1.model.AddToPersonalSpaceResponse;
import com.huaweicloud.sdk.meeting.v1.model.AddUserDTO;
import com.huaweicloud.sdk.meeting.v1.model.AddUserRequest;
import com.huaweicloud.sdk.meeting.v1.model.AddUserRequestBody;
import com.huaweicloud.sdk.meeting.v1.model.AddUserResponse;
import com.huaweicloud.sdk.meeting.v1.model.AdminResetPwdReqDTO;
import com.huaweicloud.sdk.meeting.v1.model.AllowClientRecordRequest;
import com.huaweicloud.sdk.meeting.v1.model.AllowClientRecordResponse;
import com.huaweicloud.sdk.meeting.v1.model.AllowGuestUnmuteRequest;
import com.huaweicloud.sdk.meeting.v1.model.AllowGuestUnmuteResponse;
import com.huaweicloud.sdk.meeting.v1.model.AllowWaitingParticipantRequest;
import com.huaweicloud.sdk.meeting.v1.model.AllowWaitingParticipantResponse;
import com.huaweicloud.sdk.meeting.v1.model.AssociateVmrRequest;
import com.huaweicloud.sdk.meeting.v1.model.AssociateVmrResponse;
import com.huaweicloud.sdk.meeting.v1.model.AuthorizeConfigInfoRequestBody;
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
import com.huaweicloud.sdk.meeting.v1.model.ConferenceInfo;
import com.huaweicloud.sdk.meeting.v1.model.CorpAdminDTO;
import com.huaweicloud.sdk.meeting.v1.model.CreateAnonymousAuthRandomRequest;
import com.huaweicloud.sdk.meeting.v1.model.CreateAnonymousAuthRandomResponse;
import com.huaweicloud.sdk.meeting.v1.model.CreateConfTokenRequest;
import com.huaweicloud.sdk.meeting.v1.model.CreateConfTokenResponse;
import com.huaweicloud.sdk.meeting.v1.model.CreateMeetingRequest;
import com.huaweicloud.sdk.meeting.v1.model.CreateMeetingResponse;
import com.huaweicloud.sdk.meeting.v1.model.CreatePortalRefNonceRequest;
import com.huaweicloud.sdk.meeting.v1.model.CreatePortalRefNonceResponse;
import com.huaweicloud.sdk.meeting.v1.model.CreateProgramRequestDTO;
import com.huaweicloud.sdk.meeting.v1.model.CreatePublicationRequestDTO;
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
import com.huaweicloud.sdk.meeting.v1.model.DeptDTO;
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
import com.huaweicloud.sdk.meeting.v1.model.InviteShareDTO;
import com.huaweicloud.sdk.meeting.v1.model.InviteShareRequest;
import com.huaweicloud.sdk.meeting.v1.model.InviteShareResponse;
import com.huaweicloud.sdk.meeting.v1.model.InviteUserRequest;
import com.huaweicloud.sdk.meeting.v1.model.InviteUserResponse;
import com.huaweicloud.sdk.meeting.v1.model.InviteWithPwdRequest;
import com.huaweicloud.sdk.meeting.v1.model.InviteWithPwdResponse;
import com.huaweicloud.sdk.meeting.v1.model.ListHistoryWebinarsRequest;
import com.huaweicloud.sdk.meeting.v1.model.ListHistoryWebinarsResponse;
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
import com.huaweicloud.sdk.meeting.v1.model.ModCorpBasicInfoDTO;
import com.huaweicloud.sdk.meeting.v1.model.ModCorpDTO;
import com.huaweicloud.sdk.meeting.v1.model.ModDeptDTO;
import com.huaweicloud.sdk.meeting.v1.model.ModDeviceDTO;
import com.huaweicloud.sdk.meeting.v1.model.ModMemberDTO;
import com.huaweicloud.sdk.meeting.v1.model.ModPwdReqDTO;
import com.huaweicloud.sdk.meeting.v1.model.ModResourceDTO;
import com.huaweicloud.sdk.meeting.v1.model.ModUserDTO;
import com.huaweicloud.sdk.meeting.v1.model.ModVmrDTO;
import com.huaweicloud.sdk.meeting.v1.model.MoveToWaitingRoomRequest;
import com.huaweicloud.sdk.meeting.v1.model.MoveToWaitingRoomResponse;
import com.huaweicloud.sdk.meeting.v1.model.MuteMeetingRequest;
import com.huaweicloud.sdk.meeting.v1.model.MuteMeetingResponse;
import com.huaweicloud.sdk.meeting.v1.model.MuteParticipantRequest;
import com.huaweicloud.sdk.meeting.v1.model.MuteParticipantResponse;
import com.huaweicloud.sdk.meeting.v1.model.OpenEditConfReq;
import com.huaweicloud.sdk.meeting.v1.model.OpenRoomSettingReq;
import com.huaweicloud.sdk.meeting.v1.model.OpenScheduleConfReq;
import com.huaweicloud.sdk.meeting.v1.model.ProlongMeetingRequest;
import com.huaweicloud.sdk.meeting.v1.model.ProlongMeetingResponse;
import com.huaweicloud.sdk.meeting.v1.model.QueryDeptResultDTO;
import com.huaweicloud.sdk.meeting.v1.model.QueryDeviceTypeResultDTO;
import com.huaweicloud.sdk.meeting.v1.model.RecordRequest;
import com.huaweicloud.sdk.meeting.v1.model.RecordResponse;
import com.huaweicloud.sdk.meeting.v1.model.RenameParticipantRequest;
import com.huaweicloud.sdk.meeting.v1.model.RenameParticipantResponse;
import com.huaweicloud.sdk.meeting.v1.model.ResetActivecodeRequest;
import com.huaweicloud.sdk.meeting.v1.model.ResetActivecodeResponse;
import com.huaweicloud.sdk.meeting.v1.model.ResetPwdByAdminRequest;
import com.huaweicloud.sdk.meeting.v1.model.ResetPwdByAdminResponse;
import com.huaweicloud.sdk.meeting.v1.model.ResetPwdReqDTOV1;
import com.huaweicloud.sdk.meeting.v1.model.ResetPwdRequest;
import com.huaweicloud.sdk.meeting.v1.model.ResetPwdResponse;
import com.huaweicloud.sdk.meeting.v1.model.ResetVisionActiveCodeRequest;
import com.huaweicloud.sdk.meeting.v1.model.ResetVisionActiveCodeResponse;
import com.huaweicloud.sdk.meeting.v1.model.ResourceDTO;
import com.huaweicloud.sdk.meeting.v1.model.RestAllowClientRecordReqBody;
import com.huaweicloud.sdk.meeting.v1.model.RestAllowUnMuteReqBody;
import com.huaweicloud.sdk.meeting.v1.model.RestAllowWaitingParticipantReqBody;
import com.huaweicloud.sdk.meeting.v1.model.RestBatchHandsUpReqBody;
import com.huaweicloud.sdk.meeting.v1.model.RestBulkDelAttendReqBody;
import com.huaweicloud.sdk.meeting.v1.model.RestBulkHangUpReqBody;
import com.huaweicloud.sdk.meeting.v1.model.RestCancelSingleRecordCycleConfListReqBody;
import com.huaweicloud.sdk.meeting.v1.model.RestChairTokenReqBody;
import com.huaweicloud.sdk.meeting.v1.model.RestChairViewReqBody;
import com.huaweicloud.sdk.meeting.v1.model.RestCustomMultiPictureBody;
import com.huaweicloud.sdk.meeting.v1.model.RestHandsUpReqBody;
import com.huaweicloud.sdk.meeting.v1.model.RestInviteReqBody;
import com.huaweicloud.sdk.meeting.v1.model.RestInviteWithPwdReqBody;
import com.huaweicloud.sdk.meeting.v1.model.RestLockReqBody;
import com.huaweicloud.sdk.meeting.v1.model.RestLockSiteViewReqBody;
import com.huaweicloud.sdk.meeting.v1.model.RestMixedPictureBody;
import com.huaweicloud.sdk.meeting.v1.model.RestMoveToWaitingRoomReqBody;
import com.huaweicloud.sdk.meeting.v1.model.RestMuteParticipantReqBody;
import com.huaweicloud.sdk.meeting.v1.model.RestMuteReqBody;
import com.huaweicloud.sdk.meeting.v1.model.RestParticipantViewReqBody;
import com.huaweicloud.sdk.meeting.v1.model.RestPicLayoutBody;
import com.huaweicloud.sdk.meeting.v1.model.RestProlongDurReqBody;
import com.huaweicloud.sdk.meeting.v1.model.RestRenamePartReqBody;
import com.huaweicloud.sdk.meeting.v1.model.RestScheduleConfDTO;
import com.huaweicloud.sdk.meeting.v1.model.RestScheduleCycleConfDTO;
import com.huaweicloud.sdk.meeting.v1.model.RestSetAttendeeLanChannelBody;
import com.huaweicloud.sdk.meeting.v1.model.RestSetCohostBody;
import com.huaweicloud.sdk.meeting.v1.model.RestSetInterpreterGroupBody;
import com.huaweicloud.sdk.meeting.v1.model.RestSetLiveReqBody;
import com.huaweicloud.sdk.meeting.v1.model.RestSetRecordReqBody;
import com.huaweicloud.sdk.meeting.v1.model.RestSimultaneousInterpretationBody;
import com.huaweicloud.sdk.meeting.v1.model.RestSwitchModeReqBody;
import com.huaweicloud.sdk.meeting.v1.model.RestVideoBody;
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
import com.huaweicloud.sdk.meeting.v1.model.SetQosThresholdReq;
import com.huaweicloud.sdk.meeting.v1.model.SetQosThresholdRequest;
import com.huaweicloud.sdk.meeting.v1.model.SetQosThresholdResponse;
import com.huaweicloud.sdk.meeting.v1.model.SetRoleRequest;
import com.huaweicloud.sdk.meeting.v1.model.SetRoleResponse;
import com.huaweicloud.sdk.meeting.v1.model.SetSsoConfigRequest;
import com.huaweicloud.sdk.meeting.v1.model.SetSsoConfigResponse;
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
import com.huaweicloud.sdk.meeting.v1.model.ShowUserRequestDTO;
import com.huaweicloud.sdk.meeting.v1.model.ShowWebHookConfigRequest;
import com.huaweicloud.sdk.meeting.v1.model.ShowWebHookConfigResponse;
import com.huaweicloud.sdk.meeting.v1.model.ShowWebinarRequest;
import com.huaweicloud.sdk.meeting.v1.model.ShowWebinarResponse;
import com.huaweicloud.sdk.meeting.v1.model.SlideVerifyCodeCheckDTO;
import com.huaweicloud.sdk.meeting.v1.model.SlideVerifyCodeSendDTO;
import com.huaweicloud.sdk.meeting.v1.model.StartMeetingRequest;
import com.huaweicloud.sdk.meeting.v1.model.StartMeetingResponse;
import com.huaweicloud.sdk.meeting.v1.model.StartRequest;
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
import com.huaweicloud.sdk.meeting.v1.model.UpdateMaterialRequestDTO;
import com.huaweicloud.sdk.meeting.v1.model.UpdateMaterialResponse;
import com.huaweicloud.sdk.meeting.v1.model.UpdateMeetingRequest;
import com.huaweicloud.sdk.meeting.v1.model.UpdateMeetingResponse;
import com.huaweicloud.sdk.meeting.v1.model.UpdateMemberVmrRequest;
import com.huaweicloud.sdk.meeting.v1.model.UpdateMemberVmrResponse;
import com.huaweicloud.sdk.meeting.v1.model.UpdateMyInfoRequest;
import com.huaweicloud.sdk.meeting.v1.model.UpdateMyInfoResponse;
import com.huaweicloud.sdk.meeting.v1.model.UpdateProgramRequest;
import com.huaweicloud.sdk.meeting.v1.model.UpdateProgramRequestDTO;
import com.huaweicloud.sdk.meeting.v1.model.UpdateProgramResponse;
import com.huaweicloud.sdk.meeting.v1.model.UpdatePublicationRequest;
import com.huaweicloud.sdk.meeting.v1.model.UpdatePublicationRequestDTO;
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
import com.huaweicloud.sdk.meeting.v1.model.UpdateStartedConfigReqBody;
import com.huaweicloud.sdk.meeting.v1.model.UpdateTokenRequest;
import com.huaweicloud.sdk.meeting.v1.model.UpdateTokenResponse;
import com.huaweicloud.sdk.meeting.v1.model.UpdateUserRequest;
import com.huaweicloud.sdk.meeting.v1.model.UpdateUserResponse;
import com.huaweicloud.sdk.meeting.v1.model.UpdateWebHookConfigStatusRequest;
import com.huaweicloud.sdk.meeting.v1.model.UpdateWebHookConfigStatusResponse;
import com.huaweicloud.sdk.meeting.v1.model.UpdateWebinarRequest;
import com.huaweicloud.sdk.meeting.v1.model.UpdateWebinarResponse;
import com.huaweicloud.sdk.meeting.v1.model.UploadFileRequest;
import com.huaweicloud.sdk.meeting.v1.model.UploadFileRequestBody;
import com.huaweicloud.sdk.meeting.v1.model.UploadFileResponse;
import com.huaweicloud.sdk.meeting.v1.model.UserDTO;
import com.huaweicloud.sdk.meeting.v1.model.UserStatusDTO;
import com.huaweicloud.sdk.meeting.v1.model.ValidateTokenReqDTO;
import com.huaweicloud.sdk.meeting.v1.model.VerificationCodeDTO;
import com.huaweicloud.sdk.meeting.v1.model.VerifyCodeCheckDTO;
import com.huaweicloud.sdk.meeting.v1.model.VerifyCodeSendDTOV1;
import com.huaweicloud.sdk.meeting.v1.model.VisionActiveCodeDTO;
import com.huaweicloud.sdk.meeting.v1.model.WebHookConfigRequest;

import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public class MeetingMeta {

    public static final HttpRequestDef<AddCorpRequest, AddCorpResponse> addCorp = genForaddCorp();

    private static HttpRequestDef<AddCorpRequest, AddCorpResponse> genForaddCorp() {
        // basic
        HttpRequestDef.Builder<AddCorpRequest, AddCorpResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddCorpRequest.class, AddCorpResponse.class)
                .withName("AddCorp")
                .withUri("/v1/usg/dcs/sp/corp")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddCorpRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddCorpRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<AddCorpDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddCorpDTO.class),
            f -> f.withMarshaller(AddCorpRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddCorpAdminRequest, AddCorpAdminResponse> addCorpAdmin = genForaddCorpAdmin();

    private static HttpRequestDef<AddCorpAdminRequest, AddCorpAdminResponse> genForaddCorpAdmin() {
        // basic
        HttpRequestDef.Builder<AddCorpAdminRequest, AddCorpAdminResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddCorpAdminRequest.class, AddCorpAdminResponse.class)
                .withName("AddCorpAdmin")
                .withUri("/v1/usg/dcs/corp/admin")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("accountType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(AddCorpAdminRequest::getAccountType, (req, v) -> {
                req.setAccountType(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddCorpAdminRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddCorpAdminRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<CorpAdminDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CorpAdminDTO.class),
            f -> f.withMarshaller(AddCorpAdminRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddDepartmentRequest, AddDepartmentResponse> addDepartment =
        genForaddDepartment();

    private static HttpRequestDef<AddDepartmentRequest, AddDepartmentResponse> genForaddDepartment() {
        // basic
        HttpRequestDef.Builder<AddDepartmentRequest, AddDepartmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddDepartmentRequest.class, AddDepartmentResponse.class)
                .withName("AddDepartment")
                .withUri("/v1/usg/dcs/corp/dept")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddDepartmentRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddDepartmentRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<DeptDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeptDTO.class),
            f -> f.withMarshaller(AddDepartmentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddDeviceRequest, AddDeviceResponse> addDevice = genForaddDevice();

    private static HttpRequestDef<AddDeviceRequest, AddDeviceResponse> genForaddDevice() {
        // basic
        HttpRequestDef.Builder<AddDeviceRequest, AddDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddDeviceRequest.class, AddDeviceResponse.class)
                .withName("AddDevice")
                .withUri("/v1/usg/dcs/corp/device")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddDeviceRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddDeviceRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<AddDeviceDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddDeviceDTO.class),
            f -> f.withMarshaller(AddDeviceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddMaterialRequest, AddMaterialResponse> addMaterial = genForaddMaterial();

    private static HttpRequestDef<AddMaterialRequest, AddMaterialResponse> genForaddMaterial() {
        // basic
        HttpRequestDef.Builder<AddMaterialRequest, AddMaterialResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddMaterialRequest.class, AddMaterialResponse.class)
                .withName("AddMaterial")
                .withUri("/v1/usg/sss/materials")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddMaterialRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddMaterialRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<AddMaterialRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddMaterialRequestBody.class),
            f -> f.withMarshaller(AddMaterialRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddProgramRequest, AddProgramResponse> addProgram = genForaddProgram();

    private static HttpRequestDef<AddProgramRequest, AddProgramResponse> genForaddProgram() {
        // basic
        HttpRequestDef.Builder<AddProgramRequest, AddProgramResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddProgramRequest.class, AddProgramResponse.class)
                .withName("AddProgram")
                .withUri("/v1/usg/sss/programs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddProgramRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddProgramRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<CreateProgramRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateProgramRequestDTO.class),
            f -> f.withMarshaller(AddProgramRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddPublicationRequest, AddPublicationResponse> addPublication =
        genForaddPublication();

    private static HttpRequestDef<AddPublicationRequest, AddPublicationResponse> genForaddPublication() {
        // basic
        HttpRequestDef.Builder<AddPublicationRequest, AddPublicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddPublicationRequest.class, AddPublicationResponse.class)
                .withName("AddPublication")
                .withUri("/v1/usg/sss/publications")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddPublicationRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddPublicationRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<CreatePublicationRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePublicationRequestDTO.class),
            f -> f.withMarshaller(AddPublicationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddResourceRequest, AddResourceResponse> addResource = genForaddResource();

    private static HttpRequestDef<AddResourceRequest, AddResourceResponse> genForaddResource() {
        // basic
        HttpRequestDef.Builder<AddResourceRequest, AddResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddResourceRequest.class, AddResourceResponse.class)
                .withName("AddResource")
                .withUri("/v1/usg/dcs/sp/corp/{corp_id}/resource")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("corp_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddResourceRequest::getCorpId, (req, v) -> {
                req.setCorpId(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddResourceRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddResourceRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<List<ResourceDTO>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(AddResourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(ResourceDTO.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddToPersonalSpaceRequest, AddToPersonalSpaceResponse> addToPersonalSpace =
        genForaddToPersonalSpace();

    private static HttpRequestDef<AddToPersonalSpaceRequest, AddToPersonalSpaceResponse> genForaddToPersonalSpace() {
        // basic
        HttpRequestDef.Builder<AddToPersonalSpaceRequest, AddToPersonalSpaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddToPersonalSpaceRequest.class, AddToPersonalSpaceResponse.class)
                .withName("AddToPersonalSpace")
                .withUri("/v1/usg/sss/meeting-files/save-to-personal-space")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddToPersonalSpaceRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddToPersonalSpaceRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<Map<String, String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f.withMarshaller(AddToPersonalSpaceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddUserRequest, AddUserResponse> addUser = genForaddUser();

    private static HttpRequestDef<AddUserRequest, AddUserResponse> genForaddUser() {
        // basic
        HttpRequestDef.Builder<AddUserRequest, AddUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddUserRequest.class, AddUserResponse.class)
                .withName("AddUser")
                .withUri("/v1/usg/dcs/corp/member")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddUserRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddUserRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<AddUserDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddUserDTO.class),
            f -> f.withMarshaller(AddUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AllowClientRecordRequest, AllowClientRecordResponse> allowClientRecord =
        genForallowClientRecord();

    private static HttpRequestDef<AllowClientRecordRequest, AllowClientRecordResponse> genForallowClientRecord() {
        // basic
        HttpRequestDef.Builder<AllowClientRecordRequest, AllowClientRecordResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, AllowClientRecordRequest.class, AllowClientRecordResponse.class)
                .withName("AllowClientRecord")
                .withUri("/v1/mmc/control/conferences/allowClientRecord")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AllowClientRecordRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("participantID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AllowClientRecordRequest::getParticipantID, (req, v) -> {
                req.setParticipantID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AllowClientRecordRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));
        builder.<RestAllowClientRecordReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestAllowClientRecordReqBody.class),
            f -> f.withMarshaller(AllowClientRecordRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AllowGuestUnmuteRequest, AllowGuestUnmuteResponse> allowGuestUnmute =
        genForallowGuestUnmute();

    private static HttpRequestDef<AllowGuestUnmuteRequest, AllowGuestUnmuteResponse> genForallowGuestUnmute() {
        // basic
        HttpRequestDef.Builder<AllowGuestUnmuteRequest, AllowGuestUnmuteResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, AllowGuestUnmuteRequest.class, AllowGuestUnmuteResponse.class)
                .withName("AllowGuestUnmute")
                .withUri("/v1/mmc/control/conferences/mute/guestUnMute")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AllowGuestUnmuteRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AllowGuestUnmuteRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));
        builder.<RestAllowUnMuteReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestAllowUnMuteReqBody.class),
            f -> f.withMarshaller(AllowGuestUnmuteRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AllowWaitingParticipantRequest, AllowWaitingParticipantResponse> allowWaitingParticipant =
        genForallowWaitingParticipant();

    private static HttpRequestDef<AllowWaitingParticipantRequest, AllowWaitingParticipantResponse> genForallowWaitingParticipant() {
        // basic
        HttpRequestDef.Builder<AllowWaitingParticipantRequest, AllowWaitingParticipantResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, AllowWaitingParticipantRequest.class, AllowWaitingParticipantResponse.class)
            .withName("AllowWaitingParticipant")
            .withUri("/v1/mmc/control/conferences/allowWaitingParticipant")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AllowWaitingParticipantRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AllowWaitingParticipantRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));
        builder.<RestAllowWaitingParticipantReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestAllowWaitingParticipantReqBody.class),
            f -> f.withMarshaller(AllowWaitingParticipantRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateVmrRequest, AssociateVmrResponse> associateVmr = genForassociateVmr();

    private static HttpRequestDef<AssociateVmrRequest, AssociateVmrResponse> genForassociateVmr() {
        // basic
        HttpRequestDef.Builder<AssociateVmrRequest, AssociateVmrResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AssociateVmrRequest.class, AssociateVmrResponse.class)
                .withName("AssociateVmr")
                .withUri("/v1/usg/dcs/corp/vmr/assign-to-member/{account}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("account",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateVmrRequest::getAccount, (req, v) -> {
                req.setAccount(v);
            }));
        builder.<Integer>withRequestField("accountType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(AssociateVmrRequest::getAccountType, (req, v) -> {
                req.setAccountType(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateVmrRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateVmrRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(AssociateVmrRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteCorpAdminsRequest, BatchDeleteCorpAdminsResponse> batchDeleteCorpAdmins =
        genForbatchDeleteCorpAdmins();

    private static HttpRequestDef<BatchDeleteCorpAdminsRequest, BatchDeleteCorpAdminsResponse> genForbatchDeleteCorpAdmins() {
        // basic
        HttpRequestDef.Builder<BatchDeleteCorpAdminsRequest, BatchDeleteCorpAdminsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteCorpAdminsRequest.class, BatchDeleteCorpAdminsResponse.class)
            .withName("BatchDeleteCorpAdmins")
            .withUri("/v1/usg/dcs/corp/admin/delete")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("accountType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchDeleteCorpAdminsRequest::getAccountType, (req, v) -> {
                req.setAccountType(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteCorpAdminsRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteCorpAdminsRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchDeleteCorpAdminsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteDevicesRequest, BatchDeleteDevicesResponse> batchDeleteDevices =
        genForbatchDeleteDevices();

    private static HttpRequestDef<BatchDeleteDevicesRequest, BatchDeleteDevicesResponse> genForbatchDeleteDevices() {
        // basic
        HttpRequestDef.Builder<BatchDeleteDevicesRequest, BatchDeleteDevicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteDevicesRequest.class, BatchDeleteDevicesResponse.class)
                .withName("BatchDeleteDevices")
                .withUri("/v1/usg/dcs/corp/device/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteDevicesRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteDevicesRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchDeleteDevicesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteMaterialsRequest, BatchDeleteMaterialsResponse> batchDeleteMaterials =
        genForbatchDeleteMaterials();

    private static HttpRequestDef<BatchDeleteMaterialsRequest, BatchDeleteMaterialsResponse> genForbatchDeleteMaterials() {
        // basic
        HttpRequestDef.Builder<BatchDeleteMaterialsRequest, BatchDeleteMaterialsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteMaterialsRequest.class, BatchDeleteMaterialsResponse.class)
            .withName("BatchDeleteMaterials")
            .withUri("/v1/usg/sss/materials/batch-delete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteMaterialsRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteMaterialsRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchDeleteMaterialsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteProgramsRequest, BatchDeleteProgramsResponse> batchDeletePrograms =
        genForbatchDeletePrograms();

    private static HttpRequestDef<BatchDeleteProgramsRequest, BatchDeleteProgramsResponse> genForbatchDeletePrograms() {
        // basic
        HttpRequestDef.Builder<BatchDeleteProgramsRequest, BatchDeleteProgramsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteProgramsRequest.class, BatchDeleteProgramsResponse.class)
                .withName("BatchDeletePrograms")
                .withUri("/v1/usg/sss/programs/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteProgramsRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteProgramsRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchDeleteProgramsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeletePublicationsRequest, BatchDeletePublicationsResponse> batchDeletePublications =
        genForbatchDeletePublications();

    private static HttpRequestDef<BatchDeletePublicationsRequest, BatchDeletePublicationsResponse> genForbatchDeletePublications() {
        // basic
        HttpRequestDef.Builder<BatchDeletePublicationsRequest, BatchDeletePublicationsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeletePublicationsRequest.class, BatchDeletePublicationsResponse.class)
            .withName("BatchDeletePublications")
            .withUri("/v1/usg/sss/publications/batch-delete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeletePublicationsRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeletePublicationsRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchDeletePublicationsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteUsersRequest, BatchDeleteUsersResponse> batchDeleteUsers =
        genForbatchDeleteUsers();

    private static HttpRequestDef<BatchDeleteUsersRequest, BatchDeleteUsersResponse> genForbatchDeleteUsers() {
        // basic
        HttpRequestDef.Builder<BatchDeleteUsersRequest, BatchDeleteUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteUsersRequest.class, BatchDeleteUsersResponse.class)
                .withName("BatchDeleteUsers")
                .withUri("/v1/usg/dcs/corp/member/delete")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("accountType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchDeleteUsersRequest::getAccountType, (req, v) -> {
                req.setAccountType(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteUsersRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteUsersRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchDeleteUsersRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchHandRequest, BatchHandResponse> batchHand = genForbatchHand();

    private static HttpRequestDef<BatchHandRequest, BatchHandResponse> genForbatchHand() {
        // basic
        HttpRequestDef.Builder<BatchHandRequest, BatchHandResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, BatchHandRequest.class, BatchHandResponse.class)
                .withName("BatchHand")
                .withUri("/v1/mmc/control/conferences/participants/batch/hands")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchHandRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchHandRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));
        builder.<RestBatchHandsUpReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestBatchHandsUpReqBody.class),
            f -> f.withMarshaller(BatchHandRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowUserDetailsRequest, BatchShowUserDetailsResponse> batchShowUserDetails =
        genForbatchShowUserDetails();

    private static HttpRequestDef<BatchShowUserDetailsRequest, BatchShowUserDetailsResponse> genForbatchShowUserDetails() {
        // basic
        HttpRequestDef.Builder<BatchShowUserDetailsRequest, BatchShowUserDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchShowUserDetailsRequest.class, BatchShowUserDetailsResponse.class)
            .withName("BatchShowUserDetails")
            .withUri("/v1/usg/abs/users/list")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("idType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowUserDetailsRequest::getIdType, (req, v) -> {
                req.setIdType(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowUserDetailsRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowUserDetailsRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<List<ShowUserRequestDTO>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchShowUserDetailsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(ShowUserRequestDTO.class));

        // response
        builder.<List<UserDTO>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchShowUserDetailsResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(UserDTO.class));

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateDevicesStatusRequest, BatchUpdateDevicesStatusResponse> batchUpdateDevicesStatus =
        genForbatchUpdateDevicesStatus();

    private static HttpRequestDef<BatchUpdateDevicesStatusRequest, BatchUpdateDevicesStatusResponse> genForbatchUpdateDevicesStatus() {
        // basic
        HttpRequestDef.Builder<BatchUpdateDevicesStatusRequest, BatchUpdateDevicesStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, BatchUpdateDevicesStatusRequest.class, BatchUpdateDevicesStatusResponse.class)
                .withName("BatchUpdateDevicesStatus")
                .withUri("/v1/usg/dcs/corp/device/status/{value}")
                .withContentType("application/json");

        // requests
        builder.<BatchUpdateDevicesStatusRequest.ValueEnum>withRequestField("value",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdateDevicesStatusRequest.ValueEnum.class),
            f -> f.withMarshaller(BatchUpdateDevicesStatusRequest::getValue, (req, v) -> {
                req.setValue(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateDevicesStatusRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateDevicesStatusRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchUpdateDevicesStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateUserStatusRequest, BatchUpdateUserStatusResponse> batchUpdateUserStatus =
        genForbatchUpdateUserStatus();

    private static HttpRequestDef<BatchUpdateUserStatusRequest, BatchUpdateUserStatusResponse> genForbatchUpdateUserStatus() {
        // basic
        HttpRequestDef.Builder<BatchUpdateUserStatusRequest, BatchUpdateUserStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, BatchUpdateUserStatusRequest.class, BatchUpdateUserStatusResponse.class)
            .withName("BatchUpdateUserStatus")
            .withUri("/v1/usg/dcs/corp/member/status/{value}")
            .withContentType("application/json");

        // requests
        builder.<BatchUpdateUserStatusRequest.ValueEnum>withRequestField("value",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdateUserStatusRequest.ValueEnum.class),
            f -> f.withMarshaller(BatchUpdateUserStatusRequest::getValue, (req, v) -> {
                req.setValue(v);
            }));
        builder.<Integer>withRequestField("accountType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchUpdateUserStatusRequest::getAccountType, (req, v) -> {
                req.setAccountType(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateUserStatusRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateUserStatusRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchUpdateUserStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BroadcastParticipantRequest, BroadcastParticipantResponse> broadcastParticipant =
        genForbroadcastParticipant();

    private static HttpRequestDef<BroadcastParticipantRequest, BroadcastParticipantResponse> genForbroadcastParticipant() {
        // basic
        HttpRequestDef.Builder<BroadcastParticipantRequest, BroadcastParticipantResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, BroadcastParticipantRequest.class, BroadcastParticipantResponse.class)
            .withName("BroadcastParticipant")
            .withUri("/v1/mmc/control/conferences/participants/broadcast")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BroadcastParticipantRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("participantID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BroadcastParticipantRequest::getParticipantID, (req, v) -> {
                req.setParticipantID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BroadcastParticipantRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelBroadcastRequest, CancelBroadcastResponse> cancelBroadcast =
        genForcancelBroadcast();

    private static HttpRequestDef<CancelBroadcastRequest, CancelBroadcastResponse> genForcancelBroadcast() {
        // basic
        HttpRequestDef.Builder<CancelBroadcastRequest, CancelBroadcastResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, CancelBroadcastRequest.class, CancelBroadcastResponse.class)
                .withName("CancelBroadcast")
                .withUri("/v1/mmc/control/conferences/cancelBroadcast")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelBroadcastRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelBroadcastRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelMeetingRequest, CancelMeetingResponse> cancelMeeting =
        genForcancelMeeting();

    private static HttpRequestDef<CancelMeetingRequest, CancelMeetingResponse> genForcancelMeeting() {
        // basic
        HttpRequestDef.Builder<CancelMeetingRequest, CancelMeetingResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, CancelMeetingRequest.class, CancelMeetingResponse.class)
                .withName("CancelMeeting")
                .withUri("/v1/mmc/management/conferences")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelMeetingRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelMeetingRequest::getUserUUID, (req, v) -> {
                req.setUserUUID(v);
            }));
        builder.<Integer>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CancelMeetingRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelMeetingRequest::getXAuthorizationType, (req, v) -> {
                req.setXAuthorizationType(v);
            }));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelMeetingRequest::getXSiteId, (req, v) -> {
                req.setXSiteId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelRecurringMeetingRequest, CancelRecurringMeetingResponse> cancelRecurringMeeting =
        genForcancelRecurringMeeting();

    private static HttpRequestDef<CancelRecurringMeetingRequest, CancelRecurringMeetingResponse> genForcancelRecurringMeeting() {
        // basic
        HttpRequestDef.Builder<CancelRecurringMeetingRequest, CancelRecurringMeetingResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, CancelRecurringMeetingRequest.class, CancelRecurringMeetingResponse.class)
            .withName("CancelRecurringMeeting")
            .withUri("/v1/mmc/management/cycleconferences")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelRecurringMeetingRequest::getUserUUID, (req, v) -> {
                req.setUserUUID(v);
            }));
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelRecurringMeetingRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<Integer>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CancelRecurringMeetingRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelRecurringMeetingRequest::getXAuthorizationType, (req, v) -> {
                req.setXAuthorizationType(v);
            }));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelRecurringMeetingRequest::getXSiteId, (req, v) -> {
                req.setXSiteId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelRecurringSubMeetingRequest, CancelRecurringSubMeetingResponse> cancelRecurringSubMeeting =
        genForcancelRecurringSubMeeting();

    private static HttpRequestDef<CancelRecurringSubMeetingRequest, CancelRecurringSubMeetingResponse> genForcancelRecurringSubMeeting() {
        // basic
        HttpRequestDef.Builder<CancelRecurringSubMeetingRequest, CancelRecurringSubMeetingResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    CancelRecurringSubMeetingRequest.class,
                    CancelRecurringSubMeetingResponse.class)
                .withName("CancelRecurringSubMeeting")
                .withUri("/v1/mmc/management/conferences/cyclesubconf")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelRecurringSubMeetingRequest::getUserUUID, (req, v) -> {
                req.setUserUUID(v);
            }));
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelRecurringSubMeetingRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<Integer>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CancelRecurringSubMeetingRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelRecurringSubMeetingRequest::getXAuthorizationType, (req, v) -> {
                req.setXAuthorizationType(v);
            }));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelRecurringSubMeetingRequest::getXSiteId, (req, v) -> {
                req.setXSiteId(v);
            }));
        builder.<RestCancelSingleRecordCycleConfListReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestCancelSingleRecordCycleConfListReqBody.class),
            f -> f.withMarshaller(CancelRecurringSubMeetingRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckSlideVerifyCodeRequest, CheckSlideVerifyCodeResponse> checkSlideVerifyCode =
        genForcheckSlideVerifyCode();

    private static HttpRequestDef<CheckSlideVerifyCodeRequest, CheckSlideVerifyCodeResponse> genForcheckSlideVerifyCode() {
        // basic
        HttpRequestDef.Builder<CheckSlideVerifyCodeRequest, CheckSlideVerifyCodeResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, CheckSlideVerifyCodeRequest.class, CheckSlideVerifyCodeResponse.class)
            .withName("CheckSlideVerifyCode")
            .withUri("/v1/usg/acs/auth/slideverifycode/check")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckSlideVerifyCodeRequest::getXRequestID, (req, v) -> {
                req.setXRequestID(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckSlideVerifyCodeRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<SlideVerifyCodeCheckDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SlideVerifyCodeCheckDTO.class),
            f -> f.withMarshaller(CheckSlideVerifyCodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckTokenRequest, CheckTokenResponse> checkToken = genForcheckToken();

    private static HttpRequestDef<CheckTokenRequest, CheckTokenResponse> genForcheckToken() {
        // basic
        HttpRequestDef.Builder<CheckTokenRequest, CheckTokenResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckTokenRequest.class, CheckTokenResponse.class)
                .withName("CheckToken")
                .withUri("/v1/usg/acs/token/validate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckTokenRequest::getXRequestID, (req, v) -> {
                req.setXRequestID(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckTokenRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<ValidateTokenReqDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ValidateTokenReqDTO.class),
            f -> f.withMarshaller(CheckTokenRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckVeriCodeForUpdateUserInfoRequest, CheckVeriCodeForUpdateUserInfoResponse> checkVeriCodeForUpdateUserInfo =
        genForcheckVeriCodeForUpdateUserInfo();

    private static HttpRequestDef<CheckVeriCodeForUpdateUserInfoRequest, CheckVeriCodeForUpdateUserInfoResponse> genForcheckVeriCodeForUpdateUserInfo() {
        // basic
        HttpRequestDef.Builder<CheckVeriCodeForUpdateUserInfoRequest, CheckVeriCodeForUpdateUserInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CheckVeriCodeForUpdateUserInfoRequest.class,
                    CheckVeriCodeForUpdateUserInfoResponse.class)
                .withName("CheckVeriCodeForUpdateUserInfo")
                .withUri("/v1/usg/dcs/member/verification-code/verify")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckVeriCodeForUpdateUserInfoRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckVeriCodeForUpdateUserInfoRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<VerificationCodeDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VerificationCodeDTO.class),
            f -> f.withMarshaller(CheckVeriCodeForUpdateUserInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckVerifyCodeRequest, CheckVerifyCodeResponse> checkVerifyCode =
        genForcheckVerifyCode();

    private static HttpRequestDef<CheckVerifyCodeRequest, CheckVerifyCodeResponse> genForcheckVerifyCode() {
        // basic
        HttpRequestDef.Builder<CheckVerifyCodeRequest, CheckVerifyCodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, CheckVerifyCodeRequest.class, CheckVerifyCodeResponse.class)
                .withName("CheckVerifyCode")
                .withUri("/v1/usg/acs/verifycode/check")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckVerifyCodeRequest::getXRequestID, (req, v) -> {
                req.setXRequestID(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckVerifyCodeRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<VerifyCodeCheckDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VerifyCodeCheckDTO.class),
            f -> f.withMarshaller(CheckVerifyCodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAnonymousAuthRandomRequest, CreateAnonymousAuthRandomResponse> createAnonymousAuthRandom =
        genForcreateAnonymousAuthRandom();

    private static HttpRequestDef<CreateAnonymousAuthRandomRequest, CreateAnonymousAuthRandomResponse> genForcreateAnonymousAuthRandom() {
        // basic
        HttpRequestDef.Builder<CreateAnonymousAuthRandomRequest, CreateAnonymousAuthRandomResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    CreateAnonymousAuthRandomRequest.class,
                    CreateAnonymousAuthRandomResponse.class)
                .withName("CreateAnonymousAuthRandom")
                .withUri("/v1/mmc/management/conferences/anonymous/auth")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAnonymousAuthRandomRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("X-Password",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAnonymousAuthRandomRequest::getXPassword, (req, v) -> {
                req.setXPassword(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateConfTokenRequest, CreateConfTokenResponse> createConfToken =
        genForcreateConfToken();

    private static HttpRequestDef<CreateConfTokenRequest, CreateConfTokenResponse> genForcreateConfToken() {
        // basic
        HttpRequestDef.Builder<CreateConfTokenRequest, CreateConfTokenResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CreateConfTokenRequest.class, CreateConfTokenResponse.class)
                .withName("CreateConfToken")
                .withUri("/v1/mmc/control/conferences/token")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateConfTokenRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateConfTokenRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));
        builder.<String>withRequestField("X-Password",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateConfTokenRequest::getXPassword, (req, v) -> {
                req.setXPassword(v);
            }));
        builder.<Integer>withRequestField("X-Login-Type",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateConfTokenRequest::getXLoginType, (req, v) -> {
                req.setXLoginType(v);
            }));
        builder.<String>withRequestField("X-Nonce",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateConfTokenRequest::getXNonce, (req, v) -> {
                req.setXNonce(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMeetingRequest, CreateMeetingResponse> createMeeting =
        genForcreateMeeting();

    private static HttpRequestDef<CreateMeetingRequest, CreateMeetingResponse> genForcreateMeeting() {
        // basic
        HttpRequestDef.Builder<CreateMeetingRequest, CreateMeetingResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMeetingRequest.class, CreateMeetingResponse.class)
                .withName("CreateMeeting")
                .withUri("/v1/mmc/management/conferences")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMeetingRequest::getUserUUID, (req, v) -> {
                req.setUserUUID(v);
            }));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMeetingRequest::getXAuthorizationType, (req, v) -> {
                req.setXAuthorizationType(v);
            }));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMeetingRequest::getXSiteId, (req, v) -> {
                req.setXSiteId(v);
            }));
        builder.<RestScheduleConfDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestScheduleConfDTO.class),
            f -> f.withMarshaller(CreateMeetingRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<ConferenceInfo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CreateMeetingResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(ConferenceInfo.class));

        return builder.build();
    }

    public static final HttpRequestDef<CreatePortalRefNonceRequest, CreatePortalRefNonceResponse> createPortalRefNonce =
        genForcreatePortalRefNonce();

    private static HttpRequestDef<CreatePortalRefNonceRequest, CreatePortalRefNonceResponse> genForcreatePortalRefNonce() {
        // basic
        HttpRequestDef.Builder<CreatePortalRefNonceRequest, CreatePortalRefNonceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreatePortalRefNonceRequest.class, CreatePortalRefNonceResponse.class)
            .withName("CreatePortalRefNonce")
            .withUri("/v1/usg/acs/auth/portal-ref-nonce")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePortalRefNonceRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePortalRefNonceRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRecurringMeetingRequest, CreateRecurringMeetingResponse> createRecurringMeeting =
        genForcreateRecurringMeeting();

    private static HttpRequestDef<CreateRecurringMeetingRequest, CreateRecurringMeetingResponse> genForcreateRecurringMeeting() {
        // basic
        HttpRequestDef.Builder<CreateRecurringMeetingRequest, CreateRecurringMeetingResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateRecurringMeetingRequest.class, CreateRecurringMeetingResponse.class)
            .withName("CreateRecurringMeeting")
            .withUri("/v1/mmc/management/cycleconferences")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRecurringMeetingRequest::getUserUUID, (req, v) -> {
                req.setUserUUID(v);
            }));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRecurringMeetingRequest::getXAuthorizationType, (req, v) -> {
                req.setXAuthorizationType(v);
            }));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRecurringMeetingRequest::getXSiteId, (req, v) -> {
                req.setXSiteId(v);
            }));
        builder.<RestScheduleConfDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestScheduleConfDTO.class),
            f -> f.withMarshaller(CreateRecurringMeetingRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<ConferenceInfo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CreateRecurringMeetingResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(ConferenceInfo.class));

        return builder.build();
    }

    public static final HttpRequestDef<CreateVisionActiveCodeRequest, CreateVisionActiveCodeResponse> createVisionActiveCode =
        genForcreateVisionActiveCode();

    private static HttpRequestDef<CreateVisionActiveCodeRequest, CreateVisionActiveCodeResponse> genForcreateVisionActiveCode() {
        // basic
        HttpRequestDef.Builder<CreateVisionActiveCodeRequest, CreateVisionActiveCodeResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateVisionActiveCodeRequest.class, CreateVisionActiveCodeResponse.class)
            .withName("CreateVisionActiveCode")
            .withUri("/v1/usg/dcs/corp/vision/activecode")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVisionActiveCodeRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVisionActiveCodeRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<VisionActiveCodeDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VisionActiveCodeDTO.class),
            f -> f.withMarshaller(CreateVisionActiveCodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWebSocketTokenRequest, CreateWebSocketTokenResponse> createWebSocketToken =
        genForcreateWebSocketToken();

    private static HttpRequestDef<CreateWebSocketTokenRequest, CreateWebSocketTokenResponse> genForcreateWebSocketToken() {
        // basic
        HttpRequestDef.Builder<CreateWebSocketTokenRequest, CreateWebSocketTokenResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, CreateWebSocketTokenRequest.class, CreateWebSocketTokenResponse.class)
            .withName("CreateWebSocketToken")
            .withUri("/v1/mmc/control/conferences/wsToken")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateWebSocketTokenRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateWebSocketTokenRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWebinarRequest, CreateWebinarResponse> createWebinar =
        genForcreateWebinar();

    private static HttpRequestDef<CreateWebinarRequest, CreateWebinarResponse> genForcreateWebinar() {
        // basic
        HttpRequestDef.Builder<CreateWebinarRequest, CreateWebinarResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateWebinarRequest.class, CreateWebinarResponse.class)
                .withName("CreateWebinar")
                .withUri("/v1/wss/webinar/open/conferences")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateWebinarRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateWebinarRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<OpenScheduleConfReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpenScheduleConfReq.class),
            f -> f.withMarshaller(CreateWebinarRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAttendeesRequest, DeleteAttendeesResponse> deleteAttendees =
        genFordeleteAttendees();

    private static HttpRequestDef<DeleteAttendeesRequest, DeleteAttendeesResponse> genFordeleteAttendees() {
        // basic
        HttpRequestDef.Builder<DeleteAttendeesRequest, DeleteAttendeesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteAttendeesRequest.class, DeleteAttendeesResponse.class)
                .withName("DeleteAttendees")
                .withUri("/v1/mmc/control/conferences/attendees/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAttendeesRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAttendeesRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));
        builder.<RestBulkDelAttendReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestBulkDelAttendReqBody.class),
            f -> f.withMarshaller(DeleteAttendeesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCorpRequest, DeleteCorpResponse> deleteCorp = genFordeleteCorp();

    private static HttpRequestDef<DeleteCorpRequest, DeleteCorpResponse> genFordeleteCorp() {
        // basic
        HttpRequestDef.Builder<DeleteCorpRequest, DeleteCorpResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCorpRequest.class, DeleteCorpResponse.class)
                .withName("DeleteCorp")
                .withUri("/v1/usg/dcs/sp/corp/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCorpRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCorpRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCorpRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCorpVmrRequest, DeleteCorpVmrResponse> deleteCorpVmr =
        genFordeleteCorpVmr();

    private static HttpRequestDef<DeleteCorpVmrRequest, DeleteCorpVmrResponse> genFordeleteCorpVmr() {
        // basic
        HttpRequestDef.Builder<DeleteCorpVmrRequest, DeleteCorpVmrResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteCorpVmrRequest.class, DeleteCorpVmrResponse.class)
                .withName("DeleteCorpVmr")
                .withUri("/v1/usg/dcs/corp/vmr/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCorpVmrRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCorpVmrRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteCorpVmrRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDepartmentRequest, DeleteDepartmentResponse> deleteDepartment =
        genFordeleteDepartment();

    private static HttpRequestDef<DeleteDepartmentRequest, DeleteDepartmentResponse> genFordeleteDepartment() {
        // basic
        HttpRequestDef.Builder<DeleteDepartmentRequest, DeleteDepartmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDepartmentRequest.class, DeleteDepartmentResponse.class)
                .withName("DeleteDepartment")
                .withUri("/v1/usg/dcs/corp/dept/{dept_code}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("dept_code",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDepartmentRequest::getDeptCode, (req, v) -> {
                req.setDeptCode(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDepartmentRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDepartmentRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLayoutRequest, DeleteLayoutResponse> deleteLayout = genFordeleteLayout();

    private static HttpRequestDef<DeleteLayoutRequest, DeleteLayoutResponse> genFordeleteLayout() {
        // basic
        HttpRequestDef.Builder<DeleteLayoutRequest, DeleteLayoutResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteLayoutRequest.class, DeleteLayoutResponse.class)
                .withName("DeleteLayout")
                .withUri("/v1/mmc/control/conferences/layOut")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLayoutRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("uuID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLayoutRequest::getUuID, (req, v) -> {
                req.setUuID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLayoutRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRecordingsRequest, DeleteRecordingsResponse> deleteRecordings =
        genFordeleteRecordings();

    private static HttpRequestDef<DeleteRecordingsRequest, DeleteRecordingsResponse> genFordeleteRecordings() {
        // basic
        HttpRequestDef.Builder<DeleteRecordingsRequest, DeleteRecordingsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRecordingsRequest.class, DeleteRecordingsResponse.class)
                .withName("DeleteRecordings")
                .withUri("/v1/mmc/management/record/files")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("confUUIDs",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRecordingsRequest::getConfUUIDs, (req, v) -> {
                req.setConfUUIDs(v);
            }));
        builder.<String>withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRecordingsRequest::getUserUUID, (req, v) -> {
                req.setUserUUID(v);
            }));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRecordingsRequest::getXAuthorizationType, (req, v) -> {
                req.setXAuthorizationType(v);
            }));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRecordingsRequest::getXSiteId, (req, v) -> {
                req.setXSiteId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResourceRequest, DeleteResourceResponse> deleteResource =
        genFordeleteResource();

    private static HttpRequestDef<DeleteResourceRequest, DeleteResourceResponse> genFordeleteResource() {
        // basic
        HttpRequestDef.Builder<DeleteResourceRequest, DeleteResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteResourceRequest.class, DeleteResourceResponse.class)
                .withName("DeleteResource")
                .withUri("/v1/usg/dcs/sp/corp/{corp_id}/resource/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("corp_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceRequest::getCorpId, (req, v) -> {
                req.setCorpId(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteResourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTokenRequest, DeleteTokenResponse> deleteToken = genFordeleteToken();

    private static HttpRequestDef<DeleteTokenRequest, DeleteTokenResponse> genFordeleteToken() {
        // basic
        HttpRequestDef.Builder<DeleteTokenRequest, DeleteTokenResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTokenRequest.class, DeleteTokenResponse.class)
                .withName("DeleteToken")
                .withUri("/v1/usg/acs/token")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTokenRequest::getXRequestID, (req, v) -> {
                req.setXRequestID(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTokenRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVisionActiveCodeRequest, DeleteVisionActiveCodeResponse> deleteVisionActiveCode =
        genFordeleteVisionActiveCode();

    private static HttpRequestDef<DeleteVisionActiveCodeRequest, DeleteVisionActiveCodeResponse> genFordeleteVisionActiveCode() {
        // basic
        HttpRequestDef.Builder<DeleteVisionActiveCodeRequest, DeleteVisionActiveCodeResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteVisionActiveCodeRequest.class, DeleteVisionActiveCodeResponse.class)
            .withName("DeleteVisionActiveCode")
            .withUri("/v1/usg/dcs/corp/vision/activecode")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVisionActiveCodeRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVisionActiveCodeRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteVisionActiveCodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWebHookConfigRequest, DeleteWebHookConfigResponse> deleteWebHookConfig =
        genFordeleteWebHookConfig();

    private static HttpRequestDef<DeleteWebHookConfigRequest, DeleteWebHookConfigResponse> genFordeleteWebHookConfig() {
        // basic
        HttpRequestDef.Builder<DeleteWebHookConfigRequest, DeleteWebHookConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteWebHookConfigRequest.class, DeleteWebHookConfigResponse.class)
            .withName("DeleteWebHookConfig")
            .withUri("/v1/mmc/management/webhook/link-config")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWebHookConfigRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWebinarRequest, DeleteWebinarResponse> deleteWebinar =
        genFordeleteWebinar();

    private static HttpRequestDef<DeleteWebinarRequest, DeleteWebinarResponse> genFordeleteWebinar() {
        // basic
        HttpRequestDef.Builder<DeleteWebinarRequest, DeleteWebinarResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteWebinarRequest.class, DeleteWebinarResponse.class)
                .withName("DeleteWebinar")
                .withUri("/v1/wss/webinar/open/conferences/{conference_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conference_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWebinarRequest::getConferenceId, (req, v) -> {
                req.setConferenceId(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWebinarRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWebinarRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateVmrRequest, DisassociateVmrResponse> disassociateVmr =
        genFordisassociateVmr();

    private static HttpRequestDef<DisassociateVmrRequest, DisassociateVmrResponse> genFordisassociateVmr() {
        // basic
        HttpRequestDef.Builder<DisassociateVmrRequest, DisassociateVmrResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisassociateVmrRequest.class, DisassociateVmrResponse.class)
                .withName("DisassociateVmr")
                .withUri("/v1/usg/dcs/corp/vmr/recycle-from-member/{account}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("account",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateVmrRequest::getAccount, (req, v) -> {
                req.setAccount(v);
            }));
        builder.<Integer>withRequestField("accountType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DisassociateVmrRequest::getAccountType, (req, v) -> {
                req.setAccountType(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateVmrRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateVmrRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DisassociateVmrRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<HandRequest, HandResponse> hand = genForhand();

    private static HttpRequestDef<HandRequest, HandResponse> genForhand() {
        // basic
        HttpRequestDef.Builder<HandRequest, HandResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, HandRequest.class, HandResponse.class)
                .withName("Hand")
                .withUri("/v1/mmc/control/conferences/participants/hands")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(HandRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("participantID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(HandRequest::getParticipantID, (req, v) -> {
                req.setParticipantID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(HandRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));
        builder.<RestHandsUpReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestHandsUpReqBody.class),
            f -> f.withMarshaller(HandRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<HangUpRequest, HangUpResponse> hangUp = genForhangUp();

    private static HttpRequestDef<HangUpRequest, HangUpResponse> genForhangUp() {
        // basic
        HttpRequestDef.Builder<HangUpRequest, HangUpResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, HangUpRequest.class, HangUpResponse.class)
                .withName("HangUp")
                .withUri("/v1/mmc/control/conferences/participants/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(HangUpRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(HangUpRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));
        builder.<RestBulkHangUpReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestBulkHangUpReqBody.class),
            f -> f.withMarshaller(HangUpRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<InviteOperateVideoRequest, InviteOperateVideoResponse> inviteOperateVideo =
        genForinviteOperateVideo();

    private static HttpRequestDef<InviteOperateVideoRequest, InviteOperateVideoResponse> genForinviteOperateVideo() {
        // basic
        HttpRequestDef.Builder<InviteOperateVideoRequest, InviteOperateVideoResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, InviteOperateVideoRequest.class, InviteOperateVideoResponse.class)
                .withName("InviteOperateVideo")
                .withUri("/v1/mmc/control/conferences/participants/video")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InviteOperateVideoRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("participantID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InviteOperateVideoRequest::getParticipantID, (req, v) -> {
                req.setParticipantID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InviteOperateVideoRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));
        builder.<RestVideoBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestVideoBody.class),
            f -> f.withMarshaller(InviteOperateVideoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<InviteParticipantRequest, InviteParticipantResponse> inviteParticipant =
        genForinviteParticipant();

    private static HttpRequestDef<InviteParticipantRequest, InviteParticipantResponse> genForinviteParticipant() {
        // basic
        HttpRequestDef.Builder<InviteParticipantRequest, InviteParticipantResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, InviteParticipantRequest.class, InviteParticipantResponse.class)
                .withName("InviteParticipant")
                .withUri("/v1/mmc/control/conferences/participants")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InviteParticipantRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InviteParticipantRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));
        builder.<RestInviteReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestInviteReqBody.class),
            f -> f.withMarshaller(InviteParticipantRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<InviteShareRequest, InviteShareResponse> inviteShare = genForinviteShare();

    private static HttpRequestDef<InviteShareRequest, InviteShareResponse> genForinviteShare() {
        // basic
        HttpRequestDef.Builder<InviteShareRequest, InviteShareResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, InviteShareRequest.class, InviteShareResponse.class)
                .withName("InviteShare")
                .withUri("/v1/mmc/control/conferences/participants/share/invite")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InviteShareRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("participantID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InviteShareRequest::getParticipantID, (req, v) -> {
                req.setParticipantID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InviteShareRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));
        builder.<InviteShareDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InviteShareDTO.class),
            f -> f.withMarshaller(InviteShareRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<InviteUserRequest, InviteUserResponse> inviteUser = genForinviteUser();

    private static HttpRequestDef<InviteUserRequest, InviteUserResponse> genForinviteUser() {
        // basic
        HttpRequestDef.Builder<InviteUserRequest, InviteUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, InviteUserRequest.class, InviteUserResponse.class)
                .withName("InviteUser")
                .withUri("/v1/usg/dcs/corp/member/add")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InviteUserRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InviteUserRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<AddUserRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddUserRequestBody.class),
            f -> f.withMarshaller(InviteUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<InviteWithPwdRequest, InviteWithPwdResponse> inviteWithPwd =
        genForinviteWithPwd();

    private static HttpRequestDef<InviteWithPwdRequest, InviteWithPwdResponse> genForinviteWithPwd() {
        // basic
        HttpRequestDef.Builder<InviteWithPwdRequest, InviteWithPwdResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, InviteWithPwdRequest.class, InviteWithPwdResponse.class)
                .withName("InviteWithPwd")
                .withUri("/v1/mmc/control/conferences/inviteWithPwd")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InviteWithPwdRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<RestInviteWithPwdReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestInviteWithPwdReqBody.class),
            f -> f.withMarshaller(InviteWithPwdRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHistoryWebinarsRequest, ListHistoryWebinarsResponse> listHistoryWebinars =
        genForlistHistoryWebinars();

    private static HttpRequestDef<ListHistoryWebinarsRequest, ListHistoryWebinarsResponse> genForlistHistoryWebinars() {
        // basic
        HttpRequestDef.Builder<ListHistoryWebinarsRequest, ListHistoryWebinarsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHistoryWebinarsRequest.class, ListHistoryWebinarsResponse.class)
                .withName("ListHistoryWebinars")
                .withUri("/v1/wss/webinar/open/conferences/history")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHistoryWebinarsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHistoryWebinarsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryWebinarsRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            }));
        builder.<String>withRequestField("sortType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryWebinarsRequest::getSortType, (req, v) -> {
                req.setSortType(v);
            }));
        builder.<String>withRequestField("startTime",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryWebinarsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("endTime",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryWebinarsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryWebinarsRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryWebinarsRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOngoingWebinarsRequest, ListOngoingWebinarsResponse> listOngoingWebinars =
        genForlistOngoingWebinars();

    private static HttpRequestDef<ListOngoingWebinarsRequest, ListOngoingWebinarsResponse> genForlistOngoingWebinars() {
        // basic
        HttpRequestDef.Builder<ListOngoingWebinarsRequest, ListOngoingWebinarsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListOngoingWebinarsRequest.class, ListOngoingWebinarsResponse.class)
                .withName("ListOngoingWebinars")
                .withUri("/v1/wss/webinar/open/conferences/ongoing")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOngoingWebinarsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOngoingWebinarsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOngoingWebinarsRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            }));
        builder.<String>withRequestField("sortType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOngoingWebinarsRequest::getSortType, (req, v) -> {
                req.setSortType(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOngoingWebinarsRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOngoingWebinarsRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUpComingWebinarsRequest, ListUpComingWebinarsResponse> listUpComingWebinars =
        genForlistUpComingWebinars();

    private static HttpRequestDef<ListUpComingWebinarsRequest, ListUpComingWebinarsResponse> genForlistUpComingWebinars() {
        // basic
        HttpRequestDef.Builder<ListUpComingWebinarsRequest, ListUpComingWebinarsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListUpComingWebinarsRequest.class, ListUpComingWebinarsResponse.class)
            .withName("ListUpComingWebinars")
            .withUri("/v1/wss/webinar/open/conferences/upcoming")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUpComingWebinarsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUpComingWebinarsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUpComingWebinarsRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            }));
        builder.<String>withRequestField("sortType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUpComingWebinarsRequest::getSortType, (req, v) -> {
                req.setSortType(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUpComingWebinarsRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUpComingWebinarsRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<LiveRequest, LiveResponse> live = genForlive();

    private static HttpRequestDef<LiveRequest, LiveResponse> genForlive() {
        // basic
        HttpRequestDef.Builder<LiveRequest, LiveResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, LiveRequest.class, LiveResponse.class)
                .withName("Live")
                .withUri("/v1/mmc/control/conferences/live")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(LiveRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(LiveRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));
        builder.<RestSetLiveReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestSetLiveReqBody.class),
            f -> f.withMarshaller(LiveRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<LockMeetingRequest, LockMeetingResponse> lockMeeting = genForlockMeeting();

    private static HttpRequestDef<LockMeetingRequest, LockMeetingResponse> genForlockMeeting() {
        // basic
        HttpRequestDef.Builder<LockMeetingRequest, LockMeetingResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, LockMeetingRequest.class, LockMeetingResponse.class)
                .withName("LockMeeting")
                .withUri("/v1/mmc/control/conferences/lock")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(LockMeetingRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(LockMeetingRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));
        builder.<RestLockReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestLockReqBody.class),
            f -> f.withMarshaller(LockMeetingRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<LockViewRequest, LockViewResponse> lockView = genForlockView();

    private static HttpRequestDef<LockViewRequest, LockViewResponse> genForlockView() {
        // basic
        HttpRequestDef.Builder<LockViewRequest, LockViewResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, LockViewRequest.class, LockViewResponse.class)
                .withName("LockView")
                .withUri("/v1/mmc/control/conferences/lockView")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(LockViewRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("participantID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(LockViewRequest::getParticipantID, (req, v) -> {
                req.setParticipantID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(LockViewRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));
        builder.<RestLockSiteViewReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestLockSiteViewReqBody.class),
            f -> f.withMarshaller(LockViewRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<MoveToWaitingRoomRequest, MoveToWaitingRoomResponse> moveToWaitingRoom =
        genFormoveToWaitingRoom();

    private static HttpRequestDef<MoveToWaitingRoomRequest, MoveToWaitingRoomResponse> genFormoveToWaitingRoom() {
        // basic
        HttpRequestDef.Builder<MoveToWaitingRoomRequest, MoveToWaitingRoomResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, MoveToWaitingRoomRequest.class, MoveToWaitingRoomResponse.class)
                .withName("MoveToWaitingRoom")
                .withUri("/v1/mmc/control/conferences/moveToWaitingRoom")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MoveToWaitingRoomRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MoveToWaitingRoomRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));
        builder.<RestMoveToWaitingRoomReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestMoveToWaitingRoomReqBody.class),
            f -> f.withMarshaller(MoveToWaitingRoomRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<MuteMeetingRequest, MuteMeetingResponse> muteMeeting = genFormuteMeeting();

    private static HttpRequestDef<MuteMeetingRequest, MuteMeetingResponse> genFormuteMeeting() {
        // basic
        HttpRequestDef.Builder<MuteMeetingRequest, MuteMeetingResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, MuteMeetingRequest.class, MuteMeetingResponse.class)
                .withName("MuteMeeting")
                .withUri("/v1/mmc/control/conferences/mute")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MuteMeetingRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MuteMeetingRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));
        builder.<RestMuteReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestMuteReqBody.class),
            f -> f.withMarshaller(MuteMeetingRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<MuteParticipantRequest, MuteParticipantResponse> muteParticipant =
        genFormuteParticipant();

    private static HttpRequestDef<MuteParticipantRequest, MuteParticipantResponse> genFormuteParticipant() {
        // basic
        HttpRequestDef.Builder<MuteParticipantRequest, MuteParticipantResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, MuteParticipantRequest.class, MuteParticipantResponse.class)
                .withName("MuteParticipant")
                .withUri("/v1/mmc/control/conferences/participants/mute")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MuteParticipantRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("participantID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MuteParticipantRequest::getParticipantID, (req, v) -> {
                req.setParticipantID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MuteParticipantRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));
        builder.<RestMuteParticipantReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestMuteParticipantReqBody.class),
            f -> f.withMarshaller(MuteParticipantRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ProlongMeetingRequest, ProlongMeetingResponse> prolongMeeting =
        genForprolongMeeting();

    private static HttpRequestDef<ProlongMeetingRequest, ProlongMeetingResponse> genForprolongMeeting() {
        // basic
        HttpRequestDef.Builder<ProlongMeetingRequest, ProlongMeetingResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ProlongMeetingRequest.class, ProlongMeetingResponse.class)
                .withName("ProlongMeeting")
                .withUri("/v1/mmc/control/conferences/duration")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ProlongMeetingRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ProlongMeetingRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));
        builder.<RestProlongDurReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestProlongDurReqBody.class),
            f -> f.withMarshaller(ProlongMeetingRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecordRequest, RecordResponse> record = genForrecord();

    private static HttpRequestDef<RecordRequest, RecordResponse> genForrecord() {
        // basic
        HttpRequestDef.Builder<RecordRequest, RecordResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, RecordRequest.class, RecordResponse.class)
                .withName("Record")
                .withUri("/v1/mmc/control/conferences/record")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecordRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecordRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));
        builder.<RestSetRecordReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestSetRecordReqBody.class),
            f -> f.withMarshaller(RecordRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RenameParticipantRequest, RenameParticipantResponse> renameParticipant =
        genForrenameParticipant();

    private static HttpRequestDef<RenameParticipantRequest, RenameParticipantResponse> genForrenameParticipant() {
        // basic
        HttpRequestDef.Builder<RenameParticipantRequest, RenameParticipantResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, RenameParticipantRequest.class, RenameParticipantResponse.class)
                .withName("RenameParticipant")
                .withUri("/v1/mmc/control/conferences/participants/name")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RenameParticipantRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RenameParticipantRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));
        builder.<RestRenamePartReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestRenamePartReqBody.class),
            f -> f.withMarshaller(RenameParticipantRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetActivecodeRequest, ResetActivecodeResponse> resetActivecode =
        genForresetActivecode();

    private static HttpRequestDef<ResetActivecodeRequest, ResetActivecodeResponse> genForresetActivecode() {
        // basic
        HttpRequestDef.Builder<ResetActivecodeRequest, ResetActivecodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetActivecodeRequest.class, ResetActivecodeResponse.class)
                .withName("ResetActivecode")
                .withUri("/v1/usg/dcs/corp/device/{sn}/activecode")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("sn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetActivecodeRequest::getSn, (req, v) -> {
                req.setSn(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetActivecodeRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetActivecodeRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<ActiveDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ActiveDTO.class),
            f -> f.withMarshaller(ResetActivecodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetPwdRequest, ResetPwdResponse> resetPwd = genForresetPwd();

    private static HttpRequestDef<ResetPwdRequest, ResetPwdResponse> genForresetPwd() {
        // basic
        HttpRequestDef.Builder<ResetPwdRequest, ResetPwdResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ResetPwdRequest.class, ResetPwdResponse.class)
                .withName("ResetPwd")
                .withUri("/v1/usg/acs/password/reset")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetPwdRequest::getXRequestID, (req, v) -> {
                req.setXRequestID(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetPwdRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<ResetPwdReqDTOV1>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetPwdReqDTOV1.class),
            f -> f.withMarshaller(ResetPwdRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetPwdByAdminRequest, ResetPwdByAdminResponse> resetPwdByAdmin =
        genForresetPwdByAdmin();

    private static HttpRequestDef<ResetPwdByAdminRequest, ResetPwdByAdminResponse> genForresetPwdByAdmin() {
        // basic
        HttpRequestDef.Builder<ResetPwdByAdminRequest, ResetPwdByAdminResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ResetPwdByAdminRequest.class, ResetPwdByAdminResponse.class)
                .withName("ResetPwdByAdmin")
                .withUri("/v1/usg/acs/password/admin/reset")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetPwdByAdminRequest::getXRequestID, (req, v) -> {
                req.setXRequestID(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetPwdByAdminRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<AdminResetPwdReqDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AdminResetPwdReqDTO.class),
            f -> f.withMarshaller(ResetPwdByAdminRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetVisionActiveCodeRequest, ResetVisionActiveCodeResponse> resetVisionActiveCode =
        genForresetVisionActiveCode();

    private static HttpRequestDef<ResetVisionActiveCodeRequest, ResetVisionActiveCodeResponse> genForresetVisionActiveCode() {
        // basic
        HttpRequestDef.Builder<ResetVisionActiveCodeRequest, ResetVisionActiveCodeResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, ResetVisionActiveCodeRequest.class, ResetVisionActiveCodeResponse.class)
            .withName("ResetVisionActiveCode")
            .withUri("/v1/usg/dcs/corp/vision/activecode/{account}/reset")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("account",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetVisionActiveCodeRequest::getAccount, (req, v) -> {
                req.setAccount(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetVisionActiveCodeRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetVisionActiveCodeRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<ActiveDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ActiveDTO.class),
            f -> f.withMarshaller(ResetVisionActiveCodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResumeSimultaneousInterpretationRequest, ResumeSimultaneousInterpretationResponse> resumeSimultaneousInterpretation =
        genForresumeSimultaneousInterpretation();

    private static HttpRequestDef<ResumeSimultaneousInterpretationRequest, ResumeSimultaneousInterpretationResponse> genForresumeSimultaneousInterpretation() {
        // basic
        HttpRequestDef.Builder<ResumeSimultaneousInterpretationRequest, ResumeSimultaneousInterpretationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    ResumeSimultaneousInterpretationRequest.class,
                    ResumeSimultaneousInterpretationResponse.class)
                .withName("ResumeSimultaneousInterpretation")
                .withUri("/v1/mmc/control/conferences/simultaneousInterpretation")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResumeSimultaneousInterpretationRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResumeSimultaneousInterpretationRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));
        builder.<RestSimultaneousInterpretationBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestSimultaneousInterpretationBody.class),
            f -> f.withMarshaller(ResumeSimultaneousInterpretationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RollcallParticipantRequest, RollcallParticipantResponse> rollcallParticipant =
        genForrollcallParticipant();

    private static HttpRequestDef<RollcallParticipantRequest, RollcallParticipantResponse> genForrollcallParticipant() {
        // basic
        HttpRequestDef.Builder<RollcallParticipantRequest, RollcallParticipantResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, RollcallParticipantRequest.class, RollcallParticipantResponse.class)
                .withName("RollcallParticipant")
                .withUri("/v1/mmc/control/conferences/participants/rollCall")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RollcallParticipantRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("participantID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RollcallParticipantRequest::getParticipantID, (req, v) -> {
                req.setParticipantID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RollcallParticipantRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SaveLayoutRequest, SaveLayoutResponse> saveLayout = genForsaveLayout();

    private static HttpRequestDef<SaveLayoutRequest, SaveLayoutResponse> genForsaveLayout() {
        // basic
        HttpRequestDef.Builder<SaveLayoutRequest, SaveLayoutResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SaveLayoutRequest.class, SaveLayoutResponse.class)
                .withName("SaveLayout")
                .withUri("/v1/mmc/control/conferences/layOut")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveLayoutRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveLayoutRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));
        builder.<RestPicLayoutBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestPicLayoutBody.class),
            f -> f.withMarshaller(SaveLayoutRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchAttendanceRecordsOfHisMeetingRequest, SearchAttendanceRecordsOfHisMeetingResponse> searchAttendanceRecordsOfHisMeeting =
        genForsearchAttendanceRecordsOfHisMeeting();

    private static HttpRequestDef<SearchAttendanceRecordsOfHisMeetingRequest, SearchAttendanceRecordsOfHisMeetingResponse> genForsearchAttendanceRecordsOfHisMeeting() {
        // basic
        HttpRequestDef.Builder<SearchAttendanceRecordsOfHisMeetingRequest, SearchAttendanceRecordsOfHisMeetingResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    SearchAttendanceRecordsOfHisMeetingRequest.class,
                    SearchAttendanceRecordsOfHisMeetingResponse.class)
                .withName("SearchAttendanceRecordsOfHisMeeting")
                .withUri("/v1/mmc/management/conferences/history/confAttendeeRecord")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("confUUID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchAttendanceRecordsOfHisMeetingRequest::getConfUUID, (req, v) -> {
                req.setConfUUID(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchAttendanceRecordsOfHisMeetingRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchAttendanceRecordsOfHisMeetingRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchAttendanceRecordsOfHisMeetingRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            }));
        builder.<String>withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchAttendanceRecordsOfHisMeetingRequest::getUserUUID, (req, v) -> {
                req.setUserUUID(v);
            }));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchAttendanceRecordsOfHisMeetingRequest::getXAuthorizationType, (req, v) -> {
                req.setXAuthorizationType(v);
            }));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchAttendanceRecordsOfHisMeetingRequest::getXSiteId, (req, v) -> {
                req.setXSiteId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchAttendanceRecordsOfHisMeetingRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchCorpRequest, SearchCorpResponse> searchCorp = genForsearchCorp();

    private static HttpRequestDef<SearchCorpRequest, SearchCorpResponse> genForsearchCorp() {
        // basic
        HttpRequestDef.Builder<SearchCorpRequest, SearchCorpResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchCorpRequest.class, SearchCorpResponse.class)
                .withName("SearchCorp")
                .withUri("/v1/usg/dcs/sp/corp")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCorpRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCorpRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchCorpAdminsRequest, SearchCorpAdminsResponse> searchCorpAdmins =
        genForsearchCorpAdmins();

    private static HttpRequestDef<SearchCorpAdminsRequest, SearchCorpAdminsResponse> genForsearchCorpAdmins() {
        // basic
        HttpRequestDef.Builder<SearchCorpAdminsRequest, SearchCorpAdminsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchCorpAdminsRequest.class, SearchCorpAdminsResponse.class)
                .withName("SearchCorpAdmins")
                .withUri("/v1/usg/dcs/corp/admin")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCorpAdminsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCorpAdminsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpAdminsRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpAdminsRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpAdminsRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchCorpDirRequest, SearchCorpDirResponse> searchCorpDir =
        genForsearchCorpDir();

    private static HttpRequestDef<SearchCorpDirRequest, SearchCorpDirResponse> genForsearchCorpDir() {
        // basic
        HttpRequestDef.Builder<SearchCorpDirRequest, SearchCorpDirResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchCorpDirRequest.class, SearchCorpDirResponse.class)
                .withName("SearchCorpDir")
                .withUri("/v1/usg/abs/users")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCorpDirRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCorpDirRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpDirRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            }));
        builder.<String>withRequestField("deptCode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpDirRequest::getDeptCode, (req, v) -> {
                req.setDeptCode(v);
            }));
        builder.<Boolean>withRequestField("querySubDept",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(SearchCorpDirRequest::getQuerySubDept, (req, v) -> {
                req.setQuerySubDept(v);
            }));
        builder.<String>withRequestField("searchScope",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpDirRequest::getSearchScope, (req, v) -> {
                req.setSearchScope(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpDirRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpDirRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchCorpExternalDirRequest, SearchCorpExternalDirResponse> searchCorpExternalDir =
        genForsearchCorpExternalDir();

    private static HttpRequestDef<SearchCorpExternalDirRequest, SearchCorpExternalDirResponse> genForsearchCorpExternalDir() {
        // basic
        HttpRequestDef.Builder<SearchCorpExternalDirRequest, SearchCorpExternalDirResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, SearchCorpExternalDirRequest.class, SearchCorpExternalDirResponse.class)
            .withName("SearchCorpExternalDir")
            .withUri("/v1/usg/abs/external-contacts")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCorpExternalDirRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCorpExternalDirRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpExternalDirRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            }));
        builder.<String>withRequestField("searchScope",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpExternalDirRequest::getSearchScope, (req, v) -> {
                req.setSearchScope(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpExternalDirRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpExternalDirRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchCorpResourcesRequest, SearchCorpResourcesResponse> searchCorpResources =
        genForsearchCorpResources();

    private static HttpRequestDef<SearchCorpResourcesRequest, SearchCorpResourcesResponse> genForsearchCorpResources() {
        // basic
        HttpRequestDef.Builder<SearchCorpResourcesRequest, SearchCorpResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchCorpResourcesRequest.class, SearchCorpResourcesResponse.class)
                .withName("SearchCorpResources")
                .withUri("/v1/usg/dcs/corp/resource-list")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCorpResourcesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCorpResourcesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpResourcesRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            }));
        builder.<Long>withRequestField("startExpireDate",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchCorpResourcesRequest::getStartExpireDate, (req, v) -> {
                req.setStartExpireDate(v);
            }));
        builder.<Long>withRequestField("endExpireDate",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchCorpResourcesRequest::getEndExpireDate, (req, v) -> {
                req.setEndExpireDate(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpResourcesRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<Integer>withRequestField("vmrMode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCorpResourcesRequest::getVmrMode, (req, v) -> {
                req.setVmrMode(v);
            }));
        builder.<String>withRequestField("typeId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpResourcesRequest::getTypeId, (req, v) -> {
                req.setTypeId(v);
            }));
        builder.<String>withRequestField("orderId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpResourcesRequest::getOrderId, (req, v) -> {
                req.setOrderId(v);
            }));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCorpResourcesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpResourcesRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpResourcesRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchCorpVmrRequest, SearchCorpVmrResponse> searchCorpVmr =
        genForsearchCorpVmr();

    private static HttpRequestDef<SearchCorpVmrRequest, SearchCorpVmrResponse> genForsearchCorpVmr() {
        // basic
        HttpRequestDef.Builder<SearchCorpVmrRequest, SearchCorpVmrResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchCorpVmrRequest.class, SearchCorpVmrResponse.class)
                .withName("SearchCorpVmr")
                .withUri("/v1/usg/dcs/corp/vmr")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCorpVmrRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCorpVmrRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpVmrRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            }));
        builder.<Integer>withRequestField("vmrMode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCorpVmrRequest::getVmrMode, (req, v) -> {
                req.setVmrMode(v);
            }));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCorpVmrRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpVmrRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpVmrRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchCtlRecordsOfHisMeetingRequest, SearchCtlRecordsOfHisMeetingResponse> searchCtlRecordsOfHisMeeting =
        genForsearchCtlRecordsOfHisMeeting();

    private static HttpRequestDef<SearchCtlRecordsOfHisMeetingRequest, SearchCtlRecordsOfHisMeetingResponse> genForsearchCtlRecordsOfHisMeeting() {
        // basic
        HttpRequestDef.Builder<SearchCtlRecordsOfHisMeetingRequest, SearchCtlRecordsOfHisMeetingResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    SearchCtlRecordsOfHisMeetingRequest.class,
                    SearchCtlRecordsOfHisMeetingResponse.class)
                .withName("SearchCtlRecordsOfHisMeeting")
                .withUri("/v1/mmc/management/conferences/history/confCtlRecord")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("confUUID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCtlRecordsOfHisMeetingRequest::getConfUUID, (req, v) -> {
                req.setConfUUID(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCtlRecordsOfHisMeetingRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCtlRecordsOfHisMeetingRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCtlRecordsOfHisMeetingRequest::getUserUUID, (req, v) -> {
                req.setUserUUID(v);
            }));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCtlRecordsOfHisMeetingRequest::getXAuthorizationType, (req, v) -> {
                req.setXAuthorizationType(v);
            }));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCtlRecordsOfHisMeetingRequest::getXSiteId, (req, v) -> {
                req.setXSiteId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCtlRecordsOfHisMeetingRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchDepartmentByNameRequest, SearchDepartmentByNameResponse> searchDepartmentByName =
        genForsearchDepartmentByName();

    private static HttpRequestDef<SearchDepartmentByNameRequest, SearchDepartmentByNameResponse> genForsearchDepartmentByName() {
        // basic
        HttpRequestDef.Builder<SearchDepartmentByNameRequest, SearchDepartmentByNameResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, SearchDepartmentByNameRequest.class, SearchDepartmentByNameResponse.class)
            .withName("SearchDepartmentByName")
            .withUri("/v1/usg/dcs/member/dept")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("deptName",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchDepartmentByNameRequest::getDeptName, (req, v) -> {
                req.setDeptName(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchDepartmentByNameRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchDepartmentByNameRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response
        builder.<List<QueryDeptResultDTO>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(SearchDepartmentByNameResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(QueryDeptResultDTO.class));

        return builder.build();
    }

    public static final HttpRequestDef<SearchDevicesRequest, SearchDevicesResponse> searchDevices =
        genForsearchDevices();

    private static HttpRequestDef<SearchDevicesRequest, SearchDevicesResponse> genForsearchDevices() {
        // basic
        HttpRequestDef.Builder<SearchDevicesRequest, SearchDevicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchDevicesRequest.class, SearchDevicesResponse.class)
                .withName("SearchDevices")
                .withUri("/v1/usg/dcs/corp/device")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchDevicesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchDevicesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchDevicesRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            }));
        builder.<String>withRequestField("model",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchDevicesRequest::getModel, (req, v) -> {
                req.setModel(v);
            }));
        builder.<String>withRequestField("deptCode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchDevicesRequest::getDeptCode, (req, v) -> {
                req.setDeptCode(v);
            }));
        builder.<Boolean>withRequestField("enableSubDept",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(SearchDevicesRequest::getEnableSubDept, (req, v) -> {
                req.setEnableSubDept(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchDevicesRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchDevicesRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchHisMeetingsRequest, SearchHisMeetingsResponse> searchHisMeetings =
        genForsearchHisMeetings();

    private static HttpRequestDef<SearchHisMeetingsRequest, SearchHisMeetingsResponse> genForsearchHisMeetings() {
        // basic
        HttpRequestDef.Builder<SearchHisMeetingsRequest, SearchHisMeetingsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchHisMeetingsRequest.class, SearchHisMeetingsResponse.class)
                .withName("SearchHisMeetings")
                .withUri("/v1/mmc/management/conferences/history")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchHisMeetingsRequest::getUserUUID, (req, v) -> {
                req.setUserUUID(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchHisMeetingsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchHisMeetingsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchHisMeetingsRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            }));
        builder.<Boolean>withRequestField("queryAll",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(SearchHisMeetingsRequest::getQueryAll, (req, v) -> {
                req.setQueryAll(v);
            }));
        builder.<Long>withRequestField("startDate",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchHisMeetingsRequest::getStartDate, (req, v) -> {
                req.setStartDate(v);
            }));
        builder.<Long>withRequestField("endDate",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchHisMeetingsRequest::getEndDate, (req, v) -> {
                req.setEndDate(v);
            }));
        builder.<String>withRequestField("sortType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchHisMeetingsRequest::getSortType, (req, v) -> {
                req.setSortType(v);
            }));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchHisMeetingsRequest::getXAuthorizationType, (req, v) -> {
                req.setXAuthorizationType(v);
            }));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchHisMeetingsRequest::getXSiteId, (req, v) -> {
                req.setXSiteId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchMaterialsRequest, SearchMaterialsResponse> searchMaterials =
        genForsearchMaterials();

    private static HttpRequestDef<SearchMaterialsRequest, SearchMaterialsResponse> genForsearchMaterials() {
        // basic
        HttpRequestDef.Builder<SearchMaterialsRequest, SearchMaterialsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchMaterialsRequest.class, SearchMaterialsResponse.class)
                .withName("SearchMaterials")
                .withUri("/v1/usg/sss/materials")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchMaterialsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchMaterialsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchMaterialsRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchMaterialsRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchMaterialsRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchMeetingFileListRequest, SearchMeetingFileListResponse> searchMeetingFileList =
        genForsearchMeetingFileList();

    private static HttpRequestDef<SearchMeetingFileListRequest, SearchMeetingFileListResponse> genForsearchMeetingFileList() {
        // basic
        HttpRequestDef.Builder<SearchMeetingFileListRequest, SearchMeetingFileListResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, SearchMeetingFileListRequest.class, SearchMeetingFileListResponse.class)
            .withName("SearchMeetingFileList")
            .withUri("/v1/usg/sss/meeting-files")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchMeetingFileListRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchMeetingFileListRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchMeetingFileListRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchMeetingFileListRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchMeetingFileListRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchMeetingsRequest, SearchMeetingsResponse> searchMeetings =
        genForsearchMeetings();

    private static HttpRequestDef<SearchMeetingsRequest, SearchMeetingsResponse> genForsearchMeetings() {
        // basic
        HttpRequestDef.Builder<SearchMeetingsRequest, SearchMeetingsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchMeetingsRequest.class, SearchMeetingsResponse.class)
                .withName("SearchMeetings")
                .withUri("/v1/mmc/management/conferences")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchMeetingsRequest::getUserUUID, (req, v) -> {
                req.setUserUUID(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchMeetingsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchMeetingsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Boolean>withRequestField("queryAll",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(SearchMeetingsRequest::getQueryAll, (req, v) -> {
                req.setQueryAll(v);
            }));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchMeetingsRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            }));
        builder.<String>withRequestField("queryConfMode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchMeetingsRequest::getQueryConfMode, (req, v) -> {
                req.setQueryConfMode(v);
            }));
        builder.<String>withRequestField("sortType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchMeetingsRequest::getSortType, (req, v) -> {
                req.setSortType(v);
            }));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchMeetingsRequest::getXAuthorizationType, (req, v) -> {
                req.setXAuthorizationType(v);
            }));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchMeetingsRequest::getXSiteId, (req, v) -> {
                req.setXSiteId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchMemberVmrRequest, SearchMemberVmrResponse> searchMemberVmr =
        genForsearchMemberVmr();

    private static HttpRequestDef<SearchMemberVmrRequest, SearchMemberVmrResponse> genForsearchMemberVmr() {
        // basic
        HttpRequestDef.Builder<SearchMemberVmrRequest, SearchMemberVmrResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchMemberVmrRequest.class, SearchMemberVmrResponse.class)
                .withName("SearchMemberVmr")
                .withUri("/v1/usg/dcs/member/vmr")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchMemberVmrRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchMemberVmrRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchMemberVmrRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            }));
        builder.<Boolean>withRequestField("specialVmr",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(SearchMemberVmrRequest::getSpecialVmr, (req, v) -> {
                req.setSpecialVmr(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchMemberVmrRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchMemberVmrRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchOnlineMeetingsRequest, SearchOnlineMeetingsResponse> searchOnlineMeetings =
        genForsearchOnlineMeetings();

    private static HttpRequestDef<SearchOnlineMeetingsRequest, SearchOnlineMeetingsResponse> genForsearchOnlineMeetings() {
        // basic
        HttpRequestDef.Builder<SearchOnlineMeetingsRequest, SearchOnlineMeetingsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, SearchOnlineMeetingsRequest.class, SearchOnlineMeetingsResponse.class)
            .withName("SearchOnlineMeetings")
            .withUri("/v1/mmc/management/conferences/online")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchOnlineMeetingsRequest::getUserUUID, (req, v) -> {
                req.setUserUUID(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchOnlineMeetingsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchOnlineMeetingsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Boolean>withRequestField("queryAll",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(SearchOnlineMeetingsRequest::getQueryAll, (req, v) -> {
                req.setQueryAll(v);
            }));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchOnlineMeetingsRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            }));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchOnlineMeetingsRequest::getXAuthorizationType, (req, v) -> {
                req.setXAuthorizationType(v);
            }));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchOnlineMeetingsRequest::getXSiteId, (req, v) -> {
                req.setXSiteId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchProgramsRequest, SearchProgramsResponse> searchPrograms =
        genForsearchPrograms();

    private static HttpRequestDef<SearchProgramsRequest, SearchProgramsResponse> genForsearchPrograms() {
        // basic
        HttpRequestDef.Builder<SearchProgramsRequest, SearchProgramsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchProgramsRequest.class, SearchProgramsResponse.class)
                .withName("SearchPrograms")
                .withUri("/v1/usg/sss/programs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchProgramsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchProgramsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchProgramsRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchProgramsRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchProgramsRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchPublicationsRequest, SearchPublicationsResponse> searchPublications =
        genForsearchPublications();

    private static HttpRequestDef<SearchPublicationsRequest, SearchPublicationsResponse> genForsearchPublications() {
        // basic
        HttpRequestDef.Builder<SearchPublicationsRequest, SearchPublicationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchPublicationsRequest.class, SearchPublicationsResponse.class)
                .withName("SearchPublications")
                .withUri("/v1/usg/sss/publications")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchPublicationsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchPublicationsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchPublicationsRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchPublicationsRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchPublicationsRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchRecordingsRequest, SearchRecordingsResponse> searchRecordings =
        genForsearchRecordings();

    private static HttpRequestDef<SearchRecordingsRequest, SearchRecordingsResponse> genForsearchRecordings() {
        // basic
        HttpRequestDef.Builder<SearchRecordingsRequest, SearchRecordingsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchRecordingsRequest.class, SearchRecordingsResponse.class)
                .withName("SearchRecordings")
                .withUri("/v1/mmc/management/record/files")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchRecordingsRequest::getUserUUID, (req, v) -> {
                req.setUserUUID(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchRecordingsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchRecordingsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Boolean>withRequestField("queryAll",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(SearchRecordingsRequest::getQueryAll, (req, v) -> {
                req.setQueryAll(v);
            }));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchRecordingsRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            }));
        builder.<Long>withRequestField("startDate",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchRecordingsRequest::getStartDate, (req, v) -> {
                req.setStartDate(v);
            }));
        builder.<Long>withRequestField("endDate",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchRecordingsRequest::getEndDate, (req, v) -> {
                req.setEndDate(v);
            }));
        builder.<String>withRequestField("sortType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchRecordingsRequest::getSortType, (req, v) -> {
                req.setSortType(v);
            }));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchRecordingsRequest::getXAuthorizationType, (req, v) -> {
                req.setXAuthorizationType(v);
            }));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchRecordingsRequest::getXSiteId, (req, v) -> {
                req.setXSiteId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchResourceRequest, SearchResourceResponse> searchResource =
        genForsearchResource();

    private static HttpRequestDef<SearchResourceRequest, SearchResourceResponse> genForsearchResource() {
        // basic
        HttpRequestDef.Builder<SearchResourceRequest, SearchResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchResourceRequest.class, SearchResourceResponse.class)
                .withName("SearchResource")
                .withUri("/v1/usg/dcs/sp/corp/{corp_id}/resource")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("corp_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchResourceRequest::getCorpId, (req, v) -> {
                req.setCorpId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchResourceRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchResourceRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchResourceRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            }));
        builder.<Long>withRequestField("startExpireDate",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchResourceRequest::getStartExpireDate, (req, v) -> {
                req.setStartExpireDate(v);
            }));
        builder.<Long>withRequestField("endExpireDate",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchResourceRequest::getEndExpireDate, (req, v) -> {
                req.setEndExpireDate(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchResourceRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("typeId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchResourceRequest::getTypeId, (req, v) -> {
                req.setTypeId(v);
            }));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchResourceRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchResourceRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchResourceRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchResourceOpRecordRequest, SearchResourceOpRecordResponse> searchResourceOpRecord =
        genForsearchResourceOpRecord();

    private static HttpRequestDef<SearchResourceOpRecordRequest, SearchResourceOpRecordResponse> genForsearchResourceOpRecord() {
        // basic
        HttpRequestDef.Builder<SearchResourceOpRecordRequest, SearchResourceOpRecordResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, SearchResourceOpRecordRequest.class, SearchResourceOpRecordResponse.class)
            .withName("SearchResourceOpRecord")
            .withUri("/v1/usg/dcs/sp/corp/{corp_id}/resource-record")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("corp_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getCorpId, (req, v) -> {
                req.setCorpId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            }));
        builder.<Long>withRequestField("startExpireDate",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getStartExpireDate, (req, v) -> {
                req.setStartExpireDate(v);
            }));
        builder.<Long>withRequestField("endExpireDate",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getEndExpireDate, (req, v) -> {
                req.setEndExpireDate(v);
            }));
        builder.<Long>withRequestField("startOperateDate",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getStartOperateDate, (req, v) -> {
                req.setStartOperateDate(v);
            }));
        builder.<Long>withRequestField("endOperateDate",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getEndOperateDate, (req, v) -> {
                req.setEndOperateDate(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("typeId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getTypeId, (req, v) -> {
                req.setTypeId(v);
            }));
        builder.<Integer>withRequestField("operateType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getOperateType, (req, v) -> {
                req.setOperateType(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchUsersRequest, SearchUsersResponse> searchUsers = genForsearchUsers();

    private static HttpRequestDef<SearchUsersRequest, SearchUsersResponse> genForsearchUsers() {
        // basic
        HttpRequestDef.Builder<SearchUsersRequest, SearchUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchUsersRequest.class, SearchUsersResponse.class)
                .withName("SearchUsers")
                .withUri("/v1/usg/dcs/corp/member")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchUsersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchUsersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchUsersRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            }));
        builder.<String>withRequestField("sortField",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchUsersRequest::getSortField, (req, v) -> {
                req.setSortField(v);
            }));
        builder.<Boolean>withRequestField("isAsc",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(SearchUsersRequest::getIsAsc, (req, v) -> {
                req.setIsAsc(v);
            }));
        builder.<String>withRequestField("deptCode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchUsersRequest::getDeptCode, (req, v) -> {
                req.setDeptCode(v);
            }));
        builder.<Boolean>withRequestField("enableSubDept",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(SearchUsersRequest::getEnableSubDept, (req, v) -> {
                req.setEnableSubDept(v);
            }));
        builder.<SearchUsersRequest.AdminTypeEnum>withRequestField("adminType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SearchUsersRequest.AdminTypeEnum.class),
            f -> f.withMarshaller(SearchUsersRequest::getAdminType, (req, v) -> {
                req.setAdminType(v);
            }));
        builder.<Boolean>withRequestField("enableRoom",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(SearchUsersRequest::getEnableRoom, (req, v) -> {
                req.setEnableRoom(v);
            }));
        builder.<List<Integer>>withRequestField("userType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(SearchUsersRequest::getUserType, (req, v) -> {
                req.setUserType(v);
            }));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchUsersRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<Boolean>withRequestField("containsUnActive",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(SearchUsersRequest::getContainsUnActive, (req, v) -> {
                req.setContainsUnActive(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchUsersRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchUsersRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchVisionActiveCodeRequest, SearchVisionActiveCodeResponse> searchVisionActiveCode =
        genForsearchVisionActiveCode();

    private static HttpRequestDef<SearchVisionActiveCodeRequest, SearchVisionActiveCodeResponse> genForsearchVisionActiveCode() {
        // basic
        HttpRequestDef.Builder<SearchVisionActiveCodeRequest, SearchVisionActiveCodeResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, SearchVisionActiveCodeRequest.class, SearchVisionActiveCodeResponse.class)
            .withName("SearchVisionActiveCode")
            .withUri("/v1/usg/dcs/corp/vision/activecode")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchVisionActiveCodeRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchVisionActiveCodeRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchVisionActiveCodeRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            }));
        builder.<String>withRequestField("devType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchVisionActiveCodeRequest::getDevType, (req, v) -> {
                req.setDevType(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchVisionActiveCodeRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchVisionActiveCodeRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SendSlideVerifyCodeRequest, SendSlideVerifyCodeResponse> sendSlideVerifyCode =
        genForsendSlideVerifyCode();

    private static HttpRequestDef<SendSlideVerifyCodeRequest, SendSlideVerifyCodeResponse> genForsendSlideVerifyCode() {
        // basic
        HttpRequestDef.Builder<SendSlideVerifyCodeRequest, SendSlideVerifyCodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SendSlideVerifyCodeRequest.class, SendSlideVerifyCodeResponse.class)
                .withName("SendSlideVerifyCode")
                .withUri("/v1/usg/acs/auth/slideverifycode/send")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SendSlideVerifyCodeRequest::getXRequestID, (req, v) -> {
                req.setXRequestID(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SendSlideVerifyCodeRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<SlideVerifyCodeSendDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SlideVerifyCodeSendDTO.class),
            f -> f.withMarshaller(SendSlideVerifyCodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SendVeriCodeForChangePwdRequest, SendVeriCodeForChangePwdResponse> sendVeriCodeForChangePwd =
        genForsendVeriCodeForChangePwd();

    private static HttpRequestDef<SendVeriCodeForChangePwdRequest, SendVeriCodeForChangePwdResponse> genForsendVeriCodeForChangePwd() {
        // basic
        HttpRequestDef.Builder<SendVeriCodeForChangePwdRequest, SendVeriCodeForChangePwdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, SendVeriCodeForChangePwdRequest.class, SendVeriCodeForChangePwdResponse.class)
                .withName("SendVeriCodeForChangePwd")
                .withUri("/v1/usg/acs/verifycode/send")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SendVeriCodeForChangePwdRequest::getXRequestID, (req, v) -> {
                req.setXRequestID(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SendVeriCodeForChangePwdRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<VerifyCodeSendDTOV1>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VerifyCodeSendDTOV1.class),
            f -> f.withMarshaller(SendVeriCodeForChangePwdRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SendVeriCodeForUpdateUserInfoRequest, SendVeriCodeForUpdateUserInfoResponse> sendVeriCodeForUpdateUserInfo =
        genForsendVeriCodeForUpdateUserInfo();

    private static HttpRequestDef<SendVeriCodeForUpdateUserInfoRequest, SendVeriCodeForUpdateUserInfoResponse> genForsendVeriCodeForUpdateUserInfo() {
        // basic
        HttpRequestDef.Builder<SendVeriCodeForUpdateUserInfoRequest, SendVeriCodeForUpdateUserInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    SendVeriCodeForUpdateUserInfoRequest.class,
                    SendVeriCodeForUpdateUserInfoResponse.class)
                .withName("SendVeriCodeForUpdateUserInfo")
                .withUri("/v1/usg/dcs/member/verification-code")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SendVeriCodeForUpdateUserInfoRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SendVeriCodeForUpdateUserInfoRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<VerificationCodeDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VerificationCodeDTO.class),
            f -> f.withMarshaller(SendVeriCodeForUpdateUserInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetAttendeeLanChannelRequest, SetAttendeeLanChannelResponse> setAttendeeLanChannel =
        genForsetAttendeeLanChannel();

    private static HttpRequestDef<SetAttendeeLanChannelRequest, SetAttendeeLanChannelResponse> genForsetAttendeeLanChannel() {
        // basic
        HttpRequestDef.Builder<SetAttendeeLanChannelRequest, SetAttendeeLanChannelResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, SetAttendeeLanChannelRequest.class, SetAttendeeLanChannelResponse.class)
            .withName("SetAttendeeLanChannel")
            .withUri("/v1/mmc/control/conferences/setAttendeeLanChannel")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetAttendeeLanChannelRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetAttendeeLanChannelRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));
        builder.<RestSetAttendeeLanChannelBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestSetAttendeeLanChannelBody.class),
            f -> f.withMarshaller(SetAttendeeLanChannelRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetCohostRequest, SetCohostResponse> setCohost = genForsetCohost();

    private static HttpRequestDef<SetCohostRequest, SetCohostResponse> genForsetCohost() {
        // basic
        HttpRequestDef.Builder<SetCohostRequest, SetCohostResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetCohostRequest.class, SetCohostResponse.class)
                .withName("SetCohost")
                .withUri("/v1/mmc/control/conferences/participants/cohost")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetCohostRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("participantID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetCohostRequest::getParticipantID, (req, v) -> {
                req.setParticipantID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetCohostRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));
        builder.<RestSetCohostBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestSetCohostBody.class),
            f -> f.withMarshaller(SetCohostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetCustomMultiPictureRequest, SetCustomMultiPictureResponse> setCustomMultiPicture =
        genForsetCustomMultiPicture();

    private static HttpRequestDef<SetCustomMultiPictureRequest, SetCustomMultiPictureResponse> genForsetCustomMultiPicture() {
        // basic
        HttpRequestDef.Builder<SetCustomMultiPictureRequest, SetCustomMultiPictureResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, SetCustomMultiPictureRequest.class, SetCustomMultiPictureResponse.class)
            .withName("SetCustomMultiPicture")
            .withUri("/v1/mmc/control/conferences/display/customMultiPicture")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetCustomMultiPictureRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetCustomMultiPictureRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));
        builder.<RestCustomMultiPictureBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RestCustomMultiPictureBody.class),
            f -> f.withMarshaller(SetCustomMultiPictureRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetHostViewRequest, SetHostViewResponse> setHostView = genForsetHostView();

    private static HttpRequestDef<SetHostViewRequest, SetHostViewResponse> genForsetHostView() {
        // basic
        HttpRequestDef.Builder<SetHostViewRequest, SetHostViewResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetHostViewRequest.class, SetHostViewResponse.class)
                .withName("SetHostView")
                .withUri("/v1/mmc/control/conferences/chairView")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetHostViewRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetHostViewRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));
        builder.<RestChairViewReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestChairViewReqBody.class),
            f -> f.withMarshaller(SetHostViewRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetInterpreterGroupRequest, SetInterpreterGroupResponse> setInterpreterGroup =
        genForsetInterpreterGroup();

    private static HttpRequestDef<SetInterpreterGroupRequest, SetInterpreterGroupResponse> genForsetInterpreterGroup() {
        // basic
        HttpRequestDef.Builder<SetInterpreterGroupRequest, SetInterpreterGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetInterpreterGroupRequest.class, SetInterpreterGroupResponse.class)
                .withName("SetInterpreterGroup")
                .withUri("/v1/mmc/control/conferences/interpreterGroup")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetInterpreterGroupRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetInterpreterGroupRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));
        builder.<RestSetInterpreterGroupBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestSetInterpreterGroupBody.class),
            f -> f.withMarshaller(SetInterpreterGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetMultiPictureRequest, SetMultiPictureResponse> setMultiPicture =
        genForsetMultiPicture();

    private static HttpRequestDef<SetMultiPictureRequest, SetMultiPictureResponse> genForsetMultiPicture() {
        // basic
        HttpRequestDef.Builder<SetMultiPictureRequest, SetMultiPictureResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetMultiPictureRequest.class, SetMultiPictureResponse.class)
                .withName("SetMultiPicture")
                .withUri("/v1/mmc/control/conferences/display/multiPicture")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetMultiPictureRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetMultiPictureRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));
        builder.<RestMixedPictureBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestMixedPictureBody.class),
            f -> f.withMarshaller(SetMultiPictureRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetParticipantViewRequest, SetParticipantViewResponse> setParticipantView =
        genForsetParticipantView();

    private static HttpRequestDef<SetParticipantViewRequest, SetParticipantViewResponse> genForsetParticipantView() {
        // basic
        HttpRequestDef.Builder<SetParticipantViewRequest, SetParticipantViewResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetParticipantViewRequest.class, SetParticipantViewResponse.class)
                .withName("SetParticipantView")
                .withUri("/v1/mmc/control/conferences/partView")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetParticipantViewRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("participantID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetParticipantViewRequest::getParticipantID, (req, v) -> {
                req.setParticipantID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetParticipantViewRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));
        builder.<RestParticipantViewReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestParticipantViewReqBody.class),
            f -> f.withMarshaller(SetParticipantViewRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetRoleRequest, SetRoleResponse> setRole = genForsetRole();

    private static HttpRequestDef<SetRoleRequest, SetRoleResponse> genForsetRole() {
        // basic
        HttpRequestDef.Builder<SetRoleRequest, SetRoleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetRoleRequest.class, SetRoleResponse.class)
                .withName("SetRole")
                .withUri("/v1/mmc/control/conferences/participants/role")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetRoleRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("participantID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetRoleRequest::getParticipantID, (req, v) -> {
                req.setParticipantID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetRoleRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));
        builder.<RestChairTokenReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestChairTokenReqBody.class),
            f -> f.withMarshaller(SetRoleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetSsoConfigRequest, SetSsoConfigResponse> setSsoConfig = genForsetSsoConfig();

    private static HttpRequestDef<SetSsoConfigRequest, SetSsoConfigResponse> genForsetSsoConfig() {
        // basic
        HttpRequestDef.Builder<SetSsoConfigRequest, SetSsoConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SetSsoConfigRequest.class, SetSsoConfigResponse.class)
                .withName("SetSsoConfig")
                .withUri("/v1/usg/acs/authorizeconfig")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetSsoConfigRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetSsoConfigRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<AuthorizeConfigInfoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AuthorizeConfigInfoRequestBody.class),
            f -> f.withMarshaller(SetSsoConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetWebHookConfigRequest, SetWebHookConfigResponse> setWebHookConfig =
        genForsetWebHookConfig();

    private static HttpRequestDef<SetWebHookConfigRequest, SetWebHookConfigResponse> genForsetWebHookConfig() {
        // basic
        HttpRequestDef.Builder<SetWebHookConfigRequest, SetWebHookConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SetWebHookConfigRequest.class, SetWebHookConfigResponse.class)
                .withName("SetWebHookConfig")
                .withUri("/v1/mmc/management/webhook/link-config")
                .withContentType("application/json");

        // requests
        builder.<WebHookConfigRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WebHookConfigRequest.class),
            f -> f.withMarshaller(SetWebHookConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConfOrgRequest, ShowConfOrgResponse> showConfOrg = genForshowConfOrg();

    private static HttpRequestDef<ShowConfOrgRequest, ShowConfOrgResponse> genForshowConfOrg() {
        // basic
        HttpRequestDef.Builder<ShowConfOrgRequest, ShowConfOrgResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowConfOrgRequest.class, ShowConfOrgResponse.class)
                .withName("ShowConfOrg")
                .withUri("/v1/mmc/management/conferences/confOrg")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConfOrgRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCorpRequest, ShowCorpResponse> showCorp = genForshowCorp();

    private static HttpRequestDef<ShowCorpRequest, ShowCorpResponse> genForshowCorp() {
        // basic
        HttpRequestDef.Builder<ShowCorpRequest, ShowCorpResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCorpRequest.class, ShowCorpResponse.class)
                .withName("ShowCorp")
                .withUri("/v1/usg/dcs/sp/corp/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCorpRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCorpRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCorpRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCorpAdminRequest, ShowCorpAdminResponse> showCorpAdmin =
        genForshowCorpAdmin();

    private static HttpRequestDef<ShowCorpAdminRequest, ShowCorpAdminResponse> genForshowCorpAdmin() {
        // basic
        HttpRequestDef.Builder<ShowCorpAdminRequest, ShowCorpAdminResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCorpAdminRequest.class, ShowCorpAdminResponse.class)
                .withName("ShowCorpAdmin")
                .withUri("/v1/usg/dcs/corp/admin/{account}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("account",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCorpAdminRequest::getAccount, (req, v) -> {
                req.setAccount(v);
            }));
        builder.<Integer>withRequestField("accountType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCorpAdminRequest::getAccountType, (req, v) -> {
                req.setAccountType(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCorpAdminRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCorpAdminRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCorpBasicInfoRequest, ShowCorpBasicInfoResponse> showCorpBasicInfo =
        genForshowCorpBasicInfo();

    private static HttpRequestDef<ShowCorpBasicInfoRequest, ShowCorpBasicInfoResponse> genForshowCorpBasicInfo() {
        // basic
        HttpRequestDef.Builder<ShowCorpBasicInfoRequest, ShowCorpBasicInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCorpBasicInfoRequest.class, ShowCorpBasicInfoResponse.class)
                .withName("ShowCorpBasicInfo")
                .withUri("/v1/usg/dcs/corp")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCorpBasicInfoRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCorpBasicInfoRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCorpResourceRequest, ShowCorpResourceResponse> showCorpResource =
        genForshowCorpResource();

    private static HttpRequestDef<ShowCorpResourceRequest, ShowCorpResourceResponse> genForshowCorpResource() {
        // basic
        HttpRequestDef.Builder<ShowCorpResourceRequest, ShowCorpResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCorpResourceRequest.class, ShowCorpResourceResponse.class)
                .withName("ShowCorpResource")
                .withUri("/v1/usg/dcs/corp/resource")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCorpResourceRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCorpResourceRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDepartmentRequest, ShowDepartmentResponse> showDepartment =
        genForshowDepartment();

    private static HttpRequestDef<ShowDepartmentRequest, ShowDepartmentResponse> genForshowDepartment() {
        // basic
        HttpRequestDef.Builder<ShowDepartmentRequest, ShowDepartmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDepartmentRequest.class, ShowDepartmentResponse.class)
                .withName("ShowDepartment")
                .withUri("/v1/usg/abs/departments/{dept_code}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("dept_code",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDepartmentRequest::getDeptCode, (req, v) -> {
                req.setDeptCode(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDepartmentRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDepartmentRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeptAndChildDeptRequest, ShowDeptAndChildDeptResponse> showDeptAndChildDept =
        genForshowDeptAndChildDept();

    private static HttpRequestDef<ShowDeptAndChildDeptRequest, ShowDeptAndChildDeptResponse> genForshowDeptAndChildDept() {
        // basic
        HttpRequestDef.Builder<ShowDeptAndChildDeptRequest, ShowDeptAndChildDeptResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDeptAndChildDeptRequest.class, ShowDeptAndChildDeptResponse.class)
            .withName("ShowDeptAndChildDept")
            .withUri("/v1/usg/dcs/member/dept/{dept_code}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("dept_code",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeptAndChildDeptRequest::getDeptCode, (req, v) -> {
                req.setDeptCode(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeptAndChildDeptRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeptAndChildDeptRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeviceDetailRequest, ShowDeviceDetailResponse> showDeviceDetail =
        genForshowDeviceDetail();

    private static HttpRequestDef<ShowDeviceDetailRequest, ShowDeviceDetailResponse> genForshowDeviceDetail() {
        // basic
        HttpRequestDef.Builder<ShowDeviceDetailRequest, ShowDeviceDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDeviceDetailRequest.class, ShowDeviceDetailResponse.class)
                .withName("ShowDeviceDetail")
                .withUri("/v1/usg/dcs/corp/device/{sn}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("sn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceDetailRequest::getSn, (req, v) -> {
                req.setSn(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceDetailRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceDetailRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeviceStatusRequest, ShowDeviceStatusResponse> showDeviceStatus =
        genForshowDeviceStatus();

    private static HttpRequestDef<ShowDeviceStatusRequest, ShowDeviceStatusResponse> genForshowDeviceStatus() {
        // basic
        HttpRequestDef.Builder<ShowDeviceStatusRequest, ShowDeviceStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowDeviceStatusRequest.class, ShowDeviceStatusResponse.class)
                .withName("ShowDeviceStatus")
                .withUri("/v1/usg/acs/ap/userstatus")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceStatusRequest::getXRequestID, (req, v) -> {
                req.setXRequestID(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceStatusRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowDeviceStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class));

        // response
        builder.<List<UserStatusDTO>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowDeviceStatusResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(UserStatusDTO.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeviceTypesRequest, ShowDeviceTypesResponse> showDeviceTypes =
        genForshowDeviceTypes();

    private static HttpRequestDef<ShowDeviceTypesRequest, ShowDeviceTypesResponse> genForshowDeviceTypes() {
        // basic
        HttpRequestDef.Builder<ShowDeviceTypesRequest, ShowDeviceTypesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDeviceTypesRequest.class, ShowDeviceTypesResponse.class)
                .withName("ShowDeviceTypes")
                .withUri("/v1/usg/dcs/termdevtype")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceTypesRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceTypesRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response
        builder.<List<QueryDeviceTypeResultDTO>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowDeviceTypesResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(QueryDeviceTypeResultDTO.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowHisMeetingDetailRequest, ShowHisMeetingDetailResponse> showHisMeetingDetail =
        genForshowHisMeetingDetail();

    private static HttpRequestDef<ShowHisMeetingDetailRequest, ShowHisMeetingDetailResponse> genForshowHisMeetingDetail() {
        // basic
        HttpRequestDef.Builder<ShowHisMeetingDetailRequest, ShowHisMeetingDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowHisMeetingDetailRequest.class, ShowHisMeetingDetailResponse.class)
            .withName("ShowHisMeetingDetail")
            .withUri("/v1/mmc/management/conferences/history/confDetail")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("confUUID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHisMeetingDetailRequest::getConfUUID, (req, v) -> {
                req.setConfUUID(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHisMeetingDetailRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHisMeetingDetailRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHisMeetingDetailRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            }));
        builder.<String>withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHisMeetingDetailRequest::getUserUUID, (req, v) -> {
                req.setUserUUID(v);
            }));
        builder.<Integer>withRequestField("X-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHisMeetingDetailRequest::getXType, (req, v) -> {
                req.setXType(v);
            }));
        builder.<Integer>withRequestField("X-Query-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHisMeetingDetailRequest::getXQueryType, (req, v) -> {
                req.setXQueryType(v);
            }));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHisMeetingDetailRequest::getXAuthorizationType, (req, v) -> {
                req.setXAuthorizationType(v);
            }));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHisMeetingDetailRequest::getXSiteId, (req, v) -> {
                req.setXSiteId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLayoutRequest, ShowLayoutResponse> showLayout = genForshowLayout();

    private static HttpRequestDef<ShowLayoutRequest, ShowLayoutResponse> genForshowLayout() {
        // basic
        HttpRequestDef.Builder<ShowLayoutRequest, ShowLayoutResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLayoutRequest.class, ShowLayoutResponse.class)
                .withName("ShowLayout")
                .withUri("/v1/mmc/control/conferences/layOut")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLayoutRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLayoutRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMeetingDetailRequest, ShowMeetingDetailResponse> showMeetingDetail =
        genForshowMeetingDetail();

    private static HttpRequestDef<ShowMeetingDetailRequest, ShowMeetingDetailResponse> genForshowMeetingDetail() {
        // basic
        HttpRequestDef.Builder<ShowMeetingDetailRequest, ShowMeetingDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMeetingDetailRequest.class, ShowMeetingDetailResponse.class)
                .withName("ShowMeetingDetail")
                .withUri("/v1/mmc/management/conferences/confDetail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMeetingDetailRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMeetingDetailRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMeetingDetailRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMeetingDetailRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            }));
        builder.<String>withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMeetingDetailRequest::getUserUUID, (req, v) -> {
                req.setUserUUID(v);
            }));
        builder.<String>withRequestField("X-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMeetingDetailRequest::getXType, (req, v) -> {
                req.setXType(v);
            }));
        builder.<String>withRequestField("X-Query-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMeetingDetailRequest::getXQueryType, (req, v) -> {
                req.setXQueryType(v);
            }));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMeetingDetailRequest::getXAuthorizationType, (req, v) -> {
                req.setXAuthorizationType(v);
            }));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMeetingDetailRequest::getXSiteId, (req, v) -> {
                req.setXSiteId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMeetingFileRequest, ShowMeetingFileResponse> showMeetingFile =
        genForshowMeetingFile();

    private static HttpRequestDef<ShowMeetingFileRequest, ShowMeetingFileResponse> genForshowMeetingFile() {
        // basic
        HttpRequestDef.Builder<ShowMeetingFileRequest, ShowMeetingFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMeetingFileRequest.class, ShowMeetingFileResponse.class)
                .withName("ShowMeetingFile")
                .withUri("/v1/usg/sss/meeting-files/{file_code}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("file_code",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMeetingFileRequest::getFileCode, (req, v) -> {
                req.setFileCode(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMeetingFileRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMeetingFileRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMeetingFileListRequest, ShowMeetingFileListResponse> showMeetingFileList =
        genForshowMeetingFileList();

    private static HttpRequestDef<ShowMeetingFileListRequest, ShowMeetingFileListResponse> genForshowMeetingFileList() {
        // basic
        HttpRequestDef.Builder<ShowMeetingFileListRequest, ShowMeetingFileListResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowMeetingFileListRequest.class, ShowMeetingFileListResponse.class)
                .withName("ShowMeetingFileList")
                .withUri("/v1/usg/sss/meeting-files/open-meeting-file-list")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMeetingFileListRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMeetingFileListRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<Map<String, String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f.withMarshaller(ShowMeetingFileListRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMyInfoRequest, ShowMyInfoResponse> showMyInfo = genForshowMyInfo();

    private static HttpRequestDef<ShowMyInfoRequest, ShowMyInfoResponse> genForshowMyInfo() {
        // basic
        HttpRequestDef.Builder<ShowMyInfoRequest, ShowMyInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMyInfoRequest.class, ShowMyInfoResponse.class)
                .withName("ShowMyInfo")
                .withUri("/v1/usg/dcs/member")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMyInfoRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMyInfoRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOnlineMeetingDetailRequest, ShowOnlineMeetingDetailResponse> showOnlineMeetingDetail =
        genForshowOnlineMeetingDetail();

    private static HttpRequestDef<ShowOnlineMeetingDetailRequest, ShowOnlineMeetingDetailResponse> genForshowOnlineMeetingDetail() {
        // basic
        HttpRequestDef.Builder<ShowOnlineMeetingDetailRequest, ShowOnlineMeetingDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowOnlineMeetingDetailRequest.class, ShowOnlineMeetingDetailResponse.class)
            .withName("ShowOnlineMeetingDetail")
            .withUri("/v1/mmc/management/conferences/online/confDetail")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOnlineMeetingDetailRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowOnlineMeetingDetailRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowOnlineMeetingDetailRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOnlineMeetingDetailRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            }));
        builder.<String>withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOnlineMeetingDetailRequest::getUserUUID, (req, v) -> {
                req.setUserUUID(v);
            }));
        builder.<String>withRequestField("X-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOnlineMeetingDetailRequest::getXType, (req, v) -> {
                req.setXType(v);
            }));
        builder.<String>withRequestField("X-Query-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOnlineMeetingDetailRequest::getXQueryType, (req, v) -> {
                req.setXQueryType(v);
            }));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOnlineMeetingDetailRequest::getXAuthorizationType, (req, v) -> {
                req.setXAuthorizationType(v);
            }));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOnlineMeetingDetailRequest::getXSiteId, (req, v) -> {
                req.setXSiteId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOrgResRequest, ShowOrgResResponse> showOrgRes = genForshowOrgRes();

    private static HttpRequestDef<ShowOrgResRequest, ShowOrgResResponse> genForshowOrgRes() {
        // basic
        HttpRequestDef.Builder<ShowOrgResRequest, ShowOrgResResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowOrgResRequest.class, ShowOrgResResponse.class)
                .withName("ShowOrgRes")
                .withUri("/v1/mmc/management/orgRes")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProgramRequest, ShowProgramResponse> showProgram = genForshowProgram();

    private static HttpRequestDef<ShowProgramRequest, ShowProgramResponse> genForshowProgram() {
        // basic
        HttpRequestDef.Builder<ShowProgramRequest, ShowProgramResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProgramRequest.class, ShowProgramResponse.class)
                .withName("ShowProgram")
                .withUri("/v1/usg/sss/programs/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProgramRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProgramRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProgramRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPublicationRequest, ShowPublicationResponse> showPublication =
        genForshowPublication();

    private static HttpRequestDef<ShowPublicationRequest, ShowPublicationResponse> genForshowPublication() {
        // basic
        HttpRequestDef.Builder<ShowPublicationRequest, ShowPublicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPublicationRequest.class, ShowPublicationResponse.class)
                .withName("ShowPublication")
                .withUri("/v1/usg/sss/publications/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPublicationRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPublicationRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPublicationRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRealTimeInfoOfMeetingRequest, ShowRealTimeInfoOfMeetingResponse> showRealTimeInfoOfMeeting =
        genForshowRealTimeInfoOfMeeting();

    private static HttpRequestDef<ShowRealTimeInfoOfMeetingRequest, ShowRealTimeInfoOfMeetingResponse> genForshowRealTimeInfoOfMeeting() {
        // basic
        HttpRequestDef.Builder<ShowRealTimeInfoOfMeetingRequest, ShowRealTimeInfoOfMeetingResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowRealTimeInfoOfMeetingRequest.class,
                    ShowRealTimeInfoOfMeetingResponse.class)
                .withName("ShowRealTimeInfoOfMeeting")
                .withUri("/v1/mmc/control/conferences/realTimeInfo")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRealTimeInfoOfMeetingRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRealTimeInfoOfMeetingRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRecordingDetailRequest, ShowRecordingDetailResponse> showRecordingDetail =
        genForshowRecordingDetail();

    private static HttpRequestDef<ShowRecordingDetailRequest, ShowRecordingDetailResponse> genForshowRecordingDetail() {
        // basic
        HttpRequestDef.Builder<ShowRecordingDetailRequest, ShowRecordingDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRecordingDetailRequest.class, ShowRecordingDetailResponse.class)
                .withName("ShowRecordingDetail")
                .withUri("/v1/mmc/management/conferences/record/files")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("confUUID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordingDetailRequest::getConfUUID, (req, v) -> {
                req.setConfUUID(v);
            }));
        builder.<String>withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordingDetailRequest::getUserUUID, (req, v) -> {
                req.setUserUUID(v);
            }));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordingDetailRequest::getXAuthorizationType, (req, v) -> {
                req.setXAuthorizationType(v);
            }));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordingDetailRequest::getXSiteId, (req, v) -> {
                req.setXSiteId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRecordingFileDownloadUrlsRequest, ShowRecordingFileDownloadUrlsResponse> showRecordingFileDownloadUrls =
        genForshowRecordingFileDownloadUrls();

    private static HttpRequestDef<ShowRecordingFileDownloadUrlsRequest, ShowRecordingFileDownloadUrlsResponse> genForshowRecordingFileDownloadUrls() {
        // basic
        HttpRequestDef.Builder<ShowRecordingFileDownloadUrlsRequest, ShowRecordingFileDownloadUrlsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowRecordingFileDownloadUrlsRequest.class,
                    ShowRecordingFileDownloadUrlsResponse.class)
                .withName("ShowRecordingFileDownloadUrls")
                .withUri("/v1/mmc/management/record/downloadurls")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("confUUID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordingFileDownloadUrlsRequest::getConfUUID, (req, v) -> {
                req.setConfUUID(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRecordingFileDownloadUrlsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRecordingFileDownloadUrlsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordingFileDownloadUrlsRequest::getXAuthorizationType, (req, v) -> {
                req.setXAuthorizationType(v);
            }));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordingFileDownloadUrlsRequest::getXSiteId, (req, v) -> {
                req.setXSiteId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRegionInfoOfMeetingRequest, ShowRegionInfoOfMeetingResponse> showRegionInfoOfMeeting =
        genForshowRegionInfoOfMeeting();

    private static HttpRequestDef<ShowRegionInfoOfMeetingRequest, ShowRegionInfoOfMeetingResponse> genForshowRegionInfoOfMeeting() {
        // basic
        HttpRequestDef.Builder<ShowRegionInfoOfMeetingRequest, ShowRegionInfoOfMeetingResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowRegionInfoOfMeetingRequest.class, ShowRegionInfoOfMeetingResponse.class)
            .withName("ShowRegionInfoOfMeeting")
            .withUri("/v1/mmc/management/conferences/region/info")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRegionInfoOfMeetingRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRoomSettingRequest, ShowRoomSettingResponse> showRoomSetting =
        genForshowRoomSetting();

    private static HttpRequestDef<ShowRoomSettingRequest, ShowRoomSettingResponse> genForshowRoomSetting() {
        // basic
        HttpRequestDef.Builder<ShowRoomSettingRequest, ShowRoomSettingResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRoomSettingRequest.class, ShowRoomSettingResponse.class)
                .withName("ShowRoomSetting")
                .withUri("/v1/wss/webinar/open/room-setting/{conference_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conference_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRoomSettingRequest::getConferenceId, (req, v) -> {
                req.setConferenceId(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRoomSettingRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRoomSettingRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSpResRequest, ShowSpResResponse> showSpRes = genForshowSpRes();

    private static HttpRequestDef<ShowSpResRequest, ShowSpResResponse> genForshowSpRes() {
        // basic
        HttpRequestDef.Builder<ShowSpResRequest, ShowSpResResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSpResRequest.class, ShowSpResResponse.class)
                .withName("ShowSpRes")
                .withUri("/v1/mmc/management/spRes")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSpResourceRequest, ShowSpResourceResponse> showSpResource =
        genForshowSpResource();

    private static HttpRequestDef<ShowSpResourceRequest, ShowSpResourceResponse> genForshowSpResource() {
        // basic
        HttpRequestDef.Builder<ShowSpResourceRequest, ShowSpResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSpResourceRequest.class, ShowSpResourceResponse.class)
                .withName("ShowSpResource")
                .withUri("/v1/usg/dcs/sp/resource")
                .withContentType("application/json");

        // requests
        builder.<Boolean>withRequestField("queryGroup",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowSpResourceRequest::getQueryGroup, (req, v) -> {
                req.setQueryGroup(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSpResourceRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSpResourceRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSsoConfigRequest, ShowSsoConfigResponse> showSsoConfig =
        genForshowSsoConfig();

    private static HttpRequestDef<ShowSsoConfigRequest, ShowSsoConfigResponse> genForshowSsoConfig() {
        // basic
        HttpRequestDef.Builder<ShowSsoConfigRequest, ShowSsoConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSsoConfigRequest.class, ShowSsoConfigResponse.class)
                .withName("ShowSsoConfig")
                .withUri("/v1/usg/acs/authorizeconfig")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSsoConfigRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSsoConfigRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserDetailRequest, ShowUserDetailResponse> showUserDetail =
        genForshowUserDetail();

    private static HttpRequestDef<ShowUserDetailRequest, ShowUserDetailResponse> genForshowUserDetail() {
        // basic
        HttpRequestDef.Builder<ShowUserDetailRequest, ShowUserDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUserDetailRequest.class, ShowUserDetailResponse.class)
                .withName("ShowUserDetail")
                .withUri("/v1/usg/dcs/corp/member/{account}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("account",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUserDetailRequest::getAccount, (req, v) -> {
                req.setAccount(v);
            }));
        builder.<Integer>withRequestField("accountType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowUserDetailRequest::getAccountType, (req, v) -> {
                req.setAccountType(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUserDetailRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUserDetailRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWebHookConfigRequest, ShowWebHookConfigResponse> showWebHookConfig =
        genForshowWebHookConfig();

    private static HttpRequestDef<ShowWebHookConfigRequest, ShowWebHookConfigResponse> genForshowWebHookConfig() {
        // basic
        HttpRequestDef.Builder<ShowWebHookConfigRequest, ShowWebHookConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowWebHookConfigRequest.class, ShowWebHookConfigResponse.class)
                .withName("ShowWebHookConfig")
                .withUri("/v1/mmc/management/webhook/link-config")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("corpId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWebHookConfigRequest::getCorpId, (req, v) -> {
                req.setCorpId(v);
            }));
        builder.<String>withRequestField("spId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWebHookConfigRequest::getSpId, (req, v) -> {
                req.setSpId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWebinarRequest, ShowWebinarResponse> showWebinar = genForshowWebinar();

    private static HttpRequestDef<ShowWebinarRequest, ShowWebinarResponse> genForshowWebinar() {
        // basic
        HttpRequestDef.Builder<ShowWebinarRequest, ShowWebinarResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowWebinarRequest.class, ShowWebinarResponse.class)
                .withName("ShowWebinar")
                .withUri("/v1/wss/webinar/open/conferences/{conference_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conference_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWebinarRequest::getConferenceId, (req, v) -> {
                req.setConferenceId(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWebinarRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWebinarRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartMeetingRequest, StartMeetingResponse> startMeeting = genForstartMeeting();

    private static HttpRequestDef<StartMeetingRequest, StartMeetingResponse> genForstartMeeting() {
        // basic
        HttpRequestDef.Builder<StartMeetingRequest, StartMeetingResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartMeetingRequest.class, StartMeetingResponse.class)
                .withName("StartMeeting")
                .withUri("/v1/mmc/management/conferences/start")
                .withContentType("application/json");

        // requests
        builder.<StartRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartRequest.class),
            f -> f.withMarshaller(StartMeetingRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopMeetingRequest, StopMeetingResponse> stopMeeting = genForstopMeeting();

    private static HttpRequestDef<StopMeetingRequest, StopMeetingResponse> genForstopMeeting() {
        // basic
        HttpRequestDef.Builder<StopMeetingRequest, StopMeetingResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, StopMeetingRequest.class, StopMeetingResponse.class)
                .withName("StopMeeting")
                .withUri("/v1/mmc/control/conferences/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopMeetingRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopMeetingRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchModeRequest, SwitchModeResponse> switchMode = genForswitchMode();

    private static HttpRequestDef<SwitchModeRequest, SwitchModeResponse> genForswitchMode() {
        // basic
        HttpRequestDef.Builder<SwitchModeRequest, SwitchModeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SwitchModeRequest.class, SwitchModeResponse.class)
                .withName("SwitchMode")
                .withUri("/v1/mmc/control/conferences/display/mode")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchModeRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchModeRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));
        builder.<RestSwitchModeReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestSwitchModeReqBody.class),
            f -> f.withMarshaller(SwitchModeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateContactRequest, UpdateContactResponse> updateContact =
        genForupdateContact();

    private static HttpRequestDef<UpdateContactRequest, UpdateContactResponse> genForupdateContact() {
        // basic
        HttpRequestDef.Builder<UpdateContactRequest, UpdateContactResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateContactRequest.class, UpdateContactResponse.class)
                .withName("UpdateContact")
                .withUri("/v1/usg/dcs/member/contact")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateContactRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateContactRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<VerificationCodeDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VerificationCodeDTO.class),
            f -> f.withMarshaller(UpdateContactRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCorpRequest, UpdateCorpResponse> updateCorp = genForupdateCorp();

    private static HttpRequestDef<UpdateCorpRequest, UpdateCorpResponse> genForupdateCorp() {
        // basic
        HttpRequestDef.Builder<UpdateCorpRequest, UpdateCorpResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCorpRequest.class, UpdateCorpResponse.class)
                .withName("UpdateCorp")
                .withUri("/v1/usg/dcs/sp/corp/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCorpRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCorpRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCorpRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<ModCorpDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModCorpDTO.class),
            f -> f.withMarshaller(UpdateCorpRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCorpBasicInfoRequest, UpdateCorpBasicInfoResponse> updateCorpBasicInfo =
        genForupdateCorpBasicInfo();

    private static HttpRequestDef<UpdateCorpBasicInfoRequest, UpdateCorpBasicInfoResponse> genForupdateCorpBasicInfo() {
        // basic
        HttpRequestDef.Builder<UpdateCorpBasicInfoRequest, UpdateCorpBasicInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCorpBasicInfoRequest.class, UpdateCorpBasicInfoResponse.class)
                .withName("UpdateCorpBasicInfo")
                .withUri("/v1/usg/dcs/corp")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCorpBasicInfoRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCorpBasicInfoRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<ModCorpBasicInfoDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModCorpBasicInfoDTO.class),
            f -> f.withMarshaller(UpdateCorpBasicInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDepartmentRequest, UpdateDepartmentResponse> updateDepartment =
        genForupdateDepartment();

    private static HttpRequestDef<UpdateDepartmentRequest, UpdateDepartmentResponse> genForupdateDepartment() {
        // basic
        HttpRequestDef.Builder<UpdateDepartmentRequest, UpdateDepartmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDepartmentRequest.class, UpdateDepartmentResponse.class)
                .withName("UpdateDepartment")
                .withUri("/v1/usg/dcs/corp/dept/{dept_code}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("dept_code",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDepartmentRequest::getDeptCode, (req, v) -> {
                req.setDeptCode(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDepartmentRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDepartmentRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<ModDeptDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModDeptDTO.class),
            f -> f.withMarshaller(UpdateDepartmentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDeviceRequest, UpdateDeviceResponse> updateDevice = genForupdateDevice();

    private static HttpRequestDef<UpdateDeviceRequest, UpdateDeviceResponse> genForupdateDevice() {
        // basic
        HttpRequestDef.Builder<UpdateDeviceRequest, UpdateDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDeviceRequest.class, UpdateDeviceResponse.class)
                .withName("UpdateDevice")
                .withUri("/v1/usg/dcs/corp/device/{sn}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("sn",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeviceRequest::getSn, (req, v) -> {
                req.setSn(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeviceRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeviceRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<ModDeviceDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModDeviceDTO.class),
            f -> f.withMarshaller(UpdateDeviceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMaterialRequest, UpdateMaterialResponse> updateMaterial =
        genForupdateMaterial();

    private static HttpRequestDef<UpdateMaterialRequest, UpdateMaterialResponse> genForupdateMaterial() {
        // basic
        HttpRequestDef.Builder<UpdateMaterialRequest, UpdateMaterialResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateMaterialRequest.class, UpdateMaterialResponse.class)
                .withName("UpdateMaterial")
                .withUri("/v1/usg/sss/materials/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMaterialRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMaterialRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMaterialRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<UpdateMaterialRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateMaterialRequestDTO.class),
            f -> f.withMarshaller(UpdateMaterialRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMeetingRequest, UpdateMeetingResponse> updateMeeting =
        genForupdateMeeting();

    private static HttpRequestDef<UpdateMeetingRequest, UpdateMeetingResponse> genForupdateMeeting() {
        // basic
        HttpRequestDef.Builder<UpdateMeetingRequest, UpdateMeetingResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateMeetingRequest.class, UpdateMeetingResponse.class)
                .withName("UpdateMeeting")
                .withUri("/v1/mmc/management/conferences")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMeetingRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMeetingRequest::getUserUUID, (req, v) -> {
                req.setUserUUID(v);
            }));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMeetingRequest::getXAuthorizationType, (req, v) -> {
                req.setXAuthorizationType(v);
            }));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMeetingRequest::getXSiteId, (req, v) -> {
                req.setXSiteId(v);
            }));
        builder.<RestScheduleConfDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestScheduleConfDTO.class),
            f -> f.withMarshaller(UpdateMeetingRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<ConferenceInfo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(UpdateMeetingResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(ConferenceInfo.class));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMemberVmrRequest, UpdateMemberVmrResponse> updateMemberVmr =
        genForupdateMemberVmr();

    private static HttpRequestDef<UpdateMemberVmrRequest, UpdateMemberVmrResponse> genForupdateMemberVmr() {
        // basic
        HttpRequestDef.Builder<UpdateMemberVmrRequest, UpdateMemberVmrResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateMemberVmrRequest.class, UpdateMemberVmrResponse.class)
                .withName("UpdateMemberVmr")
                .withUri("/v1/usg/dcs/member/vmr/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMemberVmrRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMemberVmrRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMemberVmrRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<ModVmrDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModVmrDTO.class),
            f -> f.withMarshaller(UpdateMemberVmrRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMyInfoRequest, UpdateMyInfoResponse> updateMyInfo = genForupdateMyInfo();

    private static HttpRequestDef<UpdateMyInfoRequest, UpdateMyInfoResponse> genForupdateMyInfo() {
        // basic
        HttpRequestDef.Builder<UpdateMyInfoRequest, UpdateMyInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateMyInfoRequest.class, UpdateMyInfoResponse.class)
                .withName("UpdateMyInfo")
                .withUri("/v1/usg/dcs/member")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMyInfoRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMyInfoRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<ModMemberDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModMemberDTO.class),
            f -> f.withMarshaller(UpdateMyInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProgramRequest, UpdateProgramResponse> updateProgram =
        genForupdateProgram();

    private static HttpRequestDef<UpdateProgramRequest, UpdateProgramResponse> genForupdateProgram() {
        // basic
        HttpRequestDef.Builder<UpdateProgramRequest, UpdateProgramResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateProgramRequest.class, UpdateProgramResponse.class)
                .withName("UpdateProgram")
                .withUri("/v1/usg/sss/programs/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProgramRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProgramRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProgramRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<UpdateProgramRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateProgramRequestDTO.class),
            f -> f.withMarshaller(UpdateProgramRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePublicationRequest, UpdatePublicationResponse> updatePublication =
        genForupdatePublication();

    private static HttpRequestDef<UpdatePublicationRequest, UpdatePublicationResponse> genForupdatePublication() {
        // basic
        HttpRequestDef.Builder<UpdatePublicationRequest, UpdatePublicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePublicationRequest.class, UpdatePublicationResponse.class)
                .withName("UpdatePublication")
                .withUri("/v1/usg/sss/publications/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePublicationRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePublicationRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePublicationRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<UpdatePublicationRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePublicationRequestDTO.class),
            f -> f.withMarshaller(UpdatePublicationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePwdRequest, UpdatePwdResponse> updatePwd = genForupdatePwd();

    private static HttpRequestDef<UpdatePwdRequest, UpdatePwdResponse> genForupdatePwd() {
        // basic
        HttpRequestDef.Builder<UpdatePwdRequest, UpdatePwdResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePwdRequest.class, UpdatePwdResponse.class)
                .withName("UpdatePwd")
                .withUri("/v1/usg/acs/password")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePwdRequest::getXRequestID, (req, v) -> {
                req.setXRequestID(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePwdRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<ModPwdReqDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModPwdReqDTO.class),
            f -> f.withMarshaller(UpdatePwdRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRecurringMeetingRequest, UpdateRecurringMeetingResponse> updateRecurringMeeting =
        genForupdateRecurringMeeting();

    private static HttpRequestDef<UpdateRecurringMeetingRequest, UpdateRecurringMeetingResponse> genForupdateRecurringMeeting() {
        // basic
        HttpRequestDef.Builder<UpdateRecurringMeetingRequest, UpdateRecurringMeetingResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateRecurringMeetingRequest.class, UpdateRecurringMeetingResponse.class)
            .withName("UpdateRecurringMeeting")
            .withUri("/v1/mmc/management/cycleconferences")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecurringMeetingRequest::getUserUUID, (req, v) -> {
                req.setUserUUID(v);
            }));
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecurringMeetingRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecurringMeetingRequest::getXAuthorizationType, (req, v) -> {
                req.setXAuthorizationType(v);
            }));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecurringMeetingRequest::getXSiteId, (req, v) -> {
                req.setXSiteId(v);
            }));
        builder.<RestScheduleConfDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestScheduleConfDTO.class),
            f -> f.withMarshaller(UpdateRecurringMeetingRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<List<ConferenceInfo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(UpdateRecurringMeetingResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(ConferenceInfo.class));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRecurringSubMeetingRequest, UpdateRecurringSubMeetingResponse> updateRecurringSubMeeting =
        genForupdateRecurringSubMeeting();

    private static HttpRequestDef<UpdateRecurringSubMeetingRequest, UpdateRecurringSubMeetingResponse> genForupdateRecurringSubMeeting() {
        // basic
        HttpRequestDef.Builder<UpdateRecurringSubMeetingRequest, UpdateRecurringSubMeetingResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateRecurringSubMeetingRequest.class,
                    UpdateRecurringSubMeetingResponse.class)
                .withName("UpdateRecurringSubMeeting")
                .withUri("/v1/mmc/management/conferences/cyclesubconf")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecurringSubMeetingRequest::getUserUUID, (req, v) -> {
                req.setUserUUID(v);
            }));
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecurringSubMeetingRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecurringSubMeetingRequest::getXAuthorizationType, (req, v) -> {
                req.setXAuthorizationType(v);
            }));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecurringSubMeetingRequest::getXSiteId, (req, v) -> {
                req.setXSiteId(v);
            }));
        builder.<RestScheduleCycleConfDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestScheduleCycleConfDTO.class),
            f -> f.withMarshaller(UpdateRecurringSubMeetingRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateResourceRequest, UpdateResourceResponse> updateResource =
        genForupdateResource();

    private static HttpRequestDef<UpdateResourceRequest, UpdateResourceResponse> genForupdateResource() {
        // basic
        HttpRequestDef.Builder<UpdateResourceRequest, UpdateResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateResourceRequest.class, UpdateResourceResponse.class)
                .withName("UpdateResource")
                .withUri("/v1/usg/dcs/sp/corp/{corp_id}/resource")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("corp_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResourceRequest::getCorpId, (req, v) -> {
                req.setCorpId(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResourceRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResourceRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<List<ModResourceDTO>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(UpdateResourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(ModResourceDTO.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRoomSettingRequest, UpdateRoomSettingResponse> updateRoomSetting =
        genForupdateRoomSetting();

    private static HttpRequestDef<UpdateRoomSettingRequest, UpdateRoomSettingResponse> genForupdateRoomSetting() {
        // basic
        HttpRequestDef.Builder<UpdateRoomSettingRequest, UpdateRoomSettingResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateRoomSettingRequest.class, UpdateRoomSettingResponse.class)
                .withName("UpdateRoomSetting")
                .withUri("/v1/wss/webinar/open/room-setting/{conference_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conference_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRoomSettingRequest::getConferenceId, (req, v) -> {
                req.setConferenceId(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRoomSettingRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRoomSettingRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<OpenRoomSettingReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OpenRoomSettingReq.class),
            f -> f.withMarshaller(UpdateRoomSettingRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStartedConfConfigRequest, UpdateStartedConfConfigResponse> updateStartedConfConfig =
        genForupdateStartedConfConfig();

    private static HttpRequestDef<UpdateStartedConfConfigRequest, UpdateStartedConfConfigResponse> genForupdateStartedConfConfig() {
        // basic
        HttpRequestDef.Builder<UpdateStartedConfConfigRequest, UpdateStartedConfConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateStartedConfConfigRequest.class, UpdateStartedConfConfigResponse.class)
            .withName("UpdateStartedConfConfig")
            .withUri("/v1/mmc/control/conferences/updateStartedConfConfig")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStartedConfConfigRequest::getConferenceID, (req, v) -> {
                req.setConferenceID(v);
            }));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStartedConfConfigRequest::getXConferenceAuthorization, (req, v) -> {
                req.setXConferenceAuthorization(v);
            }));
        builder.<UpdateStartedConfigReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateStartedConfigReqBody.class),
            f -> f.withMarshaller(UpdateStartedConfConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTokenRequest, UpdateTokenResponse> updateToken = genForupdateToken();

    private static HttpRequestDef<UpdateTokenRequest, UpdateTokenResponse> genForupdateToken() {
        // basic
        HttpRequestDef.Builder<UpdateTokenRequest, UpdateTokenResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTokenRequest.class, UpdateTokenResponse.class)
                .withName("UpdateToken")
                .withUri("/v1/usg/acs/token")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTokenRequest::getXRequestID, (req, v) -> {
                req.setXRequestID(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTokenRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserRequest, UpdateUserResponse> updateUser = genForupdateUser();

    private static HttpRequestDef<UpdateUserRequest, UpdateUserResponse> genForupdateUser() {
        // basic
        HttpRequestDef.Builder<UpdateUserRequest, UpdateUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateUserRequest.class, UpdateUserResponse.class)
                .withName("UpdateUser")
                .withUri("/v1/usg/dcs/corp/member/{account}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("account",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserRequest::getAccount, (req, v) -> {
                req.setAccount(v);
            }));
        builder.<Integer>withRequestField("accountType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateUserRequest::getAccountType, (req, v) -> {
                req.setAccountType(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<ModUserDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModUserDTO.class),
            f -> f.withMarshaller(UpdateUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWebHookConfigStatusRequest, UpdateWebHookConfigStatusResponse> updateWebHookConfigStatus =
        genForupdateWebHookConfigStatus();

    private static HttpRequestDef<UpdateWebHookConfigStatusRequest, UpdateWebHookConfigStatusResponse> genForupdateWebHookConfigStatus() {
        // basic
        HttpRequestDef.Builder<UpdateWebHookConfigStatusRequest, UpdateWebHookConfigStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateWebHookConfigStatusRequest.class,
                    UpdateWebHookConfigStatusResponse.class)
                .withName("UpdateWebHookConfigStatus")
                .withUri("/v1/mmc/management/webhook/change-status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWebHookConfigStatusRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateWebHookConfigStatusRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWebinarRequest, UpdateWebinarResponse> updateWebinar =
        genForupdateWebinar();

    private static HttpRequestDef<UpdateWebinarRequest, UpdateWebinarResponse> genForupdateWebinar() {
        // basic
        HttpRequestDef.Builder<UpdateWebinarRequest, UpdateWebinarResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateWebinarRequest.class, UpdateWebinarResponse.class)
                .withName("UpdateWebinar")
                .withUri("/v1/wss/webinar/open/conferences")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWebinarRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWebinarRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<OpenEditConfReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpenEditConfReq.class),
            f -> f.withMarshaller(UpdateWebinarRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadFileRequest, UploadFileResponse> uploadFile = genForuploadFile();

    private static HttpRequestDef<UploadFileRequest, UploadFileResponse> genForuploadFile() {
        // basic
        HttpRequestDef.Builder<UploadFileRequest, UploadFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UploadFileRequest.class, UploadFileResponse.class)
                .withName("UploadFile")
                .withUri("/v1/wss/webinar/open/res/file")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadFileRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadFileRequest::getAcceptLanguage, (req, v) -> {
                req.setAcceptLanguage(v);
            }));
        builder.<UploadFileRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadFileRequestBody.class),
            f -> f.withMarshaller(UploadFileRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchQosHistoryMeetingsRequest, SearchQosHistoryMeetingsResponse> searchQosHistoryMeetings =
        genForsearchQosHistoryMeetings();

    private static HttpRequestDef<SearchQosHistoryMeetingsRequest, SearchQosHistoryMeetingsResponse> genForsearchQosHistoryMeetings() {
        // basic
        HttpRequestDef.Builder<SearchQosHistoryMeetingsRequest, SearchQosHistoryMeetingsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, SearchQosHistoryMeetingsRequest.class, SearchQosHistoryMeetingsResponse.class)
                .withName("SearchQosHistoryMeetings")
                .withUri("/v1/metrics/conferences/history")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("startDate",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchQosHistoryMeetingsRequest::getStartDate, (req, v) -> {
                req.setStartDate(v);
            }));
        builder.<Long>withRequestField("endDate",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchQosHistoryMeetingsRequest::getEndDate, (req, v) -> {
                req.setEndDate(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchQosHistoryMeetingsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchQosHistoryMeetingsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchQosHistoryMeetingsRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchQosOnlineMeetingsRequest, SearchQosOnlineMeetingsResponse> searchQosOnlineMeetings =
        genForsearchQosOnlineMeetings();

    private static HttpRequestDef<SearchQosOnlineMeetingsRequest, SearchQosOnlineMeetingsResponse> genForsearchQosOnlineMeetings() {
        // basic
        HttpRequestDef.Builder<SearchQosOnlineMeetingsRequest, SearchQosOnlineMeetingsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, SearchQosOnlineMeetingsRequest.class, SearchQosOnlineMeetingsResponse.class)
            .withName("SearchQosOnlineMeetings")
            .withUri("/v1/metrics/conferences/online")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchQosOnlineMeetingsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchQosOnlineMeetingsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchQosOnlineMeetingsRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchQosParticipantDetailRequest, SearchQosParticipantDetailResponse> searchQosParticipantDetail =
        genForsearchQosParticipantDetail();

    private static HttpRequestDef<SearchQosParticipantDetailRequest, SearchQosParticipantDetailResponse> genForsearchQosParticipantDetail() {
        // basic
        HttpRequestDef.Builder<SearchQosParticipantDetailRequest, SearchQosParticipantDetailResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    SearchQosParticipantDetailRequest.class,
                    SearchQosParticipantDetailResponse.class)
                .withName("SearchQosParticipantDetail")
                .withUri("/v1/metrics/conference/participant/qos")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("confUUID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchQosParticipantDetailRequest::getConfUUID, (req, v) -> {
                req.setConfUUID(v);
            }));
        builder.<SearchQosParticipantDetailRequest.ConfTypeEnum>withRequestField("confType",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchQosParticipantDetailRequest.ConfTypeEnum.class),
            f -> f.withMarshaller(SearchQosParticipantDetailRequest::getConfType, (req, v) -> {
                req.setConfType(v);
            }));
        builder.<String>withRequestField("participantID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchQosParticipantDetailRequest::getParticipantID, (req, v) -> {
                req.setParticipantID(v);
            }));
        builder.<SearchQosParticipantDetailRequest.QosTypeEnum>withRequestField("qosType",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchQosParticipantDetailRequest.QosTypeEnum.class),
            f -> f.withMarshaller(SearchQosParticipantDetailRequest::getQosType, (req, v) -> {
                req.setQosType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchQosParticipantsRequest, SearchQosParticipantsResponse> searchQosParticipants =
        genForsearchQosParticipants();

    private static HttpRequestDef<SearchQosParticipantsRequest, SearchQosParticipantsResponse> genForsearchQosParticipants() {
        // basic
        HttpRequestDef.Builder<SearchQosParticipantsRequest, SearchQosParticipantsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, SearchQosParticipantsRequest.class, SearchQosParticipantsResponse.class)
            .withName("SearchQosParticipants")
            .withUri("/v1/metrics/conference/participants")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("confUUID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchQosParticipantsRequest::getConfUUID, (req, v) -> {
                req.setConfUUID(v);
            }));
        builder.<SearchQosParticipantsRequest.ConfTypeEnum>withRequestField("confType",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchQosParticipantsRequest.ConfTypeEnum.class),
            f -> f.withMarshaller(SearchQosParticipantsRequest::getConfType, (req, v) -> {
                req.setConfType(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchQosParticipantsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchQosParticipantsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchQosParticipantsRequest::getSearchKey, (req, v) -> {
                req.setSearchKey(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetQosThresholdRequest, SetQosThresholdResponse> setQosThreshold =
        genForsetQosThreshold();

    private static HttpRequestDef<SetQosThresholdRequest, SetQosThresholdResponse> genForsetQosThreshold() {
        // basic
        HttpRequestDef.Builder<SetQosThresholdRequest, SetQosThresholdResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SetQosThresholdRequest.class, SetQosThresholdResponse.class)
                .withName("SetQosThreshold")
                .withUri("/v1/metrics/conference/threshold")
                .withContentType("application/json; charset=utf-8");

        // requests
        builder.<SetQosThresholdRequest.ThresholdTypeEnum>withRequestField("thresholdType",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetQosThresholdRequest.ThresholdTypeEnum.class),
            f -> f.withMarshaller(SetQosThresholdRequest::getThresholdType, (req, v) -> {
                req.setThresholdType(v);
            }));
        builder.<SetQosThresholdReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetQosThresholdReq.class),
            f -> f.withMarshaller(SetQosThresholdRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQosThresholdRequest, ShowQosThresholdResponse> showQosThreshold =
        genForshowQosThreshold();

    private static HttpRequestDef<ShowQosThresholdRequest, ShowQosThresholdResponse> genForshowQosThreshold() {
        // basic
        HttpRequestDef.Builder<ShowQosThresholdRequest, ShowQosThresholdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQosThresholdRequest.class, ShowQosThresholdResponse.class)
                .withName("ShowQosThreshold")
                .withUri("/v1/metrics/conference/threshold")
                .withContentType("application/json");

        // requests
        builder.<ShowQosThresholdRequest.ThresholdTypeEnum>withRequestField("thresholdType",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowQosThresholdRequest.ThresholdTypeEnum.class),
            f -> f.withMarshaller(ShowQosThresholdRequest::getThresholdType, (req, v) -> {
                req.setThresholdType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchStatisticConferenceInfoRequest, SearchStatisticConferenceInfoResponse> searchStatisticConferenceInfo =
        genForsearchStatisticConferenceInfo();

    private static HttpRequestDef<SearchStatisticConferenceInfoRequest, SearchStatisticConferenceInfoResponse> genForsearchStatisticConferenceInfo() {
        // basic
        HttpRequestDef.Builder<SearchStatisticConferenceInfoRequest, SearchStatisticConferenceInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    SearchStatisticConferenceInfoRequest.class,
                    SearchStatisticConferenceInfoResponse.class)
                .withName("SearchStatisticConferenceInfo")
                .withUri("/v1/metrics/dashboard/statistic/conference/info")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchStatisticConferenceInfoRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchStatisticConferenceInfoRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<SearchStatisticConferenceInfoRequest.TimeUnitEnum>withRequestField("timeUnit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchStatisticConferenceInfoRequest.TimeUnitEnum.class),
            f -> f.withMarshaller(SearchStatisticConferenceInfoRequest::getTimeUnit, (req, v) -> {
                req.setTimeUnit(v);
            }));
        builder.<String>withRequestField("startTime",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchStatisticConferenceInfoRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("endTime",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchStatisticConferenceInfoRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<SearchStatisticConferenceInfoRequest.CategoryEnum>withRequestField("category",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchStatisticConferenceInfoRequest.CategoryEnum.class),
            f -> f.withMarshaller(SearchStatisticConferenceInfoRequest::getCategory, (req, v) -> {
                req.setCategory(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchStatisticConferenceParticipantRequest, SearchStatisticConferenceParticipantResponse> searchStatisticConferenceParticipant =
        genForsearchStatisticConferenceParticipant();

    private static HttpRequestDef<SearchStatisticConferenceParticipantRequest, SearchStatisticConferenceParticipantResponse> genForsearchStatisticConferenceParticipant() {
        // basic
        HttpRequestDef.Builder<SearchStatisticConferenceParticipantRequest, SearchStatisticConferenceParticipantResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    SearchStatisticConferenceParticipantRequest.class,
                    SearchStatisticConferenceParticipantResponse.class)
                .withName("SearchStatisticConferenceParticipant")
                .withUri("/v1/metrics/dashboard/statistic/conference/participant")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchStatisticConferenceParticipantRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchStatisticConferenceParticipantRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<SearchStatisticConferenceParticipantRequest.TimeUnitEnum>withRequestField("timeUnit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchStatisticConferenceParticipantRequest.TimeUnitEnum.class),
            f -> f.withMarshaller(SearchStatisticConferenceParticipantRequest::getTimeUnit, (req, v) -> {
                req.setTimeUnit(v);
            }));
        builder.<String>withRequestField("startTime",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchStatisticConferenceParticipantRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("endTime",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchStatisticConferenceParticipantRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<SearchStatisticConferenceParticipantRequest.CategoryEnum>withRequestField("category",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchStatisticConferenceParticipantRequest.CategoryEnum.class),
            f -> f.withMarshaller(SearchStatisticConferenceParticipantRequest::getCategory, (req, v) -> {
                req.setCategory(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchStatisticResourceInfoRequest, SearchStatisticResourceInfoResponse> searchStatisticResourceInfo =
        genForsearchStatisticResourceInfo();

    private static HttpRequestDef<SearchStatisticResourceInfoRequest, SearchStatisticResourceInfoResponse> genForsearchStatisticResourceInfo() {
        // basic
        HttpRequestDef.Builder<SearchStatisticResourceInfoRequest, SearchStatisticResourceInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    SearchStatisticResourceInfoRequest.class,
                    SearchStatisticResourceInfoResponse.class)
                .withName("SearchStatisticResourceInfo")
                .withUri("/v1/metrics/dashboard/statistic/resource/info")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchStatisticResourceInfoRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchStatisticResourceInfoRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<SearchStatisticResourceInfoRequest.TimeUnitEnum>withRequestField("timeUnit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchStatisticResourceInfoRequest.TimeUnitEnum.class),
            f -> f.withMarshaller(SearchStatisticResourceInfoRequest::getTimeUnit, (req, v) -> {
                req.setTimeUnit(v);
            }));
        builder.<String>withRequestField("startTime",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchStatisticResourceInfoRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("endTime",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchStatisticResourceInfoRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<SearchStatisticResourceInfoRequest.CategoryEnum>withRequestField("category",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchStatisticResourceInfoRequest.CategoryEnum.class),
            f -> f.withMarshaller(SearchStatisticResourceInfoRequest::getCategory, (req, v) -> {
                req.setCategory(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchStatisticUserInfoRequest, SearchStatisticUserInfoResponse> searchStatisticUserInfo =
        genForsearchStatisticUserInfo();

    private static HttpRequestDef<SearchStatisticUserInfoRequest, SearchStatisticUserInfoResponse> genForsearchStatisticUserInfo() {
        // basic
        HttpRequestDef.Builder<SearchStatisticUserInfoRequest, SearchStatisticUserInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, SearchStatisticUserInfoRequest.class, SearchStatisticUserInfoResponse.class)
            .withName("SearchStatisticUserInfo")
            .withUri("/v1/metrics/dashboard/statistic/user/info")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchStatisticUserInfoRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchStatisticUserInfoRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<SearchStatisticUserInfoRequest.TimeUnitEnum>withRequestField("timeUnit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchStatisticUserInfoRequest.TimeUnitEnum.class),
            f -> f.withMarshaller(SearchStatisticUserInfoRequest::getTimeUnit, (req, v) -> {
                req.setTimeUnit(v);
            }));
        builder.<String>withRequestField("startTime",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchStatisticUserInfoRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("endTime",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchStatisticUserInfoRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<SearchStatisticUserInfoRequest.CategoryEnum>withRequestField("category",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchStatisticUserInfoRequest.CategoryEnum.class),
            f -> f.withMarshaller(SearchStatisticUserInfoRequest::getCategory, (req, v) -> {
                req.setCategory(v);
            }));

        // response

        return builder.build();
    }

}

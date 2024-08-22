package com.huaweicloud.sdk.meeting.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.meeting.v1.model.ActiveDTO;
import com.huaweicloud.sdk.meeting.v1.model.AddAppIdRequest;
import com.huaweicloud.sdk.meeting.v1.model.AddAppIdRequestBody;
import com.huaweicloud.sdk.meeting.v1.model.AddAppIdResponse;
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
import com.huaweicloud.sdk.meeting.v1.model.ResetAppKeyRequest;
import com.huaweicloud.sdk.meeting.v1.model.ResetAppKeyResponse;
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
import com.huaweicloud.sdk.meeting.v1.model.RestQosRequestDTO;
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
import com.huaweicloud.sdk.meeting.v1.model.SetProfileImageRequest;
import com.huaweicloud.sdk.meeting.v1.model.SetProfileImageRequestBody;
import com.huaweicloud.sdk.meeting.v1.model.SetProfileImageResponse;
import com.huaweicloud.sdk.meeting.v1.model.SetQosThresholdReq;
import com.huaweicloud.sdk.meeting.v1.model.SetQosThresholdRequest;
import com.huaweicloud.sdk.meeting.v1.model.SetQosThresholdResponse;
import com.huaweicloud.sdk.meeting.v1.model.SetRoleRequest;
import com.huaweicloud.sdk.meeting.v1.model.SetRoleResponse;
import com.huaweicloud.sdk.meeting.v1.model.SetSsoConfigRequest;
import com.huaweicloud.sdk.meeting.v1.model.SetSsoConfigResponse;
import com.huaweicloud.sdk.meeting.v1.model.SetUserProfileImageRequest;
import com.huaweicloud.sdk.meeting.v1.model.SetUserProfileImageRequestBody;
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
import com.huaweicloud.sdk.meeting.v1.model.UpdateAppIdRequest;
import com.huaweicloud.sdk.meeting.v1.model.UpdateAppIdRequestBody;
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

    public static final HttpRequestDef<AddAppIdRequest, AddAppIdResponse> addAppId = genForAddAppId();

    private static HttpRequestDef<AddAppIdRequest, AddAppIdResponse> genForAddAppId() {
        // basic
        HttpRequestDef.Builder<AddAppIdRequest, AddAppIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddAppIdRequest.class, AddAppIdResponse.class)
                .withName("AddAppId")
                .withUri("/v2/usg/acs/corp/app")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddAppIdRequest::getXRequestId, AddAppIdRequest::setXRequestId));
        builder.<AddAppIdRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddAppIdRequestBody.class),
            f -> f.withMarshaller(AddAppIdRequest::getBody, AddAppIdRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddCorpRequest, AddCorpResponse> addCorp = genForAddCorp();

    private static HttpRequestDef<AddCorpRequest, AddCorpResponse> genForAddCorp() {
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
            f -> f.withMarshaller(AddCorpRequest::getXRequestId, AddCorpRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddCorpRequest::getAcceptLanguage, AddCorpRequest::setAcceptLanguage));
        builder.<AddCorpDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddCorpDTO.class),
            f -> f.withMarshaller(AddCorpRequest::getBody, AddCorpRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddCorpAdminRequest, AddCorpAdminResponse> addCorpAdmin = genForAddCorpAdmin();

    private static HttpRequestDef<AddCorpAdminRequest, AddCorpAdminResponse> genForAddCorpAdmin() {
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
            f -> f.withMarshaller(AddCorpAdminRequest::getAccountType, AddCorpAdminRequest::setAccountType));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddCorpAdminRequest::getXRequestId, AddCorpAdminRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddCorpAdminRequest::getAcceptLanguage, AddCorpAdminRequest::setAcceptLanguage));
        builder.<CorpAdminDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CorpAdminDTO.class),
            f -> f.withMarshaller(AddCorpAdminRequest::getBody, AddCorpAdminRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddDepartmentRequest, AddDepartmentResponse> addDepartment =
        genForAddDepartment();

    private static HttpRequestDef<AddDepartmentRequest, AddDepartmentResponse> genForAddDepartment() {
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
            f -> f.withMarshaller(AddDepartmentRequest::getXRequestId, AddDepartmentRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddDepartmentRequest::getAcceptLanguage, AddDepartmentRequest::setAcceptLanguage));
        builder.<DeptDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeptDTO.class),
            f -> f.withMarshaller(AddDepartmentRequest::getBody, AddDepartmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddDeviceRequest, AddDeviceResponse> addDevice = genForAddDevice();

    private static HttpRequestDef<AddDeviceRequest, AddDeviceResponse> genForAddDevice() {
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
            f -> f.withMarshaller(AddDeviceRequest::getXRequestId, AddDeviceRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddDeviceRequest::getAcceptLanguage, AddDeviceRequest::setAcceptLanguage));
        builder.<AddDeviceDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddDeviceDTO.class),
            f -> f.withMarshaller(AddDeviceRequest::getBody, AddDeviceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddMaterialRequest, AddMaterialResponse> addMaterial = genForAddMaterial();

    private static HttpRequestDef<AddMaterialRequest, AddMaterialResponse> genForAddMaterial() {
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
            f -> f.withMarshaller(AddMaterialRequest::getXRequestId, AddMaterialRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddMaterialRequest::getAcceptLanguage, AddMaterialRequest::setAcceptLanguage));
        builder.<AddMaterialRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddMaterialRequestBody.class),
            f -> f.withMarshaller(AddMaterialRequest::getBody, AddMaterialRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddProgramRequest, AddProgramResponse> addProgram = genForAddProgram();

    private static HttpRequestDef<AddProgramRequest, AddProgramResponse> genForAddProgram() {
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
            f -> f.withMarshaller(AddProgramRequest::getXRequestId, AddProgramRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddProgramRequest::getAcceptLanguage, AddProgramRequest::setAcceptLanguage));
        builder.<CreateProgramRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateProgramRequestDTO.class),
            f -> f.withMarshaller(AddProgramRequest::getBody, AddProgramRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddPublicationRequest, AddPublicationResponse> addPublication =
        genForAddPublication();

    private static HttpRequestDef<AddPublicationRequest, AddPublicationResponse> genForAddPublication() {
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
            f -> f.withMarshaller(AddPublicationRequest::getXRequestId, AddPublicationRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddPublicationRequest::getAcceptLanguage, AddPublicationRequest::setAcceptLanguage));
        builder.<CreatePublicationRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePublicationRequestDTO.class),
            f -> f.withMarshaller(AddPublicationRequest::getBody, AddPublicationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddResourceRequest, AddResourceResponse> addResource = genForAddResource();

    private static HttpRequestDef<AddResourceRequest, AddResourceResponse> genForAddResource() {
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
            f -> f.withMarshaller(AddResourceRequest::getCorpId, AddResourceRequest::setCorpId));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddResourceRequest::getXRequestId, AddResourceRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddResourceRequest::getAcceptLanguage, AddResourceRequest::setAcceptLanguage));
        builder.<List<ResourceDTO>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(AddResourceRequest::getBody, AddResourceRequest::setBody)
                .withInnerContainerType(ResourceDTO.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddToPersonalSpaceRequest, AddToPersonalSpaceResponse> addToPersonalSpace =
        genForAddToPersonalSpace();

    private static HttpRequestDef<AddToPersonalSpaceRequest, AddToPersonalSpaceResponse> genForAddToPersonalSpace() {
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
            f -> f.withMarshaller(AddToPersonalSpaceRequest::getXRequestId, AddToPersonalSpaceRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddToPersonalSpaceRequest::getAcceptLanguage,
                AddToPersonalSpaceRequest::setAcceptLanguage));
        builder.<Map<String, String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f.withMarshaller(AddToPersonalSpaceRequest::getBody, AddToPersonalSpaceRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddUserRequest, AddUserResponse> addUser = genForAddUser();

    private static HttpRequestDef<AddUserRequest, AddUserResponse> genForAddUser() {
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
            f -> f.withMarshaller(AddUserRequest::getXRequestId, AddUserRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddUserRequest::getAcceptLanguage, AddUserRequest::setAcceptLanguage));
        builder.<AddUserDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddUserDTO.class),
            f -> f.withMarshaller(AddUserRequest::getBody, AddUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AllowClientRecordRequest, AllowClientRecordResponse> allowClientRecord =
        genForAllowClientRecord();

    private static HttpRequestDef<AllowClientRecordRequest, AllowClientRecordResponse> genForAllowClientRecord() {
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
            f -> f.withMarshaller(AllowClientRecordRequest::getConferenceID,
                AllowClientRecordRequest::setConferenceID));
        builder.<String>withRequestField("participantID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AllowClientRecordRequest::getParticipantID,
                AllowClientRecordRequest::setParticipantID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AllowClientRecordRequest::getXConferenceAuthorization,
                AllowClientRecordRequest::setXConferenceAuthorization));
        builder.<RestAllowClientRecordReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestAllowClientRecordReqBody.class),
            f -> f.withMarshaller(AllowClientRecordRequest::getBody, AllowClientRecordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AllowGuestUnmuteRequest, AllowGuestUnmuteResponse> allowGuestUnmute =
        genForAllowGuestUnmute();

    private static HttpRequestDef<AllowGuestUnmuteRequest, AllowGuestUnmuteResponse> genForAllowGuestUnmute() {
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
            f -> f.withMarshaller(AllowGuestUnmuteRequest::getConferenceID, AllowGuestUnmuteRequest::setConferenceID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AllowGuestUnmuteRequest::getXConferenceAuthorization,
                AllowGuestUnmuteRequest::setXConferenceAuthorization));
        builder.<RestAllowUnMuteReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestAllowUnMuteReqBody.class),
            f -> f.withMarshaller(AllowGuestUnmuteRequest::getBody, AllowGuestUnmuteRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AllowWaitingParticipantRequest, AllowWaitingParticipantResponse> allowWaitingParticipant =
        genForAllowWaitingParticipant();

    private static HttpRequestDef<AllowWaitingParticipantRequest, AllowWaitingParticipantResponse> genForAllowWaitingParticipant() {
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
            f -> f.withMarshaller(AllowWaitingParticipantRequest::getConferenceID,
                AllowWaitingParticipantRequest::setConferenceID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AllowWaitingParticipantRequest::getXConferenceAuthorization,
                AllowWaitingParticipantRequest::setXConferenceAuthorization));
        builder.<RestAllowWaitingParticipantReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestAllowWaitingParticipantReqBody.class),
            f -> f.withMarshaller(AllowWaitingParticipantRequest::getBody, AllowWaitingParticipantRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateVmrRequest, AssociateVmrResponse> associateVmr = genForAssociateVmr();

    private static HttpRequestDef<AssociateVmrRequest, AssociateVmrResponse> genForAssociateVmr() {
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
            f -> f.withMarshaller(AssociateVmrRequest::getAccount, AssociateVmrRequest::setAccount));
        builder.<Integer>withRequestField("accountType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(AssociateVmrRequest::getAccountType, AssociateVmrRequest::setAccountType));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateVmrRequest::getXRequestId, AssociateVmrRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateVmrRequest::getAcceptLanguage, AssociateVmrRequest::setAcceptLanguage));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(AssociateVmrRequest::getBody, AssociateVmrRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteCorpAdminsRequest, BatchDeleteCorpAdminsResponse> batchDeleteCorpAdmins =
        genForBatchDeleteCorpAdmins();

    private static HttpRequestDef<BatchDeleteCorpAdminsRequest, BatchDeleteCorpAdminsResponse> genForBatchDeleteCorpAdmins() {
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
            f -> f.withMarshaller(BatchDeleteCorpAdminsRequest::getAccountType,
                BatchDeleteCorpAdminsRequest::setAccountType));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteCorpAdminsRequest::getXRequestId,
                BatchDeleteCorpAdminsRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteCorpAdminsRequest::getAcceptLanguage,
                BatchDeleteCorpAdminsRequest::setAcceptLanguage));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchDeleteCorpAdminsRequest::getBody, BatchDeleteCorpAdminsRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteDevicesRequest, BatchDeleteDevicesResponse> batchDeleteDevices =
        genForBatchDeleteDevices();

    private static HttpRequestDef<BatchDeleteDevicesRequest, BatchDeleteDevicesResponse> genForBatchDeleteDevices() {
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
            f -> f.withMarshaller(BatchDeleteDevicesRequest::getXRequestId, BatchDeleteDevicesRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteDevicesRequest::getAcceptLanguage,
                BatchDeleteDevicesRequest::setAcceptLanguage));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchDeleteDevicesRequest::getBody, BatchDeleteDevicesRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteMaterialsRequest, BatchDeleteMaterialsResponse> batchDeleteMaterials =
        genForBatchDeleteMaterials();

    private static HttpRequestDef<BatchDeleteMaterialsRequest, BatchDeleteMaterialsResponse> genForBatchDeleteMaterials() {
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
            f -> f.withMarshaller(BatchDeleteMaterialsRequest::getXRequestId,
                BatchDeleteMaterialsRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteMaterialsRequest::getAcceptLanguage,
                BatchDeleteMaterialsRequest::setAcceptLanguage));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchDeleteMaterialsRequest::getBody, BatchDeleteMaterialsRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteProgramsRequest, BatchDeleteProgramsResponse> batchDeletePrograms =
        genForBatchDeletePrograms();

    private static HttpRequestDef<BatchDeleteProgramsRequest, BatchDeleteProgramsResponse> genForBatchDeletePrograms() {
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
            f -> f.withMarshaller(BatchDeleteProgramsRequest::getXRequestId,
                BatchDeleteProgramsRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteProgramsRequest::getAcceptLanguage,
                BatchDeleteProgramsRequest::setAcceptLanguage));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchDeleteProgramsRequest::getBody, BatchDeleteProgramsRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeletePublicationsRequest, BatchDeletePublicationsResponse> batchDeletePublications =
        genForBatchDeletePublications();

    private static HttpRequestDef<BatchDeletePublicationsRequest, BatchDeletePublicationsResponse> genForBatchDeletePublications() {
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
            f -> f.withMarshaller(BatchDeletePublicationsRequest::getXRequestId,
                BatchDeletePublicationsRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeletePublicationsRequest::getAcceptLanguage,
                BatchDeletePublicationsRequest::setAcceptLanguage));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchDeletePublicationsRequest::getBody, BatchDeletePublicationsRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteUsersRequest, BatchDeleteUsersResponse> batchDeleteUsers =
        genForBatchDeleteUsers();

    private static HttpRequestDef<BatchDeleteUsersRequest, BatchDeleteUsersResponse> genForBatchDeleteUsers() {
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
            f -> f.withMarshaller(BatchDeleteUsersRequest::getAccountType, BatchDeleteUsersRequest::setAccountType));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteUsersRequest::getXRequestId, BatchDeleteUsersRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteUsersRequest::getAcceptLanguage,
                BatchDeleteUsersRequest::setAcceptLanguage));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchDeleteUsersRequest::getBody, BatchDeleteUsersRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchHandRequest, BatchHandResponse> batchHand = genForBatchHand();

    private static HttpRequestDef<BatchHandRequest, BatchHandResponse> genForBatchHand() {
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
            f -> f.withMarshaller(BatchHandRequest::getConferenceID, BatchHandRequest::setConferenceID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchHandRequest::getXConferenceAuthorization,
                BatchHandRequest::setXConferenceAuthorization));
        builder.<RestBatchHandsUpReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestBatchHandsUpReqBody.class),
            f -> f.withMarshaller(BatchHandRequest::getBody, BatchHandRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchSearchAppIdRequest, BatchSearchAppIdResponse> batchSearchAppId =
        genForBatchSearchAppId();

    private static HttpRequestDef<BatchSearchAppIdRequest, BatchSearchAppIdResponse> genForBatchSearchAppId() {
        // basic
        HttpRequestDef.Builder<BatchSearchAppIdRequest, BatchSearchAppIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, BatchSearchAppIdRequest.class, BatchSearchAppIdResponse.class)
                .withName("BatchSearchAppId")
                .withUri("/v2/usg/acs/corp/apps")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchSearchAppIdRequest::getOffset, BatchSearchAppIdRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchSearchAppIdRequest::getLimit, BatchSearchAppIdRequest::setLimit));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchSearchAppIdRequest::getXRequestId, BatchSearchAppIdRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchSearchAppIdRequest::getAcceptLanguage,
                BatchSearchAppIdRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowUserDetailsRequest, BatchShowUserDetailsResponse> batchShowUserDetails =
        genForBatchShowUserDetails();

    private static HttpRequestDef<BatchShowUserDetailsRequest, BatchShowUserDetailsResponse> genForBatchShowUserDetails() {
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
            f -> f.withMarshaller(BatchShowUserDetailsRequest::getIdType, BatchShowUserDetailsRequest::setIdType));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowUserDetailsRequest::getXRequestId,
                BatchShowUserDetailsRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowUserDetailsRequest::getAcceptLanguage,
                BatchShowUserDetailsRequest::setAcceptLanguage));
        builder.<List<ShowUserRequestDTO>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchShowUserDetailsRequest::getBody, BatchShowUserDetailsRequest::setBody)
                .withInnerContainerType(ShowUserRequestDTO.class));

        // response
        builder.<List<UserDTO>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchShowUserDetailsResponse::getBody, BatchShowUserDetailsResponse::setBody)
                .withInnerContainerType(UserDTO.class));

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateDevicesStatusRequest, BatchUpdateDevicesStatusResponse> batchUpdateDevicesStatus =
        genForBatchUpdateDevicesStatus();

    private static HttpRequestDef<BatchUpdateDevicesStatusRequest, BatchUpdateDevicesStatusResponse> genForBatchUpdateDevicesStatus() {
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
            f -> f.withMarshaller(BatchUpdateDevicesStatusRequest::getValue,
                BatchUpdateDevicesStatusRequest::setValue));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateDevicesStatusRequest::getXRequestId,
                BatchUpdateDevicesStatusRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateDevicesStatusRequest::getAcceptLanguage,
                BatchUpdateDevicesStatusRequest::setAcceptLanguage));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchUpdateDevicesStatusRequest::getBody, BatchUpdateDevicesStatusRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateUserStatusRequest, BatchUpdateUserStatusResponse> batchUpdateUserStatus =
        genForBatchUpdateUserStatus();

    private static HttpRequestDef<BatchUpdateUserStatusRequest, BatchUpdateUserStatusResponse> genForBatchUpdateUserStatus() {
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
            f -> f.withMarshaller(BatchUpdateUserStatusRequest::getValue, BatchUpdateUserStatusRequest::setValue));
        builder.<Integer>withRequestField("accountType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchUpdateUserStatusRequest::getAccountType,
                BatchUpdateUserStatusRequest::setAccountType));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateUserStatusRequest::getXRequestId,
                BatchUpdateUserStatusRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateUserStatusRequest::getAcceptLanguage,
                BatchUpdateUserStatusRequest::setAcceptLanguage));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchUpdateUserStatusRequest::getBody, BatchUpdateUserStatusRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BroadcastParticipantRequest, BroadcastParticipantResponse> broadcastParticipant =
        genForBroadcastParticipant();

    private static HttpRequestDef<BroadcastParticipantRequest, BroadcastParticipantResponse> genForBroadcastParticipant() {
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
            f -> f.withMarshaller(BroadcastParticipantRequest::getConferenceID,
                BroadcastParticipantRequest::setConferenceID));
        builder.<String>withRequestField("participantID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BroadcastParticipantRequest::getParticipantID,
                BroadcastParticipantRequest::setParticipantID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BroadcastParticipantRequest::getXConferenceAuthorization,
                BroadcastParticipantRequest::setXConferenceAuthorization));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelBroadcastRequest, CancelBroadcastResponse> cancelBroadcast =
        genForCancelBroadcast();

    private static HttpRequestDef<CancelBroadcastRequest, CancelBroadcastResponse> genForCancelBroadcast() {
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
            f -> f.withMarshaller(CancelBroadcastRequest::getConferenceID, CancelBroadcastRequest::setConferenceID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelBroadcastRequest::getXConferenceAuthorization,
                CancelBroadcastRequest::setXConferenceAuthorization));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelMeetingRequest, CancelMeetingResponse> cancelMeeting =
        genForCancelMeeting();

    private static HttpRequestDef<CancelMeetingRequest, CancelMeetingResponse> genForCancelMeeting() {
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
            f -> f.withMarshaller(CancelMeetingRequest::getConferenceID, CancelMeetingRequest::setConferenceID));
        builder.<String>withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelMeetingRequest::getUserUUID, CancelMeetingRequest::setUserUUID));
        builder.<Integer>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CancelMeetingRequest::getType, CancelMeetingRequest::setType));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelMeetingRequest::getXAuthorizationType,
                CancelMeetingRequest::setXAuthorizationType));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelMeetingRequest::getXSiteId, CancelMeetingRequest::setXSiteId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelRecurringMeetingRequest, CancelRecurringMeetingResponse> cancelRecurringMeeting =
        genForCancelRecurringMeeting();

    private static HttpRequestDef<CancelRecurringMeetingRequest, CancelRecurringMeetingResponse> genForCancelRecurringMeeting() {
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
            f -> f.withMarshaller(CancelRecurringMeetingRequest::getUserUUID,
                CancelRecurringMeetingRequest::setUserUUID));
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelRecurringMeetingRequest::getConferenceID,
                CancelRecurringMeetingRequest::setConferenceID));
        builder.<Integer>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CancelRecurringMeetingRequest::getType, CancelRecurringMeetingRequest::setType));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelRecurringMeetingRequest::getXAuthorizationType,
                CancelRecurringMeetingRequest::setXAuthorizationType));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelRecurringMeetingRequest::getXSiteId,
                CancelRecurringMeetingRequest::setXSiteId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelRecurringSubMeetingRequest, CancelRecurringSubMeetingResponse> cancelRecurringSubMeeting =
        genForCancelRecurringSubMeeting();

    private static HttpRequestDef<CancelRecurringSubMeetingRequest, CancelRecurringSubMeetingResponse> genForCancelRecurringSubMeeting() {
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
            f -> f.withMarshaller(CancelRecurringSubMeetingRequest::getUserUUID,
                CancelRecurringSubMeetingRequest::setUserUUID));
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelRecurringSubMeetingRequest::getConferenceID,
                CancelRecurringSubMeetingRequest::setConferenceID));
        builder.<Integer>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CancelRecurringSubMeetingRequest::getType,
                CancelRecurringSubMeetingRequest::setType));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelRecurringSubMeetingRequest::getXAuthorizationType,
                CancelRecurringSubMeetingRequest::setXAuthorizationType));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelRecurringSubMeetingRequest::getXSiteId,
                CancelRecurringSubMeetingRequest::setXSiteId));
        builder.<RestCancelSingleRecordCycleConfListReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestCancelSingleRecordCycleConfListReqBody.class),
            f -> f.withMarshaller(CancelRecurringSubMeetingRequest::getBody,
                CancelRecurringSubMeetingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckSlideVerifyCodeRequest, CheckSlideVerifyCodeResponse> checkSlideVerifyCode =
        genForCheckSlideVerifyCode();

    private static HttpRequestDef<CheckSlideVerifyCodeRequest, CheckSlideVerifyCodeResponse> genForCheckSlideVerifyCode() {
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
            f -> f.withMarshaller(CheckSlideVerifyCodeRequest::getXRequestID,
                CheckSlideVerifyCodeRequest::setXRequestID));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckSlideVerifyCodeRequest::getAcceptLanguage,
                CheckSlideVerifyCodeRequest::setAcceptLanguage));
        builder.<SlideVerifyCodeCheckDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SlideVerifyCodeCheckDTO.class),
            f -> f.withMarshaller(CheckSlideVerifyCodeRequest::getBody, CheckSlideVerifyCodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckTokenRequest, CheckTokenResponse> checkToken = genForCheckToken();

    private static HttpRequestDef<CheckTokenRequest, CheckTokenResponse> genForCheckToken() {
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
            f -> f.withMarshaller(CheckTokenRequest::getXRequestID, CheckTokenRequest::setXRequestID));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckTokenRequest::getAcceptLanguage, CheckTokenRequest::setAcceptLanguage));
        builder.<ValidateTokenReqDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ValidateTokenReqDTO.class),
            f -> f.withMarshaller(CheckTokenRequest::getBody, CheckTokenRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckVeriCodeForUpdateUserInfoRequest, CheckVeriCodeForUpdateUserInfoResponse> checkVeriCodeForUpdateUserInfo =
        genForCheckVeriCodeForUpdateUserInfo();

    private static HttpRequestDef<CheckVeriCodeForUpdateUserInfoRequest, CheckVeriCodeForUpdateUserInfoResponse> genForCheckVeriCodeForUpdateUserInfo() {
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
            f -> f.withMarshaller(CheckVeriCodeForUpdateUserInfoRequest::getXRequestId,
                CheckVeriCodeForUpdateUserInfoRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckVeriCodeForUpdateUserInfoRequest::getAcceptLanguage,
                CheckVeriCodeForUpdateUserInfoRequest::setAcceptLanguage));
        builder.<VerificationCodeDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VerificationCodeDTO.class),
            f -> f.withMarshaller(CheckVeriCodeForUpdateUserInfoRequest::getBody,
                CheckVeriCodeForUpdateUserInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckVerifyCodeRequest, CheckVerifyCodeResponse> checkVerifyCode =
        genForCheckVerifyCode();

    private static HttpRequestDef<CheckVerifyCodeRequest, CheckVerifyCodeResponse> genForCheckVerifyCode() {
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
            f -> f.withMarshaller(CheckVerifyCodeRequest::getXRequestID, CheckVerifyCodeRequest::setXRequestID));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckVerifyCodeRequest::getAcceptLanguage,
                CheckVerifyCodeRequest::setAcceptLanguage));
        builder.<VerifyCodeCheckDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VerifyCodeCheckDTO.class),
            f -> f.withMarshaller(CheckVerifyCodeRequest::getBody, CheckVerifyCodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAnonymousAuthRandomRequest, CreateAnonymousAuthRandomResponse> createAnonymousAuthRandom =
        genForCreateAnonymousAuthRandom();

    private static HttpRequestDef<CreateAnonymousAuthRandomRequest, CreateAnonymousAuthRandomResponse> genForCreateAnonymousAuthRandom() {
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
            f -> f.withMarshaller(CreateAnonymousAuthRandomRequest::getConferenceID,
                CreateAnonymousAuthRandomRequest::setConferenceID));
        builder.<String>withRequestField("X-Password",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAnonymousAuthRandomRequest::getXPassword,
                CreateAnonymousAuthRandomRequest::setXPassword));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateConfTokenRequest, CreateConfTokenResponse> createConfToken =
        genForCreateConfToken();

    private static HttpRequestDef<CreateConfTokenRequest, CreateConfTokenResponse> genForCreateConfToken() {
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
            f -> f.withMarshaller(CreateConfTokenRequest::getConferenceID, CreateConfTokenRequest::setConferenceID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateConfTokenRequest::getXConferenceAuthorization,
                CreateConfTokenRequest::setXConferenceAuthorization));
        builder.<String>withRequestField("X-Password",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateConfTokenRequest::getXPassword, CreateConfTokenRequest::setXPassword));
        builder.<Integer>withRequestField("X-Login-Type",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateConfTokenRequest::getXLoginType, CreateConfTokenRequest::setXLoginType));
        builder.<String>withRequestField("X-Nonce",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateConfTokenRequest::getXNonce, CreateConfTokenRequest::setXNonce));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMeetingRequest, CreateMeetingResponse> createMeeting =
        genForCreateMeeting();

    private static HttpRequestDef<CreateMeetingRequest, CreateMeetingResponse> genForCreateMeeting() {
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
            f -> f.withMarshaller(CreateMeetingRequest::getUserUUID, CreateMeetingRequest::setUserUUID));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMeetingRequest::getXAuthorizationType,
                CreateMeetingRequest::setXAuthorizationType));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMeetingRequest::getXSiteId, CreateMeetingRequest::setXSiteId));
        builder.<RestScheduleConfDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestScheduleConfDTO.class),
            f -> f.withMarshaller(CreateMeetingRequest::getBody, CreateMeetingRequest::setBody));

        // response
        builder.<List<ConferenceInfo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CreateMeetingResponse::getBody, CreateMeetingResponse::setBody)
                .withInnerContainerType(ConferenceInfo.class));

        return builder.build();
    }

    public static final HttpRequestDef<CreatePortalRefNonceRequest, CreatePortalRefNonceResponse> createPortalRefNonce =
        genForCreatePortalRefNonce();

    private static HttpRequestDef<CreatePortalRefNonceRequest, CreatePortalRefNonceResponse> genForCreatePortalRefNonce() {
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
            f -> f.withMarshaller(CreatePortalRefNonceRequest::getXRequestId,
                CreatePortalRefNonceRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePortalRefNonceRequest::getAcceptLanguage,
                CreatePortalRefNonceRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRecurringMeetingRequest, CreateRecurringMeetingResponse> createRecurringMeeting =
        genForCreateRecurringMeeting();

    private static HttpRequestDef<CreateRecurringMeetingRequest, CreateRecurringMeetingResponse> genForCreateRecurringMeeting() {
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
            f -> f.withMarshaller(CreateRecurringMeetingRequest::getUserUUID,
                CreateRecurringMeetingRequest::setUserUUID));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRecurringMeetingRequest::getXAuthorizationType,
                CreateRecurringMeetingRequest::setXAuthorizationType));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRecurringMeetingRequest::getXSiteId,
                CreateRecurringMeetingRequest::setXSiteId));
        builder.<RestScheduleConfDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestScheduleConfDTO.class),
            f -> f.withMarshaller(CreateRecurringMeetingRequest::getBody, CreateRecurringMeetingRequest::setBody));

        // response
        builder.<List<ConferenceInfo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CreateRecurringMeetingResponse::getBody, CreateRecurringMeetingResponse::setBody)
                .withInnerContainerType(ConferenceInfo.class));

        return builder.build();
    }

    public static final HttpRequestDef<CreateVisionActiveCodeRequest, CreateVisionActiveCodeResponse> createVisionActiveCode =
        genForCreateVisionActiveCode();

    private static HttpRequestDef<CreateVisionActiveCodeRequest, CreateVisionActiveCodeResponse> genForCreateVisionActiveCode() {
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
            f -> f.withMarshaller(CreateVisionActiveCodeRequest::getXRequestId,
                CreateVisionActiveCodeRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVisionActiveCodeRequest::getAcceptLanguage,
                CreateVisionActiveCodeRequest::setAcceptLanguage));
        builder.<VisionActiveCodeDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VisionActiveCodeDTO.class),
            f -> f.withMarshaller(CreateVisionActiveCodeRequest::getBody, CreateVisionActiveCodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWebSocketTokenRequest, CreateWebSocketTokenResponse> createWebSocketToken =
        genForCreateWebSocketToken();

    private static HttpRequestDef<CreateWebSocketTokenRequest, CreateWebSocketTokenResponse> genForCreateWebSocketToken() {
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
            f -> f.withMarshaller(CreateWebSocketTokenRequest::getConferenceID,
                CreateWebSocketTokenRequest::setConferenceID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateWebSocketTokenRequest::getXConferenceAuthorization,
                CreateWebSocketTokenRequest::setXConferenceAuthorization));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWebinarRequest, CreateWebinarResponse> createWebinar =
        genForCreateWebinar();

    private static HttpRequestDef<CreateWebinarRequest, CreateWebinarResponse> genForCreateWebinar() {
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
            f -> f.withMarshaller(CreateWebinarRequest::getXRequestId, CreateWebinarRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateWebinarRequest::getAcceptLanguage, CreateWebinarRequest::setAcceptLanguage));
        builder.<OpenScheduleConfReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpenScheduleConfReq.class),
            f -> f.withMarshaller(CreateWebinarRequest::getBody, CreateWebinarRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppIdRequest, DeleteAppIdResponse> deleteAppId = genForDeleteAppId();

    private static HttpRequestDef<DeleteAppIdRequest, DeleteAppIdResponse> genForDeleteAppId() {
        // basic
        HttpRequestDef.Builder<DeleteAppIdRequest, DeleteAppIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAppIdRequest.class, DeleteAppIdResponse.class)
                .withName("DeleteAppId")
                .withUri("/v2/usg/acs/corp/app/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppIdRequest::getAppId, DeleteAppIdRequest::setAppId));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppIdRequest::getXRequestId, DeleteAppIdRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppIdRequest::getAcceptLanguage, DeleteAppIdRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAttendeesRequest, DeleteAttendeesResponse> deleteAttendees =
        genForDeleteAttendees();

    private static HttpRequestDef<DeleteAttendeesRequest, DeleteAttendeesResponse> genForDeleteAttendees() {
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
            f -> f.withMarshaller(DeleteAttendeesRequest::getConferenceID, DeleteAttendeesRequest::setConferenceID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAttendeesRequest::getXConferenceAuthorization,
                DeleteAttendeesRequest::setXConferenceAuthorization));
        builder.<RestBulkDelAttendReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestBulkDelAttendReqBody.class),
            f -> f.withMarshaller(DeleteAttendeesRequest::getBody, DeleteAttendeesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCorpRequest, DeleteCorpResponse> deleteCorp = genForDeleteCorp();

    private static HttpRequestDef<DeleteCorpRequest, DeleteCorpResponse> genForDeleteCorp() {
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
            f -> f.withMarshaller(DeleteCorpRequest::getId, DeleteCorpRequest::setId));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCorpRequest::getXRequestId, DeleteCorpRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCorpRequest::getAcceptLanguage, DeleteCorpRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCorpVmrRequest, DeleteCorpVmrResponse> deleteCorpVmr =
        genForDeleteCorpVmr();

    private static HttpRequestDef<DeleteCorpVmrRequest, DeleteCorpVmrResponse> genForDeleteCorpVmr() {
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
            f -> f.withMarshaller(DeleteCorpVmrRequest::getXRequestId, DeleteCorpVmrRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCorpVmrRequest::getAcceptLanguage, DeleteCorpVmrRequest::setAcceptLanguage));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteCorpVmrRequest::getBody, DeleteCorpVmrRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDepartmentRequest, DeleteDepartmentResponse> deleteDepartment =
        genForDeleteDepartment();

    private static HttpRequestDef<DeleteDepartmentRequest, DeleteDepartmentResponse> genForDeleteDepartment() {
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
            f -> f.withMarshaller(DeleteDepartmentRequest::getDeptCode, DeleteDepartmentRequest::setDeptCode));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDepartmentRequest::getXRequestId, DeleteDepartmentRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDepartmentRequest::getAcceptLanguage,
                DeleteDepartmentRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLayoutRequest, DeleteLayoutResponse> deleteLayout = genForDeleteLayout();

    private static HttpRequestDef<DeleteLayoutRequest, DeleteLayoutResponse> genForDeleteLayout() {
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
            f -> f.withMarshaller(DeleteLayoutRequest::getConferenceID, DeleteLayoutRequest::setConferenceID));
        builder.<String>withRequestField("uuID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLayoutRequest::getUuID, DeleteLayoutRequest::setUuID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLayoutRequest::getXConferenceAuthorization,
                DeleteLayoutRequest::setXConferenceAuthorization));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRecordingsRequest, DeleteRecordingsResponse> deleteRecordings =
        genForDeleteRecordings();

    private static HttpRequestDef<DeleteRecordingsRequest, DeleteRecordingsResponse> genForDeleteRecordings() {
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
            f -> f.withMarshaller(DeleteRecordingsRequest::getConfUUIDs, DeleteRecordingsRequest::setConfUUIDs));
        builder.<String>withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRecordingsRequest::getUserUUID, DeleteRecordingsRequest::setUserUUID));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRecordingsRequest::getXAuthorizationType,
                DeleteRecordingsRequest::setXAuthorizationType));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRecordingsRequest::getXSiteId, DeleteRecordingsRequest::setXSiteId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResourceRequest, DeleteResourceResponse> deleteResource =
        genForDeleteResource();

    private static HttpRequestDef<DeleteResourceRequest, DeleteResourceResponse> genForDeleteResource() {
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
            f -> f.withMarshaller(DeleteResourceRequest::getCorpId, DeleteResourceRequest::setCorpId));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceRequest::getXRequestId, DeleteResourceRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceRequest::getAcceptLanguage, DeleteResourceRequest::setAcceptLanguage));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteResourceRequest::getBody, DeleteResourceRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTokenRequest, DeleteTokenResponse> deleteToken = genForDeleteToken();

    private static HttpRequestDef<DeleteTokenRequest, DeleteTokenResponse> genForDeleteToken() {
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
            f -> f.withMarshaller(DeleteTokenRequest::getXRequestID, DeleteTokenRequest::setXRequestID));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTokenRequest::getAcceptLanguage, DeleteTokenRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVisionActiveCodeRequest, DeleteVisionActiveCodeResponse> deleteVisionActiveCode =
        genForDeleteVisionActiveCode();

    private static HttpRequestDef<DeleteVisionActiveCodeRequest, DeleteVisionActiveCodeResponse> genForDeleteVisionActiveCode() {
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
            f -> f.withMarshaller(DeleteVisionActiveCodeRequest::getXRequestId,
                DeleteVisionActiveCodeRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVisionActiveCodeRequest::getAcceptLanguage,
                DeleteVisionActiveCodeRequest::setAcceptLanguage));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteVisionActiveCodeRequest::getBody, DeleteVisionActiveCodeRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWebHookConfigRequest, DeleteWebHookConfigResponse> deleteWebHookConfig =
        genForDeleteWebHookConfig();

    private static HttpRequestDef<DeleteWebHookConfigRequest, DeleteWebHookConfigResponse> genForDeleteWebHookConfig() {
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
            f -> f.withMarshaller(DeleteWebHookConfigRequest::getId, DeleteWebHookConfigRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWebinarRequest, DeleteWebinarResponse> deleteWebinar =
        genForDeleteWebinar();

    private static HttpRequestDef<DeleteWebinarRequest, DeleteWebinarResponse> genForDeleteWebinar() {
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
            f -> f.withMarshaller(DeleteWebinarRequest::getConferenceId, DeleteWebinarRequest::setConferenceId));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWebinarRequest::getXRequestId, DeleteWebinarRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWebinarRequest::getAcceptLanguage, DeleteWebinarRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateVmrRequest, DisassociateVmrResponse> disassociateVmr =
        genForDisassociateVmr();

    private static HttpRequestDef<DisassociateVmrRequest, DisassociateVmrResponse> genForDisassociateVmr() {
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
            f -> f.withMarshaller(DisassociateVmrRequest::getAccount, DisassociateVmrRequest::setAccount));
        builder.<Integer>withRequestField("accountType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DisassociateVmrRequest::getAccountType, DisassociateVmrRequest::setAccountType));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateVmrRequest::getXRequestId, DisassociateVmrRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateVmrRequest::getAcceptLanguage,
                DisassociateVmrRequest::setAcceptLanguage));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DisassociateVmrRequest::getBody, DisassociateVmrRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<HandRequest, HandResponse> hand = genForHand();

    private static HttpRequestDef<HandRequest, HandResponse> genForHand() {
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
            f -> f.withMarshaller(HandRequest::getConferenceID, HandRequest::setConferenceID));
        builder.<String>withRequestField("participantID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(HandRequest::getParticipantID, HandRequest::setParticipantID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(HandRequest::getXConferenceAuthorization, HandRequest::setXConferenceAuthorization));
        builder.<RestHandsUpReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestHandsUpReqBody.class),
            f -> f.withMarshaller(HandRequest::getBody, HandRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<HangUpRequest, HangUpResponse> hangUp = genForHangUp();

    private static HttpRequestDef<HangUpRequest, HangUpResponse> genForHangUp() {
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
            f -> f.withMarshaller(HangUpRequest::getConferenceID, HangUpRequest::setConferenceID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(HangUpRequest::getXConferenceAuthorization,
                HangUpRequest::setXConferenceAuthorization));
        builder.<RestBulkHangUpReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestBulkHangUpReqBody.class),
            f -> f.withMarshaller(HangUpRequest::getBody, HangUpRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<InviteOperateVideoRequest, InviteOperateVideoResponse> inviteOperateVideo =
        genForInviteOperateVideo();

    private static HttpRequestDef<InviteOperateVideoRequest, InviteOperateVideoResponse> genForInviteOperateVideo() {
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
            f -> f.withMarshaller(InviteOperateVideoRequest::getConferenceID,
                InviteOperateVideoRequest::setConferenceID));
        builder.<String>withRequestField("participantID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InviteOperateVideoRequest::getParticipantID,
                InviteOperateVideoRequest::setParticipantID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InviteOperateVideoRequest::getXConferenceAuthorization,
                InviteOperateVideoRequest::setXConferenceAuthorization));
        builder.<RestVideoBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestVideoBody.class),
            f -> f.withMarshaller(InviteOperateVideoRequest::getBody, InviteOperateVideoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<InviteParticipantRequest, InviteParticipantResponse> inviteParticipant =
        genForInviteParticipant();

    private static HttpRequestDef<InviteParticipantRequest, InviteParticipantResponse> genForInviteParticipant() {
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
            f -> f.withMarshaller(InviteParticipantRequest::getConferenceID,
                InviteParticipantRequest::setConferenceID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InviteParticipantRequest::getXConferenceAuthorization,
                InviteParticipantRequest::setXConferenceAuthorization));
        builder.<RestInviteReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestInviteReqBody.class),
            f -> f.withMarshaller(InviteParticipantRequest::getBody, InviteParticipantRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<InviteShareRequest, InviteShareResponse> inviteShare = genForInviteShare();

    private static HttpRequestDef<InviteShareRequest, InviteShareResponse> genForInviteShare() {
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
            f -> f.withMarshaller(InviteShareRequest::getConferenceID, InviteShareRequest::setConferenceID));
        builder.<String>withRequestField("participantID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InviteShareRequest::getParticipantID, InviteShareRequest::setParticipantID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InviteShareRequest::getXConferenceAuthorization,
                InviteShareRequest::setXConferenceAuthorization));
        builder.<InviteShareDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InviteShareDTO.class),
            f -> f.withMarshaller(InviteShareRequest::getBody, InviteShareRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<InviteUserRequest, InviteUserResponse> inviteUser = genForInviteUser();

    private static HttpRequestDef<InviteUserRequest, InviteUserResponse> genForInviteUser() {
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
            f -> f.withMarshaller(InviteUserRequest::getXRequestId, InviteUserRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InviteUserRequest::getAcceptLanguage, InviteUserRequest::setAcceptLanguage));
        builder.<AddUserRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddUserRequestBody.class),
            f -> f.withMarshaller(InviteUserRequest::getBody, InviteUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<InviteWithPwdRequest, InviteWithPwdResponse> inviteWithPwd =
        genForInviteWithPwd();

    private static HttpRequestDef<InviteWithPwdRequest, InviteWithPwdResponse> genForInviteWithPwd() {
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
            f -> f.withMarshaller(InviteWithPwdRequest::getConferenceID, InviteWithPwdRequest::setConferenceID));
        builder.<RestInviteWithPwdReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestInviteWithPwdReqBody.class),
            f -> f.withMarshaller(InviteWithPwdRequest::getBody, InviteWithPwdRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHistoryWebinarsRequest, ListHistoryWebinarsResponse> listHistoryWebinars =
        genForListHistoryWebinars();

    private static HttpRequestDef<ListHistoryWebinarsRequest, ListHistoryWebinarsResponse> genForListHistoryWebinars() {
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
            f -> f.withMarshaller(ListHistoryWebinarsRequest::getOffset, ListHistoryWebinarsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHistoryWebinarsRequest::getLimit, ListHistoryWebinarsRequest::setLimit));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryWebinarsRequest::getSearchKey, ListHistoryWebinarsRequest::setSearchKey));
        builder.<String>withRequestField("sortType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryWebinarsRequest::getSortType, ListHistoryWebinarsRequest::setSortType));
        builder.<String>withRequestField("startTime",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryWebinarsRequest::getStartTime, ListHistoryWebinarsRequest::setStartTime));
        builder.<String>withRequestField("endTime",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryWebinarsRequest::getEndTime, ListHistoryWebinarsRequest::setEndTime));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryWebinarsRequest::getXRequestId,
                ListHistoryWebinarsRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryWebinarsRequest::getAcceptLanguage,
                ListHistoryWebinarsRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNetworkQualityRequest, ListNetworkQualityResponse> listNetworkQuality =
        genForListNetworkQuality();

    private static HttpRequestDef<ListNetworkQualityRequest, ListNetworkQualityResponse> genForListNetworkQuality() {
        // basic
        HttpRequestDef.Builder<ListNetworkQualityRequest, ListNetworkQualityResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListNetworkQualityRequest.class, ListNetworkQualityResponse.class)
                .withName("ListNetworkQuality")
                .withUri("/v1/mmc/cqs/media/qos")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("conferenceid",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNetworkQualityRequest::getConferenceid,
                ListNetworkQualityRequest::setConferenceid));
        builder.<String>withRequestField("appid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNetworkQualityRequest::getAppid, ListNetworkQualityRequest::setAppid));
        builder.<String>withRequestField("confuuid",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNetworkQualityRequest::getConfuuid, ListNetworkQualityRequest::setConfuuid));
        builder.<String>withRequestField("confToken",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNetworkQualityRequest::getConfToken, ListNetworkQualityRequest::setConfToken));
        builder.<RestQosRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RestQosRequestDTO.class),
            f -> f.withMarshaller(ListNetworkQualityRequest::getBody, ListNetworkQualityRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOngoingWebinarsRequest, ListOngoingWebinarsResponse> listOngoingWebinars =
        genForListOngoingWebinars();

    private static HttpRequestDef<ListOngoingWebinarsRequest, ListOngoingWebinarsResponse> genForListOngoingWebinars() {
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
            f -> f.withMarshaller(ListOngoingWebinarsRequest::getOffset, ListOngoingWebinarsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOngoingWebinarsRequest::getLimit, ListOngoingWebinarsRequest::setLimit));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOngoingWebinarsRequest::getSearchKey, ListOngoingWebinarsRequest::setSearchKey));
        builder.<String>withRequestField("sortType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOngoingWebinarsRequest::getSortType, ListOngoingWebinarsRequest::setSortType));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOngoingWebinarsRequest::getXRequestId,
                ListOngoingWebinarsRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOngoingWebinarsRequest::getAcceptLanguage,
                ListOngoingWebinarsRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUpComingWebinarsRequest, ListUpComingWebinarsResponse> listUpComingWebinars =
        genForListUpComingWebinars();

    private static HttpRequestDef<ListUpComingWebinarsRequest, ListUpComingWebinarsResponse> genForListUpComingWebinars() {
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
            f -> f.withMarshaller(ListUpComingWebinarsRequest::getOffset, ListUpComingWebinarsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUpComingWebinarsRequest::getLimit, ListUpComingWebinarsRequest::setLimit));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUpComingWebinarsRequest::getSearchKey,
                ListUpComingWebinarsRequest::setSearchKey));
        builder.<String>withRequestField("sortType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUpComingWebinarsRequest::getSortType, ListUpComingWebinarsRequest::setSortType));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUpComingWebinarsRequest::getXRequestId,
                ListUpComingWebinarsRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUpComingWebinarsRequest::getAcceptLanguage,
                ListUpComingWebinarsRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<LiveRequest, LiveResponse> live = genForLive();

    private static HttpRequestDef<LiveRequest, LiveResponse> genForLive() {
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
            f -> f.withMarshaller(LiveRequest::getConferenceID, LiveRequest::setConferenceID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(LiveRequest::getXConferenceAuthorization, LiveRequest::setXConferenceAuthorization));
        builder.<RestSetLiveReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestSetLiveReqBody.class),
            f -> f.withMarshaller(LiveRequest::getBody, LiveRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<LockMeetingRequest, LockMeetingResponse> lockMeeting = genForLockMeeting();

    private static HttpRequestDef<LockMeetingRequest, LockMeetingResponse> genForLockMeeting() {
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
            f -> f.withMarshaller(LockMeetingRequest::getConferenceID, LockMeetingRequest::setConferenceID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(LockMeetingRequest::getXConferenceAuthorization,
                LockMeetingRequest::setXConferenceAuthorization));
        builder.<RestLockReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestLockReqBody.class),
            f -> f.withMarshaller(LockMeetingRequest::getBody, LockMeetingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<LockViewRequest, LockViewResponse> lockView = genForLockView();

    private static HttpRequestDef<LockViewRequest, LockViewResponse> genForLockView() {
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
            f -> f.withMarshaller(LockViewRequest::getConferenceID, LockViewRequest::setConferenceID));
        builder.<String>withRequestField("participantID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(LockViewRequest::getParticipantID, LockViewRequest::setParticipantID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(LockViewRequest::getXConferenceAuthorization,
                LockViewRequest::setXConferenceAuthorization));
        builder.<RestLockSiteViewReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestLockSiteViewReqBody.class),
            f -> f.withMarshaller(LockViewRequest::getBody, LockViewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<MoveToWaitingRoomRequest, MoveToWaitingRoomResponse> moveToWaitingRoom =
        genForMoveToWaitingRoom();

    private static HttpRequestDef<MoveToWaitingRoomRequest, MoveToWaitingRoomResponse> genForMoveToWaitingRoom() {
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
            f -> f.withMarshaller(MoveToWaitingRoomRequest::getConferenceID,
                MoveToWaitingRoomRequest::setConferenceID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MoveToWaitingRoomRequest::getXConferenceAuthorization,
                MoveToWaitingRoomRequest::setXConferenceAuthorization));
        builder.<RestMoveToWaitingRoomReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestMoveToWaitingRoomReqBody.class),
            f -> f.withMarshaller(MoveToWaitingRoomRequest::getBody, MoveToWaitingRoomRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<MuteMeetingRequest, MuteMeetingResponse> muteMeeting = genForMuteMeeting();

    private static HttpRequestDef<MuteMeetingRequest, MuteMeetingResponse> genForMuteMeeting() {
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
            f -> f.withMarshaller(MuteMeetingRequest::getConferenceID, MuteMeetingRequest::setConferenceID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MuteMeetingRequest::getXConferenceAuthorization,
                MuteMeetingRequest::setXConferenceAuthorization));
        builder.<RestMuteReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestMuteReqBody.class),
            f -> f.withMarshaller(MuteMeetingRequest::getBody, MuteMeetingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<MuteParticipantRequest, MuteParticipantResponse> muteParticipant =
        genForMuteParticipant();

    private static HttpRequestDef<MuteParticipantRequest, MuteParticipantResponse> genForMuteParticipant() {
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
            f -> f.withMarshaller(MuteParticipantRequest::getConferenceID, MuteParticipantRequest::setConferenceID));
        builder.<String>withRequestField("participantID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MuteParticipantRequest::getParticipantID, MuteParticipantRequest::setParticipantID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MuteParticipantRequest::getXConferenceAuthorization,
                MuteParticipantRequest::setXConferenceAuthorization));
        builder.<RestMuteParticipantReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestMuteParticipantReqBody.class),
            f -> f.withMarshaller(MuteParticipantRequest::getBody, MuteParticipantRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ProlongMeetingRequest, ProlongMeetingResponse> prolongMeeting =
        genForProlongMeeting();

    private static HttpRequestDef<ProlongMeetingRequest, ProlongMeetingResponse> genForProlongMeeting() {
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
            f -> f.withMarshaller(ProlongMeetingRequest::getConferenceID, ProlongMeetingRequest::setConferenceID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ProlongMeetingRequest::getXConferenceAuthorization,
                ProlongMeetingRequest::setXConferenceAuthorization));
        builder.<RestProlongDurReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestProlongDurReqBody.class),
            f -> f.withMarshaller(ProlongMeetingRequest::getBody, ProlongMeetingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RecordRequest, RecordResponse> record = genForRecord();

    private static HttpRequestDef<RecordRequest, RecordResponse> genForRecord() {
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
            f -> f.withMarshaller(RecordRequest::getConferenceID, RecordRequest::setConferenceID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RecordRequest::getXConferenceAuthorization,
                RecordRequest::setXConferenceAuthorization));
        builder.<RestSetRecordReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestSetRecordReqBody.class),
            f -> f.withMarshaller(RecordRequest::getBody, RecordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RenameParticipantRequest, RenameParticipantResponse> renameParticipant =
        genForRenameParticipant();

    private static HttpRequestDef<RenameParticipantRequest, RenameParticipantResponse> genForRenameParticipant() {
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
            f -> f.withMarshaller(RenameParticipantRequest::getConferenceID,
                RenameParticipantRequest::setConferenceID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RenameParticipantRequest::getXConferenceAuthorization,
                RenameParticipantRequest::setXConferenceAuthorization));
        builder.<RestRenamePartReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestRenamePartReqBody.class),
            f -> f.withMarshaller(RenameParticipantRequest::getBody, RenameParticipantRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetActivecodeRequest, ResetActivecodeResponse> resetActivecode =
        genForResetActivecode();

    private static HttpRequestDef<ResetActivecodeRequest, ResetActivecodeResponse> genForResetActivecode() {
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
            f -> f.withMarshaller(ResetActivecodeRequest::getSn, ResetActivecodeRequest::setSn));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetActivecodeRequest::getXRequestId, ResetActivecodeRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetActivecodeRequest::getAcceptLanguage,
                ResetActivecodeRequest::setAcceptLanguage));
        builder.<ActiveDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ActiveDTO.class),
            f -> f.withMarshaller(ResetActivecodeRequest::getBody, ResetActivecodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetAppKeyRequest, ResetAppKeyResponse> resetAppKey = genForResetAppKey();

    private static HttpRequestDef<ResetAppKeyRequest, ResetAppKeyResponse> genForResetAppKey() {
        // basic
        HttpRequestDef.Builder<ResetAppKeyRequest, ResetAppKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ResetAppKeyRequest.class, ResetAppKeyResponse.class)
                .withName("ResetAppKey")
                .withUri("/v2/usg/acs/corp/app/{app_id}/reset")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetAppKeyRequest::getAppId, ResetAppKeyRequest::setAppId));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetAppKeyRequest::getXRequestId, ResetAppKeyRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetAppKeyRequest::getAcceptLanguage, ResetAppKeyRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetPwdRequest, ResetPwdResponse> resetPwd = genForResetPwd();

    private static HttpRequestDef<ResetPwdRequest, ResetPwdResponse> genForResetPwd() {
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
            f -> f.withMarshaller(ResetPwdRequest::getXRequestID, ResetPwdRequest::setXRequestID));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetPwdRequest::getAcceptLanguage, ResetPwdRequest::setAcceptLanguage));
        builder.<ResetPwdReqDTOV1>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetPwdReqDTOV1.class),
            f -> f.withMarshaller(ResetPwdRequest::getBody, ResetPwdRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetPwdByAdminRequest, ResetPwdByAdminResponse> resetPwdByAdmin =
        genForResetPwdByAdmin();

    private static HttpRequestDef<ResetPwdByAdminRequest, ResetPwdByAdminResponse> genForResetPwdByAdmin() {
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
            f -> f.withMarshaller(ResetPwdByAdminRequest::getXRequestID, ResetPwdByAdminRequest::setXRequestID));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetPwdByAdminRequest::getAcceptLanguage,
                ResetPwdByAdminRequest::setAcceptLanguage));
        builder.<AdminResetPwdReqDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AdminResetPwdReqDTO.class),
            f -> f.withMarshaller(ResetPwdByAdminRequest::getBody, ResetPwdByAdminRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetVisionActiveCodeRequest, ResetVisionActiveCodeResponse> resetVisionActiveCode =
        genForResetVisionActiveCode();

    private static HttpRequestDef<ResetVisionActiveCodeRequest, ResetVisionActiveCodeResponse> genForResetVisionActiveCode() {
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
            f -> f.withMarshaller(ResetVisionActiveCodeRequest::getAccount, ResetVisionActiveCodeRequest::setAccount));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetVisionActiveCodeRequest::getXRequestId,
                ResetVisionActiveCodeRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetVisionActiveCodeRequest::getAcceptLanguage,
                ResetVisionActiveCodeRequest::setAcceptLanguage));
        builder.<ActiveDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ActiveDTO.class),
            f -> f.withMarshaller(ResetVisionActiveCodeRequest::getBody, ResetVisionActiveCodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResumeSimultaneousInterpretationRequest, ResumeSimultaneousInterpretationResponse> resumeSimultaneousInterpretation =
        genForResumeSimultaneousInterpretation();

    private static HttpRequestDef<ResumeSimultaneousInterpretationRequest, ResumeSimultaneousInterpretationResponse> genForResumeSimultaneousInterpretation() {
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
            f -> f.withMarshaller(ResumeSimultaneousInterpretationRequest::getConferenceID,
                ResumeSimultaneousInterpretationRequest::setConferenceID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResumeSimultaneousInterpretationRequest::getXConferenceAuthorization,
                ResumeSimultaneousInterpretationRequest::setXConferenceAuthorization));
        builder.<RestSimultaneousInterpretationBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestSimultaneousInterpretationBody.class),
            f -> f.withMarshaller(ResumeSimultaneousInterpretationRequest::getBody,
                ResumeSimultaneousInterpretationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RollcallParticipantRequest, RollcallParticipantResponse> rollcallParticipant =
        genForRollcallParticipant();

    private static HttpRequestDef<RollcallParticipantRequest, RollcallParticipantResponse> genForRollcallParticipant() {
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
            f -> f.withMarshaller(RollcallParticipantRequest::getConferenceID,
                RollcallParticipantRequest::setConferenceID));
        builder.<String>withRequestField("participantID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RollcallParticipantRequest::getParticipantID,
                RollcallParticipantRequest::setParticipantID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RollcallParticipantRequest::getXConferenceAuthorization,
                RollcallParticipantRequest::setXConferenceAuthorization));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SaveLayoutRequest, SaveLayoutResponse> saveLayout = genForSaveLayout();

    private static HttpRequestDef<SaveLayoutRequest, SaveLayoutResponse> genForSaveLayout() {
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
            f -> f.withMarshaller(SaveLayoutRequest::getConferenceID, SaveLayoutRequest::setConferenceID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveLayoutRequest::getXConferenceAuthorization,
                SaveLayoutRequest::setXConferenceAuthorization));
        builder.<RestPicLayoutBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestPicLayoutBody.class),
            f -> f.withMarshaller(SaveLayoutRequest::getBody, SaveLayoutRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchAttendanceRecordsOfHisMeetingRequest, SearchAttendanceRecordsOfHisMeetingResponse> searchAttendanceRecordsOfHisMeeting =
        genForSearchAttendanceRecordsOfHisMeeting();

    private static HttpRequestDef<SearchAttendanceRecordsOfHisMeetingRequest, SearchAttendanceRecordsOfHisMeetingResponse> genForSearchAttendanceRecordsOfHisMeeting() {
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
            f -> f.withMarshaller(SearchAttendanceRecordsOfHisMeetingRequest::getConfUUID,
                SearchAttendanceRecordsOfHisMeetingRequest::setConfUUID));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchAttendanceRecordsOfHisMeetingRequest::getOffset,
                SearchAttendanceRecordsOfHisMeetingRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchAttendanceRecordsOfHisMeetingRequest::getLimit,
                SearchAttendanceRecordsOfHisMeetingRequest::setLimit));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchAttendanceRecordsOfHisMeetingRequest::getSearchKey,
                SearchAttendanceRecordsOfHisMeetingRequest::setSearchKey));
        builder.<String>withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchAttendanceRecordsOfHisMeetingRequest::getUserUUID,
                SearchAttendanceRecordsOfHisMeetingRequest::setUserUUID));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchAttendanceRecordsOfHisMeetingRequest::getXAuthorizationType,
                SearchAttendanceRecordsOfHisMeetingRequest::setXAuthorizationType));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchAttendanceRecordsOfHisMeetingRequest::getXSiteId,
                SearchAttendanceRecordsOfHisMeetingRequest::setXSiteId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchAttendanceRecordsOfHisMeetingRequest::getAcceptLanguage,
                SearchAttendanceRecordsOfHisMeetingRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchCorpRequest, SearchCorpResponse> searchCorp = genForSearchCorp();

    private static HttpRequestDef<SearchCorpRequest, SearchCorpResponse> genForSearchCorp() {
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
            f -> f.withMarshaller(SearchCorpRequest::getOffset, SearchCorpRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCorpRequest::getLimit, SearchCorpRequest::setLimit));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpRequest::getSearchKey, SearchCorpRequest::setSearchKey));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpRequest::getXRequestId, SearchCorpRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpRequest::getAcceptLanguage, SearchCorpRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchCorpAdminsRequest, SearchCorpAdminsResponse> searchCorpAdmins =
        genForSearchCorpAdmins();

    private static HttpRequestDef<SearchCorpAdminsRequest, SearchCorpAdminsResponse> genForSearchCorpAdmins() {
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
            f -> f.withMarshaller(SearchCorpAdminsRequest::getOffset, SearchCorpAdminsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCorpAdminsRequest::getLimit, SearchCorpAdminsRequest::setLimit));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpAdminsRequest::getSearchKey, SearchCorpAdminsRequest::setSearchKey));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpAdminsRequest::getXRequestId, SearchCorpAdminsRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpAdminsRequest::getAcceptLanguage,
                SearchCorpAdminsRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchCorpDirRequest, SearchCorpDirResponse> searchCorpDir =
        genForSearchCorpDir();

    private static HttpRequestDef<SearchCorpDirRequest, SearchCorpDirResponse> genForSearchCorpDir() {
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
            f -> f.withMarshaller(SearchCorpDirRequest::getOffset, SearchCorpDirRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCorpDirRequest::getLimit, SearchCorpDirRequest::setLimit));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpDirRequest::getSearchKey, SearchCorpDirRequest::setSearchKey));
        builder.<String>withRequestField("deptCode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpDirRequest::getDeptCode, SearchCorpDirRequest::setDeptCode));
        builder.<Boolean>withRequestField("querySubDept",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(SearchCorpDirRequest::getQuerySubDept, SearchCorpDirRequest::setQuerySubDept));
        builder.<String>withRequestField("searchScope",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpDirRequest::getSearchScope, SearchCorpDirRequest::setSearchScope));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpDirRequest::getXRequestId, SearchCorpDirRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpDirRequest::getAcceptLanguage, SearchCorpDirRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchCorpExternalDirRequest, SearchCorpExternalDirResponse> searchCorpExternalDir =
        genForSearchCorpExternalDir();

    private static HttpRequestDef<SearchCorpExternalDirRequest, SearchCorpExternalDirResponse> genForSearchCorpExternalDir() {
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
            f -> f.withMarshaller(SearchCorpExternalDirRequest::getOffset, SearchCorpExternalDirRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCorpExternalDirRequest::getLimit, SearchCorpExternalDirRequest::setLimit));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpExternalDirRequest::getSearchKey,
                SearchCorpExternalDirRequest::setSearchKey));
        builder.<String>withRequestField("searchScope",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpExternalDirRequest::getSearchScope,
                SearchCorpExternalDirRequest::setSearchScope));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpExternalDirRequest::getXRequestId,
                SearchCorpExternalDirRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpExternalDirRequest::getAcceptLanguage,
                SearchCorpExternalDirRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchCorpResourcesRequest, SearchCorpResourcesResponse> searchCorpResources =
        genForSearchCorpResources();

    private static HttpRequestDef<SearchCorpResourcesRequest, SearchCorpResourcesResponse> genForSearchCorpResources() {
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
            f -> f.withMarshaller(SearchCorpResourcesRequest::getOffset, SearchCorpResourcesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCorpResourcesRequest::getLimit, SearchCorpResourcesRequest::setLimit));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpResourcesRequest::getSearchKey, SearchCorpResourcesRequest::setSearchKey));
        builder.<Long>withRequestField("startExpireDate",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchCorpResourcesRequest::getStartExpireDate,
                SearchCorpResourcesRequest::setStartExpireDate));
        builder.<Long>withRequestField("endExpireDate",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchCorpResourcesRequest::getEndExpireDate,
                SearchCorpResourcesRequest::setEndExpireDate));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpResourcesRequest::getType, SearchCorpResourcesRequest::setType));
        builder.<Integer>withRequestField("vmrMode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCorpResourcesRequest::getVmrMode, SearchCorpResourcesRequest::setVmrMode));
        builder.<String>withRequestField("typeId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpResourcesRequest::getTypeId, SearchCorpResourcesRequest::setTypeId));
        builder.<String>withRequestField("orderId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpResourcesRequest::getOrderId, SearchCorpResourcesRequest::setOrderId));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCorpResourcesRequest::getStatus, SearchCorpResourcesRequest::setStatus));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpResourcesRequest::getXRequestId,
                SearchCorpResourcesRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpResourcesRequest::getAcceptLanguage,
                SearchCorpResourcesRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchCorpVmrRequest, SearchCorpVmrResponse> searchCorpVmr =
        genForSearchCorpVmr();

    private static HttpRequestDef<SearchCorpVmrRequest, SearchCorpVmrResponse> genForSearchCorpVmr() {
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
            f -> f.withMarshaller(SearchCorpVmrRequest::getOffset, SearchCorpVmrRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCorpVmrRequest::getLimit, SearchCorpVmrRequest::setLimit));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpVmrRequest::getSearchKey, SearchCorpVmrRequest::setSearchKey));
        builder.<Integer>withRequestField("vmrMode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCorpVmrRequest::getVmrMode, SearchCorpVmrRequest::setVmrMode));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCorpVmrRequest::getStatus, SearchCorpVmrRequest::setStatus));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpVmrRequest::getXRequestId, SearchCorpVmrRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCorpVmrRequest::getAcceptLanguage, SearchCorpVmrRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchCtlRecordsOfHisMeetingRequest, SearchCtlRecordsOfHisMeetingResponse> searchCtlRecordsOfHisMeeting =
        genForSearchCtlRecordsOfHisMeeting();

    private static HttpRequestDef<SearchCtlRecordsOfHisMeetingRequest, SearchCtlRecordsOfHisMeetingResponse> genForSearchCtlRecordsOfHisMeeting() {
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
            f -> f.withMarshaller(SearchCtlRecordsOfHisMeetingRequest::getConfUUID,
                SearchCtlRecordsOfHisMeetingRequest::setConfUUID));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCtlRecordsOfHisMeetingRequest::getOffset,
                SearchCtlRecordsOfHisMeetingRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchCtlRecordsOfHisMeetingRequest::getLimit,
                SearchCtlRecordsOfHisMeetingRequest::setLimit));
        builder.<String>withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCtlRecordsOfHisMeetingRequest::getUserUUID,
                SearchCtlRecordsOfHisMeetingRequest::setUserUUID));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCtlRecordsOfHisMeetingRequest::getXAuthorizationType,
                SearchCtlRecordsOfHisMeetingRequest::setXAuthorizationType));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCtlRecordsOfHisMeetingRequest::getXSiteId,
                SearchCtlRecordsOfHisMeetingRequest::setXSiteId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchCtlRecordsOfHisMeetingRequest::getAcceptLanguage,
                SearchCtlRecordsOfHisMeetingRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchDepartmentByNameRequest, SearchDepartmentByNameResponse> searchDepartmentByName =
        genForSearchDepartmentByName();

    private static HttpRequestDef<SearchDepartmentByNameRequest, SearchDepartmentByNameResponse> genForSearchDepartmentByName() {
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
            f -> f.withMarshaller(SearchDepartmentByNameRequest::getDeptName,
                SearchDepartmentByNameRequest::setDeptName));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchDepartmentByNameRequest::getXRequestId,
                SearchDepartmentByNameRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchDepartmentByNameRequest::getAcceptLanguage,
                SearchDepartmentByNameRequest::setAcceptLanguage));

        // response
        builder.<List<QueryDeptResultDTO>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(SearchDepartmentByNameResponse::getBody, SearchDepartmentByNameResponse::setBody)
                .withInnerContainerType(QueryDeptResultDTO.class));

        return builder.build();
    }

    public static final HttpRequestDef<SearchDevicesRequest, SearchDevicesResponse> searchDevices =
        genForSearchDevices();

    private static HttpRequestDef<SearchDevicesRequest, SearchDevicesResponse> genForSearchDevices() {
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
            f -> f.withMarshaller(SearchDevicesRequest::getOffset, SearchDevicesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchDevicesRequest::getLimit, SearchDevicesRequest::setLimit));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchDevicesRequest::getSearchKey, SearchDevicesRequest::setSearchKey));
        builder.<String>withRequestField("model",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchDevicesRequest::getModel, SearchDevicesRequest::setModel));
        builder.<String>withRequestField("deptCode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchDevicesRequest::getDeptCode, SearchDevicesRequest::setDeptCode));
        builder.<Boolean>withRequestField("enableSubDept",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(SearchDevicesRequest::getEnableSubDept, SearchDevicesRequest::setEnableSubDept));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchDevicesRequest::getXRequestId, SearchDevicesRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchDevicesRequest::getAcceptLanguage, SearchDevicesRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchHisMeetingsRequest, SearchHisMeetingsResponse> searchHisMeetings =
        genForSearchHisMeetings();

    private static HttpRequestDef<SearchHisMeetingsRequest, SearchHisMeetingsResponse> genForSearchHisMeetings() {
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
            f -> f.withMarshaller(SearchHisMeetingsRequest::getUserUUID, SearchHisMeetingsRequest::setUserUUID));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchHisMeetingsRequest::getOffset, SearchHisMeetingsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchHisMeetingsRequest::getLimit, SearchHisMeetingsRequest::setLimit));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchHisMeetingsRequest::getSearchKey, SearchHisMeetingsRequest::setSearchKey));
        builder.<Boolean>withRequestField("queryAll",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(SearchHisMeetingsRequest::getQueryAll, SearchHisMeetingsRequest::setQueryAll));
        builder.<Long>withRequestField("startDate",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchHisMeetingsRequest::getStartDate, SearchHisMeetingsRequest::setStartDate));
        builder.<Long>withRequestField("endDate",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchHisMeetingsRequest::getEndDate, SearchHisMeetingsRequest::setEndDate));
        builder.<String>withRequestField("sortType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchHisMeetingsRequest::getSortType, SearchHisMeetingsRequest::setSortType));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchHisMeetingsRequest::getXAuthorizationType,
                SearchHisMeetingsRequest::setXAuthorizationType));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchHisMeetingsRequest::getXSiteId, SearchHisMeetingsRequest::setXSiteId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchMaterialsRequest, SearchMaterialsResponse> searchMaterials =
        genForSearchMaterials();

    private static HttpRequestDef<SearchMaterialsRequest, SearchMaterialsResponse> genForSearchMaterials() {
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
            f -> f.withMarshaller(SearchMaterialsRequest::getOffset, SearchMaterialsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchMaterialsRequest::getLimit, SearchMaterialsRequest::setLimit));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchMaterialsRequest::getSearchKey, SearchMaterialsRequest::setSearchKey));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchMaterialsRequest::getXRequestId, SearchMaterialsRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchMaterialsRequest::getAcceptLanguage,
                SearchMaterialsRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchMeetingFileListRequest, SearchMeetingFileListResponse> searchMeetingFileList =
        genForSearchMeetingFileList();

    private static HttpRequestDef<SearchMeetingFileListRequest, SearchMeetingFileListResponse> genForSearchMeetingFileList() {
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
            f -> f.withMarshaller(SearchMeetingFileListRequest::getOffset, SearchMeetingFileListRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchMeetingFileListRequest::getLimit, SearchMeetingFileListRequest::setLimit));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchMeetingFileListRequest::getSearchKey,
                SearchMeetingFileListRequest::setSearchKey));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchMeetingFileListRequest::getXRequestId,
                SearchMeetingFileListRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchMeetingFileListRequest::getAcceptLanguage,
                SearchMeetingFileListRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchMeetingsRequest, SearchMeetingsResponse> searchMeetings =
        genForSearchMeetings();

    private static HttpRequestDef<SearchMeetingsRequest, SearchMeetingsResponse> genForSearchMeetings() {
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
            f -> f.withMarshaller(SearchMeetingsRequest::getUserUUID, SearchMeetingsRequest::setUserUUID));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchMeetingsRequest::getOffset, SearchMeetingsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchMeetingsRequest::getLimit, SearchMeetingsRequest::setLimit));
        builder.<Boolean>withRequestField("queryAll",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(SearchMeetingsRequest::getQueryAll, SearchMeetingsRequest::setQueryAll));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchMeetingsRequest::getSearchKey, SearchMeetingsRequest::setSearchKey));
        builder.<String>withRequestField("queryConfMode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchMeetingsRequest::getQueryConfMode, SearchMeetingsRequest::setQueryConfMode));
        builder.<String>withRequestField("sortType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchMeetingsRequest::getSortType, SearchMeetingsRequest::setSortType));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchMeetingsRequest::getXAuthorizationType,
                SearchMeetingsRequest::setXAuthorizationType));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchMeetingsRequest::getXSiteId, SearchMeetingsRequest::setXSiteId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchMemberVmrRequest, SearchMemberVmrResponse> searchMemberVmr =
        genForSearchMemberVmr();

    private static HttpRequestDef<SearchMemberVmrRequest, SearchMemberVmrResponse> genForSearchMemberVmr() {
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
            f -> f.withMarshaller(SearchMemberVmrRequest::getOffset, SearchMemberVmrRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchMemberVmrRequest::getLimit, SearchMemberVmrRequest::setLimit));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchMemberVmrRequest::getSearchKey, SearchMemberVmrRequest::setSearchKey));
        builder.<Boolean>withRequestField("specialVmr",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(SearchMemberVmrRequest::getSpecialVmr, SearchMemberVmrRequest::setSpecialVmr));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchMemberVmrRequest::getXRequestId, SearchMemberVmrRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchMemberVmrRequest::getAcceptLanguage,
                SearchMemberVmrRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchOnlineMeetingsRequest, SearchOnlineMeetingsResponse> searchOnlineMeetings =
        genForSearchOnlineMeetings();

    private static HttpRequestDef<SearchOnlineMeetingsRequest, SearchOnlineMeetingsResponse> genForSearchOnlineMeetings() {
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
            f -> f.withMarshaller(SearchOnlineMeetingsRequest::getUserUUID, SearchOnlineMeetingsRequest::setUserUUID));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchOnlineMeetingsRequest::getOffset, SearchOnlineMeetingsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchOnlineMeetingsRequest::getLimit, SearchOnlineMeetingsRequest::setLimit));
        builder.<Boolean>withRequestField("queryAll",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(SearchOnlineMeetingsRequest::getQueryAll, SearchOnlineMeetingsRequest::setQueryAll));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchOnlineMeetingsRequest::getSearchKey,
                SearchOnlineMeetingsRequest::setSearchKey));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchOnlineMeetingsRequest::getXAuthorizationType,
                SearchOnlineMeetingsRequest::setXAuthorizationType));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchOnlineMeetingsRequest::getXSiteId, SearchOnlineMeetingsRequest::setXSiteId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchProgramsRequest, SearchProgramsResponse> searchPrograms =
        genForSearchPrograms();

    private static HttpRequestDef<SearchProgramsRequest, SearchProgramsResponse> genForSearchPrograms() {
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
            f -> f.withMarshaller(SearchProgramsRequest::getOffset, SearchProgramsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchProgramsRequest::getLimit, SearchProgramsRequest::setLimit));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchProgramsRequest::getSearchKey, SearchProgramsRequest::setSearchKey));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchProgramsRequest::getXRequestId, SearchProgramsRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchProgramsRequest::getAcceptLanguage, SearchProgramsRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchPublicationsRequest, SearchPublicationsResponse> searchPublications =
        genForSearchPublications();

    private static HttpRequestDef<SearchPublicationsRequest, SearchPublicationsResponse> genForSearchPublications() {
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
            f -> f.withMarshaller(SearchPublicationsRequest::getOffset, SearchPublicationsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchPublicationsRequest::getLimit, SearchPublicationsRequest::setLimit));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchPublicationsRequest::getSearchKey, SearchPublicationsRequest::setSearchKey));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchPublicationsRequest::getXRequestId, SearchPublicationsRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchPublicationsRequest::getAcceptLanguage,
                SearchPublicationsRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchRecordingsRequest, SearchRecordingsResponse> searchRecordings =
        genForSearchRecordings();

    private static HttpRequestDef<SearchRecordingsRequest, SearchRecordingsResponse> genForSearchRecordings() {
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
            f -> f.withMarshaller(SearchRecordingsRequest::getUserUUID, SearchRecordingsRequest::setUserUUID));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchRecordingsRequest::getOffset, SearchRecordingsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchRecordingsRequest::getLimit, SearchRecordingsRequest::setLimit));
        builder.<Boolean>withRequestField("queryAll",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(SearchRecordingsRequest::getQueryAll, SearchRecordingsRequest::setQueryAll));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchRecordingsRequest::getSearchKey, SearchRecordingsRequest::setSearchKey));
        builder.<Long>withRequestField("startDate",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchRecordingsRequest::getStartDate, SearchRecordingsRequest::setStartDate));
        builder.<Long>withRequestField("endDate",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchRecordingsRequest::getEndDate, SearchRecordingsRequest::setEndDate));
        builder.<String>withRequestField("sortType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchRecordingsRequest::getSortType, SearchRecordingsRequest::setSortType));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchRecordingsRequest::getXAuthorizationType,
                SearchRecordingsRequest::setXAuthorizationType));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchRecordingsRequest::getXSiteId, SearchRecordingsRequest::setXSiteId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchResourceRequest, SearchResourceResponse> searchResource =
        genForSearchResource();

    private static HttpRequestDef<SearchResourceRequest, SearchResourceResponse> genForSearchResource() {
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
            f -> f.withMarshaller(SearchResourceRequest::getCorpId, SearchResourceRequest::setCorpId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchResourceRequest::getOffset, SearchResourceRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchResourceRequest::getLimit, SearchResourceRequest::setLimit));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchResourceRequest::getSearchKey, SearchResourceRequest::setSearchKey));
        builder.<Long>withRequestField("startExpireDate",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchResourceRequest::getStartExpireDate,
                SearchResourceRequest::setStartExpireDate));
        builder.<Long>withRequestField("endExpireDate",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchResourceRequest::getEndExpireDate, SearchResourceRequest::setEndExpireDate));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchResourceRequest::getType, SearchResourceRequest::setType));
        builder.<String>withRequestField("typeId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchResourceRequest::getTypeId, SearchResourceRequest::setTypeId));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchResourceRequest::getStatus, SearchResourceRequest::setStatus));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchResourceRequest::getXRequestId, SearchResourceRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchResourceRequest::getAcceptLanguage, SearchResourceRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchResourceOpRecordRequest, SearchResourceOpRecordResponse> searchResourceOpRecord =
        genForSearchResourceOpRecord();

    private static HttpRequestDef<SearchResourceOpRecordRequest, SearchResourceOpRecordResponse> genForSearchResourceOpRecord() {
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
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getCorpId, SearchResourceOpRecordRequest::setCorpId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getOffset, SearchResourceOpRecordRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getLimit, SearchResourceOpRecordRequest::setLimit));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getSearchKey,
                SearchResourceOpRecordRequest::setSearchKey));
        builder.<Long>withRequestField("startExpireDate",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getStartExpireDate,
                SearchResourceOpRecordRequest::setStartExpireDate));
        builder.<Long>withRequestField("endExpireDate",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getEndExpireDate,
                SearchResourceOpRecordRequest::setEndExpireDate));
        builder.<Long>withRequestField("startOperateDate",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getStartOperateDate,
                SearchResourceOpRecordRequest::setStartOperateDate));
        builder.<Long>withRequestField("endOperateDate",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getEndOperateDate,
                SearchResourceOpRecordRequest::setEndOperateDate));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getType, SearchResourceOpRecordRequest::setType));
        builder.<String>withRequestField("typeId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getTypeId, SearchResourceOpRecordRequest::setTypeId));
        builder.<Integer>withRequestField("operateType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getOperateType,
                SearchResourceOpRecordRequest::setOperateType));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getXRequestId,
                SearchResourceOpRecordRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchResourceOpRecordRequest::getAcceptLanguage,
                SearchResourceOpRecordRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchUsersRequest, SearchUsersResponse> searchUsers = genForSearchUsers();

    private static HttpRequestDef<SearchUsersRequest, SearchUsersResponse> genForSearchUsers() {
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
            f -> f.withMarshaller(SearchUsersRequest::getOffset, SearchUsersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchUsersRequest::getLimit, SearchUsersRequest::setLimit));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchUsersRequest::getSearchKey, SearchUsersRequest::setSearchKey));
        builder.<String>withRequestField("sortField",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchUsersRequest::getSortField, SearchUsersRequest::setSortField));
        builder.<Boolean>withRequestField("isAsc",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(SearchUsersRequest::getIsAsc, SearchUsersRequest::setIsAsc));
        builder.<String>withRequestField("deptCode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchUsersRequest::getDeptCode, SearchUsersRequest::setDeptCode));
        builder.<Boolean>withRequestField("enableSubDept",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(SearchUsersRequest::getEnableSubDept, SearchUsersRequest::setEnableSubDept));
        builder.<SearchUsersRequest.AdminTypeEnum>withRequestField("adminType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SearchUsersRequest.AdminTypeEnum.class),
            f -> f.withMarshaller(SearchUsersRequest::getAdminType, SearchUsersRequest::setAdminType));
        builder.<Boolean>withRequestField("enableRoom",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(SearchUsersRequest::getEnableRoom, SearchUsersRequest::setEnableRoom));
        builder.<List<Integer>>withRequestField("userType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(SearchUsersRequest::getUserType, SearchUsersRequest::setUserType));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchUsersRequest::getStatus, SearchUsersRequest::setStatus));
        builder.<Boolean>withRequestField("containsUnActive",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(SearchUsersRequest::getContainsUnActive, SearchUsersRequest::setContainsUnActive));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchUsersRequest::getXRequestId, SearchUsersRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchUsersRequest::getAcceptLanguage, SearchUsersRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchVisionActiveCodeRequest, SearchVisionActiveCodeResponse> searchVisionActiveCode =
        genForSearchVisionActiveCode();

    private static HttpRequestDef<SearchVisionActiveCodeRequest, SearchVisionActiveCodeResponse> genForSearchVisionActiveCode() {
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
            f -> f.withMarshaller(SearchVisionActiveCodeRequest::getOffset, SearchVisionActiveCodeRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchVisionActiveCodeRequest::getLimit, SearchVisionActiveCodeRequest::setLimit));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchVisionActiveCodeRequest::getSearchKey,
                SearchVisionActiveCodeRequest::setSearchKey));
        builder.<String>withRequestField("devType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchVisionActiveCodeRequest::getDevType,
                SearchVisionActiveCodeRequest::setDevType));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchVisionActiveCodeRequest::getXRequestId,
                SearchVisionActiveCodeRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchVisionActiveCodeRequest::getAcceptLanguage,
                SearchVisionActiveCodeRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SendSlideVerifyCodeRequest, SendSlideVerifyCodeResponse> sendSlideVerifyCode =
        genForSendSlideVerifyCode();

    private static HttpRequestDef<SendSlideVerifyCodeRequest, SendSlideVerifyCodeResponse> genForSendSlideVerifyCode() {
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
            f -> f.withMarshaller(SendSlideVerifyCodeRequest::getXRequestID,
                SendSlideVerifyCodeRequest::setXRequestID));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SendSlideVerifyCodeRequest::getAcceptLanguage,
                SendSlideVerifyCodeRequest::setAcceptLanguage));
        builder.<SlideVerifyCodeSendDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SlideVerifyCodeSendDTO.class),
            f -> f.withMarshaller(SendSlideVerifyCodeRequest::getBody, SendSlideVerifyCodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SendVeriCodeForChangePwdRequest, SendVeriCodeForChangePwdResponse> sendVeriCodeForChangePwd =
        genForSendVeriCodeForChangePwd();

    private static HttpRequestDef<SendVeriCodeForChangePwdRequest, SendVeriCodeForChangePwdResponse> genForSendVeriCodeForChangePwd() {
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
            f -> f.withMarshaller(SendVeriCodeForChangePwdRequest::getXRequestID,
                SendVeriCodeForChangePwdRequest::setXRequestID));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SendVeriCodeForChangePwdRequest::getAcceptLanguage,
                SendVeriCodeForChangePwdRequest::setAcceptLanguage));
        builder.<VerifyCodeSendDTOV1>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VerifyCodeSendDTOV1.class),
            f -> f.withMarshaller(SendVeriCodeForChangePwdRequest::getBody, SendVeriCodeForChangePwdRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SendVeriCodeForUpdateUserInfoRequest, SendVeriCodeForUpdateUserInfoResponse> sendVeriCodeForUpdateUserInfo =
        genForSendVeriCodeForUpdateUserInfo();

    private static HttpRequestDef<SendVeriCodeForUpdateUserInfoRequest, SendVeriCodeForUpdateUserInfoResponse> genForSendVeriCodeForUpdateUserInfo() {
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
            f -> f.withMarshaller(SendVeriCodeForUpdateUserInfoRequest::getXRequestId,
                SendVeriCodeForUpdateUserInfoRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SendVeriCodeForUpdateUserInfoRequest::getAcceptLanguage,
                SendVeriCodeForUpdateUserInfoRequest::setAcceptLanguage));
        builder.<VerificationCodeDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VerificationCodeDTO.class),
            f -> f.withMarshaller(SendVeriCodeForUpdateUserInfoRequest::getBody,
                SendVeriCodeForUpdateUserInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetAttendeeLanChannelRequest, SetAttendeeLanChannelResponse> setAttendeeLanChannel =
        genForSetAttendeeLanChannel();

    private static HttpRequestDef<SetAttendeeLanChannelRequest, SetAttendeeLanChannelResponse> genForSetAttendeeLanChannel() {
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
            f -> f.withMarshaller(SetAttendeeLanChannelRequest::getConferenceID,
                SetAttendeeLanChannelRequest::setConferenceID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetAttendeeLanChannelRequest::getXConferenceAuthorization,
                SetAttendeeLanChannelRequest::setXConferenceAuthorization));
        builder.<RestSetAttendeeLanChannelBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestSetAttendeeLanChannelBody.class),
            f -> f.withMarshaller(SetAttendeeLanChannelRequest::getBody, SetAttendeeLanChannelRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetCohostRequest, SetCohostResponse> setCohost = genForSetCohost();

    private static HttpRequestDef<SetCohostRequest, SetCohostResponse> genForSetCohost() {
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
            f -> f.withMarshaller(SetCohostRequest::getConferenceID, SetCohostRequest::setConferenceID));
        builder.<String>withRequestField("participantID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetCohostRequest::getParticipantID, SetCohostRequest::setParticipantID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetCohostRequest::getXConferenceAuthorization,
                SetCohostRequest::setXConferenceAuthorization));
        builder.<RestSetCohostBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestSetCohostBody.class),
            f -> f.withMarshaller(SetCohostRequest::getBody, SetCohostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetCustomMultiPictureRequest, SetCustomMultiPictureResponse> setCustomMultiPicture =
        genForSetCustomMultiPicture();

    private static HttpRequestDef<SetCustomMultiPictureRequest, SetCustomMultiPictureResponse> genForSetCustomMultiPicture() {
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
            f -> f.withMarshaller(SetCustomMultiPictureRequest::getConferenceID,
                SetCustomMultiPictureRequest::setConferenceID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetCustomMultiPictureRequest::getXConferenceAuthorization,
                SetCustomMultiPictureRequest::setXConferenceAuthorization));
        builder.<RestCustomMultiPictureBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RestCustomMultiPictureBody.class),
            f -> f.withMarshaller(SetCustomMultiPictureRequest::getBody, SetCustomMultiPictureRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetHostViewRequest, SetHostViewResponse> setHostView = genForSetHostView();

    private static HttpRequestDef<SetHostViewRequest, SetHostViewResponse> genForSetHostView() {
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
            f -> f.withMarshaller(SetHostViewRequest::getConferenceID, SetHostViewRequest::setConferenceID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetHostViewRequest::getXConferenceAuthorization,
                SetHostViewRequest::setXConferenceAuthorization));
        builder.<RestChairViewReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestChairViewReqBody.class),
            f -> f.withMarshaller(SetHostViewRequest::getBody, SetHostViewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetInterpreterGroupRequest, SetInterpreterGroupResponse> setInterpreterGroup =
        genForSetInterpreterGroup();

    private static HttpRequestDef<SetInterpreterGroupRequest, SetInterpreterGroupResponse> genForSetInterpreterGroup() {
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
            f -> f.withMarshaller(SetInterpreterGroupRequest::getConferenceID,
                SetInterpreterGroupRequest::setConferenceID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetInterpreterGroupRequest::getXConferenceAuthorization,
                SetInterpreterGroupRequest::setXConferenceAuthorization));
        builder.<RestSetInterpreterGroupBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestSetInterpreterGroupBody.class),
            f -> f.withMarshaller(SetInterpreterGroupRequest::getBody, SetInterpreterGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetMultiPictureRequest, SetMultiPictureResponse> setMultiPicture =
        genForSetMultiPicture();

    private static HttpRequestDef<SetMultiPictureRequest, SetMultiPictureResponse> genForSetMultiPicture() {
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
            f -> f.withMarshaller(SetMultiPictureRequest::getConferenceID, SetMultiPictureRequest::setConferenceID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetMultiPictureRequest::getXConferenceAuthorization,
                SetMultiPictureRequest::setXConferenceAuthorization));
        builder.<RestMixedPictureBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestMixedPictureBody.class),
            f -> f.withMarshaller(SetMultiPictureRequest::getBody, SetMultiPictureRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetParticipantViewRequest, SetParticipantViewResponse> setParticipantView =
        genForSetParticipantView();

    private static HttpRequestDef<SetParticipantViewRequest, SetParticipantViewResponse> genForSetParticipantView() {
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
            f -> f.withMarshaller(SetParticipantViewRequest::getConferenceID,
                SetParticipantViewRequest::setConferenceID));
        builder.<String>withRequestField("participantID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetParticipantViewRequest::getParticipantID,
                SetParticipantViewRequest::setParticipantID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetParticipantViewRequest::getXConferenceAuthorization,
                SetParticipantViewRequest::setXConferenceAuthorization));
        builder.<RestParticipantViewReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestParticipantViewReqBody.class),
            f -> f.withMarshaller(SetParticipantViewRequest::getBody, SetParticipantViewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetProfileImageRequest, SetProfileImageResponse> setProfileImage =
        genForSetProfileImage();

    private static HttpRequestDef<SetProfileImageRequest, SetProfileImageResponse> genForSetProfileImage() {
        // basic
        HttpRequestDef.Builder<SetProfileImageRequest, SetProfileImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SetProfileImageRequest.class, SetProfileImageResponse.class)
                .withName("SetProfileImage")
                .withUri("/v1/usg/abs/profile-images")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetProfileImageRequest::getXRequestId, SetProfileImageRequest::setXRequestId));
        builder.<SetProfileImageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetProfileImageRequestBody.class),
            f -> f.withMarshaller(SetProfileImageRequest::getBody, SetProfileImageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetRoleRequest, SetRoleResponse> setRole = genForSetRole();

    private static HttpRequestDef<SetRoleRequest, SetRoleResponse> genForSetRole() {
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
            f -> f.withMarshaller(SetRoleRequest::getConferenceID, SetRoleRequest::setConferenceID));
        builder.<String>withRequestField("participantID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetRoleRequest::getParticipantID, SetRoleRequest::setParticipantID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetRoleRequest::getXConferenceAuthorization,
                SetRoleRequest::setXConferenceAuthorization));
        builder.<RestChairTokenReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestChairTokenReqBody.class),
            f -> f.withMarshaller(SetRoleRequest::getBody, SetRoleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetSsoConfigRequest, SetSsoConfigResponse> setSsoConfig = genForSetSsoConfig();

    private static HttpRequestDef<SetSsoConfigRequest, SetSsoConfigResponse> genForSetSsoConfig() {
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
            f -> f.withMarshaller(SetSsoConfigRequest::getXRequestId, SetSsoConfigRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetSsoConfigRequest::getAcceptLanguage, SetSsoConfigRequest::setAcceptLanguage));
        builder.<AuthorizeConfigInfoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AuthorizeConfigInfoRequestBody.class),
            f -> f.withMarshaller(SetSsoConfigRequest::getBody, SetSsoConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetUserProfileImageRequest, SetUserProfileImageResponse> setUserProfileImage =
        genForSetUserProfileImage();

    private static HttpRequestDef<SetUserProfileImageRequest, SetUserProfileImageResponse> genForSetUserProfileImage() {
        // basic
        HttpRequestDef.Builder<SetUserProfileImageRequest, SetUserProfileImageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SetUserProfileImageRequest.class, SetUserProfileImageResponse.class)
                .withName("SetUserProfileImage")
                .withUri("/v1/usg/abs/profile-images/{user_id}")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetUserProfileImageRequest::getUserId, SetUserProfileImageRequest::setUserId));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetUserProfileImageRequest::getXRequestId,
                SetUserProfileImageRequest::setXRequestId));
        builder.<SetUserProfileImageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetUserProfileImageRequestBody.class),
            f -> f.withMarshaller(SetUserProfileImageRequest::getBody, SetUserProfileImageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetWebHookConfigRequest, SetWebHookConfigResponse> setWebHookConfig =
        genForSetWebHookConfig();

    private static HttpRequestDef<SetWebHookConfigRequest, SetWebHookConfigResponse> genForSetWebHookConfig() {
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
            f -> f.withMarshaller(SetWebHookConfigRequest::getBody, SetWebHookConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConfOrgRequest, ShowConfOrgResponse> showConfOrg = genForShowConfOrg();

    private static HttpRequestDef<ShowConfOrgRequest, ShowConfOrgResponse> genForShowConfOrg() {
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
            f -> f.withMarshaller(ShowConfOrgRequest::getConferenceID, ShowConfOrgRequest::setConferenceID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCorpRequest, ShowCorpResponse> showCorp = genForShowCorp();

    private static HttpRequestDef<ShowCorpRequest, ShowCorpResponse> genForShowCorp() {
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
            f -> f.withMarshaller(ShowCorpRequest::getId, ShowCorpRequest::setId));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCorpRequest::getXRequestId, ShowCorpRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCorpRequest::getAcceptLanguage, ShowCorpRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCorpAdminRequest, ShowCorpAdminResponse> showCorpAdmin =
        genForShowCorpAdmin();

    private static HttpRequestDef<ShowCorpAdminRequest, ShowCorpAdminResponse> genForShowCorpAdmin() {
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
            f -> f.withMarshaller(ShowCorpAdminRequest::getAccount, ShowCorpAdminRequest::setAccount));
        builder.<Integer>withRequestField("accountType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCorpAdminRequest::getAccountType, ShowCorpAdminRequest::setAccountType));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCorpAdminRequest::getXRequestId, ShowCorpAdminRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCorpAdminRequest::getAcceptLanguage, ShowCorpAdminRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCorpBasicInfoRequest, ShowCorpBasicInfoResponse> showCorpBasicInfo =
        genForShowCorpBasicInfo();

    private static HttpRequestDef<ShowCorpBasicInfoRequest, ShowCorpBasicInfoResponse> genForShowCorpBasicInfo() {
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
            f -> f.withMarshaller(ShowCorpBasicInfoRequest::getXRequestId, ShowCorpBasicInfoRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCorpBasicInfoRequest::getAcceptLanguage,
                ShowCorpBasicInfoRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCorpResourceRequest, ShowCorpResourceResponse> showCorpResource =
        genForShowCorpResource();

    private static HttpRequestDef<ShowCorpResourceRequest, ShowCorpResourceResponse> genForShowCorpResource() {
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
            f -> f.withMarshaller(ShowCorpResourceRequest::getXRequestId, ShowCorpResourceRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCorpResourceRequest::getAcceptLanguage,
                ShowCorpResourceRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDepartmentRequest, ShowDepartmentResponse> showDepartment =
        genForShowDepartment();

    private static HttpRequestDef<ShowDepartmentRequest, ShowDepartmentResponse> genForShowDepartment() {
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
            f -> f.withMarshaller(ShowDepartmentRequest::getDeptCode, ShowDepartmentRequest::setDeptCode));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDepartmentRequest::getXRequestId, ShowDepartmentRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDepartmentRequest::getAcceptLanguage, ShowDepartmentRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeptAndChildDeptRequest, ShowDeptAndChildDeptResponse> showDeptAndChildDept =
        genForShowDeptAndChildDept();

    private static HttpRequestDef<ShowDeptAndChildDeptRequest, ShowDeptAndChildDeptResponse> genForShowDeptAndChildDept() {
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
            f -> f.withMarshaller(ShowDeptAndChildDeptRequest::getDeptCode, ShowDeptAndChildDeptRequest::setDeptCode));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeptAndChildDeptRequest::getXRequestId,
                ShowDeptAndChildDeptRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeptAndChildDeptRequest::getAcceptLanguage,
                ShowDeptAndChildDeptRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeviceDetailRequest, ShowDeviceDetailResponse> showDeviceDetail =
        genForShowDeviceDetail();

    private static HttpRequestDef<ShowDeviceDetailRequest, ShowDeviceDetailResponse> genForShowDeviceDetail() {
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
            f -> f.withMarshaller(ShowDeviceDetailRequest::getSn, ShowDeviceDetailRequest::setSn));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceDetailRequest::getXRequestId, ShowDeviceDetailRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceDetailRequest::getAcceptLanguage,
                ShowDeviceDetailRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeviceStatusRequest, ShowDeviceStatusResponse> showDeviceStatus =
        genForShowDeviceStatus();

    private static HttpRequestDef<ShowDeviceStatusRequest, ShowDeviceStatusResponse> genForShowDeviceStatus() {
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
            f -> f.withMarshaller(ShowDeviceStatusRequest::getXRequestID, ShowDeviceStatusRequest::setXRequestID));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceStatusRequest::getAcceptLanguage,
                ShowDeviceStatusRequest::setAcceptLanguage));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowDeviceStatusRequest::getBody, ShowDeviceStatusRequest::setBody)
                .withInnerContainerType(String.class));

        // response
        builder.<List<UserStatusDTO>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowDeviceStatusResponse::getBody, ShowDeviceStatusResponse::setBody)
                .withInnerContainerType(UserStatusDTO.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeviceTypesRequest, ShowDeviceTypesResponse> showDeviceTypes =
        genForShowDeviceTypes();

    private static HttpRequestDef<ShowDeviceTypesRequest, ShowDeviceTypesResponse> genForShowDeviceTypes() {
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
            f -> f.withMarshaller(ShowDeviceTypesRequest::getXRequestId, ShowDeviceTypesRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceTypesRequest::getAcceptLanguage,
                ShowDeviceTypesRequest::setAcceptLanguage));

        // response
        builder.<List<QueryDeviceTypeResultDTO>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowDeviceTypesResponse::getBody, ShowDeviceTypesResponse::setBody)
                .withInnerContainerType(QueryDeviceTypeResultDTO.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowHisMeetingDetailRequest, ShowHisMeetingDetailResponse> showHisMeetingDetail =
        genForShowHisMeetingDetail();

    private static HttpRequestDef<ShowHisMeetingDetailRequest, ShowHisMeetingDetailResponse> genForShowHisMeetingDetail() {
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
            f -> f.withMarshaller(ShowHisMeetingDetailRequest::getConfUUID, ShowHisMeetingDetailRequest::setConfUUID));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHisMeetingDetailRequest::getOffset, ShowHisMeetingDetailRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHisMeetingDetailRequest::getLimit, ShowHisMeetingDetailRequest::setLimit));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHisMeetingDetailRequest::getSearchKey,
                ShowHisMeetingDetailRequest::setSearchKey));
        builder.<String>withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHisMeetingDetailRequest::getUserUUID, ShowHisMeetingDetailRequest::setUserUUID));
        builder.<Integer>withRequestField("X-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHisMeetingDetailRequest::getXType, ShowHisMeetingDetailRequest::setXType));
        builder.<Integer>withRequestField("X-Query-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHisMeetingDetailRequest::getXQueryType,
                ShowHisMeetingDetailRequest::setXQueryType));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHisMeetingDetailRequest::getXAuthorizationType,
                ShowHisMeetingDetailRequest::setXAuthorizationType));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHisMeetingDetailRequest::getXSiteId, ShowHisMeetingDetailRequest::setXSiteId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLayoutRequest, ShowLayoutResponse> showLayout = genForShowLayout();

    private static HttpRequestDef<ShowLayoutRequest, ShowLayoutResponse> genForShowLayout() {
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
            f -> f.withMarshaller(ShowLayoutRequest::getConferenceID, ShowLayoutRequest::setConferenceID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLayoutRequest::getXConferenceAuthorization,
                ShowLayoutRequest::setXConferenceAuthorization));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMeetingDetailRequest, ShowMeetingDetailResponse> showMeetingDetail =
        genForShowMeetingDetail();

    private static HttpRequestDef<ShowMeetingDetailRequest, ShowMeetingDetailResponse> genForShowMeetingDetail() {
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
            f -> f.withMarshaller(ShowMeetingDetailRequest::getConferenceID,
                ShowMeetingDetailRequest::setConferenceID));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMeetingDetailRequest::getOffset, ShowMeetingDetailRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMeetingDetailRequest::getLimit, ShowMeetingDetailRequest::setLimit));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMeetingDetailRequest::getSearchKey, ShowMeetingDetailRequest::setSearchKey));
        builder.<String>withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMeetingDetailRequest::getUserUUID, ShowMeetingDetailRequest::setUserUUID));
        builder.<String>withRequestField("X-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMeetingDetailRequest::getXType, ShowMeetingDetailRequest::setXType));
        builder.<String>withRequestField("X-Query-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMeetingDetailRequest::getXQueryType, ShowMeetingDetailRequest::setXQueryType));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMeetingDetailRequest::getXAuthorizationType,
                ShowMeetingDetailRequest::setXAuthorizationType));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMeetingDetailRequest::getXSiteId, ShowMeetingDetailRequest::setXSiteId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMeetingFileRequest, ShowMeetingFileResponse> showMeetingFile =
        genForShowMeetingFile();

    private static HttpRequestDef<ShowMeetingFileRequest, ShowMeetingFileResponse> genForShowMeetingFile() {
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
            f -> f.withMarshaller(ShowMeetingFileRequest::getFileCode, ShowMeetingFileRequest::setFileCode));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMeetingFileRequest::getXRequestId, ShowMeetingFileRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMeetingFileRequest::getAcceptLanguage,
                ShowMeetingFileRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMeetingFileListRequest, ShowMeetingFileListResponse> showMeetingFileList =
        genForShowMeetingFileList();

    private static HttpRequestDef<ShowMeetingFileListRequest, ShowMeetingFileListResponse> genForShowMeetingFileList() {
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
            f -> f.withMarshaller(ShowMeetingFileListRequest::getXRequestId,
                ShowMeetingFileListRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMeetingFileListRequest::getAcceptLanguage,
                ShowMeetingFileListRequest::setAcceptLanguage));
        builder.<Map<String, String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f.withMarshaller(ShowMeetingFileListRequest::getBody, ShowMeetingFileListRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMyInfoRequest, ShowMyInfoResponse> showMyInfo = genForShowMyInfo();

    private static HttpRequestDef<ShowMyInfoRequest, ShowMyInfoResponse> genForShowMyInfo() {
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
            f -> f.withMarshaller(ShowMyInfoRequest::getXRequestId, ShowMyInfoRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMyInfoRequest::getAcceptLanguage, ShowMyInfoRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOnlineMeetingDetailRequest, ShowOnlineMeetingDetailResponse> showOnlineMeetingDetail =
        genForShowOnlineMeetingDetail();

    private static HttpRequestDef<ShowOnlineMeetingDetailRequest, ShowOnlineMeetingDetailResponse> genForShowOnlineMeetingDetail() {
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
            f -> f.withMarshaller(ShowOnlineMeetingDetailRequest::getConferenceID,
                ShowOnlineMeetingDetailRequest::setConferenceID));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowOnlineMeetingDetailRequest::getOffset,
                ShowOnlineMeetingDetailRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowOnlineMeetingDetailRequest::getLimit, ShowOnlineMeetingDetailRequest::setLimit));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOnlineMeetingDetailRequest::getSearchKey,
                ShowOnlineMeetingDetailRequest::setSearchKey));
        builder.<String>withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOnlineMeetingDetailRequest::getUserUUID,
                ShowOnlineMeetingDetailRequest::setUserUUID));
        builder.<String>withRequestField("X-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOnlineMeetingDetailRequest::getXType, ShowOnlineMeetingDetailRequest::setXType));
        builder.<String>withRequestField("X-Query-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOnlineMeetingDetailRequest::getXQueryType,
                ShowOnlineMeetingDetailRequest::setXQueryType));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOnlineMeetingDetailRequest::getXAuthorizationType,
                ShowOnlineMeetingDetailRequest::setXAuthorizationType));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOnlineMeetingDetailRequest::getXSiteId,
                ShowOnlineMeetingDetailRequest::setXSiteId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOrgResRequest, ShowOrgResResponse> showOrgRes = genForShowOrgRes();

    private static HttpRequestDef<ShowOrgResRequest, ShowOrgResResponse> genForShowOrgRes() {
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

    public static final HttpRequestDef<ShowProgramRequest, ShowProgramResponse> showProgram = genForShowProgram();

    private static HttpRequestDef<ShowProgramRequest, ShowProgramResponse> genForShowProgram() {
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
            f -> f.withMarshaller(ShowProgramRequest::getId, ShowProgramRequest::setId));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProgramRequest::getXRequestId, ShowProgramRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProgramRequest::getAcceptLanguage, ShowProgramRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPublicationRequest, ShowPublicationResponse> showPublication =
        genForShowPublication();

    private static HttpRequestDef<ShowPublicationRequest, ShowPublicationResponse> genForShowPublication() {
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
            f -> f.withMarshaller(ShowPublicationRequest::getId, ShowPublicationRequest::setId));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPublicationRequest::getXRequestId, ShowPublicationRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPublicationRequest::getAcceptLanguage,
                ShowPublicationRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRealTimeInfoOfMeetingRequest, ShowRealTimeInfoOfMeetingResponse> showRealTimeInfoOfMeeting =
        genForShowRealTimeInfoOfMeeting();

    private static HttpRequestDef<ShowRealTimeInfoOfMeetingRequest, ShowRealTimeInfoOfMeetingResponse> genForShowRealTimeInfoOfMeeting() {
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
            f -> f.withMarshaller(ShowRealTimeInfoOfMeetingRequest::getConferenceID,
                ShowRealTimeInfoOfMeetingRequest::setConferenceID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRealTimeInfoOfMeetingRequest::getXConferenceAuthorization,
                ShowRealTimeInfoOfMeetingRequest::setXConferenceAuthorization));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRecordingDetailRequest, ShowRecordingDetailResponse> showRecordingDetail =
        genForShowRecordingDetail();

    private static HttpRequestDef<ShowRecordingDetailRequest, ShowRecordingDetailResponse> genForShowRecordingDetail() {
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
            f -> f.withMarshaller(ShowRecordingDetailRequest::getConfUUID, ShowRecordingDetailRequest::setConfUUID));
        builder.<String>withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordingDetailRequest::getUserUUID, ShowRecordingDetailRequest::setUserUUID));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordingDetailRequest::getXAuthorizationType,
                ShowRecordingDetailRequest::setXAuthorizationType));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordingDetailRequest::getXSiteId, ShowRecordingDetailRequest::setXSiteId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRecordingFileDownloadUrlsRequest, ShowRecordingFileDownloadUrlsResponse> showRecordingFileDownloadUrls =
        genForShowRecordingFileDownloadUrls();

    private static HttpRequestDef<ShowRecordingFileDownloadUrlsRequest, ShowRecordingFileDownloadUrlsResponse> genForShowRecordingFileDownloadUrls() {
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
            f -> f.withMarshaller(ShowRecordingFileDownloadUrlsRequest::getConfUUID,
                ShowRecordingFileDownloadUrlsRequest::setConfUUID));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRecordingFileDownloadUrlsRequest::getOffset,
                ShowRecordingFileDownloadUrlsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRecordingFileDownloadUrlsRequest::getLimit,
                ShowRecordingFileDownloadUrlsRequest::setLimit));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordingFileDownloadUrlsRequest::getXAuthorizationType,
                ShowRecordingFileDownloadUrlsRequest::setXAuthorizationType));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordingFileDownloadUrlsRequest::getXSiteId,
                ShowRecordingFileDownloadUrlsRequest::setXSiteId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRegionInfoOfMeetingRequest, ShowRegionInfoOfMeetingResponse> showRegionInfoOfMeeting =
        genForShowRegionInfoOfMeeting();

    private static HttpRequestDef<ShowRegionInfoOfMeetingRequest, ShowRegionInfoOfMeetingResponse> genForShowRegionInfoOfMeeting() {
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
            f -> f.withMarshaller(ShowRegionInfoOfMeetingRequest::getConferenceID,
                ShowRegionInfoOfMeetingRequest::setConferenceID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRoomSettingRequest, ShowRoomSettingResponse> showRoomSetting =
        genForShowRoomSetting();

    private static HttpRequestDef<ShowRoomSettingRequest, ShowRoomSettingResponse> genForShowRoomSetting() {
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
            f -> f.withMarshaller(ShowRoomSettingRequest::getConferenceId, ShowRoomSettingRequest::setConferenceId));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRoomSettingRequest::getXRequestId, ShowRoomSettingRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRoomSettingRequest::getAcceptLanguage,
                ShowRoomSettingRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSpResRequest, ShowSpResResponse> showSpRes = genForShowSpRes();

    private static HttpRequestDef<ShowSpResRequest, ShowSpResResponse> genForShowSpRes() {
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
        genForShowSpResource();

    private static HttpRequestDef<ShowSpResourceRequest, ShowSpResourceResponse> genForShowSpResource() {
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
            f -> f.withMarshaller(ShowSpResourceRequest::getQueryGroup, ShowSpResourceRequest::setQueryGroup));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSpResourceRequest::getXRequestId, ShowSpResourceRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSpResourceRequest::getAcceptLanguage, ShowSpResourceRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSsoConfigRequest, ShowSsoConfigResponse> showSsoConfig =
        genForShowSsoConfig();

    private static HttpRequestDef<ShowSsoConfigRequest, ShowSsoConfigResponse> genForShowSsoConfig() {
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
            f -> f.withMarshaller(ShowSsoConfigRequest::getXRequestId, ShowSsoConfigRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSsoConfigRequest::getAcceptLanguage, ShowSsoConfigRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserDetailRequest, ShowUserDetailResponse> showUserDetail =
        genForShowUserDetail();

    private static HttpRequestDef<ShowUserDetailRequest, ShowUserDetailResponse> genForShowUserDetail() {
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
            f -> f.withMarshaller(ShowUserDetailRequest::getAccount, ShowUserDetailRequest::setAccount));
        builder.<Integer>withRequestField("accountType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowUserDetailRequest::getAccountType, ShowUserDetailRequest::setAccountType));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUserDetailRequest::getXRequestId, ShowUserDetailRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUserDetailRequest::getAcceptLanguage, ShowUserDetailRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWebHookConfigRequest, ShowWebHookConfigResponse> showWebHookConfig =
        genForShowWebHookConfig();

    private static HttpRequestDef<ShowWebHookConfigRequest, ShowWebHookConfigResponse> genForShowWebHookConfig() {
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
            f -> f.withMarshaller(ShowWebHookConfigRequest::getCorpId, ShowWebHookConfigRequest::setCorpId));
        builder.<String>withRequestField("spId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWebHookConfigRequest::getSpId, ShowWebHookConfigRequest::setSpId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWebinarRequest, ShowWebinarResponse> showWebinar = genForShowWebinar();

    private static HttpRequestDef<ShowWebinarRequest, ShowWebinarResponse> genForShowWebinar() {
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
            f -> f.withMarshaller(ShowWebinarRequest::getConferenceId, ShowWebinarRequest::setConferenceId));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWebinarRequest::getXRequestId, ShowWebinarRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWebinarRequest::getAcceptLanguage, ShowWebinarRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartMeetingRequest, StartMeetingResponse> startMeeting = genForStartMeeting();

    private static HttpRequestDef<StartMeetingRequest, StartMeetingResponse> genForStartMeeting() {
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
            f -> f.withMarshaller(StartMeetingRequest::getBody, StartMeetingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopMeetingRequest, StopMeetingResponse> stopMeeting = genForStopMeeting();

    private static HttpRequestDef<StopMeetingRequest, StopMeetingResponse> genForStopMeeting() {
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
            f -> f.withMarshaller(StopMeetingRequest::getConferenceID, StopMeetingRequest::setConferenceID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopMeetingRequest::getXConferenceAuthorization,
                StopMeetingRequest::setXConferenceAuthorization));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchModeRequest, SwitchModeResponse> switchMode = genForSwitchMode();

    private static HttpRequestDef<SwitchModeRequest, SwitchModeResponse> genForSwitchMode() {
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
            f -> f.withMarshaller(SwitchModeRequest::getConferenceID, SwitchModeRequest::setConferenceID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchModeRequest::getXConferenceAuthorization,
                SwitchModeRequest::setXConferenceAuthorization));
        builder.<RestSwitchModeReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestSwitchModeReqBody.class),
            f -> f.withMarshaller(SwitchModeRequest::getBody, SwitchModeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAppIdRequest, UpdateAppIdResponse> updateAppId = genForUpdateAppId();

    private static HttpRequestDef<UpdateAppIdRequest, UpdateAppIdResponse> genForUpdateAppId() {
        // basic
        HttpRequestDef.Builder<UpdateAppIdRequest, UpdateAppIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAppIdRequest.class, UpdateAppIdResponse.class)
                .withName("UpdateAppId")
                .withUri("/v2/usg/acs/corp/app/{app_id}")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppIdRequest::getAppId, UpdateAppIdRequest::setAppId));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppIdRequest::getXRequestId, UpdateAppIdRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppIdRequest::getAcceptLanguage, UpdateAppIdRequest::setAcceptLanguage));
        builder.<UpdateAppIdRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAppIdRequestBody.class),
            f -> f.withMarshaller(UpdateAppIdRequest::getBody, UpdateAppIdRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateContactRequest, UpdateContactResponse> updateContact =
        genForUpdateContact();

    private static HttpRequestDef<UpdateContactRequest, UpdateContactResponse> genForUpdateContact() {
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
            f -> f.withMarshaller(UpdateContactRequest::getXRequestId, UpdateContactRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateContactRequest::getAcceptLanguage, UpdateContactRequest::setAcceptLanguage));
        builder.<VerificationCodeDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VerificationCodeDTO.class),
            f -> f.withMarshaller(UpdateContactRequest::getBody, UpdateContactRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCorpRequest, UpdateCorpResponse> updateCorp = genForUpdateCorp();

    private static HttpRequestDef<UpdateCorpRequest, UpdateCorpResponse> genForUpdateCorp() {
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
            f -> f.withMarshaller(UpdateCorpRequest::getId, UpdateCorpRequest::setId));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCorpRequest::getXRequestId, UpdateCorpRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCorpRequest::getAcceptLanguage, UpdateCorpRequest::setAcceptLanguage));
        builder.<ModCorpDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModCorpDTO.class),
            f -> f.withMarshaller(UpdateCorpRequest::getBody, UpdateCorpRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCorpBasicInfoRequest, UpdateCorpBasicInfoResponse> updateCorpBasicInfo =
        genForUpdateCorpBasicInfo();

    private static HttpRequestDef<UpdateCorpBasicInfoRequest, UpdateCorpBasicInfoResponse> genForUpdateCorpBasicInfo() {
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
            f -> f.withMarshaller(UpdateCorpBasicInfoRequest::getXRequestId,
                UpdateCorpBasicInfoRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCorpBasicInfoRequest::getAcceptLanguage,
                UpdateCorpBasicInfoRequest::setAcceptLanguage));
        builder.<ModCorpBasicInfoDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModCorpBasicInfoDTO.class),
            f -> f.withMarshaller(UpdateCorpBasicInfoRequest::getBody, UpdateCorpBasicInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDepartmentRequest, UpdateDepartmentResponse> updateDepartment =
        genForUpdateDepartment();

    private static HttpRequestDef<UpdateDepartmentRequest, UpdateDepartmentResponse> genForUpdateDepartment() {
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
            f -> f.withMarshaller(UpdateDepartmentRequest::getDeptCode, UpdateDepartmentRequest::setDeptCode));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDepartmentRequest::getXRequestId, UpdateDepartmentRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDepartmentRequest::getAcceptLanguage,
                UpdateDepartmentRequest::setAcceptLanguage));
        builder.<ModDeptDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModDeptDTO.class),
            f -> f.withMarshaller(UpdateDepartmentRequest::getBody, UpdateDepartmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDeviceRequest, UpdateDeviceResponse> updateDevice = genForUpdateDevice();

    private static HttpRequestDef<UpdateDeviceRequest, UpdateDeviceResponse> genForUpdateDevice() {
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
            f -> f.withMarshaller(UpdateDeviceRequest::getSn, UpdateDeviceRequest::setSn));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeviceRequest::getXRequestId, UpdateDeviceRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeviceRequest::getAcceptLanguage, UpdateDeviceRequest::setAcceptLanguage));
        builder.<ModDeviceDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModDeviceDTO.class),
            f -> f.withMarshaller(UpdateDeviceRequest::getBody, UpdateDeviceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMaterialRequest, UpdateMaterialResponse> updateMaterial =
        genForUpdateMaterial();

    private static HttpRequestDef<UpdateMaterialRequest, UpdateMaterialResponse> genForUpdateMaterial() {
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
            f -> f.withMarshaller(UpdateMaterialRequest::getId, UpdateMaterialRequest::setId));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMaterialRequest::getXRequestId, UpdateMaterialRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMaterialRequest::getAcceptLanguage, UpdateMaterialRequest::setAcceptLanguage));
        builder.<UpdateMaterialRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateMaterialRequestDTO.class),
            f -> f.withMarshaller(UpdateMaterialRequest::getBody, UpdateMaterialRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMeetingRequest, UpdateMeetingResponse> updateMeeting =
        genForUpdateMeeting();

    private static HttpRequestDef<UpdateMeetingRequest, UpdateMeetingResponse> genForUpdateMeeting() {
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
            f -> f.withMarshaller(UpdateMeetingRequest::getConferenceID, UpdateMeetingRequest::setConferenceID));
        builder.<String>withRequestField("userUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMeetingRequest::getUserUUID, UpdateMeetingRequest::setUserUUID));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMeetingRequest::getXAuthorizationType,
                UpdateMeetingRequest::setXAuthorizationType));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMeetingRequest::getXSiteId, UpdateMeetingRequest::setXSiteId));
        builder.<RestScheduleConfDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestScheduleConfDTO.class),
            f -> f.withMarshaller(UpdateMeetingRequest::getBody, UpdateMeetingRequest::setBody));

        // response
        builder.<List<ConferenceInfo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(UpdateMeetingResponse::getBody, UpdateMeetingResponse::setBody)
                .withInnerContainerType(ConferenceInfo.class));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMemberVmrRequest, UpdateMemberVmrResponse> updateMemberVmr =
        genForUpdateMemberVmr();

    private static HttpRequestDef<UpdateMemberVmrRequest, UpdateMemberVmrResponse> genForUpdateMemberVmr() {
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
            f -> f.withMarshaller(UpdateMemberVmrRequest::getId, UpdateMemberVmrRequest::setId));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMemberVmrRequest::getXRequestId, UpdateMemberVmrRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMemberVmrRequest::getAcceptLanguage,
                UpdateMemberVmrRequest::setAcceptLanguage));
        builder.<ModVmrDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModVmrDTO.class),
            f -> f.withMarshaller(UpdateMemberVmrRequest::getBody, UpdateMemberVmrRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMyInfoRequest, UpdateMyInfoResponse> updateMyInfo = genForUpdateMyInfo();

    private static HttpRequestDef<UpdateMyInfoRequest, UpdateMyInfoResponse> genForUpdateMyInfo() {
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
            f -> f.withMarshaller(UpdateMyInfoRequest::getXRequestId, UpdateMyInfoRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMyInfoRequest::getAcceptLanguage, UpdateMyInfoRequest::setAcceptLanguage));
        builder.<ModMemberDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModMemberDTO.class),
            f -> f.withMarshaller(UpdateMyInfoRequest::getBody, UpdateMyInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProgramRequest, UpdateProgramResponse> updateProgram =
        genForUpdateProgram();

    private static HttpRequestDef<UpdateProgramRequest, UpdateProgramResponse> genForUpdateProgram() {
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
            f -> f.withMarshaller(UpdateProgramRequest::getId, UpdateProgramRequest::setId));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProgramRequest::getXRequestId, UpdateProgramRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProgramRequest::getAcceptLanguage, UpdateProgramRequest::setAcceptLanguage));
        builder.<UpdateProgramRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateProgramRequestDTO.class),
            f -> f.withMarshaller(UpdateProgramRequest::getBody, UpdateProgramRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePublicationRequest, UpdatePublicationResponse> updatePublication =
        genForUpdatePublication();

    private static HttpRequestDef<UpdatePublicationRequest, UpdatePublicationResponse> genForUpdatePublication() {
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
            f -> f.withMarshaller(UpdatePublicationRequest::getId, UpdatePublicationRequest::setId));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePublicationRequest::getXRequestId, UpdatePublicationRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePublicationRequest::getAcceptLanguage,
                UpdatePublicationRequest::setAcceptLanguage));
        builder.<UpdatePublicationRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePublicationRequestDTO.class),
            f -> f.withMarshaller(UpdatePublicationRequest::getBody, UpdatePublicationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePwdRequest, UpdatePwdResponse> updatePwd = genForUpdatePwd();

    private static HttpRequestDef<UpdatePwdRequest, UpdatePwdResponse> genForUpdatePwd() {
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
            f -> f.withMarshaller(UpdatePwdRequest::getXRequestID, UpdatePwdRequest::setXRequestID));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePwdRequest::getAcceptLanguage, UpdatePwdRequest::setAcceptLanguage));
        builder.<ModPwdReqDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModPwdReqDTO.class),
            f -> f.withMarshaller(UpdatePwdRequest::getBody, UpdatePwdRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRecurringMeetingRequest, UpdateRecurringMeetingResponse> updateRecurringMeeting =
        genForUpdateRecurringMeeting();

    private static HttpRequestDef<UpdateRecurringMeetingRequest, UpdateRecurringMeetingResponse> genForUpdateRecurringMeeting() {
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
            f -> f.withMarshaller(UpdateRecurringMeetingRequest::getUserUUID,
                UpdateRecurringMeetingRequest::setUserUUID));
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecurringMeetingRequest::getConferenceID,
                UpdateRecurringMeetingRequest::setConferenceID));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecurringMeetingRequest::getXAuthorizationType,
                UpdateRecurringMeetingRequest::setXAuthorizationType));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecurringMeetingRequest::getXSiteId,
                UpdateRecurringMeetingRequest::setXSiteId));
        builder.<RestScheduleConfDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestScheduleConfDTO.class),
            f -> f.withMarshaller(UpdateRecurringMeetingRequest::getBody, UpdateRecurringMeetingRequest::setBody));

        // response
        builder.<List<ConferenceInfo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(UpdateRecurringMeetingResponse::getBody, UpdateRecurringMeetingResponse::setBody)
                .withInnerContainerType(ConferenceInfo.class));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRecurringSubMeetingRequest, UpdateRecurringSubMeetingResponse> updateRecurringSubMeeting =
        genForUpdateRecurringSubMeeting();

    private static HttpRequestDef<UpdateRecurringSubMeetingRequest, UpdateRecurringSubMeetingResponse> genForUpdateRecurringSubMeeting() {
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
            f -> f.withMarshaller(UpdateRecurringSubMeetingRequest::getUserUUID,
                UpdateRecurringSubMeetingRequest::setUserUUID));
        builder.<String>withRequestField("conferenceID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecurringSubMeetingRequest::getConferenceID,
                UpdateRecurringSubMeetingRequest::setConferenceID));
        builder.<String>withRequestField("X-Authorization-Type",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecurringSubMeetingRequest::getXAuthorizationType,
                UpdateRecurringSubMeetingRequest::setXAuthorizationType));
        builder.<String>withRequestField("X-Site-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecurringSubMeetingRequest::getXSiteId,
                UpdateRecurringSubMeetingRequest::setXSiteId));
        builder.<RestScheduleCycleConfDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestScheduleCycleConfDTO.class),
            f -> f.withMarshaller(UpdateRecurringSubMeetingRequest::getBody,
                UpdateRecurringSubMeetingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateResourceRequest, UpdateResourceResponse> updateResource =
        genForUpdateResource();

    private static HttpRequestDef<UpdateResourceRequest, UpdateResourceResponse> genForUpdateResource() {
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
            f -> f.withMarshaller(UpdateResourceRequest::getCorpId, UpdateResourceRequest::setCorpId));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResourceRequest::getXRequestId, UpdateResourceRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResourceRequest::getAcceptLanguage, UpdateResourceRequest::setAcceptLanguage));
        builder.<List<ModResourceDTO>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(UpdateResourceRequest::getBody, UpdateResourceRequest::setBody)
                .withInnerContainerType(ModResourceDTO.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRoomSettingRequest, UpdateRoomSettingResponse> updateRoomSetting =
        genForUpdateRoomSetting();

    private static HttpRequestDef<UpdateRoomSettingRequest, UpdateRoomSettingResponse> genForUpdateRoomSetting() {
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
            f -> f.withMarshaller(UpdateRoomSettingRequest::getConferenceId,
                UpdateRoomSettingRequest::setConferenceId));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRoomSettingRequest::getXRequestId, UpdateRoomSettingRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRoomSettingRequest::getAcceptLanguage,
                UpdateRoomSettingRequest::setAcceptLanguage));
        builder.<OpenRoomSettingReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OpenRoomSettingReq.class),
            f -> f.withMarshaller(UpdateRoomSettingRequest::getBody, UpdateRoomSettingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStartedConfConfigRequest, UpdateStartedConfConfigResponse> updateStartedConfConfig =
        genForUpdateStartedConfConfig();

    private static HttpRequestDef<UpdateStartedConfConfigRequest, UpdateStartedConfConfigResponse> genForUpdateStartedConfConfig() {
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
            f -> f.withMarshaller(UpdateStartedConfConfigRequest::getConferenceID,
                UpdateStartedConfConfigRequest::setConferenceID));
        builder.<String>withRequestField("X-Conference-Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStartedConfConfigRequest::getXConferenceAuthorization,
                UpdateStartedConfConfigRequest::setXConferenceAuthorization));
        builder.<UpdateStartedConfigReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateStartedConfigReqBody.class),
            f -> f.withMarshaller(UpdateStartedConfConfigRequest::getBody, UpdateStartedConfConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTokenRequest, UpdateTokenResponse> updateToken = genForUpdateToken();

    private static HttpRequestDef<UpdateTokenRequest, UpdateTokenResponse> genForUpdateToken() {
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
            f -> f.withMarshaller(UpdateTokenRequest::getXRequestID, UpdateTokenRequest::setXRequestID));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTokenRequest::getAcceptLanguage, UpdateTokenRequest::setAcceptLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserRequest, UpdateUserResponse> updateUser = genForUpdateUser();

    private static HttpRequestDef<UpdateUserRequest, UpdateUserResponse> genForUpdateUser() {
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
            f -> f.withMarshaller(UpdateUserRequest::getAccount, UpdateUserRequest::setAccount));
        builder.<Integer>withRequestField("accountType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateUserRequest::getAccountType, UpdateUserRequest::setAccountType));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserRequest::getXRequestId, UpdateUserRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserRequest::getAcceptLanguage, UpdateUserRequest::setAcceptLanguage));
        builder.<ModUserDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModUserDTO.class),
            f -> f.withMarshaller(UpdateUserRequest::getBody, UpdateUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWebHookConfigStatusRequest, UpdateWebHookConfigStatusResponse> updateWebHookConfigStatus =
        genForUpdateWebHookConfigStatus();

    private static HttpRequestDef<UpdateWebHookConfigStatusRequest, UpdateWebHookConfigStatusResponse> genForUpdateWebHookConfigStatus() {
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
            f -> f.withMarshaller(UpdateWebHookConfigStatusRequest::getId, UpdateWebHookConfigStatusRequest::setId));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateWebHookConfigStatusRequest::getStatus,
                UpdateWebHookConfigStatusRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWebinarRequest, UpdateWebinarResponse> updateWebinar =
        genForUpdateWebinar();

    private static HttpRequestDef<UpdateWebinarRequest, UpdateWebinarResponse> genForUpdateWebinar() {
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
            f -> f.withMarshaller(UpdateWebinarRequest::getXRequestId, UpdateWebinarRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWebinarRequest::getAcceptLanguage, UpdateWebinarRequest::setAcceptLanguage));
        builder.<OpenEditConfReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpenEditConfReq.class),
            f -> f.withMarshaller(UpdateWebinarRequest::getBody, UpdateWebinarRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadFileRequest, UploadFileResponse> uploadFile = genForUploadFile();

    private static HttpRequestDef<UploadFileRequest, UploadFileResponse> genForUploadFile() {
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
            f -> f.withMarshaller(UploadFileRequest::getXRequestId, UploadFileRequest::setXRequestId));
        builder.<String>withRequestField("Accept-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadFileRequest::getAcceptLanguage, UploadFileRequest::setAcceptLanguage));
        builder.<UploadFileRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadFileRequestBody.class),
            f -> f.withMarshaller(UploadFileRequest::getBody, UploadFileRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchQosHistoryMeetingsRequest, SearchQosHistoryMeetingsResponse> searchQosHistoryMeetings =
        genForSearchQosHistoryMeetings();

    private static HttpRequestDef<SearchQosHistoryMeetingsRequest, SearchQosHistoryMeetingsResponse> genForSearchQosHistoryMeetings() {
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
            f -> f.withMarshaller(SearchQosHistoryMeetingsRequest::getStartDate,
                SearchQosHistoryMeetingsRequest::setStartDate));
        builder.<Long>withRequestField("endDate",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchQosHistoryMeetingsRequest::getEndDate,
                SearchQosHistoryMeetingsRequest::setEndDate));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchQosHistoryMeetingsRequest::getOffset,
                SearchQosHistoryMeetingsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchQosHistoryMeetingsRequest::getLimit,
                SearchQosHistoryMeetingsRequest::setLimit));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchQosHistoryMeetingsRequest::getSearchKey,
                SearchQosHistoryMeetingsRequest::setSearchKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchQosOnlineMeetingsRequest, SearchQosOnlineMeetingsResponse> searchQosOnlineMeetings =
        genForSearchQosOnlineMeetings();

    private static HttpRequestDef<SearchQosOnlineMeetingsRequest, SearchQosOnlineMeetingsResponse> genForSearchQosOnlineMeetings() {
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
            f -> f.withMarshaller(SearchQosOnlineMeetingsRequest::getOffset,
                SearchQosOnlineMeetingsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchQosOnlineMeetingsRequest::getLimit, SearchQosOnlineMeetingsRequest::setLimit));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchQosOnlineMeetingsRequest::getSearchKey,
                SearchQosOnlineMeetingsRequest::setSearchKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchQosParticipantDetailRequest, SearchQosParticipantDetailResponse> searchQosParticipantDetail =
        genForSearchQosParticipantDetail();

    private static HttpRequestDef<SearchQosParticipantDetailRequest, SearchQosParticipantDetailResponse> genForSearchQosParticipantDetail() {
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
            f -> f.withMarshaller(SearchQosParticipantDetailRequest::getConfUUID,
                SearchQosParticipantDetailRequest::setConfUUID));
        builder.<SearchQosParticipantDetailRequest.ConfTypeEnum>withRequestField("confType",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchQosParticipantDetailRequest.ConfTypeEnum.class),
            f -> f.withMarshaller(SearchQosParticipantDetailRequest::getConfType,
                SearchQosParticipantDetailRequest::setConfType));
        builder.<String>withRequestField("participantID",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchQosParticipantDetailRequest::getParticipantID,
                SearchQosParticipantDetailRequest::setParticipantID));
        builder.<SearchQosParticipantDetailRequest.QosTypeEnum>withRequestField("qosType",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchQosParticipantDetailRequest.QosTypeEnum.class),
            f -> f.withMarshaller(SearchQosParticipantDetailRequest::getQosType,
                SearchQosParticipantDetailRequest::setQosType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchQosParticipantsRequest, SearchQosParticipantsResponse> searchQosParticipants =
        genForSearchQosParticipants();

    private static HttpRequestDef<SearchQosParticipantsRequest, SearchQosParticipantsResponse> genForSearchQosParticipants() {
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
            f -> f.withMarshaller(SearchQosParticipantsRequest::getConfUUID,
                SearchQosParticipantsRequest::setConfUUID));
        builder.<SearchQosParticipantsRequest.ConfTypeEnum>withRequestField("confType",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchQosParticipantsRequest.ConfTypeEnum.class),
            f -> f.withMarshaller(SearchQosParticipantsRequest::getConfType,
                SearchQosParticipantsRequest::setConfType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchQosParticipantsRequest::getOffset, SearchQosParticipantsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchQosParticipantsRequest::getLimit, SearchQosParticipantsRequest::setLimit));
        builder.<String>withRequestField("searchKey",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchQosParticipantsRequest::getSearchKey,
                SearchQosParticipantsRequest::setSearchKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetQosThresholdRequest, SetQosThresholdResponse> setQosThreshold =
        genForSetQosThreshold();

    private static HttpRequestDef<SetQosThresholdRequest, SetQosThresholdResponse> genForSetQosThreshold() {
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
            f -> f.withMarshaller(SetQosThresholdRequest::getThresholdType, SetQosThresholdRequest::setThresholdType));
        builder.<SetQosThresholdReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetQosThresholdReq.class),
            f -> f.withMarshaller(SetQosThresholdRequest::getBody, SetQosThresholdRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQosThresholdRequest, ShowQosThresholdResponse> showQosThreshold =
        genForShowQosThreshold();

    private static HttpRequestDef<ShowQosThresholdRequest, ShowQosThresholdResponse> genForShowQosThreshold() {
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
            f -> f.withMarshaller(ShowQosThresholdRequest::getThresholdType,
                ShowQosThresholdRequest::setThresholdType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchStatisticConferenceInfoRequest, SearchStatisticConferenceInfoResponse> searchStatisticConferenceInfo =
        genForSearchStatisticConferenceInfo();

    private static HttpRequestDef<SearchStatisticConferenceInfoRequest, SearchStatisticConferenceInfoResponse> genForSearchStatisticConferenceInfo() {
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
            f -> f.withMarshaller(SearchStatisticConferenceInfoRequest::getOffset,
                SearchStatisticConferenceInfoRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchStatisticConferenceInfoRequest::getLimit,
                SearchStatisticConferenceInfoRequest::setLimit));
        builder.<SearchStatisticConferenceInfoRequest.TimeUnitEnum>withRequestField("timeUnit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchStatisticConferenceInfoRequest.TimeUnitEnum.class),
            f -> f.withMarshaller(SearchStatisticConferenceInfoRequest::getTimeUnit,
                SearchStatisticConferenceInfoRequest::setTimeUnit));
        builder.<String>withRequestField("startTime",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchStatisticConferenceInfoRequest::getStartTime,
                SearchStatisticConferenceInfoRequest::setStartTime));
        builder.<String>withRequestField("endTime",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchStatisticConferenceInfoRequest::getEndTime,
                SearchStatisticConferenceInfoRequest::setEndTime));
        builder.<SearchStatisticConferenceInfoRequest.CategoryEnum>withRequestField("category",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchStatisticConferenceInfoRequest.CategoryEnum.class),
            f -> f.withMarshaller(SearchStatisticConferenceInfoRequest::getCategory,
                SearchStatisticConferenceInfoRequest::setCategory));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchStatisticConferenceParticipantRequest, SearchStatisticConferenceParticipantResponse> searchStatisticConferenceParticipant =
        genForSearchStatisticConferenceParticipant();

    private static HttpRequestDef<SearchStatisticConferenceParticipantRequest, SearchStatisticConferenceParticipantResponse> genForSearchStatisticConferenceParticipant() {
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
            f -> f.withMarshaller(SearchStatisticConferenceParticipantRequest::getOffset,
                SearchStatisticConferenceParticipantRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchStatisticConferenceParticipantRequest::getLimit,
                SearchStatisticConferenceParticipantRequest::setLimit));
        builder.<SearchStatisticConferenceParticipantRequest.TimeUnitEnum>withRequestField("timeUnit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchStatisticConferenceParticipantRequest.TimeUnitEnum.class),
            f -> f.withMarshaller(SearchStatisticConferenceParticipantRequest::getTimeUnit,
                SearchStatisticConferenceParticipantRequest::setTimeUnit));
        builder.<String>withRequestField("startTime",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchStatisticConferenceParticipantRequest::getStartTime,
                SearchStatisticConferenceParticipantRequest::setStartTime));
        builder.<String>withRequestField("endTime",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchStatisticConferenceParticipantRequest::getEndTime,
                SearchStatisticConferenceParticipantRequest::setEndTime));
        builder.<SearchStatisticConferenceParticipantRequest.CategoryEnum>withRequestField("category",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchStatisticConferenceParticipantRequest.CategoryEnum.class),
            f -> f.withMarshaller(SearchStatisticConferenceParticipantRequest::getCategory,
                SearchStatisticConferenceParticipantRequest::setCategory));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchStatisticResourceInfoRequest, SearchStatisticResourceInfoResponse> searchStatisticResourceInfo =
        genForSearchStatisticResourceInfo();

    private static HttpRequestDef<SearchStatisticResourceInfoRequest, SearchStatisticResourceInfoResponse> genForSearchStatisticResourceInfo() {
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
            f -> f.withMarshaller(SearchStatisticResourceInfoRequest::getOffset,
                SearchStatisticResourceInfoRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchStatisticResourceInfoRequest::getLimit,
                SearchStatisticResourceInfoRequest::setLimit));
        builder.<SearchStatisticResourceInfoRequest.TimeUnitEnum>withRequestField("timeUnit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchStatisticResourceInfoRequest.TimeUnitEnum.class),
            f -> f.withMarshaller(SearchStatisticResourceInfoRequest::getTimeUnit,
                SearchStatisticResourceInfoRequest::setTimeUnit));
        builder.<String>withRequestField("startTime",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchStatisticResourceInfoRequest::getStartTime,
                SearchStatisticResourceInfoRequest::setStartTime));
        builder.<String>withRequestField("endTime",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchStatisticResourceInfoRequest::getEndTime,
                SearchStatisticResourceInfoRequest::setEndTime));
        builder.<SearchStatisticResourceInfoRequest.CategoryEnum>withRequestField("category",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchStatisticResourceInfoRequest.CategoryEnum.class),
            f -> f.withMarshaller(SearchStatisticResourceInfoRequest::getCategory,
                SearchStatisticResourceInfoRequest::setCategory));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchStatisticUserInfoRequest, SearchStatisticUserInfoResponse> searchStatisticUserInfo =
        genForSearchStatisticUserInfo();

    private static HttpRequestDef<SearchStatisticUserInfoRequest, SearchStatisticUserInfoResponse> genForSearchStatisticUserInfo() {
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
            f -> f.withMarshaller(SearchStatisticUserInfoRequest::getOffset,
                SearchStatisticUserInfoRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchStatisticUserInfoRequest::getLimit, SearchStatisticUserInfoRequest::setLimit));
        builder.<SearchStatisticUserInfoRequest.TimeUnitEnum>withRequestField("timeUnit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchStatisticUserInfoRequest.TimeUnitEnum.class),
            f -> f.withMarshaller(SearchStatisticUserInfoRequest::getTimeUnit,
                SearchStatisticUserInfoRequest::setTimeUnit));
        builder.<String>withRequestField("startTime",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchStatisticUserInfoRequest::getStartTime,
                SearchStatisticUserInfoRequest::setStartTime));
        builder.<String>withRequestField("endTime",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchStatisticUserInfoRequest::getEndTime,
                SearchStatisticUserInfoRequest::setEndTime));
        builder.<SearchStatisticUserInfoRequest.CategoryEnum>withRequestField("category",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchStatisticUserInfoRequest.CategoryEnum.class),
            f -> f.withMarshaller(SearchStatisticUserInfoRequest::getCategory,
                SearchStatisticUserInfoRequest::setCategory));

        // response

        return builder.build();
    }

}

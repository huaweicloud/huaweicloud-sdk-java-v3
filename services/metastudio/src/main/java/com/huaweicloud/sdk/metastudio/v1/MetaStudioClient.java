package com.huaweicloud.sdk.metastudio.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.metastudio.v1.model.BatchExecuteAssetActionRequest;
import com.huaweicloud.sdk.metastudio.v1.model.BatchExecuteAssetActionResponse;
import com.huaweicloud.sdk.metastudio.v1.model.Cancel2DDigitalHumanVideoRequest;
import com.huaweicloud.sdk.metastudio.v1.model.Cancel2DDigitalHumanVideoResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CancelPhotoDigitalHumanVideoRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CancelPhotoDigitalHumanVideoResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CommitVoiceTrainingJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CommitVoiceTrainingJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ConfirmFileUploadRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ConfirmFileUploadResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ConfirmTrainingSegmentRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ConfirmTrainingSegmentResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CopyVideoScriptsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CopyVideoScriptsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CountTenantResourcesRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CountTenantResourcesResponse;
import com.huaweicloud.sdk.metastudio.v1.model.Create2DDigitalHumanVideoRequest;
import com.huaweicloud.sdk.metastudio.v1.model.Create2DDigitalHumanVideoResponse;
import com.huaweicloud.sdk.metastudio.v1.model.Create2dModelTrainingJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.Create2dModelTrainingJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateActiveCodeRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateActiveCodeResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateAgencyWithRoleTypeRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateAgencyWithRoleTypeResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateAssetByReplicationInfoRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateAssetByReplicationInfoResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateBatchKnowledgeQuestionRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateBatchKnowledgeQuestionResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateDialogUrlRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateDialogUrlResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateDigitalAssetRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateDigitalAssetResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateDigitalHumanBusinessCardRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateDigitalHumanBusinessCardResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateFacialAnimationsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateFacialAnimationsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateFileRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateFileResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateHotQuestionRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateHotQuestionResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateHotWordsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateHotWordsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateIntentAndQuestionRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateIntentAndQuestionResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateInteractionRuleGroupRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateInteractionRuleGroupResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateKnowledgeIntentRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateKnowledgeIntentResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateKnowledgeQuestionRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateKnowledgeQuestionResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateKnowledgeSkillRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateKnowledgeSkillResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateLargeFileRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateLargeFileResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateOnceCodeRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateOnceCodeResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePhotoDetectionRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePhotoDetectionResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePhotoDigitalHumanVideoRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePhotoDigitalHumanVideoResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePictureModelingByUrlJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePictureModelingByUrlJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePictureModelingJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePictureModelingJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateProductRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateProductResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateRobotRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateRobotResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateSmartChatRoomRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateSmartChatRoomResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateSmartLiveRoomRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateSmartLiveRoomResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateTrainingAdvanceJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateTrainingAdvanceJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateTrainingBasicJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateTrainingBasicJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateTrainingMiddleJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateTrainingMiddleJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateTtsAuditionRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateTtsAuditionResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateTtsaRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateTtsaResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateVideoMotionCaptureJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateVideoMotionCaptureJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateVideoScriptsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateVideoScriptsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateWelcomeSpeechRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateWelcomeSpeechResponse;
import com.huaweicloud.sdk.metastudio.v1.model.Delete2dModelTrainingJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.Delete2dModelTrainingJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteActiveCodeRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteActiveCodeResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteAgencyWithRoleTypeRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteAgencyWithRoleTypeResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteAssetRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteAssetResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteDigitalHumanBusinessCardRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteDigitalHumanBusinessCardResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteFileRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteFileResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteHotQuestionRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteHotQuestionResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteHotWordsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteHotWordsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteInteractionRuleGroupRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteInteractionRuleGroupResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteKnowledgeIntentRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteKnowledgeIntentResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteKnowledgeQuestionRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteKnowledgeQuestionResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteKnowledgeSkillRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteKnowledgeSkillResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteProductRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteProductResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteRobotRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteRobotResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteSmartChatRoomRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteSmartChatRoomResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteSmartLiveRoomRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteSmartLiveRoomResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteVideoScriptRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteVideoScriptResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteVoiceTrainingJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteVoiceTrainingJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteWelcomeSpeechRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteWelcomeSpeechResponse;
import com.huaweicloud.sdk.metastudio.v1.model.Execute2dModelTrainingCommandByUserRequest;
import com.huaweicloud.sdk.metastudio.v1.model.Execute2dModelTrainingCommandByUserResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ExecuteSmartLiveCommandRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ExecuteSmartLiveCommandResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ExecuteVideoMotionCaptureCommandRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ExecuteVideoMotionCaptureCommandResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ExportKnowledgeSkillRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ExportKnowledgeSkillResponse;
import com.huaweicloud.sdk.metastudio.v1.model.List2dModelTrainingJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.List2dModelTrainingJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListActiveCodeRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListActiveCodeResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListAssetSummaryRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListAssetSummaryResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListAssetsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListAssetsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListDigitalHumanBusinessCardRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListDigitalHumanBusinessCardResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListDigitalHumanVideoRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListDigitalHumanVideoResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListFacialAnimationsDataRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListFacialAnimationsDataResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListHotQuestionRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListHotQuestionResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListHotWordsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListHotWordsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListInteractionRuleGroupsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListInteractionRuleGroupsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListJobOperationLogRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListJobOperationLogResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListKnowledgeIntentRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListKnowledgeIntentResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListKnowledgeQuestionRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListKnowledgeQuestionResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListKnowledgeSkillRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListKnowledgeSkillResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListPictureModelingJobsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListPictureModelingJobsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListProductsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListProductsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListRobotRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListRobotResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListSmartChatRoomsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListSmartChatRoomsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListSmartLiveJobsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListSmartLiveJobsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListSmartLiveRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListSmartLiveResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListSmartLiveRoomsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListSmartLiveRoomsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListStylesRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListStylesResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListTenantResourcesRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListTenantResourcesResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListTtsaDataRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListTtsaDataResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListTtsaJobsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListTtsaJobsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListVideoMotionCaptureJobsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListVideoMotionCaptureJobsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListVideoScriptsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListVideoScriptsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListVoiceTrainingJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListVoiceTrainingJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListWelcomeSpeechRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListWelcomeSpeechResponse;
import com.huaweicloud.sdk.metastudio.v1.model.LiveEventReportRequest;
import com.huaweicloud.sdk.metastudio.v1.model.LiveEventReportResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ResetActiveCodeRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ResetActiveCodeResponse;
import com.huaweicloud.sdk.metastudio.v1.model.RestoreAssetRequest;
import com.huaweicloud.sdk.metastudio.v1.model.RestoreAssetResponse;
import com.huaweicloud.sdk.metastudio.v1.model.SetProductAssetRequest;
import com.huaweicloud.sdk.metastudio.v1.model.SetProductAssetResponse;
import com.huaweicloud.sdk.metastudio.v1.model.Show2DDigitalHumanVideoRequest;
import com.huaweicloud.sdk.metastudio.v1.model.Show2DDigitalHumanVideoResponse;
import com.huaweicloud.sdk.metastudio.v1.model.Show2dModelTrainingJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.Show2dModelTrainingJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowActiveCodeRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowActiveCodeResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowAgencyRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowAgencyResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowAssetReplicationInfoRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowAssetReplicationInfoResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowAssetRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowAssetResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowDigitalHumanBusinessCardRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowDigitalHumanBusinessCardResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowHotQuestionRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowHotQuestionResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowHotWordsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowHotWordsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowHotWordsSwitchRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowHotWordsSwitchResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowJobAuditResultRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowJobAuditResultResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowJobUploadingAddressRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowJobUploadingAddressResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowKnowledgeIntentRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowKnowledgeIntentResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowKnowledgeQuestionRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowKnowledgeQuestionResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowKnowledgeSkillRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowKnowledgeSkillResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowPhotoDetectionRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowPhotoDetectionResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowPhotoDigitalHumanVideoRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowPhotoDigitalHumanVideoResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowPictureModelingJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowPictureModelingJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowProductRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowProductResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowResourceUsageRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowResourceUsageResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowRobotRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowRobotResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowSmartChatJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowSmartChatJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowSmartChatRoomRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowSmartChatRoomResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowSmartLiveRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowSmartLiveResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowSmartLiveRoomRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowSmartLiveRoomResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowTrainingSegmentInfoRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowTrainingSegmentInfoResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowTtsAuditionFileRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowTtsAuditionFileResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowVideoMotionCaptureJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowVideoMotionCaptureJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowVideoScriptRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowVideoScriptResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowVoiceTrainingJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowVoiceTrainingJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowWelcomeSpeechRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowWelcomeSpeechResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowWelcomeSpeechSwitchRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowWelcomeSpeechSwitchResponse;
import com.huaweicloud.sdk.metastudio.v1.model.StartSmartChatJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.StartSmartChatJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.StartSmartLiveRequest;
import com.huaweicloud.sdk.metastudio.v1.model.StartSmartLiveResponse;
import com.huaweicloud.sdk.metastudio.v1.model.StopSmartChatJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.StopSmartChatJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.StopSmartLiveRequest;
import com.huaweicloud.sdk.metastudio.v1.model.StopSmartLiveResponse;
import com.huaweicloud.sdk.metastudio.v1.model.StopVideoMotionCaptureJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.StopVideoMotionCaptureJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.Update2dModelTrainingJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.Update2dModelTrainingJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateActiveCodeRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateActiveCodeResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateBatchKnowledgeQuestionRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateBatchKnowledgeQuestionResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateDigitalAssetRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateDigitalAssetResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateDigitalHumanBusinessCardRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateDigitalHumanBusinessCardResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateHotQuestionRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateHotQuestionResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateHotWordsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateHotWordsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateHotWordsSwitchRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateHotWordsSwitchResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateInteractionRuleGroupRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateInteractionRuleGroupResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateKnowledgeIntentRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateKnowledgeIntentResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateKnowledgeQuestionRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateKnowledgeQuestionResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateKnowledgeSkillRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateKnowledgeSkillResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateProductRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateProductResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateRobotRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateRobotResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateSmartChatRoomRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateSmartChatRoomResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateSmartLiveRoomRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateSmartLiveRoomResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateVideoScriptRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateVideoScriptResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateWelcomeSpeechRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateWelcomeSpeechResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateWelcomeSpeechSwitchRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateWelcomeSpeechSwitchResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ValidateRobotRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ValidateRobotResponse;

public class MetaStudioClient {

    protected HcClient hcClient;

    public MetaStudioClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<MetaStudioClient> newBuilder() {
        ClientBuilder<MetaStudioClient> clientBuilder = new ClientBuilder<>(MetaStudioClient::new);
        return clientBuilder;
    }

    /**
     * 创建激活码
     *
     * 该接口用于创建激活码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateActiveCodeRequest 请求对象
     * @return CreateActiveCodeResponse
     */
    public CreateActiveCodeResponse createActiveCode(CreateActiveCodeRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.createActiveCode);
    }

    /**
     * 创建激活码
     *
     * 该接口用于创建激活码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateActiveCodeRequest 请求对象
     * @return SyncInvoker<CreateActiveCodeRequest, CreateActiveCodeResponse>
     */
    public SyncInvoker<CreateActiveCodeRequest, CreateActiveCodeResponse> createActiveCodeInvoker(
        CreateActiveCodeRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.createActiveCode, hcClient);
    }

    /**
     * 删除激活码
     *
     * 该接口用于删除激活码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteActiveCodeRequest 请求对象
     * @return DeleteActiveCodeResponse
     */
    public DeleteActiveCodeResponse deleteActiveCode(DeleteActiveCodeRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.deleteActiveCode);
    }

    /**
     * 删除激活码
     *
     * 该接口用于删除激活码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteActiveCodeRequest 请求对象
     * @return SyncInvoker<DeleteActiveCodeRequest, DeleteActiveCodeResponse>
     */
    public SyncInvoker<DeleteActiveCodeRequest, DeleteActiveCodeResponse> deleteActiveCodeInvoker(
        DeleteActiveCodeRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.deleteActiveCode, hcClient);
    }

    /**
     * 查询激活码列表
     *
     * 该接口用于查询激活码列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListActiveCodeRequest 请求对象
     * @return ListActiveCodeResponse
     */
    public ListActiveCodeResponse listActiveCode(ListActiveCodeRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.listActiveCode);
    }

    /**
     * 查询激活码列表
     *
     * 该接口用于查询激活码列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListActiveCodeRequest 请求对象
     * @return SyncInvoker<ListActiveCodeRequest, ListActiveCodeResponse>
     */
    public SyncInvoker<ListActiveCodeRequest, ListActiveCodeResponse> listActiveCodeInvoker(
        ListActiveCodeRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.listActiveCode, hcClient);
    }

    /**
     * 重置激活码
     *
     * 该接口用于重置激活码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetActiveCodeRequest 请求对象
     * @return ResetActiveCodeResponse
     */
    public ResetActiveCodeResponse resetActiveCode(ResetActiveCodeRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.resetActiveCode);
    }

    /**
     * 重置激活码
     *
     * 该接口用于重置激活码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetActiveCodeRequest 请求对象
     * @return SyncInvoker<ResetActiveCodeRequest, ResetActiveCodeResponse>
     */
    public SyncInvoker<ResetActiveCodeRequest, ResetActiveCodeResponse> resetActiveCodeInvoker(
        ResetActiveCodeRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.resetActiveCode, hcClient);
    }

    /**
     * 查询激活码详情
     *
     * 该接口用于查询激活码详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowActiveCodeRequest 请求对象
     * @return ShowActiveCodeResponse
     */
    public ShowActiveCodeResponse showActiveCode(ShowActiveCodeRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.showActiveCode);
    }

    /**
     * 查询激活码详情
     *
     * 该接口用于查询激活码详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowActiveCodeRequest 请求对象
     * @return SyncInvoker<ShowActiveCodeRequest, ShowActiveCodeResponse>
     */
    public SyncInvoker<ShowActiveCodeRequest, ShowActiveCodeResponse> showActiveCodeInvoker(
        ShowActiveCodeRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.showActiveCode, hcClient);
    }

    /**
     * 修改激活码
     *
     * 该接口用于修改激活码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateActiveCodeRequest 请求对象
     * @return UpdateActiveCodeResponse
     */
    public UpdateActiveCodeResponse updateActiveCode(UpdateActiveCodeRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.updateActiveCode);
    }

    /**
     * 修改激活码
     *
     * 该接口用于修改激活码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateActiveCodeRequest 请求对象
     * @return SyncInvoker<UpdateActiveCodeRequest, UpdateActiveCodeResponse>
     */
    public SyncInvoker<UpdateActiveCodeRequest, UpdateActiveCodeResponse> updateActiveCodeInvoker(
        UpdateActiveCodeRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.updateActiveCode, hcClient);
    }

    /**
     * 创建委托
     *
     * 该接口用于创建委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgencyWithRoleTypeRequest 请求对象
     * @return CreateAgencyWithRoleTypeResponse
     */
    public CreateAgencyWithRoleTypeResponse createAgencyWithRoleType(CreateAgencyWithRoleTypeRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.createAgencyWithRoleType);
    }

    /**
     * 创建委托
     *
     * 该接口用于创建委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgencyWithRoleTypeRequest 请求对象
     * @return SyncInvoker<CreateAgencyWithRoleTypeRequest, CreateAgencyWithRoleTypeResponse>
     */
    public SyncInvoker<CreateAgencyWithRoleTypeRequest, CreateAgencyWithRoleTypeResponse> createAgencyWithRoleTypeInvoker(
        CreateAgencyWithRoleTypeRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.createAgencyWithRoleType, hcClient);
    }

    /**
     * 删除委托
     *
     * 该接口用于删除项目下委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAgencyWithRoleTypeRequest 请求对象
     * @return DeleteAgencyWithRoleTypeResponse
     */
    public DeleteAgencyWithRoleTypeResponse deleteAgencyWithRoleType(DeleteAgencyWithRoleTypeRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.deleteAgencyWithRoleType);
    }

    /**
     * 删除委托
     *
     * 该接口用于删除项目下委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAgencyWithRoleTypeRequest 请求对象
     * @return SyncInvoker<DeleteAgencyWithRoleTypeRequest, DeleteAgencyWithRoleTypeResponse>
     */
    public SyncInvoker<DeleteAgencyWithRoleTypeRequest, DeleteAgencyWithRoleTypeResponse> deleteAgencyWithRoleTypeInvoker(
        DeleteAgencyWithRoleTypeRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.deleteAgencyWithRoleType, hcClient);
    }

    /**
     * 查询委托
     *
     * 该接口用于查询项目下委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgencyRequest 请求对象
     * @return ShowAgencyResponse
     */
    public ShowAgencyResponse showAgency(ShowAgencyRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.showAgency);
    }

    /**
     * 查询委托
     *
     * 该接口用于查询项目下委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgencyRequest 请求对象
     * @return SyncInvoker<ShowAgencyRequest, ShowAgencyResponse>
     */
    public SyncInvoker<ShowAgencyRequest, ShowAgencyResponse> showAgencyInvoker(ShowAgencyRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.showAgency, hcClient);
    }

    /**
     * 创建对话链接
     *
     * 该接口用于创建对话链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDialogUrlRequest 请求对象
     * @return CreateDialogUrlResponse
     */
    public CreateDialogUrlResponse createDialogUrl(CreateDialogUrlRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.createDialogUrl);
    }

    /**
     * 创建对话链接
     *
     * 该接口用于创建对话链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDialogUrlRequest 请求对象
     * @return SyncInvoker<CreateDialogUrlRequest, CreateDialogUrlResponse>
     */
    public SyncInvoker<CreateDialogUrlRequest, CreateDialogUrlResponse> createDialogUrlInvoker(
        CreateDialogUrlRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.createDialogUrl, hcClient);
    }

    /**
     * 查询数字人智能交互任务
     *
     * 该接口用于查询数字人智能交互任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSmartChatJobRequest 请求对象
     * @return ShowSmartChatJobResponse
     */
    public ShowSmartChatJobResponse showSmartChatJob(ShowSmartChatJobRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.showSmartChatJob);
    }

    /**
     * 查询数字人智能交互任务
     *
     * 该接口用于查询数字人智能交互任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSmartChatJobRequest 请求对象
     * @return SyncInvoker<ShowSmartChatJobRequest, ShowSmartChatJobResponse>
     */
    public SyncInvoker<ShowSmartChatJobRequest, ShowSmartChatJobResponse> showSmartChatJobInvoker(
        ShowSmartChatJobRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.showSmartChatJob, hcClient);
    }

    /**
     * 启动数字人智能交互任务
     *
     * 该接口用于启动数字人智能交互任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartSmartChatJobRequest 请求对象
     * @return StartSmartChatJobResponse
     */
    public StartSmartChatJobResponse startSmartChatJob(StartSmartChatJobRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.startSmartChatJob);
    }

    /**
     * 启动数字人智能交互任务
     *
     * 该接口用于启动数字人智能交互任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartSmartChatJobRequest 请求对象
     * @return SyncInvoker<StartSmartChatJobRequest, StartSmartChatJobResponse>
     */
    public SyncInvoker<StartSmartChatJobRequest, StartSmartChatJobResponse> startSmartChatJobInvoker(
        StartSmartChatJobRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.startSmartChatJob, hcClient);
    }

    /**
     * 结束数字人智能交互任务
     *
     * 该接口用于结束数字人智能交互任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopSmartChatJobRequest 请求对象
     * @return StopSmartChatJobResponse
     */
    public StopSmartChatJobResponse stopSmartChatJob(StopSmartChatJobRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.stopSmartChatJob);
    }

    /**
     * 结束数字人智能交互任务
     *
     * 该接口用于结束数字人智能交互任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopSmartChatJobRequest 请求对象
     * @return SyncInvoker<StopSmartChatJobRequest, StopSmartChatJobResponse>
     */
    public SyncInvoker<StopSmartChatJobRequest, StopSmartChatJobResponse> stopSmartChatJobInvoker(
        StopSmartChatJobRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.stopSmartChatJob, hcClient);
    }

    /**
     * 批量资产操作
     *
     * 该接口用批量资产操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchExecuteAssetActionRequest 请求对象
     * @return BatchExecuteAssetActionResponse
     */
    public BatchExecuteAssetActionResponse batchExecuteAssetAction(BatchExecuteAssetActionRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.batchExecuteAssetAction);
    }

    /**
     * 批量资产操作
     *
     * 该接口用批量资产操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchExecuteAssetActionRequest 请求对象
     * @return SyncInvoker<BatchExecuteAssetActionRequest, BatchExecuteAssetActionResponse>
     */
    public SyncInvoker<BatchExecuteAssetActionRequest, BatchExecuteAssetActionResponse> batchExecuteAssetActionInvoker(
        BatchExecuteAssetActionRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.batchExecuteAssetAction, hcClient);
    }

    /**
     * 复制资产
     *
     * 该接口用于在Region B复制Region A的指定资产。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAssetByReplicationInfoRequest 请求对象
     * @return CreateAssetByReplicationInfoResponse
     */
    public CreateAssetByReplicationInfoResponse createAssetByReplicationInfo(
        CreateAssetByReplicationInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.createAssetByReplicationInfo);
    }

    /**
     * 复制资产
     *
     * 该接口用于在Region B复制Region A的指定资产。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAssetByReplicationInfoRequest 请求对象
     * @return SyncInvoker<CreateAssetByReplicationInfoRequest, CreateAssetByReplicationInfoResponse>
     */
    public SyncInvoker<CreateAssetByReplicationInfoRequest, CreateAssetByReplicationInfoResponse> createAssetByReplicationInfoInvoker(
        CreateAssetByReplicationInfoRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.createAssetByReplicationInfo, hcClient);
    }

    /**
     * 创建资产
     *
     * 该接口用于在资产库中添加上传新的媒体资产。可上传的资产类型包括：分身数字人模型、背景图片、素材图片、素材视频、PPT等。
     * &gt; - 资产类型是IMAGE时，通过system_properties来区分背景图片（BACKGROUND_IMG）、素材图片（MATERIAL_IMG）。
     * &gt; - 资产类型是VIDEO时，通过system_properties来区分素材视频（MATERIAL_VIDEO）、名片视频（BUSSINESS_CARD_VIDEO）。
     * &gt; - MetaStudio平台生成的视频，system_properties带CREATED_BY_PLATFORM。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDigitalAssetRequest 请求对象
     * @return CreateDigitalAssetResponse
     */
    public CreateDigitalAssetResponse createDigitalAsset(CreateDigitalAssetRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.createDigitalAsset);
    }

    /**
     * 创建资产
     *
     * 该接口用于在资产库中添加上传新的媒体资产。可上传的资产类型包括：分身数字人模型、背景图片、素材图片、素材视频、PPT等。
     * &gt; - 资产类型是IMAGE时，通过system_properties来区分背景图片（BACKGROUND_IMG）、素材图片（MATERIAL_IMG）。
     * &gt; - 资产类型是VIDEO时，通过system_properties来区分素材视频（MATERIAL_VIDEO）、名片视频（BUSSINESS_CARD_VIDEO）。
     * &gt; - MetaStudio平台生成的视频，system_properties带CREATED_BY_PLATFORM。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDigitalAssetRequest 请求对象
     * @return SyncInvoker<CreateDigitalAssetRequest, CreateDigitalAssetResponse>
     */
    public SyncInvoker<CreateDigitalAssetRequest, CreateDigitalAssetResponse> createDigitalAssetInvoker(
        CreateDigitalAssetRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.createDigitalAsset, hcClient);
    }

    /**
     * 删除资产
     *
     * 该接口用于删除资产库中的媒体资产。调用该接口删除媒体资产时，媒体资产会放入回收站中，不会彻底删除。如需彻底删除资产，需增加“mode&#x3D;force”参数配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAssetRequest 请求对象
     * @return DeleteAssetResponse
     */
    public DeleteAssetResponse deleteAsset(DeleteAssetRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.deleteAsset);
    }

    /**
     * 删除资产
     *
     * 该接口用于删除资产库中的媒体资产。调用该接口删除媒体资产时，媒体资产会放入回收站中，不会彻底删除。如需彻底删除资产，需增加“mode&#x3D;force”参数配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAssetRequest 请求对象
     * @return SyncInvoker<DeleteAssetRequest, DeleteAssetResponse>
     */
    public SyncInvoker<DeleteAssetRequest, DeleteAssetResponse> deleteAssetInvoker(DeleteAssetRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.deleteAsset, hcClient);
    }

    /**
     * 查询资产概要
     *
     * 该接口用于查询媒体资产库中指定的多个资产的概要信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssetSummaryRequest 请求对象
     * @return ListAssetSummaryResponse
     */
    public ListAssetSummaryResponse listAssetSummary(ListAssetSummaryRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.listAssetSummary);
    }

    /**
     * 查询资产概要
     *
     * 该接口用于查询媒体资产库中指定的多个资产的概要信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssetSummaryRequest 请求对象
     * @return SyncInvoker<ListAssetSummaryRequest, ListAssetSummaryResponse>
     */
    public SyncInvoker<ListAssetSummaryRequest, ListAssetSummaryResponse> listAssetSummaryInvoker(
        ListAssetSummaryRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.listAssetSummary, hcClient);
    }

    /**
     * 查询资产列表
     *
     * 该接口用于查询资产库中的媒体资产列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssetsRequest 请求对象
     * @return ListAssetsResponse
     */
    public ListAssetsResponse listAssets(ListAssetsRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.listAssets);
    }

    /**
     * 查询资产列表
     *
     * 该接口用于查询资产库中的媒体资产列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssetsRequest 请求对象
     * @return SyncInvoker<ListAssetsRequest, ListAssetsResponse>
     */
    public SyncInvoker<ListAssetsRequest, ListAssetsResponse> listAssetsInvoker(ListAssetsRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.listAssets, hcClient);
    }

    /**
     * 恢复被删除的资产
     *
     * 该接口用于恢复被删除至回收站的媒体资产。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreAssetRequest 请求对象
     * @return RestoreAssetResponse
     */
    public RestoreAssetResponse restoreAsset(RestoreAssetRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.restoreAsset);
    }

    /**
     * 恢复被删除的资产
     *
     * 该接口用于恢复被删除至回收站的媒体资产。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreAssetRequest 请求对象
     * @return SyncInvoker<RestoreAssetRequest, RestoreAssetResponse>
     */
    public SyncInvoker<RestoreAssetRequest, RestoreAssetResponse> restoreAssetInvoker(RestoreAssetRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.restoreAsset, hcClient);
    }

    /**
     * 查询资产详情
     *
     * 该接口用于查询资产库中指定媒体资产的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssetRequest 请求对象
     * @return ShowAssetResponse
     */
    public ShowAssetResponse showAsset(ShowAssetRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.showAsset);
    }

    /**
     * 查询资产详情
     *
     * 该接口用于查询资产库中指定媒体资产的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssetRequest 请求对象
     * @return SyncInvoker<ShowAssetRequest, ShowAssetResponse>
     */
    public SyncInvoker<ShowAssetRequest, ShowAssetResponse> showAssetInvoker(ShowAssetRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.showAsset, hcClient);
    }

    /**
     * 查询资产复制信息
     *
     * 当需要将资产从A Region复制到B Region时，先要在A Region调用该接口用于查询资产复制信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssetReplicationInfoRequest 请求对象
     * @return ShowAssetReplicationInfoResponse
     */
    public ShowAssetReplicationInfoResponse showAssetReplicationInfo(ShowAssetReplicationInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.showAssetReplicationInfo);
    }

    /**
     * 查询资产复制信息
     *
     * 当需要将资产从A Region复制到B Region时，先要在A Region调用该接口用于查询资产复制信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssetReplicationInfoRequest 请求对象
     * @return SyncInvoker<ShowAssetReplicationInfoRequest, ShowAssetReplicationInfoResponse>
     */
    public SyncInvoker<ShowAssetReplicationInfoRequest, ShowAssetReplicationInfoResponse> showAssetReplicationInfoInvoker(
        ShowAssetReplicationInfoRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.showAssetReplicationInfo, hcClient);
    }

    /**
     * 更新资产
     *
     * 该接口用于更新资产库中的媒体资产信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDigitalAssetRequest 请求对象
     * @return UpdateDigitalAssetResponse
     */
    public UpdateDigitalAssetResponse updateDigitalAsset(UpdateDigitalAssetRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.updateDigitalAsset);
    }

    /**
     * 更新资产
     *
     * 该接口用于更新资产库中的媒体资产信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDigitalAssetRequest 请求对象
     * @return SyncInvoker<UpdateDigitalAssetRequest, UpdateDigitalAssetResponse>
     */
    public SyncInvoker<UpdateDigitalAssetRequest, UpdateDigitalAssetResponse> updateDigitalAssetInvoker(
        UpdateDigitalAssetRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.updateDigitalAsset, hcClient);
    }

    /**
     * 创建数字人名片制作
     *
     * 该接口用于数字人名片制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDigitalHumanBusinessCardRequest 请求对象
     * @return CreateDigitalHumanBusinessCardResponse
     */
    public CreateDigitalHumanBusinessCardResponse createDigitalHumanBusinessCard(
        CreateDigitalHumanBusinessCardRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.createDigitalHumanBusinessCard);
    }

    /**
     * 创建数字人名片制作
     *
     * 该接口用于数字人名片制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDigitalHumanBusinessCardRequest 请求对象
     * @return SyncInvoker<CreateDigitalHumanBusinessCardRequest, CreateDigitalHumanBusinessCardResponse>
     */
    public SyncInvoker<CreateDigitalHumanBusinessCardRequest, CreateDigitalHumanBusinessCardResponse> createDigitalHumanBusinessCardInvoker(
        CreateDigitalHumanBusinessCardRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.createDigitalHumanBusinessCard, hcClient);
    }

    /**
     * 删除数字人名片制作任务
     *
     * 该接口用于删除数字人名片制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDigitalHumanBusinessCardRequest 请求对象
     * @return DeleteDigitalHumanBusinessCardResponse
     */
    public DeleteDigitalHumanBusinessCardResponse deleteDigitalHumanBusinessCard(
        DeleteDigitalHumanBusinessCardRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.deleteDigitalHumanBusinessCard);
    }

    /**
     * 删除数字人名片制作任务
     *
     * 该接口用于删除数字人名片制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDigitalHumanBusinessCardRequest 请求对象
     * @return SyncInvoker<DeleteDigitalHumanBusinessCardRequest, DeleteDigitalHumanBusinessCardResponse>
     */
    public SyncInvoker<DeleteDigitalHumanBusinessCardRequest, DeleteDigitalHumanBusinessCardResponse> deleteDigitalHumanBusinessCardInvoker(
        DeleteDigitalHumanBusinessCardRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.deleteDigitalHumanBusinessCard, hcClient);
    }

    /**
     * 查询数字人名片制作任务列表
     *
     * 该接口用于查询数字人名片制作任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDigitalHumanBusinessCardRequest 请求对象
     * @return ListDigitalHumanBusinessCardResponse
     */
    public ListDigitalHumanBusinessCardResponse listDigitalHumanBusinessCard(
        ListDigitalHumanBusinessCardRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.listDigitalHumanBusinessCard);
    }

    /**
     * 查询数字人名片制作任务列表
     *
     * 该接口用于查询数字人名片制作任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDigitalHumanBusinessCardRequest 请求对象
     * @return SyncInvoker<ListDigitalHumanBusinessCardRequest, ListDigitalHumanBusinessCardResponse>
     */
    public SyncInvoker<ListDigitalHumanBusinessCardRequest, ListDigitalHumanBusinessCardResponse> listDigitalHumanBusinessCardInvoker(
        ListDigitalHumanBusinessCardRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.listDigitalHumanBusinessCard, hcClient);
    }

    /**
     * 查询数字人名片制作任务详情
     *
     * 该接口用于查询数字人名片制作任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDigitalHumanBusinessCardRequest 请求对象
     * @return ShowDigitalHumanBusinessCardResponse
     */
    public ShowDigitalHumanBusinessCardResponse showDigitalHumanBusinessCard(
        ShowDigitalHumanBusinessCardRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.showDigitalHumanBusinessCard);
    }

    /**
     * 查询数字人名片制作任务详情
     *
     * 该接口用于查询数字人名片制作任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDigitalHumanBusinessCardRequest 请求对象
     * @return SyncInvoker<ShowDigitalHumanBusinessCardRequest, ShowDigitalHumanBusinessCardResponse>
     */
    public SyncInvoker<ShowDigitalHumanBusinessCardRequest, ShowDigitalHumanBusinessCardResponse> showDigitalHumanBusinessCardInvoker(
        ShowDigitalHumanBusinessCardRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.showDigitalHumanBusinessCard, hcClient);
    }

    /**
     * 更新数字人名片制作
     *
     * 该接口用于更新数字人名片制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDigitalHumanBusinessCardRequest 请求对象
     * @return UpdateDigitalHumanBusinessCardResponse
     */
    public UpdateDigitalHumanBusinessCardResponse updateDigitalHumanBusinessCard(
        UpdateDigitalHumanBusinessCardRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.updateDigitalHumanBusinessCard);
    }

    /**
     * 更新数字人名片制作
     *
     * 该接口用于更新数字人名片制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDigitalHumanBusinessCardRequest 请求对象
     * @return SyncInvoker<UpdateDigitalHumanBusinessCardRequest, UpdateDigitalHumanBusinessCardResponse>
     */
    public SyncInvoker<UpdateDigitalHumanBusinessCardRequest, UpdateDigitalHumanBusinessCardResponse> updateDigitalHumanBusinessCardInvoker(
        UpdateDigitalHumanBusinessCardRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.updateDigitalHumanBusinessCard, hcClient);
    }

    /**
     * 查询视频制作任务列表
     *
     * 该接口用于查询视频制作任务列表。可查询分身数字人视频制作列表，照片数字人视频制作列表等。
     * &gt; - 默认查询最近一个月任务记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDigitalHumanVideoRequest 请求对象
     * @return ListDigitalHumanVideoResponse
     */
    public ListDigitalHumanVideoResponse listDigitalHumanVideo(ListDigitalHumanVideoRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.listDigitalHumanVideo);
    }

    /**
     * 查询视频制作任务列表
     *
     * 该接口用于查询视频制作任务列表。可查询分身数字人视频制作列表，照片数字人视频制作列表等。
     * &gt; - 默认查询最近一个月任务记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDigitalHumanVideoRequest 请求对象
     * @return SyncInvoker<ListDigitalHumanVideoRequest, ListDigitalHumanVideoResponse>
     */
    public SyncInvoker<ListDigitalHumanVideoRequest, ListDigitalHumanVideoResponse> listDigitalHumanVideoInvoker(
        ListDigitalHumanVideoRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.listDigitalHumanVideo, hcClient);
    }

    /**
     * 取消等待中的分身数字人视频制作任务
     *
     * 该接口用于取消等待中的分身数字人视频制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Cancel2DDigitalHumanVideoRequest 请求对象
     * @return Cancel2DDigitalHumanVideoResponse
     */
    public Cancel2DDigitalHumanVideoResponse cancel2DDigitalHumanVideo(Cancel2DDigitalHumanVideoRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.cancel2DDigitalHumanVideo);
    }

    /**
     * 取消等待中的分身数字人视频制作任务
     *
     * 该接口用于取消等待中的分身数字人视频制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Cancel2DDigitalHumanVideoRequest 请求对象
     * @return SyncInvoker<Cancel2DDigitalHumanVideoRequest, Cancel2DDigitalHumanVideoResponse>
     */
    public SyncInvoker<Cancel2DDigitalHumanVideoRequest, Cancel2DDigitalHumanVideoResponse> cancel2DDigitalHumanVideoInvoker(
        Cancel2DDigitalHumanVideoRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.cancel2DDigitalHumanVideo, hcClient);
    }

    /**
     * 创建分身数字人视频制作任务
     *
     * 该接口用于创建分身数字人视频制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Create2DDigitalHumanVideoRequest 请求对象
     * @return Create2DDigitalHumanVideoResponse
     */
    public Create2DDigitalHumanVideoResponse create2DDigitalHumanVideo(Create2DDigitalHumanVideoRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.create2DDigitalHumanVideo);
    }

    /**
     * 创建分身数字人视频制作任务
     *
     * 该接口用于创建分身数字人视频制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Create2DDigitalHumanVideoRequest 请求对象
     * @return SyncInvoker<Create2DDigitalHumanVideoRequest, Create2DDigitalHumanVideoResponse>
     */
    public SyncInvoker<Create2DDigitalHumanVideoRequest, Create2DDigitalHumanVideoResponse> create2DDigitalHumanVideoInvoker(
        Create2DDigitalHumanVideoRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.create2DDigitalHumanVideo, hcClient);
    }

    /**
     * 查询分身数字人视频制作任务详情
     *
     * 该接口用于查询分身数字人视频制作任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Show2DDigitalHumanVideoRequest 请求对象
     * @return Show2DDigitalHumanVideoResponse
     */
    public Show2DDigitalHumanVideoResponse show2DDigitalHumanVideo(Show2DDigitalHumanVideoRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.show2DDigitalHumanVideo);
    }

    /**
     * 查询分身数字人视频制作任务详情
     *
     * 该接口用于查询分身数字人视频制作任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Show2DDigitalHumanVideoRequest 请求对象
     * @return SyncInvoker<Show2DDigitalHumanVideoRequest, Show2DDigitalHumanVideoResponse>
     */
    public SyncInvoker<Show2DDigitalHumanVideoRequest, Show2DDigitalHumanVideoResponse> show2DDigitalHumanVideoInvoker(
        Show2DDigitalHumanVideoRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.show2DDigitalHumanVideo, hcClient);
    }

    /**
     * 取消等待中的照片分身数字人视频制作任务
     *
     * 该接口用于取消等待中的照片分身数字人视频制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelPhotoDigitalHumanVideoRequest 请求对象
     * @return CancelPhotoDigitalHumanVideoResponse
     */
    public CancelPhotoDigitalHumanVideoResponse cancelPhotoDigitalHumanVideo(
        CancelPhotoDigitalHumanVideoRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.cancelPhotoDigitalHumanVideo);
    }

    /**
     * 取消等待中的照片分身数字人视频制作任务
     *
     * 该接口用于取消等待中的照片分身数字人视频制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelPhotoDigitalHumanVideoRequest 请求对象
     * @return SyncInvoker<CancelPhotoDigitalHumanVideoRequest, CancelPhotoDigitalHumanVideoResponse>
     */
    public SyncInvoker<CancelPhotoDigitalHumanVideoRequest, CancelPhotoDigitalHumanVideoResponse> cancelPhotoDigitalHumanVideoInvoker(
        CancelPhotoDigitalHumanVideoRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.cancelPhotoDigitalHumanVideo, hcClient);
    }

    /**
     * 创建照片检测任务
     *
     * 该接口用于创建照片检测任务，检测照片是否满足制作照片数字人的要求。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePhotoDetectionRequest 请求对象
     * @return CreatePhotoDetectionResponse
     */
    public CreatePhotoDetectionResponse createPhotoDetection(CreatePhotoDetectionRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.createPhotoDetection);
    }

    /**
     * 创建照片检测任务
     *
     * 该接口用于创建照片检测任务，检测照片是否满足制作照片数字人的要求。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePhotoDetectionRequest 请求对象
     * @return SyncInvoker<CreatePhotoDetectionRequest, CreatePhotoDetectionResponse>
     */
    public SyncInvoker<CreatePhotoDetectionRequest, CreatePhotoDetectionResponse> createPhotoDetectionInvoker(
        CreatePhotoDetectionRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.createPhotoDetection, hcClient);
    }

    /**
     * 创建照片分身数字人视频制作任务
     *
     * 该接口用于创建照片分身数字人视频制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePhotoDigitalHumanVideoRequest 请求对象
     * @return CreatePhotoDigitalHumanVideoResponse
     */
    public CreatePhotoDigitalHumanVideoResponse createPhotoDigitalHumanVideo(
        CreatePhotoDigitalHumanVideoRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.createPhotoDigitalHumanVideo);
    }

    /**
     * 创建照片分身数字人视频制作任务
     *
     * 该接口用于创建照片分身数字人视频制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePhotoDigitalHumanVideoRequest 请求对象
     * @return SyncInvoker<CreatePhotoDigitalHumanVideoRequest, CreatePhotoDigitalHumanVideoResponse>
     */
    public SyncInvoker<CreatePhotoDigitalHumanVideoRequest, CreatePhotoDigitalHumanVideoResponse> createPhotoDigitalHumanVideoInvoker(
        CreatePhotoDigitalHumanVideoRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.createPhotoDigitalHumanVideo, hcClient);
    }

    /**
     * 查询照片检测任务详情
     *
     * 该接口用于查询照片检测任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPhotoDetectionRequest 请求对象
     * @return ShowPhotoDetectionResponse
     */
    public ShowPhotoDetectionResponse showPhotoDetection(ShowPhotoDetectionRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.showPhotoDetection);
    }

    /**
     * 查询照片检测任务详情
     *
     * 该接口用于查询照片检测任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPhotoDetectionRequest 请求对象
     * @return SyncInvoker<ShowPhotoDetectionRequest, ShowPhotoDetectionResponse>
     */
    public SyncInvoker<ShowPhotoDetectionRequest, ShowPhotoDetectionResponse> showPhotoDetectionInvoker(
        ShowPhotoDetectionRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.showPhotoDetection, hcClient);
    }

    /**
     * 查询照片分身数字人视频制作任务详情
     *
     * 该接口用于查询照片分身数字人视频制作任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPhotoDigitalHumanVideoRequest 请求对象
     * @return ShowPhotoDigitalHumanVideoResponse
     */
    public ShowPhotoDigitalHumanVideoResponse showPhotoDigitalHumanVideo(ShowPhotoDigitalHumanVideoRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.showPhotoDigitalHumanVideo);
    }

    /**
     * 查询照片分身数字人视频制作任务详情
     *
     * 该接口用于查询照片分身数字人视频制作任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPhotoDigitalHumanVideoRequest 请求对象
     * @return SyncInvoker<ShowPhotoDigitalHumanVideoRequest, ShowPhotoDigitalHumanVideoResponse>
     */
    public SyncInvoker<ShowPhotoDigitalHumanVideoRequest, ShowPhotoDigitalHumanVideoResponse> showPhotoDigitalHumanVideoInvoker(
        ShowPhotoDigitalHumanVideoRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.showPhotoDigitalHumanVideo, hcClient);
    }

    /**
     * 确认文件已上传
     *
     * 资产文件上传完毕后，通过该接口确认上传完成。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmFileUploadRequest 请求对象
     * @return ConfirmFileUploadResponse
     */
    public ConfirmFileUploadResponse confirmFileUpload(ConfirmFileUploadRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.confirmFileUpload);
    }

    /**
     * 确认文件已上传
     *
     * 资产文件上传完毕后，通过该接口确认上传完成。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmFileUploadRequest 请求对象
     * @return SyncInvoker<ConfirmFileUploadRequest, ConfirmFileUploadResponse>
     */
    public SyncInvoker<ConfirmFileUploadRequest, ConfirmFileUploadResponse> confirmFileUploadInvoker(
        ConfirmFileUploadRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.confirmFileUpload, hcClient);
    }

    /**
     * 创建文件并获取上传URL
     *
     * 该接口用于创建文件并获取上传URL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFileRequest 请求对象
     * @return CreateFileResponse
     */
    public CreateFileResponse createFile(CreateFileRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.createFile);
    }

    /**
     * 创建文件并获取上传URL
     *
     * 该接口用于创建文件并获取上传URL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFileRequest 请求对象
     * @return SyncInvoker<CreateFileRequest, CreateFileResponse>
     */
    public SyncInvoker<CreateFileRequest, CreateFileResponse> createFileInvoker(CreateFileRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.createFile, hcClient);
    }

    /**
     * 创建大文件
     *
     * 该接口用于创建大文件（超过5G），获取分段上传URL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLargeFileRequest 请求对象
     * @return CreateLargeFileResponse
     */
    public CreateLargeFileResponse createLargeFile(CreateLargeFileRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.createLargeFile);
    }

    /**
     * 创建大文件
     *
     * 该接口用于创建大文件（超过5G），获取分段上传URL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLargeFileRequest 请求对象
     * @return SyncInvoker<CreateLargeFileRequest, CreateLargeFileResponse>
     */
    public SyncInvoker<CreateLargeFileRequest, CreateLargeFileResponse> createLargeFileInvoker(
        CreateLargeFileRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.createLargeFile, hcClient);
    }

    /**
     * 删除文件
     *
     * 该接口用于删除媒体资产库中指定的文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFileRequest 请求对象
     * @return DeleteFileResponse
     */
    public DeleteFileResponse deleteFile(DeleteFileRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.deleteFile);
    }

    /**
     * 删除文件
     *
     * 该接口用于删除媒体资产库中指定的文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFileRequest 请求对象
     * @return SyncInvoker<DeleteFileRequest, DeleteFileResponse>
     */
    public SyncInvoker<DeleteFileRequest, DeleteFileResponse> deleteFileInvoker(DeleteFileRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.deleteFile, hcClient);
    }

    /**
     * 创建热点问题
     *
     * 该接口用于创建热点问题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHotQuestionRequest 请求对象
     * @return CreateHotQuestionResponse
     */
    public CreateHotQuestionResponse createHotQuestion(CreateHotQuestionRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.createHotQuestion);
    }

    /**
     * 创建热点问题
     *
     * 该接口用于创建热点问题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHotQuestionRequest 请求对象
     * @return SyncInvoker<CreateHotQuestionRequest, CreateHotQuestionResponse>
     */
    public SyncInvoker<CreateHotQuestionRequest, CreateHotQuestionResponse> createHotQuestionInvoker(
        CreateHotQuestionRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.createHotQuestion, hcClient);
    }

    /**
     * 删除热点问题
     *
     * 该接口用于删除热点问题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHotQuestionRequest 请求对象
     * @return DeleteHotQuestionResponse
     */
    public DeleteHotQuestionResponse deleteHotQuestion(DeleteHotQuestionRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.deleteHotQuestion);
    }

    /**
     * 删除热点问题
     *
     * 该接口用于删除热点问题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHotQuestionRequest 请求对象
     * @return SyncInvoker<DeleteHotQuestionRequest, DeleteHotQuestionResponse>
     */
    public SyncInvoker<DeleteHotQuestionRequest, DeleteHotQuestionResponse> deleteHotQuestionInvoker(
        DeleteHotQuestionRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.deleteHotQuestion, hcClient);
    }

    /**
     * 查询热点问题列表
     *
     * 该接口用于查询热点问题列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHotQuestionRequest 请求对象
     * @return ListHotQuestionResponse
     */
    public ListHotQuestionResponse listHotQuestion(ListHotQuestionRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.listHotQuestion);
    }

    /**
     * 查询热点问题列表
     *
     * 该接口用于查询热点问题列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHotQuestionRequest 请求对象
     * @return SyncInvoker<ListHotQuestionRequest, ListHotQuestionResponse>
     */
    public SyncInvoker<ListHotQuestionRequest, ListHotQuestionResponse> listHotQuestionInvoker(
        ListHotQuestionRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.listHotQuestion, hcClient);
    }

    /**
     * 查询热点问题详情
     *
     * 该接口用于查询热点问题详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHotQuestionRequest 请求对象
     * @return ShowHotQuestionResponse
     */
    public ShowHotQuestionResponse showHotQuestion(ShowHotQuestionRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.showHotQuestion);
    }

    /**
     * 查询热点问题详情
     *
     * 该接口用于查询热点问题详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHotQuestionRequest 请求对象
     * @return SyncInvoker<ShowHotQuestionRequest, ShowHotQuestionResponse>
     */
    public SyncInvoker<ShowHotQuestionRequest, ShowHotQuestionResponse> showHotQuestionInvoker(
        ShowHotQuestionRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.showHotQuestion, hcClient);
    }

    /**
     * 修改热点问题
     *
     * 该接口用于修改热点问题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHotQuestionRequest 请求对象
     * @return UpdateHotQuestionResponse
     */
    public UpdateHotQuestionResponse updateHotQuestion(UpdateHotQuestionRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.updateHotQuestion);
    }

    /**
     * 修改热点问题
     *
     * 该接口用于修改热点问题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHotQuestionRequest 请求对象
     * @return SyncInvoker<UpdateHotQuestionRequest, UpdateHotQuestionResponse>
     */
    public SyncInvoker<UpdateHotQuestionRequest, UpdateHotQuestionResponse> updateHotQuestionInvoker(
        UpdateHotQuestionRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.updateHotQuestion, hcClient);
    }

    /**
     * 创建热词记录
     *
     * 该接口用于创建热词记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHotWordsRequest 请求对象
     * @return CreateHotWordsResponse
     */
    public CreateHotWordsResponse createHotWords(CreateHotWordsRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.createHotWords);
    }

    /**
     * 创建热词记录
     *
     * 该接口用于创建热词记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHotWordsRequest 请求对象
     * @return SyncInvoker<CreateHotWordsRequest, CreateHotWordsResponse>
     */
    public SyncInvoker<CreateHotWordsRequest, CreateHotWordsResponse> createHotWordsInvoker(
        CreateHotWordsRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.createHotWords, hcClient);
    }

    /**
     * 删除热词记录
     *
     * 该接口用于删除热词记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHotWordsRequest 请求对象
     * @return DeleteHotWordsResponse
     */
    public DeleteHotWordsResponse deleteHotWords(DeleteHotWordsRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.deleteHotWords);
    }

    /**
     * 删除热词记录
     *
     * 该接口用于删除热词记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHotWordsRequest 请求对象
     * @return SyncInvoker<DeleteHotWordsRequest, DeleteHotWordsResponse>
     */
    public SyncInvoker<DeleteHotWordsRequest, DeleteHotWordsResponse> deleteHotWordsInvoker(
        DeleteHotWordsRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.deleteHotWords, hcClient);
    }

    /**
     * 查询热词记录列表
     *
     * 该接口用于查询热词记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHotWordsRequest 请求对象
     * @return ListHotWordsResponse
     */
    public ListHotWordsResponse listHotWords(ListHotWordsRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.listHotWords);
    }

    /**
     * 查询热词记录列表
     *
     * 该接口用于查询热词记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHotWordsRequest 请求对象
     * @return SyncInvoker<ListHotWordsRequest, ListHotWordsResponse>
     */
    public SyncInvoker<ListHotWordsRequest, ListHotWordsResponse> listHotWordsInvoker(ListHotWordsRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.listHotWords, hcClient);
    }

    /**
     * 查询配置热词记录详情
     *
     * 该接口用于查询热词记录详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHotWordsRequest 请求对象
     * @return ShowHotWordsResponse
     */
    public ShowHotWordsResponse showHotWords(ShowHotWordsRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.showHotWords);
    }

    /**
     * 查询配置热词记录详情
     *
     * 该接口用于查询热词记录详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHotWordsRequest 请求对象
     * @return SyncInvoker<ShowHotWordsRequest, ShowHotWordsResponse>
     */
    public SyncInvoker<ShowHotWordsRequest, ShowHotWordsResponse> showHotWordsInvoker(ShowHotWordsRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.showHotWords, hcClient);
    }

    /**
     * 查询热词功能开关
     *
     * 该接口用于查询热词功能开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHotWordsSwitchRequest 请求对象
     * @return ShowHotWordsSwitchResponse
     */
    public ShowHotWordsSwitchResponse showHotWordsSwitch(ShowHotWordsSwitchRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.showHotWordsSwitch);
    }

    /**
     * 查询热词功能开关
     *
     * 该接口用于查询热词功能开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHotWordsSwitchRequest 请求对象
     * @return SyncInvoker<ShowHotWordsSwitchRequest, ShowHotWordsSwitchResponse>
     */
    public SyncInvoker<ShowHotWordsSwitchRequest, ShowHotWordsSwitchResponse> showHotWordsSwitchInvoker(
        ShowHotWordsSwitchRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.showHotWordsSwitch, hcClient);
    }

    /**
     * 修改热词记录
     *
     * 该接口用于修改热词记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHotWordsRequest 请求对象
     * @return UpdateHotWordsResponse
     */
    public UpdateHotWordsResponse updateHotWords(UpdateHotWordsRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.updateHotWords);
    }

    /**
     * 修改热词记录
     *
     * 该接口用于修改热词记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHotWordsRequest 请求对象
     * @return SyncInvoker<UpdateHotWordsRequest, UpdateHotWordsResponse>
     */
    public SyncInvoker<UpdateHotWordsRequest, UpdateHotWordsResponse> updateHotWordsInvoker(
        UpdateHotWordsRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.updateHotWords, hcClient);
    }

    /**
     * 修改热词功能开关
     *
     * 该接口用于修改热词功能开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHotWordsSwitchRequest 请求对象
     * @return UpdateHotWordsSwitchResponse
     */
    public UpdateHotWordsSwitchResponse updateHotWordsSwitch(UpdateHotWordsSwitchRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.updateHotWordsSwitch);
    }

    /**
     * 修改热词功能开关
     *
     * 该接口用于修改热词功能开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHotWordsSwitchRequest 请求对象
     * @return SyncInvoker<UpdateHotWordsSwitchRequest, UpdateHotWordsSwitchResponse>
     */
    public SyncInvoker<UpdateHotWordsSwitchRequest, UpdateHotWordsSwitchResponse> updateHotWordsSwitchInvoker(
        UpdateHotWordsSwitchRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.updateHotWordsSwitch, hcClient);
    }

    /**
     * 创建知识库意图和问法
     *
     * 该接口用于创建知识库意图和问法。一个意图包含一个主题，一个答案，若干个问法等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIntentAndQuestionRequest 请求对象
     * @return CreateIntentAndQuestionResponse
     */
    public CreateIntentAndQuestionResponse createIntentAndQuestion(CreateIntentAndQuestionRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.createIntentAndQuestion);
    }

    /**
     * 创建知识库意图和问法
     *
     * 该接口用于创建知识库意图和问法。一个意图包含一个主题，一个答案，若干个问法等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIntentAndQuestionRequest 请求对象
     * @return SyncInvoker<CreateIntentAndQuestionRequest, CreateIntentAndQuestionResponse>
     */
    public SyncInvoker<CreateIntentAndQuestionRequest, CreateIntentAndQuestionResponse> createIntentAndQuestionInvoker(
        CreateIntentAndQuestionRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.createIntentAndQuestion, hcClient);
    }

    /**
     * 创建知识库意图
     *
     * 该接口用于创建知识库意图。一个意图包含一个主题，一个答案，若干个问法等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKnowledgeIntentRequest 请求对象
     * @return CreateKnowledgeIntentResponse
     */
    public CreateKnowledgeIntentResponse createKnowledgeIntent(CreateKnowledgeIntentRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.createKnowledgeIntent);
    }

    /**
     * 创建知识库意图
     *
     * 该接口用于创建知识库意图。一个意图包含一个主题，一个答案，若干个问法等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKnowledgeIntentRequest 请求对象
     * @return SyncInvoker<CreateKnowledgeIntentRequest, CreateKnowledgeIntentResponse>
     */
    public SyncInvoker<CreateKnowledgeIntentRequest, CreateKnowledgeIntentResponse> createKnowledgeIntentInvoker(
        CreateKnowledgeIntentRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.createKnowledgeIntent, hcClient);
    }

    /**
     * 删除知识库意图
     *
     * 该接口用于删除知识库意图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKnowledgeIntentRequest 请求对象
     * @return DeleteKnowledgeIntentResponse
     */
    public DeleteKnowledgeIntentResponse deleteKnowledgeIntent(DeleteKnowledgeIntentRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.deleteKnowledgeIntent);
    }

    /**
     * 删除知识库意图
     *
     * 该接口用于删除知识库意图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKnowledgeIntentRequest 请求对象
     * @return SyncInvoker<DeleteKnowledgeIntentRequest, DeleteKnowledgeIntentResponse>
     */
    public SyncInvoker<DeleteKnowledgeIntentRequest, DeleteKnowledgeIntentResponse> deleteKnowledgeIntentInvoker(
        DeleteKnowledgeIntentRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.deleteKnowledgeIntent, hcClient);
    }

    /**
     * 查询知识库意图列表
     *
     * 该接口用于查询知识库意图列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKnowledgeIntentRequest 请求对象
     * @return ListKnowledgeIntentResponse
     */
    public ListKnowledgeIntentResponse listKnowledgeIntent(ListKnowledgeIntentRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.listKnowledgeIntent);
    }

    /**
     * 查询知识库意图列表
     *
     * 该接口用于查询知识库意图列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKnowledgeIntentRequest 请求对象
     * @return SyncInvoker<ListKnowledgeIntentRequest, ListKnowledgeIntentResponse>
     */
    public SyncInvoker<ListKnowledgeIntentRequest, ListKnowledgeIntentResponse> listKnowledgeIntentInvoker(
        ListKnowledgeIntentRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.listKnowledgeIntent, hcClient);
    }

    /**
     * 查询知识库意图详情
     *
     * 该接口用于查询知识库意图详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKnowledgeIntentRequest 请求对象
     * @return ShowKnowledgeIntentResponse
     */
    public ShowKnowledgeIntentResponse showKnowledgeIntent(ShowKnowledgeIntentRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.showKnowledgeIntent);
    }

    /**
     * 查询知识库意图详情
     *
     * 该接口用于查询知识库意图详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKnowledgeIntentRequest 请求对象
     * @return SyncInvoker<ShowKnowledgeIntentRequest, ShowKnowledgeIntentResponse>
     */
    public SyncInvoker<ShowKnowledgeIntentRequest, ShowKnowledgeIntentResponse> showKnowledgeIntentInvoker(
        ShowKnowledgeIntentRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.showKnowledgeIntent, hcClient);
    }

    /**
     * 修改知识库意图
     *
     * 该接口用于修改知识库意图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKnowledgeIntentRequest 请求对象
     * @return UpdateKnowledgeIntentResponse
     */
    public UpdateKnowledgeIntentResponse updateKnowledgeIntent(UpdateKnowledgeIntentRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.updateKnowledgeIntent);
    }

    /**
     * 修改知识库意图
     *
     * 该接口用于修改知识库意图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKnowledgeIntentRequest 请求对象
     * @return SyncInvoker<UpdateKnowledgeIntentRequest, UpdateKnowledgeIntentResponse>
     */
    public SyncInvoker<UpdateKnowledgeIntentRequest, UpdateKnowledgeIntentResponse> updateKnowledgeIntentInvoker(
        UpdateKnowledgeIntentRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.updateKnowledgeIntent, hcClient);
    }

    /**
     * 批量创建知识库问法
     *
     * 该接口用于批量创建知识库问法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBatchKnowledgeQuestionRequest 请求对象
     * @return CreateBatchKnowledgeQuestionResponse
     */
    public CreateBatchKnowledgeQuestionResponse createBatchKnowledgeQuestion(
        CreateBatchKnowledgeQuestionRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.createBatchKnowledgeQuestion);
    }

    /**
     * 批量创建知识库问法
     *
     * 该接口用于批量创建知识库问法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBatchKnowledgeQuestionRequest 请求对象
     * @return SyncInvoker<CreateBatchKnowledgeQuestionRequest, CreateBatchKnowledgeQuestionResponse>
     */
    public SyncInvoker<CreateBatchKnowledgeQuestionRequest, CreateBatchKnowledgeQuestionResponse> createBatchKnowledgeQuestionInvoker(
        CreateBatchKnowledgeQuestionRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.createBatchKnowledgeQuestion, hcClient);
    }

    /**
     * 创建知识库问法
     *
     * 该接口用于创建知识库问法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKnowledgeQuestionRequest 请求对象
     * @return CreateKnowledgeQuestionResponse
     */
    public CreateKnowledgeQuestionResponse createKnowledgeQuestion(CreateKnowledgeQuestionRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.createKnowledgeQuestion);
    }

    /**
     * 创建知识库问法
     *
     * 该接口用于创建知识库问法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKnowledgeQuestionRequest 请求对象
     * @return SyncInvoker<CreateKnowledgeQuestionRequest, CreateKnowledgeQuestionResponse>
     */
    public SyncInvoker<CreateKnowledgeQuestionRequest, CreateKnowledgeQuestionResponse> createKnowledgeQuestionInvoker(
        CreateKnowledgeQuestionRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.createKnowledgeQuestion, hcClient);
    }

    /**
     * 删除知识库问法
     *
     * 该接口用于删除知识库问法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKnowledgeQuestionRequest 请求对象
     * @return DeleteKnowledgeQuestionResponse
     */
    public DeleteKnowledgeQuestionResponse deleteKnowledgeQuestion(DeleteKnowledgeQuestionRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.deleteKnowledgeQuestion);
    }

    /**
     * 删除知识库问法
     *
     * 该接口用于删除知识库问法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKnowledgeQuestionRequest 请求对象
     * @return SyncInvoker<DeleteKnowledgeQuestionRequest, DeleteKnowledgeQuestionResponse>
     */
    public SyncInvoker<DeleteKnowledgeQuestionRequest, DeleteKnowledgeQuestionResponse> deleteKnowledgeQuestionInvoker(
        DeleteKnowledgeQuestionRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.deleteKnowledgeQuestion, hcClient);
    }

    /**
     * 查询知识库问法列表
     *
     * 该接口用于查询知识库问法列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKnowledgeQuestionRequest 请求对象
     * @return ListKnowledgeQuestionResponse
     */
    public ListKnowledgeQuestionResponse listKnowledgeQuestion(ListKnowledgeQuestionRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.listKnowledgeQuestion);
    }

    /**
     * 查询知识库问法列表
     *
     * 该接口用于查询知识库问法列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKnowledgeQuestionRequest 请求对象
     * @return SyncInvoker<ListKnowledgeQuestionRequest, ListKnowledgeQuestionResponse>
     */
    public SyncInvoker<ListKnowledgeQuestionRequest, ListKnowledgeQuestionResponse> listKnowledgeQuestionInvoker(
        ListKnowledgeQuestionRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.listKnowledgeQuestion, hcClient);
    }

    /**
     * 查询知识库问法详情
     *
     * 该接口用于查询知识库问法详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKnowledgeQuestionRequest 请求对象
     * @return ShowKnowledgeQuestionResponse
     */
    public ShowKnowledgeQuestionResponse showKnowledgeQuestion(ShowKnowledgeQuestionRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.showKnowledgeQuestion);
    }

    /**
     * 查询知识库问法详情
     *
     * 该接口用于查询知识库问法详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKnowledgeQuestionRequest 请求对象
     * @return SyncInvoker<ShowKnowledgeQuestionRequest, ShowKnowledgeQuestionResponse>
     */
    public SyncInvoker<ShowKnowledgeQuestionRequest, ShowKnowledgeQuestionResponse> showKnowledgeQuestionInvoker(
        ShowKnowledgeQuestionRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.showKnowledgeQuestion, hcClient);
    }

    /**
     * 批量修改知识库问法
     *
     * 该接口用于批量修改知识库问法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBatchKnowledgeQuestionRequest 请求对象
     * @return UpdateBatchKnowledgeQuestionResponse
     */
    public UpdateBatchKnowledgeQuestionResponse updateBatchKnowledgeQuestion(
        UpdateBatchKnowledgeQuestionRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.updateBatchKnowledgeQuestion);
    }

    /**
     * 批量修改知识库问法
     *
     * 该接口用于批量修改知识库问法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBatchKnowledgeQuestionRequest 请求对象
     * @return SyncInvoker<UpdateBatchKnowledgeQuestionRequest, UpdateBatchKnowledgeQuestionResponse>
     */
    public SyncInvoker<UpdateBatchKnowledgeQuestionRequest, UpdateBatchKnowledgeQuestionResponse> updateBatchKnowledgeQuestionInvoker(
        UpdateBatchKnowledgeQuestionRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.updateBatchKnowledgeQuestion, hcClient);
    }

    /**
     * 修改知识库问法
     *
     * 该接口用于修改知识库问法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKnowledgeQuestionRequest 请求对象
     * @return UpdateKnowledgeQuestionResponse
     */
    public UpdateKnowledgeQuestionResponse updateKnowledgeQuestion(UpdateKnowledgeQuestionRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.updateKnowledgeQuestion);
    }

    /**
     * 修改知识库问法
     *
     * 该接口用于修改知识库问法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKnowledgeQuestionRequest 请求对象
     * @return SyncInvoker<UpdateKnowledgeQuestionRequest, UpdateKnowledgeQuestionResponse>
     */
    public SyncInvoker<UpdateKnowledgeQuestionRequest, UpdateKnowledgeQuestionResponse> updateKnowledgeQuestionInvoker(
        UpdateKnowledgeQuestionRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.updateKnowledgeQuestion, hcClient);
    }

    /**
     * 创建知识库技能
     *
     * 该接口用于创建知识库技能。一个技能用于特定场景的交互问答，包含若干个意图等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKnowledgeSkillRequest 请求对象
     * @return CreateKnowledgeSkillResponse
     */
    public CreateKnowledgeSkillResponse createKnowledgeSkill(CreateKnowledgeSkillRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.createKnowledgeSkill);
    }

    /**
     * 创建知识库技能
     *
     * 该接口用于创建知识库技能。一个技能用于特定场景的交互问答，包含若干个意图等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKnowledgeSkillRequest 请求对象
     * @return SyncInvoker<CreateKnowledgeSkillRequest, CreateKnowledgeSkillResponse>
     */
    public SyncInvoker<CreateKnowledgeSkillRequest, CreateKnowledgeSkillResponse> createKnowledgeSkillInvoker(
        CreateKnowledgeSkillRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.createKnowledgeSkill, hcClient);
    }

    /**
     * 删除知识库技能
     *
     * 该接口用于删除知识库技能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKnowledgeSkillRequest 请求对象
     * @return DeleteKnowledgeSkillResponse
     */
    public DeleteKnowledgeSkillResponse deleteKnowledgeSkill(DeleteKnowledgeSkillRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.deleteKnowledgeSkill);
    }

    /**
     * 删除知识库技能
     *
     * 该接口用于删除知识库技能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKnowledgeSkillRequest 请求对象
     * @return SyncInvoker<DeleteKnowledgeSkillRequest, DeleteKnowledgeSkillResponse>
     */
    public SyncInvoker<DeleteKnowledgeSkillRequest, DeleteKnowledgeSkillResponse> deleteKnowledgeSkillInvoker(
        DeleteKnowledgeSkillRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.deleteKnowledgeSkill, hcClient);
    }

    /**
     * 导出知识库技能
     *
     * 该接口用于导出知识库技能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportKnowledgeSkillRequest 请求对象
     * @return ExportKnowledgeSkillResponse
     */
    public ExportKnowledgeSkillResponse exportKnowledgeSkill(ExportKnowledgeSkillRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.exportKnowledgeSkill);
    }

    /**
     * 导出知识库技能
     *
     * 该接口用于导出知识库技能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportKnowledgeSkillRequest 请求对象
     * @return SyncInvoker<ExportKnowledgeSkillRequest, ExportKnowledgeSkillResponse>
     */
    public SyncInvoker<ExportKnowledgeSkillRequest, ExportKnowledgeSkillResponse> exportKnowledgeSkillInvoker(
        ExportKnowledgeSkillRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.exportKnowledgeSkill, hcClient);
    }

    /**
     * 查询知识库技能列表
     *
     * 该接口用于查询知识库技能列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKnowledgeSkillRequest 请求对象
     * @return ListKnowledgeSkillResponse
     */
    public ListKnowledgeSkillResponse listKnowledgeSkill(ListKnowledgeSkillRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.listKnowledgeSkill);
    }

    /**
     * 查询知识库技能列表
     *
     * 该接口用于查询知识库技能列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKnowledgeSkillRequest 请求对象
     * @return SyncInvoker<ListKnowledgeSkillRequest, ListKnowledgeSkillResponse>
     */
    public SyncInvoker<ListKnowledgeSkillRequest, ListKnowledgeSkillResponse> listKnowledgeSkillInvoker(
        ListKnowledgeSkillRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.listKnowledgeSkill, hcClient);
    }

    /**
     * 查询知识库技能详情
     *
     * 该接口用于查询知识库技能详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKnowledgeSkillRequest 请求对象
     * @return ShowKnowledgeSkillResponse
     */
    public ShowKnowledgeSkillResponse showKnowledgeSkill(ShowKnowledgeSkillRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.showKnowledgeSkill);
    }

    /**
     * 查询知识库技能详情
     *
     * 该接口用于查询知识库技能详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKnowledgeSkillRequest 请求对象
     * @return SyncInvoker<ShowKnowledgeSkillRequest, ShowKnowledgeSkillResponse>
     */
    public SyncInvoker<ShowKnowledgeSkillRequest, ShowKnowledgeSkillResponse> showKnowledgeSkillInvoker(
        ShowKnowledgeSkillRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.showKnowledgeSkill, hcClient);
    }

    /**
     * 修改知识库技能
     *
     * 该接口用于修改知识库技能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKnowledgeSkillRequest 请求对象
     * @return UpdateKnowledgeSkillResponse
     */
    public UpdateKnowledgeSkillResponse updateKnowledgeSkill(UpdateKnowledgeSkillRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.updateKnowledgeSkill);
    }

    /**
     * 修改知识库技能
     *
     * 该接口用于修改知识库技能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKnowledgeSkillRequest 请求对象
     * @return SyncInvoker<UpdateKnowledgeSkillRequest, UpdateKnowledgeSkillResponse>
     */
    public SyncInvoker<UpdateKnowledgeSkillRequest, UpdateKnowledgeSkillResponse> updateKnowledgeSkillInvoker(
        UpdateKnowledgeSkillRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.updateKnowledgeSkill, hcClient);
    }

    /**
     * 创建一次性鉴权码
     *
     * 该接口用于创建一次性鉴权码，有效期5分钟，鉴权码只能使用一次，每次使用后需要重新获取。
     * &gt; 接口只能通过第三方后台调用，不能在浏览器前台直接调用，否则会有跨域问题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOnceCodeRequest 请求对象
     * @return CreateOnceCodeResponse
     */
    public CreateOnceCodeResponse createOnceCode(CreateOnceCodeRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.createOnceCode);
    }

    /**
     * 创建一次性鉴权码
     *
     * 该接口用于创建一次性鉴权码，有效期5分钟，鉴权码只能使用一次，每次使用后需要重新获取。
     * &gt; 接口只能通过第三方后台调用，不能在浏览器前台直接调用，否则会有跨域问题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOnceCodeRequest 请求对象
     * @return SyncInvoker<CreateOnceCodeRequest, CreateOnceCodeResponse>
     */
    public SyncInvoker<CreateOnceCodeRequest, CreateOnceCodeResponse> createOnceCodeInvoker(
        CreateOnceCodeRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.createOnceCode, hcClient);
    }

    /**
     * 基于图片URL创建照片建模任务
     *
     * 该接口用于从URL中获取图片进行照片建模任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePictureModelingByUrlJobRequest 请求对象
     * @return CreatePictureModelingByUrlJobResponse
     */
    public CreatePictureModelingByUrlJobResponse createPictureModelingByUrlJob(
        CreatePictureModelingByUrlJobRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.createPictureModelingByUrlJob);
    }

    /**
     * 基于图片URL创建照片建模任务
     *
     * 该接口用于从URL中获取图片进行照片建模任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePictureModelingByUrlJobRequest 请求对象
     * @return SyncInvoker<CreatePictureModelingByUrlJobRequest, CreatePictureModelingByUrlJobResponse>
     */
    public SyncInvoker<CreatePictureModelingByUrlJobRequest, CreatePictureModelingByUrlJobResponse> createPictureModelingByUrlJobInvoker(
        CreatePictureModelingByUrlJobRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.createPictureModelingByUrlJob, hcClient);
    }

    /**
     * 创建照片建模任务
     *
     * 该接口用于创建风格化照片建模任务。通过上传照片，生成风格化数字人模型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePictureModelingJobRequest 请求对象
     * @return CreatePictureModelingJobResponse
     */
    public CreatePictureModelingJobResponse createPictureModelingJob(CreatePictureModelingJobRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.createPictureModelingJob);
    }

    /**
     * 创建照片建模任务
     *
     * 该接口用于创建风格化照片建模任务。通过上传照片，生成风格化数字人模型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePictureModelingJobRequest 请求对象
     * @return SyncInvoker<CreatePictureModelingJobRequest, CreatePictureModelingJobResponse>
     */
    public SyncInvoker<CreatePictureModelingJobRequest, CreatePictureModelingJobResponse> createPictureModelingJobInvoker(
        CreatePictureModelingJobRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.createPictureModelingJob, hcClient);
    }

    /**
     * 照片建模任务列表查询
     *
     * 该接口用于查询风格化照片建模任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPictureModelingJobsRequest 请求对象
     * @return ListPictureModelingJobsResponse
     */
    public ListPictureModelingJobsResponse listPictureModelingJobs(ListPictureModelingJobsRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.listPictureModelingJobs);
    }

    /**
     * 照片建模任务列表查询
     *
     * 该接口用于查询风格化照片建模任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPictureModelingJobsRequest 请求对象
     * @return SyncInvoker<ListPictureModelingJobsRequest, ListPictureModelingJobsResponse>
     */
    public SyncInvoker<ListPictureModelingJobsRequest, ListPictureModelingJobsResponse> listPictureModelingJobsInvoker(
        ListPictureModelingJobsRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.listPictureModelingJobs, hcClient);
    }

    /**
     * 照片建模任务详情查询
     *
     * 该接口用于风格化查询照片建模任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPictureModelingJobRequest 请求对象
     * @return ShowPictureModelingJobResponse
     */
    public ShowPictureModelingJobResponse showPictureModelingJob(ShowPictureModelingJobRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.showPictureModelingJob);
    }

    /**
     * 照片建模任务详情查询
     *
     * 该接口用于风格化查询照片建模任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPictureModelingJobRequest 请求对象
     * @return SyncInvoker<ShowPictureModelingJobRequest, ShowPictureModelingJobResponse>
     */
    public SyncInvoker<ShowPictureModelingJobRequest, ShowPictureModelingJobResponse> showPictureModelingJobInvoker(
        ShowPictureModelingJobRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.showPictureModelingJob, hcClient);
    }

    /**
     * 创建商品
     *
     * Create product
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProductRequest 请求对象
     * @return CreateProductResponse
     */
    public CreateProductResponse createProduct(CreateProductRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.createProduct);
    }

    /**
     * 创建商品
     *
     * Create product
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProductRequest 请求对象
     * @return SyncInvoker<CreateProductRequest, CreateProductResponse>
     */
    public SyncInvoker<CreateProductRequest, CreateProductResponse> createProductInvoker(CreateProductRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.createProduct, hcClient);
    }

    /**
     * 删除商品
     *
     * 删除商品
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProductRequest 请求对象
     * @return DeleteProductResponse
     */
    public DeleteProductResponse deleteProduct(DeleteProductRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.deleteProduct);
    }

    /**
     * 删除商品
     *
     * 删除商品
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProductRequest 请求对象
     * @return SyncInvoker<DeleteProductRequest, DeleteProductResponse>
     */
    public SyncInvoker<DeleteProductRequest, DeleteProductResponse> deleteProductInvoker(DeleteProductRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.deleteProduct, hcClient);
    }

    /**
     * 查询商品列表
     *
     * 查询商品列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductsRequest 请求对象
     * @return ListProductsResponse
     */
    public ListProductsResponse listProducts(ListProductsRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.listProducts);
    }

    /**
     * 查询商品列表
     *
     * 查询商品列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductsRequest 请求对象
     * @return SyncInvoker<ListProductsRequest, ListProductsResponse>
     */
    public SyncInvoker<ListProductsRequest, ListProductsResponse> listProductsInvoker(ListProductsRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.listProducts, hcClient);
    }

    /**
     * 商品资产组合配置
     *
     * 商品资产组合配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetProductAssetRequest 请求对象
     * @return SetProductAssetResponse
     */
    public SetProductAssetResponse setProductAsset(SetProductAssetRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.setProductAsset);
    }

    /**
     * 商品资产组合配置
     *
     * 商品资产组合配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetProductAssetRequest 请求对象
     * @return SyncInvoker<SetProductAssetRequest, SetProductAssetResponse>
     */
    public SyncInvoker<SetProductAssetRequest, SetProductAssetResponse> setProductAssetInvoker(
        SetProductAssetRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.setProductAsset, hcClient);
    }

    /**
     * 查询商品详情
     *
     * Show product
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProductRequest 请求对象
     * @return ShowProductResponse
     */
    public ShowProductResponse showProduct(ShowProductRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.showProduct);
    }

    /**
     * 查询商品详情
     *
     * Show product
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProductRequest 请求对象
     * @return SyncInvoker<ShowProductRequest, ShowProductResponse>
     */
    public SyncInvoker<ShowProductRequest, ShowProductResponse> showProductInvoker(ShowProductRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.showProduct, hcClient);
    }

    /**
     * 更新商品
     *
     * Update product
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProductRequest 请求对象
     * @return UpdateProductResponse
     */
    public UpdateProductResponse updateProduct(UpdateProductRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.updateProduct);
    }

    /**
     * 更新商品
     *
     * Update product
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProductRequest 请求对象
     * @return SyncInvoker<UpdateProductRequest, UpdateProductResponse>
     */
    public SyncInvoker<UpdateProductRequest, UpdateProductResponse> updateProductInvoker(UpdateProductRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.updateProduct, hcClient);
    }

    /**
     * 创建应用
     *
     * 该接口用于创建应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRobotRequest 请求对象
     * @return CreateRobotResponse
     */
    public CreateRobotResponse createRobot(CreateRobotRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.createRobot);
    }

    /**
     * 创建应用
     *
     * 该接口用于创建应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRobotRequest 请求对象
     * @return SyncInvoker<CreateRobotRequest, CreateRobotResponse>
     */
    public SyncInvoker<CreateRobotRequest, CreateRobotResponse> createRobotInvoker(CreateRobotRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.createRobot, hcClient);
    }

    /**
     * 删除应用
     *
     * 该接口用于删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRobotRequest 请求对象
     * @return DeleteRobotResponse
     */
    public DeleteRobotResponse deleteRobot(DeleteRobotRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.deleteRobot);
    }

    /**
     * 删除应用
     *
     * 该接口用于删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRobotRequest 请求对象
     * @return SyncInvoker<DeleteRobotRequest, DeleteRobotResponse>
     */
    public SyncInvoker<DeleteRobotRequest, DeleteRobotResponse> deleteRobotInvoker(DeleteRobotRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.deleteRobot, hcClient);
    }

    /**
     * 查询应用列表
     *
     * 该接口用于查询应用列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRobotRequest 请求对象
     * @return ListRobotResponse
     */
    public ListRobotResponse listRobot(ListRobotRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.listRobot);
    }

    /**
     * 查询应用列表
     *
     * 该接口用于查询应用列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRobotRequest 请求对象
     * @return SyncInvoker<ListRobotRequest, ListRobotResponse>
     */
    public SyncInvoker<ListRobotRequest, ListRobotResponse> listRobotInvoker(ListRobotRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.listRobot, hcClient);
    }

    /**
     * 查询应用详情
     *
     * 该接口用于查询应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRobotRequest 请求对象
     * @return ShowRobotResponse
     */
    public ShowRobotResponse showRobot(ShowRobotRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.showRobot);
    }

    /**
     * 查询应用详情
     *
     * 该接口用于查询应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRobotRequest 请求对象
     * @return SyncInvoker<ShowRobotRequest, ShowRobotResponse>
     */
    public SyncInvoker<ShowRobotRequest, ShowRobotResponse> showRobotInvoker(ShowRobotRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.showRobot, hcClient);
    }

    /**
     * 修改应用
     *
     * 该接口用于修改应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRobotRequest 请求对象
     * @return UpdateRobotResponse
     */
    public UpdateRobotResponse updateRobot(UpdateRobotRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.updateRobot);
    }

    /**
     * 修改应用
     *
     * 该接口用于修改应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRobotRequest 请求对象
     * @return SyncInvoker<UpdateRobotRequest, UpdateRobotResponse>
     */
    public SyncInvoker<UpdateRobotRequest, UpdateRobotResponse> updateRobotInvoker(UpdateRobotRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.updateRobot, hcClient);
    }

    /**
     * 校验应用
     *
     * 该接口用于校验应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateRobotRequest 请求对象
     * @return ValidateRobotResponse
     */
    public ValidateRobotResponse validateRobot(ValidateRobotRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.validateRobot);
    }

    /**
     * 校验应用
     *
     * 该接口用于校验应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateRobotRequest 请求对象
     * @return SyncInvoker<ValidateRobotRequest, ValidateRobotResponse>
     */
    public SyncInvoker<ValidateRobotRequest, ValidateRobotResponse> validateRobotInvoker(ValidateRobotRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.validateRobot, hcClient);
    }

    /**
     * 创建智能交互对话
     *
     * 该接口用于创建智能交互对话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSmartChatRoomRequest 请求对象
     * @return CreateSmartChatRoomResponse
     */
    public CreateSmartChatRoomResponse createSmartChatRoom(CreateSmartChatRoomRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.createSmartChatRoom);
    }

    /**
     * 创建智能交互对话
     *
     * 该接口用于创建智能交互对话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSmartChatRoomRequest 请求对象
     * @return SyncInvoker<CreateSmartChatRoomRequest, CreateSmartChatRoomResponse>
     */
    public SyncInvoker<CreateSmartChatRoomRequest, CreateSmartChatRoomResponse> createSmartChatRoomInvoker(
        CreateSmartChatRoomRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.createSmartChatRoom, hcClient);
    }

    /**
     * 删除智能交互对话
     *
     * 该接口用于删除智能交互对话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSmartChatRoomRequest 请求对象
     * @return DeleteSmartChatRoomResponse
     */
    public DeleteSmartChatRoomResponse deleteSmartChatRoom(DeleteSmartChatRoomRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.deleteSmartChatRoom);
    }

    /**
     * 删除智能交互对话
     *
     * 该接口用于删除智能交互对话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSmartChatRoomRequest 请求对象
     * @return SyncInvoker<DeleteSmartChatRoomRequest, DeleteSmartChatRoomResponse>
     */
    public SyncInvoker<DeleteSmartChatRoomRequest, DeleteSmartChatRoomResponse> deleteSmartChatRoomInvoker(
        DeleteSmartChatRoomRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.deleteSmartChatRoom, hcClient);
    }

    /**
     * 查询智能交互对话列表
     *
     * 该接口用于智能交互对话列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSmartChatRoomsRequest 请求对象
     * @return ListSmartChatRoomsResponse
     */
    public ListSmartChatRoomsResponse listSmartChatRooms(ListSmartChatRoomsRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.listSmartChatRooms);
    }

    /**
     * 查询智能交互对话列表
     *
     * 该接口用于智能交互对话列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSmartChatRoomsRequest 请求对象
     * @return SyncInvoker<ListSmartChatRoomsRequest, ListSmartChatRoomsResponse>
     */
    public SyncInvoker<ListSmartChatRoomsRequest, ListSmartChatRoomsResponse> listSmartChatRoomsInvoker(
        ListSmartChatRoomsRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.listSmartChatRooms, hcClient);
    }

    /**
     * 查询智能交互对话详情
     *
     * 该接口用于查询智能交互对话详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSmartChatRoomRequest 请求对象
     * @return ShowSmartChatRoomResponse
     */
    public ShowSmartChatRoomResponse showSmartChatRoom(ShowSmartChatRoomRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.showSmartChatRoom);
    }

    /**
     * 查询智能交互对话详情
     *
     * 该接口用于查询智能交互对话详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSmartChatRoomRequest 请求对象
     * @return SyncInvoker<ShowSmartChatRoomRequest, ShowSmartChatRoomResponse>
     */
    public SyncInvoker<ShowSmartChatRoomRequest, ShowSmartChatRoomResponse> showSmartChatRoomInvoker(
        ShowSmartChatRoomRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.showSmartChatRoom, hcClient);
    }

    /**
     * 更新智能交互对话信息
     *
     * 该接口用于智能交互对话信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSmartChatRoomRequest 请求对象
     * @return UpdateSmartChatRoomResponse
     */
    public UpdateSmartChatRoomResponse updateSmartChatRoom(UpdateSmartChatRoomRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.updateSmartChatRoom);
    }

    /**
     * 更新智能交互对话信息
     *
     * 该接口用于智能交互对话信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSmartChatRoomRequest 请求对象
     * @return SyncInvoker<UpdateSmartChatRoomRequest, UpdateSmartChatRoomResponse>
     */
    public SyncInvoker<UpdateSmartChatRoomRequest, UpdateSmartChatRoomResponse> updateSmartChatRoomInvoker(
        UpdateSmartChatRoomRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.updateSmartChatRoom, hcClient);
    }

    /**
     * 控制数字人直播过程
     *
     * 该接口用于控制数字人直播过程。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteSmartLiveCommandRequest 请求对象
     * @return ExecuteSmartLiveCommandResponse
     */
    public ExecuteSmartLiveCommandResponse executeSmartLiveCommand(ExecuteSmartLiveCommandRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.executeSmartLiveCommand);
    }

    /**
     * 控制数字人直播过程
     *
     * 该接口用于控制数字人直播过程。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteSmartLiveCommandRequest 请求对象
     * @return SyncInvoker<ExecuteSmartLiveCommandRequest, ExecuteSmartLiveCommandResponse>
     */
    public SyncInvoker<ExecuteSmartLiveCommandRequest, ExecuteSmartLiveCommandResponse> executeSmartLiveCommandInvoker(
        ExecuteSmartLiveCommandRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.executeSmartLiveCommand, hcClient);
    }

    /**
     * 查询某个智能直播间下直播任务列表
     *
     * 该接口用于查询某个智能直播间的直播任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSmartLiveRequest 请求对象
     * @return ListSmartLiveResponse
     */
    public ListSmartLiveResponse listSmartLive(ListSmartLiveRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.listSmartLive);
    }

    /**
     * 查询某个智能直播间下直播任务列表
     *
     * 该接口用于查询某个智能直播间的直播任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSmartLiveRequest 请求对象
     * @return SyncInvoker<ListSmartLiveRequest, ListSmartLiveResponse>
     */
    public SyncInvoker<ListSmartLiveRequest, ListSmartLiveResponse> listSmartLiveInvoker(ListSmartLiveRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.listSmartLive, hcClient);
    }

    /**
     * 查询租户所有数字人直播任务列表
     *
     * 该接口用于查询租户所有数字人智能直播任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSmartLiveJobsRequest 请求对象
     * @return ListSmartLiveJobsResponse
     */
    public ListSmartLiveJobsResponse listSmartLiveJobs(ListSmartLiveJobsRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.listSmartLiveJobs);
    }

    /**
     * 查询租户所有数字人直播任务列表
     *
     * 该接口用于查询租户所有数字人智能直播任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSmartLiveJobsRequest 请求对象
     * @return SyncInvoker<ListSmartLiveJobsRequest, ListSmartLiveJobsResponse>
     */
    public SyncInvoker<ListSmartLiveJobsRequest, ListSmartLiveJobsResponse> listSmartLiveJobsInvoker(
        ListSmartLiveJobsRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.listSmartLiveJobs, hcClient);
    }

    /**
     * 上报直播间事件
     *
     * 该接口用于上报直播间事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LiveEventReportRequest 请求对象
     * @return LiveEventReportResponse
     */
    public LiveEventReportResponse liveEventReport(LiveEventReportRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.liveEventReport);
    }

    /**
     * 上报直播间事件
     *
     * 该接口用于上报直播间事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LiveEventReportRequest 请求对象
     * @return SyncInvoker<LiveEventReportRequest, LiveEventReportResponse>
     */
    public SyncInvoker<LiveEventReportRequest, LiveEventReportResponse> liveEventReportInvoker(
        LiveEventReportRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.liveEventReport, hcClient);
    }

    /**
     * 查询数字人智能直播任务详情
     *
     * 该接口用于查询数字人智能直播任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSmartLiveRequest 请求对象
     * @return ShowSmartLiveResponse
     */
    public ShowSmartLiveResponse showSmartLive(ShowSmartLiveRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.showSmartLive);
    }

    /**
     * 查询数字人智能直播任务详情
     *
     * 该接口用于查询数字人智能直播任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSmartLiveRequest 请求对象
     * @return SyncInvoker<ShowSmartLiveRequest, ShowSmartLiveResponse>
     */
    public SyncInvoker<ShowSmartLiveRequest, ShowSmartLiveResponse> showSmartLiveInvoker(ShowSmartLiveRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.showSmartLive, hcClient);
    }

    /**
     * 启动数字人智能直播任务
     *
     * 该接口用于启动数字人智能直播任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartSmartLiveRequest 请求对象
     * @return StartSmartLiveResponse
     */
    public StartSmartLiveResponse startSmartLive(StartSmartLiveRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.startSmartLive);
    }

    /**
     * 启动数字人智能直播任务
     *
     * 该接口用于启动数字人智能直播任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartSmartLiveRequest 请求对象
     * @return SyncInvoker<StartSmartLiveRequest, StartSmartLiveResponse>
     */
    public SyncInvoker<StartSmartLiveRequest, StartSmartLiveResponse> startSmartLiveInvoker(
        StartSmartLiveRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.startSmartLive, hcClient);
    }

    /**
     * 结束数字人智能直播任务
     *
     * 该接口用于结束数字人智能直播任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopSmartLiveRequest 请求对象
     * @return StopSmartLiveResponse
     */
    public StopSmartLiveResponse stopSmartLive(StopSmartLiveRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.stopSmartLive);
    }

    /**
     * 结束数字人智能直播任务
     *
     * 该接口用于结束数字人智能直播任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopSmartLiveRequest 请求对象
     * @return SyncInvoker<StopSmartLiveRequest, StopSmartLiveResponse>
     */
    public SyncInvoker<StopSmartLiveRequest, StopSmartLiveResponse> stopSmartLiveInvoker(StopSmartLiveRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.stopSmartLive, hcClient);
    }

    /**
     * 创建智能直播间互动规则库
     *
     * 该接口用于创建智能直播间互动规则库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInteractionRuleGroupRequest 请求对象
     * @return CreateInteractionRuleGroupResponse
     */
    public CreateInteractionRuleGroupResponse createInteractionRuleGroup(CreateInteractionRuleGroupRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.createInteractionRuleGroup);
    }

    /**
     * 创建智能直播间互动规则库
     *
     * 该接口用于创建智能直播间互动规则库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInteractionRuleGroupRequest 请求对象
     * @return SyncInvoker<CreateInteractionRuleGroupRequest, CreateInteractionRuleGroupResponse>
     */
    public SyncInvoker<CreateInteractionRuleGroupRequest, CreateInteractionRuleGroupResponse> createInteractionRuleGroupInvoker(
        CreateInteractionRuleGroupRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.createInteractionRuleGroup, hcClient);
    }

    /**
     * 创建智能直播间
     *
     * 该接口用于创建智能直播间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSmartLiveRoomRequest 请求对象
     * @return CreateSmartLiveRoomResponse
     */
    public CreateSmartLiveRoomResponse createSmartLiveRoom(CreateSmartLiveRoomRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.createSmartLiveRoom);
    }

    /**
     * 创建智能直播间
     *
     * 该接口用于创建智能直播间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSmartLiveRoomRequest 请求对象
     * @return SyncInvoker<CreateSmartLiveRoomRequest, CreateSmartLiveRoomResponse>
     */
    public SyncInvoker<CreateSmartLiveRoomRequest, CreateSmartLiveRoomResponse> createSmartLiveRoomInvoker(
        CreateSmartLiveRoomRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.createSmartLiveRoom, hcClient);
    }

    /**
     * 删除智能直播间互动规则库
     *
     * 该接口用于删除智能直播间互动规则库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInteractionRuleGroupRequest 请求对象
     * @return DeleteInteractionRuleGroupResponse
     */
    public DeleteInteractionRuleGroupResponse deleteInteractionRuleGroup(DeleteInteractionRuleGroupRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.deleteInteractionRuleGroup);
    }

    /**
     * 删除智能直播间互动规则库
     *
     * 该接口用于删除智能直播间互动规则库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInteractionRuleGroupRequest 请求对象
     * @return SyncInvoker<DeleteInteractionRuleGroupRequest, DeleteInteractionRuleGroupResponse>
     */
    public SyncInvoker<DeleteInteractionRuleGroupRequest, DeleteInteractionRuleGroupResponse> deleteInteractionRuleGroupInvoker(
        DeleteInteractionRuleGroupRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.deleteInteractionRuleGroup, hcClient);
    }

    /**
     * 删除智能直播间
     *
     * 该接口用于删除智能直播间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSmartLiveRoomRequest 请求对象
     * @return DeleteSmartLiveRoomResponse
     */
    public DeleteSmartLiveRoomResponse deleteSmartLiveRoom(DeleteSmartLiveRoomRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.deleteSmartLiveRoom);
    }

    /**
     * 删除智能直播间
     *
     * 该接口用于删除智能直播间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSmartLiveRoomRequest 请求对象
     * @return SyncInvoker<DeleteSmartLiveRoomRequest, DeleteSmartLiveRoomResponse>
     */
    public SyncInvoker<DeleteSmartLiveRoomRequest, DeleteSmartLiveRoomResponse> deleteSmartLiveRoomInvoker(
        DeleteSmartLiveRoomRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.deleteSmartLiveRoom, hcClient);
    }

    /**
     * 查询智能直播间互动规则库列表
     *
     * 该接口用于智能直播间互动规则库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInteractionRuleGroupsRequest 请求对象
     * @return ListInteractionRuleGroupsResponse
     */
    public ListInteractionRuleGroupsResponse listInteractionRuleGroups(ListInteractionRuleGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.listInteractionRuleGroups);
    }

    /**
     * 查询智能直播间互动规则库列表
     *
     * 该接口用于智能直播间互动规则库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInteractionRuleGroupsRequest 请求对象
     * @return SyncInvoker<ListInteractionRuleGroupsRequest, ListInteractionRuleGroupsResponse>
     */
    public SyncInvoker<ListInteractionRuleGroupsRequest, ListInteractionRuleGroupsResponse> listInteractionRuleGroupsInvoker(
        ListInteractionRuleGroupsRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.listInteractionRuleGroups, hcClient);
    }

    /**
     * 查询智能直播间列表
     *
     * 该接口用于智能直播间列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSmartLiveRoomsRequest 请求对象
     * @return ListSmartLiveRoomsResponse
     */
    public ListSmartLiveRoomsResponse listSmartLiveRooms(ListSmartLiveRoomsRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.listSmartLiveRooms);
    }

    /**
     * 查询智能直播间列表
     *
     * 该接口用于智能直播间列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSmartLiveRoomsRequest 请求对象
     * @return SyncInvoker<ListSmartLiveRoomsRequest, ListSmartLiveRoomsResponse>
     */
    public SyncInvoker<ListSmartLiveRoomsRequest, ListSmartLiveRoomsResponse> listSmartLiveRoomsInvoker(
        ListSmartLiveRoomsRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.listSmartLiveRooms, hcClient);
    }

    /**
     * 查询智能直播剧本详情
     *
     * 该接口用于查询智能直播剧本详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSmartLiveRoomRequest 请求对象
     * @return ShowSmartLiveRoomResponse
     */
    public ShowSmartLiveRoomResponse showSmartLiveRoom(ShowSmartLiveRoomRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.showSmartLiveRoom);
    }

    /**
     * 查询智能直播剧本详情
     *
     * 该接口用于查询智能直播剧本详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSmartLiveRoomRequest 请求对象
     * @return SyncInvoker<ShowSmartLiveRoomRequest, ShowSmartLiveRoomResponse>
     */
    public SyncInvoker<ShowSmartLiveRoomRequest, ShowSmartLiveRoomResponse> showSmartLiveRoomInvoker(
        ShowSmartLiveRoomRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.showSmartLiveRoom, hcClient);
    }

    /**
     * 更新智能直播间互动规则库
     *
     * 该接口用于更新智能直播间互动规则库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInteractionRuleGroupRequest 请求对象
     * @return UpdateInteractionRuleGroupResponse
     */
    public UpdateInteractionRuleGroupResponse updateInteractionRuleGroup(UpdateInteractionRuleGroupRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.updateInteractionRuleGroup);
    }

    /**
     * 更新智能直播间互动规则库
     *
     * 该接口用于更新智能直播间互动规则库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInteractionRuleGroupRequest 请求对象
     * @return SyncInvoker<UpdateInteractionRuleGroupRequest, UpdateInteractionRuleGroupResponse>
     */
    public SyncInvoker<UpdateInteractionRuleGroupRequest, UpdateInteractionRuleGroupResponse> updateInteractionRuleGroupInvoker(
        UpdateInteractionRuleGroupRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.updateInteractionRuleGroup, hcClient);
    }

    /**
     * 更新智能直播间信息
     *
     * 该接口用于智能直播间信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSmartLiveRoomRequest 请求对象
     * @return UpdateSmartLiveRoomResponse
     */
    public UpdateSmartLiveRoomResponse updateSmartLiveRoom(UpdateSmartLiveRoomRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.updateSmartLiveRoom);
    }

    /**
     * 更新智能直播间信息
     *
     * 该接口用于智能直播间信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSmartLiveRoomRequest 请求对象
     * @return SyncInvoker<UpdateSmartLiveRoomRequest, UpdateSmartLiveRoomResponse>
     */
    public SyncInvoker<UpdateSmartLiveRoomRequest, UpdateSmartLiveRoomResponse> updateSmartLiveRoomInvoker(
        UpdateSmartLiveRoomRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.updateSmartLiveRoom, hcClient);
    }

    /**
     * 查询数字人风格列表
     *
     * 查询数字人风格列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStylesRequest 请求对象
     * @return ListStylesResponse
     */
    public ListStylesResponse listStyles(ListStylesRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.listStyles);
    }

    /**
     * 查询数字人风格列表
     *
     * 查询数字人风格列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStylesRequest 请求对象
     * @return SyncInvoker<ListStylesRequest, ListStylesResponse>
     */
    public SyncInvoker<ListStylesRequest, ListStylesResponse> listStylesInvoker(ListStylesRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.listStyles, hcClient);
    }

    /**
     * 统计时间段内过期的资源数量
     *
     * 统计指定时间段内即将过期的包周期与一次性资源数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountTenantResourcesRequest 请求对象
     * @return CountTenantResourcesResponse
     */
    public CountTenantResourcesResponse countTenantResources(CountTenantResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.countTenantResources);
    }

    /**
     * 统计时间段内过期的资源数量
     *
     * 统计指定时间段内即将过期的包周期与一次性资源数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountTenantResourcesRequest 请求对象
     * @return SyncInvoker<CountTenantResourcesRequest, CountTenantResourcesResponse>
     */
    public SyncInvoker<CountTenantResourcesRequest, CountTenantResourcesResponse> countTenantResourcesInvoker(
        CountTenantResourcesRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.countTenantResources, hcClient);
    }

    /**
     * 查看租户资源列表
     *
     * 查看租户资源列表。
     * &gt; 按需套餐包用量本接口无法查询，需要调用CBC接口查询。[按需套餐包用量查询](https://cbc.huaweicloud.com/bm/support/api-apidt/CBCInterface_0001239.html)和[查询资源包信息](https://cbc.huaweicloud.com/bm/support/api-apidt/CBCInterface_0000511.html)。
     * &gt; 各种资源的计费方式请参考[计费说明](https://support.huaweicloud.com/productdesc-metastudio/metastudio_01_0006.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantResourcesRequest 请求对象
     * @return ListTenantResourcesResponse
     */
    public ListTenantResourcesResponse listTenantResources(ListTenantResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.listTenantResources);
    }

    /**
     * 查看租户资源列表
     *
     * 查看租户资源列表。
     * &gt; 按需套餐包用量本接口无法查询，需要调用CBC接口查询。[按需套餐包用量查询](https://cbc.huaweicloud.com/bm/support/api-apidt/CBCInterface_0001239.html)和[查询资源包信息](https://cbc.huaweicloud.com/bm/support/api-apidt/CBCInterface_0000511.html)。
     * &gt; 各种资源的计费方式请参考[计费说明](https://support.huaweicloud.com/productdesc-metastudio/metastudio_01_0006.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantResourcesRequest 请求对象
     * @return SyncInvoker<ListTenantResourcesRequest, ListTenantResourcesResponse>
     */
    public SyncInvoker<ListTenantResourcesRequest, ListTenantResourcesResponse> listTenantResourcesInvoker(
        ListTenantResourcesRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.listTenantResources, hcClient);
    }

    /**
     * 查看租户资源用量信息
     *
     * 查询租户一次性和包周期（包年/包月）资源用量信息。
     * &gt; 按需套餐包用量本接口无法查询，需要调用CBC接口查询。[按需套餐包用量查询](https://cbc.huaweicloud.com/bm/support/api-apidt/CBCInterface_0001239.html)和[查询资源包信息](https://cbc.huaweicloud.com/bm/support/api-apidt/CBCInterface_0000511.html)。
     * &gt; 各种资源的计费方式请参考[计费说明](https://support.huaweicloud.com/productdesc-metastudio/metastudio_01_0006.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceUsageRequest 请求对象
     * @return ShowResourceUsageResponse
     */
    public ShowResourceUsageResponse showResourceUsage(ShowResourceUsageRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.showResourceUsage);
    }

    /**
     * 查看租户资源用量信息
     *
     * 查询租户一次性和包周期（包年/包月）资源用量信息。
     * &gt; 按需套餐包用量本接口无法查询，需要调用CBC接口查询。[按需套餐包用量查询](https://cbc.huaweicloud.com/bm/support/api-apidt/CBCInterface_0001239.html)和[查询资源包信息](https://cbc.huaweicloud.com/bm/support/api-apidt/CBCInterface_0000511.html)。
     * &gt; 各种资源的计费方式请参考[计费说明](https://support.huaweicloud.com/productdesc-metastudio/metastudio_01_0006.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceUsageRequest 请求对象
     * @return SyncInvoker<ShowResourceUsageRequest, ShowResourceUsageResponse>
     */
    public SyncInvoker<ShowResourceUsageRequest, ShowResourceUsageResponse> showResourceUsageInvoker(
        ShowResourceUsageRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.showResourceUsage, hcClient);
    }

    /**
     * 提交语音训练任务
     *
     * 提交训练任务,执行该接口后,任务会进入审核状态,审核完成后会等待训练。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CommitVoiceTrainingJobRequest 请求对象
     * @return CommitVoiceTrainingJobResponse
     */
    public CommitVoiceTrainingJobResponse commitVoiceTrainingJob(CommitVoiceTrainingJobRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.commitVoiceTrainingJob);
    }

    /**
     * 提交语音训练任务
     *
     * 提交训练任务,执行该接口后,任务会进入审核状态,审核完成后会等待训练。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CommitVoiceTrainingJobRequest 请求对象
     * @return SyncInvoker<CommitVoiceTrainingJobRequest, CommitVoiceTrainingJobResponse>
     */
    public SyncInvoker<CommitVoiceTrainingJobRequest, CommitVoiceTrainingJobResponse> commitVoiceTrainingJobInvoker(
        CommitVoiceTrainingJobRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.commitVoiceTrainingJob, hcClient);
    }

    /**
     * 确认在线录音结果
     *
     * 确认在线录音结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmTrainingSegmentRequest 请求对象
     * @return ConfirmTrainingSegmentResponse
     */
    public ConfirmTrainingSegmentResponse confirmTrainingSegment(ConfirmTrainingSegmentRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.confirmTrainingSegment);
    }

    /**
     * 确认在线录音结果
     *
     * 确认在线录音结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmTrainingSegmentRequest 请求对象
     * @return SyncInvoker<ConfirmTrainingSegmentRequest, ConfirmTrainingSegmentResponse>
     */
    public SyncInvoker<ConfirmTrainingSegmentRequest, ConfirmTrainingSegmentResponse> confirmTrainingSegmentInvoker(
        ConfirmTrainingSegmentRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.confirmTrainingSegment, hcClient);
    }

    /**
     * 创建高级版语音训练任务
     *
     * 用户创建语音训练高级版任务，该接口会返回一个obs上传地址，用于上传语音文件。
     * 
     * 语音文件为一段WAV格式的长音频文件，仅支持将语音文件打包成zip压缩格式上传。
     * 
     * 文件上传后，调用“提交语音训练任务”接口，启动审核和训练。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrainingAdvanceJobRequest 请求对象
     * @return CreateTrainingAdvanceJobResponse
     */
    public CreateTrainingAdvanceJobResponse createTrainingAdvanceJob(CreateTrainingAdvanceJobRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.createTrainingAdvanceJob);
    }

    /**
     * 创建高级版语音训练任务
     *
     * 用户创建语音训练高级版任务，该接口会返回一个obs上传地址，用于上传语音文件。
     * 
     * 语音文件为一段WAV格式的长音频文件，仅支持将语音文件打包成zip压缩格式上传。
     * 
     * 文件上传后，调用“提交语音训练任务”接口，启动审核和训练。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrainingAdvanceJobRequest 请求对象
     * @return SyncInvoker<CreateTrainingAdvanceJobRequest, CreateTrainingAdvanceJobResponse>
     */
    public SyncInvoker<CreateTrainingAdvanceJobRequest, CreateTrainingAdvanceJobResponse> createTrainingAdvanceJobInvoker(
        CreateTrainingAdvanceJobRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.createTrainingAdvanceJob, hcClient);
    }

    /**
     * 创建基础版语音训练任务
     *
     * 用户创建语音训练基础版任务，该接口会返回一个obs上传地址，用于上传语音文件。
     * 
     * 支持2种方式上传语音文件：
     * * 语音文件和文本文件打包成zip上传：语音文件已经切分成20个wav文件，每个语音文件对应一个txt文本文件，所有文件打包成zip文件。语音文件命名规则：0.wav~19.wav；文本文件命名规则：0.txt~19.txt。
     * * 语音文件和文本文件逐句上传：每次上传一句语料的语音文件和文本文件，再调用“确认在线录音结果”接口确认语音和文本内容是否一致。确认成功后再上传和确认下一句。
     * 
     * 文件上传后，调用“提交语音训练任务”接口，启动审核和训练。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrainingBasicJobRequest 请求对象
     * @return CreateTrainingBasicJobResponse
     */
    public CreateTrainingBasicJobResponse createTrainingBasicJob(CreateTrainingBasicJobRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.createTrainingBasicJob);
    }

    /**
     * 创建基础版语音训练任务
     *
     * 用户创建语音训练基础版任务，该接口会返回一个obs上传地址，用于上传语音文件。
     * 
     * 支持2种方式上传语音文件：
     * * 语音文件和文本文件打包成zip上传：语音文件已经切分成20个wav文件，每个语音文件对应一个txt文本文件，所有文件打包成zip文件。语音文件命名规则：0.wav~19.wav；文本文件命名规则：0.txt~19.txt。
     * * 语音文件和文本文件逐句上传：每次上传一句语料的语音文件和文本文件，再调用“确认在线录音结果”接口确认语音和文本内容是否一致。确认成功后再上传和确认下一句。
     * 
     * 文件上传后，调用“提交语音训练任务”接口，启动审核和训练。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrainingBasicJobRequest 请求对象
     * @return SyncInvoker<CreateTrainingBasicJobRequest, CreateTrainingBasicJobResponse>
     */
    public SyncInvoker<CreateTrainingBasicJobRequest, CreateTrainingBasicJobResponse> createTrainingBasicJobInvoker(
        CreateTrainingBasicJobRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.createTrainingBasicJob, hcClient);
    }

    /**
     * 创建进阶版语音训练任务
     *
     * 用户创建语音训练进阶版任务，该接口会返回一个obs上传地址，用于上传语音文件。
     * 
     * 支持2种方式上传语音文件：
     * * 语音文件和文本文件打包成zip上传：语音文件已经切分成100个wav文件，每个语音文件对应一个txt文本文件，所有文件打包成zip文件。语音文件命名规则：0.wav~99.wav；文本文件命名规则：0.txt~99.txt。
     * * 语音文件和文本文件逐句上传：每次上传一句语料的语音文件和文本文件，再调用“确认在线录音结果”接口确认语音和文本内容是否一致。确认成功后再上传和确认下一句。
     * 
     * 文件上传后，调用“提交语音训练任务”接口，启动审核和训练。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrainingMiddleJobRequest 请求对象
     * @return CreateTrainingMiddleJobResponse
     */
    public CreateTrainingMiddleJobResponse createTrainingMiddleJob(CreateTrainingMiddleJobRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.createTrainingMiddleJob);
    }

    /**
     * 创建进阶版语音训练任务
     *
     * 用户创建语音训练进阶版任务，该接口会返回一个obs上传地址，用于上传语音文件。
     * 
     * 支持2种方式上传语音文件：
     * * 语音文件和文本文件打包成zip上传：语音文件已经切分成100个wav文件，每个语音文件对应一个txt文本文件，所有文件打包成zip文件。语音文件命名规则：0.wav~99.wav；文本文件命名规则：0.txt~99.txt。
     * * 语音文件和文本文件逐句上传：每次上传一句语料的语音文件和文本文件，再调用“确认在线录音结果”接口确认语音和文本内容是否一致。确认成功后再上传和确认下一句。
     * 
     * 文件上传后，调用“提交语音训练任务”接口，启动审核和训练。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrainingMiddleJobRequest 请求对象
     * @return SyncInvoker<CreateTrainingMiddleJobRequest, CreateTrainingMiddleJobResponse>
     */
    public SyncInvoker<CreateTrainingMiddleJobRequest, CreateTrainingMiddleJobResponse> createTrainingMiddleJobInvoker(
        CreateTrainingMiddleJobRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.createTrainingMiddleJob, hcClient);
    }

    /**
     * 删除语音训练任务
     *
     * 删除语音训练任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVoiceTrainingJobRequest 请求对象
     * @return DeleteVoiceTrainingJobResponse
     */
    public DeleteVoiceTrainingJobResponse deleteVoiceTrainingJob(DeleteVoiceTrainingJobRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.deleteVoiceTrainingJob);
    }

    /**
     * 删除语音训练任务
     *
     * 删除语音训练任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVoiceTrainingJobRequest 请求对象
     * @return SyncInvoker<DeleteVoiceTrainingJobRequest, DeleteVoiceTrainingJobResponse>
     */
    public SyncInvoker<DeleteVoiceTrainingJobRequest, DeleteVoiceTrainingJobResponse> deleteVoiceTrainingJobInvoker(
        DeleteVoiceTrainingJobRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.deleteVoiceTrainingJob, hcClient);
    }

    /**
     * 查询任务操作日志
     *
     * 查询任务操作日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobOperationLogRequest 请求对象
     * @return ListJobOperationLogResponse
     */
    public ListJobOperationLogResponse listJobOperationLog(ListJobOperationLogRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.listJobOperationLog);
    }

    /**
     * 查询任务操作日志
     *
     * 查询任务操作日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobOperationLogRequest 请求对象
     * @return SyncInvoker<ListJobOperationLogRequest, ListJobOperationLogResponse>
     */
    public SyncInvoker<ListJobOperationLogRequest, ListJobOperationLogResponse> listJobOperationLogInvoker(
        ListJobOperationLogRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.listJobOperationLog, hcClient);
    }

    /**
     * 查询语音训练任务列表
     *
     * 查询语音训练任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVoiceTrainingJobRequest 请求对象
     * @return ListVoiceTrainingJobResponse
     */
    public ListVoiceTrainingJobResponse listVoiceTrainingJob(ListVoiceTrainingJobRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.listVoiceTrainingJob);
    }

    /**
     * 查询语音训练任务列表
     *
     * 查询语音训练任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVoiceTrainingJobRequest 请求对象
     * @return SyncInvoker<ListVoiceTrainingJobRequest, ListVoiceTrainingJobResponse>
     */
    public SyncInvoker<ListVoiceTrainingJobRequest, ListVoiceTrainingJobResponse> listVoiceTrainingJobInvoker(
        ListVoiceTrainingJobRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.listVoiceTrainingJob, hcClient);
    }

    /**
     * 获取语音训练任务审核结果
     *
     * 获取语音训练任务审核结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobAuditResultRequest 请求对象
     * @return ShowJobAuditResultResponse
     */
    public ShowJobAuditResultResponse showJobAuditResult(ShowJobAuditResultRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.showJobAuditResult);
    }

    /**
     * 获取语音训练任务审核结果
     *
     * 获取语音训练任务审核结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobAuditResultRequest 请求对象
     * @return SyncInvoker<ShowJobAuditResultRequest, ShowJobAuditResultResponse>
     */
    public SyncInvoker<ShowJobAuditResultRequest, ShowJobAuditResultResponse> showJobAuditResultInvoker(
        ShowJobAuditResultRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.showJobAuditResult, hcClient);
    }

    /**
     * 获取语音文件上传地址
     *
     * 获取语音文件上传地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobUploadingAddressRequest 请求对象
     * @return ShowJobUploadingAddressResponse
     */
    public ShowJobUploadingAddressResponse showJobUploadingAddress(ShowJobUploadingAddressRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.showJobUploadingAddress);
    }

    /**
     * 获取语音文件上传地址
     *
     * 获取语音文件上传地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobUploadingAddressRequest 请求对象
     * @return SyncInvoker<ShowJobUploadingAddressRequest, ShowJobUploadingAddressResponse>
     */
    public SyncInvoker<ShowJobUploadingAddressRequest, ShowJobUploadingAddressResponse> showJobUploadingAddressInvoker(
        ShowJobUploadingAddressRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.showJobUploadingAddress, hcClient);
    }

    /**
     * 获取在线录音确认结果
     *
     * 获取在线录音确认结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrainingSegmentInfoRequest 请求对象
     * @return ShowTrainingSegmentInfoResponse
     */
    public ShowTrainingSegmentInfoResponse showTrainingSegmentInfo(ShowTrainingSegmentInfoRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.showTrainingSegmentInfo);
    }

    /**
     * 获取在线录音确认结果
     *
     * 获取在线录音确认结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrainingSegmentInfoRequest 请求对象
     * @return SyncInvoker<ShowTrainingSegmentInfoRequest, ShowTrainingSegmentInfoResponse>
     */
    public SyncInvoker<ShowTrainingSegmentInfoRequest, ShowTrainingSegmentInfoResponse> showTrainingSegmentInfoInvoker(
        ShowTrainingSegmentInfoRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.showTrainingSegmentInfo, hcClient);
    }

    /**
     * 查询语音训练任务详情
     *
     * 查询语音训练任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVoiceTrainingJobRequest 请求对象
     * @return ShowVoiceTrainingJobResponse
     */
    public ShowVoiceTrainingJobResponse showVoiceTrainingJob(ShowVoiceTrainingJobRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.showVoiceTrainingJob);
    }

    /**
     * 查询语音训练任务详情
     *
     * 查询语音训练任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVoiceTrainingJobRequest 请求对象
     * @return SyncInvoker<ShowVoiceTrainingJobRequest, ShowVoiceTrainingJobResponse>
     */
    public SyncInvoker<ShowVoiceTrainingJobRequest, ShowVoiceTrainingJobResponse> showVoiceTrainingJobInvoker(
        ShowVoiceTrainingJobRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.showVoiceTrainingJob, hcClient);
    }

    /**
     * 创建分身数字人模型训练任务
     *
     * 该接口用于创建分身数字人模型训练任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Create2dModelTrainingJobRequest 请求对象
     * @return Create2dModelTrainingJobResponse
     */
    public Create2dModelTrainingJobResponse create2dModelTrainingJob(Create2dModelTrainingJobRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.create2dModelTrainingJob);
    }

    /**
     * 创建分身数字人模型训练任务
     *
     * 该接口用于创建分身数字人模型训练任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Create2dModelTrainingJobRequest 请求对象
     * @return SyncInvoker<Create2dModelTrainingJobRequest, Create2dModelTrainingJobResponse>
     */
    public SyncInvoker<Create2dModelTrainingJobRequest, Create2dModelTrainingJobResponse> create2dModelTrainingJobInvoker(
        Create2dModelTrainingJobRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.create2dModelTrainingJob, hcClient);
    }

    /**
     * 删除分身数字人模型训练任务
     *
     * 该接口用于删除分身数字人模型训练任务。同时需要删除训练任务相关的训练视频、身份证照片、授权文件、模型资产等。
     * &gt; * 该接口应当在任务处于以下状态时调用：WAIT_FILE_UPLOAD、AUTO_VERIFY_FAILED、MANUAL_VERIFYING、MANUAL_VERIFY_FAILED、TRAINING_DATA_PREPROCESS_FAILED、TRAIN_FAILED、INFERENCE_DATA_PREPROCESS_FAILED、JOB_SUCCESS、WAIT_USER_CONFIRM、JOB_REJECT、JOB_FINISH
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Delete2dModelTrainingJobRequest 请求对象
     * @return Delete2dModelTrainingJobResponse
     */
    public Delete2dModelTrainingJobResponse delete2dModelTrainingJob(Delete2dModelTrainingJobRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.delete2dModelTrainingJob);
    }

    /**
     * 删除分身数字人模型训练任务
     *
     * 该接口用于删除分身数字人模型训练任务。同时需要删除训练任务相关的训练视频、身份证照片、授权文件、模型资产等。
     * &gt; * 该接口应当在任务处于以下状态时调用：WAIT_FILE_UPLOAD、AUTO_VERIFY_FAILED、MANUAL_VERIFYING、MANUAL_VERIFY_FAILED、TRAINING_DATA_PREPROCESS_FAILED、TRAIN_FAILED、INFERENCE_DATA_PREPROCESS_FAILED、JOB_SUCCESS、WAIT_USER_CONFIRM、JOB_REJECT、JOB_FINISH
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Delete2dModelTrainingJobRequest 请求对象
     * @return SyncInvoker<Delete2dModelTrainingJobRequest, Delete2dModelTrainingJobResponse>
     */
    public SyncInvoker<Delete2dModelTrainingJobRequest, Delete2dModelTrainingJobResponse> delete2dModelTrainingJobInvoker(
        Delete2dModelTrainingJobRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.delete2dModelTrainingJob, hcClient);
    }

    /**
     * 租户执行分身数字人模型训练任务命令
     *
     * 该接口用于租户执行分身数字人模型训练任务命令，如提交训练审核等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Execute2dModelTrainingCommandByUserRequest 请求对象
     * @return Execute2dModelTrainingCommandByUserResponse
     */
    public Execute2dModelTrainingCommandByUserResponse execute2dModelTrainingCommandByUser(
        Execute2dModelTrainingCommandByUserRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.execute2dModelTrainingCommandByUser);
    }

    /**
     * 租户执行分身数字人模型训练任务命令
     *
     * 该接口用于租户执行分身数字人模型训练任务命令，如提交训练审核等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Execute2dModelTrainingCommandByUserRequest 请求对象
     * @return SyncInvoker<Execute2dModelTrainingCommandByUserRequest, Execute2dModelTrainingCommandByUserResponse>
     */
    public SyncInvoker<Execute2dModelTrainingCommandByUserRequest, Execute2dModelTrainingCommandByUserResponse> execute2dModelTrainingCommandByUserInvoker(
        Execute2dModelTrainingCommandByUserRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.execute2dModelTrainingCommandByUser, hcClient);
    }

    /**
     * 查询分身数字人模型训练任务列表
     *
     * 该接口用于查询分身数字人模型训练任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request List2dModelTrainingJobRequest 请求对象
     * @return List2dModelTrainingJobResponse
     */
    public List2dModelTrainingJobResponse list2dModelTrainingJob(List2dModelTrainingJobRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.list2dModelTrainingJob);
    }

    /**
     * 查询分身数字人模型训练任务列表
     *
     * 该接口用于查询分身数字人模型训练任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request List2dModelTrainingJobRequest 请求对象
     * @return SyncInvoker<List2dModelTrainingJobRequest, List2dModelTrainingJobResponse>
     */
    public SyncInvoker<List2dModelTrainingJobRequest, List2dModelTrainingJobResponse> list2dModelTrainingJobInvoker(
        List2dModelTrainingJobRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.list2dModelTrainingJob, hcClient);
    }

    /**
     * 查询分身数字人模型训练任务详情
     *
     * 该接口用于查询分身数字人模型训练任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Show2dModelTrainingJobRequest 请求对象
     * @return Show2dModelTrainingJobResponse
     */
    public Show2dModelTrainingJobResponse show2dModelTrainingJob(Show2dModelTrainingJobRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.show2dModelTrainingJob);
    }

    /**
     * 查询分身数字人模型训练任务详情
     *
     * 该接口用于查询分身数字人模型训练任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Show2dModelTrainingJobRequest 请求对象
     * @return SyncInvoker<Show2dModelTrainingJobRequest, Show2dModelTrainingJobResponse>
     */
    public SyncInvoker<Show2dModelTrainingJobRequest, Show2dModelTrainingJobResponse> show2dModelTrainingJobInvoker(
        Show2dModelTrainingJobRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.show2dModelTrainingJob, hcClient);
    }

    /**
     * 更新分身数字人模型训练任务
     *
     * 该接口用于更新分身数字人模型训练任务。用于在自动审核或者人工审核不通过情况下，更新训练视频、身份证照片等。
     * &gt; * 该接口只能在AUTO_VERIFY_FAILED或者MANUAL_VERIFY_FAILED状态下调用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Update2dModelTrainingJobRequest 请求对象
     * @return Update2dModelTrainingJobResponse
     */
    public Update2dModelTrainingJobResponse update2dModelTrainingJob(Update2dModelTrainingJobRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.update2dModelTrainingJob);
    }

    /**
     * 更新分身数字人模型训练任务
     *
     * 该接口用于更新分身数字人模型训练任务。用于在自动审核或者人工审核不通过情况下，更新训练视频、身份证照片等。
     * &gt; * 该接口只能在AUTO_VERIFY_FAILED或者MANUAL_VERIFY_FAILED状态下调用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Update2dModelTrainingJobRequest 请求对象
     * @return SyncInvoker<Update2dModelTrainingJobRequest, Update2dModelTrainingJobResponse>
     */
    public SyncInvoker<Update2dModelTrainingJobRequest, Update2dModelTrainingJobResponse> update2dModelTrainingJobInvoker(
        Update2dModelTrainingJobRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.update2dModelTrainingJob, hcClient);
    }

    /**
     * 创建语音驱动表情动画任务
     *
     * 该接口用于创建驱动数字人表情的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFacialAnimationsRequest 请求对象
     * @return CreateFacialAnimationsResponse
     */
    public CreateFacialAnimationsResponse createFacialAnimations(CreateFacialAnimationsRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.createFacialAnimations);
    }

    /**
     * 创建语音驱动表情动画任务
     *
     * 该接口用于创建驱动数字人表情的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFacialAnimationsRequest 请求对象
     * @return SyncInvoker<CreateFacialAnimationsRequest, CreateFacialAnimationsResponse>
     */
    public SyncInvoker<CreateFacialAnimationsRequest, CreateFacialAnimationsResponse> createFacialAnimationsInvoker(
        CreateFacialAnimationsRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.createFacialAnimations, hcClient);
    }

    /**
     * 创建语音驱动任务
     *
     * 该接口用于创建驱动数字人表情、动作及语音的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTtsaRequest 请求对象
     * @return CreateTtsaResponse
     */
    public CreateTtsaResponse createTtsa(CreateTtsaRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.createTtsa);
    }

    /**
     * 创建语音驱动任务
     *
     * 该接口用于创建驱动数字人表情、动作及语音的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTtsaRequest 请求对象
     * @return SyncInvoker<CreateTtsaRequest, CreateTtsaResponse>
     */
    public SyncInvoker<CreateTtsaRequest, CreateTtsaResponse> createTtsaInvoker(CreateTtsaRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.createTtsa, hcClient);
    }

    /**
     * 获取语音驱动表情数据
     *
     * 该接口用于获取生成的数字人表情驱动数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFacialAnimationsDataRequest 请求对象
     * @return ListFacialAnimationsDataResponse
     */
    public ListFacialAnimationsDataResponse listFacialAnimationsData(ListFacialAnimationsDataRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.listFacialAnimationsData);
    }

    /**
     * 获取语音驱动表情数据
     *
     * 该接口用于获取生成的数字人表情驱动数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFacialAnimationsDataRequest 请求对象
     * @return SyncInvoker<ListFacialAnimationsDataRequest, ListFacialAnimationsDataResponse>
     */
    public SyncInvoker<ListFacialAnimationsDataRequest, ListFacialAnimationsDataResponse> listFacialAnimationsDataInvoker(
        ListFacialAnimationsDataRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.listFacialAnimationsData, hcClient);
    }

    /**
     * 获取语音驱动数据
     *
     * 该接口用于获取生成的数字人驱动数据，包括语音、表情、动作等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTtsaDataRequest 请求对象
     * @return ListTtsaDataResponse
     */
    public ListTtsaDataResponse listTtsaData(ListTtsaDataRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.listTtsaData);
    }

    /**
     * 获取语音驱动数据
     *
     * 该接口用于获取生成的数字人驱动数据，包括语音、表情、动作等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTtsaDataRequest 请求对象
     * @return SyncInvoker<ListTtsaDataRequest, ListTtsaDataResponse>
     */
    public SyncInvoker<ListTtsaDataRequest, ListTtsaDataResponse> listTtsaDataInvoker(ListTtsaDataRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.listTtsaData, hcClient);
    }

    /**
     * 获取语音驱动任务列表
     *
     * 该接口用于查询驱动数字人表情、动作及语音的任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTtsaJobsRequest 请求对象
     * @return ListTtsaJobsResponse
     */
    public ListTtsaJobsResponse listTtsaJobs(ListTtsaJobsRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.listTtsaJobs);
    }

    /**
     * 获取语音驱动任务列表
     *
     * 该接口用于查询驱动数字人表情、动作及语音的任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTtsaJobsRequest 请求对象
     * @return SyncInvoker<ListTtsaJobsRequest, ListTtsaJobsResponse>
     */
    public SyncInvoker<ListTtsaJobsRequest, ListTtsaJobsResponse> listTtsaJobsInvoker(ListTtsaJobsRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.listTtsaJobs, hcClient);
    }

    /**
     * 创建TTS试听任务
     *
     * 该接口用于创建生成播报内容的语音试听文件任务。
     * 
     * [第三方音色试听需要收费，收费标准参考：https://marketplace.huaweicloud.com/product/OFFI919400645308506112#productid&#x3D;OFFI919400645308506112](tag:hc)
     * 
     * [第三方音色试听需要收费，收费标准参考：https://marketplace.huaweicloud.com/intl/contents/939bf377-3005-472b-a4e2-383911e6102f](tag:hk)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTtsAuditionRequest 请求对象
     * @return CreateTtsAuditionResponse
     */
    public CreateTtsAuditionResponse createTtsAudition(CreateTtsAuditionRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.createTtsAudition);
    }

    /**
     * 创建TTS试听任务
     *
     * 该接口用于创建生成播报内容的语音试听文件任务。
     * 
     * [第三方音色试听需要收费，收费标准参考：https://marketplace.huaweicloud.com/product/OFFI919400645308506112#productid&#x3D;OFFI919400645308506112](tag:hc)
     * 
     * [第三方音色试听需要收费，收费标准参考：https://marketplace.huaweicloud.com/intl/contents/939bf377-3005-472b-a4e2-383911e6102f](tag:hk)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTtsAuditionRequest 请求对象
     * @return SyncInvoker<CreateTtsAuditionRequest, CreateTtsAuditionResponse>
     */
    public SyncInvoker<CreateTtsAuditionRequest, CreateTtsAuditionResponse> createTtsAuditionInvoker(
        CreateTtsAuditionRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.createTtsAudition, hcClient);
    }

    /**
     * 获取TTS试听文件
     *
     * 该接口用于获取TTS试听文件下载链接，返回List中包含当前已生产的试听文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTtsAuditionFileRequest 请求对象
     * @return ShowTtsAuditionFileResponse
     */
    public ShowTtsAuditionFileResponse showTtsAuditionFile(ShowTtsAuditionFileRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.showTtsAuditionFile);
    }

    /**
     * 获取TTS试听文件
     *
     * 该接口用于获取TTS试听文件下载链接，返回List中包含当前已生产的试听文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTtsAuditionFileRequest 请求对象
     * @return SyncInvoker<ShowTtsAuditionFileRequest, ShowTtsAuditionFileResponse>
     */
    public SyncInvoker<ShowTtsAuditionFileRequest, ShowTtsAuditionFileResponse> showTtsAuditionFileInvoker(
        ShowTtsAuditionFileRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.showTtsAuditionFile, hcClient);
    }

    /**
     * 创建视频驱动任务
     *
     * 该接口用于创建视频驱动任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVideoMotionCaptureJobRequest 请求对象
     * @return CreateVideoMotionCaptureJobResponse
     */
    public CreateVideoMotionCaptureJobResponse createVideoMotionCaptureJob(CreateVideoMotionCaptureJobRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.createVideoMotionCaptureJob);
    }

    /**
     * 创建视频驱动任务
     *
     * 该接口用于创建视频驱动任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVideoMotionCaptureJobRequest 请求对象
     * @return SyncInvoker<CreateVideoMotionCaptureJobRequest, CreateVideoMotionCaptureJobResponse>
     */
    public SyncInvoker<CreateVideoMotionCaptureJobRequest, CreateVideoMotionCaptureJobResponse> createVideoMotionCaptureJobInvoker(
        CreateVideoMotionCaptureJobRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.createVideoMotionCaptureJob, hcClient);
    }

    /**
     * 控制数字人驱动
     *
     * 该接口用于控制数字人驱动。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteVideoMotionCaptureCommandRequest 请求对象
     * @return ExecuteVideoMotionCaptureCommandResponse
     */
    public ExecuteVideoMotionCaptureCommandResponse executeVideoMotionCaptureCommand(
        ExecuteVideoMotionCaptureCommandRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.executeVideoMotionCaptureCommand);
    }

    /**
     * 控制数字人驱动
     *
     * 该接口用于控制数字人驱动。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteVideoMotionCaptureCommandRequest 请求对象
     * @return SyncInvoker<ExecuteVideoMotionCaptureCommandRequest, ExecuteVideoMotionCaptureCommandResponse>
     */
    public SyncInvoker<ExecuteVideoMotionCaptureCommandRequest, ExecuteVideoMotionCaptureCommandResponse> executeVideoMotionCaptureCommandInvoker(
        ExecuteVideoMotionCaptureCommandRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.executeVideoMotionCaptureCommand, hcClient);
    }

    /**
     * 查询视频驱动任务列表
     *
     * 该接口用于查询视频驱动任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVideoMotionCaptureJobsRequest 请求对象
     * @return ListVideoMotionCaptureJobsResponse
     */
    public ListVideoMotionCaptureJobsResponse listVideoMotionCaptureJobs(ListVideoMotionCaptureJobsRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.listVideoMotionCaptureJobs);
    }

    /**
     * 查询视频驱动任务列表
     *
     * 该接口用于查询视频驱动任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVideoMotionCaptureJobsRequest 请求对象
     * @return SyncInvoker<ListVideoMotionCaptureJobsRequest, ListVideoMotionCaptureJobsResponse>
     */
    public SyncInvoker<ListVideoMotionCaptureJobsRequest, ListVideoMotionCaptureJobsResponse> listVideoMotionCaptureJobsInvoker(
        ListVideoMotionCaptureJobsRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.listVideoMotionCaptureJobs, hcClient);
    }

    /**
     * 查询视频驱动任务详情
     *
     * 该接口用于查询视频驱动任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVideoMotionCaptureJobRequest 请求对象
     * @return ShowVideoMotionCaptureJobResponse
     */
    public ShowVideoMotionCaptureJobResponse showVideoMotionCaptureJob(ShowVideoMotionCaptureJobRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.showVideoMotionCaptureJob);
    }

    /**
     * 查询视频驱动任务详情
     *
     * 该接口用于查询视频驱动任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVideoMotionCaptureJobRequest 请求对象
     * @return SyncInvoker<ShowVideoMotionCaptureJobRequest, ShowVideoMotionCaptureJobResponse>
     */
    public SyncInvoker<ShowVideoMotionCaptureJobRequest, ShowVideoMotionCaptureJobResponse> showVideoMotionCaptureJobInvoker(
        ShowVideoMotionCaptureJobRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.showVideoMotionCaptureJob, hcClient);
    }

    /**
     * 停止视频驱动任务
     *
     * 该接口用于停止视频驱动任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopVideoMotionCaptureJobRequest 请求对象
     * @return StopVideoMotionCaptureJobResponse
     */
    public StopVideoMotionCaptureJobResponse stopVideoMotionCaptureJob(StopVideoMotionCaptureJobRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.stopVideoMotionCaptureJob);
    }

    /**
     * 停止视频驱动任务
     *
     * 该接口用于停止视频驱动任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopVideoMotionCaptureJobRequest 请求对象
     * @return SyncInvoker<StopVideoMotionCaptureJobRequest, StopVideoMotionCaptureJobResponse>
     */
    public SyncInvoker<StopVideoMotionCaptureJobRequest, StopVideoMotionCaptureJobResponse> stopVideoMotionCaptureJobInvoker(
        StopVideoMotionCaptureJobRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.stopVideoMotionCaptureJob, hcClient);
    }

    /**
     * 复制视频制作剧本
     *
     * 该接口用于复制视频制作剧本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyVideoScriptsRequest 请求对象
     * @return CopyVideoScriptsResponse
     */
    public CopyVideoScriptsResponse copyVideoScripts(CopyVideoScriptsRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.copyVideoScripts);
    }

    /**
     * 复制视频制作剧本
     *
     * 该接口用于复制视频制作剧本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyVideoScriptsRequest 请求对象
     * @return SyncInvoker<CopyVideoScriptsRequest, CopyVideoScriptsResponse>
     */
    public SyncInvoker<CopyVideoScriptsRequest, CopyVideoScriptsResponse> copyVideoScriptsInvoker(
        CopyVideoScriptsRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.copyVideoScripts, hcClient);
    }

    /**
     * 创建视频制作剧本
     *
     * 该接口用于创建视频制作剧本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVideoScriptsRequest 请求对象
     * @return CreateVideoScriptsResponse
     */
    public CreateVideoScriptsResponse createVideoScripts(CreateVideoScriptsRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.createVideoScripts);
    }

    /**
     * 创建视频制作剧本
     *
     * 该接口用于创建视频制作剧本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVideoScriptsRequest 请求对象
     * @return SyncInvoker<CreateVideoScriptsRequest, CreateVideoScriptsResponse>
     */
    public SyncInvoker<CreateVideoScriptsRequest, CreateVideoScriptsResponse> createVideoScriptsInvoker(
        CreateVideoScriptsRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.createVideoScripts, hcClient);
    }

    /**
     * 删除视频制作剧本
     *
     * 该接口用于删除视频制作剧本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVideoScriptRequest 请求对象
     * @return DeleteVideoScriptResponse
     */
    public DeleteVideoScriptResponse deleteVideoScript(DeleteVideoScriptRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.deleteVideoScript);
    }

    /**
     * 删除视频制作剧本
     *
     * 该接口用于删除视频制作剧本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVideoScriptRequest 请求对象
     * @return SyncInvoker<DeleteVideoScriptRequest, DeleteVideoScriptResponse>
     */
    public SyncInvoker<DeleteVideoScriptRequest, DeleteVideoScriptResponse> deleteVideoScriptInvoker(
        DeleteVideoScriptRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.deleteVideoScript, hcClient);
    }

    /**
     * 查询视频制作剧本列表
     *
     * 该接口用于查询视频制作剧本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVideoScriptsRequest 请求对象
     * @return ListVideoScriptsResponse
     */
    public ListVideoScriptsResponse listVideoScripts(ListVideoScriptsRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.listVideoScripts);
    }

    /**
     * 查询视频制作剧本列表
     *
     * 该接口用于查询视频制作剧本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVideoScriptsRequest 请求对象
     * @return SyncInvoker<ListVideoScriptsRequest, ListVideoScriptsResponse>
     */
    public SyncInvoker<ListVideoScriptsRequest, ListVideoScriptsResponse> listVideoScriptsInvoker(
        ListVideoScriptsRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.listVideoScripts, hcClient);
    }

    /**
     * 查询视频制作剧本详情
     *
     * 该接口用于查询视频制作剧本详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVideoScriptRequest 请求对象
     * @return ShowVideoScriptResponse
     */
    public ShowVideoScriptResponse showVideoScript(ShowVideoScriptRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.showVideoScript);
    }

    /**
     * 查询视频制作剧本详情
     *
     * 该接口用于查询视频制作剧本详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVideoScriptRequest 请求对象
     * @return SyncInvoker<ShowVideoScriptRequest, ShowVideoScriptResponse>
     */
    public SyncInvoker<ShowVideoScriptRequest, ShowVideoScriptResponse> showVideoScriptInvoker(
        ShowVideoScriptRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.showVideoScript, hcClient);
    }

    /**
     * 更新视频制作剧本
     *
     * 该接口用于更新视频制作剧本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVideoScriptRequest 请求对象
     * @return UpdateVideoScriptResponse
     */
    public UpdateVideoScriptResponse updateVideoScript(UpdateVideoScriptRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.updateVideoScript);
    }

    /**
     * 更新视频制作剧本
     *
     * 该接口用于更新视频制作剧本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVideoScriptRequest 请求对象
     * @return SyncInvoker<UpdateVideoScriptRequest, UpdateVideoScriptResponse>
     */
    public SyncInvoker<UpdateVideoScriptRequest, UpdateVideoScriptResponse> updateVideoScriptInvoker(
        UpdateVideoScriptRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.updateVideoScript, hcClient);
    }

    /**
     * 创建欢迎词
     *
     * 该接口用于创建欢迎词。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWelcomeSpeechRequest 请求对象
     * @return CreateWelcomeSpeechResponse
     */
    public CreateWelcomeSpeechResponse createWelcomeSpeech(CreateWelcomeSpeechRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.createWelcomeSpeech);
    }

    /**
     * 创建欢迎词
     *
     * 该接口用于创建欢迎词。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWelcomeSpeechRequest 请求对象
     * @return SyncInvoker<CreateWelcomeSpeechRequest, CreateWelcomeSpeechResponse>
     */
    public SyncInvoker<CreateWelcomeSpeechRequest, CreateWelcomeSpeechResponse> createWelcomeSpeechInvoker(
        CreateWelcomeSpeechRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.createWelcomeSpeech, hcClient);
    }

    /**
     * 删除欢迎词
     *
     * 该接口用于删除欢迎词。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWelcomeSpeechRequest 请求对象
     * @return DeleteWelcomeSpeechResponse
     */
    public DeleteWelcomeSpeechResponse deleteWelcomeSpeech(DeleteWelcomeSpeechRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.deleteWelcomeSpeech);
    }

    /**
     * 删除欢迎词
     *
     * 该接口用于删除欢迎词。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWelcomeSpeechRequest 请求对象
     * @return SyncInvoker<DeleteWelcomeSpeechRequest, DeleteWelcomeSpeechResponse>
     */
    public SyncInvoker<DeleteWelcomeSpeechRequest, DeleteWelcomeSpeechResponse> deleteWelcomeSpeechInvoker(
        DeleteWelcomeSpeechRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.deleteWelcomeSpeech, hcClient);
    }

    /**
     * 查询欢迎词列表
     *
     * 该接口用于查询欢迎词列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWelcomeSpeechRequest 请求对象
     * @return ListWelcomeSpeechResponse
     */
    public ListWelcomeSpeechResponse listWelcomeSpeech(ListWelcomeSpeechRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.listWelcomeSpeech);
    }

    /**
     * 查询欢迎词列表
     *
     * 该接口用于查询欢迎词列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWelcomeSpeechRequest 请求对象
     * @return SyncInvoker<ListWelcomeSpeechRequest, ListWelcomeSpeechResponse>
     */
    public SyncInvoker<ListWelcomeSpeechRequest, ListWelcomeSpeechResponse> listWelcomeSpeechInvoker(
        ListWelcomeSpeechRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.listWelcomeSpeech, hcClient);
    }

    /**
     * 查询欢迎词详情
     *
     * 该接口用于查询欢迎词详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWelcomeSpeechRequest 请求对象
     * @return ShowWelcomeSpeechResponse
     */
    public ShowWelcomeSpeechResponse showWelcomeSpeech(ShowWelcomeSpeechRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.showWelcomeSpeech);
    }

    /**
     * 查询欢迎词详情
     *
     * 该接口用于查询欢迎词详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWelcomeSpeechRequest 请求对象
     * @return SyncInvoker<ShowWelcomeSpeechRequest, ShowWelcomeSpeechResponse>
     */
    public SyncInvoker<ShowWelcomeSpeechRequest, ShowWelcomeSpeechResponse> showWelcomeSpeechInvoker(
        ShowWelcomeSpeechRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.showWelcomeSpeech, hcClient);
    }

    /**
     * 查询欢迎词功能开关
     *
     * 该接口用于查询欢迎词功能开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWelcomeSpeechSwitchRequest 请求对象
     * @return ShowWelcomeSpeechSwitchResponse
     */
    public ShowWelcomeSpeechSwitchResponse showWelcomeSpeechSwitch(ShowWelcomeSpeechSwitchRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.showWelcomeSpeechSwitch);
    }

    /**
     * 查询欢迎词功能开关
     *
     * 该接口用于查询欢迎词功能开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWelcomeSpeechSwitchRequest 请求对象
     * @return SyncInvoker<ShowWelcomeSpeechSwitchRequest, ShowWelcomeSpeechSwitchResponse>
     */
    public SyncInvoker<ShowWelcomeSpeechSwitchRequest, ShowWelcomeSpeechSwitchResponse> showWelcomeSpeechSwitchInvoker(
        ShowWelcomeSpeechSwitchRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.showWelcomeSpeechSwitch, hcClient);
    }

    /**
     * 修改欢迎词
     *
     * 该接口用于修改欢迎词。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWelcomeSpeechRequest 请求对象
     * @return UpdateWelcomeSpeechResponse
     */
    public UpdateWelcomeSpeechResponse updateWelcomeSpeech(UpdateWelcomeSpeechRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.updateWelcomeSpeech);
    }

    /**
     * 修改欢迎词
     *
     * 该接口用于修改欢迎词。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWelcomeSpeechRequest 请求对象
     * @return SyncInvoker<UpdateWelcomeSpeechRequest, UpdateWelcomeSpeechResponse>
     */
    public SyncInvoker<UpdateWelcomeSpeechRequest, UpdateWelcomeSpeechResponse> updateWelcomeSpeechInvoker(
        UpdateWelcomeSpeechRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.updateWelcomeSpeech, hcClient);
    }

    /**
     * 修改欢迎词功能开关
     *
     * 该接口用于修改欢迎词功能开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWelcomeSpeechSwitchRequest 请求对象
     * @return UpdateWelcomeSpeechSwitchResponse
     */
    public UpdateWelcomeSpeechSwitchResponse updateWelcomeSpeechSwitch(UpdateWelcomeSpeechSwitchRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.updateWelcomeSpeechSwitch);
    }

    /**
     * 修改欢迎词功能开关
     *
     * 该接口用于修改欢迎词功能开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWelcomeSpeechSwitchRequest 请求对象
     * @return SyncInvoker<UpdateWelcomeSpeechSwitchRequest, UpdateWelcomeSpeechSwitchResponse>
     */
    public SyncInvoker<UpdateWelcomeSpeechSwitchRequest, UpdateWelcomeSpeechSwitchResponse> updateWelcomeSpeechSwitchInvoker(
        UpdateWelcomeSpeechSwitchRequest request) {
        return new SyncInvoker<>(request, MetaStudioMeta.updateWelcomeSpeechSwitch, hcClient);
    }

}

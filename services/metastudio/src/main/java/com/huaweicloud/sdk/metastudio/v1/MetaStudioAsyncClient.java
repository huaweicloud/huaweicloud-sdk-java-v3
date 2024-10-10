package com.huaweicloud.sdk.metastudio.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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

import java.util.concurrent.CompletableFuture;

public class MetaStudioAsyncClient {

    protected HcClient hcClient;

    public MetaStudioAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<MetaStudioAsyncClient> newBuilder() {
        ClientBuilder<MetaStudioAsyncClient> clientBuilder = new ClientBuilder<>(MetaStudioAsyncClient::new);
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
     * @return CompletableFuture<CreateActiveCodeResponse>
     */
    public CompletableFuture<CreateActiveCodeResponse> createActiveCodeAsync(CreateActiveCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createActiveCode);
    }

    /**
     * 创建激活码
     *
     * 该接口用于创建激活码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateActiveCodeRequest 请求对象
     * @return AsyncInvoker<CreateActiveCodeRequest, CreateActiveCodeResponse>
     */
    public AsyncInvoker<CreateActiveCodeRequest, CreateActiveCodeResponse> createActiveCodeAsyncInvoker(
        CreateActiveCodeRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.createActiveCode, hcClient);
    }

    /**
     * 删除激活码
     *
     * 该接口用于删除激活码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteActiveCodeRequest 请求对象
     * @return CompletableFuture<DeleteActiveCodeResponse>
     */
    public CompletableFuture<DeleteActiveCodeResponse> deleteActiveCodeAsync(DeleteActiveCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.deleteActiveCode);
    }

    /**
     * 删除激活码
     *
     * 该接口用于删除激活码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteActiveCodeRequest 请求对象
     * @return AsyncInvoker<DeleteActiveCodeRequest, DeleteActiveCodeResponse>
     */
    public AsyncInvoker<DeleteActiveCodeRequest, DeleteActiveCodeResponse> deleteActiveCodeAsyncInvoker(
        DeleteActiveCodeRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.deleteActiveCode, hcClient);
    }

    /**
     * 查询激活码列表
     *
     * 该接口用于查询激活码列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListActiveCodeRequest 请求对象
     * @return CompletableFuture<ListActiveCodeResponse>
     */
    public CompletableFuture<ListActiveCodeResponse> listActiveCodeAsync(ListActiveCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.listActiveCode);
    }

    /**
     * 查询激活码列表
     *
     * 该接口用于查询激活码列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListActiveCodeRequest 请求对象
     * @return AsyncInvoker<ListActiveCodeRequest, ListActiveCodeResponse>
     */
    public AsyncInvoker<ListActiveCodeRequest, ListActiveCodeResponse> listActiveCodeAsyncInvoker(
        ListActiveCodeRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.listActiveCode, hcClient);
    }

    /**
     * 重置激活码
     *
     * 该接口用于重置激活码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetActiveCodeRequest 请求对象
     * @return CompletableFuture<ResetActiveCodeResponse>
     */
    public CompletableFuture<ResetActiveCodeResponse> resetActiveCodeAsync(ResetActiveCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.resetActiveCode);
    }

    /**
     * 重置激活码
     *
     * 该接口用于重置激活码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetActiveCodeRequest 请求对象
     * @return AsyncInvoker<ResetActiveCodeRequest, ResetActiveCodeResponse>
     */
    public AsyncInvoker<ResetActiveCodeRequest, ResetActiveCodeResponse> resetActiveCodeAsyncInvoker(
        ResetActiveCodeRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.resetActiveCode, hcClient);
    }

    /**
     * 查询激活码详情
     *
     * 该接口用于查询激活码详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowActiveCodeRequest 请求对象
     * @return CompletableFuture<ShowActiveCodeResponse>
     */
    public CompletableFuture<ShowActiveCodeResponse> showActiveCodeAsync(ShowActiveCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.showActiveCode);
    }

    /**
     * 查询激活码详情
     *
     * 该接口用于查询激活码详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowActiveCodeRequest 请求对象
     * @return AsyncInvoker<ShowActiveCodeRequest, ShowActiveCodeResponse>
     */
    public AsyncInvoker<ShowActiveCodeRequest, ShowActiveCodeResponse> showActiveCodeAsyncInvoker(
        ShowActiveCodeRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.showActiveCode, hcClient);
    }

    /**
     * 修改激活码
     *
     * 该接口用于修改激活码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateActiveCodeRequest 请求对象
     * @return CompletableFuture<UpdateActiveCodeResponse>
     */
    public CompletableFuture<UpdateActiveCodeResponse> updateActiveCodeAsync(UpdateActiveCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.updateActiveCode);
    }

    /**
     * 修改激活码
     *
     * 该接口用于修改激活码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateActiveCodeRequest 请求对象
     * @return AsyncInvoker<UpdateActiveCodeRequest, UpdateActiveCodeResponse>
     */
    public AsyncInvoker<UpdateActiveCodeRequest, UpdateActiveCodeResponse> updateActiveCodeAsyncInvoker(
        UpdateActiveCodeRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.updateActiveCode, hcClient);
    }

    /**
     * 创建委托
     *
     * 该接口用于创建委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgencyWithRoleTypeRequest 请求对象
     * @return CompletableFuture<CreateAgencyWithRoleTypeResponse>
     */
    public CompletableFuture<CreateAgencyWithRoleTypeResponse> createAgencyWithRoleTypeAsync(
        CreateAgencyWithRoleTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createAgencyWithRoleType);
    }

    /**
     * 创建委托
     *
     * 该接口用于创建委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgencyWithRoleTypeRequest 请求对象
     * @return AsyncInvoker<CreateAgencyWithRoleTypeRequest, CreateAgencyWithRoleTypeResponse>
     */
    public AsyncInvoker<CreateAgencyWithRoleTypeRequest, CreateAgencyWithRoleTypeResponse> createAgencyWithRoleTypeAsyncInvoker(
        CreateAgencyWithRoleTypeRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.createAgencyWithRoleType, hcClient);
    }

    /**
     * 删除委托
     *
     * 该接口用于删除项目下委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAgencyWithRoleTypeRequest 请求对象
     * @return CompletableFuture<DeleteAgencyWithRoleTypeResponse>
     */
    public CompletableFuture<DeleteAgencyWithRoleTypeResponse> deleteAgencyWithRoleTypeAsync(
        DeleteAgencyWithRoleTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.deleteAgencyWithRoleType);
    }

    /**
     * 删除委托
     *
     * 该接口用于删除项目下委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAgencyWithRoleTypeRequest 请求对象
     * @return AsyncInvoker<DeleteAgencyWithRoleTypeRequest, DeleteAgencyWithRoleTypeResponse>
     */
    public AsyncInvoker<DeleteAgencyWithRoleTypeRequest, DeleteAgencyWithRoleTypeResponse> deleteAgencyWithRoleTypeAsyncInvoker(
        DeleteAgencyWithRoleTypeRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.deleteAgencyWithRoleType, hcClient);
    }

    /**
     * 查询委托
     *
     * 该接口用于查询项目下委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgencyRequest 请求对象
     * @return CompletableFuture<ShowAgencyResponse>
     */
    public CompletableFuture<ShowAgencyResponse> showAgencyAsync(ShowAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.showAgency);
    }

    /**
     * 查询委托
     *
     * 该接口用于查询项目下委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgencyRequest 请求对象
     * @return AsyncInvoker<ShowAgencyRequest, ShowAgencyResponse>
     */
    public AsyncInvoker<ShowAgencyRequest, ShowAgencyResponse> showAgencyAsyncInvoker(ShowAgencyRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.showAgency, hcClient);
    }

    /**
     * 创建对话链接
     *
     * 该接口用于创建对话链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDialogUrlRequest 请求对象
     * @return CompletableFuture<CreateDialogUrlResponse>
     */
    public CompletableFuture<CreateDialogUrlResponse> createDialogUrlAsync(CreateDialogUrlRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createDialogUrl);
    }

    /**
     * 创建对话链接
     *
     * 该接口用于创建对话链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDialogUrlRequest 请求对象
     * @return AsyncInvoker<CreateDialogUrlRequest, CreateDialogUrlResponse>
     */
    public AsyncInvoker<CreateDialogUrlRequest, CreateDialogUrlResponse> createDialogUrlAsyncInvoker(
        CreateDialogUrlRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.createDialogUrl, hcClient);
    }

    /**
     * 查询数字人智能交互任务
     *
     * 该接口用于查询数字人智能交互任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSmartChatJobRequest 请求对象
     * @return CompletableFuture<ShowSmartChatJobResponse>
     */
    public CompletableFuture<ShowSmartChatJobResponse> showSmartChatJobAsync(ShowSmartChatJobRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.showSmartChatJob);
    }

    /**
     * 查询数字人智能交互任务
     *
     * 该接口用于查询数字人智能交互任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSmartChatJobRequest 请求对象
     * @return AsyncInvoker<ShowSmartChatJobRequest, ShowSmartChatJobResponse>
     */
    public AsyncInvoker<ShowSmartChatJobRequest, ShowSmartChatJobResponse> showSmartChatJobAsyncInvoker(
        ShowSmartChatJobRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.showSmartChatJob, hcClient);
    }

    /**
     * 启动数字人智能交互任务
     *
     * 该接口用于启动数字人智能交互任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartSmartChatJobRequest 请求对象
     * @return CompletableFuture<StartSmartChatJobResponse>
     */
    public CompletableFuture<StartSmartChatJobResponse> startSmartChatJobAsync(StartSmartChatJobRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.startSmartChatJob);
    }

    /**
     * 启动数字人智能交互任务
     *
     * 该接口用于启动数字人智能交互任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartSmartChatJobRequest 请求对象
     * @return AsyncInvoker<StartSmartChatJobRequest, StartSmartChatJobResponse>
     */
    public AsyncInvoker<StartSmartChatJobRequest, StartSmartChatJobResponse> startSmartChatJobAsyncInvoker(
        StartSmartChatJobRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.startSmartChatJob, hcClient);
    }

    /**
     * 结束数字人智能交互任务
     *
     * 该接口用于结束数字人智能交互任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopSmartChatJobRequest 请求对象
     * @return CompletableFuture<StopSmartChatJobResponse>
     */
    public CompletableFuture<StopSmartChatJobResponse> stopSmartChatJobAsync(StopSmartChatJobRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.stopSmartChatJob);
    }

    /**
     * 结束数字人智能交互任务
     *
     * 该接口用于结束数字人智能交互任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopSmartChatJobRequest 请求对象
     * @return AsyncInvoker<StopSmartChatJobRequest, StopSmartChatJobResponse>
     */
    public AsyncInvoker<StopSmartChatJobRequest, StopSmartChatJobResponse> stopSmartChatJobAsyncInvoker(
        StopSmartChatJobRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.stopSmartChatJob, hcClient);
    }

    /**
     * 批量资产操作
     *
     * 该接口用批量资产操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchExecuteAssetActionRequest 请求对象
     * @return CompletableFuture<BatchExecuteAssetActionResponse>
     */
    public CompletableFuture<BatchExecuteAssetActionResponse> batchExecuteAssetActionAsync(
        BatchExecuteAssetActionRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.batchExecuteAssetAction);
    }

    /**
     * 批量资产操作
     *
     * 该接口用批量资产操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchExecuteAssetActionRequest 请求对象
     * @return AsyncInvoker<BatchExecuteAssetActionRequest, BatchExecuteAssetActionResponse>
     */
    public AsyncInvoker<BatchExecuteAssetActionRequest, BatchExecuteAssetActionResponse> batchExecuteAssetActionAsyncInvoker(
        BatchExecuteAssetActionRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.batchExecuteAssetAction, hcClient);
    }

    /**
     * 复制资产
     *
     * 该接口用于在Region B复制Region A的指定资产。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAssetByReplicationInfoRequest 请求对象
     * @return CompletableFuture<CreateAssetByReplicationInfoResponse>
     */
    public CompletableFuture<CreateAssetByReplicationInfoResponse> createAssetByReplicationInfoAsync(
        CreateAssetByReplicationInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createAssetByReplicationInfo);
    }

    /**
     * 复制资产
     *
     * 该接口用于在Region B复制Region A的指定资产。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAssetByReplicationInfoRequest 请求对象
     * @return AsyncInvoker<CreateAssetByReplicationInfoRequest, CreateAssetByReplicationInfoResponse>
     */
    public AsyncInvoker<CreateAssetByReplicationInfoRequest, CreateAssetByReplicationInfoResponse> createAssetByReplicationInfoAsyncInvoker(
        CreateAssetByReplicationInfoRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.createAssetByReplicationInfo, hcClient);
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
     * @return CompletableFuture<CreateDigitalAssetResponse>
     */
    public CompletableFuture<CreateDigitalAssetResponse> createDigitalAssetAsync(CreateDigitalAssetRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createDigitalAsset);
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
     * @return AsyncInvoker<CreateDigitalAssetRequest, CreateDigitalAssetResponse>
     */
    public AsyncInvoker<CreateDigitalAssetRequest, CreateDigitalAssetResponse> createDigitalAssetAsyncInvoker(
        CreateDigitalAssetRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.createDigitalAsset, hcClient);
    }

    /**
     * 删除资产
     *
     * 该接口用于删除资产库中的媒体资产。调用该接口删除媒体资产时，媒体资产会放入回收站中，不会彻底删除。如需彻底删除资产，需增加“mode&#x3D;force”参数配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAssetRequest 请求对象
     * @return CompletableFuture<DeleteAssetResponse>
     */
    public CompletableFuture<DeleteAssetResponse> deleteAssetAsync(DeleteAssetRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.deleteAsset);
    }

    /**
     * 删除资产
     *
     * 该接口用于删除资产库中的媒体资产。调用该接口删除媒体资产时，媒体资产会放入回收站中，不会彻底删除。如需彻底删除资产，需增加“mode&#x3D;force”参数配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAssetRequest 请求对象
     * @return AsyncInvoker<DeleteAssetRequest, DeleteAssetResponse>
     */
    public AsyncInvoker<DeleteAssetRequest, DeleteAssetResponse> deleteAssetAsyncInvoker(DeleteAssetRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.deleteAsset, hcClient);
    }

    /**
     * 查询资产概要
     *
     * 该接口用于查询媒体资产库中指定的多个资产的概要信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssetSummaryRequest 请求对象
     * @return CompletableFuture<ListAssetSummaryResponse>
     */
    public CompletableFuture<ListAssetSummaryResponse> listAssetSummaryAsync(ListAssetSummaryRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.listAssetSummary);
    }

    /**
     * 查询资产概要
     *
     * 该接口用于查询媒体资产库中指定的多个资产的概要信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssetSummaryRequest 请求对象
     * @return AsyncInvoker<ListAssetSummaryRequest, ListAssetSummaryResponse>
     */
    public AsyncInvoker<ListAssetSummaryRequest, ListAssetSummaryResponse> listAssetSummaryAsyncInvoker(
        ListAssetSummaryRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.listAssetSummary, hcClient);
    }

    /**
     * 查询资产列表
     *
     * 该接口用于查询资产库中的媒体资产列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssetsRequest 请求对象
     * @return CompletableFuture<ListAssetsResponse>
     */
    public CompletableFuture<ListAssetsResponse> listAssetsAsync(ListAssetsRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.listAssets);
    }

    /**
     * 查询资产列表
     *
     * 该接口用于查询资产库中的媒体资产列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssetsRequest 请求对象
     * @return AsyncInvoker<ListAssetsRequest, ListAssetsResponse>
     */
    public AsyncInvoker<ListAssetsRequest, ListAssetsResponse> listAssetsAsyncInvoker(ListAssetsRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.listAssets, hcClient);
    }

    /**
     * 恢复被删除的资产
     *
     * 该接口用于恢复被删除至回收站的媒体资产。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreAssetRequest 请求对象
     * @return CompletableFuture<RestoreAssetResponse>
     */
    public CompletableFuture<RestoreAssetResponse> restoreAssetAsync(RestoreAssetRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.restoreAsset);
    }

    /**
     * 恢复被删除的资产
     *
     * 该接口用于恢复被删除至回收站的媒体资产。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreAssetRequest 请求对象
     * @return AsyncInvoker<RestoreAssetRequest, RestoreAssetResponse>
     */
    public AsyncInvoker<RestoreAssetRequest, RestoreAssetResponse> restoreAssetAsyncInvoker(
        RestoreAssetRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.restoreAsset, hcClient);
    }

    /**
     * 查询资产详情
     *
     * 该接口用于查询资产库中指定媒体资产的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssetRequest 请求对象
     * @return CompletableFuture<ShowAssetResponse>
     */
    public CompletableFuture<ShowAssetResponse> showAssetAsync(ShowAssetRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.showAsset);
    }

    /**
     * 查询资产详情
     *
     * 该接口用于查询资产库中指定媒体资产的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssetRequest 请求对象
     * @return AsyncInvoker<ShowAssetRequest, ShowAssetResponse>
     */
    public AsyncInvoker<ShowAssetRequest, ShowAssetResponse> showAssetAsyncInvoker(ShowAssetRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.showAsset, hcClient);
    }

    /**
     * 查询资产复制信息
     *
     * 当需要将资产从A Region复制到B Region时，先要在A Region调用该接口用于查询资产复制信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssetReplicationInfoRequest 请求对象
     * @return CompletableFuture<ShowAssetReplicationInfoResponse>
     */
    public CompletableFuture<ShowAssetReplicationInfoResponse> showAssetReplicationInfoAsync(
        ShowAssetReplicationInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.showAssetReplicationInfo);
    }

    /**
     * 查询资产复制信息
     *
     * 当需要将资产从A Region复制到B Region时，先要在A Region调用该接口用于查询资产复制信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssetReplicationInfoRequest 请求对象
     * @return AsyncInvoker<ShowAssetReplicationInfoRequest, ShowAssetReplicationInfoResponse>
     */
    public AsyncInvoker<ShowAssetReplicationInfoRequest, ShowAssetReplicationInfoResponse> showAssetReplicationInfoAsyncInvoker(
        ShowAssetReplicationInfoRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.showAssetReplicationInfo, hcClient);
    }

    /**
     * 更新资产
     *
     * 该接口用于更新资产库中的媒体资产信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDigitalAssetRequest 请求对象
     * @return CompletableFuture<UpdateDigitalAssetResponse>
     */
    public CompletableFuture<UpdateDigitalAssetResponse> updateDigitalAssetAsync(UpdateDigitalAssetRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.updateDigitalAsset);
    }

    /**
     * 更新资产
     *
     * 该接口用于更新资产库中的媒体资产信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDigitalAssetRequest 请求对象
     * @return AsyncInvoker<UpdateDigitalAssetRequest, UpdateDigitalAssetResponse>
     */
    public AsyncInvoker<UpdateDigitalAssetRequest, UpdateDigitalAssetResponse> updateDigitalAssetAsyncInvoker(
        UpdateDigitalAssetRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.updateDigitalAsset, hcClient);
    }

    /**
     * 创建数字人名片制作
     *
     * 该接口用于数字人名片制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDigitalHumanBusinessCardRequest 请求对象
     * @return CompletableFuture<CreateDigitalHumanBusinessCardResponse>
     */
    public CompletableFuture<CreateDigitalHumanBusinessCardResponse> createDigitalHumanBusinessCardAsync(
        CreateDigitalHumanBusinessCardRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createDigitalHumanBusinessCard);
    }

    /**
     * 创建数字人名片制作
     *
     * 该接口用于数字人名片制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDigitalHumanBusinessCardRequest 请求对象
     * @return AsyncInvoker<CreateDigitalHumanBusinessCardRequest, CreateDigitalHumanBusinessCardResponse>
     */
    public AsyncInvoker<CreateDigitalHumanBusinessCardRequest, CreateDigitalHumanBusinessCardResponse> createDigitalHumanBusinessCardAsyncInvoker(
        CreateDigitalHumanBusinessCardRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.createDigitalHumanBusinessCard, hcClient);
    }

    /**
     * 删除数字人名片制作任务
     *
     * 该接口用于删除数字人名片制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDigitalHumanBusinessCardRequest 请求对象
     * @return CompletableFuture<DeleteDigitalHumanBusinessCardResponse>
     */
    public CompletableFuture<DeleteDigitalHumanBusinessCardResponse> deleteDigitalHumanBusinessCardAsync(
        DeleteDigitalHumanBusinessCardRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.deleteDigitalHumanBusinessCard);
    }

    /**
     * 删除数字人名片制作任务
     *
     * 该接口用于删除数字人名片制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDigitalHumanBusinessCardRequest 请求对象
     * @return AsyncInvoker<DeleteDigitalHumanBusinessCardRequest, DeleteDigitalHumanBusinessCardResponse>
     */
    public AsyncInvoker<DeleteDigitalHumanBusinessCardRequest, DeleteDigitalHumanBusinessCardResponse> deleteDigitalHumanBusinessCardAsyncInvoker(
        DeleteDigitalHumanBusinessCardRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.deleteDigitalHumanBusinessCard, hcClient);
    }

    /**
     * 查询数字人名片制作任务列表
     *
     * 该接口用于查询数字人名片制作任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDigitalHumanBusinessCardRequest 请求对象
     * @return CompletableFuture<ListDigitalHumanBusinessCardResponse>
     */
    public CompletableFuture<ListDigitalHumanBusinessCardResponse> listDigitalHumanBusinessCardAsync(
        ListDigitalHumanBusinessCardRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.listDigitalHumanBusinessCard);
    }

    /**
     * 查询数字人名片制作任务列表
     *
     * 该接口用于查询数字人名片制作任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDigitalHumanBusinessCardRequest 请求对象
     * @return AsyncInvoker<ListDigitalHumanBusinessCardRequest, ListDigitalHumanBusinessCardResponse>
     */
    public AsyncInvoker<ListDigitalHumanBusinessCardRequest, ListDigitalHumanBusinessCardResponse> listDigitalHumanBusinessCardAsyncInvoker(
        ListDigitalHumanBusinessCardRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.listDigitalHumanBusinessCard, hcClient);
    }

    /**
     * 查询数字人名片制作任务详情
     *
     * 该接口用于查询数字人名片制作任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDigitalHumanBusinessCardRequest 请求对象
     * @return CompletableFuture<ShowDigitalHumanBusinessCardResponse>
     */
    public CompletableFuture<ShowDigitalHumanBusinessCardResponse> showDigitalHumanBusinessCardAsync(
        ShowDigitalHumanBusinessCardRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.showDigitalHumanBusinessCard);
    }

    /**
     * 查询数字人名片制作任务详情
     *
     * 该接口用于查询数字人名片制作任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDigitalHumanBusinessCardRequest 请求对象
     * @return AsyncInvoker<ShowDigitalHumanBusinessCardRequest, ShowDigitalHumanBusinessCardResponse>
     */
    public AsyncInvoker<ShowDigitalHumanBusinessCardRequest, ShowDigitalHumanBusinessCardResponse> showDigitalHumanBusinessCardAsyncInvoker(
        ShowDigitalHumanBusinessCardRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.showDigitalHumanBusinessCard, hcClient);
    }

    /**
     * 更新数字人名片制作
     *
     * 该接口用于更新数字人名片制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDigitalHumanBusinessCardRequest 请求对象
     * @return CompletableFuture<UpdateDigitalHumanBusinessCardResponse>
     */
    public CompletableFuture<UpdateDigitalHumanBusinessCardResponse> updateDigitalHumanBusinessCardAsync(
        UpdateDigitalHumanBusinessCardRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.updateDigitalHumanBusinessCard);
    }

    /**
     * 更新数字人名片制作
     *
     * 该接口用于更新数字人名片制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDigitalHumanBusinessCardRequest 请求对象
     * @return AsyncInvoker<UpdateDigitalHumanBusinessCardRequest, UpdateDigitalHumanBusinessCardResponse>
     */
    public AsyncInvoker<UpdateDigitalHumanBusinessCardRequest, UpdateDigitalHumanBusinessCardResponse> updateDigitalHumanBusinessCardAsyncInvoker(
        UpdateDigitalHumanBusinessCardRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.updateDigitalHumanBusinessCard, hcClient);
    }

    /**
     * 查询视频制作任务列表
     *
     * 该接口用于查询视频制作任务列表。可查询分身数字人视频制作列表，照片数字人视频制作列表等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDigitalHumanVideoRequest 请求对象
     * @return CompletableFuture<ListDigitalHumanVideoResponse>
     */
    public CompletableFuture<ListDigitalHumanVideoResponse> listDigitalHumanVideoAsync(
        ListDigitalHumanVideoRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.listDigitalHumanVideo);
    }

    /**
     * 查询视频制作任务列表
     *
     * 该接口用于查询视频制作任务列表。可查询分身数字人视频制作列表，照片数字人视频制作列表等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDigitalHumanVideoRequest 请求对象
     * @return AsyncInvoker<ListDigitalHumanVideoRequest, ListDigitalHumanVideoResponse>
     */
    public AsyncInvoker<ListDigitalHumanVideoRequest, ListDigitalHumanVideoResponse> listDigitalHumanVideoAsyncInvoker(
        ListDigitalHumanVideoRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.listDigitalHumanVideo, hcClient);
    }

    /**
     * 取消等待中的分身数字人视频制作任务
     *
     * 该接口用于取消等待中的分身数字人视频制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Cancel2DDigitalHumanVideoRequest 请求对象
     * @return CompletableFuture<Cancel2DDigitalHumanVideoResponse>
     */
    public CompletableFuture<Cancel2DDigitalHumanVideoResponse> cancel2DDigitalHumanVideoAsync(
        Cancel2DDigitalHumanVideoRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.cancel2DDigitalHumanVideo);
    }

    /**
     * 取消等待中的分身数字人视频制作任务
     *
     * 该接口用于取消等待中的分身数字人视频制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Cancel2DDigitalHumanVideoRequest 请求对象
     * @return AsyncInvoker<Cancel2DDigitalHumanVideoRequest, Cancel2DDigitalHumanVideoResponse>
     */
    public AsyncInvoker<Cancel2DDigitalHumanVideoRequest, Cancel2DDigitalHumanVideoResponse> cancel2DDigitalHumanVideoAsyncInvoker(
        Cancel2DDigitalHumanVideoRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.cancel2DDigitalHumanVideo, hcClient);
    }

    /**
     * 创建分身数字人视频制作任务
     *
     * 该接口用于创建分身数字人视频制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Create2DDigitalHumanVideoRequest 请求对象
     * @return CompletableFuture<Create2DDigitalHumanVideoResponse>
     */
    public CompletableFuture<Create2DDigitalHumanVideoResponse> create2DDigitalHumanVideoAsync(
        Create2DDigitalHumanVideoRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.create2DDigitalHumanVideo);
    }

    /**
     * 创建分身数字人视频制作任务
     *
     * 该接口用于创建分身数字人视频制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Create2DDigitalHumanVideoRequest 请求对象
     * @return AsyncInvoker<Create2DDigitalHumanVideoRequest, Create2DDigitalHumanVideoResponse>
     */
    public AsyncInvoker<Create2DDigitalHumanVideoRequest, Create2DDigitalHumanVideoResponse> create2DDigitalHumanVideoAsyncInvoker(
        Create2DDigitalHumanVideoRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.create2DDigitalHumanVideo, hcClient);
    }

    /**
     * 查询分身数字人视频制作任务详情
     *
     * 该接口用于查询分身数字人视频制作任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Show2DDigitalHumanVideoRequest 请求对象
     * @return CompletableFuture<Show2DDigitalHumanVideoResponse>
     */
    public CompletableFuture<Show2DDigitalHumanVideoResponse> show2DDigitalHumanVideoAsync(
        Show2DDigitalHumanVideoRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.show2DDigitalHumanVideo);
    }

    /**
     * 查询分身数字人视频制作任务详情
     *
     * 该接口用于查询分身数字人视频制作任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Show2DDigitalHumanVideoRequest 请求对象
     * @return AsyncInvoker<Show2DDigitalHumanVideoRequest, Show2DDigitalHumanVideoResponse>
     */
    public AsyncInvoker<Show2DDigitalHumanVideoRequest, Show2DDigitalHumanVideoResponse> show2DDigitalHumanVideoAsyncInvoker(
        Show2DDigitalHumanVideoRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.show2DDigitalHumanVideo, hcClient);
    }

    /**
     * 取消等待中的照片分身数字人视频制作任务
     *
     * 该接口用于取消等待中的照片分身数字人视频制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelPhotoDigitalHumanVideoRequest 请求对象
     * @return CompletableFuture<CancelPhotoDigitalHumanVideoResponse>
     */
    public CompletableFuture<CancelPhotoDigitalHumanVideoResponse> cancelPhotoDigitalHumanVideoAsync(
        CancelPhotoDigitalHumanVideoRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.cancelPhotoDigitalHumanVideo);
    }

    /**
     * 取消等待中的照片分身数字人视频制作任务
     *
     * 该接口用于取消等待中的照片分身数字人视频制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelPhotoDigitalHumanVideoRequest 请求对象
     * @return AsyncInvoker<CancelPhotoDigitalHumanVideoRequest, CancelPhotoDigitalHumanVideoResponse>
     */
    public AsyncInvoker<CancelPhotoDigitalHumanVideoRequest, CancelPhotoDigitalHumanVideoResponse> cancelPhotoDigitalHumanVideoAsyncInvoker(
        CancelPhotoDigitalHumanVideoRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.cancelPhotoDigitalHumanVideo, hcClient);
    }

    /**
     * 创建照片检测任务
     *
     * 该接口用于创建照片检测任务，检测照片是否满足制作照片数字人的要求。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePhotoDetectionRequest 请求对象
     * @return CompletableFuture<CreatePhotoDetectionResponse>
     */
    public CompletableFuture<CreatePhotoDetectionResponse> createPhotoDetectionAsync(
        CreatePhotoDetectionRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createPhotoDetection);
    }

    /**
     * 创建照片检测任务
     *
     * 该接口用于创建照片检测任务，检测照片是否满足制作照片数字人的要求。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePhotoDetectionRequest 请求对象
     * @return AsyncInvoker<CreatePhotoDetectionRequest, CreatePhotoDetectionResponse>
     */
    public AsyncInvoker<CreatePhotoDetectionRequest, CreatePhotoDetectionResponse> createPhotoDetectionAsyncInvoker(
        CreatePhotoDetectionRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.createPhotoDetection, hcClient);
    }

    /**
     * 创建照片分身数字人视频制作任务
     *
     * 该接口用于创建照片分身数字人视频制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePhotoDigitalHumanVideoRequest 请求对象
     * @return CompletableFuture<CreatePhotoDigitalHumanVideoResponse>
     */
    public CompletableFuture<CreatePhotoDigitalHumanVideoResponse> createPhotoDigitalHumanVideoAsync(
        CreatePhotoDigitalHumanVideoRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createPhotoDigitalHumanVideo);
    }

    /**
     * 创建照片分身数字人视频制作任务
     *
     * 该接口用于创建照片分身数字人视频制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePhotoDigitalHumanVideoRequest 请求对象
     * @return AsyncInvoker<CreatePhotoDigitalHumanVideoRequest, CreatePhotoDigitalHumanVideoResponse>
     */
    public AsyncInvoker<CreatePhotoDigitalHumanVideoRequest, CreatePhotoDigitalHumanVideoResponse> createPhotoDigitalHumanVideoAsyncInvoker(
        CreatePhotoDigitalHumanVideoRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.createPhotoDigitalHumanVideo, hcClient);
    }

    /**
     * 查询照片检测任务详情
     *
     * 该接口用于查询照片检测任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPhotoDetectionRequest 请求对象
     * @return CompletableFuture<ShowPhotoDetectionResponse>
     */
    public CompletableFuture<ShowPhotoDetectionResponse> showPhotoDetectionAsync(ShowPhotoDetectionRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.showPhotoDetection);
    }

    /**
     * 查询照片检测任务详情
     *
     * 该接口用于查询照片检测任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPhotoDetectionRequest 请求对象
     * @return AsyncInvoker<ShowPhotoDetectionRequest, ShowPhotoDetectionResponse>
     */
    public AsyncInvoker<ShowPhotoDetectionRequest, ShowPhotoDetectionResponse> showPhotoDetectionAsyncInvoker(
        ShowPhotoDetectionRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.showPhotoDetection, hcClient);
    }

    /**
     * 查询照片分身数字人视频制作任务详情
     *
     * 该接口用于查询照片分身数字人视频制作任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPhotoDigitalHumanVideoRequest 请求对象
     * @return CompletableFuture<ShowPhotoDigitalHumanVideoResponse>
     */
    public CompletableFuture<ShowPhotoDigitalHumanVideoResponse> showPhotoDigitalHumanVideoAsync(
        ShowPhotoDigitalHumanVideoRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.showPhotoDigitalHumanVideo);
    }

    /**
     * 查询照片分身数字人视频制作任务详情
     *
     * 该接口用于查询照片分身数字人视频制作任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPhotoDigitalHumanVideoRequest 请求对象
     * @return AsyncInvoker<ShowPhotoDigitalHumanVideoRequest, ShowPhotoDigitalHumanVideoResponse>
     */
    public AsyncInvoker<ShowPhotoDigitalHumanVideoRequest, ShowPhotoDigitalHumanVideoResponse> showPhotoDigitalHumanVideoAsyncInvoker(
        ShowPhotoDigitalHumanVideoRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.showPhotoDigitalHumanVideo, hcClient);
    }

    /**
     * 确认文件已上传
     *
     * 资产文件上传完毕后，通过该接口确认上传完成。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmFileUploadRequest 请求对象
     * @return CompletableFuture<ConfirmFileUploadResponse>
     */
    public CompletableFuture<ConfirmFileUploadResponse> confirmFileUploadAsync(ConfirmFileUploadRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.confirmFileUpload);
    }

    /**
     * 确认文件已上传
     *
     * 资产文件上传完毕后，通过该接口确认上传完成。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmFileUploadRequest 请求对象
     * @return AsyncInvoker<ConfirmFileUploadRequest, ConfirmFileUploadResponse>
     */
    public AsyncInvoker<ConfirmFileUploadRequest, ConfirmFileUploadResponse> confirmFileUploadAsyncInvoker(
        ConfirmFileUploadRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.confirmFileUpload, hcClient);
    }

    /**
     * 创建文件并获取上传URL
     *
     * 该接口用于创建文件并获取上传URL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFileRequest 请求对象
     * @return CompletableFuture<CreateFileResponse>
     */
    public CompletableFuture<CreateFileResponse> createFileAsync(CreateFileRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createFile);
    }

    /**
     * 创建文件并获取上传URL
     *
     * 该接口用于创建文件并获取上传URL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFileRequest 请求对象
     * @return AsyncInvoker<CreateFileRequest, CreateFileResponse>
     */
    public AsyncInvoker<CreateFileRequest, CreateFileResponse> createFileAsyncInvoker(CreateFileRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.createFile, hcClient);
    }

    /**
     * 创建大文件
     *
     * 该接口用于创建大文件（超过5G），获取分段上传URL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLargeFileRequest 请求对象
     * @return CompletableFuture<CreateLargeFileResponse>
     */
    public CompletableFuture<CreateLargeFileResponse> createLargeFileAsync(CreateLargeFileRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createLargeFile);
    }

    /**
     * 创建大文件
     *
     * 该接口用于创建大文件（超过5G），获取分段上传URL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLargeFileRequest 请求对象
     * @return AsyncInvoker<CreateLargeFileRequest, CreateLargeFileResponse>
     */
    public AsyncInvoker<CreateLargeFileRequest, CreateLargeFileResponse> createLargeFileAsyncInvoker(
        CreateLargeFileRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.createLargeFile, hcClient);
    }

    /**
     * 删除文件
     *
     * 该接口用于删除媒体资产库中指定的文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFileRequest 请求对象
     * @return CompletableFuture<DeleteFileResponse>
     */
    public CompletableFuture<DeleteFileResponse> deleteFileAsync(DeleteFileRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.deleteFile);
    }

    /**
     * 删除文件
     *
     * 该接口用于删除媒体资产库中指定的文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFileRequest 请求对象
     * @return AsyncInvoker<DeleteFileRequest, DeleteFileResponse>
     */
    public AsyncInvoker<DeleteFileRequest, DeleteFileResponse> deleteFileAsyncInvoker(DeleteFileRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.deleteFile, hcClient);
    }

    /**
     * 创建热点问题
     *
     * 该接口用于创建热点问题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHotQuestionRequest 请求对象
     * @return CompletableFuture<CreateHotQuestionResponse>
     */
    public CompletableFuture<CreateHotQuestionResponse> createHotQuestionAsync(CreateHotQuestionRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createHotQuestion);
    }

    /**
     * 创建热点问题
     *
     * 该接口用于创建热点问题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHotQuestionRequest 请求对象
     * @return AsyncInvoker<CreateHotQuestionRequest, CreateHotQuestionResponse>
     */
    public AsyncInvoker<CreateHotQuestionRequest, CreateHotQuestionResponse> createHotQuestionAsyncInvoker(
        CreateHotQuestionRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.createHotQuestion, hcClient);
    }

    /**
     * 删除热点问题
     *
     * 该接口用于删除热点问题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHotQuestionRequest 请求对象
     * @return CompletableFuture<DeleteHotQuestionResponse>
     */
    public CompletableFuture<DeleteHotQuestionResponse> deleteHotQuestionAsync(DeleteHotQuestionRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.deleteHotQuestion);
    }

    /**
     * 删除热点问题
     *
     * 该接口用于删除热点问题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHotQuestionRequest 请求对象
     * @return AsyncInvoker<DeleteHotQuestionRequest, DeleteHotQuestionResponse>
     */
    public AsyncInvoker<DeleteHotQuestionRequest, DeleteHotQuestionResponse> deleteHotQuestionAsyncInvoker(
        DeleteHotQuestionRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.deleteHotQuestion, hcClient);
    }

    /**
     * 查询热点问题列表
     *
     * 该接口用于查询热点问题列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHotQuestionRequest 请求对象
     * @return CompletableFuture<ListHotQuestionResponse>
     */
    public CompletableFuture<ListHotQuestionResponse> listHotQuestionAsync(ListHotQuestionRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.listHotQuestion);
    }

    /**
     * 查询热点问题列表
     *
     * 该接口用于查询热点问题列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHotQuestionRequest 请求对象
     * @return AsyncInvoker<ListHotQuestionRequest, ListHotQuestionResponse>
     */
    public AsyncInvoker<ListHotQuestionRequest, ListHotQuestionResponse> listHotQuestionAsyncInvoker(
        ListHotQuestionRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.listHotQuestion, hcClient);
    }

    /**
     * 查询热点问题详情
     *
     * 该接口用于查询热点问题详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHotQuestionRequest 请求对象
     * @return CompletableFuture<ShowHotQuestionResponse>
     */
    public CompletableFuture<ShowHotQuestionResponse> showHotQuestionAsync(ShowHotQuestionRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.showHotQuestion);
    }

    /**
     * 查询热点问题详情
     *
     * 该接口用于查询热点问题详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHotQuestionRequest 请求对象
     * @return AsyncInvoker<ShowHotQuestionRequest, ShowHotQuestionResponse>
     */
    public AsyncInvoker<ShowHotQuestionRequest, ShowHotQuestionResponse> showHotQuestionAsyncInvoker(
        ShowHotQuestionRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.showHotQuestion, hcClient);
    }

    /**
     * 修改热点问题
     *
     * 该接口用于修改热点问题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHotQuestionRequest 请求对象
     * @return CompletableFuture<UpdateHotQuestionResponse>
     */
    public CompletableFuture<UpdateHotQuestionResponse> updateHotQuestionAsync(UpdateHotQuestionRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.updateHotQuestion);
    }

    /**
     * 修改热点问题
     *
     * 该接口用于修改热点问题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHotQuestionRequest 请求对象
     * @return AsyncInvoker<UpdateHotQuestionRequest, UpdateHotQuestionResponse>
     */
    public AsyncInvoker<UpdateHotQuestionRequest, UpdateHotQuestionResponse> updateHotQuestionAsyncInvoker(
        UpdateHotQuestionRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.updateHotQuestion, hcClient);
    }

    /**
     * 创建热词记录
     *
     * 该接口用于创建热词记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHotWordsRequest 请求对象
     * @return CompletableFuture<CreateHotWordsResponse>
     */
    public CompletableFuture<CreateHotWordsResponse> createHotWordsAsync(CreateHotWordsRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createHotWords);
    }

    /**
     * 创建热词记录
     *
     * 该接口用于创建热词记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHotWordsRequest 请求对象
     * @return AsyncInvoker<CreateHotWordsRequest, CreateHotWordsResponse>
     */
    public AsyncInvoker<CreateHotWordsRequest, CreateHotWordsResponse> createHotWordsAsyncInvoker(
        CreateHotWordsRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.createHotWords, hcClient);
    }

    /**
     * 删除热词记录
     *
     * 该接口用于删除热词记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHotWordsRequest 请求对象
     * @return CompletableFuture<DeleteHotWordsResponse>
     */
    public CompletableFuture<DeleteHotWordsResponse> deleteHotWordsAsync(DeleteHotWordsRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.deleteHotWords);
    }

    /**
     * 删除热词记录
     *
     * 该接口用于删除热词记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHotWordsRequest 请求对象
     * @return AsyncInvoker<DeleteHotWordsRequest, DeleteHotWordsResponse>
     */
    public AsyncInvoker<DeleteHotWordsRequest, DeleteHotWordsResponse> deleteHotWordsAsyncInvoker(
        DeleteHotWordsRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.deleteHotWords, hcClient);
    }

    /**
     * 查询热词记录列表
     *
     * 该接口用于查询热词记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHotWordsRequest 请求对象
     * @return CompletableFuture<ListHotWordsResponse>
     */
    public CompletableFuture<ListHotWordsResponse> listHotWordsAsync(ListHotWordsRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.listHotWords);
    }

    /**
     * 查询热词记录列表
     *
     * 该接口用于查询热词记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHotWordsRequest 请求对象
     * @return AsyncInvoker<ListHotWordsRequest, ListHotWordsResponse>
     */
    public AsyncInvoker<ListHotWordsRequest, ListHotWordsResponse> listHotWordsAsyncInvoker(
        ListHotWordsRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.listHotWords, hcClient);
    }

    /**
     * 查询配置热词记录详情
     *
     * 该接口用于查询热词记录详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHotWordsRequest 请求对象
     * @return CompletableFuture<ShowHotWordsResponse>
     */
    public CompletableFuture<ShowHotWordsResponse> showHotWordsAsync(ShowHotWordsRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.showHotWords);
    }

    /**
     * 查询配置热词记录详情
     *
     * 该接口用于查询热词记录详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHotWordsRequest 请求对象
     * @return AsyncInvoker<ShowHotWordsRequest, ShowHotWordsResponse>
     */
    public AsyncInvoker<ShowHotWordsRequest, ShowHotWordsResponse> showHotWordsAsyncInvoker(
        ShowHotWordsRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.showHotWords, hcClient);
    }

    /**
     * 查询热词功能开关
     *
     * 该接口用于查询热词功能开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHotWordsSwitchRequest 请求对象
     * @return CompletableFuture<ShowHotWordsSwitchResponse>
     */
    public CompletableFuture<ShowHotWordsSwitchResponse> showHotWordsSwitchAsync(ShowHotWordsSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.showHotWordsSwitch);
    }

    /**
     * 查询热词功能开关
     *
     * 该接口用于查询热词功能开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHotWordsSwitchRequest 请求对象
     * @return AsyncInvoker<ShowHotWordsSwitchRequest, ShowHotWordsSwitchResponse>
     */
    public AsyncInvoker<ShowHotWordsSwitchRequest, ShowHotWordsSwitchResponse> showHotWordsSwitchAsyncInvoker(
        ShowHotWordsSwitchRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.showHotWordsSwitch, hcClient);
    }

    /**
     * 修改热词记录
     *
     * 该接口用于修改热词记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHotWordsRequest 请求对象
     * @return CompletableFuture<UpdateHotWordsResponse>
     */
    public CompletableFuture<UpdateHotWordsResponse> updateHotWordsAsync(UpdateHotWordsRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.updateHotWords);
    }

    /**
     * 修改热词记录
     *
     * 该接口用于修改热词记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHotWordsRequest 请求对象
     * @return AsyncInvoker<UpdateHotWordsRequest, UpdateHotWordsResponse>
     */
    public AsyncInvoker<UpdateHotWordsRequest, UpdateHotWordsResponse> updateHotWordsAsyncInvoker(
        UpdateHotWordsRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.updateHotWords, hcClient);
    }

    /**
     * 修改热词功能开关
     *
     * 该接口用于修改热词功能开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHotWordsSwitchRequest 请求对象
     * @return CompletableFuture<UpdateHotWordsSwitchResponse>
     */
    public CompletableFuture<UpdateHotWordsSwitchResponse> updateHotWordsSwitchAsync(
        UpdateHotWordsSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.updateHotWordsSwitch);
    }

    /**
     * 修改热词功能开关
     *
     * 该接口用于修改热词功能开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHotWordsSwitchRequest 请求对象
     * @return AsyncInvoker<UpdateHotWordsSwitchRequest, UpdateHotWordsSwitchResponse>
     */
    public AsyncInvoker<UpdateHotWordsSwitchRequest, UpdateHotWordsSwitchResponse> updateHotWordsSwitchAsyncInvoker(
        UpdateHotWordsSwitchRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.updateHotWordsSwitch, hcClient);
    }

    /**
     * 创建知识库意图和问法
     *
     * 该接口用于创建知识库意图和问法。一个意图包含一个主题，一个答案，若干个问法等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIntentAndQuestionRequest 请求对象
     * @return CompletableFuture<CreateIntentAndQuestionResponse>
     */
    public CompletableFuture<CreateIntentAndQuestionResponse> createIntentAndQuestionAsync(
        CreateIntentAndQuestionRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createIntentAndQuestion);
    }

    /**
     * 创建知识库意图和问法
     *
     * 该接口用于创建知识库意图和问法。一个意图包含一个主题，一个答案，若干个问法等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIntentAndQuestionRequest 请求对象
     * @return AsyncInvoker<CreateIntentAndQuestionRequest, CreateIntentAndQuestionResponse>
     */
    public AsyncInvoker<CreateIntentAndQuestionRequest, CreateIntentAndQuestionResponse> createIntentAndQuestionAsyncInvoker(
        CreateIntentAndQuestionRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.createIntentAndQuestion, hcClient);
    }

    /**
     * 创建知识库意图
     *
     * 该接口用于创建知识库意图。一个意图包含一个主题，一个答案，若干个问法等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKnowledgeIntentRequest 请求对象
     * @return CompletableFuture<CreateKnowledgeIntentResponse>
     */
    public CompletableFuture<CreateKnowledgeIntentResponse> createKnowledgeIntentAsync(
        CreateKnowledgeIntentRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createKnowledgeIntent);
    }

    /**
     * 创建知识库意图
     *
     * 该接口用于创建知识库意图。一个意图包含一个主题，一个答案，若干个问法等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKnowledgeIntentRequest 请求对象
     * @return AsyncInvoker<CreateKnowledgeIntentRequest, CreateKnowledgeIntentResponse>
     */
    public AsyncInvoker<CreateKnowledgeIntentRequest, CreateKnowledgeIntentResponse> createKnowledgeIntentAsyncInvoker(
        CreateKnowledgeIntentRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.createKnowledgeIntent, hcClient);
    }

    /**
     * 删除知识库意图
     *
     * 该接口用于删除知识库意图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKnowledgeIntentRequest 请求对象
     * @return CompletableFuture<DeleteKnowledgeIntentResponse>
     */
    public CompletableFuture<DeleteKnowledgeIntentResponse> deleteKnowledgeIntentAsync(
        DeleteKnowledgeIntentRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.deleteKnowledgeIntent);
    }

    /**
     * 删除知识库意图
     *
     * 该接口用于删除知识库意图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKnowledgeIntentRequest 请求对象
     * @return AsyncInvoker<DeleteKnowledgeIntentRequest, DeleteKnowledgeIntentResponse>
     */
    public AsyncInvoker<DeleteKnowledgeIntentRequest, DeleteKnowledgeIntentResponse> deleteKnowledgeIntentAsyncInvoker(
        DeleteKnowledgeIntentRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.deleteKnowledgeIntent, hcClient);
    }

    /**
     * 查询知识库意图列表
     *
     * 该接口用于查询知识库意图列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKnowledgeIntentRequest 请求对象
     * @return CompletableFuture<ListKnowledgeIntentResponse>
     */
    public CompletableFuture<ListKnowledgeIntentResponse> listKnowledgeIntentAsync(ListKnowledgeIntentRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.listKnowledgeIntent);
    }

    /**
     * 查询知识库意图列表
     *
     * 该接口用于查询知识库意图列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKnowledgeIntentRequest 请求对象
     * @return AsyncInvoker<ListKnowledgeIntentRequest, ListKnowledgeIntentResponse>
     */
    public AsyncInvoker<ListKnowledgeIntentRequest, ListKnowledgeIntentResponse> listKnowledgeIntentAsyncInvoker(
        ListKnowledgeIntentRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.listKnowledgeIntent, hcClient);
    }

    /**
     * 查询知识库意图详情
     *
     * 该接口用于查询知识库意图详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKnowledgeIntentRequest 请求对象
     * @return CompletableFuture<ShowKnowledgeIntentResponse>
     */
    public CompletableFuture<ShowKnowledgeIntentResponse> showKnowledgeIntentAsync(ShowKnowledgeIntentRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.showKnowledgeIntent);
    }

    /**
     * 查询知识库意图详情
     *
     * 该接口用于查询知识库意图详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKnowledgeIntentRequest 请求对象
     * @return AsyncInvoker<ShowKnowledgeIntentRequest, ShowKnowledgeIntentResponse>
     */
    public AsyncInvoker<ShowKnowledgeIntentRequest, ShowKnowledgeIntentResponse> showKnowledgeIntentAsyncInvoker(
        ShowKnowledgeIntentRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.showKnowledgeIntent, hcClient);
    }

    /**
     * 修改知识库意图
     *
     * 该接口用于修改知识库意图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKnowledgeIntentRequest 请求对象
     * @return CompletableFuture<UpdateKnowledgeIntentResponse>
     */
    public CompletableFuture<UpdateKnowledgeIntentResponse> updateKnowledgeIntentAsync(
        UpdateKnowledgeIntentRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.updateKnowledgeIntent);
    }

    /**
     * 修改知识库意图
     *
     * 该接口用于修改知识库意图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKnowledgeIntentRequest 请求对象
     * @return AsyncInvoker<UpdateKnowledgeIntentRequest, UpdateKnowledgeIntentResponse>
     */
    public AsyncInvoker<UpdateKnowledgeIntentRequest, UpdateKnowledgeIntentResponse> updateKnowledgeIntentAsyncInvoker(
        UpdateKnowledgeIntentRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.updateKnowledgeIntent, hcClient);
    }

    /**
     * 批量创建知识库问法
     *
     * 该接口用于批量创建知识库问法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBatchKnowledgeQuestionRequest 请求对象
     * @return CompletableFuture<CreateBatchKnowledgeQuestionResponse>
     */
    public CompletableFuture<CreateBatchKnowledgeQuestionResponse> createBatchKnowledgeQuestionAsync(
        CreateBatchKnowledgeQuestionRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createBatchKnowledgeQuestion);
    }

    /**
     * 批量创建知识库问法
     *
     * 该接口用于批量创建知识库问法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBatchKnowledgeQuestionRequest 请求对象
     * @return AsyncInvoker<CreateBatchKnowledgeQuestionRequest, CreateBatchKnowledgeQuestionResponse>
     */
    public AsyncInvoker<CreateBatchKnowledgeQuestionRequest, CreateBatchKnowledgeQuestionResponse> createBatchKnowledgeQuestionAsyncInvoker(
        CreateBatchKnowledgeQuestionRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.createBatchKnowledgeQuestion, hcClient);
    }

    /**
     * 创建知识库问法
     *
     * 该接口用于创建知识库问法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKnowledgeQuestionRequest 请求对象
     * @return CompletableFuture<CreateKnowledgeQuestionResponse>
     */
    public CompletableFuture<CreateKnowledgeQuestionResponse> createKnowledgeQuestionAsync(
        CreateKnowledgeQuestionRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createKnowledgeQuestion);
    }

    /**
     * 创建知识库问法
     *
     * 该接口用于创建知识库问法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKnowledgeQuestionRequest 请求对象
     * @return AsyncInvoker<CreateKnowledgeQuestionRequest, CreateKnowledgeQuestionResponse>
     */
    public AsyncInvoker<CreateKnowledgeQuestionRequest, CreateKnowledgeQuestionResponse> createKnowledgeQuestionAsyncInvoker(
        CreateKnowledgeQuestionRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.createKnowledgeQuestion, hcClient);
    }

    /**
     * 删除知识库问法
     *
     * 该接口用于删除知识库问法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKnowledgeQuestionRequest 请求对象
     * @return CompletableFuture<DeleteKnowledgeQuestionResponse>
     */
    public CompletableFuture<DeleteKnowledgeQuestionResponse> deleteKnowledgeQuestionAsync(
        DeleteKnowledgeQuestionRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.deleteKnowledgeQuestion);
    }

    /**
     * 删除知识库问法
     *
     * 该接口用于删除知识库问法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKnowledgeQuestionRequest 请求对象
     * @return AsyncInvoker<DeleteKnowledgeQuestionRequest, DeleteKnowledgeQuestionResponse>
     */
    public AsyncInvoker<DeleteKnowledgeQuestionRequest, DeleteKnowledgeQuestionResponse> deleteKnowledgeQuestionAsyncInvoker(
        DeleteKnowledgeQuestionRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.deleteKnowledgeQuestion, hcClient);
    }

    /**
     * 查询知识库问法列表
     *
     * 该接口用于查询知识库问法列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKnowledgeQuestionRequest 请求对象
     * @return CompletableFuture<ListKnowledgeQuestionResponse>
     */
    public CompletableFuture<ListKnowledgeQuestionResponse> listKnowledgeQuestionAsync(
        ListKnowledgeQuestionRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.listKnowledgeQuestion);
    }

    /**
     * 查询知识库问法列表
     *
     * 该接口用于查询知识库问法列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKnowledgeQuestionRequest 请求对象
     * @return AsyncInvoker<ListKnowledgeQuestionRequest, ListKnowledgeQuestionResponse>
     */
    public AsyncInvoker<ListKnowledgeQuestionRequest, ListKnowledgeQuestionResponse> listKnowledgeQuestionAsyncInvoker(
        ListKnowledgeQuestionRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.listKnowledgeQuestion, hcClient);
    }

    /**
     * 查询知识库问法详情
     *
     * 该接口用于查询知识库问法详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKnowledgeQuestionRequest 请求对象
     * @return CompletableFuture<ShowKnowledgeQuestionResponse>
     */
    public CompletableFuture<ShowKnowledgeQuestionResponse> showKnowledgeQuestionAsync(
        ShowKnowledgeQuestionRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.showKnowledgeQuestion);
    }

    /**
     * 查询知识库问法详情
     *
     * 该接口用于查询知识库问法详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKnowledgeQuestionRequest 请求对象
     * @return AsyncInvoker<ShowKnowledgeQuestionRequest, ShowKnowledgeQuestionResponse>
     */
    public AsyncInvoker<ShowKnowledgeQuestionRequest, ShowKnowledgeQuestionResponse> showKnowledgeQuestionAsyncInvoker(
        ShowKnowledgeQuestionRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.showKnowledgeQuestion, hcClient);
    }

    /**
     * 批量修改知识库问法
     *
     * 该接口用于批量修改知识库问法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBatchKnowledgeQuestionRequest 请求对象
     * @return CompletableFuture<UpdateBatchKnowledgeQuestionResponse>
     */
    public CompletableFuture<UpdateBatchKnowledgeQuestionResponse> updateBatchKnowledgeQuestionAsync(
        UpdateBatchKnowledgeQuestionRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.updateBatchKnowledgeQuestion);
    }

    /**
     * 批量修改知识库问法
     *
     * 该接口用于批量修改知识库问法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBatchKnowledgeQuestionRequest 请求对象
     * @return AsyncInvoker<UpdateBatchKnowledgeQuestionRequest, UpdateBatchKnowledgeQuestionResponse>
     */
    public AsyncInvoker<UpdateBatchKnowledgeQuestionRequest, UpdateBatchKnowledgeQuestionResponse> updateBatchKnowledgeQuestionAsyncInvoker(
        UpdateBatchKnowledgeQuestionRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.updateBatchKnowledgeQuestion, hcClient);
    }

    /**
     * 修改知识库问法
     *
     * 该接口用于修改知识库问法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKnowledgeQuestionRequest 请求对象
     * @return CompletableFuture<UpdateKnowledgeQuestionResponse>
     */
    public CompletableFuture<UpdateKnowledgeQuestionResponse> updateKnowledgeQuestionAsync(
        UpdateKnowledgeQuestionRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.updateKnowledgeQuestion);
    }

    /**
     * 修改知识库问法
     *
     * 该接口用于修改知识库问法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKnowledgeQuestionRequest 请求对象
     * @return AsyncInvoker<UpdateKnowledgeQuestionRequest, UpdateKnowledgeQuestionResponse>
     */
    public AsyncInvoker<UpdateKnowledgeQuestionRequest, UpdateKnowledgeQuestionResponse> updateKnowledgeQuestionAsyncInvoker(
        UpdateKnowledgeQuestionRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.updateKnowledgeQuestion, hcClient);
    }

    /**
     * 创建知识库技能
     *
     * 该接口用于创建知识库技能。一个技能用于特定场景的交互问答，包含若干个意图等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKnowledgeSkillRequest 请求对象
     * @return CompletableFuture<CreateKnowledgeSkillResponse>
     */
    public CompletableFuture<CreateKnowledgeSkillResponse> createKnowledgeSkillAsync(
        CreateKnowledgeSkillRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createKnowledgeSkill);
    }

    /**
     * 创建知识库技能
     *
     * 该接口用于创建知识库技能。一个技能用于特定场景的交互问答，包含若干个意图等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateKnowledgeSkillRequest 请求对象
     * @return AsyncInvoker<CreateKnowledgeSkillRequest, CreateKnowledgeSkillResponse>
     */
    public AsyncInvoker<CreateKnowledgeSkillRequest, CreateKnowledgeSkillResponse> createKnowledgeSkillAsyncInvoker(
        CreateKnowledgeSkillRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.createKnowledgeSkill, hcClient);
    }

    /**
     * 删除知识库技能
     *
     * 该接口用于删除知识库技能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKnowledgeSkillRequest 请求对象
     * @return CompletableFuture<DeleteKnowledgeSkillResponse>
     */
    public CompletableFuture<DeleteKnowledgeSkillResponse> deleteKnowledgeSkillAsync(
        DeleteKnowledgeSkillRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.deleteKnowledgeSkill);
    }

    /**
     * 删除知识库技能
     *
     * 该接口用于删除知识库技能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteKnowledgeSkillRequest 请求对象
     * @return AsyncInvoker<DeleteKnowledgeSkillRequest, DeleteKnowledgeSkillResponse>
     */
    public AsyncInvoker<DeleteKnowledgeSkillRequest, DeleteKnowledgeSkillResponse> deleteKnowledgeSkillAsyncInvoker(
        DeleteKnowledgeSkillRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.deleteKnowledgeSkill, hcClient);
    }

    /**
     * 导出知识库技能
     *
     * 该接口用于导出知识库技能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportKnowledgeSkillRequest 请求对象
     * @return CompletableFuture<ExportKnowledgeSkillResponse>
     */
    public CompletableFuture<ExportKnowledgeSkillResponse> exportKnowledgeSkillAsync(
        ExportKnowledgeSkillRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.exportKnowledgeSkill);
    }

    /**
     * 导出知识库技能
     *
     * 该接口用于导出知识库技能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportKnowledgeSkillRequest 请求对象
     * @return AsyncInvoker<ExportKnowledgeSkillRequest, ExportKnowledgeSkillResponse>
     */
    public AsyncInvoker<ExportKnowledgeSkillRequest, ExportKnowledgeSkillResponse> exportKnowledgeSkillAsyncInvoker(
        ExportKnowledgeSkillRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.exportKnowledgeSkill, hcClient);
    }

    /**
     * 查询知识库技能列表
     *
     * 该接口用于查询知识库技能列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKnowledgeSkillRequest 请求对象
     * @return CompletableFuture<ListKnowledgeSkillResponse>
     */
    public CompletableFuture<ListKnowledgeSkillResponse> listKnowledgeSkillAsync(ListKnowledgeSkillRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.listKnowledgeSkill);
    }

    /**
     * 查询知识库技能列表
     *
     * 该接口用于查询知识库技能列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKnowledgeSkillRequest 请求对象
     * @return AsyncInvoker<ListKnowledgeSkillRequest, ListKnowledgeSkillResponse>
     */
    public AsyncInvoker<ListKnowledgeSkillRequest, ListKnowledgeSkillResponse> listKnowledgeSkillAsyncInvoker(
        ListKnowledgeSkillRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.listKnowledgeSkill, hcClient);
    }

    /**
     * 查询知识库技能详情
     *
     * 该接口用于查询知识库技能详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKnowledgeSkillRequest 请求对象
     * @return CompletableFuture<ShowKnowledgeSkillResponse>
     */
    public CompletableFuture<ShowKnowledgeSkillResponse> showKnowledgeSkillAsync(ShowKnowledgeSkillRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.showKnowledgeSkill);
    }

    /**
     * 查询知识库技能详情
     *
     * 该接口用于查询知识库技能详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKnowledgeSkillRequest 请求对象
     * @return AsyncInvoker<ShowKnowledgeSkillRequest, ShowKnowledgeSkillResponse>
     */
    public AsyncInvoker<ShowKnowledgeSkillRequest, ShowKnowledgeSkillResponse> showKnowledgeSkillAsyncInvoker(
        ShowKnowledgeSkillRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.showKnowledgeSkill, hcClient);
    }

    /**
     * 修改知识库技能
     *
     * 该接口用于修改知识库技能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKnowledgeSkillRequest 请求对象
     * @return CompletableFuture<UpdateKnowledgeSkillResponse>
     */
    public CompletableFuture<UpdateKnowledgeSkillResponse> updateKnowledgeSkillAsync(
        UpdateKnowledgeSkillRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.updateKnowledgeSkill);
    }

    /**
     * 修改知识库技能
     *
     * 该接口用于修改知识库技能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateKnowledgeSkillRequest 请求对象
     * @return AsyncInvoker<UpdateKnowledgeSkillRequest, UpdateKnowledgeSkillResponse>
     */
    public AsyncInvoker<UpdateKnowledgeSkillRequest, UpdateKnowledgeSkillResponse> updateKnowledgeSkillAsyncInvoker(
        UpdateKnowledgeSkillRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.updateKnowledgeSkill, hcClient);
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
     * @return CompletableFuture<CreateOnceCodeResponse>
     */
    public CompletableFuture<CreateOnceCodeResponse> createOnceCodeAsync(CreateOnceCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createOnceCode);
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
     * @return AsyncInvoker<CreateOnceCodeRequest, CreateOnceCodeResponse>
     */
    public AsyncInvoker<CreateOnceCodeRequest, CreateOnceCodeResponse> createOnceCodeAsyncInvoker(
        CreateOnceCodeRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.createOnceCode, hcClient);
    }

    /**
     * 基于图片URL创建照片建模任务
     *
     * 该接口用于从URL中获取图片进行照片建模任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePictureModelingByUrlJobRequest 请求对象
     * @return CompletableFuture<CreatePictureModelingByUrlJobResponse>
     */
    public CompletableFuture<CreatePictureModelingByUrlJobResponse> createPictureModelingByUrlJobAsync(
        CreatePictureModelingByUrlJobRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createPictureModelingByUrlJob);
    }

    /**
     * 基于图片URL创建照片建模任务
     *
     * 该接口用于从URL中获取图片进行照片建模任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePictureModelingByUrlJobRequest 请求对象
     * @return AsyncInvoker<CreatePictureModelingByUrlJobRequest, CreatePictureModelingByUrlJobResponse>
     */
    public AsyncInvoker<CreatePictureModelingByUrlJobRequest, CreatePictureModelingByUrlJobResponse> createPictureModelingByUrlJobAsyncInvoker(
        CreatePictureModelingByUrlJobRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.createPictureModelingByUrlJob, hcClient);
    }

    /**
     * 创建照片建模任务
     *
     * 该接口用于创建风格化照片建模任务。通过上传照片，生成风格化数字人模型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePictureModelingJobRequest 请求对象
     * @return CompletableFuture<CreatePictureModelingJobResponse>
     */
    public CompletableFuture<CreatePictureModelingJobResponse> createPictureModelingJobAsync(
        CreatePictureModelingJobRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createPictureModelingJob);
    }

    /**
     * 创建照片建模任务
     *
     * 该接口用于创建风格化照片建模任务。通过上传照片，生成风格化数字人模型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePictureModelingJobRequest 请求对象
     * @return AsyncInvoker<CreatePictureModelingJobRequest, CreatePictureModelingJobResponse>
     */
    public AsyncInvoker<CreatePictureModelingJobRequest, CreatePictureModelingJobResponse> createPictureModelingJobAsyncInvoker(
        CreatePictureModelingJobRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.createPictureModelingJob, hcClient);
    }

    /**
     * 照片建模任务列表查询
     *
     * 该接口用于查询风格化照片建模任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPictureModelingJobsRequest 请求对象
     * @return CompletableFuture<ListPictureModelingJobsResponse>
     */
    public CompletableFuture<ListPictureModelingJobsResponse> listPictureModelingJobsAsync(
        ListPictureModelingJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.listPictureModelingJobs);
    }

    /**
     * 照片建模任务列表查询
     *
     * 该接口用于查询风格化照片建模任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPictureModelingJobsRequest 请求对象
     * @return AsyncInvoker<ListPictureModelingJobsRequest, ListPictureModelingJobsResponse>
     */
    public AsyncInvoker<ListPictureModelingJobsRequest, ListPictureModelingJobsResponse> listPictureModelingJobsAsyncInvoker(
        ListPictureModelingJobsRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.listPictureModelingJobs, hcClient);
    }

    /**
     * 照片建模任务详情查询
     *
     * 该接口用于风格化查询照片建模任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPictureModelingJobRequest 请求对象
     * @return CompletableFuture<ShowPictureModelingJobResponse>
     */
    public CompletableFuture<ShowPictureModelingJobResponse> showPictureModelingJobAsync(
        ShowPictureModelingJobRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.showPictureModelingJob);
    }

    /**
     * 照片建模任务详情查询
     *
     * 该接口用于风格化查询照片建模任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPictureModelingJobRequest 请求对象
     * @return AsyncInvoker<ShowPictureModelingJobRequest, ShowPictureModelingJobResponse>
     */
    public AsyncInvoker<ShowPictureModelingJobRequest, ShowPictureModelingJobResponse> showPictureModelingJobAsyncInvoker(
        ShowPictureModelingJobRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.showPictureModelingJob, hcClient);
    }

    /**
     * 创建商品
     *
     * Create product
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProductRequest 请求对象
     * @return CompletableFuture<CreateProductResponse>
     */
    public CompletableFuture<CreateProductResponse> createProductAsync(CreateProductRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createProduct);
    }

    /**
     * 创建商品
     *
     * Create product
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProductRequest 请求对象
     * @return AsyncInvoker<CreateProductRequest, CreateProductResponse>
     */
    public AsyncInvoker<CreateProductRequest, CreateProductResponse> createProductAsyncInvoker(
        CreateProductRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.createProduct, hcClient);
    }

    /**
     * 删除商品
     *
     * 删除商品
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProductRequest 请求对象
     * @return CompletableFuture<DeleteProductResponse>
     */
    public CompletableFuture<DeleteProductResponse> deleteProductAsync(DeleteProductRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.deleteProduct);
    }

    /**
     * 删除商品
     *
     * 删除商品
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProductRequest 请求对象
     * @return AsyncInvoker<DeleteProductRequest, DeleteProductResponse>
     */
    public AsyncInvoker<DeleteProductRequest, DeleteProductResponse> deleteProductAsyncInvoker(
        DeleteProductRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.deleteProduct, hcClient);
    }

    /**
     * 查询商品列表
     *
     * 查询商品列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductsRequest 请求对象
     * @return CompletableFuture<ListProductsResponse>
     */
    public CompletableFuture<ListProductsResponse> listProductsAsync(ListProductsRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.listProducts);
    }

    /**
     * 查询商品列表
     *
     * 查询商品列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductsRequest 请求对象
     * @return AsyncInvoker<ListProductsRequest, ListProductsResponse>
     */
    public AsyncInvoker<ListProductsRequest, ListProductsResponse> listProductsAsyncInvoker(
        ListProductsRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.listProducts, hcClient);
    }

    /**
     * 商品资产组合配置
     *
     * 商品资产组合配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetProductAssetRequest 请求对象
     * @return CompletableFuture<SetProductAssetResponse>
     */
    public CompletableFuture<SetProductAssetResponse> setProductAssetAsync(SetProductAssetRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.setProductAsset);
    }

    /**
     * 商品资产组合配置
     *
     * 商品资产组合配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetProductAssetRequest 请求对象
     * @return AsyncInvoker<SetProductAssetRequest, SetProductAssetResponse>
     */
    public AsyncInvoker<SetProductAssetRequest, SetProductAssetResponse> setProductAssetAsyncInvoker(
        SetProductAssetRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.setProductAsset, hcClient);
    }

    /**
     * 查询商品详情
     *
     * Show product
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProductRequest 请求对象
     * @return CompletableFuture<ShowProductResponse>
     */
    public CompletableFuture<ShowProductResponse> showProductAsync(ShowProductRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.showProduct);
    }

    /**
     * 查询商品详情
     *
     * Show product
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProductRequest 请求对象
     * @return AsyncInvoker<ShowProductRequest, ShowProductResponse>
     */
    public AsyncInvoker<ShowProductRequest, ShowProductResponse> showProductAsyncInvoker(ShowProductRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.showProduct, hcClient);
    }

    /**
     * 更新商品
     *
     * Update product
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProductRequest 请求对象
     * @return CompletableFuture<UpdateProductResponse>
     */
    public CompletableFuture<UpdateProductResponse> updateProductAsync(UpdateProductRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.updateProduct);
    }

    /**
     * 更新商品
     *
     * Update product
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProductRequest 请求对象
     * @return AsyncInvoker<UpdateProductRequest, UpdateProductResponse>
     */
    public AsyncInvoker<UpdateProductRequest, UpdateProductResponse> updateProductAsyncInvoker(
        UpdateProductRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.updateProduct, hcClient);
    }

    /**
     * 创建应用
     *
     * 该接口用于创建应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRobotRequest 请求对象
     * @return CompletableFuture<CreateRobotResponse>
     */
    public CompletableFuture<CreateRobotResponse> createRobotAsync(CreateRobotRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createRobot);
    }

    /**
     * 创建应用
     *
     * 该接口用于创建应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRobotRequest 请求对象
     * @return AsyncInvoker<CreateRobotRequest, CreateRobotResponse>
     */
    public AsyncInvoker<CreateRobotRequest, CreateRobotResponse> createRobotAsyncInvoker(CreateRobotRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.createRobot, hcClient);
    }

    /**
     * 删除应用
     *
     * 该接口用于删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRobotRequest 请求对象
     * @return CompletableFuture<DeleteRobotResponse>
     */
    public CompletableFuture<DeleteRobotResponse> deleteRobotAsync(DeleteRobotRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.deleteRobot);
    }

    /**
     * 删除应用
     *
     * 该接口用于删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRobotRequest 请求对象
     * @return AsyncInvoker<DeleteRobotRequest, DeleteRobotResponse>
     */
    public AsyncInvoker<DeleteRobotRequest, DeleteRobotResponse> deleteRobotAsyncInvoker(DeleteRobotRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.deleteRobot, hcClient);
    }

    /**
     * 查询应用列表
     *
     * 该接口用于查询应用列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRobotRequest 请求对象
     * @return CompletableFuture<ListRobotResponse>
     */
    public CompletableFuture<ListRobotResponse> listRobotAsync(ListRobotRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.listRobot);
    }

    /**
     * 查询应用列表
     *
     * 该接口用于查询应用列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRobotRequest 请求对象
     * @return AsyncInvoker<ListRobotRequest, ListRobotResponse>
     */
    public AsyncInvoker<ListRobotRequest, ListRobotResponse> listRobotAsyncInvoker(ListRobotRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.listRobot, hcClient);
    }

    /**
     * 查询应用详情
     *
     * 该接口用于查询应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRobotRequest 请求对象
     * @return CompletableFuture<ShowRobotResponse>
     */
    public CompletableFuture<ShowRobotResponse> showRobotAsync(ShowRobotRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.showRobot);
    }

    /**
     * 查询应用详情
     *
     * 该接口用于查询应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRobotRequest 请求对象
     * @return AsyncInvoker<ShowRobotRequest, ShowRobotResponse>
     */
    public AsyncInvoker<ShowRobotRequest, ShowRobotResponse> showRobotAsyncInvoker(ShowRobotRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.showRobot, hcClient);
    }

    /**
     * 修改应用
     *
     * 该接口用于修改应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRobotRequest 请求对象
     * @return CompletableFuture<UpdateRobotResponse>
     */
    public CompletableFuture<UpdateRobotResponse> updateRobotAsync(UpdateRobotRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.updateRobot);
    }

    /**
     * 修改应用
     *
     * 该接口用于修改应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRobotRequest 请求对象
     * @return AsyncInvoker<UpdateRobotRequest, UpdateRobotResponse>
     */
    public AsyncInvoker<UpdateRobotRequest, UpdateRobotResponse> updateRobotAsyncInvoker(UpdateRobotRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.updateRobot, hcClient);
    }

    /**
     * 创建智能交互对话
     *
     * 该接口用于创建智能交互对话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSmartChatRoomRequest 请求对象
     * @return CompletableFuture<CreateSmartChatRoomResponse>
     */
    public CompletableFuture<CreateSmartChatRoomResponse> createSmartChatRoomAsync(CreateSmartChatRoomRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createSmartChatRoom);
    }

    /**
     * 创建智能交互对话
     *
     * 该接口用于创建智能交互对话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSmartChatRoomRequest 请求对象
     * @return AsyncInvoker<CreateSmartChatRoomRequest, CreateSmartChatRoomResponse>
     */
    public AsyncInvoker<CreateSmartChatRoomRequest, CreateSmartChatRoomResponse> createSmartChatRoomAsyncInvoker(
        CreateSmartChatRoomRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.createSmartChatRoom, hcClient);
    }

    /**
     * 删除智能交互对话
     *
     * 该接口用于删除智能交互对话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSmartChatRoomRequest 请求对象
     * @return CompletableFuture<DeleteSmartChatRoomResponse>
     */
    public CompletableFuture<DeleteSmartChatRoomResponse> deleteSmartChatRoomAsync(DeleteSmartChatRoomRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.deleteSmartChatRoom);
    }

    /**
     * 删除智能交互对话
     *
     * 该接口用于删除智能交互对话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSmartChatRoomRequest 请求对象
     * @return AsyncInvoker<DeleteSmartChatRoomRequest, DeleteSmartChatRoomResponse>
     */
    public AsyncInvoker<DeleteSmartChatRoomRequest, DeleteSmartChatRoomResponse> deleteSmartChatRoomAsyncInvoker(
        DeleteSmartChatRoomRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.deleteSmartChatRoom, hcClient);
    }

    /**
     * 查询智能交互对话列表
     *
     * 该接口用于智能交互对话列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSmartChatRoomsRequest 请求对象
     * @return CompletableFuture<ListSmartChatRoomsResponse>
     */
    public CompletableFuture<ListSmartChatRoomsResponse> listSmartChatRoomsAsync(ListSmartChatRoomsRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.listSmartChatRooms);
    }

    /**
     * 查询智能交互对话列表
     *
     * 该接口用于智能交互对话列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSmartChatRoomsRequest 请求对象
     * @return AsyncInvoker<ListSmartChatRoomsRequest, ListSmartChatRoomsResponse>
     */
    public AsyncInvoker<ListSmartChatRoomsRequest, ListSmartChatRoomsResponse> listSmartChatRoomsAsyncInvoker(
        ListSmartChatRoomsRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.listSmartChatRooms, hcClient);
    }

    /**
     * 查询智能交互对话详情
     *
     * 该接口用于查询智能交互对话详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSmartChatRoomRequest 请求对象
     * @return CompletableFuture<ShowSmartChatRoomResponse>
     */
    public CompletableFuture<ShowSmartChatRoomResponse> showSmartChatRoomAsync(ShowSmartChatRoomRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.showSmartChatRoom);
    }

    /**
     * 查询智能交互对话详情
     *
     * 该接口用于查询智能交互对话详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSmartChatRoomRequest 请求对象
     * @return AsyncInvoker<ShowSmartChatRoomRequest, ShowSmartChatRoomResponse>
     */
    public AsyncInvoker<ShowSmartChatRoomRequest, ShowSmartChatRoomResponse> showSmartChatRoomAsyncInvoker(
        ShowSmartChatRoomRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.showSmartChatRoom, hcClient);
    }

    /**
     * 更新智能交互对话信息
     *
     * 该接口用于智能交互对话信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSmartChatRoomRequest 请求对象
     * @return CompletableFuture<UpdateSmartChatRoomResponse>
     */
    public CompletableFuture<UpdateSmartChatRoomResponse> updateSmartChatRoomAsync(UpdateSmartChatRoomRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.updateSmartChatRoom);
    }

    /**
     * 更新智能交互对话信息
     *
     * 该接口用于智能交互对话信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSmartChatRoomRequest 请求对象
     * @return AsyncInvoker<UpdateSmartChatRoomRequest, UpdateSmartChatRoomResponse>
     */
    public AsyncInvoker<UpdateSmartChatRoomRequest, UpdateSmartChatRoomResponse> updateSmartChatRoomAsyncInvoker(
        UpdateSmartChatRoomRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.updateSmartChatRoom, hcClient);
    }

    /**
     * 控制数字人直播过程
     *
     * 该接口用于控制数字人直播过程。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteSmartLiveCommandRequest 请求对象
     * @return CompletableFuture<ExecuteSmartLiveCommandResponse>
     */
    public CompletableFuture<ExecuteSmartLiveCommandResponse> executeSmartLiveCommandAsync(
        ExecuteSmartLiveCommandRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.executeSmartLiveCommand);
    }

    /**
     * 控制数字人直播过程
     *
     * 该接口用于控制数字人直播过程。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteSmartLiveCommandRequest 请求对象
     * @return AsyncInvoker<ExecuteSmartLiveCommandRequest, ExecuteSmartLiveCommandResponse>
     */
    public AsyncInvoker<ExecuteSmartLiveCommandRequest, ExecuteSmartLiveCommandResponse> executeSmartLiveCommandAsyncInvoker(
        ExecuteSmartLiveCommandRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.executeSmartLiveCommand, hcClient);
    }

    /**
     * 查询某个智能直播间下直播任务列表
     *
     * 该接口用于查询某个智能直播间的直播任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSmartLiveRequest 请求对象
     * @return CompletableFuture<ListSmartLiveResponse>
     */
    public CompletableFuture<ListSmartLiveResponse> listSmartLiveAsync(ListSmartLiveRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.listSmartLive);
    }

    /**
     * 查询某个智能直播间下直播任务列表
     *
     * 该接口用于查询某个智能直播间的直播任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSmartLiveRequest 请求对象
     * @return AsyncInvoker<ListSmartLiveRequest, ListSmartLiveResponse>
     */
    public AsyncInvoker<ListSmartLiveRequest, ListSmartLiveResponse> listSmartLiveAsyncInvoker(
        ListSmartLiveRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.listSmartLive, hcClient);
    }

    /**
     * 查询租户所有数字人直播任务列表
     *
     * 该接口用于查询租户所有数字人智能直播任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSmartLiveJobsRequest 请求对象
     * @return CompletableFuture<ListSmartLiveJobsResponse>
     */
    public CompletableFuture<ListSmartLiveJobsResponse> listSmartLiveJobsAsync(ListSmartLiveJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.listSmartLiveJobs);
    }

    /**
     * 查询租户所有数字人直播任务列表
     *
     * 该接口用于查询租户所有数字人智能直播任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSmartLiveJobsRequest 请求对象
     * @return AsyncInvoker<ListSmartLiveJobsRequest, ListSmartLiveJobsResponse>
     */
    public AsyncInvoker<ListSmartLiveJobsRequest, ListSmartLiveJobsResponse> listSmartLiveJobsAsyncInvoker(
        ListSmartLiveJobsRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.listSmartLiveJobs, hcClient);
    }

    /**
     * 上报直播间事件
     *
     * 该接口用于上报直播间事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LiveEventReportRequest 请求对象
     * @return CompletableFuture<LiveEventReportResponse>
     */
    public CompletableFuture<LiveEventReportResponse> liveEventReportAsync(LiveEventReportRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.liveEventReport);
    }

    /**
     * 上报直播间事件
     *
     * 该接口用于上报直播间事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LiveEventReportRequest 请求对象
     * @return AsyncInvoker<LiveEventReportRequest, LiveEventReportResponse>
     */
    public AsyncInvoker<LiveEventReportRequest, LiveEventReportResponse> liveEventReportAsyncInvoker(
        LiveEventReportRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.liveEventReport, hcClient);
    }

    /**
     * 查询数字人智能直播任务详情
     *
     * 该接口用于查询数字人智能直播任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSmartLiveRequest 请求对象
     * @return CompletableFuture<ShowSmartLiveResponse>
     */
    public CompletableFuture<ShowSmartLiveResponse> showSmartLiveAsync(ShowSmartLiveRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.showSmartLive);
    }

    /**
     * 查询数字人智能直播任务详情
     *
     * 该接口用于查询数字人智能直播任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSmartLiveRequest 请求对象
     * @return AsyncInvoker<ShowSmartLiveRequest, ShowSmartLiveResponse>
     */
    public AsyncInvoker<ShowSmartLiveRequest, ShowSmartLiveResponse> showSmartLiveAsyncInvoker(
        ShowSmartLiveRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.showSmartLive, hcClient);
    }

    /**
     * 启动数字人智能直播任务
     *
     * 该接口用于启动数字人智能直播任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartSmartLiveRequest 请求对象
     * @return CompletableFuture<StartSmartLiveResponse>
     */
    public CompletableFuture<StartSmartLiveResponse> startSmartLiveAsync(StartSmartLiveRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.startSmartLive);
    }

    /**
     * 启动数字人智能直播任务
     *
     * 该接口用于启动数字人智能直播任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartSmartLiveRequest 请求对象
     * @return AsyncInvoker<StartSmartLiveRequest, StartSmartLiveResponse>
     */
    public AsyncInvoker<StartSmartLiveRequest, StartSmartLiveResponse> startSmartLiveAsyncInvoker(
        StartSmartLiveRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.startSmartLive, hcClient);
    }

    /**
     * 结束数字人智能直播任务
     *
     * 该接口用于结束数字人智能直播任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopSmartLiveRequest 请求对象
     * @return CompletableFuture<StopSmartLiveResponse>
     */
    public CompletableFuture<StopSmartLiveResponse> stopSmartLiveAsync(StopSmartLiveRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.stopSmartLive);
    }

    /**
     * 结束数字人智能直播任务
     *
     * 该接口用于结束数字人智能直播任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopSmartLiveRequest 请求对象
     * @return AsyncInvoker<StopSmartLiveRequest, StopSmartLiveResponse>
     */
    public AsyncInvoker<StopSmartLiveRequest, StopSmartLiveResponse> stopSmartLiveAsyncInvoker(
        StopSmartLiveRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.stopSmartLive, hcClient);
    }

    /**
     * 创建智能直播间互动规则库
     *
     * 该接口用于创建智能直播间互动规则库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInteractionRuleGroupRequest 请求对象
     * @return CompletableFuture<CreateInteractionRuleGroupResponse>
     */
    public CompletableFuture<CreateInteractionRuleGroupResponse> createInteractionRuleGroupAsync(
        CreateInteractionRuleGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createInteractionRuleGroup);
    }

    /**
     * 创建智能直播间互动规则库
     *
     * 该接口用于创建智能直播间互动规则库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInteractionRuleGroupRequest 请求对象
     * @return AsyncInvoker<CreateInteractionRuleGroupRequest, CreateInteractionRuleGroupResponse>
     */
    public AsyncInvoker<CreateInteractionRuleGroupRequest, CreateInteractionRuleGroupResponse> createInteractionRuleGroupAsyncInvoker(
        CreateInteractionRuleGroupRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.createInteractionRuleGroup, hcClient);
    }

    /**
     * 创建智能直播间
     *
     * 该接口用于创建智能直播间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSmartLiveRoomRequest 请求对象
     * @return CompletableFuture<CreateSmartLiveRoomResponse>
     */
    public CompletableFuture<CreateSmartLiveRoomResponse> createSmartLiveRoomAsync(CreateSmartLiveRoomRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createSmartLiveRoom);
    }

    /**
     * 创建智能直播间
     *
     * 该接口用于创建智能直播间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSmartLiveRoomRequest 请求对象
     * @return AsyncInvoker<CreateSmartLiveRoomRequest, CreateSmartLiveRoomResponse>
     */
    public AsyncInvoker<CreateSmartLiveRoomRequest, CreateSmartLiveRoomResponse> createSmartLiveRoomAsyncInvoker(
        CreateSmartLiveRoomRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.createSmartLiveRoom, hcClient);
    }

    /**
     * 删除智能直播间互动规则库
     *
     * 该接口用于删除智能直播间互动规则库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInteractionRuleGroupRequest 请求对象
     * @return CompletableFuture<DeleteInteractionRuleGroupResponse>
     */
    public CompletableFuture<DeleteInteractionRuleGroupResponse> deleteInteractionRuleGroupAsync(
        DeleteInteractionRuleGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.deleteInteractionRuleGroup);
    }

    /**
     * 删除智能直播间互动规则库
     *
     * 该接口用于删除智能直播间互动规则库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInteractionRuleGroupRequest 请求对象
     * @return AsyncInvoker<DeleteInteractionRuleGroupRequest, DeleteInteractionRuleGroupResponse>
     */
    public AsyncInvoker<DeleteInteractionRuleGroupRequest, DeleteInteractionRuleGroupResponse> deleteInteractionRuleGroupAsyncInvoker(
        DeleteInteractionRuleGroupRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.deleteInteractionRuleGroup, hcClient);
    }

    /**
     * 删除智能直播间
     *
     * 该接口用于删除智能直播间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSmartLiveRoomRequest 请求对象
     * @return CompletableFuture<DeleteSmartLiveRoomResponse>
     */
    public CompletableFuture<DeleteSmartLiveRoomResponse> deleteSmartLiveRoomAsync(DeleteSmartLiveRoomRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.deleteSmartLiveRoom);
    }

    /**
     * 删除智能直播间
     *
     * 该接口用于删除智能直播间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSmartLiveRoomRequest 请求对象
     * @return AsyncInvoker<DeleteSmartLiveRoomRequest, DeleteSmartLiveRoomResponse>
     */
    public AsyncInvoker<DeleteSmartLiveRoomRequest, DeleteSmartLiveRoomResponse> deleteSmartLiveRoomAsyncInvoker(
        DeleteSmartLiveRoomRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.deleteSmartLiveRoom, hcClient);
    }

    /**
     * 查询智能直播间互动规则库列表
     *
     * 该接口用于智能直播间互动规则库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInteractionRuleGroupsRequest 请求对象
     * @return CompletableFuture<ListInteractionRuleGroupsResponse>
     */
    public CompletableFuture<ListInteractionRuleGroupsResponse> listInteractionRuleGroupsAsync(
        ListInteractionRuleGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.listInteractionRuleGroups);
    }

    /**
     * 查询智能直播间互动规则库列表
     *
     * 该接口用于智能直播间互动规则库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInteractionRuleGroupsRequest 请求对象
     * @return AsyncInvoker<ListInteractionRuleGroupsRequest, ListInteractionRuleGroupsResponse>
     */
    public AsyncInvoker<ListInteractionRuleGroupsRequest, ListInteractionRuleGroupsResponse> listInteractionRuleGroupsAsyncInvoker(
        ListInteractionRuleGroupsRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.listInteractionRuleGroups, hcClient);
    }

    /**
     * 查询智能直播间列表
     *
     * 该接口用于智能直播间列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSmartLiveRoomsRequest 请求对象
     * @return CompletableFuture<ListSmartLiveRoomsResponse>
     */
    public CompletableFuture<ListSmartLiveRoomsResponse> listSmartLiveRoomsAsync(ListSmartLiveRoomsRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.listSmartLiveRooms);
    }

    /**
     * 查询智能直播间列表
     *
     * 该接口用于智能直播间列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSmartLiveRoomsRequest 请求对象
     * @return AsyncInvoker<ListSmartLiveRoomsRequest, ListSmartLiveRoomsResponse>
     */
    public AsyncInvoker<ListSmartLiveRoomsRequest, ListSmartLiveRoomsResponse> listSmartLiveRoomsAsyncInvoker(
        ListSmartLiveRoomsRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.listSmartLiveRooms, hcClient);
    }

    /**
     * 查询智能直播剧本详情
     *
     * 该接口用于查询智能直播剧本详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSmartLiveRoomRequest 请求对象
     * @return CompletableFuture<ShowSmartLiveRoomResponse>
     */
    public CompletableFuture<ShowSmartLiveRoomResponse> showSmartLiveRoomAsync(ShowSmartLiveRoomRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.showSmartLiveRoom);
    }

    /**
     * 查询智能直播剧本详情
     *
     * 该接口用于查询智能直播剧本详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSmartLiveRoomRequest 请求对象
     * @return AsyncInvoker<ShowSmartLiveRoomRequest, ShowSmartLiveRoomResponse>
     */
    public AsyncInvoker<ShowSmartLiveRoomRequest, ShowSmartLiveRoomResponse> showSmartLiveRoomAsyncInvoker(
        ShowSmartLiveRoomRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.showSmartLiveRoom, hcClient);
    }

    /**
     * 更新智能直播间互动规则库
     *
     * 该接口用于更新智能直播间互动规则库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInteractionRuleGroupRequest 请求对象
     * @return CompletableFuture<UpdateInteractionRuleGroupResponse>
     */
    public CompletableFuture<UpdateInteractionRuleGroupResponse> updateInteractionRuleGroupAsync(
        UpdateInteractionRuleGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.updateInteractionRuleGroup);
    }

    /**
     * 更新智能直播间互动规则库
     *
     * 该接口用于更新智能直播间互动规则库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInteractionRuleGroupRequest 请求对象
     * @return AsyncInvoker<UpdateInteractionRuleGroupRequest, UpdateInteractionRuleGroupResponse>
     */
    public AsyncInvoker<UpdateInteractionRuleGroupRequest, UpdateInteractionRuleGroupResponse> updateInteractionRuleGroupAsyncInvoker(
        UpdateInteractionRuleGroupRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.updateInteractionRuleGroup, hcClient);
    }

    /**
     * 更新智能直播间信息
     *
     * 该接口用于智能直播间信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSmartLiveRoomRequest 请求对象
     * @return CompletableFuture<UpdateSmartLiveRoomResponse>
     */
    public CompletableFuture<UpdateSmartLiveRoomResponse> updateSmartLiveRoomAsync(UpdateSmartLiveRoomRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.updateSmartLiveRoom);
    }

    /**
     * 更新智能直播间信息
     *
     * 该接口用于智能直播间信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSmartLiveRoomRequest 请求对象
     * @return AsyncInvoker<UpdateSmartLiveRoomRequest, UpdateSmartLiveRoomResponse>
     */
    public AsyncInvoker<UpdateSmartLiveRoomRequest, UpdateSmartLiveRoomResponse> updateSmartLiveRoomAsyncInvoker(
        UpdateSmartLiveRoomRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.updateSmartLiveRoom, hcClient);
    }

    /**
     * 查询数字人风格列表
     *
     * 查询数字人风格列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStylesRequest 请求对象
     * @return CompletableFuture<ListStylesResponse>
     */
    public CompletableFuture<ListStylesResponse> listStylesAsync(ListStylesRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.listStyles);
    }

    /**
     * 查询数字人风格列表
     *
     * 查询数字人风格列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStylesRequest 请求对象
     * @return AsyncInvoker<ListStylesRequest, ListStylesResponse>
     */
    public AsyncInvoker<ListStylesRequest, ListStylesResponse> listStylesAsyncInvoker(ListStylesRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.listStyles, hcClient);
    }

    /**
     * 提交语音训练任务
     *
     * 提交训练任务,执行该接口后,任务会进入审核状态,审核完成后会等待训练。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CommitVoiceTrainingJobRequest 请求对象
     * @return CompletableFuture<CommitVoiceTrainingJobResponse>
     */
    public CompletableFuture<CommitVoiceTrainingJobResponse> commitVoiceTrainingJobAsync(
        CommitVoiceTrainingJobRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.commitVoiceTrainingJob);
    }

    /**
     * 提交语音训练任务
     *
     * 提交训练任务,执行该接口后,任务会进入审核状态,审核完成后会等待训练。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CommitVoiceTrainingJobRequest 请求对象
     * @return AsyncInvoker<CommitVoiceTrainingJobRequest, CommitVoiceTrainingJobResponse>
     */
    public AsyncInvoker<CommitVoiceTrainingJobRequest, CommitVoiceTrainingJobResponse> commitVoiceTrainingJobAsyncInvoker(
        CommitVoiceTrainingJobRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.commitVoiceTrainingJob, hcClient);
    }

    /**
     * 确认在线录音结果
     *
     * 确认在线录音结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmTrainingSegmentRequest 请求对象
     * @return CompletableFuture<ConfirmTrainingSegmentResponse>
     */
    public CompletableFuture<ConfirmTrainingSegmentResponse> confirmTrainingSegmentAsync(
        ConfirmTrainingSegmentRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.confirmTrainingSegment);
    }

    /**
     * 确认在线录音结果
     *
     * 确认在线录音结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmTrainingSegmentRequest 请求对象
     * @return AsyncInvoker<ConfirmTrainingSegmentRequest, ConfirmTrainingSegmentResponse>
     */
    public AsyncInvoker<ConfirmTrainingSegmentRequest, ConfirmTrainingSegmentResponse> confirmTrainingSegmentAsyncInvoker(
        ConfirmTrainingSegmentRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.confirmTrainingSegment, hcClient);
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
     * @return CompletableFuture<CreateTrainingAdvanceJobResponse>
     */
    public CompletableFuture<CreateTrainingAdvanceJobResponse> createTrainingAdvanceJobAsync(
        CreateTrainingAdvanceJobRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createTrainingAdvanceJob);
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
     * @return AsyncInvoker<CreateTrainingAdvanceJobRequest, CreateTrainingAdvanceJobResponse>
     */
    public AsyncInvoker<CreateTrainingAdvanceJobRequest, CreateTrainingAdvanceJobResponse> createTrainingAdvanceJobAsyncInvoker(
        CreateTrainingAdvanceJobRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.createTrainingAdvanceJob, hcClient);
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
     * @return CompletableFuture<CreateTrainingBasicJobResponse>
     */
    public CompletableFuture<CreateTrainingBasicJobResponse> createTrainingBasicJobAsync(
        CreateTrainingBasicJobRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createTrainingBasicJob);
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
     * @return AsyncInvoker<CreateTrainingBasicJobRequest, CreateTrainingBasicJobResponse>
     */
    public AsyncInvoker<CreateTrainingBasicJobRequest, CreateTrainingBasicJobResponse> createTrainingBasicJobAsyncInvoker(
        CreateTrainingBasicJobRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.createTrainingBasicJob, hcClient);
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
     * @return CompletableFuture<CreateTrainingMiddleJobResponse>
     */
    public CompletableFuture<CreateTrainingMiddleJobResponse> createTrainingMiddleJobAsync(
        CreateTrainingMiddleJobRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createTrainingMiddleJob);
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
     * @return AsyncInvoker<CreateTrainingMiddleJobRequest, CreateTrainingMiddleJobResponse>
     */
    public AsyncInvoker<CreateTrainingMiddleJobRequest, CreateTrainingMiddleJobResponse> createTrainingMiddleJobAsyncInvoker(
        CreateTrainingMiddleJobRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.createTrainingMiddleJob, hcClient);
    }

    /**
     * 删除语音训练任务
     *
     * 删除语音训练任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVoiceTrainingJobRequest 请求对象
     * @return CompletableFuture<DeleteVoiceTrainingJobResponse>
     */
    public CompletableFuture<DeleteVoiceTrainingJobResponse> deleteVoiceTrainingJobAsync(
        DeleteVoiceTrainingJobRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.deleteVoiceTrainingJob);
    }

    /**
     * 删除语音训练任务
     *
     * 删除语音训练任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVoiceTrainingJobRequest 请求对象
     * @return AsyncInvoker<DeleteVoiceTrainingJobRequest, DeleteVoiceTrainingJobResponse>
     */
    public AsyncInvoker<DeleteVoiceTrainingJobRequest, DeleteVoiceTrainingJobResponse> deleteVoiceTrainingJobAsyncInvoker(
        DeleteVoiceTrainingJobRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.deleteVoiceTrainingJob, hcClient);
    }

    /**
     * 查询任务操作日志
     *
     * 查询任务操作日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobOperationLogRequest 请求对象
     * @return CompletableFuture<ListJobOperationLogResponse>
     */
    public CompletableFuture<ListJobOperationLogResponse> listJobOperationLogAsync(ListJobOperationLogRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.listJobOperationLog);
    }

    /**
     * 查询任务操作日志
     *
     * 查询任务操作日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobOperationLogRequest 请求对象
     * @return AsyncInvoker<ListJobOperationLogRequest, ListJobOperationLogResponse>
     */
    public AsyncInvoker<ListJobOperationLogRequest, ListJobOperationLogResponse> listJobOperationLogAsyncInvoker(
        ListJobOperationLogRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.listJobOperationLog, hcClient);
    }

    /**
     * 查询语音训练任务列表
     *
     * 查询语音训练任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVoiceTrainingJobRequest 请求对象
     * @return CompletableFuture<ListVoiceTrainingJobResponse>
     */
    public CompletableFuture<ListVoiceTrainingJobResponse> listVoiceTrainingJobAsync(
        ListVoiceTrainingJobRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.listVoiceTrainingJob);
    }

    /**
     * 查询语音训练任务列表
     *
     * 查询语音训练任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVoiceTrainingJobRequest 请求对象
     * @return AsyncInvoker<ListVoiceTrainingJobRequest, ListVoiceTrainingJobResponse>
     */
    public AsyncInvoker<ListVoiceTrainingJobRequest, ListVoiceTrainingJobResponse> listVoiceTrainingJobAsyncInvoker(
        ListVoiceTrainingJobRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.listVoiceTrainingJob, hcClient);
    }

    /**
     * 获取语音训练任务审核结果
     *
     * 获取语音训练任务审核结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobAuditResultRequest 请求对象
     * @return CompletableFuture<ShowJobAuditResultResponse>
     */
    public CompletableFuture<ShowJobAuditResultResponse> showJobAuditResultAsync(ShowJobAuditResultRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.showJobAuditResult);
    }

    /**
     * 获取语音训练任务审核结果
     *
     * 获取语音训练任务审核结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobAuditResultRequest 请求对象
     * @return AsyncInvoker<ShowJobAuditResultRequest, ShowJobAuditResultResponse>
     */
    public AsyncInvoker<ShowJobAuditResultRequest, ShowJobAuditResultResponse> showJobAuditResultAsyncInvoker(
        ShowJobAuditResultRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.showJobAuditResult, hcClient);
    }

    /**
     * 获取语音文件上传地址
     *
     * 获取语音文件上传地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobUploadingAddressRequest 请求对象
     * @return CompletableFuture<ShowJobUploadingAddressResponse>
     */
    public CompletableFuture<ShowJobUploadingAddressResponse> showJobUploadingAddressAsync(
        ShowJobUploadingAddressRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.showJobUploadingAddress);
    }

    /**
     * 获取语音文件上传地址
     *
     * 获取语音文件上传地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobUploadingAddressRequest 请求对象
     * @return AsyncInvoker<ShowJobUploadingAddressRequest, ShowJobUploadingAddressResponse>
     */
    public AsyncInvoker<ShowJobUploadingAddressRequest, ShowJobUploadingAddressResponse> showJobUploadingAddressAsyncInvoker(
        ShowJobUploadingAddressRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.showJobUploadingAddress, hcClient);
    }

    /**
     * 获取在线录音确认结果
     *
     * 获取在线录音确认结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrainingSegmentInfoRequest 请求对象
     * @return CompletableFuture<ShowTrainingSegmentInfoResponse>
     */
    public CompletableFuture<ShowTrainingSegmentInfoResponse> showTrainingSegmentInfoAsync(
        ShowTrainingSegmentInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.showTrainingSegmentInfo);
    }

    /**
     * 获取在线录音确认结果
     *
     * 获取在线录音确认结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrainingSegmentInfoRequest 请求对象
     * @return AsyncInvoker<ShowTrainingSegmentInfoRequest, ShowTrainingSegmentInfoResponse>
     */
    public AsyncInvoker<ShowTrainingSegmentInfoRequest, ShowTrainingSegmentInfoResponse> showTrainingSegmentInfoAsyncInvoker(
        ShowTrainingSegmentInfoRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.showTrainingSegmentInfo, hcClient);
    }

    /**
     * 查询语音训练任务详情
     *
     * 查询语音训练任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVoiceTrainingJobRequest 请求对象
     * @return CompletableFuture<ShowVoiceTrainingJobResponse>
     */
    public CompletableFuture<ShowVoiceTrainingJobResponse> showVoiceTrainingJobAsync(
        ShowVoiceTrainingJobRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.showVoiceTrainingJob);
    }

    /**
     * 查询语音训练任务详情
     *
     * 查询语音训练任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVoiceTrainingJobRequest 请求对象
     * @return AsyncInvoker<ShowVoiceTrainingJobRequest, ShowVoiceTrainingJobResponse>
     */
    public AsyncInvoker<ShowVoiceTrainingJobRequest, ShowVoiceTrainingJobResponse> showVoiceTrainingJobAsyncInvoker(
        ShowVoiceTrainingJobRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.showVoiceTrainingJob, hcClient);
    }

    /**
     * 创建分身数字人模型训练任务
     *
     * 该接口用于创建分身数字人模型训练任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Create2dModelTrainingJobRequest 请求对象
     * @return CompletableFuture<Create2dModelTrainingJobResponse>
     */
    public CompletableFuture<Create2dModelTrainingJobResponse> create2dModelTrainingJobAsync(
        Create2dModelTrainingJobRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.create2dModelTrainingJob);
    }

    /**
     * 创建分身数字人模型训练任务
     *
     * 该接口用于创建分身数字人模型训练任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Create2dModelTrainingJobRequest 请求对象
     * @return AsyncInvoker<Create2dModelTrainingJobRequest, Create2dModelTrainingJobResponse>
     */
    public AsyncInvoker<Create2dModelTrainingJobRequest, Create2dModelTrainingJobResponse> create2dModelTrainingJobAsyncInvoker(
        Create2dModelTrainingJobRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.create2dModelTrainingJob, hcClient);
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
     * @return CompletableFuture<Delete2dModelTrainingJobResponse>
     */
    public CompletableFuture<Delete2dModelTrainingJobResponse> delete2dModelTrainingJobAsync(
        Delete2dModelTrainingJobRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.delete2dModelTrainingJob);
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
     * @return AsyncInvoker<Delete2dModelTrainingJobRequest, Delete2dModelTrainingJobResponse>
     */
    public AsyncInvoker<Delete2dModelTrainingJobRequest, Delete2dModelTrainingJobResponse> delete2dModelTrainingJobAsyncInvoker(
        Delete2dModelTrainingJobRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.delete2dModelTrainingJob, hcClient);
    }

    /**
     * 租户执行分身数字人模型训练任务命令
     *
     * 该接口用于租户执行分身数字人模型训练任务命令，如提交训练审核等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Execute2dModelTrainingCommandByUserRequest 请求对象
     * @return CompletableFuture<Execute2dModelTrainingCommandByUserResponse>
     */
    public CompletableFuture<Execute2dModelTrainingCommandByUserResponse> execute2dModelTrainingCommandByUserAsync(
        Execute2dModelTrainingCommandByUserRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.execute2dModelTrainingCommandByUser);
    }

    /**
     * 租户执行分身数字人模型训练任务命令
     *
     * 该接口用于租户执行分身数字人模型训练任务命令，如提交训练审核等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Execute2dModelTrainingCommandByUserRequest 请求对象
     * @return AsyncInvoker<Execute2dModelTrainingCommandByUserRequest, Execute2dModelTrainingCommandByUserResponse>
     */
    public AsyncInvoker<Execute2dModelTrainingCommandByUserRequest, Execute2dModelTrainingCommandByUserResponse> execute2dModelTrainingCommandByUserAsyncInvoker(
        Execute2dModelTrainingCommandByUserRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.execute2dModelTrainingCommandByUser, hcClient);
    }

    /**
     * 查询分身数字人模型训练任务列表
     *
     * 该接口用于查询分身数字人模型训练任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request List2dModelTrainingJobRequest 请求对象
     * @return CompletableFuture<List2dModelTrainingJobResponse>
     */
    public CompletableFuture<List2dModelTrainingJobResponse> list2dModelTrainingJobAsync(
        List2dModelTrainingJobRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.list2dModelTrainingJob);
    }

    /**
     * 查询分身数字人模型训练任务列表
     *
     * 该接口用于查询分身数字人模型训练任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request List2dModelTrainingJobRequest 请求对象
     * @return AsyncInvoker<List2dModelTrainingJobRequest, List2dModelTrainingJobResponse>
     */
    public AsyncInvoker<List2dModelTrainingJobRequest, List2dModelTrainingJobResponse> list2dModelTrainingJobAsyncInvoker(
        List2dModelTrainingJobRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.list2dModelTrainingJob, hcClient);
    }

    /**
     * 查询分身数字人模型训练任务详情
     *
     * 该接口用于查询分身数字人模型训练任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Show2dModelTrainingJobRequest 请求对象
     * @return CompletableFuture<Show2dModelTrainingJobResponse>
     */
    public CompletableFuture<Show2dModelTrainingJobResponse> show2dModelTrainingJobAsync(
        Show2dModelTrainingJobRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.show2dModelTrainingJob);
    }

    /**
     * 查询分身数字人模型训练任务详情
     *
     * 该接口用于查询分身数字人模型训练任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Show2dModelTrainingJobRequest 请求对象
     * @return AsyncInvoker<Show2dModelTrainingJobRequest, Show2dModelTrainingJobResponse>
     */
    public AsyncInvoker<Show2dModelTrainingJobRequest, Show2dModelTrainingJobResponse> show2dModelTrainingJobAsyncInvoker(
        Show2dModelTrainingJobRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.show2dModelTrainingJob, hcClient);
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
     * @return CompletableFuture<Update2dModelTrainingJobResponse>
     */
    public CompletableFuture<Update2dModelTrainingJobResponse> update2dModelTrainingJobAsync(
        Update2dModelTrainingJobRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.update2dModelTrainingJob);
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
     * @return AsyncInvoker<Update2dModelTrainingJobRequest, Update2dModelTrainingJobResponse>
     */
    public AsyncInvoker<Update2dModelTrainingJobRequest, Update2dModelTrainingJobResponse> update2dModelTrainingJobAsyncInvoker(
        Update2dModelTrainingJobRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.update2dModelTrainingJob, hcClient);
    }

    /**
     * 创建语音驱动表情动画任务
     *
     * 该接口用于创建驱动数字人表情的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFacialAnimationsRequest 请求对象
     * @return CompletableFuture<CreateFacialAnimationsResponse>
     */
    public CompletableFuture<CreateFacialAnimationsResponse> createFacialAnimationsAsync(
        CreateFacialAnimationsRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createFacialAnimations);
    }

    /**
     * 创建语音驱动表情动画任务
     *
     * 该接口用于创建驱动数字人表情的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFacialAnimationsRequest 请求对象
     * @return AsyncInvoker<CreateFacialAnimationsRequest, CreateFacialAnimationsResponse>
     */
    public AsyncInvoker<CreateFacialAnimationsRequest, CreateFacialAnimationsResponse> createFacialAnimationsAsyncInvoker(
        CreateFacialAnimationsRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.createFacialAnimations, hcClient);
    }

    /**
     * 创建语音驱动任务
     *
     * 该接口用于创建驱动数字人表情、动作及语音的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTtsaRequest 请求对象
     * @return CompletableFuture<CreateTtsaResponse>
     */
    public CompletableFuture<CreateTtsaResponse> createTtsaAsync(CreateTtsaRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createTtsa);
    }

    /**
     * 创建语音驱动任务
     *
     * 该接口用于创建驱动数字人表情、动作及语音的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTtsaRequest 请求对象
     * @return AsyncInvoker<CreateTtsaRequest, CreateTtsaResponse>
     */
    public AsyncInvoker<CreateTtsaRequest, CreateTtsaResponse> createTtsaAsyncInvoker(CreateTtsaRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.createTtsa, hcClient);
    }

    /**
     * 获取语音驱动表情数据
     *
     * 该接口用于获取生成的数字人表情驱动数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFacialAnimationsDataRequest 请求对象
     * @return CompletableFuture<ListFacialAnimationsDataResponse>
     */
    public CompletableFuture<ListFacialAnimationsDataResponse> listFacialAnimationsDataAsync(
        ListFacialAnimationsDataRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.listFacialAnimationsData);
    }

    /**
     * 获取语音驱动表情数据
     *
     * 该接口用于获取生成的数字人表情驱动数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFacialAnimationsDataRequest 请求对象
     * @return AsyncInvoker<ListFacialAnimationsDataRequest, ListFacialAnimationsDataResponse>
     */
    public AsyncInvoker<ListFacialAnimationsDataRequest, ListFacialAnimationsDataResponse> listFacialAnimationsDataAsyncInvoker(
        ListFacialAnimationsDataRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.listFacialAnimationsData, hcClient);
    }

    /**
     * 获取语音驱动数据
     *
     * 该接口用于获取生成的数字人驱动数据，包括语音、表情、动作等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTtsaDataRequest 请求对象
     * @return CompletableFuture<ListTtsaDataResponse>
     */
    public CompletableFuture<ListTtsaDataResponse> listTtsaDataAsync(ListTtsaDataRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.listTtsaData);
    }

    /**
     * 获取语音驱动数据
     *
     * 该接口用于获取生成的数字人驱动数据，包括语音、表情、动作等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTtsaDataRequest 请求对象
     * @return AsyncInvoker<ListTtsaDataRequest, ListTtsaDataResponse>
     */
    public AsyncInvoker<ListTtsaDataRequest, ListTtsaDataResponse> listTtsaDataAsyncInvoker(
        ListTtsaDataRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.listTtsaData, hcClient);
    }

    /**
     * 获取语音驱动任务列表
     *
     * 该接口用于查询驱动数字人表情、动作及语音的任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTtsaJobsRequest 请求对象
     * @return CompletableFuture<ListTtsaJobsResponse>
     */
    public CompletableFuture<ListTtsaJobsResponse> listTtsaJobsAsync(ListTtsaJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.listTtsaJobs);
    }

    /**
     * 获取语音驱动任务列表
     *
     * 该接口用于查询驱动数字人表情、动作及语音的任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTtsaJobsRequest 请求对象
     * @return AsyncInvoker<ListTtsaJobsRequest, ListTtsaJobsResponse>
     */
    public AsyncInvoker<ListTtsaJobsRequest, ListTtsaJobsResponse> listTtsaJobsAsyncInvoker(
        ListTtsaJobsRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.listTtsaJobs, hcClient);
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
     * @return CompletableFuture<CreateTtsAuditionResponse>
     */
    public CompletableFuture<CreateTtsAuditionResponse> createTtsAuditionAsync(CreateTtsAuditionRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createTtsAudition);
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
     * @return AsyncInvoker<CreateTtsAuditionRequest, CreateTtsAuditionResponse>
     */
    public AsyncInvoker<CreateTtsAuditionRequest, CreateTtsAuditionResponse> createTtsAuditionAsyncInvoker(
        CreateTtsAuditionRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.createTtsAudition, hcClient);
    }

    /**
     * 获取TTS试听文件
     *
     * 该接口用于获取TTS试听文件下载链接，返回List中包含当前已生产的试听文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTtsAuditionFileRequest 请求对象
     * @return CompletableFuture<ShowTtsAuditionFileResponse>
     */
    public CompletableFuture<ShowTtsAuditionFileResponse> showTtsAuditionFileAsync(ShowTtsAuditionFileRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.showTtsAuditionFile);
    }

    /**
     * 获取TTS试听文件
     *
     * 该接口用于获取TTS试听文件下载链接，返回List中包含当前已生产的试听文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTtsAuditionFileRequest 请求对象
     * @return AsyncInvoker<ShowTtsAuditionFileRequest, ShowTtsAuditionFileResponse>
     */
    public AsyncInvoker<ShowTtsAuditionFileRequest, ShowTtsAuditionFileResponse> showTtsAuditionFileAsyncInvoker(
        ShowTtsAuditionFileRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.showTtsAuditionFile, hcClient);
    }

    /**
     * 创建视频驱动任务
     *
     * 该接口用于创建视频驱动任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVideoMotionCaptureJobRequest 请求对象
     * @return CompletableFuture<CreateVideoMotionCaptureJobResponse>
     */
    public CompletableFuture<CreateVideoMotionCaptureJobResponse> createVideoMotionCaptureJobAsync(
        CreateVideoMotionCaptureJobRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createVideoMotionCaptureJob);
    }

    /**
     * 创建视频驱动任务
     *
     * 该接口用于创建视频驱动任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVideoMotionCaptureJobRequest 请求对象
     * @return AsyncInvoker<CreateVideoMotionCaptureJobRequest, CreateVideoMotionCaptureJobResponse>
     */
    public AsyncInvoker<CreateVideoMotionCaptureJobRequest, CreateVideoMotionCaptureJobResponse> createVideoMotionCaptureJobAsyncInvoker(
        CreateVideoMotionCaptureJobRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.createVideoMotionCaptureJob, hcClient);
    }

    /**
     * 控制数字人驱动
     *
     * 该接口用于控制数字人驱动。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteVideoMotionCaptureCommandRequest 请求对象
     * @return CompletableFuture<ExecuteVideoMotionCaptureCommandResponse>
     */
    public CompletableFuture<ExecuteVideoMotionCaptureCommandResponse> executeVideoMotionCaptureCommandAsync(
        ExecuteVideoMotionCaptureCommandRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.executeVideoMotionCaptureCommand);
    }

    /**
     * 控制数字人驱动
     *
     * 该接口用于控制数字人驱动。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteVideoMotionCaptureCommandRequest 请求对象
     * @return AsyncInvoker<ExecuteVideoMotionCaptureCommandRequest, ExecuteVideoMotionCaptureCommandResponse>
     */
    public AsyncInvoker<ExecuteVideoMotionCaptureCommandRequest, ExecuteVideoMotionCaptureCommandResponse> executeVideoMotionCaptureCommandAsyncInvoker(
        ExecuteVideoMotionCaptureCommandRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.executeVideoMotionCaptureCommand, hcClient);
    }

    /**
     * 查询视频驱动任务列表
     *
     * 该接口用于查询视频驱动任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVideoMotionCaptureJobsRequest 请求对象
     * @return CompletableFuture<ListVideoMotionCaptureJobsResponse>
     */
    public CompletableFuture<ListVideoMotionCaptureJobsResponse> listVideoMotionCaptureJobsAsync(
        ListVideoMotionCaptureJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.listVideoMotionCaptureJobs);
    }

    /**
     * 查询视频驱动任务列表
     *
     * 该接口用于查询视频驱动任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVideoMotionCaptureJobsRequest 请求对象
     * @return AsyncInvoker<ListVideoMotionCaptureJobsRequest, ListVideoMotionCaptureJobsResponse>
     */
    public AsyncInvoker<ListVideoMotionCaptureJobsRequest, ListVideoMotionCaptureJobsResponse> listVideoMotionCaptureJobsAsyncInvoker(
        ListVideoMotionCaptureJobsRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.listVideoMotionCaptureJobs, hcClient);
    }

    /**
     * 查询视频驱动任务详情
     *
     * 该接口用于查询视频驱动任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVideoMotionCaptureJobRequest 请求对象
     * @return CompletableFuture<ShowVideoMotionCaptureJobResponse>
     */
    public CompletableFuture<ShowVideoMotionCaptureJobResponse> showVideoMotionCaptureJobAsync(
        ShowVideoMotionCaptureJobRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.showVideoMotionCaptureJob);
    }

    /**
     * 查询视频驱动任务详情
     *
     * 该接口用于查询视频驱动任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVideoMotionCaptureJobRequest 请求对象
     * @return AsyncInvoker<ShowVideoMotionCaptureJobRequest, ShowVideoMotionCaptureJobResponse>
     */
    public AsyncInvoker<ShowVideoMotionCaptureJobRequest, ShowVideoMotionCaptureJobResponse> showVideoMotionCaptureJobAsyncInvoker(
        ShowVideoMotionCaptureJobRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.showVideoMotionCaptureJob, hcClient);
    }

    /**
     * 停止视频驱动任务
     *
     * 该接口用于停止视频驱动任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopVideoMotionCaptureJobRequest 请求对象
     * @return CompletableFuture<StopVideoMotionCaptureJobResponse>
     */
    public CompletableFuture<StopVideoMotionCaptureJobResponse> stopVideoMotionCaptureJobAsync(
        StopVideoMotionCaptureJobRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.stopVideoMotionCaptureJob);
    }

    /**
     * 停止视频驱动任务
     *
     * 该接口用于停止视频驱动任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopVideoMotionCaptureJobRequest 请求对象
     * @return AsyncInvoker<StopVideoMotionCaptureJobRequest, StopVideoMotionCaptureJobResponse>
     */
    public AsyncInvoker<StopVideoMotionCaptureJobRequest, StopVideoMotionCaptureJobResponse> stopVideoMotionCaptureJobAsyncInvoker(
        StopVideoMotionCaptureJobRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.stopVideoMotionCaptureJob, hcClient);
    }

    /**
     * 复制视频制作剧本
     *
     * 该接口用于复制视频制作剧本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyVideoScriptsRequest 请求对象
     * @return CompletableFuture<CopyVideoScriptsResponse>
     */
    public CompletableFuture<CopyVideoScriptsResponse> copyVideoScriptsAsync(CopyVideoScriptsRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.copyVideoScripts);
    }

    /**
     * 复制视频制作剧本
     *
     * 该接口用于复制视频制作剧本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyVideoScriptsRequest 请求对象
     * @return AsyncInvoker<CopyVideoScriptsRequest, CopyVideoScriptsResponse>
     */
    public AsyncInvoker<CopyVideoScriptsRequest, CopyVideoScriptsResponse> copyVideoScriptsAsyncInvoker(
        CopyVideoScriptsRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.copyVideoScripts, hcClient);
    }

    /**
     * 创建视频制作剧本
     *
     * 该接口用于创建视频制作剧本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVideoScriptsRequest 请求对象
     * @return CompletableFuture<CreateVideoScriptsResponse>
     */
    public CompletableFuture<CreateVideoScriptsResponse> createVideoScriptsAsync(CreateVideoScriptsRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createVideoScripts);
    }

    /**
     * 创建视频制作剧本
     *
     * 该接口用于创建视频制作剧本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVideoScriptsRequest 请求对象
     * @return AsyncInvoker<CreateVideoScriptsRequest, CreateVideoScriptsResponse>
     */
    public AsyncInvoker<CreateVideoScriptsRequest, CreateVideoScriptsResponse> createVideoScriptsAsyncInvoker(
        CreateVideoScriptsRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.createVideoScripts, hcClient);
    }

    /**
     * 删除视频制作剧本
     *
     * 该接口用于删除视频制作剧本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVideoScriptRequest 请求对象
     * @return CompletableFuture<DeleteVideoScriptResponse>
     */
    public CompletableFuture<DeleteVideoScriptResponse> deleteVideoScriptAsync(DeleteVideoScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.deleteVideoScript);
    }

    /**
     * 删除视频制作剧本
     *
     * 该接口用于删除视频制作剧本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVideoScriptRequest 请求对象
     * @return AsyncInvoker<DeleteVideoScriptRequest, DeleteVideoScriptResponse>
     */
    public AsyncInvoker<DeleteVideoScriptRequest, DeleteVideoScriptResponse> deleteVideoScriptAsyncInvoker(
        DeleteVideoScriptRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.deleteVideoScript, hcClient);
    }

    /**
     * 查询视频制作剧本列表
     *
     * 该接口用于查询视频制作剧本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVideoScriptsRequest 请求对象
     * @return CompletableFuture<ListVideoScriptsResponse>
     */
    public CompletableFuture<ListVideoScriptsResponse> listVideoScriptsAsync(ListVideoScriptsRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.listVideoScripts);
    }

    /**
     * 查询视频制作剧本列表
     *
     * 该接口用于查询视频制作剧本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVideoScriptsRequest 请求对象
     * @return AsyncInvoker<ListVideoScriptsRequest, ListVideoScriptsResponse>
     */
    public AsyncInvoker<ListVideoScriptsRequest, ListVideoScriptsResponse> listVideoScriptsAsyncInvoker(
        ListVideoScriptsRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.listVideoScripts, hcClient);
    }

    /**
     * 查询视频制作剧本详情
     *
     * 该接口用于查询视频制作剧本详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVideoScriptRequest 请求对象
     * @return CompletableFuture<ShowVideoScriptResponse>
     */
    public CompletableFuture<ShowVideoScriptResponse> showVideoScriptAsync(ShowVideoScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.showVideoScript);
    }

    /**
     * 查询视频制作剧本详情
     *
     * 该接口用于查询视频制作剧本详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVideoScriptRequest 请求对象
     * @return AsyncInvoker<ShowVideoScriptRequest, ShowVideoScriptResponse>
     */
    public AsyncInvoker<ShowVideoScriptRequest, ShowVideoScriptResponse> showVideoScriptAsyncInvoker(
        ShowVideoScriptRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.showVideoScript, hcClient);
    }

    /**
     * 更新视频制作剧本
     *
     * 该接口用于更新视频制作剧本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVideoScriptRequest 请求对象
     * @return CompletableFuture<UpdateVideoScriptResponse>
     */
    public CompletableFuture<UpdateVideoScriptResponse> updateVideoScriptAsync(UpdateVideoScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.updateVideoScript);
    }

    /**
     * 更新视频制作剧本
     *
     * 该接口用于更新视频制作剧本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVideoScriptRequest 请求对象
     * @return AsyncInvoker<UpdateVideoScriptRequest, UpdateVideoScriptResponse>
     */
    public AsyncInvoker<UpdateVideoScriptRequest, UpdateVideoScriptResponse> updateVideoScriptAsyncInvoker(
        UpdateVideoScriptRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.updateVideoScript, hcClient);
    }

    /**
     * 创建欢迎词
     *
     * 该接口用于创建欢迎词。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWelcomeSpeechRequest 请求对象
     * @return CompletableFuture<CreateWelcomeSpeechResponse>
     */
    public CompletableFuture<CreateWelcomeSpeechResponse> createWelcomeSpeechAsync(CreateWelcomeSpeechRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.createWelcomeSpeech);
    }

    /**
     * 创建欢迎词
     *
     * 该接口用于创建欢迎词。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWelcomeSpeechRequest 请求对象
     * @return AsyncInvoker<CreateWelcomeSpeechRequest, CreateWelcomeSpeechResponse>
     */
    public AsyncInvoker<CreateWelcomeSpeechRequest, CreateWelcomeSpeechResponse> createWelcomeSpeechAsyncInvoker(
        CreateWelcomeSpeechRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.createWelcomeSpeech, hcClient);
    }

    /**
     * 删除欢迎词
     *
     * 该接口用于删除欢迎词。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWelcomeSpeechRequest 请求对象
     * @return CompletableFuture<DeleteWelcomeSpeechResponse>
     */
    public CompletableFuture<DeleteWelcomeSpeechResponse> deleteWelcomeSpeechAsync(DeleteWelcomeSpeechRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.deleteWelcomeSpeech);
    }

    /**
     * 删除欢迎词
     *
     * 该接口用于删除欢迎词。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWelcomeSpeechRequest 请求对象
     * @return AsyncInvoker<DeleteWelcomeSpeechRequest, DeleteWelcomeSpeechResponse>
     */
    public AsyncInvoker<DeleteWelcomeSpeechRequest, DeleteWelcomeSpeechResponse> deleteWelcomeSpeechAsyncInvoker(
        DeleteWelcomeSpeechRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.deleteWelcomeSpeech, hcClient);
    }

    /**
     * 查询欢迎词列表
     *
     * 该接口用于查询欢迎词列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWelcomeSpeechRequest 请求对象
     * @return CompletableFuture<ListWelcomeSpeechResponse>
     */
    public CompletableFuture<ListWelcomeSpeechResponse> listWelcomeSpeechAsync(ListWelcomeSpeechRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.listWelcomeSpeech);
    }

    /**
     * 查询欢迎词列表
     *
     * 该接口用于查询欢迎词列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWelcomeSpeechRequest 请求对象
     * @return AsyncInvoker<ListWelcomeSpeechRequest, ListWelcomeSpeechResponse>
     */
    public AsyncInvoker<ListWelcomeSpeechRequest, ListWelcomeSpeechResponse> listWelcomeSpeechAsyncInvoker(
        ListWelcomeSpeechRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.listWelcomeSpeech, hcClient);
    }

    /**
     * 查询欢迎词详情
     *
     * 该接口用于查询欢迎词详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWelcomeSpeechRequest 请求对象
     * @return CompletableFuture<ShowWelcomeSpeechResponse>
     */
    public CompletableFuture<ShowWelcomeSpeechResponse> showWelcomeSpeechAsync(ShowWelcomeSpeechRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.showWelcomeSpeech);
    }

    /**
     * 查询欢迎词详情
     *
     * 该接口用于查询欢迎词详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWelcomeSpeechRequest 请求对象
     * @return AsyncInvoker<ShowWelcomeSpeechRequest, ShowWelcomeSpeechResponse>
     */
    public AsyncInvoker<ShowWelcomeSpeechRequest, ShowWelcomeSpeechResponse> showWelcomeSpeechAsyncInvoker(
        ShowWelcomeSpeechRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.showWelcomeSpeech, hcClient);
    }

    /**
     * 查询欢迎词功能开关
     *
     * 该接口用于查询欢迎词功能开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWelcomeSpeechSwitchRequest 请求对象
     * @return CompletableFuture<ShowWelcomeSpeechSwitchResponse>
     */
    public CompletableFuture<ShowWelcomeSpeechSwitchResponse> showWelcomeSpeechSwitchAsync(
        ShowWelcomeSpeechSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.showWelcomeSpeechSwitch);
    }

    /**
     * 查询欢迎词功能开关
     *
     * 该接口用于查询欢迎词功能开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWelcomeSpeechSwitchRequest 请求对象
     * @return AsyncInvoker<ShowWelcomeSpeechSwitchRequest, ShowWelcomeSpeechSwitchResponse>
     */
    public AsyncInvoker<ShowWelcomeSpeechSwitchRequest, ShowWelcomeSpeechSwitchResponse> showWelcomeSpeechSwitchAsyncInvoker(
        ShowWelcomeSpeechSwitchRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.showWelcomeSpeechSwitch, hcClient);
    }

    /**
     * 修改欢迎词
     *
     * 该接口用于修改欢迎词。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWelcomeSpeechRequest 请求对象
     * @return CompletableFuture<UpdateWelcomeSpeechResponse>
     */
    public CompletableFuture<UpdateWelcomeSpeechResponse> updateWelcomeSpeechAsync(UpdateWelcomeSpeechRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.updateWelcomeSpeech);
    }

    /**
     * 修改欢迎词
     *
     * 该接口用于修改欢迎词。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWelcomeSpeechRequest 请求对象
     * @return AsyncInvoker<UpdateWelcomeSpeechRequest, UpdateWelcomeSpeechResponse>
     */
    public AsyncInvoker<UpdateWelcomeSpeechRequest, UpdateWelcomeSpeechResponse> updateWelcomeSpeechAsyncInvoker(
        UpdateWelcomeSpeechRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.updateWelcomeSpeech, hcClient);
    }

    /**
     * 修改欢迎词功能开关
     *
     * 该接口用于修改欢迎词功能开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWelcomeSpeechSwitchRequest 请求对象
     * @return CompletableFuture<UpdateWelcomeSpeechSwitchResponse>
     */
    public CompletableFuture<UpdateWelcomeSpeechSwitchResponse> updateWelcomeSpeechSwitchAsync(
        UpdateWelcomeSpeechSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.updateWelcomeSpeechSwitch);
    }

    /**
     * 修改欢迎词功能开关
     *
     * 该接口用于修改欢迎词功能开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWelcomeSpeechSwitchRequest 请求对象
     * @return AsyncInvoker<UpdateWelcomeSpeechSwitchRequest, UpdateWelcomeSpeechSwitchResponse>
     */
    public AsyncInvoker<UpdateWelcomeSpeechSwitchRequest, UpdateWelcomeSpeechSwitchResponse> updateWelcomeSpeechSwitchAsyncInvoker(
        UpdateWelcomeSpeechSwitchRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.updateWelcomeSpeechSwitch, hcClient);
    }

}

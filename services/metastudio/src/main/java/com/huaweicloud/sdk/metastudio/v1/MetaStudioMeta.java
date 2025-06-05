package com.huaweicloud.sdk.metastudio.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.metastudio.v1.model.BatchAssetActionReq;
import com.huaweicloud.sdk.metastudio.v1.model.BatchConfirmLiveCommandsReq;
import com.huaweicloud.sdk.metastudio.v1.model.BatchConfirmLiveCommandsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.BatchConfirmLiveCommandsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.BatchDeletePacifyWordsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.BatchDeletePacifyWordsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.BatchExecuteAssetActionRequest;
import com.huaweicloud.sdk.metastudio.v1.model.BatchExecuteAssetActionResponse;
import com.huaweicloud.sdk.metastudio.v1.model.Cancel2DDigitalHumanVideoRequest;
import com.huaweicloud.sdk.metastudio.v1.model.Cancel2DDigitalHumanVideoResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CancelPhotoDigitalHumanVideoRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CancelPhotoDigitalHumanVideoResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CommitJobReq;
import com.huaweicloud.sdk.metastudio.v1.model.CommitVoiceTrainingJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CommitVoiceTrainingJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ConfirmFileUploadRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ConfirmFileUploadRequestBody;
import com.huaweicloud.sdk.metastudio.v1.model.ConfirmFileUploadResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ConfirmSmarLiveRoomReq;
import com.huaweicloud.sdk.metastudio.v1.model.ConfirmSmarLiveRoomRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ConfirmSmarLiveRoomResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ConfirmTrainingSegmentRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ConfirmTrainingSegmentResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ControlDigitalHumanLiveReq;
import com.huaweicloud.sdk.metastudio.v1.model.ControlSmartLiveReq;
import com.huaweicloud.sdk.metastudio.v1.model.CopyVideoScriptsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CopyVideoScriptsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CountTenantResourcesRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CountTenantResourcesResponse;
import com.huaweicloud.sdk.metastudio.v1.model.Create2DDigitalHumanVideoReq;
import com.huaweicloud.sdk.metastudio.v1.model.Create2DDigitalHumanVideoRequest;
import com.huaweicloud.sdk.metastudio.v1.model.Create2DDigitalHumanVideoResponse;
import com.huaweicloud.sdk.metastudio.v1.model.Create2dModelTrainingJobReq;
import com.huaweicloud.sdk.metastudio.v1.model.Create2dModelTrainingJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.Create2dModelTrainingJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateActiveCodeReq;
import com.huaweicloud.sdk.metastudio.v1.model.CreateActiveCodeRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateActiveCodeResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateAgencyWithRoleTypeRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateAgencyWithRoleTypeResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateAssetByReplicationInfoRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateAssetByReplicationInfoResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateAsyncTtsJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateAsyncTtsJobRequestBody;
import com.huaweicloud.sdk.metastudio.v1.model.CreateAsyncTtsJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateBatchKnowledgeQuestionReq;
import com.huaweicloud.sdk.metastudio.v1.model.CreateBatchKnowledgeQuestionRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateBatchKnowledgeQuestionResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateDialogReportConfigReq;
import com.huaweicloud.sdk.metastudio.v1.model.CreateDialogReportConfigRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateDialogReportConfigResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateDialogUrlReq;
import com.huaweicloud.sdk.metastudio.v1.model.CreateDialogUrlRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateDialogUrlResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateDigitalAssetRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateDigitalAssetRequestBody;
import com.huaweicloud.sdk.metastudio.v1.model.CreateDigitalAssetResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateDigitalHumanBusinessCardReq;
import com.huaweicloud.sdk.metastudio.v1.model.CreateDigitalHumanBusinessCardRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateDigitalHumanBusinessCardResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateFASReq;
import com.huaweicloud.sdk.metastudio.v1.model.CreateFacialAnimationsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateFacialAnimationsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateFileRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateFileResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateHotQuestionReq;
import com.huaweicloud.sdk.metastudio.v1.model.CreateHotQuestionRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateHotQuestionResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateHotWordsReq;
import com.huaweicloud.sdk.metastudio.v1.model.CreateHotWordsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateHotWordsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateIntentAndQuestionReq;
import com.huaweicloud.sdk.metastudio.v1.model.CreateIntentAndQuestionRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateIntentAndQuestionResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateInteractionRuleGroupRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateInteractionRuleGroupResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateKnowledgeIntentReq;
import com.huaweicloud.sdk.metastudio.v1.model.CreateKnowledgeIntentRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateKnowledgeIntentResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateKnowledgeQuestionReq;
import com.huaweicloud.sdk.metastudio.v1.model.CreateKnowledgeQuestionRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateKnowledgeQuestionResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateKnowledgeSkillReq;
import com.huaweicloud.sdk.metastudio.v1.model.CreateKnowledgeSkillRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateKnowledgeSkillResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateLargeFileRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateLargeFileResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateLivePlatformReq;
import com.huaweicloud.sdk.metastudio.v1.model.CreateLivePlatformRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateLivePlatformResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateMetaStudioOrdersReq;
import com.huaweicloud.sdk.metastudio.v1.model.CreateMetaStudioOrdersRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateMetaStudioOrdersResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateOnceCodeRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateOnceCodeResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePacifyWordsReq;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePacifyWordsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePacifyWordsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePhotoDetectionReq;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePhotoDetectionRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePhotoDetectionResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePhotoDigitalHumanVideoReq;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePhotoDigitalHumanVideoRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePhotoDigitalHumanVideoResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePictureModelingByUrlJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePictureModelingByUrlJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePictureModelingJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePictureModelingJobRequestBody;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePictureModelingJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateProductRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateProductRequestBody;
import com.huaweicloud.sdk.metastudio.v1.model.CreateProductResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateRobotReq;
import com.huaweicloud.sdk.metastudio.v1.model.CreateRobotRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateRobotResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateSmartChatRoomReq;
import com.huaweicloud.sdk.metastudio.v1.model.CreateSmartChatRoomRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateSmartChatRoomResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateSmartLiveRoomReq;
import com.huaweicloud.sdk.metastudio.v1.model.CreateSmartLiveRoomRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateSmartLiveRoomResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateSubtitleFileReq;
import com.huaweicloud.sdk.metastudio.v1.model.CreateSubtitleFileRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateSubtitleFileResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateTTSAReq;
import com.huaweicloud.sdk.metastudio.v1.model.CreateTrainingAdvanceJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateTrainingAdvanceJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateTrainingBasicJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateTrainingBasicJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateTrainingJobReq;
import com.huaweicloud.sdk.metastudio.v1.model.CreateTrainingMiddleJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateTrainingMiddleJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateTtsAuditionRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateTtsAuditionRequestBody;
import com.huaweicloud.sdk.metastudio.v1.model.CreateTtsAuditionResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateTtsaRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateTtsaResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateTtscVocabularyConfigsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateTtscVocabularyConfigsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateVideoMotionCaptureJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateVideoMotionCaptureJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateVideoScriptsReq;
import com.huaweicloud.sdk.metastudio.v1.model.CreateVideoScriptsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateVideoScriptsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateWelcomeSpeechReq;
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
import com.huaweicloud.sdk.metastudio.v1.model.DeleteDialogReportConfigRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteDialogReportConfigResponse;
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
import com.huaweicloud.sdk.metastudio.v1.model.DeleteLivePlatformRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteLivePlatformResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeletePacifyWordsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeletePacifyWordsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteProductRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteProductResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteRobotRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteRobotResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteSmartChatRoomRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteSmartChatRoomResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteSmartLiveRoomRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteSmartLiveRoomResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteTtscVocabularyConfigsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteTtscVocabularyConfigsRequestBody;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteTtscVocabularyConfigsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteVideoScriptRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteVideoScriptResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteVoiceTrainingJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteVoiceTrainingJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteWelcomeSpeechRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteWelcomeSpeechResponse;
import com.huaweicloud.sdk.metastudio.v1.model.Execute2dModelTrainingCommandByUserReq;
import com.huaweicloud.sdk.metastudio.v1.model.Execute2dModelTrainingCommandByUserRequest;
import com.huaweicloud.sdk.metastudio.v1.model.Execute2dModelTrainingCommandByUserResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ExecuteSmartLiveCommandRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ExecuteSmartLiveCommandResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ExecuteVideoMotionCaptureCommandRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ExecuteVideoMotionCaptureCommandResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ExportKnowledgeSkillRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ExportKnowledgeSkillResponse;
import com.huaweicloud.sdk.metastudio.v1.model.FilesCreateReq;
import com.huaweicloud.sdk.metastudio.v1.model.InteractionRuleGroup;
import com.huaweicloud.sdk.metastudio.v1.model.LargeFilesCreateReq;
import com.huaweicloud.sdk.metastudio.v1.model.List2dModelTrainingJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.List2dModelTrainingJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListActiveCodeRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListActiveCodeResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListAssetSummaryRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListAssetSummaryResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListAssetSummarysReq;
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
import com.huaweicloud.sdk.metastudio.v1.model.ListLivePlatformProductsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListLivePlatformProductsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListLivePlatformsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListLivePlatformsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListPacifyWordsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListPacifyWordsResponse;
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
import com.huaweicloud.sdk.metastudio.v1.model.ListSmartLiveRuleCommandsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListSmartLiveRuleCommandsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListSmartLiveScriptCommandsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListSmartLiveScriptCommandsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListStylesRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListStylesResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListTenantResourcesRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListTenantResourcesResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListTtsaDataRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListTtsaDataResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListTtsaJobsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListTtsaJobsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListTtscVocabularyConfigsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListTtscVocabularyConfigsResponse;
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
import com.huaweicloud.sdk.metastudio.v1.model.PictureModelingByUrlReq;
import com.huaweicloud.sdk.metastudio.v1.model.ProductAssetReleation;
import com.huaweicloud.sdk.metastudio.v1.model.ReplicationAssetInfo;
import com.huaweicloud.sdk.metastudio.v1.model.ReportLiveEventReq;
import com.huaweicloud.sdk.metastudio.v1.model.ResetActiveCodeReq;
import com.huaweicloud.sdk.metastudio.v1.model.ResetActiveCodeRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ResetActiveCodeResponse;
import com.huaweicloud.sdk.metastudio.v1.model.RestoreAssetRequest;
import com.huaweicloud.sdk.metastudio.v1.model.RestoreAssetResponse;
import com.huaweicloud.sdk.metastudio.v1.model.SaveTtscVocabularyConfigsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.SaveTtscVocabularyConfigsRequestBody;
import com.huaweicloud.sdk.metastudio.v1.model.SaveTtscVocabularyConfigsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.SetJobBatchNameReq;
import com.huaweicloud.sdk.metastudio.v1.model.SetJobBatchNameRequest;
import com.huaweicloud.sdk.metastudio.v1.model.SetJobBatchNameResponse;
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
import com.huaweicloud.sdk.metastudio.v1.model.ShowAsyncTtsJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowAsyncTtsJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowDialogReportConfigRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowDialogReportConfigResponse;
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
import com.huaweicloud.sdk.metastudio.v1.model.ShowLivePlatformRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowLivePlatformResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowPacifyWordsIntentRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowPacifyWordsIntentResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowPacifyWordsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowPacifyWordsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowPacifyWordsSwitchRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowPacifyWordsSwitchResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowPacifyWordsTriggerTimeRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowPacifyWordsTriggerTimeResponse;
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
import com.huaweicloud.sdk.metastudio.v1.model.ShowSubtitleFileRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowSubtitleFileResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowTenantDurationCfgRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowTenantDurationCfgResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowTrainingSegmentInfoRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowTrainingSegmentInfoResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowTtsAuditionFileRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowTtsAuditionFileResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowTtsPhoneticSymbolRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowTtsPhoneticSymbolResponse;
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
import com.huaweicloud.sdk.metastudio.v1.model.SmartChatJobsReq;
import com.huaweicloud.sdk.metastudio.v1.model.StartSmartChatJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.StartSmartChatJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.StartSmartLiveReq;
import com.huaweicloud.sdk.metastudio.v1.model.StartSmartLiveRequest;
import com.huaweicloud.sdk.metastudio.v1.model.StartSmartLiveResponse;
import com.huaweicloud.sdk.metastudio.v1.model.StopSmartChatJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.StopSmartChatJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.StopSmartLiveRequest;
import com.huaweicloud.sdk.metastudio.v1.model.StopSmartLiveResponse;
import com.huaweicloud.sdk.metastudio.v1.model.StopVideoMotionCaptureJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.StopVideoMotionCaptureJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.Update2dModelTrainingJobReq;
import com.huaweicloud.sdk.metastudio.v1.model.Update2dModelTrainingJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.Update2dModelTrainingJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateActiveCodeReq;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateActiveCodeRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateActiveCodeResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateBatchKnowledgeQuestionReq;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateBatchKnowledgeQuestionRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateBatchKnowledgeQuestionResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateDialogReportConfigReq;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateDialogReportConfigRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateDialogReportConfigResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateDigitalAssetRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateDigitalAssetRequestBody;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateDigitalAssetResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateDigitalHumanBusinessCardRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateDigitalHumanBusinessCardResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateHotQuestionReq;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateHotQuestionRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateHotQuestionResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateHotWordsReq;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateHotWordsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateHotWordsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateHotWordsSwitchReq;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateHotWordsSwitchRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateHotWordsSwitchResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateInteractionRuleGroupRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateInteractionRuleGroupResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateKnowledgeIntentReq;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateKnowledgeIntentRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateKnowledgeIntentResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateKnowledgeQuestionReq;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateKnowledgeQuestionRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateKnowledgeQuestionResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateKnowledgeSkillReq;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateKnowledgeSkillRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateKnowledgeSkillResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateLivePlatformReq;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateLivePlatformRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateLivePlatformResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdatePacifyWordsReq;
import com.huaweicloud.sdk.metastudio.v1.model.UpdatePacifyWordsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdatePacifyWordsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdatePacifyWordsSwitchReq;
import com.huaweicloud.sdk.metastudio.v1.model.UpdatePacifyWordsSwitchRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdatePacifyWordsSwitchResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdatePacifyWordsTriggerTimeReq;
import com.huaweicloud.sdk.metastudio.v1.model.UpdatePacifyWordsTriggerTimeRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdatePacifyWordsTriggerTimeResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateProductRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateProductRequestBody;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateProductResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateRobotReq;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateRobotRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateRobotResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateSmartChatRoomRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateSmartChatRoomResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateSmartLiveRoomRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateSmartLiveRoomResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateVideoScriptRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateVideoScriptResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateVideoScriptsReq;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateWelcomeSpeechReq;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateWelcomeSpeechRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateWelcomeSpeechResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateWelcomeSpeechSwitchReq;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateWelcomeSpeechSwitchRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateWelcomeSpeechSwitchResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ValidateRobotReq;
import com.huaweicloud.sdk.metastudio.v1.model.ValidateRobotRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ValidateRobotResponse;
import com.huaweicloud.sdk.metastudio.v1.model.VideoMotionCaptureJobReq;

import java.util.List;

@SuppressWarnings("unchecked")
public class MetaStudioMeta {

    public static final HttpRequestDef<CreateActiveCodeRequest, CreateActiveCodeResponse> createActiveCode =
        genForCreateActiveCode();

    private static HttpRequestDef<CreateActiveCodeRequest, CreateActiveCodeResponse> genForCreateActiveCode() {
        // basic
        HttpRequestDef.Builder<CreateActiveCodeRequest, CreateActiveCodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateActiveCodeRequest.class, CreateActiveCodeResponse.class)
                .withName("CreateActiveCode")
                .withUri("/v1/{project_id}/digital-human-chat/active-code")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateActiveCodeRequest::getAuthorization,
                CreateActiveCodeRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateActiveCodeRequest::getXSdkDate, CreateActiveCodeRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateActiveCodeRequest::getXProjectId, CreateActiveCodeRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateActiveCodeRequest::getXAppUserId, CreateActiveCodeRequest::setXAppUserId));
        builder.<CreateActiveCodeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateActiveCodeReq.class),
            f -> f.withMarshaller(CreateActiveCodeRequest::getBody, CreateActiveCodeRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateActiveCodeResponse::getXRequestId, CreateActiveCodeResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteActiveCodeRequest, DeleteActiveCodeResponse> deleteActiveCode =
        genForDeleteActiveCode();

    private static HttpRequestDef<DeleteActiveCodeRequest, DeleteActiveCodeResponse> genForDeleteActiveCode() {
        // basic
        HttpRequestDef.Builder<DeleteActiveCodeRequest, DeleteActiveCodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteActiveCodeRequest.class, DeleteActiveCodeResponse.class)
                .withName("DeleteActiveCode")
                .withUri("/v1/{project_id}/digital-human-chat/active-code/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteActiveCodeRequest::getAuthorization,
                DeleteActiveCodeRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteActiveCodeRequest::getXSdkDate, DeleteActiveCodeRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteActiveCodeRequest::getXProjectId, DeleteActiveCodeRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteActiveCodeRequest::getXAppUserId, DeleteActiveCodeRequest::setXAppUserId));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteActiveCodeRequest::getBody, DeleteActiveCodeRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteActiveCodeResponse::getXRequestId, DeleteActiveCodeResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListActiveCodeRequest, ListActiveCodeResponse> listActiveCode =
        genForListActiveCode();

    private static HttpRequestDef<ListActiveCodeRequest, ListActiveCodeResponse> genForListActiveCode() {
        // basic
        HttpRequestDef.Builder<ListActiveCodeRequest, ListActiveCodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListActiveCodeRequest.class, ListActiveCodeResponse.class)
                .withName("ListActiveCode")
                .withUri("/v1/{project_id}/digital-human-chat/active-code")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListActiveCodeRequest::getOffset, ListActiveCodeRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListActiveCodeRequest::getLimit, ListActiveCodeRequest::setLimit));
        builder.<String>withRequestField("robot_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListActiveCodeRequest::getRobotId, ListActiveCodeRequest::setRobotId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListActiveCodeRequest::getAuthorization, ListActiveCodeRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListActiveCodeRequest::getXSdkDate, ListActiveCodeRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListActiveCodeRequest::getXProjectId, ListActiveCodeRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListActiveCodeRequest::getXAppUserId, ListActiveCodeRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListActiveCodeResponse::getXRequestId, ListActiveCodeResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ResetActiveCodeRequest, ResetActiveCodeResponse> resetActiveCode =
        genForResetActiveCode();

    private static HttpRequestDef<ResetActiveCodeRequest, ResetActiveCodeResponse> genForResetActiveCode() {
        // basic
        HttpRequestDef.Builder<ResetActiveCodeRequest, ResetActiveCodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ResetActiveCodeRequest.class, ResetActiveCodeResponse.class)
                .withName("ResetActiveCode")
                .withUri("/v1/{project_id}/digital-human-chat/active-code/{active_code_id}/reset")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("active_code_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetActiveCodeRequest::getActiveCodeId, ResetActiveCodeRequest::setActiveCodeId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetActiveCodeRequest::getAuthorization, ResetActiveCodeRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetActiveCodeRequest::getXSdkDate, ResetActiveCodeRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetActiveCodeRequest::getXProjectId, ResetActiveCodeRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetActiveCodeRequest::getXAppUserId, ResetActiveCodeRequest::setXAppUserId));
        builder.<ResetActiveCodeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ResetActiveCodeReq.class),
            f -> f.withMarshaller(ResetActiveCodeRequest::getBody, ResetActiveCodeRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ResetActiveCodeResponse::getXRequestId, ResetActiveCodeResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowActiveCodeRequest, ShowActiveCodeResponse> showActiveCode =
        genForShowActiveCode();

    private static HttpRequestDef<ShowActiveCodeRequest, ShowActiveCodeResponse> genForShowActiveCode() {
        // basic
        HttpRequestDef.Builder<ShowActiveCodeRequest, ShowActiveCodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowActiveCodeRequest.class, ShowActiveCodeResponse.class)
                .withName("ShowActiveCode")
                .withUri("/v1/{project_id}/digital-human-chat/active-code/{active_code_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("active_code_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowActiveCodeRequest::getActiveCodeId, ShowActiveCodeRequest::setActiveCodeId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowActiveCodeRequest::getAuthorization, ShowActiveCodeRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowActiveCodeRequest::getXSdkDate, ShowActiveCodeRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowActiveCodeRequest::getXProjectId, ShowActiveCodeRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowActiveCodeRequest::getXAppUserId, ShowActiveCodeRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowActiveCodeResponse::getXRequestId, ShowActiveCodeResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateActiveCodeRequest, UpdateActiveCodeResponse> updateActiveCode =
        genForUpdateActiveCode();

    private static HttpRequestDef<UpdateActiveCodeRequest, UpdateActiveCodeResponse> genForUpdateActiveCode() {
        // basic
        HttpRequestDef.Builder<UpdateActiveCodeRequest, UpdateActiveCodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateActiveCodeRequest.class, UpdateActiveCodeResponse.class)
                .withName("UpdateActiveCode")
                .withUri("/v1/{project_id}/digital-human-chat/active-code/{active_code_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("active_code_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateActiveCodeRequest::getActiveCodeId, UpdateActiveCodeRequest::setActiveCodeId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateActiveCodeRequest::getAuthorization,
                UpdateActiveCodeRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateActiveCodeRequest::getXSdkDate, UpdateActiveCodeRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateActiveCodeRequest::getXProjectId, UpdateActiveCodeRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateActiveCodeRequest::getXAppUserId, UpdateActiveCodeRequest::setXAppUserId));
        builder.<UpdateActiveCodeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateActiveCodeReq.class),
            f -> f.withMarshaller(UpdateActiveCodeRequest::getBody, UpdateActiveCodeRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateActiveCodeResponse::getXRequestId, UpdateActiveCodeResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateAgencyWithRoleTypeRequest, CreateAgencyWithRoleTypeResponse> createAgencyWithRoleType =
        genForCreateAgencyWithRoleType();

    private static HttpRequestDef<CreateAgencyWithRoleTypeRequest, CreateAgencyWithRoleTypeResponse> genForCreateAgencyWithRoleType() {
        // basic
        HttpRequestDef.Builder<CreateAgencyWithRoleTypeRequest, CreateAgencyWithRoleTypeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateAgencyWithRoleTypeRequest.class, CreateAgencyWithRoleTypeResponse.class)
                .withName("CreateAgencyWithRoleType")
                .withUri("/v1/{project_id}/digital-human-chat/agency/{role_type}")
                .withContentType("application/json");

        // requests
        builder.<CreateAgencyWithRoleTypeRequest.RoleTypeEnum>withRequestField("role_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAgencyWithRoleTypeRequest.RoleTypeEnum.class),
            f -> f.withMarshaller(CreateAgencyWithRoleTypeRequest::getRoleType,
                CreateAgencyWithRoleTypeRequest::setRoleType));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateAgencyWithRoleTypeResponse::getXRequestId,
                CreateAgencyWithRoleTypeResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteAgencyWithRoleTypeRequest, DeleteAgencyWithRoleTypeResponse> deleteAgencyWithRoleType =
        genForDeleteAgencyWithRoleType();

    private static HttpRequestDef<DeleteAgencyWithRoleTypeRequest, DeleteAgencyWithRoleTypeResponse> genForDeleteAgencyWithRoleType() {
        // basic
        HttpRequestDef.Builder<DeleteAgencyWithRoleTypeRequest, DeleteAgencyWithRoleTypeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteAgencyWithRoleTypeRequest.class,
                    DeleteAgencyWithRoleTypeResponse.class)
                .withName("DeleteAgencyWithRoleType")
                .withUri("/v1/{project_id}/digital-human-chat/agency/{role_type}")
                .withContentType("application/json");

        // requests
        builder.<DeleteAgencyWithRoleTypeRequest.RoleTypeEnum>withRequestField("role_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteAgencyWithRoleTypeRequest.RoleTypeEnum.class),
            f -> f.withMarshaller(DeleteAgencyWithRoleTypeRequest::getRoleType,
                DeleteAgencyWithRoleTypeRequest::setRoleType));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteAgencyWithRoleTypeResponse::getXRequestId,
                DeleteAgencyWithRoleTypeResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowAgencyRequest, ShowAgencyResponse> showAgency = genForShowAgency();

    private static HttpRequestDef<ShowAgencyRequest, ShowAgencyResponse> genForShowAgency() {
        // basic
        HttpRequestDef.Builder<ShowAgencyRequest, ShowAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAgencyRequest.class, ShowAgencyResponse.class)
                .withName("ShowAgency")
                .withUri("/v1/{project_id}/digital-human-chat/agency")
                .withContentType("application/json");

        // requests
        builder.<ShowAgencyRequest.RoleTypeEnum>withRequestField("role_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowAgencyRequest.RoleTypeEnum.class),
            f -> f.withMarshaller(ShowAgencyRequest::getRoleType, ShowAgencyRequest::setRoleType));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAgencyResponse::getXRequestId, ShowAgencyResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateDialogUrlRequest, CreateDialogUrlResponse> createDialogUrl =
        genForCreateDialogUrl();

    private static HttpRequestDef<CreateDialogUrlRequest, CreateDialogUrlResponse> genForCreateDialogUrl() {
        // basic
        HttpRequestDef.Builder<CreateDialogUrlRequest, CreateDialogUrlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDialogUrlRequest.class, CreateDialogUrlResponse.class)
                .withName("CreateDialogUrl")
                .withUri("/v1/{project_id}/digital-human-chat/create-dialog-url")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDialogUrlRequest::getAuthorization, CreateDialogUrlRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDialogUrlRequest::getXSdkDate, CreateDialogUrlRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDialogUrlRequest::getXProjectId, CreateDialogUrlRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDialogUrlRequest::getXAppUserId, CreateDialogUrlRequest::setXAppUserId));
        builder.<CreateDialogUrlReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDialogUrlReq.class),
            f -> f.withMarshaller(CreateDialogUrlRequest::getBody, CreateDialogUrlRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateDialogUrlResponse::getXRequestId, CreateDialogUrlResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowSmartChatJobRequest, ShowSmartChatJobResponse> showSmartChatJob =
        genForShowSmartChatJob();

    private static HttpRequestDef<ShowSmartChatJobRequest, ShowSmartChatJobResponse> genForShowSmartChatJob() {
        // basic
        HttpRequestDef.Builder<ShowSmartChatJobRequest, ShowSmartChatJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSmartChatJobRequest.class, ShowSmartChatJobResponse.class)
                .withName("ShowSmartChatJob")
                .withUri(
                    "/v1/{project_id}/digital-human-chat/smart-chat-rooms/{room_id}/smart-chat-jobs/{job_id}/state")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("room_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSmartChatJobRequest::getRoomId, ShowSmartChatJobRequest::setRoomId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSmartChatJobRequest::getJobId, ShowSmartChatJobRequest::setJobId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSmartChatJobRequest::getAuthorization,
                ShowSmartChatJobRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSmartChatJobRequest::getXSdkDate, ShowSmartChatJobRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSmartChatJobRequest::getXProjectId, ShowSmartChatJobRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSmartChatJobRequest::getXAppUserId, ShowSmartChatJobRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowSmartChatJobResponse::getXRequestId, ShowSmartChatJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<StartSmartChatJobRequest, StartSmartChatJobResponse> startSmartChatJob =
        genForStartSmartChatJob();

    private static HttpRequestDef<StartSmartChatJobRequest, StartSmartChatJobResponse> genForStartSmartChatJob() {
        // basic
        HttpRequestDef.Builder<StartSmartChatJobRequest, StartSmartChatJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartSmartChatJobRequest.class, StartSmartChatJobResponse.class)
                .withName("StartSmartChatJob")
                .withUri("/v1/{project_id}/digital-human-chat/smart-chat-rooms/{room_id}/smart-chat-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("room_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartSmartChatJobRequest::getRoomId, StartSmartChatJobRequest::setRoomId));
        builder.<String>withRequestField("robot_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartSmartChatJobRequest::getRobotId, StartSmartChatJobRequest::setRobotId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartSmartChatJobRequest::getAuthorization,
                StartSmartChatJobRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartSmartChatJobRequest::getXSdkDate, StartSmartChatJobRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartSmartChatJobRequest::getXProjectId, StartSmartChatJobRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartSmartChatJobRequest::getXAppUserId, StartSmartChatJobRequest::setXAppUserId));
        builder.<SmartChatJobsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SmartChatJobsReq.class),
            f -> f.withMarshaller(StartSmartChatJobRequest::getBody, StartSmartChatJobRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StartSmartChatJobResponse::getXRequestId, StartSmartChatJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<StopSmartChatJobRequest, StopSmartChatJobResponse> stopSmartChatJob =
        genForStopSmartChatJob();

    private static HttpRequestDef<StopSmartChatJobRequest, StopSmartChatJobResponse> genForStopSmartChatJob() {
        // basic
        HttpRequestDef.Builder<StopSmartChatJobRequest, StopSmartChatJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopSmartChatJobRequest.class, StopSmartChatJobResponse.class)
                .withName("StopSmartChatJob")
                .withUri("/v1/{project_id}/digital-human-chat/smart-chat-rooms/{room_id}/smart-chat-jobs/{job_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("room_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopSmartChatJobRequest::getRoomId, StopSmartChatJobRequest::setRoomId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopSmartChatJobRequest::getJobId, StopSmartChatJobRequest::setJobId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopSmartChatJobRequest::getAuthorization,
                StopSmartChatJobRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopSmartChatJobRequest::getXSdkDate, StopSmartChatJobRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopSmartChatJobRequest::getXProjectId, StopSmartChatJobRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopSmartChatJobRequest::getXAppUserId, StopSmartChatJobRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StopSmartChatJobResponse::getXRequestId, StopSmartChatJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateDialogReportConfigRequest, CreateDialogReportConfigResponse> createDialogReportConfig =
        genForCreateDialogReportConfig();

    private static HttpRequestDef<CreateDialogReportConfigRequest, CreateDialogReportConfigResponse> genForCreateDialogReportConfig() {
        // basic
        HttpRequestDef.Builder<CreateDialogReportConfigRequest, CreateDialogReportConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateDialogReportConfigRequest.class, CreateDialogReportConfigResponse.class)
                .withName("CreateDialogReportConfig")
                .withUri("/v1/{project_id}/digital-human-chat/dialog-report-config")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDialogReportConfigRequest::getAuthorization,
                CreateDialogReportConfigRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDialogReportConfigRequest::getXSdkDate,
                CreateDialogReportConfigRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDialogReportConfigRequest::getXProjectId,
                CreateDialogReportConfigRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDialogReportConfigRequest::getXAppUserId,
                CreateDialogReportConfigRequest::setXAppUserId));
        builder.<CreateDialogReportConfigReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDialogReportConfigReq.class),
            f -> f.withMarshaller(CreateDialogReportConfigRequest::getBody, CreateDialogReportConfigRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateDialogReportConfigResponse::getXRequestId,
                CreateDialogReportConfigResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteDialogReportConfigRequest, DeleteDialogReportConfigResponse> deleteDialogReportConfig =
        genForDeleteDialogReportConfig();

    private static HttpRequestDef<DeleteDialogReportConfigRequest, DeleteDialogReportConfigResponse> genForDeleteDialogReportConfig() {
        // basic
        HttpRequestDef.Builder<DeleteDialogReportConfigRequest, DeleteDialogReportConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteDialogReportConfigRequest.class,
                    DeleteDialogReportConfigResponse.class)
                .withName("DeleteDialogReportConfig")
                .withUri("/v1/{project_id}/digital-human-chat/dialog-report-config")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDialogReportConfigRequest::getAuthorization,
                DeleteDialogReportConfigRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDialogReportConfigRequest::getXSdkDate,
                DeleteDialogReportConfigRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDialogReportConfigRequest::getXProjectId,
                DeleteDialogReportConfigRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDialogReportConfigRequest::getXAppUserId,
                DeleteDialogReportConfigRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteDialogReportConfigResponse::getXRequestId,
                DeleteDialogReportConfigResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowDialogReportConfigRequest, ShowDialogReportConfigResponse> showDialogReportConfig =
        genForShowDialogReportConfig();

    private static HttpRequestDef<ShowDialogReportConfigRequest, ShowDialogReportConfigResponse> genForShowDialogReportConfig() {
        // basic
        HttpRequestDef.Builder<ShowDialogReportConfigRequest, ShowDialogReportConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDialogReportConfigRequest.class, ShowDialogReportConfigResponse.class)
            .withName("ShowDialogReportConfig")
            .withUri("/v1/{project_id}/digital-human-chat/dialog-report-config")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDialogReportConfigRequest::getAuthorization,
                ShowDialogReportConfigRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDialogReportConfigRequest::getXSdkDate,
                ShowDialogReportConfigRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDialogReportConfigRequest::getXProjectId,
                ShowDialogReportConfigRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDialogReportConfigRequest::getXAppUserId,
                ShowDialogReportConfigRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowDialogReportConfigResponse::getXRequestId,
                ShowDialogReportConfigResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateDialogReportConfigRequest, UpdateDialogReportConfigResponse> updateDialogReportConfig =
        genForUpdateDialogReportConfig();

    private static HttpRequestDef<UpdateDialogReportConfigRequest, UpdateDialogReportConfigResponse> genForUpdateDialogReportConfig() {
        // basic
        HttpRequestDef.Builder<UpdateDialogReportConfigRequest, UpdateDialogReportConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateDialogReportConfigRequest.class, UpdateDialogReportConfigResponse.class)
                .withName("UpdateDialogReportConfig")
                .withUri("/v1/{project_id}/digital-human-chat/dialog-report-config")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDialogReportConfigRequest::getAuthorization,
                UpdateDialogReportConfigRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDialogReportConfigRequest::getXSdkDate,
                UpdateDialogReportConfigRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDialogReportConfigRequest::getXProjectId,
                UpdateDialogReportConfigRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDialogReportConfigRequest::getXAppUserId,
                UpdateDialogReportConfigRequest::setXAppUserId));
        builder.<UpdateDialogReportConfigReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDialogReportConfigReq.class),
            f -> f.withMarshaller(UpdateDialogReportConfigRequest::getBody, UpdateDialogReportConfigRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateDialogReportConfigResponse::getXRequestId,
                UpdateDialogReportConfigResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<BatchExecuteAssetActionRequest, BatchExecuteAssetActionResponse> batchExecuteAssetAction =
        genForBatchExecuteAssetAction();

    private static HttpRequestDef<BatchExecuteAssetActionRequest, BatchExecuteAssetActionResponse> genForBatchExecuteAssetAction() {
        // basic
        HttpRequestDef.Builder<BatchExecuteAssetActionRequest, BatchExecuteAssetActionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchExecuteAssetActionRequest.class, BatchExecuteAssetActionResponse.class)
            .withName("BatchExecuteAssetAction")
            .withUri("/v1/{project_id}/digital-assets/batch-action")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchExecuteAssetActionRequest::getAuthorization,
                BatchExecuteAssetActionRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchExecuteAssetActionRequest::getXSdkDate,
                BatchExecuteAssetActionRequest::setXSdkDate));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchExecuteAssetActionRequest::getXAppUserId,
                BatchExecuteAssetActionRequest::setXAppUserId));
        builder.<BatchAssetActionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAssetActionReq.class),
            f -> f.withMarshaller(BatchExecuteAssetActionRequest::getBody, BatchExecuteAssetActionRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchExecuteAssetActionResponse::getXRequestId,
                BatchExecuteAssetActionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateAssetByReplicationInfoRequest, CreateAssetByReplicationInfoResponse> createAssetByReplicationInfo =
        genForCreateAssetByReplicationInfo();

    private static HttpRequestDef<CreateAssetByReplicationInfoRequest, CreateAssetByReplicationInfoResponse> genForCreateAssetByReplicationInfo() {
        // basic
        HttpRequestDef.Builder<CreateAssetByReplicationInfoRequest, CreateAssetByReplicationInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateAssetByReplicationInfoRequest.class,
                    CreateAssetByReplicationInfoResponse.class)
                .withName("CreateAssetByReplicationInfo")
                .withUri("/v1/{project_id}/digital-assets-by-replication-info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAssetByReplicationInfoRequest::getAuthorization,
                CreateAssetByReplicationInfoRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAssetByReplicationInfoRequest::getXSdkDate,
                CreateAssetByReplicationInfoRequest::setXSdkDate));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAssetByReplicationInfoRequest::getXAppUserId,
                CreateAssetByReplicationInfoRequest::setXAppUserId));
        builder.<ReplicationAssetInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ReplicationAssetInfo.class),
            f -> f.withMarshaller(CreateAssetByReplicationInfoRequest::getBody,
                CreateAssetByReplicationInfoRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateAssetByReplicationInfoResponse::getXRequestId,
                CreateAssetByReplicationInfoResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateDigitalAssetRequest, CreateDigitalAssetResponse> createDigitalAsset =
        genForCreateDigitalAsset();

    private static HttpRequestDef<CreateDigitalAssetRequest, CreateDigitalAssetResponse> genForCreateDigitalAsset() {
        // basic
        HttpRequestDef.Builder<CreateDigitalAssetRequest, CreateDigitalAssetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDigitalAssetRequest.class, CreateDigitalAssetResponse.class)
                .withName("CreateDigitalAsset")
                .withUri("/v1/{project_id}/digital-assets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDigitalAssetRequest::getAuthorization,
                CreateDigitalAssetRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDigitalAssetRequest::getXSdkDate, CreateDigitalAssetRequest::setXSdkDate));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDigitalAssetRequest::getXAppUserId, CreateDigitalAssetRequest::setXAppUserId));
        builder.<String>withRequestField("X-MSS-Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDigitalAssetRequest::getXMSSAuthorization,
                CreateDigitalAssetRequest::setXMSSAuthorization));
        builder.<CreateDigitalAssetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDigitalAssetRequestBody.class),
            f -> f.withMarshaller(CreateDigitalAssetRequest::getBody, CreateDigitalAssetRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateDigitalAssetResponse::getXRequestId,
                CreateDigitalAssetResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteAssetRequest, DeleteAssetResponse> deleteAsset = genForDeleteAsset();

    private static HttpRequestDef<DeleteAssetRequest, DeleteAssetResponse> genForDeleteAsset() {
        // basic
        HttpRequestDef.Builder<DeleteAssetRequest, DeleteAssetResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAssetRequest.class, DeleteAssetResponse.class)
                .withName("DeleteAsset")
                .withUri("/v1/{project_id}/digital-assets/{asset_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssetRequest::getAssetId, DeleteAssetRequest::setAssetId));
        builder.<String>withRequestField("mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssetRequest::getMode, DeleteAssetRequest::setMode));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssetRequest::getAuthorization, DeleteAssetRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssetRequest::getXSdkDate, DeleteAssetRequest::setXSdkDate));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssetRequest::getXAppUserId, DeleteAssetRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteAssetResponse::getXRequestId, DeleteAssetResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListAssetSummaryRequest, ListAssetSummaryResponse> listAssetSummary =
        genForListAssetSummary();

    private static HttpRequestDef<ListAssetSummaryRequest, ListAssetSummaryResponse> genForListAssetSummary() {
        // basic
        HttpRequestDef.Builder<ListAssetSummaryRequest, ListAssetSummaryResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListAssetSummaryRequest.class, ListAssetSummaryResponse.class)
                .withName("ListAssetSummary")
                .withUri("/v1/{project_id}/digital-assets/summarys")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetSummaryRequest::getAuthorization,
                ListAssetSummaryRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetSummaryRequest::getXSdkDate, ListAssetSummaryRequest::setXSdkDate));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetSummaryRequest::getXAppUserId, ListAssetSummaryRequest::setXAppUserId));
        builder.<ListAssetSummarysReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListAssetSummarysReq.class),
            f -> f.withMarshaller(ListAssetSummaryRequest::getBody, ListAssetSummaryRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAssetSummaryResponse::getXRequestId, ListAssetSummaryResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListAssetsRequest, ListAssetsResponse> listAssets = genForListAssets();

    private static HttpRequestDef<ListAssetsRequest, ListAssetsResponse> genForListAssets() {
        // basic
        HttpRequestDef.Builder<ListAssetsRequest, ListAssetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAssetsRequest.class, ListAssetsResponse.class)
                .withName("ListAssets")
                .withUri("/v1/{project_id}/digital-assets")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssetsRequest::getLimit, ListAssetsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssetsRequest::getOffset, ListAssetsRequest::setOffset));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getName, ListAssetsRequest::setName));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getTag, ListAssetsRequest::setTag));
        builder.<ListAssetsRequest.TagCombinationTypeEnum>withRequestField("tag_combination_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAssetsRequest.TagCombinationTypeEnum.class),
            f -> f.withMarshaller(ListAssetsRequest::getTagCombinationType, ListAssetsRequest::setTagCombinationType));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getStartTime, ListAssetsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getEndTime, ListAssetsRequest::setEndTime));
        builder.<String>withRequestField("asset_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getAssetType, ListAssetsRequest::setAssetType));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getSortKey, ListAssetsRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getSortDir, ListAssetsRequest::setSortDir));
        builder.<ListAssetsRequest.AssetSourceEnum>withRequestField("asset_source",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAssetsRequest.AssetSourceEnum.class),
            f -> f.withMarshaller(ListAssetsRequest::getAssetSource, ListAssetsRequest::setAssetSource));
        builder.<String>withRequestField("asset_state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getAssetState, ListAssetsRequest::setAssetState));
        builder.<String>withRequestField("style_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getStyleId, ListAssetsRequest::setStyleId));
        builder.<List<String>>withRequestField("accurate_query_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAssetsRequest::getAccurateQueryField, ListAssetsRequest::setAccurateQueryField));
        builder.<String>withRequestField("render_engine",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getRenderEngine, ListAssetsRequest::setRenderEngine));
        builder.<List<String>>withRequestField("asset_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAssetsRequest::getAssetId, ListAssetsRequest::setAssetId));
        builder.<String>withRequestField("sex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getSex, ListAssetsRequest::setSex));
        builder.<String>withRequestField("language",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getLanguage, ListAssetsRequest::setLanguage));
        builder.<String>withRequestField("system_property",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getSystemProperty, ListAssetsRequest::setSystemProperty));
        builder.<Boolean>withRequestField("action_editable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAssetsRequest::getActionEditable, ListAssetsRequest::setActionEditable));
        builder.<Boolean>withRequestField("is_with_action_library",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAssetsRequest::getIsWithActionLibrary,
                ListAssetsRequest::setIsWithActionLibrary));
        builder.<Boolean>withRequestField("is_movable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAssetsRequest::getIsMovable, ListAssetsRequest::setIsMovable));
        builder.<String>withRequestField("voice_provider",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getVoiceProvider, ListAssetsRequest::setVoiceProvider));
        builder.<ListAssetsRequest.RoleEnum>withRequestField("role",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAssetsRequest.RoleEnum.class),
            f -> f.withMarshaller(ListAssetsRequest::getRole, ListAssetsRequest::setRole));
        builder.<Boolean>withRequestField("is_realtime_voice",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAssetsRequest::getIsRealtimeVoice, ListAssetsRequest::setIsRealtimeVoice));
        builder.<String>withRequestField("human_model_2d_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getHumanModel2dVersion,
                ListAssetsRequest::setHumanModel2dVersion));
        builder.<String>withRequestField("include_device_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getIncludeDeviceName, ListAssetsRequest::setIncludeDeviceName));
        builder.<String>withRequestField("exclude_device_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getExcludeDeviceName, ListAssetsRequest::setExcludeDeviceName));
        builder.<ListAssetsRequest.SupportedServiceEnum>withRequestField("supported_service",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAssetsRequest.SupportedServiceEnum.class),
            f -> f.withMarshaller(ListAssetsRequest::getSupportedService, ListAssetsRequest::setSupportedService));
        builder.<String>withRequestField("app_user_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getAppUserId, ListAssetsRequest::setAppUserId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getAuthorization, ListAssetsRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getXSdkDate, ListAssetsRequest::setXSdkDate));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getXAppUserId, ListAssetsRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAssetsResponse::getXRequestId, ListAssetsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<RestoreAssetRequest, RestoreAssetResponse> restoreAsset = genForRestoreAsset();

    private static HttpRequestDef<RestoreAssetRequest, RestoreAssetResponse> genForRestoreAsset() {
        // basic
        HttpRequestDef.Builder<RestoreAssetRequest, RestoreAssetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestoreAssetRequest.class, RestoreAssetResponse.class)
                .withName("RestoreAsset")
                .withUri("/v1/{project_id}/digital-assets/{asset_id}/restore")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreAssetRequest::getAssetId, RestoreAssetRequest::setAssetId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreAssetRequest::getAuthorization, RestoreAssetRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreAssetRequest::getXSdkDate, RestoreAssetRequest::setXSdkDate));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreAssetRequest::getXAppUserId, RestoreAssetRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(RestoreAssetResponse::getXRequestId, RestoreAssetResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowAssetRequest, ShowAssetResponse> showAsset = genForShowAsset();

    private static HttpRequestDef<ShowAssetRequest, ShowAssetResponse> genForShowAsset() {
        // basic
        HttpRequestDef.Builder<ShowAssetRequest, ShowAssetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAssetRequest.class, ShowAssetResponse.class)
                .withName("ShowAsset")
                .withUri("/v1/{project_id}/digital-assets/{asset_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetRequest::getAssetId, ShowAssetRequest::setAssetId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetRequest::getAuthorization, ShowAssetRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetRequest::getXSdkDate, ShowAssetRequest::setXSdkDate));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetRequest::getXAppUserId, ShowAssetRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAssetResponse::getXRequestId, ShowAssetResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowAssetReplicationInfoRequest, ShowAssetReplicationInfoResponse> showAssetReplicationInfo =
        genForShowAssetReplicationInfo();

    private static HttpRequestDef<ShowAssetReplicationInfoRequest, ShowAssetReplicationInfoResponse> genForShowAssetReplicationInfo() {
        // basic
        HttpRequestDef.Builder<ShowAssetReplicationInfoRequest, ShowAssetReplicationInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowAssetReplicationInfoRequest.class, ShowAssetReplicationInfoResponse.class)
                .withName("ShowAssetReplicationInfo")
                .withUri("/v1/{project_id}/digital-assets/{asset_id}/replication-info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetReplicationInfoRequest::getAssetId,
                ShowAssetReplicationInfoRequest::setAssetId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetReplicationInfoRequest::getAuthorization,
                ShowAssetReplicationInfoRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetReplicationInfoRequest::getXSdkDate,
                ShowAssetReplicationInfoRequest::setXSdkDate));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetReplicationInfoRequest::getXAppUserId,
                ShowAssetReplicationInfoRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAssetReplicationInfoResponse::getXRequestId,
                ShowAssetReplicationInfoResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateDigitalAssetRequest, UpdateDigitalAssetResponse> updateDigitalAsset =
        genForUpdateDigitalAsset();

    private static HttpRequestDef<UpdateDigitalAssetRequest, UpdateDigitalAssetResponse> genForUpdateDigitalAsset() {
        // basic
        HttpRequestDef.Builder<UpdateDigitalAssetRequest, UpdateDigitalAssetResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDigitalAssetRequest.class, UpdateDigitalAssetResponse.class)
                .withName("UpdateDigitalAsset")
                .withUri("/v1/{project_id}/digital-assets/{asset_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDigitalAssetRequest::getAssetId, UpdateDigitalAssetRequest::setAssetId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDigitalAssetRequest::getAuthorization,
                UpdateDigitalAssetRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDigitalAssetRequest::getXSdkDate, UpdateDigitalAssetRequest::setXSdkDate));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDigitalAssetRequest::getXAppUserId, UpdateDigitalAssetRequest::setXAppUserId));
        builder.<UpdateDigitalAssetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDigitalAssetRequestBody.class),
            f -> f.withMarshaller(UpdateDigitalAssetRequest::getBody, UpdateDigitalAssetRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateDigitalAssetResponse::getXRequestId,
                UpdateDigitalAssetResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateDigitalHumanBusinessCardRequest, CreateDigitalHumanBusinessCardResponse> createDigitalHumanBusinessCard =
        genForCreateDigitalHumanBusinessCard();

    private static HttpRequestDef<CreateDigitalHumanBusinessCardRequest, CreateDigitalHumanBusinessCardResponse> genForCreateDigitalHumanBusinessCard() {
        // basic
        HttpRequestDef.Builder<CreateDigitalHumanBusinessCardRequest, CreateDigitalHumanBusinessCardResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateDigitalHumanBusinessCardRequest.class,
                    CreateDigitalHumanBusinessCardResponse.class)
                .withName("CreateDigitalHumanBusinessCard")
                .withUri("/v1/{project_id}/digital-human-business-cards")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDigitalHumanBusinessCardRequest::getAuthorization,
                CreateDigitalHumanBusinessCardRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDigitalHumanBusinessCardRequest::getXSdkDate,
                CreateDigitalHumanBusinessCardRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDigitalHumanBusinessCardRequest::getXProjectId,
                CreateDigitalHumanBusinessCardRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDigitalHumanBusinessCardRequest::getXAppUserId,
                CreateDigitalHumanBusinessCardRequest::setXAppUserId));
        builder.<CreateDigitalHumanBusinessCardReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDigitalHumanBusinessCardReq.class),
            f -> f.withMarshaller(CreateDigitalHumanBusinessCardRequest::getBody,
                CreateDigitalHumanBusinessCardRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateDigitalHumanBusinessCardResponse::getXRequestId,
                CreateDigitalHumanBusinessCardResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteDigitalHumanBusinessCardRequest, DeleteDigitalHumanBusinessCardResponse> deleteDigitalHumanBusinessCard =
        genForDeleteDigitalHumanBusinessCard();

    private static HttpRequestDef<DeleteDigitalHumanBusinessCardRequest, DeleteDigitalHumanBusinessCardResponse> genForDeleteDigitalHumanBusinessCard() {
        // basic
        HttpRequestDef.Builder<DeleteDigitalHumanBusinessCardRequest, DeleteDigitalHumanBusinessCardResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteDigitalHumanBusinessCardRequest.class,
                    DeleteDigitalHumanBusinessCardResponse.class)
                .withName("DeleteDigitalHumanBusinessCard")
                .withUri("/v1/{project_id}/digital-human-business-cards/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDigitalHumanBusinessCardRequest::getJobId,
                DeleteDigitalHumanBusinessCardRequest::setJobId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDigitalHumanBusinessCardRequest::getAuthorization,
                DeleteDigitalHumanBusinessCardRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDigitalHumanBusinessCardRequest::getXSdkDate,
                DeleteDigitalHumanBusinessCardRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDigitalHumanBusinessCardRequest::getXProjectId,
                DeleteDigitalHumanBusinessCardRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDigitalHumanBusinessCardRequest::getXAppUserId,
                DeleteDigitalHumanBusinessCardRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteDigitalHumanBusinessCardResponse::getXRequestId,
                DeleteDigitalHumanBusinessCardResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListDigitalHumanBusinessCardRequest, ListDigitalHumanBusinessCardResponse> listDigitalHumanBusinessCard =
        genForListDigitalHumanBusinessCard();

    private static HttpRequestDef<ListDigitalHumanBusinessCardRequest, ListDigitalHumanBusinessCardResponse> genForListDigitalHumanBusinessCard() {
        // basic
        HttpRequestDef.Builder<ListDigitalHumanBusinessCardRequest, ListDigitalHumanBusinessCardResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListDigitalHumanBusinessCardRequest.class,
                    ListDigitalHumanBusinessCardResponse.class)
                .withName("ListDigitalHumanBusinessCard")
                .withUri("/v1/{project_id}/digital-human-business-cards")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDigitalHumanBusinessCardRequest::getOffset,
                ListDigitalHumanBusinessCardRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDigitalHumanBusinessCardRequest::getLimit,
                ListDigitalHumanBusinessCardRequest::setLimit));
        builder.<String>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanBusinessCardRequest::getState,
                ListDigitalHumanBusinessCardRequest::setState));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanBusinessCardRequest::getSortKey,
                ListDigitalHumanBusinessCardRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanBusinessCardRequest::getSortDir,
                ListDigitalHumanBusinessCardRequest::setSortDir));
        builder.<String>withRequestField("create_until",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanBusinessCardRequest::getCreateUntil,
                ListDigitalHumanBusinessCardRequest::setCreateUntil));
        builder.<String>withRequestField("create_since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanBusinessCardRequest::getCreateSince,
                ListDigitalHumanBusinessCardRequest::setCreateSince));
        builder.<String>withRequestField("video_asset_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanBusinessCardRequest::getVideoAssetName,
                ListDigitalHumanBusinessCardRequest::setVideoAssetName));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanBusinessCardRequest::getAuthorization,
                ListDigitalHumanBusinessCardRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanBusinessCardRequest::getXSdkDate,
                ListDigitalHumanBusinessCardRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanBusinessCardRequest::getXProjectId,
                ListDigitalHumanBusinessCardRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanBusinessCardRequest::getXAppUserId,
                ListDigitalHumanBusinessCardRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDigitalHumanBusinessCardResponse::getXRequestId,
                ListDigitalHumanBusinessCardResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowDigitalHumanBusinessCardRequest, ShowDigitalHumanBusinessCardResponse> showDigitalHumanBusinessCard =
        genForShowDigitalHumanBusinessCard();

    private static HttpRequestDef<ShowDigitalHumanBusinessCardRequest, ShowDigitalHumanBusinessCardResponse> genForShowDigitalHumanBusinessCard() {
        // basic
        HttpRequestDef.Builder<ShowDigitalHumanBusinessCardRequest, ShowDigitalHumanBusinessCardResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDigitalHumanBusinessCardRequest.class,
                    ShowDigitalHumanBusinessCardResponse.class)
                .withName("ShowDigitalHumanBusinessCard")
                .withUri("/v1/{project_id}/digital-human-business-cards/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDigitalHumanBusinessCardRequest::getJobId,
                ShowDigitalHumanBusinessCardRequest::setJobId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDigitalHumanBusinessCardRequest::getAuthorization,
                ShowDigitalHumanBusinessCardRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDigitalHumanBusinessCardRequest::getXSdkDate,
                ShowDigitalHumanBusinessCardRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDigitalHumanBusinessCardRequest::getXProjectId,
                ShowDigitalHumanBusinessCardRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDigitalHumanBusinessCardRequest::getXAppUserId,
                ShowDigitalHumanBusinessCardRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowDigitalHumanBusinessCardResponse::getXRequestId,
                ShowDigitalHumanBusinessCardResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateDigitalHumanBusinessCardRequest, UpdateDigitalHumanBusinessCardResponse> updateDigitalHumanBusinessCard =
        genForUpdateDigitalHumanBusinessCard();

    private static HttpRequestDef<UpdateDigitalHumanBusinessCardRequest, UpdateDigitalHumanBusinessCardResponse> genForUpdateDigitalHumanBusinessCard() {
        // basic
        HttpRequestDef.Builder<UpdateDigitalHumanBusinessCardRequest, UpdateDigitalHumanBusinessCardResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateDigitalHumanBusinessCardRequest.class,
                    UpdateDigitalHumanBusinessCardResponse.class)
                .withName("UpdateDigitalHumanBusinessCard")
                .withUri("/v1/{project_id}/digital-human-business-cards/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDigitalHumanBusinessCardRequest::getJobId,
                UpdateDigitalHumanBusinessCardRequest::setJobId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDigitalHumanBusinessCardRequest::getAuthorization,
                UpdateDigitalHumanBusinessCardRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDigitalHumanBusinessCardRequest::getXSdkDate,
                UpdateDigitalHumanBusinessCardRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDigitalHumanBusinessCardRequest::getXProjectId,
                UpdateDigitalHumanBusinessCardRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDigitalHumanBusinessCardRequest::getXAppUserId,
                UpdateDigitalHumanBusinessCardRequest::setXAppUserId));
        builder.<CreateDigitalHumanBusinessCardReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDigitalHumanBusinessCardReq.class),
            f -> f.withMarshaller(UpdateDigitalHumanBusinessCardRequest::getBody,
                UpdateDigitalHumanBusinessCardRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateDigitalHumanBusinessCardResponse::getXRequestId,
                UpdateDigitalHumanBusinessCardResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListDigitalHumanVideoRequest, ListDigitalHumanVideoResponse> listDigitalHumanVideo =
        genForListDigitalHumanVideo();

    private static HttpRequestDef<ListDigitalHumanVideoRequest, ListDigitalHumanVideoResponse> genForListDigitalHumanVideo() {
        // basic
        HttpRequestDef.Builder<ListDigitalHumanVideoRequest, ListDigitalHumanVideoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListDigitalHumanVideoRequest.class, ListDigitalHumanVideoResponse.class)
            .withName("ListDigitalHumanVideo")
            .withUri("/v1/{project_id}/digital-human-videos")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDigitalHumanVideoRequest::getOffset, ListDigitalHumanVideoRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDigitalHumanVideoRequest::getLimit, ListDigitalHumanVideoRequest::setLimit));
        builder.<String>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanVideoRequest::getState, ListDigitalHumanVideoRequest::setState));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanVideoRequest::getSortKey, ListDigitalHumanVideoRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanVideoRequest::getSortDir, ListDigitalHumanVideoRequest::setSortDir));
        builder.<String>withRequestField("create_until",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanVideoRequest::getCreateUntil,
                ListDigitalHumanVideoRequest::setCreateUntil));
        builder.<String>withRequestField("create_since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanVideoRequest::getCreateSince,
                ListDigitalHumanVideoRequest::setCreateSince));
        builder.<List<String>>withRequestField("fuzzy_query_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDigitalHumanVideoRequest::getFuzzyQueryField,
                ListDigitalHumanVideoRequest::setFuzzyQueryField));
        builder.<String>withRequestField("script_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanVideoRequest::getScriptId,
                ListDigitalHumanVideoRequest::setScriptId));
        builder.<String>withRequestField("asset_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanVideoRequest::getAssetName,
                ListDigitalHumanVideoRequest::setAssetName));
        builder.<String>withRequestField("job_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanVideoRequest::getJobType, ListDigitalHumanVideoRequest::setJobType));
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanVideoRequest::getJobId, ListDigitalHumanVideoRequest::setJobId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanVideoRequest::getAuthorization,
                ListDigitalHumanVideoRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanVideoRequest::getXSdkDate,
                ListDigitalHumanVideoRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanVideoRequest::getXProjectId,
                ListDigitalHumanVideoRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanVideoRequest::getXAppUserId,
                ListDigitalHumanVideoRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDigitalHumanVideoResponse::getXRequestId,
                ListDigitalHumanVideoResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<Cancel2DDigitalHumanVideoRequest, Cancel2DDigitalHumanVideoResponse> cancel2DDigitalHumanVideo =
        genForCancel2DDigitalHumanVideo();

    private static HttpRequestDef<Cancel2DDigitalHumanVideoRequest, Cancel2DDigitalHumanVideoResponse> genForCancel2DDigitalHumanVideo() {
        // basic
        HttpRequestDef.Builder<Cancel2DDigitalHumanVideoRequest, Cancel2DDigitalHumanVideoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    Cancel2DDigitalHumanVideoRequest.class,
                    Cancel2DDigitalHumanVideoResponse.class)
                .withName("Cancel2DDigitalHumanVideo")
                .withUri("/v1/{project_id}/2d-digital-human-videos/{job_id}/cancel")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Cancel2DDigitalHumanVideoRequest::getJobId,
                Cancel2DDigitalHumanVideoRequest::setJobId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Cancel2DDigitalHumanVideoRequest::getAuthorization,
                Cancel2DDigitalHumanVideoRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Cancel2DDigitalHumanVideoRequest::getXSdkDate,
                Cancel2DDigitalHumanVideoRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Cancel2DDigitalHumanVideoRequest::getXProjectId,
                Cancel2DDigitalHumanVideoRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Cancel2DDigitalHumanVideoRequest::getXAppUserId,
                Cancel2DDigitalHumanVideoRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(Cancel2DDigitalHumanVideoResponse::getXRequestId,
                Cancel2DDigitalHumanVideoResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<Create2DDigitalHumanVideoRequest, Create2DDigitalHumanVideoResponse> create2DDigitalHumanVideo =
        genForCreate2DDigitalHumanVideo();

    private static HttpRequestDef<Create2DDigitalHumanVideoRequest, Create2DDigitalHumanVideoResponse> genForCreate2DDigitalHumanVideo() {
        // basic
        HttpRequestDef.Builder<Create2DDigitalHumanVideoRequest, Create2DDigitalHumanVideoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    Create2DDigitalHumanVideoRequest.class,
                    Create2DDigitalHumanVideoResponse.class)
                .withName("Create2DDigitalHumanVideo")
                .withUri("/v1/{project_id}/2d-digital-human-videos")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Create2DDigitalHumanVideoRequest::getAuthorization,
                Create2DDigitalHumanVideoRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Create2DDigitalHumanVideoRequest::getXSdkDate,
                Create2DDigitalHumanVideoRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Create2DDigitalHumanVideoRequest::getXProjectId,
                Create2DDigitalHumanVideoRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Create2DDigitalHumanVideoRequest::getXAppUserId,
                Create2DDigitalHumanVideoRequest::setXAppUserId));
        builder.<Create2DDigitalHumanVideoReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Create2DDigitalHumanVideoReq.class),
            f -> f.withMarshaller(Create2DDigitalHumanVideoRequest::getBody,
                Create2DDigitalHumanVideoRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(Create2DDigitalHumanVideoResponse::getXRequestId,
                Create2DDigitalHumanVideoResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<Show2DDigitalHumanVideoRequest, Show2DDigitalHumanVideoResponse> show2DDigitalHumanVideo =
        genForShow2DDigitalHumanVideo();

    private static HttpRequestDef<Show2DDigitalHumanVideoRequest, Show2DDigitalHumanVideoResponse> genForShow2DDigitalHumanVideo() {
        // basic
        HttpRequestDef.Builder<Show2DDigitalHumanVideoRequest, Show2DDigitalHumanVideoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, Show2DDigitalHumanVideoRequest.class, Show2DDigitalHumanVideoResponse.class)
            .withName("Show2DDigitalHumanVideo")
            .withUri("/v1/{project_id}/2d-digital-human-videos/{job_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Show2DDigitalHumanVideoRequest::getJobId, Show2DDigitalHumanVideoRequest::setJobId));
        builder.<Boolean>withRequestField("show_script",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(Show2DDigitalHumanVideoRequest::getShowScript,
                Show2DDigitalHumanVideoRequest::setShowScript));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Show2DDigitalHumanVideoRequest::getAuthorization,
                Show2DDigitalHumanVideoRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Show2DDigitalHumanVideoRequest::getXSdkDate,
                Show2DDigitalHumanVideoRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Show2DDigitalHumanVideoRequest::getXProjectId,
                Show2DDigitalHumanVideoRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Show2DDigitalHumanVideoRequest::getXAppUserId,
                Show2DDigitalHumanVideoRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(Show2DDigitalHumanVideoResponse::getXRequestId,
                Show2DDigitalHumanVideoResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CancelPhotoDigitalHumanVideoRequest, CancelPhotoDigitalHumanVideoResponse> cancelPhotoDigitalHumanVideo =
        genForCancelPhotoDigitalHumanVideo();

    private static HttpRequestDef<CancelPhotoDigitalHumanVideoRequest, CancelPhotoDigitalHumanVideoResponse> genForCancelPhotoDigitalHumanVideo() {
        // basic
        HttpRequestDef.Builder<CancelPhotoDigitalHumanVideoRequest, CancelPhotoDigitalHumanVideoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CancelPhotoDigitalHumanVideoRequest.class,
                    CancelPhotoDigitalHumanVideoResponse.class)
                .withName("CancelPhotoDigitalHumanVideo")
                .withUri("/v1/{project_id}/photo-digital-human-videos/{job_id}/cancel")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelPhotoDigitalHumanVideoRequest::getJobId,
                CancelPhotoDigitalHumanVideoRequest::setJobId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelPhotoDigitalHumanVideoRequest::getAuthorization,
                CancelPhotoDigitalHumanVideoRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelPhotoDigitalHumanVideoRequest::getXSdkDate,
                CancelPhotoDigitalHumanVideoRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelPhotoDigitalHumanVideoRequest::getXProjectId,
                CancelPhotoDigitalHumanVideoRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelPhotoDigitalHumanVideoRequest::getXAppUserId,
                CancelPhotoDigitalHumanVideoRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CancelPhotoDigitalHumanVideoResponse::getXRequestId,
                CancelPhotoDigitalHumanVideoResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreatePhotoDetectionRequest, CreatePhotoDetectionResponse> createPhotoDetection =
        genForCreatePhotoDetection();

    private static HttpRequestDef<CreatePhotoDetectionRequest, CreatePhotoDetectionResponse> genForCreatePhotoDetection() {
        // basic
        HttpRequestDef.Builder<CreatePhotoDetectionRequest, CreatePhotoDetectionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreatePhotoDetectionRequest.class, CreatePhotoDetectionResponse.class)
            .withName("CreatePhotoDetection")
            .withUri("/v1/{project_id}/photo-detection")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePhotoDetectionRequest::getAuthorization,
                CreatePhotoDetectionRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePhotoDetectionRequest::getXSdkDate, CreatePhotoDetectionRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePhotoDetectionRequest::getXProjectId,
                CreatePhotoDetectionRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePhotoDetectionRequest::getXAppUserId,
                CreatePhotoDetectionRequest::setXAppUserId));
        builder.<CreatePhotoDetectionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePhotoDetectionReq.class),
            f -> f.withMarshaller(CreatePhotoDetectionRequest::getBody, CreatePhotoDetectionRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePhotoDetectionResponse::getXRequestId,
                CreatePhotoDetectionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreatePhotoDigitalHumanVideoRequest, CreatePhotoDigitalHumanVideoResponse> createPhotoDigitalHumanVideo =
        genForCreatePhotoDigitalHumanVideo();

    private static HttpRequestDef<CreatePhotoDigitalHumanVideoRequest, CreatePhotoDigitalHumanVideoResponse> genForCreatePhotoDigitalHumanVideo() {
        // basic
        HttpRequestDef.Builder<CreatePhotoDigitalHumanVideoRequest, CreatePhotoDigitalHumanVideoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreatePhotoDigitalHumanVideoRequest.class,
                    CreatePhotoDigitalHumanVideoResponse.class)
                .withName("CreatePhotoDigitalHumanVideo")
                .withUri("/v1/{project_id}/photo-digital-human-videos")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePhotoDigitalHumanVideoRequest::getAuthorization,
                CreatePhotoDigitalHumanVideoRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePhotoDigitalHumanVideoRequest::getXSdkDate,
                CreatePhotoDigitalHumanVideoRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePhotoDigitalHumanVideoRequest::getXProjectId,
                CreatePhotoDigitalHumanVideoRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePhotoDigitalHumanVideoRequest::getXAppUserId,
                CreatePhotoDigitalHumanVideoRequest::setXAppUserId));
        builder.<CreatePhotoDigitalHumanVideoReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePhotoDigitalHumanVideoReq.class),
            f -> f.withMarshaller(CreatePhotoDigitalHumanVideoRequest::getBody,
                CreatePhotoDigitalHumanVideoRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePhotoDigitalHumanVideoResponse::getXRequestId,
                CreatePhotoDigitalHumanVideoResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowPhotoDetectionRequest, ShowPhotoDetectionResponse> showPhotoDetection =
        genForShowPhotoDetection();

    private static HttpRequestDef<ShowPhotoDetectionRequest, ShowPhotoDetectionResponse> genForShowPhotoDetection() {
        // basic
        HttpRequestDef.Builder<ShowPhotoDetectionRequest, ShowPhotoDetectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPhotoDetectionRequest.class, ShowPhotoDetectionResponse.class)
                .withName("ShowPhotoDetection")
                .withUri("/v1/{project_id}/photo-detection/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPhotoDetectionRequest::getJobId, ShowPhotoDetectionRequest::setJobId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPhotoDetectionRequest::getAuthorization,
                ShowPhotoDetectionRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPhotoDetectionRequest::getXSdkDate, ShowPhotoDetectionRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPhotoDetectionRequest::getXProjectId, ShowPhotoDetectionRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPhotoDetectionRequest::getXAppUserId, ShowPhotoDetectionRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPhotoDetectionResponse::getXRequestId,
                ShowPhotoDetectionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowPhotoDigitalHumanVideoRequest, ShowPhotoDigitalHumanVideoResponse> showPhotoDigitalHumanVideo =
        genForShowPhotoDigitalHumanVideo();

    private static HttpRequestDef<ShowPhotoDigitalHumanVideoRequest, ShowPhotoDigitalHumanVideoResponse> genForShowPhotoDigitalHumanVideo() {
        // basic
        HttpRequestDef.Builder<ShowPhotoDigitalHumanVideoRequest, ShowPhotoDigitalHumanVideoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowPhotoDigitalHumanVideoRequest.class,
                    ShowPhotoDigitalHumanVideoResponse.class)
                .withName("ShowPhotoDigitalHumanVideo")
                .withUri("/v1/{project_id}/photo-digital-human-videos/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPhotoDigitalHumanVideoRequest::getJobId,
                ShowPhotoDigitalHumanVideoRequest::setJobId));
        builder.<Boolean>withRequestField("show_script",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowPhotoDigitalHumanVideoRequest::getShowScript,
                ShowPhotoDigitalHumanVideoRequest::setShowScript));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPhotoDigitalHumanVideoRequest::getAuthorization,
                ShowPhotoDigitalHumanVideoRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPhotoDigitalHumanVideoRequest::getXSdkDate,
                ShowPhotoDigitalHumanVideoRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPhotoDigitalHumanVideoRequest::getXProjectId,
                ShowPhotoDigitalHumanVideoRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPhotoDigitalHumanVideoRequest::getXAppUserId,
                ShowPhotoDigitalHumanVideoRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPhotoDigitalHumanVideoResponse::getXRequestId,
                ShowPhotoDigitalHumanVideoResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ConfirmFileUploadRequest, ConfirmFileUploadResponse> confirmFileUpload =
        genForConfirmFileUpload();

    private static HttpRequestDef<ConfirmFileUploadRequest, ConfirmFileUploadResponse> genForConfirmFileUpload() {
        // basic
        HttpRequestDef.Builder<ConfirmFileUploadRequest, ConfirmFileUploadResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ConfirmFileUploadRequest.class, ConfirmFileUploadResponse.class)
                .withName("ConfirmFileUpload")
                .withUri("/v1/{project_id}/files/{file_id}/complete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("file_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmFileUploadRequest::getFileId, ConfirmFileUploadRequest::setFileId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmFileUploadRequest::getAuthorization,
                ConfirmFileUploadRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmFileUploadRequest::getXSdkDate, ConfirmFileUploadRequest::setXSdkDate));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmFileUploadRequest::getXAppUserId, ConfirmFileUploadRequest::setXAppUserId));
        builder.<ConfirmFileUploadRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConfirmFileUploadRequestBody.class),
            f -> f.withMarshaller(ConfirmFileUploadRequest::getBody, ConfirmFileUploadRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ConfirmFileUploadResponse::getXRequestId, ConfirmFileUploadResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateFileRequest, CreateFileResponse> createFile = genForCreateFile();

    private static HttpRequestDef<CreateFileRequest, CreateFileResponse> genForCreateFile() {
        // basic
        HttpRequestDef.Builder<CreateFileRequest, CreateFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFileRequest.class, CreateFileResponse.class)
                .withName("CreateFile")
                .withUri("/v1/{project_id}/files")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFileRequest::getAuthorization, CreateFileRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFileRequest::getXSdkDate, CreateFileRequest::setXSdkDate));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFileRequest::getXAppUserId, CreateFileRequest::setXAppUserId));
        builder.<FilesCreateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FilesCreateReq.class),
            f -> f.withMarshaller(CreateFileRequest::getBody, CreateFileRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateFileResponse::getXRequestId, CreateFileResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateLargeFileRequest, CreateLargeFileResponse> createLargeFile =
        genForCreateLargeFile();

    private static HttpRequestDef<CreateLargeFileRequest, CreateLargeFileResponse> genForCreateLargeFile() {
        // basic
        HttpRequestDef.Builder<CreateLargeFileRequest, CreateLargeFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLargeFileRequest.class, CreateLargeFileResponse.class)
                .withName("CreateLargeFile")
                .withUri("/v1/{project_id}/large-files")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLargeFileRequest::getAuthorization, CreateLargeFileRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLargeFileRequest::getXSdkDate, CreateLargeFileRequest::setXSdkDate));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLargeFileRequest::getXAppUserId, CreateLargeFileRequest::setXAppUserId));
        builder.<LargeFilesCreateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LargeFilesCreateReq.class),
            f -> f.withMarshaller(CreateLargeFileRequest::getBody, CreateLargeFileRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateLargeFileResponse::getXRequestId, CreateLargeFileResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteFileRequest, DeleteFileResponse> deleteFile = genForDeleteFile();

    private static HttpRequestDef<DeleteFileRequest, DeleteFileResponse> genForDeleteFile() {
        // basic
        HttpRequestDef.Builder<DeleteFileRequest, DeleteFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteFileRequest.class, DeleteFileResponse.class)
                .withName("DeleteFile")
                .withUri("/v1/{project_id}/files/{file_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("file_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFileRequest::getFileId, DeleteFileRequest::setFileId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFileRequest::getAuthorization, DeleteFileRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFileRequest::getXSdkDate, DeleteFileRequest::setXSdkDate));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFileRequest::getXAppUserId, DeleteFileRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteFileResponse::getXRequestId, DeleteFileResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateHotQuestionRequest, CreateHotQuestionResponse> createHotQuestion =
        genForCreateHotQuestion();

    private static HttpRequestDef<CreateHotQuestionRequest, CreateHotQuestionResponse> genForCreateHotQuestion() {
        // basic
        HttpRequestDef.Builder<CreateHotQuestionRequest, CreateHotQuestionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateHotQuestionRequest.class, CreateHotQuestionResponse.class)
                .withName("CreateHotQuestion")
                .withUri("/v1/{project_id}/digital-human-chat/hot-question")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateHotQuestionRequest::getAuthorization,
                CreateHotQuestionRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateHotQuestionRequest::getXSdkDate, CreateHotQuestionRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateHotQuestionRequest::getXProjectId, CreateHotQuestionRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateHotQuestionRequest::getXAppUserId, CreateHotQuestionRequest::setXAppUserId));
        builder.<CreateHotQuestionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateHotQuestionReq.class),
            f -> f.withMarshaller(CreateHotQuestionRequest::getBody, CreateHotQuestionRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateHotQuestionResponse::getXRequestId, CreateHotQuestionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteHotQuestionRequest, DeleteHotQuestionResponse> deleteHotQuestion =
        genForDeleteHotQuestion();

    private static HttpRequestDef<DeleteHotQuestionRequest, DeleteHotQuestionResponse> genForDeleteHotQuestion() {
        // basic
        HttpRequestDef.Builder<DeleteHotQuestionRequest, DeleteHotQuestionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteHotQuestionRequest.class, DeleteHotQuestionResponse.class)
                .withName("DeleteHotQuestion")
                .withUri("/v1/{project_id}/digital-human-chat/hot-question/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHotQuestionRequest::getAuthorization,
                DeleteHotQuestionRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHotQuestionRequest::getXSdkDate, DeleteHotQuestionRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHotQuestionRequest::getXProjectId, DeleteHotQuestionRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHotQuestionRequest::getXAppUserId, DeleteHotQuestionRequest::setXAppUserId));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteHotQuestionRequest::getBody, DeleteHotQuestionRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteHotQuestionResponse::getXRequestId, DeleteHotQuestionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListHotQuestionRequest, ListHotQuestionResponse> listHotQuestion =
        genForListHotQuestion();

    private static HttpRequestDef<ListHotQuestionRequest, ListHotQuestionResponse> genForListHotQuestion() {
        // basic
        HttpRequestDef.Builder<ListHotQuestionRequest, ListHotQuestionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHotQuestionRequest.class, ListHotQuestionResponse.class)
                .withName("ListHotQuestion")
                .withUri("/v1/{project_id}/digital-human-chat/hot-question")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHotQuestionRequest::getOffset, ListHotQuestionRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHotQuestionRequest::getLimit, ListHotQuestionRequest::setLimit));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHotQuestionRequest::getSortDir, ListHotQuestionRequest::setSortDir));
        builder.<String>withRequestField("robot_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHotQuestionRequest::getRobotId, ListHotQuestionRequest::setRobotId));
        builder.<ListHotQuestionRequest.LanguageEnum>withRequestField("language",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListHotQuestionRequest.LanguageEnum.class),
            f -> f.withMarshaller(ListHotQuestionRequest::getLanguage, ListHotQuestionRequest::setLanguage));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHotQuestionRequest::getAuthorization, ListHotQuestionRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHotQuestionRequest::getXSdkDate, ListHotQuestionRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHotQuestionRequest::getXProjectId, ListHotQuestionRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHotQuestionRequest::getXAppUserId, ListHotQuestionRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHotQuestionResponse::getXRequestId, ListHotQuestionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowHotQuestionRequest, ShowHotQuestionResponse> showHotQuestion =
        genForShowHotQuestion();

    private static HttpRequestDef<ShowHotQuestionRequest, ShowHotQuestionResponse> genForShowHotQuestion() {
        // basic
        HttpRequestDef.Builder<ShowHotQuestionRequest, ShowHotQuestionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHotQuestionRequest.class, ShowHotQuestionResponse.class)
                .withName("ShowHotQuestion")
                .withUri("/v1/{project_id}/digital-human-chat/hot-question/{hot_question_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("hot_question_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHotQuestionRequest::getHotQuestionId, ShowHotQuestionRequest::setHotQuestionId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHotQuestionRequest::getAuthorization, ShowHotQuestionRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHotQuestionRequest::getXSdkDate, ShowHotQuestionRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHotQuestionRequest::getXProjectId, ShowHotQuestionRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHotQuestionRequest::getXAppUserId, ShowHotQuestionRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowHotQuestionResponse::getXRequestId, ShowHotQuestionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateHotQuestionRequest, UpdateHotQuestionResponse> updateHotQuestion =
        genForUpdateHotQuestion();

    private static HttpRequestDef<UpdateHotQuestionRequest, UpdateHotQuestionResponse> genForUpdateHotQuestion() {
        // basic
        HttpRequestDef.Builder<UpdateHotQuestionRequest, UpdateHotQuestionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateHotQuestionRequest.class, UpdateHotQuestionResponse.class)
                .withName("UpdateHotQuestion")
                .withUri("/v1/{project_id}/digital-human-chat/hot-question/{hot_question_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("hot_question_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHotQuestionRequest::getHotQuestionId,
                UpdateHotQuestionRequest::setHotQuestionId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHotQuestionRequest::getAuthorization,
                UpdateHotQuestionRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHotQuestionRequest::getXSdkDate, UpdateHotQuestionRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHotQuestionRequest::getXProjectId, UpdateHotQuestionRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHotQuestionRequest::getXAppUserId, UpdateHotQuestionRequest::setXAppUserId));
        builder.<UpdateHotQuestionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateHotQuestionReq.class),
            f -> f.withMarshaller(UpdateHotQuestionRequest::getBody, UpdateHotQuestionRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateHotQuestionResponse::getXRequestId, UpdateHotQuestionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateHotWordsRequest, CreateHotWordsResponse> createHotWords =
        genForCreateHotWords();

    private static HttpRequestDef<CreateHotWordsRequest, CreateHotWordsResponse> genForCreateHotWords() {
        // basic
        HttpRequestDef.Builder<CreateHotWordsRequest, CreateHotWordsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateHotWordsRequest.class, CreateHotWordsResponse.class)
                .withName("CreateHotWords")
                .withUri("/v1/{project_id}/digital-human-chat/hot-words")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateHotWordsRequest::getAuthorization, CreateHotWordsRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateHotWordsRequest::getXSdkDate, CreateHotWordsRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateHotWordsRequest::getXProjectId, CreateHotWordsRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateHotWordsRequest::getXAppUserId, CreateHotWordsRequest::setXAppUserId));
        builder.<CreateHotWordsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateHotWordsReq.class),
            f -> f.withMarshaller(CreateHotWordsRequest::getBody, CreateHotWordsRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateHotWordsResponse::getXRequestId, CreateHotWordsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteHotWordsRequest, DeleteHotWordsResponse> deleteHotWords =
        genForDeleteHotWords();

    private static HttpRequestDef<DeleteHotWordsRequest, DeleteHotWordsResponse> genForDeleteHotWords() {
        // basic
        HttpRequestDef.Builder<DeleteHotWordsRequest, DeleteHotWordsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteHotWordsRequest.class, DeleteHotWordsResponse.class)
                .withName("DeleteHotWords")
                .withUri("/v1/{project_id}/digital-human-chat/hot-words/{hot_words_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("hot_words_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHotWordsRequest::getHotWordsId, DeleteHotWordsRequest::setHotWordsId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHotWordsRequest::getAuthorization, DeleteHotWordsRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHotWordsRequest::getXSdkDate, DeleteHotWordsRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHotWordsRequest::getXProjectId, DeleteHotWordsRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHotWordsRequest::getXAppUserId, DeleteHotWordsRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteHotWordsResponse::getXRequestId, DeleteHotWordsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListHotWordsRequest, ListHotWordsResponse> listHotWords = genForListHotWords();

    private static HttpRequestDef<ListHotWordsRequest, ListHotWordsResponse> genForListHotWords() {
        // basic
        HttpRequestDef.Builder<ListHotWordsRequest, ListHotWordsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHotWordsRequest.class, ListHotWordsResponse.class)
                .withName("ListHotWords")
                .withUri("/v1/{project_id}/digital-human-chat/hot-words")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHotWordsRequest::getOffset, ListHotWordsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHotWordsRequest::getLimit, ListHotWordsRequest::setLimit));
        builder.<String>withRequestField("robot_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHotWordsRequest::getRobotId, ListHotWordsRequest::setRobotId));
        builder.<Integer>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHotWordsRequest::getRegion, ListHotWordsRequest::setRegion));
        builder.<ListHotWordsRequest.LanguageEnum>withRequestField("language",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListHotWordsRequest.LanguageEnum.class),
            f -> f.withMarshaller(ListHotWordsRequest::getLanguage, ListHotWordsRequest::setLanguage));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHotWordsRequest::getAuthorization, ListHotWordsRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHotWordsRequest::getXSdkDate, ListHotWordsRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHotWordsRequest::getXProjectId, ListHotWordsRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHotWordsRequest::getXAppUserId, ListHotWordsRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHotWordsResponse::getXRequestId, ListHotWordsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowHotWordsRequest, ShowHotWordsResponse> showHotWords = genForShowHotWords();

    private static HttpRequestDef<ShowHotWordsRequest, ShowHotWordsResponse> genForShowHotWords() {
        // basic
        HttpRequestDef.Builder<ShowHotWordsRequest, ShowHotWordsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHotWordsRequest.class, ShowHotWordsResponse.class)
                .withName("ShowHotWords")
                .withUri("/v1/{project_id}/digital-human-chat/hot-words/{hot_words_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("hot_words_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHotWordsRequest::getHotWordsId, ShowHotWordsRequest::setHotWordsId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHotWordsRequest::getAuthorization, ShowHotWordsRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHotWordsRequest::getXSdkDate, ShowHotWordsRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHotWordsRequest::getXProjectId, ShowHotWordsRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHotWordsRequest::getXAppUserId, ShowHotWordsRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowHotWordsResponse::getXRequestId, ShowHotWordsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowHotWordsSwitchRequest, ShowHotWordsSwitchResponse> showHotWordsSwitch =
        genForShowHotWordsSwitch();

    private static HttpRequestDef<ShowHotWordsSwitchRequest, ShowHotWordsSwitchResponse> genForShowHotWordsSwitch() {
        // basic
        HttpRequestDef.Builder<ShowHotWordsSwitchRequest, ShowHotWordsSwitchResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHotWordsSwitchRequest.class, ShowHotWordsSwitchResponse.class)
                .withName("ShowHotWordsSwitch")
                .withUri("/v1/{project_id}/digital-human-chat/hot-words-switch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("robot_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHotWordsSwitchRequest::getRobotId, ShowHotWordsSwitchRequest::setRobotId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHotWordsSwitchRequest::getAuthorization,
                ShowHotWordsSwitchRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHotWordsSwitchRequest::getXSdkDate, ShowHotWordsSwitchRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHotWordsSwitchRequest::getXProjectId, ShowHotWordsSwitchRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHotWordsSwitchRequest::getXAppUserId, ShowHotWordsSwitchRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowHotWordsSwitchResponse::getXRequestId,
                ShowHotWordsSwitchResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateHotWordsRequest, UpdateHotWordsResponse> updateHotWords =
        genForUpdateHotWords();

    private static HttpRequestDef<UpdateHotWordsRequest, UpdateHotWordsResponse> genForUpdateHotWords() {
        // basic
        HttpRequestDef.Builder<UpdateHotWordsRequest, UpdateHotWordsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateHotWordsRequest.class, UpdateHotWordsResponse.class)
                .withName("UpdateHotWords")
                .withUri("/v1/{project_id}/digital-human-chat/hot-words/{hot_words_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("hot_words_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHotWordsRequest::getHotWordsId, UpdateHotWordsRequest::setHotWordsId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHotWordsRequest::getAuthorization, UpdateHotWordsRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHotWordsRequest::getXSdkDate, UpdateHotWordsRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHotWordsRequest::getXProjectId, UpdateHotWordsRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHotWordsRequest::getXAppUserId, UpdateHotWordsRequest::setXAppUserId));
        builder.<UpdateHotWordsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateHotWordsReq.class),
            f -> f.withMarshaller(UpdateHotWordsRequest::getBody, UpdateHotWordsRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateHotWordsResponse::getXRequestId, UpdateHotWordsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateHotWordsSwitchRequest, UpdateHotWordsSwitchResponse> updateHotWordsSwitch =
        genForUpdateHotWordsSwitch();

    private static HttpRequestDef<UpdateHotWordsSwitchRequest, UpdateHotWordsSwitchResponse> genForUpdateHotWordsSwitch() {
        // basic
        HttpRequestDef.Builder<UpdateHotWordsSwitchRequest, UpdateHotWordsSwitchResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateHotWordsSwitchRequest.class, UpdateHotWordsSwitchResponse.class)
            .withName("UpdateHotWordsSwitch")
            .withUri("/v1/{project_id}/digital-human-chat/hot-words-switch")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHotWordsSwitchRequest::getAuthorization,
                UpdateHotWordsSwitchRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHotWordsSwitchRequest::getXSdkDate, UpdateHotWordsSwitchRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHotWordsSwitchRequest::getXProjectId,
                UpdateHotWordsSwitchRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHotWordsSwitchRequest::getXAppUserId,
                UpdateHotWordsSwitchRequest::setXAppUserId));
        builder.<UpdateHotWordsSwitchReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateHotWordsSwitchReq.class),
            f -> f.withMarshaller(UpdateHotWordsSwitchRequest::getBody, UpdateHotWordsSwitchRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateHotWordsSwitchResponse::getXRequestId,
                UpdateHotWordsSwitchResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateInteractionRuleGroupRequest, CreateInteractionRuleGroupResponse> createInteractionRuleGroup =
        genForCreateInteractionRuleGroup();

    private static HttpRequestDef<CreateInteractionRuleGroupRequest, CreateInteractionRuleGroupResponse> genForCreateInteractionRuleGroup() {
        // basic
        HttpRequestDef.Builder<CreateInteractionRuleGroupRequest, CreateInteractionRuleGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateInteractionRuleGroupRequest.class,
                    CreateInteractionRuleGroupResponse.class)
                .withName("CreateInteractionRuleGroup")
                .withUri("/v1/{project_id}/smart-live-interaction-rule-groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInteractionRuleGroupRequest::getAuthorization,
                CreateInteractionRuleGroupRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInteractionRuleGroupRequest::getXSdkDate,
                CreateInteractionRuleGroupRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInteractionRuleGroupRequest::getXProjectId,
                CreateInteractionRuleGroupRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInteractionRuleGroupRequest::getXAppUserId,
                CreateInteractionRuleGroupRequest::setXAppUserId));
        builder.<InteractionRuleGroup>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InteractionRuleGroup.class),
            f -> f.withMarshaller(CreateInteractionRuleGroupRequest::getBody,
                CreateInteractionRuleGroupRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateInteractionRuleGroupResponse::getXRequestId,
                CreateInteractionRuleGroupResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteInteractionRuleGroupRequest, DeleteInteractionRuleGroupResponse> deleteInteractionRuleGroup =
        genForDeleteInteractionRuleGroup();

    private static HttpRequestDef<DeleteInteractionRuleGroupRequest, DeleteInteractionRuleGroupResponse> genForDeleteInteractionRuleGroup() {
        // basic
        HttpRequestDef.Builder<DeleteInteractionRuleGroupRequest, DeleteInteractionRuleGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteInteractionRuleGroupRequest.class,
                    DeleteInteractionRuleGroupResponse.class)
                .withName("DeleteInteractionRuleGroup")
                .withUri("/v1/{project_id}/smart-live-interaction-rule-groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInteractionRuleGroupRequest::getGroupId,
                DeleteInteractionRuleGroupRequest::setGroupId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInteractionRuleGroupRequest::getAuthorization,
                DeleteInteractionRuleGroupRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInteractionRuleGroupRequest::getXSdkDate,
                DeleteInteractionRuleGroupRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInteractionRuleGroupRequest::getXProjectId,
                DeleteInteractionRuleGroupRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInteractionRuleGroupRequest::getXAppUserId,
                DeleteInteractionRuleGroupRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteInteractionRuleGroupResponse::getXRequestId,
                DeleteInteractionRuleGroupResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListInteractionRuleGroupsRequest, ListInteractionRuleGroupsResponse> listInteractionRuleGroups =
        genForListInteractionRuleGroups();

    private static HttpRequestDef<ListInteractionRuleGroupsRequest, ListInteractionRuleGroupsResponse> genForListInteractionRuleGroups() {
        // basic
        HttpRequestDef.Builder<ListInteractionRuleGroupsRequest, ListInteractionRuleGroupsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListInteractionRuleGroupsRequest.class,
                    ListInteractionRuleGroupsResponse.class)
                .withName("ListInteractionRuleGroups")
                .withUri("/v1/{project_id}/smart-live-interaction-rule-groups")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInteractionRuleGroupsRequest::getOffset,
                ListInteractionRuleGroupsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInteractionRuleGroupsRequest::getLimit,
                ListInteractionRuleGroupsRequest::setLimit));
        builder.<String>withRequestField("create_since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInteractionRuleGroupsRequest::getCreateSince,
                ListInteractionRuleGroupsRequest::setCreateSince));
        builder.<String>withRequestField("create_until",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInteractionRuleGroupsRequest::getCreateUntil,
                ListInteractionRuleGroupsRequest::setCreateUntil));
        builder.<String>withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInteractionRuleGroupsRequest::getGroupName,
                ListInteractionRuleGroupsRequest::setGroupName));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInteractionRuleGroupsRequest::getAuthorization,
                ListInteractionRuleGroupsRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInteractionRuleGroupsRequest::getXSdkDate,
                ListInteractionRuleGroupsRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInteractionRuleGroupsRequest::getXProjectId,
                ListInteractionRuleGroupsRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInteractionRuleGroupsRequest::getXAppUserId,
                ListInteractionRuleGroupsRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListInteractionRuleGroupsResponse::getXRequestId,
                ListInteractionRuleGroupsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateInteractionRuleGroupRequest, UpdateInteractionRuleGroupResponse> updateInteractionRuleGroup =
        genForUpdateInteractionRuleGroup();

    private static HttpRequestDef<UpdateInteractionRuleGroupRequest, UpdateInteractionRuleGroupResponse> genForUpdateInteractionRuleGroup() {
        // basic
        HttpRequestDef.Builder<UpdateInteractionRuleGroupRequest, UpdateInteractionRuleGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateInteractionRuleGroupRequest.class,
                    UpdateInteractionRuleGroupResponse.class)
                .withName("UpdateInteractionRuleGroup")
                .withUri("/v1/{project_id}/smart-live-interaction-rule-groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInteractionRuleGroupRequest::getGroupId,
                UpdateInteractionRuleGroupRequest::setGroupId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInteractionRuleGroupRequest::getAuthorization,
                UpdateInteractionRuleGroupRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInteractionRuleGroupRequest::getXSdkDate,
                UpdateInteractionRuleGroupRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInteractionRuleGroupRequest::getXProjectId,
                UpdateInteractionRuleGroupRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInteractionRuleGroupRequest::getXAppUserId,
                UpdateInteractionRuleGroupRequest::setXAppUserId));
        builder.<InteractionRuleGroup>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InteractionRuleGroup.class),
            f -> f.withMarshaller(UpdateInteractionRuleGroupRequest::getBody,
                UpdateInteractionRuleGroupRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateInteractionRuleGroupResponse::getXRequestId,
                UpdateInteractionRuleGroupResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateIntentAndQuestionRequest, CreateIntentAndQuestionResponse> createIntentAndQuestion =
        genForCreateIntentAndQuestion();

    private static HttpRequestDef<CreateIntentAndQuestionRequest, CreateIntentAndQuestionResponse> genForCreateIntentAndQuestion() {
        // basic
        HttpRequestDef.Builder<CreateIntentAndQuestionRequest, CreateIntentAndQuestionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateIntentAndQuestionRequest.class, CreateIntentAndQuestionResponse.class)
            .withName("CreateIntentAndQuestion")
            .withUri("/v1/{project_id}/digital-human-chat/knowledge/intent-question")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateIntentAndQuestionRequest::getAuthorization,
                CreateIntentAndQuestionRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateIntentAndQuestionRequest::getXSdkDate,
                CreateIntentAndQuestionRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateIntentAndQuestionRequest::getXProjectId,
                CreateIntentAndQuestionRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateIntentAndQuestionRequest::getXAppUserId,
                CreateIntentAndQuestionRequest::setXAppUserId));
        builder.<CreateIntentAndQuestionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateIntentAndQuestionReq.class),
            f -> f.withMarshaller(CreateIntentAndQuestionRequest::getBody, CreateIntentAndQuestionRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateIntentAndQuestionResponse::getXRequestId,
                CreateIntentAndQuestionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateKnowledgeIntentRequest, CreateKnowledgeIntentResponse> createKnowledgeIntent =
        genForCreateKnowledgeIntent();

    private static HttpRequestDef<CreateKnowledgeIntentRequest, CreateKnowledgeIntentResponse> genForCreateKnowledgeIntent() {
        // basic
        HttpRequestDef.Builder<CreateKnowledgeIntentRequest, CreateKnowledgeIntentResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateKnowledgeIntentRequest.class, CreateKnowledgeIntentResponse.class)
            .withName("CreateKnowledgeIntent")
            .withUri("/v1/{project_id}/digital-human-chat/knowledge/intent")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateKnowledgeIntentRequest::getAuthorization,
                CreateKnowledgeIntentRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateKnowledgeIntentRequest::getXSdkDate,
                CreateKnowledgeIntentRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateKnowledgeIntentRequest::getXProjectId,
                CreateKnowledgeIntentRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateKnowledgeIntentRequest::getXAppUserId,
                CreateKnowledgeIntentRequest::setXAppUserId));
        builder.<CreateKnowledgeIntentReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateKnowledgeIntentReq.class),
            f -> f.withMarshaller(CreateKnowledgeIntentRequest::getBody, CreateKnowledgeIntentRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateKnowledgeIntentResponse::getXRequestId,
                CreateKnowledgeIntentResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteKnowledgeIntentRequest, DeleteKnowledgeIntentResponse> deleteKnowledgeIntent =
        genForDeleteKnowledgeIntent();

    private static HttpRequestDef<DeleteKnowledgeIntentRequest, DeleteKnowledgeIntentResponse> genForDeleteKnowledgeIntent() {
        // basic
        HttpRequestDef.Builder<DeleteKnowledgeIntentRequest, DeleteKnowledgeIntentResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DeleteKnowledgeIntentRequest.class, DeleteKnowledgeIntentResponse.class)
            .withName("DeleteKnowledgeIntent")
            .withUri("/v1/{project_id}/digital-human-chat/knowledge/intent/delete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteKnowledgeIntentRequest::getAuthorization,
                DeleteKnowledgeIntentRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteKnowledgeIntentRequest::getXSdkDate,
                DeleteKnowledgeIntentRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteKnowledgeIntentRequest::getXProjectId,
                DeleteKnowledgeIntentRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteKnowledgeIntentRequest::getXAppUserId,
                DeleteKnowledgeIntentRequest::setXAppUserId));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteKnowledgeIntentRequest::getBody, DeleteKnowledgeIntentRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteKnowledgeIntentResponse::getXRequestId,
                DeleteKnowledgeIntentResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListKnowledgeIntentRequest, ListKnowledgeIntentResponse> listKnowledgeIntent =
        genForListKnowledgeIntent();

    private static HttpRequestDef<ListKnowledgeIntentRequest, ListKnowledgeIntentResponse> genForListKnowledgeIntent() {
        // basic
        HttpRequestDef.Builder<ListKnowledgeIntentRequest, ListKnowledgeIntentResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListKnowledgeIntentRequest.class, ListKnowledgeIntentResponse.class)
                .withName("ListKnowledgeIntent")
                .withUri("/v1/{project_id}/digital-human-chat/knowledge/intent")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListKnowledgeIntentRequest::getOffset, ListKnowledgeIntentRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListKnowledgeIntentRequest::getLimit, ListKnowledgeIntentRequest::setLimit));
        builder.<String>withRequestField("skill_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKnowledgeIntentRequest::getSkillId, ListKnowledgeIntentRequest::setSkillId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKnowledgeIntentRequest::getAuthorization,
                ListKnowledgeIntentRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKnowledgeIntentRequest::getXSdkDate, ListKnowledgeIntentRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKnowledgeIntentRequest::getXProjectId,
                ListKnowledgeIntentRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKnowledgeIntentRequest::getXAppUserId,
                ListKnowledgeIntentRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListKnowledgeIntentResponse::getXRequestId,
                ListKnowledgeIntentResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowKnowledgeIntentRequest, ShowKnowledgeIntentResponse> showKnowledgeIntent =
        genForShowKnowledgeIntent();

    private static HttpRequestDef<ShowKnowledgeIntentRequest, ShowKnowledgeIntentResponse> genForShowKnowledgeIntent() {
        // basic
        HttpRequestDef.Builder<ShowKnowledgeIntentRequest, ShowKnowledgeIntentResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowKnowledgeIntentRequest.class, ShowKnowledgeIntentResponse.class)
                .withName("ShowKnowledgeIntent")
                .withUri("/v1/{project_id}/digital-human-chat/knowledge/intent/{intent_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("intent_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKnowledgeIntentRequest::getIntentId, ShowKnowledgeIntentRequest::setIntentId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKnowledgeIntentRequest::getAuthorization,
                ShowKnowledgeIntentRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKnowledgeIntentRequest::getXSdkDate, ShowKnowledgeIntentRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKnowledgeIntentRequest::getXProjectId,
                ShowKnowledgeIntentRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKnowledgeIntentRequest::getXAppUserId,
                ShowKnowledgeIntentRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowKnowledgeIntentResponse::getXRequestId,
                ShowKnowledgeIntentResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateKnowledgeIntentRequest, UpdateKnowledgeIntentResponse> updateKnowledgeIntent =
        genForUpdateKnowledgeIntent();

    private static HttpRequestDef<UpdateKnowledgeIntentRequest, UpdateKnowledgeIntentResponse> genForUpdateKnowledgeIntent() {
        // basic
        HttpRequestDef.Builder<UpdateKnowledgeIntentRequest, UpdateKnowledgeIntentResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateKnowledgeIntentRequest.class, UpdateKnowledgeIntentResponse.class)
            .withName("UpdateKnowledgeIntent")
            .withUri("/v1/{project_id}/digital-human-chat/knowledge/intent/{intent_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("intent_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateKnowledgeIntentRequest::getIntentId,
                UpdateKnowledgeIntentRequest::setIntentId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateKnowledgeIntentRequest::getAuthorization,
                UpdateKnowledgeIntentRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateKnowledgeIntentRequest::getXSdkDate,
                UpdateKnowledgeIntentRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateKnowledgeIntentRequest::getXProjectId,
                UpdateKnowledgeIntentRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateKnowledgeIntentRequest::getXAppUserId,
                UpdateKnowledgeIntentRequest::setXAppUserId));
        builder.<UpdateKnowledgeIntentReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateKnowledgeIntentReq.class),
            f -> f.withMarshaller(UpdateKnowledgeIntentRequest::getBody, UpdateKnowledgeIntentRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateKnowledgeIntentResponse::getXRequestId,
                UpdateKnowledgeIntentResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateBatchKnowledgeQuestionRequest, CreateBatchKnowledgeQuestionResponse> createBatchKnowledgeQuestion =
        genForCreateBatchKnowledgeQuestion();

    private static HttpRequestDef<CreateBatchKnowledgeQuestionRequest, CreateBatchKnowledgeQuestionResponse> genForCreateBatchKnowledgeQuestion() {
        // basic
        HttpRequestDef.Builder<CreateBatchKnowledgeQuestionRequest, CreateBatchKnowledgeQuestionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateBatchKnowledgeQuestionRequest.class,
                    CreateBatchKnowledgeQuestionResponse.class)
                .withName("CreateBatchKnowledgeQuestion")
                .withUri("/v1/{project_id}/digital-human-chat/knowledge/question-batch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBatchKnowledgeQuestionRequest::getAuthorization,
                CreateBatchKnowledgeQuestionRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBatchKnowledgeQuestionRequest::getXSdkDate,
                CreateBatchKnowledgeQuestionRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBatchKnowledgeQuestionRequest::getXProjectId,
                CreateBatchKnowledgeQuestionRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBatchKnowledgeQuestionRequest::getXAppUserId,
                CreateBatchKnowledgeQuestionRequest::setXAppUserId));
        builder.<CreateBatchKnowledgeQuestionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateBatchKnowledgeQuestionReq.class),
            f -> f.withMarshaller(CreateBatchKnowledgeQuestionRequest::getBody,
                CreateBatchKnowledgeQuestionRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateBatchKnowledgeQuestionResponse::getXRequestId,
                CreateBatchKnowledgeQuestionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateKnowledgeQuestionRequest, CreateKnowledgeQuestionResponse> createKnowledgeQuestion =
        genForCreateKnowledgeQuestion();

    private static HttpRequestDef<CreateKnowledgeQuestionRequest, CreateKnowledgeQuestionResponse> genForCreateKnowledgeQuestion() {
        // basic
        HttpRequestDef.Builder<CreateKnowledgeQuestionRequest, CreateKnowledgeQuestionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateKnowledgeQuestionRequest.class, CreateKnowledgeQuestionResponse.class)
            .withName("CreateKnowledgeQuestion")
            .withUri("/v1/{project_id}/digital-human-chat/knowledge/question")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateKnowledgeQuestionRequest::getAuthorization,
                CreateKnowledgeQuestionRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateKnowledgeQuestionRequest::getXSdkDate,
                CreateKnowledgeQuestionRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateKnowledgeQuestionRequest::getXProjectId,
                CreateKnowledgeQuestionRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateKnowledgeQuestionRequest::getXAppUserId,
                CreateKnowledgeQuestionRequest::setXAppUserId));
        builder.<CreateKnowledgeQuestionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateKnowledgeQuestionReq.class),
            f -> f.withMarshaller(CreateKnowledgeQuestionRequest::getBody, CreateKnowledgeQuestionRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateKnowledgeQuestionResponse::getXRequestId,
                CreateKnowledgeQuestionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteKnowledgeQuestionRequest, DeleteKnowledgeQuestionResponse> deleteKnowledgeQuestion =
        genForDeleteKnowledgeQuestion();

    private static HttpRequestDef<DeleteKnowledgeQuestionRequest, DeleteKnowledgeQuestionResponse> genForDeleteKnowledgeQuestion() {
        // basic
        HttpRequestDef.Builder<DeleteKnowledgeQuestionRequest, DeleteKnowledgeQuestionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DeleteKnowledgeQuestionRequest.class, DeleteKnowledgeQuestionResponse.class)
            .withName("DeleteKnowledgeQuestion")
            .withUri("/v1/{project_id}/digital-human-chat/knowledge/question/delete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteKnowledgeQuestionRequest::getAuthorization,
                DeleteKnowledgeQuestionRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteKnowledgeQuestionRequest::getXSdkDate,
                DeleteKnowledgeQuestionRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteKnowledgeQuestionRequest::getXProjectId,
                DeleteKnowledgeQuestionRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteKnowledgeQuestionRequest::getXAppUserId,
                DeleteKnowledgeQuestionRequest::setXAppUserId));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteKnowledgeQuestionRequest::getBody, DeleteKnowledgeQuestionRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteKnowledgeQuestionResponse::getXRequestId,
                DeleteKnowledgeQuestionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListKnowledgeQuestionRequest, ListKnowledgeQuestionResponse> listKnowledgeQuestion =
        genForListKnowledgeQuestion();

    private static HttpRequestDef<ListKnowledgeQuestionRequest, ListKnowledgeQuestionResponse> genForListKnowledgeQuestion() {
        // basic
        HttpRequestDef.Builder<ListKnowledgeQuestionRequest, ListKnowledgeQuestionResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListKnowledgeQuestionRequest.class, ListKnowledgeQuestionResponse.class)
            .withName("ListKnowledgeQuestion")
            .withUri("/v1/{project_id}/digital-human-chat/knowledge/question")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListKnowledgeQuestionRequest::getOffset, ListKnowledgeQuestionRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListKnowledgeQuestionRequest::getLimit, ListKnowledgeQuestionRequest::setLimit));
        builder.<String>withRequestField("intent_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKnowledgeQuestionRequest::getIntentId,
                ListKnowledgeQuestionRequest::setIntentId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKnowledgeQuestionRequest::getAuthorization,
                ListKnowledgeQuestionRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKnowledgeQuestionRequest::getXSdkDate,
                ListKnowledgeQuestionRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKnowledgeQuestionRequest::getXProjectId,
                ListKnowledgeQuestionRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKnowledgeQuestionRequest::getXAppUserId,
                ListKnowledgeQuestionRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListKnowledgeQuestionResponse::getXRequestId,
                ListKnowledgeQuestionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowKnowledgeQuestionRequest, ShowKnowledgeQuestionResponse> showKnowledgeQuestion =
        genForShowKnowledgeQuestion();

    private static HttpRequestDef<ShowKnowledgeQuestionRequest, ShowKnowledgeQuestionResponse> genForShowKnowledgeQuestion() {
        // basic
        HttpRequestDef.Builder<ShowKnowledgeQuestionRequest, ShowKnowledgeQuestionResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowKnowledgeQuestionRequest.class, ShowKnowledgeQuestionResponse.class)
            .withName("ShowKnowledgeQuestion")
            .withUri("/v1/{project_id}/digital-human-chat/knowledge/question/{question_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("question_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKnowledgeQuestionRequest::getQuestionId,
                ShowKnowledgeQuestionRequest::setQuestionId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKnowledgeQuestionRequest::getAuthorization,
                ShowKnowledgeQuestionRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKnowledgeQuestionRequest::getXSdkDate,
                ShowKnowledgeQuestionRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKnowledgeQuestionRequest::getXProjectId,
                ShowKnowledgeQuestionRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKnowledgeQuestionRequest::getXAppUserId,
                ShowKnowledgeQuestionRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowKnowledgeQuestionResponse::getXRequestId,
                ShowKnowledgeQuestionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateBatchKnowledgeQuestionRequest, UpdateBatchKnowledgeQuestionResponse> updateBatchKnowledgeQuestion =
        genForUpdateBatchKnowledgeQuestion();

    private static HttpRequestDef<UpdateBatchKnowledgeQuestionRequest, UpdateBatchKnowledgeQuestionResponse> genForUpdateBatchKnowledgeQuestion() {
        // basic
        HttpRequestDef.Builder<UpdateBatchKnowledgeQuestionRequest, UpdateBatchKnowledgeQuestionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateBatchKnowledgeQuestionRequest.class,
                    UpdateBatchKnowledgeQuestionResponse.class)
                .withName("UpdateBatchKnowledgeQuestion")
                .withUri("/v1/{project_id}/digital-human-chat/knowledge/question-batch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBatchKnowledgeQuestionRequest::getAuthorization,
                UpdateBatchKnowledgeQuestionRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBatchKnowledgeQuestionRequest::getXSdkDate,
                UpdateBatchKnowledgeQuestionRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBatchKnowledgeQuestionRequest::getXProjectId,
                UpdateBatchKnowledgeQuestionRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBatchKnowledgeQuestionRequest::getXAppUserId,
                UpdateBatchKnowledgeQuestionRequest::setXAppUserId));
        builder.<UpdateBatchKnowledgeQuestionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateBatchKnowledgeQuestionReq.class),
            f -> f.withMarshaller(UpdateBatchKnowledgeQuestionRequest::getBody,
                UpdateBatchKnowledgeQuestionRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateBatchKnowledgeQuestionResponse::getXRequestId,
                UpdateBatchKnowledgeQuestionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateKnowledgeQuestionRequest, UpdateKnowledgeQuestionResponse> updateKnowledgeQuestion =
        genForUpdateKnowledgeQuestion();

    private static HttpRequestDef<UpdateKnowledgeQuestionRequest, UpdateKnowledgeQuestionResponse> genForUpdateKnowledgeQuestion() {
        // basic
        HttpRequestDef.Builder<UpdateKnowledgeQuestionRequest, UpdateKnowledgeQuestionResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateKnowledgeQuestionRequest.class, UpdateKnowledgeQuestionResponse.class)
            .withName("UpdateKnowledgeQuestion")
            .withUri("/v1/{project_id}/digital-human-chat/knowledge/question/{question_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("question_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateKnowledgeQuestionRequest::getQuestionId,
                UpdateKnowledgeQuestionRequest::setQuestionId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateKnowledgeQuestionRequest::getAuthorization,
                UpdateKnowledgeQuestionRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateKnowledgeQuestionRequest::getXSdkDate,
                UpdateKnowledgeQuestionRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateKnowledgeQuestionRequest::getXProjectId,
                UpdateKnowledgeQuestionRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateKnowledgeQuestionRequest::getXAppUserId,
                UpdateKnowledgeQuestionRequest::setXAppUserId));
        builder.<UpdateKnowledgeQuestionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateKnowledgeQuestionReq.class),
            f -> f.withMarshaller(UpdateKnowledgeQuestionRequest::getBody, UpdateKnowledgeQuestionRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateKnowledgeQuestionResponse::getXRequestId,
                UpdateKnowledgeQuestionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateKnowledgeSkillRequest, CreateKnowledgeSkillResponse> createKnowledgeSkill =
        genForCreateKnowledgeSkill();

    private static HttpRequestDef<CreateKnowledgeSkillRequest, CreateKnowledgeSkillResponse> genForCreateKnowledgeSkill() {
        // basic
        HttpRequestDef.Builder<CreateKnowledgeSkillRequest, CreateKnowledgeSkillResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateKnowledgeSkillRequest.class, CreateKnowledgeSkillResponse.class)
            .withName("CreateKnowledgeSkill")
            .withUri("/v1/{project_id}/digital-human-chat/knowledge/skill")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateKnowledgeSkillRequest::getAuthorization,
                CreateKnowledgeSkillRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateKnowledgeSkillRequest::getXSdkDate, CreateKnowledgeSkillRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateKnowledgeSkillRequest::getXProjectId,
                CreateKnowledgeSkillRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateKnowledgeSkillRequest::getXAppUserId,
                CreateKnowledgeSkillRequest::setXAppUserId));
        builder.<CreateKnowledgeSkillReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateKnowledgeSkillReq.class),
            f -> f.withMarshaller(CreateKnowledgeSkillRequest::getBody, CreateKnowledgeSkillRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateKnowledgeSkillResponse::getXRequestId,
                CreateKnowledgeSkillResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteKnowledgeSkillRequest, DeleteKnowledgeSkillResponse> deleteKnowledgeSkill =
        genForDeleteKnowledgeSkill();

    private static HttpRequestDef<DeleteKnowledgeSkillRequest, DeleteKnowledgeSkillResponse> genForDeleteKnowledgeSkill() {
        // basic
        HttpRequestDef.Builder<DeleteKnowledgeSkillRequest, DeleteKnowledgeSkillResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DeleteKnowledgeSkillRequest.class, DeleteKnowledgeSkillResponse.class)
            .withName("DeleteKnowledgeSkill")
            .withUri("/v1/{project_id}/digital-human-chat/knowledge/skill/delete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteKnowledgeSkillRequest::getAuthorization,
                DeleteKnowledgeSkillRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteKnowledgeSkillRequest::getXSdkDate, DeleteKnowledgeSkillRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteKnowledgeSkillRequest::getXProjectId,
                DeleteKnowledgeSkillRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteKnowledgeSkillRequest::getXAppUserId,
                DeleteKnowledgeSkillRequest::setXAppUserId));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteKnowledgeSkillRequest::getBody, DeleteKnowledgeSkillRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteKnowledgeSkillResponse::getXRequestId,
                DeleteKnowledgeSkillResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ExportKnowledgeSkillRequest, ExportKnowledgeSkillResponse> exportKnowledgeSkill =
        genForExportKnowledgeSkill();

    private static HttpRequestDef<ExportKnowledgeSkillRequest, ExportKnowledgeSkillResponse> genForExportKnowledgeSkill() {
        // basic
        HttpRequestDef.Builder<ExportKnowledgeSkillRequest, ExportKnowledgeSkillResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ExportKnowledgeSkillRequest.class, ExportKnowledgeSkillResponse.class)
            .withName("ExportKnowledgeSkill")
            .withUri("/v1/{project_id}/digital-human-chat/knowledge/skill/{skill_id}/export")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("skill_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportKnowledgeSkillRequest::getSkillId, ExportKnowledgeSkillRequest::setSkillId));
        builder.<Integer>withRequestField("export_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportKnowledgeSkillRequest::getExportType,
                ExportKnowledgeSkillRequest::setExportType));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportKnowledgeSkillRequest::getAuthorization,
                ExportKnowledgeSkillRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportKnowledgeSkillRequest::getXSdkDate, ExportKnowledgeSkillRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportKnowledgeSkillRequest::getXProjectId,
                ExportKnowledgeSkillRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportKnowledgeSkillRequest::getXAppUserId,
                ExportKnowledgeSkillRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ExportKnowledgeSkillResponse::getXRequestId,
                ExportKnowledgeSkillResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListKnowledgeSkillRequest, ListKnowledgeSkillResponse> listKnowledgeSkill =
        genForListKnowledgeSkill();

    private static HttpRequestDef<ListKnowledgeSkillRequest, ListKnowledgeSkillResponse> genForListKnowledgeSkill() {
        // basic
        HttpRequestDef.Builder<ListKnowledgeSkillRequest, ListKnowledgeSkillResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListKnowledgeSkillRequest.class, ListKnowledgeSkillResponse.class)
                .withName("ListKnowledgeSkill")
                .withUri("/v1/{project_id}/digital-human-chat/knowledge/skill")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListKnowledgeSkillRequest::getOffset, ListKnowledgeSkillRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListKnowledgeSkillRequest::getLimit, ListKnowledgeSkillRequest::setLimit));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKnowledgeSkillRequest::getAuthorization,
                ListKnowledgeSkillRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKnowledgeSkillRequest::getXSdkDate, ListKnowledgeSkillRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKnowledgeSkillRequest::getXProjectId, ListKnowledgeSkillRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKnowledgeSkillRequest::getXAppUserId, ListKnowledgeSkillRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListKnowledgeSkillResponse::getXRequestId,
                ListKnowledgeSkillResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowKnowledgeSkillRequest, ShowKnowledgeSkillResponse> showKnowledgeSkill =
        genForShowKnowledgeSkill();

    private static HttpRequestDef<ShowKnowledgeSkillRequest, ShowKnowledgeSkillResponse> genForShowKnowledgeSkill() {
        // basic
        HttpRequestDef.Builder<ShowKnowledgeSkillRequest, ShowKnowledgeSkillResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowKnowledgeSkillRequest.class, ShowKnowledgeSkillResponse.class)
                .withName("ShowKnowledgeSkill")
                .withUri("/v1/{project_id}/digital-human-chat/knowledge/skill/{skill_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("skill_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKnowledgeSkillRequest::getSkillId, ShowKnowledgeSkillRequest::setSkillId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKnowledgeSkillRequest::getAuthorization,
                ShowKnowledgeSkillRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKnowledgeSkillRequest::getXSdkDate, ShowKnowledgeSkillRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKnowledgeSkillRequest::getXProjectId, ShowKnowledgeSkillRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKnowledgeSkillRequest::getXAppUserId, ShowKnowledgeSkillRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowKnowledgeSkillResponse::getXRequestId,
                ShowKnowledgeSkillResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateKnowledgeSkillRequest, UpdateKnowledgeSkillResponse> updateKnowledgeSkill =
        genForUpdateKnowledgeSkill();

    private static HttpRequestDef<UpdateKnowledgeSkillRequest, UpdateKnowledgeSkillResponse> genForUpdateKnowledgeSkill() {
        // basic
        HttpRequestDef.Builder<UpdateKnowledgeSkillRequest, UpdateKnowledgeSkillResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateKnowledgeSkillRequest.class, UpdateKnowledgeSkillResponse.class)
            .withName("UpdateKnowledgeSkill")
            .withUri("/v1/{project_id}/digital-human-chat/knowledge/skill/{skill_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("skill_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateKnowledgeSkillRequest::getSkillId, UpdateKnowledgeSkillRequest::setSkillId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateKnowledgeSkillRequest::getAuthorization,
                UpdateKnowledgeSkillRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateKnowledgeSkillRequest::getXSdkDate, UpdateKnowledgeSkillRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateKnowledgeSkillRequest::getXProjectId,
                UpdateKnowledgeSkillRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateKnowledgeSkillRequest::getXAppUserId,
                UpdateKnowledgeSkillRequest::setXAppUserId));
        builder.<UpdateKnowledgeSkillReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateKnowledgeSkillReq.class),
            f -> f.withMarshaller(UpdateKnowledgeSkillRequest::getBody, UpdateKnowledgeSkillRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateKnowledgeSkillResponse::getXRequestId,
                UpdateKnowledgeSkillResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateLivePlatformRequest, CreateLivePlatformResponse> createLivePlatform =
        genForCreateLivePlatform();

    private static HttpRequestDef<CreateLivePlatformRequest, CreateLivePlatformResponse> genForCreateLivePlatform() {
        // basic
        HttpRequestDef.Builder<CreateLivePlatformRequest, CreateLivePlatformResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLivePlatformRequest.class, CreateLivePlatformResponse.class)
                .withName("CreateLivePlatform")
                .withUri("/v1/{project_id}/live-platforms/platforms")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLivePlatformRequest::getAuthorization,
                CreateLivePlatformRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLivePlatformRequest::getXSdkDate, CreateLivePlatformRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLivePlatformRequest::getXProjectId, CreateLivePlatformRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLivePlatformRequest::getXAppUserId, CreateLivePlatformRequest::setXAppUserId));
        builder.<CreateLivePlatformReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateLivePlatformReq.class),
            f -> f.withMarshaller(CreateLivePlatformRequest::getBody, CreateLivePlatformRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateLivePlatformResponse::getXRequestId,
                CreateLivePlatformResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteLivePlatformRequest, DeleteLivePlatformResponse> deleteLivePlatform =
        genForDeleteLivePlatform();

    private static HttpRequestDef<DeleteLivePlatformRequest, DeleteLivePlatformResponse> genForDeleteLivePlatform() {
        // basic
        HttpRequestDef.Builder<DeleteLivePlatformRequest, DeleteLivePlatformResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteLivePlatformRequest.class, DeleteLivePlatformResponse.class)
                .withName("DeleteLivePlatform")
                .withUri("/v1/{project_id}/live-platforms/platforms/{platform_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("platform_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLivePlatformRequest::getPlatformId, DeleteLivePlatformRequest::setPlatformId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLivePlatformRequest::getAuthorization,
                DeleteLivePlatformRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLivePlatformRequest::getXSdkDate, DeleteLivePlatformRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLivePlatformRequest::getXProjectId, DeleteLivePlatformRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLivePlatformRequest::getXAppUserId, DeleteLivePlatformRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteLivePlatformResponse::getXRequestId,
                DeleteLivePlatformResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListLivePlatformProductsRequest, ListLivePlatformProductsResponse> listLivePlatformProducts =
        genForListLivePlatformProducts();

    private static HttpRequestDef<ListLivePlatformProductsRequest, ListLivePlatformProductsResponse> genForListLivePlatformProducts() {
        // basic
        HttpRequestDef.Builder<ListLivePlatformProductsRequest, ListLivePlatformProductsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListLivePlatformProductsRequest.class, ListLivePlatformProductsResponse.class)
                .withName("ListLivePlatformProducts")
                .withUri("/v1/{project_id}/live-platforms/products")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLivePlatformProductsRequest::getOffset,
                ListLivePlatformProductsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLivePlatformProductsRequest::getLimit,
                ListLivePlatformProductsRequest::setLimit));
        builder.<String>withRequestField("platform_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLivePlatformProductsRequest::getPlatformId,
                ListLivePlatformProductsRequest::setPlatformId));
        builder.<String>withRequestField("live_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLivePlatformProductsRequest::getLiveId,
                ListLivePlatformProductsRequest::setLiveId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLivePlatformProductsRequest::getAuthorization,
                ListLivePlatformProductsRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLivePlatformProductsRequest::getXSdkDate,
                ListLivePlatformProductsRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLivePlatformProductsRequest::getXProjectId,
                ListLivePlatformProductsRequest::setXProjectId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLivePlatformProductsResponse::getXRequestId,
                ListLivePlatformProductsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListLivePlatformsRequest, ListLivePlatformsResponse> listLivePlatforms =
        genForListLivePlatforms();

    private static HttpRequestDef<ListLivePlatformsRequest, ListLivePlatformsResponse> genForListLivePlatforms() {
        // basic
        HttpRequestDef.Builder<ListLivePlatformsRequest, ListLivePlatformsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLivePlatformsRequest.class, ListLivePlatformsResponse.class)
                .withName("ListLivePlatforms")
                .withUri("/v1/{project_id}/live-platforms/platforms")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLivePlatformsRequest::getOffset, ListLivePlatformsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLivePlatformsRequest::getLimit, ListLivePlatformsRequest::setLimit));
        builder.<String>withRequestField("access_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLivePlatformsRequest::getAccessType, ListLivePlatformsRequest::setAccessType));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLivePlatformsRequest::getAuthorization,
                ListLivePlatformsRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLivePlatformsRequest::getXSdkDate, ListLivePlatformsRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLivePlatformsRequest::getXProjectId, ListLivePlatformsRequest::setXProjectId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLivePlatformsResponse::getXRequestId, ListLivePlatformsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowLivePlatformRequest, ShowLivePlatformResponse> showLivePlatform =
        genForShowLivePlatform();

    private static HttpRequestDef<ShowLivePlatformRequest, ShowLivePlatformResponse> genForShowLivePlatform() {
        // basic
        HttpRequestDef.Builder<ShowLivePlatformRequest, ShowLivePlatformResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLivePlatformRequest.class, ShowLivePlatformResponse.class)
                .withName("ShowLivePlatform")
                .withUri("/v1/{project_id}/live-platforms/platforms/{platform_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("platform_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLivePlatformRequest::getPlatformId, ShowLivePlatformRequest::setPlatformId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLivePlatformRequest::getAuthorization,
                ShowLivePlatformRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLivePlatformRequest::getXSdkDate, ShowLivePlatformRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLivePlatformRequest::getXProjectId, ShowLivePlatformRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLivePlatformRequest::getXAppUserId, ShowLivePlatformRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowLivePlatformResponse::getXRequestId, ShowLivePlatformResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateLivePlatformRequest, UpdateLivePlatformResponse> updateLivePlatform =
        genForUpdateLivePlatform();

    private static HttpRequestDef<UpdateLivePlatformRequest, UpdateLivePlatformResponse> genForUpdateLivePlatform() {
        // basic
        HttpRequestDef.Builder<UpdateLivePlatformRequest, UpdateLivePlatformResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateLivePlatformRequest.class, UpdateLivePlatformResponse.class)
                .withName("UpdateLivePlatform")
                .withUri("/v1/{project_id}/live-platforms/platforms/{platform_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("platform_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLivePlatformRequest::getPlatformId, UpdateLivePlatformRequest::setPlatformId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLivePlatformRequest::getAuthorization,
                UpdateLivePlatformRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLivePlatformRequest::getXSdkDate, UpdateLivePlatformRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLivePlatformRequest::getXProjectId, UpdateLivePlatformRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLivePlatformRequest::getXAppUserId, UpdateLivePlatformRequest::setXAppUserId));
        builder.<UpdateLivePlatformReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateLivePlatformReq.class),
            f -> f.withMarshaller(UpdateLivePlatformRequest::getBody, UpdateLivePlatformRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateLivePlatformResponse::getXRequestId,
                UpdateLivePlatformResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateOnceCodeRequest, CreateOnceCodeResponse> createOnceCode =
        genForCreateOnceCode();

    private static HttpRequestDef<CreateOnceCodeRequest, CreateOnceCodeResponse> genForCreateOnceCode() {
        // basic
        HttpRequestDef.Builder<CreateOnceCodeRequest, CreateOnceCodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateOnceCodeRequest.class, CreateOnceCodeResponse.class)
                .withName("CreateOnceCode")
                .withUri("/v1/{project_id}/digital-human-chat/once-code")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateOnceCodeRequest::getAuthorization, CreateOnceCodeRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateOnceCodeRequest::getXSdkDate, CreateOnceCodeRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateOnceCodeRequest::getXProjectId, CreateOnceCodeRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateOnceCodeRequest::getXAppUserId, CreateOnceCodeRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateOnceCodeResponse::getXRequestId, CreateOnceCodeResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateMetaStudioOrdersRequest, CreateMetaStudioOrdersResponse> createMetaStudioOrders =
        genForCreateMetaStudioOrders();

    private static HttpRequestDef<CreateMetaStudioOrdersRequest, CreateMetaStudioOrdersResponse> genForCreateMetaStudioOrders() {
        // basic
        HttpRequestDef.Builder<CreateMetaStudioOrdersRequest, CreateMetaStudioOrdersResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateMetaStudioOrdersRequest.class, CreateMetaStudioOrdersResponse.class)
            .withName("CreateMetaStudioOrders")
            .withUri("/v1/{project_id}/mss/public/orders")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMetaStudioOrdersRequest::getAuthorization,
                CreateMetaStudioOrdersRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMetaStudioOrdersRequest::getXSdkDate,
                CreateMetaStudioOrdersRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMetaStudioOrdersRequest::getXProjectId,
                CreateMetaStudioOrdersRequest::setXProjectId));
        builder.<CreateMetaStudioOrdersReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateMetaStudioOrdersReq.class),
            f -> f.withMarshaller(CreateMetaStudioOrdersRequest::getBody, CreateMetaStudioOrdersRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateMetaStudioOrdersResponse::getXRequestId,
                CreateMetaStudioOrdersResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<BatchDeletePacifyWordsRequest, BatchDeletePacifyWordsResponse> batchDeletePacifyWords =
        genForBatchDeletePacifyWords();

    private static HttpRequestDef<BatchDeletePacifyWordsRequest, BatchDeletePacifyWordsResponse> genForBatchDeletePacifyWords() {
        // basic
        HttpRequestDef.Builder<BatchDeletePacifyWordsRequest, BatchDeletePacifyWordsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeletePacifyWordsRequest.class, BatchDeletePacifyWordsResponse.class)
            .withName("BatchDeletePacifyWords")
            .withUri("/v1/{project_id}/digital-human-chat/pacify-words/delete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeletePacifyWordsRequest::getAuthorization,
                BatchDeletePacifyWordsRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeletePacifyWordsRequest::getXSdkDate,
                BatchDeletePacifyWordsRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeletePacifyWordsRequest::getXProjectId,
                BatchDeletePacifyWordsRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeletePacifyWordsRequest::getXAppUserId,
                BatchDeletePacifyWordsRequest::setXAppUserId));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchDeletePacifyWordsRequest::getBody, BatchDeletePacifyWordsRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchDeletePacifyWordsResponse::getXRequestId,
                BatchDeletePacifyWordsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreatePacifyWordsRequest, CreatePacifyWordsResponse> createPacifyWords =
        genForCreatePacifyWords();

    private static HttpRequestDef<CreatePacifyWordsRequest, CreatePacifyWordsResponse> genForCreatePacifyWords() {
        // basic
        HttpRequestDef.Builder<CreatePacifyWordsRequest, CreatePacifyWordsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePacifyWordsRequest.class, CreatePacifyWordsResponse.class)
                .withName("CreatePacifyWords")
                .withUri("/v1/{project_id}/digital-human-chat/pacify-words")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePacifyWordsRequest::getAuthorization,
                CreatePacifyWordsRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePacifyWordsRequest::getXSdkDate, CreatePacifyWordsRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePacifyWordsRequest::getXProjectId, CreatePacifyWordsRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePacifyWordsRequest::getXAppUserId, CreatePacifyWordsRequest::setXAppUserId));
        builder.<CreatePacifyWordsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePacifyWordsReq.class),
            f -> f.withMarshaller(CreatePacifyWordsRequest::getBody, CreatePacifyWordsRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePacifyWordsResponse::getXRequestId, CreatePacifyWordsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeletePacifyWordsRequest, DeletePacifyWordsResponse> deletePacifyWords =
        genForDeletePacifyWords();

    private static HttpRequestDef<DeletePacifyWordsRequest, DeletePacifyWordsResponse> genForDeletePacifyWords() {
        // basic
        HttpRequestDef.Builder<DeletePacifyWordsRequest, DeletePacifyWordsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePacifyWordsRequest.class, DeletePacifyWordsResponse.class)
                .withName("DeletePacifyWords")
                .withUri("/v1/{project_id}/digital-human-chat/pacify-words/{pacify_words_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pacify_words_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePacifyWordsRequest::getPacifyWordsId,
                DeletePacifyWordsRequest::setPacifyWordsId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePacifyWordsRequest::getAuthorization,
                DeletePacifyWordsRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePacifyWordsRequest::getXSdkDate, DeletePacifyWordsRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePacifyWordsRequest::getXProjectId, DeletePacifyWordsRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePacifyWordsRequest::getXAppUserId, DeletePacifyWordsRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeletePacifyWordsResponse::getXRequestId, DeletePacifyWordsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListPacifyWordsRequest, ListPacifyWordsResponse> listPacifyWords =
        genForListPacifyWords();

    private static HttpRequestDef<ListPacifyWordsRequest, ListPacifyWordsResponse> genForListPacifyWords() {
        // basic
        HttpRequestDef.Builder<ListPacifyWordsRequest, ListPacifyWordsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPacifyWordsRequest.class, ListPacifyWordsResponse.class)
                .withName("ListPacifyWords")
                .withUri("/v1/{project_id}/digital-human-chat/pacify-words")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPacifyWordsRequest::getOffset, ListPacifyWordsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPacifyWordsRequest::getLimit, ListPacifyWordsRequest::setLimit));
        builder.<String>withRequestField("robot_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPacifyWordsRequest::getRobotId, ListPacifyWordsRequest::setRobotId));
        builder.<ListPacifyWordsRequest.LanguageEnum>withRequestField("language",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPacifyWordsRequest.LanguageEnum.class),
            f -> f.withMarshaller(ListPacifyWordsRequest::getLanguage, ListPacifyWordsRequest::setLanguage));
        builder.<Integer>withRequestField("pacify_words_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPacifyWordsRequest::getPacifyWordsType,
                ListPacifyWordsRequest::setPacifyWordsType));
        builder.<String>withRequestField("intent",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPacifyWordsRequest::getIntent, ListPacifyWordsRequest::setIntent));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPacifyWordsRequest::getAuthorization, ListPacifyWordsRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPacifyWordsRequest::getXSdkDate, ListPacifyWordsRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPacifyWordsRequest::getXProjectId, ListPacifyWordsRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPacifyWordsRequest::getXAppUserId, ListPacifyWordsRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPacifyWordsResponse::getXRequestId, ListPacifyWordsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowPacifyWordsRequest, ShowPacifyWordsResponse> showPacifyWords =
        genForShowPacifyWords();

    private static HttpRequestDef<ShowPacifyWordsRequest, ShowPacifyWordsResponse> genForShowPacifyWords() {
        // basic
        HttpRequestDef.Builder<ShowPacifyWordsRequest, ShowPacifyWordsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPacifyWordsRequest.class, ShowPacifyWordsResponse.class)
                .withName("ShowPacifyWords")
                .withUri("/v1/{project_id}/digital-human-chat/pacify-words/{pacify_words_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pacify_words_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPacifyWordsRequest::getPacifyWordsId, ShowPacifyWordsRequest::setPacifyWordsId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPacifyWordsRequest::getAuthorization, ShowPacifyWordsRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPacifyWordsRequest::getXSdkDate, ShowPacifyWordsRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPacifyWordsRequest::getXProjectId, ShowPacifyWordsRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPacifyWordsRequest::getXAppUserId, ShowPacifyWordsRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPacifyWordsResponse::getXRequestId, ShowPacifyWordsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowPacifyWordsIntentRequest, ShowPacifyWordsIntentResponse> showPacifyWordsIntent =
        genForShowPacifyWordsIntent();

    private static HttpRequestDef<ShowPacifyWordsIntentRequest, ShowPacifyWordsIntentResponse> genForShowPacifyWordsIntent() {
        // basic
        HttpRequestDef.Builder<ShowPacifyWordsIntentRequest, ShowPacifyWordsIntentResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowPacifyWordsIntentRequest.class, ShowPacifyWordsIntentResponse.class)
            .withName("ShowPacifyWordsIntent")
            .withUri("/v1/{project_id}/digital-human-chat/pacify-words-intent")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("robot_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPacifyWordsIntentRequest::getRobotId, ShowPacifyWordsIntentRequest::setRobotId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPacifyWordsIntentRequest::getAuthorization,
                ShowPacifyWordsIntentRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPacifyWordsIntentRequest::getXSdkDate,
                ShowPacifyWordsIntentRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPacifyWordsIntentRequest::getXProjectId,
                ShowPacifyWordsIntentRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPacifyWordsIntentRequest::getXAppUserId,
                ShowPacifyWordsIntentRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPacifyWordsIntentResponse::getXRequestId,
                ShowPacifyWordsIntentResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowPacifyWordsSwitchRequest, ShowPacifyWordsSwitchResponse> showPacifyWordsSwitch =
        genForShowPacifyWordsSwitch();

    private static HttpRequestDef<ShowPacifyWordsSwitchRequest, ShowPacifyWordsSwitchResponse> genForShowPacifyWordsSwitch() {
        // basic
        HttpRequestDef.Builder<ShowPacifyWordsSwitchRequest, ShowPacifyWordsSwitchResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowPacifyWordsSwitchRequest.class, ShowPacifyWordsSwitchResponse.class)
            .withName("ShowPacifyWordsSwitch")
            .withUri("/v1/{project_id}/digital-human-chat/pacify-words-switch")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("robot_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPacifyWordsSwitchRequest::getRobotId, ShowPacifyWordsSwitchRequest::setRobotId));
        builder.<ShowPacifyWordsSwitchRequest.LanguageEnum>withRequestField("language",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowPacifyWordsSwitchRequest.LanguageEnum.class),
            f -> f.withMarshaller(ShowPacifyWordsSwitchRequest::getLanguage,
                ShowPacifyWordsSwitchRequest::setLanguage));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPacifyWordsSwitchRequest::getAuthorization,
                ShowPacifyWordsSwitchRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPacifyWordsSwitchRequest::getXSdkDate,
                ShowPacifyWordsSwitchRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPacifyWordsSwitchRequest::getXProjectId,
                ShowPacifyWordsSwitchRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPacifyWordsSwitchRequest::getXAppUserId,
                ShowPacifyWordsSwitchRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPacifyWordsSwitchResponse::getXRequestId,
                ShowPacifyWordsSwitchResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowPacifyWordsTriggerTimeRequest, ShowPacifyWordsTriggerTimeResponse> showPacifyWordsTriggerTime =
        genForShowPacifyWordsTriggerTime();

    private static HttpRequestDef<ShowPacifyWordsTriggerTimeRequest, ShowPacifyWordsTriggerTimeResponse> genForShowPacifyWordsTriggerTime() {
        // basic
        HttpRequestDef.Builder<ShowPacifyWordsTriggerTimeRequest, ShowPacifyWordsTriggerTimeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowPacifyWordsTriggerTimeRequest.class,
                    ShowPacifyWordsTriggerTimeResponse.class)
                .withName("ShowPacifyWordsTriggerTime")
                .withUri("/v1/{project_id}/digital-human-chat/pacify-words-time")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("robot_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPacifyWordsTriggerTimeRequest::getRobotId,
                ShowPacifyWordsTriggerTimeRequest::setRobotId));
        builder.<ShowPacifyWordsTriggerTimeRequest.LanguageEnum>withRequestField("language",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowPacifyWordsTriggerTimeRequest.LanguageEnum.class),
            f -> f.withMarshaller(ShowPacifyWordsTriggerTimeRequest::getLanguage,
                ShowPacifyWordsTriggerTimeRequest::setLanguage));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPacifyWordsTriggerTimeRequest::getAuthorization,
                ShowPacifyWordsTriggerTimeRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPacifyWordsTriggerTimeRequest::getXSdkDate,
                ShowPacifyWordsTriggerTimeRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPacifyWordsTriggerTimeRequest::getXProjectId,
                ShowPacifyWordsTriggerTimeRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPacifyWordsTriggerTimeRequest::getXAppUserId,
                ShowPacifyWordsTriggerTimeRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPacifyWordsTriggerTimeResponse::getXRequestId,
                ShowPacifyWordsTriggerTimeResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdatePacifyWordsRequest, UpdatePacifyWordsResponse> updatePacifyWords =
        genForUpdatePacifyWords();

    private static HttpRequestDef<UpdatePacifyWordsRequest, UpdatePacifyWordsResponse> genForUpdatePacifyWords() {
        // basic
        HttpRequestDef.Builder<UpdatePacifyWordsRequest, UpdatePacifyWordsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePacifyWordsRequest.class, UpdatePacifyWordsResponse.class)
                .withName("UpdatePacifyWords")
                .withUri("/v1/{project_id}/digital-human-chat/pacify-words/{pacify_words_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pacify_words_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePacifyWordsRequest::getPacifyWordsId,
                UpdatePacifyWordsRequest::setPacifyWordsId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePacifyWordsRequest::getAuthorization,
                UpdatePacifyWordsRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePacifyWordsRequest::getXSdkDate, UpdatePacifyWordsRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePacifyWordsRequest::getXProjectId, UpdatePacifyWordsRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePacifyWordsRequest::getXAppUserId, UpdatePacifyWordsRequest::setXAppUserId));
        builder.<UpdatePacifyWordsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePacifyWordsReq.class),
            f -> f.withMarshaller(UpdatePacifyWordsRequest::getBody, UpdatePacifyWordsRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdatePacifyWordsResponse::getXRequestId, UpdatePacifyWordsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdatePacifyWordsSwitchRequest, UpdatePacifyWordsSwitchResponse> updatePacifyWordsSwitch =
        genForUpdatePacifyWordsSwitch();

    private static HttpRequestDef<UpdatePacifyWordsSwitchRequest, UpdatePacifyWordsSwitchResponse> genForUpdatePacifyWordsSwitch() {
        // basic
        HttpRequestDef.Builder<UpdatePacifyWordsSwitchRequest, UpdatePacifyWordsSwitchResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdatePacifyWordsSwitchRequest.class, UpdatePacifyWordsSwitchResponse.class)
            .withName("UpdatePacifyWordsSwitch")
            .withUri("/v1/{project_id}/digital-human-chat/pacify-words-switch")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePacifyWordsSwitchRequest::getAuthorization,
                UpdatePacifyWordsSwitchRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePacifyWordsSwitchRequest::getXSdkDate,
                UpdatePacifyWordsSwitchRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePacifyWordsSwitchRequest::getXProjectId,
                UpdatePacifyWordsSwitchRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePacifyWordsSwitchRequest::getXAppUserId,
                UpdatePacifyWordsSwitchRequest::setXAppUserId));
        builder.<UpdatePacifyWordsSwitchReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePacifyWordsSwitchReq.class),
            f -> f.withMarshaller(UpdatePacifyWordsSwitchRequest::getBody, UpdatePacifyWordsSwitchRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdatePacifyWordsSwitchResponse::getXRequestId,
                UpdatePacifyWordsSwitchResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdatePacifyWordsTriggerTimeRequest, UpdatePacifyWordsTriggerTimeResponse> updatePacifyWordsTriggerTime =
        genForUpdatePacifyWordsTriggerTime();

    private static HttpRequestDef<UpdatePacifyWordsTriggerTimeRequest, UpdatePacifyWordsTriggerTimeResponse> genForUpdatePacifyWordsTriggerTime() {
        // basic
        HttpRequestDef.Builder<UpdatePacifyWordsTriggerTimeRequest, UpdatePacifyWordsTriggerTimeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdatePacifyWordsTriggerTimeRequest.class,
                    UpdatePacifyWordsTriggerTimeResponse.class)
                .withName("UpdatePacifyWordsTriggerTime")
                .withUri("/v1/{project_id}/digital-human-chat/pacify-words-time")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePacifyWordsTriggerTimeRequest::getAuthorization,
                UpdatePacifyWordsTriggerTimeRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePacifyWordsTriggerTimeRequest::getXSdkDate,
                UpdatePacifyWordsTriggerTimeRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePacifyWordsTriggerTimeRequest::getXProjectId,
                UpdatePacifyWordsTriggerTimeRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePacifyWordsTriggerTimeRequest::getXAppUserId,
                UpdatePacifyWordsTriggerTimeRequest::setXAppUserId));
        builder.<UpdatePacifyWordsTriggerTimeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePacifyWordsTriggerTimeReq.class),
            f -> f.withMarshaller(UpdatePacifyWordsTriggerTimeRequest::getBody,
                UpdatePacifyWordsTriggerTimeRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdatePacifyWordsTriggerTimeResponse::getXRequestId,
                UpdatePacifyWordsTriggerTimeResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreatePictureModelingByUrlJobRequest, CreatePictureModelingByUrlJobResponse> createPictureModelingByUrlJob =
        genForCreatePictureModelingByUrlJob();

    private static HttpRequestDef<CreatePictureModelingByUrlJobRequest, CreatePictureModelingByUrlJobResponse> genForCreatePictureModelingByUrlJob() {
        // basic
        HttpRequestDef.Builder<CreatePictureModelingByUrlJobRequest, CreatePictureModelingByUrlJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreatePictureModelingByUrlJobRequest.class,
                    CreatePictureModelingByUrlJobResponse.class)
                .withName("CreatePictureModelingByUrlJob")
                .withUri("/v1/{project_id}/digital-human/stylized/picture-modelings-by-url")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePictureModelingByUrlJobRequest::getAuthorization,
                CreatePictureModelingByUrlJobRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePictureModelingByUrlJobRequest::getXSdkDate,
                CreatePictureModelingByUrlJobRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePictureModelingByUrlJobRequest::getXProjectId,
                CreatePictureModelingByUrlJobRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePictureModelingByUrlJobRequest::getXAppUserId,
                CreatePictureModelingByUrlJobRequest::setXAppUserId));
        builder.<PictureModelingByUrlReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PictureModelingByUrlReq.class),
            f -> f.withMarshaller(CreatePictureModelingByUrlJobRequest::getBody,
                CreatePictureModelingByUrlJobRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePictureModelingByUrlJobResponse::getXRequestId,
                CreatePictureModelingByUrlJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreatePictureModelingJobRequest, CreatePictureModelingJobResponse> createPictureModelingJob =
        genForCreatePictureModelingJob();

    private static HttpRequestDef<CreatePictureModelingJobRequest, CreatePictureModelingJobResponse> genForCreatePictureModelingJob() {
        // basic
        HttpRequestDef.Builder<CreatePictureModelingJobRequest, CreatePictureModelingJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreatePictureModelingJobRequest.class, CreatePictureModelingJobResponse.class)
                .withName("CreatePictureModelingJob")
                .withUri("/v1/{project_id}/digital-human/stylized/picture-modelings")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePictureModelingJobRequest::getAuthorization,
                CreatePictureModelingJobRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePictureModelingJobRequest::getXSdkDate,
                CreatePictureModelingJobRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePictureModelingJobRequest::getXProjectId,
                CreatePictureModelingJobRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePictureModelingJobRequest::getXAppUserId,
                CreatePictureModelingJobRequest::setXAppUserId));
        builder.<CreatePictureModelingJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePictureModelingJobRequestBody.class),
            f -> f.withMarshaller(CreatePictureModelingJobRequest::getBody, CreatePictureModelingJobRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePictureModelingJobResponse::getXRequestId,
                CreatePictureModelingJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListPictureModelingJobsRequest, ListPictureModelingJobsResponse> listPictureModelingJobs =
        genForListPictureModelingJobs();

    private static HttpRequestDef<ListPictureModelingJobsRequest, ListPictureModelingJobsResponse> genForListPictureModelingJobs() {
        // basic
        HttpRequestDef.Builder<ListPictureModelingJobsRequest, ListPictureModelingJobsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListPictureModelingJobsRequest.class, ListPictureModelingJobsResponse.class)
            .withName("ListPictureModelingJobs")
            .withUri("/v1/{project_id}/digital-human/stylized/picture-modelings")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPictureModelingJobsRequest::getOffset,
                ListPictureModelingJobsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPictureModelingJobsRequest::getLimit, ListPictureModelingJobsRequest::setLimit));
        builder.<String>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPictureModelingJobsRequest::getState, ListPictureModelingJobsRequest::setState));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPictureModelingJobsRequest::getSortKey,
                ListPictureModelingJobsRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPictureModelingJobsRequest::getSortDir,
                ListPictureModelingJobsRequest::setSortDir));
        builder.<String>withRequestField("create_until",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPictureModelingJobsRequest::getCreateUntil,
                ListPictureModelingJobsRequest::setCreateUntil));
        builder.<String>withRequestField("create_since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPictureModelingJobsRequest::getCreateSince,
                ListPictureModelingJobsRequest::setCreateSince));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPictureModelingJobsRequest::getAuthorization,
                ListPictureModelingJobsRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPictureModelingJobsRequest::getXSdkDate,
                ListPictureModelingJobsRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPictureModelingJobsRequest::getXProjectId,
                ListPictureModelingJobsRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPictureModelingJobsRequest::getXAppUserId,
                ListPictureModelingJobsRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPictureModelingJobsResponse::getXRequestId,
                ListPictureModelingJobsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowPictureModelingJobRequest, ShowPictureModelingJobResponse> showPictureModelingJob =
        genForShowPictureModelingJob();

    private static HttpRequestDef<ShowPictureModelingJobRequest, ShowPictureModelingJobResponse> genForShowPictureModelingJob() {
        // basic
        HttpRequestDef.Builder<ShowPictureModelingJobRequest, ShowPictureModelingJobResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowPictureModelingJobRequest.class, ShowPictureModelingJobResponse.class)
            .withName("ShowPictureModelingJob")
            .withUri("/v1/{project_id}/digital-human/stylized/picture-modelings/{job_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPictureModelingJobRequest::getJobId, ShowPictureModelingJobRequest::setJobId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPictureModelingJobRequest::getAuthorization,
                ShowPictureModelingJobRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPictureModelingJobRequest::getXSdkDate,
                ShowPictureModelingJobRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPictureModelingJobRequest::getXProjectId,
                ShowPictureModelingJobRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPictureModelingJobRequest::getXAppUserId,
                ShowPictureModelingJobRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPictureModelingJobResponse::getXRequestId,
                ShowPictureModelingJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateProductRequest, CreateProductResponse> createProduct =
        genForCreateProduct();

    private static HttpRequestDef<CreateProductRequest, CreateProductResponse> genForCreateProduct() {
        // basic
        HttpRequestDef.Builder<CreateProductRequest, CreateProductResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateProductRequest.class, CreateProductResponse.class)
                .withName("CreateProduct")
                .withUri("/v1/{project_id}/products")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateProductRequest::getAuthorization, CreateProductRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateProductRequest::getXSdkDate, CreateProductRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateProductRequest::getXProjectId, CreateProductRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateProductRequest::getXAppUserId, CreateProductRequest::setXAppUserId));
        builder.<CreateProductRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateProductRequestBody.class),
            f -> f.withMarshaller(CreateProductRequest::getBody, CreateProductRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateProductResponse::getXRequestId, CreateProductResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteProductRequest, DeleteProductResponse> deleteProduct =
        genForDeleteProduct();

    private static HttpRequestDef<DeleteProductRequest, DeleteProductResponse> genForDeleteProduct() {
        // basic
        HttpRequestDef.Builder<DeleteProductRequest, DeleteProductResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteProductRequest.class, DeleteProductResponse.class)
                .withName("DeleteProduct")
                .withUri("/v1/{project_id}/products/{product_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("product_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProductRequest::getProductId, DeleteProductRequest::setProductId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProductRequest::getAuthorization, DeleteProductRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProductRequest::getXSdkDate, DeleteProductRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProductRequest::getXProjectId, DeleteProductRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProductRequest::getXAppUserId, DeleteProductRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteProductResponse::getXRequestId, DeleteProductResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListProductsRequest, ListProductsResponse> listProducts = genForListProducts();

    private static HttpRequestDef<ListProductsRequest, ListProductsResponse> genForListProducts() {
        // basic
        HttpRequestDef.Builder<ListProductsRequest, ListProductsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProductsRequest.class, ListProductsResponse.class)
                .withName("ListProducts")
                .withUri("/v1/{project_id}/products")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProductsRequest::getOffset, ListProductsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProductsRequest::getLimit, ListProductsRequest::setLimit));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getSortKey, ListProductsRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getSortDir, ListProductsRequest::setSortDir));
        builder.<String>withRequestField("create_until",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getCreateUntil, ListProductsRequest::setCreateUntil));
        builder.<String>withRequestField("create_since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getCreateSince, ListProductsRequest::setCreateSince));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getName, ListProductsRequest::setName));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getTag, ListProductsRequest::setTag));
        builder.<String>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getState, ListProductsRequest::setState));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getAuthorization, ListProductsRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getXSdkDate, ListProductsRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getXProjectId, ListProductsRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getXAppUserId, ListProductsRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProductsResponse::getXRequestId, ListProductsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<SetProductAssetRequest, SetProductAssetResponse> setProductAsset =
        genForSetProductAsset();

    private static HttpRequestDef<SetProductAssetRequest, SetProductAssetResponse> genForSetProductAsset() {
        // basic
        HttpRequestDef.Builder<SetProductAssetRequest, SetProductAssetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SetProductAssetRequest.class, SetProductAssetResponse.class)
                .withName("SetProductAsset")
                .withUri("/v1/{project_id}/products/{product_id}/assets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("product_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetProductAssetRequest::getProductId, SetProductAssetRequest::setProductId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetProductAssetRequest::getAuthorization, SetProductAssetRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetProductAssetRequest::getXSdkDate, SetProductAssetRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetProductAssetRequest::getXProjectId, SetProductAssetRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetProductAssetRequest::getXAppUserId, SetProductAssetRequest::setXAppUserId));
        builder.<ProductAssetReleation>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ProductAssetReleation.class),
            f -> f.withMarshaller(SetProductAssetRequest::getBody, SetProductAssetRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SetProductAssetResponse::getXRequestId, SetProductAssetResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowProductRequest, ShowProductResponse> showProduct = genForShowProduct();

    private static HttpRequestDef<ShowProductRequest, ShowProductResponse> genForShowProduct() {
        // basic
        HttpRequestDef.Builder<ShowProductRequest, ShowProductResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProductRequest.class, ShowProductResponse.class)
                .withName("ShowProduct")
                .withUri("/v1/{project_id}/products/{product_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("product_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProductRequest::getProductId, ShowProductRequest::setProductId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProductRequest::getAuthorization, ShowProductRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProductRequest::getXSdkDate, ShowProductRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProductRequest::getXProjectId, ShowProductRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProductRequest::getXAppUserId, ShowProductRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowProductResponse::getXRequestId, ShowProductResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateProductRequest, UpdateProductResponse> updateProduct =
        genForUpdateProduct();

    private static HttpRequestDef<UpdateProductRequest, UpdateProductResponse> genForUpdateProduct() {
        // basic
        HttpRequestDef.Builder<UpdateProductRequest, UpdateProductResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateProductRequest.class, UpdateProductResponse.class)
                .withName("UpdateProduct")
                .withUri("/v1/{project_id}/products/{product_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("product_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProductRequest::getProductId, UpdateProductRequest::setProductId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProductRequest::getAuthorization, UpdateProductRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProductRequest::getXSdkDate, UpdateProductRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProductRequest::getXProjectId, UpdateProductRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProductRequest::getXAppUserId, UpdateProductRequest::setXAppUserId));
        builder.<UpdateProductRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateProductRequestBody.class),
            f -> f.withMarshaller(UpdateProductRequest::getBody, UpdateProductRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateProductResponse::getXRequestId, UpdateProductResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateRobotRequest, CreateRobotResponse> createRobot = genForCreateRobot();

    private static HttpRequestDef<CreateRobotRequest, CreateRobotResponse> genForCreateRobot() {
        // basic
        HttpRequestDef.Builder<CreateRobotRequest, CreateRobotResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRobotRequest.class, CreateRobotResponse.class)
                .withName("CreateRobot")
                .withUri("/v1/{project_id}/digital-human-chat/robot")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRobotRequest::getAuthorization, CreateRobotRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRobotRequest::getXSdkDate, CreateRobotRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRobotRequest::getXProjectId, CreateRobotRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRobotRequest::getXAppUserId, CreateRobotRequest::setXAppUserId));
        builder.<CreateRobotReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRobotReq.class),
            f -> f.withMarshaller(CreateRobotRequest::getBody, CreateRobotRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateRobotResponse::getXRequestId, CreateRobotResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteRobotRequest, DeleteRobotResponse> deleteRobot = genForDeleteRobot();

    private static HttpRequestDef<DeleteRobotRequest, DeleteRobotResponse> genForDeleteRobot() {
        // basic
        HttpRequestDef.Builder<DeleteRobotRequest, DeleteRobotResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteRobotRequest.class, DeleteRobotResponse.class)
                .withName("DeleteRobot")
                .withUri("/v1/{project_id}/digital-human-chat/robot/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRobotRequest::getAuthorization, DeleteRobotRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRobotRequest::getXSdkDate, DeleteRobotRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRobotRequest::getXProjectId, DeleteRobotRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRobotRequest::getXAppUserId, DeleteRobotRequest::setXAppUserId));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteRobotRequest::getBody, DeleteRobotRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteRobotResponse::getXRequestId, DeleteRobotResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListRobotRequest, ListRobotResponse> listRobot = genForListRobot();

    private static HttpRequestDef<ListRobotRequest, ListRobotResponse> genForListRobot() {
        // basic
        HttpRequestDef.Builder<ListRobotRequest, ListRobotResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRobotRequest.class, ListRobotResponse.class)
                .withName("ListRobot")
                .withUri("/v1/{project_id}/digital-human-chat/robot")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRobotRequest::getOffset, ListRobotRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRobotRequest::getLimit, ListRobotRequest::setLimit));
        builder.<String>withRequestField("room_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRobotRequest::getRoomId, ListRobotRequest::setRoomId));
        builder.<ListRobotRequest.RobotTypeEnum>withRequestField("robot_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRobotRequest.RobotTypeEnum.class),
            f -> f.withMarshaller(ListRobotRequest::getRobotType, ListRobotRequest::setRobotType));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRobotRequest::getAuthorization, ListRobotRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRobotRequest::getXSdkDate, ListRobotRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRobotRequest::getXProjectId, ListRobotRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRobotRequest::getXAppUserId, ListRobotRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRobotResponse::getXRequestId, ListRobotResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowRobotRequest, ShowRobotResponse> showRobot = genForShowRobot();

    private static HttpRequestDef<ShowRobotRequest, ShowRobotResponse> genForShowRobot() {
        // basic
        HttpRequestDef.Builder<ShowRobotRequest, ShowRobotResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRobotRequest.class, ShowRobotResponse.class)
                .withName("ShowRobot")
                .withUri("/v1/{project_id}/digital-human-chat/robot/{robot_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("robot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRobotRequest::getRobotId, ShowRobotRequest::setRobotId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRobotRequest::getAuthorization, ShowRobotRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRobotRequest::getXSdkDate, ShowRobotRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRobotRequest::getXProjectId, ShowRobotRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRobotRequest::getXAppUserId, ShowRobotRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowRobotResponse::getXRequestId, ShowRobotResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateRobotRequest, UpdateRobotResponse> updateRobot = genForUpdateRobot();

    private static HttpRequestDef<UpdateRobotRequest, UpdateRobotResponse> genForUpdateRobot() {
        // basic
        HttpRequestDef.Builder<UpdateRobotRequest, UpdateRobotResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRobotRequest.class, UpdateRobotResponse.class)
                .withName("UpdateRobot")
                .withUri("/v1/{project_id}/digital-human-chat/robot/{robot_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("robot_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRobotRequest::getRobotId, UpdateRobotRequest::setRobotId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRobotRequest::getAuthorization, UpdateRobotRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRobotRequest::getXSdkDate, UpdateRobotRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRobotRequest::getXProjectId, UpdateRobotRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRobotRequest::getXAppUserId, UpdateRobotRequest::setXAppUserId));
        builder.<UpdateRobotReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRobotReq.class),
            f -> f.withMarshaller(UpdateRobotRequest::getBody, UpdateRobotRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateRobotResponse::getXRequestId, UpdateRobotResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ValidateRobotRequest, ValidateRobotResponse> validateRobot =
        genForValidateRobot();

    private static HttpRequestDef<ValidateRobotRequest, ValidateRobotResponse> genForValidateRobot() {
        // basic
        HttpRequestDef.Builder<ValidateRobotRequest, ValidateRobotResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ValidateRobotRequest.class, ValidateRobotResponse.class)
                .withName("ValidateRobot")
                .withUri("/v1/{project_id}/digital-human-chat/robot/validate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ValidateRobotRequest::getAuthorization, ValidateRobotRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ValidateRobotRequest::getXSdkDate, ValidateRobotRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ValidateRobotRequest::getXProjectId, ValidateRobotRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ValidateRobotRequest::getXAppUserId, ValidateRobotRequest::setXAppUserId));
        builder.<ValidateRobotReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ValidateRobotReq.class),
            f -> f.withMarshaller(ValidateRobotRequest::getBody, ValidateRobotRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ValidateRobotResponse::getXRequestId, ValidateRobotResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateSmartChatRoomRequest, CreateSmartChatRoomResponse> createSmartChatRoom =
        genForCreateSmartChatRoom();

    private static HttpRequestDef<CreateSmartChatRoomRequest, CreateSmartChatRoomResponse> genForCreateSmartChatRoom() {
        // basic
        HttpRequestDef.Builder<CreateSmartChatRoomRequest, CreateSmartChatRoomResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSmartChatRoomRequest.class, CreateSmartChatRoomResponse.class)
                .withName("CreateSmartChatRoom")
                .withUri("/v1/{project_id}/smart-chat-rooms")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSmartChatRoomRequest::getAuthorization,
                CreateSmartChatRoomRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSmartChatRoomRequest::getXSdkDate, CreateSmartChatRoomRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSmartChatRoomRequest::getXProjectId,
                CreateSmartChatRoomRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSmartChatRoomRequest::getXAppUserId,
                CreateSmartChatRoomRequest::setXAppUserId));
        builder.<CreateSmartChatRoomReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSmartChatRoomReq.class),
            f -> f.withMarshaller(CreateSmartChatRoomRequest::getBody, CreateSmartChatRoomRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateSmartChatRoomResponse::getXRequestId,
                CreateSmartChatRoomResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteSmartChatRoomRequest, DeleteSmartChatRoomResponse> deleteSmartChatRoom =
        genForDeleteSmartChatRoom();

    private static HttpRequestDef<DeleteSmartChatRoomRequest, DeleteSmartChatRoomResponse> genForDeleteSmartChatRoom() {
        // basic
        HttpRequestDef.Builder<DeleteSmartChatRoomRequest, DeleteSmartChatRoomResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteSmartChatRoomRequest.class, DeleteSmartChatRoomResponse.class)
            .withName("DeleteSmartChatRoom")
            .withUri("/v1/{project_id}/smart-chat-rooms/{room_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("room_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSmartChatRoomRequest::getRoomId, DeleteSmartChatRoomRequest::setRoomId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSmartChatRoomRequest::getAuthorization,
                DeleteSmartChatRoomRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSmartChatRoomRequest::getXSdkDate, DeleteSmartChatRoomRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSmartChatRoomRequest::getXProjectId,
                DeleteSmartChatRoomRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSmartChatRoomRequest::getXAppUserId,
                DeleteSmartChatRoomRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteSmartChatRoomResponse::getXRequestId,
                DeleteSmartChatRoomResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListSmartChatRoomsRequest, ListSmartChatRoomsResponse> listSmartChatRooms =
        genForListSmartChatRooms();

    private static HttpRequestDef<ListSmartChatRoomsRequest, ListSmartChatRoomsResponse> genForListSmartChatRooms() {
        // basic
        HttpRequestDef.Builder<ListSmartChatRoomsRequest, ListSmartChatRoomsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSmartChatRoomsRequest.class, ListSmartChatRoomsResponse.class)
                .withName("ListSmartChatRooms")
                .withUri("/v1/{project_id}/smart-chat-rooms")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSmartChatRoomsRequest::getOffset, ListSmartChatRoomsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSmartChatRoomsRequest::getLimit, ListSmartChatRoomsRequest::setLimit));
        builder.<String>withRequestField("room_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartChatRoomsRequest::getRoomName, ListSmartChatRoomsRequest::setRoomName));
        builder.<String>withRequestField("model_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartChatRoomsRequest::getModelName, ListSmartChatRoomsRequest::setModelName));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartChatRoomsRequest::getStartTime, ListSmartChatRoomsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartChatRoomsRequest::getEndTime, ListSmartChatRoomsRequest::setEndTime));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartChatRoomsRequest::getAuthorization,
                ListSmartChatRoomsRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartChatRoomsRequest::getXSdkDate, ListSmartChatRoomsRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartChatRoomsRequest::getXProjectId, ListSmartChatRoomsRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartChatRoomsRequest::getXAppUserId, ListSmartChatRoomsRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSmartChatRoomsResponse::getXRequestId,
                ListSmartChatRoomsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowSmartChatRoomRequest, ShowSmartChatRoomResponse> showSmartChatRoom =
        genForShowSmartChatRoom();

    private static HttpRequestDef<ShowSmartChatRoomRequest, ShowSmartChatRoomResponse> genForShowSmartChatRoom() {
        // basic
        HttpRequestDef.Builder<ShowSmartChatRoomRequest, ShowSmartChatRoomResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSmartChatRoomRequest.class, ShowSmartChatRoomResponse.class)
                .withName("ShowSmartChatRoom")
                .withUri("/v1/{project_id}/smart-chat-rooms/{room_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("room_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSmartChatRoomRequest::getRoomId, ShowSmartChatRoomRequest::setRoomId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSmartChatRoomRequest::getAuthorization,
                ShowSmartChatRoomRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSmartChatRoomRequest::getXSdkDate, ShowSmartChatRoomRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSmartChatRoomRequest::getXProjectId, ShowSmartChatRoomRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSmartChatRoomRequest::getXAppUserId, ShowSmartChatRoomRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowSmartChatRoomResponse::getXRequestId, ShowSmartChatRoomResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateSmartChatRoomRequest, UpdateSmartChatRoomResponse> updateSmartChatRoom =
        genForUpdateSmartChatRoom();

    private static HttpRequestDef<UpdateSmartChatRoomRequest, UpdateSmartChatRoomResponse> genForUpdateSmartChatRoom() {
        // basic
        HttpRequestDef.Builder<UpdateSmartChatRoomRequest, UpdateSmartChatRoomResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSmartChatRoomRequest.class, UpdateSmartChatRoomResponse.class)
                .withName("UpdateSmartChatRoom")
                .withUri("/v1/{project_id}/smart-chat-rooms/{room_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("room_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSmartChatRoomRequest::getRoomId, UpdateSmartChatRoomRequest::setRoomId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSmartChatRoomRequest::getAuthorization,
                UpdateSmartChatRoomRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSmartChatRoomRequest::getXSdkDate, UpdateSmartChatRoomRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSmartChatRoomRequest::getXProjectId,
                UpdateSmartChatRoomRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSmartChatRoomRequest::getXAppUserId,
                UpdateSmartChatRoomRequest::setXAppUserId));
        builder.<CreateSmartChatRoomReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSmartChatRoomReq.class),
            f -> f.withMarshaller(UpdateSmartChatRoomRequest::getBody, UpdateSmartChatRoomRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateSmartChatRoomResponse::getXRequestId,
                UpdateSmartChatRoomResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<BatchConfirmLiveCommandsRequest, BatchConfirmLiveCommandsResponse> batchConfirmLiveCommands =
        genForBatchConfirmLiveCommands();

    private static HttpRequestDef<BatchConfirmLiveCommandsRequest, BatchConfirmLiveCommandsResponse> genForBatchConfirmLiveCommands() {
        // basic
        HttpRequestDef.Builder<BatchConfirmLiveCommandsRequest, BatchConfirmLiveCommandsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, BatchConfirmLiveCommandsRequest.class, BatchConfirmLiveCommandsResponse.class)
                .withName("BatchConfirmLiveCommands")
                .withUri("/v1/{project_id}/smart-live-rooms/{room_id}/smart-live-jobs/{job_id}/batch-commands-confirm")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("room_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchConfirmLiveCommandsRequest::getRoomId,
                BatchConfirmLiveCommandsRequest::setRoomId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchConfirmLiveCommandsRequest::getJobId,
                BatchConfirmLiveCommandsRequest::setJobId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchConfirmLiveCommandsRequest::getAuthorization,
                BatchConfirmLiveCommandsRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchConfirmLiveCommandsRequest::getXSdkDate,
                BatchConfirmLiveCommandsRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchConfirmLiveCommandsRequest::getXProjectId,
                BatchConfirmLiveCommandsRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchConfirmLiveCommandsRequest::getXAppUserId,
                BatchConfirmLiveCommandsRequest::setXAppUserId));
        builder.<BatchConfirmLiveCommandsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchConfirmLiveCommandsReq.class),
            f -> f.withMarshaller(BatchConfirmLiveCommandsRequest::getBody, BatchConfirmLiveCommandsRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchConfirmLiveCommandsResponse::getXRequestId,
                BatchConfirmLiveCommandsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ExecuteSmartLiveCommandRequest, ExecuteSmartLiveCommandResponse> executeSmartLiveCommand =
        genForExecuteSmartLiveCommand();

    private static HttpRequestDef<ExecuteSmartLiveCommandRequest, ExecuteSmartLiveCommandResponse> genForExecuteSmartLiveCommand() {
        // basic
        HttpRequestDef.Builder<ExecuteSmartLiveCommandRequest, ExecuteSmartLiveCommandResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ExecuteSmartLiveCommandRequest.class, ExecuteSmartLiveCommandResponse.class)
            .withName("ExecuteSmartLiveCommand")
            .withUri("/v1/{project_id}/smart-live-rooms/{room_id}/smart-live-jobs/{job_id}/command")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("room_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteSmartLiveCommandRequest::getRoomId,
                ExecuteSmartLiveCommandRequest::setRoomId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteSmartLiveCommandRequest::getJobId, ExecuteSmartLiveCommandRequest::setJobId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteSmartLiveCommandRequest::getAuthorization,
                ExecuteSmartLiveCommandRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteSmartLiveCommandRequest::getXSdkDate,
                ExecuteSmartLiveCommandRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteSmartLiveCommandRequest::getXProjectId,
                ExecuteSmartLiveCommandRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteSmartLiveCommandRequest::getXAppUserId,
                ExecuteSmartLiveCommandRequest::setXAppUserId));
        builder.<ControlSmartLiveReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ControlSmartLiveReq.class),
            f -> f.withMarshaller(ExecuteSmartLiveCommandRequest::getBody, ExecuteSmartLiveCommandRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ExecuteSmartLiveCommandResponse::getXRequestId,
                ExecuteSmartLiveCommandResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListSmartLiveRequest, ListSmartLiveResponse> listSmartLive =
        genForListSmartLive();

    private static HttpRequestDef<ListSmartLiveRequest, ListSmartLiveResponse> genForListSmartLive() {
        // basic
        HttpRequestDef.Builder<ListSmartLiveRequest, ListSmartLiveResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSmartLiveRequest.class, ListSmartLiveResponse.class)
                .withName("ListSmartLive")
                .withUri("/v1/{project_id}/smart-live-rooms/{room_id}/smart-live-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("room_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRequest::getRoomId, ListSmartLiveRequest::setRoomId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSmartLiveRequest::getOffset, ListSmartLiveRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSmartLiveRequest::getLimit, ListSmartLiveRequest::setLimit));
        builder.<String>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRequest::getState, ListSmartLiveRequest::setState));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRequest::getSortKey, ListSmartLiveRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRequest::getSortDir, ListSmartLiveRequest::setSortDir));
        builder.<String>withRequestField("create_since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRequest::getCreateSince, ListSmartLiveRequest::setCreateSince));
        builder.<String>withRequestField("create_until",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRequest::getCreateUntil, ListSmartLiveRequest::setCreateUntil));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRequest::getAuthorization, ListSmartLiveRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRequest::getXSdkDate, ListSmartLiveRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRequest::getXProjectId, ListSmartLiveRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRequest::getXAppUserId, ListSmartLiveRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSmartLiveResponse::getXRequestId, ListSmartLiveResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListSmartLiveJobsRequest, ListSmartLiveJobsResponse> listSmartLiveJobs =
        genForListSmartLiveJobs();

    private static HttpRequestDef<ListSmartLiveJobsRequest, ListSmartLiveJobsResponse> genForListSmartLiveJobs() {
        // basic
        HttpRequestDef.Builder<ListSmartLiveJobsRequest, ListSmartLiveJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSmartLiveJobsRequest.class, ListSmartLiveJobsResponse.class)
                .withName("ListSmartLiveJobs")
                .withUri("/v1/{project_id}/smart-live-jobs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSmartLiveJobsRequest::getOffset, ListSmartLiveJobsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSmartLiveJobsRequest::getLimit, ListSmartLiveJobsRequest::setLimit));
        builder.<String>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveJobsRequest::getState, ListSmartLiveJobsRequest::setState));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveJobsRequest::getSortKey, ListSmartLiveJobsRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveJobsRequest::getSortDir, ListSmartLiveJobsRequest::setSortDir));
        builder.<String>withRequestField("create_since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveJobsRequest::getCreateSince, ListSmartLiveJobsRequest::setCreateSince));
        builder.<String>withRequestField("create_until",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveJobsRequest::getCreateUntil, ListSmartLiveJobsRequest::setCreateUntil));
        builder.<String>withRequestField("room_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveJobsRequest::getRoomName, ListSmartLiveJobsRequest::setRoomName));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveJobsRequest::getAuthorization,
                ListSmartLiveJobsRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveJobsRequest::getXSdkDate, ListSmartLiveJobsRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveJobsRequest::getXProjectId, ListSmartLiveJobsRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveJobsRequest::getXAppUserId, ListSmartLiveJobsRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSmartLiveJobsResponse::getXRequestId, ListSmartLiveJobsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListSmartLiveRuleCommandsRequest, ListSmartLiveRuleCommandsResponse> listSmartLiveRuleCommands =
        genForListSmartLiveRuleCommands();

    private static HttpRequestDef<ListSmartLiveRuleCommandsRequest, ListSmartLiveRuleCommandsResponse> genForListSmartLiveRuleCommands() {
        // basic
        HttpRequestDef.Builder<ListSmartLiveRuleCommandsRequest, ListSmartLiveRuleCommandsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListSmartLiveRuleCommandsRequest.class,
                    ListSmartLiveRuleCommandsResponse.class)
                .withName("ListSmartLiveRuleCommands")
                .withUri("/v1/{project_id}/smart-live-command/rule-commands")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRuleCommandsRequest::getJobId,
                ListSmartLiveRuleCommandsRequest::setJobId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSmartLiveRuleCommandsRequest::getOffset,
                ListSmartLiveRuleCommandsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSmartLiveRuleCommandsRequest::getLimit,
                ListSmartLiveRuleCommandsRequest::setLimit));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRuleCommandsRequest::getAuthorization,
                ListSmartLiveRuleCommandsRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRuleCommandsRequest::getXSdkDate,
                ListSmartLiveRuleCommandsRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRuleCommandsRequest::getXProjectId,
                ListSmartLiveRuleCommandsRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRuleCommandsRequest::getXAppUserId,
                ListSmartLiveRuleCommandsRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSmartLiveRuleCommandsResponse::getXRequestId,
                ListSmartLiveRuleCommandsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListSmartLiveScriptCommandsRequest, ListSmartLiveScriptCommandsResponse> listSmartLiveScriptCommands =
        genForListSmartLiveScriptCommands();

    private static HttpRequestDef<ListSmartLiveScriptCommandsRequest, ListSmartLiveScriptCommandsResponse> genForListSmartLiveScriptCommands() {
        // basic
        HttpRequestDef.Builder<ListSmartLiveScriptCommandsRequest, ListSmartLiveScriptCommandsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListSmartLiveScriptCommandsRequest.class,
                    ListSmartLiveScriptCommandsResponse.class)
                .withName("ListSmartLiveScriptCommands")
                .withUri("/v1/{project_id}/smart-live-command/script-commands")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveScriptCommandsRequest::getJobId,
                ListSmartLiveScriptCommandsRequest::setJobId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSmartLiveScriptCommandsRequest::getOffset,
                ListSmartLiveScriptCommandsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSmartLiveScriptCommandsRequest::getLimit,
                ListSmartLiveScriptCommandsRequest::setLimit));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveScriptCommandsRequest::getAuthorization,
                ListSmartLiveScriptCommandsRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveScriptCommandsRequest::getXSdkDate,
                ListSmartLiveScriptCommandsRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveScriptCommandsRequest::getXProjectId,
                ListSmartLiveScriptCommandsRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveScriptCommandsRequest::getXAppUserId,
                ListSmartLiveScriptCommandsRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSmartLiveScriptCommandsResponse::getXRequestId,
                ListSmartLiveScriptCommandsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<LiveEventReportRequest, LiveEventReportResponse> liveEventReport =
        genForLiveEventReport();

    private static HttpRequestDef<LiveEventReportRequest, LiveEventReportResponse> genForLiveEventReport() {
        // basic
        HttpRequestDef.Builder<LiveEventReportRequest, LiveEventReportResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, LiveEventReportRequest.class, LiveEventReportResponse.class)
                .withName("LiveEventReport")
                .withUri("/v1/{project_id}/smart-live-rooms/{room_id}/smart-live-jobs/{job_id}/live-event-report")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("room_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(LiveEventReportRequest::getRoomId, LiveEventReportRequest::setRoomId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(LiveEventReportRequest::getJobId, LiveEventReportRequest::setJobId));
        builder.<String>withRequestField("auth_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(LiveEventReportRequest::getAuthKey, LiveEventReportRequest::setAuthKey));
        builder.<Long>withRequestField("expires_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(LiveEventReportRequest::getExpiresTime, LiveEventReportRequest::setExpiresTime));
        builder.<Boolean>withRequestField("refresh_url",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(LiveEventReportRequest::getRefreshUrl, LiveEventReportRequest::setRefreshUrl));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(LiveEventReportRequest::getAuthorization, LiveEventReportRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(LiveEventReportRequest::getXSdkDate, LiveEventReportRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(LiveEventReportRequest::getXProjectId, LiveEventReportRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(LiveEventReportRequest::getXAppUserId, LiveEventReportRequest::setXAppUserId));
        builder.<String>withRequestField("x-mss-auth-key",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(LiveEventReportRequest::getXMssAuthKey, LiveEventReportRequest::setXMssAuthKey));
        builder.<Long>withRequestField("x-mss-expires-time",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(LiveEventReportRequest::getXMssExpiresTime,
                LiveEventReportRequest::setXMssExpiresTime));
        builder.<ReportLiveEventReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReportLiveEventReq.class),
            f -> f.withMarshaller(LiveEventReportRequest::getBody, LiveEventReportRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(LiveEventReportResponse::getXRequestId, LiveEventReportResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowSmartLiveRequest, ShowSmartLiveResponse> showSmartLive =
        genForShowSmartLive();

    private static HttpRequestDef<ShowSmartLiveRequest, ShowSmartLiveResponse> genForShowSmartLive() {
        // basic
        HttpRequestDef.Builder<ShowSmartLiveRequest, ShowSmartLiveResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSmartLiveRequest.class, ShowSmartLiveResponse.class)
                .withName("ShowSmartLive")
                .withUri("/v1/{project_id}/smart-live-rooms/{room_id}/smart-live-jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("room_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSmartLiveRequest::getRoomId, ShowSmartLiveRequest::setRoomId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSmartLiveRequest::getJobId, ShowSmartLiveRequest::setJobId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSmartLiveRequest::getAuthorization, ShowSmartLiveRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSmartLiveRequest::getXSdkDate, ShowSmartLiveRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSmartLiveRequest::getXProjectId, ShowSmartLiveRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSmartLiveRequest::getXAppUserId, ShowSmartLiveRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowSmartLiveResponse::getXRequestId, ShowSmartLiveResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<StartSmartLiveRequest, StartSmartLiveResponse> startSmartLive =
        genForStartSmartLive();

    private static HttpRequestDef<StartSmartLiveRequest, StartSmartLiveResponse> genForStartSmartLive() {
        // basic
        HttpRequestDef.Builder<StartSmartLiveRequest, StartSmartLiveResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartSmartLiveRequest.class, StartSmartLiveResponse.class)
                .withName("StartSmartLive")
                .withUri("/v1/{project_id}/smart-live-rooms/{room_id}/smart-live-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("room_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartSmartLiveRequest::getRoomId, StartSmartLiveRequest::setRoomId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartSmartLiveRequest::getAuthorization, StartSmartLiveRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartSmartLiveRequest::getXSdkDate, StartSmartLiveRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartSmartLiveRequest::getXProjectId, StartSmartLiveRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartSmartLiveRequest::getXAppUserId, StartSmartLiveRequest::setXAppUserId));
        builder.<StartSmartLiveReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartSmartLiveReq.class),
            f -> f.withMarshaller(StartSmartLiveRequest::getBody, StartSmartLiveRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StartSmartLiveResponse::getXRequestId, StartSmartLiveResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<StopSmartLiveRequest, StopSmartLiveResponse> stopSmartLive =
        genForStopSmartLive();

    private static HttpRequestDef<StopSmartLiveRequest, StopSmartLiveResponse> genForStopSmartLive() {
        // basic
        HttpRequestDef.Builder<StopSmartLiveRequest, StopSmartLiveResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopSmartLiveRequest.class, StopSmartLiveResponse.class)
                .withName("StopSmartLive")
                .withUri("/v1/{project_id}/smart-live-rooms/{room_id}/smart-live-jobs/{job_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("room_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopSmartLiveRequest::getRoomId, StopSmartLiveRequest::setRoomId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopSmartLiveRequest::getJobId, StopSmartLiveRequest::setJobId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopSmartLiveRequest::getAuthorization, StopSmartLiveRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopSmartLiveRequest::getXSdkDate, StopSmartLiveRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopSmartLiveRequest::getXProjectId, StopSmartLiveRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopSmartLiveRequest::getXAppUserId, StopSmartLiveRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StopSmartLiveResponse::getXRequestId, StopSmartLiveResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ConfirmSmarLiveRoomRequest, ConfirmSmarLiveRoomResponse> confirmSmarLiveRoom =
        genForConfirmSmarLiveRoom();

    private static HttpRequestDef<ConfirmSmarLiveRoomRequest, ConfirmSmarLiveRoomResponse> genForConfirmSmarLiveRoom() {
        // basic
        HttpRequestDef.Builder<ConfirmSmarLiveRoomRequest, ConfirmSmarLiveRoomResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ConfirmSmarLiveRoomRequest.class, ConfirmSmarLiveRoomResponse.class)
                .withName("ConfirmSmarLiveRoom")
                .withUri("/v1/{project_id}/smart-live-rooms/{room_id}/confirm")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("room_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmSmarLiveRoomRequest::getRoomId, ConfirmSmarLiveRoomRequest::setRoomId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmSmarLiveRoomRequest::getAuthorization,
                ConfirmSmarLiveRoomRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmSmarLiveRoomRequest::getXSdkDate, ConfirmSmarLiveRoomRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmSmarLiveRoomRequest::getXProjectId,
                ConfirmSmarLiveRoomRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmSmarLiveRoomRequest::getXAppUserId,
                ConfirmSmarLiveRoomRequest::setXAppUserId));
        builder.<ConfirmSmarLiveRoomReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConfirmSmarLiveRoomReq.class),
            f -> f.withMarshaller(ConfirmSmarLiveRoomRequest::getBody, ConfirmSmarLiveRoomRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ConfirmSmarLiveRoomResponse::getXRequestId,
                ConfirmSmarLiveRoomResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateSmartLiveRoomRequest, CreateSmartLiveRoomResponse> createSmartLiveRoom =
        genForCreateSmartLiveRoom();

    private static HttpRequestDef<CreateSmartLiveRoomRequest, CreateSmartLiveRoomResponse> genForCreateSmartLiveRoom() {
        // basic
        HttpRequestDef.Builder<CreateSmartLiveRoomRequest, CreateSmartLiveRoomResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSmartLiveRoomRequest.class, CreateSmartLiveRoomResponse.class)
                .withName("CreateSmartLiveRoom")
                .withUri("/v1/{project_id}/smart-live-rooms")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSmartLiveRoomRequest::getAuthorization,
                CreateSmartLiveRoomRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSmartLiveRoomRequest::getXSdkDate, CreateSmartLiveRoomRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSmartLiveRoomRequest::getXProjectId,
                CreateSmartLiveRoomRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSmartLiveRoomRequest::getXAppUserId,
                CreateSmartLiveRoomRequest::setXAppUserId));
        builder.<CreateSmartLiveRoomReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSmartLiveRoomReq.class),
            f -> f.withMarshaller(CreateSmartLiveRoomRequest::getBody, CreateSmartLiveRoomRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateSmartLiveRoomResponse::getXRequestId,
                CreateSmartLiveRoomResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteSmartLiveRoomRequest, DeleteSmartLiveRoomResponse> deleteSmartLiveRoom =
        genForDeleteSmartLiveRoom();

    private static HttpRequestDef<DeleteSmartLiveRoomRequest, DeleteSmartLiveRoomResponse> genForDeleteSmartLiveRoom() {
        // basic
        HttpRequestDef.Builder<DeleteSmartLiveRoomRequest, DeleteSmartLiveRoomResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteSmartLiveRoomRequest.class, DeleteSmartLiveRoomResponse.class)
            .withName("DeleteSmartLiveRoom")
            .withUri("/v1/{project_id}/smart-live-rooms/{room_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("room_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSmartLiveRoomRequest::getRoomId, DeleteSmartLiveRoomRequest::setRoomId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSmartLiveRoomRequest::getAuthorization,
                DeleteSmartLiveRoomRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSmartLiveRoomRequest::getXSdkDate, DeleteSmartLiveRoomRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSmartLiveRoomRequest::getXProjectId,
                DeleteSmartLiveRoomRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSmartLiveRoomRequest::getXAppUserId,
                DeleteSmartLiveRoomRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteSmartLiveRoomResponse::getXRequestId,
                DeleteSmartLiveRoomResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListSmartLiveRoomsRequest, ListSmartLiveRoomsResponse> listSmartLiveRooms =
        genForListSmartLiveRooms();

    private static HttpRequestDef<ListSmartLiveRoomsRequest, ListSmartLiveRoomsResponse> genForListSmartLiveRooms() {
        // basic
        HttpRequestDef.Builder<ListSmartLiveRoomsRequest, ListSmartLiveRoomsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSmartLiveRoomsRequest.class, ListSmartLiveRoomsResponse.class)
                .withName("ListSmartLiveRooms")
                .withUri("/v1/{project_id}/smart-live-rooms")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSmartLiveRoomsRequest::getOffset, ListSmartLiveRoomsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSmartLiveRoomsRequest::getLimit, ListSmartLiveRoomsRequest::setLimit));
        builder.<String>withRequestField("room_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRoomsRequest::getRoomName, ListSmartLiveRoomsRequest::setRoomName));
        builder.<String>withRequestField("dh_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRoomsRequest::getDhId, ListSmartLiveRoomsRequest::setDhId));
        builder.<String>withRequestField("model_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRoomsRequest::getModelName, ListSmartLiveRoomsRequest::setModelName));
        builder.<String>withRequestField("live_state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRoomsRequest::getLiveState, ListSmartLiveRoomsRequest::setLiveState));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRoomsRequest::getStartTime, ListSmartLiveRoomsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRoomsRequest::getEndTime, ListSmartLiveRoomsRequest::setEndTime));
        builder.<String>withRequestField("room_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRoomsRequest::getRoomType, ListSmartLiveRoomsRequest::setRoomType));
        builder.<String>withRequestField("template_own_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRoomsRequest::getTemplateOwnType,
                ListSmartLiveRoomsRequest::setTemplateOwnType));
        builder.<String>withRequestField("confirm_state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRoomsRequest::getConfirmState,
                ListSmartLiveRoomsRequest::setConfirmState));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRoomsRequest::getAuthorization,
                ListSmartLiveRoomsRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRoomsRequest::getXSdkDate, ListSmartLiveRoomsRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRoomsRequest::getXProjectId, ListSmartLiveRoomsRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRoomsRequest::getXAppUserId, ListSmartLiveRoomsRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSmartLiveRoomsResponse::getXRequestId,
                ListSmartLiveRoomsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowSmartLiveRoomRequest, ShowSmartLiveRoomResponse> showSmartLiveRoom =
        genForShowSmartLiveRoom();

    private static HttpRequestDef<ShowSmartLiveRoomRequest, ShowSmartLiveRoomResponse> genForShowSmartLiveRoom() {
        // basic
        HttpRequestDef.Builder<ShowSmartLiveRoomRequest, ShowSmartLiveRoomResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSmartLiveRoomRequest.class, ShowSmartLiveRoomResponse.class)
                .withName("ShowSmartLiveRoom")
                .withUri("/v1/{project_id}/smart-live-rooms/{room_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("room_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSmartLiveRoomRequest::getRoomId, ShowSmartLiveRoomRequest::setRoomId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSmartLiveRoomRequest::getAuthorization,
                ShowSmartLiveRoomRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSmartLiveRoomRequest::getXSdkDate, ShowSmartLiveRoomRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSmartLiveRoomRequest::getXProjectId, ShowSmartLiveRoomRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSmartLiveRoomRequest::getXAppUserId, ShowSmartLiveRoomRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowSmartLiveRoomResponse::getXRequestId, ShowSmartLiveRoomResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateSmartLiveRoomRequest, UpdateSmartLiveRoomResponse> updateSmartLiveRoom =
        genForUpdateSmartLiveRoom();

    private static HttpRequestDef<UpdateSmartLiveRoomRequest, UpdateSmartLiveRoomResponse> genForUpdateSmartLiveRoom() {
        // basic
        HttpRequestDef.Builder<UpdateSmartLiveRoomRequest, UpdateSmartLiveRoomResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSmartLiveRoomRequest.class, UpdateSmartLiveRoomResponse.class)
                .withName("UpdateSmartLiveRoom")
                .withUri("/v1/{project_id}/smart-live-rooms/{room_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("room_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSmartLiveRoomRequest::getRoomId, UpdateSmartLiveRoomRequest::setRoomId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSmartLiveRoomRequest::getAuthorization,
                UpdateSmartLiveRoomRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSmartLiveRoomRequest::getXSdkDate, UpdateSmartLiveRoomRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSmartLiveRoomRequest::getXProjectId,
                UpdateSmartLiveRoomRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSmartLiveRoomRequest::getXAppUserId,
                UpdateSmartLiveRoomRequest::setXAppUserId));
        builder.<CreateSmartLiveRoomReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSmartLiveRoomReq.class),
            f -> f.withMarshaller(UpdateSmartLiveRoomRequest::getBody, UpdateSmartLiveRoomRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateSmartLiveRoomResponse::getXRequestId,
                UpdateSmartLiveRoomResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListStylesRequest, ListStylesResponse> listStyles = genForListStyles();

    private static HttpRequestDef<ListStylesRequest, ListStylesResponse> genForListStyles() {
        // basic
        HttpRequestDef.Builder<ListStylesRequest, ListStylesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStylesRequest.class, ListStylesResponse.class)
                .withName("ListStyles")
                .withUri("/v1/{project_id}/styles")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStylesRequest::getOffset, ListStylesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStylesRequest::getLimit, ListStylesRequest::setLimit));
        builder.<String>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStylesRequest::getState, ListStylesRequest::setState));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStylesRequest::getSortKey, ListStylesRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStylesRequest::getSortDir, ListStylesRequest::setSortDir));
        builder.<String>withRequestField("create_until",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStylesRequest::getCreateUntil, ListStylesRequest::setCreateUntil));
        builder.<String>withRequestField("create_since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStylesRequest::getCreateSince, ListStylesRequest::setCreateSince));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStylesRequest::getAuthorization, ListStylesRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStylesRequest::getXSdkDate, ListStylesRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStylesRequest::getXProjectId, ListStylesRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStylesRequest::getXAppUserId, ListStylesRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListStylesResponse::getXRequestId, ListStylesResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateSubtitleFileRequest, CreateSubtitleFileResponse> createSubtitleFile =
        genForCreateSubtitleFile();

    private static HttpRequestDef<CreateSubtitleFileRequest, CreateSubtitleFileResponse> genForCreateSubtitleFile() {
        // basic
        HttpRequestDef.Builder<CreateSubtitleFileRequest, CreateSubtitleFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSubtitleFileRequest.class, CreateSubtitleFileResponse.class)
                .withName("CreateSubtitleFile")
                .withUri("/v1/{project_id}/subtitle-files")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSubtitleFileRequest::getAuthorization,
                CreateSubtitleFileRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSubtitleFileRequest::getXSdkDate, CreateSubtitleFileRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSubtitleFileRequest::getXProjectId, CreateSubtitleFileRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSubtitleFileRequest::getXAppUserId, CreateSubtitleFileRequest::setXAppUserId));
        builder.<CreateSubtitleFileReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSubtitleFileReq.class),
            f -> f.withMarshaller(CreateSubtitleFileRequest::getBody, CreateSubtitleFileRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateSubtitleFileResponse::getXRequestId,
                CreateSubtitleFileResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowSubtitleFileRequest, ShowSubtitleFileResponse> showSubtitleFile =
        genForShowSubtitleFile();

    private static HttpRequestDef<ShowSubtitleFileRequest, ShowSubtitleFileResponse> genForShowSubtitleFile() {
        // basic
        HttpRequestDef.Builder<ShowSubtitleFileRequest, ShowSubtitleFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSubtitleFileRequest.class, ShowSubtitleFileResponse.class)
                .withName("ShowSubtitleFile")
                .withUri("/v1/{project_id}/subtitle-files/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSubtitleFileRequest::getJobId, ShowSubtitleFileRequest::setJobId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSubtitleFileRequest::getAuthorization,
                ShowSubtitleFileRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSubtitleFileRequest::getXSdkDate, ShowSubtitleFileRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSubtitleFileRequest::getXProjectId, ShowSubtitleFileRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSubtitleFileRequest::getXAppUserId, ShowSubtitleFileRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowSubtitleFileResponse::getXRequestId, ShowSubtitleFileResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CountTenantResourcesRequest, CountTenantResourcesResponse> countTenantResources =
        genForCountTenantResources();

    private static HttpRequestDef<CountTenantResourcesRequest, CountTenantResourcesResponse> genForCountTenantResources() {
        // basic
        HttpRequestDef.Builder<CountTenantResourcesRequest, CountTenantResourcesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, CountTenantResourcesRequest.class, CountTenantResourcesResponse.class)
            .withName("CountTenantResources")
            .withUri("/v1/{project_id}/tenants/resources-count")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("business",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountTenantResourcesRequest::getBusiness, CountTenantResourcesRequest::setBusiness));
        builder.<String>withRequestField("resource_expire_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountTenantResourcesRequest::getResourceExpireStartTime,
                CountTenantResourcesRequest::setResourceExpireStartTime));
        builder.<String>withRequestField("resource_expire_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountTenantResourcesRequest::getResourceExpireEndTime,
                CountTenantResourcesRequest::setResourceExpireEndTime));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountTenantResourcesRequest::getAuthorization,
                CountTenantResourcesRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountTenantResourcesRequest::getXSdkDate, CountTenantResourcesRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountTenantResourcesRequest::getXProjectId,
                CountTenantResourcesRequest::setXProjectId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CountTenantResourcesResponse::getXRequestId,
                CountTenantResourcesResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListTenantResourcesRequest, ListTenantResourcesResponse> listTenantResources =
        genForListTenantResources();

    private static HttpRequestDef<ListTenantResourcesRequest, ListTenantResourcesResponse> genForListTenantResources() {
        // basic
        HttpRequestDef.Builder<ListTenantResourcesRequest, ListTenantResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTenantResourcesRequest.class, ListTenantResourcesResponse.class)
                .withName("ListTenantResources")
                .withUri("/v1/{project_id}/tenants/resources")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTenantResourcesRequest::getLimit, ListTenantResourcesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTenantResourcesRequest::getOffset, ListTenantResourcesRequest::setOffset));
        builder.<String>withRequestField("resource",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTenantResourcesRequest::getResource, ListTenantResourcesRequest::setResource));
        builder.<String>withRequestField("business",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTenantResourcesRequest::getBusiness, ListTenantResourcesRequest::setBusiness));
        builder.<String>withRequestField("resource_source",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTenantResourcesRequest::getResourceSource,
                ListTenantResourcesRequest::setResourceSource));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTenantResourcesRequest::getResourceId,
                ListTenantResourcesRequest::setResourceId));
        builder.<String>withRequestField("order_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTenantResourcesRequest::getOrderId, ListTenantResourcesRequest::setOrderId));
        builder.<String>withRequestField("charging_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTenantResourcesRequest::getChargingMode,
                ListTenantResourcesRequest::setChargingMode));
        builder.<String>withRequestField("resource_expire_start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTenantResourcesRequest::getResourceExpireStartTime,
                ListTenantResourcesRequest::setResourceExpireStartTime));
        builder.<String>withRequestField("resource_expire_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTenantResourcesRequest::getResourceExpireEndTime,
                ListTenantResourcesRequest::setResourceExpireEndTime));
        builder.<String>withRequestField("sub_resource",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTenantResourcesRequest::getSubResource,
                ListTenantResourcesRequest::setSubResource));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTenantResourcesRequest::getStatus, ListTenantResourcesRequest::setStatus));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTenantResourcesRequest::getAuthorization,
                ListTenantResourcesRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTenantResourcesRequest::getXSdkDate, ListTenantResourcesRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTenantResourcesRequest::getXProjectId,
                ListTenantResourcesRequest::setXProjectId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTenantResourcesResponse::getXRequestId,
                ListTenantResourcesResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceUsageRequest, ShowResourceUsageResponse> showResourceUsage =
        genForShowResourceUsage();

    private static HttpRequestDef<ShowResourceUsageRequest, ShowResourceUsageResponse> genForShowResourceUsage() {
        // basic
        HttpRequestDef.Builder<ShowResourceUsageRequest, ShowResourceUsageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResourceUsageRequest.class, ShowResourceUsageResponse.class)
                .withName("ShowResourceUsage")
                .withUri("/v1/{project_id}/tenants/resources-usage")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceUsageRequest::getResource, ShowResourceUsageRequest::setResource));
        builder.<String>withRequestField("business",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceUsageRequest::getBusiness, ShowResourceUsageRequest::setBusiness));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceUsageRequest::getAuthorization,
                ShowResourceUsageRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceUsageRequest::getXSdkDate, ShowResourceUsageRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceUsageRequest::getXProjectId, ShowResourceUsageRequest::setXProjectId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowResourceUsageResponse::getXRequestId, ShowResourceUsageResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CommitVoiceTrainingJobRequest, CommitVoiceTrainingJobResponse> commitVoiceTrainingJob =
        genForCommitVoiceTrainingJob();

    private static HttpRequestDef<CommitVoiceTrainingJobRequest, CommitVoiceTrainingJobResponse> genForCommitVoiceTrainingJob() {
        // basic
        HttpRequestDef.Builder<CommitVoiceTrainingJobRequest, CommitVoiceTrainingJobResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CommitVoiceTrainingJobRequest.class, CommitVoiceTrainingJobResponse.class)
            .withName("CommitVoiceTrainingJob")
            .withUri("/v1/{project_id}/voice-training-manage/user/jobs/{job_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CommitVoiceTrainingJobRequest::getJobId, CommitVoiceTrainingJobRequest::setJobId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CommitVoiceTrainingJobRequest::getAuthorization,
                CommitVoiceTrainingJobRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CommitVoiceTrainingJobRequest::getXSdkDate,
                CommitVoiceTrainingJobRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CommitVoiceTrainingJobRequest::getXProjectId,
                CommitVoiceTrainingJobRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CommitVoiceTrainingJobRequest::getXAppUserId,
                CommitVoiceTrainingJobRequest::setXAppUserId));
        builder.<CommitJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CommitJobReq.class),
            f -> f.withMarshaller(CommitVoiceTrainingJobRequest::getBody, CommitVoiceTrainingJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ConfirmTrainingSegmentRequest, ConfirmTrainingSegmentResponse> confirmTrainingSegment =
        genForConfirmTrainingSegment();

    private static HttpRequestDef<ConfirmTrainingSegmentRequest, ConfirmTrainingSegmentResponse> genForConfirmTrainingSegment() {
        // basic
        HttpRequestDef.Builder<ConfirmTrainingSegmentRequest, ConfirmTrainingSegmentResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ConfirmTrainingSegmentRequest.class, ConfirmTrainingSegmentResponse.class)
            .withName("ConfirmTrainingSegment")
            .withUri("/v1/{project_id}/voice-training-manage/user/training-segment")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmTrainingSegmentRequest::getJobId, ConfirmTrainingSegmentRequest::setJobId));
        builder.<Integer>withRequestField("index",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ConfirmTrainingSegmentRequest::getIndex, ConfirmTrainingSegmentRequest::setIndex));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTrainingAdvanceJobRequest, CreateTrainingAdvanceJobResponse> createTrainingAdvanceJob =
        genForCreateTrainingAdvanceJob();

    private static HttpRequestDef<CreateTrainingAdvanceJobRequest, CreateTrainingAdvanceJobResponse> genForCreateTrainingAdvanceJob() {
        // basic
        HttpRequestDef.Builder<CreateTrainingAdvanceJobRequest, CreateTrainingAdvanceJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateTrainingAdvanceJobRequest.class, CreateTrainingAdvanceJobResponse.class)
                .withName("CreateTrainingAdvanceJob")
                .withUri("/v1/{project_id}/voice-training-manage/user/advance-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTrainingAdvanceJobRequest::getXAppUserId,
                CreateTrainingAdvanceJobRequest::setXAppUserId));
        builder.<CreateTrainingJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTrainingJobReq.class),
            f -> f.withMarshaller(CreateTrainingAdvanceJobRequest::getBody, CreateTrainingAdvanceJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTrainingBasicJobRequest, CreateTrainingBasicJobResponse> createTrainingBasicJob =
        genForCreateTrainingBasicJob();

    private static HttpRequestDef<CreateTrainingBasicJobRequest, CreateTrainingBasicJobResponse> genForCreateTrainingBasicJob() {
        // basic
        HttpRequestDef.Builder<CreateTrainingBasicJobRequest, CreateTrainingBasicJobResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateTrainingBasicJobRequest.class, CreateTrainingBasicJobResponse.class)
            .withName("CreateTrainingBasicJob")
            .withUri("/v1/{project_id}/voice-training-manage/user/basic-jobs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTrainingBasicJobRequest::getAuthorization,
                CreateTrainingBasicJobRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTrainingBasicJobRequest::getXSdkDate,
                CreateTrainingBasicJobRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTrainingBasicJobRequest::getXProjectId,
                CreateTrainingBasicJobRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTrainingBasicJobRequest::getXAppUserId,
                CreateTrainingBasicJobRequest::setXAppUserId));
        builder.<CreateTrainingJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTrainingJobReq.class),
            f -> f.withMarshaller(CreateTrainingBasicJobRequest::getBody, CreateTrainingBasicJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTrainingMiddleJobRequest, CreateTrainingMiddleJobResponse> createTrainingMiddleJob =
        genForCreateTrainingMiddleJob();

    private static HttpRequestDef<CreateTrainingMiddleJobRequest, CreateTrainingMiddleJobResponse> genForCreateTrainingMiddleJob() {
        // basic
        HttpRequestDef.Builder<CreateTrainingMiddleJobRequest, CreateTrainingMiddleJobResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateTrainingMiddleJobRequest.class, CreateTrainingMiddleJobResponse.class)
            .withName("CreateTrainingMiddleJob")
            .withUri("/v1/{project_id}/voice-training-manage/user/middle-jobs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTrainingMiddleJobRequest::getAuthorization,
                CreateTrainingMiddleJobRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTrainingMiddleJobRequest::getXSdkDate,
                CreateTrainingMiddleJobRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTrainingMiddleJobRequest::getXProjectId,
                CreateTrainingMiddleJobRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTrainingMiddleJobRequest::getXAppUserId,
                CreateTrainingMiddleJobRequest::setXAppUserId));
        builder.<CreateTrainingJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTrainingJobReq.class),
            f -> f.withMarshaller(CreateTrainingMiddleJobRequest::getBody, CreateTrainingMiddleJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVoiceTrainingJobRequest, DeleteVoiceTrainingJobResponse> deleteVoiceTrainingJob =
        genForDeleteVoiceTrainingJob();

    private static HttpRequestDef<DeleteVoiceTrainingJobRequest, DeleteVoiceTrainingJobResponse> genForDeleteVoiceTrainingJob() {
        // basic
        HttpRequestDef.Builder<DeleteVoiceTrainingJobRequest, DeleteVoiceTrainingJobResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteVoiceTrainingJobRequest.class, DeleteVoiceTrainingJobResponse.class)
            .withName("DeleteVoiceTrainingJob")
            .withUri("/v1/{project_id}/voice-training-manage/user/jobs/{job_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVoiceTrainingJobRequest::getJobId, DeleteVoiceTrainingJobRequest::setJobId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVoiceTrainingJobRequest::getAuthorization,
                DeleteVoiceTrainingJobRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVoiceTrainingJobRequest::getXSdkDate,
                DeleteVoiceTrainingJobRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVoiceTrainingJobRequest::getXProjectId,
                DeleteVoiceTrainingJobRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVoiceTrainingJobRequest::getXAppUserId,
                DeleteVoiceTrainingJobRequest::setXAppUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobOperationLogRequest, ListJobOperationLogResponse> listJobOperationLog =
        genForListJobOperationLog();

    private static HttpRequestDef<ListJobOperationLogRequest, ListJobOperationLogResponse> genForListJobOperationLog() {
        // basic
        HttpRequestDef.Builder<ListJobOperationLogRequest, ListJobOperationLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListJobOperationLogRequest.class, ListJobOperationLogResponse.class)
                .withName("ListJobOperationLog")
                .withUri("/v1/{project_id}/voice-training-manage/user/jobs/{job_id}/op-logs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobOperationLogRequest::getJobId, ListJobOperationLogRequest::setJobId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobOperationLogRequest::getOffset, ListJobOperationLogRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListJobOperationLogRequest::getLimit, ListJobOperationLogRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVoiceTrainingJobRequest, ListVoiceTrainingJobResponse> listVoiceTrainingJob =
        genForListVoiceTrainingJob();

    private static HttpRequestDef<ListVoiceTrainingJobRequest, ListVoiceTrainingJobResponse> genForListVoiceTrainingJob() {
        // basic
        HttpRequestDef.Builder<ListVoiceTrainingJobRequest, ListVoiceTrainingJobResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListVoiceTrainingJobRequest.class, ListVoiceTrainingJobResponse.class)
            .withName("ListVoiceTrainingJob")
            .withUri("/v1/{project_id}/voice-training-manage/user/jobs")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVoiceTrainingJobRequest::getOffset, ListVoiceTrainingJobRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVoiceTrainingJobRequest::getLimit, ListVoiceTrainingJobRequest::setLimit));
        builder.<String>withRequestField("create_until",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVoiceTrainingJobRequest::getCreateUntil,
                ListVoiceTrainingJobRequest::setCreateUntil));
        builder.<String>withRequestField("create_since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVoiceTrainingJobRequest::getCreateSince,
                ListVoiceTrainingJobRequest::setCreateSince));
        builder.<String>withRequestField("update_until",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVoiceTrainingJobRequest::getUpdateUntil,
                ListVoiceTrainingJobRequest::setUpdateUntil));
        builder.<String>withRequestField("update_since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVoiceTrainingJobRequest::getUpdateSince,
                ListVoiceTrainingJobRequest::setUpdateSince));
        builder.<String>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVoiceTrainingJobRequest::getState, ListVoiceTrainingJobRequest::setState));
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVoiceTrainingJobRequest::getJobId, ListVoiceTrainingJobRequest::setJobId));
        builder.<String>withRequestField("voice_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVoiceTrainingJobRequest::getVoiceName,
                ListVoiceTrainingJobRequest::setVoiceName));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVoiceTrainingJobRequest::getTag, ListVoiceTrainingJobRequest::setTag));
        builder.<String>withRequestField("job_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVoiceTrainingJobRequest::getJobType, ListVoiceTrainingJobRequest::setJobType));
        builder.<String>withRequestField("batch_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVoiceTrainingJobRequest::getBatchName,
                ListVoiceTrainingJobRequest::setBatchName));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVoiceTrainingJobRequest::getSortKey, ListVoiceTrainingJobRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVoiceTrainingJobRequest::getSortDir, ListVoiceTrainingJobRequest::setSortDir));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVoiceTrainingJobRequest::getXAppUserId,
                ListVoiceTrainingJobRequest::setXAppUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetJobBatchNameRequest, SetJobBatchNameResponse> setJobBatchName =
        genForSetJobBatchName();

    private static HttpRequestDef<SetJobBatchNameRequest, SetJobBatchNameResponse> genForSetJobBatchName() {
        // basic
        HttpRequestDef.Builder<SetJobBatchNameRequest, SetJobBatchNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetJobBatchNameRequest.class, SetJobBatchNameResponse.class)
                .withName("SetJobBatchName")
                .withUri("/v1/{project_id}/voice-training-manage/user/batch")
                .withContentType("application/json");

        // requests
        builder.<SetJobBatchNameReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetJobBatchNameReq.class),
            f -> f.withMarshaller(SetJobBatchNameRequest::getBody, SetJobBatchNameRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobAuditResultRequest, ShowJobAuditResultResponse> showJobAuditResult =
        genForShowJobAuditResult();

    private static HttpRequestDef<ShowJobAuditResultRequest, ShowJobAuditResultResponse> genForShowJobAuditResult() {
        // basic
        HttpRequestDef.Builder<ShowJobAuditResultRequest, ShowJobAuditResultResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobAuditResultRequest.class, ShowJobAuditResultResponse.class)
                .withName("ShowJobAuditResult")
                .withUri("/v1/{project_id}/voice-training-manage/user/jobs/{job_id}/audit-result")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobAuditResultRequest::getJobId, ShowJobAuditResultRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobUploadingAddressRequest, ShowJobUploadingAddressResponse> showJobUploadingAddress =
        genForShowJobUploadingAddress();

    private static HttpRequestDef<ShowJobUploadingAddressRequest, ShowJobUploadingAddressResponse> genForShowJobUploadingAddress() {
        // basic
        HttpRequestDef.Builder<ShowJobUploadingAddressRequest, ShowJobUploadingAddressResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowJobUploadingAddressRequest.class, ShowJobUploadingAddressResponse.class)
            .withName("ShowJobUploadingAddress")
            .withUri("/v1/{project_id}/voice-training-manage/user/jobs/{job_id}/uploading-address-url")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobUploadingAddressRequest::getJobId, ShowJobUploadingAddressRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTenantDurationCfgRequest, ShowTenantDurationCfgResponse> showTenantDurationCfg =
        genForShowTenantDurationCfg();

    private static HttpRequestDef<ShowTenantDurationCfgRequest, ShowTenantDurationCfgResponse> genForShowTenantDurationCfg() {
        // basic
        HttpRequestDef.Builder<ShowTenantDurationCfgRequest, ShowTenantDurationCfgResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowTenantDurationCfgRequest.class, ShowTenantDurationCfgResponse.class)
            .withName("ShowTenantDurationCfg")
            .withUri("/v1/{project_id}/voice-training-manage/user/tenant-duration-cfg")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTrainingSegmentInfoRequest, ShowTrainingSegmentInfoResponse> showTrainingSegmentInfo =
        genForShowTrainingSegmentInfo();

    private static HttpRequestDef<ShowTrainingSegmentInfoRequest, ShowTrainingSegmentInfoResponse> genForShowTrainingSegmentInfo() {
        // basic
        HttpRequestDef.Builder<ShowTrainingSegmentInfoRequest, ShowTrainingSegmentInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowTrainingSegmentInfoRequest.class, ShowTrainingSegmentInfoResponse.class)
            .withName("ShowTrainingSegmentInfo")
            .withUri("/v1/{project_id}/voice-training-manage/user/training-segment")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTrainingSegmentInfoRequest::getJobId, ShowTrainingSegmentInfoRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVoiceTrainingJobRequest, ShowVoiceTrainingJobResponse> showVoiceTrainingJob =
        genForShowVoiceTrainingJob();

    private static HttpRequestDef<ShowVoiceTrainingJobRequest, ShowVoiceTrainingJobResponse> genForShowVoiceTrainingJob() {
        // basic
        HttpRequestDef.Builder<ShowVoiceTrainingJobRequest, ShowVoiceTrainingJobResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowVoiceTrainingJobRequest.class, ShowVoiceTrainingJobResponse.class)
            .withName("ShowVoiceTrainingJob")
            .withUri("/v1/{project_id}/voice-training-manage/user/jobs/{job_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVoiceTrainingJobRequest::getJobId, ShowVoiceTrainingJobRequest::setJobId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVoiceTrainingJobRequest::getAuthorization,
                ShowVoiceTrainingJobRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVoiceTrainingJobRequest::getXSdkDate, ShowVoiceTrainingJobRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVoiceTrainingJobRequest::getXProjectId,
                ShowVoiceTrainingJobRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVoiceTrainingJobRequest::getXAppUserId,
                ShowVoiceTrainingJobRequest::setXAppUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<Create2dModelTrainingJobRequest, Create2dModelTrainingJobResponse> create2dModelTrainingJob =
        genForCreate2dModelTrainingJob();

    private static HttpRequestDef<Create2dModelTrainingJobRequest, Create2dModelTrainingJobResponse> genForCreate2dModelTrainingJob() {
        // basic
        HttpRequestDef.Builder<Create2dModelTrainingJobRequest, Create2dModelTrainingJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, Create2dModelTrainingJobRequest.class, Create2dModelTrainingJobResponse.class)
                .withName("Create2dModelTrainingJob")
                .withUri("/v1/{project_id}/digital-human-training-manage/user/jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Create2dModelTrainingJobRequest::getAuthorization,
                Create2dModelTrainingJobRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Create2dModelTrainingJobRequest::getXSdkDate,
                Create2dModelTrainingJobRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Create2dModelTrainingJobRequest::getXProjectId,
                Create2dModelTrainingJobRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Create2dModelTrainingJobRequest::getXAppUserId,
                Create2dModelTrainingJobRequest::setXAppUserId));
        builder.<Create2dModelTrainingJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Create2dModelTrainingJobReq.class),
            f -> f.withMarshaller(Create2dModelTrainingJobRequest::getBody, Create2dModelTrainingJobRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(Create2dModelTrainingJobResponse::getXRequestId,
                Create2dModelTrainingJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<Delete2dModelTrainingJobRequest, Delete2dModelTrainingJobResponse> delete2dModelTrainingJob =
        genForDelete2dModelTrainingJob();

    private static HttpRequestDef<Delete2dModelTrainingJobRequest, Delete2dModelTrainingJobResponse> genForDelete2dModelTrainingJob() {
        // basic
        HttpRequestDef.Builder<Delete2dModelTrainingJobRequest, Delete2dModelTrainingJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    Delete2dModelTrainingJobRequest.class,
                    Delete2dModelTrainingJobResponse.class)
                .withName("Delete2dModelTrainingJob")
                .withUri("/v1/{project_id}/digital-human-training-manage/user/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Delete2dModelTrainingJobRequest::getJobId,
                Delete2dModelTrainingJobRequest::setJobId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Delete2dModelTrainingJobRequest::getAuthorization,
                Delete2dModelTrainingJobRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Delete2dModelTrainingJobRequest::getXSdkDate,
                Delete2dModelTrainingJobRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Delete2dModelTrainingJobRequest::getXProjectId,
                Delete2dModelTrainingJobRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Delete2dModelTrainingJobRequest::getXAppUserId,
                Delete2dModelTrainingJobRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(Delete2dModelTrainingJobResponse::getXRequestId,
                Delete2dModelTrainingJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<Execute2dModelTrainingCommandByUserRequest, Execute2dModelTrainingCommandByUserResponse> execute2dModelTrainingCommandByUser =
        genForExecute2dModelTrainingCommandByUser();

    private static HttpRequestDef<Execute2dModelTrainingCommandByUserRequest, Execute2dModelTrainingCommandByUserResponse> genForExecute2dModelTrainingCommandByUser() {
        // basic
        HttpRequestDef.Builder<Execute2dModelTrainingCommandByUserRequest, Execute2dModelTrainingCommandByUserResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    Execute2dModelTrainingCommandByUserRequest.class,
                    Execute2dModelTrainingCommandByUserResponse.class)
                .withName("Execute2dModelTrainingCommandByUser")
                .withUri("/v1/{project_id}/digital-human-training-manage/user/jobs/{job_id}/command")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Execute2dModelTrainingCommandByUserRequest::getJobId,
                Execute2dModelTrainingCommandByUserRequest::setJobId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Execute2dModelTrainingCommandByUserRequest::getAuthorization,
                Execute2dModelTrainingCommandByUserRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Execute2dModelTrainingCommandByUserRequest::getXSdkDate,
                Execute2dModelTrainingCommandByUserRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Execute2dModelTrainingCommandByUserRequest::getXProjectId,
                Execute2dModelTrainingCommandByUserRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Execute2dModelTrainingCommandByUserRequest::getXAppUserId,
                Execute2dModelTrainingCommandByUserRequest::setXAppUserId));
        builder.<Execute2dModelTrainingCommandByUserReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Execute2dModelTrainingCommandByUserReq.class),
            f -> f.withMarshaller(Execute2dModelTrainingCommandByUserRequest::getBody,
                Execute2dModelTrainingCommandByUserRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(Execute2dModelTrainingCommandByUserResponse::getXRequestId,
                Execute2dModelTrainingCommandByUserResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<List2dModelTrainingJobRequest, List2dModelTrainingJobResponse> list2dModelTrainingJob =
        genForList2dModelTrainingJob();

    private static HttpRequestDef<List2dModelTrainingJobRequest, List2dModelTrainingJobResponse> genForList2dModelTrainingJob() {
        // basic
        HttpRequestDef.Builder<List2dModelTrainingJobRequest, List2dModelTrainingJobResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, List2dModelTrainingJobRequest.class, List2dModelTrainingJobResponse.class)
            .withName("List2dModelTrainingJob")
            .withUri("/v1/{project_id}/digital-human-training-manage/user/jobs")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(List2dModelTrainingJobRequest::getOffset, List2dModelTrainingJobRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(List2dModelTrainingJobRequest::getLimit, List2dModelTrainingJobRequest::setLimit));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(List2dModelTrainingJobRequest::getSortKey,
                List2dModelTrainingJobRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(List2dModelTrainingJobRequest::getSortDir,
                List2dModelTrainingJobRequest::setSortDir));
        builder.<String>withRequestField("create_until",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(List2dModelTrainingJobRequest::getCreateUntil,
                List2dModelTrainingJobRequest::setCreateUntil));
        builder.<String>withRequestField("create_since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(List2dModelTrainingJobRequest::getCreateSince,
                List2dModelTrainingJobRequest::setCreateSince));
        builder.<String>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(List2dModelTrainingJobRequest::getState, List2dModelTrainingJobRequest::setState));
        builder.<String>withRequestField("query_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(List2dModelTrainingJobRequest::getQueryProjectId,
                List2dModelTrainingJobRequest::setQueryProjectId));
        builder.<String>withRequestField("batch_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(List2dModelTrainingJobRequest::getBatchName,
                List2dModelTrainingJobRequest::setBatchName));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(List2dModelTrainingJobRequest::getTag, List2dModelTrainingJobRequest::setTag));
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(List2dModelTrainingJobRequest::getJobId, List2dModelTrainingJobRequest::setJobId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(List2dModelTrainingJobRequest::getName, List2dModelTrainingJobRequest::setName));
        builder.<String>withRequestField("model_resolution",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(List2dModelTrainingJobRequest::getModelResolution,
                List2dModelTrainingJobRequest::setModelResolution));
        builder.<Boolean>withRequestField("is_flexus",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(List2dModelTrainingJobRequest::getIsFlexus,
                List2dModelTrainingJobRequest::setIsFlexus));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(List2dModelTrainingJobRequest::getAuthorization,
                List2dModelTrainingJobRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(List2dModelTrainingJobRequest::getXSdkDate,
                List2dModelTrainingJobRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(List2dModelTrainingJobRequest::getXProjectId,
                List2dModelTrainingJobRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(List2dModelTrainingJobRequest::getXAppUserId,
                List2dModelTrainingJobRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(List2dModelTrainingJobResponse::getXRequestId,
                List2dModelTrainingJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<Show2dModelTrainingJobRequest, Show2dModelTrainingJobResponse> show2dModelTrainingJob =
        genForShow2dModelTrainingJob();

    private static HttpRequestDef<Show2dModelTrainingJobRequest, Show2dModelTrainingJobResponse> genForShow2dModelTrainingJob() {
        // basic
        HttpRequestDef.Builder<Show2dModelTrainingJobRequest, Show2dModelTrainingJobResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, Show2dModelTrainingJobRequest.class, Show2dModelTrainingJobResponse.class)
            .withName("Show2dModelTrainingJob")
            .withUri("/v1/{project_id}/digital-human-training-manage/user/jobs/{job_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Show2dModelTrainingJobRequest::getJobId, Show2dModelTrainingJobRequest::setJobId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Show2dModelTrainingJobRequest::getAuthorization,
                Show2dModelTrainingJobRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Show2dModelTrainingJobRequest::getXSdkDate,
                Show2dModelTrainingJobRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Show2dModelTrainingJobRequest::getXProjectId,
                Show2dModelTrainingJobRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Show2dModelTrainingJobRequest::getXAppUserId,
                Show2dModelTrainingJobRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(Show2dModelTrainingJobResponse::getXRequestId,
                Show2dModelTrainingJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<Update2dModelTrainingJobRequest, Update2dModelTrainingJobResponse> update2dModelTrainingJob =
        genForUpdate2dModelTrainingJob();

    private static HttpRequestDef<Update2dModelTrainingJobRequest, Update2dModelTrainingJobResponse> genForUpdate2dModelTrainingJob() {
        // basic
        HttpRequestDef.Builder<Update2dModelTrainingJobRequest, Update2dModelTrainingJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, Update2dModelTrainingJobRequest.class, Update2dModelTrainingJobResponse.class)
                .withName("Update2dModelTrainingJob")
                .withUri("/v1/{project_id}/digital-human-training-manage/user/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Update2dModelTrainingJobRequest::getJobId,
                Update2dModelTrainingJobRequest::setJobId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Update2dModelTrainingJobRequest::getAuthorization,
                Update2dModelTrainingJobRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Update2dModelTrainingJobRequest::getXSdkDate,
                Update2dModelTrainingJobRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Update2dModelTrainingJobRequest::getXProjectId,
                Update2dModelTrainingJobRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Update2dModelTrainingJobRequest::getXAppUserId,
                Update2dModelTrainingJobRequest::setXAppUserId));
        builder.<Update2dModelTrainingJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Update2dModelTrainingJobReq.class),
            f -> f.withMarshaller(Update2dModelTrainingJobRequest::getBody, Update2dModelTrainingJobRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(Update2dModelTrainingJobResponse::getXRequestId,
                Update2dModelTrainingJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateFacialAnimationsRequest, CreateFacialAnimationsResponse> createFacialAnimations =
        genForCreateFacialAnimations();

    private static HttpRequestDef<CreateFacialAnimationsRequest, CreateFacialAnimationsResponse> genForCreateFacialAnimations() {
        // basic
        HttpRequestDef.Builder<CreateFacialAnimationsRequest, CreateFacialAnimationsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateFacialAnimationsRequest.class, CreateFacialAnimationsResponse.class)
            .withName("CreateFacialAnimations")
            .withUri("/v1/{project_id}/ttsa/fas")
            .withContentType("application/json;charset=utf-8");

        // requests
        builder.<CreateFASReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateFASReq.class),
            f -> f.withMarshaller(CreateFacialAnimationsRequest::getBody, CreateFacialAnimationsRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateFacialAnimationsResponse::getXRequestId,
                CreateFacialAnimationsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateTtsaRequest, CreateTtsaResponse> createTtsa = genForCreateTtsa();

    private static HttpRequestDef<CreateTtsaRequest, CreateTtsaResponse> genForCreateTtsa() {
        // basic
        HttpRequestDef.Builder<CreateTtsaRequest, CreateTtsaResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTtsaRequest.class, CreateTtsaResponse.class)
                .withName("CreateTtsa")
                .withUri("/v1/{project_id}/ttsa-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTtsaRequest::getAuthorization, CreateTtsaRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTtsaRequest::getXSdkDate, CreateTtsaRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTtsaRequest::getXProjectId, CreateTtsaRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTtsaRequest::getXAppUserId, CreateTtsaRequest::setXAppUserId));
        builder.<CreateTTSAReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTTSAReq.class),
            f -> f.withMarshaller(CreateTtsaRequest::getBody, CreateTtsaRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateTtsaResponse::getXRequestId, CreateTtsaResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListFacialAnimationsDataRequest, ListFacialAnimationsDataResponse> listFacialAnimationsData =
        genForListFacialAnimationsData();

    private static HttpRequestDef<ListFacialAnimationsDataRequest, ListFacialAnimationsDataResponse> genForListFacialAnimationsData() {
        // basic
        HttpRequestDef.Builder<ListFacialAnimationsDataRequest, ListFacialAnimationsDataResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListFacialAnimationsDataRequest.class, ListFacialAnimationsDataResponse.class)
                .withName("ListFacialAnimationsData")
                .withUri("/v1/{project_id}/fas-jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFacialAnimationsDataRequest::getJobId,
                ListFacialAnimationsDataRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTtsaDataRequest, ListTtsaDataResponse> listTtsaData = genForListTtsaData();

    private static HttpRequestDef<ListTtsaDataRequest, ListTtsaDataResponse> genForListTtsaData() {
        // basic
        HttpRequestDef.Builder<ListTtsaDataRequest, ListTtsaDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTtsaDataRequest.class, ListTtsaDataResponse.class)
                .withName("ListTtsaData")
                .withUri("/v1/{project_id}/ttsa-jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTtsaDataRequest::getJobId, ListTtsaDataRequest::setJobId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTtsaDataRequest::getOffset, ListTtsaDataRequest::setOffset));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTtsaDataRequest::getAuthorization, ListTtsaDataRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTtsaDataRequest::getXSdkDate, ListTtsaDataRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTtsaDataRequest::getXProjectId, ListTtsaDataRequest::setXProjectId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTtsaDataResponse::getXRequestId, ListTtsaDataResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListTtsaJobsRequest, ListTtsaJobsResponse> listTtsaJobs = genForListTtsaJobs();

    private static HttpRequestDef<ListTtsaJobsRequest, ListTtsaJobsResponse> genForListTtsaJobs() {
        // basic
        HttpRequestDef.Builder<ListTtsaJobsRequest, ListTtsaJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTtsaJobsRequest.class, ListTtsaJobsResponse.class)
                .withName("ListTtsaJobs")
                .withUri("/v1/{project_id}/ttsa-jobs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTtsaJobsRequest::getOffset, ListTtsaJobsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTtsaJobsRequest::getLimit, ListTtsaJobsRequest::setLimit));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTtsaJobsRequest::getAuthorization, ListTtsaJobsRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTtsaJobsRequest::getXSdkDate, ListTtsaJobsRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTtsaJobsRequest::getXProjectId, ListTtsaJobsRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTtsaJobsRequest::getXAppUserId, ListTtsaJobsRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTtsaJobsResponse::getXRequestId, ListTtsaJobsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateAsyncTtsJobRequest, CreateAsyncTtsJobResponse> createAsyncTtsJob =
        genForCreateAsyncTtsJob();

    private static HttpRequestDef<CreateAsyncTtsJobRequest, CreateAsyncTtsJobResponse> genForCreateAsyncTtsJob() {
        // basic
        HttpRequestDef.Builder<CreateAsyncTtsJobRequest, CreateAsyncTtsJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAsyncTtsJobRequest.class, CreateAsyncTtsJobResponse.class)
                .withName("CreateAsyncTtsJob")
                .withUri("/v1/{project_id}/ttsc/async-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAsyncTtsJobRequest::getAuthorization,
                CreateAsyncTtsJobRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAsyncTtsJobRequest::getXSdkDate, CreateAsyncTtsJobRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAsyncTtsJobRequest::getXProjectId, CreateAsyncTtsJobRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAsyncTtsJobRequest::getXAppUserId, CreateAsyncTtsJobRequest::setXAppUserId));
        builder.<CreateAsyncTtsJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAsyncTtsJobRequestBody.class),
            f -> f.withMarshaller(CreateAsyncTtsJobRequest::getBody, CreateAsyncTtsJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTtsAuditionRequest, CreateTtsAuditionResponse> createTtsAudition =
        genForCreateTtsAudition();

    private static HttpRequestDef<CreateTtsAuditionRequest, CreateTtsAuditionResponse> genForCreateTtsAudition() {
        // basic
        HttpRequestDef.Builder<CreateTtsAuditionRequest, CreateTtsAuditionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTtsAuditionRequest.class, CreateTtsAuditionResponse.class)
                .withName("CreateTtsAudition")
                .withUri("/v1/{project_id}/ttsc/audition")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTtsAuditionRequest::getXRequestId, CreateTtsAuditionRequest::setXRequestId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTtsAuditionRequest::getAuthorization,
                CreateTtsAuditionRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTtsAuditionRequest::getXSdkDate, CreateTtsAuditionRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTtsAuditionRequest::getXProjectId, CreateTtsAuditionRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTtsAuditionRequest::getXAppUserId, CreateTtsAuditionRequest::setXAppUserId));
        builder.<CreateTtsAuditionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTtsAuditionRequestBody.class),
            f -> f.withMarshaller(CreateTtsAuditionRequest::getBody, CreateTtsAuditionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTtscVocabularyConfigsRequest, CreateTtscVocabularyConfigsResponse> createTtscVocabularyConfigs =
        genForCreateTtscVocabularyConfigs();

    private static HttpRequestDef<CreateTtscVocabularyConfigsRequest, CreateTtscVocabularyConfigsResponse> genForCreateTtscVocabularyConfigs() {
        // basic
        HttpRequestDef.Builder<CreateTtscVocabularyConfigsRequest, CreateTtscVocabularyConfigsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateTtscVocabularyConfigsRequest.class,
                    CreateTtscVocabularyConfigsResponse.class)
                .withName("CreateTtscVocabularyConfigs")
                .withUri("/v1/{project_id}/ttsc/vocabulary-configs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTtscVocabularyConfigsRequest::getXRequestId,
                CreateTtscVocabularyConfigsRequest::setXRequestId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTtscVocabularyConfigsRequest::getAuthorization,
                CreateTtscVocabularyConfigsRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTtscVocabularyConfigsRequest::getXSdkDate,
                CreateTtscVocabularyConfigsRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTtscVocabularyConfigsRequest::getXProjectId,
                CreateTtscVocabularyConfigsRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTtscVocabularyConfigsRequest::getXAppUserId,
                CreateTtscVocabularyConfigsRequest::setXAppUserId));
        builder.<SaveTtscVocabularyConfigsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SaveTtscVocabularyConfigsRequestBody.class),
            f -> f.withMarshaller(CreateTtscVocabularyConfigsRequest::getBody,
                CreateTtscVocabularyConfigsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTtscVocabularyConfigsRequest, DeleteTtscVocabularyConfigsResponse> deleteTtscVocabularyConfigs =
        genForDeleteTtscVocabularyConfigs();

    private static HttpRequestDef<DeleteTtscVocabularyConfigsRequest, DeleteTtscVocabularyConfigsResponse> genForDeleteTtscVocabularyConfigs() {
        // basic
        HttpRequestDef.Builder<DeleteTtscVocabularyConfigsRequest, DeleteTtscVocabularyConfigsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteTtscVocabularyConfigsRequest.class,
                    DeleteTtscVocabularyConfigsResponse.class)
                .withName("DeleteTtscVocabularyConfigs")
                .withUri("/v1/{project_id}/ttsc/vocabulary-configs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteTtscVocabularyConfigsRequest::getOffset,
                DeleteTtscVocabularyConfigsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteTtscVocabularyConfigsRequest::getLimit,
                DeleteTtscVocabularyConfigsRequest::setLimit));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTtscVocabularyConfigsRequest::getXRequestId,
                DeleteTtscVocabularyConfigsRequest::setXRequestId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTtscVocabularyConfigsRequest::getAuthorization,
                DeleteTtscVocabularyConfigsRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTtscVocabularyConfigsRequest::getXSdkDate,
                DeleteTtscVocabularyConfigsRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTtscVocabularyConfigsRequest::getXProjectId,
                DeleteTtscVocabularyConfigsRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTtscVocabularyConfigsRequest::getXAppUserId,
                DeleteTtscVocabularyConfigsRequest::setXAppUserId));
        builder.<DeleteTtscVocabularyConfigsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteTtscVocabularyConfigsRequestBody.class),
            f -> f.withMarshaller(DeleteTtscVocabularyConfigsRequest::getBody,
                DeleteTtscVocabularyConfigsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTtscVocabularyConfigsRequest, ListTtscVocabularyConfigsResponse> listTtscVocabularyConfigs =
        genForListTtscVocabularyConfigs();

    private static HttpRequestDef<ListTtscVocabularyConfigsRequest, ListTtscVocabularyConfigsResponse> genForListTtscVocabularyConfigs() {
        // basic
        HttpRequestDef.Builder<ListTtscVocabularyConfigsRequest, ListTtscVocabularyConfigsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListTtscVocabularyConfigsRequest.class,
                    ListTtscVocabularyConfigsResponse.class)
                .withName("ListTtscVocabularyConfigs")
                .withUri("/v1/{project_id}/ttsc/vocabulary-configs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTtscVocabularyConfigsRequest::getType,
                ListTtscVocabularyConfigsRequest::setType));
        builder.<String>withRequestField("tts_service_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTtscVocabularyConfigsRequest::getTtsServiceName,
                ListTtscVocabularyConfigsRequest::setTtsServiceName));
        builder.<String>withRequestField("is_vocabulary_config_enable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTtscVocabularyConfigsRequest::getIsVocabularyConfigEnable,
                ListTtscVocabularyConfigsRequest::setIsVocabularyConfigEnable));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTtscVocabularyConfigsRequest::getLimit,
                ListTtscVocabularyConfigsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTtscVocabularyConfigsRequest::getOffset,
                ListTtscVocabularyConfigsRequest::setOffset));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTtscVocabularyConfigsRequest::getStartTime,
                ListTtscVocabularyConfigsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTtscVocabularyConfigsRequest::getEndTime,
                ListTtscVocabularyConfigsRequest::setEndTime));
        builder.<String>withRequestField("search_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTtscVocabularyConfigsRequest::getSearchKey,
                ListTtscVocabularyConfigsRequest::setSearchKey));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTtscVocabularyConfigsRequest::getXRequestId,
                ListTtscVocabularyConfigsRequest::setXRequestId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTtscVocabularyConfigsRequest::getAuthorization,
                ListTtscVocabularyConfigsRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTtscVocabularyConfigsRequest::getXSdkDate,
                ListTtscVocabularyConfigsRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTtscVocabularyConfigsRequest::getXProjectId,
                ListTtscVocabularyConfigsRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTtscVocabularyConfigsRequest::getXAppUserId,
                ListTtscVocabularyConfigsRequest::setXAppUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SaveTtscVocabularyConfigsRequest, SaveTtscVocabularyConfigsResponse> saveTtscVocabularyConfigs =
        genForSaveTtscVocabularyConfigs();

    private static HttpRequestDef<SaveTtscVocabularyConfigsRequest, SaveTtscVocabularyConfigsResponse> genForSaveTtscVocabularyConfigs() {
        // basic
        HttpRequestDef.Builder<SaveTtscVocabularyConfigsRequest, SaveTtscVocabularyConfigsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    SaveTtscVocabularyConfigsRequest.class,
                    SaveTtscVocabularyConfigsResponse.class)
                .withName("SaveTtscVocabularyConfigs")
                .withUri("/v1/{project_id}/ttsc/vocabulary-configs/{vocabulary_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vocabulary_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveTtscVocabularyConfigsRequest::getVocabularyId,
                SaveTtscVocabularyConfigsRequest::setVocabularyId));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveTtscVocabularyConfigsRequest::getXRequestId,
                SaveTtscVocabularyConfigsRequest::setXRequestId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveTtscVocabularyConfigsRequest::getAuthorization,
                SaveTtscVocabularyConfigsRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveTtscVocabularyConfigsRequest::getXSdkDate,
                SaveTtscVocabularyConfigsRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveTtscVocabularyConfigsRequest::getXProjectId,
                SaveTtscVocabularyConfigsRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveTtscVocabularyConfigsRequest::getXAppUserId,
                SaveTtscVocabularyConfigsRequest::setXAppUserId));
        builder.<SaveTtscVocabularyConfigsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SaveTtscVocabularyConfigsRequestBody.class),
            f -> f.withMarshaller(SaveTtscVocabularyConfigsRequest::getBody,
                SaveTtscVocabularyConfigsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAsyncTtsJobRequest, ShowAsyncTtsJobResponse> showAsyncTtsJob =
        genForShowAsyncTtsJob();

    private static HttpRequestDef<ShowAsyncTtsJobRequest, ShowAsyncTtsJobResponse> genForShowAsyncTtsJob() {
        // basic
        HttpRequestDef.Builder<ShowAsyncTtsJobRequest, ShowAsyncTtsJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAsyncTtsJobRequest.class, ShowAsyncTtsJobResponse.class)
                .withName("ShowAsyncTtsJob")
                .withUri("/v1/{project_id}/ttsc/async-jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAsyncTtsJobRequest::getJobId, ShowAsyncTtsJobRequest::setJobId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAsyncTtsJobRequest::getAuthorization, ShowAsyncTtsJobRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAsyncTtsJobRequest::getXSdkDate, ShowAsyncTtsJobRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAsyncTtsJobRequest::getXProjectId, ShowAsyncTtsJobRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAsyncTtsJobRequest::getXAppUserId, ShowAsyncTtsJobRequest::setXAppUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTtsAuditionFileRequest, ShowTtsAuditionFileResponse> showTtsAuditionFile =
        genForShowTtsAuditionFile();

    private static HttpRequestDef<ShowTtsAuditionFileRequest, ShowTtsAuditionFileResponse> genForShowTtsAuditionFile() {
        // basic
        HttpRequestDef.Builder<ShowTtsAuditionFileRequest, ShowTtsAuditionFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTtsAuditionFileRequest.class, ShowTtsAuditionFileResponse.class)
                .withName("ShowTtsAuditionFile")
                .withUri("/v1/{project_id}/ttsc/audition-file/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTtsAuditionFileRequest::getJobId, ShowTtsAuditionFileRequest::setJobId));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTtsAuditionFileRequest::getXRequestId,
                ShowTtsAuditionFileRequest::setXRequestId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTtsAuditionFileRequest::getAuthorization,
                ShowTtsAuditionFileRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTtsAuditionFileRequest::getXSdkDate, ShowTtsAuditionFileRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTtsAuditionFileRequest::getXProjectId,
                ShowTtsAuditionFileRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTtsAuditionFileRequest::getXAppUserId,
                ShowTtsAuditionFileRequest::setXAppUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTtsPhoneticSymbolRequest, ShowTtsPhoneticSymbolResponse> showTtsPhoneticSymbol =
        genForShowTtsPhoneticSymbol();

    private static HttpRequestDef<ShowTtsPhoneticSymbolRequest, ShowTtsPhoneticSymbolResponse> genForShowTtsPhoneticSymbol() {
        // basic
        HttpRequestDef.Builder<ShowTtsPhoneticSymbolRequest, ShowTtsPhoneticSymbolResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowTtsPhoneticSymbolRequest.class, ShowTtsPhoneticSymbolResponse.class)
            .withName("ShowTtsPhoneticSymbol")
            .withUri("/v1/{project_id}/ttsc/phonetic-symbol")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTtsPhoneticSymbolRequest::getOffset, ShowTtsPhoneticSymbolRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTtsPhoneticSymbolRequest::getLimit, ShowTtsPhoneticSymbolRequest::setLimit));
        builder.<String>withRequestField("word",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTtsPhoneticSymbolRequest::getWord, ShowTtsPhoneticSymbolRequest::setWord));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTtsPhoneticSymbolRequest::getXRequestId,
                ShowTtsPhoneticSymbolRequest::setXRequestId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTtsPhoneticSymbolRequest::getAuthorization,
                ShowTtsPhoneticSymbolRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTtsPhoneticSymbolRequest::getXSdkDate,
                ShowTtsPhoneticSymbolRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTtsPhoneticSymbolRequest::getXProjectId,
                ShowTtsPhoneticSymbolRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTtsPhoneticSymbolRequest::getXAppUserId,
                ShowTtsPhoneticSymbolRequest::setXAppUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVideoMotionCaptureJobRequest, CreateVideoMotionCaptureJobResponse> createVideoMotionCaptureJob =
        genForCreateVideoMotionCaptureJob();

    private static HttpRequestDef<CreateVideoMotionCaptureJobRequest, CreateVideoMotionCaptureJobResponse> genForCreateVideoMotionCaptureJob() {
        // basic
        HttpRequestDef.Builder<CreateVideoMotionCaptureJobRequest, CreateVideoMotionCaptureJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateVideoMotionCaptureJobRequest.class,
                    CreateVideoMotionCaptureJobResponse.class)
                .withName("CreateVideoMotionCaptureJob")
                .withUri("/v1/{project_id}/video-motion-capture-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVideoMotionCaptureJobRequest::getAuthorization,
                CreateVideoMotionCaptureJobRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVideoMotionCaptureJobRequest::getXSdkDate,
                CreateVideoMotionCaptureJobRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVideoMotionCaptureJobRequest::getXProjectId,
                CreateVideoMotionCaptureJobRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVideoMotionCaptureJobRequest::getXAppUserId,
                CreateVideoMotionCaptureJobRequest::setXAppUserId));
        builder.<String>withRequestField("X-User-Privilege",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVideoMotionCaptureJobRequest::getXUserPrivilege,
                CreateVideoMotionCaptureJobRequest::setXUserPrivilege));
        builder.<VideoMotionCaptureJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VideoMotionCaptureJobReq.class),
            f -> f.withMarshaller(CreateVideoMotionCaptureJobRequest::getBody,
                CreateVideoMotionCaptureJobRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateVideoMotionCaptureJobResponse::getXRequestId,
                CreateVideoMotionCaptureJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ExecuteVideoMotionCaptureCommandRequest, ExecuteVideoMotionCaptureCommandResponse> executeVideoMotionCaptureCommand =
        genForExecuteVideoMotionCaptureCommand();

    private static HttpRequestDef<ExecuteVideoMotionCaptureCommandRequest, ExecuteVideoMotionCaptureCommandResponse> genForExecuteVideoMotionCaptureCommand() {
        // basic
        HttpRequestDef.Builder<ExecuteVideoMotionCaptureCommandRequest, ExecuteVideoMotionCaptureCommandResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ExecuteVideoMotionCaptureCommandRequest.class,
                    ExecuteVideoMotionCaptureCommandResponse.class)
                .withName("ExecuteVideoMotionCaptureCommand")
                .withUri("/v1/{project_id}/video-motion-capture-jobs/{job_id}/command")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteVideoMotionCaptureCommandRequest::getJobId,
                ExecuteVideoMotionCaptureCommandRequest::setJobId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteVideoMotionCaptureCommandRequest::getAuthorization,
                ExecuteVideoMotionCaptureCommandRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteVideoMotionCaptureCommandRequest::getXSdkDate,
                ExecuteVideoMotionCaptureCommandRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteVideoMotionCaptureCommandRequest::getXProjectId,
                ExecuteVideoMotionCaptureCommandRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteVideoMotionCaptureCommandRequest::getXAppUserId,
                ExecuteVideoMotionCaptureCommandRequest::setXAppUserId));
        builder.<ControlDigitalHumanLiveReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ControlDigitalHumanLiveReq.class),
            f -> f.withMarshaller(ExecuteVideoMotionCaptureCommandRequest::getBody,
                ExecuteVideoMotionCaptureCommandRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ExecuteVideoMotionCaptureCommandResponse::getXRequestId,
                ExecuteVideoMotionCaptureCommandResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListVideoMotionCaptureJobsRequest, ListVideoMotionCaptureJobsResponse> listVideoMotionCaptureJobs =
        genForListVideoMotionCaptureJobs();

    private static HttpRequestDef<ListVideoMotionCaptureJobsRequest, ListVideoMotionCaptureJobsResponse> genForListVideoMotionCaptureJobs() {
        // basic
        HttpRequestDef.Builder<ListVideoMotionCaptureJobsRequest, ListVideoMotionCaptureJobsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListVideoMotionCaptureJobsRequest.class,
                    ListVideoMotionCaptureJobsResponse.class)
                .withName("ListVideoMotionCaptureJobs")
                .withUri("/v1/{project_id}/video-motion-capture-jobs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVideoMotionCaptureJobsRequest::getOffset,
                ListVideoMotionCaptureJobsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVideoMotionCaptureJobsRequest::getLimit,
                ListVideoMotionCaptureJobsRequest::setLimit));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVideoMotionCaptureJobsRequest::getAuthorization,
                ListVideoMotionCaptureJobsRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVideoMotionCaptureJobsRequest::getXSdkDate,
                ListVideoMotionCaptureJobsRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVideoMotionCaptureJobsRequest::getXProjectId,
                ListVideoMotionCaptureJobsRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVideoMotionCaptureJobsRequest::getXAppUserId,
                ListVideoMotionCaptureJobsRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVideoMotionCaptureJobsResponse::getXRequestId,
                ListVideoMotionCaptureJobsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowVideoMotionCaptureJobRequest, ShowVideoMotionCaptureJobResponse> showVideoMotionCaptureJob =
        genForShowVideoMotionCaptureJob();

    private static HttpRequestDef<ShowVideoMotionCaptureJobRequest, ShowVideoMotionCaptureJobResponse> genForShowVideoMotionCaptureJob() {
        // basic
        HttpRequestDef.Builder<ShowVideoMotionCaptureJobRequest, ShowVideoMotionCaptureJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowVideoMotionCaptureJobRequest.class,
                    ShowVideoMotionCaptureJobResponse.class)
                .withName("ShowVideoMotionCaptureJob")
                .withUri("/v1/{project_id}/video-motion-capture-jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVideoMotionCaptureJobRequest::getJobId,
                ShowVideoMotionCaptureJobRequest::setJobId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVideoMotionCaptureJobRequest::getAuthorization,
                ShowVideoMotionCaptureJobRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVideoMotionCaptureJobRequest::getXSdkDate,
                ShowVideoMotionCaptureJobRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVideoMotionCaptureJobRequest::getXProjectId,
                ShowVideoMotionCaptureJobRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVideoMotionCaptureJobRequest::getXAppUserId,
                ShowVideoMotionCaptureJobRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowVideoMotionCaptureJobResponse::getXRequestId,
                ShowVideoMotionCaptureJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<StopVideoMotionCaptureJobRequest, StopVideoMotionCaptureJobResponse> stopVideoMotionCaptureJob =
        genForStopVideoMotionCaptureJob();

    private static HttpRequestDef<StopVideoMotionCaptureJobRequest, StopVideoMotionCaptureJobResponse> genForStopVideoMotionCaptureJob() {
        // basic
        HttpRequestDef.Builder<StopVideoMotionCaptureJobRequest, StopVideoMotionCaptureJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    StopVideoMotionCaptureJobRequest.class,
                    StopVideoMotionCaptureJobResponse.class)
                .withName("StopVideoMotionCaptureJob")
                .withUri("/v1/{project_id}/video-motion-capture-jobs/{job_id}/finish")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopVideoMotionCaptureJobRequest::getJobId,
                StopVideoMotionCaptureJobRequest::setJobId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopVideoMotionCaptureJobRequest::getAuthorization,
                StopVideoMotionCaptureJobRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopVideoMotionCaptureJobRequest::getXSdkDate,
                StopVideoMotionCaptureJobRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopVideoMotionCaptureJobRequest::getXProjectId,
                StopVideoMotionCaptureJobRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopVideoMotionCaptureJobRequest::getXAppUserId,
                StopVideoMotionCaptureJobRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StopVideoMotionCaptureJobResponse::getXRequestId,
                StopVideoMotionCaptureJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CopyVideoScriptsRequest, CopyVideoScriptsResponse> copyVideoScripts =
        genForCopyVideoScripts();

    private static HttpRequestDef<CopyVideoScriptsRequest, CopyVideoScriptsResponse> genForCopyVideoScripts() {
        // basic
        HttpRequestDef.Builder<CopyVideoScriptsRequest, CopyVideoScriptsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CopyVideoScriptsRequest.class, CopyVideoScriptsResponse.class)
                .withName("CopyVideoScripts")
                .withUri("/v1/{project_id}/digital-human-video-scripts/{script_id}/copy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("script_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyVideoScriptsRequest::getScriptId, CopyVideoScriptsRequest::setScriptId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyVideoScriptsRequest::getAuthorization,
                CopyVideoScriptsRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyVideoScriptsRequest::getXSdkDate, CopyVideoScriptsRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyVideoScriptsRequest::getXProjectId, CopyVideoScriptsRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyVideoScriptsRequest::getXAppUserId, CopyVideoScriptsRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CopyVideoScriptsResponse::getXRequestId, CopyVideoScriptsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateVideoScriptsRequest, CreateVideoScriptsResponse> createVideoScripts =
        genForCreateVideoScripts();

    private static HttpRequestDef<CreateVideoScriptsRequest, CreateVideoScriptsResponse> genForCreateVideoScripts() {
        // basic
        HttpRequestDef.Builder<CreateVideoScriptsRequest, CreateVideoScriptsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVideoScriptsRequest.class, CreateVideoScriptsResponse.class)
                .withName("CreateVideoScripts")
                .withUri("/v1/{project_id}/digital-human-video-scripts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVideoScriptsRequest::getAuthorization,
                CreateVideoScriptsRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVideoScriptsRequest::getXSdkDate, CreateVideoScriptsRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVideoScriptsRequest::getXProjectId, CreateVideoScriptsRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVideoScriptsRequest::getXAppUserId, CreateVideoScriptsRequest::setXAppUserId));
        builder.<CreateVideoScriptsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVideoScriptsReq.class),
            f -> f.withMarshaller(CreateVideoScriptsRequest::getBody, CreateVideoScriptsRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateVideoScriptsResponse::getXRequestId,
                CreateVideoScriptsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteVideoScriptRequest, DeleteVideoScriptResponse> deleteVideoScript =
        genForDeleteVideoScript();

    private static HttpRequestDef<DeleteVideoScriptRequest, DeleteVideoScriptResponse> genForDeleteVideoScript() {
        // basic
        HttpRequestDef.Builder<DeleteVideoScriptRequest, DeleteVideoScriptResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteVideoScriptRequest.class, DeleteVideoScriptResponse.class)
                .withName("DeleteVideoScript")
                .withUri("/v1/{project_id}/digital-human-video-scripts/{script_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("script_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVideoScriptRequest::getScriptId, DeleteVideoScriptRequest::setScriptId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVideoScriptRequest::getAuthorization,
                DeleteVideoScriptRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVideoScriptRequest::getXSdkDate, DeleteVideoScriptRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVideoScriptRequest::getXProjectId, DeleteVideoScriptRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVideoScriptRequest::getXAppUserId, DeleteVideoScriptRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteVideoScriptResponse::getXRequestId, DeleteVideoScriptResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListVideoScriptsRequest, ListVideoScriptsResponse> listVideoScripts =
        genForListVideoScripts();

    private static HttpRequestDef<ListVideoScriptsRequest, ListVideoScriptsResponse> genForListVideoScripts() {
        // basic
        HttpRequestDef.Builder<ListVideoScriptsRequest, ListVideoScriptsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVideoScriptsRequest.class, ListVideoScriptsResponse.class)
                .withName("ListVideoScripts")
                .withUri("/v1/{project_id}/digital-human-video-scripts")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVideoScriptsRequest::getOffset, ListVideoScriptsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVideoScriptsRequest::getLimit, ListVideoScriptsRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVideoScriptsRequest::getName, ListVideoScriptsRequest::setName));
        builder.<ListVideoScriptsRequest.ScriptCatalogEnum>withRequestField("script_catalog",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListVideoScriptsRequest.ScriptCatalogEnum.class),
            f -> f.withMarshaller(ListVideoScriptsRequest::getScriptCatalog,
                ListVideoScriptsRequest::setScriptCatalog));
        builder.<ListVideoScriptsRequest.ViewModeEnum>withRequestField("view_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListVideoScriptsRequest.ViewModeEnum.class),
            f -> f.withMarshaller(ListVideoScriptsRequest::getViewMode, ListVideoScriptsRequest::setViewMode));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVideoScriptsRequest::getAuthorization,
                ListVideoScriptsRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVideoScriptsRequest::getXSdkDate, ListVideoScriptsRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVideoScriptsRequest::getXProjectId, ListVideoScriptsRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVideoScriptsRequest::getXAppUserId, ListVideoScriptsRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVideoScriptsResponse::getXRequestId, ListVideoScriptsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowVideoScriptRequest, ShowVideoScriptResponse> showVideoScript =
        genForShowVideoScript();

    private static HttpRequestDef<ShowVideoScriptRequest, ShowVideoScriptResponse> genForShowVideoScript() {
        // basic
        HttpRequestDef.Builder<ShowVideoScriptRequest, ShowVideoScriptResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVideoScriptRequest.class, ShowVideoScriptResponse.class)
                .withName("ShowVideoScript")
                .withUri("/v1/{project_id}/digital-human-video-scripts/{script_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("script_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVideoScriptRequest::getScriptId, ShowVideoScriptRequest::setScriptId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVideoScriptRequest::getAuthorization, ShowVideoScriptRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVideoScriptRequest::getXSdkDate, ShowVideoScriptRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVideoScriptRequest::getXProjectId, ShowVideoScriptRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVideoScriptRequest::getXAppUserId, ShowVideoScriptRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowVideoScriptResponse::getXRequestId, ShowVideoScriptResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateVideoScriptRequest, UpdateVideoScriptResponse> updateVideoScript =
        genForUpdateVideoScript();

    private static HttpRequestDef<UpdateVideoScriptRequest, UpdateVideoScriptResponse> genForUpdateVideoScript() {
        // basic
        HttpRequestDef.Builder<UpdateVideoScriptRequest, UpdateVideoScriptResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateVideoScriptRequest.class, UpdateVideoScriptResponse.class)
                .withName("UpdateVideoScript")
                .withUri("/v1/{project_id}/digital-human-video-scripts/{script_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("script_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVideoScriptRequest::getScriptId, UpdateVideoScriptRequest::setScriptId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVideoScriptRequest::getAuthorization,
                UpdateVideoScriptRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVideoScriptRequest::getXSdkDate, UpdateVideoScriptRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVideoScriptRequest::getXProjectId, UpdateVideoScriptRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVideoScriptRequest::getXAppUserId, UpdateVideoScriptRequest::setXAppUserId));
        builder.<UpdateVideoScriptsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateVideoScriptsReq.class),
            f -> f.withMarshaller(UpdateVideoScriptRequest::getBody, UpdateVideoScriptRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateVideoScriptResponse::getXRequestId, UpdateVideoScriptResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateWelcomeSpeechRequest, CreateWelcomeSpeechResponse> createWelcomeSpeech =
        genForCreateWelcomeSpeech();

    private static HttpRequestDef<CreateWelcomeSpeechRequest, CreateWelcomeSpeechResponse> genForCreateWelcomeSpeech() {
        // basic
        HttpRequestDef.Builder<CreateWelcomeSpeechRequest, CreateWelcomeSpeechResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateWelcomeSpeechRequest.class, CreateWelcomeSpeechResponse.class)
                .withName("CreateWelcomeSpeech")
                .withUri("/v1/{project_id}/digital-human-chat/welcome-speech")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateWelcomeSpeechRequest::getAuthorization,
                CreateWelcomeSpeechRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateWelcomeSpeechRequest::getXSdkDate, CreateWelcomeSpeechRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateWelcomeSpeechRequest::getXProjectId,
                CreateWelcomeSpeechRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateWelcomeSpeechRequest::getXAppUserId,
                CreateWelcomeSpeechRequest::setXAppUserId));
        builder.<CreateWelcomeSpeechReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateWelcomeSpeechReq.class),
            f -> f.withMarshaller(CreateWelcomeSpeechRequest::getBody, CreateWelcomeSpeechRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateWelcomeSpeechResponse::getXRequestId,
                CreateWelcomeSpeechResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteWelcomeSpeechRequest, DeleteWelcomeSpeechResponse> deleteWelcomeSpeech =
        genForDeleteWelcomeSpeech();

    private static HttpRequestDef<DeleteWelcomeSpeechRequest, DeleteWelcomeSpeechResponse> genForDeleteWelcomeSpeech() {
        // basic
        HttpRequestDef.Builder<DeleteWelcomeSpeechRequest, DeleteWelcomeSpeechResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteWelcomeSpeechRequest.class, DeleteWelcomeSpeechResponse.class)
                .withName("DeleteWelcomeSpeech")
                .withUri("/v1/{project_id}/digital-human-chat/welcome-speech/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWelcomeSpeechRequest::getAuthorization,
                DeleteWelcomeSpeechRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWelcomeSpeechRequest::getXSdkDate, DeleteWelcomeSpeechRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWelcomeSpeechRequest::getXProjectId,
                DeleteWelcomeSpeechRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWelcomeSpeechRequest::getXAppUserId,
                DeleteWelcomeSpeechRequest::setXAppUserId));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteWelcomeSpeechRequest::getBody, DeleteWelcomeSpeechRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteWelcomeSpeechResponse::getXRequestId,
                DeleteWelcomeSpeechResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListWelcomeSpeechRequest, ListWelcomeSpeechResponse> listWelcomeSpeech =
        genForListWelcomeSpeech();

    private static HttpRequestDef<ListWelcomeSpeechRequest, ListWelcomeSpeechResponse> genForListWelcomeSpeech() {
        // basic
        HttpRequestDef.Builder<ListWelcomeSpeechRequest, ListWelcomeSpeechResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWelcomeSpeechRequest.class, ListWelcomeSpeechResponse.class)
                .withName("ListWelcomeSpeech")
                .withUri("/v1/{project_id}/digital-human-chat/welcome-speech")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWelcomeSpeechRequest::getOffset, ListWelcomeSpeechRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWelcomeSpeechRequest::getLimit, ListWelcomeSpeechRequest::setLimit));
        builder.<String>withRequestField("robot_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWelcomeSpeechRequest::getRobotId, ListWelcomeSpeechRequest::setRobotId));
        builder.<ListWelcomeSpeechRequest.LanguageEnum>withRequestField("language",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListWelcomeSpeechRequest.LanguageEnum.class),
            f -> f.withMarshaller(ListWelcomeSpeechRequest::getLanguage, ListWelcomeSpeechRequest::setLanguage));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWelcomeSpeechRequest::getAuthorization,
                ListWelcomeSpeechRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWelcomeSpeechRequest::getXSdkDate, ListWelcomeSpeechRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWelcomeSpeechRequest::getXProjectId, ListWelcomeSpeechRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWelcomeSpeechRequest::getXAppUserId, ListWelcomeSpeechRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListWelcomeSpeechResponse::getXRequestId, ListWelcomeSpeechResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowWelcomeSpeechRequest, ShowWelcomeSpeechResponse> showWelcomeSpeech =
        genForShowWelcomeSpeech();

    private static HttpRequestDef<ShowWelcomeSpeechRequest, ShowWelcomeSpeechResponse> genForShowWelcomeSpeech() {
        // basic
        HttpRequestDef.Builder<ShowWelcomeSpeechRequest, ShowWelcomeSpeechResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowWelcomeSpeechRequest.class, ShowWelcomeSpeechResponse.class)
                .withName("ShowWelcomeSpeech")
                .withUri("/v1/{project_id}/digital-human-chat/welcome-speech/{welcome_speech_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("welcome_speech_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWelcomeSpeechRequest::getWelcomeSpeechId,
                ShowWelcomeSpeechRequest::setWelcomeSpeechId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWelcomeSpeechRequest::getAuthorization,
                ShowWelcomeSpeechRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWelcomeSpeechRequest::getXSdkDate, ShowWelcomeSpeechRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWelcomeSpeechRequest::getXProjectId, ShowWelcomeSpeechRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWelcomeSpeechRequest::getXAppUserId, ShowWelcomeSpeechRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowWelcomeSpeechResponse::getXRequestId, ShowWelcomeSpeechResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowWelcomeSpeechSwitchRequest, ShowWelcomeSpeechSwitchResponse> showWelcomeSpeechSwitch =
        genForShowWelcomeSpeechSwitch();

    private static HttpRequestDef<ShowWelcomeSpeechSwitchRequest, ShowWelcomeSpeechSwitchResponse> genForShowWelcomeSpeechSwitch() {
        // basic
        HttpRequestDef.Builder<ShowWelcomeSpeechSwitchRequest, ShowWelcomeSpeechSwitchResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowWelcomeSpeechSwitchRequest.class, ShowWelcomeSpeechSwitchResponse.class)
            .withName("ShowWelcomeSpeechSwitch")
            .withUri("/v1/{project_id}/digital-human-chat/welcome-speech-switch")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("robot_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWelcomeSpeechSwitchRequest::getRobotId,
                ShowWelcomeSpeechSwitchRequest::setRobotId));
        builder.<ShowWelcomeSpeechSwitchRequest.LanguageEnum>withRequestField("language",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowWelcomeSpeechSwitchRequest.LanguageEnum.class),
            f -> f.withMarshaller(ShowWelcomeSpeechSwitchRequest::getLanguage,
                ShowWelcomeSpeechSwitchRequest::setLanguage));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWelcomeSpeechSwitchRequest::getAuthorization,
                ShowWelcomeSpeechSwitchRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWelcomeSpeechSwitchRequest::getXSdkDate,
                ShowWelcomeSpeechSwitchRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWelcomeSpeechSwitchRequest::getXProjectId,
                ShowWelcomeSpeechSwitchRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWelcomeSpeechSwitchRequest::getXAppUserId,
                ShowWelcomeSpeechSwitchRequest::setXAppUserId));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowWelcomeSpeechSwitchResponse::getXRequestId,
                ShowWelcomeSpeechSwitchResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateWelcomeSpeechRequest, UpdateWelcomeSpeechResponse> updateWelcomeSpeech =
        genForUpdateWelcomeSpeech();

    private static HttpRequestDef<UpdateWelcomeSpeechRequest, UpdateWelcomeSpeechResponse> genForUpdateWelcomeSpeech() {
        // basic
        HttpRequestDef.Builder<UpdateWelcomeSpeechRequest, UpdateWelcomeSpeechResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateWelcomeSpeechRequest.class, UpdateWelcomeSpeechResponse.class)
                .withName("UpdateWelcomeSpeech")
                .withUri("/v1/{project_id}/digital-human-chat/welcome-speech/{welcome_speech_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("welcome_speech_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWelcomeSpeechRequest::getWelcomeSpeechId,
                UpdateWelcomeSpeechRequest::setWelcomeSpeechId));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWelcomeSpeechRequest::getAuthorization,
                UpdateWelcomeSpeechRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWelcomeSpeechRequest::getXSdkDate, UpdateWelcomeSpeechRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWelcomeSpeechRequest::getXProjectId,
                UpdateWelcomeSpeechRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWelcomeSpeechRequest::getXAppUserId,
                UpdateWelcomeSpeechRequest::setXAppUserId));
        builder.<UpdateWelcomeSpeechReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateWelcomeSpeechReq.class),
            f -> f.withMarshaller(UpdateWelcomeSpeechRequest::getBody, UpdateWelcomeSpeechRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateWelcomeSpeechResponse::getXRequestId,
                UpdateWelcomeSpeechResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateWelcomeSpeechSwitchRequest, UpdateWelcomeSpeechSwitchResponse> updateWelcomeSpeechSwitch =
        genForUpdateWelcomeSpeechSwitch();

    private static HttpRequestDef<UpdateWelcomeSpeechSwitchRequest, UpdateWelcomeSpeechSwitchResponse> genForUpdateWelcomeSpeechSwitch() {
        // basic
        HttpRequestDef.Builder<UpdateWelcomeSpeechSwitchRequest, UpdateWelcomeSpeechSwitchResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateWelcomeSpeechSwitchRequest.class,
                    UpdateWelcomeSpeechSwitchResponse.class)
                .withName("UpdateWelcomeSpeechSwitch")
                .withUri("/v1/{project_id}/digital-human-chat/welcome-speech-switch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWelcomeSpeechSwitchRequest::getAuthorization,
                UpdateWelcomeSpeechSwitchRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWelcomeSpeechSwitchRequest::getXSdkDate,
                UpdateWelcomeSpeechSwitchRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWelcomeSpeechSwitchRequest::getXProjectId,
                UpdateWelcomeSpeechSwitchRequest::setXProjectId));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWelcomeSpeechSwitchRequest::getXAppUserId,
                UpdateWelcomeSpeechSwitchRequest::setXAppUserId));
        builder.<UpdateWelcomeSpeechSwitchReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateWelcomeSpeechSwitchReq.class),
            f -> f.withMarshaller(UpdateWelcomeSpeechSwitchRequest::getBody,
                UpdateWelcomeSpeechSwitchRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateWelcomeSpeechSwitchResponse::getXRequestId,
                UpdateWelcomeSpeechSwitchResponse::setXRequestId));
        return builder.build();
    }

}

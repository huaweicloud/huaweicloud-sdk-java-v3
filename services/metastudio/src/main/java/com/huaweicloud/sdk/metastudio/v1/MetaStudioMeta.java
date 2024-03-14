package com.huaweicloud.sdk.metastudio.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.metastudio.v1.model.Cancel2DDigitalHumanVideoRequest;
import com.huaweicloud.sdk.metastudio.v1.model.Cancel2DDigitalHumanVideoResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CancelPhotoDigitalHumanVideoRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CancelPhotoDigitalHumanVideoResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CheckTextLanguageRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CheckTextLanguageResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CommitVoiceTrainingJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CommitVoiceTrainingJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ConfirmFileUploadRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ConfirmFileUploadRequestBody;
import com.huaweicloud.sdk.metastudio.v1.model.ConfirmFileUploadResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ConfirmTrainingSegmentRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ConfirmTrainingSegmentResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ControlDigitalHumanLiveReq;
import com.huaweicloud.sdk.metastudio.v1.model.ControlSmartLiveReq;
import com.huaweicloud.sdk.metastudio.v1.model.CopyVideoScriptsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CopyVideoScriptsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.Create2DDigitalHumanVideoReq;
import com.huaweicloud.sdk.metastudio.v1.model.Create2DDigitalHumanVideoRequest;
import com.huaweicloud.sdk.metastudio.v1.model.Create2DDigitalHumanVideoResponse;
import com.huaweicloud.sdk.metastudio.v1.model.Create2dModelTrainingJobReq;
import com.huaweicloud.sdk.metastudio.v1.model.Create2dModelTrainingJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.Create2dModelTrainingJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateActiveCodeReq;
import com.huaweicloud.sdk.metastudio.v1.model.CreateActiveCodeRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateActiveCodeResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateAssetbyReplicationInfoRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateAssetbyReplicationInfoResponse;
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
import com.huaweicloud.sdk.metastudio.v1.model.CreateInteractionRuleGroupRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateInteractionRuleGroupResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateOnceCodeRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateOnceCodeResponse;
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
import com.huaweicloud.sdk.metastudio.v1.model.CreateRobotReq;
import com.huaweicloud.sdk.metastudio.v1.model.CreateRobotRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateRobotResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateSmartChatRoomReq;
import com.huaweicloud.sdk.metastudio.v1.model.CreateSmartChatRoomRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateSmartChatRoomResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateSmartLiveRoomReq;
import com.huaweicloud.sdk.metastudio.v1.model.CreateSmartLiveRoomRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateSmartLiveRoomResponse;
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
import com.huaweicloud.sdk.metastudio.v1.model.CreateVideoMotionCaptureJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateVideoMotionCaptureJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateVideoScriptsReq;
import com.huaweicloud.sdk.metastudio.v1.model.CreateVideoScriptsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateVideoScriptsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.Delete2dModelTrainingJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.Delete2dModelTrainingJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteActiveCodeRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteActiveCodeResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteAssetRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteAssetResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteDigitalHumanBusinessCardRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteDigitalHumanBusinessCardResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteFileRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteFileResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteInteractionRuleGroupRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteInteractionRuleGroupResponse;
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
import com.huaweicloud.sdk.metastudio.v1.model.Execute2dModelTrainingCommandByUserReq;
import com.huaweicloud.sdk.metastudio.v1.model.Execute2dModelTrainingCommandByUserRequest;
import com.huaweicloud.sdk.metastudio.v1.model.Execute2dModelTrainingCommandByUserResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ExecuteSmartLiveCommandRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ExecuteSmartLiveCommandResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ExecuteVideoMotionCaptureCommandRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ExecuteVideoMotionCaptureCommandResponse;
import com.huaweicloud.sdk.metastudio.v1.model.FilesCreateReq;
import com.huaweicloud.sdk.metastudio.v1.model.InteractionRuleGroup;
import com.huaweicloud.sdk.metastudio.v1.model.LanguageCheckInfoReq;
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
import com.huaweicloud.sdk.metastudio.v1.model.ListInteractionRuleGroupsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListInteractionRuleGroupsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListPictureModelingJobsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListPictureModelingJobsResponse;
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
import com.huaweicloud.sdk.metastudio.v1.model.LiveEventReportRequest;
import com.huaweicloud.sdk.metastudio.v1.model.LiveEventReportResponse;
import com.huaweicloud.sdk.metastudio.v1.model.PictureModelingByUrlReq;
import com.huaweicloud.sdk.metastudio.v1.model.ReplicationAssetInfo;
import com.huaweicloud.sdk.metastudio.v1.model.ReportLiveEventReq;
import com.huaweicloud.sdk.metastudio.v1.model.ResetActiveCodeRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ResetActiveCodeResponse;
import com.huaweicloud.sdk.metastudio.v1.model.RestoreAssetRequest;
import com.huaweicloud.sdk.metastudio.v1.model.RestoreAssetResponse;
import com.huaweicloud.sdk.metastudio.v1.model.Show2DDigitalHumanVideoRequest;
import com.huaweicloud.sdk.metastudio.v1.model.Show2DDigitalHumanVideoResponse;
import com.huaweicloud.sdk.metastudio.v1.model.Show2dModelTrainingJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.Show2dModelTrainingJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowActiveCodeRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowActiveCodeResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowAssetReplicationInfoRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowAssetReplicationInfoResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowAssetRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowAssetResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowDigitalHumanBusinessCardRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowDigitalHumanBusinessCardResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowJobAuditResultRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowJobAuditResultResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowJobUploadingAddressRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowJobUploadingAddressResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowPhotoDetectionRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowPhotoDetectionResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowPhotoDigitalHumanVideoRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowPhotoDigitalHumanVideoResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowPictureModelingJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowPictureModelingJobResponse;
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
import com.huaweicloud.sdk.metastudio.v1.model.Update2dModelTrainingJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.Update2dModelTrainingJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateActiveCodeReq;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateActiveCodeRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateActiveCodeResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateDigitalAssetRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateDigitalAssetRequestBody;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateDigitalAssetResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateDigitalHumanBusinessCardRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateDigitalHumanBusinessCardResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateInteractionRuleGroupRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateInteractionRuleGroupResponse;
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

    public static final HttpRequestDef<CreateAssetbyReplicationInfoRequest, CreateAssetbyReplicationInfoResponse> createAssetbyReplicationInfo =
        genForCreateAssetbyReplicationInfo();

    private static HttpRequestDef<CreateAssetbyReplicationInfoRequest, CreateAssetbyReplicationInfoResponse> genForCreateAssetbyReplicationInfo() {
        // basic
        HttpRequestDef.Builder<CreateAssetbyReplicationInfoRequest, CreateAssetbyReplicationInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateAssetbyReplicationInfoRequest.class,
                    CreateAssetbyReplicationInfoResponse.class)
                .withName("CreateAssetbyReplicationInfo")
                .withUri("/v1/{project_id}/digital-assets-by-replication-info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAssetbyReplicationInfoRequest::getAuthorization,
                CreateAssetbyReplicationInfoRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAssetbyReplicationInfoRequest::getXSdkDate,
                CreateAssetbyReplicationInfoRequest::setXSdkDate));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAssetbyReplicationInfoRequest::getXAppUserId,
                CreateAssetbyReplicationInfoRequest::setXAppUserId));
        builder.<ReplicationAssetInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ReplicationAssetInfo.class),
            f -> f.withMarshaller(CreateAssetbyReplicationInfoRequest::getBody,
                CreateAssetbyReplicationInfoRequest::setBody));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateAssetbyReplicationInfoResponse::getXRequestId,
                CreateAssetbyReplicationInfoResponse::setXRequestId));
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
        builder.<String>withRequestField("render_engine",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getRenderEngine, ListAssetsRequest::setRenderEngine));
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
        builder.<String>withRequestField("X-REAL-IP",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getXRealIp, ListAssetsRequest::setXRealIp));
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

    public static final HttpRequestDef<CheckTextLanguageRequest, CheckTextLanguageResponse> checkTextLanguage =
        genForCheckTextLanguage();

    private static HttpRequestDef<CheckTextLanguageRequest, CheckTextLanguageResponse> genForCheckTextLanguage() {
        // basic
        HttpRequestDef.Builder<CheckTextLanguageRequest, CheckTextLanguageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckTextLanguageRequest.class, CheckTextLanguageResponse.class)
                .withName("CheckTextLanguage")
                .withUri("/v1/{project_id}/smart-live-rooms-scripts/language-check")
                .withContentType("application/json");

        // requests
        builder.<LanguageCheckInfoReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LanguageCheckInfoReq.class),
            f -> f.withMarshaller(CheckTextLanguageRequest::getBody, CheckTextLanguageRequest::setBody));

        // response

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
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVoiceTrainingJobRequest::getXAppUserId,
                ListVoiceTrainingJobRequest::setXAppUserId));

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
        builder.<String>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(List2dModelTrainingJobRequest::getState, List2dModelTrainingJobRequest::setState));
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
        builder.<Create2dModelTrainingJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Create2dModelTrainingJobReq.class),
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

}

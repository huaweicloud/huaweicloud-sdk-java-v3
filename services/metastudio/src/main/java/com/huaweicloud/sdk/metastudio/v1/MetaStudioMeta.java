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
import com.huaweicloud.sdk.metastudio.v1.model.Create2DDigitalHumanVideoReq;
import com.huaweicloud.sdk.metastudio.v1.model.Create2DDigitalHumanVideoRequest;
import com.huaweicloud.sdk.metastudio.v1.model.Create2DDigitalHumanVideoResponse;
import com.huaweicloud.sdk.metastudio.v1.model.Create2dModelTrainingJobReq;
import com.huaweicloud.sdk.metastudio.v1.model.Create2dModelTrainingJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.Create2dModelTrainingJobResponse;
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
import com.huaweicloud.sdk.metastudio.v1.model.DeleteAssetRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteAssetResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteDigitalHumanBusinessCardRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteDigitalHumanBusinessCardResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteFileRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteFileResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteInteractionRuleGroupRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteInteractionRuleGroupResponse;
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
import com.huaweicloud.sdk.metastudio.v1.model.ReportLiveEventReq;
import com.huaweicloud.sdk.metastudio.v1.model.RestoreAssetRequest;
import com.huaweicloud.sdk.metastudio.v1.model.RestoreAssetResponse;
import com.huaweicloud.sdk.metastudio.v1.model.Show2DDigitalHumanVideoRequest;
import com.huaweicloud.sdk.metastudio.v1.model.Show2DDigitalHumanVideoResponse;
import com.huaweicloud.sdk.metastudio.v1.model.Show2dModelTrainingJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.Show2dModelTrainingJobResponse;
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
import com.huaweicloud.sdk.metastudio.v1.model.StartSmartLiveReq;
import com.huaweicloud.sdk.metastudio.v1.model.StartSmartLiveRequest;
import com.huaweicloud.sdk.metastudio.v1.model.StartSmartLiveResponse;
import com.huaweicloud.sdk.metastudio.v1.model.StopSmartLiveRequest;
import com.huaweicloud.sdk.metastudio.v1.model.StopSmartLiveResponse;
import com.huaweicloud.sdk.metastudio.v1.model.StopVideoMotionCaptureJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.StopVideoMotionCaptureJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.Update2dModelTrainingJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.Update2dModelTrainingJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateDigitalAssetRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateDigitalAssetRequestBody;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateDigitalAssetResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateDigitalHumanBusinessCardRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateDigitalHumanBusinessCardResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateInteractionRuleGroupRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateInteractionRuleGroupResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateSmartLiveRoomRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateSmartLiveRoomResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateVideoScriptRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateVideoScriptResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateVideoScriptsReq;
import com.huaweicloud.sdk.metastudio.v1.model.VideoMotionCaptureJobReq;

@SuppressWarnings("unchecked")
public class MetaStudioMeta {

    public static final HttpRequestDef<CreateDigitalAssetRequest, CreateDigitalAssetResponse> createDigitalAsset =
        genForcreateDigitalAsset();

    private static HttpRequestDef<CreateDigitalAssetRequest, CreateDigitalAssetResponse> genForcreateDigitalAsset() {
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
            f -> f.withMarshaller(CreateDigitalAssetRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDigitalAssetRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDigitalAssetRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<CreateDigitalAssetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDigitalAssetRequestBody.class),
            f -> f.withMarshaller(CreateDigitalAssetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateDigitalAssetResponse::getXRequestId,
                CreateDigitalAssetResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteAssetRequest, DeleteAssetResponse> deleteAsset = genFordeleteAsset();

    private static HttpRequestDef<DeleteAssetRequest, DeleteAssetResponse> genFordeleteAsset() {
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
            f -> f.withMarshaller(DeleteAssetRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            }));
        builder.<String>withRequestField("mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssetRequest::getMode, (req, v) -> {
                req.setMode(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssetRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssetRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssetRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteAssetResponse::getXRequestId, DeleteAssetResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListAssetSummaryRequest, ListAssetSummaryResponse> listAssetSummary =
        genForlistAssetSummary();

    private static HttpRequestDef<ListAssetSummaryRequest, ListAssetSummaryResponse> genForlistAssetSummary() {
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
            f -> f.withMarshaller(ListAssetSummaryRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetSummaryRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<ListAssetSummarysReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListAssetSummarysReq.class),
            f -> f.withMarshaller(ListAssetSummaryRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAssetSummaryResponse::getXRequestId, ListAssetSummaryResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListAssetsRequest, ListAssetsResponse> listAssets = genForlistAssets();

    private static HttpRequestDef<ListAssetsRequest, ListAssetsResponse> genForlistAssets() {
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
            f -> f.withMarshaller(ListAssetsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAssetsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getTag, (req, v) -> {
                req.setTag(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("asset_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getAssetType, (req, v) -> {
                req.setAssetType(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<ListAssetsRequest.AssetSourceEnum>withRequestField("asset_source",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAssetsRequest.AssetSourceEnum.class),
            f -> f.withMarshaller(ListAssetsRequest::getAssetSource, (req, v) -> {
                req.setAssetSource(v);
            }));
        builder.<String>withRequestField("asset_state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getAssetState, (req, v) -> {
                req.setAssetState(v);
            }));
        builder.<String>withRequestField("style_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getStyleId, (req, v) -> {
                req.setStyleId(v);
            }));
        builder.<String>withRequestField("render_engine",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getRenderEngine, (req, v) -> {
                req.setRenderEngine(v);
            }));
        builder.<String>withRequestField("sex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getSex, (req, v) -> {
                req.setSex(v);
            }));
        builder.<String>withRequestField("language",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getLanguage, (req, v) -> {
                req.setLanguage(v);
            }));
        builder.<String>withRequestField("system_property",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getSystemProperty, (req, v) -> {
                req.setSystemProperty(v);
            }));
        builder.<Boolean>withRequestField("action_editable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAssetsRequest::getActionEditable, (req, v) -> {
                req.setActionEditable(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAssetsRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAssetsResponse::getXRequestId, ListAssetsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<RestoreAssetRequest, RestoreAssetResponse> restoreAsset = genForrestoreAsset();

    private static HttpRequestDef<RestoreAssetRequest, RestoreAssetResponse> genForrestoreAsset() {
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
            f -> f.withMarshaller(RestoreAssetRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreAssetRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreAssetRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreAssetRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(RestoreAssetResponse::getXRequestId, RestoreAssetResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowAssetRequest, ShowAssetResponse> showAsset = genForshowAsset();

    private static HttpRequestDef<ShowAssetRequest, ShowAssetResponse> genForshowAsset() {
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
            f -> f.withMarshaller(ShowAssetRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAssetResponse::getXRequestId, ShowAssetResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateDigitalAssetRequest, UpdateDigitalAssetResponse> updateDigitalAsset =
        genForupdateDigitalAsset();

    private static HttpRequestDef<UpdateDigitalAssetRequest, UpdateDigitalAssetResponse> genForupdateDigitalAsset() {
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
            f -> f.withMarshaller(UpdateDigitalAssetRequest::getAssetId, (req, v) -> {
                req.setAssetId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDigitalAssetRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDigitalAssetRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDigitalAssetRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<UpdateDigitalAssetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDigitalAssetRequestBody.class),
            f -> f.withMarshaller(UpdateDigitalAssetRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genForcreateDigitalHumanBusinessCard();

    private static HttpRequestDef<CreateDigitalHumanBusinessCardRequest, CreateDigitalHumanBusinessCardResponse> genForcreateDigitalHumanBusinessCard() {
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
            f -> f.withMarshaller(CreateDigitalHumanBusinessCardRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDigitalHumanBusinessCardRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDigitalHumanBusinessCardRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDigitalHumanBusinessCardRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<CreateDigitalHumanBusinessCardReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDigitalHumanBusinessCardReq.class),
            f -> f.withMarshaller(CreateDigitalHumanBusinessCardRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genFordeleteDigitalHumanBusinessCard();

    private static HttpRequestDef<DeleteDigitalHumanBusinessCardRequest, DeleteDigitalHumanBusinessCardResponse> genFordeleteDigitalHumanBusinessCard() {
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
            f -> f.withMarshaller(DeleteDigitalHumanBusinessCardRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDigitalHumanBusinessCardRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDigitalHumanBusinessCardRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDigitalHumanBusinessCardRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDigitalHumanBusinessCardRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

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
        genForlistDigitalHumanBusinessCard();

    private static HttpRequestDef<ListDigitalHumanBusinessCardRequest, ListDigitalHumanBusinessCardResponse> genForlistDigitalHumanBusinessCard() {
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
            f -> f.withMarshaller(ListDigitalHumanBusinessCardRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDigitalHumanBusinessCardRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanBusinessCardRequest::getState, (req, v) -> {
                req.setState(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanBusinessCardRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanBusinessCardRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("create_until",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanBusinessCardRequest::getCreateUntil, (req, v) -> {
                req.setCreateUntil(v);
            }));
        builder.<String>withRequestField("create_since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanBusinessCardRequest::getCreateSince, (req, v) -> {
                req.setCreateSince(v);
            }));
        builder.<String>withRequestField("video_asset_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanBusinessCardRequest::getVideoAssetName, (req, v) -> {
                req.setVideoAssetName(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanBusinessCardRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanBusinessCardRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanBusinessCardRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanBusinessCardRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

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
        genForshowDigitalHumanBusinessCard();

    private static HttpRequestDef<ShowDigitalHumanBusinessCardRequest, ShowDigitalHumanBusinessCardResponse> genForshowDigitalHumanBusinessCard() {
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
            f -> f.withMarshaller(ShowDigitalHumanBusinessCardRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDigitalHumanBusinessCardRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDigitalHumanBusinessCardRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDigitalHumanBusinessCardRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDigitalHumanBusinessCardRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

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
        genForupdateDigitalHumanBusinessCard();

    private static HttpRequestDef<UpdateDigitalHumanBusinessCardRequest, UpdateDigitalHumanBusinessCardResponse> genForupdateDigitalHumanBusinessCard() {
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
            f -> f.withMarshaller(UpdateDigitalHumanBusinessCardRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDigitalHumanBusinessCardRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDigitalHumanBusinessCardRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDigitalHumanBusinessCardRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDigitalHumanBusinessCardRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<CreateDigitalHumanBusinessCardReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDigitalHumanBusinessCardReq.class),
            f -> f.withMarshaller(UpdateDigitalHumanBusinessCardRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genForlistDigitalHumanVideo();

    private static HttpRequestDef<ListDigitalHumanVideoRequest, ListDigitalHumanVideoResponse> genForlistDigitalHumanVideo() {
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
            f -> f.withMarshaller(ListDigitalHumanVideoRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDigitalHumanVideoRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanVideoRequest::getState, (req, v) -> {
                req.setState(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanVideoRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanVideoRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("create_until",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanVideoRequest::getCreateUntil, (req, v) -> {
                req.setCreateUntil(v);
            }));
        builder.<String>withRequestField("create_since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanVideoRequest::getCreateSince, (req, v) -> {
                req.setCreateSince(v);
            }));
        builder.<String>withRequestField("script_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanVideoRequest::getScriptId, (req, v) -> {
                req.setScriptId(v);
            }));
        builder.<String>withRequestField("asset_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanVideoRequest::getAssetName, (req, v) -> {
                req.setAssetName(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanVideoRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanVideoRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanVideoRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDigitalHumanVideoRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

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
        genForcancel2DDigitalHumanVideo();

    private static HttpRequestDef<Cancel2DDigitalHumanVideoRequest, Cancel2DDigitalHumanVideoResponse> genForcancel2DDigitalHumanVideo() {
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
            f -> f.withMarshaller(Cancel2DDigitalHumanVideoRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Cancel2DDigitalHumanVideoRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Cancel2DDigitalHumanVideoRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Cancel2DDigitalHumanVideoRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Cancel2DDigitalHumanVideoRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

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
        genForcreate2DDigitalHumanVideo();

    private static HttpRequestDef<Create2DDigitalHumanVideoRequest, Create2DDigitalHumanVideoResponse> genForcreate2DDigitalHumanVideo() {
        // basic
        HttpRequestDef.Builder<Create2DDigitalHumanVideoRequest, Create2DDigitalHumanVideoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    Create2DDigitalHumanVideoRequest.class,
                    Create2DDigitalHumanVideoResponse.class)
                .withName("Create2DDigitalHumanVideo")
                .withUri("/v1/{project_id}/2d-digital-human-videos")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Create2DDigitalHumanVideoRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Create2DDigitalHumanVideoRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Create2DDigitalHumanVideoRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Create2DDigitalHumanVideoRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<Create2DDigitalHumanVideoReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Create2DDigitalHumanVideoReq.class),
            f -> f.withMarshaller(Create2DDigitalHumanVideoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genForshow2DDigitalHumanVideo();

    private static HttpRequestDef<Show2DDigitalHumanVideoRequest, Show2DDigitalHumanVideoResponse> genForshow2DDigitalHumanVideo() {
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
            f -> f.withMarshaller(Show2DDigitalHumanVideoRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<Boolean>withRequestField("show_script",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(Show2DDigitalHumanVideoRequest::getShowScript, (req, v) -> {
                req.setShowScript(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Show2DDigitalHumanVideoRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Show2DDigitalHumanVideoRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Show2DDigitalHumanVideoRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Show2DDigitalHumanVideoRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

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
        genForcancelPhotoDigitalHumanVideo();

    private static HttpRequestDef<CancelPhotoDigitalHumanVideoRequest, CancelPhotoDigitalHumanVideoResponse> genForcancelPhotoDigitalHumanVideo() {
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
            f -> f.withMarshaller(CancelPhotoDigitalHumanVideoRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelPhotoDigitalHumanVideoRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelPhotoDigitalHumanVideoRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelPhotoDigitalHumanVideoRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelPhotoDigitalHumanVideoRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

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
        genForcreatePhotoDetection();

    private static HttpRequestDef<CreatePhotoDetectionRequest, CreatePhotoDetectionResponse> genForcreatePhotoDetection() {
        // basic
        HttpRequestDef.Builder<CreatePhotoDetectionRequest, CreatePhotoDetectionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreatePhotoDetectionRequest.class, CreatePhotoDetectionResponse.class)
            .withName("CreatePhotoDetection")
            .withUri("/v1/{project_id}/photo-detection")
            .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePhotoDetectionRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePhotoDetectionRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePhotoDetectionRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePhotoDetectionRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<CreatePhotoDetectionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePhotoDetectionReq.class),
            f -> f.withMarshaller(CreatePhotoDetectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genForcreatePhotoDigitalHumanVideo();

    private static HttpRequestDef<CreatePhotoDigitalHumanVideoRequest, CreatePhotoDigitalHumanVideoResponse> genForcreatePhotoDigitalHumanVideo() {
        // basic
        HttpRequestDef.Builder<CreatePhotoDigitalHumanVideoRequest, CreatePhotoDigitalHumanVideoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreatePhotoDigitalHumanVideoRequest.class,
                    CreatePhotoDigitalHumanVideoResponse.class)
                .withName("CreatePhotoDigitalHumanVideo")
                .withUri("/v1/{project_id}/photo-digital-human-videos")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePhotoDigitalHumanVideoRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePhotoDigitalHumanVideoRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePhotoDigitalHumanVideoRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePhotoDigitalHumanVideoRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<CreatePhotoDigitalHumanVideoReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePhotoDigitalHumanVideoReq.class),
            f -> f.withMarshaller(CreatePhotoDigitalHumanVideoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genForshowPhotoDetection();

    private static HttpRequestDef<ShowPhotoDetectionRequest, ShowPhotoDetectionResponse> genForshowPhotoDetection() {
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
            f -> f.withMarshaller(ShowPhotoDetectionRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPhotoDetectionRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPhotoDetectionRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPhotoDetectionRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPhotoDetectionRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

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
        genForshowPhotoDigitalHumanVideo();

    private static HttpRequestDef<ShowPhotoDigitalHumanVideoRequest, ShowPhotoDigitalHumanVideoResponse> genForshowPhotoDigitalHumanVideo() {
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
            f -> f.withMarshaller(ShowPhotoDigitalHumanVideoRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<Boolean>withRequestField("show_script",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowPhotoDigitalHumanVideoRequest::getShowScript, (req, v) -> {
                req.setShowScript(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPhotoDigitalHumanVideoRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPhotoDigitalHumanVideoRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPhotoDigitalHumanVideoRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPhotoDigitalHumanVideoRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

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
        genForconfirmFileUpload();

    private static HttpRequestDef<ConfirmFileUploadRequest, ConfirmFileUploadResponse> genForconfirmFileUpload() {
        // basic
        HttpRequestDef.Builder<ConfirmFileUploadRequest, ConfirmFileUploadResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ConfirmFileUploadRequest.class, ConfirmFileUploadResponse.class)
                .withName("ConfirmFileUpload")
                .withUri("/v1/{project_id}/files/{file_id}/complete")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("file_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmFileUploadRequest::getFileId, (req, v) -> {
                req.setFileId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmFileUploadRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmFileUploadRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConfirmFileUploadRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<ConfirmFileUploadRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConfirmFileUploadRequestBody.class),
            f -> f.withMarshaller(ConfirmFileUploadRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ConfirmFileUploadResponse::getXRequestId, ConfirmFileUploadResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateFileRequest, CreateFileResponse> createFile = genForcreateFile();

    private static HttpRequestDef<CreateFileRequest, CreateFileResponse> genForcreateFile() {
        // basic
        HttpRequestDef.Builder<CreateFileRequest, CreateFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFileRequest.class, CreateFileResponse.class)
                .withName("CreateFile")
                .withUri("/v1/{project_id}/files")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFileRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFileRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFileRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<FilesCreateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FilesCreateReq.class),
            f -> f.withMarshaller(CreateFileRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateFileResponse::getXRequestId, CreateFileResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteFileRequest, DeleteFileResponse> deleteFile = genFordeleteFile();

    private static HttpRequestDef<DeleteFileRequest, DeleteFileResponse> genFordeleteFile() {
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
            f -> f.withMarshaller(DeleteFileRequest::getFileId, (req, v) -> {
                req.setFileId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFileRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFileRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFileRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteFileResponse::getXRequestId, DeleteFileResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreatePictureModelingByUrlJobRequest, CreatePictureModelingByUrlJobResponse> createPictureModelingByUrlJob =
        genForcreatePictureModelingByUrlJob();

    private static HttpRequestDef<CreatePictureModelingByUrlJobRequest, CreatePictureModelingByUrlJobResponse> genForcreatePictureModelingByUrlJob() {
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
            f -> f.withMarshaller(CreatePictureModelingByUrlJobRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePictureModelingByUrlJobRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePictureModelingByUrlJobRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePictureModelingByUrlJobRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<PictureModelingByUrlReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PictureModelingByUrlReq.class),
            f -> f.withMarshaller(CreatePictureModelingByUrlJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genForcreatePictureModelingJob();

    private static HttpRequestDef<CreatePictureModelingJobRequest, CreatePictureModelingJobResponse> genForcreatePictureModelingJob() {
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
            f -> f.withMarshaller(CreatePictureModelingJobRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePictureModelingJobRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePictureModelingJobRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePictureModelingJobRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<CreatePictureModelingJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePictureModelingJobRequestBody.class),
            f -> f.withMarshaller(CreatePictureModelingJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genForlistPictureModelingJobs();

    private static HttpRequestDef<ListPictureModelingJobsRequest, ListPictureModelingJobsResponse> genForlistPictureModelingJobs() {
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
            f -> f.withMarshaller(ListPictureModelingJobsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPictureModelingJobsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPictureModelingJobsRequest::getState, (req, v) -> {
                req.setState(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPictureModelingJobsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPictureModelingJobsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("create_until",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPictureModelingJobsRequest::getCreateUntil, (req, v) -> {
                req.setCreateUntil(v);
            }));
        builder.<String>withRequestField("create_since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPictureModelingJobsRequest::getCreateSince, (req, v) -> {
                req.setCreateSince(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPictureModelingJobsRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPictureModelingJobsRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPictureModelingJobsRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPictureModelingJobsRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

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
        genForshowPictureModelingJob();

    private static HttpRequestDef<ShowPictureModelingJobRequest, ShowPictureModelingJobResponse> genForshowPictureModelingJob() {
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
            f -> f.withMarshaller(ShowPictureModelingJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPictureModelingJobRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPictureModelingJobRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPictureModelingJobRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPictureModelingJobRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPictureModelingJobResponse::getXRequestId,
                ShowPictureModelingJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ExecuteSmartLiveCommandRequest, ExecuteSmartLiveCommandResponse> executeSmartLiveCommand =
        genForexecuteSmartLiveCommand();

    private static HttpRequestDef<ExecuteSmartLiveCommandRequest, ExecuteSmartLiveCommandResponse> genForexecuteSmartLiveCommand() {
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
            f -> f.withMarshaller(ExecuteSmartLiveCommandRequest::getRoomId, (req, v) -> {
                req.setRoomId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteSmartLiveCommandRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteSmartLiveCommandRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteSmartLiveCommandRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteSmartLiveCommandRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteSmartLiveCommandRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<ControlSmartLiveReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ControlSmartLiveReq.class),
            f -> f.withMarshaller(ExecuteSmartLiveCommandRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genForlistSmartLive();

    private static HttpRequestDef<ListSmartLiveRequest, ListSmartLiveResponse> genForlistSmartLive() {
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
            f -> f.withMarshaller(ListSmartLiveRequest::getRoomId, (req, v) -> {
                req.setRoomId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSmartLiveRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSmartLiveRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRequest::getState, (req, v) -> {
                req.setState(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("create_since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRequest::getCreateSince, (req, v) -> {
                req.setCreateSince(v);
            }));
        builder.<String>withRequestField("create_until",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRequest::getCreateUntil, (req, v) -> {
                req.setCreateUntil(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSmartLiveResponse::getXRequestId, ListSmartLiveResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<LiveEventReportRequest, LiveEventReportResponse> liveEventReport =
        genForliveEventReport();

    private static HttpRequestDef<LiveEventReportRequest, LiveEventReportResponse> genForliveEventReport() {
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
            f -> f.withMarshaller(LiveEventReportRequest::getRoomId, (req, v) -> {
                req.setRoomId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(LiveEventReportRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("auth_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(LiveEventReportRequest::getAuthKey, (req, v) -> {
                req.setAuthKey(v);
            }));
        builder.<Long>withRequestField("expires_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(LiveEventReportRequest::getExpiresTime, (req, v) -> {
                req.setExpiresTime(v);
            }));
        builder.<Boolean>withRequestField("refresh_url",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(LiveEventReportRequest::getRefreshUrl, (req, v) -> {
                req.setRefreshUrl(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(LiveEventReportRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(LiveEventReportRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(LiveEventReportRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(LiveEventReportRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<ReportLiveEventReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReportLiveEventReq.class),
            f -> f.withMarshaller(LiveEventReportRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(LiveEventReportResponse::getXRequestId, LiveEventReportResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowSmartLiveRequest, ShowSmartLiveResponse> showSmartLive =
        genForshowSmartLive();

    private static HttpRequestDef<ShowSmartLiveRequest, ShowSmartLiveResponse> genForshowSmartLive() {
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
            f -> f.withMarshaller(ShowSmartLiveRequest::getRoomId, (req, v) -> {
                req.setRoomId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSmartLiveRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSmartLiveRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSmartLiveRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSmartLiveRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSmartLiveRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowSmartLiveResponse::getXRequestId, ShowSmartLiveResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<StartSmartLiveRequest, StartSmartLiveResponse> startSmartLive =
        genForstartSmartLive();

    private static HttpRequestDef<StartSmartLiveRequest, StartSmartLiveResponse> genForstartSmartLive() {
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
            f -> f.withMarshaller(StartSmartLiveRequest::getRoomId, (req, v) -> {
                req.setRoomId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartSmartLiveRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartSmartLiveRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartSmartLiveRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartSmartLiveRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<StartSmartLiveReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartSmartLiveReq.class),
            f -> f.withMarshaller(StartSmartLiveRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StartSmartLiveResponse::getXRequestId, StartSmartLiveResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<StopSmartLiveRequest, StopSmartLiveResponse> stopSmartLive =
        genForstopSmartLive();

    private static HttpRequestDef<StopSmartLiveRequest, StopSmartLiveResponse> genForstopSmartLive() {
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
            f -> f.withMarshaller(StopSmartLiveRequest::getRoomId, (req, v) -> {
                req.setRoomId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopSmartLiveRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopSmartLiveRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopSmartLiveRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopSmartLiveRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopSmartLiveRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StopSmartLiveResponse::getXRequestId, StopSmartLiveResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CheckTextLanguageRequest, CheckTextLanguageResponse> checkTextLanguage =
        genForcheckTextLanguage();

    private static HttpRequestDef<CheckTextLanguageRequest, CheckTextLanguageResponse> genForcheckTextLanguage() {
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
            f -> f.withMarshaller(CheckTextLanguageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInteractionRuleGroupRequest, CreateInteractionRuleGroupResponse> createInteractionRuleGroup =
        genForcreateInteractionRuleGroup();

    private static HttpRequestDef<CreateInteractionRuleGroupRequest, CreateInteractionRuleGroupResponse> genForcreateInteractionRuleGroup() {
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
            f -> f.withMarshaller(CreateInteractionRuleGroupRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInteractionRuleGroupRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInteractionRuleGroupRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInteractionRuleGroupRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<InteractionRuleGroup>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InteractionRuleGroup.class),
            f -> f.withMarshaller(CreateInteractionRuleGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genForcreateSmartLiveRoom();

    private static HttpRequestDef<CreateSmartLiveRoomRequest, CreateSmartLiveRoomResponse> genForcreateSmartLiveRoom() {
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
            f -> f.withMarshaller(CreateSmartLiveRoomRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSmartLiveRoomRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSmartLiveRoomRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSmartLiveRoomRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<CreateSmartLiveRoomReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSmartLiveRoomReq.class),
            f -> f.withMarshaller(CreateSmartLiveRoomRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genFordeleteInteractionRuleGroup();

    private static HttpRequestDef<DeleteInteractionRuleGroupRequest, DeleteInteractionRuleGroupResponse> genFordeleteInteractionRuleGroup() {
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
            f -> f.withMarshaller(DeleteInteractionRuleGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInteractionRuleGroupRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInteractionRuleGroupRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInteractionRuleGroupRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInteractionRuleGroupRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

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
        genFordeleteSmartLiveRoom();

    private static HttpRequestDef<DeleteSmartLiveRoomRequest, DeleteSmartLiveRoomResponse> genFordeleteSmartLiveRoom() {
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
            f -> f.withMarshaller(DeleteSmartLiveRoomRequest::getRoomId, (req, v) -> {
                req.setRoomId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSmartLiveRoomRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSmartLiveRoomRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSmartLiveRoomRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSmartLiveRoomRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

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
        genForlistInteractionRuleGroups();

    private static HttpRequestDef<ListInteractionRuleGroupsRequest, ListInteractionRuleGroupsResponse> genForlistInteractionRuleGroups() {
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
            f -> f.withMarshaller(ListInteractionRuleGroupsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInteractionRuleGroupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("create_since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInteractionRuleGroupsRequest::getCreateSince, (req, v) -> {
                req.setCreateSince(v);
            }));
        builder.<String>withRequestField("create_until",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInteractionRuleGroupsRequest::getCreateUntil, (req, v) -> {
                req.setCreateUntil(v);
            }));
        builder.<String>withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInteractionRuleGroupsRequest::getGroupName, (req, v) -> {
                req.setGroupName(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInteractionRuleGroupsRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInteractionRuleGroupsRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInteractionRuleGroupsRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInteractionRuleGroupsRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

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
        genForlistSmartLiveRooms();

    private static HttpRequestDef<ListSmartLiveRoomsRequest, ListSmartLiveRoomsResponse> genForlistSmartLiveRooms() {
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
            f -> f.withMarshaller(ListSmartLiveRoomsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSmartLiveRoomsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("room_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRoomsRequest::getRoomName, (req, v) -> {
                req.setRoomName(v);
            }));
        builder.<String>withRequestField("dh_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRoomsRequest::getDhId, (req, v) -> {
                req.setDhId(v);
            }));
        builder.<String>withRequestField("model_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRoomsRequest::getModelName, (req, v) -> {
                req.setModelName(v);
            }));
        builder.<String>withRequestField("live_state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRoomsRequest::getLiveState, (req, v) -> {
                req.setLiveState(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRoomsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRoomsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("room_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRoomsRequest::getRoomType, (req, v) -> {
                req.setRoomType(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRoomsRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRoomsRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRoomsRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSmartLiveRoomsRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

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
        genForshowSmartLiveRoom();

    private static HttpRequestDef<ShowSmartLiveRoomRequest, ShowSmartLiveRoomResponse> genForshowSmartLiveRoom() {
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
            f -> f.withMarshaller(ShowSmartLiveRoomRequest::getRoomId, (req, v) -> {
                req.setRoomId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSmartLiveRoomRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSmartLiveRoomRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSmartLiveRoomRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSmartLiveRoomRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowSmartLiveRoomResponse::getXRequestId, ShowSmartLiveRoomResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateInteractionRuleGroupRequest, UpdateInteractionRuleGroupResponse> updateInteractionRuleGroup =
        genForupdateInteractionRuleGroup();

    private static HttpRequestDef<UpdateInteractionRuleGroupRequest, UpdateInteractionRuleGroupResponse> genForupdateInteractionRuleGroup() {
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
            f -> f.withMarshaller(UpdateInteractionRuleGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInteractionRuleGroupRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInteractionRuleGroupRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInteractionRuleGroupRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInteractionRuleGroupRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<InteractionRuleGroup>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InteractionRuleGroup.class),
            f -> f.withMarshaller(UpdateInteractionRuleGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genForupdateSmartLiveRoom();

    private static HttpRequestDef<UpdateSmartLiveRoomRequest, UpdateSmartLiveRoomResponse> genForupdateSmartLiveRoom() {
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
            f -> f.withMarshaller(UpdateSmartLiveRoomRequest::getRoomId, (req, v) -> {
                req.setRoomId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSmartLiveRoomRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSmartLiveRoomRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSmartLiveRoomRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSmartLiveRoomRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<CreateSmartLiveRoomReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSmartLiveRoomReq.class),
            f -> f.withMarshaller(UpdateSmartLiveRoomRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateSmartLiveRoomResponse::getXRequestId,
                UpdateSmartLiveRoomResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListStylesRequest, ListStylesResponse> listStyles = genForlistStyles();

    private static HttpRequestDef<ListStylesRequest, ListStylesResponse> genForlistStyles() {
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
            f -> f.withMarshaller(ListStylesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStylesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStylesRequest::getState, (req, v) -> {
                req.setState(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStylesRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStylesRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("create_until",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStylesRequest::getCreateUntil, (req, v) -> {
                req.setCreateUntil(v);
            }));
        builder.<String>withRequestField("create_since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStylesRequest::getCreateSince, (req, v) -> {
                req.setCreateSince(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStylesRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStylesRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStylesRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStylesRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListStylesResponse::getXRequestId, ListStylesResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CommitVoiceTrainingJobRequest, CommitVoiceTrainingJobResponse> commitVoiceTrainingJob =
        genForcommitVoiceTrainingJob();

    private static HttpRequestDef<CommitVoiceTrainingJobRequest, CommitVoiceTrainingJobResponse> genForcommitVoiceTrainingJob() {
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
            f -> f.withMarshaller(CommitVoiceTrainingJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CommitVoiceTrainingJobRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CommitVoiceTrainingJobRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CommitVoiceTrainingJobRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CommitVoiceTrainingJobRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ConfirmTrainingSegmentRequest, ConfirmTrainingSegmentResponse> confirmTrainingSegment =
        genForconfirmTrainingSegment();

    private static HttpRequestDef<ConfirmTrainingSegmentRequest, ConfirmTrainingSegmentResponse> genForconfirmTrainingSegment() {
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
            f -> f.withMarshaller(ConfirmTrainingSegmentRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<Integer>withRequestField("index",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ConfirmTrainingSegmentRequest::getIndex, (req, v) -> {
                req.setIndex(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTrainingAdvanceJobRequest, CreateTrainingAdvanceJobResponse> createTrainingAdvanceJob =
        genForcreateTrainingAdvanceJob();

    private static HttpRequestDef<CreateTrainingAdvanceJobRequest, CreateTrainingAdvanceJobResponse> genForcreateTrainingAdvanceJob() {
        // basic
        HttpRequestDef.Builder<CreateTrainingAdvanceJobRequest, CreateTrainingAdvanceJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateTrainingAdvanceJobRequest.class, CreateTrainingAdvanceJobResponse.class)
                .withName("CreateTrainingAdvanceJob")
                .withUri("/v1/{project_id}/voice-training-manage/user/advance-jobs")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTrainingAdvanceJobRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<CreateTrainingJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTrainingJobReq.class),
            f -> f.withMarshaller(CreateTrainingAdvanceJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTrainingBasicJobRequest, CreateTrainingBasicJobResponse> createTrainingBasicJob =
        genForcreateTrainingBasicJob();

    private static HttpRequestDef<CreateTrainingBasicJobRequest, CreateTrainingBasicJobResponse> genForcreateTrainingBasicJob() {
        // basic
        HttpRequestDef.Builder<CreateTrainingBasicJobRequest, CreateTrainingBasicJobResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateTrainingBasicJobRequest.class, CreateTrainingBasicJobResponse.class)
            .withName("CreateTrainingBasicJob")
            .withUri("/v1/{project_id}/voice-training-manage/user/basic-jobs")
            .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTrainingBasicJobRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTrainingBasicJobRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTrainingBasicJobRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTrainingBasicJobRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<CreateTrainingJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTrainingJobReq.class),
            f -> f.withMarshaller(CreateTrainingBasicJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTrainingMiddleJobRequest, CreateTrainingMiddleJobResponse> createTrainingMiddleJob =
        genForcreateTrainingMiddleJob();

    private static HttpRequestDef<CreateTrainingMiddleJobRequest, CreateTrainingMiddleJobResponse> genForcreateTrainingMiddleJob() {
        // basic
        HttpRequestDef.Builder<CreateTrainingMiddleJobRequest, CreateTrainingMiddleJobResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateTrainingMiddleJobRequest.class, CreateTrainingMiddleJobResponse.class)
            .withName("CreateTrainingMiddleJob")
            .withUri("/v1/{project_id}/voice-training-manage/user/middle-jobs")
            .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTrainingMiddleJobRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTrainingMiddleJobRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTrainingMiddleJobRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTrainingMiddleJobRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<CreateTrainingJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTrainingJobReq.class),
            f -> f.withMarshaller(CreateTrainingMiddleJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVoiceTrainingJobRequest, DeleteVoiceTrainingJobResponse> deleteVoiceTrainingJob =
        genFordeleteVoiceTrainingJob();

    private static HttpRequestDef<DeleteVoiceTrainingJobRequest, DeleteVoiceTrainingJobResponse> genFordeleteVoiceTrainingJob() {
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
            f -> f.withMarshaller(DeleteVoiceTrainingJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVoiceTrainingJobRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVoiceTrainingJobRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVoiceTrainingJobRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVoiceTrainingJobRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVoiceTrainingJobRequest, ListVoiceTrainingJobResponse> listVoiceTrainingJob =
        genForlistVoiceTrainingJob();

    private static HttpRequestDef<ListVoiceTrainingJobRequest, ListVoiceTrainingJobResponse> genForlistVoiceTrainingJob() {
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
            f -> f.withMarshaller(ListVoiceTrainingJobRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVoiceTrainingJobRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("create_until",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVoiceTrainingJobRequest::getCreateUntil, (req, v) -> {
                req.setCreateUntil(v);
            }));
        builder.<String>withRequestField("create_since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVoiceTrainingJobRequest::getCreateSince, (req, v) -> {
                req.setCreateSince(v);
            }));
        builder.<String>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVoiceTrainingJobRequest::getState, (req, v) -> {
                req.setState(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVoiceTrainingJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("voice_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVoiceTrainingJobRequest::getVoiceName, (req, v) -> {
                req.setVoiceName(v);
            }));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVoiceTrainingJobRequest::getTag, (req, v) -> {
                req.setTag(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVoiceTrainingJobRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobAuditResultRequest, ShowJobAuditResultResponse> showJobAuditResult =
        genForshowJobAuditResult();

    private static HttpRequestDef<ShowJobAuditResultRequest, ShowJobAuditResultResponse> genForshowJobAuditResult() {
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
            f -> f.withMarshaller(ShowJobAuditResultRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobUploadingAddressRequest, ShowJobUploadingAddressResponse> showJobUploadingAddress =
        genForshowJobUploadingAddress();

    private static HttpRequestDef<ShowJobUploadingAddressRequest, ShowJobUploadingAddressResponse> genForshowJobUploadingAddress() {
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
            f -> f.withMarshaller(ShowJobUploadingAddressRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTrainingSegmentInfoRequest, ShowTrainingSegmentInfoResponse> showTrainingSegmentInfo =
        genForshowTrainingSegmentInfo();

    private static HttpRequestDef<ShowTrainingSegmentInfoRequest, ShowTrainingSegmentInfoResponse> genForshowTrainingSegmentInfo() {
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
            f -> f.withMarshaller(ShowTrainingSegmentInfoRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVoiceTrainingJobRequest, ShowVoiceTrainingJobResponse> showVoiceTrainingJob =
        genForshowVoiceTrainingJob();

    private static HttpRequestDef<ShowVoiceTrainingJobRequest, ShowVoiceTrainingJobResponse> genForshowVoiceTrainingJob() {
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
            f -> f.withMarshaller(ShowVoiceTrainingJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVoiceTrainingJobRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVoiceTrainingJobRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVoiceTrainingJobRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVoiceTrainingJobRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<Create2dModelTrainingJobRequest, Create2dModelTrainingJobResponse> create2dModelTrainingJob =
        genForcreate2dModelTrainingJob();

    private static HttpRequestDef<Create2dModelTrainingJobRequest, Create2dModelTrainingJobResponse> genForcreate2dModelTrainingJob() {
        // basic
        HttpRequestDef.Builder<Create2dModelTrainingJobRequest, Create2dModelTrainingJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, Create2dModelTrainingJobRequest.class, Create2dModelTrainingJobResponse.class)
                .withName("Create2dModelTrainingJob")
                .withUri("/v1/{project_id}/digital-human-training-manage/user/jobs")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Create2dModelTrainingJobRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Create2dModelTrainingJobRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Create2dModelTrainingJobRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Create2dModelTrainingJobRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<Create2dModelTrainingJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Create2dModelTrainingJobReq.class),
            f -> f.withMarshaller(Create2dModelTrainingJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genFordelete2dModelTrainingJob();

    private static HttpRequestDef<Delete2dModelTrainingJobRequest, Delete2dModelTrainingJobResponse> genFordelete2dModelTrainingJob() {
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
            f -> f.withMarshaller(Delete2dModelTrainingJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Delete2dModelTrainingJobRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Delete2dModelTrainingJobRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Delete2dModelTrainingJobRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Delete2dModelTrainingJobRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

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
        genForexecute2dModelTrainingCommandByUser();

    private static HttpRequestDef<Execute2dModelTrainingCommandByUserRequest, Execute2dModelTrainingCommandByUserResponse> genForexecute2dModelTrainingCommandByUser() {
        // basic
        HttpRequestDef.Builder<Execute2dModelTrainingCommandByUserRequest, Execute2dModelTrainingCommandByUserResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    Execute2dModelTrainingCommandByUserRequest.class,
                    Execute2dModelTrainingCommandByUserResponse.class)
                .withName("Execute2dModelTrainingCommandByUser")
                .withUri("/v1/{project_id}/digital-human-training-manage/user/jobs/{job_id}/command")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Execute2dModelTrainingCommandByUserRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Execute2dModelTrainingCommandByUserRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Execute2dModelTrainingCommandByUserRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Execute2dModelTrainingCommandByUserRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Execute2dModelTrainingCommandByUserRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<Execute2dModelTrainingCommandByUserReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Execute2dModelTrainingCommandByUserReq.class),
            f -> f.withMarshaller(Execute2dModelTrainingCommandByUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genForlist2dModelTrainingJob();

    private static HttpRequestDef<List2dModelTrainingJobRequest, List2dModelTrainingJobResponse> genForlist2dModelTrainingJob() {
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
            f -> f.withMarshaller(List2dModelTrainingJobRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(List2dModelTrainingJobRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(List2dModelTrainingJobRequest::getState, (req, v) -> {
                req.setState(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(List2dModelTrainingJobRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(List2dModelTrainingJobRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("create_until",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(List2dModelTrainingJobRequest::getCreateUntil, (req, v) -> {
                req.setCreateUntil(v);
            }));
        builder.<String>withRequestField("create_since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(List2dModelTrainingJobRequest::getCreateSince, (req, v) -> {
                req.setCreateSince(v);
            }));
        builder.<String>withRequestField("batch_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(List2dModelTrainingJobRequest::getBatchName, (req, v) -> {
                req.setBatchName(v);
            }));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(List2dModelTrainingJobRequest::getTag, (req, v) -> {
                req.setTag(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(List2dModelTrainingJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(List2dModelTrainingJobRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(List2dModelTrainingJobRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(List2dModelTrainingJobRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(List2dModelTrainingJobRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(List2dModelTrainingJobRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

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
        genForshow2dModelTrainingJob();

    private static HttpRequestDef<Show2dModelTrainingJobRequest, Show2dModelTrainingJobResponse> genForshow2dModelTrainingJob() {
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
            f -> f.withMarshaller(Show2dModelTrainingJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Show2dModelTrainingJobRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Show2dModelTrainingJobRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Show2dModelTrainingJobRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Show2dModelTrainingJobRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

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
        genForupdate2dModelTrainingJob();

    private static HttpRequestDef<Update2dModelTrainingJobRequest, Update2dModelTrainingJobResponse> genForupdate2dModelTrainingJob() {
        // basic
        HttpRequestDef.Builder<Update2dModelTrainingJobRequest, Update2dModelTrainingJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, Update2dModelTrainingJobRequest.class, Update2dModelTrainingJobResponse.class)
                .withName("Update2dModelTrainingJob")
                .withUri("/v1/{project_id}/digital-human-training-manage/user/jobs/{job_id}")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Update2dModelTrainingJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Update2dModelTrainingJobRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Update2dModelTrainingJobRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Update2dModelTrainingJobRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Update2dModelTrainingJobRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<Create2dModelTrainingJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Create2dModelTrainingJobReq.class),
            f -> f.withMarshaller(Update2dModelTrainingJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genForcreateFacialAnimations();

    private static HttpRequestDef<CreateFacialAnimationsRequest, CreateFacialAnimationsResponse> genForcreateFacialAnimations() {
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
            f -> f.withMarshaller(CreateFacialAnimationsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateFacialAnimationsResponse::getXRequestId,
                CreateFacialAnimationsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateTtsaRequest, CreateTtsaResponse> createTtsa = genForcreateTtsa();

    private static HttpRequestDef<CreateTtsaRequest, CreateTtsaResponse> genForcreateTtsa() {
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
            f -> f.withMarshaller(CreateTtsaRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTtsaRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTtsaRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTtsaRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<CreateTTSAReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTTSAReq.class),
            f -> f.withMarshaller(CreateTtsaRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateTtsaResponse::getXRequestId, CreateTtsaResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListFacialAnimationsDataRequest, ListFacialAnimationsDataResponse> listFacialAnimationsData =
        genForlistFacialAnimationsData();

    private static HttpRequestDef<ListFacialAnimationsDataRequest, ListFacialAnimationsDataResponse> genForlistFacialAnimationsData() {
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
            f -> f.withMarshaller(ListFacialAnimationsDataRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTtsaDataRequest, ListTtsaDataResponse> listTtsaData = genForlistTtsaData();

    private static HttpRequestDef<ListTtsaDataRequest, ListTtsaDataResponse> genForlistTtsaData() {
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
            f -> f.withMarshaller(ListTtsaDataRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTtsaDataRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTtsaDataRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTtsaDataRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTtsaDataRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTtsaDataResponse::getXRequestId, ListTtsaDataResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListTtsaJobsRequest, ListTtsaJobsResponse> listTtsaJobs = genForlistTtsaJobs();

    private static HttpRequestDef<ListTtsaJobsRequest, ListTtsaJobsResponse> genForlistTtsaJobs() {
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
            f -> f.withMarshaller(ListTtsaJobsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTtsaJobsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTtsaJobsRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTtsaJobsRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTtsaJobsRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTtsaJobsRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTtsaJobsResponse::getXRequestId, ListTtsaJobsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateTtsAuditionRequest, CreateTtsAuditionResponse> createTtsAudition =
        genForcreateTtsAudition();

    private static HttpRequestDef<CreateTtsAuditionRequest, CreateTtsAuditionResponse> genForcreateTtsAudition() {
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
            f -> f.withMarshaller(CreateTtsAuditionRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTtsAuditionRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTtsAuditionRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTtsAuditionRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTtsAuditionRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<CreateTtsAuditionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTtsAuditionRequestBody.class),
            f -> f.withMarshaller(CreateTtsAuditionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTtsAuditionFileRequest, ShowTtsAuditionFileResponse> showTtsAuditionFile =
        genForshowTtsAuditionFile();

    private static HttpRequestDef<ShowTtsAuditionFileRequest, ShowTtsAuditionFileResponse> genForshowTtsAuditionFile() {
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
            f -> f.withMarshaller(ShowTtsAuditionFileRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTtsAuditionFileRequest::getXRequestId, (req, v) -> {
                req.setXRequestId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTtsAuditionFileRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTtsAuditionFileRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTtsAuditionFileRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTtsAuditionFileRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVideoMotionCaptureJobRequest, CreateVideoMotionCaptureJobResponse> createVideoMotionCaptureJob =
        genForcreateVideoMotionCaptureJob();

    private static HttpRequestDef<CreateVideoMotionCaptureJobRequest, CreateVideoMotionCaptureJobResponse> genForcreateVideoMotionCaptureJob() {
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
            f -> f.withMarshaller(CreateVideoMotionCaptureJobRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVideoMotionCaptureJobRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVideoMotionCaptureJobRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVideoMotionCaptureJobRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<String>withRequestField("X-User-Privilege",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVideoMotionCaptureJobRequest::getXUserPrivilege, (req, v) -> {
                req.setXUserPrivilege(v);
            }));
        builder.<VideoMotionCaptureJobReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VideoMotionCaptureJobReq.class),
            f -> f.withMarshaller(CreateVideoMotionCaptureJobRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genForexecuteVideoMotionCaptureCommand();

    private static HttpRequestDef<ExecuteVideoMotionCaptureCommandRequest, ExecuteVideoMotionCaptureCommandResponse> genForexecuteVideoMotionCaptureCommand() {
        // basic
        HttpRequestDef.Builder<ExecuteVideoMotionCaptureCommandRequest, ExecuteVideoMotionCaptureCommandResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ExecuteVideoMotionCaptureCommandRequest.class,
                    ExecuteVideoMotionCaptureCommandResponse.class)
                .withName("ExecuteVideoMotionCaptureCommand")
                .withUri("/v1/{project_id}/video-motion-capture-jobs/{job_id}/command")
                .withContentType("application/json;charset=utf-8");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteVideoMotionCaptureCommandRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteVideoMotionCaptureCommandRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteVideoMotionCaptureCommandRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteVideoMotionCaptureCommandRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteVideoMotionCaptureCommandRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<ControlDigitalHumanLiveReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ControlDigitalHumanLiveReq.class),
            f -> f.withMarshaller(ExecuteVideoMotionCaptureCommandRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genForlistVideoMotionCaptureJobs();

    private static HttpRequestDef<ListVideoMotionCaptureJobsRequest, ListVideoMotionCaptureJobsResponse> genForlistVideoMotionCaptureJobs() {
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
            f -> f.withMarshaller(ListVideoMotionCaptureJobsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVideoMotionCaptureJobsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVideoMotionCaptureJobsRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVideoMotionCaptureJobsRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVideoMotionCaptureJobsRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVideoMotionCaptureJobsRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

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
        genForshowVideoMotionCaptureJob();

    private static HttpRequestDef<ShowVideoMotionCaptureJobRequest, ShowVideoMotionCaptureJobResponse> genForshowVideoMotionCaptureJob() {
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
            f -> f.withMarshaller(ShowVideoMotionCaptureJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVideoMotionCaptureJobRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVideoMotionCaptureJobRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVideoMotionCaptureJobRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVideoMotionCaptureJobRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

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
        genForstopVideoMotionCaptureJob();

    private static HttpRequestDef<StopVideoMotionCaptureJobRequest, StopVideoMotionCaptureJobResponse> genForstopVideoMotionCaptureJob() {
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
            f -> f.withMarshaller(StopVideoMotionCaptureJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopVideoMotionCaptureJobRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopVideoMotionCaptureJobRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopVideoMotionCaptureJobRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopVideoMotionCaptureJobRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StopVideoMotionCaptureJobResponse::getXRequestId,
                StopVideoMotionCaptureJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateVideoScriptsRequest, CreateVideoScriptsResponse> createVideoScripts =
        genForcreateVideoScripts();

    private static HttpRequestDef<CreateVideoScriptsRequest, CreateVideoScriptsResponse> genForcreateVideoScripts() {
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
            f -> f.withMarshaller(CreateVideoScriptsRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVideoScriptsRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVideoScriptsRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVideoScriptsRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<CreateVideoScriptsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVideoScriptsReq.class),
            f -> f.withMarshaller(CreateVideoScriptsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genFordeleteVideoScript();

    private static HttpRequestDef<DeleteVideoScriptRequest, DeleteVideoScriptResponse> genFordeleteVideoScript() {
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
            f -> f.withMarshaller(DeleteVideoScriptRequest::getScriptId, (req, v) -> {
                req.setScriptId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVideoScriptRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVideoScriptRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVideoScriptRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVideoScriptRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteVideoScriptResponse::getXRequestId, DeleteVideoScriptResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListVideoScriptsRequest, ListVideoScriptsResponse> listVideoScripts =
        genForlistVideoScripts();

    private static HttpRequestDef<ListVideoScriptsRequest, ListVideoScriptsResponse> genForlistVideoScripts() {
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
            f -> f.withMarshaller(ListVideoScriptsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVideoScriptsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVideoScriptsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<ListVideoScriptsRequest.ScriptCatalogEnum>withRequestField("script_catalog",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListVideoScriptsRequest.ScriptCatalogEnum.class),
            f -> f.withMarshaller(ListVideoScriptsRequest::getScriptCatalog, (req, v) -> {
                req.setScriptCatalog(v);
            }));
        builder.<ListVideoScriptsRequest.ViewModeEnum>withRequestField("view_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListVideoScriptsRequest.ViewModeEnum.class),
            f -> f.withMarshaller(ListVideoScriptsRequest::getViewMode, (req, v) -> {
                req.setViewMode(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVideoScriptsRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVideoScriptsRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVideoScriptsRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVideoScriptsRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVideoScriptsResponse::getXRequestId, ListVideoScriptsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowVideoScriptRequest, ShowVideoScriptResponse> showVideoScript =
        genForshowVideoScript();

    private static HttpRequestDef<ShowVideoScriptRequest, ShowVideoScriptResponse> genForshowVideoScript() {
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
            f -> f.withMarshaller(ShowVideoScriptRequest::getScriptId, (req, v) -> {
                req.setScriptId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVideoScriptRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVideoScriptRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVideoScriptRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVideoScriptRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowVideoScriptResponse::getXRequestId, ShowVideoScriptResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateVideoScriptRequest, UpdateVideoScriptResponse> updateVideoScript =
        genForupdateVideoScript();

    private static HttpRequestDef<UpdateVideoScriptRequest, UpdateVideoScriptResponse> genForupdateVideoScript() {
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
            f -> f.withMarshaller(UpdateVideoScriptRequest::getScriptId, (req, v) -> {
                req.setScriptId(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVideoScriptRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVideoScriptRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVideoScriptRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));
        builder.<String>withRequestField("X-App-UserId",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVideoScriptRequest::getXAppUserId, (req, v) -> {
                req.setXAppUserId(v);
            }));
        builder.<UpdateVideoScriptsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateVideoScriptsReq.class),
            f -> f.withMarshaller(UpdateVideoScriptRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateVideoScriptResponse::getXRequestId, UpdateVideoScriptResponse::setXRequestId));
        return builder.build();
    }

}

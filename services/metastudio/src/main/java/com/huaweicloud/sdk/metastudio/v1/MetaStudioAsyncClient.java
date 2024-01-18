package com.huaweicloud.sdk.metastudio.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.metastudio.v1.model.Cancel2DDigitalHumanVideoRequest;
import com.huaweicloud.sdk.metastudio.v1.model.Cancel2DDigitalHumanVideoResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CancelPhotoDigitalHumanVideoRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CancelPhotoDigitalHumanVideoResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CheckTextLanguageRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CheckTextLanguageResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CommitVoiceTrainingJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CommitVoiceTrainingJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ConfirmFileUploadRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ConfirmFileUploadResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ConfirmTrainingSegmentRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ConfirmTrainingSegmentResponse;
import com.huaweicloud.sdk.metastudio.v1.model.Create2DDigitalHumanVideoRequest;
import com.huaweicloud.sdk.metastudio.v1.model.Create2DDigitalHumanVideoResponse;
import com.huaweicloud.sdk.metastudio.v1.model.Create2dModelTrainingJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.Create2dModelTrainingJobResponse;
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
import com.huaweicloud.sdk.metastudio.v1.model.CreateInteractionRuleGroupRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateInteractionRuleGroupResponse;
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
import com.huaweicloud.sdk.metastudio.v1.model.Execute2dModelTrainingCommandByUserRequest;
import com.huaweicloud.sdk.metastudio.v1.model.Execute2dModelTrainingCommandByUserResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ExecuteSmartLiveCommandRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ExecuteSmartLiveCommandResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ExecuteVideoMotionCaptureCommandRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ExecuteVideoMotionCaptureCommandResponse;
import com.huaweicloud.sdk.metastudio.v1.model.List2dModelTrainingJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.List2dModelTrainingJobResponse;
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
import com.huaweicloud.sdk.metastudio.v1.model.ListInteractionRuleGroupsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListInteractionRuleGroupsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListPictureModelingJobsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListPictureModelingJobsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListRobotRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListRobotResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListSmartChatRoomsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListSmartChatRoomsResponse;
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
import com.huaweicloud.sdk.metastudio.v1.model.UpdateDigitalAssetRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateDigitalAssetResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateDigitalHumanBusinessCardRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateDigitalHumanBusinessCardResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateInteractionRuleGroupRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateInteractionRuleGroupResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateRobotRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateRobotResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateSmartChatRoomRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateSmartChatRoomResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateSmartLiveRoomRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateSmartLiveRoomResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateVideoScriptRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateVideoScriptResponse;

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
     * 创建资产
     *
     * 该接口用于在资产库中添加上传新的媒体资产。可上传的资产类型包括：分身数字人模型、背景图片、素材图片、素材视频、PPT等。
     * * &gt; 资产类型是IMAGE时，通过system_properties来区分背景图片（BACKGROUND_IMG）、素材图片（MATERIAL_IMG）。
     * * &gt; 资产类型是VIDEO时，通过system_properties来区分素材视频（MATERIAL_VIDEO）、名片视频（BUSSINESS_CARD_VIDEO）。
     * * &gt; MetaStudio平台生成的视频，system_properties带CREATED_BY_PLATFORM。
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
     * * &gt; 资产类型是IMAGE时，通过system_properties来区分背景图片（BACKGROUND_IMG）、素材图片（MATERIAL_IMG）。
     * * &gt; 资产类型是VIDEO时，通过system_properties来区分素材视频（MATERIAL_VIDEO）、名片视频（BUSSINESS_CARD_VIDEO）。
     * * &gt; MetaStudio平台生成的视频，system_properties带CREATED_BY_PLATFORM。
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
     * 该接口用于删除资产库中的媒体资产。第一次调用删除接口，将指定资产放入回收站；第二次调用删除接口，将指定资产彻底删除。
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
     * 该接口用于删除资产库中的媒体资产。第一次调用删除接口，将指定资产放入回收站；第二次调用删除接口，将指定资产彻底删除。
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
     * 创建一次性鉴权码
     *
     * 该接口用于创建一次性鉴权码。
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
     * 该接口用于创建一次性鉴权码。
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
     * 创建智能交互对话直播间
     *
     * 该接口用于创建智能交互对话直播间。
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
     * 创建智能交互对话直播间
     *
     * 该接口用于创建智能交互对话直播间。
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
     * 删除智能交互对话直播间
     *
     * 该接口用于删除智能交互对话直播间。
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
     * 删除智能交互对话直播间
     *
     * 该接口用于删除智能交互对话直播间。
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
     * 查询智能交互对话直播间列表
     *
     * 该接口用于智能交互对话直播间列表。
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
     * 查询智能交互对话直播间列表
     *
     * 该接口用于智能交互对话直播间列表。
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
     * 查询智能交互对话直播间详情
     *
     * 该接口用于查询智能交互对话直播间详情。
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
     * 查询智能交互对话直播间详情
     *
     * 该接口用于查询智能交互对话直播间详情。
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
     * 更新智能交互对话直播间信息
     *
     * 该接口用于智能交互对话直播间信息。
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
     * 更新智能交互对话直播间信息
     *
     * 该接口用于智能交互对话直播间信息。
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
     * 查询数字人智能直播任务列表
     *
     * 该接口用于查询数字人智能直播任务列表。
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
     * 查询数字人智能直播任务列表
     *
     * 该接口用于查询数字人智能直播任务列表。
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
     * 检测音色与文本的语言一致性
     *
     * 检测音色与文本的语言一致性，音色与文本不一致会导致报错
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckTextLanguageRequest 请求对象
     * @return CompletableFuture<CheckTextLanguageResponse>
     */
    public CompletableFuture<CheckTextLanguageResponse> checkTextLanguageAsync(CheckTextLanguageRequest request) {
        return hcClient.asyncInvokeHttp(request, MetaStudioMeta.checkTextLanguage);
    }

    /**
     * 检测音色与文本的语言一致性
     *
     * 检测音色与文本的语言一致性，音色与文本不一致会导致报错
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckTextLanguageRequest 请求对象
     * @return AsyncInvoker<CheckTextLanguageRequest, CheckTextLanguageResponse>
     */
    public AsyncInvoker<CheckTextLanguageRequest, CheckTextLanguageResponse> checkTextLanguageAsyncInvoker(
        CheckTextLanguageRequest request) {
        return new AsyncInvoker<>(request, MetaStudioMeta.checkTextLanguage, hcClient);
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
     * 用户创建语音训练基础版任务,该接口会返回一个obs上传地址，用于上传语音文件。
     * 仅支持zip包方式上传语音文件：
     * * 语音文件打包成zip上传：上传的训练数据为一个zip格式压缩文件,其中包含一段wav格式的长音频文件。
     * 
     * &gt; * 文件上传后，调用“提交语音训练任务”接口，启动审核和训练。
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
     * 用户创建语音训练基础版任务,该接口会返回一个obs上传地址，用于上传语音文件。
     * 仅支持zip包方式上传语音文件：
     * * 语音文件打包成zip上传：上传的训练数据为一个zip格式压缩文件,其中包含一段wav格式的长音频文件。
     * 
     * &gt; * 文件上传后，调用“提交语音训练任务”接口，启动审核和训练。
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
     * 用户创建语音训练基础版任务,该接口会返回一个obs上传地址，用于上传语音文件。
     * 支持2种方式上传语音文件：
     * * 语音文件和文本文件打包成zip上传：语音文件已经切分成20个wav文件，每个语音文件对应一个txt文本文件，所有文件打包成zip文件。语音文件命名规则：0.wav~19.wav；文本文件命名规则：0.txt~19.txt。
     * * 语音文件和文本文件逐句上传：每次上传一句语料的语音文件和文本文件，再调用“确认在线录音结果”接口确认语音和文本内容是否一致。确认成功后再上传和确认下一句。
     * 
     * &gt; * 文件上传后，调用“提交语音训练任务”接口，启动审核和训练。
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
     * 用户创建语音训练基础版任务,该接口会返回一个obs上传地址，用于上传语音文件。
     * 支持2种方式上传语音文件：
     * * 语音文件和文本文件打包成zip上传：语音文件已经切分成20个wav文件，每个语音文件对应一个txt文本文件，所有文件打包成zip文件。语音文件命名规则：0.wav~19.wav；文本文件命名规则：0.txt~19.txt。
     * * 语音文件和文本文件逐句上传：每次上传一句语料的语音文件和文本文件，再调用“确认在线录音结果”接口确认语音和文本内容是否一致。确认成功后再上传和确认下一句。
     * 
     * &gt; * 文件上传后，调用“提交语音训练任务”接口，启动审核和训练。
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
     * 用户创建语音训练基础版任务,该接口会返回一个obs上传地址，用于上传语音文件。
     * 支持2种方式上传语音文件：
     * * 语音文件和文本文件打包成zip上传：语音文件已经切分成100个wav文件，每个语音文件对应一个txt文本文件，所有文件打包成zip文件。语音文件命名规则：0.wav~99.wav；文本文件命名规则：0.txt~99.txt。
     * * 语音文件和文本文件逐句上传：每次上传一句语料的语音文件和文本文件，再调用“确认在线录音结果”接口确认语音和文本内容是否一致。确认成功后再上传和确认下一句。
     * 
     * &gt; * 文件上传后，调用“提交语音训练任务”接口，启动审核和训练。
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
     * 用户创建语音训练基础版任务,该接口会返回一个obs上传地址，用于上传语音文件。
     * 支持2种方式上传语音文件：
     * * 语音文件和文本文件打包成zip上传：语音文件已经切分成100个wav文件，每个语音文件对应一个txt文本文件，所有文件打包成zip文件。语音文件命名规则：0.wav~99.wav；文本文件命名规则：0.txt~99.txt。
     * * 语音文件和文本文件逐句上传：每次上传一句语料的语音文件和文本文件，再调用“确认在线录音结果”接口确认语音和文本内容是否一致。确认成功后再上传和确认下一句。
     * 
     * &gt; * 文件上传后，调用“提交语音训练任务”接口，启动审核和训练。
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

}

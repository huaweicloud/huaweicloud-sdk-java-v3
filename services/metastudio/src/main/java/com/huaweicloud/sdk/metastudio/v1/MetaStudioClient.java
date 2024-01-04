package com.huaweicloud.sdk.metastudio.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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
import com.huaweicloud.sdk.metastudio.v1.model.CreatePhotoDetectionRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePhotoDetectionResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePhotoDigitalHumanVideoRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePhotoDigitalHumanVideoResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePictureModelingByUrlJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePictureModelingByUrlJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePictureModelingJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePictureModelingJobResponse;
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
import com.huaweicloud.sdk.metastudio.v1.model.StartSmartLiveRequest;
import com.huaweicloud.sdk.metastudio.v1.model.StartSmartLiveResponse;
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
import com.huaweicloud.sdk.metastudio.v1.model.UpdateSmartLiveRoomRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateSmartLiveRoomResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateVideoScriptRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateVideoScriptResponse;

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
     * 创建资产
     *
     * 该接口用于在资产库中添加上传新的媒体资产。可上传的资产类型包括：分身数字人模型、背景图片、素材图片、素材视频、PPT等。
     * * &gt; 资产类型是IMAGE时，通过system_properties来区分背景图片（BACKGROUND_IMG）、素材图片（MATERIAL_IMG）。
     * * &gt; 资产类型是VIDEO时，通过system_properties来区分素材视频（MATERIAL_VIDEO）、名片视频（BUSSINESS_CARD_VIDEO）。
     * * &gt; MetaStudio平台生成的视频，system_properties带CREATED_BY_PLATFORM。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDigitalAssetRequest 请求对象
     * @return CreateDigitalAssetResponse
     */
    public CreateDigitalAssetResponse createDigitalAsset(CreateDigitalAssetRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.createDigitalAsset);
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
     * @param CreateDigitalAssetRequest 请求对象
     * @return SyncInvoker<CreateDigitalAssetRequest, CreateDigitalAssetResponse>
     */
    public SyncInvoker<CreateDigitalAssetRequest, CreateDigitalAssetResponse> createDigitalAssetInvoker(
        CreateDigitalAssetRequest request) {
        return new SyncInvoker<CreateDigitalAssetRequest, CreateDigitalAssetResponse>(request,
            MetaStudioMeta.createDigitalAsset, hcClient);
    }

    /**
     * 删除资产
     *
     * 该接口用于删除资产库中的媒体资产。第一次调用删除接口，将指定资产放入回收站；第二次调用删除接口，将指定资产彻底删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAssetRequest 请求对象
     * @return DeleteAssetResponse
     */
    public DeleteAssetResponse deleteAsset(DeleteAssetRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.deleteAsset);
    }

    /**
     * 删除资产
     *
     * 该接口用于删除资产库中的媒体资产。第一次调用删除接口，将指定资产放入回收站；第二次调用删除接口，将指定资产彻底删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAssetRequest 请求对象
     * @return SyncInvoker<DeleteAssetRequest, DeleteAssetResponse>
     */
    public SyncInvoker<DeleteAssetRequest, DeleteAssetResponse> deleteAssetInvoker(DeleteAssetRequest request) {
        return new SyncInvoker<DeleteAssetRequest, DeleteAssetResponse>(request, MetaStudioMeta.deleteAsset, hcClient);
    }

    /**
     * 查询资产概要
     *
     * 该接口用于查询媒体资产库中指定的多个资产的概要信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAssetSummaryRequest 请求对象
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
     * @param ListAssetSummaryRequest 请求对象
     * @return SyncInvoker<ListAssetSummaryRequest, ListAssetSummaryResponse>
     */
    public SyncInvoker<ListAssetSummaryRequest, ListAssetSummaryResponse> listAssetSummaryInvoker(
        ListAssetSummaryRequest request) {
        return new SyncInvoker<ListAssetSummaryRequest, ListAssetSummaryResponse>(request,
            MetaStudioMeta.listAssetSummary, hcClient);
    }

    /**
     * 查询资产列表
     *
     * 该接口用于查询资产库中的媒体资产列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAssetsRequest 请求对象
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
     * @param ListAssetsRequest 请求对象
     * @return SyncInvoker<ListAssetsRequest, ListAssetsResponse>
     */
    public SyncInvoker<ListAssetsRequest, ListAssetsResponse> listAssetsInvoker(ListAssetsRequest request) {
        return new SyncInvoker<ListAssetsRequest, ListAssetsResponse>(request, MetaStudioMeta.listAssets, hcClient);
    }

    /**
     * 恢复被删除的资产
     *
     * 该接口用于恢复被删除至回收站的媒体资产。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreAssetRequest 请求对象
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
     * @param RestoreAssetRequest 请求对象
     * @return SyncInvoker<RestoreAssetRequest, RestoreAssetResponse>
     */
    public SyncInvoker<RestoreAssetRequest, RestoreAssetResponse> restoreAssetInvoker(RestoreAssetRequest request) {
        return new SyncInvoker<RestoreAssetRequest, RestoreAssetResponse>(request, MetaStudioMeta.restoreAsset,
            hcClient);
    }

    /**
     * 查询资产详情
     *
     * 该接口用于查询资产库中指定媒体资产的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAssetRequest 请求对象
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
     * @param ShowAssetRequest 请求对象
     * @return SyncInvoker<ShowAssetRequest, ShowAssetResponse>
     */
    public SyncInvoker<ShowAssetRequest, ShowAssetResponse> showAssetInvoker(ShowAssetRequest request) {
        return new SyncInvoker<ShowAssetRequest, ShowAssetResponse>(request, MetaStudioMeta.showAsset, hcClient);
    }

    /**
     * 更新资产
     *
     * 该接口用于更新资产库中的媒体资产信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDigitalAssetRequest 请求对象
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
     * @param UpdateDigitalAssetRequest 请求对象
     * @return SyncInvoker<UpdateDigitalAssetRequest, UpdateDigitalAssetResponse>
     */
    public SyncInvoker<UpdateDigitalAssetRequest, UpdateDigitalAssetResponse> updateDigitalAssetInvoker(
        UpdateDigitalAssetRequest request) {
        return new SyncInvoker<UpdateDigitalAssetRequest, UpdateDigitalAssetResponse>(request,
            MetaStudioMeta.updateDigitalAsset, hcClient);
    }

    /**
     * 创建数字人名片制作
     *
     * 该接口用于数字人名片制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDigitalHumanBusinessCardRequest 请求对象
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
     * @param CreateDigitalHumanBusinessCardRequest 请求对象
     * @return SyncInvoker<CreateDigitalHumanBusinessCardRequest, CreateDigitalHumanBusinessCardResponse>
     */
    public SyncInvoker<CreateDigitalHumanBusinessCardRequest, CreateDigitalHumanBusinessCardResponse> createDigitalHumanBusinessCardInvoker(
        CreateDigitalHumanBusinessCardRequest request) {
        return new SyncInvoker<CreateDigitalHumanBusinessCardRequest, CreateDigitalHumanBusinessCardResponse>(request,
            MetaStudioMeta.createDigitalHumanBusinessCard, hcClient);
    }

    /**
     * 删除数字人名片制作任务
     *
     * 该接口用于删除数字人名片制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDigitalHumanBusinessCardRequest 请求对象
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
     * @param DeleteDigitalHumanBusinessCardRequest 请求对象
     * @return SyncInvoker<DeleteDigitalHumanBusinessCardRequest, DeleteDigitalHumanBusinessCardResponse>
     */
    public SyncInvoker<DeleteDigitalHumanBusinessCardRequest, DeleteDigitalHumanBusinessCardResponse> deleteDigitalHumanBusinessCardInvoker(
        DeleteDigitalHumanBusinessCardRequest request) {
        return new SyncInvoker<DeleteDigitalHumanBusinessCardRequest, DeleteDigitalHumanBusinessCardResponse>(request,
            MetaStudioMeta.deleteDigitalHumanBusinessCard, hcClient);
    }

    /**
     * 查询数字人名片制作任务列表
     *
     * 该接口用于查询数字人名片制作任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDigitalHumanBusinessCardRequest 请求对象
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
     * @param ListDigitalHumanBusinessCardRequest 请求对象
     * @return SyncInvoker<ListDigitalHumanBusinessCardRequest, ListDigitalHumanBusinessCardResponse>
     */
    public SyncInvoker<ListDigitalHumanBusinessCardRequest, ListDigitalHumanBusinessCardResponse> listDigitalHumanBusinessCardInvoker(
        ListDigitalHumanBusinessCardRequest request) {
        return new SyncInvoker<ListDigitalHumanBusinessCardRequest, ListDigitalHumanBusinessCardResponse>(request,
            MetaStudioMeta.listDigitalHumanBusinessCard, hcClient);
    }

    /**
     * 查询数字人名片制作任务详情
     *
     * 该接口用于查询数字人名片制作任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDigitalHumanBusinessCardRequest 请求对象
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
     * @param ShowDigitalHumanBusinessCardRequest 请求对象
     * @return SyncInvoker<ShowDigitalHumanBusinessCardRequest, ShowDigitalHumanBusinessCardResponse>
     */
    public SyncInvoker<ShowDigitalHumanBusinessCardRequest, ShowDigitalHumanBusinessCardResponse> showDigitalHumanBusinessCardInvoker(
        ShowDigitalHumanBusinessCardRequest request) {
        return new SyncInvoker<ShowDigitalHumanBusinessCardRequest, ShowDigitalHumanBusinessCardResponse>(request,
            MetaStudioMeta.showDigitalHumanBusinessCard, hcClient);
    }

    /**
     * 更新数字人名片制作
     *
     * 该接口用于更新数字人名片制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDigitalHumanBusinessCardRequest 请求对象
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
     * @param UpdateDigitalHumanBusinessCardRequest 请求对象
     * @return SyncInvoker<UpdateDigitalHumanBusinessCardRequest, UpdateDigitalHumanBusinessCardResponse>
     */
    public SyncInvoker<UpdateDigitalHumanBusinessCardRequest, UpdateDigitalHumanBusinessCardResponse> updateDigitalHumanBusinessCardInvoker(
        UpdateDigitalHumanBusinessCardRequest request) {
        return new SyncInvoker<UpdateDigitalHumanBusinessCardRequest, UpdateDigitalHumanBusinessCardResponse>(request,
            MetaStudioMeta.updateDigitalHumanBusinessCard, hcClient);
    }

    /**
     * 查询视频制作任务列表
     *
     * 该接口用于查询视频制作任务列表。可查询分身数字人视频制作列表，照片数字人视频制作列表等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDigitalHumanVideoRequest 请求对象
     * @return ListDigitalHumanVideoResponse
     */
    public ListDigitalHumanVideoResponse listDigitalHumanVideo(ListDigitalHumanVideoRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.listDigitalHumanVideo);
    }

    /**
     * 查询视频制作任务列表
     *
     * 该接口用于查询视频制作任务列表。可查询分身数字人视频制作列表，照片数字人视频制作列表等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDigitalHumanVideoRequest 请求对象
     * @return SyncInvoker<ListDigitalHumanVideoRequest, ListDigitalHumanVideoResponse>
     */
    public SyncInvoker<ListDigitalHumanVideoRequest, ListDigitalHumanVideoResponse> listDigitalHumanVideoInvoker(
        ListDigitalHumanVideoRequest request) {
        return new SyncInvoker<ListDigitalHumanVideoRequest, ListDigitalHumanVideoResponse>(request,
            MetaStudioMeta.listDigitalHumanVideo, hcClient);
    }

    /**
     * 取消等待中的分身数字人视频制作任务
     *
     * 该接口用于取消等待中的分身数字人视频制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param Cancel2DDigitalHumanVideoRequest 请求对象
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
     * @param Cancel2DDigitalHumanVideoRequest 请求对象
     * @return SyncInvoker<Cancel2DDigitalHumanVideoRequest, Cancel2DDigitalHumanVideoResponse>
     */
    public SyncInvoker<Cancel2DDigitalHumanVideoRequest, Cancel2DDigitalHumanVideoResponse> cancel2DDigitalHumanVideoInvoker(
        Cancel2DDigitalHumanVideoRequest request) {
        return new SyncInvoker<Cancel2DDigitalHumanVideoRequest, Cancel2DDigitalHumanVideoResponse>(request,
            MetaStudioMeta.cancel2DDigitalHumanVideo, hcClient);
    }

    /**
     * 创建分身数字人视频制作任务
     *
     * 该接口用于创建分身数字人视频制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param Create2DDigitalHumanVideoRequest 请求对象
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
     * @param Create2DDigitalHumanVideoRequest 请求对象
     * @return SyncInvoker<Create2DDigitalHumanVideoRequest, Create2DDigitalHumanVideoResponse>
     */
    public SyncInvoker<Create2DDigitalHumanVideoRequest, Create2DDigitalHumanVideoResponse> create2DDigitalHumanVideoInvoker(
        Create2DDigitalHumanVideoRequest request) {
        return new SyncInvoker<Create2DDigitalHumanVideoRequest, Create2DDigitalHumanVideoResponse>(request,
            MetaStudioMeta.create2DDigitalHumanVideo, hcClient);
    }

    /**
     * 查询分身数字人视频制作任务详情
     *
     * 该接口用于查询分身数字人视频制作任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param Show2DDigitalHumanVideoRequest 请求对象
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
     * @param Show2DDigitalHumanVideoRequest 请求对象
     * @return SyncInvoker<Show2DDigitalHumanVideoRequest, Show2DDigitalHumanVideoResponse>
     */
    public SyncInvoker<Show2DDigitalHumanVideoRequest, Show2DDigitalHumanVideoResponse> show2DDigitalHumanVideoInvoker(
        Show2DDigitalHumanVideoRequest request) {
        return new SyncInvoker<Show2DDigitalHumanVideoRequest, Show2DDigitalHumanVideoResponse>(request,
            MetaStudioMeta.show2DDigitalHumanVideo, hcClient);
    }

    /**
     * 取消等待中的照片分身数字人视频制作任务
     *
     * 该接口用于取消等待中的照片分身数字人视频制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelPhotoDigitalHumanVideoRequest 请求对象
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
     * @param CancelPhotoDigitalHumanVideoRequest 请求对象
     * @return SyncInvoker<CancelPhotoDigitalHumanVideoRequest, CancelPhotoDigitalHumanVideoResponse>
     */
    public SyncInvoker<CancelPhotoDigitalHumanVideoRequest, CancelPhotoDigitalHumanVideoResponse> cancelPhotoDigitalHumanVideoInvoker(
        CancelPhotoDigitalHumanVideoRequest request) {
        return new SyncInvoker<CancelPhotoDigitalHumanVideoRequest, CancelPhotoDigitalHumanVideoResponse>(request,
            MetaStudioMeta.cancelPhotoDigitalHumanVideo, hcClient);
    }

    /**
     * 创建照片检测任务
     *
     * 该接口用于创建照片检测任务，检测照片是否满足制作照片数字人的要求。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePhotoDetectionRequest 请求对象
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
     * @param CreatePhotoDetectionRequest 请求对象
     * @return SyncInvoker<CreatePhotoDetectionRequest, CreatePhotoDetectionResponse>
     */
    public SyncInvoker<CreatePhotoDetectionRequest, CreatePhotoDetectionResponse> createPhotoDetectionInvoker(
        CreatePhotoDetectionRequest request) {
        return new SyncInvoker<CreatePhotoDetectionRequest, CreatePhotoDetectionResponse>(request,
            MetaStudioMeta.createPhotoDetection, hcClient);
    }

    /**
     * 创建照片分身数字人视频制作任务
     *
     * 该接口用于创建照片分身数字人视频制作任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePhotoDigitalHumanVideoRequest 请求对象
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
     * @param CreatePhotoDigitalHumanVideoRequest 请求对象
     * @return SyncInvoker<CreatePhotoDigitalHumanVideoRequest, CreatePhotoDigitalHumanVideoResponse>
     */
    public SyncInvoker<CreatePhotoDigitalHumanVideoRequest, CreatePhotoDigitalHumanVideoResponse> createPhotoDigitalHumanVideoInvoker(
        CreatePhotoDigitalHumanVideoRequest request) {
        return new SyncInvoker<CreatePhotoDigitalHumanVideoRequest, CreatePhotoDigitalHumanVideoResponse>(request,
            MetaStudioMeta.createPhotoDigitalHumanVideo, hcClient);
    }

    /**
     * 查询照片检测任务详情
     *
     * 该接口用于查询照片检测任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPhotoDetectionRequest 请求对象
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
     * @param ShowPhotoDetectionRequest 请求对象
     * @return SyncInvoker<ShowPhotoDetectionRequest, ShowPhotoDetectionResponse>
     */
    public SyncInvoker<ShowPhotoDetectionRequest, ShowPhotoDetectionResponse> showPhotoDetectionInvoker(
        ShowPhotoDetectionRequest request) {
        return new SyncInvoker<ShowPhotoDetectionRequest, ShowPhotoDetectionResponse>(request,
            MetaStudioMeta.showPhotoDetection, hcClient);
    }

    /**
     * 查询照片分身数字人视频制作任务详情
     *
     * 该接口用于查询照片分身数字人视频制作任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPhotoDigitalHumanVideoRequest 请求对象
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
     * @param ShowPhotoDigitalHumanVideoRequest 请求对象
     * @return SyncInvoker<ShowPhotoDigitalHumanVideoRequest, ShowPhotoDigitalHumanVideoResponse>
     */
    public SyncInvoker<ShowPhotoDigitalHumanVideoRequest, ShowPhotoDigitalHumanVideoResponse> showPhotoDigitalHumanVideoInvoker(
        ShowPhotoDigitalHumanVideoRequest request) {
        return new SyncInvoker<ShowPhotoDigitalHumanVideoRequest, ShowPhotoDigitalHumanVideoResponse>(request,
            MetaStudioMeta.showPhotoDigitalHumanVideo, hcClient);
    }

    /**
     * 确认文件已上传
     *
     * 资产文件上传完毕后，通过该接口确认上传完成。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ConfirmFileUploadRequest 请求对象
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
     * @param ConfirmFileUploadRequest 请求对象
     * @return SyncInvoker<ConfirmFileUploadRequest, ConfirmFileUploadResponse>
     */
    public SyncInvoker<ConfirmFileUploadRequest, ConfirmFileUploadResponse> confirmFileUploadInvoker(
        ConfirmFileUploadRequest request) {
        return new SyncInvoker<ConfirmFileUploadRequest, ConfirmFileUploadResponse>(request,
            MetaStudioMeta.confirmFileUpload, hcClient);
    }

    /**
     * 创建文件并获取上传URL
     *
     * 该接口用于创建文件并获取上传URL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFileRequest 请求对象
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
     * @param CreateFileRequest 请求对象
     * @return SyncInvoker<CreateFileRequest, CreateFileResponse>
     */
    public SyncInvoker<CreateFileRequest, CreateFileResponse> createFileInvoker(CreateFileRequest request) {
        return new SyncInvoker<CreateFileRequest, CreateFileResponse>(request, MetaStudioMeta.createFile, hcClient);
    }

    /**
     * 删除文件
     *
     * 该接口用于删除媒体资产库中指定的文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFileRequest 请求对象
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
     * @param DeleteFileRequest 请求对象
     * @return SyncInvoker<DeleteFileRequest, DeleteFileResponse>
     */
    public SyncInvoker<DeleteFileRequest, DeleteFileResponse> deleteFileInvoker(DeleteFileRequest request) {
        return new SyncInvoker<DeleteFileRequest, DeleteFileResponse>(request, MetaStudioMeta.deleteFile, hcClient);
    }

    /**
     * 基于图片URL创建照片建模任务
     *
     * 该接口用于从URL中获取图片进行照片建模任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePictureModelingByUrlJobRequest 请求对象
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
     * @param CreatePictureModelingByUrlJobRequest 请求对象
     * @return SyncInvoker<CreatePictureModelingByUrlJobRequest, CreatePictureModelingByUrlJobResponse>
     */
    public SyncInvoker<CreatePictureModelingByUrlJobRequest, CreatePictureModelingByUrlJobResponse> createPictureModelingByUrlJobInvoker(
        CreatePictureModelingByUrlJobRequest request) {
        return new SyncInvoker<CreatePictureModelingByUrlJobRequest, CreatePictureModelingByUrlJobResponse>(request,
            MetaStudioMeta.createPictureModelingByUrlJob, hcClient);
    }

    /**
     * 创建照片建模任务
     *
     * 该接口用于创建风格化照片建模任务。通过上传照片，生成风格化数字人模型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePictureModelingJobRequest 请求对象
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
     * @param CreatePictureModelingJobRequest 请求对象
     * @return SyncInvoker<CreatePictureModelingJobRequest, CreatePictureModelingJobResponse>
     */
    public SyncInvoker<CreatePictureModelingJobRequest, CreatePictureModelingJobResponse> createPictureModelingJobInvoker(
        CreatePictureModelingJobRequest request) {
        return new SyncInvoker<CreatePictureModelingJobRequest, CreatePictureModelingJobResponse>(request,
            MetaStudioMeta.createPictureModelingJob, hcClient);
    }

    /**
     * 照片建模任务列表查询
     *
     * 该接口用于查询风格化照片建模任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPictureModelingJobsRequest 请求对象
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
     * @param ListPictureModelingJobsRequest 请求对象
     * @return SyncInvoker<ListPictureModelingJobsRequest, ListPictureModelingJobsResponse>
     */
    public SyncInvoker<ListPictureModelingJobsRequest, ListPictureModelingJobsResponse> listPictureModelingJobsInvoker(
        ListPictureModelingJobsRequest request) {
        return new SyncInvoker<ListPictureModelingJobsRequest, ListPictureModelingJobsResponse>(request,
            MetaStudioMeta.listPictureModelingJobs, hcClient);
    }

    /**
     * 照片建模任务详情查询
     *
     * 该接口用于风格化查询照片建模任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPictureModelingJobRequest 请求对象
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
     * @param ShowPictureModelingJobRequest 请求对象
     * @return SyncInvoker<ShowPictureModelingJobRequest, ShowPictureModelingJobResponse>
     */
    public SyncInvoker<ShowPictureModelingJobRequest, ShowPictureModelingJobResponse> showPictureModelingJobInvoker(
        ShowPictureModelingJobRequest request) {
        return new SyncInvoker<ShowPictureModelingJobRequest, ShowPictureModelingJobResponse>(request,
            MetaStudioMeta.showPictureModelingJob, hcClient);
    }

    /**
     * 控制数字人直播过程
     *
     * 该接口用于控制数字人直播过程。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteSmartLiveCommandRequest 请求对象
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
     * @param ExecuteSmartLiveCommandRequest 请求对象
     * @return SyncInvoker<ExecuteSmartLiveCommandRequest, ExecuteSmartLiveCommandResponse>
     */
    public SyncInvoker<ExecuteSmartLiveCommandRequest, ExecuteSmartLiveCommandResponse> executeSmartLiveCommandInvoker(
        ExecuteSmartLiveCommandRequest request) {
        return new SyncInvoker<ExecuteSmartLiveCommandRequest, ExecuteSmartLiveCommandResponse>(request,
            MetaStudioMeta.executeSmartLiveCommand, hcClient);
    }

    /**
     * 查询数字人智能直播任务列表
     *
     * 该接口用于查询数字人智能直播任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSmartLiveRequest 请求对象
     * @return ListSmartLiveResponse
     */
    public ListSmartLiveResponse listSmartLive(ListSmartLiveRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.listSmartLive);
    }

    /**
     * 查询数字人智能直播任务列表
     *
     * 该接口用于查询数字人智能直播任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSmartLiveRequest 请求对象
     * @return SyncInvoker<ListSmartLiveRequest, ListSmartLiveResponse>
     */
    public SyncInvoker<ListSmartLiveRequest, ListSmartLiveResponse> listSmartLiveInvoker(ListSmartLiveRequest request) {
        return new SyncInvoker<ListSmartLiveRequest, ListSmartLiveResponse>(request, MetaStudioMeta.listSmartLive,
            hcClient);
    }

    /**
     * 上报直播间事件
     *
     * 该接口用于上报直播间事件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param LiveEventReportRequest 请求对象
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
     * @param LiveEventReportRequest 请求对象
     * @return SyncInvoker<LiveEventReportRequest, LiveEventReportResponse>
     */
    public SyncInvoker<LiveEventReportRequest, LiveEventReportResponse> liveEventReportInvoker(
        LiveEventReportRequest request) {
        return new SyncInvoker<LiveEventReportRequest, LiveEventReportResponse>(request, MetaStudioMeta.liveEventReport,
            hcClient);
    }

    /**
     * 查询数字人智能直播任务详情
     *
     * 该接口用于查询数字人智能直播任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSmartLiveRequest 请求对象
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
     * @param ShowSmartLiveRequest 请求对象
     * @return SyncInvoker<ShowSmartLiveRequest, ShowSmartLiveResponse>
     */
    public SyncInvoker<ShowSmartLiveRequest, ShowSmartLiveResponse> showSmartLiveInvoker(ShowSmartLiveRequest request) {
        return new SyncInvoker<ShowSmartLiveRequest, ShowSmartLiveResponse>(request, MetaStudioMeta.showSmartLive,
            hcClient);
    }

    /**
     * 启动数字人智能直播任务
     *
     * 该接口用于启动数字人智能直播任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartSmartLiveRequest 请求对象
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
     * @param StartSmartLiveRequest 请求对象
     * @return SyncInvoker<StartSmartLiveRequest, StartSmartLiveResponse>
     */
    public SyncInvoker<StartSmartLiveRequest, StartSmartLiveResponse> startSmartLiveInvoker(
        StartSmartLiveRequest request) {
        return new SyncInvoker<StartSmartLiveRequest, StartSmartLiveResponse>(request, MetaStudioMeta.startSmartLive,
            hcClient);
    }

    /**
     * 结束数字人智能直播任务
     *
     * 该接口用于结束数字人智能直播任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopSmartLiveRequest 请求对象
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
     * @param StopSmartLiveRequest 请求对象
     * @return SyncInvoker<StopSmartLiveRequest, StopSmartLiveResponse>
     */
    public SyncInvoker<StopSmartLiveRequest, StopSmartLiveResponse> stopSmartLiveInvoker(StopSmartLiveRequest request) {
        return new SyncInvoker<StopSmartLiveRequest, StopSmartLiveResponse>(request, MetaStudioMeta.stopSmartLive,
            hcClient);
    }

    /**
     * 检测音色与文本的语言一致性
     *
     * 检测音色与文本的语言一致性，音色与文本不一致会导致报错
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckTextLanguageRequest 请求对象
     * @return CheckTextLanguageResponse
     */
    public CheckTextLanguageResponse checkTextLanguage(CheckTextLanguageRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.checkTextLanguage);
    }

    /**
     * 检测音色与文本的语言一致性
     *
     * 检测音色与文本的语言一致性，音色与文本不一致会导致报错
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckTextLanguageRequest 请求对象
     * @return SyncInvoker<CheckTextLanguageRequest, CheckTextLanguageResponse>
     */
    public SyncInvoker<CheckTextLanguageRequest, CheckTextLanguageResponse> checkTextLanguageInvoker(
        CheckTextLanguageRequest request) {
        return new SyncInvoker<CheckTextLanguageRequest, CheckTextLanguageResponse>(request,
            MetaStudioMeta.checkTextLanguage, hcClient);
    }

    /**
     * 创建智能直播间互动规则库
     *
     * 该接口用于创建智能直播间互动规则库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInteractionRuleGroupRequest 请求对象
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
     * @param CreateInteractionRuleGroupRequest 请求对象
     * @return SyncInvoker<CreateInteractionRuleGroupRequest, CreateInteractionRuleGroupResponse>
     */
    public SyncInvoker<CreateInteractionRuleGroupRequest, CreateInteractionRuleGroupResponse> createInteractionRuleGroupInvoker(
        CreateInteractionRuleGroupRequest request) {
        return new SyncInvoker<CreateInteractionRuleGroupRequest, CreateInteractionRuleGroupResponse>(request,
            MetaStudioMeta.createInteractionRuleGroup, hcClient);
    }

    /**
     * 创建智能直播间
     *
     * 该接口用于创建智能直播间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSmartLiveRoomRequest 请求对象
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
     * @param CreateSmartLiveRoomRequest 请求对象
     * @return SyncInvoker<CreateSmartLiveRoomRequest, CreateSmartLiveRoomResponse>
     */
    public SyncInvoker<CreateSmartLiveRoomRequest, CreateSmartLiveRoomResponse> createSmartLiveRoomInvoker(
        CreateSmartLiveRoomRequest request) {
        return new SyncInvoker<CreateSmartLiveRoomRequest, CreateSmartLiveRoomResponse>(request,
            MetaStudioMeta.createSmartLiveRoom, hcClient);
    }

    /**
     * 删除智能直播间互动规则库
     *
     * 该接口用于删除智能直播间互动规则库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteInteractionRuleGroupRequest 请求对象
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
     * @param DeleteInteractionRuleGroupRequest 请求对象
     * @return SyncInvoker<DeleteInteractionRuleGroupRequest, DeleteInteractionRuleGroupResponse>
     */
    public SyncInvoker<DeleteInteractionRuleGroupRequest, DeleteInteractionRuleGroupResponse> deleteInteractionRuleGroupInvoker(
        DeleteInteractionRuleGroupRequest request) {
        return new SyncInvoker<DeleteInteractionRuleGroupRequest, DeleteInteractionRuleGroupResponse>(request,
            MetaStudioMeta.deleteInteractionRuleGroup, hcClient);
    }

    /**
     * 删除智能直播间
     *
     * 该接口用于删除智能直播间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSmartLiveRoomRequest 请求对象
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
     * @param DeleteSmartLiveRoomRequest 请求对象
     * @return SyncInvoker<DeleteSmartLiveRoomRequest, DeleteSmartLiveRoomResponse>
     */
    public SyncInvoker<DeleteSmartLiveRoomRequest, DeleteSmartLiveRoomResponse> deleteSmartLiveRoomInvoker(
        DeleteSmartLiveRoomRequest request) {
        return new SyncInvoker<DeleteSmartLiveRoomRequest, DeleteSmartLiveRoomResponse>(request,
            MetaStudioMeta.deleteSmartLiveRoom, hcClient);
    }

    /**
     * 查询智能直播间互动规则库列表
     *
     * 该接口用于智能直播间互动规则库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInteractionRuleGroupsRequest 请求对象
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
     * @param ListInteractionRuleGroupsRequest 请求对象
     * @return SyncInvoker<ListInteractionRuleGroupsRequest, ListInteractionRuleGroupsResponse>
     */
    public SyncInvoker<ListInteractionRuleGroupsRequest, ListInteractionRuleGroupsResponse> listInteractionRuleGroupsInvoker(
        ListInteractionRuleGroupsRequest request) {
        return new SyncInvoker<ListInteractionRuleGroupsRequest, ListInteractionRuleGroupsResponse>(request,
            MetaStudioMeta.listInteractionRuleGroups, hcClient);
    }

    /**
     * 查询智能直播间列表
     *
     * 该接口用于智能直播间列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSmartLiveRoomsRequest 请求对象
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
     * @param ListSmartLiveRoomsRequest 请求对象
     * @return SyncInvoker<ListSmartLiveRoomsRequest, ListSmartLiveRoomsResponse>
     */
    public SyncInvoker<ListSmartLiveRoomsRequest, ListSmartLiveRoomsResponse> listSmartLiveRoomsInvoker(
        ListSmartLiveRoomsRequest request) {
        return new SyncInvoker<ListSmartLiveRoomsRequest, ListSmartLiveRoomsResponse>(request,
            MetaStudioMeta.listSmartLiveRooms, hcClient);
    }

    /**
     * 查询智能直播剧本详情
     *
     * 该接口用于查询智能直播剧本详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSmartLiveRoomRequest 请求对象
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
     * @param ShowSmartLiveRoomRequest 请求对象
     * @return SyncInvoker<ShowSmartLiveRoomRequest, ShowSmartLiveRoomResponse>
     */
    public SyncInvoker<ShowSmartLiveRoomRequest, ShowSmartLiveRoomResponse> showSmartLiveRoomInvoker(
        ShowSmartLiveRoomRequest request) {
        return new SyncInvoker<ShowSmartLiveRoomRequest, ShowSmartLiveRoomResponse>(request,
            MetaStudioMeta.showSmartLiveRoom, hcClient);
    }

    /**
     * 更新智能直播间互动规则库
     *
     * 该接口用于更新智能直播间互动规则库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInteractionRuleGroupRequest 请求对象
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
     * @param UpdateInteractionRuleGroupRequest 请求对象
     * @return SyncInvoker<UpdateInteractionRuleGroupRequest, UpdateInteractionRuleGroupResponse>
     */
    public SyncInvoker<UpdateInteractionRuleGroupRequest, UpdateInteractionRuleGroupResponse> updateInteractionRuleGroupInvoker(
        UpdateInteractionRuleGroupRequest request) {
        return new SyncInvoker<UpdateInteractionRuleGroupRequest, UpdateInteractionRuleGroupResponse>(request,
            MetaStudioMeta.updateInteractionRuleGroup, hcClient);
    }

    /**
     * 更新智能直播间信息
     *
     * 该接口用于智能直播间信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSmartLiveRoomRequest 请求对象
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
     * @param UpdateSmartLiveRoomRequest 请求对象
     * @return SyncInvoker<UpdateSmartLiveRoomRequest, UpdateSmartLiveRoomResponse>
     */
    public SyncInvoker<UpdateSmartLiveRoomRequest, UpdateSmartLiveRoomResponse> updateSmartLiveRoomInvoker(
        UpdateSmartLiveRoomRequest request) {
        return new SyncInvoker<UpdateSmartLiveRoomRequest, UpdateSmartLiveRoomResponse>(request,
            MetaStudioMeta.updateSmartLiveRoom, hcClient);
    }

    /**
     * 查询数字人风格列表
     *
     * 查询数字人风格列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStylesRequest 请求对象
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
     * @param ListStylesRequest 请求对象
     * @return SyncInvoker<ListStylesRequest, ListStylesResponse>
     */
    public SyncInvoker<ListStylesRequest, ListStylesResponse> listStylesInvoker(ListStylesRequest request) {
        return new SyncInvoker<ListStylesRequest, ListStylesResponse>(request, MetaStudioMeta.listStyles, hcClient);
    }

    /**
     * 提交语音训练任务
     *
     * 提交训练任务,执行该接口后,任务会进入审核状态,审核完成后会等待训练。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CommitVoiceTrainingJobRequest 请求对象
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
     * @param CommitVoiceTrainingJobRequest 请求对象
     * @return SyncInvoker<CommitVoiceTrainingJobRequest, CommitVoiceTrainingJobResponse>
     */
    public SyncInvoker<CommitVoiceTrainingJobRequest, CommitVoiceTrainingJobResponse> commitVoiceTrainingJobInvoker(
        CommitVoiceTrainingJobRequest request) {
        return new SyncInvoker<CommitVoiceTrainingJobRequest, CommitVoiceTrainingJobResponse>(request,
            MetaStudioMeta.commitVoiceTrainingJob, hcClient);
    }

    /**
     * 确认在线录音结果
     *
     * 确认在线录音结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ConfirmTrainingSegmentRequest 请求对象
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
     * @param ConfirmTrainingSegmentRequest 请求对象
     * @return SyncInvoker<ConfirmTrainingSegmentRequest, ConfirmTrainingSegmentResponse>
     */
    public SyncInvoker<ConfirmTrainingSegmentRequest, ConfirmTrainingSegmentResponse> confirmTrainingSegmentInvoker(
        ConfirmTrainingSegmentRequest request) {
        return new SyncInvoker<ConfirmTrainingSegmentRequest, ConfirmTrainingSegmentResponse>(request,
            MetaStudioMeta.confirmTrainingSegment, hcClient);
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
     * @param CreateTrainingAdvanceJobRequest 请求对象
     * @return CreateTrainingAdvanceJobResponse
     */
    public CreateTrainingAdvanceJobResponse createTrainingAdvanceJob(CreateTrainingAdvanceJobRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.createTrainingAdvanceJob);
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
     * @param CreateTrainingAdvanceJobRequest 请求对象
     * @return SyncInvoker<CreateTrainingAdvanceJobRequest, CreateTrainingAdvanceJobResponse>
     */
    public SyncInvoker<CreateTrainingAdvanceJobRequest, CreateTrainingAdvanceJobResponse> createTrainingAdvanceJobInvoker(
        CreateTrainingAdvanceJobRequest request) {
        return new SyncInvoker<CreateTrainingAdvanceJobRequest, CreateTrainingAdvanceJobResponse>(request,
            MetaStudioMeta.createTrainingAdvanceJob, hcClient);
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
     * @param CreateTrainingBasicJobRequest 请求对象
     * @return CreateTrainingBasicJobResponse
     */
    public CreateTrainingBasicJobResponse createTrainingBasicJob(CreateTrainingBasicJobRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.createTrainingBasicJob);
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
     * @param CreateTrainingBasicJobRequest 请求对象
     * @return SyncInvoker<CreateTrainingBasicJobRequest, CreateTrainingBasicJobResponse>
     */
    public SyncInvoker<CreateTrainingBasicJobRequest, CreateTrainingBasicJobResponse> createTrainingBasicJobInvoker(
        CreateTrainingBasicJobRequest request) {
        return new SyncInvoker<CreateTrainingBasicJobRequest, CreateTrainingBasicJobResponse>(request,
            MetaStudioMeta.createTrainingBasicJob, hcClient);
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
     * @param CreateTrainingMiddleJobRequest 请求对象
     * @return CreateTrainingMiddleJobResponse
     */
    public CreateTrainingMiddleJobResponse createTrainingMiddleJob(CreateTrainingMiddleJobRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.createTrainingMiddleJob);
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
     * @param CreateTrainingMiddleJobRequest 请求对象
     * @return SyncInvoker<CreateTrainingMiddleJobRequest, CreateTrainingMiddleJobResponse>
     */
    public SyncInvoker<CreateTrainingMiddleJobRequest, CreateTrainingMiddleJobResponse> createTrainingMiddleJobInvoker(
        CreateTrainingMiddleJobRequest request) {
        return new SyncInvoker<CreateTrainingMiddleJobRequest, CreateTrainingMiddleJobResponse>(request,
            MetaStudioMeta.createTrainingMiddleJob, hcClient);
    }

    /**
     * 删除语音训练任务
     *
     * 删除语音训练任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVoiceTrainingJobRequest 请求对象
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
     * @param DeleteVoiceTrainingJobRequest 请求对象
     * @return SyncInvoker<DeleteVoiceTrainingJobRequest, DeleteVoiceTrainingJobResponse>
     */
    public SyncInvoker<DeleteVoiceTrainingJobRequest, DeleteVoiceTrainingJobResponse> deleteVoiceTrainingJobInvoker(
        DeleteVoiceTrainingJobRequest request) {
        return new SyncInvoker<DeleteVoiceTrainingJobRequest, DeleteVoiceTrainingJobResponse>(request,
            MetaStudioMeta.deleteVoiceTrainingJob, hcClient);
    }

    /**
     * 查询语音训练任务列表
     *
     * 查询语音训练任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVoiceTrainingJobRequest 请求对象
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
     * @param ListVoiceTrainingJobRequest 请求对象
     * @return SyncInvoker<ListVoiceTrainingJobRequest, ListVoiceTrainingJobResponse>
     */
    public SyncInvoker<ListVoiceTrainingJobRequest, ListVoiceTrainingJobResponse> listVoiceTrainingJobInvoker(
        ListVoiceTrainingJobRequest request) {
        return new SyncInvoker<ListVoiceTrainingJobRequest, ListVoiceTrainingJobResponse>(request,
            MetaStudioMeta.listVoiceTrainingJob, hcClient);
    }

    /**
     * 获取语音训练任务审核结果
     *
     * 获取语音训练任务审核结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobAuditResultRequest 请求对象
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
     * @param ShowJobAuditResultRequest 请求对象
     * @return SyncInvoker<ShowJobAuditResultRequest, ShowJobAuditResultResponse>
     */
    public SyncInvoker<ShowJobAuditResultRequest, ShowJobAuditResultResponse> showJobAuditResultInvoker(
        ShowJobAuditResultRequest request) {
        return new SyncInvoker<ShowJobAuditResultRequest, ShowJobAuditResultResponse>(request,
            MetaStudioMeta.showJobAuditResult, hcClient);
    }

    /**
     * 获取语音文件上传地址
     *
     * 获取语音文件上传地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowJobUploadingAddressRequest 请求对象
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
     * @param ShowJobUploadingAddressRequest 请求对象
     * @return SyncInvoker<ShowJobUploadingAddressRequest, ShowJobUploadingAddressResponse>
     */
    public SyncInvoker<ShowJobUploadingAddressRequest, ShowJobUploadingAddressResponse> showJobUploadingAddressInvoker(
        ShowJobUploadingAddressRequest request) {
        return new SyncInvoker<ShowJobUploadingAddressRequest, ShowJobUploadingAddressResponse>(request,
            MetaStudioMeta.showJobUploadingAddress, hcClient);
    }

    /**
     * 获取在线录音确认结果
     *
     * 获取在线录音确认结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTrainingSegmentInfoRequest 请求对象
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
     * @param ShowTrainingSegmentInfoRequest 请求对象
     * @return SyncInvoker<ShowTrainingSegmentInfoRequest, ShowTrainingSegmentInfoResponse>
     */
    public SyncInvoker<ShowTrainingSegmentInfoRequest, ShowTrainingSegmentInfoResponse> showTrainingSegmentInfoInvoker(
        ShowTrainingSegmentInfoRequest request) {
        return new SyncInvoker<ShowTrainingSegmentInfoRequest, ShowTrainingSegmentInfoResponse>(request,
            MetaStudioMeta.showTrainingSegmentInfo, hcClient);
    }

    /**
     * 查询语音训练任务详情
     *
     * 查询语音训练任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVoiceTrainingJobRequest 请求对象
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
     * @param ShowVoiceTrainingJobRequest 请求对象
     * @return SyncInvoker<ShowVoiceTrainingJobRequest, ShowVoiceTrainingJobResponse>
     */
    public SyncInvoker<ShowVoiceTrainingJobRequest, ShowVoiceTrainingJobResponse> showVoiceTrainingJobInvoker(
        ShowVoiceTrainingJobRequest request) {
        return new SyncInvoker<ShowVoiceTrainingJobRequest, ShowVoiceTrainingJobResponse>(request,
            MetaStudioMeta.showVoiceTrainingJob, hcClient);
    }

    /**
     * 创建分身数字人模型训练任务
     *
     * 该接口用于创建分身数字人模型训练任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param Create2dModelTrainingJobRequest 请求对象
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
     * @param Create2dModelTrainingJobRequest 请求对象
     * @return SyncInvoker<Create2dModelTrainingJobRequest, Create2dModelTrainingJobResponse>
     */
    public SyncInvoker<Create2dModelTrainingJobRequest, Create2dModelTrainingJobResponse> create2dModelTrainingJobInvoker(
        Create2dModelTrainingJobRequest request) {
        return new SyncInvoker<Create2dModelTrainingJobRequest, Create2dModelTrainingJobResponse>(request,
            MetaStudioMeta.create2dModelTrainingJob, hcClient);
    }

    /**
     * 删除分身数字人模型训练任务
     *
     * 该接口用于删除分身数字人模型训练任务。同时需要删除训练任务相关的训练视频、身份证照片、授权文件、模型资产等。
     * &gt; * 该接口应当在任务处于以下状态时调用：WAIT_FILE_UPLOAD、AUTO_VERIFY_FAILED、MANUAL_VERIFYING、MANUAL_VERIFY_FAILED、TRAINING_DATA_PREPROCESS_FAILED、TRAIN_FAILED、INFERENCE_DATA_PREPROCESS_FAILED、JOB_SUCCESS、WAIT_USER_CONFIRM、JOB_REJECT、JOB_FINISH
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param Delete2dModelTrainingJobRequest 请求对象
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
     * @param Delete2dModelTrainingJobRequest 请求对象
     * @return SyncInvoker<Delete2dModelTrainingJobRequest, Delete2dModelTrainingJobResponse>
     */
    public SyncInvoker<Delete2dModelTrainingJobRequest, Delete2dModelTrainingJobResponse> delete2dModelTrainingJobInvoker(
        Delete2dModelTrainingJobRequest request) {
        return new SyncInvoker<Delete2dModelTrainingJobRequest, Delete2dModelTrainingJobResponse>(request,
            MetaStudioMeta.delete2dModelTrainingJob, hcClient);
    }

    /**
     * 租户执行分身数字人模型训练任务命令
     *
     * 该接口用于租户执行分身数字人模型训练任务命令，如提交训练审核等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param Execute2dModelTrainingCommandByUserRequest 请求对象
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
     * @param Execute2dModelTrainingCommandByUserRequest 请求对象
     * @return SyncInvoker<Execute2dModelTrainingCommandByUserRequest, Execute2dModelTrainingCommandByUserResponse>
     */
    public SyncInvoker<Execute2dModelTrainingCommandByUserRequest, Execute2dModelTrainingCommandByUserResponse> execute2dModelTrainingCommandByUserInvoker(
        Execute2dModelTrainingCommandByUserRequest request) {
        return new SyncInvoker<Execute2dModelTrainingCommandByUserRequest, Execute2dModelTrainingCommandByUserResponse>(
            request, MetaStudioMeta.execute2dModelTrainingCommandByUser, hcClient);
    }

    /**
     * 查询分身数字人模型训练任务列表
     *
     * 该接口用于查询分身数字人模型训练任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param List2dModelTrainingJobRequest 请求对象
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
     * @param List2dModelTrainingJobRequest 请求对象
     * @return SyncInvoker<List2dModelTrainingJobRequest, List2dModelTrainingJobResponse>
     */
    public SyncInvoker<List2dModelTrainingJobRequest, List2dModelTrainingJobResponse> list2dModelTrainingJobInvoker(
        List2dModelTrainingJobRequest request) {
        return new SyncInvoker<List2dModelTrainingJobRequest, List2dModelTrainingJobResponse>(request,
            MetaStudioMeta.list2dModelTrainingJob, hcClient);
    }

    /**
     * 查询分身数字人模型训练任务详情
     *
     * 该接口用于查询分身数字人模型训练任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param Show2dModelTrainingJobRequest 请求对象
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
     * @param Show2dModelTrainingJobRequest 请求对象
     * @return SyncInvoker<Show2dModelTrainingJobRequest, Show2dModelTrainingJobResponse>
     */
    public SyncInvoker<Show2dModelTrainingJobRequest, Show2dModelTrainingJobResponse> show2dModelTrainingJobInvoker(
        Show2dModelTrainingJobRequest request) {
        return new SyncInvoker<Show2dModelTrainingJobRequest, Show2dModelTrainingJobResponse>(request,
            MetaStudioMeta.show2dModelTrainingJob, hcClient);
    }

    /**
     * 更新分身数字人模型训练任务
     *
     * 该接口用于更新分身数字人模型训练任务。用于在自动审核或者人工审核不通过情况下，更新训练视频、身份证照片等。
     * &gt; * 该接口只能在AUTO_VERIFY_FAILED或者MANUAL_VERIFY_FAILED状态下调用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param Update2dModelTrainingJobRequest 请求对象
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
     * @param Update2dModelTrainingJobRequest 请求对象
     * @return SyncInvoker<Update2dModelTrainingJobRequest, Update2dModelTrainingJobResponse>
     */
    public SyncInvoker<Update2dModelTrainingJobRequest, Update2dModelTrainingJobResponse> update2dModelTrainingJobInvoker(
        Update2dModelTrainingJobRequest request) {
        return new SyncInvoker<Update2dModelTrainingJobRequest, Update2dModelTrainingJobResponse>(request,
            MetaStudioMeta.update2dModelTrainingJob, hcClient);
    }

    /**
     * 创建语音驱动表情动画任务
     *
     * 该接口用于创建驱动数字人表情的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFacialAnimationsRequest 请求对象
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
     * @param CreateFacialAnimationsRequest 请求对象
     * @return SyncInvoker<CreateFacialAnimationsRequest, CreateFacialAnimationsResponse>
     */
    public SyncInvoker<CreateFacialAnimationsRequest, CreateFacialAnimationsResponse> createFacialAnimationsInvoker(
        CreateFacialAnimationsRequest request) {
        return new SyncInvoker<CreateFacialAnimationsRequest, CreateFacialAnimationsResponse>(request,
            MetaStudioMeta.createFacialAnimations, hcClient);
    }

    /**
     * 创建语音驱动任务
     *
     * 该接口用于创建驱动数字人表情、动作及语音的任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTtsaRequest 请求对象
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
     * @param CreateTtsaRequest 请求对象
     * @return SyncInvoker<CreateTtsaRequest, CreateTtsaResponse>
     */
    public SyncInvoker<CreateTtsaRequest, CreateTtsaResponse> createTtsaInvoker(CreateTtsaRequest request) {
        return new SyncInvoker<CreateTtsaRequest, CreateTtsaResponse>(request, MetaStudioMeta.createTtsa, hcClient);
    }

    /**
     * 获取语音驱动表情数据
     *
     * 该接口用于获取生成的数字人表情驱动数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFacialAnimationsDataRequest 请求对象
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
     * @param ListFacialAnimationsDataRequest 请求对象
     * @return SyncInvoker<ListFacialAnimationsDataRequest, ListFacialAnimationsDataResponse>
     */
    public SyncInvoker<ListFacialAnimationsDataRequest, ListFacialAnimationsDataResponse> listFacialAnimationsDataInvoker(
        ListFacialAnimationsDataRequest request) {
        return new SyncInvoker<ListFacialAnimationsDataRequest, ListFacialAnimationsDataResponse>(request,
            MetaStudioMeta.listFacialAnimationsData, hcClient);
    }

    /**
     * 获取语音驱动数据
     *
     * 该接口用于获取生成的数字人驱动数据，包括语音、表情、动作等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTtsaDataRequest 请求对象
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
     * @param ListTtsaDataRequest 请求对象
     * @return SyncInvoker<ListTtsaDataRequest, ListTtsaDataResponse>
     */
    public SyncInvoker<ListTtsaDataRequest, ListTtsaDataResponse> listTtsaDataInvoker(ListTtsaDataRequest request) {
        return new SyncInvoker<ListTtsaDataRequest, ListTtsaDataResponse>(request, MetaStudioMeta.listTtsaData,
            hcClient);
    }

    /**
     * 获取语音驱动任务列表
     *
     * 该接口用于查询驱动数字人表情、动作及语音的任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTtsaJobsRequest 请求对象
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
     * @param ListTtsaJobsRequest 请求对象
     * @return SyncInvoker<ListTtsaJobsRequest, ListTtsaJobsResponse>
     */
    public SyncInvoker<ListTtsaJobsRequest, ListTtsaJobsResponse> listTtsaJobsInvoker(ListTtsaJobsRequest request) {
        return new SyncInvoker<ListTtsaJobsRequest, ListTtsaJobsResponse>(request, MetaStudioMeta.listTtsaJobs,
            hcClient);
    }

    /**
     * 创建TTS试听任务
     *
     * 该接口用于创建生成播报内容的语音试听文件任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTtsAuditionRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTtsAuditionRequest 请求对象
     * @return SyncInvoker<CreateTtsAuditionRequest, CreateTtsAuditionResponse>
     */
    public SyncInvoker<CreateTtsAuditionRequest, CreateTtsAuditionResponse> createTtsAuditionInvoker(
        CreateTtsAuditionRequest request) {
        return new SyncInvoker<CreateTtsAuditionRequest, CreateTtsAuditionResponse>(request,
            MetaStudioMeta.createTtsAudition, hcClient);
    }

    /**
     * 获取TTS试听文件
     *
     * 该接口用于获取TTS试听文件下载链接，返回List中包含当前已生产的试听文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTtsAuditionFileRequest 请求对象
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
     * @param ShowTtsAuditionFileRequest 请求对象
     * @return SyncInvoker<ShowTtsAuditionFileRequest, ShowTtsAuditionFileResponse>
     */
    public SyncInvoker<ShowTtsAuditionFileRequest, ShowTtsAuditionFileResponse> showTtsAuditionFileInvoker(
        ShowTtsAuditionFileRequest request) {
        return new SyncInvoker<ShowTtsAuditionFileRequest, ShowTtsAuditionFileResponse>(request,
            MetaStudioMeta.showTtsAuditionFile, hcClient);
    }

    /**
     * 创建视频驱动任务
     *
     * 该接口用于创建视频驱动任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVideoMotionCaptureJobRequest 请求对象
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
     * @param CreateVideoMotionCaptureJobRequest 请求对象
     * @return SyncInvoker<CreateVideoMotionCaptureJobRequest, CreateVideoMotionCaptureJobResponse>
     */
    public SyncInvoker<CreateVideoMotionCaptureJobRequest, CreateVideoMotionCaptureJobResponse> createVideoMotionCaptureJobInvoker(
        CreateVideoMotionCaptureJobRequest request) {
        return new SyncInvoker<CreateVideoMotionCaptureJobRequest, CreateVideoMotionCaptureJobResponse>(request,
            MetaStudioMeta.createVideoMotionCaptureJob, hcClient);
    }

    /**
     * 控制数字人驱动
     *
     * 该接口用于控制数字人驱动。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteVideoMotionCaptureCommandRequest 请求对象
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
     * @param ExecuteVideoMotionCaptureCommandRequest 请求对象
     * @return SyncInvoker<ExecuteVideoMotionCaptureCommandRequest, ExecuteVideoMotionCaptureCommandResponse>
     */
    public SyncInvoker<ExecuteVideoMotionCaptureCommandRequest, ExecuteVideoMotionCaptureCommandResponse> executeVideoMotionCaptureCommandInvoker(
        ExecuteVideoMotionCaptureCommandRequest request) {
        return new SyncInvoker<ExecuteVideoMotionCaptureCommandRequest, ExecuteVideoMotionCaptureCommandResponse>(
            request, MetaStudioMeta.executeVideoMotionCaptureCommand, hcClient);
    }

    /**
     * 查询视频驱动任务列表
     *
     * 该接口用于查询视频驱动任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVideoMotionCaptureJobsRequest 请求对象
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
     * @param ListVideoMotionCaptureJobsRequest 请求对象
     * @return SyncInvoker<ListVideoMotionCaptureJobsRequest, ListVideoMotionCaptureJobsResponse>
     */
    public SyncInvoker<ListVideoMotionCaptureJobsRequest, ListVideoMotionCaptureJobsResponse> listVideoMotionCaptureJobsInvoker(
        ListVideoMotionCaptureJobsRequest request) {
        return new SyncInvoker<ListVideoMotionCaptureJobsRequest, ListVideoMotionCaptureJobsResponse>(request,
            MetaStudioMeta.listVideoMotionCaptureJobs, hcClient);
    }

    /**
     * 查询视频驱动任务详情
     *
     * 该接口用于查询视频驱动任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVideoMotionCaptureJobRequest 请求对象
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
     * @param ShowVideoMotionCaptureJobRequest 请求对象
     * @return SyncInvoker<ShowVideoMotionCaptureJobRequest, ShowVideoMotionCaptureJobResponse>
     */
    public SyncInvoker<ShowVideoMotionCaptureJobRequest, ShowVideoMotionCaptureJobResponse> showVideoMotionCaptureJobInvoker(
        ShowVideoMotionCaptureJobRequest request) {
        return new SyncInvoker<ShowVideoMotionCaptureJobRequest, ShowVideoMotionCaptureJobResponse>(request,
            MetaStudioMeta.showVideoMotionCaptureJob, hcClient);
    }

    /**
     * 停止视频驱动任务
     *
     * 该接口用于停止视频驱动任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StopVideoMotionCaptureJobRequest 请求对象
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
     * @param StopVideoMotionCaptureJobRequest 请求对象
     * @return SyncInvoker<StopVideoMotionCaptureJobRequest, StopVideoMotionCaptureJobResponse>
     */
    public SyncInvoker<StopVideoMotionCaptureJobRequest, StopVideoMotionCaptureJobResponse> stopVideoMotionCaptureJobInvoker(
        StopVideoMotionCaptureJobRequest request) {
        return new SyncInvoker<StopVideoMotionCaptureJobRequest, StopVideoMotionCaptureJobResponse>(request,
            MetaStudioMeta.stopVideoMotionCaptureJob, hcClient);
    }

    /**
     * 创建视频制作剧本
     *
     * 该接口用于创建视频制作剧本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVideoScriptsRequest 请求对象
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
     * @param CreateVideoScriptsRequest 请求对象
     * @return SyncInvoker<CreateVideoScriptsRequest, CreateVideoScriptsResponse>
     */
    public SyncInvoker<CreateVideoScriptsRequest, CreateVideoScriptsResponse> createVideoScriptsInvoker(
        CreateVideoScriptsRequest request) {
        return new SyncInvoker<CreateVideoScriptsRequest, CreateVideoScriptsResponse>(request,
            MetaStudioMeta.createVideoScripts, hcClient);
    }

    /**
     * 删除视频制作剧本
     *
     * 该接口用于删除视频制作剧本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVideoScriptRequest 请求对象
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
     * @param DeleteVideoScriptRequest 请求对象
     * @return SyncInvoker<DeleteVideoScriptRequest, DeleteVideoScriptResponse>
     */
    public SyncInvoker<DeleteVideoScriptRequest, DeleteVideoScriptResponse> deleteVideoScriptInvoker(
        DeleteVideoScriptRequest request) {
        return new SyncInvoker<DeleteVideoScriptRequest, DeleteVideoScriptResponse>(request,
            MetaStudioMeta.deleteVideoScript, hcClient);
    }

    /**
     * 查询视频制作剧本列表
     *
     * 该接口用于查询视频制作剧本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVideoScriptsRequest 请求对象
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
     * @param ListVideoScriptsRequest 请求对象
     * @return SyncInvoker<ListVideoScriptsRequest, ListVideoScriptsResponse>
     */
    public SyncInvoker<ListVideoScriptsRequest, ListVideoScriptsResponse> listVideoScriptsInvoker(
        ListVideoScriptsRequest request) {
        return new SyncInvoker<ListVideoScriptsRequest, ListVideoScriptsResponse>(request,
            MetaStudioMeta.listVideoScripts, hcClient);
    }

    /**
     * 查询视频制作剧本详情
     *
     * 该接口用于查询视频制作剧本详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVideoScriptRequest 请求对象
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
     * @param ShowVideoScriptRequest 请求对象
     * @return SyncInvoker<ShowVideoScriptRequest, ShowVideoScriptResponse>
     */
    public SyncInvoker<ShowVideoScriptRequest, ShowVideoScriptResponse> showVideoScriptInvoker(
        ShowVideoScriptRequest request) {
        return new SyncInvoker<ShowVideoScriptRequest, ShowVideoScriptResponse>(request, MetaStudioMeta.showVideoScript,
            hcClient);
    }

    /**
     * 更新视频制作剧本
     *
     * 该接口用于更新视频制作剧本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVideoScriptRequest 请求对象
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
     * @param UpdateVideoScriptRequest 请求对象
     * @return SyncInvoker<UpdateVideoScriptRequest, UpdateVideoScriptResponse>
     */
    public SyncInvoker<UpdateVideoScriptRequest, UpdateVideoScriptResponse> updateVideoScriptInvoker(
        UpdateVideoScriptRequest request) {
        return new SyncInvoker<UpdateVideoScriptRequest, UpdateVideoScriptResponse>(request,
            MetaStudioMeta.updateVideoScript, hcClient);
    }

}

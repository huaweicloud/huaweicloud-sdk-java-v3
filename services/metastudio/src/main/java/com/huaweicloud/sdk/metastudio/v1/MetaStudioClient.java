package com.huaweicloud.sdk.metastudio.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.metastudio.v1.model.ConfirmFileUploadRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ConfirmFileUploadResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateDigitalAssetRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateDigitalAssetResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateFileRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateFileResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePictureModelingByUrlJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePictureModelingByUrlJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePictureModelingJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreatePictureModelingJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateTtsaRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateTtsaResponse;
import com.huaweicloud.sdk.metastudio.v1.model.CreateVideoMotionCaptureJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.CreateVideoMotionCaptureJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteAssetRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteAssetResponse;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteFileRequest;
import com.huaweicloud.sdk.metastudio.v1.model.DeleteFileResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ExecuteVideoMotionCaptureCommandRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ExecuteVideoMotionCaptureCommandResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListAssetSummaryRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListAssetSummaryResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListAssetsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListAssetsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListPictureModelingJobsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListPictureModelingJobsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListSelfPrivilegesRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListSelfPrivilegesResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListStylesRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListStylesResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListTtsaDataRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListTtsaDataResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListTtsaJobsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListTtsaJobsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ListVideoMotionCaptureJobsRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ListVideoMotionCaptureJobsResponse;
import com.huaweicloud.sdk.metastudio.v1.model.RestoreAssetRequest;
import com.huaweicloud.sdk.metastudio.v1.model.RestoreAssetResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowAssetRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowAssetResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowPictureModelingJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowPictureModelingJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.ShowVideoMotionCaptureJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.ShowVideoMotionCaptureJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.StopVideoMotionCaptureJobRequest;
import com.huaweicloud.sdk.metastudio.v1.model.StopVideoMotionCaptureJobResponse;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateDigitalAssetRequest;
import com.huaweicloud.sdk.metastudio.v1.model.UpdateDigitalAssetResponse;

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
     * 该接口用于在资产库中添加上传新的媒体资产。可上传的资产类型包括：数字人模型、素材、视频、图片、场景等。
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
     * 该接口用于在资产库中添加上传新的媒体资产。可上传的资产类型包括：数字人模型、素材、视频、图片、场景等。
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
     * 该接口用于删除资产库中的媒体资产列表。第一次调用删除接口，将指定资产放入回收站；第二次调用删除接口，将指定资产彻底删除。
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
     * 该接口用于删除资产库中的媒体资产列表。第一次调用删除接口，将指定资产放入回收站；第二次调用删除接口，将指定资产彻底删除。
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
     * 该接口用于更新资产库中的媒体资产列表。
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
     * 该接口用于更新资产库中的媒体资产列表。
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
     * 查看租户自己权限列表
     *
     * 查看租户自己权限列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSelfPrivilegesRequest 请求对象
     * @return ListSelfPrivilegesResponse
     */
    public ListSelfPrivilegesResponse listSelfPrivileges(ListSelfPrivilegesRequest request) {
        return hcClient.syncInvokeHttp(request, MetaStudioMeta.listSelfPrivileges);
    }

    /**
     * 查看租户自己权限列表
     *
     * 查看租户自己权限列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSelfPrivilegesRequest 请求对象
     * @return SyncInvoker<ListSelfPrivilegesRequest, ListSelfPrivilegesResponse>
     */
    public SyncInvoker<ListSelfPrivilegesRequest, ListSelfPrivilegesResponse> listSelfPrivilegesInvoker(
        ListSelfPrivilegesRequest request) {
        return new SyncInvoker<ListSelfPrivilegesRequest, ListSelfPrivilegesResponse>(request,
            MetaStudioMeta.listSelfPrivileges, hcClient);
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

}

package com.huaweicloud.sdk.ims.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.ims.v2.model.AddImageTagRequest;
import com.huaweicloud.sdk.ims.v2.model.AddImageTagResponse;
import com.huaweicloud.sdk.ims.v2.model.BatchAddMembersRequest;
import com.huaweicloud.sdk.ims.v2.model.BatchAddMembersResponse;
import com.huaweicloud.sdk.ims.v2.model.BatchAddOrDeleteTagsRequest;
import com.huaweicloud.sdk.ims.v2.model.BatchAddOrDeleteTagsResponse;
import com.huaweicloud.sdk.ims.v2.model.BatchDeleteMembersRequest;
import com.huaweicloud.sdk.ims.v2.model.BatchDeleteMembersResponse;
import com.huaweicloud.sdk.ims.v2.model.BatchDeleteTagsRequest;
import com.huaweicloud.sdk.ims.v2.model.BatchDeleteTagsResponse;
import com.huaweicloud.sdk.ims.v2.model.BatchUpdateMembersRequest;
import com.huaweicloud.sdk.ims.v2.model.BatchUpdateMembersResponse;
import com.huaweicloud.sdk.ims.v2.model.CopyImageCrossRegionRequest;
import com.huaweicloud.sdk.ims.v2.model.CopyImageCrossRegionResponse;
import com.huaweicloud.sdk.ims.v2.model.CopyImageInRegionInSafeModeRequest;
import com.huaweicloud.sdk.ims.v2.model.CopyImageInRegionInSafeModeResponse;
import com.huaweicloud.sdk.ims.v2.model.CopyImageInRegionRequest;
import com.huaweicloud.sdk.ims.v2.model.CopyImageInRegionResponse;
import com.huaweicloud.sdk.ims.v2.model.CreateDataImageInSafeModeRequest;
import com.huaweicloud.sdk.ims.v2.model.CreateDataImageInSafeModeResponse;
import com.huaweicloud.sdk.ims.v2.model.CreateDataImageRequest;
import com.huaweicloud.sdk.ims.v2.model.CreateDataImageResponse;
import com.huaweicloud.sdk.ims.v2.model.CreateImageInSafeModeRequest;
import com.huaweicloud.sdk.ims.v2.model.CreateImageInSafeModeResponse;
import com.huaweicloud.sdk.ims.v2.model.CreateImageRequest;
import com.huaweicloud.sdk.ims.v2.model.CreateImageResponse;
import com.huaweicloud.sdk.ims.v2.model.CreateOrUpdateTagsRequest;
import com.huaweicloud.sdk.ims.v2.model.CreateOrUpdateTagsResponse;
import com.huaweicloud.sdk.ims.v2.model.CreateWholeImageRequest;
import com.huaweicloud.sdk.ims.v2.model.CreateWholeImageResponse;
import com.huaweicloud.sdk.ims.v2.model.DeleteImageTagRequest;
import com.huaweicloud.sdk.ims.v2.model.DeleteImageTagResponse;
import com.huaweicloud.sdk.ims.v2.model.ExportImageInSafeModeRequest;
import com.huaweicloud.sdk.ims.v2.model.ExportImageInSafeModeResponse;
import com.huaweicloud.sdk.ims.v2.model.ExportImageRequest;
import com.huaweicloud.sdk.ims.v2.model.ExportImageResponse;
import com.huaweicloud.sdk.ims.v2.model.GlanceAddImageMemberRequest;
import com.huaweicloud.sdk.ims.v2.model.GlanceAddImageMemberResponse;
import com.huaweicloud.sdk.ims.v2.model.GlanceCreateImageMetadataRequest;
import com.huaweicloud.sdk.ims.v2.model.GlanceCreateImageMetadataResponse;
import com.huaweicloud.sdk.ims.v2.model.GlanceCreateTagRequest;
import com.huaweicloud.sdk.ims.v2.model.GlanceCreateTagResponse;
import com.huaweicloud.sdk.ims.v2.model.GlanceDeleteImageMemberRequest;
import com.huaweicloud.sdk.ims.v2.model.GlanceDeleteImageMemberResponse;
import com.huaweicloud.sdk.ims.v2.model.GlanceDeleteImageRequest;
import com.huaweicloud.sdk.ims.v2.model.GlanceDeleteImageResponse;
import com.huaweicloud.sdk.ims.v2.model.GlanceDeleteTagRequest;
import com.huaweicloud.sdk.ims.v2.model.GlanceDeleteTagResponse;
import com.huaweicloud.sdk.ims.v2.model.GlanceListImageMemberSchemasRequest;
import com.huaweicloud.sdk.ims.v2.model.GlanceListImageMemberSchemasResponse;
import com.huaweicloud.sdk.ims.v2.model.GlanceListImageMembersRequest;
import com.huaweicloud.sdk.ims.v2.model.GlanceListImageMembersResponse;
import com.huaweicloud.sdk.ims.v2.model.GlanceListImageSchemasRequest;
import com.huaweicloud.sdk.ims.v2.model.GlanceListImageSchemasResponse;
import com.huaweicloud.sdk.ims.v2.model.GlanceListImagesRequest;
import com.huaweicloud.sdk.ims.v2.model.GlanceListImagesResponse;
import com.huaweicloud.sdk.ims.v2.model.GlanceShowImageMemberRequest;
import com.huaweicloud.sdk.ims.v2.model.GlanceShowImageMemberResponse;
import com.huaweicloud.sdk.ims.v2.model.GlanceShowImageMemberSchemasRequest;
import com.huaweicloud.sdk.ims.v2.model.GlanceShowImageMemberSchemasResponse;
import com.huaweicloud.sdk.ims.v2.model.GlanceShowImageRequest;
import com.huaweicloud.sdk.ims.v2.model.GlanceShowImageResponse;
import com.huaweicloud.sdk.ims.v2.model.GlanceShowImageSchemasRequest;
import com.huaweicloud.sdk.ims.v2.model.GlanceShowImageSchemasResponse;
import com.huaweicloud.sdk.ims.v2.model.GlanceUpdateImageMemberRequest;
import com.huaweicloud.sdk.ims.v2.model.GlanceUpdateImageMemberResponse;
import com.huaweicloud.sdk.ims.v2.model.GlanceUpdateImageRequest;
import com.huaweicloud.sdk.ims.v2.model.GlanceUpdateImageResponse;
import com.huaweicloud.sdk.ims.v2.model.ImportImageQuickInSafeModeRequest;
import com.huaweicloud.sdk.ims.v2.model.ImportImageQuickInSafeModeResponse;
import com.huaweicloud.sdk.ims.v2.model.ImportImageQuickRequest;
import com.huaweicloud.sdk.ims.v2.model.ImportImageQuickResponse;
import com.huaweicloud.sdk.ims.v2.model.ListImageByTagsRequest;
import com.huaweicloud.sdk.ims.v2.model.ListImageByTagsResponse;
import com.huaweicloud.sdk.ims.v2.model.ListImageMembersRequest;
import com.huaweicloud.sdk.ims.v2.model.ListImageMembersResponse;
import com.huaweicloud.sdk.ims.v2.model.ListImageTagsRequest;
import com.huaweicloud.sdk.ims.v2.model.ListImageTagsResponse;
import com.huaweicloud.sdk.ims.v2.model.ListImagesRequest;
import com.huaweicloud.sdk.ims.v2.model.ListImagesResponse;
import com.huaweicloud.sdk.ims.v2.model.ListImagesTagsRequest;
import com.huaweicloud.sdk.ims.v2.model.ListImagesTagsResponse;
import com.huaweicloud.sdk.ims.v2.model.ListOsVersionsRequest;
import com.huaweicloud.sdk.ims.v2.model.ListOsVersionsResponse;
import com.huaweicloud.sdk.ims.v2.model.ListTagsRequest;
import com.huaweicloud.sdk.ims.v2.model.ListTagsResponse;
import com.huaweicloud.sdk.ims.v2.model.ListVersionsRequest;
import com.huaweicloud.sdk.ims.v2.model.ListVersionsResponse;
import com.huaweicloud.sdk.ims.v2.model.RegisterImageRequest;
import com.huaweicloud.sdk.ims.v2.model.RegisterImageResponse;
import com.huaweicloud.sdk.ims.v2.model.ShowImageMemberRequest;
import com.huaweicloud.sdk.ims.v2.model.ShowImageMemberResponse;
import com.huaweicloud.sdk.ims.v2.model.ShowImageQuotaRequest;
import com.huaweicloud.sdk.ims.v2.model.ShowImageQuotaResponse;
import com.huaweicloud.sdk.ims.v2.model.ShowJobProgressRequest;
import com.huaweicloud.sdk.ims.v2.model.ShowJobProgressResponse;
import com.huaweicloud.sdk.ims.v2.model.ShowJobRequest;
import com.huaweicloud.sdk.ims.v2.model.ShowJobResponse;
import com.huaweicloud.sdk.ims.v2.model.ShowVersionRequest;
import com.huaweicloud.sdk.ims.v2.model.ShowVersionResponse;
import com.huaweicloud.sdk.ims.v2.model.UpdateImageRequest;
import com.huaweicloud.sdk.ims.v2.model.UpdateImageResponse;

public class ImsClient {

    protected HcClient hcClient;

    public ImsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ImsClient> newBuilder() {
        ClientBuilder<ImsClient> clientBuilder = new ClientBuilder<>(ImsClient::new);
        return clientBuilder;
    }

    /**
     * 添加镜像标签
     *
     * 该接口用于为指定镜像添加或更新指定的单个标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddImageTagRequest 请求对象
     * @return AddImageTagResponse
     */
    public AddImageTagResponse addImageTag(AddImageTagRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.addImageTag);
    }

    /**
     * 添加镜像标签
     *
     * 该接口用于为指定镜像添加或更新指定的单个标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddImageTagRequest 请求对象
     * @return SyncInvoker<AddImageTagRequest, AddImageTagResponse>
     */
    public SyncInvoker<AddImageTagRequest, AddImageTagResponse> addImageTagInvoker(AddImageTagRequest request) {
        return new SyncInvoker<>(request, ImsMeta.addImageTag, hcClient);
    }

    /**
     * 批量添加镜像成员
     *
     * 该接口为扩展接口，主要用于镜像共享时用户将多个镜像共享给多个用户。
     * 该接口为异步接口，返回job_id说明任务下发成功，查询异步任务状态，如果是success说明任务执行成功，如果是failed说明任务执行失败。如何查询异步任务，请参见异步任务查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddMembersRequest 请求对象
     * @return BatchAddMembersResponse
     */
    public BatchAddMembersResponse batchAddMembers(BatchAddMembersRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.batchAddMembers);
    }

    /**
     * 批量添加镜像成员
     *
     * 该接口为扩展接口，主要用于镜像共享时用户将多个镜像共享给多个用户。
     * 该接口为异步接口，返回job_id说明任务下发成功，查询异步任务状态，如果是success说明任务执行成功，如果是failed说明任务执行失败。如何查询异步任务，请参见异步任务查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddMembersRequest 请求对象
     * @return SyncInvoker<BatchAddMembersRequest, BatchAddMembersResponse>
     */
    public SyncInvoker<BatchAddMembersRequest, BatchAddMembersResponse> batchAddMembersInvoker(
        BatchAddMembersRequest request) {
        return new SyncInvoker<>(request, ImsMeta.batchAddMembers, hcClient);
    }

    /**
     * 批量添加删除镜像标签
     *
     * 该接口用于为指定镜像批量添加/更新、删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddOrDeleteTagsRequest 请求对象
     * @return BatchAddOrDeleteTagsResponse
     */
    public BatchAddOrDeleteTagsResponse batchAddOrDeleteTags(BatchAddOrDeleteTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.batchAddOrDeleteTags);
    }

    /**
     * 批量添加删除镜像标签
     *
     * 该接口用于为指定镜像批量添加/更新、删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddOrDeleteTagsRequest 请求对象
     * @return SyncInvoker<BatchAddOrDeleteTagsRequest, BatchAddOrDeleteTagsResponse>
     */
    public SyncInvoker<BatchAddOrDeleteTagsRequest, BatchAddOrDeleteTagsResponse> batchAddOrDeleteTagsInvoker(
        BatchAddOrDeleteTagsRequest request) {
        return new SyncInvoker<>(request, ImsMeta.batchAddOrDeleteTags, hcClient);
    }

    /**
     * 批量删除镜像成员
     *
     * 该接口为扩展接口，主要用于取消镜像共享。
     * 该接口为异步接口，返回job_id说明任务下发成功，查询异步任务状态，如果是success说明任务执行成功，如果是failed说明任务执行失败。如何查询异步任务，请参见异步任务查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteMembersRequest 请求对象
     * @return BatchDeleteMembersResponse
     */
    public BatchDeleteMembersResponse batchDeleteMembers(BatchDeleteMembersRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.batchDeleteMembers);
    }

    /**
     * 批量删除镜像成员
     *
     * 该接口为扩展接口，主要用于取消镜像共享。
     * 该接口为异步接口，返回job_id说明任务下发成功，查询异步任务状态，如果是success说明任务执行成功，如果是failed说明任务执行失败。如何查询异步任务，请参见异步任务查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteMembersRequest 请求对象
     * @return SyncInvoker<BatchDeleteMembersRequest, BatchDeleteMembersResponse>
     */
    public SyncInvoker<BatchDeleteMembersRequest, BatchDeleteMembersResponse> batchDeleteMembersInvoker(
        BatchDeleteMembersRequest request) {
        return new SyncInvoker<>(request, ImsMeta.batchDeleteMembers, hcClient);
    }

    /**
     * 批量删除镜像标签
     *
     * 该接口用于为指定镜像批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTagsRequest 请求对象
     * @return BatchDeleteTagsResponse
     */
    public BatchDeleteTagsResponse batchDeleteTags(BatchDeleteTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.batchDeleteTags);
    }

    /**
     * 批量删除镜像标签
     *
     * 该接口用于为指定镜像批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse>
     */
    public SyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse> batchDeleteTagsInvoker(
        BatchDeleteTagsRequest request) {
        return new SyncInvoker<>(request, ImsMeta.batchDeleteTags, hcClient);
    }

    /**
     * 批量更新镜像成员状态
     *
     * 该接口为扩展接口，主要用于用户接受或者拒绝多个共享镜像时批量更新镜像成员的状态。
     * 该接口为异步接口，返回job_id说明任务下发成功，查询异步任务状态，如果是success说明任务执行成功，如果是failed说明任务执行失败。如何查询异步任务，请参见异步任务查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateMembersRequest 请求对象
     * @return BatchUpdateMembersResponse
     */
    public BatchUpdateMembersResponse batchUpdateMembers(BatchUpdateMembersRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.batchUpdateMembers);
    }

    /**
     * 批量更新镜像成员状态
     *
     * 该接口为扩展接口，主要用于用户接受或者拒绝多个共享镜像时批量更新镜像成员的状态。
     * 该接口为异步接口，返回job_id说明任务下发成功，查询异步任务状态，如果是success说明任务执行成功，如果是failed说明任务执行失败。如何查询异步任务，请参见异步任务查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateMembersRequest 请求对象
     * @return SyncInvoker<BatchUpdateMembersRequest, BatchUpdateMembersResponse>
     */
    public SyncInvoker<BatchUpdateMembersRequest, BatchUpdateMembersResponse> batchUpdateMembersInvoker(
        BatchUpdateMembersRequest request) {
        return new SyncInvoker<>(request, ImsMeta.batchUpdateMembers, hcClient);
    }

    /**
     * 跨Region复制镜像
     *
     * 该接口为扩展接口，用户在一个区域制作的私有镜像，可以通过跨Region复制镜像将镜像复制到其他区域，在其他区域发放相同类型的云服务器，帮助用户实现区域间的业务迁移。
     * 该接口为异步接口，返回job_id说明任务下发成功，查询异步任务状态，如果是success说明任务执行成功，如果是failed说明任务执行失败。
     * 如何查询异步任务，请参见异步任务进度查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyImageCrossRegionRequest 请求对象
     * @return CopyImageCrossRegionResponse
     */
    public CopyImageCrossRegionResponse copyImageCrossRegion(CopyImageCrossRegionRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.copyImageCrossRegion);
    }

    /**
     * 跨Region复制镜像
     *
     * 该接口为扩展接口，用户在一个区域制作的私有镜像，可以通过跨Region复制镜像将镜像复制到其他区域，在其他区域发放相同类型的云服务器，帮助用户实现区域间的业务迁移。
     * 该接口为异步接口，返回job_id说明任务下发成功，查询异步任务状态，如果是success说明任务执行成功，如果是failed说明任务执行失败。
     * 如何查询异步任务，请参见异步任务进度查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyImageCrossRegionRequest 请求对象
     * @return SyncInvoker<CopyImageCrossRegionRequest, CopyImageCrossRegionResponse>
     */
    public SyncInvoker<CopyImageCrossRegionRequest, CopyImageCrossRegionResponse> copyImageCrossRegionInvoker(
        CopyImageCrossRegionRequest request) {
        return new SyncInvoker<>(request, ImsMeta.copyImageCrossRegion, hcClient);
    }

    /**
     * Region内复制镜像
     *
     * 该接口为扩展接口，主要用于用户将一个已有镜像复制为另一个镜像。复制镜像时，可以更改镜像的加密等属性，以满足不同的场景。
     * 该接口为异步接口，返回job_id说明任务下发成功，查询异步任务状态，如果是success说明任务执行成功，如果是failed说明任务执行失败。如何查询异步任务，请参见异步任务查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyImageInRegionRequest 请求对象
     * @return CopyImageInRegionResponse
     */
    public CopyImageInRegionResponse copyImageInRegion(CopyImageInRegionRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.copyImageInRegion);
    }

    /**
     * Region内复制镜像
     *
     * 该接口为扩展接口，主要用于用户将一个已有镜像复制为另一个镜像。复制镜像时，可以更改镜像的加密等属性，以满足不同的场景。
     * 该接口为异步接口，返回job_id说明任务下发成功，查询异步任务状态，如果是success说明任务执行成功，如果是failed说明任务执行失败。如何查询异步任务，请参见异步任务查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyImageInRegionRequest 请求对象
     * @return SyncInvoker<CopyImageInRegionRequest, CopyImageInRegionResponse>
     */
    public SyncInvoker<CopyImageInRegionRequest, CopyImageInRegionResponse> copyImageInRegionInvoker(
        CopyImageInRegionRequest request) {
        return new SyncInvoker<>(request, ImsMeta.copyImageInRegion, hcClient);
    }

    /**
     * Region内复制镜像（新）
     *
     * 该接口为扩展接口，主要用于用户将一个已有镜像复制为另一个镜像。复制镜像时，可以更改镜像的加密等属性，以满足不同的场景。
     * 该接口为异步接口，返回job_id说明任务下发成功，查询异步任务状态，如果是success说明任务执行成功，如果是failed说明任务执行失败。如何查询异步任务，请参见异步任务查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyImageInRegionInSafeModeRequest 请求对象
     * @return CopyImageInRegionInSafeModeResponse
     */
    public CopyImageInRegionInSafeModeResponse copyImageInRegionInSafeMode(CopyImageInRegionInSafeModeRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.copyImageInRegionInSafeMode);
    }

    /**
     * Region内复制镜像（新）
     *
     * 该接口为扩展接口，主要用于用户将一个已有镜像复制为另一个镜像。复制镜像时，可以更改镜像的加密等属性，以满足不同的场景。
     * 该接口为异步接口，返回job_id说明任务下发成功，查询异步任务状态，如果是success说明任务执行成功，如果是failed说明任务执行失败。如何查询异步任务，请参见异步任务查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyImageInRegionInSafeModeRequest 请求对象
     * @return SyncInvoker<CopyImageInRegionInSafeModeRequest, CopyImageInRegionInSafeModeResponse>
     */
    public SyncInvoker<CopyImageInRegionInSafeModeRequest, CopyImageInRegionInSafeModeResponse> copyImageInRegionInSafeModeInvoker(
        CopyImageInRegionInSafeModeRequest request) {
        return new SyncInvoker<>(request, ImsMeta.copyImageInRegionInSafeMode, hcClient);
    }

    /**
     * 使用外部镜像文件制作数据镜像
     *
     * 使用上传至OBS桶中的外部数据卷镜像文件制作数据镜像。作为异步接口，调用成功，只是说明后台收到了制作请求，镜像是否制作成功需要通过异步任务查询接口查询该任务的执行状态。具体请参考异步任务查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataImageRequest 请求对象
     * @return CreateDataImageResponse
     */
    public CreateDataImageResponse createDataImage(CreateDataImageRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.createDataImage);
    }

    /**
     * 使用外部镜像文件制作数据镜像
     *
     * 使用上传至OBS桶中的外部数据卷镜像文件制作数据镜像。作为异步接口，调用成功，只是说明后台收到了制作请求，镜像是否制作成功需要通过异步任务查询接口查询该任务的执行状态。具体请参考异步任务查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataImageRequest 请求对象
     * @return SyncInvoker<CreateDataImageRequest, CreateDataImageResponse>
     */
    public SyncInvoker<CreateDataImageRequest, CreateDataImageResponse> createDataImageInvoker(
        CreateDataImageRequest request) {
        return new SyncInvoker<>(request, ImsMeta.createDataImage, hcClient);
    }

    /**
     * 使用外部镜像文件制作数据镜像（新）
     *
     * 使用上传至OBS桶中的外部数据卷镜像文件制作数据镜像。作为异步接口，调用成功，只是说明后台收到了制作请求，镜像是否制作成功需要通过异步任务查询接口查询该任务的执行状态。具体请参考异步任务查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataImageInSafeModeRequest 请求对象
     * @return CreateDataImageInSafeModeResponse
     */
    public CreateDataImageInSafeModeResponse createDataImageInSafeMode(CreateDataImageInSafeModeRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.createDataImageInSafeMode);
    }

    /**
     * 使用外部镜像文件制作数据镜像（新）
     *
     * 使用上传至OBS桶中的外部数据卷镜像文件制作数据镜像。作为异步接口，调用成功，只是说明后台收到了制作请求，镜像是否制作成功需要通过异步任务查询接口查询该任务的执行状态。具体请参考异步任务查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDataImageInSafeModeRequest 请求对象
     * @return SyncInvoker<CreateDataImageInSafeModeRequest, CreateDataImageInSafeModeResponse>
     */
    public SyncInvoker<CreateDataImageInSafeModeRequest, CreateDataImageInSafeModeResponse> createDataImageInSafeModeInvoker(
        CreateDataImageInSafeModeRequest request) {
        return new SyncInvoker<>(request, ImsMeta.createDataImageInSafeMode, hcClient);
    }

    /**
     * 制作镜像
     *
     * 本接口用于制作私有镜像，支持：
     * - 使用云服务器制作私有镜像。
     * - 使用上传至OBS桶中的外部镜像文件制作私有镜像。
     * - 使用数据卷制作系统盘镜像。
     * 
     * 作为异步接口，调用成功，只是说明云平台收到了制作请求，镜像是否制作成功需要通过异步任务查询接口查询该任务的执行状态，具体请参考异步任务查询。
     * 
     * 不同场景必选参数说明：
     * 
     * - 使用云服务器制作镜像时的请求的必选参数：name,instance_id。
     * - 使用上传至OBS桶中的外部镜像文件时的请求必选参数：name,image_url,min_disk。
     * - 使用数据卷制作系统盘镜像时的请求必选参数：name,volume_id,os_version
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImageRequest 请求对象
     * @return CreateImageResponse
     */
    public CreateImageResponse createImage(CreateImageRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.createImage);
    }

    /**
     * 制作镜像
     *
     * 本接口用于制作私有镜像，支持：
     * - 使用云服务器制作私有镜像。
     * - 使用上传至OBS桶中的外部镜像文件制作私有镜像。
     * - 使用数据卷制作系统盘镜像。
     * 
     * 作为异步接口，调用成功，只是说明云平台收到了制作请求，镜像是否制作成功需要通过异步任务查询接口查询该任务的执行状态，具体请参考异步任务查询。
     * 
     * 不同场景必选参数说明：
     * 
     * - 使用云服务器制作镜像时的请求的必选参数：name,instance_id。
     * - 使用上传至OBS桶中的外部镜像文件时的请求必选参数：name,image_url,min_disk。
     * - 使用数据卷制作系统盘镜像时的请求必选参数：name,volume_id,os_version
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImageRequest 请求对象
     * @return SyncInvoker<CreateImageRequest, CreateImageResponse>
     */
    public SyncInvoker<CreateImageRequest, CreateImageResponse> createImageInvoker(CreateImageRequest request) {
        return new SyncInvoker<>(request, ImsMeta.createImage, hcClient);
    }

    /**
     * 制作镜像（新）
     *
     * 本接口用于制作私有镜像，支持：
     * - 使用云服务器制作私有镜像。
     * - 使用上传至OBS桶中的外部镜像文件制作私有镜像。
     * - 使用数据卷制作系统盘镜像。
     * 
     * 作为异步接口，调用成功，只是说明云平台收到了制作请求，镜像是否制作成功需要通过异步任务查询接口查询该任务的执行状态，具体请参考异步任务查询。
     * 
     * 不同场景必选参数说明：
     * 
     * - 使用云服务器制作镜像时的请求的必选参数：name,instance_id。
     * - 使用上传至OBS桶中的外部镜像文件时的请求必选参数：name,image_url,min_disk。
     * - 使用数据卷制作系统盘镜像时的请求必选参数：name,volume_id,os_version
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImageInSafeModeRequest 请求对象
     * @return CreateImageInSafeModeResponse
     */
    public CreateImageInSafeModeResponse createImageInSafeMode(CreateImageInSafeModeRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.createImageInSafeMode);
    }

    /**
     * 制作镜像（新）
     *
     * 本接口用于制作私有镜像，支持：
     * - 使用云服务器制作私有镜像。
     * - 使用上传至OBS桶中的外部镜像文件制作私有镜像。
     * - 使用数据卷制作系统盘镜像。
     * 
     * 作为异步接口，调用成功，只是说明云平台收到了制作请求，镜像是否制作成功需要通过异步任务查询接口查询该任务的执行状态，具体请参考异步任务查询。
     * 
     * 不同场景必选参数说明：
     * 
     * - 使用云服务器制作镜像时的请求的必选参数：name,instance_id。
     * - 使用上传至OBS桶中的外部镜像文件时的请求必选参数：name,image_url,min_disk。
     * - 使用数据卷制作系统盘镜像时的请求必选参数：name,volume_id,os_version
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateImageInSafeModeRequest 请求对象
     * @return SyncInvoker<CreateImageInSafeModeRequest, CreateImageInSafeModeResponse>
     */
    public SyncInvoker<CreateImageInSafeModeRequest, CreateImageInSafeModeResponse> createImageInSafeModeInvoker(
        CreateImageInSafeModeRequest request) {
        return new SyncInvoker<>(request, ImsMeta.createImageInSafeMode, hcClient);
    }

    /**
     * 增加或修改标签
     *
     * 该接口主要用于为某个镜像增加或修改一个自定义标签。通过自定义标签，用户可以将镜像进行分类。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrUpdateTagsRequest 请求对象
     * @return CreateOrUpdateTagsResponse
     */
    public CreateOrUpdateTagsResponse createOrUpdateTags(CreateOrUpdateTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.createOrUpdateTags);
    }

    /**
     * 增加或修改标签
     *
     * 该接口主要用于为某个镜像增加或修改一个自定义标签。通过自定义标签，用户可以将镜像进行分类。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrUpdateTagsRequest 请求对象
     * @return SyncInvoker<CreateOrUpdateTagsRequest, CreateOrUpdateTagsResponse>
     */
    public SyncInvoker<CreateOrUpdateTagsRequest, CreateOrUpdateTagsResponse> createOrUpdateTagsInvoker(
        CreateOrUpdateTagsRequest request) {
        return new SyncInvoker<>(request, ImsMeta.createOrUpdateTags, hcClient);
    }

    /**
     * 制作整机镜像
     *
     * 使用云服务器或者云服务器备份制作整机镜像。作为异步接口，调用成功，只是说明后台收到了制作整机镜像的请求，镜像是否制作成功需要通过异步任务查询接口查询该任务的执行状态，具体请参考异步任务查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWholeImageRequest 请求对象
     * @return CreateWholeImageResponse
     */
    public CreateWholeImageResponse createWholeImage(CreateWholeImageRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.createWholeImage);
    }

    /**
     * 制作整机镜像
     *
     * 使用云服务器或者云服务器备份制作整机镜像。作为异步接口，调用成功，只是说明后台收到了制作整机镜像的请求，镜像是否制作成功需要通过异步任务查询接口查询该任务的执行状态，具体请参考异步任务查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWholeImageRequest 请求对象
     * @return SyncInvoker<CreateWholeImageRequest, CreateWholeImageResponse>
     */
    public SyncInvoker<CreateWholeImageRequest, CreateWholeImageResponse> createWholeImageInvoker(
        CreateWholeImageRequest request) {
        return new SyncInvoker<>(request, ImsMeta.createWholeImage, hcClient);
    }

    /**
     * 删除镜像标签
     *
     * 该接口用于为镜像删除指定的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteImageTagRequest 请求对象
     * @return DeleteImageTagResponse
     */
    public DeleteImageTagResponse deleteImageTag(DeleteImageTagRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.deleteImageTag);
    }

    /**
     * 删除镜像标签
     *
     * 该接口用于为镜像删除指定的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteImageTagRequest 请求对象
     * @return SyncInvoker<DeleteImageTagRequest, DeleteImageTagResponse>
     */
    public SyncInvoker<DeleteImageTagRequest, DeleteImageTagResponse> deleteImageTagInvoker(
        DeleteImageTagRequest request) {
        return new SyncInvoker<>(request, ImsMeta.deleteImageTag, hcClient);
    }

    /**
     * 导出镜像
     *
     * 该接口为扩展接口，用于用户将自己的私有镜像导出到指定的OBS桶中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportImageRequest 请求对象
     * @return ExportImageResponse
     */
    public ExportImageResponse exportImage(ExportImageRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.exportImage);
    }

    /**
     * 导出镜像
     *
     * 该接口为扩展接口，用于用户将自己的私有镜像导出到指定的OBS桶中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportImageRequest 请求对象
     * @return SyncInvoker<ExportImageRequest, ExportImageResponse>
     */
    public SyncInvoker<ExportImageRequest, ExportImageResponse> exportImageInvoker(ExportImageRequest request) {
        return new SyncInvoker<>(request, ImsMeta.exportImage, hcClient);
    }

    /**
     * 导出镜像（新）
     *
     * 该接口为扩展接口，用于用户将自己的私有镜像导出到指定的OBS桶中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportImageInSafeModeRequest 请求对象
     * @return ExportImageInSafeModeResponse
     */
    public ExportImageInSafeModeResponse exportImageInSafeMode(ExportImageInSafeModeRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.exportImageInSafeMode);
    }

    /**
     * 导出镜像（新）
     *
     * 该接口为扩展接口，用于用户将自己的私有镜像导出到指定的OBS桶中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportImageInSafeModeRequest 请求对象
     * @return SyncInvoker<ExportImageInSafeModeRequest, ExportImageInSafeModeResponse>
     */
    public SyncInvoker<ExportImageInSafeModeRequest, ExportImageInSafeModeResponse> exportImageInSafeModeInvoker(
        ExportImageInSafeModeRequest request) {
        return new SyncInvoker<>(request, ImsMeta.exportImageInSafeMode, hcClient);
    }

    /**
     * 镜像文件快速导入
     *
     * 使用上传至OBS桶中的超大外部镜像文件制作私有镜像，目前仅支持RAW或ZVHD2格式镜像文件。且要求镜像文件大小不能超过1TB。
     * 由于快速导入功能要求提前转换镜像文件格式为RAW或ZVHD2格式，因此镜像文件小于128GB时推荐您优先使用常规的创建私有镜像的方式。
     * 作为异步接口，调用成功，只是说明后台收到了制作请求，镜像是否制作成功需要通过异步任务查询接口查询该任务的执行状态，具体请参考异步任务查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportImageQuickRequest 请求对象
     * @return ImportImageQuickResponse
     */
    public ImportImageQuickResponse importImageQuick(ImportImageQuickRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.importImageQuick);
    }

    /**
     * 镜像文件快速导入
     *
     * 使用上传至OBS桶中的超大外部镜像文件制作私有镜像，目前仅支持RAW或ZVHD2格式镜像文件。且要求镜像文件大小不能超过1TB。
     * 由于快速导入功能要求提前转换镜像文件格式为RAW或ZVHD2格式，因此镜像文件小于128GB时推荐您优先使用常规的创建私有镜像的方式。
     * 作为异步接口，调用成功，只是说明后台收到了制作请求，镜像是否制作成功需要通过异步任务查询接口查询该任务的执行状态，具体请参考异步任务查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportImageQuickRequest 请求对象
     * @return SyncInvoker<ImportImageQuickRequest, ImportImageQuickResponse>
     */
    public SyncInvoker<ImportImageQuickRequest, ImportImageQuickResponse> importImageQuickInvoker(
        ImportImageQuickRequest request) {
        return new SyncInvoker<>(request, ImsMeta.importImageQuick, hcClient);
    }

    /**
     * 镜像文件快速导入（新）
     *
     * 使用上传至OBS桶中的超大外部镜像文件制作私有镜像，目前仅支持RAW或ZVHD2格式镜像文件。且要求镜像文件大小不能超过1TB。
     * 由于快速导入功能要求提前转换镜像文件格式为RAW或ZVHD2格式，因此镜像文件小于128GB时推荐您优先使用常规的创建私有镜像的方式。
     * 作为异步接口，调用成功，只是说明后台收到了制作请求，镜像是否制作成功需要通过异步任务查询接口查询该任务的执行状态，具体请参考异步任务查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportImageQuickInSafeModeRequest 请求对象
     * @return ImportImageQuickInSafeModeResponse
     */
    public ImportImageQuickInSafeModeResponse importImageQuickInSafeMode(ImportImageQuickInSafeModeRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.importImageQuickInSafeMode);
    }

    /**
     * 镜像文件快速导入（新）
     *
     * 使用上传至OBS桶中的超大外部镜像文件制作私有镜像，目前仅支持RAW或ZVHD2格式镜像文件。且要求镜像文件大小不能超过1TB。
     * 由于快速导入功能要求提前转换镜像文件格式为RAW或ZVHD2格式，因此镜像文件小于128GB时推荐您优先使用常规的创建私有镜像的方式。
     * 作为异步接口，调用成功，只是说明后台收到了制作请求，镜像是否制作成功需要通过异步任务查询接口查询该任务的执行状态，具体请参考异步任务查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportImageQuickInSafeModeRequest 请求对象
     * @return SyncInvoker<ImportImageQuickInSafeModeRequest, ImportImageQuickInSafeModeResponse>
     */
    public SyncInvoker<ImportImageQuickInSafeModeRequest, ImportImageQuickInSafeModeResponse> importImageQuickInSafeModeInvoker(
        ImportImageQuickInSafeModeRequest request) {
        return new SyncInvoker<>(request, ImsMeta.importImageQuickInSafeMode, hcClient);
    }

    /**
     * 按标签查询镜像
     *
     * 该接口用于按标签或其他条件对镜像进行过滤或者计数使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageByTagsRequest 请求对象
     * @return ListImageByTagsResponse
     */
    public ListImageByTagsResponse listImageByTags(ListImageByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.listImageByTags);
    }

    /**
     * 按标签查询镜像
     *
     * 该接口用于按标签或其他条件对镜像进行过滤或者计数使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageByTagsRequest 请求对象
     * @return SyncInvoker<ListImageByTagsRequest, ListImageByTagsResponse>
     */
    public SyncInvoker<ListImageByTagsRequest, ListImageByTagsResponse> listImageByTagsInvoker(
        ListImageByTagsRequest request) {
        return new SyncInvoker<>(request, ImsMeta.listImageByTags, hcClient);
    }

    /**
     * 获取镜像成员列表
     *
     * 该接口用于共享镜像过程中，获取接受该镜像的成员列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageMembersRequest 请求对象
     * @return ListImageMembersResponse
     */
    public ListImageMembersResponse listImageMembers(ListImageMembersRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.listImageMembers);
    }

    /**
     * 获取镜像成员列表
     *
     * 该接口用于共享镜像过程中，获取接受该镜像的成员列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageMembersRequest 请求对象
     * @return SyncInvoker<ListImageMembersRequest, ListImageMembersResponse>
     */
    public SyncInvoker<ListImageMembersRequest, ListImageMembersResponse> listImageMembersInvoker(
        ListImageMembersRequest request) {
        return new SyncInvoker<>(request, ImsMeta.listImageMembers, hcClient);
    }

    /**
     * 查询镜像标签
     *
     * 该接口用于为查询指定镜像上的所有标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageTagsRequest 请求对象
     * @return ListImageTagsResponse
     */
    public ListImageTagsResponse listImageTags(ListImageTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.listImageTags);
    }

    /**
     * 查询镜像标签
     *
     * 该接口用于为查询指定镜像上的所有标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImageTagsRequest 请求对象
     * @return SyncInvoker<ListImageTagsRequest, ListImageTagsResponse>
     */
    public SyncInvoker<ListImageTagsRequest, ListImageTagsResponse> listImageTagsInvoker(ListImageTagsRequest request) {
        return new SyncInvoker<>(request, ImsMeta.listImageTags, hcClient);
    }

    /**
     * 查询镜像列表
     *
     * 根据不同条件查询镜像列表信息。
     * 可以在URI后面用‘?’和‘&amp;’添加不同的查询条件组合，请参考请求样例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImagesRequest 请求对象
     * @return ListImagesResponse
     */
    public ListImagesResponse listImages(ListImagesRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.listImages);
    }

    /**
     * 查询镜像列表
     *
     * 根据不同条件查询镜像列表信息。
     * 可以在URI后面用‘?’和‘&amp;’添加不同的查询条件组合，请参考请求样例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImagesRequest 请求对象
     * @return SyncInvoker<ListImagesRequest, ListImagesResponse>
     */
    public SyncInvoker<ListImagesRequest, ListImagesResponse> listImagesInvoker(ListImagesRequest request) {
        return new SyncInvoker<>(request, ImsMeta.listImages, hcClient);
    }

    /**
     * 查询租户所有镜像标签
     *
     * 该接口用于为查询租户的所有镜像上的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImagesTagsRequest 请求对象
     * @return ListImagesTagsResponse
     */
    public ListImagesTagsResponse listImagesTags(ListImagesTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.listImagesTags);
    }

    /**
     * 查询租户所有镜像标签
     *
     * 该接口用于为查询租户的所有镜像上的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImagesTagsRequest 请求对象
     * @return SyncInvoker<ListImagesTagsRequest, ListImagesTagsResponse>
     */
    public SyncInvoker<ListImagesTagsRequest, ListImagesTagsResponse> listImagesTagsInvoker(
        ListImagesTagsRequest request) {
        return new SyncInvoker<>(request, ImsMeta.listImagesTags, hcClient);
    }

    /**
     * 查询镜像支持的OS列表
     *
     * 查询当前区域弹性云服务器的OS兼容性列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOsVersionsRequest 请求对象
     * @return ListOsVersionsResponse
     */
    public ListOsVersionsResponse listOsVersions(ListOsVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.listOsVersions);
    }

    /**
     * 查询镜像支持的OS列表
     *
     * 查询当前区域弹性云服务器的OS兼容性列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOsVersionsRequest 请求对象
     * @return SyncInvoker<ListOsVersionsRequest, ListOsVersionsResponse>
     */
    public SyncInvoker<ListOsVersionsRequest, ListOsVersionsResponse> listOsVersionsInvoker(
        ListOsVersionsRequest request) {
        return new SyncInvoker<>(request, ImsMeta.listOsVersions, hcClient);
    }

    /**
     * 按条件查询租户镜像标签列表
     *
     * 根据不同条件查询镜像标签列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
     * @return ListTagsResponse
     */
    public ListTagsResponse listTags(ListTagsRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.listTags);
    }

    /**
     * 按条件查询租户镜像标签列表
     *
     * 根据不同条件查询镜像标签列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
     * @return SyncInvoker<ListTagsRequest, ListTagsResponse>
     */
    public SyncInvoker<ListTagsRequest, ListTagsResponse> listTagsInvoker(ListTagsRequest request) {
        return new SyncInvoker<>(request, ImsMeta.listTags, hcClient);
    }

    /**
     * 注册镜像
     *
     * 该接口用于将镜像文件注册为云平台未初始化的私有镜像。
     * 使用该接口注册镜像的具体步骤如下：
     * 将镜像文件上传到OBS个人桶中。具体操作请参见《对象存储服务客户端指南（OBS Browser）》或《对象存储服务API参考》。
     * 使用创建镜像元数据接口创建镜像元数据。调用成功后，保存该镜像的ID。创建镜像元数据请参考创建镜像元数据（OpenStack原生）。
     * 根据2得到的镜像ID，使用注册镜像接口注册OBS桶中的镜像文件。
     * 注册镜像接口作为异步接口，调用成功后，说明后台收到了注册请求。需要根据镜像ID查询该镜像状态验证镜像注册是否成功。当镜像状态变为“active”时，表示镜像注册成功。
     * 如何查询异步任务，请参见异步任务查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterImageRequest 请求对象
     * @return RegisterImageResponse
     */
    public RegisterImageResponse registerImage(RegisterImageRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.registerImage);
    }

    /**
     * 注册镜像
     *
     * 该接口用于将镜像文件注册为云平台未初始化的私有镜像。
     * 使用该接口注册镜像的具体步骤如下：
     * 将镜像文件上传到OBS个人桶中。具体操作请参见《对象存储服务客户端指南（OBS Browser）》或《对象存储服务API参考》。
     * 使用创建镜像元数据接口创建镜像元数据。调用成功后，保存该镜像的ID。创建镜像元数据请参考创建镜像元数据（OpenStack原生）。
     * 根据2得到的镜像ID，使用注册镜像接口注册OBS桶中的镜像文件。
     * 注册镜像接口作为异步接口，调用成功后，说明后台收到了注册请求。需要根据镜像ID查询该镜像状态验证镜像注册是否成功。当镜像状态变为“active”时，表示镜像注册成功。
     * 如何查询异步任务，请参见异步任务查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterImageRequest 请求对象
     * @return SyncInvoker<RegisterImageRequest, RegisterImageResponse>
     */
    public SyncInvoker<RegisterImageRequest, RegisterImageResponse> registerImageInvoker(RegisterImageRequest request) {
        return new SyncInvoker<>(request, ImsMeta.registerImage, hcClient);
    }

    /**
     * 获取镜像成员详情
     *
     * 该接口主要用于镜像共享中查询某个镜像成员的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageMemberRequest 请求对象
     * @return ShowImageMemberResponse
     */
    public ShowImageMemberResponse showImageMember(ShowImageMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.showImageMember);
    }

    /**
     * 获取镜像成员详情
     *
     * 该接口主要用于镜像共享中查询某个镜像成员的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageMemberRequest 请求对象
     * @return SyncInvoker<ShowImageMemberRequest, ShowImageMemberResponse>
     */
    public SyncInvoker<ShowImageMemberRequest, ShowImageMemberResponse> showImageMemberInvoker(
        ShowImageMemberRequest request) {
        return new SyncInvoker<>(request, ImsMeta.showImageMember, hcClient);
    }

    /**
     * 查询镜像配额
     *
     * 该接口为扩展接口，主要用于查询租户在当前Region的私有镜像的配额数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageQuotaRequest 请求对象
     * @return ShowImageQuotaResponse
     */
    public ShowImageQuotaResponse showImageQuota(ShowImageQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.showImageQuota);
    }

    /**
     * 查询镜像配额
     *
     * 该接口为扩展接口，主要用于查询租户在当前Region的私有镜像的配额数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageQuotaRequest 请求对象
     * @return SyncInvoker<ShowImageQuotaRequest, ShowImageQuotaResponse>
     */
    public SyncInvoker<ShowImageQuotaRequest, ShowImageQuotaResponse> showImageQuotaInvoker(
        ShowImageQuotaRequest request) {
        return new SyncInvoker<>(request, ImsMeta.showImageQuota, hcClient);
    }

    /**
     * 异步任务查询
     *
     * 该接口为扩展接口，主要用于查询异步接口执行情况，比如查询导出镜像任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobRequest 请求对象
     * @return ShowJobResponse
     */
    public ShowJobResponse showJob(ShowJobRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.showJob);
    }

    /**
     * 异步任务查询
     *
     * 该接口为扩展接口，主要用于查询异步接口执行情况，比如查询导出镜像任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobRequest 请求对象
     * @return SyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public SyncInvoker<ShowJobRequest, ShowJobResponse> showJobInvoker(ShowJobRequest request) {
        return new SyncInvoker<>(request, ImsMeta.showJob, hcClient);
    }

    /**
     * 异步任务进度查询
     *
     * 该接口为扩展接口，主要用于查询异步任务进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobProgressRequest 请求对象
     * @return ShowJobProgressResponse
     */
    public ShowJobProgressResponse showJobProgress(ShowJobProgressRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.showJobProgress);
    }

    /**
     * 异步任务进度查询
     *
     * 该接口为扩展接口，主要用于查询异步任务进度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobProgressRequest 请求对象
     * @return SyncInvoker<ShowJobProgressRequest, ShowJobProgressResponse>
     */
    public SyncInvoker<ShowJobProgressRequest, ShowJobProgressResponse> showJobProgressInvoker(
        ShowJobProgressRequest request) {
        return new SyncInvoker<>(request, ImsMeta.showJobProgress, hcClient);
    }

    /**
     * 更新镜像信息
     *
     * 更新镜像信息接口，主要用于镜像属性的修改。当前仅支持可用（active）状态的镜像更新相关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateImageRequest 请求对象
     * @return UpdateImageResponse
     */
    public UpdateImageResponse updateImage(UpdateImageRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.updateImage);
    }

    /**
     * 更新镜像信息
     *
     * 更新镜像信息接口，主要用于镜像属性的修改。当前仅支持可用（active）状态的镜像更新相关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateImageRequest 请求对象
     * @return SyncInvoker<UpdateImageRequest, UpdateImageResponse>
     */
    public SyncInvoker<UpdateImageRequest, UpdateImageResponse> updateImageInvoker(UpdateImageRequest request) {
        return new SyncInvoker<>(request, ImsMeta.updateImage, hcClient);
    }

    /**
     * 查询版本列表（OpenStack原生）
     *
     * 查询API的版本信息列表，包括API的版本兼容性、域名信息等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVersionsRequest 请求对象
     * @return ListVersionsResponse
     */
    public ListVersionsResponse listVersions(ListVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.listVersions);
    }

    /**
     * 查询版本列表（OpenStack原生）
     *
     * 查询API的版本信息列表，包括API的版本兼容性、域名信息等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVersionsRequest 请求对象
     * @return SyncInvoker<ListVersionsRequest, ListVersionsResponse>
     */
    public SyncInvoker<ListVersionsRequest, ListVersionsResponse> listVersionsInvoker(ListVersionsRequest request) {
        return new SyncInvoker<>(request, ImsMeta.listVersions, hcClient);
    }

    /**
     * 查询版本列表（OpenStack原生）
     *
     * 查询API的版本信息列表，包括API的版本兼容性、域名信息等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVersionRequest 请求对象
     * @return ShowVersionResponse
     */
    public ShowVersionResponse showVersion(ShowVersionRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.showVersion);
    }

    /**
     * 查询版本列表（OpenStack原生）
     *
     * 查询API的版本信息列表，包括API的版本兼容性、域名信息等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVersionRequest 请求对象
     * @return SyncInvoker<ShowVersionRequest, ShowVersionResponse>
     */
    public SyncInvoker<ShowVersionRequest, ShowVersionResponse> showVersionInvoker(ShowVersionRequest request) {
        return new SyncInvoker<>(request, ImsMeta.showVersion, hcClient);
    }

    /**
     * 添加镜像成员（OpenStack原生）
     *
     * 用户共享镜像给其他用户时，使用该接口向该镜像成员中添加接受镜像用户的项目ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceAddImageMemberRequest 请求对象
     * @return GlanceAddImageMemberResponse
     */
    public GlanceAddImageMemberResponse glanceAddImageMember(GlanceAddImageMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceAddImageMember);
    }

    /**
     * 添加镜像成员（OpenStack原生）
     *
     * 用户共享镜像给其他用户时，使用该接口向该镜像成员中添加接受镜像用户的项目ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceAddImageMemberRequest 请求对象
     * @return SyncInvoker<GlanceAddImageMemberRequest, GlanceAddImageMemberResponse>
     */
    public SyncInvoker<GlanceAddImageMemberRequest, GlanceAddImageMemberResponse> glanceAddImageMemberInvoker(
        GlanceAddImageMemberRequest request) {
        return new SyncInvoker<>(request, ImsMeta.glanceAddImageMember, hcClient);
    }

    /**
     * 创建镜像元数据（OpenStack原生）
     *
     * 创建镜像元数据。调用创建镜像元数据接口成功后，只是创建了镜像的元数据，镜像对应的实际镜像文件并不存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceCreateImageMetadataRequest 请求对象
     * @return GlanceCreateImageMetadataResponse
     */
    public GlanceCreateImageMetadataResponse glanceCreateImageMetadata(GlanceCreateImageMetadataRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceCreateImageMetadata);
    }

    /**
     * 创建镜像元数据（OpenStack原生）
     *
     * 创建镜像元数据。调用创建镜像元数据接口成功后，只是创建了镜像的元数据，镜像对应的实际镜像文件并不存在
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceCreateImageMetadataRequest 请求对象
     * @return SyncInvoker<GlanceCreateImageMetadataRequest, GlanceCreateImageMetadataResponse>
     */
    public SyncInvoker<GlanceCreateImageMetadataRequest, GlanceCreateImageMetadataResponse> glanceCreateImageMetadataInvoker(
        GlanceCreateImageMetadataRequest request) {
        return new SyncInvoker<>(request, ImsMeta.glanceCreateImageMetadata, hcClient);
    }

    /**
     * 增加标签（OpenStack原生）
     *
     * 该接口主要用于为某个镜像添加一个自定义标签。通过自定义标签，用户可以将镜像进行分类。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceCreateTagRequest 请求对象
     * @return GlanceCreateTagResponse
     */
    public GlanceCreateTagResponse glanceCreateTag(GlanceCreateTagRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceCreateTag);
    }

    /**
     * 增加标签（OpenStack原生）
     *
     * 该接口主要用于为某个镜像添加一个自定义标签。通过自定义标签，用户可以将镜像进行分类。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceCreateTagRequest 请求对象
     * @return SyncInvoker<GlanceCreateTagRequest, GlanceCreateTagResponse>
     */
    public SyncInvoker<GlanceCreateTagRequest, GlanceCreateTagResponse> glanceCreateTagInvoker(
        GlanceCreateTagRequest request) {
        return new SyncInvoker<>(request, ImsMeta.glanceCreateTag, hcClient);
    }

    /**
     * 删除镜像（OpenStack原生）
     *
     * 该接口主要用于删除镜像，用户可以通过该接口将自己的私有镜像删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceDeleteImageRequest 请求对象
     * @return GlanceDeleteImageResponse
     */
    public GlanceDeleteImageResponse glanceDeleteImage(GlanceDeleteImageRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceDeleteImage);
    }

    /**
     * 删除镜像（OpenStack原生）
     *
     * 该接口主要用于删除镜像，用户可以通过该接口将自己的私有镜像删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceDeleteImageRequest 请求对象
     * @return SyncInvoker<GlanceDeleteImageRequest, GlanceDeleteImageResponse>
     */
    public SyncInvoker<GlanceDeleteImageRequest, GlanceDeleteImageResponse> glanceDeleteImageInvoker(
        GlanceDeleteImageRequest request) {
        return new SyncInvoker<>(request, ImsMeta.glanceDeleteImage, hcClient);
    }

    /**
     * 删除指定的镜像成员（OpenStack原生）
     *
     * 该接口用于取消对某个用户的镜像共享。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceDeleteImageMemberRequest 请求对象
     * @return GlanceDeleteImageMemberResponse
     */
    public GlanceDeleteImageMemberResponse glanceDeleteImageMember(GlanceDeleteImageMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceDeleteImageMember);
    }

    /**
     * 删除指定的镜像成员（OpenStack原生）
     *
     * 该接口用于取消对某个用户的镜像共享。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceDeleteImageMemberRequest 请求对象
     * @return SyncInvoker<GlanceDeleteImageMemberRequest, GlanceDeleteImageMemberResponse>
     */
    public SyncInvoker<GlanceDeleteImageMemberRequest, GlanceDeleteImageMemberResponse> glanceDeleteImageMemberInvoker(
        GlanceDeleteImageMemberRequest request) {
        return new SyncInvoker<>(request, ImsMeta.glanceDeleteImageMember, hcClient);
    }

    /**
     * 删除标签（OpenStack原生）
     *
     * 该接口主要用于删除某个镜像的自定义标签，通过该接口，用户可以将私有镜像中一些不用的标签删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceDeleteTagRequest 请求对象
     * @return GlanceDeleteTagResponse
     */
    public GlanceDeleteTagResponse glanceDeleteTag(GlanceDeleteTagRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceDeleteTag);
    }

    /**
     * 删除标签（OpenStack原生）
     *
     * 该接口主要用于删除某个镜像的自定义标签，通过该接口，用户可以将私有镜像中一些不用的标签删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceDeleteTagRequest 请求对象
     * @return SyncInvoker<GlanceDeleteTagRequest, GlanceDeleteTagResponse>
     */
    public SyncInvoker<GlanceDeleteTagRequest, GlanceDeleteTagResponse> glanceDeleteTagInvoker(
        GlanceDeleteTagRequest request) {
        return new SyncInvoker<>(request, ImsMeta.glanceDeleteTag, hcClient);
    }

    /**
     * 查询镜像成员列表视图（OpenStack原生）
     *
     * 该接口主要用于查询镜像成员列表视图，通过视图，用户可以了解到镜像成员包含哪些属性，同时也可以了解每个属性的数据类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceListImageMemberSchemasRequest 请求对象
     * @return GlanceListImageMemberSchemasResponse
     */
    public GlanceListImageMemberSchemasResponse glanceListImageMemberSchemas(
        GlanceListImageMemberSchemasRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceListImageMemberSchemas);
    }

    /**
     * 查询镜像成员列表视图（OpenStack原生）
     *
     * 该接口主要用于查询镜像成员列表视图，通过视图，用户可以了解到镜像成员包含哪些属性，同时也可以了解每个属性的数据类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceListImageMemberSchemasRequest 请求对象
     * @return SyncInvoker<GlanceListImageMemberSchemasRequest, GlanceListImageMemberSchemasResponse>
     */
    public SyncInvoker<GlanceListImageMemberSchemasRequest, GlanceListImageMemberSchemasResponse> glanceListImageMemberSchemasInvoker(
        GlanceListImageMemberSchemasRequest request) {
        return new SyncInvoker<>(request, ImsMeta.glanceListImageMemberSchemas, hcClient);
    }

    /**
     * 获取镜像成员列表（OpenStack原生）
     *
     * 该接口用于共享镜像过程中，获取接受该镜像的成员列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceListImageMembersRequest 请求对象
     * @return GlanceListImageMembersResponse
     */
    public GlanceListImageMembersResponse glanceListImageMembers(GlanceListImageMembersRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceListImageMembers);
    }

    /**
     * 获取镜像成员列表（OpenStack原生）
     *
     * 该接口用于共享镜像过程中，获取接受该镜像的成员列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceListImageMembersRequest 请求对象
     * @return SyncInvoker<GlanceListImageMembersRequest, GlanceListImageMembersResponse>
     */
    public SyncInvoker<GlanceListImageMembersRequest, GlanceListImageMembersResponse> glanceListImageMembersInvoker(
        GlanceListImageMembersRequest request) {
        return new SyncInvoker<>(request, ImsMeta.glanceListImageMembers, hcClient);
    }

    /**
     * 查询镜像列表视图（OpenStack原生）
     *
     * 该接口主要用于查询镜像列表视图，通过该接口用户可以了解到镜像列表的详细情况和数据结构。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceListImageSchemasRequest 请求对象
     * @return GlanceListImageSchemasResponse
     */
    public GlanceListImageSchemasResponse glanceListImageSchemas(GlanceListImageSchemasRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceListImageSchemas);
    }

    /**
     * 查询镜像列表视图（OpenStack原生）
     *
     * 该接口主要用于查询镜像列表视图，通过该接口用户可以了解到镜像列表的详细情况和数据结构。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceListImageSchemasRequest 请求对象
     * @return SyncInvoker<GlanceListImageSchemasRequest, GlanceListImageSchemasResponse>
     */
    public SyncInvoker<GlanceListImageSchemasRequest, GlanceListImageSchemasResponse> glanceListImageSchemasInvoker(
        GlanceListImageSchemasRequest request) {
        return new SyncInvoker<>(request, ImsMeta.glanceListImageSchemas, hcClient);
    }

    /**
     * 查询镜像列表（OpenStack原生）
     *
     * 获取镜像列表。
     * 使用本接口查询镜像列表时，需要使用分页查询才能返回全部的镜像列表。
     * 分页说明
     * 分页是指返回一组镜像的一个子集，在返回的时候会存在下个子集的链接和首个子集的链接，默认返回的子集中数量为25，用户也可以通过使用limit和marker两个参数自己分页，指定返回子集中需要返回的数量。
     * 响应中的参数first是查询首页的URL。next是查询下一页的URL。当查询镜像列表最后一页时，不存在next。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceListImagesRequest 请求对象
     * @return GlanceListImagesResponse
     */
    public GlanceListImagesResponse glanceListImages(GlanceListImagesRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceListImages);
    }

    /**
     * 查询镜像列表（OpenStack原生）
     *
     * 获取镜像列表。
     * 使用本接口查询镜像列表时，需要使用分页查询才能返回全部的镜像列表。
     * 分页说明
     * 分页是指返回一组镜像的一个子集，在返回的时候会存在下个子集的链接和首个子集的链接，默认返回的子集中数量为25，用户也可以通过使用limit和marker两个参数自己分页，指定返回子集中需要返回的数量。
     * 响应中的参数first是查询首页的URL。next是查询下一页的URL。当查询镜像列表最后一页时，不存在next。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceListImagesRequest 请求对象
     * @return SyncInvoker<GlanceListImagesRequest, GlanceListImagesResponse>
     */
    public SyncInvoker<GlanceListImagesRequest, GlanceListImagesResponse> glanceListImagesInvoker(
        GlanceListImagesRequest request) {
        return new SyncInvoker<>(request, ImsMeta.glanceListImages, hcClient);
    }

    /**
     * 查询镜像详情（OpenStack原生）
     *
     * 查询单个镜像详情，用户可以通过该接口查询单个私有或者公共镜像的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceShowImageRequest 请求对象
     * @return GlanceShowImageResponse
     */
    public GlanceShowImageResponse glanceShowImage(GlanceShowImageRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceShowImage);
    }

    /**
     * 查询镜像详情（OpenStack原生）
     *
     * 查询单个镜像详情，用户可以通过该接口查询单个私有或者公共镜像的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceShowImageRequest 请求对象
     * @return SyncInvoker<GlanceShowImageRequest, GlanceShowImageResponse>
     */
    public SyncInvoker<GlanceShowImageRequest, GlanceShowImageResponse> glanceShowImageInvoker(
        GlanceShowImageRequest request) {
        return new SyncInvoker<>(request, ImsMeta.glanceShowImage, hcClient);
    }

    /**
     * 获取镜像成员详情（OpenStack原生）
     *
     * 该接口主要用于镜像共享中查询某个镜像成员的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceShowImageMemberRequest 请求对象
     * @return GlanceShowImageMemberResponse
     */
    public GlanceShowImageMemberResponse glanceShowImageMember(GlanceShowImageMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceShowImageMember);
    }

    /**
     * 获取镜像成员详情（OpenStack原生）
     *
     * 该接口主要用于镜像共享中查询某个镜像成员的详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceShowImageMemberRequest 请求对象
     * @return SyncInvoker<GlanceShowImageMemberRequest, GlanceShowImageMemberResponse>
     */
    public SyncInvoker<GlanceShowImageMemberRequest, GlanceShowImageMemberResponse> glanceShowImageMemberInvoker(
        GlanceShowImageMemberRequest request) {
        return new SyncInvoker<>(request, ImsMeta.glanceShowImageMember, hcClient);
    }

    /**
     * 查询镜像成员视图（OpenStack原生）
     *
     * 该接口主要用于查询镜像成员视图，通过视图，用户可以了解到镜像成员包含哪些属性，同时也可以了解每个属性的数据类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceShowImageMemberSchemasRequest 请求对象
     * @return GlanceShowImageMemberSchemasResponse
     */
    public GlanceShowImageMemberSchemasResponse glanceShowImageMemberSchemas(
        GlanceShowImageMemberSchemasRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceShowImageMemberSchemas);
    }

    /**
     * 查询镜像成员视图（OpenStack原生）
     *
     * 该接口主要用于查询镜像成员视图，通过视图，用户可以了解到镜像成员包含哪些属性，同时也可以了解每个属性的数据类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceShowImageMemberSchemasRequest 请求对象
     * @return SyncInvoker<GlanceShowImageMemberSchemasRequest, GlanceShowImageMemberSchemasResponse>
     */
    public SyncInvoker<GlanceShowImageMemberSchemasRequest, GlanceShowImageMemberSchemasResponse> glanceShowImageMemberSchemasInvoker(
        GlanceShowImageMemberSchemasRequest request) {
        return new SyncInvoker<>(request, ImsMeta.glanceShowImageMemberSchemas, hcClient);
    }

    /**
     * 查询镜像视图（OpenStack原生）
     *
     * 该接口主要用于查询镜像视图，通过视图，用户可以了解到镜像包含哪些属性，同时也可以了解每个属性的数据类型等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceShowImageSchemasRequest 请求对象
     * @return GlanceShowImageSchemasResponse
     */
    public GlanceShowImageSchemasResponse glanceShowImageSchemas(GlanceShowImageSchemasRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceShowImageSchemas);
    }

    /**
     * 查询镜像视图（OpenStack原生）
     *
     * 该接口主要用于查询镜像视图，通过视图，用户可以了解到镜像包含哪些属性，同时也可以了解每个属性的数据类型等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceShowImageSchemasRequest 请求对象
     * @return SyncInvoker<GlanceShowImageSchemasRequest, GlanceShowImageSchemasResponse>
     */
    public SyncInvoker<GlanceShowImageSchemasRequest, GlanceShowImageSchemasResponse> glanceShowImageSchemasInvoker(
        GlanceShowImageSchemasRequest request) {
        return new SyncInvoker<>(request, ImsMeta.glanceShowImageSchemas, hcClient);
    }

    /**
     * 更新镜像信息（OpenStack原生）
     *
     * 修改镜像信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceUpdateImageRequest 请求对象
     * @return GlanceUpdateImageResponse
     */
    public GlanceUpdateImageResponse glanceUpdateImage(GlanceUpdateImageRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceUpdateImage);
    }

    /**
     * 更新镜像信息（OpenStack原生）
     *
     * 修改镜像信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceUpdateImageRequest 请求对象
     * @return SyncInvoker<GlanceUpdateImageRequest, GlanceUpdateImageResponse>
     */
    public SyncInvoker<GlanceUpdateImageRequest, GlanceUpdateImageResponse> glanceUpdateImageInvoker(
        GlanceUpdateImageRequest request) {
        return new SyncInvoker<>(request, ImsMeta.glanceUpdateImage, hcClient);
    }

    /**
     * 更新镜像成员状态（OpenStack原生）
     *
     * 用户接受或者拒绝共享镜像时，使用该接口更新镜像成员的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceUpdateImageMemberRequest 请求对象
     * @return GlanceUpdateImageMemberResponse
     */
    public GlanceUpdateImageMemberResponse glanceUpdateImageMember(GlanceUpdateImageMemberRequest request) {
        return hcClient.syncInvokeHttp(request, ImsMeta.glanceUpdateImageMember);
    }

    /**
     * 更新镜像成员状态（OpenStack原生）
     *
     * 用户接受或者拒绝共享镜像时，使用该接口更新镜像成员的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GlanceUpdateImageMemberRequest 请求对象
     * @return SyncInvoker<GlanceUpdateImageMemberRequest, GlanceUpdateImageMemberResponse>
     */
    public SyncInvoker<GlanceUpdateImageMemberRequest, GlanceUpdateImageMemberResponse> glanceUpdateImageMemberInvoker(
        GlanceUpdateImageMemberRequest request) {
        return new SyncInvoker<>(request, ImsMeta.glanceUpdateImageMember, hcClient);
    }

}
